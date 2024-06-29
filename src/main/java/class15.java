import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class15 {

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Lqk;")
    private static class207 field242 = class24.method212(255, "Please remove ");

    @OriginalMember(owner = "client!we", name = "b", descriptor = "Lqk;")
    public static class207 field237 = class24.method212(255, ")4");

    @OriginalMember(owner = "client!we", name = "i", descriptor = "Lqk;")
    public static class207 field244 = field242;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "Lqk;")
    public static class207 field239 = field242;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "Z")
    public static boolean field243 = false;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "Lqk;")
    public static class207 field246 = class24.method212(255, ":duelfriend:");

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Lpk;")
    public static class99 field240;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "[I")
    public static int[] field249;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "[[I")
    public static int[][] field238;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Ltd;")
    public static final class71 method94(Throwable arg0, String arg1) {
        field236++;
        class71 var2;
        if (arg0 instanceof class71) {
            var2 = (class71) arg0;
            var2.field1265 = var2.field1265 + ' ' + arg1;
        } else {
            var2 = new class71(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
    public static final void method95(byte arg0) {
        class249.field4515 = -1;
        class117.field2015 = 0;
        class190.field3349 = -1;
        if (arg0 < 53) {
            field237 = null;
        }
        class280.field4915 = -1;
        class280.field4923 = 0;
        class268.field4751 = 0;
        class245.field4437 = 0;
        class245.field4443 = -1;
        class185.field3283 = 0;
        class256.field4588 = false;
        class261.field4645.field2593 = 0;
        field241++;
        class17.field262.field2593 = 0;
        class132.field2293 = 0;
        for (int var1 = 0; var1 < class169.field2953.length; var1++) {
            if (class169.field2953[var1] != null) {
                class169.field2953[var1].field5079 = -1;
            }
        }
        for (int var2 = 0; var2 < class79.field1449.length; var2++) {
            if (class79.field1449[var2] != null) {
                class79.field1449[var2].field5079 = -1;
            }
        }
        class19.method114((byte) 80);
        class132.field2290 = 1;
        class193.method1345(10, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class140.field2431[var3] = true;
        }
        class178.method1271(2);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    public static final void method96(int arg0) {
        field248++;
        if (arg0 != 6) {
            method94((Throwable) null, (String) null);
        }
        if (class202.field3573 == 0) {
            return;
        }
        try {
            if ((++class180.field3237) > 1500) {
                if (class98.field1738 != null) {
                    class98.field1738.method888(true);
                    class98.field1738 = null;
                }
                if (class159.field2818 >= 1) {
                    class92.field1640 = -5;
                    class202.field3573 = 0;
                    return;
                }
                class202.field3573 = 1;
                class159.field2818++;
                if (class279.field4890 == class227.field4160) {
                    class279.field4890 = class1.field11;
                } else {
                    class279.field4890 = class227.field4160;
                }
                class180.field3237 = 0;
            }
            if (class202.field3573 == 1) {
                class270.field4775 = class20.field326.method1635(0, class279.field4890, class275.field4809);
                class202.field3573 = 2;
            }
            if (class202.field3573 == 2) {
                if (class270.field4775.field1696 == 2) {
                    throw new IOException();
                }
                if (class270.field4775.field1696 != 1) {
                    return;
                }
                class98.field1738 = new class127((Socket) class270.field4775.field1699, class20.field326);
                class270.field4775 = null;
                class98.field1738.method894(0, class261.field4645.field2568, class261.field4645.field2593, -75);
                if (class34.field677 != null) {
                    class34.field677.method448(0);
                }
                if (class200.field3532 != null) {
                    class200.field3532.method448(arg0 - 6);
                }
                int var1 = class98.field1738.method897(30000);
                if (class34.field677 != null) {
                    class34.field677.method448(0);
                }
                if (class200.field3532 != null) {
                    class200.field3532.method448(0);
                }
                if (var1 != 101) {
                    class92.field1640 = var1;
                    class202.field3573 = 0;
                    class98.field1738.method888(true);
                    class98.field1738 = null;
                    return;
                }
                class202.field3573 = 3;
            }
            if (class202.field3573 == 3 && class98.field1738.method891(1) >= 2) {
                int var2 = class98.field1738.method897(arg0 + 29994) << 8 | class98.field1738.method897(arg0 + 29994);
                class78.method591((byte) -52, var2);
                if (class173.field3089 == -1) {
                    class92.field1640 = 6;
                    class202.field3573 = 0;
                    class98.field1738.method888(true);
                    class98.field1738 = null;
                } else {
                    class202.field3573 = 0;
                    class98.field1738.method888(true);
                    class98.field1738 = null;
                    class195.method1357(1);
                }
            }
        } catch (IOException var3) {
            if (class98.field1738 != null) {
                class98.field1738.method888(true);
                class98.field1738 = null;
            }
            if (class159.field2818 < 1) {
                class180.field3237 = 0;
                class202.field3573 = 1;
                if (class279.field4890 == class227.field4160) {
                    class279.field4890 = class1.field11;
                } else {
                    class279.field4890 = class227.field4160;
                }
                class159.field2818++;
            } else {
                class202.field3573 = 0;
                class92.field1640 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
    public static void method97(int arg0) {
        field238 = null;
        field244 = null;
        field249 = null;
        field237 = null;
        field242 = null;
        if (arg0 != 1620) {
            method95((byte) 113);
        }
        field246 = null;
        field240 = null;
        field239 = null;
    }
}
