import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class199 implements Runnable {

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "Z")
    private boolean field3386 = false;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "Z")
    private boolean field3387 = false;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    private int field3385 = 0;

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
    private int field3411 = 0;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "Lui;")
    private class251 field3389;

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "Ljava/net/Socket;")
    private Socket field3408;

    @OriginalMember(owner = "client!lb", name = "F", descriptor = "Ljava/io/InputStream;")
    private InputStream field3414;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3383;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "Lbe;")
    private static class283 field3393 = class153.method941(125, "Jan");

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "Lbe;")
    private static class283 field3401 = class153.method941(127, "May");

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "Lbe;")
    private static class283 field3394 = class153.method941(8, "Jul");

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "Lbe;")
    private static class283 field3395 = class153.method941(126, "Sep");

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Lbe;")
    private static class283 field3388 = class153.method941(127, "Oct");

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field3397 = 2301979;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "Lbe;")
    private static class283 field3404 = class153.method941(-47, "Dec");

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "Lbe;")
    private static class283 field3409 = class153.method941(-32, "Mar");

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "Lbe;")
    private static class283 field3390 = class153.method941(127, "Nov");

    @OriginalMember(owner = "client!lb", name = "G", descriptor = "Lbe;")
    private static class283 field3415 = class153.method941(126, "Apr");

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "Lbe;")
    private static class283 field3400 = class153.method941(126, "Jun");

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "Lbe;")
    private static class283 field3406 = class153.method941(-66, "Aug");

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "Lbe;")
    private static class283 field3384 = class153.method941(127, "Feb");

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "[Lbe;")
    public static class283[] field3407 = new class283[] { field3393, field3384, field3409, field3415, field3401, field3400, field3394, field3406, field3395, field3388, field3390, field3404 };

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!lb", name = "E", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!lb", name = "H", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!lb", name = "I", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!lb", name = "D", descriptor = "Lek;")
    public static class172 field3412;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "Ldj;")
    private class310 field3391;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "[B")
    private byte[] field3403;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "[[Lsf;")
    public static class100[][] field3396;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILek;Z)Lhe;", line = 8)
    public static final class87 method1276(int arg0, class172 arg1, boolean arg2) {
        field3410++;
        if (arg2) {
            return (class87) null;
        } else if (class246.method1675((byte) 19, arg0, arg1)) {
            return class243.method1639(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIII)V", line = 24)
    public static final void method1277(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class116 var7 = new class116();
        var7.field1970 = arg1 / 128;
        var7.field1959 = arg2 / 128;
        var7.field1975 = arg3 / 128;
        var7.field1951 = arg4 / 128;
        var7.field1961 = arg0;
        var7.field1955 = arg1;
        var7.field1960 = arg2;
        var7.field1956 = arg3;
        var7.field1973 = arg4;
        var7.field1954 = arg5;
        var7.field1953 = arg6;
        class12.field120[class46.field637++] = var7;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[BIB)V", line = 40)
    public final void method1278(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        field3402++;
        if (this.field3387) {
            return;
        }
        if (this.field3386) {
            this.field3386 = false;
            throw new IOException();
        }
        if (this.field3403 == null) {
            this.field3403 = new byte[5000];
        }
        synchronized (this) {
            if (arg3 != -37) {
                this.method1282(true);
            }
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field3403[this.field3411] = arg1[arg2 + var6];
                this.field3411 = (this.field3411 + 1) % 5000;
                if ((this.field3385 + 4900) % 5000 == this.field3411) {
                    throw new IOException();
                }
            }
            if (this.field3391 == null) {
                this.field3391 = this.field3389.method1691(3, 25, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!lb", name = "run", descriptor = "()V", line = 97)
    public final void run() {
        try {
            while (true) {
                int var3;
                int var4;
                label90: {
                    synchronized (this) {
                        label91: {
                            if (this.field3411 == this.field3385) {
                                if (this.field3387) {
                                    break label91;
                                }
                                try {
                                    this.wait();
                                } catch (InterruptedException var13) {
                                }
                            }
                            var3 = this.field3385;
                            if (this.field3385 <= this.field3411) {
                                var4 = this.field3411 - this.field3385;
                            } else {
                                var4 = 5000 - this.field3385;
                            }
                            break label90;
                        }
                    }
                    try {
                        if (this.field3414 != null) {
                            this.field3414.close();
                        }
                        if (this.field3383 != null) {
                            this.field3383.close();
                        }
                        if (this.field3408 != null) {
                            this.field3408.close();
                        }
                    } catch (IOException var10) {
                    }
                    this.field3403 = null;
                    break;
                }
                if (var4 > 0) {
                    try {
                        this.field3383.write(this.field3403, var3, var4);
                    } catch (IOException var12) {
                        this.field3386 = true;
                    }
                    this.field3385 = (this.field3385 + var4) % 5000;
                    try {
                        if (this.field3411 == this.field3385) {
                            this.field3383.flush();
                        }
                    } catch (IOException var11) {
                        this.field3386 = true;
                    }
                }
            }
        } catch (Exception var15) {
            class296.method2011(true, (String) null, var15);
        }
        field3398++;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Ljava/net/Socket;Lui;)V", line = 1352)
    public class199(Socket arg0, class251 arg1) throws IOException {
        this.field3389 = arg1;
        this.field3408 = arg0;
        this.field3408.setSoTimeout(30000);
        this.field3408.setTcpNoDelay(true);
        this.field3414 = this.field3408.getInputStream();
        this.field3383 = this.field3408.getOutputStream();
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[BII)V", line = 185)
    public final void method1279(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field3392++;
        if (arg3 > -81) {
            this.method1282(true);
        }
        if (this.field3387) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field3414.read(arg1, arg0, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 += var5;
            arg2 -= var5;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)I", line = 249)
    public final int method1280(byte arg0) throws IOException {
        field3413++;
        if (this.field3387) {
            return 0;
        } else if (arg0 == 63) {
            return this.field3414.read();
        } else {
            return -123;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V", line = 275)
    public static void method1281(byte arg0) {
        field3406 = null;
        field3409 = null;
        field3412 = null;
        field3388 = null;
        if (arg0 != 98) {
            field3388 = (class283) null;
        }
        field3415 = null;
        field3390 = null;
        field3395 = null;
        field3384 = null;
        field3393 = null;
        field3396 = (class100[][]) null;
        field3407 = null;
        field3400 = null;
        field3394 = null;
        field3404 = null;
        field3401 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V", line = 308)
    public final void method1282(boolean arg0) {
        field3399++;
        if (this.field3387) {
            return;
        }
        synchronized (this) {
            this.field3387 = arg0;
            this.notifyAll();
        }
        if (this.field3391 != null) {
            while (this.field3391.field5293 == 0) {
                class2.method11((byte) -20, 1L);
            }
            if (this.field3391.field5293 == 1) {
                try {
                    ((Thread) this.field3391.field5296).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field3391 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 344)
    public static final void method1283(int arg0) {
        field3417++;
        if (class134.field2246 > 0) {
            class134.field2246--;
        }
        if (class302.field5115 > 1) {
            class279.field4662 = class252.field4284;
            class302.field5115--;
        }
        if (class86.field1455) {
            class86.field1455 = false;
            class171.method1088(3796);
            return;
        }
        for (int var1 = 0; var1 < 100 && class150.method925(-92); var1++) {
        }
        if (class175.field3019 != 30) {
            return;
        }
        class247.method1681(class228.field3831, 90, 63);
        Object var2 = class257.field4334.field231;
        synchronized (class257.field4334.field231) {
            if (!class33.field494) {
                class257.field4334.field239 = 0;
            } else if (class61.field859 != 0 || class257.field4334.field239 >= 40) {
                class287.field4888++;
                class228.field3831.method621(125, 8);
                int var3 = 0;
                class228.field3831.method1499(true, 0);
                int var4 = class228.field3831.field3905;
                for (int var5 = 0; var5 < class257.field4334.field239 && (class228.field3831.field3905 - var4) < 240; var5++) {
                    var3++;
                    int var6 = class257.field4334.field240[var5];
                    int var7 = class257.field4334.field238[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    boolean var8 = false;
                    if (class257.field4334.field240[var5] == -1 && class257.field4334.field238[var5] == -1) {
                        var6 = -1;
                        var7 = -1;
                        var8 = true;
                    }
                    if (class97.field1628 != var7 || class295.field5004 != var6) {
                        int var9 = var7 - class97.field1628;
                        class97.field1628 = var7;
                        int var10 = var6 - class295.field5004;
                        class295.field5004 = var6;
                        if (class112.field1893 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class228.field3831.method1510((byte) 56, (class112.field1893 << 12) + (var9 << 6) + var10);
                            class112.field1893 = 0;
                        } else if (class112.field1893 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var9 += 128;
                            class228.field3831.method1499(true, class112.field1893 + 128);
                            var10 += 128;
                            class228.field3831.method1510((byte) 117, (var9 << 8) + var10);
                            class112.field1893 = 0;
                        } else if (class112.field1893 < 32) {
                            class228.field3831.method1499(true, class112.field1893 + 192);
                            if (var8) {
                                class228.field3831.method1515(Integer.MIN_VALUE, 111);
                            } else {
                                class228.field3831.method1515(var7 | var6 << 16, 102);
                            }
                            class112.field1893 = 0;
                        } else {
                            class228.field3831.method1510((byte) 116, class112.field1893 + 57344);
                            if (var8) {
                                class228.field3831.method1515(Integer.MIN_VALUE, 126);
                            } else {
                                class228.field3831.method1515(var7 | var6 << 16, 64);
                            }
                            class112.field1893 = 0;
                        }
                    } else if (class112.field1893 < 2047) {
                        class112.field1893++;
                    }
                }
                class228.field3831.method1511(class228.field3831.field3905 - var4, -51);
                if (var3 >= class257.field4334.field239) {
                    class257.field4334.field239 = 0;
                } else {
                    class257.field4334.field239 -= var3;
                    for (int var11 = 0; var11 < class257.field4334.field239; var11++) {
                        class257.field4334.field238[var11] = class257.field4334.field238[var3 + var11];
                        class257.field4334.field240[var11] = class257.field4334.field240[var11 + var3];
                    }
                }
            }
        }
        if (class61.field859 != 0) {
            class263.field4479++;
            long var13 = (class116.field1974 - class35.field520) / 50L;
            class35.field520 = class116.field1974;
            int var15 = class269.field4537;
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            int var17 = (int) var13;
            if (class61.field859 == 2) {
                var16 = 1;
            }
            int var18 = class47.field647;
            class228.field3831.method621(44, 8);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 65535) {
                var18 = 65535;
            }
            class228.field3831.method1540(var17 | var16 << 15, (byte) -90);
            class228.field3831.method1501(var15 << 16 | var18, -14657);
        }
        if (class252.field4280 > 0) {
            class252.field4280--;
        }
        if (class246.field4178[96] || class246.field4178[97] || class246.field4178[98] || class246.field4178[99]) {
            class7.field81 = true;
        }
        if (class7.field81 && class252.field4280 <= 0) {
            class7.field81 = false;
            class252.field4280 = 20;
            class228.field3831.method621(40, 8);
            class228.field3831.method1510((byte) 44, class203.field3477);
            class24.field368++;
            class228.field3831.method1540(class172.field2908, (byte) 118);
        }
        if (class18.field222 && !class286.field4871) {
            class261.field4435++;
            class286.field4871 = true;
            class228.field3831.method621(146, 8);
            class228.field3831.method1499(true, 1);
        }
        if (!class18.field222 && class286.field4871) {
            class261.field4435++;
            class286.field4871 = false;
            class228.field3831.method621(146, 8);
            class228.field3831.method1499(true, 0);
        }
        if (!class202.field3450) {
            class228.field3831.method621(229, 8);
            class228.field3831.method1516(class79.method521(0), 2051576880);
            class30.field457++;
            class202.field3450 = true;
        }
        class53.method339(0);
        if (class175.field3019 != 30) {
            return;
        }
        class256.method1729(-1);
        class77.method508(-12451);
        class145.field2394++;
        if (class145.field2394 > 750) {
            class171.method1088(3796);
            return;
        }
        class261.method1763(2076);
        class229.method1550(0);
        class159.method971(false);
        if (class91.field1530 != null) {
            class227.method1489(17657);
        }
        for (int var19 = class89.method579(100, true); var19 != -1; var19 = class89.method579(100, false)) {
            class42.method255(var19, -10);
            class177.field3052[class178.method1174(31, class237.field3970++)] = var19;
        }
        for (class72 var20 = class192.method1245((byte) -68); var20 != null; var20 = class192.method1245((byte) -83)) {
            int var21 = var20.method478(20731);
            int var22 = var20.method483(false);
            if (var21 == 1) {
                class81.field1376[var22] = var20.field1265;
                class262.field4452[class178.method1174(31, class241.field4067++)] = var22;
            } else if (var21 == 2) {
                class83.field1406[var22] = var20.field1271;
                class277.field4624[class178.method1174(31, class241.field4073++)] = var22;
            } else if (var21 == 3) {
                class69 var42 = class65.method418(-8429, var22);
                if (!var20.field1271.method1926(-16620, var42.field1023)) {
                    var42.field1023 = var20.field1271;
                    class272.method1834(var42, 0);
                }
            } else if (var21 == 4) {
                class69 var39 = class65.method418(-8429, var22);
                int var40 = var20.field1265;
                int var41 = var20.field1268;
                if (var39.field1072 != var40 || var39.field1057 != var41) {
                    var39.field1057 = var41;
                    var39.field1072 = var40;
                    class272.method1834(var39, 0);
                }
            } else if (var21 == 5) {
                class69 var38 = class65.method418(-8429, var22);
                if (var20.field1265 != var38.field1052 || var20.field1265 == -1) {
                    var38.field1075 = 0;
                    var38.field1052 = var20.field1265;
                    var38.field1088 = 0;
                    class272.method1834(var38, 0);
                }
            } else if (var21 == 6) {
                int var23 = var20.field1265;
                int var24 = var23 >> 10 & 0x1F;
                int var25 = var23 >> 5 & 0x1F;
                int var26 = var23 & 0x1F;
                int var27 = (var25 << 11) + ((var24 << 19) + (var26 << 3));
                class69 var28 = class65.method418(-8429, var22);
                if (var28.field994 != var27) {
                    var28.field994 = var27;
                    class272.method1834(var28, 0);
                }
            } else if (var21 == 7) {
                class69 var29 = class65.method418(-8429, var22);
                boolean var30 = var20.field1265 == 1;
                if (var29.field1127 != var30) {
                    var29.field1127 = var30;
                    class272.method1834(var29, 0);
                }
            } else if (var21 == 8) {
                class69 var37 = class65.method418(-8429, var22);
                if (var20.field1265 != var37.field1099 || var20.field1268 != var37.field977 || var20.field1262 != var37.field1007) {
                    var37.field977 = var20.field1268;
                    var37.field1007 = var20.field1262;
                    if (var37.field1013 != -1) {
                        if (var37.field980 > 0) {
                            var37.field1007 = var37.field1007 * 32 / var37.field980;
                        } else if (var37.field1087 > 0) {
                            var37.field1007 = var37.field1007 * 32 / var37.field1087;
                        }
                    }
                    var37.field1099 = var20.field1265;
                    class272.method1834(var37, 0);
                }
            } else if (var21 == 9) {
                class69 var31 = class65.method418(-8429, var22);
                if (var20.field1265 != var31.field1013 || var20.field1268 != var31.field1061) {
                    var31.field1061 = var20.field1268;
                    var31.field1013 = var20.field1265;
                    class272.method1834(var31, 0);
                }
            } else if (var21 == 10) {
                class69 var36 = class65.method418(-8429, var22);
                if (var20.field1265 != var36.field1076 || var20.field1268 != var36.field1078 || var20.field1262 != var36.field1006) {
                    var36.field1076 = var20.field1265;
                    var36.field1078 = var20.field1268;
                    var36.field1006 = var20.field1262;
                    class272.method1834(var36, 0);
                }
            } else if (var21 == 11) {
                class69 var35 = class65.method418(-8429, var22);
                var35.field1097 = 0;
                var35.field1135 = var35.field1111 = var20.field1265;
                var35.field1102 = 0;
                var35.field1128 = var35.field1041 = var20.field1268;
                class272.method1834(var35, 0);
            } else if (var21 == 12) {
                class69 var33 = class65.method418(-8429, var22);
                int var34 = var20.field1265;
                if (var33 != null && var33.field1143 == 0) {
                    if (var34 > var33.field987 - var33.field1085) {
                        var34 = var33.field987 - var33.field1085;
                    }
                    if (var34 < 0) {
                        var34 = 0;
                    }
                    if (var33.field1098 != var34) {
                        var33.field1098 = var34;
                        class272.method1834(var33, 0);
                    }
                }
            } else if (var21 == 13) {
                class69 var32 = class65.method418(-8429, var22);
                var32.field1025 = var20.field1265;
            }
        }
        if (class273.field4588 != 0) {
            class140.field2339 += 20;
            if (class140.field2339 >= 400) {
                class273.field4588 = 0;
            }
        }
        class44.field606++;
        if (class2.field19 != null) {
            class53.field712++;
            if (class53.field712 >= 15) {
                class272.method1834(class2.field19, 0);
                class2.field19 = null;
            }
        }
        if (class195.field3332 != null) {
            class272.method1834(class195.field3332, 0);
            class72.field1276++;
            if (class109.field1849 > class291.field4932 + 5 || class109.field1849 < (class291.field4932 - 5) || class114.field1918 + 5 < class163.field2700 || class114.field1918 - 5 > class163.field2700) {
                class124.field2066 = true;
            }
            if (class177.field3051 == 0) {
                if (class124.field2066 && class72.field1276 >= 5) {
                    if (class62.field867 == class195.field3332 && class57.field781 != class134.field2242) {
                        class172.field2894++;
                        class69 var43 = class195.field3332;
                        byte var44 = 0;
                        if (class298.field5051 == 1 && var43.field975 == 206) {
                            var44 = 1;
                        }
                        if (var43.field1073[class57.field781] <= 0) {
                            var44 = 0;
                        }
                        if (class111.method732(-1, client.method1601(var43))) {
                            int var45 = class57.field781;
                            int var46 = class134.field2242;
                            var43.field1073[var45] = var43.field1073[var46];
                            var43.field973[var45] = var43.field973[var46];
                            var43.field1073[var46] = -1;
                            var43.field973[var46] = 0;
                        } else if (var44 == 1) {
                            int var47 = class134.field2242;
                            int var48 = class57.field781;
                            while (var47 != var48) {
                                if (var48 < var47) {
                                    var43.method448(96, var47 - 1, var47);
                                    var47--;
                                } else if (var48 > var47) {
                                    var43.method448(96, var47 + 1, var47);
                                    var47++;
                                }
                            }
                        } else {
                            var43.method448(96, class57.field781, class134.field2242);
                        }
                        class228.field3831.method621(123, 8);
                        class228.field3831.method1498(var44, false);
                        class228.field3831.method1540(class134.field2242, (byte) 103);
                        class228.field3831.method1533(true, class57.field781);
                        class228.field3831.method1516(class195.field3332.field1079, 2051576880);
                    }
                } else if ((class61.field856 == 1 || class77.method502(class42.field589 - 1, true)) && class42.field589 > 2) {
                    class68.method429(15303);
                } else if (class42.field589 > 0) {
                    class49.method287(15);
                }
                class195.field3332 = null;
                class61.field859 = 0;
                class53.field712 = 10;
            }
        }
        class38.field548 = false;
        class137.field2277 = false;
        class228.field3838 = 0;
        class69 var49 = class117.field1978;
        class117.field1978 = null;
        class176.field3026 = null;
        class69 var50 = class282.field4774;
        class282.field4774 = null;
        while (class87.method558((byte) -125) && class228.field3838 < 128) {
            class302.field5104[class228.field3838] = class35.field523;
            class94.field1595[class228.field3838] = class215.field3652;
            class228.field3838++;
        }
        class91.field1530 = null;
        if (class82.field1397 != -1) {
            class295.method2004(1, 0, 0, class82.field1397, 0, class115.field1945, 0, class48.field655);
        }
        class252.field4284++;
        while (true) {
            class231 var51;
            class69 var52;
            class69 var53;
            do {
                var51 = (class231) class270.field4559.method1814(false);
                if (var51 == null) {
                    while (true) {
                        class231 var54;
                        class69 var55;
                        class69 var56;
                        do {
                            var54 = (class231) class112.field1886.method1814(false);
                            if (var54 == null) {
                                while (true) {
                                    class231 var57;
                                    class69 var58;
                                    class69 var59;
                                    do {
                                        var57 = (class231) class254.field4294.method1814(false);
                                        if (var57 == null) {
                                            if (class52.field707 && class91.field1530 == null) {
                                                class52.field707 = false;
                                            }
                                            if (class20.field274 != null) {
                                                class75.method497(6353);
                                            }
                                            if (class299.field5067 > 0 && class246.field4178[82] && class246.field4178[81] && class229.field3908 != 0) {
                                                int var60 = class61.field850 - class229.field3908;
                                                if (var60 < 0) {
                                                    var60 = 0;
                                                } else if (var60 > 3) {
                                                    var60 = 3;
                                                }
                                                class166.method1021(1998761094, var60, class213.field3624.field1150[0] + class107.field1833, class214.field3637 - -class213.field3624.field1178[0]);
                                            }
                                            if (class263.field4473 != -1) {
                                                int var61 = class263.field4473;
                                                int var62 = class27.field411;
                                                if (class299.field5067 > 0 && class246.field4178[82] && class246.field4178[81]) {
                                                    class166.method1021(1998761094, class61.field850, class107.field1833 + var62, class214.field3637 - -var61);
                                                } else if (class35.field519) {
                                                    class37.field538++;
                                                    class228.field3831.method621(73, 8);
                                                    class228.field3831.method1515(class143.field2373, 127);
                                                    class228.field3831.method1540(class214.field3637 + var61, (byte) -123);
                                                    class228.field3831.method1533(true, class175.field3023);
                                                    class228.field3831.method1513(class107.field1833 + var62, (byte) 98);
                                                    class222.field3735 = class47.field647;
                                                    class140.field2339 = 0;
                                                    class90.field1527 = class269.field4537;
                                                    class273.field4588 = 1;
                                                } else {
                                                    boolean var63 = class53.method335(class213.field3624.field1150[0], 0, 0, 1, class213.field3624.field1178[0], var62, var61, 0, true, 0, 0, 0);
                                                    if (var63) {
                                                        class222.field3735 = class47.field647;
                                                        class90.field1527 = class269.field4537;
                                                        class273.field4588 = 1;
                                                        class140.field2339 = 0;
                                                    }
                                                }
                                                class263.field4473 = -1;
                                                class35.field519 = false;
                                            }
                                            class68.method435(122);
                                            if (class117.field1978 != var49) {
                                                if (var49 != null) {
                                                    class272.method1834(var49, 0);
                                                }
                                                if (class117.field1978 != null) {
                                                    class272.method1834(class117.field1978, 0);
                                                }
                                            }
                                            if (class282.field4774 != var50 && class155.field2553 == class154.field2526) {
                                                if (var50 != null) {
                                                    class272.method1834(var50, 0);
                                                }
                                                if (class282.field4774 != null) {
                                                    class272.method1834(class282.field4774, 0);
                                                }
                                            }
                                            if (class282.field4774 == null) {
                                                if (class155.field2553 > 0) {
                                                    class155.field2553--;
                                                }
                                            } else if (class155.field2553 < class154.field2526) {
                                                class155.field2553++;
                                                if (class155.field2553 == class154.field2526) {
                                                    class272.method1834(class282.field4774, 0);
                                                }
                                            }
                                            if (class26.field377 == 1) {
                                                class69.method437((byte) 85);
                                            } else if (class26.field377 == 2) {
                                                class134.method830(7515);
                                            } else {
                                                class38.method238(true);
                                            }
                                            for (int var64 = 0; var64 < 5; var64++) {
                                                int var10002 = class31.field479[var64]++;
                                            }
                                            int var65 = class286.method1965(true);
                                            int var66 = class236.method1578(-31624);
                                            if (var65 > 4500 && var66 > 4500) {
                                                class40.field559++;
                                                class134.field2246 = 250;
                                                class34.method226(4000, 14195);
                                                class228.field3831.method621(157, 8);
                                            }
                                            if (class92.field1548 != null && class92.field1548.field5293 == 1) {
                                                if (class92.field1548.field5296 != null) {
                                                    class226.method1482(class278.field4651, class38.field550, -17397);
                                                }
                                                class278.field4651 = null;
                                                class38.field550 = false;
                                                class92.field1548 = null;
                                            }
                                            class5.field44++;
                                            class19.field234++;
                                            class177.field3043++;
                                            if (class177.field3043 > 500) {
                                                class177.field3043 = 0;
                                                int var67 = (int) (Math.random() * 8.0D);
                                                if ((var67 & 0x1) == 1) {
                                                    class126.field2094 += class196.field3344;
                                                }
                                                if ((var67 & 0x4) == 4) {
                                                    class162.field2663 += class10.field90;
                                                }
                                                if ((var67 & 0x2) == 2) {
                                                    class94.field1593 += class290.field4917;
                                                }
                                            }
                                            if (class94.field1593 < -55) {
                                                class290.field4917 = 2;
                                            }
                                            if (class126.field2094 < -50) {
                                                class196.field3344 = 2;
                                            }
                                            if (class162.field2663 < -40) {
                                                class10.field90 = 1;
                                            }
                                            int var68 = 119 % ((62 - arg0) / 46);
                                            if (class126.field2094 > 50) {
                                                class196.field3344 = -2;
                                            }
                                            if (class5.field44 > 500) {
                                                class5.field44 = 0;
                                                int var69 = (int) (Math.random() * 8.0D);
                                                if ((var69 & 0x1) == 1) {
                                                    class88.field1497 += class16.field181;
                                                }
                                                if ((var69 & 0x2) == 2) {
                                                    class24.field358 += class194.field3319;
                                                }
                                            }
                                            if (class94.field1593 > 55) {
                                                class290.field4917 = -2;
                                            }
                                            if (class88.field1497 < -60) {
                                                class16.field181 = 2;
                                            }
                                            if (class24.field358 < -20) {
                                                class194.field3319 = 1;
                                            }
                                            if (class24.field358 > 10) {
                                                class194.field3319 = -1;
                                            }
                                            if (class88.field1497 > 60) {
                                                class16.field181 = -2;
                                            }
                                            if (class162.field2663 > 40) {
                                                class10.field90 = -1;
                                            }
                                            if (class19.field234 > 50) {
                                                class197.field3373++;
                                                class228.field3831.method621(250, 8);
                                            }
                                            if (class286.field4870) {
                                                class213.method1407((byte) -110);
                                                class286.field4870 = false;
                                            }
                                            try {
                                                if (class263.field4484 != null && class228.field3831.field3905 > 0) {
                                                    class263.field4484.method1278(class228.field3831.field3905, class228.field3831.field3879, 0, (byte) -37);
                                                    class19.field234 = 0;
                                                    class228.field3831.field3905 = 0;
                                                }
                                            } catch (IOException var71) {
                                                class171.method1088(3796);
                                            }
                                            return;
                                        }
                                        var58 = var57.field3912;
                                        if (var58.field1126 < 0) {
                                            break;
                                        }
                                        var59 = class65.method418(-8429, var58.field1059);
                                    } while (var59 == null || var59.field1043 == null || var58.field1126 >= var59.field1043.length || var59.field1043[var58.field1126] != var58);
                                    class194.method1253(var57, 21258);
                                }
                            }
                            var55 = var54.field3912;
                            if (var55.field1126 < 0) {
                                break;
                            }
                            var56 = class65.method418(-8429, var55.field1059);
                        } while (var56 == null || var56.field1043 == null || var56.field1043.length <= var55.field1126 || var56.field1043[var55.field1126] != var55);
                        class194.method1253(var54, 21258);
                    }
                }
                var52 = var51.field3912;
                if (var52.field1126 < 0) {
                    break;
                }
                var53 = class65.method418(-8429, var52.field1059);
            } while (var53 == null || var53.field1043 == null || var52.field1126 >= var53.field1043.length || var53.field1043[var52.field1126] != var52);
            class194.method1253(var51, 21258);
        }
    }

    @OriginalMember(owner = "client!lb", name = "finalize", descriptor = "()V", line = 1311)
    protected final void finalize() {
        this.method1282(true);
        field3405++;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)I", line = 1323)
    public final int method1284(int arg0) throws IOException {
        if (arg0 != -1) {
            field3388 = (class283) null;
        }
        field3416++;
        return this.field3387 ? 0 : this.field3414.available();
    }
}
