import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class171 {

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    public static int field2893 = 0;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "Z")
    public static boolean field2892 = false;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "Lok;")
    private static class146 field2886 = class235.method1724(-12908, "K");

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "Lok;")
    public static class146 field2885 = field2886;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "Lok;")
    public static class146 field2890 = field2886;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "J")
    public long field2883;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "Lkj;")
    public class171 field2895;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "Lkj;")
    public class171 field2896;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "Lr;")
    public static class264 field2887;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)V", line = 8)
    public static final void method1322(int arg0, int arg1) {
        field2894++;
        if (arg0 >= 0 && class276.field4745.length > arg0) {
            if (arg1 <= 105) {
                field2890 = (class146) null;
            }
            class276.field4745[arg0] = !class276.field4745[arg0];
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BJ)V", line = 28)
    public static final void method1323(byte arg0, long arg1) {
        field2882++;
        if (arg1 == 0L) {
            return;
        }
        if (arg0 != -62) {
            field2892 = true;
        }
        for (int var3 = 0; var3 < class102.field1653; var3++) {
            if (class106.field1715[var3] == arg1) {
                class9.field176++;
                class102.field1653--;
                for (int var4 = var3; var4 < class102.field1653; var4++) {
                    class106.field1715[var4] = class106.field1715[var4 + 1];
                    class73.field1184[var4] = class73.field1184[var4 + 1];
                }
                class150.field2550 = class13.field253;
                class47.field820.method1656(61, 16);
                class47.field820.method359(arg1, 128);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)Z", line = 70)
    public final boolean method1324(int arg0) {
        field2881++;
        if (arg0 == -29231) {
            return this.field2895 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V", line = 94)
    public final void method1325(int arg0) {
        field2884++;
        if (arg0 != -2935) {
            method1323((byte) -60, -122L);
        }
        if (this.field2895 != null) {
            this.field2895.field2896 = this.field2896;
            this.field2896.field2895 = this.field2895;
            this.field2895 = null;
            this.field2896 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(I)V", line = 123)
    public static void method1326(int arg0) {
        field2887 = null;
        if (arg0 != 1302) {
            field2889 = 71;
        }
        field2886 = null;
        field2885 = null;
        field2890 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V", line = 142)
    public static final void method1327(byte arg0) {
        field2888++;
        class197.method1519(false, 30);
        class303.field5193 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class43.field735.length; var2++) {
            if (class183.field3059[var2] != -1 && class43.field735[var2] == null) {
                class43.field735[var2] = class280.field4807.method92(class183.field3059[var2], 0, 0);
                if (class43.field735[var2] == null) {
                    class303.field5193++;
                    var1 = false;
                }
            }
            if (class235.field3927[var2] != -1 && class88.field1396[var2] == null) {
                class88.field1396[var2] = class280.field4807.method96(0, (byte) 84, class235.field3927[var2], class36.field670[var2]);
                if (class88.field1396[var2] == null) {
                    var1 = false;
                    class303.field5193++;
                }
            }
            if (class271.field4640) {
                if (class55.field992[var2] != -1 && class85.field1352[var2] == null) {
                    class85.field1352[var2] = class280.field4807.method92(class55.field992[var2], arg0 - 79, 0);
                    if (class85.field1352[var2] == null) {
                        var1 = false;
                        class303.field5193++;
                    }
                }
                if (class311.field5305[var2] != -1 && class294.field4994[var2] == null) {
                    class294.field4994[var2] = class280.field4807.method92(class311.field5305[var2], 0, 0);
                    if (class294.field4994[var2] == null) {
                        class303.field5193++;
                        var1 = false;
                    }
                }
            }
            if (class139.field2312 != null && class248.field4121[var2] == null && class139.field2312[var2] != -1) {
                class248.field4121[var2] = class280.field4807.method96(0, (byte) 84, class139.field2312[var2], class36.field670[var2]);
                if (class248.field4121[var2] == null) {
                    var1 = false;
                    class303.field5193++;
                }
            }
        }
        if (class277.field4758 == null) {
            if (class27.field475 == null || !class73.field1199.method90(class112.method758(-75, new class146[] { class27.field475.field3236, class95.field1538 }), (byte) 55)) {
                class277.field4758 = new class280(0);
            } else if (class73.field1199.method104(class112.method758(arg0 + 40, new class146[] { class27.field475.field3236, class95.field1538 }), (byte) 64)) {
                class277.field4758 = class132.method980(110, class112.method758(121, new class146[] { class27.field475.field3236, class95.field1538 }), class73.field1199);
            } else {
                var1 = false;
                class303.field5193++;
            }
        }
        if (!var1) {
            class306.field5236 = 1;
            return;
        }
        class214.field3529 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class43.field735.length; var4++) {
            byte[] var5 = class88.field1396[var4];
            if (var5 != null) {
                int var6 = (class177.field3002[var4] & 0xFF) * 64 - class201.field3357;
                int var7 = (class177.field3002[var4] >> 8) * 64 - class15.field300;
                if (class113.field1800) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class242.method1755(var5, var7, var6, false);
            }
            if (class271.field4640) {
                byte[] var8 = class294.field4994[var4];
                if (var8 != null) {
                    int var9 = (class177.field3002[var4] >> 8) * 64 - class15.field300;
                    int var10 = (class177.field3002[var4] & 0xFF) * 64 - class201.field3357;
                    if (class113.field1800) {
                        var10 = 10;
                        var9 = 10;
                    }
                    var3 &= class242.method1755(var8, var9, var10, false);
                }
            }
        }
        if (!var3) {
            class306.field5236 = 2;
            return;
        }
        if (class306.field5236 != 0) {
            class55.method445(true, 0, class112.method758(-109, new class146[] { class71.field1169, class206.field3422 }));
        }
        class3.method9(arg0 - 169);
        class98.method678((byte) -117);
        boolean var11 = false;
        if (class271.field4640 && class117.field1888) {
            for (int var12 = 0; var12 < class43.field735.length; var12++) {
                if (class294.field4994[var12] != null || class85.field1352[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class287.method2065(4, 104, 104, class271.field4640 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class251.field4202[var13].method1062(false);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class46.field775[var14][var15][var16] = 0;
                }
            }
        }
        class46.method317(false, 128);
        if (class271.field4640) {
            class48.field895.method2204();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class48.field891[var17][var18].field3102 = true;
                }
            }
        }
        if (class271.field4640) {
            class53.method436();
        }
        if (class271.field4640) {
            class173.method1339(-127);
        }
        class3.method9(-81);
        System.gc();
        class197.method1519(true, arg0 ^ 0x51);
        class122.method847((byte) 115, false);
        if (!class113.field1800) {
            class15.method115(arg0 ^ 0xFFFFFFCA, false);
            class197.method1519(true, arg0 ^ 0x51);
            if (class271.field4640) {
                int var19 = class102.field1639.field5419[0] >> 3;
                int var20 = class102.field1639.field5432[0] >> 3;
                class116.method790(var19, (byte) 124, var20);
            }
            class161.method1261(false, 128);
            if (class248.field4121 != null) {
                class245.method1775((byte) -106);
            }
        }
        if (class113.field1800) {
            class203.method1545(false, -112);
            class197.method1519(true, arg0 - 49);
            if (class271.field4640) {
                int var21 = class102.field1639.field5432[0] >> 3;
                int var22 = class102.field1639.field5419[0] >> 3;
                class116.method790(var22, (byte) 115, var21);
            }
            class210.method1580(false, -109);
        }
        class98.method678((byte) -123);
        class197.method1519(true, arg0 - 49);
        class116.method783((byte) -31, false, class251.field4202);
        if (class271.field4640) {
            class53.method437();
        }
        class197.method1519(true, arg0 ^ 0x51);
        int var23 = class251.field4207;
        if (class203.field3387 < var23) {
            var23 = class203.field3387;
        }
        if (arg0 != 79) {
            field2885 = (class146) null;
        }
        if ((class203.field3387 - 1) > var23) {
            int var24 = class203.field3387 - 1;
        }
        if (class322.method2236(arg0 - 7829)) {
            class195.method1508(0);
        } else {
            class195.method1508(class251.field4207);
        }
        class117.method792((byte) -125);
        if (class271.field4640 && var11) {
            class279.method2025(true);
            class122.method847((byte) 70, true);
            if (!class113.field1800) {
                class15.method115(-53, true);
                class197.method1519(true, arg0 ^ 0x51);
                class161.method1261(true, arg0 ^ 0xCF);
            }
            if (class113.field1800) {
                class203.method1545(true, -123);
                class197.method1519(true, 30);
                class210.method1580(true, arg0 - 191);
            }
            class98.method678((byte) -118);
            class197.method1519(true, 30);
            class116.method783((byte) -31, true, class251.field4202);
            class197.method1519(true, arg0 - 49);
            class117.method792((byte) -127);
            class279.method2025(false);
        }
        if (class271.field4640) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    class48.field891[var25][var26].method1455(class174.field2914[0], var25 * 8, var26 * 8);
                }
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class237.method1731(var28, -111, var27);
            }
        }
        class91.method625(-72);
        class3.method9(-115);
        class73.method541(false);
        class98.method678((byte) -127);
        class212.field3512 = false;
        if (class144.field2418 != null && class98.field1582 != null && class238.field3973 == 25) {
            class47.field820.method1656(178, arg0 - 63);
            class190.field3146++;
            class47.field820.method387(1057001181, 116);
        }
        if (!class113.field1800) {
            int var29 = (class273.field4707 - 6) / 8;
            int var30 = (class273.field4707 + 6) / 8;
            int var31 = (class55.field979 - 6) / 8;
            int var32 = (class55.field979 + 6) / 8;
            for (int var33 = var29 - 1; var33 <= (var30 + 1); var33++) {
                for (int var34 = var31 - 1; var34 <= (var32 + 1); var34++) {
                    if (var33 < var29 || var30 < var33 || var31 > var34 || var34 > var32) {
                        class280.field4807.method89(class112.method758(127, new class146[] { class211.field3496, class82.method585(14744, var33), class260.field4330, class82.method585(14744, var34) }), (byte) -74);
                        class280.field4807.method89(class112.method758(-51, new class146[] { class47.field827, class82.method585(arg0 ^ 0x39D7, var33), class260.field4330, class82.method585(arg0 + 14665, var34) }), (byte) -74);
                    }
                }
            }
        }
        if (class238.field3973 == 28) {
            class1.method4(arg0 ^ 0xFFFFFF98, 10);
        } else {
            class1.method4(-41, 30);
            if (class98.field1582 != null) {
                class47.field820.method1656(231, 16);
            }
        }
        class202.method1543(37);
        class3.method9(arg0 ^ 0xFFFFFFD3);
        class146.method1091(arg0 ^ 0x40EC);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 651)
    public static final void method1328(String arg0, int arg1) {
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        field2891++;
        System.exit(1);
        if (arg1 != 23466) {
            method1328((String) null, 50);
        }
    }
}
