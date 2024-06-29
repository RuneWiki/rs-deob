import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class199 extends class502 {

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "I")
    public static int field2886 = -1;

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "Lhi;")
    public static class193 field2887 = new class193(1);

    @OriginalMember(owner = "client!eq", name = "o", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!eq", name = "p", descriptor = "I")
    public int field2889;

    @OriginalMember(owner = "client!eq", name = "q", descriptor = "I")
    public int field2890;

    @OriginalMember(owner = "client!eq", name = "r", descriptor = "I")
    public int field2891;

    @OriginalMember(owner = "client!eq", name = "s", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!eq", name = "t", descriptor = "I")
    public int field2893;

    @OriginalMember(owner = "client!eq", name = "v", descriptor = "I")
    public int field2895;

    @OriginalMember(owner = "client!eq", name = "w", descriptor = "I")
    public int field2896;

    @OriginalMember(owner = "client!eq", name = "y", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!eq", name = "z", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!eq", name = "x", descriptor = "Lst;")
    public static class403 field2897;

    @OriginalMember(owner = "client!eq", name = "u", descriptor = "Ljava/lang/String;")
    public String field2894;

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field2885;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 11)
    public static final String method1284(String arg0, int arg1) {
        if (arg1 != -28223) {
            return null;
        }
        field2888++;
        if (class360.field4864.startsWith("win")) {
            return arg0 + ".dll";
        } else if (class360.field4864.startsWith("linux")) {
            return "lib" + arg0 + ".so";
        } else if (class360.field4864.startsWith("mac")) {
            return "lib" + arg0 + ".dylib";
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(BI)V", line = 33)
    public static final void method1285(byte arg0, int arg1) {
        field2898++;
        class683.field9616 = -1;
        int var2 = 23 / ((arg0 - 43) / 33);
        class613.field8098 = arg1;
        class615.field8140 = -1;
        class659.method3693(1290);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)V", line = 49)
    public static void method1286(byte arg0) {
        field2885 = null;
        if (arg0 >= -47) {
            method1284(null, -20);
        }
        field2887 = null;
        field2897 = null;
    }
}
