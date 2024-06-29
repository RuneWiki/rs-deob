import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class2 implements Runnable {

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "Z")
    public boolean field25 = true;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "Ljava/lang/Object;")
    public Object field24 = new Object();

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "[I")
    public int[] field26 = new int[500];

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public int field28 = 0;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "[I")
    public int[] field27 = new int[500];

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "[Lmf;")
    public static class26[] field29 = new class26[32768];

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "Lwf;")
    public static class16 field19 = new class16(100);

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "[Lha;")
    public static class46[] field31 = new class46[1000];

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
    public static int field30 = 0;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "[Lha;")
    public static class46[] field32 = new class46[100];

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "[[[I")
    public static int[][][] field33;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)V")
    public static final void method3(int arg0, int arg1) {
        class242.field4290--;
        field23++;
        if (class242.field4290 == arg0 || arg1 != 2638) {
            return;
        }
        class104.method788(class275.field4795, arg0 + 1, class275.field4795, arg0, class242.field4290 - arg0);
        class104.method788(class162.field2855, arg0 + 1, class162.field2855, arg0, class242.field4290 - arg0);
        class104.method786(class215.field3807, arg0 + 1, class215.field3807, arg0, class242.field4290 - arg0);
        class104.method785(class31.field590, arg0 + 1, class31.field590, arg0, class242.field4290 - arg0);
        class104.method784(class270.field4706, arg0 + 1, class270.field4706, arg0, class242.field4290 - arg0);
        class104.method784(class4.field69, arg0 + 1, class4.field69, arg0, class242.field4290 - arg0);
    }

    @OriginalMember(owner = "client!qk", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field25) {
            Object var1 = this.field24;
            synchronized (this.field24) {
                if (this.field28 < 500) {
                    this.field26[this.field28] = class7.field116;
                    this.field27[this.field28] = class208.field3735;
                    this.field28++;
                }
            }
            class187.method1360((byte) -104, 50L);
        }
        field21++;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)Z")
    public static final boolean method4(int arg0) throws IOException {
        field18++;
        if (class71.field1214 == null) {
            return false;
        }
        int var1 = class71.field1214.method850((byte) 121);
        if (var1 == 0) {
            return false;
        }
        if (class109.field2039 == arg0) {
            class71.field1214.method854(class147.field2651.field1368, 1, 0, 0);
            var1--;
            class147.field2651.field1380 = 0;
            class109.field2039 = class147.field2651.method286((byte) 19);
            class219.field3861 = class144.field2621[class109.field2039];
        }
        if (class219.field3861 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class71.field1214.method854(class147.field2651.field1368, 1, 0, 0);
            class219.field3861 = class147.field2651.field1368[0] & 0xFF;
        }
        if (class219.field3861 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class71.field1214.method854(class147.field2651.field1368, 2, 0, arg0 + 1);
            class147.field2651.field1380 = 0;
            class219.field3861 = class147.field2651.method545((byte) -63);
        }
        if (var1 < class219.field3861) {
            return false;
        }
        class147.field2651.field1380 = 0;
        class71.field1214.method854(class147.field2651.field1368, class219.field3861, 0, 0);
        class215.field3813 = 0;
        class212.field3776 = class206.field3692;
        class206.field3692 = class93.field1753;
        class93.field1753 = class109.field2039;
        if (class109.field2039 == 179) {
            int var2 = class147.field2651.method545((byte) 86);
            int var3 = class147.field2651.method572((byte) -113);
            int var4 = class147.field2651.method572((byte) -5);
            int var5 = class147.field2651.method562((byte) -71);
            if (class81.method648(var2, -126)) {
                class199.method1418(var3, (byte) 101, var5, var4);
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 59) {
            class71.method519(arg0 + 128);
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 163) {
            if (class219.field3861 == 0) {
                class268.field4634 = class60.field1003;
            } else {
                class268.field4634 = class147.field2651.method577(0);
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 160) {
            class208.field3727 = class147.field2651.method558(1);
            class109.field2039 = -1;
            class14.field219 = class86.field1635;
            return true;
        } else if (class109.field2039 == 13 || class109.field2039 == 86 || class109.field2039 == 0 || class109.field2039 == 97 || class109.field2039 == 57 || class109.field2039 == 7 || class109.field2039 == 245 || class109.field2039 == 107 || class109.field2039 == 204 || class109.field2039 == 183 || class109.field2039 == 166 || class109.field2039 == 122) {
            class23.method163(79);
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 190) {
            class82.field1577 = class147.field2651.method595(-16950);
            class238.field4226 = class147.field2651.method554((byte) 88);
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 111) {
            int var6 = class147.field2651.method551((byte) 94);
            int var7 = class147.field2651.method580(-80);
            if (class81.method648(var7, -126)) {
                int var8 = 0;
                if (class277.field4824.field1527 != null) {
                    var8 = class277.field4824.field1527.method609(arg0 ^ 0x3F);
                }
                class160.method1172(var6, 3, var8, (byte) 64);
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 220) {
            int var9 = class147.field2651.method562((byte) -71);
            int var10 = class147.field2651.method567((byte) 127);
            class34.method220(var10, (byte) 94, var9);
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 159) {
            int var11 = class147.field2651.method545((byte) 62);
            int var12 = class147.field2651.method558(1);
            int var13 = class147.field2651.method545((byte) 116);
            if (var11 == 65535) {
                var11 = -1;
            }
            class207.method1463(var11, 0, var12, var13);
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 113) {
            long var14 = class147.field2651.method550(true);
            class147.field2651.method569((byte) -110);
            long var16 = class147.field2651.method550(true);
            long var18 = (long) class147.field2651.method545((byte) 91);
            long var20 = (long) class147.field2651.method559(arg0);
            int var22 = class147.field2651.method558(1);
            long var23 = (var18 << 32) + var20;
            boolean var25 = false;
            int var26 = class147.field2651.method545((byte) 112);
            int var27 = 0;
            label1071: while (true) {
                if (var27 >= 100) {
                    if (var22 <= 1) {
                        for (int var28 = 0; var28 < class42.field714; var28++) {
                            if (class29.field562[var28] == var14) {
                                var25 = true;
                                break label1071;
                            }
                        }
                    }
                    break;
                }
                if (class166.field2937[var27] == var23) {
                    var25 = true;
                    break;
                }
                var27++;
            }
            if (!var25 && class180.field3211 == 0) {
                class166.field2937[class73.field1304] = var23;
                class73.field1304 = (class73.field1304 + 1) % 100;
                class46 var29 = class209.method1477(2, var26).method1357(true, class147.field2651);
                if (var22 == 2 || var22 == 3) {
                    class92.method720((byte) 79, class109.method855(0, new class46[] { class161.field2838, class277.method1862((byte) -64, var14).method306(true) }), class277.method1862((byte) -64, var16).method306(true), 20, var26, var29);
                } else if (var22 == 1) {
                    class92.method720((byte) 79, class109.method855(0, new class46[] { class126.field2317, class277.method1862((byte) -64, var14).method306(true) }), class277.method1862((byte) -64, var16).method306(true), 20, var26, var29);
                } else {
                    class92.method720((byte) 79, class277.method1862((byte) -64, var14).method306(true), class277.method1862((byte) -64, var16).method306(true), 20, var26, var29);
                }
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 240) {
            int var30 = class147.field2651.method579(-94);
            class129.method1004((byte) -92, var30);
            class69.field1192[class50.method369(31, class214.field3798++)] = class50.method369(var30, 32767);
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 110) {
            int var31 = class147.field2651.method567((byte) 127);
            int var32 = class147.field2651.method562((byte) -71);
            int var33 = class147.field2651.method580(-70);
            if (var33 == 65535) {
                var33 = -1;
            }
            if (class81.method648(var31, -127)) {
                class160.method1172(var32, 1, var33, (byte) 63);
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 100) {
            long var34 = class147.field2651.method550(true);
            long var36 = (long) class147.field2651.method545((byte) 110);
            long var38 = (long) class147.field2651.method559(-1);
            long var40 = (var36 << 32) + var38;
            int var42 = class147.field2651.method558(1);
            int var43 = class147.field2651.method545((byte) 61);
            boolean var44 = false;
            int var45 = 0;
            label1089: while (true) {
                if (var45 >= 100) {
                    if (var42 <= 1) {
                        for (int var46 = 0; var46 < class42.field714; var46++) {
                            if (class29.field562[var46] == var34) {
                                var44 = true;
                                break label1089;
                            }
                        }
                    }
                    break;
                }
                if (class166.field2937[var45] == var40) {
                    var44 = true;
                    break;
                }
                var45++;
            }
            if (!var44 && class180.field3211 == 0) {
                class166.field2937[class73.field1304] = var40;
                class73.field1304 = (class73.field1304 + 1) % 100;
                class46 var47 = class209.method1477(2, var43).method1357(true, class147.field2651);
                if (var42 == 2) {
                    class92.method720((byte) 79, class109.method855(0, new class46[] { class161.field2838, class277.method1862((byte) -64, var34).method306(true) }), (class46) null, 18, var43, var47);
                } else if (var42 == 1) {
                    class92.method720((byte) 79, class109.method855(0, new class46[] { class126.field2317, class277.method1862((byte) -64, var34).method306(true) }), (class46) null, 18, var43, var47);
                } else {
                    class92.method720((byte) 79, class277.method1862((byte) -64, var34).method306(true), (class46) null, 18, var43, var47);
                }
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 221) {
            class151.method1112(class147.field2651.method577(0), (byte) 112);
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 18) {
            if (class114.field2157 != -1) {
                class32.method211(0, class114.field2157, arg0 ^ 0xFFFF8694);
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 70) {
            int var48 = class147.field2651.method567((byte) 127);
            int var49 = class147.field2651.method551((byte) 86);
            int var50 = class147.field2651.method580(arg0 ^ 0x54);
            if (class81.method648(var48, -126)) {
                class119.method953(arg0 ^ 0xFFFFD417, var50, var49);
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 21) {
            int var51 = class147.field2651.method595(arg0 ^ 0x4235);
            class46 var52 = class147.field2651.method577(0);
            int var53 = class147.field2651.method566(arg0 + 256);
            if (var53 >= 1 && var53 <= 8) {
                if (var52.method315((byte) -38, class194.field3478)) {
                    var52 = null;
                }
                class111.field2092[var53 - 1] = var52;
                class86.field1637[var53 - 1] = var51 == 0;
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 74) {
            int var54 = class147.field2651.method558(1);
            int var55 = class147.field2651.method558(arg0 + 2);
            int var56 = class147.field2651.method558(1);
            int var57 = class147.field2651.method558(1);
            int var58 = class147.field2651.method545((byte) -59);
            class201.field3584[var54] = true;
            class227.field3975[var54] = var55;
            class258.field4498[var54] = var56;
            class227.field3990[var54] = var57;
            class220.field3879[var54] = var58;
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 164) {
            int var59 = class147.field2651.method579(-86);
            if (var59 == 65535) {
                var59 = -1;
            }
            int var60 = class147.field2651.method595(-16950);
            int var61 = var60 >> 2;
            int var62 = class247.field4372[var61];
            int var63 = class147.field2651.method562((byte) -71);
            int var64 = var60 & 0x3;
            int var65 = (var63 & 0x332E7214) >> 28;
            int var66 = var63 >> 14 & 0x3FFF;
            int var67 = var66 - class29.field567;
            int var68 = var63 & 0x3FFF;
            int var69 = var68 - class77.field1432;
            class169.method1199(var64, var59, var61, var69, -7748, var65, var67, var62);
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 249) {
            class269.field4658 = class147.field2651.method558(1);
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 206) {
            int var70 = class147.field2651.method579(arg0 ^ 0x60);
            int var71 = class147.field2651.method562((byte) -71);
            int var72 = class147.field2651.method566(255);
            if (class81.method648(var70, arg0 ^ 0x7F)) {
                class240.method1652(arg0 ^ 0xF8, var72, var71);
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 172) {
            int var73 = class147.field2651.method558(arg0 ^ 0xFFFFFFFE);
            if (class147.field2651.method558(arg0 ^ 0xFFFFFFFE) == 0) {
                class255.field4465[var73] = new class63();
            } else {
                class147.field2651.field1380--;
                class255.field4465[var73] = new class63(class147.field2651);
            }
            class109.field2039 = -1;
            class63.field1070 = class86.field1635;
            return true;
        } else if (class109.field2039 == 17) {
            int var74 = class147.field2651.method545((byte) 105);
            int var75 = class147.field2651.method567((byte) 127);
            int var76 = class147.field2651.method595(arg0 ^ 0x4235);
            if (class81.method648(var74, -124)) {
                class197.method1407(var75, false, var76);
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 36) {
            int var77 = class147.field2651.method545((byte) -96);
            if (var77 == 65535) {
                var77 = -1;
            }
            class149.method1099(var77, true);
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 201) {
            int var78 = class147.field2651.method580(-40);
            int var79 = class147.field2651.method559(-1);
            if (var78 == 65535) {
                var78 = -1;
            }
            class17.method91(6207, var78, var79);
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 114) {
            class243.method1667(class147.field2651, (byte) -87);
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 33) {
            long var80 = class147.field2651.method550(true);
            boolean var82 = false;
            if ((var80 & Long.MIN_VALUE) != 0L) {
                var82 = true;
            }
            int var83 = class147.field2651.method545((byte) -64);
            byte var84 = class147.field2651.method569((byte) -110);
            if (var82) {
                if (class245.field4361 == 0) {
                    class109.field2039 = -1;
                    return true;
                }
                boolean var90 = false;
                long var91 = var80 & Long.MAX_VALUE;
                int var93;
                for (var93 = 0; class245.field4361 > var93 && (class107.field2000[var93].field1195 != var91 || class107.field2000[var93].field1810 != var83); var93++) {
                }
                if (var93 < class245.field4361) {
                    while (var93 < class245.field4361 - 1) {
                        class107.field2000[var93] = class107.field2000[var93 + 1];
                        var93++;
                    }
                    class245.field4361--;
                    class107.field2000[class245.field4361] = null;
                }
            } else {
                class46 var85 = class147.field2651.method577(0);
                class97 var86 = new class97();
                var86.field1195 = var80;
                var86.field1813 = class277.method1862((byte) -64, var86.field1195);
                var86.field1810 = var83;
                var86.field1812 = var84;
                var86.field1809 = var85;
                int var87;
                for (var87 = class245.field4361 - 1; var87 >= 0; var87--) {
                    int var88 = class107.field2000[var87].field1813.method333(var86.field1813, (byte) 124);
                    if (var88 == 0) {
                        class107.field2000[var87].field1810 = var83;
                        class107.field2000[var87].field1812 = var84;
                        class107.field2000[var87].field1809 = var85;
                        class109.field2039 = -1;
                        if (class208.field3738 == var80) {
                            class92.field1724 = var84;
                        }
                        class1.field14 = class86.field1635;
                        return true;
                    }
                    if (var88 < 0) {
                        break;
                    }
                }
                if (class107.field2000.length <= class245.field4361) {
                    class109.field2039 = -1;
                    return true;
                }
                for (int var89 = class245.field4361 - 1; var89 > var87; var89--) {
                    class107.field2000[var89 + 1] = class107.field2000[var89];
                }
                if (class245.field4361 == 0) {
                    class107.field2000 = new class97[100];
                }
                class107.field2000[var87 + 1] = var86;
                if (class208.field3738 == var80) {
                    class92.field1724 = var84;
                }
                class245.field4361++;
            }
            class1.field14 = class86.field1635;
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 62) {
            int var94 = class147.field2651.method566(arg0 + 256);
            int var95 = class147.field2651.method566(255);
            int var96 = class147.field2651.method566(255);
            class135.field2450 = var96 >> 1;
            class277.field4824.method643((var96 & 0x1) == 1, var94, 27512, var95);
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 82) {
            long var97 = class147.field2651.method550(true);
            int var99 = class147.field2651.method545((byte) 113);
            class46 var100 = class209.method1477(arg0 ^ 0xFFFFFFFD, var99).method1357(true, class147.field2651);
            class92.method720((byte) 79, class277.method1862((byte) -64, var97).method306(true), (class46) null, 19, var99, var100);
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 171) {
            class82.field1577 = class147.field2651.method554((byte) 88);
            class238.field4226 = class147.field2651.method566(255);
            for (int var101 = class82.field1577; var101 < class82.field1577 + 8; var101++) {
                for (int var103 = class238.field4226; var103 < (class238.field4226 + 8); var103++) {
                    if (class103.field1874[class135.field2450][var101][var103] != null) {
                        class103.field1874[class135.field2450][var101][var103] = null;
                        class189.method1373(-76, var103, var101);
                    }
                }
            }
            for (class65 var102 = (class65) class174.field3143.method264(arg0 - 88); var102 != null; var102 = (class65) class174.field3143.method269((byte) 7)) {
                if (class82.field1577 <= var102.field1094 && class82.field1577 + 8 > var102.field1094 && var102.field1096 >= class238.field4226 && var102.field1096 < (class238.field4226 + 8) && class135.field2450 == var102.field1109) {
                    var102.field1100 = 0;
                }
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 73) {
            class126.method980(arg0 - 15788);
            class105.field1885 = class147.field2651.method558(1);
            class273.field4768 = class86.field1635;
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 142) {
            int var104 = class147.field2651.method545((byte) -72);
            int var105 = class147.field2651.method566(arg0 ^ 0xFFFFFF00);
            int var106 = class147.field2651.method567((byte) 127);
            class26 var107 = field29[var104];
            if (var107 != null) {
                class38.method256(var107, var106, (byte) 36, var105);
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 20) {
            int var108 = class147.field2651.method558(1);
            class222 var109 = new class222();
            int var110 = var108 >> 6;
            var109.field3899 = var108 & 0x3F;
            var109.field3897 = class147.field2651.method558(1);
            if (var109.field3897 >= 0 && class168.field2956.length > var109.field3897) {
                if (var109.field3899 == 1 || var109.field3899 == 10) {
                    var109.field3904 = class147.field2651.method545((byte) -70);
                    class147.field2651.field1380 += 3;
                } else if (var109.field3899 >= 2 && var109.field3899 <= 6) {
                    if (var109.field3899 == 2) {
                        var109.field3905 = 64;
                        var109.field3900 = 64;
                    }
                    if (var109.field3899 == 3) {
                        var109.field3905 = 64;
                        var109.field3900 = 0;
                    }
                    if (var109.field3899 == 4) {
                        var109.field3900 = 128;
                        var109.field3905 = 64;
                    }
                    if (var109.field3899 == 5) {
                        var109.field3905 = 0;
                        var109.field3900 = 64;
                    }
                    if (var109.field3899 == 6) {
                        var109.field3905 = 128;
                        var109.field3900 = 64;
                    }
                    var109.field3899 = 2;
                    var109.field3913 = class147.field2651.method545((byte) -92);
                    var109.field3898 = class147.field2651.method545((byte) -127);
                    var109.field3906 = class147.field2651.method558(1);
                }
                var109.field3908 = class147.field2651.method545((byte) 106);
                if (var109.field3908 == 65535) {
                    var109.field3908 = -1;
                }
                class84.field1611[var110] = var109;
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 120) {
            int var111 = class147.field2651.method552((byte) -43);
            int var112 = class147.field2651.method545((byte) 57);
            int var113 = class147.field2651.method567((byte) 127);
            if (class81.method648(var112, -126)) {
                class177.method1269(var113, var111, (byte) 89);
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 136) {
            class109.field2039 = -1;
            class48.field832 = 0;
            return true;
        } else if (class109.field2039 == 156) {
            int var114 = class147.field2651.method545((byte) -86);
            int var115 = class147.field2651.method566(255);
            int var116 = class147.field2651.method562((byte) -71);
            int var117 = class147.field2651.method580(-56);
            if (class81.method648(var117, -126)) {
                class31 var118 = (class31) class93.field1727.method1601(arg0 + 84, (long) var116);
                if (var118 != null) {
                    class175.method1262(var118.field582 != var114, var118, 24);
                }
                class272.method1834((byte) -112, var115, var116, var114);
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 150) {
            int var119 = class147.field2651.method567((byte) 127);
            int var120 = class147.field2651.method595(arg0 ^ 0x4235);
            class34.method220(var119, (byte) 94, var120);
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 176) {
            byte[] var121 = new byte[class219.field3861];
            class147.field2651.method293(arg0 ^ 0xFFFFFF9F, class219.field3861, var121, 0);
            class46 var122 = class177.method1265(0, class219.field3861, var121, arg0 + 79);
            if (class227.field3983 == null && class9.field160 == 3 || !class9.field150.startsWith("win") || class20.field266) {
                class105.method791((byte) -99, var122, true);
            } else {
                class236.field4127 = true;
                class120.field2247 = var122;
                class12.field193 = class8.field130.method42(-21016, new String(var122.method311(0), "ISO-8859-1"));
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 184) {
            class126.method980(arg0 - 15788);
            class65.field1099 = class147.field2651.method591(true);
            class109.field2039 = -1;
            class273.field4768 = class86.field1635;
            return true;
        } else if (class109.field2039 == 53) {
            int var123 = class147.field2651.method567((byte) 127);
            int var124 = class147.field2651.method567((byte) 127);
            int var125 = class147.field2651.method552((byte) -23);
            int var126 = class147.field2651.method579(arg0 ^ 0x62);
            if (class81.method648(var124, arg0 - 126)) {
                class160.method1172(var125, 7, var123 << 16 | var126, (byte) 77);
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 81) {
            int var127 = class147.field2651.method580(-53);
            int var128 = class147.field2651.method562((byte) -71);
            int var129 = class147.field2651.method567((byte) 127);
            int var130 = class147.field2651.method545((byte) 123);
            int var131 = class147.field2651.method580(arg0 - 6);
            if (class81.method648(var129, -128)) {
                class178.method1277(var128, var130, var127, 10, var131);
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 191) {
            class226.method1542(-16609);
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 54) {
            int var132 = class147.field2651.method562((byte) -71);
            int var133 = class147.field2651.method545((byte) 115);
            int var134 = class147.field2651.method580(-59);
            int var135 = class147.field2651.method579(arg0 - 72);
            if (var132 >> 30 != 0) {
                int var144 = (var132 >> 14 & 0x3FFF) - class29.field567;
                int var145 = (var132 & 0x3FFF) - class77.field1432;
                int var146 = (var132 & 0x3C04CDC7) >> 28;
                if (var144 >= 0 && var145 >= 0 && var144 < 104 && var145 < 104) {
                    int var147 = var145 * 128 + 64;
                    int var148 = var144 * 128 + 64;
                    class226 var149 = new class226(var133, var146, var148, var147, class206.method1461(var147, var146, var148, 4) - var134, var135, class157.field2803);
                    class40.field696.method265(new class28(var149), -501);
                }
            } else if ((var132 >> 29) != 0) {
                int var140 = var132 & 0xFFFF;
                class26 var141 = field29[var140];
                if (var141 != null) {
                    var141.field2532 = class157.field2803 + var135;
                    var141.field2543 = var133;
                    var141.field2581 = var134;
                    var141.field2551 = 0;
                    var141.field2544 = 0;
                    if (var141.field2532 > class157.field2803) {
                        var141.field2544 = -1;
                    }
                    if (var141.field2543 == 65535) {
                        var141.field2543 = -1;
                    }
                    if (var141.field2543 != -1 && class157.field2803 == var141.field2532) {
                        int var142 = class138.method1054(-22225, var141.field2543).field4745;
                        if (var142 != -1) {
                            class170 var143 = class119.method951(arg0 + 1, var142);
                            if (var143 != null && var143.field3020 != null) {
                                class146.method1084(var141.field2546, var143, 75, var141.field2585, false, 0);
                            }
                        }
                    }
                }
            } else if (var132 >> 28 != 0) {
                int var136 = var132 & 0xFFFF;
                class81 var137;
                if (class114.field2158 == var136) {
                    var137 = class277.field4824;
                } else {
                    var137 = class1.field6[var136];
                }
                if (var137 != null) {
                    var137.field2543 = var133;
                    var137.field2544 = 0;
                    var137.field2551 = 0;
                    if (var137.field2543 == 65535) {
                        var137.field2543 = -1;
                    }
                    var137.field2532 = class157.field2803 + var135;
                    var137.field2581 = var134;
                    if (var137.field2532 > class157.field2803) {
                        var137.field2544 = -1;
                    }
                    if (var137.field2543 != -1 && class157.field2803 == var137.field2532) {
                        int var138 = class138.method1054(-22225, var137.field2543).field4745;
                        if (var138 != -1) {
                            class170 var139 = class119.method951(0, var138);
                            if (var139 != null && var139.field3020 != null) {
                                class146.method1084(var137.field2546, var139, 102, var137.field2585, class277.field4824 == var137, 0);
                            }
                        }
                    }
                }
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 129) {
            int var150 = class147.field2651.method589((byte) 0);
            int var151 = class147.field2651.method580(arg0 ^ 0xB);
            if (var151 == 65535) {
                var151 = -1;
            }
            int var152 = class147.field2651.method580(-61);
            int var153 = class147.field2651.method551((byte) 77);
            if (class81.method648(var152, -127)) {
                class24 var154 = class13.method73(1506528624, var150);
                if (var154.field480) {
                    class6.method26(var150, var151, (byte) -105, var153);
                    class71 var155 = class80.method633(var151, 0);
                    class178.method1277(var150, var155.field1212, var155.field1272, arg0 ^ 0xFFFFFFF5, var155.field1234);
                    class98.method758(-13001, var155.field1225, var155.field1229, var155.field1278, var150);
                } else if (var151 == -1) {
                    class109.field2039 = -1;
                    var154.field359 = 0;
                    return true;
                } else {
                    class71 var156 = class80.method633(var151, 0);
                    var154.field373 = var156.field1234;
                    var154.field486 = var151;
                    var154.field345 = var156.field1272 * 100 / var153;
                    var154.field359 = 4;
                    var154.field473 = var156.field1212;
                    class226.method1549(false, var154);
                }
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 181) {
            for (int var157 = 0; var157 < class29.field568.length; var157++) {
                if (class29.field568[var157] != class234.field4064[var157]) {
                    class29.field568[var157] = class234.field4064[var157];
                    class52.method379(var157, 800);
                    class105.field1890[class50.method369(class87.field1647++, 31)] = var157;
                }
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 10) {
            int var158 = class147.field2651.method545((byte) -118);
            int var159 = class147.field2651.method552((byte) -17);
            int var160 = class147.field2651.method589((byte) 0);
            if (class81.method648(var158, -128)) {
                class31 var161 = (class31) class93.field1727.method1601(arg0 + 77, (long) var159);
                class31 var162 = (class31) class93.field1727.method1601(-118, (long) var160);
                if (var162 != null) {
                    class175.method1262(var161 == null || var161.field582 != var162.field582, var162, 24);
                }
                if (var161 != null) {
                    var161.method501(0);
                    class93.field1727.method1597((long) var160, (byte) -126, var161);
                }
                class24 var163 = class13.method73(1506528624, var159);
                if (var163 != null) {
                    class226.method1549(false, var163);
                }
                class24 var164 = class13.method73(1506528624, var160);
                if (var164 != null) {
                    class226.method1549(false, var164);
                    class113.method922(true, var164, arg0 ^ 0x33);
                }
                if (class114.field2157 != -1) {
                    class32.method211(1, class114.field2157, 31083);
                }
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 61) {
            byte var165 = class147.field2651.method569((byte) -110);
            int var166 = class147.field2651.method579(-67);
            class161.method1174(true, var166, var165);
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 123) {
            class60.method407(95);
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 203) {
            int var167 = class147.field2651.method551((byte) 58);
            class24 var168 = class13.method73(1506528624, var167);
            for (int var169 = 0; var169 < var168.field498.length; var169++) {
                var168.field498[var169] = -1;
                var168.field498[var169] = 0;
            }
            class226.method1549(false, var168);
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 226) {
            int var170 = class147.field2651.method545((byte) -79);
            class46 var171 = class147.field2651.method577(~arg0);
            Object[] var172 = new Object[var171.method314(11) + 1];
            for (int var173 = var171.method314(96) - 1; var173 >= 0; var173--) {
                if (var171.method318(var173, (byte) 68) == 115) {
                    var172[var173 + 1] = class147.field2651.method577(class51.method376(arg0, -1));
                } else {
                    var172[var173 + 1] = Integer.valueOf(class147.field2651.method562((byte) -71));
                }
            }
            var172[0] = Integer.valueOf(class147.field2651.method562((byte) -71));
            if (class81.method648(var170, arg0 ^ 0x7F)) {
                class275 var174 = new class275();
                var174.field4796 = var172;
                class215.method1509(var174, -49);
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 132) {
            class126.method980(-15789);
            int var175 = class147.field2651.method595(-16950);
            int var176 = class147.field2651.method552((byte) -32);
            int var177 = class147.field2651.method558(arg0 ^ 0xFFFFFFFE);
            class140.field2511[var177] = var176;
            class221.field3895[var177] = var175;
            class235.field4084[var177] = 1;
            for (int var178 = 0; var178 < 98; var178++) {
                if (var176 >= class254.field4455[var178]) {
                    class235.field4084[var177] = var178 + 2;
                }
            }
            class78.field1485[class50.method369(31, class197.field3518++)] = var177;
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 105) {
            int var179 = class147.field2651.method562((byte) -71);
            int var180 = class147.field2651.method580(-50);
            class46 var181 = class147.field2651.method577(arg0 + 1);
            if (class81.method648(var180, -128)) {
                class122.method960(var179, var181, arg0 + 99);
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 214) {
            class255.method1718(true, arg0 ^ 0x25);
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 125) {
            int var182 = class147.field2651.method552((byte) -21);
            int var183 = class147.field2651.method580(arg0 - 113);
            int var184 = class147.field2651.method580(-45);
            if (var183 == 65535) {
                var183 = -1;
            }
            int var185 = class147.field2651.method545((byte) 111);
            int var186 = class147.field2651.method552((byte) -18);
            if (var185 == 65535) {
                var185 = -1;
            }
            if (class81.method648(var184, -128)) {
                for (int var187 = var185; var187 <= var183; var187++) {
                    long var188 = ((long) var182 << 32) + (long) var187;
                    class69 var190 = class51.field893.method1601(-111, var188);
                    if (var190 != null) {
                        var190.method501(~arg0);
                    }
                    class51.field893.method1597(var188, (byte) -126, new class176(var186));
                }
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 229) {
            long var191 = class147.field2651.method550(true);
            class147.field2651.method569((byte) -110);
            long var193 = class147.field2651.method550(true);
            long var195 = (long) class147.field2651.method545((byte) 80);
            long var197 = (long) class147.field2651.method559(-1);
            int var199 = class147.field2651.method558(1);
            long var200 = (var195 << 32) + var197;
            boolean var202 = false;
            int var203 = 0;
            label1217: while (true) {
                if (var203 >= 100) {
                    if (var199 <= 1) {
                        if (class248.field4383 == 1 || class78.field1497 == 1) {
                            var202 = true;
                        } else {
                            for (int var204 = 0; var204 < class42.field714; var204++) {
                                if (class29.field562[var204] == var191) {
                                    var202 = true;
                                    break label1217;
                                }
                            }
                        }
                    }
                    break;
                }
                if (class166.field2937[var203] == var200) {
                    var202 = true;
                    break;
                }
                var203++;
            }
            if (!var202 && class180.field3211 == 0) {
                class166.field2937[class73.field1304] = var200;
                class73.field1304 = (class73.field1304 + 1) % 100;
                class46 var205 = class22.method137(class85.method665(93, class147.field2651).method312(-9211));
                if (var199 == 2 || var199 == 3) {
                    class158.method1161(-1, 9, class277.method1862((byte) -64, var193).method306(true), var205, class109.method855(arg0 + 1, new class46[] { class161.field2838, class277.method1862((byte) -64, var191).method306(true) }));
                } else if (var199 == 1) {
                    class158.method1161(-1, 9, class277.method1862((byte) -64, var193).method306(true), var205, class109.method855(0, new class46[] { class126.field2317, class277.method1862((byte) -64, var191).method306(true) }));
                } else {
                    class158.method1161(arg0, 9, class277.method1862((byte) -64, var193).method306(true), var205, class277.method1862((byte) -64, var191).method306(true));
                }
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 67) {
            class238.field4226 = class147.field2651.method595(-16950);
            class82.field1577 = class147.field2651.method566(255);
            while (class147.field2651.field1380 < class219.field3861) {
                class109.field2039 = class147.field2651.method558(1);
                class23.method163(63);
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 31) {
            class109.method856(-22374);
            class109.field2039 = -1;
            return false;
        } else if (class109.field2039 == 215) {
            for (int var206 = 0; var206 < class1.field6.length; var206++) {
                if (class1.field6[var206] != null) {
                    class1.field6[var206].field2575 = -1;
                }
            }
            for (int var207 = 0; var207 < field29.length; var207++) {
                if (field29[var207] != null) {
                    field29[var207].field2575 = -1;
                }
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 189) {
            class42.field714 = class219.field3861 / 8;
            for (int var208 = 0; var208 < class42.field714; var208++) {
                class29.field562[var208] = class147.field2651.method550(true);
                class221.field3891[var208] = class277.method1862((byte) -64, class29.field562[var208]);
            }
            class14.field219 = class86.field1635;
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 9) {
            int var209 = class147.field2651.method567((byte) 127);
            int var210 = class147.field2651.method580(arg0 - 104);
            class249.field4414 = var210;
            class207.field3710 = var209;
            class160.method1171(false);
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 232) {
            int var211 = class147.field2651.method579(-104);
            int var212 = class147.field2651.method579(-107);
            int var213 = class147.field2651.method595(-16950);
            if (class81.method648(var211, -125)) {
                if (var213 == 2) {
                    class166.method1186((byte) 44);
                }
                class114.field2157 = var212;
                class137.method1053(arg0 ^ 0x3FFF, var212);
                class81.method644((byte) 76, false);
                class269.method1806(class114.field2157, 0);
                for (int var214 = 0; var214 < 100; var214++) {
                    class31.field592[var214] = true;
                }
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 3) {
            int var215 = class147.field2651.method562((byte) -71);
            int var216 = class147.field2651.method545((byte) -116);
            class24 var217;
            if (var215 < 0) {
                var217 = null;
            } else {
                var217 = class13.method73(1506528624, var215);
            }
            if (var215 < -70000) {
                var216 += 32768;
            }
            while (class147.field2651.field1380 < class219.field3861) {
                int var218 = class147.field2651.method557(arg0 - 22717);
                int var219 = class147.field2651.method545((byte) -128);
                int var220 = 0;
                if (var219 != 0) {
                    var220 = class147.field2651.method558(1);
                    if (var220 == 255) {
                        var220 = class147.field2651.method562((byte) -71);
                    }
                }
                if (var217 != null && var218 >= 0 && var218 < var217.field498.length) {
                    var217.field498[var218] = var219;
                    var217.field483[var218] = var220;
                }
                class95.method746((byte) 28, var219 - 1, var216, var218, var220);
            }
            if (var217 != null) {
                class226.method1549(false, var217);
            }
            class126.method980(arg0 ^ 0x3DAC);
            class69.field1192[class50.method369(31, class214.field3798++)] = class50.method369(var216, 32767);
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 5) {
            long var221 = class147.field2651.method550(true);
            class46 var223 = class22.method137(class85.method665(55, class147.field2651).method312(arg0 - 9210));
            class155.method1136(73, class277.method1862((byte) -64, var221).method306(true), 6, var223);
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 89) {
            int var224 = class147.field2651.method579(-61);
            int var225 = class147.field2651.method579(-118);
            int var226 = class147.field2651.method545((byte) -122);
            int var227 = class147.field2651.method589((byte) 0);
            if (class81.method648(var224, -124)) {
                class131.method1015(var227, (var226 << 16) + var225, (byte) -109);
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 185) {
            int var228 = class147.field2651.method567((byte) 127);
            int var229 = class147.field2651.method572((byte) -103);
            int var230 = class147.field2651.method552((byte) -77);
            if (class81.method648(var228, -128)) {
                class102.method777(var230, (byte) 118, var229);
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 187) {
            int var231 = class147.field2651.method580(arg0 - 112);
            int var232 = class147.field2651.method545((byte) -102);
            int var233 = class147.field2651.method551((byte) 117);
            if (class81.method648(var231, -126)) {
                class197.method1407(var232, false, var233);
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 28) {
            class1.field14 = class86.field1635;
            long var234 = class147.field2651.method550(true);
            if (var234 == 0L) {
                class109.field2039 = -1;
                class100.field1849 = null;
                class107.field2000 = null;
                class235.field4098 = null;
                class245.field4361 = 0;
                return true;
            }
            long var236 = class147.field2651.method550(true);
            class100.field1849 = class277.method1862((byte) -64, var236);
            class235.field4098 = class277.method1862((byte) -64, var234);
            class66.field1114 = class147.field2651.method569((byte) -110);
            int var238 = class147.field2651.method558(1);
            if (var238 == 255) {
                class109.field2039 = -1;
                return true;
            }
            class245.field4361 = var238;
            class97[] var239 = new class97[100];
            for (int var240 = 0; var240 < class245.field4361; var240++) {
                var239[var240] = new class97();
                var239[var240].field1195 = class147.field2651.method550(true);
                var239[var240].field1813 = class277.method1862((byte) -64, var239[var240].field1195);
                var239[var240].field1810 = class147.field2651.method545((byte) -102);
                var239[var240].field1812 = class147.field2651.method569((byte) -110);
                var239[var240].field1809 = class147.field2651.method577(0);
                if (class208.field3738 == var239[var240].field1195) {
                    class92.field1724 = var239[var240].field1812;
                }
            }
            boolean var241 = false;
            int var242 = class245.field4361;
            while (var242 > 0) {
                var242--;
                boolean var243 = true;
                for (int var244 = 0; var244 < var242; var244++) {
                    if (var239[var244].field1813.method333(var239[var244 + 1].field1813, (byte) 47) > 0) {
                        var243 = false;
                        class97 var245 = var239[var244];
                        var239[var244] = var239[var244 + 1];
                        var239[var244 + 1] = var245;
                    }
                }
                if (var243) {
                    break;
                }
            }
            class109.field2039 = -1;
            class107.field2000 = var239;
            return true;
        } else if (class109.field2039 == 137) {
            class244.field4335 = class147.field2651.method580(-95) * 30;
            class273.field4768 = class86.field1635;
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 106) {
            class147.method1092(class8.field130, class147.field2651, (byte) 49, class219.field3861);
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 26) {
            int var246 = class147.field2651.method562((byte) -71);
            int var247 = class147.field2651.method545((byte) 78);
            class24 var248;
            if (var246 >= 0) {
                var248 = class13.method73(1506528624, var246);
            } else {
                var248 = null;
            }
            if (var246 < -70000) {
                var247 += 32768;
            }
            if (var248 != null) {
                for (int var249 = 0; var249 < var248.field498.length; var249++) {
                    var248.field498[var249] = 0;
                    var248.field483[var249] = 0;
                }
            }
            class273.method1848(102, var247);
            int var250 = class147.field2651.method545((byte) 119);
            for (int var251 = 0; var251 < var250; var251++) {
                int var252 = class147.field2651.method545((byte) 36);
                int var253 = class147.field2651.method558(arg0 ^ 0xFFFFFFFE);
                if (var253 == 255) {
                    var253 = class147.field2651.method552((byte) -116);
                }
                if (var248 != null && var251 < var248.field498.length) {
                    var248.field498[var251] = var252;
                    var248.field483[var251] = var253;
                }
                class95.method746((byte) 28, var252 - 1, var247, var251, var253);
            }
            if (var248 != null) {
                class226.method1549(false, var248);
            }
            class126.method980(-15789);
            class69.field1192[class50.method369(31, class214.field3798++)] = class50.method369(var247, 32767);
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 76) {
            int var254 = class147.field2651.method545((byte) -81);
            class46 var255 = class147.field2651.method577(0);
            int var256 = class147.field2651.method567((byte) 127);
            if (class81.method648(var256, -126)) {
                class235.method1598(2, var254, var255);
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 94) {
            class124.method969((byte) 71);
            class126.method980(-15789);
            class109.field2039 = -1;
            class87.field1647 += 32;
            return true;
        } else if (class109.field2039 == 250) {
            int var257 = class147.field2651.method579(arg0 - 64);
            class46 var258 = class147.field2651.method577(0);
            int var259 = class147.field2651.method580(arg0 - 46);
            if (class81.method648(var257, -124)) {
                class235.method1598(arg0 ^ 0xFFFFFFFD, var259, var258);
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 117) {
            class46 var260 = class147.field2651.method577(0);
            if (var260.method346(true, class241.field4283)) {
                boolean var261 = false;
                class46 var262 = var260.method338(19551, var260.method342(class207.field3714, -6645), 0);
                long var263 = var262.method349((byte) 59);
                for (int var265 = 0; var265 < class42.field714; var265++) {
                    if (class29.field562[var265] == var263) {
                        var261 = true;
                        break;
                    }
                }
                if (!var261 && class180.field3211 == 0) {
                    class155.method1136(76, var262, 4, class229.field3993);
                }
            } else if (var260.method346(true, class112.field2129)) {
                boolean var295 = false;
                class46 var296 = var260.method338(19551, var260.method342(class207.field3714, arg0 - 6644), 0);
                long var297 = var296.method349((byte) 59);
                for (int var299 = 0; var299 < class42.field714; var299++) {
                    if (class29.field562[var299] == var297) {
                        var295 = true;
                        break;
                    }
                }
                if (!var295 && class180.field3211 == 0) {
                    class46 var300 = var260.method338(19551, var260.method314(36) - 9, var260.method342(class207.field3714, -6645) - -1);
                    class155.method1136(86, var296, 8, var300);
                }
            } else if (var260.method346(true, class213.field3794)) {
                boolean var290 = false;
                class46 var291 = var260.method338(arg0 ^ 0xFFFFB3A0, var260.method342(class207.field3714, arg0 - 6644), 0);
                long var292 = var291.method349((byte) 59);
                for (int var294 = 0; var294 < class42.field714; var294++) {
                    if (class29.field562[var294] == var292) {
                        var290 = true;
                        break;
                    }
                }
                if (!var290 && class180.field3211 == 0) {
                    class155.method1136(arg0 ^ 0xFFFFFF8F, var291, 10, class85.field1613);
                }
            } else if (var260.method346(true, class151.field2692)) {
                class46 var289 = var260.method338(arg0 ^ 0xFFFFB3A0, var260.method342(class151.field2692, -6645), 0);
                class155.method1136(arg0 ^ 0xFFFFFFB5, class85.field1613, 11, var289);
            } else if (var260.method346(true, class114.field2156)) {
                class46 var266 = var260.method338(19551, var260.method342(class114.field2156, -6645), 0);
                if (class180.field3211 == 0) {
                    class155.method1136(127, class85.field1613, 12, var266);
                }
            } else if (var260.method346(true, class113.field2151)) {
                class46 var267 = var260.method338(19551, var260.method342(class113.field2151, -6645), 0);
                if (class180.field3211 == 0) {
                    class155.method1136(97, class85.field1613, 13, var267);
                }
            } else if (var260.method346(true, class102.field1856)) {
                class46 var268 = var260.method338(19551, var260.method342(class207.field3714, arg0 ^ 0x19F4), 0);
                long var269 = var268.method349((byte) 59);
                boolean var271 = false;
                for (int var272 = 0; var272 < class42.field714; var272++) {
                    if (class29.field562[var272] == var269) {
                        var271 = true;
                        break;
                    }
                }
                if (!var271 && class180.field3211 == 0) {
                    class155.method1136(105, var268, 14, class85.field1613);
                }
            } else if (var260.method346(true, class116.field2194)) {
                class46 var284 = var260.method338(19551, var260.method342(class207.field3714, -6645), 0);
                long var285 = var284.method349((byte) 59);
                boolean var287 = false;
                for (int var288 = 0; var288 < class42.field714; var288++) {
                    if (class29.field562[var288] == var285) {
                        var287 = true;
                        break;
                    }
                }
                if (!var287 && class180.field3211 == 0) {
                    class155.method1136(127, var284, 15, class85.field1613);
                }
            } else if (var260.method346(true, class243.field4309)) {
                class46 var273 = var260.method338(19551, var260.method342(class207.field3714, -6645), 0);
                long var274 = var273.method349((byte) 59);
                boolean var276 = false;
                for (int var277 = 0; var277 < class42.field714; var277++) {
                    if (class29.field562[var277] == var274) {
                        var276 = true;
                        break;
                    }
                }
                if (!var276 && class180.field3211 == 0) {
                    class155.method1136(116, var273, 16, class85.field1613);
                }
            } else if (var260.method346(true, class82.field1573)) {
                class46 var278 = var260.method338(19551, var260.method342(class207.field3714, -6645), 0);
                long var279 = var278.method349((byte) 59);
                boolean var281 = false;
                for (int var282 = 0; var282 < class42.field714; var282++) {
                    if (class29.field562[var282] == var279) {
                        var281 = true;
                        break;
                    }
                }
                if (!var281 && class180.field3211 == 0) {
                    class46 var283 = var260.method338(19551, var260.method314(121) - 9, var260.method342(class207.field3714, arg0 + -6644) + 1);
                    class155.method1136(67, var278, 21, var283);
                }
            } else {
                class155.method1136(arg0 ^ 0xFFFFFFA7, class85.field1613, 0, var260);
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 222) {
            int var301 = class147.field2651.method558(1);
            int var302 = class147.field2651.method558(1);
            int var303 = class147.field2651.method545((byte) -88);
            int var304 = class147.field2651.method558(1);
            int var305 = class147.field2651.method558(1);
            class90.method699(var301, var302, var303, var305, var304, true, 128);
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 66) {
            long var306 = class147.field2651.method550(true);
            int var308 = class147.field2651.method545((byte) -77);
            int var309 = class147.field2651.method558(arg0 ^ 0xFFFFFFFE);
            boolean var310 = true;
            if (var306 < 0L) {
                var306 &= Long.MAX_VALUE;
                var310 = false;
            }
            class46 var311 = class85.field1613;
            if (var308 > 0) {
                var311 = class147.field2651.method577(arg0 + 1);
            }
            class46 var312 = class277.method1862((byte) -64, var306).method306(true);
            for (int var313 = 0; var313 < class97.field1806; var313++) {
                if (class194.field3492[var313] == var306) {
                    if (class273.field4767[var313] != var308) {
                        class273.field4767[var313] = var308;
                        if (var308 > 0) {
                            class155.method1136(107, class85.field1613, 5, class109.method855(0, new class46[] { var312, class230.field4009 }));
                        }
                        if (var308 == 0) {
                            class155.method1136(113, class85.field1613, 5, class109.method855(0, new class46[] { var312, class151.field2694 }));
                        }
                    }
                    var312 = null;
                    class74.field1343[var313] = var311;
                    class108.field2008[var313] = var309;
                    class252.field4441[var313] = var310;
                    break;
                }
            }
            if (var312 != null && class97.field1806 < 200) {
                class194.field3492[class97.field1806] = var306;
                class3.field37[class97.field1806] = var312;
                class273.field4767[class97.field1806] = var308;
                class74.field1343[class97.field1806] = var311;
                class108.field2008[class97.field1806] = var309;
                class252.field4441[class97.field1806] = var310;
                class97.field1806++;
            }
            class14.field219 = class86.field1635;
            boolean var314 = false;
            int var315 = class97.field1806;
            while (var315 > 0) {
                boolean var316 = true;
                var315--;
                for (int var317 = 0; var317 < var315; var317++) {
                    if (class273.field4767[var317] != class97.field1808 && class273.field4767[var317 + 1] == class97.field1808 || class273.field4767[var317] == 0 && class273.field4767[var317 + 1] != 0) {
                        var316 = false;
                        int var318 = class273.field4767[var317];
                        class273.field4767[var317] = class273.field4767[var317 + 1];
                        class273.field4767[var317 + 1] = var318;
                        class46 var319 = class74.field1343[var317];
                        class74.field1343[var317] = class74.field1343[var317 + 1];
                        class74.field1343[var317 + 1] = var319;
                        class46 var320 = class3.field37[var317];
                        class3.field37[var317] = class3.field37[var317 + 1];
                        class3.field37[var317 + 1] = var320;
                        long var321 = class194.field3492[var317];
                        class194.field3492[var317] = class194.field3492[var317 + 1];
                        class194.field3492[var317 + 1] = var321;
                        int var323 = class108.field2008[var317];
                        class108.field2008[var317] = class108.field2008[var317 + 1];
                        class108.field2008[var317 + 1] = var323;
                        boolean var324 = class252.field4441[var317];
                        class252.field4441[var317] = class252.field4441[var317 + 1];
                        class252.field4441[var317 + 1] = var324;
                    }
                }
                if (var316) {
                    break;
                }
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 242) {
            int var325 = class147.field2651.method562((byte) -71);
            int var326 = class147.field2651.method545((byte) 101);
            class161.method1174(true, var326, var325);
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 29) {
            int var327 = class147.field2651.method545((byte) -94);
            int var328 = class147.field2651.method562((byte) -71);
            if (class81.method648(var327, -128)) {
                class31 var329 = (class31) class93.field1727.method1601(-76, (long) var328);
                if (var329 != null) {
                    class175.method1262(true, var329, 24);
                }
                if (class1.field13 != null) {
                    class226.method1549(false, class1.field13);
                    class1.field13 = null;
                }
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 12) {
            int var330 = class147.field2651.method545((byte) 75);
            int var331 = class147.field2651.method589((byte) 0);
            if (var330 == 65535) {
                var330 = -1;
            }
            int var332 = class147.field2651.method580(-11);
            if (class81.method648(var332, -126)) {
                class160.method1172(var331, 2, var330, (byte) 68);
            }
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 192) {
            class255.method1718(false, -30);
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 248) {
            int var333 = class147.field2651.method558(arg0 + 2);
            int var334 = class147.field2651.method558(1);
            int var335 = class147.field2651.method545((byte) 59);
            int var336 = class147.field2651.method558(1);
            int var337 = class147.field2651.method558(1);
            class180.method1290(var336, var333, -123, var334, var335, var337);
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 118) {
            class168.field2953 = class147.field2651.method558(1);
            class175.field3154 = class147.field2651.method558(1);
            class220.field3877 = class147.field2651.method558(arg0 + 2);
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 152) {
            int var338 = class147.field2651.method562((byte) -71);
            class31.field594 = class8.field130.method39(var338, arg0 ^ 0x7E);
            class109.field2039 = -1;
            return true;
        } else if (class109.field2039 == 153) {
            long var339 = class147.field2651.method550(true);
            long var341 = (long) class147.field2651.method545((byte) -84);
            long var343 = (long) class147.field2651.method559(-1);
            long var345 = (var341 << 32) + var343;
            boolean var347 = false;
            int var348 = class147.field2651.method558(1);
            int var349 = 0;
            label1484: while (true) {
                if (var349 >= 100) {
                    if (var348 <= 1) {
                        if (class248.field4383 == 1 || class78.field1497 == 1) {
                            var347 = true;
                        } else {
                            for (int var350 = 0; var350 < class42.field714; var350++) {
                                if (class29.field562[var350] == var339) {
                                    var347 = true;
                                    break label1484;
                                }
                            }
                        }
                    }
                    break;
                }
                if (class166.field2937[var349] == var345) {
                    var347 = true;
                    break;
                }
                var349++;
            }
            if (!var347 && class180.field3211 == 0) {
                class166.field2937[class73.field1304] = var345;
                class73.field1304 = (class73.field1304 + 1) % 100;
                class46 var351 = class22.method137(class85.method665(105, class147.field2651).method312(arg0 - 9210));
                if (var348 == 2 || var348 == 3) {
                    class155.method1136(70, class109.method855(arg0 + 1, new class46[] { class161.field2838, class277.method1862((byte) -64, var339).method306(true) }), 7, var351);
                } else if (var348 == 1) {
                    class155.method1136(arg0 ^ 0xFFFFFF9D, class109.method855(0, new class46[] { class126.field2317, class277.method1862((byte) -64, var339).method306(true) }), 7, var351);
                } else {
                    class155.method1136(119, class277.method1862((byte) -64, var339).method306(true), 3, var351);
                }
            }
            class109.field2039 = -1;
            return true;
        } else {
            class272.method1835((Throwable) null, -62, "T1 - " + class109.field2039 + "," + class206.field3692 + "," + class212.field3776 + " - " + class219.field3861);
            class109.method856(-22374);
            return true;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IZZI)Lha;")
    public static final class46 method5(int arg0, boolean arg1, boolean arg2, int arg3) {
        if (!arg1) {
            field31 = null;
        }
        field20++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        int var4 = 1;
        int var5 = arg3 / arg0;
        while (var5 != 0) {
            var5 /= arg0;
            var4++;
        }
        int var6 = var4;
        if (arg3 < 0 || arg2) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg3 < 0) {
            var7[0] = 45;
        } else if (arg2) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg3 % arg0;
            if (var10 < 0) {
                var10 = -var10;
            }
            arg3 /= arg0;
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class46 var9 = new class46();
        var9.field768 = var7;
        var9.field762 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILpi;Lpi;)V")
    public static final void method6(int arg0, class181 arg1, class181 arg2) {
        class197.field3520 = arg1;
        class247.field4371 = arg2;
        class265.field4608 = class247.field4371.method1327(false, arg0);
        field22++;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
    public static void method7(int arg0) {
        field29 = null;
        field33 = null;
        field31 = null;
        if (arg0 == -8646) {
            field32 = null;
            field19 = null;
        }
    }
}
