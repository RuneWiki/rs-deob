import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class126 {

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "Luh;")
    public static class152 field1672 = new class152();

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field1675 = 0;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field1679 = 0;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1682 = "Checking for updates - ";

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1685 = "Close";

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "Ljava/awt/Image;")
    public static Image field1684;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZI)V")
    public static final void method860(boolean arg0, int arg1) {
        field1677++;
        if (arg0) {
            field1682 = null;
        }
        class256 var2 = class363.method2385(5, arg1, (byte) 1);
        var2.method1611(-128);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
    public static final void method861(int arg0) {
        class24.field417.method2063(((float) class357.field5234 * 0.1F + 0.7F) * class425.field6313);
        field1673++;
        if (arg0 != 32767) {
            field1675 = -99;
        }
        class24.field417.method2139(class297.field4273, class203.field2939, class381.field5713, (float) class425.field6327, (float) class197.field2813, (float) class384.field5752);
        class24.field417.method2047(class273.field4010);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lnr;ILkb;Llo;)V")
    public static final void method862(class437 arg0, int arg1, class80 arg2, class419 arg3) {
        field1678++;
        class243 var4 = arg2.method509(arg0, -1);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method1095();
        if (var4.method1090() > var5) {
            var5 = var4.method1090();
        }
        byte var6 = 10;
        int var7 = arg3.field6232;
        int var8 = arg3.field6233;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg2.field1092 != null) {
            var9 = class70.field968.method1028((int[]) null, 108, arg2.field1092, class433.field6390, (class243[]) null);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class433.field6390[var12];
                if (var12 < var9 - 1) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class339.field4990.method2507(var13);
                if (var10 < var14) {
                    var10 = var14;
                }
            }
            var11 = class339.field4990.method2503() * var9 + (class339.field4990.method2508() / 2);
        }
        int var15 = var5 / 2 + arg3.field6232;
        int var16 = arg3.field6233;
        if (var7 < class76.field1053 + var5) {
            var7 = class76.field1053;
            var15 = var10 / 2 + var5 / 2 + class76.field1053 + var6 + 5;
        } else if (var7 > class76.field1034 - var5) {
            var7 = class76.field1034 - var5;
            var15 = class76.field1034 - (var10 / 2) - (var5 / 2) - var6 - 5;
        }
        if ((class76.field1038 + var5) > var8) {
            var16 = var5 / 2 + class76.field1038 + var6;
            var8 = class76.field1038;
        } else if (var8 > class76.field1035 - var5) {
            var8 = class76.field1035 - var5;
            var16 = class76.field1035 - (var5 / 2) - var6 - var11;
        }
        int var17 = (int) ((Math.atan2((double) (var7 - arg3.field6232), (double) (var8 - arg3.field6233)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var4.method1497((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg2.field1092 != null) {
            var18 = var15 - (var10 / 2) - 5;
            var19 = var16;
            var20 = var10 + var18 + 10;
            var21 = class339.field4990.method2503() * var9 + var16 + 3;
            if (arg2.field1111 != 0) {
                arg0.method2766(var20 - var18, -var16 + var21, var18, var16, arg2.field1111, -92);
            }
            if (arg2.field1114 != 0) {
                arg0.method2774(var21 - var16, var18, var20 - var18, false, var16, arg2.field1114);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class433.field6390[var22];
                if ((var9 - 1) > var22) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class339.field4990.method2509(arg0, var23, var15, var16, arg2.field1089, true);
                var16 += class339.field4990.method2503();
            }
        }
        if (arg2.field1123 == arg1 && arg2.field1092 == null) {
            return;
        }
        int var24 = var5 >> 1;
        class368 var25 = new class368(arg3);
        var25.field5465 = var8 - var24;
        var25.field5468 = var7 - var24;
        var25.field5471 = var7 + var24;
        var25.field5466 = var20;
        var25.field5464 = var21;
        var25.field5463 = var19;
        var25.field5462 = var18;
        var25.field5474 = var8 + var24;
        class106.field1425.method2660((byte) -128, var25);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lil;Lud;IB)V")
    public static final void method863(class265 arg0, class2 arg1, int arg2, byte arg3) {
        field1683++;
        class292 var4 = new class292();
        var4.field4231 = arg0.method1697(114);
        var4.field4229 = arg0.method1666(-2);
        var4.field4227 = new int[var4.field4231];
        if (arg3 < 58) {
            field1682 = null;
        }
        var4.field4236 = new class296[var4.field4231];
        var4.field4238 = new int[var4.field4231];
        var4.field4224 = new int[var4.field4231];
        var4.field4234 = new class296[var4.field4231];
        var4.field4223 = new byte[var4.field4231][][];
        for (int var5 = 0; var5 < var4.field4231; var5++) {
            try {
                int var6 = arg0.method1697(-107);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg0.method1712(false);
                    String var8 = arg0.method1712(false);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg0.method1666(-2);
                    }
                    var4.field4224[var5] = var6;
                    var4.field4238[var5] = var9;
                    var4.field4236[var5] = arg1.method6((byte) 81, var8, class191.method1190(false, var7));
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg0.method1712(false);
                    String var11 = arg0.method1712(false);
                    int var12 = arg0.method1697(-82);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg0.method1712(false);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg0.method1666(-2);
                            var15[var16] = new byte[var17];
                            arg0.method1710(0, var17, (byte) -39, var15[var16]);
                        }
                    }
                    var4.field4224[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class191.method1190(false, var13[var19]);
                    }
                    var4.field4234[var5] = arg1.method13(var11, var18, -82, class191.method1190(false, var10));
                    var4.field4223[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field4227[var5] = -1;
            } catch (SecurityException var21) {
                var4.field4227[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field4227[var5] = -3;
            } catch (Exception var23) {
                var4.field4227[var5] = -4;
            } catch (Throwable var24) {
                var4.field4227[var5] = -5;
            }
        }
        class278.field4076.method2660((byte) -126, var4);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)Z")
    public static final boolean method864(byte arg0, int arg1) {
        field1680++;
        if (class339.field4991[arg1]) {
            return true;
        } else if (class262.field3811.method1475(arg1, (byte) 42)) {
            int var2 = class262.field3811.method1476(arg1, (byte) -72);
            if (var2 == 0) {
                class339.field4991[arg1] = true;
                return true;
            }
            if (class119.field1607[arg1] == null) {
                class119.field1607[arg1] = new class249[var2];
            }
            if (arg0 != -92) {
                field1685 = null;
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class119.field1607[arg1][var3] == null) {
                    byte[] var4 = class262.field3811.method1472(var3, arg1, 0);
                    if (var4 != null) {
                        class249 var5 = class119.field1607[arg1][var3] = new class249();
                        var5.field3622 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method1540(new class265(var4), 65535);
                        } else {
                            var5.method1534(new class265(var4), arg0 - 9688);
                        }
                    }
                }
            }
            class339.field4991[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    public static void method865(byte arg0) {
        field1672 = null;
        field1682 = null;
        field1685 = null;
        field1684 = null;
        if (arg0 != -65) {
            field1682 = null;
        }
    }
}
