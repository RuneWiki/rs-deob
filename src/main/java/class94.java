import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class94 extends class380 {

    @OriginalMember(owner = "client!ls", name = "G", descriptor = "B")
    public byte field1126 = 5;

    @OriginalMember(owner = "client!ls", name = "A", descriptor = "I")
    public static int field1120 = 0;

    @OriginalMember(owner = "client!ls", name = "L", descriptor = "J")
    public static long field1131 = -1L;

    @OriginalMember(owner = "client!ls", name = "O", descriptor = "Z")
    public static boolean field1134 = false;

    @OriginalMember(owner = "client!ls", name = "B", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!ls", name = "C", descriptor = "I")
    public int field1122;

    @OriginalMember(owner = "client!ls", name = "D", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!ls", name = "E", descriptor = "I")
    public int field1124;

    @OriginalMember(owner = "client!ls", name = "F", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!ls", name = "I", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!ls", name = "J", descriptor = "I")
    public int field1129;

    @OriginalMember(owner = "client!ls", name = "K", descriptor = "I")
    public int field1130;

    @OriginalMember(owner = "client!ls", name = "M", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!ls", name = "N", descriptor = "I")
    public int field1133;

    @OriginalMember(owner = "client!ls", name = "P", descriptor = "I")
    public int field1135;

    @OriginalMember(owner = "client!ls", name = "H", descriptor = "Z")
    public boolean field1127;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)Lbu;")
    public static final class17 method524(int arg0, int arg1) {
        int var2 = 15 % ((-arg0 - 18) / 55);
        field1121++;
        class17[] var3 = class300.method1794(-99);
        for (int var4 = 0; var4 < var3.length; var4++) {
            class17 var5 = var3[var4];
            if (var5.field160 == arg1) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIII)V")
    public static final void method525(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class214.field2931 = arg4;
        class349.field4640 = arg2;
        class141.field1868 = arg3;
        if (arg1 < -53) {
            field1125++;
            class122.field1576 = arg0;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public static final void method526(boolean arg0, int arg1, String arg2) {
        field1123++;
        if (arg2 == null) {
            return;
        }
        if (class327.field4351 >= 100) {
            class180.method1053(0, class73.field916.method1823(class374.field5072, (byte) -88));
            return;
        }
        String var3 = class437.method2684(-79, arg2);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class327.field4351; var4++) {
            String var8 = class437.method2684(-59, class384.field5591[var4]);
            if (var8 != null && var8.equals(var3)) {
                class180.method1053(0, arg2 + class245.field3231.method1823(class374.field5072, (byte) -88));
                return;
            }
            if (class161.field2091[var4] != null) {
                String var9 = class437.method2684(-82, class161.field2091[var4]);
                if (var9 != null && var9.equals(var3)) {
                    class180.method1053(0, arg2 + class245.field3231.method1823(class374.field5072, (byte) -88));
                    return;
                }
            }
        }
        int var5 = 0;
        if (arg1 <= 0) {
            field1120 = -43;
        }
        while (var5 < class85.field1014) {
            String var6 = class437.method2684(-107, class52.field611[var5]);
            if (var6 != null && var6.equals(var3)) {
                class180.method1053(0, class325.field4331.method1823(class374.field5072, (byte) -88) + arg2 + class205.field2707.method1823(class374.field5072, (byte) -88));
                return;
            }
            if (class465.field6912[var5] != null) {
                String var7 = class437.method2684(-121, class465.field6912[var5]);
                if (var7 != null && var7.equals(var3)) {
                    class180.method1053(0, class325.field4331.method1823(class374.field5072, (byte) -88) + arg2 + class205.field2707.method1823(class374.field5072, (byte) -88));
                    return;
                }
            }
            var5++;
        }
        if (class437.method2684(-117, class96.field1170.field7783).equals(var3)) {
            class180.method1053(0, class517.field7581.method1823(class374.field5072, (byte) -88));
            return;
        }
        class212.field2840++;
        class492.method2979(class464.field6909, 18);
        class106.field1443.method2449((byte) 117, class424.method2613(1, arg2) + 1);
        class106.field1443.method2415(arg2, 21742);
        class106.field1443.method2449((byte) 120, arg0 ? 1 : 0);
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(B)Leo;")
    public static final class196 method527(byte arg0) {
        field1132++;
        if (arg0 > -8) {
            method527((byte) 97);
        }
        try {
            return (class196) Class.forName("kb").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(II)V")
    public static final void method528(int arg0, int arg1) {
        field1128++;
        class53.field615 = 100;
        class183.field2379 = arg1;
        class307.field4117 = arg0;
        class509.field7386 = 3;
    }
}
