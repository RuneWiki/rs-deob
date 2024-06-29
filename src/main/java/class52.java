import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class52 {

    @OriginalMember(owner = "client!u", name = "g", descriptor = "Ljp;")
    private class236 field814 = new class236(128);

    @OriginalMember(owner = "client!u", name = "b", descriptor = "Lpc;")
    private class473 field809;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field808 = 0;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "[I")
    public static int[] field815 = new int[14];

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V", line = 7)
    public static void method384(int arg0) {
        field815 = null;
        if (arg0 != -31223) {
            method384(26);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V", line = 17)
    public final void method385(byte arg0) {
        class236 var2 = this.field814;
        synchronized (this.field814) {
            if (arg0 != -69) {
                this.field809 = null;
            }
            this.field814.method1459(19088);
        }
        field811++;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZI)Lhr;", line = 33)
    public final class363 method386(boolean arg0, int arg1) {
        field813++;
        class236 var3 = this.field814;
        class363 var4;
        synchronized (this.field814) {
            var4 = (class363) this.field814.method1456((long) arg1, 109);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0) {
            this.method388(true, 44);
        }
        byte[] var5 = this.field809.method2708(1, arg1, (byte) 54);
        class363 var6 = new class363();
        if (var5 != null) {
            var6.method2121((byte) -33, new class379(var5));
        }
        class236 var7 = this.field814;
        synchronized (this.field814) {
            this.field814.method1462(var6, (long) arg1, -97);
            return var6;
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lrb;ILpc;)V", line = 83)
    public class52(class234 arg0, int arg1, class473 arg2) {
        this.field809 = arg2;
        this.field809.method2710(1, (byte) -108);
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(B)V", line = 71)
    public final void method387(byte arg0) {
        if (arg0 >= -52) {
            return;
        }
        class236 var2 = this.field814;
        synchronized (this.field814) {
            this.field814.method1458((byte) -88);
        }
        field812++;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(ZI)V", line = 99)
    public final void method388(boolean arg0, int arg1) {
        field810++;
        class236 var3 = this.field814;
        synchronized (this.field814) {
            this.field814.method1461(-5, arg1);
            if (arg0) {
                this.method387((byte) -54);
            }
        }
    }
}
