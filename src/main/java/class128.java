import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class128 {

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "[B")
    private byte[] field2392 = new byte[4];

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "Lsh;")
    private class170 field2380;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
    private int field2394;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "J")
    private long field2382;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "Lsg;")
    public static class169 field2384 = class165.method1060("Ung-Ultiger Benutzername", 1536);

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "Lsg;")
    public static class169 field2391 = class165.method1060("Bitte versuchen Sie es in ", 1536);

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "Lua;")
    public static class181 field2388 = new class181(100);

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "[I")
    public static int[] field2397 = new int[25];

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "[[S")
    public static short[][] field2399 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    private int field2386;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    private int field2387;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "Lqf;")
    public static class150 field2398;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "Lke;")
    public static class95 field2396;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field2381;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "[B")
    private byte[] field2383;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "[I")
    public static int[] field2393;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)[B")
    public final byte[] method830(int arg0) throws IOException {
        field2389++;
        if (this.field2382 < class116.method712((byte) -59)) {
            throw new IOException("fdt");
        }
        if (arg0 != -30012) {
            method831(-95);
        }
        if (this.field2394 == 0) {
            if (this.field2380.field3296 == 2) {
                throw new IOException("fds");
            }
            if (this.field2380.field3296 == 1) {
                this.field2381 = (DataInputStream) this.field2380.field3299;
                this.field2394 = 1;
            }
        }
        if (this.field2394 == 1) {
            int var2 = this.field2381.available();
            if (var2 > 0) {
                if (this.field2386 + var2 > 4) {
                    var2 = 4 - this.field2386;
                }
                this.field2386 += this.field2381.read(this.field2392, this.field2386, var2);
                if (this.field2386 == 4) {
                    int var3 = (new class127(this.field2392)).method814(8);
                    this.field2383 = new byte[var3];
                    this.field2394 = 2;
                }
            }
        }
        if (this.field2394 == 2) {
            int var4 = this.field2381.available();
            if (var4 > 0) {
                if (var4 + this.field2387 > this.field2383.length) {
                    var4 = this.field2383.length - this.field2387;
                }
                this.field2387 += this.field2381.read(this.field2383, this.field2387, var4);
                if (this.field2383.length == this.field2387) {
                    return this.field2383;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
    public static final void method831(int arg0) {
        if (arg0 <= 6) {
            field2397 = null;
        }
        class95.field1813.method1205(true);
        field2379++;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V")
    public static void method832(int arg0) {
        field2399 = null;
        field2391 = null;
        if (arg0 >= -113) {
            field2396 = null;
        }
        field2384 = null;
        field2398 = null;
        field2388 = null;
        field2397 = null;
        field2393 = null;
        field2396 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IB)Lah;")
    public static final class9 method833(int arg0, byte arg1) {
        field2395++;
        class9 var2 = (class9) class140.field2595.method1206((long) arg0, -24742);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class45.field842.method552(0, arg0, 0);
        if (var3 == null) {
            return null;
        }
        class9 var4 = new class9();
        class127 var5 = new class127(var3);
        var5.field2346 = var5.field2325.length - 12;
        int var6 = 0;
        int var7 = var5.method814(arg1 - 74);
        var4.field234 = var5.method785(true);
        var4.field233 = var5.method785(true);
        var4.field237 = var5.method785(true);
        var4.field232 = var5.method785(true);
        var5.field2346 = 0;
        var4.field239 = var5.method815(0);
        var4.field240 = new int[var7];
        if (arg1 != 82) {
            field2393 = null;
        }
        var4.field235 = new int[var7];
        var4.field238 = new class169[var7];
        while (var5.field2346 < var5.field2325.length - 12) {
            int var8 = var5.method785(true);
            if (var8 == 3) {
                var4.field238[var6] = var5.method793((byte) -96);
            } else if (var8 >= 100 || var8 == 21 || var8 == 38 || var8 == 39) {
                var4.field235[var6] = var5.method819((byte) 22);
            } else {
                var4.field235[var6] = var5.method814(8);
            }
            var4.field240[var6++] = var8;
        }
        class140.field2595.method1208((long) arg0, arg1 + 29, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
    public static final void method834(byte arg0) {
        class135.field2522 = 99;
        if (arg0 >= -106) {
            method831(8);
        }
        class147.field2704 = new byte[4][104][104];
        field2385++;
        class1.field22 = new int[104];
        class81.field1497 = new int[104];
        client.field587 = new byte[4][104][104];
        class116.field2149 = new byte[4][104][104];
        client.field577 = new byte[4][105][105];
        class202.field3938 = new int[104];
        class116.field2147 = new int[104];
        class159.field3034 = new int[4][105][105];
        class169.field3251 = new int[104];
        class167.field3185 = new byte[4][104][104];
        class112.field2058 = new int[105][105];
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lma;Ljava/net/URL;)V")
    public class128(class109 arg0, URL arg1) {
        this.field2380 = arg0.method672((byte) -102, arg1);
        this.field2394 = 0;
        this.field2382 = class116.method712((byte) -103) + 30000L;
    }
}
