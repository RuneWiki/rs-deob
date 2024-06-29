import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public abstract class class3 {

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "I")
    public static int field35 = 0;

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "I")
    public static int field36 = 0;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "[I")
    public static int[] field37 = new int[4096];

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "Z")
    public static boolean field40 = false;

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "I")
    public static int field38 = 503;

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
    public static void method18(int arg0) {
        field37 = null;
        if (arg0 != 449) {
            method18(-89);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IB)V")
    public abstract void method19(int arg0, byte arg1);

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)Llf;")
    public abstract class513 method20(byte arg0);

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(II)V")
    public static final void method21(int arg0, int arg1) {
        field41++;
        class314 var2 = class177.method1213(false, 9, arg0);
        if (arg1 == 769521281) {
            var2.method1811((byte) 86);
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(IB)[B")
    public abstract byte[] method22(int arg0, byte arg1);

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIBII)V")
    public static final void method23(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 != -63) {
            method23(-91, -121, -28, (byte) -105, 28, 31);
        }
        field39++;
        int var6 = 0;
        int var7 = arg1;
        int var8 = arg2 * arg2;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg1 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg1 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg1 - 1) * var15;
        if (class23.field320 <= arg0 && class233.field3241 >= arg0) {
            int var21 = class486.method2879((byte) -107, arg4 + arg2, class375.field5387, class519.field7633);
            int var22 = class486.method2879((byte) -97, arg4 - arg2, class375.field5387, class519.field7633);
            class188.method1259(var22, (byte) 27, var21, arg5, class42.field626[arg0]);
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var6++;
                    var17 += var16;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var19 += var16;
                var17 += var16;
                var6++;
            }
            var14 += -var18;
            var13 += -var20;
            var7--;
            var18 -= var15;
            var20 -= var15;
            int var23 = arg0 - var7;
            int var24 = arg0 + var7;
            if (class23.field320 <= var24 && var23 <= class233.field3241) {
                int var25 = class486.method2879((byte) -98, arg4 + var6, class375.field5387, class519.field7633);
                int var26 = class486.method2879((byte) -111, arg4 - var6, class375.field5387, class519.field7633);
                if (var23 >= class23.field320) {
                    class188.method1259(var26, (byte) 27, var25, arg5, class42.field626[var23]);
                }
                if (var24 <= class233.field3241) {
                    class188.method1259(var26, (byte) 27, var25, arg5, class42.field626[var24]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(II)I")
    public abstract int method24(int arg0, int arg1);

    static {
        new class157("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
    }
}
