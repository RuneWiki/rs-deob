import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class242 extends class313 {

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "I")
    private int field3948 = 10;

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "I")
    private int field3954 = 2048;

    @OriginalMember(owner = "client!tb", name = "X", descriptor = "I")
    private int field3961 = 0;

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "I")
    public static int field3947 = 0;

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "Ljava/lang/String;")
    public static String field3951 = null;

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "I")
    public static int field3958 = 0;

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!tb", name = "L", descriptor = "[I")
    private int[] field3949;

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "[I")
    private int[] field3952;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILpi;)V", line = 10)
    public final void method185(int arg0, int arg1, class336 arg2) {
        field3950++;
        if (arg1 != -17848) {
            method1694(74, -36, 45, 10, (byte) 96, -50, 4);
        }
        if (arg0 == 0) {
            this.field3948 = arg2.method2364(-9069);
        } else if (arg0 == 1) {
            this.field3954 = arg2.method2339((byte) -46);
        } else if (arg0 == 2) {
            this.field3961 = arg2.method2364(-9069);
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V", line = 57)
    public class242() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIBII)V", line = 61)
    public static final void method1694(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field3957++;
        if (arg4 > -69) {
            method1695((byte) -34, (float[]) null);
        }
        int var7 = -arg5;
        int var8 = arg5;
        int var9 = arg5 - arg2;
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = 0;
        class108.method949(arg5, -12143);
        int var11 = var9;
        int var12 = -var9;
        int var13 = -1;
        int var14 = -1;
        if (class90.field1428 <= arg0 && arg0 <= class135.field2358) {
            int[] var15 = class64.field1007[arg0];
            int var16 = class105.method899(false, class310.field4916, class170.field2944, arg3 - arg5);
            int var17 = class105.method899(false, class310.field4916, class170.field2944, arg3 + arg5);
            int var18 = class105.method899(false, class310.field4916, class170.field2944, arg3 - var9);
            int var19 = class105.method899(false, class310.field4916, class170.field2944, arg3 + var9);
            class317.method2184(var18, (byte) -52, var15, arg6, var16);
            class317.method2184(var19, (byte) -42, var15, arg1, var18);
            class317.method2184(var17, (byte) 121, var15, arg6, var19);
        }
        while (var8 > var10) {
            var13 += 2;
            var14 += 2;
            var7 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class246.field3999[var11] = var10;
            }
            var10++;
            if (var7 >= 0) {
                var8--;
                int var20 = arg0 - var8;
                var7 -= var8 << 1;
                int var21 = arg0 + var8;
                if (var21 >= class90.field1428 && class135.field2358 >= var20) {
                    if (var8 >= var9) {
                        int var22 = class105.method899(false, class310.field4916, class170.field2944, arg3 + var10);
                        int var23 = class105.method899(false, class310.field4916, class170.field2944, arg3 - var10);
                        if (class135.field2358 >= var21) {
                            class317.method2184(var22, (byte) 124, class64.field1007[var21], arg6, var23);
                        }
                        if (class90.field1428 <= var20) {
                            class317.method2184(var22, (byte) 89, class64.field1007[var20], arg6, var23);
                        }
                    } else {
                        int var24 = class246.field3999[var8];
                        int var25 = class105.method899(false, class310.field4916, class170.field2944, arg3 + var10);
                        int var26 = class105.method899(false, class310.field4916, class170.field2944, arg3 - var10);
                        int var27 = class105.method899(false, class310.field4916, class170.field2944, arg3 + var24);
                        int var28 = class105.method899(false, class310.field4916, class170.field2944, arg3 - var24);
                        if (class135.field2358 >= var21) {
                            int[] var29 = class64.field1007[var21];
                            class317.method2184(var28, (byte) 112, var29, arg6, var26);
                            class317.method2184(var27, (byte) 123, var29, arg1, var28);
                            class317.method2184(var25, (byte) -118, var29, arg6, var27);
                        }
                        if (var20 >= class90.field1428) {
                            int[] var30 = class64.field1007[var20];
                            class317.method2184(var28, (byte) 99, var30, arg6, var26);
                            class317.method2184(var27, (byte) 98, var30, arg1, var28);
                            class317.method2184(var25, (byte) 81, var30, arg6, var27);
                        }
                    }
                }
            }
            int var31 = arg0 - var10;
            int var32 = arg0 + var10;
            if (class90.field1428 <= var32 && var31 <= class135.field2358) {
                int var33 = arg3 - var8;
                int var34 = arg3 + var8;
                if (class170.field2944 <= var34 && class310.field4916 >= var33) {
                    int var35 = class105.method899(false, class310.field4916, class170.field2944, var34);
                    int var36 = class105.method899(false, class310.field4916, class170.field2944, var33);
                    if (var10 < var9) {
                        int var37 = var11 >= var10 ? var11 : class246.field3999[var10];
                        int var38 = class105.method899(false, class310.field4916, class170.field2944, arg3 + var37);
                        int var39 = class105.method899(false, class310.field4916, class170.field2944, arg3 - var37);
                        if (var32 <= class135.field2358) {
                            int[] var40 = class64.field1007[var32];
                            class317.method2184(var39, (byte) -32, var40, arg6, var36);
                            class317.method2184(var38, (byte) -93, var40, arg1, var39);
                            class317.method2184(var35, (byte) -76, var40, arg6, var38);
                        }
                        if (class90.field1428 <= var31) {
                            int[] var41 = class64.field1007[var31];
                            class317.method2184(var39, (byte) 125, var41, arg6, var36);
                            class317.method2184(var38, (byte) -34, var41, arg1, var39);
                            class317.method2184(var35, (byte) 124, var41, arg6, var38);
                        }
                    } else {
                        if (var32 <= class135.field2358) {
                            class317.method2184(var35, (byte) -45, class64.field1007[var32], arg6, var36);
                        }
                        if (class90.field1428 <= var31) {
                            class317.method2184(var35, (byte) -87, class64.field1007[var31], arg6, var36);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V", line = 246)
    public final void method182(int arg0) {
        field3946++;
        this.method1696(-128);
        if (arg0 != 25833) {
            this.field3949 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B[F)[F", line = 261)
    public static final float[] method1695(byte arg0, float[] arg1) {
        field3960++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 != -67) {
            method1697(-110);
        }
        float[] var2 = new float[arg1.length];
        class345.method2416(arg1, 0, var2, 0, arg1.length);
        return var2;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)[I", line = 286)
    public final int[] method111(int arg0, int arg1) {
        if (arg0 != 4) {
            field3958 = 33;
        }
        field3955++;
        int[] var3 = this.field4961.method1520(-1908965694, arg1);
        if (this.field4961.field3451) {
            int var4 = class1.field6[arg1];
            if (this.field3961 == 0) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field3948; var6++) {
                    if (var4 >= this.field3952[var6] && var4 < this.field3952[var6 + 1]) {
                        if (var4 < this.field3949[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class345.method2422(var3, 0, class133.field2269, var5);
            } else {
                for (int var7 = 0; var7 < class133.field2269; var7++) {
                    int var8 = 0;
                    int var9 = class8.field104[var7];
                    int var10 = this.field3961;
                    if (var10 == 1) {
                        var8 = var9;
                    } else if (var10 == 2) {
                        var8 = (var9 - (4096 - var4) >> 1) + 2048;
                    } else if (var10 == 3) {
                        var8 = (var9 - var4 >> 1) + 2048;
                    }
                    short var11 = 0;
                    for (int var12 = 0; var12 < this.field3948; var12++) {
                        if (this.field3952[var12] <= var8 && this.field3952[var12 + 1] > var8) {
                            if (this.field3949[var12] > var8) {
                                var11 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var11;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)V", line = 401)
    private final void method1696(int arg0) {
        this.field3952 = new int[this.field3948 + 1];
        this.field3949 = new int[this.field3948 + 1];
        if (arg0 >= -122) {
            return;
        }
        field3959++;
        int var2 = 0;
        int var3 = 4096 / this.field3948;
        int var4 = this.field3954 * var3 >> 12;
        for (int var5 = 0; var5 < this.field3948; var5++) {
            this.field3952[var5] = var2;
            this.field3949[var5] = var2 + var4;
            var2 += var3;
        }
        this.field3952[this.field3948] = 4096;
        this.field3949[this.field3948] = this.field3949[0] + 4096;
    }

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "(I)V", line = 436)
    public static void method1697(int arg0) {
        if (arg0 != 3) {
            field3951 = (String) null;
        }
        field3951 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIZLcg;III)V", line = 447)
    public static final void method1698(int arg0, int arg1, boolean arg2, class49 arg3, int arg4, int arg5, int arg6) {
        if (arg4 != -3) {
            return;
        }
        class241.field3924 = arg6;
        field3953++;
        class226.field3799 = arg0;
        class249.field4044 = arg3;
        class191.field3201 = arg5;
        class44.field705 = 1;
        class125.field2155 = arg1;
        class334.field5300 = arg2;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "()V", line = 468)
    public static final void method1699() {
        for (int var0 = 0; var0 < class13.field210; var0++) {
            class241 var1 = class128.field2222[var0];
            class316.method2171(var1);
            class128.field2222[var0] = null;
        }
        class13.field210 = 0;
    }
}
