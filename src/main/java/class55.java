import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class55 {

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field1158 = 0;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "Lfe;")
    public static class36 field1159 = new class36(100);

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "Llc;")
    public static class69 field1168 = class69.method470((byte) -119, "Enter name of player to add to list");

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "[I")
    public static int[] field1166 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "[Z")
    public static boolean[] field1169 = new boolean[5];

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "Llc;")
    public static class69 field1167 = class69.method470((byte) -122, "Enter object name");

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "Llc;")
    public static class69 field1171 = class69.method470((byte) -106, "Friends");

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
    public static int field1170 = 0;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "Loa;")
    public static class85 field1157;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "[Lda;")
    public static class20[] field1165;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
    public static void method344(byte arg0) {
        field1168 = null;
        if (arg0 <= 54) {
            return;
        }
        field1159 = null;
        field1165 = null;
        field1166 = null;
        field1169 = null;
        field1157 = null;
        field1171 = null;
        field1167 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BLjava/awt/Component;II)Loa;")
    public static final class85 method345(byte arg0, Component arg1, int arg2, int arg3) {
        field1163++;
        try {
            Class var4 = Class.forName("be");
            class85 var5 = (class85) var4.getDeclaredConstructor().newInstance();
            if (arg0 == 108) {
                var5.method68(-13942, arg3, arg2, arg1);
                return var5;
            } else {
                return null;
            }
        } catch (Throwable var7) {
            class42 var6 = new class42();
            var6.method68(arg0 - 14050, arg3, arg2, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
    public static final void method346(byte arg0) {
        field1160++;
        int var1 = -29 % ((29 - arg0) / 57);
        for (class25 var2 = (class25) class16.field289.method580((byte) -116); var2 != null; var2 = (class25) class16.field289.method576((byte) 123)) {
            if (class71.field1588 != var2.field520 || class62.field1282 > var2.field512) {
                var2.method502(0);
            } else if (class62.field1282 >= var2.field542) {
                if (var2.field555 > 0) {
                    class72 var3 = class112.field2434[var2.field555 - 1];
                    if (var3 != null && var3.field1058 >= 0 && var3.field1058 < 13312 && var3.field1065 >= 0 && var3.field1065 < 13312) {
                        var2.method167(class62.field1282, var3.field1058, var3.field1065, class53.method341(0, var3.field1058, var3.field1065, var2.field520) - var2.field547, -19860);
                    }
                }
                if (var2.field555 < 0) {
                    int var4 = -var2.field555 - 1;
                    class60 var5;
                    if (class2.field10 == var4) {
                        var5 = class46.field974;
                    } else {
                        var5 = class123.field2682[var4];
                    }
                    if (var5 != null && var5.field1058 >= 0 && var5.field1058 < 13312 && var5.field1065 >= 0 && var5.field1065 < 13312) {
                        var2.method167(class62.field1282, var5.field1058, var5.field1065, class53.method341(0, var5.field1058, var5.field1065, var2.field520) - var2.field547, -19860);
                    }
                }
                var2.method162(class69.field1534, 21813);
                class120.field2562.method979(class71.field1588, (int) var2.field526, (int) var2.field511, (int) var2.field523, 60, var2, var2.field535, -1, false);
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Llc;ILlc;)V")
    public static final void method347(class69 arg0, int arg1, class69 arg2) {
        field1162++;
        class71.field1571 = arg2;
        int var3 = 69 / ((-arg1 - 49) / 62);
        class71.field1591 = arg0;
    }
}
