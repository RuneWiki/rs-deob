import java.util.Random;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class120 extends class104 {

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "[J")
    private long[] field1963 = new long[10];

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    private int field1966 = 1;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "I")
    private int field1971 = 256;

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "I")
    private int field1973 = 0;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "J")
    private long field1969 = class59.method407(-65);

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1957 = new CRC32();

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "Ljava/util/Random;")
    public static Random field1972 = new Random();

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "Z")
    public static boolean field1974 = false;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "I")
    private int field1967;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)Ldb;")
    public static final class252 method817(int arg0, int arg1) {
        class252 var2 = (class252) class139.field2445.method1499(0, (long) arg1);
        if (arg0 != 1) {
            method820(12, 44, (byte) -97);
        }
        field1968++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = client.field535.method1712(arg1, 0, arg0 - 2);
        } else {
            var3 = class26.field319.method1712(arg1 & 0x7FFF, 0, -1);
        }
        class252 var4 = new class252();
        if (var3 != null) {
            var4.method1666(new class112(var3), (byte) 107);
        }
        if (arg1 >= 32768) {
            var4.method1664(-116);
        }
        class139.field2445.method1502((byte) -18, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public final void method693(byte arg0) {
        field1956++;
        for (int var2 = 0; var2 < 10; var2++) {
            this.field1963[var2] = 0L;
        }
        int var3 = -55 % ((arg0 - 47) / 33);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILog;)V")
    public static final void method818(int arg0, class18 arg1) {
        arg1.field223 = arg1.field224;
        field1965++;
        if (arg1.field228 == 0) {
            arg1.field172 = 0;
            return;
        }
        if (arg1.field216 != -1 && arg1.field170 == 0) {
            class237 var2 = class213.method1370(-1, arg1.field216);
            if (arg1.field220 > 0 && var2.field4063 == 0) {
                arg1.field172++;
                return;
            }
            if (arg1.field220 <= 0 && var2.field4045 == 0) {
                arg1.field172++;
                return;
            }
        }
        int var3 = arg1.field190;
        int var4 = arg1.field166;
        int var5 = arg1.field206[arg1.field228 - 1] * 128 + arg1.field171 * 64;
        int var6 = arg1.field219[arg1.field228 - 1] * 128 + arg1.field171 * 64;
        if (var5 - var3 > 256 || var5 - var3 < -256 || var6 - var4 > 256 || var6 - var4 < -256) {
            arg1.field190 = var5;
            arg1.field166 = var6;
            return;
        }
        if (var5 <= var3) {
            if (var3 > var5) {
                if (var4 < var6) {
                    arg1.field193 = 768;
                } else if (var4 > var6) {
                    arg1.field193 = 256;
                } else {
                    arg1.field193 = 512;
                }
            } else if (var6 > var4) {
                arg1.field193 = 1024;
            } else if (var4 > var6) {
                arg1.field193 = 0;
            }
        } else if (var4 < var6) {
            arg1.field193 = 1280;
        } else if (var6 >= var4) {
            arg1.field193 = 1536;
        } else {
            arg1.field193 = 1792;
        }
        int var7 = arg1.field193 - arg1.field194 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg1.field196;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg1.field225;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg1.field192;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg1.field204;
        }
        if (var8 == -1) {
            var8 = arg1.field225;
        }
        arg1.field223 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg1 instanceof class222) {
            var10 = ((class222) arg1).field3814.field3198;
        }
        if (arg0 != -14187) {
            method820(60, -59, (byte) -93);
        }
        if (var10) {
            if (arg1.field194 != arg1.field193 && arg1.field181 == -1 && arg1.field179 != 0) {
                var9 = 2;
            }
            if (arg1.field228 > 2) {
                var9 = 6;
            }
            if (arg1.field228 > 3) {
                var9 = 8;
            }
            if (arg1.field172 > 0 && arg1.field228 > 1) {
                arg1.field172--;
                var9 = 8;
            }
        } else {
            if (arg1.field228 > 1) {
                var9 = 6;
            }
            if (arg1.field228 > 2) {
                var9 = 8;
            }
            if (arg1.field172 > 0 && arg1.field228 > 1) {
                var9 = 8;
                arg1.field172--;
            }
        }
        if (arg1.field162[arg1.field228 - 1]) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg1.field225 == arg1.field223 && arg1.field161 != -1) {
            arg1.field223 = arg1.field161;
        }
        if (var5 > var3) {
            arg1.field190 += var9;
            if (arg1.field190 > var5) {
                arg1.field190 = var5;
            }
        } else if (var5 < var3) {
            arg1.field190 -= var9;
            if (var5 > arg1.field190) {
                arg1.field190 = var5;
            }
        }
        if (var6 > var4) {
            arg1.field166 += var9;
            if (arg1.field166 > var6) {
                arg1.field166 = var6;
            }
        } else if (var4 > var6) {
            arg1.field166 -= var9;
            if (var6 > arg1.field166) {
                arg1.field166 = var6;
            }
        }
        if (arg1.field190 != var5 || arg1.field166 != var6) {
            return;
        }
        arg1.field228--;
        if (arg1.field220 > 0) {
            arg1.field220--;
            return;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)I")
    public static final int method819(int arg0, int arg1) {
        field1958++;
        if (arg0 != -545939608) {
            method818(103, null);
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIB)I")
    public static final int method820(int arg0, int arg1, byte arg2) {
        field1960++;
        if (arg1 == -1) {
            return 12345678;
        } else if (arg2 == -94) {
            int var3 = (arg1 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        } else {
            return -16;
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(II)Lpj;")
    public static final class230 method821(int arg0, int arg1) {
        int var2 = -104 / ((arg1 - 62) / 52);
        field1970++;
        class230 var3 = (class230) class17.field146.method1499(0, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 < 32768) {
            var4 = class114.field1867.method1712(arg0, 1, -1);
        } else {
            var4 = class153.field2653.method1712(arg0 & 0x7FFF, 1, -1);
        }
        class230 var5 = new class230();
        if (var4 != null) {
            var5.method1482((byte) -82, new class112(var4));
        }
        if (arg0 >= 32768) {
            var5.method1487(11560);
        }
        class17.field146.method1502((byte) -18, var5, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)I")
    public final int method695(int arg0, int arg1, int arg2) {
        int var4 = this.field1966;
        this.field1966 = 1;
        int var5 = this.field1971;
        field1962++;
        this.field1971 = 300;
        this.field1969 = class59.method407(-91);
        if (this.field1963[this.field1967] == 0L) {
            this.field1966 = var4;
            this.field1971 = var5;
        } else if (this.field1969 > this.field1963[this.field1967]) {
            this.field1971 = (int) ((long) (arg0 * 2560) / (this.field1969 - this.field1963[this.field1967]));
        }
        if (this.field1971 < 25) {
            this.field1971 = 25;
        }
        if (this.field1971 > 256) {
            this.field1971 = 256;
            this.field1966 = (int) ((long) arg0 - (this.field1969 - this.field1963[this.field1967]) / 10L);
        }
        if (arg1 != 3867493) {
            field1974 = false;
        }
        if (arg0 < this.field1966) {
            this.field1966 = arg0;
        }
        this.field1963[this.field1967] = this.field1969;
        this.field1967 = (this.field1967 + 1) % 10;
        if (this.field1966 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field1963[var6] != 0L) {
                    this.field1963[var6] += this.field1966;
                }
            }
        }
        if (this.field1966 < arg2) {
            this.field1966 = arg2;
        }
        class38.method259((long) this.field1966, 31644);
        int var7 = 0;
        while (this.field1973 < 256) {
            var7++;
            this.field1973 += this.field1971;
        }
        this.field1973 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)V")
    public static void method822(byte arg0) {
        field1957 = null;
        int var1 = 35 / ((76 - arg0) / 49);
        field1972 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILnh;)Lbg;")
    public static final class63 method823(int arg0, class112 arg1) {
        if (arg0 != -769) {
            field1957 = null;
        }
        field1964++;
        return new class63(arg1.method740(16711680), arg1.method740(arg0 + 16712449), arg1.method740(arg0 + 16712449), arg1.method740(16711680), arg1.method727(arg0 - 26850), arg1.method727(-27619), arg1.method758(true));
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
    public class120() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1963[var1] = this.field1969;
        }
    }
}
