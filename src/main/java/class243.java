import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public abstract class class243 extends class168 {

    @OriginalMember(owner = "client!rga", name = "q", descriptor = "Lbi;")
    public class483 field3146;

    @OriginalMember(owner = "client!rga", name = "n", descriptor = "I")
    public static int field3143 = 0;

    @OriginalMember(owner = "client!rga", name = "j", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!rga", name = "k", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!rga", name = "l", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!rga", name = "m", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!rga", name = "o", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!rga", name = "p", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!rga", name = "r", descriptor = "Z")
    public boolean field3147;

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(B)I")
    public final int method1516(byte arg0) {
        int var2 = -90 / ((-arg0 - 59) / 40);
        field3141++;
        return 1;
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(I)Z")
    public final boolean method1517(int arg0) {
        if (arg0 == -19346) {
            field3144++;
            return this.field3147;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "(I)Z")
    public abstract boolean method182(int arg0);

    @OriginalMember(owner = "client!rga", name = "c", descriptor = "(I)Z")
    public abstract boolean method184(int arg0);

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(ILbq;ILbq;)V")
    public abstract void method183(int arg0, class293 arg1, int arg2, class293 arg3);

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "(III)V")
    public abstract void method189(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "(B)Z")
    public final boolean method1518(byte arg0) {
        field3142++;
        if (arg0 > -57) {
            this.method182(-56);
        }
        return false;
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(IIIIIILje;IIII)Z")
    public static final boolean method1519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class405 arg6, int arg7, int arg8, int arg9, int arg10) {
        field3139++;
        int var11 = arg0;
        int var12 = arg9;
        if (arg5 != -8777) {
            method1520(null, 28, false, -117);
        }
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg0 - var13;
        class161.field2220[var13][var14] = 99;
        int var16 = arg9 - var14;
        class545.field7602[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class310.field4086[var17] = arg0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class142.field2013[var10001] = arg9;
        int[][] var19 = arg6.field5137;
        while (var26 != var18) {
            var12 = class142.field2013[var18];
            var11 = class310.field4086[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var11 - var15;
            int var21 = var11 - arg6.field5131;
            int var22 = var12 - arg6.field5122;
            int var23 = var12 - var16;
            if (arg10 == -4) {
                if (arg1 == var11 && arg2 == var12) {
                    class632.field8726 = var12;
                    class736.field10234 = var11;
                    return true;
                }
            } else if (arg10 == -3) {
                if (class217.method1414(1, var12, arg1, 1, arg4, arg2, (byte) 97, var11, arg8)) {
                    class632.field8726 = var12;
                    class736.field10234 = var11;
                    return true;
                }
            } else if (arg10 == -2) {
                if (arg6.method2256(arg1, (byte) -93, arg2, arg8, var11, 1, arg7, 1, var12, arg4)) {
                    class632.field8726 = var12;
                    class736.field10234 = var11;
                    return true;
                }
            } else if (arg10 == -1) {
                if (arg6.method2259(1, arg7, var12, (byte) 33, arg1, var11, arg4, arg8, arg2)) {
                    class632.field8726 = var12;
                    class736.field10234 = var11;
                    return true;
                }
            } else if (arg10 == 0 || arg10 == 1 || arg10 == 2 || arg10 == 3 || arg10 == 9) {
                if (arg6.method2258(arg2, arg10, 1, arg1, arg3, var11, arg5 + 8776, var12)) {
                    class632.field8726 = var12;
                    class736.field10234 = var11;
                    return true;
                }
            } else if (arg6.method2254(127, arg10, var12, var11, arg1, 1, arg2, arg3)) {
                class632.field8726 = var12;
                class736.field10234 = var11;
                return true;
            }
            int var25 = class545.field7602[var20][var23] + 1;
            if (var20 > 0 && class161.field2220[var20 - 1][var23] == 0 && (var19[var21 - 1][var22] & 0x42240000) == 0) {
                class310.field4086[var26] = var11 - 1;
                class142.field2013[var26] = var12;
                class161.field2220[var20 - 1][var23] = 2;
                var26 = var26 + 1 & 0xFFF;
                class545.field7602[var20 - 1][var23] = var25;
            }
            if (var20 < 127 && class161.field2220[var20 + 1][var23] == 0 && (var19[var21 + 1][var22] & 0x60240000) == 0) {
                class310.field4086[var26] = var11 + 1;
                class142.field2013[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class161.field2220[var20 + 1][var23] = 8;
                class545.field7602[var20 + 1][var23] = var25;
            }
            if (var23 > 0 && class161.field2220[var20][var23 - 1] == 0 && (var19[var21][var22 - 1] & 0x40A40000) == 0) {
                class310.field4086[var26] = var11;
                class142.field2013[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class161.field2220[var20][var23 - 1] = 1;
                class545.field7602[var20][var23 - 1] = var25;
            }
            if (var23 < 127 && class161.field2220[var20][var23 + 1] == 0 && (var19[var21][var22 + 1] & 0x48240000) == 0) {
                class310.field4086[var26] = var11;
                class142.field2013[var26] = var12 + 1;
                class161.field2220[var20][var23 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class545.field7602[var20][var23 + 1] = var25;
            }
            if (var20 > 0 && var23 > 0 && class161.field2220[var20 - 1][var23 - 1] == 0 && (var19[var21 - 1][var22 - 1] & 0x43A40000) == 0 && (var19[var21 - 1][var22] & 0x42240000) == 0 && (var19[var21][var22 - 1] & 0x40A40000) == 0) {
                class310.field4086[var26] = var11 - 1;
                class142.field2013[var26] = var12 - 1;
                class161.field2220[var20 - 1][var23 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class545.field7602[var20 - 1][var23 - 1] = var25;
            }
            if (var20 < 127 && var23 > 0 && class161.field2220[var20 + 1][var23 - 1] == 0 && (var19[var21 + 1][var22 - 1] & 0x60E40000) == 0 && (var19[var21 + 1][var22] & 0x60240000) == 0 && (var19[var21][var22 - 1] & 0x40A40000) == 0) {
                class310.field4086[var26] = var11 + 1;
                class142.field2013[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class161.field2220[var20 + 1][var23 - 1] = 9;
                class545.field7602[var20 + 1][var23 - 1] = var25;
            }
            if (var20 > 0 && var23 < 127 && class161.field2220[var20 - 1][var23 + 1] == 0 && (var19[var21 - 1][var22 + 1] & 0x4E240000) == 0 && (var19[var21 - 1][var22] & 0x42240000) == 0 && (var19[var21][var22 + 1] & 0x48240000) == 0) {
                class310.field4086[var26] = var11 - 1;
                class142.field2013[var26] = var12 + 1;
                class161.field2220[var20 - 1][var23 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class545.field7602[var20 - 1][var23 + 1] = var25;
            }
            if (var20 < 127 && var23 < 127 && class161.field2220[var20 + 1][var23 + 1] == 0 && (var19[var21 + 1][var22 + 1] & 0x78240000) == 0 && (var19[var21 + 1][var22] & 0x60240000) == 0 && (var19[var21][var22 + 1] & 0x48240000) == 0) {
                class310.field4086[var26] = var11 + 1;
                class142.field2013[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class161.field2220[var20 + 1][var23 + 1] = 12;
                class545.field7602[var20 + 1][var23 + 1] = var25;
            }
        }
        class736.field10234 = var11;
        class632.field8726 = var12;
        return false;
    }

    @OriginalMember(owner = "client!rga", name = "e", descriptor = "(I)V")
    public abstract void method186(int arg0);

    @OriginalMember(owner = "client!rga", name = "e", descriptor = "(B)I")
    public int method187(byte arg0) {
        field3140++;
        if (arg0 != 13) {
            this.method1518((byte) -53);
        }
        return 0;
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(IB)V")
    public abstract void method188(int arg0, byte arg1);

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(Ljava/lang/String;IZI)I")
    public static final int method1520(String arg0, int arg1, boolean arg2, int arg3) {
        field3145++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg0.length();
        int var8 = 0;
        if (arg1 != 36) {
            return 73;
        }
        while (var7 > var8) {
            label84: {
                char var9 = arg0.charAt(var8);
                if (var8 == 0) {
                    if (var9 == '-') {
                        var4 = true;
                        break label84;
                    }
                    if (var9 == '+' && arg2) {
                        break label84;
                    }
                }
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 - '0';
                } else if (var9 >= 'A' && var9 <= 'Z') {
                    var11 = var9 - '7';
                } else if (var9 >= 'a' && var9 <= 'z') {
                    var11 = var9 - 'W';
                } else {
                    throw new NumberFormatException();
                }
                if (var11 >= arg3) {
                    throw new NumberFormatException();
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg3 * var6 + var11;
                if (var10 / arg3 != var6) {
                    throw new NumberFormatException();
                }
                var5 = true;
                var6 = var10;
            }
            var8++;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(Lbi;)V")
    public class243(class483 arg0) {
        this.field3146 = arg0;
    }
}
