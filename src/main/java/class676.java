import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class676 {

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    private int field9395;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    private int field9397;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    private int field9401;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    private int field9410;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    private int field9405;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
    private int field9408;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
    private int field9412;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
    private int field9406;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    private int field9403;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    private int field9400;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field9399 = 328;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    public static int field9407 = -1;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field9396;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field9398;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field9402;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    public static int field9409;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    public static int field9411;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "[I")
    public static int[] field9404;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V", line = 5)
    public static void method3729(boolean arg0) {
        if (!arg0) {
            field9404 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V", line = 28)
    public static final void method3730(int arg0) {
        field9398++;
        if (class579.field8191 == 0 || class579.field8191 == 6) {
            return;
        }
        try {
            if ((++class147.field1625) > 2000) {
                if (class99.field1061 != null) {
                    class99.field1061.method1509(0);
                    class99.field1061 = null;
                }
                if (class442.field6242 >= 2) {
                    class579.field8191 = 0;
                    class123.method707(-5, -4);
                    return;
                }
                if (class533.field7494 == 2 || class533.field7494 == 3) {
                    class117.field1294.method1087(0);
                } else {
                    class527.field7428.method1087(0);
                }
                class442.field6242++;
                class147.field1625 = 0;
                class579.field8191 = 1;
            }
            if (class579.field8191 == 1) {
                if (class533.field7494 == 2 || class533.field7494 == 3) {
                    class533.field7493 = class117.field1294.method1089(class353.field4757, 59);
                } else {
                    class533.field7493 = class527.field7428.method1089(class353.field4757, 28);
                }
                class579.field8191 = 2;
            }
            if (~class579.field8191 == arg0) {
                if (class533.field7493.field884 == 2) {
                    throw new IOException();
                }
                if (class533.field7493.field884 != 1) {
                    return;
                }
                class99.field1061 = class203.method1213(7500, 0, (Socket) class533.field7493.field886);
                class533.field7493 = null;
                long var1 = class94.field962 = class266.method1569(class465.field6648, (byte) -97);
                class246.method1448(4883);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class653 var4 = class496.method2869(-109);
                var4.field9158.method658(class249.field3096.field1673, (byte) 68);
                var4.field9158.method658(var3, (byte) 60);
                class568.method3220(var4, (byte) 19);
                class160.method869((byte) -116);
                class579.field8191 = 3;
            }
            if (class579.field8191 == 3) {
                if (!class99.field1061.method1514(arg0 - 28725, 1)) {
                    return;
                }
                class99.field1061.method1508(1, (byte) 82, class626.field8849.field1269, 0);
                int var5 = class626.field8849.field1269[0] & 0xFF;
                if (var5 != 0) {
                    class579.field8191 = 0;
                    class123.method707(var5, -4);
                    class99.field1061.method1509(0);
                    class99.field1061 = null;
                    class157.method848((byte) 70);
                    return;
                }
                class579.field8191 = 4;
            }
            if (class579.field8191 == 4) {
                if (!class99.field1061.method1514(-28728, 8)) {
                    return;
                }
                class99.field1061.method1508(8, (byte) -96, class626.field8849.field1269, 0);
                class626.field8849.field1218 = 0;
                class596.field8394 = class626.field8849.method671(0);
                class115 var6 = new class115(518);
                int[] var7 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class596.field8394 >> 32), (int) class596.field8394 };
                var6.method658(10, (byte) 79);
                var6.method660((byte) 81, var7[0]);
                var6.method660((byte) 84, var7[1]);
                var6.method660((byte) 44, var7[2]);
                var6.method660((byte) 117, var7[3]);
                var6.method670((byte) 111, class266.method1569(class465.field6648, (byte) -97));
                var6.method672((byte) -113, class79.field803);
                var6.method670((byte) -42, class357.field4791);
                var6.method670((byte) -116, class65.field663);
                var6.method634(class595.field8389, arg0 ^ 0xFFFFFFFD, class101.field1084);
                class246.method1448(4883);
                class653 var8 = class496.method2869(arg0 - 96);
                class445 var9 = var8.field9158;
                if (class533.field7494 == 2 || class533.field7494 == 3) {
                    if (class421.field5601 == 13) {
                        var9.method658(class249.field3117.field1673, (byte) 59);
                    } else {
                        var9.method658(class249.field3112.field1673, (byte) 115);
                    }
                    var9.method645(-672168216, 0);
                    int var11 = var9.field1218;
                    var9.method660((byte) 82, 622);
                    var9.method658(class445.field6273, (byte) 54);
                    var9.method658(class201.method1206(82), (byte) 95);
                    var9.method645(-672168216, class146.field1618);
                    var9.method645(-672168216, class338.field4244);
                    var9.method658(class639.field9075.field6769, (byte) 127);
                    class189.method1148((byte) 60, var9);
                    var9.method672((byte) 108, class208.field2464);
                    var9.method660((byte) 68, class112.field1186);
                    class115 var12 = new class115(class595.method3344((byte) 82));
                    class639.field9075.method2723(0, var12);
                    var9.method658(var12.field1218, (byte) 111);
                    var9.method629(arg0 ^ 0xFFFFFF9F, var12.field1269, var12.field1218, 0);
                    class389.field5269 = true;
                    class115 var13 = new class115(class238.method1423((byte) 126));
                    (new class687(true, class353.field4757)).method3800(var13, (byte) 78);
                    var9.method629(arg0 ^ 0xFFFFFFB9, var13.field1269, var13.field1269.length, 0);
                    var9.method645(arg0 ^ 0x28107915, class664.field9290);
                    var9.method670((byte) -6, class658.field9243);
                    var9.method658(class359.field4829 == null ? 0 : 1, (byte) 104);
                    if (class359.field4829 != null) {
                        var9.method672((byte) -121, class359.field4829);
                    }
                    class262.method1542(var9, 0);
                    var9.method629(arg0 ^ 0xFFFFFFD0, var6.field1269, var6.field1218, 0);
                    var9.method659((byte) -70, var9.field1218 - var11);
                } else {
                    var9.method658(class249.field3122.field1673, (byte) 86);
                    var9.method645(-672168216, 0);
                    int var10 = var9.field1218;
                    var9.method660((byte) 55, 622);
                    var9.method658(class246.field3031.field3943, (byte) 97);
                    var9.method658(class504.field7267, (byte) 73);
                    class189.method1148((byte) 60, var9);
                    var9.method672((byte) 92, class208.field2464);
                    var9.method660((byte) 111, class112.field1186);
                    class262.method1542(var9, 0);
                    var9.method629(78, var6.field1269, var6.field1218, 0);
                    var9.method659((byte) -60, var9.field1218 - var10);
                }
                class568.method3220(var8, (byte) 51);
                class160.method869((byte) -83);
                class39.field395 = new class674(var7);
                for (int var14 = 0; var14 < 4; var14++) {
                    var7[var14] += 50;
                }
                class626.field8849.method2576(var7, (byte) 103);
                class579.field8191 = 5;
            }
            if (class579.field8191 == 5) {
                if (!class99.field1061.method1514(arg0 ^ 0x7035, 1)) {
                    return;
                }
                class99.field1061.method1508(1, (byte) -76, class626.field8849.field1269, 0);
                int var15 = class626.field8849.field1269[0] & 0xFF;
                if (var15 == 21) {
                    class579.field8191 = 8;
                } else if (var15 == 29) {
                    class579.field8191 = 14;
                } else if (var15 == 1) {
                    class579.field8191 = 6;
                    class123.method707(var15, -4);
                    return;
                } else if (var15 == 2) {
                    class579.field8191 = 9;
                } else if (var15 == 15) {
                    class257.field3209 = -2;
                    class579.field8191 = 15;
                } else if (var15 == 23 && class442.field6242 < 2) {
                    class442.field6242++;
                    class147.field1625 = 0;
                    class579.field8191 = 1;
                    class99.field1061.method1509(0);
                    class99.field1061 = null;
                    return;
                } else {
                    class579.field8191 = 0;
                    class123.method707(var15, -4);
                    class99.field1061.method1509(0);
                    class99.field1061 = null;
                    class157.method848((byte) 91);
                    return;
                }
            }
            if (class579.field8191 == 7) {
                class246.method1448(4883);
                class653 var16 = class496.method2869(arg0 - 103);
                class445 var17 = var16.field9158;
                var17.method2578(class39.field395, -1431312856);
                var17.method2579(-23012, class249.field3129.field1673);
                class568.method3220(var16, (byte) 31);
                class160.method869((byte) -89);
                class579.field8191 = 5;
            } else if (class579.field8191 == 8) {
                if (class99.field1061.method1514(-28728, 1)) {
                    class99.field1061.method1508(1, (byte) -117, class626.field8849.field1269, 0);
                    int var18 = class626.field8849.field1269[0] & 0xFF;
                    class365.field4908 = (var18 + 3) * 60;
                    class579.field8191 = 0;
                    class123.method707(21, arg0 ^ 0x1);
                    class99.field1061.method1509(0);
                    class99.field1061 = null;
                    class157.method848((byte) 114);
                }
            } else if (class579.field8191 == 14) {
                if (class99.field1061.method1514(-28728, 1)) {
                    class99.field1061.method1508(1, (byte) 76, class626.field8849.field1269, 0);
                    class579.field8191 = 0;
                    class48.field503 = class626.field8849.field1269[0] & 0xFF;
                    class123.method707(29, -4);
                    class99.field1061.method1509(0);
                    class99.field1061 = null;
                    class157.method848((byte) 100);
                }
            } else if (class579.field8191 != 9) {
                if (class579.field8191 == 10) {
                    if (class533.field7494 == 3) {
                        class213.field2600 = true;
                    } else {
                        class213.field2600 = false;
                    }
                    class445 var19 = class626.field8849;
                    if (class533.field7494 == 2 || class533.field7494 == 3) {
                        if (!class99.field1061.method1514(arg0 ^ 0x7035, class221.field2706)) {
                            return;
                        }
                        class99.field1061.method1508(class221.field2706, (byte) 95, var19.field1269, 0);
                        var19.field1218 = 0;
                        class296.field3704 = var19.method620((byte) 32);
                        class142.field1575 = var19.method620((byte) -127);
                        class443.field6260 = var19.method620((byte) -128) == 1;
                        class329.field4036 = var19.method620((byte) -126) == 1;
                        class672.field9359 = var19.method620((byte) -128) == 1;
                        class383.field5175 = var19.method620((byte) 9) == 1;
                        class392.field5314 = var19.method643((byte) -77);
                        class599.field8435 = var19.method620((byte) -127) == 1;
                        class136.field1496 = var19.method637(255);
                        class190.field2181 = var19.method620((byte) -126) == 1;
                        if (class533.field7494 == 3) {
                            boolean var20 = var19.method620((byte) 74) == 1;
                            if (var20) {
                                long var21 = var19.method671(0);
                                String var23 = class645.method3614(12, var21);
                                int var24 = var19.method620((byte) 51);
                                byte[] var25 = new byte[var24];
                                var19.method2577(var25, 0, 0, var24);
                                String var26 = class22.method102(var25, false);
                                class5 var27 = null;
                                try {
                                    class88 var28 = class353.field4757.method2682("3", false, (byte) -16);
                                    while (var28.field884 == 0) {
                                        class452.method2602(1L, (byte) -97);
                                    }
                                    if (var28.field884 == 1) {
                                        var27 = (class5) var28.field886;
                                        int var29 = (var23.length() + 3 + var26.length() - -4) + 11 + 2;
                                        if (class359.field4829 != null) {
                                            var29 += class359.field4829.length() + 2;
                                        }
                                        if (var29 > 120) {
                                            throw new RuntimeException(">120");
                                        }
                                        class115 var30 = new class115(var29 + 1);
                                        var30.method658(var29, (byte) 110);
                                        var30.method658(3, (byte) 72);
                                        var30.method653((byte) -113, var23);
                                        var30.method653((byte) -113, var26);
                                        var30.method645(arg0 ^ 0x28107915, class112.field1186);
                                        var30.method670((byte) 111, class658.field9243);
                                        var30.method658(class359.field4829 == null ? 0 : 1, (byte) 65);
                                        if (class359.field4829 != null) {
                                            var30.method653((byte) -113, class359.field4829);
                                        }
                                        var30.method654(-102);
                                        var27.method38(101, var30.field1218, 0, var30.field1269);
                                    }
                                } catch (Exception var40) {
                                }
                                try {
                                    if (var27 != null) {
                                        var27.method37(-1);
                                    }
                                } catch (Exception var38) {
                                }
                                try {
                                    class627.method3524("demoaccountcreated", class591.field8347, 23421);
                                } catch (Throwable var37) {
                                }
                            }
                        }
                        class364.field4891.method2132(class190.field2181, 0);
                        class19.field153.method274(class190.field2181, -1);
                        class369.field5055.method335(9276, class190.field2181);
                    } else if (class99.field1061.method1514(-28728, class221.field2706)) {
                        class99.field1061.method1508(class221.field2706, (byte) 67, var19.field1269, 0);
                        var19.field1218 = 0;
                        class296.field3704 = var19.method620((byte) -24);
                        class142.field1575 = var19.method620((byte) 104);
                        class443.field6260 = var19.method620((byte) -126) == 1;
                        class329.field4036 = var19.method620((byte) 80) == 1;
                        class672.field9359 = var19.method620((byte) -128) == 1;
                        class340.field4299 = var19.method676(arg0 ^ 0x6);
                        class599.field8435 = class340.field4299 > 0;
                        class441.field6217 = var19.method643((byte) -77);
                        class646.field9123 = var19.method643((byte) -77);
                        class300.field3734 = var19.method643((byte) -77);
                        class46.field483 = var19.method631(false);
                        class100.field1077 = class353.field4757.method2680(3, class46.field483);
                        class575.field8164 = var19.method620((byte) 20);
                        class599.field8436 = var19.method643((byte) -77);
                        class699.field9805 = var19.method643((byte) -77);
                        class148.field1632 = var19.method620((byte) -126) == 1;
                        class362.field4859.field2893 = class362.field4859.field2927 = var19.method655(552922456);
                        class575.field8161 = var19.method620((byte) -2);
                        class499.field7227 = var19.method631(false);
                        class386.field5201 = new class178();
                        class386.field5201.field2001 = var19.method643((byte) -77);
                        if (class386.field5201.field2001 == 65535) {
                            class386.field5201.field2001 = -1;
                        }
                        class386.field5201.field1987 = var19.method655(arg0 + 552922459);
                        if (class364.field4875 != class337.field4237) {
                            class386.field5201.field1996 = class386.field5201.field2001 + 50000;
                            class386.field5201.field1999 = class386.field5201.field2001 + 40000;
                        }
                        if (class337.field4237 != class325.field4005 && (class117.field1294.method1090(-1, class42.field414) || class117.field1294.method1090(-1, class152.field1682))) {
                            class669.method3701(-127);
                        }
                    } else {
                        return;
                    }
                    if ((!class443.field6260 || class672.field9359) && !class599.field8435) {
                        try {
                            class627.method3524("unzap", class591.field8347, 23421);
                        } catch (Throwable var35) {
                        }
                    } else {
                        try {
                            class627.method3524("zap", class591.field8347, 23421);
                        } catch (Throwable var39) {
                            if (class580.field8207) {
                                try {
                                    class591.field8347.getAppletContext().showDocument(new URL(class591.field8347.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var36) {
                                }
                            }
                        }
                    }
                    if (class364.field4875 == class337.field4237) {
                        try {
                            class627.method3524("loggedin", class591.field8347, arg0 ^ 0xFFFFA480);
                        } catch (Throwable var34) {
                        }
                    }
                    if (class533.field7494 != 2 && class533.field7494 != 3) {
                        class579.field8191 = 0;
                        class123.method707(2, -4);
                        class572.method3232(false);
                        class585.method3308(7, 22731);
                        class223.field2773 = null;
                        return;
                    }
                    class579.field8191 = 12;
                }
                if (class579.field8191 == 12) {
                    if (!class99.field1061.method1514(-28728, 3)) {
                        return;
                    }
                    class99.field1061.method1508(3, (byte) -106, class626.field8849.field1269, 0);
                    class579.field8191 = 13;
                }
                if (class579.field8191 == 13) {
                    class445 var31 = class626.field8849;
                    var31.field1218 = 0;
                    if (var31.method2582(108)) {
                        if (!class99.field1061.method1514(-28728, 1)) {
                            return;
                        }
                        class99.field1061.method1508(1, (byte) 80, var31.field1269, 3);
                    }
                    class223.field2773 = class236.method1407(arg0 ^ 0x2)[var31.method2580((byte) -56)];
                    class257.field3209 = var31.method643((byte) -77);
                    class579.field8191 = 11;
                }
                if (class579.field8191 == 11) {
                    if (class99.field1061.method1514(-28728, class257.field3209)) {
                        class99.field1061.method1508(class257.field3209, (byte) 88, class626.field8849.field1269, 0);
                        class626.field8849.field1218 = 0;
                        class579.field8191 = 0;
                        int var32 = class257.field3209;
                        class123.method707(2, -4);
                        class254.method1504((byte) 18);
                        class257.method1518(-95, class626.field8849);
                        class43.field418 = -1;
                        if (class670.field9342 == class223.field2773) {
                            class409.method2291(82);
                        } else {
                            class180.method1095((byte) -117);
                        }
                        if (class626.field8849.field1218 != var32) {
                            throw new RuntimeException("lswp pos:" + class626.field8849.field1218 + " psize:" + var32);
                        }
                        class223.field2773 = null;
                    }
                } else if (class579.field8191 == 15) {
                    if (class257.field3209 == -2) {
                        if (!class99.field1061.method1514(-28728, 2)) {
                            return;
                        }
                        class99.field1061.method1508(2, (byte) 96, class626.field8849.field1269, 0);
                        class626.field8849.field1218 = 0;
                        class257.field3209 = class626.field8849.method643((byte) -77);
                    }
                    if (class99.field1061.method1514(arg0 ^ 0x7035, class257.field3209)) {
                        class99.field1061.method1508(class257.field3209, (byte) 110, class626.field8849.field1269, 0);
                        class626.field8849.field1218 = 0;
                        int var33 = class257.field3209;
                        class579.field8191 = 0;
                        class123.method707(15, -4);
                        class120.method697(-101);
                        class257.method1518(-113, class626.field8849);
                        if (class626.field8849.field1218 != var33) {
                            throw new RuntimeException("lswpr pos:" + class626.field8849.field1218 + " psize:" + var33);
                        }
                        class223.field2773 = null;
                    }
                }
            } else if (class99.field1061.method1514(-28728, 1)) {
                class99.field1061.method1508(1, (byte) 105, class626.field8849.field1269, 0);
                class221.field2706 = class626.field8849.field1269[0] & 0xFF;
                class579.field8191 = 10;
            }
        } catch (IOException var41) {
            if (class99.field1061 != null) {
                class99.field1061.method1509(arg0 + 3);
                class99.field1061 = null;
            }
            if (class442.field6242 >= 2) {
                class579.field8191 = 0;
                class123.method707(-4, arg0 - 1);
                class157.method848((byte) 59);
            } else {
                if (class533.field7494 == 2 || class533.field7494 == 3) {
                    class117.field1294.method1087(0);
                } else {
                    class527.field7428.method1087(0);
                }
                class147.field1625 = 0;
                class442.field6242++;
                class579.field8191 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIIIZIII)V", line = 688)
    public final void method3731(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        field9411++;
        this.field9410 = arg8;
        this.field9397 = arg2 * arg2;
        this.field9401 = arg1;
        this.field9395 = arg9;
        if (arg7) {
            this.field9405 = 105;
        }
        this.field9400 = this.field9410 + arg10;
        this.field9406 = this.field9395 + arg6;
        this.field9408 = this.field9395 + arg4;
        this.field9412 = this.field9401 + arg5;
        this.field9405 = this.field9410 + arg0;
        this.field9403 = this.field9401 + arg3;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIII)Z", line = 708)
    public final boolean method3732(int arg0, int arg1, int arg2, int arg3) {
        field9409++;
        if (this.field9405 > arg1 || this.field9400 < arg1) {
            return false;
        } else if (this.field9406 <= arg3 && arg3 <= this.field9408) {
            if (arg2 != 16384) {
                this.field9412 = 78;
            }
            if (arg0 >= this.field9403 && arg0 <= this.field9412) {
                int var5 = arg1 - this.field9410;
                int var6 = arg0 - this.field9401;
                return var5 * var5 + var6 * var6 < this.field9397;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 743)
    public class676(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field9395 = arg1;
        this.field9397 = arg3 * arg3;
        this.field9401 = arg2;
        this.field9410 = arg0;
        this.field9405 = this.field9410 + arg4;
        this.field9408 = this.field9395 + arg7;
        this.field9412 = this.field9401 + arg9;
        this.field9406 = this.field9395 + arg6;
        this.field9403 = this.field9401 + arg8;
        this.field9400 = this.field9410 + arg5;
    }
}
