import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class220 extends class87 {

    @OriginalMember(owner = "client!j", name = "J", descriptor = "Ljava/lang/String;")
    public static String field3205 = null;

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field3212 = "Loading sprites - ";

    @OriginalMember(owner = "client!j", name = "T", descriptor = "Ljava/lang/String;")
    public static String field3215 = "shake:";

    @OriginalMember(owner = "client!j", name = "G", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!j", name = "H", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!j", name = "K", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!j", name = "L", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!j", name = "M", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!j", name = "N", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!j", name = "O", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!j", name = "P", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!j", name = "S", descriptor = "Lba;")
    public static class157 field3214;

    @OriginalMember(owner = "client!j", name = "R", descriptor = "Lve;")
    public static class203 field3213;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IZ)[I")
    public final int[] method37(int arg0, boolean arg1) {
        int[] var3 = super.field1378.method319(arg0, arg1);
        ++field3204;
        if (super.field1378.field733) {
            int[] var4 = this.method642(0, arg0, true);
            int[] var5 = this.method642(1, arg0, true);
            int[] var6 = this.method642(2, arg0, true);
            for (int var7 = 0; class206.field3032 > var7; ++var7) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (~var8 != -1) {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                } else {
                    var3[var7] = var5[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!j", name = "f", descriptor = "(I)V")
    public static void method1532(int arg0) {
        field3215 = null;
        field3205 = null;
        field3213 = null;
        field3212 = null;
        field3214 = null;
        if (arg0 != 1) {
            field3213 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(B)V")
    public static final void method1533(byte arg0) {
        class287.field4602.method1422((byte) -89);
        ++field3210;
        if (arg0 < 94) {
            field3205 = null;
        }
        class269.field4333.method1422((byte) 87);
        class82.field1314.method1422((byte) 99);
    }

    @OriginalMember(owner = "client!j", name = "g", descriptor = "(I)V")
    public static final void method1534(int arg0) {
        if (~class214.field3149 != 0) {
            class281.method1942(true, class214.field3149, -1, false, -1);
            class214.field3149 = -1;
        }
        ++field3207;
        if (arg0 != -8366) {
            method1533((byte) 122);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lff;IIIII)V")
    public static final void method1535(class4 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; ++var11) {
            if (class188.field2799 != var11) {
                for (int var12 = var7; var12 <= var8; ++var12) {
                    if (var12 >= 0 && var12 < class159.field2481) {
                        for (int var13 = var9; var13 <= var10; ++var13) {
                            if (var13 >= 0 && var13 < class7.field67 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class313 var14 = class223.field3286[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class103.field1792[var11][var12 + 1][var13] + class103.field1792[var11][var12][var13] + class103.field1792[var11][var12][var13 + 1] + class103.field1792[var11][var12 + 1][var13 + 1]) / 4 - (class103.field1792[arg1][arg2 + 1][arg3] + class103.field1792[arg1][arg2][arg3] + class103.field1792[arg1][arg2][arg3 + 1] + class103.field1792[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class231 var16 = var14.field5012;
                                    if (var16 != null) {
                                        if (var16.field3401.method21()) {
                                            arg0.method24(var16.field3401, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field3388 != null && var16.field3388.method21()) {
                                            arg0.method24(var16.field3388, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field5022; ++var17) {
                                        class156 var18 = var14.field5037[var17];
                                        if (var18 != null && var18.field2436.method21() && (var18.field2443 == var12 || var7 == var12) && (var18.field2432 == var13 || var9 == var13)) {
                                            int var19 = var18.field2447 - var18.field2443 + 1;
                                            int var20 = var18.field2441 - var18.field2432 + 1;
                                            arg0.method24(var18.field2436, (var18.field2443 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field2432 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                --var7;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lhc;II)V")
    public final void method40(class53 arg0, int arg1, int arg2) {
        if (arg2 != 25645) {
            field3205 = null;
        }
        if (~arg1 == -1) {
            super.field1381 = arg0.method366(-16505) == 1;
        }
        ++field3206;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V")
    public class220() {
        super(3, false);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)[[I")
    public final int[][] method143(int arg0, int arg1) {
        if (arg1 != 6) {
            field3205 = null;
        }
        ++field3209;
        int[][] var3 = super.field1390.method1902(-122, arg0);
        if (super.field1390.field4428) {
            int[] var4 = this.method642(2, arg0, true);
            int[][] var5 = this.method648(arg0, 12, 0);
            int[][] var6 = this.method648(arg0, arg1 + 47, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class206.field3032; ++var16) {
                int var17 = var4[var16];
                if (var17 != 4096) {
                    if (var17 == 0) {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    } else {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                        var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                    }
                } else {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!j", name = "h", descriptor = "(I)V")
    public static final void method1536(int arg0) {
        int var1 = 126 % ((-69 - arg0) / 54);
        class141.field2274.method1420((byte) -94);
        ++field3208;
    }
}
