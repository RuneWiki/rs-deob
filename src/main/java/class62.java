import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class62 {

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "[I")
    private int[] field1067;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "[I")
    private int[] field1064;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "Lrb;")
    public static class275 field1062 = new class275();

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "[I")
    public static int[] field1065 = new int[32];

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "[I")
    public static int[] field1063 = new int[128];

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "[I")
    public static int[] field1073;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "Loh;")
    public static class281 field1072;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "Ljava/lang/String;")
    public static String field1075;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    private int field1056;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    private int field1068;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    private int field1070;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    private int field1071;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "Lhc;")
    public static class235 field1074;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)I")
    public final int method465(boolean arg0) {
        field1061++;
        if (arg0) {
            method469(-34, -85);
        }
        if (this.field1056-- == 0) {
            this.method470(!arg0);
            this.field1056 = 255;
        }
        return this.field1064[this.field1056];
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I[Lre;Z)V")
    public static final void method466(int arg0, class228[] arg1, boolean arg2) {
        int var3 = 0;
        if (!arg2) {
            method468(-63, (byte) 118);
        }
        while (arg1.length > var3) {
            class228 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field3477 == 0) {
                    if (var4.field3498 != null) {
                        method466(arg0, var4.field3498, true);
                    }
                    class251 var5 = (class251) class127.field2007.method285((long) var4.field3480, 13821);
                    if (var5 != null) {
                        class151.method1018(-100, arg0, var5.field4041);
                    }
                }
                if (arg0 == 0 && var4.field3573 != null) {
                    class116 var6 = new class116();
                    var6.field1892 = var4;
                    var6.field1895 = var4.field3573;
                    class44.method322(var6, 200000);
                }
                if (arg0 == 1 && var4.field3526 != null) {
                    label62: {
                        if (var4.field3551 >= 0) {
                            class228 var7 = class84.method596((byte) 35, var4.field3480);
                            if (var7 == null || var7.field3498 == null || var7.field3498.length <= var4.field3551 || var7.field3498[var4.field3551] != var4) {
                                break label62;
                            }
                        }
                        class116 var8 = new class116();
                        var8.field1895 = var4.field3526;
                        var8.field1892 = var4;
                        class44.method322(var8, 200000);
                    }
                }
            }
            var3++;
        }
        field1059++;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static void method467(int arg0) {
        field1065 = null;
        field1073 = null;
        field1074 = null;
        field1063 = null;
        field1075 = null;
        if (arg0 == -1) {
            field1062 = null;
            field1072 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)I")
    public static final int method468(int arg0, byte arg1) {
        field1069++;
        if (arg1 < 13) {
            field1066 = -88;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)Lja;")
    public static final class60 method469(int arg0, int arg1) {
        class60 var2 = (class60) class115.field1872.method1887(0, (long) arg0);
        field1057++;
        if (var2 != null) {
            return var2;
        }
        int var3 = 60 / ((-arg1 - 8) / 60);
        byte[] var4 = class45.field643.method1590(class155.method1041(arg0, -61), (byte) -25, class296.method1979(39, arg0));
        class60 var5 = new class60();
        var5.field990 = arg0;
        if (var4 != null) {
            var5.method450(-1, new class88(var4));
        }
        var5.method447(81);
        class115.field1872.method1886(-99, (long) arg0, var5);
        return var5;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(Z)V")
    private final void method470(boolean arg0) {
        this.field1068 += ++this.field1070;
        field1060++;
        if (!arg0) {
            this.method470(true);
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1067[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1071 ^= this.field1071 << 13;
                } else {
                    this.field1071 ^= this.field1071 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1071 ^= this.field1071 << 2;
            } else {
                this.field1071 ^= this.field1071 >>> 16;
            }
            this.field1071 += this.field1067[var2 + 128 & 0xFF];
            int var4;
            this.field1067[var2] = var4 = this.field1067[class55.method420(var3 >> 2, 255)] + this.field1071 + this.field1068;
            this.field1064[var2] = this.field1068 = this.field1067[class55.method420(var4 >> 8 >> 2, 255)] + var3;
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
    private class62() {
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
    private final void method471(int arg0) {
        if (arg0 != 5) {
            method469(-79, 117);
        }
        field1058++;
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
            int var65 = var5 + var64;
            int var66 = var7 + var63;
            int var67 = var66 ^ var63 << 8;
            int var68 = var63 + var65;
            var6 = var68 ^ var65 >>> 16;
            int var69 = var4 + var67;
            int var70 = var65 + var69;
            var5 = var70 ^ var69 << 10;
            int var71 = var2 + var5;
            int var72 = var3 + var6;
            int var73 = var69 + var72;
            var4 = var73 ^ var72 >>> 4;
            int var74 = var71 + var72;
            int var75 = var4 + var61;
            var3 = var74 ^ var71 << 8;
            var8 = var3 + var64;
            int var76 = var71 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1064[var11 + 2] + var7;
            int var38 = this.field1064[var11] + var9;
            int var39 = this.field1064[var11 + 7] + var2;
            int var40 = this.field1064[var11 + 3] + var6;
            int var41 = this.field1064[var11 + 1] + var8;
            int var42 = var38 ^ var41 << 11;
            int var43 = this.field1064[var11 + 5] + var4;
            int var44 = var40 + var42;
            int var45 = this.field1064[var11 + 6] + var3;
            int var46 = var37 + var41;
            int var47 = this.field1064[var11 + 4] + var5;
            int var48 = var46 ^ var37 >>> 2;
            int var49 = var37 + var44;
            int var50 = var49 ^ var44 << 8;
            int var51 = var47 + var48;
            int var52 = var43 + var50;
            int var53 = var44 + var51;
            var6 = var53 ^ var51 >>> 16;
            int var54 = var51 + var52;
            var5 = var54 ^ var52 << 10;
            int var55 = var6 + var45;
            int var56 = var5 + var39;
            int var57 = var52 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var55 + var56;
            var3 = var58 ^ var56 << 8;
            int var59 = var4 + var42;
            var8 = var3 + var48;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            var7 = var2 + var50;
            this.field1067[var11] = var9;
            this.field1067[var11 + 1] = var8;
            this.field1067[var11 + 2] = var7;
            this.field1067[var11 + 3] = var6;
            this.field1067[var11 + 4] = var5;
            this.field1067[var11 + 5] = var4;
            this.field1067[var11 + 6] = var3;
            this.field1067[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1067[var12 + 7] + var2;
            int var14 = this.field1067[var12 + 1] + var8;
            int var15 = this.field1067[var12 + 6] + var3;
            int var16 = this.field1067[var12 + 3] + var6;
            int var17 = this.field1067[var12 + 4] + var5;
            int var18 = this.field1067[var12] + var9;
            int var19 = this.field1067[var12 + 5] + var4;
            int var20 = var18 ^ var14 << 11;
            int var21 = var16 + var20;
            int var22 = this.field1067[var12 + 2] + var7;
            int var23 = var14 + var22;
            int var24 = var23 ^ var22 >>> 2;
            int var25 = var21 + var22;
            int var26 = var17 + var24;
            int var27 = var25 ^ var21 << 8;
            int var28 = var19 + var27;
            int var29 = var21 + var26;
            var6 = var29 ^ var26 >>> 16;
            int var30 = var26 + var28;
            int var31 = var6 + var15;
            var5 = var30 ^ var28 << 10;
            int var32 = var28 + var31;
            int var33 = var5 + var13;
            var4 = var32 ^ var31 >>> 4;
            int var34 = var31 + var33;
            int var35 = var4 + var20;
            var3 = var34 ^ var33 << 8;
            var8 = var3 + var24;
            int var36 = var33 + var35;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            this.field1067[var12] = var9;
            this.field1067[var12 + 1] = var8;
            var7 = var2 + var27;
            this.field1067[var12 + 2] = var7;
            this.field1067[var12 + 3] = var6;
            this.field1067[var12 + 4] = var5;
            this.field1067[var12 + 5] = var4;
            this.field1067[var12 + 6] = var3;
            this.field1067[var12 + 7] = var2;
        }
        this.method470(true);
        this.field1056 = 256;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "([I)V")
    public class62(int[] arg0) {
        this.field1067 = new int[256];
        this.field1064 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1064[var2] = arg0[var2];
        }
        this.method471(5);
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1065[var1] = var0 - 1;
            var0 += var0;
        }
        field1073 = new int[100];
        field1072 = new class281(2);
        field1075 = "glow2:";
    }
}
