import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class167 {

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "Z")
    public boolean field1937 = false;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public int field1935 = -1;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
    private int field1944 = 128;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    private int field1938 = 128;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
    private int field1945 = 0;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "Z")
    public boolean field1940 = false;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "I")
    private int field1952 = 0;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "I")
    private int field1957 = 0;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "Z")
    public static boolean field1948 = true;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "S")
    public static short field1951 = 205;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "Ltn;")
    public static class371 field1955 = null;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
    private int field1953;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "I")
    public int field1954;

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "Ljava/awt/Frame;")
    public static Frame field1942;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "[S")
    private short[] field1946;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "[S")
    private short[] field1947;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "[S")
    private short[] field1949;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "[S")
    private short[] field1956;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V", line = 6)
    public static final void method1060(byte arg0) {
        class365 var1 = class263.field3379;
        synchronized (class263.field3379) {
            class263.field3379.method2290(13831);
            int var2 = -49 % ((arg0 + 1) / 52);
        }
        field1958++;
        class365 var3 = class20.field219;
        synchronized (class20.field219) {
            class20.field219.method2290(13831);
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)V", line = 21)
    public static final void method1061(byte arg0) {
        class392.field5344.method2298(0);
        if (arg0 >= 123) {
            field1936++;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIILuo;)Lge;", line = 34)
    public final class386 method1062(int arg0, int arg1, int arg2, int arg3, int arg4, class118 arg5) {
        field1941++;
        int var7 = arg2;
        class156 var8 = this.field1935 == -1 || arg4 == -1 ? null : class430.method2621((byte) -94, this.field1935);
        if (var8 != null) {
            var7 = arg2 | var8.method1001(arg4, false, arg3, true);
        }
        if (this.field1938 != 128) {
            var7 |= 0x2;
        }
        if (this.field1944 != 128 || this.field1952 != 0) {
            var7 |= 0x5;
        }
        class365 var9 = class264.field3384;
        class386 var10;
        synchronized (class264.field3384) {
            var10 = (class386) class264.field3384.method2295((long) (this.field1954 |= arg5.field1360 << 29), (byte) 74);
        }
        if (var10 == null || arg5.method721(var10.method1465(), var7) != 0) {
            if (var10 != null) {
                var7 = arg5.method707(var7, var10.method1465());
            }
            int var11 = var7;
            if (this.field1947 != null) {
                var11 = var7 | 0x2000;
            }
            if (this.field1956 != null) {
                var11 |= 0x4000;
            }
            class402 var12 = class147.method952((byte) -81, this.field1953, class240.field3158, 0);
            if (var12 == null) {
                return null;
            }
            var10 = arg5.method701(var12, var11, class40.field477, this.field1957 + 64, this.field1945 + 850);
            if (this.field1947 != null) {
                for (int var13 = 0; var13 < this.field1947.length; var13++) {
                    var10.method1463(this.field1947[var13], this.field1946[var13]);
                }
            }
            if (this.field1956 != null) {
                for (int var14 = 0; var14 < this.field1956.length; var14++) {
                    var10.method1478(this.field1956[var14], this.field1949[var14]);
                }
            }
            var10.method1460(var7);
            class365 var15 = class264.field3384;
            synchronized (class264.field3384) {
                class264.field3384.method2294(var10, (byte) 91, (long) (this.field1954 |= arg5.field1360 << 29));
            }
        }
        class386 var16 = var8 == null ? var10.method1459((byte) 2, var7, true) : var8.method1000(arg4, arg0, (byte) 2, 0, arg3, 81, var10, var7);
        if (this.field1944 != arg1 || this.field1938 != 128) {
            var16.method1467(this.field1944, this.field1938, this.field1944);
        }
        if (this.field1952 != 0) {
            if (this.field1952 == 90) {
                var16.method1487(4096);
            }
            if (this.field1952 == 180) {
                var16.method1487(8192);
            }
            if (this.field1952 == 270) {
                var16.method1487(12288);
            }
        }
        var16.method1460(arg2);
        return var16;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V", line = 146)
    public static final void method1063(int arg0) {
        field1950++;
        class157.field1828.method2298(0);
        class373.field5051.method2298(0);
        if (arg0 >= -112) {
            method1065(62);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILbg;)V", line = 158)
    public final void method1064(int arg0, class242 arg1) {
        if (arg0 != -5207) {
            this.field1940 = false;
        }
        field1934++;
        while (true) {
            int var3 = arg1.method1563(-128);
            if (var3 == 0) {
                return;
            }
            this.method1067(arg1, -118, var3);
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V", line = 183)
    public static void method1065(int arg0) {
        if (arg0 != -7524) {
            field1948 = false;
        }
        field1955 = null;
        field1942 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBIIII)V", line = 210)
    public static final void method1066(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 86) {
            method1063(-71);
        }
        int var10001 = arg1 + 10;
        int var9 = arg2 + 1;
        class384.method2394(arg3, var10001, class228.field2877[arg2], arg5, arg4);
        field1943++;
        int var8 = arg0 - 1;
        class384.method2394(arg3, 103, class228.field2877[arg0], arg5, arg4);
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class228.field2877[var6];
            var7[arg4] = var7[arg5] = arg3;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lbg;II)V", line = 263)
    private final void method1067(class242 arg0, int arg1, int arg2) {
        field1939++;
        int var4 = -101 % ((arg1 + 46) / 39);
        if (arg2 == 1) {
            this.field1953 = arg0.method1587((byte) -102);
        } else if (arg2 == 2) {
            this.field1935 = arg0.method1587((byte) -102);
        } else if (arg2 == 4) {
            this.field1944 = arg0.method1587((byte) -102);
        } else if (arg2 == 5) {
            this.field1938 = arg0.method1587((byte) -102);
        } else if (arg2 == 6) {
            this.field1952 = arg0.method1587((byte) -102);
        } else if (arg2 == 7) {
            this.field1957 = arg0.method1563(-128);
        } else if (arg2 == 8) {
            this.field1945 = arg0.method1563(-128);
        } else if (arg2 == 9) {
            this.field1940 = true;
        } else if (arg2 == 10) {
            this.field1937 = true;
        } else if (arg2 == 40) {
            int var7 = arg0.method1563(-128);
            this.field1946 = new short[var7];
            this.field1947 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1947[var8] = (short) arg0.method1587((byte) -102);
                this.field1946[var8] = (short) arg0.method1587((byte) -102);
            }
        } else if (arg2 == 41) {
            int var5 = arg0.method1563(-128);
            this.field1956 = new short[var5];
            this.field1949 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1956[var6] = (short) arg0.method1587((byte) -102);
                this.field1949[var6] = (short) arg0.method1587((byte) -102);
            }
            return;
        }
    }
}
