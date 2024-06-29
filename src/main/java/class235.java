import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class235 {

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public static int field3831 = 0;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "[I")
    public static int[] field3834 = new int[25];

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "I")
    public static int field3837 = 0;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    public static int field3829 = 0;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public int field3824;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
    public int field3832;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public int field3833;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "I")
    public int field3840;

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "J")
    public long field3839;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "Lik;")
    public class260 field3823;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "Lik;")
    public class260 field3827;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "Lik;")
    public class260 field3828;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "Z")
    public static boolean field3836;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V")
    public static final void method1636(byte arg0) {
        if (arg0 <= 85) {
            method1637(-17, (byte) -107);
        }
        field3830++;
        class17.field292.method401((byte) 52);
        for (int var1 = 0; var1 < 32; var1++) {
            class26.field422[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class7.field81[var2] = 0L;
        }
        class25.field417 = 0;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IB)V")
    public static final void method1637(int arg0, byte arg1) {
        field3826++;
        if (arg0 == -1 && !class98.field1601) {
            class153.method1063((byte) -127);
        } else if (arg0 != -1 && (class148.field2389 != arg0 || !class60.method432((byte) -9)) && class284.field4480 != 0 && !class98.field1601) {
            class106.method768(2, -1748, false, class168.field2665, arg0, 0, class284.field4480);
        }
        if (arg1 <= 0) {
            class148.field2389 = arg0;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
    public static void method1638(int arg0) {
        if (arg0 < -71) {
            field3834 = null;
        }
    }
}
