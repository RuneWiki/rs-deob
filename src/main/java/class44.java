import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class44 {

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "[I")
    private int[] field694;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "[I")
    private int[] field689;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "Leg;")
    public static class37 field677 = class174.method1167("3D)2Softwarebibliothek gestartet)3", 66);

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
    public static int field691 = 0;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "Leg;")
    public static class37 field681 = class174.method1167(":tradereq:", -40);

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "[I")
    public static int[] field693 = new int[64];

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    private int field680;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    private int field683;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    private int field686;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
    private int field690;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "[[[I")
    public static int[][][] field684;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)I")
    public final int method287(int arg0) {
        if (arg0 != -1375) {
            method288(true);
        }
        field687++;
        if ((this.field690--) == 0) {
            this.method292(arg0 + 1503);
            this.field690 = 255;
        }
        return this.field694[this.field690];
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
    public static void method288(boolean arg0) {
        field693 = null;
        field677 = null;
        field681 = null;
        field684 = null;
        if (arg0) {
            field684 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILjl;)V")
    public static final void method289(int arg0, class101 arg1) {
        field679++;
        class271.field4751 = arg1;
        if (arg0 > 38) {
            class277.field4909 = class271.field4751.method672(16, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;)I")
    public static final int method290(byte arg0, KeyEvent arg1) {
        int var2 = arg1.getKeyChar();
        field692++;
        if (var2 == 8364) {
            return 128;
        }
        if (arg0 != -71) {
            field682 = 17;
        }
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
    private final void method291(int arg0) {
        field685++;
        if (arg0 != -19451) {
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
            int var67 = var4 + var66;
            int var68 = var5 + var64;
            int var69 = var62 + var68;
            var6 = var69 ^ var68 >>> 16;
            int var70 = var67 + var68;
            int var71 = var3 + var6;
            var5 = var70 ^ var67 << 10;
            int var72 = var67 + var71;
            int var73 = var2 + var5;
            var4 = var72 ^ var71 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var73;
            var3 = var75 ^ var73 << 8;
            int var76 = var73 + var74;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var66;
            var8 = var3 + var64;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field694[var11 + 5] + var4;
            int var38 = this.field694[var11 + 6] + var3;
            int var39 = this.field694[var11 + 7] + var2;
            int var40 = this.field694[var11 + 3] + var6;
            int var41 = this.field694[var11] + var9;
            int var42 = this.field694[var11 + 1] + var8;
            int var43 = this.field694[var11 + 4] + var5;
            int var44 = var41 ^ var42 << 11;
            int var45 = this.field694[var11 + 2] + var7;
            int var46 = var40 + var44;
            int var47 = var42 + var45;
            int var48 = var47 ^ var45 >>> 2;
            int var49 = var45 + var46;
            int var50 = var43 + var48;
            int var51 = var49 ^ var46 << 8;
            int var52 = var37 + var51;
            int var53 = var46 + var50;
            var6 = var53 ^ var50 >>> 16;
            int var54 = var50 + var52;
            var5 = var54 ^ var52 << 10;
            int var55 = var5 + var39;
            int var56 = var6 + var38;
            int var57 = var52 + var56;
            var4 = var57 ^ var56 >>> 4;
            int var58 = var4 + var44;
            int var59 = var55 + var56;
            var3 = var59 ^ var55 << 8;
            int var60 = var55 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field689[var11] = var9;
            this.field689[var11 + 1] = var8;
            this.field689[var11 + 2] = var7;
            this.field689[var11 + 3] = var6;
            this.field689[var11 + 4] = var5;
            this.field689[var11 + 5] = var4;
            this.field689[var11 + 6] = var3;
            this.field689[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field689[var12 + 6] + var3;
            int var14 = this.field689[var12 + 5] + var4;
            int var15 = this.field689[var12 + 1] + var8;
            int var16 = this.field689[var12] + var9;
            int var17 = this.field689[var12 + 2] + var7;
            int var18 = var16 ^ var15 << 11;
            int var19 = this.field689[var12 + 7] + var2;
            int var20 = this.field689[var12 + 3] + var6;
            int var21 = var18 + var20;
            int var22 = this.field689[var12 + 4] + var5;
            int var23 = var15 + var17;
            int var24 = var23 ^ var17 >>> 2;
            int var25 = var17 + var21;
            int var26 = var22 + var24;
            int var27 = var25 ^ var21 << 8;
            int var28 = var14 + var27;
            int var29 = var21 + var26;
            var6 = var29 ^ var26 >>> 16;
            int var30 = var6 + var13;
            int var31 = var26 + var28;
            var5 = var31 ^ var28 << 10;
            int var32 = var5 + var19;
            int var33 = var28 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var4 + var18;
            int var35 = var30 + var32;
            var3 = var35 ^ var32 << 8;
            int var36 = var32 + var34;
            var8 = var3 + var24;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field689[var12] = var9;
            this.field689[var12 + 1] = var8;
            this.field689[var12 + 2] = var7;
            this.field689[var12 + 3] = var6;
            this.field689[var12 + 4] = var5;
            this.field689[var12 + 5] = var4;
            this.field689[var12 + 6] = var3;
            this.field689[var12 + 7] = var2;
        }
        this.method292(128);
        this.field690 = 256;
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V")
    private final void method292(int arg0) {
        this.field683 += ++this.field686;
        if (arg0 != 128) {
            this.field690 = -16;
        }
        field678++;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field689[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field680 ^= this.field680 << 13;
                } else {
                    this.field680 ^= this.field680 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field680 ^= this.field680 << 2;
            } else {
                this.field680 ^= this.field680 >>> 16;
            }
            this.field680 += this.field689[var2 + 128 & 0xFF];
            int var4;
            this.field689[var2] = var4 = this.field680 + this.field689[class96.method626(var3 >> 2, 255)] + this.field683;
            this.field694[var2] = this.field683 = this.field689[class96.method626(255, var4 >> 8 >> 2)] + var3;
        }
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)I")
    public static final int method293(int arg0) {
        if (arg0 == -1627) {
            class225.field3864 = 0;
            field688++;
            return class241.method1659(-4);
        } else {
            return -63;
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
    private class44() {
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "([I)V")
    public class44(int[] arg0) {
        this.field694 = new int[256];
        this.field689 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field694[var2] = arg0[var2];
        }
        this.method291(-19451);
    }
}
