import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class143 implements Runnable {

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "Z")
    private boolean field2656 = false;

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
    private int field2670 = 0;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "Z")
    private boolean field2661 = false;

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "I")
    private int field2678 = 0;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "Lve;")
    private class226 field2665;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "Ljava/net/Socket;")
    private Socket field2666;

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "Ljava/io/InputStream;")
    private InputStream field2667;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2650;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "Lvf;")
    public static class265 field2654 = class87.method582(-46, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "[Lvf;")
    public static class265[] field2660 = new class265[8];

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public static int field2659 = 0;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "Lvf;")
    public static class265 field2672 = class87.method582(-46, "Liste des serveurs charg-Be");

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "Lvf;")
    public static class265 field2677 = class87.method582(-46, ": ");

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "J")
    public static long field2663 = 0L;

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "I")
    public static int field2680 = 0;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "Loe;")
    public static class108 field2657;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "Lmh;")
    private class114 field2664;

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "Lfl;")
    public static class192 field2671;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "[B")
    private byte[] field2655;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static final void method979(int arg0) {
        class23.field679.method1888((byte) 102);
        if (arg0 == -29941) {
            field2653++;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method980(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        int var7 = 0;
        int var8 = arg4;
        field2676++;
        int var9 = arg4 - arg3;
        class141.method975((byte) 21, arg4);
        int var10 = -arg4;
        if (var9 < 0) {
            var9 = 0;
        }
        int var11 = var9;
        int var12 = -var9;
        int var13 = -1;
        if (arg6 > -100) {
            method989((byte) 51, -1);
        }
        int var14 = -1;
        int[] var15 = class44.field973[arg5];
        int var16 = arg2 + var9;
        int var17 = arg2 - var9;
        class203.method1394(var15, arg2 - arg4, var17, -7249, arg0);
        class203.method1394(var15, var17, var16, -7249, arg1);
        class203.method1394(var15, var16, arg2 + arg4, -7249, arg0);
        while (var7 < var8) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class168.field3046[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var8--;
                var10 -= var8 << 1;
                if (var8 >= var9) {
                    int[] var18 = class44.field973[arg5 + var8];
                    int[] var19 = class44.field973[arg5 - var8];
                    int var20 = arg2 - var7;
                    int var21 = arg2 + var7;
                    class203.method1394(var18, var20, var21, -7249, arg0);
                    class203.method1394(var19, var20, var21, -7249, arg0);
                } else {
                    int[] var22 = class44.field973[arg5 + var8];
                    int[] var23 = class44.field973[arg5 - var8];
                    int var24 = class168.field3046[var8];
                    int var25 = arg2 + var7;
                    int var26 = arg2 - var7;
                    int var27 = arg2 + var24;
                    int var28 = arg2 - var24;
                    class203.method1394(var22, var26, var28, -7249, arg0);
                    class203.method1394(var22, var28, var27, -7249, arg1);
                    class203.method1394(var22, var27, var25, -7249, arg0);
                    class203.method1394(var23, var26, var28, -7249, arg0);
                    class203.method1394(var23, var28, var27, -7249, arg1);
                    class203.method1394(var23, var27, var25, -7249, arg0);
                }
            }
            int[] var29 = class44.field973[arg5 + var7];
            int[] var30 = class44.field973[arg5 - var7];
            int var31 = arg2 + var8;
            int var32 = arg2 - var8;
            if (var9 <= var7) {
                class203.method1394(var29, var32, var31, -7249, arg0);
                class203.method1394(var30, var32, var31, -7249, arg0);
            } else {
                int var33 = var11 < var7 ? class168.field3046[var7] : var11;
                int var34 = arg2 + var33;
                int var35 = arg2 - var33;
                class203.method1394(var29, var32, var35, -7249, arg0);
                class203.method1394(var29, var35, var34, -7249, arg1);
                class203.method1394(var29, var34, var31, -7249, arg0);
                class203.method1394(var30, var32, var35, -7249, arg0);
                class203.method1394(var30, var35, var34, -7249, arg1);
                class203.method1394(var30, var34, var31, -7249, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method990(4);
        field2649++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZI)V")
    public static final void method981(boolean arg0, int arg1) {
        field2674++;
        byte var2 = 4;
        byte[][] var3 = class218.field3930;
        if (arg1 != -2401) {
            method979(-4);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class44.method369(true);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class197.field3516[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg0 || var8 == 0) {
                            int var9 = (var7 & 0xFFE5C1) >> 14;
                            int var10 = var7 >> 1 & 0x3;
                            int var11 = (var7 & 0x3FFF) >> 3;
                            int var12 = (var9 / 8 << 8) + (var11 / 8);
                            for (int var13 = 0; var13 < class111.field1953.length; var13++) {
                                if (class111.field1953[var13] == var12 && var3[var13] != null) {
                                    class279.method1906(var5 * 8, var4, var10, arg0, class130.field2279, var6 * 8, var8, arg1 ^ 0xFFFFF6E6, (var9 & 0x7) * 8, (var11 & 0x7) * 8, var3[var13]);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZ[BI)V")
    public final void method982(int arg0, boolean arg1, byte[] arg2, int arg3) throws IOException {
        field2673++;
        if (this.field2656) {
            return;
        }
        if (this.field2661) {
            this.field2661 = false;
            throw new IOException();
        }
        if (this.field2655 == null) {
            this.field2655 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field2655[this.field2678] = arg2[arg0 + var6];
                this.field2678 = (this.field2678 + 1) % 5000;
                if ((this.field2670 + 4900) % 5000 == this.field2678) {
                    throw new IOException();
                }
            }
            if (this.field2664 == null) {
                this.field2664 = this.field2665.method1531(3, -122, this);
            }
            this.notifyAll();
            if (!arg1) {
                this.field2667 = null;
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
    public final void method983(int arg0) throws IOException {
        field2668++;
        if (this.field2656) {
            return;
        }
        if (this.field2661) {
            this.field2661 = false;
            throw new IOException();
        } else if (arg0 != 8) {
            this.field2664 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V")
    public static void method984(int arg0) {
        field2657 = null;
        field2677 = null;
        field2672 = null;
        field2671 = null;
        if (arg0 != -1) {
            field2654 = null;
        }
        field2654 = null;
        field2660 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)I")
    public final int method985(byte arg0) throws IOException {
        field2648++;
        if (this.field2656) {
            return 0;
        } else if (arg0 == 70) {
            return this.field2667.read();
        } else {
            return 28;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II[BI)V")
    public final void method986(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg3 != 13418) {
            return;
        }
        field2679++;
        if (this.field2656) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field2667.read(arg2, arg1, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg0 -= var5;
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)I")
    public final int method987(byte arg0) throws IOException {
        field2652++;
        if (this.field2656) {
            return 0;
        } else {
            if (arg0 != 53) {
                method980(-76, -77, -50, -74, 24, -35, (byte) -27);
            }
            return this.field2667.available();
        }
    }

    @OriginalMember(owner = "client!gb", name = "run", descriptor = "()V")
    public final void run() {
        field2669++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field2678 == this.field2670) {
                        if (this.field2656) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field2670 > this.field2678) {
                        var2 = 5000 - this.field2670;
                    } else {
                        var2 = this.field2678 - this.field2670;
                    }
                    var3 = this.field2670;
                }
                if (var2 > 0) {
                    try {
                        this.field2650.write(this.field2655, var3, var2);
                    } catch (IOException var9) {
                        this.field2661 = true;
                    }
                    this.field2670 = (this.field2670 + var2) % 5000;
                    try {
                        if (this.field2678 == this.field2670) {
                            this.field2650.flush();
                        }
                    } catch (IOException var8) {
                        this.field2661 = true;
                    }
                }
            }
            try {
                if (this.field2667 != null) {
                    this.field2667.close();
                }
                if (this.field2650 != null) {
                    this.field2650.close();
                }
                if (this.field2666 != null) {
                    this.field2666.close();
                }
            } catch (IOException var7) {
            }
            this.field2655 = null;
        } catch (Exception var12) {
            class4.method28(-82, var12, (String) null);
        }
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)V")
    public final void method988(int arg0) {
        field2651++;
        if (!this.field2656) {
            this.field2667 = new class87();
            if (arg0 == -4020) {
                this.field2650 = new class270();
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)I")
    public static final int method989(byte arg0, int arg1) {
        int var2 = (arg1 >>> 1 & 0x55555555) + (arg1 & 0x55555555);
        field2675++;
        int var3 = ((var2 & 0xCCCCCCCE) >>> 2) + (var2 & 0x33333333);
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        if (arg0 > -107) {
            field2677 = null;
        }
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "(I)V")
    public final void method990(int arg0) {
        if (arg0 != 4) {
            this.field2661 = false;
        }
        field2662++;
        if (this.field2656) {
            return;
        }
        synchronized (this) {
            this.field2656 = true;
            this.notifyAll();
        }
        if (this.field2664 != null) {
            while (this.field2664.field1996 == 0) {
                class19.method136(1, 1L);
            }
            if (this.field2664.field1996 == 1) {
                try {
                    ((Thread) this.field2664.field1997).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field2664 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIZIII[Ljg;I[B)V")
    public static final void method991(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, class257[] arg8, int arg9, byte[] arg10) {
        byte var11;
        if (arg4) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        if (!arg4) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    if ((arg3 + var12) > 0 && arg3 + var12 < 103 && arg1 + var13 > 0 && (arg1 + var13) < 103) {
                        arg8[arg9].field4422[arg3 + var12][arg1 + var13] = class203.method1395(arg8[arg9].field4422[arg3 + var12][arg1 + var13], -16777217);
                    }
                }
            }
        }
        class135 var14 = new class135(arg10);
        if (arg0 != 8) {
            method979(57);
        }
        for (int var15 = 0; var15 < var11; var15++) {
            for (int var35 = 0; var35 < 64; var35++) {
                for (int var36 = 0; var36 < 64; var36++) {
                    if (arg7 == var15 && arg5 <= var35 && var35 < arg5 + 8 && arg6 <= var36 && var36 < (arg6 + 8)) {
                        class192.method1329(0, class277.method1896(var35 & 0x7, var36 & 0x7, true, arg2) + arg1, arg3 - -class38.method312(var36 & 0x7, arg2, (byte) 85, var35 & 0x7), arg9, 0, (byte) 86, arg2, var14, arg4);
                    } else {
                        class192.method1329(0, -1, -1, 0, 0, (byte) 59, 0, var14, arg4);
                    }
                }
            }
        }
        field2658++;
        boolean var16 = false;
        while (var14.field2449 < var14.field2483.length) {
            int var17 = var14.method920((byte) 121);
            if (var17 != 129) {
                var14.field2449--;
                break;
            }
            for (int var22 = 0; var22 < 4; var22++) {
                byte var23 = var14.method929((byte) -3);
                if (var23 == 0) {
                    if (var22 <= arg7) {
                        int var24 = arg3;
                        if (arg3 < 0) {
                            var24 = 0;
                        } else if (arg3 >= 104) {
                            var24 = 104;
                        }
                        int var25 = arg3 + 7;
                        if (var25 < 0) {
                            var25 = 0;
                        } else if (var25 >= 104) {
                            var25 = 104;
                        }
                        int var26 = arg1;
                        int var27 = arg1 + 7;
                        if (var27 < 0) {
                            var27 = 0;
                        } else if (var27 >= 104) {
                            var27 = 104;
                        }
                        if (arg1 < 0) {
                            var26 = 0;
                        } else if (arg1 >= 104) {
                            var26 = 104;
                        }
                        while (var25 > var24) {
                            while (var27 > var26) {
                                class48.field1023[arg9][var24][var26] = 0;
                                var26++;
                            }
                            var24++;
                        }
                    }
                } else if (var23 == 1) {
                    for (int var28 = 0; var28 < 64; var28 += 4) {
                        for (int var29 = 0; var29 < 64; var29 += 4) {
                            byte var30 = var14.method929((byte) -3);
                            if (var22 <= arg7) {
                                int var31 = var28;
                                while (var28 + 4 > var31) {
                                    int var32 = var29;
                                    while (var29 + 4 > var32) {
                                        if (arg5 <= var31 && (arg5 + 8) > var31 && var32 >= arg6 && arg6 < arg6 + 8) {
                                            int var33 = arg3 + class38.method312(var32 & 0x7, arg2, (byte) 86, var31 & 0x7);
                                            int var34 = class277.method1896(var31 & 0x7, var32 & 0x7, true, arg2) + arg1;
                                            if (var33 >= 0 && var33 < 104 && var34 >= 0 && var34 < 104) {
                                                class48.field1023[arg9][var33][var34] = var30;
                                            }
                                        }
                                        var29++;
                                    }
                                    var28++;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var16) {
            return;
        }
        int var18 = arg1 + 7;
        int var19 = arg3 + 7;
        for (int var20 = arg3; var20 < var19; var20++) {
            for (int var21 = arg1; var21 < var18; var21++) {
                class48.field1023[arg9][var20][var21] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Ljava/net/Socket;Lve;)V")
    public class143(Socket arg0, class226 arg1) throws IOException {
        this.field2665 = arg1;
        this.field2666 = arg0;
        this.field2666.setSoTimeout(30000);
        this.field2666.setTcpNoDelay(true);
        this.field2667 = this.field2666.getInputStream();
        this.field2650 = this.field2666.getOutputStream();
    }
}
