import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class209 {

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "[I")
    private int[] field4068;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "[I")
    private int[] field4075;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "Lp;")
    private class139 field4066;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "Lp;")
    private class139 field4071;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "[Lp;")
    private class139[] field4073;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "Lrf;")
    public static class163 field4067 = class53.method392(-42, "Mem:");

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    public static int field4079 = 0;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "[Lrh;")
    public static class165[] field4078;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lu;IIB)Lrh;")
    public static final class165 method1360(class184 arg0, int arg1, int arg2, byte arg3) {
        if (arg3 >= -23) {
            return null;
        } else {
            field4070++;
            return class102.method700(arg2, arg0, (byte) -106, arg1) ? class73.method517(true) : null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILu;ZIIDLth;)[I")
    public final int[] method1361(int arg0, class184 arg1, boolean arg2, int arg3, int arg4, double arg5, class183 arg6) {
        class186.field3710 = arg1;
        int[] var9 = new int[arg0 * arg4];
        class21.field367 = arg6;
        class37.method233(arg4, -5, arg0);
        for (int var10 = 0; var10 < this.field4073.length; var10++) {
            this.field4073[var10].method913(true, arg4, arg0);
        }
        field4077++;
        if (arg3 >= -72) {
            method1365(121);
        }
        int var11 = 0;
        int var12;
        byte var13;
        int var14;
        if (arg2) {
            var12 = arg0 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var12 = 0;
            var13 = 1;
            var14 = arg0;
        }
        for (int var15 = 0; var15 < arg4; var15++) {
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field4066.field2872) {
                int[] var17 = this.field4066.method61(var15, 7451);
                var18 = var17;
                var19 = var17;
                var20 = var17;
            } else {
                int[][] var21 = this.field4066.method77(71, var15);
                var18 = var21[0];
                var19 = var21[1];
                var20 = var21[2];
            }
            for (int var22 = var12; var22 != var14; var22 += var13) {
                double var23 = Math.pow((double) var18[var22] / 4096.0D, arg5);
                double var25 = Math.pow((double) var19[var22] / 4096.0D, arg5);
                int var27 = (int) (var25 * 256.0D);
                int var28 = (int) (var23 * 256.0D);
                if (var28 > 255) {
                    var28 = 255;
                }
                double var29 = Math.pow((double) var20[var22] / 4096.0D, arg5);
                if (var27 > 255) {
                    var27 = 255;
                }
                int var31 = (int) (var29 * 256.0D);
                if (var27 < 0) {
                    var27 = 0;
                }
                if (var31 > 255) {
                    var31 = 255;
                }
                if (var28 < 0) {
                    var28 = 0;
                }
                if (var31 < 0) {
                    var31 = 0;
                }
                var9[var11++] = (var28 << 16) - (-(var27 << 8) - var31);
            }
        }
        for (int var16 = 0; var16 < this.field4073.length; var16++) {
            this.field4073[var16].method916((byte) -71);
        }
        return var9;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
    public static void method1362(byte arg0) {
        if (arg0 > 114) {
            field4067 = null;
            field4078 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lu;Lrf;Lu;ZLrf;)Lne;")
    public static final class126 method1363(class184 arg0, class163 arg1, class184 arg2, boolean arg3, class163 arg4) {
        if (arg3) {
            method1363(null, null, null, true, null);
        }
        field4076++;
        int var5 = arg0.method1228(97, arg1);
        int var6 = arg0.method1231(arg4, var5, 2);
        return class148.method965(var6, var5, arg2, 50, arg0);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZIIII)Lrh;")
    public static final class165 method1364(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field4069++;
        long var6 = ((long) arg4 << 38) + ((long) arg5 << 40) + ((long) arg2 << 16) + (long) arg0;
        if (!arg1) {
            class165 var8 = (class165) class27.field496.method401(var6, (byte) 91);
            if (var8 != null) {
                return var8;
            }
        }
        class4 var9 = class97.method669(-127, arg0);
        if (arg2 > 1 && var9.field58 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg2 >= var9.field81[var11] && var9.field81[var11] != 0) {
                    var10 = var9.field58[var11];
                }
            }
            if (var10 != -1) {
                var9 = class97.method669(-97, var10);
            }
        }
        class30 var12 = var9.method40(4896);
        if (var12 == null) {
            return null;
        }
        class165 var13 = null;
        if (var9.field53 != -1) {
            var13 = method1364(var9.field54, true, 10, 118, 1, 0);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class173.field3502;
        int var15 = class173.field3504;
        int var16 = class173.field3505;
        int[] var17 = new int[4];
        class173.method1160(var17);
        class165 var18 = new class165(36, 32);
        class173.method1161(var18.field3370, 36, 32);
        class173.method1169();
        class1.method4();
        class1.method16(16, 16);
        class1.field19 = false;
        int var19 = var9.field92;
        if (arg1) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg4 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class1.field21[var9.field84] * var19 >> 16;
        int var21 = class1.field8[var9.field84] * var19 >> 16;
        var12.method635();
        if (arg3 <= 95) {
            return null;
        }
        var12.method174(0, var9.field68, var9.field96, var9.field84, var9.field63, var9.field70 + var20 - var12.field3376 / 2, var9.field70 + var21);
        if (arg4 >= 1) {
            var18.method1123(1);
        }
        if (arg4 >= 2) {
            var18.method1123(16777215);
        }
        if (arg5 != 0) {
            var18.method1127(arg5);
        }
        class173.method1161(var18.field3370, 36, 32);
        if (var9.field53 != -1) {
            var13.method1106(0, 0);
        }
        if (!arg1 && (var9.field87 == 1 || arg2 != 1) && arg2 != -1) {
            class127.field2614.method577(class96.method664(arg2, (byte) 118), 0, 9, 16776960, 1);
        }
        if (!arg1) {
            class27.field496.method398(var18, var6, (byte) 77);
        }
        class173.method1161(var14, var15, var16);
        class173.method1175(var17);
        class1.method4();
        class1.field19 = true;
        return var18;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    public static final void method1365(int arg0) {
        class146.field3000.method399(false);
        class195.field3852.method399(false);
        field4080++;
        if (arg0 != 0) {
            method1360(null, 105, -12, (byte) 19);
        }
        class118.field2483.method399(false);
        class112.field2372.method399(false);
        class92.field2001.method399(false);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILth;Lu;)Z")
    public final boolean method1366(int arg0, class183 arg1, class184 arg2) {
        field4065++;
        int var4 = -70 / ((arg0 - 37) / 56);
        for (int var5 = 0; var5 < this.field4075.length; var5++) {
            if (!arg2.method1237(this.field4075[var5], -19816)) {
                return false;
            }
        }
        for (int var6 = 0; var6 < this.field4068.length; var6++) {
            if (!arg1.method1221((byte) 91, this.field4068[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
    public class209() {
        this.field4068 = new int[0];
        this.field4075 = new int[0];
        this.field4066 = new class7();
        this.field4071 = new class7();
        this.field4073 = new class139[] { this.field4066, this.field4071 };
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lfa;)V")
    public class209(class52 arg0) {
        int var2 = arg0.method344(255);
        class65 var3 = new class65(64);
        class65 var4 = new class65(64);
        class65 var5 = new class65(64);
        this.field4073 = new class139[var2];
        int[][] var6 = new int[var2][];
        for (int var7 = 0; var7 < var2; var7++) {
            class139 var21 = class29.method172(-28262, arg0);
            int var22 = var21.method897((byte) 90);
            int var23 = var21.method919(false);
            if (var22 >= 0 && var22 >= 0 && var4.method465((long) var22, (byte) 70) == null) {
                var4.method462(-23, new class17(var22), (long) var22);
            }
            if (var23 >= 0 && var23 >= 0 && var5.method465((long) var23, (byte) 87) == null) {
                var5.method462(112, new class17(var23), (long) var23);
            }
            int var26 = var21.field2870.length;
            var6[var7] = new int[var26];
            for (int var27 = 0; var27 < var26; var27++) {
                var6[var7][var27] = arg0.method344(255);
            }
            var3.method462(115, var21, (long) var21.field2871);
            this.field4073[var7] = var21;
        }
        for (int var8 = 0; var8 < var2; var8++) {
            class139 var17 = this.field4073[var8];
            int var18 = var17.field2870.length;
            for (int var19 = 0; var19 < var18; var19++) {
                class139 var20 = (class139) var3.method465((long) var6[var8][var19], (byte) 80);
                var17.field2870[var19] = var20;
            }
            var6[var8] = null;
        }
        this.field4066 = (class139) var3.method465((long) arg0.method344(255), (byte) -34);
        this.field4071 = (class139) var3.method465((long) arg0.method344(255), (byte) 82);
        Object var9 = null;
        Object var10 = null;
        this.field4075 = new int[var4.method461(0)];
        this.field4068 = new int[var5.method461(0)];
        class90[] var11 = new class90[var4.method461(0)];
        class90[] var12 = new class90[var5.method461(0)];
        var4.method463(-40, var11);
        var5.method463(-114, var12);
        Object var13 = null;
        Object var14 = null;
        for (int var15 = 0; var15 < var11.length; var15++) {
            this.field4075[var15] = ((class17) var11[var15]).field300;
        }
        for (int var16 = 0; var16 < var12.length; var16++) {
            this.field4068[var16] = ((class17) var12[var16]).field300;
        }
    }
}
