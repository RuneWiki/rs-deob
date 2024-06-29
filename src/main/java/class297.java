import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class297 {

    @OriginalMember(owner = "client!im", name = "h", descriptor = "J")
    public long field4678;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "Lna;")
    private class211 field4673;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "Lss;")
    public static class213 field4677 = new class213("Drop", "Fallen lassen", "Poser", "Largar");

    @OriginalMember(owner = "client!im", name = "a", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIIZZ)V")
    public static final void method1992(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class56.field908 = arg0;
        class42.field454 = 0x1 << class56.field908;
        class376.field5781 = class42.field454 >> 1;
        class518.field7684 = (int) Math.sqrt((double) (class376.field5781 * class376.field5781 + class376.field5781 * class376.field5781));
        class364.field5627 = class42.field454 >> 2;
        class385.field5892 = class42.field454;
        class252.field4075 = arg2;
        class131.field1773 = arg3;
        class78.field1156 = arg4;
        class513.field7614 = new class409[arg1][class252.field4075][class131.field1773];
        class244.field3956 = new class223[arg1];
        if (arg5) {
            class476.field7285 = new int[class252.field4075][class131.field1773];
            class413.field6247 = new byte[class252.field4075][class131.field1773];
            class350.field5453 = new short[class252.field4075][class131.field1773];
            class165.field2386 = new class409[1][class252.field4075][class131.field1773];
            class103.field1520 = new class223[1];
        } else {
            class476.field7285 = null;
            class413.field6247 = null;
            class350.field5453 = null;
            class165.field2386 = null;
            class103.field1520 = null;
        }
        if (arg6) {
            class311.field4882 = new long[arg1][arg2][arg3];
            class60.field950 = new class169[65535];
            class310.field4846 = new boolean[65535];
            class368.field5683 = 0;
        } else {
            class311.field4882 = null;
            class60.field950 = null;
            class310.field4846 = null;
            class368.field5683 = 0;
        }
        class202.method1377(false);
        class222.field3745 = new class135[1000];
        class360.field5584 = 0;
        class376.field5778 = new class135[1000];
        class520.field7705 = 0;
        class122.field1662 = new int[arg1][class252.field4075 + 1][class131.field1773 + 1];
        class137.field1880 = new class423[5000];
        class518.field7686 = 0;
        class357.field5543 = new boolean[class78.field1156 + class78.field1156 + 1][class78.field1156 + class78.field1156 + 1];
        class221.field3735 = new boolean[class78.field1156 + class78.field1156 + 2][class78.field1156 + class78.field1156 + 2];
        class409.field6200 = null;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method1993(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field4672++;
        for (class312 var7 = (class312) class479.field7319.method2616(255); var7 != null; var7 = (class312) class479.field7319.method2619(255)) {
            if (var7.field4900 <= class88.field1278) {
                var7.method1613(1049391719);
            } else {
                class314.method2100(arg4, arg2 >> 1, var7.field4898, (var7.field4899 << 7) + 64, arg5, var7.field4901 * 2, 39, arg3 >> 1, (var7.field4907 << 7) + 64);
                class289.field4571.method2006(var7.field4902, arg0 + class229.field3812[0], class229.field3812[1] + arg1, var7.field4906 | 0xFF000000, true, 0);
            }
        }
        if (arg6) {
            field4679 = -100;
        }
    }

    @OriginalMember(owner = "client!im", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field4676++;
        this.field4673.method1556(this.field4678, (byte) -64);
        super.finalize();
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BI)I")
    public static final int method1994(byte arg0, int arg1) {
        int var2 = 98 % ((81 - arg0) / 44);
        field4671++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
    public static final void method1995(int arg0) {
        field4674++;
        int var1 = 125 % ((arg0 + 52) / 62);
        class421.field6391 = class517.method3107(4, 61, 8, 0.4F, true, 8, 2048, 35);
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(I)V")
    public static void method1996(int arg0) {
        if (arg0 >= 94) {
            field4677 = null;
        }
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lna;JI)V")
    public class297(class211 arg0, long arg1, int arg2) {
        this.field4678 = arg1;
        this.field4673 = arg0;
    }
}
