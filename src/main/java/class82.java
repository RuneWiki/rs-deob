import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class82 {

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    private int field1598 = -1;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    private int field1612 = 0;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "Lof;")
    private class145 field1601 = new class145();

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "Z")
    public boolean field1615 = false;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    private int field1609;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    private int field1608;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "[[I")
    private int[][] field1594;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "[Lb;")
    private class11[] field1597;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "Lrd;")
    public static class173 field1603 = class133.method843("Diese Betatest)2Welt ist nur f-Ur eingeladene", 124);

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "Lrd;")
    private static class173 field1613 = class133.method843("To play on this world move to a free area first)3", 64);

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "Lrd;")
    public static class173 field1596 = field1613;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "Lna;")
    public static class130 field1610;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "[Lsa;")
    public static class180[] field1600;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "[Ldh;")
    public static class39[] field1604;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lqf;I)Z")
    public static final boolean method507(class165 arg0, int arg1) {
        field1605++;
        if (class119.field2189) {
            if (class78.method474(arg0, 111) != 0) {
                return false;
            }
            if (arg0.field3077 == 0) {
                return false;
            }
        }
        if (arg1 != -1) {
            field1613 = null;
        }
        return arg0.field3047;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public static void method508(int arg0) {
        if (arg0 != -710177144) {
            return;
        }
        field1610 = null;
        field1600 = null;
        field1604 = null;
        field1603 = null;
        field1596 = null;
        field1613 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIBIIII)V")
    public static final void method509(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg1 + arg6;
        field1611++;
        int var8 = arg3 - arg1;
        int var9 = arg1 + arg5;
        for (int var10 = arg6; var10 < var7; var10++) {
            class51.method350(arg5, arg0, (byte) -121, class107.field1998[var10], arg4);
        }
        int var11 = arg4 - arg1;
        for (int var12 = arg3; var12 > var8; var12--) {
            class51.method350(arg5, arg0, (byte) -128, class107.field1998[var12], arg4);
        }
        if (arg2 > -35) {
            field1604 = null;
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class107.field1998[var13];
            class51.method350(arg5, arg0, (byte) -120, var14, var9);
            class51.method350(var11, arg0, (byte) -118, var14, arg4);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIILdd;Ldd;IIJ)V")
    public static final void method510(int arg0, int arg1, int arg2, int arg3, class35 arg4, class35 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class107 var10 = new class107();
        var10.field1997 = arg8;
        var10.field1999 = arg1 * 128 + 64;
        var10.field1992 = arg2 * 128 + 64;
        var10.field2002 = arg3;
        var10.field1995 = arg4;
        var10.field1987 = arg5;
        var10.field1991 = arg6;
        var10.field1996 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class208.field4055[var11][arg1][arg2] == null) {
                class208.field4055[var11][arg1][arg2] = new class105(var11, arg1, arg2);
            }
        }
        class208.field4055[arg0][arg1][arg2].field1959 = var10;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
    public final void method511(boolean arg0) {
        int var2 = 0;
        if (!arg0) {
            method510(17, 72, 9, -114, null, null, 21, 110, 48L);
        }
        while (this.field1608 > var2) {
            this.field1594[var2] = null;
            var2++;
        }
        field1595++;
        this.field1594 = null;
        this.field1597 = null;
        this.field1601.method916((byte) 110);
        this.field1601 = null;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
    public static final void method512(int arg0) {
        boolean var1 = true;
        class99.method609((byte) -38, false);
        class197.field3834 = 0;
        for (int var2 = 0; var2 < class170.field3299.length; var2++) {
            if (class161.field2992[var2] != -1 && class170.field3299[var2] == null) {
                class170.field3299[var2] = class111.field2054.method142(class161.field2992[var2], 0, (byte) 2);
                if (class170.field3299[var2] == null) {
                    var1 = false;
                    class197.field3834++;
                }
            }
            if (class148.field2826[var2] != -1 && class125.field2342[var2] == null) {
                class125.field2342[var2] = class111.field2054.method144((byte) -72, 0, class148.field2826[var2], class103.field1923[var2]);
                if (class125.field2342[var2] == null) {
                    var1 = false;
                    class197.field3834++;
                }
            }
        }
        field1607++;
        if (!var1) {
            class119.field2185 = 1;
            return;
        }
        boolean var3 = true;
        class217.field4197 = 0;
        for (int var4 = 0; var4 < class170.field3299.length; var4++) {
            byte[] var56 = class125.field2342[var4];
            if (var56 != null) {
                int var57 = (class181.field3559[var4] >> 8) * 64 - class108.field2024;
                int var58 = (class181.field3559[var4] & 0xFF) * 64 - class43.field874;
                if (class60.field1173) {
                    var58 = 10;
                    var57 = 10;
                }
                var3 &= class81.method506(var58, var56, -23, var57);
            }
        }
        if (!var3) {
            class119.field2185 = 2;
            return;
        }
        if (class119.field2185 != 0) {
            class140.method876(class173.method1158(-3, new class173[] { class221.field4252, class124.field2338 }), true, arg0 - 14905);
        }
        class196.method1305(arg0 ^ 0x43);
        class84.method548(16118);
        class196.method1305(arg0 ^ 0x67);
        class124.method799();
        class196.method1305(arg0 - 56);
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class35.field760[var5].method1183((byte) -57);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    class21.field462[var6][var54][var55] = 0;
                }
            }
        }
        class196.method1305(arg0 ^ 0x6B);
        class101.method619((byte) -47);
        int var7 = class170.field3299.length;
        class40.method297((byte) 36);
        class99.method609((byte) -38, true);
        if (!class60.field1173) {
            for (int var8 = 0; var8 < var7; var8++) {
                int var17 = (class181.field3559[var8] & 0xFF) * 64 - class43.field874;
                byte[] var18 = class170.field3299[var8];
                int var19 = (class181.field3559[var8] >> 8) * 64 - class108.field2024;
                if (var18 != null) {
                    class196.method1305(-44);
                    class108.method663(103, class35.field760, var18, var19, (class166.field3206 - 6) * 8, var17, class150.field2850 * 8 - 48);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class181.field3559[var9] >> 8) * 64 - class108.field2024;
                int var15 = (class181.field3559[var9] & 0xFF) * 64 - class43.field874;
                byte[] var16 = class170.field3299[var9];
                if (var16 == null && class150.field2850 < 800) {
                    class196.method1305(-102);
                    class74.method457(var14, 64, 64, -104, var15);
                }
            }
            class99.method609((byte) -38, true);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class125.field2342[var10];
                if (var11 != null) {
                    int var12 = (class181.field3559[var10] >> 8) * 64 - class108.field2024;
                    int var13 = (class181.field3559[var10] & 0xFF) * 64 - class43.field874;
                    class196.method1305(-87);
                    class197.method1313((byte) -121, var13, class35.field760, var11, var12);
                }
            }
        }
        if (class60.field1173) {
            for (int var20 = 0; var20 < 4; var20++) {
                class196.method1305(-117);
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        boolean var36 = false;
                        int var37 = class116.field2145[var20][var34][var35];
                        if (var37 != -1) {
                            int var38 = var37 >> 24 & 0x3;
                            int var39 = var37 >> 1 & 0x3;
                            int var40 = var37 >> 14 & 0x3FF;
                            int var41 = var37 >> 3 & 0x7FF;
                            int var42 = (var40 / 8 << 8) + var41 / 8;
                            for (int var43 = 0; var43 < class181.field3559.length; var43++) {
                                if (class181.field3559[var43] == var42 && class170.field3299[var43] != null) {
                                    class92.method586(var34 * 8, (var41 & 0x7) * 8, var35 * 8, var39, class170.field3299[var43], (var40 & 0x7) * 8, class35.field760, var20, (byte) 62, var38);
                                    var36 = true;
                                    break;
                                }
                            }
                        }
                        if (!var36) {
                            class118.method717(121, var20, var35 * 8, var34 * 8);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class116.field2145[0][var21][var32];
                    if (var33 == -1) {
                        class74.method457(var21 * 8, 8, 8, -62, var32 * 8);
                    }
                }
            }
            class99.method609((byte) -38, true);
            for (int var22 = 0; var22 < 4; var22++) {
                class196.method1305(arg0 ^ 0x29);
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class116.field2145[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 24 & 0x3;
                            int var27 = var25 >> 14 & 0x3FF;
                            int var28 = var25 >> 1 & 0x3;
                            int var29 = var25 >> 3 & 0x7FF;
                            int var30 = (var27 / 8 << 8) + var29 / 8;
                            for (int var31 = 0; var31 < class181.field3559.length; var31++) {
                                if (class181.field3559[var31] == var30 && class125.field2342[var31] != null) {
                                    class101.method620(var28, var26, class125.field2342[var31], (var27 & 0x7) * 8, class35.field760, -17837, var24 * 8, var22, (var29 & 0x7) * 8, var23 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class99.method609((byte) -38, true);
        class84.method548(16118);
        class196.method1305(-55);
        class127.method809(arg0 ^ 0x9194A92, class35.field760);
        class99.method609((byte) -38, true);
        int var44 = class15.field351;
        if (var44 > class172.field3347) {
            var44 = class172.field3347;
        }
        if (var44 < class172.field3347 - 1) {
            int var45 = class172.field3347 - 1;
        }
        if (class107.field2003) {
            class76.method467(class15.field351);
        } else {
            class76.method467(0);
        }
        for (int var46 = 0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                class187.method1256((byte) -90, var46, var53);
            }
        }
        class196.method1305(arg0 - 87);
        class29.method230(2048);
        class84.method548(16118);
        if (class31.field653 != null) {
            class181.field3551++;
            class165.field3175.method1023(10, -21822);
            class165.field3175.method775(arg0 ^ 0xD457022A, 1057001181);
        }
        if (!class60.field1173) {
            int var47 = (class166.field3206 - 6) / 8;
            int var48 = (class150.field2850 - 6) / 8;
            int var49 = (class166.field3206 + 6) / 8;
            int var50 = (class150.field2850 + 6) / 8;
            for (int var51 = var47 - 1; var51 <= var49 + 1; var51++) {
                for (int var52 = var48 - 1; var52 <= var50 + 1; var52++) {
                    if (var47 > var51 || var49 < var51 || var52 < var48 || var52 > var50) {
                        class111.field2054.method137(class173.method1158(-3, new class173[] { class91.field1727, class93.method588(var51, true), class31.field654, class93.method588(var52, true) }), 122);
                        class111.field2054.method137(class173.method1158(arg0 + 3, new class173[] { class43.field875, class93.method588(var51, true), class31.field654, class93.method588(var52, true) }), arg0 ^ 0xFFFFFF8B);
                    }
                }
            }
        }
        class148.method978(30, 8780);
        class196.method1305(-84);
        class30.method237((byte) -42);
        class165.field3175.method1023(126, -21822);
        class199.method1320(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZIBLri;I)V")
    public static final void method513(int arg0, boolean arg1, int arg2, byte arg3, class178 arg4, int arg5) {
        field1614++;
        if (class73.field1421 >= 50 || (arg4.field3511 == null || arg4.field3511.length <= arg2)) {
            return;
        }
        int var6 = arg4.field3511[arg2];
        if (var6 == 0) {
            return;
        }
        int var7 = var6 >> 8;
        if (arg3 != 16) {
            return;
        }
        int var8 = var6 >> 4 & 0x7;
        int var9 = var6 & 0xF;
        if (var9 == 0) {
            if (arg1) {
                class123.method789(var7, 0, var8, 102);
            }
        } else if (class31.field667 != 0) {
            class92.field1741[class73.field1421] = var7;
            class20.field456[class73.field1421] = var8;
            class164.field3027[class73.field1421] = 0;
            int var10 = (arg0 - 64) / 128;
            class178.field3490[class73.field1421] = null;
            int var11 = (arg5 - 64) / 128;
            class119.field2187[class73.field1421] = (var10 << 16) - (-(var11 << 8) - var9);
            class73.field1421++;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)[I")
    public final int[] method514(int arg0, int arg1) {
        field1606++;
        int var3 = -77 / ((arg1 - 57) / 63);
        if (this.field1609 == this.field1608) {
            this.field1615 = this.field1597[arg0] == null;
            this.field1597[arg0] = class71.field1378;
            return this.field1594[arg0];
        } else if (this.field1608 == 1) {
            this.field1615 = this.field1598 != arg0;
            this.field1598 = arg0;
            return this.field1594[0];
        } else {
            class11 var4 = this.field1597[arg0];
            if (this.field1615 = var4 == null) {
                if (this.field1612 < this.field1608) {
                    var4 = new class11(arg0, this.field1612);
                    this.field1612++;
                } else {
                    class11 var5 = (class11) this.field1601.method918(4226);
                    var4 = new class11(arg0, var5.field183);
                    this.field1597[var5.field184] = null;
                    var5.method824((byte) -128);
                }
                this.field1597[arg0] = var4;
            }
            this.field1601.method925(255, var4);
            return this.field1594[var4.field183];
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)[[I")
    public final int[][] method515(int arg0) {
        if (arg0 != -29296) {
            method513(-58, true, -19, (byte) -122, null, -69);
        }
        field1602++;
        if (this.field1609 != this.field1608) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field1608; var2++) {
            this.field1597[var2] = class71.field1378;
        }
        return this.field1594;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIII)V")
    public static final void method516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class194.field3778 <= arg3 && arg4 <= class96.field1766 && arg2 >= class37.field790 && arg0 <= class20.field445) {
            class175.method1168(arg5, arg0, arg2, arg4, 7412, arg3);
        } else {
            class3.method19(-121, arg0, arg4, arg5, arg3, arg2);
        }
        field1599++;
        if (arg1 != 9760) {
            field1600 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(III)V")
    public class82(int arg0, int arg1, int arg2) {
        this.field1609 = arg1;
        this.field1608 = arg0;
        this.field1594 = new int[arg0][arg2];
        this.field1597 = new class11[arg1];
    }
}
