import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class144 {

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "Z")
    public static volatile boolean field2454 = false;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "Lhi;")
    public static class82 field2459 = class95.method664((byte) -88, "Untersuchen");

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "I")
    public static int field2464 = 0;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "[I")
    public static int[] field2462 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "[J")
    public static long[] field2458 = new long[100];

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "Lhi;")
    public static class82 field2463 = class95.method664((byte) -54, ": ");

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "I")
    public static int field2465 = 0;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "Z")
    public static boolean field2455;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILsm;Ljava/awt/Frame;)V", line = 4)
    public static final void method978(int arg0, class120 arg1, Frame arg2) {
        field2461++;
        if (arg0 != -2) {
            return;
        }
        while (true) {
            class301 var3 = arg1.method818(arg2, (byte) -100);
            while (var3.field5121 == 0) {
                class290.method2001(10L, false);
            }
            if (var3.field5121 == 1) {
                arg2.setVisible(false);
                arg2.dispose();
                return;
            }
            class290.method2001(100L, false);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V", line = 59)
    public static void method979(byte arg0) {
        field2458 = null;
        field2463 = null;
        field2459 = null;
        field2462 = null;
        int var1 = 47 % ((29 - arg0) / 47);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V", line = 71)
    public static final void method980(int arg0) {
        if (~class238.field4147 == arg0) {
            if (class45.field775 == class222.field3838 && class27.field360 == class231.field3980) {
                class238.field4147 = 0;
                if (class23.field317 && class19.field235[81] && class309.field5262 > 2) {
                    class149.method1029(arg0 ^ 0x2, class309.field5262 - 2);
                } else {
                    class149.method1029(arg0 ^ 0x2, class309.field5262 - 1);
                }
            }
        } else if (class45.field775 == class166.field2904 && class27.field360 == class255.field4394) {
            class238.field4147 = 0;
            if (class23.field317 && class19.field235[81] && class309.field5262 > 2) {
                class149.method1029(arg0 + 2, class309.field5262 + -2);
            } else {
                class149.method1029(-1, class309.field5262 - 1);
            }
        } else {
            class238.field4147 = 2;
            class222.field3838 = class166.field2904;
            class231.field3980 = class255.field4394;
        }
        field2460++;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZ)V", line = 134)
    public static final void method981(int arg0, boolean arg1) {
        field2457++;
        if (arg1 == field2455) {
            return;
        }
        field2455 = arg1;
        class161.method1168((byte) 104);
        if (arg0 != -1) {
            method978(-120, (class120) null, (Frame) null);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(JB)V", line = 154)
    public static final void method982(long arg0, byte arg1) {
        try {
            Thread.sleep(arg0);
            if (arg1 != 10) {
                method978(-76, (class120) null, (Frame) null);
            }
        } catch (InterruptedException var4) {
        }
        field2456++;
    }
}
