import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class546 {

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
    private int field7479 = 0;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "[Ljca;")
    public class45[] field7460;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public int field7468;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field7461;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field7462;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field7463;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field7464;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field7465;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public static int field7469;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public static int field7470;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public static int field7471;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public static int field7472;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    public static int field7473;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public static int field7475;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
    public static int field7478;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
    public static int field7480;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "J")
    private long field7476;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "Ljca;")
    private class45 field7474;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "Ljca;")
    private class45 field7477;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "Lq;")
    public static class487 field7466;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "Lhq;")
    public static class552 field7467;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILjava/lang/String;)V", line = 5)
    public static final void method3051(int arg0, String arg1) {
        field7480++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class55.method328(arg1, (byte) -64);
        if (var2 == null) {
            return;
        }
        int var3 = -9 % ((arg0 - 43) / 39);
        for (int var4 = 0; var4 < class427.field5757; var4++) {
            String var5 = class82.field948[var4];
            if (var5.startsWith("*")) {
                var5 = var5.substring(1);
            }
            String var6 = class55.method328(var5, (byte) -64);
            if (var6 != null && var6.equals(var2)) {
                class427.field5757--;
                for (int var7 = var4; var7 < class427.field5757; var7++) {
                    class82.field948[var7] = class82.field948[var7 + 1];
                    class292.field3854[var7] = class292.field3854[var7 + 1];
                    class358.field4767[var7] = class358.field4767[var7 + 1];
                    class143.field1936[var7] = class143.field1936[var7 + 1];
                    class126.field1762[var7] = class126.field1762[var7 + 1];
                    class199.field2701[var7] = class199.field2701[var7 + 1];
                }
                class364.field4809++;
                class303.field4026 = class155.field2183;
                class229 var8 = class97.method550(class71.field841, false, class680.field9651);
                var8.field2971.method915(-31914, class206.method1313((byte) 123, arg1));
                var8.field2971.method936(arg1, -60);
                class307.method1805(var8, -14704);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I[Ljca;)I", line = 69)
    public final int method3052(int arg0, class45[] arg1) {
        field7478++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field7468; var4++) {
            class45 var5 = this.field7460[var4];
            for (class45 var6 = var5.field548; var6 != var5; var6 = var6.field548) {
                arg1[var3++] = var6;
            }
        }
        if (arg0 == 13534) {
            return var3;
        } else {
            return 120;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)Ljca;", line = 100)
    public final class45 method3053(byte arg0) {
        this.field7479 = 0;
        field7475++;
        if (arg0 < 46) {
            this.field7474 = null;
        }
        return this.method3056(18113);
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)I", line = 112)
    public final int method3054(byte arg0) {
        field7464++;
        int var2 = 56 / ((44 - arg0) / 63);
        return this.field7468;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "([IBI[ILag;I)Lpo;", line = 122)
    public static final class516 method3055(int[] arg0, byte arg1, int arg2, int[] arg3, class469 arg4, int arg5) {
        field7471++;
        byte[] var6 = new byte[arg2 * arg5];
        int var7 = 0;
        if (arg1 < 47) {
            field7466 = null;
        }
        while (arg2 > var7) {
            int var8 = arg5 * var7 + arg3[var7];
            for (int var9 = 0; var9 < arg0[var7]; var9++) {
                var6[var8++] = -1;
            }
            var7++;
        }
        return new class516(arg4, arg5, arg2, var6);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)Ljca;", line = 152)
    public final class45 method3056(int arg0) {
        if (arg0 != 18113) {
            this.method3061(30, -7L, null);
        }
        field7469++;
        if (this.field7479 > 0 && this.field7460[this.field7479 - 1] != this.field7477) {
            class45 var2 = this.field7477;
            this.field7477 = var2.field548;
            return var2;
        }
        while (this.field7468 > this.field7479) {
            class45 var3 = this.field7460[this.field7479++].field548;
            if (this.field7460[this.field7479 - 1] != var3) {
                this.field7477 = var3.field548;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IJ)Ljca;", line = 191)
    public final class45 method3057(int arg0, long arg1) {
        this.field7476 = arg1;
        field7470++;
        class45 var4 = this.field7460[(int) ((long) (this.field7468 - 1) & arg1)];
        if (arg0 != 1) {
            method3055(null, (byte) 32, -79, null, null, -14);
        }
        for (this.field7474 = var4.field548; this.field7474 != var4; this.field7474 = this.field7474.field548) {
            if (this.field7474.field545 == arg1) {
                class45 var5 = this.field7474;
                this.field7474 = this.field7474.field548;
                return var5;
            }
        }
        this.field7474 = null;
        return null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILag;ZII[I)Lck;", line = 221)
    public static final class8 method3058(int arg0, class469 arg1, boolean arg2, int arg3, int arg4, int[] arg5) {
        field7462++;
        int var6 = -5 / ((-arg3 - 55) / 62);
        if (!arg1.field6462 && (!class355.method2093(arg0, 1) || !class355.method2093(arg4, 1))) {
            return arg1.field6459 ? new class8(arg1, 34037, arg0, arg4, arg2, arg5) : new class8(arg1, arg0, arg4, class385.method2206(0, arg0), class385.method2206(0, arg4), arg5);
        } else {
            return new class8(arg1, 3553, arg0, arg4, arg2, arg5);
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V", line = 242)
    public static void method3059(byte arg0) {
        field7466 = null;
        field7467 = null;
        if (arg0 != -113) {
            method3055(null, (byte) -16, 47, null, null, -89);
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)I", line = 257)
    public final int method3060(int arg0) {
        field7465++;
        int var2 = 0;
        for (int var3 = arg0; var3 < this.field7468; var3++) {
            class45 var4 = this.field7460[var3];
            class45 var5 = var4.field548;
            while (var4 != var5) {
                var5 = var5.field548;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IJLjca;)V", line = 287)
    public final void method3061(int arg0, long arg1, class45 arg2) {
        field7463++;
        if (arg2.field547 != null) {
            arg2.method242(true);
        }
        class45 var5 = this.field7460[(int) ((long) (this.field7468 - 1) & arg1)];
        arg2.field547 = var5.field547;
        arg2.field548 = var5;
        arg2.field547.field548 = arg2;
        arg2.field545 = arg1;
        arg2.field548.field547 = arg2;
        if (arg0 < 122) {
            this.field7476 = -97L;
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)Ljca;", line = 313)
    public final class45 method3062(int arg0) {
        field7473++;
        if (this.field7474 == null) {
            return null;
        }
        class45 var2 = this.field7460[(int) (this.field7476 & (long) (this.field7468 - 1))];
        int var3 = -91 / ((-arg0 - 56) / 61);
        while (this.field7474 != var2) {
            if (this.field7474.field545 == this.field7476) {
                class45 var4 = this.field7474;
                this.field7474 = this.field7474.field548;
                return var4;
            }
            this.field7474 = this.field7474.field548;
        }
        this.field7474 = null;
        return null;
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)V", line = 343)
    public final void method3063(byte arg0) {
        for (int var2 = 0; var2 < this.field7468; var2++) {
            class45 var4 = this.field7460[var2];
            while (true) {
                class45 var5 = var4.field548;
                if (var4 == var5) {
                    break;
                }
                var5.method242(true);
            }
        }
        field7461++;
        this.field7477 = null;
        int var3 = -101 / ((arg0 - 41) / 45);
        this.field7474 = null;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(I)V", line = 373)
    public class546(int arg0) {
        this.field7460 = new class45[arg0];
        this.field7468 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class45 var3 = this.field7460[var2] = new class45();
            var3.field547 = var3;
            var3.field548 = var3;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)Lwv;", line = 398)
    public static final class423 method3064(int arg0, int arg1, int arg2) {
        field7472++;
        class423 var3 = class592.method3271(arg1, (byte) -114);
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field5647 == null || var3.field5647.length <= arg2) {
            return null;
        } else {
            int var4 = -114 % ((54 - arg0) / 37);
            return var3.field5647[arg2];
        }
    }
}
