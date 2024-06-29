import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class44 {

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "Leb;")
    public static class31 field867 = new class31(30);

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "Lqf;")
    public static class117 field875 = class72.method514(105, "Bitte benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "Lqf;")
    public static class117 field871 = class72.method514(112, "Passwort: ");

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "Lqf;")
    public static class117 field877 = class72.method514(120, "0(U");

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "Lqf;")
    public static class117 field874 = class72.method514(114, "(U");

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
    public static int field879 = 0;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "Lu;")
    public static class137 field873;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "Ljb;")
    public static class64 field870;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "Z")
    public static boolean field876;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)V")
    public static final void method302(boolean arg0) {
        field865++;
        class133.field3150.method250((byte) -54);
        if (arg0) {
            method308(-72, -44, 39);
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V")
    public static void method303(boolean arg0) {
        field873 = null;
        field871 = null;
        field874 = null;
        field875 = null;
        field867 = null;
        field870 = null;
        field877 = null;
        if (!arg0) {
            field875 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method304(int arg0, Component arg1) {
        field878++;
        arg1.removeMouseListener(class8.field131);
        arg1.removeMouseMotionListener(class8.field131);
        arg1.removeFocusListener(class8.field131);
        class20.field328 = arg0;
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(Z)V")
    public static final void method305(boolean arg0) {
        Object var1 = class65.field1346;
        synchronized (class65.field1346) {
            if (!arg0) {
                method306((byte) 125, 25);
            }
            if (class116.field2747 != 0) {
                class116.field2747 = 1;
                try {
                    class65.field1346.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        field866++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)I")
    public static final int method306(byte arg0, int arg1) {
        field869++;
        class42 var2 = class50.method376(arg1, (byte) -30);
        if (arg0 < 12) {
            return -32;
        }
        int var3 = var2.field822;
        int var4 = var2.field846;
        int var5 = var2.field827;
        int var6 = class87.field2005[var3 - var4];
        return var6 & class23.field461[var5] >> var4;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method307(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field872++;
        if (class26.method201(arg4, arg7 + 314356016)) {
            class136.method1058(arg3, arg7, -1, arg2, arg1, arg5, (byte) -62, arg0, arg6, class141.field3426[arg4], 0);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)V")
    public static final void method308(int arg0, int arg1, int arg2) {
        field864++;
        int[] var3 = new int[4];
        var3[0] = arg0;
        int[] var4 = new int[4];
        if (arg1 != 20041) {
            field876 = true;
        }
        int var5 = 1;
        var4[0] = arg2;
        for (int var6 = 0; var6 < 4; var6++) {
            if (class83.field1909[var6] != arg0) {
                var3[var5] = class83.field1909[var6];
                var4[var5] = class152.field3736[var6];
                var5++;
            }
        }
        class152.field3736 = var4;
        class83.field1909 = var3;
        class90.method710(0, (byte) 123, class83.field1909, class152.field3736, class20.field336.length - 1, class20.field336);
    }
}
