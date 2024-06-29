import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public abstract class class196 {

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field2889 = -1;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "Lrn;")
    public static class174 field2893 = new class174(70, 8);

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "Lrn;")
    public static class174 field2894 = new class174(0, 3);

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "Lrn;")
    public static class174 field2895 = new class174(60, -1);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 == arg6 && arg2 == arg4 && arg7 == arg9 && arg1 == arg8) {
            class91.method704(-120, arg7, arg4, arg8, arg3, arg5);
        } else {
            int var10 = arg3;
            int var11 = arg4;
            int var12 = arg3 * 3;
            int var13 = arg4 * 3;
            int var14 = arg6 * 3;
            int var15 = arg2 * 3;
            int var16 = arg9 * 3;
            int var17 = arg1 * 3;
            int var18 = arg7 + var14 - arg3 - var16;
            int var19 = var15 + arg8 - var17 - arg4;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var26 = var24 * var24 >> 12;
                int var27 = var24 * var26 >> 12;
                int var28 = var18 * var27;
                int var29 = var19 * var27;
                int var30 = var20 * var26;
                int var31 = var21 * var26;
                int var32 = var22 * var24;
                int var33 = var23 * var24;
                int var34 = (var28 + var32 + var30 >> 12) + arg3;
                int var35 = (var29 - (-var31 - var33) >> 12) + arg4;
                class91.method704(48, var34, var11, var35, var10, arg5);
                var11 = var35;
                var10 = var34;
            }
        }
        int var25 = -35 / ((53 - arg0) / 46);
        field2888++;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IILmq;I)V")
    public static final void method1360(int arg0, int arg1, class350 arg2, int arg3) {
        class528.field7795 = arg2;
        class217.field3124 = arg3;
        if (arg1 != 3) {
            field2894 = null;
        }
        field2891++;
        class390.field5912 = arg0;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIZILli;I)Ljava/awt/Frame;")
    public static final Frame method1361(int arg0, int arg1, boolean arg2, int arg3, class293 arg4, int arg5) {
        field2892++;
        if (!arg4.method1855(false)) {
            return null;
        }
        if (arg3 == 0) {
            class524[] var6 = class55.method482((byte) 121, arg4);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field7774 == arg5 && var6[var8].field7770 == arg1 && (arg0 == 0 || var6[var8].field7769 == arg0) && (!var7 || arg3 < var6[var8].field7773)) {
                    arg3 = var6[var8].field7773;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class324 var9 = arg4.method1848(arg5, 12, arg0, arg3, arg1);
        if (!arg2) {
            return null;
        }
        while (var9.field4940 == 0) {
            class71.method583(10L, -94);
        }
        Frame var10 = (Frame) var9.field4939;
        if (var10 == null) {
            return null;
        } else if (var9.field4940 == 2) {
            class283.method1804(arg4, 100, var10);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)Lfv;")
    public abstract class77 method1362(boolean arg0);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)[B")
    public abstract byte[] method1363(int arg0, byte arg1);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZI)Z")
    public static final boolean method1364(int arg0, boolean arg1, int arg2) {
        field2890++;
        if (arg1) {
            return false;
        } else {
            return (arg2 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)V")
    public abstract void method1365(int arg0, int arg1);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)I")
    public abstract int method1366(byte arg0, int arg1);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static void method1367(int arg0) {
        field2893 = null;
        field2895 = null;
        field2894 = null;
        if (arg0 < 46) {
            method1364(-63, true, 22);
        }
    }

    static {
        new class342("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
    }
}
