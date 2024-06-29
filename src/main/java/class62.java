import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class62 extends class70 {

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "Llc;")
    public static class69 field1279 = class69.method470((byte) -122, " (Xlevel)2");

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "I")
    public static int field1277 = 0;

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
    public static int field1278 = 0;

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "Llc;")
    public static class69 field1280 = class69.method470((byte) -101, "Loaded gamescreen");

    @OriginalMember(owner = "client!kb", name = "Q", descriptor = "I")
    public static int field1282 = 0;

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "Lfe;")
    public static class36 field1270 = new class36(50);

    @OriginalMember(owner = "client!kb", name = "S", descriptor = "I")
    public static int field1284 = 0;

    @OriginalMember(owner = "client!kb", name = "T", descriptor = "Z")
    public static volatile boolean field1285 = true;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!kb", name = "H", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "Lkb;")
    public class62 field1276;

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "Lkb;")
    public class62 field1281;

    @OriginalMember(owner = "client!kb", name = "F", descriptor = "[[[B")
    public static byte[][][] field1271;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(Z)V")
    public static void method374(boolean arg0) {
        if (arg0) {
            field1278 = -127;
        }
        field1271 = null;
        field1280 = null;
        field1270 = null;
        field1279 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[BI)Llc;")
    public static final class69 method375(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg1 != 0) {
            field1271 = null;
        }
        field1272++;
        class69 var4 = new class69();
        var4.field1488 = new byte[arg0];
        var4.field1523 = arg0;
        class48.method316(arg2, arg3, var4.field1488, 0, arg0);
        return var4;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLqd;Ljava/awt/Component;)V")
    public static final void method376(byte arg0, class99 arg1, Component arg2) {
        field1283++;
        try {
            class126 var3 = (class126) Class.forName("ta").getDeclaredConstructor().newInstance();
            var3.method929(arg1, 2048);
            class3.field70 = var3;
        } catch (Throwable var6) {
            try {
                class3.field70 = new class8(arg1, arg2);
            } catch (Throwable var5) {
                if (arg0 >= -15) {
                    method375(-53, -64, null, -7);
                }
                if (class99.field2180.toLowerCase().indexOf("microsoft") >= 0) {
                    try {
                        class3.field70 = new class109();
                        return;
                    } catch (Throwable var4) {
                    }
                }
                class3.field70 = new class101(8000);
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V")
    public static final void method377(int arg0) {
        if (arg0 != 14970) {
            method379(-5, (byte) 26, 108, -49, null);
        }
        field1268++;
        if (class121.field2627 == 0) {
            return;
        }
        int var1 = 0;
        if (class25.field539 != 0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < 100; var2++) {
            if (class36.field722[var2] != null) {
                int var3 = class72.field1603[var2];
                class69 var4 = class10.field214[var2];
                if (var4 != null && var4.method490(arg0 - 14852, class47.field989)) {
                    var4 = var4.method486(5, (byte) -102);
                }
                if (var4 != null && var4.method490(arg0 - 14847, class9.field191)) {
                    var4 = var4.method486(5, (byte) -102);
                }
                if ((var3 == 3 || var3 == 7) && (var3 == 7 || class17.field323 == 0 || class17.field323 == 1 && class72.method511(false, var4))) {
                    int var5 = 329 - var1 * 13;
                    var1++;
                    if (class101.field2193 > 4 && class74.field1666 - 4 > var5 - 10 && class74.field1666 - 4 <= var5 - -3) {
                        int var6 = class119.field2552.method298(class46.method305(20025, new class69[] { class26.field564, var4, class36.field722[var2] })) + 25;
                        if (var6 > 450) {
                            var6 = 450;
                        }
                        if (class101.field2193 < var6 + 4) {
                            if (class80.field1828 >= 1) {
                                class23.method149(arg0 ^ 0xFFFFC5D9, 0, class46.method305(20025, new class69[] { class70.field1562, var4 }), 2011, 0, 0);
                                class2.field6++;
                            }
                            class25.field522++;
                            class103.field2230++;
                            class23.method149(-93, 0, class46.method305(20025, new class69[] { class61.field1249, var4 }), 2010, 0, 0);
                            class23.method149(-14, 0, class46.method305(20025, new class69[] { class18.field382, var4 }), 2009, 0, 0);
                        }
                    }
                    if (var1 >= 5) {
                        return;
                    }
                }
                if ((var3 == 5 || var3 == 6) && class17.field323 < 2) {
                    var1++;
                    if (var1 >= 5) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)[Lcb;")
    public static final class15[] method378(int arg0) {
        field1269++;
        class15[] var1 = new class15[class51.field1119];
        for (int var2 = 0; var2 < class51.field1119; var2++) {
            class15 var3 = var1[var2] = new class15();
            var3.field277 = class19.field426;
            var3.field278 = class71.field1595;
            var3.field274 = class114.field2472[var2];
            var3.field276 = class90.field1952[var2];
            var3.field275 = class63.field1336[var2];
            var3.field280 = class108.field2343[var2];
            var3.field279 = class80.field1829;
            var3.field273 = class91.field1994[var2];
        }
        if (arg0 != 2009) {
            field1284 = -108;
        }
        class4.method21(-96);
        return var1;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBIILlb;)V")
    public static final void method379(int arg0, byte arg1, int arg2, int arg3, class68 arg4) {
        field1273++;
        int var5 = 115 / ((-arg1 - 27) / 45);
        if (class72.field1604 >= 400) {
            return;
        }
        if (arg4.field1462 != null) {
            arg4 = arg4.method453(124);
        }
        if (arg4 == null || !arg4.field1460) {
            return;
        }
        class69 var6 = arg4.field1468;
        if (arg4.field1475 != 0) {
            var6 = class46.method305(20025, new class69[] { var6, class106.method790(arg4.field1475, class46.field974.field1236, 8), field1279, class106.method791(arg4.field1475, (byte) -54), class112.field2432 });
        }
        if (class76.field1696 == 1) {
            class85.field1908++;
            class23.method149(-59, arg2, class46.method305(20025, new class69[] { class13.field261, class50.field1083, class40.field787, var6 }), 37, arg0, arg3);
        } else if (class60.field1248 != 1) {
            class54.field1150++;
            class69[] var7 = arg4.field1449;
            if (class79.field1798) {
                var7 = class110.method822(var7, 5410);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && !var7[var8].method474(false, class56.field1172)) {
                        class82.field1852++;
                        byte var9 = 0;
                        if (var8 == 0) {
                            var9 = 46;
                        }
                        if (var8 == 1) {
                            var9 = 41;
                        }
                        if (var8 == 2) {
                            var9 = 30;
                        }
                        if (var8 == 3) {
                            var9 = 13;
                        }
                        if (var8 == 4) {
                            var9 = 45;
                        }
                        class23.method149(-82, arg2, class46.method305(20025, new class69[] { var7[var8], class127.field2740, var6 }), var9, arg0, arg3);
                    }
                }
            }
            if (var7 != null) {
                for (int var10 = 4; var10 >= 0; var10--) {
                    if (var7[var10] != null && var7[var10].method474(false, class56.field1172)) {
                        class104.field2258++;
                        short var11 = 0;
                        int var12 = 0;
                        if (arg4.field1475 > class46.field974.field1236) {
                            var11 = 2000;
                        }
                        if (var10 == 0) {
                            var12 = var11 + 46;
                        }
                        if (var10 == 1) {
                            var12 = var11 + 41;
                        }
                        if (var10 == 2) {
                            var12 = var11 + 30;
                        }
                        if (var10 == 3) {
                            var12 = var11 + 13;
                        }
                        if (var10 == 4) {
                            var12 = var11 + 45;
                        }
                        class23.method149(85, arg2, class46.method305(20025, new class69[] { var7[var10], class127.field2740, var6 }), var12, arg0, arg3);
                    }
                }
            }
            class23.method149(79, arg2, class46.method305(20025, new class69[] { class9.field188, var6 }), 1003, arg0, arg3);
        } else if ((class127.field2743 & 0x2) == 2) {
            class67.field1423++;
            class23.method149(-35, arg2, class46.method305(20025, new class69[] { class101.field2186, class127.field2740, var6 }), 34, arg0, arg3);
            return;
        }
    }

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "(I)V")
    public final void method380(int arg0) {
        field1275++;
        if (arg0 < -46 && this.field1281 != null) {
            this.field1281.field1276 = this.field1276;
            this.field1276.field1281 = this.field1281;
            this.field1281 = null;
            this.field1276 = null;
        }
    }
}
