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

@OriginalClass("client!cb")
public class class17 extends class47 implements Receiver {

    @OriginalMember(owner = "client!cb", name = "J", descriptor = "Ljavax/sound/midi/Sequencer;")
    private static Sequencer field376 = null;

    @OriginalMember(owner = "client!cb", name = "K", descriptor = "Ljavax/sound/midi/Receiver;")
    private static Receiver field377 = null;

    @OriginalMember(owner = "client!cb", name = "L", descriptor = "Z")
    private static volatile boolean field378 = false;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZI)V")
    public final void method154(boolean arg0, int arg1) {
        if (field376 != null) {
            this.method337(-1L, (byte) -74, arg1);
            if (arg0) {
                field376 = null;
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "send", descriptor = "(Ljavax/sound/midi/MidiMessage;J)V")
    public final synchronized void send(MidiMessage arg0, long arg1) {
        if (field378) {
            byte[] var4 = arg0.getMessage();
            if (!this.method341(var4[0] & 0xFF, var4[1], var4.length >= 3 ? var4[2] : 0, arg1)) {
                field377.send(arg0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(IIIJ)V")
    public final void method155(int arg0, int arg1, int arg2, long arg3) {
        try {
            ShortMessage var6 = new ShortMessage();
            var6.setMessage(arg0, arg1, arg2);
            field377.send(var6, arg3);
        } catch (InvalidMidiDataException var8) {
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
    public class17() {
        try {
            field377 = MidiSystem.getReceiver();
            field376 = MidiSystem.getSequencer(false);
            field376.getTransmitter().setReceiver(this);
            field376.open();
            this.method339(true, -1L);
        } catch (Exception var2) {
            class30.method232((byte) -107);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)V")
    public final synchronized void method156(int arg0, int arg1, int arg2) {
        int var4 = 103 / ((-arg0 - 49) / 53);
        if (field376 != null) {
            this.method340(arg1, arg2, -1L, 39);
        }
    }

    @OriginalMember(owner = "client!cb", name = "close", descriptor = "()V")
    public final void close() {
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
    public final void method157(byte arg0) {
        if (field376 != null) {
            field376.close();
            field376 = null;
        }
        if (arg0 >= -107) {
            field378 = true;
        }
        if (field377 != null) {
            field377.close();
            field377 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
    public final void method158(byte arg0) {
        if (field376 == null) {
            return;
        }
        field378 = false;
        field376.stop();
        if (arg0 == 116) {
            this.method339(true, -1L);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZI[B)V")
    public final void method159(int arg0, boolean arg1, int arg2, byte[] arg3) {
        if (arg0 != 17) {
            field377 = null;
        }
        if (field376 == null) {
            return;
        }
        try {
            Sequence var5 = MidiSystem.getSequence(new ByteArrayInputStream(arg3));
            field376.setSequence(var5);
            field376.setLoopCount(arg1 ? -1 : 0);
            this.method340(arg2, 0, -1L, 39);
            field378 = true;
            field376.start();
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public final void method160(int arg0) {
        if (arg0 != 31) {
            field376 = null;
        }
    }
}
