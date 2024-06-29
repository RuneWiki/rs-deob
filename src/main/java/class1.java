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

@OriginalClass("client!a")
public class class1 extends class119 implements Receiver {

    @OriginalMember(owner = "client!a", name = "E", descriptor = "Ljavax/sound/midi/Sequencer;")
    private static Sequencer field1 = null;

    @OriginalMember(owner = "client!a", name = "F", descriptor = "Ljavax/sound/midi/Receiver;")
    private static Receiver field2 = null;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public final void method1(int arg0) {
        if (arg0 >= 94 && field1 != null) {
            this.method875(122, -1L);
        }
    }

    @OriginalMember(owner = "client!a", name = "send", descriptor = "(Ljavax/sound/midi/MidiMessage;J)V")
    public final synchronized void send(MidiMessage arg0, long arg1) {
        byte[] var4 = arg0.getMessage();
        if (var4.length < 3 || !this.method874(var4[0], var4[1], var4[2], arg1)) {
            field2.send(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(IIIJ)V")
    public final void method2(int arg0, int arg1, int arg2, long arg3) {
        try {
            ShortMessage var6 = new ShortMessage();
            var6.setMessage(arg0, arg1, arg2);
            field2.send(var6, arg3);
        } catch (InvalidMidiDataException var8) {
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZBI[B)V")
    public final void method3(boolean arg0, byte arg1, int arg2, byte[] arg3) {
        if (field1 == null) {
            return;
        }
        try {
            if (arg1 > -87) {
                return;
            }
            Sequence var5 = MidiSystem.getSequence(new ByteArrayInputStream(arg3));
            field1.setSequence(var5);
            field1.setLoopCount(arg0 ? -1 : 0);
            this.method871(-109, arg2, -1L, 0);
            field1.start();
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V")
    public final void method4(int arg0) {
        if (field1 == null) {
            return;
        }
        field1.stop();
        this.method873(65, -1L);
        if (arg0 >= -107) {
            field2 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
    public class1() {
        try {
            field2 = MidiSystem.getReceiver();
            field1 = MidiSystem.getSequencer(false);
            field1.getTransmitter().setReceiver(this);
            field1.open();
            this.method873(85, -1L);
        } catch (Exception var2) {
            class121.method887(3);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BII)V")
    public final synchronized void method5(byte arg0, int arg1, int arg2) {
        if (field1 != null) {
            this.method871(-103, arg1, -1L, arg2);
            if (arg0 >= -81) {
                field2 = null;
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
    public final void method6(byte arg0) {
        if (field1 != null) {
            field1.close();
            field1 = null;
        }
        if (field2 != null) {
            field2.close();
            field2 = null;
        }
        if (arg0 >= -106) {
            field1 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
    public final void method7(boolean arg0) {
        if (!arg0) {
            this.method3(true, (byte) -15, 51, null);
        }
    }

    @OriginalMember(owner = "client!a", name = "close", descriptor = "()V")
    public final void close() {
    }
}
