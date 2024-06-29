import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class46 {

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "[I")
    private int[] field619;

    @OriginalMember(owner = "client!wba", name = "m", descriptor = "[I")
    private int[] field631;

    @OriginalMember(owner = "client!wba", name = "e", descriptor = "[I")
    public static int[] field623 = new int[200];

    @OriginalMember(owner = "client!wba", name = "o", descriptor = "Ljava/lang/Object;")
    public static volatile Object field633 = null;

    @OriginalMember(owner = "client!wba", name = "k", descriptor = "Lrl;")
    public static class672 field629 = new class672(66, 8);

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "I")
    private int field620;

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!wba", name = "d", descriptor = "I")
    private int field622;

    @OriginalMember(owner = "client!wba", name = "f", descriptor = "I")
    private int field624;

    @OriginalMember(owner = "client!wba", name = "g", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!wba", name = "h", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!wba", name = "i", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!wba", name = "j", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!wba", name = "l", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!wba", name = "n", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!wba", name = "p", descriptor = "I")
    private int field634;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)I")
    public final int method542(int arg0) {
        field621++;
        if (this.field634 == 0) {
            this.method547(-14685);
            this.field634 = 256;
        }
        return arg0 == 7 ? this.field619[this.field634 - 1] : 83;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)V")
    private final void method543(byte arg0) {
        field627++;
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
            int var66 = var5 + var64;
            int var67 = var65 ^ var62 << 8;
            int var68 = var4 + var67;
            int var69 = var62 + var66;
            var6 = var69 ^ var66 >>> 16;
            int var70 = var66 + var68;
            int var71 = var3 + var6;
            var5 = var70 ^ var68 << 10;
            int var72 = var68 + var71;
            int var73 = var2 + var5;
            var4 = var72 ^ var71 >>> 4;
            int var74 = var71 + var73;
            int var75 = var4 + var61;
            var3 = var74 ^ var73 << 8;
            var8 = var3 + var64;
            int var76 = var73 + var75;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field619[var11 + 4] + var5;
            int var38 = this.field619[var11 + 6] + var3;
            int var39 = this.field619[var11] + var9;
            int var40 = this.field619[var11 + 1] + var8;
            int var41 = this.field619[var11 + 7] + var2;
            int var42 = this.field619[var11 + 5] + var4;
            int var43 = this.field619[var11 + 3] + var6;
            int var44 = this.field619[var11 + 2] + var7;
            int var45 = var39 ^ var40 << 11;
            int var46 = var40 + var44;
            int var47 = var43 + var45;
            int var48 = var46 ^ var44 >>> 2;
            int var49 = var44 + var47;
            int var50 = var37 + var48;
            int var51 = var49 ^ var47 << 8;
            int var52 = var47 + var50;
            int var53 = var42 + var51;
            var6 = var52 ^ var50 >>> 16;
            int var54 = var6 + var38;
            int var55 = var50 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var5 + var41;
            int var57 = var53 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var54 + var56;
            int var59 = var4 + var45;
            var3 = var58 ^ var56 << 8;
            int var60 = var56 + var59;
            var8 = var3 + var48;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            var7 = var2 + var51;
            this.field631[var11] = var9;
            this.field631[var11 + 1] = var8;
            this.field631[var11 + 2] = var7;
            this.field631[var11 + 3] = var6;
            this.field631[var11 + 4] = var5;
            this.field631[var11 + 5] = var4;
            this.field631[var11 + 6] = var3;
            this.field631[var11 + 7] = var2;
        }
        int var12 = 0;
        if (arg0 <= 92) {
            method544(-56);
        }
        while (var12 < 256) {
            int var13 = this.field631[var12 + 1] + var8;
            int var14 = this.field631[var12 + 2] + var7;
            int var15 = this.field631[var12 + 4] + var5;
            int var16 = this.field631[var12 + 6] + var3;
            int var17 = this.field631[var12 + 7] + var2;
            int var18 = this.field631[var12 + 5] + var4;
            int var19 = this.field631[var12 + 3] + var6;
            int var20 = this.field631[var12] + var9;
            int var21 = var20 ^ var13 << 11;
            int var22 = var13 + var14;
            int var23 = var19 + var21;
            int var24 = var22 ^ var14 >>> 2;
            int var25 = var14 + var23;
            int var26 = var15 + var24;
            int var27 = var25 ^ var23 << 8;
            int var28 = var23 + var26;
            int var29 = var18 + var27;
            var6 = var28 ^ var26 >>> 16;
            int var30 = var26 + var29;
            int var31 = var6 + var16;
            var5 = var30 ^ var29 << 10;
            int var32 = var5 + var17;
            int var33 = var29 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var4 + var21;
            int var35 = var31 + var32;
            var3 = var35 ^ var32 << 8;
            var8 = var3 + var24;
            int var36 = var32 + var34;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            var7 = var2 + var27;
            this.field631[var12] = var9;
            this.field631[var12 + 1] = var8;
            this.field631[var12 + 2] = var7;
            this.field631[var12 + 3] = var6;
            this.field631[var12 + 4] = var5;
            this.field631[var12 + 5] = var4;
            this.field631[var12 + 6] = var3;
            this.field631[var12 + 7] = var2;
            var12 += 8;
        }
        this.method547(-14685);
        this.field634 = 256;
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(I)V")
    public static final void method544(int arg0) {
        field630++;
        class66.field854.method569(0);
        class177.field2913.method569(0);
        class345.field5554.method569(0);
        if (arg0 > -53) {
            method546(72);
        }
        class246.field3929.method569(0);
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Z)I")
    public final int method545(boolean arg0) {
        field626++;
        if (this.field634 == 0) {
            this.method547(-14685);
            this.field634 = 256;
        }
        return arg0 ? this.field619[--this.field634] : -28;
    }

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "(I)V")
    public static final void method546(int arg0) {
        field628++;
        if (arg0 != -15541) {
            field629 = null;
        }
        if (class204.field3328 != null && class174.field2873 != null) {
            return;
        }
        class174.field2873 = new int[256];
        class204.field3328 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class204.field3328[var1] = (int) (Math.sin(var2) * 4096.0D);
            class174.field2873[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!wba", name = "d", descriptor = "(I)V")
    private final void method547(int arg0) {
        field625++;
        if (arg0 != -14685) {
            return;
        }
        this.field624 += ++this.field620;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field631[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field622 ^= this.field622 << 13;
                } else {
                    this.field622 ^= this.field622 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field622 ^= this.field622 << 2;
            } else {
                this.field622 ^= this.field622 >>> 16;
            }
            this.field622 += this.field631[var2 + 128 & 0xFF];
            int var4;
            this.field631[var2] = var4 = this.field624 + this.field622 + this.field631[class453.method2846(var3, 1020) >> 2];
            this.field619[var2] = this.field624 = this.field631[class453.method2846(var4 >> 8 >> 2, 255)] + var3;
        }
    }

    @OriginalMember(owner = "client!wba", name = "<init>", descriptor = "()V")
    private class46() {
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(ILbm;Lbm;)V")
    public static final void method548(int arg0, class98 arg1, class98 arg2) {
        field632++;
        if (arg2.field1591 != null) {
            arg2.method958((byte) 69);
        }
        if (arg0 == 601921382) {
            arg2.field1588 = arg1.field1588;
            arg2.field1591 = arg1;
            arg2.field1591.field1588 = arg2;
            arg2.field1588.field1591 = arg2;
        }
    }

    @OriginalMember(owner = "client!wba", name = "<init>", descriptor = "([I)V")
    public class46(int[] arg0) {
        this.field619 = new int[256];
        this.field631 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field619[var2] = arg0[var2];
        }
        this.method543((byte) 107);
    }

    @OriginalMember(owner = "client!wba", name = "e", descriptor = "(I)V")
    public static void method549(int arg0) {
        field623 = null;
        field629 = null;
        field633 = null;
        if (arg0 != 297715426) {
            method546(-53);
        }
    }
}
