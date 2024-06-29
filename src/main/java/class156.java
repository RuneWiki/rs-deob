import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class156 extends class429 {

    @OriginalMember(owner = "client!nl", name = "R", descriptor = "Lec;")
    public static class40 field1864 = new class40("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!nl", name = "T", descriptor = "Lpn;")
    public static class72 field1866;

    @OriginalMember(owner = "client!nl", name = "G", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!nl", name = "Q", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!nl", name = "S", descriptor = "[I")
    public static int[] field1865;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method751(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 == arg6 && arg3 == arg7 && arg0 == arg4 && arg5 == arg8) {
            class335.method2032(-1, arg0, arg8, arg9, arg6, arg3);
        } else {
            int var10 = arg6;
            int var11 = arg3;
            int var12 = arg6 * 3;
            int var13 = arg3 * 3;
            int var14 = arg1 * 3;
            int var15 = arg7 * 3;
            int var16 = arg4 * 3;
            int var17 = arg5 * 3;
            int var18 = arg0 + var14 - (var16 - -arg6);
            int var19 = arg8 - var17 - (-var15 + arg3);
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var13 + var17 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg6;
                int var34 = (var28 + var30 + var32 >> 12) + arg3;
                class335.method2032(-1, var33, var34, arg9, var10, var11);
                var11 = var34;
                var10 = var33;
            }
        }
        field1863++;
        if (arg2 != 3) {
            method752(112);
        }
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)Z")
    public static final boolean method752(int arg0) {
        field1862++;
        if (class220.field3076) {
            try {
                class336.method2038(class42.field512.field5106, -127, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        return arg0 != 2707;
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)V")
    public static void method753(int arg0) {
        field1865 = null;
        field1864 = null;
        field1866 = null;
        if (arg0 > -37) {
            method751(-40, 53, 88, 76, -29, 115, -89, -88, 75, -26);
        }
    }

    static {
        new class40((String) null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", (String) null, (String) null);
        field1866 = new class72(25, -1);
    }
}
