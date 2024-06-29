import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class273 extends class170 {

    @OriginalMember(owner = "client!dm", name = "S", descriptor = "Z")
    private boolean field4729 = true;

    @OriginalMember(owner = "client!dm", name = "V", descriptor = "I")
    private int field4732 = 4096;

    @OriginalMember(owner = "client!dm", name = "W", descriptor = "Lmh;")
    public static class128 field4733 = class22.method156(124, "");

    @OriginalMember(owner = "client!dm", name = "R", descriptor = "Lmh;")
    public static class128 field4728 = field4733;

    @OriginalMember(owner = "client!dm", name = "Z", descriptor = "Lmh;")
    public static class128 field4736 = field4733;

    @OriginalMember(owner = "client!dm", name = "bb", descriptor = "[Lfa;")
    public static class188[] field4738 = new class188[6];

    @OriginalMember(owner = "client!dm", name = "T", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!dm", name = "U", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!dm", name = "X", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!dm", name = "Y", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!dm", name = "ab", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!dm", name = "db", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!dm", name = "eb", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!dm", name = "fb", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!dm", name = "cb", descriptor = "[[[B")
    public static byte[][][] field4739;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I[I)[I", line = 4)
    public static final int[] method1915(int arg0, int[] arg1) {
        field4735++;
        if (arg1 == null) {
            return null;
        }
        int[] var2 = new int[arg1.length];
        class224.method1540(arg1, 0, var2, 0, arg1.length);
        if (arg0 != -26424) {
            field4728 = (class128) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lqh;ILqh;)V", line = 21)
    public static final void method1916(class287 arg0, int arg1, class287 arg2) {
        field4737++;
        if (arg0.field4914 != null) {
            arg0.method1978((byte) -98);
        }
        arg0.field4914 = arg2.field4914;
        arg0.field4902 = arg2;
        if (arg1 < 83) {
            method1917(30, 127, (byte) -4);
        }
        arg0.field4914.field4902 = arg0;
        arg0.field4902.field4914 = arg0;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIB)V", line = 39)
    public static final void method1917(int arg0, int arg1, byte arg2) {
        field4730++;
        class229 var3 = class241.method1638(7, -64, arg1);
        if (arg2 == -41) {
            var3.method1574(arg2 + 3240);
            var3.field3981 = arg0;
        }
    }

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "(I)V", line = 64)
    public static void method1918(int arg0) {
        field4736 = null;
        if (arg0 != 0) {
            field4733 = (class128) null;
        }
        field4728 = null;
        field4738 = null;
        field4733 = null;
        field4739 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "(I)V", line = 82)
    public static final void method1919(int arg0) {
        field4740++;
        if (arg0 != 20115) {
            method1915(-57, (int[]) null);
        }
        class189.field3288.method1832((byte) 54);
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "()V", line = 270)
    public class273() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(II)I", line = 100)
    public static final int method1920(int arg0, int arg1) {
        field4731++;
        if (arg0 < 0) {
            return 0;
        }
        class245 var2 = (class245) class151.field2591.method728(false, (long) arg0);
        if (var2 == null) {
            return class292.method2006((byte) -127, arg0).field4037;
        }
        int var3 = arg1;
        for (int var4 = 0; var4 < var2.field4185.length; var4++) {
            if (var2.field4185[var4] == -1) {
                var3++;
            }
        }
        return var3 + (class292.method2006((byte) -33, arg0).field4037 - var2.field4185.length);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)[[I", line = 148)
    public final int[][] method62(int arg0, int arg1) {
        int[][] var3 = this.field2976.method1098(arg0, -19544);
        int var4 = -95 % ((-arg1 - 24) / 46);
        if (this.field2976.field2883) {
            int[] var5 = this.method1142((byte) 44, 0, arg0 - 1 & class297.field5073);
            int[] var6 = this.method1142((byte) 44, 0, arg0);
            int[] var7 = this.method1142((byte) 44, 0, class297.field5073 & arg0 + 1);
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class185.field3225; var11++) {
                int var12 = (var7[var11] - var5[var11]) * this.field4732;
                int var13 = (var6[var11 + 1 & class5.field94] - var6[class5.field94 & var11 - 1]) * this.field4732;
                int var14 = var12 >> 12;
                int var15 = var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = var15 * var15 >> 12;
                int var18 = (int) (Math.sqrt((double) ((float) (var16 + var17 + 4096) / 4096.0F)) * 4096.0D);
                int var19;
                int var20;
                int var21;
                if (var18 == 0) {
                    var19 = 0;
                    var20 = 0;
                    var21 = 0;
                } else {
                    var19 = 16777216 / var18;
                    var21 = var13 / var18;
                    var20 = var12 / var18;
                }
                if (this.field4729) {
                    var20 = (var20 >> 1) + 2048;
                    var21 = (var21 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var9[var11] = var21;
                var8[var11] = var20;
                var10[var11] = var19;
            }
        }
        field4742++;
        return var3;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILbg;B)V", line = 227)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        field4734++;
        if (arg0 == 0) {
            this.field4732 = arg1.method1308(arg2 - 105);
        } else if (arg0 == 1) {
            this.field4729 = arg1.method1325(7627) == 1;
        }
        if (arg2 != 13) {
            this.method63(10, (class194) null, (byte) -93);
        }
    }
}
