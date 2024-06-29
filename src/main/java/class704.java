import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class704 extends class72 {

    @OriginalMember(owner = "client!ip", name = "k", descriptor = "I")
    public static int field9862 = -1;

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "I")
    public static int field9859;

    @OriginalMember(owner = "client!ip", name = "i", descriptor = "I")
    public static int field9860;

    @OriginalMember(owner = "client!ip", name = "j", descriptor = "I")
    public static int field9861;

    @OriginalMember(owner = "client!ip", name = "l", descriptor = "I")
    public static int field9863;

    @OriginalMember(owner = "client!ip", name = "m", descriptor = "I")
    public static int field9864;

    @OriginalMember(owner = "client!ip", name = "n", descriptor = "I")
    public static int field9865;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)Lnd;")
    public static final class541 method3946(byte arg0) {
        ++field9860;
        if (class542.field7626 != null && class628.field9024 != null) {
            if (arg0 > -127) {
                method3946((byte) 88);
            }
            for (class541 var1 = (class541) class628.field9024.method2840(-6334); var1 != null; var1 = (class541) class628.field9024.method2840(-6334)) {
                class524 var2 = class542.field7614.method2641(var1.field7608, 97);
                if (var2 != null && var2.field7432 && var2.method3108(class542.field7613, 0)) {
                    return var1;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
    public final void method55(int arg0) {
        if (super.field1286.field6708.method3689(-10034) && ~super.field1282 == -3) {
            super.field1282 = 1;
        }
        ++field9864;
        if (arg0 < 30) {
            method3946((byte) -9);
        }
        if (~super.field1282 > -1 || super.field1282 > 2) {
            super.field1282 = this.method60(-3271);
        }
    }

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "(I)I")
    public final int method3947(int arg0) {
        if (arg0 != 27669) {
            method3946((byte) 7);
        }
        ++field9861;
        return super.field1282;
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)I")
    public final int method60(int arg0) {
        ++field9863;
        if (arg0 != -3271) {
            field9862 = 77;
        }
        return 2;
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(II)I")
    public final int method58(int arg0, int arg1) {
        if (arg1 != 11260) {
            field9862 = -121;
        }
        ++field9859;
        return 1;
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(ILcq;)V")
    public class704(int arg0, class464 arg1) {
        super(arg1);
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lcq;)V")
    public class704(class464 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)V")
    public final void method59(int arg0, int arg1) {
        ++field9865;
        if (arg1 != 3) {
            this.method58(-113, 64);
        }
        super.field1282 = arg0;
    }
}
