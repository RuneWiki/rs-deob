import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public abstract class class301 {

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    private int field5114 = 4;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    private int field5109 = 0;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public int field5121 = 4;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "[S")
    private short[] field5122 = new short[512];

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    private int field5116 = 4;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    private int field5125 = 4;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "Ltk;")
    public static class253 field5117 = new class253();

    @OriginalMember(owner = "client!be", name = "l", descriptor = "Ljf;")
    public static class229 field5120 = class212.method1457((byte) 126, "::breakcon");

    @OriginalMember(owner = "client!be", name = "o", descriptor = "Ljf;")
    public static class229 field5123 = class212.method1457((byte) 123, "<col=40ff00>");

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    public static int field5129 = 0;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "Ljf;")
    public static class229 field5127 = class212.method1457((byte) 71, "Fermer");

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    public static int field5128 = 0;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "Lih;")
    public static class33 field5124;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "[S")
    private short[] field5111;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIILnf;)V", line = 4)
    public static final void method2061(int arg0, int arg1, int arg2, class67 arg3) {
        if (arg3.field1154 == 0) {
            arg3.field1195 = arg3.field1238;
        } else if (arg3.field1154 == 1) {
            arg3.field1195 = (arg0 - arg3.field1258) / 2 + arg3.field1238;
        } else if (arg3.field1154 == 2) {
            arg3.field1195 = arg0 - arg3.field1258 - arg3.field1238;
        } else if (arg3.field1154 == 3) {
            arg3.field1195 = arg3.field1238 * arg0 >> 14;
        } else if (arg3.field1154 == 4) {
            arg3.field1195 = (arg0 - arg3.field1258) / 2 + (arg3.field1238 * arg0 >> 14);
        } else {
            arg3.field1195 = arg0 - ((arg3.field1238 * arg0 >> 14) + arg3.field1258);
        }
        field5130++;
        if (arg3.field1188 == 0) {
            arg3.field1207 = arg3.field1294;
        } else if (arg3.field1188 == 1) {
            arg3.field1207 = (arg2 - arg3.field1295) / 2 + arg3.field1294;
        } else if (arg3.field1188 == 2) {
            arg3.field1207 = arg2 - arg3.field1295 - arg3.field1294;
        } else if (arg3.field1188 == 3) {
            arg3.field1207 = arg3.field1294 * arg2 >> 14;
        } else if (arg3.field1188 == 4) {
            arg3.field1207 = (arg3.field1294 * arg2 >> 14) + (arg2 - arg3.field1295) / 2;
        } else {
            arg3.field1207 = arg2 - arg3.field1295 - (arg3.field1294 * arg2 >> 14);
        }
        if (class131.field2317 && (client.method1820(arg3) != 0 || arg3.field1267 == 0)) {
            if (arg3.field1195 < 0) {
                arg3.field1195 = 0;
            } else if (arg0 < (arg3.field1258 + arg3.field1195)) {
                arg3.field1195 = arg0 - arg3.field1258;
            }
            if (arg3.field1207 < 0) {
                arg3.field1207 = 0;
            } else if (arg3.field1207 + arg3.field1295 > arg2) {
                arg3.field1207 = arg2 - arg3.field1295;
            }
        }
        int var4 = 32 % ((-arg1 - 37) / 48);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BI)Loe;", line = 87)
    public static final class128 method2062(byte arg0, int arg1) {
        field5112++;
        if (arg0 != 122) {
            method2063((byte) 117);
        }
        class128 var2 = (class128) class73.field1392.method229((long) arg1, -14);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = client.field4466.method1275(arg1, 16, -5211);
        class128 var4 = new class128();
        if (var3 != null) {
            var4.method902(690, new class14(var3));
        }
        class73.field1392.method227(-25077, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)Z", line = 111)
    public static final boolean method2063(byte arg0) {
        field5118++;
        class78 var1 = class217.field3720;
        synchronized (class217.field3720) {
            if (class66.field1122 == class128.field2293) {
                return false;
            }
            class162.field2755 = class222.field3795[class128.field2293];
            class215.field3691 = class220.field3744[class128.field2293];
            if (arg0 < 86) {
                field5123 = (class229) null;
            }
            class128.field2293 = class128.field2293 + 1 & 0x7F;
            return true;
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(IIIII)V", line = 501)
    public class301(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5125 = arg3;
        this.field5109 = arg0;
        this.field5121 = arg1;
        this.field5114 = arg2;
        this.field5116 = arg4;
        this.method2067(86);
        this.method2066(-1538);
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V", line = 138)
    public static void method2064(int arg0) {
        field5117 = null;
        if (arg0 >= 82) {
            field5124 = null;
            field5127 = null;
            field5120 = null;
            field5123 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(BI)V", line = 159)
    public static final void method2065(byte arg0, int arg1) {
        field5113++;
        class187 var2 = (class187) class278.field4772.method1890((long) arg1, -90);
        if (var2 == null) {
            return;
        }
        int var3 = 0;
        int var4 = 123 / ((arg0 + 56) / 57);
        while (var2.field3279.length > var3) {
            var2.field3279[var3] = -1;
            var2.field3281[var3] = 0;
            var3++;
        }
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V", line = 188)
    private final void method2066(int arg0) {
        field5110++;
        Random var2 = new Random((long) this.field5109);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field5122[var3] = (short) var3;
        }
        int var4 = 0;
        if (arg0 != -1538) {
            method2062((byte) -113, -103);
        }
        while (var4 < 255) {
            int var5 = 255 - var4;
            int var6 = class50.method413(var5, false, var2);
            short var7 = this.field5122[var6];
            this.field5122[var6] = this.field5122[var5];
            this.field5122[var5] = this.field5122[var5 + 256] = var7;
            var4++;
        }
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(I)V", line = 244)
    private final void method2067(int arg0) {
        field5115++;
        this.field5111 = new short[this.field5121];
        if (arg0 < 23) {
            method2068((byte) -99);
        }
        for (int var2 = 0; var2 < this.field5121; var2++) {
            this.field5111[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)Lld;", line = 267)
    public static final class122 method2068(byte arg0) {
        field5126++;
        class122 var1 = (class122) client.field4451.method383(false);
        if (var1 != null) {
            var1.method1747((byte) -64);
            var1.method1986((byte) 86);
            return var1;
        }
        if (arg0 < 28) {
            method2065((byte) -59, 2);
        }
        class122 var2;
        do {
            var2 = (class122) class201.field3517.method383(false);
            if (var2 == null) {
                return null;
            }
            if (var2.method871((byte) -128) > class153.method1032(105)) {
                return null;
            }
            var2.method1747((byte) -38);
            var2.method1986((byte) 86);
        } while ((var2.field4845 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIBI)V", line = 309)
    public final void method2069(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 63) {
            field5123 = (class229) null;
        }
        field5119++;
        int[] var5 = new int[arg3];
        int[] var6 = new int[arg0];
        for (int var7 = 0; var7 < arg3; var7++) {
            var5[var7] = (var7 << 12) / arg3;
        }
        int[] var8 = new int[arg1];
        for (int var9 = 0; var9 < arg0; var9++) {
            var6[var9] = (var9 << 12) / arg0;
        }
        for (int var10 = 0; var10 < arg1; var10++) {
            var8[var10] = (var10 << 12) / arg1;
        }
        this.method222(22620);
        for (int var11 = 0; var11 < arg1; var11++) {
            for (int var12 = 0; var12 < arg0; var12++) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < this.field5121; var14++) {
                        int var15 = this.field5111[var14] << 12;
                        int var16 = var5[var13] * var15 >> 12;
                        int var17 = this.field5114 * var15 >> 12;
                        int var18 = this.field5116 * var15 >> 12;
                        int var19 = var6[var12] * var15 >> 12;
                        int var20 = var8[var11] * var15 >> 12;
                        int var21 = this.field5125 * var15 >> 12;
                        int var22 = this.field5125 * var19;
                        int var23 = this.field5116 * var20;
                        int var24 = var23 >> 12;
                        int var25 = var22 >> 12;
                        int var26 = var23 & 0xFFF;
                        int var27 = class246.field4367[var26];
                        int var28 = this.field5114 * var16;
                        int var29 = var25 + 1;
                        int var30 = var24 + 1;
                        int var31 = var26 - 4096;
                        int var32;
                        if (var30 < var18) {
                            var32 = var30 & 0xFF;
                        } else {
                            var32 = 0;
                        }
                        int var33;
                        if (var21 <= var29) {
                            var33 = 0;
                        } else {
                            var33 = var29 & 0xFF;
                        }
                        int var34 = var22 & 0xFFF;
                        short var35 = this.field5122[var32];
                        int var36 = var24 & 0xFF;
                        int var37 = var25 & 0xFF;
                        int var38 = class246.field4367[var34];
                        short var39 = this.field5122[var33 + var35];
                        int var40 = var34 - 4096;
                        short var41 = this.field5122[var35 + var37];
                        short var42 = this.field5122[var36];
                        int var43 = var28 >> 12;
                        short var44 = this.field5122[var33 + var42];
                        int var45 = var28 & 0xFFF;
                        int var46 = var45 - 4096;
                        int var47 = var43 + 1;
                        int var48 = class246.field4367[var45];
                        int var49 = var43 & 0xFF;
                        int var50;
                        if (var17 <= var47) {
                            var50 = 0;
                        } else {
                            var50 = var47 & 0xFF;
                        }
                        short var51 = this.field5122[var37 + var42];
                        int var52 = class202.method1415(var34, 3838, this.field5122[var49 + var51], var26, var45);
                        int var53 = class202.method1415(var34, 3838, this.field5122[var50 + var51], var26, var46);
                        int var54 = ((var53 - var52) * var48 >> 12) + var52;
                        int var55 = class202.method1415(var40, 3838, this.field5122[var44 + var49], var26, var45);
                        int var56 = class202.method1415(var40, arg2 ^ 0xEC1, this.field5122[var44 + var50], var26, var46);
                        int var57 = ((var56 - var55) * var48 >> 12) + var55;
                        int var58 = ((var57 - var54) * var38 >> 12) + var54;
                        int var59 = class202.method1415(var34, arg2 ^ 0xEC1, this.field5122[var41 + var49], var31, var45);
                        int var60 = class202.method1415(var34, 3838, this.field5122[var41 + var50], var31, var46);
                        int var61 = ((var60 - var59) * var48 >> 12) + var59;
                        int var62 = class202.method1415(var40, 3838, this.field5122[var39 + var49], var31, var45);
                        int var63 = class202.method1415(var40, 3838, this.field5122[var50 + var39], var31, var46);
                        int var64 = var62 + ((var63 - var62) * var48 >> 12);
                        int var65 = var61 + ((var64 - var61) * var38 >> 12);
                        this.method221(((var65 - var58) * var27 >> 12) + var58, -1513462804, var14);
                    }
                    this.method217(1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public abstract void method217(int arg0);

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(I)V")
    public abstract void method222(int arg0);

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)V")
    public abstract void method221(int arg0, int arg1, int arg2);
}
