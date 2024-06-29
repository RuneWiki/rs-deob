import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class284 {

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "Z")
    public boolean field4221 = true;

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "Lqt;")
    public static class459 field4225 = new class459(59, 11);

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "C")
    private char field4218;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
    public int field4220;

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "Ltk;")
    public static class234 field4223;

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "Ljava/lang/String;")
    public String field4228;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILwn;)V", line = 4)
    public final void method1828(int arg0, class519 arg1) {
        while (true) {
            int var3 = arg1.method3072((byte) -126);
            if (var3 == 0) {
                if (arg0 != -1) {
                    field4223 = null;
                }
                field4227++;
                return;
            }
            this.method1829(-116, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IILwn;)V", line = 32)
    private final void method1829(int arg0, int arg1, class519 arg2) {
        if (arg1 == 1) {
            this.field4218 = class221.method1501(arg2.method3034((byte) -55), -23667);
        } else if (arg1 == 2) {
            this.field4220 = arg2.method3053(-129);
        } else if (arg1 == 4) {
            this.field4221 = false;
        } else if (arg1 == 5) {
            this.field4228 = arg2.method3082((byte) 102);
        }
        if (arg0 != -116) {
            field4225 = null;
        }
        field4224++;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)Z", line = 60)
    public final boolean method1830(int arg0) {
        if (arg0 != -116) {
            this.method1830(45);
        }
        field4219++;
        return this.field4218 == 's';
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IB)Lqe;", line = 74)
    public static final class334 method1831(int arg0, byte arg1) {
        int var2 = 64 % ((69 - arg1) / 33);
        field4226++;
        class334 var3 = (class334) class238.field3594.method2982(0, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class179.field2653.method2037(arg0, (byte) -95, 0);
        class334 var5 = new class334();
        if (var4 != null) {
            var5.method2123(arg0, -125, new class519(var4));
        }
        class238.field3594.method2981(var5, 54, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILtf;)V", line = 104)
    public static final void method1832(int arg0, class198 arg1) {
        if (class364.field5295 == arg1.field2891) {
            class25.field361[arg1.field2895] = true;
        }
        if (arg0 == -17067) {
            field4222++;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)V", line = 122)
    public static void method1833(byte arg0) {
        field4223 = null;
        field4225 = null;
        if (arg0 != 110) {
            field4223 = null;
        }
    }
}
