import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class5 {

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public static int field43 = 0;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field39 = -1;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "[I")
    public static int[] field46;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lm;Lqa;I)V")
    public static final void method26(class79 arg0, class129 arg1, int arg2) {
        field40++;
        if (class230.field2945 == null) {
            return;
        }
        if (class412.field5499 < 10) {
            if (!class230.field2946.method1303(class230.field2945.field4172, -24051)) {
                class412.field5499 = class236.field3075.method1322(class230.field2945.field4172, 47) / 10;
                return;
            }
            class188.method1236((byte) -128);
            class412.field5499 = 10;
        }
        if (class412.field5499 == arg2) {
            class230.field2983 = class230.field2945.field4177 >> 6 << 6;
            class230.field2971 = class230.field2945.field4169 >> 6 << 6;
            class230.field2970 = (class230.field2945.field4165 >> 6 << 6) + 64 - class230.field2983;
            class230.field2978 = (class230.field2945.field4171 >> 6 << 6) + 64 - class230.field2971;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class230.field2945.method1934((class37.field573.field6239 >> 7) + class35.field545, class37.field573.field6220, var3, (class37.field573.field6241 >> 7) + class336.field4299, (byte) -91)) {
                var5 = var3[2] - class230.field2971;
                var4 = var3[1] - class230.field2983;
            }
            if (!class96.field1337 && var4 >= 0 && var4 < class230.field2970 && var5 >= 0 && var5 < class230.field2978) {
                int var6 = var5 + ((int) (Math.random() * 10.0D) - 5);
                int var7 = var4 + ((int) (Math.random() * 10.0D) - 5);
                class346.field4413 = var6;
                class267.field3389 = var7;
            } else if (class411.field5490 == -1 || class497.field7327 == -1) {
                class230.field2945.method1936(true, class230.field2945.field4175 >> 14 & 0x3FFF, var3, class230.field2945.field4175 & 0x3FFF);
                class267.field3389 = var3[1] - class230.field2983;
                class346.field4413 = var3[2] - class230.field2971;
            } else {
                class230.field2945.method1936(true, class411.field5490, var3, class497.field7327);
                class96.field1337 = false;
                class497.field7327 = -1;
                class411.field5490 = -1;
                if (var3 != null) {
                    class346.field4413 = var3[2] - class230.field2971;
                    class267.field3389 = var3[1] - class230.field2983;
                }
            }
            if (class230.field2945.field4173 == 37) {
                class230.field2952 = 3.0F;
                class230.field2954 = 3.0F;
            } else if (class230.field2945.field4173 == 50) {
                class230.field2952 = 4.0F;
                class230.field2954 = 4.0F;
            } else if (class230.field2945.field4173 == 75) {
                class230.field2952 = 6.0F;
                class230.field2954 = 6.0F;
            } else if (class230.field2945.field4173 == 100) {
                class230.field2952 = 8.0F;
                class230.field2954 = 8.0F;
            } else if (class230.field2945.field4173 == 200) {
                class230.field2952 = 16.0F;
                class230.field2954 = 16.0F;
            } else {
                class230.field2952 = 8.0F;
                class230.field2954 = 8.0F;
            }
            class230.field2960 = (int) class230.field2952 >> 1;
            class230.field2955 = class370.method2155(class230.field2960, (byte) 11);
            class60.method342((byte) 90);
            class230.method1468();
            class176.field2250 = new class7();
            class230.field2958 += (int) (Math.random() * 5.0D) - 2;
            if (class230.field2958 < -8) {
                class230.field2958 = -8;
            }
            class230.field2956 += (int) (Math.random() * 5.0D) - 2;
            if (class230.field2958 > 8) {
                class230.field2958 = 8;
            }
            if (class230.field2956 < -16) {
                class230.field2956 = -16;
            }
            if (class230.field2956 > 16) {
                class230.field2956 = 16;
            }
            class230.method1462(arg0, class230.field2958 >> 2 << 10, class230.field2956 >> 1);
            class230.field2950.method1089(256, 102, 1024);
            class230.field2949.method1559(256, (byte) 57, 256);
            class230.field2948.method1165(1370821792, 4096);
            class301.field3898.method1524(256, false);
            class412.field5499 = 20;
        } else if (class412.field5499 == 20) {
            class35.method229(true, (byte) 99);
            class230.method1449(arg1, class230.field2958, class230.field2956);
            class412.field5499 = 60;
            class35.method229(true, (byte) 99);
            class324.method1927(arg2 - 10);
        } else if (class412.field5499 == 60) {
            if (class230.field2946.method1293(class230.field2945.field4172 + "_staticelements", -24433)) {
                if (!class230.field2946.method1303(class230.field2945.field4172 + "_staticelements", arg2 - 24061)) {
                    return;
                }
                class230.field2959 = class286.method1735(class230.field2945.field4172 + "_staticelements", class459.field6421, class230.field2946, arg2 ^ 0xFFFFFFF2);
            } else {
                class230.field2959 = new class67(0);
            }
            class230.method1467();
            class412.field5499 = 70;
            class35.method229(true, (byte) 99);
            class324.method1927(arg2 - 10);
        } else if (class412.field5499 == 70) {
            class240.field3103 = new class455(arg1, 11, true, class272.field3454);
            class412.field5499 = 73;
            class35.method229(true, (byte) 99);
            class324.method1927(0);
        } else if (class412.field5499 == 73) {
            class391.field5119 = new class455(arg1, 12, true, class272.field3454);
            class412.field5499 = 76;
            class35.method229(true, (byte) 99);
            class324.method1927(0);
        } else if (class412.field5499 == 76) {
            class163.field2108 = new class455(arg1, 14, true, class272.field3454);
            class412.field5499 = 79;
            class35.method229(true, (byte) 99);
            class324.method1927(arg2 - 10);
        } else if (class412.field5499 == 79) {
            class216.field2774 = new class455(arg1, 17, true, class272.field3454);
            class412.field5499 = 82;
            class35.method229(true, (byte) 99);
            class324.method1927(0);
        } else if (class412.field5499 == 82) {
            class162.field2104 = new class455(arg1, 19, true, class272.field3454);
            class412.field5499 = 85;
            class35.method229(true, (byte) 99);
            class324.method1927(0);
        } else if (class412.field5499 == 85) {
            class527.field7784 = new class455(arg1, 22, true, class272.field3454);
            class412.field5499 = 88;
            class35.method229(true, (byte) 99);
            class324.method1927(0);
        } else if (class412.field5499 == 88) {
            class448.field6230 = new class455(arg1, 26, true, class272.field3454);
            class412.field5499 = 91;
            class35.method229(true, (byte) 99);
            class324.method1927(arg2 ^ 0xA);
        } else {
            class46.field672 = new class455(arg1, 30, true, class272.field3454);
            class412.field5499 = 100;
            class35.method229(true, (byte) 99);
            class324.method1927(0);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IB)Z")
    public static final boolean method27(int arg0, byte arg1) {
        field42++;
        if (arg0 == 15 || arg0 == 51 || arg0 == 9 || arg0 == 17 || arg0 == 47) {
            return true;
        } else {
            if (arg1 < 86) {
                field45 = -37;
            }
            return arg0 == 16 || arg0 == 1012;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IJ)V")
    public static final void method28(int arg0, long arg1) {
        try {
            if (arg0 != 1024) {
                field46 = null;
            }
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        field44++;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(IB)V")
    public static final void method29(int arg0, byte arg1) {
        class246.field3149 = -1;
        class181.field2366 = 100;
        class196.field2536 = arg0;
        field41++;
        if (arg1 < 66) {
            method28(-50, 26L);
        }
        class407.field5459 = 3;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)V")
    public static void method30(boolean arg0) {
        field46 = null;
        if (!arg0) {
            field43 = 34;
        }
    }

    static {
        new class169("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
        field46 = new int[25];
    }
}
