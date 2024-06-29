import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class84 extends class170 {

    @OriginalMember(owner = "client!pc", name = "U", descriptor = "I")
    private int field1482 = 10;

    @OriginalMember(owner = "client!pc", name = "bb", descriptor = "I")
    private int field1489 = 2048;

    @OriginalMember(owner = "client!pc", name = "db", descriptor = "I")
    private int field1491 = 0;

    @OriginalMember(owner = "client!pc", name = "ab", descriptor = "I")
    public static int field1488 = 0;

    @OriginalMember(owner = "client!pc", name = "gb", descriptor = "Lmh;")
    public static class128 field1494 = class22.method156(124, "gleiten:");

    @OriginalMember(owner = "client!pc", name = "hb", descriptor = "Log;")
    public static class195 field1495 = new class195(0, 0);

    @OriginalMember(owner = "client!pc", name = "S", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!pc", name = "V", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!pc", name = "W", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!pc", name = "X", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!pc", name = "Y", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!pc", name = "Z", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!pc", name = "cb", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!pc", name = "fb", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!pc", name = "ib", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!pc", name = "R", descriptor = "[I")
    private int[] field1479;

    @OriginalMember(owner = "client!pc", name = "eb", descriptor = "[I")
    private int[] field1492;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lmh;ZZ)V", line = 5)
    public static final void method532(class128 arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            field1495 = (class195) null;
        }
        field1496++;
        if (!arg1) {
            try {
                class106.field1810.getAppletContext().showDocument(arg0.method844((byte) 101, class106.field1810.getCodeBase()), "_top");
            } catch (Exception var7) {
            }
            return;
        }
        if (class247.field4247 && class3.field71) {
            try {
                class131.method880("openjs", (byte) 108, class288.field4925.field4677, new Object[] { arg0.method844((byte) 88, class106.field1810.getCodeBase()).toString() });
                return;
            } catch (Throwable var8) {
            }
        }
        try {
            class106.field1810.getAppletContext().showDocument(arg0.method844((byte) 99, class106.field1810.getCodeBase()), "_blank");
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIII)I", line = 52)
    public static final int method533(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == -29436) {
            field1484++;
            int var5 = 65536 - class141.field2411[arg4 * 1024 / arg2] >> 1;
            return ((65536 - var5) * arg3 >> 16) + (arg1 * var5 >> 16);
        } else {
            return 74;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZI)V", line = 64)
    public static final void method534(boolean arg0, int arg1) {
        if (arg0) {
            return;
        }
        field1481++;
        if (class234.field4032 == arg1 && arg1 != 0) {
            class87 var2 = class79.field1441[arg1];
            var2.method503(class11.field373);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lmh;I)Z", line = 87)
    public static final boolean method535(class128 arg0, int arg1) {
        field1480++;
        if (arg1 != -1373) {
            return true;
        } else if (arg0 == null) {
            return false;
        } else {
            for (int var2 = 0; var2 < class214.field3779; var2++) {
                if (arg0.method861(arg1 ^ 0xFFFFD2D9, class313.field5284[var2])) {
                    return true;
                }
            }
            if (arg0.method861(10362, class163.field2796.field2079)) {
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lem;Lmh;B)Lmh;", line = 117)
    public static final class128 method536(class10 arg0, class128 arg1, byte arg2) {
        if (arg1.method823(class267.field4628, true) != -1) {
            label66: while (true) {
                int var3 = arg1.method823(class289.field4958, true);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.method823(class292.field4985, true);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.method823(class214.field3780, true);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg1.method823(class171.field2992, true);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.method823(class287.field4913, true);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg1.method823(class271.field4717, true);
                                                        if (var8 == -1) {
                                                            break label66;
                                                        }
                                                        class128 var9 = class273.field4733;
                                                        if (class158.field2710 != null) {
                                                            var9 = class31.method223(class158.field2710.field563, true);
                                                            try {
                                                                if (class158.field2710.field562 != null) {
                                                                    byte[] var10 = ((String) class158.field2710.field562).getBytes("ISO-8859-1");
                                                                    var9 = class220.method1520(var10.length, (byte) 99, 0, var10);
                                                                }
                                                            } catch (UnsupportedEncodingException var12) {
                                                            }
                                                        }
                                                        arg1 = class28.method177((byte) -112, new class128[] { arg1.method848(0, 101, var8), var9, arg1.method829(var8 + 4, (byte) 119) });
                                                    }
                                                }
                                                arg1 = class28.method177((byte) -101, new class128[] { arg1.method848(0, 89, var7), class30.method217(999999999, class235.method1612(4, (byte) 10, arg0)), arg1.method829(var7 + 2, (byte) 112) });
                                            }
                                        }
                                        arg1 = class28.method177((byte) -81, new class128[] { arg1.method848(0, arg2 ^ 0x1, var6), class30.method217(999999999, class235.method1612(3, (byte) 10, arg0)), arg1.method829(var6 + 2, (byte) 115) });
                                    }
                                }
                                arg1 = class28.method177((byte) -117, new class128[] { arg1.method848(0, arg2 ^ 0x3C, var5), class30.method217(999999999, class235.method1612(2, (byte) 10, arg0)), arg1.method829(var5 + 2, (byte) 127) });
                            }
                        }
                        arg1 = class28.method177((byte) -71, new class128[] { arg1.method848(0, 92, var4), class30.method217(999999999, class235.method1612(1, (byte) 10, arg0)), arg1.method829(var4 + 2, (byte) 127) });
                    }
                }
                arg1 = class28.method177((byte) -109, new class128[] { arg1.method848(0, 115, var3), class30.method217(999999999, class235.method1612(0, (byte) 10, arg0)), arg1.method829(var3 + 2, (byte) 108) });
            }
        }
        if (arg2 != 90) {
            field1488 = -16;
        }
        field1493++;
        return arg1;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(III)J", line = 217)
    public static final long method537(int arg0, int arg1, int arg2) {
        class150 var3 = class182.field3184[arg0][arg1][arg2];
        return var3 == null || var3.field2565 == null ? 0L : var3.field2565.field2762;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILbg;B)V", line = 236)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        if (arg0 == 0) {
            this.field1482 = arg1.method1325(arg2 + 7614);
        } else if (arg0 == 1) {
            this.field1489 = arg1.method1308(arg2 ^ 0xFFFFFFB3);
        } else if (arg0 == 2) {
            this.field1491 = arg1.method1325(7627);
        }
        field1487++;
        if (arg2 != 13) {
            this.field1492 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)[I", line = 275)
    public final int[] method69(byte arg0, int arg1) {
        if (arg0 != 85) {
            this.method267(122);
        }
        int[] var3 = this.field2977.method1838(false, arg1);
        if (this.field2977.field4552) {
            int var4 = class307.field5221[arg1];
            if (this.field1491 == 0) {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field1482; var12++) {
                    if (this.field1479[var12] <= var4 && var4 < this.field1479[var12 + 1]) {
                        if (this.field1492[var12] > var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class224.method1543(var3, 0, class185.field3225, var11);
            } else {
                for (int var5 = 0; var5 < class185.field3225; var5++) {
                    int var6 = 0;
                    int var7 = class118.field2002[var5];
                    int var8 = this.field1491;
                    if (var8 == 1) {
                        var6 = var7;
                    } else if (var8 == 2) {
                        var6 = (var7 + var4 - 4096 >> 1) + 2048;
                    } else if (var8 == 3) {
                        var6 = (var7 - var4 >> 1) + 2048;
                    }
                    short var9 = 0;
                    for (int var10 = 0; var10 < this.field1482; var10++) {
                        if (var6 >= this.field1479[var10] && this.field1479[var10 + 1] > var6) {
                            if (this.field1492[var10] > var6) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var9;
                }
            }
        }
        field1483++;
        return var3;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)Loa;", line = 388)
    public static final class275 method538(int arg0, int arg1) {
        field1485++;
        if (arg1 != 1) {
            field1495 = (class195) null;
        }
        class275 var2 = (class275) class175.field3091.method1836((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class53.field1036.method2155(class248.method1722((byte) 38, arg0), class102.method631(arg0, (byte) -77), (byte) 70);
        class275 var4 = new class275();
        if (var3 != null) {
            var4.method1933(new class194(var3), (byte) 87);
        }
        class175.field3091.method1835((byte) -81, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V", line = 413)
    public class84() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V", line = 453)
    public final void method267(int arg0) {
        field1490++;
        this.method540((byte) 119);
        if (arg0 != -2718) {
            this.field1482 = 33;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(Z)V", line = 468)
    public static void method539(boolean arg0) {
        if (!arg0) {
            field1495 = (class195) null;
        }
        field1494 = null;
        field1495 = null;
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(B)V", line = 484)
    private final void method540(byte arg0) {
        this.field1479 = new int[this.field1482 + 1];
        this.field1492 = new int[this.field1482 + 1];
        field1486++;
        int var2 = 0;
        if (arg0 < 109) {
            this.field1492 = (int[]) null;
        }
        int var3 = 4096 / this.field1482;
        int var4 = this.field1489 * var3 >> 12;
        for (int var5 = 0; var5 < this.field1482; var5++) {
            this.field1479[var5] = var2;
            this.field1492[var5] = var2 + var4;
            var2 += var3;
        }
        this.field1479[this.field1482] = 4096;
        this.field1492[this.field1482] = this.field1492[0] + 4096;
    }
}
