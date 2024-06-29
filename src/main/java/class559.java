import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class559 {

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Lmq;")
    private class472 field8086 = new class472(64);

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "Lmq;")
    private class472 field8093 = new class472(100);

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "Ljn;")
    private class668 field8090;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field8085;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field8087;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field8088;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field8089;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field8091;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field8092;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field8094;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V", line = 3)
    public final void method3268(byte arg0) {
        class472 var2 = this.field8086;
        synchronized (this.field8086) {
            if (arg0 > -112) {
                this.method3271(36, (byte) -62);
            }
            this.field8086.method2776(false);
        }
        field8092++;
        class472 var3 = this.field8093;
        synchronized (this.field8093) {
            this.field8093.method2776(false);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V", line = 20)
    public final void method3269(boolean arg0) {
        class472 var2 = this.field8086;
        synchronized (this.field8086) {
            this.field8086.method2778((byte) 112);
        }
        field8094++;
        if (!arg0) {
            this.method3269(true);
        }
        class472 var3 = this.field8093;
        synchronized (this.field8093) {
            this.field8093.method2778((byte) 120);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)Lbca;", line = 41)
    public final class612 method3270(int arg0, int arg1) {
        field8088++;
        class472 var3 = this.field8093;
        synchronized (this.field8093) {
            class612 var4 = (class612) this.field8093.method2766(-123, (long) arg1);
            if (var4 == null) {
                var4 = new class612(arg1);
                this.field8093.method2772(var4, true, (long) arg1);
            }
            if (arg0 == 13161) {
                return var4.method3504(15231) ? var4 : null;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)V", line = 71)
    public final void method3271(int arg0, byte arg1) {
        class472 var3 = this.field8086;
        synchronized (this.field8086) {
            this.field8086.method2777(arg0, 106);
        }
        field8087++;
        class472 var4 = this.field8093;
        synchronized (this.field8093) {
            if (arg1 != -96) {
                method3274(-9, true, -93);
            }
            this.field8093.method2777(arg0, arg1 ^ 0xFFFFFF82);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZ)V", line = 87)
    public static final void method3272(int arg0, boolean arg1) {
        field8089++;
        if (class220.field2850.length() == 0) {
            return;
        }
        class79.method660((byte) 78, "--> " + class220.field2850);
        class634.method3626(false, arg1, 79, class220.field2850);
        class176.field2173 = 0;
        class220.field2850 = "";
        if (arg0 == -16392) {
            class603.field8700 = 0;
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)Lwt;", line = 106)
    public final class282 method3273(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field8086 = null;
        }
        field8091++;
        class472 var3 = this.field8086;
        class282 var4;
        synchronized (this.field8086) {
            var4 = (class282) this.field8086.method2766(-121, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class668 var5 = this.field8090;
        byte[] var6;
        synchronized (this.field8090) {
            var6 = this.field8090.method3800(class159.method999(arg0, (byte) 121), class592.method3434(arg0, 82), (byte) -92);
        }
        class282 var7 = new class282();
        var7.field3822 = this;
        var7.field3817 = arg0;
        if (var6 != null) {
            var7.method1694(new class389(var6), 512);
        }
        var7.method1698(-56);
        class472 var8 = this.field8086;
        synchronized (this.field8086) {
            this.field8086.method2772(var7, true, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZI)V", line = 139)
    public static final void method3274(int arg0, boolean arg1, int arg2) {
        field8085++;
        class122 var3 = class673.method3829(1, arg1, arg0);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        if (arg2 != 2) {
            return;
        }
        while (var4 < var3.field1574.length) {
            var3.field1574[var4] = -1;
            var3.field1572[var4] = 0;
            var4++;
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Ler;ILjn;Ljn;Ljn;)V", line = 172)
    public class559(class90 arg0, int arg1, class668 arg2, class668 arg3, class668 arg4) {
        this.field8090 = arg2;
        if (this.field8090 != null) {
            int var6 = this.field8090.method3779(5) - 1;
            this.field8090.method3805(var6, false);
        }
        class484.method2831((byte) 15, arg3, arg4, 2);
    }
}
