import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class173 extends class277 {

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "I")
    private int field2757 = 0;

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "Lol;")
    private class246 field2761 = new class246(16);

    @OriginalMember(owner = "client!ki", name = "Q", descriptor = "I")
    private int field2778 = 0;

    @OriginalMember(owner = "client!ki", name = "S", descriptor = "Lqg;")
    private class256 field2780 = new class256();

    @OriginalMember(owner = "client!ki", name = "U", descriptor = "J")
    private long field2782 = 0L;

    @OriginalMember(owner = "client!ki", name = "J", descriptor = "I")
    private int field2771;

    @OriginalMember(owner = "client!ki", name = "M", descriptor = "Llc;")
    private class176 field2774;

    @OriginalMember(owner = "client!ki", name = "P", descriptor = "Z")
    private boolean field2777;

    @OriginalMember(owner = "client!ki", name = "R", descriptor = "Lqg;")
    private class256 field2779;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "Llc;")
    private class176 field2754;

    @OriginalMember(owner = "client!ki", name = "L", descriptor = "I")
    private int field2773;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
    private int field2751;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "Ldn;")
    private class243 field2752;

    @OriginalMember(owner = "client!ki", name = "T", descriptor = "Z")
    private boolean field2781;

    @OriginalMember(owner = "client!ki", name = "A", descriptor = "Ljm;")
    private class251 field2762;

    @OriginalMember(owner = "client!ki", name = "K", descriptor = "Ltc;")
    private class46 field2772;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    public static int field2750 = 0;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2748 = "Select";

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "[I")
    public static int[] field2746 = new int[99];

    @OriginalMember(owner = "client!ki", name = "E", descriptor = "I")
    public static int field2766 = 0;

    @OriginalMember(owner = "client!ki", name = "G", descriptor = "Ljava/lang/String;")
    public static String field2768 = "Examine";

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!ki", name = "x", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!ki", name = "y", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!ki", name = "B", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!ki", name = "C", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!ki", name = "D", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!ki", name = "I", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!ki", name = "N", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!ki", name = "H", descriptor = "Lwf;")
    private class64 field2769;

    @OriginalMember(owner = "client!ki", name = "O", descriptor = "Z")
    private boolean field2776;

    @OriginalMember(owner = "client!ki", name = "F", descriptor = "[B")
    private byte[] field2767;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZII)Ltc;", line = 5)
    private final class46 method1178(boolean arg0, int arg1, int arg2) {
        field2744++;
        class46 var4 = (class46) this.field2761.method1743((long) arg2, (byte) 11);
        if (var4 != null && arg1 == 0 && !var4.field626 && var4.field624) {
            var4.method465((byte) -122);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field2774 == null || this.field2767[arg2] == -1) {
                    if (this.field2752.method1721((byte) 65)) {
                        return null;
                    }
                    var4 = this.field2752.method1715(true, arg2, (byte) 101, this.field2771, (byte) 2);
                } else {
                    var4 = this.field2762.method1770(31932, this.field2774, arg2);
                }
            } else if (arg1 == 1) {
                if (this.field2774 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field2762.method1782(!arg0, arg2, this.field2774);
            } else if (arg1 == 2) {
                if (this.field2774 == null) {
                    throw new RuntimeException();
                }
                if (this.field2767[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field2752.method1722((byte) -66)) {
                    return null;
                }
                var4 = this.field2752.method1715(false, arg2, (byte) 101, this.field2771, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field2761.method1750(var4, (byte) 123, (long) arg2);
        }
        if (var4.field624) {
            return null;
        } else if (arg0) {
            return (class46) null;
        } else {
            byte[] var5 = var4.method308((byte) 124);
            if (!var4 instanceof class66) {
                try {
                    if (var5 == null || var5.length <= 2) {
                        throw new RuntimeException();
                    }
                    class99.field1505.reset();
                    class99.field1505.update(var5, 0, var5.length - 2);
                    int var10 = (int) class99.field1505.getValue();
                    if (this.field2769.field837[arg2] != var10) {
                        throw new RuntimeException();
                    }
                    this.field2752.field3877 = 0;
                    this.field2752.field3878 = 0;
                } catch (RuntimeException var14) {
                    this.field2752.method1726(-85);
                    var4.method465((byte) -122);
                    if (var4.field626 && !this.field2752.method1721((byte) 65)) {
                        class239 var12 = this.field2752.method1715(true, arg2, (byte) 101, this.field2771, (byte) 2);
                        this.field2761.method1750(var12, (byte) 119, (long) arg2);
                    }
                    return null;
                }
                var5[var5.length - 2] = (byte) (this.field2769.field849[arg2] >>> 8);
                var5[var5.length - 1] = (byte) this.field2769.field849[arg2];
                if (this.field2774 != null) {
                    this.field2762.method1772(this.field2774, var5, true, arg2);
                    if (this.field2767[arg2] != 1) {
                        this.field2757++;
                        this.field2767[arg2] = 1;
                    }
                }
                if (!var4.field626) {
                    var4.method465((byte) -122);
                }
                return var4;
            }
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class99.field1505.reset();
                class99.field1505.update(var5, 0, var5.length - 2);
                int var6 = (int) class99.field1505.getValue();
                if (this.field2769.field837[arg2] != var6) {
                    throw new RuntimeException();
                }
                int var7 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
                if ((this.field2769.field849[arg2] & 0xFFFF) != var7) {
                    throw new RuntimeException();
                }
                if (this.field2767[arg2] != 1) {
                    if (this.field2767[arg2] == 0) {
                    }
                    this.field2757++;
                    this.field2767[arg2] = 1;
                }
                if (!var4.field626) {
                    var4.method465((byte) -122);
                }
                return var4;
            } catch (Exception var13) {
                this.field2767[arg2] = -1;
                var4.method465((byte) -122);
                if (var4.field626 && !this.field2752.method1721((byte) 65)) {
                    class239 var9 = this.field2752.method1715(true, arg2, (byte) 101, this.field2771, (byte) 2);
                    this.field2761.method1750(var9, (byte) 122, (long) arg2);
                }
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)I", line = 222)
    public final int method1179(byte arg0) {
        field2763++;
        if (this.method1182(-1) == null) {
            return this.field2772 == null ? 0 : this.field2772.method311(-118);
        } else {
            if (arg0 >= -26) {
                this.method1178(true, 88, -121);
            }
            return 100;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field2746[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(II)V", line = 247)
    public static final void method1180(int arg0, int arg1) {
        field2764++;
        if (class144.field2159 == arg0) {
            return;
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (class144.field2159 == 0) {
            class343.method2365(arg1 ^ 0xFF00);
        }
        if (arg0 == 40) {
            class227.method1656(73);
        }
        if (arg0 != 40 && class44.field603 != null) {
            class44.field603.method2095(8737);
            class44.field603 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class295.field4634 = 0;
            class329.field5109 = 0;
            class242.field3838 = 1;
            class254.field4035 = 1;
            class282.field4456 = 0;
            class116.method808(true, 4);
        }
        if (arg0 == 25 || arg0 == 10) {
            class114.method795(arg1 - 65257);
        }
        if (arg0 == 5) {
            class326.method2263(class149.field2248, arg1 - 65402);
        } else {
            class5.method23(true);
        }
        boolean var3 = class144.field2159 == 5 || class144.field2159 == 10 || class144.field2159 == 28;
        if (var3 != var2) {
            if (var2) {
                class59.field771 = class172.field2737;
                if (class13.field164 == 0) {
                    class145.method1023(arg1 ^ 0xFFFF00D6, 2);
                } else {
                    class274.method1954(2, class172.field2737, 1, false, 0, 255, class139.field2077);
                }
                class269.field4246.method1716(-113, false);
            } else {
                class145.method1023(arg1 ^ 0xFFFF00A8, 2);
                class269.field4246.method1716(-96, true);
            }
        }
        if (class186.field2991 && (arg0 == 25 || arg0 == 28 || arg0 == 40)) {
            class186.method1275();
        }
        class144.field2159 = arg0;
        if (arg1 != 65280) {
            method1187((byte) 115);
        }
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(BI)V", line = 326)
    public static final void method1181(byte arg0, int arg1) {
        field2765++;
        if (arg0 == -110 && class204.method1498((byte) -121, arg1)) {
            class325.method2259(class21.field309[arg1], -1, (byte) -120);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)Lwf;", line = 341)
    public final class64 method1182(int arg0) {
        field2758++;
        if (this.field2769 != null) {
            return this.field2769;
        }
        if (this.field2772 == null) {
            if (this.field2752.method1721((byte) 65)) {
                return null;
            }
            this.field2772 = this.field2752.method1715(true, this.field2771, (byte) 101, 255, (byte) 0);
        }
        if (this.field2772.field624) {
            return null;
        }
        if (arg0 != -1) {
            this.method1189(-89, -64);
        }
        byte[] var2 = this.field2772.method308((byte) 124);
        if (this.field2772 instanceof class66) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2769 = new class64(var2, this.field2751);
                if (this.field2769.field842 != this.field2773) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var5) {
                this.field2769 = null;
                if (this.field2752.method1721((byte) 65)) {
                    this.field2772 = null;
                } else {
                    this.field2772 = this.field2752.method1715(true, this.field2771, (byte) 101, 255, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2769 = new class64(var2, this.field2751);
            } catch (RuntimeException var6) {
                this.field2752.method1726(108);
                this.field2769 = null;
                if (this.field2752.method1721((byte) 65)) {
                    this.field2772 = null;
                } else {
                    this.field2772 = this.field2752.method1715(true, this.field2771, (byte) 101, 255, (byte) 0);
                }
                return null;
            }
            if (this.field2754 != null) {
                this.field2762.method1772(this.field2754, var2, true, this.field2771);
            }
        }
        this.field2772 = null;
        if (this.field2774 != null) {
            this.field2757 = 0;
            this.field2767 = new byte[this.field2769.field847];
        }
        return this.field2769;
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V", line = 444)
    public final void method1183(int arg0) {
        field2753++;
        if (this.field2774 == null) {
            return;
        }
        this.field2776 = true;
        if (this.field2779 == null) {
            this.field2779 = new class256();
        }
        if (arg0 != 0) {
            field2768 = (String) null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)V", line = 468)
    public final void method1184(int arg0, int arg1) {
        field2755++;
        if (this.field2774 == null) {
            return;
        }
        if (arg1 != -11778) {
            this.field2771 = 96;
        }
        for (class71 var3 = this.field2780.method1807((byte) 51); var3 != null; var3 = this.field2780.method1808(18051)) {
            if ((long) arg0 == var3.field916) {
                return;
            }
        }
        class71 var4 = new class71();
        var4.field916 = (long) arg0;
        this.field2780.method1815((byte) -124, var4);
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)I", line = 497)
    public final int method1185(byte arg0) {
        if (arg0 != -15) {
            this.method1188((byte) -40, -50);
        }
        field2745++;
        return this.field2757;
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(B)V", line = 510)
    public final void method1186(byte arg0) {
        if (arg0 != 101) {
            return;
        }
        field2749++;
        if (this.field2779 != null) {
            if (this.method1182(arg0 - 102) == null) {
                return;
            }
            if (this.field2777) {
                boolean var2 = true;
                for (class71 var3 = this.field2779.method1807((byte) 85); var3 != null; var3 = this.field2779.method1808(18051)) {
                    int var4 = (int) var3.field916;
                    if (this.field2767[var4] == 0) {
                        this.method1178(false, 1, var4);
                    }
                    if (this.field2767[var4] == 0) {
                        var2 = false;
                    } else {
                        var3.method465((byte) -122);
                    }
                }
                while (this.field2778 < this.field2769.field840.length) {
                    if (this.field2769.field840[this.field2778] == 0) {
                        this.field2778++;
                    } else {
                        if (this.field2762.field3995 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field2767[this.field2778] == 0) {
                            this.method1178(false, 1, this.field2778);
                        }
                        if (this.field2767[this.field2778] == 0) {
                            var2 = false;
                            class71 var5 = new class71();
                            var5.field916 = (long) this.field2778;
                            this.field2779.method1815((byte) -127, var5);
                        }
                        this.field2778++;
                    }
                }
                if (var2) {
                    this.field2778 = 0;
                    this.field2777 = false;
                }
            } else if (this.field2776) {
                boolean var6 = true;
                for (class71 var7 = this.field2779.method1807((byte) 78); var7 != null; var7 = this.field2779.method1808(18051)) {
                    int var8 = (int) var7.field916;
                    if (this.field2767[var8] != 1) {
                        this.method1178(false, 2, var8);
                    }
                    if (this.field2767[var8] == 1) {
                        var7.method465((byte) -122);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field2769.field840.length > this.field2778) {
                    if (this.field2769.field840[this.field2778] == 0) {
                        this.field2778++;
                    } else {
                        if (this.field2752.method1722((byte) -66)) {
                            var6 = false;
                            break;
                        }
                        if (this.field2767[this.field2778] != 1) {
                            this.method1178(false, 2, this.field2778);
                        }
                        if (this.field2767[this.field2778] != 1) {
                            var6 = false;
                            class71 var9 = new class71();
                            var9.field916 = (long) this.field2778;
                            this.field2779.method1815((byte) 114, var9);
                        }
                        this.field2778++;
                    }
                }
                if (var6) {
                    this.field2776 = false;
                    this.field2778 = 0;
                }
            } else {
                this.field2779 = null;
            }
        }
        if (!this.field2781 || class304.method2128((byte) -127) < this.field2782) {
            return;
        }
        for (class46 var10 = (class46) this.field2761.method1746((byte) -33); var10 != null; var10 = (class46) this.field2761.method1749((byte) 85)) {
            if (!var10.field624) {
                if (var10.field622) {
                    if (!var10.field626) {
                        throw new RuntimeException();
                    }
                    var10.method465((byte) -122);
                } else {
                    var10.field622 = true;
                }
            }
        }
        this.field2782 = class304.method2128((byte) -120) + 1000L;
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(B)V", line = 690)
    public static void method1187(byte arg0) {
        field2748 = null;
        field2746 = null;
        field2768 = null;
        if (arg0 != 0) {
            field2748 = (String) null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BI)I", line = 708)
    public final int method1188(byte arg0, int arg1) {
        if (arg0 <= 76) {
            this.method1189(-123, 44);
        }
        field2775++;
        class46 var3 = (class46) this.field2761.method1743((long) arg1, (byte) -81);
        return var3 == null ? 0 : var3.method311(-92);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)[B", line = 725)
    public final byte[] method1189(int arg0, int arg1) {
        field2760++;
        class46 var3 = this.method1178(false, 0, arg0);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.method308((byte) 97);
        var3.method465((byte) -122);
        if (arg1 != -4950) {
            this.field2776 = false;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "(B)I", line = 749)
    public final int method1190(byte arg0) {
        field2747++;
        if (this.field2769 == null) {
            return 0;
        } else if (this.field2777) {
            if (arg0 < 103) {
                this.method1184(46, -50);
            }
            class71 var2 = this.field2779.method1807((byte) 71);
            return var2 == null ? 0 : (int) var2.field916;
        } else {
            return this.field2769.field838;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V", line = 781)
    public final void method1191(boolean arg0) {
        field2770++;
        if (this.field2779 == null || this.method1182(-1) == null || arg0) {
            return;
        }
        for (class71 var2 = this.field2780.method1807((byte) 76); var2 != null; var2 = this.field2780.method1808(18051)) {
            int var3 = (int) var2.field916;
            if (var3 < 0 || var3 >= this.field2769.field847 || this.field2769.field840[var3] == 0) {
                var2.method465((byte) -122);
            } else {
                if (this.field2767[var3] == 0) {
                    this.method1178(arg0, 1, var3);
                }
                if (this.field2767[var3] == -1) {
                    this.method1178(arg0, 2, var3);
                }
                if (this.field2767[var3] == 1) {
                    var2.method465((byte) -122);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(ILlc;Llc;Ldn;Ljm;IIZ)V", line = 894)
    public class173(int arg0, class176 arg1, class176 arg2, class243 arg3, class251 arg4, int arg5, int arg6, boolean arg7) {
        this.field2771 = arg0;
        this.field2774 = arg1;
        if (this.field2774 == null) {
            this.field2777 = false;
        } else {
            this.field2777 = true;
            this.field2779 = new class256();
        }
        this.field2754 = arg2;
        this.field2773 = arg6;
        this.field2751 = arg5;
        this.field2752 = arg3;
        this.field2781 = arg7;
        this.field2762 = arg4;
        if (this.field2754 != null) {
            this.field2772 = this.field2762.method1770(31932, this.field2754, this.field2771);
        }
    }

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "(B)I", line = 828)
    public final int method1192(byte arg0) {
        field2756++;
        if (this.field2769 == null) {
            return 0;
        } else {
            if (arg0 > -83) {
                this.method1184(87, 83);
            }
            return this.field2769.field838;
        }
    }
}
