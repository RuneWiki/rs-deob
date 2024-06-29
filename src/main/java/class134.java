import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class134 {

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field1746 = 0;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "[I")
    public static int[] field1749 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V", line = 5)
    public static void method956(byte arg0) {
        field1749 = null;
        int var1 = -21 % ((-arg0 - 20) / 45);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V", line = 21)
    public static final void method957(int arg0) {
        field1750++;
        if (class396.field5779 && class277.field4063[81] && class402.field5874 > 2) {
            class60.method536((class138) class186.field2547.field3397.field6090.field6090, (byte) -83);
        } else {
            class60.method536((class138) class186.field2547.field3397.field6090, (byte) -83);
        }
        int var1 = 98 / ((arg0 + 26) / 55);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)V", line = 40)
    public static final void method958(int arg0, int arg1) {
        if (arg0 != 1) {
            field1749 = null;
        }
        class199.field2752.method379(arg1, false);
        field1747++;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILmq;)V", line = 59)
    public static final void method959(int arg0, class417 arg1) {
        field1748++;
        arg1.field6085 = false;
        if (arg1.field6087 != null) {
            arg1.field6087.field5372 = 0;
        }
        class417 var2 = arg1.method189();
        int var3 = -97 % ((arg0 + 43) / 33);
        while (var2 != null) {
            method959(-118, var2);
            var2 = arg1.method156();
        }
    }
}
