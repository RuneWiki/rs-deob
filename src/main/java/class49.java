import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class49 {

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
    public int field756 = 0;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "[I")
    private int[] field748 = new int[5];

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
    public int field755 = 500;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
    private int field753 = 0;

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "[I")
    private int[] field759 = new int[5];

    @OriginalMember(owner = "client!tn", name = "o", descriptor = "[I")
    private int[] field760 = new int[5];

    @OriginalMember(owner = "client!tn", name = "s", descriptor = "I")
    private int field764 = 100;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "[I")
    private static int[] field746 = new int[32768];

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "[I")
    private static int[] field750;

    @OriginalMember(owner = "client!tn", name = "q", descriptor = "[I")
    private static int[] field762;

    @OriginalMember(owner = "client!tn", name = "u", descriptor = "[I")
    private static int[] field766;

    @OriginalMember(owner = "client!tn", name = "w", descriptor = "[I")
    private static int[] field768;

    @OriginalMember(owner = "client!tn", name = "v", descriptor = "[I")
    private static int[] field767;

    @OriginalMember(owner = "client!tn", name = "x", descriptor = "[I")
    private static int[] field769;

    @OriginalMember(owner = "client!tn", name = "y", descriptor = "[I")
    private static int[] field770;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "Lgh;")
    private class325 field747;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "Lgh;")
    private class325 field749;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "Lgh;")
    private class325 field751;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "Lgh;")
    private class325 field752;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "Lgh;")
    private class325 field754;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "Lgh;")
    private class325 field757;

    @OriginalMember(owner = "client!tn", name = "p", descriptor = "Lgh;")
    private class325 field761;

    @OriginalMember(owner = "client!tn", name = "r", descriptor = "Lgh;")
    private class325 field763;

    @OriginalMember(owner = "client!tn", name = "t", descriptor = "Lgh;")
    private class325 field765;

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "Lsi;")
    private class332 field758;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)[I")
    public final int[] method343(int arg0, int arg1) {
        class150.method1020(field762, 0, arg0);
        if (arg1 < 10) {
            return field762;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field763.method2045();
        this.field754.method2045();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field747 != null) {
            this.field747.method2045();
            this.field751.method2045();
            var5 = (int) ((double) (this.field747.field4439 - this.field747.field4437) * 32.768D / var3);
            var6 = (int) ((double) this.field747.field4437 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field757 != null) {
            this.field757.method2045();
            this.field749.method2045();
            var8 = (int) ((double) (this.field757.field4439 - this.field757.field4437) * 32.768D / var3);
            var9 = (int) ((double) this.field757.field4437 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field760[var11] != 0) {
                field769[var11] = 0;
                field767[var11] = (int) ((double) this.field748[var11] * var3);
                field766[var11] = (this.field760[var11] << 14) / 100;
                field768[var11] = (int) ((double) (this.field763.field4439 - this.field763.field4437) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field759[var11]) / var3);
                field770[var11] = (int) ((double) this.field763.field4437 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field763.method2048(arg0);
            int var40 = this.field754.method2048(arg0);
            if (this.field747 != null) {
                int var41 = this.field747.method2048(arg0);
                int var42 = this.field751.method2048(arg0);
                var39 += this.method344(var7, var42, this.field747.field4438) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field757 != null) {
                int var43 = this.field757.method2048(arg0);
                int var44 = this.field749.method2048(arg0);
                var40 = var40 * ((this.method344(var10, var44, this.field757.field4438) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field760[var45] != 0) {
                    int var46 = field767[var45] + var12;
                    if (var46 < arg0) {
                        field762[var46] += this.method344(field769[var45], field766[var45] * var40 >> 15, this.field763.field4438);
                        field769[var45] += (field768[var45] * var39 >> 16) + field770[var45];
                    }
                }
            }
        }
        if (this.field761 != null) {
            this.field761.method2045();
            this.field752.method2045();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field761.method2048(arg0);
                int var18 = this.field752.method2048(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field761.field4439 - this.field761.field4437) * var17 >> 8) + this.field761.field4437;
                } else {
                    var19 = ((this.field761.field4439 - this.field761.field4437) * var18 >> 8) + this.field761.field4437;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field762[var16] = 0;
                }
            }
        }
        if (this.field753 > 0 && this.field764 > 0) {
            int var20 = (int) ((double) this.field753 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field762[var21] += field762[var21 - var20] * this.field764 / 100;
            }
        }
        if (this.field758.field4499[0] > 0 || this.field758.field4499[1] > 0) {
            this.field765.method2045();
            int var22 = this.field765.method2048(arg0 + 1);
            int var23 = this.field758.method2064(0, (float) var22 / 65536.0F);
            int var24 = this.field758.method2064(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field762[var23 + var25] * (long) class332.field4497 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field762[var23 + var25 - var36 - 1] * (long) class332.field4498[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field762[var25 - var37 - 1] * (long) class332.field4498[1][var37] >> 16);
                    }
                    field762[var25] = var35;
                    var22 = this.field765.method2048(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field762[var23 + var25] * (long) class332.field4497 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field762[var23 + var25 - var33 - 1] * (long) class332.field4498[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field762[var25 - var34 - 1] * (long) class332.field4498[1][var34] >> 16);
                        }
                        field762[var25] = var32;
                        var22 = this.field765.method2048(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field762[var23 + var25 - var29 - 1] * (long) class332.field4498[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field762[var25 - var30 - 1] * (long) class332.field4498[1][var30] >> 16);
                            }
                            field762[var25] = var28;
                            this.field765.method2048(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field758.method2064(0, (float) var22 / 65536.0F);
                    var24 = this.field758.method2064(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field762[var38] < -32768) {
                field762[var38] = -32768;
            }
            if (field762[var38] > 32767) {
                field762[var38] = 32767;
            }
        }
        return field762;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)I")
    private final int method344(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field750[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field746[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "()V")
    public static void method345() {
        field762 = null;
        field746 = null;
        field750 = null;
        field769 = null;
        field767 = null;
        field766 = null;
        field768 = null;
        field770 = null;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Leb;)V")
    public final void method346(class371 arg0) {
        this.field763 = new class325();
        this.field763.method2046(arg0);
        this.field754 = new class325();
        this.field754.method2046(arg0);
        int var2 = arg0.method2429(0);
        if (var2 != 0) {
            arg0.field5273--;
            this.field747 = new class325();
            this.field747.method2046(arg0);
            this.field751 = new class325();
            this.field751.method2046(arg0);
        }
        int var3 = arg0.method2429(0);
        if (var3 != 0) {
            arg0.field5273--;
            this.field757 = new class325();
            this.field757.method2046(arg0);
            this.field749 = new class325();
            this.field749.method2046(arg0);
        }
        int var4 = arg0.method2429(0);
        if (var4 != 0) {
            arg0.field5273--;
            this.field761 = new class325();
            this.field761.method2046(arg0);
            this.field752 = new class325();
            this.field752.method2046(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2433(-82);
            if (var6 == 0) {
                break;
            }
            this.field760[var5] = var6;
            this.field759[var5] = arg0.method2423((byte) -126);
            this.field748[var5] = arg0.method2433(-73);
        }
        this.field753 = arg0.method2433(-72);
        this.field764 = arg0.method2433(-59);
        this.field755 = arg0.method2403((byte) 71);
        this.field756 = arg0.method2403((byte) 83);
        this.field758 = new class332();
        this.field765 = new class325();
        this.field758.method2065(arg0, this.field765);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field746[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field750 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field750[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field762 = new int[220500];
        field766 = new int[5];
        field768 = new int[5];
        field767 = new int[5];
        field769 = new int[5];
        field770 = new int[5];
    }
}
