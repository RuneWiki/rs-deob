import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class302 {

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "[I")
    private int[] field3981;

    @OriginalMember(owner = "client!rp", name = "n", descriptor = "[I")
    private int[] field3993;

    @OriginalMember(owner = "client!rp", name = "p", descriptor = "Lao;")
    public static class191 field3995 = new class191(77, 0);

    @OriginalMember(owner = "client!rp", name = "r", descriptor = "Ljc;")
    public static class305 field3997 = new class305("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!rp", name = "s", descriptor = "Ljc;")
    public static class305 field3998 = new class305("wave2:", "welle2:", "ondulation2:", "onda2:");

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
    private int field3982;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
    private int field3985;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!rp", name = "i", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!rp", name = "j", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!rp", name = "k", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!rp", name = "l", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!rp", name = "m", descriptor = "I")
    private int field3992;

    @OriginalMember(owner = "client!rp", name = "o", descriptor = "I")
    private int field3994;

    @OriginalMember(owner = "client!rp", name = "t", descriptor = "[I")
    public static int[] field3999;

    @OriginalMember(owner = "client!rp", name = "q", descriptor = "[Lo;")
    public static class24[] field3996;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)I", line = 5)
    public final int method1798(int arg0) {
        if (arg0 != 256) {
            this.method1805(100);
        }
        field3991++;
        if (this.field3994 == 0) {
            this.method1805(111);
            this.field3994 = 256;
        }
        return this.field3981[--this.field3994];
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)I", line = 22)
    public final int method1799(byte arg0) {
        if (arg0 < 118) {
            method1803(-36, 117);
        }
        field3989++;
        if (this.field3994 == 0) {
            this.method1805(92);
            this.field3994 = 256;
        }
        return this.field3981[this.field3994 - 1];
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(B)V", line = 41)
    public static void method1800(byte arg0) {
        field3996 = null;
        field3999 = null;
        field3995 = null;
        field3998 = null;
        field3997 = null;
        if (arg0 != -26) {
            field3999 = null;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(BII)Z", line = 56)
    public static final boolean method1801(byte arg0, int arg1, int arg2) {
        if (arg0 != 22) {
            method1801((byte) 40, 80, -74);
        }
        field3984++;
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(III)Z", line = 70)
    public static final boolean method1802(int arg0, int arg1, int arg2) {
        field3987++;
        if (arg1 >= -63) {
            method1802(-69, 119, 68);
        }
        return (arg2 & 0x40000) != 0 | class481.method2938(-2639, arg0, arg2) || class371.method2198(arg2, arg0, 45056);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)Z", line = 82)
    public static final boolean method1803(int arg0, int arg1) {
        field3986++;
        if (arg0 > -108) {
            method1806(-49, -30, 85, 17, 23, 88, 7, 117, 21, 59);
        }
        return arg1 >= 4 && arg1 <= 8;
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)V", line = 99)
    private final void method1804(int arg0) {
        field3980++;
        if (arg0 <= 105) {
            this.method1799((byte) -74);
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
            int var68 = var4 + var67;
            int var69 = var62 + var66;
            var6 = var69 ^ var66 >>> 16;
            int var70 = var66 + var68;
            int var71 = var3 + var6;
            var5 = var70 ^ var68 << 10;
            int var72 = var68 + var71;
            int var73 = var2 + var5;
            var4 = var72 ^ var71 >>> 4;
            int var74 = var71 + var73;
            int var75 = var4 + var61;
            var3 = var74 ^ var73 << 8;
            var8 = var3 + var64;
            int var76 = var73 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field3981[var11 + 4] + var5;
            int var38 = this.field3981[var11 + 6] + var3;
            int var39 = this.field3981[var11] + var9;
            int var40 = this.field3981[var11 + 1] + var8;
            int var41 = this.field3981[var11 + 7] + var2;
            int var42 = this.field3981[var11 + 5] + var4;
            int var43 = this.field3981[var11 + 2] + var7;
            int var44 = this.field3981[var11 + 3] + var6;
            int var45 = var39 ^ var40 << 11;
            int var46 = var44 + var45;
            int var47 = var40 + var43;
            int var48 = var47 ^ var43 >>> 2;
            int var49 = var37 + var48;
            int var50 = var43 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var46 + var49;
            int var53 = var42 + var51;
            var6 = var52 ^ var49 >>> 16;
            int var54 = var6 + var38;
            int var55 = var49 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var5 + var41;
            int var57 = var53 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var4 + var45;
            int var59 = var54 + var56;
            var3 = var59 ^ var56 << 8;
            var8 = var3 + var48;
            int var60 = var56 + var58;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            var7 = var2 + var51;
            this.field3993[var11] = var9;
            this.field3993[var11 + 1] = var8;
            this.field3993[var11 + 2] = var7;
            this.field3993[var11 + 3] = var6;
            this.field3993[var11 + 4] = var5;
            this.field3993[var11 + 5] = var4;
            this.field3993[var11 + 6] = var3;
            this.field3993[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field3993[var12] + var9;
            int var14 = this.field3993[var12 + 6] + var3;
            int var15 = this.field3993[var12 + 3] + var6;
            int var16 = this.field3993[var12 + 7] + var2;
            int var17 = this.field3993[var12 + 5] + var4;
            int var18 = this.field3993[var12 + 1] + var8;
            int var19 = this.field3993[var12 + 2] + var7;
            int var20 = this.field3993[var12 + 4] + var5;
            int var21 = var13 ^ var18 << 11;
            int var22 = var18 + var19;
            int var23 = var15 + var21;
            int var24 = var22 ^ var19 >>> 2;
            int var25 = var19 + var23;
            int var26 = var20 + var24;
            int var27 = var25 ^ var23 << 8;
            int var28 = var23 + var26;
            int var29 = var17 + var27;
            var6 = var28 ^ var26 >>> 16;
            int var30 = var26 + var29;
            int var31 = var6 + var14;
            var5 = var30 ^ var29 << 10;
            int var32 = var29 + var31;
            int var33 = var5 + var16;
            var4 = var32 ^ var31 >>> 4;
            int var34 = var31 + var33;
            int var35 = var4 + var21;
            var3 = var34 ^ var33 << 8;
            var8 = var3 + var24;
            int var36 = var33 + var35;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var27;
            this.field3993[var12] = var9;
            this.field3993[var12 + 1] = var8;
            this.field3993[var12 + 2] = var7;
            this.field3993[var12 + 3] = var6;
            this.field3993[var12 + 4] = var5;
            this.field3993[var12 + 5] = var4;
            this.field3993[var12 + 6] = var3;
            this.field3993[var12 + 7] = var2;
        }
        this.method1805(125);
        this.field3994 = 256;
    }

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "(I)V", line = 248)
    private final void method1805(int arg0) {
        int var2 = 39 / ((46 - arg0) / 43);
        field3983++;
        this.field3992 += ++this.field3985;
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = this.field3993[var3];
            if ((var3 & 0x2) == 0) {
                if ((var3 & 0x1) == 0) {
                    this.field3982 ^= this.field3982 << 13;
                } else {
                    this.field3982 ^= this.field3982 >>> 6;
                }
            } else if ((var3 & 0x1) == 0) {
                this.field3982 ^= this.field3982 << 2;
            } else {
                this.field3982 ^= this.field3982 >>> 16;
            }
            this.field3982 += this.field3993[var3 + 128 & 0xFF];
            int var5;
            this.field3993[var3] = var5 = this.field3993[class95.method534(var4 >> 2, 255)] - (-this.field3992 - this.field3982);
            this.field3981[var3] = this.field3992 = var4 + this.field3993[class95.method534(var5 >> 8 >> 2, 255)];
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIIIIIII)V", line = 290)
    public static final void method1806(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3988++;
        if (!class372.method2199(-41, arg7)) {
            return;
        }
        if (arg5 != 20707) {
            method1801((byte) -23, -24, 58);
        }
        if (class363.field4969[arg7] == null) {
            client.method1257(class339.field4491[arg7], -1, arg3, arg9, arg0, arg1, arg6, arg4, arg8, arg2);
        } else {
            client.method1257(class363.field4969[arg7], -1, arg3, arg9, arg0, arg1, arg6, arg4, arg8, arg2);
        }
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "()V", line = 311)
    private class302() {
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "([I)V", line = 313)
    public class302(int[] arg0) {
        this.field3981 = new int[256];
        this.field3993 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3981[var2] = arg0[var2];
        }
        this.method1804(116);
    }
}
