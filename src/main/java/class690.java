import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class690 extends class600 {

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "Ldc;")
    public static class303 field9784 = new class303(8, 0, 4, 1);

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "Lau;")
    public static class692 field9787 = new class692();

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public static int field9783;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
    public static int field9785;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "Lvj;")
    public class204 field9786;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "[Lj;")
    public class299[] field9788;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IILr;I)Z", line = 4)
    public final boolean method3884(int arg0, int arg1, class98 arg2, int arg3) {
        field9785++;
        if (this.field9788 != null) {
            for (int var5 = 0; var5 < this.field9788.length; var5++) {
                if (this.field9788[var5].method1845(arg0, arg3) && this.field9786.method632(arg0, arg3, arg2, (byte) -6)) {
                    return true;
                }
            }
        }
        if (arg1 > -1) {
            method3885(17, 71, 100, 101, (byte) -123);
        }
        return false;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIB)V", line = 38)
    public static final void method3885(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field9783++;
        class449 var5 = class611.method3463(arg0, (byte) -120, 4);
        var5.method2615((byte) -78);
        var5.field6472 = arg3;
        if (arg4 == 96) {
            var5.field6479 = arg2;
            var5.field6480 = arg1;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V", line = 57)
    public static void method3886(int arg0) {
        field9784 = null;
        if (arg0 == 4) {
            field9787 = null;
        }
    }
}
