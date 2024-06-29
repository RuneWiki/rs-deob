import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class87 extends class124 {

    @OriginalMember(owner = "client!md", name = "eb", descriptor = "I")
    public int field2259 = -1;

    @OriginalMember(owner = "client!md", name = "mb", descriptor = "[S")
    private short[] field2267 = new short[6];

    @OriginalMember(owner = "client!md", name = "nb", descriptor = "I")
    private int field2268 = 0;

    @OriginalMember(owner = "client!md", name = "qb", descriptor = "[S")
    private short[] field2271 = new short[6];

    @OriginalMember(owner = "client!md", name = "cb", descriptor = "I")
    private int field2257 = 0;

    @OriginalMember(owner = "client!md", name = "tb", descriptor = "I")
    private int field2274 = 128;

    @OriginalMember(owner = "client!md", name = "wb", descriptor = "I")
    private int field2277 = 128;

    @OriginalMember(owner = "client!md", name = "yb", descriptor = "I")
    private int field2279 = 0;

    @OriginalMember(owner = "client!md", name = "db", descriptor = "Lrd;")
    public static class117 field2258 = class95.method812("*6n", (byte) 8);

    @OriginalMember(owner = "client!md", name = "kb", descriptor = "Lrd;")
    public static class117 field2265 = class95.method812(" x ", (byte) 8);

    @OriginalMember(owner = "client!md", name = "ob", descriptor = "Lrd;")
    private static class117 field2269 = class95.method812(" is already on your ignore list", (byte) 8);

    @OriginalMember(owner = "client!md", name = "ab", descriptor = "Lrd;")
    public static class117 field2255 = field2269;

    @OriginalMember(owner = "client!md", name = "rb", descriptor = "Lrd;")
    public static class117 field2272 = class95.method812("Das ist eine Mitglieder)2Welt(Q", (byte) 8);

    @OriginalMember(owner = "client!md", name = "sb", descriptor = "Lrd;")
    public static class117 field2273 = class95.method812("nicht hergestellt werden)3", (byte) 8);

    @OriginalMember(owner = "client!md", name = "jb", descriptor = "Lrd;")
    public static class117 field2264 = class95.method812("Ein kostenloses Spielkonto erstellen)3", (byte) 8);

    @OriginalMember(owner = "client!md", name = "ub", descriptor = "Lrd;")
    private static class117 field2275 = class95.method812("Drop", (byte) 8);

    @OriginalMember(owner = "client!md", name = "hb", descriptor = "Lrd;")
    public static class117 field2262 = field2275;

    @OriginalMember(owner = "client!md", name = "zb", descriptor = "Lrd;")
    public static class117 field2280 = class95.method812("Anmelde)2Zeitlimit -Uberschritten)3", (byte) 8);

    @OriginalMember(owner = "client!md", name = "Z", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!md", name = "bb", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!md", name = "fb", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!md", name = "gb", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!md", name = "ib", descriptor = "I")
    private int field2263;

    @OriginalMember(owner = "client!md", name = "lb", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!md", name = "pb", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!md", name = "xb", descriptor = "I")
    public int field2278;

    @OriginalMember(owner = "client!md", name = "vb", descriptor = "Lga;")
    public static class44 field2276;

    @OriginalMember(owner = "client!md", name = "Y", descriptor = "Lge;")
    public static class47 field2253;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILbf;)V")
    public final void method777(int arg0, class14 arg1) {
        while (true) {
            int var3 = arg1.method153(true);
            if (var3 == 0) {
                if (arg0 != -9) {
                    return;
                }
                field2254++;
                return;
            }
            this.method778(var3, arg1, (byte) 124);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILbf;B)V")
    private final void method778(int arg0, class14 arg1, byte arg2) {
        field2270++;
        int var4 = -67 % ((arg2 - 21) / 38);
        if (arg0 == 1) {
            this.field2263 = arg1.method138((byte) 84);
        } else if (arg0 == 2) {
            this.field2259 = arg1.method138((byte) 76);
        } else if (arg0 == 4) {
            this.field2274 = arg1.method138((byte) 76);
        } else if (arg0 == 5) {
            this.field2277 = arg1.method138((byte) 121);
        } else if (arg0 == 6) {
            this.field2279 = arg1.method138((byte) 126);
        } else if (arg0 == 7) {
            this.field2257 = arg1.method153(true);
        } else if (arg0 == 8) {
            this.field2268 = arg1.method153(true);
            return;
        } else if (arg0 >= 40 && arg0 < 50) {
            this.field2267[arg0 - 40] = (short) arg1.method138((byte) 125);
            return;
        } else if (arg0 >= 50 && arg0 < 60) {
            this.field2271[arg0 - 50] = (short) arg1.method138((byte) 77);
            return;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(Lge;ILge;Lge;)V")
    public static final void method779(class47 arg0, int arg1, class47 arg2, class47 arg3) {
        class44.field1240 = arg3;
        class148.field3618 = arg2;
        class53.field1518 = arg0;
        class77.field2090 = new class144[class53.field1518.method511(0)][];
        field2256++;
        if (arg1 <= 69) {
            field2280 = null;
        }
        class17.field431 = new boolean[class53.field1518.method511(0)];
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)Ldf;")
    public final class28 method780(int arg0, int arg1) {
        field2261++;
        class28 var3 = (class28) class57.field1591.method774((long) this.field2278, 329);
        if (var3 == null) {
            class11 var4 = class11.method79(class65.field1855, this.field2263, 0);
            if (var4 == null) {
                return null;
            }
            for (int var5 = 0; var5 < 6; var5++) {
                if (this.field2267[0] != 0) {
                    var4.method96(this.field2267[var5], this.field2271[var5]);
                }
            }
            var3 = var4.method78(this.field2257 + 64, this.field2268 + 850, -30, -50, -30);
            class57.field1591.method773((long) this.field2278, (byte) -17, var3);
        }
        if (arg0 != 6) {
            this.method780(-47, 2);
        }
        class28 var6;
        if (this.field2259 == -1 || arg1 == -1) {
            var6 = var3.method295(true);
        } else {
            var6 = class33.method387(this.field2259, 7455).method507(1272007632, var3, arg1);
        }
        if (this.field2274 != 128 || this.field2277 != 128) {
            var6.method287(this.field2274, this.field2277, this.field2274);
        }
        if (this.field2279 != 0) {
            if (this.field2279 == 90) {
                var6.method306();
            }
            if (this.field2279 == 180) {
                var6.method306();
                var6.method306();
            }
            if (this.field2279 == 270) {
                var6.method306();
                var6.method306();
                var6.method306();
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!md", name = "g", descriptor = "(I)V")
    public static void method781(int arg0) {
        field2275 = null;
        field2258 = null;
        field2280 = null;
        field2272 = null;
        field2264 = null;
        field2276 = null;
        field2253 = null;
        field2255 = null;
        field2265 = null;
        if (arg0 != -16209) {
            field2265 = null;
        }
        field2269 = null;
        field2262 = null;
        field2273 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)V")
    public static final void method782(byte arg0, int arg1) {
        if (arg0 <= 80) {
            field2264 = null;
        }
        field2260++;
        class26.method275(arg1, 0);
        class134.method1096(arg1, false);
    }
}
