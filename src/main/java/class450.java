import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class450 extends class97 {

    @OriginalMember(owner = "client!sp", name = "s", descriptor = "I")
    public int field6622;

    @OriginalMember(owner = "client!sp", name = "u", descriptor = "I")
    public int field6624;

    @OriginalMember(owner = "client!sp", name = "p", descriptor = "I")
    public int field6619;

    @OriginalMember(owner = "client!sp", name = "y", descriptor = "Z")
    public boolean field6628;

    @OriginalMember(owner = "client!sp", name = "z", descriptor = "I")
    public int field6629;

    @OriginalMember(owner = "client!sp", name = "A", descriptor = "I")
    public int field6630;

    @OriginalMember(owner = "client!sp", name = "r", descriptor = "I")
    public static int field6621 = 1405;

    @OriginalMember(owner = "client!sp", name = "o", descriptor = "S")
    public static short field6618 = 256;

    @OriginalMember(owner = "client!sp", name = "v", descriptor = "[I")
    public static int[] field6625 = new int[6];

    @OriginalMember(owner = "client!sp", name = "n", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!sp", name = "q", descriptor = "I")
    public static int field6620;

    @OriginalMember(owner = "client!sp", name = "w", descriptor = "I")
    public static int field6626;

    @OriginalMember(owner = "client!sp", name = "x", descriptor = "I")
    public static int field6627;

    @OriginalMember(owner = "client!sp", name = "t", descriptor = "Lal;")
    public static class198 field6623;

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "(I)V")
    public static void method2770(int arg0) {
        field6625 = null;
        field6623 = null;
        if (arg0 != 9217) {
            field6623 = null;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2771(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field6626++;
        if (class345.method2100(-1, arg1)) {
            client.method2792(class130.field1650[arg1], arg4, arg8, arg7, arg3, arg5, arg0, arg9, arg2, arg6);
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(BI)Lno;")
    public static final class353 method2772(byte arg0, int arg1) {
        field6617++;
        if (arg0 >= -98) {
            field6623 = null;
        }
        class241 var2 = class80.field1055;
        class353 var3;
        synchronized (class80.field1055) {
            var3 = (class353) class80.field1055.method1491((long) arg1, 0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class11.field130.method823(class334.method2046(arg1, 0), -20334, class62.method337((byte) 71, arg1));
        class353 var5 = new class353();
        if (var4 != null) {
            var5.method2115(new class385(var4), -17945);
        }
        class241 var6 = class80.field1055;
        synchronized (class80.field1055) {
            class80.field1055.method1488(128, (long) arg1, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(BI)V")
    public static final void method2773(byte arg0, int arg1) {
        field6627++;
        class241 var2 = class427.field6296;
        synchronized (class427.field6296) {
            if (arg0 >= -51) {
                method2771(25, -75, 10, 52, 44, 3, -93, 99, -72, -106);
            }
            class427.field6296.method1481(3, arg1);
        }
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(IIIIIZ)V")
    public class450(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field6622 = arg1;
        this.field6624 = arg3;
        this.field6619 = arg4;
        this.field6628 = arg5;
        this.field6629 = arg0;
        this.field6630 = arg2;
    }
}
