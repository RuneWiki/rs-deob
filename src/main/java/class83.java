import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class83 extends class25 {

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "[Lt;")
    public class242[] field1523;

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "[Lbe;")
    public class286[] field1549;

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "[B")
    public byte[] field1546;

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "[S")
    public short[] field1548;

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "[B")
    public byte[] field1547;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "[I")
    private int[] field1530;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "[B")
    public byte[] field1531;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "I")
    public int field1536;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "Z")
    public static boolean field1522 = true;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "[I")
    public static int[] field1527 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "Lcd;")
    private static class64 field1525 = class44.method335((byte) 71, "fr");

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "Lcd;")
    private static class64 field1529 = class44.method335((byte) 71, ")3fr");

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "Lcd;")
    public static class64 field1537 = class44.method335((byte) 71, "Schlie-8en");

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "Lcd;")
    private static class64 field1540 = class44.method335((byte) 71, ")3en");

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public static int field1524 = -1;

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "Lcd;")
    private static class64 field1543 = class44.method335((byte) 71, ")3de");

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "I")
    public static int field1533 = 1;

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "Lcd;")
    public static class64 field1538 = class44.method335((byte) 71, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "Lcd;")
    public static class64 field1539 = class44.method335((byte) 71, "um");

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "Lcd;")
    private static class64 field1534 = class44.method335((byte) 71, "en");

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "Lcd;")
    private static class64 field1550 = class44.method335((byte) 71, "de");

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "[Lcd;")
    private static class64[] field1528 = new class64[] { field1540, field1543, field1529 };

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "[Lcd;")
    public static class64[] field1535 = new class64[] { field1534, field1550, field1525 };

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)V", line = 11)
    public static final void method638(int arg0) {
        class108.field1991.method1217((byte) 67);
        int var1 = class108.field1991.method1220(-23932, 8);
        if (class218.field3707 > var1) {
            for (int var2 = var1; var2 < class218.field3707; var2++) {
                class310.field5265[class182.field3125++] = class254.field4422[var2];
            }
        }
        if (arg0 >= -90) {
            field1543 = (class64) null;
        }
        field1532++;
        if (class218.field3707 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class218.field3707 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class254.field4422[var3];
            class232 var5 = class2.field12[var4];
            int var6 = class108.field1991.method1220(-23932, 1);
            if (var6 == 0) {
                class254.field4422[class218.field3707++] = var4;
                var5.field1911 = class29.field482;
            } else {
                int var7 = class108.field1991.method1220(-23932, 2);
                if (var7 == 0) {
                    class254.field4422[class218.field3707++] = var4;
                    var5.field1911 = class29.field482;
                    class89.field1616[class228.field3878++] = var4;
                } else if (var7 == 1) {
                    class254.field4422[class218.field3707++] = var4;
                    var5.field1911 = class29.field482;
                    int var11 = class108.field1991.method1220(-23932, 3);
                    var5.method762(var11, false, false);
                    int var12 = class108.field1991.method1220(-23932, 1);
                    if (var12 == 1) {
                        class89.field1616[class228.field3878++] = var4;
                    }
                } else if (var7 == 2) {
                    class254.field4422[class218.field3707++] = var4;
                    var5.field1911 = class29.field482;
                    int var8 = class108.field1991.method1220(-23932, 3);
                    var5.method762(var8, false, true);
                    int var9 = class108.field1991.method1220(-23932, 3);
                    var5.method762(var9, false, true);
                    int var10 = class108.field1991.method1220(-23932, 1);
                    if (var10 == 1) {
                        class89.field1616[class228.field3878++] = var4;
                    }
                } else if (var7 == 3) {
                    class310.field5265[class182.field3125++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)V", line = 121)
    public static final void method639(int arg0, boolean arg1) {
        class105.field1942 = new int[104];
        class17.field349 = new int[104];
        field1542++;
        class72.field1389 = new int[104];
        class304.field5196 = new int[104];
        class120.field2173 = 99;
        if (arg0 != 5974) {
            field1522 = false;
        }
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class113.field2088 = new int[104];
        class30.field511 = new byte[var2][104][104];
        class227.field3858 = new byte[var2][104][104];
        class222.field3784 = new int[var2][105][105];
        class71.field1365 = new byte[var2][104][104];
        class70.field1359 = new byte[var2][104][104];
        class168.field2912 = new byte[var2][105][105];
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V", line = 159)
    public final void method640(byte arg0) {
        if (arg0 == -67) {
            field1545++;
            this.field1530 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)V", line = 171)
    public static void method641(byte arg0) {
        field1538 = null;
        int var1 = 84 / ((arg0 - 30) / 55);
        field1537 = null;
        field1534 = null;
        field1543 = null;
        field1540 = null;
        field1528 = null;
        field1539 = null;
        field1527 = null;
        field1550 = null;
        field1529 = null;
        field1535 = null;
        field1525 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([IBLkg;[B)Z", line = 196)
    public final boolean method642(int[] arg0, byte arg1, class69 arg2, byte[] arg3) {
        field1544++;
        boolean var5 = true;
        int var6 = 0;
        class286 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field1530[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method564(arg0, var9 >> 2, -44);
                        } else {
                            var7 = arg2.method568(var9 >> 2, arg0, (byte) -77);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field1549[var8] = var7;
                        this.field1530[var8] = 0;
                    }
                }
            }
        }
        if (arg1 <= 123) {
            this.method642((int[]) null, (byte) -54, (class69) null, (byte[]) null);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Lwh;", line = 285)
    public static final class9 method643(int arg0, int arg1) {
        if (arg1 != -24383) {
            method644(37);
        }
        field1526++;
        return class272.field4674 && arg0 >= class113.field2086 && class61.field1196 >= arg0 ? class70.field1344[arg0 - class113.field2086] : null;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V", line = 322)
    public class83() {
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "([B)V", line = 324)
    public class83(byte[] arg0) {
        this.field1523 = new class242[128];
        this.field1549 = new class286[128];
        this.field1546 = new byte[128];
        this.field1548 = new short[128];
        this.field1547 = new byte[128];
        this.field1530 = new int[128];
        int var2 = 0;
        this.field1531 = new byte[128];
        class13 var3 = new class13(arg0);
        while (var3.field254[var3.field281 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method150((byte) 124);
        }
        var2++;
        var3.field281++;
        int var6 = var3.field281;
        var3.field281 += var2;
        int var7;
        for (var7 = 0; var3.field254[var3.field281 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method150((byte) 123);
        }
        var3.field281++;
        var7++;
        int var10 = 0;
        int var11 = var3.field281;
        var3.field281 += var7;
        while (var3.field254[var3.field281 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method150((byte) 106);
        }
        var3.field281++;
        var10++;
        byte[] var14 = new byte[var10];
        int var15;
        if (var10 <= 1) {
            var15 = var10;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var3.method152((byte) -124);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var18 <= var16) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        }
        class242[] var19 = new class242[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class242 var21 = var19[var20] = new class242();
            int var22 = var3.method152((byte) -121);
            if (var22 > 0) {
                var21.field4197 = new byte[var22 * 2];
            }
            int var23 = var3.method152((byte) -113);
            if (var23 > 0) {
                var21.field4194 = new byte[var23 * 2 + 2];
                var21.field4194[1] = 64;
            }
        }
        int var24 = var3.method152((byte) -86);
        byte[] var25 = var24 <= 0 ? null : new byte[var24 * 2];
        int var26 = var3.method152((byte) -122);
        int var27;
        for (var27 = 0; var3.field254[var3.field281 + var27] != 0; var27++) {
        }
        byte[] var28 = var26 <= 0 ? null : new byte[var26 * 2];
        byte[] var29 = new byte[var27];
        for (int var30 = 0; var30 < var27; var30++) {
            var29[var30] = var3.method150((byte) 99);
        }
        var3.field281++;
        var27++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var3.method152((byte) -108);
            this.field1548[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var3.method152((byte) -115);
            this.field1548[var34] = (short) (this.field1548[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var35 == 0) {
                if (var36 < var29.length) {
                    var35 = var29[var36++];
                } else {
                    var35 = -1;
                }
                var37 = var3.method103((byte) -109);
            }
            var35--;
            this.field1548[var38] = (short) (this.field1548[var38] + class224.method1614(32768, var37 - 1 << 14));
            this.field1530[var38] = var37;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field1530[var42] != 0) {
                if (var40 == 0) {
                    var41 = var3.field254[var6++] - 1;
                    if (var39 >= var4.length) {
                        var40 = -1;
                    } else {
                        var40 = var4[var39++];
                    }
                }
                var40--;
                this.field1547[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field1530[var46] != 0) {
                if (var43 == 0) {
                    var45 = var3.field254[var11++] + 16 << 2;
                    if (var8.length > var44) {
                        var43 = var8[var44++];
                    } else {
                        var43 = -1;
                    }
                }
                this.field1546[var46] = (byte) var45;
                var43--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        class242 var49 = null;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field1530[var50] != 0) {
                if (var47 == 0) {
                    var49 = var19[var14[var48]];
                    if (var48 >= var12.length) {
                        var47 = -1;
                    } else {
                        var47 = var12[var48++];
                    }
                }
                this.field1523[var50] = var49;
                var47--;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var52 == 0) {
                if (var29.length <= var51) {
                    var52 = -1;
                } else {
                    var52 = var29[var51++];
                }
                if (this.field1530[var54] > 0) {
                    var53 = var3.method152((byte) -86) + 1;
                }
            }
            var52--;
            this.field1531[var54] = (byte) var53;
        }
        this.field1536 = var3.method152((byte) -83) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class242 var56 = var19[var55];
            if (var56.field4197 != null) {
                for (int var57 = 1; var57 < var56.field4197.length; var57 += 2) {
                    var56.field4197[var57] = var3.method150((byte) 122);
                }
            }
            if (var56.field4194 != null) {
                for (int var58 = 3; var58 < var56.field4194.length - 2; var58 += 2) {
                    var56.field4194[var58] = var3.method150((byte) 87);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var3.method150((byte) 113);
            }
        }
        if (var28 != null) {
            for (int var60 = 1; var60 < var28.length; var60 += 2) {
                var28[var60] = var3.method150((byte) 89);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class242 var62 = var19[var61];
            if (var62.field4194 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field4194.length; var64 += 2) {
                    var63 = var63 + var3.method152((byte) -107) + 1;
                    var62.field4194[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class242 var66 = var19[var65];
            if (var66.field4197 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field4197.length; var68 += 2) {
                    var67 = var3.method152((byte) -121) + var67 + 1;
                    var66.field4197[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var3.method152((byte) -74);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = var3.method152((byte) -103) + var69 + 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[1];
            byte var72 = var25[0];
            for (int var73 = 0; var73 < var72; var73++) {
                this.field1531[var73] = (byte) (this.field1531[var73] * var71 + 32 >> 6);
            }
            int var74 = 2;
            while (var74 < var25.length) {
                byte var75 = var25[var74 + 1];
                byte var76 = var25[var74];
                var74 += 2;
                int var77 = (var76 - var72) / 2 + (var76 - var72) * var71;
                for (int var78 = var72; var78 < var76; var78++) {
                    int var79 = class232.method1667(0, var76 - var72, var77);
                    var77 += var75 - var71;
                    this.field1531[var78] = (byte) (this.field1531[var78] * var79 + 32 >> 6);
                }
                var71 = var75;
                var72 = var76;
            }
            for (int var80 = var72; var80 < 128; var80++) {
                this.field1531[var80] = (byte) (this.field1531[var80] * var71 + 32 >> 6);
            }
            Object var81 = null;
        }
        if (var28 != null) {
            int var82 = var3.method152((byte) -120);
            var28[0] = (byte) var82;
            for (int var83 = 2; var83 < var28.length; var83 += 2) {
                var82 -= -var3.method152((byte) -83) - 1;
                var28[var83] = (byte) var82;
            }
            byte var84 = var28[0];
            int var85 = var28[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field1546[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field1546[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var28.length > var88) {
                byte var89 = var28[var88];
                int var90 = var28[var88 + 1] << 1;
                int var91 = (var89 - var84) / 2 + (var89 - var84) * var85;
                for (int var92 = var84; var92 < var89; var92++) {
                    int var93 = class232.method1667(0, var89 - var84, var91);
                    var91 += var90 - var85;
                    int var94 = (this.field1546[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field1546[var92] = (byte) var94;
                }
                var84 = var89;
                var88 += 2;
                var85 = var90;
            }
            for (int var95 = var84; var95 < 128; var95++) {
                int var96 = (this.field1546[var95] & 0xFF) + var85;
                if (var96 < 0) {
                    var96 = 0;
                }
                if (var96 > 128) {
                    var96 = 128;
                }
                this.field1546[var95] = (byte) var96;
            }
            Object var97 = null;
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field4193 = var3.method152((byte) -119);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class242 var100 = var19[var99];
            if (var100.field4197 != null) {
                var100.field4189 = var3.method152((byte) -84);
            }
            if (var100.field4194 != null) {
                var100.field4187 = var3.method152((byte) -103);
            }
            if (var100.field4193 > 0) {
                var100.field4190 = var3.method152((byte) -121);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field4195 = var3.method152((byte) -102);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class242 var103 = var19[var102];
            if (var103.field4195 > 0) {
                var103.field4198 = var3.method152((byte) -95);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class242 var105 = var19[var104];
            if (var105.field4198 > 0) {
                var105.field4186 = var3.method152((byte) -99);
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)V", line = 966)
    public static final void method644(int arg0) {
        class17.field353.method1214(-56, 229);
        if (arg0 <= 28) {
            method638(-96);
        }
        field1541++;
        class17.field353.method130(-1, class97.method731(29983));
        class17.field353.method145(92, class13.field290);
        class17.field353.method145(124, class58.field960);
        class43.field700++;
    }
}
