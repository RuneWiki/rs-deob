import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class160 extends class275 {

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "I")
    public static int field2099 = 64;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
    public static int field2092 = -1;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "I")
    public int field2094;

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
    public int field2097;

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "I")
    public int field2098;

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
    public int field2100;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "Lfg;")
    public class18 field2090;

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "[I")
    public static int[] field2096;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)V")
    public static void method1008(byte arg0) {
        field2096 = null;
        if (arg0 != 47) {
            field2092 = 57;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIB)V")
    public static final void method1009(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (class180.field2375 <= arg0 && arg0 <= class50.field695) {
            int var5 = class143.method950(arg4 - 15574, class297.field4268, class203.field2942, arg3);
            int var6 = class143.method950(-15543, class297.field4268, class203.field2942, arg2);
            class167.method1039(var5, arg0, var6, arg1, (byte) 118);
        }
        if (arg4 != 31) {
            method1008((byte) -90);
        }
        field2093++;
    }
}
