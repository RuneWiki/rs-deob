import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public class class403 extends class198 {

    @OriginalMember(owner = "client!sia", name = "w", descriptor = "I")
    private int field5559 = -1;

    @OriginalMember(owner = "client!sia", name = "v", descriptor = "Lsv;")
    public static class570 field5558 = new class570(25, 4);

    @OriginalMember(owner = "client!sia", name = "r", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!sia", name = "s", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!sia", name = "t", descriptor = "I")
    public static int field5556;

    @OriginalMember(owner = "client!sia", name = "u", descriptor = "I")
    public static int field5557;

    @OriginalMember(owner = "client!sia", name = "x", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(Lha;B)V", line = 3)
    public static final void method2393(class475 arg0, byte arg1) {
        if (arg1 <= 112) {
            field5560 = -46;
        }
        field5554++;
        if (class286.field4207 != class719.field10041.field10361 && class514.field7096 != null && class303.method1886(1, class719.field10041.field10361, arg0)) {
            class286.field4207 = class719.field10041.field10361;
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(ILlm;)V", line = 33)
    public final void method858(int arg0, class50 arg1) {
        if (arg0 != 3) {
            this.method855(false, null);
        }
        arg1.method391((byte) -114, this.field5559);
        field5556++;
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(I[BI)[B", line = 44)
    public static final byte[] method2394(int arg0, byte[] arg1, int arg2) {
        field5557++;
        byte[] var3 = new byte[arg2];
        class171.method1263(arg1, arg0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "(I)V", line = 55)
    public static void method2395(int arg0) {
        int var1 = -2 / ((-arg0 - 11) / 32);
        field5558 = null;
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(ZLol;)V", line = 64)
    public final void method855(boolean arg0, class431 arg1) {
        this.field5559 = arg1.method2565((byte) -95);
        field5555++;
        if (!arg0) {
            this.method858(-62, null);
        }
    }
}
