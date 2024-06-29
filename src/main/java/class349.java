import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public abstract class class349 extends class28 {

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "[Lvm;")
    public class349[] field5099;

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "Z")
    public boolean field5100;

    @OriginalMember(owner = "client!vm", name = "n", descriptor = "Lcb;")
    public static class318 field5101 = new class318(102, -1);

    @OriginalMember(owner = "client!vm", name = "A", descriptor = "I")
    public static int field5114 = 0;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!vm", name = "o", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!vm", name = "q", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!vm", name = "r", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!vm", name = "s", descriptor = "I")
    public int field5106;

    @OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!vm", name = "u", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!vm", name = "w", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!vm", name = "x", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!vm", name = "y", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!vm", name = "z", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!vm", name = "p", descriptor = "Lfi;")
    public class369 field5103;

    @OriginalMember(owner = "client!vm", name = "v", descriptor = "Lkk;")
    public class549 field5109;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V", line = 8)
    public static void method2179(byte arg0) {
        if (arg0 != 69) {
            field5114 = 21;
        }
        field5101 = null;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IB)[[I", line = 20)
    public int[][] method9(int arg0, byte arg1) {
        field5104++;
        int var3 = 73 / ((arg1 + 32) / 47);
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(III)[[I", line = 30)
    public final int[][] method2180(int arg0, int arg1, int arg2) {
        if (arg1 <= 14) {
            return null;
        }
        field5098++;
        if (this.field5099[arg0].field5100) {
            int[] var4 = this.field5099[arg0].method13((byte) 118, arg2);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field5099[arg0].method9(arg2, (byte) 48);
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(III)[I", line = 64)
    public final int[] method2181(int arg0, int arg1, int arg2) {
        if (arg1 != -1090477337) {
            this.method2186(-33);
        }
        field5107++;
        return this.field5099[arg0].field5100 ? this.field5099[arg0].method13((byte) -107, arg2) : this.field5099[arg0].method9(arg2, (byte) -126)[0];
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)I", line = 94)
    public int method2182(int arg0) {
        if (arg0 != 7622) {
            this.method5(18, 126, null);
        }
        field5108++;
        return -1;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BI)I", line = 109)
    public static final int method2183(byte arg0, int arg1) {
        field5113++;
        double var2 = (double) ((arg1 & 0xFFA9B7) >> 16) / 256.0D;
        double var4 = (double) ((arg1 & 0xFF40) >> 8) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        if (arg0 < 114) {
            method2179((byte) 83);
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return (var21 >> 5 << 7) + ((var20 & 0xFF) >> 2 << 10) + (var22 >> 1);
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(III)V", line = 211)
    public void method2184(int arg0, int arg1, int arg2) {
        field5097++;
        int var4 = this.field5106 == 255 ? arg0 : this.field5106;
        if (arg1 != 30229) {
            field5114 = 24;
        }
        if (this.field5100) {
            this.field5109 = new class549(var4, arg0, arg2);
        } else {
            this.field5103 = new class369(var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(BI)[I", line = 241)
    public int[] method13(byte arg0, int arg1) {
        int var3 = 84 % ((56 - arg0) / 41);
        field5111++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)I", line = 251)
    public int method2185(int arg0) {
        field5102++;
        int var2 = -61 % ((19 - arg0) / 40);
        return -1;
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(I)V", line = 261)
    public void method2186(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field5112++;
        if (this.field5100) {
            this.field5109.method3087(0);
            this.field5109 = null;
        } else {
            this.field5103.method2269(arg0 - 9195);
            this.field5103 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IILdga;)V", line = 287)
    public void method5(int arg0, int arg1, class138 arg2) {
        field5110++;
        if (arg0 != 4095) {
            this.field5106 = 92;
        }
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(B)V", line = 297)
    public void method11(byte arg0) {
        field5105++;
        if (arg0 > -51) {
            this.method2184(-100, -3, -75);
        }
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(IZ)V", line = 306)
    public class349(int arg0, boolean arg1) {
        this.field5099 = new class349[arg0];
        this.field5100 = arg1;
    }
}
