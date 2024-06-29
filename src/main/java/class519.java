import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class519 {

    @OriginalMember(owner = "client!iaa", name = "q", descriptor = "Z")
    private boolean field7333 = true;

    @OriginalMember(owner = "client!iaa", name = "c", descriptor = "I")
    private int field7319 = -1;

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "[Lija;")
    private class364[] field7317;

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "I")
    private int field7318;

    @OriginalMember(owner = "client!iaa", name = "m", descriptor = "I")
    private int field7329;

    @OriginalMember(owner = "client!iaa", name = "o", descriptor = "I")
    private int field7331;

    @OriginalMember(owner = "client!iaa", name = "d", descriptor = "I")
    private int field7320;

    @OriginalMember(owner = "client!iaa", name = "t", descriptor = "[Lija;")
    private class364[] field7336;

    @OriginalMember(owner = "client!iaa", name = "n", descriptor = "Lija;")
    private class364 field7330;

    @OriginalMember(owner = "client!iaa", name = "h", descriptor = "Lfba;")
    public static class27 field7324 = new class27(76, 4);

    @OriginalMember(owner = "client!iaa", name = "e", descriptor = "I")
    public static int field7321;

    @OriginalMember(owner = "client!iaa", name = "f", descriptor = "I")
    public static int field7322;

    @OriginalMember(owner = "client!iaa", name = "g", descriptor = "I")
    public static int field7323;

    @OriginalMember(owner = "client!iaa", name = "j", descriptor = "I")
    public static int field7326;

    @OriginalMember(owner = "client!iaa", name = "k", descriptor = "I")
    private int field7327;

    @OriginalMember(owner = "client!iaa", name = "p", descriptor = "I")
    public static int field7332;

    @OriginalMember(owner = "client!iaa", name = "r", descriptor = "I")
    private int field7334;

    @OriginalMember(owner = "client!iaa", name = "s", descriptor = "I")
    public static int field7335;

    @OriginalMember(owner = "client!iaa", name = "i", descriptor = "Ljd;")
    private class241 field7325;

    @OriginalMember(owner = "client!iaa", name = "l", descriptor = "Ltd;")
    public static class477 field7328;

    @OriginalMember(owner = "client!iaa", name = "u", descriptor = "Ljava/lang/Object;")
    public static Object field7337;

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IBILha;IIIIII)V")
    public final void method3122(int arg0, byte arg1, int arg2, class65 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field7332++;
        int var11 = arg8 + arg5 & 0x3FFF;
        if (this.field7320 == -1 || this.field7327 == 0) {
            arg3.method495(arg6, arg9, arg0, arg7, arg4, 0);
        } else {
            class467 var12 = class96.field1096.method1208((byte) 47, this.field7320);
            if (this.field7325 == null && class96.field1096.method1212(124, this.field7320)) {
                int[] var13 = var12.field6581 == 2 ? class96.field1096.method1207((byte) -49, false, this.field7320, this.field7327, this.field7327, 0.7F) : class96.field1096.method1211((byte) 22, this.field7327, this.field7327, false, this.field7320, 0.7F);
                this.field7325 = arg3.method458((byte) 112, this.field7327, this.field7327, var13, this.field7327, 0);
            }
            if (var12.field6581 == 2) {
                arg3.method495(arg6, arg9, arg0, arg7, arg4, 0);
            }
            if (this.field7325 != null) {
                int var14 = var12.field6581 == 2 ? 1 : 0;
                int var15 = arg2 * arg7 / -4096;
                int var16;
                for (var16 = arg7 * var11 / 4096 + (arg0 - arg7) / 2; var16 > arg7; var16 -= arg7) {
                }
                while (var15 > arg7) {
                    var15 -= arg7;
                }
                while (var16 < 0) {
                    var16 += arg7;
                }
                while (var15 < 0) {
                    var15 += arg7;
                }
                for (int var17 = var16 - arg7; var17 < arg0; var17 += arg7) {
                    for (int var18 = var15 - arg7; var18 < arg7; var18 += arg7) {
                        this.field7325.method1603(var17 + arg6, arg9 + var18, arg7, arg7, 1, 0, var14);
                    }
                }
            }
        }
        int var19 = this.field7334 - 1;
        int var20 = 67 % ((-arg1 - 63) / 42);
        while (var19 >= 0) {
            this.field7336[var19].method2287(arg3, arg6, arg9, arg0, arg7, arg2, var11);
            var19--;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(B)[Lwv;")
    public static final class37[] method3123(byte arg0) {
        if (arg0 != 127) {
            field7324 = null;
        }
        field7323++;
        return new class37[] { class253.field3723, class123.field1910, class40.field529, class606.field8482, class176.field2740, class415.field5679, class216.field3358, class647.field9056, class658.field9180, class212.field3291, class400.field5488, class451.field6189, class514.field7276, class289.field4239, class719.field9961 };
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IILha;)Z")
    public final boolean method3124(int arg0, int arg1, class65 arg2) {
        if (this.field7319 != arg1) {
            this.field7319 = arg1;
            int var4 = class189.method1324(arg1, (byte) 72);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field7327 != var4) {
                this.field7325 = null;
                this.field7327 = var4;
            }
            if (this.field7317 != null) {
                this.field7334 = 0;
                int[] var5 = new int[this.field7317.length];
                for (int var6 = 0; var6 < this.field7317.length; var6++) {
                    class364 var7 = this.field7317[var6];
                    if (var7.method2289(this.field7318, this.field7331, this.field7329, this.field7319)) {
                        var5[this.field7334] = var7.field5085;
                        this.field7336[this.field7334++] = var7;
                    }
                }
                class249.method1640(true, this.field7336, var5, this.field7334 - 1, 0);
            }
            this.field7333 = true;
        }
        field7326++;
        boolean var8 = false;
        if (this.field7333) {
            this.field7333 = false;
            for (int var9 = this.field7334 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field7336[var9].method2284(arg2, this.field7330);
                var8 |= var10;
                this.field7333 |= !var10;
            }
        }
        if (arg0 != -28184) {
            method3126(65);
        }
        return var8;
    }

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "(B)V")
    public final void method3125(byte arg0) {
        field7335++;
        if (this.field7317 != null) {
            for (int var2 = 0; var2 < this.field7317.length; var2++) {
                this.field7317[var2].method2283();
            }
        }
        this.field7325 = null;
        if (arg0 >= -53) {
            this.field7320 = 42;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)V")
    public static void method3126(int arg0) {
        field7324 = null;
        int var1 = 98 % ((arg0 - 3) / 63);
        field7337 = null;
        field7328 = null;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(BLrja;I)V")
    public static final void method3127(byte arg0, class114 arg1, int arg2) {
        int var3 = 35 % ((arg0 - 6) / 45);
        if (class58.field724) {
            arg2 = 0;
            class58.field724 = false;
        }
        field7322++;
        if (class772.field10604 != null && class772.field10604.method858(4, arg1)) {
            return;
        }
        class772.field10604 = arg1;
        class619.field8647 = class459.method2731(109);
        class640.field8968 = arg2;
        class776.field10669 = arg2;
        if (class776.field10669 != 0) {
            class630.field8830 = class720.field9970;
            class310.field4430 = class472.field6627;
            class569.field8031 = class445.field6062;
            class762.field10496 = class650.field9076;
            class419.field5732 = class277.field4036;
            class254.field3732 = class276.field3998;
            class157.field2523 = class585.field8271;
            class27.field404 = class603.field8445;
            class439.field5931 = class670.field9310;
            class718.field9952 = class439.field5915;
            return;
        }
        class790.method4322((byte) 81);
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(II)V")
    public static final void method3128(int arg0, int arg1) {
        field7321++;
        if (arg0 == -13077) {
            class313 var2 = class312.method1998((long) arg1, 1, -1);
            var2.method2006(arg0 ^ 0xFFFFCC86);
        }
    }

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(I[Lija;IIII)V")
    public class519(int arg0, class364[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7317 = arg1;
        this.field7318 = arg3;
        this.field7329 = arg5;
        this.field7331 = arg4;
        this.field7320 = arg0;
        if (arg1 == null) {
            this.field7336 = null;
            this.field7330 = null;
        } else {
            this.field7336 = new class364[arg1.length];
            this.field7330 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}
