import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class142 extends class26 {

    @OriginalMember(owner = "client!on", name = "J", descriptor = "I")
    public int field1981;

    @OriginalMember(owner = "client!on", name = "A", descriptor = "I")
    public int field1973;

    @OriginalMember(owner = "client!on", name = "q", descriptor = "Z")
    public static boolean field1963 = false;

    @OriginalMember(owner = "client!on", name = "z", descriptor = "Ljava/lang/String;")
    public static String field1972 = "Loading fonts - ";

    @OriginalMember(owner = "client!on", name = "K", descriptor = "Lcc;")
    public static class327 field1982 = new class327(500);

    @OriginalMember(owner = "client!on", name = "o", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!on", name = "p", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!on", name = "r", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!on", name = "s", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!on", name = "t", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!on", name = "u", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!on", name = "v", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!on", name = "w", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!on", name = "x", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!on", name = "y", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!on", name = "B", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!on", name = "C", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!on", name = "E", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!on", name = "F", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!on", name = "G", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!on", name = "H", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!on", name = "I", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!on", name = "d", descriptor = "(B)Z", line = 5)
    public final boolean method1092(byte arg0) {
        field1979++;
        int var2 = 90 % ((3 - arg0) / 49);
        return (this.field1981 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(II)Z", line = 15)
    public final boolean method1093(int arg0, int arg1) {
        if (arg1 <= 24) {
            this.method1092((byte) 72);
        }
        field1967++;
        return (this.field1981 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lni;BLni;)V", line = 28)
    public static final void method1094(class26 arg0, byte arg1, class26 arg2) {
        if (arg1 >= -78) {
            return;
        }
        if (arg2.field298 != null) {
            arg2.method179((byte) 51);
        }
        arg2.field301 = arg0;
        arg2.field298 = arg0.field298;
        field1971++;
        arg2.field298.field301 = arg2;
        arg2.field301.field298 = arg2;
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(BI)V", line = 46)
    public static final void method1095(byte arg0, int arg1) {
        field1969++;
        class270.field3870.method2264((byte) 35, arg1);
        int var2 = 127 % ((arg0 - 72) / 54);
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)Z", line = 56)
    public final boolean method1096(int arg0) {
        if (arg0 != -9617) {
            method1104(-102, 76, (byte) -19);
        }
        field1975++;
        return ((this.field1981 & 0x107DA4CE) >> 28) != 0;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ILwf;)V", line = 68)
    public static final void method1097(int arg0, class333 arg1) {
        if (class109.field1411 == arg1.field5077) {
            class229.field3276[arg1.field5198] = true;
        }
        int var2 = -31 % ((arg0 + 57) / 59);
        field1976++;
    }

    @OriginalMember(owner = "client!on", name = "e", descriptor = "(B)I", line = 82)
    public final int method1098(byte arg0) {
        field1964++;
        return arg0 == 45 ? this.field1981 >> 18 & 0x7 : -14;
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(I)V", line = 94)
    public static void method1099(int arg0) {
        field1982 = null;
        if (arg0 == 1023) {
            field1972 = null;
        }
    }

    @OriginalMember(owner = "client!on", name = "d", descriptor = "(I)I", line = 108)
    public final int method1100(int arg0) {
        field1978++;
        return arg0 == 1105924391 ? class346.method2401(this.field1981, arg0 ^ 0x2C212E2C) : -75;
    }

    @OriginalMember(owner = "client!on", name = "f", descriptor = "(B)Z", line = 120)
    public final boolean method1101(byte arg0) {
        if (arg0 == -101) {
            field1961++;
            return (this.field1981 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!on", name = "e", descriptor = "(I)Z", line = 131)
    public final boolean method1102(int arg0) {
        if (arg0 <= 103) {
            return false;
        } else {
            field1974++;
            return (this.field1981 >> 31 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(II)I", line = 144)
    public static final int method1103(int arg0, int arg1) {
        field1970++;
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) ((arg1 & 0xFF65) >> 8) / 256.0D;
        double var6 = var2;
        if (var4 < var2) {
            var6 = var4;
        }
        double var8 = (double) (arg1 & 0xFF) / 256.0D;
        double var10 = var2;
        if (var6 > var8) {
            var6 = var8;
        }
        if (var2 < var4) {
            var10 = var4;
        }
        if (var8 > var10) {
            var10 = var8;
        }
        double var12 = 0.0D;
        double var14 = (var6 + var10) / 2.0D;
        double var16 = 0.0D;
        int var18 = (int) (var14 * 256.0D);
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        if (var6 != var10) {
            if (var2 == var10) {
                var12 = (var4 - var8) / (var10 - var6);
            } else if (var4 == var10) {
                var12 = (var8 - var2) / (var10 - var6) + 2.0D;
            } else if (var8 == var10) {
                var12 = (var2 - var4) / (var10 - var6) + 4.0D;
            }
            if (var14 < 0.5D) {
                var16 = (var10 - var6) / (var6 + var10);
            }
            if (var14 >= 0.5D) {
                var16 = (var10 - var6) / (2.0D - var10 - var6);
            }
        }
        int var19 = (int) (var16 * 256.0D);
        if (arg0 < 72) {
            return 101;
        }
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 255) {
            var19 = 255;
        }
        double var20 = var12 / 6.0D;
        int var22 = (int) (var20 * 256.0D);
        if (var18 > 243) {
            var19 >>= 0x4;
        } else if (var18 > 217) {
            var19 >>= 0x3;
        } else if (var18 > 192) {
            var19 >>= 0x2;
        } else if (var18 > 179) {
            var19 >>= 0x1;
        }
        return (var18 >> 1) + (var19 >> 5 << 7) + (var22 >> 2 << 10);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIB)V", line = 246)
    public static final void method1104(int arg0, int arg1, byte arg2) {
        if (arg2 >= 48) {
            field1965++;
            if (class140.method1081(-49, arg0)) {
                class10.method64(true, class26.field308[arg0], arg1);
            }
        }
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(II)V", line = 264)
    public static final void method1105(int arg0, int arg1) {
        field1980++;
        class182.field2482.method2264((byte) -84, arg1);
        field1982.method2264((byte) 89, arg1);
        class103.field1335.method2264((byte) 63, arg1);
        class253.field3698.method2264((byte) -82, arg1);
        if (arg0 != 23) {
            method1095((byte) 59, 102);
        }
    }

    @OriginalMember(owner = "client!on", name = "f", descriptor = "(I)Z", line = 283)
    public final boolean method1106(int arg0) {
        field1962++;
        if (arg0 >= -12) {
            field1963 = false;
        }
        return (this.field1981 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)Z", line = 294)
    public final boolean method1107(boolean arg0) {
        field1977++;
        if (arg0) {
            return false;
        } else {
            return (this.field1981 >> 22 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!on", name = "g", descriptor = "(I)V", line = 311)
    public static final void method1108(int arg0) {
        if (arg0 != -15681) {
            method1097(-89, (class333) null);
        }
        class172.field2376.method2258((byte) 86);
        field1968++;
        class72.field963.method2258((byte) 86);
    }

    @OriginalMember(owner = "client!on", name = "h", descriptor = "(I)Z", line = 324)
    public final boolean method1109(int arg0) {
        if (arg0 != 500) {
            this.method1106(-126);
        }
        field1966++;
        return (this.field1981 & 0x4B87F889) >> 30 != 0;
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(II)V", line = 337)
    public class142(int arg0, int arg1) {
        this.field1981 = arg0;
        this.field1973 = arg1;
    }
}
