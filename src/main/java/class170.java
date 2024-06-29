import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class170 {

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "Lml;")
    public final class134 field2965;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public final int field2969;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field2961 = 0;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "Ljf;")
    public static class229 field2963 = class212.method1457((byte) 121, "::qa_op_test");

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "Ljf;")
    public static class229 field2966 = class212.method1457((byte) 126, ":duelfriend:");

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "[Lof;")
    public static class241[] field2970 = new class241[50];

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "Lkb;")
    public static class35 field2964;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V", line = 6)
    public static void method1161(int arg0) {
        field2966 = null;
        field2970 = null;
        if (arg0 != 50) {
            field2964 = (class35) null;
        }
        field2963 = null;
        field2964 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIB)V", line = 35)
    public static final void method1162(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2967++;
        class132.field2325 = -1;
        class42.field768 = class254.field4432 * arg3 / arg0;
        class189.field3304 = -1;
        class151.field2619 = class113.field2037 * arg1 / arg2;
        class22.method211(62);
        int var5 = -3 % ((arg4 - 29) / 37);
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(II)V", line = 55)
    public class170(int arg0, int arg1) {
        this.field2965 = class12.method75(arg0, 2);
        this.field2969 = arg1;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V", line = 68)
    public static final void method1163(int arg0) {
        class111.field1951.method230(true);
        if (arg0 >= 85) {
            field2962++;
            class118.field2101.method230(true);
            class183.field3159.method230(true);
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lml;I)V", line = 82)
    public class170(class134 arg0, int arg1) {
        this.field2965 = arg0;
        this.field2969 = arg1;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I[J[I)V", line = 93)
    public static final void method1164(int arg0, long[] arg1, int[] arg2) {
        field2968++;
        class117.method834((byte) -102, arg2, arg1, arg0, arg1.length - 1);
    }
}
