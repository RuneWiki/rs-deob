import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class479 {

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field6784 = new String[200];

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "I")
    public static int field6781;

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "I")
    public static int field6782;

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "I")
    public static int field6783;

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "I")
    public static int field6785;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IZ)Z")
    public static final boolean method2861(int arg0, boolean arg1) {
        if (arg0 >= -64) {
            return false;
        }
        field6782++;
        boolean var2 = class268.field3831.method491();
        if (arg1 == var2) {
            return true;
        }
        if (!arg1) {
            class268.field3831.method377();
        } else if (!class268.field3831.method413()) {
            arg1 = false;
        }
        if (var2 == arg1) {
            return false;
        } else {
            class557.field7812.method2755(249682952, arg1 ? 1 : 0, class557.field7812.field6524);
            class90.method681(10343);
            return true;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(ZILeea;[IIIII)Lll;")
    public static final class364 method2862(boolean arg0, int arg1, class131 arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        field6783++;
        if (arg5 != 34037) {
            method2864((byte) 66);
        }
        if (!arg2.field1869 && (!class253.method1681(arg6, (byte) 117) || !class253.method1681(arg7, (byte) 65))) {
            return arg2.field1906 ? new class364(arg2, 34037, arg6, arg7, arg0, arg3, arg4, arg1) : new class364(arg2, arg6, arg7, class123.method837(113, arg6), class123.method837(112, arg7), arg3);
        } else {
            return new class364(arg2, 3553, arg6, arg7, arg0, arg3, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)V")
    public static void method2863(byte arg0) {
        field6784 = null;
        if (arg0 != 83) {
            field6784 = null;
        }
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(B)J")
    public static final synchronized long method2864(byte arg0) {
        if (arg0 >= -38) {
            return -118L;
        }
        field6785++;
        long var1 = System.currentTimeMillis();
        if (class380.field5445 > var1) {
            class429.field6120 += class380.field5445 - var1;
        }
        class380.field5445 = var1;
        return class429.field6120 + var1;
    }
}
