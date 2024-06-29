import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oha")
public class class775 {

    @OriginalMember(owner = "client!oha", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field11328 = method5581(method5580("pUY\u0019y7"));

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "I")
    public static int field11326;

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "I")
    public static int field11327;

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(B)V", line = 6)
    public static final void method5579(byte arg0) {
        try {
            if (!class16.field177) {
                class595.field8598 = class719.field10523 != -1 && class719.field10523 <= class320.field5213 || (class793.field11597 ? 26 : 22) + class320.field5213 * 16 > class333.field5444;
            }
            field11326++;
            class69.field979.method3224(false);
            class536.field7858.method3224(false);
            if (arg0 == -58) {
                for (class59 var1 = (class59) class439.field6858.method3228(11); var1 != null; var1 = (class59) class439.field6858.method3216(true)) {
                    int var2 = var1.field773;
                    if (var2 < 1000) {
                        var1.method4173(-1);
                        if (var2 == 15 || var2 == 45 || var2 == 59 || var2 == 52 || var2 == 13 || var2 == 5 || var2 == 9) {
                            class536.field7858.method3220(var1, arg0 ^ 0xFFFFFFC6);
                        } else {
                            class69.field979.method3220(var1, 0);
                        }
                    }
                }
                class69.field979.method3218(class439.field6858, -101);
                class536.field7858.method3218(class439.field6858, -114);
                if (class320.field5213 > 1) {
                    if (class558.field8130 && class196.field3117.method1189(81, 15708) && class320.field5213 > 2) {
                        class750.field11049 = (class59) class439.field6858.field6307.field8246.field8246;
                    } else {
                        class750.field11049 = (class59) class439.field6858.field6307.field8246;
                    }
                    class536.field7876 = (class59) class439.field6858.field6307.field8246;
                } else {
                    class536.field7876 = null;
                    class750.field11049 = null;
                }
                int var3 = -1;
                class524 var4 = (class524) class199.field3151.method3228(11);
                if (var4 != null) {
                    var3 = var4.method1933(-30035);
                }
                if (class16.field177) {
                    if (var3 == -1) {
                        int var5 = class15.field174.method5051(0);
                        int var6 = class15.field174.method5048(true);
                        boolean var7 = false;
                        if (class116.field1694 != null) {
                            if (var5 >= class452.field6990 - 10 && var5 <= (class630.field9060 + class452.field6990 + 10) && var6 >= class270.field4346 - 10 && var6 <= (class541.field7977 + class270.field4346 + 10)) {
                                var7 = true;
                            } else {
                                class358.method2969((byte) 104);
                            }
                        }
                        if (!var7) {
                            if (class65.field897 - 10 > var5 || var5 > class65.field897 + class489.field7379 + 10 || (class606.field8725 - 10) > var6 || var6 > (class606.field8725 + class209.field3290 + 10)) {
                                class632.method4589(-19298);
                            } else if (class595.field8598) {
                                int var8 = -1;
                                int var9 = -1;
                                for (int var10 = 0; var10 < class681.field9707; var10++) {
                                    if (class793.field11597) {
                                        int var11 = var10 * 16 + (class606.field8725 + 33);
                                        if ((var11 - 13) < var6 && var6 < (var11 + 4)) {
                                            var9 = var11 - 13;
                                            var8 = var10;
                                            break;
                                        }
                                    } else {
                                        int var12 = var10 * 16 + class606.field8725 + 31;
                                        if (var6 > (var12 - 13) && (var12 + 3) > var6) {
                                            var9 = var12 - 13;
                                            var8 = var10;
                                            break;
                                        }
                                    }
                                }
                                if (var8 != -1) {
                                    int var13 = 0;
                                    class137 var14 = new class137(class580.field8365);
                                    for (class603 var15 = (class603) var14.method1275((byte) 76); var15 != null; var15 = (class603) var14.method1277(57)) {
                                        if (var8 == var13) {
                                            if (var15.field8711 > 1) {
                                                class607.method4435(var9, var6, arg0 + 7187, var15);
                                            }
                                            break;
                                        }
                                        var13++;
                                    }
                                }
                            }
                        }
                    }
                    if (var3 == 0) {
                        int var16 = var4.method1936(11481);
                        int var17 = var4.method1935(-119);
                        if (class116.field1694 != null && class452.field6990 <= var16 && var16 <= class630.field9060 + class452.field6990 && class270.field4346 <= var17 && var17 <= class541.field7977 + class270.field4346) {
                            int var18 = -1;
                            for (int var19 = 0; var19 < class116.field1694.field8711; var19++) {
                                if (class793.field11597) {
                                    int var20 = var19 * 16 + class270.field4346 + 33;
                                    if (var17 > (var20 - 13) && var17 < (var20 + 4)) {
                                        var18 = var19;
                                    }
                                } else {
                                    int var21 = var19 * 16 + class270.field4346 + 31;
                                    if ((var21 - 13) < var17 && var17 < var21 + 3) {
                                        var18 = var19;
                                    }
                                }
                            }
                            if (var18 != -1) {
                                int var22 = 0;
                                class137 var23 = new class137(class116.field1694.field8713);
                                for (class59 var24 = (class59) var23.method1275((byte) 76); var24 != null; var24 = (class59) var23.method1277(57)) {
                                    if (var18 == var22) {
                                        class471.method3620(var16, var17, var24, 0);
                                        break;
                                    }
                                    var22++;
                                }
                            }
                            class632.method4589(-19298);
                            return;
                        }
                        if (var16 >= class65.field897 && class65.field897 + class489.field7379 >= var16 && var17 >= class606.field8725 && class606.field8725 + class209.field3290 >= var17) {
                            if (!class595.field8598) {
                                int var25 = -1;
                                for (int var26 = 0; var26 < class320.field5213; var26++) {
                                    if (class793.field11597) {
                                        int var28 = (class606.field8725 + ((class320.field5213 - var26 - 1) * 16)) + 33;
                                        if (var28 - 13 < var17 && var17 < var28 + 4) {
                                            var25 = var26;
                                        }
                                    } else {
                                        int var27 = (class320.field5213 - var26 - 1) * 16 + class606.field8725 + 31;
                                        if (var17 > (var27 - 13) && var27 + 3 > var17) {
                                            var25 = var26;
                                        }
                                    }
                                }
                                if (var25 != -1) {
                                    int var29 = 0;
                                    class570 var30 = new class570(class439.field6858);
                                    for (class59 var31 = (class59) var30.method4203((byte) 114); var31 != null; var31 = (class59) var30.method4201((byte) 112)) {
                                        if (var25 == var29) {
                                            class471.method3620(var16, var17, var31, arg0 + 58);
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                class632.method4589(-19298);
                                return;
                            }
                            int var32 = -1;
                            for (int var33 = 0; var33 < class681.field9707; var33++) {
                                if (class793.field11597) {
                                    int var35 = var33 * 16 + class606.field8725 + 33;
                                    if (var17 > (var35 - 13) && var17 < (var35 + 4)) {
                                        var32 = var33;
                                        break;
                                    }
                                } else {
                                    int var34 = class606.field8725 - (-var33 * 16 - 31);
                                    if (var17 > var34 - 13 && var17 < (var34 + 3)) {
                                        var32 = var33;
                                        break;
                                    }
                                }
                            }
                            if (var32 != -1) {
                                int var36 = 0;
                                class137 var37 = new class137(class580.field8365);
                                for (class603 var38 = (class603) var37.method1275((byte) 76); var38 != null; var38 = (class603) var37.method1277(57)) {
                                    if (var32 == var36) {
                                        class471.method3620(var16, var17, (class59) var38.field8713.field10193.field7074, arg0 ^ 0xFFFFFFC6);
                                        class632.method4589(-19298);
                                        return;
                                    }
                                    var36++;
                                }
                                return;
                            }
                        }
                    }
                } else {
                    if (var3 == 0 && (class748.field11033 == 1 && class320.field5213 > 2 || class774.method5575((byte) -118))) {
                        var3 = 2;
                    }
                    if (var3 == 2 && class320.field5213 > 0 && var4 != null) {
                        if (class360.field5806 == null && class542.field7985 == 0) {
                            class178.method1697(var4.method1935(-120), arg0 ^ 0xFFFF8DEF, var4.method1936(11481));
                        } else {
                            class522.field7706 = 2;
                        }
                    }
                    if (var3 == 0) {
                        if (class750.field11049 != null) {
                            class370.method3042(-127);
                        } else if (class501.field7499) {
                            class318.method2729(22906);
                        }
                    }
                    if (class360.field5806 == null && class542.field7985 == 0) {
                        class522.field7706 = 0;
                        class430.field6765 = null;
                    }
                }
            }
        } catch (RuntimeException var40) {
            throw class590.method4333(var40, field11328 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5580(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5581(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 31;
                    break;
                case 1:
                    var10005 = 61;
                    break;
                case 2:
                    var10005 = 56;
                    break;
                case 3:
                    var10005 = 55;
                    break;
                default:
                    var10005 = 61;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
