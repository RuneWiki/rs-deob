import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class224 extends class279 {

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "Ljava/lang/String;")
    private String field3548 = "null";

    @OriginalMember(owner = "client!ek", name = "A", descriptor = "I")
    public static int field3539 = 0;

    @OriginalMember(owner = "client!ek", name = "G", descriptor = "Ljava/lang/String;")
    public static String field3545 = "Loaded config";

    @OriginalMember(owner = "client!ek", name = "L", descriptor = "I")
    public static int field3549 = 0;

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "Lok;")
    public static class107 field3536 = new class107();

    @OriginalMember(owner = "client!ek", name = "R", descriptor = "Lkb;")
    public static class315 field3555 = new class315();

    @OriginalMember(owner = "client!ek", name = "V", descriptor = "Lcd;")
    public static class136 field3559 = null;

    @OriginalMember(owner = "client!ek", name = "W", descriptor = "[Ljava/lang/String;")
    public static String[] field3560 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "C")
    public char field3533;

    @OriginalMember(owner = "client!ek", name = "T", descriptor = "C")
    public char field3557;

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "I")
    private int field3535;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!ek", name = "B", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!ek", name = "C", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!ek", name = "H", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!ek", name = "I", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!ek", name = "M", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!ek", name = "N", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!ek", name = "O", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!ek", name = "P", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!ek", name = "Q", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!ek", name = "D", descriptor = "Lqf;")
    private class311 field3542;

    @OriginalMember(owner = "client!ek", name = "E", descriptor = "Lqf;")
    public class311 field3543;

    @OriginalMember(owner = "client!ek", name = "S", descriptor = "[I")
    public static int[] field3556;

    @OriginalMember(owner = "client!ek", name = "U", descriptor = "[Lcd;")
    public static class136[] field3558;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILvl;B)V", line = 9)
    public static final void method1634(int arg0, class6 arg1, byte arg2) {
        if (class2.field23 != null) {
            try {
                class2.field23.method268(0L, 128);
                class2.field23.method266(-32050, 24, arg0, arg1.field115);
            } catch (Exception var4) {
            }
        }
        field3552++;
        if (arg2 >= -31) {
            field3536 = (class107) null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILvl;I)V", line = 29)
    private final void method1635(int arg0, class6 arg1, int arg2) {
        if (arg0 != 23884) {
            field3558 = (class136[]) null;
        }
        if (arg2 == 1) {
            this.field3557 = class319.method2242(arg1.method83((byte) -96), (byte) -17);
        } else if (arg2 == 2) {
            this.field3533 = class319.method2242(arg1.method83((byte) -87), (byte) -17);
        } else if (arg2 == 3) {
            this.field3548 = arg1.method40(false);
        } else if (arg2 == 4) {
            this.field3535 = arg1.method73((byte) 19);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg1.method39((byte) 123);
            this.field3543 = new class311(class215.method1568(arg0 + 479142613, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method73((byte) 19);
                class287 var7;
                if (arg2 == 5) {
                    var7 = new class215(arg1.method40(false));
                } else {
                    var7 = new class233(arg1.method73((byte) 19));
                }
                this.field3543.method2161(var7, (long) var6, -1);
            }
        }
        field3544++;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILvl;)V", line = 87)
    public final void method1636(int arg0, class6 arg1) {
        field3553++;
        if (arg0 < 81) {
            this.method1640(-47);
        }
        while (true) {
            int var3 = arg1.method58(-288140008);
            if (var3 == 0) {
                return;
            }
            this.method1635(23884, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 109)
    public final boolean method1637(int arg0, String arg1) {
        field3551++;
        if (this.field3543 == null) {
            return false;
        }
        if (this.field3542 == null) {
            this.method1647(arg0 ^ 0xFFFFF880);
        }
        for (class255 var3 = (class255) this.field3542.method2168(class193.method1429(arg1, arg0 - 46271), (byte) -118); var3 != null; var3 = (class255) this.field3542.method2170(-1)) {
            if (var3.field4034.equals(arg1)) {
                return true;
            }
        }
        if (arg0 == 16901) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIIII)V", line = 139)
    public static final void method1638(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3541++;
        if (class244.field3811 == 0) {
            int var7 = class11.field206;
            int var8 = class259.field4074;
            int var9 = class306.field4781;
            int var10 = class249.field3925;
            int var11 = (arg1 - arg3) * (var10 - var9) / arg2 + var9;
            int var12 = (arg0 - arg5) * (var8 - var7) / arg4 + var7;
            if (class56.field783 && (class301.field4631 & 0x40) != 0) {
                class136 var13 = class294.method2048((byte) 115, class51.field646, class63.field920);
                if (var13 == null) {
                    class29.method264(-1);
                } else {
                    class342.method2368(" ->", class133.field1957, var12, (byte) -68, class33.field488, (short) 6, 0L, var11);
                }
            } else {
                class141.field2231++;
                if (class27.field409 == 1) {
                    class342.method2368("", class185.field3002, var12, (byte) -68, -1, (short) 34, 0L, var11);
                }
                class342.method2368("", class61.field895, var12, (byte) -68, -1, (short) 21, 0L, var11);
            }
        }
        long var14 = -1L;
        int var16 = 48 % ((36 - arg6) / 55);
        for (int var17 = 0; var17 < class193.field3072; var17++) {
            long var18 = class263.field4113[var17];
            int var20 = (int) var18 >> 7 & 0x7F;
            int var21 = (int) var18 & 0x7F;
            int var22 = (int) (var18 >>> 32) & Integer.MAX_VALUE;
            int var23 = ((int) var18 & 0x7CD01D00) >> 29;
            if (var14 != var18) {
                var14 = var18;
                if (var23 == 2 && class261.method1873(class154.field2392, var21, var20, var18)) {
                    class121 var24 = class249.method1790(37, var22);
                    if (var24.field1690 != null) {
                        var24 = var24.method878((byte) 80);
                    }
                    if (var24 == null) {
                        continue;
                    }
                    if (class244.field3811 == 1) {
                        class81.field1105++;
                        class342.method2368(class78.field1054 + " -> <col=00ffff>" + var24.field1719, class24.field366, var21, (byte) -68, class3.field32, (short) 45, var18, var20);
                    } else if (class56.field783) {
                        class58 var29 = class171.field2825 == -1 ? null : class246.method1769(class171.field2825, (byte) -123);
                        if ((class301.field4631 & 0x4) != 0 && (var29 == null || var24.method866((byte) 66, class171.field2825, var29.field826) != var29.field826)) {
                            class342.method2368(class249.field3931 + " -> <col=00ffff>" + var24.field1719, class133.field1957, var21, (byte) -68, class33.field488, (short) 25, var18, var20);
                            class141.field2241++;
                        }
                    } else {
                        class146.field2304++;
                        String[] var25 = var24.field1754;
                        if (class150.field2345) {
                            var25 = class251.method1798(false, var25);
                        }
                        if (var25 != null) {
                            for (int var26 = 4; var26 >= 0; var26--) {
                                if (var25[var26] != null) {
                                    short var27 = 0;
                                    int var28 = -1;
                                    class65.field933++;
                                    if (var24.field1712 == var26) {
                                        var28 = var24.field1720;
                                    }
                                    if (var24.field1746 == var26) {
                                        var28 = var24.field1686;
                                    }
                                    if (var26 == 0) {
                                        var27 = 32;
                                    }
                                    if (var26 == 1) {
                                        var27 = 47;
                                    }
                                    if (var26 == 2) {
                                        var27 = 22;
                                    }
                                    if (var26 == 3) {
                                        var27 = 44;
                                    }
                                    if (var26 == 4) {
                                        var27 = 1003;
                                    }
                                    class342.method2368("<col=00ffff>" + var24.field1719, var25[var26], var21, (byte) -68, var28, var27, var18, var20);
                                }
                            }
                        }
                        class342.method2368("<col=00ffff>" + var24.field1719, class328.field5145, var21, (byte) -68, class123.field1767, (short) 1001, (long) var24.field1705, var20);
                    }
                }
                if (var23 == 1) {
                    class212 var30 = class59.field870[var22];
                    if ((var30.field3346.field2555 & 0x1) == 0 && (var30.field4698 & 0x7F) == 0 && (var30.field4731 & 0x7F) == 0 || (var30.field3346.field2555 & 0x1) == 1 && (var30.field4698 & 0x7F) == 64 && (var30.field4731 & 0x7F) == 64) {
                        int var31 = var30.field4698 - ((var30.field3346.field2555 - 1) * 64);
                        int var32 = -(var30.field3346.field2555 * 64) - (-var30.field4731 - 64);
                        for (int var33 = 0; var33 < class79.field1083; var33++) {
                            class212 var34 = class59.field870[class85.field1157[var33]];
                            if (var34 != null && !var34.field4717 && var30 != var34 && var34.field4659) {
                                int var35 = var34.field4698 - ((var34.field3346.field2555 - 1) * 64);
                                int var36 = var34.field4731 + 64 - (var34.field3346.field2555 * 64);
                                if (var31 <= var35 && var34.field3346.field2555 <= var30.field3346.field2555 - (var35 - var31 >> 7) && var36 >= var32 && (var30.field3346.field2555 - (var36 - var32 >> 7)) >= var34.field3346.field2555) {
                                    class192.method1419(var21, 30, var20, class85.field1157[var33], var34.field3346);
                                    var34.field4717 = true;
                                }
                            }
                        }
                        for (int var37 = 0; var37 < class232.field3631; var37++) {
                            class337 var38 = class284.field4403[class81.field1116[var37]];
                            if (var38 != null && !var38.field4717 && var38.field4659) {
                                int var39 = var38.field4698 - ((var38.method2099((byte) 123) - 1) * 64);
                                int var40 = var38.field4731 + 64 - var38.method2099((byte) 123) * 64;
                                if (var39 >= var31 && var38.method2099((byte) 123) <= var30.field3346.field2555 - (var39 - var31 >> 7) && var40 >= var32 && var38.method2099((byte) 123) <= (var30.field3346.field2555 - (var40 - var32 >> 7))) {
                                    class276.method1939(var38, (byte) -123, var20, class81.field1116[var37], var21);
                                    var38.field4717 = true;
                                }
                            }
                        }
                    }
                    if (var30.field4717) {
                        continue;
                    }
                    class192.method1419(var21, 30, var20, var22, var30.field3346);
                    var30.field4717 = true;
                }
                if (var23 == 0) {
                    class337 var41 = class284.field4403[var22];
                    if ((var41.field4698 & 0x7F) == 64 && (var41.field4731 & 0x7F) == 64) {
                        int var42 = var41.field4698 - ((var41.method2099((byte) 123) - 1) * 64);
                        int var43 = var41.field4731 - (var41.method2099((byte) 123) - 1) * 64;
                        for (int var44 = 0; var44 < class79.field1083; var44++) {
                            class212 var45 = class59.field870[class85.field1157[var44]];
                            if (var45 != null && !var45.field4717 && var45.field4659) {
                                int var46 = var45.field4698 - ((var45.field3346.field2555 - 1) * 64);
                                int var47 = var45.field4731 - ((var45.field3346.field2555 - 1) * 64);
                                if (var42 <= var46 && var45.field3346.field2555 <= (var41.method2099((byte) 123) - (var46 - var42 >> 7)) && var47 >= var43 && var45.field3346.field2555 <= (var41.method2099((byte) 123) - (var47 - var43 >> 7))) {
                                    class192.method1419(var21, 30, var20, class85.field1157[var44], var45.field3346);
                                    var45.field4717 = true;
                                }
                            }
                        }
                        for (int var48 = 0; var48 < class232.field3631; var48++) {
                            class337 var49 = class284.field4403[class81.field1116[var48]];
                            if (var49 != null && !var49.field4717 && var41 != var49 && var49.field4659) {
                                int var50 = var49.field4698 - (var49.method2099((byte) 123) * 64 - 64);
                                int var51 = var49.field4731 - ((var49.method2099((byte) 123) - 1) * 64);
                                if (var42 <= var50 && var49.method2099((byte) 123) <= var41.method2099((byte) 123) - (var50 - var42 >> 7) && var51 >= var43 && var49.method2099((byte) 123) <= var41.method2099((byte) 123) - (var51 - var43 >> 7)) {
                                    class276.method1939(var49, (byte) -106, var20, class81.field1116[var48], var21);
                                    var49.field4717 = true;
                                }
                            }
                        }
                    }
                    if (var41.field4717) {
                        continue;
                    }
                    class276.method1939(var41, (byte) -126, var20, var22, var21);
                    var41.field4717 = true;
                }
                if (var23 == 3) {
                    class5 var52 = class304.field4750[class154.field2392][var21][var20];
                    if (var52 != null) {
                        for (class132 var53 = (class132) var52.method21(true); var53 != null; var53 = (class132) var52.method23(true)) {
                            int var54 = var53.field1947.field1097;
                            class316 var55 = class149.method1092((byte) -104, var54);
                            if (class244.field3811 == 1) {
                                class141.field2237++;
                                class342.method2368(class78.field1054 + " -> <col=ff9040>" + var55.field4988, class24.field366, var21, (byte) -68, class3.field32, (short) 5, (long) var54, var20);
                            } else if (class56.field783) {
                                class58 var60 = class171.field2825 == -1 ? null : class246.method1769(class171.field2825, (byte) -116);
                                if ((class301.field4631 & 0x1) != 0 && (var60 == null || var55.method2214(var60.field826, class171.field2825, -117) != var60.field826)) {
                                    class232.field3612++;
                                    class342.method2368(class249.field3931 + " -> <col=ff9040>" + var55.field4988, class133.field1957, var21, (byte) -68, class33.field488, (short) 9, (long) var54, var20);
                                }
                            } else {
                                class193.field3067++;
                                String[] var56 = var55.field4969;
                                if (class150.field2345) {
                                    var56 = class251.method1798(false, var56);
                                }
                                for (int var57 = 4; var57 >= 0; var57--) {
                                    if (var56 != null && var56[var57] != null) {
                                        class69.field966++;
                                        byte var58 = 0;
                                        int var59 = -1;
                                        if (var55.field4987 == var57) {
                                            var59 = var55.field4979;
                                        }
                                        if (var57 == 0) {
                                            var58 = 41;
                                        }
                                        if (var55.field4966 == var57) {
                                            var59 = var55.field4975;
                                        }
                                        if (var57 == 1) {
                                            var58 = 7;
                                        }
                                        if (var57 == 2) {
                                            var58 = 10;
                                        }
                                        if (var57 == 3) {
                                            var58 = 15;
                                        }
                                        if (var57 == 4) {
                                            var58 = 8;
                                        }
                                        class342.method2368("<col=ff9040>" + var55.field4988, var56[var57], var21, (byte) -68, var59, var58, (long) var54, var20);
                                    }
                                }
                                class342.method2368("<col=ff9040>" + var55.field4988, class328.field5145, var21, (byte) -68, class123.field1767, (short) 1004, (long) var54, var20);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BILh;)V", line = 538)
    public static final void method1639(byte arg0, int arg1, class303 arg2) {
        if (arg0 < 63) {
            return;
        }
        field3534++;
        if (arg2.field4658 > class229.field3595) {
            class265.method1897(arg2, 0);
        } else if (class229.field3595 <= arg2.field4722) {
            class161.method1202(arg2, -123);
        } else {
            class132.method975(arg2, 128);
        }
        if (arg2.field4698 < 128 || arg2.field4731 < 128 || arg2.field4698 >= 13184 || arg2.field4731 >= 13184) {
            arg2.field4703 = -1;
            arg2.field4653 = -1;
            arg2.field4722 = 0;
            arg2.field4658 = 0;
            arg2.field4698 = arg2.field4708[0] * 128 + (arg2.method2099((byte) 123) * 64);
            arg2.field4731 = arg2.field4675[0] * 128 + arg2.method2099((byte) 123) * 64;
            arg2.method2101(-12184);
        }
        if (class146.field2310 == arg2 && (arg2.field4698 < 1536 || arg2.field4731 < 1536 || arg2.field4698 >= 11776 || arg2.field4731 >= 11776)) {
            arg2.field4722 = 0;
            arg2.field4658 = 0;
            arg2.field4653 = -1;
            arg2.field4703 = -1;
            arg2.field4698 = arg2.field4708[0] * 128 + (arg2.method2099((byte) 123) * 64);
            arg2.field4731 = arg2.field4675[0] * 128 + arg2.method2099((byte) 123) * 64;
            arg2.method2101(-12184);
        }
        class274.method1926(arg2, (byte) -62);
        class212.method1543(arg2, (byte) 67);
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(I)V", line = 586)
    private final void method1640(int arg0) {
        this.field3542 = new class311(this.field3543.method2171(arg0 ^ 0x10AE));
        for (class233 var2 = (class233) this.field3543.method2174(256); var2 != null; var2 = (class233) this.field3543.method2164((byte) 104)) {
            class233 var3 = new class233((int) var2.field4430);
            this.field3542.method2161(var3, (long) var2.field3633, -1);
        }
        if (arg0 != -16020) {
            field3555 = (class315) null;
        }
        field3550++;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BI)I", line = 610)
    public final int method1641(byte arg0, int arg1) {
        field3537++;
        if (this.field3543 == null) {
            return this.field3535;
        }
        class233 var3 = (class233) this.field3543.method2168((long) arg1, (byte) -116);
        if (arg0 <= 4) {
            field3558 = (class136[]) null;
        }
        return var3 == null ? this.field3535 : var3.field3633;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)Ljava/lang/String;", line = 642)
    public final String method1642(int arg0, int arg1) {
        if (arg0 != 64) {
            field3536 = (class107) null;
        }
        field3554++;
        if (this.field3543 == null) {
            return this.field3548;
        } else {
            class215 var3 = (class215) this.field3543.method2168((long) arg1, (byte) -103);
            return var3 == null ? this.field3548 : var3.field3386;
        }
    }

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)V", line = 663)
    public static void method1643(int arg0) {
        field3536 = null;
        if (arg0 >= -26) {
            field3545 = (String) null;
        }
        field3545 = null;
        field3556 = null;
        field3560 = null;
        field3558 = null;
        field3555 = null;
        field3559 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZ)Z", line = 680)
    public final boolean method1644(int arg0, boolean arg1) {
        field3538++;
        if (this.field3543 == null) {
            return false;
        }
        if (this.field3542 == null) {
            this.method1640(-16020);
        }
        class233 var3 = (class233) this.field3542.method2168((long) arg0, (byte) -89);
        if (var3 == null) {
            return false;
        } else {
            if (!arg1) {
                this.method1636(-44, (class6) null);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 703)
    public static final void method1645(int arg0, String arg1, int arg2) {
        class284.field4395++;
        class183.field2965.method1947((byte) 89, 45);
        class183.field2965.method80(arg2, 5);
        class183.field2965.method35(class83.method608(arg1, (byte) -119), arg0 ^ 0x3205);
        if (arg0 == -12878) {
            field3547++;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILcd;III)V", line = 726)
    public static final void method1646(int arg0, class136 arg1, int arg2, int arg3, int arg4) {
        field3540++;
        class50.method373((byte) 99);
        if (arg0 != 6175) {
            field3536 = (class107) null;
        }
        if (class109.field1458) {
            class122.method885(arg2, arg3, arg2 + arg1.field2137, arg1.field2078 + arg3);
        } else {
            class280.method1978(arg2, arg3, arg2 + arg1.field2137, arg3 - -arg1.field2078);
        }
        if (class274.field4236 != 2 && class274.field4236 != 5 && class119.field1663 != null) {
            int var5 = (int) class45.field604 + class220.field3483 & 0x7FF;
            int var6 = class146.field2310.field4698 / 32 + 48;
            int var7 = 464 - (class146.field2310.field4731 / 32);
            if (class109.field1458) {
                ((class239) class119.field1663).method1704(arg2, arg3, arg1.field2137, arg1.field2078, var6, var7, var5, class293.field4541 + 256, (class239) arg1.method998(false, true));
            } else {
                ((class190) class119.field1663).method1372(arg2, arg3, arg1.field2137, arg1.field2078, var6, var7, var5, class293.field4541 + 256, arg1.field2084, arg1.field2027);
            }
            if (class84.field1151 != null) {
                for (int var8 = 0; var8 < class84.field1151.field4244; var8++) {
                    if (class84.field1151.method1935(var8, arg0 - 6176)) {
                        int var9 = ((class84.field1151.field4249[var8] >> 14 & 0x3FFF) - class326.field5108) * 4 + 2 - (class146.field2310.field4698 / 32);
                        int var10 = ((class84.field1151.field4249[var8] & 0x3FFF) - class198.field3168) * 4 + 2 - (class146.field2310.field4731 / 32);
                        int var11 = class31.field467[var5];
                        int var12 = class31.field451[var5];
                        int var13 = var11 * 256 / (class293.field4541 + 256);
                        int var14 = var12 * 256 / (class293.field4541 + 256);
                        int var15 = var10 * var13 + (var9 * var14) >> 16;
                        class321 var16 = class29.field430;
                        int var17 = var10 * var14 - var9 * var13 >> 16;
                        if (class84.field1151.method1934(false, var8) == 1) {
                            var16 = class102.field1355;
                        }
                        if (class84.field1151.method1934(false, var8) == 2) {
                            var16 = class270.field4197;
                        }
                        int var18 = var16.method2270(class84.field1151.field4246[var8], 100);
                        int var19 = var15 - var18 / 2;
                        if (-arg1.field2137 <= var19 && arg1.field2137 >= var19 && (-arg1.field2078) <= var17 && var17 <= arg1.field2078) {
                            int var20 = 16777215;
                            if (class84.field1151.field4254[var8] != -1) {
                                var20 = class84.field1151.field4254[var8];
                            }
                            if (class109.field1458) {
                                class122.method889((class239) arg1.method998(false, true));
                            } else {
                                class280.method1969(arg1.field2084, arg1.field2027);
                            }
                            var16.method2246(class84.field1151.field4246[var8], var19 - (-arg2 - arg1.field2137 / 2), arg1.field2078 / 2 + arg3 + -var17, var18, 50, var20, 0, 256, 1, 0, 0);
                            if (class109.field1458) {
                                class122.method892();
                            } else {
                                class280.method1981();
                            }
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class117.field1633; var21++) {
                int var22 = class327.field5133[var21] * 4 + 2 - (class146.field2310.field4698 / 32);
                int var23 = class32.field480[var21] * 4 + 2 - (class146.field2310.field4731 / 32);
                class121 var24 = class249.method1790(arg0 ^ 0x186A, class32.field475[var21]);
                if (var24.field1690 != null) {
                    var24 = var24.method878((byte) 90);
                    if (var24 == null || var24.field1699 == -1) {
                        continue;
                    }
                }
                class56.method442(arg1, var23, arg0 ^ 0x184, arg2, arg3, class27.field398[var24.field1699], var22);
            }
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class5 var27 = class304.field4750[class154.field2392][var25][var26];
                    if (var27 != null) {
                        int var28 = var25 * 4 + 2 - (class146.field2310.field4698 / 32);
                        int var29 = var26 * 4 + 2 - class146.field2310.field4731 / 32;
                        class56.method442(arg1, var29, 6555, arg2, arg3, class77.field1040[0], var28);
                    }
                }
            }
            for (int var30 = 0; var30 < class79.field1083; var30++) {
                class212 var31 = class59.field870[class85.field1157[var30]];
                if (var31 != null && var31.method1546((byte) 96)) {
                    class161 var32 = var31.field3346;
                    if (var32 != null && var32.field2585 != null) {
                        var32 = var32.method1192(-1);
                    }
                    if (var32 != null && var32.field2587 && var32.field2584) {
                        int var33 = var31.field4698 / 32 - class146.field2310.field4698 / 32;
                        int var34 = var31.field4731 / 32 - (class146.field2310.field4731 / 32);
                        if (var32.field2600 == -1) {
                            class56.method442(arg1, var34, arg0 + 380, arg2, arg3, class77.field1040[1], var33);
                        } else {
                            class56.method442(arg1, var34, 6555, arg2, arg3, class27.field398[var32.field2600], var33);
                        }
                    }
                }
            }
            for (int var35 = 0; var35 < class232.field3631; var35++) {
                class337 var36 = class284.field4403[class81.field1116[var35]];
                if (var36 != null && var36.method1546((byte) 96)) {
                    int var37 = var36.field4698 / 32 - class146.field2310.field4698 / 32;
                    boolean var38 = false;
                    int var39 = var36.field4731 / 32 - (class146.field2310.field4731 / 32);
                    long var40 = class83.method608(var36.field5277, (byte) -96);
                    for (int var42 = 0; var42 < class301.field4626; var42++) {
                        if (class23.field352[var42] == var40 && class99.field1336[var42] != 0) {
                            var38 = true;
                            break;
                        }
                    }
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class229.field3593; var44++) {
                        if (class235.field3666[var44].field4430 == var40) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class146.field2310.field5246 != 0 && var36.field5246 != 0 && class146.field2310.field5246 == var36.field5246) {
                        var45 = true;
                    }
                    if (var38) {
                        class56.method442(arg1, var39, 6555, arg2, arg3, class77.field1040[3], var37);
                    } else if (var43) {
                        class56.method442(arg1, var39, 6555, arg2, arg3, class77.field1040[5], var37);
                    } else if (var45) {
                        class56.method442(arg1, var39, arg0 + 380, arg2, arg3, class77.field1040[4], var37);
                    } else {
                        class56.method442(arg1, var39, arg0 ^ 0x184, arg2, arg3, class77.field1040[2], var37);
                    }
                }
            }
            class182[] var46 = class287.field4436;
            for (int var47 = 0; var47 < var46.length; var47++) {
                class182 var48 = var46[var47];
                if (var48 != null && var48.field2954 != 0 && (class229.field3595 % 20) < 10) {
                    if (var48.field2954 == 1 && var48.field2951 >= 0 && var48.field2951 < class59.field870.length) {
                        class212 var49 = class59.field870[var48.field2951];
                        if (var49 != null) {
                            int var50 = var49.field4698 / 32 - (class146.field2310.field4698 / 32);
                            int var51 = var49.field4731 / 32 - (class146.field2310.field4731 / 32);
                            class126.method917(var51, (byte) 26, var50, arg3, arg2, var48.field2963, 360000, arg1);
                        }
                    }
                    if (var48.field2954 == 2) {
                        int var52 = (var48.field2953 - class326.field5108) * 4 + 2 - (class146.field2310.field4698 / 32);
                        int var53 = (var48.field2949 - class198.field3168) * 4 + 2 - class146.field2310.field4731 / 32;
                        int var54 = var48.field2950 * 4;
                        int var55 = var54 * var54;
                        class126.method917(var53, (byte) 26, var52, arg3, arg2, var48.field2963, var55, arg1);
                    }
                    if (var48.field2954 == 10 && var48.field2951 >= 0 && class284.field4403.length > var48.field2951) {
                        class337 var56 = class284.field4403[var48.field2951];
                        if (var56 != null) {
                            int var57 = var56.field4698 / 32 - class146.field2310.field4698 / 32;
                            int var58 = var56.field4731 / 32 - class146.field2310.field4731 / 32;
                            class126.method917(var58, (byte) 26, var57, arg3, arg2, var48.field2963, 360000, arg1);
                        }
                    }
                }
            }
            if (class121.field1751 != 0) {
                int var59 = class121.field1751 * 4 + ((class146.field2310.method2099((byte) 123) + -1) * 2) + 2 - (class146.field2310.field4698 / 32);
                int var60 = class18.field292 * 4 + (class146.field2310.method2099((byte) 123) + -1) * 2 + 2 - (class146.field2310.field4731 / 32);
                class56.method442(arg1, var60, 6555, arg2, arg3, class147.field2320, var59);
            }
            if (class109.field1458) {
                class122.method897(arg1.field2137 / 2 + (arg2 - 1), arg1.field2078 / 2 + -1 + arg3, 3, 3, 16777215);
            } else {
                class280.method1971(arg1.field2137 / 2 + arg2 - 1, arg1.field2078 / 2 + (arg3 - 1), 3, 3, 16777215);
            }
        } else if (class109.field1458) {
            class169 var61 = arg1.method998(false, true);
            if (var61 != null) {
                var61.method1273(arg2, arg3);
            }
        } else {
            class280.method1962(arg2, arg3, 0, arg1.field2084, arg1.field2027);
        }
        class97.field1277[arg4] = true;
    }

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "(I)V", line = 1083)
    private final void method1647(int arg0) {
        field3546++;
        this.field3542 = new class311(this.field3543.method2171(-11838));
        if (arg0 != -17787) {
            this.method1637(44, (String) null);
        }
        for (class215 var2 = (class215) this.field3543.method2174(256); var2 != null; var2 = (class215) this.field3543.method2164((byte) 102)) {
            class255 var3 = new class255(var2.field3386, (int) var2.field4430);
            this.field3542.method2161(var3, class193.method1429(var2.field3386, -29370), -1);
        }
    }
}
