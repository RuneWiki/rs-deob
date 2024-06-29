import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class450 extends class260 {

    @OriginalMember(owner = "client!av", name = "m", descriptor = "Ljava/lang/String;")
    public String field6619;

    @OriginalMember(owner = "client!av", name = "l", descriptor = "Ldi;")
    public static class83 field6618 = new class83(57, -1);

    @OriginalMember(owner = "client!av", name = "n", descriptor = "Ldi;")
    public static class83 field6620 = new class83(3, 3);

    @OriginalMember(owner = "client!av", name = "r", descriptor = "J")
    public static long field6624 = 0L;

    @OriginalMember(owner = "client!av", name = "p", descriptor = "Z")
    public static boolean field6622 = false;

    @OriginalMember(owner = "client!av", name = "o", descriptor = "Ldi;")
    public static class83 field6621 = new class83(53, 7);

    @OriginalMember(owner = "client!av", name = "k", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!av", name = "q", descriptor = "Lc;")
    public static class122 field6623;

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "()V", line = 5)
    public class450() {
    }

    @OriginalMember(owner = "client!av", name = "c", descriptor = "(I)V", line = 8)
    public static void method2658(int arg0) {
        field6620 = null;
        field6618 = null;
        if (arg0 == 31546) {
            field6623 = null;
            field6621 = null;
        }
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 23)
    public class450(String arg0) {
        this.field6619 = arg0;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(ZIIIIII)I", line = 31)
    public static final int method2659(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg4 & 0x3;
        if (arg0) {
            method2658(-68);
        }
        if ((arg1 & 0x1) == 1) {
            int var8 = arg5;
            arg5 = arg2;
            arg2 = var8;
        }
        field6617++;
        if (var7 == 0) {
            return arg6;
        } else if (var7 == 1) {
            return 7 + 1 - (arg3 + arg5);
        } else if (var7 == 2) {
            return 1 + 7 - arg2 - arg6;
        } else {
            return arg3;
        }
    }
}
