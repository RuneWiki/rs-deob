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
public class class20 extends class88 implements Receiver {

    @OriginalMember(owner = "client!da", name = "O", descriptor = "Z")
    private static volatile boolean field384 = false;

    @OriginalMember(owner = "client!da", name = "U", descriptor = "Ljavax/sound/midi/Sequencer;")
    private static Sequencer field385 = null;

    @OriginalMember(owner = "client!da", name = "I", descriptor = "Ljavax/sound/midi/Receiver;")
    private static Receiver field383 = null;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 12)
    public final void method136(int arg0) {
        if (field385 != null) {
            field385.close();
            field385 = null;
        }
        int var2 = 63 % ((-arg0 - 13) / 33);
        if (field383 != null) {
            field383.close();
            field383 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[BIZ)V", line = 32)
    public final void method137(int arg0, byte[] arg1, int arg2, boolean arg3) {
        if (field385 == null) {
            return;
        }
        try {
            Sequence var5 = MidiSystem.getSequence(new ByteArrayInputStream(arg1));
            field385.setSequence(var5);
            field385.setLoopCount(arg3 ? -1 : 0);
            this.method731(-1L, arg2, 0, 0);
            field384 = true;
            field385.start();
        } catch (Exception var7) {
        }
        if (arg0 != 13701) {
            this.method136(71);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IBI)V", line = 56)
    public final synchronized void method138(int arg0, byte arg1, int arg2) {
        if (field385 != null) {
            this.method731(-1L, arg2, arg0, 0);
            int var4 = -69 % ((-arg1 - 75) / 40);
        }
    }

    @OriginalMember(owner = "client!da", name = "send", descriptor = "(Ljavax/sound/midi/MidiMessage;J)V", line = 67)
    public final synchronized void send(MidiMessage arg0, long arg1) {
        if (field384) {
            byte[] var4 = arg0.getMessage();
            if (!this.method730(var4[0], var4[1], var4.length >= 3 ? var4[2] : 0, arg1)) {
                field383.send(arg0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "close", descriptor = "()V", line = 80)
    public final void close() {
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIJ)V", line = 88)
    public final void method139(int arg0, int arg1, int arg2, long arg3) {
        try {
            ShortMessage var6 = new ShortMessage();
            var6.setMessage(arg0, arg1, arg2);
            field383.send(var6, arg3);
        } catch (InvalidMidiDataException var8) {
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IB)V", line = 101)
    public final void method140(int arg0, byte arg1) {
        if (field385 != null) {
            int var3 = 20 / ((52 - arg1) / 36);
            this.method737(arg0, (byte) -20, -1L);
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(B)V", line = 114)
    public final void method141(byte arg0) {
        if (field385 == null) {
            return;
        }
        if (arg0 != 105) {
            this.method136(-22);
        }
        field384 = false;
        field385.stop();
        this.method732(-1L, 0);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(B)V", line = 131)
    public final void method142(byte arg0) {
        int var2 = -1 % ((-arg0 - 16) / 49);
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V", line = 140)
    public class20() {
        try {
            field383 = MidiSystem.getReceiver();
            field385 = MidiSystem.getSequencer(false);
            field385.getTransmitter().setReceiver(this);
            field385.open();
            this.method732(-1L, 0);
        } catch (Exception var2) {
            class107.method878(2);
        }
    }
}
