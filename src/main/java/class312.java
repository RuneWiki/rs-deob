import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class312 extends class739 {

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
    private int field4229 = 0;

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
    private int field4232 = 1;

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "I")
    private int field4231 = 0;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "[I")
    public static int[] field4230 = new int[1];

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lsl;IB)V", line = 3)
    public final void method112(class479 arg0, int arg1, byte arg2) {
        if (arg2 != 1) {
            method1933(-106);
        }
        ++field4228;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -4) {
                    this.field4232 = arg0.method2886(true);
                }
            } else {
                this.field4229 = arg0.method2886(true);
            }
        } else {
            this.field4231 = arg0.method2886(true);
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V", line = 47)
    public class312() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V", line = 54)
    public final void method628(int arg0) {
        class451.method2765(8);
        ++field4227;
        if (arg0 < 53) {
            this.field4231 = -69;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZI)[I", line = 65)
    public final int[] method445(boolean arg0, int arg1) {
        if (arg0) {
            this.field4232 = -19;
        }
        ++field4234;
        int[] var3 = super.field10317.method1042(0, arg1);
        if (super.field10317.field2170) {
            int var4 = class19.field185[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; class399.field5703 > var6; ++var6) {
                int var7 = class604.field8580[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (this.field4231 == 0) {
                    var9 = (-var4 + var7) * this.field4232;
                } else {
                    int var10 = var8 * var8 - -(var5 * var5) >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                    var9 = (int) ((double) (this.field4232 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (~this.field4229 == -1) {
                    var12 = class624.field8880[(var12 & 4088) >> 4] + 4096 >> 1;
                } else if (~this.field4229 == -3) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V", line = 147)
    public static void method1933(int arg0) {
        int var1 = -35 / ((arg0 - -2) / 55);
        field4230 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(CI)Z", line = 156)
    public static final boolean method1934(char arg0, int arg1) {
        ++field4233;
        if (arg1 != -33) {
            field4230 = null;
        }
        return arg0 == 160 || ~arg0 == -33 || ~arg0 == -96 || ~arg0 == -46;
    }
}
