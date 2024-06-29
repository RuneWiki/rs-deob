import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public abstract class class375 {

    @OriginalMember(owner = "client!br", name = "e", descriptor = "I")
    public static int field5347 = 0;

    @OriginalMember(owner = "client!br", name = "b", descriptor = "Lec;")
    public static class40 field5344 = new class40("Loading fonts - ", "Lade Schriftsätze - ", "Chargement des polices - ", "Carregando fontes - ");

    @OriginalMember(owner = "client!br", name = "j", descriptor = "Lsd;")
    public static class74 field5352;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "I")
    public static int field5343;

    @OriginalMember(owner = "client!br", name = "c", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!br", name = "f", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!br", name = "h", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!br", name = "d", descriptor = "Lg;")
    public static class470 field5346;

    @OriginalMember(owner = "client!br", name = "g", descriptor = "Lg;")
    public static class470 field5349;

    @OriginalMember(owner = "client!br", name = "i", descriptor = "Lg;")
    public static class470 field5351;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IZIII)Llp;")
    public static final class68 method2261(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field5350++;
        class68 var5 = new class68();
        var5.field850 = arg0;
        if (arg4 != 65536) {
            method2264(123, 56, 86, 28);
        }
        var5.field844 = arg3;
        class369.field5270.method234(-56, (long) arg2, var5);
        class445.method2621(arg0, (byte) 88);
        class256 var6 = class399.method2387(arg2, arg4 - 1857232560);
        if (var6 != null) {
            class398.method2383(var6, 85);
        }
        if (class345.field4934 != null) {
            class398.method2383(class345.field4934, 19);
            class345.field4934 = null;
        }
        class460.method2712((byte) -111);
        if (var6 != null) {
            class442.method2608(var6, arg4 ^ 0xFFFEFFC2, !arg1);
        }
        if (!arg1) {
            class396.method2373(arg0);
        }
        if (!arg1 && class57.field725 != -1) {
            class340.method2065(arg4 ^ 0x10000, 1, class57.field725);
        }
        return var5;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "([BZ)V")
    public abstract void method1226(byte[] arg0, boolean arg1);

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method2262(boolean arg0, String arg1) {
        if (arg0) {
            System.out.println("Error: " + class328.method1993("\n", arg1, "%0a", -1));
            field5345++;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IILlc;I)Lih;")
    public static final class354 method2263(int arg0, int arg1, class135 arg2, int arg3) {
        field5348++;
        int var4 = arg2.field1632 | arg0 << 8;
        if (arg3 > -15) {
            method2265(53);
        }
        class354 var5 = (class354) class420.field6049.method1599((byte) 13, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = client.field3937.method2779(1, client.field3937.method2747((byte) -105, var4));
        if (var6 == null) {
            int var8 = arg1 + 65536 << 8 | arg2.field1632;
            class354 var9 = (class354) class420.field6049.method1599((byte) 13, (long) var8 << 16);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = client.field3937.method2779(1, client.field3937.method2747((byte) -121, var8));
            if (var10 == null) {
                int var12 = arg2.field1632 | 0xFFFF00;
                class354 var13 = (class354) class420.field6049.method1599((byte) 13, (long) var12 << 16);
                if (var13 != null) {
                    return var13;
                }
                byte[] var14 = client.field3937.method2779(1, client.field3937.method2747((byte) -82, var12));
                if (var14 == null) {
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class354 var15 = class21.method135(var14, -91);
                    var15.field5084 = arg2;
                    class420.field6049.method1597(var15, (long) var12 << 16, -30892);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class354 var11 = class21.method135(var10, 9);
                var11.field5084 = arg2;
                class420.field6049.method1597(var11, (long) var8 << 16, -30892);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class354 var7 = class21.method135(var6, 106);
            var7.field5084 = arg2;
            class420.field6049.method1597(var7, (long) var4 << 16, -30892);
            return var7;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IIII)I")
    public static final int method2264(int arg0, int arg1, int arg2, int arg3) {
        field5343++;
        if (class398.field5667 == null) {
            return 0;
        }
        if (arg0 != -1547) {
            method2265(-22);
        }
        int var4 = arg3 >> 7;
        int var5 = arg1 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > (class159.field1895 - 1) || class289.field4316 - 1 < var5) {
            return 0;
        }
        int var6 = arg2;
        if (arg2 < 3 && (class140.field1686[1][var4][var5] & 0x2) != 0) {
            var6 = arg2 + 1;
        }
        return class398.field5667[var6].method1857(arg3, arg1);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)[B")
    public abstract byte[] method1227(int arg0);

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(I)V")
    public static void method2265(int arg0) {
        field5349 = null;
        field5346 = null;
        if (arg0 != -1) {
            field5347 = 86;
        }
        field5352 = null;
        field5344 = null;
        field5351 = null;
    }

    static {
        new class40("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
        field5352 = new class74(71, -2);
    }
}
