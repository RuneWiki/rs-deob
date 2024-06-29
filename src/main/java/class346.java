import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class346 {

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "[[Z")
    public static boolean[][] field5019 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field5022 = 0;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field5020 = 0;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field5021 = -1;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static void method2167(int arg0) {
        field5019 = null;
        if (arg0 != -26924) {
            method2167(-57);
        }
    }
}
