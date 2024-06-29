import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class121 {

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "[I")
    private int[] field2979 = new int[256];

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "[I")
    private int[] field2982 = new int[256];

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "Lke;")
    public static class65 field2966 = class1.method17("backright2", -117);

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "Lke;")
    public static class65 field2971 = class1.method17("scape main", -124);

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "Lke;")
    public static class65 field2976 = class1.method17("Lade Texturen )2 ", -115);

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "J")
    public static long field2972 = 0L;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "Lke;")
    public static class65 field2967 = class1.method17("null", -117);

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "Lke;")
    private static class65 field2983 = class1.method17("skill)2", -117);

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "Lke;")
    public static class65 field2970 = field2983;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "Lie;")
    public static class53 field2973 = new class53();

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "Lke;")
    public static class65 field2984 = class1.method17(":tradereq:", -123);

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "[Lke;")
    public static class65[] field2986 = new class65[5];

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "Lke;")
    public static class65 field2987 = class1.method17(" )2> @whi@", -123);

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    private int field2963;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    private int field2975;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    private int field2980;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
    private int field2981;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "Ljd;")
    public static class58 field2985;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)I", line = 9)
    public final int method967(int arg0) {
        field2965++;
        if (arg0 == ~this.field2980--) {
            this.method968(arg0 - 120);
            this.field2980 = 255;
        }
        return this.field2982[this.field2980];
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V", line = 35)
    private final void method968(int arg0) {
        if (arg0 >= -23) {
            return;
        }
        field2964++;
        this.field2975 += ++this.field2963;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2979[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2981 ^= this.field2981 << 13;
                } else {
                    this.field2981 ^= this.field2981 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2981 ^= this.field2981 << 2;
            } else {
                this.field2981 ^= this.field2981 >>> 16;
            }
            this.field2981 += this.field2979[var2 + 128 & 0xFF];
            int var4;
            this.field2979[var2] = var4 = this.field2981 + this.field2979[class114.method934(var3 >> 2, 255)] + this.field2975;
            this.field2982[var2] = this.field2975 = var3 + this.field2979[class114.method934(var4 >> 8 >> 2, 255)];
        }
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V", line = 77)
    public static final void method969(int arg0) {
        field2962++;
        class64.field1674.method834(5875);
        if (arg0 != 286896358) {
            method974((byte) 62);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)V", line = 100)
    public static final void method970(int arg0, byte arg1) {
        field2978++;
        if (arg0 == -1 || !class104.field2692[arg0]) {
            return;
        }
        class77.field2049.method472(arg0, (byte) -82);
        if (class88.field2361[arg0] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class88.field2361[arg0].length; var3++) {
            if (class88.field2361[arg0][var3] != null) {
                if (class88.field2361[arg0][var3].field671 == 2) {
                    var2 = false;
                } else {
                    class88.field2361[arg0][var3] = null;
                }
            }
        }
        if (arg1 != -75) {
            method970(-54, (byte) -98);
        }
        if (var2) {
            class88.field2361[arg0] = null;
        }
        class104.field2692[arg0] = false;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V", line = 147)
    private final void method971(byte arg0) {
        field2969++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        int var10 = 101 % ((arg0 - 7) / 32);
        for (int var11 = 0; var11 < 4; var11++) {
            int var62 = var9 ^ var8 << 11;
            int var63 = var6 + var62;
            int var64 = var7 + var8;
            int var65 = var64 ^ var7 >>> 2;
            int var66 = var7 + var63;
            int var67 = var66 ^ var63 << 8;
            int var68 = var5 + var65;
            int var69 = var63 + var68;
            int var70 = var4 + var67;
            var6 = var69 ^ var68 >>> 16;
            int var71 = var68 + var70;
            int var72 = var3 + var6;
            var5 = var71 ^ var70 << 10;
            int var73 = var70 + var72;
            var4 = var73 ^ var72 >>> 4;
            int var74 = var4 + var62;
            int var75 = var2 + var5;
            int var76 = var72 + var75;
            var3 = var76 ^ var75 << 8;
            var8 = var3 + var65;
            int var77 = var74 + var75;
            var2 = var77 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var38 = this.field2982[var12 + 4] + var5;
            int var39 = this.field2982[var12 + 5] + var4;
            int var40 = this.field2982[var12 + 1] + var8;
            int var41 = this.field2982[var12 + 3] + var6;
            int var42 = this.field2982[var12 + 2] + var7;
            int var43 = this.field2982[var12] + var9;
            int var44 = var43 ^ var40 << 11;
            int var45 = var41 + var44;
            int var46 = this.field2982[var12 + 7] + var2;
            int var47 = this.field2982[var12 + 6] + var3;
            int var48 = var40 + var42;
            int var49 = var48 ^ var42 >>> 2;
            int var50 = var38 + var49;
            int var51 = var42 + var45;
            int var52 = var51 ^ var45 << 8;
            int var53 = var45 + var50;
            int var54 = var39 + var52;
            var6 = var53 ^ var50 >>> 16;
            int var55 = var50 + var54;
            var5 = var55 ^ var54 << 10;
            int var56 = var6 + var47;
            int var57 = var5 + var46;
            int var58 = var54 + var56;
            var4 = var58 ^ var56 >>> 4;
            int var59 = var4 + var44;
            int var60 = var56 + var57;
            var3 = var60 ^ var57 << 8;
            int var61 = var57 + var59;
            var8 = var3 + var49;
            var2 = var61 ^ var59 >>> 9;
            var7 = var2 + var52;
            var9 = var8 + var59;
            this.field2979[var12] = var9;
            this.field2979[var12 + 1] = var8;
            this.field2979[var12 + 2] = var7;
            this.field2979[var12 + 3] = var6;
            this.field2979[var12 + 4] = var5;
            this.field2979[var12 + 5] = var4;
            this.field2979[var12 + 6] = var3;
            this.field2979[var12 + 7] = var2;
        }
        for (int var13 = 0; var13 < 256; var13 += 8) {
            int var14 = this.field2979[var13 + 4] + var5;
            int var15 = this.field2979[var13 + 2] + var7;
            int var16 = this.field2979[var13 + 5] + var4;
            int var17 = this.field2979[var13] + var9;
            int var18 = this.field2979[var13 + 7] + var2;
            int var19 = this.field2979[var13 + 6] + var3;
            int var20 = this.field2979[var13 + 1] + var8;
            int var21 = var17 ^ var20 << 11;
            int var22 = this.field2979[var13 + 3] + var6;
            int var23 = var15 + var20;
            int var24 = var21 + var22;
            int var25 = var23 ^ var15 >>> 2;
            int var26 = var14 + var25;
            int var27 = var15 + var24;
            int var28 = var27 ^ var24 << 8;
            int var29 = var16 + var28;
            int var30 = var24 + var26;
            var6 = var30 ^ var26 >>> 16;
            int var31 = var6 + var19;
            int var32 = var26 + var29;
            var5 = var32 ^ var29 << 10;
            int var33 = var5 + var18;
            int var34 = var29 + var31;
            var4 = var34 ^ var31 >>> 4;
            int var35 = var4 + var21;
            int var36 = var31 + var33;
            var3 = var36 ^ var33 << 8;
            var8 = var3 + var25;
            int var37 = var33 + var35;
            var2 = var37 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var28;
            this.field2979[var13] = var9;
            this.field2979[var13 + 1] = var8;
            this.field2979[var13 + 2] = var7;
            this.field2979[var13 + 3] = var6;
            this.field2979[var13 + 4] = var5;
            this.field2979[var13 + 5] = var4;
            this.field2979[var13 + 6] = var3;
            this.field2979[var13 + 7] = var2;
        }
        this.method968(-58);
        this.field2980 = 256;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II[BZ)Lke;", line = 303)
    public static final class65 method972(int arg0, int arg1, byte[] arg2, boolean arg3) {
        field2974++;
        class65 var4 = new class65();
        var4.field1702 = new byte[arg1];
        if (arg3) {
            method972(75, 101, null, true);
        }
        var4.field1733 = arg1;
        class68.method572(arg2, arg0, var4.field1702, 0, arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLld;I[B)V", line = 323)
    public static final void method973(byte arg0, class70 arg1, int arg2, byte[] arg3) {
        class81 var4 = new class81();
        var4.field2153 = 0;
        var4.field2164 = arg3;
        var4.field2151 = arg1;
        field2968++;
        int var5 = 107 / ((-arg0 - 8) / 59);
        var4.field349 = arg2;
        class53 var6 = class51.field1292;
        synchronized (class51.field1292) {
            class51.field1292.method425(var4, 16);
        }
        class100.method831(-1);
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "([I)V", line = 347)
    public class121(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2982[var2] = arg0[var2];
        }
        this.method971((byte) 97);
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)V", line = 372)
    public static void method974(byte arg0) {
        field2984 = null;
        int var1 = 117 / ((57 - arg0) / 39);
        field2971 = null;
        field2985 = null;
        field2967 = null;
        field2983 = null;
        field2970 = null;
        field2986 = null;
        field2966 = null;
        field2973 = null;
        field2976 = null;
        field2987 = null;
    }
}
