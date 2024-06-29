import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class134 {

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "[I")
    private int[] field2062;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "[I")
    private int[] field2061;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field2063 = -1;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "Lpm;")
    public static class349 field2066;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    private int field2058;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    private int field2060;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    private int field2064;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    private int field2065;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field2067;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method1029(String arg0, byte arg1) {
        field2054++;
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        if (arg1 < 31) {
            return null;
        }
        int var3 = arg0.length();
        while (var3 > var2 && class125.method749(arg0.charAt(var2), 28450)) {
            var2++;
        }
        while (var3 > var2 && class125.method749(arg0.charAt(var3 - 1), 28450)) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg0.charAt(var6);
            if (class436.method2724(var7, false)) {
                char var8 = class266.method1819((byte) -76, var7);
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

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)I")
    public final int method1030(int arg0) {
        field2057++;
        if (arg0 != -13275) {
            this.field2060 = -42;
        }
        if ((this.field2064--) == 0) {
            this.method1035(-111);
            this.field2064 = 255;
        }
        return this.field2062[this.field2064];
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
    private final void method1031(int arg0) {
        field2053++;
        if (arg0 != 423684680) {
            this.method1031(-85);
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
            int var70 = var3 + var6;
            int var71 = var66 + var69;
            var5 = var71 ^ var69 << 10;
            int var72 = var69 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var70 + var73;
            int var75 = var4 + var61;
            var3 = var74 ^ var73 << 8;
            int var76 = var73 + var75;
            var8 = var3 + var64;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field2062[var11 + 7] + var2;
            int var38 = this.field2062[var11 + 3] + var6;
            int var39 = this.field2062[var11 + 6] + var3;
            int var40 = this.field2062[var11 + 4] + var5;
            int var41 = this.field2062[var11 + 1] + var8;
            int var42 = this.field2062[var11 + 2] + var7;
            int var43 = this.field2062[var11] + var9;
            int var44 = this.field2062[var11 + 5] + var4;
            int var45 = var43 ^ var41 << 11;
            int var46 = var41 + var42;
            int var47 = var38 + var45;
            int var48 = var46 ^ var42 >>> 2;
            int var49 = var42 + var47;
            int var50 = var40 + var48;
            int var51 = var49 ^ var47 << 8;
            int var52 = var47 + var50;
            int var53 = var44 + var51;
            var6 = var52 ^ var50 >>> 16;
            int var54 = var6 + var39;
            int var55 = var50 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var5 + var37;
            int var57 = var53 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var4 + var45;
            int var59 = var54 + var56;
            var3 = var59 ^ var56 << 8;
            var8 = var3 + var48;
            int var60 = var56 + var58;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field2061[var11] = var9;
            this.field2061[var11 + 1] = var8;
            this.field2061[var11 + 2] = var7;
            this.field2061[var11 + 3] = var6;
            this.field2061[var11 + 4] = var5;
            this.field2061[var11 + 5] = var4;
            this.field2061[var11 + 6] = var3;
            this.field2061[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2061[var12 + 1] + var8;
            int var14 = this.field2061[var12 + 3] + var6;
            int var15 = this.field2061[var12 + 6] + var3;
            int var16 = this.field2061[var12 + 7] + var2;
            int var17 = this.field2061[var12 + 2] + var7;
            int var18 = this.field2061[var12 + 4] + var5;
            int var19 = this.field2061[var12] + var9;
            int var20 = this.field2061[var12 + 5] + var4;
            int var21 = var19 ^ var13 << 11;
            int var22 = var14 + var21;
            int var23 = var13 + var17;
            int var24 = var23 ^ var17 >>> 2;
            int var25 = var18 + var24;
            int var26 = var17 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var22 + var25;
            int var29 = var20 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var6 + var15;
            int var31 = var25 + var29;
            var5 = var31 ^ var29 << 10;
            int var32 = var29 + var30;
            int var33 = var5 + var16;
            var4 = var32 ^ var30 >>> 4;
            int var34 = var30 + var33;
            int var35 = var4 + var21;
            var3 = var34 ^ var33 << 8;
            var8 = var3 + var24;
            int var36 = var33 + var35;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var27;
            this.field2061[var12] = var9;
            this.field2061[var12 + 1] = var8;
            this.field2061[var12 + 2] = var7;
            this.field2061[var12 + 3] = var6;
            this.field2061[var12 + 4] = var5;
            this.field2061[var12 + 5] = var4;
            this.field2061[var12 + 6] = var3;
            this.field2061[var12 + 7] = var2;
        }
        this.method1035(-98);
        this.field2064 = 256;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBI)V")
    public static final void method1032(int arg0, byte arg1, int arg2) {
        int var3 = class131.field1914 * arg2 >> 8;
        int var4 = 44 % ((arg1 + 40) / 39);
        field2055++;
        if (arg0 == -1 && !class96.field1223) {
            class369.method2366(-13);
        } else if (arg0 != -1 && (class30.field367 != arg0 || !class267.method1827(124)) && var3 != 0 && !class96.field1223) {
            class239.method1629((byte) 0, class72.field942, 2, 0, var3, false, arg0);
        }
        class30.field367 = arg0;
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
    public static void method1033(int arg0) {
        field2067 = null;
        field2066 = null;
        if (arg0 != 128) {
            method1034((byte) 125, -57, false);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BIZ)Ljava/lang/String;")
    public static final String method1034(byte arg0, int arg1, boolean arg2) {
        field2056++;
        if (arg0 < 6) {
            return null;
        } else if (arg2 && arg1 >= 0) {
            return class58.method380(10, arg2, arg1, (byte) -101);
        } else {
            return Integer.toString(arg1);
        }
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
    private final void method1035(int arg0) {
        field2059++;
        this.field2058 += ++this.field2065;
        if (arg0 >= -44) {
            this.method1030(29);
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2061[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2060 ^= this.field2060 << 13;
                } else {
                    this.field2060 ^= this.field2060 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2060 ^= this.field2060 << 2;
            } else {
                this.field2060 ^= this.field2060 >>> 16;
            }
            this.field2060 += this.field2061[var2 + 128 & 0xFF];
            int var4;
            this.field2061[var2] = var4 = this.field2058 + this.field2060 + this.field2061[class209.method1483(var3, 1020) >> 2];
            this.field2062[var2] = this.field2058 = this.field2061[class209.method1483(261175, var4) >> 8 >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
    private class134() {
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "([I)V")
    public class134(int[] arg0) {
        this.field2062 = new int[256];
        this.field2061 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2062[var2] = arg0[var2];
        }
        this.method1031(423684680);
    }

    static {
        new class349("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
        field2066 = new class349("Discard", "Ablegen", "Jeter", "Descartar");
    }
}
