import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class114 {

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "[I")
    private int[] field1583;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "[I")
    private int[] field1576;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field1581 = 0;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "[I")
    public static int[] field1582 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    private int field1575;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    private int field1578;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    private int field1579;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    private int field1584;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "[I")
    public static int[] field1574;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)I", line = 5)
    public final int method834(byte arg0) {
        if ((this.field1584--) == 0) {
            this.method836((byte) -116);
            this.field1584 = 255;
        }
        if (arg0 != 55) {
            field1582 = null;
        }
        field1573++;
        return this.field1583[this.field1584];
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)V", line = 32)
    private final void method835(byte arg0) {
        field1585++;
        int var2 = 28 / ((-arg0 - 76) / 35);
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        int var10 = -1640531527;
        for (int var11 = 0; var11 < 4; var11++) {
            int var62 = var10 ^ var9 << 11;
            int var63 = var8 + var9;
            int var64 = var7 + var62;
            int var65 = var63 ^ var8 >>> 2;
            int var66 = var6 + var65;
            int var67 = var8 + var64;
            int var68 = var67 ^ var64 << 8;
            int var69 = var5 + var68;
            int var70 = var64 + var66;
            var7 = var70 ^ var66 >>> 16;
            int var71 = var66 + var69;
            int var72 = var4 + var7;
            var6 = var71 ^ var69 << 10;
            int var73 = var3 + var6;
            int var74 = var69 + var72;
            var5 = var74 ^ var72 >>> 4;
            int var75 = var72 + var73;
            int var76 = var5 + var62;
            var4 = var75 ^ var73 << 8;
            var9 = var4 + var65;
            int var77 = var73 + var76;
            var3 = var77 ^ var76 >>> 9;
            var8 = var3 + var68;
            var10 = var9 + var76;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var38 = this.field1583[var12 + 5] + var5;
            int var39 = this.field1583[var12 + 3] + var7;
            int var40 = this.field1583[var12 + 6] + var4;
            int var41 = this.field1583[var12] + var10;
            int var42 = this.field1583[var12 + 2] + var8;
            int var43 = this.field1583[var12 + 7] + var3;
            int var44 = this.field1583[var12 + 1] + var9;
            int var45 = this.field1583[var12 + 4] + var6;
            int var46 = var41 ^ var44 << 11;
            int var47 = var42 + var44;
            int var48 = var39 + var46;
            int var49 = var47 ^ var42 >>> 2;
            int var50 = var42 + var48;
            int var51 = var45 + var49;
            int var52 = var50 ^ var48 << 8;
            int var53 = var48 + var51;
            int var54 = var38 + var52;
            var7 = var53 ^ var51 >>> 16;
            int var55 = var51 + var54;
            int var56 = var7 + var40;
            var6 = var55 ^ var54 << 10;
            int var57 = var6 + var43;
            int var58 = var54 + var56;
            var5 = var58 ^ var56 >>> 4;
            int var59 = var56 + var57;
            int var60 = var5 + var46;
            var4 = var59 ^ var57 << 8;
            int var61 = var57 + var60;
            var9 = var4 + var49;
            var3 = var61 ^ var60 >>> 9;
            var8 = var3 + var52;
            var10 = var9 + var60;
            this.field1576[var12] = var10;
            this.field1576[var12 + 1] = var9;
            this.field1576[var12 + 2] = var8;
            this.field1576[var12 + 3] = var7;
            this.field1576[var12 + 4] = var6;
            this.field1576[var12 + 5] = var5;
            this.field1576[var12 + 6] = var4;
            this.field1576[var12 + 7] = var3;
        }
        for (int var13 = 0; var13 < 256; var13 += 8) {
            int var14 = this.field1576[var13 + 6] + var4;
            int var15 = this.field1576[var13 + 1] + var9;
            int var16 = this.field1576[var13 + 4] + var6;
            int var17 = this.field1576[var13 + 2] + var8;
            int var18 = this.field1576[var13 + 7] + var3;
            int var19 = this.field1576[var13 + 3] + var7;
            int var20 = this.field1576[var13 + 5] + var5;
            int var21 = this.field1576[var13] + var10;
            int var22 = var21 ^ var15 << 11;
            int var23 = var19 + var22;
            int var24 = var15 + var17;
            int var25 = var24 ^ var17 >>> 2;
            int var26 = var16 + var25;
            int var27 = var17 + var23;
            int var28 = var27 ^ var23 << 8;
            int var29 = var23 + var26;
            int var30 = var20 + var28;
            var7 = var29 ^ var26 >>> 16;
            int var31 = var26 + var30;
            int var32 = var7 + var14;
            var6 = var31 ^ var30 << 10;
            int var33 = var30 + var32;
            int var34 = var6 + var18;
            var5 = var33 ^ var32 >>> 4;
            int var35 = var5 + var22;
            int var36 = var32 + var34;
            var4 = var36 ^ var34 << 8;
            int var37 = var34 + var35;
            var9 = var4 + var25;
            var3 = var37 ^ var35 >>> 9;
            var8 = var3 + var28;
            var10 = var9 + var35;
            this.field1576[var13] = var10;
            this.field1576[var13 + 1] = var9;
            this.field1576[var13 + 2] = var8;
            this.field1576[var13 + 3] = var7;
            this.field1576[var13 + 4] = var6;
            this.field1576[var13 + 5] = var5;
            this.field1576[var13 + 6] = var4;
            this.field1576[var13 + 7] = var3;
        }
        this.method836((byte) -102);
        this.field1584 = 256;
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(B)V", line = 179)
    private final void method836(byte arg0) {
        field1577++;
        this.field1579 += ++this.field1575;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1576[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1578 ^= this.field1578 << 13;
                } else {
                    this.field1578 ^= this.field1578 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1578 ^= this.field1578 << 2;
            } else {
                this.field1578 ^= this.field1578 >>> 16;
            }
            this.field1578 += this.field1576[var2 + 128 & 0xFF];
            int var4;
            this.field1576[var2] = var4 = this.field1578 + (this.field1576[class37.method242(var3, 1020) >> 2] + this.field1579);
            this.field1583[var2] = this.field1579 = this.field1576[class37.method242(var4, 261188) >> 8 >> 2] + var3;
        }
        if (arg0 > -98) {
            this.field1583 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V", line = 221)
    public static void method837(int arg0) {
        field1574 = null;
        if (arg0 != 1582366825) {
            field1581 = -111;
        }
        field1582 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)I", line = 234)
    public static final int method838(int arg0, int arg1, int arg2) {
        if (arg0 != 256) {
            return 23;
        }
        field1580++;
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V", line = 270)
    private class114() {
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "([I)V", line = 272)
    public class114(int[] arg0) {
        this.field1583 = new int[256];
        this.field1576 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1583[var2] = arg0[var2];
        }
        this.method835((byte) -35);
    }
}
