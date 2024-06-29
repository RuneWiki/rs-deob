import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class260 {

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field4160 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field4161 = new String[100];

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "Lhc;")
    public static class235 field4158;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IBI)V")
    public static final void method1762(int arg0, byte arg1, int arg2) {
        int var3 = class294.field4633 * arg2 >> 8;
        field4159++;
        if (arg0 == -1 && !class148.field2341) {
            class113.method800((byte) -63);
        } else if (arg0 != -1 && (class167.field2618 != arg0 || !class61.method462(1)) && var3 != 0 && !class148.field2341) {
            class90.method690(0, arg0, 2, var3, class31.field459, (byte) 114, false);
        }
        int var4 = 73 % ((10 - arg1) / 48);
        class167.field2618 = arg0;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V")
    public static void method1763(byte arg0) {
        field4161 = null;
        field4158 = null;
        if (arg0 != 109) {
            method1765((byte) -116);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BLai;)V")
    public static final void method1764(byte arg0, class88 arg1) {
        for (int var2 = 0; var2 < class265.field4229; var2++) {
            int var3 = arg1.method666(false);
            int var4 = arg1.method645(11596);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class136.field2103[var3] != null) {
                class136.field2103[var3].field651 = var4;
            }
        }
        if (arg0 > -32) {
            method1765((byte) -105);
        }
        field4163++;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(B)V")
    public static final void method1765(byte arg0) {
        if (arg0 != 22) {
            return;
        }
        field4156++;
        while (true) {
            class29 var1;
            class144 var3;
            do {
                var1 = (class29) class87.field1466.method1231(15);
                if (var1 == null) {
                    return;
                }
                if (var1.field397 >= 0) {
                    int var2 = var1.field397 - 1;
                    var3 = class255.field4082[var2];
                } else {
                    int var4 = -var1.field397 - 1;
                    if (class116.field1897 == var4) {
                        var3 = class283.field4473;
                    } else {
                        var3 = class210.field3267[var4];
                    }
                }
            } while (var3 == null);
            class193 var5 = class69.method501(0, var1.field400);
            int var6;
            int var7;
            if (var1.field410 == 1 || var1.field410 == 3) {
                var7 = var5.field3063;
                var6 = var5.field3028;
            } else {
                var6 = var5.field3063;
                var7 = var5.field3028;
            }
            int var8 = (var6 >> 1) + var1.field405;
            int var9 = (var7 >> 1) + var1.field399;
            int var10 = (var6 + 1 >> 1) + var1.field405;
            int var11 = (var7 + 1 >> 1) + var1.field399;
            int[][] var12 = class66.field1107[class240.field3892];
            int var13 = var12[var8][var9] + var12[var10][var9] + var12[var8][var11] + var12[var10][var11] >> 2;
            class43 var14 = null;
            int var15 = class51.field745[var1.field416];
            if (var15 == 0) {
                class7 var16 = class112.method790(class240.field3892, var1.field405, var1.field399);
                if (var16 != null) {
                    var14 = var16.field149;
                }
            } else if (var15 == 1) {
                class206 var17 = class160.method1084(class240.field3892, var1.field405, var1.field399);
                if (var17 != null) {
                    var14 = var17.field3224;
                }
            } else if (var15 == 2) {
                class293 var19 = class42.method310(class240.field3892, var1.field405, var1.field399);
                if (var19 != null) {
                    var14 = var19.field4619;
                }
            } else if (var15 == 3) {
                class140 var18 = class286.method1916(class240.field3892, var1.field405, var1.field399);
                if (var18 != null) {
                    var14 = var18.field2137;
                }
            }
            if (var14 != null) {
                class43.method317(class240.field3892, var1.field405, var1.field398 + 1, 0, -1, -1, 0, var1.field399, var1.field413 + 1, var15);
                var3.field2211 = var1.field399 * 128 + var7 * 64;
                var3.field2230 = var1.field405 * 128 + var6 * 64;
                var3.field2235 = class192.field2978 + var1.field398;
                var3.field2292 = var13;
                int var20 = var1.field402;
                int var21 = var1.field411;
                var3.field2290 = var14;
                if (var21 > var20) {
                    int var22 = var21;
                    var21 = var20;
                    var20 = var22;
                }
                var3.field2224 = class192.field2978 + var1.field413;
                int var23 = var1.field414;
                var3.field2264 = var1.field405 + var21;
                var3.field2251 = var1.field405 + var20;
                int var24 = var1.field417;
                if (var23 > var24) {
                    int var25 = var23;
                    var23 = var24;
                    var24 = var25;
                }
                var3.field2233 = var1.field399 + var23;
                var3.field2262 = var1.field399 + var24;
            }
        }
    }
}
