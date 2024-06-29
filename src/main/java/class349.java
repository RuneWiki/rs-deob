import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class349 extends class238 {

    @OriginalMember(owner = "client!j", name = "r", descriptor = "Ljava/lang/String;")
    public String field5053;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "[[I")
    public static int[][] field5051 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!j", name = "s", descriptor = "Lus;")
    public static class1 field5054 = new class1(74, 2);

    @OriginalMember(owner = "client!j", name = "t", descriptor = "I")
    public static int field5055 = 13156520;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!j", name = "u", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "[I")
    public static int[] field5049;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lrp;IILmj;)V")
    public static final void method2179(class276 arg0, int arg1, int arg2, class430 arg3) {
        field5047++;
        class55 var4 = new class55();
        var4.field737 = arg0.method1701(-23121);
        var4.field740 = arg0.method1688(20402);
        var4.field734 = new class366[var4.field737];
        var4.field742 = new class366[var4.field737];
        var4.field735 = new int[var4.field737];
        var4.field741 = new int[var4.field737];
        var4.field738 = new int[var4.field737];
        var4.field736 = new byte[var4.field737][][];
        for (int var5 = 0; var5 < var4.field737; var5++) {
            try {
                int var6 = arg0.method1701(-23121);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg0.method1750(-114);
                    String var18 = arg0.method1750(-98);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg0.method1688(arg2 + 44987);
                    }
                    var4.field741[var5] = var6;
                    var4.field735[var5] = var19;
                    var4.field734[var5] = arg3.method2539((byte) -24, class389.method2338(var17, (byte) 66), var18);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg0.method1750(-114);
                    String var8 = arg0.method1750(-95);
                    int var9 = arg0.method1701(arg2 ^ 0x3A58);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg0.method1750(-24);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg0.method1688(arg2 + 44987);
                            var12[var13] = new byte[var14];
                            arg0.method1706(var12[var13], 0, arg2 ^ 0x6011, var14);
                        }
                    }
                    var4.field741[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class389.method2338(var10[var16], (byte) 66);
                    }
                    var4.field742[var5] = arg3.method2538(var15, (byte) -41, var8, class389.method2338(var7, (byte) 66));
                    var4.field736[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field738[var5] = -1;
            } catch (SecurityException var21) {
                var4.field738[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field738[var5] = -3;
            } catch (Exception var23) {
                var4.field738[var5] = -4;
            } catch (Throwable var24) {
                var4.field738[var5] = -5;
            }
        }
        if (arg2 == -24585) {
            class140.field1858.method2845(var4, (byte) 37);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public static void method2180(int arg0) {
        field5054 = null;
        field5049 = null;
        field5051 = null;
        if (arg0 != -14468) {
            field5056 = 43;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V")
    public static final void method2181(int arg0, int arg1, int arg2) {
        field5052++;
        class489 var3 = class116.method731(-625541408, 13, arg0);
        if (arg1 <= 47) {
            method2180(-51);
        }
        var3.method2863(255);
        var3.field6895 = arg2;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V")
    public class349() {
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class349(String arg0) {
        this.field5053 = arg0;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lnp;Lin;IIIII)V")
    public static final void method2182(class313 arg0, class54 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class314.field4441 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class287.field4186) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class360.field5188 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class88 var15 = class330.field4786[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class53.field725[var12].method1218(var13, var14) + class53.field725[var12].method1218(var13 + 1, var14) + class53.field725[var12].method1218(var13, var14 + 1) + class53.field725[var12].method1218(var13 + 1, var14 + 1)) / 4 - (class53.field725[arg2].method1218(arg3, arg4) + class53.field725[arg2].method1218(arg3 + 1, arg4) + class53.field725[arg2].method1218(arg3, arg4 + 1) + class53.field725[arg2].method1218(arg3 + 1, arg4 + 1)) / 4;
                                    class237 var17 = var15.field1078;
                                    class237 var18 = var15.field1082;
                                    if (var17 != null && var17.method249(-123)) {
                                        arg1.method247((var14 - arg4) * class418.field5845 + (1 - arg6) * class248.field3674, var17, var16, arg0, (byte) 117, var7, (var13 - arg3) * class418.field5845 + (1 - arg5) * class248.field3674);
                                    }
                                    if (var18 != null && var18.method249(-127)) {
                                        arg1.method247((var14 - arg4) * class418.field5845 + (1 - arg6) * class248.field3674, var18, var16, arg0, (byte) -80, var7, (var13 - arg3) * class418.field5845 + (1 - arg5) * class248.field3674);
                                    }
                                    for (class93 var19 = var15.field1068; var19 != null; var19 = var19.field1178) {
                                        class304 var20 = var19.field1177;
                                        if (var20 != null && var20.method249(-111) && (var20.field4330 == var13 || var8 == var13) && (var20.field4324 == var14 || var10 == var14)) {
                                            int var21 = var20.field4328 + 1 - var20.field4330;
                                            int var22 = var20.field4334 + 1 - var20.field4324;
                                            arg1.method247((var20.field4324 - arg4) * class418.field5845 + (var22 - arg6) * class248.field3674, var20, var16, arg0, (byte) 96, var7, (var20.field4330 - arg3) * class418.field5845 + (var21 - arg5) * class248.field3674);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(B)V")
    public static final void method2183(byte arg0) {
        field5050++;
        class470.method2766(-106, class314.field4438.field5792);
        int var1 = (class490.field6904 >> 10) + (class240.field3602 >> 3);
        int var2 = (class343.field4996 >> 10) + (class360.field5180 >> 3);
        class29.field394 = class492.field6935.field4319 = 0;
        class492.field6935.method2640(8, (byte) 60, 8);
        byte var3 = 18;
        class472.field6643 = new byte[var3][];
        class61.field813 = new int[var3];
        class93.field1184 = new byte[var3][];
        class386.field5482 = new int[var3][4];
        class118.field1499 = new byte[var3][];
        class287.field4195 = new int[var3];
        class114.field1462 = new byte[var3][];
        class368.field5294 = new int[var3];
        class38.field511 = new int[var3];
        class325.field4693 = new byte[var3][];
        class241.field3617 = new int[var3];
        class96.field1233 = new int[var3];
        int var4 = 0;
        if (arg0 >= -42) {
            return;
        }
        for (int var5 = (var1 - (class58.field758 >> 4)) / 8; var5 <= ((class58.field758 >> 4) + var1) / 8; var5++) {
            for (int var7 = (var2 - (class287.field4181 >> 4)) / 8; var7 <= ((class287.field4181 >> 4) + var2) / 8; var7++) {
                int var8 = (var5 << 8) + var7;
                class368.field5294[var4] = var8;
                class61.field813[var4] = class303.field4311.method1234(false, "m" + var5 + "_" + var7);
                class287.field4195[var4] = class303.field4311.method1234(false, "l" + var5 + "_" + var7);
                class38.field511[var4] = class303.field4311.method1234(false, "n" + var5 + "_" + var7);
                class96.field1233[var4] = class303.field4311.method1234(false, "um" + var5 + "_" + var7);
                class241.field3617[var4] = class303.field4311.method1234(false, "ul" + var5 + "_" + var7);
                if (class38.field511[var4] == -1) {
                    class61.field813[var4] = -1;
                    class287.field4195[var4] = -1;
                    class96.field1233[var4] = -1;
                    class241.field3617[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class38.field511.length; var6++) {
            class38.field511[var6] = -1;
            class61.field813[var6] = -1;
            class287.field4195[var6] = -1;
            class96.field1233[var6] = -1;
            class241.field3617[var6] = -1;
        }
        class483.method2824(var1, true, (byte) -36, var2, false);
    }
}
