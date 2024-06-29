import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class761 extends class337 {

    @OriginalMember(owner = "client!gda", name = "o", descriptor = "Ljava/lang/String;")
    public String field10378;

    @OriginalMember(owner = "client!gda", name = "l", descriptor = "I")
    public static int field10375 = -2;

    @OriginalMember(owner = "client!gda", name = "p", descriptor = "[[I")
    public static int[][] field10379 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!gda", name = "m", descriptor = "F")
    public static float field10376;

    @OriginalMember(owner = "client!gda", name = "n", descriptor = "Lwc;")
    public static class755 field10377;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(B)V", line = 3)
    public static void method4152(byte arg0) {
        field10377 = null;
        field10379 = null;
        if (arg0 <= 57) {
            field10379 = null;
        }
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "()V", line = 26)
    public class761() {
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 31)
    public class761(String arg0, int arg1) {
        this.field10378 = arg0;
    }
}
