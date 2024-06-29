import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class248 extends class139 {

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "I")
    private int field3664 = 0;

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
    private int field3668 = 0;

    @OriginalMember(owner = "client!hf", name = "I", descriptor = "I")
    private int field3660 = 0;

    @OriginalMember(owner = "client!hf", name = "V", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!hf", name = "H", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!hf", name = "J", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!hf", name = "K", descriptor = "I")
    private int field3662;

    @OriginalMember(owner = "client!hf", name = "L", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!hf", name = "O", descriptor = "I")
    private int field3666;

    @OriginalMember(owner = "client!hf", name = "P", descriptor = "I")
    private int field3667;

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!hf", name = "S", descriptor = "I")
    private int field3670;

    @OriginalMember(owner = "client!hf", name = "T", descriptor = "I")
    private int field3671;

    @OriginalMember(owner = "client!hf", name = "U", descriptor = "I")
    private int field3672;

    @OriginalMember(owner = "client!hf", name = "W", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(II)I")
    public static int method1549(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BIII)V")
    private final void method1550(byte arg0, int arg1, int arg2, int arg3) {
        ++field3665;
        int var5 = ~arg1 <= ~arg3 ? arg1 : arg3;
        int var6 = arg3 < arg1 ? arg3 : arg1;
        int var7 = var5 < arg2 ? arg2 : var5;
        int var8 = arg2 >= var6 ? var6 : arg2;
        this.field3670 = (var8 - -var7) / 2;
        int var9 = var7 - var8;
        int var10 = 72 % ((arg0 - -7) / 61);
        if (this.field3670 > 0 && this.field3670 < 4096) {
            this.field3667 = (var9 << 12) / (~this.field3670 >= -2049 ? this.field3670 * 2 : -(this.field3670 * 2) + 8192);
        } else {
            this.field3667 = 0;
        }
        if (var9 > 0) {
            int var11 = (var7 - arg3 << 12) / var9;
            int var12 = (-arg1 + var7 << 12) / var9;
            int var13 = (-arg2 + var7 << 12) / var9;
            if (~arg3 != ~var7) {
                if (~arg1 != ~var7) {
                    this.field3666 = ~arg3 == ~var8 ? 12288 - -var12 : -var11 + 20480;
                } else {
                    this.field3666 = ~arg2 != ~var8 ? -var13 + 12288 : var11 + 4096;
                }
            } else {
                this.field3666 = ~arg1 != ~var8 ? -var12 + 4096 : 20480 - -var13;
            }
            this.field3666 /= 6;
        } else {
            this.field3666 = 0;
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)Z")
    public static final boolean method1551(int arg0) {
        if (arg0 != 2) {
            method1551(119);
        }
        ++field3663;
        try {
            return class179.method1096(-90);
        } catch (IOException var4) {
            class24.method172(40);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class393.field5568 != null ? class393.field5568.method7(32069) : -1) + "," + (class226.field3424 == null ? -1 : class226.field3424.method7(32069)) + "," + (class58.field757 == null ? -1 : class58.field757.method7(32069)) + " - " + class382.field5447 + "," + (class240.field3602 - -class492.field6935.field2163[0]) + "," + (class360.field5180 - -class492.field6935.field2159[0]) + " - ";
            for (int var3 = 0; ~var3 > ~class382.field5447 && ~var3 > -51; ++var3) {
                var2 = var2 + class345.field5016.field4064[var3] + ",";
            }
            class267.method1641(var2, var5, (byte) -87);
            class207.method1357((byte) -101);
            return true;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field3660 = (arg0.method1715((byte) 80) << 12) / 100;
                }
            } else {
                this.field3664 = (arg0.method1715((byte) 99) << 12) / 100;
            }
        } else {
            this.field3668 = arg0.method1702(-82);
        }
        if (arg1 != -45) {
            method1551(89);
        }
        ++field3661;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIII)V")
    private final void method1552(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 1) {
            ++field3659;
            int var5 = ~arg3 < -2049 ? arg0 + arg3 + -(arg0 * arg3 >> 12) : (arg0 + 4096) * arg3 >> 12;
            if (~var5 < -1) {
                int var6 = arg1 * 6;
                int var7 = arg3 - var5 + arg3;
                int var8 = (var5 - var7 << 12) / var5;
                int var9 = var6 >> 12;
                int var10 = var6 - (var9 << 12);
                int var12 = var8 * var5 >> 12;
                int var13 = var10 * var12 >> 12;
                int var14 = var7 + var13;
                int var15 = -var13 + var5;
                if (~var9 == -1) {
                    this.field3662 = var7;
                    this.field3672 = var14;
                    this.field3671 = var5;
                    return;
                }
                if (var9 == 1) {
                    this.field3672 = var5;
                    this.field3671 = var15;
                    this.field3662 = var7;
                    return;
                }
                if (var9 == 2) {
                    this.field3672 = var5;
                    this.field3662 = var14;
                    this.field3671 = var7;
                    return;
                }
                if (var9 == 3) {
                    this.field3671 = var7;
                    this.field3672 = var15;
                    this.field3662 = var5;
                    return;
                }
                if (~var9 == -5) {
                    this.field3662 = var5;
                    this.field3672 = var7;
                    this.field3671 = var14;
                    return;
                }
                if (var9 == 5) {
                    this.field3662 = var15;
                    this.field3671 = var5;
                    this.field3672 = var7;
                    return;
                }
            } else {
                this.field3671 = this.field3672 = this.field3662 = arg3;
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)[[I")
    public final int[][] method33(int arg0, int arg1) {
        ++field3669;
        int[][] var3 = super.field1835.method999((byte) 104, arg1);
        if (super.field1835.field2395) {
            int[][] var4 = this.method882(0, arg1, 1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class356.field5147; ++var11) {
                this.method1550((byte) 98, var6[var11], var7[var11], var5[var11]);
                this.field3667 += this.field3664;
                this.field3670 += this.field3660;
                for (this.field3666 += this.field3668; this.field3666 < 0; this.field3666 += 4096) {
                }
                if (this.field3667 < 0) {
                    this.field3667 = 0;
                }
                while (this.field3666 > 4096) {
                    this.field3666 -= 4096;
                }
                if (~this.field3667 < -4097) {
                    this.field3667 = 4096;
                }
                if (~this.field3670 > -1) {
                    this.field3670 = 0;
                }
                if (this.field3670 > 4096) {
                    this.field3670 = 4096;
                }
                this.method1552(this.field3667, this.field3666, 1, this.field3670);
                var8[var11] = this.field3671;
                var9[var11] = this.field3672;
                var10[var11] = this.field3662;
            }
        }
        if (arg0 >= -67) {
            field3673 = 125;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
    public class248() {
        super(1, false);
    }

    static {
        new class326("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
        field3673 = 0;
    }
}
