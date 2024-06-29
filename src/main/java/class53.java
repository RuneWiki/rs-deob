import java.awt.Component;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class53 implements Runnable {

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    private int field1193 = 32;

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "J")
    private long field1223 = class77.method657(3745);

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "I")
    public volatile int field1224 = 0;

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "I")
    private int field1226 = 0;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "J")
    private long field1225 = 0L;

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "J")
    private long field1230 = 0L;

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "I")
    private int field1229 = 0;

    @OriginalMember(owner = "client!hd", name = "T", descriptor = "[Lu;")
    private class130[] field1235 = new class130[8];

    @OriginalMember(owner = "client!hd", name = "Q", descriptor = "Z")
    private boolean field1232 = true;

    @OriginalMember(owner = "client!hd", name = "S", descriptor = "I")
    private int field1234 = 0;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "[Lu;")
    private class130[] field1227 = new class130[8];

    @OriginalMember(owner = "client!hd", name = "U", descriptor = "I")
    private int field1236 = 0;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field1190 = 0;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "Lmb;")
    private static class84 field1202 = class79.method672(true, "Moderator option: Mute player for 48 hours: <OFF>");

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
    public static int field1212 = 0;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "Z")
    public static boolean field1204 = false;

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
    public static int field1216 = 0;

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "Lmb;")
    public static class84 field1222 = field1202;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "I")
    public int field1228;

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "I")
    private int field1231;

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "I")
    public int field1233;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "Lu;")
    private class130 field1215;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "Lhd;")
    public static class53 field1203;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "[I")
    public int[] field1206;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public final void method433(int arg0) {
        if (this.field1224 == 1) {
            this.field1224 = 2;
            while (this.field1224 == 2) {
                class22.method149(-109, 50L);
            }
        }
        if (arg0 >= 84) {
            this.method162();
            this.field1206 = null;
            field1207++;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "()V")
    public void method157() throws Exception {
        field1198++;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
    public static void method434(int arg0) {
        field1222 = null;
        if (arg0 != 28) {
            method444(28, 101, 47, 116);
        }
        field1202 = null;
        field1203 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZ)V")
    private final void method435(int arg0, boolean arg1) {
        this.field1236 -= arg0;
        if (arg1) {
            return;
        }
        if (this.field1236 < 0) {
            this.field1236 = 0;
        }
        if (this.field1215 != null) {
            this.field1215.method302(arg0);
        }
        field1221++;
    }

    @OriginalMember(owner = "client!hd", name = "run", descriptor = "()V")
    public final void run() {
        field1209++;
        try {
            while (this.field1224 == 1) {
                this.method442((byte) -14);
                class22.method149(105, 5L);
            }
        } catch (Exception var2) {
            class68.method604(20233, null, var2);
        }
        this.field1224 = 0;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([II)V")
    private final void method436(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class43.field949) {
            var3 = arg1 << 1;
        }
        int var4 = 0;
        var3 -= 7;
        while (var4 < var3) {
            arg0[var4++] = 0;
            arg0[var4++] = 0;
            arg0[var4++] = 0;
            arg0[var4++] = 0;
            arg0[var4++] = 0;
            arg0[var4++] = 0;
            arg0[var4++] = 0;
            arg0[var4++] = 0;
        }
        var3 += 7;
        while (var4 < var3) {
            arg0[var4++] = 0;
        }
        this.field1236 -= arg1;
        if (this.field1215 != null && this.field1236 <= 0) {
            this.field1236 += class1.field4 >> 4;
            class69.method611(true, this.field1215);
            this.method445((byte) 85, this.field1215, this.field1215.method546());
            int var5 = 0;
            int var6 = 255;
            int var7 = 7;
            label114: while (var6 != 0) {
                int var8;
                int var9;
                if (var7 < 0) {
                    var8 = var7 & 0x3;
                    var9 = -(var7 >> 2);
                } else {
                    var8 = var7;
                    var9 = 0;
                }
                for (int var10 = var6 >>> var8 & 0x11111111; var10 != 0; var10 >>>= 0x4) {
                    if ((var10 & 0x1) != 0) {
                        var6 &= ~(0x1 << var8);
                        class130 var11 = null;
                        class130 var12 = this.field1227[var8];
                        label108: while (true) {
                            while (true) {
                                if (var12 == null) {
                                    break label108;
                                }
                                class67 var13 = var12.field3125;
                                if (var13 == null || var13.field1643 <= var9) {
                                    var12.field3127 = true;
                                    int var14 = var12.method306();
                                    var5 += var14;
                                    if (var13 != null) {
                                        var13.field1643 += var14;
                                    }
                                    if (var5 >= this.field1193) {
                                        break label114;
                                    }
                                    class130 var15 = var12.method300();
                                    if (var15 != null) {
                                        int var16 = var12.field3126;
                                        while (var15 != null) {
                                            this.method445((byte) 85, var15, var16 * var15.method546() >> 8);
                                            var15 = var12.method307();
                                        }
                                    }
                                    class130 var17 = var12.field3124;
                                    var12.field3124 = null;
                                    if (var11 == null) {
                                        this.field1227[var8] = var17;
                                    } else {
                                        var11.field3124 = var17;
                                    }
                                    if (var17 == null) {
                                        this.field1235[var8] = var11;
                                    }
                                    var12 = var17;
                                } else {
                                    var6 |= 0x1 << var8;
                                    var11 = var12;
                                    var12 = var12.field3124;
                                }
                            }
                        }
                    }
                    var8 += 4;
                    var9++;
                }
                var7--;
            }
            for (int var18 = 0; var18 < 8; var18++) {
                class130 var19 = this.field1227[var18];
                this.field1227[var18] = this.field1235[var18] = null;
                while (var19 != null) {
                    class130 var20 = var19.field3124;
                    var19.field3124 = null;
                    var19 = var20;
                }
            }
        }
        if (this.field1236 < 0) {
            this.field1236 = 0;
        }
        if (this.field1215 != null) {
            this.field1215.method304(arg0, 0, arg1);
        }
        this.field1223 = class77.method657(3745);
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
    public static final void method437(int arg0) {
        field1192++;
        try {
            if (class92.field2301 == 0) {
                if (class125.field3030 != null) {
                    class125.field3030.method38((byte) 61);
                    class125.field3030 = null;
                }
                class92.field2301 = 1;
                class60.field1485 = false;
                class24.field567 = 0;
                class127.field3073 = null;
            }
            if (class92.field2301 == 1) {
                if (class127.field3073 == null) {
                    class127.field3073 = class115.field2770.method1200(class39.field894, (byte) -92);
                }
                if (class127.field3073.field2117 == 2) {
                    throw new IOException();
                }
                if (class127.field3073.field2117 == 1) {
                    class125.field3030 = new class8((Socket) class127.field3073.field2118, class115.field2770);
                    class92.field2301 = 2;
                    class127.field3073 = null;
                }
            }
            if (~class92.field2301 == arg0) {
                long var1 = class136.field3278 = class52.field1166.method700((byte) 25);
                class80.field1978.field1128 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class80.field1978.method393(14, -17343);
                class80.field1978.method393(var3, -17343);
                class125.field3030.method45(0, 2, (byte) 87, class80.field1978.field1084);
                class87.field2148.field1128 = 0;
                class92.field2301 = 3;
            }
            if (class92.field2301 == 3) {
                field1203.method439(arg0 ^ 0xFFFFFFF7);
                class146.field3591.method439(10);
                int var4 = class125.field3030.method39((byte) -19);
                field1203.method439(10);
                class146.field3591.method439(arg0 + 13);
                if (var4 != 0) {
                    class77.method656(var4, 10);
                    return;
                }
                class87.field2148.field1128 = 0;
                class92.field2301 = 4;
            }
            if (class92.field2301 == 4) {
                if (class87.field2148.field1128 < 8) {
                    int var5 = class125.field3030.method37(-127);
                    if (var5 > 8 - class87.field2148.field1128) {
                        var5 = 8 - class87.field2148.field1128;
                    }
                    if (var5 > 0) {
                        class125.field3030.method40(class87.field2148.field1128, var5, -19746, class87.field2148.field1084);
                        class87.field2148.field1128 += var5;
                    }
                }
                if (class87.field2148.field1128 == 8) {
                    class87.field2148.field1128 = 0;
                    class94.field2334 = class87.field2148.method401(true);
                    class92.field2301 = 5;
                }
            }
            if (class92.field2301 == 5) {
                class80.field1978.field1128 = 0;
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class94.field2334 >> 32), (int) class94.field2334 };
                class80.field1978.method393(10, arg0 ^ 0x43BC);
                class80.field1978.method378(2, var6[0]);
                class80.field1978.method378(2, var6[1]);
                class80.field1978.method378(arg0 + 5, var6[2]);
                class80.field1978.method378(2, var6[3]);
                class80.field1978.method378(2, class115.field2770.field3608);
                class80.field1978.method419(false, class52.field1166.method700((byte) 25));
                class80.field1978.method367(-128, class52.field1180);
                class80.field1978.method379((byte) -67, class134.field3204, class109.field2622);
                class10.field171.field1128 = 0;
                if (class145.field3495 == 40) {
                    class10.field171.method393(18, -17343);
                } else {
                    class10.field171.method393(16, -17343);
                }
                class10.field171.method393(class80.field1978.field1128 + 69, arg0 + -17340);
                class10.field171.method378(2, 451);
                class10.field171.method393(class124.field3012 ? 1 : 0, -17343);
                class10.field171.method378(2, class79.field1969.field2955);
                class10.field171.method378(2, class126.field3051.field2955);
                class10.field171.method378(arg0 + 5, class77.field1945.field2955);
                class10.field171.method378(2, class62.field1553.field2955);
                class10.field171.method378(2, class120.field2870.field2955);
                class10.field171.method378(2, class59.field1462.field2955);
                class10.field171.method378(2, class27.field655.field2955);
                class10.field171.method378(2, class1.field16.field2955);
                class10.field171.method378(2, class136.field3279.field2955);
                class10.field171.method378(2, class10.field177.field2955);
                class10.field171.method378(2, class47.field1008.field2955);
                class10.field171.method378(2, class94.field2333.field2955);
                class10.field171.method378(2, class88.field2215.field2955);
                class10.field171.method378(2, class110.field2654.field2955);
                class10.field171.method378(arg0 + 5, class145.field3510.field2955);
                class10.field171.method378(2, class82.field2010.field2955);
                class10.field171.method381(0, class80.field1978.field1128, class80.field1978.field1084, (byte) -127);
                class125.field3030.method45(0, class10.field171.field1128, (byte) 87, class10.field171.field1084);
                class80.field1978.method763((byte) 32, var6);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class87.field2148.method763((byte) 32, var6);
                class92.field2301 = 6;
            }
            if (class92.field2301 == 6 && class125.field3030.method37(arg0 ^ 0x33) > 0) {
                int var8 = class125.field3030.method39((byte) -89);
                if (var8 == 21 && class145.field3495 == 20) {
                    class92.field2301 = 7;
                } else if (var8 == 2) {
                    class92.field2301 = 9;
                } else if (var8 == 15 && class145.field3495 == 40) {
                    class74.method638(arg0 ^ 0xFFFFFFFD);
                    return;
                } else if (var8 == 23 && class17.field388 < 1) {
                    class17.field388++;
                    class92.field2301 = 0;
                } else {
                    class77.method656(var8, 10);
                    return;
                }
            }
            if (class92.field2301 == 7 && class125.field3030.method37(arg0 - 121) > 0) {
                class39.field864 = class125.field3030.method39((byte) -14) * 60 + 180;
                class92.field2301 = 8;
            }
            if (class92.field2301 == 8) {
                class24.field567 = 0;
                class6.method36(false, class119.field2850, class51.method408(new class84[] { class93.method787(22245, class39.field864 / 60), class124.field3013 }, arg0 + 24), class126.field3039);
                if (--class39.field864 <= 0) {
                    class92.field2301 = 0;
                }
            } else {
                if (class92.field2301 == 9 && class125.field3030.method37(-78) >= 8) {
                    class102.field2478 = class125.field3030.method39((byte) -86);
                    class20.field412 = class125.field3030.method39((byte) -109) == 1;
                    class90.field2264 = class125.field3030.method39((byte) -116);
                    class90.field2264 <<= 0x8;
                    class90.field2264 += class125.field3030.method39((byte) -73);
                    class91.field2275 = class125.field3030.method39((byte) -33);
                    class125.field3030.method40(0, 1, -19746, class87.field2148.field1084);
                    class87.field2148.field1128 = 0;
                    class103.field2508 = class87.field2148.method761(7595);
                    class125.field3030.method40(0, 2, arg0 - 19743, class87.field2148.field1084);
                    class87.field2148.field1128 = 0;
                    class86.field2128 = class87.field2148.method383(-2056200760);
                    class92.field2301 = 10;
                }
                if (class92.field2301 != 10) {
                    class24.field567++;
                    if (class24.field567 > 2000) {
                        if (class17.field388 < 1) {
                            if (class47.field1020 == class39.field894) {
                                class39.field894 = client.field455;
                            } else {
                                class39.field894 = class47.field1020;
                            }
                            class92.field2301 = 0;
                            class17.field388++;
                        } else {
                            class77.method656(-3, arg0 ^ -9);
                        }
                    }
                } else if (class125.field3030.method37(-27) >= class86.field2128) {
                    class87.field2148.field1128 = 0;
                    class125.field3030.method40(0, class86.field2128, -19746, class87.field2148.field1084);
                    class77.method662(arg0 ^ 0xFFFFFFFD);
                    field1191 = -1;
                    class117.method952(arg0 + 13776, false);
                    class103.field2508 = -1;
                }
            }
        } catch (IOException var9) {
            if (class17.field388 < 1) {
                class92.field2301 = 0;
                if (class47.field1020 == class39.field894) {
                    class39.field894 = client.field455;
                } else {
                    class39.field894 = class47.field1020;
                }
                class17.field388++;
            } else {
                class77.method656(-2, 10);
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILu;)V")
    public final synchronized void method438(int arg0, class130 arg1) {
        field1210++;
        this.field1215 = arg1;
        if (arg0 != 0) {
            this.method438(23, null);
        }
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)V")
    private final void method439(int arg0) {
        if (arg0 != 10) {
            this.field1227 = null;
        }
        field1217++;
        this.field1232 = true;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lv;Lsd;Lsd;ILsd;)Z")
    public static final boolean method440(class136 arg0, class122 arg1, class122 arg2, int arg3, class122 arg4) {
        if (arg3 != 2000) {
            field1202 = null;
        }
        class93.field2312 = arg1;
        field1211++;
        class24.field558 = arg4;
        class69.field1689 = arg0;
        class144.field3456 = arg2;
        return true;
    }

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)V")
    public static final void method441(int arg0) {
        field1218++;
        if (arg0 > -30) {
            return;
        }
        if (class147.field3603.toLowerCase().indexOf("microsoft") != -1) {
            class125.field3026[222] = 59;
            class125.field3026[192] = 58;
            class125.field3026[189] = 26;
            class125.field3026[220] = 74;
            class125.field3026[223] = 28;
            class125.field3026[187] = 27;
            class125.field3026[191] = 73;
            class125.field3026[219] = 42;
            class125.field3026[221] = 43;
            class125.field3026[190] = 72;
            class125.field3026[186] = 57;
            class125.field3026[188] = 71;
            return;
        }
        class125.field3026[93] = 43;
        class125.field3026[45] = 26;
        class125.field3026[47] = 73;
        class125.field3026[44] = 71;
        class125.field3026[46] = 72;
        if (class147.field3619 == null) {
            class125.field3026[222] = 59;
            class125.field3026[192] = 58;
        } else {
            class125.field3026[222] = 58;
            class125.field3026[192] = 28;
            class125.field3026[520] = 59;
        }
        class125.field3026[59] = 57;
        class125.field3026[92] = 74;
        class125.field3026[91] = 42;
        class125.field3026[61] = 27;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public final synchronized void method442(byte arg0) {
        long var2 = class77.method657(3745);
        field1219++;
        try {
            if (this.field1230 != 0L) {
                if (this.field1230 > var2) {
                    return;
                }
                this.method161(this.field1228);
                this.field1232 = true;
                this.field1230 = 0L;
            }
            int var4 = this.method160();
            if (this.field1234 < this.field1229 - var4) {
                this.field1234 = this.field1229 - var4;
            }
            int var5 = this.field1233 + this.field1231;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field1228 < var5 + 256) {
                var4 = 0;
                this.field1228 += 1024;
                if (this.field1228 > 16384) {
                    this.field1228 = 16384;
                }
                this.method162();
                this.method161(this.field1228);
                if (var5 + 256 > this.field1228) {
                    var5 = this.field1228 - 256;
                    this.field1231 = var5 - this.field1233;
                }
                this.field1232 = true;
            }
            while (var4 < var5) {
                this.method436(this.field1206, 256);
                var4 += 256;
                this.method157();
            }
            if (arg0 >= -4) {
                return;
            }
            if (this.field1225 < var2) {
                if (this.field1232) {
                    this.field1232 = false;
                } else if (this.field1234 == 0 && this.field1226 == 0) {
                    this.method162();
                    this.field1230 = var2 + 2000L;
                    return;
                } else {
                    this.field1231 = Math.min(this.field1226, this.field1234);
                    this.field1226 = this.field1234;
                }
                this.field1234 = 0;
                this.field1225 = var2 + 2000L;
            }
            this.field1229 = var4;
        } catch (Exception var7) {
            this.method162();
            this.field1230 = var2 + 2000L;
        }
        try {
            if (this.field1223 + 500000L < var2) {
                var2 = this.field1223;
            }
            while (var2 > this.field1223 + 5000L) {
                this.method435(256, false);
                this.field1223 += 256000 / class1.field4;
            }
        } catch (Exception var6) {
            this.field1223 = var2;
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V")
    public final synchronized void method443(byte arg0) {
        this.field1232 = true;
        int var2 = -85 / ((-arg0 - 65) / 45);
        try {
            this.method159();
        } catch (Exception var3) {
            this.method162();
            this.field1230 = class77.method657(3745) + 2000L;
        }
        field1208++;
    }

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V")
    public void method161(int arg0) throws Exception {
        field1195++;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "()V")
    public void method162() {
        field1220++;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIII)I")
    public static final int method444(int arg0, int arg1, int arg2, int arg3) {
        field1205++;
        if (arg0 == 6553) {
            int var4 = 256 - arg1;
            return ((arg2 & 0xFF00FF) * var4 + (arg3 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg2 & 0xFF00) * var4 + (arg3 & 0xFF00) * arg1 & 0xFF0000) >> 8;
        } else {
            return 24;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLu;I)V")
    private final void method445(byte arg0, class130 arg1, int arg2) {
        field1201++;
        int var4 = arg2 >> 5;
        class130 var5 = this.field1235[var4];
        if (arg0 != 85) {
            this.field1235 = null;
        }
        if (var5 == null) {
            this.field1227[var4] = arg1;
        } else {
            var5.field3124 = arg1;
        }
        this.field1235[var4] = arg1;
        arg1.field3126 = arg2;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method158(Component arg0) throws Exception {
        field1213++;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "()V")
    public void method159() throws Exception {
        field1194++;
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "()I")
    public int method160() throws Exception {
        field1214++;
        return this.field1228;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BI)Lbc;")
    public static final class11 method446(byte arg0, int arg1) {
        field1200++;
        if (arg0 != 103) {
            return null;
        }
        class11 var2 = (class11) class40.field912.method970(-27059, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class44.field971.method986(arg1, 4, (byte) 67);
        class11 var4 = new class11();
        if (var3 != null) {
            var4.method68(arg1, -121, new class51(var3));
        }
        var4.method65(34);
        class40.field912.method965(var4, 208, (long) arg1);
        return var4;
    }
}
