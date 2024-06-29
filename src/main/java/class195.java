import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class195 {

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "Lof;")
    private class232 field3251 = new class232();

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "Lmg;")
    private class151 field3259 = new class151();

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "I")
    private int field3258;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "I")
    private int field3256;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "Lld;")
    private class118 field3255;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "Z")
    public static boolean field3252 = true;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "Lok;")
    public static class146 field3249 = class235.method1724(-12908, "Interfaces charg-Bes");

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "Z")
    public static boolean field3246 = false;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "[Lje;")
    public static class70[] field3250;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)Lkj;", line = 11)
    public final class171 method1501(int arg0) {
        if (arg0 <= 48) {
            return (class171) null;
        } else {
            field3257++;
            return this.field3255.method807(-58);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V", line = 24)
    public static void method1502(boolean arg0) {
        if (!arg0) {
            field3249 = null;
            field3250 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IBIIIIIIIII)V", line = 40)
    public static final void method1503(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg5 - arg7;
        int var12 = arg8 - arg9;
        if (arg1 != 76) {
            return;
        }
        field3253++;
        boolean var13;
        if (class198.field3306 > 0 && (class198.field3306 % 10) < 5) {
            var13 = true;
        } else {
            var13 = false;
        }
        int var14 = 983040 / arg2;
        int var15 = 983040 / arg4;
        for (int var16 = -var15; var16 < (var11 + var15); var16++) {
            int var17 = (var16 + 1) * arg4 + arg0 >> 16;
            int var18 = arg4 * var16 + arg0 >> 16;
            int var19 = var17 - var18;
            if (var19 > 0) {
                int var10000 = arg10 + var17;
                int var21 = arg10 + var18;
                int var22 = arg7 + var16 >> 6;
                if (var22 >= 0 && (class318.field5401.length - 1) >= var22) {
                    int[][] var23 = class318.field5401[var22];
                    for (int var24 = -var14; var24 < (var12 + var14); var24++) {
                        int var25 = arg6 + (arg2 * var24) >> 16;
                        int var26 = arg6 + ((var24 + 1) * arg2) >> 16;
                        int var27 = var26 - var25;
                        if (var27 > 0) {
                            var10000 = arg3 + var26;
                            int var29 = arg3 + var25;
                            int var30 = arg9 + var24 >> 6;
                            if (var30 >= 0 && var23.length - 1 >= var30 && var23[var30] != null) {
                                int var31 = ((var24 + arg9 & 0x3F) << 6) + (var16 + arg7 & 0x3F);
                                int var32 = var23[var30][var31];
                                if (var32 != 0) {
                                    class5 var33 = class112.method756((byte) -113, var32 - 1);
                                    if (!class276.field4745[var33.field100]) {
                                        if (var13 && class309.field5259 == var33.field100) {
                                            class2 var34 = new class2();
                                            var34.field11 = var21;
                                            var34.field8 = var29;
                                            var34.field9 = var33.field100;
                                            class91.field1434.method1258(0, var34);
                                        } else {
                                            class230.field3843[var33.field100].method47(var21 - 7, var29 - 7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class2 var35 = (class2) class91.field1434.method1251(arg1 ^ 0x70); var35 != null; var35 = (class2) class91.field1434.method1253(113)) {
            class230.field3843[var35.field9].method47(var35.field11 - 7, var35.field8 + -7);
            class181.method1417(var35.field11, var35.field8, 15, 16776960, 128);
            class181.method1417(var35.field11, var35.field8, 7, 16777215, 256);
        }
        class91.field1434.method1257(arg1 ^ 0x4E);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V", line = 170)
    public static final void method1504(byte arg0) {
        class262.field4348 = class128.method902(35, false, 4, true, 2048, 8, 0.4F, 8);
        if (arg0 != -93) {
            method1506(-67, -66);
        }
        field3245++;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "()V", line = 180)
    public static final void method1505() {
        if (class58.field1018 != null) {
            for (int var0 = 0; var0 < class58.field1018.length; var0++) {
                for (int var1 = 0; var1 < class189.field3124; var1++) {
                    for (int var2 = 0; var2 < class192.field3168; var2++) {
                        class58.field1018[var0][var1][var2] = null;
                    }
                }
            }
        }
        class278.field4781 = (class286[][]) null;
        if (class89.field1426 != null) {
            for (int var3 = 0; var3 < class89.field1426.length; var3++) {
                for (int var4 = 0; var4 < class189.field3124; var4++) {
                    for (int var5 = 0; var5 < class192.field3168; var5++) {
                        class89.field1426[var3][var4][var5] = null;
                    }
                }
            }
        }
        class261.field4338 = (class286[][]) null;
        class117.field1889 = 0;
        if (class210.field3471 != null) {
            for (int var6 = 0; var6 < class117.field1889; var6++) {
                class210.field3471[var6] = null;
            }
        }
        if (class206.field3433 != null) {
            for (int var7 = 0; var7 < class120.field1953; var7++) {
                class206.field3433[var7] = null;
            }
            class120.field1953 = 0;
        }
        if (class60.field1022 != null) {
            for (int var8 = 0; var8 < class60.field1022.length; var8++) {
                class60.field1022[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V", line = 284)
    public static final void method1506(int arg0, int arg1) {
        field3247++;
        if (arg0 == -1 || !class279.field4786[arg0]) {
            return;
        }
        class160.field2711.method107(3, arg0);
        if (class92.field1459[arg0] == null) {
            return;
        }
        int var2 = -111 / ((72 - arg1) / 39);
        boolean var3 = true;
        for (int var4 = 0; var4 < class92.field1459[arg0].length; var4++) {
            if (class92.field1459[arg0][var4] != null) {
                if (class92.field1459[arg0][var4].field4536 == 2) {
                    var3 = false;
                } else {
                    class92.field1459[arg0][var4] = null;
                }
            }
        }
        if (var3) {
            class92.field1459[arg0] = null;
        }
        class279.field4786[arg0] = false;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(Z)Lkj;", line = 333)
    public final class171 method1507(boolean arg0) {
        field3260++;
        if (!arg0) {
            field3252 = true;
        }
        return this.field3255.method806(88);
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V", line = 344)
    public static final void method1508(int arg0) {
        class121.field1988 = arg0;
        for (int var1 = 0; var1 < class189.field3124; var1++) {
            for (int var2 = 0; var2 < class192.field3168; var2++) {
                if (class203.field3382[arg0][var1][var2] == null) {
                    class203.field3382[arg0][var1][var2] = new class11(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(I)V", line = 476)
    public class195(int arg0) {
        this.field3258 = arg0;
        this.field3256 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field3255 = new class118(var2);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(JILof;)V", line = 393)
    public final void method1509(long arg0, int arg1, class232 arg2) {
        if (this.field3256 == 0) {
            class232 var5 = this.field3259.method1194(false);
            var5.method1325(-2935);
            var5.method1703((byte) 84);
            if (this.field3251 == var5) {
                class232 var6 = this.field3259.method1194(false);
                var6.method1325(-2935);
                var6.method1703((byte) 102);
            }
        } else {
            this.field3256--;
        }
        if (arg1 > 37) {
            field3254++;
            this.field3255.method805(arg2, arg0, 121);
            this.field3259.method1195((byte) -93, arg2);
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)V", line = 428)
    public final void method1510(byte arg0) {
        field3244++;
        this.field3259.method1196((byte) 82);
        this.field3255.method801(0);
        if (arg0 < -119) {
            this.field3251 = new class232();
            this.field3256 = this.field3258;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(JI)Lof;", line = 450)
    public final class232 method1511(long arg0, int arg1) {
        field3248++;
        class232 var4 = (class232) this.field3255.method810((byte) -120, arg0);
        if (arg1 <= 73) {
            return (class232) null;
        } else {
            if (var4 != null) {
                this.field3259.method1195((byte) -93, var4);
            }
            return var4;
        }
    }
}
