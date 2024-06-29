import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class246 implements Runnable {

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
    private int field3419 = 0;

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "Z")
    private boolean field3422 = false;

    @OriginalMember(owner = "client!eo", name = "v", descriptor = "I")
    private int field3438 = 0;

    @OriginalMember(owner = "client!eo", name = "o", descriptor = "Z")
    private boolean field3431 = false;

    @OriginalMember(owner = "client!eo", name = "B", descriptor = "Ldj;")
    private class288 field3444;

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "Ljava/net/Socket;")
    private Socket field3429;

    @OriginalMember(owner = "client!eo", name = "u", descriptor = "Ljava/io/InputStream;")
    private InputStream field3437;

    @OriginalMember(owner = "client!eo", name = "z", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3442;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "[I")
    public static int[] field3417 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!eo", name = "x", descriptor = "J")
    public static long field3440 = 0L;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "Lcba;")
    public static class471 field3420 = new class471(32, 7);

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!eo", name = "p", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!eo", name = "q", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!eo", name = "r", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!eo", name = "s", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!eo", name = "t", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!eo", name = "y", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "Lci;")
    private class382 field3425;

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "Lji;")
    public static class525 field3427;

    @OriginalMember(owner = "client!eo", name = "w", descriptor = "Z")
    public static boolean field3439;

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "[B")
    private byte[] field3423;

    @OriginalMember(owner = "client!eo", name = "A", descriptor = "[Llp;")
    public static class329[] field3443;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "[[S")
    public static short[][] field3418;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILjava/lang/String;Z)I")
    public static final int method1519(int arg0, String arg1, boolean arg2) {
        if (arg2) {
            field3436++;
            return class245.method1518(arg1, arg0, true, -4977);
        } else {
            return -55;
        }
    }

    @OriginalMember(owner = "client!eo", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method1528(-2);
        field3434++;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lbea;IILnj;I)V")
    public static final void method1520(class188 arg0, int arg1, int arg2, class204 arg3, int arg4) {
        field3424++;
        byte var5 = -1;
        if ((arg4 & 0x100) != 0) {
            var5 = arg3.method116((byte) -126);
        }
        if (~(arg4 & 0x2000) != arg2) {
            arg0.field547 = arg3.method62((byte) -48);
            arg0.field565 = arg3.method103((byte) -109);
            arg0.field586 = arg3.method67(65280);
            arg0.field563 = arg3.method116((byte) -32);
            arg0.field538 = arg3.method98(25356) + class405.field5763;
            arg0.field546 = arg3.method92(1) + class405.field5763;
            arg0.field577 = arg3.method71((byte) -76);
            arg0.field621 = 0;
            if (arg0.field2654) {
                arg0.field586 += arg0.field2667;
                arg0.field563 += arg0.field2642;
                arg0.field565 += arg0.field2642;
                arg0.field547 += arg0.field2667;
                arg0.field617 = 0;
            } else {
                arg0.field617 = 1;
                arg0.field586 += arg0.field616[0];
                arg0.field547 += arg0.field616[0];
                arg0.field563 += arg0.field618[0];
                arg0.field565 += arg0.field618[0];
            }
        }
        if ((arg4 & 0x40000) != 0) {
            int var6 = arg3.method78(arg2 - 8388607);
            int[] var7 = new int[var6];
            int[] var8 = new int[var6];
            int[] var9 = new int[var6];
            for (int var10 = 0; var10 < var6; var10++) {
                int var11 = arg3.method93((byte) 99);
                if (var11 == 65535) {
                    var11 = -1;
                }
                var7[var10] = var11;
                var8[var10] = arg3.method96(false);
                var9[var10] = arg3.method92(1);
            }
            class611.method3579(arg0, var8, 0, var7, var9);
        }
        if ((arg4 & 0x4) != 0) {
            int var12 = arg3.method93((byte) 88);
            if (var12 == 65535) {
                var12 = -1;
            }
            arg0.field532 = var12;
        }
        if ((arg4 & 0x20000) != 0) {
            arg0.field604 = arg3.method103((byte) -87);
            arg0.field599 = arg3.method62((byte) -119);
            arg0.field580 = arg3.method116((byte) -124);
            arg0.field572 = (byte) arg3.method78(-8388608);
            arg0.field536 = class405.field5763 + arg3.method93((byte) 96);
            arg0.field609 = class405.field5763 + arg3.method98(25356);
        }
        if ((arg4 & 0x200) != 0) {
            int var13 = arg3.method98(25356);
            arg0.field530 = arg3.method71((byte) -123);
            arg0.field525 = arg3.method110((byte) 116);
            arg0.field593 = (var13 & 0x8000) != 0;
            arg0.field526 = var13 & 0x7FFF;
            arg0.field534 = arg0.field526 + arg0.field530 + class405.field5763;
        }
        if ((arg4 & 0x40) != 0) {
            arg0.field2652 = arg3.method98(25356);
            if (arg0.field617 == 0) {
                arg0.method348((byte) 28, arg0.field2652);
                arg0.field2652 = -1;
            }
        }
        if ((arg4 & 0x8) != 0) {
            class463.field6544[arg1] = arg3.method116((byte) 95);
        }
        if ((arg4 & 0x20) != 0) {
            int var14 = arg3.method112(arg2 ^ 0x2285);
            int var15 = arg3.method96(false);
            arg0.method350(class405.field5763, -1, var14, var15);
            arg0.field541 = class405.field5763 + 300;
            arg0.field568 = arg3.method110((byte) 97);
        }
        if ((arg4 & 0x4000) != 0) {
            arg0.field2661 = arg3.method78(-8388608) == 1;
        }
        if ((arg4 & 0x400) != 0) {
            int var16 = class405.field5763;
            int var17 = arg3.method112(-8838);
            int var18 = arg3.method96(false);
            arg0.method350(var16, arg2, var17, var18);
        }
        if ((arg4 & 0x1) != 0) {
            int var19 = arg3.method78(-8388608);
            byte[] var20 = new byte[var19];
            class11 var21 = new class11(var20);
            arg3.method122(arg2 - 127, var20, 0, var19);
            class492.field6896[arg1] = var21;
            arg0.method1176(var21, (byte) -83);
        }
        if ((arg4 & 0x800) != 0) {
            int var22 = arg3.method93((byte) 114);
            int var23 = arg3.method80(true);
            if (var22 == 65535) {
                var22 = -1;
            }
            int var24 = arg3.method71((byte) -64);
            arg0.method335(false, var24, var22, var23, -30412);
        }
        if ((arg4 & 0x8000) != 0) {
            arg0.field608 = arg3.method100((byte) 67);
            if (arg0.field608.charAt(0) == '~') {
                arg0.field608 = arg0.field608.substring(1);
                class56.method513(arg0.method1172(false, arg2 ^ 0x5E), (byte) -118, 2, 0, arg0.method1170(true, -11076), arg0.field608);
            } else if (class645.field9372 == arg0) {
                class56.method513(arg0.method1172(false, -112), (byte) 118, 2, 0, arg0.method1170(true, -11076), arg0.field608);
            }
            arg0.field561 = 0;
            arg0.field581 = 0;
            arg0.field574 = 150;
        }
        if ((arg4 & 0x2) != 0) {
            int var25 = arg3.method98(25356);
            int var26 = arg3.method78(-8388608);
            int var27 = arg3.method96(false);
            int var28 = arg3.field165;
            boolean var29 = (var25 & 0x8000) != 0;
            if (arg0.field2630 != null && arg0.field2651 != null) {
                boolean var30 = false;
                if (var26 <= 1) {
                    if (!var29 && !(!class480.field6767 || class600.field8654) || class154.field2314) {
                        var30 = true;
                    } else if (class541.method3103(arg0.field2630, (byte) 103)) {
                        var30 = true;
                    }
                }
                if (!var30 && class353.field4780 == 0) {
                    class336.field4482.field165 = 0;
                    arg3.method75(0, var27, (byte) 110, class336.field4482.field138);
                    class336.field4482.field165 = 0;
                    int var31 = -1;
                    String var33;
                    if (var29) {
                        var25 &= 0x7FFF;
                        class183 var32 = class20.method209(-423973748, class336.field4482);
                        var31 = var32.field2584;
                        var33 = var32.field2582.method2631(true, class336.field4482);
                    } else {
                        var33 = class645.method3719((byte) -71, class621.method3620(-110, class336.field4482));
                    }
                    arg0.field608 = var33.trim();
                    arg0.field574 = 150;
                    arg0.field561 = var25 & 0xFF;
                    arg0.field581 = var25 >> 8;
                    int var34;
                    if (var26 == 1 || var26 == 2) {
                        var34 = var29 ? 17 : 1;
                    } else {
                        var34 = var29 ? 17 : 2;
                    }
                    if (var26 == 2) {
                        class395.method2365(0, "<img=1>" + arg0.method1170(true, -11076), var31, var34, null, var33, arg2, "<img=1>" + arg0.method1172(false, -119));
                    } else if (var26 == 1) {
                        class395.method2365(0, "<img=0>" + arg0.method1170(true, -11076), var31, var34, null, var33, -1, "<img=0>" + arg0.method1172(false, -103));
                    } else {
                        class395.method2365(0, arg0.method1170(true, -11076), var31, var34, null, var33, arg2, arg0.method1172(false, -125));
                    }
                }
            }
            arg3.field165 = var27 + var28;
        }
        if ((arg4 & 0x10) != 0) {
            int var35 = arg3.method92(1);
            if (var35 == 65535) {
                var35 = -1;
            }
            int var36 = arg3.method71((byte) -110);
            class564.method3217(arg0, (byte) -23, var36, var35);
        }
        if ((arg4 & 0x10000) != 0) {
            int var37 = arg3.method93((byte) 75);
            int var38 = arg3.method107(255);
            if (var37 == 65535) {
                var37 = -1;
            }
            int var39 = arg3.method96(false);
            arg0.method335(true, var39, var37, var38, -30412);
        }
        if (!arg0.field2654) {
            return;
        }
        if (var5 == 127) {
            arg0.method1174(arg0.field2667, arg0.field2642, 66);
            return;
        }
        byte var40;
        if (var5 == -1) {
            var40 = class463.field6544[arg1];
        } else {
            var40 = var5;
        }
        arg0.method1171(var40, arg0.field2667, -116, arg0.field2642);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZII[B)V")
    public final void method1521(boolean arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field3421++;
        if (this.field3422) {
            return;
        }
        if (this.field3431) {
            this.field3431 = false;
            throw new IOException();
        }
        if (this.field3423 == null) {
            this.field3423 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field3423[this.field3438] = arg3[arg2 + var6];
                this.field3438 = (this.field3438 + 1) % 5000;
                if (((this.field3419 + 4900) % 5000) == this.field3438) {
                    throw new IOException();
                }
            }
            if (this.field3425 == null) {
                this.field3425 = this.field3444.method1848(-10, this, 3);
            }
            if (arg0) {
                this.field3419 = -3;
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V")
    public final void method1522(int arg0) throws IOException {
        field3441++;
        if (this.field3422) {
            return;
        }
        if (this.field3431) {
            this.field3431 = false;
            throw new IOException();
        } else if (arg0 != 0) {
            this.method1528(-75);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "([BIII)V")
    public final void method1523(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field3430++;
        if (this.field3422 || arg3 != -1) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field3437.read(arg0, arg2, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 += var5;
            arg1 -= var5;
        }
    }

    @OriginalMember(owner = "client!eo", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field3438 == this.field3419) {
                            if (this.field3422) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field3419;
                        if (this.field3438 < this.field3419) {
                            var3 = 5000 - this.field3419;
                        } else {
                            var3 = this.field3438 - this.field3419;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field3442.write(this.field3423, var2, var3);
                    } catch (IOException var9) {
                        this.field3431 = true;
                    }
                    this.field3419 = (this.field3419 + var3) % 5000;
                    try {
                        if (this.field3438 == this.field3419) {
                            this.field3442.flush();
                        }
                    } catch (IOException var8) {
                        this.field3431 = true;
                    }
                    continue;
                }
                try {
                    if (this.field3437 != null) {
                        this.field3437.close();
                    }
                    if (this.field3442 != null) {
                        this.field3442.close();
                    }
                    if (this.field3429 != null) {
                        this.field3429.close();
                    }
                } catch (IOException var7) {
                }
                this.field3423 = null;
                break;
            }
        } catch (Exception var12) {
            class235.method1474(var12, null, (byte) 115);
        }
        field3432++;
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V")
    public final void method1524(int arg0) {
        field3426++;
        int var2 = 34 / ((-arg0 - 36) / 60);
        if (!this.field3422) {
            this.field3437 = new class55();
            this.field3442 = new class505();
        }
    }

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "(I)V")
    public static void method1525(int arg0) {
        field3427 = null;
        field3420 = null;
        field3418 = null;
        field3443 = null;
        field3417 = null;
        if (arg0 != 3) {
            method1520(null, -2, 116, null, -59);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)I")
    public final int method1526(boolean arg0) throws IOException {
        field3428++;
        if (arg0) {
            return 102;
        } else if (this.field3422) {
            return 0;
        } else {
            return this.field3437.read();
        }
    }

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "(I)I")
    public final int method1527(int arg0) throws IOException {
        if (arg0 != 2) {
            method1520(null, -72, 24, null, -121);
        }
        field3435++;
        return this.field3422 ? 0 : this.field3437.available();
    }

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "(I)V")
    public final void method1528(int arg0) {
        field3433++;
        if (this.field3422) {
            return;
        }
        if (arg0 != -2) {
            this.finalize();
        }
        synchronized (this) {
            this.field3422 = true;
            this.notifyAll();
        }
        if (this.field3425 != null) {
            while (this.field3425.field5134 == 0) {
                class21.method220(0, 1L);
            }
            if (this.field3425.field5134 == 1) {
                try {
                    ((Thread) this.field3425.field5132).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field3425 = null;
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Ljava/net/Socket;Ldj;)V")
    public class246(Socket arg0, class288 arg1) throws IOException {
        this.field3444 = arg1;
        this.field3429 = arg0;
        this.field3429.setSoTimeout(30000);
        this.field3429.setTcpNoDelay(true);
        this.field3437 = this.field3429.getInputStream();
        this.field3442 = this.field3429.getOutputStream();
    }
}
