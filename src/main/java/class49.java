import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class49 {

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "J")
    public long field807 = 0L;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "[J")
    public static long[] field794 = new long[200];

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "Lna;")
    public static class31 field805 = new class31();

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
    public static int field811 = 0;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "[I")
    public static int[] field810 = new int[32];

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "F")
    public static float field809;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public int field796;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public int field797;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
    public int field799;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public int field801;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
    public int field802;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public int field803;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
    public int field813;

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "Ltg;")
    public static class180 field814;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "Lrk;")
    public class265 field798;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "Lrk;")
    public class265 field800;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "[Lde;")
    public static class108[] field808;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
    public static void method359(int arg0) {
        field810 = null;
        field794 = null;
        field808 = null;
        field814 = null;
        if (arg0 <= 20) {
            method361(104, 83, (class180) null, 60);
        }
        field805 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(SI)Z")
    public static final boolean method360(short arg0, int arg1) {
        field815++;
        if (arg0 == 24 || arg0 == 25 || arg0 == 39 || arg0 == 31 || arg0 == 32 || arg0 == 45 || arg0 == 11 || arg0 == 18) {
            return true;
        } else if (arg0 == 14 || arg0 == 49 || arg0 == 1004 || arg0 == 1001) {
            return true;
        } else if (arg0 == 7 || arg0 == 48 || arg0 == 38 || arg0 == 19 || arg0 == 50) {
            return true;
        } else if (arg0 == 2 || arg0 == 30 || arg0 == 47 || arg0 == 13 || arg0 == 10 || arg0 == 60) {
            return true;
        } else {
            if (arg1 != -48) {
                field794 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IILtg;I)[Llk;")
    public static final class82[] method361(int arg0, int arg1, class180 arg2, int arg3) {
        field804++;
        if (arg0 == -21) {
            return class90.method648(arg3, arg1, arg2, -41) ? class204.method1391(false) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIIIIIZII)Z")
    public static final boolean method362(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11) {
        field793++;
        if (class262.field4631.method984((byte) -34) == arg2) {
            return class269.method1805(arg6, arg7, arg1, arg10, arg4, arg11, arg5, 0, arg0, arg3, arg8, arg9);
        } else if (class262.field4631.method984((byte) -34) > 2) {
            return class275.method1828(arg0, arg5, arg9, arg1, false, arg8, class262.field4631.method984((byte) -34), arg10, arg11, arg6, arg4, arg3, arg7);
        } else {
            return class282.method1911(arg11, arg7, arg6, arg5, arg1, arg3, arg4, 124, arg0, arg8, arg9, arg10);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILua;B)I")
    public static final int method363(int arg0, class113 arg1, byte arg2) {
        field795++;
        int var3 = 74 % ((34 - arg2) / 50);
        if (arg1.field1950 == null || arg0 >= arg1.field1950.length) {
            return -2;
        }
        try {
            int var4 = 0;
            int[] var5 = arg1.field1950[arg0];
            int var6 = 0;
            byte var7 = 0;
            while (true) {
                int var8 = var5[var4++];
                byte var9 = 0;
                int var10 = 0;
                if (var8 == 0) {
                    return var6;
                }
                if (var8 == 1) {
                    var10 = class157.field2733[var5[var4++]];
                }
                if (var8 == 15) {
                    var9 = 1;
                }
                if (var8 == 16) {
                    var9 = 2;
                }
                if (var8 == 2) {
                    var10 = class259.field4589[var5[var4++]];
                }
                if (var8 == 3) {
                    var10 = class46.field758[var5[var4++]];
                }
                if (var8 == 4) {
                    int var11 = var5[var4++] << 16;
                    int var12 = var11 + var5[var4++];
                    class113 var13 = class233.method1569(65535, var12);
                    int var14 = var5[var4++];
                    if (var14 != -1 && (!class23.method177((byte) -127, var14).field3782 || class29.field541)) {
                        for (int var15 = 0; var15 < var13.field1889.length; var15++) {
                            if (var14 + 1 == var13.field1889[var15]) {
                                var10 += var13.field1951[var15];
                            }
                        }
                    }
                }
                if (var8 == 5) {
                    var10 = class17.field314[var5[var4++]];
                }
                if (var8 == 6) {
                    var10 = class125.field2185[class259.field4589[var5[var4++]] - 1];
                }
                if (var8 == 17) {
                    var9 = 3;
                }
                if (var8 == 7) {
                    var10 = class17.field314[var5[var4++]] * 100 / 46875;
                }
                if (var8 == 8) {
                    var10 = class262.field4631.field2455;
                }
                if (var8 == 9) {
                    for (int var16 = 0; var16 < 25; var16++) {
                        if (class2.field84[var16]) {
                            var10 += class259.field4589[var16];
                        }
                    }
                }
                if (var8 == 10) {
                    int var17 = var5[var4++] << 16;
                    int var18 = var17 + var5[var4++];
                    class113 var19 = class233.method1569(65535, var18);
                    int var20 = var5[var4++];
                    if (var20 != -1 && (!class23.method177((byte) -109, var20).field3782 || class29.field541)) {
                        for (int var21 = 0; var21 < var19.field1889.length; var21++) {
                            if (var20 + 1 == var19.field1889[var21]) {
                                var10 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var8 == 11) {
                    var10 = class211.field3620;
                }
                if (var8 == 12) {
                    var10 = class20.field373;
                }
                if (var8 == 13) {
                    int var22 = class17.field314[var5[var4++]];
                    int var23 = var5[var4++];
                    var10 = (var22 & 0x1 << var23) == 0 ? 0 : 1;
                }
                if (var8 == 14) {
                    int var24 = var5[var4++];
                    var10 = class45.method341(var24, -14715);
                }
                if (var8 == 18) {
                    var10 = (class262.field4631.field4791 >> 7) + field806;
                }
                if (var8 == 19) {
                    var10 = (class262.field4631.field4793 >> 7) + class91.field1480;
                }
                if (var8 == 20) {
                    var10 = var5[var4++];
                }
                if (var9 == 0) {
                    if (var7 == 0) {
                        var6 += var10;
                    }
                    if (var7 == 1) {
                        var6 -= var10;
                    }
                    if (var7 == 2 && var10 != 0) {
                        var6 /= var10;
                    }
                    if (var7 == 3) {
                        var6 *= var10;
                    }
                    var7 = 0;
                } else {
                    var7 = var9;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BLtg;)V")
    public static final void method364(byte arg0, class180 arg1) {
        field812++;
        class233.field4056 = arg1;
        class236.field4107 = class233.field4056.method1259(4, arg0 ^ 0x55);
        if (arg0 != 42) {
            method365(68, -68, (byte) 31, 121, 36);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIBII)V")
    public static final void method365(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field816++;
        if (arg2 != -65) {
            return;
        }
        for (int var5 = 0; var5 < class31.field585; var5++) {
            if ((class91.field1478[var5] + class169.field2958[var5]) > arg1 && class169.field2958[var5] < arg1 + arg3 && class232.field4052[var5] + class14.field278[var5] > arg0 && class232.field4052[var5] < (arg0 + arg4)) {
                class207.field3583[var5] = true;
            }
        }
    }
}
