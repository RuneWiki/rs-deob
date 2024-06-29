import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class11 {

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "[I")
    private int[] field148;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "[I")
    private int[] field154;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "Lce;")
    public static class126 field144 = class206.method1445(-7923, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field145 = -1;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field146 = 0;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field153 = 0;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "S")
    public static short field152 = 205;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    private int field150;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    private int field155;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    private int field156;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    private int field157;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB)V", line = 21)
    public static final void method63(int arg0, byte arg1) {
        field151++;
        class192 var2 = (class192) class95.field1496.method1631(false, (long) arg0);
        if (var2 == null) {
            return;
        }
        int var3 = -120 / ((47 - arg1) / 52);
        for (int var4 = 0; var4 < var2.field3281.length; var4++) {
            var2.field3281[var4] = -1;
            var2.field3278[var4] = 0;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V", line = 52)
    private final void method64(int arg0) {
        field149++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var11 = var9 ^ var8 << 11;
            int var12 = var6 + var11;
            int var13 = var7 + var8;
            int var14 = var13 ^ var7 >>> 2;
            int var15 = var5 + var14;
            int var16 = var7 + var12;
            int var17 = var16 ^ var12 << 8;
            int var18 = var12 + var15;
            int var19 = var4 + var17;
            var6 = var18 ^ var15 >>> 16;
            int var20 = var3 + var6;
            int var21 = var15 + var19;
            var5 = var21 ^ var19 << 10;
            int var22 = var19 + var20;
            var4 = var22 ^ var20 >>> 4;
            int var23 = var4 + var11;
            int var24 = var2 + var5;
            int var25 = var20 + var24;
            var3 = var25 ^ var24 << 8;
            var8 = var3 + var14;
            int var26 = var23 + var24;
            var2 = var26 ^ var23 >>> 9;
            var7 = var2 + var17;
            var9 = var8 + var23;
        }
        for (int var27 = arg0; var27 < 256; var27 += 8) {
            int var28 = this.field154[var27 + 3] + var6;
            int var29 = this.field154[var27 + 1] + var8;
            int var30 = this.field154[var27 + 6] + var3;
            int var31 = this.field154[var27 + 5] + var4;
            int var32 = this.field154[var27 + 4] + var5;
            int var33 = this.field154[var27] + var9;
            int var34 = this.field154[var27 + 2] + var7;
            int var35 = var33 ^ var29 << 11;
            int var36 = var28 + var35;
            int var37 = this.field154[var27 + 7] + var2;
            int var38 = var29 + var34;
            int var39 = var38 ^ var34 >>> 2;
            int var40 = var34 + var36;
            int var41 = var32 + var39;
            int var42 = var40 ^ var36 << 8;
            int var43 = var36 + var41;
            var6 = var43 ^ var41 >>> 16;
            int var44 = var31 + var42;
            int var45 = var6 + var30;
            int var46 = var41 + var44;
            var5 = var46 ^ var44 << 10;
            int var47 = var44 + var45;
            int var48 = var5 + var37;
            var4 = var47 ^ var45 >>> 4;
            int var49 = var45 + var48;
            int var50 = var4 + var35;
            var3 = var49 ^ var48 << 8;
            var8 = var3 + var39;
            int var51 = var48 + var50;
            var2 = var51 ^ var50 >>> 9;
            var9 = var8 + var50;
            this.field148[var27] = var9;
            var7 = var2 + var42;
            this.field148[var27 + 1] = var8;
            this.field148[var27 + 2] = var7;
            this.field148[var27 + 3] = var6;
            this.field148[var27 + 4] = var5;
            this.field148[var27 + 5] = var4;
            this.field148[var27 + 6] = var3;
            this.field148[var27 + 7] = var2;
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field148[var52] + var9;
            int var54 = this.field148[var52 + 3] + var6;
            int var55 = this.field148[var52 + 6] + var3;
            int var56 = this.field148[var52 + 7] + var2;
            int var57 = this.field148[var52 + 5] + var4;
            int var58 = this.field148[var52 + 2] + var7;
            int var59 = this.field148[var52 + 1] + var8;
            int var60 = var53 ^ var59 << 11;
            int var61 = var54 + var60;
            int var62 = var58 + var59;
            int var63 = this.field148[var52 + 4] + var5;
            int var64 = var62 ^ var58 >>> 2;
            int var65 = var58 + var61;
            int var66 = var63 + var64;
            int var67 = var65 ^ var61 << 8;
            int var68 = var57 + var67;
            int var69 = var61 + var66;
            var6 = var69 ^ var66 >>> 16;
            int var70 = var66 + var68;
            int var71 = var6 + var55;
            var5 = var70 ^ var68 << 10;
            int var72 = var68 + var71;
            var4 = var72 ^ var71 >>> 4;
            int var73 = var5 + var56;
            int var74 = var71 + var73;
            var3 = var74 ^ var73 << 8;
            int var75 = var4 + var60;
            int var76 = var73 + var75;
            var8 = var3 + var64;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
            this.field148[var52] = var9;
            this.field148[var52 + 1] = var8;
            this.field148[var52 + 2] = var7;
            this.field148[var52 + 3] = var6;
            this.field148[var52 + 4] = var5;
            this.field148[var52 + 5] = var4;
            this.field148[var52 + 6] = var3;
            this.field148[var52 + 7] = var2;
        }
        this.method67((byte) 116);
        this.field155 = 256;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V", line = 198)
    public static void method65(byte arg0) {
        int var1 = 89 / ((29 - arg0) / 52);
        field144 = null;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)I", line = 208)
    public final int method66(int arg0) {
        if (arg0 != 255) {
            method63(46, (byte) -64);
        }
        if (this.field155-- == 0) {
            this.method67((byte) 119);
            this.field155 = 255;
        }
        field143++;
        return this.field154[this.field155];
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V", line = 226)
    private final void method67(byte arg0) {
        field147++;
        this.field157 += ++this.field150;
        if (arg0 <= 114) {
            return;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field148[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field156 ^= this.field156 << 13;
                } else {
                    this.field156 ^= this.field156 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field156 ^= this.field156 << 2;
            } else {
                this.field156 ^= this.field156 >>> 16;
            }
            this.field156 += this.field148[var2 + 128 & 0xFF];
            int var4;
            this.field148[var2] = var4 = this.field148[class47.method289(var3 >> 2, 255)] - (-this.field156 - this.field157);
            this.field154[var2] = this.field157 = this.field148[class47.method289(255, var4 >> 8 >> 2)] + var3;
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V", line = 295)
    private class11() {
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "([I)V", line = 297)
    public class11(int[] arg0) {
        this.field148 = new int[256];
        this.field154 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field154[var2] = arg0[var2];
        }
        this.method64(0);
    }
}
