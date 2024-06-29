import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class114 {

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "Ldn;")
    private class243 field1707;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "Ljm;")
    private class251 field1714;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "Lfl;")
    private class239 field1711;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "Z")
    public static boolean field1706 = false;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
    public static int field1717 = 0;

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "I")
    public static int field1720 = 0;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "Lqg;")
    public static class256 field1709 = new class256();

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
    public static volatile int field1721 = -1;

    @OriginalMember(owner = "client!ji", name = "y", descriptor = "Ljava/lang/String;")
    public static String field1724 = "flash2:";

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!ji", name = "x", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "Lim;")
    private class192 field1708;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "[Lki;")
    private class173[] field1715;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "[[[I")
    public static int[][][] field1704;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lkb;Z)V", line = 6)
    public static final void method787(class39 arg0, boolean arg1) {
        class44.field601 = class200.method1468(0, arg0, 20702, class99.field1514);
        class59.field783 = class305.method2132(class92.field1423, arg0, 256, 0);
        class337.field5235 = class305.method2132(class79.field1192, arg0, 256, 0);
        field1701++;
        class338.field5243 = class305.method2132(class179.field2891, arg0, 256, 0);
        class46.field629 = class305.method2132(class99.field1519, arg0, 256, 0);
        class158.field2431 = class305.method2132(class200.field3280, arg0, 256, 0);
        class149.field2266 = class305.method2132(class157.field2422, arg0, 256, 0);
        class31.field435 = class308.method2159(class300.field4698, 256, 0, arg0);
        class336.field5217 = class62.method420(0, class308.field4817, arg0, 78);
        class101.field1534 = class62.method420(0, class342.field5331, arg0, 77);
        class63.field828 = class183.method1260((byte) -128, arg0, 0, class168.field2696);
        class256.field4061 = class183.method1260((byte) -125, arg0, 0, class233.field3717);
        class99.field1516.method992(class256.field4061, (int[]) null);
        class295.field4628.method992(class256.field4061, (int[]) null);
        class55.field732.method992(class256.field4061, (int[]) null);
        if (class186.field2991) {
            class32.field443 = class35.method226(0, (byte) -87, class74.field991, arg0);
            for (int var2 = 0; var2 < class32.field443.length; var2++) {
                class32.field443[var2].method852();
            }
        }
        class298 var3 = class39.method249(arg0, 0, 0, class74.field1002);
        var3.method2079();
        if (class186.field2991) {
            class4.field32 = new class14(var3);
        } else {
            class4.field32 = var3;
        }
        class298[] var4 = class200.method1468(0, arg0, 20702, class300.field4699);
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method2079();
        }
        if (class186.field2991) {
            class152.field2336 = new class321[var4.length];
            for (int var6 = 0; var6 < var4.length; var6++) {
                class152.field2336[var6] = new class14(var4[var6]);
            }
        } else {
            class152.field2336 = var4;
        }
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * 41.0D) - 20;
        int var11 = 0;
        if (!arg1) {
            return;
        }
        while (var11 < class44.field601.length) {
            class44.field601[var11].method2081(var7 + var10, var8 + var10, var9 + var10);
            var11++;
        }
        if (class186.field2991) {
            class208.field3410 = new class321[class44.field601.length];
            for (int var12 = 0; var12 < class44.field601.length; var12++) {
                class208.field3410[var12] = new class14(class44.field601[var12]);
            }
        } else {
            class208.field3410 = class44.field601;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lim;I)Lbg;", line = 105)
    public static final class218 method788(class192 arg0, int arg1) {
        field1722++;
        class218 var2 = new class218();
        var2.field3498 = arg0.method1396(arg1 - 123);
        if (arg1 != 0) {
            field1724 = (String) null;
        }
        var2.field3496 = class21.method137(var2.field3498, (byte) 92);
        return var2;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V", line = 122)
    public static void method789(int arg0) {
        field1724 = null;
        int var1 = -98 / ((arg0 + 24) / 52);
        field1709 = null;
        field1704 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Llc;IILlc;)Lki;", line = 133)
    public final class173 method790(class176 arg0, int arg1, int arg2, class176 arg3) {
        if (arg1 == -6620) {
            field1712++;
            return this.method792(arg0, 5, true, arg2, arg3);
        } else {
            return (class173) null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)V", line = 146)
    public static final void method791(int arg0, int arg1, int arg2) {
        if (arg1 != -13732) {
            return;
        }
        for (int var3 = 0; var3 < class92.field1424; var3++) {
            class291 var4 = class226.method1651(var3, (byte) 80);
            if (var4 != null) {
                int var5 = var4.field4586;
                if (var5 >= 0 && !class25.field365.method374(1, var5)) {
                    var5 = -1;
                }
                int var6;
                if (var4.field4595 >= 0) {
                    int var10 = var4.field4595;
                    int var11 = (var10 & 0x7F) + arg2;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (var10 & 0x380) + (arg0 + var10 & 0xFC00) + var11;
                    var6 = class25.field368[class221.method1612(96, -120, var12)];
                } else if (var5 >= 0) {
                    var6 = class25.field368[class221.method1612(96, -123, class25.field365.method376((byte) -120, var5))];
                } else if (var4.field4588 == -1) {
                    var6 = -1;
                } else {
                    int var7 = var4.field4588;
                    int var8 = (var7 & 0x7F) + arg2;
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 127) {
                        var8 = 127;
                    }
                    int var9 = (arg0 + var7 & 0xFC00) + (var7 & 0x380) + var8;
                    var6 = class25.field368[class221.method1612(96, arg1 + 13650, var9)];
                }
                class209.field3423[var3 + 1] = var6;
            }
        }
        field1705++;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Llc;IZILlc;)Lki;", line = 224)
    private final class173 method792(class176 arg0, int arg1, boolean arg2, int arg3, class176 arg4) {
        field1710++;
        if (this.field1708 == null) {
            throw new RuntimeException();
        }
        this.field1708.field3129 = arg3 * 8 + arg1;
        if (this.field1708.field3128.length <= this.field1708.field3129) {
            throw new RuntimeException();
        } else if (this.field1715[arg3] == null) {
            int var6 = this.field1708.method1354((byte) 45);
            int var7 = this.field1708.method1354((byte) -117);
            class173 var8 = new class173(arg3, arg4, arg0, this.field1707, this.field1714, var6, var7, arg2);
            this.field1715[arg3] = var8;
            return var8;
        } else {
            return this.field1715[arg3];
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)V", line = 261)
    public static final void method793(int arg0, int arg1) {
        if (class263.field4172 == arg0 && arg0 != 0) {
            class220 var2 = class111.field1657[arg0];
            var2.method301(class292.field4603);
        }
        field1713++;
        if (arg1 != 0) {
            field1704 = (int[][][]) ((int[][][]) null);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)Z", line = 286)
    public final boolean method794(boolean arg0) {
        field1702++;
        if (this.field1708 != null) {
            return true;
        }
        if (this.field1711 == null) {
            if (this.field1707.method1721((byte) 65)) {
                return false;
            }
            this.field1711 = this.field1707.method1715(true, 255, (byte) 101, 255, (byte) 0);
        }
        if (arg0) {
            method791(127, 119, 77);
        }
        if (this.field1711.field624) {
            return false;
        } else {
            this.field1708 = new class192(this.field1711.method308((byte) 116));
            this.field1715 = new class173[(this.field1708.field3128.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V", line = 325)
    public static final void method795(int arg0) {
        field1718++;
        if (class152.field2329 || class71.field917 == 2) {
            return;
        }
        try {
            class72.method470("tbrefresh", (byte) -122, class320.field4997);
            if (arg0 <= 1) {
                method791(89, -119, -118);
            }
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V", line = 347)
    public final void method796(byte arg0) {
        field1716++;
        if (this.field1715 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field1715.length; var2++) {
            if (this.field1715[var2] != null) {
                this.field1715[var2].method1191(false);
            }
        }
        for (int var3 = 0; var3 < this.field1715.length; var3++) {
            if (this.field1715[var3] != null) {
                this.field1715[var3].method1186((byte) 101);
            }
        }
        if (arg0 >= -97) {
            field1706 = true;
        }
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Ldn;Ljm;)V", line = 382)
    public class114(class243 arg0, class251 arg1) {
        this.field1707 = arg0;
        this.field1714 = arg1;
        if (!this.field1707.method1721((byte) 65)) {
            this.field1711 = this.field1707.method1715(true, 255, (byte) 101, 255, (byte) 0);
        }
    }
}
