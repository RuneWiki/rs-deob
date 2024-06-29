import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class235 {

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    public static int field4041 = 0;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "Lmh;")
    public static class128 field4038 = class22.method156(122, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "[J")
    public static long[] field4044 = new long[1000];

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V", line = 16)
    public static void method1611(int arg0) {
        field4044 = null;
        field4038 = null;
        if (arg0 != 0) {
            field4041 = -20;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IBLem;)I", line = 27)
    public static final int method1612(int arg0, byte arg1, class10 arg2) {
        field4042++;
        if (arg2.field320 == null || arg0 >= arg2.field320.length) {
            return -2;
        }
        try {
            if (arg1 != 10) {
                return -44;
            }
            int[] var3 = arg2.field320[arg0];
            int var4 = 0;
            byte var5 = 0;
            int var6 = 0;
            while (true) {
                int var7 = 0;
                byte var8 = 0;
                int var9 = var3[var4++];
                if (var9 == 0) {
                    return var6;
                }
                if (var9 == 1) {
                    var7 = class128.field2219[var3[var4++]];
                }
                if (var9 == 15) {
                    var8 = 1;
                }
                if (var9 == 2) {
                    var7 = class221.field3884[var3[var4++]];
                }
                if (var9 == 16) {
                    var8 = 2;
                }
                if (var9 == 3) {
                    var7 = class207.field3631[var3[var4++]];
                }
                if (var9 == 4) {
                    int var10 = var3[var4++] << 16;
                    int var11 = var10 + var3[var4++];
                    class10 var12 = class233.method1606(true, var11);
                    int var13 = var3[var4++];
                    if (var13 != -1 && (!class180.method1226(false, var13).field3485 || class170.field2961)) {
                        for (int var14 = 0; var14 < var12.field336.length; var14++) {
                            if (var13 + 1 == var12.field336[var14]) {
                                var7 += var12.field324[var14];
                            }
                        }
                    }
                }
                if (var9 == 17) {
                    var8 = 3;
                }
                if (var9 == 5) {
                    var7 = class104.field1778[var3[var4++]];
                }
                if (var9 == 6) {
                    var7 = class229.field3988[class221.field3884[var3[var4++]] - 1];
                }
                if (var9 == 7) {
                    var7 = class104.field1778[var3[var4++]] * 100 / 46875;
                }
                if (var9 == 8) {
                    var7 = class163.field2796.field2081;
                }
                if (var9 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class292.field4999[var15]) {
                            var7 += class221.field3884[var15];
                        }
                    }
                }
                if (var9 == 10) {
                    int var16 = var3[var4++] << 16;
                    int var17 = var16 + var3[var4++];
                    class10 var18 = class233.method1606(true, var17);
                    int var19 = var3[var4++];
                    if (var19 != -1 && (!class180.method1226(false, var19).field3485 || class170.field2961)) {
                        for (int var20 = 0; var20 < var18.field336.length; var20++) {
                            if ((var19 + 1) == var18.field336[var20]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var9 == 11) {
                    var7 = class57.field1087;
                }
                if (var9 == 12) {
                    var7 = class6.field116;
                }
                if (var9 == 13) {
                    int var21 = class104.field1778[var3[var4++]];
                    int var22 = var3[var4++];
                    var7 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var9 == 14) {
                    int var23 = var3[var4++];
                    var7 = class56.method375((byte) -109, var23);
                }
                if (var9 == 18) {
                    var7 = (class163.field2796.field478 >> 7) + class221.field3889;
                }
                if (var9 == 19) {
                    var7 = (class163.field2796.field418 >> 7) + class4.field72;
                }
                if (var9 == 20) {
                    var7 = var3[var4++];
                }
                if (var8 == 0) {
                    if (var5 == 0) {
                        var6 += var7;
                    }
                    if (var5 == 1) {
                        var6 -= var7;
                    }
                    if (var5 == 2 && var7 != 0) {
                        var6 /= var7;
                    }
                    if (var5 == 3) {
                        var6 *= var7;
                    }
                    var5 = 0;
                } else {
                    var5 = var8;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)Z", line = 233)
    public static final boolean method1613(int arg0) {
        if (arg0 < 74) {
            method1611(56);
        }
        field4039++;
        try {
            if ((++class181.field3174) <= 1500) {
                if (class234.field4033 == 0) {
                    if (class71.method470(true) - 5000L >= class70.field1309) {
                        class70.field1309 = class71.method470(true);
                        class118.field1994 = class288.field4925.method1902(103, class163.field2801, class17.field485);
                        class234.field4033 = 1;
                        return false;
                    } else {
                        return true;
                    }
                } else if (class234.field4033 == 1) {
                    if (class118.field1994.field560 == 2) {
                        throw new IOException();
                    } else if (class118.field1994.field560 == 1) {
                        int var1 = 0;
                        class121.field2041 = new class180((Socket) class118.field1994.field562, class288.field4925);
                        class118.field1994 = null;
                        if (class252.field4356) {
                            var1 = class314.field5328;
                        }
                        class71.field1320.field3380 = 0;
                        class71.field1320.method1352(7528, 102);
                        class71.field1320.method1337(-91, var1);
                        class121.field2041.method1228(class71.field1320.field3417, 0, false, class71.field1320.field3380);
                        if (class257.field4412 != null) {
                            class257.field4412.method1676(-6244);
                        }
                        if (class310.field5264 != null) {
                            class310.field5264.method1676(-6244);
                        }
                        class65.field1250 = class121.field2041.method1231(-1);
                        if (class257.field4412 != null) {
                            class257.field4412.method1676(-6244);
                        }
                        if (class310.field5264 != null) {
                            class310.field5264.method1676(-6244);
                        }
                        class234.field4033 = 2;
                        return false;
                    } else {
                        return false;
                    }
                } else if (class234.field4033 != 2) {
                    int var2 = class121.field2041.method1230((byte) 84);
                    if (var2 < 1) {
                        return false;
                    }
                    class121.field2041.method1227(class297.field5071, (byte) -81, class7.field149, var2);
                    class7.field149 += var2;
                    if (class65.field1250 > class7.field149) {
                        return false;
                    }
                    class250.method1750((byte) 71, class297.field5071);
                    int var3 = 0;
                    class219.field3862 = new class140[class91.field1556];
                    for (int var4 = class161.field2754; var4 <= class65.field1253; var4++) {
                        class140 var5 = class105.method647(var4, false);
                        if (var5 != null) {
                            class219.field3862[var3++] = var5;
                        }
                    }
                    class121.field2041.method1229(false);
                    class121.field2041 = null;
                    class288.method1983((byte) 66);
                    return true;
                } else if (class121.field2041.method1230((byte) -7) >= 1) {
                    class65.field1250 <<= 0x8;
                    class65.field1250 += class121.field2041.method1231(-1);
                    class297.field5071 = new byte[class65.field1250];
                    class297.field5071[1] = (byte) class238.method1622(class65.field1250, 255);
                    class234.field4033 = 3;
                    class297.field5071[0] = (byte) (class65.field1250 >> 8);
                    return false;
                } else {
                    return false;
                }
            } else if (class121.field2041 != null) {
                class121.field2041.method1229(false);
                class121.field2041 = null;
                class288.method1983((byte) 66);
                return true;
            } else if (class56.field1085 >= 1) {
                class288.method1983((byte) 66);
                return true;
            } else {
                class56.field1085++;
                class181.field3174 = 0;
                if (class182.field3195 == class17.field485) {
                    class17.field485 = class236.field4059;
                } else {
                    class17.field485 = class182.field3195;
                }
                class234.field4033 = 0;
                return false;
            }
        } catch (IOException var7) {
            if (class121.field2041 != null) {
                class121.field2041.method1229(false);
                class121.field2041 = null;
            }
            if (class56.field1085 >= 1) {
                class288.method1983((byte) 66);
                return true;
            }
            if (class182.field3195 == class17.field485) {
                class17.field485 = class236.field4059;
            } else {
                class17.field485 = class182.field3195;
            }
            class234.field4033 = 0;
            class181.field3174 = 0;
            class56.field1085++;
            return false;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lcb;ILbg;I)V", line = 421)
    public static final void method1614(class270 arg0, int arg1, class194 arg2, int arg3) {
        class132 var4 = new class132();
        field4040++;
        var4.field2285 = arg2.method1325(arg1 ^ 0xFFFFE230);
        var4.field2293 = arg2.method1350(false);
        var4.field2289 = new int[var4.field2285];
        var4.field2288 = new int[var4.field2285];
        var4.field2282 = new class23[var4.field2285];
        var4.field2297 = new int[var4.field2285];
        var4.field2298 = new byte[var4.field2285][][];
        var4.field2295 = new class23[var4.field2285];
        if (arg1 != -5) {
            return;
        }
        for (int var5 = 0; var5 < var4.field2285; var5++) {
            try {
                int var6 = arg2.method1325(7627);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg2.method1319(1).method825(-24750));
                    String var18 = new String(arg2.method1319(1).method825(arg1 ^ 0x60A9));
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg2.method1350(false);
                    }
                    var4.field2289[var5] = var6;
                    var4.field2297[var5] = var19;
                    var4.field2282[var5] = arg0.method1891(class62.method406((byte) -68, var17), 2, var18);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg2.method1319(arg1 ^ 0xFFFFFFFA).method825(arg1 - 24745));
                    String var8 = new String(arg2.method1319(arg1 + 6).method825(arg1 - 24745));
                    int var9 = arg2.method1325(7627);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg2.method1319(1).method825(-24750));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg2.method1350(false);
                            var12[var13] = new byte[var14];
                            arg2.method1347(var14, 0, arg1 + 48, var12[var13]);
                        }
                    }
                    Class[] var15 = new Class[var9];
                    var4.field2289[var5] = var6;
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class62.method406((byte) -68, var10[var16]);
                    }
                    var4.field2295[var5] = arg0.method1886(var8, arg1 - 13, class62.method406((byte) -68, var7), var15);
                    var4.field2298[var5] = var12;
                }
            } catch (ClassNotFoundException var25) {
                var4.field2288[var5] = -1;
            } catch (SecurityException var26) {
                var4.field2288[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field2288[var5] = -3;
            } catch (Exception var28) {
                var4.field2288[var5] = -4;
            } catch (Throwable var29) {
                var4.field2288[var5] = -5;
            }
        }
        class123.field2095.method2029((byte) -34, var4);
    }
}
