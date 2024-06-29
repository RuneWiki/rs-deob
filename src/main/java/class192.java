import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class192 extends class418 {

    @OriginalMember(owner = "client!bq", name = "n", descriptor = "I")
    private int field3098;

    @OriginalMember(owner = "client!bq", name = "l", descriptor = "I")
    private int field3096;

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "I")
    private int field3093;

    @OriginalMember(owner = "client!bq", name = "q", descriptor = "I")
    private int field3101;

    @OriginalMember(owner = "client!bq", name = "p", descriptor = "[I")
    public static int[] field3100 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!bq", name = "j", descriptor = "Ls;")
    public static class186 field3094 = new class186(35, 14);

    @OriginalMember(owner = "client!bq", name = "w", descriptor = "I")
    public static int field3107 = 0;

    @OriginalMember(owner = "client!bq", name = "u", descriptor = "Z")
    public static boolean field3105 = false;

    @OriginalMember(owner = "client!bq", name = "x", descriptor = "Ls;")
    public static class186 field3108 = new class186(46, 4);

    @OriginalMember(owner = "client!bq", name = "k", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!bq", name = "m", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!bq", name = "o", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!bq", name = "r", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!bq", name = "v", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!bq", name = "t", descriptor = "Lor;")
    public static class456 field3104;

    @OriginalMember(owner = "client!bq", name = "s", descriptor = "Lph;")
    public static class459 field3103;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(BII)V")
    public final void method1300(byte arg0, int arg1, int arg2) {
        ++field3106;
        if (arg0 <= 12) {
            this.method1302(-112, false, 27);
        }
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(IIIIII)V")
    public class192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field3098 = arg3;
        this.field3096 = arg2;
        this.field3093 = arg0;
        this.field3101 = arg1;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(III)V")
    public final void method1301(int arg0, int arg1, int arg2) {
        int var4 = -119 % ((arg0 - -67) / 57);
        ++field3099;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IZI)V")
    public final void method1302(int arg0, boolean arg1, int arg2) {
        ++field3095;
        int var4 = this.field3093 * arg0 >> 12;
        int var5 = this.field3096 * arg0 >> 12;
        int var6 = this.field3101 * arg2 >> 12;
        int var7 = this.field3098 * arg2 >> 12;
        class474.method2832(var4, arg1, var5, var6, var7, super.field6297);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V")
    public static void method1303(int arg0) {
        field3100 = null;
        field3103 = null;
        if (arg0 != 8) {
            field3104 = null;
        }
        field3108 = null;
        field3094 = null;
        field3104 = null;
    }
}
