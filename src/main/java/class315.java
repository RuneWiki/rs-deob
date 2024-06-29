import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class315 {

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "Lqga;")
    public class192 field4735 = new class192();

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
    public static int field4733 = 0;

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "[Lit;")
    public static class34[] field4732;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)V", line = 8)
    public static void method2072(byte arg0) {
        if (arg0 <= 64) {
            field4732 = null;
        }
        field4732 = null;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIB)Z", line = 18)
    public static final boolean method2073(int arg0, int arg1, byte arg2) {
        field4734++;
        int var3 = 91 / ((38 - arg2) / 56);
        return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "([Lov;II)V", line = 29)
    public static final void method2074(class668[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class668 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field9480;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field9480 < (var7 & 0x1) + var6) {
                class668 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method2074(arg0, arg1, var4 - 1);
        method2074(arg0, var4 + 1, arg2);
    }
}
