import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class161 extends class397 {

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
    private int field2085 = 10;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
    private int field2086 = 0;

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "I")
    private int field2095 = 2048;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "Lgn;")
    public static class475 field2087 = new class475(73, 16);

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "Liu;")
    public static class390 field2096 = new class390(21, 1);

    @OriginalMember(owner = "client!pd", name = "Y", descriptor = "[Ljava/lang/String;")
    public static String[] field2098 = new String[5];

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!pd", name = "X", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "[I")
    private int[] field2090;

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "[I")
    private int[] field2094;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "[S")
    public static short[] field2088;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public final void method24(int arg0) {
        if (arg0 == 255) {
            this.method1020(false);
            ++field2089;
        }
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(Z)V")
    private final void method1020(boolean arg0) {
        ++field2092;
        int var2 = 0;
        this.field2090 = new int[this.field2085 + 1];
        this.field2094 = new int[this.field2085 + 1];
        int var3 = 4096 / this.field2085;
        int var4 = this.field2095 * var3 >> 12;
        for (int var5 = 0; var5 < this.field2085; ++var5) {
            this.field2090[var5] = var2;
            this.field2094[var5] = var2 + var4;
            var2 += var3;
        }
        if (arg0) {
            this.field2094 = null;
        }
        this.field2090[this.field2085] = 4096;
        this.field2094[this.field2085] = 4096 - -this.field2094[0];
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBLae;)V")
    public final void method27(int arg0, byte arg1, class156 arg2) {
        ++field2093;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field2086 = arg2.method941((byte) 125);
                }
            } else {
                this.field2095 = arg2.method993((byte) -105);
            }
        } else {
            this.field2085 = arg2.method941((byte) 127);
        }
        if (arg1 != 80) {
            this.method1020(true);
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
    public class161() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)V")
    public static void method1021(int arg0) {
        if (arg0 == -8438) {
            field2088 = null;
            field2087 = null;
            field2098 = null;
            field2096 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field2091;
        int[] var3 = super.field5854.method465(arg1, 114);
        if (super.field5854.field991) {
            int var4 = class447.field6523[arg1];
            if (~this.field2086 != -1) {
                for (int var5 = 0; class164.field2152 > var5; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class228.field3210[var5];
                    int var9 = this.field2086;
                    if (~var9 != -2) {
                        if (var9 != 2) {
                            if (~var9 == -4) {
                                var6 = (var8 - var4 >> 1) + 2048;
                            }
                        } else {
                            var6 = 2048 - -(var8 - -var4 - 4096 >> 1);
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; this.field2085 > var10; ++var10) {
                        if (~this.field2090[var10] >= ~var6 && var6 < this.field2090[var10 - -1]) {
                            if (~this.field2094[var10] < ~var6) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field2085; ++var12) {
                    if (this.field2090[var12] <= var4 && ~this.field2090[var12 + 1] < ~var4) {
                        if (~var4 > ~this.field2094[var12]) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class268.method1644(var3, 0, class164.field2152, var11);
            }
        }
        return arg0 != -780833076 ? null : var3;
    }
}
