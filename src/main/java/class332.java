import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class332 {

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field4832 = 13156520;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "[I")
    public static int[] field4833 = new int[14];

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "[I")
    public static int[] field4827;

    static {
        new class530("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V", line = 15)
    public static void method1986(boolean arg0) {
        if (!arg0) {
            method1988(false, 119);
        }
        field4833 = null;
        field4827 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIB)V", line = 31)
    public static final void method1987(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 < 88) {
            return;
        }
        field4829++;
        if (arg1 == 0) {
            class61.method498(class453.field6341, 1);
            class268.field3909++;
        }
        if (arg1 == 1) {
            class343.field4978++;
            class61.method498(class319.field4620, 1);
        }
        class30.field357.method2375(class345.field5009.method870(82, -128) ? 1 : 0, 3457);
        class30.field357.method2331(32196, arg2 + class441.field6171);
        class30.field357.method2331(32196, arg0 + class367.field5241);
        class243.field3527 = arg2;
        class282.field4153 = arg0;
        class395.field5609 = false;
        class264.method1679(false);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZI)Lbu;", line = 62)
    public static final class17 method1988(boolean arg0, int arg1) {
        field4831++;
        if (arg1 == 0) {
            return new class195();
        } else if (arg1 == 1) {
            return new class524();
        } else if (arg1 == 2) {
            return new class396();
        } else if (arg1 == 3) {
            return new class511();
        } else if (arg1 == 4) {
            return new class518();
        } else if (arg1 == 5) {
            return new class343();
        } else if (arg1 == 6) {
            return new class243();
        } else if (arg1 == 7) {
            return new class345();
        } else if (arg1 == 8) {
            return new class280();
        } else if (arg1 == 9) {
            return new class338();
        } else if (arg1 == 10) {
            return new class413();
        } else if (arg1 == 11) {
            return new class272();
        } else if (arg1 == 12) {
            return new class69();
        } else if (arg1 == 13) {
            return new class310();
        } else if (arg1 == 14) {
            return new class359();
        } else if (arg1 == 15) {
            return new class91();
        } else if (arg1 == 16) {
            return new class541();
        } else if (arg1 == 17) {
            return new class523();
        } else if (arg1 == 18) {
            return new class447();
        } else if (arg1 == 19) {
            return new class68();
        } else if (arg1 == 20) {
            return new class540();
        } else if (arg1 == 21) {
            return new class82();
        } else if (arg1 == 22) {
            return new class519();
        } else if (arg1 == 23) {
            return new class428();
        } else if (arg1 == 24) {
            return new class169();
        } else if (arg1 == 25) {
            return new class220();
        } else if (arg1 == 26) {
            return new class481();
        } else if (arg1 == 27) {
            return new class282();
        } else if (arg1 == 28) {
            return new class315();
        } else if (arg1 == 29) {
            return new class271();
        } else if (arg1 == 30) {
            return new class278();
        } else if (arg1 == 31) {
            return new class402();
        } else if (arg1 == 32) {
            return new class4();
        } else if (arg1 == 33) {
            return new class33();
        } else if (arg1 == 34) {
            return new class184();
        } else if (arg1 == 35) {
            return new class71();
        } else if (arg1 == 36) {
            return new class76();
        } else if (arg1 == 37) {
            return new class255();
        } else if (arg1 == 38) {
            return new class353();
        } else if (arg1 == 39) {
            return new class202();
        } else {
            if (!arg0) {
                method1989((byte) 110);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V", line = 378)
    public static final void method1989(byte arg0) {
        int var1 = -128 % ((arg0 + 23) / 33);
        field4828++;
        class477[] var2 = class38.field412;
        synchronized (class38.field412) {
            for (int var3 = 0; var3 < class38.field412.length; var3++) {
                class38.field412[var3] = new class477();
                class516.field7602[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIII)V", line = 403)
    public static final void method1990(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 6) {
            method1989((byte) 110);
        }
        if (arg3 >= class392.field5514 && arg3 <= class518.field7624) {
            int var5 = class539.method3173(arg1, (byte) 112, class303.field4422, class353.field5062);
            int var6 = class539.method3173(arg4, (byte) 106, class303.field4422, class353.field5062);
            class492.method2860(arg2, arg3, var6, (byte) -93, var5);
        }
        field4830++;
    }
}
