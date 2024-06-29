import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class100 {

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "Z")
    public static boolean field1861 = false;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "Ltg;")
    public static class184 field1860 = class135.method812("b12_full", 3);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIILfb;Lfb;IIJ)V")
    public static final void method621(int arg0, int arg1, int arg2, int arg3, class52 arg4, class52 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class50 var10 = new class50();
        var10.field923 = arg8;
        var10.field926 = arg1 * 128 + 64;
        var10.field921 = arg2 * 128 + 64;
        var10.field914 = arg3;
        var10.field918 = arg4;
        var10.field930 = arg5;
        var10.field915 = arg6;
        var10.field933 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class190.field3704[var11][arg1][arg2] == null) {
                class190.field3704[var11][arg1][arg2] = new class90(var11, arg1, arg2);
            }
        }
        class190.field3704[arg0][arg1][arg2].field1693 = var10;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    public static void method622(byte arg0) {
        int var1 = 109 / ((arg0 - 66) / 59);
        field1860 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)I")
    public static final int method623(int arg0, int arg1, int arg2) {
        field1859++;
        if (arg2 == -2) {
            return 12345678;
        }
        if (arg0 > -37) {
            field1861 = true;
        }
        if (arg2 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }
}
