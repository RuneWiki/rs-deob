import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class176 extends class498 {

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "Lam;")
    public class455 field2531 = new class455();

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "[I")
    public static int[] field2530 = new int[5];

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "J")
    public static long field2532 = -1L;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "Lla;")
    public static class319 field2533;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
    public static void method1099(int arg0) {
        if (arg0 != Integer.MAX_VALUE) {
            method1100(-105, -121L, 7, (byte) -55);
        }
        field2533 = null;
        field2530 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IJIB)V")
    public static final void method1100(int arg0, long arg1, int arg2, byte arg3) {
        if (arg3 != 59) {
            return;
        }
        field2529++;
        int var5 = (int) arg1 >> 14 & 0x1F;
        int var6 = ((int) arg1 & 0x3E524C) >> 20;
        int var7 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class110.method754(var5, 0, true, 0, var6, arg0, 0, 69, arg2);
            return;
        }
        class270 var8 = class377.field5338.method1901(50, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var9 = var8.field3937;
            var10 = var8.field4012;
        } else {
            var9 = var8.field4012;
            var10 = var8.field3937;
        }
        int var11 = var8.field3965;
        if (var6 != 0) {
            var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
        }
        class110.method754(0, var9, true, var11, 0, arg0, var10, 112, arg2);
    }

    static {
        new class530("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
    }
}
