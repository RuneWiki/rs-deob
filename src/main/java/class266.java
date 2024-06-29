import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class266 {

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "Lpca;")
    private class653 field3355 = new class653(64);

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "Ljo;")
    private class303 field3353;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "Ljo;")
    private class303 field3351;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "Lpr;")
    public static class407 field3349 = new class407(32, 2);

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "Lbca;")
    public static class604 field3354 = new class604("", 10);

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "Lpr;")
    public static class407 field3356 = new class407(41, 8);

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "Z")
    public static boolean field3357 = false;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "Loa;")
    public static class635 field3350;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IB)Liq;", line = 10)
    public final class553 method1506(int arg0, byte arg1) {
        field3352++;
        class553 var3 = (class553) this.field3355.method3690((byte) -40, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field3351.method1719(arg0 & 0x7FFF, 0, 4);
        } else {
            var4 = this.field3353.method1719(arg0, 0, arg1 ^ 0x71);
        }
        if (arg1 != 117) {
            return null;
        }
        class553 var5 = new class553();
        if (var4 != null) {
            var5.method3118(arg1 - 118, new class452(var4));
        }
        if (arg0 >= 32768) {
            var5.method3119((byte) -100);
        }
        this.field3355.method3683(var5, (byte) -47, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)V", line = 63)
    public static void method1507(boolean arg0) {
        field3350 = null;
        if (arg0) {
            method1507(false);
        }
        field3356 = null;
        field3349 = null;
        field3354 = null;
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(ILjo;Ljo;)V", line = 87)
    public class266(int arg0, class303 arg1, class303 arg2) {
        this.field3353 = arg1;
        this.field3351 = arg2;
        if (this.field3353 != null) {
            this.field3353.method1727(-77, 0);
        }
        if (this.field3351 != null) {
            this.field3351.method1727(-77, 0);
        }
    }
}
