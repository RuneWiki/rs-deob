import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class107 extends class20 {

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "Z")
    private boolean field2146 = false;

    @OriginalMember(owner = "client!qa", name = "ab", descriptor = "I")
    private int field2169 = 0;

    @OriginalMember(owner = "client!qa", name = "bb", descriptor = "I")
    private int field2170 = -32768;

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "I")
    private int field2142 = 0;

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "I")
    public int field2147;

    @OriginalMember(owner = "client!qa", name = "V", descriptor = "I")
    public int field2164;

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "I")
    private int field2165;

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "I")
    private int field2155;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "I")
    private int field2140;

    @OriginalMember(owner = "client!qa", name = "cb", descriptor = "I")
    private int field2171;

    @OriginalMember(owner = "client!qa", name = "X", descriptor = "I")
    public int field2166;

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "I")
    private int field2149;

    @OriginalMember(owner = "client!qa", name = "P", descriptor = "I")
    public int field2158;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "I")
    private int field2136;

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "I")
    public int field2151;

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "Leh;")
    private class138 field2143;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "Lsg;")
    public static class30 field2135 = class167.method1221((byte) 33, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "[I")
    public static int[] field2144 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "Lsg;")
    public static class30 field2157 = class167.method1221((byte) 33, "Hierhin gehen");

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "I")
    public static int field2152 = 0;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "D")
    private double field2138;

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "D")
    private double field2139;

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "D")
    public double field2148;

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "D")
    private double field2153;

    @OriginalMember(owner = "client!qa", name = "Q", descriptor = "D")
    public double field2159;

    @OriginalMember(owner = "client!qa", name = "R", descriptor = "D")
    public double field2160;

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "D")
    private double field2163;

    @OriginalMember(owner = "client!qa", name = "Y", descriptor = "D")
    private double field2167;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!qa", name = "L", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "I")
    private int field2156;

    @OriginalMember(owner = "client!qa", name = "S", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!qa", name = "T", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!qa", name = "Z", descriptor = "I")
    public int field2168;

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "[Lna;")
    public static class22[] field2141;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIBI)V")
    public final void method846(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field2145++;
        if (!this.field2146) {
            double var6 = (double) (arg0 - this.field2140);
            double var8 = (double) (arg4 - this.field2155);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field2160 = (double) this.field2165;
            this.field2159 = (double) this.field2171 * var8 / var10 + (double) this.field2155;
            this.field2148 = (double) this.field2171 * var6 / var10 + (double) this.field2140;
        }
        double var12 = (double) (this.field2158 + 1 - arg1);
        this.field2139 = ((double) arg0 - this.field2148) / var12;
        this.field2138 = ((double) arg4 - this.field2159) / var12;
        this.field2153 = Math.sqrt(this.field2139 * this.field2139 + this.field2138 * this.field2138);
        if (!this.field2146) {
            this.field2167 = -this.field2153 * Math.tan((double) this.field2149 * 0.02454369D);
        }
        if (arg3 != -127) {
            this.method848(2, -18);
        }
        this.field2163 = ((double) arg2 - this.field2160 - this.field2167 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIILdl;II)V")
    public static final void method847(int arg0, int arg1, int arg2, int arg3, int arg4, class31 arg5, int arg6, int arg7) {
        if (class203.field3625) {
            class259.field4571 = 32;
        } else {
            class259.field4571 = 0;
        }
        class203.field3625 = false;
        if (arg4 >= -3) {
            field2152 = 75;
        }
        if (class122.field2413 != 0) {
            if (arg1 <= arg3 && (arg1 + 16) > arg3 && arg6 >= arg7 && (arg7 + 16) > arg6) {
                arg5.field736 -= 4;
                class254.method1771(arg5, 8);
            } else if (arg3 >= arg1 && arg3 < arg1 + 16 && arg6 >= arg7 - (16 - arg0) && (arg0 + arg7) > arg6) {
                arg5.field736 += 4;
                class254.method1771(arg5, 8);
            } else if (arg3 >= (arg1 - class259.field4571) && arg3 < (arg1 + class259.field4571 + 16) && (arg7 + 16) <= arg6 && arg7 - (16 - arg0) > arg6) {
                int var8 = (arg0 - 32) * arg0 / arg2;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg6 - arg7 - (var8 / 2 + 16);
                int var10 = arg0 - var8 - 32;
                arg5.field736 = (arg2 - arg0) * var9 / var10;
                class254.method1771(arg5, 8);
                class203.field3625 = true;
            }
        }
        if (class190.field3469 != 0) {
            int var11 = arg5.field728;
            if (arg1 - var11 <= arg3 && arg7 <= arg6 && arg3 < arg1 + 16 && arg6 <= (arg0 + arg7)) {
                arg5.field736 += class190.field3469 * 45;
                class254.method1771(arg5, 8);
            }
        }
        field2162++;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)V")
    public final void method848(int arg0, int arg1) {
        this.field2148 += (double) arg0 * this.field2139;
        if (arg1 <= 6) {
            return;
        }
        this.field2160 += this.field2163 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field2167;
        this.field2167 += (double) arg0 * this.field2163;
        this.field2159 += (double) arg0 * this.field2138;
        field2154++;
        this.field2146 = true;
        this.field2168 = (int) (Math.atan2(this.field2138, this.field2139) * 325.949D) + 1024 & 0x7FF;
        this.field2156 = (int) (Math.atan2(this.field2167, this.field2153) * 325.949D) & 0x7FF;
        if (this.field2143 == null) {
            return;
        }
        this.field2169 += arg0;
        while (true) {
            do {
                do {
                    if (this.field2169 <= this.field2143.field2690[this.field2142]) {
                        return;
                    }
                    this.field2169 -= this.field2143.field2690[this.field2142];
                    this.field2142++;
                } while (this.field2143.field2699.length > this.field2142);
                this.field2142 -= this.field2143.field2706;
            } while (this.field2142 >= 0 && this.field2142 < this.field2143.field2699.length);
            this.field2142 = 0;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2161++;
        class217 var11 = this.method849(true);
        if (var11 != null) {
            var11.method21(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field2170 = var11.method22();
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)Lfi;")
    private final class217 method849(boolean arg0) {
        class24 var2 = class263.method1819(this.field2136, -4);
        field2137++;
        class217 var3 = var2.method217(0, this.field2142);
        if (!arg0) {
            this.field2168 = 54;
        }
        if (var3 == null) {
            return null;
        } else {
            var3.method1570(this.field2156);
            return var3;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()I")
    public final int method22() {
        field2150++;
        return this.field2170;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
    public static void method850(int arg0) {
        field2141 = null;
        if (arg0 != 0) {
            field2141 = null;
        }
        field2135 = null;
        field2144 = null;
        field2157 = null;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class107(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field2147 = arg1;
        this.field2164 = arg9;
        this.field2165 = arg4;
        this.field2155 = arg2;
        this.field2140 = arg3;
        this.field2171 = arg8;
        this.field2166 = arg10;
        this.field2149 = arg7;
        this.field2158 = arg6;
        this.field2136 = arg0;
        this.field2146 = false;
        this.field2151 = arg5;
        int var12 = class263.method1819(this.field2136, -4).field460;
        if (var12 == -1) {
            this.field2143 = null;
        } else {
            this.field2143 = class193.method1396(-30590, var12);
        }
    }
}
