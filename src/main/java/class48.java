import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class48 {

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "S")
    public static short field932 = 256;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field936 = 0;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "Lo;")
    public static class199 field934 = new class199(32);

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field939 = 0;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public static int field938 = 0;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public static int field941 = 100;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "Lqd;")
    public static class40 field931;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V", line = 5)
    public static void method427(int arg0) {
        if (arg0 != 28) {
            field936 = 100;
        }
        field934 = null;
        field931 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/awt/Component;III)Luj;", line = 26)
    public static final class135 method428(Component arg0, int arg1, int arg2, int arg3) {
        field933++;
        try {
            Class var4 = Class.forName("vl");
            class135 var5 = (class135) var4.getDeclaredConstructor().newInstance();
            int var6 = 88 % ((arg2 + 40) / 38);
            var5.method547(16369, arg1, arg3, arg0);
            return var5;
        } catch (Throwable var9) {
            class169 var8 = new class169();
            var8.method547(16369, arg1, arg3, arg0);
            return var8;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BIIII)V", line = 60)
    public static final void method429(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field935++;
        if (arg0 >= -98) {
            field939 = 8;
        }
        if ((arg4 - arg1) >= class125.field2164 && field941 >= (arg1 + arg4) && arg2 - arg1 >= class220.field3664 && class72.field1275 >= arg1 + arg2) {
            class53.method462(arg2, arg3, arg4, arg1, (byte) -123);
        } else {
            class249.method1761(arg4, arg2, -96, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V", line = 79)
    public static final void method430(int arg0) {
        if (arg0 > -62) {
            field938 = -105;
        }
        field930++;
        if (class6.field87 == 10 && class21.field350) {
            class271.method1879(28, 17646);
        }
        if (class6.field87 == 30) {
            class271.method1879(25, 17646);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIIII)V", line = 101)
    public static final void method431(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class125.field2164 <= arg1 && arg6 <= field941 && arg4 >= class220.field3664 && arg0 <= class72.field1275) {
            class206.method1454(arg6, arg4, arg1, arg0, true, arg2, arg7, arg5);
        } else {
            class102.method769(arg1, arg5, arg2, arg7, arg6, 32768, arg4, arg0);
        }
        if (arg3 != 1) {
            field941 = 22;
        }
        field937++;
    }
}
