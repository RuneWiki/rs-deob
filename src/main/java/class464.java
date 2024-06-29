import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class464 {

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "[I")
    private int[] field6813;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "[I")
    private int[] field6816;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field6809 = 1;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "Lkl;")
    public static class55 field6820 = new class55(14, 0, 4, 1);

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "Lqp;")
    public static class466 field6823 = new class466("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field6810;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    private int field6811;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    private int field6812;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    private int field6814;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field6815;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    private int field6817;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field6818;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field6819;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
    public static int field6821;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public static int field6822;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)I")
    public final int method2723(int arg0) {
        if (this.field6817 == 0) {
            this.method2725(124);
            this.field6817 = 256;
        }
        if (arg0 != -257) {
            method2728(56, 51, -56, -7, -16);
        }
        field6819++;
        return this.field6813[--this.field6817];
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
    private final void method2724(byte arg0) {
        field6822++;
        int var2 = 76 % ((arg0 + 54) / 36);
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
            int var71 = var4 + var7;
            int var72 = var66 + var69;
            var6 = var72 ^ var69 << 10;
            int var73 = var3 + var6;
            int var74 = var69 + var71;
            var5 = var74 ^ var71 >>> 4;
            int var75 = var5 + var62;
            int var76 = var71 + var73;
            var4 = var76 ^ var73 << 8;
            int var77 = var73 + var75;
            var9 = var4 + var65;
            var3 = var77 ^ var75 >>> 9;
            var10 = var9 + var75;
            var8 = var3 + var68;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var38 = this.field6813[var12 + 6] + var4;
            int var39 = this.field6813[var12 + 5] + var5;
            int var40 = this.field6813[var12 + 4] + var6;
            int var41 = this.field6813[var12 + 7] + var3;
            int var42 = this.field6813[var12] + var10;
            int var43 = this.field6813[var12 + 2] + var8;
            int var44 = this.field6813[var12 + 3] + var7;
            int var45 = this.field6813[var12 + 1] + var9;
            int var46 = var42 ^ var45 << 11;
            int var47 = var43 + var45;
            int var48 = var44 + var46;
            int var49 = var47 ^ var43 >>> 2;
            int var50 = var40 + var49;
            int var51 = var43 + var48;
            int var52 = var51 ^ var48 << 8;
            int var53 = var48 + var50;
            int var54 = var39 + var52;
            var7 = var53 ^ var50 >>> 16;
            int var55 = var50 + var54;
            int var56 = var7 + var38;
            var6 = var55 ^ var54 << 10;
            int var57 = var54 + var56;
            int var58 = var6 + var41;
            var5 = var57 ^ var56 >>> 4;
            int var59 = var5 + var46;
            int var60 = var56 + var58;
            var4 = var60 ^ var58 << 8;
            int var61 = var58 + var59;
            var9 = var4 + var49;
            var3 = var61 ^ var59 >>> 9;
            var8 = var3 + var52;
            var10 = var9 + var59;
            this.field6816[var12] = var10;
            this.field6816[var12 + 1] = var9;
            this.field6816[var12 + 2] = var8;
            this.field6816[var12 + 3] = var7;
            this.field6816[var12 + 4] = var6;
            this.field6816[var12 + 5] = var5;
            this.field6816[var12 + 6] = var4;
            this.field6816[var12 + 7] = var3;
        }
        for (int var13 = 0; var13 < 256; var13 += 8) {
            int var14 = this.field6816[var13] + var10;
            int var15 = this.field6816[var13 + 5] + var5;
            int var16 = this.field6816[var13 + 6] + var4;
            int var17 = this.field6816[var13 + 1] + var9;
            int var18 = this.field6816[var13 + 3] + var7;
            int var19 = this.field6816[var13 + 2] + var8;
            int var20 = this.field6816[var13 + 7] + var3;
            int var21 = this.field6816[var13 + 4] + var6;
            int var22 = var14 ^ var17 << 11;
            int var23 = var18 + var22;
            int var24 = var17 + var19;
            int var25 = var24 ^ var19 >>> 2;
            int var26 = var21 + var25;
            int var27 = var19 + var23;
            int var28 = var27 ^ var23 << 8;
            int var29 = var15 + var28;
            int var30 = var23 + var26;
            var7 = var30 ^ var26 >>> 16;
            int var31 = var7 + var16;
            int var32 = var26 + var29;
            var6 = var32 ^ var29 << 10;
            int var33 = var6 + var20;
            int var34 = var29 + var31;
            var5 = var34 ^ var31 >>> 4;
            int var35 = var31 + var33;
            int var36 = var5 + var22;
            var4 = var35 ^ var33 << 8;
            var9 = var4 + var25;
            int var37 = var33 + var36;
            var3 = var37 ^ var36 >>> 9;
            var10 = var9 + var36;
            var8 = var3 + var28;
            this.field6816[var13] = var10;
            this.field6816[var13 + 1] = var9;
            this.field6816[var13 + 2] = var8;
            this.field6816[var13 + 3] = var7;
            this.field6816[var13 + 4] = var6;
            this.field6816[var13 + 5] = var5;
            this.field6816[var13 + 6] = var4;
            this.field6816[var13 + 7] = var3;
        }
        this.method2725(-82);
        this.field6817 = 256;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
    private final void method2725(int arg0) {
        field6818++;
        int var2 = -73 / ((60 - arg0) / 35);
        this.field6814 += ++this.field6812;
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = this.field6816[var3];
            if ((var3 & 0x2) == 0) {
                if ((var3 & 0x1) == 0) {
                    this.field6811 ^= this.field6811 << 13;
                } else {
                    this.field6811 ^= this.field6811 >>> 6;
                }
            } else if ((var3 & 0x1) == 0) {
                this.field6811 ^= this.field6811 << 2;
            } else {
                this.field6811 ^= this.field6811 >>> 16;
            }
            this.field6811 += this.field6816[var3 + 128 & 0xFF];
            int var5;
            this.field6816[var3] = var5 = this.field6816[class251.method1501(255, var4 >> 2)] + this.field6811 + this.field6814;
            this.field6813[var3] = this.field6814 = this.field6816[class251.method1501(var5, 261166) >> 8 >> 2] + var4;
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)I")
    public final int method2726(int arg0) {
        field6815++;
        if (this.field6817 == 0) {
            this.method2725(113);
            this.field6817 = 256;
        }
        return arg0 < 101 ? -35 : this.field6813[this.field6817 - 1];
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)V")
    public static void method2727(int arg0) {
        field6820 = null;
        if (arg0 != 1) {
            field6809 = -89;
        }
        field6823 = null;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
    private class464() {
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "([I)V")
    public class464(int[] arg0) {
        this.field6813 = new int[256];
        this.field6816 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field6813[var2] = arg0[var2];
        }
        this.method2724((byte) -90);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIII)V")
    public static final void method2728(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6810++;
        int var5 = 0;
        if (arg2 <= 59) {
            return;
        }
        int var6 = arg3;
        int var7 = -arg3;
        int var8 = -1;
        int var9 = class46.method425(true, arg1 + arg3, class76.field1021, class424.field6204);
        int var10 = class46.method425(true, arg1 - arg3, class76.field1021, class424.field6204);
        class210.method1300(var10, class437.field6400[arg4], (byte) 82, var9, arg0);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg4 - var6;
                int var12 = arg4 + var6;
                if (var12 >= class417.field6057 && class224.field3193 >= var11) {
                    int var13 = class46.method425(true, arg1 + var5, class76.field1021, class424.field6204);
                    int var14 = class46.method425(true, arg1 - var5, class76.field1021, class424.field6204);
                    if (class224.field3193 >= var12) {
                        class210.method1300(var14, class437.field6400[var12], (byte) 104, var13, arg0);
                    }
                    if (class417.field6057 <= var11) {
                        class210.method1300(var14, class437.field6400[var11], (byte) 79, var13, arg0);
                    }
                }
            }
            var5++;
            int var15 = arg4 - var5;
            int var16 = arg4 + var5;
            if (var16 >= class417.field6057 && var15 <= class224.field3193) {
                int var17 = class46.method425(true, arg1 + var6, class76.field1021, class424.field6204);
                int var18 = class46.method425(true, arg1 - var6, class76.field1021, class424.field6204);
                if (var16 <= class224.field3193) {
                    class210.method1300(var18, class437.field6400[var16], (byte) 88, var17, arg0);
                }
                if (class417.field6057 <= var15) {
                    class210.method1300(var18, class437.field6400[var15], (byte) 103, var17, arg0);
                }
            }
        }
    }
}
