import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class46 extends class40 {

    @OriginalMember(owner = "client!u", name = "P", descriptor = "Lpm;")
    public static class349 field613;

    @OriginalMember(owner = "client!u", name = "K", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!u", name = "L", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!u", name = "M", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!u", name = "N", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!u", name = "O", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!u", name = "R", descriptor = "Z")
    public static boolean field615;

    static {
        new class349("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field613 = new class349(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");
    }

    @OriginalMember(owner = "client!u", name = "h", descriptor = "(B)V", line = 3)
    public static void method299(byte arg0) {
        field613 = null;
        int var1 = 51 % ((-45 - arg0) / 56);
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V", line = 12)
    public static final void method300(int arg0) {
        class407.field5761.method2048(2040, arg0);
        ++class349.field5077;
        ++field608;
        class407.field5761.method799(class306.field4472, -83);
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(III)I", line = 22)
    private final int method301(int arg0, int arg1, int arg2) {
        int var4 = -36 / ((arg2 - 27) / 48);
        ++field610;
        int var5 = arg1 * 57 + arg0;
        int var6 = var5 ^ var5 << 1;
        return -(((var6 * var6 * 15731 + 789221) * var6 - -1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)[I", line = 35)
    public final int[] method44(byte arg0, int arg1) {
        ++field612;
        int[] var3 = super.field551.method185(65280, arg1);
        if (arg0 >= -20) {
            method304((class269) null, (byte) 88, (class211) null);
        }
        if (super.field551.field441) {
            int var4 = class86.field1123[arg1];
            for (int var5 = 0; ~var5 > ~class410.field5886; ++var5) {
                var3[var5] = this.method301(class9.field124[var5], var4, -96) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!u", name = "i", descriptor = "(B)V", line = 67)
    public static final void method302(byte arg0) {
        ++field614;
        if (!class296.method2000((byte) -36) && ~class40.field558 != ~class158.field2302) {
            class54.method348(class181.field2555.field4595[0], false, class171.field2415, class327.field4741, false, true, class158.field2302, class181.field2555.field4601[0]);
        } else {
            class341.method2236(true, class59.field786);
            if (~class431.field6176 != ~class158.field2302) {
                class87.method521(110);
            }
            if (arg0 != -65) {
                field615 = false;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(I)V", line = 88)
    public static final void method303(int arg0) {
        ++field611;
        class15 var1 = class44.field592;
        synchronized (class44.field592) {
            class44.field592.method102((byte) -99);
        }
        if (arg0 < 76) {
            field613 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V", line = 102)
    public class46() {
        super(0, true);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lvq;BLbk;)V", line = 114)
    public static final void method304(class269 arg0, byte arg1, class211 arg2) {
        ++field609;
        if (class176.field2463 != null) {
            if (arg1 < 22) {
                field613 = null;
            }
            if (~class284.field4121 > -11) {
                if (!class176.field2461.method636(class176.field2463.field2432, (byte) 116)) {
                    class284.field4121 = class284.field4140.method640(class176.field2463.field2432, (byte) 104) / 10;
                    return;
                }
                class270.method1851((byte) -50);
                class284.field4121 = 10;
            }
            if (~class284.field4121 == -11) {
                class176.field2486 = class176.field2463.field2443 >> 6 << 6;
                class176.field2493 = class176.field2463.field2428 >> 6 << 6;
                class176.field2494 = (class176.field2463.field2436 >> 6 << 6) + -class176.field2486 - -64;
                class176.field2492 = (class176.field2463.field2444 >> 6 << 6) + -class176.field2493 + 64;
                int[] var3 = new int[3];
                int var4 = -1;
                int var5 = -1;
                if (class176.field2463.method1229((byte) 57, var3, (class181.field2555.field4463 >> 7) + class306.field4459, class158.field2302, (class181.field2555.field4466 >> 7) + class342.field4959)) {
                    var4 = var3[1] + -class176.field2486;
                    var5 = var3[2] + -class176.field2493;
                }
                if (!class444.field6346 && ~var4 <= -1 && ~var4 > ~class176.field2494 && ~var5 <= -1 && ~var5 > ~class176.field2492) {
                    int var6 = var4 + ((int) (Math.random() * 10.0D) - 5);
                    int var7 = var5 + ((int) (10.0D * Math.random()) - 5);
                    class170.field2407 = var6;
                    class175.field2459 = var7;
                } else if (~class425.field6082 != 0 && class425.field6078 != -1) {
                    class176.field2463.method1236(5173, class425.field6078, class425.field6082, var3);
                    class444.field6346 = false;
                    class425.field6078 = -1;
                    class425.field6082 = -1;
                    if (var3 != null) {
                        class175.field2459 = var3[2] + -class176.field2493;
                        class170.field2407 = var3[1] - class176.field2486;
                    }
                } else {
                    class176.field2463.method1236(5173, class176.field2463.field2441 & 16383, 16383 & class176.field2463.field2441 >> 14, var3);
                    class175.field2459 = var3[2] - class176.field2493;
                    class170.field2407 = var3[1] + -class176.field2486;
                }
                if (class176.field2463.field2437 != 37) {
                    if (~class176.field2463.field2437 == -51) {
                        class176.field2468 = 4.0F;
                        class176.field2471 = 4.0F;
                    } else if (class176.field2463.field2437 == 75) {
                        class176.field2468 = 6.0F;
                        class176.field2471 = 6.0F;
                    } else if (class176.field2463.field2437 == 100) {
                        class176.field2468 = 8.0F;
                        class176.field2471 = 8.0F;
                    } else if (class176.field2463.field2437 == 200) {
                        class176.field2468 = 16.0F;
                        class176.field2471 = 16.0F;
                    } else {
                        class176.field2468 = 8.0F;
                        class176.field2471 = 8.0F;
                    }
                } else {
                    class176.field2468 = 3.0F;
                    class176.field2471 = 3.0F;
                }
                class176.field2466 = (int) class176.field2468 >> 1;
                class176.field2464 = class425.method2661(class176.field2466, (byte) 4);
                class177.method1267((byte) 103);
                class176.method1250();
                class301.field4388 = new class442();
                class176.field2467 += (int) (5.0D * Math.random()) + -2;
                if (class176.field2467 < -8) {
                    class176.field2467 = -8;
                }
                class176.field2470 += -2 + (int) (Math.random() * 5.0D);
                if (class176.field2467 > 8) {
                    class176.field2467 = 8;
                }
                if (~class176.field2470 > 15) {
                    class176.field2470 = -16;
                }
                if (class176.field2470 > 16) {
                    class176.field2470 = 16;
                }
                class176.method1259(arg2, class176.field2467 >> 2 << 10, class176.field2470 >> 1);
                class235.method1617(1024, 256, 10578);
                class448.method2793(256, -7907, 256);
                class228.method1587(-4299, 4096);
                class434.method2711(103, 256);
                class284.field4121 = 20;
            } else if (class284.field4121 == 20) {
                class6.method31((byte) 50, true);
                class176.method1263(arg0, class176.field2467, class176.field2470);
                class284.field4121 = 60;
                class6.method31((byte) 80, true);
                class380.method2424(9356);
            } else if (class284.field4121 == 60) {
                if (class176.field2461.method641(0, class176.field2463.field2432 + "_staticelements")) {
                    if (!class176.field2461.method636(class176.field2463.field2432 + "_staticelements", (byte) 107)) {
                        return;
                    }
                    class176.field2465 = client.method1173(class311.field4503, class176.field2463.field2432 + "_staticelements", 8, class176.field2461);
                } else {
                    class176.field2465 = new class30(0);
                }
                class176.method1247();
                class284.field4121 = 70;
                class6.method31((byte) 75, true);
                class380.method2424(9356);
            } else if (~class284.field4121 == -71) {
                class288.field4199 = new class400(arg0, 11, true, class117.field1588);
                class284.field4121 = 73;
                class6.method31((byte) 115, true);
                class380.method2424(9356);
            } else if (class284.field4121 == 73) {
                class63.field844 = new class400(arg0, 12, true, class117.field1588);
                class284.field4121 = 76;
                class6.method31((byte) 37, true);
                class380.method2424(9356);
            } else if (~class284.field4121 == -77) {
                class206.field2915 = new class400(arg0, 14, true, class117.field1588);
                class284.field4121 = 79;
                class6.method31((byte) 97, true);
                class380.method2424(9356);
            } else if (class284.field4121 == 79) {
                class413.field5912 = new class400(arg0, 17, true, class117.field1588);
                class284.field4121 = 82;
                class6.method31((byte) 28, true);
                class380.method2424(9356);
            } else if (class284.field4121 == 82) {
                class341.field4930 = new class400(arg0, 19, true, class117.field1588);
                class284.field4121 = 85;
                class6.method31((byte) 94, true);
                class380.method2424(9356);
            } else if (class284.field4121 == 85) {
                class147.field2199 = new class400(arg0, 22, true, class117.field1588);
                class284.field4121 = 88;
                class6.method31((byte) 103, true);
                class380.method2424(9356);
            } else if (class284.field4121 == 88) {
                class338.field4896 = new class400(arg0, 26, true, class117.field1588);
                class284.field4121 = 91;
                class6.method31((byte) 39, true);
                class380.method2424(9356);
            } else {
                class214.field3068 = new class400(arg0, 30, true, class117.field1588);
                class284.field4121 = 100;
                class6.method31((byte) 121, true);
                class380.method2424(9356);
                System.gc();
            }
        }
    }
}
