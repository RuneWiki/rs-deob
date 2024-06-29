import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class44 implements Runnable {

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "Z")
    public boolean field1045 = true;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "Ljava/lang/Object;")
    public Object field1054 = new Object();

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
    public int field1056 = 0;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "[I")
    public int[] field1060 = new int[500];

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "[I")
    public int[] field1062 = new int[500];

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "Lod;")
    public static class101 field1041 = class46.method335(-73, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field1044 = 2;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "[Lbf;")
    public static class14[] field1043 = new class14[50];

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "[I")
    public static int[] field1053 = new int[128];

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static int field1048 = 0;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "Lod;")
    public static class101 field1051 = class46.method335(123, "Sichtbare Karte vorbereitet)3");

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "Lod;")
    public static class101 field1052 = class46.method335(98, "http:)4)4");

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
    public static int field1059 = 1;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "Lpb;")
    public static class106 field1049;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "Lc;")
    public static class15 field1047;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "[Lqe;")
    public static class116[] field1057;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIII)V")
    public static final void method321(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class15.field328 = 0;
        for (int var5 = -1; var5 < class40.field959 + class150.field3442; var5++) {
            class57 var21;
            if (var5 == -1) {
                var21 = class82.field1778;
            } else if (class150.field3442 <= var5) {
                var21 = class18.field376[class73.field1586[var5 - class150.field3442]];
            } else {
                var21 = class94.field2032[class143.field3285[var5]];
            }
            if (var21 != null && var21.method95(-21094)) {
                if (var21 instanceof class62) {
                    class115 var22 = ((class62) var21).field1374;
                    if (var22.field2555 != null) {
                        var22 = var22.method879((byte) 82);
                    }
                    if (var22 == null) {
                        continue;
                    }
                }
                if (class150.field3442 <= var5) {
                    class115 var23 = ((class62) var21).field1374;
                    if (var23.field2555 != null) {
                        var23 = var23.method879((byte) 110);
                    }
                    if (var23.field2536 >= 0 && class46.field1086.length > var23.field2536) {
                        class27.method218(var21, var21.field1316 + 15, -60);
                        if (class121.field2678 > -1) {
                            class46.field1086[var23.field2536].method937(class121.field2678 + arg2 - 12, arg4 + -30 + class150.field3437);
                        }
                    }
                    if (class31.field801 == 1 && class73.field1586[var5 - class150.field3442] == class7.field97 && class143.field3305 % 20 < 10) {
                        class27.method218(var21, var21.field1316 + 15, -97);
                        if (class121.field2678 > -1) {
                            class154.field3507[0].method937(class121.field2678 + arg2 - 12, arg4 + -28 + class150.field3437);
                        }
                    }
                } else {
                    int var24 = 30;
                    class13 var25 = (class13) var21;
                    if (var25.field266 != -1 || var25.field262 != -1) {
                        class27.method218(var21, var21.field1316 + 15, -97);
                        if (class121.field2678 > -1) {
                            if (var25.field266 != -1) {
                                class36.field919[var25.field266].method937(class121.field2678 + arg2 - 12, class150.field3437 + arg4 + -var24);
                                var24 += 25;
                            }
                            if (var25.field262 != -1) {
                                class46.field1086[var25.field262].method937(arg2 + class121.field2678 - 12, class150.field3437 + arg4 + -var24);
                                var24 += 25;
                            }
                        }
                    }
                    if (var5 >= 0 && class31.field801 == 10 && class143.field3285[var5] == class142.field3272) {
                        class27.method218(var21, var21.field1316 + 15, -60);
                        if (class121.field2678 > -1) {
                            class154.field3507[1].method937(class121.field2678 + arg2 - 12, class150.field3437 + arg4 + -var24);
                        }
                    }
                }
                if (var21.field1305 != null && (class150.field3442 <= var5 || class79.field1660 == 0 || class79.field1660 == 3 || class79.field1660 == 1 && class154.method1191(68, ((class13) var21).field276))) {
                    class27.method218(var21, var21.field1316, -125);
                    if (class121.field2678 > -1 && class15.field328 < class42.field1012) {
                        class42.field1014[class15.field328] = class34.field867.method866(var21.field1305) / 2;
                        class42.field1018[class15.field328] = class34.field867.field2505;
                        class42.field1003[class15.field328] = class121.field2678;
                        class42.field1019[class15.field328] = class150.field3437;
                        class42.field1002[class15.field328] = var21.field1328;
                        class42.field1006[class15.field328] = var21.field1347;
                        class42.field1010[class15.field328] = var21.field1282;
                        class42.field1001[class15.field328] = var21.field1305;
                        class15.field328++;
                    }
                }
                if (var21.field1281 > class143.field3305) {
                    class27.method218(var21, var21.field1316 + 15, -48);
                    if (class121.field2678 > -1) {
                        int var26 = var21.field1304 * 30 / var21.field1345;
                        if (var26 > 30) {
                            var26 = 30;
                        }
                        class38.method275(class121.field2678 + arg2 - 15, class150.field3437 - 3 + arg4, var26, 5, 65280);
                        class38.method275(class121.field2678 + arg2 + var26 - 15, arg4 - (-class150.field3437 + 3), 30 - var26, 5, 16711680);
                    }
                }
                for (int var27 = 0; var27 < 4; var27++) {
                    if (var21.field1285[var27] > class143.field3305) {
                        class27.method218(var21, var21.field1316 / 2, -78);
                        if (class121.field2678 > -1) {
                            if (var27 == 1) {
                                class150.field3437 -= 20;
                            }
                            if (var27 == 2) {
                                class121.field2678 -= 15;
                                class150.field3437 -= 10;
                            }
                            if (var27 == 3) {
                                class121.field2678 += 15;
                                class150.field3437 -= 10;
                            }
                            class94.field2031[var21.field1323[var27]].method937(class121.field2678 + arg2 - 12, arg4 + -12 + class150.field3437);
                            class118.field2612.method850(class82.method592(false, var21.field1299[var27]), arg2 + class121.field2678 - 1, arg4 - -class150.field3437 - -3, 16777215, 0);
                        }
                    }
                }
            }
        }
        field1055++;
        int var6 = 0;
        if (arg1 != 5) {
            field1043 = null;
        }
        while (class15.field328 > var6) {
            int var7 = class42.field1003[var6];
            int var8 = class42.field1014[var6];
            int var9 = class42.field1019[var6];
            int var10 = class42.field1018[var6];
            boolean var11 = true;
            while (var11) {
                var11 = false;
                for (int var20 = 0; var20 < var6; var20++) {
                    if (var9 + 2 > class42.field1019[var20] + -class42.field1018[var20] && class42.field1019[var20] + 2 > -var10 + var9 && var7 - var8 < class42.field1014[var20] + class42.field1003[var20] && var7 + var8 > class42.field1003[var20] + -class42.field1014[var20] && var9 > class42.field1019[var20] - class42.field1018[var20]) {
                        var9 = class42.field1019[var20] - class42.field1018[var20];
                        var11 = true;
                    }
                }
            }
            class121.field2678 = class42.field1003[var6];
            class150.field3437 = class42.field1019[var6] = var9;
            class101 var12 = class42.field1001[var6];
            if (class144.field3323 == 0) {
                int var13 = 16776960;
                if (class42.field1002[var6] < 6) {
                    var13 = class138.field3203[class42.field1002[var6]];
                }
                if (class42.field1002[var6] == 6) {
                    var13 = class150.field3444 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class42.field1002[var6] == 7) {
                    var13 = class150.field3444 % 20 < 10 ? 255 : 65535;
                }
                if (class42.field1002[var6] == 8) {
                    var13 = class150.field3444 % 20 < 10 ? 45056 : 8454016;
                }
                if (class42.field1002[var6] == 9) {
                    int var14 = 150 - class42.field1010[var6];
                    if (var14 < 50) {
                        var13 = var14 * 1280 + 16711680;
                    } else if (var14 < 100) {
                        var13 = 16776960 + 16384000 - var14 * 327680;
                    } else if (var14 < 150) {
                        var13 = var14 * 5 + 65280 - 500;
                    }
                }
                if (class42.field1002[var6] == 10) {
                    int var15 = 150 - class42.field1010[var6];
                    if (var15 < 50) {
                        var13 = var15 * 5 + 16711680;
                    } else if (var15 < 100) {
                        var13 = 16711935 - (var15 - 50) * 327680;
                    } else if (var15 < 150) {
                        var13 = (var15 - 100) * 327680 + 255 + 500 - var15 * 5;
                    }
                }
                if (class42.field1002[var6] == 11) {
                    int var16 = 150 - class42.field1010[var6];
                    if (var16 < 50) {
                        var13 = 16777215 - var16 * 327685;
                    } else if (var16 < 100) {
                        var13 = (var16 - 50) * 327685 + 65280;
                    } else if (var16 < 150) {
                        var13 = 32768000 + 16777215 - var16 * 327680;
                    }
                }
                if (class42.field1006[var6] == 0) {
                    class34.field867.method850(var12, class121.field2678 + arg2, class150.field3437 + arg4, var13, 0);
                }
                if (class42.field1006[var6] == 1) {
                    class34.field867.method855(var12, class121.field2678 + arg2, class150.field3437 + arg4, var13, 0, class150.field3444);
                }
                if (class42.field1006[var6] == 2) {
                    class34.field867.method867(var12, class121.field2678 + arg2, arg4 - -class150.field3437, var13, 0, class150.field3444);
                }
                if (class42.field1006[var6] == 3) {
                    class34.field867.method853(var12, class121.field2678 + arg2, class150.field3437 + arg4, var13, 0, class150.field3444, 150 - class42.field1010[var6]);
                }
                if (class42.field1006[var6] == 4) {
                    int var17 = (150 - class42.field1010[var6]) * (class34.field867.method866(var12) + 100) / 150;
                    class38.method287(class121.field2678 + arg2 - 50, arg4, arg2 + class121.field2678 + 50, arg0 + arg4);
                    class34.field867.method852(var12, arg2 + class121.field2678 + 50 - var17, class150.field3437 + arg4, var13, 0);
                    class38.method278(arg2, arg4, arg2 + arg3, arg0 + arg4);
                }
                if (class42.field1006[var6] == 5) {
                    int var18 = 150 - class42.field1010[var6];
                    class38.method287(arg2, class150.field3437 + arg4 - class34.field867.field2505 - 1, arg2 + arg3, class150.field3437 + arg4 + 5);
                    int var19 = 0;
                    if (var18 < 25) {
                        var19 = var18 - 25;
                    } else if (var18 > 125) {
                        var19 = var18 - 125;
                    }
                    class34.field867.method850(var12, class121.field2678 + arg2, arg4 - -var19 + class150.field3437, var13, 0);
                    class38.method278(arg2, arg4, arg2 + arg3, arg0 + arg4);
                }
            } else {
                class34.field867.method850(var12, class121.field2678 + arg2, arg4 - -class150.field3437, 16776960, 0);
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)Z")
    public static final boolean method322(byte arg0, int arg1) {
        field1061++;
        if (arg0 != -27) {
            field1059 = -91;
        }
        return (arg1 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method323(Component arg0, int arg1) {
        arg0.removeKeyListener(class132.field3005);
        field1046++;
        arg0.removeFocusListener(class132.field3005);
        if (arg1 == -51) {
            class145.field3338 = -1;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
    public static void method324(byte arg0) {
        field1052 = null;
        if (arg0 <= 21) {
            method321(-47, -70, -127, 112, 43);
        }
        field1049 = null;
        field1043 = null;
        field1057 = null;
        field1053 = null;
        field1051 = null;
        field1041 = null;
        field1047 = null;
    }

    @OriginalMember(owner = "client!ga", name = "run", descriptor = "()V")
    public final void run() {
        field1058++;
        while (this.field1045) {
            Object var1 = this.field1054;
            synchronized (this.field1054) {
                if (this.field1056 < 500) {
                    this.field1062[this.field1056] = class40.field947;
                    this.field1060[this.field1056] = class105.field2264;
                    this.field1056++;
                }
            }
            class127.method981((byte) -86, 50L);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lsa;I)Z")
    public static final boolean method325(class126 arg0, int arg1) {
        int var2 = arg0.field2856;
        field1042++;
        if (var2 == 205) {
            class54.field1228 = 250;
            return true;
        }
        if (var2 >= 300 && var2 <= 313) {
            int var3 = var2 & 0x1;
            int var4 = (var2 - 300) / 2;
            class89.field1942.method601(var4, var3 == 1, true);
        }
        if (var2 >= 314 && var2 <= 323) {
            int var5 = (var2 - 314) / 2;
            int var6 = var2 & 0x1;
            class89.field1942.method602(false, var5, var6 == 1);
        }
        if (var2 == 324) {
            class89.field1942.method600(false, arg1 + 21591);
        }
        if (arg1 != -21592) {
            return true;
        }
        if (var2 == 325) {
            class89.field1942.method600(true, -1);
        }
        if (var2 == 326) {
            class17.field364.method419(158, (byte) 0);
            class67.field1513++;
            class89.field1942.method593((byte) 120, class17.field364);
            return true;
        } else {
            return false;
        }
    }
}
