import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public abstract class class255 {

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "Lqk;")
    public static class207 field4564 = class24.method212(255, "Fertigkeit: ");

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "Z")
    public static boolean field4567 = false;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "Lqk;")
    private static class207 field4569 = class24.method212(255, "Loaded sprites");

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "Lqk;")
    public static class207 field4572 = field4569;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "Lle;")
    public static class42 field4566;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "[[[B")
    public static byte[][][] field4563;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
    public static final void method1772(int arg0) {
        class227.field4162 = new class220[class154.field2670.method720(19680)][];
        class165.field2923 = new boolean[class154.field2670.method720(arg0 + 628)];
        if (arg0 == 19052) {
            field4568++;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method1694(int arg0, Component arg1);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)I")
    public abstract int method1693(boolean arg0);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method1695(Component arg0, byte arg1);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lwd;IZIIII)Z")
    public static final boolean method1773(class22 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field4571++;
        class13 var7 = class164.method1186(arg0.field386, (byte) 44);
        if (var7.field188 == -1) {
            return true;
        }
        int var8;
        if (arg0.field419) {
            int var9 = arg0.field364 + arg1;
            var8 = var9 & 0x3;
        } else {
            var8 = 0;
        }
        class130 var10 = var7.method74(11230, var8);
        if (var10 == null) {
            return false;
        }
        int var11 = arg0.field392;
        int var12 = var10.field663;
        int var13 = arg0.field414;
        if (arg2) {
            return true;
        }
        if ((var8 & 0x1) == 1) {
            var11 = arg0.field414;
            var13 = arg0.field392;
        }
        int var14 = var10.field669;
        if (var7.field180) {
            var12 = var11 * 4;
            var14 = var13 * 4;
        }
        if (var7.field185 == 0) {
            var10.method916(arg6 * 4 + 48, (-arg5 + 104 + -var13) * 4 + 48, var12, var14);
        } else {
            var10.method909(arg6 * 4 + 48, (-var13 + 104 + -arg5) * 4 + 48, var12, var14, var7.field185);
        }
        return true;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIBII)V")
    public static final void method1774(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        client.field2680[0].method247(arg0, arg4);
        field4573++;
        client.field2680[1].method247(arg0, arg1 + arg4 - 16);
        int var6 = (arg1 - 32) * arg1 / arg5;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg1 - var6 - 32) * arg2 / (arg5 - arg1);
        if (arg3 >= -24) {
            field4572 = null;
        }
        class23.method167(arg0, arg4 + 16, 16, arg1 - 32, class223.field4082);
        class23.method167(arg0, arg4 + var7 + 16, 16, var6, class182.field3239);
        class23.method146(arg0, arg4 + var7 + 16, var6, class41.field822);
        class23.method146(arg0 + 1, arg4 - -16 - -var7, var6, class41.field822);
        class23.method161(arg0, var7 + arg4 + 16, 16, class41.field822);
        class23.method161(arg0, arg4 + var7 + 17, 16, class41.field822);
        class23.method146(arg0 + 15, arg4 - -16 + var7, var6, class196.field3452);
        class23.method146(arg0 + 14, arg4 - -17 - -var7, var6 - 1, class196.field3452);
        class23.method161(arg0, var7 + arg4 + var6 + 15, 16, class196.field3452);
        class23.method161(arg0 + 1, arg4 - (-var7 - var6) + 14, 15, class196.field3452);
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V")
    public static void method1775(int arg0) {
        field4572 = null;
        field4569 = null;
        field4563 = null;
        if (arg0 > -63) {
            method1772(-110);
        }
        field4566 = null;
        field4564 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BLv;)Llc;")
    public static final class83 method1776(byte arg0, class149 arg1) {
        class83 var2 = new class83();
        field4570++;
        if (arg0 != 39) {
            field4572 = null;
        }
        var2.field1524 = arg1.method1050(1272006568);
        var2.field1528 = class83.method621(var2.field1524, -56);
        return var2;
    }
}
