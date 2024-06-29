import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class101 {

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "Ljo;")
    private class382 field1532 = new class382(64);

    @OriginalMember(owner = "client!gu", name = "o", descriptor = "Ljo;")
    public class382 field1540 = new class382(50);

    @OriginalMember(owner = "client!gu", name = "p", descriptor = "Ljo;")
    public class382 field1541 = new class382(5);

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "Lkr;")
    public class262 field1531;

    @OriginalMember(owner = "client!gu", name = "m", descriptor = "Z")
    public boolean field1538;

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "Lok;")
    private class74 field1533;

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "Lok;")
    public class74 field1536;

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "I")
    public static int field1527 = 0;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!gu", name = "j", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!gu", name = "n", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!gu", name = "q", descriptor = "I")
    public int field1542;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(BZ)V", line = 4)
    public final void method768(byte arg0, boolean arg1) {
        if (arg0 != 16) {
            this.method770(false);
        }
        field1535++;
        if (this.field1538 != arg1) {
            this.field1538 = arg1;
            this.method772(26);
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IZ)V", line = 31)
    public final void method769(int arg0, boolean arg1) {
        class382 var3 = this.field1532;
        synchronized (this.field1532) {
            this.field1532.method2294(arg0, true);
        }
        field1530++;
        class382 var4 = this.field1540;
        synchronized (this.field1540) {
            if (arg1) {
                return;
            }
            this.field1540.method2294(arg0, true);
        }
        class382 var5 = this.field1541;
        synchronized (this.field1541) {
            this.field1541.method2294(arg0, true);
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)V", line = 53)
    public final void method770(boolean arg0) {
        field1534++;
        class382 var2 = this.field1532;
        synchronized (this.field1532) {
            this.field1532.method2287(107);
        }
        class382 var3 = this.field1540;
        synchronized (this.field1540) {
            this.field1540.method2287(72);
            if (!arg0) {
                this.method775(-105, 45);
            }
        }
        class382 var4 = this.field1541;
        synchronized (this.field1541) {
            this.field1541.method2287(110);
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IBLsm;I)V", line = 74)
    public static final void method771(int arg0, byte arg1, class477 arg2, int arg3) {
        field1526++;
        if (arg2 == null || class154.field2334.field7365 == arg2) {
            return;
        }
        int var4 = arg2.field7039;
        int var5 = arg2.field7029;
        int var6 = arg2.field7034;
        if (arg1 != 112) {
            return;
        }
        int var7 = (int) arg2.field7030;
        long var8 = arg2.field7030;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        if (var6 == 13) {
            class480 var10 = class83.field1327[var7];
            if (var10 != null) {
                class154.field2338 = arg3;
                class490.field7299++;
                class341.field5247 = 0;
                class90.field1410 = arg0;
                class503.field7411 = 2;
                class97.method758(class72.field998, false);
                class43.field559.method2777((byte) 74, var7);
                class43.field559.method2726((byte) -21, class49.field630.method1879(82, true) ? 1 : 0);
                class27.method262(0, (byte) -126, true, var10.field6068[0], 0, var10.method2419((byte) 127), -2, var10.field6065[0], var10.method2419((byte) 102));
            }
        }
        if (var6 == 20) {
            class480 var11 = class83.field1327[var7];
            if (var11 != null) {
                class90.field1410 = arg0;
                class341.field5247 = 0;
                class451.field6626++;
                class154.field2338 = arg3;
                class503.field7411 = 2;
                class97.method758(class14.field185, false);
                class43.field559.method2777((byte) 74, var7);
                class43.field559.method2754(class49.field630.method1879(82, true) ? 1 : 0, arg1 + 5462);
                class27.method262(0, (byte) -125, true, var11.field6068[0], 0, var11.method2419((byte) 118), -2, var11.field6065[0], var11.method2419((byte) 101));
            }
        }
        if (var6 == 51) {
            class341.field5247 = 0;
            class503.field7411 = 1;
            class154.field2338 = arg3;
            class90.field1410 = arg0;
            class40.field529++;
            class97.method758(class376.field5674, false);
            class43.field559.method2773((byte) 118, class267.field3979 + var4);
            class43.field559.method2737(class327.field5118, true);
            class43.field559.method2742((byte) 114, class179.field2655);
            class43.field559.method2777((byte) 74, class241.field3358 + var5);
            class43.field559.method2742((byte) 108, class532.field7837);
            class27.method262(0, (byte) -127, true, var5, 0, 1, -4, var4, 1);
        }
        if (var6 == 46) {
            class90.field1410 = arg0;
            class444.field6521++;
            class503.field7411 = 2;
            class154.field2338 = arg3;
            class341.field5247 = 0;
            class97.method758(class509.field7481, false);
            class43.field559.method2739(class267.field3979 + var4, (byte) -41);
            class43.field559.method2739(class241.field3358 + var5, (byte) -41);
            class43.field559.method2739(class179.field2655, (byte) -41);
            class43.field559.method2777((byte) 74, class532.field7837);
            class43.field559.method2737(class327.field5118, true);
            class43.field559.method2775((byte) 90, class49.field630.method1879(82, true) ? 1 : 0);
            class43.field559.method2773((byte) 119, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class52.method391(var5, arg1 - 1, var4, var8);
        }
        if (var6 == 19) {
            class480 var12 = class83.field1327[var7];
            if (var12 != null) {
                class90.field1410 = arg0;
                class341.field5247 = 0;
                class503.field7411 = 2;
                class154.field2338 = arg3;
                class29.field422++;
                class97.method758(class84.field1334, false);
                class43.field559.method2753(arg1 ^ 0x11, class49.field630.method1879(82, true) ? 1 : 0);
                class43.field559.method2773((byte) 124, var7);
                class27.method262(0, (byte) -116, true, var12.field6068[0], 0, var12.method2419((byte) 118), -2, var12.field6065[0], var12.method2419((byte) 121));
            }
        }
        if (var6 == 59) {
            class480 var13 = class83.field1327[var7];
            if (var13 != null) {
                class90.field1410 = arg0;
                class341.field5247 = 0;
                class20.field304++;
                class154.field2338 = arg3;
                class503.field7411 = 2;
                class97.method758(class402.field6081, false);
                class43.field559.method2754(class49.field630.method1879(82, true) ? 1 : 0, 5574);
                class43.field559.method2739(var7, (byte) -41);
                class27.method262(0, (byte) -116, true, var13.field6068[0], 0, var13.method2419((byte) 102), -2, var13.field6065[0], var13.method2419((byte) 119));
            }
        }
        if (var6 == 21) {
            class351 var14 = class88.field1375[var7];
            if (var14 != null) {
                class503.field7411 = 2;
                class154.field2338 = arg3;
                class90.field1410 = arg0;
                class341.field5247 = 0;
                class213.field3043++;
                class97.method758(class437.field6441, false);
                class43.field559.method2775((byte) 93, class49.field630.method1879(82, true) ? 1 : 0);
                class43.field559.method2742((byte) -19, var7);
                class27.method262(0, (byte) -126, true, var14.field6068[0], 0, var14.method2419((byte) 106), -2, var14.field6065[0], var14.method2419((byte) 104));
            }
        }
        if (var6 == 23) {
            class341.field5247 = 0;
            class154.field2338 = arg3;
            class503.field7411 = 2;
            class90.field1410 = arg0;
            class426.field6347++;
            class97.method758(class437.field6446, false);
            class43.field559.method2754(class49.field630.method1879(82, true) ? 1 : 0, arg1 + 5462);
            class43.field559.method2777((byte) 74, class267.field3979 + var4);
            class43.field559.method2742((byte) -35, class241.field3358 + var5);
            class43.field559.method2742((byte) -113, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class52.method391(var5, 122, var4, var8);
        }
        if (var6 == 3) {
            class351 var15 = class88.field1375[var7];
            if (var15 != null) {
                class117.field1761++;
                class154.field2338 = arg3;
                class503.field7411 = 2;
                class341.field5247 = 0;
                class90.field1410 = arg0;
                class97.method758(class195.field2876, false);
                class43.field559.method2777((byte) 74, var7);
                class43.field559.method2753(-74, class49.field630.method1879(82, true) ? 1 : 0);
                class27.method262(0, (byte) -120, true, var15.field6068[0], 0, var15.method2419((byte) 114), -2, var15.field6065[0], var15.method2419((byte) 122));
            }
        }
        if (var6 == 1011) {
            class154.field2338 = arg3;
            class90.field1410 = arg0;
            class503.field7411 = 2;
            class237.field3317++;
            class341.field5247 = 0;
            class97.method758(class272.field4060, false);
            class43.field559.method2777((byte) 74, var7);
        }
        if (var6 == 16) {
            class310 var16 = class406.method2442((byte) -43, var5, var4);
            if (var16 != null) {
                class164.method1149(var16, 2);
            }
        }
        if (var6 == 45) {
            class351 var17 = class88.field1375[var7];
            if (var17 != null) {
                class90.field1410 = arg0;
                class519.field7604++;
                class503.field7411 = 2;
                class341.field5247 = 0;
                class154.field2338 = arg3;
                class97.method758(class303.field4511, false);
                class43.field559.method2739(var7, (byte) -41);
                class43.field559.method2754(class49.field630.method1879(82, true) ? 1 : 0, arg1 + 5462);
                class27.method262(0, (byte) -119, true, var17.field6068[0], 0, var17.method2419((byte) 113), -2, var17.field6065[0], var17.method2419((byte) 108));
            }
        }
        if (var6 == 1009) {
            class490.field7294++;
            class503.field7411 = 2;
            class341.field5247 = 0;
            class154.field2338 = arg3;
            class90.field1410 = arg0;
            class97.method758(class258.field3689, false);
            class43.field559.method2777((byte) 74, var7);
        }
        if (var6 == 50) {
            class154.field2338 = arg3;
            class90.field1410 = arg0;
            class341.field5242++;
            class341.field5247 = 0;
            class503.field7411 = 2;
            class97.method758(class336.field5184, false);
            class43.field559.method2739(var5 + class241.field3358, (byte) -41);
            class43.field559.method2739(class267.field3979 + var4, (byte) -41);
            class43.field559.method2753(62, class49.field630.method1879(82, true) ? 1 : 0);
            class43.field559.method2742((byte) 103, var7);
            class311.method1963((byte) -34, var5, var4);
        }
        if (var6 == 15) {
            class154.field2338 = arg3;
            class341.field5247 = 0;
            class503.field7411 = 2;
            class397.field5931++;
            class90.field1410 = arg0;
            class97.method758(class345.field5330, false);
            class43.field559.method2754(class49.field630.method1879(82, true) ? 1 : 0, 5574);
            class43.field559.method2739(class267.field3979 + var4, (byte) -41);
            class43.field559.method2777((byte) 74, class179.field2655);
            class43.field559.method2748(class327.field5118, (byte) -23);
            class43.field559.method2773((byte) 127, class532.field7837);
            class43.field559.method2739(class241.field3358 + var5, (byte) -41);
            class43.field559.method2773((byte) 107, var7);
            class311.method1963((byte) -34, var5, var4);
        }
        if (var6 == 1010) {
            class154.field2338 = arg3;
            class503.field7411 = 2;
            class341.field5247 = 0;
            class90.field1410 = arg0;
            class351 var18 = class88.field1375[var7];
            if (var18 != null) {
                class277 var19 = var18.field5409;
                if (var19.field4148 != null) {
                    var19 = var19.method1734((byte) 40, class307.field4619);
                }
                if (var19 != null) {
                    class97.method758(class439.field6457, false);
                    class384.field5791++;
                    class43.field559.method2777((byte) 74, var19.field4185);
                }
            }
        }
        if (var6 == 11 || var6 == 1008) {
            class221.method1401(var5, arg2.field7037, var4, (byte) -115, var7);
        }
        if (var6 == 30) {
            class90.field1410 = arg0;
            class503.field7411 = 2;
            class341.field5247 = 0;
            class154.field2338 = arg3;
            class24.field355++;
            class97.method758(class136.field2011, false);
            class43.field559.method2777((byte) 74, var7);
            class43.field559.method2726((byte) -21, class49.field630.method1879(82, true) ? 1 : 0);
            class43.field559.method2777((byte) 74, class267.field3979 + var4);
            class43.field559.method2777((byte) 74, class241.field3358 + var5);
            class311.method1963((byte) -34, var5, var4);
        }
        if (var6 == 8) {
            class341.field5247 = 0;
            class90.field1410 = arg0;
            class503.field7411 = 2;
            class483.field7129++;
            class154.field2338 = arg3;
            class97.method758(class34.field464, false);
            class43.field559.method2773((byte) 122, var5 + class241.field3358);
            class43.field559.method2742((byte) 102, class267.field3979 + var4);
            class43.field559.method2739(var7, (byte) -41);
            class43.field559.method2775((byte) 89, class49.field630.method1879(82, true) ? 1 : 0);
            class311.method1963((byte) -34, var5, var4);
        }
        if (var6 == 47) {
            class154.field2338 = arg3;
            class341.field5247 = 0;
            class503.field7411 = 2;
            class169.field2480++;
            class90.field1410 = arg0;
            class97.method758(class69.field920, false);
            class43.field559.method2754(class49.field630.method1879(82, true) ? 1 : 0, 5574);
            class43.field559.method2739(var5 + class241.field3358, (byte) -41);
            class43.field559.method2773((byte) 109, class267.field3979 + var4);
            class43.field559.method2739(Integer.MAX_VALUE & (int) (var8 >>> 32), (byte) -41);
            class52.method391(var5, 116, var4, var8);
        }
        if (var6 == 58) {
            if (class234.field3291 > 0 && class49.field630.method1879(82, true) && class49.field630.method1879(81, true)) {
                class498.method2965(class410.field6198.field7686, -127, class241.field3358 + var5, class267.field3979 + var4);
            } else {
                class90.field1410 = arg0;
                class312.field4848++;
                class341.field5247 = 0;
                class503.field7411 = 1;
                class154.field2338 = arg3;
                class97.method758(class505.field7429, false);
                class43.field559.method2773((byte) 111, class267.field3979 + var4);
                class43.field559.method2773((byte) 107, class241.field3358 + var5);
            }
        }
        if (var6 == 49) {
            class351 var20 = class88.field1375[var7];
            if (var20 != null) {
                class341.field5247 = 0;
                class155.field2345++;
                class503.field7411 = 2;
                class154.field2338 = arg3;
                class90.field1410 = arg0;
                class97.method758(class241.field3354, false);
                class43.field559.method2773((byte) 93, class179.field2655);
                class43.field559.method2753(117, class49.field630.method1879(82, true) ? 1 : 0);
                class43.field559.method2777((byte) 74, var7);
                class43.field559.method2717(class327.field5118, 496598568);
                class43.field559.method2739(class532.field7837, (byte) -41);
                class27.method262(0, (byte) -125, true, var20.field6068[0], 0, var20.method2419((byte) 104), -2, var20.field6065[0], var20.method2419((byte) 121));
            }
        }
        if (var6 == 12) {
            class503.field7411 = 2;
            class404.field6090++;
            class154.field2338 = arg3;
            class90.field1410 = arg0;
            class341.field5247 = 0;
            class97.method758(class335.field5174, false);
            class43.field559.method2754(class49.field630.method1879(82, true) ? 1 : 0, 5574);
            class43.field559.method2742((byte) -92, var7);
            class43.field559.method2742((byte) -125, class241.field3358 + var5);
            class43.field559.method2739(class267.field3979 + var4, (byte) -41);
            class311.method1963((byte) -34, var5, var4);
        }
        if (var6 == 44) {
            class154.field2338 = arg3;
            class311.field4822++;
            class341.field5247 = 0;
            class90.field1410 = arg0;
            class503.field7411 = 2;
            class97.method758(class370.field5611, false);
            class43.field559.method2742((byte) 115, class267.field3979 + var4);
            class43.field559.method2773((byte) 105, var5 + class241.field3358);
            class43.field559.method2777((byte) 74, var7);
            class43.field559.method2754(class49.field630.method1879(82, true) ? 1 : 0, 5574);
            class311.method1963((byte) -34, var5, var4);
        }
        if (var6 == 25) {
            class480 var21 = class83.field1327[var7];
            if (var21 != null) {
                class440.field6469++;
                class90.field1410 = arg0;
                class154.field2338 = arg3;
                class503.field7411 = 2;
                class341.field5247 = 0;
                class97.method758(class224.field3174, false);
                class43.field559.method2775((byte) 104, class49.field630.method1879(82, true) ? 1 : 0);
                class43.field559.method2777((byte) 74, class179.field2655);
                class43.field559.method2737(class327.field5118, true);
                class43.field559.method2739(class532.field7837, (byte) -41);
                class43.field559.method2742((byte) 112, var7);
                class27.method262(0, (byte) -126, true, var21.field6068[0], 0, var21.method2419((byte) 122), -2, var21.field6065[0], var21.method2419((byte) 127));
            }
        }
        if (var6 == 4) {
            if (class234.field3291 > 0 && class49.field630.method1879(82, true) && class49.field630.method1879(81, true)) {
                class498.method2965(class410.field6198.field7686, arg1 ^ 0xFFFFFFF4, class241.field3358 + var5, class267.field3979 - -var4);
            } else {
                class50.method376(var7, (byte) 20, var4, var5);
                if (var7 == 1) {
                    class43.field559.method2754(-1, 5574);
                    class43.field559.method2754(-1, arg1 ^ 0x15B6);
                    class43.field559.method2777((byte) 74, (int) class311.field4836);
                    class43.field559.method2754(57, arg1 + 5462);
                    class43.field559.method2754(class469.field6881, 5574);
                    class43.field559.method2754(class230.field3230, 5574);
                    class43.field559.method2754(89, 5574);
                    class43.field559.method2777((byte) 74, class410.field6198.field7681);
                    class43.field559.method2777((byte) 74, class410.field6198.field7671);
                    class43.field559.method2754(63, 5574);
                } else {
                    class503.field7411 = 1;
                    class154.field2338 = arg3;
                    class341.field5247 = 0;
                    class90.field1410 = arg0;
                }
                class27.method262(0, (byte) -128, true, var5, 0, 1, -4, var4, 1);
            }
        }
        if (var6 == 1012) {
            class503.field7411 = 2;
            class341.field5247 = 0;
            class90.field1410 = arg0;
            class152.field2310++;
            class154.field2338 = arg3;
            class97.method758(class486.field7236, false);
            class43.field559.method2773((byte) 96, class267.field3979 + var4);
            class43.field559.method2726((byte) -21, class49.field630.method1879(82, true) ? 1 : 0);
            class43.field559.method2739(class241.field3358 + var5, (byte) -41);
            class43.field559.method2739(Integer.MAX_VALUE & (int) (var8 >>> 32), (byte) -41);
            class52.method391(var5, 119, var4, var8);
        }
        if (var6 == 6) {
            class480 var22 = class83.field1327[var7];
            if (var22 != null) {
                class503.field7411 = 2;
                class90.field1410 = arg0;
                class341.field5247 = 0;
                class265.field3951++;
                class154.field2338 = arg3;
                class97.method758(class446.field6576, false);
                class43.field559.method2773((byte) 109, var7);
                class43.field559.method2775((byte) 119, class49.field630.method1879(82, true) ? 1 : 0);
                class27.method262(0, (byte) -120, true, var22.field6068[0], 0, var22.method2419((byte) 105), -2, var22.field6065[0], var22.method2419((byte) 115));
            }
        }
        if (var6 == 1002 || var6 == 1007 || var6 == 1001 || var6 == 1004 || var6 == 1003) {
            class359.method2147(var4, var6, arg1 - 160, var7);
        }
        if (var6 == 48) {
            class480 var23 = class83.field1327[var7];
            if (var23 != null) {
                class503.field7411 = 2;
                class341.field5247 = 0;
                class80.field1097++;
                class154.field2338 = arg3;
                class90.field1410 = arg0;
                class97.method758(class534.field7860, false);
                class43.field559.method2777((byte) 74, var7);
                class43.field559.method2775((byte) 98, class49.field630.method1879(82, true) ? 1 : 0);
                class27.method262(0, (byte) -118, true, var23.field6068[0], 0, var23.method2419((byte) 103), -2, var23.field6065[0], var23.method2419((byte) 103));
            }
        }
        if (var6 == 10) {
            class90.field1410 = arg0;
            class133.field1988++;
            class154.field2338 = arg3;
            class503.field7411 = 2;
            class341.field5247 = 0;
            class97.method758(class261.field3904, false);
            class43.field559.method2753(-55, class49.field630.method1879(82, true) ? 1 : 0);
            class43.field559.method2739(var5 + class241.field3358, (byte) -41);
            class43.field559.method2742((byte) 123, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class43.field559.method2742((byte) -65, var4 + class267.field3979);
            class52.method391(var5, 104, var4, var8);
        }
        if (var6 == 2) {
            class440.field6469++;
            class90.field1410 = arg0;
            class503.field7411 = 2;
            class341.field5247 = 0;
            class154.field2338 = arg3;
            class97.method758(class224.field3174, false);
            class43.field559.method2775((byte) 97, class49.field630.method1879(82, true) ? 1 : 0);
            class43.field559.method2777((byte) 74, class179.field2655);
            class43.field559.method2737(class327.field5118, true);
            class43.field559.method2739(class532.field7837, (byte) -41);
            class43.field559.method2742((byte) 115, class410.field6198.field6015);
        }
        if (var6 == 57) {
            class351 var24 = class88.field1375[var7];
            if (var24 != null) {
                class143.field2150++;
                class90.field1410 = arg0;
                class503.field7411 = 2;
                class341.field5247 = 0;
                class154.field2338 = arg3;
                class97.method758(class54.field710, false);
                class43.field559.method2726((byte) -21, class49.field630.method1879(82, true) ? 1 : 0);
                class43.field559.method2777((byte) 74, var7);
                class27.method262(0, (byte) -123, true, var24.field6068[0], 0, var24.method2419((byte) 114), -2, var24.field6065[0], var24.method2419((byte) 105));
            }
        }
        if (var6 == 18) {
            class480 var25 = class83.field1327[var7];
            if (var25 != null) {
                class503.field7411 = 2;
                class341.field5247 = 0;
                class40.field528++;
                class90.field1410 = arg0;
                class154.field2338 = arg3;
                class97.method758(class52.field668, false);
                class43.field559.method2726((byte) -21, class49.field630.method1879(82, true) ? 1 : 0);
                class43.field559.method2773((byte) 115, var7);
                class27.method262(0, (byte) -116, true, var25.field6068[0], 0, var25.method2419((byte) 107), -2, var25.field6065[0], var25.method2419((byte) 115));
            }
        }
        if (var6 == 60) {
            class90.field1410 = arg0;
            class154.field2338 = arg3;
            class260.field3871++;
            class341.field5247 = 0;
            class503.field7411 = 2;
            class97.method758(class289.field4321, false);
            class43.field559.method2777((byte) 74, class241.field3358 + var5);
            class43.field559.method2773((byte) 95, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class43.field559.method2742((byte) -51, var4 + class267.field3979);
            class43.field559.method2726((byte) -21, class49.field630.method1879(82, true) ? 1 : 0);
            class52.method391(var5, 105, var4, var8);
        }
        if (var6 == 5) {
            class480 var26 = class83.field1327[var7];
            if (var26 != null) {
                class503.field7411 = 2;
                class154.field2338 = arg3;
                class100.field1524++;
                class341.field5247 = 0;
                class90.field1410 = arg0;
                class97.method758(class76.field1077, false);
                class43.field559.method2726((byte) -21, class49.field630.method1879(82, true) ? 1 : 0);
                class43.field559.method2777((byte) 74, var7);
                class27.method262(0, (byte) -125, true, var26.field6068[0], 0, var26.method2419((byte) 108), -2, var26.field6065[0], var26.method2419((byte) 103));
            }
        }
        if (var6 == 22 && class16.field263 == null) {
            class224.method1408(var4, var5, (byte) -74);
            class16.field263 = class406.method2442((byte) -99, var5, var4);
            class292.method1812(arg1 - 14419, class16.field263);
        }
        if (var6 == 9) {
            class351 var27 = class88.field1375[var7];
            if (var27 != null) {
                class241.field3355++;
                class90.field1410 = arg0;
                class341.field5247 = 0;
                class503.field7411 = 2;
                class154.field2338 = arg3;
                class97.method758(class295.field4419, false);
                class43.field559.method2726((byte) -21, class49.field630.method1879(82, true) ? 1 : 0);
                class43.field559.method2742((byte) 122, var7);
                class27.method262(0, (byte) -125, true, var27.field6068[0], 0, var27.method2419((byte) 119), -2, var27.field6065[0], var27.method2419((byte) 125));
            }
        }
        if (var6 != 17) {
            if (class302.field4504) {
                class312.method1967(-128);
            }
            if (class297.field4426 != null && class347.field5341 == 0) {
                class292.method1812(-14307, class297.field4426);
            }
            return;
        }
        class310 var28 = class406.method2442((byte) -128, var5, var4);
        if (var28 == null) {
            return;
        }
        class312.method1967(-126);
        class399 var29 = client.method3039(var28);
        class195.method1290(var29.method2402(arg1 ^ 0x5270), var28, var29.field5961, (byte) -87);
        class310.field4810 = class300.method1865(false, var28);
        class203.field2970 = var28.field4738 + "<col=ffffff>";
        if (class310.field4810 == null) {
            class310.field4810 = "Null";
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V", line = 791)
    public final void method772(int arg0) {
        field1529++;
        class382 var2 = this.field1532;
        synchronized (this.field1532) {
            this.field1532.method2293(false);
        }
        class382 var3 = this.field1540;
        synchronized (this.field1540) {
            this.field1540.method2293(false);
        }
        class382 var4 = this.field1541;
        synchronized (this.field1541) {
            this.field1541.method2293(false);
            int var5 = 51 % ((arg0 + 18) / 42);
        }
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)V", line = 810)
    public final void method773(int arg0) {
        class382 var2 = this.field1540;
        synchronized (this.field1540) {
            this.field1540.method2293(false);
        }
        field1539++;
        if (arg0 > 81) {
            class382 var3 = this.field1541;
            synchronized (this.field1541) {
                this.field1541.method2293(false);
            }
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)Lup;", line = 826)
    public final class277 method774(int arg0, int arg1) {
        field1528++;
        class382 var3 = this.field1532;
        class277 var4;
        synchronized (this.field1532) {
            var4 = (class277) this.field1532.method2288((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        int var5 = -51 % ((arg1 - 19) / 49);
        class74 var6 = this.field1533;
        byte[] var7;
        synchronized (this.field1533) {
            var7 = this.field1533.method541(class210.method1358(127, arg0), class431.method2550(arg0, (byte) -126), (byte) -122);
        }
        class277 var8 = new class277();
        var8.field4188 = this;
        var8.field4185 = arg0;
        if (var7 != null) {
            var8.method1725(new class468(var7), 158);
        }
        var8.method1726(-124);
        class382 var9 = this.field1532;
        synchronized (this.field1532) {
            this.field1532.method2290((long) arg0, var8, 116);
            return var8;
        }
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(II)V", line = 859)
    public final void method775(int arg0, int arg1) {
        field1537++;
        this.field1542 = arg1;
        class382 var3 = this.field1540;
        synchronized (this.field1540) {
            this.field1540.method2293(false);
        }
        if (arg0 == 14561) {
            class382 var4 = this.field1541;
            synchronized (this.field1541) {
                this.field1541.method2293(false);
            }
        }
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lkr;IZLok;Lok;)V", line = 889)
    public class101(class262 arg0, int arg1, boolean arg2, class74 arg3, class74 arg4) {
        this.field1531 = arg0;
        this.field1538 = arg2;
        this.field1533 = arg3;
        this.field1536 = arg4;
        if (this.field1533 != null) {
            int var6 = this.field1533.method535((byte) 117) - 1;
            this.field1533.method536(false, var6);
        }
    }
}
