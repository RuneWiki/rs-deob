import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class186 extends class147 {

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "[I")
    public int[] field2887 = new int[] { -1 };

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "[I")
    public int[] field2892 = new int[] { 0 };

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "[I")
    public static int[] field2891 = new int[50];

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "Ls;")
    public static class271 field2893;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "[S")
    public static short[] field2889;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)V", line = 16)
    public static final void method1271(int arg0, int arg1) {
        field2888++;
        class126.field1955--;
        if (class126.field1955 == arg1) {
            return;
        }
        class75.method541(class141.field2154, arg1 + 1, class141.field2154, arg1, class126.field1955 - arg1);
        class75.method541(class252.field4138, arg1 + 1, class252.field4138, arg1, class126.field1955 - arg1);
        class75.method537(class85.field1404, arg1 + 1, class85.field1404, arg1, class126.field1955 - arg1);
        class75.method540(class142.field2178, arg1 + 1, class142.field2178, arg1, class126.field1955 - arg1);
        class75.method535(class268.field4429, arg1 + 1, class268.field4429, arg1, class126.field1955 - arg1);
        class75.method537(class193.field3009, arg0 + arg1, class193.field3009, arg1, class126.field1955 - arg1);
        class75.method537(class322.field5529, arg1 + 1, class322.field5529, arg1, class126.field1955 - arg1);
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V", line = 39)
    public static void method1272(int arg0) {
        if (arg0 > -73) {
            method1272(-59);
        }
        field2893 = null;
        field2889 = null;
        field2891 = null;
    }
}
