import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class290 extends class183 {

    @OriginalMember(owner = "client!oa", name = "ib", descriptor = "I")
    private int field4963 = 0;

    @OriginalMember(owner = "client!oa", name = "pb", descriptor = "I")
    private int field4970 = 0;

    @OriginalMember(owner = "client!oa", name = "sb", descriptor = "I")
    private int field4973 = 0;

    @OriginalMember(owner = "client!oa", name = "W", descriptor = "Ljf;")
    public static class229 field4951 = class212.method1457((byte) 124, "floorshadows");

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "Ljf;")
    public static class229 field4948 = class212.method1457((byte) 114, "Connect-B au serveur de mise -9 jour");

    @OriginalMember(owner = "client!oa", name = "gb", descriptor = "Z")
    public static boolean field4961 = false;

    @OriginalMember(owner = "client!oa", name = "db", descriptor = "Ljf;")
    private static class229 field4958 = class212.method1457((byte) 98, "Connecting to update server");

    @OriginalMember(owner = "client!oa", name = "kb", descriptor = "Ljf;")
    public static class229 field4965 = field4958;

    @OriginalMember(owner = "client!oa", name = "nb", descriptor = "Ljf;")
    private static class229 field4968 = class212.method1457((byte) 102, "slide:");

    @OriginalMember(owner = "client!oa", name = "bb", descriptor = "Ljf;")
    public static class229 field4956 = field4968;

    @OriginalMember(owner = "client!oa", name = "tb", descriptor = "Ljf;")
    public static class229 field4974 = field4968;

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "I")
    private int field4949;

    @OriginalMember(owner = "client!oa", name = "V", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!oa", name = "ab", descriptor = "I")
    private int field4955;

    @OriginalMember(owner = "client!oa", name = "cb", descriptor = "I")
    private int field4957;

    @OriginalMember(owner = "client!oa", name = "eb", descriptor = "I")
    private int field4959;

    @OriginalMember(owner = "client!oa", name = "fb", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!oa", name = "hb", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!oa", name = "jb", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!oa", name = "lb", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!oa", name = "mb", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!oa", name = "ob", descriptor = "I")
    private int field4969;

    @OriginalMember(owner = "client!oa", name = "rb", descriptor = "I")
    private int field4972;

    @OriginalMember(owner = "client!oa", name = "qb", descriptor = "Ljava/lang/Thread;")
    public static Thread field4971;

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "[I")
    public static int[] field4954;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V", line = 5)
    private final void method2017(int arg0, int arg1, int arg2, int arg3) {
        field4952++;
        if (arg3 != 13223) {
            return;
        }
        int var5 = arg0 > 2048 ? arg0 + arg2 - (arg0 * arg2 >> 12) : (4096 - -arg2) * arg0 >> 12;
        if (var5 <= 0) {
            this.field4957 = this.field4959 = this.field4955 = arg0;
            return;
        }
        int var6 = arg1 * 6;
        int var7 = arg0 + arg0 - var5;
        int var8 = (var5 - var7 << 12) / var5;
        int var9 = var6 >> 12;
        int var11 = var6 - (var9 << 12);
        int var12 = var8 * var5 >> 12;
        int var13 = var11 * var12 >> 12;
        int var14 = var5 - var13;
        int var15 = var7 + var13;
        if (var9 == 0) {
            this.field4955 = var7;
            this.field4959 = var15;
            this.field4957 = var5;
        } else if (var9 == 1) {
            this.field4959 = var5;
            this.field4955 = var7;
            this.field4957 = var14;
        } else if (var9 == 2) {
            this.field4959 = var5;
            this.field4957 = var7;
            this.field4955 = var15;
        } else if (var9 == 3) {
            this.field4955 = var5;
            this.field4957 = var7;
            this.field4959 = var14;
        } else if (var9 == 4) {
            this.field4959 = var7;
            this.field4955 = var5;
            this.field4957 = var15;
        } else if (var9 == 5) {
            this.field4957 = var5;
            this.field4959 = var7;
            this.field4955 = var14;
        }
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V", line = 113)
    public class290() {
        super(1, false);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)[[I", line = 124)
    public final int[][] method12(int arg0, int arg1) {
        field4967++;
        int var3 = -104 / ((arg0 - 18) / 61);
        int[][] var4 = this.field3160.method1057(-20449, arg1);
        if (this.field3160.field2689) {
            int[][] var5 = this.method1250(arg1, 0, (byte) 95);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            int[] var10 = var4[0];
            int[] var11 = var5[2];
            for (int var12 = 0; var12 < class22.field393; var12++) {
                this.method2023(var11[var12], 12288, var7[var12], var6[var12]);
                this.field4972 += this.field4963;
                this.field4949 += this.field4973;
                this.field4969 += this.field4970;
                if (this.field4949 < 0) {
                    this.field4949 = 0;
                }
                if (this.field4949 > 4096) {
                    this.field4949 = 4096;
                }
                while (this.field4972 < 0) {
                    this.field4972 += 4096;
                }
                while (this.field4972 > 4096) {
                    this.field4972 -= 4096;
                }
                if (this.field4969 < 0) {
                    this.field4969 = 0;
                }
                if (this.field4969 > 4096) {
                    this.field4969 = 4096;
                }
                this.method2017(this.field4969, this.field4972, this.field4949, 13223);
                var10[var12] = this.field4957;
                var8[var12] = this.field4959;
                var9[var12] = this.field4955;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIII)Z", line = 195)
    public static final boolean method2018(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILkh;I)V", line = 226)
    public final void method14(int arg0, class14 arg1, int arg2) {
        if (arg0 >= -43) {
            this.field4970 = -119;
        }
        if (arg2 == 0) {
            this.field4963 = arg1.method113((byte) -109);
        } else if (arg2 == 1) {
            this.field4973 = (arg1.method98(true) << 12) / 100;
        } else if (arg2 == 2) {
            this.field4970 = (arg1.method98(true) << 12) / 100;
        }
        field4964++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)Z", line = 276)
    public static final boolean method2019(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class41.field743[arg0][var8][var9] == -class31.field535) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class132.field2328[arg0][arg1][arg3] + arg5;
            if (!class47.method404(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class47.method404(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class47.method404(var10, var12, var14)) {
                return false;
            } else if (class47.method404(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class268.method1889(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class47.method404(var6 + 1, class132.field2328[arg0][arg1][arg3] + arg5, var7 + 1) && class47.method404(var6 + 128 - 1, class132.field2328[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class47.method404(var6 + 128 - 1, class132.field2328[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class47.method404(var6 + 1, class132.field2328[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(B)V", line = 343)
    public static void method2020(byte arg0) {
        field4954 = null;
        field4958 = null;
        if (arg0 >= -43) {
            return;
        }
        field4948 = null;
        field4965 = null;
        field4974 = null;
        field4971 = null;
        field4956 = null;
        field4968 = null;
        field4951 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIILnf;)V", line = 366)
    public static final void method2021(int arg0, int arg1, int arg2, class67 arg3) {
        if (arg0 != -26921) {
            field4951 = (class229) null;
        }
        field4962++;
        if (class317.field5356 != null || class61.field1044 || arg3 == null || class281.method1971((byte) 120, arg3) == null) {
            return;
        }
        class317.field5356 = arg3;
        class206.field3594 = class281.method1971((byte) 27, arg3);
        class303.field5150 = arg2;
        class179.field3107 = 0;
        class4.field34 = arg1;
        class66.field1129 = false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lnf;I)V", line = 413)
    public static final void method2022(class67 arg0, int arg1) {
        field4950++;
        int var2 = arg0.field1296;
        if (var2 == 324) {
            if (class288.field4920 == -1) {
                class288.field4920 = arg0.field1274;
                class132.field2324 = arg0.field1265;
            }
            if (class122.field2157.field3668) {
                arg0.field1274 = class288.field4920;
            } else {
                arg0.field1274 = class132.field2324;
            }
        } else if (var2 == 325) {
            if (class288.field4920 == -1) {
                class288.field4920 = arg0.field1274;
                class132.field2324 = arg0.field1265;
            }
            if (class122.field2157.field3668) {
                arg0.field1274 = class132.field2324;
            } else {
                arg0.field1274 = class288.field4920;
            }
        } else if (var2 == 327) {
            arg0.field1231 = 150;
            arg0.field1209 = (int) (Math.sin((double) class199.field3475 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field1134 = 5;
            arg0.field1288 = -1;
        } else {
            if (arg1 > -101) {
                field4974 = (class229) null;
            }
            if (var2 == 328) {
                if (class301.field5124.field621 == null) {
                    arg0.field1288 = 0;
                } else {
                    arg0.field1231 = 150;
                    arg0.field1209 = (int) (Math.sin((double) class199.field3475 / 40.0D) * 256.0D) & 0x7FF;
                    arg0.field1134 = 5;
                    arg0.field1288 = ((int) class301.field5124.field621.method1617(93) << 11) + 2047;
                    arg0.field1276 = class301.field5124.field2025;
                    arg0.field1252 = class301.field5124.field1971;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIII)V", line = 497)
    private final void method2023(int arg0, int arg1, int arg2, int arg3) {
        field4960++;
        int var5 = arg3 >= arg2 ? arg2 : arg3;
        int var6 = arg3 > arg2 ? arg3 : arg2;
        int var7 = arg0 >= var5 ? var5 : arg0;
        int var8 = arg0 <= var6 ? var6 : arg0;
        this.field4969 = (var7 + var8) / 2;
        int var9 = var8 - var7;
        if (this.field4969 > 0 && this.field4969 < 4096) {
            this.field4949 = (var9 << 12) / (this.field4969 <= 2048 ? this.field4969 * 2 : 8192 - (this.field4969 * 2));
        } else {
            this.field4949 = 0;
        }
        if (arg1 != 12288) {
            return;
        }
        if (var9 <= 0) {
            this.field4972 = 0;
            return;
        }
        int var10 = (var8 - arg3 << 12) / var9;
        int var11 = (var8 - arg2 << 12) / var9;
        int var12 = (var8 - arg0 << 12) / var9;
        if (arg3 == var8) {
            this.field4972 = arg2 == var7 ? var12 + 20480 : 4096 - var11;
        } else if (arg2 == var8) {
            this.field4972 = arg0 == var7 ? var10 + 4096 : -var12 + 12288;
        } else {
            this.field4972 = arg3 == var7 ? var11 + 12288 : -var10 + 20480;
        }
        this.field4972 /= 6;
    }
}
