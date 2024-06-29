import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class220 {

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "Z")
    public static boolean field3793 = false;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "Lfa;")
    public static class239 field3792;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "([Llj;IIIZBI[B)V")
    public static final void method1463(class25[] arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, int arg6, byte[] arg7) {
        if (arg5 != 69) {
            return;
        }
        if (!arg4) {
            for (int var8 = 0; var8 < 4; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    for (int var10 = 0; var10 < 64; var10++) {
                        if ((arg1 + var9) > 0 && (arg1 + var9) < 103 && arg6 + var10 > 0 && (arg6 + var10) < 103) {
                            arg0[var8].field470[arg1 + var9][arg6 + var10] = class272.method1817(arg0[var8].field470[arg1 + var9][arg6 + var10], -16777217);
                        }
                    }
                }
            }
        }
        class32 var11 = new class32(arg7);
        field3799++;
        byte var12;
        if (arg4) {
            var12 = 1;
        } else {
            var12 = 4;
        }
        for (int var13 = 0; var13 < var12; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class6.method72(arg3, arg2, 89, arg6 + var15, var13, arg4, var14 + arg1, var11, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public static final void method1464(int arg0) {
        class65.field1288.method356(false);
        int var1 = class65.field1288.method358(200, 1);
        field3797++;
        if (var1 == 0) {
            return;
        }
        if (arg0 < 49) {
            method1464(-42);
        }
        int var2 = class65.field1288.method358(200, 2);
        if (var2 == 0) {
            class117.field2062[class155.field2752++] = 2047;
        } else if (var2 == 1) {
            int var3 = class65.field1288.method358(200, 3);
            class229.field3911.method1442(var3, 0, false);
            int var4 = class65.field1288.method358(200, 1);
            if (var4 == 1) {
                class117.field2062[class155.field2752++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class65.field1288.method358(200, 3);
            class229.field3911.method1442(var5, 0, true);
            int var6 = class65.field1288.method358(200, 3);
            class229.field3911.method1442(var6, 0, true);
            int var7 = class65.field1288.method358(200, 1);
            if (var7 == 1) {
                class117.field2062[class155.field2752++] = 2047;
            }
        } else if (var2 == 3) {
            class274.field4798 = class65.field1288.method358(200, 2);
            int var8 = class65.field1288.method358(200, 1);
            int var9 = class65.field1288.method358(200, 7);
            int var10 = class65.field1288.method358(200, 1);
            if (var10 == 1) {
                class117.field2062[class155.field2752++] = 2047;
            }
            int var11 = class65.field1288.method358(200, 7);
            class229.field3911.method1803(0, var11, var9, var8 == 1);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIII)V")
    public static final void method1465(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -94 / ((65 - arg2) / 58);
        class273.field4734 = arg5;
        class206.field3513 = arg4;
        field3795++;
        class160.field2879 = arg1;
        class235.field4089 = arg0;
        class258.field4429 = arg3;
        if (class258.field4429 >= 100) {
            int var7 = class235.field4089 * 128 + 64;
            int var8 = class160.field2879 * 128 + 64;
            int var9 = class23.method216(-122, var7, var8, class274.field4798) - class206.field3513;
            int var10 = var8 - class20.field380;
            int var11 = var7 - class167.field2957;
            int var12 = var9 - class112.field1957;
            int var13 = (int) Math.sqrt((double) (var10 * var10 + var11 * var11));
            class214.field3654 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
            class189.field3289 = (int) (-325.949D * Math.atan2((double) var10, (double) var11)) & 0x7FF;
            if (class214.field3654 < 128) {
                class214.field3654 = 128;
            }
            if (class214.field3654 > 383) {
                class214.field3654 = 383;
            }
        }
        class163.field2899 = 2;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZII[B[Llj;)V")
    public static final void method1466(int arg0, boolean arg1, int arg2, int arg3, byte[] arg4, class25[] arg5) {
        if (arg3 != -65) {
            method1464(-53);
        }
        class32 var6 = new class32(arg4);
        field3794++;
        int var7 = -1;
        while (true) {
            int var8 = var6.method333((byte) 93);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method303(97);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var6.method316((byte) 112);
                int var13 = var9 >> 12;
                int var14 = (var9 & 0xFF4) >> 6;
                int var15 = var12 >> 2;
                int var16 = var12 & 0x3;
                int var17 = arg0 + var11;
                int var18 = arg2 + var14;
                if (var18 > 0 && var17 > 0 && var18 < 103 && var17 < 103) {
                    class25 var19 = null;
                    if (!arg1) {
                        int var20 = var13;
                        if ((class73.field1410[1][var18][var17] & 0x2) == 2) {
                            var20 = var13 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg5[var20];
                        }
                    }
                    class27.method242(var18, var17, (byte) 95, var13, var15, var7, var16, !arg1, var13, arg1, var19);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lpj;Lpj;IILpj;I)V")
    public static final void method1467(class237 arg0, class237 arg1, int arg2, int arg3, class237 arg4, int arg5) {
        int var6 = 99;
        if (arg2 != 1) {
            field3792 = null;
        }
        while (var6 > 0) {
            class13.field219[var6] = class13.field219[var6 - 1];
            class143.field2590[var6] = class143.field2590[var6 - 1];
            class3.field23[var6] = class3.field23[var6 - 1];
            class27.field488[var6] = class27.field488[var6 - 1];
            class104.field1837[var6] = class104.field1837[var6 - 1];
            var6--;
        }
        class110.field1941++;
        class13.field219[0] = arg5;
        field3798++;
        class209.field3566 = class3.field31;
        class104.field1837[0] = arg3;
        class143.field2590[0] = arg1;
        class3.field23[0] = arg0;
        class27.field488[0] = arg4;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
    public static void method1468(int arg0) {
        if (arg0 != 0) {
            method1464(100);
        }
        field3792 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V")
    public static final void method1469(int arg0, int arg1, int arg2) {
        class202.field3471[arg1] = arg2;
        field3796++;
        int var3 = -69 / ((-arg0 - 49) / 38);
        class180 var4 = (class180) class28.field499.method568((long) arg1, -1);
        if (var4 == null) {
            class180 var5 = new class180(class181.method1244((byte) -67) + 500L);
            class28.field499.method562(var5, (long) arg1, (byte) 56);
        } else {
            var4.field3166 = class181.method1244((byte) -117) + 500L;
        }
    }
}
