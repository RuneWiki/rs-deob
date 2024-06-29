import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public abstract class class604 {

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
    public int field7937 = 4;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "I")
    private int field7936 = 0;

    @OriginalMember(owner = "client!qs", name = "j", descriptor = "I")
    private int field7941 = 4;

    @OriginalMember(owner = "client!qs", name = "m", descriptor = "I")
    private int field7944 = 4;

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "I")
    private int field7939 = 4;

    @OriginalMember(owner = "client!qs", name = "q", descriptor = "[S")
    private short[] field7948 = new short[512];

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "[Lpf;")
    public static class583[] field7934 = new class583[300];

    @OriginalMember(owner = "client!qs", name = "l", descriptor = "I")
    public static int field7943 = 0;

    @OriginalMember(owner = "client!qs", name = "o", descriptor = "Z")
    public static boolean field7946 = false;

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "D")
    public static double field7935;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
    public static int field7932;

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "I")
    public static int field7938;

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "I")
    public static int field7940;

    @OriginalMember(owner = "client!qs", name = "n", descriptor = "I")
    public static int field7945;

    @OriginalMember(owner = "client!qs", name = "p", descriptor = "I")
    public static int field7947;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "[S")
    private short[] field7933;

    @OriginalMember(owner = "client!qs", name = "k", descriptor = "[[Z")
    public static boolean[][] field7942;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
    private final void method3286(int arg0) {
        field7945++;
        Random var2 = new Random((long) this.field7936);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field7948[var3] = (short) var3;
        }
        int var4 = 0;
        if (arg0 != 7122) {
            this.method3286(-30);
        }
        while (var4 < 255) {
            int var5 = 255 - var4;
            int var6 = class309.method1906(var5, -1, var2);
            short var7 = this.field7948[var6];
            this.field7948[var6] = this.field7948[var5];
            this.field7948[var5] = this.field7948[var5 + 256] = var7;
            var4++;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILwd;)V")
    public static final void method3287(int arg0, class276 arg1) {
        field7932++;
        arg1.method1661(true);
        int var2 = 0;
        for (int var3 = arg0; var3 < class586.field7665; var3++) {
            int var15 = class20.field351[var3];
            if ((class498.field6714[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class498.field6714[var15] = (byte) class446.method2556(class498.field6714[var15], 2);
                } else {
                    int var16 = arg1.method1664(2059, 1);
                    if (var16 == 0) {
                        var2 = class658.method3573(arg1, 41);
                        class498.field6714[var15] = (byte) class446.method2556(class498.field6714[var15], 2);
                    } else {
                        class668.method3686(var15, -2734, arg1);
                    }
                }
            }
        }
        arg1.method1660(-37);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg1.method1661(true);
        for (int var4 = 0; var4 < class586.field7665; var4++) {
            int var13 = class20.field351[var4];
            if ((class498.field6714[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    class498.field6714[var13] = (byte) class446.method2556(class498.field6714[var13], 2);
                    var2--;
                } else {
                    int var14 = arg1.method1664(2059, 1);
                    if (var14 == 0) {
                        var2 = class658.method3573(arg1, arg0 + 87);
                        class498.field6714[var13] = (byte) class446.method2556(class498.field6714[var13], 2);
                    } else {
                        class668.method3686(var13, -2734, arg1);
                    }
                }
            }
        }
        arg1.method1660(-62);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg1.method1661(true);
        for (int var5 = 0; var5 < class736.field10181; var5++) {
            int var11 = class31.field490[var5];
            if ((class498.field6714[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    class498.field6714[var11] = (byte) class446.method2556(class498.field6714[var11], 2);
                    var2--;
                } else {
                    int var12 = arg1.method1664(2059, 1);
                    if (var12 == 0) {
                        var2 = class658.method3573(arg1, 113);
                        class498.field6714[var11] = (byte) class446.method2556(class498.field6714[var11], 2);
                    } else if (class700.method3946(2, var11, arg1)) {
                        class498.field6714[var11] = (byte) class446.method2556(class498.field6714[var11], 2);
                    }
                }
            }
        }
        arg1.method1660(-46);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg1.method1661(true);
        for (int var6 = 0; var6 < class736.field10181; var6++) {
            int var9 = class31.field490[var6];
            if ((class498.field6714[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    class498.field6714[var9] = (byte) class446.method2556(class498.field6714[var9], 2);
                    var2--;
                } else {
                    int var10 = arg1.method1664(arg0 + 2059, 1);
                    if (var10 == 0) {
                        var2 = class658.method3573(arg1, 74);
                        class498.field6714[var9] = (byte) class446.method2556(class498.field6714[var9], 2);
                    } else if (class700.method3946(2, var9, arg1)) {
                        class498.field6714[var9] = (byte) class446.method2556(class498.field6714[var9], 2);
                    }
                }
            }
        }
        arg1.method1660(arg0 ^ 0xFFFFFFB0);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class736.field10181 = 0;
        class586.field7665 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class498.field6714[var7] = (byte) (class498.field6714[var7] >> 1);
            class383 var8 = class248.field3438[var7];
            if (var8 == null) {
                class31.field490[class736.field10181++] = var7;
            } else {
                class20.field351[class586.field7665++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V")
    private final void method3288(byte arg0) {
        field7938++;
        this.field7933 = new short[this.field7937];
        int var2 = 0;
        int var3 = -68 / ((-arg0 - 7) / 60);
        while (this.field7937 > var2) {
            this.field7933[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            var2++;
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V")
    public abstract void method267(int arg0);

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(I)V")
    public static void method3289(int arg0) {
        field7934 = null;
        field7942 = null;
        if (arg0 != 1871698636) {
            method3289(69);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "()V")
    public static final void method3290() {
        for (int var0 = 0; var0 < class197.field2980; var0++) {
            class675 var1 = class43.field572[var0];
            class208.method1389(var1, true);
            class43.field572[var0] = null;
        }
        class197.field2980 = 0;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(BI)Z")
    public static final boolean method3291(byte arg0, int arg1) {
        field7940++;
        if (arg1 >= -19) {
            field7943 = -104;
        }
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            return false;
        } else {
            return var2 < 128 || var2 >= 160 || class540.field7158[var2 - 128] != '\u0000';
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIII)V")
    public final void method3292(int arg0, int arg1, int arg2, int arg3) {
        field7947++;
        int[] var5 = new int[arg0];
        int[] var6 = new int[arg1];
        int[] var7 = new int[arg2];
        for (int var8 = 0; var8 < arg0; var8++) {
            var5[var8] = (var8 << 12) / arg0;
        }
        for (int var9 = 0; var9 < arg1; var9++) {
            var6[var9] = (var9 << 12) / arg1;
        }
        for (int var10 = arg3; var10 < arg2; var10++) {
            var7[var10] = (var10 << 12) / arg2;
        }
        this.method267(104);
        for (int var11 = 0; var11 < arg2; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field7937; var14++) {
                        int var15 = this.field7933[var14] << 12;
                        int var16 = this.field7944 * var15 >> 12;
                        int var17 = var7[var11] * var15 >> 12;
                        int var18 = var5[var13] * var15 >> 12;
                        int var19 = this.field7941 * var15 >> 12;
                        int var20 = this.field7939 * var15 >> 12;
                        int var21 = var6[var12] * var15 >> 12;
                        int var22 = this.field7944 * var18;
                        int var23 = this.field7939 * var21;
                        int var24 = this.field7941 * var17;
                        int var25 = var22 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var23 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var24 >> 12;
                        int var31 = var28 & 0xFF;
                        int var32 = var30 + 1;
                        int var33;
                        if (var20 > var29) {
                            var33 = var29 & 0xFF;
                        } else {
                            var33 = 0;
                        }
                        int var34;
                        if (var16 > var26) {
                            var34 = var26 & 0xFF;
                        } else {
                            var34 = 0;
                        }
                        int var35 = var23 & 0xFFF;
                        int var36 = var22 & 0xFFF;
                        int var37;
                        if (var32 < var19) {
                            var37 = var32 & 0xFF;
                        } else {
                            var37 = 0;
                        }
                        int var38 = var30 & 0xFF;
                        int var39 = var24 & 0xFFF;
                        short var40 = this.field7948[var38];
                        int var41 = class750.field10448[var36];
                        int var42 = var36 - 4096;
                        int var43 = var35 - 4096;
                        short var44 = this.field7948[var37];
                        int var45 = var39 - 4096;
                        int var46 = class750.field10448[var39];
                        int var47 = class750.field10448[var35];
                        short var48 = this.field7948[var31 + var40];
                        short var49 = this.field7948[var31 + var44];
                        short var50 = this.field7948[var33 + var44];
                        short var51 = this.field7948[var33 + var40];
                        int var52 = class50.method356(this.field7948[var27 + var48], var36, var39, var35, false);
                        int var53 = class50.method356(this.field7948[var34 + var48], var42, var39, var35, false);
                        int var54 = ((var53 - var52) * var41 >> 12) + var52;
                        int var55 = class50.method356(this.field7948[var27 + var51], var36, var39, var43, false);
                        int var56 = class50.method356(this.field7948[var34 + var51], var42, var39, var43, false);
                        int var57 = ((var56 - var55) * var41 >> 12) + var55;
                        int var58 = class50.method356(this.field7948[var27 + var49], var36, var45, var35, false);
                        int var59 = var54 + ((var57 - var54) * var47 >> 12);
                        int var60 = class50.method356(this.field7948[var34 + var49], var42, var45, var35, false);
                        int var61 = var58 + ((var60 - var58) * var41 >> 12);
                        int var62 = class50.method356(this.field7948[var27 + var50], var36, var45, var43, false);
                        int var63 = class50.method356(this.field7948[var34 + var50], var42, var45, var43, false);
                        int var64 = var62 + ((var63 - var62) * var41 >> 12);
                        int var65 = var61 + ((var64 - var61) * var47 >> 12);
                        this.method268(-256, var59 + ((var65 - var59) * var46 >> 12), var14);
                    }
                    this.method266(arg3 ^ 0x70FE);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "(I)V")
    public abstract void method266(int arg0);

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(III)V")
    public abstract void method268(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(IIIII)V")
    public class604(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7936 = arg0;
        this.field7944 = arg2;
        this.field7939 = arg3;
        this.field7941 = arg4;
        this.field7937 = arg1;
        this.method3288((byte) 115);
        this.method3286(7122);
    }
}
