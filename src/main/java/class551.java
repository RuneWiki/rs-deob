import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class551 {

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "Z")
    public static boolean field7877 = true;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field7876 = new String[100];

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "[Z")
    public static boolean[] field7879 = new boolean[8];

    @OriginalMember(owner = "client!uda", name = "e", descriptor = "I")
    public static int field7880;

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "Lnh;")
    public static class680 field7878;

    @OriginalMember(owner = "client!uda", name = "g", descriptor = "Ltf;")
    public static class701 field7882;

    @OriginalMember(owner = "client!uda", name = "f", descriptor = "[I")
    public static int[] field7881;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIII)V", line = 3)
    public static final void method3126(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 16) {
            field7880++;
            class16.field131 = new byte[arg3][arg0][arg2];
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lrb;Z[[[BIB)Z", line = 28)
    public static final boolean method3127(class383 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!class527.field7431) {
            return false;
        }
        int var5 = arg0.field5179 >> class559.field7984;
        int var6 = arg0.field5176 >> class559.field7984;
        if (var5 < class72.field731 || var5 >= class48.field497 || var6 < class76.field786 || var6 >= class112.field1184) {
            return true;
        } else if ((arg2 == null || arg0.field5166 < arg3 || arg2[arg0.field5166][var5][var6] != arg4) && arg0.method481(0) && !arg0.method483((byte) 115)) {
            return false;
        } else {
            if (!arg1 && var5 >= class309.field3830 - 16 && var5 <= class309.field3830 + 16 && var6 >= class379.field5139 - 16 && var6 <= class379.field5139 + 16) {
                if (class110.field1180) {
                    class472.field6799[class244.field3017++].method1221(arg0, (byte) -75);
                    class244.field3017 %= class531.field7481;
                } else {
                    arg0.method172(class568.field8078, false);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)V", line = 62)
    public static void method3128(int arg0) {
        field7882 = null;
        if (arg0 == 16) {
            field7879 = null;
            field7881 = null;
            field7876 = null;
            field7878 = null;
        }
    }
}
