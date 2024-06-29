import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class104 {

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public int field1414 = -1;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field1417 = 0;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "[I")
    public static int[] field1418 = new int[1000];

    @OriginalMember(owner = "client!p", name = "a", descriptor = "Lrc;")
    public static class9 field1408 = new class9(2);

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "Lbc;")
    public static class282 field1419;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "Ltg;")
    public class286 field1420;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "[I")
    public int[] field1412;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "[Ljava/lang/String;")
    public String[] field1409;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "[[[I")
    public static int[][][] field1413;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)I")
    public static final int method630(byte arg0) {
        field1410++;
        if (arg0 != 57) {
            method632(24, (class282) null);
        }
        return 6;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)I")
    public static final int method631(int arg0) {
        if (arg0 >= -78) {
            return -104;
        } else {
            field1416++;
            return 2;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILbc;)V")
    public static final void method632(int arg0, class282 arg1) {
        if (arg0 == 0) {
            field1415++;
            class123.field1770 = arg1;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
    public static void method633(int arg0) {
        field1408 = null;
        if (arg0 <= -48) {
            field1418 = null;
            field1413 = null;
            field1419 = null;
        }
    }
}
