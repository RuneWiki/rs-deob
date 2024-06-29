import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class235 extends class82 {

    @OriginalMember(owner = "client!f", name = "C", descriptor = "I")
    private final int field3972;

    @OriginalMember(owner = "client!f", name = "w", descriptor = "I")
    private final int field3966;

    @OriginalMember(owner = "client!f", name = "G", descriptor = "I")
    private final int field3976;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "I")
    private final int field3962;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "I")
    private final int field3963;

    @OriginalMember(owner = "client!f", name = "D", descriptor = "I")
    private final int field3973;

    @OriginalMember(owner = "client!f", name = "I", descriptor = "I")
    private final int field3978;

    @OriginalMember(owner = "client!f", name = "J", descriptor = "I")
    private final int field3979;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "[I")
    public static int[] field3964 = new int[500];

    @OriginalMember(owner = "client!f", name = "z", descriptor = "I")
    public static int field3969 = 0;

    @OriginalMember(owner = "client!f", name = "H", descriptor = "I")
    public static int field3977 = 0;

    @OriginalMember(owner = "client!f", name = "E", descriptor = "Lcd;")
    public static class64 field3974 = class44.method335((byte) 71, ":duelfriend:");

    @OriginalMember(owner = "client!f", name = "r", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!f", name = "x", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!f", name = "A", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!f", name = "F", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!f", name = "B", descriptor = "Lqm;")
    public static class222 field3971;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIIII)V", line = 11)
    public static final void method1682(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3975++;
        int var8 = class160.method1155(class201.field3444, class180.field3098, 268435455, arg0);
        int var9 = class160.method1155(class201.field3444, class180.field3098, 268435455, arg5);
        int var10 = class160.method1155(class153.field2714, class290.field4976, 268435455, arg2);
        int var11 = class160.method1155(class153.field2714, class290.field4976, 268435455, arg1);
        int var12 = class160.method1155(class201.field3444, class180.field3098, 268435455, arg0 + arg3);
        int var13 = class160.method1155(class201.field3444, class180.field3098, 268435455, arg5 - arg3);
        for (int var14 = var8; var14 < var12; var14++) {
            class31.method268(var11, 121, var10, class124.field2241[var14], arg7);
        }
        if (arg6 <= 31) {
            method1684((long[]) null, (Object[]) null, (byte) -87);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class31.method268(var11, 127, var10, class124.field2241[var15], arg7);
        }
        int var16 = class160.method1155(class153.field2714, class290.field4976, 268435455, arg2 + arg3);
        int var17 = class160.method1155(class153.field2714, class290.field4976, 268435455, arg1 - arg3);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class124.field2241[var18];
            class31.method268(var16, 127, var10, var19, arg7);
            class31.method268(var17, 122, var16, var19, arg4);
            class31.method268(var11, 119, var17, var19, arg7);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V", line = 62)
    public static void method1683(int arg0) {
        field3964 = null;
        field3971 = null;
        field3974 = null;
        int var1 = -1 / ((arg0 - 53) / 60);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZII)V", line = 74)
    public final void method433(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field3968++;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BII)V", line = 85)
    public final void method434(byte arg0, int arg1, int arg2) {
        field3961++;
        if (arg0 > -96) {
            field3969 = -27;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([J[Ljava/lang/Object;B)V", line = 109)
    public static final void method1684(long[] arg0, Object[] arg1, byte arg2) {
        if (arg2 != -36) {
            method1686((byte) -64, 94);
        }
        class115.method821(arg1, (byte) -20, 0, arg0.length - 1, arg0);
        field3967++;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)Lpl;", line = 126)
    public static final class184 method1685(int arg0, int arg1, int arg2) {
        class295 var3 = class304.field5203[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5079;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 133)
    public class235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field3972 = arg4;
        this.field3966 = arg0;
        this.field3976 = arg3;
        this.field3962 = arg6;
        this.field3963 = arg1;
        this.field3973 = arg7;
        this.field3978 = arg5;
        this.field3979 = arg2;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)Z", line = 161)
    public static final boolean method1686(byte arg0, int arg1) {
        field3970++;
        if (class265.field4562 != arg1) {
            return arg0 <= 91;
        }
        class265.field4562++;
        class56.field944 = true;
        if (class265.field4562 > 65535) {
            class265.field4562 = 0;
        }
        return true;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIB)V", line = 190)
    public final void method435(int arg0, int arg1, byte arg2) {
        field3965++;
        int var4 = this.field3963 * arg1 >> 12;
        int var5 = this.field3979 * arg0 >> 12;
        if (arg2 != 111) {
            return;
        }
        int var6 = this.field3966 * arg0 >> 12;
        int var7 = this.field3972 * arg0 >> 12;
        int var8 = this.field3962 * arg0 >> 12;
        int var9 = this.field3976 * arg1 >> 12;
        int var10 = this.field3973 * arg1 >> 12;
        int var11 = this.field3978 * arg1 >> 12;
        class28.method245(this.field1510, var5, var8, var9, var4, var10, var7, var6, false, var11);
    }
}
