import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class104 extends class177 {

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
    private int field1585 = 0;

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "I")
    private int field1599 = 0;

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "I")
    private int field1603 = 0;

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "I")
    public static int field1601 = 0;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!mb", name = "G", descriptor = "I")
    private int field1589;

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "I")
    private int field1590;

    @OriginalMember(owner = "client!mb", name = "J", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "I")
    private int field1592;

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "I")
    private int field1594;

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "I")
    private int field1598;

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "I")
    private int field1602;

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V", line = 6)
    public class104() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZII)V", line = 11)
    private final void method802(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            this.field1594 = -90;
        }
        field1596++;
        int var5 = arg2 > 2048 ? arg0 + arg2 - (arg0 * arg2 >> 12) : (4096 - -arg0) * arg2 >> 12;
        if (var5 <= 0) {
            this.field1589 = this.field1598 = this.field1602 = arg2;
            return;
        }
        int var6 = arg3 * 6;
        int var7 = arg2 + arg2 - var5;
        int var8 = (var5 - var7 << 12) / var5;
        int var9 = var6 >> 12;
        int var10 = var6 - (var9 << 12);
        int var12 = var8 * var5 >> 12;
        int var13 = var10 * var12 >> 12;
        int var14 = var5 - var13;
        int var15 = var7 + var13;
        if (var9 == 0) {
            this.field1589 = var5;
            this.field1602 = var7;
            this.field1598 = var15;
        } else if (var9 == 1) {
            this.field1598 = var5;
            this.field1589 = var14;
            this.field1602 = var7;
        } else if (var9 == 2) {
            this.field1589 = var7;
            this.field1598 = var5;
            this.field1602 = var15;
        } else if (var9 == 3) {
            this.field1598 = var14;
            this.field1602 = var5;
            this.field1589 = var7;
        } else if (var9 == 4) {
            this.field1602 = var5;
            this.field1589 = var15;
            this.field1598 = var7;
        } else if (var9 == 5) {
            this.field1589 = var5;
            this.field1602 = var14;
            this.field1598 = var7;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lhb;II)V", line = 129)
    public final void method97(class35 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field1603 = arg0.method260((byte) 117);
        } else if (arg2 == 1) {
            this.field1599 = (arg0.method242((byte) -93) << 12) / 100;
        } else if (arg2 == 2) {
            this.field1585 = (arg0.method242((byte) -93) << 12) / 100;
        }
        if (arg1 != -18061) {
            method806((byte) -6, (class45) null);
        }
        field1593++;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIBIIII)V", line = 172)
    public static final void method803(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = class257.method1784((byte) 91, arg5, class34.field432, class75.field1064);
        field1588++;
        if (arg2 >= -84) {
            method806((byte) -66, (class45) null);
        }
        int var8 = class257.method1784((byte) 91, arg0, class34.field432, class75.field1064);
        int var9 = class257.method1784((byte) 91, arg3, class298.field4667, class327.field5072);
        int var10 = class257.method1784((byte) 91, arg4, class298.field4667, class327.field5072);
        int var11 = class257.method1784((byte) 91, arg5 + arg1, class34.field432, class75.field1064);
        int var12 = class257.method1784((byte) 91, arg0 - arg1, class34.field432, class75.field1064);
        for (int var13 = var7; var13 < var11; var13++) {
            class138.method1047(arg6, var10, var9, 7, class320.field4990[var13]);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class138.method1047(arg6, var10, var9, 7, class320.field4990[var14]);
        }
        int var15 = class257.method1784((byte) 91, arg1 + arg3, class298.field4667, class327.field5072);
        int var16 = class257.method1784((byte) 91, arg4 - arg1, class298.field4667, class327.field5072);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class320.field4990[var17];
            class138.method1047(arg6, var15, var9, 7, var18);
            class138.method1047(arg6, var10, var16, 7, var18);
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)[[I", line = 218)
    public final int[][] method99(int arg0, int arg1) {
        if (arg1 != -23387) {
            return (int[][]) ((int[][]) null);
        }
        field1597++;
        int[][] var3 = this.field2645.method1456(arg0, (byte) -113);
        if (this.field2645.field3203) {
            int[][] var4 = this.method1285(0, arg0, 27847);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class287.field4415; var11++) {
                this.method807(var5[var11], false, var7[var11], var6[var11]);
                this.field1590 += this.field1585;
                this.field1594 += this.field1599;
                if (this.field1590 < 0) {
                    this.field1590 = 0;
                }
                this.field1592 += this.field1603;
                if (this.field1590 > 4096) {
                    this.field1590 = 4096;
                }
                while (this.field1592 < 0) {
                    this.field1592 += 4096;
                }
                while (this.field1592 > 4096) {
                    this.field1592 -= 4096;
                }
                if (this.field1594 < 0) {
                    this.field1594 = 0;
                }
                if (this.field1594 > 4096) {
                    this.field1594 = 4096;
                }
                this.method802(this.field1594, false, this.field1590, this.field1592);
                var9[var11] = this.field1589;
                var8[var11] = this.field1598;
                var10[var11] = this.field1602;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)V", line = 290)
    public static final void method804(int arg0, int arg1) {
        if (class235.field3602.field4507 - (class235.field3602.method929(12) - 1) * 64 >> 7 == class327.field5075 && (class235.field3602.field4496 + 64 - (class235.field3602.method929(12) * 64) >> 7) == class261.field3868) {
            class327.field5075 = 0;
        }
        field1591++;
        int var2 = class262.field3900;
        if (arg1 == 0) {
            var2 = 1;
        }
        int var10002;
        for (int var3 = 0; var3 < var2; var3++) {
            class121 var4;
            if (arg1 == 0) {
                var4 = class235.field3602;
            } else {
                var4 = class319.field4964[class225.field3504[var3]];
            }
            if (var4 != null && var4.method409(1)) {
                int var5 = var4.method929(12);
                if (arg1 == 0 || arg1 == var5) {
                    if (var5 == 1) {
                        if ((var4.field4507 & 0x7F) == 64 && (var4.field4496 & 0x7F) == 64) {
                            int var6 = var4.field4507 >> 7;
                            int var7 = var4.field4496 >> 7;
                            if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                                var10002 = class96.field1410[var6][var7]++;
                            }
                        }
                    } else if (((var5 & 0x1) != 0 || (var4.field4507 & 0x7F) == 0 && (var4.field4496 & 0x7F) == 0) && ((var5 & 0x1) != 1 || (var4.field4507 & 0x7F) == 64 && (var4.field4496 & 0x7F) == 64)) {
                        int var8 = var4.field4507 - (var5 * 64) >> 7;
                        int var9 = var4.field4496 - (var5 * 64) >> 7;
                        int var10 = var8 + var4.method929(12);
                        int var11 = var9 + var4.method929(12);
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        if (var11 > 104) {
                            var11 = 104;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        if (var10 > 104) {
                            var10 = 104;
                        }
                        for (int var12 = var8; var12 < var10; var12++) {
                            for (int var13 = var9; var13 < var11; var13++) {
                                var10002 = class96.field1410[var12][var13]++;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 < 7) {
            return;
        }
        label232: for (int var14 = 0; var14 < var2; var14++) {
            class121 var15;
            long var16;
            if (arg1 == 0) {
                var15 = class235.field3602;
                var16 = 8791798054912L;
            } else {
                var15 = class319.field4964[class225.field3504[var14]];
                var16 = (long) class225.field3504[var14] << 32;
            }
            if (var15 != null && var15.method409(1)) {
                int var18 = var15.method929(12);
                if (arg1 == 0 || arg1 == var18) {
                    var15.field1915 = false;
                    var15.field4500 = true;
                    if ((class154.field2327 && class262.field3900 > 200 || class262.field3900 > 50) && arg1 != 0 && var15.field4527 == var15.method2030(-13196).field2084) {
                        var15.field1915 = true;
                    }
                    if (var18 == 1) {
                        if ((var15.field4507 & 0x7F) == 64 && (var15.field4496 & 0x7F) == 64) {
                            int var19 = var15.field4496 >> 7;
                            int var20 = var15.field4507 >> 7;
                            if (var20 < 0 || var20 >= 104 || var19 < 0 || var19 >= 104) {
                                continue;
                            }
                            if (class96.field1410[var20][var19] > 1) {
                                var10002 = class96.field1410[var20][var19]--;
                                continue;
                            }
                        }
                    } else if ((var18 & 0x1) == 0 && (var15.field4507 & 0x7F) == 0 && (var15.field4496 & 0x7F) == 0 || (var18 & 0x1) == 1 && (var15.field4507 & 0x7F) == 64 && (var15.field4496 & 0x7F) == 0) {
                        int var21 = var15.field4496 - var18 * 64 >> 7;
                        int var22 = var15.field4507 - var18 * 64 >> 7;
                        boolean var23 = true;
                        int var24 = var18 + var21;
                        if (var24 > 104) {
                            var24 = 104;
                        }
                        if (var21 < 0) {
                            var21 = 0;
                        }
                        int var25 = var22 + var18;
                        if (var22 < 0) {
                            var22 = 0;
                        }
                        if (var25 > 104) {
                            var25 = 104;
                        }
                        for (int var26 = var22; var26 < var25; var26++) {
                            for (int var27 = var21; var27 < var24; var27++) {
                                if (class96.field1410[var26][var27] <= 1) {
                                    var23 = false;
                                    break;
                                }
                            }
                        }
                        if (var23) {
                            int var28 = var22;
                            while (true) {
                                if (var28 >= var25) {
                                    continue label232;
                                }
                                for (int var29 = var21; var29 < var24; var29++) {
                                    var10002 = class96.field1410[var28][var29]--;
                                }
                                var28++;
                            }
                        }
                    }
                    if (var15.field4451 == null || var15.field4462 > class312.field4852 || class312.field4852 >= var15.field4454) {
                        var15.field4500 = false;
                        var15.field4510 = class294.method2080(899, var15.field4496, var15.field4507, class50.field775);
                        class141.method1063(class50.field775, var15.field4507, var15.field4496, var15.field4510, (var18 - 1) * 64 + 60, var15, var15.field4438, var16, var15.field4459);
                    } else {
                        var15.field4500 = false;
                        var15.field1915 = false;
                        var15.field4510 = class294.method2080(899, var15.field4496, var15.field4507, class50.field775);
                        class41.method369(class50.field775, var15.field4507, var15.field4496, var15.field4510, var15, var15.field4438, var16, var15.field4498, var15.field4489, var15.field4475, var15.field4525);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(Z)V", line = 566)
    public static final void method805(boolean arg0) {
        class130.field2033++;
        if (!arg0) {
            field1595++;
            class159.field2372.method59(111, (byte) 73);
            class159.field2372.method263(class291.field4570, (byte) 105);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLfk;)I", line = 579)
    public static final int method806(byte arg0, class45 arg1) {
        field1587++;
        class183 var2 = arg1.field698;
        if (var2.field2738 != null) {
            var2 = var2.method1329(93);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field2764;
        if (arg0 > -114) {
            field1586 = -114;
        }
        class132 var4 = arg1.method2030(-13196);
        if (arg1.field4527 == var4.field2084) {
            var3 = var2.field2797;
        } else if (arg1.field4527 == var4.field2072 || arg1.field4527 == var4.field2081 || arg1.field4527 == var4.field2065 || arg1.field4527 == var4.field2075) {
            var3 = var2.field2741;
        } else if (arg1.field4527 == var4.field2048 || arg1.field4527 == var4.field2071 || arg1.field4527 == var4.field2079 || arg1.field4527 == var4.field2078) {
            var3 = var2.field2756;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(IZII)V", line = 639)
    private final void method807(int arg0, boolean arg1, int arg2, int arg3) {
        int var5 = arg0 > arg3 ? arg0 : arg3;
        if (arg1) {
            this.method802(-77, true, -54, -16);
        }
        field1600++;
        int var6 = var5 >= arg2 ? var5 : arg2;
        int var7 = arg0 >= arg3 ? arg3 : arg0;
        int var8 = var7 <= arg2 ? var7 : arg2;
        this.field1590 = (var8 + var6) / 2;
        int var9 = var6 - var8;
        if (var9 > 0) {
            int var10 = (var6 - arg0 << 12) / var9;
            int var11 = (var6 - arg3 << 12) / var9;
            int var12 = (var6 - arg2 << 12) / var9;
            if (arg0 == var6) {
                this.field1592 = arg3 == var8 ? var12 + 20480 : -var11 + 4096;
            } else if (arg3 == var6) {
                this.field1592 = arg2 == var8 ? var10 + 4096 : -var12 + 12288;
            } else {
                this.field1592 = arg0 == var8 ? var11 + 12288 : 20480 - var10;
            }
            this.field1592 /= 6;
        } else {
            this.field1592 = 0;
        }
        if (this.field1590 > 0 && this.field1590 < 4096) {
            this.field1594 = (var9 << 12) / (this.field1590 <= 2048 ? this.field1590 * 2 : 8192 - this.field1590 * 2);
        } else {
            this.field1594 = 0;
        }
    }
}
