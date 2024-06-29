import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class696 {

    @OriginalMember(owner = "client!hda", name = "d", descriptor = "I")
    public static int field9800 = 2;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "Lqfa;")
    public static class85 field9797 = new class85(49, 12);

    @OriginalMember(owner = "client!hda", name = "f", descriptor = "Lsb;")
    public static class266 field9802 = new class266(66, -1);

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "I")
    public static int field9799;

    @OriginalMember(owner = "client!hda", name = "e", descriptor = "I")
    public static int field9801;

    @OriginalMember(owner = "client!hda", name = "g", descriptor = "Lik;")
    public static class193 field9803;

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field9798;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)V")
    public static void method3893(int arg0) {
        field9803 = null;
        if (arg0 <= 2) {
            field9803 = null;
        }
        field9798 = null;
        field9802 = null;
        field9797 = null;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(II)I")
    public static final int method3894(int arg0, int arg1) {
        field9799++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        if (arg0 != 0) {
            field9803 = null;
        }
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(B)V")
    public static final void method3895(byte arg0) {
        class118.method1038(11, arg0 ^ 0x19);
        field9801++;
        class648.method3696(true);
        System.gc();
        if (arg0 != 24) {
            field9803 = null;
        }
    }
}
