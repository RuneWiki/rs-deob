import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class306 extends class68 {

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "[B")
    public byte[] field5138;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    public static int field5134 = 0;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    public static int field5130 = 0;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "[[S")
    public static short[][] field5136 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "Lcc;")
    public static class313 field5133;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "Lcc;")
    public static class313 field5135;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lbb;I)Lmd;", line = 7)
    public static final class229 method2051(class134 arg0, int arg1) {
        int var2 = -7 / ((arg1 + 15) / 43);
        field5139++;
        class229 var3 = new class229(arg0.method970(1), arg0.method970(1), arg0.method942(true), arg0.method942(true), arg0.method957(496113200), arg0.method948(-124) == 1, arg0.method948(-128));
        int var4 = arg0.method948(-126);
        for (int var5 = 0; var5 < var4; var5++) {
            var3.field3873.method899(new class244(arg0.method942(true), arg0.method942(true), arg0.method942(true), arg0.method942(true)), -28);
        }
        var3.method1560((byte) -110);
        return var3;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V", line = 34)
    public static void method2052(int arg0) {
        field5133 = null;
        field5135 = null;
        field5136 = (short[][]) null;
        if (arg0 != -30192) {
            field5133 = (class313) null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lce;IIJIBI)V", line = 62)
    public static final void method2053(class126 arg0, int arg1, int arg2, long arg3, int arg4, byte arg5, int arg6) {
        field5132++;
        class134 var8 = new class134(128);
        var8.method933(-3, 10);
        var8.method959(arg5 ^ 0x75, (int) (Math.random() * 99999.0D));
        var8.method959(-90, 527);
        var8.method962(-120, arg3);
        var8.method947((int) (Math.random() * 9.9999999E7D), (byte) 127);
        var8.method980(arg0, true);
        var8.method947((int) (Math.random() * 9.9999999E7D), (byte) 114);
        var8.method959(76, class126.field2121);
        var8.method933(-3, arg2);
        var8.method933(-3, arg6);
        var8.method947((int) (Math.random() * 9.9999999E7D), (byte) 117);
        var8.method959(arg5 ^ 0x59, arg4);
        var8.method959(-90, arg1);
        var8.method947((int) (Math.random() * 9.9999999E7D), (byte) 114);
        var8.method946(class195.field3323, class187.field3231, (byte) 104);
        class103.field1645.field2299 = 0;
        class103.field1645.method933(-3, 226);
        class103.field1645.method933(-3, var8.field2299);
        if (arg5 != 63) {
            method2052(-116);
        }
        class103.field1645.method924((byte) 112, 0, var8.field2299, var8.field2282);
        class287.field4773 = -3;
        class224.field3788 = 0;
        class209.field3596 = 0;
        class267.field4522 = 1;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "([B)V", line = 98)
    public class306(byte[] arg0) {
        this.field5138 = arg0;
    }
}
