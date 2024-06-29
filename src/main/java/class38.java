import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class38 {

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    private int field604 = 100;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    private int field609 = 0;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "[I")
    private int[] field611 = new int[5];

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "[I")
    private int[] field608 = new int[5];

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public int field603 = 500;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "[I")
    private int[] field620 = new int[5];

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public int field610 = 0;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "[I")
    private static int[] field613 = new int[32768];

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "[I")
    private static int[] field618;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "[I")
    private static int[] field616;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "[I")
    private static int[] field621;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "[I")
    private static int[] field623;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "[I")
    private static int[] field622;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "[I")
    private static int[] field624;

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "[I")
    private static int[] field625;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "Lhe;")
    private class141 field619;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "Lil;")
    private class3 field601;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "Lil;")
    private class3 field602;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "Lil;")
    private class3 field605;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "Lil;")
    private class3 field606;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "Lil;")
    private class3 field607;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "Lil;")
    private class3 field612;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "Lil;")
    private class3 field614;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "Lil;")
    private class3 field615;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "Lil;")
    private class3 field617;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)I")
    private final int method265(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field618[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field613[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)[I")
    public final int[] method266(int arg0, int arg1) {
        class54.method354(field616, 0, arg0);
        if (arg1 < 10) {
            return field616;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field615.method21();
        this.field605.method21();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field614 != null) {
            this.field614.method21();
            this.field607.method21();
            var5 = (int) ((double) (this.field614.field56 - this.field614.field55) * 32.768D / var3);
            var6 = (int) ((double) this.field614.field55 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field617 != null) {
            this.field617.method21();
            this.field606.method21();
            var8 = (int) ((double) (this.field617.field56 - this.field617.field55) * 32.768D / var3);
            var9 = (int) ((double) this.field617.field55 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field611[var11] != 0) {
                field625[var11] = 0;
                field623[var11] = (int) ((double) this.field608[var11] * var3);
                field622[var11] = (this.field611[var11] << 14) / 100;
                field624[var11] = (int) ((double) (this.field615.field56 - this.field615.field55) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field620[var11]) / var3);
                field621[var11] = (int) ((double) this.field615.field55 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field615.method23(arg0);
            int var40 = this.field605.method23(arg0);
            if (this.field614 != null) {
                int var41 = this.field614.method23(arg0);
                int var42 = this.field607.method23(arg0);
                var39 += this.method265(var7, var42, this.field614.field53) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field617 != null) {
                int var43 = this.field617.method23(arg0);
                int var44 = this.field606.method23(arg0);
                var40 = var40 * ((this.method265(var10, var44, this.field617.field53) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field611[var45] != 0) {
                    int var46 = field623[var45] + var12;
                    if (var46 < arg0) {
                        field616[var46] += this.method265(field625[var45], field622[var45] * var40 >> 15, this.field615.field53);
                        field625[var45] += (field624[var45] * var39 >> 16) + field621[var45];
                    }
                }
            }
        }
        if (this.field602 != null) {
            this.field602.method21();
            this.field601.method21();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field602.method23(arg0);
                int var18 = this.field601.method23(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field602.field56 - this.field602.field55) * var17 >> 8) + this.field602.field55;
                } else {
                    var19 = ((this.field602.field56 - this.field602.field55) * var18 >> 8) + this.field602.field55;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field616[var16] = 0;
                }
            }
        }
        if (this.field609 > 0 && this.field604 > 0) {
            int var20 = (int) ((double) this.field609 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field616[var21] += field616[var21 - var20] * this.field604 / 100;
            }
        }
        if (this.field619.field2421[0] > 0 || this.field619.field2421[1] > 0) {
            this.field612.method21();
            int var22 = this.field612.method23(arg0 + 1);
            int var23 = this.field619.method998(0, (float) var22 / 65536.0F);
            int var24 = this.field619.method998(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field616[var23 + var25] * (long) class141.field2419 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field616[var23 + var25 - var36 - 1] * (long) class141.field2416[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field616[var25 - var37 - 1] * (long) class141.field2416[1][var37] >> 16);
                    }
                    field616[var25] = var35;
                    var22 = this.field612.method23(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field616[var23 + var25] * (long) class141.field2419 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field616[var23 + var25 - var33 - 1] * (long) class141.field2416[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field616[var25 - var34 - 1] * (long) class141.field2416[1][var34] >> 16);
                        }
                        field616[var25] = var32;
                        var22 = this.field612.method23(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field616[var23 + var25 - var29 - 1] * (long) class141.field2416[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field616[var25 - var30 - 1] * (long) class141.field2416[1][var30] >> 16);
                            }
                            field616[var25] = var28;
                            this.field612.method23(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field619.method998(0, (float) var22 / 65536.0F);
                    var24 = this.field619.method998(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field616[var38] < -32768) {
                field616[var38] = -32768;
            }
            if (field616[var38] > 32767) {
                field616[var38] = 32767;
            }
        }
        return field616;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lva;)V")
    public final void method267(class187 arg0) {
        this.field615 = new class3();
        this.field615.method22(arg0);
        this.field605 = new class3();
        this.field605.method22(arg0);
        int var2 = arg0.method1268(255);
        if (var2 != 0) {
            arg0.field3169--;
            this.field614 = new class3();
            this.field614.method22(arg0);
            this.field607 = new class3();
            this.field607.method22(arg0);
        }
        int var3 = arg0.method1268(255);
        if (var3 != 0) {
            arg0.field3169--;
            this.field617 = new class3();
            this.field617.method22(arg0);
            this.field606 = new class3();
            this.field606.method22(arg0);
        }
        int var4 = arg0.method1268(255);
        if (var4 != 0) {
            arg0.field3169--;
            this.field602 = new class3();
            this.field602.method22(arg0);
            this.field601 = new class3();
            this.field601.method22(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1246(true);
            if (var6 == 0) {
                break;
            }
            this.field611[var5] = var6;
            this.field620[var5] = arg0.method1249((byte) -100);
            this.field608[var5] = arg0.method1246(true);
        }
        this.field609 = arg0.method1246(true);
        this.field604 = arg0.method1246(true);
        this.field603 = arg0.method1244(false);
        this.field610 = arg0.method1244(false);
        this.field619 = new class141();
        this.field612 = new class3();
        this.field619.method997(arg0, this.field612);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()V")
    public static void method268() {
        field616 = null;
        field613 = null;
        field618 = null;
        field625 = null;
        field623 = null;
        field622 = null;
        field624 = null;
        field621 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field613[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field618 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field618[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field616 = new int[220500];
        field621 = new int[5];
        field623 = new int[5];
        field622 = new int[5];
        field624 = new int[5];
        field625 = new int[5];
    }
}
