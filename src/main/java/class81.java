import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class81 {

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
    private int field1478 = 65000;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "Lhk;")
    private class124 field1474 = null;

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "Lhk;")
    private class124 field1484 = null;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    private int field1473;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "Lqk;")
    public static class207 field1467 = null;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "[I")
    public static int[] field1475 = new int[100];

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "Lqk;")
    public static class207 field1472 = class24.method212(255, "loginscreen");

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "Lqk;")
    private static class207 field1481 = class24.method212(255, "Loaded config");

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "[I")
    public static int[] field1480 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "Lqk;")
    public static class207 field1466 = field1481;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public static int field1476 = 0;

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "Lqk;")
    public static class207 field1486 = class24.method212(255, "Forced tweening disabled)3");

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "Lqe;")
    public static class96 field1468;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "[[S")
    public static short[][] field1477;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II[BI)Z")
    public final boolean method605(int arg0, int arg1, byte[] arg2, int arg3) {
        field1470++;
        class124 var5 = this.field1474;
        synchronized (this.field1474) {
            if (arg3 < 0 || arg3 > this.field1478) {
                throw new IllegalArgumentException();
            }
            if (arg1 != -7461) {
                this.method605(113, 60, (byte[]) null, -91);
            }
            boolean var6 = this.method606(arg0, true, arg2, arg1 - 25177, arg3);
            if (!var6) {
                var6 = this.method606(arg0, false, arg2, arg1 - 25177, arg3);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZ[BII)Z")
    private final boolean method606(int arg0, boolean arg1, byte[] arg2, int arg3, int arg4) {
        field1482++;
        class124 var6 = this.field1474;
        synchronized (this.field1474) {
            try {
                int var8;
                if (arg1) {
                    if (((long) (arg0 * 6 + 6)) > this.field1484.method874(false)) {
                        return false;
                    }
                    this.field1484.method879(0, (long) (arg0 * 6));
                    this.field1484.method873(0, -1, class78.field1424, 6);
                    var8 = (class78.field1424[5] & 0xFF) + ((class78.field1424[3] & 0xFF) << 16) + (class78.field1424[4] & 0xFF << 8);
                    if (var8 <= 0 || this.field1474.method874(false) / 520L < (long) var8) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field1474.method874(false) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class78.field1424[5] = (byte) var8;
                class78.field1424[0] = (byte) (arg4 >> 16);
                class78.field1424[4] = (byte) (var8 >> 8);
                class78.field1424[2] = (byte) arg4;
                int var10 = 0;
                int var11 = 0;
                class78.field1424[3] = (byte) (var8 >> 16);
                class78.field1424[1] = (byte) (arg4 >> 8);
                this.field1484.method879(0, (long) (arg0 * 6));
                if (arg3 != -32638) {
                    this.field1474 = null;
                }
                this.field1484.method875(6, arg3 ^ 0x7F7D, 0, class78.field1424);
                while (arg4 > var11) {
                    int var12 = 0;
                    if (arg1) {
                        label108: {
                            this.field1474.method879(0, (long) (var8 * 520));
                            try {
                                this.field1474.method873(0, arg3 + 32637, class78.field1424, 8);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class78.field1424[0] & 0xFF << 8) + (class78.field1424[1] & 0xFF);
                            int var14 = ((class78.field1424[2] & 0xFF) << 8) + (class78.field1424[3] & 0xFF);
                            int var15 = class78.field1424[7] & 0xFF;
                            var12 = ((class78.field1424[4] & 0xFF) << 16) + (class78.field1424[5] & 0xFF << 8) + (class78.field1424[6] & 0xFF);
                            if (arg0 == var13 && var10 == var14 && this.field1473 == var15) {
                                if (var12 >= 0 && this.field1474.method874(false) / 520L >= (long) var12) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg1 = false;
                        var12 = (int) ((this.field1474.method874(false) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class78.field1424[7] = (byte) this.field1473;
                    class78.field1424[3] = (byte) var10;
                    class78.field1424[2] = (byte) (var10 >> 8);
                    class78.field1424[0] = (byte) (arg0 >> 8);
                    if (arg4 - var11 <= 512) {
                        var12 = 0;
                    }
                    class78.field1424[5] = (byte) (var12 >> 8);
                    class78.field1424[1] = (byte) arg0;
                    int var18 = arg4 - var11;
                    class78.field1424[4] = (byte) (var12 >> 16);
                    var10++;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class78.field1424[6] = (byte) var12;
                    this.field1474.method879(arg3 + 32638, (long) (var8 * 520));
                    this.field1474.method875(8, arg3 ^ 0x7F7D, 0, class78.field1424);
                    this.field1474.method875(var18, arg3 + 32637, var11, arg2);
                    var8 = var12;
                    var11 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1485++;
        return "Cache:" + this.field1473;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILoi;IIIB)V")
    public static final void method607(int arg0, class79 arg1, int arg2, int arg3, int arg4, byte arg5) {
        field1465++;
        if (arg5 != -76) {
            field1481 = null;
        }
        if (arg1.field1451 == -1 && arg1.field1439 == null) {
            return;
        }
        int var6 = 0;
        if (arg1.field1435 < arg4) {
            var6 += arg4 - arg1.field1435;
        } else if (arg1.field1445 > arg4) {
            var6 += arg1.field1445 - arg4;
        }
        if (arg3 > arg1.field1431) {
            var6 += arg3 - arg1.field1431;
        } else if (arg1.field1450 > arg3) {
            var6 += arg1.field1450 - arg3;
        }
        if (arg1.field1454 == 0 || arg1.field1454 < (var6 - 64) || class167.field2927 == 0 || arg1.field1456 != arg0) {
            if (arg1.field1438 != null) {
                class65.field1177.method661(arg1.field1438);
                arg1.field1438 = null;
            }
            if (arg1.field1434 != null) {
                class65.field1177.method661(arg1.field1434);
                arg1.field1434 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg1.field1454 - var6) * class167.field2927 / arg1.field1454;
        if (arg1.field1438 != null) {
            arg1.field1438.method554(var7);
        } else if (arg1.field1451 >= 0) {
            class76 var8 = class76.method548(class153.field2656, arg1.field1451, 0);
            if (var8 != null) {
                class222 var9 = var8.method547().method1578(class106.field1888);
                class77 var10 = class77.method585(var9, 100, var7);
                var10.method559(-1);
                class65.field1177.method659(var10);
                arg1.field1438 = var10;
            }
        }
        if (arg1.field1434 != null) {
            arg1.field1434.method554(var7);
            if (!arg1.field1434.method1347(118)) {
                arg1.field1434 = null;
            }
        } else if (arg1.field1439 != null && (arg1.field1440 -= arg2) <= 0) {
            int var11 = (int) (Math.random() * (double) arg1.field1439.length);
            class76 var12 = class76.method548(class153.field2656, arg1.field1439[var11], 0);
            if (var12 != null) {
                class222 var13 = var12.method547().method1578(class106.field1888);
                class77 var14 = class77.method585(var13, 100, var7);
                var14.method559(0);
                class65.field1177.method659(var14);
                arg1.field1440 = arg1.field1455 + ((int) (Math.random() * (double) (arg1.field1436 - arg1.field1455)));
                arg1.field1434 = var14;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V")
    public static void method608(boolean arg0) {
        field1475 = null;
        field1466 = null;
        field1467 = null;
        field1486 = null;
        if (!arg0) {
            method610((byte) -84);
        }
        field1480 = null;
        field1477 = null;
        field1481 = null;
        field1472 = null;
        field1468 = null;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(Z)V")
    public static final void method609(boolean arg0) {
        field1471++;
        for (int var1 = 0; var1 < class65.field1179; var1++) {
            int var2 = class180.field3233[var1];
            class256 var3 = class79.field1449[var2];
            int var4 = class17.field262.method1045((byte) -38);
            if ((var4 & 0x80) != 0) {
                var4 += class17.field262.method1045((byte) -99) << 8;
            }
            if ((var4 & 0x1) != 0) {
                var3.field5019 = class17.field262.method1034(-27220);
                var3.field5025 = 100;
            }
            if ((var4 & 0x100) != 0) {
                var3.field5045 = class17.field262.method1062(79);
                var3.field5023 = class17.field262.method1050(1272006568);
            }
            if ((var4 & 0x10) != 0) {
                var3.field5079 = class17.field262.method1047(77);
                if (var3.field5079 == 65535) {
                    var3.field5079 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                int var5 = class17.field262.method1045((byte) 121);
                int var6 = class17.field262.method1045((byte) -63);
                var3.method1945(class160.field2844, (byte) -43, var6, var5);
                var3.field5056 = class160.field2844 + 300;
                var3.field5060 = class17.field262.method1072(255);
            }
            if ((var4 & 0x40) != 0) {
                if (var3.field4581.method515((byte) -60)) {
                    class134.method941((byte) 107, var3);
                }
                var3.method1780((byte) 57, class212.method1513(class17.field262.method1050(1272006568), (byte) 10));
                var3.method1948(109, var3.field4581.field1303);
                var3.field5107 = var3.field4581.field1324;
                if (var3.field4581.method515((byte) -60)) {
                    class118.method842((byte) -110, var3.field5022[0], var3.field5074[0], 0, (class22) null, class93.field1645, var3, (class14) null);
                }
            }
            if ((var4 & 0x200) != 0) {
                int var7 = class17.field262.method1073(arg0);
                int[] var8 = new int[var7];
                int[] var9 = new int[var7];
                int[] var10 = new int[var7];
                for (int var11 = 0; var11 < var7; var11++) {
                    int var12 = class17.field262.method1047(90);
                    if (var12 == 65535) {
                        var12 = -1;
                    }
                    var8[var11] = var12;
                    var9[var11] = class17.field262.method1045((byte) 98);
                    var10[var11] = class17.field262.method1062(83);
                }
                class243.method1715(var8, var10, 0, var9, var3);
            }
            if ((var4 & 0x2) != 0) {
                int var13 = class17.field262.method1047(110);
                int var14 = class17.field262.method1076(65280);
                if (var13 == 65535) {
                    var13 = -1;
                }
                boolean var15 = true;
                if (var13 != -1 && var3.field5105 != -1 && class16.method101((byte) -122, class165.method1192(var13, -127).field4332).field1169 < class16.method101((byte) 106, class165.method1192(var3.field5105, -115).field4332).field1169) {
                    var15 = false;
                }
                if (var15) {
                    var3.field5012 = 1;
                    var3.field5096 = var14 >> 16;
                    var3.field5105 = var13;
                    var3.field5080 = 0;
                    var3.field5059 = (var14 & 0xFFFF) + class160.field2844;
                    var3.field5088 = 0;
                    if (class160.field2844 < var3.field5059) {
                        var3.field5080 = -1;
                    }
                    if (var3.field5105 != -1 && class160.field2844 == var3.field5059) {
                        int var16 = class165.method1192(var3.field5105, -112).field4332;
                        if (var16 != -1) {
                            class65 var17 = class16.method101((byte) -110, var16);
                            if (var17 != null && var17.field1180 != null) {
                                class69.method497(var3.field5104, false, 0, -96, var3.field5072, var17);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x20) != 0) {
                int var18 = class17.field262.method1047(80);
                int var19 = class17.field262.method1059(true);
                if (var18 == 65535) {
                    var18 = -1;
                }
                class208.method1476(var3, -5636, var18, var19);
            }
            if ((var4 & 0x8) != 0) {
                int var20 = class17.field262.method1045((byte) -81);
                int var21 = class17.field262.method1073(arg0);
                var3.method1945(class160.field2844, (byte) -36, var21, var20);
            }
        }
        if (arg0) {
            method610((byte) 119);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)Lqk;")
    public static final class207 method610(byte arg0) {
        field1479++;
        class207 var1;
        if (class34.field680 == 1 && class268.field4751 < 2) {
            var1 = class105.method757(false, new class207[] { class156.field2744, class220.field3961, class235.field4336, class185.field3280 });
        } else if (class4.field71 && class268.field4751 < 2) {
            var1 = class105.method757(false, new class207[] { class49.field969, class220.field3961, class243.field4422, class185.field3280 });
        } else if (class51.field997 && class165.field2920[81] && class268.field4751 > 2) {
            var1 = class244.method1718(class268.field4751 - 2, 0);
        } else {
            var1 = class244.method1718(class268.field4751 - 1, 0);
        }
        if (class268.field4751 > 2) {
            var1 = class105.method757(false, new class207[] { var1, class112.field1958, class262.method1815(class268.field4751 - 2, (byte) -107), class71.field1262 });
        }
        if (arg0 != -58) {
            method609(false);
        }
        return var1;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)[B")
    public final byte[] method611(int arg0, int arg1) {
        field1483++;
        class124 var3 = this.field1474;
        synchronized (this.field1474) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field1484.method874(false)) {
                    return null;
                }
                this.field1484.method879(arg0 ^ 0xFF0000, (long) (arg1 * 6));
                this.field1484.method873(0, -1, class78.field1424, 6);
                int var5 = (class78.field1424[5] & 0xFF) + ((class78.field1424[4] & 0xFF) << 8) + (class78.field1424[3] & 0xFF << 16);
                int var6 = (class78.field1424[1] & 0xFF << 8) + ((class78.field1424[0] << 16 & arg0) + (class78.field1424[2] & 0xFF));
                if (var6 < 0 || var6 > this.field1478) {
                    return null;
                } else if (var5 > 0 && (long) var5 <= this.field1474.method874(false) / 520L) {
                    int var9 = 0;
                    byte[] var10 = new byte[var6];
                    int var11 = 0;
                    label70: while (var6 > var11) {
                        if (var5 == 0) {
                            return null;
                        }
                        int var13 = var6 - var11;
                        this.field1474.method879(0, (long) (var5 * 520));
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field1474.method873(0, -1, class78.field1424, var13 + 8);
                        int var14 = ((class78.field1424[2] & 0xFF) << 8) + (class78.field1424[3] & 0xFF);
                        int var15 = (class78.field1424[0] & 0xFF << 8) + (class78.field1424[1] & 0xFF);
                        int var16 = ((class78.field1424[5] & 0xFF) << 8) + (class78.field1424[4] & 0xFF << 16) + (class78.field1424[6] & 0xFF);
                        int var17 = class78.field1424[7] & 0xFF;
                        if (arg1 == var15 && var9 == var14 && this.field1473 == var17) {
                            if (var16 >= 0 && ((long) var16) <= (this.field1474.method874(false) / 520L)) {
                                var5 = var16;
                                var9++;
                                int var20 = 0;
                                while (true) {
                                    if (var20 >= var13) {
                                        continue label70;
                                    }
                                    var10[var11++] = class78.field1424[var20 + 8];
                                    var20++;
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                    return var10;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(ILhk;Lhk;I)V")
    public class81(int arg0, class124 arg1, class124 arg2, int arg3) {
        this.field1474 = arg1;
        this.field1473 = arg0;
        this.field1484 = arg2;
        this.field1478 = arg3;
    }
}
