import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class9 extends class119 {

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
    private int field208 = -32768;

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "I")
    public static int field210 = 0;

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "Llb;")
    public static class190 field205 = new class190(64);

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    public int field201;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
    public int field202;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "[I")
    public static int[] field207;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIILsc;Lsc;IIJ)V")
    public static final void method89(int arg0, int arg1, int arg2, int arg3, class119 arg4, class119 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class225 var10 = new class225();
        var10.field3874 = arg8;
        var10.field3873 = arg1 * 128 + 64;
        var10.field3877 = arg2 * 128 + 64;
        var10.field3876 = arg3;
        var10.field3880 = arg4;
        var10.field3878 = arg5;
        var10.field3882 = arg6;
        var10.field3884 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class31.field553[var11][arg1][arg2] == null) {
                class31.field553[var11][arg1][arg2] = new class71(var11, arg1, arg2);
            }
        }
        class31.field553[arg0][arg1][arg2].field1141 = var10;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "()I")
    public final int method90() {
        field203++;
        return this.field208;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method91(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class17 var11 = class235.method1605(83, this.field201).method1689((class138) null, 0, this.field202, (byte) 127);
        field206++;
        if (var11 != null) {
            var11.method91(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field208 = var11.method90();
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)V")
    public static void method92(byte arg0) {
        field207 = null;
        int var1 = 103 / ((arg0 + 13) / 40);
        field205 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILsb;)V")
    public static final void method93(int arg0, class98 arg1) {
        field204++;
        if (class155.field2826 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg1.method727((byte) 36);
        if (var3 == 0L) {
            return;
        }
        while (class155.field2826.length > var2 && class155.field2826[var2].field4061 != var3) {
            var2++;
        }
        if (var2 >= class155.field2826.length || class155.field2826[var2] == null) {
            return;
        }
        class85.field1487++;
        class237.field4084.method490(146, -77);
        class237.field4084.method1484(class155.field2826[var2].field4061, (byte) 38);
        if (arg0 <= 22) {
            field210 = -110;
        }
    }
}
