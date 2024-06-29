import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class37 {

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "[I")
    private int[] field649;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "[I")
    private int[] field637;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "Loa;")
    public static class99 field633 = class221.method1463(2844, "clignotant2:");

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field635 = 0;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "Loa;")
    public static class99 field642 = class221.method1463(2844, "b12_full");

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "Z")
    public static boolean field650 = false;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field646 = 0;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    private int field636;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    private int field640;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    private int field644;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    private int field647;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "Ltg;")
    public static class182 field634;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "Ltg;")
    public static class182 field643;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)I")
    public final int method287(int arg0) {
        field638++;
        if (this.field647-- == 0) {
            this.method292(1032877904);
            this.field647 = 255;
        }
        if (arg0 < 96) {
            field635 = -108;
        }
        return this.field649[this.field647];
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
    public static void method288(int arg0) {
        field634 = null;
        if (arg0 != 8827) {
            method288(0);
        }
        field642 = null;
        field643 = null;
        field633 = null;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
    private final void method289(int arg0) {
        field641++;
        if (arg0 != 8) {
            this.method289(70);
        }
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
            int var66 = var65 ^ var62 << 8;
            int var67 = var5 + var64;
            int var68 = var62 + var67;
            var6 = var68 ^ var67 >>> 16;
            int var69 = var3 + var6;
            int var70 = var4 + var66;
            int var71 = var67 + var70;
            var5 = var71 ^ var70 << 10;
            int var72 = var69 + var70;
            var4 = var72 ^ var69 >>> 4;
            int var73 = var2 + var5;
            int var74 = var69 + var73;
            int var75 = var4 + var61;
            var3 = var74 ^ var73 << 8;
            int var76 = var73 + var75;
            var2 = var76 ^ var75 >>> 9;
            var8 = var3 + var64;
            var9 = var8 + var75;
            var7 = var2 + var66;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field649[var11] + var9;
            int var38 = this.field649[var11 + 1] + var8;
            int var39 = var37 ^ var38 << 11;
            int var40 = this.field649[var11 + 7] + var2;
            int var41 = this.field649[var11 + 2] + var7;
            int var42 = this.field649[var11 + 3] + var6;
            int var43 = this.field649[var11 + 6] + var3;
            int var44 = this.field649[var11 + 5] + var4;
            int var45 = var39 + var42;
            int var46 = this.field649[var11 + 4] + var5;
            int var47 = var38 + var41;
            int var48 = var47 ^ var41 >>> 2;
            int var49 = var41 + var45;
            int var50 = var49 ^ var45 << 8;
            int var51 = var44 + var50;
            int var52 = var46 + var48;
            int var53 = var45 + var52;
            var6 = var53 ^ var52 >>> 16;
            int var54 = var51 + var52;
            var5 = var54 ^ var51 << 10;
            int var55 = var6 + var43;
            int var56 = var5 + var40;
            int var57 = var51 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var55 + var56;
            int var59 = var4 + var39;
            var3 = var58 ^ var56 << 8;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var8 = var3 + var48;
            var9 = var8 + var59;
            this.field637[var11] = var9;
            var7 = var2 + var50;
            this.field637[var11 + 1] = var8;
            this.field637[var11 + 2] = var7;
            this.field637[var11 + 3] = var6;
            this.field637[var11 + 4] = var5;
            this.field637[var11 + 5] = var4;
            this.field637[var11 + 6] = var3;
            this.field637[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field637[var12 + 2] + var7;
            int var14 = this.field637[var12 + 6] + var3;
            int var15 = this.field637[var12 + 1] + var8;
            int var16 = this.field637[var12 + 3] + var6;
            int var17 = this.field637[var12] + var9;
            int var18 = this.field637[var12 + 5] + var4;
            int var19 = this.field637[var12 + 7] + var2;
            int var20 = var17 ^ var15 << 11;
            int var21 = var13 + var15;
            int var22 = var21 ^ var13 >>> 2;
            int var23 = this.field637[var12 + 4] + var5;
            int var24 = var16 + var20;
            int var25 = var22 + var23;
            int var26 = var13 + var24;
            int var27 = var26 ^ var24 << 8;
            int var28 = var18 + var27;
            int var29 = var24 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var6 + var14;
            int var31 = var25 + var28;
            var5 = var31 ^ var28 << 10;
            int var32 = var28 + var30;
            var4 = var32 ^ var30 >>> 4;
            int var33 = var5 + var19;
            int var34 = var30 + var33;
            var3 = var34 ^ var33 << 8;
            int var35 = var4 + var20;
            int var36 = var33 + var35;
            var8 = var3 + var22;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field637[var12] = var9;
            this.field637[var12 + 1] = var8;
            this.field637[var12 + 2] = var7;
            this.field637[var12 + 3] = var6;
            this.field637[var12 + 4] = var5;
            this.field637[var12 + 5] = var4;
            this.field637[var12 + 6] = var3;
            this.field637[var12 + 7] = var2;
        }
        this.method292(arg0 + 1032877896);
        this.field647 = 256;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lik;I)Lnh;")
    public static final class54 method290(class261 arg0, int arg1) {
        field645++;
        class54 var2 = new class54();
        var2.field883 = arg0.method1740((byte) 92);
        var2.field885 = class108.method745(var2.field883, true);
        if (arg1 != -12441) {
            method288(97);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIZIII)V")
    public static final void method291(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field652++;
        if (class22.method134(arg3, (byte) 48)) {
            client.method1062(class125.field2188[arg3], -1, arg2, arg7, arg6, arg1, arg5, arg0);
            if (!arg4) {
                method290((class261) null, -74);
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V")
    private final void method292(int arg0) {
        this.field644 += ++this.field636;
        field648++;
        if (arg0 != 1032877904) {
            method291(-53, -10, 41, -107, true, -24, 63, -9);
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field637[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field640 ^= this.field640 << 13;
                } else {
                    this.field640 ^= this.field640 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field640 ^= this.field640 << 2;
            } else {
                this.field640 ^= this.field640 >>> 16;
            }
            this.field640 += this.field637[var2 + 128 & 0xFF];
            int var4;
            this.field637[var2] = var4 = this.field640 + this.field637[class71.method502(var3, 1020) >> 2] + this.field644;
            this.field649[var2] = this.field644 = this.field637[class71.method502(1020, var4 >> 8) >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
    private class37() {
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "([I)V")
    public class37(int[] arg0) {
        this.field649 = new int[256];
        this.field637 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field649[var2] = arg0[var2];
        }
        this.method289(8);
    }
}
