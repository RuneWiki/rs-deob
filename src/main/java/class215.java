import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class215 extends class278 {

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
    private int field3050 = 0;

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
    private int field3052 = 4096;

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "Llg;")
    public static class284 field3053 = new class284(0, 15);

    @OriginalMember(owner = "client!wb", name = "Q", descriptor = "Luf;")
    public static class310 field3057 = new class310(105, 3);

    @OriginalMember(owner = "client!wb", name = "R", descriptor = "Llg;")
    public static class284 field3058 = new class284(1, 18);

    @OriginalMember(owner = "client!wb", name = "T", descriptor = "I")
    public static int field3060 = 0;

    @OriginalMember(owner = "client!wb", name = "U", descriptor = "[Lqp;")
    public static class467[] field3061 = new class467[14];

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!wb", name = "S", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V", line = 5)
    public class215() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)[I", line = 8)
    public final int[] method208(int arg0, int arg1) {
        ++field3051;
        int[] var3 = super.field3750.method256(arg1, -30359);
        if (arg0 != -9) {
            this.field3052 = 121;
        }
        if (super.field3750.field554) {
            int[] var4 = this.method1570(arg0 ^ -9, 0, arg1);
            for (int var5 = 0; class507.field7456 > var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~var6 <= ~this.field3050 && ~var6 >= ~this.field3052 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lss;I)Ljava/lang/String;", line = 49)
    public static final String method1283(class295 arg0, int arg1) {
        ++field3056;
        if (client.method1191(arg0).method1222(24805) == 0) {
            return null;
        } else if (arg0.field4064 != null && ~arg0.field4064.trim().length() != -1) {
            if (arg1 != -26825) {
                method1284(-71);
            }
            return arg0.field4064;
        } else {
            return class476.field6973 ? "Hidden-use" : null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Llh;II)V", line = 73)
    public final void method210(class365 arg0, int arg1, int arg2) {
        if (arg1 == -30446) {
            if (arg2 != 0) {
                if (arg2 == 1) {
                    this.field3052 = arg0.method2062((byte) 14);
                }
            } else {
                this.field3050 = arg0.method2062((byte) 14);
            }
            ++field3054;
        }
    }

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)V", line = 113)
    public static final void method1284(int arg0) {
        if (arg0 == -3171) {
            ++field3055;
            class454.field6634.method67(-116);
        }
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(B)V", line = 127)
    public static void method1285(byte arg0) {
        field3057 = null;
        field3061 = null;
        field3053 = null;
        field3058 = null;
        int var1 = -7 / ((-85 - arg0) / 33);
    }
}
