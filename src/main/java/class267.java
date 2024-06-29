import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class267 extends class57 {

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "Z")
    public boolean field4610 = false;

    @OriginalMember(owner = "client!fh", name = "L", descriptor = "B")
    private byte field4622 = 0;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "B")
    private byte field4600 = 0;

    @OriginalMember(owner = "client!fh", name = "W", descriptor = "I")
    private int field4633 = 0;

    @OriginalMember(owner = "client!fh", name = "bb", descriptor = "I")
    private int field4638 = 0;

    @OriginalMember(owner = "client!fh", name = "ab", descriptor = "I")
    public int field4637 = 0;

    @OriginalMember(owner = "client!fh", name = "R", descriptor = "[I")
    private int[] field4628;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "[I")
    public int[] field4607;

    @OriginalMember(owner = "client!fh", name = "M", descriptor = "[I")
    public int[] field4623;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "[I")
    public int[] field4602;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "[I")
    private int[] field4603;

    @OriginalMember(owner = "client!fh", name = "O", descriptor = "[S")
    private short[] field4625;

    @OriginalMember(owner = "client!fh", name = "D", descriptor = "[S")
    private short[] field4614;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "[S")
    private short[] field4601;

    @OriginalMember(owner = "client!fh", name = "Z", descriptor = "[S")
    private short[] field4636;

    @OriginalMember(owner = "client!fh", name = "X", descriptor = "[F")
    private float[] field4634;

    @OriginalMember(owner = "client!fh", name = "Q", descriptor = "[F")
    private float[] field4627;

    @OriginalMember(owner = "client!fh", name = "N", descriptor = "[S")
    private short[] field4624;

    @OriginalMember(owner = "client!fh", name = "K", descriptor = "[B")
    private byte[] field4621;

    @OriginalMember(owner = "client!fh", name = "I", descriptor = "[S")
    private short[] field4619;

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "[S")
    private short[] field4613;

    @OriginalMember(owner = "client!fh", name = "J", descriptor = "[S")
    private short[] field4620;

    @OriginalMember(owner = "client!fh", name = "T", descriptor = "[S")
    private short[] field4630;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "[B")
    private byte[] field4605;

    @OriginalMember(owner = "client!fh", name = "F", descriptor = "Lkg;")
    public class134 field4616;

    @OriginalMember(owner = "client!fh", name = "V", descriptor = "Loc;")
    public class191 field4632;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "Loc;")
    private class191 field4599;

    @OriginalMember(owner = "client!fh", name = "A", descriptor = "Loc;")
    private class191 field4611;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "Loc;")
    private class191 field4606;

    @OriginalMember(owner = "client!fh", name = "S", descriptor = "Loc;")
    private class191 field4629;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "S")
    private short field4604;

    @OriginalMember(owner = "client!fh", name = "U", descriptor = "S")
    private short field4631;

    @OriginalMember(owner = "client!fh", name = "H", descriptor = "[S")
    private short[] field4618;

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "[I")
    private int[] field4609;

    @OriginalMember(owner = "client!fh", name = "Y", descriptor = "Ls;")
    private static class170 field4635 = new class170(10000);

    @OriginalMember(owner = "client!fh", name = "db", descriptor = "Lfh;")
    private static class267 field4640 = new class267();

    @OriginalMember(owner = "client!fh", name = "eb", descriptor = "Lfh;")
    private static class267 field4641 = new class267();

    @OriginalMember(owner = "client!fh", name = "fb", descriptor = "Lfh;")
    private static class267 field4642 = new class267();

    @OriginalMember(owner = "client!fh", name = "gb", descriptor = "Lfh;")
    private static class267 field4643 = new class267();

    @OriginalMember(owner = "client!fh", name = "jb", descriptor = "[I")
    private static int[] field4646 = new int[1];

    @OriginalMember(owner = "client!fh", name = "lb", descriptor = "[I")
    private static int[] field4648 = new int[1];

    @OriginalMember(owner = "client!fh", name = "hb", descriptor = "F")
    private static float field4644;

    @OriginalMember(owner = "client!fh", name = "ib", descriptor = "F")
    private static float field4645;

    @OriginalMember(owner = "client!fh", name = "ob", descriptor = "F")
    private static float field4651;

    @OriginalMember(owner = "client!fh", name = "pb", descriptor = "F")
    private static float field4652;

    @OriginalMember(owner = "client!fh", name = "qb", descriptor = "F")
    private static float field4653;

    @OriginalMember(owner = "client!fh", name = "rb", descriptor = "F")
    private static float field4654;

    @OriginalMember(owner = "client!fh", name = "kb", descriptor = "I")
    private static int field4647;

    @OriginalMember(owner = "client!fh", name = "mb", descriptor = "I")
    private static int field4649;

    @OriginalMember(owner = "client!fh", name = "nb", descriptor = "I")
    private static int field4650;

    @OriginalMember(owner = "client!fh", name = "P", descriptor = "Ljh;")
    private class225 field4626;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "Lcb;")
    private class74 field4608;

    @OriginalMember(owner = "client!fh", name = "cb", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field4639;

    @OriginalMember(owner = "client!fh", name = "G", descriptor = "[J")
    private static long[] field4617;

    @OriginalMember(owner = "client!fh", name = "B", descriptor = "[[I")
    private int[][] field4612;

    @OriginalMember(owner = "client!fh", name = "E", descriptor = "[[I")
    private int[][] field4615;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIII[FIF)V", line = 5)
    private static final void method1842(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
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
        field4653 = var16;
        field4651 = var17;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ld;I)V", line = 49)
    public final void method442(class40 arg0, int arg1) {
        if (this.field4615 == null || arg1 == -1) {
            return;
        }
        class196 var3 = arg0.field605[arg1];
        class88 var4 = var3.field3238;
        field4647 = 0;
        field4650 = 0;
        field4649 = 0;
        for (int var5 = 0; var5 < var3.field3246; var5++) {
            short var6 = var3.field3237[var5];
            if (var4.field1397[var6]) {
                if (var3.field3239[var5] != -1) {
                    this.method1873(0, 0, 0, 0);
                }
                this.method1873(var4.field1399[var6], var3.field3241[var5], var3.field3244[var5], var3.field3242[var5]);
            }
        }
        this.field4632.field3192 = false;
        this.field4616.field2219 = false;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IILfh;[[I[[IIII)V", line = 84)
    public final void method1843(int arg0, int arg1, class267 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field4616.field2219) {
            arg2.method1863();
        }
        int var9 = arg2.field4616.field2217 + arg5;
        int var10 = arg2.field4616.field2224 + arg5;
        int var11 = arg2.field4616.field2223 + arg7;
        int var12 = arg2.field4616.field2222 + arg7;
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
            for (int var17 = 0; var17 < this.field4637; var17++) {
                int var18 = this.field4607[var17] + arg5;
                int var19 = this.field4602[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field4623[var17] = this.field4623[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field4616.field2221;
            for (int var28 = 0; var28 < this.field4637; var28++) {
                int var29 = (this.field4623[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field4607[var28] + arg5;
                    int var31 = this.field4602[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field4623[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method443(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field4616.field2220 - arg2.field4616.field2221;
            for (int var42 = 0; var42 < this.field4637; var42++) {
                int var43 = this.field4607[var42] + arg5;
                int var44 = this.field4602[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field4623[var42] = var51 + this.field4623[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field4616.field2220 - arg2.field4616.field2221;
            for (int var53 = 0; var53 < this.field4637; var53++) {
                int var54 = this.field4607[var53] + arg5;
                int var55 = this.field4602[var53] + arg7;
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
                this.field4623[var53] = ((this.field4623[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field4632.field3192 = false;
        this.field4616.field2219 = false;
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(III)V", line = 285)
    public final void method444(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4637; var4++) {
            this.field4607[var4] = this.field4607[var4] * arg0 >> 7;
            this.field4623[var4] = this.field4623[var4] * arg1 >> 7;
            this.field4602[var4] = this.field4602[var4] * arg2 >> 7;
        }
        this.field4616.field2219 = false;
        this.field4632.field3192 = false;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(FFF)I", line = 303)
    private static final int method1844(float arg0, float arg1, float arg2) {
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

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(III)V", line = 339)
    public final void method441(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4637; var4++) {
            this.field4607[var4] += arg0;
            this.field4623[var4] += arg1;
            this.field4602[var4] += arg2;
        }
        this.field4616.field2219 = false;
        this.field4632.field3192 = false;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "([FI)[F", line = 355)
    private static final float[] method1845(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class63.method517(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZZZZZZZ)V", line = 360)
    public final void method1846(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field4600 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field4633 != 0) {
            if (arg6) {
                boolean var8 = !this.field4599.field3192 && (arg1 || arg2 && !class308.field5243);
                this.method1849(false, !this.field4632.field3192 && arg0, var8, this.field4611 != null && !this.field4611.field3192 && arg2, !this.field4606.field3192 && arg3);
                if (!this.field4629.field3192 && arg4 && arg1) {
                    this.method1858();
                }
            }
            if (arg0) {
                if (this.field4632.field3192) {
                    this.field4607 = null;
                    this.field4623 = null;
                    this.field4602 = null;
                    this.field4618 = null;
                    this.field4628 = null;
                } else {
                    this.field4622 = (byte) (this.field4622 | 0x1);
                }
            }
            if (arg1) {
                if (this.field4599.field3192) {
                    this.field4624 = null;
                    this.field4621 = null;
                } else {
                    this.field4622 = (byte) (this.field4622 | 0x2);
                }
            }
            if (arg2 && class308.field5243) {
                if (this.field4611.field3192) {
                    this.field4625 = null;
                    this.field4614 = null;
                    this.field4601 = null;
                    this.field4636 = null;
                } else {
                    this.field4622 = (byte) (this.field4622 | 0x4);
                }
            }
            if (arg3) {
                if (this.field4606.field3192) {
                    this.field4634 = null;
                    this.field4627 = null;
                } else {
                    this.field4622 = (byte) (this.field4622 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field4629.field3192 && this.field4599.field3192) {
                    this.field4619 = null;
                    this.field4613 = null;
                    this.field4620 = null;
                } else {
                    this.field4622 = (byte) (this.field4622 | 0x10);
                }
            }
            if (arg5) {
                this.field4603 = null;
                this.field4605 = null;
                this.field4615 = (int[][]) null;
                this.field4612 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "()I", line = 454)
    public final int method437() {
        if (!this.field4616.field2219) {
            this.method1863();
        }
        return this.field4616.field2218;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZZZZZZZZZZZ)Lfh;", line = 462)
    public final class267 method1847(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class267 var12 = new class267();
        var12.field4637 = this.field4637;
        var12.field4633 = this.field4633;
        var12.field4638 = this.field4638;
        if (arg0) {
            var12.field4607 = this.field4607;
            var12.field4602 = this.field4602;
        } else {
            var12.field4607 = class37.method248(this.field4607, 127);
            var12.field4602 = class37.method248(this.field4602, 126);
        }
        if (arg1) {
            var12.field4623 = this.field4623;
        } else {
            var12.field4623 = class37.method248(this.field4623, 125);
        }
        if (arg0 && arg1) {
            var12.field4632 = this.field4632;
            var12.field4616 = this.field4616;
        } else {
            var12.field4632 = new class191();
            var12.field4616 = new class134();
        }
        if (arg2) {
            var12.field4624 = this.field4624;
        } else {
            var12.field4624 = class58.method447(this.field4624, 32);
        }
        if (arg3) {
            var12.field4621 = this.field4621;
        } else {
            var12.field4621 = class73.method585(this.field4621, (byte) -120);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class308.field5243) {
            var12.field4599 = new class191();
        } else {
            var12.field4599 = this.field4599;
        }
        if (arg5) {
            var12.field4625 = this.field4625;
            var12.field4614 = this.field4614;
            var12.field4601 = this.field4601;
            var12.field4636 = this.field4636;
        } else {
            var12.field4625 = class58.method447(this.field4625, 32);
            var12.field4614 = class58.method447(this.field4614, 32);
            var12.field4601 = class58.method447(this.field4601, 32);
            var12.field4636 = class58.method447(this.field4636, 32);
        }
        if (!class308.field5243) {
            var12.field4611 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field4611 = this.field4611;
        } else {
            var12.field4611 = new class191();
        }
        if (arg8) {
            var12.field4634 = this.field4634;
            var12.field4627 = this.field4627;
            var12.field4606 = this.field4606;
        } else {
            var12.field4634 = class200.method1437(this.field4634, -22379);
            var12.field4627 = class200.method1437(this.field4627, -22379);
            var12.field4606 = new class191();
        }
        if (arg9) {
            var12.field4619 = this.field4619;
            var12.field4613 = this.field4613;
            var12.field4620 = this.field4620;
            var12.field4629 = this.field4629;
        } else {
            var12.field4619 = class58.method447(this.field4619, 32);
            var12.field4613 = class58.method447(this.field4613, 32);
            var12.field4620 = class58.method447(this.field4620, 32);
            var12.field4629 = new class191();
        }
        if (arg10) {
            var12.field4630 = this.field4630;
        } else {
            var12.field4630 = class58.method447(this.field4630, 32);
        }
        var12.field4603 = this.field4603;
        var12.field4615 = this.field4615;
        var12.field4605 = this.field4605;
        var12.field4612 = this.field4612;
        var12.field4609 = this.field4609;
        var12.field4618 = this.field4618;
        var12.field4628 = this.field4628;
        var12.field4604 = this.field4604;
        var12.field4631 = this.field4631;
        return var12;
    }

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "()V", line = 600)
    public final void method1848() {
        for (int var1 = 0; var1 < this.field4637; var1++) {
            this.field4602[var1] = -this.field4602[var1];
        }
        if (this.field4601 != null) {
            for (int var2 = 0; var2 < this.field4633; var2++) {
                this.field4601[var2] = (short) (-this.field4601[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field4638; var3++) {
            short var4 = this.field4619[var3];
            this.field4619[var3] = this.field4620[var3];
            this.field4620[var3] = var4;
        }
        this.field4616.field2219 = false;
        this.field4632.field3192 = false;
        if (this.field4611 != null) {
            this.field4611.field3192 = false;
        }
        this.field4629.field3192 = false;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZZZZZ)V", line = 637)
    private final void method1849(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field4632.field3193 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field4599.field3193 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field4611.field3193 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field4606.field3193 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field4635.field2758.length < this.field4633 * var6) {
            field4635 = new class170((this.field4633 + 100) * var6);
        } else {
            field4635.field2787 = 0;
        }
        if (arg1) {
            if (class55.field819) {
                for (int var7 = 0; var7 < this.field4637; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field4607[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field4623[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field4602[var7]);
                    int var11 = this.field4628[var7];
                    int var12 = this.field4628[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field4618[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field4635.field2787 = var6 * var14;
                        field4635.method1213(-1, var8);
                        field4635.method1213(-1, var9);
                        field4635.method1213(-1, var10);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field4637; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field4607[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field4623[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field4602[var15]);
                    int var19 = this.field4628[var15];
                    int var20 = this.field4628[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field4618[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field4635.field2787 = var6 * var22;
                        field4635.method1225(var16, true);
                        field4635.method1225(var17, true);
                        field4635.method1225(var18, true);
                    }
                }
            }
        }
        if (arg2) {
            if (class308.field5243) {
                for (int var42 = 0; var42 < this.field4638; var42++) {
                    int var43 = method1862(this.field4624[var42], this.field4630[var42], this.field4604, this.field4621[var42]);
                    field4635.field2787 = this.field4619[var42] * var6 + this.field4599.field3193;
                    field4635.method1213(-1, var43);
                    field4635.field2787 = this.field4613[var42] * var6 + this.field4599.field3193;
                    field4635.method1213(-1, var43);
                    field4635.field2787 = this.field4620[var42] * var6 + this.field4599.field3193;
                    field4635.method1213(-1, var43);
                }
            } else {
                int var23 = (int) class141.field2357[0];
                int var24 = (int) class141.field2357[1];
                int var25 = (int) class141.field2357[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field4604 * 1.3F);
                int var28 = this.field4631 * var26 >> 8;
                for (int var29 = 0; var29 < this.field4638; var29++) {
                    short var30 = this.field4619[var29];
                    short var31 = this.field4636[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field4601[var30] * var25 + this.field4625[var30] * var23 + this.field4614[var30] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field4601[var30] * var25 + this.field4625[var30] * var23 + this.field4614[var30] * var24) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field4636[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field4613[var29];
                    short var34 = this.field4636[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field4601[var33] * var25 + this.field4625[var33] * var23 + this.field4614[var33] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field4601[var33] * var25 + this.field4625[var33] * var23 + this.field4614[var33] * var24) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field4636[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field4620[var29];
                    short var37 = this.field4636[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field4601[var36] * var25 + this.field4625[var36] * var23 + this.field4614[var36] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field4601[var36] * var25 + this.field4625[var36] * var23 + this.field4614[var36] * var24) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field4636[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method1862(this.field4624[var29], this.field4630[var29], var32, this.field4621[var29]);
                    int var40 = method1862(this.field4624[var29], this.field4630[var29], var35, this.field4621[var29]);
                    int var41 = method1862(this.field4624[var29], this.field4630[var29], var38, this.field4621[var29]);
                    field4635.field2787 = var6 * var30 + this.field4599.field3193;
                    field4635.method1213(-1, var39);
                    field4635.field2787 = var6 * var33 + this.field4599.field3193;
                    field4635.method1213(-1, var40);
                    field4635.field2787 = var6 * var36 + this.field4599.field3193;
                    field4635.method1213(-1, var41);
                }
                this.field4625 = null;
                this.field4614 = null;
                this.field4601 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field4631;
            float var45 = 3.0F / (float) (this.field4631 / 2 + this.field4631);
            field4635.field2787 = this.field4611.field3193;
            if (class55.field819) {
                for (int var46 = 0; var46 < this.field4633; var46++) {
                    short var47 = this.field4636[var46];
                    if (var47 == 0) {
                        field4635.method1230((byte) 88, (float) this.field4625[var46] * var45);
                        field4635.method1230((byte) 93, (float) this.field4614[var46] * var45);
                        field4635.method1230((byte) 98, (float) this.field4601[var46] * var45);
                    } else {
                        float var48 = var44 / (float) var47;
                        field4635.method1230((byte) 114, (float) this.field4625[var46] * var48);
                        field4635.method1230((byte) 101, (float) this.field4614[var46] * var48);
                        field4635.method1230((byte) 95, (float) this.field4601[var46] * var48);
                    }
                    field4635.field2787 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field4633; var49++) {
                    short var50 = this.field4636[var49];
                    if (var50 == 0) {
                        field4635.method1252((float) this.field4625[var49] * var45, -74);
                        field4635.method1252((float) this.field4614[var49] * var45, -32);
                        field4635.method1252((float) this.field4601[var49] * var45, 84);
                    } else {
                        float var51 = var44 / (float) var50;
                        field4635.method1252((float) this.field4625[var49] * var51, 91);
                        field4635.method1252((float) this.field4614[var49] * var51, 101);
                        field4635.method1252((float) this.field4601[var49] * var51, -69);
                    }
                    field4635.field2787 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field4635.field2787 = this.field4606.field3193;
            if (class55.field819) {
                for (int var52 = 0; var52 < this.field4633; var52++) {
                    field4635.method1230((byte) 98, this.field4634[var52]);
                    field4635.method1230((byte) 98, this.field4627[var52]);
                    field4635.field2787 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field4633; var53++) {
                    field4635.method1252(this.field4634[var53], -42);
                    field4635.method1252(this.field4627[var53], 99);
                    field4635.field2787 += var6 - 8;
                }
            }
        }
        field4635.field2787 = this.field4633 * var6;
        if (arg0) {
            if (class55.field799) {
                ByteBuffer var54 = ByteBuffer.wrap(field4635.field2758, 0, field4635.field2787);
                if (this.field4626 == null) {
                    this.field4626 = new class225(true);
                    this.field4626.method1550(var54);
                } else {
                    this.field4626.method1551(var54);
                }
                if (arg1) {
                    this.field4632.field3192 = true;
                    this.field4632.field3194 = null;
                    this.field4632.field3196 = this.field4626;
                    this.field4632.field3195 = var6;
                }
                if (arg2) {
                    this.field4599.field3192 = true;
                    this.field4599.field3194 = null;
                    this.field4599.field3196 = this.field4626;
                    this.field4599.field3195 = var6;
                }
                if (arg3) {
                    this.field4611.field3192 = true;
                    this.field4611.field3194 = null;
                    this.field4611.field3196 = this.field4626;
                    this.field4611.field3195 = var6;
                }
                if (arg4) {
                    this.field4606.field3192 = true;
                    this.field4606.field3194 = null;
                    this.field4606.field3196 = this.field4626;
                    this.field4606.field3195 = var6;
                }
            } else {
                if (field4639 == null || field4639.capacity() < field4635.field2787) {
                    field4639 = ByteBuffer.allocateDirect(var6 * 100 + field4635.field2787);
                } else {
                    field4639.clear();
                }
                field4639.put(field4635.field2758, 0, field4635.field2787);
                field4639.flip();
                if (arg1) {
                    this.field4632.field3192 = true;
                    this.field4632.field3194 = field4639;
                    this.field4632.field3196 = null;
                    this.field4632.field3195 = var6;
                }
                if (arg2) {
                    this.field4599.field3192 = true;
                    this.field4599.field3194 = field4639;
                    this.field4632.field3196 = null;
                    this.field4599.field3195 = var6;
                }
                if (arg3) {
                    this.field4611.field3192 = true;
                    this.field4611.field3194 = field4639;
                    this.field4611.field3196 = null;
                    this.field4611.field3195 = var6;
                }
                if (arg4) {
                    this.field4606.field3192 = true;
                    this.field4606.field3194 = field4639;
                    this.field4606.field3196 = null;
                    this.field4606.field3195 = var6;
                }
            }
        } else if (class55.field798) {
            class225 var55 = new class225();
            ByteBuffer var56 = ByteBuffer.wrap(field4635.field2758, 0, field4635.field2787);
            var55.method1550(var56);
            if (arg1) {
                this.field4632.field3192 = true;
                this.field4632.field3194 = null;
                this.field4632.field3196 = var55;
                this.field4632.field3195 = var6;
            }
            if (arg2) {
                this.field4599.field3192 = true;
                this.field4599.field3194 = null;
                this.field4599.field3196 = var55;
                this.field4599.field3195 = var6;
            }
            if (arg3) {
                this.field4611.field3192 = true;
                this.field4611.field3194 = null;
                this.field4611.field3196 = var55;
                this.field4611.field3195 = var6;
            }
            if (arg4) {
                this.field4606.field3192 = true;
                this.field4606.field3194 = null;
                this.field4606.field3196 = var55;
                this.field4606.field3195 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field4635.field2787);
            var57.put(field4635.field2758, 0, field4635.field2787);
            var57.flip();
            if (arg1) {
                this.field4632.field3192 = true;
                this.field4632.field3194 = var57;
                this.field4632.field3196 = null;
                this.field4632.field3195 = var6;
            }
            if (arg2) {
                this.field4599.field3192 = true;
                this.field4599.field3194 = var57;
                this.field4632.field3196 = null;
                this.field4599.field3195 = var6;
            }
            if (arg3) {
                this.field4611.field3192 = true;
                this.field4611.field3194 = var57;
                this.field4611.field3196 = null;
                this.field4611.field3195 = var6;
            }
            if (arg4) {
                this.field4606.field3192 = true;
                this.field4606.field3194 = var57;
                this.field4606.field3196 = null;
                this.field4606.field3195 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "()I", line = 1165)
    public final int method1850() {
        return this.field4631;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "()I", line = 1168)
    public final int method152() {
        if (!this.field4616.field2219) {
            this.method1863();
        }
        return this.field4616.field2221;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIII[FFIF)V", line = 1174)
    private static final void method1851(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
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
        field4645 = var16;
        field4652 = var17;
    }

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "()V", line = 1219)
    public final void method1852() {
        if (this.field4625 == null) {
            this.method438();
            return;
        }
        for (int var1 = 0; var1 < this.field4637; var1++) {
            this.field4607[var1] = -this.field4607[var1];
            this.field4602[var1] = -this.field4602[var1];
        }
        for (int var2 = 0; var2 < this.field4633; var2++) {
            this.field4625[var2] = (short) (-this.field4625[var2]);
            this.field4601[var2] = (short) (-this.field4601[var2]);
        }
        this.field4616.field2219 = false;
        this.field4632.field3192 = false;
        if (this.field4611 != null) {
            this.field4611.field3192 = false;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lhe;IJIIIIFF)S", line = 1254)
    private final short method1853(class242 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field4628[arg1];
        int var12 = this.field4628[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field4618[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field4617[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field4618[var13] = (short) (this.field4633 + 1);
        field4617[var13] = arg2;
        this.field4625[this.field4633] = (short) arg3;
        this.field4614[this.field4633] = (short) arg4;
        this.field4601[this.field4633] = (short) arg5;
        this.field4636[this.field4633] = (short) arg6;
        this.field4634[this.field4633] = arg7;
        this.field4627[this.field4633] = arg8;
        return (short) (this.field4633++);
    }

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "()V", line = 1289)
    public static void method1854() {
        field4617 = null;
        field4635 = null;
        field4639 = null;
        field4640 = null;
        field4641 = null;
        field4642 = null;
        field4643 = null;
        field4648 = null;
        field4646 = null;
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V", line = 3730)
    private class267() {
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lhe;IIZ)V", line = 3733)
    public class267(class242 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field4021];
        this.field4628 = new int[arg0.field4048 + 1];
        for (int var6 = 0; var6 < arg0.field4021; var6++) {
            if ((arg0.field4052 == null || arg0.field4052[var6] != 2) && (arg0.field4013 == null || arg0.field4013[var6] == -1 || !class298.field5107.method383(arg0.field4013[var6] & 0xFFFF, -46))) {
                var5[this.field4638++] = var6;
                this.field4628[arg0.field4044[var6]]++;
                this.field4628[arg0.field4027[var6]]++;
                this.field4628[arg0.field4046[var6]]++;
            }
        }
        long[] var7 = new long[this.field4638];
        for (int var8 = 0; var8 < this.field4638; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field4013 != null) {
                var14 = arg0.field4013[var9];
                if (var14 != -1) {
                    var12 = class298.field5107.method373(var14 & 0xFFFF, (byte) -128);
                    var13 = class298.field5107.method384((byte) 126, var14 & 0xFFFF);
                }
            }
            boolean var15 = arg0.field4033 != null && arg0.field4033[var9] != 0 || var14 != -1 && !class298.field5107.method381((byte) 42, var14 & 0xFFFF);
            if ((arg3 || var15) && arg0.field4012 != null) {
                var10 += arg0.field4012[var9] << 17;
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
        class20.method137(19085, var7, var5);
        this.field4637 = arg0.field4048;
        this.field4607 = arg0.field4009;
        this.field4623 = arg0.field4008;
        this.field4602 = arg0.field4041;
        this.field4603 = arg0.field4018;
        int var20 = this.field4638 * 3;
        this.field4625 = new short[var20];
        this.field4614 = new short[var20];
        this.field4601 = new short[var20];
        this.field4636 = new short[var20];
        this.field4634 = new float[var20];
        this.field4627 = new float[var20];
        this.field4624 = new short[this.field4638];
        this.field4621 = new byte[this.field4638];
        this.field4619 = new short[this.field4638];
        this.field4613 = new short[this.field4638];
        this.field4620 = new short[this.field4638];
        this.field4630 = new short[this.field4638];
        if (arg0.field4017 != null) {
            this.field4605 = new byte[this.field4638];
        }
        this.field4616 = new class134();
        this.field4632 = new class191();
        this.field4599 = new class191();
        if (class308.field5243) {
            this.field4611 = new class191();
        }
        this.field4606 = new class191();
        this.field4629 = new class191();
        this.field4604 = (short) arg1;
        this.field4631 = (short) arg2;
        this.field4618 = new short[var20];
        field4617 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < arg0.field4048; var22++) {
            int var23 = this.field4628[var22];
            this.field4628[var22] = var21;
            var21 += var23;
        }
        this.field4628[arg0.field4048] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field4011 != null) {
            int var28 = arg0.field4020;
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
            for (int var36 = 0; var36 < this.field4638; var36++) {
                int var37 = var5[var36];
                if (arg0.field4011[var37] != -1) {
                    int var38 = arg0.field4011[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field4044[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field4027[var37];
                        } else {
                            var40 = arg0.field4046[var37];
                        }
                        int var41 = arg0.field4009[var40];
                        int var42 = arg0.field4008[var40];
                        int var43 = arg0.field4041[var40];
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
                byte var45 = arg0.field4035[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field4036[var44];
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
                        var49 = 64.0F / (float) (arg0.field4045[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field4036[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field4045[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field4023[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field4036[var44] / 1024.0F;
                        var49 = (float) arg0.field4045[var44] / 1024.0F;
                        var48 = (float) arg0.field4023[var44] / 1024.0F;
                    }
                    var27[var44] = method1857(arg0.field4037[var44], arg0.field4025[var44], arg0.field4010[var44], arg0.field4032[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field4638; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field4040[var51] & 0xFFFF;
            short var53;
            if (arg0.field4013 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field4013[var51];
            }
            int var54;
            if (arg0.field4011 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field4011[var51];
            }
            int var55;
            if (arg0.field4033 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field4033[var51] & 0xFF;
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
                    byte var65 = arg0.field4035[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field4044[var51];
                        int var67 = arg0.field4027[var51];
                        int var68 = arg0.field4046[var51];
                        short var69 = arg0.field4037[var54];
                        short var70 = arg0.field4025[var54];
                        short var71 = arg0.field4010[var54];
                        float var72 = (float) arg0.field4009[var69];
                        float var73 = (float) arg0.field4008[var69];
                        float var74 = (float) arg0.field4041[var69];
                        float var75 = (float) arg0.field4009[var70] - var72;
                        float var76 = (float) arg0.field4008[var70] - var73;
                        float var77 = (float) arg0.field4041[var70] - var74;
                        float var78 = (float) arg0.field4009[var71] - var72;
                        float var79 = (float) arg0.field4008[var71] - var73;
                        float var80 = (float) arg0.field4041[var71] - var74;
                        float var81 = (float) arg0.field4009[var66] - var72;
                        float var82 = (float) arg0.field4008[var66] - var73;
                        float var83 = (float) arg0.field4041[var66] - var74;
                        float var84 = (float) arg0.field4009[var67] - var72;
                        float var85 = (float) arg0.field4008[var67] - var73;
                        float var86 = (float) arg0.field4041[var67] - var74;
                        float var87 = (float) arg0.field4009[var68] - var72;
                        float var88 = (float) arg0.field4008[var68] - var73;
                        float var89 = (float) arg0.field4041[var68] - var74;
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
                        int var101 = arg0.field4044[var51];
                        int var102 = arg0.field4027[var51];
                        int var103 = arg0.field4046[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field4053[var54];
                        float var109 = (float) arg0.field4055[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field4023[var54] & 0xFFFF) / 1024.0F;
                            method1851(arg0.field4009[var101], arg0.field4008[var101], arg0.field4041[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field4645;
                            var57 = field4652;
                            method1851(arg0.field4009[var102], arg0.field4008[var102], arg0.field4041[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field4645;
                            var59 = field4652;
                            method1851(arg0.field4009[var103], arg0.field4008[var103], arg0.field4041[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field4645;
                            var61 = field4652;
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
                            float var112 = (float) arg0.field4022[var54] / 256.0F;
                            float var113 = (float) arg0.field4031[var54] / 256.0F;
                            int var114 = arg0.field4009[var102] - arg0.field4009[var101];
                            int var115 = arg0.field4008[var102] - arg0.field4008[var101];
                            int var116 = arg0.field4041[var102] - arg0.field4041[var101];
                            int var117 = arg0.field4009[var103] - arg0.field4009[var101];
                            int var118 = arg0.field4008[var103] - arg0.field4008[var101];
                            int var119 = arg0.field4041[var103] - arg0.field4041[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field4036[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field4045[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field4023[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method1844(var126, var127, var128);
                            method1874(arg0.field4009[var101], arg0.field4008[var101], arg0.field4041[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field4644;
                            var57 = field4654;
                            method1874(arg0.field4009[var102], arg0.field4008[var102], arg0.field4041[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field4644;
                            var59 = field4654;
                            method1874(arg0.field4009[var103], arg0.field4008[var103], arg0.field4041[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field4644;
                            var61 = field4654;
                        } else if (var65 == 3) {
                            method1842(arg0.field4009[var101], arg0.field4008[var101], arg0.field4041[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field4653;
                            var57 = field4651;
                            method1842(arg0.field4009[var102], arg0.field4008[var102], arg0.field4041[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field4653;
                            var59 = field4651;
                            method1842(arg0.field4009[var103], arg0.field4008[var103], arg0.field4041[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field4653;
                            var61 = field4651;
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
            arg0.method1723();
            byte var129;
            if (arg0.field4052 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field4052[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field4044[var51];
                class293 var133 = arg0.field4007[var132];
                this.field4619[var50] = this.method1853(arg0, var132, var130, var133.field5006, var133.field5011, var133.field5000, var133.field5009, var56, var57);
                int var134 = arg0.field4027[var51];
                class293 var135 = arg0.field4007[var134];
                this.field4613[var50] = this.method1853(arg0, var134, (long) var62 + var130, var135.field5006, var135.field5011, var135.field5000, var135.field5009, var58, var59);
                int var136 = arg0.field4046[var51];
                class293 var137 = arg0.field4007[var136];
                this.field4620[var50] = this.method1853(arg0, var136, (long) var63 + var130, var137.field5006, var137.field5011, var137.field5000, var137.field5009, var60, var61);
            } else if (var129 == 1) {
                class254 var138 = arg0.field4034[var51];
                long var139 = (long) ((var54 << 2) + (var138.field4210 > 0 ? 1024 : 2048) + (var138.field4214 + 256 << 12) + (var138.field4222 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field4619[var50] = this.method1853(arg0, arg0.field4044[var51], var139, var138.field4210, var138.field4214, var138.field4222, 0, var56, var57);
                this.field4613[var50] = this.method1853(arg0, arg0.field4027[var51], (long) var62 + var139, var138.field4210, var138.field4214, var138.field4222, 0, var58, var59);
                this.field4620[var50] = this.method1853(arg0, arg0.field4046[var51], (long) var63 + var139, var138.field4210, var138.field4214, var138.field4222, 0, var60, var61);
            }
            if (arg0.field4013 == null) {
                this.field4630[var50] = -1;
            } else {
                this.field4630[var50] = arg0.field4013[var51];
            }
            if (this.field4605 != null) {
                this.field4605[var50] = (byte) arg0.field4017[var51];
            }
            this.field4624[var50] = arg0.field4040[var51];
            if (arg0.field4033 != null) {
                this.field4621[var50] = arg0.field4033[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field4638; var143++) {
            short var144 = this.field4630[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field4609 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field4638; var147++) {
            short var148 = this.field4630[var147];
            if (var146 != var148) {
                this.field4609[var145++] = var147;
                var146 = var148;
            }
        }
        this.field4609[var145] = this.field4638;
        field4617 = null;
        this.field4625 = method1861(this.field4625, this.field4633);
        this.field4614 = method1861(this.field4614, this.field4633);
        this.field4601 = method1861(this.field4601, this.field4633);
        this.field4636 = method1861(this.field4636, this.field4633);
        this.field4634 = method1845(this.field4634, this.field4633);
        this.field4627 = method1845(this.field4627, this.field4633);
    }

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "()V", line = 1304)
    public final void method1855() {
        int var10002;
        if (this.field4603 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field4637; var3++) {
                int var4 = this.field4603[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field4615 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field4615[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field4637) {
                int var7 = this.field4603[var6] & 0xFF;
                this.field4615[var7][var1[var7]++] = var6++;
            }
            this.field4603 = null;
        }
        if (this.field4605 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field4638; var10++) {
            int var11 = this.field4605[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field4612 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field4612[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field4638) {
            int var14 = this.field4605[var13] & 0xFF;
            this.field4612[var14][var8[var14]++] = var13++;
        }
        this.field4605 = null;
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)V", line = 1396)
    public final void method1856(int arg0) {
        if (this.field4625 == null) {
            this.method439(arg0);
            return;
        }
        int var2 = class298.field5095[arg0];
        int var3 = class298.field5094[arg0];
        for (int var4 = 0; var4 < this.field4637; var4++) {
            int var5 = this.field4607[var4] * var3 + this.field4602[var4] * var2 >> 16;
            this.field4602[var4] = this.field4602[var4] * var3 - this.field4607[var4] * var2 >> 16;
            this.field4607[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field4633; var6++) {
            int var7 = this.field4625[var6] * var3 + this.field4601[var6] * var2 >> 16;
            this.field4601[var6] = (short) (this.field4601[var6] * var3 - this.field4625[var6] * var2 >> 16);
            this.field4625[var6] = (short) var7;
        }
        this.field4616.field2219 = false;
        this.field4632.field3192 = false;
        if (this.field4611 != null) {
            this.field4611.field3192 = false;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIFFF)[F", line = 1438)
    private static final float[] method1857(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
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

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "()I", line = 1513)
    public final int method440() {
        if (!this.field4616.field2219) {
            this.method1863();
        }
        return this.field4616.field2217;
    }

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "()I", line = 1521)
    public final int method436() {
        if (!this.field4616.field2219) {
            this.method1863();
        }
        return this.field4616.field2224;
    }

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "()V", line = 1527)
    private final void method1858() {
        if (field4635.field2758.length < this.field4633 * 12) {
            field4635 = new class170((this.field4633 + 100) * 12);
        } else {
            field4635.field2787 = 0;
        }
        if (class55.field819) {
            for (int var1 = 0; var1 < this.field4638; var1++) {
                field4635.method1213(-1, this.field4619[var1]);
                field4635.method1213(-1, this.field4613[var1]);
                field4635.method1213(-1, this.field4620[var1]);
            }
        } else {
            for (int var2 = 0; var2 < this.field4638; var2++) {
                field4635.method1225(this.field4619[var2], true);
                field4635.method1225(this.field4613[var2], true);
                field4635.method1225(this.field4620[var2], true);
            }
        }
        if (!class55.field798) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field4635.field2787);
            var5.put(field4635.field2758, 0, field4635.field2787);
            var5.flip();
            this.field4629.field3192 = true;
            this.field4629.field3194 = var5;
            this.field4629.field3196 = null;
            return;
        }
        class225 var3 = new class225();
        ByteBuffer var4 = ByteBuffer.wrap(field4635.field2758, 0, field4635.field2787);
        var3.method1550(var4);
        this.field4629.field3192 = true;
        this.field4629.field3194 = null;
        this.field4629.field3196 = var3;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ld;ILd;I[IZ)V", line = 1586)
    public final void method445(class40 arg0, int arg1, class40 arg2, int arg3, int[] arg4, boolean arg5) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method434(arg0, arg1, arg5);
            return;
        }
        class196 var7 = arg0.field605[arg1];
        class196 var8 = arg2.field605[arg3];
        class88 var9 = var7.field3238;
        for (int var10 = 0; var10 < this.field4637; var10++) {
            this.field4607[var10] <<= 0x4;
            this.field4623[var10] <<= 0x4;
            this.field4602[var10] <<= 0x4;
        }
        field4647 = 0;
        field4650 = 0;
        field4649 = 0;
        byte var11 = 0;
        int var20 = var11 + 1;
        int var12 = arg4[var11];
        for (int var13 = 0; var13 < var7.field3246; var13++) {
            short var14 = var7.field3237[var13];
            while (var14 > var12) {
                var12 = arg4[var20++];
            }
            if (var12 != var14 || var9.field1399[var14] == 0) {
                if (var7.field3239[var13] != -1) {
                    this.method1865(0, var9.field1395[var7.field3239[var13]], 0, 0, 0, arg5);
                }
                this.method1865(var9.field1399[var14], var9.field1395[var14], var7.field3241[var13], var7.field3244[var13], var7.field3242[var13], arg5);
            }
        }
        field4647 = 0;
        field4650 = 0;
        field4649 = 0;
        byte var15 = 0;
        int var21 = var15 + 1;
        int var16 = arg4[var15];
        for (int var17 = 0; var17 < var8.field3246; var17++) {
            short var18 = var8.field3237[var17];
            while (var18 > var16) {
                var16 = arg4[var21++];
            }
            if (var16 == var18 || var9.field1399[var18] == 0) {
                if (var8.field3239[var17] != -1) {
                    this.method1865(0, var9.field1395[var8.field3239[var17]], 0, 0, 0, arg5);
                }
                this.method1865(var9.field1399[var18], var9.field1395[var18], var8.field3241[var17], var8.field3244[var17], var8.field3242[var17], arg5);
            }
        }
        for (int var19 = 0; var19 < this.field4637; var19++) {
            this.field4607[var19] >>= 0x4;
            this.field4623[var19] >>= 0x4;
            this.field4602[var19] >>= 0x4;
        }
        this.field4616.field2219 = false;
        this.field4632.field3192 = false;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(SS)V", line = 1686)
    public final void method1859(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field4638; var3++) {
            if (this.field4624[var3] == arg0) {
                this.field4624[var3] = arg1;
            }
        }
        this.field4599.field3192 = false;
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "()I", line = 1698)
    public final int method426() {
        if (!this.field4616.field2219) {
            this.method1863();
        }
        return this.field4616.field2222;
    }

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "()V", line = 1708)
    public final void method1860() {
        if (this.field4625 == null) {
            this.method425();
            return;
        }
        for (int var1 = 0; var1 < this.field4637; var1++) {
            int var2 = this.field4602[var1];
            this.field4602[var1] = this.field4607[var1];
            this.field4607[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field4633; var3++) {
            short var4 = this.field4601[var3];
            this.field4601[var3] = this.field4625[var3];
            this.field4625[var3] = (short) (-var4);
        }
        this.field4616.field2219 = false;
        this.field4632.field3192 = false;
        if (this.field4611 != null) {
            this.field4611.field3192 = false;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIII)V", line = 1745)
    public final void method427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field4633 == 0) {
            return;
        }
        GL var8 = class55.field812;
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
        this.method1875();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZZ)Lca;", line = 1768)
    public final class57 method429(boolean arg0, boolean arg1) {
        return this.method1866(arg0, arg1, field4643, field4642);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "([SI)[S", line = 1772)
    private static final short[] method1861(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class63.method521(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)Lfg;", line = 1777)
    public final class176 method1309(int arg0, int arg1, int arg2) {
        this.field4610 = false;
        if (this.field4608 != null) {
            this.field4625 = this.field4608.field1177;
            this.field4614 = this.field4608.field1179;
            this.field4601 = this.field4608.field1176;
            this.field4636 = this.field4608.field1178;
            this.field4608 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ISIB)I", line = 1791)
    private static final int method1862(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class298.field5102[class258.method1790(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class298.field5107.method380(arg1 & 0xFFFF, 255);
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
            int var9 = class298.field5107.method378(-27774, arg1 & 0xFFFF);
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

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "()V", line = 1852)
    private final void method1863() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field4637; var9++) {
            int var10 = this.field4607[var9];
            int var11 = this.field4623[var9];
            int var12 = this.field4602[var9];
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
        this.field4616.field2217 = (short) var1;
        this.field4616.field2224 = (short) var4;
        this.field4616.field2221 = (short) var2;
        this.field4616.field2220 = (short) var5;
        this.field4616.field2223 = (short) var3;
        this.field4616.field2222 = (short) var6;
        this.field4616.field2218 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field4616.field2219 = true;
    }

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "()V", line = 1924)
    public final void method438() {
        for (int var1 = 0; var1 < this.field4637; var1++) {
            this.field4607[var1] = -this.field4607[var1];
            this.field4602[var1] = -this.field4602[var1];
        }
        this.field4616.field2219 = false;
        this.field4632.field3192 = false;
    }

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "(I)V", line = 1936)
    public final void method1864(int arg0) {
        this.field4604 = (short) arg0;
        this.field4599.field3192 = false;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I[IIIIZ)V", line = 1941)
    private final void method1865(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field4647 = 0;
            field4650 = 0;
            field4649 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field4615.length) {
                    int[] var14 = this.field4615[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field4647 += this.field4607[var16];
                        field4650 += this.field4623[var16];
                        field4649 += this.field4602[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field4647 = field4647 / var11 + var8;
                field4650 = field4650 / var11 + var9;
                field4649 = field4649 / var11 + var10;
            } else {
                field4647 = var8;
                field4650 = var9;
                field4649 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field4615.length) {
                    int[] var22 = this.field4615[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field4607[var24] += var17;
                        this.field4623[var24] += var18;
                        this.field4602[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field4615.length) {
                    int[] var27 = this.field4615[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field4607[var29] -= field4647;
                        this.field4623[var29] -= field4650;
                        this.field4602[var29] -= field4649;
                        if (arg4 != 0) {
                            int var30 = class298.field5095[arg4];
                            int var31 = class298.field5094[arg4];
                            int var32 = this.field4623[var29] * var30 + this.field4607[var29] * var31 + 32767 >> 16;
                            this.field4623[var29] = this.field4623[var29] * var31 + 32767 - this.field4607[var29] * var30 >> 16;
                            this.field4607[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class298.field5095[arg2];
                            int var34 = class298.field5094[arg2];
                            int var35 = this.field4623[var29] * var34 + 32767 - this.field4602[var29] * var33 >> 16;
                            this.field4602[var29] = this.field4623[var29] * var33 + this.field4602[var29] * var34 + 32767 >> 16;
                            this.field4623[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class298.field5095[arg3];
                            int var37 = class298.field5094[arg3];
                            int var38 = this.field4607[var29] * var37 + this.field4602[var29] * var36 + 32767 >> 16;
                            this.field4602[var29] = this.field4602[var29] * var37 + 32767 - this.field4607[var29] * var36 >> 16;
                            this.field4607[var29] = var38;
                        }
                        this.field4607[var29] += field4647;
                        this.field4623[var29] += field4650;
                        this.field4602[var29] += field4649;
                    }
                }
            }
            if (arg5 && this.field4625 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field4615.length) {
                        int[] var41 = this.field4615[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field4628[var43];
                            int var45 = this.field4628[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field4618[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class298.field5095[arg4];
                                    int var49 = class298.field5094[arg4];
                                    int var50 = this.field4625[var47] * var49 + this.field4614[var47] * var48 + 32767 >> 16;
                                    this.field4614[var47] = (short) (this.field4614[var47] * var49 + 32767 - this.field4625[var47] * var48 >> 16);
                                    this.field4625[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class298.field5095[arg2];
                                    int var52 = class298.field5094[arg2];
                                    int var53 = this.field4614[var47] * var52 + 32767 - this.field4601[var47] * var51 >> 16;
                                    this.field4601[var47] = (short) (this.field4614[var47] * var51 + this.field4601[var47] * var52 + 32767 >> 16);
                                    this.field4614[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class298.field5095[arg3];
                                    int var55 = class298.field5094[arg3];
                                    int var56 = this.field4625[var47] * var55 + this.field4601[var47] * var54 + 32767 >> 16;
                                    this.field4601[var47] = (short) (this.field4601[var47] * var55 + 32767 - this.field4625[var47] * var54 >> 16);
                                    this.field4625[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field4611 != null) {
                    this.field4611.field3192 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field4615.length) {
                    int[] var59 = this.field4615[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field4607[var61] -= field4647;
                        this.field4623[var61] -= field4650;
                        this.field4602[var61] -= field4649;
                        this.field4607[var61] = this.field4607[var61] * arg2 >> 7;
                        this.field4623[var61] = this.field4623[var61] * arg3 >> 7;
                        this.field4602[var61] = this.field4602[var61] * arg4 >> 7;
                        this.field4607[var61] += field4647;
                        this.field4623[var61] += field4650;
                        this.field4602[var61] += field4649;
                    }
                }
            }
        } else if (arg0 == 5 && this.field4612 != null && this.field4621 != null) {
            for (int var62 = 0; var62 < var7; var62++) {
                int var63 = arg1[var62];
                if (var63 < this.field4612.length) {
                    int[] var64 = this.field4612[var63];
                    for (int var65 = 0; var65 < var64.length; var65++) {
                        int var66 = var64[var65];
                        int var67 = (this.field4621[var66] & 0xFF) + arg2 * 8;
                        if (var67 < 0) {
                            var67 = 0;
                        } else if (var67 > 255) {
                            var67 = 255;
                        }
                        this.field4621[var66] = (byte) var67;
                    }
                    if (var64.length > 0) {
                        this.field4599.field3192 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "()I", line = 2284)
    public final int method435() {
        if (!this.field4616.field2219) {
            this.method1863();
        }
        return this.field4616.field2223;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZZLfh;Lfh;)Lca;", line = 2290)
    private final class57 method1866(boolean arg0, boolean arg1, class267 arg2, class267 arg3) {
        arg2.field4637 = this.field4637;
        arg2.field4633 = this.field4633;
        arg2.field4638 = this.field4638;
        arg2.field4604 = this.field4604;
        arg2.field4631 = this.field4631;
        arg2.field4600 = (byte) ((arg0 ? 0 : 2) | 0x1 | (arg1 ? 0 : 4));
        if (arg2.field4607 == null || arg2.field4607.length < this.field4637) {
            arg2.field4607 = new int[this.field4637 + 100];
            arg2.field4623 = new int[this.field4637 + 100];
            arg2.field4602 = new int[this.field4637 + 100];
        }
        for (int var5 = 0; var5 < this.field4637; var5++) {
            arg2.field4607[var5] = this.field4607[var5];
            arg2.field4623[var5] = this.field4623[var5];
            arg2.field4602[var5] = this.field4602[var5];
        }
        if (arg2.field4632 == null) {
            arg2.field4632 = new class191();
        }
        arg2.field4632.field3192 = false;
        if (arg2.field4616 == null) {
            arg2.field4616 = new class134();
        }
        arg2.field4616.field2219 = false;
        if (arg0) {
            arg2.field4621 = this.field4621;
            arg2.field4599 = this.field4599;
        } else {
            if (arg3.field4621 == null || arg3.field4621.length < this.field4638) {
                arg3.field4621 = new byte[this.field4638 + 100];
            }
            arg2.field4621 = arg3.field4621;
            for (int var6 = 0; var6 < this.field4638; var6++) {
                arg2.field4621[var6] = this.field4621[var6];
            }
            if (arg3.field4599 == null) {
                arg3.field4599 = new class191();
            }
            arg2.field4599 = arg3.field4599;
            arg2.field4599.field3192 = false;
        }
        if (arg1) {
            arg2.field4625 = this.field4625;
            arg2.field4614 = this.field4614;
            arg2.field4601 = this.field4601;
            arg2.field4636 = this.field4636;
            arg2.field4611 = this.field4611;
        } else {
            if (arg3.field4625 == null || arg3.field4625.length < this.field4633) {
                arg3.field4625 = new short[this.field4633 + 100];
                arg3.field4614 = new short[this.field4633 + 100];
                arg3.field4601 = new short[this.field4633 + 100];
                arg3.field4636 = new short[this.field4633 + 100];
            }
            arg2.field4625 = arg3.field4625;
            arg2.field4614 = arg3.field4614;
            arg2.field4601 = arg3.field4601;
            arg2.field4636 = arg3.field4636;
            for (int var7 = 0; var7 < this.field4633; var7++) {
                arg2.field4625[var7] = this.field4625[var7];
                arg2.field4614[var7] = this.field4614[var7];
                arg2.field4601[var7] = this.field4601[var7];
                arg2.field4636[var7] = this.field4636[var7];
            }
            if (class308.field5243) {
                if (arg3.field4611 == null) {
                    arg3.field4611 = new class191();
                }
                arg2.field4611 = arg3.field4611;
                arg2.field4611.field3192 = false;
            } else {
                arg2.field4611 = null;
            }
        }
        arg2.field4634 = this.field4634;
        arg2.field4627 = this.field4627;
        arg2.field4603 = this.field4603;
        arg2.field4615 = this.field4615;
        arg2.field4624 = this.field4624;
        arg2.field4619 = this.field4619;
        arg2.field4613 = this.field4613;
        arg2.field4620 = this.field4620;
        arg2.field4630 = this.field4630;
        arg2.field4605 = this.field4605;
        arg2.field4612 = this.field4612;
        arg2.field4606 = this.field4606;
        arg2.field4629 = this.field4629;
        arg2.field4609 = this.field4609;
        arg2.field4618 = this.field4618;
        arg2.field4628 = this.field4628;
        arg2.field844 = this.field844;
        return arg2;
    }

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "()V", line = 2414)
    public final void method1867() {
        if (this.field4625 == null) {
            this.method430();
            return;
        }
        for (int var1 = 0; var1 < this.field4637; var1++) {
            int var2 = this.field4607[var1];
            this.field4607[var1] = this.field4602[var1];
            this.field4602[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field4633; var3++) {
            short var4 = this.field4625[var3];
            this.field4625[var3] = this.field4601[var3];
            this.field4601[var3] = (short) (-var4);
        }
        this.field4616.field2219 = false;
        this.field4632.field3192 = false;
        if (this.field4611 != null) {
            this.field4611.field3192 = false;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lfg;IIIZ)V", line = 2456)
    public final void method1307(class176 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class267 var6 = (class267) arg0;
        if (this.field4638 == 0 || var6.field4638 == 0) {
            return;
        }
        int var7 = var6.field4637;
        int[] var8 = var6.field4607;
        int[] var9 = var6.field4623;
        int[] var10 = var6.field4602;
        short[] var11 = var6.field4625;
        short[] var12 = var6.field4614;
        short[] var13 = var6.field4601;
        short[] var14 = var6.field4636;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field4608 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field4608.field1177;
            var16 = this.field4608.field1179;
            var17 = this.field4608.field1176;
            var18 = this.field4608.field1178;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field4608 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field4608.field1177;
            var20 = var6.field4608.field1179;
            var21 = var6.field4608.field1176;
            var22 = var6.field4608.field1178;
        }
        int[] var23 = var6.field4628;
        short[] var24 = var6.field4618;
        if (!var6.field4616.field2219) {
            var6.method1863();
        }
        short var25 = var6.field4616.field2221;
        short var26 = var6.field4616.field2220;
        short var27 = var6.field4616.field2217;
        short var28 = var6.field4616.field2224;
        short var29 = var6.field4616.field2223;
        short var30 = var6.field4616.field2222;
        for (int var31 = 0; var31 < this.field4637; var31++) {
            int var32 = this.field4623[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field4607[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field4602[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field4628[var31];
                        int var37 = this.field4628[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field4618[var38] - 1;
                            if (var35 == -1 || this.field4636[var35] != 0) {
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
                                            this.field4608 = new class74();
                                            var15 = this.field4608.field1177 = class58.method447(this.field4625, 32);
                                            var16 = this.field4608.field1179 = class58.method447(this.field4614, 32);
                                            var17 = this.field4608.field1176 = class58.method447(this.field4601, 32);
                                            var18 = this.field4608.field1178 = class58.method447(this.field4636, 32);
                                        }
                                        if (var19 == null) {
                                            class74 var44 = var6.field4608 = new class74();
                                            var19 = var44.field1177 = class58.method447(var11, 32);
                                            var20 = var44.field1179 = class58.method447(var12, 32);
                                            var21 = var44.field1176 = class58.method447(var13, 32);
                                            var22 = var44.field1178 = class58.method447(var14, 32);
                                        }
                                        short var45 = this.field4625[var35];
                                        short var46 = this.field4614[var35];
                                        short var47 = this.field4601[var35];
                                        short var48 = this.field4636[var35];
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
                                        int var57 = this.field4628[var31];
                                        int var58 = this.field4628[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field4618[var59] - 1;
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

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Llj;)Llj;", line = 2696)
    public final class5 method1868(class5 arg0) {
        if (this.field4633 == 0) {
            return null;
        }
        if (!this.field4616.field2219) {
            this.method1863();
        }
        int var2;
        int var3;
        if (class141.field2351 > 0) {
            var2 = this.field4616.field2217 - (class141.field2351 * this.field4616.field2220 >> 8) >> 3;
            var3 = this.field4616.field2224 - (class141.field2351 * this.field4616.field2221 >> 8) >> 3;
        } else {
            var2 = this.field4616.field2217 - (class141.field2351 * this.field4616.field2221 >> 8) >> 3;
            var3 = this.field4616.field2224 - (class141.field2351 * this.field4616.field2220 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class141.field2353 > 0) {
            var4 = this.field4616.field2223 - (class141.field2353 * this.field4616.field2220 >> 8) >> 3;
            var5 = this.field4616.field2222 - (class141.field2353 * this.field4616.field2221 >> 8) >> 3;
        } else {
            var4 = this.field4616.field2223 - (class141.field2353 * this.field4616.field2221 >> 8) >> 3;
            var5 = this.field4616.field2222 - (class141.field2353 * this.field4616.field2220 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class5 var8;
        if (arg0 == null || arg0.field59.length < var6 * var7) {
            var8 = new class5(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field3173 = arg0.field3162 = var6;
            arg0.field3168 = arg0.field3157 = var7;
            arg0.method36();
        }
        var8.field3165 = var2;
        var8.field3171 = var4;
        if (field4648.length < this.field4633) {
            field4648 = new int[this.field4633];
            field4646 = new int[this.field4633];
        }
        for (int var9 = 0; var9 < this.field4637; var9++) {
            int var10 = (this.field4607[var9] - (this.field4623[var9] * class141.field2351 >> 8) >> 3) - var2;
            int var11 = (this.field4602[var9] - (this.field4623[var9] * class141.field2353 >> 8) >> 3) - var4;
            int var12 = this.field4628[var9];
            int var13 = this.field4628[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field4618[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field4648[var15] = var10;
                field4646[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field4638; var16++) {
            if (this.field4621[var16] <= 128) {
                short var17 = this.field4619[var16];
                short var18 = this.field4613[var16];
                short var19 = this.field4620[var16];
                int var20 = field4648[var17];
                int var21 = field4648[var18];
                int var22 = field4648[var19];
                int var23 = field4646[var17];
                int var24 = field4646[var18];
                int var25 = field4646[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class298.method2088(var8.field59, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "()Z", line = 2819)
    public final boolean method1310() {
        return this.field4610 && this.field4607 != null && this.field4625 != null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V", line = 2825)
    public final void method428(int arg0) {
        int var2 = class298.field5095[arg0];
        int var3 = class298.field5094[arg0];
        for (int var4 = 0; var4 < this.field4637; var4++) {
            int var5 = this.field4623[var4] * var3 - this.field4602[var4] * var2 >> 16;
            this.field4602[var4] = this.field4623[var4] * var2 + this.field4602[var4] * var3 >> 16;
            this.field4623[var4] = var5;
        }
        this.field4616.field2219 = false;
        this.field4632.field3192 = false;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIIIIJ)V", line = 2844)
    public final void method150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        if (this.field4633 == 0) {
            return;
        }
        if (!this.field4616.field2219) {
            this.method1863();
        }
        short var11 = this.field4616.field2218;
        short var12 = this.field4616.field2221;
        short var13 = this.field4616.field2220;
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
        if (var19 / var16 <= class268.field4662) {
            return;
        }
        int var20 = var18 - var11 << 9;
        if (var20 / var16 >= class233.field3837) {
            return;
        }
        int var21 = arg2 * arg6 - arg1 * var14 >> 16;
        int var22 = (arg1 * var11 + arg2 * var13 >> 16) + var21 << 9;
        if (var22 / var16 <= class72.field1130) {
            return;
        }
        int var23 = (-var11 * arg1 + arg2 * var12 >> 16) + var21 << 9;
        if (var23 / var16 >= class286.field4916) {
            return;
        }
        int var24 = 0;
        int var25 = 0;
        if (arg0 != 0) {
            var24 = class298.field5095[arg0];
            var25 = class298.field5094[arg0];
        }
        if (arg8 > 0L && class263.field4512 && var17 > 0) {
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
            if (class58.field852 >= var26 && class58.field852 <= var27 && class68.field1051 >= var28 && class68.field1051 <= var29) {
                int var30 = 999999;
                int var31 = -999999;
                int var32 = 999999;
                int var33 = -999999;
                short var34 = this.field4616.field2217;
                short var35 = this.field4616.field2224;
                short var36 = this.field4616.field2223;
                short var37 = this.field4616.field2222;
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
                if (class58.field852 >= var30 && class58.field852 <= var31 && class68.field1051 >= var32 && class68.field1051 <= var33) {
                    if (this.field844) {
                        class215.field3521[class26.field336++] = arg8;
                    } else {
                        if (field4648.length < this.field4633) {
                            field4648 = new int[this.field4633];
                            field4646 = new int[this.field4633];
                        }
                        int var57 = 0;
                        label118: while (true) {
                            if (var57 >= this.field4637) {
                                int var77 = 0;
                                while (true) {
                                    if (var77 >= this.field4638) {
                                        break label118;
                                    }
                                    short var78 = this.field4619[var77];
                                    short var79 = this.field4613[var77];
                                    short var80 = this.field4620[var77];
                                    if (this.method1871(class58.field852, class68.field1051, field4646[var78], field4646[var79], field4646[var80], field4648[var78], field4648[var79], field4648[var80])) {
                                        class215.field3521[class26.field336++] = arg8;
                                        break label118;
                                    }
                                    var77++;
                                }
                            }
                            int var58 = this.field4607[var57];
                            int var59 = this.field4623[var57];
                            int var60 = this.field4602[var57];
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
                            int var73 = this.field4628[var57];
                            int var74 = this.field4628[var57 + 1];
                            for (int var75 = var73; var75 < var74; var75++) {
                                int var76 = this.field4618[var75] - 1;
                                if (var76 == -1) {
                                    break;
                                }
                                field4648[var76] = var71;
                                field4646[var76] = var72;
                            }
                            var57++;
                        }
                    }
                }
            }
        }
        GL var81 = class55.field812;
        var81.glPushMatrix();
        var81.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var81.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method1875();
        var81.glPopMatrix();
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(SS)V", line = 3114)
    public final void method1869(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field4638; var3++) {
            if (this.field4630[var3] == arg0) {
                this.field4630[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class298.field5107.method380(arg0 & 0xFFFF, 255);
            var5 = class298.field5107.method378(-27774, arg0 & 0xFFFF);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class298.field5107.method380(arg1 & 0xFFFF, 255);
            var7 = class298.field5107.method378(-27774, arg1 & 0xFFFF);
        }
        if (var4 != var6 || var5 != var7) {
            this.field4599.field3192 = false;
        }
    }

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "(I)V", line = 3149)
    public final void method1870(int arg0) {
        this.field4631 = (short) arg0;
        if (this.field4611 != null) {
            this.field4611.field3192 = false;
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "()V", line = 3161)
    public final void method425() {
        for (int var1 = 0; var1 < this.field4637; var1++) {
            int var2 = this.field4602[var1];
            this.field4602[var1] = this.field4607[var1];
            this.field4607[var1] = -var2;
        }
        this.field4616.field2219 = false;
        this.field4632.field3192 = false;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIIII)Z", line = 3175)
    private final boolean method1871(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "()I", line = 3190)
    public final int method1872() {
        return this.field4604;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(ZZ)Lca;", line = 3195)
    public final class57 method431(boolean arg0, boolean arg1) {
        return this.method1866(arg0, arg1, field4641, field4640);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIII)V", line = 3198)
    private final void method1873(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field4647 = 0;
            field4650 = 0;
            field4649 = 0;
            for (int var6 = 0; var6 < this.field4637; var6++) {
                field4647 += this.field4607[var6];
                field4650 += this.field4623[var6];
                field4649 += this.field4602[var6];
                var5++;
            }
            if (var5 > 0) {
                field4647 = field4647 / var5 + arg1;
                field4650 = field4650 / var5 + arg2;
                field4649 = field4649 / var5 + arg3;
            } else {
                field4647 = arg1;
                field4650 = arg2;
                field4649 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field4637; var7++) {
                this.field4607[var7] += arg1;
                this.field4623[var7] += arg2;
                this.field4602[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field4637; var8++) {
                this.field4607[var8] -= field4647;
                this.field4623[var8] -= field4650;
                this.field4602[var8] -= field4649;
                if (arg3 != 0) {
                    int var9 = class298.field5095[arg3];
                    int var10 = class298.field5094[arg3];
                    int var11 = this.field4623[var8] * var9 + this.field4607[var8] * var10 + 32767 >> 16;
                    this.field4623[var8] = this.field4623[var8] * var10 + 32767 - this.field4607[var8] * var9 >> 16;
                    this.field4607[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class298.field5095[arg1];
                    int var13 = class298.field5094[arg1];
                    int var14 = this.field4623[var8] * var13 + 32767 - this.field4602[var8] * var12 >> 16;
                    this.field4602[var8] = this.field4623[var8] * var12 + this.field4602[var8] * var13 + 32767 >> 16;
                    this.field4623[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class298.field5095[arg2];
                    int var16 = class298.field5094[arg2];
                    int var17 = this.field4607[var8] * var16 + this.field4602[var8] * var15 + 32767 >> 16;
                    this.field4602[var8] = this.field4602[var8] * var16 + 32767 - this.field4607[var8] * var15 >> 16;
                    this.field4607[var8] = var17;
                }
                this.field4607[var8] += field4647;
                this.field4623[var8] += field4650;
                this.field4602[var8] += field4649;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field4637; var18++) {
                this.field4607[var18] -= field4647;
                this.field4623[var18] -= field4650;
                this.field4602[var18] -= field4649;
                this.field4607[var18] = this.field4607[var18] * arg1 / 128;
                this.field4623[var18] = this.field4623[var18] * arg2 / 128;
                this.field4602[var18] = this.field4602[var18] * arg3 / 128;
                this.field4607[var18] += field4647;
                this.field4623[var18] += field4650;
                this.field4602[var18] += field4649;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field4638; var19++) {
                int var20 = (this.field4621[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field4621[var19] = (byte) var20;
            }
            this.field4599.field3192 = false;
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V", line = 3357)
    public final void method439(int arg0) {
        int var2 = class298.field5095[arg0];
        int var3 = class298.field5094[arg0];
        for (int var4 = 0; var4 < this.field4637; var4++) {
            int var5 = this.field4607[var4] * var3 + this.field4602[var4] * var2 >> 16;
            this.field4602[var4] = this.field4602[var4] * var3 - this.field4607[var4] * var2 >> 16;
            this.field4607[var4] = var5;
        }
        this.field4616.field2219 = false;
        this.field4632.field3192 = false;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 3376)
    private static final void method1874(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
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
        field4644 = var18;
        field4654 = var19;
    }

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "()V", line = 3456)
    public final void method430() {
        for (int var1 = 0; var1 < this.field4637; var1++) {
            int var2 = this.field4607[var1];
            this.field4607[var1] = this.field4602[var1];
            this.field4602[var1] = -var2;
        }
        this.field4616.field2219 = false;
        this.field4632.field3192 = false;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V", line = 3474)
    public final void method432(int arg0) {
        int var2 = class298.field5095[arg0];
        int var3 = class298.field5094[arg0];
        for (int var4 = 0; var4 < this.field4637; var4++) {
            int var5 = this.field4623[var4] * var2 + this.field4607[var4] * var3 >> 16;
            this.field4623[var4] = this.field4623[var4] * var3 - this.field4607[var4] * var2 >> 16;
            this.field4607[var4] = var5;
        }
        this.field4616.field2219 = false;
        this.field4632.field3192 = false;
    }

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "()V", line = 3498)
    private final void method1875() {
        GL var1 = class55.field812;
        if (this.field4638 == 0) {
            return;
        }
        if (this.field4600 != 0) {
            this.method1849(true, !this.field4632.field3192 && (this.field4600 & 0x1) != 0, !this.field4599.field3192 && (this.field4600 & 0x2) != 0, this.field4611 != null && !this.field4611.field3192 && (this.field4600 & 0x4) != 0, false);
        }
        this.method1849(false, !this.field4632.field3192, !this.field4599.field3192, this.field4611 != null && !this.field4611.field3192, !this.field4606.field3192);
        if (!this.field4629.field3192) {
            this.method1858();
        }
        if (this.field4622 != 0) {
            if ((this.field4622 & 0x1) != 0) {
                this.field4607 = null;
                this.field4623 = null;
                this.field4602 = null;
                this.field4618 = null;
                this.field4628 = null;
            }
            if ((this.field4622 & 0x2) != 0) {
                this.field4624 = null;
                this.field4621 = null;
            }
            if ((this.field4622 & 0x4) != 0) {
                this.field4625 = null;
                this.field4614 = null;
                this.field4601 = null;
                this.field4636 = null;
            }
            if ((this.field4622 & 0x8) != 0) {
                this.field4634 = null;
                this.field4627 = null;
            }
            if ((this.field4622 & 0x10) != 0) {
                this.field4619 = null;
                this.field4613 = null;
                this.field4620 = null;
            }
            this.field4622 = 0;
        }
        class225 var2 = null;
        if (this.field4632.field3196 != null) {
            this.field4632.field3196.method1548();
            var2 = this.field4632.field3196;
            var1.glVertexPointer(3, 5126, this.field4632.field3195, (long) this.field4632.field3193);
        }
        if (this.field4599.field3196 != null) {
            if (this.field4599.field3196 != var2) {
                this.field4599.field3196.method1548();
                var2 = this.field4599.field3196;
            }
            var1.glColorPointer(4, 5121, this.field4599.field3195, (long) this.field4599.field3193);
        }
        if (class308.field5243 && this.field4611.field3196 != null) {
            if (this.field4611.field3196 != var2) {
                this.field4611.field3196.method1548();
                var2 = this.field4611.field3196;
            }
            var1.glNormalPointer(5126, this.field4611.field3195, (long) this.field4611.field3193);
        }
        if (this.field4606.field3196 != null) {
            if (this.field4606.field3196 != var2) {
                this.field4606.field3196.method1548();
                class225 var3 = this.field4606.field3196;
            }
            var1.glTexCoordPointer(2, 5126, this.field4606.field3195, (long) this.field4606.field3193);
        }
        if (this.field4629.field3196 != null) {
            this.field4629.field3196.method1552();
        }
        if (this.field4632.field3196 == null || this.field4599.field3196 == null || class308.field5243 && this.field4611.field3196 == null || this.field4606.field3196 == null) {
            if (class55.field798) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field4632.field3196 == null) {
                this.field4632.field3194.position(this.field4632.field3193);
                var1.glVertexPointer(3, 5126, this.field4632.field3195, this.field4632.field3194);
            }
            if (this.field4599.field3196 == null) {
                this.field4599.field3194.position(this.field4599.field3193);
                var1.glColorPointer(4, 5121, this.field4599.field3195, this.field4599.field3194);
            }
            if (class308.field5243 && this.field4611.field3196 == null) {
                this.field4611.field3194.position(this.field4611.field3193);
                var1.glNormalPointer(5126, this.field4611.field3195, this.field4611.field3194);
            }
            if (this.field4606.field3196 == null) {
                this.field4606.field3194.position(this.field4606.field3193);
                var1.glTexCoordPointer(2, 5126, this.field4606.field3195, this.field4606.field3194);
            }
        }
        if (this.field4629.field3196 == null && class55.field798) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field4609.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field4609[var5];
            int var7 = this.field4609[var5 + 1];
            short var8 = this.field4630[var6];
            if (var8 == -1) {
                class55.method407(-1);
                class131.method963(-12390, 0, 0);
            } else {
                class298.field5107.method375(var8 & 0xFFFF, 255);
            }
            if (this.field4629.field3196 == null) {
                this.field4629.field3194.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field4629.field3194);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "()V", line = 3669)
    public static final void method1876() {
        field4640 = new class267();
        field4641 = new class267();
        field4642 = new class267();
        field4643 = new class267();
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ld;IZ)V", line = 3675)
    public final void method434(class40 arg0, int arg1, boolean arg2) {
        if (this.field4615 == null || arg1 == -1) {
            return;
        }
        class196 var4 = arg0.field605[arg1];
        class88 var5 = var4.field3238;
        for (int var6 = 0; var6 < this.field4637; var6++) {
            this.field4607[var6] <<= 0x4;
            this.field4623[var6] <<= 0x4;
            this.field4602[var6] <<= 0x4;
        }
        field4647 = 0;
        field4650 = 0;
        field4649 = 0;
        for (int var7 = 0; var7 < var4.field3246; var7++) {
            short var8 = var4.field3237[var7];
            if (var4.field3239[var7] != -1) {
                this.method1865(0, var5.field1395[var4.field3239[var7]], 0, 0, 0, arg2);
            }
            this.method1865(var5.field1399[var8], var5.field1395[var8], var4.field3241[var7], var4.field3244[var7], var4.field3242[var7], arg2);
        }
        for (int var9 = 0; var9 < this.field4637; var9++) {
            this.field4607[var9] >>= 0x4;
            this.field4623[var9] >>= 0x4;
            this.field4602[var9] >>= 0x4;
        }
        this.field4616.field2219 = false;
        this.field4632.field3192 = false;
    }
}
