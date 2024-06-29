import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class84 extends class52 {

    @OriginalMember(owner = "client!fca", name = "kd", descriptor = "I")
    public int field1531 = -1;

    @OriginalMember(owner = "client!fca", name = "bd", descriptor = "I")
    public int field1522 = -1;

    @OriginalMember(owner = "client!fca", name = "md", descriptor = "I")
    public static int field1533 = -1;

    @OriginalMember(owner = "client!fca", name = "dd", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!fca", name = "ed", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!fca", name = "fd", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!fca", name = "gd", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!fca", name = "hd", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!fca", name = "id", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!fca", name = "jd", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!fca", name = "ld", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!fca", name = "nd", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!fca", name = "od", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!fca", name = "pd", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!fca", name = "qd", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!fca", name = "rd", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!fca", name = "sd", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!fca", name = "td", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!fca", name = "ud", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!fca", name = "vd", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!fca", name = "wd", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!fca", name = "xd", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!fca", name = "cd", descriptor = "Lnp;")
    public class488 field1523;

    @OriginalMember(owner = "client!fca", name = "i", descriptor = "(B)Z", line = 3)
    public final boolean method804(byte arg0) {
        ++field1532;
        if (this.field1523 == null) {
            return false;
        } else {
            return arg0 >= -106 ? true : true;
        }
    }

    @OriginalMember(owner = "client!fca", name = "f", descriptor = "(I)V", line = 21)
    public final void method400(int arg0) {
        ++field1528;
        if (arg0 > 33) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(IZIIZI)V", line = 32)
    public final void method805(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5) {
        super.field649 = super.field659 = (byte) arg0;
        ++field1526;
        if (class634.method3647(-59, arg5, arg2)) {
            ++super.field659;
        }
        if (super.field944 != -1 && class698.field9806.method851(super.field944, -2).field10062 == 1) {
            super.field944 = -1;
            super.field885 = null;
        }
        if (super.field957 != -1) {
            class164 var7 = class638.field9104.method3753(-45, super.field957);
            if (var7.field2412 && ~var7.field2427 != 0 && ~class698.field9806.method851(var7.field2427, -2).field10062 == -2) {
                super.field957 = -1;
            }
        }
        if (~super.field908 != 0) {
            class164 var8 = class638.field9104.method3753(115, super.field908);
            if (var8.field2412 && ~var8.field2427 != 0 && class698.field9806.method851(var8.field2427, -2).field10062 == 1) {
                super.field908 = -1;
            }
        }
        if (!arg4) {
            int var9 = -super.field991[0] + arg2;
            int var10 = arg5 - super.field995[0];
            if (~var9 <= 7 && ~var9 >= -9 && var10 >= -8 && ~var10 >= -9) {
                if (super.field992 < 9) {
                    ++super.field992;
                }
                for (int var11 = super.field992; var11 > 0; --var11) {
                    super.field991[var11] = super.field991[var11 + -1];
                    super.field995[var11] = super.field995[var11 + -1];
                    super.field986[var11] = super.field986[var11 + -1];
                }
                super.field991[0] = arg2;
                super.field986[0] = 1;
                super.field995[0] = arg5;
                return;
            }
        }
        super.field989 = 0;
        if (arg1) {
            this.field1522 = 79;
        }
        super.field992 = 0;
        super.field988 = 0;
        super.field991[0] = arg2;
        super.field995[0] = arg5;
        super.field644 = (super.field991[0] << 9) + (arg3 << 8);
        super.field648 = (super.field995[0] << 9) + (arg3 << 8);
        if (super.field993 != null) {
            super.field993.method4178();
        }
    }

    @OriginalMember(owner = "client!fca", name = "h", descriptor = "(B)Z", line = 119)
    public final boolean method402(byte arg0) {
        ++field1536;
        if (arg0 < 28) {
            field1533 = -102;
        }
        return false;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(BII)V", line = 131)
    public final void method806(byte arg0, int arg1, int arg2) {
        ++field1525;
        int var4 = super.field991[0];
        int var5 = super.field995[0];
        if (~arg1 == -1) {
            ++var5;
        }
        if (arg1 == 1) {
            ++var5;
            ++var4;
        }
        if (arg1 == 2) {
            ++var4;
        }
        if (arg1 == 3) {
            --var5;
            ++var4;
        }
        if (arg1 == 4) {
            --var5;
        }
        if (arg1 == 5) {
            --var4;
            --var5;
        }
        if (arg1 == 6) {
            --var4;
        }
        if (super.field944 != -1 && class698.field9806.method851(super.field944, arg0 ^ -100).field10062 == 1) {
            super.field885 = null;
            super.field944 = -1;
        }
        if (~arg1 == -8) {
            ++var5;
            --var4;
        }
        if (super.field957 != -1) {
            class164 var6 = class638.field9104.method3753(arg0 + 20, super.field957);
            if (var6.field2412 && var6.field2427 != -1 && class698.field9806.method851(var6.field2427, -2).field10062 == 1) {
                super.field957 = -1;
            }
        }
        if (arg0 == 98) {
            if (super.field908 != -1) {
                class164 var7 = class638.field9104.method3753(-71, super.field908);
                if (var7.field2412 && var7.field2427 != -1 && ~class698.field9806.method851(var7.field2427, arg0 ^ -100).field10062 == -2) {
                    super.field908 = -1;
                }
            }
            if (super.field992 < 9) {
                ++super.field992;
            }
            for (int var8 = super.field992; ~var8 < -1; --var8) {
                super.field991[var8] = super.field991[var8 + -1];
                super.field995[var8] = super.field995[var8 + -1];
                super.field986[var8] = super.field986[var8 - 1];
            }
            super.field991[0] = var4;
            super.field995[0] = var5;
            super.field986[0] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(BILha;Lgs;ZII)V", line = 228)
    public final void method405(byte arg0, int arg1, class58 arg2, class43 arg3, boolean arg4, int arg5, int arg6) {
        if (arg0 <= -5) {
            ++field1544;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lha;IZI)Z", line = 243)
    public final boolean method390(class58 arg0, int arg1, boolean arg2, int arg3) {
        ++field1539;
        if (this.field1523 != null && this.method807(true, arg0, 131072)) {
            class280 var5 = arg0.method530();
            int var6 = super.field888.method2999(16383);
            var5.method150(var6);
            var5.method149(super.field644, super.field651, super.field648);
            boolean var7 = false;
            for (int var8 = 0; var8 < super.field990.length; ++var8) {
                if (super.field990[var8] != null) {
                    boolean var10000;
                    label47: {
                        if (~this.field1523.field6898 >= -1) {
                            label45: {
                                if (this.field1523.field6932 != -1) {
                                    if (~this.field1523.field6932 == -2) {
                                        break label45;
                                    }
                                    var10000 = false;
                                } else {
                                    if (~this.field1523.field6911 == -2) {
                                        break label45;
                                    }
                                    var10000 = false;
                                }
                                if (!var10000) {
                                    var10000 = false;
                                    break label47;
                                }
                            }
                        }
                        var10000 = true;
                    }
                    boolean var9 = var10000;
                    boolean var10;
                    if (!class339.field4781) {
                        var10 = super.field990[var8].method348(arg3, arg1, var5, var9, this.field1523.field6898);
                    } else {
                        var10 = super.field990[var8].method318(arg3, arg1, var5, var9, this.field1523.field6898, class220.field3129);
                    }
                    if (var10) {
                        var7 = true;
                        break;
                    }
                }
            }
            if (!arg2) {
                this.method390((class58) null, -75, false, -83);
            }
            super.field990[0] = super.field990[1] = super.field990[2] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(ZLha;I)Z", line = 305)
    private final boolean method807(boolean arg0, class58 arg1, int arg2) {
        ++field1543;
        int var4 = arg2;
        class500 var5 = this.method464((byte) -21);
        class718 var6 = super.field944 != -1 && super.field911 == 0 ? class698.field9806.method851(super.field944, -2) : null;
        if (!arg0) {
            this.field1523 = null;
        }
        class718 var7 = ~super.field939 == 0 || super.field886 && var6 != null ? null : class698.field9806.method851(super.field939, -2);
        int var8 = var5.field7118;
        int var9 = var5.field7135;
        if (~var8 != -1 || ~var9 != -1 || ~var5.field7128 != -1 || var5.field7133 != 0) {
            arg2 |= 7;
        }
        boolean var10 = super.field887 != 0 && class605.field8787 >= super.field958 && ~super.field907 < ~class605.field8787;
        if (var10) {
            arg2 |= 524288;
        }
        int var11 = super.field888.method2999(16383);
        class469 var12 = super.field990[0] = this.field1523.method2932(arg1, super.field950, super.field923, var7, -23434, super.field966, class675.field9475, super.field914, var11, super.field904, super.field953, super.field970, class698.field9806, class742.field10408, var6, super.field937, arg2);
        if (var12 == null) {
            return false;
        } else {
            super.field918 = var12.method338();
            super.field889 = var12.method324();
            this.method473(var12, 0);
            if (var8 == 0 && var9 == 0) {
                this.method475(this.method482(!arg0) << 9, var11, this.method482(false) << 9, 0, 0, -20);
            } else {
                this.method475(var9, var11, var8, var5.field7148, var5.field7131, -96);
                if (super.field912 != 0) {
                    super.field990[0].method344(super.field912);
                }
                if (~super.field942 != -1) {
                    super.field990[0].method310(super.field942);
                }
                if (super.field902 != 0) {
                    super.field990[0].method349(0, super.field902, 0);
                }
            }
            if (var10) {
                var12.method321(super.field926, super.field929, super.field974, 255 & super.field887);
            }
            if (super.field957 != -1 && ~super.field890 != 0) {
                class164 var13 = class638.field9104.method3753(-96, super.field957);
                boolean var14 = var13.field2417 == 3 && (var8 != 0 || ~var9 != -1);
                int var15 = var4;
                if (var14) {
                    var15 = var4 | 7;
                } else {
                    if (~super.field909 != -1) {
                        var15 = var4 | 5;
                    }
                    if (~super.field955 != -1) {
                        var15 |= 2;
                    }
                    if (super.field922 != 0) {
                        var15 |= 7;
                    }
                }
                class469 var16 = super.field990[1] = var13.method1222(super.field906, super.field890, arg1, super.field940, var15, class698.field9806, 75);
                if (var16 != null) {
                    if (super.field922 < 0) {
                        if (super.field909 != 0) {
                            var16.method360(super.field909 * 2048);
                        }
                    } else {
                        int var17 = 0;
                        int var18 = 0;
                        int var19 = 0;
                        if (var5.field7113 != null && var5.field7113[super.field922] != null) {
                            var19 += var5.field7113[super.field922][2];
                            var18 += var5.field7113[super.field922][1];
                            var17 += var5.field7113[super.field922][0];
                        }
                        if (var5.field7160 != null && var5.field7160[super.field922] != null) {
                            var19 += var5.field7160[super.field922][2];
                            var18 += var5.field7160[super.field922][1];
                            var17 += var5.field7160[super.field922][0];
                        }
                        if (~var19 != -1 || var17 != 0) {
                            int var20 = var11;
                            if (super.field966 != null && ~super.field966[super.field922] != 0) {
                                var20 = super.field966[super.field922];
                            }
                            int var21 = super.field909 * 2048 + var20 + -var11 & 16383;
                            if (var21 != 0) {
                                var16.method360(var21);
                            }
                            int var22 = class316.field4487[var21];
                            int var23 = class316.field4490[var21];
                            int var24 = var17 * var23 + var19 * var22 >> 14;
                            var19 = var19 * var23 - var17 * var22 >> 14;
                            var17 = var24;
                        }
                        var16.method349(var17, var18, var19);
                    }
                    if (~super.field955 != -1) {
                        var16.method349(0, -super.field955 << 2, 0);
                    }
                    if (var14) {
                        if (super.field912 != 0) {
                            var16.method344(super.field912);
                        }
                        if (~super.field942 != -1) {
                            var16.method310(super.field942);
                        }
                        if (~super.field902 != -1) {
                            var16.method349(0, super.field902, 0);
                        }
                    }
                }
            } else {
                super.field990[1] = null;
            }
            if (~super.field908 != 0 && super.field880 != -1) {
                class164 var25 = class638.field9104.method3753(89, super.field908);
                boolean var26 = ~var25.field2417 == -4 && (~var8 != -1 || var9 != 0);
                int var27 = var4;
                if (var26) {
                    var27 = var4 | 7;
                } else {
                    if (super.field932 != 0) {
                        var27 = var4 | 5;
                    }
                    if (super.field925 != 0) {
                        var27 |= 2;
                    }
                    if (~super.field896 != -1) {
                        var27 |= 7;
                    }
                }
                class469 var28 = super.field990[2] = var25.method1220(var27, 0, super.field880, class698.field9806, super.field882, arg1, super.field910);
                if (var28 != null) {
                    if (~super.field896 <= -1 && var5.field7113 != null && var5.field7113[super.field896] != null) {
                        int var29 = 0;
                        int var30 = 0;
                        int var31 = 0;
                        if (var5.field7113 != null && var5.field7113[super.field896] != null) {
                            var31 += var5.field7113[super.field896][2];
                            var30 += var5.field7113[super.field896][1];
                            var29 += var5.field7113[super.field896][0];
                        }
                        if (var5.field7160 != null && var5.field7160[super.field896] != null) {
                            var31 += var5.field7160[super.field896][2];
                            var30 += var5.field7160[super.field896][1];
                            var29 += var5.field7160[super.field896][0];
                        }
                        if (~var31 != -1 || var29 != 0) {
                            int var32 = var11;
                            if (super.field966 != null && super.field966[super.field896] != -1) {
                                var32 = super.field966[super.field896];
                            }
                            int var33 = 16383 & super.field932 * 2048 + -var11 + var32;
                            if (var33 != 0) {
                                var28.method360(var33);
                            }
                            int var34 = class316.field4487[var33];
                            int var35 = class316.field4490[var33];
                            int var36 = var31 * var34 - -(var29 * var35) >> 14;
                            var31 = var31 * var35 + -(var29 * var34) >> 14;
                            var29 = var36;
                        }
                        var28.method349(var29, var30, var31);
                    } else if (super.field932 != 0) {
                        var28.method360(super.field932 * 2048);
                    }
                    if (super.field925 != 0) {
                        var28.method349(0, -super.field925 << 2, 0);
                    }
                    if (var26) {
                        if (~super.field912 != -1) {
                            var28.method344(super.field912);
                        }
                        if (super.field942 != 0) {
                            var28.method310(super.field942);
                        }
                        if (~super.field902 != -1) {
                            var28.method349(0, super.field902, 0);
                        }
                    }
                }
            } else {
                super.field990[2] = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "(BLha;)Lvw;", line = 586)
    public final class304 method396(byte arg0, class58 arg1) {
        ++field1527;
        if (this.field1523 != null && this.method807(true, arg1, 2048)) {
            class280 var3 = arg1.method530();
            int var4 = super.field888.method2999(16383);
            var3.method150(var4);
            class416 var5 = class390.field5454[super.field649][super.field644 >> class440.field6142][super.field648 >> class440.field6142];
            if (var5 != null && var5.field5846 != null) {
                int var6 = -var5.field5846.field8175 + super.field969;
                super.field969 = (int) ((float) super.field969 - (float) var6 / 10.0F);
            } else {
                super.field969 = (int) ((float) super.field969 - (float) super.field969 / 10.0F);
            }
            if (arg0 < 3) {
                field1534 = -38;
            }
            var3.method149(super.field644, -super.field969 + super.field651 + -20, super.field648);
            class500 var7 = this.method464((byte) 126);
            class488 var8 = this.field1523.field6923 != null ? this.field1523.method2926(8730, class742.field10408) : this.field1523;
            super.field985 = false;
            class304 var9 = null;
            if (~class471.field6781.field6713.method3504(27669) == -2 && var8.field6919 && var7.field7124) {
                class718 var10 = super.field944 != -1 && super.field911 == 0 ? class698.field9806.method851(super.field944, -2) : null;
                class718 var11 = ~super.field939 == 0 || super.field886 && var10 != null ? null : class698.field9806.method851(super.field939, -2);
                class469 var12 = class19.method115(255 & this.field1523.field6942, 65535 & this.field1523.field6906, this.field1523.field6911, super.field990[0], arg1, var4, super.field902, var11 == null ? super.field950 : super.field970, super.field912, 255 & this.field1523.field6937, super.field942, 32722, this.field1523.field6897 & 65535, var11 == null ? var10 : var11);
                if (var12 != null) {
                    var9 = class359.method2239(super.field990.length - -1, this.method808((byte) -13), (byte) 124);
                    super.field985 = true;
                    arg1.method539(false);
                    if (class339.field4781) {
                        var12.method343(var3, var9.field4298[super.field990.length], class220.field3129, 0);
                    } else {
                        var12.method329(var3, var9.field4298[super.field990.length], 0);
                    }
                    arg1.method539(true);
                }
            }
            var3.method150(var4);
            var3.method149(super.field644, -super.field969 + super.field651 - 5, super.field648);
            if (var9 == null) {
                var9 = class359.method2239(super.field990.length, this.method808((byte) -13), (byte) 122);
            }
            this.method467(var3, (byte) -84, super.field990, arg1, false);
            if (class339.field4781) {
                for (int var13 = 0; var13 < super.field990.length; ++var13) {
                    if (super.field990[var13] != null) {
                        super.field990[var13].method343(var3, var9.field4298[var13], class220.field3129, 0);
                    }
                }
            } else {
                for (int var14 = 0; var14 < super.field990.length; ++var14) {
                    if (super.field990[var14] != null) {
                        super.field990[var14].method329(var3, var9.field4298[var14], 0);
                    }
                }
            }
            if (super.field993 != null) {
                class624 var15 = super.field993.method4185();
                if (!class339.field4781) {
                    arg1.method593(var15);
                } else {
                    arg1.method643(var15, class220.field3129);
                }
            }
            for (int var16 = 0; ~super.field990.length < ~var16; ++var16) {
                if (super.field990[var16] != null) {
                    super.field985 |= super.field990[var16].method332();
                }
            }
            super.field990[0] = super.field990[1] = super.field990[2] = null;
            super.field883 = class258.field3741;
            return var9;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fca", name = "j", descriptor = "(B)Z", line = 715)
    private final boolean method808(byte arg0) {
        if (arg0 != -13) {
            field1533 = 73;
        }
        ++field1541;
        return this.field1523.field6920;
    }

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "(BLha;)V", line = 732)
    public final void method401(byte arg0, class58 arg1) {
        ++field1524;
        if (this.field1523 != null) {
            if (super.field994 || this.method807(true, arg1, 0)) {
                if (arg0 != -39) {
                    this.method472(-61);
                }
                class280 var3 = arg1.method530();
                var3.method150(super.field888.method2999(16383));
                var3.method149(super.field644, super.field651 + -20, super.field648);
                this.method467(var3, (byte) -83, super.field990, arg1, super.field994);
                super.field990[0] = super.field990[1] = super.field990[2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!fca", name = "l", descriptor = "(I)I", line = 765)
    public final int method479(int arg0) {
        if (arg0 >= -27) {
            return 86;
        } else {
            ++field1535;
            if (this.field1523.field6923 != null) {
                class488 var2 = this.field1523.method2926(8730, class742.field10408);
                if (var2 != null && var2.field6931 != -1) {
                    return var2.field6931;
                }
            }
            return this.field1523.field6931;
        }
    }

    @OriginalMember(owner = "client!fca", name = "m", descriptor = "(I)I", line = 787)
    public final int method480(int arg0) {
        if (arg0 != 18131) {
            return 81;
        } else {
            ++field1540;
            if (this.field1523.field6923 != null) {
                class488 var2 = this.field1523.method2926(8730, class742.field10408);
                if (var2 != null && var2.field6968 != -1) {
                    return var2.field6968;
                }
            }
            return ~this.field1523.field6968 != 0 ? this.field1523.field6968 : super.method480(18131);
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lnp;I)V", line = 810)
    public final void method809(class488 arg0, int arg1) {
        this.field1523 = arg0;
        if (arg1 == -1) {
            ++field1529;
            if (super.field993 != null) {
                super.field993.method4178();
            }
        }
    }

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "(I)I", line = 825)
    public final int method472(int arg0) {
        int var2 = 65 / ((arg0 - 88) / 36);
        ++field1538;
        if (this.field1523.field6923 != null) {
            class488 var3 = this.field1523.method2926(8730, class742.field10408);
            if (var3 != null && ~var3.field6921 != 0) {
                return var3.field6921;
            }
        }
        return this.field1523.field6921;
    }

    @OriginalMember(owner = "client!fca", name = "e", descriptor = "(B)I", line = 849)
    public final int method394(byte arg0) {
        ++field1542;
        if (this.field1523 == null) {
            return 0;
        } else {
            if (arg0 != 1) {
                this.method804((byte) 50);
            }
            return this.field1523.field6898;
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lha;Z)Ltb;", line = 868)
    public final class397 method397(class58 arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            ++field1537;
            return null;
        }
    }
}
