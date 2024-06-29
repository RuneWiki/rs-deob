import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class442 implements Runnable {

    @OriginalMember(owner = "client!cga", name = "g", descriptor = "Z")
    private boolean field6221 = false;

    @OriginalMember(owner = "client!cga", name = "h", descriptor = "I")
    private int field6222 = 0;

    @OriginalMember(owner = "client!cga", name = "p", descriptor = "Z")
    private boolean field6230 = false;

    @OriginalMember(owner = "client!cga", name = "c", descriptor = "I")
    private int field6217 = 0;

    @OriginalMember(owner = "client!cga", name = "u", descriptor = "Ljava/net/Socket;")
    private Socket field6235;

    @OriginalMember(owner = "client!cga", name = "f", descriptor = "Ltt;")
    private class79 field6220;

    @OriginalMember(owner = "client!cga", name = "n", descriptor = "Ljava/io/InputStream;")
    private InputStream field6228;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field6215;

    @OriginalMember(owner = "client!cga", name = "l", descriptor = "I")
    public static int field6226 = 0;

    @OriginalMember(owner = "client!cga", name = "v", descriptor = "Luc;")
    public static class27 field6236 = new class27(71, -1);

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!cga", name = "d", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!cga", name = "e", descriptor = "I")
    public static int field6219;

    @OriginalMember(owner = "client!cga", name = "i", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!cga", name = "j", descriptor = "I")
    public static int field6224;

    @OriginalMember(owner = "client!cga", name = "m", descriptor = "I")
    public static int field6227;

    @OriginalMember(owner = "client!cga", name = "o", descriptor = "I")
    public static int field6229;

    @OriginalMember(owner = "client!cga", name = "q", descriptor = "I")
    public static int field6231;

    @OriginalMember(owner = "client!cga", name = "r", descriptor = "I")
    public static int field6232;

    @OriginalMember(owner = "client!cga", name = "t", descriptor = "I")
    public static int field6234;

    @OriginalMember(owner = "client!cga", name = "w", descriptor = "I")
    public static int field6237;

    @OriginalMember(owner = "client!cga", name = "x", descriptor = "I")
    public static int field6238;

    @OriginalMember(owner = "client!cga", name = "y", descriptor = "I")
    public static int field6239;

    @OriginalMember(owner = "client!cga", name = "s", descriptor = "Lfaa;")
    public static class140 field6233;

    @OriginalMember(owner = "client!cga", name = "k", descriptor = "Loaa;")
    private class260 field6225;

    @OriginalMember(owner = "client!cga", name = "z", descriptor = "[B")
    private byte[] field6240;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(B)I")
    public final int method2526(byte arg0) throws IOException {
        field6219++;
        if (this.field6230) {
            return 0;
        } else {
            if (arg0 != -62) {
                this.run();
            }
            return this.field6228.available();
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(IIBI)V")
    public static final void method2527(int arg0, int arg1, byte arg2, int arg3) {
        field6223++;
        int var4 = arg1 + class511.field6989;
        int var5 = class124.field1726 + arg0;
        if (class658.field9266 == null || arg1 < 0 || arg0 < 0 || arg1 >= class86.field1185 || arg0 >= class526.field7212) {
            return;
        }
        long var6 = (long) (arg3 << 28 | var5 << 14 | var4);
        class435 var8 = (class435) class179.field2656.method2061(arg2 ^ 0x4398, var6);
        if (var8 == null) {
            class677.method3741(arg3, arg1, arg0);
            return;
        }
        class13 var9 = (class13) var8.field6146.method1270((byte) -25);
        if (var9 == null) {
            class677.method3741(arg3, arg1, arg0);
            return;
        }
        class689 var10 = (class689) class677.method3741(arg3, arg1, arg0);
        if (arg2 != -1) {
            return;
        }
        if (var10 == null) {
            var10 = new class689();
        } else {
            var10.field9694 = var10.field9689 = -1;
        }
        var10.field9680 = var9.field217;
        var10.field9687 = var9.field216;
        label51: while (true) {
            class13 var11 = (class13) var8.field6146.method1282(0);
            if (var11 == null) {
                break;
            }
            if (var10.field9687 != var11.field216) {
                var10.field9685 = var11.field217;
                var10.field9694 = var11.field216;
                while (true) {
                    class13 var12 = (class13) var8.field6146.method1282(~arg2);
                    if (var12 == null) {
                        break label51;
                    }
                    if (var10.field9687 != var12.field216 && var10.field9694 != var12.field216) {
                        var10.field9689 = var12.field216;
                        var10.field9682 = var12.field217;
                    }
                }
            }
        }
        int var13 = class203.method1355((arg0 << 9) + 256, (arg1 << 9) + 256, 4, arg3);
        class490.method2747(arg3, arg1, arg0, var13, var10);
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(I[BII)V")
    public final void method2528(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg3 != -9098) {
            return;
        }
        field6232++;
        if (this.field6230) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field6228.read(arg1, arg0, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 -= var5;
            arg0 += var5;
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)V")
    public final void method2529(int arg0) {
        field6237++;
        if (this.field6230) {
            return;
        }
        synchronized (this) {
            if (arg0 != -22272) {
                return;
            }
            this.field6230 = true;
            this.notifyAll();
        }
        if (this.field6225 != null) {
            while (this.field6225.field3702 == 0) {
                class419.method2390(46, 1L);
            }
            if (this.field6225.field3702 == 1) {
                try {
                    ((Thread) this.field6225.field3706).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field6225 = null;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(Z)V")
    public final void method2530(boolean arg0) throws IOException {
        field6227++;
        if (this.field6230) {
            return;
        }
        if (!arg0) {
            method2527(20, 93, (byte) -72, 79);
        }
        if (this.field6221) {
            this.field6221 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(III[B)V")
    public final void method2531(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field6229++;
        if (this.field6230) {
            return;
        }
        if (this.field6221) {
            this.field6221 = false;
            throw new IOException();
        }
        if (this.field6240 == null) {
            this.field6240 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = arg2; var6 < arg0; var6++) {
                this.field6240[this.field6222] = arg3[arg1 + var6];
                this.field6222 = (this.field6222 + 1) % 5000;
                if ((this.field6217 + 4900) % 5000 == this.field6222) {
                    throw new IOException();
                }
            }
            if (this.field6225 == null) {
                this.field6225 = this.field6220.method625(3, this, (byte) -94);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "(B)V")
    public static void method2532(byte arg0) {
        field6236 = null;
        field6233 = null;
        if (arg0 != -108) {
            field6236 = null;
        }
    }

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "(Z)V")
    public final void method2533(boolean arg0) {
        if (arg0) {
            this.method2533(false);
        }
        field6231++;
        if (!this.field6230) {
            this.field6228 = new class130();
            this.field6215 = new class275();
        }
    }

    @OriginalMember(owner = "client!cga", name = "run", descriptor = "()V")
    public final void run() {
        field6216++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field6222 == this.field6217) {
                        if (this.field6230) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field6217;
                    if (this.field6222 < this.field6217) {
                        var3 = 5000 - this.field6217;
                    } else {
                        var3 = this.field6222 - this.field6217;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field6215.write(this.field6240, var2, var3);
                    } catch (IOException var9) {
                        this.field6221 = true;
                    }
                    this.field6217 = (this.field6217 + var3) % 5000;
                    try {
                        if (this.field6222 == this.field6217) {
                            this.field6215.flush();
                        }
                    } catch (IOException var8) {
                        this.field6221 = true;
                    }
                }
            }
            try {
                if (this.field6228 != null) {
                    this.field6228.close();
                }
                if (this.field6215 != null) {
                    this.field6215.close();
                }
                if (this.field6235 != null) {
                    this.field6235.close();
                }
            } catch (IOException var7) {
            }
            this.field6240 = null;
        } catch (Exception var12) {
            class139.method985((byte) -101, null, var12);
        }
    }

    @OriginalMember(owner = "client!cga", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method2529(-22272);
        field6224++;
    }

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "(I)I")
    public final int method2534(int arg0) throws IOException {
        if (arg0 < 25) {
            this.field6220 = null;
        }
        field6218++;
        return this.field6230 ? 0 : this.field6228.read();
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(ILfaa;)V")
    public static final void method2535(int arg0, class140 arg1) {
        if (arg0 != 27843) {
            field6233 = null;
        }
        field6239++;
        if (class23.field319 != arg1.field1998) {
            return;
        }
        if (class253.field3576.field3975 == null) {
            arg1.field2104 = 0;
            arg1.field2021 = 0;
            return;
        }
        arg1.field2113 = 150;
        arg1.field2025 = (int) (Math.sin((double) class239.field3440 / 40.0D) * 256.0D) & 0x7FF;
        arg1.field2021 = class27.field343;
        arg1.field2103 = 5;
        arg1.field2104 = class387.method2231(arg0 ^ 0x6CBC, class253.field3576.field3975);
        arg1.field1992 = class253.field3576.field6464;
        arg1.field2001 = class253.field3576.field6402;
        arg1.field1955 = class253.field3576.field6426;
        arg1.field2110 = 0;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(IB)[[[B")
    public static final byte[][][] method2536(int arg0, byte arg1) {
        field6234++;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg0;
        int var4 = arg0;
        byte[] var5 = new byte[arg0 * arg0];
        int var6 = 0;
        for (int var7 = 0; var7 < var4; var7++) {
            for (int var132 = 0; var132 < var3; var132++) {
                if (var7 >= var132) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        var2[0][0] = var5;
        int var8 = 0;
        byte[] var9 = new byte[var3 * var4];
        for (int var10 = var4 - 1; var10 >= 0; var10--) {
            for (int var131 = 0; var131 < var4; var131++) {
                if (var10 >= var131) {
                    var9[var8] = -1;
                }
                var8++;
            }
        }
        var2[0][1] = var9;
        int var11 = 0;
        byte[] var12 = new byte[var3 * var4];
        for (int var13 = 0; var13 < var4; var13++) {
            for (int var130 = 0; var130 < var3; var130++) {
                if (var13 <= var130) {
                    var12[var11] = -1;
                }
                var11++;
            }
        }
        var2[0][2] = var12;
        byte[] var14 = new byte[var3 * var4];
        int var15 = 0;
        for (int var16 = var4 - 1; var16 >= 0; var16--) {
            for (int var129 = 0; var129 < var3; var129++) {
                if (var16 <= var129) {
                    var14[var15] = -1;
                }
                var15++;
            }
        }
        var2[0][3] = var14;
        int var17 = 0;
        byte[] var18 = new byte[var3 * var4];
        for (int var19 = var4 - 1; var19 >= 0; var19--) {
            for (int var128 = 0; var128 < var3; var128++) {
                if (var128 <= var19 >> 1) {
                    var18[var17] = -1;
                }
                var17++;
            }
        }
        var2[1][0] = var18;
        int var20 = 0;
        byte[] var21 = new byte[var3 * var4];
        for (int var22 = 0; var22 < var4; var22++) {
            for (int var127 = 0; var127 < var3; var127++) {
                if (var20 >= 0 && var20 < var21.length) {
                    if (var127 >= (var22 << 1)) {
                        var21[var20] = -1;
                    }
                    var20++;
                } else {
                    var20++;
                }
            }
        }
        var2[1][1] = var21;
        int var23 = 0;
        byte[] var24 = new byte[var3 * var4];
        for (int var25 = 0; var25 < var4; var25++) {
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if ((var25 >> 1) >= var126) {
                    var24[var23] = -1;
                }
                var23++;
            }
        }
        var2[1][2] = var24;
        int var26 = 0;
        byte[] var27 = new byte[var3 * var4];
        for (int var28 = var4 - 1; var28 >= 0; var28--) {
            for (int var125 = var3 - 1; var125 >= 0; var125--) {
                if (var28 << 1 <= var125) {
                    var27[var26] = -1;
                }
                var26++;
            }
        }
        var2[1][3] = var27;
        byte[] var29 = new byte[var3 * var4];
        int var30 = 0;
        for (int var31 = var4 - 1; var31 >= 0; var31--) {
            for (int var124 = var3 - 1; var124 >= 0; var124--) {
                if (var31 >> 1 >= var124) {
                    var29[var30] = -1;
                }
                var30++;
            }
        }
        var2[2][0] = var29;
        int var32 = 0;
        byte[] var33 = new byte[var3 * var4];
        for (int var34 = var4 - 1; var34 >= 0; var34--) {
            for (int var123 = 0; var123 < var3; var123++) {
                if (var34 << 1 <= var123) {
                    var33[var32] = -1;
                }
                var32++;
            }
        }
        var2[2][1] = var33;
        byte[] var35 = new byte[var3 * var4];
        int var36 = 0;
        for (int var37 = 0; var37 < var4; var37++) {
            for (int var122 = 0; var122 < var3; var122++) {
                if (var37 >> 1 >= var122) {
                    var35[var36] = -1;
                }
                var36++;
            }
        }
        var2[2][2] = var35;
        int var38 = 0;
        byte[] var39 = new byte[var3 * var4];
        for (int var40 = 0; var40 < var4; var40++) {
            for (int var121 = var3 - 1; var121 >= 0; var121--) {
                if (var121 >= var40 << 1) {
                    var39[var38] = -1;
                }
                var38++;
            }
        }
        var2[2][3] = var39;
        byte[] var41 = new byte[var3 * var4];
        int var42 = 0;
        for (int var43 = var4 - 1; var43 >= 0; var43--) {
            for (int var120 = 0; var120 < var3; var120++) {
                if (var120 >= var43 >> 1) {
                    var41[var42] = -1;
                }
                var42++;
            }
        }
        var2[3][0] = var41;
        int var44 = 0;
        byte[] var45 = new byte[var3 * var4];
        for (int var46 = 0; var46 < var4; var46++) {
            for (int var119 = 0; var119 < var3; var119++) {
                if (var46 << 1 >= var119) {
                    var45[var44] = -1;
                }
                var44++;
            }
        }
        var2[3][1] = var45;
        int var47 = 0;
        byte[] var48 = new byte[var3 * var4];
        for (int var49 = 0; var49 < var4; var49++) {
            for (int var118 = var3 - 1; var118 >= 0; var118--) {
                if (var49 >> 1 <= var118) {
                    var48[var47] = -1;
                }
                var47++;
            }
        }
        var2[3][2] = var48;
        byte[] var50 = new byte[var3 * var4];
        int var51 = 0;
        for (int var52 = var4 - 1; var52 >= 0; var52--) {
            for (int var117 = var3 - 1; var117 >= 0; var117--) {
                if (var117 <= (var52 << 1)) {
                    var50[var51] = -1;
                }
                var51++;
            }
        }
        var2[3][3] = var50;
        int var53 = 0;
        byte[] var54 = new byte[var3 * var4];
        for (int var55 = var4 - 1; var55 >= 0; var55--) {
            for (int var116 = var3 - 1; var116 >= 0; var116--) {
                if (var116 >= var55 >> 1) {
                    var54[var53] = -1;
                }
                var53++;
            }
        }
        var2[4][0] = var54;
        byte[] var56 = new byte[var3 * var4];
        int var57 = 0;
        for (int var58 = var4 - 1; var58 >= 0; var58--) {
            for (int var115 = 0; var115 < var3; var115++) {
                if (var115 <= (var58 << 1)) {
                    var56[var57] = -1;
                }
                var57++;
            }
        }
        var2[4][1] = var56;
        int var59 = 0;
        byte[] var60 = new byte[var3 * var4];
        for (int var61 = 0; var61 < var4; var61++) {
            for (int var114 = 0; var114 < var3; var114++) {
                if ((var61 >> 1) <= var114) {
                    var60[var59] = -1;
                }
                var59++;
            }
        }
        var2[4][2] = var60;
        int var62 = 0;
        byte[] var63 = new byte[var3 * var4];
        for (int var64 = 0; var64 < var4; var64++) {
            for (int var113 = var3 - 1; var113 >= 0; var113--) {
                if (var113 <= (var64 << 1)) {
                    var63[var62] = -1;
                }
                var62++;
            }
        }
        var2[4][3] = var63;
        byte[] var65 = new byte[var3 * var4];
        int var66 = 0;
        for (int var67 = 0; var67 < var4; var67++) {
            for (int var112 = 0; var112 < var3; var112++) {
                if (var112 <= (var3 / 2)) {
                    var65[var66] = -1;
                }
                var66++;
            }
        }
        var2[5][0] = var65;
        byte[] var68 = new byte[var3 * var4];
        int var69 = 0;
        for (int var70 = 0; var70 < var4; var70++) {
            for (int var111 = 0; var111 < var3; var111++) {
                if (var4 / 2 >= var70) {
                    var68[var69] = -1;
                }
                var69++;
            }
        }
        var2[5][1] = var68;
        byte[] var71 = new byte[var3 * var4];
        int var72 = 0;
        for (int var73 = 0; var73 < var4; var73++) {
            for (int var110 = 0; var110 < var3; var110++) {
                if (var110 >= var3 / 2) {
                    var71[var72] = -1;
                }
                var72++;
            }
        }
        var2[5][2] = var71;
        int var74 = 0;
        byte[] var75 = new byte[var3 * var4];
        for (int var76 = 0; var76 < var4; var76++) {
            for (int var109 = 0; var109 < var3; var109++) {
                if ((var4 / 2) <= var76) {
                    var75[var74] = -1;
                }
                var74++;
            }
        }
        var2[5][3] = var75;
        byte[] var77 = new byte[var3 * var4];
        int var78 = 0;
        for (int var79 = 0; var79 < var4; var79++) {
            for (int var108 = 0; var108 < var3; var108++) {
                if (var79 - (var4 / 2) >= var108) {
                    var77[var78] = -1;
                }
                var78++;
            }
        }
        var2[6][0] = var77;
        int var80 = 0;
        byte[] var81 = new byte[var3 * var4];
        for (int var82 = var4 - 1; var82 >= 0; var82--) {
            for (int var107 = 0; var107 < var3; var107++) {
                if (var107 <= (var82 - (var4 / 2))) {
                    var81[var80] = -1;
                }
                var80++;
            }
        }
        var2[6][1] = var81;
        byte[] var83 = new byte[var3 * var4];
        int var84 = 0;
        for (int var85 = var4 - 1; var85 >= 0; var85--) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if ((var85 - var4 / 2) >= var106) {
                    var83[var84] = -1;
                }
                var84++;
            }
        }
        var2[6][2] = var83;
        if (arg1 != -105) {
            return null;
        }
        byte[] var86 = new byte[var3 * var4];
        int var87 = 0;
        for (int var88 = 0; var88 < var4; var88++) {
            for (int var105 = var3 - 1; var105 >= 0; var105--) {
                if (var88 - (var4 / 2) >= var105) {
                    var86[var87] = -1;
                }
                var87++;
            }
        }
        var2[6][3] = var86;
        int var89 = 0;
        byte[] var90 = new byte[var3 * var4];
        for (int var91 = 0; var91 < var4; var91++) {
            for (int var104 = 0; var104 < var3; var104++) {
                if (var91 - (var4 / 2) <= var104) {
                    var90[var89] = -1;
                }
                var89++;
            }
        }
        var2[7][0] = var90;
        byte[] var92 = new byte[var3 * var4];
        int var93 = 0;
        for (int var94 = var4 - 1; var94 >= 0; var94--) {
            for (int var103 = 0; var103 < var3; var103++) {
                if (var103 >= (var94 - (var4 / 2))) {
                    var92[var93] = -1;
                }
                var93++;
            }
        }
        var2[7][1] = var92;
        int var95 = 0;
        byte[] var96 = new byte[var3 * var4];
        for (int var97 = var4 - 1; var97 >= 0; var97--) {
            for (int var102 = var3 - 1; var102 >= 0; var102--) {
                if (var102 >= var97 - (var4 / 2)) {
                    var96[var95] = -1;
                }
                var95++;
            }
        }
        var2[7][2] = var96;
        byte[] var98 = new byte[var3 * var4];
        int var99 = 0;
        for (int var100 = 0; var100 < var4; var100++) {
            for (int var101 = var3 - 1; var101 >= 0; var101--) {
                if ((var100 - (var4 / 2)) <= var101) {
                    var98[var99] = -1;
                }
                var99++;
            }
        }
        var2[7][3] = var98;
        return var2;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(ILuea;)I")
    public static final int method2537(int arg0, class286 arg1) {
        field6238++;
        int var2 = arg1.field3970;
        class308 var3 = arg1.method2636((byte) 113);
        if (arg1.field6428) {
            var2 = arg1.field3949;
        } else if (arg1.field6464 == var3.field4602 || arg1.field6464 == var3.field4586 || arg1.field6464 == var3.field4575 || arg1.field6464 == var3.field4565) {
            var2 = arg1.field3966;
        } else if (arg1.field6464 == var3.field4583 || arg1.field6464 == var3.field4564 || arg1.field6464 == var3.field4594 || arg1.field6464 == var3.field4578) {
            var2 = arg1.field3954;
        }
        return arg0 == 0 ? var2 : 78;
    }

    @OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(Ljava/net/Socket;Ltt;)V")
    public class442(Socket arg0, class79 arg1) throws IOException {
        this.field6235 = arg0;
        this.field6220 = arg1;
        this.field6235.setSoTimeout(30000);
        this.field6235.setTcpNoDelay(true);
        this.field6228 = this.field6235.getInputStream();
        this.field6215 = this.field6235.getOutputStream();
    }
}
