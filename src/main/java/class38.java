import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class38 {

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public int field638 = -1;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public int field635 = -1;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public int field636 = 0;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public int field645 = -1;

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "I")
    public int field660 = -1;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public int field639 = 0;

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
    public int field651 = -1;

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "I")
    public int field654 = -1;

    @OriginalMember(owner = "client!gj", name = "C", descriptor = "I")
    public int field663 = -1;

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "I")
    public int field657 = -1;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public int field642 = -1;

    @OriginalMember(owner = "client!gj", name = "x", descriptor = "I")
    public int field658 = -1;

    @OriginalMember(owner = "client!gj", name = "F", descriptor = "I")
    public int field666 = 0;

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
    public int field650 = -1;

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "I")
    public int field655 = 0;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    public int field641 = -1;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public int field643 = 0;

    @OriginalMember(owner = "client!gj", name = "G", descriptor = "I")
    public int field667 = -1;

    @OriginalMember(owner = "client!gj", name = "B", descriptor = "I")
    public int field662 = -1;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
    public int field648 = 0;

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "I")
    public int field652 = 0;

    @OriginalMember(owner = "client!gj", name = "E", descriptor = "I")
    public int field665 = -1;

    @OriginalMember(owner = "client!gj", name = "H", descriptor = "I")
    public int field668 = -1;

    @OriginalMember(owner = "client!gj", name = "y", descriptor = "I")
    public int field659 = -1;

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
    public int field653 = -1;

    @OriginalMember(owner = "client!gj", name = "K", descriptor = "I")
    public int field671 = 0;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
    public int field647 = 0;

    @OriginalMember(owner = "client!gj", name = "N", descriptor = "I")
    public int field674 = -1;

    @OriginalMember(owner = "client!gj", name = "J", descriptor = "I")
    public int field670 = -1;

    @OriginalMember(owner = "client!gj", name = "M", descriptor = "I")
    public int field673 = -1;

    @OriginalMember(owner = "client!gj", name = "L", descriptor = "I")
    public int field672 = -1;

    @OriginalMember(owner = "client!gj", name = "P", descriptor = "I")
    public int field676 = 0;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "I")
    public static int field649 = 0;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public static int field640 = 0;

    @OriginalMember(owner = "client!gj", name = "A", descriptor = "Z")
    public static boolean field661 = false;

    @OriginalMember(owner = "client!gj", name = "O", descriptor = "I")
    public static int field675 = 0;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!gj", name = "D", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "[Lbf;")
    public static class102[] field656;

    @OriginalMember(owner = "client!gj", name = "I", descriptor = "[[I")
    public int[][] field669;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lig;I)V")
    public final void method315(class136 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1012(arg1 + 31527);
            if (var3 == 0) {
                if (arg1 != -31523) {
                    this.method319(108, 59, (class136) null);
                }
                field664++;
                return;
            }
            this.method319(var3, 54, arg0);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
    public static void method316(int arg0) {
        field656 = null;
        if (arg0 >= -93) {
            method320((class129) null, false);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)J")
    public static final long method317(int arg0, int arg1, int arg2) {
        class129 var3 = class26.field455[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field2142; var4++) {
            class190 var5 = var3.field2131[var4];
            if ((var5.field3118 >> 29 & 0x3L) == 2L && var5.field3115 == arg1 && var5.field3110 == arg2) {
                return var5.field3118;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V")
    public final void method318(byte arg0) {
        field637++;
        if (arg0 != -87) {
            this.method319(16, -18, (class136) null);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IILig;)V")
    private final void method319(int arg0, int arg1, class136 arg2) {
        int var4 = -92 % ((-arg1 - 65) / 45);
        if (arg0 == 1) {
            this.field651 = arg2.method996(65280);
            this.field653 = arg2.method996(65280);
            if (this.field653 == 65535) {
                this.field653 = -1;
            }
            if (this.field651 == 65535) {
                this.field651 = -1;
            }
        } else if (arg0 == 2) {
            this.field638 = arg2.method996(65280);
        } else if (arg0 == 3) {
            this.field660 = arg2.method996(65280);
        } else if (arg0 == 4) {
            this.field635 = arg2.method996(65280);
        } else if (arg0 == 5) {
            this.field668 = arg2.method996(65280);
        } else if (arg0 == 6) {
            this.field665 = arg2.method996(65280);
        } else if (arg0 == 7) {
            this.field672 = arg2.method996(65280);
        } else if (arg0 == 8) {
            this.field658 = arg2.method996(65280);
        } else if (arg0 == 9) {
            this.field670 = arg2.method996(65280);
        } else if (arg0 == 26) {
            this.field639 = (short) (arg2.method1012(4) * 4);
            this.field648 = (short) (arg2.method1012(4) * 4);
        } else if (arg0 == 27) {
            if (this.field669 == null) {
                this.field669 = new int[12][];
            }
            int var5 = arg2.method1012(4);
            this.field669[var5] = new int[6];
            for (int var6 = 0; var6 < 6; var6++) {
                this.field669[var5][var6] = arg2.method1027((byte) 64);
            }
        } else if (arg0 == 29) {
            this.field643 = arg2.method1012(4);
        } else if (arg0 == 30) {
            this.field676 = arg2.method996(65280);
        } else if (arg0 == 31) {
            this.field671 = arg2.method1012(4);
        } else if (arg0 == 32) {
            this.field655 = arg2.method996(65280);
        } else if (arg0 == 33) {
            this.field652 = arg2.method1027((byte) 64);
        } else if (arg0 == 34) {
            this.field666 = arg2.method1012(4);
        } else if (arg0 == 35) {
            this.field636 = arg2.method996(65280);
        } else if (arg0 == 36) {
            this.field647 = arg2.method1027((byte) 64);
        } else if (arg0 == 37) {
            this.field657 = arg2.method1012(4);
        } else if (arg0 == 38) {
            this.field662 = arg2.method996(65280);
        } else if (arg0 == 39) {
            this.field642 = arg2.method996(65280);
        } else if (arg0 == 40) {
            this.field650 = arg2.method996(65280);
        } else if (arg0 == 41) {
            this.field641 = arg2.method996(65280);
        } else if (arg0 == 42) {
            this.field673 = arg2.method996(65280);
        } else if (arg0 == 43) {
            arg2.method996(65280);
        } else if (arg0 == 44) {
            arg2.method996(65280);
        } else if (arg0 == 45) {
            arg2.method996(65280);
        } else if (arg0 == 46) {
            this.field663 = arg2.method996(65280);
        } else if (arg0 == 47) {
            this.field667 = arg2.method996(65280);
        } else if (arg0 == 48) {
            this.field645 = arg2.method996(65280);
        } else if (arg0 == 49) {
            this.field674 = arg2.method996(65280);
        } else if (arg0 == 50) {
            this.field654 = arg2.method996(65280);
        } else if (arg0 == 51) {
            this.field659 = arg2.method996(65280);
        }
        field646++;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lnb;Z)V")
    public static final void method320(class129 arg0, boolean arg1) {
        class150.field2461.method1809(5, arg0);
        while (true) {
            class129 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class129[][] var7;
            class129 var66;
            do {
                class129 var65;
                do {
                    class129 var64;
                    do {
                        class129 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class129) class150.field2461.method1811(-26875);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field2149);
                                            var3 = var2.field2141;
                                            var4 = var2.field2137;
                                            var5 = var2.field2152;
                                            var6 = var2.field2128;
                                            var7 = class26.field455[var5];
                                            if (!var2.field2123) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class129 var8 = class26.field455[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field2149) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class263.field4171 && var3 > class16.field243) {
                                                    class129 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field2149 && (var9.field2123 || (var2.field2130 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class263.field4171 && var3 < class100.field1528 - 1) {
                                                    class129 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field2149 && (var10.field2123 || (var2.field2130 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class239.field3766 && var4 > class37.field629) {
                                                    class129 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field2149 && (var11.field2123 || (var2.field2130 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class239.field3766 && var4 < class127.field2102 - 1) {
                                                    class129 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field2149 && (var12.field2123 || (var2.field2130 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field2123 = false;
                                            if (var2.field2135 != null) {
                                                class129 var13 = var2.field2135;
                                                if (var13.field2132 == null) {
                                                    if (var13.field2146 != null) {
                                                        if (class279.method1873(0, var3, var4)) {
                                                            class183.method1281(var13.field2146, class119.field2004, class100.field1518, class273.field4367, class237.field3744, var3, var4, true);
                                                        } else {
                                                            class183.method1281(var13.field2146, class119.field2004, class100.field1518, class273.field4367, class237.field3744, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class279.method1873(0, var3, var4)) {
                                                    class239.method1580(var13.field2132, 0, class119.field2004, class100.field1518, class273.field4367, class237.field3744, var3, var4, true);
                                                } else {
                                                    class239.method1580(var13.field2132, 0, class119.field2004, class100.field1518, class273.field4367, class237.field3744, var3, var4, false);
                                                }
                                                class128 var14 = var13.field2144;
                                                if (var14 != null) {
                                                    var14.field2117.method98(0, class119.field2004, class100.field1518, class273.field4367, class237.field3744, var14.field2116 - class282.field4477, var14.field2113 - class89.field1421, var14.field2115 - class271.field4346, var14.field2107, var5, (class98) null);
                                                }
                                                for (int var15 = 0; var15 < var13.field2142; var15++) {
                                                    class190 var16 = var13.field2131[var15];
                                                    if (var16 != null) {
                                                        var16.field3119.method98(var16.field3105, class119.field2004, class100.field1518, class273.field4367, class237.field3744, var16.field3107 - class282.field4477, var16.field3120 - class89.field1421, var16.field3109 - class271.field4346, var16.field3118, var5, (class98) null);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field2132 == null) {
                                                if (var2.field2146 != null) {
                                                    if (class279.method1873(var6, var3, var4)) {
                                                        class183.method1281(var2.field2146, class119.field2004, class100.field1518, class273.field4367, class237.field3744, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class183.method1281(var2.field2146, class119.field2004, class100.field1518, class273.field4367, class237.field3744, var3, var4, false);
                                                    }
                                                }
                                            } else if (class279.method1873(var6, var3, var4)) {
                                                class239.method1580(var2.field2132, var6, class119.field2004, class100.field1518, class273.field4367, class237.field3744, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field2132.field1597 != 12345678 || class285.field4537 && var5 <= class143.field2357) {
                                                    class239.method1580(var2.field2132, var6, class119.field2004, class100.field1518, class273.field4367, class237.field3744, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class249 var18 = var2.field2133;
                                                if (var18 != null && (var18.field3979 & 0x80000000L) != 0L) {
                                                    var18.field3973.method98(0, class119.field2004, class100.field1518, class273.field4367, class237.field3744, var18.field3975 - class282.field4477, var18.field3978 - class89.field1421, var18.field3977 - class271.field4346, var18.field3979, var5, (class98) null);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class128 var21 = var2.field2144;
                                            class195 var22 = var2.field2143;
                                            if (var21 != null || var22 != null) {
                                                if (class263.field4171 == var3) {
                                                    var19++;
                                                } else if (class263.field4171 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class239.field3766 == var4) {
                                                    var19 += 3;
                                                } else if (class239.field3766 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class124.field2077[var19];
                                                var2.field2151 = class190.field3113[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field2121 & class207.field3324[var19]) == 0) {
                                                    var2.field2150 = 0;
                                                } else if (var21.field2121 == 16) {
                                                    var2.field2150 = 3;
                                                    var2.field2139 = class52.field944[var19];
                                                    var2.field2124 = 3 - var2.field2139;
                                                } else if (var21.field2121 == 32) {
                                                    var2.field2150 = 6;
                                                    var2.field2139 = class49.field889[var19];
                                                    var2.field2124 = 6 - var2.field2139;
                                                } else if (var21.field2121 == 64) {
                                                    var2.field2150 = 12;
                                                    var2.field2139 = class217.field3492[var19];
                                                    var2.field2124 = 12 - var2.field2139;
                                                } else {
                                                    var2.field2150 = 9;
                                                    var2.field2139 = class101.field1551[var19];
                                                    var2.field2124 = 9 - var2.field2139;
                                                }
                                                if ((var21.field2121 & var20) != 0 && !class210.method1399(var6, var3, var4, var21.field2121)) {
                                                    var21.field2117.method98(0, class119.field2004, class100.field1518, class273.field4367, class237.field3744, var21.field2116 - class282.field4477, var21.field2113 - class89.field1421, var21.field2115 - class271.field4346, var21.field2107, var5, (class98) null);
                                                }
                                                if ((var21.field2108 & var20) != 0 && !class210.method1399(var6, var3, var4, var21.field2108)) {
                                                    var21.field2105.method98(0, class119.field2004, class100.field1518, class273.field4367, class237.field3744, var21.field2116 - class282.field4477, var21.field2113 - class89.field1421, var21.field2115 - class271.field4346, var21.field2107, var5, (class98) null);
                                                }
                                            }
                                            if (var22 != null && !class163.method1172(var6, var3, var4, var22.field3187.method99())) {
                                                if ((var22.field3191 & var20) != 0) {
                                                    var22.field3187.method98(0, class119.field2004, class100.field1518, class273.field4367, class237.field3744, var22.field3192 + var22.field3193 - class282.field4477, var22.field3186 - class89.field1421, var22.field3195 + var22.field3189 - class271.field4346, var22.field3190, var5, (class98) null);
                                                } else if (var22.field3191 == 256) {
                                                    int var23 = var22.field3192 - class282.field4477;
                                                    int var24 = var22.field3186 - class89.field1421;
                                                    int var25 = var22.field3195 - class271.field4346;
                                                    int var26 = var22.field3197;
                                                    int var27;
                                                    if (var26 == 1 || var26 == 2) {
                                                        var27 = -var23;
                                                    } else {
                                                        var27 = var23;
                                                    }
                                                    int var28;
                                                    if (var26 == 2 || var26 == 3) {
                                                        var28 = -var25;
                                                    } else {
                                                        var28 = var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field3187.method98(0, class119.field2004, class100.field1518, class273.field4367, class237.field3744, var22.field3193 + var23, var24, var22.field3189 + var25, var22.field3190, var5, (class98) null);
                                                    } else if (var22.field3185 != null) {
                                                        var22.field3185.method98(0, class119.field2004, class100.field1518, class273.field4367, class237.field3744, var23, var24, var25, var22.field3190, var5, (class98) null);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class249 var29 = var2.field2133;
                                                if (var29 != null && (var29.field3979 & 0x80000000L) == 0L) {
                                                    var29.field3973.method98(0, class119.field2004, class100.field1518, class273.field4367, class237.field3744, var29.field3975 - class282.field4477, var29.field3978 - class89.field1421, var29.field3977 - class271.field4346, var29.field3979, var5, (class98) null);
                                                }
                                                class192 var30 = var2.field2126;
                                                if (var30 != null && var30.field3147 == 0) {
                                                    if (var30.field3139 != null) {
                                                        var30.field3139.method98(0, class119.field2004, class100.field1518, class273.field4367, class237.field3744, var30.field3136 - class282.field4477, var30.field3150 - class89.field1421, var30.field3135 - class271.field4346, var30.field3144, var5, (class98) null);
                                                    }
                                                    if (var30.field3145 != null) {
                                                        var30.field3145.method98(0, class119.field2004, class100.field1518, class273.field4367, class237.field3744, var30.field3136 - class282.field4477, var30.field3150 - class89.field1421, var30.field3135 - class271.field4346, var30.field3144, var5, (class98) null);
                                                    }
                                                    if (var30.field3143 != null) {
                                                        var30.field3143.method98(0, class119.field2004, class100.field1518, class273.field4367, class237.field3744, var30.field3136 - class282.field4477, var30.field3150 - class89.field1421, var30.field3135 - class271.field4346, var30.field3144, var5, (class98) null);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field2130;
                                            if (var31 != 0) {
                                                if (var3 < class263.field4171 && (var31 & 0x4) != 0) {
                                                    class129 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field2149) {
                                                        class150.field2461.method1809(5, var32);
                                                    }
                                                }
                                                if (var4 < class239.field3766 && (var31 & 0x2) != 0) {
                                                    class129 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field2149) {
                                                        class150.field2461.method1809(5, var33);
                                                    }
                                                }
                                                if (var3 > class263.field4171 && (var31 & 0x1) != 0) {
                                                    class129 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field2149) {
                                                        class150.field2461.method1809(5, var34);
                                                    }
                                                }
                                                if (var4 > class239.field3766 && (var31 & 0x8) != 0) {
                                                    class129 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field2149) {
                                                        class150.field2461.method1809(5, var35);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field2150 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field2142; var37++) {
                                                if (class139.field2326 != var2.field2131[var37].field3123 && (var2.field2125[var37] & var2.field2150) == var2.field2139) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class128 var38 = var2.field2144;
                                                if (!class210.method1399(var6, var3, var4, var38.field2121)) {
                                                    var38.field2117.method98(0, class119.field2004, class100.field1518, class273.field4367, class237.field3744, var38.field2116 - class282.field4477, var38.field2113 - class89.field1421, var38.field2115 - class271.field4346, var38.field2107, var5, (class98) null);
                                                }
                                                var2.field2150 = 0;
                                            }
                                        }
                                        if (!var2.field2140) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field2142;
                                            var2.field2140 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; var41++) {
                                                class190 var42 = var2.field2131[var41];
                                                if (class139.field2326 != var42.field3123) {
                                                    for (int var43 = var42.field3115; var43 <= var42.field3114; var43++) {
                                                        for (int var44 = var42.field3110; var44 <= var42.field3108; var44++) {
                                                            class129 var45 = var7[var43][var44];
                                                            if (var45.field2123) {
                                                                var2.field2140 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field2150 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field3115) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field3114) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field3110) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field3108) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field2150) == var2.field2124) {
                                                                    var2.field2140 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class7.field89[var40++] = var42;
                                                    int var47 = class263.field4171 - var42.field3115;
                                                    int var48 = var42.field3114 - class263.field4171;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class239.field3766 - var42.field3110;
                                                    int var50 = var42.field3108 - class239.field3766;
                                                    if (var50 > var49) {
                                                        var42.field3117 = var47 + var50;
                                                    } else {
                                                        var42.field3117 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class190 var54 = class7.field89[var53];
                                                    if (class139.field2326 != var54.field3123) {
                                                        if (var54.field3117 > var51) {
                                                            var51 = var54.field3117;
                                                            var52 = var53;
                                                        } else if (var54.field3117 == var51) {
                                                            int var55 = var54.field3107 - class282.field4477;
                                                            int var56 = var54.field3109 - class271.field4346;
                                                            int var57 = class7.field89[var52].field3107 - class282.field4477;
                                                            int var58 = class7.field89[var52].field3109 - class271.field4346;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class190 var59 = class7.field89[var52];
                                                var59.field3123 = class139.field2326;
                                                if (!class108.method803(var6, var59.field3115, var59.field3114, var59.field3110, var59.field3108, var59.field3119.method99())) {
                                                    var59.field3119.method98(var59.field3105, class119.field2004, class100.field1518, class273.field4367, class237.field3744, var59.field3107 - class282.field4477, var59.field3120 - class89.field1421, var59.field3109 - class271.field4346, var59.field3118, var5, (class98) null);
                                                }
                                                for (int var60 = var59.field3115; var60 <= var59.field3114; var60++) {
                                                    for (int var61 = var59.field3110; var61 <= var59.field3108; var61++) {
                                                        class129 var62 = var7[var60][var61];
                                                        if (var62.field2150 != 0) {
                                                            class150.field2461.method1809(5, var62);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field2149) {
                                                            class150.field2461.method1809(5, var62);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field2140) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field2140 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field2149);
                            } while (var2.field2150 != 0);
                            if (var3 > class263.field4171 || var3 <= class16.field243) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field2149);
                        if (var3 < class263.field4171 || var3 >= class100.field1528 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field2149);
                    if (var4 > class239.field3766 || var4 <= class37.field629) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field2149);
                if (var4 < class239.field3766 || var4 >= class127.field2102 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field2149);
            var2.field2149 = false;
            class233.field3682--;
            class192 var67 = var2.field2126;
            if (var67 != null && var67.field3147 != 0) {
                if (var67.field3139 != null) {
                    var67.field3139.method98(0, class119.field2004, class100.field1518, class273.field4367, class237.field3744, var67.field3136 - class282.field4477, var67.field3150 - class89.field1421 - var67.field3147, var67.field3135 - class271.field4346, var67.field3144, var5, (class98) null);
                }
                if (var67.field3145 != null) {
                    var67.field3145.method98(0, class119.field2004, class100.field1518, class273.field4367, class237.field3744, var67.field3136 - class282.field4477, var67.field3150 - class89.field1421 - var67.field3147, var67.field3135 - class271.field4346, var67.field3144, var5, (class98) null);
                }
                if (var67.field3143 != null) {
                    var67.field3143.method98(0, class119.field2004, class100.field1518, class273.field4367, class237.field3744, var67.field3136 - class282.field4477, var67.field3150 - class89.field1421 - var67.field3147, var67.field3135 - class271.field4346, var67.field3144, var5, (class98) null);
                }
            }
            if (var2.field2151 != 0) {
                class195 var68 = var2.field2143;
                if (var68 != null && !class163.method1172(var6, var3, var4, var68.field3187.method99())) {
                    if ((var68.field3191 & var2.field2151) != 0) {
                        var68.field3187.method98(0, class119.field2004, class100.field1518, class273.field4367, class237.field3744, var68.field3192 + var68.field3193 - class282.field4477, var68.field3186 - class89.field1421, var68.field3195 + var68.field3189 - class271.field4346, var68.field3190, var5, (class98) null);
                    } else if (var68.field3191 == 256) {
                        int var69 = var68.field3192 - class282.field4477;
                        int var70 = var68.field3186 - class89.field1421;
                        int var71 = var68.field3195 - class271.field4346;
                        int var72 = var68.field3197;
                        int var73;
                        if (var72 == 1 || var72 == 2) {
                            var73 = -var69;
                        } else {
                            var73 = var69;
                        }
                        int var74;
                        if (var72 == 2 || var72 == 3) {
                            var74 = -var71;
                        } else {
                            var74 = var71;
                        }
                        if (var74 >= var73) {
                            var68.field3187.method98(0, class119.field2004, class100.field1518, class273.field4367, class237.field3744, var68.field3193 + var69, var70, var68.field3189 + var71, var68.field3190, var5, (class98) null);
                        } else if (var68.field3185 != null) {
                            var68.field3185.method98(0, class119.field2004, class100.field1518, class273.field4367, class237.field3744, var69, var70, var71, var68.field3190, var5, (class98) null);
                        }
                    }
                }
                class128 var75 = var2.field2144;
                if (var75 != null) {
                    if ((var75.field2108 & var2.field2151) != 0 && !class210.method1399(var6, var3, var4, var75.field2108)) {
                        var75.field2105.method98(0, class119.field2004, class100.field1518, class273.field4367, class237.field3744, var75.field2116 - class282.field4477, var75.field2113 - class89.field1421, var75.field2115 - class271.field4346, var75.field2107, var5, (class98) null);
                    }
                    if ((var75.field2121 & var2.field2151) != 0 && !class210.method1399(var6, var3, var4, var75.field2121)) {
                        var75.field2117.method98(0, class119.field2004, class100.field1518, class273.field4367, class237.field3744, var75.field2116 - class282.field4477, var75.field2113 - class89.field1421, var75.field2115 - class271.field4346, var75.field2107, var5, (class98) null);
                    }
                }
            }
            if (var5 < class102.field1557 - 1) {
                class129 var76 = class26.field455[var5 + 1][var3][var4];
                if (var76 != null && var76.field2149) {
                    class150.field2461.method1809(5, var76);
                }
            }
            if (var3 < class263.field4171) {
                class129 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field2149) {
                    class150.field2461.method1809(5, var77);
                }
            }
            if (var4 < class239.field3766) {
                class129 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field2149) {
                    class150.field2461.method1809(5, var78);
                }
            }
            if (var3 > class263.field4171) {
                class129 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field2149) {
                    class150.field2461.method1809(5, var79);
                }
            }
            if (var4 > class239.field3766) {
                class129 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field2149) {
                    class150.field2461.method1809(5, var80);
                }
            }
        }
    }
}
