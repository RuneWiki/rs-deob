import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class415 {

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public int field5333;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    private int field5337;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field5338 = new String[5];

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public static int field5339 = 0;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "Le;")
    public static class702 field5332;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "Ljava/awt/Image;")
    public static Image field5335;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)I", line = 3)
    public final int method2340(int arg0) {
        field5336++;
        if (arg0 >= -8) {
            this.method2340(106);
        }
        return this.field5337;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(II)V", line = 23)
    public class415(int arg0, int arg1) {
        this.field5333 = arg1;
        this.field5337 = arg0;
    }

    @OriginalMember(owner = "client!nj", name = "toString", descriptor = "()Ljava/lang/String;", line = 38)
    public final String toString() {
        field5334++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V", line = 49)
    public static void method2341(int arg0) {
        field5338 = null;
        field5335 = null;
        int var1 = -99 / ((55 - arg0) / 52);
        field5332 = null;
    }
}
