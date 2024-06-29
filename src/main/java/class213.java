import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class213 {

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "Ljn;")
    private class117 field3234 = new class117(64);

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "Lvo;")
    private class345 field3242;

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "Lvo;")
    private class345 field3239;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "Z")
    public static boolean field3233 = false;

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "[I")
    public static int[] field3240 = new int[2];

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "Lfa;")
    public static class615 field3241;

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "[I")
    public static int[] field3236;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(III)Ljava/lang/String;")
    public static final String method1452(int arg0, int arg1, int arg2) {
        field3235++;
        int var3 = arg2 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else {
            if (arg0 > -71) {
                method1453(null, null, -52, false, -120, 37, 80, 117);
            }
            if (var3 < -3) {
                return "<col=ff7000>";
            } else if (var3 < 0) {
                return "<col=ffb000>";
            } else if (var3 > 9) {
                return "<col=00ff00>";
            } else if (var3 > 6) {
                return "<col=40ff00>";
            } else if (var3 > 3) {
                return "<col=80ff00>";
            } else if (var3 > 0) {
                return "<col=c0ff00>";
            } else {
                return "<col=ffff00>";
            }
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "([ILkfa;IZIIII)Lbb;")
    public static final class196 method1453(int[] arg0, class382 arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        field3238++;
        if (arg2 != -2149) {
            field3241 = null;
        }
        if (!arg1.field5507 && (!class452.method2633(arg5, (byte) 127) || !class452.method2633(arg7, (byte) 127))) {
            return arg1.field5528 ? new class196(arg1, 34037, arg5, arg7, arg3, arg0, arg6, arg4) : new class196(arg1, arg5, arg7, class99.method830(arg5, false), class99.method830(arg7, false), arg0);
        } else {
            return new class196(arg1, 3553, arg5, arg7, arg3, arg0, arg6, arg4);
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
    public static void method1454(int arg0) {
        field3241 = null;
        if (arg0 == 0) {
            field3236 = null;
            field3240 = null;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)Lck;")
    public final class208 method1455(int arg0, int arg1) {
        field3237++;
        class208 var3 = (class208) this.field3234.method941((long) arg1, 0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = this.field3239.method2081(60, arg1, 0);
        } else {
            var4 = this.field3242.method2081(83, arg1 & 0x7FFF, 0);
        }
        class208 var5 = new class208();
        if (var4 != null) {
            var5.method1435(new class465(var4), 20906);
        }
        if (arg0 <= 98) {
            return null;
        }
        if (arg1 >= 32768) {
            var5.method1438(-14551);
        }
        this.field3234.method949((long) arg1, true, var5);
        return var5;
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(ILvo;Lvo;)V")
    public class213(int arg0, class345 arg1, class345 arg2) {
        this.field3242 = arg2;
        this.field3239 = arg1;
        if (this.field3239 != null) {
            this.field3239.method2098(0, 0);
        }
        if (this.field3242 != null) {
            this.field3242.method2098(0, 0);
        }
    }
}
