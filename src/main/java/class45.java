import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class45 {

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field1007 = 0;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "Ljd;")
    public static class86 field1012 = class122.method868("Lade Liste der Welten", true);

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "Z")
    public static boolean field1010 = false;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public static int field1015 = -1;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "Ljd;")
    private static class86 field1011 = class122.method868("wave:", true);

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "Ljd;")
    public static class86 field1013 = field1011;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "Ljd;")
    public static class86 field1008 = field1011;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "Lwk;")
    public static class259 field1014;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
    public static final void method359(byte arg0) {
        class168.field3102.method1358((byte) 63);
        field1009++;
        if (arg0 > -115) {
            method359((byte) -34);
        }
        int var1 = class168.field3102.method1352(1, -72);
        if (var1 == 0) {
            return;
        }
        int var2 = class168.field3102.method1352(2, 41);
        if (var2 == 0) {
            class271.field4762[class164.field3083++] = 2047;
        } else if (var2 == 1) {
            int var3 = class168.field3102.method1352(3, -115);
            class124.field2412.method235(var3, false, 127);
            int var4 = class168.field3102.method1352(1, 98);
            if (var4 == 1) {
                class271.field4762[class164.field3083++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class168.field3102.method1352(3, 69);
            class124.field2412.method235(var5, true, 125);
            int var6 = class168.field3102.method1352(3, 97);
            class124.field2412.method235(var6, true, 126);
            int var7 = class168.field3102.method1352(1, -69);
            if (var7 == 1) {
                class271.field4762[class164.field3083++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class168.field3102.method1352(1, -79);
            int var9 = class168.field3102.method1352(7, -71);
            int var10 = class168.field3102.method1352(7, 46);
            class180.field3244 = class168.field3102.method1352(2, 103);
            int var11 = class168.field3102.method1352(1, 69);
            if (var11 == 1) {
                class271.field4762[class164.field3083++] = 2047;
            }
            class124.field2412.method1570(var10, var8 == 1, var9, -122);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public static void method360(int arg0) {
        field1013 = null;
        field1014 = null;
        field1012 = null;
        field1011 = null;
        int var1 = -108 % ((-arg0 - 72) / 45);
        field1008 = null;
    }
}
