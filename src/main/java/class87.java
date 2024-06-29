import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class87 {

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "[I")
    private int[] field1159;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "[I")
    private int[] field1163;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field1158 = 0;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field1156 = 1;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    private int field1161;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    private int field1162;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "I")
    private int field1165;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
    private int field1166;

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)I", line = 4)
    public final int method799(int arg0) {
        if (arg0 <= 93) {
            return 80;
        }
        field1167++;
        if (this.field1162 == 0) {
            this.method804(19066);
            this.field1162 = 256;
        }
        return this.field1159[--this.field1162];
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)I", line = 24)
    public final int method800(int arg0) {
        if (this.field1162 == 0) {
            this.method804(19066);
            this.field1162 = 256;
        }
        if (arg0 < 11) {
            return 99;
        } else {
            field1154++;
            return this.field1159[this.field1162 - 1];
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lgda;III)V", line = 41)
    public static final void method801(class61 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class307.field3799) {
            class727 var4 = class107.field1351[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field10177 != null && var4.field10177.method531(false)) {
                arg0.method524(var4.field10177, class6.field80, 0, 0, true, class327.field4047, -111);
            }
        }
        if (arg3 < class307.field3799) {
            class727 var5 = class107.field1351[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field10177 != null && var5.field10177.method531(false)) {
                arg0.method524(var5.field10177, class6.field80, class327.field4047, 0, true, 0, -45);
            }
        }
        if (arg2 < class307.field3799 && arg3 < class250.field2938) {
            class727 var6 = class107.field1351[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field10177 != null && var6.field10177.method531(false)) {
                arg0.method524(var6.field10177, class6.field80, class327.field4047, 0, true, class327.field4047, -98);
            }
        }
        if (arg2 < class307.field3799 && arg3 > 0) {
            class727 var7 = class107.field1351[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field10177 != null && var7.field10177.method531(false)) {
                arg0.method524(var7.field10177, class6.field80, -class327.field4047, 0, true, class327.field4047, -80);
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V", line = 87)
    private final void method802(int arg0) {
        field1155++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        int var10 = 0;
        if (arg0 != 29235) {
            this.method804(-11);
        }
        while (var10 < 4) {
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
            int var72 = var2 + var5;
            int var73 = var69 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var71 + var72;
            int var75 = var4 + var61;
            var3 = var74 ^ var72 << 8;
            int var76 = var72 + var75;
            var8 = var3 + var64;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
            var10++;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1159[var11 + 2] + var7;
            int var38 = this.field1159[var11 + 4] + var5;
            int var39 = this.field1159[var11 + 5] + var4;
            int var40 = this.field1159[var11] + var9;
            int var41 = this.field1159[var11 + 1] + var8;
            int var42 = this.field1159[var11 + 7] + var2;
            int var43 = this.field1159[var11 + 3] + var6;
            int var44 = this.field1159[var11 + 6] + var3;
            int var45 = var40 ^ var41 << 11;
            int var46 = var37 + var41;
            int var47 = var43 + var45;
            int var48 = var46 ^ var37 >>> 2;
            int var49 = var37 + var47;
            int var50 = var38 + var48;
            int var51 = var49 ^ var47 << 8;
            int var52 = var39 + var51;
            int var53 = var47 + var50;
            var6 = var53 ^ var50 >>> 16;
            int var54 = var6 + var44;
            int var55 = var50 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var52 + var54;
            int var57 = var5 + var42;
            var4 = var56 ^ var54 >>> 4;
            int var58 = var4 + var45;
            int var59 = var54 + var57;
            var3 = var59 ^ var57 << 8;
            var8 = var3 + var48;
            int var60 = var57 + var58;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            var7 = var2 + var51;
            this.field1163[var11] = var9;
            this.field1163[var11 + 1] = var8;
            this.field1163[var11 + 2] = var7;
            this.field1163[var11 + 3] = var6;
            this.field1163[var11 + 4] = var5;
            this.field1163[var11 + 5] = var4;
            this.field1163[var11 + 6] = var3;
            this.field1163[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1163[var12 + 2] + var7;
            int var14 = this.field1163[var12 + 5] + var4;
            int var15 = this.field1163[var12 + 7] + var2;
            int var16 = this.field1163[var12 + 4] + var5;
            int var17 = this.field1163[var12 + 6] + var3;
            int var18 = this.field1163[var12 + 3] + var6;
            int var19 = this.field1163[var12 + 1] + var8;
            int var20 = this.field1163[var12] + var9;
            int var21 = var20 ^ var19 << 11;
            int var22 = var18 + var21;
            int var23 = var13 + var19;
            int var24 = var23 ^ var13 >>> 2;
            int var25 = var16 + var24;
            int var26 = var13 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var14 + var27;
            int var29 = var22 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var25 + var28;
            int var31 = var6 + var17;
            var5 = var30 ^ var28 << 10;
            int var32 = var5 + var15;
            int var33 = var28 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var31 + var32;
            int var35 = var4 + var21;
            var3 = var34 ^ var32 << 8;
            var8 = var3 + var24;
            int var36 = var32 + var35;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var27;
            this.field1163[var12] = var9;
            this.field1163[var12 + 1] = var8;
            this.field1163[var12 + 2] = var7;
            this.field1163[var12 + 3] = var6;
            this.field1163[var12 + 4] = var5;
            this.field1163[var12 + 5] = var4;
            this.field1163[var12 + 6] = var3;
            this.field1163[var12 + 7] = var2;
        }
        this.method804(19066);
        this.field1162 = 256;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;", line = 243)
    public static final String method803(String arg0, boolean arg1) {
        field1160++;
        if (arg0 == null) {
            return null;
        } else if (arg1) {
            return null;
        } else {
            int var2 = 0;
            int var3 = arg0.length();
            while (var2 < var3 && class470.method2813(98, arg0.charAt(var2))) {
                var2++;
            }
            while (var3 > var2 && class470.method2813(97, arg0.charAt(var3 - 1))) {
                var3--;
            }
            int var4 = var3 - var2;
            if (var4 < 1 || var4 > 12) {
                return null;
            }
            StringBuffer var5 = new StringBuffer(var4);
            for (int var6 = var2; var6 < var3; var6++) {
                char var7 = arg0.charAt(var6);
                if (class482.method2860(var7, 4)) {
                    char var8 = class74.method695(var7, (byte) -6);
                    if (var8 != '\u0000') {
                        var5.append(var8);
                    }
                }
            }
            if (var5.length() == 0) {
                return null;
            } else {
                return var5.toString();
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)V", line = 300)
    private final void method804(int arg0) {
        field1157++;
        if (arg0 != 19066) {
            return;
        }
        this.field1165 += ++this.field1161;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1163[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1166 ^= this.field1166 << 13;
                } else {
                    this.field1166 ^= this.field1166 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1166 ^= this.field1166 << 2;
            } else {
                this.field1166 ^= this.field1166 >>> 16;
            }
            this.field1166 += this.field1163[var2 + 128 & 0xFF];
            int var4;
            this.field1163[var2] = var4 = this.field1165 + this.field1166 + this.field1163[class296.method1733(var3 >> 2, 255)];
            this.field1159[var2] = this.field1165 = this.field1163[class296.method1733(255, var4 >> 8 >> 2)] + var3;
        }
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V", line = 345)
    private class87() {
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "([I)V", line = 347)
    public class87(int[] arg0) {
        this.field1159 = new int[256];
        this.field1163 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1159[var2] = arg0[var2];
        }
        this.method802(29235);
    }
}
