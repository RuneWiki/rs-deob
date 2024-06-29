import java.awt.event.KeyEvent;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class124 {

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "[[[Lrc;")
    public static class121[][][] field2796 = new class121[4][104][104];

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "Lsc;")
    public static class128 field2801 = class129.method1017(false, "(U");

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
    public static int field2807 = 0;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "Lsc;")
    private static class128 field2800 = class129.method1017(false, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public static int field2805 = 0;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field2802 = 0;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "Lsc;")
    public static class128 field2804 = class129.method1017(false, "_");

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "Lsc;")
    public static class128 field2797 = field2800;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "Lsc;")
    public static class128 field2803 = class129.method1017(false, "gleiten:");

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "[I")
    public static int[] field2799 = new int[1000];

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "Lsc;")
    private static class128 field2813 = class129.method1017(false, "Loading config )2 ");

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "Lsc;")
    public static class128 field2809 = field2813;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2808 = new CRC32();

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "Lgf;")
    public static class48 field2815;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "Lnb;")
    public static class92 field2814;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIB)I")
    public static final int method942(int arg0, int arg1, int arg2, byte arg3) {
        field2810++;
        if (arg0 > 179) {
            arg2 /= 2;
        }
        if (arg0 > 192) {
            arg2 /= 2;
        }
        if (arg0 > 217) {
            arg2 /= 2;
        }
        if (arg3 != 61) {
            field2804 = null;
        }
        if (arg0 > 243) {
            arg2 /= 2;
        }
        return arg0 / 2 + (arg1 / 4 << 10) + (arg2 / 32 << 7);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZLjava/awt/event/KeyEvent;)I")
    public static final int method943(boolean arg0, KeyEvent arg1) {
        field2806++;
        if (arg0) {
            method947(53);
        }
        int var2 = arg1.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)V")
    public static final void method944(int arg0, int arg1) {
        class126.field2851 = -1;
        class20.field381 = null;
        class49.field882 = 0;
        field2798++;
        if (arg0 == 217) {
            class21.field410 = arg1;
            class30.field606 = -1;
            class5.field55 = false;
            class27.field530 = 1;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)V")
    public static void method945(boolean arg0) {
        field2814 = null;
        field2803 = null;
        field2800 = null;
        field2797 = null;
        field2801 = null;
        field2809 = null;
        if (!arg0) {
            field2809 = null;
        }
        field2799 = null;
        field2808 = null;
        field2815 = null;
        field2813 = null;
        field2796 = null;
        field2804 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)Lr;")
    public static final class118 method946(int arg0, byte arg1) {
        if (arg1 > -64) {
            method942(-117, -11, -40, (byte) -54);
        }
        field2811++;
        class118 var2 = (class118) class29.field547.method917((long) arg0, -1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class132.field3102.method1023(arg0, 1, (byte) -35);
        class118 var4 = new class118();
        if (var3 != null) {
            var4.method901(arg0, new class86(var3), (byte) 39);
        }
        var4.method902(256);
        class29.field547.method913((long) arg0, var4, (byte) 95);
        return var4;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public static final void method947(int arg0) {
        class46.field848 = null;
        if (arg0 != -257) {
            method943(false, null);
        }
        class16.field305 = null;
        class115.field2590 = null;
        field2812++;
        class106.field2418 = null;
        class9.field139 = null;
        class37.field713 = null;
        class63.field1354 = null;
        class156.field3585 = null;
        class119.field2686 = null;
        class131.field2999 = null;
        class95.field2229 = null;
        class29.field559 = null;
    }
}
