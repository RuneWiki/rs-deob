import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class234 extends class388 implements class171 {

    @OriginalMember(owner = "client!om", name = "Z", descriptor = "B")
    private byte field3090;

    @OriginalMember(owner = "client!om", name = "N", descriptor = "B")
    private byte field3079;

    @OriginalMember(owner = "client!om", name = "bb", descriptor = "Z")
    private boolean field3092;

    @OriginalMember(owner = "client!om", name = "S", descriptor = "S")
    private short field3083;

    @OriginalMember(owner = "client!om", name = "ab", descriptor = "Z")
    private boolean field3091;

    @OriginalMember(owner = "client!om", name = "M", descriptor = "Z")
    private boolean field3078;

    @OriginalMember(owner = "client!om", name = "I", descriptor = "Z")
    private boolean field3074;

    @OriginalMember(owner = "client!om", name = "T", descriptor = "Lgi;")
    private class416 field3084;

    @OriginalMember(owner = "client!om", name = "cb", descriptor = "Lge;")
    private class386 field3093;

    @OriginalMember(owner = "client!om", name = "V", descriptor = "I")
    public static int field3086 = -1;

    @OriginalMember(owner = "client!om", name = "u", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!om", name = "v", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!om", name = "w", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!om", name = "x", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!om", name = "y", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!om", name = "z", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!om", name = "A", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!om", name = "B", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!om", name = "C", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!om", name = "D", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!om", name = "E", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!om", name = "F", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!om", name = "G", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!om", name = "H", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!om", name = "K", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!om", name = "L", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!om", name = "U", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!om", name = "W", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!om", name = "X", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!om", name = "Y", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!om", name = "P", descriptor = "Lwo;")
    public static class285 field3081;

    @OriginalMember(owner = "client!om", name = "R", descriptor = "Lwo;")
    public static class285 field3082;

    @OriginalMember(owner = "client!om", name = "J", descriptor = "Lv;")
    public static class392 field3075;

    @OriginalMember(owner = "client!om", name = "O", descriptor = "Lc;")
    public static class436 field3080;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Luo;B)V")
    public final void method411(class118 arg0, byte arg1) {
        ++field3076;
        Object var3 = null;
        class416 var5;
        if (this.field3084 == null && this.field3074) {
            class52 var4 = this.method1513(arg0, true, (byte) 84, 131072);
            var5 = var4 != null ? var4.field611 : null;
        } else {
            var5 = this.field3084;
            this.field3084 = null;
        }
        if (arg1 != 88) {
            method1510(105, 122);
        }
        if (var5 != null) {
            class183.method1139(var5, this.field3079, super.field5297, super.field5296, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Luo;II)Lge;")
    public final class386 method419(class118 arg0, int arg1, int arg2) {
        ++field3089;
        return arg1 != -20264 ? null : this.method1512(arg2, arg0, 126);
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)I")
    public final int method409(int arg0) {
        ++field3064;
        if (arg0 != -50) {
            this.field3079 = 4;
        }
        return 65535 & this.field3083;
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(B)I")
    public final int method417(byte arg0) {
        ++field3065;
        return arg0 != -116 ? 112 : this.field3090;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)I")
    public final int method420(byte arg0) {
        int var2 = 16 % ((arg0 - -21) / 44);
        ++field3066;
        return 22;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)Z")
    public final boolean method412(int arg0) {
        if (arg0 != 18942) {
            return true;
        } else {
            ++field3088;
            return this.field3074;
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(Luo;B)V")
    public final void method422(class118 arg0, byte arg1) {
        ++field3073;
        Object var3 = null;
        class416 var5;
        if (this.field3084 == null && this.field3074) {
            class52 var4 = this.method1513(arg0, true, (byte) 84, 131072);
            var5 = var4 != null ? var4.field611 : null;
        } else {
            var5 = this.field3084;
            this.field3084 = null;
        }
        if (var5 != null) {
            class434.method2649(var5, this.field3079, super.field5297, super.field5296, (boolean[]) null);
        }
        if (arg1 != -7) {
            this.method409(-110);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Luo;IIIZBLpc;)V")
    public final void method137(class118 arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, class22 arg6) {
        ++field3068;
        if (arg5 > -115) {
            this.method423(-8);
        }
        if (arg6 instanceof class234) {
            class234 var8 = (class234) arg6;
            if (this.field3093 != null && var8.field3093 != null) {
                this.field3093.method1476(var8.field3093, arg2, arg3, arg1, arg4);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(Luo;B)Lkj;")
    public final class175 method130(class118 arg0, byte arg1) {
        ++field3070;
        if (this.field3093 == null) {
            return null;
        } else {
            class450 var3 = arg0.method742();
            int var4 = 64 / ((arg1 - 11) / 37);
            var3.method929(super.field5297, super.field5291, super.field5296);
            class175 var5 = null;
            if (this.field3092) {
                var5 = class68.method392((byte) -101, 1);
            }
            this.field3093.method1441(var3, var5 != null ? var5.field2030[0] : null, 0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BI)V")
    public static final void method1508(byte arg0, int arg1) {
        ++field3067;
        for (class43 var2 = class368.field5013.method2222(0); var2 != null; var2 = class368.field5013.method2215(false)) {
            if (~(65535L & var2.field505 >> 48) == ~((long) arg1)) {
                var2.method263(false);
            }
        }
        if (arg0 >= -45) {
            method1510(105, -127);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Luo;IIZ)Z")
    public final boolean method134(class118 arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            return true;
        } else {
            ++field3071;
            class386 var5 = this.method1512(65536, arg0, 126);
            if (var5 != null) {
                class450 var6 = arg0.method742();
                var6.method929(super.field5297, super.field5291, super.field5296);
                return var5.method1474(arg1, arg2, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "h", descriptor = "(I)V")
    public static void method1509(int arg0) {
        field3081 = null;
        field3082 = null;
        field3080 = null;
        field3075 = null;
        if (arg0 != 22) {
            method1509(43);
        }
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(I)Z")
    public final boolean method129(int arg0) {
        ++field3061;
        if (arg0 != 3652) {
            this.method138((byte) 127, (class118) null);
        }
        return this.field3078;
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Luo;Lnd;IIIIZIZ)V")
    public class234(class118 arg0, class446 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field6208, arg1.field6239);
        this.field3090 = (byte) arg7;
        this.field3079 = (byte) arg2;
        this.field3092 = arg1.field6235 != 0 && !arg6;
        this.field3083 = (short) arg1.field6209;
        this.field3091 = arg6;
        this.field3078 = arg8;
        super.field5297 = (short) arg3;
        super.field5296 = (short) arg5;
        this.field3074 = arg0.method708() && arg1.field6210 && !this.field3091 && class333.field4548 != 0;
        int var10 = 1024;
        if (this.field3078) {
            var10 |= 32768;
        }
        class52 var11 = this.method1513(arg0, this.field3074, (byte) 84, var10);
        if (var11 != null) {
            this.field3084 = var11.field611;
            this.field3093 = var11.field610;
            if (this.field3078) {
                this.field3093 = this.field3093.method1459((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V")
    public final void method423(int arg0) {
        if (arg0 != 22486) {
            this.field3091 = false;
        }
        ++field3062;
        if (this.field3093 != null) {
            this.field3093.method1454();
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(II)I")
    public static final int method1510(int arg0, int arg1) {
        int var2 = -125 / ((arg1 - -23) / 55);
        ++field3077;
        return 127 & arg0;
    }

    @OriginalMember(owner = "client!om", name = "f", descriptor = "(I)V")
    public final void method140(int arg0) {
        ++field3072;
        if (arg0 >= -24) {
            this.field3093 = null;
        }
        this.field3078 = false;
        if (this.field3093 != null) {
            this.field3093.method1460(this.field3093.method1465() & -32769);
        }
    }

    @OriginalMember(owner = "client!om", name = "i", descriptor = "(I)Loo;")
    public static final class27 method1511(int arg0) {
        ++field3063;
        if (arg0 != 1) {
            return null;
        } else {
            return ~class2.field15 > ~class213.field2614.length ? class213.field2614[class2.field15++] : null;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILuo;I)Lge;")
    private final class386 method1512(int arg0, class118 arg1, int arg2) {
        if (arg2 < 123) {
            field3086 = -58;
        }
        ++field3087;
        if (this.field3093 != null && ~arg1.method721(this.field3093.method1465(), arg0) == -1) {
            return this.field3093;
        } else {
            class52 var4 = this.method1513(arg1, false, (byte) 84, arg0);
            return var4 != null ? var4.field610 : null;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Luo;ZBI)Lcb;")
    private final class52 method1513(class118 arg0, boolean arg1, byte arg2, int arg3) {
        ++field3085;
        class446 var5 = class380.method2361(this.field3083 & 65535, -29012);
        class279 var6;
        class279 var7;
        if (this.field3091) {
            var6 = class75.field915[this.field3079];
            var7 = class219.field2709[0];
        } else {
            var6 = class219.field2709[this.field3079];
            if (~this.field3079 <= -4) {
                var7 = null;
            } else {
                var7 = class219.field2709[this.field3079 + 1];
            }
        }
        if (arg2 != 84) {
            field3086 = 68;
        }
        return var5.method2774(var7, this.field3090, super.field5291, super.field5296, super.field5297, false, var6, 22, arg0, arg3, arg1);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BLuo;)V")
    public final void method138(byte arg0, class118 arg1) {
        if (arg0 <= 78) {
            this.field3083 = -25;
        }
        ++field3060;
    }
}
