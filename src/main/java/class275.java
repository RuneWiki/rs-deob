import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class275 extends class273 {

    @OriginalMember(owner = "client!li", name = "U", descriptor = "I")
    private int field4819 = 10;

    @OriginalMember(owner = "client!li", name = "ab", descriptor = "I")
    private int field4825 = 2048;

    @OriginalMember(owner = "client!li", name = "W", descriptor = "I")
    private int field4821 = 0;

    @OriginalMember(owner = "client!li", name = "V", descriptor = "[I")
    public static int[] field4820 = new int[32];

    @OriginalMember(owner = "client!li", name = "ib", descriptor = "Ljd;")
    public static class86 field4833;

    @OriginalMember(owner = "client!li", name = "hb", descriptor = "Ljd;")
    public static class86 field4832;

    @OriginalMember(owner = "client!li", name = "jb", descriptor = "Ljd;")
    public static class86 field4834;

    @OriginalMember(owner = "client!li", name = "S", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!li", name = "T", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!li", name = "Y", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!li", name = "Z", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!li", name = "bb", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!li", name = "cb", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!li", name = "db", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!li", name = "fb", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!li", name = "gb", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!li", name = "X", descriptor = "[I")
    private int[] field4822;

    @OriginalMember(owner = "client!li", name = "eb", descriptor = "[I")
    private int[] field4829;

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V")
    public class275() {
        super(0, true);
    }

    @OriginalMember(owner = "client!li", name = "f", descriptor = "(I)I")
    public static final int method1869(int arg0) {
        ++field4823;
        int var1 = 6 / ((arg0 - 59) / 51);
        return 6;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(IB)Z")
    public static final boolean method1870(int arg0, byte arg1) {
        ++field4830;
        if (arg1 > -42) {
            field4832 = null;
        }
        return (1 & arg0) != 0;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IBI[S[Ljd;)V")
    public static final void method1871(int arg0, byte arg1, int arg2, short[] arg3, class86[] arg4) {
        if (~arg2 > ~arg0) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg2;
            class86 var7 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var7;
            short var8 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var8;
            for (int var9 = arg2; var9 < arg0; ++var9) {
                if (var7 == null || arg4[var9] != null && ~(1 & var9) < ~arg4[var9].method618(var7, false)) {
                    class86 var10 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6] = var10;
                    short var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg4[arg0] = arg4[var6];
            arg4[var6] = var7;
            arg3[arg0] = arg3[var6];
            arg3[var6] = var8;
            method1871(var6 - 1, (byte) 66, arg2, arg3, arg4);
            method1871(arg0, (byte) 66, var6 + 1, arg3, arg4);
        }
        if (arg1 == 66) {
            ++field4817;
        }
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "(I)V")
    public final void method84(int arg0) {
        ++field4818;
        this.method1873(-28776);
        if (arg0 != 4095) {
            field4834 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)V")
    public static void method1872(boolean arg0) {
        if (!arg0) {
            field4833 = null;
        }
        field4820 = null;
        field4832 = null;
        field4833 = null;
        field4834 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field4827;
        if (arg0 != -7420) {
            this.method34(-118, (class200) null, 48);
        }
        int[] var3 = super.field4800.method1224(arg1, 0);
        if (super.field4800.field3160) {
            int var4 = class143.field2711[arg1];
            if (this.field4821 == 0) {
                short var5 = 0;
                for (int var6 = 0; this.field4819 > var6; ++var6) {
                    if (var4 >= this.field4822[var6] && ~this.field4822[var6 + 1] < ~var4) {
                        if (this.field4829[var6] > var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class250.method1688(var3, 0, class176.field3200, var5);
            } else {
                for (int var7 = 0; ~var7 > ~class176.field3200; ++var7) {
                    int var8 = 0;
                    int var9 = class114.field2184[var7];
                    short var10 = 0;
                    int var11 = this.field4821;
                    if (var11 != 1) {
                        if (~var11 != -3) {
                            if (~var11 == -4) {
                                var8 = (-var4 + var9 >> 1) + 2048;
                            }
                        } else {
                            var8 = (-4096 - (-var4 - var9) >> 1) + 2048;
                        }
                    } else {
                        var8 = var9;
                    }
                    for (int var12 = 0; this.field4819 > var12; ++var12) {
                        if (var8 >= this.field4822[var12] && ~this.field4822[var12 + 1] < ~var8) {
                            if (this.field4829[var12] > var8) {
                                var10 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var10;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        ++field4828;
        if (arg2 >= -16) {
            this.field4825 = -22;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field4821 = arg1.method1408((byte) -22);
                }
            } else {
                this.field4825 = arg1.method1410(-89);
            }
        } else {
            this.field4819 = arg1.method1408((byte) -103);
        }
    }

    @OriginalMember(owner = "client!li", name = "g", descriptor = "(I)V")
    private final void method1873(int arg0) {
        this.field4822 = new int[this.field4819 + 1];
        this.field4829 = new int[this.field4819 + 1];
        ++field4824;
        int var2 = 0;
        int var3 = 4096 / this.field4819;
        int var4 = this.field4825 * var3 >> 12;
        for (int var5 = 0; var5 < this.field4819; ++var5) {
            this.field4822[var5] = var2;
            this.field4829[var5] = var2 + var4;
            var2 += var3;
        }
        if (arg0 != -28776) {
            method1869(-67);
        }
        this.field4822[this.field4819] = 4096;
        this.field4829[this.field4819] = this.field4829[0] + 4096;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field4820[var1] = var0 + -1;
            var0 += var0;
        }
        field4833 = class122.method868("Liste der Welten geladen", true);
        field4832 = class122.method868("Lade)3)3)3", true);
        field4834 = class122.method868("event_opbase", true);
    }
}
