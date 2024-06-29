import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class147 {

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "Lwb;")
    public static class171 field2644;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V", line = 5)
    public static void method1171(int arg0) {
        field2644 = null;
        if (arg0 != -21789) {
            method1173((byte) 99, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BI)Z", line = 19)
    public static final boolean method1172(byte arg0, int arg1) {
        field2648++;
        if (arg0 == -128) {
            return (arg1 & -arg1) == arg1;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B[B)[B", line = 32)
    public static final byte[] method1173(byte arg0, byte[] arg1) {
        field2645++;
        if (arg0 != 97) {
            return (byte[]) null;
        }
        class336 var2 = new class336(arg1);
        int var3 = var2.method2364(-9069);
        int var4 = var2.method2338((byte) 21);
        if (var4 < 0 || !(class238.field3908 == 0 || var4 <= class238.field3908)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method2342(var4, 0, var7, false);
            return var7;
        } else {
            int var5 = var2.method2338((byte) 34);
            if (var5 < 0 || class238.field3908 != 0 && class238.field3908 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class302.method2085(var6, var5, arg1, var4, 9);
            } else {
                class329.field5244.method872(var2, false, var6);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IB)V", line = 93)
    public static final void method1174(int arg0, byte arg1) {
        class30 var2 = class99.method857((byte) 82, arg0, 1);
        if (arg1 == -87) {
            field2646++;
            var2.method276(arg1 + 87);
        }
    }
}
