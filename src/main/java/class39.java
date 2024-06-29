import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class39 {

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "[B")
    private byte[] field908 = new byte[4];

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "Lw;")
    private class150 field902;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    private int field912;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "J")
    private long field920;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "Ltd;")
    private static class136 field904 = class145.method1172("Unexpected server response", 45);

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "J")
    public static volatile long field909 = 0L;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Lke;")
    public static class74 field903 = null;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "Ltd;")
    private static class136 field907 = class145.method1172("Please check your message)2centre for details)3", 45);

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "Ltd;")
    public static class136 field913 = field904;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "Ltd;")
    public static class136 field922 = class145.method1172(" (X", 45);

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "Ltd;")
    public static class136 field911 = field907;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    private int field917;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
    private int field923;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "Lpd;")
    public static class108 field921;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field905;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "[B")
    private byte[] field901;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "[Lke;")
    public static class74[] field906;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)[B")
    public final byte[] method328(int arg0) throws IOException {
        field910++;
        if (class27.method233((byte) 126) > this.field920) {
            throw new IOException("fdt");
        }
        if (this.field912 == 0) {
            if (this.field902.field3442 == 2) {
                throw new IOException("fds");
            }
            if (this.field902.field3442 == 1) {
                this.field905 = (DataInputStream) this.field902.field3441;
                this.field912 = 1;
            }
        }
        if (this.field912 == 1) {
            int var2 = this.field905.available();
            if (var2 > 0) {
                if (this.field923 + var2 > 4) {
                    var2 = 4 - this.field923;
                }
                this.field923 += this.field905.read(this.field908, this.field923, var2);
                if (this.field923 == 4) {
                    int var3 = (new class127(this.field908)).method986(-124);
                    this.field901 = new byte[var3];
                    this.field912 = 2;
                }
            }
        }
        if (this.field912 == 2) {
            int var4 = this.field905.available();
            if (var4 > 0) {
                if (this.field901.length < this.field917 + var4) {
                    var4 = this.field901.length - this.field917;
                }
                this.field917 += this.field905.read(this.field901, this.field917, var4);
                if (this.field901.length == this.field917) {
                    return this.field901;
                }
            }
        }
        return arg0 == 1 ? null : null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V")
    public static void method329(boolean arg0) {
        field903 = null;
        field907 = null;
        field906 = null;
        field904 = null;
        field913 = null;
        field922 = null;
        field921 = null;
        field911 = null;
        if (!arg0) {
            method331(-14);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIZIII)Lbb;")
    public static final class10 method330(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        long var6 = ((long) arg3 << 38) + (long) arg4 + ((long) arg1 << 16) + ((long) arg5 << 40);
        field916++;
        if (!arg2) {
            class10 var8 = (class10) class143.field3315.method1162(var6, true);
            if (var8 != null) {
                return var8;
            }
        }
        class121 var9 = class63.method472(arg4, (byte) -92);
        if (arg1 > 1 && var9.field2818 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2804[var11] && var9.field2804[var11] != 0) {
                    var10 = var9.field2818[var11];
                }
            }
            if (var10 != -1) {
                var9 = class63.method472(var10, (byte) 122);
            }
        }
        class23 var12 = var9.method939(-1, 1);
        if (var12 == null) {
            return null;
        }
        int var13 = -51 / ((1 - arg0) / 51);
        class10 var14 = null;
        if (var9.field2801 != -1) {
            var14 = method330(-61, 10, true, 1, var9.field2758, 0);
            if (var14 == null) {
                return null;
            }
        }
        int[] var15 = class114.field2632;
        int var16 = class114.field2634;
        int var17 = class114.field2630;
        int[] var18 = new int[4];
        class114.method896(var18);
        class10 var19 = new class10(36, 32);
        class114.method888(var19.field169, 36, 32);
        class114.method890();
        class103.method818();
        class103.method827(16, 16);
        int var20 = var9.field2803;
        class103.field2450 = false;
        if (arg2) {
            var20 = (int) ((double) var20 * 1.5D);
        } else if (arg3 == 2) {
            var20 = (int) ((double) var20 * 1.04D);
        }
        int var21 = class103.field2452[var9.field2767] * var20 >> 16;
        int var22 = class103.field2456[var9.field2767] * var20 >> 16;
        var12.method195();
        var12.method189(0, var9.field2802, var9.field2798, var9.field2767, var9.field2796, var12.field2607 / 2 + var22 + var9.field2772, var9.field2772 + var21);
        if (arg3 >= 1) {
            var19.method62(1);
        }
        if (arg3 >= 2) {
            var19.method62(16777215);
        }
        if (arg5 != 0) {
            var19.method61(arg5);
        }
        class114.method888(var19.field169, 36, 32);
        if (var9.field2801 != -1) {
            var14.method46(0, 0);
        }
        if (!arg2 && (var9.field2761 == 1 || arg1 != 1) && arg1 != -1) {
            class43.field998.method702(class86.method640(arg1, 1), 0, 9, 16776960, 1);
        }
        if (!arg2) {
            class143.field3315.method1164(var6, var19, (byte) 126);
        }
        class114.method888(var15, var16, var17);
        class114.method901(var18);
        class103.method818();
        class103.field2450 = true;
        return var19;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
    public static final void method331(int arg0) {
        field918++;
        class15.field304.method867(26, true);
        for (class118 var1 = (class118) class18.field363.method107((byte) -123); var1 != null; var1 = (class118) class18.field363.method104(65)) {
            if (var1.field2682 == 0 || var1.field2682 == 3) {
                class87.method646(var1, true, (byte) 32);
            }
        }
        if (arg0 != -17515) {
            field909 = 93L;
        }
        if (class107.field2523 != null) {
            class145.method1173(class107.field2523, arg0 + 13507);
            class107.field2523 = null;
        }
        class3.field63++;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([BIIIIIIII[Lm;)V")
    public static final void method332(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class83[] arg9) {
        field914++;
        for (int var10 = arg1; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg6 + var10 > 0 && arg6 + var10 < 103 && arg2 + var15 > 0 && arg2 + var15 < 103) {
                    arg9[arg3].field1972[arg6 + var10][arg2 + var15] = class154.method1207(arg9[arg3].field1972[arg6 + var10][arg2 + var15], -16777217);
                }
            }
        }
        class127 var11 = new class127(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg7 == var12 && var13 >= arg4 && var13 < arg4 + 8 && var14 >= arg8 && arg8 + 8 > var14) {
                        class85.method636(0, (byte) -114, var11, arg2 + class59.method455(var13 & 0x7, arg5, arg1 + 5097, var14 & 0x7), arg6 + client.method165(arg5, var14 & 0x7, 3, var13 & 0x7), arg3, arg5, 0);
                    } else {
                        class85.method636(0, (byte) -77, var11, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)V")
    public static final void method333(boolean arg0) {
        class4.field84 = null;
        class74.field1567 = null;
        class122.field2843 = null;
        class133.field3141 = null;
        class16.field322 = null;
        class15.field300 = null;
        class87.field2049 = null;
        class35.field832 = null;
        if (!arg0) {
            method330(-86, 104, false, -49, -126, 27);
        }
        class139.field3241 = null;
        class101.field2421 = null;
        class40.field941 = null;
        class31.field685 = null;
        field919++;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Ld;Ljava/net/URL;)V")
    public class39(class22 arg0, URL arg1) {
        this.field902 = arg0.method179(-30036, arg1);
        this.field912 = 0;
        this.field920 = class27.method233((byte) -72) + 30000L;
    }
}
