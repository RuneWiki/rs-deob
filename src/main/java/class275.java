import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class275 {

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "I")
    public static int field3980 = -1;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!oca", name = "d", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(ILvn;)V", line = 16)
    public static final void method1780(int arg0, class330 arg1) {
        field3982++;
        if (arg1.field4659 != -1) {
            class607 var2 = class563.field7993.method651(arg1.field4659, (byte) 104);
            if (var2 == null || var2.field8492 == null) {
                arg1.field4615 = false;
                arg1.field4659 = -1;
            } else {
                label283: {
                    arg1.field4646++;
                    if (var2.field8492.length > arg1.field4634 && arg1.field4646 > var2.field8494[arg1.field4634]) {
                        arg1.field4597++;
                        arg1.field4634++;
                        arg1.field4646 = 1;
                        if (!arg1.field4577) {
                            class760.method4227(255, arg1, var2, arg1.field4634);
                        }
                    }
                    if (arg1.field4634 >= var2.field8492.length) {
                        arg1.field4634 = 0;
                        arg1.field4646 = 0;
                        if (arg1.field4615) {
                            arg1.field4659 = arg1.method2096(0).method3239(6077);
                            if (arg1.field4659 == -1) {
                                arg1.field4615 = false;
                                break label283;
                            }
                            var2 = class563.field7993.method651(arg1.field4659, (byte) 93);
                        }
                        if (!arg1.field4577) {
                            class760.method4227(arg0 + 223, arg1, var2, arg1.field4634);
                        }
                    }
                    arg1.field4597 = arg1.field4634 + 1;
                    if (var2.field8492 == null) {
                        arg1.field4659 = -1;
                        arg1.field4615 = false;
                    } else if (arg1.field4597 >= var2.field8492.length) {
                        arg1.field4597 = 0;
                    }
                }
            }
        }
        for (int var3 = 0; var3 < arg1.field4638.length; var3++) {
            if (arg1.field4638[var3].field10142 != -1 && arg1.field4638[var3].field10149 <= class192.field2961) {
                class278 var9 = class456.field6385.method2382(arg1.field4638[var3].field10142, (byte) -88);
                int var10 = var9.field4040;
                if (var10 == -1) {
                    arg1.field4638[var3].field10142 = -1;
                } else {
                    class607 var11 = class563.field7993.method651(var10, (byte) 124);
                    if (var9.field4042) {
                        if (var11.field8489 == 3) {
                            if (arg1.field4675 > 0 && class192.field2961 >= arg1.field4629 && arg1.field4658 < class192.field2961) {
                                arg1.field4638[var3].field10142 = -1;
                                continue;
                            }
                        } else if (var11.field8489 == 1 && arg1.field4675 > 0 && class192.field2961 >= arg1.field4629 && class192.field2961 > arg1.field4658) {
                            arg1.field4638[var3].field10149 = class192.field2961 + 1;
                            continue;
                        }
                    }
                    if (var11 == null || var11.field8492 == null) {
                        arg1.field4638[var3].field10142 = -1;
                    } else {
                        if (arg1.field4638[var3].field10140 < 0) {
                            arg1.field4638[var3].field10140 = 0;
                            if (!arg1.field4577) {
                                class760.method4227(arg0 ^ 0xDF, arg1, var11, 0);
                            }
                        }
                        arg1.field4638[var3].field10139++;
                        if (arg1.field4638[var3].field10140 < var11.field8492.length && var11.field8494[arg1.field4638[var3].field10140] < arg1.field4638[var3].field10139) {
                            arg1.field4638[var3].field10139 = 1;
                            arg1.field4638[var3].field10140++;
                            if (!arg1.field4577) {
                                class760.method4227(arg0 + 223, arg1, var11, arg1.field4638[var3].field10140);
                            }
                        }
                        if (arg1.field4638[var3].field10140 >= var11.field8492.length) {
                            if (var9.field4042) {
                                arg1.field4638[var3].field10140 -= var11.field8495;
                                arg1.field4638[var3].field10141++;
                                if (arg1.field4638[var3].field10141 >= var11.field8490) {
                                    arg1.field4638[var3].field10142 = -1;
                                } else if (arg1.field4638[var3].field10140 < 0 || var11.field8492.length <= arg1.field4638[var3].field10140) {
                                    arg1.field4638[var3].field10142 = -1;
                                } else if (!arg1.field4577) {
                                    class760.method4227(arg0 ^ 0xDF, arg1, var11, arg1.field4638[var3].field10140);
                                }
                            } else {
                                arg1.field4638[var3].field10142 = -1;
                            }
                        }
                        arg1.field4638[var3].field10147 = arg1.field4638[var3].field10140 + 1;
                        if (arg1.field4638[var3].field10147 >= var11.field8492.length) {
                            if (var9.field4042) {
                                arg1.field4638[var3].field10147 -= var11.field8495;
                                if (var11.field8490 <= arg1.field4638[var3].field10141 + 1) {
                                    arg1.field4638[var3].field10147 = -1;
                                } else if (arg1.field4638[var3].field10147 < 0 || arg1.field4638[var3].field10147 >= var11.field8492.length) {
                                    arg1.field4638[var3].field10147 = -1;
                                }
                            } else {
                                arg1.field4638[var3].field10147 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field4604 != -1 && arg1.field4580 <= 1) {
            class607 var4 = class563.field7993.method651(arg1.field4604, (byte) 109);
            if (var4.field8489 == 3) {
                if (arg1.field4675 > 0 && class192.field2961 >= arg1.field4629 && arg1.field4658 < class192.field2961) {
                    arg1.field4609 = null;
                    arg1.field4604 = -1;
                }
            } else if (var4.field8489 == 1 && arg1.field4675 > 0 && class192.field2961 >= arg1.field4629 && arg1.field4658 < class192.field2961) {
                arg1.field4580 = 2;
            }
        }
        if (arg1.field4604 != -1 && arg1.field4580 == 0) {
            class607 var5 = class563.field7993.method651(arg1.field4604, (byte) 123);
            if (var5 == null || var5.field8492 == null) {
                arg1.field4609 = null;
                arg1.field4604 = -1;
            } else {
                arg1.field4575++;
                if (arg1.field4583 < var5.field8492.length && arg1.field4575 > var5.field8494[arg1.field4583]) {
                    arg1.field4583++;
                    arg1.field4575 = 1;
                    if (!arg1.field4577) {
                        class760.method4227(255, arg1, var5, arg1.field4583);
                    }
                }
                if (var5.field8492.length <= arg1.field4583) {
                    arg1.field4583 -= var5.field8495;
                    arg1.field4603++;
                    if (var5.field8490 <= arg1.field4603) {
                        arg1.field4604 = -1;
                        arg1.field4609 = null;
                    } else if (arg1.field4583 < 0 || arg1.field4583 >= var5.field8492.length) {
                        arg1.field4609 = null;
                        arg1.field4604 = -1;
                    } else if (!arg1.field4577) {
                        class760.method4227(255, arg1, var5, arg1.field4583);
                    }
                }
                arg1.field4657 = arg1.field4583 + 1;
                if (arg1.field4657 >= var5.field8492.length) {
                    arg1.field4657 -= var5.field8495;
                    if (arg1.field4603 + 1 >= var5.field8490) {
                        arg1.field4657 = -1;
                    } else if (arg1.field4657 < 0 || arg1.field4657 >= var5.field8492.length) {
                        arg1.field4657 = -1;
                    }
                }
            }
        }
        if (arg1.field4580 > 0) {
            arg1.field4580--;
        }
        if (arg0 != 32) {
            return;
        }
        for (int var6 = 0; var6 < arg1.field4608.length; var6++) {
            class220 var7 = arg1.field4608[var6];
            if (var7 != null) {
                if (var7.field3410 > 0) {
                    var7.field3410--;
                } else {
                    class607 var8 = class563.field7993.method651(var7.field3412, (byte) 113);
                    if (var8 == null || var8.field8492 == null) {
                        arg1.field4608[var6] = null;
                    } else {
                        var7.field3408++;
                        if (var7.field3411 < var8.field8492.length && var7.field3408 > var8.field8494[var7.field3411]) {
                            var7.field3411++;
                            var7.field3408 = 1;
                            if (!arg1.field4577) {
                                class760.method4227(arg0 + 223, arg1, var8, var7.field3411);
                            }
                        }
                        if (var8.field8492.length <= var7.field3411) {
                            var7.field3407++;
                            var7.field3411 -= var8.field8495;
                            if (var7.field3407 >= var8.field8490) {
                                arg1.field4608[var6] = null;
                            } else if (var7.field3411 < 0 || var7.field3411 >= var8.field8492.length) {
                                arg1.field4608[var6] = null;
                            } else if (!arg1.field4577) {
                                class760.method4227(255, arg1, var8, var7.field3411);
                            }
                        }
                        var7.field3415 = var7.field3411 + 1;
                        if (var8.field8492.length <= var7.field3415) {
                            var7.field3415 -= var8.field8495;
                            if ((var7.field3407 + 1) >= var8.field8490) {
                                var7.field3415 = -1;
                            } else if (var7.field3415 < 0 || var7.field3415 >= var8.field8492.length) {
                                var7.field3415 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(Ljava/lang/String;I)[B", line = 380)
    public static final byte[] method1781(String arg0, int arg1) {
        if (arg1 != 255) {
            method1781(null, 111);
        }
        field3979++;
        int var2 = arg0.length();
        if (var2 == 0) {
            return new byte[0];
        }
        int var3 = var2 + 3 & 0xFFFFFFFC;
        int var4 = var3 / 4 * 3;
        if (var2 <= var3 - 2 || class290.method1860(arg0.charAt(var3 - 2), (byte) 120) == -1) {
            var4 -= 2;
        } else if (var2 <= var3 - 1 || class290.method1860(arg0.charAt(var3 - 1), (byte) 94) == -1) {
            var4--;
        }
        byte[] var5 = new byte[var4];
        class359.method2267(arg0, 0, arg1 - 253, var5);
        return var5;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(IIILeo;I)V", line = 459)
    public static final void method1782(int arg0, int arg1, int arg2, class312 arg3, int arg4) {
        field3981++;
        if (arg0 != -1) {
            field3980 = 0;
        }
        arg3.field4445.method2959(arg1, (byte) -72);
        arg3.field4445.method2969(arg2, -414819352);
        arg3.field4445.method2990(arg0 ^ 0xFFFFFF00, arg4);
    }
}
