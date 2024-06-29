import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class8 {

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "Lwm;")
    public static class152 field100 = class157.method1048("::wm2", 95);

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "Lwm;")
    private static class152 field108 = class157.method1048("skill: ", 97);

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "Lwm;")
    public static class152 field103 = field108;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "Lek;")
    public static class183 field104 = new class183();

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "[Lwm;")
    public static class152[] field110 = new class152[200];

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public static int field111 = 0;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "[I")
    public static int[] field106;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V", line = 9)
    public static void method38(byte arg0) {
        field110 = null;
        field108 = null;
        field104 = null;
        if (arg0 != -65) {
            method38((byte) 106);
        }
        field106 = null;
        field103 = null;
        field100 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIIIB)Z", line = 28)
    public static final boolean method39(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (arg7 < 99) {
            field110 = (class152[]) null;
        }
        field107++;
        long var8 = class79.method526(arg0, arg3 + arg5, arg1 + arg6);
        if (var8 != 0L) {
            int var10 = ((int) var8 & 0x38DB17) >> 20;
            int var11 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
            int var12 = ((int) var8 & 0x7F252) >> 14;
            class270 var13 = class242.method1656(var11, true);
            if (var13.field4617 == -1) {
                int var14 = arg2;
                int[] var15 = class96.field1376;
                if (var8 > 0L) {
                    var14 = arg4;
                }
                int var16 = (103 - arg1) * 512 * 4 + arg5 * 4 + 24624;
                if (var12 == 0 || var12 == 2) {
                    if (var10 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var10 == 1) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 515] = var14;
                        var15[var16 + 1024 + 3] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var10 == 3) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1537] = var14;
                        var15[var16 + 1536 + 2] = var14;
                        var15[var16 + 1536 + 3] = var14;
                    }
                }
                if (var12 == 3) {
                    if (var10 == 0) {
                        var15[var16] = var14;
                    } else if (var10 == 1) {
                        var15[var16 + 3] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var10 == 3) {
                        var15[var16 + 1536] = var14;
                    }
                }
                if (var12 == 2) {
                    if (var10 == 3) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var10 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var10 == 1) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 3 + 512] = var14;
                        var15[var16 + 3 + 1024] = var14;
                        var15[var16 + 1539] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1537] = var14;
                        var15[var16 + 1538] = var14;
                        var15[var16 + 1539] = var14;
                    }
                }
            } else if (!class143.method901(arg6, false, var13, var10, arg3, arg1, arg5)) {
                return false;
            }
        }
        long var17 = class112.method745(arg0, arg3 + arg5, arg1 + arg6);
        if (var17 != 0L) {
            int var19 = ((int) var17 & 0x7F835) >> 14;
            int var20 = ((int) var17 & 0x35F74A) >> 20;
            int var21 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            class270 var22 = class242.method1656(var21, true);
            if (var22.field4617 == -1) {
                if (var19 == 9) {
                    int[] var23 = class96.field1376;
                    int var24 = 24624 - (-((52736 - (arg1 * 512)) * 4) - (arg5 * 4));
                    int var25 = 15658734;
                    if (var17 > 0L) {
                        var25 = 15597568;
                    }
                    if (var20 == 0 || var20 == 2) {
                        var23[var24 + 1536] = var25;
                        var23[var24 + 1025] = var25;
                        var23[var24 + 512 + 2] = var25;
                        var23[var24 + 3] = var25;
                    } else {
                        var23[var24] = var25;
                        var23[var24 + 513] = var25;
                        var23[var24 + 2 + 1024] = var25;
                        var23[var24 + 1539] = var25;
                    }
                }
            } else if (!class143.method901(arg6, false, var22, var20, arg3, arg1, arg5)) {
                return false;
            }
        }
        long var26 = class226.method1553(arg0, arg3 + arg5, arg1 + arg6);
        if (var26 != 0L) {
            int var28 = (int) (var26 >>> 32) & Integer.MAX_VALUE;
            int var29 = ((int) var26 & 0x3E7985) >> 20;
            class270 var30 = class242.method1656(var28, true);
            if (var30.field4617 != -1 && !class143.method901(arg6, false, var30, var29, arg3, arg1, arg5)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)Lcc;", line = 261)
    public static final class248 method40(int arg0, int arg1, int arg2) {
        class34 var3 = class287.field4857[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field579; var4++) {
            class248 var5 = var3.field580[var4];
            if ((var5.field4156 >> 29 & 0x3L) == 2L && var5.field4157 == arg1 && var5.field4151 == arg2) {
                class6.method31(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZB)V", line = 285)
    public static final void method41(boolean arg0, byte arg1) {
        if (arg1 < 30) {
            field103 = (class152) null;
        }
        class234.method1609(-128);
        field102++;
        if (class232.field3814 != 30 && class232.field3814 != 25) {
            return;
        }
        class241.field3948++;
        if (class241.field3948 < 50 && !arg0) {
            return;
        }
        class241.field3948 = 0;
        if (!class196.field3147 && class265.field4477 != null) {
            class245.field4102.method1065(224, -105);
            try {
                class265.field4477.method1237(true, 0, class245.field4102.field4946, class245.field4102.field4950);
                class245.field4102.field4946 = 0;
            } catch (IOException var3) {
                class196.field3147 = true;
            }
            class163.field2574++;
        }
        class234.method1609(-128);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILoe;)Z", line = 337)
    public static final boolean method42(int arg0, class127 arg1) {
        field101++;
        if (~arg1.field1887 == arg0) {
            class277.field4738 = 250;
            return true;
        } else {
            return false;
        }
    }
}
