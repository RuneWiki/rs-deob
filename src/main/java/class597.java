import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class597 {

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
    public int field8460 = 128;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public int field8454 = 128;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public int field8450;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public int field8452;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public int field8453;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public int field8451;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "[Z")
    public static boolean[] field8464 = new boolean[8];

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public int field8448;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public int field8449;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    public static int field8456;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    public int field8457;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
    public int field8458;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
    public static int field8462;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "I")
    public static int field8463;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "I")
    public int field8465;

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "I")
    public static int field8466;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "Lvd;")
    public static class39 field8455;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "Lpga;")
    public static class536 field8461;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "Ljava/lang/Thread;")
    public static Thread field8459;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)Lrj;")
    public final class597 method3473(byte arg0) {
        if (arg0 > -126) {
            field8455 = null;
        }
        field8463++;
        return new class597(this.field8450, this.field8460, this.field8454, this.field8451, this.field8452, this.field8453);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILrj;)V")
    public final void method3474(int arg0, class597 arg1) {
        this.field8451 = arg1.field8451;
        if (arg0 != 28623) {
            method3475(66);
        }
        field8456++;
        this.field8452 = arg1.field8452;
        this.field8450 = arg1.field8450;
        this.field8454 = arg1.field8454;
        this.field8460 = arg1.field8460;
        this.field8453 = arg1.field8453;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
    public static void method3475(int arg0) {
        field8461 = null;
        field8459 = null;
        if (arg0 != -2001) {
            method3477(true, null, (byte) 20);
        }
        field8455 = null;
        field8464 = null;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)V")
    public static final void method3476(byte arg0) {
        field8462++;
        if (class661.field9245 == 0) {
            return;
        }
        try {
            if ((++class79.field1100) > 2000) {
                if (class533.field7668 != null) {
                    class533.field7668.method850(2);
                    class533.field7668 = null;
                }
                if (class362.field5235 >= 2) {
                    class661.field9245 = 0;
                    class313.field4434 = -5;
                    return;
                }
                class15.field202.method3332(-12506);
                class362.field5235++;
                class79.field1100 = 0;
                class661.field9245 = 1;
            }
            if (class661.field9245 == 1) {
                class150.field2335 = class15.field202.method3334(class179.field2759, false);
                class661.field9245 = 2;
            }
            int var1 = -107 / ((arg0 - 37) / 52);
            if (class661.field9245 == 2) {
                if (class150.field2335.field2986 == 2) {
                    throw new IOException();
                }
                if (class150.field2335.field2986 != 1) {
                    return;
                }
                class533.field7668 = class496.method2954(5126, (Socket) class150.field2335.field2990, 7500);
                class150.field2335 = null;
                class691.method3927(1635);
                class661.field9245 = 4;
            }
            if (class661.field9245 == 4 && class533.field7668.method852(1, false)) {
                class533.field7668.method853(4, class469.field6851.field9068, 1, 0);
                int var2 = class469.field6851.field9068[0] & 0xFF;
                class313.field4434 = var2;
                class661.field9245 = 0;
                class533.field7668.method850(2);
                class533.field7668 = null;
            }
        } catch (IOException var3) {
            if (class533.field7668 != null) {
                class533.field7668.method850(2);
                class533.field7668 = null;
            }
            if (class362.field5235 >= 2) {
                class661.field9245 = 0;
                class313.field4434 = -4;
            } else {
                class15.field202.method3332(-12506);
                class362.field5235++;
                class661.field9245 = 1;
                class79.field1100 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z[BB)Ljava/lang/Object;")
    public static final Object method3477(boolean arg0, byte[] arg1, byte arg2) {
        field8466++;
        if (arg2 < 62) {
            field8464 = null;
        }
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class170.field2655) {
            try {
                class463 var3 = (class463) Class.forName("pw").getDeclaredConstructor().newInstance();
                var3.method2821((byte) -127, arg1);
                return var3;
            } catch (Throwable var4) {
                class170.field2655 = true;
            }
        }
        return arg0 ? class637.method3661(arg1, 3517) : arg1;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(I)V")
    public class597(int arg0) {
        this.field8450 = arg0;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(IIIIII)V")
    private class597(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8454 = arg2;
        this.field8452 = arg4;
        this.field8450 = arg0;
        this.field8453 = arg5;
        this.field8460 = arg1;
        this.field8451 = arg3;
    }
}
