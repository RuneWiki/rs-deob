import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public abstract class class50 {

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field1081 = 0;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "Z")
    public static boolean field1078 = false;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "Lud;")
    public static class118 field1087;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "Lvb;")
    public static class121 field1084;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "Lad;")
    public static class5 field1076;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "Z")
    public static boolean field1086;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V", line = 3)
    public static final void method427(byte arg0) {
        field1083++;
        if (arg0 != -118) {
            return;
        }
        class24.field405 = 0;
        int var1 = (class107.field2271.field1380 >> 7) + class106.field2242;
        int var2 = (class107.field2271.field1391 >> 7) + class36.field714;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class24.field405 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class24.field405 = 1;
        }
        if (class24.field405 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class24.field405 = 0;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZLke;)V", line = 32)
    public static final void method428(boolean arg0, class65 arg1) {
        arg1.field1434 = arg1.field1399;
        field1079++;
        if (arg1.field1425 == 0) {
            arg1.field1389 = 0;
            return;
        }
        if (arg1.field1423 != -1 && arg1.field1429 == 0) {
            class31 var2 = class74.method554(arg1.field1423, 4867);
            if (arg1.field1388 > 0 && var2.field611 == 0) {
                arg1.field1389++;
                return;
            }
            if (arg1.field1388 <= 0 && var2.field615 == 0) {
                arg1.field1389++;
                return;
            }
        }
        if (!arg0) {
            return;
        }
        int var3 = arg1.field1391;
        int var4 = arg1.field1380;
        int var5 = arg1.field1374[arg1.field1425 - 1] * 128 + arg1.field1384 * 64;
        int var6 = arg1.field1436[arg1.field1425 - 1] * 128 + arg1.field1384 * 64;
        if (var5 - var4 > 256 || var5 - var4 < -256 || var6 - var3 > 256 || var6 - var3 < -256) {
            arg1.field1380 = var5;
            arg1.field1391 = var6;
            return;
        }
        if (var4 < var5) {
            if (var6 > var3) {
                arg1.field1390 = 1280;
            } else if (var6 >= var3) {
                arg1.field1390 = 1536;
            } else {
                arg1.field1390 = 1792;
            }
        } else if (var5 < var4) {
            if (var6 > var3) {
                arg1.field1390 = 768;
            } else if (var6 < var3) {
                arg1.field1390 = 256;
            } else {
                arg1.field1390 = 512;
            }
        } else if (var3 >= var6) {
            arg1.field1390 = 0;
        } else {
            arg1.field1390 = 1024;
        }
        int var7 = arg1.field1390 - arg1.field1421 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg1.field1419;
        int var9 = 4;
        if (arg1.field1421 != arg1.field1390 && arg1.field1442 == -1 && arg1.field1392 != 0) {
            var9 = 2;
        }
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg1.field1373;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg1.field1440;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg1.field1420;
        }
        if (var8 == -1) {
            var8 = arg1.field1373;
        }
        arg1.field1434 = var8;
        if (arg1.field1425 > 2) {
            var9 = 6;
        }
        if (arg1.field1425 > 3) {
            var9 = 8;
        }
        if (arg1.field1389 > 0 && arg1.field1425 > 1) {
            arg1.field1389--;
            var9 = 8;
        }
        if (arg1.field1371[arg1.field1425 - 1]) {
            var9 <<= 0x1;
        }
        if (var4 < var5) {
            arg1.field1380 += var9;
            if (var5 < arg1.field1380) {
                arg1.field1380 = var5;
            }
        } else if (var4 > var5) {
            arg1.field1380 -= var9;
            if (var5 > arg1.field1380) {
                arg1.field1380 = var5;
            }
        }
        if (var6 > var3) {
            arg1.field1391 += var9;
            if (arg1.field1391 > var6) {
                arg1.field1391 = var6;
            }
        } else if (var3 > var6) {
            arg1.field1391 -= var9;
            if (var6 > arg1.field1391) {
                arg1.field1391 = var6;
            }
        }
        if (arg1.field1380 == var5 && arg1.field1391 == var6) {
            if (arg1.field1388 > 0) {
                arg1.field1388--;
            }
            arg1.field1425--;
        }
        if (var9 >= 8 && arg1.field1434 == arg1.field1373 && arg1.field1378 != -1) {
            arg1.field1434 = arg1.field1378;
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)V", line = 222)
    public static final void method430(byte arg0) {
        class54.field1120.method742(4);
        if (arg0 == 116) {
            field1074++;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I", line = 234)
    public static final int method431(KeyEvent arg0, int arg1) {
        int var2 = -74 / ((arg1 - 38) / 43);
        int var3 = arg0.getKeyChar();
        if (var3 <= 0 || var3 >= 256) {
            var3 = -1;
        }
        field1082++;
        return var3;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V", line = 254)
    public static void method433(boolean arg0) {
        field1084 = null;
        field1087 = null;
        field1076 = null;
        if (arg0) {
            method435(-76);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 271)
    public static final void method434(int arg0) {
        field1085++;
        if (arg0 >= -87) {
            field1078 = false;
        }
        try {
            if (class33.field662 == 0) {
                class89.field2009 = false;
                class105.field2236 = 0;
                class62.field1284 = null;
                class33.field662 = 1;
                class82.field1764 = null;
            }
            if (class33.field662 == 1) {
                if (class62.field1284 == null) {
                    class62.field1284 = class118.field2627.method78((byte) -116, class69.field1476);
                }
                if (class62.field1284.field2091 == 2) {
                    throw new IOException();
                }
                if (class62.field1284.field2091 == 1) {
                    class82.field1764 = new class45((Socket) class62.field1284.field2093, class118.field2627);
                    class62.field1284 = null;
                    class33.field662 = 2;
                }
            }
            if (class33.field662 == 2) {
                long var1 = class122.field2735 = class105.field2224.method649((byte) -125);
                class97.field2070.field482 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class97.field2070.method226(-9646, 14);
                class97.field2070.method226(-9646, var3);
                class82.field1764.method396(class97.field2070.field502, 2, 0, true);
                class33.field662 = 3;
                class65.field1405.field482 = 0;
            }
            if (class33.field662 == 3) {
                int var4 = class82.field1764.method391(0);
                if (var4 != 0) {
                    class115.method886(var4, (byte) 101);
                    return;
                }
                class33.field662 = 4;
                class65.field1405.field482 = 0;
            }
            if (class33.field662 == 4) {
                if (class65.field1405.field482 < 8) {
                    int var5 = class82.field1764.method393(0);
                    if (var5 > 8 - class65.field1405.field482) {
                        var5 = 8 - class65.field1405.field482;
                    }
                    if (var5 > 0) {
                        class82.field1764.method390(class65.field1405.field482, var5, (byte) 97, class65.field1405.field502);
                        class65.field1405.field482 += var5;
                    }
                }
                if (class65.field1405.field482 == 8) {
                    class65.field1405.field482 = 0;
                    class117.field2570 = class65.field1405.method240(-122);
                    class33.field662 = 5;
                }
            }
            if (class33.field662 == 5) {
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class117.field2570 >> 32), (int) class117.field2570 };
                class97.field2070.field482 = 0;
                class97.field2070.method226(-9646, 10);
                class97.field2070.method248(var6[0], -2147393384);
                class97.field2070.method248(var6[1], -2147393384);
                class97.field2070.method248(var6[2], -2147393384);
                class97.field2070.method248(var6[3], -2147393384);
                class97.field2070.method248(class118.field2627.field186, -2147393384);
                class97.field2070.method203(-24628, class105.field2224.method649((byte) -128));
                class97.field2070.method206(class105.field2210, (byte) -63);
                class97.field2070.method208(class60.field1243, (byte) -45, class11.field209);
                class74.field1552.field482 = 0;
                if (class51.field1088 == 40) {
                    class74.field1552.method226(-9646, 18);
                } else {
                    class74.field1552.method226(-9646, 16);
                }
                class74.field1552.method226(-9646, class97.field2070.field482 + 53);
                class74.field1552.method248(410, -2147393384);
                class74.field1552.method226(-9646, class1.field23 ? 1 : 0);
                class74.field1552.method248(field1076.field2583, -2147393384);
                class74.field1552.method248(class106.field2244.field2583, -2147393384);
                class74.field1552.method248(class6.field111.field2583, -2147393384);
                class74.field1552.method248(class33.field641.field2583, -2147393384);
                class74.field1552.method248(class41.field831.field2583, -2147393384);
                class74.field1552.method248(class42.field867.field2583, -2147393384);
                class74.field1552.method248(class104.field2197.field2583, -2147393384);
                class74.field1552.method248(class31.field602.field2583, -2147393384);
                class74.field1552.method248(class100.field2122.field2583, -2147393384);
                class74.field1552.method248(class41.field828.field2583, -2147393384);
                class74.field1552.method248(class99.field2108.field2583, -2147393384);
                class74.field1552.method248(class86.field1970.field2583, -2147393384);
                class74.field1552.method205(class97.field2070.field502, 0, (byte) 65, class97.field2070.field482);
                class82.field1764.method396(class74.field1552.field502, class74.field1552.field482, 0, true);
                class97.field2070.method977(var6, -100);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class65.field1405.method977(var6, -56);
                class33.field662 = 6;
            }
            if (class33.field662 == 6 && class82.field1764.method393(0) > 0) {
                int var8 = class82.field1764.method391(0);
                if (var8 == 21 && class51.field1088 == 20) {
                    class33.field662 = 7;
                } else if (var8 == 2) {
                    class33.field662 = 9;
                } else if (var8 == 15 && class51.field1088 == 40) {
                    class107.method792((byte) -72);
                    return;
                } else if (var8 == 23 && class78.field1651 < 1) {
                    class78.field1651++;
                    class33.field662 = 0;
                } else {
                    class115.method886(var8, (byte) 101);
                    return;
                }
            }
            if (class33.field662 == 7 && class82.field1764.method393(0) > 0) {
                class11.field216 = (class82.field1764.method391(0) + 3) * 60;
                class33.field662 = 8;
            }
            if (class33.field662 == 8) {
                class105.field2236 = 0;
                class58.method475(class49.field1018, class97.method746(0, new class84[] { class112.field2431, class62.method489(class11.field216 / 60, (byte) -124) }), (byte) 77);
                if (--class11.field216 <= 0) {
                    class33.field662 = 0;
                }
            } else {
                if (class33.field662 == 9 && class82.field1764.method393(0) >= 8) {
                    class73.field1542 = class82.field1764.method391(0);
                    field1078 = class82.field1764.method391(0) == 1;
                    class101.field2142 = class82.field1764.method391(0);
                    class101.field2142 <<= 0x8;
                    class101.field2142 += class82.field1764.method391(0);
                    class44.field886 = class82.field1764.method391(0);
                    class82.field1764.method390(0, 1, (byte) 110, class65.field1405.field502);
                    class65.field1405.field482 = 0;
                    class107.field2278 = class65.field1405.method976((byte) 105);
                    class82.field1764.method390(0, 2, (byte) 89, class65.field1405.field502);
                    class65.field1405.field482 = 0;
                    class39.field794 = class65.field1405.method227(127);
                    class33.field662 = 10;
                }
                if (class33.field662 != 10) {
                    class105.field2236++;
                    if (class105.field2236 > 2000) {
                        if (class78.field1651 < 1) {
                            class78.field1651++;
                            if (class69.field1476 == class115.field2510) {
                                class69.field1476 = class61.field1268;
                            } else {
                                class69.field1476 = class115.field2510;
                            }
                            class33.field662 = 0;
                        } else {
                            class115.method886(-3, (byte) 101);
                        }
                    }
                } else if (class82.field1764.method393(0) >= class39.field794) {
                    class65.field1405.field482 = 0;
                    class82.field1764.method390(0, class39.field794, (byte) 91, class65.field1405.field502);
                    class126.method972((byte) -114);
                    class65.field1445 = -1;
                    class118.method900(false, -50);
                    class107.field2278 = -1;
                }
            }
        } catch (IOException var9) {
            if (class78.field1651 < 1) {
                if (class69.field1476 == class115.field2510) {
                    class69.field1476 = class61.field1268;
                } else {
                    class69.field1476 = class115.field2510;
                }
                class78.field1651++;
                class33.field662 = 0;
            } else {
                class115.method886(-2, (byte) 101);
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V", line = 590)
    public static final void method435(int arg0) {
        class14.field259.method707(-126);
        field1075++;
        if (arg0 != -7184) {
            method431(null, -30);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)I", line = 602)
    public static final int method436(int arg0, byte arg1) {
        if (arg1 <= 44) {
            field1087 = null;
        }
        field1077++;
        return (int) (Math.log((double) arg0 * 0.00390625D) * 868.5889638065036D + 0.5D);
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)V")
    public abstract void method429(byte arg0);

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BII)V")
    public abstract void method432(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
    public abstract void method437(int arg0);

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZB[BI)V")
    public abstract void method438(boolean arg0, byte arg1, byte[] arg2, int arg3);

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
    public abstract void method439(int arg0);

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V")
    public abstract void method440(int arg0);
}
