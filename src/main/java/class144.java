import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class144 {

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "[I")
    private int[] field2483;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "[I")
    private int[] field2474;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field2471 = 0;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field2478 = 0;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "Lub;")
    public static class227 field2484 = class257.method1749("Mem:", 17263);

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "[I")
    public static int[] field2485 = new int[2];

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    private int field2476;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    private int field2477;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    private int field2480;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    private int field2481;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "Ln;")
    public static class138 field2473;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLn;)V")
    public static final void method905(byte arg0, class138 arg1) {
        field2482++;
        class32.field517 = arg1.method869(class218.field3677, 0);
        class252.field4368 = arg1.method869(class52.field919, 0);
        class212.field3576 = arg1.method869(class160.field2697, 0);
        class179.field3082 = arg1.method869(class61.field1126, 0);
        if (arg0 != 25) {
            method905((byte) -61, (class138) null);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)I")
    public final int method906(byte arg0) {
        if (this.field2481-- == 0) {
            this.method909(-31936);
            this.field2481 = 255;
        }
        if (arg0 != 62) {
            method905((byte) -17, (class138) null);
        }
        field2475++;
        return this.field2474[this.field2481];
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    private final void method907(int arg0) {
        field2479++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        int var10 = 0;
        if (arg0 != -19473) {
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
            int var68 = var4 + var67;
            int var69 = var63 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var3 + var6;
            int var71 = var65 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var68 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var70 + var73;
            var3 = var74 ^ var73 << 8;
            int var75 = var4 + var61;
            var8 = var3 + var64;
            int var76 = var73 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
            var10++;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field2474[var11 + 3] + var6;
            int var38 = this.field2474[var11 + 4] + var5;
            int var39 = this.field2474[var11 + 6] + var3;
            int var40 = this.field2474[var11 + 5] + var4;
            int var41 = this.field2474[var11 + 7] + var2;
            int var42 = this.field2474[var11 + 1] + var8;
            int var43 = this.field2474[var11 + 2] + var7;
            int var44 = this.field2474[var11] + var9;
            int var45 = var44 ^ var42 << 11;
            int var46 = var42 + var43;
            int var47 = var37 + var45;
            int var48 = var46 ^ var43 >>> 2;
            int var49 = var43 + var47;
            int var50 = var49 ^ var47 << 8;
            int var51 = var40 + var50;
            int var52 = var38 + var48;
            int var53 = var47 + var52;
            var6 = var53 ^ var52 >>> 16;
            int var54 = var6 + var39;
            int var55 = var51 + var52;
            var5 = var55 ^ var51 << 10;
            int var56 = var51 + var54;
            var4 = var56 ^ var54 >>> 4;
            int var57 = var5 + var41;
            int var58 = var54 + var57;
            int var59 = var4 + var45;
            var3 = var58 ^ var57 << 8;
            int var60 = var57 + var59;
            var8 = var3 + var48;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            this.field2483[var11] = var9;
            var7 = var2 + var50;
            this.field2483[var11 + 1] = var8;
            this.field2483[var11 + 2] = var7;
            this.field2483[var11 + 3] = var6;
            this.field2483[var11 + 4] = var5;
            this.field2483[var11 + 5] = var4;
            this.field2483[var11 + 6] = var3;
            this.field2483[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2483[var12] + var9;
            int var14 = this.field2483[var12 + 5] + var4;
            int var15 = this.field2483[var12 + 6] + var3;
            int var16 = this.field2483[var12 + 1] + var8;
            int var17 = this.field2483[var12 + 4] + var5;
            int var18 = this.field2483[var12 + 2] + var7;
            int var19 = var13 ^ var16 << 11;
            int var20 = var16 + var18;
            int var21 = var20 ^ var18 >>> 2;
            int var22 = var17 + var21;
            int var23 = this.field2483[var12 + 7] + var2;
            int var24 = this.field2483[var12 + 3] + var6;
            int var25 = var19 + var24;
            int var26 = var18 + var25;
            int var27 = var26 ^ var25 << 8;
            int var28 = var14 + var27;
            int var29 = var22 + var25;
            var6 = var29 ^ var22 >>> 16;
            int var30 = var22 + var28;
            int var31 = var6 + var15;
            var5 = var30 ^ var28 << 10;
            int var32 = var28 + var31;
            int var33 = var5 + var23;
            var4 = var32 ^ var31 >>> 4;
            int var34 = var4 + var19;
            int var35 = var31 + var33;
            var3 = var35 ^ var33 << 8;
            int var36 = var33 + var34;
            var8 = var3 + var21;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            var7 = var2 + var27;
            this.field2483[var12] = var9;
            this.field2483[var12 + 1] = var8;
            this.field2483[var12 + 2] = var7;
            this.field2483[var12 + 3] = var6;
            this.field2483[var12 + 4] = var5;
            this.field2483[var12 + 5] = var4;
            this.field2483[var12 + 6] = var3;
            this.field2483[var12 + 7] = var2;
        }
        this.method909(-31936);
        this.field2481 = 256;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V")
    public static void method908(int arg0) {
        if (arg0 != 256) {
            field2485 = null;
        }
        field2485 = null;
        field2484 = null;
        field2473 = null;
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)V")
    private final void method909(int arg0) {
        this.field2480 += ++this.field2477;
        field2472++;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2483[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2476 ^= this.field2476 << 13;
                } else {
                    this.field2476 ^= this.field2476 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2476 ^= this.field2476 << 2;
            } else {
                this.field2476 ^= this.field2476 >>> 16;
            }
            this.field2476 += this.field2483[var2 + 128 & 0xFF];
            int var4;
            this.field2483[var2] = var4 = this.field2480 + this.field2483[class76.method446(255, var3 >> 2)] + this.field2476;
            this.field2474[var2] = this.field2480 = var3 + this.field2483[class76.method446(var4 >> 8, 1020) >> 2];
        }
        if (arg0 != -31936) {
            this.method906((byte) -120);
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
    private class144() {
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "([I)V")
    public class144(int[] arg0) {
        this.field2483 = new int[256];
        this.field2474 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2474[var2] = arg0[var2];
        }
        this.method907(-19473);
    }
}
