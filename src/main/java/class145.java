import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class145 extends class117 {

    @OriginalMember(owner = "client!cu", name = "D", descriptor = "I")
    public int field2132 = -1;

    @OriginalMember(owner = "client!cu", name = "E", descriptor = "I")
    public int field2133 = -1;

    @OriginalMember(owner = "client!cu", name = "O", descriptor = "I")
    public int field2143 = 12800;

    @OriginalMember(owner = "client!cu", name = "B", descriptor = "Z")
    public boolean field2130 = true;

    @OriginalMember(owner = "client!cu", name = "M", descriptor = "I")
    public int field2141 = 0;

    @OriginalMember(owner = "client!cu", name = "L", descriptor = "I")
    public int field2140 = 0;

    @OriginalMember(owner = "client!cu", name = "N", descriptor = "I")
    public int field2142 = 12800;

    @OriginalMember(owner = "client!cu", name = "I", descriptor = "Ljava/lang/String;")
    public String field2137;

    @OriginalMember(owner = "client!cu", name = "S", descriptor = "Ljava/lang/String;")
    public String field2147;

    @OriginalMember(owner = "client!cu", name = "H", descriptor = "I")
    public int field2136;

    @OriginalMember(owner = "client!cu", name = "A", descriptor = "I")
    public int field2129;

    @OriginalMember(owner = "client!cu", name = "y", descriptor = "Lko;")
    public class348 field2127;

    @OriginalMember(owner = "client!cu", name = "F", descriptor = "I")
    public static int field2134 = 100;

    @OriginalMember(owner = "client!cu", name = "z", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!cu", name = "C", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!cu", name = "J", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!cu", name = "K", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!cu", name = "Q", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!cu", name = "R", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!cu", name = "T", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!cu", name = "G", descriptor = "[Lna;")
    public static class35[] field2135;

    @OriginalMember(owner = "client!cu", name = "P", descriptor = "[Z")
    public static boolean[] field2144;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1041(int arg0, byte arg1, int arg2) {
        field2138++;
        return arg1 == 108 ? (arg2 & 0x18) != 0 | (arg2 & 0x220) == 544 : false;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIIII)V")
    public static final void method1042(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2128++;
        int var6 = arg0 - arg1;
        int var7 = arg4 - arg3;
        if (var6 == 0) {
            if (var7 != 0) {
                class513.method3043(arg5, arg3, (byte) -118, arg1, arg4);
            }
        } else if (var7 == 0) {
            class111.method818(120, arg3, arg0, arg5, arg1);
        } else if (arg2 == 6113) {
            int var8 = (var7 << 12) / var6;
            int var9 = arg3 - (arg1 * var8 >> 12);
            int var10;
            int var11;
            if (class322.field4945 > arg1) {
                var10 = class322.field4945;
                var11 = (class322.field4945 * var8 >> 12) + var9;
            } else if (arg1 <= field2134) {
                var11 = arg3;
                var10 = arg1;
            } else {
                var11 = (field2134 * var8 >> 12) + var9;
                var10 = field2134;
            }
            int var12;
            int var13;
            if (class322.field4945 > arg0) {
                var12 = (class322.field4945 * var8 >> 12) + var9;
                var13 = class322.field4945;
            } else if (field2134 < arg0) {
                var12 = (field2134 * var8 >> 12) + var9;
                var13 = field2134;
            } else {
                var12 = arg4;
                var13 = arg0;
            }
            if (var11 < class229.field3347) {
                var10 = (class229.field3347 - var9 << 12) / var8;
                var11 = class229.field3347;
            } else if (var11 > class156.field2366) {
                var11 = class156.field2366;
                var10 = (class156.field2366 - var9 << 12) / var8;
            }
            if (var12 < class229.field3347) {
                var12 = class229.field3347;
                var13 = (class229.field3347 - var9 << 12) / var8;
            } else if (class156.field2366 < var12) {
                var12 = class156.field2366;
                var13 = (class156.field2366 - var9 << 12) / var8;
            }
            class364.method2333(74, var10, var12, var11, arg5, var13);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZII)Z")
    public final boolean method1043(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            this.method1046(-75);
        }
        field2139++;
        for (class209 var4 = (class209) this.field2127.method2257((byte) 121); var4 != null; var4 = (class209) this.field2127.method2256(-83)) {
            if (var4.method1391(arg2, arg1, 1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIZI[I)Z")
    public final boolean method1044(int arg0, int arg1, boolean arg2, int arg3, int[] arg4) {
        field2145++;
        if (arg2) {
            this.field2130 = false;
        }
        for (class209 var6 = (class209) this.field2127.method2257((byte) 96); var6 != null; var6 = (class209) this.field2127.method2256(47)) {
            if (var6.method1392(arg3, arg1, (byte) -105, arg0)) {
                var6.method1393(arg1, arg4, arg0, 110);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(II[II)Z")
    public final boolean method1045(int arg0, int arg1, int[] arg2, int arg3) {
        if (arg1 != -958892436) {
            return true;
        }
        field2146++;
        for (class209 var5 = (class209) this.field2127.method2257((byte) 92); var5 != null; var5 = (class209) this.field2127.method2256(arg1 + 958892319)) {
            if (var5.method1391(arg3, arg0, arg1 + 958892437)) {
                var5.method1393(arg3, arg2, arg0, 103);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "(I)V")
    public final void method1046(int arg0) {
        this.field2143 = 12800;
        field2131++;
        this.field2141 = 0;
        this.field2142 = 12800;
        int var2 = -43 % ((-arg0 - 79) / 37);
        this.field2140 = 0;
        for (class209 var3 = (class209) this.field2127.method2257((byte) 106); var3 != null; var3 = (class209) this.field2127.method2256(93)) {
            if (this.field2140 < var3.field2995) {
                this.field2140 = var3.field2995;
            }
            if (this.field2142 > var3.field2992) {
                this.field2142 = var3.field2992;
            }
            if (this.field2143 > var3.field2989) {
                this.field2143 = var3.field2989;
            }
            if (this.field2141 < var3.field2990) {
                this.field2141 = var3.field2990;
            }
        }
    }

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "(I)V")
    public static void method1047(int arg0) {
        if (arg0 >= -65) {
            field2134 = -106;
        }
        field2135 = null;
        field2144 = null;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I[III)Z")
    public final boolean method1048(int arg0, int[] arg1, int arg2, int arg3) {
        field2148++;
        if (arg3 != 1389751532) {
            return true;
        }
        for (class209 var5 = (class209) this.field2127.method2257((byte) 126); var5 != null; var5 = (class209) this.field2127.method2256(arg3 ^ 0x52D5ECF0)) {
            if (var5.method1390((byte) -70, arg0, arg2)) {
                var5.method1389(arg1, arg2, arg0, -95);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class145(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field2137 = arg1;
        this.field2147 = arg2;
        this.field2136 = arg0;
        this.field2133 = arg6;
        this.field2132 = arg4;
        this.field2130 = arg5;
        this.field2129 = arg3;
        if (this.field2133 == 255) {
            this.field2133 = 0;
        }
        this.field2127 = new class348();
    }
}
