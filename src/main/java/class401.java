import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class401 implements class100 {

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Lwu;")
    private class557 field5555;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "Lqba;")
    public class104 field5559;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field5551 = -1;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field5560 = 0;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field5552;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field5556;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field5557;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Lcw;")
    public class21 field5550;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZZ)V", line = 6)
    public void method681(boolean arg0, boolean arg1) {
        field5554++;
        if (arg1) {
            int var3 = this.field5559.field1498.method554(class95.field1381, (byte) 124, this.field5550.method116()) + this.field5559.field1506;
            int var4 = this.field5559.field1503.method2838(this.field5550.method108(), class631.field8989, true) + this.field5559.field1502;
            this.field5550.method101(var3, var4);
        }
        if (!arg0) {
            this.method682((byte) 127);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)Z", line = 26)
    public final boolean method680(int arg0) {
        field5556++;
        return arg0 == 29892 ? this.field5555.method3340(0, this.field5559.field1504) : true;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V", line = 41)
    public final void method682(byte arg0) {
        this.field5550 = class7.method32(false, this.field5559.field1504, this.field5555);
        if (arg0 >= 29) {
            field5557++;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V", line = 57)
    public static final void method2439(byte arg0) {
        field5558++;
        if (arg0 < -30) {
            class501.field7010.method3210(false);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)Lmha;", line = 70)
    public static final class701 method2440(int arg0, int arg1) {
        field5553++;
        class701[] var2 = class384.method2345(arg1 ^ 0xFFFFB9F5);
        if (arg1 != 11519) {
            return null;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field9765 == arg0) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lwu;Lqba;)V", line = 103)
    public class401(class557 arg0, class104 arg1) {
        this.field5555 = arg0;
        this.field5559 = arg1;
    }
}
