import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public abstract class class750 {

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public int field10348 = 4;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    private int field10353 = 0;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    private int field10350 = 4;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
    private int field10355 = 4;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
    private int field10354 = 4;

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "[S")
    private short[] field10357 = new short[512];

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field10346;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public static int field10347;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field10351;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public static int field10352;

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "I")
    public static int field10356;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "[S")
    private short[] field10349;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)V")
    public abstract void method3436(boolean arg0);

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V")
    public static final void method4162(byte arg0) {
        class381.field5182 = new class630(8);
        field10356++;
        class388.field5336 = 0;
        for (class788 var1 = (class788) class450.field6170.method1597((byte) -108); var1 != null; var1 = (class788) class450.field6170.method1601(78)) {
            var1.method4306();
        }
        if (arg0 == -48) {
            ;
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(Z)V")
    public abstract void method3438(boolean arg0);

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIB)V")
    public abstract void method3437(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(B)V")
    private final void method4163(byte arg0) {
        field10347++;
        Random var2 = new Random((long) this.field10353);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field10357[var3] = (short) var3;
        }
        int var4 = 19 / ((-arg0 - 10) / 32);
        for (int var5 = 0; var5 < 255; var5++) {
            int var6 = 255 - var5;
            int var7 = class38.method235(var6, 116, var2);
            short var8 = this.field10357[var7];
            this.field10357[var7] = this.field10357[var6];
            this.field10357[var6] = this.field10357[var6 + 256] = var8;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIII)V")
    public final void method4164(int arg0, int arg1, int arg2, int arg3) {
        field10351++;
        if (arg0 != 255) {
            this.method3437(45, 89, (byte) -7);
        }
        int[] var5 = new int[arg2];
        int[] var6 = new int[arg3];
        int[] var7 = new int[arg1];
        for (int var8 = 0; var8 < arg2; var8++) {
            var5[var8] = (var8 << 12) / arg2;
        }
        for (int var9 = 0; var9 < arg3; var9++) {
            var6[var9] = (var9 << 12) / arg3;
        }
        for (int var10 = 0; var10 < arg1; var10++) {
            var7[var10] = (var10 << 12) / arg1;
        }
        this.method3436(true);
        for (int var11 = 0; var11 < arg1; var11++) {
            for (int var12 = 0; var12 < arg3; var12++) {
                for (int var13 = 0; var13 < arg2; var13++) {
                    for (int var14 = 0; var14 < this.field10348; var14++) {
                        int var15 = this.field10349[var14] << 12;
                        int var16 = this.field10354 * var15 >> 12;
                        int var17 = var6[var12] * var15 >> 12;
                        int var18 = this.field10350 * var15 >> 12;
                        int var19 = this.field10355 * var15 >> 12;
                        int var20 = var5[var13] * var15 >> 12;
                        int var21 = var7[var11] * var15 >> 12;
                        int var22 = this.field10355 * var17;
                        int var23 = this.field10354 * var21;
                        int var24 = this.field10350 * var20;
                        int var25 = var24 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var22 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var28 & 0xFF;
                        int var31 = var23 >> 12;
                        int var32 = var31 + 1;
                        int var33 = var23 & 0xFFF;
                        int var34;
                        if (var32 < var16) {
                            var34 = var32 & 0xFF;
                        } else {
                            var34 = 0;
                        }
                        int var35;
                        if (var18 <= var26) {
                            var35 = 0;
                        } else {
                            var35 = var26 & 0xFF;
                        }
                        int var36 = var31 & 0xFF;
                        int var37 = var22 & 0xFFF;
                        int var38 = var24 & 0xFFF;
                        int var39;
                        if (var29 >= var19) {
                            var39 = 0;
                        } else {
                            var39 = var29 & 0xFF;
                        }
                        int var40 = var37 - 4096;
                        int var41 = class671.field9321[var37];
                        int var42 = class671.field9321[var33];
                        short var43 = this.field10357[var34];
                        int var44 = class671.field9321[var38];
                        int var45 = var38 - 4096;
                        short var46 = this.field10357[var36];
                        int var47 = var33 - 4096;
                        short var48 = this.field10357[var39 + var43];
                        short var49 = this.field10357[var30 + var43];
                        short var50 = this.field10357[var39 + var46];
                        short var51 = this.field10357[var30 + var46];
                        int var52 = class378.method2306((byte) 124, var37, var33, var38, this.field10357[var27 + var51]);
                        int var53 = class378.method2306((byte) 42, var37, var33, var45, this.field10357[var35 + var51]);
                        int var54 = var52 + ((var53 - var52) * var44 >> 12);
                        int var55 = class378.method2306((byte) 36, var40, var33, var38, this.field10357[var27 + var50]);
                        int var56 = class378.method2306((byte) 61, var40, var33, var45, this.field10357[var35 + var50]);
                        int var57 = ((var56 - var55) * var44 >> 12) + var55;
                        int var58 = ((var57 - var54) * var41 >> 12) + var54;
                        int var59 = class378.method2306((byte) 31, var37, var47, var38, this.field10357[var27 + var49]);
                        int var60 = class378.method2306((byte) 72, var37, var47, var45, this.field10357[var35 + var49]);
                        int var61 = var59 + ((var60 - var59) * var44 >> 12);
                        int var62 = class378.method2306((byte) 31, var40, var47, var38, this.field10357[var27 + var48]);
                        int var63 = class378.method2306((byte) 24, var40, var47, var45, this.field10357[var35 + var48]);
                        int var64 = ((var63 - var62) * var44 >> 12) + var62;
                        int var65 = ((var64 - var61) * var41 >> 12) + var61;
                        this.method3437(var14, var58 + ((var65 - var58) * var42 >> 12), (byte) 58);
                    }
                    this.method3438(true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)I")
    public static final int method4165(int arg0, int arg1) {
        if (arg0 != 255) {
            method4162((byte) 91);
        }
        field10352++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
    private final void method4166(int arg0) {
        this.field10349 = new short[this.field10348];
        field10346++;
        if (arg0 == 2) {
            for (int var2 = 0; var2 < this.field10348; var2++) {
                this.field10349[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(IIIII)V")
    public class750(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field10350 = arg2;
        this.field10348 = arg1;
        this.field10355 = arg3;
        this.field10354 = arg4;
        this.field10353 = arg0;
        this.method4166(2);
        this.method4163((byte) 76);
    }
}
