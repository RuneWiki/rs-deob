import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class119 extends class165 {

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "I")
    private int field1818;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    private int field1800;

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "I")
    private int field1810;

    @OriginalMember(owner = "client!pg", name = "L", descriptor = "I")
    private int field1820;

    @OriginalMember(owner = "client!pg", name = "I", descriptor = "I")
    private int field1817;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    public int field1798;

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "I")
    public int field1812;

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "I")
    public int field1819;

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "I")
    private int field1807;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "I")
    public int field1815;

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "I")
    public static int field1813 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!pg", name = "F", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "Lak;")
    public static class172 field1811;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "[S")
    public static short[] field1802;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)[I", line = 4)
    public final int[] method831(int arg0, int arg1, int arg2) {
        field1803++;
        if (arg0 != 0) {
            method832(113);
        }
        return new int[] { this.field1818, arg1 + this.field1812 - this.field1817, -this.field1810 + arg2 + this.field1798 };
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V", line = 21)
    public static void method832(int arg0) {
        field1802 = null;
        field1811 = null;
        int var1 = 40 / ((-arg0 - 84) / 34);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)I", line = 31)
    public static final int method833(byte arg0, int arg1) {
        field1805++;
        if (class320.field4966 != null) {
            class320.field4966.method91(-85);
            class320.field4966 = null;
        }
        class110.field1633++;
        if (class110.field1633 > 4) {
            class110.field1633 = 0;
            class159.field2622 = 0;
            return arg1;
        }
        class159.field2622 = 0;
        if (class178.field2965 == class147.field2281) {
            class147.field2281 = class210.field3451;
        } else {
            class147.field2281 = class178.field2965;
        }
        if (arg0 < 18) {
            method833((byte) 48, 8);
        }
        return -1;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIII)V", line = 81)
    public static final void method834(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1814++;
        int var7 = class33.method178(class279.field4497, class98.field1410, arg1, 121);
        int var8 = class33.method178(class279.field4497, class98.field1410, arg4, 28);
        int var9 = class33.method178(class191.field3131, class336.field5249, arg6, 37);
        int var10 = class33.method178(class191.field3131, class336.field5249, arg3, 82);
        int var11 = class33.method178(class279.field4497, class98.field1410, arg1 + arg2, 74);
        int var12 = class33.method178(class279.field4497, class98.field1410, arg4 - arg2, 78);
        for (int var13 = var7; var13 < var11; var13++) {
            class80.method545(arg5, -72, var10, var9, class281.field4523[var13]);
        }
        if (arg0 != 310) {
            field1816 = 5;
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class80.method545(arg5, -78, var10, var9, class281.field4523[var14]);
        }
        int var15 = class33.method178(class191.field3131, class336.field5249, arg6 + arg2, arg0 + -240);
        int var16 = class33.method178(class191.field3131, class336.field5249, arg3 - arg2, 107);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class281.field4523[var17];
            class80.method545(arg5, -126, var15, var9, var18);
            class80.method545(arg5, -59, var10, var16, var18);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IBI)Z", line = 131)
    public final boolean method835(int arg0, byte arg1, int arg2) {
        if (arg1 != 36) {
            method834(-126, -16, 121, 9, -112, 43, -6);
        }
        field1808++;
        return this.field1817 <= arg2 && this.field1807 >= arg2 && arg0 >= this.field1810 && arg0 <= this.field1820;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(III)[I", line = 146)
    public final int[] method836(int arg0, int arg1, int arg2) {
        if (arg1 == 5723) {
            field1809++;
            return new int[] { this.field1800, this.field1817 + arg0 - this.field1812, -this.field1798 + arg2 + this.field1810 };
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)I", line = 157)
    public static final int method837(int arg0, int arg1) {
        field1799++;
        if (arg0 != 372938402) {
            return 24;
        }
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg1;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IBII)Z", line = 184)
    public final boolean method838(int arg0, byte arg1, int arg2, int arg3) {
        field1804++;
        if (arg1 < 69) {
            this.method836(59, -103, -127);
        }
        return this.field1800 == arg2 && this.field1817 <= arg3 && arg3 <= this.field1807 && this.field1810 <= arg0 && this.field1820 >= arg0;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(III)Z", line = 199)
    public final boolean method839(int arg0, int arg1, int arg2) {
        if (arg2 != 1) {
            this.field1819 = -30;
        }
        field1801++;
        return arg0 >= this.field1812 && this.field1815 >= arg0 && this.field1798 <= arg1 && this.field1819 >= arg1;
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V", line = 214)
    public static final void method840(int arg0) {
        class319.method2245(false, false);
        field1806++;
        class295.field4681 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class129.field2017.length; var2++) {
            if (class150.field2321[var2] != -1 && class129.field2017[var2] == null) {
                class129.field2017[var2] = class234.field3748.method1287(0, class150.field2321[var2], -1);
                if (class129.field2017[var2] == null) {
                    var1 = false;
                    class295.field4681++;
                }
            }
            if (class110.field1641[var2] != -1 && class256.field4120[var2] == null) {
                class256.field4120[var2] = class234.field3748.method1273(class110.field1641[var2], class23.field317[var2], 0, (byte) -71);
                if (class256.field4120[var2] == null) {
                    var1 = false;
                    class295.field4681++;
                }
            }
            if (class232.field3690) {
                if (class342.field5328[var2] != -1 && class156.field2413[var2] == null) {
                    class156.field2413[var2] = class234.field3748.method1287(0, class342.field5328[var2], -1);
                    if (class156.field2413[var2] == null) {
                        var1 = false;
                        class295.field4681++;
                    }
                }
                if (class342.field5319[var2] != -1 && class4.field69[var2] == null) {
                    class4.field69[var2] = class234.field3748.method1287(0, class342.field5319[var2], -1);
                    if (class4.field69[var2] == null) {
                        var1 = false;
                        class295.field4681++;
                    }
                }
            }
            if (class157.field2594 != null && class143.field2233[var2] == null && class157.field2594[var2] != -1) {
                class143.field2233[var2] = class234.field3748.method1273(class157.field2594[var2], class23.field317[var2], 0, (byte) -71);
                if (class143.field2233[var2] == null) {
                    class295.field4681++;
                    var1 = false;
                }
            }
        }
        if (class298.field4698 == null) {
            if (class201.field3274 == null || !class176.field2939.method1278(-117, class201.field3274.field4657 + "_labels")) {
                class298.field4698 = new class201(0);
            } else if (class176.field2939.method1285(class201.field3274.field4657 + "_labels", false)) {
                class298.field4698 = class91.method612(class201.field3274.field4657 + "_labels", class176.field2939, arg0 - 59);
            } else {
                var1 = false;
                class295.field4681++;
            }
        }
        if (!var1) {
            class38.field484 = 1;
            return;
        }
        class89.field1230 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class129.field2017.length; var4++) {
            byte[] var5 = class256.field4120[var4];
            if (var5 != null) {
                int var6 = (class330.field5109[var4] >> 8) * 64 - class70.field989;
                int var7 = (class330.field5109[var4] & 0xFF) * 64 - class205.field3367;
                if (class221.field3548) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class233.method1688(-6782, var5, var7, var6);
            }
            if (class232.field3690) {
                byte[] var8 = class4.field69[var4];
                if (var8 != null) {
                    int var9 = (class330.field5109[var4] >> 8) * 64 - class70.field989;
                    int var10 = (class330.field5109[var4] & 0xFF) * 64 - class205.field3367;
                    if (class221.field3548) {
                        var10 = 10;
                        var9 = 10;
                    }
                    var3 &= class233.method1688(-6782, var8, var10, var9);
                }
            }
        }
        if (!var3) {
            class38.field484 = 2;
            return;
        }
        if (class38.field484 != 0) {
            class138.method1025(26835, true, class108.field1605 + "<br>(100%)");
        }
        class76.method516((byte) -51);
        boolean var11 = false;
        class115.method795((byte) -105);
        if (class232.field3690 && class245.field3872) {
            for (int var12 = 0; var12 < class129.field2017.length; var12++) {
                if (class4.field69[var12] != null || class156.field2413[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class50.method330(4, 104, 104, class232.field3690 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class126.field1964[var13].method737(119);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class129.field2025[var14][var15][var16] = 0;
                }
            }
        }
        class48.method311(127, false);
        if (class232.field3690) {
            class241.field3823.method2285();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class241.field3819[var17][var18].field4047 = true;
                }
            }
        }
        if (class232.field3690) {
            class118.method827();
        }
        if (class232.field3690) {
            class229.method1623((byte) 127);
        }
        class76.method516((byte) -51);
        System.gc();
        class319.method2245(true, false);
        class341.method2365(false, 117);
        if (!class221.field3548) {
            class317.method2236(false, -123);
            class319.method2245(true, false);
            if (class232.field3690) {
                int var19 = class191.field3129.field4248[0] >> 3;
                int var20 = class191.field3129.field4184[0] >> 3;
                class276.method2001(var20, var19, true);
            }
            class334.method2331(255, false);
            if (class143.field2233 != null) {
                class208.method1506(0);
            }
        }
        if (class221.field3548) {
            class214.method1542(false, (byte) 109);
            class319.method2245(true, false);
            if (class232.field3690) {
                int var21 = class191.field3129.field4248[0] >> 3;
                int var22 = class191.field3129.field4184[0] >> 3;
                class276.method2001(var22, var21, true);
            }
            class207.method1504(false, arg0 ^ 0x41E0);
        }
        class115.method795((byte) 57);
        class319.method2245(true, false);
        class271.method1928(class126.field1964, false, class221.field3548 ? class83.field1172 : (int[][][]) null, arg0 - 15783);
        if (class232.field3690) {
            class118.method824();
        }
        class319.method2245(true, false);
        int var23 = class101.field1478;
        if (var23 > class49.field698) {
            var23 = class49.field698;
        }
        if (class49.field698 - 1 > var23) {
            int var24 = class49.field698 - 1;
        }
        if (class76.method518(-19076)) {
            class155.method1112(0);
        } else {
            class155.method1112(class101.field1478);
        }
        class128.method929(50);
        if (class232.field3690 && var11) {
            class295.method2107(true);
            class341.method2365(true, 125);
            if (!class221.field3548) {
                class317.method2236(true, -83);
                class319.method2245(true, false);
                class334.method2331(arg0 ^ 0xFF, true);
            }
            if (class221.field3548) {
                class214.method1542(true, (byte) 109);
                class319.method2245(true, false);
                class207.method1504(true, 16864);
            }
            class115.method795((byte) 65);
            class319.method2245(true, false);
            class271.method1928(class126.field1964, true, class221.field3548 ? class83.field1172 : (int[][][]) null, arg0 ^ 0xFFFFC259);
            class319.method2245(true, false);
            class128.method929(50);
            class295.method2107(false);
        }
        if (class232.field3690) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    class241.field3819[var25][var26].method1825(class110.field1642[0], var25 * 8, var26 * 8);
                }
            }
        }
        for (int var27 = arg0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class240.method1723(1610612736, var28, var27);
            }
        }
        class277.method2004(111);
        class76.method516((byte) -51);
        class258.method1848(false);
        class115.method795((byte) 109);
        class54.field768 = false;
        if (class232.field3690) {
            class226.method1602(true, true);
        }
        if (class278.field4482 != null && class320.field4966 != null && class5.field75 == 25) {
            class205.field3371++;
            class194.field3175.method2375(199, arg0 ^ 0x0);
            class194.field3175.method283((byte) -51, 1057001181);
        }
        if (!class221.field3548) {
            int var29 = (class142.field2215 - 6) / 8;
            int var30 = (class63.field914 - 6) / 8;
            int var31 = (class142.field2215 + 6) / 8;
            int var32 = (class63.field914 + 6) / 8;
            for (int var33 = var29 - 1; var33 <= var31 + 1; var33++) {
                for (int var34 = var30 - 1; var34 <= var32 + 1; var34++) {
                    if (var29 > var33 || var33 > var31 || var34 < var30 || var32 < var34) {
                        class234.field3748.method1286("m" + var33 + "_" + var34, (byte) 119);
                        class234.field3748.method1286("l" + var33 + "_" + var34, (byte) 99);
                    }
                }
            }
        }
        if (class5.field75 == 28) {
            class278.method2012(10, arg0 + 99);
        } else {
            class278.method2012(30, 71);
            if (class320.field4966 != null) {
                class194.field3175.method2375(72, arg0);
            }
        }
        class229.method1615(-1);
        class76.method516((byte) -51);
        class53.method342(25376);
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 725)
    public class119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1818 = arg1;
        this.field1800 = arg0;
        this.field1810 = arg3;
        this.field1820 = arg5;
        this.field1817 = arg2;
        this.field1798 = arg7;
        this.field1812 = arg6;
        this.field1819 = arg9;
        this.field1807 = arg4;
        this.field1815 = arg8;
    }
}
