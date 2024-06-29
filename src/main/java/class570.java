import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class570 {

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "[I")
    private int[] field8033 = new int[5];

    @OriginalMember(owner = "client!kga", name = "e", descriptor = "[I")
    private int[] field8036 = new int[5];

    @OriginalMember(owner = "client!kga", name = "f", descriptor = "I")
    private int field8037 = 0;

    @OriginalMember(owner = "client!kga", name = "q", descriptor = "I")
    private int field8048 = 100;

    @OriginalMember(owner = "client!kga", name = "m", descriptor = "I")
    public int field8044 = 500;

    @OriginalMember(owner = "client!kga", name = "l", descriptor = "I")
    public int field8043 = 0;

    @OriginalMember(owner = "client!kga", name = "n", descriptor = "[I")
    private int[] field8045 = new int[5];

    @OriginalMember(owner = "client!kga", name = "p", descriptor = "[I")
    private static int[] field8047 = new int[32768];

    @OriginalMember(owner = "client!kga", name = "j", descriptor = "[I")
    private static int[] field8041;

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "[I")
    private static int[] field8035;

    @OriginalMember(owner = "client!kga", name = "u", descriptor = "[I")
    private static int[] field8052;

    @OriginalMember(owner = "client!kga", name = "w", descriptor = "[I")
    private static int[] field8054;

    @OriginalMember(owner = "client!kga", name = "v", descriptor = "[I")
    private static int[] field8053;

    @OriginalMember(owner = "client!kga", name = "y", descriptor = "[I")
    private static int[] field8056;

    @OriginalMember(owner = "client!kga", name = "x", descriptor = "[I")
    private static int[] field8055;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "Lkba;")
    private class113 field8032;

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "Lkba;")
    private class113 field8034;

    @OriginalMember(owner = "client!kga", name = "g", descriptor = "Lkba;")
    private class113 field8038;

    @OriginalMember(owner = "client!kga", name = "h", descriptor = "Lkba;")
    private class113 field8039;

    @OriginalMember(owner = "client!kga", name = "i", descriptor = "Lkba;")
    private class113 field8040;

    @OriginalMember(owner = "client!kga", name = "k", descriptor = "Lkba;")
    private class113 field8042;

    @OriginalMember(owner = "client!kga", name = "o", descriptor = "Lkba;")
    private class113 field8046;

    @OriginalMember(owner = "client!kga", name = "s", descriptor = "Lkba;")
    private class113 field8050;

    @OriginalMember(owner = "client!kga", name = "t", descriptor = "Lkba;")
    private class113 field8051;

    @OriginalMember(owner = "client!kga", name = "r", descriptor = "Ldi;")
    private class136 field8049;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field8047[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field8041 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field8041[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field8035 = new int[220500];
        field8052 = new int[5];
        field8054 = new int[5];
        field8053 = new int[5];
        field8056 = new int[5];
        field8055 = new int[5];
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(III)I", line = 3)
    private final int method3354(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field8041[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field8047[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lso;)V", line = 26)
    public final void method3355(class494 arg0) {
        this.field8042 = new class113();
        this.field8042.method854(arg0);
        this.field8050 = new class113();
        this.field8050.method854(arg0);
        int var2 = arg0.method2964((byte) 45);
        if (var2 != 0) {
            arg0.field7042--;
            this.field8040 = new class113();
            this.field8040.method854(arg0);
            this.field8034 = new class113();
            this.field8034.method854(arg0);
        }
        int var3 = arg0.method2964((byte) 86);
        if (var3 != 0) {
            arg0.field7042--;
            this.field8038 = new class113();
            this.field8038.method854(arg0);
            this.field8032 = new class113();
            this.field8032.method854(arg0);
        }
        int var4 = arg0.method2964((byte) 60);
        if (var4 != 0) {
            arg0.field7042--;
            this.field8046 = new class113();
            this.field8046.method854(arg0);
            this.field8051 = new class113();
            this.field8051.method854(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2993(-104);
            if (var6 == 0) {
                break;
            }
            this.field8033[var5] = var6;
            this.field8045[var5] = arg0.method2979((byte) -100);
            this.field8036[var5] = arg0.method2993(-118);
        }
        this.field8037 = arg0.method2993(99);
        this.field8048 = arg0.method2993(-105);
        this.field8044 = arg0.method2998(true);
        this.field8043 = arg0.method2998(true);
        this.field8049 = new class136();
        this.field8039 = new class113();
        this.field8049.method998(arg0, this.field8039);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(II)[I", line = 97)
    public final int[] method3356(int arg0, int arg1) {
        class595.method3471(field8035, 0, arg0);
        if (arg1 < 10) {
            return field8035;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field8042.method853();
        this.field8050.method853();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field8040 != null) {
            this.field8040.method853();
            this.field8034.method853();
            var5 = (int) ((double) (this.field8040.field1722 - this.field8040.field1721) * 32.768D / var3);
            var6 = (int) ((double) this.field8040.field1721 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field8038 != null) {
            this.field8038.method853();
            this.field8032.method853();
            var8 = (int) ((double) (this.field8038.field1722 - this.field8038.field1721) * 32.768D / var3);
            var9 = (int) ((double) this.field8038.field1721 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field8033[var11] != 0) {
                field8054[var11] = 0;
                field8055[var11] = (int) ((double) this.field8036[var11] * var3);
                field8056[var11] = (this.field8033[var11] << 14) / 100;
                field8053[var11] = (int) ((double) (this.field8042.field1722 - this.field8042.field1721) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field8045[var11]) / var3);
                field8052[var11] = (int) ((double) this.field8042.field1721 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field8042.method855(arg0);
            int var40 = this.field8050.method855(arg0);
            if (this.field8040 != null) {
                int var41 = this.field8040.method855(arg0);
                int var42 = this.field8034.method855(arg0);
                var39 += this.method3354(var7, var42, this.field8040.field1720) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field8038 != null) {
                int var43 = this.field8038.method855(arg0);
                int var44 = this.field8032.method855(arg0);
                var40 = var40 * ((this.method3354(var10, var44, this.field8038.field1720) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field8033[var45] != 0) {
                    int var46 = field8055[var45] + var12;
                    if (var46 < arg0) {
                        field8035[var46] += this.method3354(field8054[var45], field8056[var45] * var40 >> 15, this.field8042.field1720);
                        field8054[var45] += (field8053[var45] * var39 >> 16) + field8052[var45];
                    }
                }
            }
        }
        if (this.field8046 != null) {
            this.field8046.method853();
            this.field8051.method853();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field8046.method855(arg0);
                int var18 = this.field8051.method855(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field8046.field1722 - this.field8046.field1721) * var17 >> 8) + this.field8046.field1721;
                } else {
                    var19 = ((this.field8046.field1722 - this.field8046.field1721) * var18 >> 8) + this.field8046.field1721;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field8035[var16] = 0;
                }
            }
        }
        if (this.field8037 > 0 && this.field8048 > 0) {
            int var20 = (int) ((double) this.field8037 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field8035[var21] += field8035[var21 - var20] * this.field8048 / 100;
            }
        }
        if (this.field8049.field2048[0] > 0 || this.field8049.field2048[1] > 0) {
            this.field8039.method853();
            int var22 = this.field8039.method855(arg0 + 1);
            int var23 = this.field8049.method1001(0, (float) var22 / 65536.0F);
            int var24 = this.field8049.method1001(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field8035[var23 + var25] * (long) class136.field2047 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field8035[var23 + var25 - var36 - 1] * (long) class136.field2043[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field8035[var25 - var37 - 1] * (long) class136.field2043[1][var37] >> 16);
                    }
                    field8035[var25] = var35;
                    var22 = this.field8039.method855(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field8035[var23 + var25] * (long) class136.field2047 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field8035[var23 + var25 - var33 - 1] * (long) class136.field2043[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field8035[var25 - var34 - 1] * (long) class136.field2043[1][var34] >> 16);
                        }
                        field8035[var25] = var32;
                        var22 = this.field8039.method855(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field8035[var23 + var25 - var29 - 1] * (long) class136.field2043[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field8035[var25 - var30 - 1] * (long) class136.field2043[1][var30] >> 16);
                            }
                            field8035[var25] = var28;
                            this.field8039.method855(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field8049.method1001(0, (float) var22 / 65536.0F);
                    var24 = this.field8049.method1001(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field8035[var38] < -32768) {
                field8035[var38] = -32768;
            }
            if (field8035[var38] > 32767) {
                field8035[var38] = 32767;
            }
        }
        return field8035;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "()V", line = 405)
    public static void method3357() {
        field8035 = null;
        field8047 = null;
        field8041 = null;
        field8054 = null;
        field8055 = null;
        field8056 = null;
        field8053 = null;
        field8052 = null;
    }
}
