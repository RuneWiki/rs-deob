import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class413 extends class179 {

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "Lfg;")
    public static class18 field5992 = new class18(5);

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "I")
    public static int field5999 = 0;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "Lrd;")
    public static class417 field5997 = new class417(0, -1);

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "[I")
    public static int[] field6002 = new int[3];

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "C")
    private char field5990;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public static int field5991;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
    public int field5993;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
    public static int field5995;

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
    public static int field5996;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "I")
    public static int field6001;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "Ljava/lang/String;")
    public String field5994;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lec;IB)V", line = 4)
    private final void method2590(class37 arg0, int arg1, byte arg2) {
        int var4 = 24 % ((-arg2 - 60) / 41);
        field5991++;
        if (arg1 == 1) {
            this.field5990 = class254.method1841(arg0.method291(0), (byte) -127);
        } else if (arg1 == 2) {
            this.field5993 = arg0.method278(61);
        } else if (arg1 == 5) {
            this.field5994 = arg0.method322((byte) -34);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLec;)V", line = 31)
    public final void method2591(byte arg0, class37 arg1) {
        field5996++;
        if (arg0 != -77) {
            method2592(-52, -6);
        }
        while (true) {
            int var3 = arg1.method271((byte) 115);
            if (var3 == 0) {
                return;
            }
            this.method2590(arg1, var3, (byte) -18);
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(II)Z", line = 52)
    public static final boolean method2592(int arg0, int arg1) {
        if (arg0 != 847) {
            method2592(82, 24);
        }
        field5998++;
        return (arg1 & -arg1) == arg1;
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)V", line = 64)
    public static void method2593(int arg0) {
        field6002 = null;
        field5997 = null;
        if (arg0 != 115) {
            method2593(76);
        }
        field5992 = null;
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(B)Z", line = 85)
    public final boolean method2594(byte arg0) {
        if (arg0 > -110) {
            return false;
        } else {
            field5995++;
            return this.field5990 == 's';
        }
    }
}
