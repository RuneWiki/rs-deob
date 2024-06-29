import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class302 {

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "[I")
    private int[] field5102;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "[I")
    private int[] field5100;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "[I")
    public static int[] field5104 = new int[128];

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "Lbe;")
    public static class283 field5107 = class153.method941(-28, "headicons_pk");

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "Lbe;")
    public static class283 field5103 = class153.method941(-24, "Nehmen");

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "I")
    public static int field5112 = 0;

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
    public static int field5115 = 0;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    private int field5097;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    private int field5099;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    private int field5101;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    private int field5108;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "[I")
    public static int[] field5113;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "[Lhd;")
    public static class113[] field5096;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 11)
    private final void method2041(int arg0) {
        field5098++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        if (arg0 > -4) {
            this.method2041(41);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            int var11 = var9 ^ var8 << 11;
            int var12 = var6 + var11;
            int var13 = var7 + var8;
            int var14 = var13 ^ var7 >>> 2;
            int var15 = var5 + var14;
            int var16 = var7 + var12;
            int var17 = var16 ^ var12 << 8;
            int var18 = var4 + var17;
            int var19 = var12 + var15;
            var6 = var19 ^ var15 >>> 16;
            int var20 = var3 + var6;
            int var21 = var15 + var18;
            var5 = var21 ^ var18 << 10;
            int var22 = var18 + var20;
            int var23 = var2 + var5;
            var4 = var22 ^ var20 >>> 4;
            int var24 = var20 + var23;
            int var25 = var4 + var11;
            var3 = var24 ^ var23 << 8;
            int var26 = var23 + var25;
            var8 = var3 + var14;
            var2 = var26 ^ var25 >>> 9;
            var9 = var8 + var25;
            var7 = var2 + var17;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field5102[var27 + 4] + var5;
            int var29 = this.field5102[var27 + 5] + var4;
            int var30 = this.field5102[var27] + var9;
            int var31 = this.field5102[var27 + 1] + var8;
            int var32 = this.field5102[var27 + 3] + var6;
            int var33 = this.field5102[var27 + 2] + var7;
            int var34 = this.field5102[var27 + 7] + var2;
            int var35 = var30 ^ var31 << 11;
            int var36 = this.field5102[var27 + 6] + var3;
            int var37 = var32 + var35;
            int var38 = var31 + var33;
            int var39 = var38 ^ var33 >>> 2;
            int var40 = var28 + var39;
            int var41 = var33 + var37;
            int var42 = var41 ^ var37 << 8;
            int var43 = var29 + var42;
            int var44 = var37 + var40;
            var6 = var44 ^ var40 >>> 16;
            int var45 = var40 + var43;
            var5 = var45 ^ var43 << 10;
            int var46 = var5 + var34;
            int var47 = var6 + var36;
            int var48 = var43 + var47;
            var4 = var48 ^ var47 >>> 4;
            int var49 = var4 + var35;
            int var50 = var46 + var47;
            var3 = var50 ^ var46 << 8;
            var8 = var3 + var39;
            int var51 = var46 + var49;
            var2 = var51 ^ var49 >>> 9;
            var7 = var2 + var42;
            var9 = var8 + var49;
            this.field5100[var27] = var9;
            this.field5100[var27 + 1] = var8;
            this.field5100[var27 + 2] = var7;
            this.field5100[var27 + 3] = var6;
            this.field5100[var27 + 4] = var5;
            this.field5100[var27 + 5] = var4;
            this.field5100[var27 + 6] = var3;
            this.field5100[var27 + 7] = var2;
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field5100[var52 + 5] + var4;
            int var54 = this.field5100[var52 + 3] + var6;
            int var55 = this.field5100[var52 + 1] + var8;
            int var56 = this.field5100[var52 + 2] + var7;
            int var57 = this.field5100[var52 + 6] + var3;
            int var58 = this.field5100[var52 + 4] + var5;
            int var59 = this.field5100[var52 + 7] + var2;
            int var60 = this.field5100[var52] + var9;
            int var61 = var60 ^ var55 << 11;
            int var62 = var55 + var56;
            int var63 = var54 + var61;
            int var64 = var62 ^ var56 >>> 2;
            int var65 = var58 + var64;
            int var66 = var56 + var63;
            int var67 = var66 ^ var63 << 8;
            int var68 = var63 + var65;
            int var69 = var53 + var67;
            var6 = var68 ^ var65 >>> 16;
            int var70 = var6 + var57;
            int var71 = var65 + var69;
            var5 = var71 ^ var69 << 10;
            int var72 = var5 + var59;
            int var73 = var69 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var72;
            var3 = var75 ^ var72 << 8;
            int var76 = var72 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            this.field5100[var52] = var9;
            var7 = var2 + var67;
            this.field5100[var52 + 1] = var8;
            this.field5100[var52 + 2] = var7;
            this.field5100[var52 + 3] = var6;
            this.field5100[var52 + 4] = var5;
            this.field5100[var52 + 5] = var4;
            this.field5100[var52 + 6] = var3;
            this.field5100[var52 + 7] = var2;
        }
        this.method2045(255);
        this.field5099 = 256;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V", line = 158)
    public static void method2042(int arg0) {
        field5096 = null;
        field5107 = null;
        field5103 = null;
        if (arg0 != -32388) {
            field5115 = 122;
        }
        field5104 = null;
        field5113 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)I", line = 173)
    public final int method2043(byte arg0) {
        if (this.field5099-- == 0) {
            this.method2045(255);
            this.field5099 = 255;
        }
        if (arg0 > -39) {
            return 60;
        } else {
            field5111++;
            return this.field5102[this.field5099];
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIILgf;JZ)V", line = 191)
    public static final void method2044(int arg0, int arg1, int arg2, int arg3, class7 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class110 var8 = new class110();
        var8.field1855 = arg4;
        var8.field1863 = arg1 * 128 + 64;
        var8.field1858 = arg2 * 128 + 64;
        var8.field1862 = arg3;
        var8.field1859 = arg5;
        var8.field1869 = arg6;
        if (class86.field1459[arg0][arg1][arg2] == null) {
            class86.field1459[arg0][arg1][arg2] = new class160(arg0, arg1, arg2);
        }
        class86.field1459[arg0][arg1][arg2].field2617 = var8;
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V", line = 220)
    private final void method2045(int arg0) {
        this.field5101 += ++this.field5108;
        field5114++;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field5100[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field5097 ^= this.field5097 << 13;
                } else {
                    this.field5097 ^= this.field5097 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field5097 ^= this.field5097 << 2;
            } else {
                this.field5097 ^= this.field5097 >>> 16;
            }
            this.field5097 += this.field5100[var2 + 128 & 0xFF];
            int var4;
            this.field5100[var2] = var4 = this.field5097 + (this.field5100[class178.method1174(var3 >> 2, 255)] + this.field5101);
            this.field5102[var2] = this.field5101 = var3 + this.field5100[class178.method1174(1020, var4 >> 8) >> 2];
        }
        if (arg0 != 255) {
            this.method2045(4);
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)V", line = 263)
    public static final void method2046(byte arg0) {
        class114.field1913.method1636(112);
        if (arg0 != -15) {
            field5113 = (int[]) null;
        }
        class303.field5120.method1636(121);
        class134.field2251.method1636(arg0 + 129);
        field5109++;
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)V", line = 276)
    public static final void method2047(int arg0) {
        field5105++;
        int var1 = 32 / ((arg0 - 67) / 39);
        class215.field3644.method1636(123);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILbe;I)V", line = 287)
    public static final void method2048(int arg0, class283 arg1, int arg2) {
        class227.field3825++;
        class228.field3831.method621(99, arg2 - 27744);
        class228.field3831.method1552(arg2 - 53810, arg0);
        field5106++;
        class228.field3831.method1544((byte) 8, arg1.method1929((byte) -24));
        if (arg2 != 27752) {
            field5115 = -107;
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V", line = 322)
    private class302() {
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "([I)V", line = 329)
    public class302(int[] arg0) {
        this.field5102 = new int[256];
        this.field5100 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field5102[var2] = arg0[var2];
        }
        this.method2041(-25);
    }
}
