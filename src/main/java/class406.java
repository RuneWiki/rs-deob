import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class406 {

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field5636 = 0;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public static int field5638 = 0;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field5640;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method2484(boolean arg0) {
        class410 var1 = class105.field1538;
        synchronized (class105.field1538) {
            class105.field1538.method2533(0);
        }
        field5641++;
        if (!arg0) {
            method2484(true);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZ)Ljava/lang/String;", line = 17)
    public static final String method2485(int arg0, boolean arg1) {
        field5640++;
        if (arg0 < 999999999) {
            return Integer.toString(arg0);
        } else {
            if (!arg1) {
                method2485(54, true);
            }
            return "*";
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIII)I", line = 31)
    public static final int method2486(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 == -440486200) {
            field5637++;
            int var4 = ((arg1 & 0xFF00FF) * arg0 & 0xFF00FF00 | (arg1 & 0xFF00) * arg0 & 0xFF0000) >>> 8;
            int var5 = 255 - arg0;
            return (((arg2 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg2 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
        } else {
            return -29;
        }
    }
}
