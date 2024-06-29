import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class217 extends class1 {

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "Ljava/lang/String;")
    private String field3253 = "null";

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "Lve;")
    public static class194 field3260 = new class194(0, 0);

    @OriginalMember(owner = "client!lf", name = "bb", descriptor = "[[[I")
    public static int[][][] field3270 = new int[2][][];

    @OriginalMember(owner = "client!lf", name = "ab", descriptor = "[I")
    public static int[] field3269 = new int[32];

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "C")
    public char field3250;

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "C")
    public char field3261;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!lf", name = "X", descriptor = "I")
    private int field3266;

    @OriginalMember(owner = "client!lf", name = "Y", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!lf", name = "Z", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!lf", name = "cb", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!lf", name = "db", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!lf", name = "eb", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "Ljl;")
    public class253 field3254;

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "Ljl;")
    private class253 field3262;

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "[Z")
    public static boolean[] field3259;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lfl;IB)V")
    private final void method1386(class248 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field3250 = class129.method809(arg0.method1604(4), (byte) 95);
        } else if (arg1 == 2) {
            this.field3261 = class129.method809(arg0.method1604(arg2 + 18), (byte) 95);
        } else if (arg1 == 3) {
            this.field3253 = arg0.method1597((byte) 89);
        } else if (arg1 == 4) {
            this.field3266 = arg0.method1576(-17672);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method1575(false);
            this.field3254 = new class253(class214.method1368(-118, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1576(-17672);
                class82 var7;
                if (arg1 == 5) {
                    var7 = new class130(arg0.method1597((byte) -93));
                } else {
                    var7 = new class251(arg0.method1576(arg2 ^ 0x450A));
                }
                this.field3254.method1663((long) var6, var7, -107);
            }
        }
        field3268++;
        if (arg2 != -14) {
            this.field3254 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIII)V")
    public static final void method1387(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 <= class118.field1782 && class243.field3635 <= arg3) {
            boolean var6;
            if (class248.field3765 > arg1) {
                arg1 = class248.field3765;
                var6 = false;
            } else if (arg1 > class163.field2505) {
                var6 = false;
                arg1 = class163.field2505;
            } else {
                var6 = true;
            }
            boolean var7;
            if (arg4 < class248.field3765) {
                arg4 = class248.field3765;
                var7 = false;
            } else if (class163.field2505 < arg4) {
                arg4 = class163.field2505;
                var7 = false;
            } else {
                var7 = true;
            }
            if (arg2 < class243.field3635) {
                arg2 = class243.field3635;
            } else {
                class64.method429(class23.field284[arg2++], arg1, (byte) 88, arg0, arg4);
            }
            if (class118.field1782 >= arg3) {
                class64.method429(class23.field284[arg3--], arg1, (byte) 89, arg0, arg4);
            } else {
                arg3 = class118.field1782;
            }
            if (var6 && var7) {
                for (int var8 = arg2; var8 <= arg3; var8++) {
                    int[] var9 = class23.field284[var8];
                    var9[arg1] = var9[arg4] = arg0;
                }
            } else if (var6) {
                for (int var10 = arg2; var10 <= arg3; var10++) {
                    class23.field284[var10][arg1] = arg0;
                }
            } else if (var7) {
                for (int var11 = arg2; var11 <= arg3; var11++) {
                    class23.field284[var11][arg4] = arg0;
                }
            }
        }
        field3264++;
        if (arg5 > -62) {
            method1396(89);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)I")
    public final int method1388(int arg0, int arg1) {
        field3263++;
        if (this.field3254 == null) {
            return this.field3266;
        } else if (arg0 == 10) {
            class251 var3 = (class251) this.field3254.method1666((long) arg1, (byte) -103);
            return var3 == null ? this.field3266 : var3.field3822;
        } else {
            return 19;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
    private final void method1389(boolean arg0) {
        field3271++;
        this.field3262 = new class253(this.field3254.method1661((byte) 94));
        for (class130 var2 = (class130) this.field3254.method1665(16); var2 != null; var2 = (class130) this.field3254.method1659((byte) -118)) {
            class71 var3 = new class71(var2.field1934, (int) var2.field1321);
            this.field3262.method1663(class236.method1496(-1553, var2.field1934), var3, -113);
        }
        if (arg0) {
            method1392(true);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BILfl;)V")
    public static final void method1390(byte arg0, int arg1, class248 arg2) {
        field3273++;
        if (arg0 != -19) {
            method1396(72);
        }
        if (class50.field811 == null) {
            return;
        }
        try {
            class50.field811.method1187(0L, (byte) 78);
            class50.field811.method1188(arg2.field3723, -1, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)Z")
    public final boolean method1391(int arg0, int arg1) {
        field3257++;
        if (arg1 != -619991294) {
            this.field3262 = null;
        }
        if (this.field3254 == null) {
            return false;
        }
        if (this.field3262 == null) {
            this.method1394((byte) -124);
        }
        class251 var3 = (class251) this.field3262.method1666((long) arg0, (byte) -114);
        return var3 != null;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(Z)V")
    public static void method1392(boolean arg0) {
        field3270 = null;
        field3260 = null;
        if (!arg0) {
            method1396(-99);
        }
        field3259 = null;
        field3269 = null;
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(II)I")
    public static final int method1393(int arg0, int arg1) {
        field3267++;
        if (arg1 != 127) {
            method1393(26, 74);
        }
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(B)V")
    private final void method1394(byte arg0) {
        field3272++;
        this.field3262 = new class253(this.field3254.method1661((byte) 116));
        class251 var2 = (class251) this.field3254.method1665(16);
        int var3 = 42 / ((arg0 + 41) / 60);
        while (var2 != null) {
            class251 var4 = new class251((int) var2.field1321);
            this.field3262.method1663((long) var2.field3822, var4, -89);
            var2 = (class251) this.field3254.method1659((byte) -118);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method1395(byte arg0, String arg1) {
        if (arg0 >= -29) {
            method1390((byte) 96, -23, (class248) null);
        }
        field3251++;
        if (this.field3254 == null) {
            return false;
        }
        if (this.field3262 == null) {
            this.method1389(false);
        }
        for (class71 var3 = (class71) this.field3262.method1666(class236.method1496(-1553, arg1), (byte) -115); var3 != null; var3 = (class71) this.field3262.method1658((byte) 110)) {
            if (var3.field1124.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V")
    public static final void method1396(int arg0) {
        field3256++;
        if (class188.field2871) {
            return;
        }
        class188.field2871 = true;
        int var1 = -48 / ((41 - arg0) / 58);
        if (class195.field2970) {
            class83.field1327 = (float) ((int) class83.field1327 + 47 & 0xFFFFFFF0);
        } else {
            class278.field4187 += (12.0F - class278.field4187) / 2.0F;
        }
        class177.field2722 = true;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)I")
    public static final int method1397(int arg0, int arg1, int arg2) {
        field3252++;
        int var3 = class264.method1759((byte) 36, 4, arg2 + 91923, arg0 + 45365) - (-(class264.method1759((byte) -125, 2, arg2 + 37821, arg0 - -10294) + -128 >> 1) + -(class264.method1759((byte) -124, arg1, arg2, arg0) + -128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(II)Ljava/lang/String;")
    public final String method1398(int arg0, int arg1) {
        if (arg0 != -16) {
            return null;
        }
        field3258++;
        if (this.field3254 == null) {
            return this.field3253;
        } else {
            class130 var3 = (class130) this.field3254.method1666((long) arg1, (byte) 117);
            return var3 == null ? this.field3253 : var3.field1934;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILfl;)V")
    public final void method1399(int arg0, class248 arg1) {
        if (arg0 != 32) {
            this.field3262 = null;
        }
        while (true) {
            int var3 = arg1.method1593((byte) 27);
            if (var3 == 0) {
                field3255++;
                return;
            }
            this.method1386(arg1, var3, (byte) -14);
        }
    }
}
