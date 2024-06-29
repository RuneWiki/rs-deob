import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class426 extends class190 {

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    private int field6251;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    private int field6243;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
    private int field6250;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    private int field6244;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "Lql;")
    private class346 field6252;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    private int field6248;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    private int field6247;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "[[I")
    private static int[][] field6245 = new int[6][];

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "[I")
    private static int[] field6249 = new int[6];

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "Lg;")
    private class433 field6246;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)Lg;")
    public final class433 method1021(int arg0) {
        if (this.field6246 == null) {
            field6249[2] = this.field6248;
            field6249[3] = this.field6247;
            field6249[1] = this.field6244;
            field6249[0] = this.field6250;
            field6249[5] = this.field6243;
            class369 var2 = this.field6252.field4699;
            field6249[4] = this.field6251;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1665(field6249[var5], (byte) -125)) {
                    return null;
                }
                class75 var6 = var2.method1660(field6249[var5], (byte) -107);
                int var7 = var6.field825 ? 64 : 128;
                if (var6.field819 > 0) {
                    var3 = true;
                }
                if (var7 > var4) {
                    var4 = var7;
                }
            }
            for (int var8 = 0; var8 < 6; var8++) {
                field6245[var8] = var2.method1662(false, var4, var4, 28861, 1.0F, field6249[var8]);
            }
            this.field6246 = new class433(this.field6252, 6407, var4, var3, field6245);
        }
        if (arg0 > -37) {
            this.method1021(65);
        }
        return this.field6246;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lql;IIIIII)V")
    public class426(class346 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6251 = arg5;
        this.field6243 = arg6;
        this.field6250 = arg1;
        this.field6244 = arg2;
        this.field6252 = arg0;
        this.field6248 = arg3;
        this.field6247 = arg4;
    }
}
