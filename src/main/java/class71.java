import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class71 {

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field1003 = new String[200];

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "Z")
    public static boolean field1005 = false;

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "F")
    public static float field1006;

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(III)Z")
    public static final boolean method613(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method615((byte) -11);
        }
        field1007++;
        return class280.method1790(arg0, arg1, true) | (arg1 & 0x70000) != 0 || class238.method1578(5121, arg0, arg1);
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Ljava/awt/Canvas;ILd;I)Lha;")
    public static final class60 method614(Canvas arg0, int arg1, class151 arg2, int arg3) {
        field1004++;
        int var4 = 49 / ((arg3 + 4) / 60);
        return new class148(arg0, arg2, arg1);
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)V")
    public static void method615(byte arg0) {
        if (arg0 >= -5) {
            field1005 = true;
        }
        field1003 = null;
    }
}
