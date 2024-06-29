import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class65 {

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "Lic;")
    public static class59 field1642 = class59.method433(0, "RuneScape wurde aktualisiert(Q");

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "Lic;")
    private static class59 field1640 = class59.method433(0, "OFF");

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "Lic;")
    public static class59 field1641 = class59.method433(0, "nav");

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public static int field1649 = 0;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "[I")
    public static int[] field1651 = new int[2000];

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field1646 = 2;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "Lic;")
    public static class59 field1644 = field1640;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "Lic;")
    private static class59 field1650 = class59.method433(0, "Cancel");

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "Lic;")
    public static class59 field1639 = field1650;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "Lef;")
    public static class35 field1643;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BZ)V")
    public static final void method530(byte arg0, boolean arg1) {
        if (arg0 >= -34) {
            return;
        }
        int var2 = class43.field1092;
        field1653++;
        if (class159.field3650.field1730 >> 7 == class88.field2213 && class159.field3650.field1751 >> 7 == class53.field1315) {
            class88.field2213 = 0;
        }
        if (arg1) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            int var4;
            class49 var5;
            if (arg1) {
                var4 = 33538048;
                var5 = class159.field3650;
            } else {
                var4 = class31.field842[var3] << 14;
                var5 = class91.field2323[class31.field842[var3]];
            }
            if (var5 != null && var5.method380(2)) {
                int var6 = var5.field1730 >> 7;
                int var7 = var5.field1751 >> 7;
                var5.field1220 = false;
                if ((class127.field2882 && class43.field1092 > 50 || class43.field1092 > 200) && !arg1 && var5.field1757 == var5.field1686) {
                    var5.field1220 = true;
                }
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var5.field1240 == null || class23.field561 < var5.field1228 || var5.field1230 <= class23.field561) {
                        if ((var5.field1730 & 0x7F) == 64 && (var5.field1751 & 0x7F) == 64) {
                            if (class54.field1327[var6][var7] == class51.field1280) {
                                continue;
                            }
                            class54.field1327[var6][var7] = class51.field1280;
                        }
                        var5.field1255 = class147.method1095((byte) 30, var5.field1751, class44.field1127, var5.field1730);
                        class3.field58.method898(class44.field1127, var5.field1730, var5.field1751, var5.field1255, 60, var5, var5.field1724, var4, var5.field1708);
                    } else {
                        var5.field1220 = false;
                        var5.field1255 = class147.method1095((byte) 30, var5.field1751, class44.field1127, var5.field1730);
                        class3.field58.method880(class44.field1127, var5.field1730, var5.field1751, var5.field1255, 60, var5, var5.field1724, var4, var5.field1253, var5.field1236, var5.field1219, var5.field1232);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
    public static final void method531(int arg0) {
        for (int var1 = arg0; var1 < class43.field1092; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class31.field842[var1];
            }
            class49 var6 = class91.field2323[var5];
            if (var6 != null && var6.field1720 > 0) {
                var6.field1720--;
                if (var6.field1720 == 0) {
                    var6.field1697 = null;
                }
            }
        }
        field1648++;
        for (int var2 = 0; var2 < class103.field2510; var2++) {
            int var3 = class53.field1309[var2];
            class90 var4 = class47.field1210[var3];
            if (var4 != null && var4.field1720 > 0) {
                var4.field1720--;
                if (var4.field1720 == 0) {
                    var4.field1697 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
    public static void method532(boolean arg0) {
        field1651 = null;
        field1642 = null;
        field1643 = null;
        field1644 = null;
        field1639 = null;
        field1640 = null;
        if (arg0) {
            method530((byte) -74, false);
        }
        field1650 = null;
        field1641 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZ)V")
    public static final void method533(int arg0, boolean arg1) {
        if (arg0 != 2864) {
            return;
        }
        field1652++;
        class49.field1235 = arg1;
        if (!class49.field1235) {
            int var25 = class10.field213.method1161((byte) 60);
            int var26 = (class34.field914 - class10.field213.field3457) / 16;
            class8.field163 = new int[var26][4];
            for (int var27 = 0; var27 < var26; var27++) {
                for (int var37 = 0; var37 < 4; var37++) {
                    class8.field163[var27][var37] = class10.field213.method1183(class125.method958(arg0, 2885));
                }
            }
            int var28 = class10.field213.method1170((byte) -103);
            int var29 = class10.field213.method1180(arg0 - 2992);
            int var30 = class10.field213.method1161((byte) 60);
            boolean var31 = false;
            int var32 = class10.field213.method1200((byte) 113);
            class82.field2047 = new byte[var26][];
            if ((var25 / 8 == 48 || var25 / 8 == 49) && (var32 / 8) == 48) {
                var31 = true;
            }
            class70.field1779 = new int[var26];
            class148.field3238 = new int[var26];
            class116.field2719 = new byte[var26][];
            if (var25 / 8 == 48 && var32 / 8 == 148) {
                var31 = true;
            }
            class55.field1349 = new int[var26];
            int var33 = 0;
            for (int var34 = (var25 - 6) / 8; var34 <= (var25 + 6) / 8; var34++) {
                for (int var35 = (var32 - 6) / 8; var35 <= (var32 + 6) / 8; var35++) {
                    int var36 = (var34 << 8) + var35;
                    if (!var31 || var35 != 49 && var35 != 149 && var35 != 147 && var34 != 50 && (var34 != 49 || var35 != 47)) {
                        class148.field3238[var33] = var36;
                        class70.field1779[var33] = class38.field993.method201(class46.method358(new class59[] { class63.field1623, class46.method361(var34, 54), class36.field945, class46.method361(var35, -124) }, (byte) -75), -1);
                        class55.field1349[var33] = class38.field993.method201(class46.method358(new class59[] { class125.field2806, class46.method361(var34, -100), class36.field945, class46.method361(var35, 127) }, (byte) -75), arg0 - 2865);
                        var33++;
                    }
                }
            }
            class64.method529((byte) 24, var29, var30, var25, var28, var32);
            return;
        }
        int var2 = class10.field213.method1200((byte) 114);
        int var3 = class10.field213.method1194(false);
        int var4 = class10.field213.method1180(-128);
        class10.field213.method1062(false);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = class10.field213.method1064(1, arg0 - 10148);
                    if (var24 == 1) {
                        class136.field3023[var5][var22][var23] = class10.field213.method1064(26, -7284);
                    } else {
                        class136.field3023[var5][var22][var23] = -1;
                    }
                }
            }
        }
        class10.field213.method1070(-16777217);
        int var6 = (class34.field914 - class10.field213.field3457) / 16;
        class8.field163 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var21 = 0; var21 < 4; var21++) {
                class8.field163[var7][var21] = class10.field213.method1175((byte) -99);
            }
        }
        int var8 = class10.field213.method1180(-128);
        int var9 = class10.field213.method1180(-128);
        class82.field2047 = new byte[var6][];
        class116.field2719 = new byte[var6][];
        class70.field1779 = new int[var6];
        class148.field3238 = new int[var6];
        class55.field1349 = new int[var6];
        int var10 = 0;
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var12 = 0; var12 < 13; var12++) {
                for (int var13 = 0; var13 < 13; var13++) {
                    int var14 = class136.field3023[var11][var12][var13];
                    if (var14 != -1) {
                        int var15 = var14 >> 3 & 0x7FF;
                        int var16 = var14 >> 14 & 0x3FF;
                        int var17 = (var16 / 8 << 8) + (var15 / 8);
                        for (int var18 = 0; var18 < var10; var18++) {
                            if (class148.field3238[var18] == var17) {
                                var17 = -1;
                                break;
                            }
                        }
                        if (var17 != -1) {
                            class148.field3238[var10] = var17;
                            int var19 = var17 >> 8 & 0xFF;
                            int var20 = var17 & 0xFF;
                            class70.field1779[var10] = class38.field993.method201(class46.method358(new class59[] { class63.field1623, class46.method361(var19, 121), class36.field945, class46.method361(var20, 58) }, (byte) -75), -1);
                            class55.field1349[var10] = class38.field993.method201(class46.method358(new class59[] { class125.field2806, class46.method361(var19, -102), class36.field945, class46.method361(var20, class125.method958(arg0, -2914)) }, (byte) -75), -1);
                            var10++;
                        }
                    }
                }
            }
        }
        class64.method529((byte) 24, var9, var4, var8, var3, var2);
    }
}
