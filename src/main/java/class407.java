import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class407 extends class270 {

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "Z")
    private boolean field5933 = true;

    @OriginalMember(owner = "client!wa", name = "M", descriptor = "I")
    private int field5935 = 4096;

    @OriginalMember(owner = "client!wa", name = "J", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5932 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "I")
    public static int field5929;

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!wa", name = "I", descriptor = "I")
    public static int field5931;

    @OriginalMember(owner = "client!wa", name = "L", descriptor = "I")
    public static int field5934;

    @OriginalMember(owner = "client!wa", name = "N", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "I")
    public static int field5937;

    @OriginalMember(owner = "client!wa", name = "P", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!wa", name = "Q", descriptor = "I")
    public static int field5939;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IB)V")
    public static final void method2572(int arg0, byte arg1) {
        if (arg1 != 108) {
            method2574(25, 17);
        }
        ++field5929;
        if (arg0 != 0) {
            if (arg0 == 1) {
                class18.method107(-30099);
            } else if (arg0 != 2) {
                if (arg0 == 3) {
                    class392.method2500(11);
                } else {
                    throw new RuntimeException();
                }
            } else {
                class88.method662(arg1 ^ 9);
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "(B)V")
    public static final void method2573(byte arg0) {
        if (arg0 == 79) {
            ++field5936;
            class393.field5744.method106((byte) -113);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BLec;I)V")
    public final void method78(byte arg0, class37 arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field5933 = ~arg1.method271((byte) 118) == -2;
            }
        } else {
            this.field5935 = arg1.method320((byte) -87);
        }
        if (arg0 == 108) {
            ++field5930;
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)Z")
    public static final boolean method2574(int arg0, int arg1) {
        ++field5939;
        if (arg1 != 8396) {
            return true;
        } else if (~arg0 != -59 && arg0 != 47 && arg0 != 13 && arg0 != 20 && arg0 != 1003) {
            return arg0 == 41 || ~arg0 == -18 || arg0 == 1004;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
    public class407() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method123(boolean arg0, int arg1) {
        ++field5934;
        if (!arg0) {
            return null;
        } else {
            int[][] var3 = super.field4046.method244(arg1, 121);
            if (super.field4046.field488) {
                int[] var4 = this.method1927(0, 0, arg1 + -1 & class30.field442);
                int[] var5 = this.method1927(0, 0, arg1);
                int[] var6 = this.method1927(0, 0, class30.field442 & arg1 - -1);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                for (int var10 = 0; class161.field2445 > var10; ++var10) {
                    int var11 = (var6[var10] + -var4[var10]) * this.field5935;
                    int var12 = (var5[var10 - -1 & class267.field3997] + -var5[class267.field3997 & var10 - 1]) * this.field5935;
                    int var13 = var12 >> 12;
                    int var14 = var11 >> 12;
                    int var15 = var13 * var13 >> 12;
                    int var16 = var14 * var14 >> 12;
                    int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 - -4096) / 4096.0F)) * 4096.0D);
                    int var18;
                    int var19;
                    int var20;
                    if (var17 == 0) {
                        var18 = 0;
                        var19 = 0;
                        var20 = 0;
                    } else {
                        var20 = var12 / var17;
                        var18 = 16777216 / var17;
                        var19 = var11 / var17;
                    }
                    if (this.field5933) {
                        var18 = (var18 >> 1) + 2048;
                        var19 = (var19 >> 1) + 2048;
                        var20 = (var20 >> 1) + 2048;
                    }
                    var7[var10] = var20;
                    var8[var10] = var19;
                    var9[var10] = var18;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(Z)V")
    public static void method2575(boolean arg0) {
        if (!arg0) {
            method2572(76, (byte) -118);
        }
        field5932 = null;
    }
}
