import java.io.ByteArrayInputStream;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiMessage;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Receiver;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class44 extends class35 implements Receiver {

    @OriginalMember(owner = "client!ha", name = "O", descriptor = "Ljavax/sound/midi/Receiver;")
    private static Receiver field1006 = null;

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "Ljavax/sound/midi/Sequencer;")
    private static Sequencer field1004 = null;

    @OriginalMember(owner = "client!ha", name = "N", descriptor = "Z")
    private static volatile boolean field1005 = false;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)V", line = 11)
    public final synchronized void method360(int arg0, int arg1, int arg2) {
        if (field1004 != null) {
            if (arg2 != 0) {
                this.method362(58);
            }
            this.method318((byte) -9, arg0, -1L, arg1);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[BBZ)V", line = 27)
    public final void method361(int arg0, byte[] arg1, byte arg2, boolean arg3) {
        if (field1004 == null) {
            return;
        }
        try {
            Sequence var5 = MidiSystem.getSequence(new ByteArrayInputStream(arg1));
            field1004.setSequence(var5);
            if (arg2 <= 73) {
                this.method364(-47);
            }
            field1004.setLoopCount(arg3 ? -1 : 0);
            this.method318((byte) -9, 0, -1L, arg0);
            field1005 = true;
            field1004.start();
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V", line = 52)
    public final void method362(int arg0) {
        if (field1004 != null) {
            field1004.close();
            field1004 = null;
        }
        if (field1006 != null) {
            field1006.close();
            field1006 = null;
        }
        if (arg0 <= 100) {
            field1006 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "send", descriptor = "(Ljavax/sound/midi/MidiMessage;J)V", line = 73)
    public final synchronized void send(MidiMessage arg0, long arg1) {
        if (field1005) {
            byte[] var4 = arg0.getMessage();
            if (!this.method310(var4[0] & 0xFF, var4[1], var4.length >= 3 ? var4[2] : 0, arg1)) {
                field1006.send(arg0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IB)V", line = 85)
    public final void method363(int arg0, byte arg1) {
        if (field1004 != null) {
            this.method311(-1L, true, arg0);
            if (arg1 <= 44) {
                this.method362(69);
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V", line = 100)
    public final void method364(int arg0) {
        if (arg0 != 0) {
            this.close();
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIJ)V", line = 116)
    public final void method315(int arg0, int arg1, int arg2, long arg3) {
        try {
            ShortMessage var6 = new ShortMessage();
            var6.setMessage(arg0, arg1, arg2);
            field1006.send(var6, arg3);
        } catch (InvalidMidiDataException var8) {
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V", line = 124)
    public class44() {
        try {
            field1006 = MidiSystem.getReceiver();
            field1004 = MidiSystem.getSequencer(false);
            field1004.getTransmitter().setReceiver(this);
            field1004.open();
            this.method312(-1L, 0);
        } catch (Exception var2) {
            class105.method883(-30574);
        }
    }

    @OriginalMember(owner = "client!ha", name = "close", descriptor = "()V", line = 142)
    public final void close() {
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V", line = 145)
    public final void method365(boolean arg0) {
        if (field1004 != null) {
            field1005 = arg0;
            field1004.stop();
            this.method312(-1L, 0);
        }
    }
}
