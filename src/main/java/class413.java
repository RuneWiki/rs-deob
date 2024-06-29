import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public abstract class class413 {

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    private int field5878 = 4;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public int field5881 = 4;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    private int field5882 = 0;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    private int field5883 = 4;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "[S")
    private short[] field5885 = new short[512];

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    private int field5888 = 4;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "[Lou;")
    public static class449[] field5884 = new class449[8];

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Lmg;")
    public static class530 field5880 = new class530();

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "Lde;")
    public static class10 field5890 = new class10(9, 0, 4, 1);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field5876;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field5877;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field5879;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "[S")
    private short[] field5889;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
    public static final void method2427(byte arg0) {
        if (arg0 != -46) {
            return;
        }
        for (class374 var1 = (class374) class398.field5713.method3137(0); var1 != null; var1 = (class374) class398.field5713.method3132(0)) {
            if (var1.field5379) {
                var1.method2244((byte) 88);
            }
        }
        field5879++;
        for (class374 var2 = (class374) class265.field3566.method3137(0); var2 != null; var2 = (class374) class265.field3566.method3132(arg0 + 46)) {
            if (var2.field5379) {
                var2.method2244((byte) 108);
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V")
    public static void method2428(byte arg0) {
        field5884 = null;
        field5890 = null;
        field5880 = null;
        if (arg0 != -89) {
            method2433(100);
        }
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)V")
    public abstract void method350(byte arg0);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    private final void method2429(int arg0) {
        field5887++;
        Random var2 = new Random((long) this.field5882);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field5885[var3] = (short) var3;
        }
        int var4 = 0;
        if (arg0 != 4) {
            this.field5888 = 97;
        }
        while (var4 < 255) {
            int var5 = 255 - var4;
            int var6 = class322.method1908(var5, -126, var2);
            short var7 = this.field5885[var6];
            this.field5885[var6] = this.field5885[var5];
            this.field5885[var5] = this.field5885[var5 + 256] = var7;
            var4++;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
    public abstract void method347(int arg0);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I[I)Ljava/lang/String;")
    public static final String method2430(int arg0, int[] arg1) {
        field5877++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class33.field515;
        for (int var4 = arg0; var4 < arg1.length; var4++) {
            class100 var5 = class18.field278.method1446(12167, arg1[var4]);
            if (var5.field1566 != -1) {
                class359 var6 = (class359) class115.field1831.method2767((long) var5.field1566, 0);
                if (var6 == null) {
                    class396 var7 = class396.method2353(class509.field7453, var5.field1566, 0);
                    if (var7 != null) {
                        var6 = class275.field3737.method555(var7, true);
                        class115.field1831.method2777(-1025, var6, (long) var5.field1566);
                    }
                }
                if (var6 != null) {
                    class271.field3684[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)V")
    public final void method2431(int arg0, int arg1, int arg2, int arg3) {
        field5886++;
        int[] var5 = new int[arg3];
        int[] var6 = new int[arg1];
        int[] var7 = new int[arg2];
        for (int var8 = 0; var8 < arg3; var8++) {
            var5[var8] = (var8 << 12) / arg3;
        }
        for (int var9 = 0; var9 < arg1; var9++) {
            var6[var9] = (var9 << 12) / arg1;
        }
        if (arg0 != 1709506092) {
            this.field5878 = 73;
        }
        for (int var10 = 0; var10 < arg2; var10++) {
            var7[var10] = (var10 << 12) / arg2;
        }
        this.method350((byte) 118);
        for (int var11 = 0; var11 < arg2; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < this.field5881; var14++) {
                        int var15 = this.field5889[var14] << 12;
                        int var16 = var6[var12] * var15 >> 12;
                        int var17 = this.field5888 * var15 >> 12;
                        int var18 = var7[var11] * var15 >> 12;
                        int var19 = this.field5883 * var15 >> 12;
                        int var20 = this.field5878 * var15 >> 12;
                        int var21 = var5[var13] * var15 >> 12;
                        int var22 = this.field5888 * var16;
                        int var23 = this.field5883 * var18;
                        int var24 = this.field5878 * var21;
                        int var25 = var24 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var22 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var27 & 0xFF;
                        int var31 = var23 >> 12;
                        int var32 = var31 + 1;
                        int var33;
                        if (var17 > var29) {
                            var33 = var29 & 0xFF;
                        } else {
                            var33 = 0;
                        }
                        int var34;
                        if (var20 <= var26) {
                            var34 = 0;
                        } else {
                            var34 = var26 & 0xFF;
                        }
                        int var35;
                        if (var32 >= var19) {
                            var35 = 0;
                        } else {
                            var35 = var32 & 0xFF;
                        }
                        int var36 = var22 & 0xFFF;
                        int var37 = var31 & 0xFF;
                        int var38 = var24 & 0xFFF;
                        int var39 = var23 & 0xFFF;
                        int var40 = class369.field5278[var38];
                        int var41 = var39 - 4096;
                        int var42 = var38 - 4096;
                        int var43 = var36 - 4096;
                        short var44 = this.field5885[var37];
                        int var45 = class369.field5278[var39];
                        short var46 = this.field5885[var35];
                        int var47 = class369.field5278[var36];
                        short var48 = this.field5885[var30 + var44];
                        short var49 = this.field5885[var30 + var46];
                        short var50 = this.field5885[var33 + var46];
                        short var51 = this.field5885[var33 + var44];
                        int var52 = class17.method125(var39, -75, var36, this.field5885[var28 + var48], var38);
                        int var53 = class17.method125(var39, -113, var36, this.field5885[var34 + var48], var42);
                        int var54 = ((var53 - var52) * var40 >> 12) + var52;
                        int var55 = class17.method125(var39, -80, var43, this.field5885[var28 + var51], var38);
                        int var56 = class17.method125(var39, -47, var43, this.field5885[var34 + var51], var42);
                        int var57 = ((var56 - var55) * var40 >> 12) + var55;
                        int var58 = class17.method125(var41, arg0 ^ 0x9A1B01B5, var36, this.field5885[var28 + var49], var38);
                        int var59 = ((var57 - var54) * var47 >> 12) + var54;
                        int var60 = class17.method125(var41, -126, var36, this.field5885[var34 + var49], var42);
                        int var61 = ((var60 - var58) * var40 >> 12) + var58;
                        int var62 = class17.method125(var41, -73, var43, this.field5885[var28 + var50], var38);
                        int var63 = class17.method125(var41, -92, var43, this.field5885[var34 + var50], var42);
                        int var64 = ((var63 - var62) * var40 >> 12) + var62;
                        int var65 = ((var64 - var61) * var47 >> 12) + var61;
                        this.method352(((var65 - var59) * var45 >> 12) + var59, var14, (byte) -86);
                    }
                    this.method347(918862444);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V")
    private final void method2432(boolean arg0) {
        this.field5889 = new short[this.field5881];
        field5876++;
        for (int var2 = 0; var2 < this.field5881; var2++) {
            this.field5889[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (!arg0) {
            this.field5878 = 106;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIB)V")
    public abstract void method352(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)V")
    public static final void method2433(int arg0) {
        if (arg0 != 19661) {
            method2427((byte) 13);
        }
        field5891++;
        class228.field3204.method558(class42.field625, class76.field1075.field3655 ? class193.field2813 + 256 << 0 : -1, 256);
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(IIIII)V")
    public class413(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5883 = arg4;
        this.field5882 = arg0;
        this.field5888 = arg3;
        this.field5878 = arg2;
        this.field5881 = arg1;
        this.method2432(true);
        this.method2429(4);
    }
}
