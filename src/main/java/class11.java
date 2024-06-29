import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class11 extends class155 {

    @OriginalMember(owner = "client!ji", name = "E", descriptor = "I")
    public static int field194 = -1;

    @OriginalMember(owner = "client!ji", name = "B", descriptor = "I")
    public static int field191 = -1;

    @OriginalMember(owner = "client!ji", name = "G", descriptor = "Z")
    public static boolean field196 = false;

    @OriginalMember(owner = "client!ji", name = "C", descriptor = "I")
    public static int field192 = 0;

    @OriginalMember(owner = "client!ji", name = "A", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!ji", name = "D", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!ji", name = "I", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!ji", name = "M", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!ji", name = "N", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!ji", name = "J", descriptor = "Luj;")
    private class132 field198;

    @OriginalMember(owner = "client!ji", name = "F", descriptor = "Lqj;")
    public static class164 field195;

    @OriginalMember(owner = "client!ji", name = "L", descriptor = "Lnd;")
    public static class191 field199;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;")
    public final String method60(String arg0, int arg1, byte arg2) {
        field190++;
        if (this.field198 == null) {
            return arg0;
        }
        class280 var4 = (class280) this.field198.method987(-128, (long) arg1);
        if (var4 == null) {
            return arg0;
        } else {
            if (arg2 >= -34) {
                method65(-114);
            }
            return var4.field4651;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lab;I)V")
    public final void method61(class249 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1802((byte) -123);
            if (var3 == 0) {
                if (arg1 != 127) {
                    field194 = -75;
                }
                field201++;
                return;
            }
            this.method62(arg0, var3, 107);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lab;II)V")
    private final void method62(class249 arg0, int arg1, int arg2) {
        field193++;
        if (arg1 == 249) {
            int var4 = arg0.method1802((byte) -107);
            if (this.field198 == null) {
                int var5 = class91.method633(var4, (byte) 52);
                this.field198 = new class132(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method1802((byte) 98) == 1;
                int var8 = arg0.method1812((byte) 52);
                class134 var9;
                if (var7) {
                    var9 = new class280(arg0.method1769(1));
                } else {
                    var9 = new class113(arg0.method1800(-103));
                }
                this.field198.method986((long) var8, true, var9);
            }
        }
        int var10 = -109 % ((arg2 - 27) / 47);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)I")
    public final int method63(int arg0, int arg1, int arg2) {
        field197++;
        if (this.field198 == null) {
            return arg0;
        } else if (arg1 <= 65) {
            return -80;
        } else {
            class113 var4 = (class113) this.field198.method987(-116, (long) arg2);
            return var4 == null ? arg0 : var4.field1929;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILab;)V")
    public static final void method64(int arg0, class249 arg1) {
        field200++;
        if ((arg1.field4182.length - arg1.field4160) < 1) {
            return;
        }
        int var2 = arg1.method1802((byte) 64);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (arg1.field4182.length - arg1.field4160 < var3) {
            return;
        }
        class15.field304 = arg1.method1802((byte) -98);
        if (class15.field304 < 1) {
            class15.field304 = 1;
        } else if (class15.field304 > 4) {
            class15.field304 = 4;
        }
        class180.method1312(arg0 ^ 0xFFFFFFE2, arg1.method1802((byte) 59) == 1);
        class79.field1325 = arg1.method1802((byte) 109) == 1;
        class162.field2636 = arg1.method1802((byte) -88) == 1;
        class145.field2388 = arg1.method1802((byte) -92) == 1;
        class259.field4357 = arg1.method1802((byte) 59) == 1;
        class54.field916 = arg1.method1802((byte) -89) == 1;
        class190.field3044 = arg1.method1802((byte) -124) == 1;
        class68.field1142 = arg1.method1802((byte) 84) == 1;
        class162.field2631 = arg1.method1802((byte) 52);
        if (class162.field2631 > 2) {
            class162.field2631 = 2;
        }
        if (var2 < 2) {
            class197.field3201 = arg1.method1802((byte) -116) == 1;
            arg1.method1802((byte) -102);
        } else {
            class197.field3201 = arg1.method1802((byte) 121) == 1;
        }
        if (arg0 != 29) {
            method64(110, (class249) null);
        }
        class113.field1934 = arg1.method1802((byte) -105) == 1;
        class141.field2337 = arg1.method1802((byte) 109) == 1;
        class97.field1560 = arg1.method1802((byte) -111);
        if (class97.field1560 > 2) {
            class97.field1560 = 2;
        }
        class265.field4440 = class97.field1560;
        class186.field2977 = arg1.method1802((byte) -128) == 1;
        class283.field4682 = arg1.method1802((byte) 33);
        if (class283.field4682 > 127) {
            class283.field4682 = 127;
        }
        class289.field4767 = arg1.method1802((byte) 88);
        class292.field4785 = arg1.method1802((byte) 40);
        if (class292.field4785 > 127) {
            class292.field4785 = 127;
        }
        if (var2 >= 1) {
            class175.field2827 = arg1.method1821((byte) 51);
            class222.field3731 = arg1.method1821((byte) 51);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method1802((byte) -94);
        }
        if (var2 >= 4) {
            int var4 = arg1.method1802((byte) -109);
            if (class86.field1430 < 96) {
                var4 = 0;
            }
            class139.method1031(var4);
        }
        if (var2 >= 5) {
            class72.field1257 = arg1.method1800(arg0 + 91);
        }
        if (var2 >= 6) {
            class297.field4862 = arg1.method1802((byte) -125);
        }
        if (var2 >= 7) {
            class173.field2789 = arg1.method1802((byte) 89) == 1;
        }
        if (var2 >= 8) {
            class46.field814 = arg1.method1802((byte) 34) == 1;
        }
        if (var2 >= 9) {
            class16.field328 = arg1.method1802((byte) -99);
        }
        if (var2 >= 10) {
            class253.field4291 = arg1.method1802((byte) 49) != 0;
        }
        if (var2 >= 11) {
            class245.field4117 = arg1.method1802((byte) -106) != 0;
        }
    }

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "(I)V")
    public static void method65(int arg0) {
        if (arg0 == 1) {
            field195 = null;
            field199 = null;
        }
    }
}
