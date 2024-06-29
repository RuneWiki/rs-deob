import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class289 {

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "[I")
    private int[] field4304;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "[I")
    private int[] field4308;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field4306 = 0;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "Z")
    public static boolean field4316 = false;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4311 = "glow3:";

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    public static int field4315 = 0;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
    private int field4312;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
    private int field4313;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    private int field4314;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
    private int field4318;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "Ltg;")
    public static class294 field4307;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILjava/lang/String;Z)V", line = 4)
    public static final void method2029(int arg0, String arg1, boolean arg2) {
        field4319++;
        if (!arg2) {
            method2030(83);
        }
        class221 var3 = class447.method2795(3, (byte) -49, arg0);
        var3.method1692(0);
        var3.field3290 = arg1;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V", line = 24)
    public static void method2030(int arg0) {
        field4307 = null;
        field4311 = null;
        if (arg0 != 0) {
            field4306 = 63;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V", line = 40)
    private final void method2031(byte arg0) {
        field4309++;
        this.field4314 += ++this.field4318;
        if (arg0 >= -126) {
            this.field4318 = -51;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field4308[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field4313 ^= this.field4313 << 13;
                } else {
                    this.field4313 ^= this.field4313 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field4313 ^= this.field4313 << 2;
            } else {
                this.field4313 ^= this.field4313 >>> 16;
            }
            this.field4313 += this.field4308[var2 + 128 & 0xFF];
            int var4;
            this.field4308[var2] = var4 = this.field4314 + this.field4313 + this.field4308[class35.method254(var3 >> 2, 255)];
            this.field4304[var2] = this.field4314 = var3 + this.field4308[class35.method254(255, var4 >> 8 >> 2)];
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V", line = 82)
    public static final void method2032(int arg0) {
        field4305++;
        if (class240.field3463 == 10 || class240.field3463 == 28) {
            class151.method1167(class286.field4288 >> 10, 5000, class265.field3985 >> 10, -4097);
        } else {
            class151.method1167(class86.field1394.field5696[0] >> 3, 5000, class86.field1394.field5694[0] >> 3, -4097);
        }
        class109.method954((byte) -94);
        class217.method1644(false);
        if (arg0 != 3) {
            field4306 = 45;
        }
        class354.method2274(-26130);
        class303.method2072((byte) -27);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)Ltf;", line = 103)
    public static final class161 method2033(int arg0, int arg1) {
        if (arg0 != 0) {
            method2029(-49, (String) null, false);
        }
        field4310++;
        class161 var2 = (class161) class281.field4209.method2228(-1, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class381.field5417.method1355(arg1, -12607, 0);
        } else {
            var3 = class183.field2704.method1355(arg1 & 0x7FFF, -12607, 0);
        }
        class161 var4 = new class161();
        if (var3 != null) {
            var4.method1260(new class37(var3), true);
        }
        if (arg1 >= 32768) {
            var4.method1255(-110);
        }
        class281.field4209.method2226((long) arg1, var4, (byte) -108);
        return var4;
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)I", line = 140)
    public final int method2034(int arg0) {
        if (arg0 != -12041) {
            field4307 = null;
        }
        field4317++;
        if ((this.field4312--) == 0) {
            this.method2031((byte) -128);
            this.field4312 = 255;
        }
        return this.field4304[this.field4312];
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)V", line = 158)
    private final void method2035(byte arg0) {
        field4320++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        if (arg0 > -85) {
            return;
        }
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
            int var70 = var65 + var68;
            int var71 = var3 + var6;
            var5 = var70 ^ var68 << 10;
            int var72 = var68 + var71;
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
            int var37 = this.field4304[var11 + 1] + var8;
            int var38 = this.field4304[var11 + 2] + var7;
            int var39 = this.field4304[var11] + var9;
            int var40 = this.field4304[var11 + 3] + var6;
            int var41 = this.field4304[var11 + 5] + var4;
            int var42 = this.field4304[var11 + 6] + var3;
            int var43 = this.field4304[var11 + 7] + var2;
            int var44 = this.field4304[var11 + 4] + var5;
            int var45 = var39 ^ var37 << 11;
            int var46 = var37 + var38;
            int var47 = var40 + var45;
            int var48 = var46 ^ var38 >>> 2;
            int var49 = var38 + var47;
            int var50 = var44 + var48;
            int var51 = var49 ^ var47 << 8;
            int var52 = var41 + var51;
            int var53 = var47 + var50;
            var6 = var53 ^ var50 >>> 16;
            int var54 = var6 + var42;
            int var55 = var50 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var52 + var54;
            int var57 = var5 + var43;
            var4 = var56 ^ var54 >>> 4;
            int var58 = var4 + var45;
            int var59 = var54 + var57;
            var3 = var59 ^ var57 << 8;
            int var60 = var57 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field4308[var11] = var9;
            this.field4308[var11 + 1] = var8;
            this.field4308[var11 + 2] = var7;
            this.field4308[var11 + 3] = var6;
            this.field4308[var11 + 4] = var5;
            this.field4308[var11 + 5] = var4;
            this.field4308[var11 + 6] = var3;
            this.field4308[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field4308[var12 + 7] + var2;
            int var14 = this.field4308[var12 + 3] + var6;
            int var15 = this.field4308[var12 + 4] + var5;
            int var16 = this.field4308[var12 + 2] + var7;
            int var17 = this.field4308[var12 + 1] + var8;
            int var18 = this.field4308[var12 + 5] + var4;
            int var19 = this.field4308[var12 + 6] + var3;
            int var20 = this.field4308[var12] + var9;
            int var21 = var20 ^ var17 << 11;
            int var22 = var16 + var17;
            int var23 = var14 + var21;
            int var24 = var22 ^ var16 >>> 2;
            int var25 = var15 + var24;
            int var26 = var16 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var23 + var25;
            int var29 = var18 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var6 + var19;
            int var31 = var25 + var29;
            var5 = var31 ^ var29 << 10;
            int var32 = var29 + var30;
            int var33 = var5 + var13;
            var4 = var32 ^ var30 >>> 4;
            int var34 = var4 + var21;
            int var35 = var30 + var33;
            var3 = var35 ^ var33 << 8;
            var8 = var3 + var24;
            int var36 = var33 + var34;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field4308[var12] = var9;
            this.field4308[var12 + 1] = var8;
            this.field4308[var12 + 2] = var7;
            this.field4308[var12 + 3] = var6;
            this.field4308[var12 + 4] = var5;
            this.field4308[var12 + 5] = var4;
            this.field4308[var12 + 6] = var3;
            this.field4308[var12 + 7] = var2;
        }
        this.method2031((byte) -127);
        this.field4312 = 256;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V", line = 316)
    private class289() {
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "([I)V", line = 327)
    public class289(int[] arg0) {
        this.field4304 = new int[256];
        this.field4308 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field4304[var2] = arg0[var2];
        }
        this.method2035((byte) -124);
    }
}
