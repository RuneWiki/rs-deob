import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class508 {

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "[I")
    public static int[] field7745 = new int[32];

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "I")
    public static int field7743;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
    public static int field7746;

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "I")
    public static int field7747;

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "I")
    public static int field7748;

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "I")
    public static int field7749;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "Lwk;")
    public static class90 field7744;

    static {
        new class194("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)V", line = 4)
    public static void method3057(byte arg0) {
        field7745 = null;
        field7744 = null;
        if (arg0 != 7) {
            method3058(-26, null, -1, -84);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILts;II)V", line = 16)
    public static final void method3058(int arg0, class356 arg1, int arg2, int arg3) {
        field7748++;
        if (class164.field2146 != null || class174.field2387 || arg1 == null || class15.method112(arg1, -29354) == null) {
            return;
        }
        class164.field2146 = arg1;
        class65.field965 = class15.method112(arg1, -29354);
        class327.field4766 = 0;
        class389.field5776 = arg0;
        class89.field1214 = false;
        if (arg3 <= -58) {
            class117.field1518 = arg2;
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(B)Lqs;", line = 41)
    public static final class410 method3059(byte arg0) {
        field7749++;
        if (arg0 != 86) {
            return null;
        } else if (class249.field3582 == null || class282.field4025 == null) {
            return null;
        } else {
            for (class410 var1 = (class410) class282.field4025.method1321(-7499); var1 != null; var1 = (class410) class282.field4025.method1321(-7499)) {
                class170 var2 = class249.field3573.method282(var1.field6017, 53);
                if (var2 != null && var2.field2256 && var2.method1076(0, class249.field3571)) {
                    return var1;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIBI)V", line = 73)
    public static final void method3060(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 == -73) {
            field7747++;
            String var4 = "tele " + arg3 + "," + (arg1 >> 6) + "," + (arg0 >> 6) + "," + (arg1 & 0x3F) + "," + (arg0 & 0x3F);
            System.out.println(var4);
            class400.method2384(8308, true, var4);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIII)V", line = 95)
    public static final void method3061(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class118.field1533.field6912 != 0 && arg1 != 0 && class124.field1611 < 50 && arg4 != -1) {
            class415.field6150[class124.field1611++] = new class147((byte) 1, arg4, arg1, arg3, arg0, 0);
        }
        field7743++;
        if (arg2 >= -64) {
            field7746 = 113;
        }
    }
}
