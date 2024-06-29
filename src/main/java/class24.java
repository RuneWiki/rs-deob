import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class24 {

    @OriginalMember(owner = "client!de", name = "B", descriptor = "I")
    private int field578 = 0;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "I")
    private int field575;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "[Lsa;")
    private class108[] field576;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "Lgd;")
    public static class40 field552 = class14.method90(false, "Wen m-Ochten Sie entfernen?");

    @OriginalMember(owner = "client!de", name = "n", descriptor = "Lgd;")
    public static class40 field564 = class14.method90(false, "0(U");

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field555 = 0;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "Lgd;")
    public static class40 field565 = class14.method90(false, "auf einer freien Welt zu spielen)3");

    @OriginalMember(owner = "client!de", name = "l", descriptor = "Lgd;")
    private static class40 field562 = class14.method90(false, "Enter name of friend to add to list");

    @OriginalMember(owner = "client!de", name = "v", descriptor = "Lgd;")
    public static class40 field572 = class14.method90(false, "@red@");

    @OriginalMember(owner = "client!de", name = "d", descriptor = "[[[I")
    public static int[][][] field554 = new int[4][13][13];

    @OriginalMember(owner = "client!de", name = "t", descriptor = "Lgd;")
    public static class40 field570 = class14.method90(false, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!de", name = "u", descriptor = "Lgd;")
    public static class40 field571 = field562;

    @OriginalMember(owner = "client!de", name = "C", descriptor = "Lgd;")
    public static class40 field579 = class14.method90(false, "Ung-Ultiger Benutzername");

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!de", name = "D", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "J")
    private long field553;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "Lsa;")
    private class108 field569;

    @OriginalMember(owner = "client!de", name = "A", descriptor = "Lsa;")
    private class108 field577;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "[I")
    public static int[] field567;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "[[[B")
    public static byte[][][] field566;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)Lsa;", line = 6)
    public final class108 method139(int arg0) {
        this.field578 = 0;
        field559++;
        if (arg0 <= 108) {
            this.method142(58L, 46);
        }
        return this.method140(-1);
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)Lsa;", line = 22)
    private final class108 method140(int arg0) {
        field557++;
        if (~this.field578 < arg0 && this.field576[this.field578 - 1] != this.field577) {
            class108 var2 = this.field577;
            this.field577 = var2.field2621;
            return var2;
        }
        while (this.field578 < this.field575) {
            class108 var3 = this.field576[this.field578++].field2621;
            if (this.field576[this.field578 - 1] != var3) {
                this.field577 = var3.field2621;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III)V", line = 69)
    public static final void method141(int arg0, int arg1, int arg2) {
        field551++;
        class125 var3 = class108.method834(false, arg0);
        int var4 = var3.field2956;
        int var5 = var3.field2959;
        int var6 = var3.field2960;
        int var7 = class1.field13[var6 - var5];
        if (arg1 < 0 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class48.field1209[var4] = class43.method294(class101.method709(var8, arg1 << var5), class101.method709(class48.field1209[var4], ~var8));
        if (arg2 > -85) {
            field564 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(JI)Lsa;", line = 96)
    public final class108 method142(long arg0, int arg1) {
        this.field553 = arg0;
        field574++;
        class108 var4 = this.field576[(int) ((long) (this.field575 - 1) & arg0)];
        this.field569 = var4.field2621;
        if (arg1 != 23056) {
            method147(12, 58, -13, null);
        }
        while (this.field569 != var4) {
            if (this.field569.field2647 == arg0) {
                class108 var5 = this.field569;
                this.field569 = this.field569.field2621;
                return var5;
            }
            this.field569 = this.field569.field2621;
        }
        this.field569 = null;
        return null;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)Z", line = 128)
    public static final boolean method143(int arg0) {
        field560++;
        class58 var1 = class134.field3260;
        synchronized (class134.field3260) {
            if (class66.field1629 == class100.field2377) {
                return false;
            }
            class137.field3334 = class108.field2638[class66.field1629];
            class14.field400 = class18.field432[class66.field1629];
            class66.field1629 = class66.field1629 + 1 & 0x7F;
            if (arg0 != 507) {
                method149((byte) -126, null);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lsa;JI)V", line = 155)
    public final void method144(class108 arg0, long arg1, int arg2) {
        field580++;
        if (arg2 != 17348) {
            field565 = null;
        }
        if (arg0.field2639 != null) {
            arg0.method833(4);
        }
        class108 var5 = this.field576[(int) ((long) (this.field575 - 1) & arg1)];
        arg0.field2647 = arg1;
        arg0.field2621 = var5;
        arg0.field2639 = var5.field2639;
        arg0.field2639.field2621 = arg0;
        arg0.field2621.field2639 = arg0;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BJ)V", line = 176)
    public static final void method145(byte arg0, long arg1) {
        field556++;
        if (arg1 == 0L) {
            return;
        }
        if (class42.field1065 >= 100) {
            class77.method521(class125.field2966, class54.field1360, false, 0);
            return;
        }
        class40 var3 = class64.method463(arg1, (byte) -87).method244(0);
        for (int var4 = 0; var4 < class42.field1065; var4++) {
            if (class67.field1657[var4] == arg1) {
                class77.method521(class125.field2966, client.method114(true, new class40[] { var3, class35.field894 }), false, 0);
                return;
            }
        }
        for (int var5 = 0; var5 < class7.field181; var5++) {
            if (class104.field2539[var5] == arg1) {
                class77.method521(class125.field2966, client.method114(true, new class40[] { class85.field1896, var3, class129.field3087 }), false, 0);
                return;
            }
        }
        if (var3.method269(class13.field332.field2210, -62)) {
            return;
        }
        class67.field1657[class42.field1065++] = arg1;
        class74.field1731++;
        if (arg0 < 101) {
            method146((byte) 44);
        }
        class45.field1124 = true;
        class92.field2094.method290((byte) 0, 239);
        class92.field2094.method793(arg1, false);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V", line = 243)
    public static void method146(byte arg0) {
        field572 = null;
        field570 = null;
        field571 = null;
        field565 = null;
        if (arg0 != -20) {
            return;
        }
        field579 = null;
        field566 = null;
        field564 = null;
        field554 = null;
        field562 = null;
        field552 = null;
        field567 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III[B)Z", line = 278)
    public static final boolean method147(int arg0, int arg1, int arg2, byte[] arg3) {
        field558++;
        if (arg0 != 22) {
            return false;
        }
        boolean var4 = true;
        int var5 = -1;
        class104 var6 = new class104(arg3);
        label58: while (true) {
            int var7 = var6.method803((byte) 99);
            if (var7 == 0) {
                return var4;
            }
            int var8 = 0;
            boolean var9 = false;
            var5 += var7;
            while (true) {
                while (!var9) {
                    int var11 = var6.method803((byte) -80);
                    if (var11 == 0) {
                        continue label58;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 >> 6 & 0x3F;
                    int var13 = var8 & 0x3F;
                    int var14 = var6.method798((byte) -103) >> 2;
                    int var15 = arg2 + var12;
                    int var16 = var13 + arg1;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class14 var17 = class114.method884(var5, (byte) -56);
                        if (var14 != 22 || !class8.field209 || var17.field360 != 0 || var17.field394) {
                            if (!var17.method83((byte) -15)) {
                                var4 = false;
                                class13.field346++;
                            }
                            var9 = true;
                        }
                    }
                }
                int var10 = var6.method803((byte) -60);
                if (var10 == 0) {
                    break;
                }
                var6.method798((byte) -110);
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V", line = 369)
    public static final void method148(byte arg0) {
        field561++;
        client.method118(arg0 + 8);
        if (class96.field2238 == 1) {
            class88.field1987[class92.field2096 / 100].method342(class30.field653 - 8 - 4, class35.field895 + -8 + -4);
        }
        if (class96.field2238 == 2) {
            class88.field1987[class92.field2096 / 100 + 4].method342(class30.field653 - 4 - 8, class35.field895 + -12);
        }
        if (class86.field1935 != -1) {
            class44.method305(-866143504, class86.field1935);
            class60.method446(334, 124, 4, 0, 0, 512, class86.field1935);
        }
        if (class131.field3169 != -1) {
            class44.method305(arg0 - 866143496, class131.field3169);
            class60.method446(334, 103, 0, 0, 0, 512, class131.field3169);
        }
        if (arg0 != -8) {
            return;
        }
        class82.method544(-5873);
        if (!class90.field2040) {
            class112.method872(-1);
            class44.method302(arg0 + 8);
        } else if (class113.field2742 == 0) {
            class74.method504(true);
        }
        if (class92.field2099 == 1) {
            class43.field1084.method342(472, 296);
        }
        if (class122.field2871) {
            byte var1 = 20;
            short var2 = 507;
            class133.field3238.method348(client.method114(true, new class40[] { class114.field2755, class21.method121(arg0 ^ 0xFFFFA46C, class1.field22) }), var2, var1, 16776960);
            int var9 = var1 + 15;
            int var3 = 16776960;
            Runtime var4 = Runtime.getRuntime();
            int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
            if (var5 > 32768 && class8.field209) {
                var3 = 16711680;
            }
            if (var5 > 65536 && !class8.field209) {
                var3 = 16711680;
            }
            class133.field3238.method348(client.method114(true, new class40[] { class76.field1766, class21.method121(arg0 ^ 0xFFFFA46C, var5), class106.field2592 }), var2, var9, var3);
            var9 += 15;
            if (class12.field300) {
                class133.field3238.method348(class103.field2496, var2, var9, 16711680);
                var9 += 15;
                class12.field300 = false;
            }
            if (class30.field762) {
                class133.field3238.method348(class53.field1346, var2, var9, 16711680);
                var9 += 15;
                class30.field762 = false;
            }
            if (class114.field2748) {
                class133.field3238.method348(class64.field1569, var2, var9, 16711680);
                class114.field2748 = false;
                var9 += 15;
            }
        }
        if (class82.field1856 == 0) {
            return;
        }
        int var6 = class82.field1856 / 50;
        int var7 = var6 / 60;
        int var8 = var6 % 60;
        if (var8 >= 10) {
            class133.field3238.method353(client.method114(true, new class40[] { class70.field1681, class21.method121(arg0 ^ 0xFFFFA46C, var7), class45.field1141, class21.method121(arg0 + 23452, var8) }), 4, 329, 16776960);
        } else {
            class133.field3238.method353(client.method114(true, new class40[] { class70.field1681, class21.method121(23444, var7), class2.field50, class21.method121(23444, var8) }), 4, 329, 16776960);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BLfa;)V", line = 490)
    public static final void method149(byte arg0, class31 arg1) {
        arg1.field805 = false;
        field568++;
        if (arg0 > -17) {
            field567 = null;
        }
        if (arg1.field777 != -1) {
            class45 var2 = class22.method126((byte) -84, arg1.field777);
            if (var2 == null || var2.field1155 == null) {
                arg1.field777 = -1;
            } else {
                arg1.field812++;
                if (var2.field1155.length > arg1.field798 && var2.field1123[arg1.field798] < arg1.field812) {
                    arg1.field812 = 1;
                    arg1.field798++;
                }
                if (arg1.field798 >= var2.field1155.length) {
                    arg1.field812 = 0;
                    arg1.field798 = 0;
                }
            }
        }
        if (arg1.field827 != -1 && arg1.field776 <= class10.field242) {
            if (arg1.field806 < 0) {
                arg1.field806 = 0;
            }
            int var3 = class58.method437(arg1.field827, -4990).field1252;
            if (var3 == -1) {
                arg1.field827 = -1;
            } else {
                class45 var4 = class22.method126((byte) -98, var3);
                if (var4 == null || var4.field1155 == null) {
                    arg1.field827 = -1;
                } else {
                    arg1.field832++;
                    if (arg1.field806 < var4.field1155.length && var4.field1123[arg1.field806] < arg1.field832) {
                        arg1.field832 = 1;
                        arg1.field806++;
                    }
                    if (arg1.field806 >= var4.field1155.length && (arg1.field806 < 0 || arg1.field806 >= var4.field1155.length)) {
                        arg1.field827 = -1;
                    }
                }
            }
        }
        if (arg1.field813 != -1 && arg1.field804 <= 1) {
            class45 var5 = class22.method126((byte) 90, arg1.field813);
            if (var5.field1127 == 1 && arg1.field770 > 0 && class10.field242 >= arg1.field826 && arg1.field822 < class10.field242) {
                arg1.field804 = 1;
                return;
            }
        }
        if (arg1.field813 != -1 && arg1.field804 == 0) {
            class45 var6 = class22.method126((byte) 106, arg1.field813);
            if (var6 == null || var6.field1155 == null) {
                arg1.field813 = -1;
            } else {
                arg1.field816++;
                if (var6.field1155.length > arg1.field799 && var6.field1123[arg1.field799] < arg1.field816) {
                    arg1.field816 = 1;
                    arg1.field799++;
                }
                if (arg1.field799 >= var6.field1155.length) {
                    arg1.field824++;
                    arg1.field799 -= var6.field1142;
                    if (arg1.field824 >= var6.field1128) {
                        arg1.field813 = -1;
                    }
                    if (arg1.field799 < 0 || arg1.field799 >= var6.field1155.length) {
                        arg1.field813 = -1;
                    }
                }
                arg1.field805 = var6.field1150;
            }
        }
        if (arg1.field804 > 0) {
            arg1.field804--;
        }
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)Lsa;", line = 623)
    public final class108 method150(int arg0) {
        field563++;
        if (this.field569 == null) {
            return null;
        }
        class108 var2 = this.field576[(int) ((long) (this.field575 - 1) & this.field553)];
        if (arg0 != 19170) {
            method141(-19, -64, 83);
        }
        while (this.field569 != var2) {
            if (this.field569.field2647 == this.field553) {
                class108 var3 = this.field569;
                this.field569 = this.field569.field2621;
                return var3;
            }
            this.field569 = this.field569.field2621;
        }
        this.field569 = null;
        return null;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(I)V", line = 659)
    public class24(int arg0) {
        this.field575 = arg0;
        this.field576 = new class108[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class108 var3 = this.field576[var2] = new class108();
            var3.field2639 = var3;
            var3.field2621 = var3;
        }
    }
}
