import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aha")
public class class384 extends class60 {

    @OriginalMember(owner = "client!aha", name = "s", descriptor = "Z")
    private boolean field4862;

    @OriginalMember(owner = "client!aha", name = "w", descriptor = "Z")
    private boolean field4866;

    @OriginalMember(owner = "client!aha", name = "v", descriptor = "Ltba;")
    private class165 field4865;

    @OriginalMember(owner = "client!aha", name = "C", descriptor = "I")
    public int field4871;

    @OriginalMember(owner = "client!aha", name = "F", descriptor = "I")
    public int field4874;

    @OriginalMember(owner = "client!aha", name = "G", descriptor = "I")
    public int field4875;

    @OriginalMember(owner = "client!aha", name = "ab", descriptor = "I")
    public int field4894;

    @OriginalMember(owner = "client!aha", name = "P", descriptor = "I")
    public int field4883;

    @OriginalMember(owner = "client!aha", name = "V", descriptor = "I")
    private int field4889;

    @OriginalMember(owner = "client!aha", name = "R", descriptor = "I")
    private int field4885;

    @OriginalMember(owner = "client!aha", name = "Z", descriptor = "I")
    public int field4893;

    @OriginalMember(owner = "client!aha", name = "U", descriptor = "I")
    public int field4888;

    @OriginalMember(owner = "client!aha", name = "z", descriptor = "I")
    public int field4869;

    @OriginalMember(owner = "client!aha", name = "D", descriptor = "I")
    public int field4872;

    @OriginalMember(owner = "client!aha", name = "Q", descriptor = "Z")
    private boolean field4884;

    @OriginalMember(owner = "client!aha", name = "bb", descriptor = "I")
    public int field4895;

    @OriginalMember(owner = "client!aha", name = "N", descriptor = "I")
    public int field4881;

    @OriginalMember(owner = "client!aha", name = "db", descriptor = "I")
    public int field4897;

    @OriginalMember(owner = "client!aha", name = "M", descriptor = "Lde;")
    private class534 field4880;

    @OriginalMember(owner = "client!aha", name = "ob", descriptor = "I")
    private int field4908;

    @OriginalMember(owner = "client!aha", name = "fb", descriptor = "Lde;")
    private class534 field4899;

    @OriginalMember(owner = "client!aha", name = "nb", descriptor = "Lcda;")
    public class174 field4907;

    @OriginalMember(owner = "client!aha", name = "y", descriptor = "I")
    private int field4868;

    @OriginalMember(owner = "client!aha", name = "u", descriptor = "I")
    private int field4864;

    @OriginalMember(owner = "client!aha", name = "x", descriptor = "I")
    private int field4867;

    @OriginalMember(owner = "client!aha", name = "E", descriptor = "I")
    private int field4873;

    @OriginalMember(owner = "client!aha", name = "H", descriptor = "I")
    public int field4876;

    @OriginalMember(owner = "client!aha", name = "I", descriptor = "I")
    public int field4877;

    @OriginalMember(owner = "client!aha", name = "K", descriptor = "I")
    public int field4879;

    @OriginalMember(owner = "client!aha", name = "S", descriptor = "I")
    public int field4886;

    @OriginalMember(owner = "client!aha", name = "T", descriptor = "I")
    private int field4887;

    @OriginalMember(owner = "client!aha", name = "X", descriptor = "I")
    public int field4891;

    @OriginalMember(owner = "client!aha", name = "Y", descriptor = "I")
    private int field4892;

    @OriginalMember(owner = "client!aha", name = "cb", descriptor = "I")
    public int field4896;

    @OriginalMember(owner = "client!aha", name = "eb", descriptor = "I")
    public int field4898;

    @OriginalMember(owner = "client!aha", name = "hb", descriptor = "I")
    public int field4901;

    @OriginalMember(owner = "client!aha", name = "ib", descriptor = "I")
    private int field4902;

    @OriginalMember(owner = "client!aha", name = "jb", descriptor = "I")
    private int field4903;

    @OriginalMember(owner = "client!aha", name = "kb", descriptor = "I")
    public int field4904;

    @OriginalMember(owner = "client!aha", name = "lb", descriptor = "I")
    public int field4905;

    @OriginalMember(owner = "client!aha", name = "mb", descriptor = "I")
    public int field4906;

    @OriginalMember(owner = "client!aha", name = "O", descriptor = "Luw;")
    private class419 field4882;

    @OriginalMember(owner = "client!aha", name = "pb", descriptor = "Liea;")
    private class481 field4909;

    @OriginalMember(owner = "client!aha", name = "t", descriptor = "Lpca;")
    public class717 field4863;

