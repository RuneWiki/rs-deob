import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public abstract class class520 {

    @OriginalMember(owner = "client!si", name = "c", descriptor = "[I")
    public static int[] field7081 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field7079;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field7080;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "Z")
    public static boolean field7082;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)I", line = 11)
    public static final int method2963(boolean arg0) {
        field7079++;
        return arg0 ? class203.field2862 : 30;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V", line = 23)
    public static final void method2964(byte arg0) {
        field7080++;
        class528.field7160 = 0;
        if (arg0 != -102) {
            return;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            class437.field6082[var1] = null;
            class78.field1188[var1] = 1;
            class320.field4382[var1] = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V", line = 45)
    public static void method2965(int arg0) {
        field7081 = null;
        if (arg0 != 14247) {
            field7081 = null;
        }
    }
}
