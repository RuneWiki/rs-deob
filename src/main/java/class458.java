import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class458 extends class648 {

    @OriginalMember(owner = "client!pi", name = "I", descriptor = "I")
    public static int field6493 = 0;

    @OriginalMember(owner = "client!pi", name = "D", descriptor = "B")
    public byte field6488;

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "I")
    public static int field6487;

    @OriginalMember(owner = "client!pi", name = "E", descriptor = "I")
    public static int field6489;

    @OriginalMember(owner = "client!pi", name = "F", descriptor = "I")
    public static int field6490;

    @OriginalMember(owner = "client!pi", name = "H", descriptor = "I")
    public int field6492;

    @OriginalMember(owner = "client!pi", name = "G", descriptor = "Ljr;")
    public class96 field6491;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(Z)[B")
    public final byte[] method2239(boolean arg0) {
        ++field6490;
        if (!arg0) {
            this.method2241(-20);
        }
        if (!super.field9187 && ~this.field6491.field1301 <= ~(this.field6491.field1316.length + -this.field6488)) {
            return this.field6491.field1316;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIBI)V")
    public static final void method2645(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 > 7) {
            ++field6487;
            if (~class482.field6703 >= ~arg4 && arg4 <= class144.field2148) {
                int var5 = class355.method2104(class631.field8829, arg0, -120, class92.field1219);
                int var6 = class355.method2104(class631.field8829, arg2, -122, class92.field1219);
                class225.method1440(arg1, var6, var5, 117, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)I")
    public final int method2241(int arg0) {
        ++field6489;
        if (this.field6491 == null) {
            return 0;
        } else {
            if (arg0 != 100) {
                this.field6488 = -37;
            }
            return this.field6491.field1301 * 100 / (this.field6491.field1316.length + -this.field6488);
        }
    }
}
