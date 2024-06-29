import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class211 extends class76 {

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    private int field2958;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
    private int field2959;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    private int field2966;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    private int field2965;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public static int field2962 = -1;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "Ljava/lang/String;")
    public static String field2967 = "M";

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field2968 = new String[8];

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(IIIIIII)V")
    public class211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2958 = arg0;
        this.field2959 = arg2;
        this.field2966 = arg1;
        this.field2965 = arg3;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIB)V")
    public final void method167(int arg0, int arg1, byte arg2) {
        ++field2963;
        int var4 = this.field2958 * arg0 >> 12;
        int var5 = this.field2959 * arg0 >> 12;
        int var6 = this.field2965 * arg1 >> 12;
        if (arg2 <= -37) {
            int var7 = this.field2966 * arg1 >> 12;
            class42.method261(super.field906, var5, var4, var6, var7, 108);
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(III)V")
    public final void method168(int arg0, int arg1, int arg2) {
        ++field2964;
        if (arg0 == -31341) {
            int var4 = this.field2958 * arg2 >> 12;
            int var5 = this.field2959 * arg2 >> 12;
            int var6 = this.field2965 * arg1 >> 12;
            int var7 = this.field2966 * arg1 >> 12;
            class266.method1695(var5, var6, var4, super.field907, true, var7, super.field910);
        }
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(III)I")
    public static final int method1336(int arg0, int arg1, int arg2) {
        int var3 = class103.method625(arg1 ^ -85, arg2 + -1, arg0 + -1) - -class103.method625(114, arg1 + arg2, arg0 + 1) + (class103.method625(73, arg2 - -1, arg0 + -1) - -class103.method625(arg1 ^ -106, arg2 + 1, arg0 + 1));
        int var4 = class103.method625(arg1 + 107, arg2, arg0 + -1) - -class103.method625(103, arg2, arg0 - -1) + class103.method625(119, arg2 - 1, arg0) + class103.method625(90, arg2 + 1, arg0);
        ++field2961;
        int var5 = class103.method625(109, arg2, arg0);
        return var3 / 16 + var4 / 8 + var5 / 4;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
    public static void method1337(int arg0) {
        if (arg0 != 1284157804) {
            method1336(31, 70, 55);
        }
        field2968 = null;
        field2967 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
    public final void method166(int arg0, int arg1, int arg2) {
        ++field2960;
        int var4 = 9 / ((arg1 - -14) / 55);
        int var5 = this.field2958 * arg0 >> 12;
        int var6 = this.field2959 * arg0 >> 12;
        int var7 = this.field2965 * arg2 >> 12;
        int var8 = this.field2966 * arg2 >> 12;
        class161.method1066(super.field910, super.field907, var7, var8, -110, super.field906, var6, var5);
    }
}
