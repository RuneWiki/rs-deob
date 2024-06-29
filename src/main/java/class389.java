import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class389 {

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "Lui;")
    public static class375 field5900 = new class375("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "Lui;")
    public static class375 field5902 = new class375("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "I")
    public static int field5905 = 0;

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "I")
    public static int field5907 = 52;

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "Lsi;")
    public static class512 field5906 = new class512(9, 4);

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
    public static int field5903;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "I")
    public static int field5904;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V")
    public static void method2399(int arg0) {
        if (arg0 != 0) {
            method2402(23);
        }
        field5900 = null;
        field5906 = null;
        field5902 = null;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)Z")
    public static final boolean method2400(int arg0, int arg1, int arg2) {
        field5904++;
        int var3 = -38 % ((69 - arg1) / 39);
        if (!class455.field6680) {
            return false;
        }
        int var4 = arg2 >> 16;
        int var5 = arg2 & 0xFFFF;
        if (class59.field791[var4] == null || class59.field791[var4][var5] == null) {
            return false;
        }
        class499 var6 = class59.field791[var4][var5];
        if (arg0 == -1 && var6.field7355 == 0) {
            for (class32 var7 = (class32) class96.field1395.method1970(64); var7 != null; var7 = (class32) class96.field1395.method1960(24)) {
                if (var7.field485 == 9 || var7.field485 == 1008 || var7.field485 == 46 || var7.field485 == 2 || var7.field485 == 45) {
                    for (class499 var8 = class211.method1457(var7.field484, 6687); var8 != null; var8 = class270.method1724(var8, 325644272)) {
                        if (var6.field7312 == var8.field7312) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class32 var9 = (class32) class96.field1395.method1970(64); var9 != null; var9 = (class32) class96.field1395.method1960(24)) {
                if (var9.field488 == arg0 && var6.field7312 == var9.field484 && (var9.field485 == 9 || var9.field485 == 1008 || var9.field485 == 46 || var9.field485 == 2 || var9.field485 == 45)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIBI)V")
    public static final void method2401(int arg0, int arg1, byte arg2, int arg3) {
        class75.field1006.method615(28010, arg1);
        field5903++;
        class75.field1006.method589(arg3, false);
        if (arg2 <= 12) {
            method2401(123, -126, (byte) -3, 40);
        }
        class75.field1006.method589(arg0, false);
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)V")
    public static final void method2402(int arg0) {
        field5901++;
        class25 var1 = (class25) class443.field6601.method1970(64);
        if (arg0 != 0) {
            field5907 = -98;
        }
        while (var1 != null) {
            class384 var2 = var1.field405;
            if (var2.field5863) {
                var1.method2785((byte) -120);
                var2.method2380(true);
            } else if (class405.field6116 >= var2.field5860) {
                var2.method2378(class501.field7485, (byte) -106);
                if (var2.field5863) {
                    var1.method2785((byte) -120);
                } else {
                    class223.method1511(var2, true);
                }
            }
            var1 = (class25) class443.field6601.method1960(24);
        }
    }
}
