import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class363 {

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
    private int field4909 = 0;

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "Z")
    public boolean field4911 = true;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
    public int field4906 = -1;

    @OriginalMember(owner = "client!hr", name = "r", descriptor = "I")
    public int field4920 = 128;

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "Lsl;")
    public static class317 field4913 = new class317("", 11);

    @OriginalMember(owner = "client!hr", name = "t", descriptor = "[I")
    public static int[] field4922;

    @OriginalMember(owner = "client!hr", name = "s", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!hr", name = "q", descriptor = "F")
    public static float field4919;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
    public int field4904;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
    public int field4905;

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "I")
    public int field4907;

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "I")
    public int field4910;

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!hr", name = "m", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!hr", name = "n", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!hr", name = "o", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!hr", name = "p", descriptor = "I")
    public static int field4918;

    static {
        new class304("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
        field4922 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };
        field4921 = 0;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IB)V", line = 6)
    private final void method2113(int arg0, byte arg1) {
        field4903++;
        double var3 = (double) ((arg0 & 0xFFF277) >> 16) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        if (arg1 != 2) {
            this.field4904 = 26;
        }
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field4905 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field4910 = (int) (var15 * 256.0D);
        if (var17 > 0.5D) {
            this.field4907 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field4907 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field4905 < 0) {
            this.field4905 = 0;
        } else if (this.field4905 > 255) {
            this.field4905 = 255;
        }
        if (this.field4910 < 0) {
            this.field4910 = 0;
        } else if (this.field4910 > 255) {
            this.field4910 = 255;
        }
        if (this.field4907 < 1) {
            this.field4907 = 1;
        }
        this.field4904 = (int) ((double) this.field4907 * var19);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIII)V", line = 97)
    public static final void method2114(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4918++;
        class60.field945 = arg0;
        class315.field4134 = arg2;
        class40.field606 = arg3;
        class154.field2242 = arg4;
        if (arg1 <= 105) {
            return;
        }
        class31.field511 = arg5;
        if (class60.field945 >= 100) {
            int var6 = class31.field511 * 128 + 64;
            int var7 = class315.field4134 * 128 + 64;
            int var8 = class210.method1330(class411.field5656, (byte) -60, var6, var7) - class40.field606;
            int var9 = var6 - class430.field5888;
            int var10 = var8 - class365.field4937;
            int var11 = var7 - class168.field2438;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + (var11 * var11)));
            class168.field2439 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class207.field2854 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 0x3FFF;
            if (class168.field2439 < 1024) {
                class168.field2439 = 1024;
            }
            class47.field699 = 0;
            if (class168.field2439 > 3072) {
                class168.field2439 = 3072;
            }
        }
        class42.field623 = 2;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Z)V", line = 153)
    public static void method2115(boolean arg0) {
        if (arg0) {
            method2115(true);
        }
        field4922 = null;
        field4913 = null;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILjava/util/Random;Z)I", line = 169)
    public static final int method2116(int arg0, Random arg1, boolean arg2) {
        field4912++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        }
        if (!arg2) {
            field4921 = -113;
        }
        if (class227.method1418((byte) -123, arg0)) {
            return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
        }
        int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg0));
        int var4;
        do {
            var4 = arg1.nextInt();
        } while (var4 >= var3);
        return class175.method1176(-1, var4, arg0);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIII)V", line = 204)
    public static final void method2117(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4915++;
        if (arg3 < arg4) {
            for (int var5 = arg3; var5 < arg4; var5++) {
                class457.field6299[var5][arg0] = arg2;
            }
        } else {
            for (int var6 = arg4; var6 < arg3; var6++) {
                class457.field6299[var6][arg0] = arg2;
            }
        }
        if (arg1 > -16) {
            method2119(false, 108, 77);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IILmd;)V", line = 243)
    private final void method2118(int arg0, int arg1, class379 arg2) {
        field4916++;
        int var4 = 86 % ((75 - arg0) / 36);
        if (arg1 == 1) {
            this.field4909 = arg2.method2249((byte) 70);
            this.method2113(this.field4909, (byte) 2);
        } else if (arg1 == 2) {
            this.field4906 = arg2.method2212((byte) 83);
            if (this.field4906 == 65535) {
                this.field4906 = -1;
                return;
            }
        } else if (arg1 == 3) {
            this.field4920 = arg2.method2212((byte) 83) << 0;
        } else if (arg1 == 4) {
            this.field4911 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZII)Z", line = 279)
    public static final boolean method2119(boolean arg0, int arg1, int arg2) {
        field4917++;
        if (arg0) {
            return false;
        } else {
            return (arg1 & 0x20) != 0;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 290)
    public static final boolean method2120(int arg0, String arg1) {
        field4908++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class267.field3528; var2++) {
            if (arg1.equalsIgnoreCase(class471.field6485[var2])) {
                return true;
            }
        }
        if (arg1.equalsIgnoreCase(class385.field5232.field7638)) {
            return true;
        } else {
            if (arg0 != -18228) {
                method2116(44, null, false);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(BLmd;)V", line = 326)
    public final void method2121(byte arg0, class379 arg1) {
        field4914++;
        if (arg0 != -33) {
            this.field4905 = 82;
        }
        while (true) {
            int var3 = arg1.method2238(255);
            if (var3 == 0) {
                return;
            }
            this.method2118(-113, var3, arg1);
        }
    }
}
