import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class125 extends class359 {

    @OriginalMember(owner = "client!jd", name = "J", descriptor = "Z")
    private static boolean field1676 = false;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    private static int field1653;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    private int field1654;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    private int field1656;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    private int field1660;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
    private static int field1661;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
    private int field1662;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
    private static int field1663;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
    private int field1666;

    @OriginalMember(owner = "client!jd", name = "I", descriptor = "I")
    private int field1675;

    @OriginalMember(owner = "client!jd", name = "K", descriptor = "I")
    private static int field1677;

    @OriginalMember(owner = "client!jd", name = "O", descriptor = "I")
    private int field1681;

    @OriginalMember(owner = "client!jd", name = "P", descriptor = "I")
    private int field1682;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "Z")
    private boolean field1655;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "Z")
    private boolean field1667;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "[B")
    private static byte[] field1649;

    @OriginalMember(owner = "client!jd", name = "N", descriptor = "[B")
    private byte[] field1680;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "[F")
    private static float[] field1652;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "[F")
    private static float[] field1657;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "[F")
    private static float[] field1664;

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "[F")
    private static float[] field1669;

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "[F")
    private static float[] field1670;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "[F")
    private static float[] field1672;

    @OriginalMember(owner = "client!jd", name = "L", descriptor = "[F")
    private static float[] field1678;

    @OriginalMember(owner = "client!jd", name = "M", descriptor = "[F")
    private float[] field1679;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "[I")
    private static int[] field1651;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "[I")
    private static int[] field1659;

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "[I")
    private static int[] field1673;

    @OriginalMember(owner = "client!jd", name = "H", descriptor = "[Ll;")
    private static class14[] field1674;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "[Leh;")
    private static class202[] field1658;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "[Lvo;")
    public static class28[] field1665;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "[Lcm;")
    private static class432[] field1650;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "[Z")
    private static boolean[] field1668;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "[[B")
    private byte[][] field1671;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([BI)V", line = 3)
    private static final void method703(byte[] arg0, int arg1) {
        field1649 = arg0;
        field1677 = arg1;
        field1663 = 0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lra;)Z", line = 8)
    private static final boolean method704(class57 arg0) {
        if (!field1676) {
            byte[] var1 = arg0.method361(0, 71, 0);
            if (var1 == null) {
                return false;
            }
            method710(var1);
            field1676 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)F", line = 27)
    public static final float method705(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)[F", line = 39)
    private final float[] method706(int arg0) {
        method703(this.field1671[arg0], 0);
        method709();
        int var2 = method707(class401.method2539(true, field1673.length - 1));
        boolean var3 = field1668[var2];
        int var4 = var3 ? field1661 : field1653;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method709() != 0;
            var6 = method709() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field1653 >> 2);
            var9 = (field1653 >> 2) + (var4 >> 2);
            var10 = field1653 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field1653 >> 2);
            var12 = (field1653 >> 2) + (var4 - (var4 >> 2));
            var13 = field1653 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class432 var14 = field1650[field1673[var2]];
        int var15 = var14.field6243;
        int var16 = var14.field6245[var15];
        boolean var17 = !field1658[var16].method1295();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field6244; var19++) {
            class14 var95 = field1674[var14.field6242[var19]];
            float[] var96 = field1670;
            var95.method99(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field6243;
            int var21 = var14.field6245[var20];
            field1658[var21].method1298(field1670, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field1670[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field1670;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field1657 : field1672;
            float[] var30 = var3 ? field1669 : field1678;
            float[] var31 = var3 ? field1664 : field1652;
            int[] var32 = var3 ? field1659 : field1651;
            for (int var33 = 0; var33 < var24; var33++) {
                float var91 = var26[var33 * 4] - var26[var4 - var33 * 4 - 1];
                float var92 = var26[var33 * 4 + 2] - var26[var4 - var33 * 4 - 3];
                float var93 = var29[var33 * 2];
                float var94 = var29[var33 * 2 + 1];
                var26[var4 - var33 * 4 - 1] = var91 * var93 - var92 * var94;
                var26[var4 - var33 * 4 - 3] = var91 * var94 + var92 * var93;
            }
            for (int var34 = 0; var34 < var25; var34++) {
                float var85 = var26[var34 * 4 + var23 + 3];
                float var86 = var26[var34 * 4 + var23 + 1];
                float var87 = var26[var34 * 4 + 3];
                float var88 = var26[var34 * 4 + 1];
                var26[var34 * 4 + var23 + 3] = var85 + var87;
                var26[var34 * 4 + var23 + 1] = var86 + var88;
                float var89 = var29[var23 - var34 * 4 - 4];
                float var90 = var29[var23 - var34 * 4 - 3];
                var26[var34 * 4 + 3] = (var85 - var87) * var89 - (var86 - var88) * var90;
                var26[var34 * 4 + 1] = (var85 - var87) * var90 + (var86 - var88) * var89;
            }
            int var35 = class401.method2539(true, var4 - 1);
            for (int var36 = 0; var36 < var35 - 3; var36++) {
                int var72 = var4 >> var36 + 2;
                int var73 = 0x8 << var36;
                for (int var74 = 0; var74 < 0x2 << var36; var74++) {
                    int var75 = var4 - var72 * 2 * var74;
                    int var76 = var4 - (var74 * 2 + 1) * var72;
                    for (int var77 = 0; var77 < var4 >> var36 + 4; var77++) {
                        int var78 = var77 * 4;
                        float var79 = var26[var75 - var78 - 1];
                        float var80 = var26[var75 - var78 - 3];
                        float var81 = var26[var76 - var78 - 1];
                        float var82 = var26[var76 - var78 - 3];
                        var26[var75 - var78 - 1] = var79 + var81;
                        var26[var75 - var78 - 3] = var80 + var82;
                        float var83 = var29[var73 * var77];
                        float var84 = var29[var73 * var77 + 1];
                        var26[var76 - var78 - 1] = (var79 - var81) * var83 - (var80 - var82) * var84;
                        var26[var76 - var78 - 3] = (var79 - var81) * var84 + (var80 - var82) * var83;
                    }
                }
            }
            for (int var37 = 1; var37 < var25 - 1; var37++) {
                int var65 = var32[var37];
                if (var37 < var65) {
                    int var66 = var37 * 8;
                    int var67 = var65 * 8;
                    float var68 = var26[var66 + 1];
                    var26[var66 + 1] = var26[var67 + 1];
                    var26[var67 + 1] = var68;
                    float var69 = var26[var66 + 3];
                    var26[var66 + 3] = var26[var67 + 3];
                    var26[var67 + 3] = var69;
                    float var70 = var26[var66 + 5];
                    var26[var66 + 5] = var26[var67 + 5];
                    var26[var67 + 5] = var70;
                    float var71 = var26[var66 + 7];
                    var26[var66 + 7] = var26[var67 + 7];
                    var26[var67 + 7] = var71;
                }
            }
            for (int var38 = 0; var38 < var23; var38++) {
                var26[var38] = var26[var38 * 2 + 1];
            }
            for (int var39 = 0; var39 < var25; var39++) {
                var26[var4 - var39 * 2 - 1] = var26[var39 * 4];
                var26[var4 - var39 * 2 - 2] = var26[var39 * 4 + 1];
                var26[var4 - var24 - var39 * 2 - 1] = var26[var39 * 4 + 2];
                var26[var4 - var24 - var39 * 2 - 2] = var26[var39 * 4 + 3];
            }
            for (int var40 = 0; var40 < var25; var40++) {
                float var57 = var31[var40 * 2];
                float var58 = var31[var40 * 2 + 1];
                float var59 = var26[var40 * 2 + var23];
                float var60 = var26[var40 * 2 + var23 + 1];
                float var61 = var26[var4 - var40 * 2 - 2];
                float var62 = var26[var4 - var40 * 2 - 1];
                float var63 = (var59 - var61) * var58 + (var60 + var62) * var57;
                var26[var40 * 2 + var23] = (var59 + var61 + var63) * 0.5F;
                var26[var4 - var40 * 2 - 2] = (var59 + var61 - var63) * 0.5F;
                float var64 = (var60 + var62) * var58 - (var59 - var61) * var57;
                var26[var40 * 2 + var23 + 1] = (var60 + var64 - var62) * 0.5F;
                var26[var4 - var40 * 2 - 1] = (var62 + var64 - var60) * 0.5F;
            }
            for (int var41 = 0; var41 < var24; var41++) {
                var26[var41] = var30[var41 * 2] * var26[var41 * 2 + var23] + var30[var41 * 2 + 1] * var26[var41 * 2 + var23 + 1];
                var26[var23 - var41 - 1] = var26[var41 * 2 + var23] * var30[var41 * 2 + 1] - var30[var41 * 2] * var26[var41 * 2 + var23 + 1];
            }
            for (int var42 = 0; var42 < var24; var42++) {
                var26[var4 + var42 - var24] = -var26[var42];
            }
            for (int var43 = 0; var43 < var24; var43++) {
                var26[var43] = var26[var24 + var43];
            }
            for (int var44 = 0; var44 < var24; var44++) {
                var26[var24 + var44] = -var26[var24 - var44 - 1];
            }
            for (int var45 = 0; var45 < var24; var45++) {
                var26[var23 + var45] = var26[var4 - var45 - 1];
            }
            for (int var46 = var8; var46 < var9; var46++) {
                float var56 = (float) Math.sin(((double) (var46 - var8) + 0.5D) / (double) var10 * 0.5D * 3.141592653589793D);
                field1670[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field1670[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field1654 > 0) {
            int var49 = this.field1654 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field1655) {
                for (int var50 = 0; var50 < this.field1656; var50++) {
                    int var51 = (this.field1654 >> 1) + var50;
                    var48[var50] += this.field1679[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field1670[var52];
                }
            }
        }
        float[] var54 = this.field1679;
        this.field1679 = field1670;
        field1670 = var54;
        this.field1654 = var4;
        this.field1656 = var12 - (var4 >> 1);
        this.field1655 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)I", line = 454)
    public static final int method707(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field1663) {
            int var4 = 8 - field1663;
            int var5 = (0x1 << var4) - 1;
            var1 += (field1649[field1677] >> field1663 & var5) << var2;
            field1663 = 0;
            field1677++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field1649[field1677] >> field1663 & var3) << var2;
            field1663 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lra;II)Ljd;", line = 486)
    public static final class125 method708(class57 arg0, int arg1, int arg2) {
        if (method704(arg0)) {
            byte[] var3 = arg0.method361(arg1, 48, arg2);
            return var3 == null ? null : new class125(var3);
        } else {
            arg0.method355(arg2, arg1, -4013);
            return null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "()I", line = 501)
    public static final int method709() {
        int var0 = field1649[field1677] >> field1663 & 0x1;
        field1663++;
        field1677 += field1663 >> 3;
        field1663 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([B)V", line = 509)
    private static final void method710(byte[] arg0) {
        method703(arg0, 0);
        field1653 = 0x1 << method707(4);
        field1661 = 0x1 << method707(4);
        field1670 = new float[field1661];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field1653 : field1661;
            int var15 = var14 >> 1;
            int var16 = var14 >> 2;
            int var17 = var14 >> 3;
            float[] var18 = new float[var15];
            for (int var19 = 0; var19 < var16; var19++) {
                var18[var19 * 2] = (float) Math.cos((double) (var19 * 4) * 3.141592653589793D / (double) var14);
                var18[var19 * 2 + 1] = -((float) Math.sin((double) (var19 * 4) * 3.141592653589793D / (double) var14));
            }
            float[] var20 = new float[var15];
            for (int var21 = 0; var21 < var16; var21++) {
                var20[var21 * 2] = (float) Math.cos((double) (var21 * 2 + 1) * 3.141592653589793D / (double) (var14 * 2));
                var20[var21 * 2 + 1] = (float) Math.sin((double) (var21 * 2 + 1) * 3.141592653589793D / (double) (var14 * 2));
            }
            float[] var22 = new float[var16];
            for (int var23 = 0; var23 < var17; var23++) {
                var22[var23 * 2] = (float) Math.cos((double) (var23 * 4 + 2) * 3.141592653589793D / (double) var14);
                var22[var23 * 2 + 1] = -((float) Math.sin((double) (var23 * 4 + 2) * 3.141592653589793D / (double) var14));
            }
            int[] var24 = new int[var17];
            int var25 = class401.method2539(true, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class270.method1716(var26, 107, var25);
            }
            if (var1 == 0) {
                field1672 = var18;
                field1678 = var20;
                field1652 = var22;
                field1651 = var24;
            } else {
                field1657 = var18;
                field1669 = var20;
                field1664 = var22;
                field1659 = var24;
            }
        }
        int var2 = method707(8) + 1;
        field1665 = new class28[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1665[var3] = new class28();
        }
        int var4 = method707(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method707(16);
        }
        int var6 = method707(6) + 1;
        field1658 = new class202[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field1658[var7] = new class202();
        }
        int var8 = method707(6) + 1;
        field1674 = new class14[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field1674[var9] = new class14();
        }
        int var10 = method707(6) + 1;
        field1650 = new class432[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field1650[var11] = new class432();
        }
        int var12 = method707(6) + 1;
        field1668 = new boolean[var12];
        field1673 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field1668[var13] = method709() != 0;
            method707(16);
            method707(16);
            field1673[var13] = method707(8);
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "([B)V", line = 672)
    private final void method711(byte[] arg0) {
        class211 var2 = new class211(arg0);
        this.field1675 = var2.method1336((byte) -73);
        this.field1662 = var2.method1336((byte) -88);
        this.field1666 = var2.method1336((byte) -73);
        this.field1660 = var2.method1336((byte) -99);
        if (this.field1660 < 0) {
            this.field1660 = ~this.field1660;
            this.field1667 = true;
        }
        int var3 = var2.method1336((byte) -43);
        this.field1671 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1342((byte) -126);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1370(var7, 0, 19294, var5);
            this.field1671[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "()V", line = 717)
    public static void method712() {
        field1649 = null;
        field1665 = null;
        field1658 = null;
        field1674 = null;
        field1650 = null;
        field1668 = null;
        field1673 = null;
        field1670 = null;
        field1672 = null;
        field1678 = null;
        field1652 = null;
        field1657 = null;
        field1669 = null;
        field1664 = null;
        field1651 = null;
        field1659 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([I)Lfp;", line = 739)
    public final class177 method713(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field1680 == null) {
            this.field1654 = 0;
            this.field1679 = new float[field1661];
            this.field1680 = new byte[this.field1662];
            this.field1681 = 0;
            this.field1682 = 0;
        }
        while (this.field1682 < this.field1671.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method706(this.field1682);
            if (var3 != null) {
                int var4 = this.field1681;
                int var5 = var3.length;
                if (var5 > this.field1662 - var4) {
                    var5 = this.field1662 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field1680[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field1681;
                }
                this.field1681 = var4;
            }
            this.field1682++;
        }
        this.field1679 = null;
        byte[] var2 = this.field1680;
        this.field1680 = null;
        return new class177(this.field1675, var2, this.field1666, this.field1660, this.field1667);
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "([B)V", line = 803)
    private class125(byte[] arg0) {
        this.method711(arg0);
    }
}
