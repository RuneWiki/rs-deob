import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class59 {

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public int field1212 = 0;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    private int field1219 = 100;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "[I")
    private int[] field1210 = new int[5];

    @OriginalMember(owner = "client!je", name = "h", descriptor = "[I")
    private int[] field1215 = new int[5];

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public int field1227 = 500;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "I")
    private int field1228 = 0;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "[I")
    private int[] field1232 = new int[5];

    @OriginalMember(owner = "client!je", name = "f", descriptor = "[I")
    private static int[] field1213 = new int[32768];

    @OriginalMember(owner = "client!je", name = "d", descriptor = "[I")
    private static int[] field1211;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "[I")
    private static int[] field1214;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "[I")
    private static int[] field1223;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "[I")
    private static int[] field1225;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "[I")
    private static int[] field1224;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "[I")
    private static int[] field1229;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "[I")
    private static int[] field1230;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "Lie;")
    private class53 field1208;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Lie;")
    private class53 field1209;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "Lie;")
    private class53 field1217;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "Lie;")
    private class53 field1218;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "Lie;")
    private class53 field1220;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "Lie;")
    private class53 field1221;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "Lie;")
    private class53 field1222;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "Lie;")
    private class53 field1226;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "Lie;")
    private class53 field1231;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "Lmd;")
    private class76 field1216;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1213[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1211 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1211[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1214 = new int[220500];
        field1223 = new int[5];
        field1225 = new int[5];
        field1224 = new int[5];
        field1229 = new int[5];
        field1230 = new int[5];
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)I", line = 7)
    private final int method476(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1211[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1213[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "()V", line = 35)
    public static void method477() {
        field1214 = null;
        field1213 = null;
        field1211 = null;
        field1225 = null;
        field1229 = null;
        field1223 = null;
        field1224 = null;
        field1230 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Leb;)V", line = 95)
    public final void method478(class27 arg0) {
        this.field1220 = new class53();
        this.field1220.method453(arg0);
        this.field1209 = new class53();
        this.field1209.method453(arg0);
        int var2 = arg0.method231(255);
        if (var2 != 0) {
            arg0.field482--;
            this.field1231 = new class53();
            this.field1231.method453(arg0);
            this.field1217 = new class53();
            this.field1217.method453(arg0);
        }
        int var3 = arg0.method231(255);
        if (var3 != 0) {
            arg0.field482--;
            this.field1208 = new class53();
            this.field1208.method453(arg0);
            this.field1218 = new class53();
            this.field1218.method453(arg0);
        }
        int var4 = arg0.method231(255);
        if (var4 != 0) {
            arg0.field482--;
            this.field1222 = new class53();
            this.field1222.method453(arg0);
            this.field1226 = new class53();
            this.field1226.method453(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method221(true);
            if (var6 == 0) {
                break;
            }
            this.field1215[var5] = var6;
            this.field1232[var5] = arg0.method222((byte) 44);
            this.field1210[var5] = arg0.method221(true);
        }
        this.field1228 = arg0.method221(true);
        this.field1219 = arg0.method221(true);
        this.field1227 = arg0.method227(127);
        this.field1212 = arg0.method227(127);
        this.field1216 = new class76();
        this.field1221 = new class53();
        this.field1216.method569(arg0, this.field1221);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)[I", line = 158)
    public final int[] method479(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1214[var3] = 0;
        }
        if (arg1 < 10) {
            return field1214;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1220.method451();
        this.field1209.method451();
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1231 != null) {
            this.field1231.method451();
            this.field1217.method451();
            var6 = (int) ((double) (this.field1231.field1107 - this.field1231.field1110) * 32.768D / var4);
            var7 = (int) ((double) this.field1231.field1110 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1208 != null) {
            this.field1208.method451();
            this.field1218.method451();
            var9 = (int) ((double) (this.field1208.field1107 - this.field1208.field1110) * 32.768D / var4);
            var10 = (int) ((double) this.field1208.field1110 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1215[var12] != 0) {
                field1225[var12] = 0;
                field1229[var12] = (int) ((double) this.field1210[var12] * var4);
                field1223[var12] = (this.field1215[var12] << 14) / 100;
                field1224[var12] = (int) ((double) (this.field1220.field1107 - this.field1220.field1110) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1232[var12]) / var4);
                field1230[var12] = (int) ((double) this.field1220.field1110 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var40 = this.field1220.method454(arg0);
            int var41 = this.field1209.method454(arg0);
            if (this.field1231 != null) {
                int var42 = this.field1231.method454(arg0);
                int var43 = this.field1217.method454(arg0);
                var40 += this.method476(var8, var43, this.field1231.field1108) >> 1;
                var8 += (var6 * var42 >> 16) + var7;
            }
            if (this.field1208 != null) {
                int var44 = this.field1208.method454(arg0);
                int var45 = this.field1218.method454(arg0);
                var41 = var41 * ((this.method476(var11, var45, this.field1208.field1108) >> 1) + 32768) >> 15;
                var11 += (var9 * var44 >> 16) + var10;
            }
            for (int var46 = 0; var46 < 5; var46++) {
                if (this.field1215[var46] != 0) {
                    int var47 = field1229[var46] + var13;
                    if (var47 < arg0) {
                        field1214[var47] += this.method476(field1225[var46], field1223[var46] * var41 >> 15, this.field1220.field1108);
                        field1225[var46] += (field1224[var46] * var40 >> 16) + field1230[var46];
                    }
                }
            }
        }
        if (this.field1222 != null) {
            this.field1222.method451();
            this.field1226.method451();
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1222.method454(arg0);
                int var19 = this.field1226.method454(arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field1222.field1107 - this.field1222.field1110) * var18 >> 8) + this.field1222.field1110;
                } else {
                    var20 = ((this.field1222.field1107 - this.field1222.field1110) * var19 >> 8) + this.field1222.field1110;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1214[var17] = 0;
                }
            }
        }
        if (this.field1228 > 0 && this.field1219 > 0) {
            int var21 = (int) ((double) this.field1228 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1214[var22] += field1214[var22 - var21] * this.field1219 / 100;
            }
        }
        if (this.field1216.field1643[0] > 0 || this.field1216.field1643[1] > 0) {
            this.field1221.method451();
            int var23 = this.field1221.method454(arg0 + 1);
            int var24 = this.field1216.method572(0, (float) var23 / 65536.0F);
            int var25 = this.field1216.method572(1, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var36 = (int) ((long) field1214[var24 + var26] * (long) class76.field1637 >> 16);
                    for (int var37 = 0; var37 < var24; var37++) {
                        var36 += (int) ((long) field1214[var24 + var26 - var37 - 1] * (long) class76.field1641[0][var37] >> 16);
                    }
                    for (int var38 = 0; var38 < var26; var38++) {
                        var36 -= (int) ((long) field1214[var26 - var38 - 1] * (long) class76.field1641[1][var38] >> 16);
                    }
                    field1214[var26] = var36;
                    var23 = this.field1221.method454(arg0 + 1);
                    var26++;
                }
                int var28 = 128;
                while (true) {
                    if (var28 > arg0 - var24) {
                        var28 = arg0 - var24;
                    }
                    while (var26 < var28) {
                        int var33 = (int) ((long) field1214[var24 + var26] * (long) class76.field1637 >> 16);
                        for (int var34 = 0; var34 < var24; var34++) {
                            var33 += (int) ((long) field1214[var24 + var26 - var34 - 1] * (long) class76.field1641[0][var34] >> 16);
                        }
                        for (int var35 = 0; var35 < var25; var35++) {
                            var33 -= (int) ((long) field1214[var26 - var35 - 1] * (long) class76.field1641[1][var35] >> 16);
                        }
                        field1214[var26] = var33;
                        var23 = this.field1221.method454(arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var29 = 0;
                            for (int var30 = var24 + var26 - arg0; var30 < var24; var30++) {
                                var29 += (int) ((long) field1214[var24 + var26 - var30 - 1] * (long) class76.field1641[0][var30] >> 16);
                            }
                            for (int var31 = 0; var31 < var25; var31++) {
                                var29 -= (int) ((long) field1214[var26 - var31 - 1] * (long) class76.field1641[1][var31] >> 16);
                            }
                            field1214[var26] = var29;
                            this.field1221.method454(arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1216.method572(0, (float) var23 / 65536.0F);
                    var25 = this.field1216.method572(1, (float) var23 / 65536.0F);
                    var28 += 128;
                }
            }
        }
        for (int var39 = 0; var39 < arg0; var39++) {
            if (field1214[var39] < -32768) {
                field1214[var39] = -32768;
            }
            if (field1214[var39] > 32767) {
                field1214[var39] = 32767;
            }
        }
        return field1214;
    }
}
