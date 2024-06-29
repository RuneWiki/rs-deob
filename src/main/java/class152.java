import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class152 {

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "[I")
    private int[] field1925;

    @OriginalMember(owner = "client!bw", name = "m", descriptor = "[I")
    private int[] field1937;

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "I")
    private int field1927;

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "I")
    private int field1928;

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!bw", name = "f", descriptor = "I")
    private int field1930;

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!bw", name = "h", descriptor = "I")
    private int field1932;

    @OriginalMember(owner = "client!bw", name = "i", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!bw", name = "j", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!bw", name = "k", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!bw", name = "l", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "[Lpu;")
    public static class772[] field1926;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)I", line = 3)
    public final int method865(int arg0) {
        if (arg0 != 1271483908) {
            this.method869(-42);
        }
        field1933++;
        if (this.field1928 == 0) {
            this.method870(128);
            this.field1928 = 256;
        }
        return this.field1925[--this.field1928];
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)V", line = 21)
    private final void method866(int arg0) {
        field1929++;
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
            int var65 = var7 + var62;
            int var66 = var5 + var64;
            int var67 = var65 ^ var62 << 8;
            int var68 = var62 + var66;
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
            int var37 = this.field1925[var11 + 3] + var6;
            int var38 = this.field1925[var11 + 7] + var2;
            int var39 = this.field1925[var11 + 6] + var3;
            int var40 = this.field1925[var11 + 4] + var5;
            int var41 = this.field1925[var11 + 2] + var7;
            int var42 = this.field1925[var11] + var9;
            int var43 = this.field1925[var11 + 1] + var8;
            int var44 = this.field1925[var11 + 5] + var4;
            int var45 = var42 ^ var43 << 11;
            int var46 = var37 + var45;
            int var47 = var41 + var43;
            int var48 = var47 ^ var41 >>> 2;
            int var49 = var40 + var48;
            int var50 = var41 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var46 + var49;
            int var53 = var44 + var51;
            var6 = var52 ^ var49 >>> 16;
            int var54 = var49 + var53;
            int var55 = var6 + var39;
            var5 = var54 ^ var53 << 10;
            int var56 = var53 + var55;
            int var57 = var5 + var38;
            var4 = var56 ^ var55 >>> 4;
            int var58 = var4 + var45;
            int var59 = var55 + var57;
            var3 = var59 ^ var57 << 8;
            var8 = var3 + var48;
            int var60 = var57 + var58;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            var7 = var2 + var51;
            this.field1937[var11] = var9;
            this.field1937[var11 + 1] = var8;
            this.field1937[var11 + 2] = var7;
            this.field1937[var11 + 3] = var6;
            this.field1937[var11 + 4] = var5;
            this.field1937[var11 + 5] = var4;
            this.field1937[var11 + 6] = var3;
            this.field1937[var11 + 7] = var2;
        }
        if (arg0 != 3) {
            this.field1925 = null;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1937[var12 + 4] + var5;
            int var14 = this.field1937[var12] + var9;
            int var15 = this.field1937[var12 + 2] + var7;
            int var16 = this.field1937[var12 + 5] + var4;
            int var17 = this.field1937[var12 + 3] + var6;
            int var18 = this.field1937[var12 + 6] + var3;
            int var19 = this.field1937[var12 + 1] + var8;
            int var20 = this.field1937[var12 + 7] + var2;
            int var21 = var14 ^ var19 << 11;
            int var22 = var15 + var19;
            int var23 = var17 + var21;
            int var24 = var22 ^ var15 >>> 2;
            int var25 = var13 + var24;
            int var26 = var15 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var16 + var27;
            int var29 = var23 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var25 + var28;
            int var31 = var6 + var18;
            var5 = var30 ^ var28 << 10;
            int var32 = var28 + var31;
            int var33 = var5 + var20;
            var4 = var32 ^ var31 >>> 4;
            int var34 = var31 + var33;
            int var35 = var4 + var21;
            var3 = var34 ^ var33 << 8;
            var8 = var3 + var24;
            int var36 = var33 + var35;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var27;
            this.field1937[var12] = var9;
            this.field1937[var12 + 1] = var8;
            this.field1937[var12 + 2] = var7;
            this.field1937[var12 + 3] = var6;
            this.field1937[var12 + 4] = var5;
            this.field1937[var12 + 5] = var4;
            this.field1937[var12 + 6] = var3;
            this.field1937[var12 + 7] = var2;
        }
        this.method870(arg0 + 125);
        this.field1928 = 256;
    }

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "(I)V", line = 170)
    public static void method867(int arg0) {
        field1926 = null;
        if (arg0 != -18235) {
            field1936 = -90;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(BLuaa;)V", line = 182)
    public static final void method868(byte arg0, class391 arg1) {
        field1934++;
        if (!class47.field549 || arg0 < 119) {
            return;
        }
        class563.field7156++;
        if (arg1.field5002 != null) {
            class391 var2 = class752.method4075(class170.field2260, (byte) -98, class777.field10600);
            if (var2 != null) {
                class244 var3 = new class244();
                var3.field3350 = arg1;
                var3.field3349 = arg1.field5002;
                var3.field3352 = var2;
                class760.method4148(var3);
            }
        }
        class13 var4 = class659.method3587(class68.field909, 98, class544.field6817);
        var4.field130.method1496(arg1.field5151, (byte) -126);
        var4.field130.method1502(arg1.field5039, 65280);
        var4.field130.method1502(class777.field10600, 65280);
        var4.field130.method1521(class358.field4377, true);
        var4.field130.method1535(-2036115288, class170.field2260);
        var4.field130.method1541(374, arg1.field5128);
        class116.method679(var4, 0);
    }

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "(I)I", line = 233)
    public final int method869(int arg0) {
        if (arg0 != 2) {
            this.method870(-92);
        }
        field1935++;
        if (this.field1928 == 0) {
            this.method870(128);
            this.field1928 = 256;
        }
        return this.field1925[this.field1928 - 1];
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "()V", line = 253)
    private class152() {
    }

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "(I)V", line = 256)
    private final void method870(int arg0) {
        field1931++;
        if (arg0 != 128) {
            field1926 = null;
        }
        this.field1932 += ++this.field1927;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1937[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1930 ^= this.field1930 << 13;
                } else {
                    this.field1930 ^= this.field1930 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1930 ^= this.field1930 << 2;
            } else {
                this.field1930 ^= this.field1930 >>> 16;
            }
            this.field1930 += this.field1937[var2 + 128 & 0xFF];
            int var4;
            this.field1937[var2] = var4 = this.field1937[class249.method1625(255, var3 >> 2)] + this.field1930 + this.field1932;
            this.field1925[var2] = this.field1932 = var3 + this.field1937[class249.method1625(var4 >> 8, 1020) >> 2];
        }
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "([I)V", line = 297)
    public class152(int[] arg0) {
        this.field1925 = new int[256];
        this.field1937 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1925[var2] = arg0[var2];
        }
        this.method866(3);
    }
}
