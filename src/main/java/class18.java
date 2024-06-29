import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class18 extends class397 {

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
    private int field248 = 3216;

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "I")
    private int field246 = 3216;

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "[I")
    private int[] field247 = new int[3];

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "I")
    private int field253 = 4096;

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "[I")
    public static int[] field254 = new int[2];

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(II)V")
    public static final void method125(int arg0, int arg1) {
        ++field252;
        class338 var2 = class380.method2294((byte) 66, arg0, 4);
        if (arg1 != -22330) {
            field254 = null;
        }
        var2.method2048(124);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public final void method24(int arg0) {
        ++field250;
        this.method126(2);
        if (arg0 != 255) {
            this.field247 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
    public class18() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IBLae;)V")
    public final void method27(int arg0, byte arg1, class156 arg2) {
        ++field251;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field246 = arg2.method993((byte) -98);
                }
            } else {
                this.field248 = arg2.method993((byte) -106);
            }
        } else {
            this.field253 = arg2.method993((byte) -54);
        }
        if (arg1 != 80) {
            this.method126(75);
        }
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V")
    private final void method126(int arg0) {
        ++field245;
        double var2 = Math.cos((double) ((float) this.field246 / 4096.0F));
        this.field247[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field248 / 4096.0F)));
        this.field247[1] = (int) (4096.0D * Math.cos((double) ((float) this.field248 / 4096.0F)) * var2);
        this.field247[2] = (int) (4096.0D * Math.sin((double) ((float) this.field246 / 4096.0F)));
        int var4 = this.field247[0] * this.field247[0] >> 12;
        int var5 = this.field247[1] * this.field247[1] >> 12;
        int var6 = this.field247[arg0] * this.field247[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var6 + var5 >> 12)));
        if (~var7 != -1) {
            this.field247[1] = (this.field247[1] << 12) / var7;
            this.field247[0] = (this.field247[0] << 12) / var7;
            this.field247[2] = (this.field247[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        if (arg0 != -780833076) {
            return null;
        } else {
            ++field249;
            int[] var3 = super.field5854.method465(arg1, arg0 ^ -780833093);
            if (super.field5854.field991) {
                int var4 = class456.field6647 * this.field253 >> 12;
                int[] var5 = this.method2376(96, 0, arg1 - 1 & class340.field4948);
                int[] var6 = this.method2376(65, 0, arg1);
                int[] var7 = this.method2376(64, 0, class340.field4948 & arg1 - -1);
                for (int var8 = 0; class164.field2152 > var8; ++var8) {
                    int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                    int var10 = (var6[class107.field1429 & var8 + -1] + -var6[class107.field1429 & var8 - -1]) * var4 >> 12;
                    int var11 = var10 >> 4;
                    int var12 = var9 >> 4;
                    if (~var11 > -1) {
                        var11 = -var11;
                    }
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    if (~var11 < -256) {
                        var11 = 255;
                    }
                    if (~var12 < -256) {
                        var12 = 255;
                    }
                    int var13 = class252.field3621[((var12 + 1) * var12 >> 1) + var11] & 255;
                    int var14 = var13 * 4096 >> 8;
                    int var15 = var9 * var13 >> 8;
                    int var16 = var10 * var13 >> 8;
                    int var17 = this.field247[1] * var15 >> 12;
                    int var18 = this.field247[0] * var16 >> 12;
                    int var19 = this.field247[2] * var14 >> 12;
                    var3[var8] = var18 - -var17 + var19;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(B)V")
    public static void method127(byte arg0) {
        if (arg0 <= -99) {
            field254 = null;
        }
    }
}
