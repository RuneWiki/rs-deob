import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class36 extends class301 {

    @OriginalMember(owner = "client!nl", name = "J", descriptor = "Lue;")
    public class19 field797;

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "Z")
    public static boolean field786 = false;

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "[I")
    public static int[] field785 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!nl", name = "E", descriptor = "Ljava/lang/String;")
    public static String field793 = "M";

    @OriginalMember(owner = "client!nl", name = "G", descriptor = "[I")
    public static int[] field794 = new int[50];

    @OriginalMember(owner = "client!nl", name = "A", descriptor = "Ljava/lang/String;")
    public static String field789 = "skill: ";

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "I")
    public int field788;

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "I")
    public int field791;

    @OriginalMember(owner = "client!nl", name = "D", descriptor = "I")
    public int field792;

    @OriginalMember(owner = "client!nl", name = "H", descriptor = "I")
    public int field795;

    @OriginalMember(owner = "client!nl", name = "I", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!nl", name = "K", descriptor = "I")
    public int field798;

    @OriginalMember(owner = "client!nl", name = "L", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!nl", name = "M", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!nl", name = "N", descriptor = "I")
    public int field801;

    @OriginalMember(owner = "client!nl", name = "O", descriptor = "I")
    public int field802;

    @OriginalMember(owner = "client!nl", name = "P", descriptor = "I")
    public int field803;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIII)V", line = 19)
    public final void method264(int arg0, int arg1, int arg2, int arg3) {
        this.field795 = arg0;
        this.field792 = arg2;
        if (arg3 <= 90) {
            field794 = (int[]) null;
        }
        this.field798 = arg1;
        field796++;
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)V", line = 48)
    public static final void method265(int arg0) {
        if (arg0 != -22881) {
            field785 = (int[]) null;
        }
        field799++;
        class274.field4463.method889((byte) 73);
    }

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "(I)V", line = 63)
    public static void method266(int arg0) {
        field793 = null;
        field789 = null;
        field794 = null;
        if (arg0 > -64) {
            field794 = (int[]) null;
        }
        field785 = null;
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lue;Lgl;)V", line = 85)
    public class36(class19 arg0, class214 arg1) {
        this.field797 = arg0;
    }
}
