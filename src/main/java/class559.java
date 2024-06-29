import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class559 extends class94 implements class202 {

    @OriginalMember(owner = "client!oea", name = "w", descriptor = "I")
    private int field7420;

    @OriginalMember(owner = "client!oea", name = "A", descriptor = "Z")
    public static boolean field7424 = false;

    @OriginalMember(owner = "client!oea", name = "q", descriptor = "I")
    public static int field7414;

    @OriginalMember(owner = "client!oea", name = "r", descriptor = "I")
    public static int field7415;

    @OriginalMember(owner = "client!oea", name = "s", descriptor = "I")
    public static int field7416;

    @OriginalMember(owner = "client!oea", name = "t", descriptor = "I")
    public static int field7417;

    @OriginalMember(owner = "client!oea", name = "u", descriptor = "I")
    public static int field7418;

    @OriginalMember(owner = "client!oea", name = "x", descriptor = "I")
    public static int field7421;

    @OriginalMember(owner = "client!oea", name = "y", descriptor = "I")
    public static int field7422;

    @OriginalMember(owner = "client!oea", name = "z", descriptor = "I")
    public static int field7423;

    @OriginalMember(owner = "client!oea", name = "C", descriptor = "I")
    public static int field7426;

    @OriginalMember(owner = "client!oea", name = "D", descriptor = "I")
    public static int field7427;

    @OriginalMember(owner = "client!oea", name = "B", descriptor = "Lbi;")
    public static class449 field7425;

    @OriginalMember(owner = "client!oea", name = "v", descriptor = "[[I")
    public static int[][] field7419;

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(I)J", line = 3)
    public final long method1324(int arg0) {
        if (arg0 != 29632) {
            method3079((String) null, (byte) -4);
        }
        ++field7418;
        return 0L;
    }

    @OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(Lno;I[BIZ)V", line = 16)
    public class559(class658 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field7420 = arg1;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "([BIII)V", line = 24)
    public final void method1322(byte[] arg0, int arg1, int arg2, int arg3) {
        this.method739(arg2, arg0, arg3 + -9150);
        ++field7417;
        this.field7420 = arg1;
        if (arg3 != 9043) {
            this.method741(-121);
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)I", line = 38)
    public final int method1323(int arg0) {
        ++field7421;
        if (arg0 != -28332) {
            field7425 = null;
        }
        return super.field1437;
    }

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "(I)I", line = 49)
    public final int method1325(int arg0) {
        ++field7414;
        return arg0 != 32559 ? -54 : this.field7420;
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(Ljava/lang/String;B)V", line = 65)
    public static final void method3079(String arg0, byte arg1) {
        class482.field6480 = arg0;
        ++field7416;
        if (class486.field6574 != null) {
            try {
                int var2 = 44 / ((arg1 - 75) / 38);
                String var3 = class486.field6574.getParameter("cookieprefix");
                String var4 = class486.field6574.getParameter("cookiehost");
                String var5 = var3 + "settings=" + arg0 + "; version=1; path=/; domain=" + var4;
                String var6;
                if (~arg0.length() == -1) {
                    var6 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    var6 = var5 + "; Expires=" + class529.method2954(94608000000L + class681.method3802(-23600), false) + "; Max-Age=" + 94608000L;
                }
                class594.method3269(class486.field6574, true, "document.cookie=\"" + var6 + "\"");
            } catch (Throwable var7) {
            }
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lpe;I)V", line = 98)
    public static final void method3080(class571 arg0, int arg1) {
        arg0.field7578 = null;
        ++field7423;
        if (arg1 != -1) {
            field7427 = -18;
        }
        int var2 = arg0.field7581.length;
        for (int var3 = 0; ~var3 > ~var2; ++var3) {
            arg0.field7581[var3].field7341 = false;
        }
        class47[] var4 = class521.field6965;
        synchronized (class521.field6965) {
            if (class521.field6965.length > var2 && class16.field240[var2] < 200) {
                class521.field6965[var2].method327(arg0, true);
                int var10002 = class16.field240[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!oea", name = "d", descriptor = "(I)V", line = 127)
    public final void method741(int arg0) {
        super.field1438.method3666(1, this);
        ++field7422;
        if (arg0 <= 80) {
            this.field7420 = 62;
        }
    }

    @OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(Lno;ILjaclib/memory/Buffer;IZ)V", line = 138)
    public class559(class658 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field7420 = arg1;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Loa;IBZ)Lwb;", line = 149)
    public static final class305 method3081(class651 arg0, int arg1, byte arg2, boolean arg3) {
        ++field7426;
        if (arg1 == -1) {
            return null;
        } else {
            if (class201.field2935 != null) {
                for (int var4 = 0; ~var4 > ~class201.field2935.length; ++var4) {
                    if (~class201.field2935[var4] == ~arg1) {
                        return class511.field6819[var4];
                    }
                }
            }
            class305 var5 = (class305) class693.field9751.method3750((long) arg1, false);
            if (var5 != null) {
                if (arg3 && var5.field4224 == null) {
                    class511 var6 = class154.method1084(class172.field2652, (byte) 40, arg1);
                    if (var6 == null) {
                        return null;
                    }
                    var5.field4224 = var6;
                }
                return var5;
            } else {
                class500[] var7 = class500.method2769(class484.field6544, arg1);
                if (var7 == null) {
                    return null;
                } else {
                    if (arg2 < 102) {
                        method3080((class571) null, -40);
                    }
                    class511 var8 = class154.method1084(class172.field2652, (byte) 40, arg1);
                    if (var8 == null) {
                        return null;
                    } else {
                        class305 var9;
                        if (arg3) {
                            var9 = new class305(arg0.method389(var8, var7, true), var8);
                        } else {
                            var9 = new class305(arg0.method389(var8, var7, true));
                        }
                        class693.field9751.method3745(1, (long) arg1, var9);
                        return var9;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(B)V", line = 217)
    public static void method3082(byte arg0) {
        field7419 = null;
        field7425 = null;
        int var1 = 120 % ((-66 - arg0) / 38);
    }
}
