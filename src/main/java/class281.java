import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class281 {

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "Lmk;")
    public static class154 field3852 = new class154();

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field3854 = -1;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "Lea;")
    public static class57 field3857 = new class57(5000);

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "F")
    public static float field3851;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "Lck;")
    public static class351 field3855;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)Lds;", line = 5)
    public static final class225 method1655(byte arg0, int arg1) {
        field3856++;
        class114 var2 = class200.field2684;
        class225 var3;
        synchronized (class200.field2684) {
            var3 = (class225) class200.field2684.method616(-28, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class393.field5649.method1687(class29.method141(true, arg1), class288.method1709(arg1, -26866), 255);
        class225 var5 = new class225();
        var5.field3051 = arg1;
        if (var4 != null) {
            var5.method1208(new class250(var4), 82);
        }
        var5.method1212((byte) 56);
        if (!class402.field5871 && var5.field3038) {
            var5.field3048 = null;
            var5.field3068 = null;
        }
        if (arg0 != -28) {
            return null;
        }
        if (var5.field3037) {
            var5.field2993 = false;
            var5.field3057 = 0;
        }
        class114 var6 = class200.field2684;
        synchronized (class200.field2684) {
            class200.field2684.method615((byte) -116, (long) arg1, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 48)
    public static void method1656(int arg0) {
        if (arg0 >= -103) {
            method1658(9, (class64) null);
        }
        field3857 = null;
        field3852 = null;
        field3855 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lvm;ILol;IIIII)Llg;", line = 63)
    public static final class20 method1657(class322 arg0, int arg1, class335 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        class291.field3959.field494 = arg1;
        class291.field3959.field501 = arg0.field4307;
        class291.field3959.field491 = arg6;
        field3850++;
        class291.field3959.field499 = arg5;
        class291.field3959.field493 = arg2 != null;
        class291.field3959.field502 = arg7;
        if (arg3 == -10094) {
            class291.field3959.field490 = arg4;
            return (class20) class119.field1482.method705(-28102, class291.field3959);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILle;)V", line = 82)
    public static final void method1658(int arg0, class64 arg1) {
        if (arg1.field667 != null) {
            arg1.field667.field448 = 0;
        }
        if (arg0 >= -84) {
            method1655((byte) -73, 70);
        }
        field3853++;
        arg1.field668 = false;
        for (class64 var2 = arg1.method363(); var2 != null; var2 = arg1.method361()) {
            method1658(-115, var2);
        }
    }
}
