import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class101 {

    @OriginalMember(owner = "client!od", name = "n", descriptor = "[B")
    private byte[] field2437 = new byte[4];

    @OriginalMember(owner = "client!od", name = "d", descriptor = "Ljb;")
    private class64 field2427;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    private int field2438;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "J")
    private long field2447;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "Lu;")
    public static class135 field2424 = class87.method676((byte) -124, "0(U");

    @OriginalMember(owner = "client!od", name = "j", descriptor = "Lu;")
    public static class135 field2433 = class87.method676((byte) -106, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!od", name = "v", descriptor = "Lu;")
    public static class135 field2445 = class87.method676((byte) -80, "leuchten1:");

    @OriginalMember(owner = "client!od", name = "r", descriptor = "Lu;")
    public static class135 field2441 = class87.method676((byte) -96, "Ung-Ultige Session)2ID)3");

    @OriginalMember(owner = "client!od", name = "q", descriptor = "Lu;")
    private static class135 field2440 = class87.method676((byte) -95, "Starting game engine)3)3)3");

    @OriginalMember(owner = "client!od", name = "f", descriptor = "Lu;")
    public static class135 field2429 = class87.method676((byte) -99, "::");

    @OriginalMember(owner = "client!od", name = "t", descriptor = "[I")
    public static int[] field2443 = new int[1000];

    @OriginalMember(owner = "client!od", name = "p", descriptor = "Z")
    public static boolean field2439 = false;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field2426 = 0;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "Lu;")
    public static class135 field2444 = class87.method676((byte) -93, "blaugr-Un:");

    @OriginalMember(owner = "client!od", name = "z", descriptor = "[I")
    public static int[] field2449 = new int[4000];

    @OriginalMember(owner = "client!od", name = "A", descriptor = "Lu;")
    public static class135 field2450 = field2440;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    private int field2428;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    private int field2431;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field2434;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "[B")
    private byte[] field2430;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "[Lbc;")
    public static class11[] field2442;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static void method828(int arg0) {
        field2444 = null;
        field2450 = null;
        field2440 = null;
        if (arg0 != 520) {
            return;
        }
        field2433 = null;
        field2442 = null;
        field2445 = null;
        field2424 = null;
        field2449 = null;
        field2429 = null;
        field2443 = null;
        field2441 = null;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
    public static final void method829(int arg0) {
        if (arg0 != 42) {
            method828(18);
        }
        if (class27.field655.toLowerCase().indexOf("microsoft") == -1) {
            class138.field3343[44] = 71;
            class138.field3343[47] = 73;
            class138.field3343[92] = 74;
            class138.field3343[91] = 42;
            class138.field3343[61] = 27;
            class138.field3343[93] = 43;
            class138.field3343[45] = 26;
            class138.field3343[59] = 57;
            class138.field3343[46] = 72;
            if (class27.field651 == null) {
                class138.field3343[222] = 59;
                class138.field3343[192] = 58;
            } else {
                class138.field3343[222] = 58;
                class138.field3343[520] = 59;
                class138.field3343[192] = 28;
            }
        } else {
            class138.field3343[220] = 74;
            class138.field3343[186] = 57;
            class138.field3343[221] = 43;
            class138.field3343[192] = 58;
            class138.field3343[189] = 26;
            class138.field3343[223] = 28;
            class138.field3343[188] = 71;
            class138.field3343[190] = 72;
            class138.field3343[191] = 73;
            class138.field3343[222] = 59;
            class138.field3343[187] = 27;
            class138.field3343[219] = 42;
        }
        field2435++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIII)Z")
    public static final boolean method830(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2432++;
        if (!class93.method760(0, arg6)) {
            return false;
        }
        class62.field1558 = null;
        boolean var7 = class84.method651(0, arg2, arg3, -1, arg5, arg0, 0, class105.field2528[arg6], arg4, arg1);
        if (class62.field1558 != null) {
            class84.method651(class37.field844, arg2, arg3, -1412584499, 0, arg0, class12.field276, class62.field1558, arg4, arg1);
        }
        return var7;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "([BB)V")
    public static final void method831(byte[] arg0, byte arg1) {
        field2452++;
        class59 var2 = new class59(arg0);
        var2.field1485 = arg0.length - 2;
        if (arg1 != -40) {
            return;
        }
        class53.field1280 = var2.method483((byte) 24);
        class29.field699 = new byte[class53.field1280][];
        class107.field2567 = new int[class53.field1280];
        client.field533 = new int[class53.field1280];
        class86.field2061 = new int[class53.field1280];
        class59.field1451 = new int[class53.field1280];
        var2.field1485 = arg0.length - class53.field1280 * 8 - 7;
        class48.field1140 = var2.method483((byte) 24);
        class80.field1918 = var2.method483((byte) 24);
        int var3 = (var2.method480(0) & 0xFF) + 1;
        for (int var4 = 0; var4 < class53.field1280; var4++) {
            class59.field1451[var4] = var2.method483((byte) 24);
        }
        for (int var5 = 0; var5 < class53.field1280; var5++) {
            class107.field2567[var5] = var2.method483((byte) 24);
        }
        for (int var6 = 0; var6 < class53.field1280; var6++) {
            class86.field2061[var6] = var2.method483((byte) 24);
        }
        for (int var7 = 0; var7 < class53.field1280; var7++) {
            client.field533[var7] = var2.method483((byte) 24);
        }
        var2.field1485 = arg0.length - class53.field1280 * 8 - (var3 + -1) * 3 - 7;
        class69.field1696 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class69.field1696[var8] = var2.method455(true);
            if (class69.field1696[var8] == 0) {
                class69.field1696[var8] = 1;
            }
        }
        var2.field1485 = 0;
        for (int var9 = 0; var9 < class53.field1280; var9++) {
            int var10 = class86.field2061[var9];
            int var11 = client.field533[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class29.field699[var9] = var13;
            int var14 = var2.method480(0);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method475(-49152);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var10; var15++) {
                    for (int var16 = 0; var16 < var11; var16++) {
                        var13[var10 * var16 + var15] = var2.method475(-49152);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)[B")
    public final byte[] method832(byte arg0) throws IOException {
        field2425++;
        if (this.field2447 < class14.method95(90)) {
            throw new IOException("fdt");
        }
        int var2 = -113 % ((arg0 - 84) / 34);
        if (this.field2438 == 0) {
            if (this.field2427.field1592 == 2) {
                throw new IOException("fds");
            }
            if (this.field2427.field1592 == 1) {
                this.field2434 = (DataInputStream) this.field2427.field1596;
                this.field2438 = 1;
            }
        }
        if (this.field2438 == 1) {
            int var3 = this.field2434.available();
            if (var3 > 0) {
                if (var3 + this.field2428 > 4) {
                    var3 = 4 - this.field2428;
                }
                this.field2428 += this.field2434.read(this.field2437, this.field2428, var3);
                if (this.field2428 == 4) {
                    int var4 = (new class59(this.field2437)).method498((byte) -53);
                    this.field2430 = new byte[var4];
                    this.field2438 = 2;
                }
            }
        }
        if (this.field2438 == 2) {
            int var5 = this.field2434.available();
            if (var5 > 0) {
                if (this.field2431 + var5 > this.field2430.length) {
                    var5 = this.field2430.length - this.field2431;
                }
                this.field2431 += this.field2434.read(this.field2430, this.field2431, var5);
                if (this.field2430.length == this.field2431) {
                    return this.field2430;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V")
    public static final void method833(int arg0) {
        field2451++;
        class79.field1878.method234(-22666);
        class62.field1548.method234(-22666);
        int var1 = 40 % ((arg0 + 56) / 62);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IZ)Z")
    public static final boolean method834(int arg0, boolean arg1) {
        field2446++;
        if (arg1) {
            field2439 = true;
        }
        return (arg0 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lde;Ljava/net/URL;)V")
    public class101(class27 arg0, URL arg1) {
        this.field2427 = arg0.method218(-10, arg1);
        this.field2438 = 0;
        this.field2447 = class14.method95(-84) + 30000L;
    }
}
