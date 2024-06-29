import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class647 {

    @OriginalMember(owner = "client!ww", name = "h", descriptor = "Z")
    public boolean field9097 = true;

    @OriginalMember(owner = "client!ww", name = "i", descriptor = "I")
    private int field9098 = -1;

    @OriginalMember(owner = "client!ww", name = "r", descriptor = "I")
    public int field9107 = -1;

    @OriginalMember(owner = "client!ww", name = "o", descriptor = "I")
    private int field9104 = -1;

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "I")
    public int field9091 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ww", name = "v", descriptor = "I")
    private int field9111 = -1;

    @OriginalMember(owner = "client!ww", name = "A", descriptor = "I")
    private int field9116 = -1;

    @OriginalMember(owner = "client!ww", name = "x", descriptor = "I")
    public int field9113 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "I")
    public int field9092 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ww", name = "z", descriptor = "I")
    public int field9115 = -1;

    @OriginalMember(owner = "client!ww", name = "B", descriptor = "Z")
    public boolean field9117 = true;

    @OriginalMember(owner = "client!ww", name = "J", descriptor = "Z")
    public boolean field9125 = false;

    @OriginalMember(owner = "client!ww", name = "L", descriptor = "I")
    public int field9127 = -1;

    @OriginalMember(owner = "client!ww", name = "H", descriptor = "I")
    private int field9123 = -1;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "Z")
    public boolean field9090 = true;

    @OriginalMember(owner = "client!ww", name = "e", descriptor = "I")
    public int field9094 = 0;

    @OriginalMember(owner = "client!ww", name = "D", descriptor = "[Ljava/lang/String;")
    public String[] field9119 = new String[5];

    @OriginalMember(owner = "client!ww", name = "C", descriptor = "I")
    public int field9118 = -1;

    @OriginalMember(owner = "client!ww", name = "P", descriptor = "I")
    public int field9131 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ww", name = "d", descriptor = "I")
    private int field9093;

    @OriginalMember(owner = "client!ww", name = "g", descriptor = "I")
    public static int field9096;

    @OriginalMember(owner = "client!ww", name = "k", descriptor = "I")
    public static int field9100;

    @OriginalMember(owner = "client!ww", name = "l", descriptor = "I")
    private int field9101;

    @OriginalMember(owner = "client!ww", name = "m", descriptor = "I")
    public static int field9102;

    @OriginalMember(owner = "client!ww", name = "n", descriptor = "I")
    public static int field9103;

    @OriginalMember(owner = "client!ww", name = "p", descriptor = "I")
    public int field9105;

    @OriginalMember(owner = "client!ww", name = "s", descriptor = "I")
    private int field9108;

    @OriginalMember(owner = "client!ww", name = "t", descriptor = "I")
    public static int field9109;

    @OriginalMember(owner = "client!ww", name = "u", descriptor = "I")
    public static int field9110;

    @OriginalMember(owner = "client!ww", name = "w", descriptor = "I")
    public int field9112;

    @OriginalMember(owner = "client!ww", name = "y", descriptor = "I")
    public static int field9114;

    @OriginalMember(owner = "client!ww", name = "E", descriptor = "I")
    public int field9120;

    @OriginalMember(owner = "client!ww", name = "F", descriptor = "I")
    public static int field9121;

    @OriginalMember(owner = "client!ww", name = "G", descriptor = "I")
    public int field9122;

    @OriginalMember(owner = "client!ww", name = "K", descriptor = "I")
    public static int field9126;

    @OriginalMember(owner = "client!ww", name = "M", descriptor = "I")
    private int field9128;

    @OriginalMember(owner = "client!ww", name = "N", descriptor = "I")
    public static int field9129;

    @OriginalMember(owner = "client!ww", name = "Q", descriptor = "I")
    public int field9132;

    @OriginalMember(owner = "client!ww", name = "R", descriptor = "I")
    public int field9133;

    @OriginalMember(owner = "client!ww", name = "f", descriptor = "Law;")
    public class672 field9095;

    @OriginalMember(owner = "client!ww", name = "I", descriptor = "Lil;")
    private class68 field9124;

    @OriginalMember(owner = "client!ww", name = "j", descriptor = "Ljava/lang/String;")
    public String field9099;

    @OriginalMember(owner = "client!ww", name = "q", descriptor = "Ljava/lang/String;")
    public String field9106;

    @OriginalMember(owner = "client!ww", name = "O", descriptor = "[I")
    public int[] field9130;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILr;)Lf;")
    public final class536 method3615(int arg0, class566 arg1) {
        field9096++;
        if (arg0 >= -59) {
            this.method3618(112, null, (byte) -61);
        }
        class536 var3 = (class536) this.field9095.field9463.method2418((long) (this.field9116 | 0x20000 | arg1.field7890 << 29), (byte) 100);
        if (var3 != null) {
            return var3;
        }
        this.field9095.field9453.method3368(1912, this.field9116);
        class661 var4 = class661.method3715(this.field9095.field9453, this.field9116, 0);
        if (var4 != null) {
            var3 = arg1.method1072(var4, true);
            this.field9095.field9463.method2409((long) (arg1.field7890 << 29 | 0x20000 | this.field9116), var3, 1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
    public final String method3616(int arg0, String arg1, int arg2) {
        field9129++;
        if (this.field9124 == null) {
            return arg1;
        }
        if (arg0 <= 77) {
            this.field9107 = 55;
        }
        class103 var4 = (class103) this.field9124.method399(-32748, (long) arg2);
        return var4 == null ? arg1 : var4.field1388;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lhaa;Z)Z")
    public final boolean method3617(class79 arg0, boolean arg1) {
        field9109++;
        int var3;
        if (this.field9104 == -1) {
            if (this.field9111 == -1) {
                return true;
            }
            var3 = arg0.method465(117, this.field9111);
        } else {
            var3 = arg0.method466(this.field9104, -99);
        }
        if (this.field9093 > var3 || var3 > this.field9101) {
            return false;
        }
        if (arg1) {
            this.field9122 = -128;
        }
        boolean var4 = false;
        int var5;
        if (this.field9123 == -1) {
            if (this.field9098 == -1) {
                return true;
            }
            var5 = arg0.method465(115, this.field9098);
        } else {
            var5 = arg0.method466(this.field9123, -127);
        }
        return var5 >= this.field9108 && this.field9128 >= var5;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILes;B)V")
    private final void method3618(int arg0, class630 arg1, byte arg2) {
        field9103++;
        if (arg0 == 1) {
            this.field9127 = arg1.method3470(13111);
        } else if (arg0 == 2) {
            this.field9107 = arg1.method3470(13111);
        } else if (arg0 == 3) {
            this.field9106 = arg1.method3500((byte) 127);
        } else if (arg0 == 4) {
            this.field9120 = arg1.method3517(-1);
        } else if (arg0 == 5) {
            this.field9115 = arg1.method3517(-1);
        } else if (arg0 == 6) {
            this.field9094 = arg1.method3501(-9268);
        } else if (arg0 == 7) {
            int var4 = arg1.method3501(-9268);
            if ((var4 & 0x2) == 2) {
                this.field9125 = true;
            }
            if ((var4 & 0x1) == 0) {
                this.field9090 = false;
            }
        } else if (arg0 == 8) {
            this.field9117 = arg1.method3501(-9268) == 1;
        } else if (arg0 == 9) {
            this.field9111 = arg1.method3470(13111);
            if (this.field9111 == 65535) {
                this.field9111 = -1;
            }
            this.field9104 = arg1.method3470(13111);
            if (this.field9104 == 65535) {
                this.field9104 = -1;
            }
            this.field9093 = arg1.method3483(72);
            this.field9101 = arg1.method3483(101);
        } else if (arg0 >= 10 && arg0 <= 14) {
            this.field9119[arg0 - 10] = arg1.method3500((byte) 123);
        } else if (arg0 == 15) {
            int var5 = arg1.method3501(-9268);
            this.field9130 = new int[var5 * 2];
            for (int var6 = 0; var6 < var5 * 2; var6++) {
                this.field9130[var6] = arg1.method3510(127);
            }
            this.field9133 = arg1.method3483(115);
            this.field9132 = arg1.method3483(82);
        } else if (arg0 == 16) {
            this.field9097 = false;
        } else if (arg0 == 17) {
            this.field9099 = arg1.method3500((byte) 123);
        } else if (arg0 == 18) {
            this.field9116 = arg1.method3470(13111);
        } else if (arg0 == 19) {
            this.field9118 = arg1.method3470(13111);
        } else if (arg0 == 20) {
            this.field9098 = arg1.method3470(13111);
            if (this.field9098 == 65535) {
                this.field9098 = -1;
            }
            this.field9123 = arg1.method3470(13111);
            if (this.field9123 == 65535) {
                this.field9123 = -1;
            }
            this.field9108 = arg1.method3483(90);
            this.field9128 = arg1.method3483(109);
        } else if (arg0 == 21) {
            this.field9112 = arg1.method3483(75);
        } else if (arg0 == 22) {
            this.field9105 = arg1.method3483(77);
        } else if (arg0 == 249) {
            int var7 = arg1.method3501(-9268);
            if (this.field9124 == null) {
                int var8 = class391.method2101(var7, 128);
                this.field9124 = new class68(var8);
            }
            for (int var9 = 0; var9 < var7; var9++) {
                boolean var10 = arg1.method3501(-9268) == 1;
                int var11 = arg1.method3517(-1);
                class329 var12;
                if (var10) {
                    var12 = new class103(arg1.method3500((byte) 115));
                } else {
                    var12 = new class262(arg1.method3483(116));
                }
                this.field9124.method402(var12, (byte) -48, (long) var11);
            }
        }
        if (arg2 <= 75) {
            this.method3618(28, null, (byte) -5);
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILr;Z)Lf;")
    public final class536 method3619(int arg0, class566 arg1, boolean arg2) {
        field9121++;
        if (arg0 <= 34) {
            this.field9120 = -66;
        }
        int var4 = arg2 ? this.field9107 : this.field9127;
        int var5 = arg1.field7890 << 29 | var4;
        class536 var6 = (class536) this.field9095.field9463.method2418((long) var5, (byte) 100);
        if (var6 != null) {
            return var6;
        } else if (this.field9095.field9453.method3368(1912, var4)) {
            class661 var7 = class661.method3715(this.field9095.field9453, var4, 0);
            if (var7 != null) {
                var6 = arg1.method1072(var7, true);
                this.field9095.field9463.method2409((long) var5, var6, 1);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILes;)V")
    public final void method3620(int arg0, class630 arg1) {
        if (arg0 != -1) {
            this.method3615(-84, null);
        }
        field9114++;
        while (true) {
            int var3 = arg1.method3501(-9268);
            if (var3 == 0) {
                return;
            }
            this.method3618(var3, arg1, (byte) 105);
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(I)V")
    public final void method3621(int arg0) {
        if (this.field9130 != null) {
            for (int var2 = 0; var2 < this.field9130.length; var2 += 2) {
                if (this.field9130[var2] < this.field9131) {
                    this.field9131 = this.field9130[var2];
                } else if (this.field9113 < this.field9130[var2]) {
                    this.field9113 = this.field9130[var2];
                }
                if (this.field9130[var2 + 1] < this.field9092) {
                    this.field9092 = this.field9130[var2 + 1];
                } else if (this.field9130[var2 + 1] > this.field9091) {
                    this.field9091 = this.field9130[var2 + 1];
                }
            }
        }
        if (arg0 >= -4) {
            this.field9095 = null;
        }
        field9100++;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIIIII)V")
    public static final void method3622(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field9102++;
        int var6 = arg4 - arg5;
        int var7 = arg0 - arg1;
        if (var6 == 0) {
            if (var7 != 0) {
                class396.method2125(arg0, (byte) 1, arg2, arg5, arg1);
            }
        } else if (var7 == 0) {
            class17.method116((byte) 78, arg1, arg4, arg5, arg2);
        } else if (arg3 == 9761) {
            int var8 = (var7 << 12) / var6;
            int var9 = arg1 - (arg5 * var8 >> 12);
            int var10;
            int var11;
            if (arg5 < class263.field3294) {
                var11 = var9 + (class263.field3294 * var8 >> 12);
                var10 = class263.field3294;
            } else if (arg5 > class314.field4052) {
                var10 = class314.field4052;
                var11 = (class314.field4052 * var8 >> 12) + var9;
            } else {
                var11 = arg1;
                var10 = arg5;
            }
            int var12;
            int var13;
            if (arg4 < class263.field3294) {
                var12 = class263.field3294;
                var13 = (class263.field3294 * var8 >> 12) + var9;
            } else if (class314.field4052 < arg4) {
                var12 = class314.field4052;
                var13 = var9 + (class314.field4052 * var8 >> 12);
            } else {
                var12 = arg4;
                var13 = arg0;
            }
            if (class289.field3595 > var13) {
                var12 = (class289.field3595 - var9 << 12) / var8;
                var13 = class289.field3595;
            } else if (class159.field2063 < var13) {
                var12 = (class159.field2063 - var9 << 12) / var8;
                var13 = class159.field2063;
            }
            if (var11 < class289.field3595) {
                var11 = class289.field3595;
                var10 = (class289.field3595 - var9 << 12) / var8;
            } else if (class159.field2063 < var11) {
                var11 = class159.field2063;
                var10 = (class159.field2063 - var9 << 12) / var8;
            }
            class138.method790(var13, var12, var11, false, arg2, var10);
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(BII)I")
    public final int method3623(byte arg0, int arg1, int arg2) {
        if (arg0 != 26) {
            return -66;
        }
        field9110++;
        if (this.field9124 == null) {
            return arg2;
        } else {
            class262 var4 = (class262) this.field9124.method399(-32748, (long) arg1);
            return var4 == null ? arg2 : var4.field3229;
        }
    }
}
