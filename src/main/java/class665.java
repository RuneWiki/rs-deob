import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class665 extends class181 {

    @OriginalMember(owner = "client!tda", name = "I", descriptor = "Ljagtheora/vorbis/VorbisInfo;")
    private VorbisInfo field9201 = new VorbisInfo();

    @OriginalMember(owner = "client!tda", name = "w", descriptor = "Ljagtheora/vorbis/VorbisComment;")
    private VorbisComment field9189 = new VorbisComment();

    @OriginalMember(owner = "client!tda", name = "D", descriptor = "[I")
    public static int[] field9196 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!tda", name = "H", descriptor = "S")
    public static short field9200 = 1;

    @OriginalMember(owner = "client!tda", name = "B", descriptor = "D")
    private double field9194;

    @OriginalMember(owner = "client!tda", name = "v", descriptor = "I")
    public static int field9188;

    @OriginalMember(owner = "client!tda", name = "y", descriptor = "I")
    public static int field9191;

    @OriginalMember(owner = "client!tda", name = "z", descriptor = "I")
    public static int field9192;

    @OriginalMember(owner = "client!tda", name = "A", descriptor = "I")
    public static int field9193;

    @OriginalMember(owner = "client!tda", name = "G", descriptor = "I")
    public static int field9199;

    @OriginalMember(owner = "client!tda", name = "K", descriptor = "I")
    public static int field9203;

    @OriginalMember(owner = "client!tda", name = "L", descriptor = "I")
    public static int field9204;

    @OriginalMember(owner = "client!tda", name = "M", descriptor = "I")
    private int field9205;

    @OriginalMember(owner = "client!tda", name = "N", descriptor = "I")
    public static int field9206;

    @OriginalMember(owner = "client!tda", name = "x", descriptor = "Loba;")
    public static class275 field9190;

    @OriginalMember(owner = "client!tda", name = "E", descriptor = "Lmn;")
    private class388 field9197;

    @OriginalMember(owner = "client!tda", name = "C", descriptor = "Lnm;")
    private class501 field9195;

    @OriginalMember(owner = "client!tda", name = "J", descriptor = "Ljagtheora/vorbis/DSPState;")
    private DSPState field9202;

    @OriginalMember(owner = "client!tda", name = "F", descriptor = "Ljagtheora/vorbis/VorbisBlock;")
    private VorbisBlock field9198;

    @OriginalMember(owner = "client!tda", name = "u", descriptor = "[Lwfa;")
    public static class211[] field9187;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(B)Lnm;", line = 6)
    public final class501 method3683(byte arg0) {
        int var2 = -124 / ((arg0 - -25) / 57);
        ++field9192;
        return this.field9195;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(I)V", line = 19)
    public final void method388(int arg0) {
        ++field9203;
        if (arg0 != -30243) {
            this.field9197 = null;
        }
        if (this.field9198 != null) {
            this.field9198.method4110();
        }
        if (this.field9202 != null) {
            this.field9202.method4110();
        }
        this.field9189.method4110();
        this.field9201.method4110();
        if (this.field9195 != null) {
            this.field9195.method2894(-15521);
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;B)V", line = 43)
    public final void method387(OggPacket arg0, byte arg1) {
        ++field9199;
        if (arg1 == -13) {
            if (~super.field2398 > -4) {
                int var3 = this.field9201.headerIn(this.field9189, arg0);
                if (~var3 > -1) {
                    throw new IllegalStateException(String.valueOf(var3));
                }
                if (~super.field2398 == -3) {
                    if (this.field9201.channels <= 2 && this.field9201.channels >= 1) {
                        this.field9202 = new DSPState(this.field9201);
                        this.field9198 = new VorbisBlock(this.field9202);
                        this.field9197 = new class388(this.field9201.rate, class386.field5629);
                        this.field9195 = new class501(this.field9201.channels);
                        return;
                    }
                    throw new RuntimeException(String.valueOf(this.field9201.channels));
                }
            } else {
                if (~this.field9198.synthesis(arg0) == -1) {
                    this.field9202.blockIn(this.field9198);
                }
                float[][] var4 = this.field9202.pcmOut(this.field9201.channels);
                this.field9194 = this.field9202.granuleTime();
                if (this.field9194 == -1.0D) {
                    this.field9194 = (double) ((float) this.field9205 / (float) this.field9201.rate);
                }
                this.field9202.read(var4[0].length);
                this.field9205 += var4[0].length;
                class490 var5 = this.field9195.method2891(12398, this.field9194, var4[0].length);
                class643.method3571(var4, var5.field6802, (byte) 95);
                for (int var6 = 0; this.field9201.channels > var6; ++var6) {
                    var5.field6802[var6] = this.field9197.method2455(var5.field6802[var6], 992);
                }
                this.field9195.method2898(arg1 + -77, var5);
            }
        }
    }

    @OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 107)
    public class665(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "(Z)V", line = 118)
    public static void method3684(boolean arg0) {
        if (!arg0) {
            field9196 = null;
        }
        field9190 = null;
        field9196 = null;
        field9187 = null;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lor;B)V", line = 135)
    public static final void method3685(class668 arg0, byte arg1) {
        ++field9188;
        int var2 = -85 / ((-53 - arg1) / 55);
        if (~class457.field6335 == ~arg0.field9271) {
            if (class551.field7456.field1020 == null) {
                arg0.field9348 = 0;
                arg0.field9273 = 0;
            } else {
                arg0.field9300 = 150;
                arg0.field9299 = 2047 & (int) (Math.sin((double) class100.field1401 / 40.0D) * 256.0D);
                arg0.field9348 = class363.field5292;
                arg0.field9230 = 5;
                arg0.field9273 = class497.method2874((byte) -126, class551.field7456.field1020);
                arg0.field9264 = class551.field7456.field1808;
                arg0.field9323 = 0;
                arg0.field9315 = class551.field7456.field1840;
                arg0.field9218 = class551.field7456.field1794;
                class489 var3 = ~arg0.field9218 != 0 ? class6.field65.method1034(arg0.field9218, 0) : null;
                if (var3 != null) {
                    class291.method1842(0, arg0.field9264, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tda", name = "d", descriptor = "(Z)V", line = 175)
    public static final void method3686(boolean arg0) {
        ++field9206;
        class298.field4322.method1555((byte) -3);
        class322.field4711.method1555((byte) -3);
        class34.field555.method1555((byte) -3);
        class443.field6227.method1555((byte) -3);
        if (arg0) {
            method3685((class668) null, (byte) 7);
        }
    }

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "(I)D", line = 195)
    public final double method3687(int arg0) {
        ++field9193;
        if (arg0 != -22940) {
            field9196 = null;
        }
        double var2 = this.field9194;
        if (this.field9195 != null) {
            var2 = this.field9195.method2899(arg0 + 22940);
            if (var2 < 0.0D) {
                var2 = this.field9194;
            }
        }
        return var2 - (double) (256.0F / (float) class386.field5629);
    }

    @OriginalMember(owner = "client!tda", name = "d", descriptor = "(I)I", line = 222)
    public final int method3688(int arg0) {
        ++field9204;
        if (arg0 <= 72) {
            this.field9195 = null;
        }
        return this.field9195 == null ? 0 : this.field9195.method2893((byte) -110);
    }
}
