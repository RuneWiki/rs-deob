import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class342 {

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
    public static int field5000 = -1;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "Lpn;")
    public static class68 field5002 = new class68();

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "[I")
    public static int[] field5006;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "Lr;")
    public class520 field4999;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "Lk;")
    public class88 field5001;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ldda;Ldda;ILcc;Ldda;)Z")
    public static final boolean method2118(class597 arg0, class597 arg1, int arg2, class427 arg3, class597 arg4) {
        class278.field4132 = arg4;
        if (arg2 != 0) {
            return false;
        }
        class240.field3505 = arg3;
        class580.field8544 = arg0;
        class565.field8375 = arg1;
        field5003++;
        return true;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)I")
    public static int method2119(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lhca;BBII)V")
    public static final void method2120(class179 arg0, byte arg1, byte arg2, int arg3, int arg4) {
        field5005++;
        int var5 = arg0.field1090[0];
        int var6 = arg0.field1089[0];
        if (var5 < 0 || class35.field399 <= var5 || var6 < 0 || var6 >= class382.field5586 || arg4 < 0 || arg4 >= class35.field399 || arg3 < 0 || arg3 >= class382.field5586) {
            return;
        }
        if (arg2 != -28) {
            field5000 = -82;
        }
        int var7 = class124.method747(0, 0, class77.field886, var5, 4, arg0.method514(arg2 ^ 0xFFFFFFE4), arg3, class306.field4462, -4, 0, var6, 0, arg4, class67.field772[arg0.field3457], true);
        if (var7 >= 1 && var7 <= 3) {
            for (int var8 = 0; var8 < (var7 - 1); var8++) {
                arg0.method1199(class77.field886[var8], arg1, arg2 + 30, class306.field4462[var8]);
            }
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Z)V")
    public static void method2121(boolean arg0) {
        field5002 = null;
        field5006 = null;
        if (arg0) {
            method2120(null, (byte) 21, (byte) -95, 91, -2);
        }
    }

    static {
        new class487("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
        field5006 = new int[1];
    }
}
