import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class181 {

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "Lbg;")
    private class237 field3154 = new class237(256);

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "Lbg;")
    private class237 field3163 = new class237(256);

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "Ltg;")
    private class182 field3155;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Ltg;")
    private class182 field3156;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field3162 = 0;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "[[B")
    public static byte[][] field3151;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)Z")
    public static final boolean method1208(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class151.field2659; var3++) {
            class57 var4 = class255.field4405[var3];
            if (var4.field937 == 1) {
                int var5 = var4.field933 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field962 * var5 >> 8) + var4.field946;
                    int var7 = (var4.field958 * var5 >> 8) + var4.field949;
                    int var8 = (var4.field940 * var5 >> 8) + var4.field950;
                    int var9 = (var4.field934 * var5 >> 8) + var4.field951;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field937 == 2) {
                int var10 = arg0 - var4.field933;
                if (var10 > 0) {
                    int var11 = (var4.field962 * var10 >> 8) + var4.field946;
                    int var12 = (var4.field958 * var10 >> 8) + var4.field949;
                    int var13 = (var4.field940 * var10 >> 8) + var4.field950;
                    int var14 = (var4.field934 * var10 >> 8) + var4.field951;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field937 == 3) {
                int var15 = var4.field946 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field957 * var15 >> 8) + var4.field933;
                    int var17 = (var4.field956 * var15 >> 8) + var4.field945;
                    int var18 = (var4.field940 * var15 >> 8) + var4.field950;
                    int var19 = (var4.field934 * var15 >> 8) + var4.field951;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field937 == 4) {
                int var20 = arg2 - var4.field946;
                if (var20 > 0) {
                    int var21 = (var4.field957 * var20 >> 8) + var4.field933;
                    int var22 = (var4.field956 * var20 >> 8) + var4.field945;
                    int var23 = (var4.field940 * var20 >> 8) + var4.field950;
                    int var24 = (var4.field934 * var20 >> 8) + var4.field951;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field937 == 5) {
                int var25 = arg1 - var4.field950;
                if (var25 > 0) {
                    int var26 = (var4.field957 * var25 >> 8) + var4.field933;
                    int var27 = (var4.field956 * var25 >> 8) + var4.field945;
                    int var28 = (var4.field962 * var25 >> 8) + var4.field946;
                    int var29 = (var4.field958 * var25 >> 8) + var4.field949;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BII[I)Ltd;")
    private final class72 method1209(byte arg0, int arg1, int arg2, int[] arg3) {
        int var5 = arg2 ^ ((arg1 & 0xE0000FFF) << 4 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        field3157++;
        long var7 = (long) var6 ^ 0x100000000L;
        class72 var9 = (class72) this.field3163.method1550(true, var7);
        if (arg0 != 15) {
            method1218(103);
        }
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class213 var10 = (class213) this.field3154.method1550(true, var7);
            if (var10 == null) {
                var10 = class213.method1432(this.field3155, arg1, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field3154.method1544((byte) -68, var7, var10);
            }
            class72 var11 = var10.method1430(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method828((byte) -56);
                this.field3163.method1544((byte) -96, var7, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BII)V")
    public static final void method1210(byte arg0, int arg1, int arg2) {
        if (class160.field2839 != 0 && arg2 != -1) {
            class240.method1562(arg2, class242.field4199, 0, class160.field2839, 1, false);
            class127.field2222 = true;
        }
        if (arg0 != -3) {
            field3151 = null;
        }
        field3164++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)V")
    public static final void method1211(int arg0, int arg1) {
        if (arg0 != -1) {
            return;
        }
        class9 var2 = (class9) class277.field4868.method1550(true, (long) arg1);
        field3165++;
        if (var2 != null) {
            for (int var3 = 0; var3 < var2.field66.length; var3++) {
                var2.field66[var3] = -1;
                var2.field69[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static void method1212(int arg0) {
        if (arg0 == 1) {
            field3151 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIB[I)Ltd;")
    private final class72 method1213(int arg0, int arg1, byte arg2, int[] arg3) {
        int var5 = (arg0 >>> 12 | arg0 & 0xFFF << 4) ^ arg1;
        field3152++;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        if (arg2 != 97) {
            method1217(79, 83, -24, 61, -17, 120);
        }
        class72 var9 = (class72) this.field3163.method1550(true, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class113 var10 = class113.method772(this.field3156, arg0, arg1);
            if (var10 == null) {
                return null;
            }
            class72 var11 = var10.method773();
            this.field3163.method1544((byte) -65, var7, var11);
            if (arg3 != null) {
                arg3[0] -= var11.field1208.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZIIII)V")
    public static final void method1214(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        class217.field3775 = class218.field3794 * arg1 / arg4;
        class65.field1108 = -1;
        if (arg0) {
            class119.field2102 = class230.field3983 * arg2 / arg3;
            class44.field775 = -1;
            class132.method888(0);
            field3161++;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I[IZ)Ltd;")
    public final class72 method1215(int arg0, int[] arg1, boolean arg2) {
        if (!arg2) {
            this.method1216((byte) -74, 84, (int[]) null);
        }
        field3160++;
        if (this.field3155.method1234(0) == 1) {
            return this.method1209((byte) 15, 0, arg0, arg1);
        } else if (this.field3155.method1233(arg0, false) == 1) {
            return this.method1209((byte) 15, arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BI[I)Ltd;")
    public final class72 method1216(byte arg0, int arg1, int[] arg2) {
        field3159++;
        if (arg0 != -76) {
            return null;
        } else if (this.field3156.method1234(0) == 1) {
            return this.method1213(0, arg1, (byte) 97, arg2);
        } else if (this.field3156.method1233(arg1, false) == 1) {
            return this.method1213(arg1, 0, (byte) 97, arg2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIII)V")
    public static final void method1217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3153++;
        class207.field3586[0].method751(arg2, arg4);
        class207.field3586[1].method751(arg2, arg0 + arg4 - 16);
        int var6 = (arg0 - 32) * arg0 / arg3;
        if (var6 < 8) {
            var6 = 8;
        }
        if (arg5 != 20990) {
            field3151 = null;
        }
        int var7 = (arg0 - var6 - 32) * arg1 / (arg3 - arg0);
        class68.method465(arg2, arg4 + 16, 16, arg0 - 32, class97.field1629);
        class68.method465(arg2, arg4 + var7 + 16, 16, var6, class22.field265);
        class68.method457(arg2, arg4 + var7 + 16, var6, class218.field3781);
        class68.method457(arg2 + 1, arg4 + var7 - -16, var6, class218.field3781);
        class68.method459(arg2, var7 + arg4 + 16, 16, class218.field3781);
        class68.method459(arg2, arg4 + var7 + 17, 16, class218.field3781);
        class68.method457(arg2 + 15, arg4 + 16 - -var7, var6, class117.field2069);
        class68.method457(arg2 + 14, arg4 + 17 + var7, var6 - 1, class117.field2069);
        class68.method459(arg2, arg4 + var7 + var6 + 15, 16, class117.field2069);
        class68.method459(arg2 + 1, arg4 + var7 - -14 + var6, 15, class117.field2069);
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)[Lpi;")
    public static final class139[] method1218(int arg0) {
        field3158++;
        class139[] var1 = new class139[class201.field3495];
        for (int var2 = 0; var2 < class201.field3495; var2++) {
            int var4 = class223.field3885[var2] * class193.field3395[var2];
            byte[] var5 = field3151[var2];
            if (class232.field3996[var2]) {
                byte[] var6 = class272.field4798[var2];
                int[] var7 = new int[var4];
                for (int var8 = 0; var8 < var4; var8++) {
                    var7[var8] = class179.method1194(class71.method502(255, var6[var8]) << 24, class173.field3062[class71.method502(var5[var8], 255)]);
                }
                var1[var2] = new class45(class164.field2883, class88.field1520, class290.field5082[var2], class11.field94[var2], class223.field3885[var2], class193.field3395[var2], var7);
            } else {
                int[] var9 = new int[var4];
                for (int var10 = 0; var10 < var4; var10++) {
                    var9[var10] = class173.field3062[class71.method502(var5[var10], 255)];
                }
                var1[var2] = new class4(class164.field2883, class88.field1520, class290.field5082[var2], class11.field94[var2], class223.field3885[var2], class193.field3395[var2], var9);
            }
        }
        int var3 = -76 / ((arg0 - 48) / 47);
        class24.method181(false);
        return var1;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Ltg;Ltg;)V")
    public class181(class182 arg0, class182 arg1) {
        this.field3155 = arg1;
        this.field3156 = arg0;
    }
}
