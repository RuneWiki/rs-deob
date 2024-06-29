import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class328 {

    @OriginalMember(owner = "client!tv", name = "n", descriptor = "[I")
    private int[] field5174;

    @OriginalMember(owner = "client!tv", name = "q", descriptor = "[I")
    private int[] field5177;

    @OriginalMember(owner = "client!tv", name = "k", descriptor = "Lpu;")
    public static class411 field5171 = new class411();

    @OriginalMember(owner = "client!tv", name = "p", descriptor = "I")
    public static int field5176 = -1;

    @OriginalMember(owner = "client!tv", name = "o", descriptor = "Lnk;")
    public static class326 field5175 = new class326(0, -1);

    @OriginalMember(owner = "client!tv", name = "s", descriptor = "Ljc;")
    public static class356 field5179 = new class356(2, 14);

    @OriginalMember(owner = "client!tv", name = "u", descriptor = "I")
    public static int field5181 = 0;

    @OriginalMember(owner = "client!tv", name = "t", descriptor = "Ljava/util/Random;")
    public static Random field5180 = new Random();

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "I")
    private int field5161;

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "I")
    private int field5163;

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!tv", name = "f", descriptor = "I")
    private int field5166;

    @OriginalMember(owner = "client!tv", name = "g", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!tv", name = "h", descriptor = "I")
    private int field5168;

    @OriginalMember(owner = "client!tv", name = "i", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!tv", name = "j", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!tv", name = "m", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!tv", name = "l", descriptor = "Lo;")
    public static class138 field5172;

    @OriginalMember(owner = "client!tv", name = "r", descriptor = "[Z")
    public static boolean[] field5178;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)I")
    public final int method2066(int arg0) {
        if (this.field5168 == 0) {
            this.method2071(false);
            this.field5168 = 256;
        }
        field5169++;
        if (arg0 != -7315) {
            field5178 = null;
        }
        return this.field5174[this.field5168 - 1];
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)V")
    private final void method2067(int arg0) {
        field5165++;
        if (arg0 < 126) {
            this.method2066(-66);
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
            int var65 = var7 + var62;
            int var66 = var5 + var64;
            int var67 = var65 ^ var62 << 8;
            int var68 = var62 + var66;
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
            var8 = var3 + var64;
            int var76 = var72 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field5174[var11 + 7] + var2;
            int var38 = this.field5174[var11 + 5] + var4;
            int var39 = this.field5174[var11 + 4] + var5;
            int var40 = this.field5174[var11 + 2] + var7;
            int var41 = this.field5174[var11 + 3] + var6;
            int var42 = this.field5174[var11 + 1] + var8;
            int var43 = this.field5174[var11 + 6] + var3;
            int var44 = this.field5174[var11] + var9;
            int var45 = var44 ^ var42 << 11;
            int var46 = var41 + var45;
            int var47 = var40 + var42;
            int var48 = var47 ^ var40 >>> 2;
            int var49 = var40 + var46;
            int var50 = var39 + var48;
            int var51 = var49 ^ var46 << 8;
            int var52 = var46 + var50;
            int var53 = var38 + var51;
            var6 = var52 ^ var50 >>> 16;
            int var54 = var50 + var53;
            int var55 = var6 + var43;
            var5 = var54 ^ var53 << 10;
            int var56 = var5 + var37;
            int var57 = var53 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var4 + var45;
            int var59 = var55 + var56;
            var3 = var59 ^ var56 << 8;
            int var60 = var56 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field5177[var11] = var9;
            this.field5177[var11 + 1] = var8;
            this.field5177[var11 + 2] = var7;
            this.field5177[var11 + 3] = var6;
            this.field5177[var11 + 4] = var5;
            this.field5177[var11 + 5] = var4;
            this.field5177[var11 + 6] = var3;
            this.field5177[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field5177[var12 + 7] + var2;
            int var14 = this.field5177[var12 + 3] + var6;
            int var15 = this.field5177[var12 + 6] + var3;
            int var16 = this.field5177[var12] + var9;
            int var17 = this.field5177[var12 + 2] + var7;
            int var18 = this.field5177[var12 + 5] + var4;
            int var19 = this.field5177[var12 + 4] + var5;
            int var20 = this.field5177[var12 + 1] + var8;
            int var21 = var16 ^ var20 << 11;
            int var22 = var14 + var21;
            int var23 = var17 + var20;
            int var24 = var23 ^ var17 >>> 2;
            int var25 = var19 + var24;
            int var26 = var17 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var22 + var25;
            int var29 = var18 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var25 + var29;
            int var31 = var6 + var15;
            var5 = var30 ^ var29 << 10;
            int var32 = var29 + var31;
            int var33 = var5 + var13;
            var4 = var32 ^ var31 >>> 4;
            int var34 = var31 + var33;
            int var35 = var4 + var21;
            var3 = var34 ^ var33 << 8;
            int var36 = var33 + var35;
            var8 = var3 + var24;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var27;
            this.field5177[var12] = var9;
            this.field5177[var12 + 1] = var8;
            this.field5177[var12 + 2] = var7;
            this.field5177[var12 + 3] = var6;
            this.field5177[var12 + 4] = var5;
            this.field5177[var12 + 5] = var4;
            this.field5177[var12 + 6] = var3;
            this.field5177[var12 + 7] = var2;
        }
        this.method2071(false);
        this.field5168 = 256;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)V")
    public static void method2068(boolean arg0) {
        field5171 = null;
        field5178 = null;
        if (!arg0) {
            method2068(false);
        }
        field5172 = null;
        field5180 = null;
        field5175 = null;
        field5179 = null;
    }

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "(I)I")
    public final int method2069(int arg0) {
        field5167++;
        if (this.field5168 == 0) {
            this.method2071(false);
            this.field5168 = 256;
        }
        if (arg0 >= -25) {
            this.method2071(false);
        }
        return this.field5174[--this.field5168];
    }

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "(I)V")
    public static final void method2070(int arg0) {
        field5173++;
        class533.field7842.method847(class424.field6387, class510.field7403.field5101 ? class59.field913 + 256 << 0 : -1, 256);
        if (arg0 != -257) {
            method2070(-43);
        }
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(Z)V")
    private final void method2071(boolean arg0) {
        field5170++;
        if (arg0) {
            field5171 = null;
        }
        this.field5166 += ++this.field5161;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field5177[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field5163 ^= this.field5163 << 13;
                } else {
                    this.field5163 ^= this.field5163 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field5163 ^= this.field5163 << 2;
            } else {
                this.field5163 ^= this.field5163 >>> 16;
            }
            this.field5163 += this.field5177[var2 + 128 & 0xFF];
            int var4;
            this.field5177[var2] = var4 = this.field5163 + (this.field5177[class344.method2224(var3, 1020) >> 2] + this.field5166);
            this.field5174[var2] = this.field5166 = var3 + this.field5177[class344.method2224(var4, 261210) >> 8 >> 2];
        }
    }

    @OriginalMember(owner = "client!tv", name = "<init>", descriptor = "()V")
    private class328() {
    }

    @OriginalMember(owner = "client!tv", name = "<init>", descriptor = "([I)V")
    public class328(int[] arg0) {
        this.field5174 = new int[256];
        this.field5177 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field5174[var2] = arg0[var2];
        }
        this.method2067(127);
    }
}
