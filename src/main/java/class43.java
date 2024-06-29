import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class43 {

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "Ldf;")
    public static class51 field687 = class46.method233("k", 100);

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "[I")
    public static int[] field691 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field689 = 0;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "Z")
    public static boolean field690 = false;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "[S")
    public static short[] field692 = new short[256];

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "Ldf;")
    public static class51 field696 = class46.method233("", 100);

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "Ldf;")
    public static class51 field695 = field696;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "Ldf;")
    public static class51 field697 = field696;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIBIIII)V")
    public static final void method219(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field694++;
        if (class28.field408 <= arg0 && class115.field1954 >= arg5 && arg1 >= class36.field542 && class175.field2867 >= arg3) {
            if (arg4 == 1) {
                class179.method1275(arg1, arg5, arg6, arg3, false, arg0);
            } else {
                class264.method1791(0, arg6, arg5, arg3, arg0, arg1, arg4);
            }
        } else if (arg4 == 1) {
            class6.method27(-42, arg3, arg5, arg1, arg6, arg0);
        } else {
            class53.method337(arg6, arg3, arg5, 97, arg4, arg0, arg1);
        }
        if (arg2 >= -70) {
            field696 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)I")
    public static final int method220(int arg0, int arg1) {
        field693++;
        if (arg0 != 841577095) {
            field690 = false;
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ljd;III)V")
    public static final void method221(class83 arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -1) {
            field687 = null;
        }
        field688++;
        if (arg0.field4344 == arg3 && arg3 != -1) {
            class151 var4 = class72.method501(arg3, (byte) 54);
            int var5 = var4.field2534;
            if (var5 == 1) {
                arg0.field4292 = 0;
                arg0.field4321 = arg2;
                arg0.field4342 = 0;
                arg0.field4277 = 0;
                class208.method1433(arg0.field4348, arg0.field4319, 64, arg0.field4277, false, var4);
            }
            if (var5 == 2) {
                arg0.field4342 = 0;
            }
        } else if (arg3 == -1 || arg0.field4344 == -1 || class72.method501(arg3, (byte) 108).field2535 >= class72.method501(arg0.field4344, (byte) 39).field2535) {
            arg0.field4321 = arg2;
            arg0.field4277 = 0;
            arg0.field4344 = arg3;
            arg0.field4292 = 0;
            arg0.field4342 = 0;
            arg0.field4279 = arg0.field4347;
            if (arg0.field4344 == -1) {
                return;
            }
            class208.method1433(arg0.field4348, arg0.field4319, 81, arg0.field4277, false, class72.method501(arg0.field4344, (byte) 119));
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public static void method222(int arg0) {
        field697 = null;
        if (arg0 != 14064) {
            method220(97, 49);
        }
        field695 = null;
        field687 = null;
        field696 = null;
        field691 = null;
        field692 = null;
    }
}
