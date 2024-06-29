import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class240 {

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field3748 = new String[200];

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
    public static int field3761 = 2;

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "[I")
    public static int[] field3756 = new int[1000];

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field3750 = 0;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field3747 = 0;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public int field3751;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
    public int field3753;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
    public int field3754;

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "I")
    public int field3762;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "J")
    public long field3752;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "Lie;")
    public class34 field3749;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "Lie;")
    public class34 field3755;

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "Lie;")
    public class34 field3758;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V")
    public static final void method1631(byte arg0) {
        field3757++;
        if (class221.field3487 > 0) {
            class116.method801(104);
            return;
        }
        class122.field1921 = class18.field322;
        class18.field322 = null;
        if (arg0 == -67) {
            class143.method983(40, 16590);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZ)I")
    public static final int method1632(int arg0, boolean arg1) {
        field3760++;
        return arg1 ? 15 : arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
    public static void method1633(int arg0) {
        field3748 = null;
        if (arg0 == -1) {
            field3756 = null;
        }
    }
}
