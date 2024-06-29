import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public abstract class class452 extends class251 {

    @OriginalMember(owner = "client!h", name = "t", descriptor = "I")
    public static int field6953 = 0;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "[[[I")
    public static int[][][] field6956 = new int[2][][];

    @OriginalMember(owner = "client!h", name = "u", descriptor = "I")
    public static int field6954;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "I")
    public static int field6955;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V", line = 3)
    public static void method2698(byte arg0) {
        if (arg0 == -20) {
            field6956 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IC)Z", line = 13)
    public static final boolean method2699(int arg0, char arg1) {
        if (arg0 != -11706) {
            method2699(-89, (char) 65513);
        }
        field6954++;
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(I)V", line = 35)
    public static final void method2700(int arg0) {
        if (arg0 == -58) {
            class187.field2965 = true;
            field6955++;
        }
    }
}
