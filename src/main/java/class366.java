import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class366 {

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "Lle;")
    private class200 field5523 = new class200();

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "Luj;")
    private class259 field5533 = new class259();

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
    private int field5535;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
    private int field5534;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "Lan;")
    private class20 field5532;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "[B")
    public static byte[] field5527;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "[I")
    public static int[] field5529;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public static int field5531;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hl", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field5536;

    // $FF: synthetic method
    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2293(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        int var0 = 0;
        field5527 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field5527[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field5529 = new int[500];
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BI)I", line = 3)
    public static final int method2286(byte arg0, int arg1) {
        field5531++;
        if (arg0 < 77) {
            method2288(37, -105, -89, -118, -124, -39, -10, 79);
        }
        return arg1 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(JBLle;)V", line = 14)
    public final void method2287(long arg0, byte arg1, class200 arg2) {
        if (this.field5534 == 0) {
            class200 var5 = this.field5533.method1674((byte) -115);
            var5.method2090(-1);
            var5.method1382(7218);
            if (this.field5523 == var5) {
                class200 var6 = this.field5533.method1674((byte) -71);
                var6.method2090(-1);
                var6.method1382(7218);
            }
        } else {
            this.field5534--;
        }
        if (arg1 <= 72) {
            this.method2287(-68L, (byte) -33, null);
        }
        field5528++;
        this.field5532.method166(arg2, arg0, 78);
        this.field5533.method1673(arg2, 4304);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIIIII)V", line = 46)
    public static final void method2288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5525++;
        if (arg1 >= 0 && arg4 >= 0 && class33.field662 - 1 > arg1 && class121.field1966 - 1 > arg4) {
            if (class380.field5761 == null) {
                return;
            }
            if (arg3 == 0) {
                class248 var12 = (class248) class310.method2028(arg2, arg1, arg4);
                class248 var13 = (class248) class267.method1716(arg2, arg1, arg4);
                if (var12 != null && arg6 != 2) {
                    if (var12 instanceof class66) {
                        ((class66) var12).field1145.method1031(arg5, -4);
                    } else {
                        class448.method2677((byte) 56, arg5, arg4, arg1, arg7, arg3, arg6, var12.method17((byte) -18), arg2);
                    }
                }
                if (var13 != null) {
                    if ((var13 instanceof class66)) {
                        ((class66) var13).field1145.method1031(arg5, -4);
                    } else {
                        class448.method2677((byte) 85, arg5, arg4, arg1, arg7, arg3, arg6, var13.method17((byte) -116), arg2);
                    }
                }
            } else if (arg3 == 1) {
                class248 var8 = (class248) class462.method2745(arg2, arg1, arg4);
                if (var8 != null) {
                    if (var8 instanceof class369) {
                        ((class369) var8).field5584.method1031(arg5, -4);
                    } else {
                        int var9 = var8.method17((byte) -126);
                        if (arg6 == 4 || arg6 == 5) {
                            class448.method2677((byte) 114, arg5, arg4, arg1, arg7, arg3, 4, var9, arg2);
                        } else if (arg6 == 6) {
                            class448.method2677((byte) -107, arg5, arg4, arg1, arg7 + 4, arg3, 4, var9, arg2);
                        } else if (arg6 == 7) {
                            class448.method2677((byte) 41, arg5, arg4, arg1, (arg7 + 2 & 0x3) + 4, arg3, 4, var9, arg2);
                        } else if (arg6 == 8) {
                            class448.method2677((byte) -119, arg5, arg4, arg1, arg7 + 4, arg3, 4, var9, arg2);
                            class448.method2677((byte) -112, arg5, arg4, arg1, (arg7 + 2 & 0x3) + 4, arg3, 4, var9, arg2);
                        }
                    }
                }
            } else if (arg3 == 2) {
                class248 var10 = (class248) class367.method2294(arg2, arg1, arg4, field5536 == null ? (field5536 = method2293("pa")) : field5536);
                if (var10 != null) {
                    if (arg6 == 11) {
                        arg6 = 10;
                    }
                    if (var10 instanceof class305) {
                        ((class305) var10).field4653.method1031(arg5, -4);
                    } else {
                        class448.method2677((byte) -118, arg5, arg4, arg1, arg7, arg3, arg6, var10.method17((byte) 68), arg2);
                    }
                }
            } else if (arg3 == 3) {
                class248 var11 = (class248) class412.method2496(arg2, arg1, arg4);
                if (var11 != null) {
                    if (var11 instanceof class460) {
                        ((class460) var11).field6899.method1031(arg5, -4);
                    } else {
                        class448.method2677((byte) 101, arg5, arg4, arg1, arg7, arg3, arg6, var11.method17((byte) -107), arg2);
                    }
                }
            }
        }
        if (arg0 != -10165) {
            method2290((byte) 42, null);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IJ)Lle;", line = 168)
    public final class200 method2289(int arg0, long arg1) {
        field5526++;
        int var4 = -99 / ((arg0 - 71) / 55);
        class200 var5 = (class200) this.field5532.method171((byte) 1, arg1);
        if (var5 != null) {
            this.field5533.method1673(var5, 4304);
        }
        return var5;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B[B)[B", line = 193)
    public static final byte[] method2290(byte arg0, byte[] arg1) {
        field5524++;
        int var2 = -106 % ((arg0 + 64) / 60);
        class145 var3 = new class145(arg1);
        int var4 = var3.method1063((byte) -71);
        int var5 = var3.method1070(-32387);
        if (var5 < 0 || !(class16.field243 == 0 || class16.field243 >= var5)) {
            throw new RuntimeException();
        } else if (var4 == 0) {
            byte[] var8 = new byte[var5];
            var3.method1061(var5, var8, 0, 89);
            return var8;
        } else {
            int var6 = var3.method1070(-32387);
            if (var6 < 0 || class16.field243 != 0 && var6 > class16.field243) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var4 == 1) {
                class278.method1771(var7, var6, arg1, var5, 9);
            } else {
                class345.field5177.method3126((byte) -123, var3, var7);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V", line = 246)
    public final void method2291(int arg0) {
        if (arg0 != 6893) {
            method2288(114, 69, 60, 55, 16, 93, -18, -21);
        }
        this.field5533.method1677(489772293);
        field5530++;
        this.field5532.method159(0);
        this.field5523 = new class200();
        this.field5534 = this.field5535;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V", line = 298)
    public static void method2292(byte arg0) {
        field5527 = null;
        field5529 = null;
        if (arg0 != -125) {
            field5529 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(I)V", line = 327)
    public class366(int arg0) {
        this.field5535 = arg0;
        this.field5534 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field5532 = new class20(var2);
    }
}
