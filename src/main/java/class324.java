import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class324 {

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "Ljava/lang/String;")
    private String field4850 = "null";

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "[I")
    public static int[] field4859 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "Loe;")
    public static class127 field4856 = new class127(77, 3);

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "C")
    public char field4851;

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "C")
    public char field4861;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "I")
    private int field4854;

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!kp", name = "o", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!kp", name = "p", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!kp", name = "q", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!kp", name = "r", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!kp", name = "t", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!kp", name = "m", descriptor = "Lke;")
    public class407 field4862;

    @OriginalMember(owner = "client!kp", name = "n", descriptor = "Lke;")
    private class407 field4863;

    @OriginalMember(owner = "client!kp", name = "s", descriptor = "Llt;")
    public static class458 field4868;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IB)I")
    public final int method2019(int arg0, byte arg1) {
        if (arg1 < 102) {
            return 107;
        }
        field4867++;
        if (this.field4862 == null) {
            return this.field4854;
        } else {
            class361 var3 = (class361) this.field4862.method2409(false, (long) arg0);
            return var3 == null ? this.field4854 : var3.field5334;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
    public static void method2020(int arg0) {
        if (arg0 != -10485) {
            field4856 = null;
        }
        field4856 = null;
        field4859 = null;
        field4868 = null;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lqq;III)V")
    public static final void method2021(class318 arg0, int arg1, int arg2, int arg3) {
        field4855++;
        if (arg2 < 0 || arg3 < 0 || class105.field1842 == 0 || class222.field3438 == 0) {
            return;
        }
        arg0.method1931(class106.field1864, class121.field2014, class105.field1842, class222.field3438);
        arg0.method1982(class313.field4740, class158.field2492, class105.field1842, class222.field3438);
        class496 var4 = arg0.method1925();
        var4.method192(class1.field4, class343.field5106, class321.field4832, class394.field5747, class367.field5394, class251.field3840);
        arg0.method1921(var4);
        if (class201.field3195 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg0.method1955();
            int var8 = (arg2 - class106.field1864) * var7 / class105.field1842;
            int var9 = (arg3 - class121.field2014) * var7 / class222.field3438;
            int var10 = arg0.method1890();
            int var11 = (arg2 - class106.field1864) * var10 / class105.field1842;
            int var12 = (arg3 - class121.field2014) * var10 / class222.field3438;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method188(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method188(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 7;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 7;
                if (var20 > 0 && var22 > 0 && var20 < class150.field2422 && var22 < class21.field272) {
                    int var23 = class286.field4329.field3217;
                    if (var23 < 3 && (class146.field2369[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class201.field3195[var23].method314(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = (class286.field4329.method337(0) - 1 << 6) + var19 >> 7;
                        var6 = (class286.field4329.method337(0) - 1 << 6) + var21 >> 7;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class306.field4636 && (class331.field4966 & 0x40) != 0) {
                    class427 var24 = class59.method419(class142.field2311, 12782, class357.field5298);
                    if (var24 == null) {
                        class62.method432(false);
                    } else {
                        class221.method1345(" ->", 20, var6, var5, class217.field3347, true, class28.field357, -1, (byte) -121, 0L, false);
                    }
                } else {
                    if (class64.field1064 == class298.field4512) {
                        class221.method1345("", 11, var6, var5, -1, true, class156.field2463.method2473(class406.field5898, -110), -1, (byte) -121, 0L, false);
                    }
                    class221.method1345("", 13, var6, var5, class97.field1744, true, class14.field196, -1, (byte) -121, 0L, false);
                    class318.field4789++;
                }
            }
        }
        class215 var25 = class359.field5315;
        if (arg1 != -24190) {
            return;
        }
        for (class227 var26 = (class227) var25.method1319(-102); var26 != null; var26 = (class227) var25.method1320((byte) -104)) {
            if (class286.field4329.field3217 == var26.field3482 && var26.method1368(45, arg3, arg2, arg0)) {
                if (var26.field3475 instanceof class47) {
                    class47 var27 = (class47) var26.field3475;
                    int var28 = var27.method337(0);
                    if ((var28 & 0x1) == 0 && (var27.field3218 & 0x7F) == 0 && (var27.field3222 & 0x7F) == 0 || (var28 & 0x1) == 1 && (var27.field3218 & 0x7F) == 64 && (var27.field3222 & 0x7F) == 64) {
                        int var29 = var27.field3218 - (var27.method337(0) - 1 << 6);
                        int var30 = var27.field3222 - (var27.method337(arg1 + 24190) - 1 << 6);
                        for (int var31 = 0; var31 < class352.field5175; var31++) {
                            class249 var38 = class195.field3085[class437.field6440[var31]];
                            if (var38 != null && class369.field5424 != var38.field2222 && var38.field2177) {
                                int var39 = var38.field3218 - (var38.field3819.field3707 - 1 << 6);
                                int var40 = var38.field3222 - (var38.field3819.field3707 - 1 << 6);
                                if (var29 <= var39 && var38.field3819.field3707 <= (var27.method337(arg1 ^ 0xFFFFA182) - (var39 - var29 >> 7)) && var40 >= var30 && var38.field3819.field3707 <= (var27.method337(0) - (var40 - var30 >> 7))) {
                                    class30.method159(var38, class286.field4329.field3217 != var26.field3482, (byte) 104);
                                    var38.field2222 = class369.field5424;
                                }
                            }
                        }
                        int var32 = class328.field4921;
                        int[] var33 = class280.field4247;
                        for (int var34 = 0; var34 < var32; var34++) {
                            class47 var35 = class224.field3450[var33[var34]];
                            if (var35 != null && class369.field5424 != var35.field2222 && var27 != var35 && var35.field2177) {
                                int var36 = var35.field3218 - (var35.method337(0) - 1 << 6);
                                int var37 = var35.field3222 - (var35.method337(arg1 + 24190) - 1 << 6);
                                if (var29 <= var36 && var35.method337(0) <= (var27.method337(0) - (var36 - var29 >> 7)) && var37 >= var30 && var35.method337(0) <= (var27.method337(arg1 ^ 0xFFFFA182) - (var37 - var30 >> 7))) {
                                    class28.method140(0, class286.field4329.field3217 != var26.field3482, var35);
                                    var35.field2222 = class369.field5424;
                                }
                            }
                        }
                    }
                    if (class369.field5424 == var27.field2222) {
                        continue;
                    }
                    class28.method140(0, class286.field4329.field3217 != var26.field3482, var27);
                    var27.field2222 = class369.field5424;
                }
                if (var26.field3475 instanceof class249) {
                    class249 var41 = (class249) var26.field3475;
                    if (var41.field3819 != null) {
                        if ((var41.field3819.field3707 & 0x1) == 0 && (var41.field3218 & 0x7F) == 0 && (var41.field3222 & 0x7F) == 0 || (var41.field3819.field3707 & 0x1) == 1 && (var41.field3218 & 0x7F) == 64 && (var41.field3222 & 0x7F) == 64) {
                            int var42 = var41.field3218 - (var41.field3819.field3707 - 1 << 6);
                            int var43 = var41.field3222 - (var41.field3819.field3707 - 1 << 6);
                            for (int var44 = 0; var44 < class352.field5175; var44++) {
                                class249 var51 = class195.field3085[class437.field6440[var44]];
                                if (var51 != null && class369.field5424 != var51.field2222 && var41 != var51 && var51.field2177) {
                                    int var52 = var51.field3218 - (var51.field3819.field3707 - 1 << 6);
                                    int var53 = var51.field3222 - (var51.field3819.field3707 - 1 << 6);
                                    if (var52 >= var42 && var51.field3819.field3707 <= (var41.field3819.field3707 - (var52 - var42 >> 7)) && var43 <= var53 && var51.field3819.field3707 <= (var41.field3819.field3707 - (var53 - var43 >> 7))) {
                                        class30.method159(var51, class286.field4329.field3217 != var26.field3482, (byte) 99);
                                        var51.field2222 = class369.field5424;
                                    }
                                }
                            }
                            int var45 = class328.field4921;
                            int[] var46 = class280.field4247;
                            for (int var47 = 0; var47 < var45; var47++) {
                                class47 var48 = class224.field3450[var46[var47]];
                                if (var48 != null && class369.field5424 != var48.field2222 && var48.field2177) {
                                    int var49 = var48.field3218 - (var48.method337(0) - 1 << 6);
                                    int var50 = var48.field3222 - (var48.method337(0) - 1 << 6);
                                    if (var49 >= var42 && var48.method337(0) <= var41.field3819.field3707 - (var49 - var42 >> 7) && var43 <= var50 && var48.method337(0) <= (var41.field3819.field3707 - (var50 - var43 >> 7))) {
                                        class28.method140(0, class286.field4329.field3217 != var26.field3482, var48);
                                        var48.field2222 = class369.field5424;
                                    }
                                }
                            }
                        }
                        if (class369.field5424 == var41.field2222) {
                            continue;
                        }
                        class30.method159(var41, class286.field4329.field3217 != var26.field3482, (byte) 115);
                        var41.field2222 = class369.field5424;
                    }
                }
                if (var26.field3475 instanceof class377) {
                    class163 var54 = (class163) class252.field3845.method2409(false, (long) (var26.field3483 | var26.field3480 << 14 | var26.field3482 << 28));
                    if (var54 != null) {
                        for (class1 var55 = (class1) var54.field2536.method9((byte) -87); var55 != null; var55 = (class1) var54.field2536.method10(2)) {
                            class182 var56 = class288.field4362.method3030((byte) 81, var55.field1);
                            if (!class306.field4636) {
                                if (class286.field4329.field3217 == var26.field3482) {
                                    String[] var57 = var56.field2876;
                                    for (int var58 = 4; var58 >= 0; var58--) {
                                        if (var57 != null && var57[var58] != null) {
                                            byte var59 = 0;
                                            int var60 = class76.field1372;
                                            if (var58 == 0) {
                                                var59 = 17;
                                            }
                                            if (var58 == 1) {
                                                var59 = 4;
                                            }
                                            if (var58 == 2) {
                                                var59 = 9;
                                            }
                                            if (var58 == 3) {
                                                var59 = 60;
                                            }
                                            if (var58 == 4) {
                                                var59 = 51;
                                            }
                                            if (var56.field2897 == var58) {
                                                var60 = var56.field2865;
                                            }
                                            if (var56.field2898 == var58) {
                                                var60 = var56.field2837;
                                            }
                                            class221.method1345("<col=ff9040>" + var56.field2829, var59, var26.field3480, var26.field3483, var60, true, var57[var58], -1, (byte) -121, (long) var55.field1, false);
                                            class494.field7522++;
                                        }
                                    }
                                }
                                class58.field986++;
                                class221.method1345("<col=ff9040>" + var56.field2829, 1008, var26.field3480, var26.field3483, class286.field4324, true, class478.field7306.method2473(class406.field5898, -85), -1, (byte) -121, (long) var55.field1, class286.field4329.field3217 != var26.field3482);
                            } else if (class286.field4329.field3217 == var26.field3482) {
                                class85 var61 = class392.field5739 == -1 ? null : class76.field1364.method1267((byte) 41, class392.field5739);
                                if ((class331.field4966 & 0x1) != 0 && (var61 == null || var56.method1136(12604, class392.field5739, var61.field1423) != var61.field1423)) {
                                    class221.method1345(class200.field3175 + " -> <col=ff9040>" + var56.field2829, 57, var26.field3480, var26.field3483, class217.field3347, true, class28.field357, -1, (byte) -121, (long) var55.field1, false);
                                    class161.field2527++;
                                }
                            }
                        }
                    }
                }
                if (var26.field3475 instanceof class185) {
                    class185 var62 = (class185) var26.field3475;
                    class56 var63 = class128.field2070.method916((byte) -15, var62.method174((byte) 123));
                    if (var63.field892 != null) {
                        var63 = var63.method393(class273.field4144, (byte) -127);
                    }
                    if (var63 != null) {
                        if (!class306.field4636) {
                            if (class286.field4329.field3217 == var26.field3482) {
                                String[] var65 = var63.field920;
                                if (var65 != null) {
                                    for (int var66 = 4; var66 >= 0; var66--) {
                                        if (var65[var66] != null) {
                                            short var67 = 0;
                                            if (var66 == 0) {
                                                var67 = 12;
                                            }
                                            int var68 = class76.field1372;
                                            if (var66 == 1) {
                                                var67 = 49;
                                            }
                                            if (var66 == 2) {
                                                var67 = 23;
                                            }
                                            if (var66 == 3) {
                                                var67 = 46;
                                            }
                                            if (var63.field945 == var66) {
                                                var68 = var63.field897;
                                            }
                                            if (var66 == 4) {
                                                var67 = 1006;
                                            }
                                            if (var63.field957 == var66) {
                                                var68 = var63.field913;
                                            }
                                            class221.method1345("<col=00ffff>" + var63.field909, var67, var26.field3480, var26.field3483, var68, true, var65[var66], -1, (byte) -121, class439.method2560(var62, var26.field3480, (byte) 22, var26.field3483), false);
                                            class374.field5458++;
                                        }
                                    }
                                }
                            }
                            class150.field2414++;
                            class221.method1345("<col=00ffff>" + var63.field909, 1009, var26.field3480, var26.field3483, class286.field4324, true, class478.field7306.method2473(class406.field5898, -90), -1, (byte) -121, (long) var63.field958, class286.field4329.field3217 != var26.field3482);
                        } else if (class286.field4329.field3217 == var26.field3482) {
                            class85 var64 = class392.field5739 == -1 ? null : class76.field1364.method1267((byte) 41, class392.field5739);
                            if ((class331.field4966 & 0x4) != 0 && (var64 == null || var63.method398(class392.field5739, true, var64.field1423) != var64.field1423)) {
                                class365.field5366++;
                                class221.method1345(class200.field3175 + " -> <col=00ffff>" + var63.field909, 50, var26.field3480, var26.field3483, class217.field3347, true, class28.field357, -1, (byte) -121, class439.method2560(var62, var26.field3480, (byte) 85, var26.field3483), false);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILha;)V")
    public final void method2022(int arg0, class40 arg1) {
        while (true) {
            int var3 = arg1.method257((byte) 83);
            if (var3 == 0) {
                if (arg0 >= -45) {
                    this.method2022(-125, null);
                }
                field4864++;
                return;
            }
            this.method2025(arg1, var3, -4);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)Z")
    public final boolean method2023(int arg0, int arg1) {
        if (arg0 < 18) {
            this.method2022(7, null);
        }
        field4865++;
        if (this.field4862 == null) {
            return false;
        }
        if (this.field4863 == null) {
            this.method2026((byte) -50);
        }
        class361 var3 = (class361) this.field4863.method2409(false, (long) arg1);
        return var3 != null;
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(II)Ljava/lang/String;")
    public final String method2024(int arg0, int arg1) {
        field4857++;
        if (arg1 != 17769) {
            return null;
        } else if (this.field4862 == null) {
            return this.field4850;
        } else {
            class65 var3 = (class65) this.field4862.method2409(false, (long) arg0);
            return var3 == null ? this.field4850 : var3.field1073;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lha;II)V")
    private final void method2025(class40 arg0, int arg1, int arg2) {
        if (arg2 != -4) {
            this.method2026((byte) 45);
        }
        field4858++;
        if (arg1 == 1) {
            this.field4851 = class349.method2126(-65, arg0.method262(arg2 + 2));
        } else if (arg1 == 2) {
            this.field4861 = class349.method2126(-89, arg0.method262(-2));
        } else if (arg1 == 3) {
            this.field4850 = arg0.method239(true);
        } else if (arg1 == 4) {
            this.field4854 = arg0.method255((byte) 96);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method254((byte) -126);
            this.field4862 = new class407(class99.method749(var4, arg2 - 23862));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method255((byte) 96);
                class179 var7;
                if (arg1 == 5) {
                    var7 = new class65(arg0.method239(true));
                } else {
                    var7 = new class361(arg0.method255((byte) 96));
                }
                this.field4862.method2413((long) var6, -1, var7);
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V")
    private final void method2026(byte arg0) {
        field4860++;
        this.field4863 = new class407(this.field4862.method2407(0));
        if (arg0 == -50) {
            for (class361 var2 = (class361) this.field4862.method2415((byte) 101); var2 != null; var2 = (class361) this.field4862.method2416((byte) -122)) {
                class361 var3 = new class361((int) var2.field2798);
                this.field4863.method2413((long) var2.field5334, arg0 + 49, var3);
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method2027(String arg0, int arg1) {
        field4853++;
        if (this.field4862 == null) {
            return false;
        }
        if (this.field4863 == null) {
            this.method2029(0);
        }
        class370 var3 = (class370) this.field4863.method2409(false, class487.method2926(-1431961407, arg0));
        if (arg1 <= 12) {
            this.field4862 = null;
        }
        while (var3 != null) {
            if (var3.field5432.equals(arg0)) {
                return true;
            }
            var3 = (class370) this.field4863.method2410((byte) 79);
        }
        return false;
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)V")
    public static final void method2028(int arg0) {
        field4852++;
        if (class41.field601 == 0 || arg0 < 45) {
            return;
        }
        try {
            if ((++class91.field1642) > 1500) {
                if (class163.field2534 != null) {
                    class163.field2534.method1795((byte) 123);
                    class163.field2534 = null;
                }
                if (class246.field3760 >= 1) {
                    class41.field601 = 0;
                    class211.field3282 = -5;
                    return;
                }
                class91.field1642 = 0;
                if (class377.field5507 == class331.field4965) {
                    class331.field4965 = class135.field2155;
                } else {
                    class331.field4965 = class377.field5507;
                }
                class246.field3760++;
                class41.field601 = 1;
            }
            if (class41.field601 == 1) {
                class103.field1831 = class7.field86.method1583(class167.field2592, class331.field4965, (byte) -124);
                class41.field601 = 2;
            }
            if (class41.field601 == 2) {
                if (class103.field1831.field2802 == 2) {
                    throw new IOException();
                }
                if (class103.field1831.field2802 != 1) {
                    return;
                }
                class163.field2534 = new class295((Socket) class103.field1831.field2803, class7.field86);
                class103.field1831 = null;
                class163.field2534.method1787(class230.field3508.field536, 0, 4900, class230.field3508.field585);
                class111.method797(0);
                int var1 = class163.field2534.method1792(0);
                class111.method797(0);
                if (var1 != 101) {
                    class41.field601 = 0;
                    class211.field3282 = var1;
                    class163.field2534.method1795((byte) 122);
                    class163.field2534 = null;
                    return;
                }
                class41.field601 = 3;
            }
            if (class41.field601 == 3 && class163.field2534.method1789(27683) >= 2) {
                int var2 = class163.field2534.method1792(0) << 8 | class163.field2534.method1792(0);
                class194.method1210((byte) -108, var2);
                if (class167.field2593 == -1) {
                    class211.field3282 = 6;
                    class41.field601 = 0;
                    class163.field2534.method1795((byte) 123);
                    class163.field2534 = null;
                } else {
                    class41.field601 = 0;
                    class163.field2534.method1795((byte) 123);
                    class163.field2534 = null;
                    class99.method747(-90);
                }
            }
        } catch (IOException var3) {
            if (class163.field2534 != null) {
                class163.field2534.method1795((byte) 126);
                class163.field2534 = null;
            }
            if (class246.field3760 >= 1) {
                class211.field3282 = -4;
                class41.field601 = 0;
            } else {
                if (class377.field5507 == class331.field4965) {
                    class331.field4965 = class135.field2155;
                } else {
                    class331.field4965 = class377.field5507;
                }
                class91.field1642 = 0;
                class41.field601 = 1;
                class246.field3760++;
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "(I)V")
    private final void method2029(int arg0) {
        this.field4863 = new class407(this.field4862.method2407(arg0));
        field4866++;
        for (class65 var2 = (class65) this.field4862.method2415((byte) -99); var2 != null; var2 = (class65) this.field4862.method2416((byte) -121)) {
            class370 var3 = new class370(var2.field1073, (int) var2.field2798);
            this.field4863.method2413(class487.method2926(arg0 ^ 0xAAA600C1, var2.field1073), -1, var3);
        }
    }
}
