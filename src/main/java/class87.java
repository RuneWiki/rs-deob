import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class87 {

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    private int field1371 = 65000;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "Lhd;")
    private class288 field1380 = null;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "Lhd;")
    private class288 field1377 = null;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    private int field1378;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BLjl;)V")
    public static final void method575(byte arg0, class101 arg1) {
        class35.field508 = arg1;
        field1370++;
        if (arg0 >= -70) {
            method577((class187) null, (byte) -9);
        }
        class271.field4759 = class35.field508.method672(4, (byte) 127);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Llb;I)V")
    public static final void method576(class207 arg0, int arg1) {
        field1373++;
        class15 var2 = null;
        class68.field1088 = 3;
        class226.method1575(-119, true);
        class40.field646 = true;
        class156.field2602 = 127;
        class36.field517 = true;
        class116.field1983 = 0;
        class74.field1162 = 0;
        class120.field2034 = true;
        class232.field4013 = true;
        class31.field461 = true;
        class78.field1217 = true;
        class144.field2467 = true;
        class271.field4754 = true;
        class198.field3366 = true;
        client.field1895 = true;
        class24.field315 = 0;
        class151.field2544 = 127;
        class23.field300 = 2;
        int var3 = -44 % ((23 - arg1) / 62);
        class252.field4507 = 255;
        class35.field492 = 0;
        class124.field2083 = true;
        class193.method1328(2);
        class121.field2037 = 0;
        class285.field5024 = false;
        class240.field4265 = 0;
        class202.field3458 = false;
        try {
            class251 var4 = arg0.method1434("runescape", 1);
            while (var4.field4488 == 0) {
                class144.method1008(104, 1L);
            }
            if (var4.field4488 == 1) {
                var2 = (class15) var4.field4483;
                byte[] var5 = new byte[(int) var2.method115((byte) 127)];
                int var7;
                for (int var6 = 0; var6 < var5.length; var6 += var7) {
                    var7 = var2.method111(-85, var5.length - var6, var6, var5);
                    if (var7 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class1.method6(new class187(var5), 2);
            }
        } catch (Exception var9) {
        }
        try {
            if (var2 != null) {
                var2.method116(10388);
            }
        } catch (Exception var8) {
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lva;B)Lwi;")
    public static final class178 method577(class187 arg0, byte arg1) {
        int var2 = -44 % ((72 - arg1) / 35);
        class178 var3 = new class178();
        field1374++;
        var3.field2978 = arg0.method1244(false);
        var3.field2967 = class1.method2(var3.field2978, (byte) -90);
        return var3;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([BIII)Z")
    public final boolean method578(byte[] arg0, int arg1, int arg2, int arg3) {
        field1382++;
        class288 var5 = this.field1377;
        synchronized (this.field1377) {
            if (arg2 < 0 || arg2 > this.field1371) {
                throw new IllegalArgumentException();
            }
            if (arg3 < 51) {
                this.field1380 = null;
            }
            boolean var6 = this.method581(true, arg2, (byte) -61, arg0, arg1);
            if (!var6) {
                var6 = this.method581(false, arg2, (byte) -100, arg0, arg1);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IB)[B")
    public final byte[] method579(int arg0, byte arg1) {
        field1375++;
        class288 var3 = this.field1377;
        synchronized (this.field1377) {
            try {
                if (arg1 >= -61) {
                    method577((class187) null, (byte) 51);
                }
                if ((long) (arg0 * 6 + 6) > this.field1380.method1933(0)) {
                    return null;
                }
                this.field1380.method1924((long) (arg0 * 6), (byte) -71);
                this.field1380.method1930(class115.field1957, 6, -2408, 0);
                int var5 = (class115.field1957[5] & 0xFF) + ((class115.field1957[3] & 0xFF) << 16) + (class115.field1957[4] & 0xFF << 8);
                int var6 = (class115.field1957[2] & 0xFF) + ((class115.field1957[0] & 0xFF) << 16) + ((class115.field1957[1] & 0xFF) << 8);
                if (var6 < 0 || var6 > this.field1371) {
                    return null;
                } else if (var5 > 0 && (this.field1377.method1933(0) / 520L) >= ((long) var5)) {
                    byte[] var9 = new byte[var6];
                    int var10 = 0;
                    int var11 = 0;
                    label72: while (var6 > var11) {
                        if (var5 == 0) {
                            return null;
                        }
                        this.field1377.method1924((long) (var5 * 520), (byte) -71);
                        int var13 = var6 - var11;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field1377.method1930(class115.field1957, var13 + 8, -2408, 0);
                        int var14 = (class115.field1957[5] & 0xFF << 8) + ((class115.field1957[4] & 0xFF) << 16) + (class115.field1957[6] & 0xFF);
                        int var15 = class115.field1957[7] & 0xFF;
                        int var16 = (class115.field1957[0] & 0xFF << 8) + (class115.field1957[1] & 0xFF);
                        int var17 = (class115.field1957[2] & 0xFF << 8) + (class115.field1957[3] & 0xFF);
                        if (arg0 == var16 && var10 == var17 && this.field1378 == var15) {
                            if (var14 >= 0 && this.field1377.method1933(0) / 520L >= (long) var14) {
                                var10++;
                                var5 = var14;
                                int var20 = 0;
                                while (true) {
                                    if (var13 <= var20) {
                                        continue label72;
                                    }
                                    var9[var11++] = class115.field1957[var20 + 8];
                                    var20++;
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public static final void method580(int arg0) {
        int var1 = 8 / ((arg0 - 65) / 43);
        field1369++;
        for (class81 var2 = (class81) class140.field2402.method1566(-3); var2 != null; var2 = (class81) class140.field2402.method1570(3)) {
            if (var2.field1263 == -1) {
                var2.field1279 = 0;
                class82.method553(var2, -79);
            } else {
                var2.method441(16773377);
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1381++;
        return "Cache:" + this.field1378;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZIB[BI)Z")
    private final boolean method581(boolean arg0, int arg1, byte arg2, byte[] arg3, int arg4) {
        field1379++;
        class288 var6 = this.field1377;
        synchronized (this.field1377) {
            try {
                int var7;
                if (arg0) {
                    if (((long) (arg4 * 6 + 6)) > this.field1380.method1933(0)) {
                        return false;
                    }
                    this.field1380.method1924((long) (arg4 * 6), (byte) -71);
                    this.field1380.method1930(class115.field1957, 6, -2408, 0);
                    var7 = ((class115.field1957[4] & 0xFF) << 8) + ((class115.field1957[3] & 0xFF) << 16) + (class115.field1957[5] & 0xFF);
                    if (var7 <= 0 || ((long) var7) > (this.field1377.method1933(0) / 520L)) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field1377.method1933(0) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class115.field1957[3] = (byte) (var7 >> 16);
                class115.field1957[2] = (byte) arg1;
                class115.field1957[5] = (byte) var7;
                class115.field1957[1] = (byte) (arg1 >> 8);
                class115.field1957[0] = (byte) (arg1 >> 16);
                class115.field1957[4] = (byte) (var7 >> 8);
                int var10 = 0;
                this.field1380.method1924((long) (arg4 * 6), (byte) -71);
                int var11 = 0;
                this.field1380.method1926(-1, 6, 0, class115.field1957);
                while (true) {
                    if (var10 < arg1) {
                        label120: {
                            int var12 = 0;
                            if (arg0) {
                                this.field1377.method1924((long) (var7 * 520), (byte) -71);
                                try {
                                    this.field1377.method1930(class115.field1957, 8, -2408, 0);
                                } catch (EOFException var36) {
                                    break label120;
                                }
                                var12 = (class115.field1957[6] & 0xFF) + ((class115.field1957[5] & 0xFF) << 8) + ((class115.field1957[4] & 0xFF) << 16);
                                int var13 = ((class115.field1957[0] & 0xFF) << 8) + (class115.field1957[1] & 0xFF);
                                int var14 = (class115.field1957[2] & 0xFF << 8) + (class115.field1957[3] & 0xFF);
                                int var15 = class115.field1957[7] & 0xFF;
                                if (arg4 != var13 || var11 != var14 || this.field1378 != var15) {
                                    return false;
                                }
                                if (var12 < 0 || (long) var12 > this.field1377.method1933(0) / 520L) {
                                    return false;
                                }
                            }
                            if (var12 == 0) {
                                arg0 = false;
                                var12 = (int) ((this.field1377.method1933(0) + 519L) / 520L);
                                if (var12 == 0) {
                                    var12++;
                                }
                                if (var7 == var12) {
                                    var12++;
                                }
                            }
                            class115.field1957[0] = (byte) (arg4 >> 8);
                            class115.field1957[7] = (byte) this.field1378;
                            class115.field1957[3] = (byte) var11;
                            class115.field1957[2] = (byte) (var11 >> 8);
                            class115.field1957[1] = (byte) arg4;
                            if ((arg1 - var10) <= 512) {
                                var12 = 0;
                            }
                            int var18 = arg1 - var10;
                            var11++;
                            class115.field1957[5] = (byte) (var12 >> 8);
                            class115.field1957[4] = (byte) (var12 >> 16);
                            class115.field1957[6] = (byte) var12;
                            if (var18 > 512) {
                                var18 = 512;
                            }
                            this.field1377.method1924((long) (var7 * 520), (byte) -71);
                            this.field1377.method1926(-1, 8, 0, class115.field1957);
                            var7 = var12;
                            this.field1377.method1926(-1, var18, var10, arg3);
                            var10 += var18;
                            continue;
                        }
                    }
                    if (arg2 > -27) {
                        return false;
                    }
                    return true;
                }
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIB)V")
    public static final void method582(int arg0, int arg1, byte arg2) {
        field1372++;
        class203 var3 = class223.method1556(arg0, -2062292415);
        int var4 = var3.field3468;
        int var5 = var3.field3475;
        if (arg2 > -2) {
            return;
        }
        int var6 = var3.field3471;
        int var7 = class120.field2030[var6 - var5];
        if (arg1 < 0 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class153.method1046(var4, (byte) -128, var8 & arg1 << var5 | class52.field806[var4] & ~var8);
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(ILhd;Lhd;I)V")
    public class87(int arg0, class288 arg1, class288 arg2, int arg3) {
        this.field1371 = arg3;
        this.field1377 = arg1;
        this.field1378 = arg0;
        this.field1380 = arg2;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IILeg;ISJLeg;)V")
    public static final void method583(int arg0, int arg1, class37 arg2, int arg3, short arg4, long arg5, class37 arg6) {
        if (arg3 != 29782) {
            return;
        }
        field1376++;
        if (class152.field2556 || class159.field2661 >= 500) {
            return;
        }
        class40.field645[class159.field2661] = arg6;
        class160.field2663[class159.field2661] = arg2;
        class264.field4642[class159.field2661] = arg4;
        class129.field2141[class159.field2661] = arg5;
        class26.field368[class159.field2661] = arg1;
        class217.field3726[class159.field2661] = arg0;
        class159.field2661++;
    }
}
