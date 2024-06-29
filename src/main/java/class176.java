import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class176 {

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public int field2843;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public static int field2836 = 0;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public int field2832;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
    public int field2841;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public int field2842;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "Lva;")
    public class254 field2831;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "Lbm;")
    public static class307 field2829;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "[I")
    public int[] field2823;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "[I")
    public int[] field2825;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "[I")
    public int[] field2826;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "[I")
    public int[] field2827;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "[I")
    public static int[] field2833;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "[I")
    public int[] field2834;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "[I")
    public int[] field2839;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "[Lva;")
    public class254[] field2828;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "[[I")
    public int[][] field2824;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "[[I")
    public int[][] field2835;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "()V", line = 4)
    public static final void method1105() {
        class220.field3492 = 0;
        label194: for (int var0 = 0; var0 < class66.field1249; var0++) {
            class191 var1 = class274.field4204[var0];
            if (class209.field3369 != null) {
                for (int var2 = 0; var2 < class209.field3369.length; var2++) {
                    if (class209.field3369[var2] != -1000000 && (var1.field3113 <= class209.field3369[var2] || var1.field3121 <= class209.field3369[var2]) && (var1.field3105 <= class101.field1767[var2] || var1.field3099 <= class101.field1767[var2]) && (var1.field3105 >= class28.field543[var2] || var1.field3099 >= class28.field543[var2]) && (var1.field3120 <= class296.field4511[var2] || var1.field3097 <= class296.field4511[var2]) && (var1.field3120 >= class97.field1713[var2] || var1.field3097 >= class97.field1713[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field3119 == 1) {
                int var3 = var1.field3103 + class339.field5251 - class166.field2675;
                if (var3 >= 0 && var3 <= class339.field5251 + class339.field5251) {
                    int var4 = var1.field3096 + class339.field5251 - class56.field1108;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field3101 + class339.field5251 - class56.field1108;
                    if (var5 > class339.field5251 + class339.field5251) {
                        var5 = class339.field5251 + class339.field5251;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class56.field1110[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class56.field1113 - var1.field3105;
                        if (var7 > 32) {
                            var1.field3107 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field3107 = 2;
                            var7 = -var7;
                        }
                        var1.field3098 = (var1.field3120 - class303.field4606 << 8) / var7;
                        var1.field3093 = (var1.field3097 - class303.field4606 << 8) / var7;
                        var1.field3118 = (var1.field3113 - class344.field5347 << 8) / var7;
                        var1.field3106 = (var1.field3121 - class344.field5347 << 8) / var7;
                        class327.field4992[class220.field3492++] = var1;
                    }
                }
            } else if (var1.field3119 == 2) {
                int var8 = var1.field3096 + class339.field5251 - class56.field1108;
                if (var8 >= 0 && var8 <= class339.field5251 + class339.field5251) {
                    int var9 = var1.field3103 + class339.field5251 - class166.field2675;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field3100 + class339.field5251 - class166.field2675;
                    if (var10 > class339.field5251 + class339.field5251) {
                        var10 = class339.field5251 + class339.field5251;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class56.field1110[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class303.field4606 - var1.field3120;
                        if (var12 > 32) {
                            var1.field3107 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field3107 = 4;
                            var12 = -var12;
                        }
                        var1.field3104 = (var1.field3105 - class56.field1113 << 8) / var12;
                        var1.field3108 = (var1.field3099 - class56.field1113 << 8) / var12;
                        var1.field3118 = (var1.field3113 - class344.field5347 << 8) / var12;
                        var1.field3106 = (var1.field3121 - class344.field5347 << 8) / var12;
                        class327.field4992[class220.field3492++] = var1;
                    }
                }
            } else if (var1.field3119 == 4) {
                int var13 = var1.field3113 - class344.field5347;
                if (var13 > 128) {
                    int var14 = var1.field3096 + class339.field5251 - class56.field1108;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field3101 + class339.field5251 - class56.field1108;
                    if (var15 > class339.field5251 + class339.field5251) {
                        var15 = class339.field5251 + class339.field5251;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field3103 + class339.field5251 - class166.field2675;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field3100 + class339.field5251 - class166.field2675;
                        if (var17 > class339.field5251 + class339.field5251) {
                            var17 = class339.field5251 + class339.field5251;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class56.field1110[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field3107 = 5;
                            var1.field3104 = (var1.field3105 - class56.field1113 << 8) / var13;
                            var1.field3108 = (var1.field3099 - class56.field1113 << 8) / var13;
                            var1.field3098 = (var1.field3120 - class303.field4606 << 8) / var13;
                            var1.field3093 = (var1.field3097 - class303.field4606 << 8) / var13;
                            class327.field4992[class220.field3492++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V", line = 245)
    public static final void method1106(boolean arg0) {
        class157.field2550.method1884(-22054);
        field2822++;
        if (arg0) {
            class106.field1825.method1884(-22054);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V", line = 257)
    public static final void method1107(int arg0) {
        field2837++;
        int var1 = 21 / ((-arg0 - 12) / 55);
        if (!class19.method127(-116) && class290.field4454 != class289.field4438) {
            class33.method262(class303.field4597, class66.field1265.field1871[0], class14.field270, -1, false, class289.field4438, class66.field1265.field1899[0], false);
        } else if (class289.field4438 != class189.field3070 && class202.method1327(class289.field4438, 98)) {
            class189.field3070 = class289.field4438;
            class210.method1423((byte) -112);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB[JI[Ljava/lang/Object;)V", line = 285)
    public static final void method1108(int arg0, byte arg1, long[] arg2, int arg3, Object[] arg4) {
        int var5 = -63 / ((arg1 - 49) / 33);
        field2830++;
        if (arg0 >= arg3) {
            return;
        }
        int var6 = (arg0 + arg3) / 2;
        int var7 = arg0;
        long var8 = arg2[var6];
        arg2[var6] = arg2[arg3];
        arg2[arg3] = var8;
        Object var10 = arg4[var6];
        arg4[var6] = arg4[arg3];
        arg4[arg3] = var10;
        for (int var11 = arg0; var11 < arg3; var11++) {
            if (arg2[var11] < ((long) (var11 & 0x1) + var8)) {
                long var12 = arg2[var11];
                arg2[var11] = arg2[var7];
                arg2[var7] = var12;
                Object var14 = arg4[var11];
                arg4[var11] = arg4[var7];
                arg4[var7++] = var14;
            }
        }
        arg2[arg3] = arg2[var7];
        arg2[var7] = var8;
        arg4[arg3] = arg4[var7];
        arg4[var7] = var10;
        method1108(arg0, (byte) -70, arg2, var7 - 1, arg4);
        method1108(var7 + 1, (byte) -109, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V", line = 341)
    public static void method1109(byte arg0) {
        if (arg0 <= 107) {
            method1106(false);
        }
        field2829 = null;
        field2833 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([BI)V", line = 354)
    private final void method1110(byte[] arg0, int arg1) {
        class202 var3 = new class202(class267.method1774(false, arg0));
        field2838++;
        int var4 = var3.method1317((byte) -82);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field2832 = 0;
        } else {
            this.field2832 = var3.method1346(-124);
        }
        int var5 = var3.method1317((byte) -87);
        this.field2841 = var3.method1315(14289);
        this.field2823 = new int[this.field2841];
        int var6 = 0;
        int var7 = -1;
        if (arg1 != 20701) {
            return;
        }
        for (int var8 = 0; var8 < this.field2841; var8++) {
            this.field2823[var8] = var6 += var3.method1315(14289);
            if (var7 < this.field2823[var8]) {
                var7 = this.field2823[var8];
            }
        }
        this.field2842 = var7 + 1;
        this.field2827 = new int[this.field2842];
        this.field2825 = new int[this.field2842];
        this.field2826 = new int[this.field2842];
        this.field2835 = new int[this.field2842][];
        this.field2839 = new int[this.field2842];
        if (var5 != 0) {
            this.field2834 = new int[this.field2842];
            for (int var9 = 0; var9 < this.field2842; var9++) {
                this.field2834[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field2841; var10++) {
                this.field2834[this.field2823[var10]] = var3.method1346(-122);
            }
            this.field2831 = new class254(this.field2834);
        }
        for (int var11 = 0; var11 < this.field2841; var11++) {
            this.field2826[this.field2823[var11]] = var3.method1346(-126);
        }
        for (int var12 = 0; var12 < this.field2841; var12++) {
            this.field2839[this.field2823[var12]] = var3.method1346(-126);
        }
        for (int var13 = 0; var13 < this.field2841; var13++) {
            this.field2825[this.field2823[var13]] = var3.method1315(class331.method2296(arg1, 26380));
        }
        for (int var14 = 0; var14 < this.field2841; var14++) {
            int var15 = 0;
            int var16 = this.field2823[var14];
            int var17 = this.field2825[var16];
            this.field2835[var16] = new int[var17];
            int var18 = -1;
            for (int var19 = 0; var19 < var17; var19++) {
                int var20 = this.field2835[var16][var19] = var15 += var3.method1315(14289);
                if (var18 < var20) {
                    var18 = var20;
                }
            }
            this.field2827[var16] = var18 + 1;
            if ((var18 + 1) == var17) {
                this.field2835[var16] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field2828 = new class254[var7 + 1];
        this.field2824 = new int[var7 + 1][];
        for (int var21 = 0; var21 < this.field2841; var21++) {
            int var22 = this.field2823[var21];
            int var23 = this.field2825[var22];
            this.field2824[var22] = new int[this.field2827[var22]];
            for (int var24 = 0; var24 < this.field2827[var22]; var24++) {
                this.field2824[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field2835[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field2835[var22][var25];
                }
                this.field2824[var22][var26] = var3.method1346(-128);
            }
            this.field2828[var22] = new class254(this.field2824[var22]);
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "([BI)V", line = 523)
    public class176(byte[] arg0, int arg1) {
        this.field2843 = class8.method70(arg0, (byte) -98, arg0.length);
        if (this.field2843 != arg1) {
            throw new RuntimeException();
        }
        this.method1110(arg0, 20701);
    }
}
