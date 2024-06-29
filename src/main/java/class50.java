import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class50 {

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "[I")
    private int[] field880;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "[I")
    private int[] field861;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Lha;")
    private static class46 field857 = class271.method1828("Loading config )2 ", -46);

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Lha;")
    private static class46 field860 = class271.method1828("slide:", -46);

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Lha;")
    public static class46 field865 = class271.method1828("Spielwelt erstellt)3", -46);

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "Lha;")
    public static class46 field873 = field857;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "Lha;")
    public static class46 field869 = class271.method1828("Ablegen", -46);

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "Lha;")
    public static class46 field872 = class271.method1828("Lade Konfiguration )2 ", -46);

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "Lha;")
    public static class46 field878 = field860;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "[I")
    public static int[] field863 = new int[50];

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field859 = 0;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "[[I")
    public static int[][] field870 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "Lha;")
    public static class46 field881 = field860;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    private int field862;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    private int field864;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "I")
    private int field877;

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!oe", name = "A", descriptor = "I")
    private int field882;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static void method366(byte arg0) {
        field881 = null;
        field860 = null;
        field863 = null;
        field870 = null;
        field873 = null;
        field857 = null;
        field872 = null;
        field878 = null;
        if (arg0 >= 13) {
            field869 = null;
            field865 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BZLmb;Lmb;I)I")
    public static final int method367(byte arg0, boolean arg1, class119 arg2, class119 arg3, int arg4) {
        field858++;
        if (arg4 == 1) {
            int var5 = arg3.field3731;
            int var6 = arg2.field3731;
            if (!arg1) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var6 - var5;
        } else if (arg4 == 2) {
            return arg2.method950(arg0 ^ 0xFFFFB64F).field2270.method341((byte) -110, arg3.method950(18926).field2270);
        } else if (arg4 == 3) {
            if (arg2.field2232.method340((byte) 83, class96.field1786)) {
                if (arg3.field2232.method340((byte) 120, class96.field1786)) {
                    return 0;
                } else if (arg1) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg3.field2232.method340((byte) 84, class96.field1786)) {
                return arg1 ? 1 : -1;
            } else {
                return arg2.field2232.method341((byte) -44, arg3.field2232);
            }
        } else if (arg4 != 4) {
            if (arg0 != -95) {
                field873 = null;
            }
            if (arg4 == 5) {
                if (arg2.method1467(true)) {
                    return arg3.method1467(true) ? 0 : 1;
                } else if (arg3.method1467(true)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg4 == 6) {
                if (arg2.method1471(11127)) {
                    return arg3.method1471(arg0 + 11222) ? 0 : 1;
                } else if (arg3.method1471(arg0 ^ 0xFFFFD4D6)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg4 != 7) {
                return arg2.field2240 - arg3.field2240;
            } else if (arg2.method1466(0)) {
                return arg3.method1466(0) ? 0 : 1;
            } else if (arg3.method1466(0)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2.method1469(arg0 + 99)) {
            return arg3.method1469(arg0 + 99) ? 0 : 1;
        } else if (arg3.method1469(4)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIZII)V")
    public static final void method368(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field871++;
        if (class175.method1259(arg0, (byte) 84)) {
            class66.method456(arg4, -31258, arg1, arg3, arg2, class215.field3809[arg0]);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)I")
    public static int method369(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)V")
    private final void method370(byte arg0) {
        this.field882 += ++this.field862;
        field866++;
        if (arg0 != 111) {
            method368(-68, 1, true, 110, 95);
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field861[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field864 ^= this.field864 << 13;
                } else {
                    this.field864 ^= this.field864 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field864 ^= this.field864 << 2;
            } else {
                this.field864 ^= this.field864 >>> 16;
            }
            this.field864 += this.field861[var2 + 128 & 0xFF];
            int var4;
            this.field861[var2] = var4 = this.field882 + this.field864 + this.field861[method369(255, var3 >> 2)];
            this.field880[var2] = this.field882 = var3 + this.field861[method369(var4 >> 8 >> 2, 255)];
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZI)V")
    public static final void method371(boolean arg0, int arg1) {
        field874++;
        if (class76.field1427 == 0) {
            class23.field340.method821(true, arg1);
        } else {
            class118.field2202 = arg1;
        }
        if (!arg0) {
            field870 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static final void method372(int arg0) {
        field875++;
        if (class115.field2171 == 0) {
            return;
        }
        try {
            if (++class210.field3759 > 1500) {
                if (class71.field1214 != null) {
                    class71.field1214.method852(5790);
                    class71.field1214 = null;
                }
                if (class61.field1024 >= 1) {
                    class40.field698 = -5;
                    class115.field2171 = 0;
                    return;
                }
                if (class95.field1775 == class263.field4582) {
                    class95.field1775 = class252.field4444;
                } else {
                    class95.field1775 = class263.field4582;
                }
                class61.field1024++;
                class115.field2171 = 1;
                class210.field3759 = 0;
            }
            if (class115.field2171 == 1) {
                class105.field1880 = class8.field130.method48(class95.field1775, class254.field4457, 0);
                class115.field2171 = 2;
            }
            int var1 = 0 % ((arg0 - 9) / 61);
            if (class115.field2171 == 2) {
                if (class105.field1880.field2925 == 2) {
                    throw new IOException();
                }
                if (class105.field1880.field2925 != 1) {
                    return;
                }
                class71.field1214 = new class109((Socket) class105.field1880.field2921, class8.field130);
                class105.field1880 = null;
                class71.field1214.method860(0, class58.field967.field1368, class58.field967.field1380, 111);
                if (class242.field4293 != null) {
                    class242.field4293.method1141((byte) 90);
                }
                if (class152.field2702 != null) {
                    class152.field2702.method1141((byte) 115);
                }
                int var2 = class71.field1214.method859(-105);
                if (class242.field4293 != null) {
                    class242.field4293.method1141((byte) 121);
                }
                if (class152.field2702 != null) {
                    class152.field2702.method1141((byte) 102);
                }
                if (var2 != 101) {
                    class40.field698 = var2;
                    class115.field2171 = 0;
                    class71.field1214.method852(5790);
                    class71.field1214 = null;
                    return;
                }
                class115.field2171 = 3;
            }
            if (class115.field2171 == 3 && class71.field1214.method850((byte) 121) >= 2) {
                int var3 = class71.field1214.method859(100) << 8 | class71.field1214.method859(-92);
                class107.method834(var3, -76);
                if (class97.field1808 == -1) {
                    class115.field2171 = 0;
                    class40.field698 = 6;
                    class71.field1214.method852(5790);
                    class71.field1214 = null;
                } else {
                    class115.field2171 = 0;
                    class71.field1214.method852(5790);
                    class71.field1214 = null;
                    class87.method681(false);
                }
            }
        } catch (IOException var4) {
            if (class71.field1214 != null) {
                class71.field1214.method852(5790);
                class71.field1214 = null;
            }
            if (class61.field1024 < 1) {
                class115.field2171 = 1;
                class210.field3759 = 0;
                if (class95.field1775 == class263.field4582) {
                    class95.field1775 = class252.field4444;
                } else {
                    class95.field1775 = class263.field4582;
                }
                class61.field1024++;
            } else {
                class115.field2171 = 0;
                class40.field698 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
    private final void method373(int arg0) {
        field879++;
        if (arg0 != -29681) {
            this.method375(-46);
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
            int var65 = var5 + var64;
            int var66 = var7 + var62;
            int var67 = var66 ^ var62 << 8;
            int var68 = var4 + var67;
            int var69 = var62 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var65 + var68;
            int var71 = var3 + var6;
            var5 = var70 ^ var68 << 10;
            int var72 = var68 + var71;
            var4 = var72 ^ var71 >>> 4;
            int var73 = var2 + var5;
            int var74 = var71 + var73;
            var3 = var74 ^ var73 << 8;
            int var75 = var4 + var61;
            int var76 = var73 + var75;
            var2 = var76 ^ var75 >>> 9;
            var8 = var3 + var64;
            var9 = var8 + var75;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field880[var11 + 2] + var7;
            int var38 = this.field880[var11 + 5] + var4;
            int var39 = this.field880[var11 + 3] + var6;
            int var40 = this.field880[var11 + 4] + var5;
            int var41 = this.field880[var11] + var9;
            int var42 = this.field880[var11 + 6] + var3;
            int var43 = this.field880[var11 + 7] + var2;
            int var44 = this.field880[var11 + 1] + var8;
            int var45 = var41 ^ var44 << 11;
            int var46 = var39 + var45;
            int var47 = var37 + var44;
            int var48 = var47 ^ var37 >>> 2;
            int var49 = var40 + var48;
            int var50 = var37 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var46 + var49;
            var6 = var52 ^ var49 >>> 16;
            int var53 = var6 + var42;
            int var54 = var38 + var51;
            int var55 = var49 + var54;
            var5 = var55 ^ var54 << 10;
            int var56 = var5 + var43;
            int var57 = var53 + var54;
            var4 = var57 ^ var53 >>> 4;
            int var58 = var53 + var56;
            var3 = var58 ^ var56 << 8;
            int var59 = var4 + var45;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var8 = var3 + var48;
            var9 = var8 + var59;
            this.field861[var11] = var9;
            this.field861[var11 + 1] = var8;
            this.field861[var11 + 2] = var7;
            this.field861[var11 + 3] = var6;
            this.field861[var11 + 4] = var5;
            this.field861[var11 + 5] = var4;
            this.field861[var11 + 6] = var3;
            this.field861[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field861[var12 + 5] + var4;
            int var14 = this.field861[var12 + 6] + var3;
            int var15 = this.field861[var12 + 3] + var6;
            int var16 = this.field861[var12 + 4] + var5;
            int var17 = this.field861[var12] + var9;
            int var18 = this.field861[var12 + 2] + var7;
            int var19 = this.field861[var12 + 1] + var8;
            int var20 = this.field861[var12 + 7] + var2;
            int var21 = var17 ^ var19 << 11;
            int var22 = var15 + var21;
            int var23 = var18 + var19;
            int var24 = var23 ^ var18 >>> 2;
            int var25 = var16 + var24;
            int var26 = var18 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var13 + var27;
            int var29 = var22 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var25 + var28;
            int var31 = var6 + var14;
            var5 = var30 ^ var28 << 10;
            int var32 = var5 + var20;
            int var33 = var28 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var4 + var21;
            int var35 = var31 + var32;
            var3 = var35 ^ var32 << 8;
            var8 = var3 + var24;
            int var36 = var32 + var34;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field861[var12] = var9;
            this.field861[var12 + 1] = var8;
            this.field861[var12 + 2] = var7;
            this.field861[var12 + 3] = var6;
            this.field861[var12 + 4] = var5;
            this.field861[var12 + 5] = var4;
            this.field861[var12 + 6] = var3;
            this.field861[var12 + 7] = var2;
        }
        this.method370((byte) 111);
        this.field877 = 256;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lpi;III)[Lc;")
    public static final class267[] method374(class181 arg0, int arg1, int arg2, int arg3) {
        field867++;
        if (class146.method1083(arg0, arg3, arg1, (byte) 28)) {
            if (arg2 != 856302050) {
                field873 = null;
            }
            return class185.method1342(-123);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)I")
    public final int method375(int arg0) {
        if ((this.field877--) == 0) {
            this.method370((byte) 111);
            this.field877 = 255;
        }
        field868++;
        int var2 = 116 / ((-arg0 - 21) / 32);
        return this.field880[this.field877];
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
    private class50() {
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "([I)V")
    public class50(int[] arg0) {
        this.field880 = new int[256];
        this.field861 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field880[var2] = arg0[var2];
        }
        this.method373(-29681);
    }
}
