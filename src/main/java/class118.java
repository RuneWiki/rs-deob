import java.io.IOException;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class118 {

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "Llc;")
    private static class143 field2098 = class66.method374("Examine", -1);

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "Llc;")
    public static class143 field2101 = field2098;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "Lda;")
    public static class102 field2096;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2100;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "[[[S")
    public static short[][][] field2099;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public static void method722(int arg0) {
        if (arg0 != 0) {
            method726((byte) 17, true);
        }
        field2098 = null;
        field2099 = null;
        field2096 = null;
        field2101 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)V")
    public static final void method723(int arg0, int arg1, int arg2) {
        field2103++;
        for (int var3 = 0; var3 < class42.field705; var3++) {
            class4 var4 = class9.method78(var3, false);
            if (var4 != null) {
                int var5 = var4.field57;
                if (var5 >= 0 && !class196.field3636.method385(124, var5)) {
                    var5 = -1;
                }
                int var9;
                if (var4.field60 >= 0) {
                    int var6 = var4.field60;
                    int var7 = (var6 & 0x7F) + arg1;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 127) {
                        var7 = 127;
                    }
                    int var8 = (var6 + arg2 & 0xFC00) + (var6 & 0x380) + var7;
                    var9 = class196.field3640[class13.method105(var8, 96, true)];
                } else if (var5 >= 0) {
                    var9 = class196.field3640[class13.method105(class196.field3636.method388(0, var5), 96, true)];
                } else if (var4.field55 == -1) {
                    var9 = -1;
                } else {
                    int var10 = var4.field55;
                    int var11 = (var10 & 0x7F) + arg1;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
                    var9 = class196.field3640[class13.method105(var12, 96, true)];
                }
                class67.field1270[var3 + 1] = var9;
            }
        }
        if (arg0 != -1) {
            field2099 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
    public class118() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)Z")
    public static final boolean method724(boolean arg0) throws IOException {
        field2102++;
        if (class17.field298 == null) {
            return false;
        }
        int var1 = class17.field298.method1681((byte) -122);
        if (var1 == 0) {
            return false;
        }
        if (class53.field1038 == -1) {
            var1--;
            class17.field298.method1684(1, -97, 0, class161.field2902.field3465);
            class161.field2902.field3487 = 0;
            class53.field1038 = class161.field2902.method807((byte) 112);
            class42.field708 = class178.field3194[class53.field1038];
        }
        if (class42.field708 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class17.field298.method1684(1, 100, 0, class161.field2902.field3465);
            var1--;
            class42.field708 = class161.field2902.field3465[0] & 0xFF;
        }
        if (class42.field708 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class17.field298.method1684(2, 125, 0, class161.field2902.field3465);
            class161.field2902.field3487 = 0;
            class42.field708 = class161.field2902.method1275(128);
        }
        if (class42.field708 > var1) {
            return false;
        }
        class161.field2902.field3487 = 0;
        class17.field298.method1684(class42.field708, 112, 0, class161.field2902.field3465);
        class126.field2239 = 0;
        class167.field2988 = class70.field1341;
        class70.field1341 = class95.field1754;
        class95.field1754 = class53.field1038;
        if (class53.field1038 == 169) {
            int var2 = class161.field2902.method1236(25215);
            int var3 = class161.field2902.method1259(6385);
            class244.method1621(var3, (byte) 80, var2);
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 148) {
            int var4 = class161.field2902.method1235(-29530);
            int var5 = class161.field2902.method1275(128);
            if (var5 == 65535) {
                var5 = -1;
            }
            int var6 = class161.field2902.method1269(125);
            if (class86.method501(var4, -74)) {
                class75.method431(var5, false, 2, var6);
            }
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 74) {
            class143 var7 = class161.field2902.method1270((byte) -122);
            if (var7.method902(3, class207.field3813)) {
                class143 var43 = var7.method896(var7.method891(-31978, class149.field2749), 0, false);
                long var44 = var43.method874(7);
                boolean var46 = false;
                for (int var47 = 0; var47 < class184.field3338; var47++) {
                    if (class255.field4585[var47] == var44) {
                        var46 = true;
                        break;
                    }
                }
                if (!var46 && class126.field2240 == 0) {
                    class170.method1119(var43, 4096, class252.field4529, 4);
                }
            } else if (var7.method902(3, class210.field3906)) {
                class143 var8 = var7.method896(var7.method891(-31978, class149.field2749), 0, false);
                long var9 = var8.method874(7);
                boolean var11 = false;
                for (int var12 = 0; var12 < class184.field3338; var12++) {
                    if (class255.field4585[var12] == var9) {
                        var11 = true;
                        break;
                    }
                }
                if (!var11 && class126.field2240 == 0) {
                    class143 var13 = var7.method896(var7.method913((byte) 45) - 9, var7.method891(-31978, class149.field2749) + 1, false);
                    class170.method1119(var8, 4096, var13, 8);
                }
            } else if (var7.method902(3, class186.field3382)) {
                class143 var14 = var7.method896(var7.method891(-31978, class149.field2749), 0, false);
                long var15 = var14.method874(7);
                boolean var17 = false;
                for (int var18 = 0; var18 < class184.field3338; var18++) {
                    if (class255.field4585[var18] == var15) {
                        var17 = true;
                        break;
                    }
                }
                if (!var17 && class126.field2240 == 0) {
                    class170.method1119(var14, 4096, class21.field342, 10);
                }
            } else if (var7.method902(3, class18.field311)) {
                class143 var42 = var7.method896(var7.method891(-31978, class18.field311), 0, false);
                class170.method1119(class21.field342, 4096, var42, 11);
            } else if (var7.method902(3, class128.field2263)) {
                class143 var19 = var7.method896(var7.method891(-31978, class128.field2263), 0, false);
                if (class126.field2240 == 0) {
                    class170.method1119(class21.field342, 4096, var19, 12);
                }
            } else if (var7.method902(3, class95.field1757)) {
                class143 var20 = var7.method896(var7.method891(-31978, class95.field1757), 0, false);
                if (class126.field2240 == 0) {
                    class170.method1119(class21.field342, 4096, var20, 13);
                }
            } else if (var7.method902(3, class235.field4286)) {
                class143 var21 = var7.method896(var7.method891(-31978, class149.field2749), 0, !arg0);
                long var22 = var21.method874(7);
                boolean var24 = false;
                for (int var25 = 0; var25 < class184.field3338; var25++) {
                    if (class255.field4585[var25] == var22) {
                        var24 = true;
                        break;
                    }
                }
                if (!var24 && class126.field2240 == 0) {
                    class170.method1119(var21, 4096, class21.field342, 14);
                }
            } else if (var7.method902(3, class289.field5076)) {
                class143 var26 = var7.method896(var7.method891(-31978, class149.field2749), 0, false);
                long var27 = var26.method874(7);
                boolean var29 = false;
                for (int var30 = 0; var30 < class184.field3338; var30++) {
                    if (class255.field4585[var30] == var27) {
                        var29 = true;
                        break;
                    }
                }
                if (!var29 && class126.field2240 == 0) {
                    class170.method1119(var26, 4096, class21.field342, 15);
                }
            } else if (var7.method902(3, class11.field224)) {
                class143 var31 = var7.method896(var7.method891(-31978, class149.field2749), 0, false);
                boolean var32 = false;
                long var33 = var31.method874(7);
                for (int var35 = 0; var35 < class184.field3338; var35++) {
                    if (class255.field4585[var35] == var33) {
                        var32 = true;
                        break;
                    }
                }
                if (!var32 && class126.field2240 == 0) {
                    class170.method1119(var31, 4096, class21.field342, 16);
                }
            } else if (var7.method902(3, class227.field4095)) {
                class143 var36 = var7.method896(var7.method891(-31978, class149.field2749), 0, false);
                long var37 = var36.method874(7);
                boolean var39 = false;
                for (int var40 = 0; var40 < class184.field3338; var40++) {
                    if (class255.field4585[var40] == var37) {
                        var39 = true;
                        break;
                    }
                }
                if (!var39 && class126.field2240 == 0) {
                    class143 var41 = var7.method896(var7.method913((byte) 45) - 9, var7.method891(-31978, class149.field2749) + 1, false);
                    class170.method1119(var36, 4096, var41, 21);
                }
            } else {
                class170.method1119(class21.field342, 4096, var7, 0);
            }
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 175) {
            client.method1504(-127);
            class43.field858 = class161.field2902.method1265(124);
            class53.field1038 = -1;
            class26.field435 = class13.field249;
            return true;
        } else if (class53.field1038 == 209) {
            class143 var48 = class161.field2902.method1270((byte) 78);
            int var49 = class161.field2902.method1259(6385);
            int var50 = class161.field2902.method1254(32644);
            if (class86.method501(var49, -62)) {
                class161.method1068(var50, (byte) 19, var48);
            }
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 186) {
            int var51 = class161.field2902.method1265(113);
            int var52 = var51 >> 6;
            class58 var53 = new class58();
            var53.field1112 = var51 & 0x3F;
            var53.field1114 = class161.field2902.method1265(119);
            if (var53.field1114 >= 0 && class140.field2442.length > var53.field1114) {
                if (var53.field1112 == 1 || var53.field1112 == 10) {
                    var53.field1123 = class161.field2902.method1275(128);
                    class161.field2902.field3487 += 3;
                } else if (var53.field1112 >= 2 && var53.field1112 <= 6) {
                    if (var53.field1112 == 2) {
                        var53.field1121 = 64;
                        var53.field1129 = 64;
                    }
                    if (var53.field1112 == 3) {
                        var53.field1121 = 64;
                        var53.field1129 = 0;
                    }
                    if (var53.field1112 == 4) {
                        var53.field1129 = 128;
                        var53.field1121 = 64;
                    }
                    if (var53.field1112 == 5) {
                        var53.field1121 = 0;
                        var53.field1129 = 64;
                    }
                    if (var53.field1112 == 6) {
                        var53.field1129 = 64;
                        var53.field1121 = 128;
                    }
                    var53.field1112 = 2;
                    var53.field1126 = class161.field2902.method1275(128);
                    var53.field1119 = class161.field2902.method1275(128);
                    var53.field1127 = class161.field2902.method1265(114);
                }
                var53.field1125 = class161.field2902.method1275(128);
                if (var53.field1125 == 65535) {
                    var53.field1125 = -1;
                }
                class250.field4510[var52] = var53;
            }
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 247) {
            long var54 = class161.field2902.method1267((byte) -115);
            class161.field2902.method1234(false);
            long var56 = class161.field2902.method1267((byte) 38);
            long var58 = (long) class161.field2902.method1275(128);
            long var60 = (long) class161.field2902.method1282(118);
            int var62 = class161.field2902.method1265(117);
            int var63 = class161.field2902.method1275(128);
            long var64 = (var58 << 32) + var60;
            boolean var66 = false;
            int var67 = 0;
            label1162: while (true) {
                if (var67 >= 100) {
                    if (var62 <= 1) {
                        for (int var68 = 0; var68 < class184.field3338; var68++) {
                            if (class255.field4585[var68] == var54) {
                                var66 = true;
                                break label1162;
                            }
                        }
                    }
                    break;
                }
                if (class95.field1745[var67] == var64) {
                    var66 = true;
                    break;
                }
                var67++;
            }
            if (!var66 && class126.field2240 == 0) {
                class95.field1745[class30.field470] = var64;
                class30.field470 = (class30.field470 + 1) % 100;
                class143 var69 = class13.method103(110, var63).method1399(-19, class161.field2902);
                if (var62 == 2 || var62 == 3) {
                    class173.method1135(var63, 3, 20, class64.method364((byte) 97, var56).method878(-28102), class25.method179(0, new class143[] { class171.field3062, class64.method364((byte) 97, var54).method878(-28102) }), var69);
                } else if (var62 == 1) {
                    class173.method1135(var63, 3, 20, class64.method364((byte) 97, var56).method878(-28102), class25.method179(0, new class143[] { class195.field3620, class64.method364((byte) 97, var54).method878(-28102) }), var69);
                } else {
                    class173.method1135(var63, 3, 20, class64.method364((byte) 97, var56).method878(-28102), class64.method364((byte) 97, var54).method878(-28102), var69);
                }
            }
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 109) {
            if (class7.field138 != -1) {
                class114.method692(0, class7.field138, 1);
            }
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 108) {
            int var70 = class161.field2902.method1254(32644);
            int var71 = class161.field2902.method1261(2);
            int var72 = class161.field2902.method1265(123);
            if (class86.method501(var71, 77)) {
                class164.method1077(var72, var70, 30918);
            }
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 167) {
            int var73 = class161.field2902.method1235(-29530);
            int var74 = class161.field2902.method1275(128);
            int var75 = class161.field2902.method1266(85);
            if (class86.method501(var73, 80)) {
                class54.method327(var74, 0, var75);
            }
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 204) {
            long var76 = class161.field2902.method1267((byte) 52);
            int var78 = class161.field2902.method1275(128);
            boolean var79 = true;
            int var80 = class161.field2902.method1265(125);
            if (var76 < 0L) {
                var79 = false;
                var76 &= Long.MAX_VALUE;
            }
            class143 var81 = class21.field342;
            if (var78 > 0) {
                var81 = class161.field2902.method1270((byte) -103);
            }
            class143 var82 = class64.method364((byte) 97, var76).method878(-28102);
            for (int var83 = 0; var83 < class25.field421; var83++) {
                if (class13.field251[var83] == var76) {
                    if (class129.field2291[var83] != var78) {
                        class129.field2291[var83] = var78;
                        if (var78 > 0) {
                            class170.method1119(class21.field342, 4096, class25.method179(0, new class143[] { var82, class43.field754 }), 5);
                        }
                        if (var78 == 0) {
                            class170.method1119(class21.field342, 4096, class25.method179(0, new class143[] { var82, class189.field3422 }), 5);
                        }
                    }
                    class255.field4594[var83] = var81;
                    var82 = null;
                    class188.field3397[var83] = var80;
                    class269.field4818[var83] = var79;
                    break;
                }
            }
            boolean var84 = false;
            if (var82 != null && class25.field421 < 200) {
                class13.field251[class25.field421] = var76;
                class237.field4305[class25.field421] = var82;
                class129.field2291[class25.field421] = var78;
                class255.field4594[class25.field421] = var81;
                class188.field3397[class25.field421] = var80;
                class269.field4818[class25.field421] = var79;
                class25.field421++;
            }
            int var85 = class25.field421;
            class129.field2294 = class13.field249;
            while (var85 > 0) {
                var85--;
                boolean var86 = true;
                for (int var87 = 0; var87 < var85; var87++) {
                    if (class129.field2291[var87] != class23.field380 && class129.field2291[var87 + 1] == class23.field380 || class129.field2291[var87] == 0 && class129.field2291[var87 + 1] != 0) {
                        var86 = false;
                        int var88 = class129.field2291[var87];
                        class129.field2291[var87] = class129.field2291[var87 + 1];
                        class129.field2291[var87 + 1] = var88;
                        class143 var89 = class255.field4594[var87];
                        class255.field4594[var87] = class255.field4594[var87 + 1];
                        class255.field4594[var87 + 1] = var89;
                        class143 var90 = class237.field4305[var87];
                        class237.field4305[var87] = class237.field4305[var87 + 1];
                        class237.field4305[var87 + 1] = var90;
                        long var91 = class13.field251[var87];
                        class13.field251[var87] = class13.field251[var87 + 1];
                        class13.field251[var87 + 1] = var91;
                        int var93 = class188.field3397[var87];
                        class188.field3397[var87] = class188.field3397[var87 + 1];
                        class188.field3397[var87 + 1] = var93;
                        boolean var94 = class269.field4818[var87];
                        class269.field4818[var87] = class269.field4818[var87 + 1];
                        class269.field4818[var87 + 1] = var94;
                    }
                }
                if (var86) {
                    break;
                }
            }
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 128) {
            int var95 = class161.field2902.method1247(-109);
            int var96 = class161.field2902.method1235(-29530);
            int var97 = class161.field2902.method1275(128);
            int var98 = class161.field2902.method1259(6385);
            if (class86.method501(var98, 120)) {
                class75.method431(var96 << 16 | var97, !arg0, 7, var95);
            }
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 144) {
            class88.field1605 = class161.field2902.method1235(-29530) * 30;
            class26.field435 = class13.field249;
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 252) {
            class170.field3023 = class161.field2902.method1265(127);
            class53.field1038 = -1;
            class129.field2294 = class13.field249;
            return true;
        } else if (class53.field1038 == 156) {
            int var99 = class161.field2902.method1236(25215);
            class143 var100 = class161.field2902.method1270((byte) -126);
            int var101 = class161.field2902.method1236(25215);
            if (var101 >= 1 && var101 <= 8) {
                if (var100.method895((byte) -99, class248.field4453)) {
                    var100 = null;
                }
                class207.field3802[var101 - 1] = var100;
                class172.field3088[var101 - 1] = var99 == 0;
            }
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 2) {
            for (int var102 = 0; var102 < class148.field2691.length; var102++) {
                if (class148.field2691[var102] != class145.field2603[var102]) {
                    class148.field2691[var102] = class145.field2603[var102];
                    class24.method172(0, var102);
                    class132.field2317[class129.method777(31, class33.field560++)] = var102;
                }
            }
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 95) {
            class139.method830(109);
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 142) {
            int var103 = class161.field2902.method1265(123);
            int var104 = class161.field2902.method1265(114);
            int var105 = class161.field2902.method1265(127);
            int var106 = class161.field2902.method1265(119);
            int var107 = class161.field2902.method1275(128);
            class34.field592[var103] = true;
            class267.field4796[var103] = var104;
            class105.field1850[var103] = var105;
            class139.field2417[var103] = var106;
            class143.field2511[var103] = var107;
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 138) {
            int var108 = class161.field2902.method1260((byte) 120);
            int var109 = class161.field2902.method1260((byte) 7);
            int var110 = class161.field2902.method1250((byte) 106);
            class170.field3044 = var109 >> 1;
            class229.field4195.method216((var109 & 0x1) == 1, var108, var110, -12);
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 3) {
            class184.field3338 = class42.field708 / 8;
            for (int var111 = 0; var111 < class184.field3338; var111++) {
                class255.field4585[var111] = class161.field2902.method1267((byte) 115);
                class153.field2769[var111] = class64.method364((byte) 97, class255.field4585[var111]);
            }
            class53.field1038 = -1;
            class129.field2294 = class13.field249;
            return true;
        } else if (class53.field1038 == 43 || class53.field1038 == 24 || class53.field1038 == 193 || class53.field1038 == 211 || class53.field1038 == 98 || class53.field1038 == 76 || class53.field1038 == 46 || class53.field1038 == 121 || class53.field1038 == 210 || class53.field1038 == 163 || class53.field1038 == 255 || class53.field1038 == 49) {
            class63.method360(-82);
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 166) {
            long var112 = class161.field2902.method1267((byte) -121);
            int var114 = class161.field2902.method1275(128);
            class143 var115 = class13.method103(92, var114).method1399(-122, class161.field2902);
            class173.method1135(var114, 3, 19, (class143) null, class64.method364((byte) 97, var112).method878(-28102), var115);
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 228) {
            int var116 = class161.field2902.method1265(113);
            int var117 = class161.field2902.method1259(6385);
            int var118 = class161.field2902.method1275(128);
            if (class86.method501(var118, 118)) {
                class159.method1039(true, var116, var117);
            }
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 188) {
            class53.field1038 = -1;
            class177.field3170 = 0;
            return true;
        } else if (class53.field1038 == 155) {
            class225.field4074 = class161.field2902.method1236(25215);
            class190.field3496 = class161.field2902.method1250((byte) 103);
            for (int var119 = class225.field4074; var119 < (class225.field4074 + 8); var119++) {
                for (int var121 = class190.field3496; var121 < class190.field3496 + 8; var121++) {
                    if (class130.field2306[class170.field3044][var119][var121] != null) {
                        class130.field2306[class170.field3044][var119][var121] = null;
                        class48.method295(var119, var121, 128);
                    }
                }
            }
            for (class249 var120 = (class249) class57.field1107.method1294(false); var120 != null; var120 = (class249) class57.field1107.method1292((byte) 68)) {
                if (var120.field4502 >= class225.field4074 && var120.field4502 < (class225.field4074 + 8) && class190.field3496 <= var120.field4494 && (class190.field3496 + 8) > var120.field4494 && class170.field3044 == var120.field4491) {
                    var120.field4489 = 0;
                }
            }
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 206) {
            int var122 = class161.field2902.method1275(128);
            int var123 = class161.field2902.method1269(65);
            if (class86.method501(var122, -111)) {
                class163 var124 = (class163) class212.field3942.method1824((long) var123, 0);
                if (var124 != null) {
                    class17.method128(0, true, var124);
                }
                if (class281.field4937 != null) {
                    class141.method844((byte) 41, class281.field4937);
                    class281.field4937 = null;
                }
            }
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 27) {
            class263.method1755(-1, false);
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 40) {
            int var125 = class161.field2902.method1269(114);
            int var126 = class161.field2902.method1275(128);
            if (var125 < -70000) {
                var126 += 32768;
            }
            class43 var127;
            if (var125 < 0) {
                var127 = null;
            } else {
                var127 = class27.method186(1341, var125);
            }
            while (class161.field2902.field3487 < class42.field708) {
                int var128 = class161.field2902.method1257((byte) 52);
                int var129 = class161.field2902.method1275(128);
                int var130 = 0;
                if (var129 != 0) {
                    var130 = class161.field2902.method1265(117);
                    if (var130 == 255) {
                        var130 = class161.field2902.method1269(78);
                    }
                }
                if (var127 != null && var128 >= 0 && var127.field737.length > var128) {
                    var127.field737[var128] = var129;
                    var127.field889[var128] = var130;
                }
                class211.method1473(var128, var126, var130, var129 - 1, 0);
            }
            if (var127 != null) {
                class141.method844((byte) -128, var127);
            }
            client.method1504(-18);
            class74.field1381[class129.method777(31, class192.field3525++)] = class129.method777(32767, var126);
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 190) {
            int var131 = class161.field2902.method1259(6385);
            int var132 = class161.field2902.method1235(-29530);
            int var133 = class161.field2902.method1250((byte) 90);
            if (class86.method501(var132, -51)) {
                if (var133 == 2) {
                    class67.method394((byte) 22);
                }
                class7.field138 = var131;
                class277.method1831((byte) 120, var131);
                class136.method816(true, false);
                class195.method1343(class7.field138, (byte) 13);
                for (int var134 = 0; var134 < 100; var134++) {
                    class69.field1323[var134] = true;
                }
            }
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 194) {
            class208.field3825 = class161.field2902.method1265(118);
            class66.field1232 = class161.field2902.method1265(119);
            class281.field4939 = class161.field2902.method1265(124);
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 137) {
            int var135 = class161.field2902.method1275(128);
            int var136 = class161.field2902.method1235(-29530);
            int var137 = class161.field2902.method1254(32644);
            int var138 = class161.field2902.method1275(128);
            int var139 = class161.field2902.method1235(-29530);
            if (class86.method501(var136, -117)) {
                class274.method1808(var139, var135, var137, var138, false);
            }
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 222) {
            int var140 = class161.field2902.method1247(-107);
            int var141 = class161.field2902.method1275(128);
            if (class86.method501(var141, -31)) {
                int var142 = 0;
                if (class229.field4195.field516 != null) {
                    var142 = class229.field4195.field516.method681(true);
                }
                class75.method431(var142, false, 3, var140);
            }
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 159) {
            int var143 = class161.field2902.method1269(62);
            class249.field4490 = class4.field62.method455(3, var143);
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 52) {
            int var144 = class161.field2902.method1259(6385);
            if (var144 == 65535) {
                var144 = -1;
            }
            int var145 = class161.field2902.method1247(-125);
            int var146 = class161.field2902.method1259(6385);
            if (class86.method501(var146, -71)) {
                class75.method431(var144, false, 1, var145);
            }
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 134) {
            int var147 = class161.field2902.method1266(85);
            int var148 = class161.field2902.method1274((byte) -12);
            int var149 = class161.field2902.method1268(true);
            int var150 = class161.field2902.method1261(2);
            if (class86.method501(var150, -41)) {
                class173.method1139(var148, 128, var149, var147);
            }
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 47) {
            long var151 = class161.field2902.method1267((byte) -105);
            class143 var153 = class193.method1310(class179.method1176((byte) 127, class161.field2902).method899((byte) 46));
            class170.method1119(class64.method364((byte) 97, var151).method878(-28102), 4096, var153, 6);
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 88) {
            long var154 = class161.field2902.method1267((byte) 69);
            long var156 = (long) class161.field2902.method1275(128);
            long var158 = (long) class161.field2902.method1282(105);
            int var160 = class161.field2902.method1265(115);
            boolean var161 = false;
            int var162 = class161.field2902.method1275(128);
            long var163 = (var156 << 32) + var158;
            int var165 = 0;
            label1232: while (true) {
                if (var165 >= 100) {
                    if (var160 <= 1) {
                        for (int var166 = 0; var166 < class184.field3338; var166++) {
                            if (class255.field4585[var166] == var154) {
                                var161 = true;
                                break label1232;
                            }
                        }
                    }
                    break;
                }
                if (class95.field1745[var165] == var163) {
                    var161 = true;
                    break;
                }
                var165++;
            }
            if (!var161 && class126.field2240 == 0) {
                class95.field1745[class30.field470] = var163;
                class30.field470 = (class30.field470 + 1) % 100;
                class143 var167 = class13.method103(16, var162).method1399(-33, class161.field2902);
                if (var160 == 2) {
                    class173.method1135(var162, 3, 18, (class143) null, class25.method179(0, new class143[] { class171.field3062, class64.method364((byte) 97, var154).method878(-28102) }), var167);
                } else if (var160 == 1) {
                    class173.method1135(var162, 3, 18, (class143) null, class25.method179(0, new class143[] { class195.field3620, class64.method364((byte) 97, var154).method878(-28102) }), var167);
                } else {
                    class173.method1135(var162, 3, 18, (class143) null, class64.method364((byte) 97, var154).method878(-28102), var167);
                }
            }
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 237) {
            client.method1504(86);
            class167.field2980 = class161.field2902.method1274((byte) -77);
            class26.field435 = class13.field249;
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 123) {
            int var168 = class161.field2902.method1275(128);
            class143 var169 = class161.field2902.method1270((byte) -105);
            Object[] var170 = new Object[var169.method913((byte) 45) + 1];
            for (int var171 = var169.method913((byte) 45) - 1; var171 >= 0; var171--) {
                if (var169.method897(255, var171) == 115) {
                    var170[var171 + 1] = class161.field2902.method1270((byte) 62);
                } else {
                    var170[var171 + 1] = Integer.valueOf(class161.field2902.method1269(87));
                }
            }
            var170[0] = Integer.valueOf(class161.field2902.method1269(76));
            if (class86.method501(var168, -117)) {
                class91 var172 = new class91();
                var172.field1639 = var170;
                class247.method1638(var172, (byte) -91);
            }
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 221) {
            long var173 = class161.field2902.method1267((byte) -119);
            class161.field2902.method1234(!arg0);
            long var175 = class161.field2902.method1267((byte) -115);
            long var177 = (long) class161.field2902.method1275(128);
            boolean var179 = false;
            long var180 = (long) class161.field2902.method1282(126);
            long var182 = (var177 << 32) + var180;
            int var184 = class161.field2902.method1265(124);
            int var185 = 0;
            label1264: while (true) {
                if (var185 >= 100) {
                    if (var184 <= 1) {
                        if ((!class106.field1875 || class71.field1346) && !class267.field4789) {
                            for (int var186 = 0; var186 < class184.field3338; var186++) {
                                if (class255.field4585[var186] == var173) {
                                    var179 = true;
                                    break label1264;
                                }
                            }
                        } else {
                            var179 = true;
                        }
                    }
                    break;
                }
                if (class95.field1745[var185] == var182) {
                    var179 = true;
                    break;
                }
                var185++;
            }
            if (!var179 && class126.field2240 == 0) {
                class95.field1745[class30.field470] = var182;
                class30.field470 = (class30.field470 + 1) % 100;
                class143 var187 = class193.method1310(class179.method1176((byte) 127, class161.field2902).method899((byte) 46));
                if (var184 == 2 || var184 == 3) {
                    class48.method292(9, -1, var187, class64.method364((byte) 97, var175).method878(-28102), class25.method179(0, new class143[] { class171.field3062, class64.method364((byte) 97, var173).method878(-28102) }));
                } else if (var184 == 1) {
                    class48.method292(9, -1, var187, class64.method364((byte) 97, var175).method878(-28102), class25.method179(0, new class143[] { class195.field3620, class64.method364((byte) 97, var173).method878(-28102) }));
                } else {
                    class48.method292(9, -1, var187, class64.method364((byte) 97, var175).method878(-28102), class64.method364((byte) 97, var173).method878(-28102));
                }
            }
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 153) {
            long var188 = class161.field2902.method1267((byte) 25);
            boolean var190 = false;
            int var191 = class161.field2902.method1275(128);
            if ((Long.MIN_VALUE & var188) != 0L) {
                var190 = true;
            }
            byte var192 = class161.field2902.method1234(false);
            if (var190) {
                if (class30.field479 == 0) {
                    class53.field1038 = -1;
                    return true;
                }
                long var193 = var188 & Long.MAX_VALUE;
                boolean var195 = false;
                int var196;
                for (var196 = 0; class30.field479 > var196 && (class120.field2113[var196].field1162 != var193 || class120.field2113[var196].field424 != var191); var196++) {
                }
                if (var196 < class30.field479) {
                    while (var196 < class30.field479 - 1) {
                        class120.field2113[var196] = class120.field2113[var196 + 1];
                        var196++;
                    }
                    class30.field479--;
                    class120.field2113[class30.field479] = null;
                }
            } else {
                class143 var197 = class161.field2902.method1270((byte) 1);
                class25 var198 = new class25();
                var198.field1162 = var188;
                var198.field423 = class64.method364((byte) 97, var198.field1162);
                var198.field419 = var192;
                var198.field424 = var191;
                var198.field425 = var197;
                int var199;
                for (var199 = class30.field479 - 1; var199 >= 0; var199--) {
                    int var200 = class120.field2113[var199].field423.method870(116, var198.field423);
                    if (var200 == 0) {
                        class120.field2113[var199].field424 = var191;
                        class120.field2113[var199].field419 = var192;
                        class120.field2113[var199].field425 = var197;
                        if (class194.field3594 == var188) {
                            class44.field897 = var192;
                        }
                        class57.field1098 = class13.field249;
                        class53.field1038 = -1;
                        return true;
                    }
                    if (var200 < 0) {
                        break;
                    }
                }
                if (class120.field2113.length <= class30.field479) {
                    class53.field1038 = -1;
                    return true;
                }
                for (int var201 = class30.field479 - 1; var201 > var199; var201--) {
                    class120.field2113[var201 + 1] = class120.field2113[var201];
                }
                if (class30.field479 == 0) {
                    class120.field2113 = new class25[100];
                }
                class120.field2113[var199 + 1] = var198;
                if (class194.field3594 == var188) {
                    class44.field897 = var192;
                }
                class30.field479++;
            }
            class57.field1098 = class13.field249;
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 11) {
            client.method1504(-87);
            int var202 = class161.field2902.method1254(32644);
            int var203 = class161.field2902.method1250((byte) 103);
            int var204 = class161.field2902.method1236(25215);
            class259.field4647[var204] = var202;
            class224.field4067[var204] = var203;
            class221.field4002[var204] = 1;
            for (int var205 = 0; var205 < 98; var205++) {
                if (class255.field4574[var205] <= var202) {
                    class221.field4002[var204] = var205 + 2;
                }
            }
            class21.field339[class129.method777(class35.field609++, 31)] = var204;
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 89) {
            class242.method1613((byte) 16);
            client.method1504(91);
            class53.field1038 = -1;
            class33.field560 += 32;
            return true;
        } else if (class53.field1038 == 45) {
            int var206 = class161.field2902.method1259(6385);
            if (var206 == 65535) {
                var206 = -1;
            }
            class265.method1768(var206, -16422);
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 37) {
            int var207 = class161.field2902.method1259(6385);
            int var208 = class161.field2902.method1239(118);
            if (var207 == 65535) {
                var207 = -1;
            }
            class279.method1843(var207, 0, var208);
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 149) {
            int var209 = class161.field2902.method1275(128);
            if (var209 == 65535) {
                var209 = -1;
            }
            int var210 = class161.field2902.method1265(113);
            int var211 = class161.field2902.method1275(128);
            class190.method1273(var209, (byte) 103, var211, var210);
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 118) {
            class57.field1098 = class13.field249;
            long var212 = class161.field2902.method1267((byte) -112);
            if (var212 == 0L) {
                class30.field479 = 0;
                class147.field2662 = null;
                class37.field634 = null;
                class120.field2113 = null;
                class53.field1038 = -1;
                return true;
            }
            long var214 = class161.field2902.method1267((byte) -103);
            class37.field634 = class64.method364((byte) 97, var214);
            class147.field2662 = class64.method364((byte) 97, var212);
            class76.field1407 = class161.field2902.method1234(false);
            int var216 = class161.field2902.method1265(113);
            if (var216 == 255) {
                class53.field1038 = -1;
                return true;
            }
            class30.field479 = var216;
            class25[] var217 = new class25[100];
            for (int var218 = 0; var218 < class30.field479; var218++) {
                var217[var218] = new class25();
                var217[var218].field1162 = class161.field2902.method1267((byte) -112);
                var217[var218].field423 = class64.method364((byte) 97, var217[var218].field1162);
                var217[var218].field424 = class161.field2902.method1275(128);
                var217[var218].field419 = class161.field2902.method1234(!arg0);
                var217[var218].field425 = class161.field2902.method1270((byte) -114);
                if (class194.field3594 == var217[var218].field1162) {
                    class44.field897 = var217[var218].field419;
                }
            }
            boolean var219 = false;
            int var220 = class30.field479;
            while (var220 > 0) {
                var220--;
                boolean var221 = true;
                for (int var222 = 0; var222 < var220; var222++) {
                    if (var217[var222].field423.method870(114, var217[var222 + 1].field423) > 0) {
                        var221 = false;
                        class25 var223 = var217[var222];
                        var217[var222] = var217[var222 + 1];
                        var217[var222 + 1] = var223;
                    }
                }
                if (var221) {
                    break;
                }
            }
            class53.field1038 = -1;
            class120.field2113 = var217;
            return true;
        } else if (class53.field1038 == 173) {
            int var224 = class161.field2902.method1235(-29530);
            byte var225 = class161.field2902.method1249(-65);
            class207.method1444(var224, var225, -89);
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 57) {
            int var226 = class161.field2902.method1265(113);
            int var227 = class161.field2902.method1265(115);
            int var228 = class161.field2902.method1275(128);
            int var229 = class161.field2902.method1265(127);
            int var230 = class161.field2902.method1265(121);
            class189.method1224(var226, var229, var228, var230, (byte) 126, var227, true);
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 60) {
            int var231 = class161.field2902.method1235(-29530);
            int var232 = class161.field2902.method1235(-29530);
            int var233 = class161.field2902.method1250((byte) 92);
            class187 var234 = class259.field4648[var231];
            if (var234 != null) {
                class267.method1774(true, var233, var232, var234);
            }
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 19) {
            long var235 = class161.field2902.method1267((byte) -126);
            long var237 = (long) class161.field2902.method1275(128);
            long var239 = (long) class161.field2902.method1282(113);
            int var241 = class161.field2902.method1265(117);
            long var242 = (var237 << 32) + var239;
            boolean var244 = false;
            int var245 = 0;
            label1350: while (true) {
                if (var245 >= 100) {
                    if (var241 <= 1) {
                        if ((!class106.field1875 || class71.field1346) && !class267.field4789) {
                            for (int var246 = 0; var246 < class184.field3338; var246++) {
                                if (class255.field4585[var246] == var235) {
                                    var244 = true;
                                    break label1350;
                                }
                            }
                        } else {
                            var244 = true;
                        }
                    }
                    break;
                }
                if (class95.field1745[var245] == var242) {
                    var244 = true;
                    break;
                }
                var245++;
            }
            if (!var244 && class126.field2240 == 0) {
                class95.field1745[class30.field470] = var242;
                class30.field470 = (class30.field470 + 1) % 100;
                class143 var247 = class193.method1310(class179.method1176((byte) 127, class161.field2902).method899((byte) 46));
                if (var241 == 2 || var241 == 3) {
                    class170.method1119(class25.method179(0, new class143[] { class171.field3062, class64.method364((byte) 97, var235).method878(-28102) }), 4096, var247, 7);
                } else if (var241 == 1) {
                    class170.method1119(class25.method179(0, new class143[] { class195.field3620, class64.method364((byte) 97, var235).method878(-28102) }), 4096, var247, 7);
                } else {
                    class170.method1119(class64.method364((byte) 97, var235).method878(-28102), 4096, var247, 3);
                }
            }
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 20) {
            class62.method354(-110, class161.field2902);
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 214) {
            int var248 = class161.field2902.method1265(124);
            int var249 = class161.field2902.method1265(126);
            int var250 = class161.field2902.method1275(128);
            int var251 = class161.field2902.method1265(115);
            int var252 = class161.field2902.method1265(122);
            class158.method1038(var250, var248, (byte) -117, var249, var252, var251);
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 73) {
            int var253 = class161.field2902.method1254(32644);
            int var254 = class161.field2902.method1259(6385);
            int var255 = class161.field2902.method1247(-126);
            if (class86.method501(var254, -108)) {
                class163 var256 = (class163) class212.field3942.method1824((long) var255, 0);
                class163 var257 = (class163) class212.field3942.method1824((long) var253, 0);
                if (var257 != null) {
                    class17.method128(0, var256 == null || var256.field2929 != var257.field2929, var257);
                }
                if (var256 != null) {
                    var256.method349(0);
                    class212.field3942.method1825(var256, (byte) 64, (long) var253);
                }
                class43 var258 = class27.method186(1341, var255);
                if (var258 != null) {
                    class141.method844((byte) 74, var258);
                }
                class43 var259 = class27.method186(1341, var253);
                if (var259 != null) {
                    class141.method844((byte) -123, var259);
                    class18.method135(var259, 0, true);
                }
                if (class7.field138 != -1) {
                    class114.method692(1, class7.field138, 1);
                }
            }
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 70) {
            class263.method1755(-1, true);
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 103) {
            class155.field2794 = class161.field2902.method1265(116);
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 136) {
            int var260 = class161.field2902.method1259(6385);
            int var261 = class161.field2902.method1275(128);
            int var262 = class161.field2902.method1275(128);
            int var263 = class161.field2902.method1254(32644);
            if (class86.method501(var261, -42)) {
                class147.method945((var262 << 16) + var260, true, var263);
            }
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 112) {
            for (int var264 = 0; var264 < class6.field97.length; var264++) {
                if (class6.field97[var264] != null) {
                    class6.field97[var264].field4131 = -1;
                }
            }
            for (int var265 = 0; var265 < class259.field4648.length; var265++) {
                if (class259.field4648[var265] != null) {
                    class259.field4648[var265].field4131 = -1;
                }
            }
            class53.field1038 = -1;
            return true;
        } else if (class53.field1038 == 48) {
            if (class42.field708 == 0) {
                class33.field556 = class179.field3200;
            } else {
                class33.field556 = class161.field2902.method1270((byte) 108);
            }
            class53.field1038 = -1;
            return true;
        } else {
            if (!arg0) {
                field2096 = null;
            }
            if (class53.field1038 == 80) {
                class225.field4074 = class161.field2902.method1265(121);
                class190.field3496 = class161.field2902.method1265(123);
                class53.field1038 = -1;
                return true;
            } else if (class53.field1038 == 114) {
                int var266 = class161.field2902.method1265(120);
                int var267 = var266 >> 2;
                int var268 = var266 & 0x3;
                int var269 = class239.field4318[var267];
                int var270 = class161.field2902.method1269(107);
                int var271 = var270 >> 28 & 0x3;
                int var272 = (var270 & 0xFFFEFF8) >> 14;
                int var273 = var270 & 0x3FFF;
                int var274 = class161.field2902.method1259(6385);
                int var275 = var272 - class148.field2733;
                if (var274 == 65535) {
                    var274 = -1;
                }
                int var276 = var273 - class141.field2466;
                class9.method68(1, var271, var275, var267, var274, var276, var269, var268);
                class53.field1038 = -1;
                return true;
            } else if (class53.field1038 == 29) {
                int var277 = class161.field2902.method1254(32644);
                int var278 = class161.field2902.method1261(2);
                int var279 = class161.field2902.method1235(-29530);
                if (class86.method501(var279, 81)) {
                    class152.method1006(var277, -11335, var278);
                }
                class53.field1038 = -1;
                return true;
            } else if (class53.field1038 == 8) {
                int var280 = class161.field2902.method1259(6385);
                int var281 = class161.field2902.method1235(-29530);
                int var282 = class161.field2902.method1261(2);
                int var283 = class161.field2902.method1254(32644);
                if (var283 >> 30 != 0) {
                    int var292 = (var283 & 0x3A11244B) >> 28;
                    int var293 = ((var283 & 0xFFFC246) >> 14) - class148.field2733;
                    int var294 = (var283 & 0x3FFF) - class141.field2466;
                    if (var293 >= 0 && var294 >= 0 && var293 < 104 && var294 < 104) {
                        int var295 = var293 * 128 + 64;
                        int var296 = var294 * 128 + 64;
                        class24 var297 = new class24(var281, var292, var295, var296, class20.method140(var295, 85, var296, var292) - var280, var282, class146.field2635);
                        class59.field1139.method1290((byte) -44, new class62(var297));
                    }
                } else if (var283 >> 29 != 0) {
                    int var288 = var283 & 0xFFFF;
                    class187 var289 = class259.field4648[var288];
                    if (var289 != null) {
                        var289.field4132 = class146.field2635 + var282;
                        var289.field4175 = 0;
                        var289.field4152 = var280;
                        var289.field4119 = var281;
                        if (var289.field4119 == 65535) {
                            var289.field4119 = -1;
                        }
                        var289.field4107 = 0;
                        if (class146.field2635 < var289.field4132) {
                            var289.field4107 = -1;
                        }
                        if (var289.field4119 != -1 && class146.field2635 == var289.field4132) {
                            int var290 = class122.method742(-80, var289.field4119).field3090;
                            if (var290 != -1) {
                                class104 var291 = class164.method1081(var290, -21331);
                                if (var291 != null && var291.field1829 != null) {
                                    class274.method1805(var291, 0, var289.field4108, var289.field4178, false, (byte) -66);
                                }
                            }
                        }
                    }
                } else if ((var283 >> 28) != 0) {
                    int var284 = var283 & 0xFFFF;
                    class32 var285;
                    if (class134.field2352 == var284) {
                        var285 = class229.field4195;
                    } else {
                        var285 = class6.field97[var284];
                    }
                    if (var285 != null) {
                        var285.field4132 = class146.field2635 + var282;
                        var285.field4175 = 0;
                        var285.field4107 = 0;
                        var285.field4119 = var281;
                        if (var285.field4119 == 65535) {
                            var285.field4119 = -1;
                        }
                        if (var285.field4132 > class146.field2635) {
                            var285.field4107 = -1;
                        }
                        var285.field4152 = var280;
                        if (var285.field4119 != -1 && class146.field2635 == var285.field4132) {
                            int var286 = class122.method742(-62, var285.field4119).field3090;
                            if (var286 != -1) {
                                class104 var287 = class164.method1081(var286, -21331);
                                if (var287 != null && var287.field1829 != null) {
                                    class274.method1805(var287, 0, var285.field4108, var285.field4178, class229.field4195 == var285, (byte) -66);
                                }
                            }
                        }
                    }
                }
                class53.field1038 = -1;
                return true;
            } else if (class53.field1038 == 122) {
                class39.method252((byte) -124);
                class53.field1038 = -1;
                return false;
            } else if (class53.field1038 == 56) {
                class225.field4074 = class161.field2902.method1265(126);
                class190.field3496 = class161.field2902.method1265(114);
                while (class161.field2902.field3487 < class42.field708) {
                    class53.field1038 = class161.field2902.method1265(120);
                    class63.method360(101);
                }
                class53.field1038 = -1;
                return true;
            } else if (class53.field1038 == 238) {
                class111.method669((byte) 42);
                class53.field1038 = -1;
                return true;
            } else if (class53.field1038 == 132) {
                int var298 = class161.field2902.method1275(128);
                int var299 = class161.field2902.method1247(-128);
                class244.method1621(var298, (byte) 55, var299);
                class53.field1038 = -1;
                return true;
            } else if (class53.field1038 == 168) {
                class143 var300 = class161.field2902.method1270((byte) 108);
                int var301 = class161.field2902.method1235(-29530);
                int var302 = class161.field2902.method1261(2);
                if (class86.method501(var301, 72)) {
                    class74.method421(var300, var302, (byte) 13);
                }
                class53.field1038 = -1;
                return true;
            } else if (class53.field1038 == 242) {
                int var303 = class161.field2902.method1254(32644);
                int var304 = class161.field2902.method1235(-29530);
                int var305 = class161.field2902.method1231(65536);
                if (class86.method501(var304, 115)) {
                    class116.method712(false, var305, var303);
                }
                class53.field1038 = -1;
                return true;
            } else if (class53.field1038 == 92) {
                int var306 = class161.field2902.method1265(113);
                if (class161.field2902.method1265(118) == 0) {
                    class34.field594[var306] = new class171();
                } else {
                    class161.field2902.field3487--;
                    class34.field594[var306] = new class171(class161.field2902);
                }
                class70.field1338 = class13.field249;
                class53.field1038 = -1;
                return true;
            } else if (class53.field1038 == 7) {
                int var307 = class161.field2902.method1259(6385);
                int var308 = class161.field2902.method1259(6385);
                int var309 = class161.field2902.method1269(56);
                int var310 = class161.field2902.method1236(25215);
                if (class86.method501(var307, -65)) {
                    class163 var311 = (class163) class212.field3942.method1824((long) var309, 0);
                    if (var311 != null) {
                        class17.method128(0, var311.field2929 != var308, var311);
                    }
                    class106.method643(var309, var310, var308, (byte) -108);
                }
                class53.field1038 = -1;
                return true;
            } else if (class53.field1038 == 203) {
                class143 var312 = class161.field2902.method1270((byte) -116);
                int var313 = class161.field2902.method1275(128);
                int var314 = class161.field2902.method1275(128);
                if (class86.method501(var314, 123)) {
                    class74.method421(var312, var313, (byte) -3);
                }
                class53.field1038 = -1;
                return true;
            } else if (class53.field1038 == 26) {
                class269.method1783(true);
                class53.field1038 = -1;
                return true;
            } else if (class53.field1038 == 181) {
                int var315 = class161.field2902.method1247(-117);
                int var316 = class161.field2902.method1259(6385);
                int var317 = class161.field2902.method1259(6385);
                if (class86.method501(var316, 98)) {
                    class159.method1039(true, var315, var317);
                }
                class53.field1038 = -1;
                return true;
            } else if (class53.field1038 == 36) {
                int var318 = class161.field2902.method1269(118);
                int var319 = class161.field2902.method1275(128);
                class43 var320;
                if (var318 >= 0) {
                    var320 = class27.method186(1341, var318);
                } else {
                    var320 = null;
                }
                if (var320 != null) {
                    for (int var321 = 0; var321 < var320.field737.length; var321++) {
                        var320.field737[var321] = 0;
                        var320.field889[var321] = 0;
                    }
                }
                if (var318 < -70000) {
                    var319 += 32768;
                }
                class3.method9((byte) -31, var319);
                int var322 = class161.field2902.method1275(128);
                for (int var323 = 0; var323 < var322; var323++) {
                    int var324 = class161.field2902.method1235(-29530);
                    int var325 = class161.field2902.method1260((byte) 14);
                    if (var325 == 255) {
                        var325 = class161.field2902.method1266(125);
                    }
                    if (var320 != null && var320.field737.length > var323) {
                        var320.field737[var323] = var324;
                        var320.field889[var323] = var325;
                    }
                    class211.method1473(var323, var319, var325, var324 - 1, 0);
                }
                if (var320 != null) {
                    class141.method844((byte) 21, var320);
                }
                client.method1504(-127);
                class74.field1381[class129.method777(class192.field3525++, 31)] = class129.method777(32767, var319);
                class53.field1038 = -1;
                return true;
            } else if (class53.field1038 == 65) {
                class26.method181(-1, class161.field2902.method1270((byte) 82));
                class53.field1038 = -1;
                return true;
            } else if (class53.field1038 == 131) {
                int var326 = class161.field2902.method1275(128);
                int var327 = class161.field2902.method1235(-29530);
                class184.field3339 = var326;
                class75.field1402 = var327;
                class254.method1677(6620);
                class53.field1038 = -1;
                return true;
            } else if (class53.field1038 == 191) {
                int var328 = class161.field2902.method1266(118);
                class43 var329 = class27.method186(1341, var328);
                for (int var330 = 0; var330 < var329.field737.length; var330++) {
                    var329.field737[var330] = -1;
                    var329.field737[var330] = 0;
                }
                class141.method844((byte) -120, var329);
                class53.field1038 = -1;
                return true;
            } else if (class53.field1038 == 61) {
                int var331 = class161.field2902.method1269(69);
                int var332 = class161.field2902.method1247(-107);
                int var333 = class161.field2902.method1261(2);
                int var334 = class161.field2902.method1261(2);
                int var335 = class161.field2902.method1275(128);
                if (var335 == 65535) {
                    var335 = -1;
                }
                if (var333 == 65535) {
                    var333 = -1;
                }
                if (class86.method501(var334, 95)) {
                    for (int var336 = var335; var336 <= var333; var336++) {
                        long var337 = ((long) var331 << 32) + ((long) var336);
                        class61 var339 = class12.field228.method1824(var337, 0);
                        if (var339 != null) {
                            var339.method349(0);
                        }
                        class12.field228.method1825(new class3(var332), (byte) 64, var337);
                    }
                }
                class53.field1038 = -1;
                return true;
            } else if (class53.field1038 == 251) {
                int var340 = class161.field2902.method1275(128);
                class24.method170(1, var340);
                class74.field1381[class129.method777(31, class192.field3525++)] = class129.method777(32767, var340);
                class53.field1038 = -1;
                return true;
            } else if (class53.field1038 == 25) {
                class154.method1015(class161.field2902, -2, class42.field708, class4.field62);
                class53.field1038 = -1;
                return true;
            } else if (class53.field1038 == 223) {
                int var341 = class161.field2902.method1269(125);
                int var342 = class161.field2902.method1261(2);
                class207.method1444(var342, var341, -40);
                class53.field1038 = -1;
                return true;
            } else if (class53.field1038 == 116) {
                int var343 = class161.field2902.method1261(2);
                if (var343 == 65535) {
                    var343 = -1;
                }
                int var344 = class161.field2902.method1275(128);
                int var345 = class161.field2902.method1247(-113);
                int var346 = class161.field2902.method1254(32644);
                if (class86.method501(var344, 76)) {
                    class43 var347 = class27.method186(1341, var346);
                    if (var347.field786) {
                        class167.method1103(-157, var346, var345, var343);
                        class148 var349 = class262.method1743(var343, 17366);
                        class274.method1808(var349.field2668, var349.field2669, var346, var349.field2728, false);
                        class70.method404(var346, 26152, var349.field2732, var349.field2665, var349.field2676);
                    } else if (var343 == -1) {
                        class53.field1038 = -1;
                        var347.field785 = 0;
                        return true;
                    } else {
                        class148 var348 = class262.method1743(var343, 17366);
                        var347.field869 = var348.field2669 * 100 / var345;
                        var347.field854 = var348.field2668;
                        var347.field785 = 4;
                        var347.field755 = var343;
                        var347.field830 = var348.field2728;
                        class141.method844((byte) -123, var347);
                    }
                }
                class53.field1038 = -1;
                return true;
            } else if (class53.field1038 == 13) {
                byte[] var350 = new byte[class42.field708];
                class161.field2902.method805(18, class42.field708, 0, var350);
                class143 var351 = class224.method1539(0, class42.field708, -62, var350);
                if (class8.field155 == null && class81.field1473 == 3 || !class81.field1482.startsWith("win") || class254.field4561) {
                    class62.method355(var351, -65, true);
                } else {
                    class161.field2910 = true;
                    class245.field4393 = var351;
                    class16.field285 = class4.field62.method462(new String(var351.method889((byte) 6), "ISO-8859-1"), 0);
                }
                class53.field1038 = -1;
                return true;
            } else {
                class255.method1689(89, "T1 - " + class53.field1038 + "," + class70.field1341 + "," + class167.field2988 + " - " + class42.field708, (Throwable) null);
                class39.method252((byte) -33);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IB)I")
    public static final int method725(int arg0, byte arg1) {
        field2094++;
        if (arg1 != -18) {
            field2099 = null;
        }
        return (arg0 & 0x1DA0DC) >> 18;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BZ)V")
    public static final void method726(byte arg0, boolean arg1) {
        if (arg0 <= 96) {
            method727((class93) null, 25, 12, 67, -37, -53, 2, true);
        }
        field2097++;
        byte[][] var2 = class240.field4330;
        byte var3 = 4;
        for (int var4 = 0; var4 < var3; var4++) {
            class224.method1543((byte) -56);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    boolean var7 = false;
                    int var8 = class255.field4599[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg1 || var9 == 0) {
                            int var10 = (var8 & 0x7) >> 1;
                            int var11 = (var8 & 0xFFEE9A) >> 14;
                            int var12 = (var8 & 0x3FFD) >> 3;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class6.field88.length; var14++) {
                                if (class6.field88[var14] == var13 && var2[var14] != null) {
                                    var7 = true;
                                    class110.method664(var4, var5 * 8, var2[var14], class171.field3052, var9, (var12 & 0x7) * 8, true, (var11 & 0x7) * 8, var10, arg1, var6 * 8);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class120.method736(var6 * 8, 0, var5 * 8, var4, 8, 8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lsb;IIIIIIZ)V")
    public static final void method727(class93 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field1664.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field1664[var9] - class40.field682;
            int var23 = arg0.field1660[var9] - class266.field4782;
            int var24 = arg0.field1671[var9] - class264.field4751;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field1674 != null) {
                class93.field1670[var9] = var25;
                class93.field1679[var9] = var28;
                class93.field1681[var9] = var29;
            }
            class93.field1676[var9] = (var25 << 9) / var29 + class196.field3637;
            class93.field1663[var9] = (var28 << 9) / var29 + class196.field3631;
        }
        class196.field3632 = 0;
        int var10 = arg0.field1667.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field1667[var11];
            int var13 = arg0.field1678[var11];
            int var14 = arg0.field1669[var11];
            int var15 = class93.field1676[var12];
            int var16 = class93.field1676[var13];
            int var17 = class93.field1676[var14];
            int var18 = class93.field1663[var12];
            int var19 = class93.field1663[var13];
            int var20 = class93.field1663[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class133.field2328 && class189.method1227(class5.field65 + class196.field3637, class196.field3631 + class190.field3498, var18, var19, var20, var15, var16, var17)) {
                    class176.field3146 = arg5;
                    class7.field143 = arg6;
                }
                if (!arg7) {
                    class196.field3638 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class196.field3628 || var16 > class196.field3628 || var17 > class196.field3628) {
                        class196.field3638 = true;
                    }
                    if (arg0.field1674 == null || arg0.field1674[var11] == -1) {
                        if (arg0.field1672[var11] != 12345678) {
                            class196.method1369(var18, var19, var20, var15, var16, var17, arg0.field1672[var11], arg0.field1668[var11], arg0.field1666[var11]);
                        }
                    } else if (!class49.field966) {
                        int var21 = class196.field3636.method388(0, arg0.field1674[var11]);
                        class196.method1369(var18, var19, var20, var15, var16, var17, class285.method1870(var21, arg0.field1672[var11]), class285.method1870(var21, arg0.field1668[var11]), class285.method1870(var21, arg0.field1666[var11]));
                    } else if (arg0.field1662) {
                        class196.method1351(var18, var19, var20, var15, var16, var17, arg0.field1672[var11], arg0.field1668[var11], arg0.field1666[var11], class93.field1670[0], class93.field1670[1], class93.field1670[3], class93.field1679[0], class93.field1679[1], class93.field1679[3], class93.field1681[0], class93.field1681[1], class93.field1681[3], arg0.field1674[var11]);
                    } else {
                        class196.method1351(var18, var19, var20, var15, var16, var17, arg0.field1672[var11], arg0.field1668[var11], arg0.field1666[var11], class93.field1670[var12], class93.field1670[var13], class93.field1670[var14], class93.field1679[var12], class93.field1679[var13], class93.field1679[var14], class93.field1681[var12], class93.field1681[var13], class93.field1681[var14], arg0.field1674[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z[BLh;)V")
    public final void method728(boolean arg0, byte[] arg1, class190 arg2) {
        field2095++;
        if (arg2.field3465[arg2.field3487] != 31 || arg2.field3465[arg2.field3487 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2100 == null) {
            this.field2100 = new Inflater(true);
        }
        try {
            this.field2100.setInput(arg2.field3465, arg2.field3487 + 10, -8 - arg2.field3487 + -10 + arg2.field3465.length);
            if (arg0) {
                return;
            }
            this.field2100.inflate(arg1);
        } catch (Exception var4) {
            this.field2100.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field2100.reset();
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(III)V")
    private class118(int arg0, int arg1, int arg2) {
    }
}
