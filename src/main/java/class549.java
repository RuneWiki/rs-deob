import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class549 {

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "[I")
    private int[] field8183;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "[I")
    private int[] field8187;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field8179 = 0;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field8176;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field8177;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field8178;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field8180;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    private int field8181;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    private int field8182;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public static int field8184;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field8185;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    public static int field8186;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    private int field8188;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
    private int field8191;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
    public static int field8192;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
    public static int field8193;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "Ldda;")
    public static class597 field8190;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "Ljava/lang/String;")
    public static String field8189;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    private final void method3212(int arg0) {
        if (arg0 != -31034) {
            method3219(-106L, (byte) -50);
        }
        field8193++;
        this.field8188 += ++this.field8191;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field8187[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field8181 ^= this.field8181 << 13;
                } else {
                    this.field8181 ^= this.field8181 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field8181 ^= this.field8181 << 2;
            } else {
                this.field8181 ^= this.field8181 >>> 16;
            }
            this.field8181 += this.field8187[var2 + 128 & 0xFF];
            int var4;
            this.field8187[var2] = var4 = this.field8188 + this.field8181 + this.field8187[class637.method3693(255, var3 >> 2)];
            this.field8183[var2] = this.field8188 = var3 + this.field8187[class637.method3693(var4, 261221) >> 8 >> 2];
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V")
    public static void method3213(boolean arg0) {
        field8189 = null;
        field8190 = null;
        if (arg0) {
            method3214(-40, null, null, -43, null, -52);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V")
    public static final void method3214(int arg0, String arg1, String arg2, int arg3, String arg4, int arg5) {
        int var6 = -28 / ((arg0 + 35) / 37);
        class588.method3430(arg3, arg1, 47, -1, arg4, null, arg5, arg2);
        field8180++;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)I")
    public final int method3215(int arg0) {
        if (this.field8182 == 0) {
            this.method3212(-31034);
            this.field8182 = 256;
        }
        field8192++;
        return arg0 == -1617 ? this.field8183[this.field8182 - 1] : 45;
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)I")
    public final int method3216(int arg0) {
        field8176++;
        if (arg0 < 42) {
            method3214(-65, null, null, -127, null, -52);
        }
        if (this.field8182 == 0) {
            this.method3212(-31034);
            this.field8182 = 256;
        }
        return this.field8183[--this.field8182];
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
    private final void method3217(byte arg0) {
        field8184++;
        if (arg0 < 46) {
            this.field8183 = null;
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
            var9 = var8 + var75;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field8183[var11 + 6] + var3;
            int var38 = this.field8183[var11 + 3] + var6;
            int var39 = this.field8183[var11 + 4] + var5;
            int var40 = this.field8183[var11 + 7] + var2;
            int var41 = this.field8183[var11] + var9;
            int var42 = this.field8183[var11 + 1] + var8;
            int var43 = this.field8183[var11 + 5] + var4;
            int var44 = this.field8183[var11 + 2] + var7;
            int var45 = var41 ^ var42 << 11;
            int var46 = var42 + var44;
            int var47 = var38 + var45;
            int var48 = var46 ^ var44 >>> 2;
            int var49 = var44 + var47;
            int var50 = var39 + var48;
            int var51 = var49 ^ var47 << 8;
            int var52 = var47 + var50;
            int var53 = var43 + var51;
            var6 = var52 ^ var50 >>> 16;
            int var54 = var6 + var37;
            int var55 = var50 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var53 + var54;
            int var57 = var5 + var40;
            var4 = var56 ^ var54 >>> 4;
            int var58 = var4 + var45;
            int var59 = var54 + var57;
            var3 = var59 ^ var57 << 8;
            int var60 = var57 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            var7 = var2 + var51;
            this.field8187[var11] = var9;
            this.field8187[var11 + 1] = var8;
            this.field8187[var11 + 2] = var7;
            this.field8187[var11 + 3] = var6;
            this.field8187[var11 + 4] = var5;
            this.field8187[var11 + 5] = var4;
            this.field8187[var11 + 6] = var3;
            this.field8187[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field8187[var12 + 3] + var6;
            int var14 = this.field8187[var12] + var9;
            int var15 = this.field8187[var12 + 4] + var5;
            int var16 = this.field8187[var12 + 5] + var4;
            int var17 = this.field8187[var12 + 7] + var2;
            int var18 = this.field8187[var12 + 2] + var7;
            int var19 = this.field8187[var12 + 1] + var8;
            int var20 = this.field8187[var12 + 6] + var3;
            int var21 = var14 ^ var19 << 11;
            int var22 = var13 + var21;
            int var23 = var18 + var19;
            int var24 = var23 ^ var18 >>> 2;
            int var25 = var18 + var22;
            int var26 = var15 + var24;
            int var27 = var25 ^ var22 << 8;
            int var28 = var22 + var26;
            int var29 = var16 + var27;
            var6 = var28 ^ var26 >>> 16;
            int var30 = var26 + var29;
            int var31 = var6 + var20;
            var5 = var30 ^ var29 << 10;
            int var32 = var5 + var17;
            int var33 = var29 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var31 + var32;
            int var35 = var4 + var21;
            var3 = var34 ^ var32 << 8;
            var8 = var3 + var24;
            int var36 = var32 + var35;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var27;
            this.field8187[var12] = var9;
            this.field8187[var12 + 1] = var8;
            this.field8187[var12 + 2] = var7;
            this.field8187[var12 + 3] = var6;
            this.field8187[var12 + 4] = var5;
            this.field8187[var12 + 5] = var4;
            this.field8187[var12 + 6] = var3;
            this.field8187[var12 + 7] = var2;
        }
        this.method3212(-31034);
        this.field8182 = 256;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V")
    private class549() {
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lqa;B)V")
    public static final void method3218(class167 arg0, byte arg1) {
        field8177++;
        int var2 = -65 % ((-arg1 - 50) / 43);
        for (class96 var3 = (class96) class585.field8699.method772(0); var3 != null; var3 = (class96) class585.field8699.method775(2)) {
            var3.method543(arg0);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method3219(long arg0, byte arg1) {
        field8186++;
        class262.field3880.setTime(new Date(arg0));
        int var3 = class262.field3880.get(7);
        int var4 = class262.field3880.get(5);
        int var5 = class262.field3880.get(2);
        int var6 = class262.field3880.get(1);
        if (arg1 < 1) {
            method3213(false);
        }
        int var7 = class262.field3880.get(11);
        int var8 = class262.field3880.get(12);
        int var9 = class262.field3880.get(13);
        return class352.field5116[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class189.field2883[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "([I)V")
    public class549(int[] arg0) {
        this.field8183 = new int[256];
        this.field8187 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field8183[var2] = arg0[var2];
        }
        this.method3217((byte) 97);
    }
}
