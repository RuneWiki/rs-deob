import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class199 extends class21 {

    @OriginalMember(owner = "client!bh", name = "S", descriptor = "F")
    public static float field3185 = 0.0F;

    @OriginalMember(owner = "client!bh", name = "N", descriptor = "[I")
    public static int[] field3180 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!bh", name = "P", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!bh", name = "Q", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!bh", name = "R", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!bh", name = "T", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!bh", name = "U", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!bh", name = "V", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!bh", name = "W", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!bh", name = "X", descriptor = "[Lfi;")
    private class120[] field3190;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIII)Z", line = 3)
    public static final boolean method1268(int arg0, int arg1, int arg2, int arg3) {
        if (class2.method8(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class168.method1065(var4 + 1, class45.field923[arg0][arg1][arg2] + arg3, var5 + 1) && class168.method1065(var4 + 128 - 1, class45.field923[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class168.method1065(var4 + 128 - 1, class45.field923[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class168.method1065(var4 + 1, class45.field923[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)[I", line = 21)
    public final int[] method177(int arg0, int arg1) {
        field3189++;
        int[] var3 = this.field443.method1040(arg1, false);
        int var4 = -26 % ((33 - arg0) / 36);
        if (this.field443.field2637) {
            this.method1272(0, this.field443.method1043(-89));
        }
        return var3;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V", line = 41)
    public class199() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(Z)V", line = 44)
    public static final void method1269(boolean arg0) {
        if (arg0) {
            class326.field4975 = class239.field3738;
            class45.field923 = class136.field2290;
            class141.field2340 = class48.field1001;
        } else {
            class326.field4975 = class197.field3169;
            class45.field923 = class46.field954;
            class141.field2340 = class61.field1180;
        }
        class164.field2638 = class326.field4975.length;
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)V", line = 64)
    public static final void method1270(int arg0) {
        class175.field2821 = arg0;
        for (int var1 = 0; var1 < class306.field4629; var1++) {
            for (int var2 = 0; var2 < class39.field762; var2++) {
                if (class326.field4975[arg0][var1][var2] == null) {
                    class326.field4975[arg0][var1][var2] = new class47(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "(B)V", line = 91)
    public static void method1271(byte arg0) {
        field3180 = null;
        if (arg0 != 98) {
            field3180 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(IB)[[I", line = 111)
    public final int[][] method175(int arg0, byte arg1) {
        field3183++;
        if (arg1 < 16) {
            field3180 = (int[]) null;
        }
        int[][] var3 = this.field441.method220(arg0, 17433);
        if (this.field441.field532) {
            int var4 = class294.field4489;
            int var5 = class147.field2421;
            int[][][] var6 = this.field441.method222(0);
            int[][] var7 = new int[var5][var4];
            this.method1272(0, var7);
            for (int var8 = 0; var8 < class147.field2421; var8++) {
                int[] var9 = var7[var8];
                int[][] var10 = var6[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class294.field4489; var14++) {
                    int var15 = var9[var14];
                    var13[var14] = class61.method475(255, var15) << 4;
                    var12[var14] = class61.method475(65280, var15) >> 4;
                    var11[var14] = class61.method475(var15, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILag;)V", line = 167)
    public final void method178(int arg0, int arg1, class202 arg2) {
        field3188++;
        if (arg1 == 0) {
            this.field3190 = new class120[arg2.method1317((byte) -69)];
            for (int var4 = 0; var4 < this.field3190.length; var4++) {
                int var5 = arg2.method1317((byte) -112);
                if (var5 == 0) {
                    this.field3190[var4] = class215.method1445(-1, arg2);
                } else if (var5 == 1) {
                    this.field3190[var4] = class279.method1879(-13544, arg2);
                } else if (var5 == 2) {
                    this.field3190[var4] = class30.method240(1, arg2);
                } else if (var5 == 3) {
                    this.field3190[var4] = class330.method2288(arg2, arg0 + 318);
                }
            }
        } else if (arg1 == 1) {
            this.field444 = arg2.method1317((byte) -99) == 1;
        }
        if (arg0 != -318) {
            this.field3190 = (class120[]) null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I[[I)V", line = 240)
    private final void method1272(int arg0, int[][] arg1) {
        field3184++;
        int var3 = class147.field2421;
        int var4 = class294.field4489;
        class44.method340(118, arg1);
        class87.method614(arg0, class4.field108, class204.field3323, (byte) -127, 0);
        if (this.field3190 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field3190.length; var5++) {
            class120 var6 = this.field3190[var5];
            int var7 = var6.field2086;
            int var8 = var6.field2084;
            if (var7 < 0) {
                if (var8 >= 0) {
                    var6.method290(-122, var4, var3);
                }
            } else if (var8 < 0) {
                var6.method293(var3, var4, false);
            } else {
                var6.method292(var3, var4, false);
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILkl;)Z", line = 290)
    public static final boolean method1273(int arg0, class68 arg1) {
        field3181++;
        if (arg0 != 7140) {
            return true;
        } else if (arg1.field1351 == null) {
            return false;
        } else {
            for (int var2 = 0; var2 < arg1.field1351.length; var2++) {
                int var3 = class259.method1737(14, arg1, var2);
                int var4 = arg1.field1410[var2];
                if (arg1.field1351[var2] == 2) {
                    if (var4 <= var3) {
                        return false;
                    }
                } else if (arg1.field1351[var2] == 3) {
                    if (var3 <= var4) {
                        return false;
                    }
                } else if (arg1.field1351[var2] == 4) {
                    if (var3 == var4) {
                        return false;
                    }
                } else if (var3 != var4) {
                    return false;
                }
            }
            return true;
        }
    }
}
