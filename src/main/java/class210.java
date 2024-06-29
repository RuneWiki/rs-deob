import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class210 {

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "[I")
    private int[] field3774;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "[I")
    private int[] field3773;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field3766 = -1;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "[Z")
    public static boolean[] field3769 = new boolean[100];

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field3771 = 0;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "Z")
    public static boolean field3767 = false;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    public static int field3781 = 0;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "B")
    public static byte field3780;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    private int field3768;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    private int field3775;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
    private int field3776;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
    private int field3777;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
    private final void method1484(int arg0) {
        field3779++;
        if (arg0 != 4) {
            return;
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
            int var68 = var4 + var66;
            int var69 = var62 + var67;
            var6 = var69 ^ var67 >>> 16;
            int var70 = var67 + var68;
            int var71 = var3 + var6;
            var5 = var70 ^ var68 << 10;
            int var72 = var68 + var71;
            int var73 = var2 + var5;
            var4 = var72 ^ var71 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var73;
            var3 = var75 ^ var73 << 8;
            int var76 = var73 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var66;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field3774[var11 + 5] + var4;
            int var38 = this.field3774[var11] + var9;
            int var39 = this.field3774[var11 + 3] + var6;
            int var40 = this.field3774[var11 + 2] + var7;
            int var41 = this.field3774[var11 + 6] + var3;
            int var42 = this.field3774[var11 + 4] + var5;
            int var43 = this.field3774[var11 + 7] + var2;
            int var44 = this.field3774[var11 + 1] + var8;
            int var45 = var38 ^ var44 << 11;
            int var46 = var39 + var45;
            int var47 = var40 + var44;
            int var48 = var47 ^ var40 >>> 2;
            int var49 = var42 + var48;
            int var50 = var40 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var37 + var51;
            int var53 = var46 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var6 + var41;
            int var55 = var49 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var52 + var54;
            int var57 = var5 + var43;
            var4 = var56 ^ var54 >>> 4;
            int var58 = var4 + var45;
            int var59 = var54 + var57;
            var3 = var59 ^ var57 << 8;
            int var60 = var57 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            var7 = var2 + var51;
            this.field3773[var11] = var9;
            this.field3773[var11 + 1] = var8;
            this.field3773[var11 + 2] = var7;
            this.field3773[var11 + 3] = var6;
            this.field3773[var11 + 4] = var5;
            this.field3773[var11 + 5] = var4;
            this.field3773[var11 + 6] = var3;
            this.field3773[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field3773[var12 + 4] + var5;
            int var14 = this.field3773[var12] + var9;
            int var15 = this.field3773[var12 + 6] + var3;
            int var16 = this.field3773[var12 + 7] + var2;
            int var17 = this.field3773[var12 + 3] + var6;
            int var18 = this.field3773[var12 + 5] + var4;
            int var19 = this.field3773[var12 + 2] + var7;
            int var20 = this.field3773[var12 + 1] + var8;
            int var21 = var14 ^ var20 << 11;
            int var22 = var17 + var21;
            int var23 = var19 + var20;
            int var24 = var23 ^ var19 >>> 2;
            int var25 = var19 + var22;
            int var26 = var13 + var24;
            int var27 = var25 ^ var22 << 8;
            int var28 = var22 + var26;
            int var29 = var18 + var27;
            var6 = var28 ^ var26 >>> 16;
            int var30 = var26 + var29;
            int var31 = var6 + var15;
            var5 = var30 ^ var29 << 10;
            int var32 = var5 + var16;
            int var33 = var29 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var31 + var32;
            int var35 = var4 + var21;
            var3 = var34 ^ var32 << 8;
            int var36 = var32 + var35;
            var2 = var36 ^ var35 >>> 9;
            var8 = var3 + var24;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field3773[var12] = var9;
            this.field3773[var12 + 1] = var8;
            this.field3773[var12 + 2] = var7;
            this.field3773[var12 + 3] = var6;
            this.field3773[var12 + 4] = var5;
            this.field3773[var12 + 5] = var4;
            this.field3773[var12 + 6] = var3;
            this.field3773[var12 + 7] = var2;
        }
        this.method1485((byte) 127);
        this.field3775 = 256;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
    private final void method1485(byte arg0) {
        int var2 = 115 / ((75 - arg0) / 50);
        this.field3777 += ++this.field3768;
        field3778++;
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = this.field3773[var3];
            if ((var3 & 0x2) == 0) {
                if ((var3 & 0x1) == 0) {
                    this.field3776 ^= this.field3776 << 13;
                } else {
                    this.field3776 ^= this.field3776 >>> 6;
                }
            } else if ((var3 & 0x1) == 0) {
                this.field3776 ^= this.field3776 << 2;
            } else {
                this.field3776 ^= this.field3776 >>> 16;
            }
            this.field3776 += this.field3773[var3 + 128 & 0xFF];
            int var5;
            this.field3773[var3] = var5 = this.field3776 + this.field3773[class68.method612(var4 >> 2, 255)] + this.field3777;
            this.field3774[var3] = this.field3777 = this.field3773[class68.method612(255, var5 >> 8 >> 2)] + var4;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(JZII)Lsg;")
    public static final class30 method1486(long arg0, boolean arg1, int arg2, int arg3) {
        field3765++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        int var5 = 1;
        long var6 = arg0 / (long) arg2;
        while (var6 != 0L) {
            var6 /= (long) arg2;
            var5++;
        }
        int var8 = var5;
        if (arg0 < 0L || arg1) {
            var8 = var5 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg0 < 0L) {
            var9[0] = 45;
        } else if (arg1) {
            var9[0] = 43;
        }
        if (arg3 != 9) {
            field3771 = -109;
        }
        for (int var10 = 0; var10 < var5; var10++) {
            int var12 = (int) (arg0 % (long) arg2);
            arg0 /= (long) arg2;
            if (var12 < 0) {
                var12 = -var12;
            }
            if (var12 > 9) {
                var12 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var12 + 48);
        }
        class30 var11 = new class30();
        var11.field618 = var9;
        var11.field576 = var8;
        return var11;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)I")
    public final int method1487(int arg0) {
        if (arg0 == this.field3775--) {
            this.method1485((byte) 125);
            this.field3775 = 255;
        }
        field3770++;
        return this.field3774[this.field3775];
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V")
    public static void method1488(boolean arg0) {
        field3769 = null;
        if (arg0) {
            method1486(-75L, true, -62, 80);
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
    private class210() {
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "([I)V")
    public class210(int[] arg0) {
        this.field3774 = new int[256];
        this.field3773 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3774[var2] = arg0[var2];
        }
        this.method1484(4);
    }
}
