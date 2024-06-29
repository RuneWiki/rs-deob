import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class312 extends class116 {

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4853 = "glow1:";

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
    public static int field4852 = 0;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "B")
    public static byte field4848;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "[[Z")
    public static boolean[][] field4849;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIB)V", line = 5)
    public static final void method2152(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field4854++;
        int var6 = arg3 - arg4;
        int var7 = arg1 - arg2;
        if (var7 == 0) {
            if (var6 != 0) {
                class43.method406(arg0, arg2, arg4, arg3, (byte) -56);
            }
        } else if (var6 == 0) {
            class43.method407(71, arg0, arg4, arg1, arg2);
        } else {
            int var8 = (var6 << 12) / var7;
            int var9 = arg4 - (arg2 * var8 >> 12);
            int var10;
            int var11;
            if (arg2 < class298.field4667) {
                var11 = class298.field4667;
                var10 = (class298.field4667 * var8 >> 12) + var9;
            } else if (class327.field5072 < arg2) {
                var10 = (class327.field5072 * var8 >> 12) + var9;
                var11 = class327.field5072;
            } else {
                var11 = arg2;
                var10 = arg4;
            }
            int var12;
            int var13;
            if (class298.field4667 > arg1) {
                var13 = (class298.field4667 * var8 >> 12) + var9;
                var12 = class298.field4667;
            } else if (arg1 <= class327.field5072) {
                var12 = arg1;
                var13 = arg3;
            } else {
                var12 = class327.field5072;
                var13 = (class327.field5072 * var8 >> 12) + var9;
            }
            if (arg5 <= 30) {
                field4849 = (boolean[][]) ((boolean[][]) null);
            }
            if (var10 < class34.field432) {
                var11 = (class34.field432 - var9 << 12) / var8;
                var10 = class34.field432;
            } else if (var10 > class75.field1064) {
                var10 = class75.field1064;
                var11 = (class75.field1064 - var9 << 12) / var8;
            }
            if (var13 < class34.field432) {
                var12 = (class34.field432 - var9 << 12) / var8;
                var13 = class34.field432;
            } else if (var13 > class75.field1064) {
                var12 = (class75.field1064 - var9 << 12) / var8;
                var13 = class75.field1064;
            }
            class51.method469(var12, var11, var10, var13, arg0, true);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B[B)[B", line = 115)
    public static final byte[] method2153(byte arg0, byte[] arg1) {
        if (arg0 != -54) {
            method2152(10, 68, 33, -3, -68, (byte) -71);
        }
        field4855++;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class151.method1117(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)V", line = 135)
    public static void method2154(int arg0) {
        if (arg0 == 0) {
            field4853 = null;
            field4849 = (boolean[][]) null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)Lob;", line = 148)
    public static final class292 method2155(int arg0) {
        field4851++;
        if (arg0 != 0) {
            field4849 = (boolean[][]) ((boolean[][]) null);
        }
        class292 var1;
        if (class36.field534) {
            var1 = new class186(class150.field2273, class98.field1453, class271.field4096[0], class101.field1541[0], class111.field1756[0], class323.field5027[0], class274.field4162[0], class57.field843);
        } else {
            var1 = new class70(class150.field2273, class98.field1453, class271.field4096[0], class101.field1541[0], class111.field1756[0], class323.field5027[0], class274.field4162[0], class57.field843);
        }
        class265.method1835(10);
        return var1;
    }
}
