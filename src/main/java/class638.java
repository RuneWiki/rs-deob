import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class638 extends class598 implements class269 {

    @OriginalMember(owner = "client!lr", name = "S", descriptor = "Z")
    private boolean field9172;

    @OriginalMember(owner = "client!lr", name = "I", descriptor = "Z")
    private boolean field9162;

    @OriginalMember(owner = "client!lr", name = "hb", descriptor = "B")
    private byte field9187;

    @OriginalMember(owner = "client!lr", name = "Z", descriptor = "B")
    private byte field9179;

    @OriginalMember(owner = "client!lr", name = "cb", descriptor = "B")
    private byte field9182;

    @OriginalMember(owner = "client!lr", name = "E", descriptor = "S")
    private short field9158;

    @OriginalMember(owner = "client!lr", name = "gb", descriptor = "Z")
    private boolean field9186;

    @OriginalMember(owner = "client!lr", name = "F", descriptor = "Z")
    private boolean field9159;

    @OriginalMember(owner = "client!lr", name = "R", descriptor = "Lr;")
    public class157 field9171;

    @OriginalMember(owner = "client!lr", name = "Y", descriptor = "Lk;")
    private class483 field9178;

    @OriginalMember(owner = "client!lr", name = "db", descriptor = "Lg;")
    public static class135 field9183 = new class135(1);

    @OriginalMember(owner = "client!lr", name = "mb", descriptor = "[F")
    public static float[] field9192 = new float[4];

    @OriginalMember(owner = "client!lr", name = "C", descriptor = "I")
    public static int field9156;

    @OriginalMember(owner = "client!lr", name = "D", descriptor = "I")
    public static int field9157;

    @OriginalMember(owner = "client!lr", name = "G", descriptor = "I")
    public static int field9160;

    @OriginalMember(owner = "client!lr", name = "J", descriptor = "I")
    public static int field9163;

    @OriginalMember(owner = "client!lr", name = "K", descriptor = "I")
    public static int field9164;

    @OriginalMember(owner = "client!lr", name = "L", descriptor = "I")
    public static int field9165;

    @OriginalMember(owner = "client!lr", name = "M", descriptor = "I")
    public static int field9166;

    @OriginalMember(owner = "client!lr", name = "N", descriptor = "I")
    public static int field9167;

    @OriginalMember(owner = "client!lr", name = "O", descriptor = "I")
    public static int field9168;

    @OriginalMember(owner = "client!lr", name = "P", descriptor = "I")
    public static int field9169;

    @OriginalMember(owner = "client!lr", name = "Q", descriptor = "I")
    public static int field9170;

    @OriginalMember(owner = "client!lr", name = "T", descriptor = "I")
    public static int field9173;

    @OriginalMember(owner = "client!lr", name = "U", descriptor = "I")
    public static int field9174;

    @OriginalMember(owner = "client!lr", name = "V", descriptor = "I")
    public static int field9175;

    @OriginalMember(owner = "client!lr", name = "W", descriptor = "I")
    public static int field9176;

    @OriginalMember(owner = "client!lr", name = "X", descriptor = "I")
    public static int field9177;

    @OriginalMember(owner = "client!lr", name = "ab", descriptor = "I")
    public static int field9180;

    @OriginalMember(owner = "client!lr", name = "bb", descriptor = "I")
    public static int field9181;

    @OriginalMember(owner = "client!lr", name = "eb", descriptor = "I")
    public static int field9184;

    @OriginalMember(owner = "client!lr", name = "fb", descriptor = "I")
    public static int field9185;

    @OriginalMember(owner = "client!lr", name = "ib", descriptor = "I")
    public static int field9188;

    @OriginalMember(owner = "client!lr", name = "jb", descriptor = "I")
    public static int field9189;

    @OriginalMember(owner = "client!lr", name = "lb", descriptor = "I")
    public static int field9191;

    @OriginalMember(owner = "client!lr", name = "kb", descriptor = "Lqa;")
    public static class206 field9190;

    @OriginalMember(owner = "client!lr", name = "H", descriptor = "Lso;")
    private class398 field9161;

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "(I)I", line = 3)
    public final int method322(int arg0) {
        ++field9156;
        if (arg0 != 64) {
            return 16;
        } else {
            return this.field9171 != null ? this.field9171.method74() : 0;
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)Z", line = 15)
    public final boolean method332(int arg0) {
        int var2 = -5 / ((arg0 - 1) / 49);
        ++field9184;
        return this.field9159;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILqa;)V", line = 25)
    public final void method326(int arg0, class206 arg1) {
        ++field9181;
        if (arg0 != 29657) {
            field9183 = null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)I", line = 35)
    public final int method333(byte arg0) {
        ++field9180;
        return arg0 != 70 ? 94 : this.field9182;
    }

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "(I)I", line = 46)
    public final int method3654(int arg0) {
        if (arg0 >= -102) {
            this.field9171 = null;
        }
        ++field9191;
        return this.field9171 != null ? this.field9171.method60() / 4 : 15;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lqa;BI)Lr;", line = 57)
    private final class157 method3655(class206 arg0, byte arg1, int arg2) {
        ++field9170;
        if (this.field9171 != null && ~arg0.method1128(this.field9171.method77(), arg2) == -1) {
            return this.field9171;
        } else {
            if (arg1 < 107) {
                this.field9187 = 57;
            }
            class372 var4 = this.method3661(arg2, (byte) -6, arg0, false);
            return var4 != null ? var4.field4894 : null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)Z", line = 79)
    public final boolean method317(int arg0) {
        ++field9174;
        return arg0 != 64 ? false : this.field9162;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIZZ)V", line = 90)
    public static final void method3656(int arg0, int arg1, boolean arg2, boolean arg3) {
        ++field9173;
        if (~arg0 <= -8001 && arg0 <= 48000) {
            class90.field1101 = arg0;
            if (!arg2) {
                field9192 = null;
            }
            class197.field2383 = arg3;
            class608.field8847 = arg1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZLoe;ILqa;III)V", line = 106)
    public final void method312(boolean arg0, class170 arg1, int arg2, class206 arg3, int arg4, int arg5, int arg6) {
        ++field9189;
        if (arg5 != 13915) {
            this.field9158 = 8;
        }
        if (!(arg1 instanceof class556)) {
            if (arg1 instanceof class638) {
                class638 var8 = (class638) arg1;
                if (this.field9171 != null && var8.field9171 != null) {
                    this.field9171.method67(var8.field9171, arg6, arg4, arg2, arg0);
                    return;
                }
            }
        } else {
            class556 var9 = (class556) arg1;
            if (this.field9171 == null || var9.field8198 == null) {
                return;
            }
            this.field9171.method67(var9.field8198, arg6, arg4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)I", line = 140)
    public final int method342(int arg0) {
        if (arg0 != -2329) {
            return -50;
        } else {
            ++field9188;
            return this.field9158 & 65535;
        }
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(ILqa;)Loj;", line = 155)
    public final class318 method320(int arg0, class206 arg1) {
        ++field9164;
        if (this.field9171 == null) {
            return null;
        } else {
            class163 var3 = arg1.method1126();
            var3.method661(super.field8661, super.field8649, super.field8652);
            if (arg0 != -1) {
                return null;
            } else {
                class318 var4 = null;
                if (this.field9186) {
                    var4 = class143.method788(0, 1);
                }
                this.field9171.method69(var3, var4 == null ? null : var4.field4059[0], 0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(III)Z", line = 182)
    public static final boolean method3657(int arg0, int arg1, int arg2) {
        ++field9165;
        if (arg2 != -14191) {
            return false;
        } else {
            return (arg1 & 2048) != 0 && (55 & arg0) != 0;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(BILmh;IZI[BI)Lwo;", line = 193)
    public static final class632 method3658(byte arg0, int arg1, class537 arg2, int arg3, boolean arg4, int arg5, byte[] arg6, int arg7) {
        ++field9160;
        int var8 = -22 / ((arg0 - -56) / 38);
        if (!arg2.field7777 && (!class415.method2366(-128, arg7) || !class415.method2366(-128, arg3))) {
            return arg2.field7795 ? new class632(arg2, 34037, arg5, arg7, arg3, arg4, arg6, arg1) : new class632(arg2, arg5, arg7, arg3, class129.method731(arg7, -27265), class129.method731(arg3, -27265), arg6, arg1);
        } else {
            return new class632(arg2, 3553, arg5, arg7, arg3, arg4, arg6, arg1);
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(ILqa;)Lso;", line = 213)
    public final class398 method328(int arg0, class206 arg1) {
        if (this.field9161 == null) {
            this.field9161 = class533.method3049(super.field8649, super.field8661, (byte) -15, this.method3655(arg1, (byte) 114, 0), super.field8652);
        }
        if (arg0 != 12) {
            this.method314((byte) 83);
        }
        ++field9157;
        return this.field9161;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILqa;Z)Lr;", line = 228)
    public final class157 method335(int arg0, class206 arg1, boolean arg2) {
        if (!arg2) {
            this.field9162 = false;
        }
        ++field9168;
        return this.method3655(arg1, (byte) 108, arg0);
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lqa;Lcn;IIIIIZIIIIIIZ)V", line = 241)
    public class638(class206 arg0, class437 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field6007 == 1, class405.method2313(arg13, arg12, (byte) -25));
        this.field9172 = arg7;
        this.field9162 = arg14;
        this.field9187 = (byte) arg3;
        this.field9179 = (byte) arg12;
        this.field9182 = (byte) arg13;
        this.field9158 = (short) arg1.field5996;
        this.field9186 = ~arg1.field5972 != -1 && !arg7;
        this.field9159 = arg0.method1108() && arg1.field5978 && !this.field9172 && class565.field8299.method990(class529.field7429, -1) != 0;
        int var16 = 2048;
        if (this.field9162) {
            var16 |= 65536;
        }
        class372 var17 = this.method3661(var16, (byte) -30, arg0, this.field9159);
        if (var17 != null) {
            this.field9171 = var17.field4894;
            this.field9178 = var17.field4893;
            if (this.field9162) {
                this.field9171 = this.field9171.method64((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(B)V", line = 275)
    public final void method339(byte arg0) {
        if (arg0 < -114) {
            if (this.field9171 != null) {
                this.field9171.method97();
            }
            ++field9185;
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(Z)V", line = 300)
    public static void method3659(boolean arg0) {
        field9192 = null;
        if (arg0) {
            field9183 = null;
        }
        field9183 = null;
        field9190 = null;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lqa;Z)V", line = 314)
    public final void method341(class206 arg0, boolean arg1) {
        ++field9166;
        if (arg1) {
            method3656(-92, -13, true, false);
        }
        Object var3 = null;
        class483 var5;
        if (this.field9178 == null && this.field9159) {
            class372 var4 = this.method3661(262144, (byte) -44, arg0, true);
            var5 = var4 != null ? var4.field4893 : null;
        } else {
            var5 = this.field9178;
            this.field9178 = null;
        }
        if (var5 != null) {
            class644.method3721(var5, this.field9187, super.field8661, super.field8652, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILqa;II)Z", line = 343)
    public final boolean method318(int arg0, class206 arg1, int arg2, int arg3) {
        ++field9163;
        class157 var5 = this.method3655(arg1, (byte) 126, 131072);
        if (var5 != null) {
            class163 var6 = arg1.method1126();
            var6.method661(super.field8661, super.field8649, super.field8652);
            return var5.method91(arg2, arg3, var6, false);
        } else {
            if (arg0 != -21851) {
                this.method335(-91, (class206) null, false);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZLqa;)V", line = 365)
    public final void method336(boolean arg0, class206 arg1) {
        ++field9175;
        if (arg0) {
            field9192 = null;
        }
        Object var3 = null;
        class483 var5;
        if (this.field9178 == null && this.field9159) {
            class372 var4 = this.method3661(262144, (byte) -13, arg1, true);
            var5 = var4 != null ? var4.field4893 : null;
        } else {
            var5 = this.field9178;
            this.field9178 = null;
        }
        if (var5 != null) {
            class131.method738(var5, this.field9187, super.field8661, super.field8652, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIBII)V", line = 393)
    public static final void method3660(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 < 35) {
            field9190 = null;
        }
        if (~arg2 <= ~class470.field6589 && arg0 <= class592.field8588 && arg4 >= class563.field8282 && arg1 <= class271.field3513) {
            class87.method510(arg1, arg5, (byte) -73, arg4, arg0, arg2);
        } else {
            class395.method2274((byte) 126, arg2, arg0, arg1, arg4, arg5);
        }
        ++field9176;
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(B)V", line = 413)
    public final void method314(byte arg0) {
        this.field9162 = false;
        if (arg0 >= 23) {
            ++field9167;
            if (this.field9171 != null) {
                this.field9171.method72(this.field9171.method77() & -65537);
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Z)I", line = 427)
    public final int method337(boolean arg0) {
        if (!arg0) {
            method3659(false);
        }
        ++field9177;
        return this.field9179;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IBLqa;Z)Ljc;", line = 448)
    private final class372 method3661(int arg0, byte arg1, class206 arg2, boolean arg3) {
        if (arg1 >= 0) {
            this.method339((byte) -53);
        }
        ++field9169;
        class437 var5 = class16.field126.method1759(false, 65535 & this.field9158);
        class174 var6;
        class174 var7;
        if (this.field9172) {
            var6 = class90.field1114[0];
            var7 = class370.field4884[this.field9187];
        } else {
            if (~this.field9187 > -4) {
                var6 = class90.field1114[this.field9187 - -1];
            } else {
                var6 = null;
            }
            var7 = class90.field1114[this.field9187];
        }
        return var5.method2541(var7, arg3, arg0, var6, arg2, super.field8661, super.field8652, 4, super.field8649, ~this.field9179 != -12 ? this.field9182 : this.field9182 + 4, this.field9179 != 11 ? this.field9179 : 10);
    }
}
