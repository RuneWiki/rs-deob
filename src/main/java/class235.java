import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rha")
public class class235 {

    @OriginalMember(owner = "client!rha", name = "g", descriptor = "I")
    public int field3378;

    @OriginalMember(owner = "client!rha", name = "d", descriptor = "Z")
    public static boolean field3375 = false;

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "Lwg;")
    public static class450 field3372 = new class450(1, 2, 2, 0);

    @OriginalMember(owner = "client!rha", name = "i", descriptor = "Z")
    public static boolean field3380 = false;

    @OriginalMember(owner = "client!rha", name = "j", descriptor = "Z")
    public static boolean field3381 = false;

    @OriginalMember(owner = "client!rha", name = "b", descriptor = "F")
    public static float field3373;

    @OriginalMember(owner = "client!rha", name = "c", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!rha", name = "e", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!rha", name = "f", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!rha", name = "h", descriptor = "Lfl;")
    public static class771 field3379;

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(IJI)Ljava/lang/String;", line = 5)
    public static final String method1581(int arg0, long arg1, int arg2) {
        class127.method1087((byte) 83, arg1);
        field3377++;
        int var4 = class60.field821.get(5);
        int var5 = class60.field821.get(2);
        int var6 = class60.field821.get(arg0);
        int var7 = class60.field821.get(11);
        int var8 = class60.field821.get(12);
        return arg2 == 3 ? class436.method2547(arg0 + 9, arg2, arg1) : Integer.toString(var4 / 10) + var4 % 10 + "-" + class594.field8336[arg2][var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10;
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(Z)V", line = 29)
    public static void method1582(boolean arg0) {
        if (arg0) {
            field3379 = null;
            field3372 = null;
        }
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(III)Z", line = 47)
    public static final boolean method1583(int arg0, int arg1, int arg2) {
        field3374++;
        if (arg0 != -1) {
            method1583(95, -76, 85);
        }
        return (arg2 & 0x70000) != 0 | class520.method2959(arg1, 33, arg2) || class614.method3479(arg1, -112, arg2);
    }

    @OriginalMember(owner = "client!rha", name = "toString", descriptor = "()Ljava/lang/String;", line = 62)
    public final String toString() {
        field3376++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rha", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", line = 73)
    public class235(String arg0, String arg1, String arg2, int arg3) {
        this.field3378 = arg3;
    }
}
