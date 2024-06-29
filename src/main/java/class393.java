import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class393 extends class667 {

    @OriginalMember(owner = "client!hf", name = "E", descriptor = "I")
    private int field5509 = 585;

    @OriginalMember(owner = "client!hf", name = "B", descriptor = "I")
    public static int field5506;

    @OriginalMember(owner = "client!hf", name = "C", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!hf", name = "D", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!hf", name = "F", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([BI)Ljava/lang/String;", line = 4)
    public static final String method2445(byte[] arg0, int arg1) {
        ++field5506;
        if (arg1 > -33) {
            method2445((byte[]) null, -83);
        }
        return class268.method1791(0, arg0, arg0.length, 0);
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V", line = 17)
    public class393() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lud;II)V", line = 20)
    public final void method116(class35 arg0, int arg1, int arg2) {
        if (arg1 == 3) {
            if (arg2 == 0) {
                this.field5509 = arg0.method253(-13900);
            }
            ++field5510;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BI)[I", line = 46)
    public final int[] method117(byte arg0, int arg1) {
        ++field5507;
        int[] var3 = super.field9355.method1744(arg1, -2);
        if (super.field9355.field3728) {
            int var4 = class385.field5384[arg1];
            for (int var5 = 0; var5 < class77.field1455; ++var5) {
                int var6 = class20.field261[var5];
                if (~this.field5509 > ~var6 && var6 < -this.field5509 + 4096 && var4 > 2048 - this.field5509 && 2048 - -this.field5509 > var4) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 <= -1 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field5509);
                    var3[var5] = -var10 + 4096;
                } else if (2048 - this.field5509 < var6 && ~var6 > ~(2048 - -this.field5509)) {
                    int var11 = var4 + -2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field5509;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field5509 + 2048);
                } else if (~this.field5509 >= ~var4 && -this.field5509 + 4096 >= var4) {
                    if (this.field5509 <= var6 && var6 <= 4096 - this.field5509) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 < 0 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field5509 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 <= -1 ? var19 : -var19;
                    int var21 = var20 - this.field5509;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field5509 + 2048);
                }
            }
        }
        return arg0 > -87 ? null : var3;
    }
}
