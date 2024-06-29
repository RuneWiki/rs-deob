import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class153 implements Runnable {

    @OriginalMember(owner = "client!we", name = "a", descriptor = "Lkd;")
    public static class73 field3753 = class126.method1070((byte) -66, "http:)4)4www)3runescape)3com");

    @OriginalMember(owner = "client!we", name = "d", descriptor = "Lkd;")
    private static class73 field3756 = class126.method1070((byte) -66, "Connection timed out)3");

    @OriginalMember(owner = "client!we", name = "i", descriptor = "Lkd;")
    public static class73 field3761 = class126.method1070((byte) -66, "Freie Welt");

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field3759 = -1;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "Lkd;")
    public static class73 field3755 = field3756;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "Lkd;")
    private static class73 field3769 = class126.method1070((byte) -66, "slide:");

    @OriginalMember(owner = "client!we", name = "h", descriptor = "Lkd;")
    private static class73 field3760 = class126.method1070((byte) -66, " from your friend list first");

    @OriginalMember(owner = "client!we", name = "n", descriptor = "Lkd;")
    public static class73 field3766 = field3769;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "Lkd;")
    public static class73 field3772 = field3769;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "Lkd;")
    public static class73 field3770 = field3760;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "Lkd;")
    private static class73 field3774 = class126.method1070((byte) -66, "The server is being updated)3");

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Lkd;")
    public static class73 field3757 = field3774;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "Lq;")
    public static class111 field3754;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "Lua;")
    public static class137 field3764;

    @OriginalMember(owner = "client!we", name = "run", descriptor = "()V")
    public final void run() {
        field3771++;
        try {
            while (true) {
                class61 var1 = class1.field67;
                class3 var2;
                synchronized (class1.field67) {
                    var2 = (class3) class1.field67.method514((byte) -79);
                }
                if (var2 == null) {
                    class112.method913(1, 100L);
                    Object var3 = class53.field1401;
                    synchronized (class53.field1401) {
                        if (class49.field1309 <= 1) {
                            class49.field1309 = 0;
                            class53.field1401.notifyAll();
                            return;
                        }
                        class49.field1309--;
                    }
                } else {
                    if (var2.field162 == 0) {
                        var2.field158.method871(var2.field166.length, (int) var2.field3522, var2.field166, -1);
                        class61 var4 = class1.field67;
                        synchronized (class1.field67) {
                            var2.method1147((byte) -70);
                        }
                    } else if (var2.field162 == 1) {
                        var2.field166 = var2.field158.method877(3, (int) var2.field3522);
                        class61 var5 = class1.field67;
                        synchronized (class1.field67) {
                            class104.field2587.method519(var2, 13017);
                        }
                    }
                    Object var6 = class53.field1401;
                    synchronized (class53.field1401) {
                        if (class49.field1309 <= 1) {
                            class49.field1309 = 0;
                            class53.field1401.notifyAll();
                            return;
                        }
                        class49.field1309 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class111.method894(null, var17, (byte) 2);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V")
    public static final void method1221(int arg0, int arg1) {
        field3768++;
        if (arg1 > 0) {
            return;
        }
        if (arg0 == -1 && !class12.field402) {
            class103.method827((byte) 114);
        } else if (arg0 != -1 && class111.field2720 != arg0 && class104.field2600 != 0 && !class12.field402) {
            class114.method941(2, false, class87.field2193, 0, arg0, 62, class104.field2600);
        }
        class111.field2720 = arg0;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
    public static void method1222(boolean arg0) {
        field3761 = null;
        field3754 = null;
        field3755 = null;
        field3757 = null;
        field3769 = null;
        if (!arg0) {
            method1224(93, null);
        }
        field3774 = null;
        field3753 = null;
        field3770 = null;
        field3772 = null;
        field3766 = null;
        field3764 = null;
        field3760 = null;
        field3756 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lq;BII)Lpb;")
    public static final class106 method1223(class111 arg0, byte arg1, int arg2, int arg3) {
        field3773++;
        if (class140.method1142(arg3, arg2, -121, arg0)) {
            if (arg1 < 102) {
                field3766 = null;
            }
            return class58.method493(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILq;)V")
    public static final void method1224(int arg0, class111 arg1) {
        field3765++;
        class66.field1723 = arg1;
        class23.field666 = class66.field1723.method889(-1, 16);
        if (arg0 != 600) {
            field3772 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(La;I)I")
    public static final int method1225(class1 arg0, int arg1) {
        field3758++;
        if (arg1 > -122) {
            method1221(17, -15);
        }
        class77 var2 = (class77) class52.field1382.method1099(47, ((long) arg0.field45 << 32) + (long) arg0.field1);
        return var2 == null ? arg0.field58 : var2.field1974;
    }
}
