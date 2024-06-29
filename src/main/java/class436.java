import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public abstract class class436 {

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    private int field6228 = 4;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    private int field6232 = 4;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public int field6226 = 4;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    private int field6235 = 0;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    private int field6225 = 4;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "[S")
    private short[] field6231 = new short[512];

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public static int field6234 = 0;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
    public static int field6241;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "Lap;")
    public static class335 field6240;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field6227;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field6229;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field6230;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field6233;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    public static int field6238;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "Lkb;")
    public static class488 field6239;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "[S")
    private short[] field6237;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V")
    public abstract void method1711(boolean arg0);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZI)Z")
    public static final boolean method2556(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field6229++;
            return (arg0 & 0x580) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public abstract void method1713(int arg0);

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
    private final void method2557(int arg0) {
        field6238++;
        Random var2 = new Random((long) this.field6235);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field6231[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var6 = 255 - var4;
            int var7 = class349.method2006(var2, (byte) -46, var6);
            short var8 = this.field6231[var7];
            this.field6231[var7] = this.field6231[var6];
            this.field6231[var6] = this.field6231[var6 + 256] = var8;
        }
        int var5 = -119 % ((arg0 - 37) / 36);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIB)V")
    public abstract void method1716(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V")
    private final void method2558(int arg0) {
        this.field6237 = new short[this.field6226];
        field6230++;
        if (arg0 != 1724124844) {
            this.field6235 = 40;
        }
        for (int var2 = 0; var2 < this.field6226; var2++) {
            this.field6237[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)V")
    public static void method2559(int arg0) {
        field6239 = null;
        field6240 = null;
        if (arg0 != 1724124844) {
            field6239 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IF)F")
    public static final float method2560(int arg0, float arg1) {
        field6236++;
        int var2 = -115 / ((arg0 - 16) / 58);
        return arg1 * arg1 * arg1 * ((arg1 * 6.0F - 15.0F) * arg1 + 10.0F);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2561(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 == arg9 && arg5 == arg8 && arg1 == arg4 && arg6 == arg7) {
            class100.method755(arg7, arg5, arg2, (byte) -18, arg1, arg3);
        } else {
            int var10 = arg2;
            int var11 = arg5;
            int var12 = arg2 * 3;
            int var13 = arg5 * 3;
            int var14 = arg9 * 3;
            int var15 = arg8 * 3;
            int var16 = arg4 * 3;
            int var17 = arg6 * 3;
            int var18 = arg1 - (arg2 + var16 - var14);
            int var19 = var15 + (arg7 - var17) - arg5;
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg2;
                int var34 = (var28 + var30 + var32 >> 12) + arg5;
                class100.method755(var34, var11, var10, (byte) 105, var33, arg3);
                var10 = var33;
                var11 = var34;
            }
        }
        field6233++;
        if (arg0 != 3) {
            method2560(107, -1.0331141F);
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(IIIII)V")
    public class436(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6232 = arg4;
        this.field6228 = arg3;
        this.field6226 = arg1;
        this.field6225 = arg2;
        this.field6235 = arg0;
        this.method2558(1724124844);
        this.method2557(80);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIII)V")
    public final void method2562(int arg0, int arg1, int arg2, int arg3) {
        field6227++;
        if (arg2 != 128) {
            this.field6226 = -78;
        }
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
        this.method1713(-32685);
        for (int var11 = 0; var11 < arg1; var11++) {
            for (int var12 = 0; var12 < arg0; var12++) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < this.field6226; var14++) {
                        int var15 = this.field6237[var14] << 12;
                        int var16 = this.field6232 * var15 >> 12;
                        int var17 = this.field6228 * var15 >> 12;
                        int var18 = var8[var11] * var15 >> 12;
                        int var19 = var6[var12] * var15 >> 12;
                        int var20 = this.field6225 * var15 >> 12;
                        int var21 = var5[var13] * var15 >> 12;
                        int var22 = this.field6232 * var18;
                        int var23 = this.field6228 * var19;
                        int var24 = this.field6225 * var21;
                        int var25 = var24 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var23 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var22 >> 12;
                        int var31 = var28 & 0xFF;
                        int var32 = var30 + 1;
                        int var33 = var24 & 0xFFF;
                        int var34;
                        if (var17 <= var29) {
                            var34 = 0;
                        } else {
                            var34 = var29 & 0xFF;
                        }
                        int var35 = var22 & 0xFFF;
                        int var36;
                        if (var26 >= var20) {
                            var36 = 0;
                        } else {
                            var36 = var26 & 0xFF;
                        }
                        int var37;
                        if (var32 < var16) {
                            var37 = var32 & 0xFF;
                        } else {
                            var37 = 0;
                        }
                        int var38 = var23 & 0xFFF;
                        int var39 = var30 & 0xFF;
                        int var40 = var38 - 4096;
                        short var41 = this.field6231[var37];
                        int var42 = var33 - 4096;
                        short var43 = this.field6231[var39];
                        int var44 = var35 - 4096;
                        int var45 = class53.field707[var38];
                        int var46 = class53.field707[var33];
                        int var47 = class53.field707[var35];
                        short var48 = this.field6231[var34 + var43];
                        short var49 = this.field6231[var31 + var43];
                        short var50 = this.field6231[var34 + var41];
                        short var51 = this.field6231[var31 + var41];
                        int var52 = class344.method1978(var38, this.field6231[var27 + var49], var33, -1, var35);
                        int var53 = class344.method1978(var38, this.field6231[var36 + var49], var42, -1, var35);
                        int var54 = ((var53 - var52) * var46 >> 12) + var52;
                        int var55 = class344.method1978(var40, this.field6231[var27 + var48], var33, -1, var35);
                        int var56 = class344.method1978(var40, this.field6231[var36 + var48], var42, arg2 ^ 0xFFFFFF7F, var35);
                        int var57 = ((var56 - var55) * var46 >> 12) + var55;
                        int var58 = class344.method1978(var38, this.field6231[var27 + var51], var33, arg2 - 129, var44);
                        int var59 = ((var57 - var54) * var45 >> 12) + var54;
                        int var60 = class344.method1978(var38, this.field6231[var36 + var51], var42, -1, var44);
                        int var61 = ((var60 - var58) * var46 >> 12) + var58;
                        int var62 = class344.method1978(var40, this.field6231[var27 + var50], var33, -1, var44);
                        int var63 = class344.method1978(var40, this.field6231[var36 + var50], var42, -1, var44);
                        int var64 = var62 + ((var63 - var62) * var46 >> 12);
                        int var65 = var61 + ((var64 - var61) * var45 >> 12);
                        this.method1716(var59 + ((var65 - var59) * var47 >> 12), var14, (byte) 41);
                    }
                    this.method1711(true);
                }
            }
        }
    }

    static {
        new class335("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
        field6241 = 0;
        field6240 = new class335("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");
    }
}
