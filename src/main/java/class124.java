import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class124 {

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "Z")
    public static boolean field2393 = false;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "[I")
    public static int[] field2392 = new int[2048];

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "Loj;")
    public static class17 field2394 = new class17(4);

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "Lhh;")
    public static class163 field2400 = class137.method1065(":clanreq:", 17);

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BI)Lqh;")
    public static final class69 method989(byte arg0, int arg1) {
        int var2 = arg1 >> 16;
        field2398++;
        if (arg0 <= 107) {
            field2395 = -35;
        }
        int var3 = arg1 & 0xFFFF;
        if (class109.field2060[var2] == null || class109.field2060[var2][var3] == null) {
            boolean var4 = class114.method906(0, var2);
            if (!var4) {
                return null;
            }
        }
        return class109.field2060[var2][var3];
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
    public static void method990(byte arg0) {
        field2392 = null;
        if (arg0 != 68) {
            method991(-42, 125, 65, 53, (class1) null, 105, -111);
        }
        field2394 = null;
        field2400 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIILcg;II)V")
    public static final void method991(int arg0, int arg1, int arg2, int arg3, class1 arg4, int arg5, int arg6) {
        field2401++;
        long var7 = 0L;
        if (arg1 == 0) {
            var7 = class243.method1681(arg6, arg2, arg3);
        } else if (arg1 == 1) {
            var7 = class255.method1731(arg6, arg2, arg3);
        } else if (arg1 == 2) {
            var7 = class19.method134(arg6, arg2, arg3);
        } else if (arg1 == 3) {
            var7 = class219.method1553(arg6, arg2, arg3);
        }
        boolean var9 = true;
        int var10 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = (int) var7 >> 14 & 0x1F;
        int var14 = (int) var7 >> 20 & 0x3;
        class35 var15 = class9.method64(false, var10);
        if (arg5 != 21626) {
            method993(-29, (byte) -127, (class81) null);
        }
        if (var15.method259((byte) 109)) {
            class231.method1611(arg6, arg2, arg3, var15, -28903);
        }
        if (var7 == 0L) {
            return;
        }
        if (arg1 == 0) {
            class73.method540(arg6, arg2, arg3);
            if (var15.field570 != 0) {
                arg4.method14(var14, var13, (byte) -29, arg3, arg2, var15.field601);
                return;
            }
            return;
        }
        if (arg1 == 1) {
            class203.method1451(arg6, arg2, arg3);
            return;
        }
        if (arg1 == 2) {
            class103.method819(arg6, arg2, arg3);
            if (var15.field570 != 0 && var15.field574 + arg2 < 104 && (var15.field574 + arg3) < 104 && (var15.field591 + arg2) < 104 && (arg3 + var15.field591) < 104) {
                arg4.method17(var15.field574, var15.field601, arg2, (byte) -108, var15.field591, var14, arg3);
                return;
            }
            return;
        }
        if (arg1 != 3) {
            return;
        }
        class55.method385(arg6, arg2, arg3);
        if (var15.field570 == 1) {
            arg4.method9((byte) 101, arg3, arg2);
            return;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILpc;Lpg;I)V")
    public static final void method992(int arg0, class166 arg1, class81 arg2, int arg3) {
        field2399++;
        class20 var4 = new class20();
        var4.field316 = arg2.method622(true);
        var4.field331 = arg2.method620((byte) -82);
        var4.field319 = new class198[var4.field316];
        var4.field313 = new class198[var4.field316];
        var4.field317 = new int[var4.field316];
        var4.field325 = new int[var4.field316];
        var4.field311 = new int[var4.field316];
        var4.field310 = new byte[var4.field316][][];
        for (int var5 = arg0; var5 < var4.field316; var5++) {
            try {
                int var6 = arg2.method622(true);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = new String(arg2.method605(true).method1202(4639));
                    String var8 = new String(arg2.method605(true).method1202(4639));
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg2.method620((byte) -82);
                    }
                    var4.field311[var5] = var6;
                    var4.field317[var5] = var9;
                    var4.field313[var5] = arg1.method1256(class58.method406(var7, 122), var8, -115);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg2.method605(true).method1202(4639));
                    String var11 = new String(arg2.method605(true).method1202(arg0 + 4639));
                    int var12 = arg2.method622(true);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg2.method605(true).method1202(4639));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg2.method620((byte) -82);
                            var15[var16] = new byte[var17];
                            arg2.method628(123, var17, var15[var16], 0);
                        }
                    }
                    var4.field311[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class58.method406(var13[var19], 115);
                    }
                    var4.field319[var5] = arg1.method1248(var18, class58.method406(var10, class46.method340(arg0, 118)), var11, 0);
                    var4.field310[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field325[var5] = -1;
            } catch (SecurityException var21) {
                var4.field325[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field325[var5] = -3;
            } catch (Exception var23) {
                var4.field325[var5] = -4;
            } catch (Throwable var24) {
                var4.field325[var5] = -5;
            }
        }
        class87.field1625.method1018((byte) 125, var4);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBLpg;)Lhh;")
    public static final class163 method993(int arg0, byte arg1, class81 arg2) {
        field2397++;
        try {
            class163 var3 = new class163();
            int var4 = -38 % ((arg1 - 65) / 44);
            var3.field2990 = arg2.method636(48);
            if (arg0 < var3.field2990) {
                var3.field2990 = arg0;
            }
            var3.field3020 = new byte[var3.field2990];
            arg2.field1541 += class174.field3171.method451(var3.field3020, var3.field2990, 0, -12660, arg2.field1562, arg2.field1541);
            return var3;
        } catch (Exception var5) {
            return class147.field2789;
        }
    }
}
