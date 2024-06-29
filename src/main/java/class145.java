import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class145 implements Runnable {

    @OriginalMember(owner = "client!va", name = "p", descriptor = "Z")
    private boolean field3428 = false;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    private int field3427 = 0;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "Z")
    private boolean field3436 = false;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "I")
    private int field3437 = 0;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "Loc;")
    private class100 field3417;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "Ljava/net/Socket;")
    private Socket field3419;

    @OriginalMember(owner = "client!va", name = "A", descriptor = "Ljava/io/InputStream;")
    private InputStream field3439;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3426;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "Laf;")
    public static class7 field3414 = class48.method406(40, "Passwort: ");

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public static int field3423 = 0;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "I")
    public static int field3433 = 0;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public static int field3421 = 0;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "Ljava/lang/Object;")
    public static Object field3415 = new Object();

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "Ln;")
    private class90 field3420;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "[B")
    private byte[] field3429;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "[[[B")
    public static byte[][][] field3422;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)I")
    public final int method1171(int arg0) throws IOException {
        field3434++;
        if (this.field3436) {
            return 0;
        } else {
            if (arg0 != 3429) {
                this.field3437 = 31;
            }
            return this.field3439.read();
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
    public final void method1172(byte arg0) {
        if (arg0 != 10) {
            return;
        }
        field3416++;
        if (this.field3436) {
            return;
        }
        synchronized (this) {
            this.field3436 = true;
            this.notifyAll();
        }
        if (this.field3420 != null) {
            while (this.field3420.field2087 == 0) {
                class79.method673(2, 1L);
            }
            if (this.field3420.field2087 == 1) {
                try {
                    ((Thread) this.field3420.field2090).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field3420 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)V")
    public static final void method1173(int arg0, byte arg1) {
        field3438++;
        if (arg1 != 11) {
            method1174(null, null, true, -102, null);
        }
        if (class9.method106(arg0, (byte) 116)) {
            class38.method333(class52.field1251[arg0], -4407, -1);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lkb;Lkb;ZILad;)V")
    public static final void method1174(class71 arg0, class71 arg1, boolean arg2, int arg3, class5 arg4) {
        field3413++;
        class133.field3126 = arg1;
        class126.field3005 = arg0;
        class28.field727 = arg2;
        class133.field3126.method562((byte) -123, arg3);
        class109.field2651 = arg4;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(B)I")
    public final int method1175(byte arg0) throws IOException {
        if (arg0 >= -111) {
            field3433 = -127;
        }
        field3431++;
        return this.field3436 ? 0 : this.field3439.available();
    }

    @OriginalMember(owner = "client!va", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field3418++;
        this.method1172((byte) 10);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I[BII)V")
    public final void method1176(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg0 != -1549) {
            return;
        }
        field3435++;
        if (this.field3436) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field3439.read(arg1, arg3, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 += var5;
            arg2 -= var5;
        }
    }

    @OriginalMember(owner = "client!va", name = "run", descriptor = "()V")
    public final void run() {
        field3425++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field3437 == this.field3427) {
                        if (this.field3436) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field3437;
                    if (this.field3427 >= this.field3437) {
                        var3 = this.field3427 - this.field3437;
                    } else {
                        var3 = 5000 - this.field3437;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field3426.write(this.field3429, var2, var3);
                    } catch (IOException var9) {
                        this.field3428 = true;
                    }
                    this.field3437 = (this.field3437 + var3) % 5000;
                    try {
                        if (this.field3437 == this.field3427) {
                            this.field3426.flush();
                        }
                    } catch (IOException var8) {
                        this.field3428 = true;
                    }
                }
            }
            try {
                if (this.field3439 != null) {
                    this.field3439.close();
                }
                if (this.field3426 != null) {
                    this.field3426.close();
                }
                if (this.field3419 != null) {
                    this.field3419.close();
                }
            } catch (IOException var7) {
            }
            this.field3429 = null;
        } catch (Exception var12) {
            class144.method1169(var12, (byte) -121, null);
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
    public static void method1177(int arg0) {
        field3422 = null;
        field3415 = null;
        if (arg0 != 10237) {
            method1177(-36);
        }
        field3414 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IBI[B)V")
    public final void method1178(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = -21 % ((2 - arg1) / 51);
        field3430++;
        if (this.field3436) {
            return;
        }
        if (this.field3428) {
            this.field3428 = false;
            throw new IOException();
        }
        if (this.field3429 == null) {
            this.field3429 = new byte[5000];
        }
        synchronized (this) {
            for (int var7 = 0; var7 < arg0; var7++) {
                this.field3429[this.field3427] = arg3[arg2 + var7];
                this.field3427 = (this.field3427 + 1) % 5000;
                if ((this.field3437 + 4900) % 5000 == this.field3427) {
                    throw new IOException();
                }
            }
            if (this.field3420 == null) {
                this.field3420 = this.field3417.method823((byte) -116, 3, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(B)V")
    public static final void method1179(byte arg0) {
        if (class14.field361 > 0) {
            class14.field361--;
        }
        field3424++;
        if (class136.field3254 > 1) {
            class136.field3254--;
        }
        if (class46.field1107) {
            class46.field1107 = false;
            class4.method27((byte) 67);
            return;
        }
        for (int var1 = 0; var1 < 100 && class121.method930(-93); var1++) {
        }
        if (class108.field2634 != 30) {
            return;
        }
        class68.method545(class47.field1150, 44, -5);
        Object var2 = class43.field1033.field3542;
        synchronized (class43.field1033.field3542) {
            if (!class152.field3563) {
                class43.field1033.field3550 = 0;
            } else if (class13.field337 != 0 || class43.field1033.field3550 >= 40) {
                class47.field1150.method1131(159, 2027385224);
                class47.field1150.method959(0, (byte) -120);
                int var3 = 0;
                int var4 = class47.field1150.field2903;
                class75.field1744++;
                for (int var5 = 0; class43.field1033.field3550 > var5 && class47.field1150.field2903 - var4 < 240; var5++) {
                    var3++;
                    int var6 = class43.field1033.field3551[var5];
                    int var7 = class43.field1033.field3549[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 502) {
                        var7 = 502;
                    }
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 764) {
                        var6 = 764;
                    }
                    int var8 = var7 * 765 + var6;
                    if (class43.field1033.field3549[var5] == -1 && class43.field1033.field3551[var5] == -1) {
                        var7 = -1;
                        var8 = 524287;
                        var6 = -1;
                    }
                    if (class130.field3077 != var6 || class48.field1165 != var7) {
                        int var9 = var6 - class130.field3077;
                        int var10 = var7 - class48.field1165;
                        class130.field3077 = var6;
                        class48.field1165 = var7;
                        if (class18.field421 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class47.field1150.method933((byte) 105, (var9 << 6) + ((class18.field421 << 12) + var10));
                            class18.field421 = 0;
                        } else if (class18.field421 < 8) {
                            class47.field1150.method982((class18.field421 << 19) + var8 + 8388608, (byte) 58);
                            class18.field421 = 0;
                        } else {
                            class47.field1150.method970((byte) -96, (class18.field421 << 19) + (var8 - 1073741824));
                            class18.field421 = 0;
                        }
                    } else if (class18.field421 < 2047) {
                        class18.field421++;
                    }
                }
                class47.field1150.method976(class47.field1150.field2903 - var4, (byte) 21);
                if (class43.field1033.field3550 <= var3) {
                    class43.field1033.field3550 = 0;
                } else {
                    class43.field1033.field3550 -= var3;
                    for (int var11 = 0; var11 < class43.field1033.field3550; var11++) {
                        class43.field1033.field3551[var11] = class43.field1033.field3551[var3 + var11];
                        class43.field1033.field3549[var11] = class43.field1033.field3549[var11 + var3];
                    }
                }
            }
        }
        if (class13.field337 != 0) {
            class91.field2098++;
            int var12 = class111.field2668;
            if (var12 < 0) {
                var12 = 0;
            } else if (var12 > 502) {
                var12 = 502;
            }
            long var13 = (class2.field8 - class98.field2329) / 50L;
            if (var13 > 4095L) {
                var13 = 4095L;
            }
            class98.field2329 = class2.field8;
            int var15 = class10.field267;
            byte var16 = 0;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 764) {
                var15 = 764;
            }
            int var17 = var12 * 765 + var15;
            if (class13.field337 == 2) {
                var16 = 1;
            }
            int var18 = (int) var13;
            class47.field1150.method1131(38, 2027385224);
            class47.field1150.method937((var18 << 20) + (var16 << 19) + var17, 675597904);
        }
        if (class119.field2818[96] || class119.field2818[97] || class119.field2818[98] || class119.field2818[99]) {
            class32.field855 = true;
        }
        if (class144.field3400 > 0) {
            class144.field3400--;
        }
        if (class32.field855 && class144.field3400 <= 0) {
            client.field572++;
            class32.field855 = false;
            class144.field3400 = 20;
            class47.field1150.method1131(70, 2027385224);
            class47.field1150.method933((byte) 116, class4.field48);
            class47.field1150.method939(466050456, class9.field239);
        }
        if (class121.field2845 && !class111.field2682) {
            class111.field2682 = true;
            class47.field1150.method1131(79, 2027385224);
            class47.field1149++;
            class47.field1150.method959(1, (byte) -120);
        }
        if (!class121.field2845 && class111.field2682) {
            class111.field2682 = false;
            class47.field1150.method1131(79, 2027385224);
            class47.field1149++;
            class47.field1150.method959(0, (byte) -120);
        }
        class79.method669(-30553);
        if (class108.field2634 != 30) {
            return;
        }
        class133.method1077((byte) -106);
        class148.method1190(47);
        class4.field63++;
        if (class4.field63 > 750) {
            class4.method27((byte) 67);
            return;
        }
        class77.method660(true);
        class53.method431((byte) 126);
        class46.method390(0);
        if (class28.field726 != 0) {
            class37.field926 += 20;
            if (class37.field926 >= 400) {
                class28.field726 = 0;
            }
        }
        class108.field2646++;
        if (class6.field118 != null) {
            class120.field2836++;
            if (class120.field2836 >= 15) {
                class141.method1151(15569, class6.field118);
                class6.field118 = null;
            }
        }
        if (class48.field1168 != null) {
            class141.method1151(15569, class48.field1168);
            if (class71.field1542 + 5 < class113.field2709 || class71.field1542 - 5 > class113.field2709 || class141.field3320 + 5 < class111.field2681 || class141.field3320 - 5 > class111.field2681) {
                client.field552 = true;
            }
            class25.field666++;
            if (class97.field2311 == 0) {
                if (client.field552 && class25.field666 >= 5) {
                    if (class9.field253 == class48.field1168 && class44.field1048 != class119.field2812) {
                        class74.field1710++;
                        byte var19 = 0;
                        class103 var20 = class48.field1168;
                        if (field3423 == 1 && var20.field2512 == 206) {
                            var19 = 1;
                        }
                        if (var20.field2438[class119.field2812] <= 0) {
                            var19 = 0;
                        }
                        if (class83.method699(-15602, class7.method98(26454, var20))) {
                            int var21 = class44.field1048;
                            int var22 = class119.field2812;
                            var20.field2438[var22] = var20.field2438[var21];
                            var20.field2435[var22] = var20.field2435[var21];
                            var20.field2438[var21] = -1;
                            var20.field2435[var21] = 0;
                        } else if (var19 == 1) {
                            int var23 = class44.field1048;
                            int var24 = class119.field2812;
                            while (var23 != var24) {
                                if (var24 < var23) {
                                    var20.method846(var23, 3875, var23 - 1);
                                    var23--;
                                } else if (var24 > var23) {
                                    var20.method846(var23, 3875, var23 + 1);
                                    var23++;
                                }
                            }
                        } else {
                            var20.method846(class44.field1048, 3875, class119.field2812);
                        }
                        class47.field1150.method1131(20, 2027385224);
                        class47.field1150.method970((byte) -96, class48.field1168.field2442);
                        class47.field1150.method939(466050456, class119.field2812);
                        class47.field1150.method973(128, class44.field1048);
                        class47.field1150.method936(var19, -64);
                    }
                } else if ((class86.field2015 == 1 || class93.method749(class19.field449 - 1, (byte) 1)) && class19.field449 > 2) {
                    class93.method748((byte) 127);
                } else if (class19.field449 > 0) {
                    class98.method805(class19.field449 - 1, true);
                }
                class48.field1168 = null;
                class13.field337 = 0;
                class120.field2836 = 10;
            }
        }
        class43.field1039 = 0;
        class86.field2004 = false;
        class106.field2607 = false;
        class103 var25 = class77.field1776;
        class4.field41 = null;
        class77.field1776 = null;
        class103 var26 = class137.field3271;
        class137.field3271 = null;
        while (class118.method916(127) && class43.field1039 < 128) {
            class3.field40[class43.field1039] = class25.field667;
            class50.field1195[class43.field1039] = class2.field12;
            class43.field1039++;
        }
        class137.method1125(0, 503, false, 765, class9.field250, 0, 0, 0);
        class23.field637 = false;
        class69.field1508++;
        while (true) {
            class39 var27 = (class39) class144.field3408.method768((byte) -11);
            if (var27 == null) {
                while (true) {
                    class39 var28 = (class39) class12.field314.method768((byte) -11);
                    if (var28 == null) {
                        while (true) {
                            class39 var29 = (class39) class9.field219.method768((byte) -11);
                            if (var29 == null) {
                                if (class81.field1865 != null) {
                                    class136.method1121(29714);
                                }
                                if (class124.field2966 != -1) {
                                    int var30 = class124.field2966;
                                    int var31 = class124.field2978;
                                    boolean var32 = class57.method469(var30, var31, 10, 0, class21.field531.field493[0], 0, 0, 0, true, 0, 0, class21.field531.field509[0]);
                                    if (var32) {
                                        class28.field726 = 1;
                                        class142.field3356 = class111.field2668;
                                        class48.field1162 = class10.field267;
                                        class37.field926 = 0;
                                    }
                                    class124.field2966 = -1;
                                }
                                class118.method907(true);
                                if (class77.field1776 != var25) {
                                    if (var25 != null) {
                                        class141.method1151(15569, var25);
                                    }
                                    if (class77.field1776 != null) {
                                        class141.method1151(15569, class77.field1776);
                                    }
                                }
                                if (class137.field3271 != var26 && class9.field241 == class153.field3574) {
                                    if (var26 != null) {
                                        class141.method1151(15569, var26);
                                    }
                                    if (class137.field3271 != null) {
                                        class141.method1151(15569, class137.field3271);
                                    }
                                }
                                if (class137.field3271 == null) {
                                    if (class9.field241 > 0) {
                                        class9.field241--;
                                    }
                                } else if (class153.field3574 > class9.field241) {
                                    class9.field241++;
                                    if (class9.field241 == class153.field3574) {
                                        class141.method1151(15569, class137.field3271);
                                    }
                                }
                                class79.method671(35);
                                if (class121.field2848) {
                                    class83.method701(128);
                                }
                                for (int var33 = 0; var33 < 5; var33++) {
                                    int var10002 = class51.field1233[var33]++;
                                }
                                int var34 = class151.method1198(0);
                                int var35 = class139.method1140(false);
                                if (var34 > 4500 && var35 > 4500) {
                                    class14.field361 = 250;
                                    class3.field29++;
                                    class78.method664(4000, 64);
                                    class47.field1150.method1131(218, 2027385224);
                                }
                                class108.field2633++;
                                int var36 = -53 % ((-arg0 - 64) / 37);
                                class8.field180++;
                                class149.field3522++;
                                if (class149.field3522 > 500) {
                                    class149.field3522 = 0;
                                    int var37 = (int) (Math.random() * 8.0D);
                                    if ((var37 & 0x4) == 4) {
                                        class22.field603 += class51.field1211;
                                    }
                                    if ((var37 & 0x2) == 2) {
                                        class78.field1811 += class122.field2905;
                                    }
                                    if ((var37 & 0x1) == 1) {
                                        class89.field2083 += class45.field1068;
                                    }
                                }
                                if (class89.field2083 < -50) {
                                    class45.field1068 = 2;
                                }
                                if (class78.field1811 < -55) {
                                    class122.field2905 = 2;
                                }
                                if (class22.field603 < -40) {
                                    class51.field1211 = 1;
                                }
                                if (class108.field2633 > 500) {
                                    int var38 = (int) (Math.random() * 8.0D);
                                    if ((var38 & 0x2) == 2) {
                                        class113.field2705 += class50.field1194;
                                    }
                                    class108.field2633 = 0;
                                    if ((var38 & 0x1) == 1) {
                                        client.field577 += class47.field1143;
                                    }
                                }
                                if (class78.field1811 > 55) {
                                    class122.field2905 = -2;
                                }
                                if (class22.field603 > 40) {
                                    class51.field1211 = -1;
                                }
                                if (class113.field2705 < -20) {
                                    class50.field1194 = 1;
                                }
                                if (client.field577 < -60) {
                                    class47.field1143 = 2;
                                }
                                if (client.field577 > 60) {
                                    class47.field1143 = -2;
                                }
                                if (class89.field2083 > 50) {
                                    class45.field1068 = -2;
                                }
                                if (class113.field2705 > 10) {
                                    class50.field1194 = -1;
                                }
                                if (class8.field180 > 50) {
                                    class96.field2271++;
                                    class47.field1150.method1131(118, 2027385224);
                                }
                                try {
                                    if (class12.field302 == null || class47.field1150.field2903 <= 0) {
                                        return;
                                    } else {
                                        class12.field302.method1178(class47.field1150.field2903, (byte) 104, 0, class47.field1150.field2895);
                                        class8.field180 = 0;
                                        class47.field1150.field2903 = 0;
                                        return;
                                    }
                                } catch (IOException var39) {
                                    class4.method27((byte) 67);
                                    return;
                                }
                            }
                            class80.method675(-2001, var29);
                        }
                    }
                    class80.method675(-2001, var28);
                }
            }
            class80.method675(-2001, var27);
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ljava/net/Socket;Loc;)V")
    public class145(Socket arg0, class100 arg1) throws IOException {
        this.field3417 = arg1;
        this.field3419 = arg0;
        this.field3419.setSoTimeout(30000);
        this.field3419.setTcpNoDelay(true);
        this.field3439 = this.field3419.getInputStream();
        this.field3426 = this.field3419.getOutputStream();
    }
}
