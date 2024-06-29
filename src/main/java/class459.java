import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class459 {

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    private int field7067 = 0;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "[I")
    private int[] field7064 = new int[5];

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    private int field7059 = 100;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "[I")
    private int[] field7073 = new int[5];

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    public int field7070 = 0;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "[I")
    private int[] field7066 = new int[5];

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public int field7056 = 500;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "[I")
    private static int[] field7055 = new int[32768];

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "[I")
    private static int[] field7057;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "[I")
    private static int[] field7072;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "[I")
    private static int[] field7079;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "[I")
    private static int[] field7078;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "[I")
    private static int[] field7077;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "[I")
    private static int[] field7074;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "[I")
    private static int[] field7075;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "Lpq;")
    private class122 field7058;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "Lpq;")
    private class122 field7061;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "Lpq;")
    private class122 field7062;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "Lpq;")
    private class122 field7063;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "Lpq;")
    private class122 field7065;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "Lpq;")
    private class122 field7068;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "Lpq;")
    private class122 field7069;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "Lpq;")
    private class122 field7071;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "Lpq;")
    private class122 field7076;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "Lwh;")
    private class95 field7060;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)I")
    private final int method2745(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field7057[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field7055[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lha;)V")
    public final void method2746(class40 arg0) {
        this.field7062 = new class122();
        this.field7062.method846(arg0);
        this.field7061 = new class122();
        this.field7061.method846(arg0);
        int var2 = arg0.method257((byte) 35);
        if (var2 != 0) {
            arg0.field585--;
            this.field7071 = new class122();
            this.field7071.method846(arg0);
            this.field7076 = new class122();
            this.field7076.method846(arg0);
        }
        int var3 = arg0.method257((byte) 127);
        if (var3 != 0) {
            arg0.field585--;
            this.field7063 = new class122();
            this.field7063.method846(arg0);
            this.field7065 = new class122();
            this.field7065.method846(arg0);
        }
        int var4 = arg0.method257((byte) 22);
        if (var4 != 0) {
            arg0.field585--;
            this.field7068 = new class122();
            this.field7068.method846(arg0);
            this.field7058 = new class122();
            this.field7058.method846(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method236(true);
            if (var6 == 0) {
                break;
            }
            this.field7066[var5] = var6;
            this.field7064[var5] = arg0.method271(255);
            this.field7073[var5] = arg0.method236(true);
        }
        this.field7067 = arg0.method236(true);
        this.field7059 = arg0.method236(true);
        this.field7056 = arg0.method254((byte) -90);
        this.field7070 = arg0.method254((byte) -55);
        this.field7060 = new class95();
        this.field7069 = new class122();
        this.field7060.method708(arg0, this.field7069);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)[I")
    public final int[] method2747(int arg0, int arg1) {
        class356.method2180(field7072, 0, arg0);
        if (arg1 < 10) {
            return field7072;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field7062.method844();
        this.field7061.method844();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field7071 != null) {
            this.field7071.method844();
            this.field7076.method844();
            var5 = (int) ((double) (this.field7071.field2021 - this.field7071.field2018) * 32.768D / var3);
            var6 = (int) ((double) this.field7071.field2018 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field7063 != null) {
            this.field7063.method844();
            this.field7065.method844();
            var8 = (int) ((double) (this.field7063.field2021 - this.field7063.field2018) * 32.768D / var3);
            var9 = (int) ((double) this.field7063.field2018 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field7066[var11] != 0) {
                field7078[var11] = 0;
                field7079[var11] = (int) ((double) this.field7073[var11] * var3);
                field7074[var11] = (this.field7066[var11] << 14) / 100;
                field7077[var11] = (int) ((double) (this.field7062.field2021 - this.field7062.field2018) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field7064[var11]) / var3);
                field7075[var11] = (int) ((double) this.field7062.field2018 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field7062.method845(arg0);
            int var40 = this.field7061.method845(arg0);
            if (this.field7071 != null) {
                int var41 = this.field7071.method845(arg0);
                int var42 = this.field7076.method845(arg0);
                var39 += this.method2745(var7, var42, this.field7071.field2020) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field7063 != null) {
                int var43 = this.field7063.method845(arg0);
                int var44 = this.field7065.method845(arg0);
                var40 = var40 * ((this.method2745(var10, var44, this.field7063.field2020) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field7066[var45] != 0) {
                    int var46 = field7079[var45] + var12;
                    if (var46 < arg0) {
                        field7072[var46] += this.method2745(field7078[var45], field7074[var45] * var40 >> 15, this.field7062.field2020);
                        field7078[var45] += (field7077[var45] * var39 >> 16) + field7075[var45];
                    }
                }
            }
        }
        if (this.field7068 != null) {
            this.field7068.method844();
            this.field7058.method844();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field7068.method845(arg0);
                int var18 = this.field7058.method845(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field7068.field2021 - this.field7068.field2018) * var17 >> 8) + this.field7068.field2018;
                } else {
                    var19 = ((this.field7068.field2021 - this.field7068.field2018) * var18 >> 8) + this.field7068.field2018;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field7072[var16] = 0;
                }
            }
        }
        if (this.field7067 > 0 && this.field7059 > 0) {
            int var20 = (int) ((double) this.field7067 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field7072[var21] += field7072[var21 - var20] * this.field7059 / 100;
            }
        }
        if (this.field7060.field1699[0] > 0 || this.field7060.field1699[1] > 0) {
            this.field7069.method844();
            int var22 = this.field7069.method845(arg0 + 1);
            int var23 = this.field7060.method709(0, (float) var22 / 65536.0F);
            int var24 = this.field7060.method709(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field7072[var23 + var25] * (long) class95.field1698 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field7072[var23 + var25 - var36 - 1] * (long) class95.field1697[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field7072[var25 - var37 - 1] * (long) class95.field1697[1][var37] >> 16);
                    }
                    field7072[var25] = var35;
                    var22 = this.field7069.method845(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field7072[var23 + var25] * (long) class95.field1698 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field7072[var23 + var25 - var33 - 1] * (long) class95.field1697[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field7072[var25 - var34 - 1] * (long) class95.field1697[1][var34] >> 16);
                        }
                        field7072[var25] = var32;
                        var22 = this.field7069.method845(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field7072[var23 + var25 - var29 - 1] * (long) class95.field1697[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field7072[var25 - var30 - 1] * (long) class95.field1697[1][var30] >> 16);
                            }
                            field7072[var25] = var28;
                            this.field7069.method845(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field7060.method709(0, (float) var22 / 65536.0F);
                    var24 = this.field7060.method709(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field7072[var38] < -32768) {
                field7072[var38] = -32768;
            }
            if (field7072[var38] > 32767) {
                field7072[var38] = 32767;
            }
        }
        return field7072;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "()V")
    public static void method2748() {
        field7072 = null;
        field7055 = null;
        field7057 = null;
        field7078 = null;
        field7079 = null;
        field7074 = null;
        field7077 = null;
        field7075 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field7055[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field7057 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field7057[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field7072 = new int[220500];
        field7079 = new int[5];
        field7078 = new int[5];
        field7077 = new int[5];
        field7074 = new int[5];
        field7075 = new int[5];
    }
}
