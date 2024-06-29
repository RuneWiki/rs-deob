import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!la")
public class class23 {

    @OriginalMember(owner = "mapview!la", name = "e", descriptor = "Ll;")
    public static class22 field227 = class33.method229("Loading )3)3)3", -93);

    @OriginalMember(owner = "mapview!la", name = "c", descriptor = "Ll;")
    public static class22 field225 = class33.method229("Cookery Shop", -77);

    @OriginalMember(owner = "mapview!la", name = "f", descriptor = "Ll;")
    public static class22 field228 = class33.method229("Requesting", -51);

    @OriginalMember(owner = "mapview!la", name = "g", descriptor = "Ll;")
    public static class22 field229 = class33.method229("codeversion", -85);

    @OriginalMember(owner = "mapview!la", name = "h", descriptor = "Z")
    public static volatile boolean field230 = false;

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "Ll;")
    public static class22 field223 = class33.method229("Anvil", -55);

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "J")
    public static long field224;

    @OriginalMember(owner = "mapview!la", name = "d", descriptor = "[Lu;")
    public static class36[] field226;

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(B)V", line = 17)
    public static void method155(byte arg0) {
        field229 = null;
        field226 = null;
        field225 = null;
        if (arg0 >= -24) {
            field225 = null;
        }
        field228 = null;
        field223 = null;
        field227 = null;
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(I)Lf;", line = 38)
    public static final class11 method156(int arg0) {
        if (arg0 != 39) {
            method158((byte) -43);
        }
        class11 var1 = new class11(class14.field147, class19.field196, class21.field209, class38.field501, class30.field425);
        method157(-27401);
        return var1;
    }

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "(I)V", line = 63)
    public static final void method157(int arg0) {
        class24.field235 = null;
        class19.field196 = null;
        class14.field147 = null;
        if (arg0 != -27401) {
            method156(-51);
        }
        class30.field425 = null;
        class38.field501 = null;
        class21.field209 = null;
    }

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "(B)Li;", line = 94)
    public static final class17 method158(byte arg0) {
        if (arg0 != 62) {
            method157(81);
        }
        try {
            return (class17) Class.forName("j").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class30();
        }
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(ZIII)Ll;", line = 117)
    public static final class22 method159(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 1 || arg2 > 36) {
            arg2 = 10;
        }
        int var4 = arg1 / arg2;
        int var5 = 1;
        while (var4 != 0) {
            var4 /= arg2;
            var5++;
        }
        int var6 = var5;
        if (arg1 < 0 || arg0) {
            var6 = var5 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg1 < 0) {
            var7[0] = 45;
        } else if (arg0) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = arg1 % arg2;
            if (var9 < 0) {
                var9 = -var9;
            }
            arg1 /= arg2;
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
        }
        class22 var10 = new class22();
        if (arg3 > -127) {
            method156(81);
        }
        var10.field213 = var6;
        var10.field215 = var7;
        return var10;
    }
}
