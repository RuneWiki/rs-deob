import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class104 {

    @OriginalMember(owner = "client!p", name = "j", descriptor = "Lr;")
    private class118 field2623 = new class118();

    @OriginalMember(owner = "client!p", name = "n", descriptor = "Lgb;")
    private class45 field2627 = new class45();

    @OriginalMember(owner = "client!p", name = "v", descriptor = "I")
    private int field2635;

    @OriginalMember(owner = "client!p", name = "w", descriptor = "I")
    private int field2636;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "Lqc;")
    private class114 field2628;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "Lqc;")
    public static class114 field2625 = new class114(32);

    @OriginalMember(owner = "client!p", name = "t", descriptor = "I")
    public static int field2633 = 3;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "Lfc;")
    public static class39 field2634 = class90.method774("<col=40ff00>", -127);

    @OriginalMember(owner = "client!p", name = "y", descriptor = "Z")
    public static boolean field2638 = false;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!p", name = "z", descriptor = "Loc;")
    public static class100 field2639;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "Lve;")
    public static class147 field2630;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "Lwa;")
    public static class149 field2632;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "Lb;")
    public static class8 field2626;

    @OriginalMember(owner = "client!p", name = "x", descriptor = "[Lb;")
    public static class8[] field2637;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V", line = 3)
    public final void method927(boolean arg0) {
        field2629++;
        while (true) {
            class118 var2 = this.field2627.method524((byte) -128);
            if (var2 == null) {
                if (arg0) {
                    field2637 = null;
                }
                this.field2636 = this.field2635;
                return;
            }
            var2.method1170(59);
            var2.method1023((byte) 57);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)Z", line = 26)
    public static final boolean method928(int arg0, int arg1) {
        field2620++;
        int var2 = 37 / ((47 - arg1) / 55);
        return (arg0 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V", line = 42)
    public static final void method929(byte arg0) {
        field2616++;
        class146.field3632 = 0;
        if (arg0 >= -122) {
            method937(-14);
        }
        int var1 = (class94.field2197.field2916 >> 7) + class54.field1341;
        int var2 = (class94.field2197.field2909 >> 7) + class55.field1382;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class146.field3632 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class146.field3632 = 1;
        }
        if (class146.field3632 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class146.field3632 = 0;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lv;BII)V", line = 72)
    public static final void method930(class142 arg0, byte arg1, int arg2, int arg3) {
        if ((arg3 & 0x40) != 0) {
            int var4 = class39.field1065.method301(-4853);
            int var5 = class39.field1065.method298(-15432);
            int var6 = class39.field1065.method298(-15432);
            int var7 = class39.field1065.field710;
            if (arg0.field3575 != null && arg0.field3553 != null) {
                boolean var8 = false;
                long var9 = arg0.field3575.method445((byte) 69);
                if (var5 <= 1) {
                    for (int var11 = 0; var11 < class57.field1414; var11++) {
                        if (class79.field1795[var11] == var9) {
                            var8 = true;
                            break;
                        }
                    }
                }
                if (!var8 && class146.field3632 == 0) {
                    class90.field2130.field710 = 0;
                    class39.field1065.method305(0, (byte) -124, class90.field2130.field711, var6);
                    class90.field2130.field710 = 0;
                    class39 var12 = class84.method708(class114.method997(class90.field2130, -48).method450(true));
                    arg0.field2925 = var12.method448((byte) -127);
                    arg0.field2905 = var4 & 0xFF;
                    arg0.field2856 = 150;
                    arg0.field2921 = var4 >> 8;
                    if (var5 == 2 || var5 == 3) {
                        class28.method346(1, (byte) 103, var12, class137.method1111(new class39[] { class43.field1177, arg0.field3575 }, (byte) 90));
                    } else if (var5 == 1) {
                        class28.method346(1, (byte) 127, var12, class137.method1111(new class39[] { class89.field2091, arg0.field3575 }, (byte) 97));
                    } else {
                        class28.method346(2, (byte) 83, var12, arg0.field3575);
                    }
                }
            }
            class39.field1065.field710 = var7 + var6;
        }
        field2615++;
        if ((arg3 & 0x20) != 0) {
            int var13 = class39.field1065.method327((byte) 67);
            if (var13 == 65535) {
                var13 = -1;
            }
            int var14 = class39.field1065.method280(1630016912);
            class27.method344((byte) 89, arg0, var13, var14);
        }
        if (arg1 >= -76) {
            return;
        }
        if ((arg3 & 0x4) != 0) {
            arg0.field2889 = class39.field1065.method292(-128);
            arg0.field2890 = class39.field1065.method327((byte) 67);
        }
        if ((arg3 & 0x2) != 0) {
            int var15 = class39.field1065.method322((byte) -50);
            byte[] var16 = new byte[var15];
            class25 var17 = new class25(var16);
            class39.field1065.method305(0, (byte) 84, var16, var15);
            class24.field644[arg2] = var17;
            arg0.method1159(false, var17);
        }
        if ((arg3 & 0x400) != 0) {
            arg0.field2874 = class39.field1065.method322((byte) -50);
            arg0.field2862 = class39.field1065.method321((byte) 25);
            arg0.field2894 = class39.field1065.method298(-15432);
            arg0.field2910 = class39.field1065.method321((byte) 87);
            arg0.field2904 = class39.field1065.method292(-128) + class70.field1654;
            arg0.field2880 = class39.field1065.method320(false) + class70.field1654;
            arg0.field2922 = class39.field1065.method321((byte) 31);
            arg0.field2927 = 1;
            arg0.field2884 = 0;
        }
        if ((arg3 & 0x10) != 0) {
            arg0.field2925 = class39.field1065.method304(-126);
            if (arg0.field2925.method442((byte) 53, 0) == 126) {
                arg0.field2925 = arg0.field2925.method469(1, (byte) -125);
                class28.method346(2, (byte) 103, arg0.field2925, arg0.field3575);
            } else if (class94.field2197 == arg0) {
                class28.method346(2, (byte) 102, arg0.field2925, arg0.field3575);
            }
            arg0.field2921 = 0;
            arg0.field2905 = 0;
            arg0.field2856 = 150;
        }
        if ((arg3 & 0x1) != 0) {
            arg0.field2898 = class39.field1065.method327((byte) 67);
            if (arg0.field2898 == 65535) {
                arg0.field2898 = -1;
            }
        }
        if ((arg3 & 0x8) != 0) {
            int var18 = class39.field1065.method321((byte) 95);
            int var19 = class39.field1065.method280(1630016912);
            arg0.method980(class70.field1654, var19, true, var18);
            arg0.field2876 = class70.field1654 + 300;
            arg0.field2859 = class39.field1065.method298(-15432);
            arg0.field2857 = class39.field1065.method280(1630016912);
        }
        if ((arg3 & 0x200) != 0) {
            arg0.field2891 = class39.field1065.method327((byte) 67);
            int var20 = class39.field1065.method311(255);
            if (arg0.field2891 == 65535) {
                arg0.field2891 = -1;
            }
            arg0.field2902 = var20 >> 16;
            arg0.field2883 = (var20 & 0xFFFF) + class70.field1654;
            arg0.field2866 = 0;
            if (class70.field1654 < arg0.field2883) {
                arg0.field2866 = -1;
            }
            arg0.field2860 = 0;
        }
        if ((arg3 & 0x100) == 0) {
            return;
        }
        int var21 = class39.field1065.method321((byte) 124);
        int var22 = class39.field1065.method280(1630016912);
        arg0.method980(class70.field1654, var22, true, var21);
        arg0.field2876 = class70.field1654 + 300;
        arg0.field2859 = class39.field1065.method280(1630016912);
        arg0.field2857 = class39.field1065.method298(-15432);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZJ)Lr;", line = 269)
    public final class118 method931(boolean arg0, long arg1) {
        if (arg0) {
            return null;
        }
        field2614++;
        class118 var4 = (class118) this.field2628.method995(arg0, arg1);
        if (var4 != null) {
            this.field2627.method521(var4, (byte) -52);
        }
        return var4;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V", line = 301)
    public static void method932(int arg0) {
        field2626 = null;
        field2637 = null;
        field2630 = null;
        field2634 = null;
        field2625 = null;
        if (arg0 != -17302) {
            field2633 = 105;
        }
        field2639 = null;
        field2632 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 319)
    public static final String method933(int arg0, Throwable arg1) throws IOException {
        field2621++;
        String var2;
        if (arg1 instanceof class79) {
            class79 var3 = (class79) arg1;
            var2 = var3.field1789 + " | ";
            arg1 = var3.field1790;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    if (arg0 != -31606) {
                        field2639 = null;
                    }
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILr;J)V", line = 390)
    public final void method934(int arg0, class118 arg1, long arg2) {
        if (this.field2636 == arg0) {
            class118 var5 = this.field2627.method524((byte) -126);
            var5.method1170(arg0 + 12);
            var5.method1023((byte) -6);
            if (this.field2623 == var5) {
                class118 var6 = this.field2627.method524((byte) -128);
                var6.method1170(arg0 ^ 0x42);
                var6.method1023((byte) 50);
            }
        } else {
            this.field2636--;
        }
        field2619++;
        this.field2628.method998(arg1, arg2, (byte) -118);
        this.field2627.method521(arg1, (byte) -42);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(JB)V", line = 428)
    public final void method935(long arg0, byte arg1) {
        field2617++;
        class118 var4 = (class118) this.field2628.method995(false, arg0);
        if (arg1 < -106 && var4 != null) {
            var4.method1170(27);
            var4.method1023((byte) -98);
            this.field2636++;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V", line = 462)
    public static final void method936(byte arg0) {
        field2622++;
        if (!class142.field3589) {
            return;
        }
        class66.field1573 = null;
        class151.field3750 = null;
        class61.field1504 = null;
        class101.field2530 = null;
        class145.field3630 = null;
        class151.field3737 = null;
        class88.field2062 = null;
        class86.field1957 = null;
        class92.field2162 = null;
        class60.field1455 = null;
        if (arg0 != 9) {
            field2625 = null;
        }
        class92.field2161 = null;
        class97.field2314 = null;
        class116.field3062 = null;
        class60.field1460 = null;
        class108.field2728 = null;
        class97.field2307 = null;
        class147.field3675 = null;
        class127.field3232 = null;
        class113.field2960 = null;
        field2637 = null;
        class27.field764 = null;
        class83.method694(2, arg0 ^ 0x5B99);
        class30.method368(106, true);
        class142.field3589 = false;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(I)V", line = 968)
    public class104(int arg0) {
        this.field2635 = arg0;
        this.field2636 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field2628 = new class114(var2);
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V", line = 530)
    public static final void method937(int arg0) {
        field2624++;
        if (class103.field2576 == 0) {
            class139.field3503 = new class4(4, 104, 104, class7.field219);
            for (int var1 = 0; var1 < 4; var1++) {
                class117.field3077[var1] = new class101(104, 104);
            }
            class70.field1638 = new class8(512, 512);
            class103.field2576 = 20;
            class127.field3226 = 5;
            class93.field2178 = class82.field1831;
        } else if (class103.field2576 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 128 + 15;
                int var5 = var4 * 3 + 600;
                int var6 = class40.field1124[var4];
                var2[var3] = var5 * var6 >> 16;
            }
            class4.method49(var2, 500, 800, 512, 334);
            class103.field2576 = 30;
            class127.field3226 = 10;
            class93.field2178 = class38.field1022;
        } else if (arg0 == 21) {
            if (class103.field2576 == 30) {
                class43.field1182 = class145.method1169((byte) -61, 0, true, false, true);
                class78.field1779 = class145.method1169((byte) -61, 1, true, false, true);
                class57.field1416 = class145.method1169((byte) -61, 2, false, true, true);
                class83.field1844 = class145.method1169((byte) -61, 3, true, false, true);
                class53.field1333 = class145.method1169((byte) -61, 4, true, false, true);
                client.field557 = class145.method1169((byte) -61, 5, true, true, true);
                class57.field1418 = class145.method1169((byte) -61, 6, true, true, false);
                class111.field2879 = class145.method1169((byte) -61, 7, true, false, true);
                class128.field3272 = class145.method1169((byte) -61, 8, true, false, true);
                class53.field1337 = class145.method1169((byte) -61, 9, true, false, true);
                class1.field10 = class145.method1169((byte) -61, 10, true, false, true);
                class142.field3580 = class145.method1169((byte) -61, 11, true, false, true);
                class28.field818 = class145.method1169((byte) -61, 12, true, false, true);
                class131.field3318 = class145.method1169((byte) -61, 13, false, true, true);
                class28.field811 = class145.method1169((byte) -61, 14, true, false, false);
                class56.field1407 = class145.method1169((byte) -61, 15, true, false, true);
                class103.field2576 = 40;
                class127.field3226 = 20;
                class93.field2178 = class28.field803;
            } else if (class103.field2576 == 40) {
                byte var7 = 0;
                int var8 = var7 + class43.field1182.method764(0) * 4 / 100;
                int var9 = var8 + class78.field1779.method764(0) * 4 / 100;
                int var10 = var9 + class57.field1416.method764(0) * 2 / 100;
                int var11 = var10 + class83.field1844.method764(0) * 2 / 100;
                int var12 = var11 + class53.field1333.method764(0) * 6 / 100;
                int var13 = var12 + client.field557.method764(arg0 - 21) * 4 / 100;
                int var14 = var13 + class57.field1418.method764(0) * 2 / 100;
                int var15 = var14 + class111.field2879.method764(0) * 60 / 100;
                int var16 = var15 + class128.field3272.method764(0) * 2 / 100;
                int var17 = var16 + class53.field1337.method764(0) * 2 / 100;
                int var18 = var17 + class1.field10.method764(0) * 2 / 100;
                int var19 = var18 + class142.field3580.method764(arg0 ^ 0x15) * 2 / 100;
                int var20 = var19 + class28.field818.method764(arg0 - 21) * 2 / 100;
                int var21 = var20 + class131.field3318.method764(0) * 2 / 100;
                int var22 = var21 + class28.field811.method764(0) * 2 / 100;
                int var23 = var22 + class56.field1407.method764(0) * 2 / 100;
                if (var23 == 100) {
                    class127.field3226 = 30;
                    class103.field2576 = 45;
                    class93.field2178 = class90.field2141;
                } else {
                    if (var23 != 0) {
                        class93.field2178 = class137.method1111(new class39[] { class25.field742, class86.method734(var23, arg0 + 2197), class37.field1017 }, (byte) -42);
                    }
                    class127.field3226 = 30;
                }
            } else if (class103.field2576 == 45) {
                class126.method1046(22050, 2, (byte) 102, !class74.field1705);
                class15 var24 = new class15();
                var24.method167(9, 128, -2);
                client.field570 = class120.method1026(class83.field1850, arg0 - 19, 0, 22050, class140.field3523);
                client.field570.method1180(var24, 6617);
                class60.method601(var24, class28.field811, arg0 ^ 0x11, class53.field1333, class56.field1407);
                field2630 = class120.method1026(class83.field1850, 2, 1, 2048, class140.field3523);
                class37.field1014 = new class47();
                field2630.method1180(class37.field1014, 6617);
                class63.field1550 = new class94(22050, class93.field2181);
                class103.field2576 = 50;
                class127.field3226 = 35;
                class93.field2178 = class127.field3222;
            } else if (class103.field2576 == 50) {
                int var25 = 0;
                if (class54.field1367 == null) {
                    class54.field1367 = class98.method819(-2048, class128.field3272, class107.field2693, class103.field2600);
                } else {
                    var25++;
                }
                if (class50.field1255 == null) {
                    class50.field1255 = class98.method819(-2048, class128.field3272, class107.field2693, class101.field2535);
                } else {
                    var25++;
                }
                if (class96.field2224 == null) {
                    class96.field2224 = class98.method819(-2048, class128.field3272, class107.field2693, class111.field2863);
                } else {
                    var25++;
                }
                if (var25 < 3) {
                    class93.field2178 = class137.method1111(new class39[] { class100.field2505, class86.method734(var25 * 100 / 3, 2218), class37.field1017 }, (byte) 74);
                    class127.field3226 = 40;
                } else {
                    class103.field2576 = 60;
                    class93.field2178 = class28.field806;
                    class127.field3226 = 40;
                }
            } else if (class103.field2576 == 60) {
                int var26 = class38.method426(13859, class1.field10, class128.field3272);
                int var27 = class39.method435((byte) 104);
                if (var27 > var26) {
                    class93.field2178 = class137.method1111(new class39[] { class142.field3557, class86.method734(var26 * 100 / var27, 2218), class37.field1017 }, (byte) 89);
                    class127.field3226 = 50;
                } else {
                    class93.field2178 = class109.field2800;
                    class127.field3226 = 50;
                    class114.method990((byte) -109, 5);
                    class103.field2576 = 70;
                }
            } else if (class103.field2576 == 70) {
                if (class57.field1416.method847(-27293)) {
                    class67.method635(class57.field1416, arg0 - 21);
                    class124.method1040(false, class57.field1416);
                    class50.method550(class57.field1416, -86, class111.field2879);
                    class145.method1168(class74.field1705, class111.field2879, class57.field1416, (byte) 86);
                    class88.method754(class111.field2879, (byte) 93, class57.field1416);
                    class117.method1019((byte) 65, class57.field1416, class111.field2879, class26.field743, class54.field1367);
                    class71.method658(class57.field1416, class78.field1779, 12584, class43.field1182);
                    class90.method771(0, class111.field2879, class57.field1416);
                    class55.method572(arg0 - 49, class57.field1416);
                    class67.method634(arg0 - 132, class57.field1416);
                    class37.method422(class128.field3272, 19784, class111.field2879, class83.field1844);
                    class96.method805(class57.field1416, 80);
                    class90.method772(2938, class57.field1416);
                    class93.field2178 = class1.field20;
                    class103.field2576 = 80;
                    class127.field3226 = 60;
                } else {
                    class93.field2178 = class137.method1111(new class39[] { class68.field1629, class86.method734(class57.field1416.method767(0), 2218), class37.field1017 }, (byte) -65);
                    class127.field3226 = 60;
                }
            } else if (class103.field2576 == 80) {
                int var28 = 0;
                if (class97.field2310 == null) {
                    class97.field2310 = class55.method573((byte) -68, class128.field3272, class94.field2204, class107.field2693);
                } else {
                    var28++;
                }
                if (class55.field1388 == null) {
                    class55.field1388 = class55.method573((byte) -48, class128.field3272, class145.field3612, class107.field2693);
                } else {
                    var28++;
                }
                if (class119.field3101 == null) {
                    class119.field3101 = class145.method1167(class128.field3272, class14.field367, (byte) -83, class107.field2693);
                } else {
                    var28++;
                }
                if (class24.field648 == null) {
                    class24.field648 = class101.method870(class128.field3272, -1, class107.field2693, class66.field1578);
                } else {
                    var28++;
                }
                if (class112.field2938 == null) {
                    class112.field2938 = class101.method870(class128.field3272, arg0 ^ 0xFFFFFFEA, class107.field2693, class18.field501);
                } else {
                    var28++;
                }
                if (class72.field1690 == null) {
                    class72.field1690 = class101.method870(class128.field3272, -1, class107.field2693, class50.field1261);
                } else {
                    var28++;
                }
                if (class50.field1263 == null) {
                    class50.field1263 = class101.method870(class128.field3272, arg0 ^ 0xFFFFFFEA, class107.field2693, class136.field3418);
                } else {
                    var28++;
                }
                if (class139.field3511 == null) {
                    class139.field3511 = class101.method870(class128.field3272, -1, class107.field2693, class57.field1412);
                } else {
                    var28++;
                }
                if (field2626 == null) {
                    field2626 = class55.method573((byte) 126, class128.field3272, class63.field1553, class107.field2693);
                } else {
                    var28++;
                }
                if (class146.field3643 == null) {
                    class146.field3643 = class101.method870(class128.field3272, -1, class107.field2693, class97.field2296);
                } else {
                    var28++;
                }
                if (class70.field1637 == null) {
                    class70.field1637 = class101.method870(class128.field3272, -1, class107.field2693, class15.field432);
                } else {
                    var28++;
                }
                if (class34.field891 == null) {
                    class34.field891 = class101.method870(class128.field3272, -1, class107.field2693, class75.field1730);
                } else {
                    var28++;
                }
                if (class39.field1103 == null) {
                    class39.field1103 = class145.method1167(class128.field3272, class140.field3533, (byte) -121, class107.field2693);
                } else {
                    var28++;
                }
                if (class92.field2167 == null) {
                    class92.field2167 = class145.method1167(class128.field3272, class119.field3116, (byte) -107, class107.field2693);
                } else {
                    var28++;
                }
                if (var28 < 14) {
                    class93.field2178 = class137.method1111(new class39[] { class13.field346, class86.method734(var28 * 100 / 14, 2218), class37.field1017 }, (byte) 127);
                    class127.field3226 = 70;
                } else {
                    class55.field1388.method121();
                    int var29 = (int) (Math.random() * 21.0D) - 10;
                    int var30 = (int) (Math.random() * 21.0D) - 10;
                    int var31 = (int) (Math.random() * 21.0D) - 10;
                    int var32 = (int) (Math.random() * 41.0D) - 20;
                    for (int var33 = 0; var33 < class24.field648.length; var33++) {
                        class24.field648[var33].method114(var29 + var32, var30 + var32, var31 + var32);
                    }
                    class119.field3101[0].method1151(var29 + var32, var30 + var32, var31 + var32);
                    class93.field2178 = class76.field1745;
                    class127.field3226 = 70;
                    class103.field2576 = 85;
                }
            } else if (class103.field2576 == 85) {
                int var34 = class39.method449(class128.field3272, true);
                int var35 = class111.method977(-84);
                if (var34 < var35) {
                    class93.field2178 = class137.method1111(new class39[] { class68.field1630, class86.method734(var34 * 100 / var35, 2218), class37.field1017 }, (byte) 89);
                    class127.field3226 = 80;
                } else {
                    class93.field2178 = class12.field317;
                    class103.field2576 = 90;
                    class127.field3226 = 80;
                }
            } else if (class103.field2576 == 90) {
                if (class53.field1337.method847(-27293)) {
                    class87 var36 = new class87(class53.field1337, class128.field3272, 20, 0.8D, class74.field1705 ? 64 : 128);
                    class40.method484(var36);
                    class40.method485(0.8D);
                    class127.field3226 = 90;
                    class103.field2576 = 110;
                    class93.field2178 = class150.field3718;
                } else {
                    class93.field2178 = class137.method1111(new class39[] { class97.field2301, class86.method734(class53.field1337.method767(0), arg0 ^ 0x8BF), class37.field1017 }, (byte) -84);
                    class127.field3226 = 90;
                }
            } else if (class103.field2576 == 110) {
                class150.field3716 = new class31();
                class83.field1850.method1087(10, class150.field3716, (byte) 125);
                class93.field2178 = class3.field77;
                class103.field2576 = 120;
                class127.field3226 = 94;
            } else if (class103.field2576 == 120) {
                if (class1.field10.method843(class109.field2804, class107.field2693, -20)) {
                    class137 var37 = new class137(class1.field10.method856(class109.field2804, class107.field2693, (byte) 15));
                    class29.method357(var37, -13762);
                    class127.field3226 = 96;
                    class93.field2178 = class55.field1369;
                    class103.field2576 = 130;
                } else {
                    class93.field2178 = class137.method1111(new class39[] { class97.field2309, class114.field2997 }, (byte) -78);
                    class127.field3226 = 96;
                }
            } else if (class103.field2576 == 130) {
                if (!class83.field1844.method847(-27293)) {
                    class93.field2178 = class137.method1111(new class39[] { class67.field1596, class86.method734(class83.field1844.method767(0) * 4 / 5, 2218), class37.field1017 }, (byte) 112);
                    class127.field3226 = 100;
                } else if (!class28.field818.method847(-27293)) {
                    class93.field2178 = class137.method1111(new class39[] { class67.field1596, class86.method734(class28.field818.method767(0) / 6 + 80, 2218), class37.field1017 }, (byte) 124);
                    class127.field3226 = 100;
                } else if (class131.field3318.method847(-27293)) {
                    class127.field3226 = 100;
                    class93.field2178 = class120.field3149;
                    class103.field2576 = 140;
                } else {
                    class93.field2178 = class137.method1111(new class39[] { class67.field1596, class86.method734(class131.field3318.method767(arg0 - 21) / 20 + 96, arg0 + 2197), class37.field1017 }, (byte) -120);
                    class127.field3226 = 100;
                }
            } else if (class103.field2576 == 140) {
                class114.method990((byte) -103, 10);
            }
        }
    }
}
