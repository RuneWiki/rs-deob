import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class116 {

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "[B")
    private byte[] field2574 = new byte[4];

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "Lcf;")
    private class21 field2589;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    private int field2577;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "J")
    private long field2586;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "[Lpe;")
    public static class109[] field2573 = new class109[100];

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "[I")
    public static int[] field2576 = new int[5];

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Z")
    public static boolean field2575 = false;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "Z")
    public static volatile boolean field2582 = false;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "Lpe;")
    public static class109 field2585 = class141.method1120("Weiter", 0);

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "Lpe;")
    public static class109 field2579 = class141.method1120("<col=00ff80>", 0);

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "Lpe;")
    private static class109 field2588 = class141.method1120("Select", 0);

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "Lpe;")
    public static class109 field2578 = field2588;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "Lcd;")
    public static class19 field2572 = new class19();

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field2590 = 0;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    private int field2580;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    private int field2581;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field2587;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "[B")
    private byte[] field2571;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)[B")
    public final byte[] method955(int arg0) throws IOException {
        field2583++;
        if (class94.method779(107) > this.field2586) {
            throw new IOException("fdt");
        }
        if (this.field2577 == 0) {
            if (this.field2589.field513 == 2) {
                throw new IOException("fds");
            }
            if (this.field2589.field513 == 1) {
                this.field2577 = 1;
                this.field2587 = (DataInputStream) this.field2589.field514;
            }
        }
        if (this.field2577 == 1) {
            int var2 = this.field2587.available();
            if (var2 > 0) {
                if (this.field2581 + var2 > 4) {
                    var2 = 4 - this.field2581;
                }
                this.field2581 += this.field2587.read(this.field2574, this.field2581, var2);
                if (this.field2581 == 4) {
                    int var3 = (new class13(this.field2574)).method112(false);
                    this.field2571 = new byte[var3];
                    this.field2577 = 2;
                }
            }
        }
        if (~this.field2577 == arg0) {
            int var4 = this.field2587.available();
            if (var4 > 0) {
                if (this.field2571.length < this.field2580 + var4) {
                    var4 = this.field2571.length - this.field2580;
                }
                this.field2580 += this.field2587.read(this.field2571, this.field2580, var4);
                if (this.field2571.length == this.field2580) {
                    return this.field2571;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
    public static void method956(byte arg0) {
        field2572 = null;
        int var1 = 7 % ((arg0 - 19) / 44);
        field2588 = null;
        field2579 = null;
        field2578 = null;
        field2573 = null;
        field2585 = null;
        field2576 = null;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Ldf;Ljava/net/URL;)V")
    public class116(class28 arg0, URL arg1) {
        this.field2589 = arg0.method248(arg1, true);
        this.field2577 = 0;
        this.field2586 = class94.method779(-65) + 30000L;
    }
}
