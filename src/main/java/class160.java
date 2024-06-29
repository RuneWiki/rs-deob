import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class160 {

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "[I")
    private int[] field3063;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "[I")
    private int[] field3060;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "Lgd;")
    private class59 field3057;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "Lgd;")
    private class59 field3059;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "[Lgd;")
    private class59[] field3067;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    public static int field3064 = 0;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    public static int field3071 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "[[I")
    public static int[][] field3070 = new int[104][104];

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "Lb;")
    public static class11 field3055 = new class11(50);

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
    public static int field3073 = 0;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "Lb;")
    public static class11 field3072 = new class11(64);

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "Lvd;")
    public static class193 field3065;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "Lhb;")
    public static class66 field3068;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
    public static void method1084(byte arg0) {
        field3065 = null;
        if (arg0 < 20) {
            method1088((byte) 57, null);
        }
        field3068 = null;
        field3070 = null;
        field3055 = null;
        field3072 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILog;IILf;ZD)[I")
    public final int[] method1085(int arg0, class133 arg1, int arg2, int arg3, class47 arg4, boolean arg5, double arg6) {
        field3062++;
        class132.field2588 = arg4;
        class28.field492 = arg1;
        class202.method1330(arg3, arg0 + 25101, arg2);
        int[] var9 = new int[arg2 * arg3];
        for (int var10 = 0; var10 < this.field3067.length; var10++) {
            this.field3067[var10].method503(arg3, 19284, arg2);
        }
        int var11;
        int var12;
        byte var13;
        if (arg5) {
            var11 = -1;
            var12 = arg2 - 1;
            var13 = -1;
        } else {
            var13 = 1;
            var12 = 0;
            var11 = arg2;
        }
        int var14 = 0;
        int var15 = 0;
        if (arg0 != -1) {
            this.method1085(-28, null, 72, -122, null, true, -1.3932512882510002D);
        }
        while (var15 < arg3) {
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field3057.field1216) {
                int[] var21 = this.field3057.method36(var15, (byte) -125);
                var19 = var21;
                var20 = var21;
                var18 = var21;
            } else {
                int[][] var17 = this.field3057.method37(true, var15);
                var18 = var17[2];
                var19 = var17[1];
                var20 = var17[0];
            }
            for (int var22 = var12; var22 != var11; var22 += var13) {
                double var23 = Math.pow((double) var20[var22] / 4096.0D, arg6);
                int var25 = (int) (var23 * 256.0D);
                double var26 = Math.pow((double) var19[var22] / 4096.0D, arg6);
                double var28 = Math.pow((double) var18[var22] / 4096.0D, arg6);
                int var30 = (int) (var28 * 256.0D);
                int var31 = (int) (var26 * 256.0D);
                if (var30 > 255) {
                    var30 = 255;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var30 < 0) {
                    var30 = 0;
                }
                if (var31 > 255) {
                    var31 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                if (var31 < 0) {
                    var31 = 0;
                }
                var9[var14++] = (var31 << 8) + (var25 << 16) + var30;
            }
            var15++;
        }
        for (int var16 = 0; var16 < this.field3067.length; var16++) {
            this.field3067[var16].method506(true);
        }
        return var9;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
    public class160() {
        this.field3063 = new int[0];
        this.field3060 = new int[0];
        this.field3057 = new class9();
        this.field3059 = new class9();
        this.field3067 = new class59[] { this.field3057, this.field3059 };
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lff;)V")
    public class160(class53 arg0) {
        int var2 = arg0.method400(255);
        class29 var3 = new class29(64);
        class29 var4 = new class29(64);
        class29 var5 = new class29(64);
        int[][] var6 = new int[var2][];
        this.field3067 = new class59[var2];
        for (int var7 = 0; var7 < var2; var7++) {
            class59 var21 = class184.method1239(73, arg0);
            int var22 = var21.method501((byte) 78);
            int var23 = var21.method505((byte) 66);
            if (var22 >= 0 && var22 >= 0 && var4.method224(-1, (long) var22) == null) {
                var4.method216(new class39(var22), 12682, (long) var22);
            }
            if (var23 >= 0 && var23 >= 0 && var5.method224(-1, (long) var23) == null) {
                var5.method216(new class39(var23), 12682, (long) var23);
            }
            int var26 = var21.field1214.length;
            var6[var7] = new int[var26];
            for (int var27 = 0; var27 < var26; var27++) {
                var6[var7][var27] = arg0.method400(255);
            }
            var3.method216(var21, 12682, (long) var21.field1227);
            this.field3067[var7] = var21;
        }
        for (int var8 = 0; var8 < var2; var8++) {
            class59 var17 = this.field3067[var8];
            int var18 = var17.field1214.length;
            for (int var19 = 0; var19 < var18; var19++) {
                class59 var20 = (class59) var3.method224(-1, (long) var6[var8][var19]);
                var17.field1214[var19] = var20;
            }
            var6[var8] = null;
        }
        Object var9 = null;
        this.field3057 = (class59) var3.method224(-1, (long) arg0.method400(255));
        this.field3059 = (class59) var3.method224(-1, (long) arg0.method400(255));
        this.field3063 = new int[var4.method217(-86)];
        Object var10 = null;
        this.field3060 = new int[var5.method217(77)];
        class130[] var11 = new class130[var4.method217(89)];
        class130[] var12 = new class130[var5.method217(65)];
        var4.method218(0, var11);
        Object var13 = null;
        var5.method218(0, var12);
        for (int var14 = 0; var14 < var11.length; var14++) {
            this.field3063[var14] = ((class39) var11[var14]).field700;
        }
        for (int var15 = 0; var15 < var12.length; var15++) {
            this.field3060[var15] = ((class39) var12[var15]).field700;
        }
        Object var16 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZZBIZ)Lcb;")
    public static final class22 method1086(boolean arg0, boolean arg1, byte arg2, int arg3, boolean arg4) {
        field3058++;
        class86 var5 = null;
        int var6 = 27 % ((-arg2 - 50) / 58);
        if (class194.field3845 != null) {
            var5 = new class86(arg3, class194.field3845, class90.field1768[arg3], 1000000);
        }
        return new class22(var5, class63.field1318, arg3, arg1, arg4, arg0);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILog;Lf;)Z")
    public final boolean method1087(int arg0, class133 arg1, class47 arg2) {
        field3069++;
        for (int var4 = 0; var4 < this.field3063.length; var4++) {
            if (!arg2.method367(this.field3063[var4], true)) {
                return false;
            }
        }
        for (int var5 = 0; var5 < this.field3060.length; var5++) {
            if (!arg1.method820((byte) -95, this.field3060[var5])) {
                return false;
            }
        }
        if (arg0 != -1) {
            method1086(false, true, (byte) 13, -123, false);
        }
        return true;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method1088(byte arg0, byte[] arg1) {
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class71.method569(arg1, 0, var3, 0, var2);
        field3066++;
        if (arg0 > -9) {
            method1088((byte) -79, null);
        }
        return var3;
    }
}
