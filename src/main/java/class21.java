import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class21 {

    @OriginalMember(owner = "client!o", name = "f", descriptor = "S")
    public static short field279 = 256;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "Z")
    public static boolean field280 = true;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIBII)V")
    public static final void method139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        field282++;
        if (arg7 < 128 || arg8 < 128 || (class432.field6220 - 2) * 128 < arg7 || arg8 > class267.field3646 * 128 - 256) {
            class401.field5848[0] = class401.field5848[1] = -1;
            return;
        }
        int var9 = class279.method1698(arg7, arg8, class265.field3617, (byte) 3) - arg3;
        class220.field2893.method888(arg5, 0, 0);
        if (arg6 != -69) {
            method142(-116, -5);
        }
        class408.field5920.method1724(class220.field2893);
        class408.field5920.method1742(arg7, var9, arg8, class401.field5848);
        class220.field2893.method888(-arg5, 0, 0);
        class408.field5920.method1724(class220.field2893);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IZLrg;)V")
    public static final void method140(int arg0, boolean arg1, class383 arg2) {
        field277++;
        int var3 = arg2.field5433 == 0 ? arg2.field5431 : arg2.field5433;
        if (arg0 != -4492) {
            return;
        }
        int var4 = arg2.field5590 == 0 ? arg2.field5491 : arg2.field5590;
        class323.method2041(var4, class333.field4511[arg2.field5507 >> 16], arg2.field5507, var3, arg1, 20069);
        if (arg2.field5465 != null) {
            class323.method2041(var4, arg2.field5465, arg2.field5507, var3, arg1, 20069);
        }
        class432 var5 = (class432) class271.field3700.method1412((byte) -54, (long) arg2.field5507);
        if (var5 != null) {
            class189.method1238((byte) -36, var5.field6217, var4, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
    public static final void method141(byte arg0) {
        field276++;
        if (arg0 != 20) {
            method144(-106, (byte) 46);
        }
        class225.field3024.method199((byte) 117);
        class399.field5832 = 1;
        class202.field2761 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)Z")
    public static final boolean method142(int arg0, int arg1) {
        field274++;
        if (arg0 == 26 || arg0 == 37 || arg0 == 41 || arg0 == 45 || arg0 == 9 || arg0 == 43 || arg0 == 46 || arg0 == 15) {
            return true;
        } else if (arg0 == 19 || arg0 == 5 || arg0 == 1004 || arg0 == 1001) {
            return true;
        } else if (arg0 == 20 || arg0 == 7 || arg0 == 2 || arg0 == 17 || arg0 == 30) {
            return true;
        } else if (arg0 == 21 || arg0 == 13 || arg0 == 39 || arg0 == 40 || arg0 == 36 || arg0 == 58) {
            return true;
        } else if (arg1 == 0) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method143(byte arg0, String arg1) {
        field281++;
        if (arg0 > -30) {
            method139(-49, 84, 72, -40, 12, 113, (byte) -110, 14, 69);
        }
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)V")
    public static final void method144(int arg0, byte arg1) {
        if (arg1 != 122) {
            field280 = false;
        }
        field275++;
        if (class77.method545(true, arg0)) {
            class451.method2818(class333.field4511[arg0], -1, -22722);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([IZLke;[I[I)V")
    public static final void method145(int[] arg0, boolean arg1, class354 arg2, int[] arg3, int[] arg4) {
        field278++;
        for (int var5 = 0; var5 < arg0.length; var5++) {
            int var6 = arg0[var5];
            int var7 = arg3[var5];
            int var8 = arg4[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg2.field887.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg2.field887[var9] = null;
                    } else {
                        class449 var10 = class86.method599(arg1, var6);
                        int var11 = var10.field6516;
                        class7 var12 = arg2.field887[var9];
                        if (var12 != null) {
                            if (var12.field116 == var6) {
                                if (var11 == 0) {
                                    var12 = arg2.field887[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field112 = 0;
                                    var12.field113 = 0;
                                    var12.field108 = 1;
                                    var12.field109 = var8;
                                    var12.field114 = 0;
                                    class27.method218(class307.field4211 == arg2, (byte) -94, var10, 0, arg2.field6192, arg2.field6197);
                                } else if (var11 == 2) {
                                    var12.field112 = 0;
                                }
                            } else if (var10.field6504 >= class86.method599(false, var12.field116).field6504) {
                                var12 = arg2.field887[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class7 var13 = arg2.field887[var9] = new class7();
                            var13.field108 = 1;
                            var13.field114 = 0;
                            var13.field112 = 0;
                            var13.field113 = 0;
                            var13.field109 = var8;
                            var13.field116 = var6;
                            class27.method218(class307.field4211 == arg2, (byte) -94, var10, 0, arg2.field6192, arg2.field6197);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        if (arg1) {
            method143((byte) 68, (String) null);
        }
    }
}
