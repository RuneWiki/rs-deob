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

@OriginalClass("client!sb")
public class class109 extends class92 implements Receiver {

    @OriginalMember(owner = "client!sb", name = "X", descriptor = "Ljavax/sound/midi/Receiver;")
    private static Receiver field2692 = null;

    @OriginalMember(owner = "client!sb", name = "Z", descriptor = "Ljavax/sound/midi/Sequencer;")
    private static Sequencer field2694 = null;

    @OriginalMember(owner = "client!sb", name = "Y", descriptor = "Z")
    private static volatile boolean field2693 = false;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)V", line = 14)
    public final void method383(byte arg0) {
        if (arg0 >= -20) {
            this.method388(127, (byte) -73, -26);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IBI)V", line = 23)
    public final synchronized void method388(int arg0, byte arg1, int arg2) {
        if (field2694 != null) {
            this.method678(arg2, arg0, -1L, -17);
            if (arg1 > -15) {
                field2693 = false;
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "send", descriptor = "(Ljavax/sound/midi/MidiMessage;J)V", line = 36)
    public final synchronized void send(MidiMessage arg0, long arg1) {
        if (field2693) {
            byte[] var4 = arg0.getMessage();
            if (!this.method683(var4[0] & 0xFF, var4[1], var4.length >= 3 ? var4[2] : 0, arg1)) {
                field2692.send(arg0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 48)
    public final void method386(int arg0) {
        if (field2694 != null) {
            field2694.close();
            field2694 = null;
        }
        if (field2692 != null) {
            field2692.close();
            field2692 = null;
        }
        if (arg0 != -8594) {
            field2692 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZI[BI)V", line = 69)
    public final void method385(boolean arg0, int arg1, byte[] arg2, int arg3) {
        if (field2694 == null || arg1 != -1) {
            return;
        }
        try {
            Sequence var5 = MidiSystem.getSequence(new ByteArrayInputStream(arg2));
            field2694.setSequence(var5);
            field2694.setLoopCount(arg0 ? -1 : 0);
            this.method678(0, arg3, -1L, -17);
            field2693 = true;
            field2694.start();
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIJ)V", line = 99)
    public final void method389(int arg0, int arg1, int arg2, long arg3) {
        try {
            ShortMessage var6 = new ShortMessage();
            var6.setMessage(arg0, arg1, arg2);
            field2692.send(var6, arg3);
        } catch (InvalidMidiDataException var8) {
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V", line = 109)
    public final void method390(int arg0, int arg1) {
        if (field2694 != null) {
            this.method682(arg0, (byte) 112, -1L);
            if (arg1 != 59) {
                this.method385(false, 118, null, -62);
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V", line = 125)
    public final void method382(int arg0) {
        if (field2694 == null) {
            return;
        }
        field2693 = false;
        if (arg0 != 0) {
            field2694 = null;
        }
        field2694.stop();
        this.method677(false, -1L);
    }

    @OriginalMember(owner = "client!sb", name = "close", descriptor = "()V", line = 142)
    public final void close() {
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V", line = 143)
    public class109() {
        try {
            field2692 = MidiSystem.getReceiver();
            field2694 = MidiSystem.getSequencer(false);
            field2694.getTransmitter().setReceiver(this);
            field2694.open();
            this.method677(false, -1L);
        } catch (Exception var2) {
            class72.method535(256);
        }
    }
}
