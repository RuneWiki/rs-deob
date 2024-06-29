import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class426 {

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "Llm;")
    public class246 field6343;

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "B")
    public byte field6348;

    @OriginalMember(owner = "client!ft", name = "l", descriptor = "B")
    public byte field6354;

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "S")
    public short field6344;

    @OriginalMember(owner = "client!ft", name = "i", descriptor = "I")
    public static int field6351 = -1;

    @OriginalMember(owner = "client!ft", name = "j", descriptor = "Z")
    public static volatile boolean field6352 = true;

    @OriginalMember(owner = "client!ft", name = "h", descriptor = "Ldp;")
    public static class347 field6350 = new class347("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

    @OriginalMember(owner = "client!ft", name = "m", descriptor = "Ljo;")
    public static class382 field6355 = new class382(32);

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "I")
    public static int field6346;

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "I")
    public static int field6347;

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "Lok;")
    public static class74 field6349;

    @OriginalMember(owner = "client!ft", name = "k", descriptor = "[Lvo;")
    public static class355[] field6353;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIIIIIIIII)V", line = 9)
    public static final void method2528(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field6345++;
        if (arg4 < 128 || arg9 < 128 || arg4 > ((class50.field640 - 2) * 128) || arg9 > class448.field6611 * 128 - 256) {
            class142.field2140[0] = class142.field2140[1] = -1;
            return;
        }
        if (arg2 >= -46) {
            field6349 = null;
        }
        int var10 = class50.method373(arg7, 14966, arg9, arg4) - arg5;
        class151.field2293.method1309(arg6, 0, 0);
        class407.field6147.method55(class151.field2293);
        class407.field6147.method92(arg4, var10, arg9, class142.field2140);
        class151.field2293.method1309(-arg6, 0, 0);
        class407.field6147.method55(class151.field2293);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V", line = 41)
    public static void method2529(int arg0) {
        field6355 = null;
        field6350 = null;
        field6349 = null;
        if (arg0 != -1) {
            field6351 = 27;
        }
        field6353 = null;
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Llm;III)V", line = 59)
    public class426(class246 arg0, int arg1, int arg2, int arg3) {
        this.field6343 = arg0;
        this.field6348 = (byte) arg3;
        this.field6354 = (byte) arg2;
        this.field6344 = (short) arg1;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lec;BIIII)Ljava/awt/Frame;", line = 73)
    public static final Frame method2530(class109 arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field6346++;
        if (!arg0.method823(true)) {
            return null;
        }
        if (arg1 != -25) {
            field6355 = null;
        }
        if (arg2 == 0) {
            class330[] var6 = class174.method1196(29885, arg0);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field5140 == arg5 && var6[var8].field5137 == arg4 && (arg3 == 0 || var6[var8].field5136 == arg3) && (!var7 || var6[var8].field5143 > arg2)) {
                    var7 = true;
                    arg2 = var6[var8].field5143;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class533 var9 = arg0.method829(arg2, arg4, arg5, arg3, (byte) -124);
        while (var9.field7848 == 0) {
            class389.method2332(63, 10L);
        }
        Frame var10 = (Frame) var9.field7849;
        if (var10 == null) {
            return null;
        } else if (var9.field7848 == 2) {
            class332.method2051(arg0, (byte) -85, var10);
            return null;
        } else {
            return var10;
        }
    }
}
