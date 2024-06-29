import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fia")
public class class575 {

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "J")
    public long field7890;

    @OriginalMember(owner = "client!fia", name = "f", descriptor = "I")
    public int field7894;

    @OriginalMember(owner = "client!fia", name = "g", descriptor = "I")
    public int field7895;

    @OriginalMember(owner = "client!fia", name = "c", descriptor = "Ljava/lang/String;")
    public String field7891;

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "Ljava/lang/String;")
    public String field7889;

    @OriginalMember(owner = "client!fia", name = "e", descriptor = "I")
    public static int field7893 = 0;

    @OriginalMember(owner = "client!fia", name = "d", descriptor = "Luh;")
    public static class168 field7892 = new class168();

    @OriginalMember(owner = "client!fia", name = "h", descriptor = "Lmu;")
    public static class303 field7896 = new class303(88, 10);

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(I)V")
    public static void method3318(int arg0) {
        field7892 = null;
        if (arg0 != 88) {
            method3318(-49);
        }
        field7896 = null;
    }

    @OriginalMember(owner = "client!fia", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
    public class575(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field7890 = arg4;
        this.field7894 = arg2;
        this.field7895 = arg0;
        this.field7891 = arg3;
        this.field7889 = arg1;
    }
}
