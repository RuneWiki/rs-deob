import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class59 extends class31 implements class269 {

    @OriginalMember(owner = "client!qh", name = "O", descriptor = "Llo;")
    public class640 field578;

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "Z")
    private boolean field575;

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "Ljava/lang/String;")
    public static String field562 = null;

    @OriginalMember(owner = "client!qh", name = "N", descriptor = "I")
    public static int field577 = 0;

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!qh", name = "x", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!qh", name = "A", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!qh", name = "B", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!qh", name = "D", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!qh", name = "E", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!qh", name = "F", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!qh", name = "G", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!qh", name = "H", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!qh", name = "I", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!qh", name = "J", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!qh", name = "P", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!qh", name = "Q", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!qh", name = "R", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!qh", name = "M", descriptor = "Lso;")
    private class398 field576;

    @OriginalMember(owner = "client!qh", name = "C", descriptor = "[I")
    public static int[] field566;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(ILqa;)Lso;")
    public final class398 method328(int arg0, class206 arg1) {
        if (arg0 != 12) {
            return null;
        } else {
            ++field573;
            return this.field576;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILqa;)V")
    public final void method326(int arg0, class206 arg1) {
        if (arg0 != 29657) {
            this.method339((byte) 127);
        }
        ++field564;
        class157 var3 = this.field578.method3668(true, true, 262144, super.field244, arg1, super.field240, arg0 + -29660);
        if (var3 != null) {
            int var4 = super.field240 >> 7;
            int var5 = super.field244 >> 7;
            this.field578.method3674(var4, var3, 4441, arg1, var5, false, var5, var4);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILqa;Z)Lr;")
    public final class157 method335(int arg0, class206 arg1, boolean arg2) {
        ++field568;
        if (!arg2) {
            this.method342(122);
        }
        return this.field578.method3668(false, false, arg0, 0, arg1, 0, -3);
    }

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "(I)V")
    public static final void method343(int arg0) {
        ++field570;
        if (arg0 == 11463) {
            class512.field7236.method1171(class639.field9197, class202.field2428, class34.field272);
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V")
    public final void method339(byte arg0) {
        if (arg0 > -114) {
            this.field578 = null;
        }
        ++field571;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lqa;Lcn;IIIIIZII)V")
    public class59(class206 arg0, class437 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field5999, arg1.field6027, arg1.field5965);
        this.field578 = new class640(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field575 = ~arg1.field5972 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)V")
    public static void method344(int arg0) {
        if (arg0 != 523) {
            field566 = null;
        }
        field566 = null;
        field562 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILqa;II)Z")
    public final boolean method318(int arg0, class206 arg1, int arg2, int arg3) {
        if (arg0 != -21851) {
            this.field578 = null;
        }
        ++field579;
        class157 var5 = this.field578.method3668(false, false, 131072, super.field244, arg1, super.field240, -3);
        if (var5 == null) {
            return false;
        } else {
            class163 var6 = arg1.method1126();
            var6.method661(super.field240, super.field243, super.field244);
            return var5.method91(arg2, arg3, var6, false);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)I")
    public final int method342(int arg0) {
        ++field574;
        if (arg0 != -2329) {
            field577 = 3;
        }
        return this.field578.field9237;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZLqa;)V")
    public final void method336(boolean arg0, class206 arg1) {
        this.field578.method3677(arg0, arg1);
        ++field561;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZLoe;ILqa;III)V")
    public final void method312(boolean arg0, class170 arg1, int arg2, class206 arg3, int arg4, int arg5, int arg6) {
        if (arg5 == 13915) {
            ++field567;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "(I)Z")
    public final boolean method317(int arg0) {
        ++field580;
        return arg0 != 64 ? false : false;
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(ILqa;)Loj;")
    public final class318 method320(int arg0, class206 arg1) {
        ++field563;
        class157 var3 = this.field578.method3668(false, true, 2048, super.field244, arg1, super.field240, arg0 ^ 2);
        if (var3 == null) {
            return null;
        } else {
            class163 var4 = arg1.method1126();
            var4.method661(super.field240, super.field243, super.field244);
            class318 var5 = null;
            if (this.field575) {
                var5 = class143.method788(0, 1);
            }
            if (this.field578.field9229 == null) {
                var3.method69(var4, var5 != null ? var5.field4059[0] : null, 0);
            } else {
                class400 var6 = this.field578.field9229.method2650();
                arg1.method1177(var3, var6, var4, var5 != null ? var5.field4059[0] : null, 0);
            }
            if (this.field576 != null) {
                class642.method3698(super.field243, this.field576, super.field244, var3, (byte) 117, super.field240);
            } else {
                this.field576 = class533.method3049(super.field243, super.field240, (byte) 113, var3, super.field244);
            }
            int var7 = super.field240 >> 7;
            if (arg0 != -1) {
                this.field578 = null;
            }
            int var8 = super.field244 >> 7;
            this.field578.method3674(var7, var3, 4441, arg1, var8, true, var8, var7);
            return var5;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)I")
    public final int method333(byte arg0) {
        if (arg0 != 70) {
            this.method339((byte) -65);
        }
        ++field569;
        return this.field578.field9207;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)Z")
    public final boolean method332(int arg0) {
        ++field565;
        int var2 = 64 % ((1 - arg0) / 49);
        return this.field578.method3675(false);
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)V")
    public final void method314(byte arg0) {
        ++field560;
        if (arg0 >= 23) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lqa;Z)V")
    public final void method341(class206 arg0, boolean arg1) {
        this.field578.method3669(arg0, 262144);
        if (!arg1) {
            ++field581;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)I")
    public final int method337(boolean arg0) {
        ++field572;
        if (!arg0) {
            method343(115);
        }
        return this.field578.field9228;
    }
}
