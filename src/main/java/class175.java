import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class175 {

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "Lml;")
    public static class325 field2509 = new class325(5, 7);

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "J")
    public static volatile long field2513 = 0L;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "[I")
    public static int[] field2514;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "Lha;")
    public static class52 field2512;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
    public static final void method1112(int arg0) {
        field2510++;
        class575.field7922.method465(true);
        for (class442 var1 = (class442) class448.field6352.method456((byte) -89); var1 != null; var1 = (class442) class448.field6352.method460((byte) 66)) {
            if (var1.field6298 < 1000) {
                var1.method1117(0);
                class575.field7922.method463(var1, -128);
            }
        }
        class575.field7922.method461(class448.field6352, arg0 ^ 0xFFFFFF9A);
        if (class210.field2958 <= 1) {
            class401.field5717 = null;
        } else if (class304.field4149 && class316.field4245.method2691(81, 19521) && class210.field2958 > 2) {
            class401.field5717 = (class442) class448.field6352.field892.field2519.field2519;
        } else {
            class401.field5717 = (class442) class448.field6352.field892.field2519;
        }
        int var2 = arg0;
        class32 var3 = (class32) class623.field8998.method456((byte) -92);
        if (var3 != null) {
            var2 = var3.method323(false);
        }
        if (!class483.field6820) {
            if (var2 == 0 && (class384.field5143 == 1 && class210.field2958 > 2 || class553.method3138((byte) 125))) {
                var2 = 2;
            }
            if (var2 == 2 && class210.field2958 > 0 && var3 != null) {
                if (class137.field2159 == null && class557.field7711 == 0) {
                    class86.method645(var3.method324(-5), var3.method328((byte) -103), 16);
                } else {
                    class147.field2265 = 2;
                }
            }
            if (var2 == 0 && class210.field2958 > 0) {
                class501.method2903((byte) 41);
            }
            if (class137.field2159 != null || class557.field7711 != 0) {
                return;
            }
            class296.field4056 = null;
            class147.field2265 = 0;
            return;
        }
        if (var2 == -1) {
            int var4 = class602.field8697.method2153((byte) -45);
            int var5 = class602.field8697.method2152(~arg0);
            if (class166.field2389 - 10 > var4 || var4 > (class166.field2389 + class228.field3256 + 10) || var5 < (class467.field6582 - 10) || var5 > (class467.field6582 + class28.field477 + 10)) {
                class300.method1907(arg0 + 256);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var6 = class166.field2389;
        int var7 = class467.field6582;
        int var8 = class228.field3256;
        int var9 = var3.method328((byte) -108);
        int var10 = var3.method324(arg0 ^ 0x4);
        int var11 = -1;
        for (int var12 = 0; var12 < class210.field2958; var12++) {
            if (class379.field5098) {
                int var17 = (class210.field2958 - var12 - 1) * 16 + var7 + 33;
                if (var6 < var9 && var9 < var6 + var8 && var10 > (var17 - 13) && var10 < var17 + 4) {
                    var11 = var12;
                }
            } else {
                int var16 = (class210.field2958 - var12 - 1) * 16 + var7 + 31;
                if (var6 < var9 && var9 < (var6 + var8) && var10 > var16 - 13 && var10 < var16 + 3) {
                    var11 = var12;
                }
            }
        }
        if (var11 != -1) {
            int var13 = 0;
            class591 var14 = new class591(class448.field6352);
            for (class442 var15 = (class442) var14.method3464(-112); var15 != null; var15 = (class442) var14.method3466((byte) 53)) {
                if (var11 == var13) {
                    class402.method2403((byte) 60, var9, var10, var15);
                }
                var13++;
            }
        }
        class300.method1907(255);
        return;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIZ)I")
    public static final int method1113(int arg0, int arg1, boolean arg2) {
        field2511++;
        int var3 = 0;
        if (arg2) {
            field2513 = 72L;
        }
        while (arg0 > 0) {
            var3 = arg1 & 0x1 | var3 << 1;
            arg1 >>>= 0x1;
            arg0--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
    public static void method1114(byte arg0) {
        field2509 = null;
        field2514 = null;
        field2512 = null;
        int var1 = -25 % ((arg0 - 32) / 39);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lhh;I)V")
    public static final void method1115(class109 arg0, int arg1) {
        field2508++;
        if (arg1 != -13) {
            return;
        }
        for (class421 var2 = (class421) class495.field6924.method456((byte) -97); var2 != null; var2 = (class421) class495.field6924.method460((byte) 80)) {
            if (var2.field5920 == arg0) {
                if (var2.field5904 != null) {
                    class204.field2869.method2731(var2.field5904);
                    var2.field5904 = null;
                }
                var2.method1117(0);
                return;
            }
        }
    }

    static {
        new class104("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
        field2514 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };
    }
}
