import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class51 {

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "Laf;")
    private static class7 field1216 = class48.method406(40, "Too many incorrect logins from your address)3");

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field1211 = 1;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "Laf;")
    public static class7 field1225 = field1216;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "Z")
    public static boolean field1223 = false;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "J")
    public static long field1209 = 0L;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "Laf;")
    private static class7 field1230 = class48.method406(40, "Connection timed out)3");

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "Laf;")
    public static class7 field1232 = class48.method406(40, "<col=ffff00>");

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "[[I")
    public static int[][] field1210 = new int[5][5000];

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "[I")
    public static int[] field1233 = new int[5];

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "Laf;")
    public static class7 field1221 = field1230;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "Lbd;")
    public static class12 field1222 = new class12(512);

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "Lgd;")
    public static class46 field1235 = new class46(64);

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "Lrd;")
    public static class122 field1236 = new class122(new byte[5000]);

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "Laf;")
    private static class7 field1238 = class48.method406(40, "Login server offline)3");

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "Laf;")
    private static class7 field1239 = class48.method406(40, "Please remove ");

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "Laf;")
    public static class7 field1240 = field1239;

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "Laf;")
    public static class7 field1241 = field1238;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "Laf;")
    public static class7 field1237 = field1239;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public int field1208;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public int field1213;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public int field1217;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public int field1219;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
    public int field1226;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
    public int field1229;

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
    public int field1231;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "Lad;")
    public static class5 field1224;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "[B")
    public byte[] field1212;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "[B")
    public byte[] field1228;

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "[I")
    public static int[] field1234;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZI)V")
    public static final void method420(int arg0, boolean arg1, int arg2) {
        if (class94.field2205 != 0 && arg2 != -1) {
            client.method203(class94.field2205, 0, -11361, false, arg2, class142.field3373);
            class19.field440 = true;
        }
        field1215++;
        if (!arg1) {
            field1221 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)Laf;")
    public static final class7 method421(byte arg0, int arg1) {
        field1227++;
        int var2 = -7 / ((arg0 - 74) / 40);
        return class21.method194(10, arg1, false, 0);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILac;)V")
    public static final void method422(int arg0, class4 arg1) {
        class10.field278 = arg1;
        if (arg0 != 27937) {
            method420(-104, true, 84);
        }
        field1218++;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static void method423(int arg0) {
        field1235 = null;
        if (arg0 != 1) {
            method421((byte) 67, -15);
        }
        field1225 = null;
        field1233 = null;
        field1221 = null;
        field1239 = null;
        field1230 = null;
        field1237 = null;
        field1232 = null;
        field1234 = null;
        field1238 = null;
        field1224 = null;
        field1236 = null;
        field1240 = null;
        field1210 = null;
        field1241 = null;
        field1222 = null;
        field1216 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method424(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1214++;
        if (arg5 != 1) {
            method423(-21);
        }
        class130 var10 = (class130) class75.field1738.method758(255);
        class130 var11 = null;
        while (var10 != null) {
            if (var10.field3078 == arg2 && var10.field3092 == arg7 && var10.field3068 == arg3 && var10.field3071 == arg4) {
                var11 = var10;
                break;
            }
            var10 = (class130) class75.field1738.method766(-57);
        }
        if (var11 == null) {
            var11 = new class130();
            var11.field3068 = arg3;
            var11.field3078 = arg2;
            var11.field3071 = arg4;
            var11.field3092 = arg7;
            class116.method904(var11, -50);
            class75.field1738.method765(var11, 0);
        }
        var11.field3086 = arg8;
        var11.field3091 = arg6;
        var11.field3087 = arg0;
        var11.field3094 = arg1;
        var11.field3073 = arg9;
    }
}
