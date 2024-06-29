import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class210 extends class501 {

    @OriginalMember(owner = "client!gca", name = "s", descriptor = "Lln;")
    public class319 field3103;

    @OriginalMember(owner = "client!gca", name = "q", descriptor = "Z")
    public static boolean field3101 = false;

    @OriginalMember(owner = "client!gca", name = "t", descriptor = "Lbt;")
    public static class39 field3104 = new class39("runescape", 0);

    @OriginalMember(owner = "client!gca", name = "v", descriptor = "Ljava/lang/String;")
    public static String field3106 = null;

    @OriginalMember(owner = "client!gca", name = "x", descriptor = "[F")
    public static float[] field3108 = new float[4];

    @OriginalMember(owner = "client!gca", name = "w", descriptor = "Lkv;")
    public static class227 field3107 = new class227();

    @OriginalMember(owner = "client!gca", name = "r", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!gca", name = "u", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)V")
    public static void method1385(int arg0) {
        field3106 = null;
        field3104 = null;
        field3107 = null;
        if (arg0 == 26049) {
            field3108 = null;
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(BIIII)V")
    public static final void method1386(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class14.field136 <= arg1 - arg3 && arg1 + arg3 <= class130.field1801 && (arg4 - arg3) >= class3.field25 && class100.field1452 >= arg4 + arg3) {
            class287.method1781(arg3, arg2, arg1, -108, arg4);
        } else {
            class611.method3587(arg1, (byte) -103, arg4, arg3, arg2);
        }
        if (arg0 == -78) {
            field3102++;
        }
    }

    @OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Lln;)V")
    public class210(class319 arg0) {
        this.field3103 = arg0;
    }
}
