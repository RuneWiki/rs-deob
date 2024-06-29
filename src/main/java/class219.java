import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class219 {

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "Ltm;")
    public static class349 field2697 = new class349(32);

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field2703 = 0;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "Lhq;")
    public static class365 field2706;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "Lcq;")
    public static class72 field2707;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "Lhq;")
    public static class365 field2708;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "Z")
    public static boolean field2710;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public int field2696;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    private int field2700;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "[Lip;")
    public static class279[] field2709;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IB)V")
    public final void method1329(int arg0, byte arg1) {
        if (arg1 < -58) {
            this.field2700 = 0;
            this.field2696 = arg0;
            field2702++;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(JZ)V")
    public static final void method1330(long arg0, boolean arg1) {
        field2698++;
        if (arg0 <= 0L || !arg1) {
            return;
        }
        if ((arg0 % 10L) == 0L) {
            class22.method128(122, arg0 - 1L);
            class22.method128(109, 1L);
        } else {
            class22.method128(82, arg0);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BIII)Z")
    public final boolean method1331(byte arg0, int arg1, int arg2, int arg3) {
        field2701++;
        int var5 = this.field2700;
        if (this.field2696 == arg1 && this.field2700 == 0) {
            return false;
        }
        int var6 = -103 / ((arg0 - 33) / 37);
        boolean var9;
        if (this.field2700 == 0) {
            if (arg1 > this.field2696 && arg1 <= (this.field2696 + arg3) || arg1 < this.field2696 && arg1 >= (this.field2696 - arg3)) {
                this.field2696 = arg1;
                return false;
            }
            var9 = true;
        } else if (this.field2700 > 0 && this.field2696 < arg1) {
            int var7 = this.field2700 * this.field2700 / (arg3 * 2);
            int var8 = this.field2696 + var7;
            if (arg1 > var8 && var8 >= this.field2696) {
                var9 = true;
            } else {
                var9 = false;
            }
        } else if (this.field2700 < 0 && this.field2696 > arg1) {
            int var10 = this.field2700 * this.field2700 / (arg3 * 2);
            int var11 = this.field2696 - var10;
            if (var11 > arg1 && this.field2696 >= var11) {
                var9 = true;
            } else {
                var9 = false;
            }
        } else {
            var9 = false;
        }
        if (var9) {
            if (arg1 > this.field2696) {
                this.field2700 += arg3;
                if (arg2 != 0 && arg2 < this.field2700) {
                    this.field2700 = arg2;
                }
            } else {
                this.field2700 -= arg3;
                if (arg2 != 0 && -arg2 > this.field2700) {
                    this.field2700 = -arg2;
                }
            }
            if (this.field2700 != var5) {
                int var12 = this.field2700 * this.field2700 / (arg3 * 2);
                if (arg1 <= this.field2696) {
                    if (this.field2696 > arg1 && (this.field2696 - var12) < arg1) {
                        this.field2700 = var5;
                    }
                } else if (arg1 < (this.field2696 + var12)) {
                    this.field2700 = var5;
                }
            }
        } else if (this.field2700 > 0) {
            this.field2700 -= arg3;
            if (this.field2700 < 0) {
                this.field2700 = 0;
            }
        } else {
            this.field2700 += arg3;
            if (this.field2700 > 0) {
                this.field2700 = 0;
            }
        }
        this.field2696 += this.field2700 + var5 >> 1;
        return var9;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BII)V")
    public static final void method1332(byte arg0, int arg1, int arg2) {
        field2705++;
        if (arg0 > -123) {
            return;
        }
        int var3 = class213.field2611.method2203((byte) -105, class126.field1409.method434(class373.field5057, -8192));
        for (class266 var4 = (class266) class97.field1138.method1690((byte) -123); var4 != null; var4 = (class266) class97.field1138.method1699((byte) 4)) {
            int var8 = class268.method1677(var4, true);
            if (var8 > var3) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class57.field660 * 16 + 21;
        int var6 = arg2 - var3 / 2;
        if (class39.field457 < var3 + var6) {
            var6 = class39.field457 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (class28.field315 < var5 + arg1) {
            var7 = class28.field315 - var5;
        }
        class148.field1735 = var6;
        if (var7 < 0) {
            var7 = 0;
        }
        class76.field941 = var7;
        class143.field1686 = var3;
        class194.field2298 = (class231.field3044 ? 26 : 22) + class57.field660 * 16;
        class49.field574 = true;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)I")
    public final int method1333(int arg0) {
        if (arg0 >= -96) {
            return 46;
        } else {
            field2699++;
            return this.field2696 & 0x3FFF;
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
    public final void method1334(int arg0) {
        if (arg0 != 1) {
            method1330(-19L, false);
        }
        this.field2696 &= 0x3FFF;
        field2704++;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)V")
    public static void method1335(boolean arg0) {
        field2706 = null;
        field2697 = null;
        field2707 = null;
        if (!arg0) {
            field2697 = null;
        }
        field2708 = null;
        field2709 = null;
    }

    static {
        new class72("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
        field2706 = new class365(64);
        field2707 = new class72("Drop", "Fallen lassen", "Poser", "Largar");
        new class72("Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.");
        field2708 = new class365(64);
        field2710 = true;
    }
}
