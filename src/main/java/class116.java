import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class116 extends class120 {

    @OriginalMember(owner = "client!vh", name = "hb", descriptor = "[I")
    private int[] field1693 = new int[257];

    @OriginalMember(owner = "client!vh", name = "U", descriptor = "I")
    public static int field1680 = 0;

    @OriginalMember(owner = "client!vh", name = "T", descriptor = "I")
    public static int field1679 = 0;

    @OriginalMember(owner = "client!vh", name = "fb", descriptor = "Lok;")
    public static class41 field1691 = class137.method956("::noclip", 45);

    @OriginalMember(owner = "client!vh", name = "db", descriptor = "I")
    public static int field1689 = 0;

    @OriginalMember(owner = "client!vh", name = "lb", descriptor = "Lok;")
    public static class41 field1697 = class137.method956("::serverjs5drop", 45);

    @OriginalMember(owner = "client!vh", name = "V", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!vh", name = "W", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!vh", name = "X", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!vh", name = "ab", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!vh", name = "bb", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!vh", name = "cb", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!vh", name = "eb", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!vh", name = "gb", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!vh", name = "jb", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!vh", name = "kb", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!vh", name = "mb", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!vh", name = "ib", descriptor = "[I")
    public static int[] field1694;

    @OriginalMember(owner = "client!vh", name = "Y", descriptor = "[Z")
    public static boolean[] field1684;

    @OriginalMember(owner = "client!vh", name = "Z", descriptor = "[[I")
    private int[][] field1685;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(II)V", line = 5)
    public static final void method824(int arg0, int arg1) {
        class46 var2 = class195.method1396(8, arg0, false);
        var2.method336(true);
        field1690++;
        if (arg1 != 5055) {
            field1691 = (class41) null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "(I)V", line = 18)
    public static final void method825(int arg0) {
        field1696++;
        if (class169.field2676 == null) {
            return;
        }
        if (class107.field1517 < 10) {
            if (!class317.field5358.method482(class169.field2676.field2565, -1)) {
                class107.field1517 = class3.field42.method452(arg0 ^ 0x2A15, class169.field2676.field2565) / 10;
                return;
            }
            class256.method1816(21192);
            class107.field1517 = 10;
        }
        if (class107.field1517 == 10) {
            class177.field2876 = class169.field2676.field2568 >> 6 << 6;
            class120.field1773 = class169.field2676.field2566 >> 6 << 6;
            class66.field1004 = (class169.field2676.field2563 >> 6 << 6) + 64 - class120.field1773;
            class212.field3414 = (class169.field2676.field2545 >> 6 << 6) + 64 - class177.field2876;
            int var1 = class88.field1300 + (class62.field913.field4280 >> 7) - class120.field1773;
            int var2 = var1 + ((int) (Math.random() * 10.0D) - 5);
            class178.field2886 = 8.0F;
            class129.field1915 = 8.0F;
            int var3 = class212.field3414 - ((class62.field913.field4311 >> 7) + class55.field809 - class177.field2876) - 1;
            int var4 = var3 + (int) (Math.random() * 10.0D) - 5;
            if (var2 >= 0 && class66.field1004 > var2 && var4 >= 0 && class212.field3414 > var4) {
                class110.field1565 = var4;
                class45.field707 = var2;
            } else {
                class45.field707 = class169.field2676.field2564 * 64 - class120.field1773;
                class110.field1565 = class212.field3414 + class177.field2876 - (class169.field2676.field2560 * 64) - 1;
            }
            class317.method2188(-1);
            int var5 = class68.field1023 >> 2 << 10;
            class278.field4549 = new int[class275.field4509 + 1];
            int var6 = class174.field2819 >> 1;
            int var7 = class212.field3414 >> 6;
            int var8 = class66.field1004 >> 6;
            class144.field2191 = new int[var8][var7][];
            class226.field3618 = new byte[var8][var7][];
            class85.field1231 = new byte[var8][var7][];
            class244.field3891 = new byte[var8][var7][];
            class277.field4539 = new byte[var8][var7][];
            class281.field4571 = new int[var8][var7][];
            class64.field939 = new byte[var8][var7][];
            class307.field5164 = new short[var8][var7][];
            class282.method1985(var5, var6, -6);
            class107.field1517 = 20;
        } else if (class107.field1517 == 20) {
            class138.method967(arg0 ^ 0x2A15, new class112(class317.field5358.method464(class98.field1435, (byte) -97, class169.field2676.field2565)));
            class107.field1517 = 30;
            class126.method884(119, true);
            class32.method216(95);
        } else if (class107.field1517 == 30) {
            class201.method1424(new class112(class317.field5358.method464(class35.field525, (byte) 107, class169.field2676.field2565)), (byte) 99);
            class107.field1517 = 40;
            class32.method216(92);
        } else if (class107.field1517 == 40) {
            class78.method563(new class112(class317.field5358.method464(class306.field5124, (byte) 103, class169.field2676.field2565)), -113);
            class107.field1517 = 50;
            class32.method216(55);
        } else if (class107.field1517 == 50) {
            class5.method17(new class112(class317.field5358.method464(class118.field1738, (byte) 98, class169.field2676.field2565)), (byte) -126);
            class107.field1517 = 60;
            class126.method884(arg0 ^ 0x2A62, true);
            class32.method216(46);
        } else if (class107.field1517 == 60) {
            if (class317.field5358.method460((byte) 107, class187.method1346(new class41[] { class169.field2676.field2565, class50.field764 }, 0))) {
                if (!class317.field5358.method482(class187.method1346(new class41[] { class169.field2676.field2565, class50.field764 }, 0), -1)) {
                    return;
                }
                class268.field4273 = class193.method1384(false, class187.method1346(new class41[] { class169.field2676.field2565, class50.field764 }, 0), class317.field5358);
            } else {
                class268.field4273 = new class294(0);
            }
            class107.field1517 = 70;
            class32.method216(95);
        } else if (class107.field1517 == 70) {
            class275.field4506 = new class154(11, true, class283.field4602);
            class107.field1517 = 73;
            class126.method884(119, true);
            class32.method216(arg0 ^ 0x2A42);
        } else if (class107.field1517 == 73) {
            class46.field730 = new class154(12, true, class283.field4602);
            class107.field1517 = 76;
            class126.method884(119, true);
            class32.method216(63);
        } else if (class107.field1517 == 76) {
            class240.field3845 = new class154(14, true, class283.field4602);
            class107.field1517 = 79;
            class126.method884(119, true);
            class32.method216(79);
        } else if (class107.field1517 == 79) {
            class70.field1056 = new class154(17, true, class283.field4602);
            class107.field1517 = 82;
            class126.method884(119, true);
            class32.method216(81);
        } else if (class107.field1517 == 82) {
            class23.field347 = new class154(19, true, class283.field4602);
            class107.field1517 = 85;
            class126.method884(119, true);
            class32.method216(arg0 - 10660);
        } else if (class107.field1517 == 85) {
            class256.field4110 = new class154(22, true, class283.field4602);
            class107.field1517 = 88;
            class126.method884(arg0 ^ 0x2A62, true);
            class32.method216(124);
        } else if (class107.field1517 == 88) {
            class217.field3482 = new class154(26, true, class283.field4602);
            class107.field1517 = 91;
            class126.method884(119, true);
            class32.method216(57);
        } else {
            class260.field4148 = new class154(30, true, class283.field4602);
            if (arg0 != 10773) {
                method824(32, 91);
            }
            class107.field1517 = 100;
            class126.method884(arg0 - 10654, true);
            class32.method216(42);
            class245.field3909 = -1;
            class296.field4788 = -1;
            System.gc();
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V", line = 222)
    public class116() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(IZ)[[I", line = 232)
    public final int[][] method168(int arg0, boolean arg1) {
        int[][] var3 = this.field1764.method876(arg1, arg0);
        if (this.field1764.field1836) {
            int[] var4 = this.method854(0, arg0, -24059);
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            for (int var8 = 0; var8 < class307.field5160; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field1693[var9];
                var5[var8] = class217.method1563(var10, 16711680) >> 12;
                var7[var8] = class217.method1563(4080, var10 >> 4);
                var6[var8] = class217.method1563(4080, var10 << 4);
            }
        }
        field1692++;
        return var3;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I", line = 276)
    public static final int method826(int arg0, KeyEvent arg1) {
        field1698++;
        int var2 = arg1.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= arg0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BI)Lqa;", line = 296)
    public static final class79 method827(byte arg0, int arg1) {
        if (arg0 <= 98) {
            field1691 = (class41) null;
        }
        field1681++;
        return class92.field1343 && class140.field2161 <= arg1 && arg1 <= class134.field2004 ? class160.field2537[arg1 - class140.field2161] : null;
    }

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "(I)V", line = 314)
    public static void method828(int arg0) {
        field1697 = null;
        field1684 = null;
        field1691 = null;
        field1694 = null;
        if (arg0 != 16711680) {
            field1684 = (boolean[]) null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(BI)V", line = 328)
    private final void method829(byte arg0, int arg1) {
        if (arg0 != 104) {
            field1691 = (class41) null;
        }
        field1683++;
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            this.field1685 = new int[2][4];
            this.field1685[0][0] = 0;
            this.field1685[0][1] = 0;
            this.field1685[0][2] = 0;
            this.field1685[1][1] = 4096;
            this.field1685[1][0] = 4096;
            this.field1685[1][2] = 4096;
            this.field1685[0][3] = 0;
            this.field1685[1][3] = 4096;
        } else if (arg1 == 2) {
            this.field1685 = new int[8][4];
            this.field1685[0][2] = 2602;
            this.field1685[0][3] = 2361;
            this.field1685[0][0] = 0;
            this.field1685[0][1] = 2650;
            this.field1685[1][2] = 1799;
            this.field1685[2][2] = 1734;
            this.field1685[1][3] = 1558;
            this.field1685[1][0] = 2867;
            this.field1685[1][1] = 2313;
            this.field1685[2][3] = 1413;
            this.field1685[3][2] = 1220;
            this.field1685[3][3] = 947;
            this.field1685[4][3] = 722;
            this.field1685[2][0] = 3072;
            this.field1685[3][0] = 3276;
            this.field1685[2][1] = 2618;
            this.field1685[5][3] = 1766;
            this.field1685[4][0] = 3481;
            this.field1685[5][0] = 3686;
            this.field1685[6][3] = 915;
            this.field1685[7][3] = 1140;
            this.field1685[3][1] = 2296;
            this.field1685[4][1] = 2072;
            this.field1685[5][1] = 2730;
            this.field1685[4][2] = 963;
            this.field1685[6][0] = 3891;
            this.field1685[6][1] = 2232;
            this.field1685[7][0] = 4096;
            this.field1685[5][2] = 2152;
            this.field1685[7][1] = 1686;
            this.field1685[6][2] = 1060;
            this.field1685[7][2] = 1413;
        } else if (arg1 == 3) {
            this.field1685 = new int[7][4];
            this.field1685[0][0] = 0;
            this.field1685[1][0] = 663;
            this.field1685[2][0] = 1363;
            this.field1685[3][0] = 2048;
            this.field1685[0][3] = 4096;
            this.field1685[1][3] = 4096;
            this.field1685[0][1] = 0;
            this.field1685[4][0] = 2727;
            this.field1685[0][2] = 0;
            this.field1685[1][2] = 4096;
            this.field1685[2][3] = 0;
            this.field1685[3][3] = 0;
            this.field1685[5][0] = 3411;
            this.field1685[4][3] = 0;
            this.field1685[5][3] = 4096;
            this.field1685[1][1] = 0;
            this.field1685[2][1] = 0;
            this.field1685[6][3] = 4096;
            this.field1685[2][2] = 4096;
            this.field1685[3][1] = 4096;
            this.field1685[4][1] = 4096;
            this.field1685[5][1] = 4096;
            this.field1685[6][1] = 0;
            this.field1685[3][2] = 4096;
            this.field1685[4][2] = 0;
            this.field1685[6][0] = 4096;
            this.field1685[5][2] = 0;
            this.field1685[6][2] = 0;
        } else if (arg1 == 4) {
            this.field1685 = new int[6][4];
            this.field1685[0][1] = 0;
            this.field1685[1][1] = 0;
            this.field1685[0][0] = 0;
            this.field1685[0][3] = 0;
            this.field1685[2][1] = 0;
            this.field1685[3][1] = 0;
            this.field1685[1][0] = 1843;
            this.field1685[2][0] = 2457;
            this.field1685[0][2] = 0;
            this.field1685[1][3] = 1493;
            this.field1685[2][3] = 2939;
            this.field1685[4][1] = 546;
            this.field1685[5][1] = 4096;
            this.field1685[3][3] = 3565;
            this.field1685[4][3] = 4031;
            this.field1685[3][0] = 2781;
            this.field1685[5][3] = 4096;
            this.field1685[4][0] = 3481;
            this.field1685[1][2] = 0;
            this.field1685[5][0] = 4096;
            this.field1685[2][2] = 0;
            this.field1685[3][2] = 1124;
            this.field1685[4][2] = 3084;
            this.field1685[5][2] = 4096;
        } else if (arg1 == 5) {
            this.field1685 = new int[16][4];
            this.field1685[0][2] = 192;
            this.field1685[0][0] = 0;
            this.field1685[1][2] = 449;
            this.field1685[1][0] = 155;
            this.field1685[2][2] = 690;
            this.field1685[0][1] = 80;
            this.field1685[3][2] = 995;
            this.field1685[0][3] = 321;
            this.field1685[1][1] = 321;
            this.field1685[2][0] = 389;
            this.field1685[3][0] = 671;
            this.field1685[1][3] = 562;
            this.field1685[4][0] = 897;
            this.field1685[2][1] = 578;
            this.field1685[3][1] = 947;
            this.field1685[4][2] = 1397;
            this.field1685[5][0] = 1175;
            this.field1685[5][2] = 1429;
            this.field1685[2][3] = 803;
            this.field1685[4][1] = 1285;
            this.field1685[6][2] = 1461;
            this.field1685[3][3] = 1140;
            this.field1685[6][0] = 1368;
            this.field1685[7][0] = 1507;
            this.field1685[5][1] = 1525;
            this.field1685[4][3] = 1509;
            this.field1685[5][3] = 1413;
            this.field1685[7][2] = 1525;
            this.field1685[8][2] = 1590;
            this.field1685[9][2] = 2056;
            this.field1685[10][2] = 2586;
            this.field1685[8][0] = 1736;
            this.field1685[11][2] = 3148;
            this.field1685[6][3] = 1333;
            this.field1685[9][0] = 2088;
            this.field1685[6][1] = 1734;
            this.field1685[7][1] = 1413;
            this.field1685[12][2] = 3710;
            this.field1685[10][0] = 2355;
            this.field1685[11][0] = 2691;
            this.field1685[7][3] = 1702;
            this.field1685[13][2] = 3421;
            this.field1685[12][0] = 3031;
            this.field1685[8][3] = 2056;
            this.field1685[14][2] = 3148;
            this.field1685[8][1] = 1108;
            this.field1685[9][3] = 2666;
            this.field1685[13][0] = 3522;
            this.field1685[14][0] = 3727;
            this.field1685[9][1] = 1766;
            this.field1685[10][3] = 3276;
            this.field1685[15][2] = 2505;
            this.field1685[11][3] = 3228;
            this.field1685[12][3] = 3196;
            this.field1685[10][1] = 2409;
            this.field1685[13][3] = 3019;
            this.field1685[11][1] = 3116;
            this.field1685[12][1] = 3806;
            this.field1685[14][3] = 3228;
            this.field1685[15][0] = 4096;
            this.field1685[13][1] = 3437;
            this.field1685[15][3] = 2746;
            this.field1685[14][1] = 3116;
            this.field1685[15][1] = 2377;
        } else if (arg1 == 6) {
            this.field1685 = new int[4][4];
            this.field1685[0][3] = 0;
            this.field1685[0][0] = 2048;
            this.field1685[1][3] = 0;
            this.field1685[1][0] = 2867;
            this.field1685[0][1] = 0;
            this.field1685[1][1] = 4096;
            this.field1685[2][3] = 0;
            this.field1685[0][2] = 4096;
            this.field1685[1][2] = 4096;
            this.field1685[2][2] = 4096;
            this.field1685[3][3] = 0;
            this.field1685[2][1] = 4096;
            this.field1685[3][1] = 4096;
            this.field1685[2][0] = 3276;
            this.field1685[3][0] = 4096;
            this.field1685[3][2] = 0;
        } else {
            throw new RuntimeException("Invalid gradient preset");
        }
    }

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "(I)V", line = 586)
    private final void method830(int arg0) {
        field1695++;
        int var2 = this.field1685.length;
        if (arg0 != -23126 || var2 <= 0) {
            return;
        }
        for (int var3 = 0; var3 < 257; var3++) {
            int var4 = 0;
            int var5 = var3 << 4;
            for (int var6 = 0; var2 > var6 && this.field1685[var6][0] <= var5; var6++) {
                var4++;
            }
            int var8;
            int var9;
            int var10;
            if (var2 > var4) {
                int[] var7 = this.field1685[var4];
                if (var4 <= 0) {
                    var8 = var7[3];
                    var9 = var7[1];
                    var10 = var7[2];
                } else {
                    int[] var11 = this.field1685[var4 - 1];
                    int var12 = (var5 - var11[0] << 12) / (var7[0] - var11[0]);
                    int var13 = 4096 - var12;
                    var8 = var7[3] * var12 + var11[3] * var13 >> 12;
                    var10 = var7[2] * var12 + (var11[2] * var13) >> 12;
                    var9 = var7[1] * var12 + var11[1] * var13 >> 12;
                }
            } else {
                int[] var14 = this.field1685[var2 - 1];
                var10 = var14[2];
                var8 = var14[3];
                var9 = var14[1];
            }
            int var15 = var10 >> 4;
            int var16 = var8 >> 4;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 255) {
                var16 = 255;
            }
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 255) {
                var15 = 255;
            }
            int var17 = var9 >> 4;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            this.field1693[var3] = class255.method1813(class255.method1813(var17 << 16, var15 << 8), var16);
        }
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)V", line = 693)
    public final void method31(int arg0) {
        field1688++;
        if (this.field1685 == null) {
            this.method829((byte) 104, 1);
        }
        this.method830(-23126);
        if (arg0 != -31851) {
            this.field1693 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(IZ)Lsa;", line = 714)
    public static final class262 method831(int arg0, boolean arg1) {
        field1687++;
        if (arg1) {
            field1691 = (class41) null;
        }
        class262 var2 = (class262) class260.field4149.method554((long) arg0, -112);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class80.field1184.method454(0, 0, arg0);
        } else {
            var3 = class76.field1134.method454(0, 0, arg0 & 0x7FFF);
        }
        class262 var4 = new class262();
        if (var3 != null) {
            var4.method1844(new class112(var3), 127406160);
        }
        if (arg0 >= 32768) {
            var4.method1848((byte) -116);
        }
        class260.field4149.method555((long) arg0, (byte) -119, var4);
        return var4;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Llb;II)V", line = 759)
    public final void method30(class112 arg0, int arg1, int arg2) {
        field1682++;
        if (~arg2 != arg1) {
            return;
        }
        int var4 = arg0.method792(arg1 ^ 0xFFFFFFFD);
        if (var4 != 0) {
            this.method829((byte) 104, var4);
            return;
        }
        this.field1685 = new int[arg0.method792(2)][4];
        for (int var5 = 0; var5 < this.field1685.length; var5++) {
            this.field1685[var5][0] = arg0.method759((byte) -44);
            this.field1685[var5][1] = arg0.method792(class26.method169(arg1, -3)) << 4;
            this.field1685[var5][2] = arg0.method792(2) << 4;
            this.field1685[var5][3] = arg0.method792(class26.method169(arg1, -3)) << 4;
        }
    }
}
