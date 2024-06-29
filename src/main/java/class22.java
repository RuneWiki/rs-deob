import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class22 extends InputStream {

    @OriginalMember(owner = "client!u", name = "a", descriptor = "[S")
    public static short[] field360 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field366 = 0;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "[Lwb;")
    public static class219[] field371 = new class219[4];

    @OriginalMember(owner = "client!u", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field368 = new String[200];

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "Lpe;")
    public static class253 field369;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "[Lji;")
    public static class256[] field363;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
    public static void method152(byte arg0) {
        field360 = null;
        if (arg0 != 121) {
            field365 = 105;
        }
        field369 = null;
        field363 = null;
        field368 = null;
        field371 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg6 >= class196.field2961 && arg6 <= class84.field1287 && arg4 >= class196.field2961 && arg4 <= class84.field1287 && class196.field2961 <= arg7 && arg7 <= class84.field1287 && arg5 >= class196.field2961 && arg5 <= class84.field1287 && class175.field2557 <= arg3 && arg3 <= class91.field1381 && arg0 >= class175.field2557 && arg0 <= class91.field1381 && class175.field2557 <= arg8 && arg8 <= class91.field1381 && arg9 >= class175.field2557 && arg9 <= class91.field1381) {
            class122.method866(arg7, arg3, arg0, arg9, arg8, arg6, arg1, arg4, arg5, (byte) 116);
        } else {
            class246.method1688(arg6, arg0, arg1, (byte) 127, arg4, arg3, arg9, arg8, arg5, arg7);
        }
        if (arg2 == 200) {
            field362++;
        }
    }

    @OriginalMember(owner = "client!u", name = "read", descriptor = "()I")
    public final int read() {
        field367++;
        client.method323(30000L, -121);
        return -1;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
    public static final void method154(boolean arg0) {
        if (arg0) {
            class3.field40 = class277.field4277;
            class166.field2451 = class134.field1963;
        } else {
            class3.field40 = class123.field1826;
            class166.field2451 = class287.field4389;
        }
        class43.field771 = class3.field40.length;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)V")
    public static final void method155(int arg0, int arg1) {
        if (arg1 != 957) {
            field369 = null;
        }
        field370++;
        class24.field387.method938(arg0, (byte) -123);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)Lni;")
    public static final class52 method156(int arg0, byte arg1) {
        class52 var2 = (class52) class270.field4217.method945((long) arg0, true);
        field372++;
        if (arg1 <= 44) {
            method156(87, (byte) 117);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class58.field962.method1605(-128, 0, arg0);
        class52 var4 = new class52(var3);
        var4.method1300(class71.field1166, (int[]) null);
        class270.field4217.method941(var4, (long) arg0, -8447);
        return var4;
    }
}
