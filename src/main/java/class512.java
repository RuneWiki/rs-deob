import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class512 extends class4 {

    @OriginalMember(owner = "client!hq", name = "G", descriptor = "Lvt;")
    public static class344 field7130 = new class344("Loading HW3D - ", "Lade HW3D - ", "Chargement HW3D - ", "Carregando HW3D - ");

    @OriginalMember(owner = "client!hq", name = "J", descriptor = "I")
    public static int field7133;

    @OriginalMember(owner = "client!hq", name = "L", descriptor = "Lvt;")
    public static class344 field7135;

    @OriginalMember(owner = "client!hq", name = "E", descriptor = "I")
    public static int field7128;

    @OriginalMember(owner = "client!hq", name = "F", descriptor = "I")
    public static int field7129;

    @OriginalMember(owner = "client!hq", name = "H", descriptor = "I")
    public static int field7131;

    @OriginalMember(owner = "client!hq", name = "I", descriptor = "I")
    public static int field7132;

    @OriginalMember(owner = "client!hq", name = "K", descriptor = "I")
    public static int field7134;

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "(I)V")
    public static final void method2855(int arg0) {
        ++field7129;
        if (class294.field3824 != 0 && ~class294.field3824 != -7) {
            try {
                if (++class214.field2751 > 2000) {
                    if (class96.field1294 != null) {
                        class96.field1294.method3271((byte) 110);
                        class96.field1294 = null;
                    }
                    if (class606.field8716 >= 1) {
                        class294.field3824 = 0;
                        class372.method2272(-5, (byte) -104);
                        return;
                    }
                    ++class606.field8716;
                    if (class554.field7754 != 2 && class554.field7754 != 3) {
                        class15.field164.field3704 = !class15.field164.field3704;
                    } else {
                        class78.field1058.field3704 = !class78.field1058.field3704;
                    }
                    class214.field2751 = 0;
                    class294.field3824 = 1;
                }
                if (~class294.field3824 == -2) {
                    if (~class554.field7754 != -3 && ~class554.field7754 != -4) {
                        class2.field19 = class31.field488.method1734(class15.field164.field3700, class15.field164.method1763(16311), -31887);
                    } else {
                        class2.field19 = class31.field488.method1734(class78.field1058.field3700, class78.field1058.method1763(16311), -31887);
                    }
                    class294.field3824 = 2;
                }
                if (~class294.field3824 == -3) {
                    if (class2.field19.field6001 == 2) {
                        throw new IOException();
                    }
                    if (~class2.field19.field6001 != -2) {
                        return;
                    }
                    class96.field1294 = class223.method1424(13198, (Socket) class2.field19.field6000, 5000);
                    class2.field19 = null;
                    long var1 = class144.field1876 = class30.method181(107, class111.field1441);
                    int var3 = (int) (31L & var1 >> 16);
                    class272.field3457.field7707 = 0;
                    class272.field3457.method3060(class17.field184.field3141, -25098);
                    class272.field3457.method3060(var3, -25098);
                    class96.field1294.method3265(2, 0, (byte) 82, class272.field3457.field7693);
                    class294.field3824 = 3;
                }
                if (~class294.field3824 == -4) {
                    if (!class96.field1294.method3270(-89, 1)) {
                        return;
                    }
                    class96.field1294.method3267(-25750, 1, 0, class342.field4758.field7693);
                    int var4 = class342.field4758.field7693[0] & 255;
                    if (~var4 != -1) {
                        class294.field3824 = 0;
                        class372.method2272(var4, (byte) 105);
                        class96.field1294.method3271((byte) 110);
                        class96.field1294 = null;
                        class351.method2188((byte) 125);
                        return;
                    }
                    class294.field3824 = 4;
                }
                if (class294.field3824 == 4) {
                    if (!class96.field1294.method3270(-108, 8)) {
                        return;
                    }
                    class96.field1294.method3267(-25750, 8, 0, class342.field4758.field7693);
                    class342.field4758.field7707 = 0;
                    class349.field4803 = class342.field4758.method3072(-24373);
                    class551 var5 = new class551(518);
                    int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class349.field4803 >> 32), (int) class349.field4803 };
                    var5.method3060(10, -25098);
                    var5.method3071(-60, var6[0]);
                    var5.method3071(-62, var6[1]);
                    var5.method3071(-118, var6[2]);
                    var5.method3071(-128, var6[3]);
                    var5.method3049(false, class30.method181(-119, class111.field1441));
                    var5.method3040(false, class626.field9101);
                    var5.method3049(false, class551.field7716);
                    var5.method3049(false, class388.field5391);
                    var5.method3056(class1.field2, class388.field5389, (byte) 124);
                    class66 var7 = class272.field3457;
                    var7.field7707 = 0;
                    if (class554.field7754 != 2 && class554.field7754 != 3) {
                        var7.method3060(class17.field189.field3141, -25098);
                        var7.method3042(0, -79);
                        int var8 = var7.field7707;
                        var7.method3071(-72, 610);
                        var7.method3060(class26.field453.field7138, -25098);
                        var7.method3060(class245.field3103, -25098);
                        class377.method2302(16353, var7);
                        var7.method3040(false, class418.field5715);
                        var7.method3071(-57, class24.field428);
                        class642.method3706(122);
                        var7.method3063(var5.field7693, 957, 0, var5.field7707);
                        var7.method3065(-var8 + var7.field7707, 126);
                    } else {
                        if (~class630.field9188 == -13) {
                            var7.method3060(class17.field188.field3141, -25098);
                        } else {
                            var7.method3060(class17.field186.field3141, -25098);
                        }
                        var7.method3042(0, 112);
                        int var9 = var7.field7707;
                        var7.method3071(-49, 610);
                        var7.method3060(class419.field5730, -25098);
                        var7.method3060(class207.method1324((byte) 95), -25098);
                        var7.method3042(class502.field6955, -103);
                        var7.method3042(class604.field8711, -82);
                        var7.method3060(class501.field6954.field7858, -25098);
                        class377.method2302(16353, var7);
                        var7.method3040(false, class418.field5715);
                        var7.method3071(-85, class24.field428);
                        class551 var10 = new class551(class4.method10((byte) 65));
                        class501.field6954.method3157(50, var10);
                        var7.method3060(var10.field7707, -25098);
                        var7.method3063(var10.field7693, 957, 0, var10.field7707);
                        class372.field5181 = true;
                        class551 var11 = new class551(class341.method2142(6061));
                        (new class379(true, class31.field488)).method2310(-119, var11);
                        var7.method3063(var11.field7693, 957, 0, var11.field7693.length);
                        var7.method3042(class53.field706, -64);
                        class642.method3706(101);
                        var7.method3063(var5.field7693, 957, 0, var5.field7707);
                        var7.method3065(-var9 + var7.field7707, 90);
                    }
                    class96.field1294.method3265(var7.field7707, 0, (byte) 97, var7.field7693);
                    var7.method379(var6, (byte) 69);
                    for (int var12 = 0; ~var12 > -5; ++var12) {
                        var6[var12] += 50;
                    }
                    class342.field4758.method379(var6, (byte) 98);
                    class294.field3824 = 5;
                }
                if (arg0 < 100) {
                    field7130 = null;
                }
                if (class294.field3824 == 5) {
                    if (!class96.field1294.method3270(4, 1)) {
                        return;
                    }
                    class96.field1294.method3267(-25750, 1, 0, class342.field4758.field7693);
                    int var13 = class342.field4758.field7693[0] & 255;
                    if (var13 != 21) {
                        if (var13 == 29) {
                            class294.field3824 = 14;
                        } else {
                            if (~var13 == -2) {
                                class294.field3824 = 6;
                                class372.method2272(var13, (byte) 74);
                                return;
                            }
                            if (var13 == 2) {
                                class294.field3824 = 9;
                            } else {
                                if (var13 != 15) {
                                    if (~var13 == -24 && class606.field8716 < 1) {
                                        class294.field3824 = 1;
                                        ++class606.field8716;
                                        class214.field2751 = 0;
                                        class96.field1294.method3271((byte) 110);
                                        class96.field1294 = null;
                                        return;
                                    }
                                    class294.field3824 = 0;
                                    class372.method2272(var13, (byte) 29);
                                    class96.field1294.method3271((byte) 110);
                                    class96.field1294 = null;
                                    class351.method2188((byte) 125);
                                    return;
                                }
                                class294.field3824 = 15;
                                class262.field3333 = -2;
                            }
                        }
                    } else {
                        class294.field3824 = 8;
                    }
                }
                if (~class294.field3824 == -8) {
                    class272.field3457.field7707 = 0;
                    class272.field3457.method374(class17.field196.field3141, 6);
                    class96.field1294.method3265(class272.field3457.field7707, 0, (byte) 107, class272.field3457.field7693);
                    class294.field3824 = 5;
                } else if (~class294.field3824 == -9) {
                    if (class96.field1294.method3270(58, 1)) {
                        class96.field1294.method3267(-25750, 1, 0, class342.field4758.field7693);
                        int var14 = 255 & class342.field4758.field7693[0];
                        class294.field3824 = 0;
                        class224.field2862 = var14 * 60 + 180;
                        class372.method2272(21, (byte) 57);
                        class96.field1294.method3271((byte) 110);
                        class96.field1294 = null;
                        class351.method2188((byte) 114);
                    }
                } else if (class294.field3824 == 14) {
                    if (class96.field1294.method3270(82, 1)) {
                        class96.field1294.method3267(-25750, 1, 0, class342.field4758.field7693);
                        class286.field3724 = class342.field4758.field7693[0] & 255;
                        class294.field3824 = 0;
                        class372.method2272(29, (byte) -115);
                        class96.field1294.method3271((byte) 110);
                        class96.field1294 = null;
                        class351.method2188((byte) 125);
                    }
                } else if (class294.field3824 == 9) {
                    if (class96.field1294.method3270(63, 1)) {
                        class96.field1294.method3267(-25750, 1, 0, class342.field4758.field7693);
                        class294.field3824 = 10;
                        class551.field7705 = 255 & class342.field4758.field7693[0];
                    }
                } else {
                    if (class294.field3824 == 10) {
                        if (class554.field7754 != 3) {
                            class312.field3992 = false;
                        } else {
                            class312.field3992 = true;
                        }
                        class66 var15 = class342.field4758;
                        if (class554.field7754 != 2 && ~class554.field7754 != -4) {
                            if (!class96.field1294.method3270(80, class551.field7705)) {
                                return;
                            }
                            class96.field1294.method3267(-25750, class551.field7705, 0, var15.field7693);
                            var15.field7707 = 0;
                            class615.field8876 = var15.method3045(-128);
                            class154.field2005 = var15.method3045(-125);
                            class162.field2065 = ~var15.method3045(-126) == -2;
                            class586.field8498 = ~var15.method3045(-126) == -2;
                            class350.field4814 = var15.method3045(-128) == 1;
                            class615.field8873 = var15.method3090(-115);
                            class505.field7032 = class615.field8873 > 0;
                            class107.field1389 = var15.method3090(-126);
                            class144.field1878 = var15.method3090(-89);
                            class58.field781 = var15.method3090(-98);
                            class127.field1580 = var15.method3048(-4);
                            class395.field5460 = class31.field488.method1721(class127.field1580, 3);
                            class540.field7553 = var15.method3045(-125);
                            class77.field1057 = var15.method3090(-121);
                            class558.field7810 = var15.method3090(-118);
                            class367.field5111 = var15.method3045(-127) == 1;
                            class147.field1899.field257 = class147.field1899.field267 = var15.method3055(-881972240);
                            class628.field9175 = new class284();
                            class628.field9175.field3702 = var15.method3090(-101);
                            if (~class628.field9175.field3702 == -65536) {
                                class628.field9175.field3702 = -1;
                            }
                            class628.field9175.field3700 = var15.method3055(-881972240);
                            if (class628.field9174 != class602.field8701) {
                                class628.field9175.field3708 = class628.field9175.field3702 + 50000;
                                class628.field9175.field3707 = class628.field9175.field3702 + 40000;
                            }
                            if (class602.field8701 != class265.field3394 && (class78.field1058.method1766(class302.field3920, -279) || class78.field1058.method1766(class540.field7557, -279))) {
                                class15.method73(117);
                            }
                        } else {
                            if (!class96.field1294.method3270(69, class551.field7705)) {
                                return;
                            }
                            class96.field1294.method3267(-25750, class551.field7705, 0, var15.field7693);
                            var15.field7707 = 0;
                            class615.field8876 = var15.method3045(-127);
                            class154.field2005 = var15.method3045(-128);
                            class162.field2065 = ~var15.method3045(-128) == -2;
                            class586.field8498 = var15.method3045(-127) == 1;
                            class350.field4814 = var15.method3045(-125) == 1;
                            class591.field8543 = ~var15.method3045(-126) == -2;
                            class182.field2335 = var15.method3090(-80);
                            class505.field7032 = var15.method3045(-127) == 1;
                            class551.field7718 = var15.method3091((byte) -115);
                            class502.field6984 = var15.method3045(-128) == 1;
                            if (~class554.field7754 == -4) {
                                boolean var16 = var15.method3045(-128) == 1;
                                if (var16) {
                                    long var17 = var15.method3072(-24373);
                                    String var19 = class387.method2338((byte) -121, var17);
                                    int var20 = var15.method3045(-125);
                                    byte[] var21 = new byte[var20];
                                    var15.method375(0, 0, var20, var21);
                                    String var22 = class599.method3449(var21, 37);
                                    class578 var23 = null;
                                    try {
                                        class441 var24 = class31.field488.method1727(false, (byte) -58, "3");
                                        while (~var24.field6001 == -1) {
                                            class353.method2204(1L, 7806);
                                        }
                                        if (var24.field6001 == 1) {
                                            var23 = (class578) var24.field6000;
                                            int var25 = 2 + var19.length() + (5 - -var22.length() - -4);
                                            if (var25 > 50) {
                                                throw new RuntimeException(">50");
                                            }
                                            class551 var26 = new class551(var25 + 1);
                                            var26.method3060(var25, -25098);
                                            var26.method3060(1, -25098);
                                            var26.method3053(var19, true);
                                            var26.method3053(var22, true);
                                            var26.method3042(class24.field428, 124);
                                            var26.method3085(-23766);
                                            var23.method3249((byte) 95, var26.field7707, var26.field7693, 0);
                                        }
                                    } catch (Exception var36) {
                                    }
                                    try {
                                        if (var23 != null) {
                                            var23.method3252(0);
                                        }
                                    } catch (Exception var34) {
                                    }
                                    try {
                                        class499.method2793("demoaccountcreated", (byte) -42, class31.field488.field3644);
                                    } catch (Throwable var33) {
                                    }
                                }
                            }
                            class626.field9084.method1095(class502.field6984, 30);
                            class98.field1307.method3389(class502.field6984, true);
                            class579.field8053.method3625(class502.field6984, 127);
                        }
                        if ((!class162.field2065 || class350.field4814) && !class505.field7032) {
                            try {
                                class499.method2793("unzap", (byte) -106, class31.field488.field3644);
                            } catch (Throwable var31) {
                            }
                        } else {
                            try {
                                class499.method2793("zap", (byte) 90, class31.field488.field3644);
                            } catch (Throwable var35) {
                                if (class354.field4958) {
                                    try {
                                        class31.field488.field3644.getAppletContext().showDocument(new URL(class31.field488.field3644.getCodeBase(), "blank.ws"), "tbi");
                                    } catch (Exception var32) {
                                    }
                                }
                            }
                        }
                        if (class628.field9174 == class602.field8701) {
                            try {
                                class499.method2793("loggedin", (byte) 123, class31.field488.field3644);
                            } catch (Throwable var30) {
                            }
                        }
                        if (~class554.field7754 != -3 && class554.field7754 != 3) {
                            class294.field3824 = 0;
                            class372.method2272(2, (byte) -107);
                            class358.method2224(12644);
                            class597.method3438((byte) 124, 6);
                            class558.field7814 = null;
                            return;
                        }
                        class294.field3824 = 12;
                    }
                    if (class294.field3824 == 12) {
                        if (!class96.field1294.method3270(24, 3)) {
                            return;
                        }
                        class96.field1294.method3267(-25750, 3, 0, class342.field4758.field7693);
                        class294.field3824 = 13;
                    }
                    if (~class294.field3824 == -14) {
                        class66 var27 = class342.field4758;
                        var27.field7707 = 0;
                        if (var27.method376(-4)) {
                            if (!class96.field1294.method3270(-126, 1)) {
                                return;
                            }
                            class96.field1294.method3267(-25750, 1, 3, var27.field7693);
                        }
                        class558.field7814 = class639.method3681(126)[var27.method380(101)];
                        class262.field3333 = var27.method3090(-111);
                        class294.field3824 = 11;
                    }
                    if (~class294.field3824 == -12) {
                        if (class96.field1294.method3270(89, class262.field3333)) {
                            class96.field1294.method3267(-25750, class262.field3333, 0, class342.field4758.field7693);
                            class342.field4758.field7707 = 0;
                            class294.field3824 = 0;
                            int var28 = class262.field3333;
                            class372.method2272(2, (byte) -83);
                            class29.method177((byte) 102);
                            class101.method561((byte) 117, class342.field4758);
                            class460.field6561 = -1;
                            class249.method1523(-10486);
                            if (class342.field4758.field7707 != var28) {
                                throw new RuntimeException("lswp pos:" + class342.field4758.field7707 + " psize:" + var28);
                            } else {
                                class558.field7814 = null;
                            }
                        }
                    } else if (~class294.field3824 == -16) {
                        if (~class262.field3333 == 1) {
                            if (!class96.field1294.method3270(115, 2)) {
                                return;
                            }
                            class96.field1294.method3267(-25750, 2, 0, class342.field4758.field7693);
                            class342.field4758.field7707 = 0;
                            class262.field3333 = class342.field4758.method3090(-85);
                        }
                        if (class96.field1294.method3270(-106, class262.field3333)) {
                            class96.field1294.method3267(-25750, class262.field3333, 0, class342.field4758.field7693);
                            class342.field4758.field7707 = 0;
                            int var29 = class262.field3333;
                            class294.field3824 = 0;
                            class372.method2272(15, (byte) -89);
                            class96.method530(0);
                            class101.method561((byte) 11, class342.field4758);
                            if (class342.field4758.field7707 != var29) {
                                throw new RuntimeException("lswpr pos:" + class342.field4758.field7707 + " psize:" + var29);
                            } else {
                                class558.field7814 = null;
                            }
                        }
                    }
                }
            } catch (IOException var37) {
                if (class96.field1294 != null) {
                    class96.field1294.method3271((byte) 110);
                    class96.field1294 = null;
                }
                if (class606.field8716 >= 1) {
                    class294.field3824 = 0;
                    class372.method2272(-4, (byte) 96);
                    class351.method2188((byte) 113);
                } else {
                    ++class606.field8716;
                    class214.field2751 = 0;
                    class294.field3824 = 1;
                    if (class554.field7754 != 2 && ~class554.field7754 != -4) {
                        class15.field164.field3704 = !class15.field164.field3704;
                    } else {
                        class78.field1058.field3704 = !class78.field1058.field3704;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(BII)V")
    public static final void method2856(byte arg0, int arg1, int arg2) {
        ++field7131;
        if (arg0 == -97) {
            if (class132.field1627 != arg1) {
                class66.field881 = new int[arg1];
                for (int var3 = 0; ~arg1 < ~var3; ++var3) {
                    class66.field881[var3] = (var3 << 12) / arg1;
                }
                class132.field1627 = arg1;
                class134.field1635 = arg1 * 32;
                class150.field1971 = arg1 + -1;
            }
            if (class620.field8925 != arg2) {
                if (class132.field1627 == arg2) {
                    class130.field1606 = class66.field881;
                } else {
                    class130.field1606 = new int[arg2];
                    for (int var4 = 0; ~var4 > ~arg2; ++var4) {
                        class130.field1606[var4] = (var4 << 12) / arg2;
                    }
                }
                class620.field8925 = arg2;
                class376.field5248 = arg2 + -1;
            }
        }
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "()V")
    public class512() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "(I)V")
    public static void method2857(int arg0) {
        field7135 = null;
        if (arg0 == -11484) {
            field7130 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(IBI)I")
    public static final int method2858(int arg0, byte arg1, int arg2) {
        ++field7132;
        int var3 = -94 % ((arg1 - -67) / 41);
        return arg0 != 1 && arg0 != 3 ? class505.field7035[arg2 & 3] : class18.field207[arg2 & 3];
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(BI)[I")
    public final int[] method15(byte arg0, int arg1) {
        ++field7128;
        int[] var3 = super.field31.method2252(arg1, arg0 + 1);
        if (super.field31.field5127) {
            class205.method1315(var3, 0, class132.field1627, class130.field1606[arg1]);
        }
        if (arg0 != 10) {
            method2856((byte) -36, -115, -35);
        }
        return var3;
    }

    static {
        new class344((String) null, "Spieler nicht auf deiner Freunde-Liste.", (String) null, (String) null);
        field7133 = 0;
        field7135 = new class344("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");
    }
}
