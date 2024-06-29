import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class37 {

    @OriginalMember(owner = "client!od", name = "e", descriptor = "[I")
    private int[] field631;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "[I")
    private int[] field632;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "Lmk;")
    public static class443 field633 = new class443();

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public static int field639 = 1338;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "Lkp;")
    public static class190 field641 = null;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "Lfn;")
    public static class52 field642 = new class52(23, 8);

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    private int field627;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    private int field630;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    private int field636;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    private int field637;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "[I")
    public static int[] field640;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "[Laq;")
    public static class385[] field638;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(III)Lpi;")
    public static final class467 method309(int arg0, int arg1, int arg2) {
        class406 var3 = class455.field6293[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5617;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static void method310(int arg0) {
        field641 = null;
        if (arg0 != 1204766634) {
            method310(55);
        }
        field640 = null;
        field642 = null;
        field633 = null;
        field638 = null;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
    private final void method311(int arg0) {
        field634++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        if (arg0 != -3131) {
            return;
        }
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
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field631[var11 + 3] + var6;
            int var38 = this.field631[var11 + 1] + var8;
            int var39 = this.field631[var11 + 6] + var3;
            int var40 = this.field631[var11 + 2] + var7;
            int var41 = this.field631[var11] + var9;
            int var42 = this.field631[var11 + 7] + var2;
            int var43 = this.field631[var11 + 5] + var4;
            int var44 = this.field631[var11 + 4] + var5;
            int var45 = var41 ^ var38 << 11;
            int var46 = var38 + var40;
            int var47 = var37 + var45;
            int var48 = var46 ^ var40 >>> 2;
            int var49 = var40 + var47;
            int var50 = var44 + var48;
            int var51 = var49 ^ var47 << 8;
            int var52 = var43 + var51;
            int var53 = var47 + var50;
            var6 = var53 ^ var50 >>> 16;
            int var54 = var6 + var39;
            int var55 = var50 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var5 + var42;
            int var57 = var52 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var54 + var56;
            int var59 = var4 + var45;
            var3 = var58 ^ var56 << 8;
            int var60 = var56 + var59;
            var8 = var3 + var48;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            var7 = var2 + var51;
            this.field632[var11] = var9;
            this.field632[var11 + 1] = var8;
            this.field632[var11 + 2] = var7;
            this.field632[var11 + 3] = var6;
            this.field632[var11 + 4] = var5;
            this.field632[var11 + 5] = var4;
            this.field632[var11 + 6] = var3;
            this.field632[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field632[var12 + 4] + var5;
            int var14 = this.field632[var12 + 2] + var7;
            int var15 = this.field632[var12] + var9;
            int var16 = this.field632[var12 + 5] + var4;
            int var17 = this.field632[var12 + 7] + var2;
            int var18 = this.field632[var12 + 6] + var3;
            int var19 = this.field632[var12 + 1] + var8;
            int var20 = this.field632[var12 + 3] + var6;
            int var21 = var15 ^ var19 << 11;
            int var22 = var20 + var21;
            int var23 = var14 + var19;
            int var24 = var23 ^ var14 >>> 2;
            int var25 = var13 + var24;
            int var26 = var14 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var16 + var27;
            int var29 = var22 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var6 + var18;
            int var31 = var25 + var28;
            var5 = var31 ^ var28 << 10;
            int var32 = var5 + var17;
            int var33 = var28 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var30 + var32;
            int var35 = var4 + var21;
            var3 = var34 ^ var32 << 8;
            var8 = var3 + var24;
            int var36 = var32 + var35;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field632[var12] = var9;
            this.field632[var12 + 1] = var8;
            this.field632[var12 + 2] = var7;
            this.field632[var12 + 3] = var6;
            this.field632[var12 + 4] = var5;
            this.field632[var12 + 5] = var4;
            this.field632[var12 + 6] = var3;
            this.field632[var12 + 7] = var2;
        }
        this.method313(-1980747678);
        this.field636 = 256;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)I")
    public final int method312(int arg0) {
        field628++;
        if (this.field636 == 0) {
            this.method313(arg0 - 296988390);
            this.field636 = 256;
        }
        return arg0 == -1683759288 ? this.field631[--this.field636] : 101;
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(I)V")
    private final void method313(int arg0) {
        field629++;
        if (arg0 != -1980747678) {
            return;
        }
        this.field627 += ++this.field637;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field632[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field630 ^= this.field630 << 13;
                } else {
                    this.field630 ^= this.field630 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field630 ^= this.field630 << 2;
            } else {
                this.field630 ^= this.field630 >>> 16;
            }
            this.field630 += this.field632[var2 + 128 & 0xFF];
            int var4;
            this.field632[var2] = var4 = this.field630 + this.field627 + this.field632[class347.method2074(255, var3 >> 2)];
            this.field631[var2] = this.field627 = var3 + this.field632[class347.method2074(var4 >> 8, 1020) >> 2];
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
    private class37() {
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "([I)V")
    public class37(int[] arg0) {
        this.field631 = new int[256];
        this.field632 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field631[var2] = arg0[var2];
        }
        this.method311(-3131);
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(I)I")
    public final int method314(int arg0) {
        field635++;
        if (arg0 >= -96) {
            this.field627 = 66;
        }
        if (this.field636 == 0) {
            this.method313(-1980747678);
            this.field636 = 256;
        }
        return this.field631[this.field636 - 1];
    }
}
