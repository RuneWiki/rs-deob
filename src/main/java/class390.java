import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class390 implements class702 {

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "I")
    public int field5545;

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "I")
    public int field5546;

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "Lfda;")
    public class336 field5542;

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
    public int field5544;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "Laba;")
    public class185 field5540;

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "Ldba;")
    public static class101 field5547 = new class101(7, 5);

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "I")
    public static int field5543;

    @OriginalMember(owner = "client!wu", name = "i", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IB)I", line = 4)
    public static final int method2386(int arg0, byte arg1) {
        int var2 = 77 / ((42 - arg1) / 54);
        field5548++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)V", line = 21)
    public static void method2387(byte arg0) {
        field5547 = null;
        if (arg0 < 101) {
            field5547 = null;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)Ljava/lang/String;", line = 35)
    public static final String method2388(int arg0, int arg1) {
        field5541++;
        int var2 = -56 / ((12 - arg0) / 43);
        return (arg1 >> 24 & 0xFF) + "." + ((arg1 & 0xFF8DE8) >> 16) + "." + ((arg1 & 0xFF7E) >> 8) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(ILfda;Laba;II)V", line = 44)
    public class390(int arg0, class336 arg1, class185 arg2, int arg3, int arg4) {
        this.field5545 = arg0;
        this.field5546 = arg3;
        this.field5542 = arg1;
        this.field5544 = arg4;
        this.field5540 = arg2;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)Lve;", line = 56)
    public class527 method606(int arg0) {
        if (arg0 != 0) {
            this.field5540 = null;
        }
        field5543++;
        return class297.field4470;
    }
}
