import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class435 extends class297 {

    @OriginalMember(owner = "client!st", name = "K", descriptor = "I")
    private int field6218 = 0;

    @OriginalMember(owner = "client!st", name = "O", descriptor = "I")
    private int field6222 = 10;

    @OriginalMember(owner = "client!st", name = "T", descriptor = "I")
    private int field6227 = 2048;

    @OriginalMember(owner = "client!st", name = "I", descriptor = "Lmu;")
    public static class303 field6217 = new class303(85, 4);

    @OriginalMember(owner = "client!st", name = "M", descriptor = "I")
    public static int field6220 = 0;

    @OriginalMember(owner = "client!st", name = "L", descriptor = "I")
    public static int field6219;

    @OriginalMember(owner = "client!st", name = "N", descriptor = "I")
    public static int field6221;

    @OriginalMember(owner = "client!st", name = "P", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!st", name = "Q", descriptor = "I")
    public static int field6224;

    @OriginalMember(owner = "client!st", name = "R", descriptor = "[I")
    private int[] field6225;

    @OriginalMember(owner = "client!st", name = "S", descriptor = "[I")
    private int[] field6226;

    @OriginalMember(owner = "client!st", name = "c", descriptor = "(II)[I", line = 11)
    public final int[] method15(int arg0, int arg1) {
        if (arg1 != 255) {
            this.field6226 = null;
        }
        ++field6221;
        int[] var3 = super.field4165.method127(0, arg0);
        if (super.field4165.field266) {
            int var4 = class620.field8445[arg0];
            if (this.field6218 != 0) {
                for (int var5 = 0; var5 < class525.field7275; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class733.field9899[var5];
                    int var9 = this.field6218;
                    if (var9 != 1) {
                        if (var9 != 2) {
                            if (~var9 == -4) {
                                var6 = (var8 - var4 >> 1) + 2048;
                            }
                        } else {
                            var6 = (-4096 - -var4 + var8 >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; ~this.field6222 < ~var10; ++var10) {
                        if (var6 >= this.field6225[var10] && var6 < this.field6225[var10 + 1]) {
                            if (~this.field6226[var10] < ~var6) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field6222; ++var12) {
                    if (~this.field6225[var12] >= ~var4 && ~this.field6225[var12 + 1] < ~var4) {
                        if (this.field6226[var12] > var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class363.method2321(var3, 0, class525.field7275, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "()V", line = 239)
    public class435() {
        super(0, true);
    }

    @OriginalMember(owner = "client!st", name = "e", descriptor = "(I)V", line = 136)
    public final void method711(int arg0) {
        if (arg0 < 108) {
            this.method17((class215) null, -68, -1);
        }
        ++field6223;
        this.method2641((byte) -111);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Lcea;II)V", line = 153)
    public final void method17(class215 arg0, int arg1, int arg2) {
        ++field6224;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field6218 = arg0.method1535(arg2 ^ 31192);
                }
            } else {
                this.field6227 = arg0.method1478(842397944);
            }
        } else {
            this.field6222 = arg0.method1535(255);
        }
        if (arg2 != 31015) {
            this.method17((class215) null, 38, 1);
        }
    }

    @OriginalMember(owner = "client!st", name = "f", descriptor = "(I)V", line = 195)
    public static void method2640(int arg0) {
        if (arg0 <= -72) {
            field6217 = null;
        }
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(B)V", line = 208)
    private final void method2641(byte arg0) {
        ++field6219;
        int var2 = 0;
        this.field6226 = new int[this.field6222 - -1];
        this.field6225 = new int[this.field6222 - -1];
        int var3 = 4096 / this.field6222;
        int var4 = this.field6227 * var3 >> 12;
        for (int var5 = 0; ~var5 > ~this.field6222; ++var5) {
            this.field6225[var5] = var2;
            this.field6226[var5] = var2 + var4;
            var2 += var3;
        }
        if (arg0 != -111) {
            this.field6225 = null;
        }
        this.field6225[this.field6222] = 4096;
        this.field6226[this.field6222] = 4096 - -this.field6226[0];
    }
}
