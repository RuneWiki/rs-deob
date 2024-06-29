import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class418 extends class161 {

    @OriginalMember(owner = "client!no", name = "l", descriptor = "I")
    public int field6186;

    @OriginalMember(owner = "client!no", name = "m", descriptor = "I")
    public int field6187;

    @OriginalMember(owner = "client!no", name = "s", descriptor = "Ljava/lang/String;")
    public String field6193;

    @OriginalMember(owner = "client!no", name = "v", descriptor = "I")
    public int field6196;

    @OriginalMember(owner = "client!no", name = "w", descriptor = "Ljava/lang/String;")
    public String field6197;

    @OriginalMember(owner = "client!no", name = "t", descriptor = "J")
    public long field6194;

    @OriginalMember(owner = "client!no", name = "r", descriptor = "I")
    public int field6192;

    @OriginalMember(owner = "client!no", name = "p", descriptor = "I")
    public static int field6190 = 0;

    @OriginalMember(owner = "client!no", name = "q", descriptor = "[S")
    public static short[] field6191 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!no", name = "x", descriptor = "I")
    public static int field6198 = 0;

    @OriginalMember(owner = "client!no", name = "n", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!no", name = "o", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!no", name = "u", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!no", name = "d", descriptor = "(I)V", line = 11)
    public static void method2613(int arg0) {
        if (arg0 == -1) {
            field6191 = null;
        }
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIJII)V", line = 34)
    public class418(String arg0, String arg1, int arg2, int arg3, long arg4, int arg5, int arg6) {
        this.field6186 = arg6;
        this.field6187 = arg5;
        this.field6193 = arg0;
        this.field6196 = arg2;
        this.field6197 = arg1;
        this.field6194 = arg4;
        this.field6192 = arg3;
    }
}
