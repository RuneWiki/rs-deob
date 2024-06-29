import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class172 extends class138 {

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "I")
    private final int field3106;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
    private final int field3104;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    private final int field3102;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    private final int field3100;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field3095 = 127;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "[I")
    public static int[] field3096 = new int[5];

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "[I")
    public static int[] field3110 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "[I")
    public static int[] field3109 = new int[256];

    @OriginalMember(owner = "client!bg", name = "x", descriptor = "I")
    public static int field3111 = -1;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "Ldl;")
    public static class31 field3108;

    @OriginalMember(owner = "client!bg", name = "y", descriptor = "[[[I")
    public static int[][][] field3112;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IB)I")
    public static final int method1132(int arg0, byte arg1) {
        ++field3099;
        return arg1 <= 22 ? -85 : 127 & arg0 >> 11;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIZ)V")
    public final void method378(int arg0, int arg1, boolean arg2) {
        ++field3098;
        int var4 = this.field3100 * arg1 >> 12;
        int var5 = this.field3106 * arg0 >> 12;
        if (arg2) {
            method1135((byte) -67, -55);
        }
        int var6 = this.field3102 * arg1 >> 12;
        int var7 = this.field3104 * arg0 >> 12;
        class2.method17(var6, var5, super.field2526, var4, var7, (byte) 91);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IBI)V")
    public final void method375(int arg0, byte arg1, int arg2) {
        int var4 = this.field3106 * arg2 >> 12;
        ++field3097;
        int var5 = this.field3100 * arg0 >> 12;
        int var6 = this.field3102 * arg0 >> 12;
        int var7 = this.field3104 * arg2 >> 12;
        class130.method867(var7, -1, var5, var4, super.field2527, super.field2522, var6, super.field2526);
        if (arg1 > -21) {
            this.method378(125, 35, true);
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
    public static void method1133(int arg0) {
        field3108 = null;
        if (arg0 != 29280) {
            field3110 = null;
        }
        field3112 = null;
        field3096 = null;
        field3110 = null;
        field3109 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([Lvf;I)[Lvf;")
    public static final class265[] method1134(class265[] arg0, int arg1) {
        ++field3101;
        if (arg1 >= -51) {
            method1132(-28, (byte) 30);
        }
        class265[] var2 = new class265[5];
        for (int var3 = 0; ~var3 > -6; ++var3) {
            var2[var3] = class148.method1022(10, new class265[] { class241.method1609(true, var3), class143.field2677 });
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class148.method1022(10, new class265[] { var2[var3], arg0[var3] });
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)V")
    public final void method380(int arg0, int arg1, int arg2) {
        ++field3105;
        int var4 = this.field3100 * arg0 >> 12;
        int var5 = this.field3102 * arg0 >> 12;
        int var6 = this.field3106 * arg2 >> 12;
        int var7 = this.field3104 * arg2 >> 12;
        class166.method1095(var5, (byte) -37, super.field2527, var4, var7, var6, super.field2522);
        if (arg1 != 10) {
            method1132(95, (byte) -128);
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(IIIIIII)V")
    public class172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3106 = arg1;
        this.field3104 = arg3;
        this.field3102 = arg0;
        this.field3100 = arg2;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BI)I")
    public static final int method1135(byte arg0, int arg1) {
        if (arg0 < 92) {
            method1133(-94);
        }
        ++field3107;
        if (arg1 >= 97 && ~arg1 >= -123 || arg1 >= 224 && ~arg1 >= -255 && ~arg1 != -248) {
            return arg1 + -32;
        } else if (arg1 == 255) {
            return 159;
        } else {
            return ~arg1 == -157 ? 140 : arg1;
        }
    }
}
