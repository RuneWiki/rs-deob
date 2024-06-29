import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ua")
public class class39 extends class21 {

    @OriginalMember(owner = "mapview!ua", name = "o", descriptor = "[B")
    public byte[] field514;

    @OriginalMember(owner = "mapview!ua", name = "t", descriptor = "I")
    public int field519;

    @OriginalMember(owner = "mapview!ua", name = "n", descriptor = "[J")
    private static long[] field513 = new long[256];

    @OriginalMember(owner = "mapview!ua", name = "q", descriptor = "Lt;")
    public static class36 field516;

    @OriginalMember(owner = "mapview!ua", name = "s", descriptor = "Lt;")
    public static class36 field518;

    @OriginalMember(owner = "mapview!ua", name = "p", descriptor = "Lt;")
    public static class36 field515;

    @OriginalMember(owner = "mapview!ua", name = "r", descriptor = "Lt;")
    public static class36 field517;

    @OriginalMember(owner = "mapview!ua", name = "v", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "mapview!ua", name = "u", descriptor = "J")
    public static long field520;

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "([BB)[B", line = 6)
    public static final byte[] method243(byte[] arg0, byte arg1) {
        int var2 = arg0.length;
        if (arg1 < 64) {
            method257((byte) -128);
        }
        byte[] var3 = new byte[var2];
        class16.method89(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;", line = 23)
    public static final String method244(Throwable arg0, byte arg1) throws IOException {
        String var3;
        if (arg0 instanceof class4) {
            class4 var2 = (class4) arg0;
            var3 = var2.field34 + " | ";
            arg0 = var2.field38;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        if (arg1 != -100) {
            return (String) null;
        }
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var3 + "| " + var8;
                }
                int var11 = var9.indexOf(40);
                int var12 = var9.indexOf(41, var11 + 1);
                if (var11 >= 0 && var12 >= 0) {
                    String var13 = var9.substring(var11 + 1, var12);
                    int var14 = var13.indexOf(".java:");
                    if (var14 >= 0) {
                        String var15 = var13.substring(0, var14) + var13.substring(var14 + 5);
                        var3 = var3 + var15 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var11);
                }
                String var16 = var9.trim();
                String var17 = var16.substring(var16.lastIndexOf(32) + 1);
                String var18 = var17.substring(var17.lastIndexOf(9) + 1);
                var3 = var3 + var18 + ' ';
            }
        }
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "([BBII)V", line = 101)
    public final void method245(byte[] arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -100) {
            this.method247(126, -65, null, -125);
        }
        for (int var5 = arg2; var5 < arg2 + arg3; var5++) {
            arg0[var5] = this.field514[this.field519++];
        }
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(II)V", line = 131)
    public final void method246(int arg0, int arg1) {
        this.field514[this.field519++] = (byte) (arg1 >> 24);
        this.field514[this.field519++] = (byte) (arg1 >> 16);
        this.field514[this.field519++] = (byte) (arg1 >> 8);
        if (arg0 == 0) {
            this.field514[this.field519++] = (byte) arg1;
        }
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(II[II)V", line = 157)
    public final void method247(int arg0, int arg1, int[] arg2, int arg3) {
        int var5 = this.field519;
        this.field519 = arg0;
        int var6 = (arg3 - arg0) / 8;
        if (arg1 >= -62) {
            return;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = this.method255(8080);
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = this.method255(8080);
            int var12 = 32;
            while (var12-- > 0) {
                var11 -= (var8 >>> 5 ^ var8 << 4) + var8 ^ arg2[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var8 -= (var11 << 4 ^ var11 >>> 5) + var11 ^ arg2[var9 & 0x3] + var9;
            }
            this.field519 -= 8;
            this.method246(0, var8);
            this.method246(0, var11);
        }
        this.field519 = var5;
    }

    @OriginalMember(owner = "mapview!ua", name = "c", descriptor = "(I)B", line = 216)
    public final byte method248(int arg0) {
        if (arg0 != 65280) {
            field516 = null;
        }
        return this.field514[this.field519++];
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field513[var0] = var1;
        }
        field516 = class3.method8(13631, "Shield Shop");
        field518 = class3.method8(13631, "Gem Shop");
        field515 = class3.method8(13631, "???");
        field517 = class3.method8(13631, "Loading )3)3)3");
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(B)Lt;", line = 242)
    public final class36 method249(byte arg0) {
        int var2 = this.field519;
        while (this.field514[this.field519++] != 0) {
        }
        return arg0 <= 32 ? (class36) null : class9.method42((byte) 124, this.field519 - var2 - 1, this.field514, var2);
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(IB)V", line = 259)
    public final void method250(int arg0, byte arg1) {
        if (arg1 != -15) {
            field516 = null;
        }
        this.field514[this.field519++] = (byte) arg0;
    }

    @OriginalMember(owner = "mapview!ua", name = "d", descriptor = "(I)B", line = 271)
    public static final byte method251(int arg0) {
        int var1 = -56 / ((19 - arg0) / 46);
        return class9.field95 == null ? 0 : class9.field95[class6.field65];
    }

    @OriginalMember(owner = "mapview!ua", name = "e", descriptor = "(I)I", line = 320)
    public final int method252(int arg0) {
        if (arg0 == -2) {
            this.field519 += 3;
            return ((this.field514[this.field519 - 3] & 0xFF) << 16) + (((this.field514[this.field519 - 2] & 0xFF) << 8) + (this.field514[this.field519 - 1] & 0xFF));
        } else {
            return -117;
        }
    }

    @OriginalMember(owner = "mapview!ua", name = "b", descriptor = "(B)V", line = 331)
    public static void method253(byte arg0) {
        field516 = null;
        int var1 = 100 % ((-arg0 - 18) / 63);
        field513 = null;
        field517 = null;
        field515 = null;
        field518 = null;
    }

    @OriginalMember(owner = "mapview!ua", name = "f", descriptor = "(I)I", line = 344)
    public final int method254(int arg0) {
        this.field519 += 2;
        if (arg0 != 65280) {
            field520 = 26L;
        }
        return ((this.field514[this.field519 - 2] & 0xFF) << 8) + (this.field514[this.field519 - 1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!ua", name = "g", descriptor = "(I)I", line = 374)
    public final int method255(int arg0) {
        if (arg0 != 8080) {
            field520 = 27L;
        }
        this.field519 += 4;
        return ((this.field514[this.field519 - 2] & 0xFF) << 8) + (this.field514[this.field519 - 4] << 24 & 0xFF000000) + ((this.field514[this.field519 + -3] & 0xFF) << 16) + (this.field514[this.field519 + -1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!ua", name = "h", descriptor = "(I)I", line = 394)
    public final int method256(int arg0) {
        return arg0 == 1795441960 ? this.field514[this.field519++] & 0xFF : 14;
    }

    @OriginalMember(owner = "mapview!ua", name = "<init>", descriptor = "(I)V", line = 453)
    public class39(int arg0) {
        this.field514 = class15.method87(arg0, 0);
        this.field519 = 0;
    }

    @OriginalMember(owner = "mapview!ua", name = "<init>", descriptor = "([B)V", line = 461)
    public class39(byte[] arg0) {
        this.field519 = 0;
        this.field514 = arg0;
    }

    @OriginalMember(owner = "mapview!ua", name = "c", descriptor = "(B)B", line = 471)
    public static final byte method257(byte arg0) {
        if (arg0 <= 88) {
            return -95;
        } else if (class40.field529 == null) {
            return 0;
        } else {
            return class40.field529[class6.field65];
        }
    }
}
