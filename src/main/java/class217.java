import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class217 extends class243 {

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public int field3634 = 0;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    private int field3640 = 0;

    @OriginalMember(owner = "client!jf", name = "I", descriptor = "Z")
    public boolean field3654 = false;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "I")
    private int field3644 = 0;

    @OriginalMember(owner = "client!jf", name = "J", descriptor = "B")
    private byte field3655 = 0;

    @OriginalMember(owner = "client!jf", name = "U", descriptor = "B")
    private byte field3665 = 0;

    @OriginalMember(owner = "client!jf", name = "X", descriptor = "[I")
    private int[] field3668;

    @OriginalMember(owner = "client!jf", name = "T", descriptor = "[I")
    public int[] field3664;

    @OriginalMember(owner = "client!jf", name = "K", descriptor = "[I")
    public int[] field3656;

    @OriginalMember(owner = "client!jf", name = "Y", descriptor = "[I")
    public int[] field3669;

    @OriginalMember(owner = "client!jf", name = "A", descriptor = "[I")
    private int[] field3647;

    @OriginalMember(owner = "client!jf", name = "R", descriptor = "[S")
    private short[] field3662;

    @OriginalMember(owner = "client!jf", name = "S", descriptor = "[S")
    private short[] field3663;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "[S")
    private short[] field3645;

    @OriginalMember(owner = "client!jf", name = "P", descriptor = "[S")
    private short[] field3660;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "[F")
    private float[] field3633;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "[F")
    private float[] field3638;

    @OriginalMember(owner = "client!jf", name = "E", descriptor = "[S")
    private short[] field3651;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "[B")
    private byte[] field3632;

    @OriginalMember(owner = "client!jf", name = "H", descriptor = "[S")
    private short[] field3653;

    @OriginalMember(owner = "client!jf", name = "Q", descriptor = "[S")
    private short[] field3661;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "[S")
    private short[] field3643;

    @OriginalMember(owner = "client!jf", name = "N", descriptor = "[S")
    private short[] field3658;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "[B")
    private byte[] field3635;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "Lcg;")
    public class38 field3639;

    @OriginalMember(owner = "client!jf", name = "B", descriptor = "Lff;")
    public class48 field3648;

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "Lff;")
    private class48 field3646;

    @OriginalMember(owner = "client!jf", name = "F", descriptor = "Lff;")
    private class48 field3652;

    @OriginalMember(owner = "client!jf", name = "L", descriptor = "Lff;")
    private class48 field3657;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "Lff;")
    private class48 field3642;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "S")
    private short field3641;

    @OriginalMember(owner = "client!jf", name = "Z", descriptor = "S")
    private short field3670;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "[S")
    private short[] field3637;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "[I")
    private int[] field3631;

    @OriginalMember(owner = "client!jf", name = "D", descriptor = "Lkh;")
    private static class13 field3650 = new class13(10000);

    @OriginalMember(owner = "client!jf", name = "ab", descriptor = "Ljf;")
    private static class217 field3671 = new class217();

    @OriginalMember(owner = "client!jf", name = "cb", descriptor = "Ljf;")
    private static class217 field3673 = new class217();

    @OriginalMember(owner = "client!jf", name = "db", descriptor = "Ljf;")
    private static class217 field3674 = new class217();

    @OriginalMember(owner = "client!jf", name = "eb", descriptor = "Ljf;")
    private static class217 field3675 = new class217();

    @OriginalMember(owner = "client!jf", name = "hb", descriptor = "[I")
    private static int[] field3678 = new int[1];

    @OriginalMember(owner = "client!jf", name = "mb", descriptor = "[I")
    private static int[] field3683 = new int[1];

    @OriginalMember(owner = "client!jf", name = "fb", descriptor = "F")
    private static float field3676;

    @OriginalMember(owner = "client!jf", name = "ib", descriptor = "F")
    private static float field3679;

    @OriginalMember(owner = "client!jf", name = "kb", descriptor = "F")
    private static float field3681;

    @OriginalMember(owner = "client!jf", name = "lb", descriptor = "F")
    private static float field3682;

    @OriginalMember(owner = "client!jf", name = "nb", descriptor = "F")
    private static float field3684;

    @OriginalMember(owner = "client!jf", name = "ob", descriptor = "F")
    private static float field3685;

    @OriginalMember(owner = "client!jf", name = "gb", descriptor = "I")
    private static int field3677;

    @OriginalMember(owner = "client!jf", name = "jb", descriptor = "I")
    private static int field3680;

    @OriginalMember(owner = "client!jf", name = "pb", descriptor = "I")
    private static int field3686;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "Lul;")
    private class39 field3636;

    @OriginalMember(owner = "client!jf", name = "V", descriptor = "Lqc;")
    private class4 field3666;

    @OriginalMember(owner = "client!jf", name = "bb", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3672;

    @OriginalMember(owner = "client!jf", name = "W", descriptor = "[J")
    private static long[] field3667;

    @OriginalMember(owner = "client!jf", name = "C", descriptor = "[[I")
    private int[][] field3649;

    @OriginalMember(owner = "client!jf", name = "O", descriptor = "[[I")
    private int[][] field3659;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([SI)[S", line = 7)
    private static final short[] method1523(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class95.method714(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "()V", line = 14)
    private final void method1524() {
        if (field3650.field254.length < this.field3644 * 12) {
            field3650 = new class13((this.field3644 + 100) * 12);
        } else {
            field3650.field281 = 0;
        }
        if (class123.field2221) {
            for (int var1 = 0; var1 < this.field3640; var1++) {
                field3650.method128((byte) 108, this.field3653[var1]);
                field3650.method128((byte) -114, this.field3661[var1]);
                field3650.method128((byte) 120, this.field3643[var1]);
            }
        } else {
            for (int var2 = 0; var2 < this.field3640; var2++) {
                field3650.method137(this.field3653[var2], (byte) 73);
                field3650.method137(this.field3661[var2], (byte) -70);
                field3650.method137(this.field3643[var2], (byte) 92);
            }
        }
        if (!class123.field2227) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field3650.field281);
            var5.put(field3650.field254, 0, field3650.field281);
            var5.flip();
            this.field3642.field793 = true;
            this.field3642.field806 = var5;
            this.field3642.field804 = null;
            return;
        }
        class39 var3 = new class39();
        ByteBuffer var4 = ByteBuffer.wrap(field3650.field254, 0, field3650.field281);
        var3.method305(var4);
        this.field3642.field793 = true;
        this.field3642.field806 = null;
        this.field3642.field804 = var3;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([FI)[F", line = 74)
    private static final float[] method1525(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class95.method715(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "()V", line = 81)
    public final void method31() {
        for (int var1 = 0; var1 < this.field3634; var1++) {
            int var2 = this.field3664[var1];
            this.field3664[var1] = this.field3669[var1];
            this.field3669[var1] = -var2;
        }
        this.field3639.field613 = false;
        this.field3648.field793 = false;
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)V", line = 95)
    public final void method1526(int arg0) {
        this.field3641 = (short) arg0;
        this.field3646.field793 = false;
    }

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "()I", line = 102)
    public final int method19() {
        if (!this.field3639.field613) {
            this.method1544();
        }
        return this.field3639.field606;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZZ)Lam;", line = 109)
    public final class243 method34(boolean arg0, boolean arg1) {
        return this.method1539(arg0, arg1, field3673, field3671);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ISIB)I", line = 113)
    private static final int method1527(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class50.field829[class5.method50(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class50.field816.method658(arg1 & 0xFFFF, 117);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg2 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) + ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class50.field816.method662(arg1 & 0xFFFF, (byte) 91);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF0000) >> 16) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = ((var4 & 0xFF00) >> 8) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var12 >> 8) + (var10 & 0xFF00 << 8) + (var11 & 0xFF00);
            }
        }
        return (var4 << 8) + (255 - (arg3 & 0xFF));
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(III)V", line = 173)
    public final void method29(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3634; var4++) {
            this.field3664[var4] += arg0;
            this.field3656[var4] += arg1;
            this.field3669[var4] += arg2;
        }
        this.field3639.field613 = false;
        this.field3648.field793 = false;
    }

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "()I", line = 186)
    public final int method1528() {
        return this.field3670;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Le;IJIIIIFF)S", line = 191)
    private final short method1529(class150 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field3668[arg1];
        int var12 = this.field3668[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field3637[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field3667[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field3637[var13] = (short) (this.field3644 + 1);
        field3667[var13] = arg2;
        this.field3662[this.field3644] = (short) arg3;
        this.field3663[this.field3644] = (short) arg4;
        this.field3645[this.field3644] = (short) arg5;
        this.field3660[this.field3644] = (short) arg6;
        this.field3633[this.field3644] = arg7;
        this.field3638[this.field3644] = arg8;
        return (short) (this.field3644++);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(SS)V", line = 228)
    public final void method1530(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3640; var3++) {
            if (this.field3658[var3] == arg0) {
                this.field3658[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class50.field816.method658(arg0 & 0xFFFF, -124);
            var5 = class50.field816.method662(arg0 & 0xFFFF, (byte) -113);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class50.field816.method658(arg1 & 0xFFFF, 38);
            var7 = class50.field816.method662(arg1 & 0xFFFF, (byte) -60);
        }
        if (var4 != var6 || var5 != var7) {
            this.field3646.field793 = false;
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "()Z", line = 262)
    public final boolean method1069() {
        return this.field3654 && this.field3664 != null && this.field3662 != null;
    }

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "(I)V", line = 268)
    public final void method1531(int arg0) {
        this.field3670 = (short) arg0;
        if (this.field3652 != null) {
            this.field3652.field793 = false;
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V", line = 3729)
    private class217() {
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Le;IIZ)V", line = 3732)
    public class217(class150 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field2657];
        this.field3668 = new int[arg0.field2653 + 1];
        for (int var6 = 0; var6 < arg0.field2657; var6++) {
            if ((arg0.field2643 == null || arg0.field2643[var6] != 2) && (arg0.field2672 == null || arg0.field2672[var6] == -1 || !class50.field816.method670(123, arg0.field2672[var6] & 0xFFFF))) {
                var5[this.field3640++] = var6;
                this.field3668[arg0.field2664[var6]]++;
                this.field3668[arg0.field2669[var6]]++;
                this.field3668[arg0.field2679[var6]]++;
            }
        }
        long[] var7 = new long[this.field3640];
        for (int var8 = 0; var8 < this.field3640; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field2672 != null) {
                var14 = arg0.field2672[var9];
                if (var14 != -1) {
                    var12 = class50.field816.method664(var14 & 0xFFFF, 54);
                    var13 = class50.field816.method661(65535, var14 & 0xFFFF);
                }
            }
            boolean var15 = arg0.field2681 != null && arg0.field2681[var9] != 0 || var14 != -1 && !class50.field816.method665((byte) -114, var14 & 0xFFFF);
            if ((arg3 || var15) && arg0.field2647 != null) {
                var10 += arg0.field2647[var9] << 17;
            }
            if (var15) {
                var10 += 65536;
            }
            int var16 = ((var12 & 0xFF) << 8) + var10;
            int var17 = (var13 & 0xFF) + var16;
            int var18 = ((var14 & 0xFFFF) << 16) + var11;
            int var19 = (var8 & 0xFFFF) + var18;
            var7[var8] = ((long) var17 << 32) + (long) var19;
        }
        class244.method1773(var5, var7, 0);
        this.field3634 = arg0.field2653;
        this.field3664 = arg0.field2685;
        this.field3656 = arg0.field2652;
        this.field3669 = arg0.field2668;
        this.field3647 = arg0.field2637;
        int var20 = this.field3640 * 3;
        this.field3662 = new short[var20];
        this.field3663 = new short[var20];
        this.field3645 = new short[var20];
        this.field3660 = new short[var20];
        this.field3633 = new float[var20];
        this.field3638 = new float[var20];
        this.field3651 = new short[this.field3640];
        this.field3632 = new byte[this.field3640];
        this.field3653 = new short[this.field3640];
        this.field3661 = new short[this.field3640];
        this.field3643 = new short[this.field3640];
        this.field3658 = new short[this.field3640];
        if (arg0.field2660 != null) {
            this.field3635 = new byte[this.field3640];
        }
        this.field3639 = new class38();
        this.field3648 = new class48();
        this.field3646 = new class48();
        if (class274.field4701) {
            this.field3652 = new class48();
        }
        this.field3657 = new class48();
        this.field3642 = new class48();
        this.field3641 = (short) arg1;
        this.field3670 = (short) arg2;
        this.field3637 = new short[var20];
        field3667 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < arg0.field2653; var22++) {
            int var23 = this.field3668[var22];
            this.field3668[var22] = var21;
            var21 += var23;
        }
        this.field3668[arg0.field2653] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field2649 != null) {
            int var28 = arg0.field2673;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            for (int var36 = 0; var36 < this.field3640; var36++) {
                int var37 = var5[var36];
                if (arg0.field2649[var37] != -1) {
                    int var38 = arg0.field2649[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field2664[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field2669[var37];
                        } else {
                            var40 = arg0.field2679[var37];
                        }
                        int var41 = arg0.field2685[var40];
                        int var42 = arg0.field2652[var40];
                        int var43 = arg0.field2668[var40];
                        if (var41 < var29[var38]) {
                            var29[var38] = var41;
                        }
                        if (var41 > var30[var38]) {
                            var30[var38] = var41;
                        }
                        if (var42 < var31[var38]) {
                            var31[var38] = var42;
                        }
                        if (var42 > var32[var38]) {
                            var32[var38] = var42;
                        }
                        if (var43 < var33[var38]) {
                            var33[var38] = var43;
                        }
                        if (var43 > var34[var38]) {
                            var34[var38] = var43;
                        }
                    }
                }
            }
            var24 = new int[var28];
            var25 = new int[var28];
            var26 = new int[var28];
            var27 = new float[var28][];
            for (int var44 = 0; var44 < var28; var44++) {
                byte var45 = arg0.field2650[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field2641[var44];
                        if (var46 == 0) {
                            var47 = 1.0F;
                            var48 = 1.0F;
                        } else if (var46 > 0) {
                            var47 = 1.0F;
                            var48 = (float) var46 / 1024.0F;
                        } else {
                            var48 = 1.0F;
                            var47 = (float) (-var46) / 1024.0F;
                        }
                        var49 = 64.0F / (float) (arg0.field2671[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field2641[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field2671[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field2674[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field2641[var44] / 1024.0F;
                        var49 = (float) arg0.field2671[var44] / 1024.0F;
                        var48 = (float) arg0.field2674[var44] / 1024.0F;
                    }
                    var27[var44] = method1541(arg0.field2640[var44], arg0.field2656[var44], arg0.field2663[var44], arg0.field2680[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field3640; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field2678[var51] & 0xFFFF;
            short var53;
            if (arg0.field2672 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field2672[var51];
            }
            int var54;
            if (arg0.field2649 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field2649[var51];
            }
            int var55;
            if (arg0.field2681 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field2681[var51] & 0xFF;
            }
            float var56 = 0.0F;
            float var57 = 0.0F;
            float var58 = 0.0F;
            float var59 = 0.0F;
            float var60 = 0.0F;
            float var61 = 0.0F;
            byte var62 = 0;
            byte var63 = 0;
            int var64 = 0;
            if (var53 != -1) {
                if (var54 == -1) {
                    var56 = 0.0F;
                    var57 = 1.0F;
                    var58 = 1.0F;
                    var59 = 1.0F;
                    var62 = 1;
                    var60 = 0.0F;
                    var61 = 0.0F;
                    var63 = 2;
                } else {
                    var54 &= 0xFF;
                    byte var65 = arg0.field2650[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field2664[var51];
                        int var67 = arg0.field2669[var51];
                        int var68 = arg0.field2679[var51];
                        short var69 = arg0.field2640[var54];
                        short var70 = arg0.field2656[var54];
                        short var71 = arg0.field2663[var54];
                        float var72 = (float) arg0.field2685[var69];
                        float var73 = (float) arg0.field2652[var69];
                        float var74 = (float) arg0.field2668[var69];
                        float var75 = (float) arg0.field2685[var70] - var72;
                        float var76 = (float) arg0.field2652[var70] - var73;
                        float var77 = (float) arg0.field2668[var70] - var74;
                        float var78 = (float) arg0.field2685[var71] - var72;
                        float var79 = (float) arg0.field2652[var71] - var73;
                        float var80 = (float) arg0.field2668[var71] - var74;
                        float var81 = (float) arg0.field2685[var66] - var72;
                        float var82 = (float) arg0.field2652[var66] - var73;
                        float var83 = (float) arg0.field2668[var66] - var74;
                        float var84 = (float) arg0.field2685[var67] - var72;
                        float var85 = (float) arg0.field2652[var67] - var73;
                        float var86 = (float) arg0.field2668[var67] - var74;
                        float var87 = (float) arg0.field2685[var68] - var72;
                        float var88 = (float) arg0.field2652[var68] - var73;
                        float var89 = (float) arg0.field2668[var68] - var74;
                        float var90 = var76 * var80 - var77 * var79;
                        float var91 = var77 * var78 - var75 * var80;
                        float var92 = var75 * var79 - var76 * var78;
                        float var93 = var79 * var92 - var80 * var91;
                        float var94 = var80 * var90 - var78 * var92;
                        float var95 = var78 * var91 - var79 * var90;
                        float var96 = 1.0F / (var77 * var95 + var75 * var93 + var76 * var94);
                        var56 = (var83 * var95 + var81 * var93 + var82 * var94) * var96;
                        var58 = (var86 * var95 + var84 * var93 + var85 * var94) * var96;
                        var60 = (var89 * var95 + var87 * var93 + var88 * var94) * var96;
                        float var97 = var76 * var92 - var77 * var91;
                        float var98 = var77 * var90 - var75 * var92;
                        float var99 = var75 * var91 - var76 * var90;
                        float var100 = 1.0F / (var80 * var99 + var78 * var97 + var79 * var98);
                        var57 = (var83 * var99 + var81 * var97 + var82 * var98) * var100;
                        var59 = (var86 * var99 + var84 * var97 + var85 * var98) * var100;
                        var61 = (var89 * var99 + var87 * var97 + var88 * var98) * var100;
                    } else {
                        int var101 = arg0.field2664[var51];
                        int var102 = arg0.field2669[var51];
                        int var103 = arg0.field2679[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field2651[var54];
                        float var109 = (float) arg0.field2655[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field2674[var54] & 0xFFFF) / 1024.0F;
                            method1550(arg0.field2685[var101], arg0.field2652[var101], arg0.field2668[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field3679;
                            var57 = field3685;
                            method1550(arg0.field2685[var102], arg0.field2652[var102], arg0.field2668[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field3679;
                            var59 = field3685;
                            method1550(arg0.field2685[var103], arg0.field2652[var103], arg0.field2668[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field3679;
                            var61 = field3685;
                            float var111 = var110 / 2.0F;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > var111) {
                                    var58 -= var110;
                                    var62 = 1;
                                } else if (var56 - var58 > var111) {
                                    var58 += var110;
                                    var62 = 2;
                                }
                                if (var60 - var56 > var111) {
                                    var60 -= var110;
                                    var63 = 1;
                                } else if (var56 - var60 > var111) {
                                    var60 += var110;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > var111) {
                                    var59 -= var110;
                                    var62 = 1;
                                } else if (var57 - var59 > var111) {
                                    var59 += var110;
                                    var62 = 2;
                                }
                                if (var61 - var57 > var111) {
                                    var61 -= var110;
                                    var63 = 1;
                                } else if (var57 - var61 > var111) {
                                    var61 += var110;
                                    var63 = 2;
                                }
                            }
                        } else if (var65 == 2) {
                            float var112 = (float) arg0.field2677[var54] / 256.0F;
                            float var113 = (float) arg0.field2644[var54] / 256.0F;
                            int var114 = arg0.field2685[var102] - arg0.field2685[var101];
                            int var115 = arg0.field2652[var102] - arg0.field2652[var101];
                            int var116 = arg0.field2668[var102] - arg0.field2668[var101];
                            int var117 = arg0.field2685[var103] - arg0.field2685[var101];
                            int var118 = arg0.field2652[var103] - arg0.field2652[var101];
                            int var119 = arg0.field2668[var103] - arg0.field2668[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field2641[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field2671[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field2674[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method1551(var126, var127, var128);
                            method1547(arg0.field2685[var101], arg0.field2652[var101], arg0.field2668[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field3684;
                            var57 = field3676;
                            method1547(arg0.field2685[var102], arg0.field2652[var102], arg0.field2668[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field3684;
                            var59 = field3676;
                            method1547(arg0.field2685[var103], arg0.field2652[var103], arg0.field2668[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field3684;
                            var61 = field3676;
                        } else if (var65 == 3) {
                            method1556(arg0.field2685[var101], arg0.field2652[var101], arg0.field2668[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field3682;
                            var57 = field3681;
                            method1556(arg0.field2685[var102], arg0.field2652[var102], arg0.field2668[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field3682;
                            var59 = field3681;
                            method1556(arg0.field2685[var103], arg0.field2652[var103], arg0.field2668[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field3682;
                            var61 = field3681;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > 0.5F) {
                                    var58--;
                                    var62 = 1;
                                } else if (var56 - var58 > 0.5F) {
                                    var58++;
                                    var62 = 2;
                                }
                                if (var60 - var56 > 0.5F) {
                                    var60--;
                                    var63 = 1;
                                } else if (var56 - var60 > 0.5F) {
                                    var60++;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > 0.5F) {
                                    var59--;
                                    var62 = 1;
                                } else if (var57 - var59 > 0.5F) {
                                    var59++;
                                    var62 = 2;
                                }
                                if (var61 - var57 > 0.5F) {
                                    var61--;
                                    var63 = 1;
                                } else if (var57 - var61 > 0.5F) {
                                    var61++;
                                    var63 = 2;
                                }
                            }
                        }
                    }
                }
            }
            arg0.method1083();
            byte var129;
            if (arg0.field2643 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field2643[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field2664[var51];
                class42 var133 = arg0.field2670[var132];
                this.field3653[var50] = this.method1529(arg0, var132, var130, var133.field683, var133.field694, var133.field688, var133.field685, var56, var57);
                int var134 = arg0.field2669[var51];
                class42 var135 = arg0.field2670[var134];
                this.field3661[var50] = this.method1529(arg0, var134, (long) var62 + var130, var135.field683, var135.field694, var135.field688, var135.field685, var58, var59);
                int var136 = arg0.field2679[var51];
                class42 var137 = arg0.field2670[var136];
                this.field3643[var50] = this.method1529(arg0, var136, (long) var63 + var130, var137.field683, var137.field694, var137.field688, var137.field685, var60, var61);
            } else if (var129 == 1) {
                class272 var138 = arg0.field2675[var51];
                long var139 = (long) ((var54 << 2) + (var138.field4676 > 0 ? 1024 : 2048) + (var138.field4673 + 256 << 12) + (var138.field4668 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field3653[var50] = this.method1529(arg0, arg0.field2664[var51], var139, var138.field4676, var138.field4673, var138.field4668, 0, var56, var57);
                this.field3661[var50] = this.method1529(arg0, arg0.field2669[var51], (long) var62 + var139, var138.field4676, var138.field4673, var138.field4668, 0, var58, var59);
                this.field3643[var50] = this.method1529(arg0, arg0.field2679[var51], (long) var63 + var139, var138.field4676, var138.field4673, var138.field4668, 0, var60, var61);
            }
            if (arg0.field2672 == null) {
                this.field3658[var50] = -1;
            } else {
                this.field3658[var50] = arg0.field2672[var51];
            }
            if (this.field3635 != null) {
                this.field3635[var50] = (byte) arg0.field2660[var51];
            }
            this.field3651[var50] = arg0.field2678[var51];
            if (arg0.field2681 != null) {
                this.field3632[var50] = arg0.field2681[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field3640; var143++) {
            short var144 = this.field3658[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field3631 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field3640; var147++) {
            short var148 = this.field3658[var147];
            if (var146 != var148) {
                this.field3631[var145++] = var147;
                var146 = var148;
            }
        }
        this.field3631[var145] = this.field3640;
        field3667 = null;
        this.field3662 = method1523(this.field3662, this.field3644);
        this.field3663 = method1523(this.field3663, this.field3644);
        this.field3645 = method1523(this.field3645, this.field3644);
        this.field3660 = method1523(this.field3660, this.field3644);
        this.field3633 = method1525(this.field3633, this.field3644);
        this.field3638 = method1525(this.field3638, this.field3644);
    }

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "()V", line = 281)
    public final void method45() {
        for (int var1 = 0; var1 < this.field3634; var1++) {
            this.field3664[var1] = -this.field3664[var1];
            this.field3669[var1] = -this.field3669[var1];
        }
        this.field3639.field613 = false;
        this.field3648.field793 = false;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILjf;[[I[[IIII)V", line = 296)
    public final void method1532(int arg0, int arg1, class217 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field3639.field613) {
            arg2.method1544();
        }
        int var9 = arg2.field3639.field610 + arg5;
        int var10 = arg2.field3639.field606 + arg5;
        int var11 = arg2.field3639.field607 + arg7;
        int var12 = arg2.field3639.field609 + arg7;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var9 < 0 || var10 + 128 >> 7 >= arg3.length || var11 < 0 || var12 + 128 >> 7 >= arg3[0].length) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg4 == null) {
                return;
            }
            if (var9 < 0 || var10 + 128 >> 7 >= arg4.length || var11 < 0 || var12 + 128 >> 7 >= arg4[0].length) {
                return;
            }
        } else {
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            int var15 = var11 >> 7;
            int var16 = var12 + 127 >> 7;
            if (arg3[var13][var15] == arg6 && arg3[var14][var15] == arg6 && arg3[var13][var16] == arg6 && arg3[var14][var16] == arg6) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var17 = 0; var17 < this.field3634; var17++) {
                int var18 = this.field3664[var17] + arg5;
                int var19 = this.field3669[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field3656[var17] = this.field3656[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field3639.field608;
            for (int var28 = 0; var28 < this.field3634; var28++) {
                int var29 = (this.field3656[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field3664[var28] + arg5;
                    int var31 = this.field3669[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field3656[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method1772(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field3639.field611 - arg2.field3639.field608;
            for (int var42 = 0; var42 < this.field3634; var42++) {
                int var43 = this.field3664[var42] + arg5;
                int var44 = this.field3669[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field3656[var42] = var51 + this.field3656[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field3639.field611 - arg2.field3639.field608;
            for (int var53 = 0; var53 < this.field3634; var53++) {
                int var54 = this.field3664[var53] + arg5;
                int var55 = this.field3669[var53] + arg7;
                int var56 = var54 & 0x7F;
                int var57 = var55 & 0x7F;
                int var58 = var54 >> 7;
                int var59 = var55 >> 7;
                int var60 = (128 - var56) * arg3[var58][var59] + arg3[var58 + 1][var59] * var56 >> 7;
                int var61 = (128 - var56) * arg3[var58][var59 + 1] + arg3[var58 + 1][var59 + 1] * var56 >> 7;
                int var62 = (128 - var57) * var60 + var57 * var61 >> 7;
                int var63 = (128 - var56) * arg4[var58][var59] + arg4[var58 + 1][var59] * var56 >> 7;
                int var64 = (128 - var56) * arg4[var58][var59 + 1] + arg4[var58 + 1][var59 + 1] * var56 >> 7;
                int var65 = (128 - var57) * var63 + var57 * var64 >> 7;
                int var66 = var62 - var65;
                this.field3656[var53] = ((this.field3656[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field3648.field793 = false;
        this.field3639.field613 = false;
    }

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "()V", line = 493)
    public static final void method1533() {
        field3671 = new class217();
        field3673 = new class217();
        field3674 = new class217();
        field3675 = new class217();
    }

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "()V", line = 499)
    public final void method1534() {
        if (this.field3662 == null) {
            this.method21();
            return;
        }
        for (int var1 = 0; var1 < this.field3634; var1++) {
            int var2 = this.field3669[var1];
            this.field3669[var1] = this.field3664[var1];
            this.field3664[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field3644; var3++) {
            short var4 = this.field3645[var3];
            this.field3645[var3] = this.field3662[var3];
            this.field3662[var3] = (short) (-var4);
        }
        this.field3639.field613 = false;
        this.field3648.field793 = false;
        if (this.field3652 != null) {
            this.field3652.field793 = false;
        }
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)V", line = 538)
    public final void method42(int arg0) {
        int var2 = class50.field826[arg0];
        int var3 = class50.field820[arg0];
        for (int var4 = 0; var4 < this.field3634; var4++) {
            int var5 = this.field3656[var4] * var3 - this.field3669[var4] * var2 >> 16;
            this.field3669[var4] = this.field3669[var4] * var3 + this.field3656[var4] * var2 >> 16;
            this.field3656[var4] = var5;
        }
        this.field3639.field613 = false;
        this.field3648.field793 = false;
    }

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "()I", line = 557)
    public final int method55() {
        if (!this.field3639.field613) {
            this.method1544();
        }
        return this.field3639.field607;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZZZZZZZZZZZ)Ljf;", line = 565)
    public final class217 method1535(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class217 var12 = new class217();
        var12.field3634 = this.field3634;
        var12.field3644 = this.field3644;
        var12.field3640 = this.field3640;
        if (arg0) {
            var12.field3664 = this.field3664;
            var12.field3669 = this.field3669;
        } else {
            var12.field3664 = class71.method588(0, this.field3664);
            var12.field3669 = class71.method588(0, this.field3669);
        }
        if (arg1) {
            var12.field3656 = this.field3656;
        } else {
            var12.field3656 = class71.method588(0, this.field3656);
        }
        if (arg0 && arg1) {
            var12.field3648 = this.field3648;
            var12.field3639 = this.field3639;
        } else {
            var12.field3648 = new class48();
            var12.field3639 = new class38();
        }
        if (arg2) {
            var12.field3651 = this.field3651;
        } else {
            var12.field3651 = class310.method2148(0, this.field3651);
        }
        if (arg3) {
            var12.field3632 = this.field3632;
        } else {
            var12.field3632 = class48.method355(this.field3632, 8945);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class274.field4701) {
            var12.field3646 = new class48();
        } else {
            var12.field3646 = this.field3646;
        }
        if (arg5) {
            var12.field3662 = this.field3662;
            var12.field3663 = this.field3663;
            var12.field3645 = this.field3645;
            var12.field3660 = this.field3660;
        } else {
            var12.field3662 = class310.method2148(0, this.field3662);
            var12.field3663 = class310.method2148(0, this.field3663);
            var12.field3645 = class310.method2148(0, this.field3645);
            var12.field3660 = class310.method2148(0, this.field3660);
        }
        if (!class274.field4701) {
            var12.field3652 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field3652 = this.field3652;
        } else {
            var12.field3652 = new class48();
        }
        if (arg8) {
            var12.field3633 = this.field3633;
            var12.field3638 = this.field3638;
            var12.field3657 = this.field3657;
        } else {
            var12.field3633 = class85.method652(this.field3633, 0);
            var12.field3638 = class85.method652(this.field3638, 0);
            var12.field3657 = new class48();
        }
        if (arg9) {
            var12.field3653 = this.field3653;
            var12.field3661 = this.field3661;
            var12.field3643 = this.field3643;
            var12.field3642 = this.field3642;
        } else {
            var12.field3653 = class310.method2148(0, this.field3653);
            var12.field3661 = class310.method2148(0, this.field3661);
            var12.field3643 = class310.method2148(0, this.field3643);
            var12.field3642 = new class48();
        }
        if (arg10) {
            var12.field3658 = this.field3658;
        } else {
            var12.field3658 = class310.method2148(0, this.field3658);
        }
        var12.field3647 = this.field3647;
        var12.field3659 = this.field3659;
        var12.field3635 = this.field3635;
        var12.field3649 = this.field3649;
        var12.field3631 = this.field3631;
        var12.field3637 = this.field3637;
        var12.field3668 = this.field3668;
        var12.field3641 = this.field3641;
        var12.field3670 = this.field3670;
        return var12;
    }

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "()V", line = 701)
    public final void method1536() {
        for (int var1 = 0; var1 < this.field3634; var1++) {
            this.field3669[var1] = -this.field3669[var1];
        }
        if (this.field3645 != null) {
            for (int var2 = 0; var2 < this.field3644; var2++) {
                this.field3645[var2] = (short) (-this.field3645[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field3640; var3++) {
            short var4 = this.field3653[var3];
            this.field3653[var3] = this.field3643[var3];
            this.field3643[var3] = var4;
        }
        this.field3639.field613 = false;
        this.field3648.field793 = false;
        if (this.field3652 != null) {
            this.field3652.field793 = false;
        }
        this.field3642.field793 = false;
    }

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "()I", line = 738)
    public final int method30() {
        if (!this.field3639.field613) {
            this.method1544();
        }
        return this.field3639.field609;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lpf;ILpf;I[IZ)V", line = 744)
    public final void method36(class78 arg0, int arg1, class78 arg2, int arg3, int[] arg4, boolean arg5) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method46(arg0, arg1, arg5);
            return;
        }
        class170 var7 = arg0.field1465[arg1];
        class170 var8 = arg2.field1465[arg3];
        class72 var9 = var7.field2956;
        for (int var10 = 0; var10 < this.field3634; var10++) {
            this.field3664[var10] <<= 0x4;
            this.field3656[var10] <<= 0x4;
            this.field3669[var10] <<= 0x4;
        }
        field3686 = 0;
        field3677 = 0;
        field3680 = 0;
        byte var11 = 0;
        int var20 = var11 + 1;
        int var12 = arg4[var11];
        for (int var13 = 0; var13 < var7.field2957; var13++) {
            short var14 = var7.field2954[var13];
            while (var14 > var12) {
                var12 = arg4[var20++];
            }
            if (var12 != var14 || var9.field1384[var14] == 0) {
                if (var7.field2955[var13] != -1) {
                    this.method1542(0, var9.field1395[var7.field2955[var13]], 0, 0, 0, arg5);
                }
                this.method1542(var9.field1384[var14], var9.field1395[var14], var7.field2951[var13], var7.field2958[var13], var7.field2953[var13], arg5);
            }
        }
        field3686 = 0;
        field3677 = 0;
        field3680 = 0;
        byte var15 = 0;
        int var21 = var15 + 1;
        int var16 = arg4[var15];
        for (int var17 = 0; var17 < var8.field2957; var17++) {
            short var18 = var8.field2954[var17];
            while (var18 > var16) {
                var16 = arg4[var21++];
            }
            if (var16 == var18 || var9.field1384[var18] == 0) {
                if (var8.field2955[var17] != -1) {
                    this.method1542(0, var9.field1395[var8.field2955[var17]], 0, 0, 0, arg5);
                }
                this.method1542(var9.field1384[var18], var9.field1395[var18], var8.field2951[var17], var8.field2958[var17], var8.field2953[var17], arg5);
            }
        }
        for (int var19 = 0; var19 < this.field3634; var19++) {
            this.field3664[var19] >>= 0x4;
            this.field3656[var19] >>= 0x4;
            this.field3669[var19] >>= 0x4;
        }
        this.field3639.field613 = false;
        this.field3648.field793 = false;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIII)V", line = 839)
    private final void method1537(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field3686 = 0;
            field3677 = 0;
            field3680 = 0;
            for (int var6 = 0; var6 < this.field3634; var6++) {
                field3686 += this.field3664[var6];
                field3677 += this.field3656[var6];
                field3680 += this.field3669[var6];
                var5++;
            }
            if (var5 > 0) {
                field3686 = field3686 / var5 + arg1;
                field3677 = field3677 / var5 + arg2;
                field3680 = field3680 / var5 + arg3;
            } else {
                field3686 = arg1;
                field3677 = arg2;
                field3680 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field3634; var7++) {
                this.field3664[var7] += arg1;
                this.field3656[var7] += arg2;
                this.field3669[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field3634; var8++) {
                this.field3664[var8] -= field3686;
                this.field3656[var8] -= field3677;
                this.field3669[var8] -= field3680;
                if (arg3 != 0) {
                    int var9 = class50.field826[arg3];
                    int var10 = class50.field820[arg3];
                    int var11 = this.field3664[var8] * var10 + this.field3656[var8] * var9 + 32767 >> 16;
                    this.field3656[var8] = this.field3656[var8] * var10 + 32767 - this.field3664[var8] * var9 >> 16;
                    this.field3664[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class50.field826[arg1];
                    int var13 = class50.field820[arg1];
                    int var14 = this.field3656[var8] * var13 + 32767 - this.field3669[var8] * var12 >> 16;
                    this.field3669[var8] = this.field3669[var8] * var13 + this.field3656[var8] * var12 + 32767 >> 16;
                    this.field3656[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class50.field826[arg2];
                    int var16 = class50.field820[arg2];
                    int var17 = this.field3669[var8] * var15 + this.field3664[var8] * var16 + 32767 >> 16;
                    this.field3669[var8] = this.field3669[var8] * var16 + 32767 - this.field3664[var8] * var15 >> 16;
                    this.field3664[var8] = var17;
                }
                this.field3664[var8] += field3686;
                this.field3656[var8] += field3677;
                this.field3669[var8] += field3680;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field3634; var18++) {
                this.field3664[var18] -= field3686;
                this.field3656[var18] -= field3677;
                this.field3669[var18] -= field3680;
                this.field3664[var18] = this.field3664[var18] * arg1 / 128;
                this.field3656[var18] = this.field3656[var18] * arg2 / 128;
                this.field3669[var18] = this.field3669[var18] * arg3 / 128;
                this.field3664[var18] += field3686;
                this.field3656[var18] += field3677;
                this.field3669[var18] += field3680;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field3640; var19++) {
                int var20 = (this.field3632[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field3632[var19] = (byte) var20;
            }
            this.field3646.field793 = false;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZZZZZ)V", line = 994)
    private final void method1538(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field3648.field808 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field3646.field808 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field3652.field808 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field3657.field808 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field3650.field254.length < this.field3644 * var6) {
            field3650 = new class13((this.field3644 + 100) * var6);
        } else {
            field3650.field281 = 0;
        }
        if (arg1) {
            if (class123.field2221) {
                for (int var7 = 0; var7 < this.field3634; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field3664[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field3656[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field3669[var7]);
                    int var11 = this.field3668[var7];
                    int var12 = this.field3668[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field3637[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field3650.field281 = var6 * var14;
                        field3650.method128((byte) -111, var8);
                        field3650.method128((byte) -48, var9);
                        field3650.method128((byte) 120, var10);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field3634; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field3664[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field3656[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field3669[var15]);
                    int var19 = this.field3668[var15];
                    int var20 = this.field3668[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field3637[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field3650.field281 = var6 * var22;
                        field3650.method137(var16, (byte) 123);
                        field3650.method137(var17, (byte) 110);
                        field3650.method137(var18, (byte) 88);
                    }
                }
            }
        }
        if (arg2) {
            if (class274.field4701) {
                for (int var42 = 0; var42 < this.field3640; var42++) {
                    int var43 = method1527(this.field3651[var42], this.field3658[var42], this.field3641, this.field3632[var42]);
                    field3650.field281 = this.field3653[var42] * var6 + this.field3646.field808;
                    field3650.method128((byte) -92, var43);
                    field3650.field281 = this.field3661[var42] * var6 + this.field3646.field808;
                    field3650.method128((byte) 111, var43);
                    field3650.field281 = this.field3643[var42] * var6 + this.field3646.field808;
                    field3650.method128((byte) -39, var43);
                }
            } else {
                int var23 = (int) class52.field844[0];
                int var24 = (int) class52.field844[1];
                int var25 = (int) class52.field844[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field3641 * 1.3F);
                int var28 = this.field3670 * var26 >> 8;
                for (int var29 = 0; var29 < this.field3640; var29++) {
                    short var30 = this.field3653[var29];
                    short var31 = this.field3660[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field3645[var30] * var25 + this.field3663[var30] * var24 + this.field3662[var30] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field3645[var30] * var25 + this.field3663[var30] * var24 + this.field3662[var30] * var23) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field3660[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field3661[var29];
                    short var34 = this.field3660[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field3645[var33] * var25 + this.field3663[var33] * var24 + this.field3662[var33] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field3645[var33] * var25 + this.field3663[var33] * var24 + this.field3662[var33] * var23) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field3660[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field3643[var29];
                    short var37 = this.field3660[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field3645[var36] * var25 + this.field3663[var36] * var24 + this.field3662[var36] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field3645[var36] * var25 + this.field3663[var36] * var24 + this.field3662[var36] * var23) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field3660[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method1527(this.field3651[var29], this.field3658[var29], var32, this.field3632[var29]);
                    int var40 = method1527(this.field3651[var29], this.field3658[var29], var35, this.field3632[var29]);
                    int var41 = method1527(this.field3651[var29], this.field3658[var29], var38, this.field3632[var29]);
                    field3650.field281 = var6 * var30 + this.field3646.field808;
                    field3650.method128((byte) 112, var39);
                    field3650.field281 = var6 * var33 + this.field3646.field808;
                    field3650.method128((byte) 120, var40);
                    field3650.field281 = var6 * var36 + this.field3646.field808;
                    field3650.method128((byte) -31, var41);
                }
                this.field3662 = null;
                this.field3663 = null;
                this.field3645 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field3670;
            float var45 = 3.0F / (float) (this.field3670 / 2 + this.field3670);
            field3650.field281 = this.field3652.field808;
            if (class123.field2221) {
                for (int var46 = 0; var46 < this.field3644; var46++) {
                    short var47 = this.field3660[var46];
                    if (var47 == 0) {
                        field3650.method141((float) this.field3662[var46] * var45, -1731515408);
                        field3650.method141((float) this.field3663[var46] * var45, -1731515408);
                        field3650.method141((float) this.field3645[var46] * var45, -1731515408);
                    } else {
                        float var48 = var44 / (float) var47;
                        field3650.method141((float) this.field3662[var46] * var48, -1731515408);
                        field3650.method141((float) this.field3663[var46] * var48, -1731515408);
                        field3650.method141((float) this.field3645[var46] * var48, -1731515408);
                    }
                    field3650.field281 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field3644; var49++) {
                    short var50 = this.field3660[var49];
                    if (var50 == 0) {
                        field3650.method106((float) this.field3662[var49] * var45, true);
                        field3650.method106((float) this.field3663[var49] * var45, true);
                        field3650.method106((float) this.field3645[var49] * var45, true);
                    } else {
                        float var51 = var44 / (float) var50;
                        field3650.method106((float) this.field3662[var49] * var51, true);
                        field3650.method106((float) this.field3663[var49] * var51, true);
                        field3650.method106((float) this.field3645[var49] * var51, true);
                    }
                    field3650.field281 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field3650.field281 = this.field3657.field808;
            if (class123.field2221) {
                for (int var52 = 0; var52 < this.field3644; var52++) {
                    field3650.method141(this.field3633[var52], -1731515408);
                    field3650.method141(this.field3638[var52], -1731515408);
                    field3650.field281 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field3644; var53++) {
                    field3650.method106(this.field3633[var53], true);
                    field3650.method106(this.field3638[var53], true);
                    field3650.field281 += var6 - 8;
                }
            }
        }
        field3650.field281 = this.field3644 * var6;
        if (arg0) {
            if (class123.field2206) {
                ByteBuffer var54 = ByteBuffer.wrap(field3650.field254, 0, field3650.field281);
                if (this.field3636 == null) {
                    this.field3636 = new class39(true);
                    this.field3636.method305(var54);
                } else {
                    this.field3636.method304(var54);
                }
                if (arg1) {
                    this.field3648.field793 = true;
                    this.field3648.field806 = null;
                    this.field3648.field804 = this.field3636;
                    this.field3648.field797 = var6;
                }
                if (arg2) {
                    this.field3646.field793 = true;
                    this.field3646.field806 = null;
                    this.field3646.field804 = this.field3636;
                    this.field3646.field797 = var6;
                }
                if (arg3) {
                    this.field3652.field793 = true;
                    this.field3652.field806 = null;
                    this.field3652.field804 = this.field3636;
                    this.field3652.field797 = var6;
                }
                if (arg4) {
                    this.field3657.field793 = true;
                    this.field3657.field806 = null;
                    this.field3657.field804 = this.field3636;
                    this.field3657.field797 = var6;
                }
            } else {
                if (field3672 == null || field3672.capacity() < field3650.field281) {
                    field3672 = ByteBuffer.allocateDirect(var6 * 100 + field3650.field281);
                } else {
                    field3672.clear();
                }
                field3672.put(field3650.field254, 0, field3650.field281);
                field3672.flip();
                if (arg1) {
                    this.field3648.field793 = true;
                    this.field3648.field806 = field3672;
                    this.field3648.field804 = null;
                    this.field3648.field797 = var6;
                }
                if (arg2) {
                    this.field3646.field793 = true;
                    this.field3646.field806 = field3672;
                    this.field3648.field804 = null;
                    this.field3646.field797 = var6;
                }
                if (arg3) {
                    this.field3652.field793 = true;
                    this.field3652.field806 = field3672;
                    this.field3652.field804 = null;
                    this.field3652.field797 = var6;
                }
                if (arg4) {
                    this.field3657.field793 = true;
                    this.field3657.field806 = field3672;
                    this.field3657.field804 = null;
                    this.field3657.field797 = var6;
                }
            }
        } else if (class123.field2227) {
            class39 var55 = new class39();
            ByteBuffer var56 = ByteBuffer.wrap(field3650.field254, 0, field3650.field281);
            var55.method305(var56);
            if (arg1) {
                this.field3648.field793 = true;
                this.field3648.field806 = null;
                this.field3648.field804 = var55;
                this.field3648.field797 = var6;
            }
            if (arg2) {
                this.field3646.field793 = true;
                this.field3646.field806 = null;
                this.field3646.field804 = var55;
                this.field3646.field797 = var6;
            }
            if (arg3) {
                this.field3652.field793 = true;
                this.field3652.field806 = null;
                this.field3652.field804 = var55;
                this.field3652.field797 = var6;
            }
            if (arg4) {
                this.field3657.field793 = true;
                this.field3657.field806 = null;
                this.field3657.field804 = var55;
                this.field3657.field797 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field3650.field281);
            var57.put(field3650.field254, 0, field3650.field281);
            var57.flip();
            if (arg1) {
                this.field3648.field793 = true;
                this.field3648.field806 = var57;
                this.field3648.field804 = null;
                this.field3648.field797 = var6;
            }
            if (arg2) {
                this.field3646.field793 = true;
                this.field3646.field806 = var57;
                this.field3648.field804 = null;
                this.field3646.field797 = var6;
            }
            if (arg3) {
                this.field3652.field793 = true;
                this.field3652.field806 = var57;
                this.field3652.field804 = null;
                this.field3652.field797 = var6;
            }
            if (arg4) {
                this.field3657.field793 = true;
                this.field3657.field806 = var57;
                this.field3657.field804 = null;
                this.field3657.field797 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lpf;IZ)V", line = 1524)
    public final void method46(class78 arg0, int arg1, boolean arg2) {
        if (this.field3659 == null || arg1 == -1) {
            return;
        }
        class170 var4 = arg0.field1465[arg1];
        class72 var5 = var4.field2956;
        for (int var6 = 0; var6 < this.field3634; var6++) {
            this.field3664[var6] <<= 0x4;
            this.field3656[var6] <<= 0x4;
            this.field3669[var6] <<= 0x4;
        }
        field3686 = 0;
        field3677 = 0;
        field3680 = 0;
        for (int var7 = 0; var7 < var4.field2957; var7++) {
            short var8 = var4.field2954[var7];
            if (var4.field2955[var7] != -1) {
                this.method1542(0, var5.field1395[var4.field2955[var7]], 0, 0, 0, arg2);
            }
            this.method1542(var5.field1384[var8], var5.field1395[var8], var4.field2951[var7], var4.field2958[var7], var4.field2953[var7], arg2);
        }
        for (int var9 = 0; var9 < this.field3634; var9++) {
            this.field3664[var9] >>= 0x4;
            this.field3656[var9] >>= 0x4;
            this.field3669[var9] >>= 0x4;
        }
        this.field3639.field613 = false;
        this.field3648.field793 = false;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIII)V", line = 1578)
    public final void method22(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field3644 == 0) {
            return;
        }
        GL var8 = class123.field2212;
        var8.glPushMatrix();
        if (arg3 != 0) {
            var8.glRotatef((float) arg3 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        var8.glTranslatef((float) arg4, (float) arg5, (float) arg6);
        if (arg1 != 0) {
            var8.glRotatef((float) arg1 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        }
        if (arg0 != 0) {
            var8.glRotatef((float) arg0 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        if (arg2 != 0) {
            var8.glRotatef((float) (-arg2) * 0.17578125F, 0.0F, 0.0F, 1.0F);
        }
        this.method1548();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZZLjf;Ljf;)Lam;", line = 1602)
    private final class243 method1539(boolean arg0, boolean arg1, class217 arg2, class217 arg3) {
        arg2.field3634 = this.field3634;
        arg2.field3644 = this.field3644;
        arg2.field3640 = this.field3640;
        arg2.field3641 = this.field3641;
        arg2.field3670 = this.field3670;
        arg2.field3655 = (byte) ((arg0 ? 0 : 2) | 0x1 | (arg1 ? 0 : 4));
        if (arg2.field3664 == null || arg2.field3664.length < this.field3634) {
            arg2.field3664 = new int[this.field3634 + 100];
            arg2.field3656 = new int[this.field3634 + 100];
            arg2.field3669 = new int[this.field3634 + 100];
        }
        for (int var5 = 0; var5 < this.field3634; var5++) {
            arg2.field3664[var5] = this.field3664[var5];
            arg2.field3656[var5] = this.field3656[var5];
            arg2.field3669[var5] = this.field3669[var5];
        }
        if (arg2.field3648 == null) {
            arg2.field3648 = new class48();
        }
        arg2.field3648.field793 = false;
        if (arg2.field3639 == null) {
            arg2.field3639 = new class38();
        }
        arg2.field3639.field613 = false;
        if (arg0) {
            arg2.field3632 = this.field3632;
            arg2.field3646 = this.field3646;
        } else {
            if (arg3.field3632 == null || arg3.field3632.length < this.field3640) {
                arg3.field3632 = new byte[this.field3640 + 100];
            }
            arg2.field3632 = arg3.field3632;
            for (int var6 = 0; var6 < this.field3640; var6++) {
                arg2.field3632[var6] = this.field3632[var6];
            }
            if (arg3.field3646 == null) {
                arg3.field3646 = new class48();
            }
            arg2.field3646 = arg3.field3646;
            arg2.field3646.field793 = false;
        }
        if (arg1) {
            arg2.field3662 = this.field3662;
            arg2.field3663 = this.field3663;
            arg2.field3645 = this.field3645;
            arg2.field3660 = this.field3660;
            arg2.field3652 = this.field3652;
        } else {
            if (arg3.field3662 == null || arg3.field3662.length < this.field3644) {
                arg3.field3662 = new short[this.field3644 + 100];
                arg3.field3663 = new short[this.field3644 + 100];
                arg3.field3645 = new short[this.field3644 + 100];
                arg3.field3660 = new short[this.field3644 + 100];
            }
            arg2.field3662 = arg3.field3662;
            arg2.field3663 = arg3.field3663;
            arg2.field3645 = arg3.field3645;
            arg2.field3660 = arg3.field3660;
            for (int var7 = 0; var7 < this.field3644; var7++) {
                arg2.field3662[var7] = this.field3662[var7];
                arg2.field3663[var7] = this.field3663[var7];
                arg2.field3645[var7] = this.field3645[var7];
                arg2.field3660[var7] = this.field3660[var7];
            }
            if (class274.field4701) {
                if (arg3.field3652 == null) {
                    arg3.field3652 = new class48();
                }
                arg2.field3652 = arg3.field3652;
                arg2.field3652.field793 = false;
            } else {
                arg2.field3652 = null;
            }
        }
        arg2.field3633 = this.field3633;
        arg2.field3638 = this.field3638;
        arg2.field3647 = this.field3647;
        arg2.field3659 = this.field3659;
        arg2.field3651 = this.field3651;
        arg2.field3653 = this.field3653;
        arg2.field3661 = this.field3661;
        arg2.field3643 = this.field3643;
        arg2.field3658 = this.field3658;
        arg2.field3635 = this.field3635;
        arg2.field3649 = this.field3649;
        arg2.field3657 = this.field3657;
        arg2.field3642 = this.field3642;
        arg2.field3631 = this.field3631;
        arg2.field3637 = this.field3637;
        arg2.field3668 = this.field3668;
        arg2.field4199 = this.field4199;
        return arg2;
    }

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "()V", line = 1726)
    public static void method1540() {
        field3667 = null;
        field3650 = null;
        field3672 = null;
        field3671 = null;
        field3673 = null;
        field3674 = null;
        field3675 = null;
        field3683 = null;
        field3678 = null;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "()V", line = 1739)
    public final void method21() {
        for (int var1 = 0; var1 < this.field3634; var1++) {
            int var2 = this.field3669[var1];
            this.field3669[var1] = this.field3664[var1];
            this.field3664[var1] = -var2;
        }
        this.field3639.field613 = false;
        this.field3648.field793 = false;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIIIIJ)V", line = 1754)
    public final void method43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        if (this.field3644 == 0) {
            return;
        }
        if (!this.field3639.field613) {
            this.method1544();
        }
        short var11 = this.field3639.field612;
        short var12 = this.field3639.field608;
        short var13 = this.field3639.field611;
        int var14 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var15 = arg1 * arg6 + arg2 * var14 >> 16;
        int var16 = (arg1 * var13 + arg2 * var11 >> 16) + var15;
        if (var16 <= 50) {
            return;
        }
        int var17 = (-var11 * arg2 + arg1 * var12 >> 16) + var15;
        if (var17 >= 3584) {
            return;
        }
        int var18 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var19 = var11 + var18 << 9;
        if (var19 / var16 <= class290.field4964) {
            return;
        }
        int var20 = var18 - var11 << 9;
        if (var20 / var16 >= class181.field3113) {
            return;
        }
        int var21 = arg2 * arg6 - arg1 * var14 >> 16;
        int var22 = (arg1 * var11 + arg2 * var13 >> 16) + var21 << 9;
        if (var22 / var16 <= class61.field1186) {
            return;
        }
        int var23 = (-var11 * arg1 + arg2 * var12 >> 16) + var21 << 9;
        if (var23 / var16 >= class66.field1307) {
            return;
        }
        int var24 = 0;
        int var25 = 0;
        if (arg0 != 0) {
            var24 = class50.field826[arg0];
            var25 = class50.field820[arg0];
        }
        if (arg8 > 0L && class234.field3960 && var17 > 0) {
            int var26;
            int var27;
            if (var18 > 0) {
                var26 = var20 / var16;
                var27 = var19 / var17;
            } else {
                var26 = var20 / var17;
                var27 = var19 / var16;
            }
            int var28;
            int var29;
            if (var21 > 0) {
                var28 = var23 / var16;
                var29 = var22 / var17;
            } else {
                var28 = var23 / var17;
                var29 = var22 / var16;
            }
            if (class71.field1364 >= var26 && class71.field1364 <= var27 && class182.field3122 >= var28 && class182.field3122 <= var29) {
                int var30 = 999999;
                int var31 = -999999;
                int var32 = 999999;
                int var33 = -999999;
                short var34 = this.field3639.field610;
                short var35 = this.field3639.field606;
                short var36 = this.field3639.field607;
                short var37 = this.field3639.field609;
                int[] var38 = new int[] { var34, var35, var34, var35, var34, var35, var34, var35 };
                int[] var39 = new int[] { var36, var36, var37, var37, var36, var36, var37, var37 };
                int[] var40 = new int[] { var12, var12, var12, var12, var13, var13, var13, var13 };
                for (int var41 = 0; var41 < 8; var41++) {
                    int var42 = var38[var41];
                    int var43 = var40[var41];
                    int var44 = var39[var41];
                    if (arg0 != 0) {
                        int var45 = var24 * var44 + var25 * var42 >> 16;
                        var44 = var25 * var44 - var24 * var42 >> 16;
                        var42 = var45;
                    }
                    int var46 = arg5 + var42;
                    int var47 = arg6 + var43;
                    int var48 = arg7 + var44;
                    int var49 = arg3 * var48 + arg4 * var46 >> 16;
                    int var50 = arg4 * var48 - arg3 * var46 >> 16;
                    int var52 = arg2 * var47 - arg1 * var50 >> 16;
                    int var53 = arg1 * var47 + arg2 * var50 >> 16;
                    if (var53 > 0) {
                        int var55 = (var49 << 9) / var53;
                        int var56 = (var52 << 9) / var53;
                        if (var55 < var30) {
                            var30 = var55;
                        }
                        if (var55 > var31) {
                            var31 = var55;
                        }
                        if (var56 < var32) {
                            var32 = var56;
                        }
                        if (var56 > var33) {
                            var33 = var56;
                        }
                    }
                }
                if (class71.field1364 >= var30 && class71.field1364 <= var31 && class182.field3122 >= var32 && class182.field3122 <= var33) {
                    if (this.field4199) {
                        class186.field3203[class70.field1349++] = arg8;
                    } else {
                        if (field3683.length < this.field3644) {
                            field3683 = new int[this.field3644];
                            field3678 = new int[this.field3644];
                        }
                        int var57 = 0;
                        label118: while (true) {
                            if (var57 >= this.field3634) {
                                int var77 = 0;
                                while (true) {
                                    if (var77 >= this.field3640) {
                                        break label118;
                                    }
                                    short var78 = this.field3653[var77];
                                    short var79 = this.field3661[var77];
                                    short var80 = this.field3643[var77];
                                    if (this.method1545(class71.field1364, class182.field3122, field3678[var78], field3678[var79], field3678[var80], field3683[var78], field3683[var79], field3683[var80])) {
                                        class186.field3203[class70.field1349++] = arg8;
                                        break label118;
                                    }
                                    var77++;
                                }
                            }
                            int var58 = this.field3664[var57];
                            int var59 = this.field3656[var57];
                            int var60 = this.field3669[var57];
                            if (arg0 != 0) {
                                int var61 = var24 * var60 + var25 * var58 >> 16;
                                var60 = var25 * var60 - var24 * var58 >> 16;
                                var58 = var61;
                            }
                            int var62 = arg5 + var58;
                            int var63 = arg6 + var59;
                            int var64 = arg7 + var60;
                            int var65 = arg3 * var64 + arg4 * var62 >> 16;
                            int var66 = arg4 * var64 - arg3 * var62 >> 16;
                            int var68 = arg2 * var63 - arg1 * var66 >> 16;
                            int var69 = arg1 * var63 + arg2 * var66 >> 16;
                            if (var69 < 50) {
                                break;
                            }
                            int var71 = (var65 << 9) / var69;
                            int var72 = (var68 << 9) / var69;
                            int var73 = this.field3668[var57];
                            int var74 = this.field3668[var57 + 1];
                            for (int var75 = var73; var75 < var74; var75++) {
                                int var76 = this.field3637[var75] - 1;
                                if (var76 == -1) {
                                    break;
                                }
                                field3683[var76] = var71;
                                field3678[var76] = var72;
                            }
                            var57++;
                        }
                    }
                }
            }
        }
        GL var81 = class123.field2212;
        var81.glPushMatrix();
        var81.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var81.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method1548();
        var81.glPopMatrix();
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIFFF)[F", line = 2023)
    private static final float[] method1541(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        float[] var7 = new float[9];
        float[] var8 = new float[9];
        float var9 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var10 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        float var11 = 1.0F - var9;
        var7[0] = var9;
        var7[1] = 0.0F;
        var7[2] = var10;
        var7[3] = 0.0F;
        var7[4] = 1.0F;
        var7[5] = 0.0F;
        var7[6] = -var10;
        var7[7] = 0.0F;
        var7[8] = var9;
        float[] var12 = new float[9];
        float var13 = 1.0F;
        float var14 = 0.0F;
        float var15 = (float) arg1 / 32767.0F;
        float var16 = -((float) Math.sqrt((double) (1.0F - var15 * var15)));
        float var17 = 1.0F - var15;
        float var18 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
        if (var18 == 0.0F && var15 == 0.0F) {
            var8 = var7;
        } else {
            if (var18 != 0.0F) {
                var13 = (float) (-arg2) / var18;
                var14 = (float) arg0 / var18;
            }
            var12[0] = var13 * var13 * var17 + var15;
            var12[1] = var14 * var16;
            var12[2] = var13 * var14 * var17;
            var12[3] = -var14 * var16;
            var12[4] = var15;
            var12[5] = var13 * var16;
            var12[6] = var13 * var14 * var17;
            var12[7] = -var13 * var16;
            var12[8] = var14 * var14 * var17 + var15;
            var8[0] = var7[2] * var12[6] + var7[0] * var12[0] + var7[1] * var12[3];
            var8[1] = var7[2] * var12[7] + var7[0] * var12[1] + var7[1] * var12[4];
            var8[2] = var7[2] * var12[8] + var7[0] * var12[2] + var7[1] * var12[5];
            var8[3] = var7[5] * var12[6] + var7[3] * var12[0] + var7[4] * var12[3];
            var8[4] = var7[5] * var12[7] + var7[3] * var12[1] + var7[4] * var12[4];
            var8[5] = var7[5] * var12[8] + var7[3] * var12[2] + var7[4] * var12[5];
            var8[6] = var7[8] * var12[6] + var7[6] * var12[0] + var7[7] * var12[3];
            var8[7] = var7[8] * var12[7] + var7[6] * var12[1] + var7[7] * var12[4];
            var8[8] = var7[8] * var12[8] + var7[6] * var12[2] + var7[7] * var12[5];
        }
        var8[0] *= arg4;
        var8[1] *= arg4;
        var8[2] *= arg4;
        var8[3] *= arg5;
        var8[4] *= arg5;
        var8[5] *= arg5;
        var8[6] *= arg6;
        var8[7] *= arg6;
        var8[8] *= arg6;
        return var8;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V", line = 2097)
    public final void method47(int arg0) {
        int var2 = class50.field826[arg0];
        int var3 = class50.field820[arg0];
        for (int var4 = 0; var4 < this.field3634; var4++) {
            int var5 = this.field3664[var4] * var3 + this.field3656[var4] * var2 >> 16;
            this.field3656[var4] = this.field3656[var4] * var3 - this.field3664[var4] * var2 >> 16;
            this.field3664[var4] = var5;
        }
        this.field3639.field613 = false;
        this.field3648.field793 = false;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V", line = 2118)
    public final void method27(int arg0) {
        int var2 = class50.field826[arg0];
        int var3 = class50.field820[arg0];
        for (int var4 = 0; var4 < this.field3634; var4++) {
            int var5 = this.field3669[var4] * var2 + this.field3664[var4] * var3 >> 16;
            this.field3669[var4] = this.field3669[var4] * var3 - this.field3664[var4] * var2 >> 16;
            this.field3664[var4] = var5;
        }
        this.field3639.field613 = false;
        this.field3648.field793 = false;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lpf;I)V", line = 2137)
    public final void method51(class78 arg0, int arg1) {
        if (this.field3659 == null || arg1 == -1) {
            return;
        }
        class170 var3 = arg0.field1465[arg1];
        class72 var4 = var3.field2956;
        field3686 = 0;
        field3677 = 0;
        field3680 = 0;
        for (int var5 = 0; var5 < var3.field2957; var5++) {
            short var6 = var3.field2954[var5];
            if (var4.field1391[var6]) {
                if (var3.field2955[var5] != -1) {
                    this.method1537(0, 0, 0, 0);
                }
                this.method1537(var4.field1384[var6], var3.field2951[var5], var3.field2958[var5], var3.field2953[var5]);
            }
        }
        this.field3648.field793 = false;
        this.field3639.field613 = false;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I[IIIIZ)V", line = 2173)
    private final void method1542(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field3686 = 0;
            field3677 = 0;
            field3680 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field3659.length) {
                    int[] var14 = this.field3659[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field3686 += this.field3664[var16];
                        field3677 += this.field3656[var16];
                        field3680 += this.field3669[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field3686 = field3686 / var11 + var8;
                field3677 = field3677 / var11 + var9;
                field3680 = field3680 / var11 + var10;
            } else {
                field3686 = var8;
                field3677 = var9;
                field3680 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field3659.length) {
                    int[] var22 = this.field3659[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field3664[var24] += var17;
                        this.field3656[var24] += var18;
                        this.field3669[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field3659.length) {
                    int[] var27 = this.field3659[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field3664[var29] -= field3686;
                        this.field3656[var29] -= field3677;
                        this.field3669[var29] -= field3680;
                        if (arg4 != 0) {
                            int var30 = class50.field826[arg4];
                            int var31 = class50.field820[arg4];
                            int var32 = this.field3664[var29] * var31 + this.field3656[var29] * var30 + 32767 >> 16;
                            this.field3656[var29] = this.field3656[var29] * var31 + 32767 - this.field3664[var29] * var30 >> 16;
                            this.field3664[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class50.field826[arg2];
                            int var34 = class50.field820[arg2];
                            int var35 = this.field3656[var29] * var34 + 32767 - this.field3669[var29] * var33 >> 16;
                            this.field3669[var29] = this.field3669[var29] * var34 + this.field3656[var29] * var33 + 32767 >> 16;
                            this.field3656[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class50.field826[arg3];
                            int var37 = class50.field820[arg3];
                            int var38 = this.field3669[var29] * var36 + this.field3664[var29] * var37 + 32767 >> 16;
                            this.field3669[var29] = this.field3669[var29] * var37 + 32767 - this.field3664[var29] * var36 >> 16;
                            this.field3664[var29] = var38;
                        }
                        this.field3664[var29] += field3686;
                        this.field3656[var29] += field3677;
                        this.field3669[var29] += field3680;
                    }
                }
            }
            if (arg5 && this.field3662 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field3659.length) {
                        int[] var41 = this.field3659[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field3668[var43];
                            int var45 = this.field3668[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field3637[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class50.field826[arg4];
                                    int var49 = class50.field820[arg4];
                                    int var50 = this.field3663[var47] * var48 + this.field3662[var47] * var49 + 32767 >> 16;
                                    this.field3663[var47] = (short) (this.field3663[var47] * var49 + 32767 - this.field3662[var47] * var48 >> 16);
                                    this.field3662[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class50.field826[arg2];
                                    int var52 = class50.field820[arg2];
                                    int var53 = this.field3663[var47] * var52 + 32767 - this.field3645[var47] * var51 >> 16;
                                    this.field3645[var47] = (short) (this.field3663[var47] * var51 + this.field3645[var47] * var52 + 32767 >> 16);
                                    this.field3663[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class50.field826[arg3];
                                    int var55 = class50.field820[arg3];
                                    int var56 = this.field3662[var47] * var55 + this.field3645[var47] * var54 + 32767 >> 16;
                                    this.field3645[var47] = (short) (this.field3645[var47] * var55 + 32767 - this.field3662[var47] * var54 >> 16);
                                    this.field3662[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field3652 != null) {
                    this.field3652.field793 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field3659.length) {
                    int[] var59 = this.field3659[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field3664[var61] -= field3686;
                        this.field3656[var61] -= field3677;
                        this.field3669[var61] -= field3680;
                        this.field3664[var61] = this.field3664[var61] * arg2 >> 7;
                        this.field3656[var61] = this.field3656[var61] * arg3 >> 7;
                        this.field3669[var61] = this.field3669[var61] * arg4 >> 7;
                        this.field3664[var61] += field3686;
                        this.field3656[var61] += field3677;
                        this.field3669[var61] += field3680;
                    }
                }
            }
        } else if (arg0 == 5 && this.field3649 != null && this.field3632 != null) {
            for (int var62 = 0; var62 < var7; var62++) {
                int var63 = arg1[var62];
                if (var63 < this.field3649.length) {
                    int[] var64 = this.field3649[var63];
                    for (int var65 = 0; var65 < var64.length; var65++) {
                        int var66 = var64[var65];
                        int var67 = (this.field3632[var66] & 0xFF) + arg2 * 8;
                        if (var67 < 0) {
                            var67 = 0;
                        } else if (var67 > 255) {
                            var67 = 255;
                        }
                        this.field3632[var66] = (byte) var67;
                    }
                    if (var64.length > 0) {
                        this.field3646.field793 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "()I", line = 2516)
    public final int method1543() {
        return this.field3641;
    }

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "()V", line = 2521)
    private final void method1544() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field3634; var9++) {
            int var10 = this.field3664[var9];
            int var11 = this.field3656[var9];
            int var12 = this.field3669[var9];
            if (var10 < var1) {
                var1 = var10;
            }
            if (var10 > var4) {
                var4 = var10;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            int var13 = var10 * var10 + var12 * var12;
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var10 * var10 + var12 * var12;
            if (var14 > var8) {
                var8 = var14;
            }
        }
        this.field3639.field610 = (short) var1;
        this.field3639.field606 = (short) var4;
        this.field3639.field608 = (short) var2;
        this.field3639.field611 = (short) var5;
        this.field3639.field607 = (short) var3;
        this.field3639.field609 = (short) var6;
        this.field3639.field612 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field3639.field613 = true;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIIII)Z", line = 2591)
    private final boolean method1545(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "()I", line = 2606)
    public final int method32() {
        if (!this.field3639.field613) {
            this.method1544();
        }
        return this.field3639.field612;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZZZZZZZ)V", line = 2612)
    public final void method1546(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field3655 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field3644 != 0) {
            if (arg6) {
                boolean var8 = !this.field3646.field793 && (arg1 || arg2 && !class274.field4701);
                this.method1538(false, !this.field3648.field793 && arg0, var8, this.field3652 != null && !this.field3652.field793 && arg2, !this.field3657.field793 && arg3);
                if (!this.field3642.field793 && arg4 && arg1) {
                    this.method1524();
                }
            }
            if (arg0) {
                if (this.field3648.field793) {
                    this.field3664 = null;
                    this.field3656 = null;
                    this.field3669 = null;
                    this.field3637 = null;
                    this.field3668 = null;
                } else {
                    this.field3665 = (byte) (this.field3665 | 0x1);
                }
            }
            if (arg1) {
                if (this.field3646.field793) {
                    this.field3651 = null;
                    this.field3632 = null;
                } else {
                    this.field3665 = (byte) (this.field3665 | 0x2);
                }
            }
            if (arg2 && class274.field4701) {
                if (this.field3652.field793) {
                    this.field3662 = null;
                    this.field3663 = null;
                    this.field3645 = null;
                    this.field3660 = null;
                } else {
                    this.field3665 = (byte) (this.field3665 | 0x4);
                }
            }
            if (arg3) {
                if (this.field3657.field793) {
                    this.field3633 = null;
                    this.field3638 = null;
                } else {
                    this.field3665 = (byte) (this.field3665 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field3642.field793 && this.field3646.field793) {
                    this.field3653 = null;
                    this.field3661 = null;
                    this.field3643 = null;
                } else {
                    this.field3665 = (byte) (this.field3665 | 0x10);
                }
            }
            if (arg5) {
                this.field3647 = null;
                this.field3635 = null;
                this.field3659 = (int[][]) null;
                this.field3649 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)La;", line = 2704)
    public final class262 method1088(int arg0, int arg1, int arg2) {
        this.field3654 = false;
        if (this.field3666 != null) {
            this.field3662 = this.field3666.field37;
            this.field3663 = this.field3666.field36;
            this.field3645 = this.field3666.field38;
            this.field3660 = this.field3666.field39;
            this.field3666 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 2718)
    private static final void method1547(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
        int var12 = arg0 - arg3;
        int var13 = arg1 - arg4;
        int var14 = arg2 - arg5;
        float var15 = arg7[2] * (float) var14 + arg7[0] * (float) var12 + arg7[1] * (float) var13;
        float var16 = arg7[5] * (float) var14 + arg7[3] * (float) var12 + arg7[4] * (float) var13;
        float var17 = arg7[8] * (float) var14 + arg7[6] * (float) var12 + arg7[7] * (float) var13;
        float var18;
        float var19;
        if (arg6 == 0) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + 0.5F - var17;
        } else if (arg6 == 1) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + var17 + 0.5F;
        } else if (arg6 == 2) {
            var18 = arg9 + 0.5F - var15;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 3) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 4) {
            var18 = arg11 + var17 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else {
            var18 = arg11 + 0.5F - var17;
            var19 = arg10 + 0.5F - var16;
        }
        if (arg8 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg8 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg8 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        field3684 = var18;
        field3676 = var19;
    }

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "()V", line = 2799)
    private final void method1548() {
        GL var1 = class123.field2212;
        if (this.field3640 == 0) {
            return;
        }
        if (this.field3655 != 0) {
            this.method1538(true, !this.field3648.field793 && (this.field3655 & 0x1) != 0, !this.field3646.field793 && (this.field3655 & 0x2) != 0, this.field3652 != null && !this.field3652.field793 && (this.field3655 & 0x4) != 0, false);
        }
        this.method1538(false, !this.field3648.field793, !this.field3646.field793, this.field3652 != null && !this.field3652.field793, !this.field3657.field793);
        if (!this.field3642.field793) {
            this.method1524();
        }
        if (this.field3665 != 0) {
            if ((this.field3665 & 0x1) != 0) {
                this.field3664 = null;
                this.field3656 = null;
                this.field3669 = null;
                this.field3637 = null;
                this.field3668 = null;
            }
            if ((this.field3665 & 0x2) != 0) {
                this.field3651 = null;
                this.field3632 = null;
            }
            if ((this.field3665 & 0x4) != 0) {
                this.field3662 = null;
                this.field3663 = null;
                this.field3645 = null;
                this.field3660 = null;
            }
            if ((this.field3665 & 0x8) != 0) {
                this.field3633 = null;
                this.field3638 = null;
            }
            if ((this.field3665 & 0x10) != 0) {
                this.field3653 = null;
                this.field3661 = null;
                this.field3643 = null;
            }
            this.field3665 = 0;
        }
        class39 var2 = null;
        if (this.field3648.field804 != null) {
            this.field3648.field804.method301();
            var2 = this.field3648.field804;
            var1.glVertexPointer(3, 5126, this.field3648.field797, (long) this.field3648.field808);
        }
        if (this.field3646.field804 != null) {
            if (this.field3646.field804 != var2) {
                this.field3646.field804.method301();
                var2 = this.field3646.field804;
            }
            var1.glColorPointer(4, 5121, this.field3646.field797, (long) this.field3646.field808);
        }
        if (class274.field4701 && this.field3652.field804 != null) {
            if (this.field3652.field804 != var2) {
                this.field3652.field804.method301();
                var2 = this.field3652.field804;
            }
            var1.glNormalPointer(5126, this.field3652.field797, (long) this.field3652.field808);
        }
        if (this.field3657.field804 != null) {
            if (this.field3657.field804 != var2) {
                this.field3657.field804.method301();
                class39 var3 = this.field3657.field804;
            }
            var1.glTexCoordPointer(2, 5126, this.field3657.field797, (long) this.field3657.field808);
        }
        if (this.field3642.field804 != null) {
            this.field3642.field804.method303();
        }
        if (this.field3648.field804 == null || this.field3646.field804 == null || class274.field4701 && this.field3652.field804 == null || this.field3657.field804 == null) {
            if (class123.field2227) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field3648.field804 == null) {
                this.field3648.field806.position(this.field3648.field808);
                var1.glVertexPointer(3, 5126, this.field3648.field797, this.field3648.field806);
            }
            if (this.field3646.field804 == null) {
                this.field3646.field806.position(this.field3646.field808);
                var1.glColorPointer(4, 5121, this.field3646.field797, this.field3646.field806);
            }
            if (class274.field4701 && this.field3652.field804 == null) {
                this.field3652.field806.position(this.field3652.field808);
                var1.glNormalPointer(5126, this.field3652.field797, this.field3652.field806);
            }
            if (this.field3657.field804 == null) {
                this.field3657.field806.position(this.field3657.field808);
                var1.glTexCoordPointer(2, 5126, this.field3657.field797, this.field3657.field806);
            }
        }
        if (this.field3642.field804 == null && class123.field2227) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field3631.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field3631[var5];
            int var7 = this.field3631[var5 + 1];
            short var8 = this.field3658[var6];
            if (var8 == -1) {
                class123.method867(-1);
                class125.method908(0, -5, 0);
            } else {
                class50.field816.method668(var8 & 0xFFFF, -16147);
            }
            if (this.field3642.field804 == null) {
                this.field3642.field806.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field3642.field806);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(La;IIIZ)V", line = 2973)
    public final void method1071(class262 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class217 var6 = (class217) arg0;
        if (this.field3640 == 0 || var6.field3640 == 0) {
            return;
        }
        int var7 = var6.field3634;
        int[] var8 = var6.field3664;
        int[] var9 = var6.field3656;
        int[] var10 = var6.field3669;
        short[] var11 = var6.field3662;
        short[] var12 = var6.field3663;
        short[] var13 = var6.field3645;
        short[] var14 = var6.field3660;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field3666 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field3666.field37;
            var16 = this.field3666.field36;
            var17 = this.field3666.field38;
            var18 = this.field3666.field39;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field3666 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field3666.field37;
            var20 = var6.field3666.field36;
            var21 = var6.field3666.field38;
            var22 = var6.field3666.field39;
        }
        int[] var23 = var6.field3668;
        short[] var24 = var6.field3637;
        if (!var6.field3639.field613) {
            var6.method1544();
        }
        short var25 = var6.field3639.field608;
        short var26 = var6.field3639.field611;
        short var27 = var6.field3639.field610;
        short var28 = var6.field3639.field606;
        short var29 = var6.field3639.field607;
        short var30 = var6.field3639.field609;
        for (int var31 = 0; var31 < this.field3634; var31++) {
            int var32 = this.field3656[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field3664[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field3669[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field3668[var31];
                        int var37 = this.field3668[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field3637[var38] - 1;
                            if (var35 == -1 || this.field3660[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39];
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var41; var43 < var42; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var15 == null) {
                                            this.field3666 = new class4();
                                            var15 = this.field3666.field37 = class310.method2148(0, this.field3662);
                                            var16 = this.field3666.field36 = class310.method2148(0, this.field3663);
                                            var17 = this.field3666.field38 = class310.method2148(0, this.field3645);
                                            var18 = this.field3666.field39 = class310.method2148(0, this.field3660);
                                        }
                                        if (var19 == null) {
                                            class4 var44 = var6.field3666 = new class4();
                                            var19 = var44.field37 = class310.method2148(0, var11);
                                            var20 = var44.field36 = class310.method2148(0, var12);
                                            var21 = var44.field38 = class310.method2148(0, var13);
                                            var22 = var44.field39 = class310.method2148(0, var14);
                                        }
                                        short var45 = this.field3662[var35];
                                        short var46 = this.field3663[var35];
                                        short var47 = this.field3645[var35];
                                        short var48 = this.field3660[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var19[var52] += var45;
                                                var20[var52] += var46;
                                                var21[var52] += var47;
                                                var22[var52] += var48;
                                            }
                                        }
                                        short var53 = var11[var40];
                                        short var54 = var12[var40];
                                        short var55 = var13[var40];
                                        short var56 = var14[var40];
                                        int var57 = this.field3668[var31];
                                        int var58 = this.field3668[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field3637[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var15[var60] += var53;
                                                var16[var60] += var54;
                                                var17[var60] += var55;
                                                var18[var60] += var56;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lnm;)Lnm;", line = 3211)
    public final class176 method1549(class176 arg0) {
        if (this.field3644 == 0) {
            return null;
        }
        if (!this.field3639.field613) {
            this.method1544();
        }
        int var2;
        int var3;
        if (class52.field837 > 0) {
            var2 = this.field3639.field610 - (class52.field837 * this.field3639.field611 >> 8) >> 3;
            var3 = this.field3639.field606 - (class52.field837 * this.field3639.field608 >> 8) >> 3;
        } else {
            var2 = this.field3639.field610 - (class52.field837 * this.field3639.field608 >> 8) >> 3;
            var3 = this.field3639.field606 - (class52.field837 * this.field3639.field611 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class52.field838 > 0) {
            var4 = this.field3639.field607 - (class52.field838 * this.field3639.field611 >> 8) >> 3;
            var5 = this.field3639.field609 - (class52.field838 * this.field3639.field608 >> 8) >> 3;
        } else {
            var4 = this.field3639.field607 - (class52.field838 * this.field3639.field608 >> 8) >> 3;
            var5 = this.field3639.field609 - (class52.field838 * this.field3639.field611 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class176 var8;
        if (arg0 == null || arg0.field3012.length < var6 * var7) {
            var8 = new class176(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field3001 = arg0.field3008 = var6;
            arg0.field3003 = arg0.field3011 = var7;
            arg0.method1229();
        }
        var8.field3009 = var2;
        var8.field3007 = var4;
        if (field3683.length < this.field3644) {
            field3683 = new int[this.field3644];
            field3678 = new int[this.field3644];
        }
        for (int var9 = 0; var9 < this.field3634; var9++) {
            int var10 = (this.field3664[var9] - (this.field3656[var9] * class52.field837 >> 8) >> 3) - var2;
            int var11 = (this.field3669[var9] - (this.field3656[var9] * class52.field838 >> 8) >> 3) - var4;
            int var12 = this.field3668[var9];
            int var13 = this.field3668[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field3637[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field3683[var15] = var10;
                field3678[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field3640; var16++) {
            if (this.field3632[var16] <= 128) {
                short var17 = this.field3653[var16];
                short var18 = this.field3661[var16];
                short var19 = this.field3643[var16];
                int var20 = field3683[var17];
                int var21 = field3683[var18];
                int var22 = field3683[var19];
                int var23 = field3678[var17];
                int var24 = field3678[var18];
                int var25 = field3678[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class50.method380(var8.field3012, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIII[FFIF)V", line = 3334)
    private static final void method1550(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
        int var10 = arg0 - arg3;
        int var11 = arg1 - arg4;
        int var12 = arg2 - arg5;
        float var13 = arg6[2] * (float) var12 + arg6[0] * (float) var10 + arg6[1] * (float) var11;
        float var14 = arg6[5] * (float) var12 + arg6[3] * (float) var10 + arg6[4] * (float) var11;
        float var15 = arg6[8] * (float) var12 + arg6[6] * (float) var10 + arg6[7] * (float) var11;
        float var16 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        if (arg7 != 1.0F) {
            var16 = arg7 * var16;
        }
        float var17 = var14 + arg9 + 0.5F;
        if (arg8 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg8 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg8 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field3679 = var16;
        field3685 = var17;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(FFF)I", line = 3379)
    private static final int method1551(float arg0, float arg1, float arg2) {
        float var3 = arg0 < 0.0F ? -arg0 : arg0;
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        float var5 = arg2 < 0.0F ? -arg2 : arg2;
        if (var4 > var3 && var4 > var5) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var5 > var3 && var5 > var4) {
            return arg2 > 0.0F ? 2 : 3;
        } else if (arg0 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "()V", line = 3413)
    public final void method1552() {
        if (this.field3662 == null) {
            this.method31();
            return;
        }
        for (int var1 = 0; var1 < this.field3634; var1++) {
            int var2 = this.field3664[var1];
            this.field3664[var1] = this.field3669[var1];
            this.field3669[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field3644; var3++) {
            short var4 = this.field3662[var3];
            this.field3662[var3] = this.field3645[var3];
            this.field3645[var3] = (short) (-var4);
        }
        this.field3639.field613 = false;
        this.field3648.field793 = false;
        if (this.field3652 != null) {
            this.field3652.field793 = false;
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(III)V", line = 3453)
    public final void method23(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3634; var4++) {
            this.field3664[var4] = this.field3664[var4] * arg0 >> 7;
            this.field3656[var4] = this.field3656[var4] * arg1 >> 7;
            this.field3669[var4] = this.field3669[var4] * arg2 >> 7;
        }
        this.field3639.field613 = false;
        this.field3648.field793 = false;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(ZZ)Lam;", line = 3474)
    public final class243 method24(boolean arg0, boolean arg1) {
        return this.method1539(arg0, arg1, field3675, field3674);
    }

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "()I", line = 3477)
    public final int method39() {
        if (!this.field3639.field613) {
            this.method1544();
        }
        return this.field3639.field610;
    }

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "()V", line = 3486)
    public final void method1553() {
        int var10002;
        if (this.field3647 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3634; var3++) {
                int var4 = this.field3647[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field3659 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field3659[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field3634) {
                int var7 = this.field3647[var6] & 0xFF;
                this.field3659[var7][var1[var7]++] = var6++;
            }
            this.field3647 = null;
        }
        if (this.field3635 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field3640; var10++) {
            int var11 = this.field3635[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field3649 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field3649[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field3640) {
            int var14 = this.field3635[var13] & 0xFF;
            this.field3649[var14][var8[var14]++] = var13++;
        }
        this.field3635 = null;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(SS)V", line = 3583)
    public final void method1554(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3640; var3++) {
            if (this.field3651[var3] == arg0) {
                this.field3651[var3] = arg1;
            }
        }
        this.field3646.field793 = false;
    }

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "(I)V", line = 3595)
    public final void method1555(int arg0) {
        if (this.field3662 == null) {
            this.method27(arg0);
            return;
        }
        int var2 = class50.field826[arg0];
        int var3 = class50.field820[arg0];
        for (int var4 = 0; var4 < this.field3634; var4++) {
            int var5 = this.field3669[var4] * var2 + this.field3664[var4] * var3 >> 16;
            this.field3669[var4] = this.field3669[var4] * var3 - this.field3664[var4] * var2 >> 16;
            this.field3664[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field3644; var6++) {
            int var7 = this.field3662[var6] * var3 + this.field3645[var6] * var2 >> 16;
            this.field3645[var6] = (short) (this.field3645[var6] * var3 - this.field3662[var6] * var2 >> 16);
            this.field3662[var6] = (short) var7;
        }
        this.field3639.field613 = false;
        this.field3648.field793 = false;
        if (this.field3652 != null) {
            this.field3652.field793 = false;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "()I", line = 3636)
    public final int method48() {
        if (!this.field3639.field613) {
            this.method1544();
        }
        return this.field3639.field608;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIII[FIF)V", line = 3642)
    private static final void method1556(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
        int var9 = arg0 - arg3;
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg5;
        float var12 = arg6[2] * (float) var11 + arg6[0] * (float) var9 + arg6[1] * (float) var10;
        float var13 = arg6[5] * (float) var11 + arg6[3] * (float) var9 + arg6[4] * (float) var10;
        float var14 = arg6[8] * (float) var11 + arg6[6] * (float) var9 + arg6[7] * (float) var10;
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = (float) Math.atan2((double) var12, (double) var14) / 6.2831855F + 0.5F;
        float var17 = (float) Math.asin((double) (var13 / var15)) / 3.1415927F + arg8 + 0.5F;
        if (arg7 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg7 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg7 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field3682 = var16;
        field3681 = var17;
    }

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "()V", line = 3692)
    public final void method1557() {
        if (this.field3662 == null) {
            this.method45();
            return;
        }
        for (int var1 = 0; var1 < this.field3634; var1++) {
            this.field3664[var1] = -this.field3664[var1];
            this.field3669[var1] = -this.field3669[var1];
        }
        for (int var2 = 0; var2 < this.field3644; var2++) {
            this.field3662[var2] = (short) (-this.field3662[var2]);
            this.field3645[var2] = (short) (-this.field3645[var2]);
        }
        this.field3639.field613 = false;
        this.field3648.field793 = false;
        if (this.field3652 != null) {
            this.field3652.field793 = false;
        }
    }
}
