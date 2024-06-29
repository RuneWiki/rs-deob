import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public abstract class class524 extends class644 {

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "I")
    public int field7326;

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "Lhh;")
    public class132 field7327;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "[[Z")
    public static boolean[][] field7325 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field7328 = new String[200];

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
    public static int field7329 = 1407;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method681(int arg0);

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)V")
    public static void method3038(byte arg0) {
        int var1 = 88 % ((54 - arg0) / 39);
        field7325 = null;
        field7328 = null;
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lhh;I)V")
    public class524(class132 arg0, int arg1) {
        this.field7326 = arg1;
        this.field7327 = arg0;
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)Z")
    public abstract boolean method682(int arg0);
}
