import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class240 {

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public int field3856;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    private int field3859;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
    public int field3863;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "Lvl;")
    public static class73 field3852;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
    public static final void method1689(int arg0) {
        field3853++;
        if (class207.field3240 == null) {
            return;
        }
        if (class200.field3150 < 10) {
            if (!class207.field3235.method506(0, class207.field3240.field614)) {
                class200.field3150 = class169.field2602.method495((byte) 47, class207.field3240.field614) / 10;
                return;
            }
            class136.method864(1);
            class200.field3150 = 10;
        }
        if (class200.field3150 == 10) {
            int[] var1 = new int[3];
            class207.field3241 = class207.field3240.field615 >> 6 << 6;
            class207.field3237 = class207.field3240.field607 >> 6 << 6;
            int var2 = -1;
            class207.field3247 = (class207.field3240.field630 >> 6 << 6) + 64 - class207.field3237;
            class207.field3242 = (class207.field3240.field613 >> 6 << 6) - (class207.field3241 - 64);
            int var3 = -1;
            if (class207.field3240.method300((class214.field3347.field3915 >> 7) + class113.field1653, (class214.field3347.field3920 >> 7) + class5.field77, (byte) -52, class148.field2204, var1)) {
                var2 = class207.field3237 + class207.field3247 - var1[2] - 1;
                var3 = var1[1] - class207.field3241;
            }
            if (!class83.field1263 && var3 >= 0 && class207.field3242 > var3 && var2 >= 0 && var2 < class207.field3247) {
                int var4 = var2 + (int) (Math.random() * 10.0D) - 5;
                int var5 = var3 + (int) (Math.random() * 10.0D) - 5;
                class229.field3544 = var4;
                class311.field4993 = var5;
            } else if (class286.field4633 == -1 || class33.field392 == -1) {
                class207.field3240.method303(var1, class207.field3240.field605 & 0x3FFF, (byte) -9, (class207.field3240.field605 & 0xFFFFC8D) >> 14);
                class229.field3544 = class207.field3237 + class207.field3247 - var1[2] - 1;
                class311.field4993 = var1[1] - class207.field3241;
            } else {
                class207.field3240.method303(var1, class33.field392, (byte) -9, class286.field4633);
                class83.field1263 = false;
                class33.field392 = -1;
                class286.field4633 = -1;
                if (var1 != null) {
                    class229.field3544 = class207.field3237 + class207.field3247 - var1[2] - 1;
                    class311.field4993 = var1[1] - class207.field3241;
                }
            }
            if (class207.field3240.field610 == 37) {
                class207.field3245 = 3.0F;
                class207.field3244 = 3.0F;
            } else if (class207.field3240.field610 == 50) {
                class207.field3245 = 4.0F;
                class207.field3244 = 4.0F;
            } else if (class207.field3240.field610 == 75) {
                class207.field3245 = 6.0F;
                class207.field3244 = 6.0F;
            } else if (class207.field3240.field610 == 100) {
                class207.field3245 = 8.0F;
                class207.field3244 = 8.0F;
            } else if (class207.field3240.field610 == 200) {
                class207.field3245 = 16.0F;
                class207.field3244 = 16.0F;
            } else {
                class207.field3245 = 8.0F;
                class207.field3244 = 8.0F;
            }
            class283.method1945(117);
            int var6 = class207.field3242 >> 6;
            class207.field3262 = new int[class181.field2859 + 1];
            int var7 = class207.field3247 >> 6;
            class207.field3263 = new byte[var6][var7][];
            class207.field3258 = new int[var6][var7][];
            class207.field3256 = new byte[var6][var7][];
            class207.field3261 = new int[var6][var7][];
            class207.field3255 = new byte[var6][var7][];
            class207.field3254 = new byte[var6][var7][];
            class207.field3253 = new byte[var6][var7][];
            class249.field4048 = new class220();
            class258.field4198 = new class309();
            int var8 = class251.field4111 >> 2 << 10;
            int var9 = class6.field87 >> 1;
            class207.method1434(var8, var9);
            class304.method2041(256, -96, 1024);
            class171.method1221(256, (byte) 40);
            class200.field3150 = 20;
        } else if (class200.field3150 == 20) {
            class183.method1298(42, new class170(class207.field3235.method490("underlay", arg0 + 82, class207.field3240.field614)));
            class200.field3150 = 30;
            class266.method1854(-127, true);
            class114.method753(true);
        } else if (class200.field3150 == 30) {
            class207.method1436(new class170(class207.field3235.method490("overlay", -1, class207.field3240.field614)));
            class200.field3150 = 40;
            class114.method753(true);
        } else if (class200.field3150 == 40) {
            class207.method1425(new class170(class207.field3235.method490("overlay2", -1, class207.field3240.field614)));
            class200.field3150 = 50;
            class114.method753(true);
        } else if (class200.field3150 == 50) {
            class207.method1428(new class170(class207.field3235.method490("loc", arg0 ^ 0x52, class207.field3240.field614)), class147.field2191);
            class200.field3150 = 60;
            class266.method1854(arg0 ^ 0x3F, true);
            class114.method753(true);
        } else if (class200.field3150 == 60) {
            if (class207.field3235.method488((byte) 109, class207.field3240.field614 + "_labels")) {
                if (!class207.field3235.method506(0, class207.field3240.field614 + "_labels")) {
                    return;
                }
                class207.field3239 = class50.method308((byte) -112, class147.field2191, class207.field3240.field614 + "_labels", class207.field3235);
            } else {
                class207.field3239 = new class118(0);
            }
            class207.method1437();
            class200.field3150 = 70;
            class114.method753(true);
        } else if (class200.field3150 == 70) {
            class127.field1818 = new class244(11, true, class304.field4831);
            class200.field3150 = 73;
            class266.method1854(-82, true);
            class114.method753(true);
        } else if (class200.field3150 == 73) {
            class201.field3176 = new class244(12, true, class304.field4831);
            class200.field3150 = 76;
            class266.method1854(-95, true);
            class114.method753(true);
        } else if (class200.field3150 == 76) {
            class260.field4224 = new class244(14, true, class304.field4831);
            class200.field3150 = 79;
            class266.method1854(-93, true);
            class114.method753(true);
        } else if (class200.field3150 == 79) {
            class62.field902 = new class244(17, true, class304.field4831);
            class200.field3150 = 82;
            class266.method1854(-101, true);
            class114.method753(true);
        } else if (~class200.field3150 == arg0) {
            class181.field2846 = new class244(19, true, class304.field4831);
            class200.field3150 = 85;
            class266.method1854(-120, true);
            class114.method753(true);
        } else if (class200.field3150 == 85) {
            class309.field4971 = new class244(22, true, class304.field4831);
            class200.field3150 = 88;
            class266.method1854(arg0 ^ 0x31, true);
            class114.method753(true);
        } else if (class200.field3150 == 88) {
            class22.field284 = new class244(26, true, class304.field4831);
            class200.field3150 = 91;
            class266.method1854(-126, true);
            class114.method753(true);
        } else {
            class222.field3478 = new class244(30, true, class304.field4831);
            class200.field3150 = 100;
            class266.method1854(-124, true);
            class114.method753(true);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
    public static void method1690(byte arg0) {
        if (arg0 != -98) {
            field3852 = null;
        }
        field3852 = null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lim;ZII)V")
    private final void method1691(class170 arg0, boolean arg1, int arg2, int arg3) {
        field3862++;
        if (arg3 == 1) {
            this.field3859 = arg0.method1186((byte) -73);
        } else if (arg3 == 2) {
            this.field3863 = arg0.method1218(-111);
            this.field3856 = arg0.method1218(-62);
        }
        if (arg1) {
            method1689(-22);
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)Lff;")
    public final class48 method1692(int arg0) {
        field3855++;
        class48 var2 = (class48) class38.field453.method1517((long) this.field3859, (byte) 116);
        if (var2 != null) {
            return var2;
        }
        class48 var3 = class62.method394(class169.field2600, -106, this.field3859, 0);
        if (var3 != null) {
            class38.field453.method1518(var3, (long) this.field3859, (byte) 75);
        }
        if (arg0 != -43) {
            this.field3863 = 72;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIB)V")
    public static final void method1693(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field3858++;
        if (arg4 != 45) {
            return;
        }
        if (arg1 > arg3) {
            for (int var5 = arg3; var5 < arg1; var5++) {
                class78.field1180[var5][arg0] = arg2;
            }
        } else {
            for (int var6 = arg1; var6 < arg3; var6++) {
                class78.field1180[var6][arg0] = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IILim;)V")
    public final void method1694(int arg0, int arg1, class170 arg2) {
        field3861++;
        int var4 = -30 % ((-arg0 - 38) / 49);
        while (true) {
            int var5 = arg2.method1218(-32);
            if (var5 == 0) {
                return;
            }
            this.method1691(arg2, false, arg1, var5);
        }
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)V")
    public static final void method1695(int arg0) {
        field3860++;
        if (arg0 != -1) {
            field3852 = null;
        }
        for (class97 var1 = (class97) class181.field2857.method1548(0); var1 != null; var1 = (class97) class181.field2857.method1549(-91)) {
            class179 var2 = var1.field1467;
            if (class148.field2204 != var2.field2818 || var2.field2805) {
                var1.method1764(arg0 ^ 0xFFFFFFBF);
            } else if (var2.field2798 <= class311.field4996) {
                var2.method1269((byte) -105, class135.field1949);
                if (var2.field2805) {
                    var1.method1764(64);
                } else {
                    class71.method464(var2.field2818, var2.field2799, var2.field2806, var2.field2819, 60, var2, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIII)V")
    public static final void method1696(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg2; var6 <= arg1; var6++) {
            class16.method97(-7, class78.field1180[var6], arg0, arg3, arg4);
        }
        if (arg5 != 28443) {
            field3852 = null;
        }
        field3854++;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIBLjava/lang/String;[B)I")
    public static final int method1697(int arg0, int arg1, int arg2, byte arg3, String arg4, byte[] arg5) {
        if (arg3 != -33) {
            method1695(-114);
        }
        int var6 = arg1 - arg2;
        field3857++;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg4.charAt(arg2 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg5[arg0 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg5[arg0 + var7] = -128;
            } else if (var8 == '‚') {
                arg5[arg0 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg5[arg0 + var7] = -125;
            } else if (var8 == '„') {
                arg5[arg0 + var7] = -124;
            } else if (var8 == '…') {
                arg5[arg0 + var7] = -123;
            } else if (var8 == '†') {
                arg5[arg0 + var7] = -122;
            } else if (var8 == '‡') {
                arg5[arg0 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg5[arg0 + var7] = -120;
            } else if (var8 == '‰') {
                arg5[arg0 + var7] = -119;
            } else if (var8 == 'Š') {
                arg5[arg0 + var7] = -118;
            } else if (var8 == '‹') {
                arg5[arg0 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg5[arg0 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg5[arg0 + var7] = -114;
            } else if (var8 == '‘') {
                arg5[arg0 + var7] = -111;
            } else if (var8 == '’') {
                arg5[arg0 + var7] = -110;
            } else if (var8 == '“') {
                arg5[arg0 + var7] = -109;
            } else if (var8 == '”') {
                arg5[arg0 + var7] = -108;
            } else if (var8 == '•') {
                arg5[arg0 + var7] = -107;
            } else if (var8 == '–') {
                arg5[arg0 + var7] = -106;
            } else if (var8 == '—') {
                arg5[arg0 + var7] = -105;
            } else if (var8 == '˜') {
                arg5[arg0 + var7] = -104;
            } else if (var8 == '™') {
                arg5[arg0 + var7] = -103;
            } else if (var8 == 'š') {
                arg5[arg0 + var7] = -102;
            } else if (var8 == '›') {
                arg5[arg0 + var7] = -101;
            } else if (var8 == 'œ') {
                arg5[arg0 + var7] = -100;
            } else if (var8 == 'ž') {
                arg5[arg0 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg5[arg0 + var7] = -97;
            } else {
                arg5[arg0 + var7] = 63;
            }
        }
        return var6;
    }
}
