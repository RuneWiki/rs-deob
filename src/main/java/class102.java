import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class102 extends class101 {

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "Z")
    private static boolean field1621 = false;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    private static int field1606;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    private int field1608;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
    private static int field1615;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    private static int field1616;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "I")
    private int field1622;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "I")
    private int field1623;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "I")
    private int field1624;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "I")
    private int field1625;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
    private int field1627;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
    private static int field1628;

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "I")
    private int field1637;

    @OriginalMember(owner = "client!ae", name = "T", descriptor = "I")
    private int field1638;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "Z")
    private boolean field1605;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "Z")
    private boolean field1626;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "[B")
    private static byte[] field1611;

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "[B")
    private byte[] field1635;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "[F")
    private float[] field1607;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "[F")
    private static float[] field1609;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "[F")
    private static float[] field1612;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "[F")
    private static float[] field1614;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "[F")
    private static float[] field1618;

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "[F")
    private static float[] field1629;

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "[F")
    private static float[] field1631;

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "[F")
    private static float[] field1636;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "[I")
    private static int[] field1613;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "[I")
    private static int[] field1619;

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "[I")
    private static int[] field1632;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "[Ldc;")
    private static class1[] field1617;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "[Llb;")
    private static class232[] field1610;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "[Lki;")
    public static class312[] field1620;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "[Lal;")
    private static class39[] field1630;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "[Z")
    private static boolean[] field1634;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "[[B")
    private byte[][] field1633;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Llm;II)Lae;", line = 7)
    public static final class102 method717(class210 arg0, int arg1, int arg2) {
        if (method727(arg0)) {
            byte[] var3 = arg0.method1441(arg2, (byte) -44, arg1);
            return var3 == null ? null : new class102(var3);
        } else {
            arg0.method1463(arg1, (byte) -55, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)I", line = 26)
    public static final int method718(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field1606) {
            int var3 = 8 - field1606;
            int var4 = (0x1 << var3) - 1;
            var1 += (field1611[field1628] >> field1606 & var4) << var2;
            field1606 = 0;
            field1628++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field1611[field1628] >> field1606 & var5) << var2;
            field1606 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "()I", line = 55)
    public static final int method719() {
        int var0 = field1611[field1628] >> field1606 & 0x1;
        field1606++;
        field1628 += field1606 >> 3;
        field1606 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([I)Lsf;", line = 65)
    public final class220 method720(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field1635 == null) {
            this.field1608 = 0;
            this.field1607 = new float[field1615];
            this.field1635 = new byte[this.field1627];
            this.field1637 = 0;
            this.field1638 = 0;
        }
        while (this.field1638 < this.field1633.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method724(this.field1638);
            if (var2 != null) {
                int var3 = this.field1637;
                int var4 = var2.length;
                if (var4 > this.field1627 - var3) {
                    var4 = this.field1627 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field1635[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field1637;
                }
                this.field1637 = var3;
            }
            this.field1638++;
        }
        this.field1607 = null;
        byte[] var7 = this.field1635;
        this.field1635 = null;
        return new class220(this.field1622, var7, this.field1623, this.field1625, this.field1626);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([B)V", line = 126)
    private final void method721(byte[] arg0) {
        class263 var2 = new class263(arg0);
        this.field1622 = var2.method1826(-206227536);
        this.field1627 = var2.method1826(-206227536);
        this.field1623 = var2.method1826(-206227536);
        this.field1625 = var2.method1826(-206227536);
        if (this.field1625 < 0) {
            this.field1625 = ~this.field1625;
            this.field1626 = true;
        }
        int var3 = var2.method1826(-206227536);
        this.field1633 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1787(false);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1812(0, 76, var5, var7);
            this.field1633[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)F", line = 169)
    public static final float method722(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([BI)V", line = 185)
    private static final void method723(byte[] arg0, int arg1) {
        field1611 = arg0;
        field1628 = arg1;
        field1606 = 0;
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)[F", line = 192)
    private final float[] method724(int arg0) {
        method723(this.field1633[arg0], 0);
        method719();
        int var2 = method718(class54.method358(field1619.length - 1, 320));
        boolean var3 = field1634[var2];
        int var4 = var3 ? field1615 : field1616;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method719() != 0;
            var6 = method719() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field1616 >> 2);
            var9 = (field1616 >> 2) + (var4 >> 2);
            var10 = field1616 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field1616 >> 2);
            var12 = (field1616 >> 2) + (var4 - (var4 >> 2));
            var13 = field1616 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class1 var14 = field1617[field1619[var2]];
        int var15 = var14.field2;
        int var16 = var14.field3[var15];
        boolean var17 = !field1610[var16].method1600();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field4; var19++) {
            class39 var20 = field1630[var14.field1[var19]];
            float[] var21 = field1612;
            var20.method267(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field2;
            int var23 = var14.field3[var22];
            field1610[var23].method1599(field1612, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field1612[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field1612;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field1629 : field1618;
            float[] var32 = var3 ? field1614 : field1636;
            float[] var33 = var3 ? field1631 : field1609;
            int[] var34 = var3 ? field1632 : field1613;
            for (int var35 = 0; var35 < var26; var35++) {
                float var36 = var28[var35 * 4] - var28[var4 - var35 * 4 - 1];
                float var37 = var28[var35 * 4 + 2] - var28[var4 - var35 * 4 - 3];
                float var38 = var31[var35 * 2];
                float var39 = var31[var35 * 2 + 1];
                var28[var4 - var35 * 4 - 1] = var36 * var38 - var37 * var39;
                var28[var4 - var35 * 4 - 3] = var36 * var39 + var37 * var38;
            }
            for (int var40 = 0; var40 < var27; var40++) {
                float var41 = var28[var40 * 4 + var25 + 3];
                float var42 = var28[var40 * 4 + var25 + 1];
                float var43 = var28[var40 * 4 + 3];
                float var44 = var28[var40 * 4 + 1];
                var28[var40 * 4 + var25 + 3] = var41 + var43;
                var28[var40 * 4 + var25 + 1] = var42 + var44;
                float var45 = var31[var25 - var40 * 4 - 4];
                float var46 = var31[var25 - var40 * 4 - 3];
                var28[var40 * 4 + 3] = (var41 - var43) * var45 - (var42 - var44) * var46;
                var28[var40 * 4 + 1] = (var41 - var43) * var46 + (var42 - var44) * var45;
            }
            int var47 = class54.method358(var4 - 1, 320);
            for (int var48 = 0; var48 < var47 - 3; var48++) {
                int var49 = var4 >> var48 + 2;
                int var50 = 0x8 << var48;
                for (int var51 = 0; var51 < 0x2 << var48; var51++) {
                    int var52 = var4 - var49 * 2 * var51;
                    int var53 = var4 - (var51 * 2 + 1) * var49;
                    for (int var54 = 0; var54 < var4 >> var48 + 4; var54++) {
                        int var55 = var54 * 4;
                        float var56 = var28[var52 - var55 - 1];
                        float var57 = var28[var52 - var55 - 3];
                        float var58 = var28[var53 - var55 - 1];
                        float var59 = var28[var53 - var55 - 3];
                        var28[var52 - var55 - 1] = var56 + var58;
                        var28[var52 - var55 - 3] = var57 + var59;
                        float var60 = var31[var50 * var54];
                        float var61 = var31[var50 * var54 + 1];
                        var28[var53 - var55 - 1] = (var56 - var58) * var60 - (var57 - var59) * var61;
                        var28[var53 - var55 - 3] = (var56 - var58) * var61 + (var57 - var59) * var60;
                    }
                }
            }
            for (int var62 = 1; var62 < var27 - 1; var62++) {
                int var63 = var34[var62];
                if (var62 < var63) {
                    int var64 = var62 * 8;
                    int var65 = var63 * 8;
                    float var66 = var28[var64 + 1];
                    var28[var64 + 1] = var28[var65 + 1];
                    var28[var65 + 1] = var66;
                    float var67 = var28[var64 + 3];
                    var28[var64 + 3] = var28[var65 + 3];
                    var28[var65 + 3] = var67;
                    float var68 = var28[var64 + 5];
                    var28[var64 + 5] = var28[var65 + 5];
                    var28[var65 + 5] = var68;
                    float var69 = var28[var64 + 7];
                    var28[var64 + 7] = var28[var65 + 7];
                    var28[var65 + 7] = var69;
                }
            }
            for (int var70 = 0; var70 < var25; var70++) {
                var28[var70] = var28[var70 * 2 + 1];
            }
            for (int var71 = 0; var71 < var27; var71++) {
                var28[var4 - var71 * 2 - 1] = var28[var71 * 4];
                var28[var4 - var71 * 2 - 2] = var28[var71 * 4 + 1];
                var28[var4 - var26 - var71 * 2 - 1] = var28[var71 * 4 + 2];
                var28[var4 - var26 - var71 * 2 - 2] = var28[var71 * 4 + 3];
            }
            for (int var72 = 0; var72 < var27; var72++) {
                float var73 = var33[var72 * 2];
                float var74 = var33[var72 * 2 + 1];
                float var75 = var28[var72 * 2 + var25];
                float var76 = var28[var72 * 2 + var25 + 1];
                float var77 = var28[var4 - var72 * 2 - 2];
                float var78 = var28[var4 - var72 * 2 - 1];
                float var79 = (var75 - var77) * var74 + (var76 + var78) * var73;
                var28[var72 * 2 + var25] = (var75 + var77 + var79) * 0.5F;
                var28[var4 - var72 * 2 - 2] = (var75 + var77 - var79) * 0.5F;
                float var80 = (var76 + var78) * var74 - (var75 - var77) * var73;
                var28[var72 * 2 + var25 + 1] = (var76 + var80 - var78) * 0.5F;
                var28[var4 - var72 * 2 - 1] = (var78 + var80 - var76) * 0.5F;
            }
            for (int var81 = 0; var81 < var26; var81++) {
                var28[var81] = var32[var81 * 2] * var28[var81 * 2 + var25] + var32[var81 * 2 + 1] * var28[var81 * 2 + var25 + 1];
                var28[var25 - var81 - 1] = var28[var81 * 2 + var25] * var32[var81 * 2 + 1] - var32[var81 * 2] * var28[var81 * 2 + var25 + 1];
            }
            for (int var82 = 0; var82 < var26; var82++) {
                var28[var4 + var82 - var26] = -var28[var82];
            }
            for (int var83 = 0; var83 < var26; var83++) {
                var28[var83] = var28[var26 + var83];
            }
            for (int var84 = 0; var84 < var26; var84++) {
                var28[var26 + var84] = -var28[var26 - var84 - 1];
            }
            for (int var85 = 0; var85 < var26; var85++) {
                var28[var25 + var85] = var28[var4 - var85 - 1];
            }
            for (int var86 = var8; var86 < var9; var86++) {
                float var87 = (float) Math.sin(((double) (var86 - var8) + 0.5D) / (double) var10 * 0.5D * 3.141592653589793D);
                field1612[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field1612[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field1608 > 0) {
            int var91 = this.field1608 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field1605) {
                for (int var92 = 0; var92 < this.field1624; var92++) {
                    int var93 = (this.field1608 >> 1) + var92;
                    var90[var92] += this.field1607[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field1612[var94];
                }
            }
        }
        float[] var96 = this.field1607;
        this.field1607 = field1612;
        field1612 = var96;
        this.field1608 = var4;
        this.field1624 = var12 - (var4 >> 1);
        this.field1605 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "()V", line = 610)
    public static void method725() {
        field1611 = null;
        field1620 = null;
        field1610 = null;
        field1630 = null;
        field1617 = null;
        field1634 = null;
        field1619 = null;
        field1612 = null;
        field1618 = null;
        field1636 = null;
        field1609 = null;
        field1629 = null;
        field1614 = null;
        field1631 = null;
        field1613 = null;
        field1632 = null;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "([B)V", line = 629)
    private static final void method726(byte[] arg0) {
        method723(arg0, 0);
        field1616 = 0x1 << method718(4);
        field1615 = 0x1 << method718(4);
        field1612 = new float[field1615];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field1616 : field1615;
            int var3 = var2 >> 1;
            int var4 = var2 >> 2;
            int var5 = var2 >> 3;
            float[] var6 = new float[var3];
            for (int var7 = 0; var7 < var4; var7++) {
                var6[var7 * 2] = (float) Math.cos((double) (var7 * 4) * 3.141592653589793D / (double) var2);
                var6[var7 * 2 + 1] = -((float) Math.sin((double) (var7 * 4) * 3.141592653589793D / (double) var2));
            }
            float[] var8 = new float[var3];
            for (int var9 = 0; var9 < var4; var9++) {
                var8[var9 * 2] = (float) Math.cos((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
                var8[var9 * 2 + 1] = (float) Math.sin((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
            }
            float[] var10 = new float[var4];
            for (int var11 = 0; var11 < var5; var11++) {
                var10[var11 * 2] = (float) Math.cos((double) (var11 * 4 + 2) * 3.141592653589793D / (double) var2);
                var10[var11 * 2 + 1] = -((float) Math.sin((double) (var11 * 4 + 2) * 3.141592653589793D / (double) var2));
            }
            int[] var12 = new int[var5];
            int var13 = class54.method358(var5 - 1, 320);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class257.method1747(var14, (byte) 34, var13);
            }
            if (var1 == 0) {
                field1618 = var6;
                field1636 = var8;
                field1609 = var10;
                field1613 = var12;
            } else {
                field1629 = var6;
                field1614 = var8;
                field1631 = var10;
                field1632 = var12;
            }
        }
        int var15 = method718(8) + 1;
        field1620 = new class312[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field1620[var16] = new class312();
        }
        int var17 = method718(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method718(16);
        }
        int var19 = method718(6) + 1;
        field1610 = new class232[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field1610[var20] = new class232();
        }
        int var21 = method718(6) + 1;
        field1630 = new class39[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field1630[var22] = new class39();
        }
        int var23 = method718(6) + 1;
        field1617 = new class1[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field1617[var24] = new class1();
        }
        int var25 = method718(6) + 1;
        field1634 = new boolean[var25];
        field1619 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field1634[var26] = method719() != 0;
            method718(16);
            method718(16);
            field1619[var26] = method718(8);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Llm;)Z", line = 780)
    private static final boolean method727(class210 arg0) {
        if (!field1621) {
            byte[] var1 = arg0.method1441(0, (byte) -44, 0);
            if (var1 == null) {
                return false;
            }
            method726(var1);
            field1621 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "([B)V", line = 801)
    private class102(byte[] arg0) {
        this.method721(arg0);
    }
}
