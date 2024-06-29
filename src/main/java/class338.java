import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class338 {

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "Llga;")
    private class663 field4535 = new class663(64);

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "Lsea;")
    private class648 field4536;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field4538 = -1;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "[I")
    public static int[] field4528 = new int[2];

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)V")
    public final void method1975(int arg0, int arg1) {
        class663 var3 = this.field4535;
        synchronized (this.field4535) {
            if (arg1 != 4) {
                return;
            }
            this.field4535.method3754(arg0, true);
        }
        field4533++;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static void method1976(int arg0) {
        if (arg0 != -28526) {
            field4528 = null;
        }
        field4528 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)Lfd;")
    public final class488 method1977(byte arg0, int arg1) {
        field4534++;
        class663 var3 = this.field4535;
        class488 var4;
        synchronized (this.field4535) {
            var4 = (class488) this.field4535.method3747((byte) -66, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class648 var5 = this.field4536;
        byte[] var6;
        synchronized (this.field4536) {
            var6 = this.field4536.method3654(-15615, 11, arg1);
        }
        if (arg0 != 58) {
            return null;
        }
        class488 var7 = new class488();
        if (var6 != null) {
            var7.method2769((byte) -82, new class501(var6));
        }
        class663 var8 = this.field4535;
        synchronized (this.field4535) {
            this.field4535.method3748((long) arg1, var7, 12537);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1978(String arg0, int arg1) {
        field4537++;
        if (arg1 != 0) {
            method1976(-103);
        }
        String var2 = null;
        int var3 = arg0.indexOf("--> ");
        if (var3 >= 0) {
            var2 = arg0.substring(0, var3 + 4);
            arg0 = arg0.substring(var3 + 4);
        }
        if (arg0.startsWith("directlogin ")) {
            int var4 = arg0.indexOf(" ", "directlogin ".length());
            if (var4 >= 0) {
                int var5 = arg0.length();
                arg0 = arg0.substring(0, var4) + " ";
                for (int var6 = var4 + 1; var6 < var5; var6++) {
                    arg0 = arg0 + "*";
                }
            }
        }
        return var2 == null ? arg0 : var2 + arg0;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)Z")
    public static final boolean method1979(boolean arg0) {
        field4539++;
        if (!arg0) {
            method1976(-33);
        }
        return class450.field6183 == 0 ? class224.field3124.method2103((byte) -108) : true;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
    public final void method1980(byte arg0) {
        field4529++;
        if (arg0 == -103) {
            class663 var2 = this.field4535;
            synchronized (this.field4535) {
                this.field4535.method3755(19713);
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBI)I")
    public static final int method1981(int arg0, byte arg1, int arg2) {
        if (arg1 > -59) {
            method1979(false);
        }
        field4531++;
        return arg0 == 1 || arg0 == 3 ? class233.field3217[arg2 & 0x3] : class295.field4040[arg2 & 0x3];
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)V")
    public final void method1982(byte arg0) {
        class663 var2 = this.field4535;
        synchronized (this.field4535) {
            this.field4535.method3749(arg0 ^ 0x1DF7);
        }
        if (arg0 != 23) {
            field4530 = -116;
        }
        field4532++;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lci;ILsea;)V")
    public class338(class414 arg0, int arg1, class648 arg2) {
        this.field4536 = arg2;
        if (this.field4536 != null) {
            this.field4536.method3653(11, true);
        }
    }
}
