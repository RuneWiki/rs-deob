import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class108 {

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field1870 = 0;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field1871 = 0;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field1877 = 0;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field1878 = 0;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "[I")
    public static int[] field1876 = new int[2500];

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public static void method788(byte arg0) {
        if (arg0 <= -37) {
            field1876 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLil;)V")
    public static final void method789(byte arg0, class49 arg1) {
        arg1.field616 = false;
        if (arg1.field659 != -1) {
            class21 var2 = class267.method1812((byte) 89, arg1.field659);
            if (var2 == null || var2.field237 == null) {
                arg1.field659 = -1;
            } else {
                arg1.field667++;
                if (var2.field237.length > arg1.field609 && var2.field240[arg1.field609] < arg1.field667) {
                    arg1.field667 = 1;
                    arg1.field668++;
                    arg1.field609++;
                    class150.method1022(var2, (byte) 126, arg1.field609, arg1.field613, class197.field3179 == arg1, arg1.field614);
                }
                if (arg1.field609 >= var2.field237.length) {
                    arg1.field609 = 0;
                    arg1.field667 = 0;
                    class150.method1022(var2, (byte) -118, arg1.field609, arg1.field613, class197.field3179 == arg1, arg1.field614);
                }
                arg1.field668 = arg1.field609 + 1;
                if (var2.field237.length <= arg1.field668) {
                    arg1.field668 = 0;
                }
            }
        }
        field1874++;
        if (arg1.field634 != -1 && arg1.field640 <= class9.field141) {
            class66 var3 = class271.method1826(arg1.field634, (byte) 121);
            int var4 = var3.field929;
            if (var4 == -1) {
                arg1.field634 = -1;
            } else {
                label295: {
                    class21 var5 = class267.method1812((byte) 89, var4);
                    if (var3.field925) {
                        if (var5.field267 == 3) {
                            if (arg1.field637 > 0 && class9.field141 >= arg1.field700 && arg1.field664 < class9.field141) {
                                arg1.field634 = -1;
                                break label295;
                            }
                        } else if (var5.field267 == 1 && arg1.field637 > 0 && class9.field141 >= arg1.field700 && arg1.field664 < class9.field141) {
                            arg1.field640 = class9.field141 + 1;
                            break label295;
                        }
                    }
                    if (var5 == null || var5.field237 == null) {
                        arg1.field634 = -1;
                    } else {
                        if (arg1.field694 < 0) {
                            arg1.field694 = 0;
                            class150.method1022(var5, (byte) -41, 0, arg1.field613, class197.field3179 == arg1, arg1.field614);
                        }
                        arg1.field686++;
                        if (arg1.field694 < var5.field237.length && arg1.field686 > var5.field240[arg1.field694]) {
                            arg1.field686 = 1;
                            arg1.field694++;
                            class150.method1022(var5, (byte) 127, arg1.field694, arg1.field613, class197.field3179 == arg1, arg1.field614);
                        }
                        if (var5.field237.length <= arg1.field694) {
                            if (var3.field925) {
                                arg1.field694 -= var5.field248;
                                arg1.field702++;
                                if (arg1.field702 >= var5.field247) {
                                    arg1.field634 = -1;
                                } else if (arg1.field694 >= 0 && var5.field237.length > arg1.field694) {
                                    class150.method1022(var5, (byte) -120, arg1.field694, arg1.field613, class197.field3179 == arg1, arg1.field614);
                                } else {
                                    arg1.field634 = -1;
                                }
                            } else {
                                arg1.field634 = -1;
                            }
                        }
                        arg1.field615 = arg1.field694 + 1;
                        if (arg1.field615 >= var5.field237.length) {
                            if (var3.field925) {
                                arg1.field615 -= var5.field248;
                                if (arg1.field702 + 1 >= var5.field247) {
                                    arg1.field615 = -1;
                                } else if (arg1.field615 < 0 || var5.field237.length <= arg1.field615) {
                                    arg1.field615 = -1;
                                }
                            } else {
                                arg1.field615 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field672 != -1 && arg1.field642 <= 1) {
            class21 var6 = class267.method1812((byte) 89, arg1.field672);
            if (var6.field267 == 3) {
                if (arg1.field637 > 0 && class9.field141 >= arg1.field700 && class9.field141 > arg1.field664) {
                    arg1.field672 = -1;
                }
            } else if (var6.field267 == 1 && arg1.field637 > 0 && arg1.field700 <= class9.field141 && arg1.field664 < class9.field141) {
                arg1.field642 = 1;
            }
        }
        if (arg0 != -66) {
            return;
        }
        if (arg1.field672 != -1 && arg1.field642 == 0) {
            class21 var7 = class267.method1812((byte) 89, arg1.field672);
            if (var7 == null || var7.field237 == null) {
                arg1.field672 = -1;
            } else {
                arg1.field623++;
                if (var7.field237.length > arg1.field681 && arg1.field623 > var7.field240[arg1.field681]) {
                    arg1.field681++;
                    arg1.field623 = 1;
                    class150.method1022(var7, (byte) -36, arg1.field681, arg1.field613, class197.field3179 == arg1, arg1.field614);
                }
                if (var7.field237.length <= arg1.field681) {
                    arg1.field607++;
                    arg1.field681 -= var7.field248;
                    if (var7.field247 <= arg1.field607) {
                        arg1.field672 = -1;
                    } else if (arg1.field681 >= 0 && arg1.field681 < var7.field237.length) {
                        class150.method1022(var7, (byte) -19, arg1.field681, arg1.field613, class197.field3179 == arg1, arg1.field614);
                    } else {
                        arg1.field672 = -1;
                    }
                }
                arg1.field658 = arg1.field681 + 1;
                if (arg1.field658 >= var7.field237.length) {
                    arg1.field658 -= var7.field248;
                    if (arg1.field607 + 1 >= var7.field247) {
                        arg1.field658 = -1;
                    } else if (arg1.field658 < 0 || arg1.field658 >= var7.field237.length) {
                        arg1.field658 = -1;
                    }
                }
                arg1.field616 = var7.field255;
            }
        }
        if (arg1.field642 > 0) {
            arg1.field642--;
        }
        for (int var8 = 0; var8 < arg1.field654.length; var8++) {
            class171 var9 = arg1.field654[var8];
            if (var9 != null) {
                if (var9.field2756 > 0) {
                    var9.field2756--;
                } else {
                    class21 var10 = class267.method1812((byte) 89, var9.field2762);
                    if (var10 == null || var10.field237 == null) {
                        arg1.field654[var8] = null;
                    } else {
                        var9.field2754++;
                        if (var9.field2765 < var10.field237.length && var9.field2754 > var10.field240[var9.field2765]) {
                            var9.field2754 = 1;
                            var9.field2765++;
                            class150.method1022(var10, (byte) -17, var9.field2765, arg1.field613, class197.field3179 == arg1, arg1.field614);
                        }
                        if (var10.field237.length <= var9.field2765) {
                            var9.field2765 -= var10.field248;
                            var9.field2767++;
                            if (var10.field247 <= var9.field2767) {
                                arg1.field654[var8] = null;
                            } else if (var9.field2765 >= 0 && var10.field237.length > var9.field2765) {
                                class150.method1022(var10, (byte) 126, var9.field2765, arg1.field613, class197.field3179 == arg1, arg1.field614);
                            } else {
                                arg1.field654[var8] = null;
                            }
                        }
                        var9.field2759 = var9.field2765 + 1;
                        if (var9.field2759 >= var10.field237.length) {
                            var9.field2759 -= var10.field248;
                            if ((var9.field2767 + 1) >= var10.field247) {
                                var9.field2759 = -1;
                            } else if (var9.field2759 < 0 || var10.field237.length <= var9.field2759) {
                                var9.field2759 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([Ljava/lang/String;III[S)V")
    public static final void method790(String[] arg0, int arg1, int arg2, int arg3, short[] arg4) {
        if (arg2 < arg3) {
            int var5 = (arg2 + arg3) / 2;
            String var6 = arg0[var5];
            arg0[var5] = arg0[arg3];
            int var7 = arg2;
            arg0[arg3] = var6;
            short var8 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var8;
            for (int var9 = arg2; var9 < arg3; var9++) {
                if (var6 == null || arg0[var9] != null && (var9 & 0x1) > arg0[var9].compareTo(var6)) {
                    String var10 = arg0[var9];
                    arg0[var9] = arg0[var7];
                    arg0[var7] = var10;
                    short var11 = arg4[var9];
                    arg4[var9] = arg4[var7];
                    arg4[var7++] = var11;
                }
            }
            arg0[arg3] = arg0[var7];
            arg0[var7] = var6;
            arg4[arg3] = arg4[var7];
            arg4[var7] = var8;
            method790(arg0, 1, arg2, var7 - 1, arg4);
            method790(arg0, arg1, var7 + 1, arg3, arg4);
        }
        field1872++;
        if (arg1 != 1) {
            field1877 = -104;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZIIIIZ)V")
    public static final void method791(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field1875++;
        if (arg3 == 3) {
            method791(68, true, -1, class207.field3332, -1, arg5, true);
            return;
        }
        Container var7;
        if (class87.field1188 != null) {
            var7 = class87.field1188;
        } else if (class284.field4537 == null) {
            var7 = class250.field4006.field4090;
        } else {
            var7 = class284.field4537;
        }
        class207.field3337 = var7.getSize().width;
        class7.field107 = var7.getSize().height;
        if (class284.field4537 == var7) {
            Insets var8 = class284.field4537.getInsets();
            class207.field3337 -= var8.right + var8.left;
            class7.field107 -= var8.top + var8.bottom;
        }
        if (arg3 >= 2) {
            class105.field1825 = 0;
            class107.field1856 = class207.field3337;
            class18.field213 = 0;
            class97.field1469 = class7.field107;
        } else {
            class107.field1856 = 765;
            class18.field213 = 0;
            class105.field1825 = (class207.field3337 - 765) / 2;
            class97.field1469 = 503;
        }
        if (arg6) {
            class296.method1973(class38.field458, 8175);
            class122.method853(true, class38.field458);
            if (class264.field4190 != null) {
                class264.field4190.method1282(-89, class38.field458);
            }
            class85.field1168.method472(false);
            class75.method574(class38.field458, -128);
            class98.method702((byte) 97, class38.field458);
            if (class264.field4190 != null) {
                class264.field4190.method1281(class38.field458, false);
            }
        } else {
            class38.field458.setSize(class107.field1856, class97.field1469);
            if (class284.field4537 == var7) {
                Insets var9 = class284.field4537.getInsets();
                class38.field458.setLocation(class105.field1825 + var9.left, var9.top - -class18.field213);
            } else {
                class38.field458.setLocation(class105.field1825, class18.field213);
            }
        }
        int var10 = -111 / ((arg0 - 26) / 39);
        if (arg3 > 0) {
            method791(81, true, -1, 0, -1, arg5, true);
            return;
        }
        class130.field2177 = !class200.method1349(false);
        if (class113.field1944 != -1) {
            class260.method1708(true, 74);
        }
        if (class149.field2395 != null && (class21.field249 == 30 || class21.field249 == 25)) {
            class237.method1559(true);
        }
        for (int var11 = 0; var11 < 100; var11++) {
            class272.field4396[var11] = true;
        }
        class128.field2143 = true;
    }
}
