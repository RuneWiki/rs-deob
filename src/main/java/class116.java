import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class116 {

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "Ljava/lang/String;")
    public String field1209;

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "Ljava/lang/String;")
    public String field1208;

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "Ljava/lang/String;")
    public String field1210;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!uaa", name = "e", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!uaa", name = "f", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "([IB[Ljava/lang/Object;)V", line = 5)
    public static final void method764(int[] arg0, byte arg1, Object[] arg2) {
        field1207++;
        if (arg1 != -90) {
            field1211 = 110;
        }
        class513.method3031(arg0.length - 1, -29868, arg2, arg0, 0);
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IIBII)V", line = 19)
    public static final void method765(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1212++;
        if (arg2 >= -67) {
            field1211 = 110;
        }
        class47 var5 = class258.method1546(10, arg3, (byte) 121);
        var5.method271((byte) 126);
        var5.field519 = arg4;
        var5.field514 = arg1;
        var5.field507 = arg0;
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 35)
    public class116(String arg0, String arg1, String arg2) {
        this.field1209 = arg2;
        this.field1208 = arg0;
        this.field1210 = arg1;
    }
}
