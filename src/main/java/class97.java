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

@OriginalClass("client!qa")
public class class97 extends class61 implements Receiver {

    @OriginalMember(owner = "client!qa", name = "R", descriptor = "Ljavax/sound/midi/Sequencer;")
    private static Sequencer field2450 = null;

    @OriginalMember(owner = "client!qa", name = "S", descriptor = "Ljavax/sound/midi/Receiver;")
    private static Receiver field2451 = null;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)V", line = 11)
    public final synchronized void method754(int arg0, int arg1, int arg2) {
        if (arg2 != -6427) {
            this.method472(-121, -44, -127, -82L);
        }
        if (field2450 != null) {
            this.method463(arg1, -1L, 245, arg0);
        }
    }

    @OriginalMember(owner = "client!qa", name = "close", descriptor = "()V", line = 24)
    public final void close() {
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)V", line = 28)
    public final void method755(int arg0, int arg1) {
        if (arg1 <= -53 && field2450 != null) {
            this.method466(arg0, 0, -1L);
        }
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V", line = 40)
    public class97() {
        try {
            field2451 = MidiSystem.getReceiver();
            field2450 = MidiSystem.getSequencer(false);
            field2450.getTransmitter().setReceiver(this);
            field2450.open();
            this.method467(-1L, (byte) 86);
        } catch (Exception var2) {
            class103.method782((byte) -103);
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V", line = 59)
    public final void method756(int arg0) {
        if (arg0 < 69) {
            field2451 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "send", descriptor = "(Ljavax/sound/midi/MidiMessage;J)V", line = 68)
    public final synchronized void send(MidiMessage arg0, long arg1) {
        byte[] var4 = arg0.getMessage();
        if (var4.length < 3 || !this.method468(var4[0], var4[1], var4[2], arg1)) {
            field2451.send(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIJ)V", line = 77)
    public final void method472(int arg0, int arg1, int arg2, long arg3) {
        try {
            ShortMessage var6 = new ShortMessage();
            var6.setMessage(arg0, arg1, arg2);
            field2451.send(var6, arg3);
        } catch (InvalidMidiDataException var8) {
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZI[BI)V", line = 88)
    public final void method757(boolean arg0, int arg1, byte[] arg2, int arg3) {
        if (field2450 == null) {
            return;
        }
        try {
            Sequence var5 = MidiSystem.getSequence(new ByteArrayInputStream(arg2));
            int var6 = 83 % ((arg3 - 37) / 61);
            field2450.setSequence(var5);
            field2450.setLoopCount(arg0 ? -1 : 0);
            this.method463(0, -1L, 245, arg1);
            field2450.start();
        } catch (Exception var8) {
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V", line = 111)
    public final void method758(int arg0) {
        if (field2450 != null) {
            field2450.close();
            field2450 = null;
        }
        if (field2451 != null) {
            field2451.close();
            field2451 = null;
        }
        if (arg0 >= -44) {
            field2451 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V", line = 137)
    public final void method759(byte arg0) {
        if (arg0 >= -11) {
            this.method755(125, 12);
        }
        if (field2450 != null) {
            field2450.stop();
            this.method467(-1L, (byte) 86);
        }
    }
}
