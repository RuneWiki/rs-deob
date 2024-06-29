import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class154 extends class112 {

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
    public int field1912;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "I")
    public int field1915;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
    public int field1916;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
    public int field1917;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "Lkg;")
    public class287 field1918;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIBI)V", line = 4)
    public static final void method1096(int arg0, int arg1, byte arg2, int arg3) {
        field1914++;
        if (arg3 == 1004) {
            class142.method1038(class116.field1471, arg0, arg1);
        } else if (arg3 == 1009) {
            class142.method1038(class656.field9048, arg0, arg1);
        } else if (arg3 == 1002) {
            class142.method1038(class458.field6462, arg0, arg1);
        } else if (arg3 == 1001) {
            class142.method1038(class403.field5265, arg0, arg1);
        } else if (arg3 == 1006) {
            class142.method1038(class404.field5321, arg0, arg1);
        }
        if (arg2 <= 53) {
            method1096(9, 122, (byte) -28, 53);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)Z", line = 40)
    public static final boolean method1097(byte arg0) {
        if (arg0 == 85) {
            field1913++;
            return class37.method326((byte) 124, "jaclib") ? class37.method326((byte) 102, "hw3d") : false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILs;)V", line = 58)
    public static final void method1098(int arg0, class296 arg1) {
        class621.field8523[arg0] = arg1;
    }
}
