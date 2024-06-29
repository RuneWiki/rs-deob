import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public abstract class class66 extends class155 {

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "Z")
    public volatile boolean field1114 = true;

    @OriginalMember(owner = "client!wj", name = "B", descriptor = "[Ljava/lang/String;")
    public static String[] field1107 = new String[8];

    @OriginalMember(owner = "client!wj", name = "D", descriptor = "Lre;")
    public static class236 field1108 = new class236(0, 0);

    @OriginalMember(owner = "client!wj", name = "F", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!wj", name = "H", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!wj", name = "J", descriptor = "Laj;")
    public static class151 field1113;

    @OriginalMember(owner = "client!wj", name = "A", descriptor = "Z")
    public boolean field1106;

    @OriginalMember(owner = "client!wj", name = "E", descriptor = "Z")
    public boolean field1109;

    @OriginalMember(owner = "client!wj", name = "I", descriptor = "[I")
    public static int[] field1112;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIIIIIIIIB)V")
    public static final void method456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, byte arg12) {
        field1110++;
        class9 var13 = new class9();
        var13.field172 = arg8;
        var13.field175 = arg9;
        var13.field180 = arg6;
        var13.field169 = arg0;
        if (arg12 <= 71) {
            return;
        }
        var13.field174 = arg10;
        var13.field173 = arg3;
        var13.field181 = arg7;
        var13.field170 = arg1;
        var13.field183 = arg4;
        var13.field179 = arg11;
        var13.field176 = arg2;
        var13.field178 = arg5;
        class73.field1267.method311(90, var13);
    }

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "(I)I")
    public abstract int method82(int arg0);

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
    public static void method457(byte arg0) {
        field1107 = null;
        if (arg0 >= -71) {
            field1112 = null;
        }
        field1113 = null;
        field1108 = null;
        field1112 = null;
    }

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "(I)[B")
    public abstract byte[] method83(int arg0);
}
