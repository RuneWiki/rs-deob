import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class10 implements class177 {

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "Lpm;")
    private class111 field112 = new class111(256);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Lkb;")
    private class39 field101;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "Lkb;")
    private class39 field102;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "[Lqc;")
    private class4[] field106;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "[[Z")
    public static boolean[][] field103 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "Lok;")
    public static class160 field109 = null;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "F")
    public static float field110;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "Ljava/lang/String;")
    public static String field113;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIII)Z", line = 4)
    public static final boolean method56(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class251.field4001 * arg3 + field108 * arg0 >> 16;
        int var6 = field108 * arg3 - class251.field4001 * arg0 >> 16;
        int var7 = class312.field4861 * arg1 + class148.field2213 * var6 >> 16;
        int var8 = class148.field2213 * arg1 - class312.field4861 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class312.field4861 * arg2 + class148.field2213 * var6 >> 16;
        int var12 = class148.field2213 * arg2 - class312.field4861 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class338.field5244 && var13 < class338.field5244) {
            return false;
        } else if (var9 > class131.field1931 && var13 > class131.field1931) {
            return false;
        } else if (var10 < class204.field3334 && var14 < class204.field3334) {
            return false;
        } else {
            return var10 <= class287.field4527 || var14 <= class287.field4527;
        }
    }

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "(II)Lef;", line = 53)
    public class339 method57(int arg0, int arg1) {
        class29 var3 = this.field112.method768((long) arg0, false);
        field111++;
        if (var3 != null) {
            return (class339) var3;
        }
        byte[] var4 = this.field102.method274((byte) -106, arg0);
        if (var4 == null) {
            return null;
        } else {
            class339 var5 = new class339(new class192(var4));
            this.field112.method770(var5, arg1, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V", line = 78)
    public static final void method58(byte arg0) {
        field114++;
        if (!class313.field4874) {
            return;
        }
        class160 var1 = class241.method1709(class288.field4531, 65, class131.field1933);
        if (var1 != null && var1.field2513 != null) {
            class247 var2 = new class247();
            var2.field3931 = var1;
            var2.field3925 = var1.field2513;
            class69.method455(var2, (byte) -64);
        }
        class313.field4874 = false;
        class239.field3778 = -1;
        class219.method1600(var1, 123);
        if (arg0 < 37) {
            method58((byte) -114);
        }
    }

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "(II)Z", line = 106)
    public final boolean method59(int arg0, int arg1) {
        field107++;
        class339 var3 = this.method57(arg1, arg0 + arg0);
        return var3 != null && var3.method2341(this.field101, this, (byte) 125);
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(IB)Lqc;", line = 124)
    public final class4 method60(int arg0, byte arg1) {
        field105++;
        int var3 = -52 / ((27 - arg1) / 35);
        return this.field106[arg0];
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZBFII)[I", line = 138)
    public final int[] method61(int arg0, boolean arg1, byte arg2, float arg3, int arg4, int arg5) {
        field104++;
        return arg2 == 38 ? this.method57(arg5, 0).method2334(this, (byte) 32, arg1, this.field106[arg5].field44, (double) arg3, arg4, arg0, this.field101) : (int[]) null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V", line = 152)
    public static void method62(boolean arg0) {
        field103 = (boolean[][]) null;
        field113 = null;
        field109 = null;
        if (!arg0) {
            field110 = 0.33088735F;
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lkb;Lkb;Lkb;)V", line = 176)
    public class10(class39 arg0, class39 arg1, class39 arg2) {
        this.field101 = arg2;
        this.field102 = arg1;
        class192 var4 = new class192(arg0.method250(true, 0, 0));
        int var5 = var4.method1396(-103);
        this.field106 = new class4[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1399(-1172389784) == 1) {
                this.field106[var6] = new class4();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field106[var7] != null) {
                this.field106[var7].field41 = var4.method1399(-1172389784) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field106[var8] != null) {
                this.field106[var8].field45 = var4.method1399(-1172389784) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field106[var9] != null) {
                this.field106[var9].field30 = var4.method1399(-1172389784) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field106[var10] != null) {
                this.field106[var10].field34 = var4.method1399(-1172389784) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field106[var11] != null) {
                this.field106[var11].field40 = var4.method1377(true);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field106[var12] != null) {
                this.field106[var12].field33 = var4.method1377(true);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field106[var13] != null) {
                this.field106[var13].field27 = var4.method1377(true);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field106[var14] != null) {
                this.field106[var14].field29 = var4.method1377(true);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field106[var15] != null) {
                this.field106[var15].field28 = (short) var4.method1396(-78);
            }
        }
        if (var4.field3129 < var4.field3128.length) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field106[var16] != null) {
                    var4.method1377(true);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field106[var17] != null) {
                    var4.method1377(true);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field106[var18] != null) {
                    var4.method1399(-1172389784);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field106[var19] != null) {
                    this.field106[var19].field44 = var4.method1399(-1172389784) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field106[var20] != null) {
                    var4.method1377(true);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field106[var21] != null) {
                    var4.method1399(-1172389784);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field106[var22] != null) {
                    var4.method1399(-1172389784);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field106[var23] != null) {
                    var4.method1399(-1172389784);
                }
            }
        }
    }
}
