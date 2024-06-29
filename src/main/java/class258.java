import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public abstract class class258 {

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field4505 = -1;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "[I")
    public static int[] field4508 = new int[100];

    @OriginalMember(owner = "client!th", name = "f", descriptor = "J")
    public static long field4509 = 0L;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field4504 = 0;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field4512 = 0;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "Lsc;")
    public static class181 field4506 = class149.method967(255, "(U0a )2 in: ");

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "Led;")
    public static class116 field4507;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "Ldg;")
    public static class90 field4510;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILo;IIIIII)V")
    public static final void method1754(int arg0, class175 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class99.field1646) {
            class85.field1358 = 32;
        } else {
            class85.field1358 = 0;
        }
        if (arg3 != 9748) {
            method1755(98);
        }
        field4511++;
        class99.field1646 = false;
        if (class39.field599 != 0) {
            if (arg7 <= arg6 && arg6 < (arg7 + 16) && arg0 <= arg2 && arg2 < arg0 + 16) {
                arg1.field2946 -= 4;
                class218.method1453((byte) -81, arg1);
            } else if (arg7 <= arg6 && arg6 < (arg7 + 16) && arg2 >= arg0 + arg5 - 16 && (arg0 + arg5) > arg2) {
                arg1.field2946 += 4;
                class218.method1453((byte) -70, arg1);
            } else if (arg7 - class85.field1358 <= arg6 && arg6 < class85.field1358 + arg7 + 16 && arg2 >= arg0 + 16 && (arg0 - (16 - arg5)) > arg2) {
                int var8 = (arg5 - 32) * arg5 / arg4;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg2 - (var8 / 2) - arg0 - 16;
                int var10 = arg5 - var8 - 32;
                arg1.field2946 = (arg4 - arg5) * var9 / var10;
                class218.method1453((byte) -98, arg1);
                class99.field1646 = true;
            }
        }
        if (class5.field103 == 0) {
            return;
        }
        int var11 = arg1.field3057;
        if ((arg7 - var11) <= arg6 && arg0 <= arg2 && arg6 < (arg7 + 16) && arg0 + arg5 >= arg2) {
            arg1.field2946 += class5.field103 * 45;
            class218.method1453((byte) -89, arg1);
            return;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)I")
    public abstract int method265(int arg0);

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method266(Component arg0, byte arg1);

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method267(int arg0, Component arg1);

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
    public static void method1755(int arg0) {
        field4508 = null;
        field4506 = null;
        field4507 = null;
        field4510 = null;
        int var1 = 118 % ((-arg0 - 30) / 61);
    }
}
