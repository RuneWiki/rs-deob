import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class151 {

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    private int field2691;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    private int field2689;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "[[I")
    private int[][] field2694;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "Z")
    public static boolean field2695 = false;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "Lke;")
    public static class106 field2687 = new class106();

    @OriginalMember(owner = "client!g", name = "k", descriptor = "Lcd;")
    private static class64 field2696 = class44.method335((byte) 71, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!g", name = "l", descriptor = "Lcd;")
    public static class64 field2697 = field2696;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "[I")
    public static int[] field2699 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B[B)[B", line = 4)
    public final byte[] method1094(byte arg0, byte[] arg1) {
        field2686++;
        if (this.field2694 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field2691 / (long) this.field2689) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                int[] var8 = this.field2694[var6];
                byte var9 = arg1[var7];
                for (int var10 = 0; var10 < 14; var10++) {
                    var4[var5 + var10] += var8[var10] * var9;
                }
                int var11 = this.field2691 + var6;
                int var12 = var11 / this.field2689;
                var6 = var11 - this.field2689 * var12;
                var5 += var12;
            }
            arg1 = new byte[var3];
            for (int var13 = 0; var13 < var3; var13++) {
                int var14 = var4[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg1[var13] = -128;
                } else if (var14 > 127) {
                    arg1[var13] = 127;
                } else {
                    arg1[var13] = (byte) var14;
                }
            }
        }
        int var15 = -53 % ((arg0 - 33) / 39);
        return arg1;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)I", line = 71)
    public final int method1095(int arg0, byte arg1) {
        field2688++;
        if (this.field2694 != null) {
            arg0 = (int) ((long) this.field2691 * (long) arg0 / (long) this.field2689);
        }
        if (arg1 < 13) {
            field2697 = (class64) null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V", line = 86)
    public static final void method1096(byte arg0) {
        field2690++;
        class165.field2896.method1187(0);
        if (arg0 != 81) {
            method1098(true, 78, 85);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V", line = 113)
    public static void method1097(int arg0) {
        field2696 = null;
        field2699 = null;
        field2687 = null;
        if (arg0 != 1) {
            method1097(26);
        }
        field2697 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZII)V", line = 131)
    public static final void method1098(boolean arg0, int arg1, int arg2) {
        field2693++;
        if (class159.method1148(-1, arg2)) {
            if (arg0) {
                field2696 = (class64) null;
            }
            class17.method178(arg1, class272.field4675[arg2], 9725);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)I", line = 146)
    public final int method1099(int arg0, int arg1) {
        if (this.field2694 != null) {
            arg1 = (int) ((long) this.field2691 * (long) arg1 / (long) this.field2689) + 6;
        }
        field2698++;
        if (arg0 <= 78) {
            field2692 = -70;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(II)V", line = 161)
    public class151(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class297.method2071(arg0, arg1, false);
            int var4 = arg1 / var3;
            this.field2691 = var4;
            int var5 = arg0 / var3;
            this.field2689 = var5;
            this.field2694 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                double var7 = (double) var6 / (double) var5 + 6.0D;
                int[] var9 = this.field2694[var6];
                int var10 = (int) Math.floor(var7 + 1.0D - 7.0D);
                double var11 = (double) var4 / (double) var5;
                int var13 = (int) Math.ceil(var7 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                if (var10 < 0) {
                    var10 = 0;
                }
                while (var10 < var13) {
                    double var14 = var11;
                    double var16 = ((double) var10 - var7) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var11 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
