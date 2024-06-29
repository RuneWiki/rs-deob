import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class82 {

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "[I")
    private int[] field1313;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "[I")
    private int[] field1328;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "[I")
    public static int[] field1324 = new int[4096];

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "Ljava/lang/String;")
    public static String field1326;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    private int field1311;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    private int field1315;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    private int field1317;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    private int field1318;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "Lgi;")
    public static class164 field1329;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IBI)V")
    public static final void method585(int arg0, byte arg1, int arg2) {
        field1322++;
        if (class231.field3613 == 2) {
            class95.field1506 = arg0;
            class211.field3361 = arg2;
        }
        class226.field3554 = (float) arg0;
        int var3 = 104 / ((4 - arg1) / 41);
        class114.field1742 = (float) arg2;
        class12.method92(false);
        class8.field181 = true;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method586(int arg0, long arg1) {
        field1320++;
        class246.field3875.setTime(new Date(arg1));
        int var3 = class246.field3875.get(7);
        int var4 = 2 / ((26 - arg0) / 62);
        int var5 = class246.field3875.get(5);
        int var6 = class246.field3875.get(2);
        int var7 = class246.field3875.get(1);
        int var8 = class246.field3875.get(11);
        int var9 = class246.field3875.get(12);
        int var10 = class246.field3875.get(13);
        return class244.field3862[var3 - 1] + ", " + var5 / 10 + var5 % 10 + "-" + class152.field2439[var6] + "-" + var7 + " " + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIZII)V")
    public static final void method587(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg0 != -11774) {
            field1326 = null;
        }
        field1321++;
        class200.method1379(-842114134, false);
        class133.field2138 = arg1;
        class173.field2900 = arg2;
        class116.field1764 = arg3;
        class262.method1769(arg4);
        class60.field867 = new class58(8);
        class226.field3546 = new class58(8);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)I")
    public final int method588(int arg0) {
        if (arg0 != -6055) {
            method590((class164) null, (class164) null, false, 90);
        }
        if ((this.field1318--) == 0) {
            this.method594((byte) -127);
            this.field1318 = 255;
        }
        field1312++;
        return this.field1328[this.field1318];
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)I")
    public static final int method589(int arg0, int arg1) {
        if (arg0 != 23478) {
            field1324 = null;
        }
        field1319++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lgi;Lgi;ZI)V")
    public static final void method590(class164 arg0, class164 arg1, boolean arg2, int arg3) {
        class9.field200 = arg1;
        if (arg3 <= -78) {
            class81.field1304 = arg2;
            class265.field4319 = arg0;
            field1314++;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V")
    public static final void method591(int arg0) {
        class273 var1 = (class273) class203.field3282.method1553(true);
        if (arg0 != 0) {
            return;
        }
        while (var1 != null) {
            if (var1.field4392) {
                var1.method1808(-30174);
            }
            var1 = (class273) class203.field3282.method1551(0);
        }
        field1325++;
        for (class273 var2 = (class273) class66.field1071.method1553(true); var2 != null; var2 = (class273) class66.field1071.method1551(0)) {
            if (var2.field4392) {
                var2.method1808(-30174);
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
    private final void method592(byte arg0) {
        field1316++;
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
            int var68 = var4 + var67;
            int var69 = var63 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var65 + var68;
            int var71 = var3 + var6;
            var5 = var70 ^ var68 << 10;
            int var72 = var2 + var5;
            int var73 = var68 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var72;
            var3 = var75 ^ var72 << 8;
            var8 = var3 + var64;
            int var76 = var72 + var74;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1328[var11 + 5] + var4;
            int var38 = this.field1328[var11 + 2] + var7;
            int var39 = this.field1328[var11 + 3] + var6;
            int var40 = this.field1328[var11 + 6] + var3;
            int var41 = this.field1328[var11 + 1] + var8;
            int var42 = this.field1328[var11 + 7] + var2;
            int var43 = this.field1328[var11 + 4] + var5;
            int var44 = this.field1328[var11] + var9;
            int var45 = var44 ^ var41 << 11;
            int var46 = var39 + var45;
            int var47 = var38 + var41;
            int var48 = var47 ^ var38 >>> 2;
            int var49 = var43 + var48;
            int var50 = var38 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var46 + var49;
            var6 = var52 ^ var49 >>> 16;
            int var53 = var6 + var40;
            int var54 = var37 + var51;
            int var55 = var49 + var54;
            var5 = var55 ^ var54 << 10;
            int var56 = var53 + var54;
            int var57 = var5 + var42;
            var4 = var56 ^ var53 >>> 4;
            int var58 = var4 + var45;
            int var59 = var53 + var57;
            var3 = var59 ^ var57 << 8;
            var8 = var3 + var48;
            int var60 = var57 + var58;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            this.field1313[var11] = var9;
            this.field1313[var11 + 1] = var8;
            var7 = var2 + var51;
            this.field1313[var11 + 2] = var7;
            this.field1313[var11 + 3] = var6;
            this.field1313[var11 + 4] = var5;
            this.field1313[var11 + 5] = var4;
            this.field1313[var11 + 6] = var3;
            this.field1313[var11 + 7] = var2;
        }
        int var12 = 0;
        if (arg0 <= 68) {
            return;
        }
        while (var12 < 256) {
            int var13 = this.field1313[var12 + 5] + var4;
            int var14 = this.field1313[var12 + 1] + var8;
            int var15 = this.field1313[var12 + 6] + var3;
            int var16 = this.field1313[var12] + var9;
            int var17 = this.field1313[var12 + 7] + var2;
            int var18 = var16 ^ var14 << 11;
            int var19 = this.field1313[var12 + 3] + var6;
            int var20 = var18 + var19;
            int var21 = this.field1313[var12 + 2] + var7;
            int var22 = var14 + var21;
            int var23 = var22 ^ var21 >>> 2;
            int var24 = var20 + var21;
            int var25 = this.field1313[var12 + 4] + var5;
            int var26 = var24 ^ var20 << 8;
            int var27 = var23 + var25;
            int var28 = var20 + var27;
            var6 = var28 ^ var27 >>> 16;
            int var29 = var13 + var26;
            int var30 = var6 + var15;
            int var31 = var27 + var29;
            var5 = var31 ^ var29 << 10;
            int var32 = var29 + var30;
            var4 = var32 ^ var30 >>> 4;
            int var33 = var4 + var18;
            int var34 = var5 + var17;
            int var35 = var30 + var34;
            var3 = var35 ^ var34 << 8;
            var8 = var3 + var23;
            int var36 = var33 + var34;
            var2 = var36 ^ var33 >>> 9;
            var9 = var8 + var33;
            this.field1313[var12] = var9;
            var7 = var2 + var26;
            this.field1313[var12 + 1] = var8;
            this.field1313[var12 + 2] = var7;
            this.field1313[var12 + 3] = var6;
            this.field1313[var12 + 4] = var5;
            this.field1313[var12 + 5] = var4;
            this.field1313[var12 + 6] = var3;
            this.field1313[var12 + 7] = var2;
            var12 += 8;
        }
        this.method594((byte) 0);
        this.field1318 = 256;
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)V")
    public static void method593(int arg0) {
        if (arg0 != -30753) {
            method591(-76);
        }
        field1324 = null;
        field1326 = null;
        field1329 = null;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V")
    private final void method594(byte arg0) {
        this.field1315 += ++this.field1311;
        field1323++;
        int var2 = -108 / ((arg0 + 83) / 41);
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = this.field1313[var3];
            if ((var3 & 0x2) == 0) {
                if ((var3 & 0x1) == 0) {
                    this.field1317 ^= this.field1317 << 13;
                } else {
                    this.field1317 ^= this.field1317 >>> 6;
                }
            } else if ((var3 & 0x1) == 0) {
                this.field1317 ^= this.field1317 << 2;
            } else {
                this.field1317 ^= this.field1317 >>> 16;
            }
            this.field1317 += this.field1313[var3 + 128 & 0xFF];
            int var5;
            this.field1313[var3] = var5 = this.field1313[class233.method1609(1020, var4) >> 2] - (-this.field1317 - this.field1315);
            this.field1328[var3] = this.field1315 = var4 + this.field1313[class233.method1609(var5 >> 8 >> 2, 255)];
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
    private class82() {
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "([I)V")
    public class82(int[] arg0) {
        this.field1313 = new int[256];
        this.field1328 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1328[var2] = arg0[var2];
        }
        this.method592((byte) 109);
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field1324[var0] = class111.method781(var0, -502337972);
        }
        field1327 = 0;
        field1326 = "You can't add yourself to your own ignore list.";
    }
}
