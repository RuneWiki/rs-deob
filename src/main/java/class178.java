import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public abstract class class178 extends class305 {

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field2869 = new String[1000];

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(B)V", line = 6)
    public static void method1122(byte arg0) {
        field2869 = null;
        if (arg0 != 126) {
            field2869 = (String[]) null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZIILrg;)V", line = 26)
    public static final void method1123(boolean arg0, int arg1, int arg2, class255 arg3) {
        if (arg0) {
            field2869 = (String[]) null;
        }
        if (arg3.field1897 == arg1 && arg1 != -1) {
            class260 var4 = class279.method1882(25397, arg1);
            int var5 = var4.field4038;
            if (var5 == 1) {
                arg3.field1921 = arg2;
                arg3.field1882 = 1;
                arg3.field1908 = 0;
                arg3.field1912 = 0;
                arg3.field1901 = 0;
                class255.method1705(arg3.field1872, arg3.field1869, (byte) -116, var4, arg3.field1908, false);
            }
            if (var5 == 2) {
                arg3.field1912 = 0;
            }
        } else if (arg1 == -1 || arg3.field1897 == -1 || class279.method1882(25397, arg1).field4035 >= class279.method1882(25397, arg3.field1897).field4035) {
            arg3.field1921 = arg2;
            arg3.field1897 = arg1;
            arg3.field1901 = 0;
            arg3.field1882 = 1;
            arg3.field1908 = 0;
            arg3.field1925 = arg3.field1877;
            arg3.field1912 = 0;
            if (arg3.field1897 != -1) {
                class255.method1705(arg3.field1872, arg3.field1869, (byte) -127, class279.method1882(25397, arg3.field1897), arg3.field1908, false);
            }
        }
        field2868++;
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method695(int arg0);

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)Z")
    public abstract boolean method696(int arg0);
}
