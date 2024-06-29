import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class643 extends class621 {

    @OriginalMember(owner = "client!iea", name = "E", descriptor = "Z")
    public static boolean field8874 = false;

    @OriginalMember(owner = "client!iea", name = "H", descriptor = "I")
    public static int field8877 = 52;

    @OriginalMember(owner = "client!iea", name = "z", descriptor = "Ltn;")
    public static class179 field8869 = new class179(1350);

    @OriginalMember(owner = "client!iea", name = "K", descriptor = "I")
    public static int field8880 = -1;

    @OriginalMember(owner = "client!iea", name = "L", descriptor = "Lqu;")
    public static class301 field8881 = new class301();

    @OriginalMember(owner = "client!iea", name = "A", descriptor = "I")
    public static int field8870;

    @OriginalMember(owner = "client!iea", name = "B", descriptor = "I")
    public static int field8871;

    @OriginalMember(owner = "client!iea", name = "C", descriptor = "I")
    public static int field8872;

    @OriginalMember(owner = "client!iea", name = "D", descriptor = "I")
    public static int field8873;

    @OriginalMember(owner = "client!iea", name = "F", descriptor = "I")
    public static int field8875;

    @OriginalMember(owner = "client!iea", name = "G", descriptor = "I")
    public static int field8876;

    @OriginalMember(owner = "client!iea", name = "I", descriptor = "I")
    public static int field8878;

    @OriginalMember(owner = "client!iea", name = "J", descriptor = "[I")
    public static int[] field8879;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(BLnga;Ljava/lang/Object;)V", line = 4)
    public static final void method3491(byte arg0, class256 arg1, Object arg2) {
        ++field8872;
        if (arg1.field3249 != null) {
            int var3 = -31 % ((arg0 - -6) / 45);
            for (int var4 = 0; var4 < 50 && arg1.field3249.peekEvent() != null; ++var4) {
                class517.method2965(1L, -128);
            }
            try {
                if (arg2 != null) {
                    arg1.field3249.postEvent(new ActionEvent(arg2, 1001, "dummy"));
                }
            } catch (Exception var5) {
            }
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(ICI)C", line = 34)
    public static final char method3492(int arg0, char arg1, int arg2) {
        ++field8871;
        if (arg2 != 231) {
            field8869 = null;
        }
        if (~arg1 <= -193 && arg1 <= 255) {
            if (arg1 >= 192 && ~arg1 >= -199) {
                return 'A';
            }
            if (~arg1 == -200) {
                return 'C';
            }
            if (~arg1 <= -201 && ~arg1 >= -204) {
                return 'E';
            }
            if (arg1 >= 204 && arg1 <= 207) {
                return 'I';
            }
            if (arg1 >= 210 && arg1 <= 214) {
                return 'O';
            }
            if (arg1 >= 217 && ~arg1 >= -221) {
                return 'U';
            }
            if (~arg1 == -222) {
                return 'Y';
            }
            if (arg1 == 223) {
                return 's';
            }
            if (~arg1 <= -225 && ~arg1 >= -231) {
                return 'a';
            }
            if (arg1 == 231) {
                return 'c';
            }
            if (arg1 >= 232 && ~arg1 >= -236) {
                return 'e';
            }
            if (arg1 >= 236 && arg1 <= 239) {
                return 'i';
            }
            if (~arg1 <= -243 && arg1 <= 246) {
                return 'o';
            }
            if (~arg1 <= -250 && ~arg1 >= -253) {
                return 'u';
            }
            if (arg1 == 253 || arg1 == 255) {
                return 'y';
            }
        }
        if (arg1 == 338) {
            return 'O';
        } else if (arg1 == 339) {
            return 'o';
        } else if (~arg1 == -377) {
            return 'Y';
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!iea", name = "e", descriptor = "(I)V", line = 108)
    public static void method3493(int arg0) {
        field8881 = null;
        field8879 = null;
        field8869 = null;
        if (arg0 != -18377) {
            method3491((byte) -110, (class256) null, (Object) null);
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(IIIII)V", line = 121)
    public static final void method3494(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 104 % ((54 - arg2) / 36);
        if (~class112.field1386 >= ~arg1 && ~class328.field4190 <= ~arg1) {
            int var6 = class711.method3927(arg3, -116, class592.field8242, class108.field1334);
            int var7 = class711.method3927(arg4, -112, class592.field8242, class108.field1334);
            class616.method3382(var6, -60, arg1, var7, arg0);
        }
        ++field8875;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(BF)V", line = 142)
    public final void method597(byte arg0, float arg1) {
        super.field8690 = arg1;
        ++field8870;
        if (arg0 <= 69) {
            method3492(84, (char) 65445, 96);
        }
    }

    @OriginalMember(owner = "client!iea", name = "f", descriptor = "(I)[Lofa;", line = 154)
    public static final class139[] method3495(int arg0) {
        if (arg0 != 19337) {
            field8879 = null;
        }
        ++field8876;
        return new class139[] { class462.field6673, class127.field1527, class393.field5487 };
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(IZII)V", line = 168)
    public final void method594(int arg0, boolean arg1, int arg2, int arg3) {
        super.field8683 = arg2;
        if (arg1) {
            method3494(117, 45, 97, 123, -94);
        }
        super.field8677 = arg3;
        super.field8686 = arg0;
        ++field8873;
    }

    @OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(IIIIIF)V", line = 186)
    public class643(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
