import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class183 {

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Lii;")
    public class513 field2232 = new class513();

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "Lii;")
    private class513 field2241;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lii;I)V", line = 5)
    public final void method1129(class513 arg0, int arg1) {
        if (arg0.field7522 != null) {
            arg0.method3045(true);
        }
        field2236++;
        arg0.field7520 = this.field2232;
        arg0.field7522 = this.field2232.field7522;
        arg0.field7522.field7520 = arg0;
        arg0.field7520.field7522 = arg0;
        if (arg1 != 262144) {
            this.method1137(39);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)Z", line = 26)
    public final boolean method1130(byte arg0) {
        if (arg0 < 58) {
            this.field2232 = null;
        }
        field2235++;
        return this.field2232.field7520 == this.field2232;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)V", line = 38)
    public final void method1131(byte arg0) {
        if (arg0 > -63) {
            this.method1136(null, (byte) -39, null);
        }
        while (true) {
            class513 var2 = this.field2232.field7520;
            if (this.field2232 == var2) {
                field2231++;
                this.field2241 = null;
                return;
            }
            var2.method3045(true);
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)Lii;", line = 63)
    public final class513 method1132(byte arg0) {
        int var2 = -117 % ((arg0 + 27) / 57);
        field2242++;
        class513 var3 = this.field2232.field7520;
        if (this.field2232 == var3) {
            this.field2241 = null;
            return null;
        } else {
            this.field2241 = var3.field7520;
            return var3;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(Lii;I)V", line = 84)
    public final void method1133(class513 arg0, int arg1) {
        if (arg0.field7522 != null) {
            arg0.method3045(true);
        }
        field2243++;
        arg0.field7522 = this.field2232;
        arg0.field7520 = this.field2232.field7520;
        int var3 = -47 / ((-arg1 - 78) / 39);
        arg0.field7522.field7520 = arg0;
        arg0.field7520.field7522 = arg0;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)Lii;", line = 100)
    public final class513 method1134(int arg0) {
        if (arg0 != 8446) {
            this.method1133(null, 15);
        }
        field2240++;
        class513 var2 = this.field2241;
        if (this.field2232 == var2) {
            this.field2241 = null;
            return null;
        } else {
            this.field2241 = var2.field7520;
            return var2;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)Z", line = 126)
    public static final boolean method1135(int arg0, int arg1, int arg2) {
        if (arg2 <= 90) {
            return false;
        } else {
            field2246++;
            return class187.method1163((byte) 64, arg1, arg0) | (arg1 & 0x40000) != 0 || class541.method3173(arg1, arg0, 55);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Loe;BLii;)V", line = 137)
    private final void method1136(class183 arg0, byte arg1, class513 arg2) {
        field2244++;
        class513 var4 = this.field2232.field7522;
        if (arg1 != 43) {
            this.method1142(-24);
        }
        this.field2232.field7522 = arg2.field7522;
        arg2.field7522.field7520 = this.field2232;
        if (this.field2232 != arg2) {
            arg2.field7522 = arg0.field2232.field7522;
            arg2.field7522.field7520 = arg2;
            arg0.field2232.field7522 = var4;
            var4.field7520 = arg0.field2232;
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V", line = 223)
    public class183() {
        this.field2232.field7522 = this.field2232;
        this.field2232.field7520 = this.field2232;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)Lii;", line = 168)
    public final class513 method1137(int arg0) {
        if (arg0 != -1) {
            this.field2232 = null;
        }
        field2238++;
        class513 var2 = this.field2232.field7520;
        if (this.field2232 == var2) {
            return null;
        } else {
            var2.method3045(true);
            return var2;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILoe;)V", line = 191)
    public final void method1138(int arg0, class183 arg1) {
        field2234++;
        if (arg0 != 26268) {
            this.field2232 = null;
        }
        this.method1136(arg1, (byte) 43, this.field2232.field7520);
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)Lii;", line = 202)
    public final class513 method1139(int arg0) {
        if (arg0 < 13) {
            return null;
        }
        field2233++;
        class513 var2 = this.field2241;
        if (this.field2232 == var2) {
            this.field2241 = null;
            return null;
        } else {
            this.field2241 = var2.field7522;
            return var2;
        }
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)Lii;", line = 235)
    public final class513 method1140(int arg0) {
        if (arg0 != 262144) {
            this.method1132((byte) 63);
        }
        field2248++;
        class513 var2 = this.field2232.field7522;
        if (this.field2232 == var2) {
            this.field2241 = null;
            return null;
        } else {
            this.field2241 = var2.field7522;
            return var2;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lun;I)Lsea;", line = 255)
    public static final class646 method1141(class389 arg0, int arg1) {
        field2239++;
        int var2 = arg0.method2260(-68);
        class564 var3 = class262.method1597((byte) 42)[arg0.method2229(arg1 + 23942)];
        if (arg1 == -23687) {
            class172 var4 = class423.method2555((byte) 122)[arg0.method2229(255)];
            int var5 = arg0.method2270((byte) 71);
            int var6 = arg0.method2270((byte) 71);
            return new class646(var2, var3, var4, var5, var6);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "(I)I", line = 277)
    public final int method1142(int arg0) {
        if (arg0 != -22382) {
            this.field2241 = null;
        }
        field2245++;
        int var2 = 0;
        class513 var3 = this.field2232.field7520;
        while (this.field2232 != var3) {
            var3 = var3.field7520;
            var2++;
        }
        return var2;
    }
}
