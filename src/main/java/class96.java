import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class96 {

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "[I")
    public static int[] field1751 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field1752 = -1;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "Lem;")
    public static class14 field1746;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "Lth;")
    public static class98 field1750;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)I", line = 5)
    public static final int method733(int arg0) {
        field1754++;
        if (arg0 > -95) {
            field1751 = (int[]) null;
        }
        return class220.field3654;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V", line = 20)
    public static void method734(boolean arg0) {
        field1746 = null;
        if (!arg0) {
            field1751 = (int[]) null;
        }
        field1750 = null;
        field1751 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lnh;", line = 41)
    public static final class132 method735(Throwable arg0, String arg1) {
        field1755++;
        class132 var2;
        if ((arg0 instanceof class132)) {
            var2 = (class132) arg0;
            var2.field2270 = var2.field2270 + ' ' + arg1;
        } else {
            var2 = new class132(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([JI[Ljava/lang/Object;)V", line = 109)
    public static final void method736(long[] arg0, int arg1, Object[] arg2) {
        field1749++;
        class260.method1830(arg2, 0, arg0, 22598, arg0.length + arg1);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLoe;I)Lpg;", line = 153)
    public static final class226 method737(byte arg0, class146 arg1, int arg2) {
        class226 var3 = new class226(arg2, arg1.method1017((byte) -122), arg1.method1017((byte) -116), arg1.method1004(3), arg1.method1004(3), arg1.method1005((byte) 122) == 1, arg1.method1005((byte) 122));
        field1753++;
        if (arg0 < 49) {
            field1752 = -52;
        }
        int var4 = arg1.method1005((byte) 122);
        for (int var5 = 0; var5 < var4; var5++) {
            var3.field3730.method437(new class153(arg1.method1005((byte) 122), arg1.method1005((byte) 122), arg1.method989(87), arg1.method989(109), arg1.method989(121), arg1.method989(83), arg1.method989(83), arg1.method989(94), arg1.method989(121), arg1.method989(116)), (byte) 51);
        }
        var3.method1575(0);
        return var3;
    }
}
