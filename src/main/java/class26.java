import java.awt.Frame;
import java.awt.Image;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class26 extends class124 {

    @OriginalMember(owner = "client!dd", name = "ub", descriptor = "I")
    private int field784 = 0;

    @OriginalMember(owner = "client!dd", name = "db", descriptor = "[Lhe;")
    public static class54[] field767 = new class54[50];

    @OriginalMember(owner = "client!dd", name = "gb", descriptor = "I")
    public static int field770 = 0;

    @OriginalMember(owner = "client!dd", name = "kb", descriptor = "Lrd;")
    public static class117 field774 = class95.method812("compass", (byte) 8);

    @OriginalMember(owner = "client!dd", name = "mb", descriptor = "I")
    public static int field776 = 500;

    @OriginalMember(owner = "client!dd", name = "nb", descriptor = "Lrd;")
    public static class117 field777 = class95.method812("Ung-Ultiger Benutzername", (byte) 8);

    @OriginalMember(owner = "client!dd", name = "yb", descriptor = "I")
    public static volatile int field788 = 0;

    @OriginalMember(owner = "client!dd", name = "wb", descriptor = "Lrd;")
    public static class117 field786 = class95.method812("p11_full", (byte) 8);

    @OriginalMember(owner = "client!dd", name = "lb", descriptor = "Lrd;")
    public static class117 field775 = class95.method812("null", (byte) 8);

    @OriginalMember(owner = "client!dd", name = "Y", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!dd", name = "Z", descriptor = "I")
    public int field763;

    @OriginalMember(owner = "client!dd", name = "ab", descriptor = "I")
    public int field764;

    @OriginalMember(owner = "client!dd", name = "bb", descriptor = "I")
    public int field765;

    @OriginalMember(owner = "client!dd", name = "cb", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!dd", name = "hb", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!dd", name = "ib", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!dd", name = "jb", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!dd", name = "ob", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!dd", name = "pb", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!dd", name = "qb", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!dd", name = "rb", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!dd", name = "tb", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!dd", name = "vb", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!dd", name = "zb", descriptor = "I")
    public int field789;

    @OriginalMember(owner = "client!dd", name = "xb", descriptor = "Lge;")
    public static class47 field787;

    @OriginalMember(owner = "client!dd", name = "fb", descriptor = "Laf;")
    public static class7 field769;

    @OriginalMember(owner = "client!dd", name = "eb", descriptor = "Ljava/awt/Frame;")
    public static Frame field768;

    @OriginalMember(owner = "client!dd", name = "sb", descriptor = "Ljava/awt/Image;")
    public static Image field782;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZJ)Lrd;")
    public static final class117 method272(boolean arg0, long arg1) {
        field766++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else if (arg0) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var3--;
                var6[var3] = class116.field2825[(int) (var8 - arg1 * 37L)];
            }
            class117 var7 = new class117();
            var7.field2851 = var6;
            var7.field2858 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "(I)V")
    public static final void method273(int arg0) {
        field781++;
        if (class21.field603 != null) {
            class144 var1 = class21.field603;
            class144 var2 = class56.method594(116, var1);
            if (var2 == null) {
                class21.field603 = null;
                return;
            }
            class119.field2934++;
            int[] var3 = class22.method250(true, var2);
            int[] var4 = class22.method250(true, var1);
            int var5 = class66.field1878 - class44.field1252;
            int var6 = class121.field2961 - class94.field2357;
            if (var6 <= var1.field3524 && var6 >= -var1.field3524 && var5 <= var1.field3524 && var5 >= -var1.field3524 && !class110.field2761) {
                var5 = 0;
                var6 = 0;
            } else if (var1.field3493 < class119.field2934 || class110.field2761) {
                class110.field2761 = true;
            } else {
                var5 = 0;
                var6 = 0;
            }
            int var7 = var4[0] + var6 - var3[0];
            if (var7 < 0) {
                var7 = 0;
            }
            int var8 = var4[1] + var5 - var3[1];
            if (var8 < 0) {
                var8 = 0;
            }
            if (var2.field3437 < var1.field3437 + var7) {
                var7 = var2.field3437 - var1.field3437;
            }
            if (var1.field3490 + var8 > var2.field3490) {
                var8 = var2.field3490 - var1.field3490;
            }
            if (class21.field603.field3523 != null && class110.field2761) {
                class118.method980((byte) 126, var1.field3523, var1, 0, var8, null, var7);
            }
            if (class53.field1515 == 0) {
                if (class110.field2761) {
                    int var9 = class121.field2961 - var3[0];
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    if (var9 > var2.field3437 - 1) {
                        var9 = var2.field3437 - 1;
                    }
                    int var10 = class66.field1878 - var3[1];
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var10 > var2.field3490 - 1) {
                        var10 = var2.field3490 - 1;
                    }
                    class144 var11 = class133.method1094(var10, var1, var2, (byte) -18, var9);
                    if (class21.field603.field3482 != null) {
                        class118.method980((byte) 90, var1.field3482, var1, 0, var8, var11, var7);
                    }
                    if (var11 != null && class49.method555(var1, true) != null) {
                        class25.field754.method739(false, 22);
                        class41.field1178++;
                        class25.field754.method154(false, var11.field3441);
                        class25.field754.method164(19877, var1.field3532);
                        class25.field754.method130(-128, var11.field3532);
                        class25.field754.method124(var1.field3441, 0);
                    }
                } else {
                    if (class21.field603.field3541 != null) {
                        class118.method980((byte) 121, var1.field3541, var1, 0, var8, null, var7);
                    }
                    if ((class43.field1229 == 1 || class60.method610(class21.field604 - 1, false)) && class21.field604 > 2) {
                        class13.method109((byte) 118);
                    } else if (class21.field604 > 0) {
                        class41.method471(class21.field604 - 1, (byte) 81);
                    }
                }
                class21.field603 = null;
            }
        }
        if (arg0 != 11500) {
            field782 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZILbf;)V")
    private final void method274(int arg0, boolean arg1, int arg2, class14 arg3) {
        if (!arg1) {
            field776 = 26;
        }
        field772++;
        if (arg0 == 1) {
            this.field784 = arg3.method122(17260);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)V")
    public static final void method275(int arg0, int arg1) {
        field780++;
        if (arg0 == -1 || !class17.field431[arg0]) {
            return;
        }
        class53.field1518.method513(arg1 + arg1, arg0);
        if (class77.field2090[arg0] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class77.field2090[arg0].length; var3++) {
            if (class77.field2090[arg0][var3] != null) {
                if (class77.field2090[arg0][var3].field3533 == 2) {
                    var2 = false;
                } else {
                    class77.field2090[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class77.field2090[arg0] = null;
        }
        class17.field431[arg0] = false;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IBLbf;)V")
    public final void method276(int arg0, byte arg1, class14 arg2) {
        field762++;
        if (arg1 >= -85) {
            method273(123);
        }
        while (true) {
            int var4 = arg2.method153(true);
            if (var4 == 0) {
                return;
            }
            this.method274(var4, true, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "(I)V")
    public final void method277(int arg0) {
        field778++;
        if (arg0 != -6373) {
            this.method276(30, (byte) 86, null);
        }
        this.method282(this.field784, -6024);
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(Z)V")
    public static final void method278(boolean arg0) {
        if (arg0) {
            method272(true, -102L);
        }
        field783++;
        for (class132 var1 = (class132) class43.field1227.method3(false); var1 != null; var1 = (class132) class43.field1227.method14(127)) {
            if (var1.field3151 > 0) {
                var1.field3151--;
            }
            if (var1.field3151 != 0) {
                if (var1.field3160 > 0) {
                    var1.field3160--;
                }
                if (var1.field3160 == 0 && var1.field3155 >= 1 && var1.field3153 >= 1 && var1.field3155 <= 102 && var1.field3153 <= 102 && (var1.field3152 < 0 || class134.method1097(var1.field3152, -65, var1.field3162))) {
                    class105.method873(var1.field3167, var1.field3169, var1.field3155, var1.field3162, var1.field3152, var1.field3165, var1.field3153, -79);
                    var1.field3160 = -1;
                    if (var1.field3159 == var1.field3152 && var1.field3159 == -1) {
                        var1.method691(0);
                    } else if (var1.field3159 == var1.field3152 && var1.field3165 == var1.field3164 && var1.field3162 == var1.field3161) {
                        var1.method691(0);
                    }
                }
            } else if (var1.field3159 < 0 || class134.method1097(var1.field3159, -23, var1.field3161)) {
                class105.method873(var1.field3167, var1.field3169, var1.field3155, var1.field3161, var1.field3159, var1.field3164, var1.field3153, -126);
                var1.method691(0);
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "(I)V")
    public static void method279(int arg0) {
        field786 = null;
        field768 = null;
        field782 = null;
        field774 = null;
        field777 = null;
        field769 = null;
        field767 = null;
        field787 = null;
        if (arg0 != 0) {
            field786 = null;
        }
        field775 = null;
    }

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "(I)V")
    public static final void method280(int arg0) {
        field771++;
        if (class109.field2727) {
            class49.method544((byte) 91);
            class109.field2727 = false;
            class143.method1137(357);
            class115.field2812 = true;
            class13.field262 = true;
            class15.field339 = true;
            class18.field458 = true;
        }
        class13.method108(30477);
        if (class15.field354 && client.field613 == 1) {
            class13.field262 = true;
        }
        if (class27.field805 != -1) {
            boolean var1 = class99.method840((byte) 41, class27.field805);
            if (var1) {
                class13.field262 = true;
            }
        }
        if (class135.field3231 == 2) {
            class13.field262 = true;
        }
        if (class42.field1207 == 2) {
            class13.field262 = true;
        }
        if (class13.field262) {
            class13.field262 = false;
            class18.method196((byte) -38);
        }
        if (class56.field1553 == -1) {
            class61.field1708.field3543 = class22.field642 - class134.field3217 - 77;
            if (class121.field2961 > 17 && class121.field2961 < 560 && class66.field1878 > 332) {
                class95.method818(class61.field1708, class22.field642, -1, 4, class66.field1878 - 357, 0, 463, 77, class121.field2961 - 17);
            }
            int var2 = class22.field642 - class61.field1708.field3543 - 77;
            if (var2 < 0) {
                var2 = 0;
            }
            if (var2 > class22.field642 - 77) {
                var2 = class22.field642 - 77;
            }
            if (class134.field3217 != var2) {
                class134.field3217 = var2;
                class18.field458 = true;
            }
        }
        if (class56.field1553 == -1 && class80.field2142 == 3) {
            int var3 = class111.field2777 * 14 + 7;
            class61.field1708.field3543 = class135.field3233;
            if (class121.field2961 > 17 && class121.field2961 < 560 && class66.field1878 > 332) {
                class95.method818(class61.field1708, var3, -1, 4, class66.field1878 - 357, 0, 463, 77, class121.field2961 - 17);
            }
            int var4 = class61.field1708.field3543;
            if (var4 < 0) {
                var4 = 0;
            }
            if (var3 - 77 < var4) {
                var4 = var3 - 77;
            }
            if (class135.field3233 != var4) {
                class135.field3233 = var4;
                class18.field458 = true;
            }
        }
        if (class56.field1553 != -1) {
            boolean var5 = class99.method840((byte) 41, class56.field1553);
            if (var5) {
                class18.field458 = true;
            }
        }
        if (class135.field3231 == 3) {
            class18.field458 = true;
        }
        if (class42.field1207 == 3) {
            class18.field458 = true;
        }
        if (class2.field46 != null) {
            class18.field458 = true;
        }
        if (class15.field354 && client.field613 == 2) {
            class18.field458 = true;
        }
        if (class18.field458) {
            class18.field458 = false;
            class41.method469(9418);
        }
        class121.method991(1);
        if (class23.field668 != -1) {
            class15.field339 = true;
        }
        if (class15.field339) {
            if (class23.field668 != -1 && class23.field668 == class101.field2518) {
                class23.field668 = -1;
                class25.field754.method739(false, 202);
                class25.field754.method162(class101.field2518, -23339);
                class42.field1203++;
            }
            class58.field1617 = true;
            class15.field339 = false;
            class71.method684((byte) 97, class134.field3210, class85.field2236 % 20 >= 10 ? class23.field668 : -1, class27.field805 == -1, class101.field2518);
        }
        if (class115.field2812) {
            class58.field1617 = true;
            class115.field2812 = false;
            class147.method1183(class77.field2095, class42.field1202, 28, class18.field462, class54.field1533);
        }
        class120.method987(class144.field3516.field717, class120.field2940, class77.field2094, arg0 + arg0, class144.field3516.field751);
        class77.field2094 = 0;
    }

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "(I)V")
    public static final void method281(int arg0) {
        field779++;
        try {
            if (class144.field3542 == 0) {
                if (class119.field2923 != null) {
                    class119.field2923.method755(-2);
                    class119.field2923 = null;
                }
                class144.field3542 = 1;
                class54.field1540 = 0;
                class83.field2172 = null;
                class85.field2227 = false;
            }
            if (class144.field3542 == 1) {
                if (class83.field2172 == null) {
                    class83.field2172 = class4.field104.method62(class2.field37, 17266);
                }
                if (class83.field2172.field940 == 2) {
                    throw new IOException();
                }
                if (class83.field2172.field940 == 1) {
                    class119.field2923 = new class83((Socket) class83.field2172.field937, class4.field104);
                    class83.field2172 = null;
                    class144.field3542 = 2;
                }
            }
            if (class144.field3542 == 2) {
                long var1 = class93.field2339 = class56.field1575.method966(72);
                class25.field754.field314 = 0;
                class25.field754.method162(14, -23339);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class25.field754.method162(var3, -23339);
                class119.field2923.method754(0, (byte) 41, 2, class25.field754.field326);
                class104.field2588.field314 = 0;
                class144.field3542 = 3;
            }
            if (class144.field3542 == 3) {
                if (class61.field1723 != null) {
                    class61.field1723.method223((byte) -97);
                }
                if (class116.field2830 != null) {
                    class116.field2830.method223((byte) 100);
                }
                int var4 = class119.field2923.method752((byte) 56);
                if (class61.field1723 != null) {
                    class61.field1723.method223((byte) -128);
                }
                if (class116.field2830 != null) {
                    class116.field2830.method223((byte) -94);
                }
                if (var4 != 0) {
                    class1.method16(var4, -2);
                    return;
                }
                class104.field2588.field314 = 0;
                class144.field3542 = 4;
            }
            if (class144.field3542 == 4) {
                if (class104.field2588.field314 < 8) {
                    int var5 = class119.field2923.method757(true);
                    if (var5 > 8 - class104.field2588.field314) {
                        var5 = 8 - class104.field2588.field314;
                    }
                    if (var5 > 0) {
                        class119.field2923.method756(var5, 110, class104.field2588.field326, class104.field2588.field314);
                        class104.field2588.field314 += var5;
                    }
                }
                if (class104.field2588.field314 == 8) {
                    class104.field2588.field314 = 0;
                    class138.field3325 = class104.field2588.method133(-128);
                    class144.field3542 = 5;
                }
            }
            if (class144.field3542 == 5) {
                class25.field754.field314 = 0;
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class138.field3325 >> 32), (int) class138.field3325 };
                class25.field754.method162(10, -23339);
                class25.field754.method124(var6[0], arg0 ^ 0xFFFFB4CE);
                class25.field754.method124(var6[1], 0);
                class25.field754.method124(var6[2], 0);
                class25.field754.method124(var6[3], 0);
                class25.field754.method124(class4.field104.field194, 0);
                class25.field754.method163(-60, class56.field1575.method966(35));
                class25.field754.method147(arg0 ^ 0x4B61, class56.field1562);
                class25.field754.method142(class110.field2752, arg0 ^ 0x3799, class101.field2525);
                class16.field362.field314 = 0;
                if (class52.field1464 == 40) {
                    class16.field362.method162(18, -23339);
                } else {
                    class16.field362.method162(16, arg0 - 4089);
                }
                class16.field362.method162(class25.field754.field314 + 69, -23339);
                class16.field362.method124(452, 0);
                class16.field362.method162(class68.field1925 ? 1 : 0, -23339);
                class16.field362.method124(class97.field2430.field1358, 0);
                class16.field362.method124(class5.field122.field1358, 0);
                class16.field362.method124(class5.field114.field1358, 0);
                class16.field362.method124(class117.field2846.field1358, arg0 ^ 0xFFFFB4CE);
                class16.field362.method124(class101.field2503.field1358, 0);
                class16.field362.method124(class74.field2076.field1358, arg0 + 19250);
                class16.field362.method124(class71.field1980.field1358, arg0 + 19250);
                class16.field362.method124(field769.field1358, 0);
                class16.field362.method124(class59.field1678.field1358, arg0 + 19250);
                class16.field362.method124(class100.field2486.field1358, 0);
                class16.field362.method124(class83.field2162.field1358, arg0 ^ 0xFFFFB4CE);
                class16.field362.method124(class136.field3273.field1358, 0);
                class16.field362.method124(class96.field2417.field1358, arg0 ^ 0xFFFFB4CE);
                class16.field362.method124(class67.field1896.field1358, 0);
                class16.field362.method124(class58.field1624.field1358, 0);
                class16.field362.method124(class108.field2701.field1358, 0);
                class16.field362.method120(0, class25.field754.field326, class25.field754.field314, 115);
                class119.field2923.method754(0, (byte) 121, class16.field362.field314, class16.field362.field326);
                class25.field754.method735(var6, -126);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class104.field2588.method735(var6, 115);
                class144.field3542 = 6;
            }
            if (class144.field3542 == 6 && class119.field2923.method757(true) > 0) {
                int var8 = class119.field2923.method752((byte) 87);
                if (var8 == 21 && class52.field1464 == 20) {
                    class144.field3542 = 7;
                } else if (var8 == 2) {
                    class144.field3542 = 9;
                } else if (var8 == 15 && class52.field1464 == 40) {
                    class33.method385(0);
                    return;
                } else if (var8 == 23 && class110.field2762 < 1) {
                    class110.field2762++;
                    class144.field3542 = 0;
                } else {
                    class1.method16(var8, -2);
                    return;
                }
            }
            if (class144.field3542 == 7 && class119.field2923.method757(true) > 0) {
                class25.field758 = (class119.field2923.method752((byte) 120) + 3) * 60;
                class144.field3542 = 8;
            }
            if (arg0 == -19250) {
                if (class144.field3542 == 8) {
                    class54.field1540 = 0;
                    class14.method114(class147.field3600, class120.field2943, class18.method193(new class117[] { class142.method1131(class25.field758 / 60, true), class66.field1871 }, 47), arg0 + 19359);
                    if (--class25.field758 <= 0) {
                        class144.field3542 = 0;
                    }
                } else {
                    if (class144.field3542 == 9 && class119.field2923.method757(true) >= 8) {
                        class24.field676 = class119.field2923.method752((byte) 106);
                        class111.field2782 = class119.field2923.method752((byte) 88) == 1;
                        class104.field2604 = class119.field2923.method752((byte) 114);
                        class104.field2604 <<= 0x8;
                        class104.field2604 += class119.field2923.method752((byte) 115);
                        class17.field393 = class119.field2923.method752((byte) 52);
                        class119.field2923.method756(1, 74, class104.field2588.field326, 0);
                        class104.field2588.field314 = 0;
                        class92.field2324 = class104.field2588.method732((byte) 45);
                        class119.field2923.method756(2, 122, class104.field2588.field326, 0);
                        class104.field2588.field314 = 0;
                        class17.field395 = class104.field2588.method138((byte) 70);
                        class144.field3542 = 10;
                    }
                    if (class144.field3542 != 10) {
                        class54.field1540++;
                        if (class54.field1540 > 2000) {
                            if (class110.field2762 < 1) {
                                class144.field3542 = 0;
                                if (class58.field1610 == class2.field37) {
                                    class2.field37 = class117.field2892;
                                } else {
                                    class2.field37 = class58.field1610;
                                }
                                class110.field2762++;
                            } else {
                                class1.method16(-3, -2);
                            }
                        }
                    } else if (class119.field2923.method757(true) >= class17.field395) {
                        class104.field2588.field314 = 0;
                        class119.field2923.method756(class17.field395, 115, class104.field2588.field326, 0);
                        class72.method687(true);
                        class2.field68 = -1;
                        class14.method170(arg0 + 19360, false);
                        class92.field2324 = -1;
                    }
                }
            }
        } catch (IOException var9) {
            if (class110.field2762 < 1) {
                class144.field3542 = 0;
                if (class58.field1610 == class2.field37) {
                    class2.field37 = class117.field2892;
                } else {
                    class2.field37 = class58.field1610;
                }
                class110.field2762++;
            } else {
                class1.method16(-2, -2);
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)V")
    private final void method282(int arg0, int arg1) {
        field773++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (arg1 != -6024) {
            method281(0);
        }
        if (var5 > var3) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        if (var7 < var9) {
            var9 = var7;
        }
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var13 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var15 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var15 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var15 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var13 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        if (var17 > 0.5D) {
            this.field763 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field763 = (int) (var13 * var17 * 512.0D);
        }
        double var19 = var15 / 6.0D;
        this.field789 = (int) (var13 * 256.0D);
        this.field765 = (int) (var17 * 256.0D);
        if (this.field789 < 0) {
            this.field789 = 0;
        } else if (this.field789 > 255) {
            this.field789 = 255;
        }
        if (this.field765 < 0) {
            this.field765 = 0;
        } else if (this.field765 > 255) {
            this.field765 = 255;
        }
        if (this.field763 < 1) {
            this.field763 = 1;
        }
        this.field764 = (int) ((double) this.field763 * var19);
    }
}
