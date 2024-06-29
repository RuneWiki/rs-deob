import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class36 {

    @OriginalMember(owner = "client!f", name = "l", descriptor = "[I")
    private int[] field774;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "[I")
    private int[] field775;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "[B")
    private byte[] field763;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "Lvc;")
    public static class137 field764 = class45.method325("Abbrechen", -46);

    @OriginalMember(owner = "client!f", name = "e", descriptor = "Lvc;")
    private static class137 field767 = class45.method325("Add ignore", -46);

    @OriginalMember(owner = "client!f", name = "t", descriptor = "Lvc;")
    public static class137 field782 = field767;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "Lr;")
    private static class110 field780 = new class110(5000);

    @OriginalMember(owner = "client!f", name = "u", descriptor = "Lvc;")
    private static class137 field783 = class45.method325("Enter name:", -46);

    @OriginalMember(owner = "client!f", name = "w", descriptor = "I")
    public static int field785 = -1;

    @OriginalMember(owner = "client!f", name = "z", descriptor = "I")
    public static int field788 = 0;

    @OriginalMember(owner = "client!f", name = "A", descriptor = "Lvc;")
    public static class137 field789 = field783;

    @OriginalMember(owner = "client!f", name = "B", descriptor = "Lvc;")
    public static class137 field790 = class45.method325(":tradereq:", -46);

    @OriginalMember(owner = "client!f", name = "v", descriptor = "Lib;")
    public static class58 field784 = new class58();

    @OriginalMember(owner = "client!f", name = "D", descriptor = "Lvc;")
    public static class137 field792 = class45.method325("oberen Rand der Webseite ausw-=hlen)3", -46);

    @OriginalMember(owner = "client!f", name = "C", descriptor = "Lqa;")
    public static class105 field791 = new class105(64);

    @OriginalMember(owner = "client!f", name = "F", descriptor = "Lvc;")
    public static class137 field794 = class45.method325("Sprites geladen)3", -46);

    @OriginalMember(owner = "client!f", name = "H", descriptor = "Lvc;")
    public static class137 field796 = class45.method325("Stufe)2", -46);

    @OriginalMember(owner = "client!f", name = "K", descriptor = "[I")
    public static int[] field799 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!f", name = "J", descriptor = "[I")
    public static int[] field798 = new int[50];

    @OriginalMember(owner = "client!f", name = "I", descriptor = "Lvc;")
    public static class137 field797 = class45.method325("null", -46);

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!f", name = "E", descriptor = "Lfc;")
    public static class39 field793;

    @OriginalMember(owner = "client!f", name = "x", descriptor = "[I")
    public static int[] field786;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "[I")
    public static int[] field787;

    @OriginalMember(owner = "client!f", name = "G", descriptor = "[[Lme;")
    public static class85[][] field795;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IILla;)V")
    public static final void method255(int arg0, int arg1, class75 arg2) {
        if (arg1 > -91) {
            field783 = null;
        }
        if (arg2.field1672 < 128 || arg2.field1646 < 128 || arg2.field1672 >= 13184 || arg2.field1646 >= 13184) {
            arg2.field1672 = arg2.field1647[0] * 128 + arg2.field1673 * 64;
            arg2.field1646 = arg2.field1624[0] * 128 + arg2.field1673 * 64;
            arg2.field1638 = 0;
            arg2.field1656 = 0;
            arg2.field1655 = -1;
            arg2.field1654 = -1;
            arg2.method558(true);
        }
        if (class104.field2412 == arg2 && (arg2.field1672 < 1536 || arg2.field1646 < 1536 || arg2.field1672 >= 11776 || arg2.field1646 >= 11776)) {
            arg2.field1638 = 0;
            arg2.field1655 = -1;
            arg2.field1654 = -1;
            arg2.field1646 = arg2.field1624[0] * 128 + arg2.field1673 * 64;
            arg2.field1656 = 0;
            arg2.field1672 = arg2.field1647[0] * 128 + arg2.field1673 * 64;
            arg2.method558(true);
        }
        if (arg2.field1638 > class112.field2667) {
            class88.method655((byte) -29, arg2);
        } else if (class112.field2667 <= arg2.field1656) {
            class63.method462((byte) -74, arg2);
        } else {
            class86.method630(arg2, -110);
        }
        class61.method439(2048, arg2);
        class98.method710(1, arg2);
        field766++;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZII)V")
    public static final void method256(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field797 = null;
        }
        field773++;
        if (class10.field218 != 0 && arg2 != -1) {
            class13.method88(class10.field218, 0, false, class93.field2195, arg2, -1, 1);
            class91.field2152 = arg1;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public static final void method257(int arg0) {
        field778++;
        int var1 = class103.field2391.method847(8, (byte) 90);
        if (class44.field973 > var1) {
            for (int var2 = var1; var2 < class44.field973; var2++) {
                class33.field709[class56.field1193++] = class139.field3237[var2];
            }
        }
        if (var1 > class44.field973) {
            throw new RuntimeException("gppov1");
        }
        class44.field973 = 0;
        if (arg0 >= -56) {
            return;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class139.field3237[var3];
            class125 var5 = class102.field2358[var4];
            int var6 = class103.field2391.method847(1, (byte) 115);
            if (var6 == 0) {
                class139.field3237[class44.field973++] = var4;
                var5.field1667 = class112.field2667;
            } else {
                int var7 = class103.field2391.method847(2, (byte) 58);
                if (var7 == 0) {
                    class139.field3237[class44.field973++] = var4;
                    var5.field1667 = class112.field2667;
                    class85.field2036[class68.field1416++] = var4;
                } else if (var7 == 1) {
                    class139.field3237[class44.field973++] = var4;
                    var5.field1667 = class112.field2667;
                    int var8 = class103.field2391.method847(3, (byte) 119);
                    var5.method560(-22950, false, var8);
                    int var9 = class103.field2391.method847(1, (byte) 67);
                    if (var9 == 1) {
                        class85.field2036[class68.field1416++] = var4;
                    }
                } else if (var7 == 2) {
                    class139.field3237[class44.field973++] = var4;
                    var5.field1667 = class112.field2667;
                    int var10 = class103.field2391.method847(3, (byte) 45);
                    var5.method560(-22950, true, var10);
                    int var11 = class103.field2391.method847(3, (byte) 103);
                    var5.method560(-22950, true, var11);
                    int var12 = class103.field2391.method847(1, (byte) 107);
                    if (var12 == 1) {
                        class85.field2036[class68.field1416++] = var4;
                    }
                } else if (var7 == 3) {
                    class33.field709[class56.field1193++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
    public static void method258(byte arg0) {
        field764 = null;
        field783 = null;
        field786 = null;
        field791 = null;
        field767 = null;
        field795 = null;
        field799 = null;
        field793 = null;
        field790 = null;
        field787 = null;
        if (arg0 <= 18) {
            method255(-121, 127, null);
        }
        field797 = null;
        field796 = null;
        field780 = null;
        field789 = null;
        field798 = null;
        field784 = null;
        field792 = null;
        field794 = null;
        field782 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BLia;)V")
    public static final void method259(byte arg0, class57 arg1) {
        for (int var2 = 0; var2 < class53.field1181.length; var2++) {
            class53.field1181[var2] = 0;
        }
        short var3 = 256;
        field781++;
        if (arg0 != 1) {
            method262(-62);
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var3 * Math.random() * 128.0D);
            class53.field1181[var16] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var3 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class40.field917[var15] = (class53.field1181[var15 - 1] + class53.field1181[var15 + 1] + class53.field1181[var15 + -128] + class53.field1181[var15 + 128]) / 4;
                }
            }
            int[] var13 = class53.field1181;
            class53.field1181 = class40.field917;
            class40.field917 = var13;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field1206; var7++) {
            for (int var8 = 0; var8 < arg1.field1205; var8++) {
                if (arg1.field1204[var6++] != 0) {
                    int var9 = arg1.field1211 + var7 + 16;
                    int var10 = var8 + arg1.field1207 + 16;
                    int var11 = (var9 << 7) + var10;
                    class53.field1181[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
    public static final void method260(int arg0) {
        field777++;
        if (arg0 != 0) {
            method266(-56);
        }
        while (true) {
            class100 var1 = class106.field2471;
            class98 var2;
            synchronized (class106.field2471) {
                var2 = (class98) class49.field1099.method723(arg0 - 58);
            }
            if (var2 == null) {
                return;
            }
            var2.field2279.method278(var2.field2276, false, var2.field2295, -75, (int) var2.field2490);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IILtc;IB)V")
    public static final void method261(int arg0, int arg1, class125 arg2, int arg3, byte arg4) {
        field770++;
        if (class104.field2412 == arg2 || (arg4 != -68 || class59.field1270 >= 400)) {
            return;
        }
        class137 var5;
        if (arg2.field2889 == 0) {
            var5 = class88.method666(110, new class137[] { arg2.field2909, class132.method968(arg2.field2877, (byte) 119, class104.field2412.field2877), class29.field641, class10.field199, class61.method435(arg2.field2877, 98), class45.field987 });
        } else {
            var5 = class88.method666(arg4 ^ 0x63, new class137[] { arg2.field2909, class29.field641, class12.field278, class61.method435(arg2.field2889, 77), class45.field987 });
        }
        if (class98.field2288 == 1) {
            class71.method498(26, class88.method666(124, new class137[] { class111.field2644, class35.field743, var5 }), arg1, arg0, 2916, arg3, class37.field825);
            class53.field1176++;
        } else if (!class39.field865) {
            for (int var6 = 4; var6 >= 0; var6--) {
                if (class28.field613[var6] != null) {
                    class75.field1682++;
                    short var7 = 0;
                    if (class28.field613[var6].method998(4204, class40.field918)) {
                        if (class104.field2412.field2877 < arg2.field2877) {
                            var7 = 2000;
                        }
                        if (class104.field2412.field2879 != 0 && arg2.field2879 != 0) {
                            if (class104.field2412.field2879 == arg2.field2879) {
                                var7 = 2000;
                            } else {
                                var7 = 0;
                            }
                        }
                    } else if (class25.field596[var6]) {
                        var7 = 2000;
                    }
                    int var8 = 0;
                    if (var6 == 0) {
                        var8 = var7 + 18;
                    }
                    if (var6 == 1) {
                        var8 = var7 + 45;
                    }
                    if (var6 == 2) {
                        var8 = var7 + 40;
                    }
                    if (var6 == 3) {
                        var8 = var7 + 44;
                    }
                    if (var6 == 4) {
                        var8 = var7 + 34;
                    }
                    class71.method498(var8, class88.method666(116, new class137[] { class80.field1778, var5 }), arg1, arg0, arg4 + 2984, arg3, class28.field613[var6]);
                }
            }
        } else if ((class29.field653 & 0x8) == 8) {
            class114.field2717++;
            class71.method498(50, class88.method666(114, new class137[] { class13.field281, class35.field743, var5 }), arg1, arg0, arg4 ^ 0xFFFFF4D8, arg3, class99.field2302);
        }
        for (int var9 = 0; var9 < class59.field1270; var9++) {
            if (class78.field1721[var9] == 39) {
                class29.field646[var9] = class88.method666(-117, new class137[] { class141.field3325, class108.field2504, class80.field1778, var5 });
                return;
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
    public static final void method262(int arg0) {
        field769++;
        class30.method229((byte) -123);
        if (class107.field2493 != 10) {
            return;
        }
        int var1 = field788 - 202;
        int var2 = -37 % ((arg0 - 21) / 32);
        int var3 = class78.field1747;
        int var4 = class38.field835 - 171;
        if (class10.field211 == 0) {
            byte var13 = 100;
            byte var14 = 120;
            if (var3 == 1 && var13 - 75 <= var1 && var1 <= var13 + 75 && var4 >= var14 - 20 && var14 + 20 >= var4) {
                class10.field211 = 3;
                class125.field2912 = 0;
            }
            short var15 = 260;
            if (var3 != 1 || var1 < var15 - 75 || var15 + 75 < var1 || var4 < var14 - 20 || var4 > var14 + 20) {
                return;
            }
            class125.field2912 = 0;
            class115.field2734 = class4.field90;
            class115.field2739 = class4.field94;
            class115.field2740 = class119.field2781;
            class10.field211 = 2;
            return;
        }
        if (class10.field211 == 2) {
            byte var5 = 60;
            int var16 = var5 + 30;
            if (var3 == 1 && var4 >= var16 - 15 && var4 < var16) {
                class125.field2912 = 0;
            }
            var16 += 15;
            if (var3 == 1 && var16 - 15 <= var4 && var4 < var16) {
                class125.field2912 = 1;
            }
            var16 += 15;
            short var6 = 150;
            byte var7 = 100;
            if (var3 == 1 && var1 >= var7 - 75 && var7 + 75 >= var1 && var4 >= var6 - 20 && var6 + 20 >= var4) {
                class115.field2732 = class115.field2732.method1009(327).method1016((byte) 114);
                class120.method909(class4.field71, false, class4.field63, class53.field1177);
                class33.method245(20, -95);
                return;
            }
            short var8 = 260;
            if (var3 == 1 && var8 - 75 <= var1 && var8 + 75 >= var1 && var4 >= var6 - 20 && var4 <= var6 + 20) {
                class115.field2735 = class115.field2737;
                class115.field2732 = class115.field2737;
                class10.field211 = 0;
            }
            while (true) {
                boolean var9;
                label139: do {
                    while (class30.method233(false)) {
                        var9 = false;
                        for (int var10 = 0; var10 < class35.field747.method997(5); var10++) {
                            if (class107.field2497 == class35.field747.method1017(var10, 58)) {
                                var9 = true;
                                break;
                            }
                        }
                        if (class125.field2912 != 0) {
                            continue label139;
                        }
                        if (class13.field289 == 85 && class115.field2732.method997(126) > 0) {
                            class115.field2732 = class115.field2732.method1013(class115.field2732.method997(121) - 1, 0, (byte) 27);
                        }
                        if (class13.field289 == 84 || class13.field289 == 80) {
                            class125.field2912 = 1;
                        }
                        if (var9 && class115.field2732.method997(-103) < 12) {
                            class115.field2732 = class115.field2732.method1004(-1, class107.field2497);
                        }
                    }
                    return;
                } while (class125.field2912 != 1);
                if (class13.field289 == 85 && class115.field2735.method997(105) > 0) {
                    class115.field2735 = class115.field2735.method1013(class115.field2735.method997(112) - 1, 0, (byte) 57);
                }
                if (class13.field289 == 84 || class13.field289 == 80) {
                    class125.field2912 = 0;
                }
                if (var9 && class115.field2735.method997(115) < 20) {
                    class115.field2735 = class115.field2735.method1004(-1, class107.field2497);
                }
            }
        }
        if (class10.field211 != 3) {
            return;
        }
        short var11 = 180;
        short var12 = 150;
        if (var3 == 1 && var11 - 75 <= var1 && var1 <= var11 + 75 && var12 - 20 <= var4 && var12 + 20 >= var4) {
            class10.field211 = 0;
            return;
        }
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V")
    public static final void method263(int arg0) {
        field765++;
        class77.field1712 = 0;
        int var1 = (class104.field2412.field1672 >> 7) + class58.field1227;
        int var2 = (class104.field2412.field1646 >> arg0) + class91.field2163;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class77.field1712 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class77.field1712 = 1;
        }
        if (class77.field1712 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class77.field1712 = 0;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([BI[BIZI)I")
    public final int method264(byte[] arg0, int arg1, byte[] arg2, int arg3, boolean arg4, int arg5) {
        field779++;
        int var7 = arg1 + arg3;
        int var8 = arg5 << 3;
        int var9 = 0;
        while (arg1 < var7) {
            int var10 = arg2[arg1] & 0xFF;
            int var11 = this.field774[var10];
            byte var12 = this.field763[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 & 0x7;
            int var14 = var8 >> 3;
            int var15 = var9 & -var13 >> 31;
            var8 += var12;
            int var16 = (var13 + var12 - 1 >> 3) + var14;
            int var17 = var13 + 24;
            arg0[var14] = (byte) (var9 = class49.method351(var15, var11 >>> var17));
            if (var16 > var14) {
                var14++;
                var13 = var17 - 8;
                arg0[var14] = (byte) (var9 = var11 >>> var13);
                if (var16 > var14) {
                    var14++;
                    var13 -= 8;
                    arg0[var14] = (byte) (var9 = var11 >>> var13);
                    if (var14 < var16) {
                        var14++;
                        var13 -= 8;
                        arg0[var14] = (byte) (var9 = var11 >>> var13);
                        if (var16 > var14) {
                            var14++;
                            var13 -= 8;
                            arg0[var14] = (byte) (var9 = var11 << -var13);
                        }
                    }
                }
            }
            arg1++;
        }
        if (!arg4) {
            field791 = null;
        }
        return (var8 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I[B[BIII)I")
    public final int method265(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field772++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = arg3 + arg4;
        int var8 = arg0;
        int var9 = arg5;
        while (true) {
            byte var10 = arg2[var9];
            if (var10 < 0) {
                var8 = this.field775[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field775[var8]) < 0) {
                arg1[arg4++] = (byte) ~var11;
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field775[var8];
            }
            int var12;
            if ((var12 = this.field775[var8]) < 0) {
                arg1[arg4++] = (byte) ~var12;
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field775[var8];
            }
            int var13;
            if ((var13 = this.field775[var8]) < 0) {
                arg1[arg4++] = (byte) ~var13;
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field775[var8];
            }
            int var14;
            if ((var14 = this.field775[var8]) < 0) {
                arg1[arg4++] = (byte) ~var14;
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field775[var8];
            }
            int var15;
            if ((var15 = this.field775[var8]) < 0) {
                arg1[arg4++] = (byte) ~var15;
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field775[var8];
            }
            int var16;
            if ((var16 = this.field775[var8]) < 0) {
                arg1[arg4++] = (byte) ~var16;
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field775[var8];
            }
            int var17;
            if ((var17 = this.field775[var8]) < 0) {
                arg1[arg4++] = (byte) ~var17;
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field775[var8];
            }
            int var18;
            if ((var18 = this.field775[var8]) < 0) {
                arg1[arg4++] = (byte) ~var18;
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(I)V")
    public static final void method266(int arg0) {
        field771++;
        try {
            if (class88.field2105 == 0) {
                if (class69.field1446 != null) {
                    class69.field1446.method434(arg0 ^ 0xFFFF888D);
                    class69.field1446 = null;
                }
                class88.field2105 = 1;
                class46.field1036 = null;
                class28.field634 = 0;
                class134.field3106 = false;
            }
            if (class88.field2105 == 1) {
                if (class46.field1036 == null) {
                    class46.field1036 = class131.field3048.method360(class116.field2754, 0);
                }
                if (class46.field1036.field3131 == 2) {
                    throw new IOException();
                }
                if (class46.field1036.field3131 == 1) {
                    class69.field1446 = new class61((Socket) class46.field1036.field3129, class131.field3048);
                    class88.field2105 = 2;
                    class46.field1036 = null;
                }
            }
            if (class88.field2105 == 2) {
                long var1 = class68.field1402 = class115.field2732.method1030(65);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class72.field1527.field2583 = 0;
                class72.field1527.method837(67, 14);
                class72.field1527.method837(arg0 + 30542, var3);
                class69.field1446.method440(0, 2, false, class72.field1527.field2547);
                class103.field2391.field2583 = 0;
                class88.field2105 = 3;
            }
            if (class88.field2105 == 3) {
                int var4 = class69.field1446.method433(arg0 + 19817);
                if (var4 != 0) {
                    class127.method953(var4, (byte) 96);
                    return;
                }
                class88.field2105 = 4;
                class103.field2391.field2583 = 0;
            }
            if (class88.field2105 == 4) {
                if (class103.field2391.field2583 < 8) {
                    int var5 = class69.field1446.method438(111);
                    if (var5 > 8 - class103.field2391.field2583) {
                        var5 = 8 - class103.field2391.field2583;
                    }
                    if (var5 > 0) {
                        class69.field1446.method441(5000, class103.field2391.field2583, class103.field2391.field2547, var5);
                        class103.field2391.field2583 += var5;
                    }
                }
                if (class103.field2391.field2583 == 8) {
                    class103.field2391.field2583 = 0;
                    class125.field2907 = class103.field2391.method829(arg0 + 30359);
                    class88.field2105 = 5;
                }
            }
            if (class88.field2105 == 5) {
                class72.field1527.field2583 = 0;
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class125.field2907 >> 32), (int) class125.field2907 };
                class72.field1527.method837(56, 10);
                class72.field1527.method817(-2770, var6[0]);
                class72.field1527.method817(arg0 + 27695, var6[1]);
                class72.field1527.method817(-2770, var6[2]);
                class72.field1527.method817(-2770, var6[3]);
                class72.field1527.method817(-2770, class131.field3048.field1112);
                class72.field1527.method840(false, class115.field2732.method1030(65));
                class72.field1527.method826(false, class115.field2735);
                class72.field1527.method809(class21.field429, 0, class75.field1626);
                field780.field2583 = 0;
                if (class107.field2493 == 40) {
                    field780.method837(118, 18);
                } else {
                    field780.method837(-107, 16);
                }
                field780.method837(-61, class72.field1527.field2583 + 61);
                field780.method817(-2770, 448);
                field780.method837(62, class25.field603 ? 1 : 0);
                field780.method817(-2770, class21.field458.field2109);
                field780.method817(arg0 + 27695, class105.field2431.field2109);
                field780.method817(arg0 ^ 0x7DD1, class83.field1869.field2109);
                field780.method817(-2770, class71.field1494.field2109);
                field780.method817(-2770, class105.field2450.field2109);
                field780.method817(arg0 ^ 0x7DD1, class22.field518.field2109);
                field780.method817(-2770, class23.field553.field2109);
                field780.method817(-2770, class98.field2285.field2109);
                field780.method817(-2770, class58.field1248.field2109);
                field780.method817(-2770, class75.field1699.field2109);
                field780.method817(arg0 ^ 0x7DD1, field793.field2109);
                field780.method817(arg0 ^ 0x7DD1, class93.field2195.field2109);
                field780.method817(arg0 ^ 0x7DD1, class6.field108.field2109);
                field780.method817(arg0 ^ 0x7DD1, class38.field838.field2109);
                field780.method819(0, class72.field1527.field2547, class72.field1527.field2583, -4599);
                class69.field1446.method440(0, field780.field2583, false, field780.field2547);
                class72.field1527.method843(var6, (byte) 77);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class103.field2391.method843(var6, (byte) 77);
                class88.field2105 = 6;
            }
            if (class88.field2105 == 6 && class69.field1446.method438(-46) > 0) {
                int var8 = class69.field1446.method433(arg0 + 19817);
                if (var8 == 21 && class107.field2493 == 20) {
                    class88.field2105 = 7;
                } else if (var8 == 2) {
                    class88.field2105 = 9;
                } else if (var8 == 15 && class107.field2493 == 40) {
                    class19.method171((byte) 22);
                    return;
                } else if (var8 == 23 && class124.field2868 < 1) {
                    class124.field2868++;
                    class88.field2105 = 0;
                } else {
                    class127.method953(var8, (byte) -70);
                    return;
                }
            }
            if (class88.field2105 == 7 && class69.field1446.method438(87) > 0) {
                class119.field2790 = class69.field1446.method433(arg0 + 19817) * 60 + 180;
                class88.field2105 = 8;
            }
            if (class88.field2105 == 8) {
                class28.field634 = 0;
                class120.method909(class88.method666(-87, new class137[] { class61.method435(class119.field2790 / 60, 122), class32.field689 }), false, class125.field2895, class86.field2050);
                if (--class119.field2790 <= 0) {
                    class88.field2105 = 0;
                }
            } else {
                if (class88.field2105 == 9 && class69.field1446.method438(105) >= 8) {
                    class12.field275 = class69.field1446.method433(arg0 ^ 0x5E97);
                    class45.field1020 = class69.field1446.method433(-10648) == 1;
                    class8.field181 = class69.field1446.method433(-10648);
                    class8.field181 <<= 0x8;
                    class8.field181 += class69.field1446.method433(arg0 ^ 0x5E97);
                    class29.field650 = class69.field1446.method433(arg0 + 19817);
                    class69.field1446.method441(arg0 ^ 0xFFFF9B77, 0, class103.field2391.field2547, 1);
                    class103.field2391.field2583 = 0;
                    class11.field241 = class103.field2391.method853(100);
                    class69.field1446.method441(5000, 0, class103.field2391.field2547, 2);
                    class103.field2391.field2583 = 0;
                    class68.field1399 = class103.field2391.method835(2);
                    class88.field2105 = 10;
                }
                if (class88.field2105 != 10) {
                    class28.field634++;
                    if (arg0 != -30465) {
                        field798 = null;
                    }
                    if (class28.field634 > 2000) {
                        if (class124.field2868 < 1) {
                            if (class134.field3102 == class116.field2754) {
                                class116.field2754 = class132.field3075;
                            } else {
                                class116.field2754 = class134.field3102;
                            }
                            class124.field2868++;
                            class88.field2105 = 0;
                        } else {
                            class127.method953(-3, (byte) 94);
                        }
                    }
                } else if (class69.field1446.method438(arg0 + 30360) >= class68.field1399) {
                    class103.field2391.field2583 = 0;
                    class69.field1446.method441(5000, 0, class103.field2391.field2547, class68.field1399);
                    class125.method931(arg0 + 30565);
                    class132.field3088 = -1;
                    class19.method166(false, (byte) -88);
                    class11.field241 = -1;
                }
            }
        } catch (IOException var9) {
            if (class124.field2868 < 1) {
                class124.field2868++;
                if (class134.field3102 == class116.field2754) {
                    class116.field2754 = class132.field3075;
                } else {
                    class116.field2754 = class134.field3102;
                }
                class88.field2105 = 0;
            } else {
                class127.method953(-2, (byte) 92);
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "([B)V")
    public class36(byte[] arg0) {
        int[] var2 = new int[33];
        int var3 = 0;
        int var4 = arg0.length;
        this.field774 = new int[var4];
        this.field775 = new int[8];
        this.field763 = arg0;
        for (int var5 = 0; var5 < var4; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var2[var6];
                this.field774[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var2[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var2[var10] = var2[var10 - 1];
                            break;
                        }
                        var2[var10] = class49.method351(var12, var11);
                    }
                } else {
                    var9 = var2[var6 - 1];
                }
                var2[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var2[var13] == var8) {
                        var2[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field775[var14] == 0) {
                            this.field775[var14] = var3;
                        }
                        var14 = this.field775[var14];
                    }
                    if (var14 >= this.field775.length) {
                        int[] var17 = new int[this.field775.length * 2];
                        for (int var18 = 0; var18 < this.field775.length; var18++) {
                            var17[var18] = this.field775[var18];
                        }
                        this.field775 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var3 <= var14) {
                    var3 = var14 + 1;
                }
                this.field775[var14] = ~var5;
            }
        }
    }
}
