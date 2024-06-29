import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class407 {

    @OriginalMember(owner = "client!wp", name = "g", descriptor = "Lki;")
    public static class364 field5178 = new class364();

    @OriginalMember(owner = "client!wp", name = "j", descriptor = "Lra;")
    public static class361 field5181 = new class361(86, 4);

    @OriginalMember(owner = "client!wp", name = "n", descriptor = "Lra;")
    public static class361 field5185 = new class361(3, 2);

    @OriginalMember(owner = "client!wp", name = "o", descriptor = "[I")
    public static int[] field5186 = new int[1];

    @OriginalMember(owner = "client!wp", name = "p", descriptor = "Lra;")
    public static class361 field5187 = new class361(113, 2);

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
    private int field5174;

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!wp", name = "h", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!wp", name = "i", descriptor = "I")
    public static int field5180;

    @OriginalMember(owner = "client!wp", name = "k", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!wp", name = "l", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!wp", name = "m", descriptor = "I")
    public int field5184;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "Ljava/lang/String;")
    public static String field5172;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)Lmv;")
    public static final class297 method2302(int arg0, int arg1) {
        field5173++;
        class297[] var2 = class374.method2147((byte) -127);
        for (int var3 = arg1; var3 < var2.length; var3++) {
            if (var2[var3].field3889 == arg0) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IBIIIII)V")
    public static final void method2303(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class356.method2050(-6, arg5);
        field5183++;
        int var7 = 0;
        int var8 = arg5 - arg3;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg5;
        int var10 = -arg5;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (arg1 != -29) {
            field5187 = null;
        }
        int[] var15 = class213.field2746[arg4];
        int var16 = arg0 - var8;
        class349.method2008(var16, (byte) 99, var15, arg0 - arg5, arg2);
        int var17 = arg0 + var8;
        class349.method2008(var17, (byte) 77, var15, var16, arg6);
        class349.method2008(arg0 + arg5, (byte) 34, var15, var17, arg2);
        while (var7 < var9) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class13.field148[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var8 <= var9) {
                    int[] var18 = class213.field2746[arg4 + var9];
                    int[] var19 = class213.field2746[arg4 - var9];
                    int var20 = arg0 + var7;
                    int var21 = arg0 - var7;
                    class349.method2008(var20, (byte) 42, var18, var21, arg2);
                    class349.method2008(var20, (byte) 21, var19, var21, arg2);
                } else {
                    int[] var22 = class213.field2746[arg4 + var9];
                    int[] var23 = class213.field2746[arg4 - var9];
                    int var24 = class13.field148[var9];
                    int var25 = arg0 + var7;
                    int var26 = arg0 - var7;
                    int var27 = arg0 + var24;
                    int var28 = arg0 - var24;
                    class349.method2008(var28, (byte) 32, var22, var26, arg2);
                    class349.method2008(var27, (byte) 56, var22, var28, arg6);
                    class349.method2008(var25, (byte) 94, var22, var27, arg2);
                    class349.method2008(var28, (byte) 18, var23, var26, arg2);
                    class349.method2008(var27, (byte) 80, var23, var28, arg6);
                    class349.method2008(var25, (byte) 32, var23, var27, arg2);
                }
            }
            int[] var29 = class213.field2746[arg4 + var7];
            int[] var30 = class213.field2746[arg4 - var7];
            int var31 = arg0 + var9;
            int var32 = arg0 - var9;
            if (var8 <= var7) {
                class349.method2008(var31, (byte) 83, var29, var32, arg2);
                class349.method2008(var31, (byte) 95, var30, var32, arg2);
            } else {
                int var33 = var7 > var11 ? class13.field148[var7] : var11;
                int var34 = arg0 + var33;
                int var35 = arg0 - var33;
                class349.method2008(var35, (byte) 52, var29, var32, arg2);
                class349.method2008(var34, (byte) 19, var29, var35, arg6);
                class349.method2008(var31, (byte) 41, var29, var34, arg2);
                class349.method2008(var35, (byte) 97, var30, var32, arg2);
                class349.method2008(var34, (byte) 104, var30, var35, arg6);
                class349.method2008(var31, (byte) 124, var30, var34, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILoa;Lpe;)V")
    public static final void method2304(int arg0, class43 arg1, class615 arg2) {
        field5177++;
        class506[] var3 = class506.method2731(arg2, class13.field139, 0);
        class519.field6797 = new class511[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class519.field6797[var4] = arg1.method325(var3[var4], true);
        }
        class506[] var5 = class506.method2731(arg2, class37.field543, 0);
        class87.field1153 = new class511[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class87.field1153[var6] = arg1.method325(var5[var6], true);
        }
        class506[] var7 = class506.method2731(arg2, class188.field2406, 0);
        class134.field1745 = new class511[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class134.field1745[var8] = arg1.method325(var7[var8], true);
        }
        class506[] var9 = class506.method2731(arg2, class618.field8350, 0);
        class316.field4104 = new class511[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class316.field4104[var10] = arg1.method325(var9[var10], true);
        }
        class506[] var11 = class506.method2731(arg2, class524.field6829, 0);
        class96.field1259 = new class511[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class96.field1259[var12] = arg1.method325(var11[var12], true);
        }
        class506[] var13 = class506.method2731(arg2, class258.field3480, 0);
        class126.field1635 = new class511[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class126.field1635[var14] = arg1.method325(var13[var14], true);
        }
        class506[] var15 = class506.method2731(arg2, class400.field5110, 0);
        class611.field8251 = new class511[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class611.field8251[var16] = arg1.method325(var15[var16], true);
        }
        class506[] var17 = class506.method2731(arg2, class194.field2538, 0);
        class3.field25 = new class511[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class3.field25[var18] = arg1.method325(var17[var18], true);
        }
        class506[] var19 = class506.method2731(arg2, class86.field1151, 0);
        class542.field7040 = new class511[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class542.field7040[var20] = arg1.method325(var19[var20], true);
        }
        class506[] var21 = class506.method2731(arg2, class463.field6059, 0);
        class49.field687 = new class511[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class49.field687[var22] = arg1.method325(var21[var22], true);
        }
        class506[] var23 = class506.method2731(arg2, class374.field4794, 0);
        class126.field1633 = new class511[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class126.field1633[var24] = arg1.method325(var23[var24], true);
        }
        class506[] var25 = class506.method2731(arg2, class429.field5555, 0);
        class497.field6553 = new class511[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class497.field6553[var26] = arg1.method325(var25[var26], true);
        }
        class307.field4020 = arg1.method325(class506.method2732(arg2, class16.field180, 0), true);
        class422.field5455 = arg1.method325(class506.method2732(arg2, class640.field8894, 0), true);
        class506[] var27 = class506.method2731(arg2, class175.field2191, arg0);
        class499.field6554 = new class511[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class499.field6554[var28] = arg1.method325(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(II)V")
    public final void method2305(int arg0, int arg1) {
        field5175++;
        this.field5174 = arg0;
        this.field5184 = arg1;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIB)Z")
    public final boolean method2306(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -94) {
            return false;
        }
        field5180++;
        int var5 = this.field5174;
        if (this.field5184 == arg0 && this.field5174 == 0) {
            return false;
        }
        boolean var6;
        if (this.field5174 == 0) {
            if (arg0 > this.field5184 && arg0 <= this.field5184 + arg2 || arg0 < this.field5184 && (this.field5184 - arg2) <= arg0) {
                this.field5184 = arg0;
                return false;
            }
            var6 = true;
        } else if (this.field5174 > 0 && this.field5184 < arg0) {
            int var7 = this.field5174 * this.field5174 / (arg2 * 2);
            int var8 = this.field5184 + var7;
            if (arg0 > var8 && this.field5184 <= var8) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field5174 < 0 && arg0 < this.field5184) {
            int var9 = this.field5174 * this.field5174 / (arg2 * 2);
            int var10 = this.field5184 - var9;
            if (var10 > arg0 && var10 <= this.field5184) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (var6) {
            if (arg0 <= this.field5184) {
                this.field5174 -= arg2;
                if (arg1 != 0 && (-arg1) > this.field5174) {
                    this.field5174 = -arg1;
                }
            } else {
                this.field5174 += arg2;
                if (arg1 != 0 && arg1 < this.field5174) {
                    this.field5174 = arg1;
                }
            }
            if (this.field5174 != var5) {
                int var11 = this.field5174 * this.field5174 / (arg2 * 2);
                if (arg0 <= this.field5184) {
                    if (this.field5184 > arg0 && (this.field5184 - var11) < arg0) {
                        this.field5174 = var5;
                    }
                } else if (this.field5184 + var11 > arg0) {
                    this.field5174 = var5;
                }
            }
        } else if (this.field5174 <= 0) {
            this.field5174 += arg2;
            if (this.field5174 > 0) {
                this.field5174 = 0;
            }
        } else {
            this.field5174 -= arg2;
            if (this.field5174 < 0) {
                this.field5174 = 0;
            }
        }
        this.field5184 += this.field5174 + var5 >> 1;
        return var6;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Z)I")
    public final int method2307(boolean arg0) {
        field5176++;
        if (!arg0) {
            method2304(-59, null, null);
        }
        return this.field5184 & 0x3FFF;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V")
    public static void method2308(int arg0) {
        field5178 = null;
        field5172 = null;
        field5187 = null;
        field5186 = null;
        field5185 = null;
        field5181 = null;
        int var1 = 67 % ((arg0 + 45) / 61);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)V")
    public final void method2309(byte arg0) {
        field5179++;
        int var2 = -69 % ((arg0 - 1) / 61);
        this.field5184 &= 0x3FFF;
    }
}
