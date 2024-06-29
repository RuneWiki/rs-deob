import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public abstract class class123 {

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field2035 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "Lmh;")
    public static class62 field2038 = class201.method1405(true, ")1j");

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "Lmh;")
    public static class62 field2042 = class201.method1405(true, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "I")
    public static int field2045 = 0;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
    public static int field2046 = 1;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "J")
    public static long field2043;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "()Z", line = 4)
    public boolean method578() {
        field2047++;
        return false;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IZ)V", line = 15)
    public static final void method937(int arg0, boolean arg1) {
        field2034++;
        if (arg0 == -1 || !class307.field5266[arg0]) {
            return;
        }
        class165.field2692.method161(arg0, -19280);
        if (class275.field4713[arg0] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class275.field4713[arg0].length; var3++) {
            if (class275.field4713[arg0][var3] != null) {
                if (class275.field4713[arg0][var3].field3068 == 2) {
                    var2 = false;
                } else {
                    class275.field4713[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class275.field4713[arg0] = null;
        }
        class307.field5266[arg0] = arg1;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)Ljm;", line = 64)
    public class123 method588(int arg0, int arg1, int arg2) {
        field2041++;
        return this;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljm;IIIZ)V", line = 76)
    public void method572(class123 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2044++;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V", line = 90)
    public static void method938(int arg0) {
        field2042 = null;
        if (arg0 != -8) {
            field2042 = (class62) null;
        }
        field2038 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIB)V", line = 105)
    public void method939(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        int var6 = -62 % ((-arg4 - 29) / 62);
        field2040++;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILsg;I)Lmh;", line = 117)
    public static final class62 method940(int arg0, class191 arg1, int arg2) {
        field2036++;
        if (!class277.method1895(false, arg2, client.method2058(arg1)) && arg1.field3092 == null) {
            return null;
        }
        if (arg0 != 0) {
            field2045 = 5;
        }
        if (arg1.field3134 == null || arg1.field3134.length <= arg2 || arg1.field3134[arg2] == null || arg1.field3134[arg2].method440((byte) 48).method439(-86) == 0) {
            return class263.field4433 ? class254.method1772(new class62[] { class137.field2218, class42.method284(arg2, -119) }, 0) : null;
        } else {
            return arg1.field3134[arg2];
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "()I")
    public abstract int method278();
}
