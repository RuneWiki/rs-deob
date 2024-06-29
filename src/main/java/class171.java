import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class171 extends class326 {

    @OriginalMember(owner = "client!ba", name = "N", descriptor = "I")
    private int field2816 = 204;

    @OriginalMember(owner = "client!ba", name = "Q", descriptor = "I")
    private int field2818 = 1;

    @OriginalMember(owner = "client!ba", name = "T", descriptor = "I")
    private int field2821 = 1;

    @OriginalMember(owner = "client!ba", name = "L", descriptor = "Ljava/lang/String;")
    public static String field2814 = "Loaded fonts";

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "Lrm;")
    public static class184 field2811 = new class184(64);

    @OriginalMember(owner = "client!ba", name = "U", descriptor = "[[I")
    public static int[][] field2822 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!ba", name = "W", descriptor = "Z")
    public static boolean field2824 = false;

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "Z")
    public static boolean field2823 = true;

    @OriginalMember(owner = "client!ba", name = "J", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!ba", name = "O", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!ba", name = "R", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!ba", name = "S", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!ba", name = "X", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!ba", name = "Y", descriptor = "Lug;")
    public static class253 field2826;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZIZI)Ljava/lang/String;", line = 14)
    public static final String method1278(boolean arg0, int arg1, boolean arg2, int arg3) {
        field2820++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        } else if (arg2 && arg1 >= 0) {
            int var4 = 2;
            int var5 = arg1 / arg3;
            if (arg0) {
                field2814 = (String) null;
            }
            while (var5 != 0) {
                var4++;
                var5 /= arg3;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg1;
                arg1 /= arg3;
                int var9 = var8 - arg1 * arg3;
                if (var9 < 10) {
                    var6[var7] = (char) (var9 + 48);
                } else {
                    var6[var7] = (char) (var9 + 87);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V", line = 65)
    public class171() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "(B)V", line = 70)
    public static void method1279(byte arg0) {
        if (arg0 != 44) {
            field2824 = true;
        }
        field2826 = null;
        field2822 = (int[][]) null;
        field2814 = null;
        field2811 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IBII)I", line = 91)
    public static final int method1280(int arg0, byte arg1, int arg2, int arg3) {
        field2819++;
        if (arg1 != -7) {
            method1280(27, (byte) 90, 57, 77);
        }
        return arg0 > arg3 ? arg0 : (arg3 <= arg2 ? arg3 : arg2);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZLvl;)V", line = 106)
    public final void method98(int arg0, boolean arg1, class6 arg2) {
        if (arg1) {
            method1280(38, (byte) -73, 46, 126);
        }
        if (arg0 == 0) {
            this.field2818 = arg2.method58(-288140008);
        } else if (arg0 == 1) {
            this.field2821 = arg2.method58(-288140008);
        } else if (arg0 == 2) {
            this.field2816 = arg2.method39((byte) 30);
        }
        field2812++;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)[I", line = 157)
    public final int[] method103(int arg0, int arg1) {
        int[] var3 = this.field5112.method1648(arg1, -16687);
        field2813++;
        if (this.field5112.field3583) {
            for (int var4 = 0; var4 < class166.field2731; var4++) {
                int var5 = class110.field1527[var4];
                int var6 = class34.field508[arg1];
                int var7 = this.field2818 * var5 >> 12;
                int var8 = var5 % (4096 / this.field2818) * this.field2818;
                int var9 = var6 % (4096 / this.field2821) * this.field2821;
                int var10 = this.field2821 * var6 >> 12;
                if (var9 < this.field2816) {
                    for (var7 -= var10; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field2816 > var8) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field2816 > var8) {
                    int var11;
                    for (var11 = var7 - var10; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        if (arg0 > -25) {
            method1278(true, -49, false, -68);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lug;II)Lqg;", line = 247)
    public static final class206 method1281(class253 arg0, int arg1, int arg2) {
        field2817++;
        if (arg2 == 4096) {
            byte[] var3 = arg0.method1834(-128, arg1);
            return var3 == null ? null : new class206(var3);
        } else {
            return (class206) null;
        }
    }
}
