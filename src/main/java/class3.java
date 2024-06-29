import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 extends class147 {

    @OriginalMember(owner = "client!dp", name = "z", descriptor = "Ljagtheora/vorbis/VorbisInfo;")
    private VorbisInfo field33 = new VorbisInfo();

    @OriginalMember(owner = "client!dp", name = "r", descriptor = "Ljagtheora/vorbis/VorbisComment;")
    private VorbisComment field25 = new VorbisComment();

    @OriginalMember(owner = "client!dp", name = "A", descriptor = "Lqe;")
    public static class465 field34 = new class465(120, 5);

    @OriginalMember(owner = "client!dp", name = "w", descriptor = "D")
    private double field30;

    @OriginalMember(owner = "client!dp", name = "q", descriptor = "I")
    private int field24;

    @OriginalMember(owner = "client!dp", name = "s", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!dp", name = "u", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!dp", name = "x", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!dp", name = "y", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!dp", name = "B", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!dp", name = "o", descriptor = "Lew;")
    private class490 field22;

    @OriginalMember(owner = "client!dp", name = "p", descriptor = "Lmi;")
    private class493 field23;

    @OriginalMember(owner = "client!dp", name = "t", descriptor = "Ljagtheora/vorbis/DSPState;")
    private DSPState field27;

    @OriginalMember(owner = "client!dp", name = "v", descriptor = "Ljagtheora/vorbis/VorbisBlock;")
    private VorbisBlock field29;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
    public final void method8(int arg0) {
        ++field35;
        if (arg0 == 0) {
            if (this.field29 != null) {
                this.field29.method3970();
            }
            if (this.field27 != null) {
                this.field27.method3970();
            }
            this.field25.method3970();
            this.field33.method3970();
            if (this.field23 != null) {
                this.field23.method2964((byte) -110);
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZLjagtheora/ogg/OggPacket;)V")
    public final void method9(boolean arg0, OggPacket arg1) {
        if (arg0) {
            this.field25 = null;
        }
        ++field31;
        if (~super.field2248 > -4) {
            int var3 = this.field33.headerIn(this.field25, arg1);
            if (~var3 > -1) {
                throw new IllegalStateException(String.valueOf(var3));
            }
            if (~super.field2248 == -3) {
                if (this.field33.channels <= 2 && ~this.field33.channels <= -2) {
                    this.field27 = new DSPState(this.field33);
                    this.field29 = new VorbisBlock(this.field27);
                    this.field22 = new class490(this.field33.rate, class215.field3077);
                    this.field23 = new class493(this.field33.channels);
                    return;
                }
                throw new RuntimeException(String.valueOf(this.field33.channels));
            }
        } else {
            if (this.field29.synthesis(arg1) == 0) {
                this.field27.blockIn(this.field29);
            }
            float[][] var4 = this.field27.pcmOut(this.field33.channels);
            this.field30 = this.field27.granuleTime();
            if (this.field30 == -1.0D) {
                this.field30 = (double) ((float) this.field24 / (float) this.field33.rate);
            }
            this.field27.read(var4[0].length);
            this.field24 += var4[0].length;
            class172 var5 = this.field23.method2971((byte) -27, var4[0].length, this.field30);
            class382.method2401(var5.field2497, var4, 16383);
            for (int var6 = 0; ~var6 > ~this.field33.channels; ++var6) {
                var5.field2497[var6] = this.field22.method2946((byte) -51, var5.field2497[var6]);
            }
            this.field23.method2969(var5, 100);
        }
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)D")
    public final double method10(int arg0) {
        ++field26;
        int var2 = -123 % ((arg0 - 63) / 40);
        double var3 = this.field30;
        if (this.field23 != null) {
            var3 = this.field23.method2968(-124);
            if (var3 < 0.0D) {
                var3 = this.field30;
            }
        }
        return (double) (-(256.0F / (float) class215.field3077)) + var3;
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class3(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "(I)I")
    public final int method11(int arg0) {
        if (arg0 <= 112) {
            this.method9(true, (OggPacket) null);
        }
        ++field32;
        return this.field23 == null ? 0 : this.field23.method2967((byte) 86);
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Z)Lmi;")
    public final class493 method12(boolean arg0) {
        ++field28;
        if (!arg0) {
            this.method8(63);
        }
        return this.field23;
    }

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "(I)V")
    public static void method13(int arg0) {
        field34 = null;
        if (arg0 != 0) {
            field34 = null;
        }
    }
}
