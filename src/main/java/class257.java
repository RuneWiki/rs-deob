import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class257 extends class210 {

    @OriginalMember(owner = "client!ro", name = "U", descriptor = "I")
    private int field3812 = 32768;

    @OriginalMember(owner = "client!ro", name = "P", descriptor = "I")
    public static int field3807 = 0;

    @OriginalMember(owner = "client!ro", name = "W", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!ro", name = "J", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!ro", name = "K", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!ro", name = "L", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!ro", name = "M", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!ro", name = "N", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!ro", name = "O", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!ro", name = "Q", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!ro", name = "R", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!ro", name = "S", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!ro", name = "T", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!ro", name = "V", descriptor = "Lct;")
    public static class104 field3813;

    @OriginalMember(owner = "client!ro", name = "I", descriptor = "Lsp;")
    public static class435 field3800;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IILat;)V")
    public final void method56(int arg0, int arg1, class256 arg2) {
        if (arg0 != 0) {
            if (~arg0 == -2) {
                super.field2956 = ~arg2.method1738((byte) -102) == -2;
            }
        } else {
            this.field3812 = arg2.method1767(1930493576) << 4;
        }
        if (arg1 != -11941) {
            field3814 = -1;
        }
        ++field3810;
    }

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "(I)V")
    public static void method1769(int arg0) {
        field3800 = null;
        field3813 = null;
        if (arg0 != 10872) {
            method1770(-7, (class104) null);
        }
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(ILct;)V")
    public static final void method1770(int arg0, class104 arg1) {
        class46.field596 = arg1;
        if (arg0 < 29) {
            method1770(-117, (class104) null);
        }
        ++field3802;
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(IB)I")
    public static final int method1771(int arg0, byte arg1) {
        if (arg1 > -115) {
            return -114;
        } else {
            ++field3801;
            return arg0 & 127;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IB)[I")
    public final int[] method361(int arg0, byte arg1) {
        ++field3811;
        int[] var3 = super.field2950.method1892(arg0, (byte) -115);
        if (super.field2950.field4111) {
            int[] var4 = this.method1447(arg0, -112, 1);
            int[] var5 = this.method1447(arg0, -114, 2);
            for (int var6 = 0; ~var6 > ~class202.field2852; ++var6) {
                int var7 = var4[var6] >> 4 & 255;
                int var8 = var5[var6] * this.field3812 >> 12;
                int var9 = class311.field4580[var7] * var8 >> 12;
                int var10 = class92.field1136[var7] * var8 >> 12;
                int var11 = class437.field6373 & (var9 >> 12) + var6;
                int var12 = class139.field1911 & arg0 - -(var10 >> 12);
                int[] var13 = this.method1447(var12, -118, 0);
                var3[var6] = var13[var11];
            }
        }
        return arg1 != -38 ? null : var3;
    }

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "(I)V")
    public final void method363(int arg0) {
        class51.method392(arg0);
        ++field3805;
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "()V")
    public class257() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lva;I)V")
    public static final void method1772(class58 arg0, int arg1) {
        ++field3806;
        int var2 = -class388.field5665 + arg0.field760;
        int var3 = arg0.field727 * 128 - -(64 * arg0.method446(10));
        int var4 = -25 / ((22 - arg1) / 36);
        int var5 = arg0.field710 * 128 + arg0.method446(10) * 64;
        arg0.field4951 += (var5 - arg0.field4951) / var2;
        arg0.field4954 += (-arg0.field4954 + var3) / var2;
        arg0.field789 = 0;
        if (arg0.field745 == 0) {
            arg0.method442(8192, true);
        }
        if (~arg0.field745 == -2) {
            arg0.method442(12288, true);
        }
        if (arg0.field745 == 2) {
            arg0.method442(0, true);
        }
        if (arg0.field745 == 3) {
            arg0.method442(4096, true);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)[[I")
    public final int[][] method58(int arg0, int arg1) {
        ++field3804;
        int[][] var3 = super.field2967.method1572(124, arg0);
        if (arg1 <= 94) {
            field3803 = 118;
        }
        if (super.field2967.field3454) {
            int[] var4 = this.method1447(arg0, -117, 1);
            int[] var5 = this.method1447(arg0, -113, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~var9 > ~class202.field2852; ++var9) {
                int var10 = var4[var9] * 255 >> 12 & 255;
                int var11 = var5[var9] * this.field3812 >> 12;
                int var12 = class311.field4580[var10] * var11 >> 12;
                int var13 = class92.field1136[var10] * var11 >> 12;
                int var14 = var9 - -(var12 >> 12) & class437.field6373;
                int var15 = (var13 >> 12) + arg0 & class139.field1911;
                int[][] var16 = this.method1444(1, 0, var15);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(BLbn;)V")
    public static final void method1773(byte arg0, class160 arg1) {
        class159.field2132.method767(8, arg1.method1071(114));
        if (arg0 == -10) {
            ++field3809;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIZLgt;II)Ljava/awt/Frame;")
    public static final Frame method1774(int arg0, int arg1, boolean arg2, class341 arg3, int arg4, int arg5) {
        ++field3808;
        if (!arg3.method2212(-335)) {
            return null;
        } else {
            if (arg4 == 0) {
                class429[] var6 = class409.method2542(0, arg3);
                if (var6 == null) {
                    return null;
                }
                boolean var7 = false;
                for (int var8 = 0; ~var8 > ~var6.length; ++var8) {
                    if (var6[var8].field6234 == arg5 && var6[var8].field6235 == arg1 && (~arg0 == -1 || ~var6[var8].field6236 == ~arg0) && (!var7 || ~arg4 > ~var6[var8].field6230)) {
                        arg4 = var6[var8].field6230;
                        var7 = true;
                    }
                }
                if (!var7) {
                    return null;
                }
            }
            class350 var9 = arg3.method2203(arg4, (byte) -125, arg5, arg1, arg0);
            while (~var9.field5134 == -1) {
                class418.method2587(arg2, 10L);
            }
            if (arg2) {
                return null;
            } else {
                Frame var10 = (Frame) var9.field5129;
                if (var10 == null) {
                    return null;
                } else if (~var9.field5134 == -3) {
                    class262.method1790(arg3, (byte) -126, var10);
                    return null;
                } else {
                    return var10;
                }
            }
        }
    }

    static {
        new class409("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field3814 = 1;
    }
}
