import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class479 {

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "[I")
    private int[] field6598;

    @OriginalMember(owner = "client!ar", name = "m", descriptor = "[I")
    private int[] field6609;

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "Lvj;")
    public static class304 field6600 = new class304("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!ar", name = "n", descriptor = "Lvj;")
    public static class304 field6610 = new class304("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "I")
    private int field6597;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "I")
    public static int field6599;

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "I")
    public static int field6601;

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "I")
    private int field6602;

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "I")
    public static int field6603;

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "I")
    public static int field6604;

    @OriginalMember(owner = "client!ar", name = "i", descriptor = "I")
    public static int field6605;

    @OriginalMember(owner = "client!ar", name = "j", descriptor = "I")
    public static int field6606;

    @OriginalMember(owner = "client!ar", name = "k", descriptor = "I")
    private int field6607;

    @OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
    private int field6608;

    @OriginalMember(owner = "client!ar", name = "o", descriptor = "I")
    public static int field6611;

    @OriginalMember(owner = "client!ar", name = "p", descriptor = "I")
    public static int field6612;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)V")
    public static void method2744(byte arg0) {
        field6610 = null;
        if (arg0 != 87) {
            method2747(false, -33);
        }
        field6600 = null;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(II)S")
    public static final short method2745(int arg0, int arg1) {
        field6605++;
        int var2 = arg1 >> 10 & 0x3F;
        int var3 = -54 / ((-arg0 - 16) / 48);
        int var4 = arg1 >> 3 & 0x70;
        int var5 = arg1 & 0x7F;
        int var6 = var5 <= 64 ? var4 * var5 >> 7 : (127 - var5) * var4 >> 7;
        int var7 = var5 + var6;
        int var8;
        if (var7 == 0) {
            var8 = var6 << 1;
        } else {
            var8 = (var6 << 8) / var7;
        }
        return (short) (var7 | var8 >> 4 << 7 | var2 << 10);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Z)V")
    private final void method2746(boolean arg0) {
        field6603++;
        this.field6597 += ++this.field6602;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field6598[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field6607 ^= this.field6607 << 13;
                } else {
                    this.field6607 ^= this.field6607 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field6607 ^= this.field6607 << 2;
            } else {
                this.field6607 ^= this.field6607 >>> 16;
            }
            this.field6607 += this.field6598[var2 + 128 & 0xFF];
            int var4;
            this.field6598[var2] = var4 = this.field6597 + this.field6598[class494.method2839(1020, var3) >> 2] + this.field6607;
            this.field6609[var2] = this.field6597 = var3 + this.field6598[class494.method2839(261125, var4) >> 8 >> 2];
        }
        if (!arg0) {
            method2747(false, -87);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZI)Lsj;")
    public static final class318 method2747(boolean arg0, int arg1) {
        field6599++;
        if (arg0) {
            method2745(-90, -23);
        }
        class318 var2 = (class318) class327.field4325.method1515(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class48.field752.method2708(arg1, 0, (byte) 54);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class318 var4 = class515.method3039(true, var3);
            class327.field4325.method1518(var4, (byte) 123, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)I")
    public final int method2748(int arg0) {
        if (this.field6608 == 0) {
            this.method2746(true);
            this.field6608 = 256;
        }
        if (arg0 < 114) {
            method2747(true, -110);
        }
        field6606++;
        return this.field6609[--this.field6608];
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)I")
    public final int method2749(int arg0) {
        field6611++;
        if (arg0 >= -37) {
            return -63;
        }
        if (this.field6608 == 0) {
            this.method2746(true);
            this.field6608 = 256;
        }
        return this.field6609[this.field6608 - 1];
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(Z)V")
    private final void method2750(boolean arg0) {
        field6601++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var6 + var61;
            int var63 = var7 + var8;
            int var64 = var63 ^ var7 >>> 2;
            int var65 = var7 + var62;
            int var66 = var5 + var64;
            int var67 = var65 ^ var62 << 8;
            int var68 = var62 + var66;
            int var69 = var4 + var67;
            var6 = var68 ^ var66 >>> 16;
            int var70 = var3 + var6;
            int var71 = var66 + var69;
            var5 = var71 ^ var69 << 10;
            int var72 = var2 + var5;
            int var73 = var69 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var72;
            var3 = var75 ^ var72 << 8;
            int var76 = var72 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field6609[var11 + 3] + var6;
            int var38 = this.field6609[var11 + 1] + var8;
            int var39 = this.field6609[var11 + 6] + var3;
            int var40 = this.field6609[var11] + var9;
            int var41 = this.field6609[var11 + 7] + var2;
            int var42 = this.field6609[var11 + 5] + var4;
            int var43 = this.field6609[var11 + 4] + var5;
            int var44 = this.field6609[var11 + 2] + var7;
            int var45 = var40 ^ var38 << 11;
            int var46 = var37 + var45;
            int var47 = var38 + var44;
            int var48 = var47 ^ var44 >>> 2;
            int var49 = var44 + var46;
            int var50 = var43 + var48;
            int var51 = var49 ^ var46 << 8;
            int var52 = var46 + var50;
            int var53 = var42 + var51;
            var6 = var52 ^ var50 >>> 16;
            int var54 = var50 + var53;
            int var55 = var6 + var39;
            var5 = var54 ^ var53 << 10;
            int var56 = var53 + var55;
            int var57 = var5 + var41;
            var4 = var56 ^ var55 >>> 4;
            int var58 = var4 + var45;
            int var59 = var55 + var57;
            var3 = var59 ^ var57 << 8;
            var8 = var3 + var48;
            int var60 = var57 + var58;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field6598[var11] = var9;
            this.field6598[var11 + 1] = var8;
            this.field6598[var11 + 2] = var7;
            this.field6598[var11 + 3] = var6;
            this.field6598[var11 + 4] = var5;
            this.field6598[var11 + 5] = var4;
            this.field6598[var11 + 6] = var3;
            this.field6598[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field6598[var12 + 7] + var2;
            int var14 = this.field6598[var12 + 3] + var6;
            int var15 = this.field6598[var12 + 1] + var8;
            int var16 = this.field6598[var12 + 5] + var4;
            int var17 = this.field6598[var12 + 4] + var5;
            int var18 = this.field6598[var12 + 6] + var3;
            int var19 = this.field6598[var12] + var9;
            int var20 = this.field6598[var12 + 2] + var7;
            int var21 = var19 ^ var15 << 11;
            int var22 = var14 + var21;
            int var23 = var15 + var20;
            int var24 = var23 ^ var20 >>> 2;
            int var25 = var20 + var22;
            int var26 = var17 + var24;
            int var27 = var25 ^ var22 << 8;
            int var28 = var22 + var26;
            int var29 = var16 + var27;
            var6 = var28 ^ var26 >>> 16;
            int var30 = var26 + var29;
            int var31 = var6 + var18;
            var5 = var30 ^ var29 << 10;
            int var32 = var29 + var31;
            int var33 = var5 + var13;
            var4 = var32 ^ var31 >>> 4;
            int var34 = var4 + var21;
            int var35 = var31 + var33;
            var3 = var35 ^ var33 << 8;
            var8 = var3 + var24;
            int var36 = var33 + var34;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field6598[var12] = var9;
            this.field6598[var12 + 1] = var8;
            this.field6598[var12 + 2] = var7;
            this.field6598[var12 + 3] = var6;
            this.field6598[var12 + 4] = var5;
            this.field6598[var12 + 5] = var4;
            this.field6598[var12 + 6] = var3;
            this.field6598[var12 + 7] = var2;
        }
        this.method2746(arg0);
        this.field6608 = 256;
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "()V")
    private class479() {
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "([I)V")
    public class479(int[] arg0) {
        this.field6598 = new int[256];
        this.field6609 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field6609[var2] = arg0[var2];
        }
        this.method2750(true);
    }
}
