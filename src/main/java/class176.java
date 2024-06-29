import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class176 extends class240 {

    @OriginalMember(owner = "client!wk", name = "x", descriptor = "Ljava/lang/String;")
    public String field2773;

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "J")
    public static long field2770 = 0L;

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "Z")
    public static boolean field2768 = true;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2765 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "[I")
    public static int[] field2772 = new int[32];

    @OriginalMember(owner = "client!wk", name = "y", descriptor = "Ljava/lang/String;")
    public static String field2774 = "K";

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "Lja;")
    public static class64 field2764;

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "Lja;")
    public static class64 field2769;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V", line = 12)
    public static final void method1312(byte arg0) {
        field2771++;
        if (class198.field3132 == 0) {
            return;
        }
        try {
            int var1 = -64 % ((arg0 - 27) / 37);
            if (++class126.field2013 > 1500) {
                if (class127.field2032 != null) {
                    class127.field2032.method131(-11918);
                    class127.field2032 = null;
                }
                if (class147.field2373 >= 1) {
                    class307.field4839 = -5;
                    class198.field3132 = 0;
                    return;
                }
                class198.field3132 = 1;
                class126.field2013 = 0;
                if (class56.field891 == class250.field3860) {
                    class56.field891 = class235.field3704;
                } else {
                    class56.field891 = class250.field3860;
                }
                class147.field2373++;
            }
            if (class198.field3132 == 1) {
                class178.field2785 = class83.field1235.method2224(class56.field891, class310.field4878, -91);
                class198.field3132 = 2;
            }
            if (class198.field3132 == 2) {
                if (class178.field2785.field387 == 2) {
                    throw new IOException();
                }
                if (class178.field2785.field387 != 1) {
                    return;
                }
                class127.field2032 = new class16((Socket) class178.field2785.field391, class83.field1235);
                class178.field2785 = null;
                class127.field2032.method136(class269.field4191.field1667, class269.field4191.field1661, (byte) -4, 0);
                if (class213.field3400 != null) {
                    class213.field3400.method105(1);
                }
                if (class243.field3763 != null) {
                    class243.field3763.method105(1);
                }
                int var2 = class127.field2032.method138(-5380);
                if (class213.field3400 != null) {
                    class213.field3400.method105(1);
                }
                if (class243.field3763 != null) {
                    class243.field3763.method105(1);
                }
                if (var2 != 101) {
                    class307.field4839 = var2;
                    class198.field3132 = 0;
                    class127.field2032.method131(-11918);
                    class127.field2032 = null;
                    return;
                }
                class198.field3132 = 3;
            }
            if (class198.field3132 == 3) {
                if (class127.field2032.method137((byte) 21) < 2) {
                    return;
                }
                int var3 = class127.field2032.method138(-5380) << 8 | class127.field2032.method138(-5380);
                class43.method352(var3, (byte) 96);
                if (class193.field3072 != -1) {
                    class198.field3132 = 0;
                    class127.field2032.method131(-11918);
                    class127.field2032 = null;
                    class272.method1965(false);
                    return;
                }
                class198.field3132 = 0;
                class307.field4839 = 6;
                class127.field2032.method131(-11918);
                class127.field2032 = null;
                return;
            }
        } catch (IOException var5) {
            if (class127.field2032 != null) {
                class127.field2032.method131(-11918);
                class127.field2032 = null;
            }
            if (class147.field2373 < 1) {
                class147.field2373++;
                class198.field3132 = 1;
                class126.field2013 = 0;
                if (class56.field891 == class250.field3860) {
                    class56.field891 = class235.field3704;
                } else {
                    class56.field891 = class250.field3860;
                }
            } else {
                class198.field3132 = 0;
                class307.field4839 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)V", line = 157)
    public static void method1313(byte arg0) {
        field2772 = null;
        field2774 = null;
        field2765 = null;
        field2764 = null;
        if (arg0 != -54) {
            method1312((byte) -27);
        }
        field2769 = null;
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(B)V", line = 191)
    public static final void method1314(byte arg0) {
        if (arg0 > -90) {
            field2765 = (String) null;
        }
        field2763++;
        while (true) {
            class10 var1;
            class89 var3;
            do {
                var1 = (class10) class198.field3138.method1496(-29960);
                if (var1 == null) {
                    return;
                }
                if (var1.field156 >= 0) {
                    int var2 = var1.field156 - 1;
                    var3 = class138.field2196[var2];
                } else {
                    int var4 = -var1.field156 - 1;
                    if (class60.field943 == var4) {
                        var3 = class19.field356;
                    } else {
                        var3 = class82.field1228[var4];
                    }
                }
            } while (var3 == null);
            class6 var5 = class28.method190(91, var1.field167);
            if (class41.field734 >= 3) {
            }
            int var6;
            int var7;
            if (var1.field165 == 1 || var1.field165 == 3) {
                var6 = var5.field63;
                var7 = var5.field90;
            } else {
                var6 = var5.field90;
                var7 = var5.field63;
            }
            int var8 = (var7 + 1 >> 1) + var1.field171;
            int var9 = (var7 >> 1) + var1.field171;
            int var10 = (var6 >> 1) + var1.field159;
            int var11 = (var6 + 1 >> 1) + var1.field159;
            int[][] var12 = class29.field475[class41.field734];
            int var13 = class63.field1000[var1.field164];
            int var14 = var12[var8][var10] + var12[var9][var10] + var12[var8][var11] + var12[var9][var11] >> 2;
            class320 var15 = null;
            if (var13 == 0) {
                class189 var16 = class277.method1982(class41.field734, var1.field171, var1.field159);
                if (var16 != null) {
                    var15 = var16.field2996;
                }
            } else if (var13 == 1) {
                class114 var19 = class89.method645(class41.field734, var1.field171, var1.field159);
                if (var19 != null) {
                    var15 = var19.field1863;
                }
            } else if (var13 == 2) {
                class45 var18 = class207.method1509(class41.field734, var1.field171, var1.field159);
                if (var18 != null) {
                    var15 = var18.field782;
                }
            } else if (var13 == 3) {
                class87 var17 = class99.method717(class41.field734, var1.field171, var1.field159);
                if (var17 != null) {
                    var15 = var17.field1325;
                }
            }
            if (var15 != null) {
                class152.method1166(30194, var1.field172 + 1, 0, class41.field734, var13, 0, -1, var1.field154 + 1, var1.field171, var1.field159);
                int var20 = var1.field157;
                var3.field1358 = var1.field154 + class205.field3252;
                var3.field1367 = class205.field3252 + var1.field172;
                var3.field1387 = var1.field171 * 128 + var7 * 64;
                var3.field1378 = var14;
                var3.field1396 = var1.field159 * 128 + var6 * 64;
                var3.field1381 = var15;
                int var21 = var1.field152;
                if (var21 < var20) {
                    int var22 = var20;
                    var20 = var21;
                    var21 = var22;
                }
                int var23 = var1.field168;
                var3.field1372 = var1.field171 + var21;
                int var24 = var1.field166;
                var3.field1428 = var1.field171 + var20;
                if (var24 < var23) {
                    int var25 = var23;
                    var23 = var24;
                    var24 = var25;
                }
                var3.field1448 = var1.field159 + var23;
                var3.field1452 = var1.field159 + var24;
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZLvd;Z)V", line = 360)
    public static final void method1315(boolean arg0, class135 arg1, boolean arg2) {
        if (class265.field4126 || arg0) {
            int var3 = class73.field1127;
            int var4 = var3 * 956 / 503;
            class196.field3118.method56((class180.field2880 - var4) / 2, 0, var4, var3);
            class9.field141.method1526(class180.field2880 / 2 - class9.field141.field4264 / 2, 18);
        }
        field2766++;
        if (!arg2) {
            method1314((byte) 70);
        }
        arg1.method1023(class163.field2552, class180.field2880 / 2, class73.field1127 / 2 - 26, 16777215, -1);
        int var5 = class73.field1127 / 2 - 18;
        if (class265.field4126) {
            class262.method1854(class180.field2880 / 2 - 152, var5, 304, 34, 9179409);
            class262.method1854(class180.field2880 / 2 - 151, var5 + 1, 302, 32, 0);
            class262.method1855(class180.field2880 / 2 - 150, var5 + 2, class282.field4358 * 3, 30, 9179409);
            class262.method1855(class180.field2880 / 2 + (class282.field4358 * 3) - 150, var5 + 2, 300 - (class282.field4358 * 3), 30, 0);
        } else {
            class182.method1364(class180.field2880 / 2 - 152, var5, 304, 34, 9179409);
            class182.method1364(class180.field2880 / 2 - 151, var5 - -1, 302, 32, 0);
            class182.method1360(class180.field2880 / 2 - 150, var5 + 2, class282.field4358 * 3, 30, 9179409);
            class182.method1360(class180.field2880 / 2 + class282.field4358 * 3 - 150, var5 - -2, 300 - class282.field4358 * 3, 30, 0);
        }
        arg1.method1023(class319.field4963, class180.field2880 / 2, class73.field1127 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V", line = 403)
    public class176() {
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 405)
    public class176(String arg0, int arg1) {
        this.field2773 = arg0;
    }
}
