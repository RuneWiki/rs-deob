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

@OriginalClass("client!cd")
public class class17 extends class52 implements Receiver {

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "Ljavax/sound/midi/Receiver;")
    private static Receiver field354 = null;

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "Ljavax/sound/midi/Sequencer;")
    private static Sequencer field355 = null;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[BIZ)V", line = 11)
    public final void method139(int arg0, byte[] arg1, int arg2, boolean arg3) {
        if (field355 == null) {
            return;
        }
        try {
            Sequence var5 = MidiSystem.getSequence(new ByteArrayInputStream(arg1));
            field355.setSequence(var5);
            if (arg2 != 0) {
                field354 = null;
            }
            field355.setLoopCount(arg3 ? -1 : 0);
            this.method366(0, (byte) 106, arg0, -1L);
            field355.start();
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V", line = 34)
    public final void method140(boolean arg0) {
        if (field355 == null) {
            return;
        }
        field355.stop();
        this.method368(-1L, 127);
        if (!arg0) {
            field355 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "send", descriptor = "(Ljavax/sound/midi/MidiMessage;J)V", line = 49)
    public final synchronized void send(MidiMessage arg0, long arg1) {
        byte[] var4 = arg0.getMessage();
        if (var4.length < 3 || !this.method367(var4[0], var4[1], var4[2], arg1)) {
            field354.send(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V", line = 55)
    public class17() {
        try {
            field354 = MidiSystem.getReceiver();
            field355 = MidiSystem.getSequencer(false);
            field355.getTransmitter().setReceiver(this);
            field355.open();
            this.method368(-1L, 127);
        } catch (Exception var2) {
            class108.method803((byte) 127);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 74)
    public final void method141(int arg0) {
        if (arg0 != 699) {
            return;
        }
        if (field355 != null) {
            field355.close();
            field355 = null;
        }
        if (field354 != null) {
            field354.close();
            field354 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "close", descriptor = "()V", line = 96)
    public final void close() {
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IB)V", line = 99)
    public final void method142(int arg0, byte arg1) {
        if (field355 != null) {
            this.method370(arg0, -1L, (byte) 20);
            if (arg1 != 50) {
                field354 = null;
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIB)V", line = 112)
    public final synchronized void method143(int arg0, int arg1, byte arg2) {
        if (field355 != null) {
            int var4 = -18 % ((arg2 + 20) / 50);
            this.method366(arg1, (byte) 97, arg0, -1L);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIJ)V", line = 127)
    public final void method144(int arg0, int arg1, int arg2, long arg3) {
        try {
            ShortMessage var6 = new ShortMessage();
            var6.setMessage(arg0, arg1, arg2);
            field354.send(var6, arg3);
        } catch (InvalidMidiDataException var8) {
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V", line = 142)
    public final void method145(int arg0) {
        if (arg0 > -90) {
            this.method140(false);
        }
    }
}
