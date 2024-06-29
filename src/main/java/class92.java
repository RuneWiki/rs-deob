import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class92 extends class12 {

    @OriginalMember(owner = "client!je", name = "O", descriptor = "I")
    public static int field1705 = 0;

    @OriginalMember(owner = "client!je", name = "R", descriptor = "Ltg;")
    public static class184 field1708 = class135.method812("Verbinde mit Server)3)3)3", 3);

    @OriginalMember(owner = "client!je", name = "S", descriptor = "Ltg;")
    public static class184 field1709 = class135.method812("oberen Rand der Webseite ausw-=hlen)3", 3);

    @OriginalMember(owner = "client!je", name = "N", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!je", name = "P", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!je", name = "Q", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ltg;Ltg;Lvb;B)Loe;")
    public static final class137 method533(class184 arg0, class184 arg1, class197 arg2, byte arg3) {
        int var4 = arg2.method1261(arg1, (byte) 109);
        int var5 = arg2.method1273(arg0, 125, var4);
        if (arg3 >= -78) {
            field1705 = 44;
        }
        ++field1704;
        return class73.method426(var5, arg2, 1, var4);
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
    public class92() {
        super(0, true);
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "(I)V")
    public static void method534(int arg0) {
        if (arg0 != 0) {
            method533((class184) null, (class184) null, (class197) null, (byte) -59);
        }
        field1708 = null;
        field1709 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZLvb;)V")
    public static final void method535(boolean arg0, class197 arg1) {
        ++field1706;
        if (arg0) {
            class145.field2621 = arg1;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)[I")
    public final int[] method62(int arg0, byte arg1) {
        if (arg1 != 17) {
            method534(-25);
        }
        ++field1707;
        int[] var3 = super.field224.method7((byte) -74, arg0);
        if (super.field224.field53) {
            class93.method536(var3, 0, class201.field3889, class37.field698[arg0]);
        }
        return var3;
    }
}
