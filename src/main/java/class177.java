import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class177 {

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "[I")
    private int[] field3202;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "[I")
    private int[] field3203;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "Lga;")
    private class170 field3195;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "Lga;")
    private class170 field3197;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "[Lga;")
    private class170[] field3188;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "Lqk;")
    public static class207 field3187 = class24.method212(255, "overlay2");

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "Lqk;")
    public static class207 field3196 = class24.method212(255, "::breakcon");

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field3190 = 0;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "[S")
    public static short[] field3192 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
    public static int field3201 = 0;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "Ldk;")
    public static class275 field3194 = new class275(32);

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Lhk;")
    public static class124 field3185;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZIIZ)V")
    public static final void method1262(boolean arg0, int arg1, int arg2, boolean arg3) {
        field3191++;
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class286.field5020 = arg3;
        class275.field4822 = arg2;
        if (arg0) {
            field3192 = null;
        }
        class273.field4799 = arg1;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)J")
    public static final long method1263(int arg0, int arg1, int arg2) {
        class174 var3 = class82.field1498[arg0][arg1][arg2];
        return var3 == null || var3.field3142 == null ? 0L : var3.field3142.field560;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
    public static final void method1264(byte arg0) {
        field3199++;
        for (class196 var1 = (class196) class250.field4527.method922((byte) 97); var1 != null; var1 = (class196) class250.field4527.method928(arg0 - 38)) {
            if (var1.field3456 == -1) {
                var1.field3438 = 0;
                class286.method1952(arg0 - 24980, var1);
            } else {
                var1.method1346((byte) -16);
            }
        }
        if (arg0 != -19) {
            field3185 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(DZILfi;ZIILpk;)[I")
    public final int[] method1265(double arg0, boolean arg1, int arg2, class109 arg3, boolean arg4, int arg5, int arg6, class99 arg7) {
        class161.method1170(true, arg0);
        class225.field4099 = arg3;
        class85.field1542 = arg7;
        int[] var10 = new int[arg2 * arg5];
        class115.method814(arg2, false, arg5);
        field3193++;
        for (int var11 = 0; var11 < this.field3188.length; var11++) {
            this.field3188[var11].method1222(arg2, arg5, (byte) 15);
        }
        if (arg6 <= 42) {
            return null;
        }
        int var12;
        byte var13;
        int var14;
        if (arg1) {
            var14 = arg5 - 1;
            var13 = -1;
            var12 = -1;
        } else {
            var12 = arg5;
            var13 = 1;
            var14 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg2; var16++) {
            if (arg4) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field3195.field2998) {
                int[] var22 = this.field3195.method31((byte) -30, var16);
                var20 = var22;
                var21 = var22;
                var19 = var22;
            } else {
                int[][] var18 = this.field3195.method32(var16, false);
                var19 = var18[0];
                var20 = var18[1];
                var21 = var18[2];
            }
            for (int var23 = var14; var23 != var12; var23 += var13) {
                int var24 = var20[var23] >> 4;
                int var25 = var19[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                int var26 = var21[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var27 = class192.field3392[var26];
                if (var25 < 0) {
                    var25 = 0;
                }
                int var28 = class192.field3392[var24];
                int var29 = class192.field3392[var25];
                var10[var15++] = (var28 << 8) + (var29 << 16) + var27;
                if (arg4) {
                    var15 += arg5 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field3188.length; var17++) {
            this.field3188[var17].method256(-27011);
        }
        return var10;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)I")
    public static final int method1266(int arg0) {
        field3186++;
        if (arg0 != -2) {
            field3201 = 75;
        }
        return class51.field997 && class165.field2920[81] && class268.field4751 > 2 ? class131.field2273[class268.field4751 - 2] : class131.field2273[class268.field4751 - 1];
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
    public static void method1267(int arg0) {
        if (arg0 != 19454) {
            field3190 = -114;
        }
        field3187 = null;
        field3192 = null;
        field3196 = null;
        field3194 = null;
        field3185 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILpk;Lfi;)Z")
    public final boolean method1268(int arg0, class99 arg1, class109 arg2) {
        field3200++;
        if (class284.field4986 > 0) {
            for (int var4 = 0; var4 < this.field3202.length; var4++) {
                if (!arg1.method732(this.field3202[var4], class284.field4986, -9523)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field3202.length; var5++) {
                if (!arg1.method723(this.field3202[var5], true)) {
                    return false;
                }
            }
        }
        if (arg0 != 30155) {
            field3201 = 81;
        }
        for (int var6 = 0; var6 < this.field3203.length; var6++) {
            if (!arg2.method351(this.field3203[var6], arg0 - 29900)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Lqk;")
    public static final class207 method1269(int arg0, int arg1) {
        if (arg0 != 18895) {
            field3190 = 64;
        }
        field3198++;
        return arg1 < 999999999 ? class262.method1815(arg1, (byte) 59) : class227.field4177;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lpk;IBI)[Ldg;")
    public static final class139[] method1270(class99 arg0, int arg1, byte arg2, int arg3) {
        int var4 = 49 % ((arg2 + 8) / 56);
        field3189++;
        return class78.method594(arg1, arg0, -48, arg3) ? class72.method525(0) : null;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
    public class177() {
        this.field3202 = new int[0];
        this.field3203 = new int[0];
        this.field3195 = new class267();
        this.field3195.field3000 = 1;
        this.field3197 = new class267();
        this.field3188 = new class170[] { this.field3195, this.field3197 };
        this.field3197.field3000 = 1;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lv;)V")
    public class177(class149 arg0) {
        int var2 = arg0.method1045((byte) -47);
        this.field3188 = new class170[var2];
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class170 var16 = class51.method398(arg0, 0);
            if (var16.method1155(true) >= 0) {
                var3++;
            }
            if (var16.method255(-25529) >= 0) {
                var4++;
            }
            int var17 = var16.field3006.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1045((byte) -99);
            }
            this.field3188[var6] = var16;
        }
        this.field3202 = new int[var3];
        this.field3203 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class170 var11 = this.field3188[var9];
            int var12 = var11.field3006.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field3006[var13] = this.field3188[var5[var9][var13]];
            }
            int var14 = var11.method1155(true);
            int var15 = var11.method255(-25529);
            if (var14 > 0) {
                this.field3202[var7++] = var14;
            }
            if (var15 > 0) {
                this.field3203[var8++] = var15;
            }
            var5[var9] = null;
        }
        Object var10 = null;
        this.field3195 = this.field3188[arg0.method1045((byte) 114)];
        this.field3197 = this.field3188[arg0.method1045((byte) -64)];
    }
}
