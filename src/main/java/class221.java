import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class221 {

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "[B")
    private byte[] field4183 = new byte[4];

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "Lfd;")
    private class55 field4179;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
    private int field4196;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "J")
    private long field4180;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field4182 = 3;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field4184 = 0;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "Lob;")
    public static class141 field4192 = class175.method1195(40, "; Expires=");

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "Ljava/util/Random;")
    public static Random field4188 = new Random();

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    public static int field4194 = 0;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "Lob;")
    public static class141 field4195 = class175.method1195(40, "Standort");

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    public static int field4197 = 2301979;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    private int field4186;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    private int field4189;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "Lpe;")
    public static class154 field4193;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "Lca;")
    public static class22 field4178;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field4191;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "[B")
    private byte[] field4181;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZB)V")
    public static final void method1425(boolean arg0, byte arg1) {
        int var2 = 0;
        int var3 = 91 / ((-arg1 - 13) / 52);
        while (class195.field3738 > var2) {
            long var4 = (long) class203.field3888[var2] << 32 | 0x20000000L;
            class131 var6 = class10.field172[class203.field3888[var2]];
            if (var6 != null && var6.method251((byte) 120) && arg0 == var6.field2507.field180 && var6.field2507.method65(-5713)) {
                int var7 = var6.field3889 >> 7;
                int var8 = var6.field3854 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    label70: {
                        if (var6.field3871 == 1 && (var6.field3889 & 0x7F) == 64 && (var6.field3854 & 0x7F) == 64) {
                            if (class218.field4135[var7][var8] == class45.field866) {
                                break label70;
                            }
                            class218.field4135[var7][var8] = class45.field866;
                        }
                        if (!var6.field2507.field176) {
                            var4 |= Long.MIN_VALUE;
                        }
                        var6.field3864 = class206.method1360(class66.field1287, var6.field3871 * 64 + var6.field3889 - 64, (byte) 40, var6.field3871 * 64 + var6.field3854 - 64);
                        class108.method715(class66.field1287, var6.field3889, var6.field3854, var6.field3864, var6.field3871 * 64 + 60 - 64, var6, var6.field3845, var4, var6.field3876);
                    }
                }
            }
            var2++;
        }
        field4185++;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)[B")
    public final byte[] method1426(boolean arg0) throws IOException {
        field4190++;
        if (this.field4180 < class1.method2((byte) -53)) {
            throw new IOException("fdt");
        }
        if (!arg0) {
            field4182 = -125;
        }
        if (this.field4196 == 0) {
            if (this.field4179.field1089 == 2) {
                throw new IOException("fds");
            }
            if (this.field4179.field1089 == 1) {
                this.field4196 = 1;
                this.field4191 = (DataInputStream) this.field4179.field1090;
            }
        }
        if (this.field4196 == 1) {
            int var2 = this.field4191.available();
            if (var2 > 0) {
                if (this.field4189 + var2 > 4) {
                    var2 = 4 - this.field4189;
                }
                this.field4189 += this.field4191.read(this.field4183, this.field4189, var2);
                if (this.field4189 == 4) {
                    int var3 = (new class146(this.field4183)).method979(1029109968);
                    this.field4196 = 2;
                    this.field4181 = new byte[var3];
                }
            }
        }
        if (this.field4196 == 2) {
            int var4 = this.field4191.available();
            if (var4 > 0) {
                if (var4 + this.field4186 > this.field4181.length) {
                    var4 = this.field4181.length - this.field4186;
                }
                this.field4186 += this.field4191.read(this.field4181, this.field4186, var4);
                if (this.field4181.length == this.field4186) {
                    return this.field4181;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(Z)V")
    public static void method1427(boolean arg0) {
        field4193 = null;
        field4188 = null;
        field4178 = null;
        if (!arg0) {
            field4182 = 30;
        }
        field4195 = null;
        field4192 = null;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lt;Ljava/net/URL;)V")
    public class221(class189 arg0, URL arg1) {
        this.field4179 = arg0.method1251(-84, arg1);
        this.field4196 = 0;
        this.field4180 = class1.method2((byte) -47) + 30000L;
    }
}
