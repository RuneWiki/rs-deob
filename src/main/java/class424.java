import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class424 extends InputStream {

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "[F")
    public static float[] field6060 = new float[16384];

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "[F")
    public static float[] field6062 = new float[16384];

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "F")
    public static float field6065;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public static int field6066;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field6060[var2] = (float) Math.sin((double) var2 * var0);
            field6062[var2] = (float) Math.cos((double) var2 * var0);
        }
    }

    @OriginalMember(owner = "client!pi", name = "read", descriptor = "()I", line = 5)
    public final int read() {
        field6066++;
        class428.method2624(1, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V", line = 21)
    public static void method2510(int arg0) {
        field6060 = null;
        if (arg0 >= -81) {
            field6061 = -29;
        }
        field6062 = null;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V", line = 35)
    public static final void method2511(int arg0) {
        if (class296.field4338 < 0) {
            class296.field4338 = 0;
            class53.field639 = -1;
            class17.field147 = -1;
        }
        field6064++;
        if (class113.field1438 < class296.field4338) {
            class17.field147 = -1;
            class53.field639 = -1;
            class296.field4338 = class113.field1438;
        }
        if (arg0 < ~class527.field7824) {
            class527.field7824 = 0;
            class53.field639 = -1;
            class17.field147 = -1;
        }
        if (class527.field7824 > class113.field1439) {
            class527.field7824 = class113.field1439;
            class53.field639 = -1;
            class17.field147 = -1;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)V", line = 74)
    public static final void method2512(byte arg0, int arg1) {
        field6063++;
        class621 var2 = class442.method2691(arg1, 4, true);
        if (arg0 != 21) {
            method2511(-97);
        }
        var2.method3598(255);
    }
}
