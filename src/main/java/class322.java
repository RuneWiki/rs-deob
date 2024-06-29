import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class322 {

    @OriginalMember(owner = "client!km", name = "b", descriptor = "Lvh;")
    private class328 field4755 = new class328(64);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "Lpj;")
    private class132 field4754;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public int field4758;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "[C")
    public static char[] field4756 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!km", name = "g", descriptor = "[[B")
    public static byte[][] field4760 = new byte[1000][];

    @OriginalMember(owner = "client!km", name = "d", descriptor = "Luc;")
    public static class27 field4757 = new class27(48, 6);

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)V", line = 7)
    public static void method1957(boolean arg0) {
        if (arg0) {
            field4756 = null;
            field4757 = null;
            field4760 = null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II)Lrba;", line = 33)
    public final class396 method1958(int arg0, int arg1) {
        field4759++;
        class328 var3 = this.field4755;
        class396 var4;
        synchronized (this.field4755) {
            var4 = (class396) this.field4755.method1986((byte) -87, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class132 var5 = this.field4754;
        byte[] var6;
        synchronized (this.field4754) {
            var6 = this.field4754.method940(19, arg1, 0);
        }
        class396 var7 = new class396();
        if (var6 != null) {
            var7.method2254(new class96(var6), -1);
        }
        class328 var8 = this.field4755;
        synchronized (this.field4755) {
            if (arg0 != 28059) {
                this.method1958(107, 77);
            }
            this.field4755.method1985(var7, (long) arg1, (byte) -102);
            return var7;
        }
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Ldd;ILpj;)V", line = 69)
    public class322(class647 arg0, int arg1, class132 arg2) {
        this.field4754 = arg2;
        this.field4758 = this.field4754.method936(19, -113);
    }
}
