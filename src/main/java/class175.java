import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class175 extends class136 {

    @OriginalMember(owner = "client!rn", name = "J", descriptor = "I")
    private int field2479 = 1024;

    @OriginalMember(owner = "client!rn", name = "M", descriptor = "I")
    private int field2482 = 3072;

    @OriginalMember(owner = "client!rn", name = "O", descriptor = "I")
    private int field2484 = 2048;

    @OriginalMember(owner = "client!rn", name = "E", descriptor = "Lpk;")
    public static class133 field2475 = new class133();

    @OriginalMember(owner = "client!rn", name = "P", descriptor = "I")
    public static int field2485 = 0;

    @OriginalMember(owner = "client!rn", name = "C", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!rn", name = "D", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!rn", name = "F", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!rn", name = "G", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!rn", name = "H", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!rn", name = "K", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!rn", name = "L", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!rn", name = "N", descriptor = "Lpj;")
    public static class99 field2483;

    @OriginalMember(owner = "client!rn", name = "Q", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field2486;

    static {
        new class331("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IILiv;)V", line = 5)
    public final void method268(int arg0, int arg1, class65 arg2) {
        ++field2480;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field1966 = arg2.method577(255) == 1;
                }
            } else {
                this.field2482 = arg2.method623((byte) 123);
            }
        } else {
            this.field2479 = arg2.method623((byte) -92);
        }
        if (arg0 != 4) {
            this.method269(true);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BI)[[I", line = 48)
    public final int[][] method272(byte arg0, int arg1) {
        ++field2477;
        if (arg0 < 33) {
            this.method82(47, -106);
        }
        int[][] var3 = super.field1952.method3127((byte) -128, arg1);
        if (super.field1952.field7770) {
            int[][] var4 = this.method1036(3, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class467.field6889 > var11; ++var11) {
                var8[var11] = this.field2479 - -(var5[var11] * this.field2484 >> 12);
                var9[var11] = (var6[var11] * this.field2484 >> 12) + this.field2479;
                var10[var11] = this.field2479 - -(var7[var11] * this.field2484 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V", line = 94)
    public class175() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)[I", line = 99)
    public final int[] method82(int arg0, int arg1) {
        ++field2478;
        int[] var3 = super.field1957.method2887((byte) -112, arg1);
        int var4 = 53 % ((arg0 - 67) / 50);
        if (super.field1957.field7031) {
            int[] var5 = this.method1033(arg1, 0, 0);
            for (int var6 = 0; ~var6 > ~class467.field6889; ++var6) {
                var3[var6] = (var5[var6] * this.field2484 >> 12) + this.field2479;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIB)I", line = 132)
    public static final int method1226(int arg0, int arg1, byte arg2) {
        ++field2473;
        if (arg2 < 103) {
            field2485 = -83;
        }
        return arg0 != 4 && ~arg0 != -6 ? 256 : class323.field4544[arg1 & 3];
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BLya;)V", line = 147)
    public static final void method1227(byte arg0, class38 arg1) {
        if (!class500.field7415) {
            class333.method2036((byte) -120, arg1);
        } else {
            class67.method653(arg1, (byte) -128);
        }
        ++field2476;
        if (arg0 != -7) {
            method1226(-67, -112, (byte) -111);
        }
    }

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "(B)V", line = 163)
    public static final void method1228(byte arg0) {
        ++field2481;
        if (class149.field2112 == null) {
            int var1 = 39 % ((arg0 - -60) / 51);
            int var2 = class385.field5663;
            int var3 = class513.field7566;
            int var4 = -class94.field1278 - var2 + class248.field3674;
            int var5 = -class410.field6100 + -var3 + class333.field4630;
            if (var2 > 0 || var4 > 0 || var3 > 0 || ~var5 < -1) {
                try {
                    Container var6;
                    if (class245.field3611 == null) {
                        var6 = class498.field7404.field6180;
                    } else {
                        var6 = class245.field3611;
                    }
                    int var7 = 0;
                    int var8 = 0;
                    if (class245.field3611 == var6) {
                        Insets var9 = class245.field3611.getInsets();
                        var7 = var9.left;
                        var8 = var9.top;
                    }
                    Graphics var10 = var6.getGraphics();
                    var10.setColor(Color.black);
                    if (~var2 < -1) {
                        var10.fillRect(var7, var8, var2, class333.field4630);
                    }
                    if (~var3 < -1) {
                        var10.fillRect(var7, var8, class248.field3674, var3);
                    }
                    if (var4 > 0) {
                        var10.fillRect(var7 - var4 + class248.field3674, var8, var4, class333.field4630);
                    }
                    if (var5 > 0) {
                        var10.fillRect(var7, var8 - -class333.field4630 + -var5, class248.field3674, var5);
                        return;
                    }
                } catch (Exception var11) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)V", line = 240)
    public final void method269(boolean arg0) {
        this.field2484 = -this.field2479 + this.field2482;
        if (!arg0) {
            ++field2474;
        }
    }

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "(I)V", line = 269)
    public static void method1229(int arg0) {
        field2475 = null;
        field2486 = null;
        if (arg0 == -1) {
            field2483 = null;
        }
    }
}
