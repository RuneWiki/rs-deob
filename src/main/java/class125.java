import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class125 {

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "[I")
    private int[] field3088 = new int[5];

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "[I")
    private int[] field3092 = new int[5];

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    private int field3086 = 0;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "[I")
    private int[] field3094 = new int[5];

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public int field3085 = 0;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    private int field3095 = 100;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    public int field3103 = 500;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "[I")
    private static int[] field3100 = new int[32768];

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "[I")
    private static int[] field3087;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "[I")
    private static int[] field3091;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "[I")
    private static int[] field3102;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "[I")
    private static int[] field3101;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "[I")
    private static int[] field3105;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "[I")
    private static int[] field3104;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "[I")
    private static int[] field3108;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "Lc;")
    private class13 field3089;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "Lc;")
    private class13 field3090;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "Lc;")
    private class13 field3093;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "Lc;")
    private class13 field3096;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "Lc;")
    private class13 field3097;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "Lc;")
    private class13 field3098;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "Lc;")
    private class13 field3099;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "Lc;")
    private class13 field3106;

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "Lc;")
    private class13 field3107;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "Lee;")
    private class30 field3084;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field3100[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field3087 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field3087[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field3091 = new int[220500];
        field3102 = new int[5];
        field3101 = new int[5];
        field3105 = new int[5];
        field3104 = new int[5];
        field3108 = new int[5];
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lba;)V", line = 7)
    public final void method1006(class8 arg0) {
        this.field3097 = new class13();
        this.field3097.method250(arg0);
        this.field3099 = new class13();
        this.field3099.method250(arg0);
        int var2 = arg0.method145(false);
        if (var2 != 0) {
            arg0.field268--;
            this.field3093 = new class13();
            this.field3093.method250(arg0);
            this.field3107 = new class13();
            this.field3107.method250(arg0);
        }
        int var3 = arg0.method145(false);
        if (var3 != 0) {
            arg0.field268--;
            this.field3098 = new class13();
            this.field3098.method250(arg0);
            this.field3090 = new class13();
            this.field3090.method250(arg0);
        }
        int var4 = arg0.method145(false);
        if (var4 != 0) {
            arg0.field268--;
            this.field3106 = new class13();
            this.field3106.method250(arg0);
            this.field3089 = new class13();
            this.field3089.method250(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method179((byte) 104);
            if (var6 == 0) {
                break;
            }
            this.field3094[var5] = var6;
            this.field3088[var5] = arg0.method159((byte) 46);
            this.field3092[var5] = arg0.method179((byte) -77);
        }
        this.field3086 = arg0.method179((byte) 118);
        this.field3095 = arg0.method179((byte) -104);
        this.field3103 = arg0.method146(65280);
        this.field3085 = arg0.method146(65280);
        this.field3084 = new class30();
        this.field3096 = new class13();
        this.field3084.method376(arg0, this.field3096);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "()V", line = 71)
    public static void method1007() {
        field3091 = null;
        field3100 = null;
        field3087 = null;
        field3108 = null;
        field3104 = null;
        field3101 = null;
        field3102 = null;
        field3105 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)I", line = 94)
    private final int method1008(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field3087[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field3100[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)[I", line = 133)
    public final int[] method1009(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field3091[var3] = 0;
        }
        if (arg1 < 10) {
            return field3091;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field3097.method249();
        this.field3099.method249();
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field3093 != null) {
            this.field3093.method249();
            this.field3107.method249();
            var6 = (int) ((double) (this.field3093.field443 - this.field3093.field441) * 32.768D / var4);
            var7 = (int) ((double) this.field3093.field441 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field3098 != null) {
            this.field3098.method249();
            this.field3090.method249();
            var9 = (int) ((double) (this.field3098.field443 - this.field3098.field441) * 32.768D / var4);
            var10 = (int) ((double) this.field3098.field441 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field3094[var12] != 0) {
                field3108[var12] = 0;
                field3104[var12] = (int) ((double) this.field3092[var12] * var4);
                field3101[var12] = (this.field3094[var12] << 14) / 100;
                field3102[var12] = (int) ((double) (this.field3097.field443 - this.field3097.field441) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field3088[var12]) / var4);
                field3105[var12] = (int) ((double) this.field3097.field441 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var40 = this.field3097.method252(arg0);
            int var41 = this.field3099.method252(arg0);
            if (this.field3093 != null) {
                int var42 = this.field3093.method252(arg0);
                int var43 = this.field3107.method252(arg0);
                var40 += this.method1008(var8, var43, this.field3093.field442) >> 1;
                var8 += (var6 * var42 >> 16) + var7;
            }
            if (this.field3098 != null) {
                int var44 = this.field3098.method252(arg0);
                int var45 = this.field3090.method252(arg0);
                var41 = var41 * ((this.method1008(var11, var45, this.field3098.field442) >> 1) + 32768) >> 15;
                var11 += (var9 * var44 >> 16) + var10;
            }
            for (int var46 = 0; var46 < 5; var46++) {
                if (this.field3094[var46] != 0) {
                    int var47 = field3104[var46] + var13;
                    if (var47 < arg0) {
                        field3091[var47] += this.method1008(field3108[var46], field3101[var46] * var41 >> 15, this.field3097.field442);
                        field3108[var46] += (field3102[var46] * var40 >> 16) + field3105[var46];
                    }
                }
            }
        }
        if (this.field3106 != null) {
            this.field3106.method249();
            this.field3089.method249();
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field3106.method252(arg0);
                int var19 = this.field3089.method252(arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field3106.field443 - this.field3106.field441) * var18 >> 8) + this.field3106.field441;
                } else {
                    var20 = ((this.field3106.field443 - this.field3106.field441) * var19 >> 8) + this.field3106.field441;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field3091[var17] = 0;
                }
            }
        }
        if (this.field3086 > 0 && this.field3095 > 0) {
            int var21 = (int) ((double) this.field3086 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field3091[var22] += field3091[var22 - var21] * this.field3095 / 100;
            }
        }
        if (this.field3084.field826[0] > 0 || this.field3084.field826[1] > 0) {
            this.field3096.method249();
            int var23 = this.field3096.method252(arg0 + 1);
            int var24 = this.field3084.method379(0, (float) var23 / 65536.0F);
            int var25 = this.field3084.method379(1, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var36 = (int) ((long) field3091[var24 + var26] * (long) class30.field824 >> 16);
                    for (int var37 = 0; var37 < var24; var37++) {
                        var36 += (int) ((long) field3091[var24 + var26 - var37 - 1] * (long) class30.field822[0][var37] >> 16);
                    }
                    for (int var38 = 0; var38 < var26; var38++) {
                        var36 -= (int) ((long) field3091[var26 - var38 - 1] * (long) class30.field822[1][var38] >> 16);
                    }
                    field3091[var26] = var36;
                    var23 = this.field3096.method252(arg0 + 1);
                    var26++;
                }
                int var28 = 128;
                while (true) {
                    if (var28 > arg0 - var24) {
                        var28 = arg0 - var24;
                    }
                    while (var26 < var28) {
                        int var33 = (int) ((long) field3091[var24 + var26] * (long) class30.field824 >> 16);
                        for (int var34 = 0; var34 < var24; var34++) {
                            var33 += (int) ((long) field3091[var24 + var26 - var34 - 1] * (long) class30.field822[0][var34] >> 16);
                        }
                        for (int var35 = 0; var35 < var25; var35++) {
                            var33 -= (int) ((long) field3091[var26 - var35 - 1] * (long) class30.field822[1][var35] >> 16);
                        }
                        field3091[var26] = var33;
                        var23 = this.field3096.method252(arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var29 = 0;
                            for (int var30 = var24 + var26 - arg0; var30 < var24; var30++) {
                                var29 += (int) ((long) field3091[var24 + var26 - var30 - 1] * (long) class30.field822[0][var30] >> 16);
                            }
                            for (int var31 = 0; var31 < var25; var31++) {
                                var29 -= (int) ((long) field3091[var26 - var31 - 1] * (long) class30.field822[1][var31] >> 16);
                            }
                            field3091[var26] = var29;
                            this.field3096.method252(arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field3084.method379(0, (float) var23 / 65536.0F);
                    var25 = this.field3084.method379(1, (float) var23 / 65536.0F);
                    var28 += 128;
                }
            }
        }
        for (int var39 = 0; var39 < arg0; var39++) {
            if (field3091[var39] < -32768) {
                field3091[var39] = -32768;
            }
            if (field3091[var39] > 32767) {
                field3091[var39] = 32767;
            }
        }
        return field3091;
    }
}
