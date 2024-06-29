import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public class class563 extends class318 {

    @OriginalMember(owner = "client!via", name = "w", descriptor = "I")
    private int field7899;

    @OriginalMember(owner = "client!via", name = "q", descriptor = "Leea;")
    private class131 field7893;

    @OriginalMember(owner = "client!via", name = "B", descriptor = "I")
    private int field7904;

    @OriginalMember(owner = "client!via", name = "v", descriptor = "I")
    private int field7898;

    @OriginalMember(owner = "client!via", name = "u", descriptor = "I")
    private int field7897;

    @OriginalMember(owner = "client!via", name = "A", descriptor = "I")
    private int field7903;

    @OriginalMember(owner = "client!via", name = "t", descriptor = "I")
    private int field7896;

    @OriginalMember(owner = "client!via", name = "x", descriptor = "[I")
    public static int[] field7900 = new int[500];

    @OriginalMember(owner = "client!via", name = "p", descriptor = "I")
    public static int field7892;

    @OriginalMember(owner = "client!via", name = "r", descriptor = "I")
    public static int field7894;

    @OriginalMember(owner = "client!via", name = "z", descriptor = "I")
    public static int field7902;

    @OriginalMember(owner = "client!via", name = "y", descriptor = "Lku;")
    private class375 field7901;

    @OriginalMember(owner = "client!via", name = "s", descriptor = "Lrp;")
    public static class436 field7895;

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(B)Lku;")
    public final class375 method2063(byte arg0) {
        field7894++;
        if (this.field7901 == null) {
            class233.field3145[3] = this.field7897;
            class233.field3145[1] = this.field7898;
            class233.field3145[5] = this.field7903;
            class233.field3145[2] = this.field7899;
            class233.field3145[0] = this.field7896;
            class149 var2 = this.field7893.field715;
            class233.field3145[4] = this.field7904;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method531(class233.field3145[var5], arg0 ^ 0x3F)) {
                    return null;
                }
                class502 var7 = var2.method532((byte) 127, class233.field3145[var5]);
                int var8 = var7.field7208 ? 64 : 128;
                if (var7.field7200 > 0) {
                    var3 = 1;
                }
                if (var4 < var8) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class31.field411[var6] = var2.method534(false, var4, 20377, var4, 1.0F, class233.field3145[var6]);
            }
            this.field7901 = new class375(this.field7893, 6407, var4, var3 != 0, class31.field411);
        }
        return arg0 == -79 ? this.field7901 : null;
    }

    @OriginalMember(owner = "client!via", name = "c", descriptor = "(B)V")
    public static final void method3240(byte arg0) {
        class585.method3320();
        field7892++;
        if (arg0 < 86) {
            method3240((byte) 57);
        }
    }

    @OriginalMember(owner = "client!via", name = "d", descriptor = "(B)V")
    public static void method3241(byte arg0) {
        field7900 = null;
        field7895 = null;
        if (arg0 < 56) {
            method3241((byte) -42);
        }
    }

    @OriginalMember(owner = "client!via", name = "<init>", descriptor = "(Leea;IIIIII)V")
    public class563(class131 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field7899 = arg3;
        this.field7893 = arg0;
        this.field7904 = arg5;
        this.field7898 = arg2;
        this.field7897 = arg4;
        this.field7903 = arg6;
        this.field7896 = arg1;
    }
}
