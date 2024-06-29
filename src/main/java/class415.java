import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class415 {

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "[I")
    private int[] field5683;

    @OriginalMember(owner = "client!pp", name = "n", descriptor = "[I")
    private int[] field5692;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "Lfja;")
    public static class783 field5680 = new class783(1, -2);

    @OriginalMember(owner = "client!pp", name = "m", descriptor = "I")
    public static int field5691 = 0;

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "[C")
    private static char[] field5688 = new char[64];

    @OriginalMember(owner = "client!pp", name = "p", descriptor = "[[B")
    public static byte[][] field5694;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "I")
    public static int field5679;

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
    public static int field5682;

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "I")
    private int field5684;

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "I")
    public static int field5685;

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "I")
    private int field5686;

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
    private int field5689;

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "I")
    private int field5690;

    @OriginalMember(owner = "client!pp", name = "o", descriptor = "I")
    public static int field5693;

    @OriginalMember(owner = "client!pp", name = "q", descriptor = "I")
    public static int field5695;

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "Lca;")
    public static class323 field5687;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
    private final void method2449(int arg0) {
        field5685++;
        if (arg0 != 255) {
            this.method2454((byte) 127);
        }
        this.field5690 += ++this.field5686;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field5683[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field5689 ^= this.field5689 << 13;
                } else {
                    this.field5689 ^= this.field5689 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field5689 ^= this.field5689 << 2;
            } else {
                this.field5689 ^= this.field5689 >>> 16;
            }
            this.field5689 += this.field5683[var2 + 128 & 0xFF];
            int var4;
            this.field5683[var2] = var4 = this.field5690 + this.field5689 + this.field5683[class204.method1456(var3, 1020) >> 2];
            this.field5692[var2] = this.field5690 = var3 + this.field5683[class204.method1456(255, var4 >> 8 >> 2)];
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2450(String arg0, int arg1) {
        field5681++;
        if (arg0.equals("")) {
            return;
        }
        class3.field35++;
        class537 var2 = class476.method2729(class287.field3939, (byte) -46, class551.field7498);
        var2.field7295.method754(class703.method3926(120, arg0), 127);
        var2.field7295.method783((byte) 108, arg0);
        class173.method1314(false, var2);
        if (arg1 != -2015) {
            field5691 = 114;
        }
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V")
    public static void method2451(int arg0) {
        field5680 = null;
        field5694 = null;
        int var1 = 62 % ((-arg0 - 7) / 44);
        field5688 = null;
        field5687 = null;
    }

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "(I)[Lqn;")
    public static final class71[] method2452(int arg0) {
        field5695++;
        if (arg0 != 7) {
            field5691 = 16;
        }
        return new class71[] { class431.field5874, class614.field8553, class643.field8897 };
    }

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "(I)I")
    public final int method2453(int arg0) {
        if (arg0 != 256) {
            this.field5686 = 16;
        }
        field5682++;
        if (this.field5684 == 0) {
            this.method2449(255);
            this.field5684 = 256;
        }
        return this.field5692[--this.field5684];
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V")
    private final void method2454(byte arg0) {
        field5693++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var62 = var9 ^ var8 << 11;
            int var63 = var6 + var62;
            int var64 = var7 + var8;
            int var65 = var64 ^ var7 >>> 2;
            int var66 = var7 + var63;
            int var67 = var5 + var65;
            int var68 = var66 ^ var63 << 8;
            int var69 = var4 + var68;
            int var70 = var63 + var67;
            var6 = var70 ^ var67 >>> 16;
            int var71 = var67 + var69;
            int var72 = var3 + var6;
            var5 = var71 ^ var69 << 10;
            int var73 = var69 + var72;
            int var74 = var2 + var5;
            var4 = var73 ^ var72 >>> 4;
            int var75 = var4 + var62;
            int var76 = var72 + var74;
            var3 = var76 ^ var74 << 8;
            var8 = var3 + var65;
            int var77 = var74 + var75;
            var2 = var77 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var68;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var38 = this.field5692[var11 + 6] + var3;
            int var39 = this.field5692[var11 + 2] + var7;
            int var40 = this.field5692[var11 + 5] + var4;
            int var41 = this.field5692[var11 + 7] + var2;
            int var42 = this.field5692[var11 + 4] + var5;
            int var43 = this.field5692[var11 + 1] + var8;
            int var44 = this.field5692[var11 + 3] + var6;
            int var45 = this.field5692[var11] + var9;
            int var46 = var45 ^ var43 << 11;
            int var47 = var39 + var43;
            int var48 = var44 + var46;
            int var49 = var47 ^ var39 >>> 2;
            int var50 = var39 + var48;
            int var51 = var42 + var49;
            int var52 = var50 ^ var48 << 8;
            int var53 = var40 + var52;
            int var54 = var48 + var51;
            var6 = var54 ^ var51 >>> 16;
            int var55 = var51 + var53;
            int var56 = var6 + var38;
            var5 = var55 ^ var53 << 10;
            int var57 = var5 + var41;
            int var58 = var53 + var56;
            var4 = var58 ^ var56 >>> 4;
            int var59 = var4 + var46;
            int var60 = var56 + var57;
            var3 = var60 ^ var57 << 8;
            var8 = var3 + var49;
            int var61 = var57 + var59;
            var2 = var61 ^ var59 >>> 9;
            var9 = var8 + var59;
            var7 = var2 + var52;
            this.field5683[var11] = var9;
            this.field5683[var11 + 1] = var8;
            this.field5683[var11 + 2] = var7;
            this.field5683[var11 + 3] = var6;
            this.field5683[var11 + 4] = var5;
            this.field5683[var11 + 5] = var4;
            this.field5683[var11 + 6] = var3;
            this.field5683[var11 + 7] = var2;
        }
        int var12 = 0;
        int var13 = -84 % ((arg0 + 11) / 38);
        while (var12 < 256) {
            int var14 = this.field5683[var12] + var9;
            int var15 = this.field5683[var12 + 5] + var4;
            int var16 = this.field5683[var12 + 3] + var6;
            int var17 = this.field5683[var12 + 4] + var5;
            int var18 = this.field5683[var12 + 1] + var8;
            int var19 = this.field5683[var12 + 2] + var7;
            int var20 = this.field5683[var12 + 6] + var3;
            int var21 = this.field5683[var12 + 7] + var2;
            int var22 = var14 ^ var18 << 11;
            int var23 = var18 + var19;
            int var24 = var16 + var22;
            int var25 = var23 ^ var19 >>> 2;
            int var26 = var17 + var25;
            int var27 = var19 + var24;
            int var28 = var27 ^ var24 << 8;
            int var29 = var24 + var26;
            int var30 = var15 + var28;
            var6 = var29 ^ var26 >>> 16;
            int var31 = var6 + var20;
            int var32 = var26 + var30;
            var5 = var32 ^ var30 << 10;
            int var33 = var5 + var21;
            int var34 = var30 + var31;
            var4 = var34 ^ var31 >>> 4;
            int var35 = var4 + var22;
            int var36 = var31 + var33;
            var3 = var36 ^ var33 << 8;
            var8 = var3 + var25;
            int var37 = var33 + var35;
            var2 = var37 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var28;
            this.field5683[var12] = var9;
            this.field5683[var12 + 1] = var8;
            this.field5683[var12 + 2] = var7;
            this.field5683[var12 + 3] = var6;
            this.field5683[var12 + 4] = var5;
            this.field5683[var12 + 5] = var4;
            this.field5683[var12 + 6] = var3;
            this.field5683[var12 + 7] = var2;
            var12 += 8;
        }
        this.method2449(255);
        this.field5684 = 256;
    }

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "(I)I")
    public final int method2455(int arg0) {
        if (this.field5684 == 0) {
            this.method2449(255);
            this.field5684 = 256;
        }
        if (arg0 != 31736) {
            method2450(null, -113);
        }
        field5679++;
        return this.field5692[this.field5684 - 1];
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "()V")
    private class415() {
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "([I)V")
    public class415(int[] arg0) {
        this.field5683 = new int[256];
        this.field5692 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field5692[var2] = arg0[var2];
        }
        this.method2454((byte) -110);
    }

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field5688[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field5688[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field5688[var2] = (char) (var2 + 48 - 52);
        }
        field5688[63] = '/';
        field5688[62] = '+';
        field5694 = new byte[1000][];
    }
}
