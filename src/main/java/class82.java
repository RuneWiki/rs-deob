import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class82 {

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "[I")
    private int[] field1967 = new int[256];

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "[I")
    private int[] field1973 = new int[256];

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "Lwd;")
    public static class150 field1970 = class2.method9(true, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "Z")
    public static boolean field1974 = false;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "Lwd;")
    public static class150 field1966 = class2.method9(true, "http:)4)4www)3runescape)3com");

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "Z")
    public static boolean field1972 = false;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "Lwd;")
    public static class150 field1971 = class2.method9(true, "backright1");

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    private int field1975;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    private int field1978;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
    private int field1983;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "I")
    private int field1984;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "Lqd;")
    public static class114 field1980;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "[I")
    public static int[] field1976;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "[I")
    public static int[] field1979;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLjava/awt/Component;II)Lkc;")
    public static final class72 method591(byte arg0, Component arg1, int arg2, int arg3) {
        field1977++;
        try {
            Class var4 = Class.forName("fc");
            int var5 = 103 / ((arg0 + 66) / 42);
            class72 var6 = (class72) var4.getDeclaredConstructor().newInstance();
            var6.method286(arg2, arg3, arg1, 1);
            return var6;
        } catch (Throwable var8) {
            class73 var7 = new class73();
            var7.method286(arg2, arg3, arg1, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)I")
    public final int method592(byte arg0) {
        int var2 = 73 % ((arg0 - 30) / 34);
        field1981++;
        if (this.field1975-- == 0) {
            this.method597((byte) 81);
            this.field1975 = 255;
        }
        return this.field1967[this.field1975];
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V")
    public static void method593(byte arg0) {
        field1970 = null;
        field1980 = null;
        field1971 = null;
        field1966 = null;
        int var1 = -86 / ((-arg0 - 9) / 47);
        field1979 = null;
        field1976 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    private final void method594(int arg0) {
        field1982++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        int var10 = 79 / ((12 - arg0) / 56);
        for (int var11 = 0; var11 < 4; var11++) {
            int var62 = var9 ^ var8 << 11;
            int var63 = var6 + var62;
            int var64 = var7 + var8;
            int var65 = var64 ^ var7 >>> 2;
            int var66 = var7 + var63;
            int var67 = var5 + var65;
            int var68 = var66 ^ var63 << 8;
            int var69 = var4 + var68;
            int var70 = var63 + var67;
            var6 = var70 ^ var67 >>> 16;
            int var71 = var67 + var69;
            int var72 = var3 + var6;
            var5 = var71 ^ var69 << 10;
            int var73 = var69 + var72;
            var4 = var73 ^ var72 >>> 4;
            int var74 = var2 + var5;
            int var75 = var72 + var74;
            int var76 = var4 + var62;
            var3 = var75 ^ var74 << 8;
            int var77 = var74 + var76;
            var2 = var77 ^ var76 >>> 9;
            var7 = var2 + var68;
            var8 = var3 + var65;
            var9 = var8 + var76;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var38 = this.field1967[var12 + 2] + var7;
            int var39 = this.field1967[var12 + 4] + var5;
            int var40 = this.field1967[var12 + 5] + var4;
            int var41 = this.field1967[var12 + 1] + var8;
            int var42 = this.field1967[var12 + 6] + var3;
            int var43 = this.field1967[var12 + 3] + var6;
            int var44 = this.field1967[var12 + 7] + var2;
            int var45 = this.field1967[var12] + var9;
            int var46 = var45 ^ var41 << 11;
            int var47 = var38 + var41;
            int var48 = var43 + var46;
            int var49 = var47 ^ var38 >>> 2;
            int var50 = var38 + var48;
            int var51 = var50 ^ var48 << 8;
            int var52 = var40 + var51;
            int var53 = var39 + var49;
            int var54 = var48 + var53;
            var6 = var54 ^ var53 >>> 16;
            int var55 = var52 + var53;
            var5 = var55 ^ var52 << 10;
            int var56 = var5 + var44;
            int var57 = var6 + var42;
            int var58 = var52 + var57;
            var4 = var58 ^ var57 >>> 4;
            int var59 = var56 + var57;
            var3 = var59 ^ var56 << 8;
            var8 = var3 + var49;
            int var60 = var4 + var46;
            int var61 = var56 + var60;
            var2 = var61 ^ var60 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var60;
            this.field1973[var12] = var9;
            this.field1973[var12 + 1] = var8;
            this.field1973[var12 + 2] = var7;
            this.field1973[var12 + 3] = var6;
            this.field1973[var12 + 4] = var5;
            this.field1973[var12 + 5] = var4;
            this.field1973[var12 + 6] = var3;
            this.field1973[var12 + 7] = var2;
        }
        for (int var13 = 0; var13 < 256; var13 += 8) {
            int var14 = this.field1973[var13 + 4] + var5;
            int var15 = this.field1973[var13 + 5] + var4;
            int var16 = this.field1973[var13 + 2] + var7;
            int var17 = this.field1973[var13 + 6] + var3;
            int var18 = this.field1973[var13 + 1] + var8;
            int var19 = this.field1973[var13 + 7] + var2;
            int var20 = this.field1973[var13] + var9;
            int var21 = var20 ^ var18 << 11;
            int var22 = this.field1973[var13 + 3] + var6;
            int var23 = var16 + var18;
            int var24 = var23 ^ var16 >>> 2;
            int var25 = var14 + var24;
            int var26 = var21 + var22;
            int var27 = var16 + var26;
            int var28 = var27 ^ var26 << 8;
            int var29 = var25 + var26;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var15 + var28;
            int var31 = var25 + var30;
            int var32 = var6 + var17;
            var5 = var31 ^ var30 << 10;
            int var33 = var5 + var19;
            int var34 = var30 + var32;
            var4 = var34 ^ var32 >>> 4;
            int var35 = var4 + var21;
            int var36 = var32 + var33;
            var3 = var36 ^ var33 << 8;
            var8 = var3 + var24;
            int var37 = var33 + var35;
            var2 = var37 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var28;
            this.field1973[var13] = var9;
            this.field1973[var13 + 1] = var8;
            this.field1973[var13 + 2] = var7;
            this.field1973[var13 + 3] = var6;
            this.field1973[var13 + 4] = var5;
            this.field1973[var13 + 5] = var4;
            this.field1973[var13 + 6] = var3;
            this.field1973[var13 + 7] = var2;
        }
        this.method597((byte) 69);
        this.field1975 = 256;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method595(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1985++;
        if (class145.method1090(-116, arg5)) {
            if (arg7 < 76) {
                field1974 = true;
            }
            class20.method148(arg0, 0, 0, arg4, -1, class58.field1500[arg5], arg1, arg6, -30396, arg2, arg8, arg3);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II[B)I")
    public static final int method596(int arg0, int arg1, byte[] arg2) {
        field1969++;
        if (arg1 != -420897781) {
            field1976 = null;
        }
        return class18.method127(0, arg2, (byte) -67, arg0);
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "([I)V")
    public class82(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1967[var2] = arg0[var2];
        }
        this.method594(117);
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(B)V")
    private final void method597(byte arg0) {
        this.field1978 += ++this.field1984;
        field1968++;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1973[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1983 ^= this.field1983 << 13;
                } else {
                    this.field1983 ^= this.field1983 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1983 ^= this.field1983 << 2;
            } else {
                this.field1983 ^= this.field1983 >>> 16;
            }
            this.field1983 += this.field1973[var2 + 128 & 0xFF];
            int var4;
            this.field1973[var2] = var4 = this.field1983 + this.field1973[class94.method667(var3, 1020) >> 2] + this.field1978;
            this.field1967[var2] = this.field1978 = var3 + this.field1973[class94.method667(var4, 261199) >> 8 >> 2];
        }
        if (arg0 < 44) {
            field1979 = null;
        }
    }
}
