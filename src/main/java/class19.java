import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class19 {

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "Lae;")
    private static class6 field372 = class64.method474(126, "flash3:");

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "Lae;")
    private static class6 field375 = class64.method474(105, "Invalid loginserver requested)3");

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "[I")
    public static int[] field364 = new int[5];

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "Lae;")
    public static class6 field367 = field372;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "Lae;")
    public static class6 field373 = class64.method474(108, "Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <OFF>");

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "Lae;")
    private static class6 field369 = class64.method474(116, "Unable to connect)3");

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "Lae;")
    public static class6 field376 = class64.method474(104, " )2>");

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "Lae;")
    public static class6 field378 = field369;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "Lae;")
    public static class6 field379 = field369;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
    public static int field382 = 0;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "[Z")
    public static boolean[] field370 = new boolean[112];

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "Lae;")
    public static class6 field384 = field375;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "()V", line = 8)
    public void method180() {
        field368++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 17)
    public static final void method181(byte arg0, Component arg1) {
        field366++;
        if (arg0 > -47) {
            field382 = -75;
        }
        Method var2 = class31.field748;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class2.field21);
        arg1.addFocusListener(class2.field21);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II[B)I", line = 52)
    public static final int method182(int arg0, int arg1, byte[] arg2) {
        field365++;
        return arg0 == 7 ? class40.method336(arg1, (byte) 67, 0, arg2) : 122;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([II)V", line = 64)
    public static final synchronized void method183(int[] arg0, int arg1) {
        int var2 = arg1;
        if (class126.field3090) {
            var2 = arg1 << 1;
        }
        int var3 = 0;
        var2 -= 7;
        while (var3 < var2) {
            arg0[var3++] = 0;
            arg0[var3++] = 0;
            arg0[var3++] = 0;
            arg0[var3++] = 0;
            arg0[var3++] = 0;
            arg0[var3++] = 0;
            arg0[var3++] = 0;
            arg0[var3++] = 0;
        }
        var2 += 7;
        while (var3 < var2) {
            arg0[var3++] = 0;
        }
        if (class38.field856 != null) {
            class38.field856.method13(arg0, 0, arg1);
        }
        class32.method296(0, arg1);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLac;)V", line = 94)
    public static final synchronized void method184(byte arg0, class3 arg1) {
        field380++;
        if (arg0 < 18) {
            method182(60, 35, null);
        }
        class38.field856 = arg1;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 137)
    public static void method185(int arg0) {
        field379 = null;
        field375 = null;
        field378 = null;
        field373 = null;
        field372 = null;
        field384 = null;
        field364 = null;
        field369 = null;
        field367 = null;
        field376 = null;
        if (arg0 > -96) {
            method181((byte) -17, null);
        }
        field370 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(J)V", line = 160)
    public void method186(long arg0) {
        field377++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)V", line = 171)
    public static final synchronized void method187(int arg0, int arg1) {
        field371++;
        if (arg0 != 7) {
            method183(null, 71);
        }
        if (class38.field856 != null) {
            class38.field856.method15(arg1);
        }
        class32.method296(0, arg1);
    }
}
