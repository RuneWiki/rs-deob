import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class327 extends class354 {

    @OriginalMember(owner = "client!fp", name = "n", descriptor = "[I")
    public static int[] field4197 = new int[1000];

    @OriginalMember(owner = "client!fp", name = "i", descriptor = "Lde;")
    public static class534 field4192 = new class534(4);

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!fp", name = "j", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!fp", name = "k", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!fp", name = "l", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!fp", name = "m", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!fp", name = "o", descriptor = "Z")
    public static boolean field4198;

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(B)V")
    public static void method1902(byte arg0) {
        if (arg0 == -113) {
            field4197 = null;
            field4192 = null;
        }
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(ILwo;)V")
    public class327(int arg0, class746 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)I")
    public final int method393(byte arg0) {
        ++field4194;
        int var2 = -83 / ((arg0 - 37) / 63);
        return 1;
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(II)I")
    public final int method391(int arg0, int arg1) {
        ++field4196;
        if (arg0 != 3) {
            field4198 = false;
        }
        return 1;
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lwo;)V")
    public class327(class746 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
    public final void method388(int arg0) {
        if (arg0 != 6384) {
            field4198 = false;
        }
        if (~super.field4545 != -2 && super.field4545 != 0) {
            super.field4545 = this.method393((byte) 100);
        }
        ++field4191;
    }

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(II)V")
    public final void method389(int arg0, int arg1) {
        ++field4195;
        if (arg0 == -1) {
            super.field4545 = arg1;
        }
    }

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(B)I")
    public final int method1903(byte arg0) {
        int var2 = -82 % ((7 - arg0) / 45);
        ++field4193;
        return super.field4545;
    }
}
