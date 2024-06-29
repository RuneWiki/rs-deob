import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class464 {

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "[I")
    private int[] field6743;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "[I")
    private int[] field6747;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "Lbd;")
    public static class44 field6742 = new class44(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    private int field6735;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field6736;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field6737;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    private int field6739;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field6740;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    private int field6741;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    private int field6745;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field6746;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public static int field6748;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "Lci;")
    public static class320 field6744;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lwn;Z)Lbu;")
    public static final class17 method2750(class519 arg0, boolean arg1) {
        field6738++;
        if (arg1) {
            method2751(null, (byte) 77);
        }
        return new class17(arg0.method3044((byte) -115), arg0.method3044((byte) -106), arg0.method3044((byte) -128), arg0.method3044((byte) -124), arg0.method3040((byte) -3), arg0.method3040((byte) -3), arg0.method3072((byte) -119));
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lci;B)V")
    public static final void method2751(class320 arg0, byte arg1) {
        field6748++;
        class390.field5541 = arg0;
        if (arg1 >= -93) {
            method2751(null, (byte) -111);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)I")
    public final int method2752(int arg0) {
        field6746++;
        if (arg0 != -2) {
            method2751(null, (byte) -41);
        }
        if (this.field6735 == 0) {
            this.method2754(arg0 + 90);
            this.field6735 = 256;
        }
        return this.field6743[this.field6735 - 1];
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V")
    private final void method2753(int arg0) {
        field6734++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        int var10 = 0;
        if (arg0 >= -1) {
            return;
        }
        while (var10 < 4) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var7 + var8;
            int var63 = var6 + var61;
            int var64 = var62 ^ var7 >>> 2;
            int var65 = var5 + var64;
            int var66 = var7 + var63;
            int var67 = var66 ^ var63 << 8;
            int var68 = var63 + var65;
            int var69 = var4 + var67;
            var6 = var68 ^ var65 >>> 16;
            int var70 = var65 + var69;
            int var71 = var3 + var6;
            var5 = var70 ^ var69 << 10;
            int var72 = var2 + var5;
            int var73 = var69 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var72;
            var3 = var75 ^ var72 << 8;
            var8 = var3 + var64;
            int var76 = var72 + var74;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
            var10++;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field6743[var11 + 2] + var7;
            int var38 = this.field6743[var11 + 1] + var8;
            int var39 = this.field6743[var11 + 4] + var5;
            int var40 = this.field6743[var11] + var9;
            int var41 = this.field6743[var11 + 5] + var4;
            int var42 = this.field6743[var11 + 6] + var3;
            int var43 = this.field6743[var11 + 7] + var2;
            int var44 = this.field6743[var11 + 3] + var6;
            int var45 = var40 ^ var38 << 11;
            int var46 = var37 + var38;
            int var47 = var44 + var45;
            int var48 = var46 ^ var37 >>> 2;
            int var49 = var37 + var47;
            int var50 = var39 + var48;
            int var51 = var49 ^ var47 << 8;
            int var52 = var47 + var50;
            int var53 = var41 + var51;
            var6 = var52 ^ var50 >>> 16;
            int var54 = var6 + var42;
            int var55 = var50 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var53 + var54;
            int var57 = var5 + var43;
            var4 = var56 ^ var54 >>> 4;
            int var58 = var54 + var57;
            int var59 = var4 + var45;
            var3 = var58 ^ var57 << 8;
            int var60 = var57 + var59;
            var8 = var3 + var48;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var59;
            this.field6747[var11] = var9;
            this.field6747[var11 + 1] = var8;
            this.field6747[var11 + 2] = var7;
            this.field6747[var11 + 3] = var6;
            this.field6747[var11 + 4] = var5;
            this.field6747[var11 + 5] = var4;
            this.field6747[var11 + 6] = var3;
            this.field6747[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field6747[var12] + var9;
            int var14 = this.field6747[var12 + 7] + var2;
            int var15 = this.field6747[var12 + 3] + var6;
            int var16 = this.field6747[var12 + 1] + var8;
            int var17 = this.field6747[var12 + 6] + var3;
            int var18 = this.field6747[var12 + 2] + var7;
            int var19 = this.field6747[var12 + 4] + var5;
            int var20 = this.field6747[var12 + 5] + var4;
            int var21 = var13 ^ var16 << 11;
            int var22 = var16 + var18;
            int var23 = var15 + var21;
            int var24 = var22 ^ var18 >>> 2;
            int var25 = var18 + var23;
            int var26 = var19 + var24;
            int var27 = var25 ^ var23 << 8;
            int var28 = var20 + var27;
            int var29 = var23 + var26;
            var6 = var29 ^ var26 >>> 16;
            int var30 = var6 + var17;
            int var31 = var26 + var28;
            var5 = var31 ^ var28 << 10;
            int var32 = var5 + var14;
            int var33 = var28 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var4 + var21;
            int var35 = var30 + var32;
            var3 = var35 ^ var32 << 8;
            int var36 = var32 + var34;
            var8 = var3 + var24;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            var7 = var2 + var27;
            this.field6747[var12] = var9;
            this.field6747[var12 + 1] = var8;
            this.field6747[var12 + 2] = var7;
            this.field6747[var12 + 3] = var6;
            this.field6747[var12 + 4] = var5;
            this.field6747[var12 + 5] = var4;
            this.field6747[var12 + 6] = var3;
            this.field6747[var12 + 7] = var2;
        }
        this.method2754(-101);
        this.field6735 = 256;
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)V")
    private final void method2754(int arg0) {
        field6740++;
        this.field6745 += ++this.field6741;
        int var2 = -110 % ((-arg0 - 59) / 42);
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = this.field6747[var3];
            if ((var3 & 0x2) == 0) {
                if ((var3 & 0x1) == 0) {
                    this.field6739 ^= this.field6739 << 13;
                } else {
                    this.field6739 ^= this.field6739 >>> 6;
                }
            } else if ((var3 & 0x1) == 0) {
                this.field6739 ^= this.field6739 << 2;
            } else {
                this.field6739 ^= this.field6739 >>> 16;
            }
            this.field6739 += this.field6747[var3 + 128 & 0xFF];
            int var5;
            this.field6747[var3] = var5 = this.field6747[class168.method1203(1020, var4) >> 2] + this.field6739 + this.field6745;
            this.field6743[var3] = this.field6745 = var4 + this.field6747[class168.method1203(255, var5 >> 8 >> 2)];
        }
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)I")
    public final int method2755(int arg0) {
        if (arg0 != 1209616038) {
            method2751(null, (byte) 16);
        }
        if (this.field6735 == 0) {
            this.method2754(arg0 - 1209616164);
            this.field6735 = 256;
        }
        field6737++;
        return this.field6743[--this.field6735];
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V")
    public static void method2756(boolean arg0) {
        if (arg0) {
            method2751(null, (byte) -15);
        }
        field6742 = null;
        field6744 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIII)V")
    public static final void method2757(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class424.field5996 = arg4;
        class176.field2630 = arg1;
        class465.field6763 = arg0;
        field6736++;
        class333.field4936 = arg2;
        if (arg3 != -257) {
            field6742 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
    private class464() {
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "([I)V")
    public class464(int[] arg0) {
        this.field6743 = new int[256];
        this.field6747 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field6743[var2] = arg0[var2];
        }
        this.method2753(-28);
    }
}
