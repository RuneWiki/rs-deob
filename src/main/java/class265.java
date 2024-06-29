import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public abstract class class265 extends class259 {

    @OriginalMember(owner = "client!mg", name = "H", descriptor = "[I")
    public static int[] field4756 = new int[4096];

    @OriginalMember(owner = "client!mg", name = "F", descriptor = "I")
    public static int field4754 = 0;

    @OriginalMember(owner = "client!mg", name = "I", descriptor = "B")
    public static byte field4757;

    @OriginalMember(owner = "client!mg", name = "D", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!mg", name = "E", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!mg", name = "G", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!mg", name = "L", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!mg", name = "M", descriptor = "J")
    public static long field4761;

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "Lel;")
    public static class201 field4759;

    @OriginalMember(owner = "client!mg", name = "J", descriptor = "Lsj;")
    public static class49 field4758;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V")
    public static void method1812(byte arg0) {
        if (arg0 > -83) {
            method1815(124);
        }
        field4756 = null;
        field4759 = null;
        field4758 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIBIIZ)Lal;")
    public static final class231 method1813(int arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5) {
        field4753++;
        if (arg2 != -101) {
            return null;
        }
        int var7 = (arg4 << 19) + (arg1 << 17) + (arg5 ? 65536 : 0) + arg3;
        long var8 = (long) arg0 * 3147483667L + (long) var7 * 3849834839L;
        class231 var10 = (class231) class157.field2861.method670((byte) -127, var8);
        if (var10 != null) {
            return var10;
        }
        class15.field279 = false;
        class231 var11 = class116.method825(arg5, arg1, false, false, arg4, arg0, 7194, arg3);
        if (var11 != null && !class15.field279) {
            class157.field2861.method673(var8, -5087, var11);
        }
        return var11;
    }

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method935(int arg0);

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)V")
    public static final void method1814(byte arg0) {
        if (arg0 >= -8) {
            return;
        }
        field4760++;
        for (int var1 = -1; var1 < class250.field4502; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class82.field1653[var1];
            }
            class108 var6 = class103.field1993[var5];
            if (var6 != null && var6.field1509 > 0) {
                var6.field1509--;
                if (var6.field1509 == 0) {
                    var6.field1552 = null;
                }
            }
        }
        for (int var2 = 0; var2 < class219.field3996; var2++) {
            int var3 = class249.field4492[var2];
            class163 var4 = class60.field1207[var3];
            if (var4 != null && var4.field1509 > 0) {
                var4.field1509--;
                if (var4.field1509 == 0) {
                    var4.field1552 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "(I)V")
    public static final void method1815(int arg0) {
        field4755++;
        if (arg0 > -118) {
            method1813(1, 24, (byte) 8, -110, -47, true);
        }
        class286.field5040.method664(112);
    }

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "(I)Z")
    public abstract boolean method934(int arg0);
}
