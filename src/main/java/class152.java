import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public abstract class class152 {

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2598 = "Loading fonts - ";

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
    public static int field2601 = 3;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "Lek;")
    public static class206 field2597;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IBLek;)Lod;", line = 6)
    public static final class30 method1085(int arg0, byte arg1, class206 arg2) {
        field2593++;
        byte[] var3 = arg2.method1407(-95, arg0);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 <= 124) {
                method1085(27, (byte) 21, (class206) null);
            }
            return new class30(var3);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V", line = 28)
    public static final void method1086(int arg0) {
        field2595++;
        class287.field4695.method889((byte) 30);
        if (arg0 != 3) {
            method1087(42);
        }
        class140.field2375.method889((byte) 26);
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V", line = 40)
    public static void method1087(int arg0) {
        field2597 = null;
        if (arg0 >= -73) {
            field2597 = (class206) null;
        }
        field2598 = null;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "()Z", line = 53)
    public boolean method418() {
        field2596++;
        return false;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lml;IIIZ)V", line = 67)
    public void method426(class152 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2600++;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(III)Lml;", line = 77)
    public class152 method397(int arg0, int arg1, int arg2) {
        field2599++;
        return this;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIIIIJILgl;)V")
    public abstract void method327(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class214 arg10);

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "()I")
    public abstract int method340();

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIII)V")
    public abstract void method334(int arg0, int arg1, int arg2, int arg3, int arg4);
}
