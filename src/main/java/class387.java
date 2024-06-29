import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class387 extends class42 {

    @OriginalMember(owner = "client!fs", name = "q", descriptor = "I")
    public int field5264;

    @OriginalMember(owner = "client!fs", name = "o", descriptor = "Lvj;")
    public static class304 field5262 = new class304("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!fs", name = "r", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!fs", name = "s", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!fs", name = "t", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!fs", name = "n", descriptor = "Lcd;")
    public static class205 field5261;

    @OriginalMember(owner = "client!fs", name = "p", descriptor = "Lcc;")
    public static class512 field5263;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(JI)V")
    public static final void method2287(long arg0, int arg1) {
        field5266++;
        if (arg1 < 63) {
            return;
        }
        int var3 = class525.field7779 + class385.field5232.field584;
        int var4 = class371.field4991 + class385.field5232.field574;
        if (class150.field2135 - var3 < -500 || class150.field2135 - var3 > 500 || (class429.field5883 - var4) < -500 || (class429.field5883 - var4) > 500) {
            class429.field5883 = var4;
            class150.field2135 = var3;
        }
        if (class150.field2135 != var3) {
            int var5 = var3 - class150.field2135;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var5 < var6) {
                var6 = var5;
            }
            class150.field2135 += var6;
        }
        if (!class154.field2244.field7738) {
            class184.field2621 += (float) arg0 * class467.field6440 / 6.0F;
            class426.field5820 += (float) arg0 * class48.field754 / 6.0F;
        }
        if (class429.field5883 != var4) {
            int var7 = var4 - class429.field5883;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class429.field5883 += var8;
        }
        class393.method2306(0);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V")
    public static void method2288(int arg0) {
        if (arg0 != -1) {
            method2287(-49L, -116);
        }
        field5261 = null;
        field5262 = null;
        field5263 = null;
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "()V")
    public class387() {
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(I)V")
    public class387(int arg0) {
        this.field5264 = arg0;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIZIFIIII)[[I")
    public static final int[][] method2289(int arg0, int arg1, boolean arg2, int arg3, float arg4, int arg5, int arg6, int arg7, int arg8) {
        field5265++;
        int[][] var9 = new int[arg6][arg8];
        class120 var10 = new class120();
        var10.field1747 = arg0;
        var10.field1760 = (int) ((float) arg5 * arg4);
        var10.field1750 = arg7;
        var10.field1762 = arg2;
        var10.field1759 = arg1;
        var10.method142((byte) -27);
        class522.method3078(arg8, -103, arg6);
        for (int var11 = 0; var11 < arg6; var11++) {
            var10.method836(var9[var11], 4095, var11);
        }
        return var9;
    }
}
