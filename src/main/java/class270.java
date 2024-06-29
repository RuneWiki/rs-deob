import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class270 extends class276 {

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "Llo;")
    public static class306 field4490 = new class306("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "J")
    public long field4496;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "Lwc;")
    public class270 field4489;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "Lwc;")
    public class270 field4493;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field4495;

    static {
        new class306("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V", line = 3)
    public final void method1799(byte arg0) {
        field4487++;
        if (this.field4489 == null) {
            return;
        }
        this.field4489.field4493 = this.field4493;
        this.field4493.field4489 = this.field4489;
        this.field4489 = null;
        int var2 = 16 / ((35 - arg0) / 50);
        this.field4493 = null;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)I", line = 25)
    public static final int method1800(int arg0, int arg1) {
        field4491++;
        if (arg0 != -7085) {
            field4492 = -18;
        }
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(B)V", line = 36)
    public static void method1801(byte arg0) {
        field4490 = null;
        field4495 = null;
        if (arg0 != -12) {
            method1801((byte) -85);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IBI)Z", line = 49)
    public static final boolean method1802(int arg0, byte arg1, int arg2) {
        int var3 = 8 % (arg1 / 40);
        field4486++;
        return (arg0 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)Z", line = 59)
    public final boolean method1803(int arg0) {
        field4488++;
        if (arg0 >= -54) {
            method1804(41, -71, 111, 59, 7, -48);
        }
        return this.field4489 != null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIII)V", line = 81)
    public static final void method1804(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4494++;
        int var6 = 0;
        int var7 = arg1;
        int var8 = arg0 * arg0;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg1 << 1;
        int var13 = (arg4 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg1 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg1 - 1) * var15;
        class357.method2291(arg3 - arg0, arg2, class209.field3294[arg5], arg0 + arg3, -1);
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var17 += var16;
                    var6++;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var17 += var16;
                var19 += var16;
                var6++;
            }
            var13 += -var20;
            var14 += -var18;
            var18 -= var15;
            var20 -= var15;
            var7--;
            int var21 = arg5 - var7;
            int var22 = arg5 + var7;
            int var23 = arg3 + var6;
            int var24 = arg3 - var6;
            class357.method2291(var24, arg2, class209.field3294[var21], var23, -1);
            class357.method2291(var24, arg2, class209.field3294[var22], var23, -1);
        }
    }
}
