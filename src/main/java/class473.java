import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class473 extends class450 {

    @OriginalMember(owner = "client!so", name = "f", descriptor = "I")
    public static int field6487 = 0;

    @OriginalMember(owner = "client!so", name = "g", descriptor = "I")
    public static int field6488 = -1;

    @OriginalMember(owner = "client!so", name = "i", descriptor = "F")
    public static float field6490;

    @OriginalMember(owner = "client!so", name = "h", descriptor = "I")
    public static int field6489;

    @OriginalMember(owner = "client!so", name = "j", descriptor = "I")
    public static int field6491;

    @OriginalMember(owner = "client!so", name = "k", descriptor = "I")
    public static int field6492;

    @OriginalMember(owner = "client!so", name = "l", descriptor = "I")
    public static int field6493;

    @OriginalMember(owner = "client!so", name = "m", descriptor = "I")
    public static int field6494;

    @OriginalMember(owner = "client!so", name = "n", descriptor = "I")
    public static int field6495;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(Z)I", line = 3)
    public final int method2666(boolean arg0) {
        ++field6494;
        if (!arg0) {
            field6488 = 91;
        }
        return super.field6170;
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(I)V", line = 15)
    public static final void method2667(int arg0) {
        ++field6493;
        if (class443.field6101 != -1) {
            int var1 = class569.field7492.method780((byte) -121);
            int var2 = class569.field7492.method772(arg0 ^ 73);
            class466 var3 = (class466) class334.field4747.method21(2);
            if (var3 != null) {
                var1 = var3.method1098(-15204);
                var2 = var3.method1099((byte) 121);
            }
            int var4 = arg0;
            int var5 = 0;
            if (class24.field412) {
                var4 = class367.method2167(arg0 + -2);
                var5 = class672.method3717((byte) -42);
            }
            class114.method952(var1, var2, var4, var4, var5, var5, arg0 ^ -18, var1 + var4, var2 + var5, class228.field3251 + var4, class199.field2993 + var5, class443.field6101);
            if (class557.field7340 != null) {
                class456.method2594((byte) 19, var2 - -var5, var1 + var4);
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(ZI)V", line = 54)
    public final void method67(boolean arg0, int arg1) {
        super.field6170 = arg1;
        ++field6492;
        if (!arg0) {
            this.method73((byte) -63);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(II)I", line = 66)
    public final int method75(int arg0, int arg1) {
        if (arg0 != 0) {
            return -98;
        } else {
            ++field6495;
            return 1;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(B)V", line = 91)
    public final void method73(byte arg0) {
        if (arg0 != 98) {
            this.method68(false);
        }
        if (~super.field6170 > -1 || super.field6170 > 4) {
            super.field6170 = this.method68(false);
        }
        ++field6491;
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lup;)V", line = 104)
    public class473(class278 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(ILup;)V", line = 107)
    public class473(int arg0, class278 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Z)I", line = 110)
    public final int method68(boolean arg0) {
        ++field6489;
        return arg0 ? 83 : 0;
    }
}
