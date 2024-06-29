import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class780 {

    @OriginalMember(owner = "client!hda", name = "h", descriptor = "[I")
    private int[] field10707;

    @OriginalMember(owner = "client!hda", name = "k", descriptor = "[I")
    private int[] field10710;

    @OriginalMember(owner = "client!hda", name = "i", descriptor = "Lqw;")
    public static class84 field10708 = new class84();

    @OriginalMember(owner = "client!hda", name = "n", descriptor = "I")
    public static int field10713 = 0;

    @OriginalMember(owner = "client!hda", name = "m", descriptor = "I")
    public static int field10712 = 0;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "I")
    public static int field10700;

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "I")
    private int field10702;

    @OriginalMember(owner = "client!hda", name = "d", descriptor = "I")
    public static int field10703;

    @OriginalMember(owner = "client!hda", name = "e", descriptor = "I")
    private int field10704;

    @OriginalMember(owner = "client!hda", name = "f", descriptor = "I")
    private int field10705;

    @OriginalMember(owner = "client!hda", name = "g", descriptor = "I")
    public static int field10706;

    @OriginalMember(owner = "client!hda", name = "j", descriptor = "I")
    private int field10709;

    @OriginalMember(owner = "client!hda", name = "l", descriptor = "I")
    public static int field10711;

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "[Lhh;")
    public static class140[] field10701;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(B)I")
    public final int method4280(byte arg0) {
        if (this.field10702 == 0) {
            this.method4284(5);
            this.field10702 = 256;
        }
        field10711++;
        int var2 = -79 % ((-arg0 - 21) / 60);
        return this.field10710[--this.field10702];
    }

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(B)V")
    private final void method4281(byte arg0) {
        field10703++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var62 = var9 ^ var8 << 11;
            int var63 = var6 + var62;
            int var64 = var7 + var8;
            int var65 = var64 ^ var7 >>> 2;
            int var66 = var7 + var63;
            int var67 = var5 + var65;
            int var68 = var66 ^ var63 << 8;
            int var69 = var4 + var68;
            int var70 = var63 + var67;
            var6 = var70 ^ var67 >>> 16;
            int var71 = var3 + var6;
            int var72 = var67 + var69;
            var5 = var72 ^ var69 << 10;
            int var73 = var2 + var5;
            int var74 = var69 + var71;
            var4 = var74 ^ var71 >>> 4;
            int var75 = var4 + var62;
            int var76 = var71 + var73;
            var3 = var76 ^ var73 << 8;
            var8 = var3 + var65;
            int var77 = var73 + var75;
            var2 = var77 ^ var75 >>> 9;
            var7 = var2 + var68;
            var9 = var8 + var75;
        }
        int var11 = -77 % ((arg0 + 31) / 56);
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var38 = this.field10710[var12 + 5] + var4;
            int var39 = this.field10710[var12 + 2] + var7;
            int var40 = this.field10710[var12 + 4] + var5;
            int var41 = this.field10710[var12 + 6] + var3;
            int var42 = this.field10710[var12 + 3] + var6;
            int var43 = this.field10710[var12 + 1] + var8;
            int var44 = this.field10710[var12 + 7] + var2;
            int var45 = this.field10710[var12] + var9;
            int var46 = var45 ^ var43 << 11;
            int var47 = var42 + var46;
            int var48 = var39 + var43;
            int var49 = var48 ^ var39 >>> 2;
            int var50 = var39 + var47;
            int var51 = var40 + var49;
            int var52 = var50 ^ var47 << 8;
            int var53 = var47 + var51;
            int var54 = var38 + var52;
            var6 = var53 ^ var51 >>> 16;
            int var55 = var6 + var41;
            int var56 = var51 + var54;
            var5 = var56 ^ var54 << 10;
            int var57 = var54 + var55;
            int var58 = var5 + var44;
            var4 = var57 ^ var55 >>> 4;
            int var59 = var4 + var46;
            int var60 = var55 + var58;
            var3 = var60 ^ var58 << 8;
            var8 = var3 + var49;
            int var61 = var58 + var59;
            var2 = var61 ^ var59 >>> 9;
            var9 = var8 + var59;
            var7 = var2 + var52;
            this.field10707[var12] = var9;
            this.field10707[var12 + 1] = var8;
            this.field10707[var12 + 2] = var7;
            this.field10707[var12 + 3] = var6;
            this.field10707[var12 + 4] = var5;
            this.field10707[var12 + 5] = var4;
            this.field10707[var12 + 6] = var3;
            this.field10707[var12 + 7] = var2;
        }
        for (int var13 = 0; var13 < 256; var13 += 8) {
            int var14 = this.field10707[var13 + 2] + var7;
            int var15 = this.field10707[var13 + 3] + var6;
            int var16 = this.field10707[var13 + 1] + var8;
            int var17 = this.field10707[var13 + 6] + var3;
            int var18 = this.field10707[var13] + var9;
            int var19 = this.field10707[var13 + 4] + var5;
            int var20 = this.field10707[var13 + 7] + var2;
            int var21 = this.field10707[var13 + 5] + var4;
            int var22 = var18 ^ var16 << 11;
            int var23 = var15 + var22;
            int var24 = var14 + var16;
            int var25 = var24 ^ var14 >>> 2;
            int var26 = var19 + var25;
            int var27 = var14 + var23;
            int var28 = var27 ^ var23 << 8;
            int var29 = var21 + var28;
            int var30 = var23 + var26;
            var6 = var30 ^ var26 >>> 16;
            int var31 = var26 + var29;
            int var32 = var6 + var17;
            var5 = var31 ^ var29 << 10;
            int var33 = var5 + var20;
            int var34 = var29 + var32;
            var4 = var34 ^ var32 >>> 4;
            int var35 = var32 + var33;
            int var36 = var4 + var22;
            var3 = var35 ^ var33 << 8;
            int var37 = var33 + var36;
            var8 = var3 + var25;
            var2 = var37 ^ var36 >>> 9;
            var7 = var2 + var28;
            var9 = var8 + var36;
            this.field10707[var13] = var9;
            this.field10707[var13 + 1] = var8;
            this.field10707[var13 + 2] = var7;
            this.field10707[var13 + 3] = var6;
            this.field10707[var13 + 4] = var5;
            this.field10707[var13 + 5] = var4;
            this.field10707[var13 + 6] = var3;
            this.field10707[var13 + 7] = var2;
        }
        this.method4284(5);
        this.field10702 = 256;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)I")
    public final int method4282(int arg0) {
        if (this.field10702 == 0) {
            this.method4284(5);
            this.field10702 = 256;
        }
        field10700++;
        if (arg0 >= -69) {
            this.field10705 = 125;
        }
        return this.field10710[this.field10702 - 1];
    }

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(I)V")
    public static void method4283(int arg0) {
        if (arg0 != -370448894) {
            field10712 = -24;
        }
        field10701 = null;
        field10708 = null;
    }

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "(I)V")
    private final void method4284(int arg0) {
        field10706++;
        this.field10705 += ++this.field10704;
        if (arg0 != 5) {
            return;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field10707[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field10709 ^= this.field10709 << 13;
                } else {
                    this.field10709 ^= this.field10709 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field10709 ^= this.field10709 << 2;
            } else {
                this.field10709 ^= this.field10709 >>> 16;
            }
            this.field10709 += this.field10707[var2 + 128 & 0xFF];
            int var4;
            this.field10707[var2] = var4 = this.field10709 + (this.field10707[class519.method3018(var3 >> 2, 255)] + this.field10705);
            this.field10710[var2] = this.field10705 = var3 + this.field10707[class519.method3018(var4, 261294) >> 8 >> 2];
        }
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "()V")
    private class780() {
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "([I)V")
    public class780(int[] arg0) {
        this.field10707 = new int[256];
        this.field10710 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field10710[var2] = arg0[var2];
        }
        this.method4281((byte) 105);
    }
}
