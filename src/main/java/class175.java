import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class175 implements Runnable {

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Z")
    private boolean field2774 = false;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "Z")
    private boolean field2776 = false;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "I")
    private int field2790 = 0;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "I")
    private int field2792 = 0;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "Lcg;")
    private class48 field2787;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "Ljava/net/Socket;")
    private Socket field2785;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "Ljava/io/InputStream;")
    private InputStream field2772;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2781;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "I")
    public static int field2788 = 0;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "Z")
    public static boolean field2783 = false;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "Lwa;")
    private class243 field2778;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "[B")
    private byte[] field2786;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IBIIIIIIIII)V")
    public static final void method1208(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field2791++;
        int var11 = arg0 - arg10;
        int var12 = arg6 - arg8;
        if (class7.field88 > arg0) {
            var11++;
        }
        if (class44.field562 > arg6) {
            var12++;
        }
        int var13 = 0;
        if (arg1 != -91) {
            return;
        }
        int var10000;
        while (var13 < var12) {
            int var41 = arg4 + (arg2 * var13) >> 16;
            int var42 = (var13 + 1) * arg2 + arg4 >> 16;
            int var43 = var42 - var41;
            if (var43 > 0) {
                int var44 = arg8 + var13 >> 6;
                if (var44 >= 0 && var44 <= class41.field516.length - 1) {
                    int var45 = arg5 + var41;
                    int var46 = arg5 + var42;
                    int[][] var47 = class41.field516[var44];
                    byte[][] var48 = class210.field3349[var44];
                    byte[][] var49 = class166.field2679[var44];
                    byte[][] var50 = class4.field65[var44];
                    byte[][] var51 = class269.field4312[var44];
                    byte[][] var52 = class198.field3139[var44];
                    for (int var53 = 0; var53 < var11; var53++) {
                        int var54 = arg7 + (arg3 * var53) >> 16;
                        int var55 = (var53 + 1) * arg3 + arg7 >> 16;
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = arg9 + var54;
                            int var58 = arg9 + var55;
                            int var59 = arg10 + var53 >> 6;
                            int var60 = arg8 + var13 & 0x3F;
                            int var61 = arg10 + var53 & 0x3F;
                            int var62 = (var61 << 6) + var60;
                            int var63;
                            if (var59 < 0 || var59 > (var47.length - 1) || var47[var59] == null) {
                                if (class238.field3928.field2325 != -1) {
                                    var63 = class238.field3928.field2325;
                                } else if ((var53 + arg10 & 0x4) == (arg8 + var13 & 0x4)) {
                                    var63 = class177.field2807[field2788 + 1];
                                } else {
                                    var63 = 4936552;
                                }
                                if (var59 < 0 || var47.length - 1 < var59) {
                                    if (var63 == 0) {
                                        var63 = 1;
                                    }
                                    class217.method1526(var45, var57, var43, var56, var63);
                                    continue;
                                }
                            } else {
                                var63 = var47[var59][var62];
                            }
                            if (var63 == 0) {
                                var63 = 1;
                            }
                            int var64 = var48[var59] == null ? 0 : class177.field2807[var48[var59][var62] & 0xFF];
                            int var65 = var49[var59] == null ? 0 : class177.field2807[var49[var59][var62] & 0xFF];
                            if (var64 == 0 && var65 == 0) {
                                class217.method1526(var45, var57, var43, var56, var63);
                            } else {
                                if (var64 != 0) {
                                    if (var64 == -1) {
                                        var64 = 1;
                                    }
                                    byte var66 = var52[var59] == null ? 0 : var52[var59][var62];
                                    int var67 = var66 & 0xFC;
                                    if (var67 == 0 || var43 <= 1 || var56 <= 1) {
                                        class217.method1526(var45, var57, var43, var56, var64);
                                    } else {
                                        class166.method1150(var63, var66 & 0x3, 121, var45, var57, var43, class217.field3483, var56, var64, true, var67 >> 2);
                                    }
                                }
                                if (var65 != 0) {
                                    if (var65 == -1) {
                                        var65 = var63;
                                    }
                                    byte var68 = var50[var59][var62];
                                    int var69 = var68 & 0xFC;
                                    if (var69 == 0 || var43 <= 1 || var56 <= 1) {
                                        class217.method1526(var45, var57, var43, var56, var65);
                                    }
                                    class166.method1150(0, var68 & 0x3, 124, var45, var57, var43, class217.field3483, var56, var65, var64 == 0, var69 >> 2);
                                }
                            }
                            if (var51[var59] != null) {
                                int var70 = var51[var59][var62] & 0xFF;
                                if (var70 != 0) {
                                    int var71;
                                    if (var43 == 1) {
                                        var71 = var45;
                                    } else {
                                        var71 = var46 - 1;
                                    }
                                    int var72;
                                    if (var56 == 1) {
                                        var72 = var57;
                                    } else {
                                        var72 = var58 - 1;
                                    }
                                    int var73 = 13421772;
                                    if (var70 >= 5 && var70 <= 8 || var70 >= 13 && var70 <= 16 || var70 >= 21 && var70 <= 24 || var70 == 27 || var70 == 28) {
                                        var70 -= 4;
                                        var73 = 13369344;
                                    }
                                    if (var70 == 1) {
                                        class217.method1539(var45, var57, var56, var73);
                                    } else if (var70 == 2) {
                                        class217.method1530(var45, var57, var43, var73);
                                    } else if (var70 == 3) {
                                        class217.method1539(var71, var57, var56, var73);
                                    } else if (var70 == 4) {
                                        class217.method1530(var45, var72, var43, var73);
                                    } else if (var70 == 9) {
                                        class217.method1539(var45, var57, var56, 16777215);
                                        class217.method1530(var45, var57, var43, var73);
                                    } else if (var70 == 10) {
                                        class217.method1539(var71, var57, var56, 16777215);
                                        class217.method1530(var45, var57, var43, var73);
                                    } else if (var70 == 11) {
                                        class217.method1539(var71, var57, var56, 16777215);
                                        class217.method1530(var45, var72, var43, var73);
                                    } else if (var70 == 12) {
                                        class217.method1539(var45, var57, var56, 16777215);
                                        class217.method1530(var45, var72, var43, var73);
                                    } else if (var70 == 17) {
                                        class217.method1530(var45, var57, 1, var73);
                                    } else if (var70 == 18) {
                                        class217.method1530(var71, var57, 1, var73);
                                    } else if (var70 == 19) {
                                        class217.method1530(var71, var72, 1, var73);
                                    } else if (var70 == 20) {
                                        class217.method1530(var45, var72, 1, var73);
                                    } else if (var70 == 25) {
                                        for (int var74 = 0; var74 < var56; var74++) {
                                            class217.method1530(var45 + var74, -var74 + var72, 1, var73);
                                        }
                                    } else if (var70 == 26) {
                                        for (int var75 = 0; var75 < var56; var75++) {
                                            class217.method1530(var45 + var75, var57 - -var75, 1, var73);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var76 = arg5 + var41;
                    for (int var77 = 0; var77 < var11; var77++) {
                        int var79 = ((var77 + 1) * arg3 + arg7 >> 16) + arg9;
                        int var80 = (arg7 + (arg3 * var77) >> 16) + arg9;
                        int var81 = var79 - var80;
                        int var82;
                        if (class238.field3928.field2325 != -1) {
                            var82 = class238.field3928.field2325;
                        } else if ((var13 + arg8 & 0x4) == (arg10 + var77 & 0x4)) {
                            var82 = class177.field2807[field2788 + 1];
                        } else {
                            var82 = 4936552;
                        }
                        if (var82 == 0) {
                            var82 = 1;
                        }
                        class217.method1526(var76, var80, var43, var81, var82);
                    }
                    var10000 = arg5 + var42;
                }
            }
            var13++;
        }
        for (int var14 = -2; var14 < var12 + 2; var14++) {
            int var15 = arg4 + ((var14 + 1) * arg2) >> 16;
            int var16 = arg2 * var14 + arg4 >> 16;
            int var17 = var15 - var16;
            if (var17 > 0) {
                int var18 = arg5 + var16;
                var10000 = arg5 + var15;
                int var20 = arg8 + var14 >> 6;
                if (var20 >= 0 && var20 <= (class55.field702.length - 1)) {
                    int[][] var21 = class55.field702[var20];
                    for (int var22 = -2; var22 < var11 + 2; var22++) {
                        int var23 = (var22 + 1) * arg3 + arg7 >> 16;
                        int var24 = arg7 + (arg3 * var22) >> 16;
                        int var25 = var23 - var24;
                        if (var25 > 0) {
                            int var26 = arg9 + var24;
                            int var27 = arg10 + var22 >> 6;
                            var10000 = arg9 + var23;
                            if (var27 >= 0 && var27 <= (var21.length - 1)) {
                                int var29 = ((var22 + arg10 & 0x3F) << 6) + (arg8 + var14 & 0x3F);
                                if (var21[var27] != null) {
                                    int var30 = var21[var27][var29];
                                    int var31 = var30 & 0x1FFF;
                                    if (var31 != 0) {
                                        class253 var32 = class159.method1111(var31 - 1, 126);
                                        boolean var33 = (var30 >> 15 & 0x1) == 1;
                                        int var34 = (var30 & 0x6AB9) >> 13;
                                        class149 var35 = var32.method1739(var33, arg1 - 625313877, var34);
                                        if (var35 != null) {
                                            int var36 = var35.field2139 * var17 / 4;
                                            int var37 = var35.field2137 * var25 / 4;
                                            if (var32.field4127) {
                                                int var38 = var30 >> 16 & 0xF;
                                                int var39 = (var30 & 0xF68E46) >> 20;
                                                if ((var34 & 0x1) == 1) {
                                                    int var40 = var38;
                                                    var38 = var39;
                                                    var39 = var40;
                                                }
                                                var37 = var25 * var39;
                                                var36 = var17 * var38;
                                            }
                                            if (var36 != 0 && var37 != 0) {
                                                if (var32.field4119 == 0) {
                                                    var35.method1027(var18, var25 + var26 - var37, var36, var37);
                                                } else {
                                                    var35.method1031(var18, var25 + var26 - var37, var36, var37, var32.field4119);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II[BI)V")
    public final void method1209(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2779++;
        if (this.field2774) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field2772.read(arg2, arg3, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 -= var5;
            arg3 += var5;
        }
        if (arg0 < 14) {
            this.field2774 = true;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
    public final void method1210(int arg0) {
        field2769++;
        if (this.field2774) {
            return;
        }
        if (arg0 != -1) {
            this.run();
        }
        synchronized (this) {
            this.field2774 = true;
            this.notifyAll();
        }
        if (this.field2778 != null) {
            while (this.field2778.field3995 == 0) {
                class115.method752((byte) -62, 1L);
            }
            if (this.field2778.field3995 == 1) {
                try {
                    ((Thread) this.field2778.field3992).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field2778 = null;
    }

    @OriginalMember(owner = "client!td", name = "run", descriptor = "()V")
    public final void run() {
        field2793++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field2792 == this.field2790) {
                        if (this.field2774) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field2792 >= this.field2790) {
                        var2 = this.field2792 - this.field2790;
                    } else {
                        var2 = 5000 - this.field2790;
                    }
                    var3 = this.field2790;
                }
                if (var2 > 0) {
                    try {
                        this.field2781.write(this.field2786, var3, var2);
                    } catch (IOException var9) {
                        this.field2776 = true;
                    }
                    this.field2790 = (this.field2790 + var2) % 5000;
                    try {
                        if (this.field2792 == this.field2790) {
                            this.field2781.flush();
                        }
                    } catch (IOException var8) {
                        this.field2776 = true;
                    }
                }
            }
            try {
                if (this.field2772 != null) {
                    this.field2772.close();
                }
                if (this.field2781 != null) {
                    this.field2781.close();
                }
                if (this.field2785 != null) {
                    this.field2785.close();
                }
            } catch (IOException var7) {
            }
            this.field2786 = null;
        } catch (Exception var12) {
            class30.method168((byte) -121, var12, (String) null);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IZI[B)V")
    public final void method1211(int arg0, boolean arg1, int arg2, byte[] arg3) throws IOException {
        field2777++;
        if (this.field2774) {
            return;
        }
        if (this.field2776) {
            this.field2776 = false;
            throw new IOException();
        }
        if (this.field2786 == null) {
            this.field2786 = new byte[5000];
        }
        if (!arg1) {
            return;
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field2786[this.field2792] = arg3[arg2 + var6];
                this.field2792 = (this.field2792 + 1) % 5000;
                if ((this.field2790 + 4900) % 5000 == this.field2792) {
                    throw new IOException();
                }
            }
            if (this.field2778 == null) {
                this.field2778 = this.field2787.method271(3, this, 2);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIB)V")
    public static final void method1212(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = class218.field3493 * arg2 >> 8;
        if (arg3 <= 119) {
            field2783 = true;
        }
        field2784++;
        if (var4 != 0 && arg1 != -1) {
            class286.method1924(-10225, var4, arg1, class225.field3624, 0, false);
            class271.field4335 = true;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)V")
    public static final void method1213(byte arg0, int arg1) {
        if (arg0 != -54) {
            method1213((byte) 98, 59);
        }
        class138.field2215.method1695(arg1, arg0 + 54);
        class17.field201.method1695(arg1, 0);
        field2780++;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
    public static final void method1214(int arg0) {
        int[] var1 = new int[class144.field2288];
        int var2 = arg0;
        field2773++;
        for (int var3 = 0; var3 < class144.field2288; var3++) {
            class108 var5 = class256.method1753(-2, var3);
            if (var5.field1531 >= 0 || var5.field1493 >= 0) {
                var1[var2++] = var3;
            }
        }
        class110.field1565 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class110.field1565[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
    public final void method1215(int arg0) {
        if (arg0 != 280101936) {
            this.method1215(-1);
        }
        field2768++;
        if (!this.field2774) {
            this.field2772 = new class2();
            this.field2781 = new class163();
        }
    }

    @OriginalMember(owner = "client!td", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field2782++;
        this.method1210(-1);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)I")
    public final int method1216(byte arg0) throws IOException {
        if (arg0 != 29) {
            this.method1215(-44);
        }
        field2789++;
        return this.field2774 ? 0 : this.field2772.read();
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(I)I")
    public final int method1217(int arg0) throws IOException {
        field2771++;
        if (this.field2774) {
            return 0;
        } else {
            if (arg0 >= -108) {
                this.field2785 = null;
            }
            return this.field2772.available();
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V")
    public final void method1218(byte arg0) throws IOException {
        field2770++;
        if (this.field2774) {
            return;
        }
        if (this.field2776) {
            this.field2776 = false;
            throw new IOException();
        } else if (arg0 <= 34) {
            this.finalize();
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Ljava/net/Socket;Lcg;)V")
    public class175(Socket arg0, class48 arg1) throws IOException {
        this.field2787 = arg1;
        this.field2785 = arg0;
        this.field2785.setSoTimeout(30000);
        this.field2785.setTcpNoDelay(true);
        this.field2772 = this.field2785.getInputStream();
        this.field2781 = this.field2785.getOutputStream();
    }
}
