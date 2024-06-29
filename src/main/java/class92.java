import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public abstract class class92 {

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    private int field1625 = 4;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "[S")
    private short[] field1620 = new short[512];

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    private int field1622 = 4;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    private int field1635 = 4;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    public int field1638 = 4;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
    private int field1640 = 0;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "Z")
    public static boolean field1621 = true;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field1628 = 0;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field1629 = 0;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "Z")
    public static boolean field1634 = true;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field1624 = -2;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "Lbd;")
    private static class162 field1641 = class17.method142(0, "M");

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "Lbd;")
    public static class162 field1632 = field1641;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "Lbd;")
    public static class162 field1627 = field1641;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "[S")
    private short[] field1626;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "[[I")
    public static int[][] field1631;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V", line = 5)
    private final void method693(int arg0) {
        Random var2 = new Random((long) this.field1640);
        field1630++;
        int var3 = 0;
        if (arg0 != 255) {
            this.method696((byte) 106);
        }
        while (var3 < 255) {
            this.field1620[var3] = (short) var3;
            var3++;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class95.method771(var2, var5, (byte) 115);
            short var7 = this.field1620[var6];
            this.field1620[var6] = this.field1620[var5];
            this.field1620[var5] = this.field1620[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)Lbd;", line = 46)
    public static final class162 method694(int arg0, int arg1) {
        field1639++;
        return ~arg1 > arg0 ? class156.method1212(10, arg1) : class40.field650;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)I", line = 67)
    public static int method695(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V", line = 78)
    private final void method696(byte arg0) {
        field1633++;
        this.field1626 = new short[this.field1638];
        int var2 = 110 % ((arg0 + 11) / 39);
        for (int var3 = 0; var3 < this.field1638; var3++) {
            this.field1626[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(IIIII)V", line = 456)
    public class92(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1635 = arg2;
        this.field1625 = arg4;
        this.field1640 = arg0;
        this.field1622 = arg3;
        this.field1638 = arg1;
        this.method696((byte) 93);
        this.method693(255);
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(II)I", line = 125)
    public static final int method697(int arg0, int arg1) {
        field1637++;
        double var2 = (double) ((arg1 & 0xFF6C95) >> 16) / 256.0D;
        double var4 = (double) (arg0 & arg1) / 256.0D;
        double var6 = (double) ((arg1 & 0xFF13) >> 8) / 256.0D;
        double var8 = var2;
        if (var6 < var2) {
            var8 = var6;
        }
        if (var8 > var4) {
            var8 = var4;
        }
        double var10 = 0.0D;
        double var12 = var2;
        if (var6 > var2) {
            var12 = var6;
        }
        if (var12 < var4) {
            var12 = var4;
        }
        double var14 = 0.0D;
        double var16 = (var8 + var12) / 2.0D;
        if (var8 != var12) {
            if (var16 < 0.5D) {
                var14 = (var12 - var8) / (var8 + var12);
            }
            if (var2 == var12) {
                var10 = (var6 - var4) / (var12 - var8);
            } else if (var6 == var12) {
                var10 = (var4 - var2) / (var12 - var8) + 2.0D;
            } else if (var4 == var12) {
                var10 = (var2 - var6) / (var12 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var12 - var8) / (2.0D - var12 - var8);
            }
        }
        double var18 = var10 / 6.0D;
        int var20 = (int) (var14 * 256.0D);
        int var21 = (int) (var18 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var20 < 0) {
            var20 = 0;
        } else if (var20 > 255) {
            var20 = 255;
        }
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var20 >>= 0x4;
        } else if (var22 > 217) {
            var20 >>= 0x3;
        } else if (var22 > 192) {
            var20 >>= 0x2;
        } else if (var22 > 179) {
            var20 >>= 0x1;
        }
        return (var22 >> 1) + (var20 >> 5 << 7) + (var21 >> 2 << 10);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIII)V", line = 228)
    public final void method698(int arg0, int arg1, int arg2, int arg3) {
        field1623++;
        if (arg3 != 255) {
            field1624 = 117;
        }
        int[] var5 = new int[arg0];
        int[] var6 = new int[arg2];
        int[] var7 = new int[arg1];
        for (int var8 = 0; var8 < arg1; var8++) {
            var7[var8] = (var8 << 12) / arg1;
        }
        for (int var9 = 0; var9 < arg0; var9++) {
            var5[var9] = (var9 << 12) / arg0;
        }
        for (int var10 = 0; var10 < arg2; var10++) {
            var6[var10] = (var10 << 12) / arg2;
        }
        this.method103(arg3 + 1389);
        for (int var11 = 0; var11 < arg2; var11++) {
            for (int var12 = 0; var12 < arg0; var12++) {
                for (int var13 = 0; var13 < arg1; var13++) {
                    for (int var14 = 0; var14 < this.field1638; var14++) {
                        int var15 = this.field1626[var14] << 12;
                        int var16 = var7[var13] * var15 >> 12;
                        int var17 = this.field1635 * var16;
                        int var18 = var17 >> 12;
                        int var19 = var5[var12] * var15 >> 12;
                        int var20 = this.field1622 * var15 >> 12;
                        int var21 = this.field1635 * var15 >> 12;
                        int var22 = this.field1622 * var19;
                        int var23 = var17 & 0xFFF;
                        int var24 = var22 >> 12;
                        int var25 = this.field1625 * var15 >> 12;
                        int var26 = var24 + 1;
                        int var27 = var6[var11] * var15 >> 12;
                        int var28 = var18 + 1;
                        int var29 = var18 & 0xFF;
                        int var30;
                        if (var21 <= var28) {
                            var30 = 0;
                        } else {
                            var30 = var28 & 0xFF;
                        }
                        int var31 = var24 & 0xFF;
                        int var32 = class167.field2939[var23];
                        int var33 = var23 - 4096;
                        int var34 = this.field1625 * var27;
                        int var35 = var22 & 0xFFF;
                        int var36;
                        if (var26 < var20) {
                            var36 = var26 & 0xFF;
                        } else {
                            var36 = 0;
                        }
                        int var37 = var35 - 4096;
                        int var38 = var34 >> 12;
                        int var39 = var38 + 1;
                        int var40 = var38 & 0xFF;
                        int var41 = var34 & 0xFFF;
                        int var42 = class167.field2939[var35];
                        short var43 = this.field1620[var40];
                        int var44 = class167.field2939[var41];
                        int var45 = var41 - 4096;
                        int var46;
                        if (var39 >= var25) {
                            var46 = 0;
                        } else {
                            var46 = var39 & 0xFF;
                        }
                        short var47 = this.field1620[var31 + var43];
                        short var48 = this.field1620[var46];
                        short var49 = this.field1620[var36 + var43];
                        short var50 = this.field1620[var36 + var48];
                        short var51 = this.field1620[var31 + var48];
                        int var52 = class172.method1322(var41, (byte) -89, var23, this.field1620[var29 + var47], var35);
                        int var53 = class172.method1322(var41, (byte) -118, var33, this.field1620[var30 + var47], var35);
                        int var54 = var52 + ((var53 - var52) * var32 >> 12);
                        int var55 = class172.method1322(var41, (byte) -104, var23, this.field1620[var29 + var49], var37);
                        int var56 = class172.method1322(var41, (byte) -95, var33, this.field1620[var30 + var49], var37);
                        int var57 = var55 + ((var56 - var55) * var32 >> 12);
                        int var58 = class172.method1322(var45, (byte) -92, var23, this.field1620[var29 + var51], var35);
                        int var59 = class172.method1322(var45, (byte) -90, var33, this.field1620[var30 + var51], var35);
                        int var60 = ((var57 - var54) * var42 >> 12) + var54;
                        int var61 = var58 + ((var59 - var58) * var32 >> 12);
                        int var62 = class172.method1322(var45, (byte) -119, var23, this.field1620[var29 + var50], var37);
                        int var63 = class172.method1322(var45, (byte) -112, var33, this.field1620[var30 + var50], var37);
                        int var64 = var62 + ((var63 - var62) * var32 >> 12);
                        int var65 = ((var64 - var61) * var42 >> 12) + var61;
                        this.method98(var14, false, var60 + ((var65 - var60) * var44 >> 12));
                    }
                    this.method109(-121);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)V", line = 397)
    public static void method699(int arg0) {
        field1627 = null;
        field1631 = (int[][]) null;
        if (arg0 < -70) {
            field1641 = null;
            field1632 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ID)V", line = 412)
    public static final void method700(int arg0, double arg1) {
        if (class97.field1767 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class125.field2277[var3] = var4 > 255 ? 255 : var4;
            }
            class97.field1767 = arg1;
        }
        if (arg0 == -383561044) {
            field1636++;
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
    public abstract void method103(int arg0);

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V")
    public abstract void method109(int arg0);

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IZI)V")
    public abstract void method98(int arg0, boolean arg1, int arg2);
}
