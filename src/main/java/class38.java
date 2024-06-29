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

@OriginalClass("client!ga")
public class class38 extends class124 implements Receiver {

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "Ljavax/sound/midi/Sequencer;")
    private static Sequencer field858 = null;

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "Ljavax/sound/midi/Receiver;")
    private static Receiver field857 = null;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
    public final void method171(byte arg0) {
        if (arg0 != 55) {
            this.method170(-14, 65, 121);
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
    public class38() {
        try {
            field857 = MidiSystem.getReceiver();
            field858 = MidiSystem.getSequencer(false);
            field858.getTransmitter().setReceiver(this);
            field858.open();
            this.method957(-1L, (byte) 92);
        } catch (Exception var2) {
            class86.method643(-31914);
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
    public final void method177(int arg0) {
        if (field858 != null) {
            field858.close();
            field858 = null;
        }
        if (arg0 == 82 && field857 != null) {
            field857.close();
            field857 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(B)V")
    public final void method174(byte arg0) {
        if (field858 != null) {
            this.method956(-1L, true);
            if (arg0 != -50) {
                field858 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIJ)V")
    public final void method295(int arg0, int arg1, int arg2, long arg3) {
        try {
            ShortMessage var6 = new ShortMessage();
            var6.setMessage(arg0, arg1, arg2);
            field857.send(var6, arg3);
        } catch (InvalidMidiDataException var8) {
        }
    }

    @OriginalMember(owner = "client!ga", name = "send", descriptor = "(Ljavax/sound/midi/MidiMessage;J)V")
    public final synchronized void send(MidiMessage arg0, long arg1) {
        byte[] var4 = arg0.getMessage();
        if (var4.length < 3 || !this.method961(var4[0], var4[1], var4[2], arg1)) {
            field857.send(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)V")
    public final void method178(byte arg0) {
        if (arg0 != 81) {
            field858 = null;
        }
        if (field858 != null) {
            field858.stop();
            this.method957(-1L, (byte) 109);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)V")
    public final synchronized void method170(int arg0, int arg1, int arg2) {
        if (field858 != null) {
            this.method960(arg2, -1L, 0, arg1);
            if (arg0 != 332) {
                field857 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZ[BZ)V")
    public final void method180(int arg0, boolean arg1, byte[] arg2, boolean arg3) {
        if (field858 == null) {
            return;
        }
        try {
            if (arg1) {
                this.method171((byte) 76);
            }
            Sequence var5 = MidiSystem.getSequence(new ByteArrayInputStream(arg2));
            field858.setSequence(var5);
            field858.setLoopCount(arg3 ? -1 : 0);
            this.method960(arg0, -1L, 0, 0);
            field858.start();
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!ga", name = "close", descriptor = "()V")
    public final void close() {
    }
}
