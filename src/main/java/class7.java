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

@OriginalClass("client!b")
public class class7 extends class16 implements Receiver {

    @OriginalMember(owner = "client!b", name = "J", descriptor = "Z")
    private static volatile boolean field158 = false;

    @OriginalMember(owner = "client!b", name = "L", descriptor = "Ljavax/sound/midi/Sequencer;")
    private static Sequencer field160 = null;

    @OriginalMember(owner = "client!b", name = "K", descriptor = "Ljavax/sound/midi/Receiver;")
    private static Receiver field159 = null;

    @OriginalMember(owner = "client!b", name = "close", descriptor = "()V", line = 10)
    public final void close() {
    }

    @OriginalMember(owner = "client!b", name = "send", descriptor = "(Ljavax/sound/midi/MidiMessage;J)V", line = 12)
    public final synchronized void send(MidiMessage arg0, long arg1) {
        if (field158) {
            byte[] var4 = arg0.getMessage();
            if (!this.method107(var4[0] & 0xFF, var4[1] & 0xFF, var4.length >= 3 ? var4[2] & 0xFF : 0, arg1)) {
                field159.send(arg0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V", line = 22)
    public class7() {
        try {
            field159 = MidiSystem.getReceiver();
            field160 = MidiSystem.getSequencer(false);
            field160.getTransmitter().setReceiver(this);
            field160.open();
            this.method110(-1L, -94);
        } catch (Exception var2) {
            class97.method767(82);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IBI)V", line = 42)
    public final synchronized void method45(int arg0, byte arg1, int arg2) {
        int var4 = 16 % ((arg1 + 28) / 57);
        if (field160 != null) {
            this.method106(-1L, arg2, (byte) 109, arg0);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZBI[B)V", line = 54)
    public final void method46(boolean arg0, byte arg1, int arg2, byte[] arg3) {
        if (field160 == null) {
            return;
        }
        try {
            Sequence var5 = MidiSystem.getSequence(new ByteArrayInputStream(arg3));
            field160.setSequence(var5);
            field160.setLoopCount(arg0 ? -1 : 0);
            if (arg1 != -72) {
                field160 = null;
            }
            this.method106(-1L, arg2, (byte) 112, 0);
            field158 = true;
            field160.start();
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(I)V", line = 82)
    public final void method47(int arg0) {
        if (arg0 < 44) {
            this.method47(-110);
        }
        if (field160 != null) {
            field158 = false;
            field160.stop();
            this.method110(-1L, -119);
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V", line = 102)
    public final void method48(int arg0) {
        if (arg0 != -17036) {
            this.method48(-74);
        }
        if (field160 != null) {
            field160.close();
            field160 = null;
        }
        if (field159 != null) {
            field159.close();
            field159 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZI)V", line = 124)
    public final void method49(boolean arg0, int arg1) {
        if (field160 != null) {
            if (arg0) {
                field160 = null;
            }
            this.method108(-1L, arg1, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIJ)V", line = 142)
    public final void method50(int arg0, int arg1, int arg2, long arg3) {
        try {
            ShortMessage var6 = new ShortMessage();
            var6.setMessage(arg0, arg1, arg2);
            field159.send(var6, arg3);
        } catch (InvalidMidiDataException var8) {
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V", line = 155)
    public final void method51(int arg0) {
        if (arg0 < 55) {
            this.method50(11, -121, -102, 126L);
        }
    }
}
