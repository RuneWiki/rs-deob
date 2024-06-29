import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class151 extends class254 {

    @OriginalMember(owner = "client!tk", name = "Rb", descriptor = "I")
    public static int field2284 = 0;

    @OriginalMember(owner = "client!tk", name = "Sb", descriptor = "Lff;")
    public static class4 field2285 = new class4(0, -1);

    @OriginalMember(owner = "client!tk", name = "ec", descriptor = "I")
    public static int field2297 = 0;

    @OriginalMember(owner = "client!tk", name = "Lb", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!tk", name = "Mb", descriptor = "I")
    private int field2279;

    @OriginalMember(owner = "client!tk", name = "Ob", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!tk", name = "Pb", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!tk", name = "Qb", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!tk", name = "Tb", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!tk", name = "Ub", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!tk", name = "Vb", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!tk", name = "Wb", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!tk", name = "Xb", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!tk", name = "Yb", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!tk", name = "Zb", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!tk", name = "ac", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!tk", name = "bc", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!tk", name = "cc", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!tk", name = "dc", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!tk", name = "Nb", descriptor = "Lvc;")
    private class137 field2280;

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "(II)I", line = 4)
    public final int method1132(int arg0, int arg1) {
        field2290++;
        int var3 = this.field2279 >> 3;
        if (arg1 < 109) {
            return 97;
        }
        int var4 = 8 - (this.field2279 & 0x7);
        this.field2279 += arg0;
        int var5 = 0;
        while (var4 < arg0) {
            var5 += (class328.field5063[var4] & this.field3840[var3++]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (class328.field5063[var4] & this.field3840[var3]) + var5;
        } else {
            var6 = (this.field3840[var3] >> var4 - arg0 & class328.field5063[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "(I)V", line = 38)
    public final void method1133(int arg0) {
        field2289++;
        this.field3866 = (this.field2279 + 7) / arg0;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(II[BI)V", line = 50)
    public final void method1134(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg3 != -31462) {
            field2284 = 37;
        }
        for (int var5 = 0; var5 < arg1; var5++) {
            arg2[arg0 + var5] = (byte) (this.field3840[this.field3866++] - this.field2280.method1038((byte) 124));
        }
        field2287++;
    }

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "(IB)I", line = 65)
    public final int method1135(int arg0, byte arg1) {
        field2295++;
        if (arg1 != 42) {
            method1142(103);
        }
        return arg0 * 8 - this.field2279;
    }

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "(I)V", line = 79)
    public final void method1136(int arg0) {
        field2292++;
        if (arg0 <= -31) {
            this.field2279 = this.field3866 * 8;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B[I)V", line = 90)
    public final void method1137(byte arg0, int[] arg1) {
        field2283++;
        this.field2280 = new class137(arg1);
        if (arg0 >= -97) {
            field2293 = -42;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 102)
    public static final void method1138(boolean arg0, String arg1) {
        if (!arg0) {
            method1140(71, (byte) -61, (class95) null);
        }
        field2291++;
        if (class36.field524 == null) {
            return;
        }
        long var2 = class49.method374(arg1, -1);
        int var4 = 0;
        if (var2 == 0L) {
            return;
        }
        while (var4 < class36.field524.length && class36.field524[var4].field69 != var2) {
            var4++;
        }
        if (class36.field524.length > var4 && class36.field524[var4] != null) {
            class85.field1236.method1141((byte) 82, 122);
            class259.field3991++;
            class85.field1236.method1738((byte) 30, class36.field524[var4].field69);
        }
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(I)V", line = 141)
    public class151(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "(Z)I", line = 147)
    public final int method1139(boolean arg0) {
        field2294++;
        return arg0 ? this.field3840[this.field3866++] - this.field2280.method1038((byte) 125) & 0xFF : 101;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IBLjd;)Laf;", line = 161)
    public static final class195 method1140(int arg0, byte arg1, class95 arg2) {
        field2288++;
        if (class49.method371(arg2, arg0, true)) {
            if (arg1 <= 72) {
                method1140(33, (byte) -6, (class95) null);
            }
            return class269.method1883((byte) 126);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(BI)V", line = 179)
    public final void method1141(byte arg0, int arg1) {
        if (arg0 <= 29) {
            this.field2280 = (class137) null;
        }
        field2278++;
        this.field3840[this.field3866++] = (byte) (arg1 + this.field2280.method1038((byte) 126));
    }

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "(I)V", line = 192)
    public static void method1142(int arg0) {
        field2285 = null;
        if (arg0 != 7) {
            method1143((byte) -28, 99, (String) null, false);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BILjava/lang/String;Z)I", line = 203)
    public static final int method1143(byte arg0, int arg1, String arg2, boolean arg3) {
        int var4 = -24 / ((arg0 - 9) / 38);
        field2282++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var5 = false;
        boolean var6 = false;
        int var7 = 0;
        int var8 = arg2.length();
        for (int var9 = 0; var9 < var8; var9++) {
            char var10 = arg2.charAt(var9);
            if (var9 == 0) {
                if (var10 == '-') {
                    var6 = true;
                    continue;
                }
                if (var10 == '+' && arg3) {
                    continue;
                }
            }
            int var12;
            if (var10 >= '0' && var10 <= '9') {
                var12 = var10 - '0';
            } else if (var10 >= 'A' && var10 <= 'Z') {
                var12 = var10 - '7';
            } else if (var10 >= 'a' && var10 <= 'z') {
                var12 = var10 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var12 >= arg1) {
                throw new NumberFormatException();
            }
            if (var6) {
                var12 = -var12;
            }
            int var11 = arg1 * var7 + var12;
            if ((var11 / arg1) != var7) {
                throw new NumberFormatException();
            }
            var5 = true;
            var7 = var11;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var7;
    }
}
