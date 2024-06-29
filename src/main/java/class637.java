import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public class class637 extends class540 {

    @OriginalMember(owner = "client!cia", name = "k", descriptor = "Ljava/lang/String;")
    public String field8964;

    @OriginalMember(owner = "client!cia", name = "i", descriptor = "I")
    public static int field8962 = 0;

    @OriginalMember(owner = "client!cia", name = "m", descriptor = "[S")
    public static short[] field8966 = new short[256];

    @OriginalMember(owner = "client!cia", name = "j", descriptor = "I")
    public static int field8963;

    @OriginalMember(owner = "client!cia", name = "l", descriptor = "I")
    public static int field8965;

    @OriginalMember(owner = "client!cia", name = "n", descriptor = "I")
    public static int field8967;

    @OriginalMember(owner = "client!cia", name = "o", descriptor = "I")
    public static int field8968;

    @OriginalMember(owner = "client!cia", name = "p", descriptor = "I")
    public static int field8969;

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(B)V")
    public static final void method3626(byte arg0) {
        class567.field8027.method2364(1);
        field8963++;
        int var1 = -66 / ((30 - arg0) / 37);
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(Z)V")
    public static void method3627(boolean arg0) {
        field8966 = null;
        if (arg0) {
            field8966 = null;
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(BI)Z")
    public static final boolean method3628(byte arg0, int arg1) {
        if (arg0 != 2) {
            method3626((byte) -96);
        }
        field8965++;
        return arg1 == 19 || arg1 == 57 || arg1 == 1009 || arg1 == 60 || arg1 == 10;
    }

    @OriginalMember(owner = "client!cia", name = "<init>", descriptor = "()V")
    public class637() {
    }

    @OriginalMember(owner = "client!cia", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class637(String arg0, int arg1) {
        this.field8964 = arg0;
    }
}
