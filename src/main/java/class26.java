import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class26 extends class88 {

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
    public int field593;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
    private int field590;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "[[I")
    public int[][] field581;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "[I")
    public int[] field583;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "Ltd;")
    public static class136 field582 = class145.method1172("", 45);

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "Ltd;")
    private static class136 field588 = class145.method1172("Free world", 45);

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "Ltd;")
    public static class136 field584 = field588;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
    public static int field591 = 0;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "Ltd;")
    public static class136 field589 = class145.method1172("AUS", 45);

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "Ltd;")
    public static class136 field592 = class145.method1172("Spieler kann nicht gefunden werden: ", 45);

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)I")
    public static final int method228(int arg0) {
        field586++;
        if (arg0 != 6) {
            method231(19);
        }
        return 6;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIII)V")
    public static final void method229(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field585++;
        if (class132.field3110 == arg0 && class54.field1203 == arg3 && (class107.field2520 == arg2 || !class65.field1399)) {
            return;
        }
        class132.field3110 = arg0;
        class54.field1203 = arg3;
        class107.field2520 = arg2;
        if (!class65.field1399) {
            class107.field2520 = 0;
        }
        class73.method534((byte) 73, 25);
        class105.method843(true, class47.field1073, true);
        int var6 = class91.field2145;
        int var7 = class52.field1176;
        class91.field2145 = arg0 * 8 - 48;
        class52.field1176 = (arg3 - 6) * 8;
        int var8 = class91.field2145 - var6;
        int var9 = class52.field1176 - var7;
        int var10 = class52.field1176;
        int var11 = class91.field2145;
        for (int var12 = 0; var12 < 32768; var12++) {
            class67 var28 = class122.field2846[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field3560[var29] -= var8;
                    var28.field3581[var29] -= var9;
                }
                var28.field3580 -= var8 * 128;
                var28.field3578 -= var9 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class13 var26 = class154.field3518[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field3560[var27] -= var8;
                    var26.field3581[var27] -= var9;
                }
                var26.field3580 -= var8 * 128;
                var26.field3578 -= var9 * 128;
            }
        }
        class62.field1331 = arg2;
        byte var14 = 0;
        class24.field555.method1209(arg1, 128, false, arg4);
        int var15 = arg5;
        byte var16 = 0;
        byte var17 = 104;
        byte var18 = 104;
        if (var8 < 0) {
            var17 = -1;
            var14 = 103;
            var15 = -1;
        }
        byte var19 = 1;
        if (var9 < 0) {
            var18 = -1;
            var16 = 103;
            var19 = -1;
        }
        for (int var20 = var14; var20 != var17; var20 += var15) {
            for (int var22 = var16; var22 != var18; var22 += var19) {
                int var23 = var9 + var22;
                int var24 = var8 + var20;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var24 >= 0 && var23 >= 0 && var24 < 104 && var23 < 104) {
                        class93.field2197[var25][var20][var22] = class93.field2197[var25][var24][var23];
                    } else {
                        class93.field2197[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class16 var21 = (class16) class41.field958.method512(0); var21 != null; var21 = (class16) class41.field958.method520((byte) 75)) {
            var21.field328 -= var8;
            var21.field315 -= var9;
            if (var21.field328 < 0 || var21.field315 < 0 || var21.field328 >= 104 || var21.field315 >= 104) {
                var21.method674(32);
            }
        }
        class151.field3470 = false;
        class139.field3224 = 0;
        if (class18.field369 != 0) {
            class108.field2554 -= var9;
            class18.field369 -= var8;
        }
        class4.field88 = -1;
        class86.field2022.method507(-86);
        class142.field3305.method507(-83);
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)Lsd;")
    public static final class129 method230(int arg0) {
        field587++;
        try {
            if (arg0 != 0) {
                method229(-54, -26, 103, -22, -37, -59);
            }
            return (class129) Class.forName("ia").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(I[B)V")
    public class26(int arg0, byte[] arg1) {
        this.field593 = arg0;
        class127 var3 = new class127(arg1);
        this.field590 = var3.method1011(38);
        this.field581 = new int[this.field590][];
        this.field583 = new int[this.field590];
        for (int var4 = 0; var4 < this.field590; var4++) {
            this.field583[var4] = var3.method1011(44);
        }
        for (int var5 = 0; var5 < this.field590; var5++) {
            this.field581[var5] = new int[var3.method1011(118)];
        }
        for (int var6 = 0; var6 < this.field590; var6++) {
            for (int var7 = 0; var7 < this.field581[var6].length; var7++) {
                this.field581[var6][var7] = var3.method1011(55);
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)V")
    public static void method231(int arg0) {
        if (arg0 != -21006) {
            method230(-60);
        }
        field584 = null;
        field589 = null;
        field592 = null;
        field582 = null;
        field588 = null;
    }
}
