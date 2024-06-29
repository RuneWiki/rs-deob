import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class35 {

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "Lpa;")
    private class387 field452 = new class387(128);

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "Lcb;")
    private class544 field454;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "Ljb;")
    public static class517 field456;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB)I", line = 3)
    public static final int method236(int arg0, byte arg1) {
        field455++;
        return arg1 == -30 ? arg0 & 0x7F : 67;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)Ldp;", line = 23)
    public final class3 method237(int arg0, int arg1) {
        field453++;
        class387 var3 = this.field452;
        class3 var4;
        synchronized (this.field452) {
            var4 = (class3) this.field452.method2373((long) arg0, 103);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field454.method3150(class599.method3469(arg0, 255), 105, class390.method2386(arg0, (byte) -54));
        class3 var6 = new class3();
        if (arg1 != 127) {
            method236(5, (byte) -24);
        }
        if (var5 != null) {
            var6.method21(new class120(var5), -1);
        }
        class387 var7 = this.field452;
        synchronized (this.field452) {
            this.field452.method2362(var6, 0, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V", line = 54)
    public static void method238(int arg0) {
        field456 = null;
        if (arg0 != 27975) {
            field456 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Liv;ILcb;)V", line = 69)
    public class35(class106 arg0, int arg1, class544 arg2) {
        this.field454 = arg2;
        if (this.field454 != null) {
            int var4 = this.field454.method3136(false) - 1;
            this.field454.method3147(var4, -108);
        }
    }
}
