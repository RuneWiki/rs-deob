import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 implements Runnable {

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    private int field4 = 0;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "Z")
    private boolean field15 = false;

    @OriginalMember(owner = "client!a", name = "u", descriptor = "Z")
    private boolean field21 = false;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "I")
    private int field19 = 0;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Lqd;")
    private class149 field12;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "Ljava/net/Socket;")
    private Socket field16;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Ljava/io/InputStream;")
    private InputStream field1;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field10;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Lnd;")
    public static class122 field3 = new class122();

    @OriginalMember(owner = "client!a", name = "z", descriptor = "I")
    public static int field26 = 0;

    @OriginalMember(owner = "client!a", name = "w", descriptor = "Lkb;")
    public static class93 field23 = class76.method390("::clientdrop", 0);

    @OriginalMember(owner = "client!a", name = "C", descriptor = "Lkb;")
    public static class93 field29 = class76.method390("Ung-Ultige Session)2ID)3", 0);

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!a", name = "x", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!a", name = "B", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "Lca;")
    private class22 field17;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "Ljg;")
    public static class89 field22;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "[B")
    private byte[] field5;

    @OriginalMember(owner = "client!a", name = "A", descriptor = "[I")
    public static int[] field27;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILjg;IZLkb;Lkb;I)V")
    public static final void method1(int arg0, class89 arg1, int arg2, boolean arg3, class93 arg4, class93 arg5, int arg6) {
        field6++;
        int var7 = arg1.method454(236, arg4);
        int var8 = -89 / ((arg0 + 59) / 32);
        int var9 = arg1.method468(21, arg5, var7);
        class101.method562(var7, 1, arg3, arg1, arg2, arg6, var9);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)I")
    public final int method2(int arg0) throws IOException {
        field24++;
        if (arg0 > -11) {
            method9(113, 30, (byte) -123, 52, 78, null, -128, -22, 19);
        }
        return this.field21 ? 0 : this.field1.read();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([BIII)V")
    public final void method3(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field18++;
        if (arg1 != -1) {
            this.field10 = null;
        }
        if (this.field21) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field1.read(arg0, arg3, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 += var5;
            arg2 -= var5;
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)I")
    public final int method4(int arg0) throws IOException {
        field25++;
        if (this.field21) {
            return 0;
        } else {
            if (arg0 != 5) {
                this.field17 = null;
            }
            return this.field1.available();
        }
    }

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method10(false);
        field28++;
    }

    @OriginalMember(owner = "client!a", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field4 == this.field19) {
                            if (this.field21) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field4;
                        if (this.field19 >= this.field4) {
                            var3 = this.field19 - this.field4;
                        } else {
                            var3 = 5000 - this.field4;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field10.write(this.field5, var2, var3);
                    } catch (IOException var9) {
                        this.field15 = true;
                    }
                    this.field4 = (this.field4 + var3) % 5000;
                    try {
                        if (this.field4 == this.field19) {
                            this.field10.flush();
                        }
                    } catch (IOException var8) {
                        this.field15 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1 != null) {
                        this.field1.close();
                    }
                    if (this.field10 != null) {
                        this.field10.close();
                    }
                    if (this.field16 != null) {
                        this.field16.close();
                    }
                } catch (IOException var7) {
                }
                this.field5 = null;
                break;
            }
        } catch (Exception var12) {
            class141.method882(true, null, var12);
        }
        field9++;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(III)I")
    public static final int method5(int arg0, int arg1, int arg2) {
        if (arg1 != -18367) {
            field26 = -74;
        }
        field13++;
        int var3 = 0;
        while (arg2 > 0) {
            arg2--;
            var3 = arg0 & 0x1 | var3 << 1;
            arg0 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I[BIB)V")
    public final void method6(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        field7++;
        if (this.field21) {
            return;
        }
        if (this.field15) {
            this.field15 = false;
            throw new IOException();
        }
        int var5 = -103 % ((36 - arg3) / 51);
        if (this.field5 == null) {
            this.field5 = new byte[5000];
        }
        synchronized (this) {
            for (int var7 = 0; var7 < arg2; var7++) {
                this.field5[this.field19] = arg1[arg0 + var7];
                this.field19 = (this.field19 + 1) % 5000;
                if ((this.field4 + 4900) % 5000 == this.field19) {
                    throw new IOException();
                }
            }
            if (this.field17 == null) {
                this.field17 = this.field12.method909(-5836, this, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
    public static void method7(int arg0) {
        field27 = null;
        field23 = null;
        field29 = null;
        field22 = null;
        int var1 = 71 % ((arg0 + 40) / 63);
        field3 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
    public static final void method8(byte arg0) {
        field11++;
        try {
            if (class9.field150 == 0) {
                if (class147.field2840 != null) {
                    class147.field2840.method10(false);
                    class147.field2840 = null;
                }
                class147.field2837 = null;
                class18.field300 = false;
                class9.field150 = 1;
                class47.field743 = 0;
            }
            if (class9.field150 == 1) {
                if (class147.field2837 == null) {
                    class147.field2837 = class77.field1393.method915(class41.field685, 0, class121.field2242);
                }
                if (class147.field2837.field344 == 2) {
                    throw new IOException();
                }
                if (class147.field2837.field344 == 1) {
                    class147.field2840 = new class1((Socket) class147.field2837.field342, class77.field1393);
                    class147.field2837 = null;
                    class9.field150 = 2;
                }
            }
            if (class9.field150 == 2) {
                long var1 = class46.field735 = class148.field2862.method482(-45);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class151.field2908.field3153 = 0;
                class151.field2908.method1069(14, (byte) -26);
                class151.field2908.method1069(var3, (byte) -26);
                class147.field2840.method6(0, class151.field2908.field3162, 2, (byte) -16);
                class59.field942.field3153 = 0;
                class9.field150 = 3;
            }
            if (class9.field150 == 3) {
                if (class157.field3130 != null) {
                    class157.field3130.method254(0);
                }
                if (class144.field2815 != null) {
                    class144.field2815.method254(0);
                }
                int var4 = class147.field2840.method2(-118);
                if (class157.field3130 != null) {
                    class157.field3130.method254(0);
                }
                if (class144.field2815 != null) {
                    class144.field2815.method254(0);
                }
                if (var4 != 0) {
                    class127.method721(var4, -6);
                    return;
                }
                class59.field942.field3153 = 0;
                class9.field150 = 4;
            }
            if (class9.field150 == 4) {
                if (class59.field942.field3153 < 8) {
                    int var5 = class147.field2840.method4(5);
                    if (8 - class59.field942.field3153 < var5) {
                        var5 = 8 - class59.field942.field3153;
                    }
                    if (var5 > 0) {
                        class147.field2840.method3(class59.field942.field3162, -1, var5, class59.field942.field3153);
                        class59.field942.field3153 += var5;
                    }
                }
                if (class59.field942.field3153 == 8) {
                    class59.field942.field3153 = 0;
                    class170.field3382 = class59.field942.method1048(true);
                    class9.field150 = 5;
                }
            }
            if (class9.field150 == 5) {
                class151.field2908.field3153 = 0;
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class170.field3382 >> 32), (int) class170.field3382 };
                class151.field2908.method1069(10, (byte) -26);
                class151.field2908.method1051(true, var6[0]);
                class151.field2908.method1051(true, var6[1]);
                class151.field2908.method1051(true, var6[2]);
                class151.field2908.method1051(true, var6[3]);
                class151.field2908.method1064(class148.field2862.method482(81), -1);
                class151.field2908.method1052((byte) 40, class148.field2850);
                class151.field2908.method1080((byte) -98, class67.field1226, class101.field1864);
                class30.field507.field3153 = 0;
                if (class28.field455 == 40) {
                    class30.field507.method1069(18, (byte) -26);
                } else {
                    class30.field507.method1069(16, (byte) -26);
                }
                class30.field507.method1069(class151.field2908.field3153 + 93, (byte) -26);
                class30.field507.method1051(true, 479);
                class30.field507.method1069(class82.field1515 ? 1 : 0, (byte) -26);
                class205.method1335(126, class30.field507);
                class30.field507.method1051(true, class110.field1987.field1641);
                class30.field507.method1051(true, class203.field3929.field1641);
                class30.field507.method1051(true, class73.field1341.field1641);
                class30.field507.method1051(true, class181.field3586.field1641);
                class30.field507.method1051(true, class76.field1375.field1641);
                class30.field507.method1051(true, class61.field974.field1641);
                class30.field507.method1051(true, class63.field1000.field1641);
                class30.field507.method1051(true, class26.field398.field1641);
                class30.field507.method1051(true, class206.field4030.field1641);
                class30.field507.method1051(true, class204.field3952.field1641);
                class30.field507.method1051(true, class66.field1183.field1641);
                class30.field507.method1051(true, class104.field1921.field1641);
                class30.field507.method1051(true, class174.field3445.field1641);
                class30.field507.method1051(true, class49.field789.field1641);
                class30.field507.method1051(true, class63.field994.field1641);
                class30.field507.method1051(true, class143.field2792.field1641);
                class30.field507.method1063((byte) -93, class151.field2908.field3153, 0, class151.field2908.field3162);
                class147.field2840.method6(0, class30.field507.field3162, class30.field507.field3153, (byte) -54);
                class151.field2908.method39(var6, 7);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class59.field942.method39(var6, 7);
                class9.field150 = 6;
            }
            if (class9.field150 == 6 && class147.field2840.method4(5) > 0) {
                int var8 = class147.field2840.method2(-83);
                if (var8 == 21 && class28.field455 == 20) {
                    class9.field150 = 7;
                } else if (var8 == 2) {
                    class9.field150 = 9;
                } else if (var8 == 15 && class28.field455 == 40) {
                    class93.method500(-1);
                    return;
                } else if (var8 == 23 && class27.field432 < 1) {
                    class9.field150 = 0;
                    class27.field432++;
                } else {
                    class127.method721(var8, -6);
                    return;
                }
            }
            if (class9.field150 == 7 && class147.field2840.method4(5) > 0) {
                client.field483 = (class147.field2840.method2(-124) + 3) * 60;
                class9.field150 = 8;
            }
            if (class9.field150 == 8) {
                class47.field743 = 0;
                class93.method521(class104.field1911, class203.method1321(new class93[] { class67.method357((byte) -88, client.field483 / 60), class51.field809 }, -117), class76.field1370, -9593);
                if (--client.field483 <= 0) {
                    class9.field150 = 0;
                }
            } else {
                if (class9.field150 == 9 && class147.field2840.method4(5) >= 9) {
                    class43.field707 = class147.field2840.method2(-127);
                    class122.field2275 = class147.field2840.method2(-78);
                    class10.field164 = class147.field2840.method2(-89) == 1;
                    class6.field111 = class147.field2840.method2(-78);
                    class6.field111 <<= 0x8;
                    class6.field111 += class147.field2840.method2(-24);
                    class116.field2170 = class147.field2840.method2(-16);
                    class147.field2840.method3(class59.field942.field3162, -1, 1, 0);
                    class59.field942.field3153 = 0;
                    class67.field1240 = class59.field942.method40(-128);
                    class147.field2840.method3(class59.field942.field3162, -1, 2, 0);
                    class59.field942.field3153 = 0;
                    class157.field3109 = class59.field942.method1071(28101);
                    class9.field150 = 10;
                }
                int var9 = -31 / ((-arg0 - 30) / 60);
                if (class9.field150 != 10) {
                    class47.field743++;
                    if (class47.field743 > 2000) {
                        if (class27.field432 < 1) {
                            class27.field432++;
                            class9.field150 = 0;
                            if (class39.field645 == class121.field2242) {
                                class121.field2242 = class103.field1899;
                            } else {
                                class121.field2242 = class39.field645;
                            }
                        } else {
                            class127.method721(-3, -6);
                        }
                    }
                } else if (class147.field2840.method4(5) >= class157.field3109) {
                    class59.field942.field3153 = 0;
                    class147.field2840.method3(class59.field942.field3162, -1, class157.field3109, 0);
                    class139.method872(false);
                    class133.field2544 = -1;
                    class124.method706(false, 1);
                    class67.field1240 = -1;
                }
            }
        } catch (IOException var10) {
            if (class27.field432 < 1) {
                class9.field150 = 0;
                class27.field432++;
                if (class39.field645 == class121.field2242) {
                    class121.field2242 = class103.field1899;
                } else {
                    class121.field2242 = class39.field645;
                }
            } else {
                class127.method721(-2, -6);
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIBII[Lh;III)V")
    public static final void method9(int arg0, int arg1, byte arg2, int arg3, int arg4, class65[] arg5, int arg6, int arg7, int arg8) {
        field20++;
        int var9 = 0;
        if (arg2 != 112) {
            field14 = -14;
        }
        while (var9 < arg5.length) {
            class65 var10 = arg5[var9];
            if (var10 != null && (!var10.field1152 || var10.field1076 == 0 || var10.field1159 || class178.method1173(var10, 125) != 0 || class32.field520 == var10) && var10.field1143 == arg1 && (!var10.field1152 || !class131.method766(var10, -30568))) {
                int var11 = var10.field1113 + arg6;
                int var12 = var10.field1090 + arg7;
                if (class73.field1348 == var10) {
                    class136.field2643 = var12;
                    class142.field2782 = var11;
                    class96.field1783 = true;
                }
                int var19;
                int var20;
                int var21;
                int var22;
                if (var10.field1076 == 2) {
                    var21 = arg8;
                    var20 = arg0;
                    var22 = arg3;
                    var19 = arg4;
                } else if (var10.field1076 == 9) {
                    int var13 = var12;
                    int var14 = var11;
                    int var15 = var11 + var10.field1044;
                    int var16 = var10.field1052 + var12;
                    if (var15 < var11) {
                        var14 = var15;
                        var15 = var11;
                    }
                    if (var12 > var16) {
                        var13 = var16;
                        var16 = var12;
                    }
                    var15++;
                    var16++;
                    var19 = arg4 < var14 ? var14 : arg4;
                    var20 = arg0 >= var13 ? arg0 : var13;
                    var21 = var16 >= arg8 ? arg8 : var16;
                    var22 = var15 >= arg3 ? arg3 : var15;
                } else {
                    var20 = var12 <= arg0 ? arg0 : var12;
                    var19 = arg4 < var11 ? var11 : arg4;
                    int var23 = var12 + var10.field1052;
                    int var24 = var11 + var10.field1044;
                    var21 = var23 >= arg8 ? arg8 : var23;
                    var22 = arg3 <= var24 ? arg3 : var24;
                }
                if (!var10.field1152 || var22 > var19 && var21 > var20) {
                    if (var10.field1056 == 1337) {
                        class160.method1095(arg2 - 112, var10);
                    } else if (var10.field1056 == 1338) {
                        class70.method369(var11, var12, false);
                    } else {
                        label496: {
                            if (var10.field1076 == 0) {
                                if (!var10.field1152 && class131.method766(var10, -30568) && class80.field1418 != var10) {
                                    break label496;
                                }
                                method9(var20, var10.field1058, (byte) 112, var22, var19, arg5, var11 - var10.field1122, var12 - var10.field1162, var21);
                                if (var10.field1121 != null) {
                                    method9(var20, var10.field1058, (byte) 112, var22, var19, var10.field1121, var11 - var10.field1122, var12 - var10.field1162, var21);
                                }
                                class78 var25 = (class78) class147.field2834.method616((long) var10.field1058, -1);
                                if (var25 != null) {
                                    class172.method1151(var22, var21, var12, var11, var20, var25.field1406, (byte) -33, var19);
                                }
                            }
                            if (var10.field1152) {
                                boolean var26 = false;
                                boolean var27;
                                if (var19 <= class97.field1826 && class170.field3380 >= var20 && class97.field1826 < var22 && var21 > class170.field3380) {
                                    var27 = true;
                                } else {
                                    var27 = false;
                                }
                                if (class66.field1186 == 1 && var27) {
                                    var26 = true;
                                }
                                boolean var28 = false;
                                if (class144.field2798 == 1 && var19 <= class88.field1592 && var20 <= class57.field928 && var22 > class88.field1592 && var21 > class57.field928) {
                                    var28 = true;
                                }
                                if (var28) {
                                    class36.method197(class57.field928 - var12, (byte) 122, var10, class88.field1592 - var11);
                                }
                                if (class73.field1348 != null && class73.field1348 != var10 && var27 && class161.method1099(class178.method1173(var10, 125), (byte) -4)) {
                                    class49.field784 = var10;
                                }
                                if (class32.field520 == var10) {
                                    class139.field2695 = var12;
                                    class75.field1356 = true;
                                    class30.field511 = var11;
                                }
                                if (var10.field1159) {
                                    if (var27 && class121.field2250 != 0 && var10.field1155 != null) {
                                        class104 var29 = new class104();
                                        var29.field1919 = var10;
                                        var29.field1916 = class121.field2250;
                                        var29.field1924 = var10.field1155;
                                        class171.field3395.method691(var29, (byte) 51);
                                    }
                                    if (class73.field1348 != null || class153.field3010 != null || class121.field2241) {
                                        var26 = false;
                                        var27 = false;
                                        var28 = false;
                                    }
                                    if (!var10.field1117 && var28) {
                                        var10.field1117 = true;
                                        if (var10.field1182 != null) {
                                            class104 var30 = new class104();
                                            var30.field1919 = var10;
                                            var30.field1908 = class88.field1592 - var11;
                                            var30.field1924 = var10.field1182;
                                            var30.field1916 = class57.field928 - var12;
                                            class171.field3395.method691(var30, (byte) 51);
                                        }
                                    }
                                    if (var10.field1117 && var26 && var10.field1087 != null) {
                                        class104 var31 = new class104();
                                        var31.field1908 = class97.field1826 - var11;
                                        var31.field1919 = var10;
                                        var31.field1916 = class170.field3380 - var12;
                                        var31.field1924 = var10.field1087;
                                        class171.field3395.method691(var31, (byte) 51);
                                    }
                                    if (var10.field1117 && !var26) {
                                        var10.field1117 = false;
                                        if (var10.field1080 != null) {
                                            class104 var32 = new class104();
                                            var32.field1924 = var10.field1080;
                                            var32.field1916 = class170.field3380 - var12;
                                            var32.field1908 = class97.field1826 - var11;
                                            var32.field1919 = var10;
                                            class61.field972.method691(var32, (byte) 51);
                                        }
                                    }
                                    if (var26 && var10.field1168 != null) {
                                        class104 var33 = new class104();
                                        var33.field1919 = var10;
                                        var33.field1924 = var10.field1168;
                                        var33.field1916 = class170.field3380 - var12;
                                        var33.field1908 = class97.field1826 - var11;
                                        class171.field3395.method691(var33, (byte) 51);
                                    }
                                    if (!var10.field1041 && var27) {
                                        var10.field1041 = true;
                                        if (var10.field1160 != null) {
                                            class104 var34 = new class104();
                                            var34.field1916 = class170.field3380 - var12;
                                            var34.field1919 = var10;
                                            var34.field1908 = class97.field1826 - var11;
                                            var34.field1924 = var10.field1160;
                                            class171.field3395.method691(var34, (byte) 51);
                                        }
                                    }
                                    if (var10.field1041 && var27 && var10.field1115 != null) {
                                        class104 var35 = new class104();
                                        var35.field1919 = var10;
                                        var35.field1908 = class97.field1826 - var11;
                                        var35.field1924 = var10.field1115;
                                        var35.field1916 = class170.field3380 - var12;
                                        class171.field3395.method691(var35, (byte) 51);
                                    }
                                    if (var10.field1041 && !var27) {
                                        var10.field1041 = false;
                                        if (var10.field1163 != null) {
                                            class104 var36 = new class104();
                                            var36.field1916 = class170.field3380 - var12;
                                            var36.field1908 = class97.field1826 - var11;
                                            var36.field1924 = var10.field1163;
                                            var36.field1919 = var10;
                                            class61.field972.method691(var36, (byte) 51);
                                        }
                                    }
                                    if (var10.field1048 != null) {
                                        class104 var37 = new class104();
                                        var37.field1919 = var10;
                                        var37.field1924 = var10.field1048;
                                        class201.field3897.method691(var37, (byte) 51);
                                    }
                                    if (var10.field1128 != null && var10.field1053 < class161.field3221) {
                                        if (var10.field1099 == null || class161.field3221 - var10.field1053 > 32) {
                                            class104 var42 = new class104();
                                            var42.field1919 = var10;
                                            var42.field1924 = var10.field1128;
                                            class171.field3395.method691(var42, (byte) 51);
                                        } else {
                                            label383: for (int var38 = var10.field1053; var38 < class161.field3221; var38++) {
                                                int var39 = class67.field1239[var38 & 0x1F];
                                                for (int var40 = 0; var40 < var10.field1099.length; var40++) {
                                                    if (var10.field1099[var40] == var39) {
                                                        class104 var41 = new class104();
                                                        var41.field1919 = var10;
                                                        var41.field1924 = var10.field1128;
                                                        class171.field3395.method691(var41, (byte) 51);
                                                        break label383;
                                                    }
                                                }
                                            }
                                        }
                                        var10.field1053 = class161.field3221;
                                    }
                                    if (var10.field1063 != null && var10.field1065 < class14.field250) {
                                        if (var10.field1141 == null || class14.field250 - var10.field1065 > 32) {
                                            class104 var47 = new class104();
                                            var47.field1924 = var10.field1063;
                                            var47.field1919 = var10;
                                            class171.field3395.method691(var47, (byte) 51);
                                        } else {
                                            label363: for (int var43 = var10.field1065; var43 < class14.field250; var43++) {
                                                int var44 = class200.field3873[var43 & 0x1F];
                                                for (int var45 = 0; var45 < var10.field1141.length; var45++) {
                                                    if (var10.field1141[var45] == var44) {
                                                        class104 var46 = new class104();
                                                        var46.field1919 = var10;
                                                        var46.field1924 = var10.field1063;
                                                        class171.field3395.method691(var46, (byte) 51);
                                                        break label363;
                                                    }
                                                }
                                            }
                                        }
                                        var10.field1065 = class14.field250;
                                    }
                                    if (var10.field1072 != null && class127.field2386 > var10.field1107) {
                                        if (var10.field1114 == null || class127.field2386 - var10.field1107 > 32) {
                                            class104 var52 = new class104();
                                            var52.field1919 = var10;
                                            var52.field1924 = var10.field1072;
                                            class171.field3395.method691(var52, (byte) 51);
                                        } else {
                                            label343: for (int var48 = var10.field1107; var48 < class127.field2386; var48++) {
                                                int var49 = class9.field148[var48 & 0x1F];
                                                for (int var50 = 0; var50 < var10.field1114.length; var50++) {
                                                    if (var10.field1114[var50] == var49) {
                                                        class104 var51 = new class104();
                                                        var51.field1924 = var10.field1072;
                                                        var51.field1919 = var10;
                                                        class171.field3395.method691(var51, (byte) 51);
                                                        break label343;
                                                    }
                                                }
                                            }
                                        }
                                        var10.field1107 = class127.field2386;
                                    }
                                    if (class206.field4033 > var10.field1046 && var10.field1108 != null) {
                                        class104 var53 = new class104();
                                        var53.field1919 = var10;
                                        var53.field1924 = var10.field1108;
                                        class171.field3395.method691(var53, (byte) 51);
                                    }
                                    if (class16.field287 > var10.field1046 && var10.field1097 != null) {
                                        class104 var54 = new class104();
                                        var54.field1924 = var10.field1097;
                                        var54.field1919 = var10;
                                        class171.field3395.method691(var54, (byte) 51);
                                    }
                                    if (class175.field3455 > var10.field1046 && var10.field1075 != null) {
                                        class104 var55 = new class104();
                                        var55.field1924 = var10.field1075;
                                        var55.field1919 = var10;
                                        class171.field3395.method691(var55, (byte) 51);
                                    }
                                    if (class113.field2095 > var10.field1046 && var10.field1068 != null) {
                                        class104 var56 = new class104();
                                        var56.field1919 = var10;
                                        var56.field1924 = var10.field1068;
                                        class171.field3395.method691(var56, (byte) 51);
                                    }
                                    if (var10.field1046 < class124.field2308 && var10.field1137 != null) {
                                        class104 var57 = new class104();
                                        var57.field1919 = var10;
                                        var57.field1924 = var10.field1137;
                                        class171.field3395.method691(var57, (byte) 51);
                                    }
                                    var10.field1046 = class203.field3928;
                                    if (var10.field1112 != null) {
                                        for (int var58 = 0; var58 < class207.field4056; var58++) {
                                            class104 var59 = new class104();
                                            var59.field1919 = var10;
                                            var59.field1910 = class84.field1539[var58];
                                            var59.field1917 = class144.field2813[var58];
                                            var59.field1924 = var10.field1112;
                                            class171.field3395.method691(var59, (byte) 51);
                                        }
                                    }
                                }
                            }
                            if (!var10.field1152) {
                                if (class73.field1348 != null || class153.field3010 != null || class121.field2241) {
                                    return;
                                }
                                if ((var10.field1088 >= 0 || var10.field1134 != 0) && var19 <= class97.field1826 && class170.field3380 >= var20 && var22 > class97.field1826 && var21 > class170.field3380) {
                                    if (var10.field1088 >= 0) {
                                        class80.field1418 = arg5[var10.field1088];
                                    } else {
                                        class80.field1418 = var10;
                                    }
                                }
                                if (var10.field1076 == 8 && class97.field1826 >= var19 && var20 <= class170.field3380 && var22 > class97.field1826 && var21 > class170.field3380) {
                                    class145.field2823 = var10;
                                }
                                if (var10.field1103 > var10.field1052) {
                                    class3.method18(var10, var10.field1044 + var11, var10.field1052, class170.field3380, 30819, class97.field1826, var12, var10.field1103);
                                }
                            }
                        }
                    }
                }
            }
            var9++;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
    public final void method10(boolean arg0) {
        field8++;
        if (this.field21) {
            return;
        }
        synchronized (this) {
            this.field21 = true;
            this.notifyAll();
        }
        if (this.field17 != null) {
            while (this.field17.field344 == 0) {
                class39.method212(72, 1L);
            }
            if (this.field17.field344 == 1) {
                try {
                    ((Thread) this.field17.field342).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        if (!arg0) {
            this.field17 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Ljava/net/Socket;Lqd;)V")
    public class1(Socket arg0, class149 arg1) throws IOException {
        this.field12 = arg1;
        this.field16 = arg0;
        this.field16.setSoTimeout(30000);
        this.field16.setTcpNoDelay(true);
        this.field1 = this.field16.getInputStream();
        this.field10 = this.field16.getOutputStream();
    }
}
