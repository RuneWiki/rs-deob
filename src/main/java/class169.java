import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class169 {

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field3075 = 0;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field3083 = 0;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field3081 = 0;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "Loc;")
    private static class151 field3082 = class137.method873(2, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "Loc;")
    public static class151 field3090 = class137.method873(2, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "Loc;")
    public static class151 field3084 = field3082;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "Lv;")
    public static class218 field3088 = new class218();

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "[I")
    public static int[] field3077;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "[[B")
    public static byte[][] field3078;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method1091(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field3087++;
        int var8 = arg1 + arg7;
        int var9 = arg4 - arg7;
        int var10 = arg0 - arg7;
        if (arg5 != 7) {
            return;
        }
        for (int var11 = arg1; var11 < var8; var11++) {
            class55.method380(arg3, arg5 + 112, class43.field887[var11], arg0, arg2);
        }
        for (int var12 = arg4; var12 > var9; var12--) {
            class55.method380(arg3, arg5 + 108, class43.field887[var12], arg0, arg2);
        }
        int var13 = arg2 + arg7;
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class43.field887[var14];
            class55.method380(arg3, 115, var15, var13, arg2);
            class55.method380(arg6, 125, var15, var10, var13);
            class55.method380(arg3, 123, var15, arg0, var10);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lw;II)V")
    public static final void method1092(class228 arg0, int arg1, int arg2) {
        field3076++;
        if (arg1 != 11416) {
            return;
        }
        if (arg0.field4015 > class200.field3541) {
            class16.method135((byte) 8, arg0);
        } else if (class200.field3541 > arg0.field4040) {
            class167.method1084(false, arg0);
        } else {
            class9.method52(arg0, (byte) -43);
        }
        if (arg0.field3976 < 128 || arg0.field4029 < 128 || arg0.field3976 >= 13184 || arg0.field4029 >= 13184) {
            arg0.field4016 = -1;
            arg0.field3991 = -1;
            arg0.field4029 = arg0.field4031[0] * 128 + arg0.field4007 * 64;
            arg0.field4015 = 0;
            arg0.field4040 = 0;
            arg0.field3976 = arg0.field3978[0] * 128 + arg0.field4007 * 64;
            arg0.method1428(10897);
        }
        if (class228.field3975 == arg0 && (arg0.field3976 < 1536 || arg0.field4029 < 1536 || arg0.field3976 >= 11776 || arg0.field4029 >= 11776)) {
            arg0.field4040 = 0;
            arg0.field4015 = 0;
            arg0.field3976 = arg0.field3978[0] * 128 + arg0.field4007 * 64;
            arg0.field4029 = arg0.field4031[0] * 128 + arg0.field4007 * 64;
            arg0.field4016 = -1;
            arg0.field3991 = -1;
            arg0.method1428(10897);
        }
        class44.method317(arg0, false);
        class71.method471(arg0, 0);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public static void method1093(boolean arg0) {
        field3078 = null;
        field3088 = null;
        field3077 = null;
        field3090 = null;
        if (!arg0) {
            method1091(-63, -90, 84, -70, -117, (byte) -85, 17, 89);
        }
        field3084 = null;
        field3082 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)V")
    public static final void method1094(int arg0, int arg1) {
        field3085++;
        if (arg0 != -1) {
            method1093(false);
        }
        if (class106.field1888 == null || class106.field1888.length < arg1) {
            class106.field1888 = new int[arg1];
        }
    }
}
