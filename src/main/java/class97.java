import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class97 extends class205 {

    @OriginalMember(owner = "client!qm", name = "E", descriptor = "I")
    private int field1167 = -1;

    @OriginalMember(owner = "client!qm", name = "F", descriptor = "I")
    private int field1168 = -32768;

    @OriginalMember(owner = "client!qm", name = "C", descriptor = "I")
    private int field1165 = 0;

    @OriginalMember(owner = "client!qm", name = "N", descriptor = "I")
    private int field1176 = 0;

    @OriginalMember(owner = "client!qm", name = "I", descriptor = "I")
    private int field1171 = 0;

    @OriginalMember(owner = "client!qm", name = "V", descriptor = "Z")
    public boolean field1184 = false;

    @OriginalMember(owner = "client!qm", name = "R", descriptor = "I")
    private int field1180;

    @OriginalMember(owner = "client!qm", name = "J", descriptor = "I")
    private int field1172;

    @OriginalMember(owner = "client!qm", name = "z", descriptor = "I")
    public int field1162;

    @OriginalMember(owner = "client!qm", name = "O", descriptor = "Lid;")
    private class415 field1177;

    @OriginalMember(owner = "client!qm", name = "T", descriptor = "Ldq;")
    public static class493 field1182 = new class493(14, 6);

    @OriginalMember(owner = "client!qm", name = "Y", descriptor = "I")
    public static int field1187 = 0;

    @OriginalMember(owner = "client!qm", name = "Z", descriptor = "I")
    public static int field1188 = 0;

    @OriginalMember(owner = "client!qm", name = "y", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!qm", name = "A", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!qm", name = "B", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!qm", name = "D", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!qm", name = "G", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!qm", name = "K", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!qm", name = "L", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!qm", name = "M", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!qm", name = "P", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!qm", name = "Q", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!qm", name = "S", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!qm", name = "U", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!qm", name = "W", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!qm", name = "X", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!qm", name = "H", descriptor = "Lhk;")
    private class67 field1170;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILt;Lya;)V", line = 3)
    private final void method730(int arg0, class474 arg1, class38 arg2) {
        ++field1178;
        class342[] var4 = arg1.method441();
        class390[] var5 = arg1.method427();
        if (arg0 == -61440) {
            if ((this.field1170 == null || this.field1170.field860) && (var4 != null || var5 != null)) {
                this.field1170 = new class67(class163.field2065);
            }
            if (this.field1170 != null) {
                this.field1170.method590(arg2, (long) class163.field2065, var4, var5, false);
                this.field1170.method601(super.field2676, super.field2673, super.field2681, super.field2671, super.field2670);
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IB)I", line = 28)
    public static final int method731(int arg0, byte arg1) {
        ++field1183;
        int var2 = 66 / ((-51 - arg1) / 37);
        int var3 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var4 = arg0 * 6 + -61440;
        int var5 = (arg0 * var4 >> 12) + 40960;
        return var3 * var5 >> 12;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lya;I)V", line = 45)
    public final void method192(class38 arg0, int arg1) {
        ++field1173;
        if (arg1 == 1) {
            class474 var3 = this.method735(0, arg0, this.field1172, false);
            if (var3 != null) {
                this.method730(-61440, var3, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(IIIIIIIIIIIII)V", line = 61)
    public class97(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field1180 = arg4;
        this.field1172 = arg0;
        this.field1176 = arg12;
        this.field1162 = arg1 + arg2;
        class466 var14 = class120.field1624.method1836(-39, this.field1172);
        int var15 = var14.field6746;
        if (var15 != -1) {
            this.field1177 = class404.field5756.method557(var15, 15);
            this.field1184 = false;
        } else {
            this.field1184 = true;
        }
        if (~this.field1162 == ~arg2) {
            class334.method1931(super.field2666, (byte) 91, this.field1177, super.field2676, false, this.field1171, super.field2677);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)Z", line = 87)
    public final boolean method194(byte arg0) {
        if (arg0 > -72) {
            this.field1167 = 0;
        }
        ++field1186;
        return false;
    }

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "(B)V", line = 98)
    public final void method732(byte arg0) {
        ++field1179;
        if (this.field1170 != null) {
            this.field1170.method592();
        }
        int var2 = -121 / (arg0 / 34);
    }

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "(I)I", line = 119)
    public final int method733(int arg0) {
        if (arg0 != -29382) {
            this.method734(72, (byte) 92);
        }
        ++field1164;
        return this.field1168;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZLya;)Llo;", line = 130)
    public final class531 method181(boolean arg0, class38 arg1) {
        ++field1161;
        class474 var3 = this.method735((this.field1176 != 0 ? 5 : 0) | 2048, arg1, this.field1172, false);
        if (var3 == null) {
            return null;
        } else {
            if (~this.field1176 != -1) {
                var3.method421(this.field1176 * 2048);
            }
            if (!arg0) {
                return null;
            } else {
                class123 var4 = arg1.method369();
                var4.method229(super.field2666, super.field2672, super.field2677);
                if (this.field1170 == null) {
                    var3.method415(var4, (class419) null, 0);
                } else {
                    class517 var5 = this.field1170.method594();
                    arg1.method366(var3, var5, var4, (class419) null, 0);
                }
                this.field1168 = var3.method418();
                this.method730(-61440, var3, arg1);
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lgg;IZIIILya;)V", line = 164)
    public final void method193(class117 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class38 arg6) {
        int var8 = 106 % ((arg5 - 27) / 40);
        ++field1185;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(IB)V", line = 174)
    public final void method734(int arg0, byte arg1) {
        ++field1163;
        if (!this.field1184) {
            this.field1165 += arg0;
            int var3 = -21 % ((-44 - arg1) / 35);
            while (this.field1165 > this.field1177.field5915[this.field1171]) {
                this.field1165 -= this.field1177.field5915[this.field1171];
                ++this.field1171;
                if (~this.field1177.field5927.length >= ~this.field1171) {
                    this.field1184 = true;
                    break;
                }
            }
            if (!this.field1184) {
                class334.method1931(super.field2666, (byte) 110, this.field1177, super.field2676, false, this.field1171, super.field2677);
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILya;IZ)Lt;", line = 204)
    private final class474 method735(int arg0, class38 arg1, int arg2, boolean arg3) {
        ++field1166;
        class466 var5 = class120.field1624.method1836(-49, arg2);
        class143 var6 = class531.field7811[super.field2676];
        if (arg3) {
            return null;
        } else {
            class143 var7 = ~this.field1180 > -4 ? class531.field7811[this.field1180 + 1] : null;
            return !this.field1184 ? var5.method2817(arg1, super.field2666, var6, class404.field5756, arg0, var7, true, this.field1171, this.field1167, (byte) 8, this.field1165, super.field2672, super.field2677) : var5.method2817(arg1, super.field2666, var6, class404.field5756, arg0, var7, true, -1, -1, (byte) 8, 0, super.field2672, super.field2677);
        }
    }

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "(B)V", line = 231)
    public static void method736(byte arg0) {
        int var1 = 122 / ((-4 - arg0) / 47);
        field1182 = null;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(B)V", line = 240)
    public final void method180(byte arg0) {
        ++field1175;
        if (arg0 == -2) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!qm", name = "finalize", descriptor = "()V", line = 255)
    protected final void finalize() {
        if (this.field1170 != null) {
            this.field1170.method592();
        }
        ++field1181;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILya;II)Z", line = 274)
    public final boolean method186(int arg0, class38 arg1, int arg2, int arg3) {
        ++field1174;
        if (arg0 <= 66) {
            this.field1176 = 25;
        }
        return false;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V", line = 295)
    public static final void method737(int arg0) {
        ++field1169;
        class349.field4492.method2567(16);
        class40.field511.field6631 = 0;
        class85.field1068 = null;
        class181.field2394 = null;
        class306.field3903 = 0;
        class301.field3870 = null;
        class507.field7292 = 0;
        class280.field3572 = 0;
        class525.field7765 = null;
        class513.field7443.field6631 = 0;
        for (int var1 = 0; var1 < 100; ++var1) {
            class374.field4839[var1] = null;
        }
        class428.field6074 = 0;
        class208.field2694 = 0;
        if (arg0 >= -84) {
            method731(112, (byte) 24);
        }
        class279.field3527 = null;
        class280.field3555 = 0;
        class339.field4255 = 0;
        class313.field3994 = null;
    }
}
