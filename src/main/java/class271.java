import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class271 extends InputStream {

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field4689 = 0;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Loh;")
    public static class258 field4696 = class153.method1046(" )2>", 127);

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Z")
    public static boolean field4699 = false;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Z")
    public static boolean field4697 = true;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    public static int field4700 = -1;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field4702 = 0;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "[[S")
    public static short[][] field4701;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILgb;)V", line = 4)
    public static final void method1909(int arg0, class213 arg1) {
        field4694++;
        class184.field3281 = class72.method535(class13.field170, (byte) -44, 0, arg1);
        class251.field4322 = new class129[class184.field3281.length];
        class168.field2844 = new class129[class184.field3281.length];
        class32.field385 = new class129[class184.field3281.length];
        for (int var2 = 0; var2 < class184.field3281.length; var2++) {
            class184.field3281[var2].method930();
            class251.field4322[var2] = class184.field3281[var2].method934();
            class184.field3281[var2].method930();
            class168.field2844[var2] = class184.field3281[var2].method934();
            class184.field3281[var2].method930();
            class32.field385[var2] = class184.field3281[var2].method934();
            class184.field3281[var2].method930();
        }
        class120.field2122 = class102.method776(arg1, 0, 55, class23.field295);
        class303.field5175 = class168.method1112(0, class110.field1933, arg1, 0);
        class239.field4170 = class168.method1112(0, class72.field1270, arg1, 0);
        class31.field372 = class168.method1112(0, class7.field96, arg1, 0);
        class281.field4839 = class168.method1112(0, class83.field1397, arg1, 0);
        class317.field5351 = class282.method1978(class139.field2376, arg1, 0, -17956);
        class249.field4296 = class282.method1978(class93.field1640, arg1, 0, -17956);
        class56.field887 = class19.method128(class130.field2296, arg1, 0, (byte) -106);
        class74.field1298 = class282.method1978(class231.field3995, arg1, 0, arg0 ^ 0xFFFFB9DC);
        class282.field4848 = class282.method1978(class86.field1465, arg1, 0, -17956);
        class250.field4311 = class15.method105(0, client.field619, arg1, arg0);
        class117.field2070 = class15.method105(0, class94.field1650, arg1, 0);
        class79.field1355.method253(class117.field2070, (int[]) null);
        class44.field662.method253(class117.field2070, (int[]) null);
        class123.field2180.method253(class117.field2070, (int[]) null);
        if (class257.field4390) {
            class9.field111 = class72.method535(class14.field178, (byte) -44, 0, arg1);
            for (int var3 = 0; var3 < class9.field111.length; var3++) {
                class9.field111[var3].method931();
            }
        }
        class41 var4 = class184.method1247(arg1, 0, (byte) 79, class235.field4055);
        var4.method324();
        if (class257.field4390) {
            class241.field4182 = new class221(var4);
        } else {
            class241.field4182 = var4;
        }
        class41[] var5 = class102.method776(arg1, 0, 125, class105.field1890);
        for (int var6 = 0; var6 < var5.length; var6++) {
            var5[var6].method324();
        }
        if (class257.field4390) {
            class44.field668 = new class65[var5.length];
            for (int var7 = 0; var7 < var5.length; var7++) {
                class44.field668[var7] = new class221(var5[var7]);
            }
        } else {
            class44.field668 = var5;
        }
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * 21.0D) - 10;
        int var11 = (int) (Math.random() * 41.0D) - 20;
        for (int var12 = 0; var12 < class120.field2122.length; var12++) {
            class120.field2122[var12].method328(var8 + var11, var9 - -var11, var10 + var11);
        }
        class184.field3281[0].method932(var8 + var11, var9 + var11, var10 + var11);
        if (class257.field4390) {
            class210.field3619 = new class65[class120.field2122.length];
            for (int var13 = 0; var13 < class120.field2122.length; var13++) {
                class210.field3619[var13] = new class221(class120.field2122[var13]);
            }
        } else {
            class210.field3619 = class120.field2122;
        }
    }

    @OriginalMember(owner = "client!a", name = "read", descriptor = "()I", line = 118)
    public final int read() {
        class237.method1628((byte) -88, 30000L);
        field4690++;
        return -1;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BLva;)Lcb;", line = 127)
    public static final class75 method1910(byte arg0, class235 arg1) {
        field4692++;
        if (arg0 != -84) {
            field4702 = -69;
        }
        return new class75(arg1.method1574(-37), arg1.method1574(-102), arg1.method1574(-80), arg1.method1574(-105), arg1.method1602(18160), arg1.method1589(68));
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIB)V", line = 150)
    public static final void method1911(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field4698++;
        if (class169.field2883 == 1) {
            class74.field1298[class180.field3219 / 100].method327(class260.field4524 - 8, class52.field837 - 8);
        }
        if (class169.field2883 == 2) {
            class74.field1298[class180.field3219 / 100 + 4].method327(class260.field4524 - 8, class52.field837 + -8);
        }
        if (arg4 == -56) {
            class50.method399((byte) 87);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)Z", line = 173)
    public static final boolean method1912(byte arg0) {
        field4693++;
        if (class50.field768) {
            try {
                class164.field2771.method1779((byte) 4, class297.field5086.field5061);
                return true;
            } catch (Throwable var2) {
            }
        }
        return arg0 > -57 ? false : false;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([Loh;[SI)V", line = 193)
    public static final void method1913(class258[] arg0, short[] arg1, int arg2) {
        field4688++;
        if (arg2 != 12640) {
            method1916((byte) -27);
        }
        class145.method996(arg0.length - 1, true, arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIZI)V", line = 212)
    public static final void method1914(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class193.field3410 = 0;
        field4691++;
        for (int var7 = -1; var7 < (class226.field3895 + class14.field177); var7++) {
            class58 var8;
            if (var7 == -1) {
                var8 = class152.field2606;
            } else if (var7 >= class14.field177) {
                var8 = class16.field214[class92.field1616[var7 - class14.field177]];
            } else {
                var8 = class38.field527[class140.field2390[var7]];
            }
            if (var8 != null && var8.method453((byte) -67)) {
                if (var8 instanceof class107) {
                    class151 var9 = ((class107) var8).field1906;
                    if (var9.field2545 != null) {
                        var9 = var9.method1035(-6941);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (var7 >= class14.field177) {
                    class151 var10 = ((class107) var8).field1906;
                    if (var10.field2545 != null) {
                        var10 = var10.method1035(-6941);
                    }
                    if (var10.field2594 >= 0 && class281.field4839.length > var10.field2594) {
                        int var11;
                        if (var10.field2567 == -1) {
                            var11 = var8.method452(32767) + 15;
                        } else {
                            var11 = var10.field2567 + 15;
                        }
                        class34.method240(arg2, arg3, -5415, var11, var8, arg4 >> 1, arg0 >> 1);
                        if (class294.field5055 > -1) {
                            class281.field4839[var10.field2594].method327(class294.field5055 + arg1 - 12, arg6 - -class73.field1287 - 30);
                        }
                    }
                    int var12 = 0;
                    class149[] var13 = class76.field1320;
                    while (var13.length > var12) {
                        class149 var14 = var13[var12];
                        if (var14 != null && var14.field2524 == 1 && class92.field1616[var7 - class14.field177] == var14.field2532 && class202.field3498 % 20 < 10) {
                            int var15;
                            if (var10.field2567 == -1) {
                                var15 = var8.method452(32767) + 15;
                            } else {
                                var15 = var10.field2567 + 15;
                            }
                            class34.method240(arg2, arg3, -5415, var15, var8, arg4 >> 1, arg0 >> 1);
                            if (class294.field5055 > -1) {
                                class317.field5351[var14.field2535].method327(class294.field5055 + arg1 - 12, class73.field1287 + arg6 + -28);
                            }
                        }
                        var12++;
                    }
                } else {
                    int var16 = 30;
                    class231 var17 = (class231) var8;
                    if (var17.field3982 != -1 || var17.field3987 != -1) {
                        class34.method240(arg2, arg3, -5415, var8.method452(32767) + 15, var8, arg4 >> 1, arg0 >> 1);
                        if (class294.field5055 > -1) {
                            if (var17.field3982 != -1) {
                                class31.field372[var17.field3982].method327(class294.field5055 + arg1 - 12, -var16 + arg6 + class73.field1287);
                                var16 += 25;
                            }
                            if (var17.field3987 != -1) {
                                class281.field4839[var17.field3987].method327(class294.field5055 + arg1 - 12, -var16 + arg6 - -class73.field1287);
                                var16 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        int var18 = 0;
                        class149[] var19 = class76.field1320;
                        while (var19.length > var18) {
                            class149 var20 = var19[var18];
                            if (var20 != null && var20.field2524 == 10 && class140.field2390[var7] == var20.field2532) {
                                class34.method240(arg2, arg3, -5415, var8.method452(32767) + 15, var8, arg4 >> 1, arg0 >> 1);
                                if (class294.field5055 > -1) {
                                    class317.field5351[var20.field2535].method327(arg1 + class294.field5055 - 12, -var16 + class73.field1287 + arg6);
                                }
                            }
                            var18++;
                        }
                    }
                }
                if (var8.field944 != null && (var7 >= class14.field177 || class190.field3360 == 0 || class190.field3360 == 3 || class190.field3360 == 1 && class4.method24(((class231) var8).field4007, 0))) {
                    class34.method240(arg2, arg3, -5415, var8.method452(32767), var8, arg4 >> 1, arg0 >> 1);
                    if (class294.field5055 > -1 && class193.field3410 < class37.field493) {
                        class37.field488[class193.field3410] = class123.field2180.method252(var8.field944) / 2;
                        class37.field490[class193.field3410] = class123.field2180.field418;
                        class37.field485[class193.field3410] = class294.field5055;
                        class37.field489[class193.field3410] = class73.field1287;
                        class37.field495[class193.field3410] = var8.field962;
                        class37.field486[class193.field3410] = var8.field977;
                        class37.field492[class193.field3410] = var8.field972;
                        class37.field491[class193.field3410] = var8.field944;
                        class193.field3410++;
                    }
                }
                if (class202.field3498 < var8.field936) {
                    class65 var21 = class239.field4170[1];
                    class65 var22 = class239.field4170[0];
                    int var26;
                    if (var8 instanceof class107) {
                        class107 var23 = (class107) var8;
                        class65[] var24 = (class65[]) ((class65[]) class290.field5001.method1159((byte) 125, (long) var23.field1906.field2554));
                        if (var24 == null) {
                            var24 = class168.method1112(0, var23.field1906.field2554, class34.field395, 0);
                            if (var24 != null) {
                                class290.field5001.method1163(var24, -1, (long) var23.field1906.field2554);
                            }
                        }
                        if (var24 != null && var24.length == 2) {
                            var22 = var24[0];
                            var21 = var24[1];
                        }
                        class151 var25 = var23.field1906;
                        if (var25.field2567 == -1) {
                            var26 = var8.method452(32767);
                        } else {
                            var26 = var25.field2567;
                        }
                    } else {
                        var26 = var8.method452(32767);
                    }
                    class34.method240(arg2, arg3, -5415, var26 + var22.field1148 + 10, var8, arg4 >> 1, arg0 >> 1);
                    if (class294.field5055 > -1) {
                        int var27 = class294.field5055 + arg1 - (var22.field1141 >> 1);
                        int var28 = class73.field1287 + arg6 - 3;
                        var22.method327(var27, var28);
                        int var29 = var8.field913 * var22.field1141 / 255;
                        int var30 = var22.field1148;
                        if (class257.field4390) {
                            class296.method2086(var27, var28, var27 + var29, var28 + var30);
                        } else {
                            class211.method1394(var27, var28, var27 + var29, var28 - -var30);
                        }
                        var21.method327(var27, var28);
                        if (class257.field4390) {
                            class296.method2085(arg1, arg6, arg1 + arg0, arg4 + arg6);
                        } else {
                            class211.method1414(arg1, arg6, arg0 + arg1, arg6 - -arg4);
                        }
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (class202.field3498 < var8.field914[var31]) {
                        int var34;
                        if (var8 instanceof class107) {
                            class107 var32 = (class107) var8;
                            class151 var33 = var32.field1906;
                            if (var33.field2567 == -1) {
                                var34 = var8.method452(32767) / 2;
                            } else {
                                var34 = var33.field2567 / 2;
                            }
                        } else {
                            var34 = var8.method452(32767) / 2;
                        }
                        class34.method240(arg2, arg3, -5415, var34, var8, arg4 >> 1, arg0 >> 1);
                        if (class294.field5055 > -1) {
                            if (var31 == 1) {
                                class73.field1287 -= 20;
                            }
                            if (var31 == 2) {
                                class73.field1287 -= 10;
                                class294.field5055 -= 15;
                            }
                            if (var31 == 3) {
                                class294.field5055 += 15;
                                class73.field1287 -= 10;
                            }
                            class303.field5175[var8.field940[var31]].method327(arg1 + class294.field5055 - 12, arg6 - (-class73.field1287 + 12));
                            class79.field1355.method260(class218.method1481(-42, var8.field956[var31]), class294.field5055 + arg1 - 1, class73.field1287 + arg6 - -3, 16777215, 0);
                        }
                    }
                }
            }
        }
        int var35 = 0;
        if (arg5) {
            field4701 = (short[][]) ((short[][]) null);
        }
        while (class193.field3410 > var35) {
            int var36 = class37.field489[var35];
            int var37 = class37.field485[var35];
            int var38 = class37.field488[var35];
            int var39 = class37.field490[var35];
            boolean var40 = true;
            while (var40) {
                var40 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if (class37.field489[var41] - class37.field490[var41] < var36 - -2 && (var36 - var39) < (class37.field489[var41] + 2) && (var37 - var38) < (class37.field488[var41] + class37.field485[var41]) && class37.field485[var41] - class37.field488[var41] < var37 + var38 && var36 > (class37.field489[var41] - class37.field490[var41])) {
                        var40 = true;
                        var36 = class37.field489[var41] - class37.field490[var41];
                    }
                }
            }
            class294.field5055 = class37.field485[var35];
            class73.field1287 = class37.field489[var35] = var36;
            class258 var42 = class37.field491[var35];
            if (class122.field2152 == 0) {
                int var43 = 16776960;
                if (class37.field495[var35] < 6) {
                    var43 = class189.field3343[class37.field495[var35]];
                }
                if (class37.field495[var35] == 6) {
                    var43 = (class61.field1035 % 20) >= 10 ? 16776960 : 16711680;
                }
                if (class37.field495[var35] == 7) {
                    var43 = class61.field1035 % 20 < 10 ? 255 : 65535;
                }
                if (class37.field495[var35] == 8) {
                    var43 = class61.field1035 % 20 < 10 ? 45056 : 8454016;
                }
                if (class37.field495[var35] == 9) {
                    int var44 = 150 - class37.field492[var35];
                    if (var44 < 50) {
                        var43 = (var44 * 1280) + 16711680;
                    } else if (var44 < 100) {
                        var43 = 16776960 - (var44 * 327680 - 16384000);
                    } else if (var44 < 150) {
                        var43 = (var44 - 100) * 5 + 65280;
                    }
                }
                if (class37.field495[var35] == 10) {
                    int var45 = 150 - class37.field492[var35];
                    if (var45 < 50) {
                        var43 = var45 * 5 + 16711680;
                    } else if (var45 < 100) {
                        var43 = 16711935 - ((var45 - 50) * 327680);
                    } else if (var45 < 150) {
                        var43 = (var45 - 100) * 327680 + 255 - ((var45 - 100) * 5);
                    }
                }
                if (class37.field495[var35] == 11) {
                    int var46 = 150 - class37.field492[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - (var46 * 327685);
                    } else if (var46 < 100) {
                        var43 = (var46 - 50) * 327685 + 65280;
                    } else if (var46 < 150) {
                        var43 = 16777215 - (var46 - 100) * 327680;
                    }
                }
                if (class37.field486[var35] == 0) {
                    class123.field2180.method260(var42, class294.field5055 + arg1, arg6 - -class73.field1287, var43, 0);
                }
                if (class37.field486[var35] == 1) {
                    class123.field2180.method251(var42, class294.field5055 + arg1, class73.field1287 + arg6, var43, 0, class61.field1035);
                }
                if (class37.field486[var35] == 2) {
                    class123.field2180.method249(var42, arg1 + class294.field5055, arg6 - -class73.field1287, var43, 0, class61.field1035);
                }
                if (class37.field486[var35] == 3) {
                    class123.field2180.method264(var42, class294.field5055 + arg1, class73.field1287 + arg6, var43, 0, class61.field1035, 150 - class37.field492[var35]);
                }
                if (class37.field486[var35] == 4) {
                    int var47 = (150 - class37.field492[var35]) * (class123.field2180.method252(var42) + 100) / 150;
                    if (class257.field4390) {
                        class296.method2086(class294.field5055 + arg1 - 50, arg6, class294.field5055 + arg1 + 50, arg4 + arg6);
                    } else {
                        class211.method1394(class294.field5055 + arg1 - 50, arg6, class294.field5055 + arg1 + 50, arg4 + arg6);
                    }
                    class123.field2180.method268(var42, arg1 + class294.field5055 + 50 - var47, class73.field1287 + arg6, var43, 0);
                    if (class257.field4390) {
                        class296.method2085(arg1, arg6, arg0 + arg1, arg6 - -arg4);
                    } else {
                        class211.method1414(arg1, arg6, arg0 + arg1, arg6 - -arg4);
                    }
                }
                if (class37.field486[var35] == 5) {
                    int var48 = 0;
                    int var49 = 150 - class37.field492[var35];
                    if (class257.field4390) {
                        class296.method2086(arg1, class73.field1287 + arg6 - class123.field2180.field418 - 1, arg0 + arg1, class73.field1287 + arg6 + 5);
                    } else {
                        class211.method1394(arg1, arg6 + class73.field1287 - class123.field2180.field418 - 1, arg1 - -arg0, arg6 + class73.field1287 + 5);
                    }
                    if (var49 < 25) {
                        var48 = var49 - 25;
                    } else if (var49 > 125) {
                        var48 = var49 - 125;
                    }
                    class123.field2180.method260(var42, class294.field5055 + arg1, class73.field1287 + arg6 - -var48, var43, 0);
                    if (class257.field4390) {
                        class296.method2085(arg1, arg6, arg1 + arg0, arg6 - -arg4);
                    } else {
                        class211.method1414(arg1, arg6, arg1 + arg0, arg4 + arg6);
                    }
                }
            } else {
                class123.field2180.method260(var42, class294.field5055 + arg1, class73.field1287 + arg6, 16776960, 0);
            }
            var35++;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V", line = 693)
    public static final void method1915(int arg0, int arg1) {
        if (arg1 != -10948) {
            method1914(14, -112, -15, 118, -102, true, -8);
        }
        field4695++;
        if (class191.field3378 == arg0 && arg0 != 0) {
            class223 var2 = class258.field4469[arg0];
            var2.method426(class264.field4595);
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(B)V", line = 727)
    public static void method1916(byte arg0) {
        field4701 = (short[][]) null;
        field4696 = null;
        if (arg0 != 30) {
            method1912((byte) -68);
        }
    }
}
