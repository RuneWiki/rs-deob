import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class79 {

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "Ldia;")
    public static class235 field955 = new class235("", 18);

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field957 = 1;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "Lhda;")
    public static class752 field958 = new class752(20, 4);

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V", line = 5)
    public static void method627(int arg0) {
        field958 = null;
        if (arg0 != 3) {
            field957 = 38;
        }
        field955 = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([BIIIII)V", line = 18)
    public static final void method628(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field959++;
        if (arg4 >= arg1) {
            return;
        }
        int var6 = arg1 - arg4 >> 2;
        int var7 = arg2 + arg4;
        if (arg3 != 11567) {
            return;
        }
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg1 - arg4 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg0[var7++] = 1;
                }
            }
            arg0[var7++] = 1;
            arg0[var7++] = 1;
            arg0[var7++] = 1;
            arg0[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)V", line = 49)
    public static final void method629(int arg0, int arg1, int arg2) {
        field956++;
        class127 var3 = class760.method4231(arg0, arg2 ^ 0xCBDBB930, arg2);
        var3.method1010(614);
        var3.field2099 = arg1;
    }
}
