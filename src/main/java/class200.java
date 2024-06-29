import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class200 {

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "Lgg;")
    private class114 field2562 = new class114(64);

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "Lkha;")
    private class687 field2556;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "Lmq;")
    public static class78 field2554 = new class78(21, 3);

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "Lqia;")
    public static class547 field2561 = new class547();

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "Lmq;")
    public static class78 field2564 = new class78(16, 2);

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "F")
    public static float field2563;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IB)V", line = 3)
    public final void method1245(int arg0, byte arg1) {
        field2555++;
        int var3 = -6 / ((90 - arg1) / 33);
        class114 var4 = this.field2562;
        synchronized (this.field2562) {
            this.field2562.method775(1, arg0);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V", line = 17)
    public final void method1246(int arg0) {
        field2559++;
        class114 var2 = this.field2562;
        synchronized (this.field2562) {
            this.field2562.method781((byte) 47);
            if (arg0 >= -113) {
                method1249(-9);
            }
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)Las;", line = 36)
    public final class572 method1247(int arg0, int arg1) {
        field2553++;
        class114 var3 = this.field2562;
        class572 var4;
        synchronized (this.field2562) {
            var4 = (class572) this.field2562.method778((long) arg1, -60);
        }
        if (var4 != null) {
            return var4;
        }
        class687 var5 = this.field2556;
        byte[] var6;
        synchronized (this.field2556) {
            var6 = this.field2556.method3810(35, -23360, arg1);
        }
        class572 var7 = new class572();
        if (var6 != null) {
            var7.method3213(127, new class179(var6));
        }
        var7.method3214(true);
        class114 var8 = this.field2562;
        synchronized (this.field2562) {
            this.field2562.method774((long) arg1, 114, var7);
            if (arg0 >= -57) {
                method1249(-82);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V", line = 74)
    public final void method1248(int arg0) {
        int var2 = 70 % ((arg0 + 59) / 51);
        class114 var3 = this.field2562;
        synchronized (this.field2562) {
            this.field2562.method776((byte) 99);
        }
        field2560++;
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)V", line = 86)
    public static void method1249(int arg0) {
        field2561 = null;
        field2564 = null;
        field2554 = null;
        if (arg0 != 64) {
            method1249(-34);
        }
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Ldh;ILkha;)V", line = 113)
    public class200(class286 arg0, int arg1, class687 arg2) {
        this.field2556 = arg2;
        if (this.field2556 != null) {
            this.field2556.method3812(0, 35);
        }
    }
}
