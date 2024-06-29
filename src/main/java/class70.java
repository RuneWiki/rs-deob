import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class70 {

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field1165 = 0;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "[I")
    public static int[] field1168 = new int[3];

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "Laj;")
    public static class151 field1167;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "Lhg;")
    public static class207 field1169;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZI)I")
    public static final int method478(boolean arg0, int arg1) {
        field1166++;
        if (arg0) {
            method480(-43);
        }
        return arg1 == 16711935 ? -1 : class62.method427((byte) -105, arg1);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BI)V")
    public static final void method479(byte arg0, int arg1) {
        field1170++;
        class36 var2 = class136.method1013(14, arg1, (byte) -90);
        if (arg0 != -60) {
            field1165 = 105;
        }
        var2.method221(arg0 ^ 0xFFFFFFC5);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static final void method480(int arg0) {
        if (arg0 <= 93) {
            field1168 = null;
        }
        field1174++;
        class299.field4876.method97(74);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
    public static void method481(byte arg0) {
        field1167 = null;
        if (arg0 <= 78) {
            method481((byte) -62);
        }
        field1169 = null;
        field1168 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILuf;)V")
    public static final void method482(int arg0, class46 arg1) {
        field1164++;
        if (arg0 != 2 || arg1.field792 == 0) {
            return;
        }
        class190 var2 = arg1.method282(-1399);
        if (arg1.field764 != -1 && arg1.field764 < 32768) {
            class307 var3 = class57.field1002[arg1.field764];
            if (var3 != null) {
                int var4 = arg1.field715 - var3.field715;
                int var5 = arg1.field771 - var3.field771;
                if (var4 != 0 || var5 != 0) {
                    arg1.field776 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field764 >= 32768) {
            int var6 = arg1.field764 - 32768;
            if (class297.field4860 == var6) {
                var6 = 2047;
            }
            class123 var7 = class15.field300[var6];
            if (var7 != null) {
                int var8 = arg1.field715 - var7.field715;
                int var9 = arg1.field771 - var7.field771;
                if (var8 != 0 || var9 != 0) {
                    arg1.field776 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field781 != 0 || arg1.field758 != 0) && (arg1.field730 == 0 || arg1.field725 > 0)) {
            int var10 = arg1.field715 - (arg1.field781 - class26.field462 - class26.field462) * 64;
            int var11 = arg1.field771 - ((arg1.field758 - class78.field1313 - class78.field1313) * 64);
            if (var10 != 0 || var11 != 0) {
                arg1.field776 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
            }
            arg1.field781 = 0;
            arg1.field758 = 0;
        }
        int var12 = arg1.field776 - arg1.field753 & 0x7FF;
        if (var12 == 0) {
            arg1.field801 = 0;
            arg1.field797 = 0;
        } else if (var2.field3076 == 0) {
            arg1.field797++;
            if (var12 <= 1024) {
                arg1.field753 += arg1.field792;
                boolean var13 = true;
                if (arg1.field792 > var12 || 2048 - arg1.field792 < var12) {
                    arg1.field753 = arg1.field776;
                    var13 = false;
                }
                if (arg1.field797 > 25 || var13) {
                    arg1.field782 = var2.field3071;
                    if (arg1.field730 <= 0) {
                        if (var2.field3083 != -1) {
                            arg1.field782 = var2.field3083;
                        }
                    } else if (arg1.field759[arg1.field730 - 1] == 2) {
                        if (var2.field3047 != -1) {
                            arg1.field782 = var2.field3047;
                        } else if (var2.field3082 != -1) {
                            arg1.field782 = var2.field3082;
                        }
                    } else if (arg1.field759[arg1.field730 - 1] == 0) {
                        if (var2.field3081 != -1) {
                            arg1.field782 = var2.field3081;
                        } else if (var2.field3061 != -1) {
                            arg1.field782 = var2.field3061;
                        }
                    } else if (var2.field3075 != -1) {
                        arg1.field782 = var2.field3075;
                    }
                }
            } else {
                arg1.field753 -= arg1.field792;
                boolean var14 = true;
                if (var12 < arg1.field792 || var12 > (2048 - arg1.field792)) {
                    var14 = false;
                    arg1.field753 = arg1.field776;
                }
                if (arg1.field797 > 25 || var14) {
                    arg1.field782 = var2.field3071;
                    if (arg1.field730 > 0) {
                        if (arg1.field759[arg1.field730 - 1] == 2) {
                            if (var2.field3043 != -1) {
                                arg1.field782 = var2.field3043;
                            } else if (var2.field3082 != -1) {
                                arg1.field782 = var2.field3082;
                            }
                        } else if (arg1.field759[arg1.field730 - 1] == 0) {
                            if (var2.field3080 != -1) {
                                arg1.field782 = var2.field3080;
                            } else if (var2.field3061 != -1) {
                                arg1.field782 = var2.field3061;
                            }
                        } else if (var2.field3065 != -1) {
                            arg1.field782 = var2.field3065;
                        }
                    } else if (var2.field3069 != -1) {
                        arg1.field782 = var2.field3069;
                    }
                }
            }
            arg1.field753 &= 0x7FF;
            return;
        } else {
            arg1.field782 = -1;
            int var15 = arg1.field776 << 5;
            if (arg1.field741 != var15) {
                arg1.field754 = 0;
                int var16 = arg1.field801 * arg1.field801 / (var2.field3076 * 2);
                arg1.field741 = var15;
                int var17 = var15 - arg1.field760 & 0xFFFF;
                if (arg1.field801 > 0 && var17 >= var16 && var17 - var16 < 32768) {
                    int var18 = var2.field3058 * var2.field3058 / (var2.field3076 * 2);
                    arg1.field770 = true;
                    arg1.field723 = var17 / 2;
                    if (var18 > 32767) {
                        var18 = 32767;
                    }
                    if (arg1.field723 > var18) {
                        arg1.field723 = var17 - var18;
                    }
                } else if (arg1.field801 < 0 && var16 <= 65536 - var17 && 65536 - var16 - var17 < 32768) {
                    arg1.field723 = (65536 - var17) / 2;
                    arg1.field770 = true;
                    int var19 = var2.field3058 * var2.field3058 / (var2.field3076 * 2);
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    if (arg1.field723 > var19) {
                        arg1.field723 = 65536 - var17 - var19;
                    }
                } else {
                    arg1.field770 = false;
                }
            }
            if (arg1.field801 == 0) {
                int var20 = arg1.field741 - arg1.field760 & 0xFFFF;
                if (var2.field3076 <= var20) {
                    arg1.field754 = 0;
                    arg1.field770 = true;
                    int var21 = var2.field3058 * var2.field3058 / (var2.field3076 * 2);
                    if (var21 > 32767) {
                        var21 = 32767;
                    }
                    if (var20 >= 32768) {
                        arg1.field723 = (65536 - var20) / 2;
                        if (var21 < arg1.field723) {
                            arg1.field723 = 65536 - var20 - var21;
                        }
                        arg1.field801 = -var2.field3076;
                    } else {
                        arg1.field723 = var20 / 2;
                        arg1.field801 = var2.field3076;
                        if (arg1.field723 > var21) {
                            arg1.field723 = var20 - var21;
                        }
                    }
                } else {
                    arg1.field760 = arg1.field741;
                }
            } else if (arg1.field801 > 0) {
                if (arg1.field754 >= arg1.field723) {
                    arg1.field770 = false;
                }
                if (!arg1.field770) {
                    arg1.field801 -= var2.field3076;
                    if (arg1.field801 < 0) {
                        arg1.field801 = 0;
                    }
                } else if (arg1.field801 < var2.field3058) {
                    arg1.field801 += var2.field3076;
                }
            } else {
                if (arg1.field723 <= arg1.field754) {
                    arg1.field770 = false;
                }
                if (!arg1.field770) {
                    arg1.field801 += var2.field3076;
                    if (arg1.field801 > 0) {
                        arg1.field801 = 0;
                    }
                } else if ((-var2.field3058) < arg1.field801) {
                    arg1.field801 -= var2.field3076;
                }
            }
            arg1.field760 += arg1.field801;
            arg1.field760 &= 0xFFFF;
            if (arg1.field801 > 0) {
                arg1.field754 += arg1.field801;
            } else {
                arg1.field754 -= arg1.field801;
            }
            arg1.field753 = arg1.field760 >> 5;
            if (arg1.field801 >= 0) {
                if (arg1.field730 > 0) {
                    if (arg1.field759[arg1.field730 - 1] == 2) {
                        if (var2.field3047 != -1) {
                            arg1.field782 = var2.field3047;
                        } else if (var2.field3082 != -1) {
                            arg1.field782 = var2.field3082;
                        }
                    } else if (arg1.field759[arg1.field730 - 1] == 0) {
                        if (var2.field3081 != -1) {
                            arg1.field782 = var2.field3081;
                        } else if (var2.field3061 != -1) {
                            arg1.field782 = var2.field3061;
                        }
                    }
                }
                if (arg1.field782 == -1) {
                    if (var2.field3075 != -1) {
                        arg1.field782 = var2.field3075;
                    } else if (var2.field3083 != -1) {
                        arg1.field782 = var2.field3083;
                    }
                }
            } else {
                if (arg1.field730 > 0) {
                    if (arg1.field759[arg1.field730 - 1] == 2) {
                        if (var2.field3043 != -1) {
                            arg1.field782 = var2.field3043;
                        } else if (var2.field3082 != -1) {
                            arg1.field782 = var2.field3082;
                        }
                    } else if (arg1.field759[arg1.field730 - 1] == 0) {
                        if (var2.field3080 != -1) {
                            arg1.field782 = var2.field3080;
                        } else if (var2.field3061 != -1) {
                            arg1.field782 = var2.field3061;
                        }
                    }
                }
                if (arg1.field782 == -1) {
                    if (var2.field3065 != -1) {
                        arg1.field782 = var2.field3065;
                    } else if (var2.field3069 != -1) {
                        arg1.field782 = var2.field3069;
                    }
                }
            }
            if (arg1.field782 == -1) {
                arg1.field782 = var2.field3071;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(BI)I")
    public static final int method483(byte arg0, int arg1) {
        field1172++;
        return arg0 == 109 ? arg1 & 0xFF : 29;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(B)V")
    public static final void method484(byte arg0) {
        field1173++;
        Container var1;
        if (class218.field3682 != null) {
            var1 = class218.field3682;
        } else if (class64.field1086 == null) {
            var1 = class142.field2344.field1380;
        } else {
            var1 = class64.field1086;
        }
        class61.field1051 = var1.getSize().width;
        class145.field2390 = var1.getSize().height;
        if (class64.field1086 == var1) {
            Insets var2 = class64.field1086.getInsets();
            class145.field2390 -= var2.top + var2.bottom;
            class61.field1051 -= var2.right + var2.left;
        }
        if (class170.method1271((byte) 116) < 2) {
            class49.field838 = (class61.field1051 - 765) / 2;
            class155.field2567 = 765;
            class171.field2775 = 0;
            class182.field2901 = 503;
        } else {
            class155.field2567 = class61.field1051;
            class182.field2901 = class145.field2390;
            class49.field838 = 0;
            class171.field2775 = 0;
        }
        class5.field125.setSize(class155.field2567, class182.field2901);
        if (class64.field1086 == var1) {
            Insets var3 = class64.field1086.getInsets();
            class5.field125.setLocation(class49.field838 + var3.left, class171.field2775 + var3.top);
        } else {
            class5.field125.setLocation(class49.field838, class171.field2775);
        }
        if (arg0 == 11) {
            if (class243.field4082 != -1) {
                class215.method1536(28942, true);
            }
            class87.method611(true);
        }
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(BI)V")
    public static final void method485(byte arg0, int arg1) {
        field1171++;
        if (arg0 != 111) {
            method480(43);
        }
        class36 var2 = class136.method1013(10, arg1, (byte) -90);
        var2.method221(1);
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(B)V")
    public static final void method486(byte arg0) {
        if (arg0 != 94) {
            field1168 = null;
        }
        while (class136.field2239.method631((byte) -12, class150.field2480) >= 11) {
            int var1 = class136.field2239.method641(false, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class15.field300[var1] == null) {
                var2 = true;
                class15.field300[var1] = new class123();
                if (class77.field1309[var1] != null) {
                    class15.field300[var1].method923(var1, class77.field1309[var1], arg0 ^ 0x78);
                }
            }
            class162.field2627[class154.field2553++] = var1;
            class123 var3 = class15.field300[var1];
            var3.field749 = class275.field4598;
            int var4 = class275.field4595[class136.field2239.method641(false, 3)];
            if (var2) {
                var3.field776 = var3.field753 = var4;
            }
            int var5 = class136.field2239.method641(false, 5);
            int var6 = class136.field2239.method641(false, 1);
            if (var5 > 15) {
                var5 -= 32;
            }
            if (var6 == 1) {
                class41.field619[class289.field4761++] = var1;
            }
            int var7 = class136.field2239.method641(false, 1);
            int var8 = class136.field2239.method641(false, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method919(class16.field314.field711[0] + var5, class16.field314.field717[0] + var8, var7 == 1, false);
        }
        class136.field2239.method638(arg0 - 101);
        field1175++;
    }
}
