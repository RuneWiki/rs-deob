import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class440 {

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "Lh;")
    public static class572 field5873 = new class572("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
    public static int field5875;

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "I")
    public static int field5879;

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "J")
    public static long field5877;

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "Lre;")
    public static class517 field5876;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V")
    public static void method2557(int arg0) {
        field5873 = null;
        if (arg0 == -2888) {
            field5876 = null;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lvp;ILpa;ILha;III)V")
    public static final void method2558(class162 arg0, int arg1, class311 arg2, int arg3, class53 arg4, int arg5, int arg6, int arg7) {
        field5875++;
        if (arg4 == null || arg5 != 11643) {
            return;
        }
        int var8;
        if (class531.field7929 == 4) {
            var8 = (int) class539.field8023 & 0x3FFF;
        } else {
            var8 = (int) class539.field8023 + class300.field4113 & 0x3FFF;
        }
        int var9 = Math.max(arg0.field2527 / 2, arg0.field2459 / 2) + 10;
        int var10 = arg1 * arg1 + (arg6 * arg6);
        if (var9 * var9 < var10) {
            return;
        }
        int var11 = class589.field8742[var8];
        int var12 = class589.field8735[var8];
        if (class531.field7929 != 4) {
            var12 = var12 * 256 / (class449.field6301 + 256);
            var11 = var11 * 256 / (class449.field6301 + 256);
        }
        int var13 = arg6 * var11 + (arg1 * var12) >> 15;
        int var14 = arg6 * var12 - (arg1 * var11) >> 15;
        arg4.method323(arg7 + (arg0.field2527 / 2) + var13 - (arg4.method326() / 2), -var14 + arg0.field2459 / 2 + arg3 + -(arg4.method322() / 2), arg2, arg7, arg3);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)[Lj;")
    public static final class464[] method2559(byte arg0) {
        if (arg0 != 30) {
            method2558(null, 60, null, 106, null, -43, 91, -2);
        }
        field5874++;
        return new class464[] { class204.field3008, class204.field3010, class204.field3011, class204.field3012, class204.field3013, class204.field3014, class204.field3015, class204.field3016, class204.field3017, class204.field3018, class204.field3019, class204.field3020, class204.field3021, class204.field3022 };
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)Lsm;")
    public static final class238 method2560(int arg0, int arg1, int arg2) {
        class205 var3 = class420.field5697[arg0][arg1][arg2];
        return var3 == null || var3.field3045 == null ? null : var3.field3045;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lie;")
    public static final class6 method2561(Canvas arg0, byte arg1) {
        if (arg1 >= -122) {
            return null;
        }
        field5872++;
        try {
            Class var2 = Class.forName("hv");
            class6 var3 = (class6) var2.getDeclaredConstructor().newInstance();
            var3.method19(arg0, 7);
            return var3;
        } catch (Throwable var5) {
            class602 var4 = new class602();
            var4.method19(arg0, 7);
            return var4;
        }
    }
}
