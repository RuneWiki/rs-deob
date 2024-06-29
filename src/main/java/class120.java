import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class120 extends class166 {

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
    public int field1932;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "Ljava/lang/String;")
    public static String field1934 = "Loading textures - ";

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "[I")
    public static int[] field1933 = new int[32];

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
    public class120() {
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(B)V")
    public static void method835(byte arg0) {
        if (arg0 == 115) {
            field1933 = null;
            field1934 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(I)V")
    public class120(int arg0) {
        this.field1932 = arg0;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)Z")
    public static final boolean method836(int arg0, int arg1) {
        if (arg0 != 32) {
            method836(49, -41);
        }
        field1935++;
        return arg1 >= 0 && arg1 < class152.field2378.length ? class152.field2378[arg1] : false;
    }
}
