import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class107 {

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public int field1492 = -1;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "[I")
    public static int[] field1493 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    public static int field1497 = -1;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "[I")
    public static int[] field1496 = new int[4096];

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "Li;")
    public class57 field1495;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "[I")
    public int[] field1494;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "[Ljava/lang/String;")
    public String[] field1488;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)V")
    public static final void method688(int arg0, int arg1) {
        class210.field3000 = (class254) class229.field3473.method23(216, (long) arg1);
        field1489++;
        if (arg0 != 8) {
            method688(-49, -99);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
    public static void method689(byte arg0) {
        field1496 = null;
        field1493 = null;
        if (arg0 >= -19) {
            field1497 = 103;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public static final void method690(int arg0) {
        if (arg0 != 0) {
            method692(-126, -17, (byte) -93, -25, 47);
        }
        class193.field2657.method544(false);
        field1491++;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V")
    public static final void method691(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class46.field673[var1] = false;
        }
        class143.field1986 = -1;
        class48.field694 = 0;
        class153.field2122 = -1;
        class51.field734 = 5;
        if (arg0 == 10099) {
            field1490++;
            class200.field2780 = 0;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIBII)V")
    public static final void method692(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var5 = -107 % ((arg2 + 2) / 44);
        for (int var6 = 0; var6 < class265.field3979; var6++) {
            if (class123.field1713[var6] + class118.field1670[var6] > arg4 && class118.field1670[var6] < (arg1 + arg4) && class150.field2074[var6] + class101.field1420[var6] > arg3 && class101.field1420[var6] < arg3 + arg0) {
                class293.field4607[var6] = true;
            }
        }
        field1498++;
    }
}
