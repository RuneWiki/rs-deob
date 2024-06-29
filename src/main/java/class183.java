import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class183 {

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "[I")
    private int[] field3590;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "[I")
    private int[] field3589;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "Ldb;")
    private class33 field3596;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "Ldb;")
    private class33 field3602;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "[Ldb;")
    private class33[] field3585;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "Lrd;")
    public static class173 field3586 = class133.method843("Benutzeroberfl-=che geladen)3", -101);

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "Lrd;")
    private static class173 field3599 = class133.method843("M", 39);

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "Lrd;")
    private static class173 field3598 = class133.method843(" has logged out)3", 108);

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "Lrd;")
    public static class173 field3597 = field3599;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "Lrd;")
    public static class173 field3592 = field3599;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "Lrd;")
    public static class173 field3588 = field3598;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "[Lve;")
    public static class212[] field3600 = new class212[2048];

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public static int field3601 = 0;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "Lwg;")
    public static class222 field3587;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IDLaa;ZLbc;IB)[I")
    public final int[] method1241(int arg0, double arg1, class2 arg2, boolean arg3, class14 arg4, int arg5, byte arg6) {
        class140.method872(arg1, (byte) 106);
        field3591++;
        class169.field3276 = arg4;
        class60.field1168 = arg2;
        class194.method1287(arg0, arg5, (byte) 25);
        int[] var9 = new int[arg0 * arg5];
        if (arg6 < 60) {
            this.method1241(67, -1.165106277534799D, null, true, null, 91, (byte) 118);
        }
        for (int var10 = 0; var10 < this.field3585.length; var10++) {
            this.field3585[var10].method260(arg5, arg0, (byte) 119);
        }
        int var11;
        byte var12;
        int var13;
        if (arg3) {
            var11 = arg0 - 1;
            var12 = -1;
            var13 = -1;
        } else {
            var13 = arg0;
            var11 = 0;
            var12 = 1;
        }
        int var14 = 0;
        for (int var15 = 0; var15 < arg5; var15++) {
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field3596.field729) {
                int[] var21 = this.field3596.method175(var15, (byte) 26);
                var18 = var21;
                var19 = var21;
                var20 = var21;
            } else {
                int[][] var17 = this.field3596.method178(118, var15);
                var18 = var17[2];
                var19 = var17[1];
                var20 = var17[0];
            }
            for (int var22 = var11; var22 != var13; var22 += var12) {
                int var23 = var20[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class30.field612[var23];
                int var25 = var19[var22] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                int var26 = var18[var22] >> 4;
                if (var25 < 0) {
                    var25 = 0;
                }
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class30.field612[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class30.field612[var26];
                var9[var14++] = (var24 << 16) + (var27 << 8) + var28;
            }
        }
        for (int var16 = 0; var16 < this.field3585.length; var16++) {
            this.field3585[var16].method261((byte) 80);
        }
        return var9;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIZ)Lsa;")
    public static final class180 method1242(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        long var6 = ((long) arg2 << 16) + (long) arg1 + ((long) arg3 << 40) + ((long) arg4 << 38);
        field3594++;
        if (!arg5) {
            class180 var8 = (class180) class30.field605.method46(var6, 26580);
            if (var8 != null) {
                return var8;
            }
        }
        class19 var9 = class195.method1298(1639, arg1);
        if (arg2 > 1 && var9.field428 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (var9.field390[var11] <= arg2 && var9.field390[var11] != 0) {
                    var10 = var9.field428[var11];
                }
            }
            if (var10 != -1) {
                var9 = class195.method1298(1639, var10);
            }
        }
        class102 var12 = var9.method169((byte) -17);
        if (var12 == null) {
            return null;
        }
        class180 var13 = null;
        if (var9.field408 != -1) {
            var13 = method1242(9, var9.field421, 10, 0, 1, true);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class27.field561;
        int var15 = class27.field567;
        int var16 = class27.field566;
        int[] var17 = new int[4];
        class27.method205(var17);
        class180 var18 = new class180(36, 32);
        class27.method221(var18.field3546, 36, 32);
        class27.method209();
        class72.method442();
        class72.method436(16, 16);
        int var19 = var9.field397;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg4 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        class72.field1406 = false;
        int var20 = class72.field1396[var9.field424] * var19 >> 16;
        int var21 = class72.field1404[var9.field424] * var19 >> 16;
        var12.method1404();
        var12.method632(0, var9.field443, var9.field384, var9.field424, var9.field403, var20 + var9.field429 - var12.field758 / 2, var9.field429 + var21);
        if (arg4 >= 1) {
            var18.method1229(1);
        }
        if (arg4 >= 2) {
            var18.method1229(16777215);
        }
        if (arg3 != 0) {
            var18.method1232(arg3);
        }
        class27.method221(var18.field3546, 36, 32);
        if (var9.field408 != -1) {
            var13.method1222(0, 0);
        }
        if (!arg5 && (var9.field441 == 1 || arg2 != 1) && arg2 != -1) {
            class121.field2285.method534(class155.method1026(arg2, false), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            class30.field605.method52(-3583, var18, var6);
        }
        class27.method221(var14, var16, var15);
        class27.method215(var17);
        class72.method442();
        class72.field1406 = true;
        return arg0 == 9 ? var18 : null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
    public static void method1243(boolean arg0) {
        field3587 = null;
        field3586 = null;
        field3600 = null;
        field3599 = null;
        if (!arg0) {
            method1243(false);
        }
        field3592 = null;
        field3598 = null;
        field3597 = null;
        field3588 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Laa;Lbc;I)Z")
    public final boolean method1244(class2 arg0, class14 arg1, int arg2) {
        field3593++;
        for (int var4 = 0; var4 < this.field3590.length; var4++) {
            if (!arg1.method126(this.field3590[var4], -21866)) {
                return false;
            }
        }
        for (int var5 = arg2; var5 < this.field3589.length; var5++) {
            if (!arg0.method18(this.field3589[var5], false)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    public class183() {
        this.field3590 = new int[0];
        this.field3589 = new int[0];
        this.field3596 = new class191();
        this.field3596.field725 = 1;
        this.field3602 = new class191();
        this.field3602.field725 = 1;
        this.field3585 = new class33[] { this.field3596, this.field3602 };
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lmb;)V")
    public class183(class121 arg0) {
        int var2 = arg0.method751((byte) -59);
        class112 var3 = new class112(64);
        class112 var4 = new class112(64);
        class112 var5 = new class112(64);
        int[][] var6 = new int[var2][];
        this.field3585 = new class33[var2];
        for (int var7 = 0; var7 < var2; var7++) {
            class33 var21 = class123.method796(arg0, true);
            int var22 = var21.method264(-122);
            int var23 = var21.method258(-83);
            if (var22 >= 0 && var22 >= 0 && var4.method677(-2755, (long) var22) == null) {
                var4.method675((long) var22, new class76(var22), false);
            }
            if (var23 >= 0 && var23 >= 0 && var5.method677(-2755, (long) var23) == null) {
                var5.method675((long) var23, new class76(var23), false);
            }
            int var26 = var21.field727.length;
            var6[var7] = new int[var26];
            for (int var27 = 0; var27 < var26; var27++) {
                var6[var7][var27] = arg0.method751((byte) -66);
            }
            var3.method675((long) var21.field734, var21, false);
            this.field3585[var7] = var21;
        }
        for (int var8 = 0; var8 < var2; var8++) {
            class33 var17 = this.field3585[var8];
            int var18 = var17.field727.length;
            for (int var19 = 0; var19 < var18; var19++) {
                class33 var20 = (class33) var3.method677(-2755, (long) var6[var8][var19]);
                var17.field727[var19] = var20;
            }
            var6[var8] = null;
        }
        Object var9 = null;
        this.field3596 = (class33) var3.method677(-2755, (long) arg0.method751((byte) -29));
        this.field3602 = (class33) var3.method677(-2755, (long) arg0.method751((byte) -26));
        this.field3590 = new int[var4.method681(-67)];
        this.field3589 = new int[var5.method681(-119)];
        Object var10 = null;
        class129[] var11 = new class129[var4.method681(-79)];
        class129[] var12 = new class129[var5.method681(-102)];
        var4.method680(-122, var11);
        Object var13 = null;
        var5.method680(-116, var12);
        for (int var14 = 0; var14 < var11.length; var14++) {
            this.field3590[var14] = ((class76) var11[var14]).field1495;
        }
        Object var15 = null;
        for (int var16 = 0; var16 < var12.length; var16++) {
            this.field3589[var16] = ((class76) var12[var16]).field1495;
        }
    }
}
