import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public abstract class class269 {

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public static int field4768 = 0;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field4771 = 1;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "Leb;")
    public static class230 field4767 = class68.method589(0, "(U5");

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "Lha;")
    public static class30 field4766 = new class30(64);

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "Lkk;")
    public static class223 field4765;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "[S")
    public static short[] field4770;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)[B")
    public abstract byte[] method490(int arg0, int arg1);

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)I")
    public abstract int method488(int arg0, int arg1);

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
    public static void method1848(byte arg0) {
        field4766 = null;
        field4767 = null;
        field4770 = null;
        if (arg0 >= -78) {
            field4771 = -69;
        }
        field4765 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)Loi;")
    public abstract class79 method482(int arg0);

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIILhj;JLhj;Lhj;)V")
    public static final void method1849(int arg0, int arg1, int arg2, int arg3, class70 arg4, long arg5, class70 arg6, class70 arg7) {
        class176 var9 = new class176();
        var9.field3087 = arg4;
        var9.field3089 = arg1 * 128 + 64;
        var9.field3095 = arg2 * 128 + 64;
        var9.field3088 = arg3;
        var9.field3097 = arg5;
        var9.field3086 = arg6;
        var9.field3096 = arg7;
        int var10 = 0;
        class233 var11 = class53.field916[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field4058; var12++) {
                class111 var13 = var11.field4050[var12];
                if ((var13.field2001 & 0x400000L) == 4194304L) {
                    int var14 = var13.field1993.method496();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field3091 = -var10;
        if (class53.field916[arg0][arg1][arg2] == null) {
            class53.field916[arg0][arg1][arg2] = new class233(arg0, arg1, arg2);
        }
        class53.field916[arg0][arg1][arg2].field4063 = var9;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BI)V")
    public abstract void method486(byte arg0, int arg1);
}
