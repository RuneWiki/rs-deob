import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public abstract class class744 extends class176 {

    @OriginalMember(owner = "client!wo", name = "I", descriptor = "S")
    public short field10345;

    @OriginalMember(owner = "client!wo", name = "D", descriptor = "S")
    public short field10340;

    @OriginalMember(owner = "client!wo", name = "G", descriptor = "Llga;")
    public static class712 field10343 = new class712(34, 4);

    @OriginalMember(owner = "client!wo", name = "A", descriptor = "I")
    public static int field10337;

    @OriginalMember(owner = "client!wo", name = "B", descriptor = "I")
    public static int field10338;

    @OriginalMember(owner = "client!wo", name = "C", descriptor = "I")
    public static int field10339;

    @OriginalMember(owner = "client!wo", name = "E", descriptor = "I")
    public static int field10341;

    @OriginalMember(owner = "client!wo", name = "F", descriptor = "I")
    public static int field10342;

    @OriginalMember(owner = "client!wo", name = "H", descriptor = "I")
    public static int field10344;

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "(B)V")
    public final void method150(byte arg0) {
        ++field10338;
        if (arg0 != -73) {
            field10343 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "(B)Z")
    public final boolean method157(byte arg0) {
        if (arg0 > -70) {
            field10343 = null;
        }
        ++field10344;
        return false;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lgg;BZILha;II)V")
    public final void method162(class176 arg0, byte arg1, boolean arg2, int arg3, class60 arg4, int arg5, int arg6) {
        ++field10339;
        int var8 = -36 / ((arg1 - 15) / 55);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "(I)V")
    public static void method4158(int arg0) {
        if (arg0 != 4) {
            field10343 = null;
        }
        field10343 = null;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lha;B)Z")
    public final boolean method882(class60 arg0, byte arg1) {
        if (arg1 != 77) {
            return false;
        } else {
            ++field10337;
            return class399.method2311(super.field2167, super.field2165 >> class443.field6172, super.field2170 >> class443.field6172, this.method132(arg1 + -77), (byte) -123);
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I[Lcba;)I")
    public final int method881(int arg0, class551[] arg1) {
        ++field10341;
        int var3 = -17 / ((arg0 - 29) / 62);
        return this.method1009(super.field2170 >> class443.field6172, false, arg1, super.field2165 >> class443.field6172);
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(IIIIIII)V")
    public class744(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super.field2170 = arg0;
        super.field2167 = (byte) arg4;
        this.field10345 = (short) arg5;
        this.field10340 = (short) arg6;
        super.field2175 = (byte) arg3;
        super.field2165 = arg2;
        super.field2178 = arg1;
    }

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "(Z)Z")
    public final boolean method885(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            ++field10342;
            return class423.field5940[(super.field2170 >> class443.field6172) + -class610.field8512 + class118.field1562][(super.field2165 >> class443.field6172) + class118.field1562 - class39.field407];
        }
    }
}
