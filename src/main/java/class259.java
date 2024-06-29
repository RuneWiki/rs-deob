import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class259 extends class332 {

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public int field3932;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public int field3935;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "Ldh;")
    public static class179 field3929 = new class179(64);

    @OriginalMember(owner = "client!le", name = "l", descriptor = "[I")
    public static int[] field3931 = new int[2];

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public static int field3934 = 127;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "[I")
    public static int[] field3936 = new int[2000];

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V", line = 14)
    public static void method1874(int arg0) {
        if (arg0 == 127) {
            field3931 = null;
            field3936 = null;
            field3929 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(II)V", line = 33)
    public class259(int arg0, int arg1) {
        this.field3932 = arg0;
        this.field3935 = arg1;
    }
}
