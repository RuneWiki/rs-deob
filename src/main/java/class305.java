import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class305 extends class298 {

    @OriginalMember(owner = "client!uf", name = "L", descriptor = "I")
    private int field4503;

    @OriginalMember(owner = "client!uf", name = "K", descriptor = "I")
    public static int field4502 = 1403;

    @OriginalMember(owner = "client!uf", name = "M", descriptor = "Lre;")
    public static class388 field4504 = new class388();

    @OriginalMember(owner = "client!uf", name = "T", descriptor = "[Lfo;")
    public static class245[] field4511 = new class245[50];

    @OriginalMember(owner = "client!uf", name = "N", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!uf", name = "O", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!uf", name = "P", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!uf", name = "Q", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!uf", name = "R", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!uf", name = "S", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V")
    public static void method1905(int arg0) {
        field4511 = null;
        if (arg0 != 6267) {
            field4511 = null;
        }
        field4504 = null;
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(B)V")
    public static final void method1906(byte arg0) {
        class349.field5019 = 0;
        ++field4508;
        int var1 = (class19.field258.field1008 >> 7) - -class93.field1163;
        int var2 = (class19.field258.field1005 >> 7) + class349.field5023;
        if (~var1 <= -3054 && var1 <= 3156 && ~var2 <= -3057 && ~var2 >= -3137) {
            class349.field5019 = 1;
        }
        if (var1 >= 3072 && ~var1 >= -3119 && ~var2 <= -9493 && var2 <= 9535) {
            class349.field5019 = 1;
        }
        if (arg0 <= -86) {
            if (~class349.field5019 == -2 && var1 >= 3139 && ~var1 >= -3200 && ~var2 <= -3009 && ~var2 >= -3063) {
                class349.field5019 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lpi;ILpi;ZIIZ)I")
    public static final int method1907(class239 arg0, int arg1, class239 arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        ++field4507;
        int var7 = class284.method1781(arg6, arg0, arg2, 97, arg4);
        if (var7 != 0) {
            return arg6 ? -var7 : var7;
        } else if (arg5 == -1) {
            return 0;
        } else {
            int var8 = class284.method1781(arg3, arg0, arg2, 118, arg5);
            if (arg1 >= -93) {
                method1907((class239) null, -9, (class239) null, false, 73, 105, true);
            }
            return !arg3 ? var8 : -var8;
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(I)V")
    public class305(int arg0) {
        super(0, true);
        this.field4503 = 4096;
        this.field4503 = arg0;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIZ)I")
    public static final int method1908(int arg0, int arg1, boolean arg2) {
        ++field4505;
        if (arg2) {
            return 0;
        } else {
            class458 var3 = class230.method1272((byte) -127, arg2, arg0);
            if (var3 == null) {
                return class420.field6055.method2346(124, arg0).field5200;
            } else {
                int var4 = 0;
                for (int var5 = 0; ~var3.field6447.length < ~var5; ++var5) {
                    if (~var3.field6447[var5] == 0) {
                        ++var4;
                    }
                }
                if (arg1 != 23924) {
                    field4504 = null;
                }
                return var4 + class420.field6055.method2346(86, arg0).field5200 + -var3.field6447.length;
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZ)[I")
    public final int[] method13(int arg0, boolean arg1) {
        ++field4506;
        int[] var3 = super.field4443.method2877(arg0, 1);
        if (super.field4443.field6915) {
            class268.method1621(var3, 0, class158.field1877, this.field4503);
        }
        if (!arg1) {
            this.method13(59, true);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
    public class305() {
        this(4096);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILvt;)V")
    public final void method10(int arg0, int arg1, class179 arg2) {
        ++field4510;
        if (~arg1 == -1) {
            this.field4503 = (arg2.method895((byte) -97) << 12) / 255;
        }
        if (arg0 > -44) {
            method1906((byte) 26);
        }
    }
}
