import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public abstract class class523 extends class267 {

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "[Lmaa;")
    public static class473[] field7321 = new class473[37];

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "[I")
    public static int[] field7322 = new int[13];

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field7323;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field7324;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)Z")
    public static final boolean method3035(int arg0, int arg1) {
        field7324++;
        if (arg0 >= -15) {
            method3037(45);
        }
        return arg1 == 45 || arg1 == 10 || arg1 == 11 || arg1 == 15 || arg1 == 22 || arg1 == 20 || arg1 == 6;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILwg;)Z")
    public static final boolean method3036(int arg0, class428 arg1) {
        field7323++;
        if (arg1 == null) {
            return false;
        } else {
            if (arg0 < 113) {
                method3035(50, 60);
            }
            return class25.method170(-127, arg1.field5731, arg1.field5733, arg1.field5736, arg1.field5726 - arg1.field5733, arg1.field5724 - arg1.field5731, arg1.field5730 - arg1.field5736);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Lkk;")
    public abstract class193 method420(int arg0);

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public static void method3037(int arg0) {
        field7322 = null;
        field7321 = null;
        if (arg0 != 7811) {
            method3036(-47, null);
        }
    }
}
