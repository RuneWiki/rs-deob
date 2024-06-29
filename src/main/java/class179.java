import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bka")
public class class179 {

    @OriginalMember(owner = "client!bka", name = "d", descriptor = "Lbt;")
    private class48 field2199;

    @OriginalMember(owner = "client!bka", name = "e", descriptor = "I")
    public int field2200;

    @OriginalMember(owner = "client!bka", name = "b", descriptor = "[I")
    public static int[] field2197 = new int[14];

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "Llf;")
    public static class251 field2196 = new class251(9, 2);

    @OriginalMember(owner = "client!bka", name = "c", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!bka", name = "f", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method1208(String arg0, int arg1, int arg2) {
        field2198++;
        class714 var3 = class350.method2072((long) arg2, arg1, (byte) 110);
        var3.method4043(arg1 + 6378);
        var3.field10019 = arg0;
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(I)V")
    public static void method1209(int arg0) {
        if (arg0 != 15) {
            field2196 = null;
        }
        field2196 = null;
        field2197 = null;
    }

    @OriginalMember(owner = "client!bka", name = "b", descriptor = "(I)I")
    public static final int method1210(int arg0) {
        if (arg0 < 119) {
            return -60;
        } else {
            field2201++;
            return class57.method498(0, false);
        }
    }

    @OriginalMember(owner = "client!bka", name = "<init>", descriptor = "(Lmja;ILbt;)V")
    public class179(class441 arg0, int arg1, class48 arg2) {
        new class288(64);
        this.field2199 = arg2;
        this.field2200 = this.field2199.method431(4, 15);
    }
}
