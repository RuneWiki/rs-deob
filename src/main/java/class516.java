import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public class class516 extends class749 implements class635 {

    @OriginalMember(owner = "client!hha", name = "v", descriptor = "I")
    private int field7348;

    @OriginalMember(owner = "client!hha", name = "o", descriptor = "[I")
    public static int[] field7341 = new int[1];

    @OriginalMember(owner = "client!hha", name = "q", descriptor = "I")
    public static int field7343 = -1;

    @OriginalMember(owner = "client!hha", name = "n", descriptor = "I")
    public static int field7340;

    @OriginalMember(owner = "client!hha", name = "p", descriptor = "I")
    public static int field7342;

    @OriginalMember(owner = "client!hha", name = "r", descriptor = "I")
    public static int field7344;

    @OriginalMember(owner = "client!hha", name = "s", descriptor = "I")
    public static int field7345;

    @OriginalMember(owner = "client!hha", name = "t", descriptor = "I")
    public static int field7346;

    @OriginalMember(owner = "client!hha", name = "u", descriptor = "I")
    public static int field7347;

    @OriginalMember(owner = "client!hha", name = "<init>", descriptor = "(Loea;I[BIZ)V")
    public class516(class594 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field7348 = arg1;
    }

    @OriginalMember(owner = "client!hha", name = "<init>", descriptor = "(Loea;ILjaclib/memory/Buffer;IZ)V")
    public class516(class594 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field7348 = arg1;
    }

    @OriginalMember(owner = "client!hha", name = "b", descriptor = "(B)J")
    public final long method2160(byte arg0) {
        if (arg0 != -104) {
            return -5L;
        } else {
            ++field7347;
            return 0L;
        }
    }

    @OriginalMember(owner = "client!hha", name = "e", descriptor = "(B)V")
    public static void method3074(byte arg0) {
        field7341 = null;
        if (arg0 >= -119) {
            field7343 = 63;
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "([[BILwq;)V")
    public static final void method3075(byte[][] arg0, int arg1, class166 arg2) {
        ++field7342;
        int var3 = class190.field2743.length;
        for (int var4 = 0; var4 < var3; ++var4) {
            byte[] var5 = arg0[var4];
            if (var5 != null) {
                int var6 = (class412.field5705[var4] >> 8) * 64 + -class115.field1845;
                int var7 = (255 & class412.field5705[var4]) * 64 + -class64.field1160;
                class565.method3297(arg1 ^ -24236);
                arg2.method1237(var7, var5, (byte) 81, class630.field9041, class359.field5046, var6);
            }
        }
        if (arg1 != -24246) {
            field7343 = -89;
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(Z)I")
    public final int method2162(boolean arg0) {
        ++field7344;
        return !arg0 ? 12 : this.field7348;
    }

    @OriginalMember(owner = "client!hha", name = "d", descriptor = "(B)V")
    public final void method3076(byte arg0) {
        super.field10467.method3403(this, 78);
        ++field7340;
        int var2 = -76 % ((-71 - arg0) / 52);
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(B)I")
    public final int method2158(byte arg0) {
        ++field7346;
        int var2 = 7 % ((22 - arg0) / 49);
        return super.field10464;
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(IIB[B)V")
    public final void method2161(int arg0, int arg1, byte arg2, byte[] arg3) {
        if (arg2 < -69) {
            this.method4168(arg3, arg1, -24038);
            ++field7345;
            this.field7348 = arg0;
        }
    }
}
