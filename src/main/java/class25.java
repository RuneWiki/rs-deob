import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ma")
public class class25 extends class16 {

    @OriginalMember(owner = "mapview!ma", name = "m", descriptor = "I")
    public int field281;

    @OriginalMember(owner = "mapview!ma", name = "l", descriptor = "[B")
    public byte[] field280;

    @OriginalMember(owner = "mapview!ma", name = "j", descriptor = "J")
    public static long field278 = 0L;

    @OriginalMember(owner = "mapview!ma", name = "o", descriptor = "Lt;")
    public static class31 field283 = class11.method64(105, "sprites");

    @OriginalMember(owner = "mapview!ma", name = "n", descriptor = "Lt;")
    public static class31 field282 = class11.method64(-120, "Switch to ");

    @OriginalMember(owner = "mapview!ma", name = "i", descriptor = "I")
    public static int field277 = 0;

    @OriginalMember(owner = "mapview!ma", name = "p", descriptor = "I")
    public static int field284 = 0;

    @OriginalMember(owner = "mapview!ma", name = "k", descriptor = "Lt;")
    public static class31 field279 = class11.method64(90, "Brewery");

    @OriginalMember(owner = "mapview!ma", name = "q", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "mapview!ma", name = "s", descriptor = "Lg;")
    public static class12 field287;

