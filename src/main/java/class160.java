import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class160 {

    @OriginalMember(owner = "client!qh", name = "C", descriptor = "[I")
    private int[] field3269 = new int[256];

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "[I")
    private int[] field3250 = new int[256];

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "Ldd;")
    public static class35 field3243 = class180.method1196((byte) -38, "(U3");

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "Ldd;")
    public static class35 field3245 = class180.method1196((byte) 127, "; Max)2Age=");

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "Ldd;")
    public static class35 field3249 = class180.method1196((byte) -14, " <col=00ff80>");

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "I")
    public static int field3260 = 50;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "[I")
    public static int[] field3241 = new int[field3260];

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "[I")
    public static int[] field3248 = new int[field3260];

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "[I")
    public static int[] field3265 = new int[field3260];

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "[Ldd;")
    public static class35[] field3261 = new class35[field3260];

    @OriginalMember(owner = "client!qh", name = "B", descriptor = "[I")
    public static int[] field3268 = new int[field3260];

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "[I")
    public static int[] field3244 = new int[field3260];

    @OriginalMember(owner = "client!qh", name = "A", descriptor = "[I")
    public static int[] field3267 = new int[field3260];

    @OriginalMember(owner = "client!qh", name = "E", descriptor = "Ldd;")
    public static class35 field3271 = class180.method1196((byte) -11, "Sprites geladen)3");

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "[I")
    public static int[] field3262 = new int[field3260];

    @OriginalMember(owner = "client!qh", name = "D", descriptor = "I")
    public static int field3270 = 0;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "Ldd;")
    private static class35 field3242 = class180.method1196((byte) -32, "green:");

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "Ldd;")
    public static class35 field3258 = field3242;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "Ldd;")
    public static class35 field3251 = field3242;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    private int field3252;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
    private int field3256;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "I")
    private int field3263;

    @OriginalMember(owner = "client!qh", name = "x", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "I")
    private int field3266;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III[BII[Ld;III)V")
    public static final void method1062(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, class31[] arg6, int arg7, int arg8, int arg9) {
        int var10 = -1;
        field3257++;
        if (arg7 != 16311) {
            method1070((byte) -108, -106);
        }
        class26 var11 = new class26(arg3);
        while (true) {
            int var12 = var11.method259((byte) -127);
            if (var12 == 0) {
                return;
            }
            int var13 = 0;
            var10 += var12;
            while (true) {
                int var14 = var11.method259((byte) -110);
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 >> 6 & 0x3F;
                int var16 = var13 & 0x3F;
                int var17 = var11.method221(arg7 - 16439);
                int var18 = var17 >> 2;
                int var19 = var13 >> 12;
                int var20 = var17 & 0x3;
                if (arg9 == var19 && var15 >= arg2 && arg2 + 8 > var15 && arg0 <= var16 && var16 < arg0 + 8) {
                    class145 var21 = class4.method23((byte) 121, var10);
                    int var22 = arg4 + class208.method1373(arg5, 7, var21.field3017, var15 & 0x7, var20, var21.field3034, var16 & 0x7);
                    int var23 = arg1 + class136.method930(var21.field3017, var20, var21.field3034, 0, arg5, var15 & 0x7, var16 & 0x7);
                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                        int var24 = arg8;
                        if ((class40.field894[1][var22][var23] & 0x2) == 2) {
                            var24 = arg8 - 1;
                        }
                        class31 var25 = null;
                        if (var24 >= 0) {
                            var25 = arg6[var24];
                        }
                        class98.method744(123, var18, arg5 + var20 & 0x3, var25, var22, var10, var23, arg8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIBLjava/awt/Component;)Ls;")
    public static final class170 method1063(int arg0, int arg1, byte arg2, Component arg3) {
        field3259++;
        try {
            Class var4 = Class.forName("wf");
            class170 var5 = (class170) var4.getDeclaredConstructor().newInstance();
            if (arg2 == 127) {
                var5.method360(arg3, arg0, arg1, (byte) -31);
                return var5;
            } else {
                return null;
            }
        } catch (Throwable var7) {
            class36 var6 = new class36();
            var6.method360(arg3, arg0, arg1, (byte) -31);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V")
    public static void method1064(byte arg0) {
        field3249 = null;
        field3245 = null;
        field3248 = null;
        field3265 = null;
        field3241 = null;
        field3242 = null;
        field3268 = null;
        field3251 = null;
        if (arg0 <= 63) {
            field3260 = 123;
        }
        field3262 = null;
        field3261 = null;
        field3258 = null;
        field3243 = null;
        field3271 = null;
        field3244 = null;
        field3267 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V")
    private final void method1065(boolean arg0) {
        if (arg0) {
            return;
        }
        field3255++;
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
            int var66 = var65 ^ var62 << 8;
            int var67 = var4 + var66;
            int var68 = var5 + var64;
            int var69 = var62 + var68;
            var6 = var69 ^ var68 >>> 16;
            int var70 = var67 + var68;
            int var71 = var3 + var6;
            var5 = var70 ^ var67 << 10;
            int var72 = var67 + var71;
            var4 = var72 ^ var71 >>> 4;
            int var73 = var4 + var61;
            int var74 = var2 + var5;
            int var75 = var71 + var74;
            var3 = var75 ^ var74 << 8;
            var8 = var3 + var64;
            int var76 = var73 + var74;
            var2 = var76 ^ var73 >>> 9;
            var7 = var2 + var66;
            var9 = var8 + var73;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field3269[var11 + 1] + var8;
            int var38 = this.field3269[var11 + 6] + var3;
            int var39 = this.field3269[var11 + 5] + var4;
            int var40 = this.field3269[var11 + 4] + var5;
            int var41 = this.field3269[var11 + 7] + var2;
            int var42 = this.field3269[var11 + 3] + var6;
            int var43 = this.field3269[var11 + 2] + var7;
            int var44 = this.field3269[var11] + var9;
            int var45 = var44 ^ var37 << 11;
            int var46 = var37 + var43;
            int var47 = var46 ^ var43 >>> 2;
            int var48 = var40 + var47;
            int var49 = var42 + var45;
            int var50 = var43 + var49;
            int var51 = var50 ^ var49 << 8;
            int var52 = var48 + var49;
            int var53 = var39 + var51;
            var6 = var52 ^ var48 >>> 16;
            int var54 = var6 + var38;
            int var55 = var48 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var53 + var54;
            var4 = var56 ^ var54 >>> 4;
            int var57 = var5 + var41;
            int var58 = var54 + var57;
            int var59 = var4 + var45;
            var3 = var58 ^ var57 << 8;
            var8 = var3 + var47;
            int var60 = var57 + var59;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var59;
            this.field3250[var11] = var9;
            this.field3250[var11 + 1] = var8;
            this.field3250[var11 + 2] = var7;
            this.field3250[var11 + 3] = var6;
            this.field3250[var11 + 4] = var5;
            this.field3250[var11 + 5] = var4;
            this.field3250[var11 + 6] = var3;
            this.field3250[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field3250[var12 + 1] + var8;
            int var14 = this.field3250[var12] + var9;
            int var15 = this.field3250[var12 + 7] + var2;
            int var16 = this.field3250[var12 + 4] + var5;
            int var17 = this.field3250[var12 + 3] + var6;
            int var18 = this.field3250[var12 + 2] + var7;
            int var19 = var14 ^ var13 << 11;
            int var20 = this.field3250[var12 + 6] + var3;
            int var21 = var17 + var19;
            int var22 = this.field3250[var12 + 5] + var4;
            int var23 = var13 + var18;
            int var24 = var23 ^ var18 >>> 2;
            int var25 = var18 + var21;
            int var26 = var16 + var24;
            int var27 = var25 ^ var21 << 8;
            int var28 = var22 + var27;
            int var29 = var21 + var26;
            var6 = var29 ^ var26 >>> 16;
            int var30 = var26 + var28;
            var5 = var30 ^ var28 << 10;
            int var31 = var5 + var15;
            int var32 = var6 + var20;
            int var33 = var28 + var32;
            var4 = var33 ^ var32 >>> 4;
            int var34 = var31 + var32;
            var3 = var34 ^ var31 << 8;
            int var35 = var4 + var19;
            int var36 = var31 + var35;
            var8 = var3 + var24;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var27;
            this.field3250[var12] = var9;
            this.field3250[var12 + 1] = var8;
            this.field3250[var12 + 2] = var7;
            this.field3250[var12 + 3] = var6;
            this.field3250[var12 + 4] = var5;
            this.field3250[var12 + 5] = var4;
            this.field3250[var12 + 6] = var3;
            this.field3250[var12 + 7] = var2;
        }
        this.method1068(125);
        this.field3266 = 256;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIII)V")
    public static final void method1066(int arg0, int arg1, int arg2, int arg3) {
        class54 var4 = class191.field3853[arg0][arg1][arg2];
        if (var4 != null) {
            class191.field3853[arg0][arg1][arg2].field1213 = arg3;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIB)I")
    public static final int method1067(int arg0, int arg1, byte arg2) {
        field3264++;
        if (arg2 > -2) {
            method1066(2, 60, -21, 123);
        }
        int var3 = 0;
        while (arg0 > 0) {
            var3 = arg1 & 0x1 | var3 << 1;
            arg0--;
            arg1 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    private final void method1068(int arg0) {
        field3247++;
        this.field3256 += ++this.field3252;
        if (arg0 <= 44) {
            return;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field3250[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field3263 ^= this.field3263 << 13;
                } else {
                    this.field3263 ^= this.field3263 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field3263 ^= this.field3263 << 2;
            } else {
                this.field3263 ^= this.field3263 >>> 16;
            }
            this.field3263 += this.field3250[var2 + 128 & 0xFF];
            int var4;
            this.field3250[var2] = var4 = this.field3256 + this.field3250[class208.method1372(var3 >> 2, 255)] + this.field3263;
            this.field3269[var2] = this.field3256 = this.field3250[class208.method1372(var4 >> 8 >> 2, 255)] + var3;
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)I")
    public final int method1069(int arg0) {
        if (arg0 != -31078) {
            this.method1069(69);
        }
        field3254++;
        if (this.field3266-- == 0) {
            this.method1068(arg0 + 31204);
            this.field3266 = 255;
        }
        return this.field3269[this.field3266];
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "([I)V")
    public class160(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3269[var2] = arg0[var2];
        }
        this.method1065(false);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BI)Lfa;")
    public static final class52 method1070(byte arg0, int arg1) {
        field3253++;
        if (arg0 > -12) {
            method1067(-104, -127, (byte) -29);
        }
        class52 var2 = (class52) class29.field593.method817(true, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class48.field1058.method39(12, -1, arg1);
        class52 var4 = new class52();
        if (var3 != null) {
            var4.method461(-8629, new class26(var3));
        }
        var4.method467((byte) -23);
        class29.field593.method816(var4, (long) arg1, 16);
        return var4;
    }
}
