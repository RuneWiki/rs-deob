import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public abstract class class269 extends class325 {

    @OriginalMember(owner = "client!rj", name = "S", descriptor = "I")
    public static volatile int field4189 = 0;

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
    public int field4175;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
    public int field4176;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "I")
    public int field4179;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "I")
    public int field4184;

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!rj", name = "P", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!rj", name = "Q", descriptor = "I")
    public int field4187;

    @OriginalMember(owner = "client!rj", name = "R", descriptor = "I")
    public int field4188;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lmn;IZI)V", line = 9)
    public static final void method1881(class161 arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            return;
        }
        field4183++;
        if (arg0.field2577 == 0) {
            arg0.field2621 = arg0.field2513;
        } else if (arg0.field2577 == 1) {
            arg0.field2621 = (arg1 - arg0.field2619) / 2 + arg0.field2513;
        } else if (arg0.field2577 == 2) {
            arg0.field2621 = arg1 - arg0.field2619 - arg0.field2513;
        } else if (arg0.field2577 == 3) {
            arg0.field2621 = arg0.field2513 * arg1 >> 14;
        } else if (arg0.field2577 == 4) {
            arg0.field2621 = (arg0.field2513 * arg1 >> 14) + (arg1 - arg0.field2619) / 2;
        } else {
            arg0.field2621 = arg1 - (arg0.field2619 + (arg0.field2513 * arg1 >> 14));
        }
        if (arg0.field2534 == 0) {
            arg0.field2587 = arg0.field2558;
        } else if (arg0.field2534 == 1) {
            arg0.field2587 = (arg3 - arg0.field2490) / 2 + arg0.field2558;
        } else if (arg0.field2534 == 2) {
            arg0.field2587 = arg3 - arg0.field2490 - arg0.field2558;
        } else if (arg0.field2534 == 3) {
            arg0.field2587 = arg0.field2558 * arg3 >> 14;
        } else if (arg0.field2534 == 4) {
            arg0.field2587 = (arg0.field2558 * arg3 >> 14) + (arg3 - arg0.field2490) / 2;
        } else {
            arg0.field2587 = arg3 - (arg0.field2558 * arg3 >> 14) - arg0.field2490;
        }
        if (!class335.field5216 || !(client.method1012(arg0).field54 != 0 || arg0.field2590 == 0)) {
            return;
        }
        if (arg0.field2587 < 0) {
            arg0.field2587 = 0;
        } else if (arg0.field2587 + arg0.field2490 > arg3) {
            arg0.field2587 = arg3 - arg0.field2490;
        }
        if (arg0.field2621 < 0) {
            arg0.field2621 = 0;
        } else if (arg1 < arg0.field2621 + arg0.field2619) {
            arg0.field2621 = arg1 - arg0.field2619;
        }
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)V", line = 89)
    public static final void method1882(byte arg0) {
        if (arg0 != 94) {
            method1881((class161) null, 9, true, -21);
        }
        class61.field815 = new class281();
        field4177++;
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(B)Laf;", line = 105)
    public static final class195 method1883(byte arg0) {
        field4185++;
        byte[] var1 = class220.field3362[0];
        int var2 = class209.field3191[0] * class133.field2028[0];
        if (arg0 <= 124) {
            method1881((class161) null, -125, false, -115);
        }
        int[] var3 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = class82.field1212[class149.method1117(255, var1[var4])];
        }
        class195 var5 = new class195(class233.field3554, class38.field559, class304.field4666[0], class27.field293[0], class133.field2028[0], class209.field3191[0], var3);
        class245.method1684(255);
        return var5;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(IIIII)V", line = 139)
    public final void method1884(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4182++;
        int var6 = this.field4188 << 3;
        int var7 = (arg4 << 4) + (var6 & 0xF);
        int var8 = this.field4179 << 3;
        int var9 = (arg0 << 4) + (var8 & 0xF);
        this.method128(var6, var8, var7, var9, arg1, arg3);
        if (arg2 > -76) {
            this.method128(58, 122, -125, -43, -89, -89);
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(Z)V", line = 162)
    public static final void method1885(boolean arg0) {
        field4178++;
        if (class59.field787 == 0 || class59.field787 == 5) {
            return;
        }
        try {
            if (++class178.field2833 > 2000) {
                if (class1.field20 != null) {
                    class1.field20.method1653(-19746);
                    class1.field20 = null;
                }
                if (class165.field2684 >= 1) {
                    class184.field2907 = -5;
                    class59.field787 = 0;
                    return;
                }
                class59.field787 = 1;
                class165.field2684++;
                if (class62.field829 == class340.field5286) {
                    class62.field829 = class216.field3318;
                } else {
                    class62.field829 = class340.field5286;
                }
                class178.field2833 = 0;
            }
            if (class59.field787 == 1) {
                class296.field4569 = class330.field5074.method65((byte) -31, class62.field829, class224.field3427);
                class59.field787 = 2;
            }
            if (class59.field787 == 2) {
                if (class296.field4569.field3185 == 2) {
                    throw new IOException();
                }
                if (class296.field4569.field3185 != 1) {
                    return;
                }
                class1.field20 = new class237((Socket) class296.field4569.field3186, class330.field5074);
                class296.field4569 = null;
                long var1 = class273.field4259 = class49.method374(class160.field2432, -1);
                class85.field1236.field3866 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class85.field1236.method1752(14, -122);
                class85.field1236.method1752(var3, -116);
                class1.field20.method1651(0, 2, class85.field1236.field3840, (byte) -94);
                if (class250.field3778 != null) {
                    class250.field3778.method2298((byte) 42);
                }
                if (class234.field3567 != null) {
                    class234.field3567.method2298((byte) 42);
                }
                int var4 = class1.field20.method1655(0);
                if (class250.field3778 != null) {
                    class250.field3778.method2298((byte) 42);
                }
                if (class234.field3567 != null) {
                    class234.field3567.method2298((byte) 42);
                }
                if (var4 != 0) {
                    class59.field787 = 0;
                    class184.field2907 = var4;
                    class1.field20.method1653(-19746);
                    class1.field20 = null;
                    return;
                }
                class59.field787 = 3;
            }
            if (class59.field787 == 3) {
                if (class1.field20.method1648(0) < 8) {
                    return;
                }
                class1.field20.method1656(8, true, 0, class204.field3136.field3840);
                int[] var5 = new int[4];
                class204.field3136.field3866 = 0;
                class77.field1117 = class204.field3136.method1777(2047062688);
                var5[3] = (int) class77.field1117;
                class85.field1236.field3866 = 0;
                var5[2] = (int) (class77.field1117 >> 32);
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                class85.field1236.method1752(10, -109);
                class85.field1236.method1773(var5[0], false);
                class85.field1236.method1773(var5[1], false);
                class85.field1236.method1773(var5[2], arg0);
                class85.field1236.method1773(var5[3], false);
                class85.field1236.method1738((byte) 17, class49.method374(class160.field2432, -1));
                class85.field1236.method1766(0, class320.field4956);
                class85.field1236.method1781(class177.field2826, 0, class327.field5048);
                class14.field187.field3866 = 0;
                if (class152.field2308 == 40) {
                    class14.field187.method1752(18, -108);
                } else {
                    class14.field187.method1752(16, -92);
                }
                class14.field187.method1744(true, class85.field1236.field3866 + class308.method2108(12146, class160.field2420) + 163);
                class14.field187.method1773(543, false);
                class14.field187.method1752(class297.field4579, -120);
                class14.field187.method1752(class174.field2794 ? 1 : 0, -109);
                class14.field187.method1752(1, -86);
                class14.field187.method1752(class63.method431(1), -101);
                class14.field187.method1744(true, class151.field2281);
                class14.field187.method1744(true, class215.field3300);
                class14.field187.method1752(class142.field2190, -96);
                class214.method1532(class14.field187, 86);
                class14.field187.method1766(0, class160.field2420);
                class14.field187.method1773(class76.field1109, false);
                class14.field187.method1773(class307.method2103((byte) -56), false);
                class157.field2380 = true;
                class14.field187.method1744(!arg0, class98.field1413);
                class14.field187.method1773(class210.field3224.method709(-13106), false);
                class14.field187.method1773(class267.field4155.method709(-13106), false);
                class14.field187.method1773(class251.field3799.method709(-13106), false);
                class14.field187.method1773(class273.field4264.method709(-13106), arg0);
                class14.field187.method1773(class196.field3022.method709(-13106), false);
                class14.field187.method1773(class153.field2329.method709(-13106), arg0);
                class14.field187.method1773(class222.field3389.method709(-13106), false);
                class14.field187.method1773(class122.field1867.method709(-13106), arg0);
                class14.field187.method1773(class264.field4087.method709(-13106), false);
                class14.field187.method1773(class292.field4506.method709(-13106), false);
                class14.field187.method1773(class1.field19.method709(-13106), false);
                class14.field187.method1773(class122.field1872.method709(-13106), false);
                class14.field187.method1773(class245.field3711.method709(-13106), false);
                class14.field187.method1773(class250.field3766.method709(-13106), false);
                class14.field187.method1773(class139.field2090.method709(-13106), arg0);
                class14.field187.method1773(class299.field4596.method709(-13106), false);
                class14.field187.method1773(class56.field739.method709(-13106), false);
                class14.field187.method1773(class268.field4174.method709(-13106), false);
                class14.field187.method1773(class1.field7.method709(-13106), false);
                class14.field187.method1773(class163.field2645.method709(-13106), false);
                class14.field187.method1773(class149.field2256.method709(-13106), false);
                class14.field187.method1773(class10.field143.method709(-13106), false);
                class14.field187.method1773(class138.field2075.method709(-13106), false);
                class14.field187.method1773(class172.field2773.method709(-13106), arg0);
                class14.field187.method1773(class213.field3269.method709(-13106), false);
                class14.field187.method1773(class232.field3536.method709(-13106), arg0);
                class14.field187.method1773(class171.field2760.method709(-13106), arg0);
                class14.field187.method1773(class76.field1115.method709(-13106), false);
                class14.field187.method1773(class64.field877.method709(-13106), false);
                class14.field187.method1759(-91, class85.field1236.field3840, 0, class85.field1236.field3866);
                class1.field20.method1651(0, class14.field187.field3866, class14.field187.field3840, (byte) -123);
                class85.field1236.method1137((byte) -122, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class204.field3136.method1137((byte) -104, var5);
                class59.field787 = 4;
            }
            if (class59.field787 == 4) {
                if (class1.field20.method1648(0) < 1) {
                    return;
                }
                int var7 = class1.field20.method1655(0);
                if (var7 == 21) {
                    class59.field787 = 7;
                } else if (var7 == 29) {
                    class59.field787 = 10;
                } else if (var7 == 1) {
                    class184.field2907 = var7;
                    class59.field787 = 5;
                    return;
                } else if (var7 == 2) {
                    class59.field787 = 8;
                } else if (var7 == 15) {
                    class59.field787 = 0;
                    class184.field2907 = var7;
                    return;
                } else if (var7 == 23 && class165.field2684 < 1) {
                    class59.field787 = 1;
                    class178.field2833 = 0;
                    class165.field2684++;
                    class1.field20.method1653(-19746);
                    class1.field20 = null;
                    return;
                } else {
                    class184.field2907 = var7;
                    class59.field787 = 0;
                    class1.field20.method1653(-19746);
                    class1.field20 = null;
                    return;
                }
            }
            if (class59.field787 == 6) {
                class85.field1236.field3866 = 0;
                class85.field1236.method1141((byte) 91, 17);
                class1.field20.method1651(0, class85.field1236.field3866, class85.field1236.field3840, (byte) -79);
                class59.field787 = 4;
                return;
            }
            if (class59.field787 == 7) {
                if (class1.field20.method1648(0) < 1) {
                    return;
                }
                class135.field2048 = (class1.field20.method1655(0) + 3) * 60;
                class59.field787 = 0;
                class184.field2907 = 21;
                class1.field20.method1653(-19746);
                class1.field20 = null;
                return;
            }
            if (arg0) {
                return;
            }
            if (class59.field787 == 10) {
                if (class1.field20.method1648(0) < 1) {
                    return;
                }
                class196.field3021 = class1.field20.method1655(0);
                class184.field2907 = 29;
                class59.field787 = 0;
                class1.field20.method1653(-19746);
                class1.field20 = null;
                return;
            }
            if (class59.field787 == 8) {
                if (class1.field20.method1648(0) < 14) {
                    return;
                }
                class1.field20.method1656(14, true, 0, class204.field3136.field3840);
                class204.field3136.field3866 = 0;
                class295.field4546 = class204.field3136.method1774((byte) 103);
                class262.field4025 = class204.field3136.method1774((byte) 1);
                class2.field29 = class204.field3136.method1774((byte) -105) == 1;
                class161.field2454 = class204.field3136.method1774((byte) 17) == 1;
                class209.field3190 = class204.field3136.method1774((byte) 32) == 1;
                class90.field1308 = class204.field3136.method1774((byte) 45) == 1;
                class122.field1866 = class204.field3136.method1774((byte) -102) == 1;
                class153.field2323 = class204.field3136.method1755(arg0);
                class38.field558 = class204.field3136.method1774((byte) 100) == 1;
                class205.field3152 = class204.field3136.method1774((byte) -108) == 1;
                class161.method1214(class205.field3152, -1);
                class69.method495(class205.field3152, 14104);
                if (!class174.field2794) {
                    if ((!class2.field29 || class209.field3190) && !class38.field558) {
                        try {
                            class199.method1445(-29, "unzap", class330.field5074.field95);
                        } catch (Throwable var14) {
                        }
                    } else {
                        try {
                            class199.method1445(126, "zap", class330.field5074.field95);
                        } catch (Throwable var13) {
                        }
                    }
                }
                try {
                    class199.method1445(-48, "loggedin", class330.field5074.field95);
                } catch (Throwable var12) {
                }
                class101.field1450 = class204.field3136.method1139(true);
                class241.field3679 = class204.field3136.method1755(false);
                class59.field787 = 9;
            }
            if (class59.field787 == 9) {
                if (class1.field20.method1648(0) < class241.field3679) {
                    return;
                }
                class204.field3136.field3866 = 0;
                class1.field20.method1656(class241.field3679, !arg0, 0, class204.field3136.field3840);
                class184.field2907 = 2;
                class59.field787 = 0;
                class149.method1119(false);
                class305.field4773 = -1;
                class331.method2312(false, (byte) 61);
                class101.field1450 = -1;
                return;
            }
        } catch (IOException var15) {
            if (class1.field20 != null) {
                class1.field20.method1653(-19746);
                class1.field20 = null;
            }
            if (class165.field2684 >= 1) {
                class59.field787 = 0;
                class184.field2907 = -4;
            } else {
                class59.field787 = 1;
                class165.field2684++;
                class178.field2833 = 0;
                if (class62.field829 == class340.field5286) {
                    class62.field829 = class216.field3318;
                } else {
                    class62.field829 = class340.field5286;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "(B)V", line = 547)
    public static final void method1886(byte arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class307.field4791[var1] = false;
        }
        if (arg0 < 110) {
            field4181 = 68;
        }
        class267.field4150 = -1;
        field4186++;
        class98.field1418 = -1;
        class268.field4168 = 5;
        class273.field4265 = 0;
        field4181 = 0;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(III)V")
    public abstract void method123(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(II)V")
    public abstract void method130(int arg0, int arg1);

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIII)V")
    public abstract void method132(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIII)V")
    public abstract void method128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(II)V")
    public abstract void method124(int arg0, int arg1);

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(II)V")
    public abstract void method121(int arg0, int arg1);

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(IIIII)V")
    public abstract void method122(int arg0, int arg1, int arg2, int arg3, int arg4);
}
