import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class21 {

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public int field455 = 500;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    private int field456 = 0;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "[I")
    private int[] field454 = new int[5];

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "[I")
    private int[] field460 = new int[5];

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "[I")
    private int[] field466 = new int[5];

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    private int field448 = 100;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    public int field463 = 0;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "[I")
    private static int[] field447 = new int[32768];

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "[I")
    private static int[] field449;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "[I")
    private static int[] field462;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "[I")
    private static int[] field469;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "[I")
    private static int[] field465;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "[I")
    private static int[] field468;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "[I")
    private static int[] field467;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "[I")
    private static int[] field471;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "Lgb;")
    private class45 field450;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "Lgb;")
    private class45 field451;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "Lgb;")
    private class45 field452;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "Lgb;")
    private class45 field457;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "Lgb;")
    private class45 field458;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "Lgb;")
    private class45 field459;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "Lgb;")
    private class45 field461;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "Lgb;")
    private class45 field464;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "Lgb;")
    private class45 field470;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "Lna;")
    private class91 field453;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ltf;)V")
    public final void method160(class138 arg0) {
        this.field452 = new class45();
        this.field452.method328(arg0);
        this.field450 = new class45();
        this.field450.method328(arg0);
        int var2 = arg0.method1055(122);
        if (var2 != 0) {
            arg0.field3175--;
            this.field470 = new class45();
            this.field470.method328(arg0);
            this.field457 = new class45();
            this.field457.method328(arg0);
        }
        int var3 = arg0.method1055(116);
        if (var3 != 0) {
            arg0.field3175--;
            this.field461 = new class45();
            this.field461.method328(arg0);
            this.field458 = new class45();
            this.field458.method328(arg0);
        }
        int var4 = arg0.method1055(116);
        if (var4 != 0) {
            arg0.field3175--;
            this.field451 = new class45();
            this.field451.method328(arg0);
            this.field459 = new class45();
            this.field459.method328(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1052(-124);
            if (var6 == 0) {
                break;
            }
            this.field466[var5] = var6;
            this.field460[var5] = arg0.method1097((byte) -80);
            this.field454[var5] = arg0.method1052(-106);
        }
        this.field456 = arg0.method1052(-79);
        this.field448 = arg0.method1052(-76);
        this.field455 = arg0.method1098(true);
        this.field463 = arg0.method1098(true);
        this.field453 = new class91();
        this.field464 = new class45();
        this.field453.method639(arg0, this.field464);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)[I")
    public final int[] method161(int arg0, int arg1) {
        class60.method416(field462, 0, arg0);
        if (arg1 < 10) {
            return field462;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field452.method326();
        this.field450.method326();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field470 != null) {
            this.field470.method326();
            this.field457.method326();
            var5 = (int) ((double) (this.field470.field1064 - this.field470.field1067) * 32.768D / var3);
            var6 = (int) ((double) this.field470.field1067 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field461 != null) {
            this.field461.method326();
            this.field458.method326();
            var8 = (int) ((double) (this.field461.field1064 - this.field461.field1067) * 32.768D / var3);
            var9 = (int) ((double) this.field461.field1067 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field466[var11] != 0) {
                field467[var11] = 0;
                field469[var11] = (int) ((double) this.field454[var11] * var3);
                field471[var11] = (this.field466[var11] << 14) / 100;
                field465[var11] = (int) ((double) (this.field452.field1064 - this.field452.field1067) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field460[var11]) / var3);
                field468[var11] = (int) ((double) this.field452.field1067 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field452.method327(arg0);
            int var40 = this.field450.method327(arg0);
            if (this.field470 != null) {
                int var41 = this.field470.method327(arg0);
                int var42 = this.field457.method327(arg0);
                var39 += this.method163(var7, var42, this.field470.field1066) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field461 != null) {
                int var43 = this.field461.method327(arg0);
                int var44 = this.field458.method327(arg0);
                var40 = var40 * ((this.method163(var10, var44, this.field461.field1066) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field466[var45] != 0) {
                    int var46 = field469[var45] + var12;
                    if (var46 < arg0) {
                        field462[var46] += this.method163(field467[var45], field471[var45] * var40 >> 15, this.field452.field1066);
                        field467[var45] += (field465[var45] * var39 >> 16) + field468[var45];
                    }
                }
            }
        }
        if (this.field451 != null) {
            this.field451.method326();
            this.field459.method326();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field451.method327(arg0);
                int var18 = this.field459.method327(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field451.field1064 - this.field451.field1067) * var17 >> 8) + this.field451.field1067;
                } else {
                    var19 = ((this.field451.field1064 - this.field451.field1067) * var18 >> 8) + this.field451.field1067;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field462[var16] = 0;
                }
            }
        }
        if (this.field456 > 0 && this.field448 > 0) {
            int var20 = (int) ((double) this.field456 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field462[var21] += field462[var21 - var20] * this.field448 / 100;
            }
        }
        if (this.field453.field1971[0] > 0 || this.field453.field1971[1] > 0) {
            this.field464.method326();
            int var22 = this.field464.method327(arg0 + 1);
            int var23 = this.field453.method641(0, (float) var22 / 65536.0F);
            int var24 = this.field453.method641(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field462[var23 + var25] * (long) class91.field1973 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field462[var23 + var25 - var36 - 1] * (long) class91.field1976[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field462[var25 - var37 - 1] * (long) class91.field1976[1][var37] >> 16);
                    }
                    field462[var25] = var35;
                    var22 = this.field464.method327(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field462[var23 + var25] * (long) class91.field1973 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field462[var23 + var25 - var33 - 1] * (long) class91.field1976[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field462[var25 - var34 - 1] * (long) class91.field1976[1][var34] >> 16);
                        }
                        field462[var25] = var32;
                        var22 = this.field464.method327(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field462[var23 + var25 - var29 - 1] * (long) class91.field1976[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field462[var25 - var30 - 1] * (long) class91.field1976[1][var30] >> 16);
                            }
                            field462[var25] = var28;
                            this.field464.method327(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field453.method641(0, (float) var22 / 65536.0F);
                    var24 = this.field453.method641(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field462[var38] < -32768) {
                field462[var38] = -32768;
            }
            if (field462[var38] > 32767) {
                field462[var38] = 32767;
            }
        }
        return field462;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "()V")
    public static void method162() {
        field462 = null;
        field447 = null;
        field449 = null;
        field467 = null;
        field469 = null;
        field471 = null;
        field465 = null;
        field468 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)I")
    private final int method163(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field449[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field447[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field447[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field449 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field449[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field462 = new int[220500];
        field469 = new int[5];
        field465 = new int[5];
        field468 = new int[5];
        field467 = new int[5];
        field471 = new int[5];
    }
}
