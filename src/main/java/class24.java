import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class24 extends class128 {

    @OriginalMember(owner = "client!db", name = "E", descriptor = "[I")
    private int[] field585;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "[S")
    public short[] field578;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "[Lm;")
    public class83[] field590;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "[B")
    public byte[] field575;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "[Lkc;")
    public class72[] field582;

    @OriginalMember(owner = "client!db", name = "O", descriptor = "[B")
    public byte[] field595;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "[B")
    public byte[] field580;

    @OriginalMember(owner = "client!db", name = "P", descriptor = "I")
    public int field596;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "Lid;")
    private static class60 field577 = class11.method72("Loaded fonts", (byte) 0);

    @OriginalMember(owner = "client!db", name = "y", descriptor = "Z")
    public static boolean field579 = false;

    @OriginalMember(owner = "client!db", name = "L", descriptor = "Lid;")
    public static class60 field592 = field577;

    @OriginalMember(owner = "client!db", name = "I", descriptor = "Lid;")
    private static class60 field589 = class11.method72("Hidden", (byte) 125);

    @OriginalMember(owner = "client!db", name = "G", descriptor = "Lid;")
    public static class60 field587 = field589;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "Lid;")
    public static class60 field584 = class11.method72("", (byte) 103);

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!db", name = "K", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!db", name = "M", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!db", name = "S", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!db", name = "N", descriptor = "Lfd;")
    public static class40 field594;

    @OriginalMember(owner = "client!db", name = "R", descriptor = "Lie;")
    public static class61 field598;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "Lnc;")
    public static class93 field588;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "[I")
    public static int[] field581;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V")
    public static final void method184(boolean arg0) {
        field583++;
        try {
            if (class60.field1470 == null) {
                class60.field1470 = new class80(class116.field2731, class104.method853(-126, new class60[] { class158.field3618, class94.field2311, class124.field2865 }).method452(-126));
            } else {
                byte[] var1 = class60.field1470.method678(-86);
                if (var1 != null) {
                    class103 var2 = new class103(var1);
                    class47.field1240 = var2.method808(-20054);
                    class80.field1986 = new class30[class47.field1240];
                    for (int var3 = 0; var3 < class47.field1240; var3++) {
                        class30 var4 = class80.field1986[var3] = new class30();
                        int var5 = var2.method808(-20054);
                        var4.field703 = var5 & 0x7FFF;
                        var4.field699 = (var5 & 0x8000) != 0;
                        var4.field710 = var2.method841(27330);
                        var4.field715 = var2.method821(2);
                        var4.field714 = var3;
                        var4.field713 = class112.method903(var4.field710, -18746);
                    }
                    class43.method341(class105.field2588, class80.field1986.length - 1, class25.field619, 113, 0, class80.field1986);
                    class60.field1470 = null;
                    class129.field2937 = true;
                }
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class60.field1470 = null;
        }
        if (arg0) {
            method187(-101, true);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIII)I")
    public static final int method185(int arg0, int arg1, int arg2, int arg3) {
        field597++;
        int var4 = arg2 / arg3;
        int var5 = arg2 & arg3 - 1;
        int var6 = arg0 / arg3;
        int var7 = arg0 & arg1 + arg3;
        int var8 = class51.method383(arg1 ^ 0xFFFFFFB8, var4, var6);
        int var9 = class51.method383(arg1 ^ 0xFFFFFFAC, var4 + 1, var6);
        int var10 = class51.method383(122, var4, var6 + 1);
        int var11 = class51.method383(94, var4 + 1, var6 + 1);
        int var12 = class146.method1114(var8, arg3, var5, 65536, var9);
        int var13 = class146.method1114(var10, arg3, var5, 65536, var11);
        return class146.method1114(var12, arg3, var7, 65536, var13);
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(Z)V")
    public final void method186(boolean arg0) {
        if (arg0) {
            field592 = null;
        }
        this.field585 = null;
        field599++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IZ)Ltd;")
    public static final class136 method187(int arg0, boolean arg1) {
        field593++;
        class136 var2 = (class136) class112.field2685.method918(104, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class153.field3432.method473((byte) 127, 5, arg0);
        class136 var4 = new class136();
        if (var3 != null) {
            var4.method1063((byte) -90, new class103(var3));
        }
        if (arg1) {
            method184(false);
        }
        class112.field2685.method914(var4, (long) arg0, (byte) 111);
        return var4;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lkd;[I[BI)Z")
    public final boolean method188(class73 arg0, int[] arg1, byte[] arg2, int arg3) {
        field591++;
        int var5 = 0;
        boolean var6 = true;
        class83 var7 = null;
        for (int var8 = arg3; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field585[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg0.method557(-1192542204, var9 >> 2, arg1);
                        } else {
                            var7 = arg0.method561(arg1, var9 >> 2, true);
                        }
                        if (var7 == null) {
                            var6 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field590[var8] = var7;
                        this.field585[var8] = 0;
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
    public class24() {
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
    public static void method189(int arg0) {
        field588 = null;
        field594 = null;
        field589 = null;
        field581 = null;
        field598 = null;
        if (arg0 != 1) {
            method185(-45, 13, 8, 17);
        }
        field577 = null;
        field584 = null;
        field587 = null;
        field592 = null;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "([B)V")
    public class24(byte[] arg0) {
        this.field585 = new int[128];
        this.field578 = new short[128];
        this.field590 = new class83[128];
        this.field575 = new byte[128];
        int var2 = 0;
        this.field582 = new class72[128];
        this.field595 = new byte[128];
        this.field580 = new byte[128];
        class103 var3 = new class103(arg0);
        while (var3.field2498[var3.field2501 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method843(true);
        }
        var3.field2501++;
        int var6 = var3.field2501;
        var2++;
        int var7 = 0;
        var3.field2501 += var2;
        while (var3.field2498[var3.field2501 + var7] != 0) {
            var7++;
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method843(true);
        }
        var7++;
        int var10 = 0;
        var3.field2501++;
        int var11 = var3.field2501;
        var3.field2501 += var7;
        while (var3.field2498[var3.field2501 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method843(true);
        }
        var3.field2501++;
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
                int var105 = var3.method829((byte) -110);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var105) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class72[] var18 = new class72[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class72 var102 = var18[var19] = new class72();
            int var103 = var3.method829((byte) -85);
            if (var103 > 0) {
                var102.field1738 = new byte[var103 * 2];
            }
            int var104 = var3.method829((byte) -114);
            if (var104 > 0) {
                var102.field1736 = new byte[var104 * 2 + 2];
                var102.field1736[1] = 64;
            }
        }
        int var20 = var3.method829((byte) 124);
        int var21 = 0;
        byte[] var22 = var20 <= 0 ? null : new byte[var20 * 2];
        int var23 = var3.method829((byte) 40);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        while (var3.field2498[var3.field2501 + var21] != 0) {
            var21++;
        }
        byte[] var25 = new byte[var21];
        for (int var26 = 0; var26 < var21; var26++) {
            var25[var26] = var3.method843(true);
        }
        var21++;
        int var27 = 0;
        var3.field2501++;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var3.method829((byte) -78);
            this.field578[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var3.method829((byte) 104);
            this.field578[var30] = (short) (this.field578[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var33 == 0) {
                if (var31 >= var25.length) {
                    var33 = -1;
                } else {
                    var33 = var25[var31++];
                }
                var32 = var3.method798((byte) -111);
            }
            this.field578[var34] = (short) (this.field578[var34] + (class80.method680(2, var32 - 1) << 14));
            var33--;
            this.field585[var34] = var32;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field585[var38] != 0) {
                if (var36 == 0) {
                    var37 = var3.field2498[var6++] - 1;
                    if (var35 < var4.length) {
                        var36 = var4[var35++];
                    } else {
                        var36 = -1;
                    }
                }
                var36--;
                this.field595[var38] = (byte) var37;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field585[var42] != 0) {
                if (var39 == 0) {
                    var40 = var3.field2498[var11++] + 16 << 2;
                    if (var41 >= var8.length) {
                        var39 = -1;
                    } else {
                        var39 = var8[var41++];
                    }
                }
                this.field575[var42] = (byte) var40;
                var39--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class72 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field585[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var43 < var12.length) {
                        var44 = var12[var43++];
                    } else {
                        var44 = -1;
                    }
                }
                var44--;
                this.field582[var46] = var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var47 == 0) {
                if (var48 >= var25.length) {
                    var47 = -1;
                } else {
                    var47 = var25[var48++];
                }
                if (this.field585[var50] > 0) {
                    var49 = var3.method829((byte) -94) + 1;
                }
            }
            var47--;
            this.field580[var50] = (byte) var49;
        }
        this.field596 = var3.method829((byte) -112) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class72 var99 = var18[var51];
            if (var99.field1738 != null) {
                for (int var100 = 1; var100 < var99.field1738.length; var100 += 2) {
                    var99.field1738[var100] = var3.method843(true);
                }
            }
            if (var99.field1736 != null) {
                for (int var101 = 3; var101 < var99.field1736.length - 2; var101 += 2) {
                    var99.field1736[var101] = var3.method843(true);
                }
            }
        }
        if (var22 != null) {
            for (int var52 = 1; var52 < var22.length; var52 += 2) {
                var22[var52] = var3.method843(true);
            }
        }
        if (var24 != null) {
            for (int var53 = 1; var53 < var24.length; var53 += 2) {
                var24[var53] = var3.method843(true);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class72 var96 = var18[var54];
            if (var96.field1736 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field1736.length; var98 += 2) {
                    var97 = var3.method829((byte) 73) + var97 + 1;
                    var96.field1736[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class72 var93 = var18[var55];
            if (var93.field1738 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field1738.length; var95 += 2) {
                    var94 = var3.method829((byte) 60) + var94 + 1;
                    var93.field1738[var95] = (byte) var94;
                }
            }
        }
        if (var22 != null) {
            int var56 = var3.method829((byte) 92);
            var22[0] = (byte) var56;
            for (int var57 = 2; var57 < var22.length; var57 += 2) {
                var56 += var3.method829((byte) 63) + 1;
                var22[var57] = (byte) var56;
            }
            byte var58 = var22[0];
            byte var59 = var22[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field580[var60] = (byte) (this.field580[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var22.length > var61) {
                byte var64 = var22[var61 + 1];
                byte var65 = var22[var61];
                var61 += 2;
                int var66 = (var65 - var58) / 2 + (var65 - var58) * var59;
                for (int var67 = var58; var67 < var65; var67++) {
                    int var68 = class77.method625(61, var66, var65 - var58);
                    var66 += var64 - var59;
                    this.field580[var67] = (byte) (this.field580[var67] * var68 + 32 >> 6);
                }
                var59 = var64;
                var58 = var65;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field580[var62] = (byte) (this.field580[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var24 != null) {
            int var69 = var3.method829((byte) -87);
            var24[0] = (byte) var69;
            for (int var70 = 2; var70 < var24.length; var70 += 2) {
                var69 += var3.method829((byte) -118) + 1;
                var24[var70] = (byte) var69;
            }
            int var71 = var24[1] << 1;
            byte var72 = var24[0];
            for (int var73 = 0; var73 < var72; var73++) {
                int var84 = (this.field575[var73] & 0xFF) + var71;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field575[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var24.length) {
                int var78 = var24[var74 + 1] << 1;
                byte var79 = var24[var74];
                var74 += 2;
                int var80 = (var79 - var72) / 2 + (var79 - var72) * var71;
                for (int var81 = var72; var81 < var79; var81++) {
                    int var82 = class77.method625(109, var80, var79 - var72);
                    var80 += var78 - var71;
                    int var83 = (this.field575[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field575[var81] = (byte) var83;
                }
                var71 = var78;
                var72 = var79;
            }
            Object var75 = null;
            for (int var76 = var72; var76 < 128; var76++) {
                int var77 = (this.field575[var76] & 0xFF) + var71;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field575[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field1734 = var3.method829((byte) 68);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class72 var92 = var18[var86];
            if (var92.field1738 != null) {
                var92.field1741 = var3.method829((byte) -121);
            }
            if (var92.field1736 != null) {
                var92.field1750 = var3.method829((byte) -86);
            }
            if (var92.field1734 > 0) {
                var92.field1744 = var3.method829((byte) -82);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field1743 = var3.method829((byte) 117);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class72 var91 = var18[var88];
            if (var91.field1743 > 0) {
                var91.field1735 = var3.method829((byte) -87);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class72 var90 = var18[var89];
            if (var90.field1735 > 0) {
                var90.field1737 = var3.method829((byte) 94);
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method190(int arg0, String arg1) throws ClassNotFoundException {
        field586++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else {
            if (arg0 > -41) {
                field598 = null;
            }
            if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }
}
