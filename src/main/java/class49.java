import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class49 {

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "[I")
    public static int[] field762 = new int[200];

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "Z")
    public static volatile boolean field770 = true;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "I")
    public static int field771 = 0;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "Z")
    public static boolean field764 = false;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
    public int field761;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public int field763;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
    public int field769;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "Lol;")
    public static class231 field767;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "[Lmj;")
    public static class229[] field772;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lhi;IB)V", line = 5)
    private final void method339(class291 arg0, int arg1, byte arg2) {
        field760++;
        if (arg1 == 1) {
            this.field769 = arg0.method2021((byte) 74);
            this.field761 = arg0.method2011(-86);
            this.field763 = arg0.method2011(-24);
        }
        if (arg2 < 99) {
            this.method339((class291) null, 74, (byte) 52);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lah;I)Z", line = 26)
    public static final boolean method340(class205 arg0, int arg1) {
        field768++;
        if (arg1 <= 118) {
            field771 = -28;
        }
        return arg0.method1361(-1, class79.field1108);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V", line = 45)
    public static void method341(int arg0) {
        field772 = null;
        if (arg0 == 1) {
            field762 = null;
            field767 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IB)Lwm;", line = 61)
    public static final class152 method342(int arg0, byte arg1) {
        field765++;
        return arg1 <= 51 ? (class152) null : class195.method1307(new class152[] { class38.method280(79, arg0 >> 24 & 0xFF), class45.field723, class38.method280(114, (arg0 & 0xFFC494) >> 16), class45.field723, class38.method280(85, arg0 >> 8 & 0xFF), class45.field723, class38.method280(71, arg0 & 0xFF) }, (byte) 29);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lhi;I)V", line = 75)
    public final void method343(class291 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2011(-126);
            if (var3 == 0) {
                field766++;
                int var4 = 112 / ((arg1 + 33) / 58);
                return;
            }
            this.method339(arg0, var3, (byte) 106);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIZ)V", line = 96)
    public static final void method344(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class112.field1595 = arg1;
        class97.field1394 = arg2;
        class245.field4087 = arg3;
        class202.field3271 = new class34[arg0][class112.field1595][class97.field1394];
        class123.field1728 = new int[arg0][class112.field1595 + 1][class97.field1394 + 1];
        if (class217.field3516) {
            class27.field472 = new class1[4][];
        }
        if (arg4) {
            class194.field3102 = new class34[1][class112.field1595][class97.field1394];
            class290.field4926 = new int[class112.field1595][class97.field1394];
            class231.field3779 = new int[1][class112.field1595 + 1][class97.field1394 + 1];
            if (class217.field3516) {
                class137.field2103 = new class1[1][];
            }
        } else {
            class194.field3102 = (class34[][][]) null;
            class290.field4926 = (int[][]) null;
            class231.field3779 = (int[][][]) null;
            class137.field2103 = (class1[][]) null;
        }
        class159.method1062(false);
        class139.field2121 = new class30[500];
        class30.field518 = 0;
        class169.field2640 = new class30[500];
        class245.field4079 = 0;
        class227.field3700 = new int[arg0][class112.field1595 + 1][class97.field1394 + 1];
        class237.field3881 = new class248[5000];
        class213.field3474 = 0;
        class163.field2579 = new class248[100];
        class142.field2188 = new boolean[class245.field4087 + class245.field4087 + 1][class245.field4087 + class245.field4087 + 1];
        class289.field4895 = new boolean[class245.field4087 + class245.field4087 + 2][class245.field4087 + class245.field4087 + 2];
        class97.field1401 = new byte[arg0][class112.field1595][class97.field1394];
    }
}
