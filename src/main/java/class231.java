import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class231 {

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "[I")
    public static int[] field3867 = new int[14];

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field3871 = 0;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field3870 = 0;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "Llk;")
    public static class174 field3866;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
    public static final void method1542(byte arg0) {
        field3869++;
        if (arg0 != 10) {
            method1543((byte) 119);
        }
        if (class63.field1096 != null) {
            class252 var1 = class63.field1096;
            synchronized (class63.field1096) {
                class63.field1096 = null;
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)V")
    public static void method1543(byte arg0) {
        field3866 = null;
        if (arg0 < 123) {
            method1542((byte) 74);
        }
        field3867 = null;
    }
}
