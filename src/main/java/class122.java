import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class122 extends class59 {

    @OriginalMember(owner = "client!vh", name = "J", descriptor = "I")
    private int field2042 = 0;

    @OriginalMember(owner = "client!vh", name = "O", descriptor = "I")
    private int field2047 = 0;

    @OriginalMember(owner = "client!vh", name = "K", descriptor = "I")
    private int field2043 = 0;

    @OriginalMember(owner = "client!vh", name = "M", descriptor = "I")
    public static int field2045 = -1;

    @OriginalMember(owner = "client!vh", name = "L", descriptor = "Lph;")
    public static class229 field2044 = class266.method1858("(Udns", 0);

    @OriginalMember(owner = "client!vh", name = "P", descriptor = "J")
    public static long field2048 = 0L;

    @OriginalMember(owner = "client!vh", name = "cb", descriptor = "Lph;")
    public static class229 field2060 = class266.method1858("<col=ffb000>", 0);

    @OriginalMember(owner = "client!vh", name = "R", descriptor = "Lfe;")
    public static class97 field2049 = new class97(16);

    @OriginalMember(owner = "client!vh", name = "gb", descriptor = "Lph;")
    public static class229 field2064 = class266.method1858("Spieler kann nicht gefunden werden: ", 0);

    @OriginalMember(owner = "client!vh", name = "I", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!vh", name = "N", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!vh", name = "S", descriptor = "I")
    private int field2050;

    @OriginalMember(owner = "client!vh", name = "T", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!vh", name = "U", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!vh", name = "V", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!vh", name = "W", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!vh", name = "X", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!vh", name = "Y", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!vh", name = "Z", descriptor = "I")
    private int field2057;

    @OriginalMember(owner = "client!vh", name = "ab", descriptor = "I")
    private int field2058;

    @OriginalMember(owner = "client!vh", name = "bb", descriptor = "I")
    private int field2059;

    @OriginalMember(owner = "client!vh", name = "db", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!vh", name = "eb", descriptor = "I")
    private int field2062;

    @OriginalMember(owner = "client!vh", name = "fb", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!vh", name = "hb", descriptor = "I")
    private int field2065;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)[[I", line = 8)
    public final int[][] method116(int arg0, int arg1) {
        field2055++;
        int[][] var3 = this.field838.method1796(true, arg0);
        if (arg1 != 4588) {
            this.field2059 = -69;
        }
        if (this.field838.field4334) {
            int[][] var4 = this.method397(1, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class293.field4789; var11++) {
                this.method907(var6[var11], var7[var11], var5[var11], -91);
                this.field2062 += this.field2043;
                if (this.field2062 < 0) {
                    this.field2062 = 0;
                }
                this.field2050 += this.field2042;
                this.field2059 += this.field2047;
                if (this.field2059 < 0) {
                    this.field2059 = 0;
                }
                if (this.field2062 > 4096) {
                    this.field2062 = 4096;
                }
                while (this.field2050 < 0) {
                    this.field2050 += 4096;
                }
                if (this.field2059 > 4096) {
                    this.field2059 = 4096;
                }
                while (this.field2050 > 4096) {
                    this.field2050 -= 4096;
                }
                this.method908(this.field2062, this.field2050, this.field2059, -260679956);
                var10[var11] = this.field2065;
                var8[var11] = this.field2058;
                var9[var11] = this.field2057;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V", line = 405)
    public class122() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIII)V", line = 98)
    public static final void method905(int arg0, int arg1, int arg2, int arg3) {
        class72 var4 = class225.field3705[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class88 var5 = var4.field1214;
        if (var5 != null) {
            var5.field1487 = var5.field1487 * arg3 / 16;
            var5.field1503 = var5.field1503 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIII)V", line = 114)
    public static final void method906(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2051++;
        int var6 = arg0 - arg1;
        int var7 = arg5 - arg4;
        if (var7 == 0) {
            if (var6 != 0) {
                class329.method2256(arg3, arg4, arg1, arg0, false);
            }
        } else if (var6 == 0) {
            class147.method1079(arg3, 39, arg1, arg4, arg5);
        } else {
            if (~var6 > arg2) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg4;
                int var10 = arg5;
                arg4 = arg1;
                arg5 = arg0;
                arg1 = var9;
                arg0 = var10;
            }
            if (arg4 > arg5) {
                int var11 = arg4;
                arg4 = arg5;
                int var12 = arg1;
                arg1 = arg0;
                arg0 = var12;
                arg5 = var11;
            }
            int var13 = arg1;
            int var14 = arg5 - arg4;
            int var15 = arg0 - arg1;
            if (var15 < 0) {
                var15 = -var15;
            }
            int var16 = -(var14 >> 1);
            int var17 = arg1 < arg0 ? 1 : -1;
            if (var8) {
                for (int var19 = arg4; var19 <= arg5; var19++) {
                    var16 += var15;
                    class202.field3337[var19][var13] = arg3;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var18 = arg4; var18 <= arg5; var18++) {
                    class202.field3337[var13][var18] = arg3;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(IIII)V", line = 241)
    private final void method907(int arg0, int arg1, int arg2, int arg3) {
        field2056++;
        if (arg3 >= -62) {
            return;
        }
        int var5 = arg2 > arg0 ? arg2 : arg0;
        int var6 = var5 < arg1 ? arg1 : var5;
        int var7 = arg2 < arg0 ? arg2 : arg0;
        int var8 = arg1 >= var7 ? var7 : arg1;
        this.field2059 = (var6 + var8) / 2;
        int var9 = var6 - var8;
        if (var9 <= 0) {
            this.field2050 = 0;
        } else {
            int var10 = (var6 - arg2 << 12) / var9;
            int var11 = (var6 - arg0 << 12) / var9;
            int var12 = (var6 - arg1 << 12) / var9;
            if (arg2 == var6) {
                this.field2050 = arg0 == var8 ? var12 + 20480 : -var11 + 4096;
            } else if (arg0 == var6) {
                this.field2050 = arg1 == var8 ? var10 + 4096 : -var12 + 12288;
            } else {
                this.field2050 = arg2 == var8 ? var11 + 12288 : -var10 + 20480;
            }
            this.field2050 /= 6;
        }
        if (this.field2059 > 0 && this.field2059 < 4096) {
            this.field2062 = (var9 << 12) / (this.field2059 <= 2048 ? this.field2059 * 2 : 8192 - (this.field2059 * 2));
        } else {
            this.field2062 = 0;
        }
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(IIII)V", line = 297)
    private final void method908(int arg0, int arg1, int arg2, int arg3) {
        field2061++;
        int var5 = arg2 <= 2048 ? (arg0 + 4096) * arg2 >> 12 : arg0 + arg2 - (arg0 * arg2 >> 12);
        if (arg3 != -260679956) {
            field2054 = -81;
        }
        if (var5 <= 0) {
            this.field2065 = this.field2058 = this.field2057 = arg2;
            return;
        }
        int var6 = arg1 * 6;
        int var7 = arg2 + arg2 - var5;
        int var8 = var6 >> 12;
        int var10 = (var5 - var7 << 12) / var5;
        int var11 = var5 * var10 >> 12;
        int var12 = var6 - (var8 << 12);
        int var13 = var11 * var12 >> 12;
        int var14 = var7 + var13;
        int var15 = var5 - var13;
        if (var8 == 0) {
            this.field2065 = var5;
            this.field2058 = var14;
            this.field2057 = var7;
        } else if (var8 == 1) {
            this.field2057 = var7;
            this.field2065 = var15;
            this.field2058 = var5;
        } else if (var8 == 2) {
            this.field2058 = var5;
            this.field2065 = var7;
            this.field2057 = var14;
        } else if (var8 == 3) {
            this.field2065 = var7;
            this.field2057 = var5;
            this.field2058 = var15;
        } else if (var8 == 4) {
            this.field2065 = var14;
            this.field2057 = var5;
            this.field2058 = var7;
        } else if (var8 == 5) {
            this.field2057 = var15;
            this.field2065 = var5;
            this.field2058 = var7;
        }
    }

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "(I)V", line = 409)
    public static void method909(int arg0) {
        field2049 = null;
        int var1 = -46 % ((arg0 + 54) / 57);
        field2044 = null;
        field2064 = null;
        field2060 = null;
    }

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "(I)[Lka;", line = 430)
    public static final class293[] method910(int arg0) {
        field2053++;
        class293[] var1 = new class293[class301.field4993];
        if (arg0 != -1) {
            field2045 = 107;
        }
        for (int var2 = 0; var2 < class301.field4993; var2++) {
            byte[] var3 = class279.field4623[var2];
            int var4 = class36.field597[var2] * class288.field4729[var2];
            if (class177.field2922[var2]) {
                byte[] var7 = class27.field404[var2];
                int[] var8 = new int[var4];
                for (int var9 = 0; var9 < var4; var9++) {
                    var8[var9] = class201.method1410(class314.field5346[class243.method1696(var3[var9], 255)], class243.method1696(var7[var9], 255) << 24);
                }
                if (class99.field1675) {
                    var1[var2] = new class20(class266.field4486, class48.field713, class303.field5064[var2], class27.field387[var2], class36.field597[var2], class288.field4729[var2], var8);
                } else {
                    var1[var2] = new class284(class266.field4486, class48.field713, class303.field5064[var2], class27.field387[var2], class36.field597[var2], class288.field4729[var2], var8);
                }
            } else {
                int[] var5 = new int[var4];
                for (int var6 = 0; var6 < var4; var6++) {
                    var5[var6] = class314.field5346[class243.method1696(var3[var6], 255)];
                }
                if (class99.field1675) {
                    var1[var2] = new class87(class266.field4486, class48.field713, class303.field5064[var2], class27.field387[var2], class36.field597[var2], class288.field4729[var2], var5);
                } else {
                    var1[var2] = new class327(class266.field4486, class48.field713, class303.field5064[var2], class27.field387[var2], class36.field597[var2], class288.field4729[var2], var5);
                }
            }
        }
        class214.method1517(-25672);
        return var1;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(IB)I", line = 500)
    public static final int method911(int arg0, byte arg1) {
        int var2 = 41 / ((81 - arg1) / 38);
        field2063++;
        return (arg0 & 0x3FF1D) >> 11;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(IIB)I", line = 514)
    public static final int method912(int arg0, int arg1, byte arg2) {
        field2052++;
        class285 var3 = (class285) class243.field4004.method713(3365, (long) arg0);
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field4707.length; var5++) {
                if (var3.field4696[var5] == arg1) {
                    var4 += var3.field4707[var5];
                }
            }
            int var6 = -79 % ((arg2 - 18) / 35);
            return var4;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 548)
    public static final void method913(Component arg0, byte arg1) {
        field2046++;
        arg0.addMouseListener(class326.field5571);
        if (arg1 > -33) {
            method912(114, -57, (byte) -33);
        }
        arg0.addMouseMotionListener(class326.field5571);
        arg0.addFocusListener(class326.field5571);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BILhb;)V", line = 584)
    public final void method67(byte arg0, int arg1, class164 arg2) {
        if (arg1 == 0) {
            this.field2042 = arg2.method1179((byte) -74);
        } else if (arg1 == 1) {
            this.field2043 = (arg2.method1163(864348104) << 12) / 100;
        } else if (arg1 == 2) {
            this.field2047 = (arg2.method1163(864348104) << 12) / 100;
        }
        if (arg0 != 115) {
            method905(-72, -73, 49, 11);
        }
        field2041++;
    }
}
