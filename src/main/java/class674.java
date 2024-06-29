import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public abstract class class674 extends class1 {

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "Z")
    public boolean field9496 = false;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
    public static int field9497 = 64;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "Lju;")
    public static class102 field9503 = new class102(0, -1);

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "Lbh;")
    public static class538 field9504 = new class538(8);

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "B")
    public byte field9495;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "B")
    public byte field9501;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public int field9487;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public int field9488;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public int field9489;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public int field9490;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public int field9491;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public static int field9493;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public static int field9494;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
    public static int field9498;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    public static int field9499;

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "I")
    public int field9502;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "Ld;")
    public static class268 field9505;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "Lah;")
    public static class374 field9500;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "Z")
    public boolean field9492;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I[FB)[F")
    public static final float[] method3863(int arg0, float[] arg1, byte arg2) {
        field9498++;
        float[] var3 = new float[arg0];
        class34.method243(arg1, 0, var3, 0, arg0);
        if (arg2 <= 34) {
            method3865((byte) -6);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "(I)I")
    public abstract int method268(int arg0);

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I[Lkb;II)I")
    public final int method3864(int arg0, class757[] arg1, int arg2, int arg3) {
        field9499++;
        long var5 = class706.field9852[this.field9501][arg2][arg0];
        long var7 = 0L;
        int var9 = arg3;
        while (var7 <= 48L) {
            int var10 = (int) (var5 >> (int) var7 & 0xFFFFL);
            if (var10 <= 0) {
                break;
            }
            arg1[var9++] = class146.field2026[var10 - 1].field7244;
            var7 += 16L;
        }
        for (int var11 = var9; var11 < 4; var11++) {
            arg1[var11] = null;
        }
        return var9;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(Lha;I)Ljl;")
    public abstract class596 method278(class545 arg0, int arg1);

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lha;III)Z")
    public abstract boolean method273(class545 arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I[Lkb;)I")
    public abstract int method344(int arg0, class757[] arg1);

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "(I)I")
    public abstract int method282(int arg0);

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(Z)Z")
    public abstract boolean method342(boolean arg0);

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)Z")
    public abstract boolean method373(byte arg0);

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "(I)I")
    public int method376(int arg0) {
        if (arg0 != 0) {
            this.field9495 = -11;
        }
        field9493++;
        return 0;
    }

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "(I)Z")
    public abstract boolean method339(int arg0);

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(B)V")
    public static final void method3865(byte arg0) {
        field9494++;
        if (class213.field3003 == 0 || class213.field3003 == 5) {
            return;
        }
        try {
            short var1;
            if (class609.field8675 == 0) {
                var1 = 250;
            } else {
                var1 = 2000;
            }
            if (var1 < ++class749.field10434) {
                if (class275.field3699 != null) {
                    class275.field3699.method2461(false);
                    class275.field3699 = null;
                }
                if (class609.field8675 >= 3) {
                    class213.field3003 = 0;
                    class22.method125(1, -5);
                    return;
                }
                if (class93.field1268 == 2) {
                    class396.field5504.method388((byte) 105);
                } else {
                    class177.field2403.method388((byte) 42);
                }
                class609.field8675++;
                class749.field10434 = 0;
                class213.field3003 = 1;
            }
            if (arg0 < 3) {
                field9503 = null;
            }
            if (class213.field3003 == 1) {
                if (class93.field1268 == 2) {
                    class176.field2392 = class396.field5504.method391(false, class379.field5339);
                } else {
                    class176.field2392 = class177.field2403.method391(false, class379.field5339);
                }
                class213.field3003 = 2;
            }
            if (class213.field3003 == 2) {
                if (class176.field2392.field5975 == 2) {
                    throw new IOException();
                }
                if (class176.field2392.field5975 != 1) {
                    return;
                }
                class275.field3699 = class734.method4075(true, (Socket) class176.field2392.field5973, 7500);
                class176.field2392 = null;
                class204.method1360(0);
                class120 var2 = class510.method3041(97);
                var2.field1653.method184(class241.field3353.field2237, -36);
                class471.method2805(91, var2);
                class458.method2748(true);
                class213.field3003 = 3;
            }
            if (class213.field3003 == 3) {
                if (!class275.field3699.method2459(2, 1)) {
                    return;
                }
                class275.field3699.method2463(1, 0, 11909, class150.field2065.field279);
                int var3 = class150.field2065.field279[0] & 0xFF;
                if (var3 != 0) {
                    class213.field3003 = 0;
                    class22.method125(1, var3);
                    class275.field3699.method2461(false);
                    class275.field3699 = null;
                    class241.method1533(false);
                    return;
                }
                class150.field2065.field330 = 0;
                class26 var4 = new class26(518);
                int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                var4.method184(10, -32);
                var4.method199(true, var5[0]);
                var4.method199(true, var5[1]);
                var4.method199(true, var5[2]);
                var4.method199(true, var5[3]);
                var4.method156(113, 0L);
                var4.method187(class392.field5460, (byte) -94);
                var4.method156(101, class202.field2915);
                var4.method156(-65, class455.field6272);
                var4.method140(class502.field7017, class594.field8564, -12623);
                class204.method1360(0);
                class120 var6 = class510.method3041(87);
                class583 var7 = var6.field1653;
                if (class93.field1268 == 2) {
                    if (class213.field3004 == 13) {
                        var7.method184(class241.field3359.field2237, -123);
                    } else {
                        var7.method184(class241.field3357.field2237, -32);
                    }
                    var7.method147((byte) 53, 0);
                    int var8 = var7.field330;
                    var7.method199(true, 631);
                    var7.method155(0, var4.field330, var4.field279, 115);
                    int var9 = var7.field330;
                    var7.method187(class552.field7816, (byte) -115);
                    var7.method184(class33.field488, -89);
                    var7.method184(class615.method3609((byte) 98), -98);
                    var7.method147((byte) 53, class58.field807);
                    var7.method147((byte) 53, class582.field8281);
                    var7.method184(field9500.field5155.method133(0), -89);
                    class569.method3403(111, var7);
                    var7.method187(class686.field9626, (byte) -93);
                    var7.method199(true, class711.field9915);
                    class26 var10 = field9500.method2252((byte) -57);
                    var7.method184(var10.field330, -98);
                    var7.method155(0, var10.field330, var10.field279, 64);
                    class83.field1158 = true;
                    class26 var11 = new class26(class105.field1537.method2037(-12));
                    class105.field1537.method2033(var11, (byte) 82);
                    var7.method155(0, var11.field279.length, var11.field279, 92);
                    var7.method147((byte) 53, class19.field236);
                    var7.method156(-84, class471.field6468);
                    var7.method184(class485.field6554 == null ? 0 : 1, -96);
                    if (class485.field6554 != null) {
                        var7.method187(class485.field6554, (byte) -66);
                    }
                    var7.method184(class202.method1356((byte) 18, "jagtheora") ? 1 : 0, -106);
                    class677.method3878(17682, var7);
                    var7.method197(var5, var7.field330, var9, -80);
                    var7.method164((byte) 55, var7.field330 - var8);
                } else {
                    var7.method184(class241.field3360.field2237, -77);
                    var7.method147((byte) 53, 0);
                    int var12 = var7.field330;
                    var7.method199(true, 631);
                    var7.method155(0, var4.field330, var4.field279, 70);
                    int var13 = var7.field330;
                    var7.method187(class552.field7816, (byte) -116);
                    var7.method184(class210.field2984.field1662, -71);
                    var7.method184(class369.field4721, -37);
                    class569.method3403(121, var7);
                    var7.method187(class686.field9626, (byte) -110);
                    var7.method199(true, class711.field9915);
                    class677.method3878(17682, var7);
                    var7.method197(var5, var7.field330, var13, -102);
                    var7.method164((byte) -120, var7.field330 - var12);
                }
                class471.method2805(115, var6);
                class458.method2748(true);
                class608.field8668 = new class311(var5);
                for (int var14 = 0; var14 < 4; var14++) {
                    var5[var14] += 50;
                }
                class150.field2065.method3455((byte) 75, var5);
                class213.field3003 = 4;
            }
            if (class213.field3003 == 4) {
                if (!class275.field3699.method2459(2, 1)) {
                    return;
                }
                class275.field3699.method2463(1, 0, 11909, class150.field2065.field279);
                int var15 = class150.field2065.field279[0] & 0xFF;
                if (var15 == 21) {
                    class213.field3003 = 7;
                } else if (var15 == 29) {
                    class213.field3003 = 13;
                } else if (var15 == 1) {
                    class213.field3003 = 5;
                    class22.method125(1, var15);
                    return;
                } else if (var15 == 2) {
                    class213.field3003 = 8;
                } else if (var15 == 15) {
                    class213.field3003 = 14;
                    class542.field7582 = -2;
                } else if (var15 == 23 && class609.field8675 < 3) {
                    class213.field3003 = 1;
                    class609.field8675++;
                    class749.field10434 = 0;
                    class275.field3699.method2461(false);
                    class275.field3699 = null;
                    return;
                } else {
                    class213.field3003 = 0;
                    class22.method125(1, var15);
                    class275.field3699.method2461(false);
                    class275.field3699 = null;
                    class241.method1533(false);
                    return;
                }
            }
            if (class213.field3003 == 6) {
                class204.method1360(0);
                class120 var16 = class510.method3041(111);
                class583 var17 = var16.field1653;
                var17.method3459(class608.field8668, 39);
                var17.method3457((byte) 0, class241.field3366.field2237);
                class471.method2805(99, var16);
                class458.method2748(true);
                class213.field3003 = 4;
            } else if (class213.field3003 == 7) {
                if (class275.field3699.method2459(2, 1)) {
                    class275.field3699.method2463(1, 0, 11909, class150.field2065.field279);
                    int var18 = class150.field2065.field279[0] & 0xFF;
                    class213.field3003 = 0;
                    class262.field3583 = (var18 + 3) * 60;
                    class22.method125(1, 21);
                    class275.field3699.method2461(false);
                    class275.field3699 = null;
                    class241.method1533(false);
                }
            } else if (class213.field3003 == 13) {
                if (class275.field3699.method2459(2, 1)) {
                    class275.field3699.method2463(1, 0, 11909, class150.field2065.field279);
                    class213.field3003 = 0;
                    class260.field3538 = class150.field2065.field279[0] & 0xFF;
                    class22.method125(1, 29);
                    class275.field3699.method2461(false);
                    class275.field3699 = null;
                    class241.method1533(false);
                }
            } else if (class213.field3003 != 8) {
                if (class213.field3003 == 9) {
                    class583 var19 = class150.field2065;
                    if (class93.field1268 == 2) {
                        if (!class275.field3699.method2459(2, class365.field4675)) {
                            return;
                        }
                        class275.field3699.method2463(class365.field4675, 0, 11909, var19.field279);
                        var19.field330 = 0;
                        class467.field6375 = var19.method194((byte) 119);
                        class178.field2465 = var19.method194((byte) 119);
                        class378.field5266 = var19.method194((byte) 119) == 1;
                        class234.field3249 = var19.method194((byte) 119) == 1;
                        class412.field5736 = var19.method194((byte) 119) == 1;
                        class330.field4240 = var19.method194((byte) 119) == 1;
                        class471.field6467 = var19.method193(2);
                        class290.field3796 = var19.method194((byte) 119) == 1;
                        class231.field3219 = var19.method150(true);
                        class191.field2769 = var19.method194((byte) 119) == 1;
                        class264.field3604.method3192((byte) 108, class191.field2769);
                        class487.field6572.method3053((byte) 36, class191.field2769);
                        class643.field9112.method3889(class191.field2769, -119);
                    } else if (class275.field3699.method2459(2, class365.field4675)) {
                        class275.field3699.method2463(class365.field4675, 0, 11909, var19.field279);
                        var19.field330 = 0;
                        class467.field6375 = var19.method194((byte) 119);
                        class178.field2465 = var19.method194((byte) 119);
                        class378.field5266 = var19.method194((byte) 119) == 1;
                        class234.field3249 = var19.method194((byte) 119) == 1;
                        class412.field5736 = var19.method194((byte) 119) == 1;
                        class403.field5595 = var19.method173(-3);
                        class290.field3796 = class403.field5595 > 0;
                        class499.field6989 = var19.method193(2);
                        class5.field42 = var19.method193(2);
                        class514.field7182 = var19.method193(2);
                        class140.field1920 = var19.method189(255);
                        class156.field2134 = class379.field5339.method3583(class140.field1920, 2);
                        class68.field954 = var19.method194((byte) 119);
                        class522.field7340 = var19.method193(2);
                        class252.field3484 = var19.method193(2);
                        class252.field3475 = var19.method194((byte) 119) == 1;
                        class473.field6483.field9272 = class473.field6483.field9250 = class671.field9428 = var19.method166((byte) -125);
                        class162.field2245 = var19.method194((byte) 119);
                        class404.field5609 = var19.method189(255);
                        class220.field3099 = new class59();
                        class220.field3099.field812 = var19.method193(2);
                        if (class220.field3099.field812 == 65535) {
                            class220.field3099.field812 = -1;
                        }
                        class220.field3099.field813 = var19.method166((byte) -125);
                        if (class746.field10392 != class456.field6280) {
                            class220.field3099.field820 = class220.field3099.field812 + 40000;
                            class220.field3099.field815 = class220.field3099.field812 + 50000;
                        }
                        if (class746.field10392 != class14.field193 && (class396.field5504.method389(class450.field6183, (byte) -124) || class396.field5504.method389(class104.field1501, (byte) -121))) {
                            class351.method1999(0);
                        }
                    } else {
                        return;
                    }
                    if ((!class378.field5266 || class412.field5736) && !class290.field3796) {
                        try {
                            class208.method1378("unzap", class622.field8847, -9875);
                        } catch (Throwable var25) {
                        }
                    } else {
                        try {
                            class208.method1378("zap", class622.field8847, -9875);
                        } catch (Throwable var26) {
                            if (class400.field5533) {
                                try {
                                    class622.field8847.getAppletContext().showDocument(new URL(class622.field8847.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var24) {
                                }
                            }
                        }
                    }
                    if (class746.field10392 == class456.field6280) {
                        try {
                            class208.method1378("loggedin", class622.field8847, -9875);
                        } catch (Throwable var23) {
                        }
                    }
                    if (class93.field1268 != 2) {
                        class213.field3003 = 0;
                        class22.method125(1, 2);
                        class275.method1666(2);
                        class647.method3754(7, true);
                        class108.field1547 = null;
                        return;
                    }
                    class213.field3003 = 11;
                }
                if (class213.field3003 == 11) {
                    if (!class275.field3699.method2459(2, 3)) {
                        return;
                    }
                    class275.field3699.method2463(3, 0, 11909, class150.field2065.field279);
                    class213.field3003 = 12;
                }
                if (class213.field3003 == 12) {
                    class583 var20 = class150.field2065;
                    var20.field330 = 0;
                    if (var20.method3463(47)) {
                        if (!class275.field3699.method2459(2, 1)) {
                            return;
                        }
                        class275.field3699.method2463(1, 3, 11909, var20.field279);
                    }
                    class108.field1547 = class461.method2760(-26198)[var20.method3461(-122)];
                    class542.field7582 = var20.method193(2);
                    class213.field3003 = 10;
                }
                if (class213.field3003 == 10) {
                    if (class275.field3699.method2459(2, class542.field7582)) {
                        class275.field3699.method2463(class542.field7582, 0, 11909, class150.field2065.field279);
                        class150.field2065.field330 = 0;
                        class213.field3003 = 0;
                        int var21 = class542.field7582;
                        class22.method125(1, 2);
                        class648.method3755((byte) 67);
                        class319.method1855(-26156, class150.field2065);
                        class585.field8427 = -1;
                        if (class369.field4719 == class108.field1547) {
                            class193.method1277((byte) 57);
                        } else {
                            class452.method2726(11);
                        }
                        if (class150.field2065.field330 != var21) {
                            throw new RuntimeException("lswp pos:" + class150.field2065.field330 + " psize:" + var21);
                        }
                        class108.field1547 = null;
                    }
                } else if (class213.field3003 == 14) {
                    if (class542.field7582 == -2) {
                        if (!class275.field3699.method2459(2, 2)) {
                            return;
                        }
                        class275.field3699.method2463(2, 0, 11909, class150.field2065.field279);
                        class150.field2065.field330 = 0;
                        class542.field7582 = class150.field2065.method193(2);
                    }
                    if (class275.field3699.method2459(2, class542.field7582)) {
                        class275.field3699.method2463(class542.field7582, 0, 11909, class150.field2065.field279);
                        class150.field2065.field330 = 0;
                        class213.field3003 = 0;
                        int var22 = class542.field7582;
                        class22.method125(1, 15);
                        class629.method3672(0);
                        class319.method1855(-26156, class150.field2065);
                        if (class150.field2065.field330 != var22) {
                            throw new RuntimeException("lswpr pos:" + class150.field2065.field330 + " psize:" + var22);
                        }
                        class108.field1547 = null;
                    }
                }
            } else if (class275.field3699.method2459(2, 1)) {
                class275.field3699.method2463(1, 0, 11909, class150.field2065.field279);
                class365.field4675 = class150.field2065.field279[0] & 0xFF;
                class213.field3003 = 9;
            }
        } catch (IOException var27) {
            if (class275.field3699 != null) {
                class275.field3699.method2461(false);
                class275.field3699 = null;
            }
            if (class609.field8675 >= 3) {
                class213.field3003 = 0;
                class22.method125(1, -4);
                class241.method1533(false);
            } else {
                if (class93.field1268 == 2) {
                    class396.field5504.method388((byte) 120);
                } else {
                    class177.field2403.method388((byte) 13);
                }
                class609.field8675++;
                class749.field10434 = 0;
                class213.field3003 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "(I)Z")
    public abstract boolean method277(int arg0);

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "(I)V")
    public static void method3866(int arg0) {
        if (arg0 != -5) {
            method3867(32, -124, -76, null, null);
        }
        field9500 = null;
        field9504 = null;
        field9505 = null;
        field9503 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IBZILha;ILig;)V")
    public abstract void method365(int arg0, byte arg1, boolean arg2, int arg3, class545 arg4, int arg5, class674 arg6);

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIILcea;Lcea;)V")
    public static final void method3867(int arg0, int arg1, int arg2, class95 arg3, class95 arg4) {
        class38 var5 = class617.method3623(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field542 = arg3;
        var5.field533 = arg4;
        int var6 = class52.field741 == class435.field5969 ? 1 : 0;
        if (!arg3.method277(3)) {
            class140.field1931[var6][class609.field8671[var6]++] = arg3;
        } else if (arg3.method283((byte) -64)) {
            class160.field2206[var6][class352.field4548[var6]++] = arg3;
        } else {
            class261.field3566[var6][class269.field3635[var6]++] = arg3;
            class380.field5357 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method277(3)) {
            if (arg4.method283((byte) -101)) {
                class160.field2206[var6][class352.field4548[var6]++] = arg4;
                return;
            }
            class261.field3566[var6][class269.field3635[var6]++] = arg4;
            class380.field5357 = true;
            return;
        }
        class140.field1931[var6][class609.field8671[var6]++] = arg4;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(ILha;)Lgp;")
    public abstract class551 method274(int arg0, class545 arg1);

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(B)Z")
    public abstract boolean method283(byte arg0);

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(B)V")
    public abstract void method380(byte arg0);

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(ILha;)V")
    public abstract void method271(int arg0, class545 arg1);
}
