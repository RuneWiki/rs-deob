import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class39 extends class86 {

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "Lta;")
    public static class262 field649 = new class262(50);

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "I")
    public static int field662 = 0;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public int field645;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    public int field648;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
    public int field652;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
    public int field655;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "I")
    public int field656;

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "Lag;")
    public class188 field651;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "Lag;")
    public class188 field657;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "Lag;")
    public static class188 field658;

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "Lpe;")
    public static class252 field659;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "Lbb;")
    public static class91 field661;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "Ljava/lang/String;")
    public String field653;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "Z")
    public boolean field646;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "[Ljava/lang/Object;")
    public Object[] field647;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "[[[I")
    public static int[][][] field654;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
    public static void method342(int arg0) {
        field658 = null;
        if (arg0 <= -121) {
            field654 = null;
            field661 = null;
            field649 = null;
            field659 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method343(String arg0, int arg1) {
        field650++;
        if (arg1 != 5509) {
            field662 = 17;
        }
        return arg0.length() + 1;
    }
}
