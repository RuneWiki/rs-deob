import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class78 extends class3 {

    @OriginalMember(owner = "client!r", name = "G", descriptor = "[I")
    public static int[] field1166 = new int[99];

    @OriginalMember(owner = "client!r", name = "H", descriptor = "[S")
    public static short[] field1167;

    @OriginalMember(owner = "client!r", name = "F", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!r", name = "I", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!r", name = "J", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([II[III)V", line = 5)
    public static final void method531(int[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
        if (arg3 >= -56) {
            method531((int[]) null, -119, (int[]) null, 97, -24);
        }
        if (arg1 < arg4) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg1;
            int var7 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var7;
            int var8 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var8;
            for (int var9 = arg1; var9 < arg4; var9++) {
                if ((var9 & 0x1) + var7 < arg2[var9]) {
                    int var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    int var11 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6++] = var11;
                }
            }
            arg2[arg4] = arg2[var6];
            arg2[var6] = var7;
            arg0[arg4] = arg0[var6];
            arg0[var6] = var8;
            method531(arg0, arg1, arg2, -124, var6 - 1);
            method531(arg0, var6 + 1, arg2, -59, arg4);
        }
        field1165++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BI)[I", line = 59)
    public final int[] method25(byte arg0, int arg1) {
        if (arg0 <= 57) {
            field1167 = (short[]) null;
        }
        field1169++;
        return class163.field2591;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field1166[var1] = var0 / 4;
        }
        field1167 = new short[] { 960, 957, -21568, -21571, 22464 };
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V", line = 95)
    public class78() {
        super(0, true);
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(I)V", line = 104)
    public static void method532(int arg0) {
        if (arg0 > -96) {
            field1167 = (short[]) null;
        }
        field1167 = null;
        field1166 = null;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)Lgi;", line = 116)
    public static final class324 method533(int arg0, int arg1) {
        field1168++;
        class324 var2 = (class324) class100.field1452.method652((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class39.field580.method1504(arg1, true, arg0);
        class324 var4 = new class324();
        if (var3 != null) {
            var4.method2319(new class313(var3), -428, arg1);
        }
        class100.field1452.method642(var4, (long) arg1, -91);
        return var4;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)Z", line = 137)
    public static final boolean method534(int arg0, int arg1, int arg2, int arg3) {
        if (!class148.method1054(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class101.field1457[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class244.field3847) {
                    if (!class353.method2467(var4, var6, var5)) {
                        return false;
                    }
                    if (!class353.method2467(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class353.method2467(var4, var7, var5)) {
                        return false;
                    }
                    if (!class353.method2467(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class353.method2467(var4, var8, var5)) {
                    return false;
                }
                if (!class353.method2467(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class228.field3584) {
                    if (!class353.method2467(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class353.method2467(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class353.method2467(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class353.method2467(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class353.method2467(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class353.method2467(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class244.field3847) {
                    if (!class353.method2467(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class353.method2467(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class353.method2467(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class353.method2467(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class353.method2467(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class353.method2467(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class228.field3584) {
                    if (!class353.method2467(var4, var6, var5)) {
                        return false;
                    }
                    if (!class353.method2467(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class353.method2467(var4, var7, var5)) {
                        return false;
                    }
                    if (!class353.method2467(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class353.method2467(var4, var8, var5)) {
                    return false;
                }
                if (!class353.method2467(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class353.method2467(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class353.method2467(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class353.method2467(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class353.method2467(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class353.method2467(var4, var8, var5);
        } else {
            return true;
        }
    }
}
