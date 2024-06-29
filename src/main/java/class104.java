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

@OriginalClass("client!rb")
public class class104 extends class116 implements Receiver {

    @OriginalMember(owner = "client!rb", name = "bb", descriptor = "Z")
    private static volatile boolean field2533 = false;

    @OriginalMember(owner = "client!rb", name = "cb", descriptor = "Ljavax/sound/midi/Sequencer;")
    private static Sequencer field2534 = null;

    @OriginalMember(owner = "client!rb", name = "db", descriptor = "Ljavax/sound/midi/Receiver;")
    private static Receiver field2535 = null;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(IIIJ)V", line = 12)
    public final void method542(int arg0, int arg1, int arg2, long arg3) {
        try {
            ShortMessage var6 = new ShortMessage();
            var6.setMessage(arg0, arg1, arg2);
            field2535.send(var6, arg3);
        } catch (InvalidMidiDataException var8) {
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V", line = 22)
    public final void method170(byte arg0) {
        if (arg0 < 119) {
            field2533 = false;
        }
        if (field2534 != null) {
            field2534.close();
            field2534 = null;
        }
        if (field2535 != null) {
            field2535.close();
            field2535 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 45)
    public final void method172(int arg0) {
        int var2 = 125 % ((-arg0 - 41) / 61);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([BZIZ)V", line = 52)
    public final void method177(byte[] arg0, boolean arg1, int arg2, boolean arg3) {
        if (field2534 == null) {
            return;
        }
        if (arg1) {
            field2533 = true;
        }
        try {
            Sequence var5 = MidiSystem.getSequence(new ByteArrayInputStream(arg0));
            field2534.setSequence(var5);
            field2534.setLoopCount(arg3 ? -1 : 0);
            this.method891(-1L, (byte) -123, 0, arg2);
            field2533 = true;
            field2534.start();
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)V", line = 83)
    public final synchronized void method171(int arg0, int arg1, int arg2) {
        if (arg1 != 19029) {
            field2534 = null;
        }
        if (field2534 != null) {
            this.method891(-1L, (byte) -123, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V", line = 101)
    public final void method176(int arg0) {
        if (field2534 != null) {
            field2533 = false;
            int var2 = -118 / ((-arg0 - 73) / 52);
            field2534.stop();
            this.method892(-1L, true);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)V", line = 115)
    public final void method179(byte arg0, int arg1) {
        if (field2534 != null) {
            int var3 = -76 / ((arg0 + 66) / 60);
            this.method890((byte) -34, arg1, -1L);
        }
    }

    @OriginalMember(owner = "client!rb", name = "send", descriptor = "(Ljavax/sound/midi/MidiMessage;J)V", line = 127)
    public final synchronized void send(MidiMessage arg0, long arg1) {
        if (field2533) {
            byte[] var4 = arg0.getMessage();
            if (!this.method894(var4[0] & 0xFF, var4[1], var4.length >= 3 ? var4[2] : 0, arg1)) {
                field2535.send(arg0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "close", descriptor = "()V", line = 141)
    public final void close() {
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V", line = 143)
    public class104() {
        try {
            field2535 = MidiSystem.getReceiver();
            field2534 = MidiSystem.getSequencer(false);
            field2534.getTransmitter().setReceiver(this);
            field2534.open();
            this.method892(-1L, true);
        } catch (Exception var2) {
            class101.method759(-6742);
        }
    }
}
