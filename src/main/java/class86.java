import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public abstract class class86 {

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    private int field1191 = 4;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    private int field1197 = 4;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "[S")
    private short[] field1193 = new short[512];

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public int field1199 = 4;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    private int field1190 = 4;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    private int field1208 = 0;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1200 = "Loading wordpack - ";

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "[I")
    public static int[] field1192 = new int[2];

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public static int field1205 = 0;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "Lwe;")
    public static class24 field1204 = new class24(500);

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "[I")
    public static int[] field1209 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    public static int field1207 = 0;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "[S")
    private short[] field1201;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
    public abstract void method261(byte arg0);

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    private final void method533(int arg0) {
        field1198++;
        this.field1201 = new short[this.field1199];
        for (int var2 = 0; var2 < this.field1199; var2++) {
            this.field1201[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (arg0 >= -26) {
            field1205 = 16;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
    public static void method534(boolean arg0) {
        field1204 = null;
        field1209 = null;
        if (!arg0) {
            field1200 = null;
            field1192 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
    private final void method535(int arg0) {
        field1195++;
        Random var2 = new Random((long) this.field1208);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field1193[var3] = (short) var3;
        }
        if (arg0 != 2) {
            method534(true);
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class205.method1296(2044605728, var2, var5);
            short var7 = this.field1193[var6];
            this.field1193[var6] = this.field1193[var5];
            this.field1193[var5] = this.field1193[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V")
    public static final void method536(byte arg0) {
        class276.field4057 = 0;
        class234.field3292 = 0;
        field1202++;
        class108.field1481 = 0;
        class276.field4043 = -3;
        class160.field2092 = -1;
        class205.field2961 = false;
        int var1 = -65 % ((arg0 - 24) / 33);
        class88.field1227 = 1;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)I")
    public static final int method537(int arg0, int arg1) {
        field1194++;
        if (arg1 != -35572916) {
            field1192 = null;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZII)V")
    public final void method538(int arg0, boolean arg1, int arg2, int arg3) {
        field1196++;
        int[] var5 = new int[arg3];
        int[] var6 = new int[arg2];
        int[] var7 = new int[arg0];
        for (int var8 = 0; var8 < arg3; var8++) {
            var5[var8] = (var8 << 12) / arg3;
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var6[var9] = (var9 << 12) / arg2;
        }
        if (arg1) {
            return;
        }
        for (int var10 = 0; var10 < arg0; var10++) {
            var7[var10] = (var10 << 12) / arg0;
        }
        this.method261((byte) 122);
        for (int var11 = 0; var11 < arg0; var11++) {
            for (int var12 = 0; var12 < arg2; var12++) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < this.field1199; var14++) {
                        int var15 = this.field1201[var14] << 12;
                        int var16 = var7[var11] * var15 >> 12;
                        int var17 = this.field1190 * var15 >> 12;
                        int var18 = this.field1191 * var15 >> 12;
                        int var19 = this.field1197 * var15 >> 12;
                        int var20 = var5[var13] * var15 >> 12;
                        int var21 = var6[var12] * var15 >> 12;
                        int var22 = this.field1197 * var21;
                        int var23 = this.field1190 * var16;
                        int var24 = this.field1191 * var20;
                        int var25 = var24 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var22 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var27 & 0xFF;
                        int var31 = var23 >> 12;
                        int var32 = var31 + 1;
                        int var33 = var22 & 0xFFF;
                        int var34;
                        if (var29 < var19) {
                            var34 = var29 & 0xFF;
                        } else {
                            var34 = 0;
                        }
                        int var35 = var31 & 0xFF;
                        int var36;
                        if (var32 < var17) {
                            var36 = var32 & 0xFF;
                        } else {
                            var36 = 0;
                        }
                        int var37;
                        if (var26 < var18) {
                            var37 = var26 & 0xFF;
                        } else {
                            var37 = 0;
                        }
                        int var38 = var23 & 0xFFF;
                        int var39 = var24 & 0xFFF;
                        int var40 = var38 - 4096;
                        short var41 = this.field1193[var36];
                        int var42 = class276.field4044[var39];
                        int var43 = class276.field4044[var38];
                        short var44 = this.field1193[var35];
                        int var45 = class276.field4044[var33];
                        int var46 = var39 - 4096;
                        int var47 = var33 - 4096;
                        short var48 = this.field1193[var30 + var44];
                        short var49 = this.field1193[var30 + var41];
                        short var50 = this.field1193[var34 + var44];
                        short var51 = this.field1193[var34 + var41];
                        int var52 = class7.method57(var39, 101, var33, this.field1193[var28 + var48], var38);
                        int var53 = class7.method57(var46, 86, var33, this.field1193[var37 + var48], var38);
                        int var54 = ((var53 - var52) * var42 >> 12) + var52;
                        int var55 = class7.method57(var39, 110, var47, this.field1193[var28 + var50], var38);
                        int var56 = class7.method57(var46, 108, var47, this.field1193[var37 + var50], var38);
                        int var57 = var55 + ((var56 - var55) * var42 >> 12);
                        int var58 = ((var57 - var54) * var45 >> 12) + var54;
                        int var59 = class7.method57(var39, 87, var33, this.field1193[var28 + var49], var40);
                        int var60 = class7.method57(var46, 116, var33, this.field1193[var37 + var49], var40);
                        int var61 = ((var60 - var59) * var42 >> 12) + var59;
                        int var62 = class7.method57(var39, 117, var47, this.field1193[var28 + var51], var40);
                        int var63 = class7.method57(var46, 99, var47, this.field1193[var37 + var51], var40);
                        int var64 = ((var63 - var62) * var42 >> 12) + var62;
                        int var65 = var61 + ((var64 - var61) * var45 >> 12);
                        this.method256(((var65 - var58) * var43 >> 12) + var58, 124, var14);
                    }
                    this.method255(arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V")
    public abstract void method256(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(Z)V")
    public abstract void method255(boolean arg0);

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(IIIII)V")
    public class86(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1190 = arg4;
        this.field1197 = arg3;
        this.field1199 = arg1;
        this.field1191 = arg2;
        this.field1208 = arg0;
        this.method533(-35);
        this.method535(2);
    }
}
