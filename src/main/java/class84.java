import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class84 {

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1529 = Calendar.getInstance();

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "Lmf;")
    public static class174 field1530 = new class174(64);

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "Lke;")
    private static class256 field1531 = class316.method2202("", 27626);

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "Lke;")
    public static class256 field1533 = field1531;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "Lke;")
    public static class256 field1534 = class316.method2202("tremblement:", 27626);

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V", line = 19)
    public static final void method617(byte arg0) {
        field1527++;
        if (class42.field809 > 0) {
            class241.method1615((byte) -24);
            return;
        }
        class166.field2949 = class196.field3586;
        if (arg0 >= -2) {
            field1531 = (class256) null;
        }
        class196.field3586 = null;
        class11.method67((byte) 74, 40);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V", line = 39)
    public static final void method618(int arg0) {
        field1524++;
        class62 var1 = new class62();
        if (arg0 != 28) {
            return;
        }
        for (int var2 = 0; var2 < 13; var2++) {
            for (int var3 = 0; var3 < 13; var3++) {
                class163.field2889[var2][var3] = var1;
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILra;)V", line = 72)
    public static final void method619(int arg0, class41 arg1) {
        field1528++;
        if ((arg1.field772.length - arg1.field738) < 1) {
            return;
        }
        int var2 = arg1.method357(false);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (var3 > arg1.field772.length - arg1.field738) {
            return;
        }
        class106.field1895 = arg1.method357(false);
        if (class106.field1895 < 1) {
            class106.field1895 = 1;
        } else if (class106.field1895 > 4) {
            class106.field1895 = 4;
        }
        class11.method69((byte) -113, arg1.method357(false) == 1);
        class85.field1537 = arg1.method357(false) == 1;
        class65.field1167 = arg1.method357(false) == 1;
        class236.field4032 = arg1.method357(false) == 1;
        class95.field1695 = arg1.method357(false) == 1;
        class115.field2026 = arg1.method357(false) == 1;
        class11.field165 = arg1.method357(false) == 1;
        class181.field3216 = arg1.method357(false) == 1;
        class17.field241 = arg1.method357(false);
        if (class17.field241 > 2) {
            class17.field241 = 2;
        }
        if (var2 < 2) {
            class193.field3531 = arg1.method357(false) == 1;
            arg1.method357(false);
        } else {
            class193.field3531 = arg1.method357(false) == 1;
        }
        class281.field4880 = arg1.method357(false) == 1;
        class74.field1373 = arg1.method357(false) == 1;
        class274.field4743 = arg1.method357(false);
        if (class274.field4743 > 2) {
            class274.field4743 = 2;
        }
        class115.field2023 = class274.field4743;
        if (arg0 != 0) {
            method621(true);
        }
        class171.field3050 = arg1.method357(false) == 1;
        class29.field422 = arg1.method357(false);
        if (class29.field422 > 127) {
            class29.field422 = 127;
        }
        class38.field694 = arg1.method357(false);
        class70.field1292 = arg1.method357(false);
        if (class70.field1292 > 127) {
            class70.field1292 = 127;
        }
        if (var2 >= 1) {
            class141.field2479 = arg1.method346(-16);
            class145.field2566 = arg1.method346(arg0 ^ 0xFFFFFFF0);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method357(false);
        }
        if (var2 >= 4) {
            int var4 = arg1.method357(false);
            if (class72.field1328 < 96) {
                var4 = 0;
            }
            class283.method1979(var4);
        }
        if (var2 >= 5) {
            class236.field4024 = arg1.method327(4);
        }
        if (var2 >= 6) {
            class237.field4037 = arg1.method357(false);
        }
        if (var2 >= 7) {
            class137.field2392 = arg1.method357(false) == 1;
        }
        if (var2 >= 8) {
            class154.field2746 = arg1.method357(false) == 1;
        }
        if (var2 >= 9) {
            class163.field2882 = arg1.method357(false);
        }
        if (var2 >= 10) {
            class30.field450 = arg1.method357(false) != 0;
        }
        if (var2 >= 11) {
            class31.field505 = arg1.method357(false) != 0;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II[[F[[FILsm;ILba;[[F[I[[I)V", line = 240)
    public static final void method620(int arg0, int arg1, float[][] arg2, float[][] arg3, int arg4, class118 arg5, int arg6, class158 arg7, float[][] arg8, int[] arg9, int[][] arg10) {
        if (arg4 != -30594) {
            return;
        }
        field1523++;
        int[] var11 = new int[arg9.length / 2];
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg9[var12 + var12 + 1];
            int var14 = arg9[var12 + var12];
            if (arg1 == 1) {
                int var16 = var14;
                var14 = var13;
                var13 = 128 - var16;
            } else if (arg1 == 2) {
                var14 = 128 - var14;
                var13 = 128 - var13;
            } else if (arg1 == 3) {
                int var15 = var14;
                var14 = 128 - var13;
                var13 = var15;
            }
            float var17;
            float var18;
            float var19;
            if (var14 == 0 && var13 == 0) {
                var17 = arg8[arg6][arg0];
                var18 = arg2[arg6][arg0];
                var19 = arg3[arg6][arg0];
            } else if (var14 == 128 && var13 == 0) {
                var19 = arg3[arg6 + 1][arg0];
                var18 = arg2[arg6 + 1][arg0];
                var17 = arg8[arg6 + 1][arg0];
            } else if (var14 == 128 && var13 == 128) {
                var19 = arg3[arg6 + 1][arg0 + 1];
                var17 = arg8[arg6 + 1][arg0 + 1];
                var18 = arg2[arg6 + 1][arg0 + 1];
            } else if (var14 == 0 && var13 == 128) {
                var18 = arg2[arg6][arg0 + 1];
                var19 = arg3[arg6][arg0 + 1];
                var17 = arg8[arg6][arg0 + 1];
            } else {
                float var20 = arg3[arg6][arg0];
                float var21 = arg2[arg6][arg0];
                float var22 = (float) var14 / 128.0F;
                float var23 = (arg3[arg6 + 1][arg0] - var20) * var22 + var20;
                float var24 = (float) var13 / 128.0F;
                float var25 = arg8[arg6][arg0];
                float var26 = (arg8[arg6 + 1][arg0] - var25) * var22 + var25;
                float var27 = (arg2[arg6 + 1][arg0] - var21) * var22 + var21;
                float var28 = arg8[arg6][arg0 + 1];
                float var29 = (arg8[arg6 + 1][arg0 + 1] - var28) * var22 + var28;
                var17 = (var29 - var26) * var24 + var26;
                float var30 = arg2[arg6][arg0 + 1];
                float var31 = arg3[arg6][arg0 + 1];
                float var32 = (arg2[arg6 + 1][arg0 + 1] - var30) * var22 + var30;
                float var33 = (arg3[arg6 + 1][arg0 + 1] - var31) * var22 + var31;
                var18 = (var32 - var27) * var24 + var27;
                var19 = (var33 - var23) * var24 + var23;
            }
            int var34 = (arg0 << 7) + var13;
            int var35 = class36.method253((byte) -128, arg0, var14, arg10, var13, arg6);
            int var36 = (arg6 << 7) + var14;
            var11[var12] = arg7.method1171(arg5, var36, var35, var34, var17, var18, var19);
        }
        arg7.method1175(var11);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V", line = 357)
    public static void method621(boolean arg0) {
        field1531 = null;
        field1530 = null;
        field1533 = null;
        field1534 = null;
        field1529 = null;
        if (!arg0) {
            field1533 = (class256) null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZI)Lti;", line = 371)
    public static final class182 method622(boolean arg0, int arg1) {
        field1525++;
        if (arg0) {
            return (class182) null;
        } else if (class303.field5241 && class163.field2891 <= arg1 && arg1 <= class14.field190) {
            return class316.field5448[arg1 - class163.field2891];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lra;ILff;Z)V", line = 392)
    public static final void method623(class41 arg0, int arg1, class4 arg2, boolean arg3) {
        class289 var4 = new class289();
        var4.field4989 = arg0.method357(false);
        field1526++;
        var4.field5005 = arg0.method327(4);
        var4.field4998 = new int[var4.field4989];
        var4.field5003 = new class82[var4.field4989];
        var4.field5002 = new int[var4.field4989];
        var4.field5000 = new class82[var4.field4989];
        var4.field4993 = new byte[var4.field4989][][];
        if (!arg3) {
            method623((class41) null, 10, (class4) null, true);
        }
        var4.field4994 = new int[var4.field4989];
        for (int var5 = 0; var5 < var4.field4989; var5++) {
            try {
                int var6 = arg0.method357(false);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = new String(arg0.method313((byte) 54).method1778((byte) -93));
                    int var8 = 0;
                    String var9 = new String(arg0.method313((byte) 54).method1778((byte) -59));
                    if (var6 == 1) {
                        var8 = arg0.method327(4);
                    }
                    var4.field5002[var5] = var6;
                    var4.field4998[var5] = var8;
                    var4.field5000[var5] = arg2.method28(9, var9, class248.method1674((byte) -63, var7));
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg0.method313((byte) 54).method1778((byte) 90));
                    String var11 = new String(arg0.method313((byte) 54).method1778((byte) -44));
                    int var12 = arg0.method357(!arg3);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg0.method313((byte) 54).method1778((byte) 107));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg0.method327(4);
                            var15[var16] = new byte[var17];
                            arg0.method353(var17, var15[var16], arg3, 0);
                        }
                    }
                    var4.field5002[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class248.method1674((byte) -49, var13[var19]);
                    }
                    var4.field5003[var5] = arg2.method33((byte) -126, var11, class248.method1674((byte) -128, var10), var18);
                    var4.field4993[var5] = var15;
                }
            } catch (ClassNotFoundException var25) {
                var4.field4994[var5] = -1;
            } catch (SecurityException var26) {
                var4.field4994[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field4994[var5] = -3;
            } catch (Exception var28) {
                var4.field4994[var5] = -4;
            } catch (Throwable var29) {
                var4.field4994[var5] = -5;
            }
        }
        class98.field1744.method1269(!arg3, var4);
    }
}
