import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public abstract class class57 extends class120 {

    @OriginalMember(owner = "client!jr", name = "l", descriptor = "S")
    public short field711;

    @OriginalMember(owner = "client!jr", name = "m", descriptor = "B")
    public byte field712;

    @OriginalMember(owner = "client!jr", name = "w", descriptor = "I")
    public int field722;

    @OriginalMember(owner = "client!jr", name = "u", descriptor = "S")
    public short field720;

    @OriginalMember(owner = "client!jr", name = "A", descriptor = "S")
    public short field726;

    @OriginalMember(owner = "client!jr", name = "r", descriptor = "Z")
    public boolean field717;

    @OriginalMember(owner = "client!jr", name = "o", descriptor = "B")
    public byte field714;

    @OriginalMember(owner = "client!jr", name = "v", descriptor = "I")
    public int field721;

    @OriginalMember(owner = "client!jr", name = "k", descriptor = "S")
    public short field710;

    @OriginalMember(owner = "client!jr", name = "y", descriptor = "I")
    public int field724;

    @OriginalMember(owner = "client!jr", name = "p", descriptor = "I")
    public static int field715 = 0;

    @OriginalMember(owner = "client!jr", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field708 = new String[200];

    @OriginalMember(owner = "client!jr", name = "j", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!jr", name = "n", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!jr", name = "q", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!jr", name = "s", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!jr", name = "t", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!jr", name = "x", descriptor = "I")
    public int field723;

    @OriginalMember(owner = "client!jr", name = "B", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!jr", name = "z", descriptor = "Lwd;")
    public static class148 field725;

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "(I)V")
    public static void method373(int arg0) {
        if (arg0 == 0) {
            field708 = null;
            field725 = null;
        }
    }

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "(I)I")
    public abstract int method314(int arg0);

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)V")
    public static final void method374(int arg0, int arg1) {
        if (class172.field2714 == null || arg1 > class172.field2714.length) {
            class172.field2714 = new int[arg1];
        }
        if (arg0 == 29334) {
            field713++;
        }
    }

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "(I)V")
    public void method375(int arg0) {
        field719++;
        int var2 = -34 % ((arg0 + 35) / 55);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(CI)Z")
    public static final boolean method376(char arg0, int arg1) {
        field716++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class318.method2112(-98, arg0)) {
            return true;
        } else {
            int var2 = 88 / ((-arg1 - 34) / 41);
            char[] var3 = class290.field4636;
            for (int var4 = 0; var4 < var3.length; var4++) {
                char var8 = var3[var4];
                if (arg0 == var8) {
                    return true;
                }
            }
            char[] var5 = class209.field3363;
            for (int var6 = 0; var6 < var5.length; var6++) {
                char var7 = var5[var6];
                if (arg0 == var7) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lne;Ljava/lang/String;Z)Ljava/lang/String;")
    public static final String method377(class172 arg0, String arg1, boolean arg2) {
        field718++;
        if (arg1.indexOf("%") != -1) {
            label56: while (true) {
                int var3 = arg1.indexOf("%1");
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.indexOf("%2");
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.indexOf("%3");
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg1.indexOf("%4");
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.indexOf("%5");
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg1.indexOf("%dns");
                                                        if (var8 == -1) {
                                                            break label56;
                                                        }
                                                        String var9 = "";
                                                        if (class379.field5747 != null) {
                                                            if (class379.field5747.field305 == null) {
                                                                var9 = class340.method2235(class379.field5747.field308, -43);
                                                            } else {
                                                                var9 = (String) class379.field5747.field305;
                                                            }
                                                        }
                                                        arg1 = arg1.substring(0, var8) + var9 + arg1.substring(var8 + 4);
                                                    }
                                                }
                                                arg1 = arg1.substring(0, var7) + class381.method2426(class285.method1936(arg0, 4, false), 999999999) + arg1.substring(var7 + 2);
                                            }
                                        }
                                        arg1 = arg1.substring(0, var6) + class381.method2426(class285.method1936(arg0, 3, false), 999999999) + arg1.substring(var6 + 2);
                                    }
                                }
                                arg1 = arg1.substring(0, var5) + class381.method2426(class285.method1936(arg0, 2, false), 999999999) + arg1.substring(var5 + 2);
                            }
                        }
                        arg1 = arg1.substring(0, var4) + class381.method2426(class285.method1936(arg0, 1, arg2), 999999999) + arg1.substring(var4 + 2);
                    }
                }
                arg1 = arg1.substring(0, var3) + class381.method2426(class285.method1936(arg0, 0, false), 999999999) + arg1.substring(var3 + 2);
            }
        }
        if (arg2) {
            field708 = null;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZJ)V")
    public static final void method378(boolean arg0, long arg1) {
        field709++;
        if (!arg0) {
            field708 = null;
        }
        int var3 = class144.field2269;
        if (class217.field3555 != var3) {
            int var4 = var3 - class217.field3555;
            int var5 = (int) ((long) var4 * arg1 / 320L);
            if (var4 > 0) {
                if (var5 == 0) {
                    var5 = 1;
                } else if (var4 < var5) {
                    var5 = var4;
                }
            } else if (var5 == 0) {
                var5 = -1;
            } else if (var5 < var4) {
                var5 = var4;
            }
            class217.field3555 += var5;
        }
        int var6 = class290.field4639;
        if (class163.field2551 != var6) {
            int var7 = var6 - class163.field2551;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class163.field2551 += var8;
        }
        if (!class301.field4772) {
            class329.field5153 += (float) arg1 * class424.field6260 / 40.0F * 8.0F;
            class316.field4958 += (float) arg1 * class137.field2144 / 40.0F * 8.0F;
        }
        class372.method2376(80);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IBIIII)V")
    public static final void method379(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field727++;
        int var6 = arg0 - arg4;
        int var7 = arg2 - arg5;
        if (var7 == 0) {
            if (var6 != 0) {
                class140.method1019(4, arg0, arg4, arg3, arg5);
            }
        } else if (var6 == 0) {
            class129.method956(arg4, arg5, 0, arg3, arg2);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg5;
                arg5 = arg4;
                int var10 = arg2;
                arg2 = arg0;
                arg4 = var9;
                arg0 = var10;
            }
            if (arg5 > arg2) {
                int var11 = arg5;
                int var12 = arg4;
                arg5 = arg2;
                arg2 = var11;
                arg4 = arg0;
                arg0 = var12;
            }
            if (arg1 != 15) {
                field708 = null;
            }
            int var13 = arg4;
            int var14 = arg2 - arg5;
            int var15 = arg0 - arg4;
            int var16 = -(var14 >> 1);
            if (var15 < 0) {
                var15 = -var15;
            }
            int var17 = arg0 > arg4 ? 1 : -1;
            if (var8) {
                for (int var18 = arg5; var18 <= arg2; var18++) {
                    class277.field4414[var18][var13] = arg3;
                    var16 += var15;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            } else {
                for (int var19 = arg5; var19 <= arg2; var19++) {
                    var16 += var15;
                    class277.field4414[var13][var19] = arg3;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(IIIIIIIIZB)V")
    public class57(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field711 = (short) arg7;
        this.field712 = arg9;
        this.field722 = (short) arg3;
        this.field720 = (short) arg6;
        this.field726 = (short) arg4;
        this.field717 = arg8;
        this.field714 = (byte) arg0;
        this.field721 = (short) arg2;
        this.field710 = (short) arg5;
        this.field724 = (short) arg1;
    }
}
