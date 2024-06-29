import java.awt.Image;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class687 implements class540 {

    @OriginalMember(owner = "client!lw", name = "f", descriptor = "Lti;")
    public class463 field9552;

    @OriginalMember(owner = "client!lw", name = "i", descriptor = "I")
    public int field9555;

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "I")
    public int field9548;

    @OriginalMember(owner = "client!lw", name = "g", descriptor = "I")
    public int field9553;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "Lin;")
    public class97 field9547;

    @OriginalMember(owner = "client!lw", name = "h", descriptor = "[I")
    public static int[] field9554 = new int[1];

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "I")
    public static int field9550;

    @OriginalMember(owner = "client!lw", name = "e", descriptor = "I")
    public static int field9551;

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "Ljava/awt/Image;")
    public static Image field9549;

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)V", line = 4)
    public static void method3876(int arg0) {
        field9549 = null;
        if (arg0 != 1) {
            method3876(-80);
        }
        field9554 = null;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)Lsaa;", line = 16)
    public class345 method1656(int arg0) {
        if (arg0 != 0) {
            this.field9555 = 45;
        }
        field9551++;
        return class523.field7392;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ZLjava/io/File;)[B", line = 35)
    public static final byte[] method3877(boolean arg0, File arg1) {
        field9550++;
        if (!arg0) {
            method3877(false, null);
        }
        return class645.method3699(arg1, (int) arg1.length(), (byte) -43);
    }

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(ILin;Lti;II)V", line = 48)
    public class687(int arg0, class97 arg1, class463 arg2, int arg3, int arg4) {
        this.field9552 = arg2;
        this.field9555 = arg4;
        this.field9548 = arg3;
        this.field9553 = arg0;
        this.field9547 = arg1;
    }
}
