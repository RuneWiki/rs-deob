import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class246 {

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "[Lhb;")
    private class28[] field4279;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field4281 = 0;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "Lvf;")
    public static class265 field4283 = class87.method582(-46, "comp-Btence ");

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "Lvf;")
    public static class265 field4280 = class87.method582(-46, "Hidden)2use");

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "Lsb;")
    public static class92 field4277;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "[Z")
    public static boolean[] field4282;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)V")
    public static void method1630(boolean arg0) {
        field4280 = null;
        if (arg0) {
            field4283 = null;
            field4277 = null;
            field4282 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public static final void method1631(int arg0) {
        class38.field879 = null;
        class149.field2770 = null;
        if (arg0 != -103) {
            field4281 = -61;
        }
        field4278++;
        class182.field3242 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method1632(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4284++;
        if (arg4 >= 1 && arg3 >= 1 && arg4 <= 102 && arg3 <= 102) {
            if (!class231.method1561(25088) && (class230.field4064[0][arg4][arg3] & 0x2) == 0) {
                int var8 = arg2;
                if ((class230.field4064[arg2][arg4][arg3] & 0x8) != 0) {
                    var8 = 0;
                }
                if (class58.field1181 != var8) {
                    return;
                }
            }
            int var9 = arg2;
            if (arg2 < 3 && (class230.field4064[1][arg4][arg3] & 0x2) == 2) {
                var9 = arg2 + 1;
            }
            class67.method482((byte) -107, arg2, arg4, arg3, var9, class130.field2279[arg2], arg0);
            if (arg6 >= 0) {
                boolean var10 = client.field3855;
                client.field3855 = true;
                class164.method1083(false, arg6, false, 27, arg2, arg7, arg4, class130.field2279[arg2], var9, arg5, arg3);
                client.field3855 = var10;
            }
        }
        int var11 = 30 % ((arg1 - 67) / 57);
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(I)V")
    public class246(int arg0) {
        this.field4279 = new class28[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class28 var3 = this.field4279[var2] = new class28();
            var3.field729 = var3;
            var3.field733 = var3;
        }
    }
}
