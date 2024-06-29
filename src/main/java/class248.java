import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class248 extends class83 {

    @OriginalMember(owner = "client!oh", name = "F", descriptor = "[Lgd;")
    public class111[] field4076;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "[B")
    public byte[] field4068;

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "[B")
    public byte[] field4071;

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "[I")
    private int[] field4069;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "[B")
    public byte[] field4065;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "[S")
    public short[] field4067;

    @OriginalMember(owner = "client!oh", name = "H", descriptor = "[Lph;")
    public class202[] field4078;

    @OriginalMember(owner = "client!oh", name = "C", descriptor = "I")
    public int field4073;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    public static int field4061 = 0;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "Ljava/lang/String;")
    public static String field4063 = "Allocating memory";

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public static int field4062 = 0;

    @OriginalMember(owner = "client!oh", name = "D", descriptor = "Z")
    public static boolean field4074 = false;

    @OriginalMember(owner = "client!oh", name = "J", descriptor = "I")
    public static int field4080 = 0;

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "[I")
    public static int[] field4070 = new int[1000];

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "Lvf;")
    public static class30 field4058 = new class30(5000);

    @OriginalMember(owner = "client!oh", name = "N", descriptor = "I")
    public static int field4084 = -1;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!oh", name = "B", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!oh", name = "E", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!oh", name = "G", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!oh", name = "I", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!oh", name = "K", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!oh", name = "L", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "Lvh;")
    public static class108 field4060;

    @OriginalMember(owner = "client!oh", name = "M", descriptor = "Lne;")
    public static class78 field4083;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "[S")
    public static short[] field4059;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method1656(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field4079++;
        int var11 = arg6 - arg10;
        if (class203.field3318 > arg6) {
            var11++;
        }
        int var12 = arg9 - arg5;
        if (arg9 < class83.field1514) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var41 = (var13 + 1) * arg8 + arg7 >> 16;
            int var42 = arg7 + (arg8 * var13) >> 16;
            int var43 = var41 - var42;
            if (var43 > 0) {
                int var44 = arg10 + var13 >> 6;
                if (var44 >= 0 && var44 <= class45.field635.length - 1) {
                    int var45 = arg0 + var42;
                    int var46 = arg0 + var41;
                    int[][] var47 = class45.field635[var44];
                    byte[][] var48 = class211.field3567[var44];
                    byte[][] var49 = class24.field384[var44];
                    byte[][] var50 = class262.field4278[var44];
                    byte[][] var51 = class122.field2157[var44];
                    byte[][] var52 = class259.field4244[var44];
                    for (int var53 = 0; var53 < var12; var53++) {
                        int var54 = arg1 + (arg4 * var53) >> 16;
                        int var55 = (var53 + 1) * arg4 + arg1 >> 16;
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = arg5 + var53 >> 6;
                            int var58 = arg2 + var54;
                            int var59 = arg2 + var55;
                            int var60 = arg10 + var13 & 0x3F;
                            int var61 = arg5 + var53 & 0x3F;
                            int var62 = (var61 << 6) + var60;
                            int var63;
                            if (var57 < 0 || var57 > (var47.length - 1) || var47[var57] == null) {
                                if (class158.field2642.field590 != -1) {
                                    var63 = class158.field2642.field590;
                                } else if ((var53 + arg5 & 0x4) == (arg10 + var13 & 0x4)) {
                                    var63 = class92.field1615[class276.field4416 + 1];
                                } else {
                                    var63 = 4936552;
                                }
                                if (var57 < 0 || var57 > var47.length - 1) {
                                    if (var63 == 0) {
                                        var63 = 1;
                                    }
                                    class283.method1855(var45, var58, var43, var56, var63);
                                    continue;
                                }
                            } else {
                                var63 = var47[var57][var62];
                            }
                            int var64 = var50[var57] == null ? 0 : class92.field1615[var50[var57][var62] & 0xFF];
                            int var65 = var48[var57] == null ? 0 : class92.field1615[var48[var57][var62] & 0xFF];
                            if (var63 == 0) {
                                var63 = 1;
                            }
                            if (var65 == 0 && var64 == 0) {
                                class283.method1855(var45, var58, var43, var56, var63);
                            } else {
                                if (var65 != 0) {
                                    if (var65 == -1) {
                                        var65 = 1;
                                    }
                                    byte var66 = var49[var57] == null ? 0 : var49[var57][var62];
                                    int var67 = var66 & 0xFC;
                                    if (var67 == 0 || var43 <= 1 || var56 <= 1) {
                                        class283.method1855(var45, var58, var43, var56, var65);
                                    } else {
                                        class277.method1813(var58, var56, class283.field4490, var66 & 0x3, var65, -100, var67 >> 2, var45, var43, var63, true);
                                    }
                                }
                                if (var64 != 0) {
                                    if (var64 == -1) {
                                        var64 = var63;
                                    }
                                    byte var68 = var51[var57][var62];
                                    int var69 = var68 & 0xFC;
                                    if (var69 == 0 || var43 <= 1 || var56 <= 1) {
                                        class283.method1855(var45, var58, var43, var56, var64);
                                    }
                                    class277.method1813(var58, var56, class283.field4490, var68 & 0x3, var64, -125, var69 >> 2, var45, var43, 0, var65 == 0);
                                }
                            }
                            if (var52[var57] != null) {
                                int var70 = var52[var57][var62] & 0xFF;
                                if (var70 != 0) {
                                    int var71;
                                    if (var43 == 1) {
                                        var71 = var45;
                                    } else {
                                        var71 = var46 - 1;
                                    }
                                    int var72 = 13421772;
                                    int var73;
                                    if (var56 == 1) {
                                        var73 = var58;
                                    } else {
                                        var73 = var59 - 1;
                                    }
                                    if (var70 >= 5 && var70 <= 8 || var70 >= 13 && var70 <= 16 || var70 >= 21 && var70 <= 24 || var70 == 27 || var70 == 28) {
                                        var72 = 13369344;
                                        var70 -= 4;
                                    }
                                    if (var70 == 1) {
                                        class283.method1857(var45, var58, var56, var72);
                                    } else if (var70 == 2) {
                                        class283.method1839(var45, var58, var43, var72);
                                    } else if (var70 == 3) {
                                        class283.method1857(var71, var58, var56, var72);
                                    } else if (var70 == 4) {
                                        class283.method1839(var45, var73, var43, var72);
                                    } else if (var70 == 9) {
                                        class283.method1857(var45, var58, var56, 16777215);
                                        class283.method1839(var45, var58, var43, var72);
                                    } else if (var70 == 10) {
                                        class283.method1857(var71, var58, var56, 16777215);
                                        class283.method1839(var45, var58, var43, var72);
                                    } else if (var70 == 11) {
                                        class283.method1857(var71, var58, var56, 16777215);
                                        class283.method1839(var45, var73, var43, var72);
                                    } else if (var70 == 12) {
                                        class283.method1857(var45, var58, var56, 16777215);
                                        class283.method1839(var45, var73, var43, var72);
                                    } else if (var70 == 17) {
                                        class283.method1839(var45, var58, 1, var72);
                                    } else if (var70 == 18) {
                                        class283.method1839(var71, var58, 1, var72);
                                    } else if (var70 == 19) {
                                        class283.method1839(var71, var73, 1, var72);
                                    } else if (var70 == 20) {
                                        class283.method1839(var45, var73, 1, var72);
                                    } else if (var70 == 25) {
                                        for (int var75 = 0; var75 < var56; var75++) {
                                            class283.method1839(var45 + var75, var73 - var75, 1, var72);
                                        }
                                    } else if (var70 == 26) {
                                        for (int var74 = 0; var74 < var56; var74++) {
                                            class283.method1839(var45 + var74, var58 - -var74, 1, var72);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg0 + var41;
                    int var77 = arg0 + var42;
                    for (int var78 = 0; var78 < var12; var78++) {
                        int var79;
                        if (class158.field2642.field590 != -1) {
                            var79 = class158.field2642.field590;
                        } else if ((arg5 + var78 & 0x4) == (arg10 + var13 & 0x4)) {
                            var79 = class92.field1615[class276.field4416 + 1];
                        } else {
                            var79 = 4936552;
                        }
                        int var80 = (arg1 + (arg4 * var78) >> 16) + arg2;
                        if (var79 == 0) {
                            var79 = 1;
                        }
                        int var81 = (arg1 + ((var78 + 1) * arg4) >> 16) + arg2;
                        int var82 = var81 - var80;
                        class283.method1855(var77, var80, var43, var82, var79);
                    }
                }
            }
        }
        int var14 = -2;
        if (arg3 > -3) {
            field4074 = true;
        }
        while (var11 + 2 > var14) {
            int var15 = arg8 * var14 + arg7 >> 16;
            int var16 = (var14 + 1) * arg8 + arg7 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg0 + var15;
                var10000 = arg0 + var16;
                int var20 = arg10 + var14 >> 6;
                if (var20 >= 0 && (class171.field2810.length - 1) >= var20) {
                    int[][] var21 = class171.field2810[var20];
                    for (int var22 = -2; var22 < var12 + 2; var22++) {
                        int var23 = arg4 * var22 + arg1 >> 16;
                        int var24 = (var22 + 1) * arg4 + arg1 >> 16;
                        int var25 = var24 - var23;
                        if (var25 > 0) {
                            int var26 = arg2 + var23;
                            var10000 = arg2 + var24;
                            int var28 = arg5 + var22 >> 6;
                            if (var28 >= 0 && var28 <= (var21.length - 1)) {
                                int var29 = ((arg5 + var22 & 0x3F) << 6) + (arg10 + var14 & 0x3F);
                                if (var21[var28] != null) {
                                    int var30 = var21[var28][var29];
                                    int var31 = var30 & 0x1FFF;
                                    if (var31 != 0) {
                                        class24 var32 = class175.method1168(var31 - 1, (byte) -45);
                                        boolean var33 = (var30 >> 15 & 0x1) == 1;
                                        int var34 = var30 >> 13 & 0x3;
                                        class148 var35 = var32.method170((byte) -17, var33, var34);
                                        if (var35 != null) {
                                            int var36 = var35.field1709 * var25 / 4;
                                            int var37 = var35.field1711 * var17 / 4;
                                            if (var32.field377) {
                                                int var38 = var30 >> 16 & 0xF;
                                                int var39 = (var30 & 0xFCE61F) >> 20;
                                                if ((var34 & 0x1) == 1) {
                                                    int var40 = var38;
                                                    var38 = var39;
                                                    var39 = var40;
                                                }
                                                var37 = var17 * var38;
                                                var36 = var25 * var39;
                                            }
                                            if (var37 != 0 && var36 != 0) {
                                                if (var32.field371 == 0) {
                                                    var35.method1025(var18, var25 + var26 - var36, var37, var36);
                                                } else {
                                                    var35.method1020(var18, var26 + var25 - var36, var37, var36, var32.field371);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var14++;
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V")
    public final void method1657(int arg0) {
        field4072++;
        this.field4069 = null;
        if (arg0 != 3015) {
            method1659(true);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)Lme;")
    public static final class39 method1658(int arg0, int arg1, int arg2) {
        field4081++;
        for (class39 var3 = (class39) client.field4546.method782(arg0 ^ arg0); var3 != null; var3 = (class39) client.field4546.method788(true)) {
            if (var3.field586 && var3.method266(arg2, arg0 ^ 0x80, arg1)) {
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)V")
    public static void method1659(boolean arg0) {
        field4070 = null;
        field4083 = null;
        field4060 = null;
        field4063 = null;
        field4058 = null;
        field4059 = null;
        if (!arg0) {
            method1658(-24, 108, 98);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BJZ)V")
    public static final void method1660(byte arg0, long arg1, boolean arg2) {
        field4064++;
        if (arg1 == 0L) {
            return;
        }
        if (class90.field1589 >= 100) {
            class97.method612(class152.field2537, -1, 0, "");
            return;
        }
        String var4 = class21.method146(arg1, (byte) 88);
        for (int var5 = 0; var5 < class90.field1589; var5++) {
            if (class237.field3906[var5] == arg1) {
                class97.method612(var4 + class62.field1086, -1, 0, "");
                return;
            }
        }
        if (arg0 >= -109) {
            method1658(-32, -124, 64);
        }
        for (int var6 = 0; var6 < class228.field3837; var6++) {
            if (class280.field4464[var6] == arg1) {
                class97.method612(class295.field4692 + var4 + class11.field157, -1, 0, "");
                return;
            }
        }
        if (var4.equals(class273.field4378.field4601)) {
            class97.method612(class286.field4521, -1, 0, "");
            return;
        }
        class237.field3906[class90.field1589] = arg1;
        class155.field2598[class90.field1589] = class264.method1749(26977, arg1);
        class252.field4137++;
        class188.field3046[class90.field1589++] = arg2;
        class63.field1093 = class222.field3746;
        class168.field2778.method199(60, 118);
        class168.field2778.method640(21691, arg1);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "([I[BZLug;)Z")
    public final boolean method1661(int[] arg0, byte[] arg1, boolean arg2, class185 arg3) {
        field4077++;
        boolean var5 = true;
        int var6 = 0;
        if (arg2) {
            return false;
        }
        class202 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field4069[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg3.method1214(arg0, var9 >> 2, (byte) 22);
                        } else {
                            var7 = arg3.method1215(var9 >> 2, arg0, -5511);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field4078[var8] = var7;
                        this.field4069[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)Z")
    public static final boolean method1662(int arg0, int arg1) {
        if (arg1 <= 34) {
            return false;
        } else {
            field4075++;
            return arg0 >= 0 && class217.field3659.length > arg0 ? class217.field3659[arg0] : false;
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
    public class248() {
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
    public static final byte[] method1663(boolean arg0, Object arg1, int arg2) {
        field4066++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class157.method1082(0, var3) : var3;
        } else if (arg1 instanceof class246) {
            class246 var4 = (class246) arg1;
            return var4.method1644(32106);
        } else if (arg2 >= -15) {
            return null;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "([B)V")
    public class248(byte[] arg0) {
        this.field4076 = new class111[128];
        this.field4068 = new byte[128];
        this.field4071 = new byte[128];
        this.field4069 = new int[128];
        this.field4065 = new byte[128];
        int var2 = 0;
        this.field4067 = new short[128];
        this.field4078 = new class202[128];
        class101 var3 = new class101(arg0);
        while (var3.field1730[var3.field1762 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method646(-104);
        }
        var2++;
        var3.field1762++;
        int var6 = 0;
        int var7 = var3.field1762;
        var3.field1762 += var2;
        while (var3.field1730[var3.field1762 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method646(122);
        }
        var6++;
        int var10 = 0;
        var3.field1762++;
        int var11 = var3.field1762;
        var3.field1762 += var6;
        while (var3.field1730[var3.field1762 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method646(-99);
        }
        var3.field1762++;
        var10++;
        byte[] var14 = new byte[var10];
        int var16;
        if (var10 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var3.method669((byte) 36);
                if (var18 == 0) {
                    var15 = var16++;
                } else {
                    if (var15 >= var18) {
                        var18--;
                    }
                    var15 = var18;
                }
                var14[var17] = (byte) var15;
            }
        } else {
            var16 = var10;
        }
        class111[] var19 = new class111[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class111 var103 = var19[var20] = new class111();
            int var104 = var3.method669((byte) 36);
            if (var104 > 0) {
                var103.field1995 = new byte[var104 * 2];
            }
            int var105 = var3.method669((byte) 36);
            if (var105 > 0) {
                var103.field2002 = new byte[var105 * 2 + 2];
                var103.field2002[1] = 64;
            }
        }
        int var21 = var3.method669((byte) 36);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = var3.method669((byte) 36);
        int var24 = 0;
        byte[] var25 = var23 > 0 ? new byte[var23 * 2] : null;
        while (var3.field1730[var3.field1762 + var24] != 0) {
            var24++;
        }
        byte[] var26 = new byte[var24];
        for (int var27 = 0; var27 < var24; var27++) {
            var26[var27] = var3.method646(83);
        }
        var24++;
        var3.field1762++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var3.method669((byte) 36);
            this.field4067[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method669((byte) 36);
            this.field4067[var31] = (short) (this.field4067[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var26.length <= var33) {
                    var32 = -1;
                } else {
                    var32 = var26[var33++];
                }
                var34 = var3.method660(-110);
            }
            var32--;
            this.field4067[var35] = (short) (this.field4067[var35] + (class113.method791(var34 - 1, 2) << 14));
            this.field4069[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field4069[var39] != 0) {
                if (var37 == 0) {
                    var38 = var3.field1730[var7++] - 1;
                    if (var4.length > var36) {
                        var37 = var4[var36++];
                    } else {
                        var37 = -1;
                    }
                }
                this.field4065[var39] = (byte) var38;
                var37--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field4069[var43] != 0) {
                if (var40 == 0) {
                    if (var8.length <= var41) {
                        var40 = -1;
                    } else {
                        var40 = var8[var41++];
                    }
                    var42 = var3.field1730[var11++] + 16 << 2;
                }
                var40--;
                this.field4068[var43] = (byte) var42;
            }
        }
        int var44 = 0;
        class111 var45 = null;
        int var46 = 0;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field4069[var47] != 0) {
                if (var46 == 0) {
                    var45 = var19[var14[var44]];
                    if (var44 >= var12.length) {
                        var46 = -1;
                    } else {
                        var46 = var12[var44++];
                    }
                }
                var46--;
                this.field4076[var47] = var45;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var48 >= var26.length) {
                    var49 = -1;
                } else {
                    var49 = var26[var48++];
                }
                if (this.field4069[var51] > 0) {
                    var50 = var3.method669((byte) 36) + 1;
                }
            }
            this.field4071[var51] = (byte) var50;
            var49--;
        }
        this.field4073 = var3.method669((byte) 36) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class111 var100 = var19[var52];
            if (var100.field1995 != null) {
                for (int var101 = 1; var101 < var100.field1995.length; var101 += 2) {
                    var100.field1995[var101] = var3.method646(-26);
                }
            }
            if (var100.field2002 != null) {
                for (int var102 = 3; var102 < (var100.field2002.length - 2); var102 += 2) {
                    var100.field2002[var102] = var3.method646(-23);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var3.method646(-21);
            }
        }
        if (var25 != null) {
            for (int var54 = 1; var54 < var25.length; var54 += 2) {
                var25[var54] = var3.method646(100);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class111 var97 = var19[var55];
            if (var97.field2002 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field2002.length; var99 += 2) {
                    var98 = var98 + var3.method669((byte) 36) + 1;
                    var97.field2002[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class111 var94 = var19[var56];
            if (var94.field1995 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field1995.length; var96 += 2) {
                    var95 = var95 + var3.method669((byte) 36) + 1;
                    var94.field1995[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var3.method669((byte) 36);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 -= -var3.method669((byte) 36) - 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[1];
            byte var60 = var22[0];
            for (int var61 = 0; var61 < var60; var61++) {
                this.field4071[var61] = (byte) (this.field4071[var61] * var59 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                var62 += 2;
                int var67 = (var65 - var60) * var59 + ((var65 - var60) / 2);
                for (int var68 = var60; var68 < var65; var68++) {
                    int var69 = class125.method855(var67, var65 - var60, -574241313);
                    this.field4071[var68] = (byte) (this.field4071[var68] * var69 + 32 >> 6);
                    var67 += var66 - var59;
                }
                var60 = var65;
                var59 = var66;
            }
            Object var63 = null;
            for (int var64 = var60; var64 < 128; var64++) {
                this.field4071[var64] = (byte) (this.field4071[var64] * var59 + 32 >> 6);
            }
        }
        if (var25 != null) {
            int var70 = var3.method669((byte) 36);
            var25[0] = (byte) var70;
            for (int var71 = 2; var71 < var25.length; var71 += 2) {
                var70 += var3.method669((byte) 36) + 1;
                var25[var71] = (byte) var70;
            }
            byte var72 = var25[0];
            int var73 = var25[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field4068[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field4068[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var25.length > var75) {
                byte var79 = var25[var75];
                int var80 = var25[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class125.method855(var81, var79 - var72, -574241313);
                    var81 += var80 - var73;
                    int var84 = (this.field4068[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field4068[var82] = (byte) var84;
                }
                var75 += 2;
                var72 = var79;
                var73 = var80;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field4068[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field4068[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field1994 = var3.method669((byte) 36);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class111 var93 = var19[var87];
            if (var93.field1995 != null) {
                var93.field2004 = var3.method669((byte) 36);
            }
            if (var93.field2002 != null) {
                var93.field1998 = var3.method669((byte) 36);
            }
            if (var93.field1994 > 0) {
                var93.field1993 = var3.method669((byte) 36);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field2001 = var3.method669((byte) 36);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class111 var92 = var19[var89];
            if (var92.field2001 > 0) {
                var92.field2006 = var3.method669((byte) 36);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class111 var91 = var19[var90];
            if (var91.field2006 > 0) {
                var91.field2008 = var3.method669((byte) 36);
            }
        }
    }
}
