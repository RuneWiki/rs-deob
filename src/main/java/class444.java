import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class444 {

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "Lad;")
    private class19 field6262 = new class19(64);

    @OriginalMember(owner = "client!dga", name = "d", descriptor = "Ltf;")
    private class701 field6264;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "Ltf;")
    private class701 field6261;

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "[Z")
    public static boolean[] field6263 = new boolean[100];

    @OriginalMember(owner = "client!dga", name = "f", descriptor = "Lcq;")
    public static class110 field6266 = new class110(48, 12);

    @OriginalMember(owner = "client!dga", name = "e", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!dga", name = "g", descriptor = "I")
    public static int field6267;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(I)V")
    public static void method2571(int arg0) {
        int var1 = 65 / ((-arg0 - 41) / 34);
        field6266 = null;
        field6263 = null;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZI)Lvr;")
    public final class258 method2572(boolean arg0, int arg1) {
        field6267++;
        class258 var3 = (class258) this.field6262.method78(0, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = this.field6264.method3854((byte) 120, 0, arg1);
        } else {
            var4 = this.field6261.method3854((byte) 83, 0, arg1 & 0x7FFF);
        }
        if (!arg0) {
            return null;
        }
        class258 var5 = new class258();
        if (var4 != null) {
            var5.method1528(false, new class115(var4));
        }
        if (arg1 >= 32768) {
            var5.method1533(32768);
        }
        this.field6262.method92(1, (long) arg1, var5);
        return var5;
    }

    @OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(ILtf;Ltf;)V")
    public class444(int arg0, class701 arg1, class701 arg2) {
        this.field6264 = arg1;
        this.field6261 = arg2;
        if (this.field6264 != null) {
            this.field6264.method3883(0, 0);
        }
        if (this.field6261 != null) {
            this.field6261.method3883(0, 0);
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIIII)V")
    public static final void method2573(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= class412.field5526 && class72.field740 >= arg3) {
            int var5 = class266.method1567(class93.field949, true, class360.field4834, arg1);
            int var6 = class266.method1567(class93.field949, true, class360.field4834, arg4);
            class603.method3372(arg3, var5, 2, var6, arg2);
        }
        if (arg0 > -73) {
            field6266 = null;
        }
        field6265++;
    }
}
