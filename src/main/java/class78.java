import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class78 {

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field1381 = 0;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "[S")
    public static short[] field1382 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1385 = " more options";

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)V", line = 12)
    public static final void method586(int arg0, int arg1) {
        class261.field4304.method896(arg1, (byte) -55);
        field1384++;
        int var2 = 123 / ((arg0 - 40) / 63);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 26)
    public static final void method587(int arg0) {
        field1383++;
        for (class107 var1 = (class107) class123.field2165.method431(arg0 + arg0); var1 != null; var1 = (class107) class123.field2165.method439(-28512)) {
            if (var1.field1940 == -1) {
                var1.field1951 = 0;
                class27.method217(var1, (byte) 88);
            } else {
                var1.method535(-2801);
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)I", line = 53)
    public static final int method588(int arg0, int arg1) {
        if (arg0 != -63) {
            method593(true);
        }
        field1386++;
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)I", line = 65)
    public static final int method589(int arg0) {
        int var1 = 57 % ((arg0 - 9) / 52);
        field1388++;
        return class300.field4865.method892(0);
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)Ljava/lang/String;", line = 82)
    public static final String method590(int arg0) {
        field1387++;
        String var1 = "www";
        if (class39.field848 != 0) {
            var1 = "www-wtqa";
        }
        String var2 = "";
        if (arg0 != 1) {
            method586(-15, 108);
        }
        if (class200.field3359 != null) {
            var2 = "/p=" + class200.field3359;
        }
        return "http://" + var1 + ".runescape.com/l=" + class86.field1497 + "/a=" + class363.field5745 + var2 + "/";
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIILml;Lml;IIIIJ)V", line = 108)
    public static final void method591(int arg0, int arg1, int arg2, int arg3, class152 arg4, class152 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class332 var12 = new class332();
        var12.field5299 = arg10;
        var12.field5310 = arg1 * 128 + 64;
        var12.field5313 = arg2 * 128 + 64;
        var12.field5309 = arg3;
        var12.field5307 = arg4;
        var12.field5305 = arg5;
        var12.field5304 = arg6;
        var12.field5311 = arg7;
        var12.field5312 = arg8;
        var12.field5306 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class353.field5644[var13][arg1][arg2] == null) {
                class353.field5644[var13][arg1][arg2] = new class312(var13, arg1, arg2);
            }
        }
        class353.field5644[arg0][arg1][arg2].field5082 = var12;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZI)I", line = 142)
    public static final int method592(int arg0, boolean arg1, int arg2) {
        field1380++;
        int var3 = 0;
        while (arg0 > 0) {
            var3 = var3 << 1 | arg2 & 0x1;
            arg0--;
            arg2 >>>= 0x1;
        }
        return arg1 ? -126 : var3;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V", line = 162)
    public static void method593(boolean arg0) {
        field1385 = null;
        if (!arg0) {
            method588(-30, 3);
        }
        field1382 = null;
    }
}
