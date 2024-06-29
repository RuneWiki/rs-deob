import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class117 {

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "I")
    public int field1988;

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!qca", name = "d", descriptor = "I")
    public int field1991;

    @OriginalMember(owner = "client!qca", name = "f", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!qca", name = "g", descriptor = "I")
    public int field1994;

    @OriginalMember(owner = "client!qca", name = "h", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!qca", name = "i", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!qca", name = "j", descriptor = "I")
    public int field1997;

    @OriginalMember(owner = "client!qca", name = "k", descriptor = "I")
    public int field1998;

    @OriginalMember(owner = "client!qca", name = "l", descriptor = "I")
    public int field1999;

    @OriginalMember(owner = "client!qca", name = "e", descriptor = "Lefa;")
    public static class185 field1992;

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "[Ldca;")
    public static class178[] field1990;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)V")
    public static final void method1026(int arg0) {
        class274.field3850 = arg0;
        class640.field8799 = 1;
        field1995++;
        long var1 = 0L;
        if (class199.field2906 == null) {
            class204.method1420(35, (byte) -101);
        } else {
            class215 var3 = new class215(class266.method1767(class420.method2580(class199.field2906, true), -125));
            long var4 = var3.method1513(-456577760);
            class607.field8335 = var3.method1513(-456577760);
            class58.method613(class581.method3331(var4, -100), true, "", (byte) -115);
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIIIIIIIIIII)V")
    public static final void method1027(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field1993++;
        if (!class722.method4007(arg0, (byte) 84) || arg6 != -1391) {
            return;
        }
        if (class605.field8299[arg0] == null) {
            client.method1978(class396.field5798[arg0], -1, arg2, arg11, arg3, arg8, arg1, arg9, arg5, arg4, arg7, arg10);
        } else {
            client.method1978(class605.field8299[arg0], -1, arg2, arg11, arg3, arg8, arg1, arg9, arg5, arg4, arg7, arg10);
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(ILcea;)Lo;")
    public static final class29 method1028(int arg0, class215 arg1) {
        if (arg0 < 106) {
            field1992 = null;
        }
        field1996++;
        return new class29(arg1.method1520(13638), arg1.method1520(13638), arg1.method1520(13638), arg1.method1520(13638), arg1.method1499(-1), arg1.method1535(255));
    }

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "(I)V")
    public static void method1029(int arg0) {
        if (arg0 != 5616) {
            field1992 = null;
        }
        field1992 = null;
        field1990 = null;
    }
}
