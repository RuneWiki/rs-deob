import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public abstract class class483 {

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "Lcu;")
    public static class206 field6537 = new class206(67, 3);

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public static int field6535;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public static int field6536;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public static int field6538;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    public static int field6539;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    public static int field6540;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V", line = 12)
    public static void method2700(byte arg0) {
        if (arg0 >= 6) {
            field6537 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IZZLjava/lang/String;JIIIILjava/lang/String;I)V", line = 24)
    public static final void method2701(int arg0, boolean arg1, boolean arg2, String arg3, long arg4, int arg5, int arg6, int arg7, int arg8, String arg9, int arg10) {
        if (arg10 != 6967) {
            return;
        }
        field6535++;
        if (!class388.field5142 && class398.field5290 < 500) {
            int var12 = arg8 == -1 ? class428.field5883 : arg8;
            class117 var13 = new class117(arg9, arg3, var12, arg5, arg7, arg4, arg6, arg0, arg2, arg1);
            class480.field6411.method3265(var13, (byte) -116);
            class398.field5290++;
        }
    }
}
