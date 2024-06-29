import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class321 extends class229 {

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "Lff;")
    public static class9 field4438 = new class9(8);

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "Luf;")
    public static class310 field4440 = new class310(97, -1);

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "Lf;")
    public static class529 field4442;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILao;)V", line = 4)
    public final void method22(int arg0, int arg1, class188 arg2) {
        ++field4439;
        if (arg0 > -45) {
            field4440 = null;
        }
        super.field3194.method2412((byte) 4, arg2);
        super.field3194.method2365(true, arg1);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V", line = 17)
    public final void method19(int arg0) {
        if (arg0 != 262144) {
            this.method12(-116, 37, -24);
        }
        super.field3194.method2358(false, true);
        ++field4434;
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lht;)V", line = 29)
    public class321(class410 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(III)V", line = 34)
    public final void method12(int arg0, int arg1, int arg2) {
        int var4 = -81 / ((arg1 - 13) / 46);
        ++field4436;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZZ)V", line = 43)
    public final void method20(boolean arg0, boolean arg1) {
        super.field3194.method2358(arg0, true);
        ++field4441;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIBIZI)V", line = 52)
    public static final void method1812(int arg0, int arg1, byte arg2, int arg3, boolean arg4, int arg5) {
        ++field4435;
        long var6 = (long) (arg5 | (!arg4 ? 0 : Integer.MIN_VALUE));
        class113 var8 = (class113) class151.field2126.method979((byte) 28, var6);
        if (var8 == null) {
            var8 = new class113();
            class151.field2126.method990(var6, (byte) 92, var8);
        }
        if (var8.field1528.length <= arg3) {
            int[] var9 = new int[arg3 + 1];
            int[] var10 = new int[arg3 + 1];
            for (int var11 = 0; var8.field1528.length > var11; ++var11) {
                var9[var11] = var8.field1528[var11];
                var10[var11] = var8.field1529[var11];
            }
            for (int var12 = var8.field1528.length; arg3 > var12; ++var12) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field1528 = var9;
            var8.field1529 = var10;
        }
        var8.field1528[arg3] = arg1;
        int var13 = -29 % ((arg2 - -74) / 36);
        var8.field1529[arg3] = arg0;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)Z", line = 104)
    public final boolean method13(byte arg0) {
        if (arg0 <= 123) {
            field4438 = null;
        }
        ++field4433;
        return true;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V", line = 119)
    public static void method1813(int arg0) {
        if (arg0 < 16) {
            method1813(-94);
        }
        field4438 = null;
        field4442 = null;
        field4440 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZI)V", line = 132)
    public final void method17(boolean arg0, int arg1) {
        ++field4437;
        if (arg1 != -27632) {
            this.method22(-109, -85, (class188) null);
        }
    }
}
