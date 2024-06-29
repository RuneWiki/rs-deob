import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class149 {

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "[I")
    private int[] field2671;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "[I")
    private int[] field2672;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "Lba;")
    private class12 field2667;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "Lba;")
    private class12 field2673;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "[Lba;")
    private class12[] field2668;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "Lnd;")
    public static class127 field2675 = new class127(64);

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "Ltg;")
    private static class184 field2677 = class135.method812("Loading textures )2 ", 3);

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "Ltg;")
    public static class184 field2679 = field2677;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "Z")
    public static boolean field2678;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "[Loe;")
    public static class137[] field2676;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "[[Lrh;")
    public static class167[][] field2670;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public static void method910(int arg0) {
        if (arg0 != 0) {
            method914(55, null, null, -35);
        }
        field2676 = null;
        field2679 = null;
        field2677 = null;
        field2675 = null;
        field2670 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZLvb;IDILtf;Z)[I")
    public final int[] method911(boolean arg0, class197 arg1, int arg2, double arg3, int arg4, class183 arg5, boolean arg6) {
        class15.field291 = arg5;
        client.field498 = arg1;
        int[] var9 = new int[arg2 * arg4];
        class191.method1222(arg4, arg2, false);
        field2665++;
        for (int var10 = 0; var10 < this.field2668.length; var10++) {
            this.field2668[var10].method81(arg4, (byte) -123, arg2);
        }
        int var11;
        int var12;
        byte var13;
        if (arg6) {
            var12 = arg2 - 1;
            var11 = -1;
            var13 = -1;
        } else {
            var11 = arg2;
            var12 = 0;
            var13 = 1;
        }
        int var14 = 0;
        for (int var15 = 0; var15 < arg4; var15++) {
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field2667.field211) {
                int[] var21 = this.field2667.method62(var15, (byte) 17);
                var19 = var21;
                var20 = var21;
                var18 = var21;
            } else {
                int[][] var17 = this.field2667.method80(var15, 127);
                var18 = var17[1];
                var19 = var17[0];
                var20 = var17[2];
            }
            for (int var22 = var12; var22 != var11; var22 += var13) {
                double var23 = Math.pow((double) var19[var22] / 4096.0D, arg3);
                double var25 = Math.pow((double) var18[var22] / 4096.0D, arg3);
                double var27 = Math.pow((double) var20[var22] / 4096.0D, arg3);
                int var29 = (int) (var27 * 256.0D);
                if (var29 > 255) {
                    var29 = 255;
                }
                int var30 = (int) (var23 * 256.0D);
                int var31 = (int) (var25 * 256.0D);
                if (var31 > 255) {
                    var31 = 255;
                }
                if (var31 < 0) {
                    var31 = 0;
                }
                if (var30 > 255) {
                    var30 = 255;
                }
                if (var30 < 0) {
                    var30 = 0;
                }
                if (var29 < 0) {
                    var29 = 0;
                }
                var9[var14++] = (var30 << 16) + (var31 << 8) + var29;
            }
        }
        if (!arg0) {
            method913(null, null, null, 44);
        }
        for (int var16 = 0; var16 < this.field2668.length; var16++) {
            this.field2668[var16].method74(-23224);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ltf;BLvb;)Z")
    public final boolean method912(class183 arg0, byte arg1, class197 arg2) {
        field2674++;
        for (int var4 = 0; var4 < this.field2671.length; var4++) {
            if (!arg2.method1271(this.field2671[var4], -6039)) {
                return false;
            }
        }
        int var5 = 0;
        if (arg1 > -75) {
            return true;
        }
        while (var5 < this.field2672.length) {
            if (!arg0.method359(25, this.field2672[var5])) {
                return false;
            }
            var5++;
        }
        return true;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lvb;Ltg;Ltg;I)[Loe;")
    public static final class137[] method913(class197 arg0, class184 arg1, class184 arg2, int arg3) {
        field2666++;
        int var4 = arg0.method1261(arg1, (byte) -120);
        if (arg3 != -22537) {
            field2678 = false;
        }
        int var5 = arg0.method1273(arg2, 111, var4);
        return class32.method203(var4, var5, arg3 ^ 0xFFFFA78F, arg0);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILtg;Ltg;I)V")
    public static final void method914(int arg0, class184 arg1, class184 arg2, int arg3) {
        field2669++;
        int var4 = -94 / (-arg3 / 36);
        class37.method224(null, -105, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method915(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class113 var20 = new class113(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class190.field3704[var21][arg1][arg2] == null) {
                    class190.field3704[var21][arg1][arg2] = new class90(var21, arg1, arg2);
                }
            }
            class190.field3704[arg0][arg1][arg2].field1679 = var20;
        } else if (arg3 == 1) {
            class113 var22 = new class113(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class190.field3704[var23][arg1][arg2] == null) {
                    class190.field3704[var23][arg1][arg2] = new class90(var23, arg1, arg2);
                }
            }
            class190.field3704[arg0][arg1][arg2].field1679 = var22;
        } else {
            class30 var24 = new class30(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class190.field3704[var25][arg1][arg2] == null) {
                    class190.field3704[var25][arg1][arg2] = new class90(var25, arg1, arg2);
                }
            }
            class190.field3704[arg0][arg1][arg2].field1691 = var24;
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
    public class149() {
        this.field2671 = new int[0];
        this.field2672 = new int[0];
        this.field2667 = new class99();
        this.field2673 = new class99();
        this.field2668 = new class12[] { this.field2667, this.field2673 };
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lka;)V")
    public class149(class97 arg0) {
        int var2 = arg0.method588((byte) -79);
        class9 var3 = new class9(64);
        class9 var4 = new class9(64);
        class9 var5 = new class9(64);
        int[][] var6 = new int[var2][];
        this.field2668 = new class12[var2];
        for (int var7 = 0; var7 < var2; var7++) {
            class12 var21 = class67.method393(arg0, 0);
            int var22 = var21.method82(17849);
            int var23 = var21.method73(-1);
            if (var22 >= 0 && var22 >= 0 && var4.method51((long) var22, -98) == null) {
                var4.method55((byte) -110, new class20(var22), (long) var22);
            }
            if (var23 >= 0 && var23 >= 0 && var5.method51((long) var23, -109) == null) {
                var5.method55((byte) -123, new class20(var23), (long) var23);
            }
            int var26 = var21.field215.length;
            var6[var7] = new int[var26];
            for (int var27 = 0; var27 < var26; var27++) {
                var6[var7][var27] = arg0.method588((byte) -85);
            }
            var3.method55((byte) -94, var21, (long) var21.field226);
            this.field2668[var7] = var21;
        }
        for (int var8 = 0; var8 < var2; var8++) {
            class12 var17 = this.field2668[var8];
            int var18 = var17.field215.length;
            for (int var19 = 0; var19 < var18; var19++) {
                class12 var20 = (class12) var3.method51((long) var6[var8][var19], 98);
                var17.field215[var19] = var20;
            }
            var6[var8] = null;
        }
        this.field2667 = (class12) var3.method51((long) arg0.method588((byte) -106), -113);
        this.field2673 = (class12) var3.method51((long) arg0.method588((byte) -114), -105);
        Object var9 = null;
        this.field2671 = new int[var4.method56((byte) -62)];
        this.field2672 = new int[var5.method56((byte) -75)];
        Object var10 = null;
        class132[] var11 = new class132[var4.method56((byte) 120)];
        class132[] var12 = new class132[var5.method56((byte) 118)];
        var4.method53(var11, 0);
        var5.method53(var12, 0);
        Object var13 = null;
        for (int var14 = 0; var14 < var11.length; var14++) {
            this.field2671[var14] = ((class20) var11[var14]).field384;
        }
        Object var15 = null;
        for (int var16 = 0; var16 < var12.length; var16++) {
            this.field2672[var16] = ((class20) var12[var16]).field384;
        }
    }
}