    @OriginalMember(owner = "mapview!ma", name = "r", descriptor = "[B")
    public static byte[] field286;

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(II)Lt;", line = 17)
    public static final class31 method132(int arg0, int arg1) {
        return arg1 > -40 ? (class31) null : class8.method58(arg0, 10, 39, false);
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(ILjava/lang/String;)Lt;", line = 37)
    public static final class31 method133(int arg0, String arg1) {
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var2 = arg1.getBytes();
        }
        class31 var4 = new class31();
        var4.field349 = var2;
        var4.field345 = 0;
        int var5 = -97 / ((arg0 - 76) / 39);
        for (int var6 = 0; var6 < var2.length; var6++) {
            if (var2[var6] != 0) {
                var2[var4.field345++] = var2[var6];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(III[B)V", line = 81)
    private final void method134(int arg0, int arg1, int arg2, byte[] arg3) {
        int var5 = 1 % ((-arg0 - 19) / 59);
        for (int var6 = arg1; var6 < arg1 + arg2; var6++) {
            arg3[var6] = this.field280[this.field281++];
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(IB[II)V", line = 95)
    public final void method135(int arg0, byte arg1, int[] arg2, int arg3) {
        int var5 = this.field281;
        this.field281 = arg3;
        int var6 = (arg0 - arg3) / 8;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = this.method144(117);
            int var9 = this.method144(92);
            int var10 = -957401312;
            int var11 = 32;
            int var12 = -1640531527;
            while (var11-- > 0) {
                var9 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var10 - -arg2[var10 >>> 11 & 0x3];
                var10 -= var12;
                var8 -= arg2[var10 & 0x3] + var10 ^ (var9 >>> 5 ^ var9 << 4) + var9;
            }
            this.field281 -= 8;
            this.method136(var8, -254155608);
            this.method136(var9, -254155608);
        }
        int var13 = -24 % ((55 - arg1) / 61);
        this.field281 = var5;
    }

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "(II)V", line = 149)
    public final void method136(int arg0, int arg1) {
        this.field280[this.field281++] = (byte) (arg0 >> 24);
        this.field280[this.field281++] = (byte) (arg0 >> 16);
        this.field280[this.field281++] = (byte) (arg0 >> arg1);
        this.field280[this.field281++] = (byte) arg0;
    }

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "(I)[Lja;", line = 167)
    public static final class19[] method137(int arg0) {
        class19[] var1 = new class19[mapview.field20];
        for (int var2 = arg0; var2 < mapview.field20; var2++) {
            class19 var3 = var1[var2] = new class19();
            var3.field250 = class6.field115[var2];
            var3.field253 = class10.field166[var2];
            var3.field251 = class32.field364[var2];
            var3.field254 = class18.field245[var2];
            int var4 = var3.field254 * var3.field251;
            byte[] var5 = class28.field309[var2];
            var3.field252 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.field252[var6] = class33.field390[class3.method43(255, var5[var6])];
            }
        }
        class17.method99((byte) 103);
        return var1;
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(B)V", line = 207)
    public static final void method138(byte arg0) {
        if (class12.field202.toLowerCase().indexOf("microsoft") == -1) {
            class32.field357[44] = 71;
            class32.field357[45] = 26;
            class32.field357[46] = 72;
            class32.field357[47] = 73;
            class32.field357[59] = 57;
            class32.field357[61] = 27;
            class32.field357[91] = 42;
            class32.field357[92] = 74;
            class32.field357[93] = 43;
            if (class12.field193 == null) {
                class32.field357[192] = 58;
                class32.field357[222] = 59;
            } else {
                class32.field357[192] = 28;
                class32.field357[222] = 58;
                class32.field357[520] = 59;
            }
        } else {
            class32.field357[186] = 57;
            class32.field357[187] = 27;
            class32.field357[188] = 71;
            class32.field357[189] = 26;
            class32.field357[190] = 72;
            class32.field357[191] = 73;
            class32.field357[192] = 58;
            class32.field357[219] = 42;
            class32.field357[220] = 74;
            class32.field357[221] = 43;
            class32.field357[222] = 59;
            class32.field357[223] = 28;
        }
        if (arg0 < 109) {
            field283 = null;
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "c", descriptor = "(I)Lt;", line = 259)
    public final class31 method139(int arg0) {
        int var2 = this.field281;
        if (arg0 != 221) {
            method132(62, 15);
        }
        while (this.field280[this.field281++] != 0) {
        }
        return class1.method30(this.field281 - var2 - 1, this.field280, -30188, var2);
    }

    @OriginalMember(owner = "mapview!ma", name = "d", descriptor = "(I)B", line = 279)
    public final byte method140(int arg0) {
        if (arg0 >= -60) {
            field283 = null;
        }
        return this.field280[this.field281++];
    }

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "(B)V", line = 295)
    public static void method141(byte arg0) {
        field279 = null;
        field287 = null;
        field283 = null;
        field282 = null;
        if (arg0 >= 80) {
            field286 = null;
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "<init>", descriptor = "(I)V", line = 312)
    public class25(int arg0) {
        this.field281 = 0;
        this.field280 = class2.method33(-28, arg0);
    }

    @OriginalMember(owner = "mapview!ma", name = "<init>", descriptor = "([B)V", line = 321)
    public class25(byte[] arg0) {
        this.field280 = arg0;
        this.field281 = 0;
    }

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "(Z)I", line = 337)
    public final int method142(boolean arg0) {
        if (arg0) {
            this.field281 += 2;
            return ((this.field280[this.field281 - 2] & 0xFF) << 8) + (this.field280[this.field281 - 1] & 0xFF);
        } else {
            return -11;
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(I[B)[B", line = 363)
    public static final byte[] method143(int arg0, byte[] arg1) {
        class25 var2 = new class25(arg1);
        int var3 = var2.method145(86);
        int var4 = var2.method144(99);
        if (~var4 > arg0 || class32.field361 != 0 && class32.field361 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method134(-124, 0, var4, var5);
            return var5;
        } else {
            int var6 = var2.method144(125);
            if (var6 < 0 || class32.field361 != 0 && var6 > class32.field361) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class24.method123(var7, var6, arg1, var4, 9);
            } else {
                try {
                    DataInputStream var8 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg1, 9, var4)));
                    var8.readFully(var7);
                    var8.close();
                } catch (IOException var10) {
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "e", descriptor = "(I)I", line = 428)
    public final int method144(int arg0) {
        if (arg0 < 64) {
            method141((byte) -87);
        }
        this.field281 += 4;
        return ((this.field280[this.field281 - 4] & 0xFF) << 24) + ((this.field280[this.field281 - 3] & 0xFF) << 16) + ((this.field280[this.field281 + -2] & 0xFF) << 8) + (this.field280[this.field281 + -1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!ma", name = "f", descriptor = "(I)I", line = 454)
    public final int method145(int arg0) {
        return arg0 < 71 ? -76 : this.field280[this.field281++] & 0xFF;
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(BI)V", line = 481)
    public final void method146(byte arg0, int arg1) {
        this.field280[this.field281++] = (byte) arg1;
        if (arg0 < 119) {
            this.method145(-26);
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "g", descriptor = "(I)I", line = 505)
    public final int method147(int arg0) {
        if (arg0 != -1847668240) {
            field283 = null;
        }
        this.field281 += 3;
        return (this.field280[this.field281 - 1] & 0xFF) + ((this.field280[this.field281 - 3] & 0xFF) << 16) + ((this.field280[this.field281 + -2] & 0xFF) << 8);
    }
}
