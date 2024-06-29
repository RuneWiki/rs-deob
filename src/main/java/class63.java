import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class63 {

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "[F")
    public static float[] field1089 = new float[4];

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "Lcba;")
    public static class471 field1087 = new class471(110, -1);

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "Lcba;")
    public static class471 field1091 = new class471(46, 3);

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "Lmc;")
    public static class114 field1092 = null;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "[I")
    public static int[] field1085;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
    public static void method537(int arg0) {
        field1089 = null;
        field1092 = null;
        field1091 = null;
        field1087 = null;
        field1085 = null;
        int var1 = -28 % ((arg0 - 32) / 49);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "([BILjava/lang/String;I)I")
    public static final int method538(byte[] arg0, int arg1, String arg2, int arg3) {
        if (arg1 != 3) {
            field1089 = null;
        }
        field1086++;
        int var4 = arg3;
        int var5 = arg2.length();
        for (int var6 = 0; var6 < var5; var6 += 4) {
            int var7 = class386.method2262(arg2.charAt(var6), arg1 + 68);
            int var8 = var5 <= (var6 + 1) ? -1 : class386.method2262(arg2.charAt(var6 + 1), 97);
            int var9 = (var6 + 2) < var5 ? class386.method2262(arg2.charAt(var6 + 2), arg1 ^ 0x7F) : -1;
            int var10 = var6 + 3 < var5 ? class386.method2262(arg2.charAt(var6 + 3), 107) : -1;
            arg0[arg3++] = (byte) class73.method578(var8 >>> 4, var7 << 2);
            if (var9 == -1) {
                break;
            }
            arg0[arg3++] = (byte) class73.method578(class589.method3454(var8 << 4, 240), var9 >>> 2);
            if (var10 == -1) {
                break;
            }
            arg0[arg3++] = (byte) class73.method578(class589.method3454(var9, 3) << 6, var10);
        }
        return arg3 - var4;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lff;I)V")
    public static final void method539(class9 arg0, int arg1) {
        field1090++;
        if (arg0.field103 != null) {
            arg0.field103.field5028 = 0;
        }
        arg0.field105 = false;
        for (class9 var2 = arg0.method53(); var2 != null; var2 = arg0.method52()) {
            method539(var2, 0);
        }
        if (arg1 != 0) {
            method540(98, -72, 7);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)Z")
    public static final boolean method540(int arg0, int arg1, int arg2) {
        field1088++;
        if (arg2 != -24587) {
            field1092 = null;
        }
        return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
    }
}
