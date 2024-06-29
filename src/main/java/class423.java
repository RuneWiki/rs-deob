import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class423 extends class45 {

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
    private int field6317 = 2048;

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "I")
    private int field6313 = 10;

    @OriginalMember(owner = "client!ai", name = "J", descriptor = "I")
    private int field6311 = 0;

    @OriginalMember(owner = "client!ai", name = "I", descriptor = "Lrn;")
    public static class174 field6310 = new class174(15, -1);

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "Lrn;")
    public static class174 field6316 = new class174(21, 18);

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "Lrn;")
    public static class174 field6320;

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "I")
    public static int field6312;

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "Lop;")
    public static class124 field6322;

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "Ljava/awt/Frame;")
    public static Frame field6321;

    @OriginalMember(owner = "client!ai", name = "H", descriptor = "[I")
    private int[] field6309;

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "[I")
    private int[] field6319;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(I)V")
    private final void method2550(int arg0) {
        ++field6318;
        this.field6319 = new int[this.field6313 - -1];
        int var2 = 0;
        this.field6309 = new int[this.field6313 - -1];
        int var3 = 4096 / this.field6313;
        int var4 = this.field6317 * var3 >> 12;
        for (int var5 = 0; ~var5 > ~this.field6313; ++var5) {
            this.field6319[var5] = var2;
            this.field6309[var5] = var2 + var4;
            var2 += var3;
        }
        this.field6319[this.field6313] = arg0;
        this.field6309[this.field6313] = this.field6309[0] + 4096;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lcu;II)V")
    public final void method37(class145 arg0, int arg1, int arg2) {
        ++field6314;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field6311 = arg0.method1063((byte) -100);
                }
            } else {
                this.field6317 = arg0.method1069((byte) -104);
            }
        } else {
            this.field6313 = arg0.method1063((byte) 120);
        }
        if (arg1 != -26471) {
            method2551(84);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field6312;
        if (arg0 != 0) {
            return null;
        } else {
            int[] var3 = super.field854.method863((byte) 12, arg1);
            if (super.field854.field1928) {
                int var4 = class433.field6429[arg1];
                if (~this.field6311 != -1) {
                    for (int var5 = 0; ~var5 > ~class259.field3768; ++var5) {
                        int var6 = 0;
                        short var7 = 0;
                        int var8 = class69.field1199[var5];
                        int var9 = this.field6311;
                        if (~var9 != -2) {
                            if (var9 != 2) {
                                if (var9 == 3) {
                                    var6 = (-var4 + var8 >> 1) + 2048;
                                }
                            } else {
                                var6 = (var4 + var8 + -4096 >> 1) + 2048;
                            }
                        } else {
                            var6 = var8;
                        }
                        for (int var10 = 0; this.field6313 > var10; ++var10) {
                            if (var6 >= this.field6319[var10] && var6 < this.field6319[var10 + 1]) {
                                if (var6 < this.field6309[var10]) {
                                    var7 = 4096;
                                }
                                break;
                            }
                        }
                        var3[var5] = var7;
                    }
                } else {
                    short var11 = 0;
                    for (int var12 = 0; var12 < this.field6313; ++var12) {
                        if (var4 >= this.field6319[var12] && ~this.field6319[var12 + 1] < ~var4) {
                            if (~var4 > ~this.field6309[var12]) {
                                var11 = 4096;
                            }
                            break;
                        }
                    }
                    class73.method595(var3, 0, class259.field3768, var11);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "(I)V")
    public static void method2551(int arg0) {
        if (arg0 != -6275) {
            field6322 = null;
        }
        field6322 = null;
        field6320 = null;
        field6321 = null;
        field6316 = null;
        field6310 = null;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
    public class423() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)V")
    public final void method38(int arg0) {
        this.method2550(4096);
        if (arg0 != 4095) {
            field6322 = null;
        }
        ++field6315;
    }

    static {
        new class342("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
        field6320 = new class174(67, 7);
    }
}
