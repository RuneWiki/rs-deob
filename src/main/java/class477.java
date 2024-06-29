import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class477 {

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "Lng;")
    private class226 field7012 = new class226(64);

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "Lic;")
    private class491 field7014;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public int field7009;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "Llt;")
    public static class475 field7011 = new class475(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field7008;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field7010;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field7013;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2842(int arg0) {
        class291.method1861((byte) -104, class177.field2611);
        field7013++;
        class162.field2369++;
        class356.field5471.method1410(0, arg0 + 3610);
        if (arg0 != -31255) {
            field7011 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)Luj;", line = 17)
    public final class259 method2843(byte arg0, int arg1) {
        if (arg0 <= 126) {
            this.field7012 = null;
        }
        field7008++;
        class226 var3 = this.field7012;
        class259 var4;
        synchronized (this.field7012) {
            var4 = (class259) this.field7012.method1536((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field7014.method2945(19, arg1, true);
        class259 var6 = new class259();
        if (var5 != null) {
            var6.method1720(52, new class209(var5));
        }
        class226 var7 = this.field7012;
        synchronized (this.field7012) {
            this.field7012.method1542(var6, (byte) 112, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)Lkl;", line = 47)
    public static final class54 method2844(int arg0, byte arg1) {
        field7010++;
        class54 var2 = (class54) class143.field2145.method1536((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        int var3 = 22 / ((-arg1 - 69) / 40);
        byte[] var4 = class381.field5779.method2945(0, arg0, true);
        class54 var5 = new class54();
        if (var4 != null) {
            var5.method330(arg0, new class209(var4), -90);
        }
        class143.field2145.method1542(var5, (byte) 112, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V", line = 76)
    public static void method2845(byte arg0) {
        if (arg0 > -26) {
            method2845((byte) 42);
        }
        field7011 = null;
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lai;ILic;)V", line = 95)
    public class477(class423 arg0, int arg1, class491 arg2) {
        this.field7014 = arg2;
        this.field7009 = this.field7014.method2942(false, 19);
    }
}
