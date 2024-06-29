import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class220 {

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "I")
    public int field2843;

    @OriginalMember(owner = "client!rea", name = "l", descriptor = "I")
    public int field2854;

    @OriginalMember(owner = "client!rea", name = "e", descriptor = "Ljb;")
    public static class519 field2847 = new class519(45, 8);

    @OriginalMember(owner = "client!rea", name = "q", descriptor = "I")
    public static int field2859 = -1;

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!rea", name = "d", descriptor = "I")
    public int field2846;

    @OriginalMember(owner = "client!rea", name = "f", descriptor = "I")
    public int field2848;

    @OriginalMember(owner = "client!rea", name = "g", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!rea", name = "h", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!rea", name = "i", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!rea", name = "j", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!rea", name = "k", descriptor = "I")
    public int field2853;

    @OriginalMember(owner = "client!rea", name = "n", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!rea", name = "p", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!rea", name = "r", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!rea", name = "c", descriptor = "Lal;")
    public class109 field2845;

    @OriginalMember(owner = "client!rea", name = "o", descriptor = "Luq;")
    public static class172 field2857;

    @OriginalMember(owner = "client!rea", name = "m", descriptor = "Lrea;")
    public class220 field2855;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(II)Lrea;")
    public final class220 method1404(int arg0, int arg1) {
        if (arg1 > -58) {
            method1410(1, -3, -30);
        }
        field2844++;
        return new class220(this.field2843, arg0);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(B)V")
    public static final void method1405(byte arg0) {
        if (arg0 == 127) {
            field2856++;
            class583.field7921.method690(20134);
            class426.field6202 = 0;
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(I[BI)I")
    public static final int method1406(int arg0, byte[] arg1, int arg2) {
        field2851++;
        if (arg0 >= -95) {
            field2857 = null;
        }
        return class145.method1013(0, arg2, -1, arg1);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(I)V")
    public static void method1407(int arg0) {
        field2847 = null;
        field2857 = null;
        int var1 = -124 / ((arg0 - 12) / 44);
    }

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "(I)Lqf;")
    public final class708 method1408(int arg0) {
        field2852++;
        return arg0 <= 13 ? null : class482.method2834(this.field2843, false);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method1409(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field2849++;
        if (class297.field4199 <= arg1 && arg3 <= class45.field472 && class291.field4156 <= arg6 && class233.field3099 >= arg4) {
            if (arg2 == 1) {
                class131.method926(arg1, arg6, arg4, 119, arg0, arg3);
            } else {
                class361.method2288(arg6, arg3, (byte) 126, arg1, arg0, arg4, arg2);
            }
        } else if (arg2 == 1) {
            class358.method2270(arg0, false, arg3, arg6, arg4, arg1);
        } else {
            class391.method2414(arg0, arg4, arg1, (byte) -52, arg2, arg3, arg6);
        }
        if (arg5 != 28) {
            method1406(-54, null, 19);
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(III)Z")
    public static final boolean method1410(int arg0, int arg1, int arg2) {
        int var3 = 32 % ((arg0 - 20) / 53);
        field2850++;
        return (arg2 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(II)V")
    public class220(int arg0, int arg1) {
        this.field2843 = arg0;
        this.field2854 = arg1;
    }
}
