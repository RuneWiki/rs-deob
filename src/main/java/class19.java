import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ka")
public class class19 {

    @OriginalMember(owner = "mapview!ka", name = "e", descriptor = "Lv;")
    public static class40 field204 = class24.method170("Skirt Shop", (byte) -98);

    @OriginalMember(owner = "mapview!ka", name = "i", descriptor = "Lv;")
    public static class40 field208 = class24.method170("POH Portal", (byte) 92);

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "Lv;")
    public static class40 field200 = class24.method170("Achievement Start", (byte) -76);

    @OriginalMember(owner = "mapview!ka", name = "l", descriptor = "Lv;")
    public static class40 field211 = class24.method170("Makeover Mage", (byte) 21);

    @OriginalMember(owner = "mapview!ka", name = "f", descriptor = "Lv;")
    public static class40 field205 = class24.method170("37(U", (byte) 21);

    @OriginalMember(owner = "mapview!ka", name = "j", descriptor = "Lv;")
    public static class40 field209 = class24.method170("Loading )3)3)3", (byte) -111);

    @OriginalMember(owner = "mapview!ka", name = "h", descriptor = "I")
    private static int field207 = 0;

    @OriginalMember(owner = "mapview!ka", name = "g", descriptor = "Lv;")
    public static class40 field206 = class24.method170("world", (byte) -111);

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "mapview!ka", name = "k", descriptor = "Lj;")
    public static class17 field210;

    @OriginalMember(owner = "mapview!ka", name = "c", descriptor = "Lta;")
    public static class37 field202;

    @OriginalMember(owner = "mapview!ka", name = "d", descriptor = "[Lv;")
    public static class40[] field203;

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(I)V", line = 12)
    public static void method113(int arg0) {
        field204 = null;
        field208 = null;
        field200 = null;
        field209 = null;
        field206 = null;
        field202 = null;
        field205 = null;
        field203 = null;
        field210 = null;
        if (arg0 != 0) {
            field209 = null;
        }
        field211 = null;
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(I[B)[B", line = 59)
    public static final byte[] method114(int arg0, byte[] arg1) {
        class5 var2 = new class5(arg1);
        int var3 = var2.method28(-95);
        int var4 = var2.method33(-16411);
        if (var4 < 0 || class27.field414 != 0 && class27.field414 < var4) {
            throw new RuntimeException();
        }
        if (arg0 >= -23) {
            method115(11, -114, null, 86);
        }
        if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method35(11202, var4, 0, var5);
            return var5;
        }
        int var6 = var2.method33(-16411);
        if (var6 < 0 || class27.field414 != 0 && var6 > class27.field414) {
            throw new RuntimeException();
        }
        byte[] var7 = new byte[var6];
        if (var3 == 1) {
            class22.method141(var7, var6, arg1, var4, 9);
        } else {
            class20.field216.method240(var7, -17345, var2);
        }
        return var7;
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(II[Lv;I)Lv;", line = 111)
    public static final class40 method115(int arg0, int arg1, class40[] arg2, int arg3) {
        int var4 = 0;
        for (int var5 = 0; var5 < arg0; var5++) {
            if (arg2[arg1 + var5] == null) {
                arg2[arg1 + var5] = class40.field518;
            }
            var4 += arg2[arg1 + var5].field510;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg0; var8++) {
            class40 var9 = arg2[arg1 + var8];
            class28.method192(var9.field511, 0, var6, var7, var9.field510);
            var7 += var9.field510;
        }
        if (arg3 != -17476) {
            field205 = null;
        }
        class40 var10 = new class40();
        var10.field510 = var4;
        var10.field511 = var6;
        return var10;
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(BI)[B", line = 164)
    public static final synchronized byte[] method116(byte arg0, int arg1) {
        if (arg0 <= 61) {
            return (byte[]) null;
        } else if (arg1 == 100 && class6.field84 > 0) {
            byte[] var2 = class29.field424[--class6.field84];
            class29.field424[class6.field84] = null;
            return var2;
        } else if (arg1 == 5000 && class6.field71 > 0) {
            byte[] var3 = class29.field425[--class6.field71];
            class29.field425[class6.field71] = null;
            return var3;
        } else if (arg1 == 30000 && field207 > 0) {
            byte[] var4 = class41.field529[--field207];
            class41.field529[field207] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }
}
