import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class172 {

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "[I")
    private int[] field2965;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "[I")
    private int[] field2978;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "Ljd;")
    public static class85 field2967 = null;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "Lpa;")
    public static class204 field2975 = new class204(32);

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "Ljd;")
    public static class85 field2979 = class221.method1499("(U4", (byte) -123);

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "Ljd;")
    public static class85 field2981 = class221.method1499("3D)2Softwarebibliothek gestartet)3", (byte) -96);

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "Ljd;")
    public static class85 field2983 = class221.method1499("Spieler", (byte) 87);

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "Ljd;")
    public static class85 field2982 = class221.method1499("Okay", (byte) 121);

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    private int field2966;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    private int field2971;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
    private int field2973;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    private int field2974;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "Lge;")
    public static class68 field2980;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
    private final void method1147(byte arg0) {
        field2972++;
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
            var4 = var72 ^ var71 >>> 4;
            int var73 = var2 + var5;
            int var74 = var71 + var73;
            int var75 = var4 + var61;
            var3 = var74 ^ var73 << 8;
            int var76 = var73 + var75;
            var8 = var3 + var64;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        if (arg0 != 97) {
            return;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field2965[var11 + 3] + var6;
            int var38 = this.field2965[var11] + var9;
            int var39 = this.field2965[var11 + 6] + var3;
            int var40 = this.field2965[var11 + 7] + var2;
            int var41 = this.field2965[var11 + 2] + var7;
            int var42 = this.field2965[var11 + 4] + var5;
            int var43 = this.field2965[var11 + 1] + var8;
            int var44 = this.field2965[var11 + 5] + var4;
            int var45 = var38 ^ var43 << 11;
            int var46 = var41 + var43;
            int var47 = var46 ^ var41 >>> 2;
            int var48 = var42 + var47;
            int var49 = var37 + var45;
            int var50 = var41 + var49;
            int var51 = var50 ^ var49 << 8;
            int var52 = var48 + var49;
            int var53 = var44 + var51;
            var6 = var52 ^ var48 >>> 16;
            int var54 = var6 + var39;
            int var55 = var48 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var5 + var40;
            int var57 = var53 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var54 + var56;
            int var59 = var4 + var45;
            var3 = var58 ^ var56 << 8;
            var8 = var3 + var47;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            var7 = var2 + var51;
            this.field2978[var11] = var9;
            this.field2978[var11 + 1] = var8;
            this.field2978[var11 + 2] = var7;
            this.field2978[var11 + 3] = var6;
            this.field2978[var11 + 4] = var5;
            this.field2978[var11 + 5] = var4;
            this.field2978[var11 + 6] = var3;
            this.field2978[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2978[var12 + 7] + var2;
            int var14 = this.field2978[var12] + var9;
            int var15 = this.field2978[var12 + 1] + var8;
            int var16 = this.field2978[var12 + 6] + var3;
            int var17 = this.field2978[var12 + 3] + var6;
            int var18 = this.field2978[var12 + 2] + var7;
            int var19 = this.field2978[var12 + 5] + var4;
            int var20 = this.field2978[var12 + 4] + var5;
            int var21 = var14 ^ var15 << 11;
            int var22 = var17 + var21;
            int var23 = var15 + var18;
            int var24 = var23 ^ var18 >>> 2;
            int var25 = var20 + var24;
            int var26 = var18 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var22 + var25;
            int var29 = var19 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var6 + var16;
            int var31 = var25 + var29;
            var5 = var31 ^ var29 << 10;
            int var32 = var5 + var13;
            int var33 = var29 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var4 + var21;
            int var35 = var30 + var32;
            var3 = var35 ^ var32 << 8;
            var8 = var3 + var24;
            int var36 = var32 + var34;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field2978[var12] = var9;
            this.field2978[var12 + 1] = var8;
            this.field2978[var12 + 2] = var7;
            this.field2978[var12 + 3] = var6;
            this.field2978[var12 + 4] = var5;
            this.field2978[var12 + 5] = var4;
            this.field2978[var12 + 6] = var3;
            this.field2978[var12 + 7] = var2;
        }
        this.method1149(-257);
        this.field2973 = 256;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljb;II)Ljd;")
    public static final class85 method1148(class255 arg0, int arg1, int arg2) {
        if (arg2 != 1) {
            return null;
        }
        field2969++;
        if (!class184.method1268((byte) 65, client.method987(arg0), arg1) && arg0.field4552 == null) {
            return null;
        } else if (arg0.field4439 == null || arg1 >= arg0.field4439.length || arg0.field4439[arg1] == null || arg0.field4439[arg1].method601(0).method586(true) == 0) {
            return class183.field3134 ? method1150(new class85[] { class122.field2154, class68.method451(arg1, -12572) }, arg2 ^ 0x1) : null;
        } else {
            return arg0.field4439[arg1];
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
    private final void method1149(int arg0) {
        this.field2966 += ++this.field2974;
        field2968++;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2978[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2971 ^= this.field2971 << 13;
                } else {
                    this.field2971 ^= this.field2971 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2971 ^= this.field2971 << 2;
            } else {
                this.field2971 ^= this.field2971 >>> 16;
            }
            this.field2971 += this.field2978[var2 + 128 & 0xFF];
            int var4;
            this.field2978[var2] = var4 = this.field2978[class135.method899(var3 >> 2, 255)] + this.field2971 + this.field2966;
            this.field2965[var2] = this.field2966 = this.field2978[class135.method899(1020, var4 >> 8) >> 2] + var3;
        }
        if (arg0 != -257) {
            field2980 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([Ljd;I)Ljd;")
    public static final class85 method1150(class85[] arg0, int arg1) {
        if (arg1 != 0) {
            method1150((class85[]) null, -75);
        }
        field2977++;
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        return class234.method1566(arg0, arg0.length, 0, 0);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILjd;)V")
    public static final void method1151(int arg0, class85 arg1) {
        field2970++;
        if (arg0 != -19765) {
            method1151(52, (class85) null);
        }
        for (class82 var2 = (class82) class125.field2209.method110(arg0 + 19829); var2 != null; var2 = (class82) class125.field2209.method117((byte) 104)) {
            if (var2.field1488.method612((byte) 101, arg1)) {
                class227.field3945 = var2;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZIII)V")
    public static final void method1152(boolean arg0, int arg1, int arg2, int arg3) {
        field2964++;
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class159.field2706 = arg2;
        class256.field4568 = arg0;
        class171.field2956 = arg1;
        int var4 = -56 % ((22 - arg3) / 51);
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
    private class172() {
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
    public static void method1153(int arg0) {
        field2981 = null;
        field2983 = null;
        field2982 = null;
        field2967 = null;
        field2975 = null;
        if (arg0 != 22238) {
            method1148((class255) null, 13, -91);
        }
        field2980 = null;
        field2979 = null;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "([I)V")
    public class172(int[] arg0) {
        this.field2965 = new int[256];
        this.field2978 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2965[var2] = arg0[var2];
        }
        this.method1147((byte) 97);
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)I")
    public final int method1154(int arg0) {
        field2976++;
        if (arg0 == ~(this.field2973--)) {
            this.method1149(arg0 ^ 0x100);
            this.field2973 = 255;
        }
        return this.field2965[this.field2973];
    }
}
