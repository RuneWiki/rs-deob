import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class326 {

    @OriginalMember(owner = "client!lea", name = "d", descriptor = "F")
    public static float field4183;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!lea", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
    public final String toString() {
        field4180++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IZIIZIIJLjava/lang/String;ILjava/lang/String;)V", line = 15)
    public static final void method1864(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, long arg7, String arg8, int arg9, String arg10) {
        field4181++;
        if (class84.field1188 || class463.field5904 >= 500) {
            return;
        }
        int var12 = arg5 == -1 ? class474.field6013 : arg5;
        class145 var13 = new class145(arg10, arg8, var12, arg9, arg3, arg7, arg0, arg2, arg4, arg1);
        class1.field7.method239(var13, (byte) 93);
        int var14 = 10 % ((83 - arg6) / 43);
        class463.field5904++;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(ZZZ)V", line = 33)
    public static final void method1865(boolean arg0, boolean arg1, boolean arg2) {
        field4182++;
        if (arg0) {
            return;
        }
        if (arg2) {
            class473.field6008--;
            if (class473.field6008 == 0) {
                class344.field4422 = null;
            }
        }
        if (!arg1) {
            return;
        }
        class294.field3640--;
        if (class294.field3640 == 0) {
            class475.field6031 = null;
            return;
        }
    }
}
