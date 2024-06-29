import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class459 {

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "[[I")
    private int[][] field6501;

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "I")
    private int field6495;

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "I")
    private int field6497;

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "Lct;")
    public static class285 field6499 = new class285(56, -1);

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "Lj;")
    public static class240 field6502 = new class240(13, 4);

    @OriginalMember(owner = "client!qq", name = "j", descriptor = "Z")
    public static boolean field6503 = false;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "I")
    public static int field6494;

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "I")
    public static int field6496;

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "I")
    public static int field6498;

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "I")
    public static int field6500;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)V", line = 3)
    public static void method2711(byte arg0) {
        field6499 = null;
        field6502 = null;
        if (arg0 != -41) {
            method2712((String) null, 99);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 14)
    public static final String method2712(String arg0, int arg1) {
        field6500++;
        int var2 = arg0.length();
        int var3 = 0;
        if (arg1 > -46) {
            field6503 = false;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg0.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)I", line = 64)
    public final int method2713(int arg0, int arg1) {
        if (this.field6501 != null) {
            arg0 = (int) ((long) this.field6497 * (long) arg0 / (long) this.field6495);
        }
        if (arg1 != 62) {
            this.field6501 = null;
        }
        field6498++;
        return arg0;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(BI)I", line = 87)
    public final int method2714(byte arg0, int arg1) {
        if (this.field6501 != null) {
            arg1 = ((int) ((long) this.field6497 * (long) arg1 / (long) this.field6495)) + 6;
        }
        field6496++;
        if (arg0 <= 26) {
            field6503 = true;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I[B)[B", line = 108)
    public final byte[] method2715(int arg0, byte[] arg1) {
        if (this.field6501 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field6497 / (long) this.field6495) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field6501[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field6497 + var6;
                int var14 = var13 / this.field6495;
                var6 = var13 - this.field6495 * var14;
                var5 += var14;
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
        if (arg0 != -21384) {
            method2712((String) null, 58);
        }
        field6494++;
        return arg1;
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(II)V", line = 175)
    public class459(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class384.method2333(arg1, arg0, 353);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field6501 = new int[var5][14];
            this.field6495 = var5;
            this.field6497 = var4;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field6501[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
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
