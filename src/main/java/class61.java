import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class61 {

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    private int field1166;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    private int field1157;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "[[I")
    private int[][] field1159;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "[Lqd;")
    public static class40[] field1164 = new class40[100];

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "Lqd;")
    public static class40 field1167 = class147.method1106("showVideoAd", (byte) -94);

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "Lce;")
    public static class239 field1161;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IB)I", line = 4)
    public final int method507(int arg0, byte arg1) {
        if (arg1 != 36) {
            this.field1159 = (int[][]) ((int[][]) null);
        }
        field1162++;
        if (this.field1159 != null) {
            arg0 = (int) ((long) this.field1166 * (long) arg0 / (long) this.field1157) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(IB)I", line = 25)
    public final int method508(int arg0, byte arg1) {
        field1160++;
        if (this.field1159 != null) {
            arg0 = (int) ((long) this.field1166 * (long) arg0 / (long) this.field1157);
        }
        return arg1 > -59 ? -62 : arg0;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V", line = 45)
    public static void method509(int arg0) {
        field1167 = null;
        field1164 = null;
        field1161 = null;
        if (arg0 != 32768) {
            method511((byte) 23);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "([BI)[B", line = 65)
    public final byte[] method510(byte[] arg0, int arg1) {
        if (arg1 != 15402) {
            return (byte[]) null;
        }
        field1165++;
        if (this.field1159 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field1166 / (long) this.field1157) + 14;
            int var4 = 0;
            int[] var5 = new int[var3];
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var8 = arg0[var7];
                int[] var9 = this.field1159[var4];
                for (int var10 = 0; var10 < 14; var10++) {
                    var5[var6 + var10] += var9[var10] * var8;
                }
                int var11 = this.field1166 + var4;
                int var12 = var11 / this.field1157;
                var4 = var11 - this.field1157 * var12;
                var6 += var12;
            }
            arg0 = new byte[var3];
            for (int var13 = 0; var13 < var3; var13++) {
                int var14 = var5[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg0[var13] = -128;
                } else if (var14 > 127) {
                    arg0[var13] = 127;
                } else {
                    arg0[var13] = (byte) var14;
                }
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)Lcm;", line = 140)
    public static final class185 method511(byte arg0) {
        if (arg0 >= -70) {
            method509(64);
        }
        byte[] var1 = class22.field387[0];
        field1163++;
        int var2 = class210.field3356[0] * class102.field1802[0];
        int[] var3 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = class171.field2797[class276.method1923(255, var1[var4])];
        }
        class185 var5;
        if (class21.field350) {
            var5 = new class100(class102.field1799, class169.field2787, class12.field208[0], class256.field4265[0], class102.field1802[0], class210.field3356[0], var3);
        } else {
            var5 = new class99(class102.field1799, class169.field2787, class12.field208[0], class256.field4265[0], class102.field1802[0], class210.field3356[0], var3);
        }
        class181.method1324(102);
        return var5;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(II)V", line = 186)
    public class61(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class20.method127(0, arg1, arg0);
            int var4 = arg1 / var3;
            this.field1166 = var4;
            int var5 = arg0 / var3;
            this.field1157 = var5;
            this.field1159 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field1159[var6];
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
                    double var14 = var11;
                    double var16 = ((double) var10 - var8) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var11 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
