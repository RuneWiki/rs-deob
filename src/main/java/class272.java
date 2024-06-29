import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class272 {

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public int field3357;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "[I")
    public static int[] field3356 = new int[200];

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "[I")
    public static int[] field3359 = new int[1024];

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "[Z")
    public static boolean[] field3360 = new boolean[100];

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!wd", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3355++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public static void method1616(int arg0) {
        field3359 = null;
        field3356 = null;
        field3360 = null;
        if (arg0 != 200) {
            method1616(61);
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I)V")
    public class272(int arg0) {
        this.field3357 = arg0;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIBII)V")
    public static final void method1617(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field3358++;
        class47 var5 = class258.method1546(8, arg0, (byte) 121);
        if (arg2 != 42) {
            method1616(15);
        }
        var5.method271((byte) 125);
        var5.field519 = arg3;
        var5.field514 = arg4;
        var5.field507 = arg1;
    }
}
