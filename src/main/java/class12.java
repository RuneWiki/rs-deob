import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public abstract class class12 {

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field249 = 0;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "Lsc;")
    public static class181 field255 = class149.method967(255, "::rect_debug");

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field250 = 0;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "Lsc;")
    private static class181 field254 = class149.method967(255, "Members only world");

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "Lsc;")
    public static class181 field248 = field254;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public abstract void method32(byte arg0);

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIB)I")
    public static final int method120(int arg0, int arg1, byte arg2) {
        field247++;
        int var3 = arg0 + (arg1 * 57);
        int var4 = var3 << 13 ^ var3;
        if (arg2 != -124) {
            field255 = null;
        }
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIBLo;)V")
    public static final void method121(int arg0, int arg1, byte arg2, class175 arg3) {
        field253++;
        if (class25.field439 != 0 && class25.field439 != 3 || !arg3.method1160(93)) {
            return;
        }
        if (arg2 != -106) {
            method124(false, (class11) null);
        }
        int var4 = arg3.field2968[arg1];
        if (var4 > arg0 || (var4 + arg3.field3055[arg1]) < arg0) {
            return;
        }
        int var5 = arg1 - arg3.field3041 / 2;
        int var6 = class214.field3682 + class144.field2348 & 0x7FF;
        int var7 = arg0 - arg3.field3057 / 2;
        int var8 = class72.field1145[var6];
        int var9 = class72.field1150[var6];
        int var10 = (class221.field3821 + 256) * var8 >> 8;
        int var11 = (class221.field3821 + 256) * var9 >> 8;
        int var12 = var5 * var11 + (var7 * var10) >> 11;
        int var13 = class258.field4507.field2654 + var12 >> 7;
        int var14 = var5 * var10 - (var7 * var11) >> 11;
        int var15 = class258.field4507.field2681 - var14 >> 7;
        if (class264.field4594 > 0 && class68.field1095[82] && class68.field1095[81]) {
            class68.method477(class222.field3844 + var15, class38.field581, (byte) -62, class253.field4420 + var13);
            return;
        }
        boolean var16 = class201.method1356(0, (byte) 119, var15, 0, var13, class258.field4507.field2623[0], 0, true, 0, 0, class258.field4507.field2672[0], 1);
        if (!var16) {
            return;
        }
        class141.field2275.method1538(var7, (byte) -66);
        class141.field2275.method1538(var5, (byte) 46);
        class141.field2275.method1534(arg2 + 106, class214.field3682);
        class141.field2275.method1538(57, (byte) 47);
        class141.field2275.method1538(class144.field2348, (byte) 41);
        class141.field2275.method1538(class221.field3821, (byte) 74);
        class141.field2275.method1538(89, (byte) 96);
        class141.field2275.method1534(arg2 ^ 0xFFFFFF96, class258.field4507.field2654);
        class141.field2275.method1534(0, class258.field4507.field2681);
        class141.field2275.method1538(class253.field4412, (byte) -77);
        class141.field2275.method1538(63, (byte) 45);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static void method122(int arg0) {
        int var1 = -74 % ((arg0 + 75) / 45);
        field254 = null;
        field248 = null;
        field255 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIZIIILvf;B)V")
    public static final void method123(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, class230 arg7, byte arg8) {
        if (arg0 >= 0 && arg0 < 104 && arg6 >= 0 && arg6 < 104) {
            if (!arg3) {
                class70.field1129[arg2][arg0][arg6] = 0;
            }
            while (true) {
                int var9 = arg7.method1516((byte) 82);
                if (var9 == 0) {
                    if (arg3) {
                        class31.field505[0][arg0][arg6] = class21.field379[0][arg0][arg6];
                    } else if (arg2 == 0) {
                        class31.field505[0][arg0][arg6] = -class160.method1075(arg6 + arg4 + 556238, arg0 + 932731 + arg1, true) * 8;
                    } else {
                        class31.field505[arg2][arg0][arg6] = class31.field505[arg2 - 1][arg0][arg6] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg7.method1516((byte) 82);
                    if (arg3) {
                        class31.field505[0][arg0][arg6] = var10 * 8 + class21.field379[0][arg0][arg6];
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg2 == 0) {
                            class31.field505[0][arg0][arg6] = -var10 * 8;
                        } else {
                            class31.field505[arg2][arg0][arg6] = class31.field505[arg2 - 1][arg0][arg6] - (var10 * 8);
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class35.field548[arg2][arg0][arg6] = arg7.method1563(-255688184);
                    class18.field328[arg2][arg0][arg6] = (byte) ((var9 - 2) / 4);
                    class1.field29[arg2][arg0][arg6] = (byte) class5.method43(arg5 + var9 - 2, 3);
                } else if (var9 > 81) {
                    class2.field61[arg2][arg0][arg6] = (byte) (var9 - 81);
                } else if (!arg3) {
                    class70.field1129[arg2][arg0][arg6] = (byte) (var9 - 49);
                }
            }
        } else {
            while (true) {
                int var11 = arg7.method1516((byte) 82);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg7.method1516((byte) 82);
                    break;
                }
                if (var11 <= 49) {
                    arg7.method1516((byte) 82);
                }
            }
        }
        field252++;
        if (arg8 != 82) {
            method122(-86);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZLjb;)I")
    public static final int method124(boolean arg0, class11 arg1) {
        field251++;
        int var2 = 0;
        if (arg1.method94(class194.field3400, (byte) 108)) {
            var2++;
        }
        if (arg1.method94(class225.field3882, (byte) 113)) {
            var2++;
        }
        if (arg0) {
            field255 = null;
        }
        if (arg1.method94(class76.field1224, (byte) 97)) {
            var2++;
        }
        if (arg1.method94(class159.field2727, (byte) 121)) {
            var2++;
        }
        if (arg1.method94(class210.field3610, (byte) 93)) {
            var2++;
        }
        if (arg1.method94(class192.field3376, (byte) 94)) {
            var2++;
        }
        if (arg1.method94(class166.field2827, (byte) 121)) {
            var2++;
        }
        if (arg1.method94(class182.field3209, (byte) 77)) {
            var2++;
        }
        if (arg1.method94(class163.field2779, (byte) 67)) {
            var2++;
        }
        if (arg1.method94(class263.field4582, (byte) 114)) {
            var2++;
        }
        if (arg1.method94(class83.field1332, (byte) 123)) {
            var2++;
        }
        if (arg1.method94(class92.field1468, (byte) 105)) {
            var2++;
        }
        if (arg1.method94(class264.field4613, (byte) 104)) {
            var2++;
        }
        var2++;
        if (arg1.method94(class76.field1230, (byte) 120)) {
            var2++;
        }
        if (arg1.method94(class151.field2521, (byte) 114)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)I")
    public abstract int method31(int arg0, int arg1, int arg2);
}
