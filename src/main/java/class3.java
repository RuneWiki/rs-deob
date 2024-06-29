import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class3 {

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public static volatile int field29 = 0;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "Ljava/lang/String;")
    public static String field30 = "Connection lost.";

    @OriginalMember(owner = "client!il", name = "b", descriptor = "Z")
    public static boolean field27 = false;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public static int field32 = -1;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "Lug;")
    public static class253 field31;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "Z")
    public static boolean field26;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V", line = 4)
    public static void method11(byte arg0) {
        field30 = null;
        field31 = null;
        if (arg0 != 60) {
            field32 = 97;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZLcd;II)V", line = 18)
    public static final void method12(boolean arg0, class136 arg1, int arg2, int arg3) {
        field28++;
        if (class56.field777 != null || class238.field3729 || arg1 == null || class105.method723(arg1, (byte) 40) == null) {
            return;
        }
        class56.field777 = arg1;
        class130.field1929 = class105.method723(arg1, (byte) 40);
        class18.field293 = arg2;
        class5.field62 = arg3;
        class172.field2828 = 0;
        class283.field4390 = arg0;
    }
}
