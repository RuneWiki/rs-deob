import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class75 implements class159 {

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "Z")
    private boolean field1264 = true;

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "Z")
    public static boolean field1277 = false;

    @OriginalMember(owner = "client!wa", name = "R", descriptor = "Z")
    public static boolean field1293 = true;

    @OriginalMember(owner = "client!wa", name = "I", descriptor = "I")
    public static int field1284 = -1;

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "Z")
    public static boolean field1286 = true;

    @OriginalMember(owner = "client!wa", name = "jb", descriptor = "I")
    public static int field1311 = -1;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!wa", name = "C", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!wa", name = "D", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!wa", name = "E", descriptor = "I")
    public int field1280;

    @OriginalMember(owner = "client!wa", name = "F", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!wa", name = "J", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!wa", name = "L", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!wa", name = "M", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!wa", name = "N", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "I")
    private int field1290;

    @OriginalMember(owner = "client!wa", name = "P", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!wa", name = "Q", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!wa", name = "S", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!wa", name = "T", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!wa", name = "V", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!wa", name = "W", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!wa", name = "X", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!wa", name = "Y", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!wa", name = "Z", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!wa", name = "ab", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!wa", name = "bb", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!wa", name = "cb", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!wa", name = "db", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!wa", name = "fb", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!wa", name = "gb", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!wa", name = "hb", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!wa", name = "ib", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!wa", name = "kb", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!wa", name = "lb", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!wa", name = "mb", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!wa", name = "nb", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!wa", name = "ob", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!wa", name = "eb", descriptor = "Lbi;")
    public static class77 field1306;

    @OriginalMember(owner = "client!wa", name = "U", descriptor = "[B")
    public byte[] field1296;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILwa;)I", line = 8)
    public final int method609(int arg0, class75 arg1) {
        field1273++;
        int var3;
        if (arg1.field1280 >= this.field1280) {
            var3 = this.field1280;
        } else {
            var3 = arg1.field1280;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg1.field1296[var4] & 0xFF) > (this.field1296[var4] & 0xFF)) {
                return -1;
            }
            if ((arg1.field1296[var4] & 0xFF) < (this.field1296[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg1.field1280 > this.field1280) {
            return -1;
        }
        int var5 = 126 / ((arg0) / 62);
        if (arg1.field1280 < this.field1280) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)Lwa;", line = 47)
    public final class75 method610(int arg0) {
        field1300++;
        class75 var2 = class260.method1855(this.method630(-96), false);
        int var3 = 99 / ((-arg0 - 59) / 52);
        return var2 == null ? class121.field2047 : var2;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II[B)I", line = 66)
    private final int method611(int arg0, int arg1, byte[] arg2) {
        int var4 = arg0;
        if (arg1 <= 54) {
            return 89;
        }
        field1256++;
        for (int var5 = 0; var5 < this.field1280; var5 += 4) {
            int var6 = class152.method1165(this.field1296[var5], (byte) -127);
            int var7 = (var5 + 1) < this.field1280 ? class152.method1165(this.field1296[var5 + 1], (byte) -127) : -1;
            int var8 = var5 + 2 >= this.field1280 ? -1 : class152.method1165(this.field1296[var5 + 2], (byte) -127);
            int var9 = this.field1280 <= var5 + 3 ? -1 : class152.method1165(this.field1296[var5 + 3], (byte) -127);
            arg2[arg0++] = (byte) class102.method799(var7 >>> 4, var6 << 2);
            if (var8 == -1) {
                break;
            }
            arg2[arg0++] = (byte) class102.method799(class235.method1710(15, var7) << 4, var8 >>> 2);
            if (var9 == -1) {
                break;
            }
            arg2[arg0++] = (byte) class102.method799(class235.method1710(3, var8) << 6, var9);
        }
        return arg0 - var4;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)I", line = 109)
    public final int method612(int arg0, int arg1) {
        field1291++;
        if (arg0 != -32400) {
            this.field1280 = 78;
        }
        return this.method627(arg0 + 27587, arg1, 0);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)Lwa;", line = 122)
    public final class75 method613(int arg0) {
        class75 var2 = new class75();
        if (arg0 != 122) {
            this.method613(-19);
        }
        var2.field1280 = this.field1280;
        field1275++;
        var2.field1296 = new byte[this.field1280];
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field1280; var4++) {
            byte var5 = this.field1296[var4];
            if (var5 == 95) {
                var3 = true;
                var2.field1296[var4] = 32;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var2.field1296[var4] = (byte) (var5 - 32);
                var3 = false;
            } else {
                var3 = false;
                var2.field1296[var4] = var5;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lwa;I)Z", line = 170)
    public final boolean method614(class75 arg0, int arg1) {
        field1315++;
        if (arg0 == null) {
            return false;
        } else if (this.field1280 == arg0.field1280) {
            int var3 = 0;
            if (arg1 != -66) {
                return false;
            }
            while (this.field1280 > var3) {
                byte var4 = this.field1296[var3];
                byte var5 = arg0.field1296[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
                var3++;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wa", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 211)
    public final boolean equals(Object arg0) {
        field1262++;
        if (!arg0 instanceof class75) {
            throw new IllegalArgumentException();
        }
        return this.method660((class75) arg0, 58);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(Lwa;I)Z", line = 227)
    public final boolean method615(class75 arg0, int arg1) {
        field1263++;
        if (this.field1280 < arg0.field1280) {
            return false;
        }
        for (int var3 = arg1; var3 < arg0.field1280; var3++) {
            byte var4 = arg0.field1296[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            byte var5 = this.field1296[var3];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            if (var4 != var5) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)[B", line = 260)
    public final byte[] method616(int arg0) {
        field1271++;
        if (this.field1280 == 0) {
            return new byte[0];
        }
        int var2 = this.field1280 + 3 & 0xFFFFFFFC;
        int var3 = var2 / 4 * 3;
        if (var2 - 2 >= this.field1280 || class152.method1165(this.field1296[var2 - 2], (byte) -127) == -1) {
            var3 -= 2;
        } else if (this.field1280 <= (var2 - 1) || class152.method1165(this.field1296[var2 - 1], (byte) -127) == -1) {
            var3--;
        }
        byte[] var4 = new byte[var3];
        this.method611(arg0, 80, var4);
        return var4;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)Lwa;", line = 288)
    public final class75 method617(int arg0, int arg1) {
        if (arg1 != 255) {
            return (class75) null;
        }
        field1259++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (this.field1264) {
            this.field1290 = 0;
            if (this.field1296.length == this.field1280) {
                int var3;
                for (var3 = 1; var3 <= this.field1280; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class231.method1687(this.field1296, 0, var4, 0, this.field1280);
                this.field1296 = var4;
            }
            this.field1296[this.field1280++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I", line = 335)
    public final int method618(FontMetrics arg0, int arg1) {
        String var3;
        try {
            var3 = new String(this.field1296, 0, this.field1280, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field1296, 0, this.field1280);
        }
        field1260++;
        if (arg1 != -23986) {
            field1277 = true;
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)I", line = 355)
    public final int method619(int arg0) {
        int var2 = 0;
        if (arg0 > -24) {
            field1250 = 25;
        }
        field1310++;
        for (int var3 = 0; var3 < this.field1280; var3++) {
            var2 = (var2 << 5) + (this.field1296[var3] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wa", name = "hashCode", descriptor = "()I", line = 377)
    public final int hashCode() {
        field1282++;
        return this.method619(-47);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)V", line = 388)
    public final void method620(int arg0, boolean arg1) {
        this.field1290 = 0;
        field1266++;
        if (!this.field1264) {
            throw new IllegalArgumentException();
        } else if (arg0 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (arg0 > this.field1296.length) {
                int var3;
                for (var3 = 1; var3 < arg0; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class231.method1687(this.field1296, 0, var4, 0, this.field1280);
                this.field1296 = var4;
            }
            for (int var5 = this.field1280; var5 < arg0; var5++) {
                this.field1296[var5] = 32;
            }
            this.field1280 = arg0;
            if (!arg1) {
                this.field1264 = false;
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)Lwa;", line = 436)
    public final class75 method621(byte arg0) {
        field1295++;
        if (arg0 != -91) {
            this.method614((class75) null, -97);
        }
        long var2 = this.method648(false);
        synchronized (wa.class) {
            if (class311.field5306 == null) {
                class311.field5306 = new class126(4096);
            } else {
                for (class111 var5 = (class111) class311.field5306.method1007(var2, arg0 - 16913); var5 != null; var5 = (class111) class311.field5306.method1010(arg0 + 91)) {
                    if (this.method660(var5.field1893, -127)) {
                        return var5.field1893;
                    }
                }
            }
            class111 var6 = new class111();
            this.field1264 = false;
            var6.field1893 = this;
            class311.field5306.method1004((byte) 73, var2, var6);
            return this;
        }
    }

    @OriginalMember(owner = "client!wa", name = "toString", descriptor = "()Ljava/lang/String;", line = 476)
    public final String toString() {
        field1274++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "(I)Lwa;", line = 497)
    public final class75 method622(int arg0) {
        field1252++;
        class75 var2 = new class75();
        var2.field1280 = this.field1280;
        var2.field1296 = new byte[this.field1280];
        for (int var3 = arg0; var3 < this.field1280; var3++) {
            byte var4 = this.field1296[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field1296[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)Lwa;", line = 527)
    public final class75 method623(boolean arg0) {
        field1308++;
        if (arg0) {
            field1250 = -77;
        }
        if (!this.field1264) {
            throw new IllegalArgumentException();
        }
        this.field1290 = 0;
        if (this.field1296.length != this.field1280) {
            byte[] var2 = new byte[this.field1280];
            class231.method1687(this.field1296, 0, var2, 0, this.field1280);
            this.field1296 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(II)V", line = 565)
    public static final void method624(int arg0, int arg1) {
        field1313++;
        class118 var2 = (class118) class310.field5269.method1007((long) arg1, -17004);
        if (var2 == null) {
            return;
        }
        int var3 = 0;
        if (arg0 != -6234) {
            field1311 = 57;
        }
        while (var3 < var2.field1999.length) {
            var2.field1999[var3] = -1;
            var2.field2001[var3] = 0;
            var3++;
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)Lwa;", line = 592)
    public final class75 method625(byte arg0) {
        class75 var2 = new class75();
        field1287++;
        var2.field1280 = this.field1280;
        if (arg0 != 39) {
            field1306 = (class77) null;
        }
        var2.field1296 = new byte[var2.field1280];
        for (int var3 = 0; var3 < this.field1280; var3++) {
            var2.field1296[this.field1280 - var3 - 1] = this.field1296[var3];
        }
        return var2;
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(II)I", line = 617)
    public final int method626(int arg0, int arg1) {
        if (arg0 == 160) {
            field1255++;
            return this.field1296[arg1] & 0xFF;
        } else {
            return -124;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)I", line = 632)
    public final int method627(int arg0, int arg1, int arg2) {
        byte var4 = (byte) arg1;
        field1302++;
        if (arg0 != -4813) {
            return -48;
        }
        for (int var5 = arg2; var5 < this.field1280; var5++) {
            if (this.field1296[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lwa;ILwa;)Lwa;", line = 656)
    public final class75 method628(class75 arg0, int arg1, class75 arg2) {
        field1288++;
        int var4 = this.field1280;
        int var5 = -60 % ((-arg1 - 13) / 38);
        int var6 = arg2.field1280 - arg0.field1280;
        int var7 = 0;
        while (true) {
            int var8 = this.method653(var7, (byte) -26, arg0);
            if (var8 < 0) {
                int var9 = 0;
                class75 var10 = class89.method708(7391, var4);
                while (true) {
                    int var11 = this.method653(var9, (byte) -26, arg0);
                    if (var11 < 0) {
                        while (this.field1280 > var9) {
                            var10.method617(this.field1296[var9++] & 0xFF, 255);
                        }
                        return var10;
                    }
                    while (var11 > var9) {
                        var10.method617(this.field1296[var9++] & 0xFF, 255);
                    }
                    var10.method633(-123, arg2);
                    var9 += arg0.field1280;
                }
            }
            var4 += var6;
            var7 = arg0.field1280 + var8;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([BIIII)I", line = 712)
    public final int method629(byte[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field1309++;
        int var6 = 24 / ((66 - arg2) / 57);
        class231.method1687(this.field1296, arg4, arg0, arg1, arg3 - arg4);
        return arg3 - arg4;
    }

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "(I)J", line = 730)
    public final long method630(int arg0) {
        if (arg0 >= -33) {
            return 125L;
        }
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field1280 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field1296[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += (long) (var5 - 64);
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += (long) (var5 + 1 - 97);
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += (long) (var5 + 27 - 48);
            }
        }
        field1261++;
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BIILjava/awt/Graphics;)V", line = 774)
    public final void method631(byte arg0, int arg1, int arg2, Graphics arg3) {
        field1281++;
        String var5;
        try {
            if (arg0 <= 7) {
                this.field1296 = (byte[]) null;
            }
            var5 = new String(this.field1296, 0, this.field1280, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field1296, 0, this.field1280);
        }
        arg3.drawString(var5, arg2, arg1);
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(Lwa;I)Z", line = 806)
    public final boolean method632(class75 arg0, int arg1) {
        field1258++;
        if (arg0.field1280 > this.field1280) {
            return false;
        }
        int var3 = this.field1280 - arg0.field1280;
        if (arg1 != -28804) {
            field1286 = false;
        }
        for (int var4 = 0; var4 < arg0.field1280; var4++) {
            if (this.field1296[var3 + var4] != arg0.field1296[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(ILwa;)Lwa;", line = 834)
    public final class75 method633(int arg0, class75 arg1) {
        field1257++;
        if (!this.field1264) {
            throw new IllegalArgumentException();
        }
        this.field1290 = 0;
        if (this.field1280 + arg1.field1280 > this.field1296.length) {
            int var3;
            for (var3 = 1; var3 < (this.field1280 + arg1.field1280); var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class231.method1687(this.field1296, 0, var4, 0, this.field1280);
            this.field1296 = var4;
        }
        class231.method1687(arg1.field1296, 0, this.field1296, this.field1280, arg1.field1280);
        this.field1280 += arg1.field1280;
        if (arg0 >= -50) {
            this.method639(-72, 49);
        }
        return this;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IB)I", line = 874)
    public final int method634(int arg0, byte arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        field1304++;
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        int var6 = -77 / ((arg1 - 17) / 55);
        for (int var7 = 0; var7 < this.field1280; var7++) {
            int var8 = this.field1296[var7] & 0xFF;
            if (var7 == 0) {
                if (var8 == 45) {
                    var4 = true;
                    continue;
                }
                if (var8 == 43) {
                    continue;
                }
            }
            if (var8 >= 48 && var8 <= 57) {
                var8 -= 48;
            } else if (var8 >= 65 && var8 <= 90) {
                var8 -= 55;
            } else if (var8 >= 97 && var8 <= 122) {
                var8 -= 87;
            } else {
                throw new NumberFormatException();
            }
            if (var8 >= arg0) {
                throw new NumberFormatException();
            }
            if (var4) {
                var8 = -var8;
            }
            int var9 = arg0 * var5 + var8;
            if ((var9 / arg0) != var5) {
                throw new NumberFormatException();
            }
            var3 = true;
            var5 = var9;
        }
        if (!var3) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "(II)Z", line = 949)
    private final boolean method635(int arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        if (arg0 >= -32) {
            this.method620(3, false);
        }
        field1253++;
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field1280; var6++) {
            int var7 = this.field1296[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var3 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                return false;
            }
            if (var7 >= arg1) {
                return false;
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg1 * var5 + var7;
            if (var8 / arg1 != var5) {
                return false;
            }
            var5 = var8;
            var4 = true;
        }
        return var4;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILjava/applet/Applet;)V", line = 1021)
    public final void method636(int arg0, Applet arg1) throws Throwable {
        if (arg0 != -63) {
            this.method648(true);
        }
        field1276++;
        String var3 = new String(this.field1296, 0, this.field1280);
        class1.method1((byte) -126, arg1, var3);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIZIIIII)V", line = 1037)
    public static final void method637(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1272++;
        int var9 = arg7 - arg0;
        int var10 = arg4 - arg1;
        if (!arg3) {
            method624(-76, -35);
        }
        int var11 = (arg5 - arg8 << 16) / var9;
        int var12 = (arg6 - arg2 << 16) / var10;
        class219.method1600(0, (byte) 82, arg4, arg2, arg0, var11, arg8, arg1, arg7, 0, var12);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lwa;B)Z", line = 1063)
    public final boolean method638(class75 arg0, byte arg1) {
        field1307++;
        if (this.field1280 < arg0.field1280) {
            return false;
        }
        for (int var3 = 0; var3 < arg0.field1280; var3++) {
            if (this.field1296[var3] != arg0.field1296[var3]) {
                return false;
            }
        }
        if (arg1 != -112) {
            field1293 = false;
        }
        return true;
    }

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "(II)Lwa;", line = 1092)
    public final class75 method639(int arg0, int arg1) {
        field1289++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        } else if (arg0 == 63) {
            class75 var3 = new class75();
            var3.field1296 = new byte[this.field1280 + 1];
            var3.field1280 = this.field1280 + 1;
            class231.method1687(this.field1296, 0, var3.field1296, 0, this.field1280);
            var3.field1296[this.field1280] = (byte) arg1;
            return var3;
        } else {
            return (class75) null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "(I)I", line = 1116)
    public final int method640(int arg0) {
        if (arg0 != 1) {
            this.method653(-5, (byte) -20, (class75) null);
        }
        field1301++;
        return this.field1280;
    }

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "(I)Lwa;", line = 1131)
    public final class75 method641(int arg0) {
        field1316++;
        if (arg0 != -8450) {
            return (class75) null;
        }
        class75 var2 = new class75();
        var2.field1280 = this.field1280;
        byte var3 = 2;
        var2.field1296 = new byte[this.field1280];
        for (int var4 = 0; var4 < this.field1280; var4++) {
            byte var5 = this.field1296[var4];
            if (!(var5 < 97 || var5 > 122) || !(var5 < -32 || var5 > -2 || var5 == -9)) {
                if (var3 == 2) {
                    var5 = (byte) (var5 - 32);
                }
                var3 = 0;
            } else if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                if (var3 == 0) {
                    var5 = (byte) (var5 + 32);
                }
                var3 = 0;
            } else if (var5 == 46 || var5 == 33 || var5 == 63) {
                var3 = 2;
            } else if (var5 != 32) {
                var3 = 1;
            } else if (var3 != 2) {
                var3 = 1;
            }
            var2.field1296[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILwa;II)Lwa;", line = 1190)
    public final class75 method642(int arg0, class75 arg1, int arg2, int arg3) {
        field1278++;
        if (!this.field1264) {
            throw new IllegalArgumentException();
        } else if (arg2 >= 0 && arg3 >= arg2 && arg3 <= arg1.field1280) {
            this.field1290 = 0;
            if (arg3 + this.field1280 - arg2 > this.field1296.length) {
                int var5;
                for (var5 = 1; var5 < (this.field1280 + arg1.field1280); var5 += var5) {
                }
                byte[] var6 = new byte[var5];
                class231.method1687(this.field1296, 0, var6, 0, this.field1280);
                this.field1296 = var6;
            }
            class231.method1687(arg1.field1296, arg2, this.field1296, this.field1280, arg3 - arg2);
            int var7 = -76 % ((arg0 + 51) / 56);
            this.field1280 += arg3 - arg2;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "(I)Z", line = 1238)
    public final boolean method643(int arg0) {
        field1303++;
        if (arg0 != 10) {
            field1306 = (class77) null;
        }
        return this.method635(-80, 10);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BLjava/applet/Applet;)Lwa;", line = 1251)
    public final class75 method644(byte arg0, Applet arg1) {
        field1251++;
        String var3 = new String(this.field1296, 0, this.field1280);
        String var4 = arg1.getParameter(var3);
        if (var4 == null) {
            return null;
        } else if (arg0 == -25) {
            return class265.method1885((byte) -91, var4);
        } else {
            return (class75) null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IBI)Lwa;", line = 1275)
    public final class75 method645(int arg0, byte arg1, int arg2) {
        field1283++;
        byte var4 = (byte) arg2;
        byte var5 = (byte) arg0;
        class75 var6 = new class75();
        var6.field1280 = this.field1280;
        var6.field1296 = new byte[this.field1280];
        for (int var7 = 0; var7 < this.field1280; var7++) {
            byte var8 = this.field1296[var7];
            if (var5 == var8) {
                var6.field1296[var7] = var4;
            } else {
                var6.field1296[var7] = var8;
            }
        }
        if (arg1 != 34) {
            this.method650(-72, -38);
        }
        return var6;
    }

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "(I)Ljava/net/URL;", line = 1309)
    public final URL method646(int arg0) throws MalformedURLException {
        int var2 = 71 % ((41 - arg0) / 54);
        field1299++;
        return new URL(new String(this.field1296, 0, this.field1280));
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(B)I", line = 1318)
    public final int method647(byte arg0) {
        if (arg0 != -60) {
            this.method631((byte) 27, -35, -76, (Graphics) null);
        }
        field1297++;
        return this.method634(10, (byte) -117);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(Z)J", line = 1333)
    public final long method648(boolean arg0) {
        field1279++;
        long var2 = 0L;
        if (arg0) {
            this.method609(36, (class75) null);
        }
        for (int var4 = 0; var4 < this.field1280; var4++) {
            var2 = (var2 << 5) + (long) (this.field1296[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "(I)Lwa;", line = 1357)
    public final class75 method649(int arg0) {
        field1267++;
        int var2 = 0;
        int var3 = this.field1280;
        while (this.field1280 > var2 && (this.field1296[var2] >= 0 && this.field1296[var2] <= 32 || (this.field1296[var2] & 0xFF) == 160)) {
            var2++;
        }
        while (var3 > var2 && (this.field1296[var3 - 1] >= 0 && this.field1296[var3 - 1] <= 32 || (this.field1296[var3 - 1] & 0xFF) == 160)) {
            var3--;
        }
        if (var2 == 0 && this.field1280 == var3) {
            return this;
        }
        class75 var4 = new class75();
        var4.field1280 = var3 - var2;
        var4.field1296 = new byte[var4.field1280];
        if (arg0 != 255) {
            this.field1280 = 47;
        }
        for (int var5 = 0; var5 < var4.field1280; var5++) {
            var4.field1296[var5] = this.field1296[var2 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "(II)Lwa;", line = 1393)
    public final class75 method650(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method617(-3, 25);
        }
        field1314++;
        return this.method661(arg0 + 96, arg1, this.field1280);
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(B)V", line = 1405)
    public static void method651(byte arg0) {
        field1306 = null;
        int var1 = -51 % ((arg0 + 22) / 62);
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(Lwa;I)I", line = 1435)
    public final int method652(class75 arg0, int arg1) {
        field1312++;
        int var3 = 0;
        int var4 = 0;
        int var5 = arg0.field1280;
        int var6 = this.field1280;
        if (arg1 != -49) {
            field1293 = true;
        }
        int var7 = this.field1280;
        int var8 = arg0.field1280;
        int var9 = 0;
        int var10 = 0;
        while (var6 != 0 && var5 != 0) {
            if (var3 == 156 || var3 == 230) {
                var3 = 101;
            } else if (var3 == 140 || var3 == 198) {
                var3 = 69;
            } else if (var3 == 223) {
                var3 = 115;
            } else {
                var3 = this.field1296[var9] & 0xFF;
                var9++;
            }
            if (class214.method1575(arg1 + 30299, var3)) {
                var7++;
            } else {
                var6--;
            }
            if (var4 == 156 || var4 == 230) {
                var4 = 101;
            } else if (var4 == 140 || var4 == 198) {
                var4 = 69;
            } else if (var4 == 223) {
                var4 = 115;
            } else {
                var4 = arg0.field1296[var10] & 0xFF;
                var10++;
            }
            if (class214.method1575(30250, var4)) {
                var8++;
            } else {
                var5--;
            }
            if (class98.field1632[var3] < class98.field1632[var4]) {
                return -1;
            }
            if (class98.field1632[var3] > class98.field1632[var4]) {
                return 1;
            }
        }
        if (var7 >= var8) {
            return var7 <= var8 ? 0 : 1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IBLwa;)I", line = 1525)
    public final int method653(int arg0, byte arg1, class75 arg2) {
        field1254++;
        int[] var4 = new int[arg2.field1280];
        int[] var5 = new int[256];
        int[] var6 = new int[arg2.field1280];
        for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7] = arg2.field1280;
        }
        if (arg1 != -26) {
            return -62;
        }
        for (int var8 = 1; var8 <= arg2.field1280; var8++) {
            var4[var8 - 1] = (arg2.field1280 << 1) - var8;
            var5[class235.method1710(255, arg2.field1296[var8 - 1])] = arg2.field1280 - var8;
        }
        int var9 = arg2.field1280 + 1;
        for (int var10 = arg2.field1280; var10 > 0; var10--) {
            var6[var10 - 1] = var9;
            while (arg2.field1280 >= var9 && arg2.field1296[var9 - 1] != arg2.field1296[var10 - 1]) {
                if ((arg2.field1280 - var10) <= var4[var9 - 1]) {
                    var4[var9 - 1] = arg2.field1280 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var9--;
        }
        int var11 = var9;
        int var12 = 1;
        int var13 = arg2.field1280 + 1 - var9;
        int var14 = 0;
        int var15 = 1;
        while (var15 <= var13) {
            var6[var15 - 1] = var14;
            while (var14 >= 1 && arg2.field1296[var14 - 1] != arg2.field1296[var15 - 1]) {
                var14 = var6[var14 - 1];
            }
            var15++;
            var14++;
        }
        while (arg2.field1280 > var11) {
            for (int var16 = var12; var16 <= var11; var16++) {
                if ((var11 + arg2.field1280 - var16) <= var4[var16 - 1]) {
                    var4[var16 - 1] = arg2.field1280 + var11 - var16;
                }
            }
            var12 = var11 + 1;
            var11 += var13 - var6[var13 - 1];
            var13 = var6[var13 - 1];
        }
        int var18;
        for (int var17 = arg2.field1280 + arg0 - 1; var17 < this.field1280; var17 += Math.max(var5[this.field1296[var17] & 0xFF], var4[var18])) {
            for (var18 = arg2.field1280 - 1; var18 >= 0 && this.field1296[var17] == arg2.field1296[var18]; var18--) {
                var17--;
            }
            if (var18 == -1) {
                return var17 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "(II)[Lwa;", line = 1637)
    public final class75[] method654(int arg0, int arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1280; var4++) {
            if (this.field1296[var4] == arg1) {
                var3++;
            }
        }
        field1265++;
        class75[] var5 = new class75[var3 + 1];
        if (var3 == 0) {
            var5[0] = this;
            return var5;
        } else if (arg0 >= -110) {
            return (class75[]) null;
        } else {
            int var6 = 0;
            int var7 = 0;
            for (int var8 = 0; var8 < var3; var8++) {
                int var9;
                for (var9 = 0; this.field1296[var6 + var9] != arg1; var9++) {
                }
                var5[var7++] = this.method661(93, var6, var6 + var9);
                var6 += var9 + 1;
            }
            var5[var3] = this.method661(117, var6, this.field1280);
            return var5;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)I", line = 1692)
    public final int method655(byte arg0, int arg1) {
        field1268++;
        byte var3 = (byte) arg1;
        if (arg0 <= 58) {
            field1293 = false;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < this.field1280; var5++) {
            if (this.field1296[var5] == var3) {
                var4++;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "(I)V", line = 1731)
    public final void method656(int arg0) {
        String var2;
        try {
            var2 = new String(this.field1296, arg0, this.field1280, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field1296, 0, this.field1280);
        }
        System.out.println(var2);
        field1292++;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BLwa;)I", line = 1748)
    public final int method657(byte arg0, class75 arg1) {
        field1294++;
        return arg0 > -12 ? -42 : this.method653(0, (byte) -26, arg1);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/net/URL;I)Ljava/net/URL;", line = 1761)
    public final URL method658(URL arg0, int arg1) throws MalformedURLException {
        field1285++;
        return arg1 == 0 ? new URL(arg0, new String(this.field1296, 0, this.field1280)) : (URL) null;
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(Z)[B", line = 1778)
    public final byte[] method659(boolean arg0) {
        byte[] var2 = new byte[this.field1280];
        field1305++;
        class231.method1687(this.field1296, 0, var2, 0, this.field1280);
        return arg0 ? (byte[]) null : var2;
    }

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "(Lwa;I)Z", line = 1794)
    public final boolean method660(class75 arg0, int arg1) {
        field1270++;
        if (arg0 == null) {
            return false;
        }
        int var3 = -58 / ((arg1 + 65) / 51);
        if (this.field1280 != arg0.field1280) {
            return false;
        }
        if (!this.field1264 || !arg0.field1264) {
            if (this.field1290 == 0) {
                this.field1290 = this.method619(-91);
                if (this.field1290 == 0) {
                    this.field1290 = 1;
                }
            }
            if (arg0.field1290 == 0) {
                arg0.field1290 = arg0.method619(-91);
                if (arg0.field1290 == 0) {
                    arg0.field1290 = 1;
                }
            }
            if (this.field1290 != arg0.field1290) {
                return false;
            }
        }
        for (int var4 = 0; var4 < this.field1280; var4++) {
            if (this.field1296[var4] != arg0.field1296[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(III)Lwa;", line = 1850)
    public final class75 method661(int arg0, int arg1, int arg2) {
        field1269++;
        class75 var4 = new class75();
        var4.field1280 = arg2 - arg1;
        if (arg0 <= 78) {
            return (class75) null;
        } else {
            var4.field1296 = new byte[arg2 - arg1];
            class231.method1687(this.field1296, arg1, var4.field1296, 0, var4.field1280);
            return var4;
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(ILjava/applet/Applet;)Ljava/lang/Object;", line = 1878)
    public final Object method662(int arg0, Applet arg1) throws Throwable {
        field1298++;
        String var3 = new String(this.field1296, arg0, this.field1280);
        Object var4 = class1.method2(arg1, var3, (Object[]) null, 119);
        if (var4 instanceof String) {
            byte[] var5 = ((String) var4).getBytes();
            var4 = class191.method1442(var5.length, (byte) 108, 0, var5);
        }
        return var4;
    }
}
