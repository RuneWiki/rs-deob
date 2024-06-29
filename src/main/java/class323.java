import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class323 {

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "Lpja;")
    private class43 field4428 = new class43(128);

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "Lgj;")
    private class662 field4427;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field4424 = 1337;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "[Lwo;")
    public static class775[] field4423;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI[BI)[B")
    public static final byte[] method2056(byte arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 != -122) {
            return null;
        }
        field4425++;
        byte[] var4;
        if (arg3 <= 0) {
            var4 = arg2;
        } else {
            var4 = new byte[arg1];
            for (int var5 = 0; var5 < arg1; var5++) {
                var4[var5] = arg2[arg3 + var5];
            }
        }
        class607 var6 = new class607();
        var6.method3449((byte) -115);
        var6.method3451((long) (arg1 * 8), (byte) 99, var4);
        byte[] var7 = new byte[64];
        var6.method3446(arg0 ^ 0xFFFFFFA6, var7, 0);
        return var7;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
    public static void method2057(byte arg0) {
        field4423 = null;
        if (arg0 != 60) {
            method2057((byte) 102);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)Lqw;")
    public final class84 method2058(int arg0, int arg1) {
        field4426++;
        class43 var3 = this.field4428;
        class84 var4;
        synchronized (this.field4428) {
            var4 = (class84) this.field4428.method266((byte) -123, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4427.method3732(class492.method2832(arg0, 255), 8906, class66.method576(1, arg0));
        class84 var6 = new class84();
        if (var5 != null) {
            var6.method673(new class93(var5), 0);
        }
        class43 var7 = this.field4428;
        synchronized (this.field4428) {
            this.field4428.method270(var6, (long) arg0, -128);
        }
        if (arg1 <= 46) {
            method2057((byte) -78);
        }
        return var6;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lim;ILgj;)V")
    public class323(class598 arg0, int arg1, class662 arg2) {
        this.field4427 = arg2;
        if (this.field4427 != null) {
            int var4 = this.field4427.method3723(5) - 1;
            this.field4427.method3730((byte) -88, var4);
        }
    }
}
