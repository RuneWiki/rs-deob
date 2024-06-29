import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class108 extends class146 {

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "[I")
    public static int[] field1643 = new int[256];

    @OriginalMember(owner = "client!fh", name = "A", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "B")
    public byte field1641;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
    public int field1645;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "Lsb;")
    public static class124 field1648;

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "Lph;")
    public static class203 field1649;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "Ljava/lang/String;")
    public String field1640;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "Ljava/lang/String;")
    public String field1642;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II[IJ)Ljava/lang/String;")
    public static final String method801(int arg0, int arg1, int[] arg2, long arg3) {
        if (arg1 != 0) {
            return null;
        }
        field1639++;
        if (class43.field786 != null) {
            String var5 = class43.field786.method192(arg2, arg0, 4412, arg3);
            if (var5 != null) {
                return var5;
            }
        }
        return Long.toString(arg3);
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(Z)V")
    public static void method802(boolean arg0) {
        field1649 = null;
        field1643 = null;
        field1648 = null;
        if (!arg0) {
            method805(44, 112, 97);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method803(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class76.field1253[arg0][var8][var14] == -class139.field2326) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class21.field327[arg0][arg1][arg3] + arg5;
            if (!class285.method1912(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class285.method1912(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class285.method1912(var9, var11, var13)) {
                return false;
            } else if (class285.method1912(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class279.method1873(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class285.method1912(var6 + 1, class21.field327[arg0][arg1][arg3] + arg5, var7 + 1) && class285.method1912(var6 + 128 - 1, class21.field327[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class285.method1912(var6 + 128 - 1, class21.field327[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class285.method1912(var6 + 1, class21.field327[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIII)V")
    public static final void method804(int arg0, int arg1, int arg2, int arg3) {
        field1646++;
        class229.method1525(false, 301);
        if (arg3 > -92) {
            method803(-113, -83, -55, -18, 99, 43);
        }
        class82.field1367 = arg1;
        class9.field124 = arg2;
        class255.method1705(-74, arg0);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)V")
    public static final void method805(int arg0, int arg1, int arg2) {
        field1638++;
        class172 var3 = class136.method1023(arg2 + 18, arg1);
        int var4 = var3.field2915;
        int var5 = var3.field2908;
        int var6 = var3.field2913;
        int var7 = class119.field2002[var5 - var4];
        if (arg2 != -2) {
            return;
        }
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var4;
        class293.method1967(var8 & arg0 << var4 | class192.field3138[var6] & ~var8, var6, arg2 + 2912);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIB)I")
    public static final int method806(int arg0, int arg1, byte arg2) {
        field1647++;
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg0 >>= 0x1;
        }
        if (arg2 != -29) {
            method803(24, -55, -78, 1, 106, -47);
        }
        if (arg0 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(B)I")
    public static final int method807(byte arg0) {
        if (arg0 == 58) {
            field1644++;
            return 6;
        } else {
            return -114;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1643[var0] = var1;
        }
        field1650 = 0;
    }
}
