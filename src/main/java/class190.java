import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class190 {

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field3070 = 0;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3072 = "Loaded config";

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "Lgk;")
    public static class184 field3071;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
    public static void method1321(byte arg0) {
        field3072 = null;
        field3071 = null;
        if (arg0 != 116) {
            method1321((byte) -53);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)Z")
    public static final boolean method1322(int arg0, int arg1) {
        if (arg1 != 22389) {
            return false;
        }
        field3073++;
        if (class99.field1328 == arg0) {
            return false;
        }
        class239.field3943 = new int[104][104];
        class67.field843 = new int[4][13][13];
        for (int var2 = 0; var2 < 4; var2++) {
            class187.field2975[var2] = new class144(104, 104);
        }
        class18.field218 = new byte[4][104][104];
        class206.field3296 = new class269[4][104][104];
        class117.field1664 = new byte[4][104][104];
        class99.field1328 = arg0;
        return true;
    }
}
