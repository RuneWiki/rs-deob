import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class556 extends class241 implements class269 {

    @OriginalMember(owner = "client!fh", name = "G", descriptor = "B")
    private byte field8179;

    @OriginalMember(owner = "client!fh", name = "L", descriptor = "Z")
    private boolean field8184;

    @OriginalMember(owner = "client!fh", name = "bb", descriptor = "Z")
    private boolean field8200;

    @OriginalMember(owner = "client!fh", name = "S", descriptor = "B")
    private byte field8191;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "B")
    private byte field8168;

    @OriginalMember(owner = "client!fh", name = "E", descriptor = "Z")
    private boolean field8177;

    @OriginalMember(owner = "client!fh", name = "ab", descriptor = "S")
    private short field8199;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "Z")
    private boolean field8167;

    @OriginalMember(owner = "client!fh", name = "Z", descriptor = "Lr;")
    public class157 field8198;

    @OriginalMember(owner = "client!fh", name = "N", descriptor = "Lk;")
    private class483 field8186;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "Z")
    public static boolean field8169 = false;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "I")
    public static int field8170;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "I")
    public static int field8171;

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "I")
    public static int field8172;

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "I")
    public static int field8173;

    @OriginalMember(owner = "client!fh", name = "A", descriptor = "I")
    public static int field8174;

    @OriginalMember(owner = "client!fh", name = "D", descriptor = "I")
    public static int field8176;

    @OriginalMember(owner = "client!fh", name = "F", descriptor = "I")
    public static int field8178;

    @OriginalMember(owner = "client!fh", name = "H", descriptor = "I")
    public static int field8180;

    @OriginalMember(owner = "client!fh", name = "I", descriptor = "I")
    public static int field8181;

    @OriginalMember(owner = "client!fh", name = "J", descriptor = "I")
    public static int field8182;

    @OriginalMember(owner = "client!fh", name = "K", descriptor = "I")
    public static int field8183;

    @OriginalMember(owner = "client!fh", name = "M", descriptor = "I")
    public static int field8185;

    @OriginalMember(owner = "client!fh", name = "O", descriptor = "I")
    public static int field8187;

    @OriginalMember(owner = "client!fh", name = "P", descriptor = "I")
    public static int field8188;

    @OriginalMember(owner = "client!fh", name = "Q", descriptor = "I")
    public static int field8189;

    @OriginalMember(owner = "client!fh", name = "R", descriptor = "I")
    public static int field8190;

    @OriginalMember(owner = "client!fh", name = "T", descriptor = "I")
    public static int field8192;

    @OriginalMember(owner = "client!fh", name = "U", descriptor = "I")
    public static int field8193;

    @OriginalMember(owner = "client!fh", name = "V", descriptor = "I")
    public static int field8194;

    @OriginalMember(owner = "client!fh", name = "W", descriptor = "I")
    public static int field8195;

    @OriginalMember(owner = "client!fh", name = "X", descriptor = "I")
    public static int field8196;

    @OriginalMember(owner = "client!fh", name = "Y", descriptor = "I")
    public static int field8197;

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "Lso;")
    private class398 field8175;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "[I")
    public static int[] field8166;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)Z")
    public final boolean method317(int arg0) {
        if (arg0 != 64) {
            return false;
        } else {
            ++field8172;
            return this.field8184;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)I")
    public final int method333(byte arg0) {
        if (arg0 != 70) {
            this.method336(true, (class206) null);
        }
        ++field8189;
        return this.field8191;
    }

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "(I)I")
    public static final int method3250(int arg0) {
        if (arg0 <= 110) {
            return -56;
        } else {
            ++field8174;
            return class24.field163++;
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)Z")
    public final boolean method332(int arg0) {
        ++field8170;
        int var2 = 71 % ((1 - arg0) / 49);
        return this.field8167;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILqa;II)Z")
    public final boolean method318(int arg0, class206 arg1, int arg2, int arg3) {
        if (arg0 != -21851) {
            return false;
        } else {
            ++field8178;
            class157 var5 = this.method3252(arg1, 131072, false);
            if (var5 != null) {
                class163 var6 = arg1.method1126();
                var6.method661(super.field3005, super.field3009, super.field3004);
                return var5.method91(arg2, arg3, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZLoe;ILqa;III)V")
    public final void method312(boolean arg0, class170 arg1, int arg2, class206 arg3, int arg4, int arg5, int arg6) {
        ++field8176;
        if (arg5 != 13915) {
            this.method339((byte) -73);
        }
        if (!(arg1 instanceof class556)) {
            if (arg1 instanceof class638) {
                class638 var8 = (class638) arg1;
                if (this.field8198 != null && var8.field9171 != null) {
                    this.field8198.method67(var8.field9171, arg6, arg4, arg2, arg0);
                    return;
                }
            }
        } else {
            class556 var9 = (class556) arg1;
            if (this.field8198 == null || var9.field8198 == null) {
                return;
            }
            this.field8198.method67(var9.field8198, arg6, arg4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)I")
    public final int method337(boolean arg0) {
        ++field8181;
        return !arg0 ? 65 : this.field8179;
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(ILqa;)Loj;")
    public final class318 method320(int arg0, class206 arg1) {
        ++field8185;
        if (this.field8198 == null) {
            return null;
        } else {
            class163 var3 = arg1.method1126();
            var3.method661(super.field3005, super.field3009, super.field3004);
            class318 var4 = null;
            if (this.field8177) {
                var4 = class143.method788(0, 1);
            }
            this.field8198.method69(var3, var4 == null ? null : var4.field4059[0], 0);
            return arg0 != -1 ? null : var4;
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)V")
    public final void method339(byte arg0) {
        ++field8194;
        if (this.field8198 != null) {
            this.field8198.method97();
        }
        if (arg0 >= -114) {
            this.method339((byte) 47);
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(ILqa;)Lso;")
    public final class398 method328(int arg0, class206 arg1) {
        if (arg0 != 12) {
            method3256(88);
        }
        ++field8187;
        if (this.field8175 == null) {
            this.field8175 = class533.method3049(super.field3009, super.field3005, (byte) -127, this.method3252(arg1, 0, false), super.field3004);
        }
        return this.field8175;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lqa;ZZI)Ljc;")
    private final class372 method3251(class206 arg0, boolean arg1, boolean arg2, int arg3) {
        ++field8188;
        class437 var5 = class16.field126.method1759(arg2, 65535 & this.field8199);
        class174 var6;
        class174 var7;
        if (this.field8200) {
            var6 = class90.field1114[0];
            var7 = class370.field4884[this.field8168];
        } else {
            var7 = class90.field1114[this.field8168];
            if (~this.field8168 <= -4) {
                var6 = null;
            } else {
                var6 = class90.field1114[this.field8168 + 1];
            }
        }
        return var5.method2541(var7, arg1, arg3, var6, arg0, super.field3005, super.field3004, 4, super.field3009, this.field8191, this.field8179);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lqa;IZ)Lr;")
    private final class157 method3252(class206 arg0, int arg1, boolean arg2) {
        ++field8182;
        if (this.field8198 != null && ~arg0.method1128(this.field8198.method77(), arg1) == -1) {
            return this.field8198;
        } else {
            class372 var4 = this.method3251(arg0, arg2, arg2, arg1);
            return var4 != null ? var4.field4894 : null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)Z")
    public static final boolean method3253(int arg0, int arg1, int arg2) {
        if (arg2 >= -94) {
            return true;
        } else {
            ++field8171;
            return (2048 & arg0) != 0;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lqa;Z)V")
    public final void method341(class206 arg0, boolean arg1) {
        ++field8196;
        Object var3 = null;
        if (!arg1) {
            class483 var5;
            if (this.field8186 == null && this.field8167) {
                class372 var4 = this.method3251(arg0, true, arg1, 262144);
                var5 = var4 != null ? var4.field4893 : null;
            } else {
                var5 = this.field8186;
                this.field8186 = null;
            }
            if (var5 != null) {
                class644.method3721(var5, this.field8168, super.field3005, super.field3004, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZLqa;)V")
    public final void method336(boolean arg0, class206 arg1) {
        ++field8183;
        Object var3 = null;
        class483 var5;
        if (this.field8186 == null && this.field8167) {
            class372 var4 = this.method3251(arg1, true, false, 262144);
            var5 = var4 == null ? null : var4.field4893;
        } else {
            var5 = this.field8186;
            this.field8186 = null;
        }
        if (arg0) {
            this.method342(-94);
        }
        if (var5 != null) {
            class131.method738(var5, this.field8168, super.field3005, super.field3004, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lqa;Lcn;IIIIZIIZ)V")
    public class556(class206 arg0, class437 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class300.method1661(arg7, (byte) 113, arg8));
        this.field8179 = (byte) arg7;
        super.field3005 = arg3;
        this.field8184 = arg9;
        this.field8200 = arg6;
        this.field8191 = (byte) arg8;
        super.field3004 = arg5;
        this.field8168 = (byte) arg2;
        this.field8177 = ~arg1.field5972 != -1 && !arg6;
        this.field8199 = (short) arg1.field5996;
        this.field8167 = arg0.method1108() && arg1.field5978 && !this.field8200 && class565.field8299.method990(class529.field7429, -1) != 0;
        int var11 = 2048;
        if (this.field8184) {
            var11 |= 65536;
        }
        class372 var12 = this.method3251(arg0, this.field8167, false, var11);
        if (var12 != null) {
            this.field8198 = var12.field4894;
            this.field8186 = var12.field4893;
            if (this.field8184) {
                this.field8198 = this.field8198.method64((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)I")
    public final int method342(int arg0) {
        ++field8195;
        if (arg0 != -2329) {
            method3254(36);
        }
        return 65535 & this.field8199;
    }

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "(I)V")
    public static void method3254(int arg0) {
        field8166 = null;
        if (arg0 != 0) {
            method3254(-16);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILqa;Z)Lr;")
    public final class157 method335(int arg0, class206 arg1, boolean arg2) {
        if (!arg2) {
            field8166 = null;
        }
        ++field8193;
        return this.method3252(arg1, arg0, false);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "([BZI)[B")
    public static final byte[] method3255(byte[] arg0, boolean arg1, int arg2) {
        ++field8192;
        if (arg1) {
            return null;
        } else {
            byte[] var3 = new byte[arg2];
            class345.method1932(arg0, 0, var3, 0, arg2);
            return var3;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILqa;)V")
    public final void method326(int arg0, class206 arg1) {
        if (arg0 != 29657) {
            this.field8199 = -93;
        }
        ++field8180;
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(B)V")
    public final void method314(byte arg0) {
        if (arg0 <= 23) {
            this.method332(-59);
        }
        ++field8173;
        this.field8184 = false;
        if (this.field8198 != null) {
            this.field8198.method72(this.field8198.method77() & -65537);
        }
    }

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "(I)[Llc;")
    public static final class552[] method3256(int arg0) {
        ++field8190;
        if (arg0 != 262144) {
            field8166 = null;
        }
        return new class552[] { class208.field2501, class434.field5896, class97.field1195 };
    }
}
