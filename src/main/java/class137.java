import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class137 extends class376 {

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "[B")
    public byte[] field1953;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "[B")
    public byte[] field1960;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "[I")
    private int[] field1945;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "[S")
    public short[] field1956;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "[Leg;")
    public class56[] field1948;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "[B")
    public byte[] field1952;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "[Lfj;")
    public class394[] field1947;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    public int field1957;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "[[I")
    public static int[][] field1949 = new int[128][128];

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "[[I")
    public static int[][] field1961 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "[Z")
    public static boolean[] field1958;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(B)V", line = 3)
    public static void method940(byte arg0) {
        if (arg0 != 38) {
            field1961 = null;
        }
        field1949 = null;
        field1958 = null;
        field1961 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I[B[ILtf;)Z", line = 19)
    public final boolean method941(int arg0, byte[] arg1, int[] arg2, class162 arg3) {
        field1951++;
        boolean var5 = true;
        int var6 = arg0;
        class56 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field1945[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg3.method1074(var9 >> 2, arg2, -42);
                        } else {
                            var7 = arg3.method1072(var9 >> 2, arg2, 87);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field1948[var8] = var7;
                        this.field1945[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(B)V", line = 77)
    public static final void method942(byte arg0) {
        class31.method240(false, (byte) 37);
        field1955++;
        class448.field6481 = 0;
        boolean var1 = true;
        int var2 = 0;
        if (arg0 != -23) {
            return;
        }
        while (class387.field5635.length > var2) {
            if (class383.field5490[var2] != -1 && class387.field5635[var2] == null) {
                class387.field5635[var2] = class215.field2857.method1920(0, false, class383.field5490[var2]);
                if (class387.field5635[var2] == null) {
                    var1 = false;
                    class448.field6481++;
                }
            }
            if (class108.field1599[var2] != -1 && class237.field3223[var2] == null) {
                class237.field3223[var2] = class215.field2857.method1900((byte) 26, class62.field974[var2], 0, class108.field1599[var2]);
                if (class237.field3223[var2] == null) {
                    var1 = false;
                    class448.field6481++;
                }
            }
            if (class419.field6060[var2] != -1 && class149.field2149[var2] == null) {
                class149.field2149[var2] = class215.field2857.method1920(0, false, class419.field6060[var2]);
                if (class149.field2149[var2] == null) {
                    var1 = false;
                    class448.field6481++;
                }
            }
            if (class279.field3781[var2] != -1 && class322.field4418[var2] == null) {
                class322.field4418[var2] = class215.field2857.method1920(0, false, class279.field3781[var2]);
                if (class322.field4418[var2] == null) {
                    class448.field6481++;
                    var1 = false;
                }
            }
            if (class191.field2656 != null && class245.field3391[var2] == null && class191.field2656[var2] != -1) {
                class245.field3391[var2] = class215.field2857.method1900((byte) 26, class62.field974[var2], 0, class191.field2656[var2]);
                if (class245.field3391[var2] == null) {
                    var1 = false;
                    class448.field6481++;
                }
            }
            var2++;
        }
        if (class73.field1137 == null) {
            if (class125.field1755 == null || !class441.field6379.method1893(class125.field1755.field1766 + "_staticelements", (byte) 44)) {
                class73.field1137 = new class249(0);
            } else if (class441.field6379.method1906(class125.field1755.field1766 + "_staticelements", 104)) {
                class73.field1137 = class192.method1275(class293.field4055, class125.field1755.field1766 + "_staticelements", class441.field6379, -59);
            } else {
                var1 = false;
                class448.field6481++;
            }
        }
        if (!var1) {
            class265.field3626 = 1;
            return;
        }
        boolean var3 = true;
        class64.field989 = 0;
        for (int var4 = 0; var4 < class387.field5635.length; var4++) {
            byte[] var20 = class237.field3223[var4];
            if (var20 != null) {
                int var21 = (class324.field4432[var4] >> 8) * 64 - class449.field6509;
                int var22 = (class324.field4432[var4] & 0xFF) * 64 - class354.field4981;
                if (class64.field988) {
                    var22 = 10;
                    var21 = 10;
                }
                var3 &= class5.method45(var22, var21, 63, var20);
            }
            byte[] var23 = class322.field4418[var4];
            if (var23 != null) {
                int var24 = (class324.field4432[var4] >> 8) * 64 - class449.field6509;
                int var25 = (class324.field4432[var4] & 0xFF) * 64 - class354.field4981;
                if (class64.field988) {
                    var24 = 10;
                    var25 = 10;
                }
                var3 &= class5.method45(var25, var24, arg0 ^ 0xFFFFFF83, var23);
            }
        }
        if (!var3) {
            class265.field3626 = 2;
            return;
        }
        if (class265.field3626 != 0) {
            class176.method1176(class75.field1163 + "<br>(100%)", true, false, class216.field2867);
        }
        class154.method1038(0);
        class33.method246(arg0 ^ 0x16);
        boolean var5 = false;
        if (class408.field5920.method1728() && class406.field5904) {
            for (int var6 = 0; var6 < class387.field5635.length; var6++) {
                if (class322.field4418[var6] != null || class149.field2149[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class72.field1114) {
            var7 = class164.field2306[class127.field1782];
        } else {
            var7 = class214.field2851[class127.field1782];
        }
        if (class408.field5920.method1746()) {
            var7++;
        }
        class204.method1340(4, class432.field6220, class267.field3646, var7, var5, class408.field5920.method1797() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class24.field326[var8].method24((byte) -117);
        }
        class196.method1305((byte) 127);
        class67.method455(arg0 ^ 0x68, false);
        class15.method88(arg0 ^ 0xFFFFFFE9);
        class154.method1038(0);
        System.gc();
        class31.method240(true, (byte) 37);
        class197.method1318(false, 4, (byte) -60);
        int[][] var9 = null;
        if (!class64.field988) {
            class374.method2449(false, 79);
            class280.method1719((byte) 29, class307.field4211.field944[0] >> 3, class307.field4211.field956[0] >> 3);
            class382.method2491(9);
            class315.method2011(4, class408.field5920, false, (int[][]) null, arg0 ^ 0x41);
            var9 = class418.field6051[0];
            class31.method240(true, (byte) 37);
            class157.method1053(false, -108);
            if (class245.field3391 != null) {
                class321.method2031((byte) 79);
            }
        }
        if (class64.field988) {
            class432.method2716(6217080, false);
            class280.method1719((byte) 27, class307.field4211.field944[0] >> 3, class307.field4211.field956[0] >> 3);
            class382.method2491(9);
            class315.method2011(4, class408.field5920, false, (int[][]) null, -88);
            var9 = class418.field6051[0];
            class31.method240(true, (byte) 37);
            class442.method2766(false, true);
        }
        class33.method246(-1);
        class31.method240(true, (byte) 37);
        class120.method813(4, class408.field5920, arg0 ^ 0xFFFFFFE9, false, class24.field326, (class156) null);
        class77.method556(4, 1, class408.field5920);
        class31.method240(true, (byte) 37);
        int var10 = class180.field2518;
        if (class265.field3617 < var10) {
            var10 = class265.field3617;
        }
        if ((class265.field3617 - 1) > var10) {
            var10 = class265.field3617 - 1;
        }
        if (class67.method457(31862)) {
            class162.method1077(0);
        } else {
            class162.method1077(var10);
        }
        class82.method582((byte) -79);
        if (var5) {
            client.method1112(true);
            class197.method1318(true, 1, (byte) -60);
            if (!class64.field988) {
                class374.method2449(true, 85);
                class315.method2011(1, class408.field5920, true, var9, -128);
                class31.method240(true, (byte) 37);
                class157.method1053(true, arg0 ^ 0x6B);
                class77.method556(1, arg0 ^ 0xFFFFFFE8, class408.field5920);
            }
            if (class64.field988) {
                class432.method2716(6217080, true);
                class315.method2011(1, class408.field5920, true, var9, -110);
                class31.method240(true, (byte) 37);
                class442.method2766(true, true);
            }
            class33.method246(-1);
            class31.method240(true, (byte) 37);
            class120.method813(1, class408.field5920, 0, true, class24.field326, class156.field2213[0]);
            class77.method556(1, 1, class408.field5920);
            class31.method240(true, (byte) 37);
            class82.method582((byte) 119);
            client.method1112(false);
        }
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var18 = 0; var18 < class432.field6220; var18++) {
                for (int var19 = 0; var19 < class267.field3646; var19++) {
                    class192.method1276(-18330, var18, var11, var19);
                }
            }
        }
        class15.method89(-6);
        class154.method1038(arg0 ^ 0xFFFFFFE9);
        class53.method361((byte) -91);
        class33.method246(arg0 ^ 0x16);
        class230.field3086 = false;
        class156.method1047(true);
        if (class393.field5746 != null && class199.field2749 != null && class79.field1220 == 25) {
            class182.field2557++;
            class442.field6400.method158((byte) 7, 120);
            class442.field6400.method2386(1057001181, 19324);
        }
        if (!class64.field988) {
            int var12 = (class419.field6055 - (class432.field6220 >> 4)) / 8;
            int var13 = ((class432.field6220 >> 4) + class419.field6055) / 8;
            int var14 = (class430.field6183 - (class267.field3646 >> 4)) / 8;
            int var15 = ((class267.field3646 >> 4) + class430.field6183) / 8;
            for (int var16 = var12 - 1; var16 <= (var13 + 1); var16++) {
                for (int var17 = var14 - 1; var17 <= (var15 + 1); var17++) {
                    if (var12 > var16 || var13 < var16 || var17 < var14 || var17 > var15) {
                        class215.field2857.method1886(arg0 - 21, "m" + var16 + "_" + var17);
                        class215.field2857.method1886(60, "l" + var16 + "_" + var17);
                    }
                }
            }
        }
        if (class79.field1220 == 28) {
            class312.method1977(10, (byte) 127);
        } else {
            class312.method1977(30, (byte) -64);
            if (class199.field2749 != null) {
                class442.field6400.method158((byte) 7, 8);
            }
        }
        class35.method259(-1);
        class154.method1038(arg0 ^ 0xFFFFFFE9);
        class312.method1982((byte) 91);
    }

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "(B)Lpb;", line = 509)
    public static final class393 method943(byte arg0) {
        field1954++;
        if (arg0 >= -33) {
            return null;
        }
        try {
            return (class393) Class.forName("vj").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)V", line = 528)
    public final void method944(int arg0) {
        field1946++;
        if (arg0 != 4) {
            this.field1960 = null;
        }
        this.field1945 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZ)V", line = 543)
    public static final void method945(int arg0, boolean arg1) {
        field1959++;
        if (class436.field6253 == arg1) {
            return;
        }
        if (arg0 >= -98) {
            method946(46, 27);
        }
        class436.field6253 = arg1;
        class144.method989(-114);
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V", line = 560)
    public class137() {
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)I", line = 563)
    public static final int method946(int arg0, int arg1) {
        field1950++;
        if (arg1 >= -58) {
            field1961 = null;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "([B)V", line = 575)
    public class137(byte[] arg0) {
        this.field1953 = new byte[128];
        this.field1960 = new byte[128];
        this.field1945 = new int[128];
        this.field1956 = new short[128];
        this.field1948 = new class56[128];
        this.field1952 = new byte[128];
        this.field1947 = new class394[128];
        class371 var2 = new class371(arg0);
        int var3;
        for (var3 = 0; var2.field5258[var2.field5273 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method2418(-21337);
        }
        var3++;
        var2.field5273++;
        int var6 = var2.field5273;
        var2.field5273 += var3;
        int var7;
        for (var7 = 0; var2.field5258[var2.field5273 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method2418(-21337);
        }
        var2.field5273++;
        var7++;
        int var10 = var2.field5273;
        var2.field5273 += var7;
        int var11;
        for (var11 = 0; var2.field5258[var2.field5273 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method2418(-21337);
        }
        var2.field5273++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method2429(0);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var18) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        } else {
            var15 = var11;
        }
        class394[] var19 = new class394[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class394 var103 = var19[var20] = new class394();
            int var104 = var2.method2429(0);
            if (var104 > 0) {
                var103.field5761 = new byte[var104 * 2];
            }
            int var105 = var2.method2429(0);
            if (var105 > 0) {
                var103.field5760 = new byte[var105 * 2 + 2];
                var103.field5760[1] = 64;
            }
        }
        int var21 = var2.method2429(0);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = var2.method2429(0);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        int var25;
        for (var25 = 0; var2.field5258[var2.field5273 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method2418(-21337);
        }
        var25++;
        var2.field5273++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method2429(0);
            this.field1956[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method2429(0);
            this.field1956[var31] = (short) (this.field1956[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var26.length > var33) {
                    var32 = var26[var33++];
                } else {
                    var32 = -1;
                }
                var34 = var2.method2401((byte) -128);
            }
            this.field1956[var35] = (short) (this.field1956[var35] + class318.method2028(var34 - 1 << 14, 32768));
            this.field1945[var35] = var34;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field1945[var39] != 0) {
                if (var37 == 0) {
                    var38 = var2.field5258[var6++] - 1;
                    if (var4.length > var36) {
                        var37 = var4[var36++];
                    } else {
                        var37 = -1;
                    }
                }
                var37--;
                this.field1952[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field1945[var43] != 0) {
                if (var40 == 0) {
                    if (var41 < var8.length) {
                        var40 = var8[var41++];
                    } else {
                        var40 = -1;
                    }
                    var42 = var2.field5258[var10++] + 16 << 2;
                }
                this.field1953[var43] = (byte) var42;
                var40--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class394 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field1945[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var12.length > var45) {
                        var44 = var12[var45++];
                    } else {
                        var44 = -1;
                    }
                }
                this.field1947[var47] = var46;
                var44--;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var48 < var26.length) {
                    var49 = var26[var48++];
                } else {
                    var49 = -1;
                }
                if (this.field1945[var51] > 0) {
                    var50 = var2.method2429(0) + 1;
                }
            }
            var49--;
            this.field1960[var51] = (byte) var50;
        }
        this.field1957 = var2.method2429(0) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class394 var100 = var19[var52];
            if (var100.field5761 != null) {
                for (int var101 = 1; var101 < var100.field5761.length; var101 += 2) {
                    var100.field5761[var101] = var2.method2418(-21337);
                }
            }
            if (var100.field5760 != null) {
                for (int var102 = 3; var102 < (var100.field5760.length - 2); var102 += 2) {
                    var100.field5760[var102] = var2.method2418(-21337);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method2418(-21337);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method2418(-21337);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class394 var97 = var19[var55];
            if (var97.field5760 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field5760.length; var99 += 2) {
                    var98 = var2.method2429(0) + var98 + 1;
                    var97.field5760[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class394 var94 = var19[var56];
            if (var94.field5761 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field5761.length; var96 += 2) {
                    var95 = var2.method2429(0) + var95 + 1;
                    var94.field5761[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method2429(0);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = (var57 + var2.method2429(0)) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field1960[var61] = (byte) (this.field1960[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class204.method1338(10144, var65 - var59, var67);
                    var67 += var66 - var60;
                    this.field1960[var68] = (byte) (this.field1960[var68] * var69 + 32 >> 6);
                }
                var60 = var66;
                var62 += 2;
                var59 = var65;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field1960[var63] = (byte) (this.field1960[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var24 != null) {
            int var70 = var2.method2429(0);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var70 + var2.method2429(0) + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field1953[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field1953[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var24.length) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class204.method1338(10144, var79 - var72, var81);
                    int var84 = (this.field1953[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    var81 += var80 - var73;
                    this.field1953[var82] = (byte) var84;
                }
                var75 += 2;
                var73 = var80;
                var72 = var79;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field1953[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field1953[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field5765 = var2.method2429(0);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class394 var93 = var19[var87];
            if (var93.field5761 != null) {
                var93.field5758 = var2.method2429(0);
            }
            if (var93.field5760 != null) {
                var93.field5756 = var2.method2429(0);
            }
            if (var93.field5765 > 0) {
                var93.field5759 = var2.method2429(0);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field5768 = var2.method2429(0);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class394 var92 = var19[var89];
            if (var92.field5768 > 0) {
                var92.field5767 = var2.method2429(0);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class394 var91 = var19[var90];
            if (var91.field5767 > 0) {
                var91.field5770 = var2.method2429(0);
            }
        }
    }
}
