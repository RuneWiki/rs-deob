import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class255 extends class238 {

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "Ljagtheora/vorbis/VorbisInfo;")
    private VorbisInfo field3581 = new VorbisInfo();

    @OriginalMember(owner = "client!nj", name = "J", descriptor = "Ljagtheora/vorbis/VorbisComment;")
    private VorbisComment field3590 = new VorbisComment();

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "Z")
    public static boolean field3580 = false;

    @OriginalMember(owner = "client!nj", name = "L", descriptor = "D")
    private double field3592;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!nj", name = "B", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!nj", name = "C", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!nj", name = "E", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!nj", name = "F", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!nj", name = "G", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!nj", name = "I", descriptor = "I")
    private int field3589;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "Ldg;")
    private class430 field3578;

    @OriginalMember(owner = "client!nj", name = "D", descriptor = "Lhr;")
    private class549 field3585;

    @OriginalMember(owner = "client!nj", name = "K", descriptor = "Ljagtheora/vorbis/DSPState;")
    private DSPState field3591;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "Ljagtheora/vorbis/VorbisBlock;")
    private VorbisBlock field3577;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Llia;Lrv;B)Laf;")
    public static final class457 method1679(class501 arg0, class120 arg1, byte arg2) {
        ++field3582;
        class457 var3 = new class457(arg0);
        int var4 = arg1.method842(2384);
        boolean var5 = ~(var4 & 1) != -1;
        boolean var6 = ~(var4 & 2) != -1;
        boolean var7 = ~(4 & var4) != -1;
        if (arg2 != -55) {
            method1679((class501) null, (class120) null, (byte) -56);
        }
        boolean var8 = (var4 & 8) != 0;
        if (var5) {
            var3.field6556[0] = arg1.method898((byte) -96);
            var3.field6553[0] = arg1.method898((byte) -126);
            if (~arg0.field7116 != 0 || arg0.field7120 != -1) {
                var3.field6556[1] = arg1.method898((byte) -124);
                var3.field6553[1] = arg1.method898((byte) -119);
            }
            if (~arg0.field7157 != 0 || arg0.field7177 != -1) {
                var3.field6556[2] = arg1.method898((byte) -100);
                var3.field6553[2] = arg1.method898((byte) -88);
            }
        }
        if (var6) {
            var3.field6555[0] = arg1.method898((byte) -81);
            var3.field6546[0] = arg1.method898((byte) -99);
            if (~arg0.field7159 != 0 || ~arg0.field7137 != 0) {
                var3.field6555[1] = arg1.method898((byte) -110);
                var3.field6546[1] = arg1.method898((byte) -107);
            }
        }
        if (var7) {
            int var9 = arg1.method898((byte) -101);
            int[] var10 = new int[] { class111.method773(var9, 15), class111.method773(var9, 240) >> 4, class111.method773(15, var9 >> 8), class111.method773(var9 >> 12, 15) };
            for (int var11 = 0; ~var11 > -5; ++var11) {
                if (var10[var11] != 15) {
                    var3.field6554[var10[var11]] = (short) arg1.method898((byte) -84);
                }
            }
        }
        if (var8) {
            int var12 = arg1.method842(arg2 ^ -2407);
            int[] var13 = new int[] { class111.method773(15, var12), class111.method773(var12, 248) >> 4 };
            for (int var14 = 0; var14 < 2; ++var14) {
                if (~var13[var14] != -16) {
                    var3.field6552[var13[var14]] = (short) arg1.method898((byte) -86);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)Ldg;")
    public final class430 method1680(int arg0) {
        ++field3584;
        return arg0 != 2 ? null : this.field3578;
    }

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "(I)D")
    public final double method1681(int arg0) {
        ++field3579;
        if (arg0 > -89) {
            this.field3589 = 56;
        }
        double var2 = this.field3592;
        if (this.field3578 != null) {
            var2 = this.field3578.method2583(20);
            if (var2 < 0.0D) {
                var2 = this.field3592;
            }
        }
        return (double) (-(256.0F / (float) class110.field1367)) + var2;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
    public final void method10(int arg0) {
        ++field3587;
        if (this.field3577 != null) {
            this.field3577.method4144();
        }
        if (this.field3591 != null) {
            this.field3591.method4144();
        }
        this.field3590.method4144();
        if (arg0 != 12056) {
            this.field3589 = 39;
        }
        this.field3581.method4144();
        if (this.field3578 != null) {
            this.field3578.method2589((byte) -34);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V")
    public static final void method1682(int arg0, int arg1) {
        ++field3583;
        class678 var2 = class630.method3597(29636, arg0, (long) arg1);
        var2.method3836((byte) -72);
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)I")
    public final int method1683(byte arg0) {
        if (arg0 != -67) {
            return -9;
        } else {
            ++field3586;
            return this.field3578 == null ? 0 : this.field3578.method2587(98);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILjagtheora/ogg/OggPacket;)V")
    public final void method2(int arg0, OggPacket arg1) {
        if (arg0 != 0) {
            this.method1680(88);
        }
        ++field3588;
        if (~super.field3438 > -4) {
            int var6 = this.field3581.headerIn(this.field3590, arg1);
            if (~var6 > -1) {
                throw new IllegalStateException(String.valueOf(var6));
            } else if (~super.field3438 == -3) {
                if (~this.field3581.channels >= -3 && ~this.field3581.channels <= -2) {
                    this.field3591 = new DSPState(this.field3581);
                    this.field3577 = new VorbisBlock(this.field3591);
                    this.field3585 = new class549(this.field3581.rate, class110.field1367);
                    this.field3578 = new class430(this.field3581.channels);
                } else {
                    throw new RuntimeException(String.valueOf(this.field3581.channels));
                }
            }
        } else {
            if (this.field3577.synthesis(arg1) == 0) {
                this.field3591.blockIn(this.field3577);
            }
            float[][] var3 = this.field3591.pcmOut(this.field3581.channels);
            this.field3592 = this.field3591.granuleTime();
            if (this.field3592 == -1.0D) {
                this.field3592 = (double) ((float) this.field3589 / (float) this.field3581.rate);
            }
            this.field3591.read(var3[0].length);
            this.field3589 += var3[0].length;
            class646 var4 = this.field3578.method2582(var3[0].length, this.field3592, true);
            class389.method2382((byte) 113, var4.field9105, var3);
            for (int var5 = 0; ~var5 > ~this.field3581.channels; ++var5) {
                var4.field9105[var5] = this.field3585.method3189(var4.field9105[var5], (byte) 20);
            }
            this.field3578.method2580(var4, true);
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class255(OggStreamState arg0) {
        super(arg0);
    }
}
