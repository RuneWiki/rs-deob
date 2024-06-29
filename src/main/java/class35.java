import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class35 {

    @OriginalMember(owner = "client!u", name = "i", descriptor = "Ldc;")
    public class245 field432;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public int field429;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field424 = -1;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "Ltb;")
    public static class312 field427 = new class312();

    @OriginalMember(owner = "client!u", name = "g", descriptor = "[I")
    public static int[] field430 = new int[2048];

    @OriginalMember(owner = "client!u", name = "j", descriptor = "S")
    public static short field433 = 256;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "Lfh;")
    public static class140 field431;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V", line = 12)
    public static void method221(boolean arg0) {
        field427 = null;
        field431 = null;
        field430 = null;
        if (!arg0) {
            method221(false);
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(II)V", line = 35)
    public class35(int arg0, int arg1) {
        this.field432 = class210.method1546(arg0, 2);
        this.field429 = arg1;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Ldc;I)V", line = 43)
    public class35(class245 arg0, int arg1) {
        this.field429 = arg1;
        this.field432 = arg0;
    }
}
