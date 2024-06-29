import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class65 extends class156 {

    @OriginalMember(owner = "client!e", name = "E", descriptor = "I")
    public static int field1027 = 0;

    @OriginalMember(owner = "client!e", name = "T", descriptor = "[Lkc;")
    public static class286[] field1031 = new class286[14];

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field1037 = "Loading sprites - ";

    @OriginalMember(owner = "client!e", name = "db", descriptor = "Z")
    public static boolean field1041 = false;

    @OriginalMember(owner = "client!e", name = "fb", descriptor = "B")
    public byte field1043;

    @OriginalMember(owner = "client!e", name = "R", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!e", name = "S", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!e", name = "U", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!e", name = "V", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!e", name = "bb", descriptor = "I")
    public int field1039;

    @OriginalMember(owner = "client!e", name = "cb", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!e", name = "eb", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!e", name = "W", descriptor = "Luf;")
    public static class176 field1034;

    @OriginalMember(owner = "client!e", name = "ab", descriptor = "Luf;")
    public static class176 field1038;

    @OriginalMember(owner = "client!e", name = "X", descriptor = "Lf;")
    public class37 field1035;

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "[I")
    public static int[] field1028;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(B)V")
    public static void method510(byte arg0) {
        field1031 = null;
        field1034 = null;
        if (arg0 != -65) {
            method510((byte) 69);
        }
        field1037 = null;
        field1028 = null;
        field1038 = null;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(Z)V")
    public static final void method511(boolean arg0) {
        class219.method1461();
        ++field1036;
        if (arg0) {
            method511(true);
        }
        for (int var1 = 0; var1 < 4; ++var1) {
            class72.field1142[var1].method612(2359552);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(I)V")
    public static final void method512(int arg0) {
        for (int var1 = 0; ~var1 > -6; ++var1) {
            class98.field1567[var1] = false;
        }
        class123.field1895 = 0;
        if (arg0 <= -97) {
            class1.field14 = -1;
            ++field1042;
            class189.field3014 = 0;
            class6.field111 = 5;
            class126.field1981 = -1;
        }
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(Z)V")
    public static final void method513(boolean arg0) {
        if (arg0) {
            for (int var1 = 0; var1 < class62.field1006; ++var1) {
                int var2 = class198.field3113[var1];
                class32 var3 = class72.field1144[var2];
                if (var3 != null) {
                    class74.method585(var3, var3.field518.field3352, 81);
                }
            }
            ++field1032;
        }
    }

    @OriginalMember(owner = "client!e", name = "f", descriptor = "(I)V")
    public static final void method514(int arg0) {
        if (arg0 != 0) {
            method516(97, 35, -94, (byte) -16, -106, 44);
        }
        while (true) {
            class146 var1;
            class264 var3;
            do {
                var1 = (class146) class69.field1092.method1011(-120);
                if (var1 == null) {
                    ++field1033;
                    return;
                }
                if (~var1.field2265 <= -1) {
                    int var2 = var1.field2265 - 1;
                    var3 = class72.field1144[var2];
                } else {
                    int var4 = -var1.field2265 + -1;
                    if (class294.field4623 != var4) {
                        var3 = class41.field675[var4];
                    } else {
                        var3 = class261.field4058;
                    }
                }
            } while (var3 == null);
            class73 var5 = class85.method690(2276, var1.field2263);
            int var6;
            int var7;
            if (var1.field2262 != 1 && var1.field2262 != 3) {
                var6 = var5.field1227;
                var7 = var5.field1232;
            } else {
                var7 = var5.field1227;
                var6 = var5.field1232;
            }
            int var8 = (var7 + 1 >> 1) + var1.field2267;
            int var9 = (var7 >> 1) + var1.field2267;
            int var10 = (var6 + 1 >> 1) + var1.field2275;
            int var11 = (var6 >> 1) + var1.field2275;
            int[][] var12 = class68.field1079[class274.field4318];
            int var13 = var12[var9][var11] - -var12[var9][var10] + var12[var8][var10] + var12[var8][var11] >> 2;
            int var14 = class77.field1309[var1.field2270];
            class205 var15 = null;
            if (~var14 == -1) {
                class228 var16 = class62.method495(class274.field4318, var1.field2267, var1.field2275);
                if (var16 != null) {
                    var15 = var16.field3565;
                }
            } else if (var14 == 1) {
                class247 var17 = class195.method1311(class274.field4318, var1.field2267, var1.field2275);
                if (var17 != null) {
                    var15 = var17.field3814;
                }
            } else if (var14 != 2) {
                if (var14 == 3) {
                    class180 var18 = class261.method1760(class274.field4318, var1.field2267, var1.field2275);
                    if (var18 != null) {
                        var15 = var18.field2689;
                    }
                }
            } else {
                class172 var19 = class3.method46(class274.field4318, var1.field2267, var1.field2275);
                if (var19 != null) {
                    var15 = var19.field2566;
                }
            }
            if (var15 != null) {
                class237.method1595(0, 0, var1.field2269 + 1, class274.field4318, var1.field2275, var1.field2268 - -1, var1.field2267, var14, -1, 0);
                var3.field4216 = var1.field2267 * 128 + var7 * 64;
                var3.field4129 = class267.field4256 + var1.field2269;
                var3.field4186 = class267.field4256 + var1.field2268;
                var3.field4195 = var13;
                var3.field4134 = var1.field2275 * 128 + var6 * 64;
                var3.field4138 = var15;
                int var20 = var1.field2264;
                int var21 = var1.field2266;
                int var22 = var1.field2271;
                int var23 = var1.field2274;
                if (~var21 > ~var20) {
                    int var24 = var20;
                    var20 = var21;
                    var21 = var24;
                }
                if (var23 < var22) {
                    int var25 = var22;
                    var22 = var23;
                    var23 = var25;
                }
                var3.field4182 = var1.field2267 - -var20;
                var3.field4202 = var1.field2275 + var23;
                var3.field4212 = var1.field2275 + var22;
                var3.field4172 = var1.field2267 + var21;
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(Z)I")
    public final int method515(boolean arg0) {
        ++field1030;
        if (this.field1035 == null) {
            return 0;
        } else {
            if (!arg0) {
                field1031 = null;
            }
            return this.field1035.field588 * 100 / (this.field1035.field583.length + -this.field1043);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIBII)V")
    public static final void method516(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        int var8 = arg0 + 1;
        class263.method1788(arg5, -18732, arg2, class156.field2379[arg0], arg1);
        int var9 = arg4 - 1;
        class263.method1788(arg5, -18732, arg2, class156.field2379[arg4], arg1);
        if (arg3 >= 0) {
            for (int var6 = var8; var6 <= var9; ++var6) {
                int[] var7 = class156.field2379[var6];
                var7[arg5] = var7[arg1] = arg2;
            }
            ++field1040;
        }
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(I)[B")
    public final byte[] method517(int arg0) {
        if (arg0 != 10933) {
            method512(-85);
        }
        ++field1029;
        if (!super.field2386 && this.field1035.field583.length + -this.field1043 <= this.field1035.field588) {
            return this.field1035.field583;
        } else {
            throw new RuntimeException();
        }
    }
}
