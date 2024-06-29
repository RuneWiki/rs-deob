import java.io.IOException;
import java.math.BigInteger;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class500 {

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "Ldq;")
    public static class493 field7234 = new class493(6, -2);

    @OriginalMember(owner = "client!ip", name = "k", descriptor = "I")
    public static int field7237 = 20;

    @OriginalMember(owner = "client!ip", name = "j", descriptor = "I")
    public static int field7236 = -2;

    @OriginalMember(owner = "client!ip", name = "i", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field7235 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "I")
    public static int field7227;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
    public static int field7228;

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "I")
    public static int field7229;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "I")
    public static int field7230;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "I")
    public static int field7231;

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "I")
    public static int field7232;

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "I")
    public static int field7233;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)Z", line = 3)
    public static final boolean method3009(int arg0, int arg1) {
        field7231++;
        if (arg1 >= -114) {
            method3015(true, -116);
        }
        return arg0 == 2 || arg0 == 3 || arg0 == 4 || arg0 == 5;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V", line = 14)
    public static final void method3010(byte arg0) {
        class449 var1 = class512.field7423;
        synchronized (class512.field7423) {
            class512.field7423.method2640(arg0 ^ 0x34);
        }
        if (arg0 != 110) {
            field7235 = null;
        }
        field7229++;
        class449 var2 = class363.field4723;
        synchronized (class363.field4723) {
            class363.field4723.method2640(arg0 ^ 0x4);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lgp;Z)Z", line = 33)
    public static final boolean method3011(class36 arg0, boolean arg1) {
        field7232++;
        if (arg0 == null) {
            return false;
        }
        if (arg1) {
            field7234 = null;
        }
        if (!arg0.field464) {
            return false;
        } else if (!arg0.method265(class241.field3092, 17)) {
            return false;
        } else if (class472.field6843.method2022(-1, (long) arg0.field482) == null) {
            return class469.field6810.method2022(-1, (long) arg0.field483) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(BLni;)Z", line = 62)
    public static final boolean method3012(byte arg0, class363 arg1) {
        if (arg0 == -114) {
            field7228++;
            return class68.field884 == arg1 || class115.field1545 == arg1 || class45.field533 == arg1 || class33.field419 == arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(B)V", line = 73)
    public static final void method3013(byte arg0) {
        field7233++;
        if (class495.field7198 == 0 || class495.field7198 == 5) {
            return;
        }
        try {
            if ((++class528.field7791) > 2000) {
                if (class64.field835 != null) {
                    class64.field835.method2473(10228);
                    class64.field835 = null;
                }
                if (class321.field4067 >= 1) {
                    class495.field7198 = 0;
                    class183.method1157(-1979328921, -5);
                    return;
                }
                class495.field7198 = 1;
                class321.field4067++;
                if (class325.field4122 == 2 || class325.field4122 == 3) {
                    class64.field834.field367 = !class64.field834.field367;
                } else {
                    class382.field5031.field367 = !class382.field5031.field367;
                }
                class528.field7791 = 0;
            }
            if (class495.field7198 == 1) {
                if (class325.field4122 == 2 || class325.field4122 == 3) {
                    class518.field7494 = class219.field2794.method2888(class64.field834.field363, class64.field834.method202((byte) -94), (byte) 91);
                } else {
                    class518.field7494 = class219.field2794.method2888(class382.field5031.field363, class382.field5031.method202((byte) -95), (byte) 91);
                }
                class495.field7198 = 2;
            }
            if (class495.field7198 == 2) {
                if (class518.field7494.field1628 == 2) {
                    throw new IOException();
                }
                if (class518.field7494.field1628 != 1) {
                    return;
                }
                class64.field835 = new class421((Socket) class518.field7494.field1627, class219.field2794);
                class518.field7494 = null;
                long var1 = class277.field3509 = class250.method1516(class493.field7171, (byte) 126);
                class40.field511.field6631 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class40.field511.method2729(class266.field3358.field1865, false);
                class40.field511.method2729(var3, false);
                class64.field835.method2475(0, (byte) 112, 2, class40.field511.field6618);
                class404.method2390((byte) 84);
                int var4 = class64.field835.method2474(false);
                class404.method2390((byte) 84);
                if (var4 != 0) {
                    class495.field7198 = 0;
                    class183.method1157(-1979328921, var4);
                    class64.field835.method2473(10228);
                    class64.field835 = null;
                    return;
                }
                class495.field7198 = 3;
            }
            if (class495.field7198 == 3) {
                if (class64.field835.method2470((byte) 116) < 8) {
                    return;
                }
                class64.field835.method2472(-20555, 8, class513.field7443.field6618, 0);
                class513.field7443.field6631 = 0;
                class238.field3050 = class513.field7443.method2754(arg0 - 31);
                class463 var5 = new class463(70);
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class238.field3050 >> 32), (int) class238.field3050 };
                var5.method2729(10, false);
                var5.method2777(var6[0], arg0 ^ 0x29);
                var5.method2777(var6[1], arg0 ^ 0x29);
                var5.method2777(var6[2], -11);
                var5.method2777(var6[3], -11);
                var5.method2760(class250.method1516(class493.field7171, (byte) 116), -50);
                var5.method2769(class361.field4657, true);
                var5.method2732(774991200, field7235, class26.field376);
                class194 var7 = class40.field511;
                var7.field6631 = 0;
                if (class325.field4122 == 2 || class325.field4122 == 3) {
                    if (class483.field7059 == 12) {
                        var7.method2729(class266.field3362.field1865, false);
                    } else {
                        var7.method2729(class266.field3360.field1865, false);
                    }
                    var7.method2759((byte) -108, 0);
                    int var9 = var7.field6631;
                    var7.method2777(593, -11);
                    var7.method2729(class233.field2976, false);
                    var7.method2729(class191.method1184(false), false);
                    var7.method2759((byte) -26, class174.field2262);
                    var7.method2759((byte) -50, class390.field5236);
                    var7.method2729(class407.field5817.field3621, false);
                    class40.method378((byte) -105, var7);
                    var7.method2769(class301.field3873, true);
                    var7.method2777(class18.field276, arg0 ^ 0x29);
                    class463 var10 = class407.field5817.method586((byte) 121);
                    var7.method2729(var10.field6631, false);
                    var7.method2782(var10.field6631, var10.field6618, false, 0);
                    class236.field3006 = true;
                    var7.method2759((byte) -126, class296.field3802);
                    class131.method915(-4);
                    var7.method2782(var5.field6631, var5.field6618, false, 0);
                    var7.method2780(126, var7.field6631 - var9);
                } else {
                    var7.method2729(class266.field3363.field1865, false);
                    var7.method2759((byte) -53, 0);
                    int var8 = var7.field6631;
                    var7.method2777(593, -11);
                    var7.method2729(class530.field7803.field2104, false);
                    var7.method2729(class11.field177, false);
                    class40.method378((byte) -105, var7);
                    var7.method2769(class301.field3873, true);
                    var7.method2777(class18.field276, -11);
                    class131.method915(-4);
                    var7.method2782(var5.field6631, var5.field6618, false, 0);
                    var7.method2780(arg0 + 109, var7.field6631 - var8);
                }
                class64.field835.method2475(0, (byte) 112, var7.field6631, var7.field6618);
                var7.method1196(var6, false);
                for (int var11 = 0; var11 < 4; var11++) {
                    var6[var11] += 50;
                }
                class513.field7443.method1196(var6, false);
                class495.field7198 = 4;
            }
            if (class495.field7198 == 4) {
                if (class64.field835.method2470((byte) 127) < 1) {
                    return;
                }
                int var12 = class64.field835.method2474(false);
                if (var12 == 21) {
                    class495.field7198 = 7;
                } else if (var12 == 29) {
                    class495.field7198 = 13;
                } else if (var12 == 1) {
                    class495.field7198 = 5;
                    class183.method1157(-1979328921, var12);
                    return;
                } else if (var12 == 2) {
                    class495.field7198 = 8;
                } else if (var12 == 15) {
                    class495.field7198 = 14;
                    class312.field3986 = -2;
                } else if (var12 == 23 && class321.field4067 < 1) {
                    class321.field4067++;
                    class495.field7198 = 1;
                    class528.field7791 = 0;
                    class64.field835.method2473(arg0 ^ 0xFFFFD828);
                    class64.field835 = null;
                    return;
                } else {
                    class495.field7198 = 0;
                    class183.method1157(-1979328921, var12);
                    class64.field835.method2473(10228);
                    class64.field835 = null;
                    class303.method1790((byte) -12);
                    return;
                }
            }
            if (class495.field7198 == 6) {
                class40.field511.field6631 = 0;
                class40.field511.method1206(0, class266.field3361.field1865);
                class64.field835.method2475(0, (byte) 112, class40.field511.field6631, class40.field511.field6618);
                class495.field7198 = 4;
            } else if (class495.field7198 != 7) {
                if (arg0 != -36) {
                    method3015(false, -48);
                }
                if (class495.field7198 == 13) {
                    if (class64.field835.method2470((byte) 72) >= 1) {
                        class50.field663 = class64.field835.method2474(false);
                        class495.field7198 = 0;
                        class183.method1157(-1979328921, 29);
                        class64.field835.method2473(10228);
                        class64.field835 = null;
                        class303.method1790((byte) -12);
                    }
                } else if (class495.field7198 != 8) {
                    if (class495.field7198 == 9) {
                        if (class325.field4122 == 3) {
                            class177.field2329 = true;
                        } else {
                            class177.field2329 = false;
                        }
                        class194 var13 = class513.field7443;
                        if (class325.field4122 == 2 || class325.field4122 == 3) {
                            if (class64.field835.method2470((byte) 95) < class470.field6827) {
                                return;
                            }
                            class64.field835.method2472(-20555, class470.field6827, var13.field6618, 0);
                            var13.field6631 = 0;
                            class322.field4086 = var13.method2737(false);
                            class290.field3701 = var13.method2737(false);
                            class293.field3726 = var13.method2737(false) == 1;
                            class284.field3608 = var13.method2737(false) == 1;
                            class292.field3723 = var13.method2737(false) == 1;
                            class122.field1641 = var13.method2737(false) == 1;
                            class66.field858 = var13.method2758((byte) 96);
                            class115.field1550 = var13.method2737(false) == 1;
                            class433.field6147 = var13.method2737(false) == 1;
                            if (class325.field4122 == 3) {
                                boolean var14 = var13.method2737(false) == 1;
                                if (var14) {
                                    long var15 = var13.method2754(-84);
                                    String var17 = class279.method1651(var15, (byte) -128);
                                    int var18 = var13.method2737(false);
                                    byte[] var19 = new byte[var18];
                                    var13.method1205(false, 0, var19, var18);
                                    String var20 = class154.method1007((byte) -3, var19);
                                    class210 var21 = null;
                                    try {
                                        class121 var22 = class219.field2794.method2882("3", false, (byte) -43);
                                        while (var22.field1628 == 0) {
                                            class199.method1251(1L, (byte) 117);
                                        }
                                        if (var22.field1628 == 1) {
                                            var21 = (class210) var22.field1627;
                                            int var23 = var17.length() + var20.length() + 4 + 3 + 2;
                                            if (var23 > 50) {
                                                throw new RuntimeException(">50");
                                            }
                                            class463 var24 = new class463(var23 + 1);
                                            var24.method2729(var23, false);
                                            var24.method2729(0, false);
                                            var24.method2773(var17, (byte) 0);
                                            var24.method2773(var20, (byte) 0);
                                            var24.method2757(120);
                                            var21.method1301(arg0 ^ 0xFFFFFFDD, var24.field6618, var24.field6631, 0);
                                        }
                                    } catch (Exception var33) {
                                    }
                                    try {
                                        if (var21 != null) {
                                            var21.method1303((byte) -66);
                                        }
                                    } catch (Exception var31) {
                                    }
                                }
                            }
                            class315.field4017.method1957((byte) 120, class433.field6147);
                            class376.field4949.method622((byte) 42, class433.field6147);
                            class390.field5244.method1326(class433.field6147, -73);
                        } else if (class64.field835.method2470((byte) 66) >= class470.field6827) {
                            class64.field835.method2472(-20555, class470.field6827, var13.field6618, 0);
                            var13.field6631 = 0;
                            class322.field4086 = var13.method2737(false);
                            class290.field3701 = var13.method2737(false);
                            class293.field3726 = var13.method2737(false) == 1;
                            class284.field3608 = var13.method2737(false) == 1;
                            class292.field3723 = var13.method2737(false) == 1;
                            class306.field3905 = var13.method2758((byte) 121);
                            class115.field1550 = class306.field3905 > 0;
                            class437.field6260 = var13.method2758((byte) 89);
                            class261.field3306 = var13.method2758((byte) 104);
                            class18.field263 = var13.method2758((byte) 115);
                            class225.field2868 = var13.method2727(-91);
                            class313.field3993 = class219.field2794.method2879(class225.field2868, arg0 ^ 0xD1E);
                            class223.field2858 = var13.method2737(false);
                            class297.field3822 = var13.method2758((byte) 113);
                            class204.field2663 = var13.method2758((byte) 119);
                            class402.field5731 = var13.method2737(false) == 1;
                            class23.field336.field2852 = class23.field336.field2813 = var13.method2745(true);
                            class385.field5064 = new class25();
                            class385.field5064.field355 = var13.method2758((byte) 119);
                            if (class385.field5064.field355 == 65535) {
                                class385.field5064.field355 = -1;
                            }
                            class385.field5064.field363 = var13.method2745(true);
                            if (class324.field4107 != class218.field2784) {
                                class385.field5064.field362 = class385.field5064.field355 + 40000;
                                class385.field5064.field360 = class385.field5064.field355 + 50000;
                            }
                            if (class218.field2784 != class128.field1703) {
                                class64.field834 = class385.field5064;
                            }
                        } else {
                            return;
                        }
                        if ((!class293.field3726 || class292.field3723) && !class115.field1550) {
                            try {
                                class114.method825("unzap", 13324, class219.field2794.field6891);
                            } catch (Throwable var30) {
                            }
                        } else {
                            try {
                                class114.method825("zap", 13324, class219.field2794.field6891);
                            } catch (Throwable var32) {
                                if (class433.field6152) {
                                    try {
                                        class219.field2794.field6891.getAppletContext().showDocument(new URL(class219.field2794.field6891.getCodeBase(), "blank.ws"), "tbi");
                                    } catch (Exception var29) {
                                    }
                                }
                            }
                        }
                        if (class324.field4107 == class218.field2784) {
                            try {
                                class114.method825("loggedin", arg0 + 13360, class219.field2794.field6891);
                            } catch (Throwable var28) {
                            }
                        }
                        if (class325.field4122 != 2 && class325.field4122 != 3) {
                            class495.field7198 = 0;
                            class183.method1157(-1979328921, 2);
                            class361.method2070((byte) -57);
                            class284.method1677(-20429, 6);
                            class85.field1068 = null;
                            return;
                        }
                        class495.field7198 = 11;
                    }
                    if (class495.field7198 == 11) {
                        if (class64.field835.method2470((byte) 94) < 3) {
                            return;
                        }
                        class64.field835.method2472(-20555, 3, class513.field7443.field6618, 0);
                        class495.field7198 = 12;
                    }
                    if (class495.field7198 == 12) {
                        class194 var25 = class513.field7443;
                        var25.field6631 = 0;
                        if (var25.method1197(arg0 + 32384)) {
                            if (class64.field835.method2470((byte) 107) < 1) {
                                return;
                            }
                            class64.field835.method2472(-20555, 1, var25.field6618, 3);
                        }
                        class85.field1068 = class73.method638(arg0 ^ 0xFFFF8D59)[var25.method1194(true)];
                        class312.field3986 = var25.method2758((byte) 108);
                        class495.field7198 = 10;
                    }
                    if (class495.field7198 == 10) {
                        if (class64.field835.method2470((byte) 83) >= class312.field3986) {
                            class64.field835.method2472(-20555, class312.field3986, class513.field7443.field6618, 0);
                            class513.field7443.field6631 = 0;
                            class495.field7198 = 0;
                            int var26 = class312.field3986;
                            class183.method1157(-1979328921, 2);
                            class159.method1026(0);
                            class426.method2496((byte) -4, class513.field7443);
                            class75.field963 = -1;
                            class25.method206(113);
                            if (class513.field7443.field6631 != var26) {
                                throw new RuntimeException("lswp pos:" + class513.field7443.field6631 + " psize:" + var26);
                            }
                            class85.field1068 = null;
                        }
                    } else if (class495.field7198 == 14) {
                        if (class312.field3986 == -2) {
                            if (class64.field835.method2470((byte) 85) < 2) {
                                return;
                            }
                            class64.field835.method2472(-20555, 2, class513.field7443.field6618, 0);
                            class513.field7443.field6631 = 0;
                            class312.field3986 = class513.field7443.method2758((byte) 97);
                        }
                        if (class64.field835.method2470((byte) 84) >= class312.field3986) {
                            class64.field835.method2472(-20555, class312.field3986, class513.field7443.field6618, 0);
                            class513.field7443.field6631 = 0;
                            class495.field7198 = 0;
                            int var27 = class312.field3986;
                            class183.method1157(arg0 - 1979328885, 15);
                            class413.method2444(true);
                            class426.method2496((byte) -4, class513.field7443);
                            if (class513.field7443.field6631 != var27) {
                                throw new RuntimeException("lswpr pos:" + class513.field7443.field6631 + " psize:" + var27);
                            }
                            class85.field1068 = null;
                        }
                    }
                } else if (class64.field835.method2470((byte) 70) >= 1) {
                    class470.field6827 = class64.field835.method2474(false);
                    class495.field7198 = 9;
                }
            } else if (class64.field835.method2470((byte) 124) >= 1) {
                class462.field6605 = class64.field835.method2474(false) * 60 + 180;
                class495.field7198 = 0;
                class183.method1157(-1979328921, 21);
                class64.field835.method2473(arg0 + 10264);
                class64.field835 = null;
                class303.method1790((byte) -12);
            }
        } catch (IOException var34) {
            if (class64.field835 != null) {
                class64.field835.method2473(10228);
                class64.field835 = null;
            }
            if (class321.field4067 < 1) {
                class495.field7198 = 1;
                class321.field4067++;
                class528.field7791 = 0;
                if (class325.field4122 == 2 || class325.field4122 == 3) {
                    class64.field834.field367 = !class64.field834.field367;
                } else {
                    class382.field5031.field367 = !class382.field5031.field367;
                }
            } else {
                class495.field7198 = 0;
                class183.method1157(-1979328921, -4);
                class303.method1790((byte) -12);
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(B)V", line = 666)
    public static final void method3014(byte arg0) {
        field7230++;
        if (class527.field7777 != null) {
            return;
        }
        class527.field7777 = new int[65536];
        int var1 = -12 / ((arg0 - 36) / 39);
        double var2 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var4 = 0;
        for (int var5 = 0; var5 < 512; var5++) {
            float var6 = ((float) (var5 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var7 = (float) (var5 & 0x7) / 8.0F + 0.0625F;
            for (int var8 = 0; var8 < 128; var8++) {
                float var9 = (float) var8 / 128.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = 0.0F;
                float var13 = var6 / 60.0F;
                int var14 = (int) var13;
                int var15 = var14 % 6;
                float var16 = (float) (-var14) + var13;
                float var17 = (1.0F - var7) * var9;
                float var18 = (1.0F - (var7 * var16)) * var9;
                float var19 = (1.0F - (1.0F - var16) * var7) * var9;
                if (var15 == 0) {
                    var10 = var9;
                    var11 = var19;
                    var12 = var17;
                } else if (var15 == 1) {
                    var11 = var9;
                    var12 = var17;
                    var10 = var18;
                } else if (var15 == 2) {
                    var11 = var9;
                    var12 = var19;
                    var10 = var17;
                } else if (var15 == 3) {
                    var12 = var9;
                    var11 = var18;
                    var10 = var17;
                } else if (var15 == 4) {
                    var11 = var17;
                    var12 = var9;
                    var10 = var19;
                } else if (var15 == 5) {
                    var10 = var9;
                    var11 = var17;
                    var12 = var18;
                }
                float var20 = (float) Math.pow((double) var10, var2);
                float var21 = (float) Math.pow((double) var11, var2);
                float var22 = (float) Math.pow((double) var12, var2);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (int) (var22 * 256.0F);
                int var26 = (var23 << 16) + (var24 << 8) + var25 - 16777216;
                class527.field7777[var4++] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZI)[B", line = 786)
    public static final synchronized byte[] method3015(boolean arg0, int arg1) {
        field7227++;
        if (arg1 == 100 && class276.field3487 > 0) {
            byte[] var2 = class397.field5700[--class276.field3487];
            class397.field5700[class276.field3487] = null;
            return var2;
        } else if (arg1 == 5000 && class283.field3602 > 0) {
            byte[] var3 = class337.field4236[--class283.field3602];
            class337.field4236[class283.field3602] = null;
            return var3;
        } else if (arg1 == 30000 && class328.field4143 > 0) {
            byte[] var4 = class357.field4596[--class328.field4143];
            class357.field4596[class328.field4143] = null;
            return var4;
        } else if (arg0) {
            return null;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "(B)V", line = 828)
    public static void method3016(byte arg0) {
        field7235 = null;
        if (arg0 <= 54) {
            field7236 = -34;
        }
        field7234 = null;
    }
}
