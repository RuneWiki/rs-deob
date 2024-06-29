import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class239 {

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field3558 = 0;

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "Lmga;")
    public static class30 field3568 = new class30("WTI", "office", "_wti", 5);

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "B")
    public byte field3561;

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "B")
    public byte field3567;

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "B")
    public byte field3570;

    @OriginalMember(owner = "client!vk", name = "r", descriptor = "B")
    public byte field3573;

    @OriginalMember(owner = "client!vk", name = "t", descriptor = "B")
    public byte field3575;

    @OriginalMember(owner = "client!vk", name = "w", descriptor = "B")
    public byte field3578;

    @OriginalMember(owner = "client!vk", name = "x", descriptor = "B")
    public byte field3579;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public int field3557;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
    public int field3564;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "I")
    public int field3565;

    @OriginalMember(owner = "client!vk", name = "s", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "S")
    public short field3566;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "Z")
    public boolean field3556;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "Z")
    public boolean field3560;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "Z")
    public boolean field3562;

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "Z")
    public boolean field3569;

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "Z")
    public boolean field3571;

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "Z")
    public boolean field3572;

    @OriginalMember(owner = "client!vk", name = "u", descriptor = "Z")
    public boolean field3576;

    @OriginalMember(owner = "client!vk", name = "v", descriptor = "Z")
    public boolean field3577;

    @OriginalMember(owner = "client!vk", name = "y", descriptor = "[[B")
    public static byte[][] field3580;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIII)V")
    public static final void method1612(int arg0, int arg1, int arg2, int arg3) {
        field3563++;
        if (arg3 != 1) {
            method1612(95, 20, -69, -89);
        }
        class121 var4 = class601.field8136[arg0][arg1];
        class469.method2858(var4 == null ? class483.field6736 : var4, arg2, -80);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BLni;)V")
    public static final void method1613(byte arg0, class515 arg1) {
        field3559++;
        if (arg1.field7159 != -1) {
            class57 var2 = class607.field8188.method3001(-12575, arg1.field7159);
            if (var2 == null || var2.field821 == null) {
                arg1.field7159 = -1;
                arg1.field7165 = false;
            } else {
                label283: {
                    arg1.field7111++;
                    if (var2.field821.length > arg1.field7135 && var2.field813[arg1.field7135] < arg1.field7111) {
                        arg1.field7135++;
                        arg1.field7177++;
                        arg1.field7111 = 1;
                        if (!arg1.field7134) {
                            class123.method765(arg1.field7135, arg1, var2, false);
                        }
                    }
                    if (var2.field821.length <= arg1.field7135) {
                        arg1.field7111 = 0;
                        arg1.field7135 = 0;
                        if (arg1.field7165) {
                            arg1.field7159 = arg1.method3084((byte) -92).method180(-125);
                            if (arg1.field7159 == -1) {
                                arg1.field7165 = false;
                                break label283;
                            }
                            var2 = class607.field8188.method3001(-12575, arg1.field7159);
                        }
                        if (!arg1.field7134) {
                            class123.method765(arg1.field7135, arg1, var2, false);
                        }
                    }
                    arg1.field7177 = arg1.field7135 + 1;
                    if (var2.field821 == null) {
                        arg1.field7165 = false;
                        arg1.field7159 = -1;
                    } else if (var2.field821.length <= arg1.field7177) {
                        arg1.field7177 = 0;
                    }
                }
            }
        }
        if (arg0 <= 108) {
            return;
        }
        for (int var3 = 0; var3 < arg1.field7190.length; var3++) {
            if (arg1.field7190[var3].field7339 != -1 && class483.field6741 >= arg1.field7190[var3].field7349) {
                class46 var9 = class129.field1776.method4073(-7428, arg1.field7190[var3].field7339);
                int var10 = var9.field596;
                if (var10 == -1) {
                    arg1.field7190[var3].field7339 = -1;
                } else {
                    class57 var11 = class607.field8188.method3001(-12575, var10);
                    if (var9.field592) {
                        if (var11.field799 == 3) {
                            if (arg1.field7199 > 0 && arg1.field7107 <= class483.field6741 && arg1.field7173 < class483.field6741) {
                                arg1.field7190[var3].field7339 = -1;
                                continue;
                            }
                        } else if (var11.field799 == 1 && arg1.field7199 > 0 && class483.field6741 >= arg1.field7107 && class483.field6741 > arg1.field7173) {
                            arg1.field7190[var3].field7349 = class483.field6741 + 1;
                            continue;
                        }
                    }
                    if (var11 == null || var11.field821 == null) {
                        arg1.field7190[var3].field7339 = -1;
                    } else {
                        if (arg1.field7190[var3].field7342 < 0) {
                            arg1.field7190[var3].field7342 = 0;
                            if (!arg1.field7134) {
                                class123.method765(0, arg1, var11, false);
                            }
                        }
                        arg1.field7190[var3].field7348++;
                        if (arg1.field7190[var3].field7342 < var11.field821.length && var11.field813[arg1.field7190[var3].field7342] < arg1.field7190[var3].field7348) {
                            arg1.field7190[var3].field7348 = 1;
                            arg1.field7190[var3].field7342++;
                            if (!arg1.field7134) {
                                class123.method765(arg1.field7190[var3].field7342, arg1, var11, false);
                            }
                        }
                        if (var11.field821.length <= arg1.field7190[var3].field7342) {
                            if (var9.field592) {
                                arg1.field7190[var3].field7342 -= var11.field806;
                                arg1.field7190[var3].field7338++;
                                if (var11.field809 <= arg1.field7190[var3].field7338) {
                                    arg1.field7190[var3].field7339 = -1;
                                } else if (arg1.field7190[var3].field7342 < 0 || var11.field821.length <= arg1.field7190[var3].field7342) {
                                    arg1.field7190[var3].field7339 = -1;
                                } else if (!arg1.field7134) {
                                    class123.method765(arg1.field7190[var3].field7342, arg1, var11, false);
                                }
                            } else {
                                arg1.field7190[var3].field7339 = -1;
                            }
                        }
                        arg1.field7190[var3].field7347 = arg1.field7190[var3].field7342 + 1;
                        if (var11.field821.length <= arg1.field7190[var3].field7347) {
                            if (var9.field592) {
                                arg1.field7190[var3].field7347 -= var11.field806;
                                if ((arg1.field7190[var3].field7338 + 1) >= var11.field809) {
                                    arg1.field7190[var3].field7347 = -1;
                                } else if (arg1.field7190[var3].field7347 < 0 || arg1.field7190[var3].field7347 >= var11.field821.length) {
                                    arg1.field7190[var3].field7347 = -1;
                                }
                            } else {
                                arg1.field7190[var3].field7347 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field7132 != -1 && arg1.field7170 <= 1) {
            class57 var4 = class607.field8188.method3001(-12575, arg1.field7132);
            if (var4.field799 == 3) {
                if (arg1.field7199 > 0 && arg1.field7107 <= class483.field6741 && class483.field6741 > arg1.field7173) {
                    arg1.field7105 = null;
                    arg1.field7132 = -1;
                }
            } else if (var4.field799 == 1 && arg1.field7199 > 0 && class483.field6741 >= arg1.field7107 && class483.field6741 > arg1.field7173) {
                arg1.field7170 = 2;
            }
        }
        if (arg1.field7132 != -1 && arg1.field7170 == 0) {
            class57 var5 = class607.field8188.method3001(-12575, arg1.field7132);
            if (var5 == null || var5.field821 == null) {
                arg1.field7105 = null;
                arg1.field7132 = -1;
            } else {
                arg1.field7131++;
                if (var5.field821.length > arg1.field7127 && arg1.field7131 > var5.field813[arg1.field7127]) {
                    arg1.field7127++;
                    arg1.field7131 = 1;
                    if (!arg1.field7134) {
                        class123.method765(arg1.field7127, arg1, var5, false);
                    }
                }
                if (var5.field821.length <= arg1.field7127) {
                    arg1.field7127 -= var5.field806;
                    arg1.field7123++;
                    if (arg1.field7123 >= var5.field809) {
                        arg1.field7105 = null;
                        arg1.field7132 = -1;
                    } else if (arg1.field7127 < 0 || var5.field821.length <= arg1.field7127) {
                        arg1.field7132 = -1;
                        arg1.field7105 = null;
                    } else if (!arg1.field7134) {
                        class123.method765(arg1.field7127, arg1, var5, false);
                    }
                }
                arg1.field7164 = arg1.field7127 + 1;
                if (arg1.field7164 >= var5.field821.length) {
                    arg1.field7164 -= var5.field806;
                    if ((arg1.field7123 + 1) >= var5.field809) {
                        arg1.field7164 = -1;
                    } else if (arg1.field7164 < 0 || var5.field821.length <= arg1.field7164) {
                        arg1.field7164 = -1;
                    }
                }
            }
        }
        if (arg1.field7170 > 0) {
            arg1.field7170--;
        }
        for (int var6 = 0; var6 < arg1.field7151.length; var6++) {
            class597 var7 = arg1.field7151[var6];
            if (var7 != null) {
                if (var7.field8106 > 0) {
                    var7.field8106--;
                } else {
                    class57 var8 = class607.field8188.method3001(-12575, var7.field8105);
                    if (var8 == null || var8.field821 == null) {
                        arg1.field7151[var6] = null;
                    } else {
                        var7.field8101++;
                        if (var7.field8103 < var8.field821.length && var8.field813[var7.field8103] < var7.field8101) {
                            var7.field8101 = 1;
                            var7.field8103++;
                            if (!arg1.field7134) {
                                class123.method765(var7.field8103, arg1, var8, false);
                            }
                        }
                        if (var7.field8103 >= var8.field821.length) {
                            var7.field8099++;
                            var7.field8103 -= var8.field806;
                            if (var8.field809 <= var7.field8099) {
                                arg1.field7151[var6] = null;
                            } else if (var7.field8103 < 0 || var8.field821.length <= var7.field8103) {
                                arg1.field7151[var6] = null;
                            } else if (!arg1.field7134) {
                                class123.method765(var7.field8103, arg1, var8, false);
                            }
                        }
                        var7.field8100 = var7.field8103 + 1;
                        if (var7.field8100 >= var8.field821.length) {
                            var7.field8100 -= var8.field806;
                            if (var8.field809 <= (var7.field8099 + 1)) {
                                var7.field8100 = -1;
                            } else if (var7.field8100 < 0 || var7.field8100 >= var8.field821.length) {
                                var7.field8100 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
    public static void method1614(int arg0) {
        field3580 = null;
        int var1 = -16 % ((39 - arg0) / 36);
        field3568 = null;
    }
}
