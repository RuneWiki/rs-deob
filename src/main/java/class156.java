import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class156 {

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    private int field1934 = -1;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    private int field1929 = -1;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "Z")
    private boolean field1939 = false;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
    private int field1953 = -32768;

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "I")
    private int field1957 = -1;

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "Z")
    private boolean field1962 = false;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    public int field1952;

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
    public int field1961;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    private int field1932;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "B")
    private byte field1944;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
    private int field1937;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "B")
    private byte field1947;

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "I")
    public int field1960;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "Z")
    private boolean field1956;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    private int field1928;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    private int field1936;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    private int field1941;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "I")
    private int field1963;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "Ltp;")
    public class117 field1943;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "Lpq;")
    public static class159 field1931;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "Lw;")
    private class451 field1949;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "Lfq;")
    private class463 field1948;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "Lba;")
    private class629 field1945;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "[Z")
    private boolean[] field1933;

    @OriginalMember(owner = "client!kd", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() {
        field1938++;
        if (this.field1943 != null) {
            this.field1943.method712();
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)V", line = 13)
    private final void method1034(int arg0, int arg1, int arg2) {
        if (arg2 != 3337) {
            return;
        }
        field1955++;
        label92: while (true) {
            if (this.field1948 == null) {
                if (this.field1939) {
                    return;
                }
                this.method1043(-1, 0);
                if (this.field1948 == null) {
                    return;
                }
            }
            int var4 = class430.field5984 - this.field1936;
            if (var4 > 100 && this.field1948.field6332 > 0) {
                int var5 = this.field1948.field6307.length - this.field1948.field6332;
                while (var5 > this.field1963 && var4 > this.field1948.field6319[this.field1963]) {
                    var4 -= this.field1948.field6319[this.field1963];
                    this.field1963++;
                }
                if (var5 <= this.field1963) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field1948.field6307.length; var7++) {
                        var6 += this.field1948.field6319[var7];
                    }
                    var4 %= var6;
                }
                this.field1928 = this.field1963 + 1;
                if (this.field1928 >= this.field1948.field6307.length) {
                    this.field1928 -= this.field1948.field6332;
                    if (this.field1928 < 0 || this.field1928 >= this.field1948.field6307.length) {
                        this.field1928 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var4 <= this.field1948.field6319[this.field1963]) {
                            this.field1941 = var4;
                            this.field1936 = class430.field5984 - var4;
                            return;
                        }
                        class311.method1870(this.field1963, arg1, (byte) 1, false, arg0, this.field1948, this.field1944);
                        var4 -= this.field1948.field6319[this.field1963];
                        this.field1963++;
                        if (this.field1963 >= this.field1948.field6307.length) {
                            this.field1963 -= this.field1948.field6332;
                            if (this.field1963 < 0 || this.field1948.field6307.length <= this.field1963) {
                                this.field1948 = null;
                                continue label92;
                            }
                        }
                        this.field1928 = this.field1963 + 1;
                    } while (this.field1928 < this.field1948.field6307.length);
                    this.field1928 -= this.field1948.field6332;
                } while (this.field1928 >= 0 && this.field1928 < this.field1948.field6307.length);
                this.field1928 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)Lpca;", line = 116)
    public static final class315 method1035(int arg0, int arg1) {
        field1950++;
        class315 var2 = (class315) class367.field5272.method3134((long) arg1, -83);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = field1931.method1087(0, arg1, 1);
        if (arg0 < 30) {
            method1044(57, true, -60, 111, -26);
        }
        class315 var4 = new class315();
        if (var3 != null) {
            var4.method2031(new class138(var3), (byte) -128);
        }
        var4.method2035(255);
        class367.field5272.method3130((long) arg1, true, var4);
        return var4;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Loa;Luca;IIIIIIZI)V", line = 587)
    public class156(class689 arg0, class252 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field1952 = arg2;
        this.field1962 = arg8;
        this.field1961 = arg3;
        this.field1932 = arg6;
        this.field1944 = (byte) arg4;
        this.field1937 = arg7;
        this.field1947 = (byte) arg5;
        this.field1960 = arg1.field3456;
        this.field1956 = arg0.method1976() && arg1.field3413 && !this.field1962;
        if (arg9 != -1) {
            this.field1939 = true;
        }
        this.method1043(arg9, 0);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V", line = 152)
    public static void method1036(boolean arg0) {
        if (!arg0) {
            field1931 = null;
        }
        field1931 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILoa;)V", line = 162)
    public final void method1037(int arg0, class689 arg1) {
        field1959++;
        if (this.field1949 != null) {
            class477.method2673(this.field1949, this.field1947, this.field1932, this.field1937, this.field1933);
            this.field1933 = null;
            this.field1949 = null;
        }
        if (arg0 < 99) {
            this.method1037(34, null);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)I", line = 188)
    public final int method1038(byte arg0) {
        if (arg0 <= 23) {
            this.method1043(-105, -39);
        }
        field1946++;
        return this.field1953;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZIIIILoa;Z)Lba;", line = 199)
    public final class629 method1039(boolean arg0, int arg1, int arg2, int arg3, int arg4, class689 arg5, boolean arg6) {
        field1942++;
        class252 var8 = class578.field7980.method1746(this.field1960, (byte) 125);
        if (var8.field3391 != null) {
            var8 = var8.method1568(-1, class327.field4771);
        }
        if (var8 == null) {
            this.method1037(116, arg5);
            this.field1957 = -1;
            this.field1934 = -1;
            this.field1929 = -1;
            return null;
        }
        if (!this.field1939 && this.field1934 != var8.field3456) {
            this.field1945 = null;
            this.method1043(-1, 0);
        }
        this.method1034(arg2, arg3, arg4 + 3337);
        if (arg0) {
            boolean var9 = arg0 & this.field1956 & class72.field935.method2693(class161.field2038, (byte) 91) != 0;
            arg0 = var9 & (this.field1957 != var8.field3456 || this.field1948 != null && class72.field935.method2693(class161.field2038, (byte) 91) >= 2 && (this.field1963 != this.field1929 || (this.field1948.field6317 || class425.field5919) && this.field1963 != this.field1928));
        }
        if (arg4 != 0) {
            return null;
        } else if (arg6 && !arg0) {
            this.field1934 = var8.field3456;
            return null;
        } else {
            if (arg0) {
                class477.method2673(this.field1949, this.field1947, this.field1932, this.field1937, this.field1933);
                this.field1957 = -1;
                this.field1929 = -1;
            }
            class176 var10 = class397.field5666[this.field1947];
            class176 var11;
            if (this.field1962) {
                var11 = class249.field3345[0];
            } else {
                var11 = this.field1947 < 3 ? class397.field5666[this.field1947 + 1] : null;
            }
            class629 var12 = null;
            if (this.field1948 != null) {
                if (arg0) {
                    arg1 |= 0x40000;
                }
                var12 = var8.method1578(arg5, this.field1928, this.field1937, var11, var10.method159(this.field1932, this.field1937), var10, this.field1941, this.field1963, this.field1952 == 11 ? this.field1961 + 4 : this.field1961, arg1, this.field1952 == 11 ? 10 : this.field1952, this.field1932, this.field1948, 2);
                if (var12 == null) {
                    this.field1933 = null;
                    this.field1949 = null;
                    this.field1953 = 0;
                } else {
                    if (arg0) {
                        if (this.field1933 == null) {
                            this.field1933 = new boolean[4];
                        }
                        this.field1949 = var12.method692(this.field1949);
                        class105.method564(this.field1949, this.field1947, arg2, arg3, this.field1933);
                        this.field1957 = var8.field3456;
                        this.field1929 = this.field1963;
                    }
                    this.field1953 = var12.method686();
                }
                this.field1945 = null;
            } else if (this.field1945 != null && arg1 == (arg1 & this.field1945.method688()) && this.field1934 == var8.field3456) {
                var12 = this.field1945;
            } else {
                if (this.field1945 != null) {
                    arg1 |= this.field1945.method688();
                }
                class72 var13 = var8.method1564(var10, this.field1952 == 11 ? 10 : this.field1952, this.field1932, this.field1952 == 11 ? this.field1961 + 4 : this.field1961, 31302, arg5, this.field1937, arg0, var10.method159(this.field1932, this.field1937), var11, arg1);
                if (var13 == null) {
                    this.field1933 = null;
                    this.field1945 = null;
                    this.field1953 = 0;
                    this.field1949 = null;
                } else {
                    var12 = var13.field934;
                    this.field1945 = var13.field934;
                    if (arg0) {
                        this.field1933 = null;
                        this.field1949 = var13.field932;
                        class105.method564(this.field1949, this.field1947, arg2, arg3, null);
                        this.field1929 = -1;
                        this.field1957 = var8.field3456;
                    }
                    this.field1953 = var12.method686();
                }
            }
            this.field1937 = arg3;
            this.field1932 = arg2;
            this.field1934 = var8.field3456;
            return var12;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Loa;Lq;IILba;IIBZ)V", line = 337)
    public final void method1040(class689 arg0, class111 arg1, int arg2, int arg3, class629 arg4, int arg5, int arg6, byte arg7, boolean arg8) {
        field1940++;
        class594[] var10 = arg4.method653();
        class190[] var11 = arg4.method694();
        if ((this.field1943 == null || this.field1943.field1496) && (var10 != null || var11 != null)) {
            class252 var12 = class578.field7980.method1746(this.field1960, (byte) 64);
            if (var12.field3391 != null) {
                var12 = var12.method1568(-1, class327.field4771);
            }
            if (var12 != null) {
                this.field1943 = class117.method707(class430.field5984, true);
            }
        }
        if (arg7 >= -11) {
            this.field1953 = -28;
        }
        if (this.field1943 == null) {
            return;
        }
        arg4.method656(arg1);
        if (arg8) {
            this.field1943.method708(arg0, (long) class430.field5984, var10, var11, false);
        } else {
            this.field1943.method715((long) class430.field5984);
        }
        this.field1943.method718(this.field1944, arg5, arg2, arg6, arg3);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLoa;)V", line = 387)
    public final void method1041(byte arg0, class689 arg1) {
        field1954++;
        if (arg0 <= -81) {
            this.method1039(true, 262144, this.field1932, this.field1937, 0, arg1, true);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)Z", line = 404)
    public final boolean method1042(int arg0) {
        if (arg0 < 73) {
            return false;
        } else {
            field1930++;
            return this.field1956;
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)V", line = 415)
    private final void method1043(int arg0, int arg1) {
        field1935++;
        int var3 = arg0;
        boolean var4 = false;
        if (arg0 == -1) {
            class252 var5 = class578.field7980.method1746(this.field1960, (byte) 127);
            class252 var6 = var5;
            if (var5.field3391 != null) {
                var5 = var5.method1568(-1, class327.field4771);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field3393 != null) {
                if (this.field1948 != null && var5.method1573(-84, this.field1948.field6329)) {
                    return;
                }
                var3 = var5.method1574((byte) 39);
                if (this.field1934 != var5.field3456) {
                    var4 = var5.field3455;
                }
            } else if (var5.field3436 == -1) {
                if (var6 != null && var6.field3393 != null) {
                    if (this.field1948 != null && var6.method1573(-84, this.field1948.field6329)) {
                        return;
                    }
                    var3 = var6.method1574((byte) 39);
                    if (this.field1934 != var6.field3456) {
                        var4 = var6.field3455;
                    }
                } else if (var6 != null && var6.field3436 != -1 && this.field1934 != var6.field3456) {
                    var4 = var6.field3455;
                    var3 = var6.field3436;
                }
            } else if (this.field1934 != var5.field3456) {
                var4 = var5.field3455;
                var3 = var5.field3436;
            }
        }
        if (var3 == -1) {
            this.field1948 = null;
            return;
        }
        this.field1945 = null;
        if (this.field1948 == null || this.field1948.field6329 != var3) {
            this.field1948 = class77.field971.method776(var3, (byte) -109);
        } else if (this.field1948.field6314 == 0) {
            return;
        }
        if (this.field1948.field6307 == null) {
            this.field1948 = null;
            return;
        }
        if (var4) {
            this.field1963 = (int) (Math.random() * (double) this.field1948.field6307.length);
            this.field1941 = ((int) (Math.random() * (double) this.field1948.field6319[this.field1963])) + 1;
        } else {
            this.field1963 = 0;
            this.field1941 = 1;
        }
        this.field1928 = this.field1963 + 1;
        if (arg1 > this.field1928 || this.field1928 >= this.field1948.field6307.length) {
            this.field1928 = -1;
        }
        this.field1936 = class430.field5984 - this.field1941;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZIII)V", line = 538)
    public static final void method1044(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field1958++;
        class19 var5 = class364.method2236(1248116640, arg3, 10);
        var5.method110(12142);
        if (!arg1) {
            var5.field180 = arg4;
            var5.field173 = arg2;
            var5.field171 = arg0;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)V", line = 555)
    public final void method1045(byte arg0, int arg1) {
        this.field1939 = true;
        field1927++;
        if (arg0 > 18) {
            this.method1043(arg1, 0);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(FI)F", line = 567)
    public static final float method1046(float arg0, int arg1) {
        if (arg1 == 10) {
            field1951++;
            return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
        } else {
            return -0.38661346F;
        }
    }
}
