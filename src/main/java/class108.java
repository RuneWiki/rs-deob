import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class108 {

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "[[[B")
    public static byte[][][] field2679 = new byte[4][104][104];

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "[I")
    public static int[] field2675 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "Lpd;")
    public static class94 field2685 = class28.method249(19, "Verbindung konnte nicht hergestellt werden)3");

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "Lpd;")
    private static class94 field2686 = class28.method249(-81, "glow1:");

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "Lpd;")
    private static class94 field2683 = class28.method249(83, "Enter message to send to ");

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "Lpd;")
    private static class94 field2676 = class28.method249(75, "Loading config )2 ");

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "Lpd;")
    public static class94 field2680 = field2676;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "Lpd;")
    public static class94 field2684 = field2683;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "Lpd;")
    public static class94 field2674 = field2686;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "Lpd;")
    public static class94 field2690 = class28.method249(27, "chatback");

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "Lpd;")
    private static class94 field2687 = class28.method249(25, "Enter your username (V password)3");

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "Lpd;")
    public static class94 field2678 = field2687;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "Lfa;")
    public static class31 field2681;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "Lla;")
    public static class66 field2689;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sa", name = "t", descriptor = "Ljava/lang/Class;")
    public static Class field2691;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "[[Lme;")
    public static class77[][] field2673;

    // $FF: synthetic method
    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method791(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method786(boolean arg0) {
        field2677++;
        if (class62.field1518 == null) {
            return;
        }
        long var1 = class115.method856(true);
        if (class12.field310 >= var1 || arg0) {
            return;
        }
        class62.field1518.method486(var1);
        int var3 = (int) (var1 - class12.field310);
        class12.field310 = var1;
        synchronized (field2691 == null ? (field2691 = method791("ob")) : field2691) {
            class57.field1453 += class43.field1083 * var3;
            int var5 = (class57.field1453 - class43.field1083 * 2000) / 1000;
            if (var5 > 0) {
                if (class89.field2315 != null) {
                    class89.field2315.method423(var5);
                }
                class57.field1453 -= var5 * 1000;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIILs;)[Ltc;", line = 60)
    public static final class116[] method787(int arg0, int arg1, int arg2, class111 arg3) {
        if (arg1 == -2) {
            field2672++;
            return class43.method321(arg0, arg2, arg3, -12404) ? class36.method284(true) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V", line = 93)
    public static void method788(int arg0) {
        field2684 = null;
        field2676 = null;
        field2686 = null;
        field2678 = null;
        field2681 = null;
        field2689 = null;
        field2683 = null;
        field2690 = null;
        field2673 = null;
        field2687 = null;
        field2679 = null;
        int var1 = -25 % ((68 - arg0) / 39);
        field2680 = null;
        field2674 = null;
        field2685 = null;
        field2675 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLpd;Lpd;Lpd;)V", line = 133)
    public static final void method789(byte arg0, class94 arg1, class94 arg2, class94 arg3) {
        field2682++;
        client.field492 = arg3;
        client.field485 = arg2;
        client.field484 = arg1;
        if (arg0 != 96) {
            field2679 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lbb;I)V", line = 182)
    public static final void method790(class8 arg0, int arg1) {
        arg0.field200 = false;
        field2688++;
        if (arg0.field216 != -1) {
            class57 var2 = class70.method519(5, arg0.field216);
            if (var2 == null || var2.field1425 == null) {
                arg0.field216 = -1;
            } else {
                arg0.field223++;
                if (var2.field1425.length > arg0.field176 && arg0.field223 > var2.field1420[arg0.field176]) {
                    arg0.field223 = 1;
                    arg0.field176++;
                }
                if (var2.field1425.length <= arg0.field176) {
                    arg0.field176 = 0;
                    arg0.field223 = 0;
                }
            }
        }
        if (arg0.field190 != -1 && arg0.field233 <= class26.field699) {
            if (arg0.field211 < 0) {
                arg0.field211 = 0;
            }
            int var3 = class41.method309(13, arg0.field190).field2162;
            if (var3 == -1) {
                arg0.field190 = -1;
            } else {
                class57 var4 = class70.method519(5, var3);
                if (var4 == null || var4.field1425 == null) {
                    arg0.field190 = -1;
                } else {
                    arg0.field220++;
                    if (arg0.field211 < var4.field1425.length && arg0.field220 > var4.field1420[arg0.field211]) {
                        arg0.field211++;
                        arg0.field220 = 1;
                    }
                    if (arg0.field211 >= var4.field1425.length && (arg0.field211 < 0 || arg0.field211 >= var4.field1425.length)) {
                        arg0.field190 = -1;
                    }
                }
            }
        }
        if (arg0.field210 != arg1 && arg0.field192 <= 1) {
            class57 var5 = class70.method519(5, arg0.field210);
            if (var5.field1428 == 1 && arg0.field161 > 0 && arg0.field208 <= class26.field699 && arg0.field204 < class26.field699) {
                arg0.field192 = 1;
                return;
            }
        }
        if (arg0.field210 != -1 && arg0.field192 == 0) {
            class57 var6 = class70.method519(5, arg0.field210);
            if (var6 == null || var6.field1425 == null) {
                arg0.field210 = -1;
            } else {
                arg0.field214++;
                if (arg0.field180 < var6.field1425.length && arg0.field214 > var6.field1420[arg0.field180]) {
                    arg0.field180++;
                    arg0.field214 = 1;
                }
                if (arg0.field180 >= var6.field1425.length) {
                    arg0.field180 -= var6.field1435;
                    arg0.field164++;
                    if (var6.field1454 <= arg0.field164) {
                        arg0.field210 = -1;
                    }
                    if (arg0.field180 < 0 || arg0.field180 >= var6.field1425.length) {
                        arg0.field210 = -1;
                    }
                }
                arg0.field200 = var6.field1445;
            }
        }
        if (arg0.field192 > 0) {
            arg0.field192--;
        }
    }
}
