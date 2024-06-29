import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class88 {

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field1715 = 128;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field1714 = 0;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "Led;")
    public static class43 field1711 = class191.method1219("lila:", false);

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "Led;")
    private static class43 field1717 = class191.method1219("RuneScape has been updated(Q", false);

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public static int field1721 = 0;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "Led;")
    private static class43 field1719 = class191.method1219("Please wait)3)3)3", false);

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "Led;")
    public static class43 field1710 = field1719;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "Led;")
    private static class43 field1720 = class191.method1219("Password: ", false);

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "Led;")
    public static class43 field1712 = field1720;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "Led;")
    public static class43 field1723 = class191.method1219("logo", false);

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "Led;")
    public static class43 field1722 = field1717;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "Led;")
    public static class43 field1724 = class191.method1219(" steht bereits auf Ihrer Ignorieren)2Liste(Q", false);

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "Z")
    public static boolean field1708;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static final void method527(int arg0) {
        field1713++;
        int var1 = -23 / ((arg0 - 32) / 61);
        for (int var2 = 0; var2 < class36.field650; var2++) {
            int var10002 = class76.field1503[var2]--;
            if (class76.field1503[var2] >= -10) {
                class8 var4 = class49.field995[var2];
                if (var4 == null) {
                    var4 = class8.method46(class182.field3597, class20.field346[var2], 0);
                    if (var4 == null) {
                        continue;
                    }
                    class76.field1503[var2] += var4.method45();
                    class49.field995[var2] = var4;
                }
                if (class76.field1503[var2] < 0) {
                    int var11;
                    if (class9.field168[var2] == 0) {
                        var11 = class14.field208;
                    } else {
                        int var5 = class9.field168[var2] >> 16 & 0xFF;
                        int var6 = (class9.field168[var2] & 0xFF) * 128;
                        int var7 = var5 * 128 + 64 - class67.field1348.field2347;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = class9.field168[var2] >> 8 & 0xFF;
                        int var9 = var8 * 128 + 64 - class67.field1348.field2328;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var7 + var9 - 128;
                        if (var6 < var10) {
                            class76.field1503[var2] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var11 = (var6 - var10) * class116.field2277 / var6;
                    }
                    if (var11 > 0) {
                        class62 var12 = var4.method44().method388(class103.field1955);
                        class195 var13 = class195.method1258(var12, 100, var11);
                        var13.method1266(class156.field3163[var2] - 1);
                        class185.field3638.method1183(var13);
                    }
                    class76.field1503[var2] = -100;
                }
            } else {
                class36.field650--;
                for (int var3 = var2; var3 < class36.field650; var3++) {
                    class20.field346[var3] = class20.field346[var3 + 1];
                    class49.field995[var3] = class49.field995[var3 + 1];
                    class156.field3163[var3] = class156.field3163[var3 + 1];
                    class76.field1503[var3] = class76.field1503[var3 + 1];
                    class9.field168[var3] = class9.field168[var3 + 1];
                }
                var2--;
            }
        }
        if (class40.field767 && !class75.method470(256)) {
            if (class41.field796 != 0 && class85.field1658 != -1) {
                class206.method1334(class85.field1658, true, class41.field796, class189.field3695, false, 0);
            }
            class40.field767 = false;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public static final void method528(byte arg0) {
        if (class48.field977 != null) {
            class48.field977.method522(-23002);
            class48.field977 = null;
        }
        field1716++;
        class115.method733(-1);
        class137.field2842.method1156();
        for (int var1 = 0; var1 < 4; var1++) {
            class147.field3011[var1].method975(16777215);
        }
        System.gc();
        class205.method1318((byte) -70, 2);
        class85.field1658 = -1;
        class40.field767 = false;
        class68.method425(0);
        if (arg0 > 21) {
            class35.method197((byte) -121, 10);
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V")
    public static void method529(byte arg0) {
        field1711 = null;
        field1723 = null;
        if (arg0 < 61) {
            return;
        }
        field1724 = null;
        field1719 = null;
        field1712 = null;
        field1720 = null;
        field1717 = null;
        field1722 = null;
        field1710 = null;
    }
}
