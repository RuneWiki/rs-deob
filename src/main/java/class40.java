import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class40 {

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Ljava/lang/Object;")
    public static Object field925 = new Object();

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "Lja;")
    private static class62 field934 = class30.method243(43, "Loaded sprites");

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "Lja;")
    public static class62 field931 = class30.method243(43, "Unerwartete Antwort vom Anmelde)2Server");

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "Lja;")
    public static class62 field935 = class30.method243(43, "<col=80ff00>");

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "Lja;")
    public static class62 field933 = class30.method243(43, "Okay");

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "[[[I")
    public static int[][][] field927 = new int[4][13][13];

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field929 = 0;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "Lja;")
    private static class62 field938 = class30.method243(43, " is already on your ignore list");

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "Lja;")
    public static class62 field930 = field938;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "Lja;")
    public static class62 field937 = field934;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "Lq;")
    public static class114 field939;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "Lqd;")
    public static class115 field936;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "[Lic;")
    public static class58[] field928;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)[Lq;")
    public static final class114[] method297(byte arg0) {
        field924++;
        class114[] var1 = new class114[class56.field1380];
        for (int var2 = 0; var2 < class56.field1380; var2++) {
            class114 var3 = var1[var2] = new class114();
            var3.field2622 = class10.field256;
            var3.field2621 = class16.field377;
            var3.field2623 = class57.field1397[var2];
            var3.field2619 = class143.field3335[var2];
            var3.field2625 = class23.field539[var2];
            var3.field2624 = class17.field395[var2];
            var3.field2618 = class136.field3146;
            var3.field2620 = class82.field1986[var2];
        }
        if (arg0 == -52) {
            class142.method1125(arg0 + 2209);
            return var1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IBIII)V")
    public static final void method298(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= 51) {
            field932 = -19;
        }
        for (int var5 = 0; var5 < class102.field2371; var5++) {
            if (class13.field313[var5] + class130.field2979[var5] > arg2 && arg2 + arg3 > class13.field313[var5] && arg0 < class34.field824[var5] + class111.field2558[var5] && class34.field824[var5] < arg0 + arg4) {
                class134.field3070[var5] = true;
            }
        }
        field921++;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZI)Lge;")
    public static final class47 method299(boolean arg0, int arg1) {
        class47 var2 = (class47) class31.field757.method129((long) arg1, 24838);
        field923++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class70.field1798.method867(arg1, 15, 0);
        if (var3 == null) {
            return null;
        }
        class47 var4 = new class47();
        class128 var5 = new class128(var3);
        var5.field2873 = var5.field2874.length - 12;
        int var6 = 0;
        int var7 = var5.method1037(18834);
        var4.field1076 = var5.method1041(212464720);
        var4.field1074 = var5.method1041(212464720);
        var4.field1075 = var5.method1041(212464720);
        var4.field1083 = var5.method1041(212464720);
        var5.field2873 = 0;
        if (!arg0) {
            method299(false, 11);
        }
        var4.field1069 = var5.method1017(-1);
        var4.field1089 = new int[var7];
        var4.field1078 = new int[var7];
        var4.field1090 = new class62[var7];
        while (var5.field2874.length - 12 > var5.field2873) {
            int var8 = var5.method1041(212464720);
            if (var8 == 3) {
                var4.field1090[var6] = var5.method1015((byte) -127);
            } else if (var8 >= 100 || var8 == 21 || var8 == 38 || var8 == 39) {
                var4.field1078[var6] = var5.method1025(255);
            } else {
                var4.field1078[var6] = var5.method1037(18834);
            }
            var4.field1089[var6++] = var8;
        }
        class31.field757.method128((byte) -85, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lpd;I)V")
    public static final void method300(class108 arg0, int arg1) {
        field922++;
        class31.field752 = arg0;
        if (arg1 != 13) {
            method300(null, -41);
        }
        class97.field2257 = class31.field752.method864(arg1 - 13, 16);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public static void method301(int arg0) {
        field928 = null;
        field935 = null;
        field937 = null;
        field931 = null;
        field936 = null;
        field939 = null;
        if (arg0 != -26800) {
            return;
        }
        field933 = null;
        field938 = null;
        field934 = null;
        field930 = null;
        field927 = null;
        field925 = null;
    }
}
