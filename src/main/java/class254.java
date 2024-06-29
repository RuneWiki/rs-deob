import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class254 {

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "Lqr;")
    public class65 field3496 = new class65(20);

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "Lqr;")
    private class65 field3497 = new class65(64);

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "Lwu;")
    private class376 field3492;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "Lwu;")
    public class376 field3490;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "Lwu;")
    public static class376 field3491;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)Lec;", line = 3)
    public final class237 method1549(int arg0, int arg1) {
        field3495++;
        class65 var3 = this.field3497;
        class237 var4;
        synchronized (this.field3497) {
            var4 = (class237) this.field3497.method552(4, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class376 var5 = this.field3492;
        byte[] var6;
        synchronized (this.field3492) {
            var6 = this.field3492.method2218((byte) 123, 46, arg1);
        }
        if (arg0 != 64) {
            return null;
        }
        class237 var7 = new class237();
        var7.field3347 = this;
        if (var6 != null) {
            var7.method1488(new class677(var6), (byte) 89);
        }
        class65 var8 = this.field3497;
        synchronized (this.field3497) {
            this.field3497.method556((byte) 0, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)V", line = 42)
    public final void method1550(int arg0, int arg1) {
        field3493++;
        class65 var3 = this.field3497;
        synchronized (this.field3497) {
            this.field3497.method553(arg0, -15782);
        }
        if (arg1 == 46) {
            class65 var4 = this.field3496;
            synchronized (this.field3496) {
                this.field3496.method553(arg0, -15782);
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V", line = 59)
    public static void method1551(byte arg0) {
        if (arg0 == -62) {
            field3491 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)V", line = 70)
    public final void method1552(byte arg0) {
        if (arg0 != -58) {
            method1551((byte) 67);
        }
        field3494++;
        class65 var2 = this.field3497;
        synchronized (this.field3497) {
            this.field3497.method561((byte) -78);
        }
        class65 var3 = this.field3496;
        synchronized (this.field3496) {
            this.field3496.method561((byte) -78);
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)V", line = 90)
    public final void method1553(byte arg0) {
        class65 var2 = this.field3497;
        synchronized (this.field3497) {
            this.field3497.method558(0);
        }
        field3489++;
        class65 var3 = this.field3496;
        synchronized (this.field3496) {
            this.field3496.method558(0);
            int var4 = 24 % ((arg0 + 66) / 39);
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lms;ILwu;Lwu;)V", line = 113)
    public class254(class763 arg0, int arg1, class376 arg2, class376 arg3) {
        this.field3492 = arg2;
        this.field3490 = arg3;
        this.field3492.method2195(46, 0);
    }
}
