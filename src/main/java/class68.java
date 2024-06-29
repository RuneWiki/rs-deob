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

@OriginalClass("client!lc")
public class class68 extends class90 implements Receiver {

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "Ljavax/sound/midi/Receiver;")
    private static Receiver field1658 = null;

    @OriginalMember(owner = "client!lc", name = "Q", descriptor = "Z")
    private static volatile boolean field1659 = false;

    @OriginalMember(owner = "client!lc", name = "R", descriptor = "Ljavax/sound/midi/Sequencer;")
    private static Sequencer field1660 = null;

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V", line = 9)
    public class68() {
        try {
            field1658 = MidiSystem.getReceiver();
            field1660 = MidiSystem.getSequencer(false);
            field1660.getTransmitter().setReceiver(this);
            field1660.open();
            this.method598(-1L, (byte) 91);
        } catch (Exception var2) {
            class31.method205((byte) 119);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIJ)V", line = 33)
    public final void method454(int arg0, int arg1, int arg2, long arg3) {
        try {
            ShortMessage var6 = new ShortMessage();
            var6.setMessage(arg0, arg1, arg2);
            field1658.send(var6, arg3);
        } catch (InvalidMidiDataException var8) {
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V", line = 43)
    public final void method80(byte arg0) {
        if (field1660 != null) {
            int var2 = 79 / ((33 - arg0) / 44);
            field1659 = false;
            field1660.stop();
            this.method598(-1L, (byte) 91);
        }
    }

    @OriginalMember(owner = "client!lc", name = "send", descriptor = "(Ljavax/sound/midi/MidiMessage;J)V", line = 56)
    public final synchronized void send(MidiMessage arg0, long arg1) {
        if (field1659) {
            byte[] var4 = arg0.getMessage();
            if (!this.method599(var4[0] & 0xFF, var4[1], var4.length >= 3 ? var4[2] : 0, arg1)) {
                field1658.send(arg0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)V", line = 69)
    public final synchronized void method75(int arg0, int arg1, int arg2) {
        if (field1660 != null) {
            if (arg1 != -25) {
                this.method75(-107, 101, -85);
            }
            this.method596(-1L, 125, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(BI)V", line = 85)
    public final void method76(byte arg0, int arg1) {
        if (field1660 != null && arg0 == -86) {
            this.method601(0, -1L, arg1);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[BZI)V", line = 101)
    public final void method77(int arg0, byte[] arg1, boolean arg2, int arg3) {
        if (field1660 == null) {
            return;
        }
        try {
            Sequence var5 = MidiSystem.getSequence(new ByteArrayInputStream(arg1));
            field1660.setSequence(var5);
            if (arg3 != -28) {
                field1658 = null;
            }
            field1660.setLoopCount(arg2 ? -1 : 0);
            this.method596(-1L, 73, arg0, 0);
            field1659 = true;
            field1660.start();
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)V", line = 126)
    public final void method79(byte arg0) {
        if (field1660 != null) {
            field1660.close();
            field1660 = null;
        }
        if (field1658 != null) {
            field1658.close();
            field1658 = null;
        }
        int var2 = -98 % ((arg0 + 75) / 51);
    }

    @OriginalMember(owner = "client!lc", name = "close", descriptor = "()V", line = 150)
    public final void close() {
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)V", line = 153)
    public final void method74(byte arg0) {
        if (arg0 < 48) {
            field1658 = null;
        }
    }
}
