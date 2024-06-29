import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class355 {

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "Luq;")
    public class146 field5105 = null;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "Lla;")
    public class416 field5102 = null;

    @OriginalMember(owner = "client!fu", name = "f", descriptor = "[I")
    public static int[] field5107 = new int[50];

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "Lnea;")
    public static class664 field5103 = new class664(49, -2);

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIIIIII)V", line = 3)
    public static final void method2170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5104++;
        if (arg1 == arg7) {
            class442.method2615(arg6, (byte) 111, arg2, arg4, arg7, arg5, arg0);
        } else if (arg3 == -2) {
            if (arg6 - arg7 >= class15.field153 && class248.field3859 >= arg6 + arg7 && (arg4 - arg1) >= class520.field7329 && arg1 + arg4 <= class239.field3747) {
                class162.method1117(arg0, arg5, arg2, arg4, arg1, -1, arg6, arg7);
            } else {
                class103.method830(arg0, arg6, arg1, arg5, arg7, 9848, arg4, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lla;)V", line = 77)
    public class355(class416 arg0) {
        this.field5102 = arg0;
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lla;Luq;)V", line = 87)
    public class355(class416 arg0, class146 arg1) {
        this.field5105 = arg1;
        this.field5102 = arg0;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(B)V", line = 36)
    public static void method2171(byte arg0) {
        field5107 = null;
        if (arg0 == -108) {
            field5103 = null;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)V", line = 48)
    public static final void method2172(int arg0) {
        if (class27.field400 != null) {
            class27.field400.method3384(true);
        }
        field5106++;
        if (arg0 != 49) {
            method2172(112);
        }
        if (class162.field2317 == null) {
            return;
        }
        while (true) {
            try {
                class162.field2317.join();
                return;
            } catch (InterruptedException var1) {
            }
        }
    }
}
