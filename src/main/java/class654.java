import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class654 extends class72 {

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "I")
    public static int field9204;

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "I")
    public static int field9205;

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "I")
    public static int field9206;

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "I")
    public static int field9207;

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "I")
    public static int field9208;

    @OriginalMember(owner = "client!qp", name = "m", descriptor = "I")
    public static int field9209;

    @OriginalMember(owner = "client!qp", name = "n", descriptor = "I")
    public static int field9210;

    @OriginalMember(owner = "client!qp", name = "o", descriptor = "I")
    public static int field9211;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
    public final void method55(int arg0) {
        if (this.method3689(-10034)) {
            if (super.field1286.field6684.method1844(13) && !class575.method3337(super.field1286.field6684.method1843(27669), (byte) -84)) {
                super.field1282 = 1;
            }
            if (~super.field1286.field6692.method2157(27669) == -2) {
                super.field1282 = 1;
            }
        }
        if (arg0 >= 30) {
            ++field9205;
            if (~super.field1282 == -4) {
                super.field1282 = 2;
            }
            if (~super.field1282 > -1 || super.field1282 > 3) {
                super.field1282 = this.method60(-3271);
            }
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)V")
    public final void method59(int arg0, int arg1) {
        ++field9208;
        super.field1282 = arg0;
        if (arg1 == 3) {
            ;
        }
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)I")
    public final int method60(int arg0) {
        if (arg0 != -3271) {
            this.method3689(-28);
        }
        ++field9204;
        return 0;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(III)Lwr;")
    public static final class455 method3688(int arg0, int arg1, int arg2) {
        class416 var3 = class390.field5454[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5838;
    }

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "(I)Z")
    public final boolean method3689(int arg0) {
        ++field9206;
        return arg0 != -10034 ? false : class736.method4111(super.field1282, (byte) 89);
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(ILcq;)V")
    public class654(int arg0, class464 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lcq;)V")
    public class654(class464 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "(I)Z")
    public final boolean method3690(int arg0) {
        ++field9211;
        if (arg0 <= 97) {
            this.method60(84);
        }
        return true;
    }

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "(II)I")
    public static final int method3691(int arg0, int arg1) {
        int var2 = ((-1431655766 & arg1) >>> 1) + (arg1 & 1431655765);
        ++field9207;
        int var3 = (arg0 & var2) - -(var2 >>> 2 & -214748365);
        int var4 = var3 - -(var3 >>> 4) & 252645135;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return 255 & var6;
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(II)I")
    public final int method58(int arg0, int arg1) {
        ++field9209;
        if (class736.method4111(arg0, (byte) 89)) {
            if (super.field1286.field6684.method1844(13) && !class575.method3337(super.field1286.field6684.method1843(27669), (byte) -80)) {
                return 3;
            }
            if (~super.field1286.field6692.method2157(arg1 + 16409) == -2) {
                return 3;
            }
        }
        if (arg0 == 3) {
            return 3;
        } else if (class736.method4111(arg0, (byte) 89)) {
            return 2;
        } else {
            return arg1 != 11260 ? -77 : 1;
        }
    }

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "(I)I")
    public final int method3692(int arg0) {
        ++field9210;
        return arg0 != 27669 ? -73 : super.field1282;
    }
}
