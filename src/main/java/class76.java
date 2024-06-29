import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class76 {

    @OriginalMember(owner = "client!fca", name = "g", descriptor = "I")
    private int field952 = 0;

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "I")
    public int field947 = 500;

    @OriginalMember(owner = "client!fca", name = "l", descriptor = "[I")
    private int[] field957 = new int[5];

    @OriginalMember(owner = "client!fca", name = "n", descriptor = "I")
    public int field959 = 0;

    @OriginalMember(owner = "client!fca", name = "s", descriptor = "[I")
    private int[] field964 = new int[5];

    @OriginalMember(owner = "client!fca", name = "d", descriptor = "I")
    private int field949 = 100;

    @OriginalMember(owner = "client!fca", name = "i", descriptor = "[I")
    private int[] field954 = new int[5];

    @OriginalMember(owner = "client!fca", name = "f", descriptor = "[I")
    private static int[] field951 = new int[32768];

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "[I")
    private static int[] field948;

    @OriginalMember(owner = "client!fca", name = "j", descriptor = "[I")
    private static int[] field955;

    @OriginalMember(owner = "client!fca", name = "r", descriptor = "[I")
    private static int[] field963;

    @OriginalMember(owner = "client!fca", name = "u", descriptor = "[I")
    private static int[] field966;

    @OriginalMember(owner = "client!fca", name = "w", descriptor = "[I")
    private static int[] field968;

    @OriginalMember(owner = "client!fca", name = "t", descriptor = "[I")
    private static int[] field965;

    @OriginalMember(owner = "client!fca", name = "q", descriptor = "[I")
    private static int[] field962;

    @OriginalMember(owner = "client!fca", name = "k", descriptor = "Ljj;")
    private class104 field956;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "Llea;")
    private class569 field946;

    @OriginalMember(owner = "client!fca", name = "e", descriptor = "Llea;")
    private class569 field950;

    @OriginalMember(owner = "client!fca", name = "h", descriptor = "Llea;")
    private class569 field953;

    @OriginalMember(owner = "client!fca", name = "m", descriptor = "Llea;")
    private class569 field958;

    @OriginalMember(owner = "client!fca", name = "o", descriptor = "Llea;")
    private class569 field960;

    @OriginalMember(owner = "client!fca", name = "p", descriptor = "Llea;")
    private class569 field961;

    @OriginalMember(owner = "client!fca", name = "v", descriptor = "Llea;")
    private class569 field967;

    @OriginalMember(owner = "client!fca", name = "x", descriptor = "Llea;")
    private class569 field969;

    @OriginalMember(owner = "client!fca", name = "y", descriptor = "Llea;")
    private class569 field970;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field951[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field948 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field948[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field955 = new int[220500];
        field963 = new int[5];
        field966 = new int[5];
        field968 = new int[5];
        field965 = new int[5];
        field962 = new int[5];
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(III)I", line = 15)
    private final int method754(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field948[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field951[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lie;)V", line = 89)
    public final void method755(class6 arg0) {
        this.field970 = new class569();
        this.field970.method3363(arg0);
        this.field953 = new class569();
        this.field953.method3363(arg0);
        int var2 = arg0.method70(-9059);
        if (var2 != 0) {
            arg0.field57--;
            this.field946 = new class569();
            this.field946.method3363(arg0);
            this.field967 = new class569();
            this.field967.method3363(arg0);
        }
        int var3 = arg0.method70(-9059);
        if (var3 != 0) {
            arg0.field57--;
            this.field961 = new class569();
            this.field961.method3363(arg0);
            this.field950 = new class569();
            this.field950.method3363(arg0);
        }
        int var4 = arg0.method70(-9059);
        if (var4 != 0) {
            arg0.field57--;
            this.field960 = new class569();
            this.field960.method3363(arg0);
            this.field969 = new class569();
            this.field969.method3363(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method88((byte) 90);
            if (var6 == 0) {
                break;
            }
            this.field957[var5] = var6;
            this.field954[var5] = arg0.method40(false);
            this.field964[var5] = arg0.method88((byte) 90);
        }
        this.field952 = arg0.method88((byte) 90);
        this.field949 = arg0.method88((byte) 90);
        this.field947 = arg0.method67(12021);
        this.field959 = arg0.method67(12021);
        this.field956 = new class104();
        this.field958 = new class569();
        this.field956.method995(arg0, this.field958);
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(II)[I", line = 152)
    public final int[] method756(int arg0, int arg1) {
        class398.method2568(field955, 0, arg0);
        if (arg1 < 10) {
            return field955;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field970.method3362();
        this.field953.method3362();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field946 != null) {
            this.field946.method3362();
            this.field967.method3362();
            var5 = (int) ((double) (this.field946.field8150 - this.field946.field8148) * 32.768D / var3);
            var6 = (int) ((double) this.field946.field8148 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field961 != null) {
            this.field961.method3362();
            this.field950.method3362();
            var8 = (int) ((double) (this.field961.field8150 - this.field961.field8148) * 32.768D / var3);
            var9 = (int) ((double) this.field961.field8148 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field957[var11] != 0) {
                field968[var11] = 0;
                field965[var11] = (int) ((double) this.field964[var11] * var3);
                field963[var11] = (this.field957[var11] << 14) / 100;
                field966[var11] = (int) ((double) (this.field970.field8150 - this.field970.field8148) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field954[var11]) / var3);
                field962[var11] = (int) ((double) this.field970.field8148 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field970.method3360(arg0);
            int var40 = this.field953.method3360(arg0);
            if (this.field946 != null) {
                int var41 = this.field946.method3360(arg0);
                int var42 = this.field967.method3360(arg0);
                var39 += this.method754(var7, var42, this.field946.field8149) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field961 != null) {
                int var43 = this.field961.method3360(arg0);
                int var44 = this.field950.method3360(arg0);
                var40 = var40 * ((this.method754(var10, var44, this.field961.field8149) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field957[var45] != 0) {
                    int var46 = field965[var45] + var12;
                    if (var46 < arg0) {
                        field955[var46] += this.method754(field968[var45], field963[var45] * var40 >> 15, this.field970.field8149);
                        field968[var45] += (field966[var45] * var39 >> 16) + field962[var45];
                    }
                }
            }
        }
        if (this.field960 != null) {
            this.field960.method3362();
            this.field969.method3362();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field960.method3360(arg0);
                int var18 = this.field969.method3360(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field960.field8150 - this.field960.field8148) * var17 >> 8) + this.field960.field8148;
                } else {
                    var19 = ((this.field960.field8150 - this.field960.field8148) * var18 >> 8) + this.field960.field8148;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field955[var16] = 0;
                }
            }
        }
        if (this.field952 > 0 && this.field949 > 0) {
            int var20 = (int) ((double) this.field952 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field955[var21] += field955[var21 - var20] * this.field949 / 100;
            }
        }
        if (this.field956.field1700[0] > 0 || this.field956.field1700[1] > 0) {
            this.field958.method3362();
            int var22 = this.field958.method3360(arg0 + 1);
            int var23 = this.field956.method992(0, (float) var22 / 65536.0F);
            int var24 = this.field956.method992(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field955[var23 + var25] * (long) class104.field1699 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field955[var23 + var25 - var36 - 1] * (long) class104.field1697[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field955[var25 - var37 - 1] * (long) class104.field1697[1][var37] >> 16);
                    }
                    field955[var25] = var35;
                    var22 = this.field958.method3360(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field955[var23 + var25] * (long) class104.field1699 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field955[var23 + var25 - var33 - 1] * (long) class104.field1697[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field955[var25 - var34 - 1] * (long) class104.field1697[1][var34] >> 16);
                        }
                        field955[var25] = var32;
                        var22 = this.field958.method3360(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field955[var23 + var25 - var29 - 1] * (long) class104.field1697[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field955[var25 - var30 - 1] * (long) class104.field1697[1][var30] >> 16);
                            }
                            field955[var25] = var28;
                            this.field958.method3360(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field956.method992(0, (float) var22 / 65536.0F);
                    var24 = this.field956.method992(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field955[var38] < -32768) {
                field955[var38] = -32768;
            }
            if (field955[var38] > 32767) {
                field955[var38] = 32767;
            }
        }
        return field955;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "()V", line = 459)
    public static void method757() {
        field955 = null;
        field951 = null;
        field948 = null;
        field968 = null;
        field965 = null;
        field963 = null;
        field966 = null;
        field962 = null;
    }
}
