import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oha")
public class class743 {

    @OriginalMember(owner = "client!oha", name = "i", descriptor = "Lqr;")
    private class65 field10331 = new class65(64);

    @OriginalMember(owner = "client!oha", name = "e", descriptor = "Lwu;")
    private class376 field10327;

    @OriginalMember(owner = "client!oha", name = "d", descriptor = "Lkaa;")
    public static class47 field10326 = new class47(73, 7);

    @OriginalMember(owner = "client!oha", name = "g", descriptor = "Z")
    public static boolean field10329 = false;

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "I")
    public static int field10324;

    @OriginalMember(owner = "client!oha", name = "c", descriptor = "I")
    public static int field10325;

    @OriginalMember(owner = "client!oha", name = "f", descriptor = "I")
    public static int field10328;

    @OriginalMember(owner = "client!oha", name = "h", descriptor = "I")
    public static int field10330;

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "[Lhu;")
    public static class133[] field10323;

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(Z)V", line = 5)
    public static void method4147(boolean arg0) {
        field10326 = null;
        if (arg0) {
            method4147(true);
        }
        field10323 = null;
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(IB)V", line = 17)
    public final void method4148(int arg0, byte arg1) {
        field10330++;
        class65 var3 = this.field10331;
        synchronized (this.field10331) {
            this.field10331.method553(arg0, -15782);
            if (arg1 != -49) {
                this.method4151((byte) -91);
            }
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(II)Lmia;", line = 31)
    public final class62 method4149(int arg0, int arg1) {
        if (arg0 != -6119) {
            this.method4149(44, -45);
        }
        field10325++;
        class65 var3 = this.field10331;
        class62 var4;
        synchronized (this.field10331) {
            var4 = (class62) this.field10331.method552(4, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class376 var5 = this.field10327;
        byte[] var6;
        synchronized (this.field10327) {
            var6 = this.field10327.method2218((byte) 118, 11, arg1);
        }
        class62 var7 = new class62();
        if (var6 != null) {
            var7.method538(new class677(var6), true);
        }
        class65 var8 = this.field10331;
        synchronized (this.field10331) {
            this.field10331.method556((byte) 0, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(I)V", line = 68)
    public final void method4150(int arg0) {
        if (arg0 > -12) {
            method4147(false);
        }
        class65 var2 = this.field10331;
        synchronized (this.field10331) {
            this.field10331.method558(0);
        }
        field10324++;
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(B)V", line = 83)
    public final void method4151(byte arg0) {
        class65 var2 = this.field10331;
        synchronized (this.field10331) {
            this.field10331.method561((byte) -78);
            if (arg0 != 126) {
                field10323 = null;
            }
        }
        field10328++;
    }

    @OriginalMember(owner = "client!oha", name = "<init>", descriptor = "(Lms;ILwu;)V", line = 111)
    public class743(class763 arg0, int arg1, class376 arg2) {
        this.field10327 = arg2;
        if (this.field10327 != null) {
            this.field10327.method2195(11, 0);
        }
    }
}
