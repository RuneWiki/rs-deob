import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public abstract class class184 {

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "Lvd;")
    public static class222 field3413 = class212.method1357("Fehler bei der Verbindung zum Server)3", 10731);

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "Lvd;")
    public static class222 field3414 = class212.method1357("Fps:", 10731);

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "Lcc;")
    public static class25 field3410;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIB)I")
    public abstract int method459(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)Lj;")
    public static final class97 method1154(int arg0, int arg1) {
        class97 var2 = (class97) class18.field434.method601((long) arg0, 127);
        field3415++;
        if (var2 != null) {
            return var2;
        }
        class97 var3 = class216.method1371((byte) 83, arg0, class78.field1496, false, class222.field4131);
        if (var3 != null) {
            class18.field434.method593((long) arg0, var3, (byte) -12);
        }
        return arg1 == 26245 ? var3 : null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public abstract void method460(int arg0);

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
    public static void method1155(byte arg0) {
        field3414 = null;
        field3413 = null;
        field3410 = null;
        int var1 = -29 / ((arg0 + 10) / 44);
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)Z")
    public static final boolean method1156(int arg0) {
        field3416++;
        if (arg0 != 0) {
            method1158(false, null, -63);
        }
        try {
            return class206.method1331((byte) -118);
        } catch (IOException var4) {
            class167.method1079((byte) -98);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class202.field3703 + "," + class13.field266 + "," + class173.field3247 + " - " + class70.field1306 + "," + (class17.field432.field1333[0] + class110.field2064) + "," + (class17.field432.field1358[0] + class151.field2931) + " - ";
            for (int var3 = 0; class70.field1306 > var3 && var3 < 50; var3++) {
                var2 = var2 + class21.field505.field2006[var3] + ",";
            }
            class68.method464(var5, 128, var2);
            class137.method865(93);
            return true;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIBII)I")
    public static final int method1157(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != -57) {
            field3414 = null;
        }
        field3418++;
        int var5 = 65536 - class199.field3624[arg0 * 1024 / arg3] >> 1;
        return ((65536 - var5) * arg1 >> 16) + (arg4 * var5 >> 16);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZLab;I)Z")
    public static final boolean method1158(boolean arg0, class3 arg1, int arg2) {
        field3417++;
        if (!arg0) {
            return false;
        }
        byte[] var3 = arg1.method28((byte) -103, arg2);
        if (var3 == null) {
            return false;
        } else {
            class80.method525(var3, (byte) -126);
            return true;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLr;Lr;)V")
    public static final void method1159(byte arg0, class178 arg1, class178 arg2) {
        field3412++;
        if (class39.field862) {
            class43.method326(true, arg1, arg2);
            return;
        }
        if (class34.field749 == 0 || class34.field749 == 5) {
            byte var3 = 20;
            int var4 = 253 - var3;
            arg2.method889(class56.field1053, 382, 245 - var3, 16777215, -1);
            class53.method401(230, var4, 304, 34, 9179409);
            class53.method401(231, var4 + 1, 302, 32, 0);
            class53.method399(232, var4 + 2, class159.field3037 * 3, 30, 9179409);
            class53.method399(class159.field3037 * 3 + 232, var4 + 2, 300 - class159.field3037 * 3, 30, 0);
            arg2.method889(class97.field1804, 382, 276 - var3, 16777215, -1);
        }
        if (class34.field749 == 20) {
            short var5 = 211;
            class128.field2504.method1394(382 - class128.field2504.field4057 / 2, -(class128.field2504.field4061 / 2) + 271);
            arg2.method889(class97.field1805, 382, var5, 16776960, 0);
            int var23 = var5 + 15;
            arg2.method889(class97.field1816, 382, var23, 16776960, 0);
            int var24 = var23 + 15;
            arg2.method889(class97.field1800, 382, var24, 16776960, 0);
            int var25 = var24 + 15;
            int var26 = var25 + 10;
            arg2.method881(class234.method1531(new class222[] { class129.field2510, class142.method906(class97.field1819) }, -10949), 272, var26, 16777215, 0);
            int var28 = var26 + 15;
            arg2.method881(class234.method1531(new class222[] { class96.field1797, class97.field1814.method1451((byte) -43) }, -10949), 274, var28, 16777215, 0);
            int var29 = var28 + 15;
        }
        if (class34.field749 == 10) {
            class128.field2504.method1394(202, 171);
            if (class116.field2215 == 0) {
                short var6 = 251;
                arg2.method889(class76.field1482, 382, var6, 16776960, 0);
                short var7 = 302;
                int var27 = var6 + 30;
                short var8 = 291;
                class196.field3572.method1394(var7 - 73, var8 - 20);
                arg2.method911(class103.field1909, var7 - 73, var8 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                short var9 = 462;
                class196.field3572.method1394(var9 - 73, var8 - 20);
                arg2.method911(class39.field875, var9 - 73, var8 + -20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class116.field2215 == 2) {
                short var13 = 211;
                arg2.method889(class97.field1805, 382, var13, 16776960, 0);
                short var14 = 321;
                int var34 = var13 + 15;
                short var15 = 302;
                arg2.method889(class97.field1816, 382, var34, 16776960, 0);
                int var35 = var34 + 15;
                arg2.method889(class97.field1800, 382, var35, 16776960, 0);
                int var36 = var35 + 15;
                boolean var16;
                if (class135.field2609 == 0 && class175.field3280 % 40 < 20 && class60.field1116) {
                    var16 = true;
                } else {
                    var16 = false;
                }
                var34 = var36 + 10;
                arg2.method881(class234.method1531(new class222[] { class129.field2510, class142.method906(class97.field1819), var16 ? class99.field1861 : class97.field1813 }, -10949), 272, var34, 16777215, 0);
                var34 += 15;
                boolean var17;
                if (class135.field2609 == 1 && class175.field3280 % 40 < 20 && class60.field1116) {
                    var17 = true;
                } else {
                    var17 = false;
                }
                arg2.method881(class234.method1531(new class222[] { class96.field1797, class97.field1814.method1451((byte) -120), var17 ? class99.field1861 : class97.field1813 }, -10949), 274, var34, 16777215, 0);
                var34 += 15;
                class196.field3572.method1394(var15 - 73, var14 + -20);
                arg2.method889(class36.field790, var15, var14 + 5, 16777215, 0);
                short var18 = 462;
                class196.field3572.method1394(var18 - 73, var14 + -20);
                arg2.method889(class78.field1512, var18, var14 + 5, 16777215, 0);
            } else if (class116.field2215 == 3) {
                arg2.method889(class106.field1966, 382, 211, 16776960, 0);
                short var10 = 236;
                arg2.method889(class56.field1060, 382, var10, 16777215, 0);
                short var11 = 382;
                int var30 = var10 + 15;
                arg2.method889(class50.field976, 382, var30, 16777215, 0);
                int var31 = var30 + 15;
                arg2.method889(class139.field2683, 382, var31, 16777215, 0);
                short var12 = 321;
                int var32 = var31 + 15;
                arg2.method889(class122.field2323, 382, var32, 16777215, 0);
                int var33 = var32 + 15;
                class196.field3572.method1394(var11 - 73, var12 + -20);
                arg2.method889(class78.field1512, var11, var12 + 5, 16777215, 0);
            }
        }
        if (class70.field1328 != 1) {
            if (class51.field981 > 0) {
                class134.method838((byte) 116, class51.field981);
                class51.field981 = 0;
            }
            class97.method608((byte) 78);
        }
        if (arg0 <= 34) {
            return;
        }
        class151.field2928[class31.field659 ? 1 : 0].method1394(725, 463);
        if (class34.field749 <= 5 || class44.field925 == 2) {
            return;
        }
        if (class160.field3054 == null) {
            class160.field3054 = class34.method290(class34.field763, class78.field1508, true, 0);
        }
        if (class160.field3054 == null) {
            return;
        }
        byte var19 = 5;
        byte var20 = 100;
        short var21 = 463;
        class160.field3054.method1394(var19, var21);
        byte var22 = 35;
        arg2.method889(class234.method1531(new class222[] { class131.field2543, class217.field4037, class56.method414(-121, class208.field3875) }, -10949), var19 + var20 / 2, var21 - -(var22 / 2) + -2, 16777215, 0);
        if (class68.field1280 == null) {
            arg1.method889(class187.field3473, var19 + var20 / 2, var22 / 2 + var21 + 12, 16777215, 0);
            return;
        }
        arg1.method889(class16.field419, var20 / 2 + var19, var22 / 2 + 12 + var21, 16777215, 0);
        return;
    }
}
