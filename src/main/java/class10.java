import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class10 extends class13 {

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "Lja;")
    public class63 field200 = new class63();

    @OriginalMember(owner = "client!bb", name = "nb", descriptor = "Lwe;")
    public class151 field224 = new class151();

    @OriginalMember(owner = "client!bb", name = "fb", descriptor = "Llf;")
    private class82 field216;

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "Loa;")
    public static class98 field197 = class38.method349(255, "weiss:");

    @OriginalMember(owner = "client!bb", name = "Y", descriptor = "Loa;")
    public static class98 field209 = class38.method349(255, "Freie Welt");

    @OriginalMember(owner = "client!bb", name = "T", descriptor = "I")
    public static int field204 = 0;

    @OriginalMember(owner = "client!bb", name = "ab", descriptor = "I")
    public static int field211 = 0;

    @OriginalMember(owner = "client!bb", name = "Q", descriptor = "I")
    public static int field201 = 0;

    @OriginalMember(owner = "client!bb", name = "W", descriptor = "[[[Lja;")
    public static class63[][][] field207 = new class63[4][104][104];

    @OriginalMember(owner = "client!bb", name = "hb", descriptor = "Loa;")
    private static class98 field218 = class38.method349(255, "Your profile will be transferred in:");

    @OriginalMember(owner = "client!bb", name = "X", descriptor = "Loa;")
    public static class98 field208 = field218;

    @OriginalMember(owner = "client!bb", name = "ib", descriptor = "Loa;")
    public static class98 field219 = class38.method349(255, "(U4");

    @OriginalMember(owner = "client!bb", name = "Z", descriptor = "[I")
    public static int[] field210 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!bb", name = "mb", descriptor = "Loa;")
    public static class98 field223 = class38.method349(255, "Wen m-Ochten Sie entfernen?");

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!bb", name = "R", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!bb", name = "V", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!bb", name = "bb", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!bb", name = "cb", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!bb", name = "db", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!bb", name = "eb", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!bb", name = "gb", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!bb", name = "jb", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!bb", name = "kb", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!bb", name = "lb", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!bb", name = "S", descriptor = "Lkc;")
    public static class72 field203;

    @OriginalMember(owner = "client!bb", name = "U", descriptor = "[Lid;")
    public static class60[] field205;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "()I")
    public final int method109() {
        field217++;
        return 0;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "()Lbe;")
    public final class13 method110() {
        field198++;
        class146 var1;
        do {
            var1 = (class146) this.field200.method513(-116);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3557 == null);
        return var1.field3557;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IBLw;[III)V")
    private final void method111(int arg0, byte arg1, class146 arg2, int[] arg3, int arg4, int arg5) {
        if ((this.field216.field1846[arg2.field3552] & 0x4) != 0 && arg2.field3543 < 0) {
            int var7 = this.field216.field1873[arg2.field3552] / class8.field194;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field3553) / var7;
                if (var8 > arg4) {
                    arg2.field3553 += arg4 * var7;
                    break;
                }
                arg2.field3557.method119(arg3, arg5, var8);
                arg4 -= var8;
                arg5 += var8;
                int var9 = class8.field194 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class104 var11 = arg2.field3557;
                arg2.field3553 += var7 * var8 - 1048576;
                if (this.field216.field1862[arg2.field3552] == 0) {
                    arg2.field3557 = class104.method864(arg2.field3531, var11.method862(), var11.method848(), var11.method860());
                } else {
                    arg2.field3557 = class104.method864(arg2.field3531, var11.method862(), 0, var11.method860());
                    this.field216.method680(arg2, arg2.field3569.field1379[arg2.field3556] < 0, -1);
                    arg2.field3557.method879(var9, var11.method848());
                }
                if (arg2.field3569.field1379[arg2.field3556] < 0) {
                    arg2.field3557.method851(-1);
                }
                var11.method858(var9);
                var11.method119(arg3, arg5, arg0 - arg5);
                if (var11.method881()) {
                    this.field224.method1217(var11);
                }
            }
        }
        if (arg1 == -29) {
            field196++;
            arg2.field3557.method119(arg3, arg5, arg4);
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
    public final void method112(int arg0) {
        field206++;
        for (class146 var2 = (class146) this.field200.method512(89); var2 != null; var2 = (class146) this.field200.method513(-95)) {
            if (!this.field216.method692(var2, (byte) -55)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3565) {
                        this.method116(var2, var3, (byte) -99);
                        var2.field3565 -= var3;
                        break;
                    }
                    this.method116(var2, var2.field3565, (byte) -102);
                    var3 -= var2.field3565;
                } while (!this.field216.method669(65280, var2));
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "()Lbe;")
    public final class13 method113() {
        class146 var1 = (class146) this.field200.method512(-92);
        field214++;
        if (var1 == null) {
            return null;
        } else if (var1.field3557 == null) {
            return this.method110();
        } else {
            return var1.field3557;
        }
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(B)V")
    public static final void method114(byte arg0) {
        class137.method1107(true);
        if (class83.field1936 == 1) {
            field205[class27.field663 / 100].method495(class111.field2481 - 8 - 4, class11.field243 + -8 + -4);
        }
        if (class83.field1936 == 2) {
            field205[class27.field663 / 100 + 4].method495(class111.field2481 - 12, class11.field243 + -8 + -4);
        }
        if (class130.field3058 != -1) {
            class24.method268(class130.field3058, 2047);
            class35.method334(4, 512, 0, 10616, class130.field3058, 334, 0);
        }
        field199++;
        if (class71.field1460 != -1) {
            class24.method268(class71.field1460, 2047);
            class35.method334(0, 512, 0, 10616, class71.field1460, 334, 0);
        }
        int var1 = -25 % ((arg0 - 48) / 38);
        class41.method356(true);
        if (!class145.field3529) {
            class54.method443(66);
            class53.method434(true);
        } else if (class49.field1099 == 0) {
            class67.method550(91);
        }
        if (class123.field2752 == 1) {
            class19.field422.method495(472, 296);
        }
        if (class58.field1304) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            class97.field2231.method383(class102.method840(new class98[] { class6.field113, class132.method1074(class101.field2333, (byte) 47) }, 10), var2, var3, 16776960);
            int var10 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            if (var6 > 32768 && class94.field2151) {
                var4 = 16711680;
            }
            if (var6 > 65536 && !class94.field2151) {
                var4 = 16711680;
            }
            class97.field2231.method383(class102.method840(new class98[] { class46.field1053, class132.method1074(var6, (byte) -78), class55.field1235 }, 10), var2, var10, var4);
            var10 += 15;
            if (class114.field2580) {
                class97.field2231.method383(class97.field2245, var2, var10, 16711680);
                class114.field2580 = false;
                var10 += 15;
            }
            if (class79.field1736) {
                class97.field2231.method383(class74.field1566, var2, var10, 16711680);
                class79.field1736 = false;
                var10 += 15;
            }
            if (class73.field1524) {
                class97.field2231.method383(class31.field739, var2, var10, 16711680);
                class73.field1524 = false;
                var10 += 15;
            }
        }
        if (class127.field2844 == 0) {
            return;
        }
        int var7 = class127.field2844 / 50;
        int var8 = var7 / 60;
        int var9 = var7 % 60;
        if (var9 < 10) {
            class97.field2231.method391(class102.method840(new class98[] { class55.field1205, class132.method1074(var8, (byte) -125), class21.field477, class132.method1074(var9, (byte) 82) }, 10), 4, 329, 16776960);
        } else {
            class97.field2231.method391(class102.method840(new class98[] { class55.field1205, class132.method1074(var8, (byte) -110), class126.field2809, class132.method1074(var9, (byte) 82) }, 10), 4, 329, 16776960);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLwb;I)V")
    public static final void method115(byte arg0, class148 arg1, int arg2) {
        if (arg1.field3602 > class119.field2680) {
            class115.method927(arg1, -89);
        } else if (arg1.field3666 >= class119.field2680) {
            class83.method694(-5694, arg1);
        } else {
            class76.method624((byte) 31, arg1);
        }
        field215++;
        if (arg1.field3657 < 128 || arg1.field3667 < 128 || arg1.field3657 >= 13184 || arg1.field3667 >= 13184) {
            arg1.field3612 = -1;
            arg1.field3669 = -1;
            arg1.field3667 = arg1.field3648[0] * 128 + arg1.field3660 * 64;
            arg1.field3602 = 0;
            arg1.field3657 = arg1.field3603[0] * 128 + arg1.field3660 * 64;
            arg1.field3666 = 0;
            arg1.method1181(-20917);
        }
        if (class73.field1536 == arg1 && (arg1.field3657 < 1536 || arg1.field3667 < 1536 || arg1.field3657 >= 11776 || arg1.field3667 >= 11776)) {
            arg1.field3667 = arg1.field3648[0] * 128 + arg1.field3660 * 64;
            arg1.field3666 = 0;
            arg1.field3602 = 0;
            arg1.field3657 = arg1.field3603[0] * 128 + arg1.field3660 * 64;
            arg1.field3669 = -1;
            arg1.field3612 = -1;
            arg1.method1181(-20917);
        }
        if (arg0 == 22) {
            class106.method895((byte) 115, arg1);
            class24.method270(arg1, (byte) 102);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lw;IB)V")
    private final void method116(class146 arg0, int arg1, byte arg2) {
        if ((this.field216.field1846[arg0.field3552] & 0x4) != 0 && arg0.field3543 < 0) {
            int var4 = this.field216.field1873[arg0.field3552] / class8.field194;
            int var5 = (var4 + 1048575 - arg0.field3553) / var4;
            arg0.field3553 = arg1 * var4 + arg0.field3553 & 0xFFFFF;
            if (var5 <= arg1) {
                if (this.field216.field1862[arg0.field3552] == 0) {
                    arg0.field3557 = class104.method864(arg0.field3531, arg0.field3557.method862(), arg0.field3557.method848(), arg0.field3557.method860());
                } else {
                    arg0.field3557 = class104.method864(arg0.field3531, arg0.field3557.method862(), 0, arg0.field3557.method860());
                    this.field216.method680(arg0, arg0.field3569.field1379[arg0.field3556] < 0, -1);
                }
                if (arg0.field3569.field1379[arg0.field3556] < 0) {
                    arg0.field3557.method851(-1);
                }
                arg1 = arg0.field3553 / var4;
            }
        }
        if (arg2 > 0) {
            field223 = null;
        }
        arg0.field3557.method112(arg1);
        field220++;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIILgb;)V")
    public static final void method117(int arg0, int arg1, int arg2, int arg3, class45 arg4) {
        field212++;
        class19.field425.method714(arg2 ^ 0xFF00FFBC);
        class15.field301.method830(0, 0);
        if (arg2 != 16711680) {
            method114((byte) 111);
        }
        arg4.method381(class57.field1266, 55, 28, 16777215, true);
        if (arg0 == 0) {
            arg4.method381(class91.field2117, 55, 41, 65280, true);
        }
        if (arg0 == 1) {
            arg4.method381(class76.field1660, 55, 41, 16776960, true);
        }
        if (arg0 == 2) {
            arg4.method381(class90.field2079, 55, 41, 16711680, true);
        }
        if (arg0 == 3) {
            arg4.method381(class138.field3376, 55, 41, 65535, true);
        }
        arg4.method381(class126.field2799, 184, 28, 16777215, true);
        if (arg1 == 0) {
            arg4.method381(class91.field2117, 184, 41, 65280, true);
        }
        if (arg1 == 1) {
            arg4.method381(class76.field1660, 184, 41, 16776960, true);
        }
        if (arg1 == 2) {
            arg4.method381(class90.field2079, 184, 41, 16711680, true);
        }
        arg4.method381(class63.field1356, 324, 28, 16777215, true);
        if (arg3 == 0) {
            arg4.method381(class91.field2117, 324, 41, 65280, true);
        }
        if (arg3 == 1) {
            arg4.method381(class76.field1660, 324, 41, 16776960, true);
        }
        if (arg3 == 2) {
            arg4.method381(class90.field2079, 324, 41, 16711680, true);
        }
        arg4.method387(class75.field1630, 417, 17, 85, 25, 16777215, true, 1, 1, 0);
        try {
            Graphics var5 = class73.field1506.getGraphics();
            class19.field425.method406(32, 453, 0, var5);
        } catch (Exception var6) {
            class73.field1506.repaint();
        }
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)V")
    public static void method118(int arg0) {
        field197 = null;
        field219 = null;
        field207 = null;
        field223 = null;
        field218 = null;
        if (arg0 < 53) {
            method118(105);
        }
        field208 = null;
        field209 = null;
        field205 = null;
        field203 = null;
        field210 = null;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "([III)V")
    public final void method119(int[] arg0, int arg1, int arg2) {
        field221++;
        this.field224.method119(arg0, arg1, arg2);
        int var4 = arg1 + arg2;
        for (class146 var5 = (class146) this.field200.method512(89); var5 != null; var5 = (class146) this.field200.method513(-95)) {
            if (!this.field216.method692(var5, (byte) -55)) {
                int var6 = arg2;
                int var7 = arg1;
                do {
                    if (var5.field3565 >= var6) {
                        this.method111(var4, (byte) -29, var5, arg0, var6, var7);
                        var5.field3565 -= var6;
                        break;
                    }
                    this.method111(var4, (byte) -29, var5, arg0, var5.field3565, var7);
                    var6 -= var5.field3565;
                    var7 += var5.field3565;
                } while (!this.field216.method669(65280, var5));
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(B)V")
    public static final void method120(byte arg0) {
        field213++;
        if (arg0 != -108) {
            field211 = 10;
        }
        for (class147 var1 = (class147) class99.field2312.method512(91); var1 != null; var1 = (class147) class99.field2312.method513(-87)) {
            if (class114.field2572 != var1.field3600 || var1.field3572) {
                var1.method975(-114);
            } else if (var1.field3585 <= class119.field2680) {
                var1.method1178(-1, class52.field1161);
                if (var1.field3572) {
                    var1.method975(80);
                } else {
                    class138.field3373.method256(var1.field3600, var1.field3573, var1.field3595, var1.field3578, 60, var1, 0, -1, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Llf;)V")
    public class10(class82 arg0) {
        this.field216 = arg0;
    }
}
