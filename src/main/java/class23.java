import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class23 extends class386 {

    @OriginalMember(owner = "client!nc", name = "J", descriptor = "I")
    private int field564 = 2048;

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "I")
    private int field561 = 10;

    @OriginalMember(owner = "client!nc", name = "N", descriptor = "I")
    private int field567 = 0;

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "Lwo;")
    public static class690 field565 = new class690(31, 4);

    @OriginalMember(owner = "client!nc", name = "P", descriptor = "[I")
    public static int[] field569 = new int[500];

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!nc", name = "Q", descriptor = "Lhca;")
    public static class455 field570;

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "[I")
    private int[] field562;

    @OriginalMember(owner = "client!nc", name = "O", descriptor = "[I")
    private int[] field568;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)V", line = 7)
    private final void method354(int arg0) {
        ++field563;
        this.field562 = new int[this.field561 - -1];
        int var2 = 0;
        this.field568 = new int[this.field561 + 1];
        int var3 = 4096 / this.field561;
        int var4 = this.field564 * var3 >> 12;
        for (int var5 = 0; ~this.field561 < ~var5; ++var5) {
            this.field568[var5] = var2;
            this.field562[var5] = var2 - -var4;
            var2 += var3;
        }
        this.field568[this.field561] = 4096;
        if (arg0 == 15027) {
            this.field562[this.field561] = this.field562[0] + 4096;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBLun;)V", line = 41)
    public final void method355(int arg0, byte arg1, class389 arg2) {
        ++field559;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field567 = arg2.method2229(255);
                }
            } else {
                this.field564 = arg2.method2260(-40);
            }
        } else {
            this.field561 = arg2.method2229(255);
        }
        if (arg1 <= 111) {
            this.field567 = -38;
        }
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "(I)V", line = 85)
    public static void method356(int arg0) {
        field569 = null;
        field570 = null;
        field565 = null;
        if (arg0 != 0) {
            field570 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V", line = 284)
    public class23() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([Lub;II)V", line = 100)
    public static final void method357(class20[] arg0, int arg1, int arg2) {
        if (arg1 < arg2) {
            int var3 = (arg1 + arg2) / 2;
            int var4 = arg1;
            class20 var5 = arg0[var3];
            arg0[var3] = arg0[arg2];
            arg0[arg2] = var5;
            int var6 = var5.field536;
            for (int var7 = arg1; var7 < arg2; ++var7) {
                if (arg0[var7].field536 < (var7 & 1) + var6) {
                    class20 var8 = arg0[var7];
                    arg0[var7] = arg0[var4];
                    arg0[var4++] = var8;
                }
            }
            arg0[arg2] = arg0[var4];
            arg0[var4] = var5;
            method357(arg0, arg1, var4 - 1);
            method357(arg0, var4 + 1, arg2);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V", line = 141)
    public final void method358(int arg0) {
        ++field560;
        if (arg0 < 0) {
            field565 = null;
        }
        this.method354(15027);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)[I", line = 157)
    public final int[] method359(int arg0, int arg1) {
        ++field566;
        int[] var3 = super.field5140.method1564(arg0, true);
        if (super.field5140.field3482) {
            int var4 = class562.field8114[arg0];
            if (this.field567 != 0) {
                for (int var5 = 0; class599.field8643 > var5; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class152.field1879[var5];
                    int var9 = this.field567;
                    if (var9 != 1) {
                        if (var9 != 2) {
                            if (~var9 == -4) {
                                var6 = (-var4 + var8 >> 1) + 2048;
                            }
                        } else {
                            var6 = 2048 - -(-4096 - (-var4 - var8) >> 1);
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; ~this.field561 < ~var10; ++var10) {
                        if (~this.field568[var10] >= ~var6 && var6 < this.field568[var10 + 1]) {
                            if (var6 < this.field562[var10]) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field561; ++var12) {
                    if (this.field568[var12] <= var4 && ~this.field568[var12 + 1] < ~var4) {
                        if (~this.field562[var12] < ~var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class252.method1539(var3, 0, class599.field8643, var11);
            }
        }
        int var13 = -7 % ((arg1 - 13) / 40);
        return var3;
    }
}
