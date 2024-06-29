import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class143 {

    @OriginalMember(owner = "client!hu", name = "g", descriptor = "Lpja;")
    private class43 field2425 = new class43(64);

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "Lgj;")
    private class662 field2423;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "Lfja;")
    public static class783 field2419 = new class783(56, 1);

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!hu", name = "i", descriptor = "Lvda;")
    public static class195 field2427;

    @OriginalMember(owner = "client!hu", name = "h", descriptor = "[[B")
    public static byte[][] field2426;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Z)V", line = 4)
    public final void method1157(boolean arg0) {
        class43 var2 = this.field2425;
        synchronized (this.field2425) {
            this.field2425.method273(-67);
        }
        if (arg0) {
            field2424++;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)V", line = 18)
    public final void method1158(int arg0, int arg1) {
        field2421++;
        class43 var3 = this.field2425;
        synchronized (this.field2425) {
            this.field2425.method265(arg1, -22);
        }
        if (arg0 != 4271) {
            field2427 = null;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(BI)Lsl;", line = 33)
    public final class485 method1159(byte arg0, int arg1) {
        field2420++;
        class43 var3 = this.field2425;
        class485 var4;
        synchronized (this.field2425) {
            var4 = (class485) this.field2425.method266((byte) -122, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class662 var5 = this.field2423;
        byte[] var6;
        synchronized (this.field2423) {
            var6 = this.field2423.method3732(arg1, 8906, 11);
        }
        class485 var7 = new class485();
        if (var6 != null) {
            var7.method2772((byte) -87, new class93(var6));
        }
        if (arg0 >= -14) {
            field2419 = null;
        }
        class43 var8 = this.field2425;
        synchronized (this.field2425) {
            this.field2425.method270(var7, (long) arg1, -124);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)V", line = 63)
    public final void method1160(byte arg0) {
        field2422++;
        class43 var2 = this.field2425;
        synchronized (this.field2425) {
            int var3 = 11 % ((arg0 + 87) / 33);
            this.field2425.method272(20);
        }
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(B)V", line = 83)
    public static void method1161(byte arg0) {
        field2427 = null;
        field2419 = null;
        if (arg0 != -61) {
            method1161((byte) -50);
        }
        field2426 = null;
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lim;ILgj;)V", line = 101)
    public class143(class598 arg0, int arg1, class662 arg2) {
        this.field2423 = arg2;
        if (this.field2423 != null) {
            this.field2423.method3730((byte) -80, 11);
        }
    }
}
