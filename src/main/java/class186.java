import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class186 {

    @OriginalMember(owner = "client!di", name = "a", descriptor = "[[B")
    public static byte[][] field2560 = new byte[250][];

    @OriginalMember(owner = "client!di", name = "f", descriptor = "Lqh;")
    public static class96 field2565 = new class96();

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field2569 = 0;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    public static int field2574 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public int field2561;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public int field2562;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public int field2563;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "I")
    public int field2573;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "J")
    public long field2567;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "Ldn;")
    public class132 field2568;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "Ldn;")
    public class132 field2570;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "Ldn;")
    public class132 field2575;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "Lin;")
    public static class344 field2572;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)V", line = 6)
    public static final void method1303(boolean arg0) {
        field2564++;
        class165.field2259 = null;
        class221.method1564(0, 0, -1, 0, arg0, class64.field836, class183.field2521, 0, class187.field2592);
        if (class165.field2259 != null) {
            class16.method102(-1412584499, 0, class343.field5165, class21.field281.field5230, class165.field2259, false, 0, class64.field836, class210.field3043, class187.field2592);
            class165.field2259 = null;
        }
        if (arg0) {
            field2574 = 13;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IJ)V", line = 38)
    public static final void method1304(int arg0, long arg1) {
        field2566++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg0 != 10) {
            method1306(-119);
        }
        if ((arg1 % 10L) == 0L) {
            class192.method1344(arg1 - 1L, 4032);
            class192.method1344(1L, 4032);
        } else {
            class192.method1344(arg1, arg0 ^ 0xFCA);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lkm;I)V", line = 64)
    public static final void method1305(class133 arg0, int arg1) {
        field2571++;
        class238.field3383 = arg0;
        class326.field4930 = class238.field3383.method970(arg1 ^ 0xFFFFFF84, 4);
        if (arg1 != 0) {
            field2569 = -97;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V", line = 86)
    public static void method1306(int arg0) {
        field2565 = null;
        field2560 = (byte[][]) null;
        if (arg0 == -16) {
            field2572 = null;
        }
    }
}
