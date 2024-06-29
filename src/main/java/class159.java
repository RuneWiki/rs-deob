import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class159 extends class279 {

    @OriginalMember(owner = "client!om", name = "K", descriptor = "Z")
    private boolean field2596 = true;

    @OriginalMember(owner = "client!om", name = "T", descriptor = "Z")
    private boolean field2605 = true;

    @OriginalMember(owner = "client!om", name = "J", descriptor = "Ltl;")
    public static class59 field2595 = class85.method639(")1 ", 9588);

    @OriginalMember(owner = "client!om", name = "R", descriptor = "Ltl;")
    public static class59 field2603 = class85.method639(" )2> ", 9588);

    @OriginalMember(owner = "client!om", name = "S", descriptor = "[[[Lkl;")
    public static class64[][][] field2604 = new class64[4][104][104];

    @OriginalMember(owner = "client!om", name = "G", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!om", name = "I", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!om", name = "M", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!om", name = "N", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!om", name = "O", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!om", name = "P", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!om", name = "Q", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!om", name = "L", descriptor = "[Loj;")
    public static class260[] field2597;

    @OriginalMember(owner = "client!om", name = "H", descriptor = "[Llj;")
    public static class5[] field2593;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(Z)V", line = 4)
    public static final void method1137(boolean arg0) {
        class251.field4187 = null;
        client.field623 = null;
        class291.field4976 = null;
        class235.field3908 = null;
        class154.field2509 = null;
        class249.field4143 = null;
        if (arg0) {
            return;
        }
        class4.field44 = null;
        field2593 = null;
        class236.field3915 = null;
        class130.field2160 = null;
        class26.field353 = null;
        class12.field163 = null;
        field2597 = null;
        class178.field2923 = null;
        class93.field1448 = null;
        class283.field4878 = null;
        class263.field4400 = null;
        class65.field995 = null;
        class11.field152 = null;
        class43.field643 = null;
        class177.field2903 = null;
        class70.field1083 = null;
        field2592++;
        class69.field1062 = null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IILs;)V", line = 42)
    public final void method51(int arg0, int arg1, class170 arg2) {
        if (arg0 > -125) {
            return;
        }
        if (arg1 == 0) {
            this.field2596 = arg2.method1221(109) == 1;
        } else if (arg1 == 1) {
            this.field2605 = arg2.method1221(100) == 1;
        } else if (arg1 == 2) {
            this.field4789 = arg2.method1221(109) == 1;
        }
        field2598++;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZI)[I", line = 92)
    public final int[] method44(boolean arg0, int arg1) {
        int[] var3 = this.field4781.method165(arg1, (byte) -11);
        if (arg0) {
            field2597 = (class260[]) null;
        }
        if (this.field4781.field354) {
            int[] var4 = this.method1960(-127, this.field2605 ? class132.field2197 - arg1 : arg1, 0);
            if (this.field2596) {
                for (int var5 = 0; var5 < class56.field835; var5++) {
                    var3[var5] = var4[class310.field5270 - var5];
                }
            } else {
                class63.method518(var4, 0, var3, 0, class56.field835);
            }
        }
        field2599++;
        return var3;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IBIIIIII)V", line = 134)
    public static final void method1138(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2600++;
        if (class253.method1764(arg5, 0) && arg1 <= -87) {
            client.method273(class239.field3986[arg5], -1, arg4, arg3, arg0, arg6, arg7, arg2);
        }
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(B)V", line = 149)
    public static void method1139(byte arg0) {
        field2597 = null;
        field2604 = (class64[][][]) null;
        field2603 = null;
        field2595 = null;
        if (arg0 > -123) {
            method1140(-8, (class263) null, -96, 44);
        }
        field2593 = null;
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(II)[[I", line = 167)
    public final int[][] method87(int arg0, int arg1) {
        field2601++;
        if (arg0 != -7523) {
            method1137(false);
        }
        int[][] var3 = this.field4786.method1427(0, arg1);
        if (this.field4786.field3297) {
            int[][] var4 = this.method1956(0, this.field2605 ? class132.field2197 - arg1 : arg1, (byte) -112);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field2596) {
                for (int var12 = 0; var12 < class56.field835; var12++) {
                    var7[var12] = var5[class310.field5270 - var12];
                    var9[var12] = var6[class310.field5270 - var12];
                    var10[var12] = var8[class310.field5270 - var12];
                }
            } else {
                for (int var11 = 0; var11 < class56.field835; var11++) {
                    var7[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var8[var11];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V", line = 239)
    public class159() {
        super(1, false);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILma;II)V", line = 249)
    public static final void method1140(int arg0, class263 arg1, int arg2, int arg3) {
        field2602++;
        if (class143.field2362 != 0 && class143.field2362 != 3 || !arg1.method1823(-8302)) {
            return;
        }
        int var4 = arg1.field4418[arg2];
        if (arg0 < var4 || arg0 > (arg1.field4447[arg2] + var4)) {
            return;
        }
        int var5 = arg2 - arg1.field4467 / 2;
        int var6 = arg0 - arg1.field4420 / 2;
        int var7 = 94 % ((arg3 - 1) / 55);
        int var8 = class213.field3489 + class64.field983 & 0x7FF;
        int var9 = class298.field5095[var8];
        int var10 = class298.field5094[var8];
        int var11 = (class45.field731 + 256) * var10 >> 8;
        int var12 = (class45.field731 + 256) * var9 >> 8;
        int var13 = var5 * var12 + var6 * var11 >> 11;
        int var14 = class286.field4920.field1774 + var13 >> 7;
        int var15 = var5 * var11 - var6 * var12 >> 11;
        int var16 = class286.field4920.field1769 - var15 >> 7;
        if (class280.field4793 > 0 && class317.field5350[82] && class317.field5350[81]) {
            class19.method129(class247.field4119, class187.field3135 + var16, class197.field3249 - -var14, 31886);
            return;
        }
        boolean var17 = class28.method178(var16, 1, 0, (byte) -6, class286.field4920.field1729[0], 0, class286.field4920.field1773[0], 0, var14, 0, 0, true);
        if (!var17) {
            return;
        }
        class234.field3888.method1219(var6, true);
        class234.field3888.method1219(var5, true);
        class234.field3888.method1237(true, class213.field3489);
        class234.field3888.method1219(57, true);
        class234.field3888.method1219(class64.field983, true);
        class234.field3888.method1219(class45.field731, true);
        class234.field3888.method1219(89, true);
        class234.field3888.method1237(true, class286.field4920.field1774);
        class234.field3888.method1237(true, class286.field4920.field1769);
        class234.field3888.method1219(class121.field2019, true);
        class234.field3888.method1219(63, true);
    }
}
