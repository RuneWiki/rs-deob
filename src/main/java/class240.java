import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class240 extends class82 {

    @OriginalMember(owner = "client!oaa", name = "N", descriptor = "I")
    private int field2995 = 4;

    @OriginalMember(owner = "client!oaa", name = "R", descriptor = "I")
    private int field2999 = 4;

    @OriginalMember(owner = "client!oaa", name = "M", descriptor = "Lcea;")
    public static class180 field2994 = new class180("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

    @OriginalMember(owner = "client!oaa", name = "S", descriptor = "Lvj;")
    public static class373 field3000 = new class373(29, 12);

    @OriginalMember(owner = "client!oaa", name = "L", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!oaa", name = "O", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!oaa", name = "P", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!oaa", name = "Q", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!oaa", name = "U", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!oaa", name = "T", descriptor = "Lcj;")
    public static class593 field3001;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Z)V")
    public static final void method1359(boolean arg0) {
        class620.method3559(class565.field8299.field2175, (byte) 67);
        ++field2998;
        int var1 = (class632.field9113 >> 3) + (class286.field3729 >> 10);
        int var2 = (class39.field303 >> 10) + (class119.field1504 >> 3);
        class442.field6099 = class103.field1265.field8660 = 0;
        class103.field1265.method3198(8, 0, 8);
        byte var3 = 18;
        class422.field5451 = new byte[var3][];
        class391.field5165 = new int[var3];
        class74.field871 = new byte[var3][];
        class5.field44 = new byte[var3][];
        class148.field1777 = new byte[var3][];
        class633.field9116 = new int[var3];
        class39.field302 = new int[var3];
        class102.field1255 = new int[var3];
        class461.field6370 = new int[var3];
        class550.field8087 = new byte[var3][];
        class82.field1002 = new int[var3][4];
        class196.field2378 = new int[var3];
        int var4 = 0;
        for (int var5 = (-(class106.field1289 >> 4) + var1) / 8; ((class106.field1289 >> 4) + var1) / 8 >= var5; ++var5) {
            for (int var8 = (var2 - (class422.field5452 >> 4)) / 8; ~(((class422.field5452 >> 4) + var2) / 8) <= ~var8; ++var8) {
                int var9 = (var5 << 8) + var8;
                class633.field9116[var4] = var9;
                class39.field302[var4] = class368.field4834.method2579(-1, "m" + var5 + "_" + var8);
                class196.field2378[var4] = class368.field4834.method2579(-1, "l" + var5 + "_" + var8);
                class102.field1255[var4] = class368.field4834.method2579(-1, "n" + var5 + "_" + var8);
                class461.field6370[var4] = class368.field4834.method2579(-1, "um" + var5 + "_" + var8);
                class391.field5165[var4] = class368.field4834.method2579(-1, "ul" + var5 + "_" + var8);
                if (class102.field1255[var4] == -1) {
                    class39.field302[var4] = -1;
                    class196.field2378[var4] = -1;
                    class461.field6370[var4] = -1;
                    class391.field5165[var4] = -1;
                }
                ++var4;
            }
        }
        for (int var6 = var4; ~var6 > ~class102.field1255.length; ++var6) {
            class102.field1255[var6] = -1;
            class39.field302[var6] = -1;
            class196.field2378[var6] = -1;
            class461.field6370[var6] = -1;
            class391.field5165[var6] = -1;
        }
        byte var7;
        if (class137.field1671 != 1 && ~class137.field1671 != -3) {
            var7 = 7;
        } else {
            var7 = 3;
        }
        class367.method2053(var1, var2, var7, arg0, false);
    }

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "(Z)V")
    public static void method1360(boolean arg0) {
        if (!arg0) {
            method1361(-95, 74);
        }
        field3000 = null;
        field2994 = null;
        field3001 = null;
    }

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "(II)Z")
    public static final boolean method1361(int arg0, int arg1) {
        if (arg0 != 0) {
            return true;
        } else {
            ++field2996;
            if (~arg1 != -47 && ~arg1 != -7 && ~arg1 != -13 && arg1 != 5 && arg1 != 22) {
                return ~arg1 == -17 || ~arg1 == -1012;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(II)[[I")
    public final int[][] method481(int arg0, int arg1) {
        ++field2993;
        int[][] var3 = super.field992.method3178(arg1, 0);
        if (arg0 != 1000) {
            this.field2999 = 121;
        }
        if (super.field992.field7962) {
            int var4 = class629.field9033 / this.field2995;
            int var5 = class347.field4469 / this.field2999;
            int[][] var6;
            if (var5 <= 0) {
                var6 = this.method488(0, 0, arg0 ^ 1001);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method488(0, class347.field4469 * var7 / var5, 1);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~var14 > ~class629.field9033; ++var14) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class629.field9033 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IILos;)V")
    public final void method198(int arg0, int arg1, class374 arg2) {
        int var4 = -42 / ((-69 - arg1) / 42);
        ++field2997;
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field2999 = arg2.method2129(-97);
            }
        } else {
            this.field2995 = arg2.method2129(-113);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "(II)[I")
    public final int[] method201(int arg0, int arg1) {
        ++field3002;
        int[] var3 = super.field990.method1566((byte) 116, arg0);
        if (super.field990.field3641) {
            int var4 = class629.field9033 / this.field2995;
            int var5 = class347.field4469 / this.field2999;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method489(false, 0, class347.field4469 * var6 / var5);
            } else {
                var7 = this.method489(false, 0, 0);
            }
            for (int var8 = 0; ~class629.field9033 < ~var8; ++var8) {
                if (var4 <= 0) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class629.field9033 * var9 / var4];
                }
            }
        }
        if (arg1 != 12218) {
            method1360(false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "()V")
    public class240() {
        super(1, false);
    }
}
