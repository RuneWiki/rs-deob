import java.awt.Canvas;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class451 extends class184 {

    @OriginalMember(owner = "client!sp", name = "K", descriptor = "I")
    private int field6520 = 585;

    @OriginalMember(owner = "client!sp", name = "J", descriptor = "J")
    public static long field6519 = 0L;

    @OriginalMember(owner = "client!sp", name = "I", descriptor = "Ljava/util/Random;")
    public static Random field6518 = new Random();

    @OriginalMember(owner = "client!sp", name = "P", descriptor = "Lap;")
    public static class335 field6525 = new class335("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!sp", name = "D", descriptor = "I")
    public static int field6514;

    @OriginalMember(owner = "client!sp", name = "E", descriptor = "I")
    public static int field6515;

    @OriginalMember(owner = "client!sp", name = "F", descriptor = "I")
    public static int field6516;

    @OriginalMember(owner = "client!sp", name = "G", descriptor = "I")
    public static int field6517;

    @OriginalMember(owner = "client!sp", name = "L", descriptor = "I")
    public static int field6521;

    @OriginalMember(owner = "client!sp", name = "M", descriptor = "I")
    public static int field6522;

    @OriginalMember(owner = "client!sp", name = "N", descriptor = "I")
    public static int field6523;

    @OriginalMember(owner = "client!sp", name = "O", descriptor = "I")
    public static int field6524;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(BC)C", line = 7)
    public static final char method2687(byte arg0, char arg1) {
        ++field6517;
        if (arg1 == 198) {
            return 'E';
        } else if (~arg1 == -231) {
            return 'e';
        } else if (~arg1 == -224) {
            return 's';
        } else {
            if (arg0 != 21) {
                field6518 = null;
            }
            if (arg1 == 338) {
                return 'E';
            } else {
                return (char) (arg1 == 339 ? 'e' : '\u0000');
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 33)
    public static final void method2688(String arg0, boolean arg1) {
        ++field6515;
        class301.field3873 = arg0;
        if (class219.field2794.field6891 != null) {
            try {
                if (arg1) {
                    String var2 = class219.field2794.field6891.getParameter("cookieprefix");
                    String var3 = class219.field2794.field6891.getParameter("cookiehost");
                    String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
                    String var5;
                    if (arg0.length() == 0) {
                        var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        var5 = var4 + "; Expires=" + class461.method2717(94608000000L + class504.method3034((byte) -101), (byte) 40) + "; Max-Age=" + 94608000L;
                    }
                    class114.method824((byte) -111, "document.cookie=\"" + var5 + "\"", class219.field2794.field6891);
                }
            } catch (Throwable var6) {
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "(I)I", line = 66)
    public static final int method2689(int arg0) {
        if (arg0 != -17524) {
            field6525 = null;
        }
        ++field6522;
        return class198.field2587;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)[I", line = 79)
    public final int[] method6(int arg0, int arg1) {
        ++field6516;
        int[] var3 = super.field2409.method248(arg0, arg1 ^ 16776514);
        if (super.field2409.field436) {
            int var4 = class334.field4218[arg0];
            for (int var5 = 0; var5 < class245.field3167; ++var5) {
                int var6 = class347.field4461[var5];
                if (var6 > this.field6520 && ~(-this.field6520 + 4096) < ~var6 && ~(2048 - this.field6520) > ~var4 && var4 < this.field6520 + 2048) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 <= -1 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field6520);
                    var3[var5] = -var10 + 4096;
                } else if (-this.field6520 + 2048 < var6 && 2048 - -this.field6520 > var6) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field6520;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field6520 + 2048);
                } else if (~var4 <= ~this.field6520 && ~var4 >= ~(-this.field6520 + 4096)) {
                    if (~this.field6520 >= ~var6 && ~(-this.field6520 + 4096) <= ~var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = 2048 - var4;
                        int var16 = var15 < 0 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field6520 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 <= -1 ? var19 : -var19;
                    int var21 = var20 - this.field6520;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field6520 + 2048);
                }
            }
        }
        if (arg1 != 578) {
            method2691(-2);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "(Z)V", line = 161)
    public static final void method2690(boolean arg0) {
        class3.field34 = null;
        ++field6523;
        class46.field560 = null;
        class441.field6315 = null;
        class483.field7061 = null;
        class168.field2161 = null;
        if (arg0) {
            field6519 = 47L;
        }
        class251.field3212 = null;
        class170.field2184 = null;
        class467.field6747 = null;
        class101.field1219 = null;
    }

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "(I)V", line = 180)
    public static final void method2691(int arg0) {
        class251.field3210 = null;
        class447.field6400 = null;
        if (arg0 >= -111) {
            field6525 = null;
        }
        ++field6524;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(BILfh;)V", line = 193)
    public final void method7(byte arg0, int arg1, class463 arg2) {
        if (~arg1 == -1) {
            this.field6520 = arg2.method2758((byte) 77);
        }
        int var5 = 106 / ((arg0 - -13) / 51);
        ++field6514;
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "()V", line = 218)
    public class451() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "(Z)V", line = 224)
    public static void method2692(boolean arg0) {
        field6525 = null;
        field6518 = null;
        if (!arg0) {
            method2692(true);
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lga;IILjava/awt/Canvas;)Lya;", line = 235)
    public static final class38 method2693(class278 arg0, int arg1, int arg2, Canvas arg3) {
        if (arg1 != -8288) {
            field6518 = null;
        }
        ++field6521;
        return new class435(arg2, arg3, arg0);
    }
}
