import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class244 {

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "[I")
    public static int[] field3024 = new int[4];

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "Ldw;")
    public class125 field3025;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V", line = 5)
    public static void method1451(byte arg0) {
        field3024 = null;
        if (arg0 >= -56) {
            method1452(-19, 89, null, 24);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IILkp;I)V", line = 15)
    public static final void method1452(int arg0, int arg1, class507 arg2, int arg3) {
        class496.field6549 = arg1;
        class44.field591 = arg2;
        field3023++;
        class468.field5954 = arg0;
        if (arg3 != 17274) {
            field3022 = 122;
        }
    }
}
