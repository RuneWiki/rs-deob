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

@OriginalClass("client!sc")
public class class111 extends class80 implements Receiver {

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "Ljavax/sound/midi/Receiver;")
    private static Receiver field2782 = null;

    @OriginalMember(owner = "client!sc", name = "I", descriptor = "Z")
    private static volatile boolean field2781 = false;

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "Ljavax/sound/midi/Sequencer;")
    private static Sequencer field2783 = null;

    @OriginalMember(owner = "client!sc", name = "close", descriptor = "()V", line = 10)
    public final void close() {
    }

    @OriginalMember(owner = "client!sc", name = "send", descriptor = "(Ljavax/sound/midi/MidiMessage;J)V", line = 12)
    public final synchronized void send(MidiMessage arg0, long arg1) {
        if (field2781) {
            byte[] var4 = arg0.getMessage();
            if (!this.method619(var4[0] & 0xFF, var4[1], var4.length >= 3 ? var4[2] : 0, arg1)) {
                field2782.send(arg0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V", line = 24)
    public final void method288(int arg0) {
        if (arg0 != 1) {
            this.method284(-105);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V", line = 33)
    public final void method291(int arg0, int arg1) {
        if (arg1 != 2) {
            field2782 = null;
        }
        if (field2783 != null) {
            this.method621(-1L, arg0, true);
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V", line = 45)
    public class111() {
        try {
            field2782 = MidiSystem.getReceiver();
            field2783 = MidiSystem.getSequencer(false);
            field2783.getTransmitter().setReceiver(this);
            field2783.open();
            this.method620(-1L, -21112);
        } catch (Exception var2) {
            class42.method356((byte) -31);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([BIBZ)V", line = 65)
    public final void method290(byte[] arg0, int arg1, byte arg2, boolean arg3) {
        if (field2783 == null) {
            return;
        }
        try {
            Sequence var5 = MidiSystem.getSequence(new ByteArrayInputStream(arg0));
            field2783.setSequence(var5);
            if (arg2 < 15) {
                return;
            }
            field2783.setLoopCount(arg3 ? -1 : 0);
            this.method627(arg1, -91, 0, -1L);
            field2781 = true;
            field2783.start();
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V", line = 89)
    public final void method284(int arg0) {
        if (field2783 == null) {
            return;
        }
        field2781 = false;
        field2783.stop();
        this.method620(-1L, -21112);
        if (arg0 != -28200) {
            field2782 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V", line = 104)
    public final void method282(byte arg0) {
        if (field2783 != null) {
            field2783.close();
            field2783 = null;
        }
        int var2 = -41 % ((arg0 + 43) / 35);
        if (field2782 != null) {
            field2782.close();
            field2782 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(IIIJ)V", line = 130)
    public final void method286(int arg0, int arg1, int arg2, long arg3) {
        try {
            ShortMessage var6 = new ShortMessage();
            var6.setMessage(arg0, arg1, arg2);
            field2782.send(var6, arg3);
        } catch (InvalidMidiDataException var8) {
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBI)V", line = 140)
    public final synchronized void method283(int arg0, byte arg1, int arg2) {
        if (arg1 <= -78 && field2783 != null) {
            this.method627(arg0, -116, arg2, -1L);
        }
    }
}
