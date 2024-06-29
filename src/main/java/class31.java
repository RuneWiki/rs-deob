import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public abstract class class31 extends class182 {

    @OriginalMember(owner = "client!ch", name = "X", descriptor = "Lkh;")
    private static class117 field739 = class224.method1450((byte) 118, "Hidden");

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "Lkh;")
    public static class117 field725 = field739;

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "Lkh;")
    public static class117 field724 = class224.method1450((byte) 107, "und Ihr Passwort ein)3");

    @OriginalMember(owner = "client!ch", name = "V", descriptor = "Lkh;")
    private static class117 field737 = class224.method1450((byte) -39, "Unable to find ");

    @OriginalMember(owner = "client!ch", name = "W", descriptor = "Lkh;")
    public static class117 field738 = field737;

    @OriginalMember(owner = "client!ch", name = "T", descriptor = "Lkh;")
    public static class117 field735 = class224.method1450((byte) 123, "scrollbar");

    @OriginalMember(owner = "client!ch", name = "K", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!ch", name = "L", descriptor = "I")
    public int field727;

    @OriginalMember(owner = "client!ch", name = "M", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!ch", name = "O", descriptor = "I")
    public int field730;

    @OriginalMember(owner = "client!ch", name = "P", descriptor = "I")
    public int field731;

    @OriginalMember(owner = "client!ch", name = "Q", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "I")
    public int field733;

    @OriginalMember(owner = "client!ch", name = "S", descriptor = "I")
    public int field734;

    @OriginalMember(owner = "client!ch", name = "U", descriptor = "I")
    public int field736;

    @OriginalMember(owner = "client!ch", name = "Z", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!ch", name = "ab", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!ch", name = "bb", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!ch", name = "Y", descriptor = "Lai;")
    public static class10 field740;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIII)V")
    public abstract void method264(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)I")
    public static final int method265(int arg0, int arg1) {
        field729++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 >= ~arg1) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return var2 + arg1;
    }

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "(B)V")
    public static final void method266(byte arg0) {
        field743++;
        for (int var1 = 0; var1 < class219.field3975; var1++) {
            int var10002 = class34.field803[var1]--;
            if (class34.field803[var1] >= -10) {
                class59 var3 = class80.field1508[var1];
                if (var3 == null) {
                    var3 = class59.method446(class216.field3935, class178.field3226[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class34.field803[var1] += var3.method443();
                    class80.field1508[var1] = var3;
                }
                if (class34.field803[var1] < 0) {
                    int var10;
                    if (class174.field3127[var1] == 0) {
                        var10 = class74.field1406;
                    } else {
                        int var4 = class174.field3127[var1] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - class93.field1712.field4244;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = (class174.field3127[var1] & 0xFF) * 128;
                        int var7 = class174.field3127[var1] >> 8 & 0xFF;
                        int var8 = var7 * 128 + 64 - class93.field1712.field4221;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var5 + var8 - 128;
                        if (var6 < var9) {
                            class34.field803[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var6 - var9) * class86.field1617 / var6;
                    }
                    if (var10 > 0) {
                        class168 var11 = var3.method444().method1189(class157.field2859);
                        class245 var12 = class245.method1584(var11, 100, var10);
                        var12.method1588(class5.field65[var1] - 1);
                        class187.field3351.method1532(var12);
                    }
                    class34.field803[var1] = -100;
                }
            } else {
                class219.field3975--;
                for (int var2 = var1; var2 < class219.field3975; var2++) {
                    class178.field3226[var2] = class178.field3226[var2 + 1];
                    class80.field1508[var2] = class80.field1508[var2 + 1];
                    class5.field65[var2] = class5.field65[var2 + 1];
                    class34.field803[var2] = class34.field803[var2 + 1];
                    class174.field3127[var2] = class174.field3127[var2 + 1];
                }
                var1--;
            }
        }
        if (arg0 != 99) {
            method277(false, -16, null);
        }
        if (class115.field2137 && !class181.method1251(-1)) {
            if (class175.field3161 != 0 && class184.field3304 != -1) {
                class93.method641(class184.field3304, 0, false, class175.field3161, class117.field2187, 16419);
            }
            class115.field2137 = false;
        } else if (class175.field3161 != 0 && class184.field3304 != -1 && !class181.method1251(-1)) {
            class105.field1911.method400(133, 8);
            class105.field1911.method1024(-36, class184.field3304);
            class86.field1625++;
            class184.field3304 = -1;
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(IIII)V")
    public abstract void method267(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIII)V")
    public abstract void method268(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIZIII)V")
    public static final void method269(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg3) {
            return;
        }
        int var7 = 0;
        class209[] var8 = class84.field1598;
        while (var7 < var8.length) {
            class209 var9 = var8[var7];
            if (var9 != null && var9.field3760 == 2) {
                class90.method628((var9.field3739 - class143.field2591 << 7) + var9.field3749, arg2 >> 1, (var9.field3743 - class184.field3319 << 7) + var9.field3742, 0, var9.field3741 * 2, arg1, arg4 >> 1, arg5);
                if (class56.field1164 > -1 && class44.field966 % 20 < 10) {
                    class137.field2476[var9.field3750].method273(arg6 + class56.field1164 - 12, class114.field2128 + -28 + arg0);
                }
            }
            var7++;
        }
        field741++;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)V")
    public abstract void method270(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIII)V")
    public abstract void method271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZIII)V")
    public final void method272(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field742++;
        if (!arg1) {
            this.field736 = -11;
        }
        int var6 = this.field736 << 3;
        int var7 = this.field727 << 3;
        int var8 = (arg4 << 4) + (var7 & 0xF);
        int var9 = (arg3 << 4) + (var6 & 0xF);
        this.method271(var6, var7, var9, var8, arg0, arg2);
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)V")
    public abstract void method273(int arg0, int arg1);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method274(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field726++;
        int var8 = 0;
        int var9 = arg7;
        int var10 = 0;
        if (arg2 != 8311) {
            method274(106, -119, 48, 126, 30, -45, -46, 4);
        }
        int var11 = arg6 - arg3;
        int var12 = arg7 - arg3;
        int var13 = arg6 * arg6;
        int var14 = arg7 * arg7;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = arg7 << 1;
        int var21 = var12 << 1;
        int var22 = (1 - var20) * var13 + var17;
        int var23 = var15 << 1;
        int var24 = (1 - var21) * var15 + var19;
        int var25 = var14 - (var20 - 1) * var18;
        int var26 = var16 - (var21 - 1) * var23;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var16 << 2;
        int var30 = var15 << 2;
        int var31 = (var20 - 3) * var18;
        int var32 = var17 * 3;
        int var33 = var19 * 3;
        int var34 = var28;
        int var35 = (arg7 - 1) * var27;
        int var36 = (var21 - 3) * var23;
        int var37 = var29;
        if (class159.field2910 <= arg0 && class224.field4040 >= arg0) {
            int[] var38 = class167.field3030[arg0];
            int var39 = class119.method843(class240.field4355, -113, arg4 - arg6, class146.field2678);
            int var40 = class119.method843(class240.field4355, -120, arg4 + arg6, class146.field2678);
            int var41 = class119.method843(class240.field4355, -121, arg4 - var11, class146.field2678);
            int var42 = class119.method843(class240.field4355, -115, arg4 + var11, class146.field2678);
            class114.method762(var39, 124, var41, arg5, var38);
            class114.method762(var41, arg2 - 8209, var42, arg1, var38);
            class114.method762(var42, 84, var40, arg5, var38);
        }
        int var43 = (var12 - 1) * var30;
        while (var9 > 0) {
            boolean var44 = var9 <= var12;
            var9--;
            if (var44) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var10++;
                        var26 += var37;
                        var24 += var33;
                        var37 += var29;
                        var33 += var29;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var10++;
                    var24 += var33;
                    var37 += var29;
                    var33 += var29;
                }
                var24 += -var43;
                var26 += -var36;
                var43 -= var30;
                var36 -= var30;
            }
            if (var22 < 0) {
                while (var22 < 0) {
                    var8++;
                    var22 += var32;
                    var32 += var28;
                    var25 += var34;
                    var34 += var28;
                }
            }
            if (var25 < 0) {
                var8++;
                var22 += var32;
                var32 += var28;
                var25 += var34;
                var34 += var28;
            }
            var22 += -var35;
            int var45 = arg0 - var9;
            var25 += -var31;
            var31 -= var27;
            var35 -= var27;
            int var46 = arg0 + var9;
            if (var46 >= class159.field2910 && class224.field4040 >= var45) {
                int var47 = class119.method843(class240.field4355, -110, arg4 + var8, class146.field2678);
                int var48 = class119.method843(class240.field4355, -108, arg4 - var8, class146.field2678);
                if (var44) {
                    int var49 = class119.method843(class240.field4355, -116, arg4 + var10, class146.field2678);
                    int var50 = class119.method843(class240.field4355, -112, arg4 - var10, class146.field2678);
                    if (var45 >= class159.field2910) {
                        int[] var51 = class167.field3030[var45];
                        class114.method762(var48, 89, var50, arg5, var51);
                        class114.method762(var50, 106, var49, arg1, var51);
                        class114.method762(var49, 106, var47, arg5, var51);
                    }
                    if (class224.field4040 >= var46) {
                        int[] var52 = class167.field3030[var46];
                        class114.method762(var48, 77, var50, arg5, var52);
                        class114.method762(var50, 100, var49, arg1, var52);
                        class114.method762(var49, 90, var47, arg5, var52);
                    }
                } else {
                    if (class159.field2910 <= var45) {
                        class114.method762(var48, 107, var47, arg5, class167.field3030[var45]);
                    }
                    if (var46 <= class224.field4040) {
                        class114.method762(var48, 98, var47, arg5, class167.field3030[var46]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(II)V")
    public abstract void method275(int arg0, int arg1);

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "(B)V")
    public static void method276(byte arg0) {
        field740 = null;
        field725 = null;
        field735 = null;
        field724 = null;
        field737 = null;
        if (arg0 < 29) {
            method269(-63, -117, 63, true, -94, 49, -97);
        }
        field739 = null;
        field738 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZILah;)I")
    public static final int method277(boolean arg0, int arg1, class9 arg2) {
        field728++;
        if (arg0) {
            field725 = null;
        }
        if (arg2.field271 == null || arg2.field271.length <= arg1) {
            return -2;
        }
        try {
            int[] var3 = arg2.field271[arg1];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var5++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 1) {
                    var8 = class196.field3523[var3[var5++]];
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 2) {
                    var8 = class115.field2142[var3[var5++]];
                }
                if (var7 == 3) {
                    var8 = class177.field3188[var3[var5++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class9 var12 = class119.method837((byte) 111, var11);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class214.method1408((byte) 102, var13).field2793 || class226.field4081)) {
                        for (int var14 = 0; var14 < var12.field224.length; var14++) {
                            if (var13 + 1 == var12.field224[var14]) {
                                var8 += var12.field189[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class141.field2561[var3[var5++]];
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 6) {
                    var8 = class180.field3259[class115.field2142[var3[var5++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class141.field2561[var3[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class93.field1712.field1149;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class125.field2342[var15]) {
                            var8 += class115.field2142[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class9 var18 = class119.method837((byte) 92, var17);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class214.method1408((byte) 102, var19).field2793 || class226.field4081)) {
                        for (int var20 = 0; var20 < var18.field224.length; var20++) {
                            if (var19 + 1 == var18.field224[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class230.field4146;
                }
                if (var7 == 12) {
                    var8 = class61.field1236;
                }
                if (var7 == 13) {
                    int var21 = class141.field2561[var3[var5++]];
                    int var22 = var3[var5++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var5++];
                    var8 = class8.method57(var23, -46);
                }
                if (var7 == 18) {
                    var8 = (class93.field1712.field4244 >> 7) + class143.field2591;
                }
                if (var7 == 19) {
                    var8 = (class93.field1712.field4221 >> 7) + class184.field3319;
                }
                if (var7 == 20) {
                    var8 = var3[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var4 += var8;
                    }
                    if (var6 == 1) {
                        var4 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var4 /= var8;
                    }
                    if (var6 == 3) {
                        var4 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }
}
