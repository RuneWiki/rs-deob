import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class509 extends class202 {

    @OriginalMember(owner = "client!et", name = "S", descriptor = "I")
    private int field7595 = -1;

    @OriginalMember(owner = "client!et", name = "T", descriptor = "[I")
    public static int[] field7596 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!et", name = "U", descriptor = "I")
    public static int field7597;

    @OriginalMember(owner = "client!et", name = "I", descriptor = "I")
    public static int field7585;

    @OriginalMember(owner = "client!et", name = "K", descriptor = "I")
    public static int field7587;

    @OriginalMember(owner = "client!et", name = "L", descriptor = "I")
    public static int field7588;

    @OriginalMember(owner = "client!et", name = "M", descriptor = "I")
    public static int field7589;

    @OriginalMember(owner = "client!et", name = "N", descriptor = "I")
    public static int field7590;

    @OriginalMember(owner = "client!et", name = "O", descriptor = "I")
    public static int field7591;

    @OriginalMember(owner = "client!et", name = "P", descriptor = "I")
    public int field7592;

    @OriginalMember(owner = "client!et", name = "Q", descriptor = "I")
    public int field7593;

    @OriginalMember(owner = "client!et", name = "R", descriptor = "I")
    public static int field7594;

    @OriginalMember(owner = "client!et", name = "J", descriptor = "[I")
    public int[] field7586;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(B)V")
    public final void method1147(byte arg0) {
        super.method1147((byte) -116);
        if (arg0 >= -63) {
            this.method3082(true);
        }
        ++field7591;
        this.field7586 = null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(II)[[I")
    public int[][] method44(int arg0, int arg1) {
        if (arg0 != -1) {
            this.method1378(false);
        }
        ++field7588;
        int[][] var3 = super.field3081.method1050(arg1, arg0 ^ -97);
        if (super.field3081.field2432 && this.method3082(true)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (~class249.field4051 != ~this.field7592 ? this.field7592 * arg1 / class249.field4051 : arg1) * this.field7593;
            if (~class276.field4375 != ~this.field7593) {
                for (int var8 = 0; ~var8 > ~class276.field4375; ++var8) {
                    int var9 = this.field7593 * var8 / class276.field4375;
                    int var10 = this.field7586[var7 - -var9];
                    var6[var8] = class272.method1842(255, var10) << 4;
                    var5[var8] = class272.method1842(4080, var10 >> 4);
                    var4[var8] = class272.method1842(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; ~var11 > ~class276.field4375; ++var11) {
                    int var12 = this.field7586[var7++];
                    var6[var11] = class272.method1842(4080, var12 << 4);
                    var5[var11] = class272.method1842(var12, 65280) >> 4;
                    var4[var11] = class272.method1842(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lhw;BI)V")
    public final void method40(class208 arg0, byte arg1, int arg2) {
        if (~arg2 == -1) {
            this.field7595 = arg0.method1455(-3387);
        }
        ++field7590;
        int var4 = 72 % ((-46 - arg1) / 50);
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "()V")
    public class509() {
        super(0, false);
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(B)V")
    public static void method3081(byte arg0) {
        field7596 = null;
        if (arg0 > -114) {
            field7596 = null;
        }
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "(Z)Z")
    public final boolean method3082(boolean arg0) {
        ++field7585;
        if (this.field7586 != null) {
            return true;
        } else {
            if (!arg0) {
                field7596 = null;
            }
            if (this.field7595 >= 0) {
                class175 var2 = class502.field7527 < 0 ? class175.method1112(class162.field2351, this.field7595) : class175.method1115(class162.field2351, class502.field7527, this.field7595);
                var2.method1109();
                this.field7586 = var2.method1107();
                this.field7592 = var2.field2577;
                this.field7593 = var2.field2576;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "(B)V")
    public static final void method3083(byte arg0) {
        ++field7589;
        int var1 = 114 % ((53 - arg0) / 49);
        class488 var2 = null;
        try {
            class495 var3 = class339.field5294.method19(19, true, "2");
            while (~var3.field7458 == -1) {
                class208.method1464((byte) -103, 1L);
            }
            if (~var3.field7458 == -2) {
                var2 = (class488) var3.field7462;
                byte[] var4 = new byte[(int) var2.method2997((byte) -73)];
                int var6;
                for (int var5 = 0; ~var5 > ~var4.length; var5 += var6) {
                    var6 = var2.method2993(var4, (byte) -108, var5, var4.length + -var5);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                class346.method2295(new class208(var4), 6);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method2994(-30563);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(Z)I")
    public final int method1378(boolean arg0) {
        ++field7587;
        if (!arg0) {
            this.method3082(false);
        }
        return this.field7595;
    }

    static {
        new class213("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
        field7597 = -1;
    }
}
