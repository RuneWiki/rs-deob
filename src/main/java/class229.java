import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class229 extends class45 {

    @OriginalMember(owner = "client!to", name = "i", descriptor = "I")
    public int field2964;

    @OriginalMember(owner = "client!to", name = "j", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!to", name = "l", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!to", name = "m", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!to", name = "n", descriptor = "I")
    public int field2969;

    @OriginalMember(owner = "client!to", name = "o", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!to", name = "r", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!to", name = "s", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!to", name = "k", descriptor = "Ltt;")
    public class338 field2966;

    @OriginalMember(owner = "client!to", name = "p", descriptor = "Ljd;")
    public class537 field2971;

    @OriginalMember(owner = "client!to", name = "q", descriptor = "[I")
    public static int[] field2972;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IB)Lfw;", line = 6)
    public static final class454 method1417(int arg0, byte arg1) {
        int var2 = 67 / ((63 - arg1) / 60);
        field2970++;
        return new class454(arg0, false);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IBII)I", line = 25)
    public static final int method1418(int arg0, byte arg1, int arg2, int arg3) {
        field2974++;
        if ((class31.field440[arg2][arg0][arg3] & 0x8) != 0) {
            return 0;
        } else if (arg2 <= 0 || (class31.field440[1][arg0][arg3] & 0x2) == 0) {
            return arg1 >= -89 ? -38 : arg2;
        } else {
            return arg2 - 1;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B)V", line = 44)
    public final void method1419(byte arg0) {
        field2968++;
        if (arg0 != 110) {
            field2972 = null;
        }
        if (class65.field811 < class535.field7353.length) {
            class535.field7353[class65.field811++] = this;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V", line = 59)
    public static void method1420(int arg0) {
        if (arg0 >= -93) {
            field2972 = null;
        }
        field2972 = null;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(III)Z", line = 69)
    public static final boolean method1421(int arg0, int arg1, int arg2) {
        field2967++;
        if (class450.method2532(arg1, (byte) -118, arg0)) {
            return class615.method3401(arg0, arg1, arg2 - 28442) | ~(arg0 & 0xB000) != arg2 | class670.method3805(arg0, arg1, (byte) 125) ? true : (arg1 & 0x37) == 0 & (class299.method1764((byte) -122, arg1, arg0) | class209.method1329(arg1, (byte) 104, arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 85)
    public static final String method1422(String arg0, int arg1) {
        field2973++;
        boolean var2 = false;
        if (arg0.startsWith("--> ")) {
            arg0 = arg0.substring(4);
            var2 = true;
        }
        if (arg0.startsWith("directlogin ")) {
            int var3 = arg0.indexOf(" ", "directlogin ".length());
            if (var3 >= 0) {
                int var4 = arg0.length();
                arg0 = arg0.substring(0, var3) + " ";
                for (int var5 = var3 + 1; var5 < var4; var5++) {
                    arg0 = arg0 + "*";
                }
            }
        }
        if (arg1 == 0) {
            return var2 ? "--> " + arg0 : arg0;
        } else {
            return null;
        }
    }
}
