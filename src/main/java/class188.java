import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class188 extends class202 {

    @OriginalMember(owner = "client!os", name = "L", descriptor = "I")
    private int field2737;

    @OriginalMember(owner = "client!os", name = "K", descriptor = "[I")
    public static int[] field2736 = new int[5];

    @OriginalMember(owner = "client!os", name = "I", descriptor = "F")
    public static float field2734;

    @OriginalMember(owner = "client!os", name = "J", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!os", name = "M", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!os", name = "N", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!os", name = "O", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!os", name = "P", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!os", name = "Q", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIILor;Lor;)V")
    public static final void method1175(int arg0, int arg1, int arg2, class304 arg3, class304 arg4) {
        class409 var5 = class207.method1413(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field6189 = arg3;
            var5.field6192 = arg4;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lhw;BI)V")
    public final void method40(class208 arg0, byte arg1, int arg2) {
        int var4 = -58 / ((-46 - arg1) / 50);
        if (arg2 == 0) {
            this.field2737 = (arg0.method1445(39) << 12) / 255;
        }
        ++field2740;
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "()V")
    public class188() {
        this(4096);
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(B)V")
    public static void method1176(byte arg0) {
        if (arg0 == 58) {
            field2736 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(BI)I")
    public static final int method1177(byte arg0, int arg1) {
        if (arg0 <= 22) {
            method1178((class437) null, (class437) null, 121);
        }
        ++field2739;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(I)V")
    public class188(int arg0) {
        super(0, true);
        this.field2737 = 4096;
        this.field2737 = arg0;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lgi;Lgi;I)V")
    public static final void method1178(class437 arg0, class437 arg1, int arg2) {
        class81.method578((byte) 66, class171.field2498);
        ++class538.field7873;
        ++field2735;
        class170.field2488.method1477(65280, arg0.field6751);
        class170.field2488.method1419(-10147, arg1.field6595);
        class170.field2488.method1443(arg1.field6751, (byte) 94);
        class170.field2488.method1419(-10147, arg0.field6716);
        class170.field2488.method1424(false, arg1.field6716);
        class170.field2488.method1437(arg0.field6595, 0);
        int var3 = 104 % ((arg2 - -87) / 35);
    }

    @OriginalMember(owner = "client!os", name = "d", descriptor = "(B)V")
    public static final void method1179(byte arg0) {
        ++field2741;
        class32 var1 = (class32) class513.field7612.method2123(62);
        boolean var2 = class477.field7309 != null || class160.field2192 > 0;
        if (var2) {
            class103.field1514 = 1;
        }
        if (class298.field4686 && class36.field376.method927(81, -1234) && class501.field7514 > 2) {
            if (!var2) {
                class155.method944(0, (class140) class392.field5958.field4939.field7776.field7776, var1.method139(true), var1.method142(46));
            } else {
                class419.field6352 = (class140) class392.field5958.field4939.field7776.field7776;
            }
        } else if (var2) {
            class419.field6352 = (class140) class392.field5958.field4939.field7776;
        } else {
            class155.method944(0, (class140) class392.field5958.field4939.field7776, var1.method139(true), var1.method142(80));
        }
        int var3 = -17 / ((arg0 - -39) / 39);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IZ)[I")
    public final int[] method41(int arg0, boolean arg1) {
        ++field2738;
        int[] var3 = super.field3064.method2452((byte) 47, arg0);
        if (super.field3064.field5837) {
            class324.method2167(var3, 0, class276.field4375, this.field2737);
        }
        if (!arg1) {
            field2734 = 1.9411318F;
        }
        return var3;
    }
}
