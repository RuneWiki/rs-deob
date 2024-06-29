import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class355 {

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "[I")
    private int[] field5634;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "[I")
    private int[] field5630;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "Ljava/lang/String;")
    public static String field5637 = "scroll:";

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public static int field5640 = 100;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    private int field5632;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    private int field5633;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    private int field5635;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public static int field5638;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    private int field5642;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    public static int field5643;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "Lth;")
    public static class57 field5641;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)I", line = 7)
    public final int method2509(int arg0) {
        field5636++;
        if (arg0 > -65) {
            field5641 = (class57) null;
        }
        if (this.field5633-- == 0) {
            this.method2511((byte) 65);
            this.field5633 = 255;
        }
        return this.field5634[this.field5633];
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILqm;)Lv;", line = 27)
    public static final class77 method2510(int arg0, class227 arg1) {
        if (arg0 == 8) {
            field5643++;
            return new class77(arg1.method1769(arg0 ^ 0xFFFF87F2), arg1.method1769(-30726), arg1.method1769(-30726), arg1.method1769(arg0 ^ 0xFFFF87F2), arg1.method1769(-30726), arg1.method1769(arg0 ^ 0xFFFF87F2), arg1.method1769(-30726), arg1.method1769(arg0 - 30734), arg1.method1736(255), arg1.method1720((byte) -57));
        } else {
            return (class77) null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V", line = 39)
    private final void method2511(byte arg0) {
        if (arg0 != 65) {
            return;
        }
        field5629++;
        this.field5642 += ++this.field5632;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field5630[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field5635 ^= this.field5635 << 13;
                } else {
                    this.field5635 ^= this.field5635 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field5635 ^= this.field5635 << 2;
            } else {
                this.field5635 ^= this.field5635 >>> 16;
            }
            this.field5635 += this.field5630[var2 + 128 & 0xFF];
            int var4;
            this.field5630[var2] = var4 = this.field5635 + this.field5630[class343.method2418(255, var3 >> 2)] + this.field5642;
            this.field5634[var2] = this.field5642 = this.field5630[class343.method2418(var4 >> 8 >> 2, 255)] + var3;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIII)V", line = 81)
    public static final void method2512(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < 28) {
            return;
        }
        if (class74.field1269 <= arg0 - arg3 && (arg0 + arg3) <= field5640 && arg4 - arg3 >= class296.field4758 && (arg3 + arg4) <= class273.field4522) {
            class22.method130(arg3, arg4, (byte) -84, arg2, arg0);
        } else {
            class298.method2134(arg2, 50, arg3, arg0, arg4);
        }
        field5638++;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V", line = 107)
    public static void method2513(int arg0) {
        field5637 = null;
        if (arg0 != -17756) {
            method2512(14, -36, -70, 10, 120);
        }
        field5641 = null;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V", line = 118)
    private class355() {
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V", line = 130)
    private final void method2514(byte arg0) {
        field5639++;
        int var2 = -126 / ((arg0 + 47) / 51);
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        int var10 = -1640531527;
        for (int var11 = 0; var11 < 4; var11++) {
            int var12 = var10 ^ var9 << 11;
            int var13 = var7 + var12;
            int var14 = var8 + var9;
            int var15 = var14 ^ var8 >>> 2;
            int var16 = var8 + var13;
            int var17 = var16 ^ var13 << 8;
            int var18 = var5 + var17;
            int var19 = var6 + var15;
            int var20 = var13 + var19;
            var7 = var20 ^ var19 >>> 16;
            int var21 = var18 + var19;
            int var22 = var4 + var7;
            var6 = var21 ^ var18 << 10;
            int var23 = var3 + var6;
            int var24 = var18 + var22;
            var5 = var24 ^ var22 >>> 4;
            int var25 = var22 + var23;
            int var26 = var5 + var12;
            var4 = var25 ^ var23 << 8;
            var9 = var4 + var15;
            int var27 = var23 + var26;
            var3 = var27 ^ var26 >>> 9;
            var8 = var3 + var17;
            var10 = var9 + var26;
        }
        for (int var28 = 0; var28 < 256; var28 += 8) {
            int var29 = this.field5634[var28 + 5] + var5;
            int var30 = this.field5634[var28 + 2] + var8;
            int var31 = this.field5634[var28 + 3] + var7;
            int var32 = this.field5634[var28] + var10;
            int var33 = this.field5634[var28 + 1] + var9;
            int var34 = var32 ^ var33 << 11;
            int var35 = var30 + var33;
            int var36 = this.field5634[var28 + 4] + var6;
            int var37 = this.field5634[var28 + 7] + var3;
            int var38 = var31 + var34;
            int var39 = this.field5634[var28 + 6] + var4;
            int var40 = var35 ^ var30 >>> 2;
            int var41 = var36 + var40;
            int var42 = var30 + var38;
            int var43 = var42 ^ var38 << 8;
            int var44 = var38 + var41;
            var7 = var44 ^ var41 >>> 16;
            int var45 = var29 + var43;
            int var46 = var7 + var39;
            int var47 = var41 + var45;
            var6 = var47 ^ var45 << 10;
            int var48 = var45 + var46;
            int var49 = var6 + var37;
            var5 = var48 ^ var46 >>> 4;
            int var50 = var46 + var49;
            var4 = var50 ^ var49 << 8;
            var9 = var4 + var40;
            int var51 = var5 + var34;
            int var52 = var49 + var51;
            var3 = var52 ^ var51 >>> 9;
            var10 = var9 + var51;
            this.field5630[var28] = var10;
            this.field5630[var28 + 1] = var9;
            var8 = var3 + var43;
            this.field5630[var28 + 2] = var8;
            this.field5630[var28 + 3] = var7;
            this.field5630[var28 + 4] = var6;
            this.field5630[var28 + 5] = var5;
            this.field5630[var28 + 6] = var4;
            this.field5630[var28 + 7] = var3;
        }
        for (int var53 = 0; var53 < 256; var53 += 8) {
            int var54 = this.field5630[var53 + 7] + var3;
            int var55 = this.field5630[var53 + 2] + var8;
            int var56 = this.field5630[var53 + 3] + var7;
            int var57 = this.field5630[var53 + 6] + var4;
            int var58 = this.field5630[var53 + 4] + var6;
            int var59 = this.field5630[var53 + 1] + var9;
            int var60 = this.field5630[var53 + 5] + var5;
            int var61 = this.field5630[var53] + var10;
            int var62 = var61 ^ var59 << 11;
            int var63 = var55 + var59;
            int var64 = var56 + var62;
            int var65 = var63 ^ var55 >>> 2;
            int var66 = var55 + var64;
            int var67 = var58 + var65;
            int var68 = var66 ^ var64 << 8;
            int var69 = var60 + var68;
            int var70 = var64 + var67;
            var7 = var70 ^ var67 >>> 16;
            int var71 = var7 + var57;
            int var72 = var67 + var69;
            var6 = var72 ^ var69 << 10;
            int var73 = var69 + var71;
            int var74 = var6 + var54;
            var5 = var73 ^ var71 >>> 4;
            int var75 = var5 + var62;
            int var76 = var71 + var74;
            var4 = var76 ^ var74 << 8;
            int var77 = var74 + var75;
            var9 = var4 + var65;
            var3 = var77 ^ var75 >>> 9;
            var8 = var3 + var68;
            var10 = var9 + var75;
            this.field5630[var53] = var10;
            this.field5630[var53 + 1] = var9;
            this.field5630[var53 + 2] = var8;
            this.field5630[var53 + 3] = var7;
            this.field5630[var53 + 4] = var6;
            this.field5630[var53 + 5] = var5;
            this.field5630[var53 + 6] = var4;
            this.field5630[var53 + 7] = var3;
        }
        this.method2511((byte) 65);
        this.field5633 = 256;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "([I)V", line = 273)
    public class355(int[] arg0) {
        this.field5634 = new int[256];
        this.field5630 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field5634[var2] = arg0[var2];
        }
        this.method2514((byte) 52);
    }
}
