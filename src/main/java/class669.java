import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class669 extends class445 implements class310 {

    @OriginalMember(owner = "client!nea", name = "u", descriptor = "Z")
    private boolean field9075;

    @OriginalMember(owner = "client!nea", name = "B", descriptor = "Z")
    private boolean field9082;

    @OriginalMember(owner = "client!nea", name = "w", descriptor = "B")
    private byte field9077;

    @OriginalMember(owner = "client!nea", name = "G", descriptor = "S")
    private short field9087;

    @OriginalMember(owner = "client!nea", name = "N", descriptor = "Z")
    private boolean field9094;

    @OriginalMember(owner = "client!nea", name = "L", descriptor = "B")
    private byte field9092;

    @OriginalMember(owner = "client!nea", name = "I", descriptor = "Z")
    private boolean field9089;

    @OriginalMember(owner = "client!nea", name = "z", descriptor = "Lw;")
    private class279 field9080;

    @OriginalMember(owner = "client!nea", name = "r", descriptor = "Lba;")
    private class359 field9072;

    @OriginalMember(owner = "client!nea", name = "p", descriptor = "Z")
    public static boolean field9070 = false;

    @OriginalMember(owner = "client!nea", name = "n", descriptor = "[F")
    public static float[] field9068 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!nea", name = "o", descriptor = "I")
    public static int field9069;

    @OriginalMember(owner = "client!nea", name = "s", descriptor = "I")
    public static int field9073;

    @OriginalMember(owner = "client!nea", name = "t", descriptor = "I")
    public static int field9074;

    @OriginalMember(owner = "client!nea", name = "v", descriptor = "I")
    public static int field9076;

    @OriginalMember(owner = "client!nea", name = "x", descriptor = "I")
    public static int field9078;

    @OriginalMember(owner = "client!nea", name = "y", descriptor = "I")
    public static int field9079;

    @OriginalMember(owner = "client!nea", name = "A", descriptor = "I")
    public static int field9081;

    @OriginalMember(owner = "client!nea", name = "C", descriptor = "I")
    public static int field9083;

    @OriginalMember(owner = "client!nea", name = "D", descriptor = "I")
    public static int field9084;

    @OriginalMember(owner = "client!nea", name = "E", descriptor = "I")
    public static int field9085;

    @OriginalMember(owner = "client!nea", name = "F", descriptor = "I")
    public static int field9086;

    @OriginalMember(owner = "client!nea", name = "J", descriptor = "I")
    public static int field9090;

    @OriginalMember(owner = "client!nea", name = "K", descriptor = "I")
    public static int field9091;

    @OriginalMember(owner = "client!nea", name = "M", descriptor = "I")
    public static int field9093;

    @OriginalMember(owner = "client!nea", name = "O", descriptor = "I")
    public static int field9095;

    @OriginalMember(owner = "client!nea", name = "P", descriptor = "I")
    public static int field9096;

    @OriginalMember(owner = "client!nea", name = "R", descriptor = "I")
    public static int field9097;

    @OriginalMember(owner = "client!nea", name = "q", descriptor = "Lia;")
    public static class551 field9071;

    @OriginalMember(owner = "client!nea", name = "H", descriptor = "Lqt;")
    private class595 field9088;

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "(Loa;B)V", line = 5)
    public final void method7(class650 arg0, byte arg1) {
        ++field9076;
        if (arg1 != 98) {
            this.field9077 = -38;
        }
    }

    @OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Loa;Lpg;IIIIZIZ)V", line = 17)
    public class669(class650 arg0, class687 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field9454, arg1.field9435, arg1.field9464);
        this.field9075 = arg8;
        this.field9082 = arg6;
        super.field5596 = arg3;
        this.field9077 = (byte) arg7;
        super.field5591 = arg5;
        this.field9087 = (short) arg1.field9408;
        this.field9094 = arg1.field9382 != 0 && !arg6;
        this.field9092 = (byte) arg2;
        this.field9089 = arg0.method465() && arg1.field9433 && !this.field9082 && ~class611.field8310.method3598(-15929, class628.field8526) != -1;
        int var10 = 2048;
        if (this.field9075) {
            var10 |= 65536;
        }
        class180 var11 = this.method3715(arg0, (byte) -108, var10, this.field9089);
        if (var11 != null) {
            this.field9080 = var11.field2118;
            this.field9072 = var11.field2119;
            if (this.field9075) {
                this.field9072 = this.field9072.method951((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)V", line = 51)
    public final void method132(int arg0) {
        ++field9090;
        if (arg0 != -13968) {
            this.field9094 = false;
        }
        if (this.field9072 != null) {
            this.field9072.method2090();
        }
    }

    @OriginalMember(owner = "client!nea", name = "c", descriptor = "(I)Z", line = 64)
    public final boolean method137(int arg0) {
        if (arg0 >= -30) {
            this.method139((byte) 99);
        }
        ++field9078;
        return this.field9075;
    }

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "(B)I", line = 82)
    public final int method139(byte arg0) {
        ++field9074;
        if (arg0 < 13) {
            this.method3715((class650) null, (byte) -27, 9, false);
        }
        return this.field9077;
    }

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "(Loa;I)Lqt;", line = 95)
    public final class595 method6(class650 arg0, int arg1) {
        if (arg1 != -7459) {
            this.method3716(-14, (class650) null, -74);
        }
        ++field9079;
        if (this.field9088 == null) {
            this.field9088 = class280.method1688(this.method3716(0, arg0, 22519), super.field5591, -1, super.field5590, super.field5596);
        }
        return this.field9088;
    }

    @OriginalMember(owner = "client!nea", name = "f", descriptor = "(I)V", line = 115)
    public static void method3714(int arg0) {
        if (arg0 != 0) {
            method3714(58);
        }
        field9071 = null;
        field9068 = null;
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(Loa;BIZ)Lm;", line = 127)
    private final class180 method3715(class650 arg0, byte arg1, int arg2, boolean arg3) {
        if (arg1 != -108) {
            this.field9087 = 45;
        }
        ++field9097;
        class687 var5 = class232.field3017.method2358(0, 65535 & this.field9087);
        class140 var6;
        class140 var7;
        if (this.field9082) {
            var6 = class252.field3250[0];
            var7 = class286.field3633[this.field9092];
        } else {
            var7 = class252.field3250[this.field9092];
            if (~this.field9092 <= -4) {
                var6 = null;
            } else {
                var6 = class252.field3250[this.field9092 + 1];
            }
        }
        return var5.method3786(var6, super.field5591, this.field9077, true, super.field5596, arg2, var7, super.field5590, 22, arg3, arg0);
    }

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "(I)I", line = 158)
    public final int method138(int arg0) {
        ++field9095;
        if (arg0 != 8470) {
            this.method139((byte) -14);
        }
        return 22;
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(Z)Z", line = 169)
    public final boolean method133(boolean arg0) {
        ++field9069;
        if (arg0) {
            this.field9072 = null;
        }
        return this.field9089;
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(Loa;B)V", line = 181)
    public final void method130(class650 arg0, byte arg1) {
        ++field9073;
        Object var3 = null;
        class279 var5;
        if (this.field9080 == null && this.field9089) {
            class180 var4 = this.method3715(arg0, (byte) -108, 262144, true);
            var5 = var4 == null ? null : var4.field2118;
        } else {
            var5 = this.field9080;
            this.field9080 = null;
        }
        if (arg1 < -27) {
            if (var5 != null) {
                class157.method961(var5, this.field9092, super.field5596, super.field5591, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(ZLoa;Lnt;IIII)V", line = 210)
    public final void method135(boolean arg0, class650 arg1, class209 arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field9081;
        if (arg2 instanceof class669) {
            class669 var8 = (class669) arg2;
            if (this.field9072 != null && var8.field9072 != null) {
                this.field9072.method2057(var8.field9072, arg5, arg3, arg4, arg0);
            }
        }
        if (arg6 != 12137) {
            this.method8((byte) 75, 83, (class650) null, -48);
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(BILoa;I)Z", line = 233)
    public final boolean method8(byte arg0, int arg1, class650 arg2, int arg3) {
        int var5 = 28 / ((arg0 - 77) / 40);
        ++field9085;
        class359 var6 = this.method3716(131072, arg2, 22519);
        if (var6 != null) {
            class396 var7 = arg2.method470();
            var7.method591(super.field5596, super.field5590, super.field5591);
            return var6.method2074(arg3, arg1, var7, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(ILoa;I)Lba;", line = 254)
    private final class359 method3716(int arg0, class650 arg1, int arg2) {
        if (arg2 != 22519) {
            return null;
        } else {
            ++field9091;
            if (this.field9072 != null && ~arg1.method493(this.field9072.method2075(), arg0) == -1) {
                return this.field9072;
            } else {
                class180 var4 = this.method3715(arg1, (byte) -108, arg0, false);
                return var4 == null ? null : var4.field2119;
            }
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(Loa;I)V", line = 276)
    public final void method136(class650 arg0, int arg1) {
        ++field9093;
        int var3 = -6 % ((-78 - arg1) / 37);
        Object var4 = null;
        class279 var6;
        if (this.field9080 == null && this.field9089) {
            class180 var5 = this.method3715(arg0, (byte) -108, 262144, true);
            var6 = var5 == null ? null : var5.field2118;
        } else {
            var6 = this.field9080;
            this.field9080 = null;
        }
        if (var6 != null) {
            class350.method2017(var6, this.field9092, super.field5596, super.field5591, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(ILoa;)Lww;", line = 303)
    public final class686 method11(int arg0, class650 arg1) {
        ++field9096;
        if (this.field9072 == null) {
            return null;
        } else {
            if (arg0 > -89) {
                this.field9072 = null;
            }
            class396 var3 = arg1.method470();
            var3.method591(super.field5596, super.field5590, super.field5591);
            class686 var4 = null;
            if (this.field9094) {
                var4 = class458.method2520(0, 1);
            }
            this.field9072.method2049(var3, var4 == null ? null : var4.field9361[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!nea", name = "c", descriptor = "(B)V", line = 331)
    public final void method140(byte arg0) {
        this.field9075 = false;
        ++field9083;
        int var2 = 69 / ((arg0 - -16) / 40);
        if (this.field9072 != null) {
            this.field9072.method2069(this.field9072.method2075() & -65537);
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(Loa;BI)Lba;", line = 345)
    public final class359 method134(class650 arg0, byte arg1, int arg2) {
        if (arg1 < 80) {
            this.field9089 = true;
        }
        ++field9084;
        return this.method3716(arg2, arg0, 22519);
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(B)I", line = 356)
    public final int method131(byte arg0) {
        ++field9086;
        if (arg0 != -97) {
            this.field9072 = null;
        }
        return this.field9087 & 65535;
    }
}
