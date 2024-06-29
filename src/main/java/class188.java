import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class188 {

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "Lqj;")
    private static class196 field3294 = class80.method502(" from your friend list first)3", -48);

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "[I")
    public static int[] field3295 = new int[32768];

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field3296 = 0;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "Lqj;")
    public static class196 field3290 = field3294;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "[Lbh;")
    public static class153[] field3298 = new class153[4];

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "[I")
    public static int[] field3297;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)Lsc;")
    public static final class212 method1226(int arg0) {
        if (arg0 == -64) {
            field3292++;
            class68 var1 = new class68(class149.field2391, class92.field1347, class234.field4169[0], class240.field4261[0], class77.field1126[0], class31.field392[0], class203.field3645[0], class84.field1237);
            class168.method1099(false);
            return var1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BIIZIII)V")
    public static final void method1227(byte arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class109.field1557 = arg6;
        if (arg0 > -38) {
            field3290 = null;
        }
        class209.field3766 = arg2;
        field3291++;
        class78.field1143 = arg4;
        class118.field1689 = arg1;
        class86.field1273 = arg5;
        if (arg3 && class118.field1689 >= 100) {
            class25.field321 = class209.field3766 * 128 + 64;
            class13.field151 = class86.field1273 * 128 + 64;
            class132.field1889 = class74.method470(class25.field321, class27.field335, 103, class13.field151) - class109.field1557;
        }
        class202.field3597 = 2;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
    public static void method1228(byte arg0) {
        field3297 = null;
        field3295 = null;
        if (arg0 != 66) {
            method1228((byte) -9);
        }
        field3298 = null;
        field3290 = null;
        field3294 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "()V")
    public static final void method1229() {
        for (int var0 = 0; var0 < class150.field2403; var0++) {
            class200 var1 = class229.field4085[var0];
            class118.method711(var1);
            class229.field4085[var0] = null;
        }
        class150.field2403 = 0;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZ)Lqj;")
    public static final class196 method1230(int arg0, boolean arg1) {
        field3293++;
        if (arg1) {
            return arg0 < 999999999 ? class163.method1029(arg0, !arg1) : class181.field3205;
        } else {
            return null;
        }
    }
}
