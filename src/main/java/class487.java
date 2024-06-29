import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class487 {

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "Z")
    public static boolean field6893 = false;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field6891;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field6892;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field6894;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field6895;

    static {
        new class151("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BII)V", line = 4)
    public static final void method2867(byte arg0, int arg1, int arg2) {
        field6891++;
        int var3 = class402.field5516.method1354((byte) -65, class462.field6526.method1078(class66.field967, 100));
        if (arg0 != 104) {
            field6893 = true;
        }
        for (class73 var4 = (class73) class6.field38.method775(1); var4 != null; var4 = (class73) class6.field38.method763(arg0 - 104)) {
            int var8 = class490.method2873((byte) 37, var4);
            if (var3 < var8) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class303.field4310 * 16 + 21;
        int var6 = arg1 - (var3 / 2);
        if ((var3 + var6) > class364.field5007) {
            var6 = class364.field5007 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg2;
        if (class431.field6099 < var5 + arg2) {
            var7 = class431.field6099 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        class104.field1469 = var6;
        class167.field2424 = var7;
        class433.field6135 = (class128.field1746 ? 26 : 22) + class303.field4310 * 16;
        class315.field4455 = var3;
        class205.field3005 = true;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)S", line = 58)
    public static final short method2868(int arg0, int arg1) {
        field6892++;
        int var2 = arg1 >> 10 & 0x3F;
        int var3 = (arg1 & 0x380) >> 3;
        int var4 = arg1 & 0x7F;
        int var5 = var4 > 64 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        int var9 = -20 / ((arg0 + 11) / 50);
        return (short) (var6 | var7 >> 4 << 7 | var2 << 10);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V", line = 88)
    public static final void method2869(int arg0) {
        class350.field4832 = arg0;
        for (int var1 = 0; var1 < class310.field4401; var1++) {
            for (int var2 = 0; var2 < class97.field1374; var2++) {
                if (class385.field5285[arg0][var1][var2] == null) {
                    class385.field5285[arg0][var1][var2] = new class52(arg0, var1, var2);
                }
            }
        }
    }
}
