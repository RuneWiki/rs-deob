import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class377 {

    @OriginalMember(owner = "client!vt", name = "l", descriptor = "I")
    public int field4760;

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "I")
    public int field4755;

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "I")
    public int field4756;

    @OriginalMember(owner = "client!vt", name = "k", descriptor = "I")
    public int field4759;

    @OriginalMember(owner = "client!vt", name = "o", descriptor = "I")
    public int field4763;

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "B")
    public byte field4754;

    @OriginalMember(owner = "client!vt", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field4757 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!vt", name = "j", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!vt", name = "m", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!vt", name = "q", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!vt", name = "r", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!vt", name = "p", descriptor = "Luea;")
    public class211 field4764;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "Lgo;")
    public class416 field4752;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "Lhw;")
    public class519 field4749;

    @OriginalMember(owner = "client!vt", name = "n", descriptor = "Loaa;")
    public class555 field4762;

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "Z")
    public static boolean field4751;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(BLqda;)Lida;", line = 5)
    public static final class138 method2045(byte arg0, class172 arg1) {
        field4765++;
        class138 var2;
        if (class281.field3525 == null) {
            var2 = new class138();
        } else {
            var2 = class281.field3525;
            class281.field3525 = class281.field3525.field1789;
            class91.field1280--;
            var2.field1789 = null;
        }
        var2.field1786 = arg1;
        if (arg0 < 33) {
            field4751 = true;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)Z", line = 32)
    public final boolean method2046(int arg0) {
        if (arg0 != 1) {
            this.field4762 = null;
        }
        field4761++;
        return this.field4754 == 2 || this.field4754 == 3;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ZLni;B)V", line = 44)
    public static final void method2047(boolean arg0, class687 arg1, byte arg2) {
        field4750++;
        class601 var3 = arg1.method3872(32195);
        if (arg1.field9756 == 0) {
            class480.field6388 = 0;
            class454.field5820 = -1;
            arg1.field9748 = 0;
            return;
        }
        if (arg1.field9689 != -1 && arg1.field9731 == 0) {
            class395 var4 = class583.field8149.method1844(arg2 ^ 0xE, arg1.field9689);
            if (arg1.field9753 > 0 && var4.field4972 == 0) {
                class480.field6388 = 0;
                arg1.field9748++;
                class454.field5820 = -1;
                return;
            }
            if (arg1.field9753 <= 0 && var4.field4974 == 0) {
                class454.field5820 = -1;
                arg1.field9748++;
                class480.field6388 = 0;
                return;
            }
        }
        if (arg1.field9687 != -1 && arg1.field9696 <= class133.field1735) {
            class388 var5 = class370.field4686.method3943((byte) 12, arg1.field9687);
            if (var5.field4876 && var5.field4895 != -1) {
                class395 var6 = class583.field8149.method1844(64, var5.field4895);
                if (arg1.field9753 > 0 && var6.field4972 == 0) {
                    class480.field6388 = 0;
                    class454.field5820 = -1;
                    arg1.field9748++;
                    return;
                }
                if (arg1.field9753 <= 0 && var6.field4974 == 0) {
                    arg1.field9748++;
                    class454.field5820 = -1;
                    class480.field6388 = 0;
                    return;
                }
            }
        }
        if (arg1.field9687 != -1 && class133.field1735 >= arg1.field9696) {
            class388 var7 = class370.field4686.method3943((byte) 12, arg1.field9687);
            if (var7.field4876 && var7.field4895 != -1) {
                class395 var8 = class583.field8149.method1844(arg2 - 14, var7.field4895);
                if (arg1.field9753 > 0 && var8.field4972 == 0) {
                    class480.field6388 = 0;
                    arg1.field9748++;
                    class454.field5820 = -1;
                    return;
                }
                if (arg1.field9753 <= 0 && var8.field4974 == 0) {
                    class454.field5820 = -1;
                    class480.field6388 = 0;
                    arg1.field9748++;
                    return;
                }
            }
        }
        int var9 = arg1.field6461;
        int var10 = arg1.field6464;
        int var11 = arg1.field9758[arg1.field9756 - 1] * 512 + (arg1.method2785(arg2 ^ 0xFFFFFFB1) * 256);
        int var12 = arg1.field9754[arg1.field9756 - 1] * 512 + (arg1.method2785(arg2 - 79) * 256);
        if (var9 >= var11) {
            if (var11 < var9) {
                if (var12 > var10) {
                    arg1.method3869(false, 6144);
                } else if (var10 > var12) {
                    arg1.method3869(false, 2048);
                } else {
                    arg1.method3869(false, 4096);
                }
            } else if (var10 < var12) {
                arg1.method3869(false, 8192);
            } else if (var12 < var10) {
                arg1.method3869(false, 0);
            }
        } else if (var10 < var12) {
            arg1.method3869(false, 10240);
        } else if (var10 > var12) {
            arg1.method3869(false, 14336);
        } else {
            arg1.method3869(false, 12288);
        }
        byte var13 = arg1.field9752[arg1.field9756 - 1];
        if (!arg0 && (var11 - var9) > 1024 || var11 - var9 < -1024 || (var12 - var10) > 1024 || var12 - var10 < -1024) {
            arg1.field6464 = var12;
            arg1.field6461 = var11;
            arg1.method3873(arg1.field9697, 1003, false);
            if (arg1.field9753 > 0) {
                arg1.field9753--;
            }
            class480.field6388 = 0;
            class454.field5820 = -1;
            arg1.field9756--;
            return;
        }
        int var14 = 16;
        if (arg2 != 78) {
            return;
        }
        boolean var15 = true;
        if (arg1 instanceof class307) {
            var15 = ((class307) arg1).field3902.field8225;
        }
        if (var15) {
            int var16 = arg1.field9697 - arg1.field9672.field7215;
            if (var16 != 0 && arg1.field9650 == -1 && arg1.field9716 != 0) {
                var14 = 8;
            }
            if (!arg0 && arg1.field9756 > 2) {
                var14 = 24;
            }
            if (!arg0 && arg1.field9756 > 3) {
                var14 = 32;
            }
        } else {
            if (!arg0 && arg1.field9756 > 1) {
                var14 = 24;
            }
            if (!arg0 && arg1.field9756 > 2) {
                var14 = 32;
            }
        }
        if (arg1.field9748 > 0 && arg1.field9756 > 1) {
            arg1.field9748--;
            var14 = 32;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        class480.field6388 = 0;
        if (var3.field8420 != -1) {
            int var17 = var14 << 9;
            if (arg1.field9756 == 1) {
                int var18 = arg1.field9749 * arg1.field9749;
                int var19 = (arg1.field6461 <= var11 ? var11 - arg1.field6461 : -var11 + arg1.field6461) << 9;
                int var20 = (arg1.field6464 <= var12 ? var12 - arg1.field6464 : -var12 + arg1.field6464) << 9;
                int var21 = var19 > var20 ? var19 : var20;
                int var22 = var21 * 2 * var3.field8420;
                if (var18 > var22) {
                    arg1.field9749 /= 2;
                } else if (var21 < (var18 / 2)) {
                    arg1.field9749 -= var3.field8420;
                    if (arg1.field9749 < 0) {
                        arg1.field9749 = 0;
                    }
                } else if (arg1.field9749 < var17) {
                    arg1.field9749 += var3.field8420;
                    if (arg1.field9749 > var17) {
                        arg1.field9749 = var17;
                    }
                }
            } else if (var17 > arg1.field9749) {
                arg1.field9749 += var3.field8420;
                if (var17 < arg1.field9749) {
                    arg1.field9749 = var17;
                }
            } else if (arg1.field9749 > 0) {
                arg1.field9749 -= var3.field8420;
                if (arg1.field9749 < 0) {
                    arg1.field9749 = 0;
                }
            }
            var14 = arg1.field9749 >> 9;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        if (var9 == var11 && var10 == var12) {
            class454.field5820 = -1;
        } else {
            if (var9 < var11) {
                arg1.field6461 += var14;
                class480.field6388 |= 0x4;
                if (arg1.field6461 > var11) {
                    arg1.field6461 = var11;
                }
            } else if (var9 > var11) {
                class480.field6388 |= 0x8;
                arg1.field6461 -= var14;
                if (arg1.field6461 < var11) {
                    arg1.field6461 = var11;
                }
            }
            if (var12 > var10) {
                arg1.field6464 += var14;
                class480.field6388 |= 0x1;
                if (arg1.field6464 > var12) {
                    arg1.field6464 = var12;
                }
            } else if (var10 > var12) {
                class480.field6388 |= 0x2;
                arg1.field6464 -= var14;
                if (var12 > arg1.field6464) {
                    arg1.field6464 = var12;
                }
            }
            if (var14 < 32) {
                class454.field5820 = var13;
            } else {
                class454.field5820 = 2;
            }
        }
        if (arg1.field6461 == var11 && arg1.field6464 == var12) {
            if (arg1.field9753 > 0) {
                arg1.field9753--;
            }
            arg1.field9756--;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)V", line = 392)
    public static void method2048(boolean arg0) {
        if (!arg0) {
            field4757 = null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)V", line = 409)
    public static final void method2049(int arg0) {
        if (arg0 == -1) {
            class100.field1353 = true;
            field4758++;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lni;B)V", line = 422)
    public static final void method2050(class687 arg0, byte arg1) {
        if (arg0.field9744 != -1) {
            class395 var2 = class583.field8149.method1844(64, arg0.field9744);
            if (var2 == null || var2.field4979 == null) {
                arg0.field9744 = -1;
                arg0.field9660 = false;
            } else {
                label400: {
                    arg0.field9734++;
                    if (arg0.field9699 < var2.field4979.length && arg0.field9734 > var2.field4991[arg0.field9699]) {
                        arg0.field9699++;
                        arg0.field9724++;
                        arg0.field9734 = 1;
                        class192.method1159(arg0.field6470, var2, arg0.field6461, arg0.field6464, 91, arg0.field9699, class376.field4748 == arg0);
                    }
                    if (arg0.field9699 >= var2.field4979.length) {
                        arg0.field9699 = 0;
                        arg0.field9734 = 0;
                        if (arg0.field9660) {
                            arg0.field9744 = arg0.method3872(32195).method3296(1);
                            if (arg0.field9744 == -1) {
                                arg0.field9660 = false;
                                break label400;
                            }
                            var2 = class583.field8149.method1844(64, arg0.field9744);
                        }
                        class192.method1159(arg0.field6470, var2, arg0.field6461, arg0.field6464, 96, arg0.field9699, class376.field4748 == arg0);
                    }
                    arg0.field9724 = arg0.field9699 + 1;
                    if (var2.field4979.length <= arg0.field9724) {
                        arg0.field9724 = 0;
                    }
                }
            }
        }
        field4766++;
        if (arg0.field9687 != -1 && class133.field1735 >= arg0.field9696) {
            class388 var3 = class370.field4686.method3943((byte) 12, arg0.field9687);
            int var4 = var3.field4895;
            if (var4 == -1) {
                arg0.field9687 = -1;
            } else {
                label402: {
                    class395 var5 = class583.field8149.method1844(64, var4);
                    if (var3.field4876) {
                        if (var5.field4972 == 3) {
                            if (arg0.field9753 > 0 && class133.field1735 >= arg0.field9740 && class133.field1735 > arg0.field9665) {
                                arg0.field9687 = -1;
                                break label402;
                            }
                        } else if (var5.field4972 == 1 && arg0.field9753 > 0 && arg0.field9740 <= class133.field1735 && arg0.field9665 < class133.field1735) {
                            arg0.field9696 = class133.field1735 + 1;
                            break label402;
                        }
                    }
                    if (var5 == null || var5.field4979 == null) {
                        arg0.field9687 = -1;
                    } else {
                        if (arg0.field9727 < 0) {
                            arg0.field9727 = 0;
                            class192.method1159(arg0.field6470, var5, arg0.field6461, arg0.field6464, 76, 0, class376.field4748 == arg0);
                        }
                        arg0.field9681++;
                        if (arg0.field9727 < var5.field4979.length && arg0.field9681 > var5.field4991[arg0.field9727]) {
                            arg0.field9727++;
                            arg0.field9681 = 1;
                            class192.method1159(arg0.field6470, var5, arg0.field6461, arg0.field6464, 64, arg0.field9727, class376.field4748 == arg0);
                        }
                        if (var5.field4979.length <= arg0.field9727) {
                            if (var3.field4876) {
                                arg0.field9727 -= var5.field4988;
                                arg0.field9709++;
                                if (var5.field4965 <= arg0.field9709) {
                                    arg0.field9687 = -1;
                                } else if (arg0.field9727 >= 0 && var5.field4979.length > arg0.field9727) {
                                    class192.method1159(arg0.field6470, var5, arg0.field6461, arg0.field6464, 95, arg0.field9727, class376.field4748 == arg0);
                                } else {
                                    arg0.field9687 = -1;
                                }
                            } else {
                                arg0.field9687 = -1;
                            }
                        }
                        arg0.field9705 = arg0.field9727 + 1;
                        if (var5.field4979.length <= arg0.field9705) {
                            if (var3.field4876) {
                                arg0.field9705 -= var5.field4988;
                                if (arg0.field9709 + 1 >= var5.field4965) {
                                    arg0.field9705 = -1;
                                } else if (arg0.field9705 < 0 || arg0.field9705 >= var5.field4979.length) {
                                    arg0.field9705 = -1;
                                }
                            } else {
                                arg0.field9705 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1 < 61) {
            field4751 = false;
        }
        if (arg0.field9669 != -1 && arg0.field9657 <= class133.field1735) {
            class388 var6 = class370.field4686.method3943((byte) 12, arg0.field9669);
            int var7 = var6.field4895;
            if (var7 == -1) {
                arg0.field9669 = -1;
            } else {
                label405: {
                    class395 var8 = class583.field8149.method1844(64, var7);
                    if (var6.field4876) {
                        if (var8.field4972 == 3) {
                            if (arg0.field9753 > 0 && arg0.field9740 <= class133.field1735 && class133.field1735 > arg0.field9665) {
                                arg0.field9669 = -1;
                                break label405;
                            }
                        } else if (var8.field4972 == 1 && arg0.field9753 > 0 && class133.field1735 >= arg0.field9740 && arg0.field9665 < class133.field1735) {
                            arg0.field9657 = class133.field1735 + 1;
                            break label405;
                        }
                    }
                    if (var8 == null || var8.field4979 == null) {
                        arg0.field9669 = -1;
                    } else {
                        if (arg0.field9677 < 0) {
                            arg0.field9677 = 0;
                            class192.method1159(arg0.field6470, var8, arg0.field6461, arg0.field6464, 87, 0, class376.field4748 == arg0);
                        }
                        arg0.field9732++;
                        if (arg0.field9677 < var8.field4979.length && arg0.field9732 > var8.field4991[arg0.field9677]) {
                            arg0.field9732 = 1;
                            arg0.field9677++;
                            class192.method1159(arg0.field6470, var8, arg0.field6461, arg0.field6464, 105, arg0.field9677, class376.field4748 == arg0);
                        }
                        if (arg0.field9677 >= var8.field4979.length) {
                            if (var6.field4876) {
                                arg0.field9677 -= var8.field4988;
                                arg0.field9700++;
                                if (var8.field4965 <= arg0.field9700) {
                                    arg0.field9669 = -1;
                                } else if (arg0.field9677 >= 0 && var8.field4979.length > arg0.field9677) {
                                    class192.method1159(arg0.field6470, var8, arg0.field6461, arg0.field6464, 89, arg0.field9677, class376.field4748 == arg0);
                                } else {
                                    arg0.field9669 = -1;
                                }
                            } else {
                                arg0.field9669 = -1;
                            }
                        }
                        arg0.field9654 = arg0.field9677 + 1;
                        if (arg0.field9654 >= var8.field4979.length) {
                            if (var6.field4876) {
                                arg0.field9654 -= var8.field4988;
                                if (var8.field4965 <= (arg0.field9700 + 1)) {
                                    arg0.field9654 = -1;
                                } else if (arg0.field9654 < 0 || var8.field4979.length <= arg0.field9654) {
                                    arg0.field9654 = -1;
                                }
                            } else {
                                arg0.field9654 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field9689 != -1 && arg0.field9731 <= 1) {
            class395 var9 = class583.field8149.method1844(64, arg0.field9689);
            if (var9.field4972 == 3) {
                if (arg0.field9753 > 0 && arg0.field9740 <= class133.field1735 && class133.field1735 > arg0.field9665) {
                    arg0.field9689 = -1;
                    arg0.field9691 = null;
                }
            } else if (var9.field4972 == 1 && arg0.field9753 > 0 && class133.field1735 >= arg0.field9740 && class133.field1735 > arg0.field9665) {
                arg0.field9731 = 2;
            }
        }
        if (arg0.field9689 != -1 && arg0.field9731 == 0) {
            class395 var10 = class583.field8149.method1844(64, arg0.field9689);
            if (var10 == null || var10.field4979 == null) {
                arg0.field9691 = null;
                arg0.field9689 = -1;
            } else {
                arg0.field9725++;
                if (var10.field4979.length > arg0.field9741 && var10.field4991[arg0.field9741] < arg0.field9725) {
                    arg0.field9725 = 1;
                    arg0.field9741++;
                    class192.method1159(arg0.field6470, var10, arg0.field6461, arg0.field6464, 127, arg0.field9741, class376.field4748 == arg0);
                }
                if (var10.field4979.length <= arg0.field9741) {
                    arg0.field9698++;
                    arg0.field9741 -= var10.field4988;
                    if (var10.field4965 <= arg0.field9698) {
                        arg0.field9689 = -1;
                        arg0.field9691 = null;
                    } else if (arg0.field9741 >= 0 && arg0.field9741 < var10.field4979.length) {
                        class192.method1159(arg0.field6470, var10, arg0.field6461, arg0.field6464, 97, arg0.field9741, class376.field4748 == arg0);
                    } else {
                        arg0.field9689 = -1;
                        arg0.field9691 = null;
                    }
                }
                arg0.field9661 = arg0.field9741 + 1;
                if (var10.field4979.length <= arg0.field9661) {
                    arg0.field9661 -= var10.field4988;
                    if (var10.field4965 <= arg0.field9698 + 1) {
                        arg0.field9661 = -1;
                    } else if (arg0.field9661 < 0 || var10.field4979.length <= arg0.field9661) {
                        arg0.field9661 = -1;
                    }
                }
            }
        }
        if (arg0.field9731 > 0) {
            arg0.field9731--;
        }
        for (int var11 = 0; var11 < arg0.field9704.length; var11++) {
            class248 var12 = arg0.field9704[var11];
            if (var12 != null) {
                if (var12.field3058 > 0) {
                    var12.field3058--;
                } else {
                    class395 var13 = class583.field8149.method1844(64, var12.field3060);
                    if (var13 == null || var13.field4979 == null) {
                        arg0.field9704[var11] = null;
                    } else {
                        var12.field3059++;
                        if (var12.field3061 < var13.field4979.length && var13.field4991[var12.field3061] < var12.field3059) {
                            var12.field3061++;
                            var12.field3059 = 1;
                            class192.method1159(arg0.field6470, var13, arg0.field6461, arg0.field6464, 99, var12.field3061, class376.field4748 == arg0);
                        }
                        if (var13.field4979.length <= var12.field3061) {
                            var12.field3061 -= var13.field4988;
                            var12.field3062++;
                            if (var13.field4965 <= var12.field3062) {
                                arg0.field9704[var11] = null;
                            } else if (var12.field3061 >= 0 && var12.field3061 < var13.field4979.length) {
                                class192.method1159(arg0.field6470, var13, arg0.field6461, arg0.field6464, 83, var12.field3061, class376.field4748 == arg0);
                            } else {
                                arg0.field9704[var11] = null;
                            }
                        }
                        var12.field3064 = var12.field3061 + 1;
                        if (var13.field4979.length <= var12.field3064) {
                            var12.field3064 -= var13.field4988;
                            if (var13.field4965 <= var12.field3062 + 1) {
                                var12.field3064 = -1;
                            } else if (var12.field3064 < 0 || var13.field4979.length <= var12.field3064) {
                                var12.field3064 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(BIIIII)V", line = 858)
    public class377(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4760 = arg1;
        this.field4755 = arg5;
        this.field4756 = arg2;
        this.field4759 = arg3;
        this.field4763 = arg4;
        this.field4754 = arg0;
    }
}
