import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class584 extends class579 {

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "[Lpj;")
    public class40[] field7972;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "[F")
    public static float[] field7970 = new float[4];

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field7971 = new String[100];

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field7969 = 0;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V", line = 6)
    public static void method3386(int arg0) {
        if (arg0 != 4) {
            method3386(-93);
        }
        field7971 = null;
        field7970 = null;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "([Lpj;)V", line = 28)
    public class584(class40[] arg0) {
        this.field7972 = arg0;
    }
}
