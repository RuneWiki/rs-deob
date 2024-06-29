import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class100 {

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field2284 = 0;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "Lrc;")
    private static class105 field2292 = class43.method374("glow2:", 0);

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "Lrc;")
    private static class105 field2287 = class43.method374("wave:", 0);

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "Lrc;")
    public static class105 field2290 = field2292;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "Lrc;")
    public static class105 field2286 = field2287;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "[I")
    public static int[] field2289 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static volatile int field2288 = -1;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "Lme;")
    public static class77 field2285;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "[I")
    public static int[] field2283;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)I", line = 9)
    public static int method807(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V", line = 30)
    public static void method808(byte arg0) {
        int var1 = -56 / ((arg0 + 23) / 44);
        field2290 = null;
        field2286 = null;
        field2285 = null;
        field2287 = null;
        field2283 = null;
        field2289 = null;
        field2292 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIBLpb;)[Lbd;", line = 76)
    public static final class11[] method809(int arg0, int arg1, byte arg2, class92 arg3) {
        field2294++;
        if (class58.method466(arg0, arg1, (byte) 112, arg3)) {
            return arg2 == -54 ? class120.method971(200) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V", line = 96)
    public static final void method810(int arg0) {
        class28.field629 = true;
        class110.method890(0);
        if (arg0 > -8) {
            return;
        }
        if (client.field424 != -1) {
            boolean var2 = class87.method719(client.field424, 0, 0, 261, 104, 190, 1);
            if (!var2) {
                class80.field1805 = true;
            }
        } else if (class120.field2901[class134.field3265] != -1) {
            boolean var1 = class87.method719(class120.field2901[class134.field3265], 0, 0, 261, 104, 190, 1);
            if (!var1) {
                class80.field1805 = true;
            }
        }
        field2293++;
        if (class130.field3165 && class1.field13 == 1) {
            if (class90.field2075 == 1) {
                class109.method882((byte) 12);
            } else {
                class130.method1045(false);
            }
        }
        class111.method910(15755);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IILd;IB)V", line = 149)
    public static final void method811(int arg0, int arg1, class19 arg2, int arg3, byte arg4) {
        field2282++;
        if (class113.field2652 >= 400) {
            return;
        }
        if (arg2.field462 != null) {
            arg2 = arg2.method223(true);
        }
        if (arg2 == null || (!arg2.field495 || arg4 != 42)) {
            return;
        }
        class105 var5 = arg2.field454;
        if (arg2.field482 != 0) {
            var5 = class108.method878(new class105[] { var5, class85.method709((byte) 118, class119.field2842.field306, arg2.field482), class132.field3181, class88.field1988, class75.method637(arg2.field482, 8241), class15.field312 }, arg4 ^ 0xB19);
        }
        if (class57.field1199 == 1) {
            class105.method832(9, arg3, arg0, (byte) 123, class108.method878(new class105[] { class29.field661, class109.field2517, var5 }, 2867), class43.field1007, arg1);
            class7.field113++;
        } else if (class122.field3003 != 1) {
            class71.field1557++;
            class105[] var6 = arg2.field500;
            if (class128.field3114) {
                var6 = class96.method799(81, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method831(class42.field966, -21607)) {
                        class28.field632++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 38;
                        }
                        if (var7 == 1) {
                            var8 = 1;
                        }
                        if (var7 == 2) {
                            var8 = 53;
                        }
                        if (var7 == 3) {
                            var8 = 22;
                        }
                        if (var7 == 4) {
                            var8 = 3;
                        }
                        class105.method832(var8, arg3, arg0, (byte) 123, class108.method878(new class105[] { class19.field490, var5 }, 2867), var6[var7], arg1);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method831(class42.field966, -21607)) {
                        class30.field678++;
                        int var10 = 0;
                        short var11 = 0;
                        if (class119.field2842.field306 < arg2.field482) {
                            var11 = 2000;
                        }
                        if (var9 == 0) {
                            var10 = var11 + 38;
                        }
                        if (var9 == 1) {
                            var10 = var11 + 1;
                        }
                        if (var9 == 2) {
                            var10 = var11 + 53;
                        }
                        if (var9 == 3) {
                            var10 = var11 + 22;
                        }
                        if (var9 == 4) {
                            var10 = var11 + 3;
                        }
                        class105.method832(var10, arg3, arg0, (byte) 126, class108.method878(new class105[] { class19.field490, var5 }, 2867), var6[var9], arg1);
                    }
                }
            }
            class105.method832(1001, arg3, arg0, (byte) 127, class108.method878(new class105[] { class19.field490, var5 }, 2867), class51.field1082, arg1);
        } else if ((class84.field1886 & 0x2) == 2) {
            class18.field383++;
            class105.method832(34, arg3, arg0, (byte) 125, class108.method878(new class105[] { class105.field2386, class109.field2517, var5 }, arg4 + 2825), class84.field1884, arg1);
        }
    }
}
