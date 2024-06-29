import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class252 {

    @OriginalMember(owner = "client!up", name = "s", descriptor = "B")
    public byte field4035;

    @OriginalMember(owner = "client!up", name = "h", descriptor = "Lwr;")
    public static class423 field4024 = new class423();

    @OriginalMember(owner = "client!up", name = "a", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!up", name = "b", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!up", name = "f", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!up", name = "k", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!up", name = "o", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!up", name = "t", descriptor = "Lqk;")
    public static class16 field4036;

    @OriginalMember(owner = "client!up", name = "g", descriptor = "Lvb;")
    public class180 field4023;

    @OriginalMember(owner = "client!up", name = "l", descriptor = "Lvb;")
    public class180 field4028;

    @OriginalMember(owner = "client!up", name = "n", descriptor = "Lup;")
    public class252 field4030;

    @OriginalMember(owner = "client!up", name = "r", descriptor = "Lcs;")
    public class313 field4034;

    @OriginalMember(owner = "client!up", name = "j", descriptor = "Lim;")
    public class531 field4026;

    @OriginalMember(owner = "client!up", name = "i", descriptor = "Lht;")
    public class539 field4025;

    @OriginalMember(owner = "client!up", name = "c", descriptor = "Liq;")
    public class563 field4019;

    @OriginalMember(owner = "client!up", name = "m", descriptor = "Liq;")
    public class563 field4029;

    @OriginalMember(owner = "client!up", name = "d", descriptor = "S")
    public short field4020;

    @OriginalMember(owner = "client!up", name = "e", descriptor = "S")
    public short field4021;

    @OriginalMember(owner = "client!up", name = "p", descriptor = "S")
    public short field4032;

    @OriginalMember(owner = "client!up", name = "q", descriptor = "S")
    public short field4033;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IZIZ)I", line = 3)
    public static final int method1790(int arg0, boolean arg1, int arg2, boolean arg3) {
        field4017++;
        if (!arg3) {
            method1793(-64, -104, (byte) 127, 64, null, 25, 41);
        }
        class527 var4 = class605.method3523(arg1, (byte) 120, arg0);
        if (var4 == null) {
            return -1;
        } else if (arg2 >= 0 && arg2 < var4.field7693.length) {
            return var4.field7693[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Lie;Ljava/lang/String;I)I", line = 24)
    public static final int method1791(class6 arg0, String arg1, int arg2) {
        field4027++;
        if (arg2 != 13) {
            field4024 = null;
        }
        int var3 = arg0.field57;
        byte[] var4 = class24.method411(arg2 + 69, arg1);
        arg0.method66(var4.length, (byte) 100);
        arg0.field57 += class360.field5701.method3831(arg2 ^ 0xFFFFB9EA, arg0.field57, var4, 0, arg0.field96, var4.length);
        return arg0.field57 - var3;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(B)V", line = 43)
    public final void method1792(byte arg0) {
        while (this.field4026 != null) {
            class531 var2 = this.field4026.field7736;
            this.field4026.method3214(false);
            this.field4026 = var2;
        }
        field4022++;
        if (arg0 > -49) {
            this.field4034 = null;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIBILr;II)Lda;", line = 61)
    public static final class55 method1793(int arg0, int arg1, byte arg2, int arg3, class167 arg4, int arg5, int arg6) {
        field4018++;
        long var7 = (long) arg1;
        class55 var9 = (class55) class335.field5482.method560(false, var7);
        short var10 = 2055;
        if (arg2 <= 72) {
            return null;
        }
        if (var9 == null) {
            class534 var11 = class243.method1736(arg1, 0, 6392, class547.field7970);
            if (var11 == null) {
                return null;
            }
            if (var11.field7772 < 13) {
                var11.method3244(44, 2);
            }
            var9 = arg4.method287(var11, var10, class489.field7157, 64, 768);
            class335.field5482.method559(var9, var7, 0);
        }
        class55 var12 = var9.method609((byte) 2, var10, true);
        if (arg0 != 0) {
            var12.method618(arg0);
        }
        if (arg6 != 0) {
            var12.method644(arg6);
        }
        if (arg5 != 0) {
            var12.method610(arg5);
        }
        if (arg3 != 0) {
            var12.method639(0, arg3, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(I)V", line = 107)
    public class252(int arg0) {
        this.field4035 = (byte) arg0;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V", line = 128)
    public static void method1794(int arg0) {
        field4036 = null;
        field4024 = null;
        if (arg0 > -16) {
            field4024 = null;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIIIII)V", line = 144)
    public static final void method1795(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class538.field7859 = arg3;
        class579.field8256 = arg1;
        class550.field7994 = arg6;
        field4031++;
        class240.field3808 = arg4;
        if (arg5 <= 123) {
            field4036 = null;
        }
        class355.field5669 = arg0;
        class391.field6055 = arg2;
    }
}
