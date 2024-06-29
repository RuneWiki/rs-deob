import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class111 {

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "[I")
    private int[] field1641;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "[I")
    private int[] field1638;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1640 = "Loading fonts - ";

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "Lui;")
    public static class98 field1645 = new class98(64);

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "[Z")
    public static boolean[] field1651 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "Z")
    public static boolean field1653 = false;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public static int field1652 = -1;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    private int field1639;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    private int field1646;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    private int field1647;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    private int field1648;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "Lnm;")
    public static class221 field1654;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "[Lsi;")
    public static class264[] field1650;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V", line = 10)
    public static void method734(int arg0) {
        field1640 = null;
        field1654 = null;
        field1650 = null;
        field1651 = null;
        if (arg0 != -1) {
            field1651 = (boolean[]) null;
        }
        field1645 = null;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)I", line = 27)
    public final int method735(int arg0) {
        field1643++;
        if ((this.field1646--) == 0) {
            this.method736((byte) 117);
            this.field1646 = 255;
        }
        return arg0 <= 104 ? -58 : this.field1638[this.field1646];
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V", line = 44)
    private final void method736(byte arg0) {
        field1649++;
        this.field1647 += ++this.field1639;
        if (arg0 != 117) {
            return;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1641[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1648 ^= this.field1648 << 13;
                } else {
                    this.field1648 ^= this.field1648 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1648 ^= this.field1648 << 2;
            } else {
                this.field1648 ^= this.field1648 >>> 16;
            }
            this.field1648 += this.field1641[var2 + 128 & 0xFF];
            int var4;
            this.field1641[var2] = var4 = this.field1641[class235.method1623(var3, 1020) >> 2] - (-this.field1648 - this.field1647);
            this.field1638[var2] = this.field1647 = var3 + this.field1641[class235.method1623(255, var4 >> 8 >> 2)];
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)V", line = 94)
    private final void method737(byte arg0) {
        field1642++;
        if (arg0 != 5) {
            field1640 = (String) null;
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
            int var11 = var9 ^ var8 << 11;
            int var12 = var7 + var8;
            int var13 = var6 + var11;
            int var14 = var12 ^ var7 >>> 2;
            int var15 = var5 + var14;
            int var16 = var7 + var13;
            int var17 = var16 ^ var13 << 8;
            int var18 = var4 + var17;
            int var19 = var13 + var15;
            var6 = var19 ^ var15 >>> 16;
            int var20 = var15 + var18;
            int var21 = var3 + var6;
            var5 = var20 ^ var18 << 10;
            int var22 = var18 + var21;
            var4 = var22 ^ var21 >>> 4;
            int var23 = var2 + var5;
            int var24 = var4 + var11;
            int var25 = var21 + var23;
            var3 = var25 ^ var23 << 8;
            var8 = var3 + var14;
            int var26 = var23 + var24;
            var2 = var26 ^ var24 >>> 9;
            var7 = var2 + var17;
            var9 = var8 + var24;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field1638[var27 + 3] + var6;
            int var29 = this.field1638[var27 + 2] + var7;
            int var30 = this.field1638[var27] + var9;
            int var31 = this.field1638[var27 + 4] + var5;
            int var32 = this.field1638[var27 + 5] + var4;
            int var33 = this.field1638[var27 + 7] + var2;
            int var34 = this.field1638[var27 + 1] + var8;
            int var35 = this.field1638[var27 + 6] + var3;
            int var36 = var30 ^ var34 << 11;
            int var37 = var28 + var36;
            int var38 = var29 + var34;
            int var39 = var38 ^ var29 >>> 2;
            int var40 = var29 + var37;
            int var41 = var40 ^ var37 << 8;
            int var42 = var31 + var39;
            int var43 = var32 + var41;
            int var44 = var37 + var42;
            var6 = var44 ^ var42 >>> 16;
            int var45 = var42 + var43;
            var5 = var45 ^ var43 << 10;
            int var46 = var6 + var35;
            int var47 = var5 + var33;
            int var48 = var43 + var46;
            var4 = var48 ^ var46 >>> 4;
            int var49 = var4 + var36;
            int var50 = var46 + var47;
            var3 = var50 ^ var47 << 8;
            int var51 = var47 + var49;
            var8 = var3 + var39;
            var2 = var51 ^ var49 >>> 9;
            var7 = var2 + var41;
            var9 = var8 + var49;
            this.field1641[var27] = var9;
            this.field1641[var27 + 1] = var8;
            this.field1641[var27 + 2] = var7;
            this.field1641[var27 + 3] = var6;
            this.field1641[var27 + 4] = var5;
            this.field1641[var27 + 5] = var4;
            this.field1641[var27 + 6] = var3;
            this.field1641[var27 + 7] = var2;
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field1641[var52 + 5] + var4;
            int var54 = this.field1641[var52 + 7] + var2;
            int var55 = this.field1641[var52 + 4] + var5;
            int var56 = this.field1641[var52 + 3] + var6;
            int var57 = this.field1641[var52 + 2] + var7;
            int var58 = this.field1641[var52 + 6] + var3;
            int var59 = this.field1641[var52] + var9;
            int var60 = this.field1641[var52 + 1] + var8;
            int var61 = var59 ^ var60 << 11;
            int var62 = var57 + var60;
            int var63 = var62 ^ var57 >>> 2;
            int var64 = var56 + var61;
            int var65 = var55 + var63;
            int var66 = var57 + var64;
            int var67 = var66 ^ var64 << 8;
            int var68 = var53 + var67;
            int var69 = var64 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var6 + var58;
            int var71 = var65 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var5 + var54;
            int var73 = var68 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var70 + var72;
            var3 = var74 ^ var72 << 8;
            var8 = var3 + var63;
            int var75 = var4 + var61;
            int var76 = var72 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
            this.field1641[var52] = var9;
            this.field1641[var52 + 1] = var8;
            this.field1641[var52 + 2] = var7;
            this.field1641[var52 + 3] = var6;
            this.field1641[var52 + 4] = var5;
            this.field1641[var52 + 5] = var4;
            this.field1641[var52 + 6] = var3;
            this.field1641[var52 + 7] = var2;
        }
        this.method736((byte) 117);
        this.field1646 = 256;
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)V", line = 241)
    public static final void method738(int arg0) {
        field1644++;
        int var1 = 42 / ((-arg0) / 49);
        if (class30.field460) {
            class13.field165 = null;
            class30.field460 = false;
            class15.field201 = null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V", line = 255)
    private class111() {
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "([I)V", line = 258)
    public class111(int[] arg0) {
        this.field1641 = new int[256];
        this.field1638 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1638[var2] = arg0[var2];
        }
        this.method737((byte) 5);
    }
}
