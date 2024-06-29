import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class25 {

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "[[I")
    private int[][] field577;

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "I")
    private int field586;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "I")
    private int field578;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field567 = 255;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "Lvd;")
    private static class222 field568 = class212.method1357("Feb", 10731);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Lvd;")
    private static class222 field559 = class212.method1357("Mar", 10731);

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "Lvd;")
    private static class222 field564 = class212.method1357("Nov", 10731);

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "Lvd;")
    private static class222 field572 = class212.method1357("Aug", 10731);

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "Lvd;")
    private static class222 field561 = class212.method1357("Dec", 10731);

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "Lvd;")
    private static class222 field582 = class212.method1357("Jan", 10731);

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "Lvd;")
    private static class222 field566 = class212.method1357("shake:", 10731);

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "Lvd;")
    private static class222 field574 = class212.method1357("Jun", 10731);

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "Lvd;")
    private static class222 field579 = class212.method1357("Jul", 10731);

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "Lvd;")
    public static class222 field584 = class212.method1357("0(U", 10731);

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "Lvd;")
    private static class222 field585 = class212.method1357("Oct", 10731);

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "Lvd;")
    public static class222 field570 = field566;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "Lvd;")
    private static class222 field569 = class212.method1357("Sep", 10731);

    @OriginalMember(owner = "client!cc", name = "D", descriptor = "Lvd;")
    private static class222 field588 = class212.method1357("Apr", 10731);

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "Lvd;")
    private static class222 field587 = class212.method1357("May", 10731);

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "Lvd;")
    public static class222 field565 = field566;

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "[Lvd;")
    public static class222[] field583 = new class222[] { field582, field568, field559, field588, field587, field574, field579, field572, field569, field585, field564, field561 };

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
    public static int field580 = -1;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "Lvd;")
    public static class222 field575 = class212.method1357("blaugr-Un:", 10731);

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "Lr;")
    public static class178 field563;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "[I")
    public static int[] field571;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "[Lbg;")
    public static class19[] field573;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)I")
    public final int method220(int arg0, int arg1) {
        if (arg0 != 65536) {
            return 111;
        }
        field581++;
        if (this.field577 != null) {
            arg1 = (int) ((long) this.field578 * (long) arg1 / (long) this.field586) + 6;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)I")
    public final int method221(int arg0, int arg1) {
        if (arg1 != 452313488) {
            field569 = null;
        }
        if (this.field577 != null) {
            arg0 = (int) ((long) this.field578 * (long) arg0 / (long) this.field586);
        }
        field589++;
        return arg0;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static void method222(int arg0) {
        field571 = null;
        field574 = null;
        field585 = null;
        field563 = null;
        field564 = null;
        field588 = null;
        field587 = null;
        field579 = null;
        field572 = null;
        field570 = null;
        field583 = null;
        field582 = null;
        field568 = null;
        field561 = null;
        if (arg0 != 255) {
            method222(83);
        }
        field566 = null;
        field565 = null;
        field573 = null;
        field584 = null;
        field559 = null;
        field575 = null;
        field569 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([BB)[B")
    public final byte[] method223(byte[] arg0, byte arg1) {
        if (arg1 != 75) {
            this.method221(29, -40);
        }
        field562++;
        if (this.field577 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field578 / (long) this.field586) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field577[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field578 + var6;
                int var14 = var13 / this.field586;
                var6 = var13 - this.field586 * var14;
                var5 += var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(II)V")
    public class25(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class155.method990(-123, arg1, arg0);
            int var4 = arg0 / var3;
            this.field577 = new int[var4][14];
            this.field586 = var4;
            int var5 = arg1 / var3;
            this.field578 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                double var7 = (double) var6 / (double) var4 + 6.0D;
                double var9 = (double) var5 / (double) var4;
                int[] var11 = this.field577[var6];
                int var12 = (int) Math.floor(var7 + 1.0D - 7.0D);
                int var13 = (int) Math.ceil(var7 + 7.0D);
                if (var12 < 0) {
                    var12 = 0;
                }
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var13 > var12) {
                    double var14 = ((double) var12 - var7) * 3.141592653589793D;
                    double var16 = var9;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var9 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var12 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var11[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }
}
