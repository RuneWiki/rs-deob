import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class744 {

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "[I")
    private int[] field10421;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "[I")
    private int[] field10418;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field10413;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field10414;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    private int field10415;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    private int field10416;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    private int field10417;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field10419;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    private int field10420;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field10422;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field10423;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)I")
    public final int method4161(int arg0) {
        field10423++;
        if (this.field10415 == 0) {
            this.method4164(-12196);
            this.field10415 = 256;
        }
        if (arg0 != 13837) {
            this.field10418 = null;
        }
        return this.field10421[this.field10415 - 1];
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)I")
    public final int method4162(boolean arg0) {
        if (this.field10415 == 0) {
            this.method4164(-12196);
            this.field10415 = 256;
        }
        field10422++;
        if (!arg0) {
            this.method4161(108);
        }
        return this.field10421[--this.field10415];
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
    private final void method4163(int arg0) {
        field10413++;
        if (arg0 != 3) {
            this.method4162(false);
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
            int var68 = var62 + var65;
            int var69 = var4 + var67;
            var6 = var68 ^ var65 >>> 16;
            int var70 = var3 + var6;
            int var71 = var65 + var69;
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
            var7 = var2 + var67;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field10421[var11 + 1] + var8;
            int var38 = this.field10421[var11 + 4] + var5;
            int var39 = this.field10421[var11 + 7] + var2;
            int var40 = this.field10421[var11 + 3] + var6;
            int var41 = this.field10421[var11 + 2] + var7;
            int var42 = this.field10421[var11] + var9;
            int var43 = this.field10421[var11 + 5] + var4;
            int var44 = this.field10421[var11 + 6] + var3;
            int var45 = var42 ^ var37 << 11;
            int var46 = var37 + var41;
            int var47 = var40 + var45;
            int var48 = var46 ^ var41 >>> 2;
            int var49 = var38 + var48;
            int var50 = var41 + var47;
            int var51 = var50 ^ var47 << 8;
            int var52 = var47 + var49;
            int var53 = var43 + var51;
            var6 = var52 ^ var49 >>> 16;
            int var54 = var49 + var53;
            int var55 = var6 + var44;
            var5 = var54 ^ var53 << 10;
            int var56 = var53 + var55;
            int var57 = var5 + var39;
            var4 = var56 ^ var55 >>> 4;
            int var58 = var4 + var45;
            int var59 = var55 + var57;
            var3 = var59 ^ var57 << 8;
            var8 = var3 + var48;
            int var60 = var57 + var58;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            var7 = var2 + var51;
            this.field10418[var11] = var9;
            this.field10418[var11 + 1] = var8;
            this.field10418[var11 + 2] = var7;
            this.field10418[var11 + 3] = var6;
            this.field10418[var11 + 4] = var5;
            this.field10418[var11 + 5] = var4;
            this.field10418[var11 + 6] = var3;
            this.field10418[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field10418[var12 + 1] + var8;
            int var14 = this.field10418[var12 + 7] + var2;
            int var15 = this.field10418[var12 + 5] + var4;
            int var16 = this.field10418[var12 + 6] + var3;
            int var17 = this.field10418[var12 + 3] + var6;
            int var18 = this.field10418[var12] + var9;
            int var19 = this.field10418[var12 + 2] + var7;
            int var20 = this.field10418[var12 + 4] + var5;
            int var21 = var18 ^ var13 << 11;
            int var22 = var13 + var19;
            int var23 = var17 + var21;
            int var24 = var22 ^ var19 >>> 2;
            int var25 = var19 + var23;
            int var26 = var20 + var24;
            int var27 = var25 ^ var23 << 8;
            int var28 = var15 + var27;
            int var29 = var23 + var26;
            var6 = var29 ^ var26 >>> 16;
            int var30 = var6 + var16;
            int var31 = var26 + var28;
            var5 = var31 ^ var28 << 10;
            int var32 = var28 + var30;
            int var33 = var5 + var14;
            var4 = var32 ^ var30 >>> 4;
            int var34 = var30 + var33;
            int var35 = var4 + var21;
            var3 = var34 ^ var33 << 8;
            int var36 = var33 + var35;
            var8 = var3 + var24;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field10418[var12] = var9;
            this.field10418[var12 + 1] = var8;
            this.field10418[var12 + 2] = var7;
            this.field10418[var12 + 3] = var6;
            this.field10418[var12 + 4] = var5;
            this.field10418[var12 + 5] = var4;
            this.field10418[var12 + 6] = var3;
            this.field10418[var12 + 7] = var2;
        }
        this.method4164(-12196);
        this.field10415 = 256;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
    private final void method4164(int arg0) {
        field10414++;
        if (arg0 != -12196) {
            this.method4163(-8);
        }
        this.field10417 += ++this.field10416;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field10418[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field10420 ^= this.field10420 << 13;
                } else {
                    this.field10420 ^= this.field10420 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field10420 ^= this.field10420 << 2;
            } else {
                this.field10420 ^= this.field10420 >>> 16;
            }
            this.field10420 += this.field10418[var2 + 128 & 0xFF];
            int var4;
            this.field10418[var2] = var4 = this.field10420 + this.field10418[class493.method2943(var3 >> 2, 255)] + this.field10417;
            this.field10421[var2] = this.field10417 = this.field10418[class493.method2943(var4 >> 8 >> 2, 255)] + var3;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZBII)Ljava/lang/String;")
    public static final String method4165(boolean arg0, byte arg1, int arg2, int arg3) {
        field10419++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        } else if (arg0 && arg2 >= 0) {
            int var4 = 2;
            int var5 = arg2 / arg3;
            while (var5 != 0) {
                var5 /= arg3;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg2;
                arg2 /= arg3;
                int var9 = var8 - arg2 * arg3;
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            if (arg1 <= 99) {
                return null;
            } else {
                return new String(var6);
            }
        } else {
            return Integer.toString(arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
    private class744() {
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "([I)V")
    public class744(int[] arg0) {
        this.field10421 = new int[256];
        this.field10418 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field10421[var2] = arg0[var2];
        }
        this.method4163(3);
    }
}
