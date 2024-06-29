import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class79 {

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    private int field1105;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "[[I")
    private int[][] field1110;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    private int field1107;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZBI)V")
    public static final void method570(boolean arg0, byte arg1, int arg2) {
        if (arg1 != 127) {
            return;
        }
        class390.field5619 = new byte[arg2][class192.field2574][class364.field5262];
        field1106++;
        class253.field3494 = new byte[arg2][class192.field2574][class364.field5262];
        class331.field4817 = new int[arg2][class192.field2574 + 1][class364.field5262 + 1];
        class448.field6562 = new int[class364.field5262];
        class157.field2131 = new int[class364.field5262];
        class143.field1953 = 99;
        class248.field3341 = new byte[arg2][class192.field2574 + 1][class364.field5262 + 1];
        class26.field363 = new int[class364.field5262];
        if (!arg0) {
            class377.field5490 = null;
        }
        class424.field6267 = new byte[arg2][class192.field2574][class364.field5262];
        class397.field5912 = new int[class364.field5262];
        class415.field6093 = new int[5];
        class302.field4447 = new byte[arg2][class192.field2574][class364.field5262];
        class397.field5908 = new int[class364.field5262];
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)V")
    public static final void method571(int arg0, int arg1) {
        if (arg1 < 23) {
            method570(true, (byte) -87, 95);
        }
        field1104++;
        class72 var2 = (class72) class8.field145.method384((long) arg0, true);
        if (var2 != null) {
            for (int var3 = 0; var3 < var2.field1038.length; var3++) {
                var2.field1038[var3] = -1;
                var2.field1040[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BI)I")
    public final int method572(byte arg0, int arg1) {
        if (this.field1110 != null) {
            arg1 = (int) ((long) this.field1105 * (long) arg1 / (long) this.field1107) + 6;
        }
        if (arg0 < 103) {
            return 64;
        } else {
            field1109++;
            return arg1;
        }
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(II)V")
    public class79(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class244.method1461(arg0, arg1, -35);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field1105 = var4;
            this.field1110 = new int[var5][14];
            this.field1107 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field1110[var6];
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
                while (var11 > var10) {
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

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B[B)[B")
    public final byte[] method573(byte arg0, byte[] arg1) {
        int var3 = -100 / ((arg0 - 32) / 39);
        field1108++;
        if (this.field1110 != null) {
            int var4 = (int) ((long) arg1.length * (long) this.field1105 / (long) this.field1107) + 14;
            int[] var5 = new int[var4];
            int var6 = 0;
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.length; var8++) {
                byte var11 = arg1[var8];
                int[] var12 = this.field1110[var7];
                for (int var13 = 0; var13 < 14; var13++) {
                    var5[var6 + var13] += var12[var13] * var11;
                }
                int var14 = this.field1105 + var7;
                int var15 = var14 / this.field1107;
                var7 = var14 - this.field1107 * var15;
                var6 += var15;
            }
            arg1 = new byte[var4];
            for (int var9 = 0; var9 < var4; var9++) {
                int var10 = var5[var9] + 32768 >> 16;
                if (var10 < -128) {
                    arg1[var9] = -128;
                } else if (var10 > 127) {
                    arg1[var9] = 127;
                } else {
                    arg1[var9] = (byte) var10;
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(BI)I")
    public final int method574(byte arg0, int arg1) {
        if (this.field1110 != null) {
            arg1 = (int) ((long) this.field1105 * (long) arg1 / (long) this.field1107);
        }
        field1111++;
        return arg0 == -60 ? arg1 : 113;
    }
}
