import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class784 extends class238 {

    @OriginalMember(owner = "client!lr", name = "B", descriptor = "Ljagtheora/vorbis/VorbisInfo;")
    private VorbisInfo field10775 = new VorbisInfo();

    @OriginalMember(owner = "client!lr", name = "G", descriptor = "Ljagtheora/vorbis/VorbisComment;")
    private VorbisComment field10780 = new VorbisComment();

    @OriginalMember(owner = "client!lr", name = "F", descriptor = "Lbo;")
    public static class761 field10779 = new class761();

    @OriginalMember(owner = "client!lr", name = "p", descriptor = "D")
    private double field10763;

    @OriginalMember(owner = "client!lr", name = "o", descriptor = "I")
    public static int field10762;

    @OriginalMember(owner = "client!lr", name = "q", descriptor = "I")
    public static int field10764;

    @OriginalMember(owner = "client!lr", name = "t", descriptor = "I")
    public static int field10767;

    @OriginalMember(owner = "client!lr", name = "u", descriptor = "I")
    public static int field10768;

    @OriginalMember(owner = "client!lr", name = "v", descriptor = "I")
    private int field10769;

    @OriginalMember(owner = "client!lr", name = "w", descriptor = "I")
    public static int field10770;

    @OriginalMember(owner = "client!lr", name = "x", descriptor = "I")
    public static int field10771;

    @OriginalMember(owner = "client!lr", name = "z", descriptor = "I")
    public static int field10773;

    @OriginalMember(owner = "client!lr", name = "A", descriptor = "I")
    public static int field10774;

    @OriginalMember(owner = "client!lr", name = "D", descriptor = "I")
    public static int field10777;

    @OriginalMember(owner = "client!lr", name = "E", descriptor = "I")
    public static int field10778;

    @OriginalMember(owner = "client!lr", name = "y", descriptor = "Ltd;")
    private class480 field10772;

    @OriginalMember(owner = "client!lr", name = "r", descriptor = "Llja;")
    private class745 field10765;

    @OriginalMember(owner = "client!lr", name = "s", descriptor = "Ljagtheora/vorbis/DSPState;")
    private DSPState field10766;

    @OriginalMember(owner = "client!lr", name = "C", descriptor = "Ljagtheora/vorbis/VorbisBlock;")
    private VorbisBlock field10776;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(II[BIIIII[B)V")
    public static final void method4277(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        ++field10768;
        int var9 = -(arg5 >> 2);
        if (arg3 > -124) {
            field10779 = null;
        }
        int var10 = -(arg5 & 3);
        for (int var11 = -arg0; var11 < 0; ++var11) {
            int var10001;
            for (int var12 = var9; ~var12 > -1; ++var12) {
                var10001 = arg6++;
                arg8[var10001] = (byte) (arg8[var10001] + -arg2[arg4++]);
                int var14 = arg6++;
                arg8[var14] = (byte) (arg8[var14] + -arg2[arg4++]);
                int var15 = arg6++;
                arg8[var15] = (byte) (arg8[var15] + -arg2[arg4++]);
                int var16 = arg6++;
                arg8[var16] = (byte) (arg8[var16] + -arg2[arg4++]);
            }
            for (int var13 = var10; var13 < 0; ++var13) {
                var10001 = arg6++;
                arg8[var10001] = (byte) (arg8[var10001] + -arg2[arg4++]);
            }
            arg4 += arg1;
            arg6 += arg7;
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)D")
    public final double method4278(int arg0) {
        if (arg0 != 0) {
            method4279((byte[]) null, -57, 100, 12);
        }
        ++field10764;
        double var2 = this.field10763;
        if (this.field10765 != null) {
            var2 = this.field10765.method4132(arg0 + -25450976);
            if (var2 < 0.0D) {
                var2 = this.field10763;
            }
        }
        return (double) (-(256.0F / (float) class55.field782)) + var2;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "([BIII)Ljava/lang/String;")
    public static final String method4279(byte[] arg0, int arg1, int arg2, int arg3) {
        ++field10773;
        char[] var4 = new char[arg1];
        int var5 = 0;
        for (int var6 = 0; ~var6 > ~arg1; ++var6) {
            int var7 = 255 & arg0[arg2 + var6];
            if (~var7 != -1) {
                if (~var7 <= -129 && ~var7 > -161) {
                    char var8 = class762.field10525[var7 + -128];
                    if (~var8 == -1) {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        if (arg3 != 255) {
            method4283(43, -0.28467172F, -14, -2.5403466F, -2.8407805F, 0.3980478F, 0.5184356F, 1.9369792F);
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(I)Llja;")
    public final class745 method4280(int arg0) {
        int var2 = -77 / ((-18 - arg0) / 56);
        ++field10770;
        return this.field10765;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(BLjagtheora/ogg/OggPacket;)V")
    public final void method618(byte arg0, OggPacket arg1) {
        if (arg0 <= 27) {
            this.field10780 = null;
        }
        ++field10777;
        if (~super.field3399 > -4) {
            int var6 = this.field10775.headerIn(this.field10780, arg1);
            if (var6 < 0) {
                throw new IllegalStateException(String.valueOf(var6));
            } else if (super.field3399 == 2) {
                if (this.field10775.channels <= 2 && this.field10775.channels >= 1) {
                    this.field10766 = new DSPState(this.field10775);
                    this.field10776 = new VorbisBlock(this.field10766);
                    this.field10772 = new class480(this.field10775.rate, class55.field782);
                    this.field10765 = new class745(this.field10775.channels);
                } else {
                    throw new RuntimeException(String.valueOf(this.field10775.channels));
                }
            }
        } else {
            if (this.field10776.synthesis(arg1) == 0) {
                this.field10766.blockIn(this.field10776);
            }
            float[][] var3 = this.field10766.pcmOut(this.field10775.channels);
            this.field10763 = this.field10766.granuleTime();
            if (this.field10763 == -1.0D) {
                this.field10763 = (double) ((float) this.field10769 / (float) this.field10775.rate);
            }
            this.field10766.read(var3[0].length);
            this.field10769 += var3[0].length;
            class231 var4 = this.field10765.method4131(var3[0].length, this.field10763, -103);
            class521.method2963(true, var3, var4.field3357);
            for (int var5 = 0; ~this.field10775.channels < ~var5; ++var5) {
                var4.field3357[var5] = this.field10772.method2749(var4.field3357[var5], false);
            }
            this.field10765.method4133(1, var4);
        }
    }

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "(I)V")
    public static void method4281(int arg0) {
        field10779 = null;
        if (arg0 != 0) {
            field10779 = null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)V")
    public static final void method4282(String arg0, int arg1, int arg2, String arg3) {
        class459.field6232 = arg1;
        class328.field4463 = 2;
        ++field10762;
        class678.method3823(arg0, (byte) -95, false, arg3);
        if (arg2 != 19046) {
            field10779 = null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IFIFFFFF)F")
    public static final float method4283(int arg0, float arg1, int arg2, float arg3, float arg4, float arg5, float arg6, float arg7) {
        ++field10771;
        float var8 = 0.0F;
        if (arg0 != -1) {
            method4282((String) null, 64, -50, (String) null);
        }
        float var9 = -arg3 + arg1;
        float var10 = -arg6 + arg7;
        float var11 = arg5 - arg4;
        float var12 = 0.0F;
        float var13 = 0.0F;
        float var14 = 0.0F;
        while (var8 < 1.1F) {
            float var15 = var8 * var9 + arg3;
            float var16 = var8 * var10 + arg6;
            float var17 = var8 * var11 + arg4;
            int var18 = (int) var15 >> 9;
            int var19 = (int) var17 >> 9;
            if (~var18 < -1 && ~var19 < -1 && class483.field6515 > var18 && class65.field926 > var19) {
                int var20 = class235.field3379.field7391;
                if (~var20 > -4 && ~(2 & class554.field7832[1][var18][var19]) != -1) {
                    ++var20;
                }
                int var21 = class142.field2418[var20].method1907((int) var15, (byte) -42, (int) var17);
                if ((float) var21 < var16) {
                    if (~arg2 > -3) {
                        return var8;
                    }
                    return 0.1F * method4283(-1, var15, arg2 + -1, var12, var14, var17, var13, var16) + (var8 - 0.1F);
                }
            }
            var8 += 0.1F;
            var13 = var16;
            var14 = var17;
            var12 = var15;
        }
        return -1.0F;
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(B)I")
    public final int method4284(byte arg0) {
        ++field10778;
        if (arg0 < 82) {
            this.method4280(95);
        }
        return this.field10765 == null ? 0 : this.field10765.method4137(256);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(BI)V")
    public static final void method4285(byte arg0, int arg1) {
        ++field10774;
        class43 var2 = class220.field3227;
        synchronized (class220.field3227) {
            class220.field3227.method265(arg1, -45);
            if (arg0 != -115) {
                method4279((byte[]) null, 56, 111, 74);
            }
        }
        class43 var3 = class23.field479;
        synchronized (class23.field479) {
            class23.field479.method265(arg1, -55);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
    public final void method622(int arg0) {
        ++field10767;
        if (this.field10776 != null) {
            this.field10776.method4124();
        }
        if (arg0 != 23586) {
            this.field10776 = null;
        }
        if (this.field10766 != null) {
            this.field10766.method4124();
        }
        this.field10780.method4124();
        this.field10775.method4124();
        if (this.field10765 != null) {
            this.field10765.method4136(true);
        }
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class784(OggStreamState arg0) {
        super(arg0);
    }
}
