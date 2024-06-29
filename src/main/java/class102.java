import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class102 extends class36 {

    @OriginalMember(owner = "client!co", name = "x", descriptor = "Z")
    public boolean field1211 = true;

    @OriginalMember(owner = "client!co", name = "H", descriptor = "Lig;")
    public static class206 field1221 = new class206(84, 17);

    @OriginalMember(owner = "client!co", name = "I", descriptor = "Lkca;")
    public static class73 field1222 = new class73(3, 8);

    @OriginalMember(owner = "client!co", name = "M", descriptor = "I")
    public static int field1226 = 13156520;

    @OriginalMember(owner = "client!co", name = "N", descriptor = "F")
    public static float field1227;

    @OriginalMember(owner = "client!co", name = "q", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!co", name = "r", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!co", name = "s", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!co", name = "u", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!co", name = "v", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!co", name = "w", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!co", name = "y", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!co", name = "z", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!co", name = "B", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!co", name = "D", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!co", name = "E", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!co", name = "G", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!co", name = "J", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!co", name = "K", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!co", name = "L", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!co", name = "t", descriptor = "Lpc;")
    public class585 field1207;

    @OriginalMember(owner = "client!co", name = "p", descriptor = "[I")
    private int[] field1203;

    @OriginalMember(owner = "client!co", name = "C", descriptor = "[I")
    public int[] field1216;

    @OriginalMember(owner = "client!co", name = "F", descriptor = "[Ljava/lang/String;")
    private String[] field1219;

    @OriginalMember(owner = "client!co", name = "A", descriptor = "[[I")
    private int[][] field1214;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(Z)Ljava/lang/String;", line = 9)
    public final String method624(boolean arg0) {
        if (arg0) {
            this.method626(80, null);
        }
        field1212++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field1219 == null) {
            return "";
        }
        var2.append(this.field1219[0]);
        for (int var3 = 1; var3 < this.field1219.length; var3++) {
            var2.append("...");
            var2.append(this.field1219[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IILrt;)V", line = 38)
    private final void method625(int arg0, int arg1, class194 arg2) {
        int var4 = 88 / ((10 - arg1) / 44);
        field1209++;
        if (arg0 == 1) {
            this.field1219 = class293.method1890('<', (byte) -1, arg2.method1218(false));
        } else if (arg0 == 2) {
            int var5 = arg2.method1177(255);
            this.field1216 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1216[var6] = arg2.method1220(-107);
            }
        } else if (arg0 == 3) {
            int var7 = arg2.method1177(255);
            this.field1203 = new int[var7];
            this.field1214 = new int[var7][];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = arg2.method1220(-11);
                class272 var10 = class506.method3009((byte) -117, var9);
                if (var10 != null) {
                    this.field1203[var8] = var9;
                    this.field1214[var8] = new int[var10.field3811];
                    for (int var11 = 0; var11 < var10.field3811; var11++) {
                        this.field1214[var8][var11] = arg2.method1220(-17);
                    }
                }
            }
        } else if (arg0 == 4) {
            this.field1211 = false;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ILrt;)Ljava/lang/String;", line = 111)
    public final String method626(int arg0, class194 arg1) {
        if (arg0 > -65) {
            return null;
        }
        field1224++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field1203 != null) {
            for (int var4 = 0; var4 < this.field1203.length; var4++) {
                var3.append(this.field1219[var4]);
                var3.append(this.field1207.method3404(arg1.method1189((byte) -57, class506.method3009((byte) -114, this.field1203[var4]).field3813), this.method635(var4, -1), this.field1214[var4], 117));
            }
        }
        var3.append(this.field1219[this.field1219.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)I", line = 141)
    public final int method627(int arg0) {
        field1204++;
        if (arg0 == 0) {
            return this.field1203 == null ? 0 : this.field1203.length;
        } else {
            return 39;
        }
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(II)I", line = 159)
    public static final int method628(int arg0, int arg1) {
        field1215++;
        if (arg1 != 80) {
            return -75;
        }
        int var2 = arg0 & 0x3F;
        int var3 = (arg0 & 0xD9) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "([ILrt;I)V", line = 215)
    public final void method629(int[] arg0, class194 arg1, int arg2) {
        field1213++;
        if (this.field1203 == null) {
            return;
        }
        for (int var4 = arg2; var4 < this.field1203.length; var4++) {
            if (var4 >= arg0.length) {
                return;
            }
            int var5 = this.method635(var4, -1).field3807;
            if (var5 > 0) {
                arg1.method1210(var5, -1, (long) arg0[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(ILrt;)V", line = 239)
    public final void method630(int arg0, class194 arg1) {
        field1206++;
        if (arg0 != 0) {
            return;
        }
        while (true) {
            int var3 = arg1.method1177(255);
            if (var3 == 0) {
                return;
            }
            this.method625(var3, -112, arg1);
        }
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(II)Z", line = 266)
    public static final boolean method631(int arg0, int arg1) {
        if (arg0 != 13542) {
            field1221 = null;
        }
        field1218++;
        return arg1 == 0 || arg1 == 1;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V", line = 277)
    public static void method632(byte arg0) {
        field1221 = null;
        int var1 = -14 / ((arg0 + 49) / 49);
        field1222 = null;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IBI)Z", line = 290)
    public static final boolean method633(int arg0, byte arg1, int arg2) {
        field1223++;
        int var3 = 44 / ((-arg1 - 15) / 32);
        return class297.method1989(arg2, (byte) -95, arg0) || class626.method3595(arg0, (byte) 72, arg2);
    }

    @OriginalMember(owner = "client!co", name = "g", descriptor = "(I)V", line = 300)
    public static final void method634(int arg0) {
        class206.field2769 = 0;
        field1220++;
        int var1 = (class439.field6548.field1764 >> 9) + class287.field3980;
        int var2 = (class439.field6548.field1768 >> 9) + class250.field3549;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class206.field2769 = 1;
        }
        if (arg0 != -9493) {
            method632((byte) 99);
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class206.field2769 = 1;
        }
        if (class206.field2769 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class206.field2769 = 0;
        }
    }

    @OriginalMember(owner = "client!co", name = "d", descriptor = "(II)Ldb;", line = 325)
    public final class272 method635(int arg0, int arg1) {
        if (arg1 == -1) {
            field1208++;
            return this.field1203 == null || arg0 < 0 || arg0 > this.field1203.length ? null : class506.method3009((byte) -119, this.field1203[arg0]);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(B)V", line = 341)
    public final void method636(byte arg0) {
        if (arg0 != -30) {
            method634(118);
        }
        if (this.field1216 != null) {
            for (int var2 = 0; var2 < this.field1216.length; var2++) {
                this.field1216[var2] = class283.method1834(this.field1216[var2], 32768);
            }
        }
        field1205++;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(FIIIIF[FIIIB)V", line = 363)
    public static final void method637(float arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float[] arg6, int arg7, int arg8, int arg9, byte arg10) {
        field1210++;
        int var11 = arg7 - arg3;
        if (arg10 != 117) {
            field1221 = null;
        }
        int var12 = arg4 - arg9;
        int var13 = arg1 - arg2;
        float var14 = arg6[2] * (float) var11 + arg6[1] * (float) var13 + arg6[0] * (float) var12;
        float var15 = arg6[5] * (float) var11 + arg6[4] * (float) var13 + arg6[3] * (float) var12;
        float var16 = arg6[8] * (float) var11 + arg6[6] * (float) var12 + arg6[7] * (float) var13;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg0 != 1.0F) {
            var17 = arg0 * var17;
        }
        float var18 = var15 + arg5 + 0.5F;
        if (arg8 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg8 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg8 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class11.field97 = var17;
        class145.field1780 = var18;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IZI)I", line = 424)
    public final int method638(int arg0, boolean arg1, int arg2) {
        field1217++;
        if (arg1) {
            return -10;
        } else if (this.field1203 == null || arg2 < 0 || arg2 > this.field1203.length) {
            return -1;
        } else if (this.field1214[arg2] == null || arg0 < 0 || arg0 > this.field1214[arg2].length) {
            return -1;
        } else {
            return this.field1214[arg2][arg0];
        }
    }
}
