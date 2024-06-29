import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class138 implements Runnable {

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    private int field2576 = 0;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "Z")
    private boolean field2573 = false;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    private int field2589 = 0;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "Z")
    private boolean field2578 = false;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "Ljava/net/Socket;")
    private Socket field2583;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "Luc;")
    private class160 field2596;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "Ljava/io/InputStream;")
    private InputStream field2602;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2584;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "Z")
    public static boolean field2574 = false;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "Lli;")
    public static class185 field2575 = class245.method1649("ondulation2:", 124);

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "J")
    public static long field2579 = 0L;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public static int field2588 = -1;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "[I")
    public static int[] field2590 = new int[200];

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "Lkc;")
    private class29 field2592;

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "[B")
    private byte[] field2600;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "[Llk;")
    public static class237[] field2585;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)V")
    public static final void method984(int arg0, byte arg1) {
        field2597++;
        if (class127.method912(arg0, (byte) -110)) {
            if (arg1 >= -117) {
                method986(false);
            }
            class37.method233((byte) 55, class136.field2557[arg0], -1);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
    public final void method985(byte arg0) {
        field2581++;
        if (!this.field2578) {
            this.field2602 = new class107();
            if (arg0 < -126) {
                this.field2584 = new class145();
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
    public static void method986(boolean arg0) {
        field2590 = null;
        if (!arg0) {
            method992(16, -78, -33, 86, 57, 89, -22);
        }
        field2575 = null;
        field2585 = null;
    }

    @OriginalMember(owner = "client!lc", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method994((byte) -116);
        field2580++;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(Z)V")
    public final void method987(boolean arg0) throws IOException {
        field2598++;
        if (!this.field2578 && !arg0 && this.field2573) {
            this.field2573 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)I")
    public final int method988(byte arg0) throws IOException {
        if (arg0 != -57) {
            method986(true);
        }
        field2591++;
        return this.field2578 ? 0 : this.field2602.read();
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIILbb;IJIIII)Z")
    public static final boolean method989(int arg0, int arg1, int arg2, int arg3, class75 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class122.method897(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!lc", name = "run", descriptor = "()V")
    public final void run() {
        field2594++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field2589 == this.field2576) {
                        if (this.field2578) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field2576 > this.field2589) {
                        var2 = 5000 - this.field2576;
                    } else {
                        var2 = this.field2589 - this.field2576;
                    }
                    var3 = this.field2576;
                }
                if (var2 > 0) {
                    try {
                        this.field2584.write(this.field2600, var3, var2);
                    } catch (IOException var9) {
                        this.field2573 = true;
                    }
                    this.field2576 = (this.field2576 + var2) % 5000;
                    try {
                        if (this.field2589 == this.field2576) {
                            this.field2584.flush();
                        }
                    } catch (IOException var8) {
                        this.field2573 = true;
                    }
                }
            }
            try {
                if (this.field2602 != null) {
                    this.field2602.close();
                }
                if (this.field2584 != null) {
                    this.field2584.close();
                }
                if (this.field2583 != null) {
                    this.field2583.close();
                }
            } catch (IOException var7) {
            }
            this.field2600 = null;
        } catch (Exception var12) {
            class3.method33((String) null, var12, (byte) 122);
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)V")
    public static final void method990(byte arg0) {
        if (!class112.field2027) {
            class55.field936[0] = 1006;
            class158.field3004[0] = class158.field2986;
            class127.field2283 = 1;
            if (class200.field3671 != 0) {
                class48.field792 = class65.field1131;
                class52.field861 = class63.field1100;
            } else if (class260.field4623 == 0) {
                class52.field861 = class18.field288;
                class48.field792 = class32.field528;
            } else {
                class52.field861 = class161.field3041;
                class48.field792 = class6.field136;
            }
            class37.field587[0] = class119.field2170;
            class107.field1922[0] = class20.field336;
        }
        field2586++;
        if (class275.field4877 != -1) {
            method984(class275.field4877, (byte) -123);
        }
        for (int var1 = 0; var1 < class185.field3410; var1++) {
            if (class44.field700[var1]) {
                class274.field4855[var1] = true;
            }
            class226.field4127[var1] = class44.field700[var1];
            class44.field700[var1] = false;
        }
        class263.field4663 = null;
        class242.field4328 = null;
        class223.field4094 = -1;
        class191.field3541 = class211.field3851;
        class206.field3772 = -1;
        if (class275.field4877 != -1) {
            class185.field3410 = 0;
            class96.method619(0, 0, class148.field2796, -1, (byte) 121, 0, class204.field3738, 0, class275.field4877);
        }
        class159.method1141();
        class162.method1169((byte) -109);
        if (class112.field2027) {
            if (class176.field3218) {
                class144.method1030(arg0 ^ 0x3767);
            } else {
                class68.method450(31);
            }
        } else if (class242.field4328 != null) {
            class163.method1171(class131.field2354, class207.field3800, class242.field4328, 15);
        } else if (class206.field3772 != -1) {
            class163.method1171(class206.field3772, class223.field4094, (class82) null, arg0 - 10);
        }
        int var2 = class112.field2027 ? -1 : class212.method1487(true);
        if (var2 == -1) {
            var2 = class191.field3537;
        }
        class221.method1527(var2, true);
        if (arg0 != 25) {
            return;
        }
        if (class90.field1745 == 1) {
            class90.field1745 = 2;
        }
        if (class140.field2624 == 1) {
            class140.field2624 = 2;
        }
        if (class92.field1770 == 3) {
            for (int var3 = 0; var3 < class185.field3410; var3++) {
                if (class226.field4127[var3]) {
                    class159.method1145(class15.field257[var3], class211.field3847[var3], class123.field2228[var3], class52.field912[var3], 16711935, 128);
                } else if (class274.field4855[var3]) {
                    class159.method1145(class15.field257[var3], class211.field3847[var3], class123.field2228[var3], class52.field912[var3], 16711680, 128);
                }
            }
        }
        class146.method1041(class265.field4703, class241.field4310.field2694, class241.field4310.field2687, 2, class224.field4111);
        class224.field4111 = 0;
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(B)I")
    public final int method991(byte arg0) throws IOException {
        if (arg0 >= -37) {
            this.method985((byte) -14);
        }
        field2593++;
        return this.field2578 ? 0 : this.field2602.available();
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method992(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2599++;
        class10.method94(127, arg5);
        int var7 = arg5 - arg0;
        int var8 = 0;
        if (arg1 > var7) {
            var7 = 0;
        }
        int var9 = var7;
        int var10 = -1;
        if (arg4 >= class216.field3964 && class113.field2040 >= arg4) {
            int[] var11 = class145.field2757[arg4];
            int var12 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg2 - arg5);
            int var13 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg2 + arg5);
            int var14 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg2 - var7);
            int var15 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg2 + var7);
            class157.method1116(arg6, var12, var14, var11, arg1 ^ 0xFFFFFFB4);
            class157.method1116(arg3, var14, var15, var11, -109);
            class157.method1116(arg6, var15, var13, var11, -27);
        }
        int var16 = -arg5;
        int var17 = arg5;
        int var18 = -var7;
        int var19 = -1;
        while (var17 > var8) {
            var10 += 2;
            var16 += var10;
            var19 += 2;
            var18 += var19;
            if (var18 >= 0 && var9 >= 1) {
                var9--;
                var18 -= var9 << 1;
                class133.field2379[var9] = var8;
            }
            var8++;
            if (var16 >= 0) {
                var17--;
                var16 -= var17 << 1;
                int var20 = arg4 - var17;
                int var21 = arg4 + var17;
                if (var21 >= class216.field3964 && class113.field2040 >= var20) {
                    if (var7 <= var17) {
                        int var22 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg2 + var8);
                        int var23 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg2 - var8);
                        if (var21 <= class113.field2040) {
                            class157.method1116(arg6, var23, var22, class145.field2757[var21], -120);
                        }
                        if (class216.field3964 <= var20) {
                            class157.method1116(arg6, var23, var22, class145.field2757[var20], -49);
                        }
                    } else {
                        int var24 = class133.field2379[var17];
                        int var25 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg2 + var8);
                        int var26 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg2 - var8);
                        int var27 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg2 + var24);
                        int var28 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg2 - var24);
                        if (class113.field2040 >= var21) {
                            int[] var29 = class145.field2757[var21];
                            class157.method1116(arg6, var26, var28, var29, -112);
                            class157.method1116(arg3, var28, var27, var29, arg1 ^ 0xFFFFFF86);
                            class157.method1116(arg6, var27, var25, var29, -92);
                        }
                        if (class216.field3964 <= var20) {
                            int[] var30 = class145.field2757[var20];
                            class157.method1116(arg6, var26, var28, var30, arg1 - 125);
                            class157.method1116(arg3, var28, var27, var30, -63);
                            class157.method1116(arg6, var27, var25, var30, -30);
                        }
                    }
                }
            }
            int var31 = arg4 - var8;
            int var32 = arg4 + var8;
            if (var32 >= class216.field3964 && class113.field2040 >= var31) {
                int var33 = arg2 - var17;
                int var34 = arg2 + var17;
                if (class207.field3810 <= var34 && class66.field1163 >= var33) {
                    int var35 = class42.method260(class66.field1163, class207.field3810, (byte) 98, var34);
                    int var36 = class42.method260(class66.field1163, class207.field3810, (byte) 98, var33);
                    if (var8 >= var7) {
                        if (var32 <= class113.field2040) {
                            class157.method1116(arg6, var36, var35, class145.field2757[var32], -97);
                        }
                        if (var31 >= class216.field3964) {
                            class157.method1116(arg6, var36, var35, class145.field2757[var31], arg1 ^ 0xFFFFFFD4);
                        }
                    } else {
                        int var37 = var9 >= var8 ? var9 : class133.field2379[var8];
                        int var38 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg2 + var37);
                        int var39 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg2 - var37);
                        if (var32 <= class113.field2040) {
                            int[] var40 = class145.field2757[var32];
                            class157.method1116(arg6, var36, var39, var40, arg1 ^ 0xFFFFFFA7);
                            class157.method1116(arg3, var39, var38, var40, arg1 - 78);
                            class157.method1116(arg6, var38, var35, var40, arg1 - 108);
                        }
                        if (class216.field3964 <= var31) {
                            int[] var41 = class145.field2757[var31];
                            class157.method1116(arg6, var36, var39, var41, -77);
                            class157.method1116(arg3, var39, var38, var41, arg1 - 46);
                            class157.method1116(arg6, var38, var35, var41, -98);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[BII)V")
    public final void method993(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2587++;
        if (this.field2578) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field2602.read(arg1, arg3, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 += var5;
            arg0 -= var5;
        }
        if (arg2 != 5623) {
            field2574 = false;
        }
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "(B)V")
    public final void method994(byte arg0) {
        field2595++;
        if (this.field2578) {
            return;
        }
        synchronized (this) {
            this.field2578 = true;
            this.notifyAll();
        }
        if (this.field2592 != null) {
            while (this.field2592.field487 == 0) {
                class212.method1488(1L, -81);
            }
            if (this.field2592.field487 == 1) {
                try {
                    ((Thread) this.field2592.field486).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field2592 = null;
        if (arg0 >= -22) {
            method990((byte) 118);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([BIII)V")
    public final void method995(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field2582++;
        if (this.field2578) {
            return;
        }
        if (this.field2573) {
            this.field2573 = false;
            throw new IOException();
        }
        if (this.field2600 == null) {
            this.field2600 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field2600[this.field2589] = arg0[arg1 + var6];
                this.field2589 = (this.field2589 + 1) % 5000;
                if ((this.field2576 + 4900) % 5000 == this.field2589) {
                    throw new IOException();
                }
            }
            if (this.field2592 == null) {
                this.field2592 = this.field2596.method1152(this, (byte) -47, 3);
            }
            int var7 = -69 / ((arg2 + 39) / 39);
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Ljava/net/Socket;Luc;)V")
    public class138(Socket arg0, class160 arg1) throws IOException {
        this.field2583 = arg0;
        this.field2596 = arg1;
        this.field2583.setSoTimeout(30000);
        this.field2583.setTcpNoDelay(true);
        this.field2602 = this.field2583.getInputStream();
        this.field2584 = this.field2583.getOutputStream();
    }
}
