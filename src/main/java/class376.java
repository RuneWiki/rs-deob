import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class376 extends class446 {

    @OriginalMember(owner = "client!tq", name = "I", descriptor = "Lbj;")
    public static class131 field5368 = new class131(64);

    @OriginalMember(owner = "client!tq", name = "K", descriptor = "[[I")
    public static int[][] field5370 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!tq", name = "L", descriptor = "Z")
    public static boolean field5371 = true;

    @OriginalMember(owner = "client!tq", name = "M", descriptor = "I")
    public static int field5372 = 1;

    @OriginalMember(owner = "client!tq", name = "w", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!tq", name = "A", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!tq", name = "B", descriptor = "I")
    public static int field5361;

    @OriginalMember(owner = "client!tq", name = "C", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!tq", name = "E", descriptor = "I")
    public static int field5364;

    @OriginalMember(owner = "client!tq", name = "F", descriptor = "I")
    public static int field5365;

    @OriginalMember(owner = "client!tq", name = "H", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!tq", name = "J", descriptor = "I")
    public static int field5369;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tq", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field5373;

    @OriginalMember(owner = "client!tq", name = "z", descriptor = "Ljava/lang/String;")
    public String field5359;

    @OriginalMember(owner = "client!tq", name = "y", descriptor = "[C")
    public char[] field5358;

    @OriginalMember(owner = "client!tq", name = "G", descriptor = "[C")
    public char[] field5366;

    @OriginalMember(owner = "client!tq", name = "x", descriptor = "[I")
    public int[] field5357;

    @OriginalMember(owner = "client!tq", name = "D", descriptor = "[I")
    public int[] field5363;

    // $FF: synthetic method
    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2408(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(CB)I", line = 7)
    public final int method2399(char arg0, byte arg1) {
        field5362++;
        if (this.field5363 == null) {
            return -1;
        }
        if (arg1 != 119) {
            method2400(-14);
        }
        for (int var3 = 0; var3 < this.field5363.length; var3++) {
            if (this.field5358[var3] == arg0) {
                return this.field5363[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "(I)V", line = 32)
    public static void method2400(int arg0) {
        field5370 = null;
        int var1 = 49 / ((arg0 + 89) / 34);
        field5368 = null;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lkh;I)V", line = 47)
    public final void method2401(class11 arg0, int arg1) {
        if (arg1 != -1) {
            return;
        }
        while (true) {
            int var3 = arg0.method172((byte) 52);
            if (var3 == 0) {
                field5365++;
                return;
            }
            this.method2405(var3, 11719, arg0);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IBZI)V", line = 69)
    public static final void method2402(int arg0, byte arg1, boolean arg2, int arg3) {
        if (arg1 <= 11) {
            return;
        }
        field5360++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class247.field3492 = arg2;
        class76.field1094 = arg3;
        class149.field2117 = arg0;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Luo;BI)Z", line = 90)
    public static final boolean method2403(class345 arg0, byte arg1, int arg2) {
        field5369++;
        int var3 = (class211.field2954 - 104) / 2;
        int var4 = (class290.field4061 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; var6++) {
            for (int var51 = var4; var51 < (var4 + 104); var51++) {
                for (int var52 = arg2; var52 <= 3; var52++) {
                    if (class85.method614(arg2, var51, -31202, var52, var6)) {
                        int var53 = var52;
                        if (class112.method791((byte) -127, var51, var6)) {
                            var53 = var52 - 1;
                        }
                        if (var53 >= 0) {
                            var5 &= class91.method650(var51, 93, var53, var6);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        int var8 = 0;
        if (arg1 != -71) {
            field5370 = null;
        }
        while (var7.length > var8) {
            var7[var8] = -16777216;
            var8++;
        }
        client.field2272 = arg0.method128(var7, 0, 512, 512, 512);
        class134.method941((byte) 95);
        int var9 = ((int) (Math.random() * 20.0D)) + ((((int) (Math.random() * 20.0D)) + 238 - 10 << 16) + ((((int) (Math.random() * 20.0D)) + 238) - 10 << 8)) + 238 - 10 | 0xFF000000;
        int var10 = (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00 << 16;
        int var11 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
        boolean[][] var12 = new boolean[class119.field1684][class119.field1684];
        for (int var13 = var3; var13 < var3 + 104; var13 += class119.field1684) {
            for (int var36 = var4; var36 < var4 + 104; var36 += class119.field1684) {
                arg0.method136(0, 0, class119.field1684 * 4, class119.field1684 * 4);
                arg0.method114(-16777216);
                for (int var37 = arg2; var37 <= 3; var37++) {
                    for (int var44 = 0; var44 < class119.field1684; var44++) {
                        for (int var50 = 0; var50 < class119.field1684; var50++) {
                            var12[var44][var50] = class85.method614(arg2, var36 + var50, -31202, var37, var13 + var44);
                        }
                    }
                    class418.field5939[var37].method723(0, 0, 1024, var13, var36, class119.field1684 + var13, class119.field1684 + var36, var12);
                    if (!class386.field5545) {
                        for (int var45 = -4; var45 < class119.field1684; var45++) {
                            for (int var46 = -4; var46 < class119.field1684; var46++) {
                                int var47 = var13 + var45;
                                int var48 = var36 + var46;
                                if (var47 >= var3 && var4 <= var48 && class85.method614(arg2, var48, -31202, var37, var47)) {
                                    int var49 = var37;
                                    if (class112.method791((byte) -119, var48, var47)) {
                                        var49 = var37 - 1;
                                    }
                                    if (var49 >= 0) {
                                        class183.method1196(var47, (byte) 15, arg0, var45 * 4, var10, var49, (class119.field1684 - var46) * 4 - 4, var9, var48);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class386.field5545) {
                    class67 var38 = class426.field5999[arg2];
                    for (int var39 = 0; var39 < class119.field1684; var39++) {
                        for (int var40 = 0; var40 < class119.field1684; var40++) {
                            int var41 = var13 + var39;
                            int var42 = var36 + var40;
                            int var43 = var38.field1016[var41 - var38.field993][var42 - var38.field1009];
                            if ((var43 & 0x40240000) != 0) {
                                arg0.method2182(var39 * 4, (class119.field1684 - var40) * 4 - 4, 4, -1713569622, arg1 ^ 0x19, 4);
                            } else if ((var43 & 0x800000) != 0) {
                                arg0.method2189((byte) -125, 4, (class119.field1684 - var40) * 4 - 4, -1713569622, var39 * 4);
                            } else if ((var43 & 0x2000000) != 0) {
                                arg0.method2181(4, -23605, -1713569622, (class119.field1684 - var40) * 4 - 4, var39 * 4 + 3);
                            } else if ((var43 & 0x8000000) != 0) {
                                arg0.method2189((byte) -120, 4, (class119.field1684 - var40) * 4 + 3 - 4, -1713569622, var39 * 4);
                            } else if ((var43 & 0x20000000) != 0) {
                                arg0.method2181(4, -23605, -1713569622, (class119.field1684 - var40) * 4 - 4, var39 * 4);
                            }
                        }
                    }
                }
                arg0.method56(0, 0, class119.field1684 * 4, class119.field1684 * 4, var11, 2);
                client.field2272.method590((var13 - var3) * 4 + 48, -((-var4 + var36) * 4) + 464 + -(class119.field1684 * 4), class119.field1684 * 4, class119.field1684 * 4, 0, 0);
            }
        }
        arg0.method143();
        arg0.method114(-16777215);
        class386.method2450((byte) -107);
        class401.field5708 = 0;
        class418.field5938.method644(false);
        if (!class386.field5545) {
            for (int var14 = var3; var14 < var3 + 104; var14++) {
                for (int var20 = var4; var20 < var4 + 104; var20++) {
                    for (int var21 = arg2; arg2 + 1 >= var21 && var21 <= 3; var21++) {
                        if (class85.method614(arg2, var20, -31202, var21, var14)) {
                            class193 var22 = (class193) class19.method259(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class193) class139.method952(var21, var14, var20, field5373 == null ? (field5373 = method2408("sc")) : field5373);
                            }
                            if (var22 == null) {
                                var22 = (class193) class244.method1655(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class193) class326.method2094(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class64 var23 = class375.method2395((byte) 123, var22.method689((byte) -83));
                                if (!var23.field880 || class21.field393) {
                                    int var24 = var23.field899;
                                    if (var23.field908 != null) {
                                        for (int var25 = 0; var25 < var23.field908.length; var25++) {
                                            if (var23.field908[var25] != -1) {
                                                class64 var26 = class375.method2395((byte) 113, var23.field908[var25]);
                                                if (var26.field899 >= 0) {
                                                    var24 = var26.field899;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class25 var28 = class328.method2113(var24, (byte) -125);
                                            if (var28 != null && var28.field444) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class426.field5999[var21].field1016;
                                            int var32 = class426.field5999[var21].field993;
                                            int var33 = class426.field5999[var21].field1009;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var3 < var29 && (var14 - 3) < var29 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var29 < var3 + 104 - 1 && var29 < var14 + 3 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var30 > var4 && var30 > (var20 - 3) && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var30 < (var4 + 103) && var30 < (var20 + 3) && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class64.field881[class401.field5708] = var23.field916;
                                        class453.field6355[class401.field5708] = var29;
                                        class442.field6215[class401.field5708] = var30;
                                        class401.field5708++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class282.field3952 != null) {
                class129.field1810.field3713 = 1;
                class341.method2166(64, 0, 1024);
                for (int var15 = 0; var15 < class282.field3952.field1285; var15++) {
                    int var16 = class282.field3952.field1286[var15];
                    if ((var16 >> 28) == class142.field2034) {
                        int var17 = ((var16 & 0xFFFC2AA) >> 14) - class212.field2968;
                        int var18 = (var16 & 0x3FFF) - class447.field6269;
                        if (var17 >= 0 && class211.field2954 > var17 && var18 >= 0 && class290.field4061 > var18) {
                            class418.field5938.method643(new class406(var15), arg1 - 56);
                        } else {
                            class25 var19 = class328.method2113(class282.field3952.field1284[var15], (byte) -125);
                            if (var19.field442 != null && var17 + var19.field450 >= 0 && class211.field2954 > (var17 + var19.field430) && var18 + var19.field445 >= 0 && (var18 + var19.field456) < class290.field4061) {
                                class418.field5938.method643(new class406(var15), -87);
                            }
                        }
                    }
                }
                class341.method2166(64, arg1 + 71, 128);
                class129.field1810.field3713 = 2;
                class129.field1810.method1767((byte) -78);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "([I[JB)V", line = 499)
    public static final void method2404(int[] arg0, long[] arg1, byte arg2) {
        class62.method478(arg1, arg1.length - 1, arg0, false, 0);
        field5367++;
        if (arg2 != -31) {
            method2403((class345) null, (byte) 95, 2);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IILkh;)V", line = 517)
    private final void method2405(int arg0, int arg1, class11 arg2) {
        field5356++;
        if (arg0 == 1) {
            this.field5359 = arg2.method171(-9265);
        } else if (arg0 == 2) {
            int var7 = arg2.method172((byte) 52);
            this.field5358 = new char[var7];
            this.field5363 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field5363[var8] = arg2.method174(class108.method765(arg1, 11576));
                byte var9 = arg2.method162(arg1 ^ 0xFFFFC36B);
                this.field5358[var8] = var9 == 0 ? 0 : class436.method2744(63, var9);
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method172((byte) 52);
            this.field5366 = new char[var4];
            this.field5357 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5357[var5] = arg2.method174(255);
                byte var6 = arg2.method162(-4436);
                this.field5366[var5] = var6 == 0 ? 0 : class436.method2744(63, var6);
            }
        }
        if (arg1 != 11719) {
            method2404((int[]) null, (long[]) null, (byte) -46);
        }
    }

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "(I)V", line = 581)
    public final void method2406(int arg0) {
        if (this.field5357 != null) {
            for (int var2 = 0; var2 < this.field5357.length; var2++) {
                this.field5357[var2] = class393.method2487(this.field5357[var2], 32768);
            }
        }
        field5361++;
        if (arg0 > -36) {
            field5370 = null;
        }
        if (this.field5363 != null) {
            for (int var3 = 0; var3 < this.field5363.length; var3++) {
                this.field5363[var3] = class393.method2487(this.field5363[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IC)I", line = 611)
    public final int method2407(int arg0, char arg1) {
        field5364++;
        if (this.field5357 == null) {
            return -1;
        }
        if (arg0 != 512) {
            this.method2399('R', (byte) 7);
        }
        for (int var3 = 0; var3 < this.field5357.length; var3++) {
            if (this.field5366[var3] == arg1) {
                return this.field5357[var3];
            }
        }
        return -1;
    }
}
