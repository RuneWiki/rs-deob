import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class41 implements Runnable {

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    private int field626 = 0;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "Z")
    private boolean field620 = false;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "Z")
    private boolean field633 = false;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
    private int field636 = 0;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "Lbk;")
    private class69 field629;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "Ljava/net/Socket;")
    private Socket field630;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field621;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field625;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field623 = 0;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "[Z")
    public static boolean[] field637 = new boolean[5];

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "F")
    public static float field632;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "Llg;")
    public static class132 field635;

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "Lub;")
    private class23 field645;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "[B")
    private byte[] field643;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V", line = 14)
    public static void method369(int arg0) {
        if (arg0 != 14709) {
            field623 = 107;
        }
        field635 = null;
        field637 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)I", line = 25)
    public final int method370(byte arg0) throws IOException {
        field642++;
        if (this.field620) {
            return 0;
        } else if (arg0 <= 122) {
            return 58;
        } else {
            return this.field621.available();
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V", line = 42)
    public final void method371(int arg0) {
        field627++;
        if (this.field620) {
            return;
        }
        if (arg0 != -2) {
            field635 = (class132) null;
        }
        synchronized (this) {
            this.field620 = true;
            this.notifyAll();
        }
        if (this.field645 != null) {
            while (this.field645.field405 == 0) {
                class245.method1729(122, 1L);
            }
            if (this.field645.field405 == 1) {
                try {
                    ((Thread) this.field645.field409).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field645 = null;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Ljava/net/Socket;Lbk;)V", line = 892)
    public class41(Socket arg0, class69 arg1) throws IOException {
        this.field629 = arg1;
        this.field630 = arg0;
        this.field630.setSoTimeout(30000);
        this.field630.setTcpNoDelay(true);
        this.field621 = this.field630.getInputStream();
        this.field625 = this.field630.getOutputStream();
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)I", line = 87)
    public final int method372(int arg0) throws IOException {
        field641++;
        if (arg0 == 0) {
            return this.field620 ? 0 : this.field621.read();
        } else {
            return 30;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II[BI)V", line = 101)
    public final void method373(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field640++;
        if (this.field620 || arg0 != 1) {
            return;
        }
        if (this.field633) {
            this.field633 = false;
            throw new IOException();
        }
        if (this.field643 == null) {
            this.field643 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field643[this.field626] = arg2[arg1 + var6];
                this.field626 = (this.field626 + 1) % 5000;
                if (((this.field636 + 4900) % 5000) == this.field626) {
                    throw new IOException();
                }
            }
            if (this.field645 == null) {
                this.field645 = this.field629.method553(this, (byte) 124, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)V", line = 163)
    public final void method374(byte arg0) throws IOException {
        field634++;
        if (arg0 != 127) {
            method379(126);
        }
        if (!this.field620 && this.field633) {
            this.field633 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!kc", name = "run", descriptor = "()V", line = 191)
    public final void run() {
        try {
            while (true) {
                int var3;
                int var4;
                synchronized (this) {
                    if (this.field636 == this.field626) {
                        if (this.field620) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var12) {
                        }
                    }
                    if (this.field636 <= this.field626) {
                        var3 = this.field626 - this.field636;
                    } else {
                        var3 = 5000 - this.field636;
                    }
                    var4 = this.field636;
                }
                if (var3 > 0) {
                    try {
                        this.field625.write(this.field643, var4, var3);
                    } catch (IOException var11) {
                        this.field633 = true;
                    }
                    this.field636 = (this.field636 + var3) % 5000;
                    try {
                        if (this.field636 == this.field626) {
                            this.field625.flush();
                        }
                    } catch (IOException var10) {
                        this.field633 = true;
                    }
                }
            }
            try {
                if (this.field621 != null) {
                    this.field621.close();
                }
                if (this.field625 != null) {
                    this.field625.close();
                }
                if (this.field630 != null) {
                    this.field630.close();
                }
            } catch (IOException var13) {
            }
            this.field643 = null;
        } catch (Exception var15) {
            class79.method622((String) null, var15, -652852820);
        }
        field631++;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZII[Lmf;I[B)V", line = 260)
    public static final void method375(boolean arg0, int arg1, int arg2, class53[] arg3, int arg4, byte[] arg5) {
        field644++;
        int var6 = -1;
        class1 var7 = new class1(arg5);
        if (arg4 != 20) {
            field623 = -60;
        }
        while (true) {
            int var8 = var7.method1((byte) 84);
            if (var8 == 0) {
                return;
            }
            var6 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var7.method63(arg4 + 107);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 12;
                int var13 = var7.method15((byte) -126);
                int var14 = var9 >> 6 & 0x3F;
                int var15 = var13 >> 2;
                int var16 = var13 & 0x3;
                int var17 = arg2 + var14;
                int var18 = arg1 + var11;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    class53 var19 = null;
                    if (!arg0) {
                        int var20 = var12;
                        if ((class332.field5184[1][var17][var18] & 0x2) == 2) {
                            var20 = var12 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg3[var20];
                        }
                    }
                    class95.method776(var6, var16, 117, var12, arg0, var12, var19, !arg0, var15, var17, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIII)V", line = 338)
    public static final void method376(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class166.field2681 = 0;
        for (int var7 = arg5; var7 < class83.field1290 + class45.field703; var7++) {
            class294 var8;
            if (var7 == -1) {
                var8 = class345.field5363;
            } else if (var7 >= class45.field703) {
                var8 = class197.field3029[class76.field1192[var7 - class45.field703]];
            } else {
                var8 = class74.field1140[class325.field5068[var7]];
            }
            if (var8 != null && var8.method681(true)) {
                if (var8 instanceof class86) {
                    class84 var9 = ((class86) var8).field1381;
                    if (var9.field1339 != null) {
                        var9 = var9.method667(-87);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (var7 >= class45.field703) {
                    class84 var10 = ((class86) var8).field1381;
                    if (var10.field1339 != null) {
                        var10 = var10.method667(arg5 - 118);
                    }
                    if (var10.field1308 >= 0 && var10.field1308 < class28.field445.length) {
                        int var11;
                        if (var10.field1334 == -1) {
                            var11 = var8.method2066(90) + 15;
                        } else {
                            var11 = var10.field1334 + 15;
                        }
                        class225.method1650(arg6 >> 1, var8, (byte) -81, arg0, arg2 >> 1, var11, arg1);
                        if (class57.field866 > -1) {
                            class28.field445[var10.field1308].method698(arg3 + class57.field866 - 12, class136.field2218 + arg4 - 30);
                        }
                    }
                    class327[] var12 = class62.field912;
                    for (int var13 = 0; var13 < var12.length; var13++) {
                        class327 var14 = var12[var13];
                        if (var14 != null && var14.field5113 == 1 && class76.field1192[var7 - class45.field703] == var14.field5117 && class307.field4869 % 20 < 10) {
                            int var15;
                            if (var10.field1334 == -1) {
                                var15 = var8.method2066(66) + 15;
                            } else {
                                var15 = var10.field1334 + 15;
                            }
                            class225.method1650(arg6 >> 1, var8, (byte) -80, arg0, arg2 >> 1, var15, arg1);
                            if (class57.field866 > -1) {
                                class109.field1770[var14.field5120].method698(class57.field866 + arg3 - 12, class136.field2218 + arg4 + -28);
                            }
                        }
                    }
                } else {
                    int var16 = 30;
                    class92 var17 = (class92) var8;
                    if (var17.field1479 != -1 || var17.field1483 != -1) {
                        class225.method1650(arg6 >> 1, var8, (byte) 28, arg0, arg2 >> 1, var8.method2066(126) + 15, arg1);
                        if (class57.field866 > -1) {
                            if (var17.field1479 != -1) {
                                class145.field2352[var17.field1479].method698(class57.field866 + arg3 - 12, arg4 - -class136.field2218 + -var16);
                                var16 += 25;
                            }
                            if (var17.field1483 != -1) {
                                class28.field445[var17.field1483].method698(arg3 + class57.field866 - 12, class136.field2218 + arg4 + -var16);
                                var16 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class327[] var18 = class62.field912;
                        for (int var19 = 0; var19 < var18.length; var19++) {
                            class327 var20 = var18[var19];
                            if (var20 != null && var20.field5113 == 10 && class325.field5068[var7] == var20.field5117) {
                                class225.method1650(arg6 >> 1, var8, (byte) 4, arg0, arg2 >> 1, var8.method2066(91) + 15, arg1);
                                if (class57.field866 > -1) {
                                    class109.field1770[var20.field5120].method698(class57.field866 + arg3 - 12, class136.field2218 + arg4 + -var16);
                                }
                            }
                        }
                    }
                }
                if (var8.field4699 != null && (class45.field703 <= var7 || field623 == 0 || field623 == 3 || field623 == 1 && class168.method1255(((class92) var8).field1486, 127))) {
                    class225.method1650(arg6 >> 1, var8, (byte) 105, arg0, arg2 >> 1, var8.method2066(arg5 + 70), arg1);
                    if (class57.field866 > -1 && class151.field2482 > class166.field2681) {
                        class151.field2481[class166.field2681] = class146.field2392.method1468(var8.field4699) / 2;
                        class151.field2484[class166.field2681] = class146.field2392.field3187;
                        class151.field2490[class166.field2681] = class57.field866;
                        class151.field2489[class166.field2681] = class136.field2218;
                        class151.field2483[class166.field2681] = var8.field4637;
                        class151.field2493[class166.field2681] = var8.field4685;
                        class151.field2488[class166.field2681] = var8.field4669;
                        class151.field2486[class166.field2681] = var8.field4699;
                        class166.field2681++;
                    }
                }
                if (var8.field4703 > class307.field4869) {
                    class88 var21 = class64.field934[0];
                    class88 var22 = class64.field934[1];
                    int var23;
                    if ((var8 instanceof class86)) {
                        class86 var24 = (class86) var8;
                        class88[] var25 = (class88[]) ((class88[]) class209.field3303.method2288((long) var24.field1381.field1320, (byte) 99));
                        if (var25 == null) {
                            var25 = class281.method1979(10, var24.field1381.field1320, class176.field2815, 0);
                            if (var25 != null) {
                                class209.field3303.method2281(0, (long) var24.field1381.field1320, var25);
                            }
                        }
                        if (var25 != null && var25.length == 2) {
                            var22 = var25[1];
                            var21 = var25[0];
                        }
                        class84 var26 = var24.field1381;
                        if (var26.field1334 == -1) {
                            var23 = var8.method2066(124);
                        } else {
                            var23 = var26.field1334;
                        }
                    } else {
                        var23 = var8.method2066(arg5 ^ 0xFFFFFFB7);
                    }
                    class225.method1650(arg6 >> 1, var8, (byte) 50, arg0, arg2 >> 1, var21.field1413 + var23 + 10, arg1);
                    if (class57.field866 > -1) {
                        int var27 = class57.field866 + arg3 - (var21.field1412 >> 1);
                        int var28 = arg4 + class136.field2218 - 3;
                        var21.method698(var27, var28);
                        int var29 = var8.field4615 * var21.field1412 / 255;
                        int var30 = var21.field1413;
                        if (class162.field2623) {
                            class114.method894(var27, var28, var27 + var29, var28 - -var30);
                        } else {
                            class33.method297(var27, var28, var27 + var29, var28 - -var30);
                        }
                        var22.method698(var27, var28);
                        if (class162.field2623) {
                            class114.method886(arg3, arg4, arg3 + arg6, arg2 + arg4);
                        } else {
                            class33.method304(arg3, arg4, arg3 + arg6, arg2 + arg4);
                        }
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (var8.field4621[var31] > class307.field4869) {
                        int var34;
                        if (var8 instanceof class86) {
                            class86 var32 = (class86) var8;
                            class84 var33 = var32.field1381;
                            if (var33.field1334 == -1) {
                                var34 = var8.method2066(110) / 2;
                            } else {
                                var34 = var33.field1334 / 2;
                            }
                        } else {
                            var34 = var8.method2066(89) / 2;
                        }
                        class225.method1650(arg6 >> 1, var8, (byte) -86, arg0, arg2 >> 1, var34, arg1);
                        if (class57.field866 > -1) {
                            if (var31 == 1) {
                                class136.field2218 -= 20;
                            }
                            if (var31 == 2) {
                                class57.field866 -= 15;
                                class136.field2218 -= 10;
                            }
                            if (var31 == 3) {
                                class57.field866 += 15;
                                class136.field2218 -= 10;
                            }
                            class66.field982[var8.field4698[var31]].method698(arg3 + class57.field866 - 12, arg4 + -12 + class136.field2218);
                            class156.field2560.method1492(Integer.toString(var8.field4691[var31]), class57.field866 + arg3 - 1, arg4 - -class136.field2218 - -3, 16777215, 0);
                        }
                    }
                }
            }
        }
        field628++;
        for (int var35 = 0; var35 < class166.field2681; var35++) {
            int var36 = class151.field2489[var35];
            int var37 = class151.field2481[var35];
            int var38 = class151.field2490[var35];
            int var39 = class151.field2484[var35];
            boolean var40 = true;
            while (var40) {
                var40 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if ((class151.field2489[var41] - class151.field2484[var41]) < (var36 + 2) && class151.field2489[var41] + 2 > var36 - var39 && var38 - var37 < class151.field2490[var41] - -class151.field2481[var41] && (var38 + var37) > (class151.field2490[var41] - class151.field2481[var41]) && class151.field2489[var41] - class151.field2484[var41] < var36) {
                        var36 = class151.field2489[var41] - class151.field2484[var41];
                        var40 = true;
                    }
                }
            }
            class57.field866 = class151.field2490[var35];
            class136.field2218 = class151.field2489[var35] = var36;
            String var42 = class151.field2486[var35];
            if (class34.field516 == 0) {
                int var43 = 16776960;
                if (class151.field2483[var35] < 6) {
                    var43 = class120.field1942[class151.field2483[var35]];
                }
                if (class151.field2483[var35] == 6) {
                    var43 = class208.field3284 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class151.field2483[var35] == 7) {
                    var43 = (class208.field3284 % 20) >= 10 ? 65535 : 255;
                }
                if (class151.field2483[var35] == 8) {
                    var43 = (class208.field3284 % 20) < 10 ? 45056 : 8454016;
                }
                if (class151.field2483[var35] == 9) {
                    int var44 = 150 - class151.field2488[var35];
                    if (var44 < 50) {
                        var43 = var44 * 1280 + 16711680;
                    } else if (var44 < 100) {
                        var43 = 16384000 - (var44 * 327680 - 16776960);
                    } else if (var44 < 150) {
                        var43 = (var44 - 100) * 5 + 65280;
                    }
                }
                if (class151.field2483[var35] == 10) {
                    int var45 = 150 - class151.field2488[var35];
                    if (var45 < 50) {
                        var43 = var45 * 5 + 16711680;
                    } else if (var45 < 100) {
                        var43 = 16711935 - ((var45 - 50) * 327680);
                    } else if (var45 < 150) {
                        var43 = 255 - (32768000 - (var45 * 327680)) - ((var45 + -100) * 5);
                    }
                }
                if (class151.field2483[var35] == 11) {
                    int var46 = 150 - class151.field2488[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - (var46 * 327685);
                    } else if (var46 < 100) {
                        var43 = var46 * 327685 + 65280 - 16384250;
                    } else if (var46 < 150) {
                        var43 = 32768000 + 16777215 - (var46 * 327680);
                    }
                }
                if (class151.field2493[var35] == 0) {
                    class146.field2392.method1492(var42, class57.field866 + arg3, class136.field2218 + arg4, var43, 0);
                }
                if (class151.field2493[var35] == 1) {
                    class146.field2392.method1485(var42, class57.field866 + arg3, class136.field2218 + arg4, var43, 0, class208.field3284);
                }
                if (class151.field2493[var35] == 2) {
                    class146.field2392.method1491(var42, arg3 + class57.field866, class136.field2218 + arg4, var43, 0, class208.field3284);
                }
                if (class151.field2493[var35] == 3) {
                    class146.field2392.method1482(var42, class57.field866 + arg3, class136.field2218 + arg4, var43, 0, class208.field3284, 150 - class151.field2488[var35]);
                }
                if (class151.field2493[var35] == 4) {
                    int var47 = (150 - class151.field2488[var35]) * (class146.field2392.method1468(var42) + 100) / 150;
                    if (class162.field2623) {
                        class114.method894(class57.field866 + arg3 - 50, arg4, class57.field866 + arg3 + 50, arg2 + arg4);
                    } else {
                        class33.method297(class57.field866 + arg3 - 50, arg4, class57.field866 + arg3 + 50, arg2 + arg4);
                    }
                    class146.field2392.method1480(var42, class57.field866 + arg3 + 50 - var47, class136.field2218 + arg4, var43, 0);
                    if (class162.field2623) {
                        class114.method886(arg3, arg4, arg3 + arg6, arg4 - -arg2);
                    } else {
                        class33.method304(arg3, arg4, arg3 + arg6, arg4 - -arg2);
                    }
                }
                if (class151.field2493[var35] == 5) {
                    int var48 = 150 - class151.field2488[var35];
                    if (class162.field2623) {
                        class114.method894(arg3, arg4 + class136.field2218 - class146.field2392.field3187 - 1, arg3 + arg6, class136.field2218 + arg4 + 5);
                    } else {
                        class33.method297(arg3, arg4 - (1 - class136.field2218) - class146.field2392.field3187, arg3 + arg6, class136.field2218 + arg4 + 5);
                    }
                    int var49 = 0;
                    if (var48 < 25) {
                        var49 = var48 - 25;
                    } else if (var48 > 125) {
                        var49 = var48 - 125;
                    }
                    class146.field2392.method1492(var42, class57.field866 + arg3, class136.field2218 + arg4 + var49, var43, 0);
                    if (class162.field2623) {
                        class114.method886(arg3, arg4, arg3 + arg6, arg2 + arg4);
                    } else {
                        class33.method304(arg3, arg4, arg3 + arg6, arg2 + arg4);
                    }
                }
            } else {
                class146.field2392.method1492(var42, class57.field866 + arg3, class136.field2218 + arg4, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(III[B)V", line = 822)
    public final void method377(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field624++;
        if (this.field620) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field621.read(arg3, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        if (arg0 != 10647) {
            this.finalize();
        }
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(B)V", line = 846)
    public final void method378(byte arg0) {
        field638++;
        if (!this.field620) {
            this.field621 = new class37();
            if (arg0 <= -92) {
                this.field625 = new class100();
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V", line = 867)
    public static final void method379(int arg0) {
        field622++;
        if (class82.field1281 > 0) {
            class111.method867(124);
        } else {
            class237.field3563 = class319.field5005;
            class319.field5005 = null;
            class117.method921((byte) -126, arg0);
        }
    }

    @OriginalMember(owner = "client!kc", name = "finalize", descriptor = "()V", line = 883)
    protected final void finalize() {
        this.method371(-2);
        field639++;
    }
}
