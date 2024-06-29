import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class52 {

    @OriginalMember(owner = "client!m", name = "n", descriptor = "[I")
    private int[] field690;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "[I")
    private int[] field689;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field682 = 0;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    private int field678;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    private int field681;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    private int field683;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    private int field688;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "Lfh;")
    public static class140 field680;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "Lfh;")
    public static class140 field692;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "[I")
    public static int[] field685;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILfh;)V", line = 8)
    public static final void method400(int arg0, class140 arg1) {
        field684++;
        if (class176.field2416 || arg0 <= 50) {
            return;
        }
        if (class47.field623) {
            class129.method996();
        } else {
            class37.method253();
        }
        class312.field4590 = class100.method712(-1, class304.field4451, arg1);
        int var2 = class192.field2660;
        int var3 = var2 * 956 / 503;
        class312.field4590.method70((class163.field2314 - var3) / 2, 0, var3, var2);
        class30.field358 = class346.method2397(26494, arg1, class32.field382);
        class30.field358.method937(class163.field2314 / 2 - (class30.field358.field2024 / 2), 18);
        class176.field2416 = true;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V", line = 41)
    private final void method401(int arg0) {
        field677++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        int var10 = 0;
        if (arg0 != 1) {
            return;
        }
        while (var10 < 4) {
            int var11 = var9 ^ var8 << 11;
            int var12 = var6 + var11;
            int var13 = var7 + var8;
            int var14 = var13 ^ var7 >>> 2;
            int var15 = var7 + var12;
            int var16 = var15 ^ var12 << 8;
            int var17 = var5 + var14;
            int var18 = var12 + var17;
            var6 = var18 ^ var17 >>> 16;
            int var19 = var3 + var6;
            int var20 = var4 + var16;
            int var21 = var17 + var20;
            var5 = var21 ^ var20 << 10;
            int var22 = var19 + var20;
            var4 = var22 ^ var19 >>> 4;
            int var23 = var2 + var5;
            int var24 = var19 + var23;
            int var25 = var4 + var11;
            var3 = var24 ^ var23 << 8;
            var8 = var3 + var14;
            int var26 = var23 + var25;
            var2 = var26 ^ var25 >>> 9;
            var9 = var8 + var25;
            var7 = var2 + var16;
            var10++;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field689[var27 + 7] + var2;
            int var29 = this.field689[var27 + 6] + var3;
            int var30 = this.field689[var27 + 1] + var8;
            int var31 = this.field689[var27 + 4] + var5;
            int var32 = this.field689[var27 + 5] + var4;
            int var33 = this.field689[var27] + var9;
            int var34 = var33 ^ var30 << 11;
            int var35 = this.field689[var27 + 3] + var6;
            int var36 = this.field689[var27 + 2] + var7;
            int var37 = var30 + var36;
            int var38 = var37 ^ var36 >>> 2;
            int var39 = var31 + var38;
            int var40 = var34 + var35;
            int var41 = var36 + var40;
            int var42 = var41 ^ var40 << 8;
            int var43 = var32 + var42;
            int var44 = var39 + var40;
            var6 = var44 ^ var39 >>> 16;
            int var45 = var6 + var29;
            int var46 = var39 + var43;
            var5 = var46 ^ var43 << 10;
            int var47 = var5 + var28;
            int var48 = var43 + var45;
            var4 = var48 ^ var45 >>> 4;
            int var49 = var45 + var47;
            var3 = var49 ^ var47 << 8;
            int var50 = var4 + var34;
            int var51 = var47 + var50;
            var2 = var51 ^ var50 >>> 9;
            var8 = var3 + var38;
            var9 = var8 + var50;
            var7 = var2 + var42;
            this.field690[var27] = var9;
            this.field690[var27 + 1] = var8;
            this.field690[var27 + 2] = var7;
            this.field690[var27 + 3] = var6;
            this.field690[var27 + 4] = var5;
            this.field690[var27 + 5] = var4;
            this.field690[var27 + 6] = var3;
            this.field690[var27 + 7] = var2;
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field690[var52 + 4] + var5;
            int var54 = this.field690[var52 + 3] + var6;
            int var55 = this.field690[var52 + 1] + var8;
            int var56 = this.field690[var52 + 2] + var7;
            int var57 = this.field690[var52 + 6] + var3;
            int var58 = this.field690[var52 + 5] + var4;
            int var59 = this.field690[var52] + var9;
            int var60 = this.field690[var52 + 7] + var2;
            int var61 = var59 ^ var55 << 11;
            int var62 = var54 + var61;
            int var63 = var55 + var56;
            int var64 = var63 ^ var56 >>> 2;
            int var65 = var53 + var64;
            int var66 = var56 + var62;
            int var67 = var66 ^ var62 << 8;
            int var68 = var62 + var65;
            var6 = var68 ^ var65 >>> 16;
            int var69 = var58 + var67;
            int var70 = var65 + var69;
            int var71 = var6 + var57;
            var5 = var70 ^ var69 << 10;
            int var72 = var5 + var60;
            int var73 = var69 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var72;
            var3 = var75 ^ var72 << 8;
            var8 = var3 + var64;
            int var76 = var72 + var74;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            this.field690[var52] = var9;
            this.field690[var52 + 1] = var8;
            var7 = var2 + var67;
            this.field690[var52 + 2] = var7;
            this.field690[var52 + 3] = var6;
            this.field690[var52 + 4] = var5;
            this.field690[var52 + 5] = var4;
            this.field690[var52 + 6] = var3;
            this.field690[var52 + 7] = var2;
        }
        this.method406(arg0 - 1);
        this.field678 = 256;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V", line = 186)
    public static void method402(int arg0) {
        field685 = null;
        if (arg0 != 2) {
            method402(-26);
        }
        field680 = null;
        field692 = null;
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(I)I", line = 215)
    public final int method403(int arg0) {
        if (this.field678-- == 0) {
            this.method406(0);
            this.field678 = 255;
        }
        if (arg0 > -109) {
            return -82;
        } else {
            field693++;
            return this.field689[this.field678];
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V", line = 230)
    private class52() {
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "([I)V", line = 232)
    public class52(int[] arg0) {
        this.field690 = new int[256];
        this.field689 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field689[var2] = arg0[var2];
        }
        this.method401(1);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lfh;IB)Lvn;", line = 253)
    public static final class11 method404(class140 arg0, int arg1, byte arg2) {
        field679++;
        if (class362.method2524(arg0, -5, arg1)) {
            return arg2 == 118 ? class234.method1662(90) : (class11) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V", line = 268)
    public static final void method405(int arg0, int arg1) {
        class221.field3181 = new int[arg1];
        class29.field331 = new int[arg1];
        field686++;
        class48.field646 = new int[arg1];
        if (arg0 == 16448) {
            class7.field64 = new int[arg1];
            class291.field4235 = new int[arg1];
        }
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(I)V", line = 284)
    private final void method406(int arg0) {
        this.field683 += ++this.field681;
        field687++;
        for (int var2 = arg0; var2 < 256; var2++) {
            int var3 = this.field690[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field688 ^= this.field688 << 13;
                } else {
                    this.field688 ^= this.field688 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field688 ^= this.field688 << 2;
            } else {
                this.field688 ^= this.field688 >>> 16;
            }
            this.field688 += this.field690[var2 + 128 & 0xFF];
            int var4;
            this.field690[var2] = var4 = this.field683 + (this.field690[class335.method2339(var3, 1020) >> 2] + this.field688);
            this.field689[var2] = this.field683 = this.field690[class335.method2339(255, var4 >> 8 >> 2)] + var3;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BLjava/lang/String;)J", line = 323)
    public static final long method407(byte arg0, String arg1) {
        field691++;
        if (arg0 < 67) {
            return -16L;
        }
        int var2 = arg1.length();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (long) arg1.charAt(var5) + (var3 << 5) - var3;
        }
        return var3;
    }
}
