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
public class class14 extends class23 implements Receiver {

    @OriginalMember(owner = "client!cb", name = "X", descriptor = "Ljavax/sound/midi/Receiver;")
    private static Receiver field294 = null;

    @OriginalMember(owner = "client!cb", name = "Y", descriptor = "Ljavax/sound/midi/Sequencer;")
    private static Sequencer field295 = null;

    @OriginalMember(owner = "client!cb", name = "send", descriptor = "(Ljavax/sound/midi/MidiMessage;J)V", line = 11)
    public final synchronized void send(MidiMessage arg0, long arg1) {
        byte[] var4 = arg0.getMessage();
        if (var4.length < 3 || !this.method178(var4[0], var4[1], var4[2], arg1)) {
            field294.send(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(B)V", line = 19)
    public final void method85(byte arg0) {
        if (field295 != null) {
            field295.close();
            field295 = null;
        }
        if (field294 != null) {
            field294.close();
            field294 = null;
        }
        if (arg0 < 57) {
            this.method88(105, (byte) -69);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)V", line = 43)
    public final synchronized void method86(int arg0, int arg1, int arg2) {
        if (arg0 == 0 && field295 != null) {
            this.method185(true, -1L, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V", line = 54)
    public class14() {
        try {
            field294 = MidiSystem.getReceiver();
            field295 = MidiSystem.getSequencer(false);
            field295.getTransmitter().setReceiver(this);
            field295.open();
            this.method184(-31895, -1L);
        } catch (Exception var2) {
            class101.method843((byte) 10);
        }
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(B)V", line = 78)
    public final void method87(byte arg0) {
        if (arg0 != -56) {
            field295 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)V", line = 88)
    public final void method88(int arg0, byte arg1) {
        if (field295 != null && arg1 <= -43) {
            this.method179(-202, arg0, -1L);
        }
    }

    @OriginalMember(owner = "client!cb", name = "close", descriptor = "()V", line = 100)
    public final void close() {
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BZI[B)V", line = 103)
    public final void method89(byte arg0, boolean arg1, int arg2, byte[] arg3) {
        if (field295 == null) {
            return;
        }
        try {
            Sequence var5 = MidiSystem.getSequence(new ByteArrayInputStream(arg3));
            field295.setSequence(var5);
            if (arg0 >= -93) {
                this.method85((byte) 121);
            }
            field295.setLoopCount(arg1 ? -1 : 0);
            this.method185(true, -1L, 0, arg2);
            field295.start();
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V", line = 130)
    public final void method90(byte arg0) {
        if (field295 == null) {
            return;
        }
        if (arg0 != 59) {
            this.method86(-98, 28, 97);
        }
        field295.stop();
        this.method184(arg0 - 31954, -1L);
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(IIIJ)V", line = 145)
    public final void method91(int arg0, int arg1, int arg2, long arg3) {
        try {
            ShortMessage var6 = new ShortMessage();
            var6.setMessage(arg0, arg1, arg2);
            field294.send(var6, arg3);
        } catch (InvalidMidiDataException var8) {
        }
    }
}
