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

@OriginalClass("client!vd")
public class class138 extends class104 implements Receiver {

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "Z")
    private static volatile boolean field3321 = false;

    @OriginalMember(owner = "client!vd", name = "N", descriptor = "Ljavax/sound/midi/Sequencer;")
    private static Sequencer field3322 = null;

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "Ljavax/sound/midi/Receiver;")
    private static Receiver field3323 = null;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
    public final void method181(byte arg0) {
        if (field3322 != null) {
            field3321 = false;
            field3322.stop();
            int var2 = -92 / ((arg0 - 71) / 40);
            this.method804(-17, -1L);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZIB[B)V")
    public final void method178(boolean arg0, int arg1, byte arg2, byte[] arg3) {
        if (field3322 == null) {
            return;
        }
        try {
            Sequence var5 = MidiSystem.getSequence(new ByteArrayInputStream(arg3));
            if (arg2 >= -19) {
                return;
            }
            field3322.setSequence(var5);
            field3322.setLoopCount(arg0 ? -1 : 0);
            this.method806(-1L, (byte) -8, arg1, 0);
            field3321 = true;
            field3322.start();
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
    public final void method169(int arg0) {
        if (arg0 != 15299) {
            this.method181((byte) 57);
        }
    }

    @OriginalMember(owner = "client!vd", name = "send", descriptor = "(Ljavax/sound/midi/MidiMessage;J)V")
    public final synchronized void send(MidiMessage arg0, long arg1) {
        if (field3321) {
            byte[] var4 = arg0.getMessage();
            if (!this.method802(var4[0] & 0xFF, var4[1], var4.length >= 3 ? var4[2] : 0, arg1)) {
                field3323.send(arg0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)V")
    public final void method172(int arg0) {
        if (field3322 != null) {
            field3322.close();
            field3322 = null;
        }
        if (field3323 != null) {
            field3323.close();
            field3323 = null;
        }
        int var2 = -36 / ((arg0 - 62) / 59);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V")
    public final void method167(int arg0, int arg1) {
        if (arg0 == 65535 && field3322 != null) {
            this.method801(arg1, -1L, false);
        }
    }

    @OriginalMember(owner = "client!vd", name = "close", descriptor = "()V")
    public final void close() {
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    public class138() {
        try {
            field3323 = MidiSystem.getReceiver();
            field3322 = MidiSystem.getSequencer(false);
            field3322.getTransmitter().setReceiver(this);
            field3322.open();
            this.method804(-17, -1L);
        } catch (Exception var2) {
            class116.method900((byte) -62);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIJ)V")
    public final void method225(int arg0, int arg1, int arg2, long arg3) {
        try {
            ShortMessage var6 = new ShortMessage();
            var6.setMessage(arg0, arg1, arg2);
            field3323.send(var6, arg3);
        } catch (InvalidMidiDataException var8) {
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)V")
    public final synchronized void method176(int arg0, int arg1, int arg2) {
        if (field3322 != null && arg2 == 14) {
            this.method806(-1L, (byte) -8, arg1, arg0);
        }
    }
}
