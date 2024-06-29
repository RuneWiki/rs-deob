import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class152 extends class77 {

    @OriginalMember(owner = "client!o", name = "E", descriptor = "I")
    public static int field2872 = 0;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "Ldc;")
    public static class37 field2874 = class185.method1233((byte) 86, "Begeben Sie sich in ein freies Gebiet)1 um");

    @OriginalMember(owner = "client!o", name = "D", descriptor = "[I")
    public static int[] field2871 = new int[] { 1, 0, 0, 0, 1, 0, 2 };

    @OriginalMember(owner = "client!o", name = "H", descriptor = "Ldc;")
    public static class37 field2875 = class185.method1233((byte) 86, "gelb:");

    @OriginalMember(owner = "client!o", name = "F", descriptor = "Ldc;")
    private static class37 field2873 = class185.method1233((byte) 86, "wishes to trade with you)3");

    @OriginalMember(owner = "client!o", name = "J", descriptor = "Lmf;")
    public static class136 field2877 = null;

    @OriginalMember(owner = "client!o", name = "P", descriptor = "I")
    public static int field2883 = -1;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "Ldc;")
    public static class37 field2879 = field2873;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "I")
    public int field2880;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "I")
    public int field2881;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!o", name = "R", descriptor = "I")
    public int field2885;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "[I")
    public static int[] field2886;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IILce;)V")
    private final void method1037(int arg0, int arg1, class28 arg2) {
        if (arg1 == 1) {
            this.field2881 = arg2.method230((byte) -113);
            this.field2885 = arg2.method215(-1797813752);
            this.field2880 = arg2.method215(-1797813752);
        }
        if (arg0 != -18449) {
            field2886 = null;
        }
        field2882++;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lce;I)V")
    public final void method1038(class28 arg0, int arg1) {
        if (arg1 != 2) {
            field2873 = null;
        }
        while (true) {
            int var3 = arg0.method215(-1797813752);
            if (var3 == 0) {
                field2884++;
                return;
            }
            this.method1037(-18449, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIILia;Lia;IIIIJ)V")
    public static final void method1039(int arg0, int arg1, int arg2, int arg3, class88 arg4, class88 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class58 var12 = new class58();
        var12.field1081 = arg10;
        var12.field1083 = arg1 * 128 + 64;
        var12.field1080 = arg2 * 128 + 64;
        var12.field1087 = arg3;
        var12.field1084 = arg4;
        var12.field1086 = arg5;
        var12.field1095 = arg6;
        var12.field1091 = arg7;
        var12.field1092 = arg8;
        var12.field1088 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class180.field3354[var13][arg1][arg2] == null) {
                class180.field3354[var13][arg1][arg2] = new class18(var13, arg1, arg2);
            }
        }
        class180.field3354[arg0][arg1][arg2].field299 = var12;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V")
    public static void method1040(byte arg0) {
        field2877 = null;
        field2873 = null;
        field2886 = null;
        field2875 = null;
        if (arg0 != 24) {
            method1039(-77, 117, 74, -113, null, null, -98, 6, -115, -46, -33L);
        }
        field2874 = null;
        field2871 = null;
        field2879 = null;
    }
}
