import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public abstract class class229 {

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field3605 = 0;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZ)I", line = 18)
    public static final int method1556(int arg0, boolean arg1) {
        field3600++;
        long var2 = class19.method122(-12169);
        class255 var4 = arg1 ? (class255) class98.field1410.method27(119) : (class255) class98.field1410.method34(8);
        if (arg0 > -122) {
            return -22;
        }
        while (var4 != null) {
            if ((var4.field4044 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field4044 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field2549;
                    class170.field2650[var5] = class353.field5617[var5];
                    var4.method1131(8);
                    return var5;
                }
                var4.method1131(8);
            }
            var4 = (class255) class98.field1410.method34(8);
        }
        return -1;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(CI)Z", line = 60)
    public static final boolean method1557(char arg0, int arg1) {
        field3602++;
        if (arg1 == -58) {
            return arg0 >= '0' && arg0 <= '9';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILnm;IILnm;)Lme;", line = 78)
    public static final class82 method1558(int arg0, class221 arg1, int arg2, int arg3, class221 arg4) {
        field3604++;
        if (arg3 == 16383) {
            return class334.method2361(arg2, arg4, 16836, arg0) ? class33.method276(25149, arg1.method1504(arg0, true, arg2)) : null;
        } else {
            return (class82) null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)V", line = 92)
    public static final void method1559(byte arg0) {
        field3603++;
        if (arg0 != 27) {
            method1556(-39, true);
        }
        if (class88.field1260 == null) {
            return;
        }
        if (class334.field5425 < 10) {
            if (!class88.field1253.method1517(126, class88.field1260.field4525)) {
                class334.field5425 = class55.field833.method1507(class88.field1260.field4525, 0) / 10;
                return;
            }
            class319.method2301((byte) 79);
            class334.field5425 = 10;
        }
        if (class334.field5425 == 10) {
            class88.field1256 = class88.field1260.field4535 >> 6 << 6;
            class88.field1261 = class88.field1260.field4536 >> 6 << 6;
            class88.field1263 = (class88.field1260.field4526 >> 6 << 6) + 64 - class88.field1261;
            int[] var1 = new int[3];
            class88.field1262 = (class88.field1260.field4538 >> 6 << 6) + 64 - class88.field1256;
            int var2 = -1;
            int var3 = -1;
            if (class88.field1260.method1963(var1, (class329.field5388.field4783 >> 7) + class150.field2420, class215.field3313 - -(class329.field5388.field4796 >> 7), class120.field1779, -92)) {
                var2 = var1[1] - class88.field1261;
                var3 = class88.field1262 + class88.field1256 - var1[2] - 1;
            }
            if (!class46.field670 && var2 >= 0 && class88.field1263 > var2 && var3 >= 0 && var3 < class88.field1262) {
                int var4 = var3 + (int) (Math.random() * 10.0D) - 5;
                class125.field1873 = var4;
                int var5 = var2 + (int) (Math.random() * 10.0D) - 5;
                class236.field3735 = var5;
            } else if (class68.field1057 == -1 || class327.field5353 == -1) {
                class88.field1260.method1964(class88.field1260.field4529 >> 14 & 0x3FFF, class88.field1260.field4529 & 0x3FFF, var1, (byte) 121);
                class125.field1873 = class88.field1256 + class88.field1262 - var1[2] - 1;
                class236.field3735 = var1[1] - class88.field1261;
            } else {
                class88.field1260.method1964(class68.field1057, class327.field5353, var1, (byte) 121);
                class327.field5353 = -1;
                class68.field1057 = -1;
                class46.field670 = false;
                if (var1 != null) {
                    class125.field1873 = class88.field1262 + class88.field1256 - var1[2] - 1;
                    class236.field3735 = var1[1] - class88.field1261;
                }
            }
            if (class88.field1260.field4534 == 37) {
                class88.field1259 = 3.0F;
                class88.field1264 = 3.0F;
            } else if (class88.field1260.field4534 == 50) {
                class88.field1259 = 4.0F;
                class88.field1264 = 4.0F;
            } else if (class88.field1260.field4534 == 75) {
                class88.field1259 = 6.0F;
                class88.field1264 = 6.0F;
            } else if (class88.field1260.field4534 == 100) {
                class88.field1259 = 8.0F;
                class88.field1264 = 8.0F;
            } else if (class88.field1260.field4534 == 200) {
                class88.field1259 = 16.0F;
                class88.field1264 = 16.0F;
            } else {
                class88.field1259 = 8.0F;
                class88.field1264 = 8.0F;
            }
            class300.method2110(true);
            int var6 = class88.field1262 >> 6;
            class88.field1281 = new int[class71.field1098 + 1];
            int var7 = class88.field1263 >> 6;
            class88.field1268 = new byte[var7][var6][];
            class88.field1280 = new byte[var7][var6][];
            class88.field1272 = new byte[var7][var6][];
            class88.field1276 = new byte[var7][var6][];
            class88.field1266 = new int[var7][var6][];
            class88.field1275 = new byte[var7][var6][];
            class88.field1271 = new int[var7][var6][];
            class65.field957 = new class150();
            class47.field686 = new class284();
            int var8 = class249.field3956 >> 2 << 10;
            int var9 = class54.field815 >> 1;
            class88.method586(var8, var9);
            class75.method512(arg0 ^ 0x3D14, 1024, 256);
            class340.method2399((byte) 24, 256);
            class334.field5425 = 20;
        } else if (class334.field5425 == 20) {
            class282.method1995(-26522, new class313(class88.field1253.method1489("underlay", true, class88.field1260.field4525)));
            class334.field5425 = 30;
            class28.method238(arg0 - 34, true);
            class7.method51(-99);
        } else if (class334.field5425 == 30) {
            class88.method588(new class313(class88.field1253.method1489("overlay", true, class88.field1260.field4525)));
            class334.field5425 = 40;
            class7.method51(arg0 ^ 0xFFFFFF94);
        } else if (class334.field5425 == 40) {
            class88.method575(new class313(class88.field1253.method1489("overlay2", true, class88.field1260.field4525)));
            class334.field5425 = 50;
            class7.method51(-109);
        } else if (class334.field5425 == 50) {
            class88.method579(new class313(class88.field1253.method1489("loc", true, class88.field1260.field4525)), class312.field5106);
            class334.field5425 = 60;
            class28.method238(arg0 - 34, true);
            class7.method51(-97);
        } else if (class334.field5425 == 60) {
            if (class88.field1253.method1488(false, class88.field1260.field4525 + "_labels")) {
                if (!class88.field1253.method1517(126, class88.field1260.field4525 + "_labels")) {
                    return;
                }
                class88.field1255 = class223.method1525(class88.field1260.field4525 + "_labels", class312.field5106, -1, class88.field1253);
            } else {
                class88.field1255 = new class68(0);
            }
            class88.method582();
            class334.field5425 = 70;
            class7.method51(-86);
        } else if (class334.field5425 == 70) {
            class40.field610 = new class176(11, true, class235.field3731);
            class334.field5425 = 73;
            class28.method238(-7, true);
            class7.method51(arg0 - 143);
        } else if (class334.field5425 == 73) {
            class256.field4056 = new class176(12, true, class235.field3731);
            class334.field5425 = 76;
            class28.method238(arg0 - 34, true);
            class7.method51(-95);
        } else if (class334.field5425 == 76) {
            class196.field3015 = new class176(14, true, class235.field3731);
            class334.field5425 = 79;
            class28.method238(-7, true);
            class7.method51(arg0 ^ 0xFFFFFF84);
        } else if (class334.field5425 == 79) {
            class99.field1447 = new class176(17, true, class235.field3731);
            class334.field5425 = 82;
            class28.method238(arg0 - 34, true);
            class7.method51(-85);
        } else if (class334.field5425 == 82) {
            class223.field3436 = new class176(19, true, class235.field3731);
            class334.field5425 = 85;
            class28.method238(-7, true);
            class7.method51(-99);
        } else if (class334.field5425 == 85) {
            class355.field5630 = new class176(22, true, class235.field3731);
            class334.field5425 = 88;
            class28.method238(-7, true);
            class7.method51(-107);
        } else if (class334.field5425 == 88) {
            class32.field487 = new class176(26, true, class235.field3731);
            class334.field5425 = 91;
            class28.method238(-7, true);
            class7.method51(-101);
        } else {
            class339.field5460 = new class176(30, true, class235.field3731);
            class334.field5425 = 100;
            class28.method238(-7, true);
            class7.method51(arg0 - 145);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)I")
    public abstract int method1013(byte arg0);

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public abstract void method1014(Component arg0, boolean arg1);

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(Ljava/awt/Component;Z)V")
    public abstract void method1015(Component arg0, boolean arg1);
}
