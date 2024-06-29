import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class276 extends class170 {

    @OriginalMember(owner = "client!sh", name = "Y", descriptor = "Lmh;")
    private static class128 field4780 = class22.method156(124, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!sh", name = "V", descriptor = "Lmh;")
    public static class128 field4777 = field4780;

    @OriginalMember(owner = "client!sh", name = "bb", descriptor = "I")
    public static int field4783 = 128;

    @OriginalMember(owner = "client!sh", name = "S", descriptor = "Ls;")
    public static class261 field4774 = new class261(64);

    @OriginalMember(owner = "client!sh", name = "cb", descriptor = "Lmh;")
    public static class128 field4784 = class22.method156(125, ":clan:");

    @OriginalMember(owner = "client!sh", name = "db", descriptor = "[[S")
    public static short[][] field4785 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!sh", name = "R", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!sh", name = "T", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!sh", name = "U", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!sh", name = "W", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!sh", name = "X", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!sh", name = "Z", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!sh", name = "ab", descriptor = "[Lth;")
    private class79[] field4782;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILbg;B)V", line = 10)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        if (arg0 == 0) {
            this.field4782 = new class79[arg1.method1325(arg2 + 7614)];
            for (int var4 = 0; var4 < this.field4782.length; var4++) {
                int var5 = arg1.method1325(7627);
                if (var5 == 0) {
                    this.field4782[var4] = class289.method1993((byte) 47, arg1);
                } else if (var5 == 1) {
                    this.field4782[var4] = class259.method1819(arg1, (byte) -18);
                } else if (var5 == 2) {
                    this.field4782[var4] = class207.method1421(class233.method1599(arg2, -10591), arg1);
                } else if (var5 == 3) {
                    this.field4782[var4] = class32.method230((byte) -76, arg1);
                }
            }
        } else if (arg0 == 1) {
            this.field2970 = arg1.method1325(7627) == 1;
        }
        field4779++;
        if (arg2 != 13) {
            this.method69((byte) -112, 88);
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V", line = 84)
    public class276() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)[[I", line = 102)
    public final int[][] method62(int arg0, int arg1) {
        int[][] var3 = this.field2976.method1098(arg0, -19544);
        field4778++;
        int var4 = 14 / ((arg1 + 24) / 46);
        if (this.field2976.field2883) {
            int var5 = class12.field390;
            int var6 = class185.field3225;
            int[][] var7 = new int[var5][var6];
            int[][][] var8 = this.field2976.method1090((byte) 57);
            this.method1936(var7, 17958);
            for (int var9 = 0; var9 < class12.field390; var9++) {
                int[][] var10 = var8[var9];
                int[] var11 = var7[var9];
                int[] var12 = var10[0];
                int[] var13 = var10[1];
                int[] var14 = var10[2];
                for (int var15 = 0; var15 < class185.field3225; var15++) {
                    int var16 = var11[var15];
                    var14[var15] = class238.method1622(var16 << 4, 4080);
                    var13[var15] = class238.method1622(var16 >> 4, 4080);
                    var12[var15] = class238.method1622(4080, var16 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "([[II)V", line = 168)
    private final void method1936(int[][] arg0, int arg1) {
        int var3 = class185.field3225;
        field4773++;
        if (arg1 != 17958) {
            return;
        }
        int var4 = class12.field390;
        class291.method2002(arg0, false);
        class302.method2056(class5.field94, 0, 0, arg1 - 17957, class297.field5073);
        if (this.field4782 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field4782.length; var5++) {
            class79 var6 = this.field4782[var5];
            int var7 = var6.field1437;
            int var8 = var6.field1435;
            if (var8 < 0) {
                if (var7 >= 0) {
                    var6.method151(var4, 0, var3);
                }
            } else if (var7 >= 0) {
                var6.method154(var4, false, var3);
            } else {
                var6.method155(var4, var3, -231);
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BI)[I", line = 220)
    public final int[] method69(byte arg0, int arg1) {
        if (arg0 != 85) {
            field4784 = (class128) null;
        }
        field4775++;
        int[] var3 = this.field2977.method1838(false, arg1);
        if (this.field2977.field4552) {
            this.method1936(this.field2977.method1840(85), arg0 ^ 0x4673);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "(B)V", line = 243)
    public static void method1937(byte arg0) {
        field4780 = null;
        field4784 = null;
        field4774 = null;
        if (arg0 != 2) {
            field4774 = (class261) null;
        }
        field4785 = (short[][]) null;
        field4777 = null;
    }
}
