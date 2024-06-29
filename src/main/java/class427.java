import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class427 {

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "Ltb;")
    public static class304 field6095 = new class304(128);

    @OriginalMember(owner = "client!ht", name = "h", descriptor = "Lsl;")
    public static class422 field6101 = new class422("", 11);

    @OriginalMember(owner = "client!ht", name = "i", descriptor = "Lo;")
    public static class332 field6102 = new class332("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "I")
    public static int field6094;

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "I")
    public static int field6096;

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "I")
    public static int field6097;

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "I")
    public static int field6098;

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "I")
    public static int field6099;

    @OriginalMember(owner = "client!ht", name = "g", descriptor = "I")
    public static int field6100;

    @OriginalMember(owner = "client!ht", name = "k", descriptor = "Lkc;")
    public static class147 field6104;

    @OriginalMember(owner = "client!ht", name = "j", descriptor = "Lui;")
    public static class451 field6103;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Z)V", line = 5)
    public static void method2509(boolean arg0) {
        field6102 = null;
        field6101 = null;
        field6103 = null;
        field6095 = null;
        field6104 = null;
        if (arg0) {
            method2510(80, -38, -10, 24);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIII)I", line = 23)
    public static final int method2510(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 255) {
            method2510(123, -55, 81, 90);
        }
        field6097++;
        if ((class246.field3532[arg1][arg0][arg3] & 0x8) == 0) {
            return arg1 <= 0 || (class246.field3532[1][arg0][arg3] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)Z", line = 41)
    public static final boolean method2511(int arg0) {
        field6096++;
        if (arg0 != 18769) {
            return false;
        }
        if (class378.field5614) {
            try {
                if ((Boolean) class399.method2383(class21.field261.field2125, -10423, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILjava/lang/String;)I", line = 64)
    public static final int method2512(int arg0, String arg1) {
        field6094++;
        if (arg0 != 10) {
            method2510(101, 54, -96, -13);
        }
        return class268.method1747(arg1, 10, false, true);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ljb;[[BB)V", line = 76)
    public static final void method2513(class350 arg0, byte[][] arg1, byte arg2) {
        field6100++;
        if (arg2 >= -92) {
            return;
        }
        int var3 = class485.field6820.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg1[var4];
            if (var5 != null) {
                int var6 = (class145.field2052[var4] >> 8) * 64 - class68.field922;
                int var7 = (class145.field2052[var4] & 0xFF) * 64 - class468.field6588;
                class418.method2483((byte) 106);
                arg0.method2160(var6, class138.field1976, var5, var7, class183.field2717, 69);
            }
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(BI)V", line = 117)
    public static final void method2514(byte arg0, int arg1) {
        field6099++;
        if (arg1 == -1) {
            return;
        }
        if (arg0 > -2) {
            method2515((byte) 26, -46);
        }
        if (class225.field3265[arg1]) {
            class134.field1945.method2665(111, arg1);
            class467.field6572[arg1] = null;
            class361.field5469[arg1] = null;
            class225.field3265[arg1] = false;
        }
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(BI)V", line = 139)
    public static final void method2515(byte arg0, int arg1) {
        field6098++;
        class186 var2 = class275.method1789(arg1, (byte) 123, 10);
        var2.method1279((byte) -65);
        if (arg0 != -49) {
            field6102 = null;
        }
    }
}
