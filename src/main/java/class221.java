import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class221 {

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    private int field3719;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    private int field3721;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "[[I")
    private int[][] field3722;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "Lek;")
    public static class172 field3720;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "[I")
    public static int[] field3715;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V", line = 5)
    public static void method1450(byte arg0) {
        int var1 = -128 % ((arg0 + 38) / 51);
        field3715 = null;
        field3720 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)I", line = 24)
    public final int method1451(int arg0, int arg1) {
        field3723++;
        if (this.field3722 != null) {
            arg0 = (int) ((long) this.field3719 * (long) arg0 / (long) this.field3721);
        }
        if (arg1 != -1981) {
            method1452(false, -50);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZI)V", line = 42)
    public static final void method1452(boolean arg0, int arg1) {
        field3724++;
        if (!class92.method588(arg1, -55) || arg0) {
            return;
        }
        class69[] var2 = class122.field2036[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class69 var4 = var2[var3];
            if (var4 != null) {
                var4.field1088 = 0;
                var4.field1075 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B[B)[B", line = 79)
    public final byte[] method1453(byte arg0, byte[] arg1) {
        if (arg0 < 107) {
            field3715 = (int[]) null;
        }
        field3718++;
        if (this.field3722 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field3719 / (long) this.field3721) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                int[] var8 = this.field3722[var6];
                byte var9 = arg1[var7];
                for (int var10 = 0; var10 < 14; var10++) {
                    var4[var5 + var10] += var8[var10] * var9;
                }
                int var11 = this.field3719 + var6;
                int var12 = var11 / this.field3721;
                var6 = var11 - this.field3721 * var12;
                var5 += var12;
            }
            arg1 = new byte[var3];
            for (int var13 = 0; var13 < var3; var13++) {
                int var14 = var4[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg1[var13] = -128;
                } else if (var14 <= 127) {
                    arg1[var13] = (byte) var14;
                } else {
                    arg1[var13] = 127;
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(II)I", line = 152)
    public final int method1454(int arg0, int arg1) {
        field3717++;
        if (arg1 != 25934) {
            this.method1454(-119, -128);
        }
        if (this.field3722 != null) {
            arg0 = (int) ((long) this.field3719 * (long) arg0 / (long) this.field3721) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(II)V", line = 171)
    public class221(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class85.method549(arg0, 15, arg1);
            int var4 = arg1 / var3;
            this.field3719 = var4;
            int var5 = arg0 / var3;
            this.field3721 = var5;
            this.field3722 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field3722[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                double var11 = (double) var4 / (double) var5;
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var13 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var11;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var11 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
