import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class692 extends class430 {

    @OriginalMember(owner = "client!v", name = "q", descriptor = "I")
    public int field9811;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public int field9808;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public int field9804;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    public int field9810;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "Z")
    public boolean field9812;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "I")
    public int field9806;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field9802 = 0;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field9801;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field9803;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public static int field9805;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    public static int field9807;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "I")
    public static int field9809;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZ)I")
    public static final int method3906(int arg0, boolean arg1) {
        if (arg1) {
            field9802 = -94;
        }
        field9801++;
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)I")
    public static final int method3907(int arg0) {
        if (arg0 >= -2) {
            return 86;
        } else {
            field9803++;
            return class505.field7339;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILrq;BI)V")
    public static final void method3908(int arg0, int arg1, class482 arg2, byte arg3, int arg4) {
        field9805++;
        if (arg3 > -97) {
            return;
        }
        for (class654 var5 = (class654) class451.field6446.method3565(-95); var5 != null; var5 = (class654) class451.field6446.method3561((byte) 112)) {
            if (var5.field9371 == arg0 && (arg1 << 9) == var5.field9379 && (arg4 << 9) == var5.field9359 && var5.field9356.field6965 == arg2.field6965) {
                if (var5.field9375 != null) {
                    class593.field8429.method3652(var5.field9375);
                    var5.field9375 = null;
                }
                if (var5.field9385 != null) {
                    class593.field8429.method3652(var5.field9385);
                    var5.field9385 = null;
                }
                var5.method2656((byte) 119);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BI)V")
    public static final void method3909(byte arg0, int arg1) {
        class666.field9522 = arg1;
        field9809++;
        class348 var2 = class201.field2992;
        synchronized (class201.field2992) {
            class201.field2992.method2220(false);
            if (arg0 != 32) {
                field9807 = -17;
            }
        }
        class348 var3 = class675.field9603;
        synchronized (class675.field9603) {
            class675.field9603.method2220(false);
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(IIIIIZ)V")
    public class692(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field9811 = arg3;
        this.field9808 = arg4;
        this.field9804 = arg2;
        this.field9810 = arg0;
        this.field9812 = arg5;
        this.field9806 = arg1;
    }
}
