import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class138 extends class66 {

    @OriginalMember(owner = "client!tf", name = "Y", descriptor = "I")
    private int field3116;

    @OriginalMember(owner = "client!tf", name = "hb", descriptor = "I")
    private int field3125;

    @OriginalMember(owner = "client!tf", name = "jb", descriptor = "I")
    private int field3127;

    @OriginalMember(owner = "client!tf", name = "ib", descriptor = "I")
    private int field3126;

    @OriginalMember(owner = "client!tf", name = "fb", descriptor = "I")
    private int field3123;

    @OriginalMember(owner = "client!tf", name = "Z", descriptor = "I")
    private int field3117;

    @OriginalMember(owner = "client!tf", name = "eb", descriptor = "Lkc;")
    private class72 field3122;

    @OriginalMember(owner = "client!tf", name = "cb", descriptor = "I")
    private int field3120;

    @OriginalMember(owner = "client!tf", name = "lb", descriptor = "I")
    private int field3129;

    @OriginalMember(owner = "client!tf", name = "db", descriptor = "Lv;")
    private static class146 field3121 = class159.method1226((byte) -37, "Loaded input handler");

    @OriginalMember(owner = "client!tf", name = "ab", descriptor = "Lv;")
    public static class146 field3118 = field3121;

    @OriginalMember(owner = "client!tf", name = "mb", descriptor = "Lua;")
    public static class140 field3130 = new class140(500);

    @OriginalMember(owner = "client!tf", name = "pb", descriptor = "Lv;")
    private static class146 field3133 = class159.method1226((byte) -37, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!tf", name = "rb", descriptor = "Lv;")
    public static class146 field3135 = class159.method1226((byte) -37, "http:)4)4www)3runescape)3com");

    @OriginalMember(owner = "client!tf", name = "nb", descriptor = "Z")
    public static boolean field3131 = false;

    @OriginalMember(owner = "client!tf", name = "sb", descriptor = "Lv;")
    public static class146 field3136 = class159.method1226((byte) -37, "(U1");

    @OriginalMember(owner = "client!tf", name = "qb", descriptor = "Lv;")
    public static class146 field3134 = class159.method1226((byte) -37, "Freie Welt");

    @OriginalMember(owner = "client!tf", name = "ob", descriptor = "I")
    public static int field3132 = 0;

    @OriginalMember(owner = "client!tf", name = "bb", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!tf", name = "gb", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!tf", name = "kb", descriptor = "[Lue;")
    public static class144[] field3128;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)Lu;")
    public final class139 method255(byte arg0) {
        field3119++;
        if (this.field3122 != null) {
            int var2 = class94.field2229 - this.field3120;
            if (var2 > 100 && this.field3122.field1682 > 0) {
                var2 = 100;
            }
            label51: {
                do {
                    do {
                        if (var2 <= this.field3122.field1680[this.field3129]) {
                            break label51;
                        }
                        var2 -= this.field3122.field1680[this.field3129];
                        this.field3129++;
                    } while (this.field3122.field1651.length > this.field3129);
                    this.field3129 -= this.field3122.field1682;
                } while (this.field3129 >= 0 && this.field3129 < this.field3122.field1651.length);
                this.field3122 = null;
            }
            this.field3120 = class94.field2229 - var2;
        }
        class69 var3 = class124.method928(-1, this.field3125);
        if (var3.field1598 != null) {
            var3 = var3.method486(126);
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field3123 == 1 || this.field3123 == 3) {
            var5 = var3.field1584;
            var4 = var3.field1597;
        } else {
            var4 = var3.field1584;
            var5 = var3.field1597;
        }
        int var6 = (var4 >> 1) + this.field3126;
        int var7 = (var4 + 1 >> 1) + this.field3126;
        int var8 = (var5 >> 1) + this.field3116;
        int var9 = (var5 + 1 >> 1) + this.field3116;
        if (arg0 >= -90) {
            this.method255((byte) 7);
        }
        int[][] var10 = class78.field1891[this.field3117];
        int var11 = var10[var6][var8] + var10[var6][var9] + var10[var7][var8] + var10[var7][var9] >> 2;
        int var12 = (this.field3126 << 7) + (var4 << 6);
        int var13 = (this.field3116 << 7) + (var5 << 6);
        return var3.method485(this.field3123, var11, this.field3122, var12, this.field3129, var10, var13, this.field3127, -16019);
    }

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "(I)V")
    public static final void method1019(int arg0) {
        field3124++;
        class42.method276(false, arg0 - 30536);
        boolean var1 = true;
        class100.field2439 = 0;
        for (int var2 = 0; var2 < class49.field1125.length; var2++) {
            if (class113.field2643[var2] != -1 && class49.field1125[var2] == null) {
                class49.field1125[var2] = class8.field163.method585(class113.field2643[var2], class79.method609(arg0, 99), 0);
                if (class49.field1125[var2] == null) {
                    class100.field2439++;
                    var1 = false;
                }
            }
            if (class126.field2915[var2] != -1 && class41.field928[var2] == null) {
                class41.field928[var2] = class8.field163.method587(0, class126.field2915[var2], (byte) -34, class57.field1286[var2]);
                if (class41.field928[var2] == null) {
                    class100.field2439++;
                    var1 = false;
                }
            }
        }
        if (!var1) {
            class146.field3352 = 1;
            return;
        }
        boolean var3 = true;
        class159.field3652 = 0;
        for (int var4 = 0; var4 < class49.field1125.length; var4++) {
            byte[] var56 = class41.field928[var4];
            if (var56 != null) {
                int var57 = (class116.field2716[var4] >> 8) * 64 - class63.field1429;
                int var58 = (class116.field2716[var4] & 0xFF) * 64 - class76.field1814;
                if (class105.field2529) {
                    var57 = 10;
                    var58 = 10;
                }
                var3 &= class76.method572(var58, var56, var57, 22);
            }
        }
        if (!var3) {
            class146.field3352 = 2;
            return;
        }
        if (class146.field3352 != 0) {
            class12.method70(true, 101, class71.method509(new class146[] { class152.field3501, field3133 }, (byte) 107));
        }
        class25.method160((byte) 43);
        class15.method93(10266);
        class25.method160((byte) 43);
        class66.field1496.method1192();
        class25.method160((byte) 43);
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class64.field1437[var5].method719(true);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    class74.field1772[var6][var54][var55] = 0;
                }
            }
        }
        class25.method160((byte) 43);
        class153.method1151((byte) -33);
        int var7 = class49.field1125.length;
        client.method126((byte) -61);
        class42.method276(true, -30528);
        if (!class105.field2529) {
            for (int var8 = 0; var8 < var7; var8++) {
                int var17 = (class116.field2716[var8] >> 8) * 64 - class63.field1429;
                int var18 = (class116.field2716[var8] & 0xFF) * 64 - class76.field1814;
                byte[] var19 = class49.field1125[var8];
                if (var19 != null) {
                    class25.method160((byte) 43);
                    class151.method1132(class64.field1437, -31714, (class87.field2055 - 6) * 8, class146.field3356 * 8 - 48, var18, var19, var17);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class116.field2716[var9] >> 8) * 64 - class63.field1429;
                byte[] var15 = class49.field1125[var9];
                int var16 = (class116.field2716[var9] & 0xFF) * 64 - class76.field1814;
                if (var15 == null && class146.field3356 < 800) {
                    class25.method160((byte) 43);
                    class17.method107((byte) -125, var14, 64, 64, var16);
                }
            }
            class42.method276(true, -30528);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class41.field928[var10];
                if (var11 != null) {
                    int var12 = (class116.field2716[var10] & 0xFF) * 64 - class76.field1814;
                    int var13 = (class116.field2716[var10] >> 8) * 64 - class63.field1429;
                    class25.method160((byte) 43);
                    class28.method194(class66.field1496, var11, class64.field1437, var13, arg0 + 106, var12);
                }
            }
        }
        if (class105.field2529) {
            for (int var20 = 0; var20 < 4; var20++) {
                class25.method160((byte) 43);
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        int var36 = class58.field1297[var20][var34][var35];
                        boolean var37 = false;
                        if (var36 != -1) {
                            int var38 = var36 >> 14 & 0x3FF;
                            int var39 = var36 >> 1 & 0x3;
                            int var40 = var36 >> 3 & 0x7FF;
                            int var41 = var36 >> 24 & 0x3;
                            int var42 = (var38 / 8 << 8) + var40 / 8;
                            for (int var43 = 0; var43 < class116.field2716.length; var43++) {
                                if (class116.field2716[var43] == var42 && class49.field1125[var43] != null) {
                                    class101.method838(var35 * 8, var39, (var38 & 0x7) * 8, var20, class49.field1125[var43], (var40 & 0x7) * 8, var41, var34 * 8, class64.field1437, false);
                                    var37 = true;
                                    break;
                                }
                            }
                        }
                        if (!var37) {
                            class28.method193(var34 * 8, var20, var35 * 8, (byte) 113);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class58.field1297[0][var21][var32];
                    if (var33 == -1) {
                        class17.method107((byte) 49, var21 * 8, 8, 8, var32 * 8);
                    }
                }
            }
            class42.method276(true, arg0 ^ 0xFFFF88C8);
            for (int var22 = 0; var22 < 4; var22++) {
                class25.method160((byte) 43);
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class58.field1297[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 24 & 0x3;
                            int var27 = var25 >> 3 & 0x7FF;
                            int var28 = var25 >> 1 & 0x3;
                            int var29 = var25 >> 14 & 0x3FF;
                            int var30 = (var29 / 8 << 8) + var27 / 8;
                            for (int var31 = 0; var31 < class116.field2716.length; var31++) {
                                if (class116.field2716[var31] == var30 && class41.field928[var31] != null) {
                                    class69.method501((var29 & 0x7) * 8, arg0 - 101, var28, var22, class64.field1437, var24 * 8, class66.field1496, var26, var23 * 8, class41.field928[var31], (var27 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class42.method276(true, -30528);
        class15.method93(arg0 ^ 0x2812);
        class25.method160((byte) 43);
        class26.method173(class64.field1437, 122, class66.field1496);
        class42.method276(true, arg0 ^ 0xFFFF88C8);
        int var44 = class157.field3612;
        if (class148.field3428 < var44) {
            var44 = class148.field3428;
        }
        if (var44 < class148.field3428 - 1) {
            int var45 = class148.field3428 - 1;
        }
        if (class91.field2196) {
            class66.field1496.method1176(class157.field3612);
        } else {
            class66.field1496.method1176(0);
        }
        if (arg0 != 8) {
            method1019(-123);
        }
        for (int var46 = 0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                class118.method900((byte) 73, var46, var53);
            }
        }
        class25.method160((byte) 43);
        class5.method36(123);
        field3130.method1050(true);
        if (client.field338 != null) {
            class20.field313++;
            class82.field1990.method265((byte) -85, 143);
            class82.field1990.method788(1057001181, arg0 ^ 0xD4734C98);
        }
        if (!class105.field2529) {
            int var47 = (class87.field2055 - 6) / 8;
            int var48 = (class146.field3356 + 6) / 8;
            int var49 = (class87.field2055 + 6) / 8;
            int var50 = (class146.field3356 - 6) / 8;
            for (int var51 = var47 - 1; var51 <= var49 + 1; var51++) {
                for (int var52 = var50 - 1; var52 <= var48 + 1; var52++) {
                    if (var51 < var47 || var51 > var49 || var52 < var50 || var52 > var48) {
                        class8.field163.method581((byte) -47, class71.method509(new class146[] { class150.field3471, class75.method564(false, var51), class157.field3628, class75.method564(false, var52) }, (byte) 53));
                        class8.field163.method581((byte) -47, class71.method509(new class146[] { class143.field3273, class75.method564(false, var51), class157.field3628, class75.method564(false, var52) }, (byte) 85));
                    }
                }
            }
        }
        class88.method702(30, false);
        class25.method160((byte) 43);
        class34.method227((byte) -128);
        class82.field1990.method265((byte) -85, 176);
        class17.method105(true);
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(B)V")
    public static void method1020(byte arg0) {
        field3130 = null;
        field3133 = null;
        field3134 = null;
        field3135 = null;
        field3136 = null;
        field3118 = null;
        field3121 = null;
        if (arg0 != 92) {
            field3121 = null;
        }
        field3128 = null;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(IIIIIIIZLjd;)V")
    public class138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class66 arg8) {
        this.field3116 = arg5;
        this.field3125 = arg0;
        this.field3127 = arg1;
        this.field3126 = arg4;
        this.field3123 = arg2;
        this.field3117 = arg3;
        if (arg6 != -1) {
            this.field3122 = class141.method1052(true, arg6);
            this.field3120 = class94.field2229 - 1;
            this.field3129 = 0;
            if (this.field3122.field1672 == 0 && arg8 != null && arg8 instanceof class138) {
                class138 var10 = (class138) arg8;
                if (this.field3122 == var10.field3122) {
                    this.field3120 = var10.field3120;
                    this.field3129 = var10.field3129;
                    return;
                }
            }
            if (arg7 && this.field3122.field1682 != -1) {
                this.field3129 = (int) ((double) this.field3122.field1651.length * Math.random());
                this.field3120 -= (int) ((double) this.field3122.field1680[this.field3129] * Math.random());
                return;
            }
        }
    }
}
