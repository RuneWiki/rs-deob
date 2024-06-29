import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class643 extends class176 {

    @OriginalMember(owner = "client!sw", name = "x", descriptor = "I")
    private int field9341;

    @OriginalMember(owner = "client!sw", name = "o", descriptor = "Z")
    private boolean field9332;

    @OriginalMember(owner = "client!sw", name = "m", descriptor = "I")
    private int field9330;

    @OriginalMember(owner = "client!sw", name = "w", descriptor = "I")
    private int field9340;

    @OriginalMember(owner = "client!sw", name = "A", descriptor = "I")
    private int field9344;

    @OriginalMember(owner = "client!sw", name = "z", descriptor = "I")
    private int field9343;

    @OriginalMember(owner = "client!sw", name = "r", descriptor = "Z")
    private boolean field9335;

    @OriginalMember(owner = "client!sw", name = "u", descriptor = "I")
    private int field9338;

    @OriginalMember(owner = "client!sw", name = "s", descriptor = "I")
    private int field9336;

    @OriginalMember(owner = "client!sw", name = "q", descriptor = "I")
    private int field9334;

    @OriginalMember(owner = "client!sw", name = "n", descriptor = "I")
    public static int field9331;

    @OriginalMember(owner = "client!sw", name = "p", descriptor = "I")
    public static int field9333;

    @OriginalMember(owner = "client!sw", name = "t", descriptor = "I")
    public static int field9337;

    @OriginalMember(owner = "client!sw", name = "v", descriptor = "I")
    public static int field9339;

    @OriginalMember(owner = "client!sw", name = "y", descriptor = "Lev;")
    public static class594 field9342;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(B)V")
    public static final void method3707(byte arg0) {
        field9339++;
        if (arg0 != 91) {
            method3707((byte) -80);
        }
        class422.field5926 = class548.method3124(4, true, 8, 8, 35, 1, 2048, 0.4F);
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)V")
    public static void method3708(int arg0) {
        if (arg0 >= -6) {
            field9342 = null;
        }
        field9342 = null;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Ldaa;I)V")
    public final void method3709(class11 arg0, int arg1) {
        field9337++;
        arg0.method108((byte) -128, 2);
        arg0.method108((byte) -128, this.field9341);
        arg0.method108((byte) -128, this.field9332 ? 1 : 0);
        arg0.method108((byte) -128, this.field9330);
        arg0.method108((byte) -128, this.field9340);
        arg0.method108((byte) -128, this.field9344);
        arg0.method108((byte) -128, this.field9336);
        int var3 = 86 % ((arg1 - 30) / 63);
        arg0.method108((byte) -128, this.field9335 ? 1 : 0);
        arg0.method84(this.field9338, (byte) -103);
        arg0.method108((byte) -128, this.field9343);
        arg0.method88(true, this.field9334);
    }

    @OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(ZLdj;)V")
    public class643(boolean arg0, class288 arg1) {
        if (arg0) {
            if (class288.field3967.startsWith("win")) {
                this.field9341 = 1;
            } else if (class288.field3967.startsWith("mac")) {
                this.field9341 = 2;
            } else if (class288.field3967.startsWith("linux")) {
                this.field9341 = 3;
            } else {
                this.field9341 = 4;
            }
            if (class288.field3972.startsWith("amd64") || class288.field3972.startsWith("x86_64")) {
                this.field9332 = true;
            } else {
                this.field9332 = false;
            }
            if (class288.field3963.toLowerCase().indexOf("sun") != -1) {
                this.field9330 = 1;
            } else if (class288.field3963.toLowerCase().indexOf("microsoft") != -1) {
                this.field9330 = 2;
            } else if (class288.field3963.toLowerCase().indexOf("apple") == -1) {
                this.field9330 = 4;
            } else {
                this.field9330 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (var3 < class288.field3976.length()) {
                    char var5 = class288.field3976.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + (var5 - '0');
                    var3++;
                }
            } catch (Exception var15) {
            }
            this.field9340 = var4;
            int var6 = 0;
            int var7 = class288.field3976.indexOf(46, 2) + 1;
            try {
                while (class288.field3976.length() > var7) {
                    char var8 = class288.field3976.charAt(var7);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var6 = var6 * 10 + (var8 - '0');
                    var7++;
                }
            } catch (Exception var14) {
            }
            this.field9344 = var6;
            int var9 = 0;
            int var10 = class288.field3976.indexOf(95, 4) + 1;
            try {
                while (var10 < class288.field3976.length()) {
                    char var11 = class288.field3976.charAt(var10);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var10++;
                    var9 = var9 * 10 + var11 - 48;
                }
            } catch (Exception var13) {
            }
            if (this.field9340 > 3) {
                this.field9343 = class252.field3493;
            } else {
                this.field9343 = 0;
            }
            if (class288.field3965 == 3) {
                this.field9335 = true;
            } else {
                this.field9335 = false;
            }
            this.field9338 = class366.field4987;
            this.field9336 = var9;
            try {
                this.field9334 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
            } catch (Throwable var12) {
                this.field9334 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "(I)V")
    public static final void method3710(int arg0) {
        field9331++;
        if (class491.field6875.method2597(class103.field1570, 1) != 2) {
            return;
        }
        byte var1 = (byte) (class143.field2215 - 4 & 0xFF);
        int var2 = class143.field2215 % class32.field513;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < class611.field8786; var16++) {
                class485.field6824[var3][var2][var16] = var1;
            }
        }
        if (class206.field2901 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class456.field6425[var4] = -1000000;
            class564.field7811[var4] = 1000000;
            class437.field6208[var4] = 0;
            class587.field8409[var4] = 1000000;
            class340.field4584[var4] = 0;
        }
        if (class107.field1653 == 1) {
            if ((class80.field1299[class206.field2901][class645.field9372.field6037 >> 7][class645.field9372.field6029 >> 7] & 0x4) != 0) {
                class47.method469(class356.field4807, 0, class645.field9372.field6037 >> 7, false, class645.field9372.field6029 >> 7, 127);
            }
            if (class160.field2349 < 2560) {
                int var6 = class563.field7794 >> 7;
                int var7 = class462.field6488 >> 7;
                int var8 = class645.field9372.field6037 >> 7;
                int var9 = class645.field9372.field6029 >> 7;
                int var10;
                if (var8 <= var6) {
                    var10 = var6 - var8;
                } else {
                    var10 = var8 - var6;
                }
                int var11;
                if (var9 <= var7) {
                    var11 = var7 - var9;
                } else {
                    var11 = var9 - var7;
                }
                if (var10 == 0 && var11 == 0 || var10 <= -class32.field513 || var10 >= class32.field513 || (-class611.field8786) >= var11 || var11 >= class611.field8786) {
                    class235.method1474(null, "RC: " + var6 + "," + var7 + " " + var8 + "," + var9 + " " + class519.field7304 + "," + class6.field80, (byte) 115);
                    return;
                }
                if (var11 >= var10) {
                    int var12 = var10 * 65536 / var11;
                    int var13 = 32768;
                    while (var7 != var9) {
                        if (var7 < var9) {
                            var7++;
                        } else if (var7 > var9) {
                            var7--;
                        }
                        if ((class80.field1299[class206.field2901][var6][var7] & 0x4) != 0) {
                            class47.method469(class356.field4807, 1, var6, false, var7, 117);
                            break;
                        }
                        var13 += var12;
                        if (var13 >= 65536) {
                            if (var8 > var6) {
                                var6++;
                            } else if (var8 < var6) {
                                var6--;
                            }
                            var13 -= 65536;
                            if ((class80.field1299[class206.field2901][var6][var7] & 0x4) != 0) {
                                class47.method469(class356.field4807, 1, var6, false, var7, 123);
                                break;
                            }
                        }
                    }
                } else {
                    int var14 = var11 * 65536 / var10;
                    int var15 = 32768;
                    while (var6 != var8) {
                        if (var8 > var6) {
                            var6++;
                        } else if (var8 < var6) {
                            var6--;
                        }
                        if ((class80.field1299[class206.field2901][var6][var7] & 0x4) != 0) {
                            class47.method469(class356.field4807, 1, var6, false, var7, 126);
                            break;
                        }
                        var15 += var14;
                        if (var15 >= 65536) {
                            if (var7 < var9) {
                                var7++;
                            } else if (var7 > var9) {
                                var7--;
                            }
                            var15 -= 65536;
                            if ((class80.field1299[class206.field2901][var6][var7] & 0x4) != 0) {
                                class47.method469(class356.field4807, 1, var6, false, var7, 115);
                                break;
                            }
                        }
                    }
                }
            }
        } else {
            int var5 = class183.method1144(91, class563.field7794, class462.field6488, class206.field2901);
            if (var5 - class117.field1930 < 800 && (class80.field1299[class206.field2901][class563.field7794 >> 7][class462.field6488 >> 7] & 0x4) != 0) {
                class47.method469(class356.field4807, 1, class563.field7794 >> 7, false, class462.field6488 >> 7, 123);
            }
        }
        if (arg0 >= -14) {
            field9333 = 37;
        }
    }
}
