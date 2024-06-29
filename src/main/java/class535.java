import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class535 {

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "Lnc;")
    private class26 field7417;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    private int field7410;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    private int field7411;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "Ltca;")
    private class184 field7419;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "Ljb;")
    public static class519 field7405 = new class519(89, -1);

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public static int field7418 = 0;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "I")
    public static int field7423 = -2;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field7404;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field7406;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field7407;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field7408;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public static int field7409;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field7412;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public static int field7413;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public static int field7414;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
    public static int field7415;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
    public static int field7416;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    public static int field7420;

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "I")
    public static int field7421;

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "I")
    public static int field7422;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)I", line = 3)
    public final int method3100(int arg0) {
        field7404++;
        if (arg0 != -1) {
            this.method3111(124);
        }
        int var2 = 0;
        for (class113 var3 = (class113) this.field7417.method152((byte) -13); var3 != null; var3 = (class113) this.field7417.method146((byte) 97)) {
            if (!var3.method837(arg0 + 9615)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZI)V", line = 33)
    public final void method3101(boolean arg0, int arg1) {
        field7414++;
        if (arg0 || class674.field9027 == null) {
            return;
        }
        for (class113 var3 = (class113) this.field7417.method152((byte) -13); var3 != null; var3 = (class113) this.field7417.method146((byte) 97)) {
            if (var3.method837(9614)) {
                if (var3.method834(6) == null) {
                    var3.method1102((byte) 115);
                    var3.method3659(1);
                    this.field7411 += var3.field1543;
                }
            } else if ((++var3.field8883) > ((long) arg1)) {
                class113 var4 = class674.field9027.method939(var3, (byte) -33);
                this.field7419.method1247(4070, var3.field2146, var4);
                class564.method3214(-30251, var3, var4);
                var3.method1102((byte) 111);
                var3.method3659(1);
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILjava/lang/Object;JI)V", line = 83)
    public final void method3102(int arg0, Object arg1, long arg2, int arg3) {
        field7413++;
        if (arg3 > this.field7410) {
            throw new IllegalStateException("s>cs");
        }
        this.method3110(arg2, (byte) -127);
        this.field7411 -= arg3;
        while (this.field7411 < 0) {
            class113 var7 = (class113) this.field7417.method155(124);
            this.method3112((byte) -103, var7);
        }
        class297 var6 = new class297(arg1, arg3);
        this.field7419.method1247(4070, arg2, var6);
        this.field7417.method150(arg0, var6);
        var6.field8883 = 0L;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V", line = 112)
    public final void method3103(int arg0) {
        if (arg0 == -11294) {
            this.field7417.method153(121);
            field7408++;
            this.field7419.method1244(30407);
            this.field7411 = this.field7410;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)I", line = 126)
    public final int method3104(byte arg0) {
        field7409++;
        return arg0 > -12 ? 17 : this.field7411;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V", line = 137)
    public static void method3105(boolean arg0) {
        field7405 = null;
        if (!arg0) {
            method3105(false);
        }
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 149)
    public final Object method3106(int arg0) {
        if (arg0 > -105) {
            return null;
        }
        field7406++;
        class113 var2 = (class113) this.field7419.method1246(true);
        while (var2 != null) {
            Object var3 = var2.method834(6);
            if (var3 != null) {
                return var3;
            }
            class113 var4 = var2;
            var2 = (class113) this.field7419.method1246(true);
            var4.method1102((byte) 73);
            var4.method3659(1);
            this.field7411 += var4.field1543;
        }
        return null;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)Ljava/lang/Object;", line = 180)
    public final Object method3107(byte arg0) {
        field7407++;
        class113 var2 = (class113) this.field7419.method1249((byte) -120);
        while (var2 != null) {
            Object var3 = var2.method834(6);
            if (var3 != null) {
                return var3;
            }
            class113 var4 = var2;
            var2 = (class113) this.field7419.method1246(true);
            var4.method1102((byte) 89);
            var4.method3659(1);
            this.field7411 += var4.field1543;
        }
        if (arg0 != -124) {
            field7418 = 14;
        }
        return null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(JILjava/lang/Object;)V", line = 215)
    public final void method3108(long arg0, int arg1, Object arg2) {
        this.method3102(0, arg2, arg0, 1);
        if (arg1 == 16337) {
            field7420++;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BJ)Ljava/lang/Object;", line = 227)
    public final Object method3109(byte arg0, long arg1) {
        if (arg0 <= 98) {
            field7405 = null;
        }
        field7412++;
        class113 var4 = (class113) this.field7419.method1248(119, arg1);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method834(6);
        if (var5 == null) {
            var4.method1102((byte) 105);
            var4.method3659(1);
            this.field7411 += var4.field1543;
            return null;
        }
        if (var4.method837(9614)) {
            class297 var6 = new class297(var5, var4.field1543);
            this.field7419.method1247(4070, var4.field2146, var6);
            this.field7417.method150(0, var6);
            var6.field8883 = 0L;
            var4.method1102((byte) 114);
            var4.method3659(1);
        } else {
            this.field7417.method150(0, var4);
            var4.field8883 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(I)V", line = 273)
    public class535(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(JB)V", line = 277)
    private final void method3110(long arg0, byte arg1) {
        field7421++;
        class113 var4 = (class113) this.field7419.method1248(96, arg0);
        int var5 = 99 / ((arg1 + 82) / 43);
        this.method3112((byte) -108, var4);
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(I)I", line = 290)
    public final int method3111(int arg0) {
        field7422++;
        if (arg0 != -1) {
            this.method3109((byte) -55, 35L);
        }
        return this.field7410;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLjt;)V", line = 302)
    private final void method3112(byte arg0, class113 arg1) {
        if (arg0 >= -84) {
            this.method3104((byte) 61);
        }
        if (arg1 != null) {
            arg1.method1102((byte) 116);
            arg1.method3659(1);
            this.field7411 += arg1.field1543;
        }
        field7415++;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(II)V", line = 351)
    public class535(int arg0, int arg1) {
        this.field7417 = new class26();
        this.field7410 = arg0;
        this.field7411 = arg0;
        int var3;
        for (var3 = 1; (var3 + var3) < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field7419 = new class184(var3);
    }

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "(I)V", line = 326)
    public final void method3113(int arg0) {
        field7416++;
        if (arg0 >= -126) {
            this.method3101(true, 126);
        }
        for (class113 var2 = (class113) this.field7417.method152((byte) -13); var2 != null; var2 = (class113) this.field7417.method146((byte) 97)) {
            if (var2.method837(9614)) {
                var2.method1102((byte) 90);
                var2.method3659(1);
                this.field7411 += var2.field1543;
            }
        }
    }
}
