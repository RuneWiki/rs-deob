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

@OriginalClass("client!da")
public class class20 extends class123 implements Receiver {

    @OriginalMember(owner = "client!da", name = "R", descriptor = "Ljavax/sound/midi/Sequencer;")
    private static Sequencer field674 = null;

    @OriginalMember(owner = "client!da", name = "T", descriptor = "Ljavax/sound/midi/Receiver;")
    private static Receiver field676 = null;

    @OriginalMember(owner = "client!da", name = "S", descriptor = "Z")
    private static volatile boolean field675 = false;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BII)V", line = 11)
    public final synchronized void method303(byte arg0, int arg1, int arg2) {
        if (field674 != null) {
            this.method999(arg1, arg2, -1L, 0);
            if (arg0 > -82) {
                field674 = null;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(B)V", line = 25)
    public final void method304(byte arg0) {
        if (field674 != null) {
            field674.close();
            field674 = null;
        }
        if (field676 != null) {
            field676.close();
            field676 = null;
        }
        if (arg0 < 100) {
            this.method305(-16, -43);
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V", line = 46)
    public class20() {
        try {
            field676 = MidiSystem.getReceiver();
            field674 = MidiSystem.getSequencer(false);
            field674.getTransmitter().setReceiver(this);
            field674.open();
            this.method1003((byte) 115, -1L);
        } catch (Exception var2) {
            class131.method1032(104);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)V", line = 65)
    public final void method305(int arg0, int arg1) {
        if (field674 != null) {
            if (arg1 != 0) {
                this.method305(114, 102);
            }
            this.method1000(-100, -1L, arg0);
        }
    }

    @OriginalMember(owner = "client!da", name = "close", descriptor = "()V", line = 79)
    public final void close() {
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V", line = 85)
    public final void method306(byte arg0) {
        if (field674 == null) {
            return;
        }
        field675 = false;
        field674.stop();
        this.method1003((byte) 106, -1L);
        if (arg0 != -96) {
            this.method307(-102, -74, -81, 35L);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIJ)V", line = 101)
    public final void method307(int arg0, int arg1, int arg2, long arg3) {
        try {
            ShortMessage var6 = new ShortMessage();
            var6.setMessage(arg0, arg1, arg2);
            field676.send(var6, arg3);
        } catch (InvalidMidiDataException var8) {
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([BZII)V", line = 112)
    public final void method308(byte[] arg0, boolean arg1, int arg2, int arg3) {
        if (field674 == null) {
            return;
        }
        try {
            if (arg2 != -15910) {
                field674 = null;
            }
            Sequence var5 = MidiSystem.getSequence(new ByteArrayInputStream(arg0));
            field674.setSequence(var5);
            field674.setLoopCount(arg1 ? -1 : 0);
            this.method999(arg3, 0, -1L, arg2 ^ -15910);
            field675 = true;
            field674.start();
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!da", name = "send", descriptor = "(Ljavax/sound/midi/MidiMessage;J)V", line = 135)
    public final synchronized void send(MidiMessage arg0, long arg1) {
        if (field675) {
            byte[] var4 = arg0.getMessage();
            if (!this.method1004(var4[0] & 0xFF, var4[1], var4.length >= 3 ? var4[2] : 0, arg1)) {
                field676.send(arg0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V", line = 152)
    public final void method309(int arg0) {
        if (arg0 != 0) {
            this.method306((byte) -23);
        }
    }
}
