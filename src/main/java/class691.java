import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class691 {

    @OriginalMember(owner = "client!eba", name = "g", descriptor = "Ltq;")
    private class536 field8885 = new class536(64);

    @OriginalMember(owner = "client!eba", name = "h", descriptor = "Lwm;")
    private class30 field8886;

    @OriginalMember(owner = "client!eba", name = "f", descriptor = "Lwm;")
    public class30 field8884;

    @OriginalMember(owner = "client!eba", name = "i", descriptor = "I")
    public static int field8887 = 0;

    @OriginalMember(owner = "client!eba", name = "c", descriptor = "Luw;")
    public static class208 field8881 = new class208(112, 0);

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "I")
    public static int field8880;

    @OriginalMember(owner = "client!eba", name = "d", descriptor = "I")
    public static int field8882;

    @OriginalMember(owner = "client!eba", name = "e", descriptor = "I")
    public static int field8883;

    @OriginalMember(owner = "client!eba", name = "j", descriptor = "I")
    public static int field8888;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "Z")
    public static boolean field8879;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)V", line = 4)
    public final void method3695(byte arg0) {
        field8880++;
        int var2 = 64 / ((-arg0 - 20) / 33);
        class536 var3 = this.field8885;
        synchronized (this.field8885) {
            this.field8885.method2932((byte) 80);
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)V", line = 18)
    public static void method3696(int arg0) {
        if (arg0 != 64) {
            method3696(96);
        }
        field8881 = null;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(II)V", line = 28)
    public final void method3697(int arg0, int arg1) {
        field8888++;
        class536 var3 = this.field8885;
        synchronized (this.field8885) {
            this.field8885.method2928(true, arg0);
            if (arg1 != 112) {
                field8887 = 8;
            }
        }
    }

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "(B)V", line = 42)
    public final void method3698(byte arg0) {
        if (arg0 != -78) {
            this.field8884 = null;
        }
        class536 var2 = this.field8885;
        synchronized (this.field8885) {
            this.field8885.method2919(0);
        }
        field8882++;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IB)Lrba;", line = 69)
    public final class562 method3699(int arg0, byte arg1) {
        field8883++;
        if (arg1 != -56) {
            this.method3698((byte) -85);
        }
        class536 var3 = this.field8885;
        class562 var4;
        synchronized (this.field8885) {
            var4 = (class562) this.field8885.method2931((long) arg0, (byte) -105);
        }
        if (var4 != null) {
            return var4;
        }
        class30 var5 = this.field8886;
        byte[] var6;
        synchronized (this.field8886) {
            var6 = this.field8886.method139(3, (byte) -94, arg0);
        }
        class562 var7 = new class562();
        var7.field7152 = this;
        if (var6 != null) {
            var7.method3043(new class234(var6), -47);
        }
        class536 var8 = this.field8885;
        synchronized (this.field8885) {
            this.field8885.method2918((long) arg0, var7, 119);
            return var7;
        }
    }

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lega;ILwm;Lwm;)V", line = 103)
    public class691(class473 arg0, int arg1, class30 arg2, class30 arg3) {
        this.field8886 = arg2;
        this.field8884 = arg3;
        this.field8886.method138(0, 3);
    }
}
