import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class13 {

    @OriginalMember(owner = "client!c", name = "e", descriptor = "[I")
    private int[] field372 = new int[5];

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public int field374 = 500;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    private int field368 = 100;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "[I")
    private int[] field382 = new int[5];

    @OriginalMember(owner = "client!c", name = "i", descriptor = "[I")
    private int[] field376 = new int[5];

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public int field373 = 0;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    private int field386 = 0;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "[I")
    private static int[] field381 = new int[32768];

    @OriginalMember(owner = "client!c", name = "j", descriptor = "[I")
    private static int[] field377;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "[I")
    private static int[] field379;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "[I")
    private static int[] field385;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "[I")
    private static int[] field389;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "[I")
    private static int[] field388;

    @OriginalMember(owner = "client!c", name = "x", descriptor = "[I")
    private static int[] field391;

    @OriginalMember(owner = "client!c", name = "y", descriptor = "[I")
    private static int[] field392;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "Lja;")
    private class55 field380;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "Ln;")
    private class78 field369;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "Ln;")
    private class78 field370;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "Ln;")
    private class78 field371;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "Ln;")
    private class78 field375;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "Ln;")
    private class78 field378;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "Ln;")
    private class78 field383;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "Ln;")
    private class78 field384;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "Ln;")
    private class78 field387;

    @OriginalMember(owner = "client!c", name = "w", descriptor = "Ln;")
    private class78 field390;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field381[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field377 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field377[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field379 = new int[220500];
        field385 = new int[5];
        field389 = new int[5];
        field388 = new int[5];
        field391 = new int[5];
        field392 = new int[5];
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)I", line = 7)
    private final int method101(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field377[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field381[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()V", line = 43)
    public static void method102() {
        field379 = null;
        field381 = null;
        field377 = null;
        field391 = null;
        field389 = null;
        field392 = null;
        field388 = null;
        field385 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lfe;)V", line = 74)
    public final void method103(class36 arg0) {
        this.field387 = new class78();
        this.field387.method605(arg0);
        this.field390 = new class78();
        this.field390.method605(arg0);
        int var2 = arg0.method365((byte) -126);
        if (var2 != 0) {
            arg0.field1057--;
            this.field384 = new class78();
            this.field384.method605(arg0);
            this.field378 = new class78();
            this.field378.method605(arg0);
        }
        int var3 = arg0.method365((byte) -122);
        if (var3 != 0) {
            arg0.field1057--;
            this.field370 = new class78();
            this.field370.method605(arg0);
            this.field375 = new class78();
            this.field375.method605(arg0);
        }
        int var4 = arg0.method365((byte) -128);
        if (var4 != 0) {
            arg0.field1057--;
            this.field371 = new class78();
            this.field371.method605(arg0);
            this.field383 = new class78();
            this.field383.method605(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method331(120);
            if (var6 == 0) {
                break;
            }
            this.field372[var5] = var6;
            this.field382[var5] = arg0.method354(128);
            this.field376[var5] = arg0.method331(-126);
        }
        this.field386 = arg0.method331(-124);
        this.field368 = arg0.method331(115);
        this.field374 = arg0.method351((byte) -101);
        this.field373 = arg0.method351((byte) -109);
        this.field380 = new class55();
        this.field369 = new class78();
        this.field380.method470(arg0, this.field369);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)[I", line = 161)
    public final int[] method104(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field379[var3] = 0;
        }
        if (arg1 < 10) {
            return field379;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field387.method604();
        this.field390.method604();
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field384 != null) {
            this.field384.method604();
            this.field378.method604();
            var6 = (int) ((double) (this.field384.field1895 - this.field384.field1894) * 32.768D / var4);
            var7 = (int) ((double) this.field384.field1894 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field370 != null) {
            this.field370.method604();
            this.field375.method604();
            var9 = (int) ((double) (this.field370.field1895 - this.field370.field1894) * 32.768D / var4);
            var10 = (int) ((double) this.field370.field1894 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field372[var12] != 0) {
                field391[var12] = 0;
                field389[var12] = (int) ((double) this.field376[var12] * var4);
                field392[var12] = (this.field372[var12] << 14) / 100;
                field388[var12] = (int) ((double) (this.field387.field1895 - this.field387.field1894) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field382[var12]) / var4);
                field385[var12] = (int) ((double) this.field387.field1894 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var40 = this.field387.method602(arg0);
            int var41 = this.field390.method602(arg0);
            if (this.field384 != null) {
                int var42 = this.field384.method602(arg0);
                int var43 = this.field378.method602(arg0);
                var40 += this.method101(var8, var43, this.field384.field1892) >> 1;
                var8 += (var6 * var42 >> 16) + var7;
            }
            if (this.field370 != null) {
                int var44 = this.field370.method602(arg0);
                int var45 = this.field375.method602(arg0);
                var41 = var41 * ((this.method101(var11, var45, this.field370.field1892) >> 1) + 32768) >> 15;
                var11 += (var9 * var44 >> 16) + var10;
            }
            for (int var46 = 0; var46 < 5; var46++) {
                if (this.field372[var46] != 0) {
                    int var47 = field389[var46] + var13;
                    if (var47 < arg0) {
                        field379[var47] += this.method101(field391[var46], field392[var46] * var41 >> 15, this.field387.field1892);
                        field391[var46] += (field388[var46] * var40 >> 16) + field385[var46];
                    }
                }
            }
        }
        if (this.field371 != null) {
            this.field371.method604();
            this.field383.method604();
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field371.method602(arg0);
                int var19 = this.field383.method602(arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field371.field1895 - this.field371.field1894) * var18 >> 8) + this.field371.field1894;
                } else {
                    var20 = ((this.field371.field1895 - this.field371.field1894) * var19 >> 8) + this.field371.field1894;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field379[var17] = 0;
                }
            }
        }
        if (this.field386 > 0 && this.field368 > 0) {
            int var21 = (int) ((double) this.field386 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field379[var22] += field379[var22 - var21] * this.field368 / 100;
            }
        }
        if (this.field380.field1420[0] > 0 || this.field380.field1420[1] > 0) {
            this.field369.method604();
            int var23 = this.field369.method602(arg0 + 1);
            int var24 = this.field380.method465(0, (float) var23 / 65536.0F);
            int var25 = this.field380.method465(1, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var36 = (int) ((long) field379[var24 + var26] * (long) class55.field1421 >> 16);
                    for (int var37 = 0; var37 < var24; var37++) {
                        var36 += (int) ((long) field379[var24 + var26 - var37 - 1] * (long) class55.field1418[0][var37] >> 16);
                    }
                    for (int var38 = 0; var38 < var26; var38++) {
                        var36 -= (int) ((long) field379[var26 - var38 - 1] * (long) class55.field1418[1][var38] >> 16);
                    }
                    field379[var26] = var36;
                    var23 = this.field369.method602(arg0 + 1);
                    var26++;
                }
                int var28 = 128;
                while (true) {
                    if (var28 > arg0 - var24) {
                        var28 = arg0 - var24;
                    }
                    while (var26 < var28) {
                        int var33 = (int) ((long) field379[var24 + var26] * (long) class55.field1421 >> 16);
                        for (int var34 = 0; var34 < var24; var34++) {
                            var33 += (int) ((long) field379[var24 + var26 - var34 - 1] * (long) class55.field1418[0][var34] >> 16);
                        }
                        for (int var35 = 0; var35 < var25; var35++) {
                            var33 -= (int) ((long) field379[var26 - var35 - 1] * (long) class55.field1418[1][var35] >> 16);
                        }
                        field379[var26] = var33;
                        var23 = this.field369.method602(arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var29 = 0;
                            for (int var30 = var24 + var26 - arg0; var30 < var24; var30++) {
                                var29 += (int) ((long) field379[var24 + var26 - var30 - 1] * (long) class55.field1418[0][var30] >> 16);
                            }
                            for (int var31 = 0; var31 < var25; var31++) {
                                var29 -= (int) ((long) field379[var26 - var31 - 1] * (long) class55.field1418[1][var31] >> 16);
                            }
                            field379[var26] = var29;
                            this.field369.method602(arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field380.method465(0, (float) var23 / 65536.0F);
                    var25 = this.field380.method465(1, (float) var23 / 65536.0F);
                    var28 += 128;
                }
            }
        }
        for (int var39 = 0; var39 < arg0; var39++) {
            if (field379[var39] < -32768) {
                field379[var39] = -32768;
            }
            if (field379[var39] > 32767) {
                field379[var39] = 32767;
            }
        }
        return field379;
    }
}
