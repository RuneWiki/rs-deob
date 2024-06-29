import java.awt.Container;
import java.awt.Insets;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class26 implements Runnable {

    @OriginalMember(owner = "client!db", name = "m", descriptor = "Z")
    private boolean field458 = false;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    private int field453 = 0;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "I")
    private int field472 = 0;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "Z")
    private boolean field469 = false;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "Ljava/net/Socket;")
    private Socket field460;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "Lud;")
    private class2 field452;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "Ljava/io/InputStream;")
    private InputStream field464;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field462;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "[I")
    public static int[] field449 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!db", name = "f", descriptor = "Ljava/lang/String;")
    public static String field451 = "Take";

    @OriginalMember(owner = "client!db", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field470 = new String[100];

    @OriginalMember(owner = "client!db", name = "n", descriptor = "Lro;")
    public static class249 field459 = null;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "Z")
    public static boolean field465 = false;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    public static int field463 = 0;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public static int field474 = 0;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "Lwe;")
    public static class24 field475 = new class24(4);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "Lor;")
    private class296 field477;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "[B")
    private byte[] field457;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 4)
    public static final void method233(int arg0) {
        field461++;
        if (arg0 > -109) {
            return;
        }
        int[] var1 = new int[class228.field3223];
        int var2 = 0;
        for (int var3 = 0; var3 < class228.field3223; var3++) {
            class193 var5 = class166.method1031(var3, false);
            if (var5.field2739 >= 0 || var5.field2711 >= 0) {
                var1[var2++] = var3;
            }
        }
        class258.field3765 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class258.field3765[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V", line = 44)
    public static final void method234(int arg0) {
        field454++;
        class24 var1 = class23.field395;
        synchronized (class23.field395) {
            class23.field395.method204((byte) 56);
            if (arg0 != 4900) {
                method240((byte) 121);
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)I", line = 63)
    public final int method235(int arg0) throws IOException {
        field467++;
        if (this.field458) {
            return 0;
        } else {
            if (arg0 != -1707) {
                this.field460 = null;
            }
            return this.field464.read();
        }
    }

    @OriginalMember(owner = "client!db", name = "finalize", descriptor = "()V", line = 78)
    protected final void finalize() {
        this.method243(-1);
        field448++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V", line = 88)
    public static final void method236(int arg0, int arg1) {
        field471++;
        class256 var2 = class363.method2385(9, arg1, (byte) 1);
        if (arg0 > -52) {
            method244(106, -41, -111, (class238) null);
        }
        var2.method1611(-120);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIZIZI)V", line = 102)
    public static final void method237(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5) {
        field446++;
        if (arg4) {
            class446.method2803(115);
        }
        if (class106.field1428 != null && (arg3 != 3 || class401.field5968 != arg0 || class284.field4158 != arg5)) {
            class314.method1961(class361.field5285, class106.field1428, true);
            class106.field1428 = null;
        }
        if (arg3 == 3 && class106.field1428 == null) {
            class106.field1428 = class247.method1524(7439, arg0, arg5, class361.field5285, 0, 0);
            if (class106.field1428 != null) {
                class284.field4158 = arg5;
                class401.field5968 = arg0;
                class423.method2724(class361.field5285, (byte) -7);
            }
        }
        if (arg3 == 3 && class106.field1428 == null) {
            method237(-1, arg1, true, class161.field2107, true, -1);
            return;
        }
        Container var6;
        if (class106.field1428 != null) {
            class100.field1338 = arg0;
            var6 = class106.field1428;
            class384.field5739 = arg5;
        } else if (class238.field3346 == null) {
            var6 = class361.field5285.field29;
            class100.field1338 = var6.getSize().width;
            class384.field5739 = var6.getSize().height;
        } else {
            Insets var7 = class238.field3346.getInsets();
            int var10001 = var7.right + var7.left;
            class100.field1338 = class238.field3346.getSize().width - var10001;
            class384.field5739 = class238.field3346.getSize().height - var7.top - var7.bottom;
            var6 = class238.field3346;
        }
        if (arg3 == 1) {
            class345.field5120 = 765;
            class274.field4034 = 503;
            class367.field5459 = (class100.field1338 - 765) / 2;
            class7.field68 = 0;
        } else if (class160.field2099 < 96 && class265.field3854 == 0) {
            int var8 = class100.field1338 > 1024 ? 1024 : class100.field1338;
            int var9 = class384.field5739 <= 768 ? class384.field5739 : 768;
            class345.field5120 = var8;
            class367.field5459 = (class100.field1338 - var8) / 2;
            class7.field68 = 0;
            class274.field4034 = var9;
        } else {
            class367.field5459 = 0;
            class345.field5120 = class100.field1338;
            class274.field4034 = class384.field5739;
            class7.field68 = 0;
        }
        if (class59.field849 != 0) {
            boolean var10000;
            if (class345.field5120 < 1024 && class274.field4034 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg4) {
            class22.method189(class265.field3854, -61);
        } else {
            class319.field4561.setSize(class345.field5120, class274.field4034);
            if (class35.field574 != null) {
                class35.field574.method2104();
            }
            if (class238.field3346 == var6) {
                Insets var10 = class238.field3346.getInsets();
                class319.field4561.setLocation(class367.field5459 + var10.left, class7.field68 + var10.top);
            } else {
                class319.field4561.setLocation(class367.field5459, class7.field68);
            }
        }
        if (arg3 >= 2) {
            class425.field6312 = true;
        } else {
            class425.field6312 = false;
        }
        if (class404.field6020 != -1) {
            class110.method768(-123, true);
        }
        if (class159.field2079 != null && (class137.field1815 == 30 || class137.field1815 == 25)) {
            class106.method735(-116);
        }
        for (int var11 = 0; var11 < 100; var11++) {
            class85.field1178[var11] = true;
        }
        class395.field5927 = arg2;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(II)I", line = 252)
    public static final int method238(int arg0, int arg1) {
        return class274.field4030 == null ? 0 : class274.field4030[arg0][arg1] >>> 21 & 0x7F8;
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V", line = 256)
    public final void method239(int arg0) throws IOException {
        if (arg0 != -24448) {
            return;
        }
        field455++;
        if (!this.field458 && this.field469) {
            this.field469 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Ljava/net/Socket;Lud;)V", line = 588)
    public class26(Socket arg0, class2 arg1) throws IOException {
        this.field460 = arg0;
        this.field452 = arg1;
        this.field460.setSoTimeout(30000);
        this.field460.setTcpNoDelay(true);
        this.field464 = this.field460.getInputStream();
        this.field462 = this.field460.getOutputStream();
    }

    @OriginalMember(owner = "client!db", name = "run", descriptor = "()V", line = 285)
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field472 == this.field453) {
                            if (this.field458) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field453 >= this.field472) {
                            var2 = this.field453 - this.field472;
                        } else {
                            var2 = 5000 - this.field472;
                        }
                        var3 = this.field472;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field462.write(this.field457, var3, var2);
                    } catch (IOException var9) {
                        this.field469 = true;
                    }
                    this.field472 = (this.field472 + var2) % 5000;
                    try {
                        if (this.field472 == this.field453) {
                            this.field462.flush();
                        }
                    } catch (IOException var8) {
                        this.field469 = true;
                    }
                    continue;
                }
                try {
                    if (this.field464 != null) {
                        this.field464.close();
                    }
                    if (this.field462 != null) {
                        this.field462.close();
                    }
                    if (this.field460 != null) {
                        this.field460.close();
                    }
                } catch (IOException var7) {
                }
                this.field457 = null;
                break;
            }
        } catch (Exception var12) {
            class226.method1406((String) null, var12, 0);
        }
        field473++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V", line = 354)
    public static void method240(byte arg0) {
        field470 = null;
        field475 = null;
        field451 = null;
        field459 = null;
        field449 = null;
        if (arg0 != 18) {
            field465 = false;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)I", line = 368)
    public final int method241(byte arg0) throws IOException {
        if (arg0 == 17) {
            field468++;
            return this.field458 ? 0 : this.field464.available();
        } else {
            return -25;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II[BI)V", line = 391)
    public final void method242(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg0 <= 47) {
            method244(87, -97, -51, (class238) null);
        }
        field450++;
        if (this.field458) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field464.read(arg2, arg1, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg3 -= var5;
        }
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(I)V", line = 415)
    public final void method243(int arg0) {
        field466++;
        if (this.field458) {
            return;
        }
        synchronized (this) {
            if (arg0 != -1) {
                this.field477 = null;
            }
            this.field458 = true;
            this.notifyAll();
        }
        if (this.field477 != null) {
            while (this.field477.field4259 == 0) {
                class404.method2628(arg0 - 96, 1L);
            }
            if (this.field477.field4259 == 1) {
                try {
                    ((Thread) this.field477.field4262).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field477 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIILqj;)Las;", line = 456)
    public static final class177 method244(int arg0, int arg1, int arg2, class238 arg3) {
        field447++;
        class265 var4 = new class265(arg3.method1472(arg1, arg2, arg0));
        class177 var5 = new class177(arg1, var4.method1712(false), var4.method1712(false), var4.method1666(-2), var4.method1666(-2), var4.method1697(arg0 + 74) == 1, var4.method1697(arg0 ^ 0xFFFFFFE9));
        int var6 = var4.method1697(-29);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field2330.method2660((byte) -122, new class329(var4.method1697(-23), var4.method1685(arg0 + 8104), var4.method1685(8104), var4.method1685(arg0 + 8104), var4.method1685(8104), var4.method1685(8104), var4.method1685(8104), var4.method1685(arg0 ^ 0x1FA8), var4.method1685(8104)));
        }
        var5.method1081((byte) -87);
        return var5;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III[B)V", line = 482)
    public final void method245(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field456++;
        if (this.field458) {
            return;
        }
        if (this.field469) {
            this.field469 = false;
            throw new IOException();
        }
        if (this.field457 == null) {
            this.field457 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field457[this.field453] = arg3[arg2 + var6];
                this.field453 = (this.field453 + 1) % 5000;
                if (((this.field472 + 4900) % 5000) == this.field453) {
                    throw new IOException();
                }
            }
            if (this.field477 == null) {
                this.field477 = this.field452.method25((byte) 107, this, 3);
            }
            this.notifyAll();
            if (arg0 <= 29) {
                this.field452 = null;
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "f", descriptor = "(I)V", line = 562)
    public final void method246(int arg0) {
        if (arg0 <= 116) {
            method234(93);
        }
        field476++;
        if (!this.field458) {
            this.field464 = new class358();
            this.field462 = new class104();
        }
    }
}
