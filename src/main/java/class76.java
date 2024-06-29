import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class76 extends OutputStream {

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "Lip;")
    public static class508 field1106 = new class508("", 12);

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "[B")
    public static byte[] field1111;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "Lla;")
    public static class319 field1110;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BIILkv;II)V")
    public static final void method531(byte arg0, int arg1, int arg2, class179 arg3, int arg4, int arg5) {
        field1108++;
        if (arg0 != -103 || arg3.field2401 == -1 && arg3.field2387 == null) {
            return;
        }
        int var6 = 0;
        int var7 = class203.field2716.field1183 * arg3.field2405 >> 8;
        if (arg3.field2404 < arg2) {
            var6 += arg2 - arg3.field2404;
        } else if (arg2 < arg3.field2394) {
            var6 += arg3.field2394 - arg2;
        }
        if (arg1 > arg3.field2403) {
            var6 += arg1 - arg3.field2403;
        } else if (arg3.field2392 > arg1) {
            var6 += arg3.field2392 - arg1;
        }
        if (arg3.field2384 == 0 || (var6 - 64) > arg3.field2384 || class203.field2716.field1183 == 0 || arg3.field2406 != arg4) {
            if (arg3.field2400 != null) {
                class31.field463.method883(arg3.field2400);
                arg3.field2400 = null;
            }
            if (arg3.field2391 != null) {
                class31.field463.method883(arg3.field2391);
                arg3.field2391 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg3.field2384 - var6) * var7 / arg3.field2384;
        if (arg3.field2400 != null) {
            arg3.field2400.method2864(var8);
        } else if (arg3.field2401 >= 0) {
            class314 var9 = class314.method1976(class149.field1964, arg3.field2401, 0);
            if (var9 != null) {
                class242 var10 = var9.method1977().method1588(class533.field7840);
                class481 var11 = class481.method2883(var10, 100, var8);
                var11.method2869(-1);
                class31.field463.method879(var11);
                arg3.field2400 = var11;
            }
        }
        if (arg3.field2391 != null) {
            arg3.field2391.method2864(var8);
            if (!arg3.field2391.method24(-25618)) {
                arg3.field2391 = null;
            }
        } else if (arg3.field2387 != null && (arg3.field2385 -= arg5) <= 0) {
            int var12 = (int) (Math.random() * (double) arg3.field2387.length);
            class314 var13 = class314.method1976(class149.field1964, arg3.field2387[var12], 0);
            if (var13 != null) {
                class242 var14 = var13.method1977().method1588(class533.field7840);
                class481 var15 = class481.method2883(var14, 100, var8);
                var15.method2869(0);
                class31.field463.method879(var15);
                arg3.field2391 = var15;
                arg3.field2385 = arg3.field2407 + (int) (Math.random() * (double) (arg3.field2393 - arg3.field2407));
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field1105++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIII)V")
    public static final void method532(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1107++;
        int var5 = -73 / ((arg3 - 80) / 39);
        class177 var6 = class344.method2229(8, arg4, (byte) 86);
        var6.method1191(-110);
        var6.field2372 = arg2;
        var6.field2369 = arg1;
        var6.field2374 = arg0;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
    public static void method533(byte arg0) {
        if (arg0 >= 13) {
            field1106 = null;
            field1111 = null;
            field1110 = null;
        }
    }

    static {
        new class446("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
        field1109 = 0;
        field1111 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
        field1110 = new class319(26, 8);
    }
}
