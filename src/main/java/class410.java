import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class410 {

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "Z")
    public static boolean field5804 = false;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "Lfc;")
    public static class235 field5802 = new class235(44, 6);

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "Z")
    public static boolean field5805 = false;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIB)Z", line = 10)
    public static final boolean method2343(int arg0, int arg1, byte arg2) {
        if (arg2 > -97) {
            return true;
        } else {
            field5803++;
            return class186.method1243(1, arg1, arg0) || class638.method3561(arg0, (byte) 86, arg1);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIILjava/lang/Class;)Lbt;", line = 22)
    public static final class39 method2344(int arg0, int arg1, int arg2, Class arg3) {
        class486 var4 = class658.field9266[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class20 var5 = var4.field6751; var5 != null; var5 = var5.field284) {
            class39 var6 = var5.field281;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field517 == arg1 && var6.field512 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V", line = 49)
    public static void method2345(int arg0) {
        field5802 = null;
        if (arg0 != 6) {
            method2344(26, -37, -39, null);
        }
    }
}
