import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class20 extends class175 {

    @OriginalMember(owner = "client!vg", name = "bb", descriptor = "I")
    private int field333 = 4;

    @OriginalMember(owner = "client!vg", name = "eb", descriptor = "I")
    private int field336 = 4;

    @OriginalMember(owner = "client!vg", name = "Q", descriptor = "Z")
    public static boolean field322 = false;

    @OriginalMember(owner = "client!vg", name = "W", descriptor = "I")
    public static int field328 = 0;

    @OriginalMember(owner = "client!vg", name = "Y", descriptor = "Lmb;")
    private static class96 field330 = class243.method1708("Your ignore list is full)3 Max of 100 users)3", (byte) 114);

    @OriginalMember(owner = "client!vg", name = "V", descriptor = "Lmb;")
    private static class96 field327 = class243.method1708(" more options", (byte) 98);

    @OriginalMember(owner = "client!vg", name = "X", descriptor = "Lmb;")
    public static class96 field329 = class243.method1708("lila:", (byte) 114);

    @OriginalMember(owner = "client!vg", name = "cb", descriptor = "Lmb;")
    public static class96 field334 = field327;

    @OriginalMember(owner = "client!vg", name = "U", descriptor = "Lmb;")
    public static class96 field326 = class243.method1708("Wordpack geladen)3", (byte) 122);

    @OriginalMember(owner = "client!vg", name = "gb", descriptor = "Lmb;")
    public static class96 field338 = field330;

    @OriginalMember(owner = "client!vg", name = "P", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!vg", name = "R", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!vg", name = "S", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!vg", name = "T", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!vg", name = "Z", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!vg", name = "ab", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!vg", name = "fb", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!vg", name = "hb", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!vg", name = "db", descriptor = "Lgb;")
    public static class74 field335;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIB)V")
    public static final void method143(int arg0, int arg1, int arg2, byte arg3) {
        ++field324;
        class43 var4 = class270.method1847(arg0, -10277, 9);
        var4.method333(-126);
        var4.field732 = arg2;
        if (arg3 >= -89) {
            field338 = null;
        }
        var4.field740 = arg1;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lff;B)I")
    public static final int method144(class3 arg0, byte arg1) {
        ++field332;
        if (arg1 != -10) {
            return 49;
        } else {
            int var2 = 0;
            if (arg0.method15(-57, class141.field2524)) {
                ++var2;
            }
            if (arg0.method15(arg1 ^ 68, class19.field312)) {
                ++var2;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BI)[I")
    public final int[] method1(byte arg0, int arg1) {
        ++field339;
        int[] var3 = super.field3044.method904((byte) -128, arg1);
        int var4 = -125 / ((arg0 - 62) / 54);
        if (super.field3044.field2150) {
            int var5 = class1.field11 / this.field333;
            int var6 = class85.field1440 / this.field336;
            int[] var8;
            if (var6 > 0) {
                int var7 = arg1 % var6;
                var8 = this.method1255(0, class85.field1440 * var7 / var6, 128);
            } else {
                var8 = this.method1255(0, 0, 128);
            }
            for (int var9 = 0; ~var9 > ~class1.field11; ++var9) {
                if (var5 <= 0) {
                    var3[var9] = var8[0];
                } else {
                    int var10 = var9 % var5;
                    var3[var9] = var8[class1.field11 * var10 / var5];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lrg;ILmb;)I")
    public static final int method145(class239 arg0, int arg1, class96 arg2) {
        ++field325;
        int var3 = arg0.field4124;
        arg0.method1659(arg2.field1600, 120);
        arg0.field4124 += class77.field1311.method373(arg0.field4124, arg2.field1600, arg0.field4144, (byte) -21, arg1, arg2.field1580);
        return -var3 + arg0.field4124;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(IIIB)I")
    public static final int method146(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg2 & 3;
        ++field331;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else {
            if (arg3 != -76) {
                field335 = null;
            }
            return ~var4 == -3 ? -arg0 + 7 : arg1;
        }
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "(I)V")
    public static void method147(int arg0) {
        field330 = null;
        field327 = null;
        if (arg0 == 8576) {
            field335 = null;
            field329 = null;
            field338 = null;
            field334 = null;
            field326 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        ++field321;
        int[][] var3 = super.field3035.method637(arg0, false);
        if (arg1 != 64) {
            method146(-24, -43, 82, (byte) -111);
        }
        if (super.field3035.field1493) {
            int var4 = class1.field11 / this.field333;
            int var5 = class85.field1440 / this.field336;
            int[][] var6;
            if (~var5 >= -1) {
                var6 = this.method1253(0, arg1 ^ -2944, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method1253(class85.field1440 * var7 / var5, -2880, 0);
            }
            int[] var8 = var6[0];
            int[] var9 = var3[0];
            int[] var10 = var6[1];
            int[] var11 = var6[2];
            int[] var12 = var3[2];
            int[] var13 = var3[1];
            for (int var14 = 0; ~class1.field11 < ~var14; ++var14) {
                int var15;
                if (~var4 >= -1) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class1.field11 * var16 / var4;
                }
                var9[var14] = var8[var15];
                var13[var14] = var10[var15];
                var12[var14] = var11[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BILrg;)V")
    public final void method115(byte arg0, int arg1, class239 arg2) {
        int var4 = -49 % ((arg0 - -22) / 58);
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field336 = arg2.method1651(4139);
            }
        } else {
            this.field333 = arg2.method1651(4139);
        }
        ++field323;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(BI)I")
    public static final int method148(byte arg0, int arg1) {
        ++field337;
        if (~arg1 == -16711936) {
            return -1;
        } else {
            return arg0 != -31 ? 62 : class82.method579(arg1, (byte) 93);
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
    public class20() {
        super(1, false);
    }
}
