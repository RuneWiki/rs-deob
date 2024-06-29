import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class228 extends class219 {

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
    public static volatile int field3794 = -1;

    @OriginalMember(owner = "client!ed", name = "R", descriptor = "Lbd;")
    public static class162 field3799 = class17.method142(0, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!ed", name = "N", descriptor = "[Z")
    public static boolean[] field3795 = new boolean[5];

    @OriginalMember(owner = "client!ed", name = "T", descriptor = "Lbd;")
    public static class162 field3801 = class17.method142(0, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!ed", name = "S", descriptor = "I")
    public static int field3800 = 0;

    @OriginalMember(owner = "client!ed", name = "Q", descriptor = "Lbd;")
    public static class162 field3798 = class17.method142(0, "event_opbase");

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!ed", name = "O", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!ed", name = "P", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!ed", name = "U", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!ed", name = "K", descriptor = "[I")
    public static int[] field3792;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(III)Z", line = 10)
    public static final boolean method1631(int arg0, int arg1, int arg2) {
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg1 != 4) {
            return false;
        }
        field3797++;
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        class311 var3 = class229.method1637(arg0, (byte) 93);
        return var3.method2099(arg2, 108);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZB)V", line = 36)
    public static final void method1632(boolean arg0, byte arg1) {
        field3802++;
        if (arg1 != -101) {
            method1631(52, 44, 82);
        }
        byte[][] var2;
        byte var3;
        if (class117.field2159 && arg0) {
            var2 = class280.field4730;
            var3 = 1;
        } else {
            var3 = 4;
            var2 = class147.field2654;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class58.method401((byte) 62);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    boolean var7 = false;
                    int var8 = class47.field756[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = (var8 & 0x3D5BC2F) >> 24;
                        if (!arg0 || var9 == 0) {
                            int var10 = (var8 & 0x7) >> 1;
                            int var11 = var8 >> 14 & 0x3FF;
                            int var12 = var8 >> 3 & 0x7FF;
                            int var13 = (var11 / 8 << 8) + (var12 / 8);
                            for (int var14 = 0; var14 < class123.field2230.length; var14++) {
                                if (class123.field2230[var14] == var13 && var2[var14] != null) {
                                    class122.method988(var4, var2[var14], (byte) 37, (var11 & 0x7) * 8, (var12 & 0x7) * 8, var6 * 8, var10, class267.field4473, var9, arg0, var5 * 8);
                                    var7 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class19.method175(9179409, 8, 8, var4, var5 * 8, var6 * 8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIBIII)V", line = 134)
    public static final void method1633(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field3796++;
        if (arg4 <= 81) {
            method1634(50);
        }
        if (arg5 == arg6) {
            class135.method1064(arg5, arg1, arg0, (byte) 123, arg7, arg3, arg2);
        } else if ((arg2 - arg5) >= class112.field2028 && class82.field1426 >= (arg2 + arg5) && arg1 - arg6 >= class303.field5106 && class298.field4989 >= arg1 + arg6) {
            class199.method1484(arg6, (byte) 96, arg7, arg2, arg3, arg0, arg1, arg5);
        } else {
            class30.method247(arg5, arg1, arg0, arg7, arg3, (byte) -89, arg2, arg6);
        }
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V", line = 161)
    public static void method1634(int arg0) {
        field3792 = null;
        field3795 = null;
        field3801 = null;
        if (arg0 != 3) {
            method1631(-49, 0, -72);
        }
        field3798 = null;
        field3799 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZI)[I", line = 178)
    public final int[] method41(boolean arg0, int arg1) {
        int[] var3 = this.field3654.method2032(3, arg1);
        if (this.field3654.field4967) {
            int[][] var4 = this.method1583(arg1, true, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class128.field2326; var8++) {
                var3[var8] = (var6[var8] - (-var5[var8] - var7[var8])) / 3;
            }
        }
        if (!arg0) {
            field3799 = (class162) null;
        }
        field3793++;
        return var3;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V", line = 237)
    public class228() {
        super(1, true);
    }
}
