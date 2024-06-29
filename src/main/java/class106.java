import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class106 {

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public static int field1816 = 0;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public static int field1815 = 0;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field1809 = 0;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "Llc;")
    public static class270 field1813;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lhc;II)V")
    public static final void method819(class53 arg0, int arg1, int arg2) {
        if (arg1 > -77) {
            return;
        }
        field1808++;
        if (class259.field4007 == null) {
            return;
        }
        try {
            class259.field4007.method546(0L, (byte) 126);
            class259.field4007.method551(arg0.field758, 125, 24, arg2);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
    public static final void method820(byte arg0) {
        field1811++;
        class78.method583((byte) -11);
        class132.method1011((byte) -125);
        class111.method845((byte) 106);
        class170.method1208(1);
        class241.method1648(-51);
        class123.method952(-121);
        class297.method2022(true);
        client.method910((byte) 121);
        class84.method626((byte) 125);
        if (arg0 < 86) {
            field1809 = -14;
        }
        class207.method1463((byte) 125);
        class31.method191(30878);
        class56.method397(100);
        class187.method1339(-99);
        class93.method706(false);
        class41.method260(0);
        class73.method544((byte) 67);
        class119.method887((byte) -93);
        class217.method1513(8221);
        class220.method1533((byte) 99);
        class194.method1374(113);
        class26.method173(-21305);
        class38.field494.method1422((byte) 94);
        class71.field1131.method1422((byte) 122);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
    public static final byte[] method821(boolean arg0, Object arg1, int arg2) {
        field1814++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class245.method1687(11301, var3) : var3;
        } else if (arg1 instanceof class210) {
            class210 var4 = (class210) arg1;
            return var4.method1182(11635);
        } else {
            if (arg2 > -68) {
                method822(-103);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
    public static void method822(int arg0) {
        field1813 = null;
        if (arg0 != 0) {
            method822(98);
        }
    }
}
