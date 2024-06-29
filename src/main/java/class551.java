import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class551 {

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "S")
    public short field8081;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "B")
    public byte field8076;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "Z")
    public boolean field8073;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public int field8082;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public int field8080;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "I")
    public int field8085;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
    public int field8083;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "S")
    public short field8084;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "S")
    public short field8072;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public int field8074;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field8075;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field8077;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field8078;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public static int field8079;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    public static int field8086;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
    public static final void method3232(int arg0) {
        field8079++;
        if (class250.field3623 == 0) {
            return;
        }
        try {
            if (++class514.field7630 > 2000) {
                if (class256.field3696 != null) {
                    class256.field3696.method913(-10406);
                    class256.field3696 = null;
                }
                if (class211.field3232 >= 2) {
                    class693.field9848 = -5;
                    class250.field3623 = 0;
                    return;
                }
                class572.field8418.method1872(0);
                class211.field3232++;
                class514.field7630 = 0;
                class250.field3623 = 1;
            }
            if (class250.field3623 == 1) {
                class183.field2887 = class572.field8418.method1870(class653.field9220, -17813);
                class250.field3623 = 2;
            }
            if (class250.field3623 == 2) {
                if (class183.field2887.field8787 == 2) {
                    throw new IOException();
                }
                if (class183.field2887.field8787 != 1) {
                    return;
                }
                class256.field3696 = class503.method3009((byte) -79, 7500, (Socket) class183.field2887.field8785);
                class183.field2887 = null;
                class557.method3263(108);
                class250.field3623 = 4;
            }
            if (class250.field3623 == 4) {
                if (!class256.field3696.method921(1, -5794)) {
                    return;
                }
                class256.field3696.method918(19001, 0, 1, class376.field5209.field6719);
                int var1 = class376.field5209.field6719[0] & 0xFF;
                if (var1 != 21) {
                    class250.field3623 = 0;
                    class693.field9848 = var1;
                    class256.field3696.method913(-10406);
                    class256.field3696 = null;
                    return;
                }
                class250.field3623 = 5;
            }
            if (class250.field3623 == 5) {
                if (!class256.field3696.method921(1, -5794)) {
                    return;
                }
                class256.field3696.method918(19001, 0, 1, class376.field5209.field6719);
                class130.field2125 = new String[class376.field5209.field6719[0] & 0xFF];
                class250.field3623 = 6;
            }
            if (class250.field3623 == 6) {
                if (class256.field3696.method921(class130.field2125.length * 8, arg0 - 37047)) {
                    class376.field5209.field6710 = 0;
                    class256.field3696.method918(arg0 ^ 0x302C, 0, class130.field2125.length * 8, class376.field5209.field6719);
                    for (int var2 = 0; var2 < class130.field2125.length; var2++) {
                        class130.field2125[var2] = class618.method3494(class376.field5209.method2727(0), -32105);
                    }
                    class250.field3623 = 0;
                    class693.field9848 = 21;
                    class256.field3696.method913(-10406);
                    class256.field3696 = null;
                }
            } else if (arg0 != 31253) {
                method3233((byte) 84);
            }
        } catch (IOException var3) {
            if (class256.field3696 != null) {
                class256.field3696.method913(-10406);
                class256.field3696 = null;
            }
            if (class211.field3232 < 2) {
                class572.field8418.method1872(arg0 - 31253);
                class250.field3623 = 1;
                class514.field7630 = 0;
                class211.field3232++;
            } else {
                class250.field3623 = 0;
                class693.field9848 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)Lg;")
    public static final class129 method3233(byte arg0) {
        field8086++;
        try {
            int var1 = 75 % ((-arg0 - 3) / 51);
            return new class110();
        } catch (Throwable var3) {
            try {
                return (class129) Class.forName("ah").getDeclaredConstructor().newInstance();
            } catch (Throwable var2) {
                return new class704();
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class551(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field8081 = (short) arg5;
        this.field8076 = (byte) arg8;
        this.field8073 = arg10;
        this.field8082 = arg0;
        this.field8080 = arg3;
        this.field8085 = arg11;
        this.field8083 = arg2;
        this.field8084 = (short) arg4;
        this.field8072 = (short) arg6;
        this.field8074 = arg1;
    }
}
