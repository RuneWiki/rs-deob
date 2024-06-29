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

@OriginalClass("client!qe")
public class class101 extends class6 implements Receiver {

    @OriginalMember(owner = "client!qe", name = "fb", descriptor = "Z")
    private static volatile boolean field2297 = false;

    @OriginalMember(owner = "client!qe", name = "db", descriptor = "Ljavax/sound/midi/Receiver;")
    private static Receiver field2295 = null;

    @OriginalMember(owner = "client!qe", name = "eb", descriptor = "Ljavax/sound/midi/Sequencer;")
    private static Sequencer field2296 = null;

    @OriginalMember(owner = "client!qe", name = "send", descriptor = "(Ljavax/sound/midi/MidiMessage;J)V", line = 10)
    public final synchronized void send(MidiMessage arg0, long arg1) {
        if (field2297) {
            byte[] var4 = arg0.getMessage();
            if (!this.method55(var4[0] & 0xFF, var4[1], var4.length >= 3 ? var4[2] : 0, arg1)) {
                field2295.send(arg0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([BZII)V", line = 22)
    public final void method733(byte[] arg0, boolean arg1, int arg2, int arg3) {
        if (field2296 == null) {
            return;
        }
        try {
            Sequence var5 = MidiSystem.getSequence(new ByteArrayInputStream(arg0));
            field2296.setSequence(var5);
            field2296.setLoopCount(arg1 ? -1 : 0);
            this.method50(0, true, -1L, arg2);
            field2297 = true;
            field2296.start();
            int var6 = 28 % ((-arg3 - 24) / 50);
        } catch (Exception var8) {
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V", line = 51)
    public final void method738(byte arg0) {
        if (field2296 != null && arg0 > 90) {
            field2297 = false;
            field2296.stop();
            this.method52(-120, -1L);
        }
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V", line = 66)
    public final void method731(int arg0) {
        if (arg0 > -122) {
            this.method731(64);
        }
        if (field2296 != null) {
            field2296.close();
            field2296 = null;
        }
        if (field2295 != null) {
            field2295.close();
            field2295 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZI)V", line = 88)
    public final synchronized void method734(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field2296 = null;
        }
        if (field2296 != null) {
            this.method50(arg2, true, -1L, arg0);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZ)V", line = 101)
    public final void method735(int arg0, boolean arg1) {
        if (field2296 != null) {
            this.method58(arg0, (byte) -114, -1L);
            if (arg1) {
                this.send(null, -22L);
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V", line = 112)
    public class101() {
        try {
            field2295 = MidiSystem.getReceiver();
            field2296 = MidiSystem.getSequencer(false);
            field2296.getTransmitter().setReceiver(this);
            field2296.open();
            this.method52(107, -1L);
        } catch (Exception var2) {
            class37.method341(true);
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(IIIJ)V", line = 132)
    public final void method57(int arg0, int arg1, int arg2, long arg3) {
        try {
            ShortMessage var6 = new ShortMessage();
            var6.setMessage(arg0, arg1, arg2);
            field2295.send(var6, arg3);
        } catch (InvalidMidiDataException var8) {
        }
    }

    @OriginalMember(owner = "client!qe", name = "close", descriptor = "()V", line = 142)
    public final void close() {
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V", line = 145)
    public final void method732(boolean arg0) {
        if (arg0) {
            this.send(null, -102L);
        }
    }
}
