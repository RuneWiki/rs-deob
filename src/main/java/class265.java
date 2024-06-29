import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class265 extends class752 implements class722 {

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "Z")
    private boolean field3481;

    @OriginalMember(owner = "client!mb", name = "Z", descriptor = "Z")
    private boolean field3484;

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "B")
    private byte field3474;

    @OriginalMember(owner = "client!mb", name = "bb", descriptor = "S")
    private short field3486;

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "Z")
    private boolean field3480;

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "B")
    private byte field3472;

    @OriginalMember(owner = "client!mb", name = "gb", descriptor = "Z")
    private boolean field3491;

    @OriginalMember(owner = "client!mb", name = "pb", descriptor = "Lr;")
    private class184 field3500;

    @OriginalMember(owner = "client!mb", name = "sb", descriptor = "Lka;")
    public class472 field3503;

    @OriginalMember(owner = "client!mb", name = "jb", descriptor = "Lrga;")
    public static class242 field3494 = new class242("game3", 2);

    @OriginalMember(owner = "client!mb", name = "ub", descriptor = "Z")
    public static boolean field3505 = false;

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!mb", name = "ab", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!mb", name = "cb", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!mb", name = "db", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!mb", name = "eb", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!mb", name = "fb", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!mb", name = "hb", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!mb", name = "ib", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!mb", name = "kb", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!mb", name = "lb", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!mb", name = "mb", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!mb", name = "nb", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!mb", name = "ob", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!mb", name = "qb", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!mb", name = "rb", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!mb", name = "tb", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "Loia;")
    private class90 field3482;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)Z", line = 3)
    public final boolean method126(int arg0) {
        ++field3477;
        if (this.field3503 != null) {
            return this.field3503.method219();
        } else {
            if (arg0 != 6540) {
                this.method128(true);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILha;)V", line = 28)
    public final void method678(int arg0, class60 arg1) {
        ++field3479;
        Object var3 = null;
        class184 var5;
        if (this.field3500 == null && this.field3491) {
            class696 var4 = this.method1588(262144, (byte) 101, arg1, true);
            var5 = var4 == null ? null : var4.field9720;
        } else {
            var5 = this.field3500;
            this.field3500 = null;
        }
        if (var5 != null) {
            class65.method500(var5, super.field2167, super.field2170, super.field2165, (boolean[]) null);
        }
        if (arg0 != -25163) {
            this.field3481 = true;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(Lha;I)Lbd;", line = 56)
    public final class62 method127(class60 arg0, int arg1) {
        ++field3496;
        if (this.field3503 == null) {
            return null;
        } else {
            class10 var3 = arg0.method410();
            var3.method33(super.field2170, super.field2178, super.field2165);
            if (arg1 >= -12) {
                this.method150((byte) -76);
            }
            class62 var4 = class413.method2384(1, (byte) -47, this.field3480);
            if (class670.field9312) {
                this.field3503.method243(var3, var4.field678[0], class661.field9249, 0);
            } else {
                this.field3503.method230(var3, var4.field678[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)I", line = 82)
    public final int method680(int arg0) {
        if (arg0 != 30472) {
            this.method162((class176) null, (byte) 46, false, -115, (class60) null, -54, -101);
        }
        ++field3478;
        return 65535 & this.field3486;
    }

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "(B)V", line = 94)
    public static final void method1585(byte arg0) {
        ++field3476;
        if (~class11.field68.field5524.method2687((byte) 125) == -3) {
            byte var1 = (byte) (class478.field6604 + -4 & 255);
            int var2 = class478.field6604 % class272.field3589;
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var18 = 0; class3.field26 > var18; ++var18) {
                    class410.field5781[var3][var2][var18] = var1;
                }
            }
            if (class61.field677 != 3) {
                int var4 = 0;
                if (arg0 != 72) {
                    method1589(-45);
                }
                while (~var4 > -3) {
                    class514.field6951[var4] = -1000000;
                    class387.field5465[var4] = 1000000;
                    class354.field4732[var4] = 0;
                    class569.field8019[var4] = 1000000;
                    class46.field483[var4] = 0;
                    ++var4;
                }
                int var5 = class653.field9086.field2170;
                int var6 = class653.field9086.field2165;
                if (~class8.field57 != -2 && ~class520.field6999 == 0) {
                    int var7 = class86.method624(class61.field677, class684.field9518, class294.field3956, 24111);
                    if (-class262.field3429 + var7 < 3200 && (4 & class114.field1506[class61.field677][class294.field3956 >> 9][class684.field9518 >> 9]) != 0) {
                        class531.method2934(class294.field3956 >> 9, 1, class77.field947, class684.field9518 >> 9, (byte) -76, false);
                        return;
                    }
                } else {
                    if (class8.field57 != 1) {
                        var6 = class39.field404;
                        var5 = class520.field6999;
                    }
                    if ((class114.field1506[class61.field677][var5 >> 9][var6 >> 9] & 4) != 0) {
                        class531.method2934(var5 >> 9, 0, class77.field947, var6 >> 9, (byte) -76, false);
                    }
                    if (~class74.field801 > -2561) {
                        int var8 = class294.field3956 >> 9;
                        int var9 = class684.field9518 >> 9;
                        int var10 = var5 >> 9;
                        int var11 = var6 >> 9;
                        int var12;
                        if (~var10 < ~var8) {
                            var12 = -var8 + var10;
                        } else {
                            var12 = -var10 + var8;
                        }
                        int var13;
                        if (~var9 <= ~var11) {
                            var13 = var9 - var11;
                        } else {
                            var13 = -var9 + var11;
                        }
                        if ((~var12 != -1 || var13 != 0) && ~var12 < ~(-class272.field3589) && ~class272.field3589 < ~var12 && -class3.field26 < var13 && var13 < class3.field26) {
                            if (var12 > var13) {
                                int var14 = var13 * 65536 / var12;
                                int var15 = 32768;
                                while (~var8 != ~var10) {
                                    if (~var10 >= ~var8) {
                                        if (var10 < var8) {
                                            --var8;
                                        }
                                    } else {
                                        ++var8;
                                    }
                                    if ((4 & class114.field1506[class61.field677][var8][var9]) != 0) {
                                        class531.method2934(var8, 1, class77.field947, var9, (byte) -76, false);
                                        return;
                                    }
                                    var15 += var14;
                                    if (~var15 <= -65537) {
                                        if (~var11 < ~var9) {
                                            ++var9;
                                        } else if (var9 > var11) {
                                            --var9;
                                        }
                                        var15 -= 65536;
                                        if ((class114.field1506[class61.field677][var8][var9] & 4) != 0) {
                                            class531.method2934(var8, 1, class77.field947, var9, (byte) -76, false);
                                            return;
                                        }
                                    }
                                }
                                return;
                            }
                            int var16 = var12 * 65536 / var13;
                            int var17 = 32768;
                            while (var9 != var11) {
                                if (~var11 >= ~var9) {
                                    if (~var9 < ~var11) {
                                        --var9;
                                    }
                                } else {
                                    ++var9;
                                }
                                if ((class114.field1506[class61.field677][var8][var9] & 4) != 0) {
                                    class531.method2934(var8, 1, class77.field947, var9, (byte) -76, false);
                                    return;
                                }
                                var17 += var16;
                                if (var17 >= 65536) {
                                    if (var10 <= var8) {
                                        if (~var8 < ~var10) {
                                            --var8;
                                        }
                                    } else {
                                        ++var8;
                                    }
                                    var17 -= 65536;
                                    if ((4 & class114.field1506[class61.field677][var8][var9]) != 0) {
                                        class531.method2934(var8, 1, class77.field947, var9, (byte) -76, false);
                                        return;
                                    }
                                }
                            }
                            return;
                        }
                        class760.method4223((Throwable) null, -127, "RC: " + var8 + "," + var9 + " " + var10 + "," + var11 + " " + class99.field1313 + "," + class133.field1704);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(Lha;I)V", line = 297)
    public final void method136(class60 arg0, int arg1) {
        int var3 = 3 / ((arg1 - 53) / 46);
        ++field3502;
    }

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)I", line = 307)
    public final int method132(int arg0) {
        ++field3498;
        if (arg0 != 0) {
            this.field3503 = null;
        }
        return this.field3503 == null ? 0 : this.field3503.method234();
    }

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "(B)V", line = 320)
    public final void method150(byte arg0) {
        ++field3492;
        if (arg0 != -73) {
            this.method150((byte) -74);
        }
        this.field3481 = false;
        if (this.field3503 != null) {
            this.field3503.method202(-65537 & this.field3503.method225());
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILha;)Lka;", line = 336)
    private final class472 method1586(int arg0, int arg1, class60 arg2) {
        ++field3485;
        if (this.field3503 != null && ~arg2.method396(this.field3503.method225(), arg1) == -1) {
            return this.field3503;
        } else if (arg0 >= -20) {
            return null;
        } else {
            class696 var4 = this.method1588(arg1, (byte) 123, arg2, false);
            return var4 != null ? var4.field9718 : null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLha;)Loia;", line = 356)
    public final class90 method134(byte arg0, class60 arg1) {
        if (arg0 != -53) {
            return null;
        } else {
            ++field3483;
            if (this.field3482 == null) {
                this.field3482 = class185.method1041(super.field2178, super.field2170, this.method1586(-128, 0, arg1), super.field2165, arg0 ^ -49);
            }
            return this.field3482;
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lha;Lvha;IIIIIZIIIIIIZ)V", line = 381)
    public class265(class60 arg0, class685 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field9585 == 1, class536.method2956(arg12, (byte) -41, arg13));
        this.field3481 = arg14;
        this.field3484 = arg7;
        this.field3474 = (byte) arg13;
        this.field3486 = (short) arg1.field9541;
        this.field3480 = ~arg1.field9610 != -1 && !arg7;
        super.field2167 = (byte) arg3;
        this.field3472 = (byte) arg12;
        this.field3491 = arg0.method381() && arg1.field9540 && !this.field3484 && ~class11.field68.field5545.method61((byte) 127) != -1;
        int var16 = 2048;
        if (this.field3481) {
            var16 |= 65536;
        }
        class696 var17 = this.method1588(var16, (byte) 95, arg0, this.field3491);
        if (var17 != null) {
            this.field3500 = var17.field9720;
            this.field3503 = var17.field9718;
            if (this.field3481) {
                this.field3503 = this.field3503.method241((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILha;BI)Z", line = 414)
    public final boolean method131(int arg0, class60 arg1, byte arg2, int arg3) {
        if (arg2 <= 59) {
            this.field3480 = false;
        }
        ++field3504;
        class472 var5 = this.method1586(-120, 131072, arg1);
        if (var5 != null) {
            class10 var6 = arg1.method410();
            var6.method33(super.field2170, super.field2178, super.field2165);
            return !class670.field9312 ? var5.method206(arg0, arg3, var6, false, 0) : var5.method196(arg0, arg3, var6, false, 0, class661.field9249);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)Z", line = 436)
    public final boolean method123(int arg0) {
        ++field3471;
        int var2 = 6 % ((-76 - arg0) / 47);
        if (this.field3503 != null) {
            return !this.field3503.method204();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)Z", line = 451)
    public final boolean method682(boolean arg0) {
        if (!arg0) {
            this.field3482 = null;
        }
        ++field3493;
        return this.field3491;
    }

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "(I)I", line = 464)
    public final int method1587(int arg0) {
        ++field3495;
        if (arg0 <= 20) {
            field3494 = null;
        }
        return this.field3503 != null ? this.field3503.method245() / 4 : 15;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(Z)I", line = 475)
    public final int method128(boolean arg0) {
        if (arg0) {
            return -120;
        } else {
            ++field3488;
            return this.field3503 != null ? this.field3503.method212() : 0;
        }
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(B)Z", line = 486)
    public final boolean method157(byte arg0) {
        if (arg0 >= -70) {
            field3499 = -94;
        }
        ++field3501;
        return this.field3481;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBLha;Z)Lsfa;", line = 497)
    private final class696 method1588(int arg0, byte arg1, class60 arg2, boolean arg3) {
        ++field3490;
        if (arg1 < 69) {
            this.method681((byte) -69);
        }
        class685 var5 = class707.field9894.method4109(this.field3486 & 65535, (byte) 119);
        class281 var6;
        class281 var7;
        if (!this.field3484) {
            if (~super.field2167 <= -4) {
                var6 = null;
            } else {
                var6 = class86.field1182[super.field2167 + 1];
            }
            var7 = class86.field1182[super.field2167];
        } else {
            var6 = class86.field1182[0];
            var7 = class143.field1850[super.field2167];
        }
        return var5.method3874(super.field2165, false, var6, ~this.field3472 == -12 ? this.field3474 + 4 : this.field3474, super.field2178, arg3, super.field2170, arg0, (class150) null, var7, arg2, this.field3472 != 11 ? this.field3472 : 10);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lgg;BZILha;II)V", line = 528)
    public final void method162(class176 arg0, byte arg1, boolean arg2, int arg3, class60 arg4, int arg5, int arg6) {
        if (arg0 instanceof class138) {
            class138 var8 = (class138) arg0;
            if (this.field3503 != null && var8.field1771 != null) {
                this.field3503.method232(var8.field1771, arg3, arg5, arg6, arg2);
            }
        } else if (arg0 instanceof class265) {
            class265 var9 = (class265) arg0;
            if (this.field3503 != null && var9.field3503 != null) {
                this.field3503.method232(var9.field3503, arg3, arg5, arg6, arg2);
            }
        }
        ++field3489;
        int var10 = 24 % ((arg1 - 15) / 55);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lha;I)V", line = 557)
    public final void method679(class60 arg0, int arg1) {
        ++field3497;
        Object var3 = null;
        class184 var5;
        if (this.field3500 == null && this.field3491) {
            class696 var4 = this.method1588(262144, (byte) 85, arg0, true);
            var5 = var4 != null ? var4.field9720 : null;
        } else {
            var5 = this.field3500;
            this.field3500 = null;
        }
        if (arg1 != 24447) {
            this.method132(94);
        }
        if (var5 != null) {
            class432.method2467(var5, super.field2167, super.field2170, super.field2165, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)I", line = 585)
    public final int method685(int arg0) {
        if (arg0 != 4657) {
            return 91;
        } else {
            ++field3473;
            return this.field3474;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)I", line = 598)
    public final int method686(byte arg0) {
        if (arg0 != 20) {
            this.method150((byte) 9);
        }
        ++field3475;
        return this.field3472;
    }

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "(I)V", line = 610)
    public static void method1589(int arg0) {
        field3494 = null;
        if (arg0 != -1) {
            method1585((byte) -65);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V", line = 624)
    public final void method681(byte arg0) {
        if (this.field3503 != null) {
            this.field3503.method240();
        }
        ++field3487;
        if (arg0 != -96) {
            this.field3480 = false;
        }
    }
}
