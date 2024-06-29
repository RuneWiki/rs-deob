import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class40 extends class252 {

    @OriginalMember(owner = "client!ji", name = "ab", descriptor = "I")
    private int field642 = 0;

    @OriginalMember(owner = "client!ji", name = "V", descriptor = "I")
    private int field637 = 0;

    @OriginalMember(owner = "client!ji", name = "bb", descriptor = "I")
    private int field643 = 1;

    @OriginalMember(owner = "client!ji", name = "Y", descriptor = "Ljd;")
    public static class85 field640 = class221.method1499("(U(Y", (byte) 108);

    @OriginalMember(owner = "client!ji", name = "W", descriptor = "[Lod;")
    public static class89[] field638 = new class89[50];

    @OriginalMember(owner = "client!ji", name = "T", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!ji", name = "U", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!ji", name = "Z", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!ji", name = "cb", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!ji", name = "db", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!ji", name = "eb", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!ji", name = "X", descriptor = "Lf;")
    public static class35 field639;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(B)V")
    public static void method271(byte arg0) {
        field640 = null;
        if (arg0 <= 0) {
            field638 = null;
            field639 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "(I)V")
    public static final void method272(int arg0) {
        for (int var1 = -1; ~class196.field3375 < ~var1; ++var1) {
            int var6;
            if (~var1 != 0) {
                var6 = class151.field2556[var1];
            } else {
                var6 = 2047;
            }
            class44 var7 = class249.field4291[var6];
            if (var7 != null && var7.field1070 > 0) {
                --var7.field1070;
                if (~var7.field1070 == -1) {
                    var7.field1060 = null;
                }
            }
        }
        ++field644;
        int var2 = 48 / ((-80 - arg0) / 40);
        for (int var3 = 0; var3 < class44.field775; ++var3) {
            int var4 = class137.field2380[var3];
            class17 var5 = class194.field3320[var4];
            if (var5 != null && ~var5.field1070 < -1) {
                --var5.field1070;
                if (~var5.field1070 == -1) {
                    var5.field1060 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(IB)[I")
    public final int[] method149(int arg0, byte arg1) {
        ++field636;
        if (arg1 != -55) {
            this.method149(58, (byte) 89);
        }
        int[] var3 = super.field4356.method868(arg0, (byte) 126);
        if (super.field4356.field2258) {
            int var4 = class39.field622[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; class5.field63 > var6; ++var6) {
                int var7 = class105.field1838[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (this.field642 == 0) {
                    var9 = (-var4 + var7) * this.field643;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                    var9 = (int) ((double) (this.field643 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (this.field637 != 0) {
                    if (~this.field637 == -3) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class38.field593[(4095 & var12) >> 4] - -4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
    public class40() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "(I)V")
    public final void method230(int arg0) {
        ++field646;
        class195.method1328(122);
        if (arg0 != 3906) {
            this.method149(-60, (byte) 5);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        ++field645;
        if (arg2 != -99) {
            field640 = null;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -4) {
                    this.field643 = arg0.method1711((byte) -67);
                }
            } else {
                this.field637 = arg0.method1711((byte) -67);
            }
        } else {
            this.field642 = arg0.method1711((byte) -67);
        }
    }
}
