import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class156 {

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "[J")
    private long[] field1985 = new long[8];

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "[J")
    private long[] field1981 = new long[8];

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "[B")
    private byte[] field1979 = new byte[64];

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "[J")
    private long[] field1977 = new long[8];

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "[J")
    private long[] field1982 = new long[8];

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "[J")
    private long[] field1986 = new long[8];

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    private int field1983 = 0;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    private int field1987 = 0;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "[B")
    private byte[] field1975 = new byte[32];

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1992 = new String[] { method1315(method1314("\u0019\\\u0017g\u0007")), method1315(method1314("<x~olPrkt`\"")), method1315(method1314("\u000b\u0019\u0017\bR")), method1315(method1314("\u001eBUJ")), method1315(method1314("\u0019\\\u0017d\u0007")), method1315(method1314("\u0019\\\u0017`\u0007")), method1315(method1314("\u0019\\\u0017c\u0007")), method1315(method1314("\u0019\\\u0017b\u0007")), method1315(method1314("\u0019\\\u0017e\u0007")) };

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "Lsb;")
    public static class261 field1973 = new class261(117, -2);

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "[I")
    public static int[] field1991 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "J")
    public static long field1989;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "Llga;")
    public static class47 field1990;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)V")
    private final void method1308(byte arg0) {
        try {
            int var2 = 0;
            int var3 = 0;
            while (var2 < 8) {
                this.field1977[var2] = class286.method2322(class286.method2322(class286.method2322(class286.method2322(class286.method2322(class532.method4024((long) this.field1979[var3 + 3] << 32, 0xFFL << 32), class286.method2322(class286.method2322((long) this.field1979[var3] << 56, class532.method4024((long) this.field1979[var3 + 1], 255L) << 48), class532.method4024((long) this.field1979[var3 + 2], 255L) << 40)), class532.method4024(255L, (long) this.field1979[var3 + 4]) << 24), class532.method4024(0xFFL << 16, (long) this.field1979[var3 + 5] << 16)), class532.method4024((long) this.field1979[var3 + 6], 255L) << 8), class532.method4024((long) this.field1979[var3 + 7], 255L));
                var3 += 8;
                var2++;
            }
            field1976++;
            for (int var4 = 0; var4 < 8; var4++) {
                this.field1985[var4] = class286.method2322(this.field1977[var4], this.field1986[var4] = this.field1982[var4]);
            }
            if (arg0 <= 23) {
                this.method1313((byte) 3);
            }
            for (int var5 = 1; var5 <= 10; var5++) {
                for (int var6 = 0; var6 < 8; var6++) {
                    this.field1981[var6] = 0L;
                    int var7 = 0;
                    int var8 = 56;
                    while (var7 < 8) {
                        this.field1981[var6] = class286.method2322(this.field1981[var6], class327.field4470[var7][class434.method3377((int) (this.field1986[class434.method3377(var6 - var7, 7)] >>> var8), 255)]);
                        var8 -= 8;
                        var7++;
                    }
                }
                for (int var9 = 0; var9 < 8; var9++) {
                    this.field1986[var9] = this.field1981[var9];
                }
                this.field1986[0] = class286.method2322(this.field1986[0], class327.field4474[var5]);
                for (int var10 = 0; var10 < 8; var10++) {
                    this.field1981[var10] = this.field1986[var10];
                    int var11 = 0;
                    int var12 = 56;
                    while (var11 < 8) {
                        this.field1981[var10] = class286.method2322(this.field1981[var10], class327.field4470[var11][class434.method3377(255, (int) (this.field1985[class434.method3377(var10 - var11, 7)] >>> var12))]);
                        var12 -= 8;
                        var11++;
                    }
                }
                for (int var13 = 0; var13 < 8; var13++) {
                    this.field1985[var13] = this.field1981[var13];
                }
            }
            for (int var14 = 0; var14 < 8; var14++) {
                this.field1982[var14] = class286.method2322(this.field1982[var14], class286.method2322(this.field1977[var14], this.field1985[var14]));
            }
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field1992[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([BIB)V")
    public final void method1309(byte[] arg0, int arg1, byte arg2) {
        try {
            field1984++;
            this.field1979[this.field1983] = (byte) class10.method71(this.field1979[this.field1983], 0x80 >>> class434.method3377(7, this.field1987));
            this.field1983++;
            if (this.field1983 > 32) {
                while (true) {
                    if (this.field1983 >= 64) {
                        this.method1308((byte) 103);
                        this.field1983 = 0;
                        break;
                    }
                    this.field1979[this.field1983++] = 0;
                }
            }
            while (this.field1983 < 32) {
                this.field1979[this.field1983++] = 0;
            }
            class569.method4247(this.field1975, 0, this.field1979, 32, 32);
            this.method1308((byte) 112);
            if (arg2 != -54) {
                field1973 = null;
            }
            int var4 = 0;
            int var5 = arg1;
            while (var4 < 8) {
                long var6 = this.field1982[var4];
                arg0[var5] = (byte) ((int) (var6 >>> 56));
                arg0[var5 + 1] = (byte) ((int) (var6 >>> 48));
                arg0[var5 + 2] = (byte) ((int) (var6 >>> 40));
                arg0[var5 + 3] = (byte) ((int) (var6 >>> 32));
                arg0[var5 + 4] = (byte) ((int) (var6 >>> 24));
                arg0[var5 + 5] = (byte) ((int) (var6 >>> 16));
                arg0[var5 + 6] = (byte) ((int) (var6 >>> 8));
                arg0[var5 + 7] = (byte) ((int) var6);
                var4++;
                var5 += 8;
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field1992[4] + (arg0 == null ? field1992[3] : field1992[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
    public static void method1310(int arg0) {
        try {
            field1973 = null;
            field1991 = null;
            if (arg0 != 1) {
                method1310(99);
            }
            field1990 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1992[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(JI[B)V")
    public final void method1311(long arg0, int arg1, byte[] arg2) {
        try {
            field1978++;
            int var5 = 0;
            int var6 = 8 - ((int) arg0 & 0x7) & 0x7;
            int var7 = this.field1987 & 0x7;
            long var8 = arg0;
            int var10 = 31;
            int var11 = 0;
            while (var10 >= 0) {
                int var12 = (this.field1975[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
                this.field1975[var10] = (byte) var12;
                var11 = var12 >>> 8;
                var8 >>>= 0x8;
                var10--;
            }
            while (arg0 > 8L) {
                int var13 = arg2[var5] << var6 & 0xFF | (arg2[var5 + 1] & 0xFF) >>> 8 - var6;
                if (var13 < 0 || var13 >= 256) {
                    throw new RuntimeException(field1992[1]);
                }
                this.field1979[this.field1983] = (byte) class10.method71(this.field1979[this.field1983], var13 >>> var7);
                this.field1987 += 8 - var7;
                this.field1983++;
                if (this.field1987 == 512) {
                    this.method1308((byte) 87);
                    this.field1987 = this.field1983 = 0;
                }
                this.field1979[this.field1983] = (byte) class434.method3377(255, var13 << 8 - var7);
                var5++;
                arg0 -= 8L;
                this.field1987 += var7;
            }
            if (arg1 == 256) {
                int var14;
                if (arg0 > 0L) {
                    var14 = arg2[var5] << var6 & 0xFF;
                    this.field1979[this.field1983] = (byte) class10.method71(this.field1979[this.field1983], var14 >>> var7);
                } else {
                    var14 = 0;
                }
                if (((long) var7 + arg0) >= 8L) {
                    this.field1987 += 8 - var7;
                    this.field1983++;
                    arg0 -= (8 - var7);
                    if (this.field1987 == 512) {
                        this.method1308((byte) 76);
                        this.field1987 = this.field1983 = 0;
                    }
                    this.field1979[this.field1983] = (byte) class434.method3377(255, var14 << 8 - var7);
                    this.field1987 += (int) arg0;
                } else {
                    this.field1987 = (int) ((long) this.field1987 + arg0);
                }
            }
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field1992[0] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field1992[3] : field1992[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)V")
    public static final void method1312(int arg0, int arg1) {
        try {
            class550.field8037.method2038(0, arg1);
            int var2 = -54 / ((30 - arg0) / 44);
            field1980++;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1992[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V")
    public final void method1313(byte arg0) {
        try {
            field1974++;
            if (arg0 != -32) {
                method1312(77, -44);
            }
            for (int var2 = 0; var2 < 32; var2++) {
                this.field1975[var2] = 0;
            }
            this.field1987 = this.field1983 = 0;
            this.field1979[0] = 0;
            for (int var3 = 0; var3 < 8; var3++) {
                this.field1982[var3] = 0L;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1992[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1314(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1315(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 112;
                    break;
                case 1:
                    var10005 = 55;
                    break;
                case 2:
                    var10005 = 57;
                    break;
                case 3:
                    var10005 = 38;
                    break;
                default:
                    var10005 = 47;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
