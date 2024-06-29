import java.io.UnsupportedEncodingException;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class150 {

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "[I")
    private int[] field2918 = new int[256];

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "[I")
    private int[] field2913 = new int[256];

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "Z")
    public static volatile boolean field2919 = true;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "Lsd;")
    private static class166 field2928 = class135.method935("World", 0);

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "Lsd;")
    public static class166 field2927 = field2928;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "Lsd;")
    public static class166 field2915 = field2928;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2925 = new CRC32();

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "I")
    public static int field2931 = 10;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    private int field2914;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    private int field2916;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
    private int field2923;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    private int field2924;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "Lwa;")
    public static class199 field2922;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "[[[B")
    public static byte[][][] field2917;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BJ)V")
    public static final void method1017(byte arg0, long arg1) {
        field2911++;
        if (arg0 != 40) {
            method1021(-52);
        }
        if (arg1 == 0L) {
            return;
        }
        if (class189.field3609 >= 100 && class12.field227 != 1 || class189.field3609 >= 200) {
            method1023((byte) 118, 0, class159.field3050, class196.field3891);
            return;
        }
        class166 var3 = class191.method1278(37, arg1).method1159(-115);
        for (int var4 = 0; var4 < class189.field3609; var4++) {
            if (class154.field2964[var4] == arg1) {
                method1023((byte) -69, 0, class22.method148(new class166[] { var3, class34.field632 }, 0), class196.field3891);
                return;
            }
        }
        for (int var5 = 0; var5 < class119.field2344; var5++) {
            if (class72.field1430[var5] == arg1) {
                method1023((byte) 110, 0, class22.method148(new class166[] { class135.field2625, var3, class41.field741 }, 0), class196.field3891);
                return;
            }
        }
        if (var3.method1138(class41.field728.field2412, (byte) 108)) {
            method1023((byte) 110, 0, class195.field3865, class196.field3891);
            return;
        }
        class127.field2500[class189.field3609] = var3;
        class30.field564++;
        class154.field2964[class189.field3609] = arg1;
        class121.field2374[class189.field3609] = 0;
        class97.field1857[class189.field3609] = 0;
        class189.field3609++;
        class128.field2508 = class95.field1844;
        class156.field2989.method705(92, (byte) 9);
        class156.field2989.method428(arg1, (byte) 102);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)I")
    public final int method1018(byte arg0) {
        field2926++;
        if (this.field2923-- == 0) {
            this.method1019(false);
            this.field2923 = 255;
        }
        return arg0 == -83 ? this.field2913[this.field2923] : 33;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V")
    private final void method1019(boolean arg0) {
        if (arg0) {
            this.method1019(true);
        }
        field2929++;
        this.field2914 += ++this.field2924;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2918[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2916 ^= this.field2916 << 13;
                } else {
                    this.field2916 ^= this.field2916 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2916 ^= this.field2916 << 2;
            } else {
                this.field2916 ^= this.field2916 >>> 16;
            }
            this.field2916 += this.field2918[var2 + 128 & 0xFF];
            int var4;
            this.field2918[var2] = var4 = this.field2916 + this.field2918[class22.method151(1020, var3) >> 2] + this.field2914;
            this.field2913[var2] = this.field2914 = var3 + this.field2918[class22.method151(var4 >> 8 >> 2, 255)];
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(Z)V")
    private final void method1020(boolean arg0) {
        field2930++;
        if (!arg0) {
            field2919 = false;
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
            int var66 = var65 ^ var62 << 8;
            int var67 = var4 + var66;
            int var68 = var5 + var64;
            int var69 = var62 + var68;
            var6 = var69 ^ var68 >>> 16;
            int var70 = var3 + var6;
            int var71 = var67 + var68;
            var5 = var71 ^ var67 << 10;
            int var72 = var67 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var73;
            var3 = var75 ^ var73 << 8;
            int var76 = var73 + var74;
            var2 = var76 ^ var74 >>> 9;
            var8 = var3 + var64;
            var7 = var2 + var66;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field2913[var11 + 6] + var3;
            int var38 = this.field2913[var11 + 4] + var5;
            int var39 = this.field2913[var11] + var9;
            int var40 = this.field2913[var11 + 3] + var6;
            int var41 = this.field2913[var11 + 5] + var4;
            int var42 = this.field2913[var11 + 1] + var8;
            int var43 = this.field2913[var11 + 7] + var2;
            int var44 = this.field2913[var11 + 2] + var7;
            int var45 = var39 ^ var42 << 11;
            int var46 = var40 + var45;
            int var47 = var42 + var44;
            int var48 = var47 ^ var44 >>> 2;
            int var49 = var44 + var46;
            int var50 = var49 ^ var46 << 8;
            int var51 = var41 + var50;
            int var52 = var38 + var48;
            int var53 = var46 + var52;
            var6 = var53 ^ var52 >>> 16;
            int var54 = var6 + var37;
            int var55 = var51 + var52;
            var5 = var55 ^ var51 << 10;
            int var56 = var51 + var54;
            var4 = var56 ^ var54 >>> 4;
            int var57 = var5 + var43;
            int var58 = var54 + var57;
            var3 = var58 ^ var57 << 8;
            int var59 = var4 + var45;
            int var60 = var57 + var59;
            var2 = var60 ^ var59 >>> 9;
            var8 = var3 + var48;
            var9 = var8 + var59;
            var7 = var2 + var50;
            this.field2918[var11] = var9;
            this.field2918[var11 + 1] = var8;
            this.field2918[var11 + 2] = var7;
            this.field2918[var11 + 3] = var6;
            this.field2918[var11 + 4] = var5;
            this.field2918[var11 + 5] = var4;
            this.field2918[var11 + 6] = var3;
            this.field2918[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2918[var12] + var9;
            int var14 = this.field2918[var12 + 5] + var4;
            int var15 = this.field2918[var12 + 6] + var3;
            int var16 = this.field2918[var12 + 1] + var8;
            int var17 = this.field2918[var12 + 3] + var6;
            int var18 = this.field2918[var12 + 2] + var7;
            int var19 = var13 ^ var16 << 11;
            int var20 = var16 + var18;
            int var21 = var17 + var19;
            int var22 = var20 ^ var18 >>> 2;
            int var23 = this.field2918[var12 + 7] + var2;
            int var24 = var18 + var21;
            int var25 = this.field2918[var12 + 4] + var5;
            int var26 = var24 ^ var21 << 8;
            int var27 = var14 + var26;
            int var28 = var22 + var25;
            int var29 = var21 + var28;
            var6 = var29 ^ var28 >>> 16;
            int var30 = var27 + var28;
            var5 = var30 ^ var27 << 10;
            int var31 = var5 + var23;
            int var32 = var6 + var15;
            int var33 = var27 + var32;
            var4 = var33 ^ var32 >>> 4;
            int var34 = var31 + var32;
            var3 = var34 ^ var31 << 8;
            int var35 = var4 + var19;
            var8 = var3 + var22;
            int var36 = var31 + var35;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            this.field2918[var12] = var9;
            this.field2918[var12 + 1] = var8;
            var7 = var2 + var26;
            this.field2918[var12 + 2] = var7;
            this.field2918[var12 + 3] = var6;
            this.field2918[var12 + 4] = var5;
            this.field2918[var12 + 5] = var4;
            this.field2918[var12 + 6] = var3;
            this.field2918[var12 + 7] = var2;
        }
        this.method1019(false);
        this.field2923 = 256;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public static void method1021(int arg0) {
        field2928 = null;
        field2922 = null;
        field2915 = null;
        field2925 = null;
        if (arg0 != -903) {
            method1024(null, null, (byte) 8);
        }
        field2927 = null;
        field2917 = null;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
    public static final void method1022(int arg0) {
        field2920++;
        class160.field3072.method71(500);
        client.field498.method71(500);
        if (arg0 != -31080) {
            field2922 = null;
        }
        class203.field4008.method71(arg0 ^ 0xFFFF876C);
        class3.field47.method71(500);
        class147.field2885.method71(500);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BILsd;Lsd;)V")
    public static final void method1023(byte arg0, int arg1, class166 arg2, class166 arg3) {
        field2921++;
        int var4 = 58 / ((48 - arg0) / 58);
        class56.method467(arg1, arg3, arg2, null, false);
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "([I)V")
    public class150(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2913[var2] = arg0[var2];
        }
        this.method1020(true);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lvd;Lsd;B)Lsd;")
    public static final class166 method1024(class193 arg0, class166 arg1, byte arg2) {
        if (arg1.method1137(-1, class33.field625) != -1) {
            label62: while (true) {
                int var3 = arg1.method1137(-1, class146.field2877);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.method1137(-1, class33.field620);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.method1137(-1, class187.field3574);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg1.method1137(-1, class67.field1368);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.method1137(-1, class117.field2263);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg1.method1137(-1, class28.field482);
                                                        if (var8 == -1) {
                                                            break label62;
                                                        }
                                                        class166 var9 = class196.field3891;
                                                        if (class112.field2187 != null) {
                                                            var9 = class48.method374(-109, class112.field2187.field1349);
                                                            try {
                                                                if (class112.field2187.field1352 != null) {
                                                                    byte[] var10 = ((String) class112.field2187.field1352).getBytes("ISO-8859-1");
                                                                    var9 = class45.method344(var10.length, 0, var10, -1);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg1 = class22.method148(new class166[] { arg1.method1121(10876, var8, 0), var9, arg1.method1155(var8 + 4, (byte) -72) }, 0);
                                                    }
                                                }
                                                arg1 = class22.method148(new class166[] { arg1.method1121(10876, var7, 0), class91.method713(class37.method262(arg0, 113, 4), (byte) -128), arg1.method1155(var7 + 2, (byte) -72) }, 0);
                                            }
                                        }
                                        arg1 = class22.method148(new class166[] { arg1.method1121(10876, var6, 0), class91.method713(class37.method262(arg0, 98, 3), (byte) -125), arg1.method1155(var6 + 2, (byte) -72) }, 0);
                                    }
                                }
                                arg1 = class22.method148(new class166[] { arg1.method1121(10876, var5, 0), class91.method713(class37.method262(arg0, -115, 2), (byte) -126), arg1.method1155(var5 + 2, (byte) -72) }, 0);
                            }
                        }
                        arg1 = class22.method148(new class166[] { arg1.method1121(10876, var4, 0), class91.method713(class37.method262(arg0, 114, 1), (byte) -127), arg1.method1155(var4 + 2, (byte) -72) }, 0);
                    }
                }
                arg1 = class22.method148(new class166[] { arg1.method1121(10876, var3, 0), class91.method713(class37.method262(arg0, 115, 0), (byte) -127), arg1.method1155(var3 + 2, (byte) -72) }, 0);
            }
        }
        field2912++;
        if (arg2 >= -17) {
            method1021(-103);
        }
        return arg1;
    }
}
