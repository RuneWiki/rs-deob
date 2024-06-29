import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public abstract class class24 extends class50 {

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "Lod;")
    public static class471 field359 = null;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!tj", name = "x", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IBI)Z", line = 12)
    public static final boolean method242(int arg0, byte arg1, int arg2) {
        if (arg1 >= -66) {
            return true;
        } else {
            field356++;
            return class173.method1188(-65, arg2, arg0) | (arg0 & 0x40000) != 0 || class242.method1474(arg0, -50, arg2);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIIIII)V", line = 25)
    public static final void method243(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field360++;
        int var8 = 0;
        int var9 = arg3;
        int var10 = 0;
        int var11 = arg7 - arg2;
        int var12 = arg3 - arg2;
        int var13 = arg7 * arg7;
        int var14 = arg3 * arg3;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        if (arg0 > -68) {
            method242(124, (byte) 65, 46);
        }
        int var20 = var15 << 1;
        int var21 = arg3 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg3 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class306.field4574[arg5];
        class94.method740(var39, arg6 - arg7, -var11 + arg6, arg4, false);
        class94.method740(var39, arg6 - var11, arg6 + var11, arg1, false);
        class94.method740(var39, arg6 + var11, arg6 + arg7, arg4, false);
        while (var9 > 0) {
            boolean var40 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var31 += var28;
                    var8++;
                    var35 += var28;
                }
            }
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var33 += var30;
                        var10++;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var37 += var30;
                    var33 += var30;
                    var10++;
                }
                var25 += -var38;
                var26 += -var34;
                var34 -= var29;
                var38 -= var29;
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var35 += var28;
                var31 += var28;
                var8++;
            }
            var24 += -var32;
            var23 += -var36;
            var9--;
            var36 -= var27;
            var32 -= var27;
            int var41 = arg5 - var9;
            int var42 = arg5 + var9;
            int var43 = arg6 + var8;
            int var44 = arg6 - var8;
            if (var40) {
                int var45 = arg6 + var10;
                int var46 = arg6 - var10;
                class94.method740(class306.field4574[var41], var44, var46, arg4, false);
                class94.method740(class306.field4574[var41], var46, var45, arg1, false);
                class94.method740(class306.field4574[var41], var45, var43, arg4, false);
                class94.method740(class306.field4574[var42], var44, var46, arg4, false);
                class94.method740(class306.field4574[var42], var46, var45, arg1, false);
                class94.method740(class306.field4574[var42], var45, var43, arg4, false);
            } else {
                class94.method740(class306.field4574[var41], var44, var43, arg4, false);
                class94.method740(class306.field4574[var42], var44, var43, arg4, false);
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILec;Lgk;I)V", line = 198)
    public static final void method245(int arg0, class109 arg1, class468 arg2, int arg3) {
        field357++;
        class332 var4 = new class332();
        var4.field5149 = arg2.method2765(95);
        var4.field5155 = arg2.method2722(false);
        var4.field5147 = new byte[var4.field5149][][];
        var4.field5144 = new class533[var4.field5149];
        var4.field5151 = new class533[var4.field5149];
        var4.field5145 = new int[var4.field5149];
        var4.field5153 = new int[var4.field5149];
        var4.field5154 = new int[var4.field5149];
        if (arg3 != -277403871) {
            return;
        }
        for (int var5 = 0; var5 < var4.field5149; var5++) {
            try {
                int var6 = arg2.method2765(arg3 + 277403927);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg2.method2770(-20459);
                    String var18 = arg2.method2770(-20459);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg2.method2722(false);
                    }
                    var4.field5154[var5] = var6;
                    var4.field5145[var5] = var19;
                    var4.field5151[var5] = arg1.method815(-11539, var18, class397.method2384((byte) -126, var17));
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg2.method2770(-20459);
                    String var8 = arg2.method2770(arg3 + 277383412);
                    int var9 = arg2.method2765(95);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg2.method2770(-20459);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg2.method2722(false);
                            var12[var13] = new byte[var14];
                            arg2.method2716(0, 82, var12[var13], var14);
                        }
                    }
                    var4.field5154[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class397.method2384((byte) -126, var10[var16]);
                    }
                    var4.field5144[var5] = arg1.method817(0, var15, var8, class397.method2384((byte) -127, var7));
                    var4.field5147[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field5153[var5] = -1;
            } catch (SecurityException var21) {
                var4.field5153[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field5153[var5] = -3;
            } catch (Exception var23) {
                var4.field5153[var5] = -4;
            } catch (Throwable var24) {
                var4.field5153[var5] = -5;
            }
        }
        class261.field3905.method2958(var4, (byte) 23);
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)Lui;")
    public abstract class487 method244(int arg0);
}
