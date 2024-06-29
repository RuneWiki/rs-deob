import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class58 extends class41 {

    @OriginalMember(owner = "client!ib", name = "W", descriptor = "[Lob;")
    public static class99[] field1437 = new class99[4];

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "Lu;")
    private static class135 field1425 = class87.method676((byte) -48, "scroll:");

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "Lu;")
    public static class135 field1417 = class87.method676((byte) -70, "Lade Spiel)2Fenster )2 ");

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "Lu;")
    public static class135 field1416 = field1425;

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
    public static int field1418 = 0;

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "Lu;")
    private static class135 field1421 = class87.method676((byte) -120, " more options");

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "Lu;")
    public static class135 field1424 = field1421;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "Lu;")
    private static class135 field1414 = class87.method676((byte) -51, "Username: ");

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "Lu;")
    public static class135 field1422 = field1425;

    @OriginalMember(owner = "client!ib", name = "T", descriptor = "Lu;")
    public static class135 field1434 = class87.method676((byte) -42, "und haben es deaktiviert)3 Klicken Sie auf der");

    @OriginalMember(owner = "client!ib", name = "X", descriptor = "Lu;")
    private static class135 field1438 = class87.method676((byte) -65, "Password: ");

    @OriginalMember(owner = "client!ib", name = "bb", descriptor = "Lu;")
    public static class135 field1442 = field1414;

    @OriginalMember(owner = "client!ib", name = "Z", descriptor = "Lu;")
    public static class135 field1440 = field1438;

    @OriginalMember(owner = "client!ib", name = "db", descriptor = "Lu;")
    private static class135 field1444 = class87.method676((byte) -119, "OFF");

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "Lu;")
    public static class135 field1413 = field1444;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
    public int field1412;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "I")
    public int field1415;

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
    public int field1420;

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
    public int field1423;

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "I")
    public int field1426;

    @OriginalMember(owner = "client!ib", name = "O", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "I")
    public int field1432;

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "I")
    public int field1433;

    @OriginalMember(owner = "client!ib", name = "ab", descriptor = "I")
    public int field1441;

    @OriginalMember(owner = "client!ib", name = "cb", descriptor = "I")
    public int field1443;

    @OriginalMember(owner = "client!ib", name = "eb", descriptor = "I")
    public int field1445;

    @OriginalMember(owner = "client!ib", name = "U", descriptor = "Lpe;")
    public static class109 field1435;

    @OriginalMember(owner = "client!ib", name = "Y", descriptor = "Lrb;")
    public class119 field1439;

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "Lre;")
    public static class122 field1428;

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "Lnb;")
    public class92 field1427;

    @OriginalMember(owner = "client!ib", name = "V", descriptor = "Lnb;")
    public class92 field1436;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "[I")
    public int[] field1411;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(II)I")
    public static final int method439(int arg0, int arg1) {
        if (arg0 != 7) {
            method439(-125, 109);
        }
        field1430++;
        return arg1 >> 17 & 0x7;
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
    public final void method440(int arg0) {
        if (arg0 != -5) {
            return;
        }
        int var2 = this.field1426;
        class119 var3 = this.field1439.method946(0);
        if (var3 == null) {
            this.field1412 = 0;
            this.field1411 = null;
            this.field1415 = 0;
            this.field1423 = 0;
            this.field1426 = -1;
        } else {
            this.field1426 = var3.field2880;
            this.field1415 = var3.field2883;
            this.field1412 = var3.field2858;
            this.field1411 = var3.field2826;
            this.field1423 = var3.field2870 * 128;
        }
        if (this.field1426 != var2 && this.field1436 != null) {
            class65.field1645.method1182(this.field1436);
            this.field1436 = null;
        }
        field1419++;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lhf;IIII)V")
    public static final void method441(class55 arg0, int arg1, int arg2, int arg3, int arg4) {
        field1431++;
        if (arg1 != 15098) {
            method442(-125);
        }
        if (class131.field3135 >= 400) {
            return;
        }
        if (arg0.field1302 != null) {
            arg0 = arg0.method418(0);
        }
        if (arg0 == null || !arg0.field1330) {
            return;
        }
        class135 var5 = arg0.field1322;
        if (arg0.field1299 != 0) {
            var5 = class107.method867(arg1 - 15096, new class135[] { var5, class126.method981((byte) 113, arg0.field1299, class116.field2789.field3523), class40.field928, class20.field471, class68.method547(arg1 ^ 0xFFFFC505, arg0.field1299), class75.field1776 });
        }
        if (class47.field1125 == 1) {
            class76.field1794++;
            class95.method785(arg2, (byte) -99, arg4, class107.method867(2, new class135[] { class141.field3433, class25.field606, var5 }), class108.field2607, arg3, 9);
        } else if (!class8.field143) {
            class135[] var6 = arg0.field1308;
            class20.field478++;
            if (class1.field21) {
                var6 = class17.method114((byte) -111, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method1069(90, class82.field1960)) {
                        class3.field77++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 39;
                        }
                        if (var7 == 1) {
                            var8 = 5;
                        }
                        if (var7 == 2) {
                            var8 = 7;
                        }
                        if (var7 == 3) {
                            var8 = 12;
                        }
                        if (var7 == 4) {
                            var8 = 4;
                        }
                        class95.method785(arg2, (byte) -99, arg4, class107.method867(2, new class135[] { class25.field620, var5 }), var6[var7], arg3, var8);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method1069(arg1 ^ 0x3AA0, class82.field1960)) {
                        class125.field2983++;
                        short var10 = 0;
                        if (class116.field2789.field3523 < arg0.field1299) {
                            var10 = 2000;
                        }
                        int var11 = 0;
                        if (var9 == 0) {
                            var11 = var10 + 39;
                        }
                        if (var9 == 1) {
                            var11 = var10 + 5;
                        }
                        if (var9 == 2) {
                            var11 = var10 + 7;
                        }
                        if (var9 == 3) {
                            var11 = var10 + 12;
                        }
                        if (var9 == 4) {
                            var11 = var10 + 4;
                        }
                        class95.method785(arg2, (byte) -99, arg4, class107.method867(2, new class135[] { class25.field620, var5 }), var6[var9], arg3, var11);
                    }
                }
            }
            class95.method785(arg2, (byte) -99, arg4, class107.method867(2, new class135[] { class25.field620, var5 }), class2.field67, arg3, 1006);
        } else if ((class79.field1887 & 0x2) == 2) {
            class95.method785(arg2, (byte) -99, arg4, class107.method867(2, new class135[] { class4.field102, class25.field606, var5 }), class30.field741, arg3, 43);
            class82.field1957++;
        }
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
    public static void method442(int arg0) {
        field1425 = null;
        field1438 = null;
        field1440 = null;
        field1424 = null;
        field1428 = null;
        field1422 = null;
        field1442 = null;
        field1417 = null;
        field1416 = null;
        field1413 = null;
        field1421 = null;
        field1434 = null;
        if (arg0 <= 21) {
            field1442 = null;
        }
        field1435 = null;
        field1437 = null;
        field1414 = null;
        field1444 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)Z")
    public static final boolean method443(boolean arg0) {
        field1429++;
        if (!arg0) {
            field1444 = null;
        }
        long var1 = class14.method95(3);
        int var3 = (int) (var1 - class40.field931);
        if (var3 > 200) {
            var3 = 200;
        }
        class135.field3244 += var3;
        class40.field931 = var1;
        if (class21.field488 == 0 && class14.field351 == 0 && class82.field1923 == 0 && class83.field1975 == 0) {
            return true;
        } else if (class8.field153 == null) {
            return false;
        } else {
            try {
                if (class135.field3244 > 30000) {
                    throw new IOException();
                }
                while (class14.field351 < 20 && class83.field1975 > 0) {
                    class128 var4 = (class128) class41.field960.method840(-1);
                    class59 var5 = new class59(4);
                    var5.method452(1, 255);
                    var5.method478(true, (int) var4.field951);
                    class8.field153.method870(4, 0, 0, var5.field1495);
                    class39.field895.method836(var4.field951, (byte) 112, var4);
                    class14.field351++;
                    class83.field1975--;
                }
                while (class21.field488 < 20 && class82.field1923 > 0) {
                    class128 var6 = (class128) class100.field2408.method820(96);
                    class59 var7 = new class59(4);
                    var7.method452(0, 255);
                    var7.method478(true, (int) var6.field951);
                    class8.field153.method870(4, 0, 0, var7.field1495);
                    var6.method921(2001);
                    class30.field716.method836(var6.field951, (byte) 78, var6);
                    class82.field1923--;
                    class21.field488++;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class8.field153.method877(127);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    byte var10 = 0;
                    if (class65.field1598 == null) {
                        var10 = 8;
                    } else if (class90.field2112 == 0) {
                        var10 = 1;
                    }
                    class135.field3244 = 0;
                    if (var10 <= 0) {
                        int var11 = 512 - class90.field2112;
                        int var12 = class41.field961.field1495.length - class65.field1598.field3079;
                        if (var12 - class41.field961.field1485 < var11) {
                            var11 = var12 - class41.field961.field1485;
                        }
                        if (var11 > var9) {
                            var11 = var9;
                        }
                        class8.field153.method872((byte) -98, class41.field961.field1495, var11, class41.field961.field1485);
                        if (class57.field1403 != 0) {
                            for (int var13 = 0; var13 < var11; var13++) {
                                class41.field961.field1495[class41.field961.field1485 + var13] = (byte) class34.method268(class41.field961.field1495[class41.field961.field1485 + var13], class57.field1403);
                            }
                        }
                        class41.field961.field1485 += var11;
                        class90.field2112 += var11;
                        if (class41.field961.field1485 == var12) {
                            if (class65.field1598.field951 == 16711935L) {
                                class135.field3285 = class41.field961;
                                for (int var14 = 0; var14 < 256; var14++) {
                                    class109 var15 = class79.field1886[var14];
                                    if (var15 != null) {
                                        class135.field3285.field1485 = var14 * 8 + 5;
                                        int var16 = class135.field3285.method498((byte) -24);
                                        int var17 = class135.field3285.method498((byte) 126);
                                        var15.method887(var17, 16422, var16);
                                    }
                                }
                            } else {
                                class52.field1237.reset();
                                class52.field1237.update(class41.field961.field1495, 0, var12);
                                int var18 = (int) class52.field1237.getValue();
                                if (class65.field1598.field3084 != var18) {
                                    try {
                                        class8.field153.method874((byte) -92);
                                    } catch (Exception var30) {
                                    }
                                    class55.field1298++;
                                    class57.field1403 = (byte) (Math.random() * 255.0D + 1.0D);
                                    class8.field153 = null;
                                    return false;
                                }
                                class55.field1298 = 0;
                                class35.field823 = 0;
                                class65.field1598.field3080.method881(-1, class23.field554, class41.field961.field1495, (int) (class65.field1598.field951 & 0xFFFFL), (class65.field1598.field951 & 0xFF0000L) == 16711680L);
                            }
                            class65.field1598.method302(4071);
                            class90.field2112 = 0;
                            class41.field961 = null;
                            if (class23.field554) {
                                class14.field351--;
                            } else {
                                class21.field488--;
                            }
                            class65.field1598 = null;
                        } else {
                            if (class90.field2112 != 512) {
                                break;
                            }
                            class90.field2112 = 0;
                        }
                    } else {
                        int var19 = var10 - class55.field1321.field1485;
                        if (var9 < var19) {
                            var19 = var9;
                        }
                        class8.field153.method872((byte) -95, class55.field1321.field1495, var19, class55.field1321.field1485);
                        if (class57.field1403 != 0) {
                            for (int var20 = 0; var20 < var19; var20++) {
                                class55.field1321.field1495[class55.field1321.field1485 + var20] = (byte) class34.method268(class55.field1321.field1495[class55.field1321.field1485 + var20], class57.field1403);
                            }
                        }
                        class55.field1321.field1485 += var19;
                        if (var10 > class55.field1321.field1485) {
                            break;
                        }
                        if (class65.field1598 == null) {
                            class55.field1321.field1485 = 0;
                            int var21 = class55.field1321.method480(0);
                            int var22 = class55.field1321.method483((byte) 24);
                            int var23 = class55.field1321.method480(0);
                            long var24 = (long) ((var21 << 16) + var22);
                            int var26 = class55.field1321.method498((byte) 122);
                            class128 var27 = (class128) class39.field895.method842(var24, 123);
                            class23.field554 = true;
                            if (var27 == null) {
                                var27 = (class128) class30.field716.method842(var24, 124);
                                class23.field554 = false;
                            }
                            if (var27 == null) {
                                throw new IOException();
                            }
                            int var28 = var23 == 0 ? 5 : 9;
                            class65.field1598 = var27;
                            class41.field961 = new class59(var26 + var28 + class65.field1598.field3079);
                            class41.field961.method452(var23, 255);
                            class41.field961.method463(56, var26);
                            class55.field1321.field1485 = 0;
                            class90.field2112 = 8;
                        } else if (class90.field2112 == 0) {
                            if (class55.field1321.field1495[0] == -1) {
                                class90.field2112 = 1;
                                class55.field1321.field1485 = 0;
                            } else {
                                class65.field1598 = null;
                            }
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    class8.field153.method874((byte) -101);
                } catch (Exception var29) {
                }
                class35.field823++;
                class8.field153 = null;
                return false;
            }
        }
    }
}
