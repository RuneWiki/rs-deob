import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class379 extends InputStream {

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "[I")
    public static int[] field5156 = new int[200];

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "Lcq;")
    public static class72 field5158 = new class72("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field5161 = 0;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field5163;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nc", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field5164;

    // $FF: synthetic method
    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2359(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V", line = 6)
    public static final void method2353(int arg0) {
        field5157++;
        try {
            if (arg0 != -6804) {
                method2355((byte) -101, (class242) null);
            }
            if (class139.field1590 == 1) {
                int var1 = class284.field3716.method1422(arg0 ^ 0xC0A4C644);
                if (var1 > 0 && class284.field3716.method1416((byte) 108)) {
                    int var2 = var1 - class272.field3509;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class284.field3716.method1417(var2, (byte) -72);
                } else {
                    class284.field3716.method1415(0);
                    class284.field3716.method1406(false);
                    class174.field2013 = null;
                    if (class369.field5026 == null) {
                        class139.field1590 = 0;
                    } else {
                        class139.field1590 = 2;
                    }
                    class383.field5250 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class284.field3716.method1415(arg0 ^ 0xFFFFE56C);
            class369.field5026 = null;
            class174.field2013 = null;
            class139.field1590 = 0;
            class383.field5250 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V", line = 54)
    public static void method2354(byte arg0) {
        field5158 = null;
        field5156 = null;
        if (arg0 >= -117) {
            field5156 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BLbg;)Lqm;", line = 67)
    public static final class246 method2355(byte arg0, class242 arg1) {
        field5163++;
        int var2 = 114 / ((arg0 + 77) / 48);
        class246 var3 = new class246();
        var3.field3255 = arg1.method1587((byte) -102);
        var3.field3253 = class31.method207(var3.field3255, 1);
        return var3;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V", line = 84)
    public static final void method2356(int arg0) {
        class365 var1 = class131.field1494;
        synchronized (class131.field1494) {
            class131.field1494.method2290(13831);
            if (arg0 != -1) {
                field5156 = null;
            }
        }
        field5155++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lpi;I)V", line = 100)
    public static final void method2357(class298 arg0, int arg1) {
        field5159++;
        if (class57.field660 >= 400) {
            return;
        }
        class307 var2 = arg0.field3971;
        if (var2.field4113 != null) {
            var2 = var2.method1946((byte) 125);
            if (var2 == null) {
                return;
            }
        }
        if (!var2.field4129) {
            return;
        }
        String var3 = var2.field4121;
        if (var2.field4111 != 0) {
            String var4 = class31.field356 == 1 ? class176.field2055.method434(class373.field5057, -8192) : class176.field2054.method434(class373.field5057, -8192);
            var3 = var3 + class341.method2183(class143.field1684.field1463, (byte) -126, var2.field4111) + " (" + var4 + var2.field4111 + ")";
        }
        if (class104.field1224) {
            class354 var5 = class122.field1384 == -1 ? null : class450.method2783(class122.field1384, (byte) -49);
            if ((class105.field1248 & 0x2) != 0 && (var5 == null || var2.method1955((byte) 112, var5.field4814, class122.field1384) != var5.field4814)) {
                class373.field5054++;
                class300.method1908(class272.field3513, class381.field5204 + " -> <col=ffff00>" + var3, 0, 672, (long) arg0.field2445, class335.field4569, 0, 4);
            }
        } else {
            String[] var6 = var2.field4177;
            if (class43.field510) {
                var6 = class6.method24(var6, 126);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class31.field356 != 0 || !var6[var7].equalsIgnoreCase(class87.field1014.method434(class373.field5057, -8192)))) {
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 19;
                        }
                        int var9 = class339.field4625;
                        if (var7 == 1) {
                            var8 = 23;
                        }
                        if (var7 == 2) {
                            var8 = 22;
                        }
                        if (var7 == 3) {
                            var8 = 49;
                        }
                        if (var7 == 4) {
                            var8 = 5;
                        }
                        if (var2.field4166 == var7) {
                            var9 = var2.field4168;
                        }
                        if (var2.field4136 == var7) {
                            var9 = var2.field4126;
                        }
                        class3.field25++;
                        class300.method1908(var9, "<col=ffff00>" + var3, 0, 672, (long) arg0.field2445, var6[var7], 0, var8);
                    }
                }
            }
            if (class31.field356 == 0 && var6 != null) {
                for (int var10 = 4; var10 >= 0; var10--) {
                    if (var6[var10] != null && var6[var10].equalsIgnoreCase(class87.field1014.method434(class373.field5057, -8192))) {
                        short var11 = 0;
                        if (var2.field4111 > class143.field1684.field1463) {
                            var11 = 2000;
                        }
                        short var12 = 0;
                        if (var10 == 0) {
                            var12 = 19;
                        }
                        if (var10 == 1) {
                            var12 = 23;
                        }
                        if (var10 == 2) {
                            var12 = 22;
                        }
                        if (var10 == 3) {
                            var12 = 49;
                        }
                        if (var10 == 4) {
                            var12 = 5;
                        }
                        if (var12 != 0) {
                            var12 += var11;
                        }
                        class43.field506++;
                        class300.method1908(var2.field4161, "<col=ffff00>" + var3, 0, 672, (long) arg0.field2445, var6[var10], 0, var12);
                    }
                }
            }
            class133.field1523++;
            class300.method1908(class282.field3687, "<col=ffff00>" + var3, 0, 672, (long) arg0.field2445, class265.field3410.method434(class373.field5057, -8192), 0, 1001);
        }
        if (arg1 < 67) {
            field5161 = 123;
        }
    }

    @OriginalMember(owner = "client!nc", name = "read", descriptor = "()I", line = 255)
    public final int read() {
        field5160++;
        class219.method1330(30000L, true);
        return -1;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)V", line = 265)
    public static final void method2358(byte arg0) {
        if (arg0 != -65) {
            method2354((byte) -59);
        }
        while (true) {
            class362 var1;
            class204 var3;
            do {
                do {
                    var1 = (class362) class244.field3241.method1688(arg0 + 168);
                    if (var1 == null) {
                        field5162++;
                        return;
                    }
                } while (class347.field4722 == null);
                if (var1.field4897 < 0) {
                    int var2 = -var1.field4897 - 1;
                    if (class429.field5865 == var2) {
                        var3 = class143.field1684;
                    } else {
                        var3 = class212.field2584[var2];
                    }
                } else {
                    int var4 = var1.field4897 - 1;
                    var3 = class220.field2726[var4];
                }
            } while (var3 == null);
            class446 var5 = class380.method2361(var1.field4900, -29012);
            int var6;
            int var7;
            if (var1.field4908 == 1 || var1.field4908 == 3) {
                var6 = var5.field6170;
                var7 = var5.field6244;
            } else {
                var6 = var5.field6244;
                var7 = var5.field6170;
            }
            int var8 = (var6 >> 1) + var1.field4904;
            int var9 = (var6 + 1 >> 1) + var1.field4904;
            int var10 = (var7 >> 1) + var1.field4899;
            int var11 = (var7 + 1 >> 1) + var1.field4899;
            class279 var12 = class304.field4096[var3.field1528];
            int var13 = var12.method1050(var8, var10) - (-var12.method1050(var9, var10) - var12.method1050(var8, var11) - var12.method1050(var9, var11)) >> 2;
            class171 var14 = null;
            int var15 = class30.field330[var1.field4910];
            if (var15 == 0) {
                var14 = (class171) class440.method2708(var3.field1528, var1.field4904, var1.field4899);
            } else if (var15 == 1) {
                var14 = (class171) class65.method373(var3.field1528, var1.field4904, var1.field4899);
            } else if (var15 == 2) {
                var14 = (class171) class246.method1610(var3.field1528, var1.field4904, var1.field4899, field5164 == null ? (field5164 = method2359("ol")) : field5164);
            } else if (var15 == 3) {
                var14 = (class171) class451.method2792(var3.field1528, var1.field4904, var1.field4899);
            }
            if (var14 != null) {
                class332.method2133(-1, var1.field4915 + 1, var3.field1528, 0, var15, 31496, 0, var1.field4899, var1.field4912, var1.field4904);
                var3.field2492 = class106.field1273 + var1.field4912;
                var3.field2488 = class106.field1273 + var1.field4915;
                var3.field2473 = var1.field4904 * 128 + var6 * 64;
                var3.field2479 = var13;
                var3.field2487 = var14;
                var3.field2490 = var1.field4899 * 128 + var7 * 64;
                int var16 = var1.field4913;
                int var17 = var1.field4898;
                int var18 = var1.field4911;
                if (var16 > var17) {
                    int var19 = var16;
                    var16 = var17;
                    var17 = var19;
                }
                int var20 = var1.field4909;
                if (var18 > var20) {
                    int var21 = var18;
                    var18 = var20;
                    var20 = var21;
                }
                var3.field2481 = var1.field4904 + var17;
                var3.field2485 = var1.field4904 + var16;
                var3.field2489 = var1.field4899 + var18;
                var3.field2484 = var1.field4899 + var20;
            }
        }
    }
}
