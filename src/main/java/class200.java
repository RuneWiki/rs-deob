import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class200 {

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field3042 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public int field3039;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public int field3041;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public int field3043;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public int field3044;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public int field3046;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public int field3048;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    public int field3053;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "[B")
    public byte[] field3049;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "[B")
    public byte[] field3052;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZI)V", line = 9)
    public static final void method1446(boolean arg0, int arg1) {
        class130.field2003.method741(arg1, (byte) -30);
        if (arg0) {
            field3051++;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 28)
    public static final void method1447(int arg0) {
        field3045++;
        class121.field1862.method750((byte) 107);
        if (arg0 != 4096) {
            field3042 = (String[]) null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V", line = 50)
    public static void method1448(byte arg0) {
        field3042 = null;
        if (arg0 != 78) {
            method1446(true, 23);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIFIIZII)[[I", line = 62)
    public static final int[][] method1449(int arg0, int arg1, int arg2, float arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        field3040++;
        int[][] var9 = new int[arg1][arg0];
        class313 var10 = new class313();
        var10.field4854 = arg6;
        var10.field4861 = (int) (arg3 * 4096.0F);
        var10.field4847 = arg4;
        var10.field4859 = arg5;
        var10.field4851 = arg2;
        var10.method100(true);
        class5.method38(arg0, arg1, arg7 + 927531564);
        for (int var11 = arg7; var11 < arg1; var11++) {
            var10.method2139(var11, 3228, var9[var11]);
        }
        return var9;
    }
}
