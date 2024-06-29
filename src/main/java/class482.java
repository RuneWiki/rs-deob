import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class482 {

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "[I")
    private int[] field6626;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "[I")
    private int[] field6632;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "Lin;")
    public static class78 field6625 = null;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field6623;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    private int field6624;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field6627;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public static int field6628;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field6629;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    private int field6630;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    private int field6631;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
    private int field6633;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V", line = 5)
    public static void method2704(int arg0) {
        field6625 = null;
        int var1 = 86 % ((-arg0 - 63) / 39);
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)I", line = 16)
    public final int method2705(int arg0) {
        if (this.field6624 == 0) {
            this.method2707(-752511292);
            this.field6624 = 256;
        }
        if (arg0 != 9007) {
            this.method2708(91);
        }
        field6627++;
        return this.field6626[--this.field6624];
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lha;III[Z)Z", line = 35)
    public static final boolean method2706(class54 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class52.field606 != class409.field5812) {
            int var6 = class497.field6766[arg1].method331(arg3, (byte) 50, arg2);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class37 var8 = class497.field6766[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method331(arg3, (byte) 50, arg2);
                    if (arg4 != null) {
                        arg4[var7] = var8.method320(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method330(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)V", line = 75)
    private final void method2707(int arg0) {
        field6629++;
        this.field6633 += ++this.field6631;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field6632[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field6630 ^= this.field6630 << 13;
                } else {
                    this.field6630 ^= this.field6630 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field6630 ^= this.field6630 << 2;
            } else {
                this.field6630 ^= this.field6630 >>> 16;
            }
            this.field6630 += this.field6632[var2 + 128 & 0xFF];
            int var4;
            this.field6632[var2] = var4 = this.field6630 + this.field6632[class136.method950(var3, 1020) >> 2] + this.field6633;
            this.field6626[var2] = this.field6633 = this.field6632[class136.method950(var4 >> 8, 1020) >> 2] + var3;
        }
        if (arg0 != -752511292) {
            method2704(39);
        }
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)V", line = 120)
    private final void method2708(int arg0) {
        field6623++;
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
            int var65 = var5 + var64;
            int var66 = var7 + var62;
            int var67 = var66 ^ var62 << 8;
            int var68 = var62 + var65;
            int var69 = var4 + var67;
            var6 = var68 ^ var65 >>> 16;
            int var70 = var65 + var69;
            int var71 = var3 + var6;
            var5 = var70 ^ var69 << 10;
            int var72 = var69 + var71;
            int var73 = var2 + var5;
            var4 = var72 ^ var71 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var73;
            var3 = var75 ^ var73 << 8;
            var8 = var3 + var64;
            int var76 = var73 + var74;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field6626[var11 + 5] + var4;
            int var38 = this.field6626[var11 + 7] + var2;
            int var39 = this.field6626[var11 + 2] + var7;
            int var40 = this.field6626[var11 + 1] + var8;
            int var41 = this.field6626[var11 + 4] + var5;
            int var42 = this.field6626[var11 + 3] + var6;
            int var43 = this.field6626[var11] + var9;
            int var44 = this.field6626[var11 + 6] + var3;
            int var45 = var43 ^ var40 << 11;
            int var46 = var39 + var40;
            int var47 = var42 + var45;
            int var48 = var46 ^ var39 >>> 2;
            int var49 = var39 + var47;
            int var50 = var41 + var48;
            int var51 = var49 ^ var47 << 8;
            int var52 = var37 + var51;
            int var53 = var47 + var50;
            var6 = var53 ^ var50 >>> 16;
            int var54 = var6 + var44;
            int var55 = var50 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var52 + var54;
            int var57 = var5 + var38;
            var4 = var56 ^ var54 >>> 4;
            int var58 = var4 + var45;
            int var59 = var54 + var57;
            var3 = var59 ^ var57 << 8;
            var8 = var3 + var48;
            int var60 = var57 + var58;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            var7 = var2 + var51;
            this.field6632[var11] = var9;
            this.field6632[var11 + 1] = var8;
            this.field6632[var11 + 2] = var7;
            this.field6632[var11 + 3] = var6;
            this.field6632[var11 + 4] = var5;
            this.field6632[var11 + 5] = var4;
            this.field6632[var11 + 6] = var3;
            this.field6632[var11 + 7] = var2;
        }
        int var12 = 0;
        if (arg0 != 16486) {
            this.method2709(81);
        }
        while (var12 < 256) {
            int var13 = this.field6632[var12 + 6] + var3;
            int var14 = this.field6632[var12 + 2] + var7;
            int var15 = this.field6632[var12 + 1] + var8;
            int var16 = this.field6632[var12] + var9;
            int var17 = this.field6632[var12 + 7] + var2;
            int var18 = this.field6632[var12 + 4] + var5;
            int var19 = this.field6632[var12 + 3] + var6;
            int var20 = this.field6632[var12 + 5] + var4;
            int var21 = var16 ^ var15 << 11;
            int var22 = var14 + var15;
            int var23 = var19 + var21;
            int var24 = var22 ^ var14 >>> 2;
            int var25 = var18 + var24;
            int var26 = var14 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var23 + var25;
            int var29 = var20 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var6 + var13;
            int var31 = var25 + var29;
            var5 = var31 ^ var29 << 10;
            int var32 = var29 + var30;
            int var33 = var5 + var17;
            var4 = var32 ^ var30 >>> 4;
            int var34 = var30 + var33;
            int var35 = var4 + var21;
            var3 = var34 ^ var33 << 8;
            int var36 = var33 + var35;
            var8 = var3 + var24;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var27;
            this.field6632[var12] = var9;
            this.field6632[var12 + 1] = var8;
            this.field6632[var12 + 2] = var7;
            this.field6632[var12 + 3] = var6;
            this.field6632[var12 + 4] = var5;
            this.field6632[var12 + 5] = var4;
            this.field6632[var12 + 6] = var3;
            this.field6632[var12 + 7] = var2;
            var12 += 8;
        }
        this.method2707(arg0 - 752527778);
        this.field6624 = 256;
    }

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "(I)I", line = 268)
    public final int method2709(int arg0) {
        if (arg0 != 2) {
            this.field6630 = 21;
        }
        if (this.field6624 == 0) {
            this.method2707(-752511292);
            this.field6624 = 256;
        }
        field6628++;
        return this.field6626[this.field6624 - 1];
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V", line = 290)
    private class482() {
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "([I)V", line = 292)
    public class482(int[] arg0) {
        this.field6626 = new int[256];
        this.field6632 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field6626[var2] = arg0[var2];
        }
        this.method2708(16486);
    }
}
