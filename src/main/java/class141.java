import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class141 extends class110 {

    @OriginalMember(owner = "client!db", name = "F", descriptor = "I")
    private int field2173 = -1;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "I")
    private int field2169 = -32768;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    private int field2159 = 0;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "Z")
    public boolean field2167 = false;

    @OriginalMember(owner = "client!db", name = "O", descriptor = "I")
    private int field2182 = 0;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    public int field2162;

    @OriginalMember(owner = "client!db", name = "K", descriptor = "I")
    public int field2178;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public int field2161;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "I")
    private int field2168;

    @OriginalMember(owner = "client!db", name = "y", descriptor = "I")
    public int field2166;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "I")
    public int field2171;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "Lbd;")
    private class28 field2177;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "S")
    public static short field2158 = 32767;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "I")
    public static int field2175 = 5063219;

    @OriginalMember(owner = "client!db", name = "I", descriptor = "I")
    public static int field2176 = -1;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!db", name = "L", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!db", name = "N", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!db", name = "M", descriptor = "Lnl;")
    private class249 field2180;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "Lkj;")
    public static class256 field2160;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIIIIJILnl;)V", line = 6)
    public final void method576(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class249 arg10) {
        field2163++;
        class74 var13 = this.method1082((byte) 127);
        if (var13 != null) {
            var13.method576(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2180);
            this.field2169 = var13.method565();
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V", line = 23)
    public static void method1081(int arg0) {
        if (arg0 == 1) {
            field2160 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIII)V", line = 38)
    public final void method572(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2179++;
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(B)Lr;", line = 50)
    private final class74 method1082(byte arg0) {
        int var2 = -63 % ((arg0 - 39) / 37);
        field2164++;
        class38 var3 = class265.method1866(this.field2168, 11273);
        class74 var4;
        if (this.field2167) {
            var4 = var3.method292(0, -1, 90, -1);
        } else {
            var4 = var3.method292(this.field2159, this.field2173, 90, this.field2182);
        }
        return var4 == null ? null : var4;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)V", line = 71)
    public final void method1083(int arg0, byte arg1) {
        field2165++;
        if (this.field2167) {
            return;
        }
        this.field2159 += arg0;
        while (this.field2159 > this.field2177.field328[this.field2182]) {
            this.field2159 -= this.field2177.field328[this.field2182];
            this.field2182++;
            if (this.field2182 >= this.field2177.field312.length) {
                this.field2167 = true;
                break;
            }
        }
        if (!this.field2167) {
            class146.method1105(this.field2182, false, 6924, this.field2171, this.field2177, this.field2178);
        }
        if (arg1 < 40) {
            this.field2178 = -33;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "()I", line = 105)
    public final int method565() {
        field2181++;
        return this.field2169;
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)Lpa;", line = 114)
    public static final class163 method1084(int arg0) {
        if (arg0 >= -63) {
            method1084(-117);
        }
        field2174++;
        class227.field3465 = 0;
        return class133.method1031(false);
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IIIIIII)V", line = 167)
    public class141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2162 = arg4;
        this.field2178 = arg2;
        this.field2161 = arg6 + arg5;
        this.field2168 = arg0;
        this.field2166 = arg1;
        this.field2171 = arg3;
        int var8 = class265.method1866(this.field2168, 11273).field547;
        if (var8 == -1) {
            this.field2167 = true;
        } else {
            this.field2167 = false;
            this.field2177 = client.method1010(var8, (byte) 126);
        }
        if (this.field2161 == arg6) {
            class146.method1105(this.field2182, false, 6924, this.field2171, this.field2177, this.field2178);
        }
    }
}
