import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class727 {

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public int field10046;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public int field10048;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public int field10047;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public int field10042;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "[Ljava/awt/Color;")
    public static Color[] field10045 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "Lfga;")
    public static class267 field10049 = new class267();

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field10044;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "[I")
    public static int[] field10043;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)Lic;", line = 3)
    public final class727 method4069(int arg0, byte arg1) {
        if (arg1 < 103) {
            return null;
        } else {
            field10044++;
            return new class727(this.field10046, arg0, this.field10048, this.field10047);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V", line = 14)
    public static void method4070(int arg0) {
        if (arg0 < 93) {
            field10049 = null;
        }
        field10045 = null;
        field10049 = null;
        field10043 = null;
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(IIII)V", line = 38)
    public class727(int arg0, int arg1, int arg2, int arg3) {
        this.field10046 = arg0;
        this.field10048 = arg2;
        this.field10047 = arg3;
        this.field10042 = arg1;
    }
}
