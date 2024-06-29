import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class388 {

    @OriginalMember(owner = "client!ifa", name = "i", descriptor = "[[I")
    private int[][] field5188;

    @OriginalMember(owner = "client!ifa", name = "e", descriptor = "I")
    private int field5184;

    @OriginalMember(owner = "client!ifa", name = "f", descriptor = "I")
    private int field5185;

    @OriginalMember(owner = "client!ifa", name = "g", descriptor = "Lkfa;")
    public static class549 field5186 = new class549(67, 6);

    @OriginalMember(owner = "client!ifa", name = "j", descriptor = "I")
    public static int field5189 = -1;

    @OriginalMember(owner = "client!ifa", name = "k", descriptor = "[[I")
    public static int[][] field5190 = new int[128][128];

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "I")
    public static int field5180;

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!ifa", name = "d", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!ifa", name = "h", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIIIILjo;Z)V", line = 5)
    public static final void method2121(int arg0, int arg1, int arg2, int arg3, int arg4, class303 arg5, boolean arg6) {
        class377.field4896 = arg3;
        class36.field411 = arg1;
        class636.field9006 = 1;
        if (arg2 != 18660) {
            method2121(-75, 96, -17, 107, 84, null, true);
        }
        field5181++;
        class602.field8542 = arg0;
        class692.field9747 = arg5;
        class41.field434 = arg4;
        class385.field5149 = arg6;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(B[B)[B", line = 27)
    public final byte[] method2122(byte arg0, byte[] arg1) {
        if (arg0 != -44) {
            this.field5184 = 75;
        }
        if (this.field5188 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field5184 / (long) this.field5185) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field5188[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field5184 + var6;
                int var14 = var13 / this.field5185;
                var5 += var14;
                var6 = var13 - this.field5185 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 <= 127) {
                    arg1[var8] = (byte) var9;
                } else {
                    arg1[var8] = 127;
                }
            }
        }
        field5182++;
        return arg1;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)V", line = 94)
    public static void method2123(int arg0) {
        if (arg0 <= 34) {
            method2125(false, -128, null);
        }
        field5190 = null;
        field5186 = null;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(II)I", line = 105)
    public final int method2124(int arg0, int arg1) {
        int var3 = -12 / ((arg1 + 59) / 42);
        field5183++;
        if (this.field5188 != null) {
            arg0 = (int) ((long) this.field5184 * (long) arg0 / (long) this.field5185) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ZILjava/lang/String;)V", line = 124)
    public static final void method2125(boolean arg0, int arg1, String arg2) {
        class650.method3670(arg1 ^ 0xFFFEFF9E, -1, -1, arg0, arg2);
        if (arg1 == 65536) {
            field5187++;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ZI)I", line = 136)
    public final int method2126(boolean arg0, int arg1) {
        if (this.field5188 != null) {
            arg1 = (int) ((long) this.field5184 * (long) arg1 / (long) this.field5185);
        }
        if (arg0) {
            return 111;
        } else {
            field5180++;
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(II)V", line = 150)
    public class388(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class168.method1004(arg0, -1, arg1);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field5188 = new int[var4][14];
            this.field5184 = var5;
            this.field5185 = var4;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field5188[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var5 / (double) var4;
                while (var10 < var11) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
