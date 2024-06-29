import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class158 {

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "I")
    public static int field1997 = 0;

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "Z")
    public static boolean field1999 = false;

    @OriginalMember(owner = "client!wea", name = "f", descriptor = "Lea;")
    public static class547 field2002 = new class547(37, -2);

    @OriginalMember(owner = "client!wea", name = "d", descriptor = "F")
    public static float field2000;

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!wea", name = "e", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(IB)V", line = 3)
    public static final void method948(int arg0, byte arg1) {
        field2001++;
        if (class8.field55 == 1) {
            class226.field2932 = arg0;
        } else if (class8.field55 == 2) {
            class173.field2146 = arg0;
        }
        if (arg1 != -55) {
            method948(27, (byte) -126);
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(II)I", line = 21)
    public static int method949(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)V", line = 52)
    public static final void method950(int arg0) {
        if (class493.field6722 != null) {
            for (int var1 = 0; var1 < class493.field6722.length; var1++) {
                for (int var2 = 0; var2 < class493.field6722[var1].length; var2++) {
                    class493.field6722[var1][var2] = class518.field6971;
                }
            }
        }
        field1998++;
        if (arg0 != 0) {
            method950(-48);
        }
    }

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "(I)V", line = 85)
    public static void method951(int arg0) {
        field2002 = null;
        if (arg0 <= 75) {
            method950(91);
        }
    }
}
