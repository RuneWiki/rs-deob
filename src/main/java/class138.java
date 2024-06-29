import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class138 {

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "[I")
    public static int[] field2014 = new int[128];

    @OriginalMember(owner = "client!jba", name = "e", descriptor = "Z")
    public static boolean field2016;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!jba", name = "f", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "Z")
    public static boolean field2013;

    static {
        for (int var0 = 0; var0 < field2014.length; var0++) {
            field2014[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; var1++) {
            field2014[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; var2++) {
            field2014[var2] = var2 + 26 - 97;
        }
        for (int var3 = 48; var3 <= 57; var3++) {
            field2014[var3] = var3 + 4;
        }
        field2014[45] = field2014[47] = 63;
        field2014[42] = field2014[43] = 62;
        field2016 = false;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Z)V", line = 4)
    public static void method976(boolean arg0) {
        if (arg0) {
            method978(-21, -126, 44);
        }
        field2014 = null;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(III)I", line = 15)
    public static final int method977(int arg0, int arg1, int arg2) {
        if (arg2 < arg0) {
            int var3 = arg2;
            arg2 = arg0;
            arg0 = var3;
        }
        field2015++;
        if (arg1 != -1) {
            return 4;
        }
        while (arg0 != 0) {
            int var4 = arg2 % arg0;
            arg2 = arg0;
            arg0 = var4;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(III)Z", line = 42)
    public static final boolean method978(int arg0, int arg1, int arg2) {
        field2012++;
        if (arg1 != 128) {
            method978(66, -122, 45);
        }
        return class115.method856(arg0, arg2, (byte) 4) & class678.method3811(arg2, -79, arg0);
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIIIII)V", line = 53)
    public static final void method979(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2017++;
        int var6 = -86 % ((arg1 - 31) / 46);
        if (arg4 >= class175.field2455 && arg3 <= class375.field5631 && class323.field4704 <= arg0 && class148.field2106 >= arg2) {
            class401.method2483(10050, arg2, arg3, arg0, arg4, arg5);
        } else {
            class395.method2455(arg0, arg2, arg5, arg3, arg4, -2413);
        }
    }
}
