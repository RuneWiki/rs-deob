import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class102 implements Runnable {

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    private int field1469 = 0;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    private int field1480 = 0;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "Z")
    private boolean field1468 = false;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "Z")
    private boolean field1478 = false;

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "Ljava/net/Socket;")
    private Socket field1488;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "Luo;")
    private class274 field1481;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "Ljava/io/InputStream;")
    private InputStream field1479;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1482;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1476 = "Allocating memory";

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "I")
    public static int field1490 = -1;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "Lsc;")
    private class158 field1467;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "Lnm;")
    public static class221 field1470;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "Lnm;")
    public static class221 field1473;

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "[B")
    private byte[] field1489;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IILfh;IIZIIZIII)V", line = 5)
    public static final void method661(int arg0, int arg1, class313 arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        if (arg11 >= 0 && arg11 < 104 && arg0 >= 0 && arg0 < 104) {
            if (!arg8 && !arg5) {
                class148.field2392[arg9][arg11][arg0] = 0;
            }
            while (true) {
                int var12 = arg2.method2224(-128);
                if (var12 == 0) {
                    if (arg8) {
                        class101.field1457[0][arg7 + arg11][arg0 + arg4] = class223.field3444[0][arg7 + arg11][arg0 + arg4];
                    } else if (arg9 == 0) {
                        class101.field1457[0][arg7 + arg11][arg0 + arg4] = -class84.method551(arg10 + 556238, 4096, arg1 + 932731) * 8;
                    } else {
                        class101.field1457[arg9][arg7 + arg11][arg0 + arg4] = class101.field1457[arg9 - 1][arg7 + arg11][arg0 + arg4] - 240;
                    }
                    break;
                }
                if (var12 == 1) {
                    int var13 = arg2.method2224(-122);
                    if (arg8) {
                        class101.field1457[0][arg7 + arg11][arg0 + arg4] = var13 * 8 + class223.field3444[0][arg7 + arg11][arg0 + arg4];
                    } else {
                        if (var13 == 1) {
                            var13 = 0;
                        }
                        if (arg9 == 0) {
                            class101.field1457[0][arg7 + arg11][arg0 + arg4] = -var13 * 8;
                        } else {
                            class101.field1457[arg9][arg7 + arg11][arg0 + arg4] = class101.field1457[arg9 - 1][arg7 + arg11][arg0 + arg4] - var13 * 8;
                        }
                    }
                    break;
                }
                if (var12 > 49) {
                    if (var12 <= 81) {
                        if (!arg8 && !arg5) {
                            class148.field2392[arg9][arg11][arg0] = (byte) (var12 - 49);
                        }
                    } else if (!arg5) {
                        class151.field2430[arg9][arg11][arg0] = (byte) (var12 - 81);
                    }
                } else if (arg5) {
                    arg2.method2224(-127);
                } else {
                    class56.field867[arg9][arg11][arg0] = arg2.method2200(-97);
                    class6.field72[arg9][arg11][arg0] = (byte) ((var12 - 2) / 4);
                    class320.field5273[arg9][arg11][arg0] = (byte) class235.method1623(var12 + arg6 - 2, 3);
                }
            }
        } else {
            while (true) {
                int var14 = arg2.method2224(-128);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg2.method2224(-119);
                    break;
                }
                if (var14 <= 49) {
                    arg2.method2224(-124);
                }
            }
        }
        int var15 = -110 % ((arg3 - 31) / 32);
        field1491++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILjava/lang/String;III)V", line = 116)
    public static final void method662(int arg0, String arg1, int arg2, int arg3, int arg4) {
        class264 var5 = class113.method741(arg2, (byte) 126, arg3);
        field1465++;
        if (var5 == null) {
            return;
        }
        if (var5.field4332 != null) {
            class190 var6 = new class190();
            var6.field2954 = arg0;
            var6.field2940 = var5.field4332;
            var6.field2947 = arg1;
            var6.field2937 = var5;
            class201.method1372(var6, 200000);
        }
        boolean var7 = true;
        if (var5.field4233 > 0) {
            var7 = class170.method1177(var5, 21325);
        }
        if (!var7 || !client.method898(var5).method526(arg0 - 1, false)) {
            return;
        }
        int var8 = 33 % ((47 - arg4) / 44);
        if (arg0 == 1) {
            class195.field2992.method250(21066, 224);
            class195.field2992.method2222(arg2, 255);
            class195.field2992.method2206(arg3, (byte) -115);
            class157.field2529++;
        }
        if (arg0 == 2) {
            class61.field943++;
            class195.field2992.method250(21066, 76);
            class195.field2992.method2222(arg2, 255);
            class195.field2992.method2206(arg3, (byte) -112);
        }
        if (arg0 == 3) {
            class195.field2992.method250(21066, 86);
            class142.field2291++;
            class195.field2992.method2222(arg2, 255);
            class195.field2992.method2206(arg3, (byte) -53);
        }
        if (arg0 == 4) {
            class186.field2893++;
            class195.field2992.method250(21066, 170);
            class195.field2992.method2222(arg2, 255);
            class195.field2992.method2206(arg3, (byte) -42);
        }
        if (arg0 == 5) {
            class8.field102++;
            class195.field2992.method250(21066, 246);
            class195.field2992.method2222(arg2, 255);
            class195.field2992.method2206(arg3, (byte) -122);
        }
        if (arg0 == 6) {
            class195.field2992.method250(21066, 217);
            class195.field2992.method2222(arg2, 255);
            class195.field2992.method2206(arg3, (byte) -126);
            class268.field4408++;
        }
        if (arg0 == 7) {
            class195.field2992.method250(21066, 35);
            class50.field723++;
            class195.field2992.method2222(arg2, 255);
            class195.field2992.method2206(arg3, (byte) -59);
        }
        if (arg0 == 8) {
            class185.field2871++;
            class195.field2992.method250(21066, 47);
            class195.field2992.method2222(arg2, 255);
            class195.field2992.method2206(arg3, (byte) -45);
        }
        if (arg0 == 9) {
            class7.field95++;
            class195.field2992.method250(21066, 139);
            class195.field2992.method2222(arg2, 255);
            class195.field2992.method2206(arg3, (byte) -89);
        }
        if (arg0 == 10) {
            class251.field4005++;
            class195.field2992.method250(21066, 154);
            class195.field2992.method2222(arg2, 255);
            class195.field2992.method2206(arg3, (byte) -113);
        }
    }

    @OriginalMember(owner = "client!fa", name = "run", descriptor = "()V", line = 244)
    public final void run() {
        field1485++;
        try {
            while (true) {
                int var3;
                int var4;
                synchronized (this) {
                    if (this.field1480 == this.field1469) {
                        if (this.field1468) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var13) {
                        }
                    }
                    if (this.field1469 > this.field1480) {
                        var3 = 5000 - this.field1469;
                    } else {
                        var3 = this.field1480 - this.field1469;
                    }
                    var4 = this.field1469;
                }
                if (var3 > 0) {
                    try {
                        this.field1482.write(this.field1489, var4, var3);
                    } catch (IOException var12) {
                        this.field1478 = true;
                    }
                    this.field1469 = (this.field1469 + var3) % 5000;
                    try {
                        if (this.field1480 == this.field1469) {
                            this.field1482.flush();
                        }
                    } catch (IOException var11) {
                        this.field1478 = true;
                    }
                }
            }
            try {
                if (this.field1479 != null) {
                    this.field1479.close();
                }
                if (this.field1482 != null) {
                    this.field1482.close();
                }
                if (this.field1488 != null) {
                    this.field1488.close();
                }
            } catch (IOException var10) {
            }
            this.field1489 = null;
        } catch (Exception var15) {
            class326.method2328(var15, (String) null, true);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BLnm;)I", line = 317)
    public static final int method663(byte arg0, class221 arg1) {
        field1462++;
        int var2 = 0;
        if (arg1.method1519(false, class110.field1632)) {
            var2++;
        }
        if (arg1.method1519(false, class51.field760)) {
            var2++;
        }
        if (arg1.method1519(false, class291.field4834)) {
            var2++;
        }
        if (arg1.method1519(false, class9.field109)) {
            var2++;
        }
        if (arg1.method1519(false, class289.field4801)) {
            var2++;
        }
        if (arg1.method1519(false, class81.field1186)) {
            var2++;
        }
        if (arg1.method1519(false, class99.field1443)) {
            var2++;
        }
        if (arg1.method1519(false, class283.field4652)) {
            var2++;
        }
        if (arg1.method1519(false, class233.field3710)) {
            var2++;
        }
        if (arg1.method1519(false, class146.field2360)) {
            var2++;
        }
        if (arg0 >= -115) {
            method663((byte) 120, (class221) null);
        }
        if (arg1.method1519(false, class117.field1709)) {
            var2++;
        }
        if (arg1.method1519(false, class355.field5626)) {
            var2++;
        }
        if (arg1.method1519(false, class198.field3047)) {
            var2++;
        }
        if (arg1.method1519(false, class177.field2774)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZ)V", line = 377)
    public static final void method664(int arg0, boolean arg1) {
        class197.field3034 = new int[104];
        field1487++;
        class116.field1696 = new int[104];
        class84.field1208 = new int[104];
        class15.field192 = new int[104];
        class107.field1538 = 99;
        if (arg0 != 21540) {
            method662(72, (String) null, -87, 86, -14);
        }
        class183.field2846 = new int[5];
        class109.field1615 = new int[104];
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class151.field2430 = new byte[var2][104][104];
        class180.field2806 = new byte[var2][105][105];
        class6.field72 = new byte[var2][104][104];
        class56.field867 = new byte[var2][104][104];
        class320.field5273 = new byte[var2][104][104];
        class109.field1614 = new int[var2][105][105];
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II[BI)Z", line = 408)
    public static final boolean method665(int arg0, int arg1, byte[] arg2, int arg3) {
        class313 var4 = new class313(arg2);
        field1464++;
        boolean var5 = true;
        if (arg1 <= 1) {
            field1466 = -44;
        }
        int var6 = -1;
        label59: while (true) {
            int var7 = var4.method2217(115);
            if (var7 == 0) {
                return var5;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var4.method2201(128);
                    if (var11 == 0) {
                        continue label59;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var4.method2224(-123) >> 2;
                    int var14 = (var8 & 0xFFA) >> 6;
                    int var15 = arg3 + var12;
                    int var16 = arg0 + var14;
                    if (var16 > 0 && var15 > 0 && var16 < 103 && var15 < 103) {
                        class126 var17 = class165.method1155((byte) 75, var6);
                        if (var13 != 22 || class118.field1725 || var17.field1954 != 0 || var17.field1926 == 1 || var17.field1957) {
                            var9 = true;
                            if (!var17.method810(65535)) {
                                var5 = false;
                                class120.field1771++;
                            }
                        }
                    }
                }
                int var10 = var4.method2201(128);
                if (var10 == 0) {
                    break;
                }
                var4.method2224(-123);
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "finalize", descriptor = "()V", line = 490)
    protected final void finalize() {
        this.method674((byte) -83);
        field1486++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lfh;B)Ljl;", line = 498)
    public static final class120 method666(class313 arg0, byte arg1) {
        field1477++;
        return arg1 == 114 ? new class120(arg0.method2214(arg1 - 114), arg0.method2214(0), arg0.method2214(0), arg0.method2214(arg1 ^ 0x72), arg0.method2214(arg1 - 114), arg0.method2214(0), arg0.method2214(arg1 ^ 0x72), arg0.method2214(0), arg0.method2249(-80), arg0.method2224(arg1 - 239)) : (class120) null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)I", line = 511)
    public final int method667(boolean arg0) throws IOException {
        if (arg0) {
            field1484++;
            return this.field1468 ? 0 : this.field1479.available();
        } else {
            return 73;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)I", line = 525)
    public final int method668(int arg0) throws IOException {
        field1483++;
        if (this.field1468) {
            return 0;
        } else {
            if (arg0 != 0) {
                method673(53, 127, true, 14, 30);
            }
            return this.field1479.read();
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I[BIB)V", line = 539)
    public final void method669(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        field1475++;
        if (this.field1468) {
            return;
        }
        if (this.field1478) {
            this.field1478 = false;
            throw new IOException();
        }
        if (this.field1489 == null) {
            this.field1489 = new byte[5000];
        }
        synchronized (this) {
            int var6 = 0;
            while (true) {
                if (arg2 <= var6) {
                    if (this.field1467 == null) {
                        this.field1467 = this.field1481.method1952(0, 3, this);
                    }
                    this.notifyAll();
                    break;
                }
                this.field1489[this.field1480] = arg1[arg0 + var6];
                this.field1480 = (this.field1480 + 1) % 5000;
                if (((this.field1469 + 4900) % 5000) == this.field1480) {
                    throw new IOException();
                }
                var6++;
            }
        }
        if (arg3 >= -72) {
            this.field1481 = (class274) null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I[BBI)V", line = 595)
    public final void method670(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        field1474++;
        if (arg2 != 18) {
            this.field1479 = (InputStream) null;
        }
        if (this.field1468) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field1479.read(arg1, arg0, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 -= var5;
            arg0 += var5;
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Ljava/net/Socket;Luo;)V", line = 769)
    public class102(Socket arg0, class274 arg1) throws IOException {
        this.field1488 = arg0;
        this.field1481 = arg1;
        this.field1488.setSoTimeout(30000);
        this.field1488.setTcpNoDelay(true);
        this.field1479 = this.field1488.getInputStream();
        this.field1482 = this.field1488.getOutputStream();
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V", line = 636)
    public final void method671(byte arg0) throws IOException {
        field1492++;
        if (this.field1468) {
            return;
        }
        if (this.field1478) {
            this.field1478 = false;
            throw new IOException();
        } else if (arg0 != -33) {
            this.field1480 = -7;
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V", line = 658)
    public final void method672(int arg0) {
        field1471++;
        if (arg0 != 99) {
            this.run();
        }
        if (!this.field1468) {
            this.field1479 = new class268();
            this.field1482 = new class38();
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIZII)V", line = 692)
    public static final void method673(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (class218.field3357 == 1) {
            class41.field626[class233.field3703 / 100].method945(class105.field1526 - 8, class269.field4431 + -8);
        }
        field1472++;
        if (class218.field3357 == 2) {
            class41.field626[(class233.field3703 / 100) + 4].method945(class105.field1526 - 8, class269.field4431 + -8);
        }
        class352.method2461((byte) 82);
        if (arg2) {
            method675(113);
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V", line = 718)
    public final void method674(byte arg0) {
        field1463++;
        if (this.field1468) {
            return;
        }
        synchronized (this) {
            this.field1468 = true;
            if (arg0 != -83) {
                return;
            }
            this.notifyAll();
        }
        if (this.field1467 != null) {
            while (this.field1467.field2542 == 0) {
                class177.method1246(1L, arg0 - 32561);
            }
            if (this.field1467.field2542 == 1) {
                try {
                    ((Thread) this.field1467.field2538).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field1467 = null;
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V", line = 755)
    public static void method675(int arg0) {
        field1473 = null;
        field1470 = null;
        field1476 = null;
        if (arg0 != -8) {
            method664(15, true);
        }
    }
}
