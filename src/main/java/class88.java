import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class88 implements Runnable {

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    private int field1328 = 0;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "Z")
    private boolean field1345 = false;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "Z")
    private boolean field1342 = false;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    private int field1338 = 0;

    @OriginalMember(owner = "client!ra", name = "C", descriptor = "Lwe;")
    private class224 field1350;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field1326;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "Ljava/io/InputStream;")
    private InputStream field1343;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1339;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field1322 = 3;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field1333 = 0;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field1324 = 100;

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "I")
    public static int field1349 = -1;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "Lrk;")
    private class252 field1327;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "Lwf;")
    public static class306 field1332;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "[B")
    private byte[] field1344;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V", line = 6)
    public final void method596(boolean arg0) {
        field1329++;
        if (this.field1342) {
            return;
        }
        if (arg0) {
            method601((String) null, (byte) 87, -51);
        }
        synchronized (this) {
            this.field1342 = true;
            this.notifyAll();
        }
        if (this.field1327 != null) {
            while (this.field1327.field3931 == 0) {
                class96.method657(1L, (byte) -115);
            }
            if (this.field1327.field3931 == 1) {
                try {
                    ((Thread) this.field1327.field3929).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field1327 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V", line = 44)
    public final void method597(byte arg0) {
        field1334++;
        if (this.field1342) {
            return;
        }
        this.field1343 = new class308();
        this.field1339 = new class136();
        if (arg0 != 111) {
            method606(59);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III[B)V", line = 63)
    public final void method598(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1336++;
        if (this.field1342) {
            return;
        }
        if (this.field1345) {
            this.field1345 = false;
            throw new IOException();
        }
        if (this.field1344 == null) {
            this.field1344 = new byte[5000];
        }
        synchronized (this) {
            if (arg2 != 1) {
                field1332 = (class306) null;
            }
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field1344[this.field1338] = arg3[arg0 + var6];
                this.field1338 = (this.field1338 + 1) % 5000;
                if ((this.field1328 + 4900) % 5000 == this.field1338) {
                    throw new IOException();
                }
            }
            if (this.field1327 == null) {
                this.field1327 = this.field1350.method1515(3, (byte) -5, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;", line = 117)
    public static final String method599(String arg0, String arg1, int arg2, String arg3) {
        field1330++;
        int var4 = arg0.length();
        int var5 = arg1.length();
        int var6 = arg3.length();
        if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
        }
        int var7 = var4;
        int var8 = var6 - var5;
        if (var8 != 0) {
            int var9 = 0;
            while (true) {
                int var10 = arg0.indexOf(arg1, var9);
                if (var10 < 0) {
                    break;
                }
                var9 = var5 + var10;
                var7 += var8;
            }
        }
        StringBuffer var11 = new StringBuffer(var7);
        int var12 = 0;
        while (true) {
            int var13 = arg0.indexOf(arg1, var12);
            if (var13 < 0) {
                if (arg2 != -2895) {
                    method601((String) null, (byte) 31, -26);
                }
                var11.append(arg0.substring(var12));
                return var11.toString();
            }
            var11.append(arg0.substring(var12, var13));
            var12 = var5 + var13;
            var11.append(arg3);
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(Z)V", line = 175)
    public static void method600(boolean arg0) {
        if (!arg0) {
            field1332 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;BI)V", line = 187)
    public static final void method601(String arg0, byte arg1, int arg2) {
        int var3 = 56 / ((-arg1 - 71) / 40);
        field1340++;
        class75 var4 = class204.method1371(3, 7, arg2);
        var4.method524((byte) 57);
        var4.field1118 = arg0;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)I", line = 206)
    public final int method602(int arg0) throws IOException {
        int var2 = 123 % ((arg0 + 33) / 55);
        field1347++;
        return this.field1342 ? 0 : this.field1343.read();
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIII)Z", line = 221)
    private static final boolean method603(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class24.field309 * arg0 + class17.field194 * arg3 >> 16;
        int var6 = class24.field309 * arg3 - class17.field194 * arg0 >> 16;
        int var7 = class47.field671 * var6 + class230.field3721 * arg1 >> 16;
        int var8 = class47.field671 * arg1 - class230.field3721 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class47.field671 * var6 + class230.field3721 * arg2 >> 16;
        int var12 = class47.field671 * arg2 - class230.field3721 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class27.field345 && var13 < class27.field345) {
            return false;
        } else if (var9 > class54.field763 && var13 > class54.field763) {
            return false;
        } else if (var10 < class234.field3757 && var14 < class234.field3757) {
            return false;
        } else {
            return var10 <= class6.field65 || var14 <= class6.field65;
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Ljava/net/Socket;Lwe;)V", line = 771)
    public class88(Socket arg0, class224 arg1) throws IOException {
        this.field1350 = arg1;
        this.field1326 = arg0;
        this.field1326.setSoTimeout(30000);
        this.field1326.setTcpNoDelay(true);
        this.field1343 = this.field1326.getInputStream();
        this.field1339 = this.field1326.getOutputStream();
    }

    @OriginalMember(owner = "client!ra", name = "finalize", descriptor = "()V", line = 273)
    protected final void finalize() {
        this.method596(false);
        field1331++;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(III[B)V", line = 293)
    public final void method604(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1341++;
        if (this.field1342) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field1343.read(arg3, arg2, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 -= var5;
            arg2 += var5;
        }
        if (arg0 <= 20) {
            field1322 = 33;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 317)
    public static final void method605(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class228.field3650 * 128) {
            arg0 = class228.field3650 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class84.field1276 * 128) {
            arg2 = class84.field1276 * 128 - 1;
        }
        class230.field3721 = class12.field121[arg3];
        class47.field671 = class12.field127[arg3];
        class17.field194 = class12.field121[arg4];
        class24.field309 = class12.field127[arg4];
        class343.field5342 = arg0;
        class99.field1542 = arg1;
        class246.field3859 = arg2;
        class77.field1151 = arg0 / 128;
        class335.field5208 = arg2 / 128;
        class43.field607 = class77.field1151 - class50.field712;
        if (class43.field607 < 0) {
            class43.field607 = 0;
        }
        class96.field1468 = class335.field5208 - class50.field712;
        if (class96.field1468 < 0) {
            class96.field1468 = 0;
        }
        class194.field2929 = class77.field1151 + class50.field712;
        if (class194.field2929 > class228.field3650) {
            class194.field2929 = class228.field3650;
        }
        class272.field4184 = class50.field712 + class335.field5208;
        if (class272.field4184 > class84.field1276) {
            class272.field4184 = class84.field1276;
        }
        short var15;
        if (class333.field5166) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class50.field712 + class50.field712 + 2; var16++) {
            for (int var17 = 0; var17 < class50.field712 + class50.field712 + 2; var17++) {
                int var18 = (var16 - class50.field712 << 7) - (class343.field5342 & 0x7F);
                int var19 = (var17 - class50.field712 << 7) - (class246.field3859 & 0x7F);
                int var20 = class77.field1151 + var16 - class50.field712;
                int var21 = class335.field5208 + var17 - class50.field712;
                if (var20 >= 0 && var21 >= 0 && var20 < class228.field3650 && var21 < class84.field1276) {
                    int var22;
                    if (class46.field655 == null) {
                        var22 = class193.field2911[0][var20][var21] + 128 - class99.field1542;
                    } else {
                        var22 = class46.field655[0][var20][var21] + 128 - class99.field1542;
                    }
                    int var23 = class193.field2911[3][var20][var21] - class99.field1542 - 1000;
                    class79.field1174[var16][var17] = method603(var18, var23, var22, var19, var15);
                } else {
                    class79.field1174[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class50.field712 + class50.field712 + 1; var24++) {
            for (int var25 = 0; var25 < class50.field712 + class50.field712 + 1; var25++) {
                class131.field2057[var24][var25] = class79.field1174[var24][var25] || class79.field1174[var24 + 1][var25] || class79.field1174[var24][var25 + 1] || class79.field1174[var24 + 1][var25 + 1];
            }
        }
        class190.field2893 = arg6;
        class63.field942 = arg7;
        class234.field3764 = arg8;
        class314.field4955 = arg9;
        class273.field4209 = arg10;
        class212.method1418();
        if (class10.field94 != null) {
            class95.method653(true);
            class160.method1105(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class333.field5166) {
                class165.field2535 = false;
                class174.method1179(0, 0, (byte) 78);
                class326.method2209((float[]) null);
                class147.method1027();
            }
            class95.method653(false);
        }
        class160.method1105(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)I", line = 446)
    public static final int method606(int arg0) {
        field1323++;
        if (arg0 != -1) {
            method600(false);
        }
        return class208.field3306;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)I", line = 462)
    public final int method607(int arg0) throws IOException {
        field1346++;
        int var2 = 119 / ((-arg0 - 47) / 63);
        return this.field1342 ? 0 : this.field1343.available();
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V", line = 485)
    public final void method608(int arg0) throws IOException {
        field1325++;
        if (this.field1342) {
            return;
        }
        if (this.field1345) {
            this.field1345 = false;
            throw new IOException();
        } else if (arg0 != 7) {
            method605(113, -96, 85, 83, 104, (byte[][][]) ((byte[][][]) null), (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, -51, (byte) 41, 3, -113);
        }
    }

    @OriginalMember(owner = "client!ra", name = "run", descriptor = "()V", line = 506)
    public final void run() {
        field1348++;
        try {
            while (true) {
                int var3;
                int var4;
                synchronized (this) {
                    if (this.field1338 == this.field1328) {
                        if (this.field1342) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var13) {
                        }
                    }
                    var3 = this.field1328;
                    if (this.field1328 > this.field1338) {
                        var4 = 5000 - this.field1328;
                    } else {
                        var4 = this.field1338 - this.field1328;
                    }
                }
                if (var4 > 0) {
                    try {
                        this.field1339.write(this.field1344, var3, var4);
                    } catch (IOException var12) {
                        this.field1345 = true;
                    }
                    this.field1328 = (this.field1328 + var4) % 5000;
                    try {
                        if (this.field1338 == this.field1328) {
                            this.field1339.flush();
                        }
                    } catch (IOException var11) {
                        this.field1345 = true;
                    }
                }
            }
            try {
                if (this.field1343 != null) {
                    this.field1343.close();
                }
                if (this.field1339 != null) {
                    this.field1339.close();
                }
                if (this.field1326 != null) {
                    this.field1326.close();
                }
            } catch (IOException var10) {
            }
            this.field1344 = null;
        } catch (Exception var15) {
            class291.method1892((String) null, var15, -2);
        }
    }

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)V", line = 576)
    public static final void method609(int arg0) {
        if (arg0 <= 125) {
            method603(19, -95, -72, 42, 13);
        }
        for (int var1 = 0; var1 < class142.field2248; var1++) {
            int var2 = class105.field1619[var1];
            class80 var3 = class208.field3313[var2];
            int var4 = class230.field3713.method2043((byte) -124);
            if ((var4 & 0x80) != 0) {
                var4 += class230.field3713.method2043((byte) -116) << 8;
            }
            if ((var4 & 0x10) != 0) {
                int var5 = class230.field3713.method2053(-21097);
                int var6 = class230.field3713.method2038((byte) -121);
                var3.method273(class343.field5341, var6, var5, -110);
                var3.field533 = class343.field5341 + 300;
                var3.field554 = class230.field3713.method2043((byte) -109);
            }
            if ((var4 & 0x4) != 0) {
                if (var3.field1178.method1953(0)) {
                    class235.method1602(var3, 110);
                }
                var3.method554(class71.method511(class230.field3713.method2016(2), 10), 73);
                var3.method279(var3.field1178.field4609, 17);
                var3.field565 = var3.field1178.field4572;
                var3.field522 = var3.field1178.field4595;
                if (var3.field1178.method1953(0)) {
                    class270.method1785(var3.field476[0], (class17) null, (class82) null, var3.field505[0], class77.field1154, var3, 0, 125);
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field548 = class230.field3713.method2027(0);
                var3.field539 = 100;
            }
            if ((var4 & 0x200) != 0) {
                int var7 = class230.field3713.method2002(124);
                int[] var8 = new int[var7];
                int[] var9 = new int[var7];
                int[] var10 = new int[var7];
                for (int var11 = 0; var11 < var7; var11++) {
                    int var12 = class230.field3713.method2030((byte) -70);
                    if (var12 == 65535) {
                        var12 = -1;
                    }
                    var8[var11] = var12;
                    var9[var11] = class230.field3713.method2002(109);
                    var10[var11] = class230.field3713.method2016(2);
                }
                class84.method578(var9, 0, var10, var8, var3);
            }
            if ((var4 & 0x20) != 0) {
                int var13 = class230.field3713.method2016(2);
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var14 = class230.field3713.method2053(-21097);
                class112.method749(-99, var13, var14, var3);
            }
            if ((var4 & 0x1) != 0) {
                int var15 = class230.field3713.method2038((byte) -97);
                int var16 = class230.field3713.method2043((byte) -105);
                var3.method273(class343.field5341, var16, var15, -80);
            }
            if ((var4 & 0x100) != 0) {
                var3.field510 = class230.field3713.method1992(true);
                var3.field540 = class230.field3713.method1994(false);
            }
            if ((var4 & 0x2) != 0) {
                int var17 = class230.field3713.method1994(false);
                if (var17 == 65535) {
                    var17 = -1;
                }
                boolean var18 = true;
                int var19 = class230.field3713.method2010(116);
                if (var17 != -1 && var3.field530 != -1 && class118.method809((byte) 120, class63.method428(false, var17).field2355).field3560 < class118.method809((byte) 59, class63.method428(false, var3.field530).field2355).field3560) {
                    var18 = false;
                }
                if (var18) {
                    var3.field534 = 0;
                    var3.field501 = var19 >> 16;
                    var3.field496 = 1;
                    var3.field506 = 0;
                    var3.field477 = class343.field5341 + (var19 & 0xFFFF);
                    var3.field530 = var17;
                    if (var3.field477 > class343.field5341) {
                        var3.field534 = -1;
                    }
                    if (var3.field530 != -1 && class343.field5341 == var3.field477) {
                        int var20 = class63.method428(false, var3.field530).field2355;
                        if (var20 != -1) {
                            class222 var21 = class118.method809((byte) 92, var20);
                            if (var21 != null && var21.field3529 != null) {
                                class229.method1571(var3.field537, false, (byte) -110, var3.field519, var21, 0);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field551 = class230.field3713.method1992(true);
                if (var3.field551 == 65535) {
                    var3.field551 = -1;
                }
            }
        }
        field1335++;
    }
}
