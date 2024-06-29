import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public abstract class class159 {

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2441 = "Walk here";

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ldl;ILdl;Lnd;)V")
    public static final void method1065(class123 arg0, int arg1, class123 arg2, class263 arg3) {
        if (arg1 != 1) {
            method1068((class123) null, -46, (class123) null);
        }
        class35.field448 = arg3;
        field2440++;
        class175.field2745 = arg0;
        class235.field3767 = arg2;
        if (class175.field2745 != null) {
            class157.field2426 = class175.field2745.method820(1, 112);
        }
        if (class235.field3767 != null) {
            class136.field2037 = class235.field3767.method820(1, arg1 ^ 0x71);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
    public static void method1066(int arg0) {
        field2441 = null;
        if (arg0 != 2014593029) {
            method1067(-33, -51, true);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIZ)V")
    public static final void method1067(int arg0, int arg1, boolean arg2) {
        field2439++;
        if (class74.method509(arg1, 0) && !arg2) {
            class151.method1006(class104.field1608[arg1], arg0, -4545);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ldl;ILdl;)V")
    public static final void method1068(class123 arg0, int arg1, class123 arg2) {
        class201.field3138 = arg0;
        field2438++;
        class189.field2981 = arg2;
        int var3 = -50 % ((34 - arg1) / 47);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static final long method1069(String arg0, int arg1) {
        long var2 = 0L;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 = ((var2 << 5) + ((long) arg0.charAt(var5))) - var2;
        }
        if (arg1 != 1) {
            field2441 = null;
        }
        field2442++;
        return var2;
    }
}