    @OriginalMember(owner = "client!aha", name = "r", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4861;

    @OriginalMember(owner = "client!aha", name = "A", descriptor = "[F")
    public float[] field4870;

    @OriginalMember(owner = "client!aha", name = "J", descriptor = "[F")
    public float[] field4878;

    @OriginalMember(owner = "client!aha", name = "W", descriptor = "[I")
    public int[] field4890;

    @OriginalMember(owner = "client!aha", name = "gb", descriptor = "[Lk;")
    private class567[] field4900;

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method2174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field830.method1072(arg6, true).field7456) {
                if (this.field4908 != arg6) {
                    class481 var11 = (class481) this.field4880.method3079((long) arg6, 0);
                    if (var11 == null) {
                        int[] var12 = this.method2183(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method2177(arg6) ? 64 : this.field4894;
                        var11 = this.method435(var13, 0, var13, 126, var12, var13);
                        this.field4880.method3077((byte) -120, (long) arg6, var11);
                    }
                    this.field4908 = arg6;
                    this.field4909 = var11;
                }
                ((class78) this.field4909).method204(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9, 1);
            } else {
                this.method2176(arg0, arg1, arg2, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!aha", name = "d", descriptor = "(I)I")
    public final int method2175(int arg0) {
        return super.field830.method1072(arg0, true).field7451 & 65535;
    }

    @OriginalMember(owner = "client!aha", name = "u", descriptor = "()Z")
    public final boolean method517() {
        return false;
    }

    @OriginalMember(owner = "client!aha", name = "P", descriptor = "(IIIII)V")
    public final void method477(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field4872 && arg0 < this.field4888) {
            if (arg1 < this.field4875) {
                arg2 -= this.field4875 - arg1;
                arg1 = this.field4875;
            }
            if (arg1 + arg2 > this.field4897) {
                arg2 = this.field4897 - arg1;
            }
            int var6 = this.field4898 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field4898 * var10 + var6;
                        int var12 = this.field4890[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field4890[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field4898 * var14 + var6;
                        int var16 = this.field4890[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field4890[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field4890[this.field4898 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aha", name = "d", descriptor = "(II)Lhca;")
    public final class492 method523(int arg0, int arg1) {
        return this.method551(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!aha", name = "m", descriptor = "()V")
    public final void method479() {
    }

    @OriginalMember(owner = "client!aha", name = "h", descriptor = "(I)V")
    public final void method506(int arg0) {
        this.field4900[arg0].method3259(117, Thread.currentThread());
    }

    @OriginalMember(owner = "client!aha", name = "na", descriptor = "(IIII)[I")
    public final int[] method465(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field4898 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field4890[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(II)Llda;")
    public final class488 method481(int arg0, int arg1) {
        return new class107(arg0, arg1);
    }

    @OriginalMember(owner = "client!aha", name = "K", descriptor = "([I)V")
    public final void method483(int[] arg0) {
        arg0[0] = this.field4872;
        arg0[1] = this.field4875;
        arg0[2] = this.field4888;
        arg0[3] = this.field4897;
    }

    @OriginalMember(owner = "client!aha", name = "e", descriptor = "(IIIIII)V")
    private final void method2176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 0) {
            arg3 = -arg3;
        }
        int var7 = arg1 - arg3;
        if (var7 < this.field4875) {
            var7 = this.field4875;
        }
        int var8 = arg1 + arg3 + 1;
        if (var8 > this.field4897) {
            var8 = this.field4897;
        }
        int var9 = var7;
        int var10 = arg3 * arg3;
        int var11 = 0;
        int var12 = arg1 - var7;
        int var13 = var12 * var12;
        int var14 = var13 - var12;
        if (arg1 > var8) {
            arg1 = var8;
        }
        int var15 = arg4 >>> 24;
        if (arg5 == 0 || arg5 == 1 && var15 == 255) {
            while (var9 < arg1) {
                while (var14 <= var10 || var13 <= var10) {
                    var13 += var11 + var11;
                    var14 += var11++ + var11;
                }
                int var65 = arg0 - var11 + 1;
                if (var65 < this.field4872) {
                    var65 = this.field4872;
                }
                int var66 = arg0 + var11;
                if (var66 > this.field4888) {
                    var66 = this.field4888;
                }
                int var67 = this.field4898 * var9 + var65;
                for (int var68 = var65; var68 < var66; ++var68) {
                    if ((float) arg2 < this.field4878[var67]) {
                        this.field4890[var67] = arg4;
                    }
                    ++var67;
                }
                ++var9;
                var13 -= var12-- + var12;
                var14 -= var12 + var12;
            }
            int var56 = arg3;
            int var57 = var9 - arg1;
            int var58 = var57 * var57 + var10;
            int var59 = var58 - arg3;
            int var60 = var58 - var57;
            while (var9 < var8) {
                while (var60 > var10 && var59 > var10) {
                    var60 -= var56-- + var56;
                    var59 -= var56 + var56;
                }
                int var61 = arg0 - var56;
                if (var61 < this.field4872) {
                    var61 = this.field4872;
                }
                int var62 = arg0 + var56;
                if (var62 > this.field4888 - 1) {
                    var62 = this.field4888 - 1;
                }
                int var63 = this.field4898 * var9 + var61;
                for (int var64 = var61; var64 <= var62; ++var64) {
                    if ((float) arg2 < this.field4878[var63]) {
                        this.field4890[var63] = arg4;
                    }
                    ++var63;
                }
                ++var9;
                var60 += var57 + var57;
                var59 += var57++ + var57;
            }
        } else if (arg5 == 1) {
            int var16 = (var15 << 24) + ((arg4 & 16711935) * var15 >> 8 & 16711935) + ((arg4 & 65280) * var15 >> 8 & 65280);
            int var17 = 256 - var15;
            while (var9 < arg1) {
                while (var14 <= var10 || var13 <= var10) {
                    var13 += var11 + var11;
                    var14 += var11++ + var11;
                }
                int var29 = arg0 - var11 + 1;
                if (var29 < this.field4872) {
                    var29 = this.field4872;
                }
                int var30 = arg0 + var11;
                if (var30 > this.field4888) {
                    var30 = this.field4888;
                }
                int var31 = this.field4898 * var9 + var29;
                for (int var32 = var29; var32 < var30; ++var32) {
                    if ((float) arg2 < this.field4878[var31]) {
                        int var33 = this.field4890[var31];
                        int var34 = ((var33 & 16711935) * var17 >> 8 & 16711935) + ((var33 & 65280) * var17 >> 8 & 65280);
                        this.field4890[var31] = var16 + var34;
                    }
                    ++var31;
                }
                ++var9;
                var13 -= var12-- + var12;
                var14 -= var12 + var12;
            }
            int var18 = arg3;
            int var19 = -var12;
            int var20 = var19 * var19 + var10;
            int var21 = var20 - arg3;
            int var22 = var20 - var19;
            while (var9 < var8) {
                while (var22 > var10 && var21 > var10) {
                    var22 -= var18-- + var18;
                    var21 -= var18 + var18;
                }
                int var23 = arg0 - var18;
                if (var23 < this.field4872) {
                    var23 = this.field4872;
                }
                int var24 = arg0 + var18;
                if (var24 > this.field4888 - 1) {
                    var24 = this.field4888 - 1;
                }
                int var25 = this.field4898 * var9 + var23;
                for (int var26 = var23; var26 <= var24; ++var26) {
                    if ((float) arg2 < this.field4878[var25]) {
                        int var27 = this.field4890[var25];
                        int var28 = ((var27 & 16711935) * var17 >> 8 & 16711935) + ((var27 & 65280) * var17 >> 8 & 65280);
                        this.field4890[var25] = var16 + var28;
                    }
                    ++var25;
                }
                ++var9;
                var22 += var19 + var19;
                var21 += var19++ + var19;
            }
        } else if (arg5 != 2) {
            throw new IllegalArgumentException();
        } else {
            while (var9 < arg1) {
                while (var14 <= var10 || var13 <= var10) {
                    var13 += var11 + var11;
                    var14 += var11++ + var11;
                }
                int var48 = arg0 - var11 + 1;
                if (var48 < this.field4872) {
                    var48 = this.field4872;
                }
                int var49 = arg0 + var11;
                if (var49 > this.field4888) {
                    var49 = this.field4888;
                }
                int var50 = this.field4898 * var9 + var48;
                for (int var51 = var48; var51 < var49; ++var51) {
                    if ((float) arg2 < this.field4878[var50]) {
                        int var52 = this.field4890[var50];
                        int var53 = arg4 + var52;
                        int var54 = (arg4 & 16711935) + (var52 & 16711935);
                        int var55 = (var53 - var54 & 65536) + (var54 & 16777472);
                        this.field4890[var50] = var53 - var55 | var55 - (var55 >>> 8);
                    }
                    ++var50;
                }
                ++var9;
                var13 -= var12-- + var12;
                var14 -= var12 + var12;
            }
            int var35 = arg3;
            int var36 = -var12;
            int var37 = var36 * var36 + var10;
            int var38 = var37 - arg3;
            int var39 = var37 - var36;
            while (var9 < var8) {
                while (var39 > var10 && var38 > var10) {
                    var39 -= var35-- + var35;
                    var38 -= var35 + var35;
                }
                int var40 = arg0 - var35;
                if (var40 < this.field4872) {
                    var40 = this.field4872;
                }
                int var41 = arg0 + var35;
                if (var41 > this.field4888 - 1) {
                    var41 = this.field4888 - 1;
                }
                int var42 = this.field4898 * var9 + var40;
                for (int var43 = var40; var43 <= var41; ++var43) {
                    if ((float) arg2 < this.field4878[var42]) {
                        int var44 = this.field4890[var42];
                        int var45 = arg4 + var44;
                        int var46 = (arg4 & 16711935) + (var44 & 16711935);
                        int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                        this.field4890[var42] = var45 - var47 | var47 - (var47 >>> 8);
                    }
                    ++var42;
                }
                ++var9;
                var39 += var36 + var36;
                var38 += var36++ + var36;
            }
        }
    }

    @OriginalMember(owner = "client!aha", name = "v", descriptor = "()Z")
    public final boolean method519() {
        return false;
    }

    @OriginalMember(owner = "client!aha", name = "H", descriptor = "(III[I)V")
    public final void method553(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field4907.field2426 + (float) arg0 * this.field4907.field2412 + (float) arg1 * this.field4907.field2435 + this.field4907.field2434;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field4907.field2431 + (float) arg0 * this.field4907.field2422 + (float) arg1 * this.field4907.field2424 + this.field4907.field2411) * (float) this.field4874 / var5);
            int var7 = (int) (((float) arg2 * this.field4907.field2410 + (float) arg0 * this.field4907.field2438 + (float) arg1 * this.field4907.field2439 + this.field4907.field2408) * (float) this.field4881 / var5);
            arg3[0] = var6 - this.field4906;
            arg3[1] = var7 - this.field4879;
            arg3[2] = (int) var5;
        }
    }

    @OriginalMember(owner = "client!aha", name = "HA", descriptor = "(IIII[I)V")
    public final void method530(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        float var6 = (float) arg2 * this.field4907.field2426 + (float) arg0 * this.field4907.field2412 + (float) arg1 * this.field4907.field2435 + this.field4907.field2434;
        if (!(var6 < (float) this.field4871) && !(var6 > (float) this.field4883)) {
            int var7 = (int) (((float) arg2 * this.field4907.field2431 + (float) arg0 * this.field4907.field2422 + (float) arg1 * this.field4907.field2424 + this.field4907.field2411) * (float) this.field4874 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field4907.field2410 + (float) arg0 * this.field4907.field2438 + (float) arg1 * this.field4907.field2439 + this.field4907.field2408) * (float) this.field4881 / (float) arg3);
            if (var7 >= this.field4906 && var7 <= this.field4904 && var8 >= this.field4879 && var8 <= this.field4896) {
                arg4[0] = var7 - this.field4906;
                arg4[1] = var8 - this.field4879;
                arg4[2] = (int) var6;
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!aha", name = "k", descriptor = "(I)Z")
    public final boolean method2177(int arg0) {
        return this.field4884 || super.field830.method1072(arg0, true).field7460;
    }

    @OriginalMember(owner = "client!aha", name = "y", descriptor = "()Lpda;")
    public final class631 method531() {
        class567 var1 = this.method2185(Thread.currentThread());
        return var1.field7959;
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method495(Canvas arg0, int arg1, int arg2) {
        class717 var4 = (class717) this.field4865.method1160((long) arg0.hashCode(), 125);
        if (var4 != null) {
            var4.method1175(-2);
            class717 var5 = class491.method2900((byte) 69, arg0, arg2, arg1);
            this.field4865.method1153(var5, (long) arg0.hashCode(), -1);
            if (this.field4861 == arg0 && this.field4882 == null) {
                Dimension var6 = arg0.getSize();
                this.field4867 = var6.width;
                this.field4864 = var6.height;
                this.field4863 = var5;
                this.field4890 = var5.field9976;
                this.field4898 = var5.field9980;
                this.field4892 = var5.field9975;
                if (this.field4902 != this.field4898 || this.field4903 != this.field4892) {
                    this.field4873 = this.field4902 = this.field4898;
                    this.field4887 = this.field4903 = this.field4892;
                    this.field4870 = this.field4878 = new float[this.field4903 * this.field4902];
                }
                this.method2180();
            }
        }
    }

    @OriginalMember(owner = "client!aha", name = "GA", descriptor = "(I)V")
    public final void method462(int arg0) {
        this.method528(0, 0, this.field4898, this.field4892, arg0, 0);
    }

    @OriginalMember(owner = "client!aha", name = "d", descriptor = "()V")
    public final void method444() {
        if (this.field4861 != null) {
            this.field4890 = this.field4863.field9976;
            this.field4898 = this.field4863.field9980;
            this.field4892 = this.field4863.field9975;
            this.field4878 = this.field4870;
            this.field4902 = this.field4873;
            this.field4903 = this.field4887;
        } else {
            this.field4898 = 1;
            this.field4892 = 1;
            this.field4890 = null;
            this.field4902 = 1;
            this.field4903 = 1;
            this.field4878 = null;
        }
        this.field4882 = null;
        this.method2180();
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lhb;Z)Liea;")
    public final class481 method508(class728 arg0, boolean arg1) {
        int[] var3 = arg0.field10131;
        byte[] var4 = arg0.field10134;
        int var5 = arg0.field10135;
        int var6 = arg0.field10132;
        class78 var11;
        if (arg1 && arg0.field10133 == null) {
            int[] var7 = new int[var3.length];
            byte[] var8 = new byte[var5 * var6];
            for (int var9 = 0; var9 < var6; ++var9) {
                int var12 = var5 * var9;
                for (int var13 = 0; var13 < var5; ++var13) {
                    var8[var12 + var13] = var4[var12 + var13];
                }
            }
            for (int var10 = 0; var10 < var3.length; ++var10) {
                var7[var10] = var3[var10];
            }
            var11 = new class30(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field10133;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class62(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var20 = var5 * var19;
                    for (int var21 = 0; var21 < var5; ++var21) {
                        int var22 = var3[var4[var20 + var21] & 255];
                        var14[var20 + var21] = var22 != 0 ? -16777216 | var22 : 0;
                    }
                }
                var11 = new class398(this, var14, var5, var6);
            }
        }
        var11.method147(arg0.field10129, arg0.field10128, arg0.field10136, arg0.field10130);
        return var11;
    }

    @OriginalMember(owner = "client!aha", name = "l", descriptor = "(I)[I")
    public final int[] method2178(int arg0) {
        class534 var2 = this.field4899;
        class364 var3;
        synchronized (this.field4899) {
            var3 = (class364) this.field4899.method3079((long) arg0, 0);
            if (var3 == null) {
                if (!super.field830.method1071((byte) 123, arg0)) {
                    return null;
                }
                class537 var5 = super.field830.method1072(arg0, true);
                int var6 = !var5.field7460 && !this.field4884 ? this.field4894 : 64;
                var3 = new class364(arg0, var6, super.field830.method1069(var6, arg0, true, var6, 0.7F, 6766), var5.field7450 != 1);
                this.field4899.method3077((byte) -65, (long) arg0, var3);
            }
        }
        var3.field4687 = true;
        return var3.method2103();
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(II[I[I)Laa;")
    public final class489 method487(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class324(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!aha", name = "c", descriptor = "(IIIIII)Lmda;")
    public final class267 method520(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(Z)V")
    public final void method449(boolean arg0) {
        this.field4884 = arg0;
        this.field4899.method3065(true);
    }

    @OriginalMember(owner = "client!aha", name = "la", descriptor = "()V")
    public final void method446() {
        this.field4872 = 0;
        this.field4875 = 0;
        this.field4888 = this.field4898;
        this.field4897 = this.field4892;
        this.method2188();
    }

    @OriginalMember(owner = "client!aha", name = "XA", descriptor = "()I")
    public final int method546() {
        return this.field4883;
    }

    @OriginalMember(owner = "client!aha", name = "q", descriptor = "()Z")
    public final boolean method498() {
        return true;
    }

    @OriginalMember(owner = "client!aha", name = "g", descriptor = "()Z")
    public final boolean method2179() {
        return this.field4866;
    }

    @OriginalMember(owner = "client!aha", name = "ra", descriptor = "(IIII)V")
    public final void method503(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field4900.length; ++var5) {
            this.field4900[var5].field7964 = this.field4900[var5].field7957;
            this.field4900[var5].field7965 = arg0;
            this.field4900[var5].field7957 = arg1;
            this.field4900[var5].field7960 = arg2;
            this.field4900[var5].field7952 = true;
        }
    }

    @OriginalMember(owner = "client!aha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method518(Canvas arg0, int arg1, int arg2) {
        class717 var4 = (class717) this.field4865.method1160((long) arg0.hashCode(), 125);
        if (var4 == null) {
            class717 var5 = class491.method2900((byte) -117, arg0, arg2, arg1);
            this.field4865.method1153(var5, (long) arg0.hashCode(), -1);
        } else {
            if (var4.field9980 != arg1 || var4.field9975 != arg2) {
                this.method495(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class282 method539(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class351(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!aha", name = "b", descriptor = "(I)V")
    public final void method448(int arg0) {
        int var2 = arg0 - this.field4868;
        for (Object var3 = this.field4899.method3068((byte) 101); var3 != null; var3 = this.field4899.method3074(16)) {
            class364 var4 = (class364) var3;
            if (var4.field4687) {
                var4.field4691 += var2;
                int var5 = var4.field4691 / 20;
                if (var5 > 0) {
                    class537 var6 = super.field830.method1072(var4.field4690, true);
                    var4.method2101(var6.field7441 * var2 * 50 / 1000, var6.field7444 * var2 * 50 / 1000);
                    var4.field4691 -= var5 * 20;
                }
                var4.field4687 = false;
            }
        }
        this.field4868 = arg0;
        this.field4880.method3070(5, 124);
        this.field4899.method3070(5, 121);
    }

    @OriginalMember(owner = "client!aha", name = "T", descriptor = "(IIII)V")
    public final void method525(int arg0, int arg1, int arg2, int arg3) {
        if (this.field4872 < arg0) {
            this.field4872 = arg0;
        }
        if (this.field4875 < arg1) {
            this.field4875 = arg1;
        }
        if (this.field4888 > arg2) {
            this.field4888 = arg2;
        }
        if (this.field4897 > arg3) {
            this.field4897 = arg3;
        }
        this.method2188();
    }

    @OriginalMember(owner = "client!aha", name = "B", descriptor = "()V")
    private final void method2180() {
        for (int var1 = 0; var1 < this.field4905; ++var1) {
            this.field4900[var1].method3260(-4);
        }
        this.method446();
    }

    @OriginalMember(owner = "client!aha", name = "t", descriptor = "()Z")
    public final boolean method513() {
        return false;
    }

    @OriginalMember(owner = "client!aha", name = "E", descriptor = "()I")
    public final int method537() {
        return 0;
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIIIII)V")
    public final void method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method491(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method491(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method477(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method477(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
            }
        } else {
            if (var7 + var8 < 0) {
                arg0 += var7;
                var7 = -var7;
                arg1 += var8;
                var8 = -var8;
            }
            if (var7 > var8) {
                int var9 = arg1 << 16;
                int var10 = var9 + 32768;
                int var11 = var8 << 16;
                int var12 = (int) Math.floor((double) var11 / (double) var7 + 0.5D);
                int var13 = arg0 + var7;
                if (arg0 < this.field4872) {
                    var10 += (this.field4872 - arg0) * var12;
                    arg0 = this.field4872;
                }
                if (var13 >= this.field4888) {
                    var13 = this.field4888 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field4875 && var17 < this.field4897) {
                                int var18 = this.field4898 * var17 + arg0;
                                int var19 = this.field4890[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field4890[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field4875 && var21 < this.field4897) {
                                int var22 = this.field4898 * var21 + arg0;
                                int var23 = this.field4890[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field4890[var22] = var24 - var26 | var26 - (var26 >>> 8);
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    while (arg0 <= var13) {
                        int var27 = var10 >> 16;
                        if (var27 >= this.field4875 && var27 < this.field4897) {
                            this.field4890[this.field4898 * var27 + arg0] = arg4;
                        }
                        var10 += var12;
                        ++arg0;
                    }
                }
            } else {
                int var28 = arg0 << 16;
                int var29 = var28 + 32768;
                int var30 = var7 << 16;
                int var31 = (int) Math.floor((double) var30 / (double) var8 + 0.5D);
                int var32 = arg1 + var8;
                if (arg1 < this.field4875) {
                    var29 += (this.field4875 - arg1) * var31;
                    arg1 = this.field4875;
                }
                if (var32 >= this.field4897) {
                    var32 = this.field4897 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field4872 && var46 < this.field4888) {
                            this.field4890[this.field4898 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field4872 && var36 < this.field4888) {
                            int var37 = this.field4898 * arg1 + var36;
                            int var38 = this.field4890[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field4890[this.field4898 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field4872 && var40 < this.field4888) {
                            int var41 = this.field4898 * arg1 + var40;
                            int var42 = this.field4890[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field4890[var41] = var43 - var45 | var45 - (var45 >>> 8);
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIIIIII)V")
    public final void method475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class567 var8 = this.method2185(Thread.currentThread());
        class50 var9 = var8.field7973;
        int var10 = arg2 - arg0;
        int var11 = arg3 - arg1;
        int var12 = var10 >= 0 ? var10 : -var10;
        int var13 = var11 >= 0 ? var11 : -var11;
        int var14 = var12;
        if (var12 < var13) {
            var14 = var13;
        }
        if (var14 != 0) {
            int var15 = (var10 << 16) / var14;
            int var16 = (var11 << 16) / var14;
            int var17 = (var15 >> 16) + var10;
            int var18 = (var16 >> 16) + var11;
            if (var16 <= var15) {
                var15 = -var15;
            } else {
                var16 = -var16;
            }
            int var19 = arg5 * var16 >> 17;
            int var20 = arg5 * var16 + 1 >> 17;
            int var21 = arg5 * var15 >> 17;
            int var22 = arg5 * var15 + 1 >> 17;
            int var23 = arg0 - var9.method376();
            int var24 = arg1 - var9.method380();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field693 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field693 = 255 - (arg4 >>> 24);
            }
            this.method504(false);
            var9.field696 = var25 < 0 || var25 > var9.field694 || var26 < 0 || var26 > var9.field694 || var27 < 0 || var27 > var9.field694;
            var9.method378((float) var29, (float) var30, (float) var31, (float) var25, (float) var26, (float) var27, 100.0F, 100.0F, 100.0F, arg4);
            var9.field696 = var25 < 0 || var25 > var9.field694 || var27 < 0 || var27 > var9.field694 || var28 < 0 || var28 > var9.field694;
            var9.method378((float) var29, (float) var31, (float) var32, (float) var25, (float) var27, (float) var28, 100.0F, 100.0F, 100.0F, arg4);
            this.method504(true);
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lpda;)V")
    public final void method505(class631 arg0) {
        this.field4907 = (class174) arg0;
    }

    @OriginalMember(owner = "client!aha", name = "xa", descriptor = "(F)V")
    public final void method511(float arg0) {
        this.field4893 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lmda;)V")
    public final void method496(class267 arg0) {
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(FFF)V")
    public final void method463(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!aha", name = "aa", descriptor = "(IIIIII)V")
    public final void method528(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field4872) {
            arg2 -= this.field4872 - arg0;
            arg0 = this.field4872;
        }
        if (arg1 < this.field4875) {
            arg3 -= this.field4875 - arg1;
            arg1 = this.field4875;
        }
        if (arg0 + arg2 > this.field4888) {
            arg2 = this.field4888 - arg0;
        }
        if (arg1 + arg3 > this.field4897) {
            arg3 = this.field4897 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field4888 && arg1 <= this.field4897) {
            int var7 = this.field4898 - arg2;
            int var8 = this.field4898 * arg1 + arg0;
            int var9 = arg4 >>> 24;
            if (arg5 == 0 || arg5 == 1 && var9 == 255) {
                int var22 = arg2 >> 3;
                int var23 = arg2 & 7;
                int var24 = var8 - 1;
                for (int var25 = -arg3; var25 < 0; ++var25) {
                    if (var22 > 0) {
                        int var26 = var22;
                        do {
                            ++var24;
                            this.field4890[var24] = arg4;
                            ++var24;
                            this.field4890[var24] = arg4;
                            ++var24;
                            this.field4890[var24] = arg4;
                            ++var24;
                            this.field4890[var24] = arg4;
                            ++var24;
                            this.field4890[var24] = arg4;
                            ++var24;
                            this.field4890[var24] = arg4;
                            ++var24;
                            this.field4890[var24] = arg4;
                            ++var24;
                            this.field4890[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field4890[var24] = arg4;
                            --var27;
                        } while (var27 > 0);
                    }
                    var24 += var7;
                }
            } else if (arg5 == 1) {
                int var10 = ((arg4 & 16711935) * var9 >> 8 & 16711935) + (((arg4 & -16711936) >>> 8) * var9 & -16711936);
                int var11 = 256 - var9;
                for (int var12 = 0; var12 < arg3; ++var12) {
                    for (int var13 = -arg2; var13 < 0; ++var13) {
                        int var14 = this.field4890[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + (((var14 & -16711936) >>> 8) * var11 & -16711936);
                        this.field4890[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field4890[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field4890[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lhca;Llda;)Lnl;")
    public final class554 method464(class492 arg0, class488 arg1) {
        return new class419(this, (class481) arg0, (class107) arg1);
    }

    @OriginalMember(owner = "client!aha", name = "r", descriptor = "(IIIIIII)I")
    public final int method501(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        float var8 = (float) arg2 * this.field4907.field2426 + (float) arg0 * this.field4907.field2412 + (float) arg1 * this.field4907.field2435 + this.field4907.field2434;
        float var9 = (float) arg5 * this.field4907.field2426 + (float) arg3 * this.field4907.field2412 + (float) arg4 * this.field4907.field2435 + this.field4907.field2434;
        int var10 = 0;
        if (var8 < (float) this.field4871 && var9 < (float) this.field4871) {
            var10 |= 16;
        } else if (var8 > (float) this.field4883 && var9 > (float) this.field4883) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field4907.field2431 + (float) arg0 * this.field4907.field2422 + (float) arg1 * this.field4907.field2424 + this.field4907.field2411) * (float) this.field4874 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field4907.field2431 + (float) arg3 * this.field4907.field2422 + (float) arg4 * this.field4907.field2424 + this.field4907.field2411) * (float) this.field4874 / (float) arg6);
        if (var11 < this.field4906 && var12 < this.field4906) {
            var10 |= 1;
        } else if (var11 > this.field4904 && var12 > this.field4904) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field4907.field2410 + (float) arg0 * this.field4907.field2438 + (float) arg1 * this.field4907.field2439 + this.field4907.field2408) * (float) this.field4881 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field4907.field2410 + (float) arg3 * this.field4907.field2438 + (float) arg4 * this.field4907.field2439 + this.field4907.field2408) * (float) this.field4881 / (float) arg6);
        if (var13 < this.field4879 && var14 < this.field4879) {
            var10 |= 4;
        } else if (var13 > this.field4896 && var14 > this.field4896) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!aha", name = "za", descriptor = "(IIIII)V")
    public final void method458(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field4875) {
            var6 = this.field4875;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field4897) {
            var7 = this.field4897;
        }
        int var8 = var6;
        int var9 = arg2 * arg2;
        int var10 = 0;
        int var11 = arg1 - var6;
        int var12 = var11 * var11;
        int var13 = var12 - var11;
        if (arg1 > var7) {
            arg1 = var7;
        }
        int var14 = arg3 >>> 24;
        if (arg4 == 0 || arg4 == 1 && var14 == 255) {
            while (var8 < arg1) {
                while (var13 <= var9 || var12 <= var9) {
                    var12 += var10 + var10;
                    var13 += var10++ + var10;
                }
                int var64 = arg0 - var10 + 1;
                if (var64 < this.field4872) {
                    var64 = this.field4872;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field4888) {
                    var65 = this.field4888;
                }
                int var66 = this.field4898 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field4890[var66++] = arg3;
                }
                ++var8;
                var12 -= var11-- + var11;
                var13 -= var11 + var11;
            }
            int var55 = arg2;
            int var56 = var8 - arg1;
            int var57 = var56 * var56 + var9;
            int var58 = var57 - arg2;
            int var59 = var57 - var56;
            while (var8 < var7) {
                while (var59 > var9 && var58 > var9) {
                    var59 -= var55-- + var55;
                    var58 -= var55 + var55;
                }
                int var60 = arg0 - var55;
                if (var60 < this.field4872) {
                    var60 = this.field4872;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field4888 - 1) {
                    var61 = this.field4888 - 1;
                }
                int var62 = this.field4898 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field4890[var62++] = arg3;
                }
                ++var8;
                var59 += var56 + var56;
                var58 += var56++ + var56;
            }
        } else if (arg4 == 1) {
            int var15 = (var14 << 24) + ((arg3 & 16711935) * var14 >> 8 & 16711935) + ((arg3 & 65280) * var14 >> 8 & 65280);
            int var16 = 256 - var14;
            while (var8 < arg1) {
                while (var13 <= var9 || var12 <= var9) {
                    var12 += var10 + var10;
                    var13 += var10++ + var10;
                }
                int var28 = arg0 - var10 + 1;
                if (var28 < this.field4872) {
                    var28 = this.field4872;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field4888) {
                    var29 = this.field4888;
                }
                int var30 = this.field4898 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field4890[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field4890[var30++] = var15 + var33;
                }
                ++var8;
                var12 -= var11-- + var11;
                var13 -= var11 + var11;
            }
            int var17 = arg2;
            int var18 = -var11;
            int var19 = var18 * var18 + var9;
            int var20 = var19 - arg2;
            int var21 = var19 - var18;
            while (var8 < var7) {
                while (var21 > var9 && var20 > var9) {
                    var21 -= var17-- + var17;
                    var20 -= var17 + var17;
                }
                int var22 = arg0 - var17;
                if (var22 < this.field4872) {
                    var22 = this.field4872;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field4888 - 1) {
                    var23 = this.field4888 - 1;
                }
                int var24 = this.field4898 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field4890[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field4890[var24++] = var15 + var27;
                }
                ++var8;
                var21 += var18 + var18;
                var20 += var18++ + var18;
            }
        } else if (arg4 != 2) {
            throw new IllegalArgumentException();
        } else {
            while (var8 < arg1) {
                while (var13 <= var9 || var12 <= var9) {
                    var12 += var10 + var10;
                    var13 += var10++ + var10;
                }
                int var47 = arg0 - var10 + 1;
                if (var47 < this.field4872) {
                    var47 = this.field4872;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field4888) {
                    var48 = this.field4888;
                }
                int var49 = this.field4898 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field4890[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field4890[var49++] = var52 - var54 | var54 - (var54 >>> 8);
                }
                ++var8;
                var12 -= var11-- + var11;
                var13 -= var11 + var11;
            }
            int var34 = arg2;
            int var35 = -var11;
            int var36 = var35 * var35 + var9;
            int var37 = var36 - arg2;
            int var38 = var36 - var35;
            while (var8 < var7) {
                while (var38 > var9 && var37 > var9) {
                    var38 -= var34-- + var34;
                    var37 -= var34 + var34;
                }
                int var39 = arg0 - var34;
                if (var39 < this.field4872) {
                    var39 = this.field4872;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field4888 - 1) {
                    var40 = this.field4888 - 1;
                }
                int var41 = this.field4898 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field4890[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field4890[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lmda;Lmda;FLmda;)Lmda;")
    public final class267 method485(class267 arg0, class267 arg1, float arg2, class267 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lfl;)V")
    public final void method455(class741 arg0) {
        class567 var2 = this.method2185(Thread.currentThread());
        class112 var3 = arg0.field10344.field7154;
        for (class112 var4 = var3.field1623; var3 != var4; var4 = var4.field1623) {
            class18 var5 = (class18) var4;
            int var6 = var5.field333 >> 12;
            int var7 = var5.field339 >> 12;
            int var8 = var5.field338 >> 12;
            float var9 = (float) var8 * this.field4907.field2426 + (float) var6 * this.field4907.field2412 + (float) var7 * this.field4907.field2435 + this.field4907.field2434;
            if (!(var9 < (float) this.field4871) && !(var9 > (float) var2.field7954)) {
                int var10 = (int) (((float) var8 * this.field4907.field2431 + (float) var6 * this.field4907.field2422 + (float) var7 * this.field4907.field2424 + this.field4907.field2411) * (float) this.field4874 / var9) + this.field4901;
                int var11 = (int) (((float) var8 * this.field4907.field2410 + (float) var6 * this.field4907.field2438 + (float) var7 * this.field4907.field2439 + this.field4907.field2408) * (float) this.field4881 / var9) + this.field4876;
                if (var10 >= this.field4872 && var10 <= this.field4888 && var11 >= this.field4875 && var11 <= this.field4897) {
                    if (var9 == 0.0F) {
                        var9 = 1.0F;
                    }
                    this.method2187(var5, var10, var11, (int) var9, (int) ((float) (this.field4874 * var5.field330 >> 12) / var9));
                }
            }
        }
    }

    @OriginalMember(owner = "client!aha", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method443(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field4898 * arg1 + arg0;
            int var15 = this.field4898 - arg2;
            if (arg1 + arg3 > this.field4897) {
                arg3 -= arg1 + arg3 - this.field4897;
            }
            if (arg1 < this.field4875) {
                int var16 = this.field4875 - arg1;
                arg3 -= var16;
                var14 += this.field4898 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field4888) {
                int var17 = arg0 + arg2 - this.field4888;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field4872) {
                int var18 = this.field4872 - arg0;
                arg2 -= var18;
                var14 += var18;
                var10 += var12 * var18;
                var15 += var18;
            }
            int var19 = arg4 >>> 24;
            int var20 = arg5 >>> 24;
            if (arg8 != 0 && (arg8 != 1 || var19 != 255 || var20 != 255)) {
                if (arg8 == 1) {
                    int var21 = var10;
                    for (int var22 = -arg3; var22 < 0; ++var22) {
                        int var23 = (var11 >> 16) * arg7;
                        for (int var24 = -arg2; var24 < 0; ++var24) {
                            int var25 = arg4;
                            if (arg6[(var10 >> 16) + var23] != 0) {
                                var25 = arg5;
                            }
                            int var26 = var25 >>> 24;
                            int var27 = 255 - var26;
                            int var28 = this.field4890[var14];
                            this.field4890[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
                            var10 += var12;
                        }
                        var11 += var13;
                        var10 = var21;
                        var14 += var15;
                    }
                } else if (arg8 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    int var29 = var10;
                    for (int var30 = -arg3; var30 < 0; ++var30) {
                        int var31 = (var11 >> 16) * arg7;
                        for (int var32 = -arg2; var32 < 0; ++var32) {
                            int var33 = arg4;
                            if (arg6[(var10 >> 16) + var31] != 0) {
                                var33 = arg5;
                            }
                            if (var33 != 0) {
                                int var34 = this.field4890[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field4890[var14++] = var35 - var37 | var37 - (var37 >>> 8);
                            } else {
                                ++var14;
                            }
                            var10 += var12;
                        }
                        var11 += var13;
                        var10 = var29;
                        var14 += var15;
                    }
                }
            } else {
                int var38 = var10;
                for (int var39 = -arg3; var39 < 0; ++var39) {
                    int var40 = (var11 >> 16) * arg7;
                    for (int var41 = -arg2; var41 < 0; ++var41) {
                        if (arg6[(var10 >> 16) + var40] != 0) {
                            this.field4890[var14++] = arg5;
                        } else {
                            this.field4890[var14++] = arg4;
                        }
                        var10 += var12;
                    }
                    var11 += var13;
                    var10 = var38;
                    var14 += var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIIIIF)Llaa;")
    public final class123 method471(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return null;
    }

    @OriginalMember(owner = "client!aha", name = "da", descriptor = "(III[I)V")
    public final void method543(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field4907.field2426 + (float) arg0 * this.field4907.field2412 + (float) arg1 * this.field4907.field2435 + this.field4907.field2434;
        if (!(var5 < (float) this.field4871) && !(var5 > (float) this.field4883)) {
            int var6 = (int) (((float) arg2 * this.field4907.field2431 + (float) arg0 * this.field4907.field2422 + (float) arg1 * this.field4907.field2424 + this.field4907.field2411) * (float) this.field4874 / var5);
            int var7 = (int) (((float) arg2 * this.field4907.field2410 + (float) arg0 * this.field4907.field2438 + (float) arg1 * this.field4907.field2439 + this.field4907.field2408) * (float) this.field4881 / var5);
            if (var6 >= this.field4906 && var6 <= this.field4904 && var7 >= this.field4879 && var7 <= this.field4896) {
                arg3[0] = var6 - this.field4906;
                arg3[1] = var7 - this.field4879;
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!aha", name = "X", descriptor = "(I)V")
    public final void method510(int arg0) {
    }

    @OriginalMember(owner = "client!aha", name = "<init>", descriptor = "(Ld;)V")
    private class384(class153 arg0) {
        super(arg0);
        this.field4862 = false;
        this.field4866 = false;
        this.field4865 = new class165(4);
        this.field4871 = 50;
        this.field4874 = 512;
        this.field4875 = 0;
        this.field4894 = 128;
        this.field4883 = 3500;
        this.field4889 = 0;
        this.field4885 = 0;
        this.field4893 = 75518;
        this.field4888 = 0;
        this.field4869 = 45823;
        this.field4872 = 0;
        this.field4884 = false;
        this.field4895 = 78642;
        this.field4881 = 512;
        this.field4897 = 0;
        this.field4880 = new class534(16);
        this.field4908 = -1;
        try {
            this.field4899 = new class534(256);
            this.field4907 = new class174();
            this.method452(1);
            this.method506(0);
            class273.method1613(true, true, 10);
            this.field4862 = true;
            this.field4868 = (int) class446.method2525(500);
        } catch (Throwable var3) {
            var3.printStackTrace();
            this.method478((byte) 118);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!aha", name = "EA", descriptor = "(IIII)V")
    public final void method453(int arg0, int arg1, int arg2, int arg3) {
        class567 var5 = this.method2185(Thread.currentThread());
        var5.field7965 = arg0;
        var5.field7957 = arg1;
        var5.field7960 = arg2;
    }

    @OriginalMember(owner = "client!aha", name = "M", descriptor = "()I")
    public final int method470() {
        int var1 = this.field4885;
        this.field4885 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!aha", name = "o", descriptor = "()Z")
    public final boolean method482() {
        return true;
    }

    @OriginalMember(owner = "client!aha", name = "A", descriptor = "(ILaa;II)V")
    public final void method450(int arg0, class489 arg1, int arg2, int arg3) {
        class324 var5 = (class324) arg1;
        int[] var6 = var5.field4168;
        int[] var7 = var5.field4170;
        int var8;
        if (this.field4897 < var6.length + arg3) {
            var8 = this.field4897 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field4875 > arg3) {
            var9 = this.field4875 - arg3;
            arg3 = this.field4875;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field4898 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field4872 > var12) {
                    var13 -= this.field4872 - var12;
                    var12 = this.field4872;
                }
                if (this.field4888 < var12 + var13) {
                    var13 = this.field4888 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field4890[var14++] = arg0;
                }
                var10 += this.field4898;
            }
        }
    }

    @OriginalMember(owner = "client!aha", name = "s", descriptor = "()Lpda;")
    public final class631 method502() {
        return new class174();
    }

    @OriginalMember(owner = "client!aha", name = "l", descriptor = "()Z")
    public final boolean method476() {
        return false;
    }

    @OriginalMember(owner = "client!aha", name = "f", descriptor = "()V")
    public final void method466() {
    }

    @OriginalMember(owner = "client!aha", name = "m", descriptor = "(I)Z")
    public final boolean method2181(int arg0) {
        return super.field830.method1071((byte) 119, arg0);
    }

    @OriginalMember(owner = "client!aha", name = "U", descriptor = "(IIIII)V")
    public final void method491(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field4875 && arg1 < this.field4897) {
            if (arg0 < this.field4872) {
                arg2 -= this.field4872 - arg0;
                arg0 = this.field4872;
            }
            if (arg0 + arg2 > this.field4888) {
                arg2 = this.field4888 - arg0;
            }
            int var6 = this.field4898 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field4890[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field4890[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field4890[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field4890[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field4890[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aha", name = "j", descriptor = "()V")
    public final void method469() {
    }

    @OriginalMember(owner = "client!aha", name = "b", descriptor = "(Z)V")
    public final void method507(boolean arg0) {
    }

    @OriginalMember(owner = "client!aha", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V")
    public class384(Canvas arg0, class153 arg1, int arg2, int arg3) {
        this(arg1);
        try {
            this.method518(arg0, arg2, arg3);
            this.method486(arg0);
        } catch (Throwable var6) {
            var6.printStackTrace();
            this.method478((byte) 116);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "([IIIIIZ)Liea;")
    public final class481 method535(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        boolean var7 = false;
        int var8 = arg1;
        for (int var9 = 0; var9 < arg4; ++var9) {
            for (int var10 = 0; var10 < arg3; ++var10) {
                int var11 = arg0[var8++] >>> 24;
                if (var11 != 0 && var11 != 255) {
                    var7 = true;
                    return var7 ? new class62(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class398(this, arg0, arg1, arg2, arg3, arg4, arg5);
                }
            }
        }
        return var7 ? new class62(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class398(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!aha", name = "w", descriptor = "()V")
    public final void method522() {
    }

    @OriginalMember(owner = "client!aha", name = "KA", descriptor = "(IIII)V")
    public final void method534(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field4898) {
            arg2 = this.field4898;
        }
        if (arg3 > this.field4892) {
            arg3 = this.field4892;
        }
        this.field4872 = arg0;
        this.field4888 = arg2;
        this.field4875 = arg1;
        this.field4897 = arg3;
        this.method2188();
    }

    @OriginalMember(owner = "client!aha", name = "h", descriptor = "()Z")
    public final boolean method467() {
        return false;
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIIIIIII)V")
    private final void method2182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 >= this.field4875 && arg1 < this.field4897) {
            int var9 = this.field4898 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg0 + var15 >= this.field4872 && arg0 + var15 < this.field4888 && var12 < arg5) {
                            int var16 = this.field4890[var9 + var15];
                            int var17 = ((var16 & 16711935) * var14 >> 8 & 16711935) + ((var16 & 65280) * var14 >> 8 & 65280);
                            this.field4890[var9 + var15] = var13 + var17;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var18 = 0;
                    while (var18 < arg2) {
                        if (arg0 + var18 >= this.field4872 && arg0 + var18 < this.field4888 && var12 < arg5) {
                            int var19 = this.field4890[var9 + var18];
                            int var20 = arg3 + var19;
                            int var21 = (arg3 & 16711935) + (var19 & 16711935);
                            int var22 = (var20 - var21 & 65536) + (var21 & 16777472);
                            this.field4890[var9 + var18] = var20 - var22 | var22 - (var22 >>> 8);
                        }
                        ++var18;
                        ++var12;
                        var12 %= var11;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                int var23 = 0;
                while (var23 < arg2) {
                    if (arg0 + var23 >= this.field4872 && arg0 + var23 < this.field4888 && var12 < arg5) {
                        this.field4890[var9 + var23] = arg3;
                    }
                    ++var23;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aha", name = "n", descriptor = "(I)[I")
    public final int[] method2183(int arg0) {
        class534 var2 = this.field4899;
        class364 var3;
        synchronized (this.field4899) {
            var3 = (class364) this.field4899.method3079((long) arg0 | Long.MIN_VALUE, 0);
            if (var3 == null) {
                if (!super.field830.method1071((byte) 119, arg0)) {
                    return null;
                }
                class537 var5 = super.field830.method1072(arg0, true);
                int var6 = !var5.field7460 && !this.field4884 ? this.field4894 : 64;
                var3 = new class364(arg0, var6, super.field830.method1068(var6, 0.7F, arg0, -22669, true, var6), var5.field7450 != 1);
                this.field4899.method3077((byte) -31, (long) arg0 | Long.MIN_VALUE, var3);
            }
        }
        var3.field4687 = true;
        return var3.method2103();
    }

    @OriginalMember(owner = "client!aha", name = "f", descriptor = "(II)V")
    public final void method468(int arg0, int arg1) {
        class567 var3 = this.method2185(Thread.currentThread());
        this.field4871 = arg0;
        this.field4883 = arg1;
        var3.field7954 = this.field4883 - 255;
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class489 arg6, int arg7, int arg8) {
        class324 var10 = (class324) arg6;
        int[] var11 = var10.field4168;
        int[] var12 = var10.field4170;
        int var13 = this.field4875 > arg8 ? this.field4875 : arg8;
        int var14 = this.field4897 < var11.length + arg8 ? this.field4897 : var11.length + arg8;
        int var15 = arg2 - arg0;
        int var16 = arg3 - arg1;
        if (var15 + var16 < 0) {
            arg0 += var15;
            var15 = -var15;
            arg1 += var16;
            var16 = -var16;
        }
        if (var15 > var16) {
            int var17 = arg1 << 16;
            int var18 = var17 + 32768;
            int var19 = var16 << 16;
            int var20 = (int) Math.floor((double) var19 / (double) var15 + 0.5D);
            int var21 = arg0 + var15;
            if (arg0 < this.field4872) {
                var18 += (this.field4872 - arg0) * var20;
                arg0 = this.field4872;
            }
            if (var21 >= this.field4888) {
                var21 = this.field4888 - 1;
            }
            int var22 = arg4 >>> 24;
            if (arg5 != 0 && (arg5 != 1 || var22 != 255)) {
                if (arg5 == 1) {
                    int var23 = (var22 << 24) + ((arg4 & 16711935) * var22 >> 8 & 16711935) + ((arg4 & 65280) * var22 >> 8 & 65280);
                    int var24 = 256 - var22;
                    while (arg0 <= var21) {
                        int var25 = var18 >> 16;
                        int var26 = var25 - arg8;
                        if (var25 >= var13 && var25 < var14) {
                            int var27 = var11[var26] + arg7;
                            if (arg0 >= var27 && arg0 < var12[var26] + var27) {
                                int var28 = this.field4898 * var25 + arg0;
                                int var29 = this.field4890[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field4890[var28] = var23 + var30;
                            }
                        }
                        var18 += var20;
                        ++arg0;
                    }
                } else if (arg5 == 2) {
                    while (arg0 <= var21) {
                        int var31 = var18 >> 16;
                        int var32 = var31 - arg8;
                        if (var31 >= var13 && var31 < var14) {
                            int var33 = var11[var32] + arg7;
                            if (arg0 >= var33 && arg0 < var12[var32] + var33) {
                                int var34 = this.field4898 * var31 + arg0;
                                int var35 = this.field4890[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field4890[var34] = var36 - var38 | var38 - (var38 >>> 8);
                            }
                        }
                        var18 += var20;
                        ++arg0;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                while (arg0 <= var21) {
                    int var39 = var18 >> 16;
                    int var40 = var39 - arg8;
                    if (var39 >= var13 && var39 < var14) {
                        int var41 = var11[var40] + arg7;
                        if (arg0 >= var41 && arg0 < var12[var40] + var41) {
                            this.field4890[this.field4898 * var39 + arg0] = arg4;
                        }
                    }
                    var18 += var20;
                    ++arg0;
                }
            }
        } else {
            int var42 = arg0 << 16;
            int var43 = var42 + 32768;
            int var44 = var15 << 16;
            int var45 = (int) Math.floor((double) var44 / (double) var16 + 0.5D);
            int var46 = arg1 + var16;
            if (arg1 < var13) {
                var43 += (var13 - arg1) * var45;
                arg1 = var13;
            }
            if (var46 >= var14) {
                var46 = var14 - 1;
            }
            int var47 = arg4 >>> 24;
            if (arg5 == 0 || arg5 == 1 && var47 == 255) {
                while (arg1 <= var46) {
                    int var64 = var43 >> 16;
                    int var65 = arg1 - arg8;
                    int var66 = var11[var65] + arg7;
                    if (var64 >= this.field4872 && var64 < this.field4888 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field4890[this.field4898 * arg1 + var64] = arg4;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 1) {
                int var48 = (var47 << 24) + ((arg4 & 16711935) * var47 >> 8 & 16711935) + ((arg4 & 65280) * var47 >> 8 & 65280);
                int var49 = 256 - var47;
                while (arg1 <= var46) {
                    int var50 = var43 >> 16;
                    int var51 = arg1 - arg8;
                    int var52 = var11[var51] + arg7;
                    if (var50 >= this.field4872 && var50 < this.field4888 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field4898 * arg1 + var50;
                        int var54 = this.field4890[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field4890[this.field4898 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field4872 && var56 < this.field4888 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field4898 * arg1 + var56;
                        int var60 = this.field4890[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field4890[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!aha", name = "b", descriptor = "(IIIIII)V")
    public final void method460(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method491(arg0, arg1, arg2, arg4, arg5);
        this.method491(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method477(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method477(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIII)V")
    public final void method472(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(Ljl;[Lhb;Z)Lda;")
    public final class61 method500(class274 arg0, class728[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field10135;
            var5[var7] = arg1[var7].field10132;
            if (arg1[var7].field10133 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new class246(this, arg0, arg1, var4, var5);
            } else {
                return new class376(this, arg0, arg1, var4, var5);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new class95(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!aha", name = "DA", descriptor = "(IIII)V")
    public final void method437(int arg0, int arg1, int arg2, int arg3) {
        this.field4901 = arg0;
        this.field4876 = arg1;
        this.field4874 = arg2;
        this.field4881 = arg3;
        this.method2188();
    }

    @OriginalMember(owner = "client!aha", name = "o", descriptor = "(I)I")
    public final int method2184(int arg0) {
        return super.field830.method1072(arg0, true).field7450;
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        class567 var14 = this.method2185(Thread.currentThread());
        class50 var15 = var14.field7973;
        var15.field695 = false;
        int var16 = arg0 - this.field4906;
        int var17 = arg3 - this.field4906;
        int var18 = arg6 - this.field4906;
        int var19 = arg1 - this.field4879;
        int var20 = arg4 - this.field4879;
        int var21 = arg7 - this.field4879;
        var15.field696 = var16 < 0 || var16 > var15.field694 || var17 < 0 || var17 > var15.field694 || var18 < 0 || var18 > var15.field694;
        int var22 = arg9 >>> 24;
        if (arg12 != 0 && (arg12 != 1 || var22 != 255)) {
            if (arg12 == 1) {
                var15.field693 = 255 - var22;
                var15.field692 = false;
                var15.method377((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            } else {
                if (arg12 != 2) {
                    throw new IllegalArgumentException();
                }
                var15.field693 = 128;
                var15.field692 = true;
                var15.method377((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
            }
        } else {
            var15.field693 = 0;
            var15.field692 = false;
            var15.method377((float) var19, (float) var20, (float) var21, (float) var16, (float) var17, (float) var18, (float) arg2, (float) arg5, (float) arg8, arg9, arg10, arg11);
        }
        var15.field695 = true;
    }

    @OriginalMember(owner = "client!aha", name = "C", descriptor = "(Z)V")
    public final void method504(boolean arg0) {
        class567 var2 = this.method2185(Thread.currentThread());
        var2.field7961 = arg0;
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class489 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        class324 var13 = (class324) arg6;
        int[] var14 = var13.field4168;
        int[] var15 = var13.field4170;
        int var16 = this.field4875 > arg8 ? this.field4875 : arg8;
        int var17 = this.field4897 < var14.length + arg8 ? this.field4897 : var14.length + arg8;
        int var18 = arg11 << 8;
        int var19 = arg9 << 8;
        int var20 = arg10 << 8;
        int var21 = var19 + var20;
        int var22 = var18 % var21;
        int var23 = arg2 - arg0;
        int var24 = arg3 - arg1;
        if (var23 + var24 < 0) {
            int var25 = (int) (Math.sqrt((double) (var23 * var23 + var24 * var24)) * 256.0D);
            int var26 = var25 % var21;
            int var27 = var19 + var21 - var22 - var26;
            var22 = var27 % var21;
            if (var22 < 0) {
                var22 += var21;
            }
            arg0 += var23;
            var23 = -var23;
            arg1 += var24;
            var24 = -var24;
        }
        if (var23 > var24) {
            int var28 = arg1 << 16;
            int var29 = var28 + 32768;
            int var30 = var24 << 16;
            int var31 = (int) Math.floor((double) var30 / (double) var23 + 0.5D);
            int var32 = arg0 + var23;
            int var33 = arg4 >>> 24;
            int var34 = (int) Math.sqrt((double) ((var31 >> 8) * (var31 >> 8) + 65536));
            if (arg5 != 0 && (arg5 != 1 || var33 != 255)) {
                if (arg5 == 1) {
                    int var35 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var36 = 256 - var33;
                    while (arg0 <= var32) {
                        int var37 = var29 >> 16;
                        int var38 = var37 - arg8;
                        if (arg0 >= this.field4872 && arg0 < this.field4888 && var37 >= var16 && var37 < var17 && var22 < var19) {
                            int var39 = var14[var38] + arg7;
                            if (arg0 >= var39 && arg0 < var15[var38] + var39) {
                                int var40 = this.field4898 * var37 + arg0;
                                int var41 = this.field4890[var40];
                                int var42 = ((var41 & 16711935) * var36 >> 8 & 16711935) + ((var41 & 65280) * var36 >> 8 & 65280);
                                this.field4890[var40] = var35 + var42;
                            }
                        }
                        var29 += var31;
                        ++arg0;
                        int var43 = var22 + var34;
                        var22 = var43 % var21;
                    }
                } else if (arg5 == 2) {
                    while (arg0 <= var32) {
                        int var44 = var29 >> 16;
                        int var45 = var44 - arg8;
                        if (arg0 >= this.field4872 && arg0 < this.field4888 && var44 >= var16 && var44 < var17 && var22 < var19) {
                            int var46 = var14[var45] + arg7;
                            if (arg0 >= var46 && arg0 < var15[var45] + var46) {
                                int var47 = this.field4898 * var44 + arg0;
                                int var48 = this.field4890[var47];
                                int var49 = arg4 + var48;
                                int var50 = (arg4 & 16711935) + (var48 & 16711935);
                                int var51 = (var49 - var50 & 65536) + (var50 & 16777472);
                                this.field4890[var47] = var49 - var51 | var51 - (var51 >>> 8);
                            }
                        }
                        var29 += var31;
                        ++arg0;
                        int var52 = var22 + var34;
                        var22 = var52 % var21;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                while (arg0 <= var32) {
                    int var53 = var29 >> 16;
                    int var54 = var53 - arg8;
                    if (arg0 >= this.field4872 && arg0 < this.field4888 && var53 >= var16 && var53 < var17 && var22 < var19) {
                        int var55 = var14[var54] + arg7;
                        if (arg0 >= var55 && arg0 < var15[var54] + var55) {
                            this.field4890[this.field4898 * var53 + arg0] = arg4;
                        }
                    }
                    var29 += var31;
                    ++arg0;
                    int var56 = var22 + var34;
                    var22 = var56 % var21;
                }
            }
        } else {
            int var57 = arg0 << 16;
            int var58 = var57 + 32768;
            int var59 = var23 << 16;
            int var60 = (int) Math.floor((double) var59 / (double) var24 + 0.5D);
            int var61 = (int) Math.sqrt((double) ((var60 >> 8) * (var60 >> 8) + 65536));
            int var62 = arg1 + var24;
            int var63 = arg4 >>> 24;
            if (arg5 == 0 || arg5 == 1 && var63 == 255) {
                while (arg1 <= var62) {
                    int var80 = var58 >> 16;
                    int var81 = arg1 - arg8;
                    if (arg1 >= var16 && arg1 < var17 && var80 >= this.field4872 && var80 < this.field4888 && var22 < var19 && var80 >= var14[var81] + arg7 && var80 < var14[var81] + arg7 + var15[var81]) {
                        this.field4890[this.field4898 * arg1 + var80] = arg4;
                    }
                    var58 += var60;
                    ++arg1;
                    int var82 = var22 + var61;
                    var22 = var82 % var21;
                }
            } else if (arg5 == 1) {
                int var64 = (var63 << 24) + ((arg4 & 16711935) * var63 >> 8 & 16711935) + ((arg4 & 65280) * var63 >> 8 & 65280);
                int var65 = 256 - var63;
                while (arg1 <= var62) {
                    int var66 = var58 >> 16;
                    int var67 = arg1 - arg8;
                    if (arg1 >= var16 && arg1 < var17 && var66 >= this.field4872 && var66 < this.field4888 && var22 < var19 && var66 >= var14[var67] + arg7 && var66 < var14[var67] + arg7 + var15[var67]) {
                        int var68 = this.field4898 * arg1 + var66;
                        int var69 = this.field4890[var68];
                        int var70 = ((var69 & 16711935) * var65 >> 8 & 16711935) + ((var69 & 65280) * var65 >> 8 & 65280);
                        this.field4890[this.field4898 * arg1 + var66] = var64 + var70;
                    }
                    var58 += var60;
                    ++arg1;
                    int var71 = var22 + var61;
                    var22 = var71 % var21;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var62) {
                    int var72 = var58 >> 16;
                    int var73 = arg1 - arg8;
                    if (arg1 >= var16 && arg1 < var17 && var72 >= this.field4872 && var72 < this.field4888 && var22 < var19 && var72 >= var14[var73] + arg7 && var72 < var14[var73] + arg7 + var15[var73]) {
                        int var74 = this.field4898 * arg1 + var72;
                        int var75 = this.field4890[var74];
                        int var76 = arg4 + var75;
                        int var77 = (arg4 & 16711935) + (var75 & 16711935);
                        int var78 = (var76 - var77 & 65536) + (var77 & 16777472);
                        this.field4890[var74] = var76 - var78 | var78 - (var78 >>> 8);
                    }
                    var58 += var60;
                    ++arg1;
                    int var79 = var22 + var61;
                    var22 = var79 % var21;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "()Z")
    public final boolean method431() {
        return false;
    }

    @OriginalMember(owner = "client!aha", name = "I", descriptor = "()I")
    public final int method440() {
        int var1 = this.field4889;
        this.field4889 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(Ljava/lang/Runnable;)Lk;")
    public final class567 method2185(Runnable arg0) {
        for (int var2 = 0; var2 < this.field4905; ++var2) {
            if (this.field4900[var2].field7951 == arg0) {
                return this.field4900[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!aha", name = "f", descriptor = "(I)V")
    public final void method473(int arg0) {
        this.field4894 = arg0;
        this.field4899.method3065(true);
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "([I)V")
    public final void method454(int[] arg0) {
        arg0[0] = this.field4898;
        arg0[1] = this.field4892;
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(I[Llaa;)V")
    public final void method456(int arg0, class123[] arg1) {
    }

    @OriginalMember(owner = "client!aha", name = "c", descriptor = "(II)V")
    public final void method497(int arg0, int arg1) throws class230 {
        if (this.field4861 != null && this.field4863 != null) {
            try {
                Graphics var3 = this.field4861.getGraphics();
                this.field4863.method3429(0, arg1, this.field4864, -72, 0, arg0, var3, this.field4867);
            } catch (Exception var4) {
                this.field4861.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!aha", name = "L", descriptor = "(III)V")
    public final void method457(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4900.length; ++var4) {
            class567 var5 = this.field4900[var4];
            var5.field7957 = arg0 & 16777215;
            int var6 = var5.field7957 >>> 16 & 255;
            if (var6 < 2) {
                var6 = 2;
            }
            int var7 = var5.field7957 >> 8 & 255;
            if (var7 < 2) {
                var7 = 2;
            }
            int var8 = var5.field7957 & 255;
            if (var8 < 2) {
                var8 = 2;
            }
            var5.field7957 = var6 << 16 | var7 << 8 | var8;
            if (arg1 < 0) {
                var5.field7958 = false;
            } else {
                var5.field7958 = true;
            }
        }
    }

    @OriginalMember(owner = "client!aha", name = "e", descriptor = "()V")
    public final void method459() {
        if (this.field4862) {
            class23.method163(true, false, (byte) 85);
            this.field4862 = false;
        }
        this.field4863 = null;
        this.field4861 = null;
        this.field4867 = 0;
        this.field4864 = 0;
        this.field4865 = null;
        this.field4866 = true;
    }

    @OriginalMember(owner = "client!aha", name = "p", descriptor = "()Z")
    public final boolean method490() {
        return false;
    }

    @OriginalMember(owner = "client!aha", name = "x", descriptor = "()Z")
    public final boolean method526() {
        return false;
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lza;)V")
    public final void method536(class416 arg0) {
    }

    @OriginalMember(owner = "client!aha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method533(Canvas arg0) {
        if (this.field4861 == arg0) {
            this.method486((Canvas) null);
        }
        class717 var2 = (class717) this.field4865.method1160((long) arg0.hashCode(), 124);
        if (var2 != null) {
            var2.method1175(-2);
        }
    }

    @OriginalMember(owner = "client!aha", name = "n", descriptor = "()Lpda;")
    public final class631 method480() {
        return this.field4907;
    }

    @OriginalMember(owner = "client!aha", name = "Y", descriptor = "()[I")
    public final int[] method509() {
        return new int[] { this.field4901, this.field4876, this.field4874, this.field4881 };
    }

    @OriginalMember(owner = "client!aha", name = "A", descriptor = "()Z")
    public final boolean method549() {
        return true;
    }

    @OriginalMember(owner = "client!aha", name = "b", descriptor = "(II)I")
    public final int method484(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!aha", name = "k", descriptor = "()Z")
    public final boolean method474() {
        return true;
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(Llga;IIII)Lka;")
    public final class474 method540(class714 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class105(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!aha", name = "p", descriptor = "(I)Z")
    public final boolean method2186(int arg0) {
        return super.field830.method1072(arg0, true).field7455 || super.field830.method1072(arg0, true).field7442;
    }

    @OriginalMember(owner = "client!aha", name = "j", descriptor = "(I)Lza;")
    public final class416 method541(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!aha", name = "i", descriptor = "()I")
    public final int method451() {
        return this.field4871;
    }

    @OriginalMember(owner = "client!aha", name = "ya", descriptor = "()V")
    public final void method512() {
        if (this.field4872 == 0 && this.field4898 == this.field4888 && this.field4875 == 0 && this.field4897 == this.field4892) {
            int var1 = this.field4878.length;
            int var2 = var1 - (var1 & 7);
            int var3 = 0;
            while (var3 < var2) {
                this.field4878[var3++] = 2.1474836E9F;
                this.field4878[var3++] = 2.1474836E9F;
                this.field4878[var3++] = 2.1474836E9F;
                this.field4878[var3++] = 2.1474836E9F;
                this.field4878[var3++] = 2.1474836E9F;
                this.field4878[var3++] = 2.1474836E9F;
                this.field4878[var3++] = 2.1474836E9F;
                this.field4878[var3++] = 2.1474836E9F;
            }
            while (var3 < var1) {
                this.field4878[var3++] = 2.1474836E9F;
            }
        } else {
            int var4 = this.field4888 - this.field4872;
            int var5 = this.field4897 - this.field4875;
            int var6 = this.field4898 - var4;
            int var7 = this.field4898 * this.field4875 + this.field4872;
            int var8 = var4 >> 3;
            int var9 = var4 & 7;
            int var10 = var7 - 1;
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (var8 > 0) {
                    int var12 = var8;
                    do {
                        ++var10;
                        this.field4878[var10] = 2.1474836E9F;
                        ++var10;
                        this.field4878[var10] = 2.1474836E9F;
                        ++var10;
                        this.field4878[var10] = 2.1474836E9F;
                        ++var10;
                        this.field4878[var10] = 2.1474836E9F;
                        ++var10;
                        this.field4878[var10] = 2.1474836E9F;
                        ++var10;
                        this.field4878[var10] = 2.1474836E9F;
                        ++var10;
                        this.field4878[var10] = 2.1474836E9F;
                        ++var10;
                        this.field4878[var10] = 2.1474836E9F;
                        --var12;
                    } while (var12 > 0);
                }
                if (var9 > 0) {
                    int var13 = var9;
                    do {
                        ++var10;
                        this.field4878[var10] = 2.1474836E9F;
                        --var13;
                    } while (var13 > 0);
                }
                var10 += var6;
            }
        }
    }

    @OriginalMember(owner = "client!aha", name = "JA", descriptor = "(IIIIII)I")
    public final int method529(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = 0;
        float var8 = (float) arg2 * this.field4907.field2426 + (float) arg0 * this.field4907.field2412 + (float) arg1 * this.field4907.field2435 + this.field4907.field2434;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field4907.field2426 + (float) arg3 * this.field4907.field2412 + (float) arg4 * this.field4907.field2435 + this.field4907.field2434;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if (var8 < (float) this.field4871 && var9 < (float) this.field4871) {
            var7 |= 16;
        } else if (var8 > (float) this.field4883 && var9 > (float) this.field4883) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field4907.field2431 + (float) arg0 * this.field4907.field2422 + (float) arg1 * this.field4907.field2424 + this.field4907.field2411) * (float) this.field4874 / var8);
        int var11 = (int) (((float) arg5 * this.field4907.field2431 + (float) arg3 * this.field4907.field2422 + (float) arg4 * this.field4907.field2424 + this.field4907.field2411) * (float) this.field4874 / var9);
        if (var10 < this.field4906 && var11 < this.field4906) {
            var7 |= 1;
        } else if (var10 > this.field4904 && var11 > this.field4904) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field4907.field2410 + (float) arg0 * this.field4907.field2438 + (float) arg1 * this.field4907.field2439 + this.field4907.field2408) * (float) this.field4881 / var8);
        int var13 = (int) (((float) arg5 * this.field4907.field2410 + (float) arg3 * this.field4907.field2438 + (float) arg4 * this.field4907.field2439 + this.field4907.field2408) * (float) this.field4881 / var9);
        if (var12 < this.field4879 && var13 < this.field4879) {
            var7 |= 4;
        } else if (var12 > this.field4896 && var13 > this.field4896) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!aha", name = "e", descriptor = "(I)V")
    public final void method461(int arg0) {
        class105.field1445 = arg0;
        class105.field1511 = arg0;
        if (this.field4905 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method452(this.field4905);
            this.method506(0);
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg2 - arg0;
        int var11 = arg3 - arg1;
        if (var11 == 0) {
            if (var10 >= 0) {
                this.method2182(arg0, arg1, var10 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var12 = arg6 + arg7;
                int var13 = arg8 % var12;
                int var14 = arg6 + var12 - var13 - (-var10 + 1) % var12;
                int var15 = var14 % var12;
                if (var15 < 0) {
                    var15 += var12;
                }
                this.method2182(arg0 + var10, arg1, -var10 + 1, arg4, arg5, arg6, arg7, var15);
            }
        } else if (var10 == 0) {
            if (var11 >= 0) {
                this.method2189(arg0, arg1, var11 + 1, arg4, arg5, arg6, arg7, arg8);
            } else {
                int var16 = arg6 + arg7;
                int var17 = arg8 % var16;
                int var18 = arg6 + var16 - var17 - (-var11 + 1) % var16;
                int var19 = var18 % var16;
                if (var19 < 0) {
                    var19 += var16;
                }
                this.method2189(arg0, arg1 + var11, -var11 + 1, arg4, arg5, arg6, arg7, var19);
            }
        } else {
            int var20 = arg8 << 8;
            int var21 = arg6 << 8;
            int var22 = arg7 << 8;
            int var23 = var21 + var22;
            int var24 = var20 % var23;
            if (var10 + var11 < 0) {
                int var25 = (int) (Math.sqrt((double) (var10 * var10 + var11 * var11)) * 256.0D);
                int var26 = var25 % var23;
                int var27 = var21 + var23 - var24 - var26;
                var24 = var27 % var23;
                if (var24 < 0) {
                    var24 += var23;
                }
                arg0 += var10;
                var10 = -var10;
                arg1 += var11;
                var11 = -var11;
            }
            if (var10 > var11) {
                int var28 = arg1 << 16;
                int var29 = var28 + 32768;
                int var30 = var11 << 16;
                int var31 = (int) Math.floor((double) var30 / (double) var10 + 0.5D);
                int var32 = arg0 + var10;
                int var33 = arg4 >>> 24;
                int var34 = (int) Math.sqrt((double) ((var31 >> 8) * (var31 >> 8) + 65536));
                if (arg5 != 0 && (arg5 != 1 || var33 != 255)) {
                    if (arg5 == 1) {
                        int var35 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                        int var36 = 256 - var33;
                        while (arg0 <= var32) {
                            int var37 = var29 >> 16;
                            if (arg0 >= this.field4872 && arg0 < this.field4888 && var37 >= this.field4875 && var37 < this.field4897 && var24 < var21) {
                                int var38 = this.field4898 * var37 + arg0;
                                int var39 = this.field4890[var38];
                                int var40 = ((var39 & 16711935) * var36 >> 8 & 16711935) + ((var39 & 65280) * var36 >> 8 & 65280);
                                this.field4890[var38] = var35 + var40;
                            }
                            var29 += var31;
                            ++arg0;
                            int var41 = var24 + var34;
                            var24 = var41 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var32) {
                            int var42 = var29 >> 16;
                            if (arg0 >= this.field4872 && arg0 < this.field4888 && var42 >= this.field4875 && var42 < this.field4897 && var24 < var21) {
                                int var43 = this.field4898 * var42 + arg0;
                                int var44 = this.field4890[var43];
                                int var45 = arg4 + var44;
                                int var46 = (arg4 & 16711935) + (var44 & 16711935);
                                int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                                this.field4890[var43] = var45 - var47 | var47 - (var47 >>> 8);
                            }
                            var29 += var31;
                            ++arg0;
                            int var48 = var24 + var34;
                            var24 = var48 % var23;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    while (arg0 <= var32) {
                        int var49 = var29 >> 16;
                        if (arg0 >= this.field4872 && arg0 < this.field4888 && var49 >= this.field4875 && var49 < this.field4897 && var24 < var21) {
                            this.field4890[this.field4898 * var49 + arg0] = arg4;
                        }
                        var29 += var31;
                        ++arg0;
                        int var50 = var24 + var34;
                        var24 = var50 % var23;
                    }
                }
            } else {
                int var51 = arg0 << 16;
                int var52 = var51 + 32768;
                int var53 = var10 << 16;
                int var54 = (int) Math.floor((double) var53 / (double) var11 + 0.5D);
                int var55 = arg1 + var11;
                int var56 = arg4 >>> 24;
                int var57 = (int) Math.sqrt((double) ((var54 >> 8) * (var54 >> 8) + 65536));
                if (arg5 != 0 && (arg5 != 1 || var56 != 255)) {
                    if (arg5 == 1) {
                        int var58 = (var56 << 24) + ((arg4 & 16711935) * var56 >> 8 & 16711935) + ((arg4 & 65280) * var56 >> 8 & 65280);
                        int var59 = 256 - var56;
                        while (arg1 <= var55) {
                            int var60 = var52 >> 16;
                            if (arg1 >= this.field4875 && arg1 < this.field4897 && var60 >= this.field4872 && var60 < this.field4888 && var24 < var21) {
                                int var61 = this.field4898 * arg1 + var60;
                                int var62 = this.field4890[var61];
                                int var63 = ((var62 & 16711935) * var59 >> 8 & 16711935) + ((var62 & 65280) * var59 >> 8 & 65280);
                                this.field4890[this.field4898 * arg1 + var60] = var58 + var63;
                            }
                            var52 += var54;
                            ++arg1;
                            int var64 = var24 + var57;
                            var24 = var64 % var23;
                        }
                    } else if (arg5 == 2) {
                        while (arg1 <= var55) {
                            int var65 = var52 >> 16;
                            if (arg1 >= this.field4875 && arg1 < this.field4897 && var65 >= this.field4872 && var65 < this.field4888 && var24 < var21) {
                                int var66 = this.field4898 * arg1 + var65;
                                int var67 = this.field4890[var66];
                                int var68 = arg4 + var67;
                                int var69 = (arg4 & 16711935) + (var67 & 16711935);
                                int var70 = (var68 - var69 & 65536) + (var69 & 16777472);
                                this.field4890[var66] = var68 - var70 | var70 - (var70 >>> 8);
                            }
                            var52 += var54;
                            ++arg1;
                            int var71 = var24 + var57;
                            var24 = var71 % var23;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    while (arg1 <= var55) {
                        int var72 = var52 >> 16;
                        if (arg1 >= this.field4875 && arg1 < this.field4897 && var72 >= this.field4872 && var72 < this.field4888 && var24 < var21) {
                            this.field4890[this.field4898 * arg1 + var72] = arg4;
                        }
                        var52 += var54;
                        ++arg1;
                        int var73 = var24 + var57;
                        var24 = var73 % var23;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(I)V")
    public final void method433(int arg0) {
        this.field4900[arg0].method3259(116, (Runnable) null);
    }

    @OriginalMember(owner = "client!aha", name = "F", descriptor = "(II)V")
    public final void method493(int arg0, int arg1) {
        int var3 = this.field4898 * arg1 + arg0;
        int var4 = this.field4902 * arg1 + arg0;
        if (var3 != 0 || var4 != 0) {
            int[] var5 = this.field4890;
            float[] var6 = this.field4878;
            if (var3 < 0) {
                int var7 = var5.length + var3;
                class135.method995(var5, -var3, var5, 0, var7);
            } else if (var3 > 0) {
                int var8 = var5.length - var3;
                class135.method995(var5, 0, var5, var3, var8);
            }
            if (var4 < 0) {
                int var9 = var6.length + var4;
                class135.method998(var6, -var4, var6, 0, var9);
            } else {
                if (var4 > 0) {
                    int var10 = var6.length - var4;
                    class135.method998(var6, 0, var6, var4, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIZ)Liea;")
    public final class481 method551(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class62(this, arg0, arg1) : new class398(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!aha", name = "c", descriptor = "()Z")
    public final boolean method442() {
        return false;
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(Ll;IIII)V")
    private final void method2187(class18 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field335;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method2176(arg1, arg2, arg3, arg4, arg0.field337, 1);
        } else {
            if (this.field4908 != var6) {
                class481 var9 = (class481) this.field4880.method3079((long) var6, 0);
                if (var9 == null) {
                    int[] var10 = this.method2183(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method2177(var6) ? 64 : this.field4894;
                    var9 = this.method435(var11, 0, var11, -108, var10, var11);
                    this.field4880.method3077((byte) -109, (long) var6, var9);
                }
                this.field4908 = var6;
                this.field4909 = var9;
            }
            ++var8;
            ((class78) this.field4909).method204(arg1 - arg4, arg2 - arg4, arg3, var8, var8, 0, arg0.field337, 1, 1);
        }
    }

    @OriginalMember(owner = "client!aha", name = "C", descriptor = "()V")
    private final void method2188() {
        this.field4906 = this.field4872 - this.field4901;
        this.field4904 = this.field4888 - this.field4901;
        this.field4879 = this.field4875 - this.field4876;
        this.field4896 = this.field4897 - this.field4876;
        for (int var1 = 0; var1 < this.field4905; ++var1) {
            class50 var5 = this.field4900[var1].field7973;
            var5.field702 = this.field4901 - this.field4872;
            var5.field706 = this.field4876 - this.field4875;
            var5.field694 = this.field4888 - this.field4872;
            var5.field704 = this.field4897 - this.field4875;
        }
        int var2 = this.field4898 * this.field4875 + this.field4872;
        for (int var3 = this.field4875; var3 < this.field4897; ++var3) {
            for (int var4 = 0; var4 < this.field4905; ++var4) {
                this.field4900[var4].field7973.field700[var3 - this.field4875] = var2;
            }
            var2 += this.field4898;
        }
    }

    @OriginalMember(owner = "client!aha", name = "z", descriptor = "()V")
    public final void method547() {
        this.field4899.method3065(true);
        this.field4880.method3065(true);
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method432(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class230 {
        if (this.field4861 != null && this.field4863 != null) {
            try {
                Graphics var5 = this.field4861.getGraphics();
                for (int var6 = 0; var6 < arg1; ++var6) {
                    Rectangle var7 = arg0[var6];
                    if (var7.x + arg2 <= this.field4898 && var7.y + arg3 <= this.field4892 && var7.x + arg2 + var7.width > 0 && var7.y + arg3 + var7.height > 0) {
                        this.field4863.method3429(var7.x, var7.y + arg3, var7.height, -74, var7.y, var7.x + arg2, var5, var7.width);
                    }
                }
            } catch (Exception var8) {
                this.field4861.repaint();
            }
        } else {
            throw new IllegalStateException("off");
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIIIZ)Liea;")
    public final class481 method527(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field4898 * arg1 + arg0;
        int var8 = this.field4898 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field4890[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class62(this, var6, arg2, arg3);
        } else {
            return new class398(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!aha", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method548(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field4869 = (int) (arg1 * 65535.0F);
        this.field4895 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field4877 = (int) (arg3 * 65535.0F / var7);
        this.field4891 = (int) (arg4 * 65535.0F / var7);
        this.field4886 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!aha", name = "b", descriptor = "()I")
    public final int method436() {
        return 0;
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method486(Canvas arg0) {
        if (arg0 != null) {
            class717 var2 = (class717) this.field4865.method1160((long) arg0.hashCode(), 125);
            if (var2 != null) {
                this.field4861 = arg0;
                Dimension var3 = arg0.getSize();
                this.field4867 = var3.width;
                this.field4864 = var3.height;
                this.field4863 = var2;
                if (this.field4882 == null) {
                    this.field4890 = var2.field9976;
                    this.field4898 = var2.field9980;
                    this.field4892 = var2.field9975;
                    if (this.field4902 != this.field4898 || this.field4903 != this.field4892) {
                        this.field4873 = this.field4902 = this.field4898;
                        this.field4887 = this.field4903 = this.field4892;
                        this.field4870 = this.field4878 = new float[this.field4903 * this.field4902];
                    }
                    this.method2180();
                    return;
                }
            }
        } else {
            this.field4861 = null;
            this.field4863 = null;
            if (this.field4882 == null) {
                this.field4890 = null;
                this.field4898 = this.field4892 = 1;
                this.field4902 = this.field4903 = 1;
                this.method2180();
            }
        }
    }

    @OriginalMember(owner = "client!aha", name = "b", descriptor = "(IIIIIIII)V")
    private final void method2189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= this.field4872 && arg0 < this.field4888) {
            int var9 = this.field4898 * arg1 + arg0;
            int var10 = arg3 >>> 24;
            int var11 = arg5 + arg6;
            int var12 = arg7 % var11;
            if (arg4 != 0 && (arg4 != 1 || var10 != 255)) {
                if (arg4 == 1) {
                    int var13 = (var10 << 24) + ((arg3 & 16711935) * var10 >> 8 & 16711935) + ((arg3 & 65280) * var10 >> 8 & 65280);
                    int var14 = 256 - var10;
                    int var15 = 0;
                    while (var15 < arg2) {
                        if (arg1 + var15 >= this.field4875 && arg1 + var15 < this.field4897 && var12 < arg5) {
                            int var16 = this.field4898 * var15 + var9;
                            int var17 = this.field4890[var16];
                            int var18 = ((var17 & 16711935) * var14 >> 8 & 16711935) + ((var17 & 65280) * var14 >> 8 & 65280);
                            this.field4890[var16] = var13 + var18;
                        }
                        ++var15;
                        ++var12;
                        var12 %= var11;
                    }
                } else if (arg4 == 2) {
                    int var19 = 0;
                    while (var19 < arg2) {
                        if (arg1 + var19 >= this.field4875 && arg1 + var19 < this.field4897 && var12 < arg5) {
                            int var20 = this.field4898 * var19 + var9;
                            int var21 = this.field4890[var20];
                            int var22 = arg3 + var21;
                            int var23 = (arg3 & 16711935) + (var21 & 16711935);
                            int var24 = (var22 - var23 & 65536) + (var23 & 16777472);
                            this.field4890[var20] = var22 - var24 | var24 - (var24 >>> 8);
                        }
                        ++var19;
                        ++var12;
                        var12 %= var11;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                int var25 = 0;
                while (var25 < arg2) {
                    if (arg1 + var25 >= this.field4875 && arg1 + var25 < this.field4897 && var12 < arg5) {
                        this.field4890[this.field4898 * var25 + var9] = arg3;
                    }
                    ++var25;
                    ++var12;
                    var12 %= var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lnl;)V")
    public final void method550(class554 arg0) {
        class419 var2 = (class419) arg0;
        this.field4898 = var2.field5338;
        this.field4892 = var2.field5337;
        this.field4890 = var2.field5339;
        this.field4882 = var2;
        this.field4902 = var2.field5338;
        this.field4903 = var2.field5337;
        this.field4878 = var2.field5335;
        this.method2180();
    }

    @OriginalMember(owner = "client!aha", name = "c", descriptor = "(I)V")
    public final void method452(int arg0) {
        this.field4905 = arg0;
        this.field4900 = new class567[this.field4905];
        for (int var2 = 0; var2 < this.field4905; ++var2) {
            this.field4900[var2] = new class567(this);
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lfl;I)V")
    public final void method545(class741 arg0, int arg1) {
        class567 var3 = this.method2185(Thread.currentThread());
        class112 var4 = arg0.field10344.field7154;
        for (class112 var5 = var4.field1623; var4 != var5; var5 = var5.field1623) {
            class18 var6 = (class18) var5;
            int var7 = var6.field333 >> 12;
            int var8 = var6.field339 >> 12;
            int var9 = var6.field338 >> 12;
            float var10 = (float) var9 * this.field4907.field2426 + (float) var7 * this.field4907.field2412 + (float) var8 * this.field4907.field2435 + this.field4907.field2434;
            if (!(var10 < (float) this.field4871) && !(var10 > (float) var3.field7954)) {
                int var11 = (int) (((float) var9 * this.field4907.field2431 + (float) var7 * this.field4907.field2422 + (float) var8 * this.field4907.field2424 + this.field4907.field2411) * (float) this.field4874 / (float) arg1) + this.field4901;
                int var12 = (int) (((float) var9 * this.field4907.field2410 + (float) var7 * this.field4907.field2438 + (float) var8 * this.field4907.field2439 + this.field4907.field2408) * (float) this.field4881 / (float) arg1) + this.field4876;
                if (var11 >= this.field4872 && var11 <= this.field4888 && var12 >= this.field4875 && var12 <= this.field4897) {
                    if (var10 == 0.0F) {
                        var10 = 1.0F;
                    }
                    this.method2187(var6, var11, var12, (int) var10, (this.field4874 * var6.field330 >> 12) / arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!aha", name = "pa", descriptor = "()V")
    public final void method515() {
        for (int var1 = 0; var1 < this.field4900.length; ++var1) {
            this.field4900[var1].field7957 = this.field4900[var1].field7964;
            this.field4900[var1].field7952 = false;
        }
    }

    @OriginalMember(owner = "client!aha", name = "b", descriptor = "(IIIID)V")
    public final void method524(int arg0, int arg1, int arg2, int arg3, double arg4) {
        int var7 = this.field4902 - arg2;
        int var8 = this.field4902 * arg1 + arg0;
        float[] var9 = this.field4878;
        int var10 = 0;
        while (var10 < arg3) {
            int var11 = 0;
            while (var11 < arg2) {
                float var12 = var9[var8];
                if (var12 != 2.1474836E9F) {
                    var9[var8] = (float) ((double) var12 + arg4);
                }
                ++var11;
                ++var8;
            }
            ++var10;
            var8 += var7;
        }
    }

    @OriginalMember(owner = "client!aha", name = "e", descriptor = "(II)I")
    public final int method542(int arg0, int arg1) {
        int var3 = arg0 | 133120;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!aha", name = "r", descriptor = "()Lnia;")
    public final class647 method499() {
        return new class647(0, "Pure Java", 1, "CPU", 0L);
    }
}
