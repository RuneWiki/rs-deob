import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class204 {

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "Lbd;")
    public static class81 field3282 = new class81();

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3286 = "Face here";

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field3288 = 0;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "Lic;")
    public static class160 field3287 = new class160(64);

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "[I")
    public static int[] field3289;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1375(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class114 var7 = class129.method939(arg2, 36, arg5);
        if (var7 != null && var7.field1924 != null) {
            class196 var8 = new class196();
            var8.field3213 = var7;
            var8.field3205 = var7.field1924;
            class129.method938(-80, var8);
        }
        class7.field90 = arg5;
        if (arg0 != 1) {
            return;
        }
        class111.field1708 = arg4;
        class172.field2912 = arg6;
        field3283++;
        class33.field550 = arg2;
        class239.field3761 = true;
        class110.field1702 = arg1;
        class96.field1494 = arg3;
        class72.method556(0, var7);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public static final void method1376(int arg0) {
        if (arg0 != 0) {
            field3287 = null;
        }
        class23.field350.method1157(760);
        field3281++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZI)V")
    public static final void method1377(boolean arg0, int arg1) {
        field3284++;
        class260.method1738(true);
        if (class146.field2401 != 30 && class146.field2401 != 25) {
            return;
        }
        class198.field3229++;
        if (class198.field3229 < 50 && !arg0) {
            return;
        }
        class198.field3229 = 0;
        if (arg1 > -23) {
            field3288 = -42;
        }
        if (!class48.field881 && class23.field360 != null) {
            class118.field1995++;
            class87.field1405.method607(242, (byte) 62);
            try {
                class23.field360.method301(class87.field1405.field2231, 0, class87.field1405.field2263, (byte) 123);
                class87.field1405.field2231 = 0;
            } catch (IOException var2) {
                class48.field881 = true;
            }
        }
        class260.method1738(true);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public static void method1378(byte arg0) {
        field3289 = null;
        field3287 = null;
        field3286 = null;
        if (arg0 != -5) {
            field3289 = null;
        }
        field3282 = null;
    }
}
