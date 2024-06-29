import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 {

    @OriginalMember(owner = "client!a", name = "p", descriptor = "[B")
    private byte[] field16 = new byte[4];

    @OriginalMember(owner = "client!a", name = "r", descriptor = "Lbd;")
    private class12 field18;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    private int field6;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "J")
    private long field13;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static volatile int field11 = 0;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Lqb;")
    public static class113 field9 = new class113();

    @OriginalMember(owner = "client!a", name = "s", descriptor = "Lge;")
    public static class47 field19 = new class47(64);

    @OriginalMember(owner = "client!a", name = "u", descriptor = "Lr;")
    private static class118 field21 = class153.method1136(95, "purple:");

    @OriginalMember(owner = "client!a", name = "w", descriptor = "I")
    public static int field23 = 0;

    @OriginalMember(owner = "client!a", name = "z", descriptor = "Lr;")
    public static class118 field26 = field21;

    @OriginalMember(owner = "client!a", name = "B", descriptor = "Lr;")
    public static class118 field28 = class153.method1136(95, "leuchten2:");

    @OriginalMember(owner = "client!a", name = "C", descriptor = "Lr;")
    public static class118 field29 = class153.method1136(83, "M");

    @OriginalMember(owner = "client!a", name = "x", descriptor = "[Lr;")
    public static class118[] field24 = new class118[200];

    @OriginalMember(owner = "client!a", name = "D", descriptor = "I")
    public static int field30 = 0;

    @OriginalMember(owner = "client!a", name = "A", descriptor = "Lr;")
    public static class118 field27 = field21;

    @OriginalMember(owner = "client!a", name = "E", descriptor = "I")
    public static int field31 = -1;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "Lna;")
    public static class91 field22 = new class91(5000);

    @OriginalMember(owner = "client!a", name = "F", descriptor = "[[S")
    public static short[][] field32 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    private int field10;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    private int field8;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field5;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "[B")
    private byte[] field2;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V")
    public static final void method1(int arg0, int arg1) {
        int[] var2 = class100.field2300.field3367;
        field12++;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 0;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var21 = (52736 - var5 * 512) * 4 + 24628;
            for (int var22 = 1; var22 < 103; var22++) {
                if ((class33.field830[arg1][var22][var5] & 0x18) == 0) {
                    class68.field1583.method1174(var2, var21, 512, arg1, var22, var5);
                }
                if (arg1 < 3 && (class33.field830[arg1 + 1][var22][var5] & 0x8) != 0) {
                    class68.field1583.method1174(var2, var21, 512, arg1 + 1, var22, var5);
                }
                var21 += 4;
            }
        }
        class100.field2300.method1116();
        int var6 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + 228;
        int var7 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var20 = 1; var20 < 103; var20++) {
                if ((class33.field830[arg1][var20][var8] & 0x18) == 0) {
                    class113.method893(var7, arg1, var20, var6, -63, var8);
                }
                if (arg1 < 3 && (class33.field830[arg1 + 1][var20][var8] & 0x8) != 0) {
                    class113.method893(var7, arg1 + 1, var20, var6, -9, var8);
                }
            }
        }
        class133.field3035 = 0;
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var11 = 0; var11 < 104; var11++) {
                int var12 = class68.field1583.method1156(class106.field2468, var9, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 0x7FFF;
                    int var14 = class47.method396(117, var13).field3306;
                    if (var14 >= 0) {
                        int var15 = var9;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            int[][] var17 = class121.field2790[class106.field2468].field2958;
                            for (int var18 = 0; var18 < 10; var18++) {
                                int var19 = (int) (Math.random() * 4.0D);
                                if (var19 == 0 && var15 > 0 && var9 - 3 < var15 && (var17[var15 - 1][var16] & 0x12C0108) == 0) {
                                    var15--;
                                }
                                if (var19 == 1 && var15 < 103 && var15 < var9 + 3 && (var17[var15 + 1][var16] & 0x12C0180) == 0) {
                                    var15++;
                                }
                                if (var19 == 2 && var16 > 0 && var11 - 3 < var16 && (var17[var15][var16 - 1] & 0x12C0102) == 0) {
                                    var16--;
                                }
                                if (var19 == 3 && var16 < 103 && var16 < var11 + 3 && (var17[var15][var16 + 1] & 0x12C0120) == 0) {
                                    var16++;
                                }
                            }
                        }
                        class101.field2322[class133.field3035] = class66.field1511[var14];
                        class153.field3465[class133.field3035] = var15;
                        class79.field1928[class133.field3035] = var16;
                        class133.field3035++;
                    }
                }
            }
        }
        int var10 = -7 % ((arg0 + 6) / 35);
        class13.field291.method601(17648);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(II)Lhb;")
    public static final class51 method2(int arg0, int arg1) {
        if (arg0 != -15697) {
            method4((byte) -45);
        }
        class51 var2 = (class51) class82.field1982.method395((byte) -74, (long) arg1);
        field15++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class64.field1454.method350(13, -123, arg1);
        class51 var4 = new class51();
        var4.field1219 = arg1;
        if (var3 != null) {
            var4.method459((byte) 102, new class105(var3));
        }
        class82.field1982.method391(var4, (long) arg1, true);
        return var4;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static final void method3(int arg0) {
        field7++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class39.field950 - 1; var2++) {
                if (class42.field1015[var2] < 1000 && class42.field1015[var2 + 1] > 1000) {
                    class118 var3 = class126.field2876[var2];
                    class126.field2876[var2] = class126.field2876[var2 + 1];
                    class126.field2876[var2 + 1] = var3;
                    var1 = false;
                    class118 var4 = class144.field3250[var2];
                    class144.field3250[var2] = class144.field3250[var2 + 1];
                    class144.field3250[var2 + 1] = var4;
                    int var5 = class42.field1015[var2];
                    class42.field1015[var2] = class42.field1015[var2 + 1];
                    class42.field1015[var2 + 1] = var5;
                    int var6 = class83.field1987[var2];
                    class83.field1987[var2] = class83.field1987[var2 + 1];
                    class83.field1987[var2 + 1] = var6;
                    int var7 = class25.field608[var2];
                    class25.field608[var2] = class25.field608[var2 + 1];
                    class25.field608[var2 + 1] = var7;
                    int var8 = class95.field2243[var2];
                    class95.field2243[var2] = class95.field2243[var2 + 1];
                    class95.field2243[var2 + 1] = var8;
                }
            }
        }
        if (arg0 != -19300) {
            method2(82, 45);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
    public static void method4(byte arg0) {
        field22 = null;
        field19 = null;
        field28 = null;
        field29 = null;
        field9 = null;
        field27 = null;
        field21 = null;
        field26 = null;
        field24 = null;
        field32 = null;
        if (arg0 != 36) {
            method7(-88);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)[B")
    public final byte[] method5(boolean arg0) throws IOException {
        field1++;
        if (class120.method945(20794) > this.field13) {
            throw new IOException("fdt");
        } else if (arg0) {
            return null;
        } else {
            if (this.field6 == 0) {
                if (this.field18.field268 == 2) {
                    throw new IOException("fds");
                }
                if (this.field18.field268 == 1) {
                    this.field6 = 1;
                    this.field5 = (DataInputStream) this.field18.field269;
                }
            }
            if (this.field6 == 1) {
                int var2 = this.field5.available();
                if (var2 > 0) {
                    if (this.field8 + var2 > 4) {
                        var2 = 4 - this.field8;
                    }
                    this.field8 += this.field5.read(this.field16, this.field8, var2);
                    if (this.field8 == 4) {
                        int var3 = (new class105(this.field16)).method821((byte) 108);
                        this.field6 = 2;
                        this.field2 = new byte[var3];
                    }
                }
            }
            if (this.field6 == 2) {
                int var4 = this.field5.available();
                if (var4 > 0) {
                    if (this.field10 + var4 > this.field2.length) {
                        var4 = this.field2.length - this.field10;
                    }
                    this.field10 += this.field5.read(this.field2, this.field10, var4);
                    if (this.field2.length == this.field10) {
                        return this.field2;
                    }
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lwa;ILsc;IIIIIII)V")
    public static final void method6(class154 arg0, int arg1, class128 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4++;
        class148 var10 = class47.method396(arg7 + 27239, arg3);
        int var11;
        int var12;
        if (arg8 == 1 || arg8 == 3) {
            var11 = var10.field3287;
            var12 = var10.field3279;
        } else {
            var11 = var10.field3279;
            var12 = var10.field3287;
        }
        int var13;
        int var14;
        if (arg6 + var11 <= 104) {
            var13 = arg6 + (var11 >> 1);
            var14 = arg6 + (var11 + 1 >> 1);
        } else {
            var13 = arg6;
            var14 = arg6 + 1;
        }
        int var15;
        int var16;
        if (arg9 + var12 > 104) {
            var15 = arg9 + 1;
            var16 = arg9;
        } else {
            var15 = (var12 + 1 >> 1) + arg9;
            var16 = (var12 >> 1) + arg9;
        }
        int[][] var17 = class72.field1668[arg5];
        int var18 = (arg6 << 7) + (var11 << 6);
        int var19 = var17[var13][var15] + var17[var14][var15] + var17[var13][var16] + var17[var14][var16] >> 2;
        if (arg7 != -27122) {
            method7(-128);
        }
        int var20 = (arg9 << 7) + (var12 << 6);
        int var21 = (arg8 << 6) + arg1;
        if (var10.field3292 == 1) {
            var21 += 256;
        }
        int var22 = arg6 + (arg9 << 7) + (arg3 << 14) + 1073741824;
        if (var10.field3302 == 0) {
            var22 += Integer.MIN_VALUE;
        }
        if (arg1 == 22) {
            class89 var23;
            if (var10.field3324 == -1 && var10.field3310 == null) {
                var23 = var10.method1091(var17, var19, -50, arg8, var18, var20, 22);
            } else {
                var23 = new class157(arg3, 22, arg8, arg5, arg6, arg9, var10.field3324, true, null);
            }
            arg0.method1155(arg4, arg6, arg9, var19, var23, var22, var21);
            if (var10.field3297 == 1) {
                arg2.method989(arg6, arg9, -1);
            }
        } else if (arg1 == 10 || arg1 == 11) {
            class89 var46;
            if (var10.field3324 == -1 && var10.field3310 == null) {
                var46 = var10.method1091(var17, var19, arg7 + 27072, arg8, var18, var20, 10);
            } else {
                var46 = new class157(arg3, 10, arg8, arg5, arg6, arg9, var10.field3324, true, null);
            }
            if (var46 != null) {
                arg0.method1175(arg4, arg6, arg9, var19, var11, var12, var46, arg1 == 11 ? 256 : 0, var22, var21);
            }
            if (var10.field3297 != 0) {
                arg2.method998(arg9, var12, var11, arg6, var10.field3278, -2);
            }
        } else if (arg1 >= 12) {
            class89 var24;
            if (var10.field3324 == -1 && var10.field3310 == null) {
                var24 = var10.method1091(var17, var19, -50, arg8, var18, var20, arg1);
            } else {
                var24 = new class157(arg3, arg1, arg8, arg5, arg6, arg9, var10.field3324, true, null);
            }
            arg0.method1175(arg4, arg6, arg9, var19, 1, 1, var24, 0, var22, var21);
            if (var10.field3297 != 0) {
                arg2.method998(arg9, var12, var11, arg6, var10.field3278, -2);
            }
        } else if (arg1 == 0) {
            class89 var25;
            if (var10.field3324 == -1 && var10.field3310 == null) {
                var25 = var10.method1091(var17, var19, -50, arg8, var18, var20, 0);
            } else {
                var25 = new class157(arg3, 0, arg8, arg5, arg6, arg9, var10.field3324, true, null);
            }
            arg0.method1177(arg4, arg6, arg9, var19, var25, null, class134.field3056[arg8], 0, var22, var21);
            if (var10.field3297 != 0) {
                arg2.method990(110, arg6, var10.field3278, arg8, arg9, arg1);
            }
        } else if (arg1 == 1) {
            class89 var26;
            if (var10.field3324 == -1 && var10.field3310 == null) {
                var26 = var10.method1091(var17, var19, -50, arg8, var18, var20, 1);
            } else {
                var26 = new class157(arg3, 1, arg8, arg5, arg6, arg9, var10.field3324, true, null);
            }
            arg0.method1177(arg4, arg6, arg9, var19, var26, null, class26.field639[arg8], 0, var22, var21);
            if (var10.field3297 != 0) {
                arg2.method990(126, arg6, var10.field3278, arg8, arg9, arg1);
            }
        } else if (arg1 == 2) {
            int var27 = arg8 + 1 & 0x3;
            class89 var28;
            class89 var29;
            if (var10.field3324 == -1 && var10.field3310 == null) {
                var28 = var10.method1091(var17, var19, -50, arg8 + 4, var18, var20, 2);
                var29 = var10.method1091(var17, var19, arg7 + 27072, var27, var18, var20, 2);
            } else {
                var28 = new class157(arg3, 2, arg8 + 4, arg5, arg6, arg9, var10.field3324, true, null);
                var29 = new class157(arg3, 2, var27, arg5, arg6, arg9, var10.field3324, true, null);
            }
            arg0.method1177(arg4, arg6, arg9, var19, var28, var29, class134.field3056[arg8], class134.field3056[var27], var22, var21);
            if (var10.field3297 != 0) {
                arg2.method990(126, arg6, var10.field3278, arg8, arg9, arg1);
            }
        } else if (arg1 == 3) {
            class89 var30;
            if (var10.field3324 == -1 && var10.field3310 == null) {
                var30 = var10.method1091(var17, var19, -50, arg8, var18, var20, 3);
            } else {
                var30 = new class157(arg3, 3, arg8, arg5, arg6, arg9, var10.field3324, true, null);
            }
            arg0.method1177(arg4, arg6, arg9, var19, var30, null, class26.field639[arg8], 0, var22, var21);
            if (var10.field3297 != 0) {
                arg2.method990(arg7 + 27237, arg6, var10.field3278, arg8, arg9, arg1);
            }
        } else if (arg1 == 9) {
            class89 var31;
            if (var10.field3324 == -1 && var10.field3310 == null) {
                var31 = var10.method1091(var17, var19, -50, arg8, var18, var20, arg1);
            } else {
                var31 = new class157(arg3, arg1, arg8, arg5, arg6, arg9, var10.field3324, true, null);
            }
            arg0.method1175(arg4, arg6, arg9, var19, 1, 1, var31, 0, var22, var21);
            if (var10.field3297 != 0) {
                arg2.method998(arg9, var12, var11, arg6, var10.field3278, -2);
            }
        } else if (arg1 == 4) {
            class89 var32;
            if (var10.field3324 == -1 && var10.field3310 == null) {
                var32 = var10.method1091(var17, var19, -50, arg8, var18, var20, 4);
            } else {
                var32 = new class157(arg3, 4, arg8, arg5, arg6, arg9, var10.field3324, true, null);
            }
            arg0.method1179(arg4, arg6, arg9, var19, var32, null, class134.field3056[arg8], 0, 0, 0, var22, var21);
        } else if (arg1 == 5) {
            int var33 = 16;
            int var34 = arg0.method1169(arg4, arg6, arg9);
            if (var34 != 0) {
                var33 = class47.method396(117, var34 >> 14 & 0x7FFF).field3322;
            }
            class89 var35;
            if (var10.field3324 == -1 && var10.field3310 == null) {
                var35 = var10.method1091(var17, var19, -50, arg8, var18, var20, 4);
            } else {
                var35 = new class157(arg3, 4, arg8, arg5, arg6, arg9, var10.field3324, true, null);
            }
            arg0.method1179(arg4, arg6, arg9, var19, var35, null, class134.field3056[arg8], 0, class114.field2661[arg8] * var33, class113.field2642[arg8] * var33, var22, var21);
        } else if (arg1 == 6) {
            int var36 = 8;
            int var37 = arg0.method1169(arg4, arg6, arg9);
            if (var37 != 0) {
                var36 = class47.method396(117, var37 >> 14 & 0x7FFF).field3322 / 2;
            }
            class89 var38;
            if (var10.field3324 == -1 && var10.field3310 == null) {
                var38 = var10.method1091(var17, var19, arg7 + 27072, arg8 + 4, var18, var20, 4);
            } else {
                var38 = new class157(arg3, 4, arg8 + 4, arg5, arg6, arg9, var10.field3324, true, null);
            }
            arg0.method1179(arg4, arg6, arg9, var19, var38, null, 256, arg8, class32.field825[arg8] * var36, class84.field2012[arg8] * var36, var22, var21);
        } else if (arg1 == 7) {
            int var39 = arg8 + 2 & 0x3;
            class89 var40;
            if (var10.field3324 == -1 && var10.field3310 == null) {
                var40 = var10.method1091(var17, var19, -50, var39 + 4, var18, var20, 4);
            } else {
                var40 = new class157(arg3, 4, var39 + 4, arg5, arg6, arg9, var10.field3324, true, null);
            }
            arg0.method1179(arg4, arg6, arg9, var19, var40, null, 256, var39, 0, 0, var22, var21);
        } else if (arg1 == 8) {
            int var41 = arg0.method1169(arg4, arg6, arg9);
            int var42 = 8;
            if (var41 != 0) {
                var42 = class47.method396(117, var41 >> 14 & 0x7FFF).field3322 / 2;
            }
            int var43 = arg8 + 2 & 0x3;
            class89 var44;
            class89 var45;
            if (var10.field3324 == -1 && var10.field3310 == null) {
                var44 = var10.method1091(var17, var19, -50, arg8 + 4, var18, var20, 4);
                var45 = var10.method1091(var17, var19, -50, var43 + 4, var18, var20, 4);
            } else {
                var44 = new class157(arg3, 4, arg8 + 4, arg5, arg6, arg9, var10.field3324, true, null);
                var45 = new class157(arg3, 4, var43 + 4, arg5, arg6, arg9, var10.field3324, true, null);
            }
            arg0.method1179(arg4, arg6, arg9, var19, var44, var45, 256, arg8, class32.field825[arg8] * var42, class84.field2012[arg8] * var42, var22, var21);
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
    public static final void method7(int arg0) {
        field20++;
        if (class56.field1322 > 0) {
            class139.method1040(-15);
            return;
        }
        class39.method326(22077, 40);
        if (arg0 != 512600200) {
            field27 = null;
        }
        class120.field2789 = class127.field2915;
        class127.field2915 = null;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lvf;Ljava/net/URL;)V")
    public class1(class152 arg0, URL arg1) {
        this.field18 = arg0.method1125(arg1, 32729);
        this.field6 = 0;
        this.field13 = class120.method945(20794) + 30000L;
    }
}
