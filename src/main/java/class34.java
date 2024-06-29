import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class34 {

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field788 = 0;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "Lu;")
    public static class135 field794 = class87.method676((byte) -103, "(U(Y");

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "Z")
    public static boolean field789 = false;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field790 = 0;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "Le;")
    public static class29 field795 = new class29(50);

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "Lu;")
    public static class135 field797 = class87.method676((byte) -91, "m");

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public static int field799 = 0;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "Lu;")
    public static class135 field800 = class87.method676((byte) -45, "Lade Freunde)2Liste)3)3)3");

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "Lu;")
    private static class135 field801 = class87.method676((byte) -40, " is already on your ignore list");

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "Lu;")
    public static class135 field798 = field801;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "Lu;")
    public static class135 field803 = class87.method676((byte) -56, "Ihre Nachricht an: ");

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "Lg;")
    public static class43 field802;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
    public static final void method265(byte arg0) {
        class109.field2640.method234(-22666);
        field791++;
        if (arg0 != 80) {
            method267(null, -2, null);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lu;Lu;BLg;)Lae;")
    public static final class6 method266(class135 arg0, class135 arg1, byte arg2, class43 arg3) {
        field787++;
        int var4 = -121 / ((arg2 + 58) / 44);
        int var5 = arg3.method317((byte) 13, arg1);
        int var6 = arg3.method340(var5, (byte) 37, arg0);
        return class82.method638(arg3, var5, (byte) -56, var6);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V")
    public static final void method267(String arg0, int arg1, Throwable arg2) {
        field792++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class59.method471(arg2, (byte) -112);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace((char) arg1, '_');
            if (class111.field2690.field654 != null) {
                class64 var8 = class111.field2690.method218(-86, new URL(class111.field2690.field654.getCodeBase(), "clienterror.ws?c=" + class99.field2390 + "&u=" + class100.field2421 + "&v1=" + class27.field655 + "&v2=" + class27.field649 + "&e=" + var7));
                while (var8.field1592 == 0) {
                    class96.method795(1L, 85);
                }
                if (var8.field1592 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field1596;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)I")
    public static int method268(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IJ)V")
    public static final void method269(int arg0, long arg1) {
        field796++;
        if (arg1 == 0L) {
            return;
        }
        if (class79.field1885 >= 100 && field799 != 1 || class79.field1885 >= 200) {
            class82.method635(0, class113.field2742, (byte) 96, class17.field382);
            return;
        }
        class135 var3 = class131.method1054(false, arg1).method1088((byte) 56);
        for (int var4 = 0; var4 < class79.field1885; var4++) {
            if (class8.field148[var4] == arg1) {
                class82.method635(0, class113.field2742, (byte) 117, class107.method867(2, new class135[] { var3, class97.field2348 }));
                return;
            }
        }
        int var5 = 0;
        if (arg0 != 2) {
            return;
        }
        while (var5 < class119.field2844) {
            if (class14.field340[var5] == arg1) {
                class82.method635(0, class113.field2742, (byte) 112, class107.method867(2, new class135[] { class23.field580, var3, class38.field870 }));
                return;
            }
            var5++;
        }
        if (var3.method1101(class116.field2789.field3516, (byte) 120)) {
            return;
        }
        class23.field563[class79.field1885] = var3;
        class143.field3492++;
        class8.field148[class79.field1885] = arg1;
        class94.field2281[class79.field1885] = 0;
        class28.field667[class79.field1885] = 0;
        class135.field3239 = true;
        class53.field1257 = class126.field2998 + 1;
        class79.field1885++;
        class152.field3751.method929(174, -14044);
        class152.field3751.method461(11739, arg1);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static void method270(int arg0) {
        field801 = null;
        field797 = null;
        field802 = null;
        field798 = null;
        field800 = null;
        field795 = null;
        field794 = null;
        field803 = null;
        if (arg0 <= 89) {
            field790 = 29;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)V")
    public static final void method271(byte arg0, int arg1) {
        field786++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class65.field1632[arg1];
        int var3 = class93.field2202[arg1];
        int var4 = class69.field1706[arg1];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var5 = class104.field2514[arg1];
        if (class42.field975 != 0 && var4 != 1004) {
            class65.field1634 = true;
            class42.field975 = 0;
        }
        if (var4 == 2 || var4 == 51) {
            class135 var6 = class108.field2599[arg1];
            int var7 = var6.method1090((byte) 64, class49.field1160);
            if (var7 != -1) {
                boolean var8 = false;
                class135 var9 = var6.method1065((byte) -125, var7 + 5).method1086((byte) 120);
                class135 var10 = var9.method1077(-109).method1088((byte) 56);
                for (int var11 = 0; var11 < class14.field329; var11++) {
                    class145 var12 = class131.field3166[class108.field2600[var11]];
                    if (var12 != null && var12.field3516 != null && var12.field3516.method1069(90, var10)) {
                        var8 = true;
                        class56.method432(2, 1, false, 0, var12.field162[0], 0, var12.field192[0], 0, 1, class116.field2789.field162[0], true, class116.field2789.field192[0]);
                        if (var4 == 2) {
                            class39.field901++;
                            class152.field3751.method929(59, -14044);
                            class152.field3751.method451(class108.field2600[var11], (byte) 28);
                        }
                        if (var4 == 51) {
                            class125.field2975++;
                            class152.field3751.method929(231, -14044);
                            class152.field3751.method477(1407478024, class108.field2600[var11]);
                        }
                        break;
                    }
                }
                if (!var8) {
                    class82.method635(0, class113.field2742, (byte) 104, class107.method867(2, new class135[] { class139.field3372, var10 }));
                }
            }
        }
        if (var4 == 54) {
            class43.field1008++;
            class68.method550((byte) -9, var2, var5, var3);
            class152.field3751.method929(251, -14044);
            class152.field3751.method470((byte) -98, class76.field1795 + var3);
            class152.field3751.method477(1407478024, class126.field3010 + var2);
            class152.field3751.method448(var5 >> 14 & 0x7FFF, true);
        }
        if (var4 == 30) {
            class145 var13 = class131.field3166[var5];
            if (var13 != null) {
                class56.method432(2, 1, false, 0, var13.field162[0], 0, var13.field192[0], 0, 1, class116.field2789.field162[0], true, class116.field2789.field192[0]);
                class148.field3692 = 2;
                class39.field901++;
                class90.field2116 = class139.field3389;
                class44.field1069 = 0;
                class145.field3517 = class20.field470;
                class152.field3751.method929(59, -14044);
                class152.field3751.method451(var5, (byte) 28);
            }
        }
        if (var4 == 53) {
            class145 var14 = class131.field3166[var5];
            if (var14 != null) {
                class125.field2975++;
                class56.method432(2, 1, false, 0, var14.field162[0], 0, var14.field192[0], 0, 1, class116.field2789.field162[0], true, class116.field2789.field192[0]);
                class90.field2116 = class139.field3389;
                class148.field3692 = 2;
                class44.field1069 = 0;
                class145.field3517 = class20.field470;
                class152.field3751.method929(231, -14044);
                class152.field3751.method477(1407478024, var5);
            }
        }
        if (var4 == 40) {
            class21.field489++;
            boolean var15 = class56.method432(2, 0, false, 0, var3, 0, var2, 0, 0, class116.field2789.field162[0], true, class116.field2789.field192[0]);
            if (!var15) {
                class56.method432(2, 1, false, 0, var3, 0, var2, 0, 1, class116.field2789.field162[0], true, class116.field2789.field192[0]);
            }
            class145.field3517 = class20.field470;
            class90.field2116 = class139.field3389;
            class44.field1069 = 0;
            class148.field3692 = 2;
            class152.field3751.method929(124, -14044);
            class152.field3751.method448(var5, true);
            class152.field3751.method477(1407478024, var3 + class76.field1795);
            class152.field3751.method451(class126.field3010 + var2, (byte) 28);
        }
        if (var4 == 27) {
            client.field505++;
            boolean var17 = class56.method432(2, 0, false, 0, var3, 0, var2, 0, 0, class116.field2789.field162[0], true, class116.field2789.field192[0]);
            if (!var17) {
                class56.method432(2, 1, false, 0, var3, 0, var2, 0, 1, class116.field2789.field162[0], true, class116.field2789.field192[0]);
            }
            class44.field1069 = 0;
            class145.field3517 = class20.field470;
            class90.field2116 = class139.field3389;
            class148.field3692 = 2;
            class152.field3751.method929(24, -14044);
            class152.field3751.method470((byte) -122, var5);
            class152.field3751.method470((byte) -106, class76.field1795 + var3);
            class152.field3751.method470((byte) -112, class126.field3010 + var2);
        }
        if (var4 == 9) {
            class111 var19 = class96.field2340[var5];
            if (var19 != null) {
                class56.method432(2, 1, false, 0, var19.field162[0], 0, var19.field192[0], 0, 1, class116.field2789.field162[0], true, class116.field2789.field192[0]);
                class148.field3692 = 2;
                class145.field3517 = class20.field470;
                class90.field2116 = class139.field3389;
                class44.field1069 = 0;
                class116.field2790++;
                class152.field3751.method929(235, -14044);
                class152.field3751.method477(1407478024, class52.field1236);
                class152.field3751.method477(1407478024, class55.field1286);
                class152.field3751.method458(127, class94.field2232);
                class152.field3751.method448(var5, true);
            }
        }
        if (var4 == 16) {
            class145 var20 = class131.field3166[var5];
            if (var20 != null) {
                class56.method432(2, 1, false, 0, var20.field162[0], 0, var20.field192[0], 0, 1, class116.field2789.field162[0], true, class116.field2789.field192[0]);
                class44.field1069 = 0;
                class90.field2116 = class139.field3389;
                class1.field12++;
                class145.field3517 = class20.field470;
                class148.field3692 = 2;
                class152.field3751.method929(75, -14044);
                class152.field3751.method470((byte) -111, var5);
                class152.field3751.method490((byte) -94, class47.field1117);
                class152.field3751.method451(class53.field1274, (byte) 28);
            }
        }
        if (var4 == 8) {
            class152.field3751.method929(233, -14044);
            class152.field3751.method448(var2, true);
            class78.field1838++;
            class152.field3751.method470((byte) -127, var5);
            class152.field3751.method458(127, var3);
            class107.field2568 = 2;
            class100.field2415 = var3;
            class44.field1079 = var2;
            class83.field1977 = 0;
            if (var3 >> 16 == class106.field2552) {
                class107.field2568 = 1;
            }
            if (var3 >> 16 == class49.field1174) {
                class107.field2568 = 3;
            }
        }
        if (var4 == 42) {
            class68.method550((byte) -9, var2, var5, var3);
            class103.field2488++;
            class152.field3751.method929(111, -14044);
            class152.field3751.method477(1407478024, var5 >> 14 & 0x7FFF);
            class152.field3751.method470((byte) -92, class126.field3010 + var2);
            class152.field3751.method451(var3 + class76.field1795, (byte) 28);
        }
        if (var4 == 38) {
            class152.field3751.method929(80, -14044);
            class19.field432++;
            class152.field3751.method448(var5, true);
            class152.field3751.method470((byte) -76, var2);
            class152.field3751.method458(127, var3);
            class152.field3751.method470((byte) 53, class53.field1274);
            class152.field3751.method490((byte) -94, class47.field1117);
            class83.field1977 = 0;
            class100.field2415 = var3;
            class44.field1079 = var2;
            class107.field2568 = 2;
            if (var3 >> 16 == class106.field2552) {
                class107.field2568 = 1;
            }
            if (var3 >> 16 == class49.field1174) {
                class107.field2568 = 3;
            }
        }
        if (var4 == 5) {
            class111 var21 = class96.field2340[var5];
            if (var21 != null) {
                class56.method432(2, 1, false, 0, var21.field162[0], 0, var21.field192[0], 0, 1, class116.field2789.field162[0], true, class116.field2789.field192[0]);
                class148.field3692 = 2;
                class145.field3517 = class20.field470;
                class35.field813++;
                class44.field1069 = 0;
                class90.field2116 = class139.field3389;
                class152.field3751.method929(126, -14044);
                class152.field3751.method451(var5, (byte) 28);
            }
        }
        if (var4 == 36) {
            class152.field3751.method929(93, -14044);
            class152.field3751.method470((byte) -77, var5);
            class95.field2291++;
            class152.field3751.method451(var2, (byte) 28);
            class152.field3751.method458(127, var3);
            class44.field1079 = var2;
            class100.field2415 = var3;
            class107.field2568 = 2;
            if (var3 >> 16 == class106.field2552) {
                class107.field2568 = 1;
            }
            if (var3 >> 16 == class49.field1174) {
                class107.field2568 = 3;
            }
            class83.field1977 = 0;
        }
        if (var4 == 15) {
            class40.field930++;
            boolean var22 = class56.method432(2, 0, false, 0, var3, 0, var2, 0, 0, class116.field2789.field162[0], true, class116.field2789.field192[0]);
            if (!var22) {
                class56.method432(2, 1, false, 0, var3, 0, var2, 0, 1, class116.field2789.field162[0], true, class116.field2789.field192[0]);
            }
            class145.field3517 = class20.field470;
            class44.field1069 = 0;
            class148.field3692 = 2;
            class90.field2116 = class139.field3389;
            class152.field3751.method929(216, -14044);
            class152.field3751.method448(class126.field3010 + var2, true);
            class152.field3751.method477(1407478024, var5);
            class152.field3751.method448(class76.field1795 + var3, true);
        }
        if (var4 == 18) {
            class59.field1493++;
            class152.field3751.method929(228, -14044);
            class152.field3751.method448(var2, true);
            class152.field3751.method474(-47, var3);
            class152.field3751.method451(var5, (byte) 28);
            class83.field1977 = 0;
            class100.field2415 = var3;
            class44.field1079 = var2;
            class107.field2568 = 2;
            if (var3 >> 16 == class106.field2552) {
                class107.field2568 = 1;
            }
            if (var3 >> 16 == class49.field1174) {
                class107.field2568 = 3;
            }
        }
        if (var4 == 14) {
            class152.field3751.method929(131, -14044);
            class122.field2919++;
            class152.field3751.method458(127, class47.field1117);
            class152.field3751.method470((byte) 97, var2);
            class152.field3751.method490((byte) -94, var3);
            class152.field3751.method470((byte) 68, class53.field1274);
        }
        if (var4 == 21) {
            class19.field433++;
            class152.field3751.method929(139, -14044);
            class152.field3751.method463(119, var3);
            class146 var24 = class48.method360(-78, var3);
            if (var24.field3556 != null && var24.field3556[0][0] == 5) {
                int var25 = var24.field3556[0][1];
                if (class104.field2513[var25] != var24.field3640[0]) {
                    class104.field2513[var25] = var24.field3640[0];
                    class48.method366(var25, -126);
                    class135.field3239 = true;
                }
            }
        }
        if (var4 == 1) {
            class152.field3751.method929(238, -14044);
            class152.field3751.method463(67, var3);
            class80.field1895++;
            class152.field3751.method451(var5, (byte) 28);
            class152.field3751.method448(var2, true);
            class100.field2415 = var3;
            class44.field1079 = var2;
            class107.field2568 = 2;
            class83.field1977 = 0;
            if (var3 >> 16 == class106.field2552) {
                class107.field2568 = 1;
            }
            if (var3 >> 16 == class49.field1174) {
                class107.field2568 = 3;
            }
        }
        if (var4 == 50) {
            class145 var26 = class131.field3166[var5];
            if (var26 != null) {
                class82.field1954++;
                class56.method432(2, 1, false, 0, var26.field162[0], 0, var26.field192[0], 0, 1, class116.field2789.field162[0], true, class116.field2789.field192[0]);
                class148.field3692 = 2;
                class145.field3517 = class20.field470;
                class44.field1069 = 0;
                class90.field2116 = class139.field3389;
                class152.field3751.method929(50, -14044);
                class152.field3751.method448(var5, true);
            }
        }
        if (var4 == 1005) {
            class124.field2952++;
            class68.method550((byte) -9, var2, var5, var3);
            class152.field3751.method929(89, -14044);
            class152.field3751.method470((byte) -72, var5 >> 14 & 0x7FFF);
            class152.field3751.method470((byte) -79, class126.field3010 + var2);
            class152.field3751.method470((byte) 113, class76.field1795 + var3);
        }
        if (var4 == 1002) {
            class146 var27 = class48.method360(-110, var3);
            if (var27 == null || var27.field3657[var2] < 100000) {
                class55.field1295++;
                class152.field3751.method929(210, -14044);
                class152.field3751.method448(var5, true);
            } else {
                class82.method635(0, class113.field2742, (byte) 94, class107.method867(2, new class135[] { class68.method547(-1, var27.field3657[var2]), class109.field2637, class41.method306(-104, var5).field2284 }));
            }
            class107.field2568 = 2;
            class83.field1977 = 0;
            if (var3 >> 16 == class106.field2552) {
                class107.field2568 = 1;
            }
            class44.field1079 = var2;
            if (var3 >> 16 == class49.field1174) {
                class107.field2568 = 3;
            }
            class100.field2415 = var3;
        }
        if (var4 == 24) {
            class68.method550((byte) -9, var2, var5, var3);
            field793++;
            class152.field3751.method929(115, -14044);
            class152.field3751.method470((byte) -93, class76.field1795 + var3);
            class152.field3751.method477(1407478024, class126.field3010 + var2);
            class152.field3751.method470((byte) 104, var5 >> 14 & 0x7FFF);
        }
        if (var4 == 29) {
            class26.method213(125);
            class135.field3239 = true;
            class94.field2232 = var3;
            class47.field1125 = 1;
            class52.field1236 = var5;
            class55.field1286 = var2;
            class141.field3433 = class107.method867(2, new class135[] { class65.field1630, class41.method306(-124, var5).field2284, class49.field1160 });
            if (class141.field3433 == null) {
                class141.field3433 = class90.field2113;
            }
            return;
        }
        if (var4 == 57) {
            class152.field3751.method929(6, -14044);
            class75.field1759++;
            class152.field3751.method463(78, var3);
            class152.field3751.method448(var2, true);
            class152.field3751.method477(1407478024, var5);
            class44.field1079 = var2;
            class83.field1977 = 0;
            class100.field2415 = var3;
            class107.field2568 = 2;
            if (var3 >> 16 == class106.field2552) {
                class107.field2568 = 1;
            }
            if (var3 >> 16 == class49.field1174) {
                class107.field2568 = 3;
            }
        }
        if (var4 == 6) {
            class28.field668++;
            boolean var28 = class56.method432(2, 0, false, 0, var3, 0, var2, 0, 0, class116.field2789.field162[0], true, class116.field2789.field192[0]);
            if (!var28) {
                class56.method432(2, 1, false, 0, var3, 0, var2, 0, 1, class116.field2789.field162[0], true, class116.field2789.field192[0]);
            }
            class44.field1069 = 0;
            class148.field3692 = 2;
            class90.field2116 = class139.field3389;
            class145.field3517 = class20.field470;
            class152.field3751.method929(94, -14044);
            class152.field3751.method490((byte) -94, class94.field2232);
            class152.field3751.method477(1407478024, class55.field1286);
            class152.field3751.method451(var5, (byte) 28);
            class152.field3751.method477(1407478024, var3 + class76.field1795);
            class152.field3751.method477(1407478024, class126.field3010 + var2);
            class152.field3751.method477(1407478024, class52.field1236);
        }
        if (var4 == 17) {
            class75.field1767++;
            class152.field3751.method929(196, -14044);
            class152.field3751.method474(-80, var3);
            class152.field3751.method477(1407478024, var2);
            class152.field3751.method451(var5, (byte) 28);
            class44.field1079 = var2;
            class100.field2415 = var3;
            class107.field2568 = 2;
            class83.field1977 = 0;
            if (var3 >> 16 == class106.field2552) {
                class107.field2568 = 1;
            }
            if (var3 >> 16 == class49.field1174) {
                class107.field2568 = 3;
            }
        }
        if (var4 == 43) {
            class111 var30 = class96.field2340[var5];
            if (var30 != null) {
                class56.method432(2, 1, false, 0, var30.field162[0], 0, var30.field192[0], 0, 1, class116.field2789.field162[0], true, class116.field2789.field192[0]);
                class143.field3494++;
                class90.field2116 = class139.field3389;
                class148.field3692 = 2;
                class44.field1069 = 0;
                class145.field3517 = class20.field470;
                class152.field3751.method929(123, -14044);
                class152.field3751.method474(-65, class47.field1117);
                class152.field3751.method470((byte) 76, class53.field1274);
                class152.field3751.method448(var5, true);
            }
        }
        if (var4 == 12) {
            class111 var31 = class96.field2340[var5];
            if (var31 != null) {
                class95.field2318++;
                class56.method432(2, 1, false, 0, var31.field162[0], 0, var31.field192[0], 0, 1, class116.field2789.field162[0], true, class116.field2789.field192[0]);
                class145.field3517 = class20.field470;
                class44.field1069 = 0;
                class90.field2116 = class139.field3389;
                class148.field3692 = 2;
                class152.field3751.method929(4, -14044);
                class152.field3751.method451(var5, (byte) 28);
            }
        }
        if (var4 == 58) {
            class96.method790((byte) -114);
        }
        if (var4 == 13 || var4 == 56 || var4 == 25 || var4 == 41) {
            class135 var32 = class108.field2599[arg1];
            int var33 = var32.method1090((byte) 64, class49.field1160);
            if (var33 != -1) {
                long var34 = var32.method1065((byte) -66, var33 + 5).method1086((byte) 78).method1064(-22243);
                if (var4 == 13) {
                    method269(2, var34);
                }
                if (var4 == 56) {
                    class49.method367(var34, (byte) 98);
                }
                if (var4 == 25) {
                    class86.method672(-64, var34);
                }
                if (var4 == 41) {
                    class82.method641(var34, 114);
                }
            }
        }
        if (var4 == 28) {
            class68.method550((byte) -9, var2, var5, var3);
            class152.field3751.method929(138, -14044);
            class104.field2510++;
            class152.field3751.method470((byte) 106, var5 >> 14 & 0x7FFF);
            class152.field3751.method470((byte) 53, class126.field3010 + var2);
            class152.field3751.method470((byte) 70, class76.field1795 + var3);
        }
        if (var4 == 49) {
            class146 var36 = class48.method360(-86, var3);
            boolean var37 = true;
            if (var36.field3601 > 0) {
                var37 = class57.method436(7423, var36);
            }
            if (var37) {
                class19.field433++;
                class152.field3751.method929(139, -14044);
                class152.field3751.method463(102, var3);
            }
        }
        if (var4 == 23) {
            class145 var38 = class131.field3166[var5];
            if (var38 != null) {
                class56.method432(2, 1, false, 0, var38.field162[0], 0, var38.field192[0], 0, 1, class116.field2789.field162[0], true, class116.field2789.field192[0]);
                class90.field2116 = class139.field3389;
                class145.field3517 = class20.field470;
                class148.field3692 = 2;
                class130.field3116++;
                class44.field1069 = 0;
                class152.field3751.method929(97, -14044);
                class152.field3751.method451(var5, (byte) 28);
            }
        }
        if (var4 == 46 && class104.field2507 == -1) {
            class69.method554(var3, var2, (byte) 105);
            class104.field2507 = var3;
            class46.field1107 = var2;
        }
        if (var4 == 26) {
            class53.method405(var5, true, var2, var3);
        }
        if (var4 == 52) {
            class95.field2297++;
            class152.field3751.method929(218, -14044);
            class152.field3751.method470((byte) 64, var5);
            class152.field3751.method477(1407478024, class55.field1286);
            class152.field3751.method474(-82, var3);
            class152.field3751.method474(-128, class94.field2232);
            class152.field3751.method470((byte) -107, class52.field1236);
            class152.field3751.method470((byte) -98, var2);
            class83.field1977 = 0;
            class107.field2568 = 2;
            if (var3 >> 16 == class106.field2552) {
                class107.field2568 = 1;
            }
            if (var3 >> 16 == class49.field1174) {
                class107.field2568 = 3;
            }
            class44.field1079 = var2;
            class100.field2415 = var3;
        }
        if (var4 == 7) {
            class111 var39 = class96.field2340[var5];
            if (var39 != null) {
                class145.field3531++;
                class56.method432(2, 1, false, 0, var39.field162[0], 0, var39.field192[0], 0, 1, class116.field2789.field162[0], true, class116.field2789.field192[0]);
                class145.field3517 = class20.field470;
                class44.field1069 = 0;
                class148.field3692 = 2;
                class90.field2116 = class139.field3389;
                class152.field3751.method929(197, -14044);
                class152.field3751.method470((byte) 111, var5);
            }
        }
        if (var4 == 33 && class68.method550((byte) -9, var2, var5, var3)) {
            class8.field147++;
            class152.field3751.method929(36, -14044);
            class152.field3751.method458(127, class47.field1117);
            class152.field3751.method448(var5 >> 14 & 0x7FFF, true);
            class152.field3751.method477(1407478024, class126.field3010 + var2);
            class152.field3751.method477(1407478024, class53.field1274);
            class152.field3751.method477(1407478024, var3 + class76.field1795);
        }
        if (var4 == 22) {
            class146 var40 = class28.method227(var2, (byte) -85, var3);
            if (var40 != null) {
                class26.method213(127);
                class106.method860(0, var2, var3, class105.method853(class23.method196(var40, (byte) -125), (byte) -105));
                class135.field3239 = true;
                class47.field1125 = 0;
                class30.field741 = class40.method301(var40, -5338);
                if (class30.field741 == null) {
                    class30.field741 = class68.field1686;
                }
                if (var40.field3628) {
                    class4.field102 = class107.method867(2, new class135[] { var40.field3565, class49.field1160 });
                } else {
                    class4.field102 = class107.method867(2, new class135[] { class85.field2017, var40.field3572, class49.field1160 });
                }
                if (class79.field1887 == 16 && !var40.field3628) {
                    class10.field244 = true;
                    class49.field1167 = 3;
                    class135.field3239 = true;
                }
            }
            return;
        }
        if (var4 == 35) {
            if (class128.field3077) {
                class100.field2418.method1009(class136.field3301, var2 - 4, var3 + -4);
            } else {
                class100.field2418.method1009(class136.field3301, class139.field3389 - 4, class20.field470 + -4);
            }
        }
        if (var4 == 34) {
            class23.field561++;
            class152.field3751.method929(84, -14044);
            class152.field3751.method451(var5, (byte) 28);
            class152.field3751.method490((byte) -94, var3);
            class152.field3751.method477(1407478024, var2);
            class107.field2568 = 2;
            class44.field1079 = var2;
            if (var3 >> 16 == class106.field2552) {
                class107.field2568 = 1;
            }
            class100.field2415 = var3;
            class83.field1977 = 0;
            if (var3 >> 16 == class49.field1174) {
                class107.field2568 = 3;
            }
        }
        if (var4 == 19) {
            class152.field3751.method929(148, -14044);
            class108.field2587++;
            class152.field3751.method448(var5, true);
            class152.field3751.method474(-98, var3);
            class152.field3751.method477(1407478024, var2);
            class100.field2415 = var3;
            class83.field1977 = 0;
            class107.field2568 = 2;
            class44.field1079 = var2;
            if (var3 >> 16 == class106.field2552) {
                class107.field2568 = 1;
            }
            if (var3 >> 16 == class49.field1174) {
                class107.field2568 = 3;
            }
        }
        if (var4 == 45) {
            class135 var41 = class108.field2599[arg1];
            int var42 = var41.method1090((byte) 64, class49.field1160);
            if (var42 != -1) {
                if (class106.field2552 == -1) {
                    class96.method790((byte) -114);
                    if (class106.field2549 != -1) {
                        class113.field2718 = var41.method1065((byte) -45, var42 + 5).method1086((byte) 57);
                        class9.field205 = class106.field2552 = class106.field2549;
                        class124.field2966 = false;
                    }
                } else {
                    class82.method635(0, class113.field2742, (byte) 109, class98.field2368);
                    if (class55.field1320 != null) {
                        class82.method635(0, class113.field2742, (byte) 125, class55.field1320);
                    }
                }
            }
        }
        if (var4 == 48) {
            class59.field1454++;
            boolean var43 = class56.method432(2, 0, false, 0, var3, 0, var2, 0, 0, class116.field2789.field162[0], true, class116.field2789.field192[0]);
            if (!var43) {
                class56.method432(2, 1, false, 0, var3, 0, var2, 0, 1, class116.field2789.field162[0], true, class116.field2789.field192[0]);
            }
            class90.field2116 = class139.field3389;
            class145.field3517 = class20.field470;
            class44.field1069 = 0;
            class148.field3692 = 2;
            class152.field3751.method929(90, -14044);
            class152.field3751.method463(47, class47.field1117);
            class152.field3751.method477(1407478024, class53.field1274);
            class152.field3751.method470((byte) 63, var5);
            class152.field3751.method448(class126.field3010 + var2, true);
            class152.field3751.method470((byte) 92, var3 + class76.field1795);
        }
        if (var4 == 44) {
            class19.field433++;
            class152.field3751.method929(139, -14044);
            class152.field3751.method463(26, var3);
            class146 var45 = class48.method360(-72, var3);
            if (var45.field3556 != null && var45.field3556[0][0] == 5) {
                int var46 = var45.field3556[0][1];
                class104.field2513[var46] = 1 - class104.field2513[var46];
                class48.method366(var46, -126);
                class135.field3239 = true;
            }
        }
        if (var4 == 32) {
            class145 var47 = class131.field3166[var5];
            if (var47 != null) {
                class107.field2572++;
                class56.method432(2, 1, false, 0, var47.field162[0], 0, var47.field192[0], 0, 1, class116.field2789.field162[0], true, class116.field2789.field192[0]);
                class145.field3517 = class20.field470;
                class90.field2116 = class139.field3389;
                class148.field3692 = 2;
                class44.field1069 = 0;
                class152.field3751.method929(45, -14044);
                class152.field3751.method470((byte) -121, class52.field1236);
                class152.field3751.method448(class55.field1286, true);
                class152.field3751.method474(-108, class94.field2232);
                class152.field3751.method451(var5, (byte) 28);
            }
        }
        if (var4 == 39) {
            class111 var48 = class96.field2340[var5];
            if (var48 != null) {
                class119.field2885++;
                class56.method432(2, 1, false, 0, var48.field162[0], 0, var48.field192[0], 0, 1, class116.field2789.field162[0], true, class116.field2789.field192[0]);
                class44.field1069 = 0;
                class148.field3692 = 2;
                class145.field3517 = class20.field470;
                class90.field2116 = class139.field3389;
                class152.field3751.method929(81, -14044);
                class152.field3751.method448(var5, true);
            }
        }
        if (var4 == 1006) {
            class148.field3692 = 2;
            class145.field3517 = class20.field470;
            class44.field1069 = 0;
            class90.field2116 = class139.field3389;
            class111 var49 = class96.field2340[var5];
            if (var49 != null) {
                class55 var50 = var49.field2697;
                if (var50.field1302 != null) {
                    var50 = var50.method418(0);
                }
                if (var50 != null) {
                    class152.field3751.method929(254, -14044);
                    class145.field3524++;
                    class152.field3751.method451(var50.field1296, (byte) 28);
                }
            }
        }
        if (var4 == 55) {
            class148.method1213(class99.field2384, (byte) -81);
            class99.field2384 = -1;
            class65.field1634 = true;
        }
        if (var4 == 4) {
            class111 var51 = class96.field2340[var5];
            if (var51 != null) {
                class56.method432(2, 1, false, 0, var51.field162[0], 0, var51.field192[0], 0, 1, class116.field2789.field162[0], true, class116.field2789.field192[0]);
                class90.field2116 = class139.field3389;
                class107.field2565++;
                class148.field3692 = 2;
                class44.field1069 = 0;
                class145.field3517 = class20.field470;
                class152.field3751.method929(143, -14044);
                class152.field3751.method451(var5, (byte) 28);
            }
        }
        if (arg0 < 101) {
            method267(null, -114, null);
        }
        if (var4 == 11) {
            boolean var52 = class56.method432(2, 0, false, 0, var3, 0, var2, 0, 0, class116.field2789.field162[0], true, class116.field2789.field192[0]);
            if (!var52) {
                class56.method432(2, 1, false, 0, var3, 0, var2, 0, 1, class116.field2789.field162[0], true, class116.field2789.field192[0]);
            }
            class145.field3517 = class20.field470;
            class44.field1069 = 0;
            class148.field3692 = 2;
            class10.field258++;
            class90.field2116 = class139.field3389;
            class152.field3751.method929(200, -14044);
            class152.field3751.method451(class126.field3010 + var2, (byte) 28);
            class152.field3751.method470((byte) -75, var5);
            class152.field3751.method470((byte) -79, class76.field1795 + var3);
        }
        if (var4 == 20) {
            class145 var54 = class131.field3166[var5];
            if (var54 != null) {
                class63.field1562++;
                class56.method432(2, 1, false, 0, var54.field162[0], 0, var54.field192[0], 0, 1, class116.field2789.field162[0], true, class116.field2789.field192[0]);
                class90.field2116 = class139.field3389;
                class148.field3692 = 2;
                class44.field1069 = 0;
                class145.field3517 = class20.field470;
                class152.field3751.method929(103, -14044);
                class152.field3751.method451(var5, (byte) 28);
            }
        }
        if (var4 == 47) {
            class152.field3751.method929(95, -14044);
            class102.field2479++;
            class152.field3751.method448(var2, true);
            class152.field3751.method474(-44, var3);
            class152.field3751.method451(var5, (byte) 28);
            class44.field1079 = var2;
            class100.field2415 = var3;
            class107.field2568 = 2;
            class83.field1977 = 0;
            if (var3 >> 16 == class106.field2552) {
                class107.field2568 = 1;
            }
            if (var3 >> 16 == class49.field1174) {
                class107.field2568 = 3;
            }
        }
        if (var4 == 3) {
            class135 var55 = class108.field2599[arg1];
            int var56 = var55.method1090((byte) 64, class49.field1160);
            if (var56 != -1) {
                long var57 = var55.method1065((byte) -114, var56 + 5).method1086((byte) -118).method1064(-22243);
                int var59 = -1;
                for (int var60 = 0; var60 < class79.field1885; var60++) {
                    if (class8.field148[var60] == var57) {
                        var59 = var60;
                        break;
                    }
                }
                if (var59 != -1 && class94.field2281[var59] > 0) {
                    class42.field975 = 0;
                    class65.field1634 = true;
                    class141.field3434 = 3;
                    field789 = true;
                    class113.field2735 = class113.field2742;
                    class38.field858 = class8.field148[var59];
                    class113.field2724 = class107.method867(2, new class135[] { class47.field1120, class23.field563[var59] });
                }
            }
        }
        if (var4 == 37) {
            class98.field2376++;
            boolean var61 = class56.method432(2, 0, false, 0, var3, 0, var2, 0, 0, class116.field2789.field162[0], true, class116.field2789.field192[0]);
            if (!var61) {
                class56.method432(2, 1, false, 0, var3, 0, var2, 0, 1, class116.field2789.field162[0], true, class116.field2789.field192[0]);
            }
            class44.field1069 = 0;
            class148.field3692 = 2;
            class145.field3517 = class20.field470;
            class90.field2116 = class139.field3389;
            class152.field3751.method929(213, -14044);
            class152.field3751.method448(var5, true);
            class152.field3751.method477(1407478024, class126.field3010 + var2);
            class152.field3751.method451(class76.field1795 + var3, (byte) 28);
        }
        if (var4 == 1001) {
            class44.field1069 = 0;
            class145.field3517 = class20.field470;
            class148.field3692 = 2;
            class21.field496++;
            class90.field2116 = class139.field3389;
            class152.field3751.method929(161, -14044);
            class152.field3751.method470((byte) 85, var5 >> 14 & 0x7FFF);
        }
        if (var4 == 10 && class68.method550((byte) -9, var2, var5, var3)) {
            class152.field3751.method929(209, -14044);
            class125.field2989++;
            class152.field3751.method448(class126.field3010 + var2, true);
            class152.field3751.method477(1407478024, class52.field1236);
            class152.field3751.method458(127, class94.field2232);
            class152.field3751.method451(class55.field1286, (byte) 28);
            class152.field3751.method448(class76.field1795 + var3, true);
            class152.field3751.method470((byte) 76, var5 >> 14 & 0x7FFF);
        }
        if (var4 == 1003) {
            class148.field3692 = 2;
            class90.field2116 = class139.field3389;
            class55.field1295++;
            class44.field1069 = 0;
            class145.field3517 = class20.field470;
            class152.field3751.method929(210, -14044);
            class152.field3751.method448(var5, true);
        }
        if (var4 == 31) {
            class152.field3751.method929(219, -14044);
            class152.field3751.method477(1407478024, var5);
            class152.field3751.method470((byte) -94, var2);
            class152.field3751.method474(-91, var3);
            class148.field3698++;
            class44.field1079 = var2;
            class100.field2415 = var3;
            class83.field1977 = 0;
            class107.field2568 = 2;
            if (var3 >> 16 == class106.field2552) {
                class107.field2568 = 1;
            }
            if (var3 >> 16 == class49.field1174) {
                class107.field2568 = 3;
            }
        }
        if (class47.field1125 != 0) {
            class135.field3239 = true;
            class47.field1125 = 0;
        }
        if (class8.field143) {
            class26.method213(-46);
            class135.field3239 = true;
        }
    }
}
