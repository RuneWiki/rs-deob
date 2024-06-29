import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class231 extends class346 {

    @OriginalMember(owner = "client!cp", name = "L", descriptor = "I")
    private int field3176 = 10;

    @OriginalMember(owner = "client!cp", name = "J", descriptor = "I")
    private int field3174 = 2048;

    @OriginalMember(owner = "client!cp", name = "Q", descriptor = "I")
    private int field3181 = 0;

    @OriginalMember(owner = "client!cp", name = "O", descriptor = "I")
    public static int field3179 = 0;

    @OriginalMember(owner = "client!cp", name = "N", descriptor = "Z")
    public static boolean field3178 = false;

    @OriginalMember(owner = "client!cp", name = "P", descriptor = "[I")
    public static int[] field3180 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!cp", name = "K", descriptor = "[I")
    public static int[] field3175 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!cp", name = "V", descriptor = "I")
    public static int field3186 = 0;

    @OriginalMember(owner = "client!cp", name = "T", descriptor = "[I")
    public static int[] field3184 = new int[2];

    @OriginalMember(owner = "client!cp", name = "M", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!cp", name = "R", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!cp", name = "U", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!cp", name = "W", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!cp", name = "X", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!cp", name = "H", descriptor = "[I")
    private int[] field3173;

    @OriginalMember(owner = "client!cp", name = "S", descriptor = "[I")
    private int[] field3183;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lfb;ZI)V", line = 3)
    public final void method38(class341 arg0, boolean arg1, int arg2) {
        ++field3182;
        if (arg1) {
            this.method45(12, 89);
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field3181 = arg0.method2233((byte) 104);
                }
            } else {
                this.field3174 = arg0.method2239(-1076227960);
            }
        } else {
            this.field3176 = arg0.method2233((byte) 104);
        }
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(II)[I", line = 51)
    public final int[] method45(int arg0, int arg1) {
        ++field3177;
        int[] var3 = super.field5152.method1409((byte) 48, arg0);
        if (super.field5152.field3004) {
            int var4 = class436.field6337[arg0];
            if (this.field3181 != 0) {
                for (int var5 = 0; class134.field1753 > var5; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class361.field5340[var5];
                    int var9 = this.field3181;
                    if (~var9 != -2) {
                        if (~var9 != -3) {
                            if (~var9 == -4) {
                                var6 = (-var4 + var8 >> 1) + 2048;
                            }
                        } else {
                            var6 = (var8 - 4096 - -var4 >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; ~this.field3176 < ~var10; ++var10) {
                        if (this.field3173[var10] <= var6 && var6 < this.field3173[var10 + 1]) {
                            if (this.field3183[var10] > var6) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field3176; ++var12) {
                    if (this.field3173[var12] <= var4 && ~var4 > ~this.field3173[var12 - -1]) {
                        if (var4 < this.field3183[var12]) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class206.method1356(var3, 0, class134.field1753, var11);
            }
        }
        if (arg1 != 3) {
            this.method237((byte) 40);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(B)V", line = 169)
    public final void method237(byte arg0) {
        ++field3185;
        this.method1496(-120);
        if (arg0 > -95) {
            this.field3173 = null;
        }
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V", line = 260)
    public class231() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "(I)V", line = 183)
    private final void method1496(int arg0) {
        ++field3187;
        int var2 = 0;
        this.field3183 = new int[this.field3176 + 1];
        this.field3173 = new int[this.field3176 + 1];
        int var3 = 4096 / this.field3176;
        int var4 = this.field3174 * var3 >> 12;
        for (int var5 = 0; this.field3176 > var5; ++var5) {
            this.field3173[var5] = var2;
            this.field3183[var5] = var2 + var4;
            var2 += var3;
        }
        if (arg0 >= -78) {
            this.field3173 = null;
        }
        this.field3173[this.field3176] = 4096;
        this.field3183[this.field3176] = this.field3183[0] + 4096;
    }

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "(Z)V", line = 248)
    public static void method1497(boolean arg0) {
        field3180 = null;
        if (!arg0) {
            method1497(true);
        }
        field3175 = null;
        field3184 = null;
    }
}
