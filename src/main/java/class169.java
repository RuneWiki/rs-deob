import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class169 {

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "[I")
    private int[] field2017;

    @OriginalMember(owner = "client!ffa", name = "g", descriptor = "[I")
    private int[] field2022;

    @OriginalMember(owner = "client!ffa", name = "h", descriptor = "[Lqo;")
    public static class21[] field2023 = new class21[5];

    @OriginalMember(owner = "client!ffa", name = "k", descriptor = "Lkfa;")
    public static class549 field2026;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "I")
    private int field2018;

    @OriginalMember(owner = "client!ffa", name = "d", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!ffa", name = "e", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!ffa", name = "f", descriptor = "I")
    private int field2021;

    @OriginalMember(owner = "client!ffa", name = "i", descriptor = "I")
    private int field2024;

    @OriginalMember(owner = "client!ffa", name = "j", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!ffa", name = "l", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!ffa", name = "m", descriptor = "I")
    private int field2028;

    @OriginalMember(owner = "client!ffa", name = "n", descriptor = "Ljo;")
    public static class303 field2029;

    static {
        for (int var0 = 0; var0 < field2023.length; var0++) {
            field2023[var0] = new class21();
        }
        field2026 = new class549(18, 3);
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)V", line = 6)
    private final void method1007(int arg0) {
        field2027++;
        if (arg0 <= 98) {
            this.field2022 = null;
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
            int var70 = var3 + var6;
            int var71 = var66 + var69;
            var5 = var71 ^ var69 << 10;
            int var72 = var69 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var73;
            var3 = var75 ^ var73 << 8;
            var8 = var3 + var64;
            int var76 = var73 + var74;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field2022[var11 + 2] + var7;
            int var38 = this.field2022[var11] + var9;
            int var39 = this.field2022[var11 + 3] + var6;
            int var40 = this.field2022[var11 + 7] + var2;
            int var41 = this.field2022[var11 + 5] + var4;
            int var42 = this.field2022[var11 + 6] + var3;
            int var43 = this.field2022[var11 + 1] + var8;
            int var44 = this.field2022[var11 + 4] + var5;
            int var45 = var38 ^ var43 << 11;
            int var46 = var37 + var43;
            int var47 = var39 + var45;
            int var48 = var46 ^ var37 >>> 2;
            int var49 = var44 + var48;
            int var50 = var37 + var47;
            int var51 = var50 ^ var47 << 8;
            int var52 = var41 + var51;
            int var53 = var47 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var6 + var42;
            int var55 = var49 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var5 + var40;
            int var57 = var52 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var4 + var45;
            int var59 = var54 + var56;
            var3 = var59 ^ var56 << 8;
            int var60 = var56 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field2017[var11] = var9;
            this.field2017[var11 + 1] = var8;
            this.field2017[var11 + 2] = var7;
            this.field2017[var11 + 3] = var6;
            this.field2017[var11 + 4] = var5;
            this.field2017[var11 + 5] = var4;
            this.field2017[var11 + 6] = var3;
            this.field2017[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2017[var12 + 7] + var2;
            int var14 = this.field2017[var12 + 5] + var4;
            int var15 = this.field2017[var12 + 4] + var5;
            int var16 = this.field2017[var12] + var9;
            int var17 = this.field2017[var12 + 1] + var8;
            int var18 = this.field2017[var12 + 6] + var3;
            int var19 = this.field2017[var12 + 3] + var6;
            int var20 = this.field2017[var12 + 2] + var7;
            int var21 = var16 ^ var17 << 11;
            int var22 = var17 + var20;
            int var23 = var19 + var21;
            int var24 = var22 ^ var20 >>> 2;
            int var25 = var15 + var24;
            int var26 = var20 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var14 + var27;
            int var29 = var23 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var6 + var18;
            int var31 = var25 + var28;
            var5 = var31 ^ var28 << 10;
            int var32 = var5 + var13;
            int var33 = var28 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var4 + var21;
            int var35 = var30 + var32;
            var3 = var35 ^ var32 << 8;
            int var36 = var32 + var34;
            var8 = var3 + var24;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field2017[var12] = var9;
            this.field2017[var12 + 1] = var8;
            this.field2017[var12 + 2] = var7;
            this.field2017[var12 + 3] = var6;
            this.field2017[var12 + 4] = var5;
            this.field2017[var12 + 5] = var4;
            this.field2017[var12 + 6] = var3;
            this.field2017[var12 + 7] = var2;
        }
        this.method1009(-5);
        this.field2021 = 256;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIII)I", line = 156)
    public static final int method1008(int arg0, int arg1, int arg2, int arg3) {
        field2016++;
        int var4 = arg2 / arg0;
        int var5 = arg0 - 1 & arg2;
        int var6 = arg3 / arg0;
        int var7 = arg0 - 1 & arg3;
        int var8 = class60.method404((byte) -26, var6, var4);
        int var9 = class60.method404((byte) 110, var6, var4 + 1);
        int var10 = class60.method404((byte) 120, var6 + 1, var4);
        int var11 = class60.method404((byte) -121, var6 + 1, arg1 + var4);
        int var12 = class201.method1224((byte) 96, var5, var8, arg0, var9);
        int var13 = class201.method1224((byte) 117, var5, var10, arg0, var11);
        return class201.method1224((byte) 118, var7, var12, arg0, var13);
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(I)V", line = 185)
    private final void method1009(int arg0) {
        field2019++;
        this.field2024 += ++this.field2018;
        int var2 = 0;
        if (arg0 != -5) {
            this.method1009(64);
        }
        while (var2 < 256) {
            int var3 = this.field2017[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2028 ^= this.field2028 << 13;
                } else {
                    this.field2028 ^= this.field2028 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2028 ^= this.field2028 << 2;
            } else {
                this.field2028 ^= this.field2028 >>> 16;
            }
            this.field2028 += this.field2017[var2 + 128 & 0xFF];
            int var4;
            this.field2017[var2] = var4 = this.field2024 + this.field2028 + this.field2017[class203.method1246(255, var3 >> 2)];
            this.field2022[var2] = this.field2024 = var3 + this.field2017[class203.method1246(var4 >> 8, 1020) >> 2];
            var2++;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "(I)I", line = 229)
    public final int method1010(int arg0) {
        int var2 = 28 / ((-arg0 - 52) / 55);
        field2020++;
        if (this.field2021 == 0) {
            this.method1009(-5);
            this.field2021 = 256;
        }
        return this.field2022[--this.field2021];
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(B)I", line = 247)
    public final int method1011(byte arg0) {
        if (this.field2021 == 0) {
            this.method1009(-5);
            this.field2021 = 256;
        }
        if (arg0 != -1) {
            this.method1010(106);
        }
        field2025++;
        return this.field2022[this.field2021 - 1];
    }

    @OriginalMember(owner = "client!ffa", name = "d", descriptor = "(I)V", line = 272)
    public static void method1012(int arg0) {
        field2026 = null;
        field2023 = null;
        int var1 = 29 / ((-arg0 - 36) / 63);
        field2029 = null;
    }

    @OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "()V", line = 297)
    private class169() {
    }

    @OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "([I)V", line = 299)
    public class169(int[] arg0) {
        this.field2017 = new int[256];
        this.field2022 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2022[var2] = arg0[var2];
        }
        this.method1007(104);
    }
}
