import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class454 extends class766 {

    @OriginalMember(owner = "client!daa", name = "q", descriptor = "I")
    public static int field6208 = -1;

    @OriginalMember(owner = "client!daa", name = "y", descriptor = "[Z")
    public static boolean[] field6216 = new boolean[8];

    @OriginalMember(owner = "client!daa", name = "n", descriptor = "I")
    public static int field6205;

    @OriginalMember(owner = "client!daa", name = "o", descriptor = "I")
    public static int field6206;

    @OriginalMember(owner = "client!daa", name = "s", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!daa", name = "u", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!daa", name = "w", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!daa", name = "x", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!daa", name = "z", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!daa", name = "r", descriptor = "J")
    public long field6209;

    @OriginalMember(owner = "client!daa", name = "t", descriptor = "Ldaa;")
    public class454 field6211;

    @OriginalMember(owner = "client!daa", name = "v", descriptor = "Ldaa;")
    public class454 field6213;

    @OriginalMember(owner = "client!daa", name = "p", descriptor = "[Ls;")
    public static class419[] field6207;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "([IIIII[IZIIIIILkn;II)I", line = 4)
    public static final int method2663(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class340 arg12, int arg13, int arg14) {
        if (arg13 >= -7) {
            method2669(102);
        }
        field6215++;
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class663.field9341[var15][var35] = 0;
                class336.field4774[var15][var35] = 99999999;
            }
        }
        boolean var16;
        if (arg11 == 1) {
            var16 = class452.method2660(arg12, arg9, arg14, -23558, arg7, arg2, arg8, arg10, arg3, arg4, arg1);
        } else if (arg11 == 2) {
            var16 = class108.method867(arg4, arg3, (byte) 96, arg14, arg10, arg8, arg1, arg9, arg2, arg12, arg7);
        } else {
            var16 = class364.method2191(arg9, 25856, arg3, arg10, arg14, arg7, arg1, arg4, arg8, arg11, arg12, arg2);
        }
        int var17 = arg10 - 64;
        int var18 = arg9 - 64;
        int var19 = class510.field7006;
        int var20 = class6.field85;
        if (!var16) {
            if (!arg6) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg2 - var23; var24 <= arg2 + var23; var24++) {
                for (int var25 = arg1 - var23; var25 <= (arg1 + var23); var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class336.field4774[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg2 > var24) {
                            var28 = arg2 - var24;
                        } else if (var24 > arg2 + arg8 - 1) {
                            var28 = var24 - arg8 - (arg2 - 1);
                        }
                        int var29 = 0;
                        if (var25 < arg1) {
                            var29 = arg1 - var25;
                        } else if (arg1 + arg7 - 1 < var25) {
                            var29 = var25 - (arg1 + arg7 - 1);
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var21 || var21 == var30 && var22 > class336.field4774[var26][var27]) {
                            var19 = var24;
                            var21 = var30;
                            var22 = class336.field4774[var26][var27];
                            var20 = var25;
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg10 == var19 && arg9 == var20) {
            return 0;
        }
        byte var31 = 0;
        class249.field3576[var31] = var19;
        int var37 = var31 + 1;
        class368.field5196[var31] = var20;
        int var32;
        int var33 = var32 = class663.field9341[var19 - var17][var20 - var18];
        while (arg10 != var19 || arg9 != var20) {
            if (var32 != var33) {
                class249.field3576[var37] = var19;
                var32 = var33;
                class368.field5196[var37++] = var20;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            var33 = class663.field9341[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while ((var37--) > 0) {
            arg5[var34] = class249.field3576[var37];
            arg0[var34++] = class368.field5196[var37];
            if (arg5.length <= var34) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(I)Z", line = 182)
    public final boolean method2664(int arg0) {
        if (arg0 <= 122) {
            return true;
        } else {
            field6205++;
            return this.field6211 != null;
        }
    }

    @OriginalMember(owner = "client!daa", name = "f", descriptor = "(I)V", line = 201)
    public final void method2665(int arg0) {
        field6212++;
        if (this.field6211 == null) {
            return;
        }
        this.field6211.field6213 = this.field6213;
        if (arg0 != 24902) {
            this.method2665(-28);
        }
        this.field6213.field6211 = this.field6211;
        this.field6211 = null;
        this.field6213 = null;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 220)
    public static final Class method2666(int arg0, String arg1) throws ClassNotFoundException {
        if (arg0 != 128) {
            return null;
        }
        field6210++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(II[B)[B", line = 261)
    public static final byte[] method2667(int arg0, int arg1, byte[] arg2) {
        if (arg1 != Integer.MAX_VALUE) {
            field6207 = null;
        }
        field6206++;
        byte[] var3 = new byte[arg0];
        class171.method1263(arg2, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(II)I", line = 283)
    public static final int method2668(int arg0, int arg1) {
        field6214++;
        return arg1 == -15268 ? arg0 & 0x3FF : 87;
    }

    @OriginalMember(owner = "client!daa", name = "g", descriptor = "(I)V", line = 294)
    public static void method2669(int arg0) {
        if (arg0 == 3919) {
            field6207 = null;
            field6216 = null;
        }
    }
}
