import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class435 extends class464 {

    @OriginalMember(owner = "client!et", name = "B", descriptor = "Ljagtheora/vorbis/VorbisInfo;")
    private VorbisInfo field5712 = new VorbisInfo();

    @OriginalMember(owner = "client!et", name = "C", descriptor = "Ljagtheora/vorbis/VorbisComment;")
    private VorbisComment field5713 = new VorbisComment();

    @OriginalMember(owner = "client!et", name = "D", descriptor = "I")
    public static int field5714 = 0;

    @OriginalMember(owner = "client!et", name = "G", descriptor = "Z")
    public static boolean field5717 = false;

    @OriginalMember(owner = "client!et", name = "y", descriptor = "D")
    private double field5709;

    @OriginalMember(owner = "client!et", name = "s", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!et", name = "t", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!et", name = "u", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!et", name = "v", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!et", name = "F", descriptor = "I")
    private int field5716;

    @OriginalMember(owner = "client!et", name = "H", descriptor = "I")
    public static int field5718;

    @OriginalMember(owner = "client!et", name = "E", descriptor = "Liia;")
    private class338 field5715;

    @OriginalMember(owner = "client!et", name = "A", descriptor = "Loha;")
    public static class465 field5711;

    @OriginalMember(owner = "client!et", name = "x", descriptor = "Lph;")
    private class632 field5708;

    @OriginalMember(owner = "client!et", name = "z", descriptor = "Ljagtheora/vorbis/DSPState;")
    private DSPState field5710;

    @OriginalMember(owner = "client!et", name = "w", descriptor = "Ljagtheora/vorbis/VorbisBlock;")
    private VorbisBlock field5707;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;Z)V")
    public final void method510(OggPacket arg0, boolean arg1) {
        if (arg1) {
            ++field5718;
            if (super.field6024 < 3) {
                int var6 = this.field5712.headerIn(this.field5713, arg0);
                if (var6 < 0) {
                    throw new IllegalStateException(String.valueOf(var6));
                } else if (~super.field6024 == -3) {
                    if (~this.field5712.channels >= -3 && ~this.field5712.channels <= -2) {
                        this.field5710 = new DSPState(this.field5712);
                        this.field5707 = new VorbisBlock(this.field5710);
                        this.field5708 = new class632(this.field5712.rate, class791.field10837);
                        this.field5715 = new class338(this.field5712.channels);
                    } else {
                        throw new RuntimeException(String.valueOf(this.field5712.channels));
                    }
                }
            } else {
                if (this.field5707.synthesis(arg0) == 0) {
                    this.field5710.blockIn(this.field5707);
                }
                float[][] var3 = this.field5710.pcmOut(this.field5712.channels);
                this.field5709 = this.field5710.granuleTime();
                if (this.field5709 == -1.0D) {
                    this.field5709 = (double) ((float) this.field5716 / (float) this.field5712.rate);
                }
                this.field5710.read(var3[0].length);
                this.field5716 += var3[0].length;
                class461 var4 = this.field5715.method1955(122, this.field5709, var3[0].length);
                class696.method3781(123, var4.field6008, var3);
                for (int var5 = 0; ~this.field5712.channels < ~var5; ++var5) {
                    var4.field6008[var5] = this.field5708.method3373(-7574, var4.field6008[var5]);
                }
                this.field5715.method1957(var4, -99);
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(I)Liia;")
    public final class338 method2494(int arg0) {
        ++field5704;
        if (arg0 != 31077) {
            this.field5709 = 0.9177107892393456D;
        }
        return this.field5715;
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class435(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!et", name = "e", descriptor = "(I)V")
    public static void method2495(int arg0) {
        if (arg0 < 12) {
            field5717 = false;
        }
        field5711 = null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(III)Lfa;")
    public static final class590 method2496(int arg0, int arg1, int arg2) {
        class766 var3 = class28.field252[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class590 var4 = var3.field10425;
            var3.field10425 = null;
            class733.method3911(var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!et", name = "f", descriptor = "(I)D")
    public final double method2497(int arg0) {
        ++field5706;
        double var2 = this.field5709;
        if (arg0 != 32413) {
            return 0.6628104213883516D;
        } else {
            if (this.field5715 != null) {
                var2 = this.field5715.method1953(true);
                if (var2 < 0.0D) {
                    var2 = this.field5709;
                }
            }
            return (double) (-(256.0F / (float) class791.field10837)) + var2;
        }
    }

    @OriginalMember(owner = "client!et", name = "g", descriptor = "(I)I")
    public final int method2498(int arg0) {
        ++field5705;
        if (arg0 > -87) {
            method2495(-117);
        }
        return this.field5715 != null ? this.field5715.method1952(false) : 0;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
    public final void method508(int arg0) {
        if (this.field5707 != null) {
            this.field5707.method549();
        }
        ++field5703;
        if (this.field5710 != null) {
            this.field5710.method549();
        }
        this.field5713.method549();
        this.field5712.method549();
        if (this.field5715 != null) {
            this.field5715.method1949(121);
        }
        if (arg0 < 27) {
            field5717 = true;
        }
    }
}
