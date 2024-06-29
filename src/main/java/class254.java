import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class254 {

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "[I")
    private int[] field4114;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "[I")
    private int[] field4116;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field4115 = 0;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    private int field4106;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    private int field4111;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
    private int field4117;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    private int field4120;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    private final void method1708(int arg0) {
        field4119++;
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
            int var68 = var4 + var67;
            int var69 = var62 + var66;
            var6 = var69 ^ var66 >>> 16;
            int var70 = var3 + var6;
            int var71 = var66 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var2 + var5;
            int var73 = var68 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var70 + var72;
            int var75 = var4 + var61;
            var3 = var74 ^ var72 << 8;
            int var76 = var72 + var75;
            var8 = var3 + var64;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field4114[var11 + 2] + var7;
            int var38 = this.field4114[var11 + 5] + var4;
            int var39 = this.field4114[var11 + 4] + var5;
            int var40 = this.field4114[var11 + 3] + var6;
            int var41 = this.field4114[var11] + var9;
            int var42 = this.field4114[var11 + 7] + var2;
            int var43 = this.field4114[var11 + 1] + var8;
            int var44 = this.field4114[var11 + 6] + var3;
            int var45 = var41 ^ var43 << 11;
            int var46 = var37 + var43;
            int var47 = var40 + var45;
            int var48 = var46 ^ var37 >>> 2;
            int var49 = var37 + var47;
            int var50 = var39 + var48;
            int var51 = var49 ^ var47 << 8;
            int var52 = var47 + var50;
            var6 = var52 ^ var50 >>> 16;
            int var53 = var38 + var51;
            int var54 = var6 + var44;
            int var55 = var50 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var53 + var54;
            var4 = var56 ^ var54 >>> 4;
            int var57 = var5 + var42;
            int var58 = var54 + var57;
            var3 = var58 ^ var57 << 8;
            int var59 = var4 + var45;
            int var60 = var57 + var59;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var8 = var3 + var48;
            var9 = var8 + var59;
            this.field4116[var11] = var9;
            this.field4116[var11 + 1] = var8;
            this.field4116[var11 + 2] = var7;
            this.field4116[var11 + 3] = var6;
            this.field4116[var11 + 4] = var5;
            this.field4116[var11 + 5] = var4;
            this.field4116[var11 + 6] = var3;
            this.field4116[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field4116[var12 + 3] + var6;
            int var14 = this.field4116[var12 + 2] + var7;
            int var15 = this.field4116[var12 + 7] + var2;
            int var16 = this.field4116[var12 + 5] + var4;
            int var17 = this.field4116[var12 + 1] + var8;
            int var18 = this.field4116[var12] + var9;
            int var19 = this.field4116[var12 + 4] + var5;
            int var20 = var18 ^ var17 << 11;
            int var21 = this.field4116[var12 + 6] + var3;
            int var22 = var13 + var20;
            int var23 = var14 + var17;
            int var24 = var23 ^ var14 >>> 2;
            int var25 = var19 + var24;
            int var26 = var14 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var22 + var25;
            int var29 = var16 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var25 + var29;
            int var31 = var6 + var21;
            var5 = var30 ^ var29 << 10;
            int var32 = var5 + var15;
            int var33 = var29 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var31 + var32;
            int var35 = var4 + var20;
            var3 = var34 ^ var32 << 8;
            int var36 = var32 + var35;
            var8 = var3 + var24;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var27;
            this.field4116[var12] = var9;
            this.field4116[var12 + 1] = var8;
            this.field4116[var12 + 2] = var7;
            this.field4116[var12 + 3] = var6;
            this.field4116[var12 + 4] = var5;
            this.field4116[var12 + 5] = var4;
            this.field4116[var12 + 6] = var3;
            this.field4116[var12 + 7] = var2;
        }
        this.method1712(255);
        if (arg0 != -8021) {
            this.field4114 = null;
        }
        this.field4111 = 256;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)I")
    public final int method1709(int arg0) {
        if ((this.field4111--) == 0) {
            this.method1712(255);
            this.field4111 = 255;
        }
        if (arg0 == 255) {
            field4109++;
            return this.field4114[this.field4111];
        } else {
            return -126;
        }
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V")
    public static final void method1710(int arg0) {
        field4112++;
        if (arg0 != 0) {
            field4115 = -128;
        }
        if (!class26.method227(10920) && class276.field4398 != class104.field1610) {
            class23.method162(class138.field2043, false, class276.field4398, class179.field2794, class149.field2227.field1257[0], class149.field2227.field1272[0], (byte) -123);
        } else if (class55.field758 != class276.field4398 && class261.method1791(class276.field4398, 64)) {
            class55.field758 = class276.field4398;
            class199.method1376(false);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZ)Lti;")
    public static final class5 method1711(int arg0, boolean arg1) {
        class5 var2 = (class5) class79.field1136.method1428((long) arg0, (byte) -60);
        field4108++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class124.field1855.method807((byte) 85, arg0, 16);
        class5 var4 = new class5();
        if (arg1) {
            return null;
        }
        if (var3 != null) {
            var4.method27((byte) 56, new class25(var3));
        }
        class79.field1136.method1424((long) arg0, var4, -2003648287);
        return var4;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
    private class254() {
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)V")
    private final void method1712(int arg0) {
        if (arg0 != 255) {
            return;
        }
        field4113++;
        this.field4120 += ++this.field4106;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field4116[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field4117 ^= this.field4117 << 13;
                } else {
                    this.field4117 ^= this.field4117 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field4117 ^= this.field4117 << 2;
            } else {
                this.field4117 ^= this.field4117 >>> 16;
            }
            this.field4117 += this.field4116[var2 + 128 & 0xFF];
            int var4;
            this.field4116[var2] = var4 = this.field4117 + this.field4116[class224.method1526(1020, var3) >> 2] + this.field4120;
            this.field4114[var2] = this.field4120 = var3 + this.field4116[class224.method1526(255, var4 >> 8 >> 2)];
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IC)Z")
    public static final boolean method1713(int arg0, char arg1) {
        field4118++;
        if (arg0 > -52) {
            return false;
        } else if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else {
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILof;)V")
    public static final void method1714(int arg0, class267 arg1) {
        arg1.field4279 = false;
        field4121++;
        if (arg1.field4278 != null) {
            arg1.field4278.field293 = 0;
        }
        for (class267 var2 = arg1.method713(); var2 != null; var2 = arg1.method717()) {
            method1714(-111, var2);
        }
        int var3 = 57 / ((-arg0 - 31) / 56);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)Z")
    public static final boolean method1715(int arg0, int arg1) {
        field4107++;
        if (arg0 != 27849) {
            field4115 = 94;
        }
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "([I)V")
    public class254(int[] arg0) {
        this.field4114 = new int[256];
        this.field4116 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field4114[var2] = arg0[var2];
        }
        this.method1708(-8021);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V")
    public static final void method1716(boolean arg0) {
        for (class190 var1 = (class190) class205.field3207.method350(8240); var1 != null; var1 = (class190) class205.field3207.method353((byte) -115)) {
            if (var1.field2995) {
                var1.method1332((byte) -124);
            }
        }
        if (arg0) {
            field4115 = -37;
        }
        for (class190 var2 = (class190) class54.field743.method350(8240); var2 != null; var2 = (class190) class54.field743.method353((byte) -126)) {
            if (var2.field2995) {
                var2.method1332((byte) -48);
            }
        }
        field4110++;
    }
}
