import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class180 {

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "Lvh;")
    private class328 field2660 = new class328(64);

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "Lvh;")
    public class328 field2667 = new class328(2);

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "Lpj;")
    public class132 field2658;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "Lpj;")
    private class132 field2665;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "[I")
    public static int[] field2663;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V")
    public final void method1215(byte arg0) {
        class328 var2 = this.field2660;
        synchronized (this.field2660) {
            if (arg0 != -98) {
                return;
            }
            this.field2660.method1997(1);
        }
        field2664++;
        class328 var3 = this.field2667;
        synchronized (this.field2667) {
            this.field2667.method1997(arg0 + 99);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)Ljava/lang/String;")
    public static final String method1216(int arg0) {
        if (arg0 != 33) {
            method1217(63);
        }
        field2659++;
        return class229.field3278 || class643.field9138 == null ? "" : class643.field9138.field4988;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V")
    public static void method1217(int arg0) {
        field2663 = null;
        if (arg0 > -6) {
            method1216(-45);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)V")
    public final void method1218(int arg0, int arg1) {
        if (arg1 != 2) {
            return;
        }
        class328 var3 = this.field2660;
        synchronized (this.field2660) {
            this.field2660.method1989(arg0, (byte) 96);
        }
        field2666++;
        class328 var4 = this.field2667;
        synchronized (this.field2667) {
            this.field2667.method1989(arg0, (byte) 112);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IB)Lbk;")
    public final class342 method1219(int arg0, byte arg1) {
        if (arg1 >= -3) {
            this.method1219(-96, (byte) -69);
        }
        field2662++;
        class328 var3 = this.field2660;
        class342 var4;
        synchronized (this.field2660) {
            var4 = (class342) this.field2660.method1986((byte) -113, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class132 var5 = this.field2665;
        byte[] var6;
        synchronized (this.field2665) {
            var6 = this.field2665.method940(33, arg0, 0);
        }
        class342 var7 = new class342();
        var7.field4963 = this;
        if (var6 != null) {
            var7.method2048(new class96(var6), false);
        }
        class328 var8 = this.field2660;
        synchronized (this.field2660) {
            this.field2660.method1985(var7, (long) arg0, (byte) -102);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)V")
    public final void method1220(int arg0) {
        class328 var2 = this.field2660;
        synchronized (this.field2660) {
            this.field2660.method1987(-31085);
        }
        field2661++;
        class328 var3 = this.field2667;
        synchronized (this.field2667) {
            if (arg0 >= 25) {
                this.field2667.method1987(-31085);
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Ldd;ILpj;Lpj;)V")
    public class180(class647 arg0, int arg1, class132 arg2, class132 arg3) {
        this.field2658 = arg3;
        this.field2665 = arg2;
        this.field2665.method936(33, -127);
    }
}
