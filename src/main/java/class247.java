import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class247 {

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "Lnb;")
    public static class223 field3881 = new class223();

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3887 = " is already on your friend list.";

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "Z")
    public static boolean field3884 = false;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "Lgi;")
    public static class164 field3885;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field3882;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    public static final void method1670(int arg0) {
        class192.field3135.method1876((byte) 122);
        field3888++;
        if (arg0 != 13) {
            field3884 = false;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
    public static final void method1671(String arg0, boolean arg1, int arg2) {
        field3883++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class207.field3313.method520(arg0, 250);
        int var7 = class207.field3313.method504(arg0, 250) * 13;
        if (arg2 != -436) {
            field3882 = null;
        }
        class94.method660(var5 - var3, -var3 + var4, var6 - (-var3 - var3), var3 + var7 - -var3, 0);
        class94.method670(var5 - var3, -var3 + var4, var3 + var3 + var6, var7 - -var3 + var3, 16777215);
        class207.field3313.method511(arg0, var5, var4, var6, var7, 16777215, -1, 1, 1, 0);
        class110.method773(true, var4 - var3, var5 - var3, var6 + var3 + var3, var3 + var3 + var7);
        if (!arg1) {
            class304.method2071(var7, var5, var6, arg2 + 436, var4);
            return;
        }
        try {
            Graphics var8 = class122.field1926.getGraphics();
            class296.field4829.method973(0, var8, 0, false);
        } catch (Exception var9) {
            class122.field1926.repaint();
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIBIII)V")
    public static final void method1672(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        class162.field2639[0].method13(arg5, arg4);
        field3886++;
        int var6 = (arg1 - 32) * arg1 / arg0;
        class162.field2639[1].method13(arg5, arg4 + arg1 - 16);
        if (var6 < 8) {
            var6 = 8;
        }
        if (arg2 != 37) {
            return;
        }
        int var7 = (arg1 - var6 - 32) * arg3 / (arg0 - arg1);
        class94.method660(arg5, arg4 + 16, 16, arg1 - 32, class86.field1361);
        class94.method660(arg5, arg4 - (-var7 - 16), 16, var6, class116.field1790);
        class94.method663(arg5, arg4 + var7 + 16, var6, class70.field1120);
        class94.method663(arg5 + 1, arg4 - -var7 + 16, var6, class70.field1120);
        class94.method675(arg5, arg4 + var7 + 16, 16, class70.field1120);
        class94.method675(arg5, arg4 + var7 + 17, 16, class70.field1120);
        class94.method663(arg5 + 15, arg4 - -16 + var7, var6, class103.field1631);
        class94.method663(arg5 + 14, arg4 + 17 - -var7, var6 - 1, class103.field1631);
        class94.method675(arg5, arg4 + var7 + var6 + 15, 16, class103.field1631);
        class94.method675(arg5 + 1, 14 - -var7 + arg4 - -var6, 15, class103.field1631);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)V")
    public static void method1673(boolean arg0) {
        if (!arg0) {
            method1670(-39);
        }
        field3881 = null;
        field3887 = null;
        field3882 = null;
        field3885 = null;
    }
}
