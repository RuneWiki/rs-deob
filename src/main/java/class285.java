import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class285 extends class3 {

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "I")
    private int field4675;

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "F")
    public static float field4676 = 128.0F;

    @OriginalMember(owner = "client!ai", name = "F", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!ai", name = "G", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!ai", name = "H", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!ai", name = "J", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!ai", name = "I", descriptor = "Lnm;")
    public static class221 field4671;

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "[I")
    public static int[] field4673;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILnm;)V", line = 4)
    public static final void method2014(int arg0, class221 arg1) {
        field4672++;
        if (class30.field460) {
            return;
        }
        if (class245.field3886) {
            class335.method2364();
        } else {
            class317.method2283();
        }
        class15.field201 = class54.method390(arg1, false, class290.field4819);
        int var2 = class243.field3838;
        int var3 = var2 * 956 / 503;
        if (arg0 != -1) {
            method2016((class287) null, -6);
        }
        class15.field201.method959((class233.field3712 - var3) / 2, 0, var3, var2);
        class13.field165 = class312.method2182(arg1, class341.field5502, (byte) -35);
        class13.field165.method572(class233.field3712 / 2 - class13.field165.field2915 / 2, 18);
        class30.field460 = true;
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(I)V", line = 31)
    public static final void method2015(int arg0) {
        field4677++;
        if (class148.field2396 == 2) {
            if (class138.field2181 == class107.field1533 && class39.field595 == class267.field4401) {
                class148.field2396 = 0;
                if (class148.field2397 && class294.field4896[81] && class117.field1701 > 2) {
                    class96.method637((byte) 127, class117.field1701 - 2);
                } else {
                    class96.method637((byte) 127, class117.field1701 - 1);
                }
            }
        } else if (class241.field3777 == class138.field2181 && class69.field1074 == class39.field595) {
            class148.field2396 = 0;
            if (class148.field2397 && class294.field4896[81] && class117.field1701 > 2) {
                class96.method637((byte) 127, class117.field1701 - 2);
            } else {
                class96.method637((byte) 127, class117.field1701 - 1);
            }
        } else {
            class107.field1533 = class241.field3777;
            class267.field4401 = class69.field1074;
            class148.field2396 = 2;
        }
        if (arg0 != -3) {
            method2014(35, (class221) null);
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V", line = 84)
    public class285() {
        this(4096);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lre;I)V", line = 90)
    public static final void method2016(class287 arg0, int arg1) {
        field4678++;
        arg0.field4794 = false;
        if (arg0.field4750 != -1) {
            class131 var2 = class68.method476((byte) 73, arg0.field4750);
            if (var2 == null || var2.field1988 == null) {
                arg0.field4750 = -1;
            } else {
                arg0.field4711++;
                if (var2.field1988.length > arg0.field4716 && arg0.field4711 > var2.field2002[arg0.field4716]) {
                    arg0.field4716++;
                    arg0.field4747++;
                    arg0.field4711 = 1;
                    class276.method1970(var2, class329.field5388 == arg0, arg0.field4783, 105, arg0.field4796, arg0.field4716);
                }
                if (arg0.field4716 >= var2.field1988.length) {
                    arg0.field4716 = 0;
                    arg0.field4711 = 0;
                    class276.method1970(var2, class329.field5388 == arg0, arg0.field4783, 75, arg0.field4796, arg0.field4716);
                }
                arg0.field4747 = arg0.field4716 + 1;
                if (var2.field1988.length <= arg0.field4747) {
                    arg0.field4747 = 0;
                }
            }
        }
        if (arg0.field4784 != -1 && class58.field875 >= arg0.field4777) {
            class172 var3 = class214.method1455((byte) -6, arg0.field4784);
            int var4 = var3.field2675;
            if (var4 == -1) {
                arg0.field4784 = -1;
            } else {
                label308: {
                    class131 var5 = class68.method476((byte) 78, var4);
                    if (var3.field2689) {
                        if (var5.field2000 == 3) {
                            if (arg0.field4694 > 0 && class58.field875 >= arg0.field4799 && arg0.field4726 < class58.field875) {
                                arg0.field4784 = -1;
                                break label308;
                            }
                        } else if (var5.field2000 == 1 && arg0.field4694 > 0 && arg0.field4799 <= class58.field875 && arg0.field4726 < class58.field875) {
                            arg0.field4777 = class58.field875 + 1;
                            break label308;
                        }
                    }
                    if (var5 == null || var5.field1988 == null) {
                        arg0.field4784 = -1;
                    } else {
                        if (arg0.field4701 < 0) {
                            arg0.field4701 = 0;
                            class276.method1970(var5, class329.field5388 == arg0, arg0.field4783, 120, arg0.field4796, 0);
                        }
                        arg0.field4712++;
                        if (arg0.field4701 < var5.field1988.length && arg0.field4712 > var5.field2002[arg0.field4701]) {
                            arg0.field4712 = 1;
                            arg0.field4701++;
                            class276.method1970(var5, class329.field5388 == arg0, arg0.field4783, 93, arg0.field4796, arg0.field4701);
                        }
                        if (arg0.field4701 >= var5.field1988.length) {
                            if (var3.field2689) {
                                arg0.field4719++;
                                arg0.field4701 -= var5.field1986;
                                if (arg0.field4719 >= var5.field2008) {
                                    arg0.field4784 = -1;
                                } else if (arg0.field4701 >= 0 && arg0.field4701 < var5.field1988.length) {
                                    class276.method1970(var5, class329.field5388 == arg0, arg0.field4783, 102, arg0.field4796, arg0.field4701);
                                } else {
                                    arg0.field4784 = -1;
                                }
                            } else {
                                arg0.field4784 = -1;
                            }
                        }
                        arg0.field4718 = arg0.field4701 + 1;
                        if (var5.field1988.length <= arg0.field4718) {
                            if (var3.field2689) {
                                arg0.field4718 -= var5.field1986;
                                if (var5.field2008 <= (arg0.field4719 + 1)) {
                                    arg0.field4718 = -1;
                                } else if (arg0.field4718 < 0 || var5.field1988.length <= arg0.field4718) {
                                    arg0.field4718 = -1;
                                }
                            } else {
                                arg0.field4718 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field4795 != -1 && arg0.field4715 <= 1) {
            class131 var6 = class68.method476((byte) 86, arg0.field4795);
            if (var6.field2000 == 3) {
                if (arg0.field4694 > 0 && class58.field875 >= arg0.field4799 && class58.field875 > arg0.field4726) {
                    arg0.field4795 = -1;
                }
            } else if (var6.field2000 == 1 && arg0.field4694 > 0 && class58.field875 >= arg0.field4799 && arg0.field4726 < class58.field875) {
                arg0.field4715 = 2;
            }
        }
        if (arg0.field4795 != -1 && arg0.field4715 == 0) {
            class131 var7 = class68.method476((byte) 77, arg0.field4795);
            if (var7 == null || var7.field1988 == null) {
                arg0.field4795 = -1;
            } else {
                arg0.field4776++;
                if (var7.field1988.length > arg0.field4773 && arg0.field4776 > var7.field2002[arg0.field4773]) {
                    arg0.field4776 = 1;
                    arg0.field4773++;
                    class276.method1970(var7, class329.field5388 == arg0, arg0.field4783, 111, arg0.field4796, arg0.field4773);
                }
                if (arg0.field4773 >= var7.field1988.length) {
                    arg0.field4703++;
                    arg0.field4773 -= var7.field1986;
                    if (arg0.field4703 >= var7.field2008) {
                        arg0.field4795 = -1;
                    } else if (arg0.field4773 >= 0 && var7.field1988.length > arg0.field4773) {
                        class276.method1970(var7, class329.field5388 == arg0, arg0.field4783, 122, arg0.field4796, arg0.field4773);
                    } else {
                        arg0.field4795 = -1;
                    }
                }
                arg0.field4767 = arg0.field4773 + 1;
                if (var7.field1988.length <= arg0.field4767) {
                    arg0.field4767 -= var7.field1986;
                    if (var7.field2008 <= arg0.field4703 + 1) {
                        arg0.field4767 = -1;
                    } else if (arg0.field4767 < 0 || var7.field1988.length <= arg0.field4767) {
                        arg0.field4767 = -1;
                    }
                }
                arg0.field4794 = var7.field2009;
            }
        }
        if (arg0.field4715 > 0) {
            arg0.field4715--;
        }
        if (arg1 <= 49) {
            return;
        }
        for (int var8 = 0; var8 < arg0.field4771.length; var8++) {
            class223 var9 = arg0.field4771[var8];
            if (var9 != null) {
                if (var9.field3438 > 0) {
                    var9.field3438--;
                } else {
                    class131 var10 = class68.method476((byte) 104, var9.field3450);
                    if (var10 == null || var10.field1988 == null) {
                        arg0.field4771[var8] = null;
                    } else {
                        var9.field3445++;
                        if (var9.field3451 < var10.field1988.length && var10.field2002[var9.field3451] < var9.field3445) {
                            var9.field3451++;
                            var9.field3445 = 1;
                            class276.method1970(var10, class329.field5388 == arg0, arg0.field4783, 84, arg0.field4796, var9.field3451);
                        }
                        if (var10.field1988.length <= var9.field3451) {
                            var9.field3451 -= var10.field1986;
                            var9.field3456++;
                            if (var9.field3456 >= var10.field2008) {
                                arg0.field4771[var8] = null;
                            } else if (var9.field3451 >= 0 && var9.field3451 < var10.field1988.length) {
                                class276.method1970(var10, class329.field5388 == arg0, arg0.field4783, 124, arg0.field4796, var9.field3451);
                            } else {
                                arg0.field4771[var8] = null;
                            }
                        }
                        var9.field3452 = var9.field3451 + 1;
                        if (var10.field1988.length <= var9.field3452) {
                            var9.field3452 -= var10.field1986;
                            if (var9.field3456 + 1 >= var10.field2008) {
                                var9.field3452 = -1;
                            } else if (var9.field3452 < 0 || var9.field3452 >= var10.field1988.length) {
                                var9.field3452 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BI)[I", line = 396)
    public final int[] method25(byte arg0, int arg1) {
        int[] var3 = this.field21.method1258(arg1, 0);
        field4668++;
        if (this.field21.field2808) {
            class298.method2106(var3, 0, class326.field5342, this.field4675);
        }
        return arg0 <= 57 ? (int[]) null : var3;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(I)V", line = 417)
    public class285(int arg0) {
        super(0, true);
        this.field4675 = 4096;
        this.field4675 = arg0;
    }

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "(I)V", line = 433)
    public static void method2017(int arg0) {
        field4673 = null;
        if (arg0 > -65) {
            field4671 = (class221) null;
        }
        field4671 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lfh;IZ)V", line = 454)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        if (arg1 == 0) {
            this.field4675 = (arg0.method2224(-126) << 12) / 255;
        }
        field4674++;
        if (arg2) {
            this.method14((class313) null, -25, false);
        }
    }
}
