import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class137 {

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "Lvd;")
    public static class222 field2648 = class212.method1357("Die Verbindung konnte", 10731);

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "Lvd;")
    public static class222 field2657 = class212.method1357("blinken2:", 10731);

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "Lvd;")
    public static class222 field2658 = class212.method1357("Bitte versuchen Sie)1", 10731);

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "Lvd;")
    public static class222 field2655 = class212.method1357("Weiter", 10731);

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "[[B")
    public static byte[][] field2660 = new byte[250][];

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "Lvd;")
    private static class222 field2656 = class212.method1357("Invalid loginserver requested)3", 10731);

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field2651 = 0;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field2649 = 0;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "Lvd;")
    public static class222 field2653 = field2656;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "[I")
    public static int[] field2650;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public static final void method865(int arg0) {
        if (class31.field656 != null) {
            class31.field656.method784(5000);
            class31.field656 = null;
        }
        field2661++;
        class157.method1000(100);
        if (arg0 <= 53) {
            return;
        }
        class151.method975();
        for (int var1 = 0; var1 < 4; var1++) {
            class108.field1993[var1].method69((byte) 96);
        }
        class126.method798(0);
        System.gc();
        class84.method548(19725, 2);
        class176.field3293 = false;
        class192.field3537 = -1;
        class81.method530((byte) 68);
        class55.method410(10, 0);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)V")
    public static final void method866(int arg0, int arg1, int arg2) {
        if (class25.field567 != arg1 && arg0 != -1) {
            class109.method713((byte) 80, class25.field567, false, arg0, 0, class87.field1655);
            class176.field3293 = true;
        }
        field2654++;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIILde;)V")
    public static final void method867(int arg0, int arg1, int arg2, class38 arg3) {
        field2659++;
        if ((arg0 & 0x40) != 0) {
            arg3.field1374 = class21.field505.method674(-100);
            if (arg3.field1374.method1442(0, arg1 - 94) == 126) {
                arg3.field1374 = arg3.field1374.method1443(arg1 ^ 0x5282, 1);
                class160.method1007(false, arg3.field1374, arg3.field853, 2);
            } else if (class17.field432 == arg3) {
                class160.method1007(false, arg3.field1374, arg3.field853, 2);
            }
            arg3.field1376 = 150;
            arg3.field1372 = 0;
            arg3.field1321 = 0;
        }
        if ((arg0 & 0x200) != 0) {
            int var4 = class21.field505.method680(-20040);
            int var5 = class21.field505.method662((byte) -106);
            arg3.method481(false, class175.field3280, var4, var5);
        }
        if ((arg0 & 0x80) != 0) {
            arg3.field1330 = class21.field505.method679((byte) -68);
            if (arg3.field1330 == 65535) {
                arg3.field1330 = -1;
            }
        }
        if ((arg0 & 0x8) != 0) {
            arg3.field1336 = class21.field505.method686(-113);
            arg3.field1356 = class21.field505.method675(2);
        }
        if ((arg0 & 0x1) != 0) {
            int var6 = class21.field505.method691(-128);
            int var7 = class21.field505.method705((byte) 107);
            int var8 = class21.field505.method662((byte) -88);
            int var9 = class21.field505.field2053;
            if (arg3.field853 != null && arg3.field850 != null) {
                long var10 = arg3.field853.method1428(15109);
                boolean var12 = false;
                if (var7 <= 1) {
                    for (int var13 = 0; var13 < class113.field2131; var13++) {
                        if (class64.field1173[var13] == var10) {
                            var12 = true;
                            break;
                        }
                    }
                }
                if (!var12 && class91.field1714 == 0) {
                    class187.field3468.field2053 = 0;
                    class21.field505.method708(class187.field3468.field2006, var8, (byte) -61, 0);
                    int var14 = -1;
                    boolean var15 = (var6 & 0x8000) != 0;
                    class187.field3468.field2053 = 0;
                    class222 var17;
                    if (var15) {
                        var6 &= 0x7FFF;
                        class220 var16 = class36.method297(class187.field3468, true);
                        var14 = var16.field4064;
                        var17 = var16.field4072.method1114(class187.field3468, (byte) -125);
                    } else {
                        var17 = class142.method906(class42.method318(class187.field3468, (byte) 0).method1424(-6264));
                    }
                    arg3.field1374 = var17.method1407((byte) -122);
                    arg3.field1321 = var6 >> 8;
                    arg3.field1376 = 150;
                    arg3.field1372 = var6 & 0xFF;
                    if (var7 == 2) {
                        class110.method715(null, var15 ? 17 : 1, var14, var17, arg1 ^ 0x7F, class234.method1531(new class222[] { class58.field1085, arg3.field853 }, -10949));
                    } else if (var7 == 1) {
                        class110.method715(null, var15 ? 17 : 1, var14, var17, 89, class234.method1531(new class222[] { class179.field3333, arg3.field853 }, -10949));
                    } else {
                        class110.method715(null, var15 ? 17 : 2, var14, var17, arg1 + 38, arg3.field853);
                    }
                }
            }
            class21.field505.field2053 = var8 + var9;
        }
        if ((arg0 & 0x400) != 0) {
            arg3.field1309 = class21.field505.method679((byte) -77);
            int var18 = class21.field505.method681(false);
            arg3.field1340 = var18 >> 16;
            arg3.field1373 = 0;
            if (arg3.field1309 == 65535) {
                arg3.field1309 = -1;
            }
            arg3.field1327 = (var18 & 0xFFFF) + class175.field3280;
            arg3.field1362 = 0;
            if (arg3.field1327 > class175.field3280) {
                arg3.field1362 = -1;
            }
        }
        if ((arg0 & 0x20) != 0) {
            int var19 = class21.field505.method680(-20040);
            int var20 = class21.field505.method688((byte) -46);
            arg3.method481(false, class175.field3280, var19, var20);
            arg3.field1352 = class175.field3280 + 300;
            arg3.field1366 = class21.field505.method680(-20040);
        }
        if ((arg0 & 0x100) != 0) {
            arg3.field1332 = class21.field505.method662((byte) -99);
            arg3.field1320 = class21.field505.method705((byte) 96);
            arg3.field1329 = class21.field505.method705((byte) 117);
            arg3.field1337 = class21.field505.method688((byte) -28);
            arg3.field1367 = class21.field505.method675(arg1) + class175.field3280;
            arg3.field1343 = class21.field505.method679((byte) 121) + class175.field3280;
            arg3.field1357 = class21.field505.method688((byte) -96);
            arg3.field1363 = 0;
            arg3.field1326 = 1;
        }
        if ((arg0 & 0x10) != 0) {
            int var21 = class21.field505.method691(-128);
            if (var21 == 65535) {
                var21 = -1;
            }
            int var22 = class21.field505.method705((byte) 86);
            class234.method1532((byte) 111, arg3, var22, var21);
        }
        if ((arg0 & arg1) == 0) {
            return;
        }
        int var23 = class21.field505.method688((byte) -106);
        byte[] var24 = new byte[var23];
        class109 var25 = new class109(var24);
        class21.field505.method708(var24, var23, (byte) -111, 0);
        class111.field2076[arg2] = var25;
        arg3.method309(var25, (byte) 127);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
    public static void method868(byte arg0) {
        field2657 = null;
        field2656 = null;
        field2655 = null;
        field2658 = null;
        field2648 = null;
        field2653 = null;
        if (arg0 >= -67) {
            method866(-33, 127, -66);
        }
        field2660 = null;
        field2650 = null;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(III)I")
    public static final int method869(int arg0, int arg1, int arg2) {
        field2652++;
        int var3 = arg2 >>> 31;
        return arg1 >= -38 ? -33 : (arg2 + var3) / arg0 - var3;
    }
}
