import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class203 implements class33 {

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "Leba;")
    private class552 field2396;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "Lsb;")
    public static class305 field2402 = new class305(30, 3);

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "[I")
    public static int[] field2403 = new int[25];

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "Ljs;")
    public static class271 field2397;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "Lqj;")
    public static class546 field2404;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lrn;I)Ljava/lang/String;", line = 3)
    public static final String method1210(class336 arg0, int arg1) {
        int var2 = -61 / ((arg1 - 43) / 52);
        field2393++;
        return arg0.field4221 == null || arg0.field4221.length() <= 0 ? arg0.field4225 : arg0.field4225 + class198.field2317.method1195((byte) 62, class504.field7267) + arg0.field4221;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZI)V", line = 17)
    public final void method155(boolean arg0, int arg1) {
        field2399++;
        if (arg0) {
            class701.field9813.method1022(0, 0, class146.field1618, class338.field4244, this.field2396.field7884, 0);
        }
        if (arg1 != -3563) {
            method1214(-31);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I[BII)[B", line = 33)
    public static final byte[] method1211(int arg0, byte[] arg1, int arg2, int arg3) {
        field2394++;
        if (arg0 >= -31) {
            method1211(120, null, -12, 89);
        }
        byte[] var4 = new byte[arg3];
        class567.method3213(arg1, arg2, var4, 0, arg3);
        return var4;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZC)Z", line = 47)
    public static final boolean method1212(boolean arg0, char arg1) {
        field2400++;
        if (arg0) {
            return false;
        } else {
            return arg1 >= '0' && arg1 <= '9';
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)Z", line = 58)
    public final boolean method157(boolean arg0) {
        if (arg0) {
            field2397 = null;
        }
        field2398++;
        return true;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IILjava/net/Socket;)Llba;", line = 69)
    public static final class255 method1213(int arg0, int arg1, Socket arg2) throws IOException {
        if (arg1 != 0) {
            method1210(null, 46);
        }
        field2401++;
        return new class483(arg2, arg0);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 80)
    public final void method156(int arg0) {
        if (arg0 != 23004) {
            field2402 = null;
        }
        field2395++;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V", line = 92)
    public static void method1214(int arg0) {
        field2402 = null;
        field2404 = null;
        field2403 = null;
        int var1 = 94 % ((4 - arg0) / 43);
        field2397 = null;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Leba;)V", line = 112)
    public class203(class552 arg0) {
        this.field2396 = arg0;
    }
}
