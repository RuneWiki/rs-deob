import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class61 {

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field1028 = 1;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "D")
    public static double field1031 = -1.0D;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field1030 = 127;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "Lr;")
    public static class66 field1029 = class93.method641(43, ")1");

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "[I")
    public static int[] field1038 = new int[2000];

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "Lr;")
    public static class66 field1037 = class93.method641(43, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field1033 = 0;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "Lr;")
    public static class66 field1039 = class93.method641(43, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "Ltg;")
    public static class215 field1032 = new class215(512);

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "Ljk;")
    public static class196 field1027;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([II)[I")
    public static final int[] method395(int[] arg0, int arg1) {
        field1036++;
        if (arg1 > -28) {
            return null;
        } else if (arg0 == null) {
            return null;
        } else {
            int[] var2 = new int[arg0.length];
            class46.method332(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZ)I")
    public static final int method396(int arg0, boolean arg1) {
        if (arg1) {
            method397(30);
        }
        field1034++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public static void method397(int arg0) {
        field1027 = null;
        field1037 = null;
        field1038 = null;
        if (arg0 != 0) {
            field1027 = null;
        }
        field1029 = null;
        field1032 = null;
        field1039 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public static final void method398(byte arg0) {
        int var1 = -62 / (-arg0 / 39);
        field1035++;
        for (class159 var2 = (class159) class63.field1209.method873((byte) 76); var2 != null; var2 = (class159) class63.field1209.method870((byte) 10)) {
            class97 var3 = var2.field2859;
            if (class196.field3401 != var3.field1904 || var3.field1890 < class75.field1501) {
                var2.method560(-17554);
            } else if (class75.field1501 >= var3.field1875) {
                if (var3.field1899 > 0) {
                    class37 var4 = class178.field3112[var3.field1899 - 1];
                    if (var4 != null && var4.field2077 >= 0 && var4.field2077 < 13312 && var4.field2053 >= 0 && var4.field2053 < 13312) {
                        var3.method667(var4.field2077, (byte) -8, var4.field2053, class45.method327(var4.field2077, var3.field1904, var4.field2053, false) - var3.field1902, class75.field1501);
                    }
                }
                if (var3.field1899 < 0) {
                    int var5 = -var3.field1899 - 1;
                    class45 var6;
                    if (class49.field882 == var5) {
                        var6 = class207.field3595;
                    } else {
                        var6 = class59.field988[var5];
                    }
                    if (var6 != null && var6.field2077 >= 0 && var6.field2077 < 13312 && var6.field2053 >= 0 && var6.field2053 < 13312) {
                        var3.method667(var6.field2077, (byte) -103, var6.field2053, class45.method327(var6.field2077, var3.field1904, var6.field2053, false) - var3.field1902, class75.field1501);
                    }
                }
                var3.method669(class193.field3347, false);
                class159.method1084(class196.field3401, (int) var3.field1888, (int) var3.field1880, (int) var3.field1872, 60, var3, var3.field1889, -1L, false);
            }
        }
    }
}
