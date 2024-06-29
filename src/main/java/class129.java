import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class129 {

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "[I")
    private int[] field1899;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "[I")
    private int[] field1903;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
    public static int field1900 = 0;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "Luc;")
    public static class27 field1904 = new class27("", 15);

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "I")
    public static int field1906 = 1403;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    private int field1897;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
    private int field1902;

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
    private int field1905;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "I")
    private int field1908;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V")
    private final void method960(int arg0) {
        if (arg0 != 1) {
            method963(53, -61, null);
        }
        field1898++;
        this.field1908 += ++this.field1902;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1903[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1897 ^= this.field1897 << 13;
                } else {
                    this.field1897 ^= this.field1897 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1897 ^= this.field1897 << 2;
            } else {
                this.field1897 ^= this.field1897 >>> 16;
            }
            this.field1897 += this.field1903[var2 + 128 & 0xFF];
            int var4;
            this.field1903[var2] = var4 = this.field1908 + this.field1903[class689.method3797(255, var3 >> 2)] + this.field1897;
            this.field1899[var2] = this.field1908 = var3 + this.field1903[class689.method3797(255, var4 >> 8 >> 2)];
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V")
    private final void method961(int arg0) {
        field1911++;
        if (arg0 != -8341) {
            this.method965((byte) -91);
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
            int var65 = var5 + var64;
            int var66 = var7 + var63;
            int var67 = var66 ^ var63 << 8;
            int var68 = var4 + var67;
            int var69 = var63 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var3 + var6;
            int var71 = var65 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var68 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var70 + var73;
            int var75 = var4 + var61;
            var3 = var74 ^ var73 << 8;
            int var76 = var73 + var75;
            var8 = var3 + var64;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1899[var11 + 6] + var3;
            int var38 = this.field1899[var11] + var9;
            int var39 = this.field1899[var11 + 4] + var5;
            int var40 = this.field1899[var11 + 5] + var4;
            int var41 = this.field1899[var11 + 2] + var7;
            int var42 = this.field1899[var11 + 3] + var6;
            int var43 = this.field1899[var11 + 7] + var2;
            int var44 = this.field1899[var11 + 1] + var8;
            int var45 = var38 ^ var44 << 11;
            int var46 = var41 + var44;
            int var47 = var42 + var45;
            int var48 = var46 ^ var41 >>> 2;
            int var49 = var39 + var48;
            int var50 = var41 + var47;
            int var51 = var50 ^ var47 << 8;
            int var52 = var47 + var49;
            int var53 = var40 + var51;
            var6 = var52 ^ var49 >>> 16;
            int var54 = var49 + var53;
            int var55 = var6 + var37;
            var5 = var54 ^ var53 << 10;
            int var56 = var53 + var55;
            int var57 = var5 + var43;
            var4 = var56 ^ var55 >>> 4;
            int var58 = var4 + var45;
            int var59 = var55 + var57;
            var3 = var59 ^ var57 << 8;
            var8 = var3 + var48;
            int var60 = var57 + var58;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            var7 = var2 + var51;
            this.field1903[var11] = var9;
            this.field1903[var11 + 1] = var8;
            this.field1903[var11 + 2] = var7;
            this.field1903[var11 + 3] = var6;
            this.field1903[var11 + 4] = var5;
            this.field1903[var11 + 5] = var4;
            this.field1903[var11 + 6] = var3;
            this.field1903[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1903[var12 + 7] + var2;
            int var14 = this.field1903[var12 + 1] + var8;
            int var15 = this.field1903[var12 + 5] + var4;
            int var16 = this.field1903[var12 + 6] + var3;
            int var17 = this.field1903[var12 + 3] + var6;
            int var18 = this.field1903[var12 + 4] + var5;
            int var19 = this.field1903[var12] + var9;
            int var20 = this.field1903[var12 + 2] + var7;
            int var21 = var19 ^ var14 << 11;
            int var22 = var17 + var21;
            int var23 = var14 + var20;
            int var24 = var23 ^ var20 >>> 2;
            int var25 = var20 + var22;
            int var26 = var18 + var24;
            int var27 = var25 ^ var22 << 8;
            int var28 = var22 + var26;
            int var29 = var15 + var27;
            var6 = var28 ^ var26 >>> 16;
            int var30 = var6 + var16;
            int var31 = var26 + var29;
            var5 = var31 ^ var29 << 10;
            int var32 = var29 + var30;
            int var33 = var5 + var13;
            var4 = var32 ^ var30 >>> 4;
            int var34 = var4 + var21;
            int var35 = var30 + var33;
            var3 = var35 ^ var33 << 8;
            var8 = var3 + var24;
            int var36 = var33 + var34;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            var7 = var2 + var27;
            this.field1903[var12] = var9;
            this.field1903[var12 + 1] = var8;
            this.field1903[var12 + 2] = var7;
            this.field1903[var12 + 3] = var6;
            this.field1903[var12 + 4] = var5;
            this.field1903[var12 + 5] = var4;
            this.field1903[var12 + 6] = var3;
            this.field1903[var12 + 7] = var2;
        }
        this.method960(1);
        this.field1905 = 256;
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)V")
    public static void method962(int arg0) {
        field1904 = null;
        if (arg0 != 3) {
            method962(58);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(II[Lvg;)V")
    public static final void method963(int arg0, int arg1, class49[] arg2) {
        field1912++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class49 var4 = arg2[var3];
            if (var4 != null && var4.field885 == arg0 && !client.method1763(var4)) {
                if (var4.field980 == 0) {
                    method963(var4.field977, -937900918, arg2);
                    if (var4.field1014 != null) {
                        method963(var4.field977, -937900918, var4.field1014);
                    }
                    class320 var5 = (class320) class654.field9178.method1405((long) var4.field977, (byte) -128);
                    if (var5 != null) {
                        class493.method2859(var5.field4703, 100);
                    }
                }
                if (var4.field980 == 6 && var4.field895 != -1) {
                    class30 var6 = class188.field2708.method2140(var4.field895, 127);
                    if (var6 != null) {
                        var4.field870 += class312.field4621;
                        int var7 = var4.field886;
                        while (var6.field450[var4.field886] < var4.field870) {
                            var4.field870 -= var6.field450[var4.field886];
                            var4.field886++;
                            if (var4.field886 >= var6.field456.length) {
                                var4.field886 -= var6.field466;
                                if (var4.field886 < 0 || var6.field456.length <= var4.field886) {
                                    var4.field886 = 0;
                                }
                            }
                            var4.field942 = var4.field886 + 1;
                            if (var4.field942 >= var6.field456.length) {
                                var4.field942 -= var6.field466;
                                if (var4.field942 < 0 || var4.field942 >= var6.field456.length) {
                                    var4.field942 = -1;
                                }
                            }
                            class563.method3215(true, var4);
                        }
                        if (var4.field886 != var7) {
                            class207.method1372(var6, 5121, var4.field886);
                        }
                    }
                }
            }
        }
        if (arg1 != -937900918) {
            method966(-15, (byte) 127, -29, -115, 16);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)I")
    public final int method964(byte arg0) {
        if (arg0 <= 21) {
            return -75;
        }
        if (this.field1905 == 0) {
            this.method960(1);
            this.field1905 = 256;
        }
        field1909++;
        return this.field1899[--this.field1905];
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V")
    private class129() {
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "([I)V")
    public class129(int[] arg0) {
        this.field1899 = new int[256];
        this.field1903 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1899[var2] = arg0[var2];
        }
        this.method961(-8341);
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(B)I")
    public final int method965(byte arg0) {
        field1907++;
        if (this.field1905 == 0) {
            this.method960(1);
            this.field1905 = 256;
        }
        if (arg0 <= 58) {
            this.field1897 = 6;
        }
        return this.field1899[this.field1905 - 1];
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IBIII)V")
    public static final void method966(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (class520.field7329 <= arg4 && class239.field3747 >= arg4) {
            int var5 = class537.method3051(-10168, arg2, class248.field3859, class15.field153);
            int var6 = class537.method3051(-10168, arg0, class248.field3859, class15.field153);
            class55.method598(var5, arg3, 17862, arg4, var6);
        }
        field1901++;
        if (arg1 < 91) {
            field1913 = -45;
        }
    }
}
