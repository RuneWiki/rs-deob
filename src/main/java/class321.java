import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class321 extends class62 {

    @OriginalMember(owner = "client!dda", name = "D", descriptor = "I")
    private int field4421 = 1;

    @OriginalMember(owner = "client!dda", name = "H", descriptor = "I")
    private int field4425 = 0;

    @OriginalMember(owner = "client!dda", name = "I", descriptor = "I")
    private int field4426 = 0;

    @OriginalMember(owner = "client!dda", name = "G", descriptor = "I")
    public static int field4424 = 0;

    @OriginalMember(owner = "client!dda", name = "L", descriptor = "Lh;")
    public static class572 field4428;

    @OriginalMember(owner = "client!dda", name = "Q", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!dda", name = "C", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!dda", name = "E", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!dda", name = "F", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!dda", name = "K", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!dda", name = "O", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!dda", name = "P", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!dda", name = "N", descriptor = "[I")
    public static int[] field4429;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lgw;II)V")
    public final void method11(class148 arg0, int arg1, int arg2) {
        if (arg1 == -1) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (arg2 == 3) {
                        this.field4421 = arg0.method1032((byte) -33);
                    }
                } else {
                    this.field4425 = arg0.method1032((byte) -33);
                }
            } else {
                this.field4426 = arg0.method1032((byte) -33);
            }
            ++field4420;
        }
    }

    @OriginalMember(owner = "client!dda", name = "g", descriptor = "(I)V")
    public final void method395(int arg0) {
        ++field4423;
        class380.method2269(21815);
        if (arg0 >= -37) {
            this.method13(-107, 5);
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZLbq;BZ)V")
    public static final void method1935(boolean arg0, class243 arg1, byte arg2, boolean arg3) {
        ++field4427;
        int var4 = arg1.field3471;
        int var5 = (int) arg1.field5651;
        arg1.method2457(-8422);
        if (arg3) {
            class417.method2455(-1, var4);
        }
        class56.method362((byte) 41, var4);
        class162 var6 = class153.method1117(var5, -30170);
        if (var6 != null) {
            class403.method2371(var6, (byte) -62);
        }
        class391.method2328(20000000);
        if (arg2 < 48) {
            field4432 = -26;
        }
        if (!arg0 && ~class340.field4708 != 0) {
            class541.method3291(3, 1, class340.field4708);
        }
        class171 var7 = new class171(class385.field5297);
        for (class243 var8 = (class243) var7.method1213((byte) 123); var8 != null; var8 = (class243) var7.method1215(103)) {
            if (!var8.method2453(64)) {
                var8 = (class243) var7.method1213((byte) 124);
                if (var8 == null) {
                    return;
                }
            }
            if (~var8.field3469 == -4) {
                int var9 = (int) var8.field5651;
                if (~(var9 >>> 16) == ~var4) {
                    method1935(arg0, var8, (byte) 73, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "(II)[I")
    public final int[] method13(int arg0, int arg1) {
        ++field4422;
        int[] var3 = super.field774.method3086(arg0, arg1 + -656024163);
        if (arg1 != 656024161) {
            field4429 = null;
        }
        if (super.field774.field7499) {
            int var4 = class309.field4265[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; ~var6 > ~class438.field5847; ++var6) {
                int var7 = class200.field2965[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (~this.field4426 == -1) {
                    var9 = (-var4 + var7) * this.field4421;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field4421 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (-4096 & var9);
                if (~this.field4425 != -1) {
                    if (this.field4425 == 2) {
                        var12 -= 2048;
                        if (var12 < 0) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class48.field568[(4091 & var12) >> 4] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "()V")
    public class321() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Z)V")
    public static void method1936(boolean arg0) {
        if (!arg0) {
            field4431 = 34;
        }
        field4428 = null;
        field4429 = null;
    }

    static {
        new class572("Adventurer", "Abenteurer", "Aventurier", "Aventureira");
        field4428 = new class572("scroll:", "scrollen:", "déroulement:", "rolagem:");
        field4432 = 1339;
    }
}
