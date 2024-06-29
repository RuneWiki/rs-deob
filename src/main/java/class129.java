import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class129 {

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "Lqe;")
    private class298 field1931 = new class298();

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "Lqe;")
    private class298 field1933 = new class298();

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "Lqe;")
    private class298 field1934 = new class298();

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "Lqe;")
    private class298 field1935 = new class298();

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "Llb;")
    private class112 field1936 = new class112(4);

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "I")
    public volatile int field1943 = 0;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
    public volatile int field1942 = 0;

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "B")
    private byte field1940 = 0;

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "Llb;")
    private class112 field1941 = new class112(8);

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "Lok;")
    public static class41 field1918 = class137.method956("null", 45);

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field1909 = 0;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "Lok;")
    public static class41 field1928 = class137.method956(")3runescape)3com)4l=", 45);

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "Lok;")
    private static class41 field1927 = class137.method956("Close", 45);

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "[[Lvi;")
    public static class284[][] field1932 = new class284[13][13];

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "Lok;")
    public static class41 field1913 = class137.method956("Spielwelt erstellt)3", 45);

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "Lok;")
    public static class41 field1919 = field1927;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field1910 = 0;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
    public static int field1929 = 0;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "F")
    public static float field1915;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "I")
    private int field1937;

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "J")
    private long field1939;

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "Lke;")
    private class218 field1938;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "Lr;")
    private class255 field1944;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)Z", line = 8)
    public final boolean method898(boolean arg0) {
        if (arg0) {
            field1916++;
            return this.method899((byte) -18) >= 20;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)I", line = 19)
    public final int method899(byte arg0) {
        if (arg0 != -18) {
            this.field1942 = 16;
        }
        field1923++;
        return this.field1931.method2053((byte) 85) + this.field1933.method2053((byte) 85);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IBZII)Lr;", line = 36)
    public final class255 method900(int arg0, byte arg1, boolean arg2, int arg3, int arg4) {
        if (arg3 != 20) {
            this.field1938 = (class218) null;
        }
        field1920++;
        long var6 = (long) ((arg4 << 16) + arg0);
        class255 var8 = new class255();
        var8.field4097 = arg1;
        var8.field3585 = arg2;
        var8.field41 = var6;
        if (arg2) {
            if (this.method899((byte) -18) >= 20) {
                throw new RuntimeException();
            }
            this.field1931.method2055(var8, arg3 + 93);
        } else if (this.method910((byte) 60) < 20) {
            this.field1934.method2055(var8, arg3 ^ 0x50);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)Lok;", line = 77)
    public static final class41 method901(int arg0, int arg1) {
        if (arg1 != 3975) {
            method901(-40, -2);
        }
        field1914++;
        return class203.field3286[arg0].method275(false) > 0 ? class187.method1346(new class41[] { class306.field5129[arg0], class143.field2187, class203.field3286[arg0] }, 0) : class306.field5129[arg0];
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V", line = 93)
    public static void method902(int arg0) {
        int var1 = 99 % ((arg0 - 28) / 54);
        field1913 = null;
        field1927 = null;
        field1919 = null;
        field1918 = null;
        field1932 = (class284[][]) null;
        field1928 = null;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V", line = 107)
    public final void method903(byte arg0) {
        field1926++;
        if (arg0 <= -90 && this.field1938 != null) {
            this.field1938.method1570((byte) 37);
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)Z", line = 126)
    public final boolean method904(int arg0) {
        if (this.field1938 != null) {
            long var2 = class247.method1762(19166);
            int var4 = (int) (var2 - this.field1939);
            this.field1939 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field1937 += var4;
            if (this.field1937 > 30000) {
                try {
                    this.field1938.method1570((byte) 114);
                } catch (Exception var30) {
                }
                this.field1938 = null;
            }
        }
        field1922++;
        if (this.field1938 == null) {
            return this.method899((byte) -18) == 0 && this.method910((byte) 60) == 0;
        }
        try {
            this.field1938.method1574(-17368);
            for (class255 var6 = (class255) this.field1931.method2057(97); var6 != null; var6 = (class255) this.field1931.method2058(false)) {
                this.field1936.field1640 = 0;
                this.field1936.method797(1, -22096);
                this.field1936.method758(0, (int) var6.field41);
                this.field1938.method1572(67, 4, 0, this.field1936.field1607);
                this.field1933.method2055(var6, 63);
            }
            if (arg0 >= -62) {
                field1929 = -9;
            }
            for (class255 var7 = (class255) this.field1934.method2057(-90); var7 != null; var7 = (class255) this.field1934.method2058(false)) {
                this.field1936.field1640 = 0;
                this.field1936.method797(0, -22096);
                this.field1936.method758(0, (int) var7.field41);
                this.field1938.method1572(54, 4, 0, this.field1936.field1607);
                this.field1935.method2055(var7, 107);
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field1938.method1571(47);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field1937 = 0;
                byte var10 = 0;
                if (this.field1944 == null) {
                    var10 = 8;
                } else if (this.field1944.field4101 == 0) {
                    var10 = 1;
                }
                if (var10 <= 0) {
                    int var11 = this.field1944.field4093.field1607.length - this.field1944.field4097;
                    int var12 = 512 - this.field1944.field4101;
                    if (var11 - this.field1944.field4093.field1640 < var12) {
                        var12 = var11 - this.field1944.field4093.field1640;
                    }
                    if (var9 < var12) {
                        var12 = var9;
                    }
                    this.field1938.method1575(var12, 14574, this.field1944.field4093.field1640, this.field1944.field4093.field1607);
                    if (this.field1940 != 0) {
                        for (int var13 = 0; var13 < var12; var13++) {
                            this.field1944.field4093.field1607[this.field1944.field4093.field1640 + var13] = (byte) class26.method169(this.field1944.field4093.field1607[this.field1944.field4093.field1640 + var13], this.field1940);
                        }
                    }
                    this.field1944.field4101 += var12;
                    this.field1944.field4093.field1640 += var12;
                    if (this.field1944.field4093.field1640 == var11) {
                        this.field1944.method11(true);
                        this.field1944.field3590 = false;
                        this.field1944 = null;
                    } else if (this.field1944.field4101 == 512) {
                        this.field1944.field4101 = 0;
                    }
                } else {
                    int var14 = var10 - this.field1941.field1640;
                    if (var14 > var9) {
                        var14 = var9;
                    }
                    this.field1938.method1575(var14, 14574, this.field1941.field1640, this.field1941.field1607);
                    if (this.field1940 != 0) {
                        for (int var15 = 0; var15 < var14; var15++) {
                            this.field1941.field1607[this.field1941.field1640 + var15] = (byte) class26.method169(this.field1941.field1607[this.field1941.field1640 + var15], this.field1940);
                        }
                    }
                    this.field1941.field1640 += var14;
                    if (var10 <= this.field1941.field1640) {
                        if (this.field1944 == null) {
                            this.field1941.field1640 = 0;
                            int var16 = this.field1941.method792(2);
                            Object var17 = null;
                            int var18 = this.field1941.method759((byte) -29);
                            long var19 = (long) ((var16 << 16) + var18);
                            int var21 = this.field1941.method792(2);
                            int var22 = this.field1941.method779(-27100);
                            int var23 = var21 & 0x7F;
                            boolean var24 = (var21 & 0x80) != 0;
                            class255 var25;
                            if (var24) {
                                for (var25 = (class255) this.field1935.method2057(-109); var25 != null && var25.field41 != var19; var25 = (class255) this.field1935.method2058(false)) {
                                }
                            } else {
                                for (var25 = (class255) this.field1933.method2057(-43); var25 != null && var25.field41 != var19; var25 = (class255) this.field1933.method2058(false)) {
                                }
                            }
                            if (var25 == null) {
                                throw new IOException();
                            }
                            int var26 = var23 == 0 ? 5 : 9;
                            this.field1944 = var25;
                            this.field1944.field4093 = new class112(this.field1944.field4097 + var26 + var22);
                            this.field1944.field4093.method797(var23, -22096);
                            this.field1944.field4093.method787(853918096, var22);
                            this.field1944.field4101 = 8;
                            this.field1941.field1640 = 0;
                        } else if (this.field1944.field4101 != 0) {
                            throw new IOException();
                        } else if (this.field1941.field1607[0] == -1) {
                            this.field1944.field4101 = 1;
                            this.field1941.field1640 = 0;
                        } else {
                            this.field1944 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var31) {
            try {
                this.field1938.method1570((byte) -109);
            } catch (Exception var29) {
            }
            this.field1938 = null;
            this.field1943++;
            this.field1942 = -2;
            return this.method899((byte) -18) == 0 && this.method910((byte) 60) == 0;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I[S)[S", line = 402)
    public static final short[] method905(int arg0, short[] arg1) {
        field1912++;
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class21.method140(arg1, 0, var2, arg0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)Z", line = 417)
    public final boolean method906(int arg0) {
        if (arg0 > -6) {
            return true;
        } else {
            field1925++;
            return this.method910((byte) 60) >= 20;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BZ)V", line = 429)
    public final void method907(byte arg0, boolean arg1) {
        field1911++;
        if (this.field1938 == null) {
            return;
        }
        try {
            this.field1936.field1640 = 0;
            this.field1936.method797(arg1 ? 2 : 3, -22096);
            this.field1936.method758(0, 0);
            this.field1938.method1572(-104, 4, 0, this.field1936.field1607);
            if (arg0 != -118) {
                this.field1933 = (class298) null;
            }
        } catch (IOException var6) {
            try {
                this.field1938.method1570((byte) -114);
            } catch (Exception var5) {
            }
            this.field1943++;
            this.field1942 = -2;
            this.field1938 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)V", line = 459)
    public final void method908(int arg0) {
        field1907++;
        try {
            this.field1938.method1570((byte) 119);
            if (arg0 != 8) {
                this.field1944 = (class255) null;
            }
        } catch (Exception var3) {
        }
        this.field1938 = null;
        this.field1943++;
        this.field1940 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field1942 = -1;
    }

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)V", line = 488)
    public final void method909(int arg0) {
        field1930++;
        if (this.field1938 == null) {
            return;
        }
        int var2 = 49 / ((-arg0 - 28) / 60);
        try {
            this.field1936.field1640 = 0;
            this.field1936.method797(7, -22096);
            this.field1936.method758(0, 0);
            this.field1938.method1572(104, 4, 0, this.field1936.field1607);
        } catch (IOException var6) {
            try {
                this.field1938.method1570((byte) -127);
            } catch (Exception var5) {
            }
            this.field1942 = -2;
            this.field1943++;
            this.field1938 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)I", line = 520)
    private final int method910(byte arg0) {
        field1917++;
        if (arg0 != 60) {
            this.field1941 = (class112) null;
        }
        return this.field1934.method2053((byte) 85) + this.field1935.method2053((byte) 85);
    }

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V", line = 533)
    private final void method911(int arg0) {
        field1924++;
        if (this.field1938 == null) {
            return;
        }
        try {
            this.field1936.field1640 = 0;
            this.field1936.method797(6, -22096);
            this.field1936.method758(arg0, 3);
            this.field1938.method1572(110, 4, arg0, this.field1936.field1607);
        } catch (IOException var5) {
            try {
                this.field1938.method1570((byte) 67);
            } catch (Exception var4) {
            }
            this.field1938 = null;
            this.field1942 = -2;
            this.field1943++;
        }
    }

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "(I)V", line = 565)
    public final void method912(int arg0) {
        if (this.field1938 != null) {
            this.field1938.method1568(90);
        }
        field1921++;
        int var2 = 115 / ((85 - arg0) / 36);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lke;IZ)V", line = 590)
    public final void method913(class218 arg0, int arg1, boolean arg2) {
        field1908++;
        if (this.field1938 != null) {
            try {
                this.field1938.method1570((byte) -82);
            } catch (Exception var11) {
            }
            this.field1938 = null;
        }
        if (arg1 < 115) {
            this.method903((byte) -20);
        }
        this.field1938 = arg0;
        this.method911(0);
        this.method907((byte) -118, arg2);
        this.field1944 = null;
        this.field1941.field1640 = 0;
        while (true) {
            class255 var5 = (class255) this.field1933.method2059(false);
            if (var5 == null) {
                while (true) {
                    class255 var6 = (class255) this.field1935.method2059(false);
                    if (var6 == null) {
                        if (this.field1940 != 0) {
                            try {
                                this.field1936.field1640 = 0;
                                this.field1936.method797(4, -22096);
                                this.field1936.method797(this.field1940, -22096);
                                this.field1936.method778(0, (byte) -4);
                                this.field1938.method1572(50, 4, 0, this.field1936.field1607);
                            } catch (IOException var10) {
                                try {
                                    this.field1938.method1570((byte) 63);
                                } catch (Exception var9) {
                                }
                                this.field1938 = null;
                                this.field1942 = -2;
                                this.field1943++;
                            }
                        }
                        this.field1937 = 0;
                        this.field1939 = class247.method1762(19166);
                        return;
                    }
                    this.field1934.method2055(var6, 64);
                }
            }
            this.field1931.method2055(var5, 79);
        }
    }
}
