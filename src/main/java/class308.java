import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class308 extends class194 {

    @OriginalMember(owner = "client!vo", name = "M", descriptor = "I")
    private int field4184;

    @OriginalMember(owner = "client!vo", name = "J", descriptor = "I")
    public static int field4181 = 0;

    @OriginalMember(owner = "client!vo", name = "I", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!vo", name = "K", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!vo", name = "N", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!vo", name = "O", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!vo", name = "L", descriptor = "Lak;")
    public static class31 field4183;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Laq;ZI)Ljava/lang/String;", line = 5)
    public static final String method1959(class453 arg0, boolean arg1, int arg2) {
        ++field4186;
        if (!client.method2696(arg0).method2256(-61, arg2) && arg0.field6396 == null) {
            return null;
        } else if (arg0.field6441 != null && ~arg2 > ~arg0.field6441.length && arg0.field6441[arg2] != null && ~arg0.field6441[arg2].trim().length() != -1) {
            return arg1 ? null : arg0.field6441[arg2];
        } else {
            return class186.field2151 ? "Hidden-" + arg2 : null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "(I)V", line = 32)
    public static void method1960(int arg0) {
        field4183 = null;
        if (arg0 <= 91) {
            method1959((class453) null, false, -98);
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)[I", line = 42)
    public final int[] method55(int arg0, int arg1) {
        int var3 = -118 % ((arg1 - 57) / 46);
        ++field4180;
        int[] var4 = super.field2292.method1781(arg0, false);
        if (super.field2292.field3708) {
            class114.method665(var4, 0, class138.field1579, this.field4184);
        }
        return var4;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IILbg;)V", line = 67)
    public final void method54(int arg0, int arg1, class242 arg2) {
        if (arg0 == 0) {
            this.field4184 = (arg2.method1563(-128) << 12) / 255;
        }
        int var5 = 87 / ((arg1 - 52) / 61);
        ++field4185;
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(I)V", line = 94)
    public class308(int arg0) {
        super(0, true);
        this.field4184 = 4096;
        this.field4184 = arg0;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BLuo;Lwo;)V", line = 102)
    public static final void method1961(byte arg0, class118 arg1, class285 arg2) {
        ++field4182;
        if (!class214.field2645) {
            if (arg0 <= -28) {
                arg1.method728(0);
                class347.field4724 = arg1.method697(class132.method855(arg2, class38.field446), true);
                class347.field4724.method2659((class39.field457 - class347.field4724.method235()) / 2, (class28.field315 - class347.field4724.method236()) / 2);
                class104.field1221 = arg1.method697(class132.method855(arg2, class397.field5392), true);
                class104.field1221.method2659((class39.field457 + -class104.field1221.method235()) / 2, 18);
                class214.field2645 = true;
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "()V", line = 132)
    public class308() {
        this(4096);
    }
}
