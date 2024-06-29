import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class class85 extends class120 {

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "I")
    public int field1965 = 1000;

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "I")
    public static int field1957 = 0;

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "Lva;")
    private static class121 field1961 = class107.method797("Connecting to friendserver", -10983);

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "I")
    public static int field1967 = 0;

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "Lva;")
    public static class121 field1966 = class107.method797("@yel@*V", -10983);

    @OriginalMember(owner = "client!oa", name = "cb", descriptor = "Lva;")
    public static class121 field1970 = class107.method797(" x ", -10983);

    @OriginalMember(owner = "client!oa", name = "W", descriptor = "Lva;")
    private static class121 field1964 = class107.method797("wave2:", -10983);

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "Lva;")
    public static class121 field1960 = field1964;

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "Lva;")
    public static class121 field1962 = field1961;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!oa", name = "V", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!oa", name = "ab", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!oa", name = "bb", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "Lbc;")
    public static class10 field1956;

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "Lhe;")
    public static class47 field1955;

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "Lm;")
    public static class72 field1958;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V", line = 6)
    public static final void method595(int arg0) {
        field1954++;
        int var1 = 0;
        if (arg0 != -2382) {
            field1956 = null;
        }
        while (class42.field965 > var1) {
            int var2 = class1.field7[var1];
            class50 var3 = class8.field110[var2];
            if (var3 != null) {
                class66.method467(var3, var3.field1183.field345, 0);
            }
            var1++;
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V", line = 35)
    public static void method596(boolean arg0) {
        field1970 = null;
        field1964 = null;
        field1966 = null;
        field1955 = null;
        field1961 = null;
        field1956 = null;
        if (arg0) {
            method598(28);
        }
        field1960 = null;
        field1962 = null;
        field1958 = null;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)Lrb;", line = 68)
    public class102 method188(int arg0) {
        field1959++;
        if (arg0 <= 60) {
            field1958 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V", line = 86)
    public void method597(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1969++;
        class102 var10 = this.method188(108);
        if (var10 != null) {
            this.field1965 = var10.field1965;
            var10.method597(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V", line = 117)
    public static final void method598(int arg0) {
        field1963++;
        if (arg0 != 0) {
            method598(5);
        }
        class22.field585.method347(true);
    }
}
