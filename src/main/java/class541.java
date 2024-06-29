import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class541 {

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "Lad;")
    private class19 field7595 = new class19(64);

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "Lad;")
    private class19 field7600 = new class19(100);

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "Ltf;")
    private class701 field7597;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "Ljava/util/Calendar;")
    public static Calendar field7594 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field7592;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field7593;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field7596;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field7598;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public static int field7601;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "Ljava/lang/Object;")
    public static Object field7599;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 3)
    public static void method3040(int arg0) {
        if (arg0 == 64) {
            field7594 = null;
            field7599 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BI)V", line = 18)
    public final void method3041(byte arg0, int arg1) {
        if (arg0 != -89) {
            this.method3043(-20, -110);
        }
        class19 var3 = this.field7595;
        synchronized (this.field7595) {
            this.field7595.method83((byte) -2, arg1);
        }
        field7593++;
        class19 var4 = this.field7600;
        synchronized (this.field7600) {
            this.field7600.method83((byte) -2, arg1);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IB)Lej;", line = 38)
    public final class479 method3042(int arg0, byte arg1) {
        field7598++;
        class19 var3 = this.field7600;
        synchronized (this.field7600) {
            class479 var4 = (class479) this.field7600.method78(0, (long) arg0);
            if (var4 == null) {
                var4 = new class479(arg0);
                this.field7600.method92(arg1 ^ 0xFFFFFFEA, (long) arg0, var4);
            }
            if (arg1 == -21) {
                return var4.method2760(-1) ? var4 : null;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)Llb;", line = 68)
    public final class257 method3043(int arg0, int arg1) {
        field7596++;
        class19 var3 = this.field7595;
        class257 var4;
        synchronized (this.field7595) {
            var4 = (class257) this.field7595.method78(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1 != -8191) {
            this.field7600 = null;
        }
        class701 var5 = this.field7597;
        byte[] var6;
        synchronized (this.field7597) {
            var6 = this.field7597.method3854((byte) 120, class546.method3091(arg0, 802983975), class611.method3406((byte) 82, arg0));
        }
        class257 var7 = new class257();
        var7.field3214 = this;
        var7.field3207 = arg0;
        if (var6 != null) {
            var7.method1519(new class115(var6), (byte) 0);
        }
        var7.method1521((byte) -94);
        class19 var8 = this.field7595;
        synchronized (this.field7595) {
            this.field7595.method92(arg1 ^ 0xFFFFE000, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V", line = 101)
    public final void method3044(int arg0) {
        class19 var2 = this.field7595;
        synchronized (this.field7595) {
            this.field7595.method80((byte) -67);
            if (arg0 != 1) {
                this.method3044(-29);
            }
        }
        field7601++;
        class19 var3 = this.field7600;
        synchronized (this.field7600) {
            this.field7600.method80((byte) 100);
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lqh;ILtf;Ltf;Ltf;)V", line = 141)
    public class541(class320 arg0, int arg1, class701 arg2, class701 arg3, class701 arg4) {
        this.field7597 = arg2;
        if (this.field7597 != null) {
            int var6 = this.field7597.method3877(100) - 1;
            this.field7597.method3883(var6, 0);
        }
        class25.method131(2, arg4, 117, arg3);
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V", line = 121)
    public final void method3045(int arg0) {
        class19 var2 = this.field7595;
        synchronized (this.field7595) {
            if (arg0 >= -22) {
                this.method3043(82, -126);
            }
            this.field7595.method88(48);
        }
        field7592++;
        class19 var3 = this.field7600;
        synchronized (this.field7600) {
            this.field7600.method88(68);
        }
    }
}
