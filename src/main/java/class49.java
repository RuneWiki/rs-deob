import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class49 extends class678 {

    @OriginalMember(owner = "client!vg", name = "u", descriptor = "Z")
    public boolean field1155 = true;

    @OriginalMember(owner = "client!vg", name = "C", descriptor = "Lqfa;")
    public static class85 field1163 = new class85(59, -1);

    @OriginalMember(owner = "client!vg", name = "G", descriptor = "Lmea;")
    public static class398 field1167 = new class398("stellardawn", 1);

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!vg", name = "w", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!vg", name = "x", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!vg", name = "y", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!vg", name = "D", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!vg", name = "F", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!vg", name = "I", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!vg", name = "J", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!vg", name = "K", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!vg", name = "H", descriptor = "Lrm;")
    public class379 field1168;

    @OriginalMember(owner = "client!vg", name = "A", descriptor = "[I")
    public int[] field1161;

    @OriginalMember(owner = "client!vg", name = "B", descriptor = "[I")
    private int[] field1162;

    @OriginalMember(owner = "client!vg", name = "z", descriptor = "[Ljava/lang/String;")
    private String[] field1160;

    @OriginalMember(owner = "client!vg", name = "E", descriptor = "[[I")
    private int[][] field1165;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lqh;I)V")
    public static final void method605(class61 arg0, int arg1) {
        field1166++;
        if (arg1 != 65535) {
            return;
        }
        for (int var2 = 0; var2 < class673.field9581; var2++) {
            int var3 = arg0.method752(arg1 ^ 0xFFFF6A8D);
            int var4 = arg0.method723((byte) -25);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class105.field1847[var3] != null) {
                class105.field1847[var3].field5999 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public final void method606(int arg0) {
        if (this.field1161 != null) {
            for (int var2 = 0; var2 < this.field1161.length; var2++) {
                this.field1161[var2] = class2.method189(this.field1161[var2], 32768);
            }
        }
        if (arg0 != 0) {
            this.field1168 = null;
        }
        field1169++;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(Z)I")
    public final int method607(boolean arg0) {
        if (!arg0) {
            this.field1161 = null;
        }
        field1157++;
        return this.field1162 == null ? 0 : this.field1162.length;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BLqh;I)V")
    private final void method608(byte arg0, class61 arg1, int arg2) {
        field1170++;
        if (arg2 == 1) {
            this.field1160 = class394.method2433('<', arg1.method747(arg0 ^ 0xFFFFC6CC), (byte) 108);
        } else if (arg2 == 2) {
            int var4 = arg1.method732(-559537960);
            this.field1161 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1161[var5] = arg1.method723((byte) -25);
            }
        } else if (arg2 == 3) {
            int var6 = arg1.method732(-559537960);
            this.field1162 = new int[var6];
            this.field1165 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg1.method723((byte) -25);
                class254 var9 = class103.method962(var8, -119);
                if (var9 != null) {
                    this.field1162[var7] = var8;
                    this.field1165[var7] = new int[var9.field3768];
                    for (int var10 = 0; var10 < var9.field3768; var10++) {
                        this.field1165[var7][var10] = arg1.method723((byte) -25);
                    }
                }
            }
        } else if (arg2 == 4) {
            this.field1155 = false;
        }
        if (arg0 != -54) {
            this.field1161 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(Lqh;I)V")
    public final void method609(class61 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method732(-559537960);
            if (var3 == 0) {
                field1158++;
                if (arg1 > -48) {
                    this.method611(null, null, (byte) 118);
                    return;
                }
                return;
            }
            this.method608((byte) -54, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZI)I")
    public final int method610(int arg0, boolean arg1, int arg2) {
        field1153++;
        if (this.field1162 == null || arg2 < 0 || this.field1162.length < arg2) {
            return -1;
        } else if (this.field1165[arg2] == null || arg0 < 0 || this.field1165[arg2].length < arg0) {
            return -1;
        } else if (arg1) {
            return this.field1165[arg2][arg0];
        } else {
            return 79;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([ILqh;B)V")
    public final void method611(int[] arg0, class61 arg1, byte arg2) {
        field1164++;
        if (this.field1162 == null) {
            return;
        }
        if (arg2 != 4) {
            field1167 = null;
        }
        for (int var4 = 0; var4 < this.field1162.length; var4++) {
            if (arg0.length <= var4) {
                return;
            }
            int var5 = this.method612(var4, 125).field3770;
            if (var5 > 0) {
                arg1.method700(var5, 99, (long) arg0[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)Lja;")
    public final class254 method612(int arg0, int arg1) {
        field1159++;
        if (this.field1162 == null || arg0 < 0 || arg0 > this.field1162.length) {
            return null;
        } else if (arg1 < 120) {
            return null;
        } else {
            return class103.method962(this.field1162[arg0], -126);
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)V")
    public static void method613(byte arg0) {
        field1163 = null;
        if (arg0 <= 122) {
            method605(null, 102);
        }
        field1167 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BLqh;)Ljava/lang/String;")
    public final String method614(byte arg0, class61 arg1) {
        if (arg0 != -41) {
            return null;
        }
        field1171++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field1162 != null) {
            for (int var4 = 0; var4 < this.field1162.length; var4++) {
                var3.append(this.field1160[var4]);
                var3.append(this.field1168.method2368(arg1.method728(0, class103.method962(this.field1162[var4], -90).field3767), -12821, this.method612(var4, 125), this.field1165[var4]));
            }
        }
        var3.append(this.field1160[this.field1160.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "(I)Ljava/lang/String;")
    public final String method615(int arg0) {
        field1156++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field1160 == null) {
            return "";
        }
        var2.append(this.field1160[0]);
        if (arg0 != 65535) {
            this.field1162 = null;
        }
        for (int var3 = 1; var3 < this.field1160.length; var3++) {
            var2.append("...");
            var2.append(this.field1160[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lom;BLr;)V")
    public static final void method616(class344 arg0, byte arg1, class167 arg2) {
        field1154++;
        class279[] var3 = class279.method1844(arg0, class542.field7566, 0);
        class47.field1141 = new class702[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class47.field1141[var4] = arg2.method170(var3[var4], true);
        }
        class279[] var5 = class279.method1844(arg0, class302.field4504, 0);
        class284.field4222 = new class702[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class284.field4222[var6] = arg2.method170(var5[var6], true);
        }
        class279[] var7 = class279.method1844(arg0, class372.field5532, 0);
        class468.field6621 = new class702[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class468.field6621[var8] = arg2.method170(var7[var8], true);
        }
        class279[] var9 = class279.method1844(arg0, class208.field3178, 0);
        class515.field7295 = new class702[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class515.field7295[var10] = arg2.method170(var9[var10], true);
        }
        class279[] var11 = class279.method1844(arg0, class537.field7522, 0);
        class592.field8516 = new class702[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class592.field8516[var12] = arg2.method170(var11[var12], true);
        }
        class279[] var13 = class279.method1844(arg0, class493.field7048, 0);
        class513.field7239 = new class702[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class513.field7239[var14] = arg2.method170(var13[var14], true);
        }
        class279[] var15 = class279.method1844(arg0, class75.field1526, 0);
        class598.field8574 = new class702[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class598.field8574[var16] = arg2.method170(var15[var16], true);
        }
        class279[] var17 = class279.method1844(arg0, class454.field6488, 0);
        class342.field5098 = new class702[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class342.field5098[var18] = arg2.method170(var17[var18], true);
        }
        class279[] var19 = class279.method1844(arg0, class7.field514, 0);
        class288.field4300 = new class702[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class288.field4300[var20] = arg2.method170(var19[var20], true);
        }
        class279[] var21 = class279.method1844(arg0, class365.field5418, 0);
        class660.field9508 = new class702[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class660.field9508[var22] = arg2.method170(var21[var22], true);
        }
        if (arg1 >= -50) {
            method605(null, 73);
        }
        class279[] var23 = class279.method1844(arg0, class210.field3204, 0);
        class357.field5336 = new class702[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class357.field5336[var24] = arg2.method170(var23[var24], true);
        }
        class279[] var25 = class279.method1844(arg0, class681.field9650, 0);
        class381.field5638 = new class702[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class381.field5638[var26] = arg2.method170(var25[var26], true);
        }
        class311.field4630 = arg2.method170(class279.method1841(arg0, class604.field8763, 0), true);
        class173.field2851 = arg2.method170(class279.method1841(arg0, class365.field5414, 0), true);
        class279[] var27 = class279.method1844(arg0, class405.field5855, 0);
        class419.field6046 = new class702[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class419.field6046[var28] = arg2.method170(var27[var28], true);
        }
    }
}
