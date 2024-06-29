import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class70 {

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "J")
    public long field1276 = 0L;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "[I")
    public static int[] field1266 = new int[14];

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "Lmb;")
    public static class160 field1278 = new class160();

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "Lcf;")
    private static class93 field1279 = class147.method1066("rating: ", -48);

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "Lcf;")
    public static class93 field1281 = field1279;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "[I")
    public static int[] field1282 = new int[32];

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public int field1267;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public int field1270;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public int field1271;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public int field1272;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public int field1273;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "Lgl;")
    public class211 field1269;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "Lgl;")
    public class211 field1274;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "[I")
    public static int[] field1280;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "[[[B")
    public static byte[][][] field1283;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIII)V")
    public static final void method472(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1284++;
        for (class43 var5 = (class43) field1278.method1151(112); var5 != null; var5 = (class43) field1278.method1159(30)) {
            class284.method1946(arg2, arg4, -1, arg0, var5, arg3);
        }
        for (class43 var6 = (class43) class58.field990.method1151(105); var6 != null; var6 = (class43) class58.field990.method1159(50)) {
            byte var11 = 1;
            class50 var12 = var6.field684.method1483(0);
            if (var6.field684.field3797 == var12.field800) {
                var11 = 0;
            } else if (var6.field684.field3797 == var12.field824 || var6.field684.field3797 == var12.field807 || var6.field684.field3797 == var12.field795 || var6.field684.field3797 == var12.field826) {
                var11 = 2;
            } else if (var6.field684.field3797 == var12.field820 || var6.field684.field3797 == var12.field806 || var6.field684.field3797 == var12.field818 || var6.field684.field3797 == var12.field799) {
                var11 = 3;
            }
            if (var6.field677 != var11) {
                int var13 = class267.method1786(arg1 + 22815, var6.field684);
                if (var6.field687 != var13) {
                    if (var6.field671 != null) {
                        class35.field543.method1657(var6.field671);
                        var6.field671 = null;
                    }
                    var6.field687 = var13;
                }
                var6.field677 = var11;
            }
            var6.field680 = var6.field684.field3868;
            var6.field679 = var6.field684.field3868 + var6.field684.method1475(false) * 64;
            var6.field674 = var6.field684.field3784;
            var6.field682 = var6.field684.field3784 + (var6.field684.method1475(false) * 64);
            class284.method1946(arg2, arg4, -1, arg0, var6, arg3);
        }
        if (arg1 != -22691) {
            method475((class93) null, false);
        }
        for (class43 var7 = (class43) class117.field2064.method132((byte) 103); var7 != null; var7 = (class43) class117.field2064.method136(-100)) {
            byte var8 = 1;
            class50 var9 = var7.field688.method1483(0);
            if (var7.field688.field3797 == var9.field800) {
                var8 = 0;
            } else if (var7.field688.field3797 == var9.field824 || var7.field688.field3797 == var9.field807 || var7.field688.field3797 == var9.field795 || var7.field688.field3797 == var9.field826) {
                var8 = 2;
            } else if (var7.field688.field3797 == var9.field820 || var7.field688.field3797 == var9.field806 || var7.field688.field3797 == var9.field818 || var7.field688.field3797 == var9.field799) {
                var8 = 3;
            }
            if (var7.field677 != var8) {
                int var10 = class68.method461(var7.field688, arg1 ^ 0xD1193DB1);
                if (var7.field687 != var10) {
                    if (var7.field671 != null) {
                        class35.field543.method1657(var7.field671);
                        var7.field671 = null;
                    }
                    var7.field687 = var10;
                }
                var7.field677 = var8;
            }
            var7.field680 = var7.field688.field3868;
            var7.field679 = var7.field688.field3868 + var7.field688.method1475(false) * 64;
            var7.field674 = var7.field688.field3784;
            var7.field682 = var7.field688.field3784 + var7.field688.method1475(false) * 64;
            class284.method1946(arg2, arg4, -1, arg0, var7, arg3);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
    public static void method473(byte arg0) {
        field1283 = null;
        field1278 = null;
        field1279 = null;
        field1266 = null;
        if (arg0 < 27) {
            field1268 = -31;
        }
        field1281 = null;
        field1282 = null;
        field1280 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZZZB)Lhg;")
    public static final class177 method474(int arg0, boolean arg1, boolean arg2, boolean arg3, byte arg4) {
        field1275++;
        if (arg4 <= 47) {
            method473((byte) -17);
        }
        class277 var5 = null;
        if (class68.field1243 != null) {
            var5 = new class277(arg0, class68.field1243, class278.field4980[arg0], 1000000);
        }
        class266.field4741[arg0] = class190.field3480.method550(255, var5, arg0, class162.field2860);
        if (arg3) {
            class266.field4741[arg0].method331(0);
        }
        return new class177(class266.field4741[arg0], arg2, arg1);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lcf;Z)V")
    public static final void method475(class93 arg0, boolean arg1) {
        field1277++;
        int var2 = class177.method1281(-1, arg0);
        if (var2 != -1) {
            if (arg1) {
                method473((byte) 28);
            }
            class193.method1386(660316969, class234.field4165.field2277[var2], class234.field4165.field2265[var2]);
        }
    }
}
