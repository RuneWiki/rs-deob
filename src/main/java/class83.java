import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class83 extends class285 {

    @OriginalMember(owner = "client!ob", name = "V", descriptor = "[S")
    private short[] field1159 = new short[257];

    @OriginalMember(owner = "client!ob", name = "db", descriptor = "I")
    private int field1167 = 0;

    @OriginalMember(owner = "client!ob", name = "hb", descriptor = "I")
    public static int field1171 = 0;

    @OriginalMember(owner = "client!ob", name = "gb", descriptor = "Ldb;")
    public static class102 field1170 = new class102(500);

    @OriginalMember(owner = "client!ob", name = "O", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!ob", name = "P", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!ob", name = "R", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!ob", name = "T", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!ob", name = "U", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!ob", name = "W", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!ob", name = "X", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!ob", name = "Z", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!ob", name = "ab", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!ob", name = "bb", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!ob", name = "cb", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!ob", name = "eb", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!ob", name = "jb", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!ob", name = "S", descriptor = "[I")
    private int[] field1156;

    @OriginalMember(owner = "client!ob", name = "Y", descriptor = "[I")
    private int[] field1162;

    @OriginalMember(owner = "client!ob", name = "fb", descriptor = "[[I")
    private int[][] field1169;

    @OriginalMember(owner = "client!ob", name = "ib", descriptor = "[[[I")
    public static int[][][] field1172;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)Loe;", line = 4)
    public static final class225 method559(int arg0, int arg1, int arg2) {
        class204 var3 = class324.field5032[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class225 var4 = var3.field3364;
            var3.field3364 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIILak;BIZ)V", line = 25)
    public static final void method560(int arg0, int arg1, int arg2, class172 arg3, byte arg4, int arg5, boolean arg6) {
        class100.field1466 = arg6;
        if (arg4 < 4) {
            field1171 = -60;
        }
        class291.field4652 = arg0;
        class67.field962 = arg5;
        field1164++;
        class286.field4586 = 1;
        class274.field4416 = arg1;
        class281.field4529 = arg2;
        class325.field5040 = arg3;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(Z)V", line = 54)
    private final void method561(boolean arg0) {
        int var2 = this.field1167;
        if (var2 == 2) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; this.field1169.length - 1 > var5 && var4 >= this.field1169[var5][0]; var5++) {
                }
                int[] var6 = this.field1169[var5 - 1];
                int[] var7 = this.field1169[var5];
                int var8 = this.method562(-16016, var5 - 2)[1];
                int var9 = var6[1];
                int var10 = var7[1];
                int var11 = this.method562(-16016, var5 + 1)[1];
                int var12 = (var4 - var6[0] << 12) / (var7[0] - var6[0]);
                int var13 = var9 + var11 - var8 - var10;
                int var14 = var12 * var12 >> 12;
                int var15 = var8 - var9 - var13;
                int var16 = var10 - var8;
                int var18 = (var12 * var13 >> 12) * var14 >> 12;
                int var19 = var14 * var15 >> 12;
                int var20 = var12 * var16 >> 12;
                int var21 = var18 + var20 + var9 + var19;
                if (var21 <= -32768) {
                    var21 = -32767;
                }
                if (var21 >= 32768) {
                    var21 = 32767;
                }
                this.field1159[var3] = (short) var21;
            }
        } else if (var2 == 1) {
            for (int var30 = 0; var30 < 257; var30++) {
                int var31 = var30 << 4;
                int var32;
                for (var32 = 1; (this.field1169.length - 1) > var32 && this.field1169[var32][0] <= var31; var32++) {
                }
                int[] var33 = this.field1169[var32];
                int[] var34 = this.field1169[var32 - 1];
                int var35 = (var31 - var34[0] << 12) / (var33[0] - var34[0]);
                int var36 = 4096 - class51.field731[(var35 & 0x1FFE) >> 5] >> 1;
                int var37 = 4096 - var36;
                int var38 = var33[1] * var36 + var34[1] * var37 >> 12;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field1159[var30] = (short) var38;
            }
        } else {
            for (int var22 = 0; var22 < 257; var22++) {
                int var23 = var22 << 4;
                int var24;
                for (var24 = 1; var24 < this.field1169.length - 1 && this.field1169[var24][0] <= var23; var24++) {
                }
                int[] var25 = this.field1169[var24];
                int[] var26 = this.field1169[var24 - 1];
                int var27 = (var23 - var26[0] << 12) / (var25[0] - var26[0]);
                int var28 = 4096 - var27;
                int var29 = var25[1] * var27 + var26[1] * var28 >> 12;
                if (var29 <= -32768) {
                    var29 = -32767;
                }
                if (var29 >= 32768) {
                    var29 = 32767;
                }
                this.field1159[var22] = (short) var29;
            }
        }
        if (arg0) {
            field1172 = (int[][][]) ((int[][][]) null);
        }
        field1161++;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)[I", line = 224)
    private final int[] method562(int arg0, int arg1) {
        if (arg0 != -16016) {
            field1172 = (int[][][]) ((int[][][]) null);
        }
        field1166++;
        if (arg1 < 0) {
            return this.field1156;
        } else if (this.field1169.length > arg1) {
            return this.field1169[arg1];
        } else {
            return this.field1162;
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V", line = 241)
    public class83() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZI)[I", line = 246)
    public final int[] method60(boolean arg0, int arg1) {
        if (!arg0) {
            this.method561(true);
        }
        field1157++;
        int[] var3 = this.field4573.method1116(125, arg1);
        if (this.field4573.field2420) {
            int[] var4 = this.method2048(0, (byte) 121, arg1);
            for (int var5 = 0; var5 < class287.field4599; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field1159[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(Z)V", line = 290)
    public static void method563(boolean arg0) {
        field1172 = (int[][][]) null;
        field1170 = null;
        if (arg0) {
            field1173 = -69;
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(BI)V", line = 301)
    public static final void method564(byte arg0, int arg1) {
        if (arg0 != -38) {
            method563(false);
        }
        field1154++;
        class344 var2 = class110.method759(3, arg1, false);
        var2.method2384(-27354);
    }

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "(I)V", line = 325)
    public final void method361(int arg0) {
        int var2 = -66 / ((arg0 - 42) / 36);
        if (this.field1169 == null) {
            this.field1169 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        field1163++;
        if (this.field1169.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field1167 == 2) {
            this.method565(-123);
        }
        class208.method1511((byte) -123);
        this.method561(false);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZLjj;I)V", line = 348)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        if (!arg0) {
            field1173 = -94;
        }
        field1168++;
        if (arg2 != 0) {
            return;
        }
        this.field1167 = arg1.method286((byte) -64);
        this.field1169 = new int[arg1.method286((byte) -95)][2];
        for (int var4 = 0; var4 < this.field1169.length; var4++) {
            this.field1169[var4][0] = arg1.method271(21081);
            this.field1169[var4][1] = arg1.method271(21081);
        }
    }

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "(I)V", line = 376)
    private final void method565(int arg0) {
        field1158++;
        int[] var2 = this.field1169[1];
        int[] var3 = this.field1169[0];
        int[] var4 = this.field1169[this.field1169.length - 2];
        int[] var5 = this.field1169[this.field1169.length - 1];
        this.field1162 = new int[] { var4[0] + var4[0] - var5[0], var4[1] + var4[1] + -var5[1] };
        this.field1156 = new int[] { var3[0] - (var2[0] - var3[0]), var3[1] - -var3[1] + -var2[1] };
        if (arg0 >= -14) {
            this.field1156 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([JI[Ljava/lang/Object;)V", line = 396)
    public static final void method566(long[] arg0, int arg1, Object[] arg2) {
        if (arg1 != 21571) {
            field1172 = (int[][][]) ((int[][][]) null);
        }
        class7.method36(arg0.length - 1, arg2, arg1 ^ 0x5442, 0, arg0);
        field1165++;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(II)V", line = 409)
    public static final void method567(int arg0, int arg1) {
        field1160++;
        short var2 = 256;
        if (var2 < arg1) {
            arg1 = var2;
        }
        if (arg1 > 10) {
            arg1 = 10;
        }
        class325.field5041 += arg1 * 128;
        if (class309.field4804.length < class325.field5041) {
            class325.field5041 -= class309.field4804.length;
            int var3 = (int) (Math.random() * 12.0D);
            class91.method608(0, class139.field2181[var3]);
        }
        int var4 = 0;
        int var5 = (var2 - arg1) * 128;
        int var6 = arg1 * 128;
        if (arg0 <= 126) {
            return;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = class137.field2166[var4 + var6] - (class309.field4804[class325.field5041 + var4 & class309.field4804.length + -1] * arg1 / 6);
            if (var8 < 0) {
                var8 = 0;
            }
            class137.field2166[var4++] = var8;
        }
        for (int var9 = var2 - arg1; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class137.field2166[var11 + var10] = 255;
                } else {
                    class137.field2166[var11 + var10] = 0;
                }
            }
        }
        for (int var13 = 0; var13 < (var2 - arg1); var13++) {
            class129.field2016[var13] = class129.field2016[arg1 + var13];
        }
        for (int var14 = var2 - arg1; var14 < var2; var14++) {
            class129.field2016[var14] = (int) (Math.sin((double) class338.field5269 / 14.0D) * 16.0D + Math.sin((double) class338.field5269 / 15.0D) * 14.0D + Math.sin((double) class338.field5269 / 16.0D) * 12.0D);
            class338.field5269++;
        }
        int var15 = ((class240.field3818 & 0x1) + arg1) / 2;
        class152.field2344 += arg1;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class152.field2344; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            class137.field2166[(var18 << 7) + var17] = 192;
        }
        class152.field2344 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = var19 * 128;
            int var21 = 0;
            for (int var22 = -var15; var22 < 128; var22++) {
                if ((var15 + var22) < 128) {
                    var21 += class137.field2166[var15 + var20 + var22];
                }
                if (var22 - var15 - 1 >= 0) {
                    var21 -= class137.field2166[var22 + var20 - var15 - 1];
                }
                if (var22 >= 0) {
                    class331.field5166[var20 + var22] = var21 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if (var2 > var15 + var25) {
                    var24 += class331.field5166[var23 - (-(var15 * 128) - var26)];
                }
                if (var25 - var15 - 1 >= 0) {
                    var24 -= class331.field5166[var23 + var26 - ((var15 + 1) * 128)];
                }
                if (var25 >= 0) {
                    class137.field2166[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }
}
