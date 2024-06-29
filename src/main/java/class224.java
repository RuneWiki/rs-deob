import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class224 {

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "[S")
    public static short[] field3110 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field3111 = 0;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "[I")
    public static int[] field3113 = new int[2048];

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "Lwi;")
    public static class330 field3112 = new class330(8);

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "[I")
    public static int[] field3114 = new int[1024];

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IB)V")
    public static final void method1505(int arg0, byte arg1) {
        int var2 = -36 / ((-arg1 - 75) / 35);
        field3109++;
        class177 var3 = class344.method2229(14, arg0, (byte) 95);
        var3.method1194(-73);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V")
    public static void method1506(byte arg0) {
        field3114 = null;
        field3113 = null;
        if (arg0 != -84) {
            method1505(-120, (byte) -49);
        }
        field3112 = null;
        field3110 = null;
    }
}
