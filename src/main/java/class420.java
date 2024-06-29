import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class420 {

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "[F")
    public static float[] field5925 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "I")
    public static int field5923;

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
    public static int field5924;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V", line = 3)
    public static void method2575(int arg0) {
        if (arg0 != -32084) {
            field5925 = null;
        }
        field5925 = null;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIBIII)V", line = 16)
    public static final void method2576(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (class557.field7812.field6527.method3029(false) != 0 && arg3 != 0 && class557.field7828 < 50 && arg4 != -1) {
            class503.field7212[class557.field7828++] = new class319((byte) 1, arg4, arg3, arg5, arg1, 0, arg0, null);
        }
        if (arg2 <= 15) {
            method2575(78);
        }
        field5924++;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILkha;Lkha;)V", line = 39)
    public static final void method2577(int arg0, class583 arg1, class583 arg2) {
        if (arg2.field8205 != null) {
            arg2.method3311(100);
        }
        field5923++;
        if (arg0 > -42) {
            method2576(-68, -81, (byte) 99, -95, -15, -69);
        }
        arg2.field8206 = arg1;
        arg2.field8205 = arg1.field8205;
        arg2.field8205.field8206 = arg2;
        arg2.field8206.field8205 = arg2;
    }
}
