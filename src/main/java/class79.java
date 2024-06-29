import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class79 extends class182 {

    @OriginalMember(owner = "client!fa", name = "R", descriptor = "I")
    private int field1328 = 4;

    @OriginalMember(owner = "client!fa", name = "Y", descriptor = "I")
    private int field1335 = 4;

    @OriginalMember(owner = "client!fa", name = "T", descriptor = "[C")
    public static char[] field1330 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!fa", name = "O", descriptor = "Z")
    public static boolean field1325 = true;

    @OriginalMember(owner = "client!fa", name = "P", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!fa", name = "U", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!fa", name = "V", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!fa", name = "W", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!fa", name = "X", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!fa", name = "Z", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZI)[I")
    public final int[] method153(boolean arg0, int arg1) {
        if (arg0) {
            method551(-37);
        }
        ++field1332;
        int[] var3 = super.field2911.method77(arg1, -67);
        if (super.field2911.field287) {
            int var4 = class16.field318 / this.field1328;
            int var5 = class4.field116 / this.field1335;
            int[] var6;
            if (~var4 >= -1) {
                var6 = this.method1323(0, -17707, 0);
            } else {
                int var7 = arg1 % var4;
                var6 = this.method1323(0, -17707, class16.field318 * var7 / var4);
            }
            for (int var8 = 0; ~class4.field116 < ~var8; ++var8) {
                if (~var5 < -1) {
                    int var9 = var8 % var5;
                    var3[var8] = var6[class4.field116 * var9 / var5];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "(I)I")
    public static final int method551(int arg0) {
        ++field1333;
        if (arg0 >= -69) {
            return 109;
        } else if ((double) class148.field2444 == 3.0D) {
            return 37;
        } else if ((double) class148.field2444 == 4.0D) {
            return 50;
        } else if ((double) class148.field2444 == 6.0D) {
            return 75;
        } else {
            return (double) class148.field2444 == 8.0D ? 100 : 200;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BLaj;)V")
    public static final void method552(byte arg0, class151 arg1) {
        ++field1334;
        if (arg0 != 61) {
            field1330 = null;
        }
        class31.field519 = arg1.method1121(2, "runes");
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Lbf;")
    public static final class31 method553(int arg0, int arg1) {
        if (arg1 != 4) {
            return null;
        } else {
            ++field1336;
            class31 var2 = (class31) class54.field947.method99((long) arg0, true);
            if (var2 != null) {
                return var2;
            } else {
                class31 var3 = class249.method1792(class91.field1511, false, arg0, class154.field2564, (byte) -128);
                if (var3 != null) {
                    class54.field947.method100((long) arg0, var3, arg1 ^ 115);
                }
                return var3;
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZJII)Z")
    public static final boolean method554(boolean arg0, long arg1, int arg2, int arg3) {
        int var5 = 31 & (int) arg1 >> 14;
        int var6 = (int) arg1 >> 20 & 3;
        int var7 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
        if (arg0) {
            return true;
        } else {
            if (~var5 != -11 && ~var5 != -12 && ~var5 != -23) {
                class190.method1373(var6, 0, 0, true, 26204, arg2, arg3, class16.field314.field711[0], var5 + 1, 0, class16.field314.field717[0]);
            } else {
                class1 var8 = class110.method827(var7, (byte) -80);
                int var9;
                int var10;
                if (var6 != 0 && var6 != 2) {
                    var9 = var8.field57;
                    var10 = var8.field10;
                } else {
                    var9 = var8.field10;
                    var10 = var8.field57;
                }
                int var11 = var8.field80;
                if (var6 != 0) {
                    var11 = (var11 >> -var6 + 4) + (15 & var11 << var6);
                }
                class190.method1373(0, var9, var10, true, 26204, arg2, arg3, class16.field314.field711[0], 0, var11, class16.field314.field717[0]);
            }
            ++field1331;
            return true;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BI)[[I")
    public final int[][] method157(byte arg0, int arg1) {
        int var3 = 13 % ((-64 - arg0) / 49);
        int[][] var4 = super.field2905.method50(arg1, (byte) 123);
        if (super.field2905.field158) {
            int var5 = class16.field318 / this.field1328;
            int var6 = class4.field116 / this.field1335;
            int[][] var7;
            if (~var5 >= -1) {
                var7 = this.method1327(0, 0, 0);
            } else {
                int var8 = arg1 % var5;
                var7 = this.method1327(0, 0, class16.field318 * var8 / var5);
            }
            int[] var9 = var7[0];
            int[] var10 = var7[1];
            int[] var11 = var7[2];
            int[] var12 = var4[0];
            int[] var13 = var4[2];
            int[] var14 = var4[1];
            for (int var15 = 0; var15 < class4.field116; ++var15) {
                int var17;
                if (~var6 < -1) {
                    int var16 = var15 % var6;
                    var17 = class4.field116 * var16 / var6;
                } else {
                    var17 = 0;
                }
                var12[var15] = var9[var17];
                var14[var15] = var10[var17];
                var13[var15] = var11[var17];
            }
        }
        ++field1329;
        return var4;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
    public class79() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "(I)V")
    public static void method555(int arg0) {
        field1330 = null;
        int var1 = 104 % ((arg0 - -44) / 51);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZLab;I)V")
    public final void method155(boolean arg0, class249 arg1, int arg2) {
        if (!arg0) {
            if (arg2 != 0) {
                if (~arg2 == -2) {
                    this.field1328 = arg1.method1802((byte) 64);
                }
            } else {
                this.field1335 = arg1.method1802((byte) 39);
            }
            ++field1326;
        }
    }
}
