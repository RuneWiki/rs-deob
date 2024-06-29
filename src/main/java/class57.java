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

@OriginalClass("client!ie")
public class class57 extends class65 implements Receiver {

    @OriginalMember(owner = "client!ie", name = "W", descriptor = "Ljavax/sound/midi/Sequencer;")
    private static Sequencer field1353 = null;

    @OriginalMember(owner = "client!ie", name = "X", descriptor = "Z")
    private static volatile boolean field1354 = false;

    @OriginalMember(owner = "client!ie", name = "Y", descriptor = "Ljavax/sound/midi/Receiver;")
    private static Receiver field1355 = null;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIJ)V", line = 12)
    public final void method446(int arg0, int arg1, int arg2, long arg3) {
        try {
            ShortMessage var6 = new ShortMessage();
            var6.setMessage(arg0, arg1, arg2);
            field1355.send(var6, arg3);
        } catch (InvalidMidiDataException var8) {
        }
    }

    @OriginalMember(owner = "client!ie", name = "close", descriptor = "()V", line = 21)
    public final void close() {
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZ)V", line = 24)
    public final void method447(int arg0, boolean arg1) {
        if (field1353 != null) {
            this.method499(arg0, arg1, -1L);
            if (arg1) {
                field1353 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z[BII)V", line = 37)
    public final void method448(boolean arg0, byte[] arg1, int arg2, int arg3) {
        if (field1353 == null) {
            return;
        }
        try {
            int var5 = -58 / ((arg3 + 17) / 47);
            Sequence var6 = MidiSystem.getSequence(new ByteArrayInputStream(arg1));
            field1353.setSequence(var6);
            field1353.setLoopCount(arg0 ? -1 : 0);
            this.method502(arg2, 193654407, -1L, 0);
            field1354 = true;
            field1353.start();
        } catch (Exception var8) {
        }
    }

    @OriginalMember(owner = "client!ie", name = "send", descriptor = "(Ljavax/sound/midi/MidiMessage;J)V", line = 69)
    public final synchronized void send(MidiMessage arg0, long arg1) {
        if (field1354) {
            byte[] var4 = arg0.getMessage();
            if (!this.method508(var4[0] & 0xFF, var4[1], var4.length >= 3 ? var4[2] : 0, arg1)) {
                field1355.send(arg0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V", line = 81)
    public final void method449(byte arg0) {
        if (arg0 < 14) {
            this.method451(60, 100, -19);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V", line = 90)
    public final void method450(int arg0) {
        if (field1353 == null) {
            return;
        }
        field1354 = false;
        field1353.stop();
        this.method510(-1L, (byte) -123);
        if (arg0 != -5736) {
            field1355 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)V", line = 106)
    public final synchronized void method451(int arg0, int arg1, int arg2) {
        if (arg1 == 91 && field1353 != null) {
            this.method502(arg2, 193654407, -1L, arg0);
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V", line = 120)
    public final void method452(int arg0) {
        if (arg0 != 0) {
            this.method446(-31, -115, -60, 38L);
        }
        if (field1353 != null) {
            field1353.close();
            field1353 = null;
        }
        if (field1355 != null) {
            field1355.close();
            field1355 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V", line = 142)
    public class57() {
        try {
            field1355 = MidiSystem.getReceiver();
            field1353 = MidiSystem.getSequencer(false);
            field1353.getTransmitter().setReceiver(this);
            field1353.open();
            this.method510(-1L, (byte) -123);
        } catch (Exception var2) {
            class65.method504(-112);
        }
    }
}
