import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class426 {

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "[I")
    private int[] field6346;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "[I")
    private int[] field6342;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field6341 = 52;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "[Z")
    public static boolean[] field6348 = new boolean[100];

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field6340;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    private int field6343;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    private int field6344;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field6347;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    private int field6350;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    private int field6351;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public static int field6352;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field6353;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V", line = 3)
    private final void method2659(int arg0) {
        field6352++;
        if (arg0 != -1428495856) {
            return;
        }
        this.field6351 += ++this.field6344;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field6342[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field6343 ^= this.field6343 << 13;
                } else {
                    this.field6343 ^= this.field6343 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field6343 ^= this.field6343 << 2;
            } else {
                this.field6343 ^= this.field6343 >>> 16;
            }
            this.field6343 += this.field6342[var2 + 128 & 0xFF];
            int var4;
            this.field6342[var2] = var4 = this.field6351 + this.field6342[class74.method644(var3 >> 2, 255)] + this.field6343;
            this.field6346[var2] = this.field6351 = var3 + this.field6342[class74.method644(var4, 261312) >> 8 >> 2];
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)I", line = 45)
    public final int method2660(int arg0) {
        if (this.field6350 == 0) {
            this.method2659(-1428495856);
            this.field6350 = 256;
        }
        field6353++;
        return arg0 == 2857 ? this.field6346[--this.field6350] : 3;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)I", line = 64)
    public final int method2661(int arg0) {
        field6345++;
        if (this.field6350 == 0) {
            this.method2659(-1428495856);
            this.field6350 = 256;
        }
        return arg0 < 30 ? 11 : this.field6346[this.field6350 - 1];
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)Z", line = 89)
    public static final boolean method2662(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            method2665((byte) 104);
        }
        field6349++;
        return (arg1 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V", line = 102)
    private final void method2663(boolean arg0) {
        field6347++;
        if (arg0) {
            this.field6346 = null;
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
            int var62 = var7 + var8;
            int var63 = var6 + var61;
            int var64 = var62 ^ var7 >>> 2;
            int var65 = var7 + var63;
            int var66 = var5 + var64;
            int var67 = var65 ^ var63 << 8;
            int var68 = var4 + var67;
            int var69 = var63 + var66;
            var6 = var69 ^ var66 >>> 16;
            int var70 = var3 + var6;
            int var71 = var66 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var68 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var73;
            var3 = var75 ^ var73 << 8;
            int var76 = var73 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field6346[var11 + 6] + var3;
            int var38 = this.field6346[var11] + var9;
            int var39 = this.field6346[var11 + 2] + var7;
            int var40 = this.field6346[var11 + 5] + var4;
            int var41 = this.field6346[var11 + 7] + var2;
            int var42 = this.field6346[var11 + 1] + var8;
            int var43 = this.field6346[var11 + 3] + var6;
            int var44 = this.field6346[var11 + 4] + var5;
            int var45 = var38 ^ var42 << 11;
            int var46 = var39 + var42;
            int var47 = var43 + var45;
            int var48 = var46 ^ var39 >>> 2;
            int var49 = var39 + var47;
            int var50 = var44 + var48;
            int var51 = var49 ^ var47 << 8;
            int var52 = var40 + var51;
            int var53 = var47 + var50;
            var6 = var53 ^ var50 >>> 16;
            int var54 = var6 + var37;
            int var55 = var50 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var5 + var41;
            int var57 = var52 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var4 + var45;
            int var59 = var54 + var56;
            var3 = var59 ^ var56 << 8;
            int var60 = var56 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            var7 = var2 + var51;
            this.field6342[var11] = var9;
            this.field6342[var11 + 1] = var8;
            this.field6342[var11 + 2] = var7;
            this.field6342[var11 + 3] = var6;
            this.field6342[var11 + 4] = var5;
            this.field6342[var11 + 5] = var4;
            this.field6342[var11 + 6] = var3;
            this.field6342[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field6342[var12 + 6] + var3;
            int var14 = this.field6342[var12 + 4] + var5;
            int var15 = this.field6342[var12] + var9;
            int var16 = this.field6342[var12 + 1] + var8;
            int var17 = this.field6342[var12 + 7] + var2;
            int var18 = this.field6342[var12 + 2] + var7;
            int var19 = this.field6342[var12 + 5] + var4;
            int var20 = this.field6342[var12 + 3] + var6;
            int var21 = var15 ^ var16 << 11;
            int var22 = var16 + var18;
            int var23 = var20 + var21;
            int var24 = var22 ^ var18 >>> 2;
            int var25 = var14 + var24;
            int var26 = var18 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var23 + var25;
            int var29 = var19 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var25 + var29;
            int var31 = var6 + var13;
            var5 = var30 ^ var29 << 10;
            int var32 = var29 + var31;
            int var33 = var5 + var17;
            var4 = var32 ^ var31 >>> 4;
            int var34 = var4 + var21;
            int var35 = var31 + var33;
            var3 = var35 ^ var33 << 8;
            int var36 = var33 + var34;
            var8 = var3 + var24;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field6342[var12] = var9;
            this.field6342[var12 + 1] = var8;
            this.field6342[var12 + 2] = var7;
            this.field6342[var12 + 3] = var6;
            this.field6342[var12 + 4] = var5;
            this.field6342[var12 + 5] = var4;
            this.field6342[var12 + 6] = var3;
            this.field6342[var12 + 7] = var2;
        }
        this.method2659(-1428495856);
        this.field6350 = 256;
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)V", line = 254)
    public static final void method2664(int arg0) {
        class181.field2717.method271(((float) class193.field3258.field7253 * 0.1F + 0.7F) * class519.field7606);
        field6340++;
        class181.field2717.method324(class189.field3186, class153.field2273, class403.field5986, (float) (class532.field7799 << 0), (float) (class345.field5098 << 0), (float) (class386.field5807 << 0));
        if (arg0 > -39) {
            field6341 = 69;
        }
        class181.field2717.method370(class38.field512);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V", line = 270)
    public static void method2665(byte arg0) {
        field6348 = null;
        if (arg0 != 94) {
            method2665((byte) 58);
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V", line = 283)
    private class426() {
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "([I)V", line = 286)
    public class426(int[] arg0) {
        this.field6346 = new int[256];
        this.field6342 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field6346[var2] = arg0[var2];
        }
        this.method2663(false);
    }
}
