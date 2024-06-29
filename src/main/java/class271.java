import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class271 extends class314 {

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "Lud;")
    public class279 field4836;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "Lud;")
    public static class279 field4832 = class130.method1024("logo", 255);

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "[Z")
    public static boolean[] field4834 = new boolean[100];

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "Z")
    public static boolean field4830 = false;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "Lud;")
    public static class279 field4831 = class130.method1024("showVideoAd", 255);

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "Lud;")
    public static class279 field4835 = class130.method1024(")2", 255);

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "Lud;")
    public static class279 field4833 = class130.method1024("Lade Liste der Welten", 255);

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "[S")
    public static short[] field4828 = new short[500];

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "Lud;")
    public static class279 field4838 = class130.method1024("document)3cookie=(R", 255);

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "Lud;")
    public static class279 field4840 = class130.method1024("Liste des serveurs charg-Be", 255);

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V", line = 4)
    public static void method1934(int arg0) {
        field4834 = null;
        field4831 = null;
        field4835 = null;
        field4838 = null;
        field4840 = null;
        field4833 = null;
        field4832 = null;
        if (arg0 != 500) {
            method1935((class239) null, -49);
        }
        field4828 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lqg;I)V", line = 29)
    public static final void method1935(class239 arg0, int arg1) {
        if (arg1 != 100) {
            return;
        }
        field4837++;
        class52 var2 = (class52) class15.field438.method610(arg0.field4197.method2013(97), -1);
        if (var2 == null) {
            return;
        }
        if (var2.field1083 != null) {
            class322.field5630.method1957(var2.field1083);
            var2.field1083 = null;
        }
        var2.method2221(true);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIIII)V", line = 82)
    public static final void method1936(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 >= class249.field4449 && class44.field929 >= arg4 && class135.field2463 <= arg3 && class108.field2002 >= arg5) {
            class59.method533(arg3, arg1, arg5, arg7, 51, arg2, arg4, arg0);
        } else {
            class326.method2282(arg4, arg1, arg0, arg2, arg7, (byte) -61, arg5, arg3);
        }
        if (arg6 == 500) {
            field4829++;
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V", line = 112)
    public class271() {
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lud;I)V", line = 117)
    public class271(class279 arg0, int arg1) {
        this.field4836 = arg0;
    }
}
