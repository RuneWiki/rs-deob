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

@OriginalClass("client!pa")
public class class90 extends class17 implements Receiver {

    @OriginalMember(owner = "client!pa", name = "N", descriptor = "Ljavax/sound/midi/Receiver;")
    private static Receiver field2025 = null;

    @OriginalMember(owner = "client!pa", name = "O", descriptor = "Ljavax/sound/midi/Sequencer;")
    private static Sequencer field2026 = null;

    @OriginalMember(owner = "client!pa", name = "close", descriptor = "()V", line = 11)
    public final void close() {
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)V", line = 14)
    public final void method440(int arg0) {
        if (arg0 != -1) {
            this.method432((byte) -77, 15, 90);
        }
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V", line = 23)
    public final void method439(int arg0) {
        if (arg0 != 1) {
            field2025 = null;
        }
        if (field2026 != null) {
            this.method138((byte) -103, -1L);
        }
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V", line = 36)
    public final void method437(int arg0) {
        if (arg0 != 128) {
            return;
        }
        if (field2026 != null) {
            field2026.close();
            field2026 = null;
        }
        if (field2025 != null) {
            field2025.close();
            field2025 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZB[BI)V", line = 57)
    public final void method438(boolean arg0, byte arg1, byte[] arg2, int arg3) {
        if (field2026 == null) {
            return;
        }
        try {
            Sequence var5 = MidiSystem.getSequence(new ByteArrayInputStream(arg2));
            field2026.setSequence(var5);
            field2026.setLoopCount(arg0 ? -1 : 0);
            this.method135(-65, arg3, -1L, 0);
            if (arg1 != 2) {
                return;
            }
            field2026.start();
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BII)V", line = 80)
    public final synchronized void method432(byte arg0, int arg1, int arg2) {
        if (field2026 != null) {
            if (arg0 != -97) {
                this.method141(94, -95, -106, 26L);
            }
            this.method135(-65, arg2, -1L, arg1);
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(IIIJ)V", line = 94)
    public final void method141(int arg0, int arg1, int arg2, long arg3) {
        try {
            ShortMessage var6 = new ShortMessage();
            var6.setMessage(arg0, arg1, arg2);
            field2025.send(var6, arg3);
        } catch (InvalidMidiDataException var8) {
        }
    }

    @OriginalMember(owner = "client!pa", name = "send", descriptor = "(Ljavax/sound/midi/MidiMessage;J)V", line = 106)
    public final synchronized void send(MidiMessage arg0, long arg1) {
        byte[] var4 = arg0.getMessage();
        if (var4.length < 3 || !this.method132(var4[0], var4[1], var4[2], arg1)) {
            field2025.send(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)V", line = 114)
    public final void method429(byte arg0) {
        if (field2026 != null) {
            field2026.stop();
            this.method136(-1L, (byte) 69);
            int var2 = -104 / ((arg0 + 2) / 57);
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V", line = 127)
    public class90() {
        try {
            field2025 = MidiSystem.getReceiver();
            field2026 = MidiSystem.getSequencer(false);
            field2026.getTransmitter().setReceiver(this);
            field2026.open();
            this.method136(-1L, (byte) 69);
        } catch (Exception var2) {
            class12.method111(true);
        }
    }
}
