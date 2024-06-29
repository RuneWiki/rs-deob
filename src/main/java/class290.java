import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class290 extends class11 {

    @OriginalMember(owner = "client!ep", name = "J", descriptor = "I")
    private int field4018 = 0;

    @OriginalMember(owner = "client!ep", name = "L", descriptor = "I")
    private int field4020 = 10;

    @OriginalMember(owner = "client!ep", name = "P", descriptor = "I")
    private int field4024 = 2048;

    @OriginalMember(owner = "client!ep", name = "K", descriptor = "Lvb;")
    public static class131 field4019 = new class131();

    @OriginalMember(owner = "client!ep", name = "Q", descriptor = "Lqp;")
    public static class466 field4025 = new class466("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!ep", name = "G", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!ep", name = "H", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!ep", name = "M", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!ep", name = "O", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!ep", name = "I", descriptor = "[I")
    private int[] field4017;

    @OriginalMember(owner = "client!ep", name = "N", descriptor = "[I")
    private int[] field4022;

    @OriginalMember(owner = "client!ep", name = "R", descriptor = "[Lfn;")
    public static class92[] field4026;

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(Z)V")
    public final void method42(boolean arg0) {
        this.method1726((byte) -37);
        if (arg0) {
            ++field4021;
        }
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(Z)V")
    public static void method1725(boolean arg0) {
        field4019 = null;
        if (!arg0) {
            method1725(true);
        }
        field4026 = null;
        field4025 = null;
    }

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        ++field4023;
        int[] var3 = super.field158.method1312(arg1, (byte) 74);
        if (arg0 >= -42) {
            this.field4024 = -28;
        }
        if (super.field158.field2966) {
            int var4 = class328.field4484[arg1];
            if (~this.field4018 != -1) {
                for (int var5 = 0; class90.field1316 > var5; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class448.field6606[var5];
                    int var9 = this.field4018;
                    if (~var9 != -2) {
                        if (var9 != 2) {
                            if (~var9 == -4) {
                                var6 = 2048 - -(-var4 + var8 >> 1);
                            }
                        } else {
                            var6 = (var8 - (-var4 + 4096) >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; ~this.field4020 < ~var10; ++var10) {
                        if (~this.field4022[var10] >= ~var6 && ~this.field4022[var10 + 1] < ~var6) {
                            if (~var6 > ~this.field4017[var10]) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; ~var12 > ~this.field4020; ++var12) {
                    if (this.field4022[var12] <= var4 && var4 < this.field4022[var12 + 1]) {
                        if (this.field4017[var12] > var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class91.method681(var3, 0, class90.field1316, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "()V")
    public class290() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(B)V")
    private final void method1726(byte arg0) {
        ++field4016;
        this.field4017 = new int[this.field4020 + 1];
        this.field4022 = new int[this.field4020 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field4020;
        if (arg0 != -37) {
            this.field4022 = null;
        }
        int var4 = this.field4024 * var3 >> 12;
        for (int var5 = 0; this.field4020 > var5; ++var5) {
            this.field4022[var5] = var2;
            this.field4017[var5] = var2 + var4;
            var2 += var3;
        }
        this.field4022[this.field4020] = 4096;
        this.field4017[this.field4020] = 4096 - -this.field4017[0];
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lsi;II)V")
    public final void method43(class391 arg0, int arg1, int arg2) {
        ++field4015;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field4018 = arg0.method2348(-2);
                }
            } else {
                this.field4024 = arg0.method2353((byte) 64);
            }
        } else {
            this.field4020 = arg0.method2348(-2);
        }
        if (arg1 > -40) {
            this.method43((class391) null, 82, -38);
        }
    }
}
