import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public class class538 {

    @OriginalMember(owner = "client!iia", name = "j", descriptor = "Laq;")
    private class494 field7476 = new class494(64);

    @OriginalMember(owner = "client!iia", name = "o", descriptor = "Laq;")
    public class494 field7481 = new class494(2);

    @OriginalMember(owner = "client!iia", name = "i", descriptor = "Lgga;")
    public class513 field7475;

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "Lgga;")
    private class513 field7468;

    @OriginalMember(owner = "client!iia", name = "f", descriptor = "[I")
    public static int[] field7472 = new int[14];

    @OriginalMember(owner = "client!iia", name = "k", descriptor = "[I")
    public static int[] field7477 = new int[] { 1, 4, 1, 2 };

    @OriginalMember(owner = "client!iia", name = "l", descriptor = "I")
    public static int field7478 = 1339;

    @OriginalMember(owner = "client!iia", name = "e", descriptor = "I")
    public static int field7471 = -1;

    @OriginalMember(owner = "client!iia", name = "m", descriptor = "I")
    public static int field7479 = 0;

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "I")
    public static int field7467;

    @OriginalMember(owner = "client!iia", name = "c", descriptor = "I")
    public static int field7469;

    @OriginalMember(owner = "client!iia", name = "d", descriptor = "I")
    public static int field7470;

    @OriginalMember(owner = "client!iia", name = "g", descriptor = "I")
    public static int field7473;

    @OriginalMember(owner = "client!iia", name = "h", descriptor = "I")
    public static int field7474;

    @OriginalMember(owner = "client!iia", name = "n", descriptor = "I")
    public static int field7480;

    @OriginalMember(owner = "client!iia", name = "p", descriptor = "I")
    public static int field7482;

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(I)V")
    public final void method3117(int arg0) {
        field7482++;
        if (arg0 != 36) {
            this.field7481 = null;
        }
        class494 var2 = this.field7476;
        synchronized (this.field7476) {
            this.field7476.method2881((byte) -107);
        }
        class494 var3 = this.field7481;
        synchronized (this.field7481) {
            this.field7481.method2881((byte) -86);
        }
    }

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "(I)V")
    public final void method3118(int arg0) {
        class494 var2 = this.field7476;
        synchronized (this.field7476) {
            this.field7476.method2893((byte) -22);
        }
        field7474++;
        class494 var3 = this.field7481;
        synchronized (this.field7481) {
            this.field7481.method2893((byte) -80);
            int var4 = 34 / ((arg0 - 66) / 36);
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(Z)V")
    public static void method3119(boolean arg0) {
        field7472 = null;
        field7477 = null;
        if (arg0) {
            field7478 = 97;
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(B)V")
    public static final void method3120(byte arg0) {
        field7470++;
        int var1 = class469.field6382;
        int[] var2 = class464.field6311;
        if (arg0 < 54) {
            field7477 = null;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            class21 var4 = class588.field8451[var2[var3]];
            if (var4 != null) {
                class619.method3549(var4, -109, var4.method209(true));
            }
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(Ljava/lang/String;ZII)Z")
    public static final boolean method3121(String arg0, boolean arg1, int arg2, int arg3) {
        field7469++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        } else if (arg3 >= -112) {
            return false;
        } else {
            boolean var4 = false;
            boolean var5 = false;
            int var6 = 0;
            int var7 = arg0.length();
            for (int var8 = 0; var8 < var7; var8++) {
                char var9 = arg0.charAt(var8);
                if (var8 == 0) {
                    if (var9 == '-') {
                        var4 = true;
                        continue;
                    }
                    if (var9 == '+' && arg1) {
                        continue;
                    }
                }
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 - '0';
                } else if (var9 >= 'A' && var9 <= 'Z') {
                    var11 = var9 - '7';
                } else if (var9 >= 'a' && var9 <= 'z') {
                    var11 = var9 - 'W';
                } else {
                    return false;
                }
                if (var11 >= arg2) {
                    return false;
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg2 * var6 + var11;
                if (var10 / arg2 != var6) {
                    return false;
                }
                var6 = var10;
                var5 = true;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(II)V")
    public final void method3122(int arg0, int arg1) {
        field7480++;
        class494 var3 = this.field7476;
        synchronized (this.field7476) {
            this.field7476.method2888(arg1, 117);
            if (arg0 != 2) {
                field7472 = null;
            }
        }
        class494 var4 = this.field7481;
        synchronized (this.field7481) {
            this.field7481.method2888(arg1, 117);
        }
    }

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "(II)Ljha;")
    public final class108 method3123(int arg0, int arg1) {
        field7467++;
        class494 var3 = this.field7476;
        class108 var4;
        synchronized (this.field7476) {
            var4 = (class108) this.field7476.method2882((long) arg0, (byte) -73);
        }
        if (var4 != null) {
            return var4;
        }
        class513 var5 = this.field7468;
        byte[] var6;
        synchronized (this.field7468) {
            var6 = this.field7468.method3019(arg1, arg0, arg1 ^ 0x61);
        }
        class108 var7 = new class108();
        var7.field1543 = this;
        if (var6 != null) {
            var7.method865(-32680, new class431(var6));
        }
        class494 var8 = this.field7476;
        synchronized (this.field7476) {
            this.field7476.method2890(-7307, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(ZI)V")
    public static final void method3124(boolean arg0, int arg1) {
        if (!arg0) {
            method3124(false, 119);
        }
        field7473++;
        if (class484.method2853(arg1, (byte) -40)) {
            class586.method3442(class610.field8661[arg1], -1, false);
        }
    }

    @OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(Lmca;ILgga;Lgga;)V")
    public class538(class41 arg0, int arg1, class513 arg2, class513 arg3) {
        this.field7475 = arg3;
        this.field7468 = arg2;
        this.field7468.method3007(-1, 33);
    }
}
