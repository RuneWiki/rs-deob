import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class70 {

    @OriginalMember(owner = "client!er", name = "d", descriptor = "B")
    public byte field1403;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "Lgg;")
    public class118 field1401;

    @OriginalMember(owner = "client!er", name = "j", descriptor = "B")
    public byte field1409;

    @OriginalMember(owner = "client!er", name = "f", descriptor = "S")
    public short field1405;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "Lbj;")
    public static class162 field1400 = new class162(29, 8);

    @OriginalMember(owner = "client!er", name = "i", descriptor = "I")
    public static int field1408 = 0;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!er", name = "e", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!er", name = "g", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!er", name = "h", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V", line = 18)
    public static final void method602(byte arg0) {
        class253.method1639(10, -16646);
        field1402++;
        class82.method770(24026);
        System.gc();
        if (arg0 < 60) {
            field1400 = null;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V", line = 32)
    public static void method603(int arg0) {
        field1400 = null;
        if (arg0 >= -87) {
            field1408 = 44;
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(B)V", line = 42)
    public static final void method604(byte arg0) {
        field1406++;
        int[] var1 = new int[class135.field2271.field3879];
        int var2 = 0;
        int var3 = 0;
        if (arg0 > -86) {
            method603(-106);
        }
        while (var3 < class135.field2271.field3879) {
            class12 var5 = class135.field2271.method1636(var3, -102);
            if (var5.field209 >= 0 || var5.field232 >= 0) {
                var1[var2++] = var3;
            }
            var3++;
        }
        class129.field2192 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class129.field2192[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(CB)C", line = 78)
    public static final char method605(char arg0, byte arg1) {
        if (arg1 <= 29) {
            method604((byte) 93);
        }
        field1404++;
        if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
            return '_';
        } else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
            return arg0;
        } else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
            return 'a';
        } else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
            return 'e';
        } else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
            return 'i';
        } else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
            return 'o';
        } else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
            return 'u';
        } else if (arg0 == 'ç' || arg0 == 'Ç') {
            return 'c';
        } else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
            return 'y';
        } else if (arg0 == 'ñ' || arg0 == 'Ñ') {
            return 'n';
        } else if (arg0 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg0);
        }
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lgg;III)V", line = 468)
    public class70(class118 arg0, int arg1, int arg2, int arg3) {
        this.field1403 = (byte) arg3;
        this.field1401 = arg0;
        this.field1409 = (byte) arg2;
        this.field1405 = (short) arg1;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lms;II)V", line = 482)
    public static final void method606(class535 arg0, int arg1, int arg2) {
        field1407++;
        int var3 = -1;
        int var4 = 0;
        if (class62.field1268 < arg0.field7856) {
            class339.method2128(arg0, (byte) -121);
        } else if (arg0.field7827 < class62.field1268) {
            class145.method1076(arg0, -128, false);
            var4 = class166.field2688;
            var3 = class183.field2946;
        } else {
            class119.method962(arg0, arg2 ^ 0xBDF0D7A4);
        }
        if (arg0.field6073 < 128 || arg0.field6078 < 128 || (class339.field5099 * 128 - 128) <= arg0.field6073 || (class484.field7129 * 128 - 128) <= arg0.field6078) {
            arg0.field7843 = -1;
            var4 = 0;
            arg0.field7836 = -1;
            arg0.field7768 = -1;
            arg0.field7827 = 0;
            var3 = -1;
            arg0.field7856 = 0;
            arg0.field6073 = arg0.field7866[0] * 128 + (arg0.method2241(-19) * 64);
            arg0.field6078 = arg0.field7870[0] * 128 + (arg0.method2241(arg2 ^ 0xA7) * 64);
            arg0.method3160(arg2 + 212);
        }
        if (class15.field266 == arg0 && (arg0.field6073 < 1536 || arg0.field6078 < 1536 || ((class339.field5099 - 12) * 128) <= arg0.field6073 || ((class484.field7129 - 12) * 128) <= arg0.field6078)) {
            arg0.field7768 = -1;
            var4 = 0;
            arg0.field7827 = 0;
            var3 = -1;
            arg0.field7836 = -1;
            arg0.field7843 = -1;
            arg0.field7856 = 0;
            arg0.field6073 = arg0.field7866[0] * 128 + arg0.method2241(-103) * 64;
            arg0.field6078 = arg0.field7870[0] * 128 + (arg0.method2241(arg2 + 101) * 64);
            arg0.method3160(0);
        }
        if (arg2 != -212) {
            field1400 = null;
        }
        int var5 = class493.method2975(true, arg0);
        class124.method988(arg2 ^ 0x25F, var3, var4, arg0, var5);
        class311.method1983(arg0, -99);
    }
}
