import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class96 extends class117 {

    @OriginalMember(owner = "client!kc", name = "L", descriptor = "Z")
    public static boolean field1542 = false;

    @OriginalMember(owner = "client!kc", name = "T", descriptor = "[I")
    public static int[] field1550 = new int[2];

    @OriginalMember(owner = "client!kc", name = "V", descriptor = "Ljava/lang/String;")
    public static String field1552 = "glow2:";

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!kc", name = "M", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!kc", name = "N", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!kc", name = "O", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!kc", name = "P", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!kc", name = "Q", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!kc", name = "R", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!kc", name = "S", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!kc", name = "U", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!kc", name = "W", descriptor = "Ldk;")
    public static class251 field1553;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(II)V")
    public static final void method660(int arg0, int arg1) {
        ++field1544;
        class175 var2 = class182.method1317(4, arg0, false);
        var2.method1278((byte) -114);
        if (arg1 != -16038) {
            field1552 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "(I)V")
    public static void method661(int arg0) {
        field1552 = null;
        field1550 = null;
        if (arg0 == -11433) {
            field1553 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILk;IIII)Lk;")
    public static final class37 method662(int arg0, int arg1, class37 arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1549;
        long var7 = (long) arg1;
        class37 var9 = (class37) class6.field63.method1261(arg5 + 24605, var7);
        if (var9 == null) {
            class166 var10 = class166.method1200(class265.field4266, arg1, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1205(64, 768, -50, -10, -50);
            class6.field63.method1264(-1, var7, var9);
        }
        int var11 = arg2.method181();
        int var12 = arg2.method174();
        int var13 = arg2.method179();
        int var14 = arg2.method184();
        class37 var15 = var9.method177(true, true, true);
        if (arg6 != 0) {
            var15.method192(arg6);
        }
        class31 var16 = (class31) var15;
        if (~arg0 != ~class155.method1060((byte) -12, class56.field941, arg4 + var13, arg3 + var11) || ~class155.method1060((byte) -12, class56.field941, arg4 + var14, arg3 - -var12) != ~arg0) {
            for (int var17 = 0; ~var17 > ~var16.field415; ++var17) {
                var16.field377[var17] += -arg0 + class155.method1060((byte) -12, class56.field941, var16.field408[var17] + arg4, var16.field390[var17] + arg3);
            }
            var16.field418 = false;
        }
        if (arg5 != -24605) {
            field1542 = false;
        }
        return var15;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
    public class96() {
        super(3, false);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lwd;II)V")
    public final void method44(class162 arg0, int arg1, int arg2) {
        ++field1540;
        if (arg2 == 0) {
            super.field1885 = arg0.method1133((byte) 53) == 1;
        }
        if (arg1 != 255) {
            method663(-128, 32, -105, -13, -93, -13);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)[I")
    public final int[] method46(int arg0, int arg1) {
        if (arg0 != 2) {
            return null;
        } else {
            ++field1541;
            int[] var3 = super.field1883.method531(arg1, (byte) 127);
            if (super.field1883.field1313) {
                int[] var4 = this.method837(0, 0, arg1);
                int[] var5 = this.method837(0, 1, arg1);
                int[] var6 = this.method837(arg0 ^ 2, 2, arg1);
                for (int var7 = 0; ~class168.field2737 < ~var7; ++var7) {
                    int var8 = var6[var7];
                    if (~var8 != -4097) {
                        if (~var8 == -1) {
                            var3[var7] = var5[var7];
                        } else {
                            var3[var7] = var4[var7] * var8 - -((4096 - var8) * var5[var7]) >> 12;
                        }
                    } else {
                        var3[var7] = var4[var7];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIII)V")
    public static final void method663(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class247.field3930 = arg1;
        class132.field2081 = arg2;
        class276.field4442 = arg5;
        ++field1551;
        class161.field2551 = arg3;
        class299.field4796 = arg4;
        if (~class299.field4796 <= -101) {
            int var6 = class132.field2081 * 128 - -64;
            int var7 = class276.field4442 * 128 + 64;
            int var8 = class155.method1060((byte) -12, class56.field941, var7, var6) - class247.field3930;
            int var9 = -class148.field2314 + var6;
            int var10 = var8 - class46.field776;
            int var11 = -class104.field1666 + var7;
            int var12 = (int) Math.sqrt((double) (var9 * var9 - -(var11 * var11)));
            class264.field4245 = 2047 & (int) (Math.atan2((double) var10, (double) var12) * 325.949D);
            class71.field1207 = 2047 & (int) (-325.949D * Math.atan2((double) var9, (double) var11));
            if (~class264.field4245 > -129) {
                class264.field4245 = 128;
            }
            if (class264.field4245 > 383) {
                class264.field4245 = 383;
            }
        }
        class120.field1919 = 2;
        int var13 = -84 / ((27 - arg0) / 59);
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(II)V")
    public static final void method664(int arg0, int arg1) {
        ++field1545;
        class195.field3151.method1262(arg0, 2736);
        class100.field1605.method1262(arg0, 2736);
        class196.field3177.method1262(arg0, 2736);
        if (arg1 != 2) {
            method662(73, -62, (class37) null, 92, -82, -126, -118);
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)[[I")
    public final int[][] method47(int arg0, int arg1) {
        int var3 = 106 / ((arg1 - 37) / 38);
        ++field1547;
        int[][] var4 = super.field1886.method419(arg0, (byte) 110);
        if (super.field1886.field1022) {
            int[] var5 = this.method837(0, 2, arg0);
            int[][] var6 = this.method838(0, 0, arg0);
            int[][] var7 = this.method838(1, 0, arg0);
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            int[] var10 = var6[0];
            int[] var11 = var4[0];
            int[] var12 = var6[2];
            int[] var13 = var6[1];
            int[] var14 = var7[1];
            int[] var15 = var7[0];
            int[] var16 = var7[2];
            for (int var17 = 0; class168.field2737 > var17; ++var17) {
                int var18 = var5[var17];
                if (var18 != 4096) {
                    if (~var18 == -1) {
                        var11[var17] = var15[var17];
                        var8[var17] = var14[var17];
                        var9[var17] = var16[var17];
                    } else {
                        int var19 = -var18 + 4096;
                        var11[var17] = var10[var17] * var18 + var15[var17] * var19 >> 12;
                        var8[var17] = var13[var17] * var18 + var14[var17] * var19 >> 12;
                        var9[var17] = var12[var17] * var18 - -(var16[var17] * var19) >> 12;
                    }
                } else {
                    var11[var17] = var10[var17];
                    var8[var17] = var13[var17];
                    var9[var17] = var12[var17];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BII[B)I")
    public static final int method665(byte arg0, int arg1, int arg2, byte[] arg3) {
        ++field1546;
        int var4 = -1;
        for (int var5 = arg1; ~var5 > ~arg2; ++var5) {
            var4 = var4 >>> 8 ^ class123.field1955[(arg3[var5] ^ var4) & 255];
        }
        int var6 = ~var4;
        return arg0 != -93 ? -14 : var6;
    }
}
