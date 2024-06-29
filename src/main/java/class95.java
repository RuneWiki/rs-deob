import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class95 {

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "[I")
    private int[] field1306;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "[I")
    private int[] field1300;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "[I")
    public static int[] field1303 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "[I")
    public static int[] field1312 = new int[4096];

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    private int field1299;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    private int field1302;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    private int field1305;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    private int field1310;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "[Lfe;")
    public static class270[] field1314;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)I", line = 5)
    public final int method619(int arg0) {
        if (arg0 == this.field1302--) {
            this.method623((byte) -117);
            this.field1302 = 255;
        }
        field1309++;
        return this.field1306[this.field1302];
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIBIIII)V", line = 25)
    public static final void method620(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 >= 0 && arg6 >= 0 && arg5 < 103 && arg6 < 103) {
            if (arg2 == 0) {
                class123 var8 = class312.method2204(arg0, arg5, arg6);
                if (var8 != null) {
                    int var9 = (int) (var8.field1702 >>> 32) & Integer.MAX_VALUE;
                    if (arg1 == 2) {
                        var8.field1697 = new class75(var9, 2, arg4 + 4, arg0, arg5, arg6, arg7, false, var8.field1697);
                        var8.field1705 = new class75(var9, 2, arg4 + 1 & 0x3, arg0, arg5, arg6, arg7, false, var8.field1705);
                    } else {
                        var8.field1697 = new class75(var9, arg1, arg4, arg0, arg5, arg6, arg7, false, var8.field1697);
                    }
                }
            }
            if (arg2 == 1) {
                class54 var10 = class250.method1775(arg0, arg5, arg6);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field627 >>> 32);
                    if (arg1 == 4 || arg1 == 5) {
                        var10.field630 = new class75(var11, 4, arg4, arg0, arg5, arg6, arg7, false, var10.field630);
                    } else if (arg1 == 6) {
                        var10.field630 = new class75(var11, 4, arg4 + 4, arg0, arg5, arg6, arg7, false, var10.field630);
                    } else if (arg1 == 7) {
                        var10.field630 = new class75(var11, 4, (arg4 + 2 & 0x3) + 4, arg0, arg5, arg6, arg7, false, var10.field630);
                    } else if (arg1 == 8) {
                        var10.field630 = new class75(var11, 4, arg4 + 4, arg0, arg5, arg6, arg7, false, var10.field630);
                        var10.field632 = new class75(var11, 4, (arg4 + 2 & 0x3) + 4, arg0, arg5, arg6, arg7, false, var10.field632);
                    }
                }
            }
            if (arg2 == 2) {
                if (arg1 == 11) {
                    arg1 = 10;
                }
                class44 var12 = class285.method2053(arg0, arg5, arg6);
                if (var12 != null) {
                    var12.field494 = new class75(Integer.MAX_VALUE & (int) (var12.field502 >>> 32), arg1, arg4, arg0, arg5, arg6, arg7, false, var12.field494);
                }
            }
            if (arg2 == 3) {
                class360 var13 = class356.method2454(arg0, arg5, arg6);
                if (var13 != null) {
                    var13.field5697 = new class75((int) (var13.field5699 >>> 32) & Integer.MAX_VALUE, 22, arg4, arg0, arg5, arg6, arg7, false, var13.field5697);
                }
            }
        }
        field1301++;
        if (arg3 > -11) {
            field1312 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V", line = 115)
    public static void method621(int arg0) {
        field1314 = null;
        if (arg0 != 10924) {
            field1313 = 73;
        }
        field1312 = null;
        field1303 = null;
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)V", line = 130)
    private final void method622(int arg0) {
        if (arg0 != -1) {
            this.method623((byte) 44);
        }
        field1308++;
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
            int var12 = var6 + var11;
            int var13 = var7 + var8;
            int var14 = var13 ^ var7 >>> 2;
            int var15 = var5 + var14;
            int var16 = var7 + var12;
            int var17 = var16 ^ var12 << 8;
            int var18 = var12 + var15;
            int var19 = var4 + var17;
            var6 = var18 ^ var15 >>> 16;
            int var20 = var3 + var6;
            int var21 = var15 + var19;
            var5 = var21 ^ var19 << 10;
            int var22 = var19 + var20;
            int var23 = var2 + var5;
            var4 = var22 ^ var20 >>> 4;
            int var24 = var20 + var23;
            var3 = var24 ^ var23 << 8;
            int var25 = var4 + var11;
            int var26 = var23 + var25;
            var2 = var26 ^ var25 >>> 9;
            var8 = var3 + var14;
            var7 = var2 + var17;
            var9 = var8 + var25;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field1306[var27 + 3] + var6;
            int var29 = this.field1306[var27 + 1] + var8;
            int var30 = this.field1306[var27 + 5] + var4;
            int var31 = this.field1306[var27 + 6] + var3;
            int var32 = this.field1306[var27 + 4] + var5;
            int var33 = this.field1306[var27 + 7] + var2;
            int var34 = this.field1306[var27] + var9;
            int var35 = this.field1306[var27 + 2] + var7;
            int var36 = var34 ^ var29 << 11;
            int var37 = var29 + var35;
            int var38 = var37 ^ var35 >>> 2;
            int var39 = var32 + var38;
            int var40 = var28 + var36;
            int var41 = var35 + var40;
            int var42 = var41 ^ var40 << 8;
            int var43 = var39 + var40;
            int var44 = var30 + var42;
            var6 = var43 ^ var39 >>> 16;
            int var45 = var6 + var31;
            int var46 = var39 + var44;
            var5 = var46 ^ var44 << 10;
            int var47 = var44 + var45;
            var4 = var47 ^ var45 >>> 4;
            int var48 = var4 + var36;
            int var49 = var5 + var33;
            int var50 = var45 + var49;
            var3 = var50 ^ var49 << 8;
            var8 = var3 + var38;
            int var51 = var48 + var49;
            var2 = var51 ^ var48 >>> 9;
            var7 = var2 + var42;
            var9 = var8 + var48;
            this.field1300[var27] = var9;
            this.field1300[var27 + 1] = var8;
            this.field1300[var27 + 2] = var7;
            this.field1300[var27 + 3] = var6;
            this.field1300[var27 + 4] = var5;
            this.field1300[var27 + 5] = var4;
            this.field1300[var27 + 6] = var3;
            this.field1300[var27 + 7] = var2;
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field1300[var52 + 3] + var6;
            int var54 = this.field1300[var52 + 1] + var8;
            int var55 = this.field1300[var52 + 5] + var4;
            int var56 = this.field1300[var52 + 4] + var5;
            int var57 = this.field1300[var52 + 2] + var7;
            int var58 = this.field1300[var52 + 7] + var2;
            int var59 = this.field1300[var52] + var9;
            int var60 = this.field1300[var52 + 6] + var3;
            int var61 = var59 ^ var54 << 11;
            int var62 = var53 + var61;
            int var63 = var54 + var57;
            int var64 = var63 ^ var57 >>> 2;
            int var65 = var56 + var64;
            int var66 = var57 + var62;
            int var67 = var66 ^ var62 << 8;
            int var68 = var62 + var65;
            var6 = var68 ^ var65 >>> 16;
            int var69 = var6 + var60;
            int var70 = var55 + var67;
            int var71 = var65 + var70;
            var5 = var71 ^ var70 << 10;
            int var72 = var5 + var58;
            int var73 = var69 + var70;
            var4 = var73 ^ var69 >>> 4;
            int var74 = var4 + var61;
            int var75 = var69 + var72;
            var3 = var75 ^ var72 << 8;
            var8 = var3 + var64;
            int var76 = var72 + var74;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
            this.field1300[var52] = var9;
            this.field1300[var52 + 1] = var8;
            this.field1300[var52 + 2] = var7;
            this.field1300[var52 + 3] = var6;
            this.field1300[var52 + 4] = var5;
            this.field1300[var52 + 5] = var4;
            this.field1300[var52 + 6] = var3;
            this.field1300[var52 + 7] = var2;
        }
        this.method623((byte) -125);
        this.field1302 = 256;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field1312[var0] = class244.method1730(255, var0);
        }
        field1313 = 0;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V", line = 290)
    private final void method623(byte arg0) {
        if (arg0 > -114) {
            method620(15, -21, -22, (byte) 99, -86, -22, -90, -55);
        }
        field1311++;
        this.field1310 += ++this.field1305;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1300[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1299 ^= this.field1299 << 13;
                } else {
                    this.field1299 ^= this.field1299 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1299 ^= this.field1299 << 2;
            } else {
                this.field1299 ^= this.field1299 >>> 16;
            }
            this.field1299 += this.field1300[var2 + 128 & 0xFF];
            int var4;
            this.field1300[var2] = var4 = this.field1300[class261.method1840(var3 >> 2, 255)] + this.field1299 + this.field1310;
            this.field1306[var2] = this.field1310 = this.field1300[class261.method1840(261132, var4) >> 8 >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V", line = 329)
    private class95() {
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "([I)V", line = 331)
    public class95(int[] arg0) {
        this.field1306 = new int[256];
        this.field1300 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1306[var2] = arg0[var2];
        }
        this.method622(-1);
    }
}
