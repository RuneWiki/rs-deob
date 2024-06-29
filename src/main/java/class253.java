import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class253 extends class136 {

    @OriginalMember(owner = "client!mv", name = "E", descriptor = "I")
    private int field3718 = 81;

    @OriginalMember(owner = "client!mv", name = "L", descriptor = "I")
    private int field3725 = 1024;

    @OriginalMember(owner = "client!mv", name = "P", descriptor = "I")
    private int field3729 = 4;

    @OriginalMember(owner = "client!mv", name = "D", descriptor = "I")
    private int field3717 = 409;

    @OriginalMember(owner = "client!mv", name = "T", descriptor = "I")
    private int field3733 = 0;

    @OriginalMember(owner = "client!mv", name = "Q", descriptor = "I")
    private int field3730 = 1024;

    @OriginalMember(owner = "client!mv", name = "W", descriptor = "I")
    private int field3736 = 8;

    @OriginalMember(owner = "client!mv", name = "O", descriptor = "I")
    private int field3728 = 204;

    @OriginalMember(owner = "client!mv", name = "V", descriptor = "Lbg;")
    public static class324 field3735 = new class324(61, 5);

    @OriginalMember(owner = "client!mv", name = "Y", descriptor = "Lsl;")
    public static class318 field3738 = new class318(33, 11);

    @OriginalMember(owner = "client!mv", name = "C", descriptor = "I")
    private int field3716;

    @OriginalMember(owner = "client!mv", name = "F", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!mv", name = "G", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!mv", name = "I", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!mv", name = "J", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!mv", name = "M", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!mv", name = "N", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!mv", name = "S", descriptor = "I")
    private int field3732;

    @OriginalMember(owner = "client!mv", name = "U", descriptor = "I")
    private int field3734;

    @OriginalMember(owner = "client!mv", name = "X", descriptor = "Ll;")
    public static class16 field3737;

    @OriginalMember(owner = "client!mv", name = "Z", descriptor = "Lit;")
    public static class455 field3739;

    @OriginalMember(owner = "client!mv", name = "R", descriptor = "[I")
    private int[] field3731;

    @OriginalMember(owner = "client!mv", name = "H", descriptor = "[[I")
    private int[][] field3721;

    @OriginalMember(owner = "client!mv", name = "K", descriptor = "[[I")
    private int[][] field3724;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IILiv;)V")
    public final void method268(int arg0, int arg1, class65 arg2) {
        ++field3719;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    if (arg1 == 7) {
                                        this.field3730 = arg2.method623((byte) -85);
                                    }
                                } else {
                                    this.field3718 = arg2.method623((byte) -74);
                                }
                            } else {
                                this.field3733 = arg2.method623((byte) 96);
                            }
                        } else {
                            this.field3725 = arg2.method623((byte) 97);
                        }
                    } else {
                        this.field3728 = arg2.method623((byte) -50);
                    }
                } else {
                    this.field3717 = arg2.method623((byte) 119);
                }
            } else {
                this.field3736 = arg2.method577(255);
            }
        } else {
            this.field3729 = arg2.method577(255);
        }
        if (arg0 != 4) {
            this.method269(false);
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(II)[I")
    public final int[] method82(int arg0, int arg1) {
        ++field3722;
        int[] var3 = super.field1957.method2887((byte) -112, arg1);
        int var4 = -52 / ((arg0 - 67) / 50);
        if (super.field1957.field7031) {
            int var5 = 0;
            int var6;
            for (var6 = class290.field4168[arg1] - -this.field3733; ~var6 > -1; var6 += 4096) {
            }
            while (~var6 < -4097) {
                var6 -= 4096;
            }
            while (~this.field3736 < ~var5 && var6 >= this.field3731[var5]) {
                ++var5;
            }
            int var7 = var5 + -1;
            boolean var8 = (var5 & 1) == 0;
            int var9 = this.field3731[var5];
            int var10 = this.field3731[var5 - 1];
            if (~var6 < ~(this.field3716 + var10) && var6 < var9 - this.field3716) {
                for (int var11 = 0; ~var11 > ~class467.field6889; ++var11) {
                    int var12 = !var8 ? -this.field3725 : this.field3725;
                    int var13 = 0;
                    int var14;
                    for (var14 = (this.field3734 * var12 >> 12) + class453.field6672[var11]; var14 < 0; var14 += 4096) {
                    }
                    while (~var14 < -4097) {
                        var14 -= 4096;
                    }
                    while (this.field3729 > var13 && ~var14 <= ~this.field3721[var7][var13]) {
                        ++var13;
                    }
                    int var15 = var13 + -1;
                    int var16 = this.field3721[var7][var15];
                    int var17 = this.field3721[var7][var13];
                    if (var14 > this.field3716 + var16 && var14 < -this.field3716 + var17) {
                        var3[var11] = this.field3724[var7][var15];
                    } else {
                        var3[var11] = 0;
                    }
                }
            } else {
                class201.method1409(var3, 0, class467.field6889, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(FFFFILge;IBFII)[B")
    public static final byte[] method1638(float arg0, float arg1, float arg2, float arg3, int arg4, class499 arg5, int arg6, byte arg7, float arg8, int arg9, int arg10) {
        ++field3726;
        if (arg7 <= 9) {
            field3738 = null;
        }
        byte[] var11 = new byte[arg6 * arg9 * arg10];
        class405.method2485(var11, arg2, arg0, 0, arg10, arg9, arg3, arg1, arg4, 127, arg6, arg8, arg5);
        return var11;
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "()V")
    public class253() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "(I)V")
    private final void method1639(int arg0) {
        ++field3727;
        Random var2 = new Random((long) this.field3736);
        this.field3734 = 4096 / this.field3729;
        this.field3732 = 4096 / this.field3736;
        this.field3716 = this.field3718 / 2;
        int var3 = this.field3734 / 2;
        this.field3731 = new int[this.field3736 + 1];
        int var4 = this.field3732 / 2;
        this.field3721 = new int[this.field3736][this.field3729 + 1];
        this.field3724 = new int[this.field3736][this.field3729];
        this.field3731[arg0] = 0;
        for (int var5 = 0; ~var5 > ~this.field3736; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field3732;
                int var7 = (class245.method1609((byte) 94, var2, 4096) - 2048) * this.field3728 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field3731[var5] = this.field3731[var5 - 1] + var8;
            }
            this.field3721[var5][0] = 0;
            for (int var9 = 0; ~this.field3729 < ~var9; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field3734;
                    int var11 = (-2048 + class245.method1609((byte) 94, var2, 4096)) * this.field3717 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field3721[var5][var9] = this.field3721[var5][var9 - 1] + var12;
                }
                this.field3724[var5][var9] = ~this.field3730 < -1 ? 4096 + -class245.method1609((byte) 94, var2, this.field3730) : 4096;
            }
            this.field3721[var5][this.field3729] = 4096;
        }
        this.field3731[this.field3736] = 4096;
    }

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "(I)V")
    public static void method1640(int arg0) {
        field3739 = null;
        field3737 = null;
        field3738 = null;
        if (arg0 == -1) {
            field3735 = null;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Z)V")
    public final void method269(boolean arg0) {
        if (arg0) {
            method1640(99);
        }
        this.method1639(0);
        ++field3723;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(ZZII)I")
    public static final int method1641(boolean arg0, boolean arg1, int arg2, int arg3) {
        if (arg0) {
            return -59;
        } else {
            ++field3720;
            class110 var4 = class455.method2749(71, arg1, arg3);
            if (var4 == null) {
                return -1;
            } else {
                return arg2 >= 0 && var4.field1558.length > arg2 ? var4.field1558[arg2] : -1;
            }
        }
    }

    static {
        new class331("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
    }
}
