import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class47 extends class70 {

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "Z")
    public static boolean field946 = false;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "Len;")
    public static class49 field938 = new class49();

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "[I")
    public static int[] field952 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "Ljava/lang/String;")
    public static String field951 = "Please remove ";

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "S")
    public static short field953 = 256;

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "Ljava/lang/String;")
    public static String field954 = "Hidden";

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "Ljava/lang/String;")
    public static String field955 = "glow3:";

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
    public int field937;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public int field941;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
    public int field945;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
    public int field947;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
    public int field949;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "Lg;")
    public class181 field939;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "Lg;")
    public class181 field944;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "Lei;")
    public static class219 field948;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "Ljava/lang/String;")
    public String field935;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "Z")
    public boolean field950;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "[Ljava/lang/Object;")
    public Object[] field936;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lek;I)V", line = 5)
    public static final void method393(class206 arg0, int arg1) {
        if (arg1 <= -95) {
            class135.field2313 = arg0.method1402(-90, "titlebg");
            field940++;
            class257.field4201 = arg0.method1402(-83, "logo");
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V", line = 22)
    public static void method394(int arg0) {
        field954 = null;
        field951 = null;
        field938 = null;
        field948 = null;
        if (arg0 == 2) {
            field952 = null;
            field955 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 39)
    public static final void method395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field942++;
        class105 var13 = new class105();
        var13.field1912 = arg10;
        var13.field1917 = arg9;
        var13.field1918 = arg4;
        var13.field1911 = arg3;
        var13.field1921 = arg6;
        var13.field1916 = arg12;
        if (arg5 >= -51) {
            method395(76, -72, 74, -96, -49, -16, 71, 79, 26, 11, -69, -5, -60);
        }
        var13.field1926 = arg2;
        var13.field1925 = arg8;
        var13.field1913 = arg7;
        var13.field1923 = arg0;
        var13.field1910 = arg1;
        var13.field1920 = arg11;
        field938.method437(var13, (byte) 51);
    }
}
