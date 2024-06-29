import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public abstract class class24 extends class101 {

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
    public static int field378 = -2;

    @OriginalMember(owner = "client!qo", name = "t", descriptor = "Z")
    public static boolean field381 = false;

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "Lmga;")
    public static class739 field379 = new class739(66, 3);

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!qo", name = "o", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!qo", name = "p", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!qo", name = "s", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!qo", name = "u", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!qo", name = "v", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZIILjava/lang/String;I)V", line = 14)
    public static final void method192(boolean arg0, int arg1, int arg2, String arg3, int arg4) {
        field376++;
        class668 var5 = class452.method2690(-4353, arg2, arg1);
        if (var5 == null) {
            return;
        }
        if (var5.field9250 != null) {
            class12 var6 = new class12();
            var6.field184 = arg4;
            var6.field190 = var5;
            var6.field177 = arg3;
            var6.field186 = var5.field9250;
            class173.method1235(var6);
        }
        if (class458.field6355 != 10 || !client.method2022(var5).method842(19061, arg4 - 1)) {
            return;
        }
        if (!arg0) {
            field381 = true;
        }
        if (arg4 == 1) {
            class500.field6894++;
            class267 var7 = class545.method3099((byte) 53, class269.field3966, class322.field4707);
            class292.method1851(!arg0, var5.field9283, arg2, var7, arg1);
            class617.method3392(var7, true);
        }
        if (arg4 == 2) {
            class225.field3078++;
            class267 var8 = class545.method3099((byte) 125, class269.field3966, class281.field4143);
            class292.method1851(!arg0, var5.field9283, arg2, var8, arg1);
            class617.method3392(var8, true);
        }
        if (arg4 == 3) {
            class603.field8198++;
            class267 var9 = class545.method3099((byte) 79, class269.field3966, class624.field8388);
            class292.method1851(false, var5.field9283, arg2, var9, arg1);
            class617.method3392(var9, true);
        }
        if (arg4 == 4) {
            class374.field5409++;
            class267 var10 = class545.method3099((byte) 104, class269.field3966, class20.field289);
            class292.method1851(false, var5.field9283, arg2, var10, arg1);
            class617.method3392(var10, arg0);
        }
        if (arg4 == 5) {
            class787.field10834++;
            class267 var11 = class545.method3099((byte) 44, class269.field3966, class782.field10769);
            class292.method1851(!arg0, var5.field9283, arg2, var11, arg1);
            class617.method3392(var11, true);
        }
        if (arg4 == 6) {
            class600.field8159++;
            class267 var12 = class545.method3099((byte) 37, class269.field3966, class487.field6745);
            class292.method1851(!arg0, var5.field9283, arg2, var12, arg1);
            class617.method3392(var12, true);
        }
        if (arg4 == 7) {
            class283.field4176++;
            class267 var13 = class545.method3099((byte) 62, class269.field3966, class542.field7369);
            class292.method1851(false, var5.field9283, arg2, var13, arg1);
            class617.method3392(var13, true);
        }
        if (arg4 == 8) {
            class338.field4900++;
            class267 var14 = class545.method3099((byte) 38, class269.field3966, class584.field7795);
            class292.method1851(!arg0, var5.field9283, arg2, var14, arg1);
            class617.method3392(var14, true);
        }
        if (arg4 == 9) {
            class705.field9876++;
            class267 var15 = class545.method3099((byte) 87, class269.field3966, class569.field7580);
            class292.method1851(false, var5.field9283, arg2, var15, arg1);
            class617.method3392(var15, true);
        }
        if (arg4 == 10) {
            class620.field8361++;
            class267 var16 = class545.method3099((byte) 95, class269.field3966, class152.field2099);
            class292.method1851(false, var5.field9283, arg2, var16, arg1);
            class617.method3392(var16, true);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)V", line = 150)
    public static void method193(byte arg0) {
        int var1 = -60 / ((79 - arg0) / 45);
        field379 = null;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lqn;Ljp;BI)V", line = 159)
    public static final void method194(class70 arg0, class376 arg1, byte arg2, int arg3) {
        field377++;
        class143 var4 = new class143();
        var4.field2063 = arg1.method2398(-1372747256);
        var4.field2062 = arg1.method2384(7);
        var4.field2060 = new int[var4.field2063];
        var4.field2058 = new class615[var4.field2063];
        var4.field2057 = new int[var4.field2063];
        var4.field2064 = new byte[var4.field2063][][];
        var4.field2061 = new class615[var4.field2063];
        var4.field2059 = new int[var4.field2063];
        for (int var5 = 0; var5 < var4.field2063; var5++) {
            try {
                int var6 = arg1.method2398(-1372747256);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg1.method2379((byte) 85);
                    String var18 = arg1.method2379((byte) 85);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg1.method2384(125);
                    }
                    var4.field2059[var5] = var6;
                    var4.field2060[var5] = var19;
                    var4.field2058[var5] = arg0.method611(3551, class6.method40(var17, 23244), var18);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg1.method2379((byte) 85);
                    String var8 = arg1.method2379((byte) 85);
                    int var9 = arg1.method2398(-1372747256);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg1.method2379((byte) 85);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg1.method2384(31);
                            var12[var13] = new byte[var14];
                            arg1.method2389(0, 689125352, var14, var12[var13]);
                        }
                    }
                    var4.field2059[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class6.method40(var10[var16], 23244);
                    }
                    var4.field2061[var5] = arg0.method625(var8, (byte) -126, var15, class6.method40(var7, 23244));
                    var4.field2064[var5] = var12;
                }
            } catch (ClassNotFoundException var21) {
                var4.field2057[var5] = -1;
            } catch (SecurityException var22) {
                var4.field2057[var5] = -2;
            } catch (NullPointerException var23) {
                var4.field2057[var5] = -3;
            } catch (Exception var24) {
                var4.field2057[var5] = -4;
            } catch (Throwable var25) {
                var4.field2057[var5] = -5;
            }
        }
        int var20 = -57 % ((46 - arg2) / 51);
        class359.field5249.method2545(-126, var4);
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "(B)Z", line = 273)
    public static final boolean method195(byte arg0) {
        field375++;
        int var1 = -91 / ((arg0 - 72) / 47);
        try {
            return class321.method2036(2);
        } catch (IOException var5) {
            class299.method1894((byte) -54);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + (class434.field6143 == null ? -1 : class434.field6143.method3232((byte) -120)) + "," + (class635.field8859 == null ? -1 : class635.field8859.method3232((byte) -121)) + "," + (class598.field8147 == null ? -1 : class598.field8147.method3232((byte) -124)) + " - " + class206.field2700 + "," + (class551.field7456.field1890[0] + class121.field1765) + "," + (class551.field7456.field1884[0] + class230.field3147) + " - ";
            for (int var4 = 0; var4 < class206.field2700 && var4 < 50; var4++) {
                var3 = var3 + class89.field1233.field5518[var4] + ",";
            }
            class664.method3681((byte) -118, var3, var6);
            class631.method3541(93, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lke;I)V")
    public abstract void method190(class625 arg0, int arg1);

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILjp;)V")
    public abstract void method191(int arg0, class376 arg1);
}
