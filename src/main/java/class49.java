import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class49 {

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "[I")
    private int[] field624 = new int[5];

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "[I")
    private int[] field632 = new int[5];

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "[I")
    private int[] field626 = new int[5];

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public int field621 = 500;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
    public int field639 = 0;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    private int field638 = 100;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    private int field623 = 0;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "[I")
    private static int[] field625 = new int[32768];

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "[I")
    private static int[] field622;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "[I")
    private static int[] field636;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "[I")
    private static int[] field640;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "[I")
    private static int[] field641;

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "[I")
    private static int[] field642;

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "[I")
    private static int[] field643;

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "[I")
    private static int[] field644;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "Lbd;")
    private class26 field627;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "Llf;")
    private class87 field620;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Llf;")
    private class87 field628;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "Llf;")
    private class87 field629;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "Llf;")
    private class87 field630;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "Llf;")
    private class87 field631;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "Llf;")
    private class87 field633;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "Llf;")
    private class87 field634;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "Llf;")
    private class87 field635;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "Llf;")
    private class87 field637;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lpd;)V")
    public final void method279(class96 arg0) {
        this.field630 = new class87();
        this.field630.method476(arg0);
        this.field633 = new class87();
        this.field633.method476(arg0);
        int var2 = arg0.method584(255);
        if (var2 != 0) {
            arg0.field1228--;
            this.field629 = new class87();
            this.field629.method476(arg0);
            this.field628 = new class87();
            this.field628.method476(arg0);
        }
        int var3 = arg0.method584(255);
        if (var3 != 0) {
            arg0.field1228--;
            this.field635 = new class87();
            this.field635.method476(arg0);
            this.field631 = new class87();
            this.field631.method476(arg0);
        }
        int var4 = arg0.method584(255);
        if (var4 != 0) {
            arg0.field1228--;
            this.field637 = new class87();
            this.field637.method476(arg0);
            this.field634 = new class87();
            this.field634.method476(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method539(-401085592);
            if (var6 == 0) {
                break;
            }
            this.field624[var5] = var6;
            this.field632[var5] = arg0.method565(-96);
            this.field626[var5] = arg0.method539(-401085592);
        }
        this.field623 = arg0.method539(-401085592);
        this.field638 = arg0.method539(-401085592);
        this.field621 = arg0.method549(255);
        this.field639 = arg0.method549(255);
        this.field627 = new class26();
        this.field620 = new class87();
        this.field627.method149(arg0, this.field620);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)I")
    private final int method280(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field622[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field625[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)[I")
    public final int[] method281(int arg0, int arg1) {
        class72.method406(field636, 0, arg0);
        if (arg1 < 10) {
            return field636;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field630.method474();
        this.field633.method474();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field629 != null) {
            this.field629.method474();
            this.field628.method474();
            var5 = (int) ((double) (this.field629.field1069 - this.field629.field1067) * 32.768D / var3);
            var6 = (int) ((double) this.field629.field1067 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field635 != null) {
            this.field635.method474();
            this.field631.method474();
            var8 = (int) ((double) (this.field635.field1069 - this.field635.field1067) * 32.768D / var3);
            var9 = (int) ((double) this.field635.field1067 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field624[var11] != 0) {
                field641[var11] = 0;
                field640[var11] = (int) ((double) this.field626[var11] * var3);
                field643[var11] = (this.field624[var11] << 14) / 100;
                field644[var11] = (int) ((double) (this.field630.field1069 - this.field630.field1067) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field632[var11]) / var3);
                field642[var11] = (int) ((double) this.field630.field1067 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field630.method473(arg0);
            int var40 = this.field633.method473(arg0);
            if (this.field629 != null) {
                int var41 = this.field629.method473(arg0);
                int var42 = this.field628.method473(arg0);
                var39 += this.method280(var7, var42, this.field629.field1065) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field635 != null) {
                int var43 = this.field635.method473(arg0);
                int var44 = this.field631.method473(arg0);
                var40 = var40 * ((this.method280(var10, var44, this.field635.field1065) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field624[var45] != 0) {
                    int var46 = field640[var45] + var12;
                    if (var46 < arg0) {
                        field636[var46] += this.method280(field641[var45], field643[var45] * var40 >> 15, this.field630.field1065);
                        field641[var45] += (field644[var45] * var39 >> 16) + field642[var45];
                    }
                }
            }
        }
        if (this.field637 != null) {
            this.field637.method474();
            this.field634.method474();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field637.method473(arg0);
                int var18 = this.field634.method473(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field637.field1069 - this.field637.field1067) * var17 >> 8) + this.field637.field1067;
                } else {
                    var19 = ((this.field637.field1069 - this.field637.field1067) * var18 >> 8) + this.field637.field1067;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field636[var16] = 0;
                }
            }
        }
        if (this.field623 > 0 && this.field638 > 0) {
            int var20 = (int) ((double) this.field623 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field636[var21] += field636[var21 - var20] * this.field638 / 100;
            }
        }
        if (this.field627.field354[0] > 0 || this.field627.field354[1] > 0) {
            this.field620.method474();
            int var22 = this.field620.method473(arg0 + 1);
            int var23 = this.field627.method148(0, (float) var22 / 65536.0F);
            int var24 = this.field627.method148(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field636[var23 + var25] * (long) class26.field352 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field636[var23 + var25 - var36 - 1] * (long) class26.field355[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field636[var25 - var37 - 1] * (long) class26.field355[1][var37] >> 16);
                    }
                    field636[var25] = var35;
                    var22 = this.field620.method473(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field636[var23 + var25] * (long) class26.field352 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field636[var23 + var25 - var33 - 1] * (long) class26.field355[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field636[var25 - var34 - 1] * (long) class26.field355[1][var34] >> 16);
                        }
                        field636[var25] = var32;
                        var22 = this.field620.method473(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field636[var23 + var25 - var29 - 1] * (long) class26.field355[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field636[var25 - var30 - 1] * (long) class26.field355[1][var30] >> 16);
                            }
                            field636[var25] = var28;
                            this.field620.method473(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field627.method148(0, (float) var22 / 65536.0F);
                    var24 = this.field627.method148(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field636[var38] < -32768) {
                field636[var38] = -32768;
            }
            if (field636[var38] > 32767) {
                field636[var38] = 32767;
            }
        }
        return field636;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "()V")
    public static void method282() {
        field636 = null;
        field625 = null;
        field622 = null;
        field641 = null;
        field640 = null;
        field643 = null;
        field644 = null;
        field642 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field625[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field622 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field622[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field636 = new int[220500];
        field640 = new int[5];
        field641 = new int[5];
        field642 = new int[5];
        field643 = new int[5];
        field644 = new int[5];
    }
}
