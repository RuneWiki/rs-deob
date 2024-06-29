import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class13 extends class185 {

    @OriginalMember(owner = "client!lg", name = "Q", descriptor = "I")
    private int field177 = 4096;

    @OriginalMember(owner = "client!lg", name = "J", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!lg", name = "K", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!lg", name = "M", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!lg", name = "N", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!lg", name = "O", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!lg", name = "P", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!lg", name = "L", descriptor = "[I")
    public static int[] field172;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(B)V")
    public static final void method72(byte arg0) {
        class268.field4045.method1775(27147);
        class24.field297.method1775(27147);
        ++field173;
        if (arg0 < 84) {
            field176 = 120;
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(II)V")
    public static final void method73(int arg0, int arg1) {
        --class218.field3278;
        ++field171;
        if (~class218.field3278 != ~arg0) {
            class193.method1211(class199.field3021, arg0 - -1, class199.field3021, arg0, -arg0 + class218.field3278);
            class193.method1211(class46.field754, arg0 + 1, class46.field754, arg0, -arg0 + class218.field3278);
            class193.method1208(client.field2371, arg0 + 1, client.field2371, arg0, -arg0 + class218.field3278);
            class193.method1207(class84.field1339, arg0 + 1, class84.field1339, arg0, class218.field3278 - arg0);
            class193.method1206(class229.field3459, arg0 + arg1, class229.field3459, arg0, -arg0 + class218.field3278);
            class193.method1208(class71.field1135, arg0 + 1, class71.field1135, arg0, -arg0 + class218.field3278);
            class193.method1208(class58.field916, arg0 + 1, class58.field916, arg0, -arg0 + class218.field3278);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILfl;I)V")
    public final void method27(int arg0, class248 arg1, int arg2) {
        if (arg2 != -6357) {
            this.field177 = 32;
        }
        ++field170;
        if (~arg0 == -1) {
            this.field177 = arg1.method1575(false);
        }
    }

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "(I)V")
    public static final void method74(int arg0) {
        class294.field4647 = arg0;
        for (int var1 = 0; var1 < class197.field2997; ++var1) {
            for (int var2 = 0; var2 < class92.field1448; ++var2) {
                if (class33.field487[arg0][var1][var2] == null) {
                    class33.field487[arg0][var1][var2] = new class270(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
    public class13() {
        super(1, true);
    }

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "(I)I")
    public static final int method75(int arg0) {
        ++field175;
        if (arg0 != 0) {
            field176 = -71;
        }
        return 0;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIII)Z")
    public static final boolean method76(int arg0, int arg1, int arg2, int arg3) {
        if (!class236.method1501(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            int var6 = class67.field1072[arg0][arg1][arg2] - 1;
            int var7 = var6 - 120;
            int var8 = var6 - 230;
            int var9 = var6 - 238;
            if (arg3 < 16) {
                if (arg3 == 1) {
                    if (var4 > class274.field4127) {
                        if (!class255.method1684(var4, var6, var5)) {
                            return false;
                        }
                        if (!class255.method1684(var4, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class255.method1684(var4, var7, var5)) {
                            return false;
                        }
                        if (!class255.method1684(var4, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class255.method1684(var4, var8, var5)) {
                        return false;
                    }
                    if (!class255.method1684(var4, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 2) {
                    if (var5 < class136.field1998) {
                        if (!class255.method1684(var4, var6, var5 + 128)) {
                            return false;
                        }
                        if (!class255.method1684(var4 + 128, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class255.method1684(var4, var7, var5 + 128)) {
                            return false;
                        }
                        if (!class255.method1684(var4 + 128, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class255.method1684(var4, var8, var5 + 128)) {
                        return false;
                    }
                    if (!class255.method1684(var4 + 128, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 4) {
                    if (var4 < class274.field4127) {
                        if (!class255.method1684(var4 + 128, var6, var5)) {
                            return false;
                        }
                        if (!class255.method1684(var4 + 128, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class255.method1684(var4 + 128, var7, var5)) {
                            return false;
                        }
                        if (!class255.method1684(var4 + 128, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class255.method1684(var4 + 128, var8, var5)) {
                        return false;
                    }
                    if (!class255.method1684(var4 + 128, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 8) {
                    if (var5 > class136.field1998) {
                        if (!class255.method1684(var4, var6, var5)) {
                            return false;
                        }
                        if (!class255.method1684(var4 + 128, var6, var5)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class255.method1684(var4, var7, var5)) {
                            return false;
                        }
                        if (!class255.method1684(var4 + 128, var7, var5)) {
                            return false;
                        }
                    }
                    if (!class255.method1684(var4, var8, var5)) {
                        return false;
                    }
                    if (!class255.method1684(var4 + 128, var8, var5)) {
                        return false;
                    }
                    return true;
                }
            }
            if (!class255.method1684(var4 + 64, var9, var5 + 64)) {
                return false;
            } else if (arg3 == 16) {
                return class255.method1684(var4, var8, var5 + 128);
            } else if (arg3 == 32) {
                return class255.method1684(var4 + 128, var8, var5 + 128);
            } else if (arg3 == 64) {
                return class255.method1684(var4 + 128, var8, var5);
            } else if (arg3 == 128) {
                return class255.method1684(var4, var8, var5);
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "(B)V")
    public static void method77(byte arg0) {
        field172 = null;
        if (arg0 < 83) {
            field176 = 27;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)[I")
    public final int[] method34(int arg0, int arg1) {
        ++field174;
        int[] var3 = super.field2804.method561(arg0, -2);
        if (arg1 <= 70) {
            method75(11);
        }
        if (super.field2804.field1384) {
            int[] var4 = this.method1146((byte) 126, arg0 + -1 & class10.field133, 0);
            int[] var5 = this.method1146((byte) 127, arg0, 0);
            int[] var6 = this.method1146((byte) 127, arg0 + 1 & class10.field133, 0);
            for (int var7 = 0; class174.field2648 > var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field177;
                int var9 = var8 >> 12;
                int var10 = (var5[var7 + 1 & class53.field873] + -var5[class53.field873 & var7 + -1]) * this.field177;
                int var11 = var10 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var9 * var9 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 - -4096 + var13) / 4096.0F)));
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }
}
