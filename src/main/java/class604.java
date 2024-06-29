import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class604 {

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field8475 = -1;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "Llk;")
    public static class638 field8477 = new class638(8);

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "[I")
    public static int[] field8478 = new int[14];

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "D")
    public static double field8481;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "F")
    public static float field8479;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field8476;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "Lae;")
    public static class283 field8480;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V", line = 3)
    public static final void method3489(byte arg0) {
        field8476++;
        class175.field2207 = null;
        class306.field4440 = -1;
        if (arg0 != 56) {
            method3489((byte) 39);
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)V", line = 25)
    public static void method3490(byte arg0) {
        field8478 = null;
        field8480 = null;
        int var1 = -31 / ((30 - arg0) / 62);
        field8477 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lr;III[Z)V", line = 50)
    public static final void method3491(class113 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class661.field9303 == class594.field8355) {
            return;
        }
        int var5 = class95.field1115[arg1].method2529(arg3, arg2, (byte) -128);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class418 var7 = class95.field1115[var6];
                if (var7 != null) {
                    var7.method1364(arg0, arg2, var5 - var7.method2529(arg3, arg2, (byte) -128), arg3, 0, false);
                }
            }
        }
    }
}
