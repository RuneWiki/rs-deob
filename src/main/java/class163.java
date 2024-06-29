import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class163 {

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public int field3099 = 500;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    private int field3098 = 0;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "[I")
    private int[] field3102 = new int[5];

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "[I")
    private int[] field3107 = new int[5];

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public int field3108 = 0;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    private int field3096 = 100;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "[I")
    private int[] field3112 = new int[5];

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "[I")
    private static int[] field3101 = new int[32768];

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "[I")
    private static int[] field3103;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "[I")
    private static int[] field3100;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "[I")
    private static int[] field3114;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "[I")
    private static int[] field3115;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "[I")
    private static int[] field3113;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "[I")
    private static int[] field3117;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "[I")
    private static int[] field3116;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "Luc;")
    private class183 field3093;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "Luc;")
    private class183 field3094;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "Luc;")
    private class183 field3095;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "Luc;")
    private class183 field3097;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "Luc;")
    private class183 field3104;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "Luc;")
    private class183 field3105;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "Luc;")
    private class183 field3106;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "Luc;")
    private class183 field3109;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "Luc;")
    private class183 field3110;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "Ljb;")
    private class83 field3111;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)I")
    private final int method1096(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field3103[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field3101[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "()V")
    public static void method1097() {
        field3100 = null;
        field3101 = null;
        field3103 = null;
        field3117 = null;
        field3113 = null;
        field3116 = null;
        field3114 = null;
        field3115 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)[I")
    public final int[] method1098(int arg0, int arg1) {
        class71.method567(field3100, 0, arg0);
        if (arg1 < 10) {
            return field3100;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field3104.method1237();
        this.field3105.method1237();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field3093 != null) {
            this.field3093.method1237();
            this.field3106.method1237();
            var5 = (int) ((double) (this.field3093.field3464 - this.field3093.field3468) * 32.768D / var3);
            var6 = (int) ((double) this.field3093.field3468 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field3109 != null) {
            this.field3109.method1237();
            this.field3095.method1237();
            var8 = (int) ((double) (this.field3109.field3464 - this.field3109.field3468) * 32.768D / var3);
            var9 = (int) ((double) this.field3109.field3468 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3107[var11] != 0) {
                field3117[var11] = 0;
                field3113[var11] = (int) ((double) this.field3102[var11] * var3);
                field3116[var11] = (this.field3107[var11] << 14) / 100;
                field3114[var11] = (int) ((double) (this.field3104.field3464 - this.field3104.field3468) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field3112[var11]) / var3);
                field3115[var11] = (int) ((double) this.field3104.field3468 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field3104.method1238(arg0);
            int var40 = this.field3105.method1238(arg0);
            if (this.field3093 != null) {
                int var41 = this.field3093.method1238(arg0);
                int var42 = this.field3106.method1238(arg0);
                var39 += this.method1096(var7, var42, this.field3093.field3467) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field3109 != null) {
                int var43 = this.field3109.method1238(arg0);
                int var44 = this.field3095.method1238(arg0);
                var40 = var40 * ((this.method1096(var10, var44, this.field3109.field3467) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field3107[var45] != 0) {
                    int var46 = field3113[var45] + var12;
                    if (var46 < arg0) {
                        field3100[var46] += this.method1096(field3117[var45], field3116[var45] * var40 >> 15, this.field3104.field3467);
                        field3117[var45] += (field3114[var45] * var39 >> 16) + field3115[var45];
                    }
                }
            }
        }
        if (this.field3110 != null) {
            this.field3110.method1237();
            this.field3097.method1237();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field3110.method1238(arg0);
                int var18 = this.field3097.method1238(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field3110.field3464 - this.field3110.field3468) * var17 >> 8) + this.field3110.field3468;
                } else {
                    var19 = ((this.field3110.field3464 - this.field3110.field3468) * var18 >> 8) + this.field3110.field3468;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field3100[var16] = 0;
                }
            }
        }
        if (this.field3098 > 0 && this.field3096 > 0) {
            int var20 = (int) ((double) this.field3098 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field3100[var21] += field3100[var21 - var20] * this.field3096 / 100;
            }
        }
        if (this.field3111.field1677[0] > 0 || this.field3111.field1677[1] > 0) {
            this.field3094.method1237();
            int var22 = this.field3094.method1238(arg0 + 1);
            int var23 = this.field3111.method674(0, (float) var22 / 65536.0F);
            int var24 = this.field3111.method674(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field3100[var23 + var25] * (long) class83.field1681 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field3100[var23 + var25 - var36 - 1] * (long) class83.field1683[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field3100[var25 - var37 - 1] * (long) class83.field1683[1][var37] >> 16);
                    }
                    field3100[var25] = var35;
                    var22 = this.field3094.method1238(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field3100[var23 + var25] * (long) class83.field1681 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field3100[var23 + var25 - var33 - 1] * (long) class83.field1683[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field3100[var25 - var34 - 1] * (long) class83.field1683[1][var34] >> 16);
                        }
                        field3100[var25] = var32;
                        var22 = this.field3094.method1238(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field3100[var23 + var25 - var29 - 1] * (long) class83.field1683[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field3100[var25 - var30 - 1] * (long) class83.field1683[1][var30] >> 16);
                            }
                            field3100[var25] = var28;
                            this.field3094.method1238(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field3111.method674(0, (float) var22 / 65536.0F);
                    var24 = this.field3111.method674(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field3100[var38] < -32768) {
                field3100[var38] = -32768;
            }
            if (field3100[var38] > 32767) {
                field3100[var38] = 32767;
            }
        }
        return field3100;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lff;)V")
    public final void method1099(class53 arg0) {
        this.field3104 = new class183();
        this.field3104.method1236(arg0);
        this.field3105 = new class183();
        this.field3105.method1236(arg0);
        int var2 = arg0.method400(255);
        if (var2 != 0) {
            arg0.field1000--;
            this.field3093 = new class183();
            this.field3093.method1236(arg0);
            this.field3106 = new class183();
            this.field3106.method1236(arg0);
        }
        int var3 = arg0.method400(255);
        if (var3 != 0) {
            arg0.field1000--;
            this.field3109 = new class183();
            this.field3109.method1236(arg0);
            this.field3095 = new class183();
            this.field3095.method1236(arg0);
        }
        int var4 = arg0.method400(255);
        if (var4 != 0) {
            arg0.field1000--;
            this.field3110 = new class183();
            this.field3110.method1236(arg0);
            this.field3097 = new class183();
            this.field3097.method1236(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method425(-21462);
            if (var6 == 0) {
                break;
            }
            this.field3107[var5] = var6;
            this.field3112[var5] = arg0.method412(false);
            this.field3102[var5] = arg0.method425(-21462);
        }
        this.field3098 = arg0.method425(-21462);
        this.field3096 = arg0.method425(-21462);
        this.field3099 = arg0.method405(2);
        this.field3108 = arg0.method405(2);
        this.field3111 = new class83();
        this.field3094 = new class183();
        this.field3111.method675(arg0, this.field3094);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field3101[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field3103 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field3103[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field3100 = new int[220500];
        field3114 = new int[5];
        field3115 = new int[5];
        field3113 = new int[5];
        field3117 = new int[5];
        field3116 = new int[5];
    }
}
