import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class22 extends class134 {

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "[Lff;")
    public class19[] field355 = new class19[5];

    @OriginalMember(owner = "client!pc", name = "H", descriptor = "[I")
    public int[] field367 = new int[5];

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "I")
    public int field378 = 0;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
    public int field357;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    public int field353;

    @OriginalMember(owner = "client!pc", name = "C", descriptor = "I")
    public int field362;

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
    public int field359;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "Ljava/lang/String;")
    public static String field351 = " has logged out.";

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "Lud;")
    public static class2 field350 = new class2();

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "Ljava/lang/String;")
    public static String field372 = "Loading sprites - ";

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "B")
    public byte field358;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "I")
    public int field363;

    @OriginalMember(owner = "client!pc", name = "F", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!pc", name = "G", descriptor = "I")
    public int field366;

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "I")
    public int field370;

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "I")
    public int field371;

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
    public int field376;

    @OriginalMember(owner = "client!pc", name = "R", descriptor = "Lmk;")
    public class106 field377;

    @OriginalMember(owner = "client!pc", name = "I", descriptor = "Lhh;")
    public class122 field368;

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "Lid;")
    public class153 field361;

    @OriginalMember(owner = "client!pc", name = "P", descriptor = "Loj;")
    public class163 field375;

    @OriginalMember(owner = "client!pc", name = "N", descriptor = "Lwf;")
    public class1 field373;

    @OriginalMember(owner = "client!pc", name = "U", descriptor = "Lpc;")
    public class22 field379;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "Lmd;")
    public class236 field356;

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "Ldf;")
    public class56 field364;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "Z")
    public boolean field354;

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "Z")
    public boolean field360;

    @OriginalMember(owner = "client!pc", name = "O", descriptor = "Z")
    public boolean field374;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIII)V")
    public static final void method191(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 0) {
            field369 = -63;
        }
        field348++;
        if (arg0 == arg3) {
            class53.method448(arg1, arg4, arg0, arg5 ^ 0xFFFF86F7, arg2);
        } else if (arg1 - arg0 >= class184.field2914 && class2.field42 >= (arg0 + arg1) && class112.field1727 <= arg2 - arg3 && class278.field4410 >= arg2 + arg3) {
            class83.method645(arg3, arg2, arg1, arg0, 12, arg4);
        } else {
            class244.method1656(arg0, arg4, arg2, 90, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLh;B)V")
    public static final void method192(boolean arg0, class288 arg1, byte arg2) {
        field347++;
        if (arg2 != 114) {
            method196(-97, 92, 116);
        }
        int var3 = (int) arg1.field2009;
        int var4 = arg1.field4505;
        arg1.method995((byte) -102);
        if (arg0) {
            class216.method1489(arg2 ^ 0xFFFFA249, var4);
        }
        class20.method177(var4, -87);
        class222 var5 = class169.method1217(var3, 12180);
        if (var5 != null) {
            class80.method628((byte) -99, var5);
        }
        int var6 = class14.field174;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class173.method1238(-23, class86.field1282[var7])) {
                class172.method1233(var7, arg2 ^ 0x73);
            }
        }
        if (class14.field174 == 1) {
            class207.field3185 = false;
            class18.method137(class259.field4109, arg2 - 238, class209.field3233, class272.field4345, class237.field3737);
        } else {
            class18.method137(class259.field4109, -125, class209.field3233, class272.field4345, class237.field3737);
            int var8 = class73.field1118.method1788(class164.field2480);
            for (int var9 = 0; var9 < class14.field174; var9++) {
                int var10 = class73.field1118.method1788(class151.method1097(true, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class209.field3233 = (class284.field4471 ? 26 : 22) + class14.field174 * 15;
            class272.field4345 = var8 + 8;
        }
        if (class298.field4803 != -1) {
            class112.method829(125, 1, class298.field4803);
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(III)V")
    public class22(int arg0, int arg1, int arg2) {
        this.field357 = arg1;
        this.field353 = arg2;
        this.field359 = this.field362 = arg0;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Llg;I)V")
    public static final void method193(class13 arg0, int arg1) {
        field365++;
        short var2 = 256;
        for (int var3 = 0; var3 < class220.field3365.length; var3++) {
            class220.field3365[var3] = 0;
        }
        if (arg1 < 31) {
            method191(-65, 68, -21, 18, 106, -40);
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var2);
            class220.field3365[var16] = (int) (Math.random() * 284.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < (var2 - 1); var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class182.field2878[var15] = (class220.field3365[var15 - 1] + class220.field3365[var15 - 128] + class220.field3365[var15 + 128] + class220.field3365[var15 + 1]) / 4;
                }
            }
            int[] var13 = class220.field3365;
            class220.field3365 = class182.field2878;
            class182.field2878 = var13;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field154; var7++) {
            for (int var8 = 0; var8 < arg0.field157; var8++) {
                if (arg0.field172[var6++] != 0) {
                    int var9 = arg0.field148 + var8 + 16;
                    int var10 = var7 + arg0.field146 + 16;
                    int var11 = (var10 << 7) + var9;
                    class220.field3365[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
    public static void method194(int arg0) {
        field372 = null;
        if (arg0 == 0) {
            field351 = null;
            field350 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lha;B)V")
    public static final void method195(class31 arg0, byte arg1) {
        int var2 = class237.field3738 >> 2 << 10;
        field352++;
        int var3 = class31.field521 >> 1;
        byte[][] var4 = new byte[class152.field2247][class92.field1475];
        while (arg0.field560.length > arg0.field541) {
            int var33 = 0;
            int var34 = 0;
            boolean var35 = false;
            if (arg0.method265(-85) == 1) {
                var35 = true;
                var33 = arg0.method265(-128);
                var34 = arg0.method265(arg1 ^ 0x41);
            }
            int var36 = arg0.method265(-86);
            int var37 = arg0.method265(arg1 - 72);
            int var38 = class92.field1475 + class141.field2107 - var37 * 64 - 1;
            int var39 = var36 * 64 - class147.field2165;
            if (var39 >= 0 && var38 - 63 >= 0 && class152.field2247 > (var39 + 63) && var38 < class92.field1475) {
                for (int var40 = 0; var40 < 64; var40++) {
                    byte[] var41 = var4[var39 + var40];
                    for (int var42 = 0; var42 < 64; var42++) {
                        if (!var35 || var40 >= (var33 * 8) && var40 < var33 * 8 + 8 && (var34 * 8) <= var42 && (var34 * 8 + 8) > var42) {
                            var41[var38 - var42] = arg0.method266(-129);
                        }
                    }
                }
            } else if (var35) {
                arg0.field541 += 64;
            } else {
                arg0.field541 += 4096;
            }
        }
        int var5 = class152.field2247;
        int var6 = class92.field1475;
        int[] var7 = new int[var6];
        int[] var8 = new int[var6];
        int[] var9 = new int[var6];
        int[] var10 = new int[var6];
        int[] var11 = new int[var6];
        for (int var12 = -5; var12 < var5; var12++) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var27 = var12 + 5;
                int var10002;
                if (var5 > var27) {
                    int var28 = var4[var27][var13] & 0xFF;
                    if (var28 > 0) {
                        class194 var29 = class145.method1049(var28 - 1, 1);
                        var7[var13] += var29.field3032;
                        var10[var13] += var29.field3047;
                        var8[var13] += var29.field3042;
                        var9[var13] += var29.field3043;
                        var10002 = var11[var13]++;
                    }
                }
                int var30 = var12 - 5;
                if (var30 >= 0) {
                    int var31 = var4[var30][var13] & 0xFF;
                    if (var31 > 0) {
                        class194 var32 = class145.method1049(var31 - 1, 1);
                        var7[var13] -= var32.field3032;
                        var10[var13] -= var32.field3047;
                        var8[var13] -= var32.field3042;
                        var9[var13] -= var32.field3043;
                        var10002 = var11[var13]--;
                    }
                }
            }
            if (var12 >= 0) {
                int[][] var14 = class127.field1905[var12 >> 6];
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; var20 < var6; var20++) {
                    int var21 = var20 - 5;
                    int var22 = var20 + 5;
                    if (var6 > var22) {
                        var17 += var9[var22];
                        var15 += var7[var22];
                        var19 += var10[var22];
                        var16 += var8[var22];
                        var18 += var11[var22];
                    }
                    if (var21 >= 0) {
                        var16 -= var8[var21];
                        var19 -= var10[var21];
                        var18 -= var11[var21];
                        var17 -= var9[var21];
                        var15 -= var7[var21];
                    }
                    if (var20 >= 0 && var18 > 0) {
                        int[] var23 = var14[var20 >> 6];
                        int var24 = var17 == 0 ? 0 : client.method1156(var15 * 256 / var17, (byte) -72, var19 / var18, var16 / var18);
                        if (var4[var12][var20] != 0) {
                            if (var23 == null) {
                                var23 = var14[var20 >> 6] = new int[4096];
                            }
                            int var25 = (var24 & 0x7F) + var3;
                            if (var25 < 0) {
                                var25 = 0;
                            } else if (var25 > 127) {
                                var25 = 127;
                            }
                            int var26 = (var2 + var24 & 0xFC00) + (var24 & 0x380) + var25;
                            var23[class118.method863(var12, 63) + (class118.method863(63, var20) << 6)] = class224.field3602[class270.method1827((byte) -20, var26, 96)];
                        } else if (var23 != null) {
                            var23[class118.method863(4032, var20 << 6) + class118.method863(63, var12)] = 0;
                        }
                    }
                }
            }
        }
        if (arg1 != -40) {
            method196(-64, -71, 98);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)I")
    public static final int method196(int arg0, int arg1, int arg2) {
        field349++;
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg0 >>= 0x1;
            arg1 *= arg1;
        }
        if (arg2 != -1) {
            method191(-45, 3, -122, -11, 64, 43);
        }
        if (arg0 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }
}
