import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public abstract class class455 {

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "I")
    private int field6284 = 0;

    @OriginalMember(owner = "client!qo", name = "j", descriptor = "I")
    public int field6288 = 4;

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "I")
    private int field6280 = 4;

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "[S")
    private short[] field6289 = new short[512];

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
    private int field6279 = 4;

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "I")
    private int field6282 = 4;

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "I")
    public static int field6292 = 0;

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "Lcs;")
    public static class351 field6281 = new class351(31, 3);

    @OriginalMember(owner = "client!qo", name = "p", descriptor = "I")
    public static int field6294 = 0;

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "I")
    public static int field6283;

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "I")
    public static int field6287;

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "I")
    public static int field6290;

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "I")
    public static int field6291;

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "[S")
    private short[] field6286;

    @OriginalMember(owner = "client!qo", name = "o", descriptor = "[[[Lui;")
    public static class406[][][] field6293;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V", line = 5)
    private final void method2625(int arg0) {
        field6285++;
        Random var2 = new Random((long) this.field6284);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field6289[var3] = (short) var3;
        }
        if (arg0 != 19597) {
            return;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class10.method100((byte) -107, var5, var2);
            short var7 = this.field6289[var6];
            this.field6289[var6] = this.field6289[var5];
            this.field6289[var5] = this.field6289[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "(I)V", line = 45)
    public static void method2626(int arg0) {
        field6281 = null;
        field6293 = null;
        if (arg0 != 511421932) {
            field6292 = -65;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IC)C", line = 56)
    public static final char method2627(int arg0, char arg1) {
        field6291++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg0 != 24661) {
            return (char) 65443;
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg1 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(IIIII)V", line = 306)
    public class455(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6279 = arg3;
        this.field6280 = arg2;
        this.field6288 = arg1;
        this.field6282 = arg4;
        this.field6284 = arg0;
        this.method2629(34);
        this.method2625(19597);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIZI)V", line = 99)
    public final void method2628(int arg0, int arg1, boolean arg2, int arg3) {
        field6290++;
        if (arg2) {
            this.field6289 = null;
        }
        int[] var5 = new int[arg1];
        int[] var6 = new int[arg0];
        for (int var7 = 0; var7 < arg1; var7++) {
            var5[var7] = (var7 << 12) / arg1;
        }
        int[] var8 = new int[arg3];
        for (int var9 = 0; var9 < arg0; var9++) {
            var6[var9] = (var9 << 12) / arg0;
        }
        for (int var10 = 0; var10 < arg3; var10++) {
            var8[var10] = (var10 << 12) / arg3;
        }
        this.method362(113);
        for (int var11 = 0; var11 < arg3; var11++) {
            for (int var12 = 0; var12 < arg0; var12++) {
                for (int var13 = 0; var13 < arg1; var13++) {
                    for (int var14 = 0; var14 < this.field6288; var14++) {
                        int var15 = this.field6286[var14] << 12;
                        int var16 = var8[var11] * var15 >> 12;
                        int var17 = this.field6280 * var15 >> 12;
                        int var18 = var5[var13] * var15 >> 12;
                        int var19 = this.field6279 * var15 >> 12;
                        int var20 = var6[var12] * var15 >> 12;
                        int var21 = this.field6282 * var15 >> 12;
                        int var22 = this.field6282 * var16;
                        int var23 = this.field6280 * var18;
                        int var24 = this.field6279 * var20;
                        int var25 = var23 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var24 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var22 >> 12;
                        int var31 = var28 & 0xFF;
                        int var32 = var30 + 1;
                        int var33 = var23 & 0xFFF;
                        int var34;
                        if (var26 >= var17) {
                            var34 = 0;
                        } else {
                            var34 = var26 & 0xFF;
                        }
                        int var35 = var22 & 0xFFF;
                        int var36 = var30 & 0xFF;
                        int var37;
                        if (var21 > var32) {
                            var37 = var32 & 0xFF;
                        } else {
                            var37 = 0;
                        }
                        int var38;
                        if (var19 <= var29) {
                            var38 = 0;
                        } else {
                            var38 = var29 & 0xFF;
                        }
                        int var39 = var24 & 0xFFF;
                        int var40 = var39 - 4096;
                        int var41 = class439.field6019[var35];
                        short var42 = this.field6289[var36];
                        int var43 = class439.field6019[var39];
                        int var44 = class439.field6019[var33];
                        short var45 = this.field6289[var37];
                        int var46 = var33 - 4096;
                        int var47 = var35 - 4096;
                        short var48 = this.field6289[var38 + var42];
                        short var49 = this.field6289[var31 + var42];
                        short var50 = this.field6289[var38 + var45];
                        short var51 = this.field6289[var31 + var45];
                        int var52 = class61.method447(var35, -15, var33, var39, this.field6289[var27 + var49]);
                        int var53 = class61.method447(var35, -15, var46, var39, this.field6289[var34 + var49]);
                        int var54 = var52 + ((var53 - var52) * var44 >> 12);
                        int var55 = class61.method447(var35, -15, var33, var40, this.field6289[var27 + var48]);
                        int var56 = class61.method447(var35, -15, var46, var40, this.field6289[var34 + var48]);
                        int var57 = ((var56 - var55) * var44 >> 12) + var55;
                        int var58 = class61.method447(var47, -15, var33, var39, this.field6289[var27 + var51]);
                        int var59 = var54 + ((var57 - var54) * var43 >> 12);
                        int var60 = class61.method447(var47, -15, var46, var39, this.field6289[var34 + var51]);
                        int var61 = var58 + ((var60 - var58) * var44 >> 12);
                        int var62 = class61.method447(var47, -15, var33, var40, this.field6289[var27 + var50]);
                        int var63 = class61.method447(var47, -15, var46, var40, this.field6289[var34 + var50]);
                        int var64 = var62 + ((var63 - var62) * var44 >> 12);
                        int var65 = ((var64 - var61) * var43 >> 12) + var61;
                        this.method364(-4096, ((var65 - var59) * var41 >> 12) + var59, var14);
                    }
                    this.method360(0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "(I)V", line = 268)
    private final void method2629(int arg0) {
        int var2 = 32 % ((arg0 + 86) / 33);
        this.field6286 = new short[this.field6288];
        field6287++;
        for (int var3 = 0; var3 < this.field6288; var3++) {
            this.field6286[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
        }
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)V")
    public abstract void method360(int arg0);

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)V")
    public abstract void method364(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "(I)V")
    public abstract void method362(int arg0);
}
