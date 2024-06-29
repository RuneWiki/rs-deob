import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class358 {

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "Z")
    public static boolean field4901 = false;

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "[I")
    public static int[] field4903 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lkh;IZ)V")
    public static final void method2206(class17 arg0, int arg1, boolean arg2) {
        field4900++;
        if (arg1 <= 33) {
            return;
        }
        int var3 = arg0.field277 == 0 ? arg0.field347 : arg0.field277;
        int var4 = arg0.field364 == 0 ? arg0.field330 : arg0.field364;
        class584.method3353(arg0.field372, var3, 0, var4, class431.field5870[arg0.field372 >> 16], arg2);
        if (arg0.field320 != null) {
            class584.method3353(arg0.field372, var3, 0, var4, arg0.field320, arg2);
        }
        class637 var5 = (class637) class186.field2881.method337((long) arg0.field372, 1);
        if (var5 != null) {
            class309.method1971(var5.field8789, var4, arg2, 8, var3);
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)V")
    public static void method2207(byte arg0) {
        field4903 = null;
        if (arg0 <= 1) {
            method2207((byte) 20);
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V")
    public static final void method2208(int arg0) {
        field4902++;
        class111.field1911.method2823(true, class111.field1911.field6756, 1);
        class111.field1911.method2823(true, class111.field1911.field6734, 1);
        class111.field1911.method2823(true, class111.field1911.field6728, 2);
        class111.field1911.method2823(true, class111.field1911.field6722, 2);
        class111.field1911.method2823(true, class111.field1911.field6716, 1);
        class111.field1911.method2823(true, class111.field1911.field6754, 1);
        class111.field1911.method2823(true, class111.field1911.field6739, 1);
        class111.field1911.method2823(true, class111.field1911.field6718, 1);
        class111.field1911.method2823(true, class111.field1911.field6742, 1);
        class111.field1911.method2823(true, class111.field1911.field6743, 1);
        class111.field1911.method2823(true, class111.field1911.field6717, 2);
        class111.field1911.method2823(true, class111.field1911.field6749, 1);
        if (arg0 > -96) {
            field4899 = 105;
        }
        class111.field1911.method2823(true, class111.field1911.field6735, 2);
        class111.field1911.method2823(true, class111.field1911.field6765, 1);
        class111.field1911.method2823(true, class111.field1911.field6715, 0);
        class111.field1911.method2823(true, class111.field1911.field6744, 0);
        class111.field1911.method2823(true, class111.field1911.field6733, 2);
        class111.field1911.method2823(true, class111.field1911.field6764, 0);
        class111.field1911.method2823(true, class111.field1911.field6760, 0);
        class421.method2480((byte) -61);
        class111.field1911.method2823(true, class111.field1911.field6758, 0);
        class111.field1911.method2823(true, class111.field1911.field6750, 4);
        class463.method2677(124);
        class596.method3394(9);
        class235.field3375 = true;
    }
}
