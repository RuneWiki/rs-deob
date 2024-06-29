import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class316 extends InputStream {

    @OriginalMember(owner = "client!j", name = "a", descriptor = "[I")
    public static int[] field5135 = new int[4096];

    @OriginalMember(owner = "client!j", name = "l", descriptor = "[I")
    public static int[] field5146 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!j", name = "n", descriptor = "Ljava/lang/String;")
    public static String field5148 = " has logged out.";

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "Lek;")
    public static class206 field5138;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "Lek;")
    public static class206 field5141;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "[[I")
    public static int[][] field5140;

    @OriginalMember(owner = "client!j", name = "read", descriptor = "()I", line = 6)
    public final int read() {
        class122.method881(114, 30000L);
        field5137++;
        return -1;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)V", line = 23)
    public static final void method2275(int arg0, int arg1) {
        if (class182.field3159 == null || class182.field3159.length < arg1) {
            class182.field3159 = new int[arg1];
        }
        if (arg0 > 11) {
            field5147++;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIII)Z", line = 43)
    public static final boolean method2276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 != -23841) {
            return true;
        }
        field5145++;
        long var8 = class272.method1923(arg6, arg1 + arg3, arg4 + arg7);
        if (var8 != 0L) {
            int var10 = (int) var8 >> 20 & 0x3;
            int var11 = Integer.MAX_VALUE & (int) (var8 >>> 32);
            int var12 = (int) var8 >> 14 & 0x1F;
            class238 var13 = class1.method7(var11, 25);
            if (var13.field3962 == -1) {
                int[] var14 = class270.field4403;
                int var15 = arg5;
                int var16 = (103 - arg7) * 512 * 4 + arg1 * 4 + 24624;
                if (var8 > 0L) {
                    var15 = arg0;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var10 == 0) {
                        var14[var16] = var15;
                        var14[var16 + 512] = var15;
                        var14[var16 + 1024] = var15;
                        var14[var16 + 1536] = var15;
                    } else if (var10 == 1) {
                        var14[var16] = var15;
                        var14[var16 + 1] = var15;
                        var14[var16 + 2] = var15;
                        var14[var16 + 3] = var15;
                    } else if (var10 == 2) {
                        var14[var16 + 3] = var15;
                        var14[var16 + 3 + 512] = var15;
                        var14[var16 + 3 + 1024] = var15;
                        var14[var16 + 3 + 1536] = var15;
                    } else if (var10 == 3) {
                        var14[var16 + 1536] = var15;
                        var14[var16 + 1536 + 1] = var15;
                        var14[var16 + 2 + 1536] = var15;
                        var14[var16 + 1539] = var15;
                    }
                }
                if (var12 == 3) {
                    if (var10 == 0) {
                        var14[var16] = var15;
                    } else if (var10 == 1) {
                        var14[var16 + 3] = var15;
                    } else if (var10 == 2) {
                        var14[var16 + 1539] = var15;
                    } else if (var10 == 3) {
                        var14[var16 + 1536] = var15;
                    }
                }
                if (var12 == 2) {
                    if (var10 == 3) {
                        var14[var16] = var15;
                        var14[var16 + 512] = var15;
                        var14[var16 + 1024] = var15;
                        var14[var16 + 1536] = var15;
                    } else if (var10 == 0) {
                        var14[var16] = var15;
                        var14[var16 + 1] = var15;
                        var14[var16 + 2] = var15;
                        var14[var16 + 3] = var15;
                    } else if (var10 == 1) {
                        var14[var16 + 3] = var15;
                        var14[var16 + 515] = var15;
                        var14[var16 + 3 + 1024] = var15;
                        var14[var16 + 3 + 1536] = var15;
                    } else if (var10 == 2) {
                        var14[var16 + 1536] = var15;
                        var14[var16 + 1 + 1536] = var15;
                        var14[var16 + 1536 + 2] = var15;
                        var14[var16 + 1536 + 3] = var15;
                    }
                }
            } else if (!class340.method2403(arg7, arg1, (byte) -4, arg4, var13, arg3, var10)) {
                return false;
            }
        }
        long var17 = class177.method1256(arg6, arg1 + arg3, arg4 + arg7);
        if (var17 != 0L) {
            int var19 = ((int) var17 & 0x3FEDE5) >> 20;
            int var20 = (int) var17 >> 14 & 0x1F;
            int var21 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            class238 var22 = class1.method7(var21, 25);
            if (var22.field3962 == -1) {
                if (var20 == 9) {
                    int[] var23 = class270.field4403;
                    int var24 = 15658734;
                    int var25 = (103 - arg7) * 4 * 512 + arg1 * 4 + 24624;
                    if (var17 > 0L) {
                        var24 = 15597568;
                    }
                    if (var19 == 0 || var19 == 2) {
                        var23[var25 + 1536] = var24;
                        var23[var25 + 1024 + 1] = var24;
                        var23[var25 + 512 + 2] = var24;
                        var23[var25 + 3] = var24;
                    } else {
                        var23[var25] = var24;
                        var23[var25 + 1 + 512] = var24;
                        var23[var25 + 1024 + 2] = var24;
                        var23[var25 + 1536 + 3] = var24;
                    }
                }
            } else if (!class340.method2403(arg7, arg1, (byte) -4, arg4, var22, arg3, var19)) {
                return false;
            }
        }
        long var26 = class146.method1000(arg6, arg1 + arg3, arg4 + arg7);
        if (var26 != 0L) {
            int var28 = ((int) var26 & 0x39FF39) >> 20;
            int var29 = Integer.MAX_VALUE & (int) (var26 >>> 32);
            class238 var30 = class1.method7(var29, arg2 + 23866);
            if (var30.field3962 != -1 && !class340.method2403(arg7, arg1, (byte) -4, arg4, var30, arg3, var28)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(II)V", line = 256)
    public static final void method2277(int arg0, int arg1) {
        field5143++;
        if (arg0 == -1536) {
            class328.field5273.method896(arg1, (byte) -102);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZI)V", line = 268)
    public static final void method2278(boolean arg0, int arg1) {
        class238.method1660(false, class287.field4696, class88.field1566, class133.field2287, arg0);
        if (arg1 != 0) {
            method2277(-24, 49);
        }
        field5139++;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIBI)V", line = 285)
    public static final void method2279(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field5144++;
        if (arg2 > arg0) {
            class344.method2417(class232.field3799[arg4], arg0, arg2, arg1, (byte) -128);
        } else {
            class344.method2417(class232.field3799[arg4], arg2, arg0, arg1, (byte) -121);
        }
        int var5 = 57 % ((-arg3 - 46) / 39);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V", line = 303)
    public static void method2280(int arg0) {
        field5141 = null;
        field5146 = null;
        field5148 = null;
        field5140 = (int[][]) null;
        if (arg0 <= -2) {
            field5138 = null;
            field5135 = null;
        }
    }
}
