import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class63 {

    @OriginalMember(owner = "client!m", name = "g", descriptor = "[I")
    private int[] field1071 = new int[5];

    @OriginalMember(owner = "client!m", name = "b", descriptor = "[I")
    private int[] field1066 = new int[5];

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    private int field1074 = 100;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public int field1067 = 500;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "[I")
    private int[] field1081 = new int[5];

    @OriginalMember(owner = "client!m", name = "r", descriptor = "I")
    private int field1082 = 0;

    @OriginalMember(owner = "client!m", name = "w", descriptor = "I")
    public int field1087 = 0;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "[I")
    private static int[] field1069 = new int[32768];

    @OriginalMember(owner = "client!m", name = "p", descriptor = "[I")
    private static int[] field1080;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "[I")
    private static int[] field1079;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "[I")
    private static int[] field1084;

    @OriginalMember(owner = "client!m", name = "u", descriptor = "[I")
    private static int[] field1085;

    @OriginalMember(owner = "client!m", name = "v", descriptor = "[I")
    private static int[] field1086;

    @OriginalMember(owner = "client!m", name = "y", descriptor = "[I")
    private static int[] field1089;

    @OriginalMember(owner = "client!m", name = "x", descriptor = "[I")
    private static int[] field1088;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "Ldj;")
    private class125 field1075;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "Lrk;")
    private class13 field1065;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "Lrk;")
    private class13 field1068;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "Lrk;")
    private class13 field1070;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "Lrk;")
    private class13 field1072;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "Lrk;")
    private class13 field1073;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "Lrk;")
    private class13 field1076;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "Lrk;")
    private class13 field1077;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "Lrk;")
    private class13 field1078;

    @OriginalMember(owner = "client!m", name = "s", descriptor = "Lrk;")
    private class13 field1083;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)[I")
    public final int[] method447(int arg0, int arg1) {
        class102.method773(field1079, 0, arg0);
        if (arg1 < 10) {
            return field1079;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1073.method106();
        this.field1076.method106();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1078 != null) {
            this.field1078.method106();
            this.field1070.method106();
            var5 = (int) ((double) (this.field1078.field206 - this.field1078.field207) * 32.768D / var3);
            var6 = (int) ((double) this.field1078.field207 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1065 != null) {
            this.field1065.method106();
            this.field1077.method106();
            var8 = (int) ((double) (this.field1065.field206 - this.field1065.field207) * 32.768D / var3);
            var9 = (int) ((double) this.field1065.field207 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1081[var11] != 0) {
                field1088[var11] = 0;
                field1086[var11] = (int) ((double) this.field1071[var11] * var3);
                field1084[var11] = (this.field1081[var11] << 14) / 100;
                field1085[var11] = (int) ((double) (this.field1073.field206 - this.field1073.field207) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1066[var11]) / var3);
                field1089[var11] = (int) ((double) this.field1073.field207 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field1073.method103(arg0);
            int var40 = this.field1076.method103(arg0);
            if (this.field1078 != null) {
                int var41 = this.field1078.method103(arg0);
                int var42 = this.field1070.method103(arg0);
                var39 += this.method450(var7, var42, this.field1078.field211) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field1065 != null) {
                int var43 = this.field1065.method103(arg0);
                int var44 = this.field1077.method103(arg0);
                var40 = var40 * ((this.method450(var10, var44, this.field1065.field211) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field1081[var45] != 0) {
                    int var46 = field1086[var45] + var12;
                    if (var46 < arg0) {
                        field1079[var46] += this.method450(field1088[var45], field1084[var45] * var40 >> 15, this.field1073.field211);
                        field1088[var45] += (field1085[var45] * var39 >> 16) + field1089[var45];
                    }
                }
            }
        }
        if (this.field1072 != null) {
            this.field1072.method106();
            this.field1068.method106();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field1072.method103(arg0);
                int var18 = this.field1068.method103(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field1072.field206 - this.field1072.field207) * var17 >> 8) + this.field1072.field207;
                } else {
                    var19 = ((this.field1072.field206 - this.field1072.field207) * var18 >> 8) + this.field1072.field207;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field1079[var16] = 0;
                }
            }
        }
        if (this.field1082 > 0 && this.field1074 > 0) {
            int var20 = (int) ((double) this.field1082 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field1079[var21] += field1079[var21 - var20] * this.field1074 / 100;
            }
        }
        if (this.field1075.field2309[0] > 0 || this.field1075.field2309[1] > 0) {
            this.field1083.method106();
            int var22 = this.field1083.method103(arg0 + 1);
            int var23 = this.field1075.method962(0, (float) var22 / 65536.0F);
            int var24 = this.field1075.method962(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field1079[var23 + var25] * (long) class125.field2311 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field1079[var23 + var25 - var36 - 1] * (long) class125.field2306[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field1079[var25 - var37 - 1] * (long) class125.field2306[1][var37] >> 16);
                    }
                    field1079[var25] = var35;
                    var22 = this.field1083.method103(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field1079[var23 + var25] * (long) class125.field2311 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field1079[var23 + var25 - var33 - 1] * (long) class125.field2306[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field1079[var25 - var34 - 1] * (long) class125.field2306[1][var34] >> 16);
                        }
                        field1079[var25] = var32;
                        var22 = this.field1083.method103(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field1079[var23 + var25 - var29 - 1] * (long) class125.field2306[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field1079[var25 - var30 - 1] * (long) class125.field2306[1][var30] >> 16);
                            }
                            field1079[var25] = var28;
                            this.field1083.method103(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field1075.method962(0, (float) var22 / 65536.0F);
                    var24 = this.field1075.method962(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field1079[var38] < -32768) {
                field1079[var38] = -32768;
            }
            if (field1079[var38] > 32767) {
                field1079[var38] = 32767;
            }
        }
        return field1079;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "()V")
    public static void method448() {
        field1079 = null;
        field1069 = null;
        field1080 = null;
        field1088 = null;
        field1086 = null;
        field1084 = null;
        field1085 = null;
        field1089 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lrg;)V")
    public final void method449(class239 arg0) {
        this.field1073 = new class13();
        this.field1073.method105(arg0);
        this.field1076 = new class13();
        this.field1076.method105(arg0);
        int var2 = arg0.method1651(4139);
        if (var2 != 0) {
            arg0.field4124--;
            this.field1078 = new class13();
            this.field1078.method105(arg0);
            this.field1070 = new class13();
            this.field1070.method105(arg0);
        }
        int var3 = arg0.method1651(4139);
        if (var3 != 0) {
            arg0.field4124--;
            this.field1065 = new class13();
            this.field1065.method105(arg0);
            this.field1077 = new class13();
            this.field1077.method105(arg0);
        }
        int var4 = arg0.method1651(4139);
        if (var4 != 0) {
            arg0.field4124--;
            this.field1072 = new class13();
            this.field1072.method105(arg0);
            this.field1068 = new class13();
            this.field1068.method105(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1666(24348);
            if (var6 == 0) {
                break;
            }
            this.field1081[var5] = var6;
            this.field1066[var5] = arg0.method1640(-49152);
            this.field1071[var5] = arg0.method1666(24348);
        }
        this.field1082 = arg0.method1666(24348);
        this.field1074 = arg0.method1666(24348);
        this.field1067 = arg0.method1663((byte) -93);
        this.field1087 = arg0.method1663((byte) 76);
        this.field1075 = new class125();
        this.field1083 = new class13();
        this.field1075.method964(arg0, this.field1083);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III)I")
    private final int method450(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1080[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1069[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1069[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1080 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1080[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1079 = new int[220500];
        field1084 = new int[5];
        field1085 = new int[5];
        field1086 = new int[5];
        field1089 = new int[5];
        field1088 = new int[5];
    }
}
