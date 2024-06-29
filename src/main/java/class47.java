import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class47 {

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public int field705 = 500;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    private int field701 = 0;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "[I")
    private int[] field708 = new int[5];

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "[I")
    private int[] field714 = new int[5];

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
    private int field715 = 100;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
    public int field718 = 0;

    @OriginalMember(owner = "client!qh", name = "x", descriptor = "[I")
    private int[] field724 = new int[5];

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "[I")
    private static int[] field703 = new int[32768];

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "[I")
    private static int[] field707;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "[I")
    private static int[] field704;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "[I")
    private static int[] field716;

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "[I")
    private static int[] field720;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "[I")
    private static int[] field719;

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "[I")
    private static int[] field722;

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "[I")
    private static int[] field721;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "Lgo;")
    private class425 field702;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "Lgo;")
    private class425 field706;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "Lgo;")
    private class425 field709;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "Lgo;")
    private class425 field710;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "Lgo;")
    private class425 field711;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "Lgo;")
    private class425 field712;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "Lgo;")
    private class425 field713;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "Lgo;")
    private class425 field717;

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "Lgo;")
    private class425 field725;

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "Lql;")
    private class496 field723;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "()V")
    public static void method354() {
        field704 = null;
        field703 = null;
        field707 = null;
        field716 = null;
        field722 = null;
        field720 = null;
        field719 = null;
        field721 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)I")
    private final int method355(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field707[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field703[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lae;)V")
    public final void method356(class156 arg0) {
        this.field712 = new class425();
        this.field712.method2541(arg0);
        this.field717 = new class425();
        this.field717.method2541(arg0);
        int var2 = arg0.method941((byte) 124);
        if (var2 != 0) {
            arg0.field2018--;
            this.field711 = new class425();
            this.field711.method2541(arg0);
            this.field713 = new class425();
            this.field713.method2541(arg0);
        }
        int var3 = arg0.method941((byte) 127);
        if (var3 != 0) {
            arg0.field2018--;
            this.field709 = new class425();
            this.field709.method2541(arg0);
            this.field725 = new class425();
            this.field725.method2541(arg0);
        }
        int var4 = arg0.method941((byte) 125);
        if (var4 != 0) {
            arg0.field2018--;
            this.field710 = new class425();
            this.field710.method2541(arg0);
            this.field706 = new class425();
            this.field706.method2541(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method953((byte) -40);
            if (var6 == 0) {
                break;
            }
            this.field724[var5] = var6;
            this.field714[var5] = arg0.method979((byte) 126);
            this.field708[var5] = arg0.method953((byte) -40);
        }
        this.field701 = arg0.method953((byte) -40);
        this.field715 = arg0.method953((byte) -40);
        this.field705 = arg0.method993((byte) -58);
        this.field718 = arg0.method993((byte) -34);
        this.field723 = new class496();
        this.field702 = new class425();
        this.field723.method2978(arg0, this.field702);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)[I")
    public final int[] method357(int arg0, int arg1) {
        class268.method1640(field704, 0, arg0);
        if (arg1 < 10) {
            return field704;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field712.method2539();
        this.field717.method2539();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field711 != null) {
            this.field711.method2539();
            this.field713.method2539();
            var5 = (int) ((double) (this.field711.field6274 - this.field711.field6278) * 32.768D / var3);
            var6 = (int) ((double) this.field711.field6278 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field709 != null) {
            this.field709.method2539();
            this.field725.method2539();
            var8 = (int) ((double) (this.field709.field6274 - this.field709.field6278) * 32.768D / var3);
            var9 = (int) ((double) this.field709.field6278 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field724[var11] != 0) {
                field716[var11] = 0;
                field722[var11] = (int) ((double) this.field708[var11] * var3);
                field720[var11] = (this.field724[var11] << 14) / 100;
                field719[var11] = (int) ((double) (this.field712.field6274 - this.field712.field6278) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field714[var11]) / var3);
                field721[var11] = (int) ((double) this.field712.field6278 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field712.method2540(arg0);
            int var40 = this.field717.method2540(arg0);
            if (this.field711 != null) {
                int var41 = this.field711.method2540(arg0);
                int var42 = this.field713.method2540(arg0);
                var39 += this.method355(var7, var42, this.field711.field6279) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field709 != null) {
                int var43 = this.field709.method2540(arg0);
                int var44 = this.field725.method2540(arg0);
                var40 = var40 * ((this.method355(var10, var44, this.field709.field6279) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field724[var45] != 0) {
                    int var46 = field722[var45] + var12;
                    if (var46 < arg0) {
                        field704[var46] += this.method355(field716[var45], field720[var45] * var40 >> 15, this.field712.field6279);
                        field716[var45] += (field719[var45] * var39 >> 16) + field721[var45];
                    }
                }
            }
        }
        if (this.field710 != null) {
            this.field710.method2539();
            this.field706.method2539();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field710.method2540(arg0);
                int var18 = this.field706.method2540(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field710.field6274 - this.field710.field6278) * var17 >> 8) + this.field710.field6278;
                } else {
                    var19 = ((this.field710.field6274 - this.field710.field6278) * var18 >> 8) + this.field710.field6278;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field704[var16] = 0;
                }
            }
        }
        if (this.field701 > 0 && this.field715 > 0) {
            int var20 = (int) ((double) this.field701 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field704[var21] += field704[var21 - var20] * this.field715 / 100;
            }
        }
        if (this.field723.field7551[0] > 0 || this.field723.field7551[1] > 0) {
            this.field702.method2539();
            int var22 = this.field702.method2540(arg0 + 1);
            int var23 = this.field723.method2981(0, (float) var22 / 65536.0F);
            int var24 = this.field723.method2981(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field704[var23 + var25] * (long) class496.field7553 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field704[var23 + var25 - var36 - 1] * (long) class496.field7555[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field704[var25 - var37 - 1] * (long) class496.field7555[1][var37] >> 16);
                    }
                    field704[var25] = var35;
                    var22 = this.field702.method2540(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field704[var23 + var25] * (long) class496.field7553 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field704[var23 + var25 - var33 - 1] * (long) class496.field7555[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field704[var25 - var34 - 1] * (long) class496.field7555[1][var34] >> 16);
                        }
                        field704[var25] = var32;
                        var22 = this.field702.method2540(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field704[var23 + var25 - var29 - 1] * (long) class496.field7555[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field704[var25 - var30 - 1] * (long) class496.field7555[1][var30] >> 16);
                            }
                            field704[var25] = var28;
                            this.field702.method2540(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field723.method2981(0, (float) var22 / 65536.0F);
                    var24 = this.field723.method2981(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field704[var38] < -32768) {
                field704[var38] = -32768;
            }
            if (field704[var38] > 32767) {
                field704[var38] = 32767;
            }
        }
        return field704;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field703[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field707 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field707[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field704 = new int[220500];
        field716 = new int[5];
        field720 = new int[5];
        field719 = new int[5];
        field722 = new int[5];
        field721 = new int[5];
    }
}
