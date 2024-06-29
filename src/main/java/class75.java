import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class75 {

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    private int field1272 = 32;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "Z")
    private boolean field1281 = false;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "J")
    private long field1279 = class19.method91((byte) 93);

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
    private int field1290 = 0;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "[Loa;")
    private class33[] field1294 = new class33[8];

    @OriginalMember(owner = "client!fl", name = "A", descriptor = "J")
    private long field1298 = 0L;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
    private int field1289 = 0;

    @OriginalMember(owner = "client!fl", name = "D", descriptor = "J")
    private long field1301 = 0L;

    @OriginalMember(owner = "client!fl", name = "H", descriptor = "I")
    private int field1305 = 0;

    @OriginalMember(owner = "client!fl", name = "G", descriptor = "[Loa;")
    private class33[] field1304 = new class33[8];

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "Z")
    private boolean field1296 = true;

    @OriginalMember(owner = "client!fl", name = "K", descriptor = "I")
    private int field1308 = 0;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "Lvv;")
    public static class313 field1283 = new class313(67, 7);

    @OriginalMember(owner = "client!fl", name = "J", descriptor = "Lnk;")
    public static class326 field1307 = new class326(8, 3);

    @OriginalMember(owner = "client!fl", name = "L", descriptor = "I")
    public static int field1309 = -1;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
    private int field1291;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "I")
    public int field1293;

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "I")
    public int field1297;

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!fl", name = "C", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!fl", name = "E", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!fl", name = "F", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!fl", name = "I", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!fl", name = "M", descriptor = "Lki;")
    public static class277 field1310;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "Loa;")
    private class33 field1273;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "[I")
    public int[] field1280;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB)V")
    public static final void method524(int arg0, byte arg1) {
        field1287++;
        class435.field6504 = -1;
        if (arg1 >= -78) {
            method524(-77, (byte) -103);
        }
        class129.field2226 = -1;
        class494.field7217 = arg0;
        class430.method2621((byte) 126);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
    public void method525(int arg0) throws Exception {
        field1284++;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "()I")
    public int method526() throws Exception {
        field1300++;
        return this.field1297;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Loa;I)V")
    public final synchronized void method527(class33 arg0, int arg1) {
        this.field1273 = arg0;
        if (arg1 >= -123) {
            this.field1289 = -42;
        }
        field1277++;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BLoa;I)V")
    private final void method528(byte arg0, class33 arg1, int arg2) {
        field1275++;
        if (arg0 != -65) {
            this.field1280 = null;
        }
        int var4 = arg2 >> 5;
        class33 var5 = this.field1294[var4];
        if (var5 == null) {
            this.field1304[var4] = arg1;
        } else {
            var5.field518 = arg1;
        }
        this.field1294[var4] = arg1;
        arg1.field520 = arg2;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZ)V")
    private final void method529(int arg0, boolean arg1) {
        field1286++;
        if (!arg1) {
            return;
        }
        this.field1289 -= arg0;
        if (this.field1289 < 0) {
            this.field1289 = 0;
        }
        if (this.field1273 != null) {
            this.field1273.method251(arg0);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method530(Component arg0) throws Exception {
        field1302++;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "()V")
    public void method531() throws Exception {
        field1295++;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V")
    public final synchronized void method532(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field1276++;
        if (this.field1281) {
            return;
        }
        long var2 = class19.method91((byte) 119);
        try {
            if ((this.field1279 + 500000L) < var2) {
                this.field1279 = var2 - 500000L;
            }
            while (this.field1279 + 5000L < var2) {
                this.method529(256, true);
                this.field1279 += (256000 / class12.field141);
            }
        } catch (Exception var7) {
            this.field1279 = var2;
        }
        if (this.field1280 == null) {
            return;
        }
        try {
            if (this.field1298 != 0L) {
                if (this.field1298 > var2) {
                    return;
                }
                this.method525(this.field1297);
                this.field1298 = 0L;
                this.field1296 = true;
            }
            int var4 = this.method526();
            if (this.field1305 < this.field1308 - var4) {
                this.field1305 = this.field1308 - var4;
            }
            int var5 = this.field1293 + this.field1291;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field1297) {
                this.field1297 += 1024;
                if (this.field1297 > 16384) {
                    this.field1297 = 16384;
                }
                this.method543();
                var4 = 0;
                this.method525(this.field1297);
                this.field1296 = true;
                if (var5 + 256 > this.field1297) {
                    var5 = this.field1297 - 256;
                    this.field1291 = var5 - this.field1293;
                }
            }
            while (var4 < var5) {
                this.method539(this.field1280, 256);
                var4 += 256;
                this.method531();
            }
            if (var2 > this.field1301) {
                if (this.field1296) {
                    this.field1296 = false;
                } else if (this.field1305 == 0 && this.field1290 == 0) {
                    this.method543();
                    this.field1298 = var2 + 2000L;
                    return;
                } else {
                    this.field1291 = Math.min(this.field1290, this.field1305);
                    this.field1290 = this.field1305;
                }
                this.field1301 = var2 + 2000L;
                this.field1305 = 0;
            }
            this.field1308 = var4;
        } catch (Exception var6) {
            this.method543();
            this.field1298 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V")
    public final synchronized void method533(int arg0) {
        if (class471.field6995 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class471.field6995.field5222[var3] == this) {
                    class471.field6995.field5222[var3] = null;
                }
                if (class471.field6995.field5222[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class471.field6995.field5227 = true;
                while (class471.field6995.field5221) {
                    class444.method2667(-28210, 50L);
                }
                class471.field6995 = null;
            }
        }
        field1288++;
        this.method543();
        this.field1281 = true;
        this.field1280 = null;
        if (arg0 < 121) {
            this.method529(-76, true);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;)V")
    public static final void method534(String arg0, int arg1, boolean arg2, String arg3, String arg4, int arg5, int arg6, String arg7) {
        if (!arg2) {
            return;
        }
        for (int var8 = 99; var8 > 0; var8--) {
            class151.field2422[var8] = class151.field2422[var8 - 1];
            class400.field6105[var8] = class400.field6105[var8 - 1];
            class481.field7084[var8] = class481.field7084[var8 - 1];
            class140.field2328[var8] = class140.field2328[var8 - 1];
            class188.field2943[var8] = class188.field2943[var8 - 1];
            class200.field3181[var8] = class200.field3181[var8 - 1];
            class253.field4305[var8] = class253.field4305[var8 - 1];
        }
        field1306++;
        class151.field2422[0] = arg5;
        class481.field7084[0] = arg7;
        class400.field6105[0] = arg1;
        class140.field2328[0] = arg4;
        class188.field2943[0] = arg3;
        class200.field3181[0] = arg0;
        class505.field7356 = class78.field1368;
        class253.field4305[0] = arg6;
        class468.field6951++;
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)I")
    public static final int method535(int arg0) {
        field1303++;
        return arg0 < 4 ? -39 : 6;
    }

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "(I)V")
    public final void method536(int arg0) {
        this.field1296 = true;
        if (arg0 >= -16) {
            this.method539(null, -110);
        }
        field1299++;
    }

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "(I)V")
    public static void method537(int arg0) {
        field1310 = null;
        field1307 = null;
        if (arg0 >= 33) {
            field1283 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "()V")
    public void method538() throws Exception {
        field1274++;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "([II)V")
    private final void method539(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class175.field2777) {
            var3 = arg1 << 1;
        }
        class85.method608(arg0, 0, var3);
        this.field1289 -= arg1;
        if (this.field1273 != null && this.field1289 <= 0) {
            this.field1289 += class12.field141 >> 4;
            class309.method1964(-1, this.field1273);
            this.method528((byte) -65, this.field1273, this.field1273.method255());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class33 var10 = null;
                        class33 var11 = this.field1304[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class474 var12 = var11.field519;
                                if (var12 == null || var12.field7024 <= var8) {
                                    var11.field521 = true;
                                    int var13 = var11.method257();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field7024 += var13;
                                    }
                                    if (var4 >= this.field1272) {
                                        break label107;
                                    }
                                    class33 var14 = var11.method256();
                                    if (var14 != null) {
                                        int var15 = var11.field520;
                                        while (var14 != null) {
                                            this.method528((byte) -65, var14, var15 * var14.method255() >> 8);
                                            var14 = var11.method254();
                                        }
                                    }
                                    class33 var16 = var11.field518;
                                    var11.field518 = null;
                                    if (var10 == null) {
                                        this.field1304[var7] = var16;
                                    } else {
                                        var10.field518 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1294[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field518;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class33 var18 = this.field1304[var17];
                this.field1304[var17] = this.field1294[var17] = null;
                while (var18 != null) {
                    class33 var19 = var18.field518;
                    var18.field518 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field1289 < 0) {
            this.field1289 = 0;
        }
        if (this.field1273 != null) {
            this.field1273.method252(arg0, 0, arg1);
        }
        this.field1279 = class19.method91((byte) 112);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)V")
    public static final void method540(int arg0, int arg1) {
        field1282++;
        if (class32.field515 == arg1) {
            return;
        }
        if (class32.field515 == 0) {
            class190.method1285(126);
        }
        if (arg1 == 12) {
            class207.method1355(class533.field7837, (byte) -123, class68.field1058, class111.field1965);
        }
        if (arg1 != 12 && class91.field1515 != null) {
            class91.field1515.method2804(true);
            class91.field1515 = null;
        }
        if (arg1 == 2) {
            class381.method2409(class379.field5881 != class350.field5475, true);
        }
        if (~arg1 == arg0) {
            class292.method1881(class379.field5881 != class262.field4371, (byte) -51);
        }
        if (arg1 == 4) {
            class438.method2649(class533.field7837, class68.field1058, -2830);
        } else if (arg1 == 5) {
            class207.method1355(class533.field7837, (byte) 52, class68.field1058, class111.field1965);
        } else if (arg1 == 8) {
            class207.method1355(class533.field7837, (byte) 1, class68.field1058, class111.field1965);
        } else if (arg1 == 11) {
            class438.method2649(class533.field7837, class68.field1058, -2830);
        }
        if (class276.method1820(class32.field515, -109)) {
            class487.field7132.field7274 = 2;
            class536.field7870.field7274 = 2;
            class82.field1445.field7274 = 2;
            class18.field198.field7274 = 2;
            class490.field7161.field7274 = 2;
            class388.field5969.field7274 = 2;
            class516.field7627.field7274 = 2;
        }
        if (class276.method1820(arg1, -117)) {
            class340.field5329 = 1;
            class485.field7117 = 0;
            class509.field7393 = 0;
            class517.field7647 = 0;
            class290.field4719 = 1;
            class118.method942(true, 25616);
            class487.field7132.field7274 = 1;
            class536.field7870.field7274 = 1;
            class82.field1445.field7274 = 1;
            class18.field198.field7274 = 1;
            class490.field7161.field7274 = 1;
            class388.field5969.field7274 = 1;
            class516.field7627.field7274 = 1;
        }
        if (arg1 == 10 || arg1 == 2) {
            class215.method1491(-104);
        }
        if (arg1 == 1) {
            class86.method614(2, class536.field7881, class305.field4873);
        } else {
            class66.method429((byte) -124);
        }
        boolean var2 = arg1 == 1 || class13.method70(1001, arg1) || class7.method48((byte) -122, arg1);
        boolean var3 = class32.field515 == 1 || class13.method70(1001, class32.field515) || class7.method48((byte) -114, class32.field515);
        if (var2 != var3) {
            if (var2) {
                class282.field4615 = class434.field6483;
                if (class510.field7403.field5087 == 0) {
                    class51.method364(2, 4096);
                } else {
                    class364.method2321(false, 1, class510.field7403.field5087, class434.field6483, 2, class29.field472, 0);
                }
                class78.field1366.method1560(false, 4);
            } else {
                class51.method364(2, 4096);
                class78.field1366.method1560(true, 4);
            }
        }
        if (class276.method1820(arg1, arg0 ^ 0x74) || arg1 == 12) {
            class305.field4873.method888();
        }
        class32.field515 = arg1;
    }

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "(I)V")
    public final synchronized void method541(int arg0) {
        field1285++;
        this.field1296 = true;
        try {
            this.method538();
        } catch (Exception var2) {
            this.method543();
            this.field1298 = class19.method91((byte) 118) + 2000L;
        }
        if (arg0 != 2000) {
            this.method536(-73);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I[ILch;[I[I)V")
    public static final void method542(int arg0, int[] arg1, class166 arg2, int[] arg3, int[] arg4) {
        for (int var5 = arg0; var5 < arg3.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg4[var5];
            int var8 = arg1[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg2.field3123.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg2.field3123[var9] = null;
                    } else {
                        class145 var10 = class130.field2232.method634(-1271654143, var6);
                        int var11 = var10.field2367;
                        class63 var12 = arg2.field3123[var9];
                        if (var12 != null) {
                            if (var12.field939 == var6) {
                                if (var11 == 0) {
                                    var12 = arg2.field3123[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field947 = 0;
                                    var12.field943 = var8;
                                    var12.field942 = 0;
                                    var12.field940 = 0;
                                    var12.field945 = 1;
                                    class172.method1167(arg2.field4714, 0, arg2.field4720, arg2.field4716, class302.field4850 == arg2, var10, (byte) 115);
                                } else if (var11 == 2) {
                                    var12.field947 = 0;
                                }
                            } else if (var10.field2371 >= class130.field2232.method634(-1271654143, var12.field939).field2371) {
                                var12 = arg2.field3123[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class63 var13 = arg2.field3123[var9] = new class63();
                            var13.field940 = 0;
                            var13.field942 = 0;
                            var13.field947 = 0;
                            var13.field939 = var6;
                            var13.field945 = 1;
                            var13.field943 = var8;
                            class172.method1167(arg2.field4714, 0, arg2.field4720, arg2.field4716, class302.field4850 == arg2, var10, (byte) 54);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        field1278++;
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "()V")
    public void method543() {
        field1292++;
    }
}
