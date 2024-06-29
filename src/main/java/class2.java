import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 {

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    private int field13 = -1;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    private int field20 = 0;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "Lea;")
    private class40 field23 = new class40();

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "Z")
    public boolean field28 = false;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "[[[I")
    private int[][][] field10;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    private int field11;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    private int field14;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "[Lqc;")
    private class147[] field9;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "Lwf;")
    public static class204 field21 = new class204(32);

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "Leh;")
    private static class47 field25 = class195.method1282((byte) -4, "Account locked as we suspect it has been stolen)3");

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "Leh;")
    public static class47 field26 = field25;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "[I")
    public static int[] field27;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lsh;BI)V")
    public static final void method5(class170 arg0, byte arg1, int arg2) {
        field19++;
        if (class18.field362 < arg0.field3283) {
            class159.method1087(-4, arg0);
        } else if (arg0.field3339 < class18.field362) {
            class105.method853(arg0, 11);
        } else {
            class52.method457(arg0, false);
        }
        if (arg0.field3291 < 128 || arg0.field3281 < 128 || arg0.field3291 >= 13184 || arg0.field3281 >= 13184) {
            arg0.field3330 = -1;
            arg0.field3281 = arg0.field3317[0] * 128 + arg0.field3276 * 64;
            arg0.field3339 = 0;
            arg0.field3279 = -1;
            arg0.field3291 = arg0.field3310[0] * 128 + arg0.field3276 * 64;
            arg0.field3283 = 0;
            arg0.method1163(113);
        }
        int var3 = 7 % ((arg1 + 43) / 39);
        if (class123.field2489 == arg0 && (arg0.field3291 < 1536 || arg0.field3281 < 1536 || arg0.field3291 >= 11776 || arg0.field3281 >= 11776)) {
            arg0.field3330 = -1;
            arg0.field3339 = 0;
            arg0.field3283 = 0;
            arg0.field3291 = arg0.field3310[0] * 128 + arg0.field3276 * 64;
            arg0.field3279 = -1;
            arg0.field3281 = arg0.field3317[0] * 128 + arg0.field3276 * 64;
            arg0.method1163(81);
        }
        class170.method1160(-127, arg0);
        class159.method1085(arg0, 1);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public final void method6(int arg0) {
        for (int var2 = 0; var2 < this.field14; var2++) {
            this.field10[var2][0] = null;
            this.field10[var2][1] = null;
            this.field10[var2][2] = null;
            this.field10[var2] = null;
        }
        if (arg0 != 1) {
            method7((byte) 29);
        }
        this.field10 = null;
        this.field9 = null;
        field8++;
        this.field23.method350(97);
        this.field23 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    public static final void method7(byte arg0) {
        class160.field3109 = -1;
        class19.field378 = -1;
        class155.field3027 = 0;
        class25.field488 = 0;
        class80.field1726 = false;
        class95.field1971 = 0;
        class60.field1174.field1454 = 0;
        field22++;
        class76.field1659 = -1;
        class14.field304 = 0;
        class22.field418.field1454 = 0;
        class20.field385 = 0;
        class107.field2234 = 0;
        class184.field3529 = -1;
        int var1 = 61 % ((arg0 + 37) / 44);
        for (int var2 = 0; var2 < class40.field795.length; var2++) {
            if (class40.field795[var2] != null) {
                class40.field795[var2].field3287 = -1;
            }
        }
        for (int var3 = 0; var3 < class133.field2626.length; var3++) {
            if (class133.field2626[var3] != null) {
                class133.field2626[var3].field3287 = -1;
            }
        }
        class180.method1198(-23703);
        class198.method1299(0, 30);
        for (int var4 = 0; var4 < 100; var4++) {
            class158.field3077[var4] = true;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)Lc;")
    public static final class21 method8(int arg0, int arg1) {
        if (arg1 > -97) {
            return null;
        }
        class21 var2 = (class21) class189.field3660.method986((byte) 50, (long) arg0);
        field7++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class126.field2522.method67(13, -1, arg0);
        class21 var4 = new class21();
        var4.field392 = arg0;
        if (var3 != null) {
            var4.method209((byte) 105, new class68(var3));
        }
        class189.field3660.method987((long) arg0, var4, 28842);
        return var4;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V")
    public static void method9(byte arg0) {
        field26 = null;
        if (arg0 == -40) {
            field21 = null;
            field27 = null;
            field25 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)[[I")
    public final int[][] method10(int arg0, byte arg1) {
        field15++;
        if (arg1 != 51) {
            method5(null, (byte) 16, -3);
        }
        if (this.field14 == this.field11) {
            this.field28 = this.field9[arg0] == null;
            this.field9[arg0] = class154.field3019;
            return this.field10[arg0];
        } else if (this.field14 == 1) {
            this.field28 = this.field13 != arg0;
            this.field13 = arg0;
            return this.field10[0];
        } else {
            class147 var3 = this.field9[arg0];
            if (this.field28 = var3 == null) {
                if (this.field14 > this.field20) {
                    var3 = new class147(arg0, this.field20);
                    this.field20++;
                } else {
                    class147 var4 = (class147) this.field23.method344(arg1 - 28931);
                    var3 = new class147(arg0, var4.field2878);
                    this.field9[var4.field2879] = null;
                    var4.method885(3);
                }
                this.field9[arg0] = var3;
            }
            this.field23.method346(8, var3);
            return this.field10[var3.field2878];
        }
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(B)V")
    public static final void method11(byte arg0) {
        field12++;
        class161.field3141 = 0;
        if (arg0 != -56) {
            field24 = -116;
        }
        int var1 = (class123.field2489.field3291 >> 7) + class127.field2536;
        int var2 = (class123.field2489.field3281 >> 7) + class34.field649;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class161.field3141 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class161.field3141 = 1;
        }
        if (class161.field3141 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class161.field3141 = 0;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lah;ILah;Lah;)V")
    public static final void method12(class9 arg0, int arg1, class9 arg2, class9 arg3) {
        class153.field3011 = arg3;
        class109.field2260 = arg0;
        if (arg1 >= -28) {
            method9((byte) -58);
        }
        class90.field1891 = arg2;
        field16++;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(III)V")
    public class2(int arg0, int arg1, int arg2) {
        this.field10 = new int[arg0][3][arg2];
        this.field11 = arg1;
        this.field14 = arg0;
        this.field9 = new class147[arg1];
    }
}
