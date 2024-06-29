import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class243 extends class3 {

    @OriginalMember(owner = "client!um", name = "T", descriptor = "I")
    private int field3839 = -1;

    @OriginalMember(owner = "client!um", name = "P", descriptor = "[I")
    public static int[] field3835 = new int[4096];

    @OriginalMember(owner = "client!um", name = "U", descriptor = "[Ljava/lang/String;")
    public static String[] field3840;

    @OriginalMember(owner = "client!um", name = "X", descriptor = "[I")
    public static int[] field3843;

    @OriginalMember(owner = "client!um", name = "F", descriptor = "I")
    private int field3826;

    @OriginalMember(owner = "client!um", name = "G", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!um", name = "H", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!um", name = "J", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!um", name = "K", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!um", name = "L", descriptor = "I")
    private int field3831;

    @OriginalMember(owner = "client!um", name = "M", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!um", name = "N", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!um", name = "O", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!um", name = "S", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!um", name = "V", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!um", name = "W", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!um", name = "Q", descriptor = "[I")
    private int[] field3836;

    @OriginalMember(owner = "client!um", name = "R", descriptor = "[Llj;")
    public static class289[] field3837;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(I)I", line = 7)
    public final int method15(int arg0) {
        if (arg0 <= 115) {
            return -81;
        } else {
            field3829++;
            return this.field3839;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IBIIII)V", line = 18)
    public static final void method1695(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field3827++;
        if (arg1 != -24) {
            return;
        }
        class242.field3812[0].method572(arg0, arg5);
        class242.field3812[1].method572(arg0, arg5 + arg3 - 16);
        int var6 = (arg3 - 32) * arg3 / arg4;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg3 - var6 - 32) * arg2 / (arg4 - arg3);
        if (!class245.field3886) {
            class317.method2282(arg0, arg5 + 16, 16, arg3 - 32, class30.field455);
            class317.method2282(arg0, arg5 + var7 + 16, 16, var6, class141.field2277);
            class317.method2293(arg0, arg5 + var7 + 16, var6, class337.field5437);
            class317.method2293(arg0 + 1, arg5 + 16 + var7, var6, class337.field5437);
            class317.method2292(arg0, arg5 + var7 + 16, 16, class337.field5437);
            class317.method2292(arg0, var7 + arg5 + 17, 16, class337.field5437);
            class317.method2293(arg0 + 15, arg5 + 16 + var7, var6, class242.field3818);
            class317.method2293(arg0 + 14, var7 + 17 + arg5, var6 - 1, class242.field3818);
            class317.method2292(arg0, arg5 + var6 + var7 + 15, 16, class242.field3818);
            class317.method2292(arg0 + 1, arg5 + var6 + 14 + var7, 15, class242.field3818);
            return;
        }
        class335.method2380(arg0, arg5 + 16, 16, arg3 - 32, class30.field455);
        class335.method2380(arg0, arg5 + var7 + 16, 16, var6, class141.field2277);
        class335.method2377(arg0, arg5 + var7 + 16, var6, class337.field5437);
        class335.method2377(arg0 + 1, arg5 - (-var7 + -16), var6, class337.field5437);
        class335.method2363(arg0, arg5 + var7 + 16, 16, class337.field5437);
        class335.method2363(arg0, arg5 + var7 + 17, 16, class337.field5437);
        class335.method2377(arg0 + 15, var7 + 16 + arg5, var6, class242.field3818);
        class335.method2377(arg0 + 14, arg5 + 17 + var7, var6 - 1, class242.field3818);
        class335.method2363(arg0, var6 + var7 + arg5 + 15, 16, class242.field3818);
        class335.method2363(arg0 + 1, arg5 + 14 + var7 + var6, 15, class242.field3818);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZBLjava/lang/String;)V", line = 67)
    public static final void method1696(boolean arg0, byte arg1, String arg2) {
        byte var3 = 4;
        int var4 = var3 + 6;
        field3834++;
        int var5 = class287.field4740.method1223(arg2, 250);
        int var6 = var3 + 6;
        int var7 = -18 % ((arg1 - 35) / 63);
        int var8 = class287.field4740.method1207(arg2, 250) * 13;
        if (class245.field3886) {
            class335.method2380(var4 - var3, -var3 + var6, var3 + var5 + var3, var3 + var8 - -var3, 0);
            class335.method2376(var4 - var3, -var3 + var6, var3 + var5 + var3, var3 + var3 + var8, 16777215);
        } else {
            class317.method2282(var4 - var3, -var3 + var6, var3 + var3 + var5, var8 - -var3 + var3, 0);
            class317.method2266(var4 - var3, -var3 + var6, var3 + var3 + var5, var3 + var8 - -var3, 16777215);
        }
        class287.field4740.method1208(arg2, var4, var6, var5, var8, 16777215, -1, 1, 1, 0);
        class279.method1986(var6 - var3, var8 - -var3 + var3, var4 - var3, var3 - -var3 + var5, 27960);
        if (!arg0) {
            class213.method1452(var5, var8, var6, (byte) 124, var4);
        } else if (class245.field3886) {
            class245.method1704();
        } else {
            try {
                Graphics var9 = class235.field3731.getGraphics();
                class92.field1331.method1166(false, 0, 0, var9);
            } catch (Exception var11) {
                class235.field3731.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BCI)C", line = 118)
    public static final char method1697(byte arg0, char arg1, int arg2) {
        field3832++;
        if (arg0 > -37) {
            method1698(-58, 23);
        }
        if (arg1 >= 'À' && arg1 <= 'ÿ') {
            if (arg1 >= 'À' && arg1 <= 'Æ') {
                return 'A';
            }
            if (arg1 == 'Ç') {
                return 'C';
            }
            if (arg1 >= 'È' && arg1 <= 'Ë') {
                return 'E';
            }
            if (arg1 >= 'Ì' && arg1 <= 'Ï') {
                return 'I';
            }
            if (arg1 == 'Ñ' && arg2 != 0) {
                return 'N';
            }
            if (arg1 >= 'Ò' && arg1 <= 'Ö') {
                return 'O';
            }
            if (arg1 >= 'Ù' && arg1 <= 'Ü') {
                return 'U';
            }
            if (arg1 == 'Ý') {
                return 'Y';
            }
            if (arg1 == 'ß') {
                return 's';
            }
            if (arg1 >= 'à' && arg1 <= 'æ') {
                return 'a';
            }
            if (arg1 == 'ç') {
                return 'c';
            }
            if (arg1 >= 'è' && arg1 <= 'ë') {
                return 'e';
            }
            if (arg1 >= 'ì' && arg1 <= 'ï') {
                return 'i';
            }
            if (arg1 == 'ñ' && arg2 != 0) {
                return 'n';
            }
            if (arg1 >= 'ò' && arg1 <= 'ö') {
                return 'o';
            }
            if (arg1 >= 'ù' && arg1 <= 'ü') {
                return 'u';
            }
            if (arg1 == 'ý' || arg1 == 'ÿ') {
                return 'y';
            }
        }
        if (arg1 == 'Œ') {
            return 'O';
        } else if (arg1 == 'œ') {
            return 'o';
        } else if (arg1 == 'Ÿ') {
            return 'Y';
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(B)V", line = 202)
    public final void method18(byte arg0) {
        super.method18((byte) -125);
        if (arg0 >= -115) {
            field3835 = (int[]) null;
        }
        this.field3836 = null;
        field3830++;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(II)[[I", line = 214)
    public final int[][] method22(int arg0, int arg1) {
        if (arg0 != -21194) {
            field3835 = (int[]) null;
        }
        field3828++;
        int[][] var3 = this.field20.method2435(arg1, false);
        if (this.field20.field5556 && this.method1699(1024)) {
            int var4 = (class308.field5010 == this.field3826 ? arg1 : this.field3826 * arg1 / class308.field5010) * this.field3831;
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int[] var7 = var3[0];
            if (class326.field5342 == this.field3831) {
                for (int var11 = 0; var11 < class326.field5342; var11++) {
                    int var12 = this.field3836[var4++];
                    var6[var11] = class235.method1623(4080, var12 << 4);
                    var5[var11] = class235.method1623(var12, 65280) >> 4;
                    var7[var11] = class235.method1623(var12 >> 12, 4080);
                }
            } else {
                for (int var8 = 0; var8 < class326.field5342; var8++) {
                    int var9 = this.field3831 * var8 / class326.field5342;
                    int var10 = this.field3836[var4 + var9];
                    var6[var8] = class235.method1623(4080, var10 << 4);
                    var5[var8] = class235.method1623(65280, var10) >> 4;
                    var7[var8] = class235.method1623(4080, var10 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V", line = 285)
    public class243() {
        super(0, false);
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(II)V", line = 293)
    public static final void method1698(int arg0, int arg1) {
        field3842++;
        class211 var2 = class17.method115(arg1, arg0, 4086);
        var2.method1435((byte) -2);
    }

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(I)Z", line = 307)
    private final boolean method1699(int arg0) {
        if (arg0 != 1024) {
            method1695(66, (byte) 77, 96, 30, 6, 14);
        }
        field3833++;
        if (this.field3836 != null) {
            return true;
        } else if (this.field3839 < 0) {
            return false;
        } else {
            int var2 = class326.field5342;
            int var3 = class308.field5010;
            int var4 = class259.field4101.method774((byte) -16, this.field3839).field901 ? 64 : 128;
            this.field3836 = class259.field4101.method770(false, var4, this.field3839, -115, var4, 1.0F);
            this.field3831 = var4;
            this.field3826 = var4;
            class46.method353(var3, -1, var2);
            return this.field3836 != null;
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field3835[var0] = class202.method1379((byte) -47, var0);
        }
        field3840 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
        field3843 = new int[1024];
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lfh;IZ)V", line = 364)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        if (arg1 == 0) {
            this.field3839 = arg0.method2250(-1613178296);
        }
        field3841++;
        if (arg2) {
            field3840 = (String[]) null;
        }
    }

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(B)V", line = 382)
    public static void method1700(byte arg0) {
        if (arg0 < 47) {
            method1697((byte) -54, 'D', 37);
        }
        field3837 = null;
        field3843 = null;
        field3840 = null;
        field3835 = null;
    }
}
