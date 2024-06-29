import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class136 extends class202 {

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "[B")
    public static byte[] field2403 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "Lsb;")
    public static class98 field2398 = class47.method368("<img=0>", 0);

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "Lsb;")
    public static class98 field2406 = class47.method368("(U", 0);

    @OriginalMember(owner = "client!tb", name = "bb", descriptor = "Lsb;")
    private static class98 field2412 = class47.method368("Started 3d library", 0);

    @OriginalMember(owner = "client!tb", name = "cb", descriptor = "Lsb;")
    public static class98 field2413 = class47.method368("p11_full", 0);

    @OriginalMember(owner = "client!tb", name = "Z", descriptor = "Lsb;")
    public static class98 field2410 = field2412;

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!tb", name = "X", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!tb", name = "Y", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!tb", name = "ab", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "Lwa;")
    private class219 field2399;

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "Ltg;")
    public static class75 field2401;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Llj;IB)V")
    private final void method1018(class216 arg0, int arg1, byte arg2) {
        if (arg1 == 249) {
            int var4 = arg0.method1446(5350);
            if (this.field2399 == null) {
                int var5 = class186.method1286((byte) 120, var4);
                this.field2399 = new class219(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method1446(5350) == 1;
                int var8 = arg0.method1448(26420);
                class235 var9;
                if (var7) {
                    var9 = new class97(arg0.method1445(-3));
                } else {
                    var9 = new class224(arg0.method1442(-1330139880));
                }
                this.field2399.method1513((long) var8, var9, arg2 - 30);
            }
        }
        field2407++;
        if (arg2 != 29) {
            method1024(97, (byte) 7);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLsb;)V")
    public static final void method1019(byte arg0, class98 arg1) {
        if (arg0 < 41) {
            method1024(77, (byte) -87);
        }
        class154.field2809 = arg1;
        field2408++;
        if (class119.field2145.field76 == null) {
            return;
        }
        try {
            class98 var2 = class220.field3797.method744(class119.field2145.field76, (byte) -124);
            class98 var3 = class202.field3448.method744(class119.field2145.field76, (byte) 86);
            class98 var4 = class186.method1288(new class98[] { var2, class62.field1041, arg1, class91.field1596, var3 }, 31618);
            class98 var5;
            if (arg1.method724((byte) 25) == 0) {
                var5 = class186.method1288(new class98[] { var4, class170.field3001 }, 31618);
            } else {
                var5 = class186.method1288(new class98[] { var4, class171.field3006, class200.method1362(class164.method1183((byte) 80) + 94608000000L, 114), class161.field2910, class92.method677(94608000L, (byte) 126) }, 31618);
            }
            class186.method1288(new class98[] { class215.field3655, var5, class138.field2463 }, 31618).method745(-1, class119.field2145.field76);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BII)I")
    public final int method1020(byte arg0, int arg1, int arg2) {
        field2409++;
        if (this.field2399 == null) {
            return arg1;
        } else {
            int var4 = -106 % ((-arg0 - 20) / 47);
            class224 var5 = (class224) this.field2399.method1511((byte) -127, (long) arg2);
            return var5 == null ? arg1 : var5.field3858;
        }
    }

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "(B)V")
    public static final void method1021(byte arg0) {
        class72.method512(class199.field3427, 2);
        class154.field2806++;
        field2404++;
        if (class101.field1787 && class153.field2804) {
            int var1 = class199.field3426;
            int var2 = class75.field1322;
            int var3 = var2 - class144.field2530;
            if (arg0 != 115) {
                method1019((byte) -39, (class98) null);
            }
            int var4 = class199.field3427.field2653;
            if (var3 < class169.field2988) {
                var3 = class169.field2988;
            }
            if ((class169.field2988 + class131.field2329.field2694) < (class199.field3427.field2694 + var3)) {
                var3 = class169.field2988 + class131.field2329.field2694 - class199.field3427.field2694;
            }
            int var5 = var1 - class133.field2359;
            int var6 = var3 - class206.field3528;
            if (class224.field3871 > var5) {
                var5 = class224.field3871;
            }
            if (class224.field3871 + class131.field2329.field2647 < var5 - -class199.field3427.field2647) {
                var5 = class224.field3871 + class131.field2329.field2647 - class199.field3427.field2647;
            }
            int var7 = var3 + class131.field2329.field2649 - class169.field2988;
            int var8 = var5 - class196.field3391;
            int var9 = var5 + class131.field2329.field2615 - class224.field3871;
            if (class199.field3427.field2599 < class154.field2806 && (var4 < var6 || var6 < (-var4) || var4 < var8 || var8 < -var4)) {
                class102.field1814 = true;
            }
            if (class199.field3427.field2698 != null && class102.field1814) {
                class28 var10 = new class28();
                var10.field525 = var7;
                var10.field514 = class199.field3427.field2698;
                var10.field516 = var9;
                var10.field517 = class199.field3427;
                class192.method1327(var10, arg0 + 199885);
            }
            if (class81.field1433 == 0) {
                if (class102.field1814) {
                    if (class199.field3427.field2635 != null) {
                        class28 var11 = new class28();
                        var11.field526 = class141.field2492;
                        var11.field517 = class199.field3427;
                        var11.field516 = var9;
                        var11.field514 = class199.field3427.field2635;
                        var11.field525 = var7;
                        class192.method1327(var11, arg0 ^ 0x30D33);
                    }
                    if (class141.field2492 != null && client.method765(class199.field3427) != null) {
                        class104.field1851++;
                        class237.field4084.method490(148, -69);
                        class237.field4084.method1460(class141.field2492.field2651, 16851);
                        class237.field4084.method1493(class199.field3427.field2651, false);
                        class237.field4084.method1453(class199.field3427.field2728, -29263);
                        class237.field4084.method1474(class141.field2492.field2728, 255);
                    }
                } else if ((class164.field2953 == 1 || class233.method1599((byte) 90, class226.field3894 - 1)) && class226.field3894 > 2) {
                    class92.method676(0);
                } else if (class226.field3894 > 0) {
                    class144.method1070((byte) -43);
                }
                class199.field3427 = null;
            }
        } else if (class154.field2806 > 1) {
            class199.field3427 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILlj;)V")
    public final void method1022(int arg0, class216 arg1) {
        while (true) {
            int var3 = arg1.method1446(arg0 + 5350);
            if (var3 == 0) {
                if (arg0 != 0) {
                    this.method1018((class216) null, -17, (byte) 63);
                }
                field2405++;
                return;
            }
            this.method1018(arg1, var3, (byte) 29);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public static void method1023(int arg0) {
        field2403 = null;
        field2412 = null;
        field2413 = null;
        field2398 = null;
        if (arg0 >= -17) {
            method1023(-64);
        }
        field2410 = null;
        field2406 = null;
        field2401 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)Z")
    public static final boolean method1024(int arg0, byte arg1) {
        field2400++;
        if (arg1 == -16) {
            return (arg0 >> 30 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lsb;BI)Lsb;")
    public final class98 method1025(class98 arg0, byte arg1, int arg2) {
        if (arg1 != -46) {
            field2410 = null;
        }
        field2402++;
        if (this.field2399 == null) {
            return arg0;
        } else {
            class97 var4 = (class97) this.field2399.method1511((byte) -123, (long) arg2);
            return var4 == null ? arg0 : var4.field1667;
        }
    }
}
