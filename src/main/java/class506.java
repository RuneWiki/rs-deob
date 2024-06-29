import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class506 extends class404 {

    @OriginalMember(owner = "client!nh", name = "C", descriptor = "I")
    private int field7638 = 10;

    @OriginalMember(owner = "client!nh", name = "L", descriptor = "I")
    private int field7646 = 0;

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
    private int field7640 = 2048;

    @OriginalMember(owner = "client!nh", name = "K", descriptor = "[I")
    public static int[] field7645 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!nh", name = "B", descriptor = "Loe;")
    public static class127 field7637 = new class127(6, -1);

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "I")
    public static int field7635;

    @OriginalMember(owner = "client!nh", name = "A", descriptor = "I")
    public static int field7636;

    @OriginalMember(owner = "client!nh", name = "D", descriptor = "I")
    public static int field7639;

    @OriginalMember(owner = "client!nh", name = "G", descriptor = "I")
    public static int field7642;

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "I")
    public static int field7643;

    @OriginalMember(owner = "client!nh", name = "M", descriptor = "I")
    public static int field7647;

    @OriginalMember(owner = "client!nh", name = "N", descriptor = "I")
    public static int field7648;

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "[I")
    private int[] field7641;

    @OriginalMember(owner = "client!nh", name = "J", descriptor = "[I")
    private int[] field7644;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)V")
    public final void method211(int arg0) {
        if (arg0 != -3) {
            this.method90(30, 29);
        }
        ++field7647;
        this.method3021(4096);
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
    public class506() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "(I)V")
    private final void method3021(int arg0) {
        ++field7643;
        int var2 = 0;
        this.field7641 = new int[this.field7638 - -1];
        this.field7644 = new int[this.field7638 + 1];
        int var3 = arg0 / this.field7638;
        int var4 = this.field7640 * var3 >> 12;
        for (int var5 = 0; ~this.field7638 < ~var5; ++var5) {
            this.field7641[var5] = var2;
            this.field7644[var5] = var2 + var4;
            var2 += var3;
        }
        this.field7641[this.field7638] = 4096;
        this.field7644[this.field7638] = 4096 - -this.field7644[0];
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        if (arg0 > -47) {
            field7648 = -84;
        }
        ++field7635;
        int[] var3 = super.field5870.method372(arg1, (byte) 115);
        if (super.field5870.field810) {
            int var4 = class289.field4381[arg1];
            if (~this.field7646 == -1) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field7638; ++var6) {
                    if (var4 >= this.field7641[var6] && ~var4 > ~this.field7641[var6 - -1]) {
                        if (~var4 > ~this.field7644[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class356.method2179(var3, 0, class431.field6348, var5);
            } else {
                for (int var7 = 0; ~var7 > ~class431.field6348; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class167.field2594[var7];
                    int var11 = this.field7646;
                    if (~var11 != -2) {
                        if (var11 != 2) {
                            if (~var11 == -4) {
                                var8 = (var10 - var4 >> 1) + 2048;
                            }
                        } else {
                            var8 = (var4 + -4096 + var10 >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; ~var12 > ~this.field7638; ++var12) {
                        if (~this.field7641[var12] >= ~var8 && ~this.field7641[var12 - -1] < ~var8) {
                            if (this.field7644[var12] > var8) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "(I)V")
    public static void method3022(int arg0) {
        if (arg0 != 0) {
            method3022(-110);
        }
        field7645 = null;
        field7637 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILha;I)V")
    public final void method87(int arg0, class40 arg1, int arg2) {
        ++field7642;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field7646 = arg1.method257((byte) 32);
                }
            } else {
                this.field7640 = arg1.method254((byte) -120);
            }
        } else {
            this.field7638 = arg1.method257((byte) 93);
        }
        if (arg0 != 0) {
            field7645 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(III)V")
    public static final void method3023(int arg0, int arg1, int arg2) {
        ++field7639;
        if (arg1 == 21423) {
            class64 var3 = class230.method1387(arg2, (byte) 40, 7);
            var3.method441((byte) 58);
            var3.field1051 = arg0;
        }
    }
}
