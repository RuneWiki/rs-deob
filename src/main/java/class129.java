import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class129 {

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "B")
    private byte field2315;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public int field2311;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public int field2308;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public int field2307;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public int field2314;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public int field2305;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "Lli;")
    public static class185 field2303 = class245.method1649(":", 127);

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "Lli;")
    public static class185 field2304 = class245.method1649("S-Blectionner", -15);

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "Lli;")
    public static class185 field2302 = class245.method1649("Atteindre", -111);

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "[[[B")
    public static byte[][][] field2312;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)I")
    public final int method918(boolean arg0) {
        if (!arg0) {
            this.field2308 = 56;
        }
        field2306++;
        return this.field2315 & 0x7;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BILhi;I)Lda;")
    public static final class101 method919(byte arg0, int arg1, class250 arg2, int arg3) {
        field2310++;
        if (arg0 > -80) {
            return null;
        } else if (class224.method1551(arg1, arg3, arg2, (byte) -94)) {
            return class18.method129(false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIZIIIIIIIII)Z")
    public static final boolean method920(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class27.field462[var12][var31] = 0;
                class263.field4673[var12][var31] = 99999999;
            }
        }
        field2309++;
        class27.field462[arg7][arg1] = 99;
        class263.field4673[arg7][arg1] = 0;
        int var13 = arg1;
        int var14 = arg7;
        byte var15 = 0;
        class173.field3178[var15] = arg7;
        int var16 = 0;
        if (arg0 > -79) {
            method919((byte) 49, 109, (class250) null, 79);
        }
        int var32 = var15 + 1;
        class9.field191[var15] = arg1;
        boolean var17 = false;
        int[][] var18 = class165.field3090[class265.field4703].field757;
        while (var32 != var16) {
            var14 = class173.field3178[var16];
            var13 = class9.field191[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg10 == var14 && arg8 == var13) {
                var17 = true;
                break;
            }
            if (arg4 != 0) {
                if ((arg4 < 5 || arg4 == 10) && class165.field3090[class265.field4703].method288(2, var13, arg10, arg8, arg4 - 1, arg5, (byte) 111, var14)) {
                    var17 = true;
                    break;
                }
                if (arg4 < 10 && class165.field3090[class265.field4703].method290(arg4 - 1, var13, 2, arg5, var14, (byte) 47, arg10, arg8)) {
                    var17 = true;
                    break;
                }
            }
            if (arg9 != 0 && arg6 != 0 && class165.field3090[class265.field4703].method302(arg8, arg9, var14, arg3, var13, 2, arg10, arg6, 1)) {
                var17 = true;
                break;
            }
            int var30 = class263.field4673[var14][var13] + 1;
            if (var14 > 0 && class27.field462[var14 - 1][var13] == 0 && (var18[var14 - 1][var13] & 0x12C010E) == 0 && (var18[var14 - 1][var13 + 1] & 0x12C0138) == 0) {
                class173.field3178[var32] = var14 - 1;
                class9.field191[var32] = var13;
                class27.field462[var14 - 1][var13] = 2;
                class263.field4673[var14 - 1][var13] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 102 && class27.field462[var14 + 1][var13] == 0 && (var18[var14 + 2][var13] & 0x12C0183) == 0 && (var18[var14 + 2][var13 + 1] & 0x12C01E0) == 0) {
                class173.field3178[var32] = var14 + 1;
                class9.field191[var32] = var13;
                class27.field462[var14 + 1][var13] = 8;
                var32 = var32 + 1 & 0xFFF;
                class263.field4673[var14 + 1][var13] = var30;
            }
            if (var13 > 0 && class27.field462[var14][var13 - 1] == 0 && (var18[var14][var13 - 1] & 0x12C010E) == 0 && (var18[var14 + 1][var13 - 1] & 0x12C0183) == 0) {
                class173.field3178[var32] = var14;
                class9.field191[var32] = var13 - 1;
                class27.field462[var14][var13 - 1] = 1;
                class263.field4673[var14][var13 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 < 102 && class27.field462[var14][var13 + 1] == 0 && (var18[var14][var13 + 2] & 0x12C0138) == 0 && (var18[var14 + 1][var13 + 2] & 0x12C01E0) == 0) {
                class173.field3178[var32] = var14;
                class9.field191[var32] = var13 + 1;
                class27.field462[var14][var13 + 1] = 4;
                var32 = var32 + 1 & 0xFFF;
                class263.field4673[var14][var13 + 1] = var30;
            }
            if (var14 > 0 && var13 > 0 && class27.field462[var14 - 1][var13 - 1] == 0 && (var18[var14 - 1][var13] & 0x12C0138) == 0 && (var18[var14 - 1][var13 - 1] & 0x12C010E) == 0 && (var18[var14][var13 - 1] & 0x12C0183) == 0) {
                class173.field3178[var32] = var14 - 1;
                class9.field191[var32] = var13 - 1;
                class27.field462[var14 - 1][var13 - 1] = 3;
                class263.field4673[var14 - 1][var13 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 102 && var13 > 0 && class27.field462[var14 + 1][var13 - 1] == 0 && (var18[var14 + 1][var13 - 1] & 0x12C010E) == 0 && (var18[var14 + 2][var13 - 1] & 0x12C0183) == 0 && (var18[var14 + 2][var13] & 0x12C01E0) == 0) {
                class173.field3178[var32] = var14 + 1;
                class9.field191[var32] = var13 - 1;
                class27.field462[var14 + 1][var13 - 1] = 9;
                var32 = var32 + 1 & 0xFFF;
                class263.field4673[var14 + 1][var13 - 1] = var30;
            }
            if (var14 > 0 && var13 < 102 && class27.field462[var14 - 1][var13 + 1] == 0 && (var18[var14 - 1][var13 + 1] & 0x12C010E) == 0 && (var18[var14 - 1][var13 + 2] & 0x12C0138) == 0 && (var18[var14][var13 + 2] & 0x12C01E0) == 0) {
                class173.field3178[var32] = var14 - 1;
                class9.field191[var32] = var13 + 1;
                var32 = var32 + 1 & 0xFFF;
                class27.field462[var14 - 1][var13 + 1] = 6;
                class263.field4673[var14 - 1][var13 + 1] = var30;
            }
            if (var14 < 102 && var13 < 102 && class27.field462[var14 + 1][var13 + 1] == 0 && (var18[var14 + 1][var13 + 2] & 0x12C0138) == 0 && (var18[var14 + 2][var13 + 2] & 0x12C01E0) == 0 && (var18[var14 + 2][var13 + 1] & 0x12C0183) == 0) {
                class173.field3178[var32] = var14 + 1;
                class9.field191[var32] = var13 + 1;
                class27.field462[var14 + 1][var13 + 1] = 12;
                var32 = var32 + 1 & 0xFFF;
                class263.field4673[var14 + 1][var13 + 1] = var30;
            }
        }
        class258.field4587 = 0;
        if (!var17) {
            if (!arg2) {
                return false;
            }
            int var19 = 100;
            int var20 = 1000;
            byte var21 = 10;
            for (int var22 = arg10 - var21; var22 <= arg10 + var21; var22++) {
                for (int var23 = arg8 - var21; var23 <= arg8 + var21; var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class263.field4673[var22][var23] < 100) {
                        int var24 = 0;
                        if (arg10 > var22) {
                            var24 = arg10 - var22;
                        } else if ((arg9 + arg10 - 1) < var22) {
                            var24 = var22 + 1 - arg10 - arg9;
                        }
                        int var25 = 0;
                        if (arg8 > var23) {
                            var25 = arg8 - var23;
                        } else if (arg6 + arg8 - 1 < var23) {
                            var25 = var23 + 1 - (arg6 + arg8);
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var26 < var20 || var20 == var26 && var19 > class263.field4673[var22][var23]) {
                            var20 = var26;
                            var14 = var22;
                            var13 = var23;
                            var19 = class263.field4673[var22][var23];
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg7 == var14 && arg1 == var13) {
                return false;
            }
            class258.field4587 = 1;
        }
        byte var27 = 0;
        class173.field3178[var27] = var14;
        int var33 = var27 + 1;
        class9.field191[var27] = var13;
        int var28;
        int var29 = var28 = class27.field462[var14][var13];
        while (arg7 != var14 || arg1 != var13) {
            if (var28 != var29) {
                var28 = var29;
                class173.field3178[var33] = var14;
                class9.field191[var33++] = var13;
            }
            if ((var29 & 0x2) != 0) {
                var14++;
            } else if ((var29 & 0x8) != 0) {
                var14--;
            }
            if ((var29 & 0x1) != 0) {
                var13++;
            } else if ((var29 & 0x4) != 0) {
                var13--;
            }
            var29 = class27.field462[var14][var13];
        }
        if (var33 > 0) {
            class237.method1610(var33, (byte) 4, arg11);
            return true;
        } else if (arg11 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
    public static void method921(int arg0) {
        field2303 = null;
        field2312 = null;
        if (arg0 == -1) {
            field2304 = null;
            field2302 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)I")
    public final int method922(byte arg0) {
        if (arg0 >= -11) {
            return 126;
        } else {
            field2301++;
            return (this.field2315 & 0x8) == 8 ? 1 : 0;
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)V")
    public static final void method923(byte arg0) {
        field2313++;
        if (class188.field3475 == -1 || class109.field1971 == -1) {
            return;
        }
        int var1 = ((class47.field779 - class36.field561) * class26.field439 >> 16) + class36.field561;
        class26.field439 += var1;
        if (class26.field439 >= 65535) {
            if (class250.field4456) {
                class136.field2556 = false;
            } else {
                class136.field2556 = true;
            }
            class250.field4456 = true;
            class26.field439 = 65535;
        } else {
            class250.field4456 = false;
            class136.field2556 = false;
        }
        float var2 = (float) class26.field439 / 65535.0F;
        int var3 = 25 / ((arg0 - 57) / 50);
        float[] var4 = new float[3];
        int var5 = class259.field4606 * 2;
        for (int var6 = 0; var6 < 3; var6++) {
            int var22 = class195.field3582[class188.field3475][var5][var6] * 3;
            int var23 = class195.field3582[class188.field3475][var5 + 1][var6] * 3;
            int var24 = (class195.field3582[class188.field3475][var5 + 2][var6] + class195.field3582[class188.field3475][var5 - -2][var6] - class195.field3582[class188.field3475][var5 + 3][var6]) * 3;
            int var25 = class195.field3582[class188.field3475][var5][var6];
            int var26 = var23 - var22;
            int var27 = var24 + var22 - (var23 * 2);
            int var28 = class195.field3582[class188.field3475][var5 + 2][var6] + var23 - var25 - var24;
            var4[var6] = (((float) var28 * var2 + (float) var27) * var2 + (float) var26) * var2 + (float) var25;
        }
        class7.field157 = (int) var4[1] * -1;
        class113.field2039 = (int) var4[0] - (class77.field1339 * 128);
        class268.field4745 = (int) var4[2] - class107.field1933 * 128;
        float[] var7 = new float[3];
        int var8 = class142.field2729 * 2;
        for (int var9 = 0; var9 < 3; var9++) {
            int var15 = class195.field3582[class109.field1971][var8][var9] * 3;
            int var16 = class195.field3582[class109.field1971][var8 + 1][var9] * 3;
            int var17 = (class195.field3582[class109.field1971][var8 + 2][var9] - (class195.field3582[class109.field1971][var8 + 3][var9] - class195.field3582[class109.field1971][var8 + 2][var9])) * 3;
            int var18 = class195.field3582[class109.field1971][var8][var9];
            int var19 = var16 - var15;
            int var20 = var16 + class195.field3582[class109.field1971][var8 + 2][var9] - var17 - var18;
            int var21 = var15 + var17 - var16 * 2;
            var7[var9] = (((float) var20 * var2 + (float) var21) * var2 + (float) var19) * var2 + (float) var18;
        }
        float var10 = var7[0] - var4[0];
        float var11 = (var7[1] - var4[1]) * -1.0F;
        float var12 = var7[2] - var4[2];
        double var13 = Math.sqrt((double) (var10 * var10 + var12 * var12));
        class183.field3366 = (float) Math.atan2((double) var11, var13);
        class178.field3259 = -((float) Math.atan2((double) var10, (double) var12));
        class3.field69 = (int) ((double) class178.field3259 * 325.949D) & 0x7FF;
        class136.field2550 = (int) ((double) class183.field3366 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
    public class129() {
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Ljd;)V")
    public class129(class118 arg0) {
        this.field2315 = arg0.method838(1275919136);
        this.field2311 = arg0.method827(255);
        this.field2308 = arg0.method875((byte) 95);
        this.field2307 = arg0.method875((byte) 82);
        this.field2314 = arg0.method875((byte) 65);
        this.field2305 = arg0.method875((byte) 102);
    }
}
