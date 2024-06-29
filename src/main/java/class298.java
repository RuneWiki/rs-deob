import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class298 {

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "[I")
    private int[] field4248;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "[I")
    private int[] field4251;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field4257 = new String[100];

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    private int field4249;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    private int field4250;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    private int field4252;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    private int field4258;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)I")
    public final int method1881(int arg0) {
        field4256++;
        if (this.field4252-- == 0) {
            this.method1885((byte) 82);
            this.field4252 = 255;
        }
        if (arg0 != 255) {
            this.field4258 = 103;
        }
        return this.field4251[this.field4252];
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V")
    private final void method1882(int arg0) {
        field4254++;
        int var2 = 46 / ((57 - arg0) / 45);
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
            int var63 = var7 + var62;
            int var64 = var8 + var9;
            int var65 = var64 ^ var8 >>> 2;
            int var66 = var8 + var63;
            int var67 = var6 + var65;
            int var68 = var66 ^ var63 << 8;
            int var69 = var63 + var67;
            int var70 = var5 + var68;
            var7 = var69 ^ var67 >>> 16;
            int var71 = var4 + var7;
            int var72 = var67 + var70;
            var6 = var72 ^ var70 << 10;
            int var73 = var70 + var71;
            int var74 = var3 + var6;
            var5 = var73 ^ var71 >>> 4;
            int var75 = var5 + var62;
            int var76 = var71 + var74;
            var4 = var76 ^ var74 << 8;
            int var77 = var74 + var75;
            var9 = var4 + var65;
            var3 = var77 ^ var75 >>> 9;
            var8 = var3 + var68;
            var10 = var9 + var75;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var38 = this.field4251[var12 + 1] + var9;
            int var39 = this.field4251[var12] + var10;
            int var40 = this.field4251[var12 + 3] + var7;
            int var41 = this.field4251[var12 + 6] + var4;
            int var42 = this.field4251[var12 + 7] + var3;
            int var43 = this.field4251[var12 + 4] + var6;
            int var44 = this.field4251[var12 + 5] + var5;
            int var45 = this.field4251[var12 + 2] + var8;
            int var46 = var39 ^ var38 << 11;
            int var47 = var38 + var45;
            int var48 = var40 + var46;
            int var49 = var47 ^ var45 >>> 2;
            int var50 = var43 + var49;
            int var51 = var45 + var48;
            int var52 = var51 ^ var48 << 8;
            int var53 = var48 + var50;
            int var54 = var44 + var52;
            var7 = var53 ^ var50 >>> 16;
            int var55 = var50 + var54;
            int var56 = var7 + var41;
            var6 = var55 ^ var54 << 10;
            int var57 = var6 + var42;
            int var58 = var54 + var56;
            var5 = var58 ^ var56 >>> 4;
            int var59 = var56 + var57;
            int var60 = var5 + var46;
            var4 = var59 ^ var57 << 8;
            var9 = var4 + var49;
            int var61 = var57 + var60;
            var3 = var61 ^ var60 >>> 9;
            var8 = var3 + var52;
            var10 = var9 + var60;
            this.field4248[var12] = var10;
            this.field4248[var12 + 1] = var9;
            this.field4248[var12 + 2] = var8;
            this.field4248[var12 + 3] = var7;
            this.field4248[var12 + 4] = var6;
            this.field4248[var12 + 5] = var5;
            this.field4248[var12 + 6] = var4;
            this.field4248[var12 + 7] = var3;
        }
        for (int var13 = 0; var13 < 256; var13 += 8) {
            int var14 = this.field4248[var13 + 3] + var7;
            int var15 = this.field4248[var13 + 4] + var6;
            int var16 = this.field4248[var13 + 2] + var8;
            int var17 = this.field4248[var13 + 1] + var9;
            int var18 = this.field4248[var13 + 5] + var5;
            int var19 = this.field4248[var13 + 7] + var3;
            int var20 = this.field4248[var13 + 6] + var4;
            int var21 = this.field4248[var13] + var10;
            int var22 = var21 ^ var17 << 11;
            int var23 = var14 + var22;
            int var24 = var16 + var17;
            int var25 = var24 ^ var16 >>> 2;
            int var26 = var16 + var23;
            int var27 = var15 + var25;
            int var28 = var26 ^ var23 << 8;
            int var29 = var18 + var28;
            int var30 = var23 + var27;
            var7 = var30 ^ var27 >>> 16;
            int var31 = var7 + var20;
            int var32 = var27 + var29;
            var6 = var32 ^ var29 << 10;
            int var33 = var6 + var19;
            int var34 = var29 + var31;
            var5 = var34 ^ var31 >>> 4;
            int var35 = var31 + var33;
            int var36 = var5 + var22;
            var4 = var35 ^ var33 << 8;
            int var37 = var33 + var36;
            var9 = var4 + var25;
            var3 = var37 ^ var36 >>> 9;
            var10 = var9 + var36;
            var8 = var3 + var28;
            this.field4248[var13] = var10;
            this.field4248[var13 + 1] = var9;
            this.field4248[var13 + 2] = var8;
            this.field4248[var13 + 3] = var7;
            this.field4248[var13 + 4] = var6;
            this.field4248[var13 + 5] = var5;
            this.field4248[var13 + 6] = var4;
            this.field4248[var13 + 7] = var3;
        }
        this.method1885((byte) 92);
        this.field4252 = 256;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIII)V")
    public static final void method1883(int arg0, int arg1, int arg2, int arg3) {
        field4247++;
        if (arg0 == 0) {
            class169.field2360.method809(88, -28022);
            class110.field1278++;
        }
        if (arg0 == 1) {
            class33.field314++;
            class169.field2360.method809(12, -28022);
        }
        if (arg1 != 2) {
            method1886(-98, 80, 122);
        }
        class169.field2360.method1345(0, class256.field3447[82] ? 1 : 0);
        class169.field2360.method1371(class217.field2975 + arg3, 29594);
        class169.field2360.method1357((byte) 90, class40.field427 + arg2);
        class196.field2658 = false;
        class435.field6384 = arg3;
        class450.field6576 = arg2;
        class196.method1249(70);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
    public static void method1884(byte arg0) {
        field4257 = null;
        if (arg0 < 73) {
            field4257 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V")
    private final void method1885(byte arg0) {
        if (arg0 <= 76) {
            return;
        }
        field4255++;
        this.field4249 += ++this.field4250;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field4248[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field4258 ^= this.field4258 << 13;
                } else {
                    this.field4258 ^= this.field4258 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field4258 ^= this.field4258 << 2;
            } else {
                this.field4258 ^= this.field4258 >>> 16;
            }
            this.field4258 += this.field4248[var2 + 128 & 0xFF];
            int var4;
            this.field4248[var2] = var4 = this.field4258 + this.field4249 + this.field4248[class40.method253(var3 >> 2, 255)];
            this.field4251[var2] = this.field4249 = this.field4248[class40.method253(1020, var4 >> 8) >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)V")
    public static final void method1886(int arg0, int arg1, int arg2) {
        class302 var3 = class19.field202[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field4311 != null) {
            var3.field4311 = null;
        }
        if (var3.field4306 != null) {
            var3.field4306 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V")
    private class298() {
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "([I)V")
    public class298(int[] arg0) {
        this.field4248 = new int[256];
        this.field4251 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field4251[var2] = arg0[var2];
        }
        this.method1882(107);
    }
}
