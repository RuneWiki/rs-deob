import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class150 {

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "[B")
    private byte[] field2451 = new byte[4];

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "Ldj;")
    private class310 field2446;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    private int field2444;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "J")
    private long field2453;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "Lbe;")
    public static class283 field2454 = class153.method941(-41, "");

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public static int field2455 = -1;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "Ltf;")
    public static class242 field2445 = new class242(50);

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "Lbe;")
    public static class283 field2459 = class153.method941(-9, " weitere Optionen");

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    private int field2447;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    private int field2452;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "Lui;")
    public static class251 field2460;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field2457;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "[B")
    private byte[] field2443;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V", line = 4)
    public static final void method924(int arg0) {
        field2448++;
        if (arg0 != 32767) {
            field2455 = 55;
        }
        if (class58.field796 == null) {
            return;
        }
        try {
            byte[] var1 = class58.field796.method928(0);
            if (var1 != null) {
                class229 var2 = new class229(var1);
                class55.field761 = var2.method1496(true);
                class122.field2041 = new class65[class55.field761];
                for (int var3 = 0; var3 < class55.field761; var3++) {
                    class65 var4 = class122.field2041[var3] = new class65();
                    int var5 = var2.method1496(true);
                    var4.field910 = (var5 & 0x8000) != 0;
                    var4.field903 = var5 & 0x7FFF;
                    var4.field899 = var2.method1549(true);
                    var4.field901 = var2.method1507(79);
                    var4.field898 = var3;
                    int var6 = var2.method1496(true);
                    var4.field893 = class116.method749(var6, (byte) 126);
                }
                class200.method1288(0, (byte) -128, class122.field2041.length - 1, class122.field2041);
                class58.field796 = null;
            }
        } catch (Exception var8) {
            var8.printStackTrace();
            class58.field796 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)Z", line = 68)
    public static final boolean method925(int arg0) {
        field2456++;
        int var1 = -60 % ((arg0 - 12) / 40);
        try {
            return class215.method1423((byte) 113);
        } catch (IOException var6) {
            class171.method1088(3796);
            return true;
        } catch (Exception var7) {
            String var4 = "T2 - " + class163.field2688 + "," + class284.field4854 + "," + class182.field3130 + " - " + class260.field4419 + "," + (class213.field3624.field1178[0] + class214.field3637) + "," + (class107.field1833 + class213.field3624.field1150[0]) + " - ";
            for (int var5 = 0; class260.field4419 > var5 && var5 < 50; var5++) {
                var4 = var4 + class262.field4462.field3879[var5] + ",";
            }
            class296.method2011(true, var4, var7);
            class284.method1953(true);
            return true;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lfe;I)Ljc;", line = 105)
    public static final class282 method926(class229 arg0, int arg1) {
        if (arg1 < 69) {
            method926((class229) null, -61);
        }
        field2458++;
        return new class282(arg0.method1507(92), arg0.method1507(83), arg0.method1507(89), arg0.method1507(84), arg0.method1507(121), arg0.method1507(74), arg0.method1507(126), arg0.method1507(80), arg0.method1551(-127), arg0.method1535((byte) 98));
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lui;Ljava/net/URL;)V", line = 149)
    public class150(class251 arg0, URL arg1) {
        this.field2446 = arg0.method1710(0, arg1);
        this.field2444 = 0;
        this.field2453 = class216.method1426(255) + 30000L;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)V", line = 133)
    public static void method927(boolean arg0) {
        field2445 = null;
        field2460 = null;
        field2459 = null;
        field2454 = null;
        if (!arg0) {
            field2454 = (class283) null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)[B", line = 160)
    private final byte[] method928(int arg0) throws IOException {
        field2449++;
        if (this.field2453 < class216.method1426(255)) {
            throw new IOException("fdt");
        }
        if (this.field2444 == arg0) {
            if (this.field2446.field5293 == 2) {
                throw new IOException("fds");
            }
            if (this.field2446.field5293 == 1) {
                this.field2444 = 1;
                this.field2457 = (DataInputStream) this.field2446.field5296;
            }
        }
        if (this.field2444 == 1) {
            int var2 = this.field2457.available();
            if (var2 > 0) {
                if ((this.field2452 + var2) > 4) {
                    var2 = 4 - this.field2452;
                }
                this.field2452 += this.field2457.read(this.field2451, this.field2452, var2);
                if (this.field2452 == 4) {
                    int var3 = (new class229(this.field2451)).method1528(true);
                    this.field2444 = 2;
                    this.field2443 = new byte[var3];
                }
            }
        }
        if (this.field2444 == 2) {
            int var4 = this.field2457.available();
            if (var4 > 0) {
                if (this.field2443.length < this.field2447 + var4) {
                    var4 = this.field2443.length - this.field2447;
                }
                this.field2447 += this.field2457.read(this.field2443, this.field2447, var4);
                if (this.field2443.length == this.field2447) {
                    return this.field2443;
                }
            }
        }
        return null;
    }
}
