import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class758 extends class739 {

    @OriginalMember(owner = "client!vt", name = "C", descriptor = "I")
    private int field10548 = 4096;

    @OriginalMember(owner = "client!vt", name = "D", descriptor = "I")
    private int field10549 = 0;

    @OriginalMember(owner = "client!vt", name = "A", descriptor = "I")
    public static int field10546 = 765;

    @OriginalMember(owner = "client!vt", name = "z", descriptor = "Lhr;")
    public static class57 field10545 = new class57(8, 1);

    @OriginalMember(owner = "client!vt", name = "B", descriptor = "I")
    public static int field10547;

    @OriginalMember(owner = "client!vt", name = "E", descriptor = "I")
    public static int field10550;

    @OriginalMember(owner = "client!vt", name = "F", descriptor = "I")
    public static int field10551;

    @OriginalMember(owner = "client!vt", name = "H", descriptor = "I")
    public static int field10552;

    @OriginalMember(owner = "client!vt", name = "I", descriptor = "I")
    public static int field10553;

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "()V", line = 3)
    public class758() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IILjava/lang/String;)V", line = 8)
    public static final void method4212(int arg0, int arg1, String arg2) {
        class145.method1013(arg2, (byte) 103, "", arg0, 0, "", "");
        ++field10547;
        if (arg1 != 2) {
            field10546 = 12;
        }
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(II)[[I", line = 23)
    public final int[][] method113(int arg0, int arg1) {
        ++field10552;
        int[][] var3 = super.field10328.method2106(arg0, true);
        if (arg1 != 8213) {
            this.method113(78, -64);
        }
        if (super.field10328.field4727) {
            int[][] var4 = this.method4124(arg0, 0, true);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class399.field5703 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~var12 <= ~this.field10549) {
                    if (this.field10548 < var12) {
                        var8[var11] = this.field10548;
                    } else {
                        var8[var11] = var12;
                    }
                } else {
                    var8[var11] = this.field10549;
                }
                if (~this.field10549 < ~var13) {
                    var9[var11] = this.field10549;
                } else if (this.field10548 < var13) {
                    var9[var11] = this.field10548;
                } else {
                    var9[var11] = var13;
                }
                if (this.field10549 > var14) {
                    var10[var11] = this.field10549;
                } else if (this.field10548 >= var14) {
                    var10[var11] = var14;
                } else {
                    var10[var11] = this.field10548;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lsl;IB)V", line = 99)
    public final void method112(class479 arg0, int arg1, byte arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field10320 = ~arg0.method2886(true) == -2;
                }
            } else {
                this.field10548 = arg0.method2882(arg2 ^ -2);
            }
        } else {
            this.field10549 = arg0.method2882(-1);
        }
        if (arg2 != 1) {
            method4212(-39, 39, (String) null);
        }
        ++field10550;
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(B)V", line = 143)
    public static void method4213(byte arg0) {
        if (arg0 > 50) {
            field10545 = null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ZI)[I", line = 164)
    public final int[] method445(boolean arg0, int arg1) {
        if (arg0) {
            this.field10548 = -24;
        }
        ++field10551;
        int[] var3 = super.field10317.method1042(0, arg1);
        if (super.field10317.field2170) {
            int[] var4 = this.method4127(arg1, 46, 0);
            for (int var5 = 0; class399.field5703 > var5; ++var5) {
                int var6 = var4[var5];
                if (this.field10549 <= var6) {
                    if (~var6 >= ~this.field10548) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field10548;
                    }
                } else {
                    var3[var5] = this.field10549;
                }
            }
        }
        return var3;
    }
}
