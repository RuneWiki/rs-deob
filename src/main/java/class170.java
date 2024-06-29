import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class170 extends class90 {

    @OriginalMember(owner = "client!ta", name = "F", descriptor = "[B")
    public byte[] field2445;

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "I")
    public static int field2447 = 2;

    @OriginalMember(owner = "client!ta", name = "I", descriptor = "I")
    public static int field2448 = 0;

    @OriginalMember(owner = "client!ta", name = "G", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!ta", name = "J", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!ta", name = "K", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!ta", name = "M", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!ta", name = "L", descriptor = "Lve;")
    public static class233 field2451;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(III)Ljg;")
    public static final class264 method1120(int arg0, int arg1, int arg2) {
        class131 var3 = class16.field233[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class264 var4 = var3.field1928;
            var3.field1928 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method1121(String[] arg0, byte arg1) {
        String[] var2 = new String[5];
        int var3 = 100 / ((arg1 - 32) / 44);
        for (int var4 = 0; var4 < 5; var4++) {
            var2[var4] = var4 + ": ";
            if (arg0 != null && arg0[var4] != null) {
                var2[var4] = var2[var4] + arg0[var4];
            }
        }
        field2446++;
        return var2;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIILtk;Ltk;IIJ)V")
    public static final void method1122(int arg0, int arg1, int arg2, int arg3, class219 arg4, class219 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class288 var10 = new class288();
        var10.field4555 = arg8;
        var10.field4556 = arg1 * 128 + 64;
        var10.field4559 = arg2 * 128 + 64;
        var10.field4552 = arg3;
        var10.field4557 = arg4;
        var10.field4553 = arg5;
        var10.field4562 = arg6;
        var10.field4561 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class16.field233[var11][arg1][arg2] == null) {
                class16.field233[var11][arg1][arg2] = new class131(var11, arg1, arg2);
            }
        }
        class16.field233[arg0][arg1][arg2].field1923 = var10;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILkl;ILca;)V")
    public static final void method1123(int arg0, class114 arg1, int arg2, class83 arg3) {
        field2452++;
        class145 var4 = new class145();
        var4.field2072 = arg1.method760(false);
        var4.field2071 = arg1.method759((byte) 102);
        var4.field2086 = new int[var4.field2072];
        var4.field2084 = new int[var4.field2072];
        var4.field2087 = new class239[var4.field2072];
        var4.field2075 = new class239[var4.field2072];
        var4.field2085 = new int[var4.field2072];
        var4.field2073 = new byte[var4.field2072][][];
        for (int var5 = 0; var5 < var4.field2072; var5++) {
            try {
                int var6 = arg1.method760(false);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg1.method753(-128);
                    String var18 = arg1.method753(-128);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg1.method759((byte) 107);
                    }
                    var4.field2086[var5] = var6;
                    var4.field2085[var5] = var19;
                    var4.field2087[var5] = arg3.method549((byte) 47, class24.method177(arg0 + 4474, var17), var18);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg1.method753(-128);
                    String var8 = arg1.method753(arg0 - 126);
                    int var9 = arg1.method760(false);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg1.method753(-128);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg1.method759((byte) 101);
                            var12[var13] = new byte[var14];
                            arg1.method758(var12[var13], var14, (byte) 124, 0);
                        }
                    }
                    Class[] var15 = new Class[var9];
                    var4.field2086[var5] = var6;
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class24.method177(4472, var10[var16]);
                    }
                    var4.field2075[var5] = arg3.method561(0, var8, class24.method177(4472, var7), var15);
                    var4.field2073[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field2084[var5] = -1;
            } catch (SecurityException var21) {
                var4.field2084[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field2084[var5] = -3;
            } catch (Exception var23) {
                var4.field2084[var5] = -4;
            } catch (Throwable var24) {
                var4.field2084[var5] = -5;
            }
        }
        class98.field1474.method652(80, var4);
        if (arg0 != -2) {
            field2447 = 38;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I[Llk;Lve;)V")
    public static final void method1124(int arg0, class244[] arg1, class233 arg2) {
        class275.field4405 = arg1;
        class53.field798 = arg2;
        class19.field270 = new boolean[class275.field4405.length];
        class14.field216.method647((byte) -70);
        int var3 = class53.field798.method1522(7233, "details");
        field2449++;
        int[] var4 = class53.field798.method1521(var3, (byte) -73);
        for (int var5 = arg0; var5 < var4.length; var5++) {
            class14.field216.method652(88, class180.method1168((byte) -88, new class114(class53.field798.method1538(var3, var4[var5], (byte) 114))));
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLkl;)Lkb;")
    public static final class29 method1125(byte arg0, class114 arg1) {
        if (arg0 != 54) {
            return null;
        }
        class29 var2 = new class29();
        var2.field410 = arg1.method756(arg0 - 29955);
        var2.field413 = class162.method1087(1, var2.field410);
        field2450++;
        return var2;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(III)Lsk;")
    public static final class109 method1126(int arg0, int arg1, int arg2) {
        class131 var3 = class16.field233[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class109 var4 = var3.field1930;
            var3.field1930 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "([B)V")
    public class170(byte[] arg0) {
        this.field2445 = arg0;
    }

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "(I)V")
    public static void method1127(int arg0) {
        int var1 = 109 / ((-arg0 - 77) / 35);
        field2451 = null;
    }
}
