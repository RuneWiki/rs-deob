import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class203 extends class68 {

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "Lad;")
    public class128 field3230 = new class128();

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "Lak;")
    public class313 field3235 = new class313();

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "Lsa;")
    private class109 field3229;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field3220 = 0;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public static int field3231 = 0;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 12)
    public final void method571(int arg0) {
        field3224++;
        this.field3235.method571(arg0);
        for (class285 var2 = (class285) this.field3230.method986(false); var2 != null; var2 = (class285) this.field3230.method982(14877)) {
            if (!this.field3229.method864(7, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field4388 >= var3) {
                        this.method1466(0, var2, var3);
                        var2.field4388 -= var3;
                        break;
                    }
                    this.method1466(0, var2, var2.field4388);
                    var3 -= var2.field4388;
                } while (!this.field3229.method843(var2, var3, 0, 2, (int[]) null));
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)I", line = 46)
    public static int method1462(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "()Lri;", line = 53)
    public final class68 method575() {
        field3223++;
        class285 var1 = (class285) this.field3230.method986(false);
        if (var1 == null) {
            return null;
        } else if (var1.field4383 == null) {
            return this.method570();
        } else {
            return var1.field4383;
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "()I", line = 73)
    public final int method573() {
        field3233++;
        return 0;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZIII[ILj;)V", line = 82)
    private final void method1463(boolean arg0, int arg1, int arg2, int arg3, int[] arg4, class285 arg5) {
        if ((this.field3229.field1673[arg5.field4392] & 0x4) != 0 && arg5.field4380 < 0) {
            int var7 = this.field3229.field1693[arg5.field4392] / class41.field607;
            while (true) {
                int var8 = (var7 + 1048575 - arg5.field4373) / var7;
                if (arg3 < var8) {
                    arg5.field4373 += arg3 * var7;
                    break;
                }
                arg3 -= var8;
                arg5.field4383.method576(arg4, arg2, var8);
                arg2 += var8;
                int var9 = class41.field607 / 100;
                arg5.field4373 += var7 * var8 - 1048576;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class82 var11 = arg5.field4383;
                if (this.field3229.field1679[arg5.field4392] == 0) {
                    arg5.field4383 = class82.method676(arg5.field4376, var11.method670(), var11.method661(), var11.method662());
                } else {
                    arg5.field4383 = class82.method676(arg5.field4376, var11.method670(), 0, var11.method662());
                    this.field3229.method867(arg5, (byte) 100, arg5.field4396.field3310[arg5.field4389] < 0);
                    arg5.field4383.method641(var9, var11.method661());
                }
                if (arg5.field4396.field3310[arg5.field4389] < 0) {
                    arg5.field4383.method639(-1);
                }
                var11.method644(var9);
                var11.method576(arg4, arg2, arg1 - arg2);
                if (var11.method646()) {
                    this.field3235.method2156(var11);
                }
            }
        }
        if (arg0) {
            method1465(true);
        }
        field3234++;
        arg5.field4383.method576(arg4, arg2, arg3);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "()Lri;", line = 143)
    public final class68 method570() {
        field3221++;
        class285 var1;
        do {
            var1 = (class285) this.field3230.method982(14877);
            if (var1 == null) {
                return null;
            }
        } while (var1.field4383 == null);
        return var1.field4383;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Llb;B)V", line = 163)
    public static final void method1464(class211 arg0, byte arg1) {
        if (arg1 > 74) {
            class273.field4141 = arg0;
            field3232++;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V", line = 179)
    public static final void method1465(boolean arg0) {
        field3228++;
        class118.field1861 = 0;
        int var1 = (class235.field3602.field4496 >> 7) + class110.field1744;
        int var2 = (class235.field3602.field4507 >> 7) + class302.field4735;
        if (var2 >= 3053 && var2 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            class118.field1861 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            class118.field1861 = 1;
        }
        if (class118.field1861 == 1 && var2 >= 3139 && var2 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            class118.field1861 = 0;
        }
        if (!arg0) {
            method1467(119, (class123) null, 20, -76, (float[][]) ((float[][]) null), -109, -65, (int[][]) ((int[][]) null), (float[][]) ((float[][]) null), 35, 67, (int[][]) ((int[][]) null), -93, 0.73177356F, false, 122, (float[][]) ((float[][]) null), -43);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILj;I)V", line = 217)
    private final void method1466(int arg0, class285 arg1, int arg2) {
        if ((this.field3229.field1673[arg1.field4392] & 0x4) != arg0 && arg1.field4380 < 0) {
            int var4 = this.field3229.field1693[arg1.field4392] / class41.field607;
            int var5 = (var4 + 1048575 - arg1.field4373) / var4;
            arg1.field4373 = arg1.field4373 + (arg2 * var4) & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field3229.field1679[arg1.field4392] == 0) {
                    arg1.field4383 = class82.method676(arg1.field4376, arg1.field4383.method670(), arg1.field4383.method661(), arg1.field4383.method662());
                } else {
                    arg1.field4383 = class82.method676(arg1.field4376, arg1.field4383.method670(), 0, arg1.field4383.method662());
                    this.field3229.method867(arg1, (byte) 100, arg1.field4396.field3310[arg1.field4389] < 0);
                }
                if (arg1.field4396.field3310[arg1.field4389] < 0) {
                    arg1.field4383.method639(-1);
                }
                arg2 = arg1.field4373 / var4;
            }
        }
        field3225++;
        arg1.field4383.method571(arg2);
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "([III)V", line = 263)
    public final void method576(int[] arg0, int arg1, int arg2) {
        field3226++;
        this.field3235.method576(arg0, arg1, arg2);
        for (class285 var4 = (class285) this.field3230.method986(false); var4 != null; var4 = (class285) this.field3230.method982(14877)) {
            if (!this.field3229.method864(7, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field4388) {
                        this.method1463(false, var5 + var6, var5, var6, arg0, var4);
                        var4.field4388 -= var6;
                        break;
                    }
                    this.method1463(false, var5 + var6, var5, var4.field4388, arg0, var4);
                    var6 -= var4.field4388;
                    var5 += var4.field4388;
                } while (!this.field3229.method843(var4, var6, var5, 2, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lsa;)V", line = 416)
    public class203(class109 arg0) {
        this.field3229 = arg0;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILjn;II[[FII[[I[[FII[[IIFZI[[FI)I", line = 304)
    public static final int method1467(int arg0, class123 arg1, int arg2, int arg3, float[][] arg4, int arg5, int arg6, int[][] arg7, float[][] arg8, int arg9, int arg10, int[][] arg11, int arg12, float arg13, boolean arg14, int arg15, float[][] arg16, int arg17) {
        if (arg6 == 1) {
            int var18 = arg0;
            arg0 = arg5;
            arg5 = 128 - var18;
        } else if (arg6 == 2) {
            arg5 = 128 - arg5;
            arg0 = 128 - arg0;
        } else if (arg6 == 3) {
            int var19 = arg0;
            arg0 = 128 - arg5;
            arg5 = var19;
        }
        field3236++;
        int var20 = -110 / ((-arg2 - 20) / 38);
        float var21;
        int var22;
        float var23;
        float var24;
        if (arg0 == 0 && arg5 == 0) {
            var21 = arg4[arg9][arg15];
            var22 = arg10;
            var23 = arg8[arg9][arg15];
            var24 = arg16[arg9][arg15];
        } else if (arg0 == 128 && arg5 == 0) {
            var23 = arg8[arg9 + 1][arg15];
            var24 = arg16[arg9 + 1][arg15];
            var22 = arg12;
            var21 = arg4[arg9 + 1][arg15];
        } else if (arg0 == 128 && arg5 == 128) {
            var23 = arg8[arg9 + 1][arg15 + 1];
            var22 = arg3;
            var24 = arg16[arg9 + 1][arg15 + 1];
            var21 = arg4[arg9 + 1][arg15 + 1];
        } else if (arg0 == 0 && arg5 == 128) {
            var22 = arg17;
            var23 = arg8[arg9][arg15 + 1];
            var24 = arg16[arg9][arg15 + 1];
            var21 = arg4[arg9][arg15 + 1];
        } else {
            float var25 = arg16[arg9][arg15];
            float var26 = arg4[arg9][arg15];
            float var27 = (float) arg0 / 128.0F;
            float var28 = arg8[arg9][arg15];
            float var29 = (arg16[arg9 + 1][arg15] - var25) * var27 + var25;
            float var30 = (float) arg5 / 128.0F;
            float var31 = (arg4[arg9 + 1][arg15] - var26) * var27 + var26;
            float var32 = (arg8[arg9 + 1][arg15] - var28) * var27 + var28;
            float var33 = arg4[arg9][arg15 + 1];
            float var34 = (arg4[arg9 + 1][arg15 + 1] - var33) * var27 + var33;
            float var35 = arg8[arg9][arg15 + 1];
            float var36 = (arg8[arg9 + 1][arg15 + 1] - var35) * var27 + var35;
            var21 = (var34 - var31) * var30 + var31;
            var23 = (var36 - var32) * var30 + var32;
            float var37 = arg16[arg9][arg15 + 1];
            float var38 = (arg16[arg9 + 1][arg15 + 1] - var37) * var27 + var37;
            var24 = (var38 - var29) * var30 + var29;
            int var39 = class285.method2000(arg12, arg10, 128, arg0);
            int var40 = class285.method2000(arg3, arg17, 128, arg0);
            var22 = class285.method2000(var40, var39, 128, arg5);
        }
        int var41 = (arg9 << 7) + arg0;
        int var42 = (arg15 << 7) + arg5;
        int var43 = class49.method452(arg5, arg15, arg9, arg7, arg0, -11908);
        return arg1.method938(var41, var43, var42, var21, var24, var23, arg14 ? var22 & 0xFFFFFF00 : var22, arg11 == null ? 0.0F : (float) (var43 - class49.method452(arg5, arg15, arg9, arg11, arg0, -11908)) / arg13);
    }
}
