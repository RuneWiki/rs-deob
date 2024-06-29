import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class181 extends class59 {

    @OriginalMember(owner = "client!bg", name = "I", descriptor = "I")
    private int field2958 = 4;

    @OriginalMember(owner = "client!bg", name = "T", descriptor = "I")
    private int field2969 = 4;

    @OriginalMember(owner = "client!bg", name = "P", descriptor = "I")
    public static int field2965 = 0;

    @OriginalMember(owner = "client!bg", name = "K", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!bg", name = "L", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!bg", name = "M", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!bg", name = "N", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!bg", name = "O", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!bg", name = "Q", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!bg", name = "S", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!bg", name = "R", descriptor = "Lri;")
    public static class301 field2967;

    @OriginalMember(owner = "client!bg", name = "J", descriptor = "[Lcl;")
    public static class32[] field2959;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lhb;B)Lvi;", line = 7)
    public static final class299 method1286(class164 arg0, byte arg1) {
        int var2 = 28 % ((63 - arg1) / 35);
        field2960++;
        return new class299(arg0.method1179((byte) -74), arg0.method1179((byte) -74), arg0.method1179((byte) -74), arg0.method1179((byte) -74), arg0.method1176(1048115912), arg0.method1176(1048115912), arg0.method1178(8));
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)[[I", line = 22)
    public final int[][] method116(int arg0, int arg1) {
        field2966++;
        int[][] var3 = this.field838.method1796(true, arg0);
        if (this.field838.field4334) {
            int var4 = class293.field4789 / this.field2958;
            int var5 = class241.field3993 / this.field2969;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method397(1, 0, class241.field3993 * var6 / var5);
            } else {
                var7 = this.method397(1, 0, 0);
            }
            int[] var8 = var7[1];
            int[] var9 = var7[0];
            int[] var10 = var3[0];
            int[] var11 = var7[2];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class293.field4789; var14++) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class293.field4789 * var16 / var4;
                }
                var10[var14] = var9[var15];
                var12[var14] = var8[var15];
                var13[var14] = var11[var15];
            }
        }
        if (arg1 != 4588) {
            method1290(-122, -60, 49, -22);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V", line = 90)
    public static final void method1287(boolean arg0) {
        class147.field2379 &= 0x7FF;
        if (class245.field4049 < 128) {
            class245.field4049 = 128;
        }
        if (class245.field4049 > 383) {
            class245.field4049 = 383;
        }
        field2962++;
        int var1 = class290.field4753 >> 7;
        int var2 = class147.field2385 >> 7;
        int var3 = 0;
        int var4 = class259.method1801(class147.field2385, -20428, class298.field4849, class290.field4753);
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class298.field4849;
                    if (var7 < 3 && (class245.field4050[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = (class149.field2415[var7][var5][var6] & 0xFF) * 8 - (class192.field3174[var7][var5][var6] - var4);
                    if (var3 < var8) {
                        var3 = var8;
                    }
                }
            }
        }
        int var9 = var3 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (arg0) {
            return;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (var9 > class66.field1007) {
            class66.field1007 += (var9 - class66.field1007) / 24;
        } else if (class66.field1007 > var9) {
            class66.field1007 += (var9 - class66.field1007) / 80;
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(Z)V", line = 163)
    public static final void method1288(boolean arg0) {
        int var1 = class213.field3517.method258(class134.field2183);
        for (int var2 = 0; var2 < class314.field5337; var2++) {
            int var3 = class213.field3517.method258(class263.method1834(var2, (byte) -111));
            if (var3 > var1) {
                var1 = var3;
            }
        }
        if (arg0) {
            return;
        }
        int var4 = class314.field5337 * 15 + 21;
        field2968++;
        var1 += 8;
        int var5 = class18.field248 - (var1 / 2);
        if (var1 + var5 > class273.field4567) {
            var5 = class273.field4567 - var1;
        }
        int var6 = class312.field5254;
        if (var4 + var6 > class266.field4484) {
            var6 = class266.field4484 - var4;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class145.field2351 == 1) {
            if (class295.field4826 == class18.field248 && class312.field5254 == class136.field2207) {
                class304.field5078 = var6;
                class186.field3027 = true;
                class156.field2537 = class314.field5337 * 15 + 22;
                class145.field2351 = 0;
                class36.field595 = var5;
                class108.field1845 = var1;
            }
        } else if (class48.field697 == class18.field248 && class312.field5254 == class220.field3613) {
            class36.field595 = var5;
            class145.field2351 = 0;
            class304.field5078 = var6;
            class186.field3027 = true;
            class108.field1845 = var1;
            class156.field2537 = class314.field5337 * 15 + 22;
        } else {
            class136.field2207 = class220.field3613;
            class295.field4826 = class48.field697;
            class145.field2351 = 1;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZI)[I", line = 252)
    public final int[] method63(boolean arg0, int arg1) {
        field2964++;
        if (!arg0) {
            this.field2969 = -80;
        }
        int[] var3 = this.field846.method383(3583, arg1);
        if (this.field846.field811) {
            int var4 = class241.field3993 / this.field2969;
            int var5 = class293.field4789 / this.field2958;
            int[] var7;
            if (var4 > 0) {
                int var6 = arg1 % var4;
                var7 = this.method394(class241.field3993 * var6 / var4, 0, (byte) -47);
            } else {
                var7 = this.method394(0, 0, (byte) 127);
            }
            for (int var8 = 0; var8 < class293.field4789; var8++) {
                if (var5 > 0) {
                    int var9 = var8 % var5;
                    var3[var8] = var7[class293.field4789 * var9 / var5];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "(I)V", line = 307)
    public static void method1289(int arg0) {
        field2967 = null;
        if (arg0 >= -74) {
            field2959 = (class32[]) null;
        }
        field2959 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIII)Z", line = 320)
    public static final boolean method1290(int arg0, int arg1, int arg2, int arg3) {
        if (class262.method1824(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class61.method418(var4 + 1, class192.field3174[arg0][arg1][arg2] + arg3, var5 + 1) && class61.method418(var4 + 128 - 1, class192.field3174[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class61.method418(var4 + 128 - 1, class192.field3174[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class61.method418(var4 + 1, class192.field3174[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V", line = 379)
    public class181() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BILhb;)V", line = 351)
    public final void method67(byte arg0, int arg1, class164 arg2) {
        if (arg1 == 0) {
            this.field2958 = arg2.method1178(8);
        } else if (arg1 == 1) {
            this.field2969 = arg2.method1178(8);
        }
        if (arg0 != 115) {
            this.field2969 = -119;
        }
        field2961++;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V", line = 387)
    public static final void method1291(byte arg0) {
        class100.field1717 = 0;
        int var1 = (class230.field3820.field5147 >> 7) + class1.field9;
        if (arg0 != 93) {
            method1287(true);
        }
        field2963++;
        int var2 = (class230.field3820.field5168 >> 7) + class1.field1;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class100.field1717 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class100.field1717 = 1;
        }
        if (class100.field1717 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class100.field1717 = 0;
        }
    }
}
