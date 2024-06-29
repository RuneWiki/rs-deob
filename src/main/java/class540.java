import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class540 implements class344 {

    @OriginalMember(owner = "client!td", name = "h", descriptor = "Lwm;")
    private class30 field6802;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "Ljava/lang/String;")
    private String field6797;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "Ljava/util/Random;")
    public static Random field6796 = new Random();

    @OriginalMember(owner = "client!td", name = "d", descriptor = "Lrn;")
    public static class633 field6798 = new class633(30, 3);

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field6795;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field6799;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field6801;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
    public static void method2941(int arg0) {
        int var1 = -51 % ((26 - arg0) / 59);
        field6796 = null;
        field6798 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)Ldca;")
    public final class571 method254(byte arg0) {
        int var2 = -64 / ((arg0 - 48) / 51);
        field6801++;
        return class571.field7220;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)I")
    public final int method256(boolean arg0) {
        if (arg0) {
            this.method254((byte) 33);
        }
        field6800++;
        return this.field6802.method146(this.field6797, (byte) 127) ? 100 : 0;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lfda;I)V")
    public static final void method2942(class381 arg0, int arg1) {
        if (arg1 != -17946) {
            method2941(48);
        }
        field6795++;
        if (arg0.field4696 != -1) {
            class11 var2 = class143.field1864.method4265(true, arg0.field4696);
            if (var2 == null || var2.field109 == null) {
                arg0.field4696 = -1;
                arg0.field4715 = false;
            } else {
                label285: {
                    arg0.field4716++;
                    if (arg0.field4722 < var2.field109.length && arg0.field4716 > var2.field121[arg0.field4722]) {
                        arg0.field4716 = 1;
                        arg0.field4694++;
                        arg0.field4722++;
                        if (!arg0.field4688) {
                            class117.method699(arg0.field4722, var2, false, arg0);
                        }
                    }
                    if (arg0.field4722 >= var2.field109.length) {
                        arg0.field4716 = 0;
                        arg0.field4722 = 0;
                        if (arg0.field4715) {
                            arg0.field4696 = arg0.method2169(0).method398(true);
                            if (arg0.field4696 == -1) {
                                arg0.field4715 = false;
                                break label285;
                            }
                            var2 = class143.field1864.method4265(true, arg0.field4696);
                        }
                        if (!arg0.field4688) {
                            class117.method699(arg0.field4722, var2, false, arg0);
                        }
                    }
                    arg0.field4694 = arg0.field4722 + 1;
                    if (var2.field109 == null) {
                        arg0.field4696 = -1;
                        arg0.field4715 = false;
                    } else if (var2.field109.length <= arg0.field4694) {
                        arg0.field4694 = 0;
                    }
                }
            }
        }
        for (int var3 = 0; var3 < arg0.field4747.length; var3++) {
            if (arg0.field4747[var3].field5625 != -1 && class693.field8900 >= arg0.field4747[var3].field5620) {
                class353 var9 = class62.field819.method562((byte) 102, arg0.field4747[var3].field5625);
                int var10 = var9.field4292;
                if (var10 == -1) {
                    arg0.field4747[var3].field5625 = -1;
                } else {
                    class11 var11 = class143.field1864.method4265(true, var10);
                    if (var9.field4314) {
                        if (var11.field106 == 3) {
                            if (arg0.field4765 > 0 && arg0.field4675 <= class693.field8900 && class693.field8900 > arg0.field4690) {
                                arg0.field4747[var3].field5625 = -1;
                                continue;
                            }
                        } else if (var11.field106 == 1 && arg0.field4765 > 0 && class693.field8900 >= arg0.field4675 && arg0.field4690 < class693.field8900) {
                            arg0.field4747[var3].field5620 = class693.field8900 + 1;
                            continue;
                        }
                    }
                    if (var11 == null || var11.field109 == null) {
                        arg0.field4747[var3].field5625 = -1;
                    } else {
                        if (arg0.field4747[var3].field5626 < 0) {
                            arg0.field4747[var3].field5626 = 0;
                            if (!arg0.field4688) {
                                class117.method699(0, var11, false, arg0);
                            }
                        }
                        arg0.field4747[var3].field5628++;
                        if (var11.field109.length > arg0.field4747[var3].field5626 && var11.field121[arg0.field4747[var3].field5626] < arg0.field4747[var3].field5628) {
                            arg0.field4747[var3].field5628 = 1;
                            arg0.field4747[var3].field5626++;
                            if (!arg0.field4688) {
                                class117.method699(arg0.field4747[var3].field5626, var11, false, arg0);
                            }
                        }
                        if (var11.field109.length <= arg0.field4747[var3].field5626) {
                            if (var9.field4314) {
                                arg0.field4747[var3].field5626 -= var11.field111;
                                arg0.field4747[var3].field5622++;
                                if (var11.field104 <= arg0.field4747[var3].field5622) {
                                    arg0.field4747[var3].field5625 = -1;
                                } else if (arg0.field4747[var3].field5626 < 0 || arg0.field4747[var3].field5626 >= var11.field109.length) {
                                    arg0.field4747[var3].field5625 = -1;
                                } else if (!arg0.field4688) {
                                    class117.method699(arg0.field4747[var3].field5626, var11, false, arg0);
                                }
                            } else {
                                arg0.field4747[var3].field5625 = -1;
                            }
                        }
                        arg0.field4747[var3].field5621 = arg0.field4747[var3].field5626 + 1;
                        if (arg0.field4747[var3].field5621 >= var11.field109.length) {
                            if (var9.field4314) {
                                arg0.field4747[var3].field5621 -= var11.field111;
                                if ((arg0.field4747[var3].field5622 + 1) >= var11.field104) {
                                    arg0.field4747[var3].field5621 = -1;
                                } else if (arg0.field4747[var3].field5621 < 0 || var11.field109.length <= arg0.field4747[var3].field5621) {
                                    arg0.field4747[var3].field5621 = -1;
                                }
                            } else {
                                arg0.field4747[var3].field5621 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field4700 != -1 && arg0.field4692 <= 1) {
            class11 var4 = class143.field1864.method4265(true, arg0.field4700);
            if (var4.field106 == 3) {
                if (arg0.field4765 > 0 && arg0.field4675 <= class693.field8900 && arg0.field4690 < class693.field8900) {
                    arg0.field4748 = null;
                    arg0.field4700 = -1;
                }
            } else if (var4.field106 == 1 && arg0.field4765 > 0 && arg0.field4675 <= class693.field8900 && arg0.field4690 < class693.field8900) {
                arg0.field4692 = 2;
            }
        }
        if (arg0.field4700 != -1 && arg0.field4692 == 0) {
            class11 var5 = class143.field1864.method4265(true, arg0.field4700);
            if (var5 == null || var5.field109 == null) {
                arg0.field4700 = -1;
                arg0.field4748 = null;
            } else {
                arg0.field4729++;
                if (var5.field109.length > arg0.field4721 && var5.field121[arg0.field4721] < arg0.field4729) {
                    arg0.field4729 = 1;
                    arg0.field4721++;
                    if (!arg0.field4688) {
                        class117.method699(arg0.field4721, var5, false, arg0);
                    }
                }
                if (arg0.field4721 >= var5.field109.length) {
                    arg0.field4663++;
                    arg0.field4721 -= var5.field111;
                    if (var5.field104 <= arg0.field4663) {
                        arg0.field4748 = null;
                        arg0.field4700 = -1;
                    } else if (arg0.field4721 < 0 || var5.field109.length <= arg0.field4721) {
                        arg0.field4748 = null;
                        arg0.field4700 = -1;
                    } else if (!arg0.field4688) {
                        class117.method699(arg0.field4721, var5, false, arg0);
                    }
                }
                arg0.field4667 = arg0.field4721 + 1;
                if (arg0.field4667 >= var5.field109.length) {
                    arg0.field4667 -= var5.field111;
                    if (arg0.field4663 + 1 >= var5.field104) {
                        arg0.field4667 = -1;
                    } else if (arg0.field4667 < 0 || var5.field109.length <= arg0.field4667) {
                        arg0.field4667 = -1;
                    }
                }
            }
        }
        if (arg0.field4692 > 0) {
            arg0.field4692--;
        }
        for (int var6 = 0; var6 < arg0.field4752.length; var6++) {
            class129 var7 = arg0.field4752[var6];
            if (var7 != null) {
                if (var7.field1721 > 0) {
                    var7.field1721--;
                } else {
                    class11 var8 = class143.field1864.method4265(true, var7.field1726);
                    if (var8 == null || var8.field109 == null) {
                        arg0.field4752[var6] = null;
                    } else {
                        var7.field1728++;
                        if (var7.field1727 < var8.field109.length && var7.field1728 > var8.field121[var7.field1727]) {
                            var7.field1728 = 1;
                            var7.field1727++;
                            if (!arg0.field4688) {
                                class117.method699(var7.field1727, var8, false, arg0);
                            }
                        }
                        if (var7.field1727 >= var8.field109.length) {
                            var7.field1723++;
                            var7.field1727 -= var8.field111;
                            if (var8.field104 <= var7.field1723) {
                                arg0.field4752[var6] = null;
                            } else if (var7.field1727 < 0 || var7.field1727 >= var8.field109.length) {
                                arg0.field4752[var6] = null;
                            } else if (!arg0.field4688) {
                                class117.method699(var7.field1727, var8, false, arg0);
                            }
                        }
                        var7.field1722 = var7.field1727 + 1;
                        if (var8.field109.length <= var7.field1722) {
                            var7.field1722 -= var8.field111;
                            if (var8.field104 <= var7.field1723 + 1) {
                                var7.field1722 = -1;
                            } else if (var7.field1722 < 0 || var8.field109.length <= var7.field1722) {
                                var7.field1722 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lwm;Ljava/lang/String;)V")
    public class540(class30 arg0, String arg1) {
        this.field6802 = arg0;
        this.field6797 = arg1;
    }
}
