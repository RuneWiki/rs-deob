import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class69 extends class43 {

    @OriginalMember(owner = "client!gb", name = "T", descriptor = "Lmb;")
    public static class132 field1146 = class166.method1092(" )2> <col=ff9040>", 123);

    @OriginalMember(owner = "client!gb", name = "ab", descriptor = "[S")
    public static short[] field1153 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!gb", name = "db", descriptor = "Z")
    public static boolean field1156 = false;

    @OriginalMember(owner = "client!gb", name = "U", descriptor = "Lbe;")
    public static class17 field1147 = new class17();

    @OriginalMember(owner = "client!gb", name = "gb", descriptor = "Lmb;")
    private static class132 field1159 = class166.method1092("Loading fonts )2 ", 122);

    @OriginalMember(owner = "client!gb", name = "fb", descriptor = "Lmb;")
    public static class132 field1158 = field1159;

    @OriginalMember(owner = "client!gb", name = "V", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!gb", name = "W", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!gb", name = "X", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!gb", name = "Z", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!gb", name = "bb", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!gb", name = "eb", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!gb", name = "hb", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!gb", name = "ib", descriptor = "Loc;")
    public static class155 field1161;

    @OriginalMember(owner = "client!gb", name = "Y", descriptor = "[I")
    public static int[] field1151;

    @OriginalMember(owner = "client!gb", name = "cb", descriptor = "[Leb;")
    private class47[] field1155;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([[IZ)V")
    private final void method425(int[][] arg0, boolean arg1) {
        ++field1150;
        int var3 = class131.field2427;
        if (arg1) {
            this.method203(111, -116);
        }
        int var4 = class42.field689;
        class90.method559(arg0, -26218);
        class97.method614(0, (byte) -54, class185.field3423, class90.field1593, 0);
        if (this.field1155 != null) {
            for (int var5 = 0; var5 < this.field1155.length; ++var5) {
                class47 var6 = this.field1155[var5];
                int var7 = var6.field817;
                int var8 = var6.field818;
                if (var8 >= 0) {
                    if (~var7 > -1) {
                        var6.method318(var4, (byte) 78, var3);
                    } else {
                        var6.method313(var4, var3, 1832079585);
                    }
                } else if (~var7 <= -1) {
                    var6.method310(var3, !arg1, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBLkd;)V")
    public final void method200(int arg0, byte arg1, class112 arg2) {
        if (arg1 != -73) {
            field1160 = 78;
        }
        ++field1154;
        if (~arg0 == -1) {
            this.field1155 = new class47[arg2.method716(-1308)];
            for (int var4 = 0; var4 < this.field1155.length; ++var4) {
                int var5 = arg2.method716(arg1 + -1235);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (~var5 == -4) {
                                this.field1155[var4] = class158.method1026(arg2, -112);
                            }
                        } else {
                            this.field1155[var4] = class169.method1109(arg2, arg1 + 65);
                        }
                    } else {
                        this.field1155[var4] = class33.method230(arg1 + 21174, arg2);
                    }
                } else {
                    this.field1155[var4] = class28.method207(3, arg2);
                }
            }
        } else if (arg0 == 1) {
            super.field746 = ~arg2.method716(-1308) == -2;
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
    public class69() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)[I")
    public final int[] method64(int arg0, int arg1) {
        int[] var3 = super.field768.method1123(arg1, arg0);
        ++field1148;
        if (super.field768.field3219) {
            this.method425(super.field768.method1120(arg1), false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIBIII)V")
    public static final void method426(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 47) {
            field1146 = null;
        }
        ++field1152;
        if (arg1 == arg4) {
            class169.method1106(arg0, -84, arg5, arg3, arg1);
        } else if (~class135.field2542 >= ~(-arg1 + arg0) && arg0 - -arg1 <= class168.field3083 && ~(arg3 - arg4) <= ~class169.field3161 && ~class17.field254 <= ~(arg3 + arg4)) {
            class97.method612(arg5, arg3, arg1, (byte) -109, arg0, arg4);
        } else {
            class215.method1342(-125, arg4, arg3, arg1, arg0, arg5);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)[[I")
    public final int[][] method203(int arg0, int arg1) {
        ++field1149;
        if (arg0 != -1893) {
            method427((byte) -56);
        }
        int[][] var3 = super.field764.method1350((byte) 125, arg1);
        if (super.field764.field3960) {
            int var4 = class131.field2427;
            int var5 = class42.field689;
            int[][][] var6 = super.field764.method1351(arg0 + 1784);
            int[][] var7 = new int[var5][var4];
            this.method425(var7, false);
            for (int var8 = 0; ~var8 > ~class42.field689; ++var8) {
                int[] var9 = var7[var8];
                int[][] var10 = var6[var8];
                int[] var11 = var10[2];
                int[] var12 = var10[1];
                int[] var13 = var10[0];
                for (int var14 = 0; ~var14 > ~class131.field2427; ++var14) {
                    int var15 = var9[var14];
                    var11[var14] = class75.method450(4080, var15 << 4);
                    var12[var14] = class75.method450(65280, var15) >> 4;
                    var13[var14] = class75.method450(var15 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(B)V")
    public static void method427(byte arg0) {
        field1147 = null;
        field1146 = null;
        if (arg0 == 32) {
            field1153 = null;
            field1158 = null;
            field1161 = null;
            field1159 = null;
            field1151 = null;
        }
    }
}
