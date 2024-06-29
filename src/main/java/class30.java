import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class30 {

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public int field723 = 0;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public int field715 = 0;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "Lu;")
    public static class135 field719 = class87.method676((byte) -68, "Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1");

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "[S")
    public static short[] field725 = new short[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486 };

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "Lu;")
    public static class135 field722 = class87.method676((byte) -51, ")3");

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "Lu;")
    private static class135 field729 = class87.method676((byte) -112, "Loading sprites )2 ");

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "Lu;")
    public static class135 field739 = class87.method676((byte) -77, "backbase2");

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "Lu;")
    public static class135 field726 = field729;

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "Lu;")
    private static class135 field740 = class87.method676((byte) -63, "flash3:");

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "Lu;")
    public static class135 field730 = field740;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "[I")
    public static int[] field724 = new int[1000];

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "Lu;")
    public static class135 field732 = field740;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "Lu;")
    private static class135 field738 = class87.method676((byte) -111, "Enter object name");

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "Lu;")
    public static class135 field721 = field738;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Loe;")
    public static class102 field716 = new class102(4096);

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "Lu;")
    public static class135 field741 = null;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "Lu;")
    public static class135 field742 = class87.method676((byte) -91, "weiss:");

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public int field717;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public int field720;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public int field727;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public int field731;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
    public int field735;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "Lvb;")
    public class143 field734;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)[Lae;")
    public static final class6[] method242(int arg0) {
        class6[] var1 = new class6[class53.field1280];
        for (int var2 = arg0; var2 < class53.field1280; var2++) {
            class6 var3 = var1[var2] = new class6();
            var3.field136 = class80.field1918;
            var3.field133 = class48.field1140;
            var3.field138 = class59.field1451[var2];
            var3.field135 = class107.field2567[var2];
            var3.field132 = class86.field2061[var2];
            var3.field134 = client.field533[var2];
            var3.field131 = class69.field1696;
            var3.field137 = class29.field699[var2];
        }
        class43.method320(-83);
        field736++;
        return var1;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lu;ILg;Lu;)[Lae;")
    public static final class6[] method243(class135 arg0, int arg1, class43 arg2, class135 arg3) {
        field718++;
        int var4 = arg2.method317((byte) 13, arg0);
        if (arg1 != 918) {
            field732 = null;
        }
        int var5 = arg2.method340(var4, (byte) 37, arg3);
        return class97.method798(arg2, var5, true, var4);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lg;ZLg;)V")
    public static final void method244(class43 arg0, boolean arg1, class43 arg2) {
        class55.field1291 = arg2;
        field714++;
        class4.field108 = arg0;
        if (arg1) {
            method242(6);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lcc;BIII)V")
    public static final void method245(class18 arg0, byte arg1, int arg2, int arg3, int arg4) {
        class43.field1006.method966(-52);
        class106.field2559.method29(0, 0);
        arg0.method130(class1.field27, 55, 28, 16777215, true);
        if (arg1 <= 8) {
            method243(null, 57, null, null);
        }
        if (arg4 == 0) {
            arg0.method130(class82.field1936, 55, 41, 65280, true);
        }
        field737++;
        if (arg4 == 1) {
            arg0.method130(class57.field1395, 55, 41, 16776960, true);
        }
        if (arg4 == 2) {
            arg0.method130(class87.field2064, 55, 41, 16711680, true);
        }
        if (arg4 == 3) {
            arg0.method130(class116.field2799, 55, 41, 65535, true);
        }
        arg0.method130(class122.field2931, 184, 28, 16777215, true);
        if (arg3 == 0) {
            arg0.method130(class82.field1936, 184, 41, 65280, true);
        }
        if (arg3 == 1) {
            arg0.method130(class57.field1395, 184, 41, 16776960, true);
        }
        if (arg3 == 2) {
            arg0.method130(class87.field2064, 184, 41, 16711680, true);
        }
        arg0.method130(class128.field3087, 324, 28, 16777215, true);
        if (arg2 == 0) {
            arg0.method130(class82.field1936, 324, 41, 65280, true);
        }
        if (arg2 == 1) {
            arg0.method130(class57.field1395, 324, 41, 16776960, true);
        }
        if (arg2 == 2) {
            arg0.method130(class87.field2064, 324, 41, 16711680, true);
        }
        arg0.method124(class124.field2948, 417, 17, 85, 25, 16777215, true, 1, 1, 0);
        try {
            Graphics var5 = class59.field1484.getGraphics();
            class43.field1006.method94(-17740, 453, var5, 0);
        } catch (Exception var6) {
            class59.field1484.repaint();
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lu;Lu;ILg;)[Lbc;")
    public static final class11[] method246(class135 arg0, class135 arg1, int arg2, class43 arg3) {
        int var4 = -43 / ((arg2 + 5) / 59);
        field733++;
        int var5 = arg3.method317((byte) 13, arg0);
        int var6 = arg3.method340(var5, (byte) 37, arg1);
        return class57.method438(true, arg3, var6, var5);
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
    public static void method247(int arg0) {
        field742 = null;
        if (arg0 != 184) {
            method243(null, 11, null, null);
        }
        field719 = null;
        field722 = null;
        field732 = null;
        field741 = null;
        field739 = null;
        field726 = null;
        field721 = null;
        field740 = null;
        field724 = null;
        field716 = null;
        field725 = null;
        field729 = null;
        field730 = null;
        field738 = null;
    }
}
