import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class311 {

    @OriginalMember(owner = "client!haa", name = "c", descriptor = "[I")
    private int[] field3983;

    @OriginalMember(owner = "client!haa", name = "n", descriptor = "[I")
    private int[] field3994;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "I")
    private int field3981;

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!haa", name = "d", descriptor = "I")
    private int field3984;

    @OriginalMember(owner = "client!haa", name = "e", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!haa", name = "f", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!haa", name = "g", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!haa", name = "h", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!haa", name = "i", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!haa", name = "j", descriptor = "I")
    private int field3990;

    @OriginalMember(owner = "client!haa", name = "k", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!haa", name = "l", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!haa", name = "m", descriptor = "I")
    private int field3993;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Z)V")
    private final void method1815(boolean arg0) {
        field3989++;
        this.field3984 += ++this.field3990;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field3983[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field3981 ^= this.field3981 << 13;
                } else {
                    this.field3981 ^= this.field3981 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field3981 ^= this.field3981 << 2;
            } else {
                this.field3981 ^= this.field3981 >>> 16;
            }
            this.field3981 += this.field3983[var2 + 128 & 0xFF];
            int var4;
            this.field3983[var2] = var4 = this.field3984 + (this.field3983[class136.method878(var3 >> 2, 255)] + this.field3981);
            this.field3994[var2] = this.field3984 = var3 + this.field3983[class136.method878(255, var4 >> 8 >> 2)];
        }
        if (arg0) {
            this.field3994 = null;
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(B)I")
    public final int method1816(byte arg0) {
        if (arg0 < 12) {
            this.field3994 = null;
        }
        if (this.field3993 == 0) {
            this.method1815(false);
            this.field3993 = 256;
        }
        field3982++;
        return this.field3994[this.field3993 - 1];
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(B)I")
    public final int method1817(byte arg0) {
        field3988++;
        int var2 = -42 / ((arg0 - 54) / 34);
        if (this.field3993 == 0) {
            this.method1815(false);
            this.field3993 = 256;
        }
        return this.field3994[--this.field3993];
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method1818(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method1820(53, 78);
        }
        field3992++;
        return (arg1 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!haa", name = "c", descriptor = "(B)V")
    public static final void method1819(byte arg0) {
        if (arg0 != -82) {
            return;
        }
        field3986++;
        for (class690 var1 = (class690) class512.field7156.method3118((byte) 73); var1 != null; var1 = (class690) class512.field7156.method3111(arg0 ^ 0xFFFFFFD6)) {
            class623 var2 = var1.field9667;
            if (var2.field8892 < class245.field3409) {
                var1.method3065(-17363);
                var2.method3645((byte) -14);
            } else if (class245.field3409 >= var2.field8862) {
                var2.method3646((byte) 43);
                if (var2.field8899 > 0) {
                    class15 var3 = (class15) class403.field5587.method1381(true, (long) (var2.field8899 - 1));
                    if (var3 != null) {
                        class55 var4 = var3.field204;
                        if (var4.field9490 >= 0 && (class514.field7179 * 512) > var4.field9490 && var4.field9489 >= 0 && var4.field9489 < class456.field6281 * 512) {
                            var2.method3648(class245.field3409, class438.method2628(var4.field9490, var2.field9501, var4.field9489, (byte) -40) - var2.field8854, (byte) 122, var4.field9490, var4.field9489);
                        }
                    }
                }
                if (var2.field8899 < 0) {
                    int var5 = -var2.field8899 - 1;
                    class655 var6;
                    if (class471.field6467 == var5) {
                        var6 = class473.field6483;
                    } else {
                        var6 = class40.field563[var5];
                    }
                    if (var6 != null && var6.field9490 >= 0 && var6.field9490 < class514.field7179 * 512 && var6.field9489 >= 0 && class456.field6281 * 512 > var6.field9489) {
                        var2.method3648(class245.field3409, class438.method2628(var6.field9490, var2.field9501, var6.field9489, (byte) -37) - var2.field8854, (byte) 122, var6.field9490, var6.field9489);
                    }
                }
                var2.method3644(-1, class284.field3763);
                class257.method1603(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(II)V")
    public static final void method1820(int arg0, int arg1) {
        field3985++;
        class118 var2 = class126.method814(true, arg1, 2);
        var2.method778(arg0 + 3634);
        if (arg0 != 24336) {
            method1819((byte) -99);
        }
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(Z)V")
    private final void method1821(boolean arg0) {
        field3987++;
        if (!arg0) {
            this.method1821(true);
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
            int var68 = var63 + var66;
            int var69 = var4 + var67;
            var6 = var68 ^ var66 >>> 16;
            int var70 = var66 + var69;
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
            var7 = var2 + var67;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field3994[var11 + 7] + var2;
            int var38 = this.field3994[var11 + 1] + var8;
            int var39 = this.field3994[var11 + 2] + var7;
            int var40 = this.field3994[var11 + 3] + var6;
            int var41 = this.field3994[var11 + 5] + var4;
            int var42 = this.field3994[var11 + 6] + var3;
            int var43 = this.field3994[var11 + 4] + var5;
            int var44 = this.field3994[var11] + var9;
            int var45 = var44 ^ var38 << 11;
            int var46 = var40 + var45;
            int var47 = var38 + var39;
            int var48 = var47 ^ var39 >>> 2;
            int var49 = var39 + var46;
            int var50 = var43 + var48;
            int var51 = var49 ^ var46 << 8;
            int var52 = var46 + var50;
            int var53 = var41 + var51;
            var6 = var52 ^ var50 >>> 16;
            int var54 = var50 + var53;
            int var55 = var6 + var42;
            var5 = var54 ^ var53 << 10;
            int var56 = var5 + var37;
            int var57 = var53 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var4 + var45;
            int var59 = var55 + var56;
            var3 = var59 ^ var56 << 8;
            int var60 = var56 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            var7 = var2 + var51;
            this.field3983[var11] = var9;
            this.field3983[var11 + 1] = var8;
            this.field3983[var11 + 2] = var7;
            this.field3983[var11 + 3] = var6;
            this.field3983[var11 + 4] = var5;
            this.field3983[var11 + 5] = var4;
            this.field3983[var11 + 6] = var3;
            this.field3983[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field3983[var12 + 1] + var8;
            int var14 = this.field3983[var12 + 5] + var4;
            int var15 = this.field3983[var12 + 2] + var7;
            int var16 = this.field3983[var12 + 3] + var6;
            int var17 = this.field3983[var12 + 4] + var5;
            int var18 = this.field3983[var12] + var9;
            int var19 = this.field3983[var12 + 7] + var2;
            int var20 = this.field3983[var12 + 6] + var3;
            int var21 = var18 ^ var13 << 11;
            int var22 = var16 + var21;
            int var23 = var13 + var15;
            int var24 = var23 ^ var15 >>> 2;
            int var25 = var17 + var24;
            int var26 = var15 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var14 + var27;
            int var29 = var22 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var25 + var28;
            int var31 = var6 + var20;
            var5 = var30 ^ var28 << 10;
            int var32 = var28 + var31;
            int var33 = var5 + var19;
            var4 = var32 ^ var31 >>> 4;
            int var34 = var31 + var33;
            int var35 = var4 + var21;
            var3 = var34 ^ var33 << 8;
            var8 = var3 + var24;
            int var36 = var33 + var35;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field3983[var12] = var9;
            this.field3983[var12 + 1] = var8;
            this.field3983[var12 + 2] = var7;
            this.field3983[var12 + 3] = var6;
            this.field3983[var12 + 4] = var5;
            this.field3983[var12 + 5] = var4;
            this.field3983[var12 + 6] = var3;
            this.field3983[var12 + 7] = var2;
        }
        this.method1815(false);
        this.field3993 = 256;
    }

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "()V")
    private class311() {
    }

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "([I)V")
    public class311(int[] arg0) {
        this.field3983 = new int[256];
        this.field3994 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3994[var2] = arg0[var2];
        }
        this.method1821(true);
    }
}
