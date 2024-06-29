import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class133 extends class156 {

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "Lof;")
    public class145 field2517 = new class145();

    @OriginalMember(owner = "client!nd", name = "X", descriptor = "Lld;")
    public class113 field2530 = new class113();

    @OriginalMember(owner = "client!nd", name = "W", descriptor = "Lbb;")
    private class13 field2529;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "Lrd;")
    private static class173 field2511 = method843("Please wait 1 minute and try again)3", 10);

    @OriginalMember(owner = "client!nd", name = "K", descriptor = "Lrd;")
    private static class173 field2519 = method843(" has logged in)3", -87);

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "Lrd;")
    public static class173 field2510 = method843("sl_back", -110);

    @OriginalMember(owner = "client!nd", name = "N", descriptor = "I")
    public static int field2521 = 1;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "Lrd;")
    public static class173 field2506 = method843("jlv", 32);

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "Lrd;")
    public static class173 field2505 = field2511;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "Lrd;")
    private static class173 field2514 = method843("Continue", -86);

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "Lrd;")
    private static class173 field2508 = method843("as it was used to break our rules)3", -110);

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "I")
    public static int field2512 = 0;

    @OriginalMember(owner = "client!nd", name = "U", descriptor = "Lrd;")
    public static class173 field2527 = field2519;

    @OriginalMember(owner = "client!nd", name = "V", descriptor = "Lrd;")
    public static class173 field2528 = field2514;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "Lrd;")
    public static class173 field2507 = field2511;

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "Lrd;")
    public static class173 field2513 = field2508;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!nd", name = "O", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!nd", name = "Q", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!nd", name = "R", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!nd", name = "S", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!nd", name = "Y", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!nd", name = "Z", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!nd", name = "P", descriptor = "Lra;")
    public static class170 field2523;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V")
    public static final void method842(byte arg0) {
        field2516++;
        if (arg0 != -49) {
            method847((byte) 5);
        }
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class195.field3792 - 1; var2++) {
                if (class179.field3526[var2] < 1000 && class179.field3526[var2 + 1] > 1000) {
                    class173 var3 = class21.field461[var2];
                    var1 = false;
                    class21.field461[var2] = class21.field461[var2 + 1];
                    class21.field461[var2 + 1] = var3;
                    class173 var4 = class167.field3231[var2];
                    class167.field3231[var2] = class167.field3231[var2 + 1];
                    class167.field3231[var2 + 1] = var4;
                    int var5 = class80.field1577[var2];
                    class80.field1577[var2] = class80.field1577[var2 + 1];
                    class80.field1577[var2 + 1] = var5;
                    int var6 = class22.field492[var2];
                    class22.field492[var2] = class22.field492[var2 + 1];
                    class22.field492[var2 + 1] = var6;
                    short var7 = class179.field3526[var2];
                    class179.field3526[var2] = class179.field3526[var2 + 1];
                    class179.field3526[var2 + 1] = var7;
                    long var8 = class198.field3862[var2];
                    class198.field3862[var2] = class198.field3862[var2 + 1];
                    class198.field3862[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/lang/String;I)Lrd;")
    public static final class173 method843(String arg0, int arg1) {
        field2518++;
        byte[] var2 = arg0.getBytes();
        int var3 = 0;
        int var4 = -79 % ((-arg1 - 28) / 38);
        int var5 = var2.length;
        class173 var6 = new class173();
        var6.field3415 = new byte[var5];
        while (var5 > var3) {
            int var7 = var2[var3++] & 0xFF;
            if (var7 <= 45 && var7 >= 40) {
                if (var5 <= var3) {
                    break;
                }
                int var8 = var2[var3++] & 0xFF;
                var6.field3415[var6.field3379++] = (byte) (var7 * 43 + var8 - 1720 - 48);
            } else if (var7 != 0) {
                var6.field3415[var6.field3379++] = (byte) var7;
            }
        }
        var6.method1130(true);
        return var6.method1116((byte) -76);
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V")
    public final void method91(int arg0) {
        this.field2530.method91(arg0);
        for (class60 var2 = (class60) this.field2517.method915(-1); var2 != null; var2 = (class60) this.field2517.method910((byte) 88)) {
            if (!this.field2529.method88(var2, 0)) {
                int var3 = arg0;
                do {
                    if (var2.field1193 >= var3) {
                        this.method845(var2, 1048575, var3);
                        var2.field1193 -= var3;
                        break;
                    }
                    this.method845(var2, 1048575, var2.field1193);
                    var3 -= var2.field1193;
                } while (!this.field2529.method114(var2, var3, 0, 2, null));
            }
        }
        field2524++;
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)V")
    public static final void method844(int arg0) {
        field2526++;
        int var1 = class9.field171 * 128 + 64;
        int var2 = class78.field1509 * 128 + 64;
        int var3 = class56.method361(class172.field3347, var1, (byte) -74, var2) - class182.field3563;
        if (var3 > class168.field3246) {
            class168.field3246 += class55.field1102 + (var3 - class168.field3246) * class207.field4029 / 1000;
            if (var3 < class168.field3246) {
                class168.field3246 = var3;
            }
        }
        if (class97.field1778 < var1) {
            class97.field1778 += (var1 - class97.field1778) * class207.field4029 / 1000 + class55.field1102;
            if (class97.field1778 > var1) {
                class97.field1778 = var1;
            }
        }
        if (class168.field3246 > var3) {
            class168.field3246 -= class55.field1102 + (class168.field3246 - var3) * class207.field4029 / 1000;
            if (var3 > class168.field3246) {
                class168.field3246 = var3;
            }
        }
        if (class62.field1225 < var2) {
            class62.field1225 += (var2 - class62.field1225) * class207.field4029 / 1000 + class55.field1102;
            if (class62.field1225 > var2) {
                class62.field1225 = var2;
            }
        }
        if (class97.field1778 > var1) {
            class97.field1778 -= class55.field1102 + (class97.field1778 - var1) * class207.field4029 / 1000;
            if (var1 > class97.field1778) {
                class97.field1778 = var1;
            }
        }
        if (var2 < class62.field1225) {
            class62.field1225 -= (class62.field1225 - var2) * class207.field4029 / 1000 + class55.field1102;
            if (class62.field1225 < var2) {
                class62.field1225 = var2;
            }
        }
        int var4 = class34.field743 * 128 + 64;
        int var5 = class35.field766 * 128 + 64;
        int var6 = class56.method361(class172.field3347, var5, (byte) 113, var4) - class19.field410;
        int var7 = var4 - class62.field1225;
        int var8 = var5 - class97.field1778;
        int var9 = var6 - class168.field3246;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var8 * var8));
        int var11 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var7, (double) var8)) & 0x7FF;
        int var13 = var12 - class183.field3595;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var11 > class186.field3635) {
            class186.field3635 += (var11 - class186.field3635) * class75.field1479 / 1000 + class64.field1254;
            if (var11 < class186.field3635) {
                class186.field3635 = var11;
            }
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var11 < class186.field3635) {
            class186.field3635 -= class64.field1254 + (class186.field3635 - var11) * class75.field1479 / 1000;
            if (var11 > class186.field3635) {
                class186.field3635 = var11;
            }
        }
        if (arg0 < var13) {
            class183.field3595 += class75.field1479 * var13 / 1000 + class64.field1254;
            class183.field3595 &= 0x7FF;
        }
        if (var13 < 0) {
            class183.field3595 -= class64.field1254 + -var13 * class75.field1479 / 1000;
            class183.field3595 &= 0x7FF;
        }
        int var14 = var12 - class183.field3595;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class183.field3595 = var12;
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "()Lpg;")
    public final class156 method116() {
        field2520++;
        class60 var1;
        do {
            var1 = (class60) this.field2517.method910((byte) 88);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1180 == null);
        return var1.field1180;
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "()Lpg;")
    public final class156 method101() {
        class60 var1 = (class60) this.field2517.method915(-1);
        field2515++;
        if (var1 == null) {
            return null;
        } else if (var1.field1180 == null) {
            return this.method116();
        } else {
            return var1.field1180;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lfi;II)V")
    private final void method845(class60 arg0, int arg1, int arg2) {
        field2532++;
        if (arg1 != 1048575) {
            this.method108(null, 17, 74);
        }
        if ((this.field2529.field253[arg0.field1200] & 0x4) != 0 && arg0.field1176 < 0) {
            int var4 = this.field2529.field245[arg0.field1200] / class52.field1072;
            int var5 = (var4 + 1048575 - arg0.field1190) / var4;
            arg0.field1190 = arg2 * var4 + arg0.field1190 & 0xFFFFF;
            if (arg2 >= var5) {
                if (this.field2529.field271[arg0.field1200] == 0) {
                    arg0.field1180 = class146.method946(arg0.field1198, arg0.field1180.method928(), arg0.field1180.method964(), arg0.field1180.method966());
                } else {
                    arg0.field1180 = class146.method946(arg0.field1198, arg0.field1180.method928(), 0, arg0.field1180.method966());
                    this.field2529.method104(arg0, arg0.field1183.field3769[arg0.field1185] < 0, true);
                }
                if (arg0.field1183.field3769[arg0.field1185] < 0) {
                    arg0.field1180.method944(-1);
                }
                arg2 = arg0.field1190 / var4;
            }
        }
        arg0.field1180.method91(arg2);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II[IIILfi;)V")
    private final void method846(int arg0, int arg1, int[] arg2, int arg3, int arg4, class60 arg5) {
        field2531++;
        if ((this.field2529.field253[arg5.field1200] & 0x4) != 0 && arg5.field1176 < 0) {
            int var7 = this.field2529.field245[arg5.field1200] / class52.field1072;
            while (true) {
                int var8 = (var7 + 1048575 - arg5.field1190) / var7;
                if (var8 > arg1) {
                    arg5.field1190 += arg1 * var7;
                    break;
                }
                arg1 -= var8;
                int var9 = 262144 / var7;
                arg5.field1180.method108(arg2, arg0, var8);
                int var10 = class52.field1072 / 100;
                if (var10 > var9) {
                    var10 = var9;
                }
                class146 var11 = arg5.field1180;
                arg0 += var8;
                arg5.field1190 += var7 * var8 - 1048576;
                if (this.field2529.field271[arg5.field1200] == 0) {
                    arg5.field1180 = class146.method946(arg5.field1198, var11.method928(), var11.method964(), var11.method966());
                } else {
                    arg5.field1180 = class146.method946(arg5.field1198, var11.method928(), 0, var11.method966());
                    this.field2529.method104(arg5, arg5.field1183.field3769[arg5.field1185] < 0, true);
                    arg5.field1180.method938(var10, var11.method964());
                }
                if (arg5.field1183.field3769[arg5.field1185] < 0) {
                    arg5.field1180.method944(-1);
                }
                var11.method941(var10);
                var11.method108(arg2, arg0, arg4 - arg0);
                if (var11.method947()) {
                    this.field2530.method685(var11);
                }
            }
        }
        arg5.field1180.method108(arg2, arg0, arg1);
        if (arg3 <= 93) {
            field2513 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([III)V")
    public final void method108(int[] arg0, int arg1, int arg2) {
        this.field2530.method108(arg0, arg1, arg2);
        field2522++;
        for (class60 var4 = (class60) this.field2517.method915(-1); var4 != null; var4 = (class60) this.field2517.method910((byte) 88)) {
            if (!this.field2529.method88(var4, 0)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field1193) {
                        this.method846(var6, var5, arg0, 122, var5 + var6, var4);
                        var4.field1193 -= var5;
                        break;
                    }
                    this.method846(var6, var4.field1193, arg0, 120, var5 + var6, var4);
                    var5 -= var4.field1193;
                    var6 += var4.field1193;
                } while (!this.field2529.method114(var4, var5, var6, 2, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)V")
    public static void method847(byte arg0) {
        int var1 = 21 / ((arg0 + 46) / 44);
        field2528 = null;
        field2519 = null;
        field2514 = null;
        field2523 = null;
        field2513 = null;
        field2507 = null;
        field2506 = null;
        field2510 = null;
        field2511 = null;
        field2527 = null;
        field2508 = null;
        field2505 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lbc;II)Lsa;")
    public static final class180 method848(class14 arg0, int arg1, int arg2) {
        if (arg2 == -1) {
            field2525++;
            return class80.method497(30, arg0, arg1) ? class155.method1020(true) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "()I")
    public final int method115() {
        field2509++;
        return 0;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lbb;)V")
    public class133(class13 arg0) {
        this.field2529 = arg0;
    }
}
