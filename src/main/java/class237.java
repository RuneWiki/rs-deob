import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public abstract class class237 {

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    private int field3291 = 0;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    private int field3294 = 4;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    private int field3289 = 4;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public int field3298 = 4;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    private int field3293 = 4;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "[S")
    private short[] field3299 = new short[512];

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "[Lok;")
    public static class61[] field3292 = new class61[14];

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "[S")
    private short[] field3296;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V", line = 11)
    private final void method1578(int arg0) {
        this.field3296 = new short[this.field3298];
        if (arg0 == 23514) {
            field3288++;
            for (int var2 = 0; var2 < this.field3298; var2++) {
                this.field3296[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIII)V", line = 35)
    public final void method1579(int arg0, int arg1, int arg2, int arg3) {
        field3290++;
        if (arg1 != 19136) {
            this.field3299 = null;
        }
        int[] var5 = new int[arg2];
        int[] var6 = new int[arg0];
        int[] var7 = new int[arg3];
        for (int var8 = 0; var8 < arg2; var8++) {
            var5[var8] = (var8 << 12) / arg2;
        }
        for (int var9 = 0; var9 < arg0; var9++) {
            var6[var9] = (var9 << 12) / arg0;
        }
        for (int var10 = 0; var10 < arg3; var10++) {
            var7[var10] = (var10 << 12) / arg3;
        }
        this.method1583((byte) 67);
        for (int var11 = 0; var11 < arg3; var11++) {
            for (int var12 = 0; var12 < arg0; var12++) {
                for (int var13 = 0; var13 < arg2; var13++) {
                    for (int var14 = 0; var14 < this.field3298; var14++) {
                        int var15 = this.field3296[var14] << 12;
                        int var16 = this.field3293 * var15 >> 12;
                        int var17 = this.field3289 * var15 >> 12;
                        int var18 = var7[var11] * var15 >> 12;
                        int var19 = var5[var13] * var15 >> 12;
                        int var20 = var6[var12] * var15 >> 12;
                        int var21 = this.field3294 * var15 >> 12;
                        int var22 = this.field3293 * var18;
                        int var23 = this.field3289 * var19;
                        int var24 = this.field3294 * var20;
                        int var25 = var23 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var24 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var27 & 0xFF;
                        int var31 = var22 >> 12;
                        int var32 = var31 + 1;
                        int var33;
                        if (var21 > var29) {
                            var33 = var29 & 0xFF;
                        } else {
                            var33 = 0;
                        }
                        int var34;
                        if (var17 <= var26) {
                            var34 = 0;
                        } else {
                            var34 = var26 & 0xFF;
                        }
                        int var35 = var22 & 0xFFF;
                        int var36 = var23 & 0xFFF;
                        int var37;
                        if (var32 < var16) {
                            var37 = var32 & 0xFF;
                        } else {
                            var37 = 0;
                        }
                        int var38 = var31 & 0xFF;
                        int var39 = var24 & 0xFFF;
                        short var40 = this.field3299[var37];
                        short var41 = this.field3299[var38];
                        int var42 = var36 - 4096;
                        int var43 = class115.field1617[var39];
                        int var44 = var39 - 4096;
                        int var45 = class115.field1617[var35];
                        int var46 = class115.field1617[var36];
                        int var47 = var35 - 4096;
                        short var48 = this.field3299[var30 + var40];
                        short var49 = this.field3299[var33 + var41];
                        short var50 = this.field3299[var30 + var41];
                        short var51 = this.field3299[var33 + var40];
                        int var52 = class199.method1409(var39, 12470, var35, var36, this.field3299[var28 + var50]);
                        int var53 = class199.method1409(var39, 12470, var35, var42, this.field3299[var34 + var50]);
                        int var54 = ((var53 - var52) * var46 >> 12) + var52;
                        int var55 = class199.method1409(var44, 12470, var35, var36, this.field3299[var28 + var49]);
                        int var56 = class199.method1409(var44, 12470, var35, var42, this.field3299[var34 + var49]);
                        int var57 = ((var56 - var55) * var46 >> 12) + var55;
                        int var58 = var54 + ((var57 - var54) * var43 >> 12);
                        int var59 = class199.method1409(var39, 12470, var47, var36, this.field3299[var28 + var48]);
                        int var60 = class199.method1409(var39, 12470, var47, var42, this.field3299[var34 + var48]);
                        int var61 = ((var60 - var59) * var46 >> 12) + var59;
                        int var62 = class199.method1409(var44, 12470, var47, var36, this.field3299[var28 + var51]);
                        int var63 = class199.method1409(var44, 12470, var47, var42, this.field3299[var34 + var51]);
                        int var64 = ((var63 - var62) * var46 >> 12) + var62;
                        int var65 = ((var64 - var61) * var43 >> 12) + var61;
                        this.method1580(var14, (byte) 57, ((var65 - var58) * var45 >> 12) + var58);
                    }
                    this.method1577((byte) 94);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(IIIII)V", line = 295)
    public class237(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3291 = arg0;
        this.field3298 = arg1;
        this.field3293 = arg4;
        this.field3294 = arg3;
        this.field3289 = arg2;
        this.method1578(23514);
        this.method1581(-61);
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V", line = 208)
    private final void method1581(int arg0) {
        field3295++;
        Random var2 = new Random((long) this.field3291);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field3299[var3] = (short) var3;
        }
        int var4 = -20 % ((arg0 - 69) / 35);
        for (int var5 = 0; var5 < 255; var5++) {
            int var6 = 255 - var5;
            int var7 = class283.method1785((byte) 23, var6, var2);
            short var8 = this.field3299[var7];
            this.field3299[var7] = this.field3299[var6];
            this.field3299[var6] = this.field3299[var6 + 256] = var8;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)V", line = 244)
    public static final void method1582(int arg0, int arg1) {
        if (arg0 >= -43) {
            return;
        }
        field3297++;
        if (class229.field3182 == 0) {
            class258.field3484.method2488(32686, arg1);
        } else {
            class148.field2286 = arg1;
        }
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(B)V", line = 263)
    public static void method1584(byte arg0) {
        if (arg0 != 119) {
            method1584((byte) 82);
        }
        field3292 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
    public abstract void method1577(byte arg0);

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IBI)V")
    public abstract void method1580(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)V")
    public abstract void method1583(byte arg0);
}
