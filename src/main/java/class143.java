import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class143 extends class392 {

    @OriginalMember(owner = "client!bfa", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field1936 = new String[200];

    @OriginalMember(owner = "client!bfa", name = "B", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!bfa", name = "C", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!bfa", name = "E", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!bfa", name = "F", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!bfa", name = "G", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(FI)V", line = 8)
    public final void method212(float arg0, int arg1) {
        if (arg1 != -25467) {
            method821((byte) 35);
        }
        super.field5249 = arg0;
        ++field1941;
    }

    @OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(IIIIIF)V", line = 20)
    public class143(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lla;)V", line = 24)
    public static final void method818(class409 arg0) {
        class17.field222 = arg0;
    }

    @OriginalMember(owner = "client!bfa", name = "d", descriptor = "(I)V", line = 27)
    public static final void method819(int arg0) {
        class674.field9590 = false;
        ++field1939;
        class576.method3180(class102.field1224, class172.field2446, class114.field1464, class464.field6078, -85);
        if (arg0 != 200) {
            method818((class409) null);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "d", descriptor = "(B)V", line = 47)
    public static final void method820(byte arg0) {
        if (arg0 == -114) {
            ++field1938;
            class206.field2757.method2168((byte) -68);
            class315.field4217.method2168((byte) -72);
            class615.field8516.method2168((byte) -99);
            class302.field3992.method2168((byte) -102);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IIIB)V", line = 61)
    public final void method211(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 79) {
            method818((class409) null);
        }
        super.field5246 = arg0;
        super.field5244 = arg1;
        super.field5237 = arg2;
        ++field1937;
    }

    @OriginalMember(owner = "client!bfa", name = "e", descriptor = "(B)V", line = 74)
    public static void method821(byte arg0) {
        field1936 = null;
        if (arg0 != 20) {
            method819(105);
        }
    }
}
