import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class324 {

    @OriginalMember(owner = "client!tu", name = "k", descriptor = "[I")
    private int[] field4041;

    @OriginalMember(owner = "client!tu", name = "o", descriptor = "[I")
    private int[] field4045;

    @OriginalMember(owner = "client!tu", name = "n", descriptor = "[S")
    private static short[] field4044 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!tu", name = "h", descriptor = "[S")
    private static short[] field4038 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!tu", name = "r", descriptor = "Z")
    public static boolean field4048 = false;

    @OriginalMember(owner = "client!tu", name = "i", descriptor = "[S")
    private static short[] field4039 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!tu", name = "p", descriptor = "[[S")
    public static short[][] field4046 = new short[][] { field4038, field4039, field4044 };

    @OriginalMember(owner = "client!tu", name = "g", descriptor = "Ldga;")
    public static class195 field4037 = new class195();

    @OriginalMember(owner = "client!tu", name = "s", descriptor = "[I")
    public static int[] field4049;

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "I")
    private int field4032;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "I")
    private int field4035;

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!tu", name = "j", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!tu", name = "l", descriptor = "I")
    private int field4042;

    @OriginalMember(owner = "client!tu", name = "m", descriptor = "I")
    private int field4043;

    @OriginalMember(owner = "client!tu", name = "q", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "Lxa;")
    public static class468 field4031;

    static {
        new class661("", 76);
        field4049 = new int[8];
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V", line = 11)
    private final void method1865(int arg0) {
        field4047++;
        if (arg0 != 12110) {
            method1867(45);
        }
        this.field4042 += ++this.field4035;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field4041[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field4043 ^= this.field4043 << 13;
                } else {
                    this.field4043 ^= this.field4043 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field4043 ^= this.field4043 << 2;
            } else {
                this.field4043 ^= this.field4043 >>> 16;
            }
            this.field4043 += this.field4041[var2 + 128 & 0xFF];
            int var4;
            this.field4041[var2] = var4 = this.field4042 + this.field4043 + this.field4041[class109.method762(var3, 1020) >> 2];
            this.field4045[var2] = this.field4042 = this.field4041[class109.method762(255, var4 >> 8 >> 2)] + var3;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Z)V", line = 58)
    private final void method1866(boolean arg0) {
        if (arg0) {
            this.method1869(true);
        }
        field4036++;
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
            int var68 = var4 + var67;
            int var69 = var62 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var3 + var6;
            int var71 = var65 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var2 + var5;
            int var73 = var68 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var72;
            var3 = var75 ^ var72 << 8;
            int var76 = var72 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field4045[var11] + var9;
            int var38 = this.field4045[var11 + 5] + var4;
            int var39 = this.field4045[var11 + 3] + var6;
            int var40 = this.field4045[var11 + 6] + var3;
            int var41 = this.field4045[var11 + 4] + var5;
            int var42 = this.field4045[var11 + 7] + var2;
            int var43 = this.field4045[var11 + 2] + var7;
            int var44 = this.field4045[var11 + 1] + var8;
            int var45 = var37 ^ var44 << 11;
            int var46 = var39 + var45;
            int var47 = var43 + var44;
            int var48 = var47 ^ var43 >>> 2;
            int var49 = var41 + var48;
            int var50 = var43 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var46 + var49;
            int var53 = var38 + var51;
            var6 = var52 ^ var49 >>> 16;
            int var54 = var49 + var53;
            int var55 = var6 + var40;
            var5 = var54 ^ var53 << 10;
            int var56 = var5 + var42;
            int var57 = var53 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var55 + var56;
            int var59 = var4 + var45;
            var3 = var58 ^ var56 << 8;
            var8 = var3 + var48;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            var7 = var2 + var51;
            this.field4041[var11] = var9;
            this.field4041[var11 + 1] = var8;
            this.field4041[var11 + 2] = var7;
            this.field4041[var11 + 3] = var6;
            this.field4041[var11 + 4] = var5;
            this.field4041[var11 + 5] = var4;
            this.field4041[var11 + 6] = var3;
            this.field4041[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field4041[var12 + 4] + var5;
            int var14 = this.field4041[var12 + 5] + var4;
            int var15 = this.field4041[var12 + 2] + var7;
            int var16 = this.field4041[var12 + 6] + var3;
            int var17 = this.field4041[var12 + 7] + var2;
            int var18 = this.field4041[var12 + 1] + var8;
            int var19 = this.field4041[var12 + 3] + var6;
            int var20 = this.field4041[var12] + var9;
            int var21 = var20 ^ var18 << 11;
            int var22 = var19 + var21;
            int var23 = var15 + var18;
            int var24 = var23 ^ var15 >>> 2;
            int var25 = var13 + var24;
            int var26 = var15 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var14 + var27;
            int var29 = var22 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var25 + var28;
            int var31 = var6 + var16;
            var5 = var30 ^ var28 << 10;
            int var32 = var28 + var31;
            int var33 = var5 + var17;
            var4 = var32 ^ var31 >>> 4;
            int var34 = var31 + var33;
            int var35 = var4 + var21;
            var3 = var34 ^ var33 << 8;
            var8 = var3 + var24;
            int var36 = var33 + var35;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field4041[var12] = var9;
            this.field4041[var12 + 1] = var8;
            this.field4041[var12 + 2] = var7;
            this.field4041[var12 + 3] = var6;
            this.field4041[var12 + 4] = var5;
            this.field4041[var12 + 5] = var4;
            this.field4041[var12 + 6] = var3;
            this.field4041[var12 + 7] = var2;
        }
        this.method1865(12110);
        this.field4032 = 256;
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)V", line = 205)
    public static void method1867(int arg0) {
        field4044 = null;
        field4037 = null;
        field4031 = null;
        if (arg0 != 7) {
            method1867(-105);
        }
        field4046 = null;
        field4049 = null;
        field4039 = null;
        field4038 = null;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILjava/lang/String;)V", line = 224)
    public static final void method1868(int arg0, String arg1) {
        field4033++;
        if (arg1.equals("")) {
            return;
        }
        class536.field6745++;
        class124 var2 = class336.method1924(class549.field6890, class636.field8620, (byte) -45);
        if (arg0 != -5) {
            method1868(29, null);
        }
        var2.field1516.method3090(class680.method3757((byte) 60, arg1), arg0 + 8);
        var2.field1516.method3050(false, arg1);
        class197.method1156((byte) 116, var2);
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(Z)I", line = 245)
    public final int method1869(boolean arg0) {
        if (this.field4032 == 0) {
            this.method1865(12110);
            this.field4032 = 256;
        }
        field4034++;
        return arg0 ? -21 : this.field4045[--this.field4032];
    }

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(I)I", line = 268)
    public final int method1870(int arg0) {
        field4040++;
        if (arg0 != -29867) {
            method1868(12, null);
        }
        if (this.field4032 == 0) {
            this.method1865(12110);
            this.field4032 = 256;
        }
        return this.field4045[this.field4032 - 1];
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "()V", line = 288)
    private class324() {
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "([I)V", line = 290)
    public class324(int[] arg0) {
        this.field4041 = new int[256];
        this.field4045 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field4045[var2] = arg0[var2];
        }
        this.method1866(false);
    }
}
