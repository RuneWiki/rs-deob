import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class236 extends class110 {

    @OriginalMember(owner = "client!el", name = "K", descriptor = "I")
    private int field3542 = 4096;

    @OriginalMember(owner = "client!el", name = "R", descriptor = "I")
    private int field3548 = 0;

    @OriginalMember(owner = "client!el", name = "J", descriptor = "I")
    public static int field3541 = -1;

    @OriginalMember(owner = "client!el", name = "M", descriptor = "S")
    public static short field3543 = 1;

    @OriginalMember(owner = "client!el", name = "Q", descriptor = "I")
    public static int field3547 = 0;

    @OriginalMember(owner = "client!el", name = "P", descriptor = "[I")
    public static int[] field3546 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!el", name = "G", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!el", name = "H", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!el", name = "I", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!el", name = "N", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!el", name = "O", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!el", name = "S", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)[I", line = 9)
    public final int[] method46(int arg0, int arg1) {
        field3545++;
        int[] var3 = this.field1695.method440((byte) -60, arg1);
        if (this.field1695.field875) {
            int[] var4 = this.method764(0, true, arg1);
            for (int var5 = 0; var5 < class124.field1936; var5++) {
                int var6 = var4[var5];
                if (var6 < this.field3548) {
                    var3[var5] = this.field3548;
                } else if (this.field3542 >= var6) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field3542;
                }
            }
        }
        if (arg0 != 1) {
            method1616(-46);
        }
        return var3;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IZ)[[I", line = 52)
    public final int[][] method445(int arg0, boolean arg1) {
        field3544++;
        int[][] var3 = this.field1701.method1477((byte) 75, arg0);
        if (this.field1701.field3255) {
            int[][] var4 = this.method770(arg0, (byte) 89, 0);
            int[] var5 = var4[2];
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var4[1];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class124.field1936; var11++) {
                int var12 = var6[var11];
                int var13 = var8[var11];
                int var14 = var5[var11];
                if (this.field3548 > var12) {
                    var7[var11] = this.field3548;
                } else if (var12 <= this.field3542) {
                    var7[var11] = var12;
                } else {
                    var7[var11] = this.field3542;
                }
                if (this.field3548 > var13) {
                    var9[var11] = this.field3548;
                } else if (var13 <= this.field3542) {
                    var9[var11] = var13;
                } else {
                    var9[var11] = this.field3542;
                }
                if (var14 < this.field3548) {
                    var10[var11] = this.field3548;
                } else if (this.field3542 < var14) {
                    var10[var11] = this.field3542;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        if (arg1) {
            method1616(17);
        }
        return var3;
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V", line = 127)
    public class236() {
        super(1, false);
    }

    @OriginalMember(owner = "client!el", name = "h", descriptor = "(I)V", line = 141)
    public static final void method1616(int arg0) {
        field3549++;
        if (class186.field2779 != null) {
            class43 var1 = class186.field2779;
            synchronized (class186.field2779) {
                class186.field2779 = null;
            }
        }
        if (arg0 < 116) {
            method1618('_', (byte) 34);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILre;I)V", line = 170)
    public final void method44(int arg0, class263 arg1, int arg2) {
        if (arg0 == 0) {
            this.field3548 = arg1.method1830((byte) -77);
        } else if (arg0 == 1) {
            this.field3542 = arg1.method1830((byte) -77);
        } else if (arg0 == 2) {
            this.field1705 = arg1.method1787(false) == 1;
        }
        if (arg2 > -37) {
            method1618('d', (byte) 56);
        }
        field3540++;
    }

    @OriginalMember(owner = "client!el", name = "i", descriptor = "(I)V", line = 203)
    public static void method1617(int arg0) {
        field3546 = null;
        if (arg0 < 100) {
            field3543 = -81;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(CB)C", line = 219)
    public static final char method1618(char arg0, byte arg1) {
        field3539++;
        if (arg1 != 69) {
            method1619(-96);
        }
        return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
    }

    @OriginalMember(owner = "client!el", name = "j", descriptor = "(I)V", line = 244)
    public static final void method1619(int arg0) {
        field3538++;
        if (arg0 >= 45 && class144.field2174 == 5) {
            class144.field2174 = 6;
        }
    }
}
