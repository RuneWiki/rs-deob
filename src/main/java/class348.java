import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class348 {

    @OriginalMember(owner = "client!od", name = "b", descriptor = "[[I")
    private int[][] field5197;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    private int field5204;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    private int field5202;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "Z")
    public static boolean field5198 = false;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "Ljv;")
    public static class55 field5199 = new class55(64);

    @OriginalMember(owner = "client!od", name = "j", descriptor = "Lrn;")
    public static class174 field5205 = new class174(33, 7);

    @OriginalMember(owner = "client!od", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field5207 = new String[100];

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public static int field5208 = 0;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lcu;I)V", line = 4)
    public static final void method2208(class145 arg0, int arg1) {
        int var2 = 0;
        if (arg1 != -65536) {
            method2210((byte) -106);
        }
        while (var2 < class406.field6099) {
            int var3 = arg0.method1119(89);
            int var4 = arg0.method1069((byte) -29);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class440.field6577[var3] != null) {
                class440.field6577[var3].field4262 = var4;
            }
            var2++;
        }
        field5201++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)I", line = 34)
    public final int method2209(int arg0, int arg1) {
        field5200++;
        if (this.field5197 != null) {
            arg1 = (int) ((long) this.field5204 * (long) arg1 / (long) this.field5202);
        }
        if (arg0 > -21) {
            method2208(null, -42);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V", line = 49)
    public static void method2210(byte arg0) {
        field5199 = null;
        field5205 = null;
        field5207 = null;
        if (arg0 <= 93) {
            field5199 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII)V", line = 62)
    public static final void method2211(int arg0, int arg1, int arg2, int arg3) {
        class429 var4 = class380.field5761[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class506 var5 = var4.field6380;
        class506 var6 = var4.field6367;
        if (var5 != null) {
            var5.field7473 = var5.field7473 * arg3 / (0x10 << class426.field6345 - 7);
            var5.field7469 = var5.field7469 * arg3 / (0x10 << class426.field6345 - 7);
        }
        if (var6 != null) {
            var6.field7473 = var6.field7473 * arg3 / (0x10 << class426.field6345 - 7);
            var6.field7469 = var6.field7469 * arg3 / (0x10 << class426.field6345 - 7);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)I", line = 86)
    public final int method2212(int arg0, byte arg1) {
        field5196++;
        if (this.field5197 != null) {
            arg0 = ((int) ((long) this.field5204 * (long) arg0 / (long) this.field5202)) + 6;
        }
        int var3 = -122 % ((arg1 + 65) / 57);
        return arg0;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B[B)[B", line = 100)
    public final byte[] method2213(byte arg0, byte[] arg1) {
        if (this.field5197 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field5204 / (long) this.field5202) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field5197[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field5204 + var6;
                int var14 = var13 / this.field5202;
                var5 += var14;
                var6 = var13 - this.field5202 * var14;
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
        if (arg0 >= -25) {
            return null;
        } else {
            field5203++;
            return arg1;
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(II)V", line = 186)
    public class348(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class329.method2111(arg0, arg1, 0);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field5197 = new int[var4][14];
            this.field5204 = var5;
            this.field5202 = var4;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field5197[var6];
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
