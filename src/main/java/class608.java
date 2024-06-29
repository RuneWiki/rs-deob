import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class608 {

    @OriginalMember(owner = "client!hr", name = "n", descriptor = "[I")
    private int[] field8544;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "[I")
    private int[] field8532;

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "I")
    public static int field8541 = 2;

    @OriginalMember(owner = "client!hr", name = "o", descriptor = "[I")
    public static int[] field8545 = new int[32];

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "B")
    public static byte field8531;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
    public static int field8533;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
    public static int field8534;

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
    public static int field8536;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
    private int field8537;

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
    public static int field8539;

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
    private int field8540;

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
    private int field8542;

    @OriginalMember(owner = "client!hr", name = "m", descriptor = "I")
    public static int field8543;

    @OriginalMember(owner = "client!hr", name = "p", descriptor = "I")
    private int field8546;

    @OriginalMember(owner = "client!hr", name = "q", descriptor = "I")
    public static int field8547;

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "Z")
    public static boolean field8535;

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "[I")
    public static int[] field8538;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILr;)V", line = 11)
    public static final void method3321(int arg0, class566 arg1) {
        class27.field402 = new class462[class286.field3558.length];
        if (arg0 != 8) {
            field8535 = false;
        }
        field8536++;
        for (int var2 = 0; var2 < class286.field3558.length; var2++) {
            int var3 = class286.field3558[var2];
            class595 var4 = class280.method1588(class337.field4323, var3, (byte) 32);
            class413 var5 = arg1.method989(var4, class661.method3716(class83.field1174, var3), true);
            class27.field402[var2] = new class462(var5, var4);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)I", line = 39)
    public final int method3322(int arg0) {
        if (this.field8537 == 0) {
            this.method3324(-1);
            this.field8537 = 256;
        }
        int var2 = 60 % ((69 - arg0) / 46);
        field8543++;
        return this.field8532[--this.field8537];
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)V", line = 62)
    private final void method3323(byte arg0) {
        field8533++;
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
            int var62 = var7 + var8;
            int var63 = var6 + var61;
            int var64 = var62 ^ var7 >>> 2;
            int var65 = var5 + var64;
            int var66 = var7 + var63;
            int var67 = var66 ^ var63 << 8;
            int var68 = var63 + var65;
            int var69 = var4 + var67;
            var6 = var68 ^ var65 >>> 16;
            int var70 = var3 + var6;
            int var71 = var65 + var69;
            var5 = var71 ^ var69 << 10;
            int var72 = var69 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var73;
            var3 = var75 ^ var73 << 8;
            var8 = var3 + var64;
            int var76 = var73 + var74;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field8532[var11 + 3] + var6;
            int var38 = this.field8532[var11 + 7] + var2;
            int var39 = this.field8532[var11] + var9;
            int var40 = this.field8532[var11 + 5] + var4;
            int var41 = this.field8532[var11 + 4] + var5;
            int var42 = this.field8532[var11 + 6] + var3;
            int var43 = this.field8532[var11 + 2] + var7;
            int var44 = this.field8532[var11 + 1] + var8;
            int var45 = var39 ^ var44 << 11;
            int var46 = var37 + var45;
            int var47 = var43 + var44;
            int var48 = var47 ^ var43 >>> 2;
            int var49 = var41 + var48;
            int var50 = var43 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var40 + var51;
            int var53 = var46 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var49 + var52;
            int var55 = var6 + var42;
            var5 = var54 ^ var52 << 10;
            int var56 = var52 + var55;
            int var57 = var5 + var38;
            var4 = var56 ^ var55 >>> 4;
            int var58 = var4 + var45;
            int var59 = var55 + var57;
            var3 = var59 ^ var57 << 8;
            int var60 = var57 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field8544[var11] = var9;
            this.field8544[var11 + 1] = var8;
            this.field8544[var11 + 2] = var7;
            this.field8544[var11 + 3] = var6;
            this.field8544[var11 + 4] = var5;
            this.field8544[var11 + 5] = var4;
            this.field8544[var11 + 6] = var3;
            this.field8544[var11 + 7] = var2;
        }
        int var12 = 0;
        if (arg0 != 126) {
            field8545 = null;
        }
        while (var12 < 256) {
            int var13 = this.field8544[var12 + 7] + var2;
            int var14 = this.field8544[var12 + 6] + var3;
            int var15 = this.field8544[var12 + 2] + var7;
            int var16 = this.field8544[var12 + 1] + var8;
            int var17 = this.field8544[var12 + 5] + var4;
            int var18 = this.field8544[var12] + var9;
            int var19 = this.field8544[var12 + 4] + var5;
            int var20 = this.field8544[var12 + 3] + var6;
            int var21 = var18 ^ var16 << 11;
            int var22 = var15 + var16;
            int var23 = var20 + var21;
            int var24 = var22 ^ var15 >>> 2;
            int var25 = var15 + var23;
            int var26 = var19 + var24;
            int var27 = var25 ^ var23 << 8;
            int var28 = var17 + var27;
            int var29 = var23 + var26;
            var6 = var29 ^ var26 >>> 16;
            int var30 = var26 + var28;
            int var31 = var6 + var14;
            var5 = var30 ^ var28 << 10;
            int var32 = var28 + var31;
            int var33 = var5 + var13;
            var4 = var32 ^ var31 >>> 4;
            int var34 = var4 + var21;
            int var35 = var31 + var33;
            var3 = var35 ^ var33 << 8;
            var8 = var3 + var24;
            int var36 = var33 + var34;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            var7 = var2 + var27;
            this.field8544[var12] = var9;
            this.field8544[var12 + 1] = var8;
            this.field8544[var12 + 2] = var7;
            this.field8544[var12 + 3] = var6;
            this.field8544[var12 + 4] = var5;
            this.field8544[var12 + 5] = var4;
            this.field8544[var12 + 6] = var3;
            this.field8544[var12 + 7] = var2;
            var12 += 8;
        }
        this.method3324(-1);
        this.field8537 = 256;
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)V", line = 215)
    private final void method3324(int arg0) {
        field8539++;
        this.field8540 += ++this.field8542;
        if (arg0 != -1) {
            this.field8542 = -120;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field8544[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field8546 ^= this.field8546 << 13;
                } else {
                    this.field8546 ^= this.field8546 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field8546 ^= this.field8546 << 2;
            } else {
                this.field8546 ^= this.field8546 >>> 16;
            }
            this.field8546 += this.field8544[var2 + 128 & 0xFF];
            int var4;
            this.field8544[var2] = var4 = this.field8544[class695.method3921(var3, 1020) >> 2] + (this.field8546 + this.field8540);
            this.field8532[var2] = this.field8540 = this.field8544[class695.method3921(255, var4 >> 8 >> 2)] + var3;
        }
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "(I)V", line = 259)
    public static void method3325(int arg0) {
        int var1 = 70 % ((-arg0 - 60) / 61);
        field8545 = null;
        field8538 = null;
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "()V", line = 272)
    private class608() {
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "([I)V", line = 274)
    public class608(int[] arg0) {
        this.field8544 = new int[256];
        this.field8532 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field8532[var2] = arg0[var2];
        }
        this.method3323((byte) 126);
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(B)I", line = 294)
    public final int method3326(byte arg0) {
        if (this.field8537 == 0) {
            this.method3324(-1);
            this.field8537 = 256;
        }
        field8534++;
        int var2 = 17 / ((-arg0 - 65) / 51);
        return this.field8532[this.field8537 - 1];
    }
}
