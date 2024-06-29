import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class146 {

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public int field2075;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "Ltr;")
    public class311 field2071;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "[I")
    public int[] field2074;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IJ)V", line = 15)
    public static final void method1094(int arg0, long arg1) {
        if (arg0 != -17062) {
            field2072 = 8;
        }
        class295.field4283.setTime(new Date(arg1));
        field2073++;
    }
}
