import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ha")
public class class16 {

    @OriginalMember(owner = "mapview!ha", name = "d", descriptor = "Lh;")
    public static class15 field263 = class26.method190(true, "Furnace");

    @OriginalMember(owner = "mapview!ha", name = "f", descriptor = "Lh;")
    public static class15 field265 = class26.method190(true, "details)3dat");

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "Lh;")
    public static class15 field260 = class26.method190(true, "Staff Shop");

    @OriginalMember(owner = "mapview!ha", name = "g", descriptor = "Z")
    public static boolean field266 = true;

    @OriginalMember(owner = "mapview!ha", name = "k", descriptor = "Lh;")
    public static class15 field270 = class26.method190(true, "Requesting ");

    @OriginalMember(owner = "mapview!ha", name = "l", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "mapview!ha", name = "e", descriptor = "J")
    public long field264;

    @OriginalMember(owner = "mapview!ha", name = "h", descriptor = "Lha;")
    public class16 field267;

    @OriginalMember(owner = "mapview!ha", name = "m", descriptor = "Lha;")
    public class16 field272;

    @OriginalMember(owner = "mapview!ha", name = "b", descriptor = "[I")
    public static int[] field261;

    @OriginalMember(owner = "mapview!ha", name = "j", descriptor = "[I")
    public static int[] field269;

    @OriginalMember(owner = "mapview!ha", name = "c", descriptor = "[Ls;")
    public static class32[] field262;

    @OriginalMember(owner = "mapview!ha", name = "i", descriptor = "[[Lo;")
    public static class28[][] field268;

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(Laa;III)[Lg;", line = 12)
    public static final class13[] method137(class2 arg0, int arg1, int arg2, int arg3) {
        if (class31.method226(arg2, arg0, 0, arg3)) {
            return arg1 < 122 ? (class13[]) null : class21.method162(-76);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(I)V", line = 41)
    public static void method138(int arg0) {
        field262 = null;
        if (arg0 != 0) {
            field261 = null;
        }
        field260 = null;
        field270 = null;
        field269 = null;
        field268 = null;
        field263 = null;
        field265 = null;
        field261 = null;
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(B)V", line = 82)
    public final void method139(byte arg0) {
        if (this.field267 == null) {
            return;
        }
        this.field267.field272 = this.field272;
        this.field272.field267 = this.field267;
        this.field267 = null;
        this.field272 = null;
        if (arg0 < 76) {
            field260 = null;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(IIB[Lh;)Lh;", line = 108)
    private static final class15 method140(int arg0, int arg1, byte arg2, class15[] arg3) {
        int var4 = 0;
        int var5 = 0;
        if (arg2 != -65) {
            method140(-14, -127, (byte) 66, null);
        }
        while (var5 < arg0) {
            if (arg3[arg1 + var5] == null) {
                arg3[arg1 + var5] = class29.field400;
            }
            var4 += arg3[arg1 + var5].field250;
            var5++;
        }
        int var6 = 0;
        byte[] var7 = new byte[var4];
        for (int var8 = 0; var8 < arg0; var8++) {
            class15 var9 = arg3[arg1 + var8];
            class34.method234(var9.field247, 0, var7, var6, var9.field250);
            var6 += var9.field250;
        }
        class15 var10 = new class15();
        var10.field247 = var7;
        var10.field250 = var4;
        return var10;
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(II)I", line = 165)
    public static int method141(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(I[Lh;)Lh;", line = 177)
    public static final class15 method142(int arg0, class15[] arg1) {
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        } else if (arg0 > -100) {
            return (class15) null;
        } else {
            return method140(arg1.length, 0, (byte) -65, arg1);
        }
    }
}
