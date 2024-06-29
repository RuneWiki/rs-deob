import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class167 extends class301 {

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "Lbf;")
    public class363 field2787;

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field2790 = new String[1000];

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "Ljava/lang/String;")
    public static String field2791 = "flash2:";

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "[[[I")
    public static int[][][] field2793;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)V", line = 7)
    public static void method1188(int arg0) {
        field2793 = (int[][][]) null;
        if (arg0 != -1290) {
            method1189(27, (String) null);
        }
        field2791 = null;
        field2790 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILjava/lang/String;)J", line = 25)
    public static final long method1189(int arg0, String arg1) {
        long var2 = (long) arg0;
        int var4 = arg1.length();
        field2788++;
        for (int var5 = 0; var5 < var4; var5++) {
            char var6 = arg1.charAt(var5);
            var2 *= 37L;
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BI)I", line = 67)
    public static final int method1190(byte arg0, int arg1) {
        field2792++;
        if (arg0 != 41) {
            field2793 = (int[][][]) ((int[][][]) null);
        }
        return arg1 == 16711935 ? -1 : class71.method544(arg1, 29062);
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)V", line = 82)
    public static final void method1191(int arg0, int arg1) {
        field2789++;
        class23.field575.method896(arg1, (byte) -14);
        if (arg0 != 6534) {
            method1191(23, 28);
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lbf;)V", line = 101)
    public class167(class363 arg0) {
        this.field2787 = arg0;
    }
}
