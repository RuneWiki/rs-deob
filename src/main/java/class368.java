import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class368 {

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "Ljava/lang/String;")
    public static String field5603 = "";

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "Z")
    public static boolean field5604 = false;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V", line = 6)
    public static void method2195(int arg0) {
        field5603 = null;
        if (arg0 != 5) {
            field5604 = false;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILgo;)Z", line = 16)
    public static final boolean method2196(int arg0, class310 arg1) {
        field5602++;
        if (class317.field4895 == arg1.field4680) {
            class219.field3135 = 250;
            return true;
        } else {
            if (arg0 != -12285) {
                field5603 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIZ)I", line = 38)
    public static final int method2197(int arg0, int arg1, int arg2, boolean arg3) {
        field5600++;
        class411 var4 = class171.method1179(arg3, true, arg0);
        if (arg1 < 123) {
            field5604 = false;
        }
        if (var4 == null) {
            return 0;
        } else if (arg2 >= 0 && arg2 < var4.field6201.length) {
            return var4.field6201[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(III)Z", line = 58)
    public static final boolean method2198(int arg0, int arg1, int arg2) {
        field5605++;
        if (arg0 != -6943) {
            field5603 = null;
        }
        return (arg2 & 0x60000) != 0 | class506.method2989(arg1, 70, arg2) || class242.method1474(arg2, arg0 + 6910, arg1) || class341.method2082(arg2, arg1, -98);
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(III)I", line = 75)
    public static final int method2199(int arg0, int arg1, int arg2) {
        field5601++;
        int var3 = 92 / ((arg0 - 41) / 35);
        return arg2 == 4 || arg2 == 5 ? class11.field108[arg1 & 0x3] : 256;
    }
}
