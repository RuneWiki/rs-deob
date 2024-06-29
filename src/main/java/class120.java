import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class120 extends class32 {

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "[J")
    public static long[] field2776 = new long[200];

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "Lv;")
    private static class146 field2774 = class159.method1226((byte) -37, "Malformed login packet)3");

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "Lv;")
    private static class146 field2782 = class159.method1226((byte) -37, "Loaded textures");

    @OriginalMember(owner = "client!rb", name = "I", descriptor = "Lv;")
    public static class146 field2789 = class159.method1226((byte) -37, "");

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "J")
    public static long field2783 = 0L;

    @OriginalMember(owner = "client!rb", name = "N", descriptor = "I")
    public static int field2794 = 0;

    @OriginalMember(owner = "client!rb", name = "O", descriptor = "Lv;")
    public static class146 field2795 = class159.method1226((byte) -37, "<col=ff0000>");

    @OriginalMember(owner = "client!rb", name = "K", descriptor = "Lv;")
    public static class146 field2791 = field2774;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "Lv;")
    public static class146 field2780 = class159.method1226((byte) -37, "Hidden)2use");

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "Lv;")
    public static class146 field2779 = class159.method1226((byte) -37, "T");

    @OriginalMember(owner = "client!rb", name = "V", descriptor = "Lv;")
    public static class146 field2802 = class159.method1226((byte) -37, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "Lv;")
    public static class146 field2784 = field2782;

    @OriginalMember(owner = "client!rb", name = "P", descriptor = "Lv;")
    public static class146 field2796 = class159.method1226((byte) -37, "und haben es deaktiviert)3 Klicken Sie auf der");

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "Lv;")
    public static class146 field2788 = class159.method1226((byte) -37, "nicht hergestellt werden)3");

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
    public int field2777;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "I")
    public int field2781;

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!rb", name = "M", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!rb", name = "Q", descriptor = "I")
    public int field2797;

    @OriginalMember(owner = "client!rb", name = "S", descriptor = "I")
    public int field2799;

    @OriginalMember(owner = "client!rb", name = "T", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!rb", name = "U", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!rb", name = "W", descriptor = "I")
    public int field2803;

    @OriginalMember(owner = "client!rb", name = "L", descriptor = "Lv;")
    public class146 field2792;

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "Ldd;")
    public class26 field2786;

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "Ldd;")
    public class26 field2787;

    @OriginalMember(owner = "client!rb", name = "R", descriptor = "[Lue;")
    public static class144[] field2798;

    @OriginalMember(owner = "client!rb", name = "J", descriptor = "[Ljava/lang/Object;")
    public Object[] field2790;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)V")
    public static void method910(int arg0) {
        field2802 = null;
        if (arg0 != 128) {
            return;
        }
        field2779 = null;
        field2796 = null;
        field2798 = null;
        field2795 = null;
        field2784 = null;
        field2788 = null;
        field2789 = null;
        field2780 = null;
        field2791 = null;
        field2776 = null;
        field2774 = null;
        field2782 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBI)V")
    public static final void method911(int arg0, byte arg1, int arg2) {
        int var3 = 16 % ((37 - arg1) / 63);
        field2773++;
        if (class41.field934 == 2) {
            class34.method228((class82.field2002 - class76.field1814 << 7) + class64.field1448, (class82.field2006 - class63.field1429 << 7) + class148.field3432, class159.field3656 * 2, 1990945680);
            if (class146.field3380 > -1 && class94.field2229 % 20 < 10) {
                class119.field2766[0].method423(arg0 + class146.field3380 - 12, class108.field2577 + -28 + arg2);
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lef;I)V")
    public static final void method912(class35 arg0, int arg1) {
        if (class94.field2229 == arg0.field803 || arg0.field753 == -1 || arg0.field791 != 0 || arg0.field789 + 1 > class141.method1052(true, arg0.field753).field1680[arg0.field747]) {
            int var2 = arg0.field814 * 128 + arg0.field742 * 64;
            int var3 = arg0.field779 * 128 + arg0.field742 * 64;
            int var4 = arg0.field803 - arg0.field766;
            int var5 = class94.field2229 - arg0.field766;
            int var6 = arg0.field785 * 128 + arg0.field742 * 64;
            int var7 = arg0.field767 * 128 + arg0.field742 * 64;
            arg0.field757 = ((var4 - var5) * var2 + var5 * var6) / var4;
            arg0.field790 = ((var4 - var5) * var3 + var5 * var7) / var4;
        }
        field2775++;
        if (arg1 <= 59) {
            field2789 = null;
        }
        arg0.field796 = 0;
        if (arg0.field778 == 0) {
            arg0.field780 = 1024;
        }
        if (arg0.field778 == 1) {
            arg0.field780 = 1536;
        }
        if (arg0.field778 == 2) {
            arg0.field780 = 0;
        }
        if (arg0.field778 == 3) {
            arg0.field780 = 512;
        }
        arg0.field763 = arg0.field780;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)Z")
    public static final boolean method913(int arg0, int arg1) {
        field2801++;
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        } else if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else {
            if (arg1 != -28) {
                field2778 = 111;
            }
            return arg0 >= 48 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILla;Lla;Lla;Lla;)V")
    public static final void method914(int arg0, class77 arg1, class77 arg2, class77 arg3, class77 arg4) {
        class108.field2584 = arg2;
        class37.field820 = arg4;
        class122.field2832 = arg1;
        field2785++;
        class5.field111 = arg3;
        class34.field736 = new class26[class37.field820.method580((byte) 111)][];
        class110.field2609 = new boolean[class37.field820.method580((byte) -69)];
        if (arg0 != 200) {
            method914(24, null, null, null, null);
        }
    }
}
