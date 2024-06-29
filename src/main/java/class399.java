import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class399 extends class739 {

    @OriginalMember(owner = "client!rfa", name = "C", descriptor = "I")
    private int field5704 = 0;

    @OriginalMember(owner = "client!rfa", name = "G", descriptor = "I")
    private int field5708 = 2048;

    @OriginalMember(owner = "client!rfa", name = "F", descriptor = "I")
    private int field5707 = 10;

    @OriginalMember(owner = "client!rfa", name = "I", descriptor = "F")
    public static float field5710;

    @OriginalMember(owner = "client!rfa", name = "z", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!rfa", name = "A", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!rfa", name = "B", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!rfa", name = "D", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!rfa", name = "E", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!rfa", name = "H", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!rfa", name = "J", descriptor = "I")
    public static int field5711;

    @OriginalMember(owner = "client!rfa", name = "L", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!rfa", name = "M", descriptor = "[I")
    private int[] field5713;

    @OriginalMember(owner = "client!rfa", name = "O", descriptor = "[I")
    private int[] field5715;

    @OriginalMember(owner = "client!rfa", name = "N", descriptor = "[[Ljw;")
    public static class280[][] field5714;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lsl;IB)V")
    public final void method112(class479 arg0, int arg1, byte arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field5704 = arg0.method2886(true);
                }
            } else {
                this.field5708 = arg0.method2882(arg2 ^ -2);
            }
        } else {
            this.field5707 = arg0.method2886(true);
        }
        if (arg2 != 1) {
            this.field5707 = -36;
        }
        ++field5702;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ZI)[I")
    public final int[] method445(boolean arg0, int arg1) {
        ++field5706;
        int[] var3 = super.field10317.method1042(0, arg1);
        if (super.field10317.field2170) {
            int var4 = class19.field185[arg1];
            if (this.field5704 == 0) {
                short var5 = 0;
                for (int var6 = 0; ~var6 > ~this.field5707; ++var6) {
                    if (var4 >= this.field5715[var6] && this.field5715[var6 - -1] > var4) {
                        if (this.field5713[var6] > var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class85.method685(var3, 0, field5703, var5);
            } else {
                for (int var7 = 0; field5703 > var7; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class604.field8580[var7];
                    int var11 = this.field5704;
                    if (~var11 != -2) {
                        if (var11 != 2) {
                            if (var11 == 3) {
                                var8 = (-var4 + var10 >> 1) + 2048;
                            }
                        } else {
                            var8 = 2048 - -(-4096 - -var4 + var10 >> 1);
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; ~var12 > ~this.field5707; ++var12) {
                        if (~var8 <= ~this.field5715[var12] && var8 < this.field5715[var12 + 1]) {
                            if (var8 < this.field5713[var12]) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        if (arg0) {
            method2417(true, (String) null, 88, (String) null, -88, (String) null, 66, (String) null, (String) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "(I)V")
    public static void method2415(int arg0) {
        field5714 = null;
        if (arg0 != 16989) {
            method2418(22, (class543) null);
        }
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(B)V")
    private final void method2416(byte arg0) {
        ++field5701;
        int var2 = 0;
        this.field5713 = new int[this.field5707 - -1];
        this.field5715 = new int[this.field5707 + 1];
        if (arg0 > -85) {
            method2415(-60);
        }
        int var3 = 4096 / this.field5707;
        int var4 = this.field5708 * var3 >> 12;
        for (int var5 = 0; ~var5 > ~this.field5707; ++var5) {
            this.field5715[var5] = var2;
            this.field5713[var5] = var2 + var4;
            var2 += var3;
        }
        this.field5715[this.field5707] = 4096;
        this.field5713[this.field5707] = this.field5713[0] + 4096;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V")
    public static final void method2417(boolean arg0, String arg1, int arg2, String arg3, int arg4, String arg5, int arg6, String arg7, String arg8) {
        ++field5712;
        class159 var9 = class241.field3566[99];
        int var10 = 99;
        if (arg0) {
            method2417(true, (String) null, -41, (String) null, -48, (String) null, -119, (String) null, (String) null);
        }
        while (~var10 < -1) {
            class241.field3566[var10] = class241.field3566[var10 - 1];
            --var10;
        }
        if (var9 == null) {
            var9 = new class159(arg6, arg4, arg1, arg5, arg3, arg8, arg2, arg7);
        } else {
            var9.method1136(arg3, arg8, arg1, arg7, false, arg6, arg2, arg4, arg5);
        }
        ++class76.field1105;
        class133.field1846 = class152.field2225;
        class241.field3566[0] = var9;
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(I)V")
    public final void method628(int arg0) {
        this.method2416((byte) -124);
        ++field5709;
        if (arg0 <= 53) {
            this.method112((class479) null, -88, (byte) -7);
        }
    }

    @OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "()V")
    public class399() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ILha;)V")
    public static final void method2418(int arg0, class543 arg1) {
        ++field5711;
        if (arg0 != 0) {
            field5705 = -123;
        }
        if (!class404.field5765) {
            class140.method989(arg1, false);
        } else {
            class233.method1625(arg1, -79);
        }
    }
}
