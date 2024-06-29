import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class167 {

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "[B")
    private byte[] field3333 = new byte[4];

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "Lca;")
    private class22 field3341;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    private int field3343;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "J")
    private long field3350;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field3334 = 127;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static volatile int field3339 = -1;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "Lkb;")
    public static class93 field3340 = class76.method390("W-=hlen Sie eine Option", 0);

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "Z")
    public static boolean field3345 = false;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "Lkb;")
    private static class93 field3351 = class76.method390("Close", 0);

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field3337 = 0;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "Z")
    public static boolean field3352 = false;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "Lkb;")
    public static class93 field3349 = field3351;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    private int field3335;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    private int field3347;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "J")
    public static long field3332;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "Lob;")
    public static class129 field3344;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "Lsg;")
    public static class170 field3336;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field3353;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "[B")
    private byte[] field3348;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public static void method1128(int arg0) {
        field3336 = null;
        int var1 = -24 % ((arg0 + 26) / 35);
        field3349 = null;
        field3340 = null;
        field3344 = null;
        field3351 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BJ)V")
    public static final void method1129(byte arg0, long arg1) {
        field3338++;
        if (arg1 == 0L) {
            return;
        }
        if (arg0 < 31) {
            method1129((byte) -84, 10L);
        }
        if (class27.field424 >= 100) {
            class189.method1223(0, class43.field712, 2249, class13.field219);
            return;
        }
        class93 var3 = class133.method797(37, arg1).method505((byte) -87);
        for (int var4 = 0; var4 < class27.field424; var4++) {
            if (class166.field3280[var4] == arg1) {
                class189.method1223(0, class43.field712, 2249, class203.method1321(new class93[] { var3, class143.field2790 }, 121));
                return;
            }
        }
        for (int var5 = 0; var5 < class62.field991; var5++) {
            if (class151.field2910[var5] == arg1) {
                class189.method1223(0, class43.field712, 2249, class203.method1321(new class93[] { class182.field3599, var3, class13.field217 }, -67));
                return;
            }
        }
        if (var3.method485((byte) 86, class106.field1940.field550)) {
            class189.method1223(0, class43.field712, 2249, class136.field2642);
            return;
        }
        class166.field3280[class27.field424] = arg1;
        class66.field1194++;
        class137.field2650[class27.field424++] = class133.method797(37, arg1);
        class16.field287 = class203.field3928;
        class151.field2908.method47(98, 8);
        class151.field2908.method1064(arg1, -1);
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lqd;Ljava/net/URL;)V")
    public class167(class149 arg0, URL arg1) {
        this.field3341 = arg0.method911(0, arg1);
        this.field3343 = 0;
        this.field3350 = class171.method1146((byte) 112) + 30000L;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)[B")
    public final byte[] method1130(byte arg0) throws IOException {
        field3342++;
        if (class171.method1146((byte) -4) > this.field3350) {
            throw new IOException("fdt");
        } else if (arg0 <= 115) {
            return null;
        } else {
            if (this.field3343 == 0) {
                if (this.field3341.field344 == 2) {
                    throw new IOException("fds");
                }
                if (this.field3341.field344 == 1) {
                    this.field3343 = 1;
                    this.field3353 = (DataInputStream) this.field3341.field342;
                }
            }
            if (this.field3343 == 1) {
                int var2 = this.field3353.available();
                if (var2 > 0) {
                    if (var2 + this.field3347 > 4) {
                        var2 = 4 - this.field3347;
                    }
                    this.field3347 += this.field3353.read(this.field3333, this.field3347, var2);
                    if (this.field3347 == 4) {
                        int var3 = (new class158(this.field3333)).method1076(24277);
                        this.field3348 = new byte[var3];
                        this.field3343 = 2;
                    }
                }
            }
            if (this.field3343 == 2) {
                int var4 = this.field3353.available();
                if (var4 > 0) {
                    if (this.field3348.length < this.field3335 + var4) {
                        var4 = this.field3348.length - this.field3335;
                    }
                    this.field3335 += this.field3353.read(this.field3348, this.field3335, var4);
                    if (this.field3348.length == this.field3335) {
                        return this.field3348;
                    }
                }
            }
            return null;
        }
    }
}
