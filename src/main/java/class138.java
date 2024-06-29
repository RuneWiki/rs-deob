import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class138 {

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "[B")
    private byte[] field2356 = new byte[4];

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Lbi;")
    private class77 field2362;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    private int field2357;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "J")
    private long field2369;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "Lwa;")
    private static class75 field2354 = class66.method560("Hidden", false);

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "Lwa;")
    public static class75 field2361 = class66.method560("<)4col> x", false);

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "[[S")
    public static short[][] field2365 = new short[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 115, 88, 59, 35, 16, 2, 823, 1837, 4019, 7091, 10169, 14259, 17331, 21427, 27571, 30643, -31821, -27721, -24647, -21593, -16587, -13391, 790, 5014, 7056, 1156, 15124, 19986, 30610, -30830, -27758, -23664, -17518, -14446, -9328, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 115, 88, 59, 35, 16, 2, 819, 929, 792, 2743, 2729, 3858, 4923, 4907, 4884, 7995, 7966, 11069, 11047, 11028, 18227, 18204, 18314, 30397, 30373, 30350, -31175, -31197, -32116, -25920, -25939, -25960, -21833, -21849, -21740, -19008, -18011, -18928, -11845, -11867, -14736, 23440, 22032, 21642, 1752, 4946, 8916, 14036, 25948, 32472, -27950, -20778, -15660, -7470, 8097, 7830, 5392, 4890, 4882, 788, 530, -22756, -24044, 13964 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 115, 88, 59, 35, 16, 2, 819, 929, 792, 2743, 2729, 3858, 4923, 4907, 4884, 7995, 7966, 11069, 11047, 11028, 18227, 18204, 18314, 30397, 30373, 30350, -31175, -31197, -32116, -25920, -25939, -25960, -21833, -21849, -21740, -19008, -18011, -18928, -11845, -11867, -14736, 23440, 22032, 21642, 1752, 4946, 8916, 14036, 25948, 32472, -27950, -20778, -15660, -7470, 8097, 7830, 5392, 4890, 4882, 788, 530, -22756, -24044, 13964 } };

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "Lwa;")
    public static class75 field2368 = class66.method560("Untersuchen", false);

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "Lwa;")
    public static class75 field2370 = field2354;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "F")
    public static float field2359;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    private int field2358;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
    private int field2371;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "Lcb;")
    public static class267 field2363;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field2366;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "[B")
    private byte[] field2360;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 13)
    public static final void method1052(int arg0) {
        class163.field2768.method1200(false);
        if (arg0 != 24267) {
            method1052(9);
        }
        field2355++;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V", line = 35)
    public static void method1053(boolean arg0) {
        field2365 = (short[][]) null;
        field2354 = null;
        field2361 = null;
        field2368 = null;
        field2370 = null;
        if (arg0) {
            field2363 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lcl;Ljava/net/URL;)V", line = 251)
    public class138(class124 arg0, URL arg1) {
        this.field2362 = arg0.method950(arg1, (byte) 56);
        this.field2357 = 0;
        this.field2369 = class78.method669(2047) + 30000L;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)[B", line = 61)
    public final byte[] method1054(int arg0) throws IOException {
        int var2 = -50 % ((arg0 + 10) / 62);
        field2353++;
        if (class78.method669(2047) > this.field2369) {
            throw new IOException("fdt");
        }
        if (this.field2357 == 0) {
            if (this.field2362.field1330 == 2) {
                throw new IOException("fds");
            }
            if (this.field2362.field1330 == 1) {
                this.field2366 = (DataInputStream) this.field2362.field1329;
                this.field2357 = 1;
            }
        }
        if (this.field2357 == 1) {
            int var3 = this.field2366.available();
            if (var3 > 0) {
                if ((this.field2358 + var3) > 4) {
                    var3 = 4 - this.field2358;
                }
                this.field2358 += this.field2366.read(this.field2356, this.field2358, var3);
                if (this.field2358 == 4) {
                    int var4 = (new class60(this.field2356)).method505(255);
                    this.field2360 = new byte[var4];
                    this.field2357 = 2;
                }
            }
        }
        if (this.field2357 == 2) {
            int var5 = this.field2366.available();
            if (var5 > 0) {
                if (this.field2360.length < (var5 + this.field2371)) {
                    var5 = this.field2360.length - this.field2371;
                }
                this.field2371 += this.field2366.read(this.field2360, this.field2371, var5);
                if (this.field2360.length == this.field2371) {
                    return this.field2360;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZLwa;I)V", line = 145)
    public static final void method1055(boolean arg0, class75 arg1, int arg2) {
        class75 var3 = arg1.method622(0);
        short[] var4 = new short[16];
        field2367++;
        int var5 = 0;
        for (int var6 = 0; var6 < class259.field4343; var6++) {
            class278 var7 = class199.method1475(var6, (byte) 121);
            if ((!arg0 || var7.field4764) && var7.field4800 == -1 && var7.field4776 == -1 && var7.field4824 == 0 && var7.field4770.method622(0).method657((byte) -31, var3) != -1) {
                if (var5 >= 250) {
                    class306.field5233 = null;
                    class263.field4568 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var8 = new short[var4.length * 2];
                    for (int var9 = 0; var9 < var5; var9++) {
                        var8[var9] = var4[var9];
                    }
                    var4 = var8;
                }
                var4[var5++] = (short) var6;
            }
        }
        int var10 = -29 % ((arg2 + 57) / 63);
        class115.field1952 = 0;
        class263.field4568 = var5;
        class75[] var11 = new class75[class263.field4568];
        class306.field5233 = var4;
        for (int var12 = 0; var12 < class263.field4568; var12++) {
            var11[var12] = class199.method1475(var4[var12], (byte) 119).field4770;
        }
        class172.method1269(1313874720, var11, class306.field5233);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIBIIIII)V", line = 219)
    public static final void method1056(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2364++;
        if (arg4 == arg7) {
            class282.method2001(arg4, true, arg3, arg1, arg0, arg6, arg5);
            return;
        }
        if (class153.field2635 <= arg5 - arg4 && class288.field4956 >= (arg4 + arg5) && (arg6 - arg7) >= class90.field1495 && class294.field5041 >= arg6 + arg7) {
            class266.method1892(arg1, arg0, arg4, arg7, arg6, (byte) -121, arg5, arg3);
        } else {
            class161.method1207(arg5, -1, arg7, arg6, arg0, arg1, arg4, arg3);
        }
        if (arg2 > -94) {
            method1053(true);
        }
    }
}
