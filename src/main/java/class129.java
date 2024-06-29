import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class129 {

    @OriginalMember(owner = "client!qea", name = "j", descriptor = "I")
    public int field2180 = -1;

    @OriginalMember(owner = "client!qea", name = "d", descriptor = "[I")
    public static int[] field2174 = new int[14];

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "Z")
    public static boolean field2172 = false;

    @OriginalMember(owner = "client!qea", name = "c", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!qea", name = "e", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!qea", name = "h", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!qea", name = "i", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!qea", name = "g", descriptor = "Ljk;")
    public class634 field2177;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qea", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field2181;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "[I")
    public int[] field2171;

    @OriginalMember(owner = "client!qea", name = "f", descriptor = "[Ljava/lang/String;")
    public String[] field2176;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(III)I")
    public static final int method1068(int arg0, int arg1, int arg2) {
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        if (arg1 != 1421041063) {
            return -72;
        }
        field2179++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(Z[BB)V")
    public static final void method1069(boolean arg0, byte[] arg1, byte arg2) {
        field2178++;
        if (class105.field1848 == null) {
            class105.field1848 = new class215(20000);
        }
        class105.field1848.method1528(arg1.length, 0, arg1, 97);
        if (arg0) {
            class534.method3076((byte) -113, class105.field1848.field3066);
            class690.field9322 = new class420[class399.field5900];
            int var3 = 0;
            for (int var4 = class380.field5522; var4 <= class123.field2120; var4++) {
                class420 var5 = class602.method3429(false, var4);
                if (var5 != null) {
                    class690.field9322[var3++] = var5;
                }
            }
            class491.field6805 = false;
            class214.field3045 = class554.method3190(-92);
            class105.field1848 = null;
        }
        if (arg2 > -21) {
            field2172 = true;
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(Z)V")
    public static void method1070(boolean arg0) {
        field2174 = null;
        if (!arg0) {
            field2172 = true;
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(ILmk;)V")
    public static final void method1071(int arg0, class55 arg1) {
        field2173++;
        if (class649.field8928 == null) {
            return;
        }
        if (arg0 >= -38) {
            method1068(-77, 22, 77);
        }
        class258 var2 = null;
        if (arg1.field1125 == 0) {
            var2 = (class258) class28.method398(arg1.field1120, arg1.field1126, arg1.field1117);
        }
        if (arg1.field1125 == 1) {
            var2 = (class258) class466.method2743(arg1.field1120, arg1.field1126, arg1.field1117);
        }
        if (arg1.field1125 == 2) {
            var2 = (class258) class562.method3228(arg1.field1120, arg1.field1126, arg1.field1117, field2181 == null ? (field2181 = method1073("se")) : field2181);
        }
        if (arg1.field1125 == 3) {
            var2 = (class258) class12.method112(arg1.field1120, arg1.field1126, arg1.field1117);
        }
        if (var2 == null) {
            arg1.field1113 = 0;
            arg1.field1123 = -1;
            arg1.field1124 = 0;
        } else {
            arg1.field1123 = var2.method589(-103);
            arg1.field1124 = var2.method594(111);
            arg1.field1113 = var2.method588(-32228);
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(IIIIII)V")
    public static final void method1072(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var9 = arg0 + 1;
        class47.method550(-27, arg3, class691.field9345[arg0], arg4, arg1);
        field2175++;
        int var10 = arg5 - 1;
        class47.method550(-27, arg3, class691.field9345[arg5], arg4, arg1);
        int var6 = -52 / ((arg2 + 32) / 55);
        for (int var7 = var9; var7 <= var10; var7++) {
            int[] var8 = class691.field9345[var7];
            var8[arg4] = var8[arg3] = arg1;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1073(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
