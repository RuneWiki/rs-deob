import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class485 extends class41 {

    @OriginalMember(owner = "client!rw", name = "t", descriptor = "I")
    public int field6462;

    @OriginalMember(owner = "client!rw", name = "w", descriptor = "I")
    public int field6465;

    @OriginalMember(owner = "client!rw", name = "p", descriptor = "I")
    public int field6458;

    @OriginalMember(owner = "client!rw", name = "r", descriptor = "I")
    public int field6460;

    @OriginalMember(owner = "client!rw", name = "q", descriptor = "I")
    public int field6459;

    @OriginalMember(owner = "client!rw", name = "s", descriptor = "I")
    public int field6461;

    @OriginalMember(owner = "client!rw", name = "u", descriptor = "Lnj;")
    public static class415 field6463 = new class415(4, 3);

    @OriginalMember(owner = "client!rw", name = "o", descriptor = "I")
    public static int field6457;

    @OriginalMember(owner = "client!rw", name = "v", descriptor = "I")
    public static int field6464;

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lffa;Loca;IIIIIIIIIIIII)V", line = 6)
    public class485(class562 arg0, class573 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field6462 = arg13;
        this.field6465 = arg14;
        this.field6458 = arg12;
        this.field6460 = arg10;
        this.field6459 = arg11;
        this.field6461 = arg9;
    }

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "(I)V", line = 19)
    public static void method2669(int arg0) {
        field6463 = null;
        if (arg0 != 4) {
            method2670((byte) -58);
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)I", line = 29)
    public static final int method2670(byte arg0) {
        if (arg0 >= -125) {
            return 1;
        } else {
            field6457++;
            return class667.field9256;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)Lfl;", line = 50)
    public class103 method318(int arg0) {
        if (arg0 == -26207) {
            field6464++;
            return class240.field3234;
        } else {
            return null;
        }
    }
}
