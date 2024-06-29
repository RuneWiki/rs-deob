import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class92 {

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "J")
    public static long field1408 = 0L;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "J")
    public static long field1410 = 0L;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "[B")
    public static byte[] field1405 = new byte[32896];

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "Lfa;")
    public static class273 field1398;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "[[I")
    public static int[][] field1400;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "[[[B")
    public static byte[][][] field1406;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(CB)Z")
    public static final boolean method598(char arg0, byte arg1) {
        field1407++;
        int var2 = -26 % ((13 - arg1) / 48);
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static void method599(int arg0) {
        field1405 = null;
        if (arg0 != -1) {
            method603(95, '\b');
        }
        field1400 = null;
        field1406 = null;
        field1398 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZI)V")
    public static final void method600(boolean arg0, int arg1) {
        field1403++;
        if (!class144.field2261) {
            arg1 = -1;
        }
        if (class190.field2938 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class192 var2 = class106.method691(arg1, 5);
            class38 var3 = var2.method1328(false);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class259.field4254.method1772(class113.field1701, new Point(var2.field3031, var2.field3044), var3.field4831, var3.field4827, var3.method249(), (byte) 54);
                class190.field2938 = arg1;
            }
        }
        if (arg1 == -1 && class190.field2938 != -1) {
            class259.field4254.method1772(class113.field1701, new Point(), -1, -1, (int[]) null, (byte) 54);
            class190.field2938 = -1;
        }
        if (arg0) {
            method602((byte) 32, '\t');
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
    public static final void method601(byte arg0) {
        class69 var1 = class73.field1080;
        synchronized (class73.field1080) {
            class189.field2903++;
            class296.field4858 = class199.field3161;
            if (arg0 <= 66) {
                method600(false, 122);
            }
            if (class230.field3665 >= 0) {
                while (class230.field3665 != class179.field2777) {
                    int var2 = class36.field457[class179.field2777];
                    class179.field2777 = class179.field2777 + 1 & 0x7F;
                    if (var2 < 0) {
                        class3.field26[~var2] = false;
                    } else {
                        class3.field26[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class3.field26[var3] = false;
                }
                class230.field3665 = class179.field2777;
            }
            class199.field3161 = class152.field2374;
        }
        field1401++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BC)Z")
    public static final boolean method602(byte arg0, char arg1) {
        if (arg0 < 120) {
            field1399 = -125;
        }
        field1409++;
        return arg1 == ' ' || arg1 == ' ' || arg1 == '_';
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IC)C")
    public static final char method603(int arg0, char arg1) {
        if (arg0 < 98) {
            return (char) 65523;
        }
        field1404++;
        if (arg1 == '[' || arg1 == ']' || arg1 == '#') {
            return arg1;
        } else if (arg1 == '-') {
            return '\u0000';
        } else if (arg1 == 'à' || arg1 == 'á' || arg1 == 'â' || arg1 == 'ä' || arg1 == 'ã' || arg1 == 'À' || arg1 == 'Á' || arg1 == 'Â' || arg1 == 'Ä' || arg1 == 'Ã') {
            return 'a';
        } else if (arg1 == 'è' || arg1 == 'é' || arg1 == 'ê' || arg1 == 'ë' || arg1 == 'È' || arg1 == 'É' || arg1 == 'Ê' || arg1 == 'Ë') {
            return 'e';
        } else if (arg1 == 'í' || arg1 == 'î' || arg1 == 'ï' || arg1 == 'Í' || arg1 == 'Î' || arg1 == 'Ï') {
            return 'i';
        } else if (arg1 == 'ò' || arg1 == 'ó' || arg1 == 'ô' || arg1 == 'ö' || arg1 == 'õ' || arg1 == 'Ò' || arg1 == 'Ó' || arg1 == 'Ô' || arg1 == 'Ö' || arg1 == 'Õ') {
            return 'o';
        } else if (arg1 == 'ù' || arg1 == 'ú' || arg1 == 'û' || arg1 == 'ü' || arg1 == 'Ù' || arg1 == 'Ú' || arg1 == 'Û' || arg1 == 'Ü') {
            return 'u';
        } else if (arg1 == 'ç' || arg1 == 'Ç') {
            return 'c';
        } else if (arg1 == 'ÿ' || arg1 == 'Ÿ') {
            return 'y';
        } else if (arg1 == 'ñ' || arg1 == 'Ñ') {
            return 'n';
        } else if (arg1 == 'ß') {
            return 'b';
        } else if (arg1 == ' ' || arg1 == ' ') {
            return '_';
        } else {
            return Character.toLowerCase(arg1);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field1405[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
    }
}
