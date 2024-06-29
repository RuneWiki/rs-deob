import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ca")
public class class6 {

    @OriginalMember(owner = "mapview!ca", name = "b", descriptor = "Lw;")
    public static class38 field38 = class35.method219("world", true);

    @OriginalMember(owner = "mapview!ca", name = "e", descriptor = "Lw;")
    public static class38 field41 = class35.method219("37(U", true);

    @OriginalMember(owner = "mapview!ca", name = "k", descriptor = "Lw;")
    public static class38 field47 = class35.method219("Loading", true);

    @OriginalMember(owner = "mapview!ca", name = "f", descriptor = "Lw;")
    public static class38 field42 = class35.method219("Pub)4Bar", true);

    @OriginalMember(owner = "mapview!ca", name = "l", descriptor = "Lw;")
    public static class38 field48 = class35.method219("Spice Shop", true);

    @OriginalMember(owner = "mapview!ca", name = "m", descriptor = "[[B")
    public static byte[][] field49 = new byte[250][];

    @OriginalMember(owner = "mapview!ca", name = "j", descriptor = "Lw;")
    public static class38 field46 = class35.method219("Axe Shop", true);

    @OriginalMember(owner = "mapview!ca", name = "g", descriptor = "Lw;")
    public static class38 field43 = class35.method219("Cookery Shop", true);

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "mapview!ca", name = "i", descriptor = "J")
    private static long field45;

    @OriginalMember(owner = "mapview!ca", name = "h", descriptor = "Lm;")
    public static class22 field44;

    @OriginalMember(owner = "mapview!ca", name = "c", descriptor = "[I")
    public static int[] field39;

    @OriginalMember(owner = "mapview!ca", name = "d", descriptor = "[[[I")
    public static int[][][] field40;

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(B)Z", line = 13)
    public static final boolean method23(byte arg0) {
        class33 var1 = class27.field374;
        synchronized (class27.field374) {
            if (class3.field14 == class24.field340) {
                return false;
            }
            class9.field77 = class4.field28[class24.field340];
            if (arg0 < 23) {
                return false;
            } else {
                class32.field416 = class19.field205[class24.field340];
                class24.field340 = class24.field340 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(ILha;II)Lja;", line = 50)
    public static final class17 method24(int arg0, class13 arg1, int arg2, int arg3) {
        if (class9.method39(arg2, arg3, -90, arg1)) {
            int var4 = 105 / ((20 - arg0) / 37);
            return class34.method203((byte) 102);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(I)J", line = 66)
    public static final synchronized long method25(int arg0) {
        long var1 = System.currentTimeMillis();
        if (var1 < field45) {
            class8.field56 += field45 - var1;
        }
        if (arg0 >= -8) {
            return -104L;
        } else {
            field45 = var1;
            return class8.field56 + var1;
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "b", descriptor = "(B)V", line = 96)
    public static void method26(byte arg0) {
        field47 = null;
        field41 = null;
        field39 = null;
        field43 = null;
        field48 = null;
        field40 = null;
        field49 = null;
        field38 = null;
        if (arg0 != -23) {
            method28((byte) 54, 97, 3, null);
        }
        field44 = null;
        field46 = null;
        field42 = null;
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(BLha;Lw;Lw;)[Ll;", line = 117)
    public static final class20[] method27(byte arg0, class13 arg1, class38 arg2, class38 arg3) {
        int var4 = arg1.method61(31, arg2);
        if (arg0 < 33) {
            field45 = 95L;
        }
        int var5 = arg1.method63(var4, (byte) -77, arg3);
        return class9.method44(var5, (byte) -126, arg1, var4);
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(BII[B)Lw;", line = 137)
    public static final class38 method28(byte arg0, int arg1, int arg2, byte[] arg3) {
        if (arg0 != 5) {
            method23((byte) -26);
        }
        class38 var4 = new class38();
        var4.field503 = new byte[arg2];
        var4.field502 = 0;
        for (int var5 = arg1; var5 < arg1 + arg2; var5++) {
            if (arg3[var5] != 0) {
                var4.field503[var4.field502++] = arg3[var5];
            }
        }
        return var4;
    }
}
