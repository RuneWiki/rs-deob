import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class174 {

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public int field2334 = 0;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "[I")
    public static int[] field2330 = new int[14];

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "[I")
    public static int[] field2335 = new int[32];

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "Lof;")
    public static class446 field2336 = new class446("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lnj;IB)V", line = 3)
    private final void method1174(class164 arg0, int arg1, byte arg2) {
        if (arg1 == 5) {
            this.field2334 = arg0.method1074(-635989152);
        }
        field2331++;
        if (arg2 > -123) {
            this.method1174(null, -37, (byte) 90);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lnj;B)V", line = 22)
    public final void method1175(class164 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1087(false);
            if (var3 == 0) {
                field2333++;
                int var4 = -83 % ((57 - arg1) / 39);
                return;
            }
            this.method1174(arg0, var3, (byte) -128);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)V", line = 51)
    public static void method1176(boolean arg0) {
        field2336 = null;
        field2335 = null;
        if (!arg0) {
            field2335 = null;
        }
        field2330 = null;
    }
}
