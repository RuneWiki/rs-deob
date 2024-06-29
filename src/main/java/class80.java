import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class80 extends class273 {

    @OriginalMember(owner = "client!vl", name = "w", descriptor = "[B")
    public byte[] field1127;

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!vl", name = "s", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!vl", name = "t", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!vl", name = "u", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!vl", name = "v", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!vl", name = "x", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!vl", name = "y", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z[B)[B", line = 9)
    public static final byte[] method528(boolean arg0, byte[] arg1) {
        field1124++;
        if (arg0) {
            field1121 = -46;
        }
        class291 var2 = new class291(arg1);
        int var3 = var2.method2011(-86);
        int var4 = var2.method1969((byte) -16);
        if (var4 < 0 || class18.field255 != 0 && var4 > class18.field255) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method1975(0, (byte) 120, var4, var5);
            return var5;
        } else {
            int var6 = var2.method1969((byte) -16);
            if (var6 < 0 || class18.field255 != 0 && class18.field255 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class264.method1818(var7, var6, arg1, var4, 9);
            } else {
                class104.field1490.method193(var2, 0, var7);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)I", line = 65)
    public static final int method529(byte arg0) {
        field1128++;
        if (class194.field3086 == null) {
            return -1;
        }
        while (class59.field903 < class194.field3086.field4773) {
            if (class194.field3086.method1902(class59.field903, false)) {
                return class59.field903++;
            }
            class59.field903++;
        }
        if (arg0 != 124) {
            field1121 = 117;
        }
        return -1;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)I", line = 102)
    public static final int method530(int arg0, int arg1, int arg2) {
        field1123++;
        if (arg2 > arg0) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        if (arg1 < 104) {
            field1118 = -111;
        }
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIII)Z", line = 135)
    public static final boolean method531(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class219.field3559 * arg0 + class184.field2924 * arg3 >> 16;
        int var6 = class219.field3559 * arg3 - class184.field2924 * arg0 >> 16;
        int var7 = class74.field1075 * arg1 + class25.field430 * var6 >> 16;
        int var8 = class25.field430 * arg1 - class74.field1075 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class74.field1075 * arg2 + class25.field430 * var6 >> 16;
        int var12 = class25.field430 * arg2 - class74.field1075 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class104.field1496 && var13 < class104.field1496) {
            return false;
        } else if (var9 > class100.field1464 && var13 > class100.field1464) {
            return false;
        } else if (var10 < class265.field4469 && var14 < class265.field4469) {
            return false;
        } else {
            return var10 <= class77.field1092 || var14 <= class77.field1092;
        }
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)Z", line = 182)
    public static final boolean method532(int arg0) {
        field1122++;
        if (class223.field3630) {
            try {
                class10.field129.method1019(117, class34.field572.field2359);
                return true;
            } catch (Throwable var2) {
            }
        }
        return arg0 > -32 ? false : false;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILhi;)Lwm;", line = 214)
    public static final class152 method533(int arg0, class291 arg1) {
        if (arg0 != 23178) {
            field1129 = 110;
        }
        field1119++;
        return class273.method1878(arg1, 32767, 0);
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "([B)V", line = 223)
    public class80(byte[] arg0) {
        this.field1127 = arg0;
    }
}
