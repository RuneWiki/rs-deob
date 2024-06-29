import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class190 extends class120 {

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "I")
    public int field3006 = 0;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "Ljava/lang/String;")
    public static String field2992 = "flash2:";

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "Llf;")
    public static class211 field2998 = new class211(64);

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "[Ljava/lang/String;")
    public static String[] field3013 = new String[200];

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
    public static int field3012 = 0;

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "I")
    public static int field3017 = 0;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    public int field2990;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
    public int field2994;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "I")
    public int field2999;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "I")
    public int field3001;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
    public int field3002;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
    public int field3003;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "I")
    public int field3007;

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "I")
    public int field3010;

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!vc", name = "P", descriptor = "I")
    public int field3016;

    @OriginalMember(owner = "client!vc", name = "R", descriptor = "I")
    public int field3018;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "Ltg;")
    public class181 field3000;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "Lbd;")
    public class186 field2991;

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "Lhc;")
    public static class229 field3011;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "Lta;")
    public class255 field2986;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "Lta;")
    public class255 field2989;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "Li;")
    public class56 field2996;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "Z")
    public boolean field2995;

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "[I")
    public int[] field3015;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "[Ljh;")
    public static class284[] field2993;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)V")
    public static final void method1330(int arg0, int arg1) {
        field3009++;
        if (arg0 == arg1) {
            return;
        }
        if (arg0 == 1) {
            class243.method1642((byte) 15);
        } else if (arg0 == 2) {
            class83.method579(false);
        } else if (arg0 == 3) {
            class60.method426(true);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1331(String arg0, int arg1) {
        field2988++;
        if (arg1 != -25922) {
            method1330(-61, -45);
        }
        int var2 = class4.method20(arg0, 23491);
        if (var2 != -1) {
            class69.method468(class107.field1644.field1096[var2], class107.field1644.field1105[var2], 0);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
    public final void method1332(byte arg0) {
        field2997++;
        if (arg0 > -33) {
            method1338(1);
        }
        int var2 = this.field3018;
        if (this.field3000 != null) {
            class181 var5 = this.field3000.method1268(256);
            if (var5 == null) {
                this.field3018 = -1;
                this.field2999 = 0;
                this.field3001 = 0;
                this.field3010 = 0;
                this.field3015 = null;
            } else {
                this.field3015 = var5.field2865;
                this.field3010 = var5.field2801;
                this.field3001 = var5.field2815;
                this.field2999 = var5.field2848 * 128;
                this.field3018 = var5.field2840;
            }
        } else if (this.field2996 != null) {
            int var3 = class258.method1773(this.field2996, -17921);
            if (var2 != var3) {
                this.field3018 = var3;
                class136 var4 = this.field2996.field793;
                if (var4.field1987 != null) {
                    var4 = var4.method928(12);
                }
                if (var4 == null) {
                    this.field2999 = 0;
                } else {
                    this.field2999 = var4.field1994 * 128;
                }
            }
        } else if (this.field2991 != null) {
            this.field3018 = class222.method1507(this.field2991, 0);
            this.field2999 = this.field2991.field2925 * 128;
        }
        if (this.field3018 != var2 && this.field2986 != null) {
            class130.field1907.method716(this.field2986);
            this.field2986 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
    public static final void method1333(int arg0) {
        field3004++;
        class218.field3542 = 0;
        class164.field2553 = 0;
        class3.method13(-3297);
        class245.method1653((byte) -125);
        class164.method1130((byte) 111);
        if (arg0 <= 31) {
            return;
        }
        for (int var1 = 0; var1 < class218.field3542; var1++) {
            int var3 = class178.field2775[var1];
            if (class111.field1684 != class100.field1566[var3].field1210) {
                if (class100.field1566[var3].field793.method924(true)) {
                    class5.method29(class100.field1566[var3], 25);
                }
                class100.field1566[var3].method411((class136) null, true);
                class100.field1566[var3] = null;
            }
        }
        if (class179.field2793 != class235.field3766.field349) {
            throw new RuntimeException("gnp1 pos:" + class235.field3766.field349 + " psize:" + class179.field2793);
        }
        for (int var2 = 0; var2 < class236.field3774; var2++) {
            if (class100.field1566[class248.field3967[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class236.field3774);
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILdl;)V")
    public static final void method1334(int arg0, class123 arg1) {
        field3008++;
        class102.field1589 = arg1.method813("p11_full", arg0 ^ 0x238A);
        class146.field2156 = arg1.method813("p12_full", arg0 ^ 0x238A);
        class232.field3727 = arg1.method813("b12_full", -1);
        class211.field3292 = arg1.method813("mapfunction", -1);
        class231.field3722 = arg1.method813("hitmarks", arg0 ^ 0x238A);
        class272.field4331 = arg1.method813("hitbar_default", -1);
        class79.field1129 = arg1.method813("headicons_pk", -1);
        class270.field4297 = arg1.method813("headicons_prayer", -1);
        class95.field1473 = arg1.method813("hint_headicons", -1);
        class163.field2534 = arg1.method813("hint_mapmarkers", arg0 + 9098);
        class145.field2139 = arg1.method813("mapflag", -1);
        class264.field4267 = arg1.method813("cross", -1);
        class219.field3559 = arg1.method813("mapdots", -1);
        if (arg0 != -9099) {
            field3017 = -2;
        }
        class206.field3218 = arg1.method813("scrollbar", -1);
        class219.field3560 = arg1.method813("name_icons", -1);
        class97.field1503 = arg1.method813("floorshadows", -1);
        class223.field3609 = arg1.method813("compass", -1);
        class48.field611 = arg1.method813("hint_mapedge", -1);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "()V")
    public static final void method1335() {
        if (class266.field4273 != null) {
            for (int var0 = 0; var0 < class266.field4273.length; var0++) {
                for (int var1 = 0; var1 < class158.field2433; var1++) {
                    for (int var2 = 0; var2 < class54.field749; var2++) {
                        class266.field4273[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class173.field2712 != null) {
            for (int var3 = 0; var3 < class173.field2712.length; var3++) {
                for (int var4 = 0; var4 < class158.field2433; var4++) {
                    for (int var5 = 0; var5 < class54.field749; var5++) {
                        class173.field2712[var3][var4][var5] = null;
                    }
                }
            }
        }
        class270.field4299 = 0;
        if (class17.field199 != null) {
            for (int var6 = 0; var6 < class270.field4299; var6++) {
                class17.field199[var6] = null;
            }
        }
        if (field2993 != null) {
            for (int var7 = 0; var7 < class243.field3890; var7++) {
                field2993[var7] = null;
            }
            class243.field3890 = 0;
        }
        if (class186.field2924 != null) {
            for (int var8 = 0; var8 < class186.field2924.length; var8++) {
                class186.field2924[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(Z)V")
    public static final void method1336(boolean arg0) {
        if (!arg0) {
            method1336(true);
        }
        field2987++;
        if (class181.field2806 == 0) {
            return;
        }
        try {
            if (++class216.field3537 > 2000) {
                if (class240.field3833 != null) {
                    class240.field3833.method1842(!arg0);
                    class240.field3833 = null;
                }
                if (class44.field568 >= 1) {
                    class173.field2723 = -5;
                    class181.field2806 = 0;
                    return;
                }
                class44.field568++;
                class181.field2806 = 1;
                class216.field3537 = 0;
                if (class198.field3109 == class177.field2760) {
                    class177.field2760 = class104.field1607;
                } else {
                    class177.field2760 = class198.field3109;
                }
            }
            if (class181.field2806 == 1) {
                class286.field4541 = class2.field23.method140(-6412, class34.field442, class177.field2760);
                class181.field2806 = 2;
            }
            if (class181.field2806 == 2) {
                if (class286.field4541.field3247 == 2) {
                    throw new IOException();
                }
                if (class286.field4541.field3247 != 1) {
                    return;
                }
                class240.field3833 = new class273((Socket) class286.field4541.field3249, class2.field23);
                class286.field4541 = null;
                class240.field3833.method1843(-107, class13.field165.field339, class13.field165.field349, 0);
                if (class239.field3821 != null) {
                    class239.field3821.method402(83);
                }
                if (class54.field739 != null) {
                    class54.field739.method402(18);
                }
                int var1 = class240.field3833.method1839((byte) -98);
                if (class239.field3821 != null) {
                    class239.field3821.method402(78);
                }
                if (class54.field739 != null) {
                    class54.field739.method402(58);
                }
                if (var1 != 21) {
                    class173.field2723 = var1;
                    class181.field2806 = 0;
                    class240.field3833.method1842(false);
                    class240.field3833 = null;
                    return;
                }
                class181.field2806 = 3;
            }
            if (class181.field2806 == 3) {
                if (class240.field3833.method1840((byte) 116) < 1) {
                    return;
                }
                class23.field286 = new String[class240.field3833.method1839((byte) -64)];
                class181.field2806 = 4;
            }
            if (class181.field2806 == 4 && class240.field3833.method1840((byte) 116) >= class23.field286.length * 8) {
                class235.field3766.field349 = 0;
                class240.field3833.method1841(-1, class235.field3766.field339, class23.field286.length * 8, 0);
                for (int var2 = 0; var2 < class23.field286.length; var2++) {
                    class23.field286[var2] = class98.method655(class235.field3766.method218(1728901472), 0);
                }
                class173.field2723 = 21;
                class181.field2806 = 0;
                class240.field3833.method1842(false);
                class240.field3833 = null;
            }
        } catch (IOException var3) {
            if (class240.field3833 != null) {
                class240.field3833.method1842(!arg0);
                class240.field3833 = null;
            }
            if (class44.field568 < 1) {
                class216.field3537 = 0;
                if (class198.field3109 == class177.field2760) {
                    class177.field2760 = class104.field1607;
                } else {
                    class177.field2760 = class198.field3109;
                }
                class181.field2806 = 1;
                class44.field568++;
            } else {
                class173.field2723 = -4;
                class181.field2806 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZ)I")
    public static final int method1337(int arg0, boolean arg1) {
        if (arg1) {
            method1331((String) null, -125);
        }
        field3014++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)V")
    public static void method1338(int arg0) {
        field2998 = null;
        field3011 = null;
        field3013 = null;
        field2993 = null;
        if (arg0 != 11093) {
            method1333(-3);
        }
        field2992 = null;
    }
}
