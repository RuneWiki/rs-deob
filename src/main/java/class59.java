import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class59 {

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field1097 = 0;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field1098 = 0;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "[Llj;")
    public static class130[] field1107 = new class130[500];

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "Ldj;")
    public static class44 field1099 = class89.method650(255, "rot:");

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "Ldj;")
    public static class44 field1110 = class89.method650(255, "<col=00ffff>");

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "Ldj;")
    public static class44 field1105 = class89.method650(255, "; Expires=");

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "Z")
    public static boolean field1111 = false;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "Ldj;")
    public static class44 field1101 = class89.method650(255, "Begeben Sie sich in ein freies Gebiet)1 um");

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "Ldj;")
    public static class44 field1103 = class89.method650(255, "Geben Sie Ihren Benutzernamen");

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILrd;)V")
    public static final void method445(int arg0, class185 arg1) {
        if (arg0 != 8) {
            method449(81, true);
        }
        if (arg1.field3204 != null) {
            arg1.field3204.field1709 = 0;
        }
        field1109++;
        arg1.field3206 = false;
        for (class185 var2 = arg1.method105(); var2 != null; var2 = arg1.method107()) {
            method445(8, var2);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIB)V")
    public static final void method446(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class2.field38 = class168.field2896 * arg3 / arg0;
        class3.field46 = class214.field3851 * arg1 / arg2;
        if (arg4 != -65) {
            method447((byte) -64, null);
        }
        class54.field994 = -1;
        field1102++;
        class77.field1495 = -1;
        class157.method1033((byte) 14);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLvc;)Lvc;")
    public static final class223 method447(byte arg0, class223 arg1) {
        field1104++;
        int var2 = class103.method757(-10, class117.method821(arg1, 21064));
        if (var2 == 0) {
            return null;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg1 = class213.method1379(arg1.field4170, -10051);
            if (arg1 == null) {
                return null;
            }
        }
        if (arg0 < 73) {
            method450(35);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBJ[I)Ldj;")
    public static final class44 method448(int arg0, byte arg1, long arg2, int[] arg3) {
        if (arg1 < 34) {
            field1101 = null;
        }
        field1106++;
        if (arg0 == 0) {
            class2 var5 = class235.method1531(72, arg3[0]);
            return var5.method18(true, (int) arg2);
        } else if (arg0 == 1) {
            class214 var6 = class192.method1227(-31700, (int) arg2);
            return var6.field3837;
        } else if (arg0 == 5) {
            return class38.method263((byte) 3, arg2).method320(false);
        } else if (arg0 == 6) {
            return class235.method1531(91, arg3[0]).method18(true, (int) arg2);
        } else {
            return class181.method1141(arg2, -23766);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZ)I")
    public static final int method449(int arg0, boolean arg1) {
        field1100++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg1) {
            return 40;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public static void method450(int arg0) {
        if (arg0 > -92) {
            method447((byte) -51, null);
        }
        field1110 = null;
        field1107 = null;
        field1101 = null;
        field1105 = null;
        field1099 = null;
        field1103 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;I)Ldj;")
    public static final class44 method451(String arg0, int arg1) {
        field1096++;
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var2 = arg0.getBytes();
        }
        class44 var3 = new class44();
        var3.field849 = 0;
        var3.field822 = var2;
        for (int var4 = 0; var4 < var2.length; var4++) {
            if (var2[var4] != 0) {
                var2[var3.field849++] = var2[var4];
            }
        }
        if (arg1 < 90) {
            field1105 = null;
        }
        return var3;
    }
}
