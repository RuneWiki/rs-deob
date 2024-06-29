import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class731 extends class667 {

    @OriginalMember(owner = "client!fm", name = "H", descriptor = "I")
    private int field10237 = 4096;

    @OriginalMember(owner = "client!fm", name = "I", descriptor = "I")
    private int field10238 = 4096;

    @OriginalMember(owner = "client!fm", name = "F", descriptor = "I")
    private int field10235 = 4096;

    @OriginalMember(owner = "client!fm", name = "B", descriptor = "I")
    public static int field10231 = 0;

    @OriginalMember(owner = "client!fm", name = "C", descriptor = "I")
    public static int field10232;

    @OriginalMember(owner = "client!fm", name = "D", descriptor = "I")
    public static int field10233;

    @OriginalMember(owner = "client!fm", name = "E", descriptor = "I")
    public static int field10234;

    @OriginalMember(owner = "client!fm", name = "G", descriptor = "I")
    public static int field10236;

    @OriginalMember(owner = "client!fm", name = "J", descriptor = "I")
    public static int field10239;

    @OriginalMember(owner = "client!fm", name = "K", descriptor = "I")
    public static int field10240;

    @OriginalMember(owner = "client!fm", name = "L", descriptor = "I")
    public static int field10241;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)V")
    public static final void method4071(int arg0) {
        if (~class367.field5127.toLowerCase().indexOf("microsoft") != 0) {
            class99.field1679[220] = 74;
            class99.field1679[192] = 58;
            class99.field1679[223] = 28;
            class99.field1679[187] = 27;
            class99.field1679[190] = 72;
            class99.field1679[219] = 42;
            class99.field1679[221] = 43;
            class99.field1679[186] = 57;
            class99.field1679[222] = 59;
            class99.field1679[189] = 26;
            class99.field1679[188] = 71;
            class99.field1679[191] = 73;
        } else {
            class99.field1679[92] = 74;
            class99.field1679[61] = 27;
            if (class367.field5117 == null) {
                class99.field1679[222] = 59;
                class99.field1679[192] = 58;
            } else {
                class99.field1679[520] = 59;
                class99.field1679[192] = 28;
                class99.field1679[222] = 58;
            }
            class99.field1679[59] = 57;
            class99.field1679[46] = 72;
            class99.field1679[44] = 71;
            class99.field1679[45] = 26;
            class99.field1679[91] = 42;
            class99.field1679[93] = 43;
            class99.field1679[47] = 73;
        }
        ++field10233;
        if (arg0 <= 60) {
            method4072(-120, (String) null, (byte) -109);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method777(boolean arg0, int arg1) {
        if (arg0) {
            return null;
        } else {
            ++field10241;
            int[][] var3 = super.field9357.method2314((byte) 41, arg1);
            if (super.field9357.field5178) {
                int[][] var4 = this.method3748(arg1, 0, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class77.field1455 > var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var7[var11];
                    int var14 = var6[var11];
                    if (var12 == var13 && ~var13 == ~var14) {
                        var8[var11] = this.field10237 * var12 >> 12;
                        var9[var11] = this.field10238 * var13 >> 12;
                        var10[var11] = this.field10235 * var14 >> 12;
                    } else {
                        var8[var11] = this.field10237;
                        var9[var11] = this.field10238;
                        var10[var11] = this.field10235;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILjava/lang/String;B)V")
    public static final void method4072(int arg0, String arg1, byte arg2) {
        ++field10234;
        if (arg2 == -110) {
            class354 var3 = class501.method3012(arg0, 3, 2145997216);
            var3.method2222(-126);
            var3.field4988 = arg1;
        }
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(III)Z")
    public static final boolean method4073(int arg0, int arg1, int arg2) {
        ++field10239;
        if (arg0 != 2048) {
            field10231 = -96;
        }
        return (2048 & arg1) != 0;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V")
    public class731() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lud;II)V")
    public final void method116(class35 arg0, int arg1, int arg2) {
        if (arg1 != 3) {
            field10231 = 108;
        }
        ++field10240;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field10235 = arg0.method253(-13900);
                }
            } else {
                this.field10238 = arg0.method253(-13900);
            }
        } else {
            this.field10237 = arg0.method253(-13900);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lud;B)Lrn;")
    public static final class267 method4074(class35 arg0, byte arg1) {
        ++field10236;
        int var2 = arg0.method234((byte) -93);
        return arg1 != 61 ? null : new class267(var2);
    }
}
