import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class517 {

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "I")
    public int field7064;

    @OriginalMember(owner = "client!hca", name = "f", descriptor = "[I")
    public int[] field7066;

    @OriginalMember(owner = "client!hca", name = "e", descriptor = "[I")
    public int[] field7065;

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "[I")
    public static int[] field7062 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!hca", name = "g", descriptor = "I")
    public static int field7067 = 0;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "[Lcj;")
    public static class723[] field7061;

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field7063;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)V", line = 7)
    public static void method2999(int arg0) {
        field7062 = null;
        if (arg0 != 7084) {
            field7061 = null;
        }
        field7061 = null;
        field7063 = null;
    }

    @OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(I)V", line = 24)
    public class517(int arg0) {
        this.field7064 = arg0;
        this.field7066 = new int[this.field7064];
        this.field7065 = new int[this.field7064];
    }
}
