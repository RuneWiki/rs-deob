import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class113 extends class24 {

    @OriginalMember(owner = "client!ol", name = "O", descriptor = "I")
    public int field1774 = 0;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "Luf;")
    public static class168 field1748 = class148.method1019(-1720, "settings");

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "Ljk;")
    public static class76 field1757 = new class76();

    @OriginalMember(owner = "client!ol", name = "K", descriptor = "[I")
    public static int[] field1771 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!ol", name = "L", descriptor = "Ljava/lang/Object;")
    public static Object field1772 = new Object();

    @OriginalMember(owner = "client!ol", name = "P", descriptor = "Luf;")
    public static class168 field1775 = class148.method1019(-1720, "hint_headicons");

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
    public int field1751;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "I")
    public int field1752;

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "I")
    public int field1754;

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "I")
    public int field1755;

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "I")
    public int field1756;

    @OriginalMember(owner = "client!ol", name = "y", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!ol", name = "z", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!ol", name = "A", descriptor = "I")
    public int field1761;

    @OriginalMember(owner = "client!ol", name = "B", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!ol", name = "C", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!ol", name = "D", descriptor = "I")
    public int field1764;

    @OriginalMember(owner = "client!ol", name = "E", descriptor = "I")
    public int field1765;

    @OriginalMember(owner = "client!ol", name = "H", descriptor = "I")
    public int field1768;

    @OriginalMember(owner = "client!ol", name = "N", descriptor = "I")
    public int field1773;

    @OriginalMember(owner = "client!ol", name = "I", descriptor = "Ljg;")
    public class161 field1769;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "Lkg;")
    public class22 field1749;

    @OriginalMember(owner = "client!ol", name = "G", descriptor = "Lv;")
    public class260 field1767;

    @OriginalMember(owner = "client!ol", name = "J", descriptor = "Lv;")
    public class260 field1770;

    @OriginalMember(owner = "client!ol", name = "x", descriptor = "Loe;")
    public class54 field1758;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "Z")
    public boolean field1750;

    @OriginalMember(owner = "client!ol", name = "F", descriptor = "[I")
    public int[] field1766;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V", line = 28)
    public static final void method827(int arg0) {
        client.method2011((byte) -59, class177.field2861);
        class60.field787++;
        field1759++;
        if (class303.field5106 && class299.field5074) {
            int var1 = class155.field2457;
            int var2 = class262.field4442;
            int var3 = var1 - class190.field3085;
            if (var3 < class27.field342) {
                var3 = class27.field342;
            }
            int var4 = var2 - class266.field4493;
            if ((class177.field2861.field4057 + var3) > (class27.field342 + class248.field4241.field4057)) {
                var3 = class27.field342 + class248.field4241.field4057 - class177.field2861.field4057;
            }
            if (class61.field798 > var4) {
                var4 = class61.field798;
            }
            if (arg0 != 16777215) {
                method831((byte) -94);
            }
            int var5 = class177.field2861.field3979;
            int var6 = var3 - class67.field890;
            if ((class61.field798 + class248.field4241.field3989) < (class177.field2861.field3989 + var4)) {
                var4 = class61.field798 - (class177.field2861.field3989 - class248.field4241.field3989);
            }
            int var7 = var4 + class248.field4241.field4092 - class61.field798;
            int var8 = var4 - class291.field4891;
            if (class60.field787 > class177.field2861.field4047 && (var5 < var8 || var8 < -var5 || var5 < var6 || -var5 > var6)) {
                class177.field2853 = true;
            }
            int var9 = var3 + class248.field4241.field4079 - class27.field342;
            if (class177.field2861.field4130 != null && class177.field2853) {
                class182 var10 = new class182();
                var10.field2928 = class177.field2861;
                var10.field2914 = var7;
                var10.field2915 = var9;
                var10.field2919 = class177.field2861.field4130;
                class177.method1270(var10, (byte) -19);
            }
            if (class281.field4725 == 0) {
                if (class177.field2853) {
                    if (class177.field2861.field3966 != null) {
                        class182 var11 = new class182();
                        var11.field2928 = class177.field2861;
                        var11.field2914 = var7;
                        var11.field2915 = var9;
                        var11.field2919 = class177.field2861.field3966;
                        var11.field2925 = class242.field3970;
                        class177.method1270(var11, (byte) -77);
                    }
                    if (class242.field3970 != null && client.method2003(class177.field2861) != null) {
                        class55.field708++;
                        class249.field4262.method726(148, 2138389379);
                        class249.field4262.method1076(class242.field3970.field3956, -124);
                        class249.field4262.method1050(class177.field2861.field3956, arg0 ^ 0xFF0074F7);
                        class249.field4262.method1054(class177.field2861.field3996, (byte) 40);
                        class249.field4262.method1090((byte) 127, class242.field3970.field3996);
                    }
                } else if ((class39.field487 == 1 || class284.method1962(class22.field275 - 1, true)) && class22.field275 > 2) {
                    class201.method1411((byte) -117);
                } else if (class22.field275 > 0) {
                    class56.method319(-31082);
                }
                class177.field2861 = null;
            }
        } else if (class60.field787 > 1) {
            class177.field2861 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIIIIIZII)V", line = 152)
    public static final void method828(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
        field1753++;
        int var11 = arg0 - arg10;
        int var12 = arg2 - arg5;
        boolean var13;
        if (class270.field4538 > 0 && class270.field4538 % 10 < 5) {
            var13 = true;
        } else {
            var13 = false;
        }
        int var14 = 983040 / arg7;
        if (arg8) {
            return;
        }
        int var15 = 983040 / arg1;
        for (int var16 = -var14; var16 < var11 + var14; var16++) {
            int var17 = arg7 * var16 + arg4 >> 16;
            int var18 = (var16 + 1) * arg7 + arg4 >> 16;
            int var19 = var18 - var17;
            if (var19 > 0) {
                int var20 = arg10 + var16 >> 6;
                int var21 = arg6 + var17;
                int var10000 = arg6 + var18;
                if (var20 >= 0 && (class63.field832.length - 1) >= var20) {
                    int[][] var23 = class63.field832[var20];
                    for (int var24 = -var15; var24 < var12 + var15; var24++) {
                        int var25 = arg1 * var24 + arg9 >> 16;
                        int var26 = (var24 + 1) * arg1 + arg9 >> 16;
                        int var27 = var26 - var25;
                        if (var27 > 0) {
                            int var28 = arg3 + var25;
                            var10000 = arg3 + var26;
                            int var30 = var24 + arg5 >> 6;
                            if (var30 >= 0 && var30 <= (var23.length - 1) && var23[var30] != null) {
                                int var31 = ((arg5 + var24 & 0x3F) << 6) + (arg10 + var16 & 0x3F);
                                int var32 = var23[var30][var31];
                                if (var32 != 0) {
                                    class161 var33 = class15.method64(var32 - 1, arg8);
                                    if (var13 && class248.field4251 == var33.field2556) {
                                        class297 var34 = new class297();
                                        var34.field5034 = var33.field2556;
                                        var34.field5031 = var28;
                                        var34.field5015 = var21;
                                        class289.field4866.method451(-91453648, var34);
                                    }
                                    class229.field3697[var33.field2556].method151(var21 - 7, var28 - 7);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class297 var35 = (class297) class289.field4866.method442(65293); var35 != null; var35 = (class297) class289.field4866.method440(3)) {
            class229.field3697[var35.field5034].method151(var35.field5015 - 7, var35.field5031 + -7);
            class277.method1908(var35.field5015, var35.field5031, 15, 16776960, 128);
            class277.method1908(var35.field5015, var35.field5031, 7, 16777215, 256);
        }
        class289.field4866.method453(255);
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)V", line = 273)
    public final void method829(int arg0) {
        field1760++;
        int var2 = this.field1754;
        if (this.field1769 != null) {
            class161 var3 = this.field1769.method1135(arg0 - 29080);
            if (var3 == null) {
                this.field1766 = null;
                this.field1773 = 0;
                this.field1751 = 0;
                this.field1752 = 0;
                this.field1754 = -1;
            } else {
                this.field1751 = var3.field2609;
                this.field1766 = var3.field2585;
                this.field1752 = var3.field2614;
                this.field1773 = var3.field2588 * 128;
                this.field1754 = var3.field2600;
            }
        } else if (this.field1749 != null) {
            int var4 = class101.method763(23718, this.field1749);
            if (var2 != var4) {
                this.field1754 = var4;
                class196 var5 = this.field1749.field267;
                if (var5.field3188 != null) {
                    var5 = var5.method1387((byte) -1);
                }
                if (var5 == null) {
                    this.field1773 = 0;
                } else {
                    this.field1773 = var5.field3236 * 128;
                }
            }
        } else if (this.field1758 != null) {
            this.field1754 = class209.method1465(this.field1758, -11250);
            this.field1773 = this.field1758.field690 * 128;
        }
        if (arg0 == 28976 && this.field1754 != var2 && this.field1770 != null) {
            client.field4933.method1533(this.field1770);
            this.field1770 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZILuf;)V", line = 363)
    public static final void method830(boolean arg0, int arg1, class168 arg2) {
        field1762++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class283.field4781.method212(arg2, 250);
        int var7 = arg1 * class283.field4781.method211(arg2, 250);
        class228.method1560(var4 - var3, -var3 + var5, var6 + var3 + var3, var3 + var7 - -var3, 0);
        class228.method1558(var4 - var3, var5 - var3, var3 + var6 + var3, var3 + var7 + var3, 16777215);
        class283.field4781.method202(arg2, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class127.method901(var4 - var3, (byte) 126, var3 + var3 + var7, -var3 + var5, var3 + var3 + var6);
        if (arg0) {
            class90.method621();
        } else {
            class193.method1361(var5, var4, var7, var6, true);
        }
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(B)V", line = 399)
    public static void method831(byte arg0) {
        field1771 = null;
        field1772 = null;
        if (arg0 < 96) {
            field1772 = (Object) null;
        }
        field1775 = null;
        field1748 = null;
        field1757 = null;
    }
}
