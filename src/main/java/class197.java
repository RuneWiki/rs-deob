import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class197 {

    @OriginalMember(owner = "client!si", name = "e", descriptor = "[I")
    private int[] field3510;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "[I")
    private int[] field3508;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "Loc;")
    public static class151 field3511 = class137.method873(2, ":clan:");

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field3509 = 0;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "Loc;")
    public static class151 field3517 = class137.method873(2, "Unerwartete Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!si", name = "m", descriptor = "Loc;")
    private static class151 field3518 = class137.method873(2, "Starting game engine)3)3)3");

    @OriginalMember(owner = "client!si", name = "u", descriptor = "Loc;")
    public static class151 field3526 = class137.method873(2, "mapflag");

    @OriginalMember(owner = "client!si", name = "s", descriptor = "Loc;")
    public static class151 field3524 = class137.method873(2, "Keine Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!si", name = "g", descriptor = "Loc;")
    public static class151 field3512 = field3518;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    private int field3516;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "I")
    private int field3521;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "I")
    private int field3522;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!si", name = "t", descriptor = "I")
    private int field3525;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "[[[B")
    public static byte[][][] field3506;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
    private final void method1232(byte arg0) {
        field3507++;
        int var2 = -90 / ((arg0 + 47) / 61);
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
            int var64 = var63 ^ var8 >>> 2;
            int var65 = var6 + var64;
            int var66 = var7 + var62;
            int var67 = var8 + var66;
            int var68 = var67 ^ var66 << 8;
            int var69 = var5 + var68;
            int var70 = var65 + var66;
            var7 = var70 ^ var65 >>> 16;
            int var71 = var65 + var69;
            int var72 = var4 + var7;
            var6 = var71 ^ var69 << 10;
            int var73 = var3 + var6;
            int var74 = var69 + var72;
            var5 = var74 ^ var72 >>> 4;
            int var75 = var72 + var73;
            int var76 = var5 + var62;
            var4 = var75 ^ var73 << 8;
            int var77 = var73 + var76;
            var9 = var4 + var64;
            var3 = var77 ^ var76 >>> 9;
            var10 = var9 + var76;
            var8 = var3 + var68;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var38 = this.field3508[var12 + 4] + var6;
            int var39 = this.field3508[var12 + 5] + var5;
            int var40 = this.field3508[var12 + 7] + var3;
            int var41 = this.field3508[var12 + 3] + var7;
            int var42 = this.field3508[var12] + var10;
            int var43 = this.field3508[var12 + 2] + var8;
            int var44 = this.field3508[var12 + 6] + var4;
            int var45 = this.field3508[var12 + 1] + var9;
            int var46 = var42 ^ var45 << 11;
            int var47 = var43 + var45;
            int var48 = var41 + var46;
            int var49 = var47 ^ var43 >>> 2;
            int var50 = var38 + var49;
            int var51 = var43 + var48;
            int var52 = var51 ^ var48 << 8;
            int var53 = var39 + var52;
            int var54 = var48 + var50;
            var7 = var54 ^ var50 >>> 16;
            int var55 = var50 + var53;
            var6 = var55 ^ var53 << 10;
            int var56 = var7 + var44;
            int var57 = var53 + var56;
            var5 = var57 ^ var56 >>> 4;
            int var58 = var5 + var46;
            int var59 = var6 + var40;
            int var60 = var56 + var59;
            var4 = var60 ^ var59 << 8;
            var9 = var4 + var49;
            int var61 = var58 + var59;
            var3 = var61 ^ var58 >>> 9;
            var10 = var9 + var58;
            this.field3510[var12] = var10;
            this.field3510[var12 + 1] = var9;
            var8 = var3 + var52;
            this.field3510[var12 + 2] = var8;
            this.field3510[var12 + 3] = var7;
            this.field3510[var12 + 4] = var6;
            this.field3510[var12 + 5] = var5;
            this.field3510[var12 + 6] = var4;
            this.field3510[var12 + 7] = var3;
        }
        for (int var13 = 0; var13 < 256; var13 += 8) {
            int var14 = this.field3510[var13 + 7] + var3;
            int var15 = this.field3510[var13 + 2] + var8;
            int var16 = this.field3510[var13 + 5] + var5;
            int var17 = this.field3510[var13 + 1] + var9;
            int var18 = this.field3510[var13 + 3] + var7;
            int var19 = this.field3510[var13 + 4] + var6;
            int var20 = this.field3510[var13] + var10;
            int var21 = this.field3510[var13 + 6] + var4;
            int var22 = var20 ^ var17 << 11;
            int var23 = var18 + var22;
            int var24 = var15 + var17;
            int var25 = var24 ^ var15 >>> 2;
            int var26 = var19 + var25;
            int var27 = var15 + var23;
            int var28 = var27 ^ var23 << 8;
            int var29 = var16 + var28;
            int var30 = var23 + var26;
            var7 = var30 ^ var26 >>> 16;
            int var31 = var26 + var29;
            int var32 = var7 + var21;
            var6 = var31 ^ var29 << 10;
            int var33 = var29 + var32;
            var5 = var33 ^ var32 >>> 4;
            int var34 = var5 + var22;
            int var35 = var6 + var14;
            int var36 = var32 + var35;
            var4 = var36 ^ var35 << 8;
            int var37 = var34 + var35;
            var9 = var4 + var25;
            var3 = var37 ^ var34 >>> 9;
            var10 = var9 + var34;
            var8 = var3 + var28;
            this.field3510[var13] = var10;
            this.field3510[var13 + 1] = var9;
            this.field3510[var13 + 2] = var8;
            this.field3510[var13 + 3] = var7;
            this.field3510[var13 + 4] = var6;
            this.field3510[var13 + 5] = var5;
            this.field3510[var13 + 6] = var4;
            this.field3510[var13 + 7] = var3;
        }
        this.method1237(255);
        this.field3525 = 256;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)Lkg;")
    public static final class115 method1233(int arg0, int arg1) {
        field3515++;
        int var2 = 120 % ((-arg0 - 35) / 62);
        class115 var3 = (class115) class27.field564.method1318((byte) -105, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class217.field3781.method1208(class237.method1543(arg1, false), (byte) 126, class53.method366(arg1, false));
        class115 var5 = new class115();
        if (var4 != null) {
            var5.method700((byte) -96, new class229(var4));
        }
        var5.method687((byte) -123);
        class27.field564.method1324(var5, 18373, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(II)Z")
    public static final boolean method1234(int arg0, int arg1) {
        field3520++;
        if (arg1 < 81) {
            method1233(54, 126);
        }
        if (class116.field2089[arg0]) {
            return true;
        } else if (class67.field1281.method1186(arg0, (byte) 31)) {
            int var2 = class67.field1281.method1210(true, arg0);
            if (var2 == 0) {
                class116.field2089[arg0] = true;
                return true;
            }
            if (class115.field2067[arg0] == null) {
                class115.field2067[arg0] = new class232[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class115.field2067[arg0][var3] == null) {
                    byte[] var4 = class67.field1281.method1208(var3, (byte) 86, arg0);
                    if (var4 != null) {
                        class115.field2067[arg0][var3] = new class232();
                        class115.field2067[arg0][var3].field4261 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            class115.field2067[arg0][var3].method1520(new class229(var4), 1);
                        } else {
                            class115.field2067[arg0][var3].method1515(true, new class229(var4));
                        }
                    }
                }
            }
            class116.field2089[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III)Lwd;")
    public static final class232 method1235(int arg0, int arg1, int arg2) {
        class232 var3 = class175.method1115(-22192, arg1);
        int var4 = -71 / ((arg0 - 29) / 42);
        field3514++;
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field4239 == null || arg2 >= var3.field4239.length) {
            return null;
        } else {
            return var3.field4239[arg2];
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)I")
    public final int method1236(boolean arg0) {
        if (this.field3525-- == 0) {
            this.method1237(255);
            this.field3525 = 255;
        }
        field3519++;
        if (!arg0) {
            field3506 = null;
        }
        return this.field3508[this.field3525];
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    private final void method1237(int arg0) {
        field3513++;
        this.field3516 += ++this.field3522;
        if (arg0 != 255) {
            this.field3525 = -18;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field3510[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field3521 ^= this.field3521 << 13;
                } else {
                    this.field3521 ^= this.field3521 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field3521 ^= this.field3521 << 2;
            } else {
                this.field3521 ^= this.field3521 >>> 16;
            }
            this.field3521 += this.field3510[var2 + 128 & 0xFF];
            int var4;
            this.field3510[var2] = var4 = this.field3521 + this.field3510[class26.method206(1020, var3) >> 2] + this.field3516;
            this.field3508[var2] = this.field3516 = var3 + this.field3510[class26.method206(var4 >> 8 >> 2, 255)];
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)I")
    public static final int method1238(int arg0) {
        if (arg0 != 27557) {
            field3512 = null;
        }
        field3523++;
        return class107.field1895;
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(I)V")
    public static void method1239(int arg0) {
        field3511 = null;
        field3526 = null;
        int var1 = 47 % ((-arg0 - 51) / 53);
        field3518 = null;
        field3524 = null;
        field3512 = null;
        field3506 = null;
        field3517 = null;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
    private class197() {
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "([I)V")
    public class197(int[] arg0) {
        this.field3510 = new int[256];
        this.field3508 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3508[var2] = arg0[var2];
        }
        this.method1232((byte) -108);
    }
}
