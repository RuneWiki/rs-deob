import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class44 extends class58 {

    @OriginalMember(owner = "client!rh", name = "Ob", descriptor = "I")
    public int field760 = 0;

    @OriginalMember(owner = "client!rh", name = "Pb", descriptor = "I")
    private int field761 = 0;

    @OriginalMember(owner = "client!rh", name = "Ub", descriptor = "Z")
    public boolean field766 = false;

    @OriginalMember(owner = "client!rh", name = "bc", descriptor = "I")
    public int field773 = 0;

    @OriginalMember(owner = "client!rh", name = "fc", descriptor = "S")
    private short field777 = 0;

    @OriginalMember(owner = "client!rh", name = "oc", descriptor = "I")
    public int field786 = 0;

    @OriginalMember(owner = "client!rh", name = "mc", descriptor = "I")
    public int field784 = -1;

    @OriginalMember(owner = "client!rh", name = "jc", descriptor = "I")
    public int field781 = -1;

    @OriginalMember(owner = "client!rh", name = "pc", descriptor = "I")
    public int field787 = -1;

    @OriginalMember(owner = "client!rh", name = "hc", descriptor = "I")
    public int field779 = -1;

    @OriginalMember(owner = "client!rh", name = "ic", descriptor = "I")
    public int field780 = 0;

    @OriginalMember(owner = "client!rh", name = "Tb", descriptor = "I")
    public int field765 = -1;

    @OriginalMember(owner = "client!rh", name = "uc", descriptor = "I")
    public int field792 = 0;

    @OriginalMember(owner = "client!rh", name = "xc", descriptor = "I")
    public int field795 = 0;

    @OriginalMember(owner = "client!rh", name = "vc", descriptor = "S")
    private short field793 = 0;

    @OriginalMember(owner = "client!rh", name = "Zb", descriptor = "Ljd;")
    public static class85 field771 = class221.method1499("Freie Welt", (byte) -61);

    @OriginalMember(owner = "client!rh", name = "dc", descriptor = "I")
    public static int field775 = 0;

    @OriginalMember(owner = "client!rh", name = "Xb", descriptor = "[I")
    public static int[] field769 = new int[] { 4, 4, 1, 2, 6, 4, 2, 50, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!rh", name = "Lb", descriptor = "I")
    public int field757;

    @OriginalMember(owner = "client!rh", name = "Mb", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!rh", name = "Nb", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!rh", name = "Rb", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!rh", name = "Sb", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!rh", name = "Vb", descriptor = "I")
    public int field767;

    @OriginalMember(owner = "client!rh", name = "Wb", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!rh", name = "Yb", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!rh", name = "ac", descriptor = "I")
    public int field772;

    @OriginalMember(owner = "client!rh", name = "gc", descriptor = "I")
    public int field778;

    @OriginalMember(owner = "client!rh", name = "lc", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!rh", name = "qc", descriptor = "I")
    public int field788;

    @OriginalMember(owner = "client!rh", name = "rc", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!rh", name = "sc", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!rh", name = "tc", descriptor = "I")
    public int field791;

    @OriginalMember(owner = "client!rh", name = "wc", descriptor = "I")
    public int field794;

    @OriginalMember(owner = "client!rh", name = "nc", descriptor = "Lje;")
    public static class178 field785;

    @OriginalMember(owner = "client!rh", name = "yc", descriptor = "Lda;")
    public class180 field796;

    @OriginalMember(owner = "client!rh", name = "ec", descriptor = "Lwb;")
    public class26 field776;

    @OriginalMember(owner = "client!rh", name = "kc", descriptor = "Lge;")
    public static class68 field782;

    @OriginalMember(owner = "client!rh", name = "Qb", descriptor = "Ljd;")
    public class85 field762;

    @OriginalMember(owner = "client!rh", name = "cc", descriptor = "[Lqf;")
    public static class232[] field774;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIIIIIIILwb;I)V")
    private final void method307(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class26 arg11, int arg12) {
        ++field768;
        int var14 = arg0 * arg0 + arg5 * arg5;
        if (var14 >= 16 && ~var14 >= -360001) {
            int var15 = (int) (Math.atan2((double) arg5, (double) arg0) * 325.949D) & arg9;
            class26 var16 = class201.method1382(arg3, super.field1042, -50, var15, arg11, super.field1045, super.field1027);
            if (var16 != null) {
                var16.method1(0, arg8, arg6, arg1, arg12, arg4, arg2, arg10, -1L);
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)Z")
    public final boolean method128(int arg0) {
        ++field783;
        if (this.field796 == null) {
            return false;
        } else {
            if (arg0 != 10) {
                this.field781 = -15;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field790;
        if (this.field796 != null) {
            class106 var11 = super.field1056 != -1 && super.field1053 == 0 ? class101.method704(1, super.field1056) : null;
            class106 var12 = super.field1057 == -1 || this.field766 || super.field1057 == super.field1014 && var11 != null ? null : class101.method704(1, super.field1057);
            class26 var13 = this.field796.method1243(var12, var11, super.field1044, super.field1032, 0);
            if (var13 != null) {
                super.field1012 = var13.method6();
                if (class273.field4826 && (this.field796.field3090 == -1 || class55.method370(true, this.field796.field3090).field4685)) {
                    class26 var14 = class45.method315(arg0, 0, super.field1065, super.field1045, -19071, 160, super.field1042, var12 == null ? var11 : var12, var12 == null ? super.field1044 : super.field1032, 1, super.field1027, 0, var13, 240);
                    var14.method1(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                }
                if (class22.field308 == this) {
                    for (int var15 = class7.field87.length - 1; ~var15 <= -1; --var15) {
                        class251 var16 = class7.field87[var15];
                        if (var16 != null && ~var16.field4309 != 0) {
                            if (var16.field4321 == 1 && ~var16.field4304 <= -1 && ~class194.field3320.length < ~var16.field4304) {
                                class17 var17 = class194.field3320[var16.field4304];
                                if (var17 != null) {
                                    int var18 = var17.field1042 / 32 + -(class22.field308.field1042 / 32);
                                    int var19 = var17.field1027 / 32 - class22.field308.field1027 / 32;
                                    this.method307(var19, arg3, arg6, var16.field4309, arg5, var18, arg2, arg0, arg1, 2047, arg7, var13, arg4);
                                }
                            }
                            if (~var16.field4321 == -3) {
                                int var20 = (-class244.field4172 + var16.field4306) * 4 - class22.field308.field1042 / 32 + 2;
                                int var21 = (-class213.field3742 + var16.field4301) * 4 + 2 + -(class22.field308.field1027 / 32);
                                this.method307(var21, arg3, arg6, var16.field4309, arg5, var20, arg2, arg0, arg1, 2047, arg7, var13, arg4);
                            }
                            if (~var16.field4321 == -11 && ~var16.field4304 <= -1 && class249.field4291.length > var16.field4304) {
                                class44 var22 = class249.field4291[var16.field4304];
                                if (var22 != null) {
                                    int var23 = var22.field1027 / 32 + -(class22.field308.field1027 / 32);
                                    int var24 = var22.field1042 / 32 + -(class22.field308.field1042 / 32);
                                    this.method307(var23, arg3, arg6, var16.field4309, arg5, var24, arg2, arg0, arg1, 2047, arg7, var13, arg4);
                                }
                            }
                        }
                    }
                }
                int var25 = 0;
                int var26 = 0;
                int var27 = 0;
                if (this.field777 != 0 && ~this.field793 != -1) {
                    int var28 = class173.field2984[arg0];
                    int var29 = class173.field2995[arg0];
                    short var30 = this.field777;
                    int var31 = -var30 / 2;
                    short var32 = this.field793;
                    int var33 = -var32 / 2;
                    int var34 = var28 * var33 - -(var29 * var31) >> 16;
                    int var35 = var29 * var33 + -(var28 * var31) >> 16;
                    int var36 = class246.method1660(604124551, super.field1042 + var34, class116.field2066, super.field1027 + var35);
                    int var37 = var30 / 2;
                    int var38 = -var32 / 2;
                    int var39 = var28 * var38 + var29 * var37 >> 16;
                    int var40 = var29 * var38 + -(var28 * var37) >> 16;
                    int var41 = class246.method1660(604124551, super.field1042 + var39, class116.field2066, super.field1027 + var40);
                    int var42 = -var30 / 2;
                    int var43 = var32 / 2;
                    int var44 = var29 * var43 + -(var28 * var42) >> 16;
                    int var45 = var28 * var43 + var29 * var42 >> 16;
                    int var46 = class246.method1660(604124551, super.field1042 + var45, class116.field2066, super.field1027 - -var44);
                    int var47 = var32 / 2;
                    int var48 = var30 / 2;
                    int var49 = var29 * var47 - var28 * var48 >> 16;
                    int var50 = var28 * var47 + var29 * var48 >> 16;
                    int var51 = class246.method1660(604124551, super.field1042 - -var50, class116.field2066, super.field1027 - -var49);
                    int var52 = var36 + var51;
                    if (var52 > var41 - -var46) {
                        var52 = var41 - -var46;
                    }
                    int var53 = ~var36 <= ~var41 ? var41 : var36;
                    int var54 = var46 >= var51 ? var51 : var46;
                    int var55 = var46 > var36 ? var36 : var46;
                    int var56 = var41 < var51 ? var41 : var51;
                    var26 = (int) (325.95D * Math.atan2((double) (-var54 + var53), (double) var32)) & 2047;
                    if (~var26 != -1) {
                        var13.method182(var26);
                    }
                    var25 = 2047 & (int) (325.95D * Math.atan2((double) (var55 - var56), (double) var30));
                    if (~var25 != -1) {
                        var13.method172(var25);
                    }
                    var27 = (var52 >> 1) + -super.field1045;
                    if (var27 != 0) {
                        var13.method177(0, var27, 0);
                    }
                }
                class26 var57 = null;
                if (!this.field766 && ~super.field1064 != 0 && super.field1022 != -1) {
                    class71 var58 = class87.method647((byte) 77, super.field1064);
                    var57 = var58.method497(0, super.field1022);
                    if (var57 != null) {
                        var57.method177(0, -super.field1051, 0);
                        if (var58.field1337) {
                            if (~var26 != -1) {
                                var57.method182(var26);
                            }
                            if (var25 != 0) {
                                var57.method172(var25);
                            }
                            if (~var27 != -1) {
                                var57.method177(0, var27, 0);
                            }
                        }
                    }
                }
                class26 var59 = null;
                if (!this.field766 && this.field776 != null) {
                    if (class151.field2555 >= this.field792) {
                        this.field776 = null;
                    }
                    if (~class151.field2555 <= ~this.field773 && this.field792 > class151.field2555) {
                        var59 = this.field776;
                        var59.method177(-super.field1042 + this.field778, this.field794 - super.field1045, -super.field1027 + this.field791);
                        if (super.field1047 == 512) {
                            var59.method189();
                        } else if (super.field1047 != 1024) {
                            if (super.field1047 == 1536) {
                                var59.method184();
                            }
                        } else {
                            var59.method181();
                        }
                    }
                }
                if (var57 != null) {
                    var13 = ((class42) var13).method293(var57);
                }
                if (var59 != null) {
                    var13 = ((class42) var13).method293(var59);
                }
                var13.field405 = true;
                var13.method1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
                if (var59 != null) {
                    if (~super.field1047 == -513) {
                        var59.method184();
                    } else if (super.field1047 != 1024) {
                        if (super.field1047 == 1536) {
                            var59.method189();
                        }
                    } else {
                        var59.method181();
                    }
                    var59.method177(-this.field778 + super.field1042, -this.field794 + super.field1045, super.field1027 - this.field791);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)Ljd;")
    public final class85 method308(int arg0) {
        if (arg0 != 0) {
            this.method1(-49, 106, -57, -85, 50, 32, -124, 16, 39L);
        }
        ++field770;
        class85 var2 = this.field762;
        if (class231.field3990 != null) {
            var2 = class172.method1150(new class85[] { class231.field3990[this.field761], var2 }, 0);
        }
        if (class153.field2610 != null) {
            var2 = class172.method1150(new class85[] { var2, class153.field2610[this.field761] }, 0);
        }
        return var2;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILik;)V")
    public final void method309(int arg0, class247 arg1) {
        ++field789;
        arg1.field4224 = 0;
        int var3 = arg1.method1711((byte) -67);
        int var4 = 1 & var3;
        boolean var5 = ~(4 & var3) != -1;
        if ((2 & var3) == 2) {
            this.field777 = (short) (arg1.method1711((byte) -67) << 2);
            this.field793 = (short) (arg1.method1711((byte) -67) << 2);
        } else {
            this.field793 = 0;
            this.field777 = 0;
        }
        int var6 = -1;
        int[] var7 = new int[12];
        int var8 = super.method311((byte) 55);
        this.method389(((var3 & 59) >> 3) + 1, (byte) -82);
        this.field761 = (var3 & 197) >> 6;
        super.field1042 += (this.method311((byte) 63) - var8) * 64;
        super.field1027 += (-var8 + this.method311((byte) -65)) * 64;
        this.field784 = arg1.method1690(true);
        this.field787 = arg1.method1690(true);
        this.field786 = 0;
        if (arg0 >= 56) {
            for (int var9 = 0; ~var9 > -13; ++var9) {
                int var10 = arg1.method1711((byte) -67);
                if (var10 == 0) {
                    var7[var9] = 0;
                } else {
                    int var11 = arg1.method1711((byte) -67);
                    int var12 = (var10 << 8) + var11;
                    if (var9 == 0 && ~var12 == -65536) {
                        var6 = arg1.method1694((byte) -100);
                        break;
                    }
                    if (var12 >= 32768) {
                        int var21 = class77.field1434[var12 + -32768];
                        var7[var9] = class75.method528(var21, 1073741824);
                        int var22 = class32.method221(11649, var21).field1129;
                        if (var22 != 0) {
                            this.field786 = var22;
                        }
                    } else {
                        var7[var9] = class75.method528(var12 - 256, Integer.MIN_VALUE);
                    }
                }
            }
            int[] var13 = new int[5];
            for (int var14 = 0; ~var14 > -6; ++var14) {
                int var20 = arg1.method1711((byte) -67);
                if (var20 < 0 || ~var20 <= ~class177.field3034[var14].length) {
                    var20 = 0;
                }
                var13[var14] = var20;
            }
            super.field1014 = arg1.method1694((byte) -100);
            if (super.field1014 == 65535) {
                super.field1014 = -1;
            }
            super.field1013 = arg1.method1694((byte) -100);
            if (super.field1013 == 65535) {
                super.field1013 = -1;
            }
            super.field1049 = super.field1013;
            super.field1011 = arg1.method1694((byte) -100);
            if (super.field1011 == 65535) {
                super.field1011 = -1;
            }
            super.field1024 = arg1.method1694((byte) -100);
            if (~super.field1024 == -65536) {
                super.field1024 = -1;
            }
            super.field1006 = arg1.method1694((byte) -100);
            if (super.field1006 == 65535) {
                super.field1006 = -1;
            }
            super.field1041 = arg1.method1694((byte) -100);
            if (~super.field1041 == -65536) {
                super.field1041 = -1;
            }
            super.field1054 = arg1.method1694((byte) -100);
            if (~super.field1054 == -65536) {
                super.field1054 = -1;
            }
            this.field762 = class116.method814(arg1.method1720((byte) -3), -66).method587((byte) -96);
            this.field760 = arg1.method1711((byte) -67);
            if (!var5) {
                this.field780 = 0;
            } else {
                this.field780 = arg1.method1694((byte) -100);
            }
            int var15 = this.field795;
            this.field795 = arg1.method1711((byte) -67);
            if (this.field795 != 0) {
                int var16 = this.field779;
                int var17 = this.field765;
                int var18 = this.field781;
                this.field779 = arg1.method1694((byte) -100);
                this.field765 = arg1.method1694((byte) -100);
                this.field781 = arg1.method1694((byte) -100);
                if (this.field795 != var15 || this.field779 != var16 || ~this.field765 != ~var17 || this.field781 != var18) {
                    class148.method967(this, (byte) 42);
                }
            } else {
                class190.method1308(this, (byte) 61);
            }
            if (this.field796 == null) {
                this.field796 = new class180();
            }
            int var19 = this.field796.field3090;
            this.field796.method1239(var6, var4 == 1, var7, -122, var13);
            if (var6 != var19) {
                super.field1042 = super.field1043[0] * 128 + 64 * this.method311((byte) 88);
                super.field1027 = super.field1066[0] * 128 - -(64 * this.method311((byte) -126));
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)V")
    public static final void method310(int arg0) {
        if (arg0 >= 14) {
            ++field759;
            if (!class121.method833((byte) -122) && ~class82.field1498 != ~class116.field2066) {
                class185.method1278(class67.field1232, class22.field308.field1043[0], false, class22.field308.field1066[0], 1, class116.field2066, class48.field849);
            } else if (~class232.field4008 != ~class116.field2066) {
                class232.field4008 = class116.field2066;
                class65.method438(class116.field2066, -4734);
                class124.method851(false);
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "()I")
    public final int method6() {
        ++field763;
        return super.field1012;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)I")
    public final int method311(byte arg0) {
        int var2 = -32 % ((18 - arg0) / 36);
        ++field758;
        return this.field796 != null && this.field796.field3090 != -1 ? class55.method370(true, this.field796.field3090).field4700 : super.method311((byte) 108);
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "(I)V")
    public static void method312(int arg0) {
        int var1 = -59 % ((arg0 - -2) / 63);
        field769 = null;
        field785 = null;
        field774 = null;
        field771 = null;
        field782 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIZ)V")
    public final void method313(int arg0, int arg1, int arg2, boolean arg3) {
        ++field764;
        super.method386(this.method311((byte) -61), arg0, arg3, (byte) 127, arg2);
        if (arg1 != 2) {
            this.method128(-88);
        }
    }
}
