import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class45 extends class499 {

    @OriginalMember(owner = "client!qn", name = "D", descriptor = "I")
    private int field635;

    @OriginalMember(owner = "client!qn", name = "w", descriptor = "I")
    public int field628;

    @OriginalMember(owner = "client!qn", name = "A", descriptor = "I")
    public int field632;

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "I")
    private int field621;

    @OriginalMember(owner = "client!qn", name = "u", descriptor = "I")
    private int field626;

    @OriginalMember(owner = "client!qn", name = "r", descriptor = "I")
    private int field623;

    @OriginalMember(owner = "client!qn", name = "s", descriptor = "I")
    private int field624;

    @OriginalMember(owner = "client!qn", name = "E", descriptor = "I")
    public int field636;

    @OriginalMember(owner = "client!qn", name = "x", descriptor = "I")
    public int field629;

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "I")
    public static int field631 = 12;

    @OriginalMember(owner = "client!qn", name = "t", descriptor = "Llg;")
    public static class284 field625 = new class284(13, 7);

    @OriginalMember(owner = "client!qn", name = "H", descriptor = "Z")
    public static boolean field639 = false;

    @OriginalMember(owner = "client!qn", name = "F", descriptor = "I")
    public static int field637 = 0;

    @OriginalMember(owner = "client!qn", name = "n", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!qn", name = "o", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!qn", name = "v", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!qn", name = "y", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!qn", name = "B", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!qn", name = "C", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!qn", name = "I", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!qn", name = "G", descriptor = "Lsf;")
    public static class362 field638;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIII)Z", line = 4)
    public final boolean method281(int arg0, int arg1, int arg2, int arg3) {
        field633++;
        if (arg3 != 4096) {
            this.field621 = 118;
        }
        return this.field635 == arg0 && arg1 >= this.field623 && this.field624 >= arg1 && this.field621 <= arg2 && this.field626 >= arg2;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(III)Z", line = 21)
    public final boolean method282(int arg0, int arg1, int arg2) {
        field619++;
        if (arg0 == -1) {
            return arg2 >= this.field623 && this.field624 >= arg2 && this.field621 <= arg1 && arg1 <= this.field626;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(III)Z", line = 38)
    public final boolean method283(int arg0, int arg1, int arg2) {
        field630++;
        if (arg2 != -31767) {
            field640 = 116;
        }
        return this.field636 <= arg0 && arg0 <= this.field632 && this.field628 <= arg1 && arg1 <= this.field629;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IILa;ILtf;)V", line = 54)
    public static final void method284(int arg0, int arg1, class436 arg2, int arg3, class192 arg4) {
        field627++;
        if ((arg0 & 0x1000) != 0) {
            arg4.field2702 = arg2.method2055(true) == 1;
        }
        byte var5 = -1;
        if ((arg0 & 0x40) != 0) {
            int var6 = arg2.method2099(255);
            byte[] var7 = new byte[var6];
            class365 var8 = new class365(var7);
            arg2.method2116(var6, var7, -124, 0);
            class367.field5152[arg3] = var8;
            arg4.method1167(arg1 ^ 0xFFFFD725, var8);
        }
        if ((arg0 & 0x4) != 0) {
            int var9 = arg2.method2057(65280);
            int var10 = arg2.method2098(arg1 ^ 0x7A);
            int var11 = arg2.method2055(true);
            int var12 = arg2.field5069;
            boolean var13 = (var9 & 0x8000) != 0;
            if (arg4.field2693 != null && arg4.field2741 != null) {
                boolean var14 = false;
                if (var10 <= 1) {
                    if (!var13 && !(!class319.field4412 || class374.field5223) || class99.field1366) {
                        var14 = true;
                    } else if (class487.method2864(arg4.field2693, 0)) {
                        var14 = true;
                    }
                }
                if (!var14 && class117.field1581 == 0) {
                    class25.field398.field5069 = 0;
                    arg2.method2071(class25.field398.field5073, var11, 0, -713458872);
                    class25.field398.field5069 = 0;
                    int var15 = -1;
                    String var17;
                    if (var13) {
                        var9 &= 0x7FFF;
                        class466 var16 = class349.method1933((byte) 123, class25.field398);
                        var15 = var16.field6801;
                        var17 = var16.field6798.method2452(8192, class25.field398);
                    } else {
                        var17 = class134.method882(false, class195.method1185(class25.field398, 0));
                    }
                    arg4.field327 = var17.trim();
                    arg4.field319 = 150;
                    arg4.field320 = var9 >> 8;
                    arg4.field276 = var9 & 0xFF;
                    int var18;
                    if (var10 == 1 || var10 == 2) {
                        var18 = var13 ? 17 : 1;
                    } else {
                        var18 = var13 ? 17 : 2;
                    }
                    if (var10 == 2) {
                        class29.method200(0, "<img=1>" + arg4.method1164(240, false), (byte) 81, "<img=1>" + arg4.method1157(arg1 - 1, true), null, var15, var17, var18);
                    } else if (var10 == 1) {
                        class29.method200(0, "<img=0>" + arg4.method1164(240, false), (byte) 87, "<img=0>" + arg4.method1157(-1, true), null, var15, var17, var18);
                    } else {
                        class29.method200(0, arg4.method1164(arg1 ^ 0xF0, false), (byte) 121, arg4.method1157(-1, true), null, var15, var17, var18);
                    }
                }
            }
            arg2.field5069 = var11 + var12;
        }
        if ((arg0 & 0x80) != 0) {
            class324.field4454[arg3] = arg2.method2081((byte) 124);
        }
        if ((arg0 & 0x40000) != 0) {
            int var19 = arg2.method2093(false);
            if (var19 == 65535) {
                var19 = -1;
            }
            int var20 = arg2.method2095(8999);
            int var21 = arg2.method2055(true);
            arg4.method164(var21, var19, var20, true, 1670113199);
        }
        if ((arg0 & 0x2000) != 0) {
            arg4.field327 = arg2.method2106(-1);
            if (arg4.field327.charAt(0) == '~') {
                arg4.field327 = arg4.field327.substring(1);
                class478.method2806(arg4.method1157(~arg1, true), 0, 2, 4339, arg4.field327, arg4.method1164(240, false));
            } else if (class75.field1089 == arg4) {
                class478.method2806(arg4.method1157(-1, true), 0, 2, 4339, arg4.field327, arg4.method1164(arg1 ^ 0xF0, false));
            }
            arg4.field319 = 150;
            arg4.field276 = 0;
            arg4.field320 = 0;
        }
        if ((arg0 & 0x2) != 0) {
            int var22 = arg2.method2065(false);
            int var23 = arg2.method2087(-124);
            arg4.method163(class393.field5484, var22, var23, false);
            arg4.field348 = class393.field5484 + 300;
            arg4.field323 = arg2.method2055(true);
        }
        if ((arg0 & 0x20000) != arg1) {
            arg4.field315 = arg2.method2090((byte) -91);
            arg4.field355 = arg2.method2090((byte) 71);
            arg4.field302 = arg2.method2097((byte) 58);
            arg4.field334 = (byte) arg2.method2087(-125);
            arg4.field322 = class393.field5484 + arg2.method2062((byte) 14);
            arg4.field281 = class393.field5484 + arg2.method2093(false);
        }
        if ((arg0 & 0x4000) != 0) {
            int var24 = arg2.method2062((byte) 14);
            int var25 = arg2.method2102(-4);
            if (var24 == 65535) {
                var24 = -1;
            }
            int var26 = arg2.method2055(true);
            arg4.method164(var26, var24, var25, false, 1670113199);
        }
        if ((arg0 & 0x1) != 0) {
            int var27 = arg2.method2057(65280);
            if (var27 == 65535) {
                var27 = -1;
            }
            arg4.field289 = var27;
        }
        if ((arg0 & 0x10) != 0) {
            arg4.field2713 = arg2.method2064(118);
            if (arg4.field368 == 0) {
                arg4.method158(arg4.field2713, true);
                arg4.field2713 = -1;
            }
        }
        if ((arg0 & 0x400) != 0) {
            var5 = arg2.method2081((byte) -5);
        }
        if ((arg0 & 0x800) != 0) {
            int var28 = arg2.method2064(arg1 ^ 0x6F);
            arg4.field339 = arg2.method2055(true);
            arg4.field282 = arg2.method2098(99);
            arg4.field331 = var28 & 0x7FFF;
            arg4.field269 = (var28 & 0x8000) != 0;
            arg4.field296 = class393.field5484 + arg4.field331 + arg4.field339;
        }
        if ((arg0 & 0x200) != 0) {
            int var29 = class393.field5484;
            int var30 = arg2.method2065(false);
            int var31 = arg2.method2087(-125);
            arg4.method163(var29, var30, var31, false);
        }
        if ((arg0 & 0x20) != 0) {
            int var32 = arg2.method2057(65280);
            if (var32 == 65535) {
                var32 = -1;
            }
            int var33 = arg2.method2098(arg1 ^ 0x7A);
            class86.method604((byte) 93, arg4, var33, var32);
        }
        if ((arg0 & 0x100) != 0) {
            arg4.field346 = arg2.method2059(arg1 ^ 0x21AC);
            arg4.field351 = arg2.method2090((byte) -108);
            arg4.field294 = arg2.method2090((byte) 87);
            arg4.field352 = arg2.method2097((byte) 71);
            arg4.field287 = arg2.method2064(125) + class393.field5484;
            arg4.field304 = arg2.method2064(117) + class393.field5484;
            arg4.field293 = arg2.method2099(255);
            arg4.field363 = 0;
            if (arg4.field2727) {
                arg4.field294 += arg4.field2726;
                arg4.field351 += arg4.field2720;
                arg4.field368 = 0;
                arg4.field346 += arg4.field2726;
                arg4.field352 += arg4.field2720;
            } else {
                arg4.field346 += arg4.field372[0];
                arg4.field368 = 1;
                arg4.field351 += arg4.field362[0];
                arg4.field352 += arg4.field362[0];
                arg4.field294 += arg4.field372[0];
            }
        }
        if ((arg0 & 0x10000) != 0) {
            int var34 = arg2.method2055(true);
            int[] var35 = new int[var34];
            int[] var36 = new int[var34];
            int[] var37 = new int[var34];
            for (int var38 = 0; var38 < var34; var38++) {
                int var39 = arg2.method2062((byte) 14);
                if (var39 == 65535) {
                    var39 = -1;
                }
                var35[var38] = var39;
                var36[var38] = arg2.method2099(255);
                var37[var38] = arg2.method2093(false);
            }
            class290.method1658(arg4, var35, var37, var36, (byte) -107);
        }
        if (!arg4.field2727) {
            return;
        }
        if (var5 == 127) {
            arg4.method1161(arg4.field2726, arg4.field2720, arg1 + 16383);
            return;
        }
        byte var40;
        if (var5 == -1) {
            var40 = class324.field4454[arg3];
        } else {
            var40 = var5;
        }
        arg4.method1160(0, arg4.field2720, arg4.field2726, var40);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V", line = 390)
    public static final void method285(int arg0) {
        field620++;
        int var1 = 123 % ((61 - arg0) / 53);
        if (class157.field2230 == null) {
            return;
        }
        if (class157.field2230.field5652 == 1) {
            class157.field2230 = null;
            return;
        }
        if (class157.field2230.field5652 == 2) {
            class407.method2350(class294.field3920, -76, class92.field1242, 2);
            class157.field2230 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I[III)V", line = 421)
    public final void method286(int arg0, int[] arg1, int arg2, int arg3) {
        arg1[0] = this.field635;
        if (arg2 > -59) {
            this.field635 = 96;
        }
        arg1[1] = arg3 + this.field623 - this.field636;
        arg1[2] = this.field621 + arg0 - this.field628;
        field634++;
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "(I)V", line = 438)
    public static void method287(int arg0) {
        if (arg0 != -2671) {
            field639 = true;
        }
        field638 = null;
        field625 = null;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(III[I)V", line = 449)
    public final void method288(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = this.field636 + arg2 - this.field623;
        arg3[arg0] = 0;
        field622++;
        arg3[2] = arg1 + this.field628 - this.field621;
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(IIIIIIIII)V", line = 463)
    public class45(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field635 = arg0;
        this.field628 = arg6;
        this.field632 = arg7;
        this.field621 = arg2;
        this.field626 = arg4;
        this.field623 = arg1;
        this.field624 = arg3;
        this.field636 = arg5;
        this.field629 = arg8;
    }
}
