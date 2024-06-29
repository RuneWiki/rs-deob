import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class255 {

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "[I")
    public static int[] field3312 = new int[5];

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Z")
    public static boolean field3311;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1628(int arg0) {
        if (arg0 == 29958) {
            class143.field1680.method2298(arg0 - 29958);
            field3314++;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIZ)I", line = 17)
    public static final int method1629(int arg0, int arg1, int arg2, boolean arg3) {
        field3310++;
        if (arg1 != 5936) {
            method1628(55);
        }
        class391 var4 = class70.method415(Integer.MIN_VALUE, arg2, arg3);
        if (var4 == null) {
            return -1;
        } else if (arg0 >= 0 && var4.field5330.length > arg0) {
            return var4.field5330[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V", line = 39)
    public static void method1630(int arg0) {
        if (arg0 < 82) {
            field3313 = 49;
        }
        field3312 = null;
    }
}
