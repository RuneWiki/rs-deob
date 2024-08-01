import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("vd")
public class class197 extends class85 {

    @OriginalMember(owner = "vd", name = "ab", descriptor = "I")
    private int field3773 = 0;

    @OriginalMember(owner = "vd", name = "X", descriptor = "I")
    private int field3770 = 10;

    @OriginalMember(owner = "vd", name = "Y", descriptor = "I")
    private int field3771 = 2048;

    @OriginalMember(owner = "vd", name = "U", descriptor = "Llf;")
    public static class109 field3767 = class35.method275("::autoshadow off", 2);

    @OriginalMember(owner = "vd", name = "V", descriptor = "Llf;")
    private static class109 field3768 = class35.method275("Connecting to server)3)3)3", 2);

    @OriginalMember(owner = "vd", name = "db", descriptor = "Llf;")
    public static class109 field3776 = field3768;

    @OriginalMember(owner = "vd", name = "cb", descriptor = "I")
    public static int field3775 = 0;

    @OriginalMember(owner = "vd", name = "Z", descriptor = "I")
    public static int field3772 = -1;

    @OriginalMember(owner = "vd", name = "Q", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "vd", name = "R", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "vd", name = "S", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "vd", name = "bb", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "vd", name = "eb", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "vd", name = "T", descriptor = "[I")
    private int[] field3766;

    @OriginalMember(owner = "vd", name = "fb", descriptor = "[I")
    private int[] field3778;

    @OriginalMember(owner = "vd", name = "W", descriptor = "[Llf;")
    public static class109[] field3769;

    @OriginalMember(owner = "vd", name = "c", descriptor = "(I)V")
    public final void method199(int arg0) {
        if (arg0 == 25614) {
            this.method1310(-28);
            ++field3764;
        }
    }

    @OriginalMember(owner = "vd", name = "a", descriptor = "(II)[I")
    public final int[] method87(int arg0, int arg1) {
        ++field3774;
        int[] var3 = super.field1736.method835(-314, arg1);
        if (arg0 > -49) {
            return null;
        } else {
            if (super.field1736.field2253) {
                int var4 = class54.field1083[arg1];
                if (this.field3773 != 0) {
                    for (int var5 = 0; class57.field1152 > var5; ++var5) {
                        int var6 = 0;
                        short var7 = 0;
                        int var8 = class47.field980[var5];
                        int var9 = this.field3773;
                        if (~var9 != -2) {
                            if (~var9 != -3) {
                                if (~var9 == -4) {
                                    var6 = (-var4 + var8 >> 1) + 2048;
                                }
                            } else {
                                var6 = (var4 + -4096 + var8 >> 1) + 2048;
                            }
                        } else {
                            var6 = var8;
                        }
                        for (int var10 = 0; ~this.field3770 < ~var10; ++var10) {
                            if (var6 >= this.field3778[var10] && var6 < this.field3778[var10 + 1]) {
                                if (this.field3766[var10] > var6) {
                                    var7 = 4096;
                                }
                                break;
                            }
                        }
                        var3[var5] = var7;
                    }
                } else {
                    short var11 = 0;
                    for (int var12 = 0; ~var12 > ~this.field3770; ++var12) {
                        if (~var4 <= ~this.field3778[var12] && this.field3778[var12 - -1] > var4) {
                            if (~var4 > ~this.field3766[var12]) {
                                var11 = 4096;
                            }
                            break;
                        }
                    }
                    class122.method877(var3, 0, class57.field1152, var11);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "vd", name = "d", descriptor = "(B)V")
    public static void method1309(byte arg0) {
        field3768 = null;
        field3776 = null;
        field3767 = null;
        field3769 = null;
        if (arg0 != 73) {
            method1309((byte) -28);
        }
    }

    @OriginalMember(owner = "vd", name = "a", descriptor = "(BILja;)V")
    public final void method31(byte arg0, int arg1, class86 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field3773 = arg2.method598((byte) 123);
                }
            } else {
                this.field3771 = arg2.method569(true);
            }
        } else {
            this.field3770 = arg2.method598((byte) 86);
        }
        if (arg0 > -120) {
            this.field3770 = 84;
        }
        ++field3763;
    }

    @OriginalMember(owner = "vd", name = "e", descriptor = "(I)V")
    private final void method1310(int arg0) {
        this.field3766 = new int[this.field3770 - -1];
        this.field3778 = new int[this.field3770 + 1];
        ++field3777;
        if (arg0 != -28) {
            this.field3766 = null;
        }
        int var2 = 0;
        int var3 = 4096 / this.field3770;
        int var4 = this.field3771 * var3 >> 12;
        for (int var5 = 0; this.field3770 > var5; ++var5) {
            this.field3778[var5] = var2;
            this.field3766[var5] = var2 + var4;
            var2 += var3;
        }
        this.field3778[this.field3770] = 4096;
        this.field3766[this.field3770] = this.field3766[0] + 4096;
    }

    @OriginalMember(owner = "vd", name = "<init>", descriptor = "()V")
    public class197() {
        super(0, true);
    }
}
