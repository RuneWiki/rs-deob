import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class76 {

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1142 = "Take";

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "[J")
    public static long[] field1144 = new long[100];

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "Lnm;")
    public static class221 field1145;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(CB)Z", line = 6)
    public static final boolean method513(char arg0, byte arg1) {
        if (arg1 != 22) {
            method513((char) 65474, (byte) -79);
        }
        field1143++;
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V", line = 25)
    public static final void method514(boolean arg0) {
        if (!arg0) {
            field1146++;
            class41.field624.method644((byte) -66);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V", line = 41)
    public static void method515(int arg0) {
        field1142 = null;
        field1145 = null;
        field1144 = null;
        if (arg0 != 57) {
            field1144 = (long[]) null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)Lfh;", line = 54)
    public static final class313 method516(int arg0) {
        field1141++;
        class313 var1 = new class313(34);
        var1.method2193(11, false);
        var1.method2193(class75.field1138, false);
        var1.method2193(class242.field3816 ? 1 : 0, false);
        var1.method2193(class153.field2486 ? 1 : 0, false);
        if (arg0 != 0) {
            method514(true);
        }
        var1.method2193(class118.field1725 ? 1 : 0, false);
        var1.method2193(class115.field1680 ? 1 : 0, false);
        var1.method2193(class295.field4905 ? 1 : 0, false);
        var1.method2193(class178.field2777 ? 1 : 0, false);
        var1.method2193(class121.field1814 ? 1 : 0, false);
        var1.method2193(class142.field2279 ? 1 : 0, false);
        var1.method2193(class162.field2580, false);
        var1.method2193(class322.field5287 ? 1 : 0, false);
        var1.method2193(class347.field5557 ? 1 : 0, false);
        var1.method2193(class96.field1398 ? 1 : 0, false);
        var1.method2193(class70.field1094, false);
        var1.method2193(class352.field5610 ? 1 : 0, false);
        var1.method2193(class182.field2824, false);
        var1.method2193(class315.field5201, false);
        var1.method2193(class58.field878, false);
        var1.method2206(class251.field4012, (byte) -116);
        var1.method2206(class72.field1105, (byte) -37);
        var1.method2193(class145.method1033(), false);
        var1.method2222(class299.field4941, 255);
        var1.method2193(class295.field4901, false);
        var1.method2193(class115.field1689 ? 1 : 0, false);
        var1.method2193(class307.field5005 ? 1 : 0, false);
        var1.method2193(class31.field478, false);
        var1.method2193(class201.field3094 ? 1 : 0, false);
        var1.method2193(class186.field2903 ? 1 : 0, false);
        return var1;
    }
}
