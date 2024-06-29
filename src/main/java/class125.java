import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class125 {

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field2872 = 0;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "Lhe;")
    private static class54 field2873 = class6.method58("New User", false);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Lhe;")
    public static class54 field2869 = field2873;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "Lhe;")
    public static class54 field2877 = class6.method58("sl_button", false);

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IZII)V")
    public static final void method955(int arg0, boolean arg1, int arg2, int arg3) {
        field2876++;
        if (arg0 < 128 || arg3 < 128 || arg0 > 13056 || arg3 > 13056) {
            class57.field1422 = -1;
            class16.field485 = -1;
            return;
        }
        int var4 = class134.method1007(arg0, arg3, !arg1, class157.field3573) - arg2;
        int var5 = class152.field3420[class95.field2418];
        int var6 = arg3 - class65.field1561;
        if (arg1) {
            return;
        }
        int var7 = class152.field3416[class39.field1025];
        int var8 = arg0 - class11.field315;
        int var9 = class152.field3420[class39.field1025];
        int var10 = class152.field3416[class95.field2418];
        int var11 = var6 * var7 + var8 * var9 >> 16;
        int var12 = var4 - class93.field2277;
        int var13 = var6 * var9 - var7 * var8 >> 16;
        int var15 = var5 * var12 - var10 * var13 >> 16;
        int var16 = var10 * var12 + var5 * var13 >> 16;
        if (var16 >= 50) {
            class57.field1422 = (var11 << 9) / var16 + 256;
            class16.field485 = (var15 << 9) / var16 + 167;
        } else {
            class57.field1422 = -1;
            class16.field485 = -1;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V")
    public static final void method956(boolean arg0) {
        class136.field3083 = arg0;
        field2875++;
        class118.field2768 = true;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lhe;Lef;ILhe;)[Lce;")
    public static final class20[] method957(class54 arg0, class35 arg1, int arg2, class54 arg3) {
        if (arg2 <= 6) {
            field2873 = null;
        }
        int var4 = arg1.method273(arg3, 1);
        field2871++;
        int var5 = arg1.method267(false, arg0, var4);
        return class52.method364(arg1, var5, var4, (byte) 111);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method958(int arg0) {
        field2877 = null;
        field2873 = null;
        field2869 = null;
        if (arg0 > -2) {
            method957(null, null, 114, null);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IBIIIII)I")
    public static final int method959(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg3 & 0x3;
        if ((arg4 & 0x1) == 1) {
            int var8 = arg0;
            arg0 = arg6;
            arg6 = var8;
        }
        field2874++;
        if (var7 == 0) {
            return arg2;
        } else if (var7 == 1) {
            return arg5;
        } else if (var7 == 2) {
            return 1 + 7 - arg0 - arg2;
        } else if (arg1 == 23) {
            return 1 + 7 - arg6 - arg5;
        } else {
            return -59;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IILjava/awt/Component;I)Ldd;")
    public static final class26 method960(int arg0, int arg1, Component arg2, int arg3) {
        field2878++;
        if (arg0 >= -81) {
            return null;
        }
        try {
            Class var4 = Class.forName("bb");
            class26 var5 = (class26) var4.getDeclaredConstructor().newInstance();
            var5.method82(arg2, arg3, -87, arg1);
            return var5;
        } catch (Throwable var7) {
            class56 var6 = new class56();
            var6.method82(arg2, arg3, -103, arg1);
            return var6;
        }
    }
}
