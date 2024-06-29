import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class148 {

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "Z")
    public static boolean field2124 = false;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2128 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "Lth;")
    public static class57 field2130 = new class57(4);

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "B")
    public byte field2122;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    public int field2131;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "Lff;")
    public static class147 field2129;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "Ljava/lang/String;")
    public String field2125;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "Ljava/lang/String;")
    public String field2126;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "Ljava/lang/String;")
    public String field2127;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BIIIII)V", line = 9)
    public static final void method1045(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class228.field3449[0].method1482(arg5, arg4);
        int var6 = 26 / ((arg0 + 46) / 37);
        int var7 = (arg1 - 32) * arg1 / arg2;
        field2132++;
        if (var7 < 8) {
            var7 = 8;
        }
        class228.field3449[1].method1482(arg5, arg1 + arg4 - 16);
        int var8 = (arg1 - var7 - 32) * arg3 / (arg2 - arg1);
        if (!class141.field2031) {
            class44.method317(arg5, arg4 + 16, 16, arg1 - 32, class102.field1473);
            class44.method317(arg5, var8 + arg4 + 16, 16, var7, class212.field3071);
            class44.method328(arg5, arg4 + var8 + 16, var7, class360.field5689);
            class44.method328(arg5 + 1, arg4 - -16 + var8, var7, class360.field5689);
            class44.method339(arg5, arg4 + var8 + 16, 16, class360.field5689);
            class44.method339(arg5, var8 + arg4 + 17, 16, class360.field5689);
            class44.method328(arg5 + 15, var8 + 16 + arg4, var7, class292.field4418);
            class44.method328(arg5 + 14, arg4 - -17 + var8, var7 - 1, class292.field4418);
            class44.method339(arg5, arg4 + var7 + var8 + 15, 16, class292.field4418);
            class44.method339(arg5 + 1, arg4 + 14 + var7 + var8, 15, class292.field4418);
            return;
        }
        class205.method1499(arg5, arg4 + 16, 16, arg1 - 32, class102.field1473);
        class205.method1499(arg5, arg4 + var8 + 16, 16, var7, class212.field3071);
        class205.method1495(arg5, arg4 - (-var8 - 16), var7, class360.field5689);
        class205.method1495(arg5 + 1, arg4 + var8 + 16, var7, class360.field5689);
        class205.method1485(arg5, var8 + arg4 + 16, 16, class360.field5689);
        class205.method1485(arg5, var8 + arg4 + 17, 16, class360.field5689);
        class205.method1495(arg5 + 15, arg4 + 16 + var8, var7, class292.field4418);
        class205.method1495(arg5 + 14, arg4 + 17 + var8, var7 - 1, class292.field4418);
        class205.method1485(arg5, var8 + var7 + arg4 + 15, 16, class292.field4418);
        class205.method1485(arg5 + 1, arg4 + var8 + 14 - -var7, 15, class292.field4418);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V", line = 62)
    public static void method1046(int arg0) {
        field2128 = null;
        if (arg0 == -32) {
            field2130 = null;
            field2129 = null;
        }
    }
}
