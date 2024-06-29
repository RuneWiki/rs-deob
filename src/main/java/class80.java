import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class80 {

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "Lbt;")
    private class33 field1298;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "J")
    public long field1301;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "Lqt;")
    public static class459 field1297 = new class459(13, 3);

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "Lqt;")
    public static class459 field1304 = new class459(67, 1);

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "Lqv;")
    public static class316 field1306 = new class316(63, -1);

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "[I")
    public static int[] field1308 = new int[1000];

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "Ltf;")
    public static class198 field1302;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "Lci;")
    public static class320 field1307;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V")
    public static void method610(boolean arg0) {
        field1307 = null;
        field1308 = null;
        field1297 = null;
        field1306 = null;
        field1302 = null;
        if (arg0) {
            field1304 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IBC)C")
    public static final char method611(int arg0, byte arg1, char arg2) {
        field1300++;
        if (arg2 >= 'À' && arg2 <= 'ÿ') {
            if (arg2 >= 'À' && arg2 <= 'Æ') {
                return 'A';
            }
            if (arg2 == 'Ç') {
                return 'C';
            }
            if (arg2 >= 'È' && arg2 <= 'Ë') {
                return 'E';
            }
            if (arg2 >= 'Ì' && arg2 <= 'Ï') {
                return 'I';
            }
            if (arg2 == 'Ñ' && arg0 != 0) {
                return 'N';
            }
            if (arg2 >= 'Ò' && arg2 <= 'Ö') {
                return 'O';
            }
            if (arg2 >= 'Ù' && arg2 <= 'Ü') {
                return 'U';
            }
            if (arg2 == 'Ý') {
                return 'Y';
            }
            if (arg2 == 'ß') {
                return 's';
            }
            if (arg2 >= 'à' && arg2 <= 'æ') {
                return 'a';
            }
            if (arg2 == 'ç') {
                return 'c';
            }
            if (arg2 >= 'è' && arg2 <= 'ë') {
                return 'e';
            }
            if (arg2 >= 'ì' && arg2 <= 'ï') {
                return 'i';
            }
            if (arg2 == 'ñ' && arg0 != 0) {
                return 'n';
            }
            if (arg2 >= 'ò' && arg2 <= 'ö') {
                return 'o';
            }
            if (arg2 >= 'ù' && arg2 <= 'ü') {
                return 'u';
            }
            if (arg2 == 'ý' || arg2 == 'ÿ') {
                return 'y';
            }
        }
        if (arg2 == 'Œ') {
            return 'O';
        } else if (arg2 == 'œ') {
            return 'o';
        } else if (arg2 == 'Ÿ') {
            return 'Y';
        } else {
            if (arg1 != 121) {
                method610(false);
            }
            return arg2;
        }
    }

    @OriginalMember(owner = "client!ej", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field1303++;
        this.field1298.method248((byte) -3, this.field1301);
        super.finalize();
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lbt;J[Lbn;)V")
    public class80(class33 arg0, long arg1, class314[] arg2) {
        this.field1298 = arg0;
        this.field1301 = arg1;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BI)Z")
    public static final boolean method612(byte arg0, int arg1) {
        if (arg0 >= -41) {
            field1308 = null;
        }
        class114.field1700 = arg1 + 1 & 0xFFFF;
        class440.field6260 = true;
        field1299++;
        return true;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
    public static final void method613(int arg0) {
        field1305++;
        int var1 = class511.field7430.length;
        if (arg0 <= 10) {
            method612((byte) -84, 34);
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class511.field7430[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class191.field2786; var4++) {
                    if (class475.field6929[var2] == class431.field6191[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class431.field6191[class191.field2786] = class475.field6929[var2];
                    var3 = class191.field2786++;
                }
                class519 var5 = new class519(class511.field7430[var2]);
                int var6 = 0;
                while (class511.field7430[var2].length > var5.field7558 && var6 < 511 && class477.field6952 < 1023) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method3018(566990904);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class475.field6929[var2] >> 8) * 64 + (var10 - class82.field1315);
                    int var13 = (class475.field6929[var2] & 0xFF) * 64 + var11 - class501.field7240;
                    class311 var14 = class117.field1812.method2310(-1, var5.method3018(566990904));
                    class193 var15 = (class193) class390.field5539.method2284(true, (long) var7);
                    if (var15 == null && (var14.field4618 & 0x1) > 0 && class10.field95 == var9 && var12 >= 0 && (var14.field4620 + var12) < class69.field1139 && var13 >= 0 && class255.field3763 > (var14.field4620 + var13)) {
                        class279 var16 = new class279();
                        var16.field290 = var7;
                        class193 var17 = new class193(var16);
                        class390.field5539.method2292((long) var7, var17, (byte) -128);
                        class221.field3375[class329.field4838++] = var17;
                        class483.field7012[class477.field6952++] = var7;
                        var16.field237 = class24.field349;
                        var16.method1793(var14, -113);
                        var16.method137((byte) 87, var16.field4157.field4620);
                        var16.field305 = var16.field4157.field4604 << 3;
                        var16.method130((byte) 31, var16.field4157.field4581 + 4 << 11 & 0x3D1D, true);
                        var16.method1795(var16.method135((byte) 72), true, (byte) 126, var12, var9, var13);
                    }
                }
            }
        }
    }
}
