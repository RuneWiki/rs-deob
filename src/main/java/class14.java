import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class14 {

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "Llt;")
    public static class475 field180 = new class475("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "Lhc;")
    public static class93 field176;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "[Z")
    public static boolean[] field181;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)I", line = 5)
    public static final int method89(boolean arg0) {
        if (arg0) {
            method89(true);
        }
        field178++;
        if (class82.field1255 == null) {
            return class306.field4402 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V", line = 19)
    public static void method90(int arg0) {
        if (arg0 <= -80) {
            field176 = null;
            field181 = null;
            field180 = null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BI)V", line = 32)
    public static final void method91(byte arg0, int arg1) {
        class8.method50((byte) 118);
        field177++;
        class133.method890((byte) -3);
        class88.method513(-56, true, arg1);
        class517.method3045(class348.field5015, class6.field81, class105.field1522, -20);
        if (arg0 <= 44) {
            return;
        }
        class284.method1840(-96, class6.field81, class348.field5015);
        class116.method773(116, class167.field2476);
        class527.method3114(1999147020);
        class377.method2315(false);
        if (class193.field2832 == 10) {
            class500.method2992(false, false);
        } else if (class193.field2832 == 30) {
            class11.method76(false, 25);
        } else if (class193.field2832 == 5) {
            class437.method2630(-21330, class348.field5015, class6.field81);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)Z", line = 61)
    public static final boolean method92(int arg0, int arg1, int arg2) {
        if (arg2 != 1408) {
            field176 = null;
        }
        field175++;
        return (arg1 & 0x580) != 0;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 81)
    public static final String method93(String arg0, int arg1) {
        field179++;
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        if (arg1 != 3841) {
            return null;
        }
        int var3 = arg0.length();
        while (var2 < var3 && class265.method1761(arg1 - 3969, arg0.charAt(var2))) {
            var2++;
        }
        while (var2 < var3 && class265.method1761(-128, arg0.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg0.charAt(var6);
            if (class61.method361(arg1 ^ 0xF05, var7)) {
                char var8 = class436.method2619(var7, 105);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(III)Z", line = 146)
    public static final boolean method94(int arg0, int arg1, int arg2) {
        field174++;
        if (arg0 != 0) {
            method89(true);
        }
        return (arg1 & 0x20) != 0;
    }
}
