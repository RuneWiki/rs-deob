import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class480 {

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public int field7033;

    @OriginalMember(owner = "client!vm", name = "r", descriptor = "Z")
    public boolean field7049;

    @OriginalMember(owner = "client!vm", name = "q", descriptor = "Z")
    public boolean field7048;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "[S")
    public short[] field7032;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
    public int field7040;

    @OriginalMember(owner = "client!vm", name = "u", descriptor = "I")
    private int field7052;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "Lao;")
    public static class188 field7035 = new class188(70, 6);

    @OriginalMember(owner = "client!vm", name = "s", descriptor = "I")
    public static int field7050 = 0;

    @OriginalMember(owner = "client!vm", name = "o", descriptor = "Lvp;")
    public static class123 field7046 = new class123(59, 7);

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    private int field7034;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field7036;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public static int field7038;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
    public static int field7039;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
    private int field7041;

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "I")
    public static int field7042;

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
    public static int field7043;

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "I")
    private int field7044;

    @OriginalMember(owner = "client!vm", name = "n", descriptor = "I")
    public static int field7045;

    @OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
    private int field7051;

    @OriginalMember(owner = "client!vm", name = "p", descriptor = "Ltj;")
    public class131 field7047;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIBII)V", line = 7)
    public final void method2865(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        this.field7044 = arg0;
        this.field7051 = arg1;
        this.field7041 = arg3;
        field7042++;
        this.field7034 = arg4;
        if (arg2 > -120) {
            this.method2868(null, -5, (byte) 65, 18, 76, -114, -27);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IZI)V", line = 24)
    public final void method2866(int arg0, boolean arg1, int arg2) {
        field7036++;
        if (arg0 <= 110) {
            return;
        }
        int var6;
        if (arg1) {
            var6 = 2048;
        } else {
            int var4 = this.field7041 * arg2 / 50 + this.field7052 & 0x7FF;
            int var5 = this.field7034;
            if (var5 == 1) {
                var6 = (class324.field4966[var4 << 3] >> 5) + 1024;
            } else if (var5 == 3) {
                var6 = class386.field5728[var4] >> 1;
            } else if (var5 == 4) {
                var6 = var4 >> 10 << 11;
            } else if (var5 == 2) {
                var6 = var4;
            } else if (var5 == 5) {
                var6 = (var4 >= 1024 ? 2048 - var4 : var4) << 1;
            } else {
                var6 = 2048;
            }
        }
        this.field7047.method651(6, (float) (this.field7044 + (this.field7051 * var6 >> 11)) / 2048.0F);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V", line = 100)
    public static void method2867(int arg0) {
        if (arg0 == 31) {
            field7035 = null;
            field7046 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lqa;IBIIII)V", line = 120)
    private final void method2868(class162 arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 106) {
            this.method2865(42, -74, (byte) 95, 50, -21);
        }
        field7043++;
        this.field7047 = arg0.method483(arg3, arg5, arg1, arg6, arg4, 1.0F);
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V", line = 131)
    public static final void method2869(int arg0) {
        field7039++;
        class259[] var1 = class270.field3923;
        synchronized (class270.field3923) {
            int var2 = 0;
            while (true) {
                if (var2 >= class270.field3923.length) {
                    break;
                }
                class270.field3923[var2] = new class259();
                class204.field2946[var2] = 0;
                var2++;
            }
        }
        if (arg0 != 7) {
            field7046 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V", line = 156)
    public static final void method2870(byte arg0) {
        field7045++;
        class185 var1 = (class185) class214.field3087.method2257((byte) 91);
        int var2 = 79 % ((arg0 - 56) / 33);
        while (var1 != null) {
            class76 var3 = var1.field2761;
            if (class434.field6317 != var3.field5538 || class180.field2734 > var3.field1278) {
                var1.method2663(-107);
                var3.method628((byte) -7);
            } else if (var3.field1258 <= class180.field2734) {
                if (var3.field1282 > 0) {
                    class13 var4 = class132.field2030[var3.field1282 - 1];
                    if (var4 != null && var4.field5529 >= 0 && var4.field5529 < class237.field3436 * 128 && var4.field5539 >= 0 && class83.field1366 * 128 > var4.field5539) {
                        var3.method623(class259.method1646(var4.field5539, var4.field5529, 851701031, var3.field5538) - var3.field1262, class180.field2734, var4.field5529, true, var4.field5539);
                    }
                }
                if (var3.field1282 < 0) {
                    int var5 = -var3.field1282 - 1;
                    class62 var6;
                    if (class64.field1128 == var5) {
                        var6 = class95.field1558;
                    } else {
                        var6 = class390.field5783[var5];
                    }
                    if (var6 != null && var6.field5529 >= 0 && (class237.field3436 * 128) > var6.field5529 && var6.field5539 >= 0 && var6.field5539 < (class83.field1366 * 128)) {
                        var3.method623(class259.method1646(var6.field5539, var6.field5529, 851701031, var3.field5538) - var3.field1262, class180.field2734, var6.field5529, true, var6.field5539);
                    }
                }
                var3.method629(class228.field3343, (byte) -122);
                class333.method2194(var3, true);
            }
            var1 = (class185) class214.field3087.method2256(82);
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(B)V", line = 221)
    private final void method2871(byte arg0) {
        field7038++;
        int var2 = this.field7040;
        if (var2 == 2) {
            this.field7041 = 2048;
            this.field7051 = 2048;
            this.field7044 = 0;
            this.field7034 = 1;
        } else if (var2 == 3) {
            this.field7034 = 1;
            this.field7041 = 4096;
            this.field7051 = 2048;
            this.field7044 = 0;
        } else if (var2 == 4) {
            this.field7041 = 2048;
            this.field7034 = 4;
            this.field7051 = 2048;
            this.field7044 = 0;
        } else if (var2 == 5) {
            this.field7044 = 0;
            this.field7041 = 8192;
            this.field7051 = 2048;
            this.field7034 = 4;
        } else if (var2 == 12) {
            this.field7034 = 2;
            this.field7041 = 2048;
            this.field7051 = 2048;
            this.field7044 = 0;
        } else if (var2 == 13) {
            this.field7034 = 2;
            this.field7041 = 8192;
            this.field7051 = 2048;
            this.field7044 = 0;
        } else if (var2 == 10) {
            this.field7044 = 1536;
            this.field7051 = 512;
            this.field7034 = 3;
            this.field7041 = 2048;
        } else if (var2 == 11) {
            this.field7051 = 512;
            this.field7044 = 1536;
            this.field7041 = 4096;
            this.field7034 = 3;
        } else if (var2 == 6) {
            this.field7041 = 2048;
            this.field7044 = 1280;
            this.field7034 = 3;
            this.field7051 = 768;
        } else if (var2 == 7) {
            this.field7041 = 4096;
            this.field7034 = 3;
            this.field7044 = 1280;
            this.field7051 = 768;
        } else if (var2 == 8) {
            this.field7041 = 2048;
            this.field7034 = 3;
            this.field7044 = 1024;
            this.field7051 = 1024;
        } else if (var2 == 9) {
            this.field7044 = 1024;
            this.field7034 = 3;
            this.field7041 = 4096;
            this.field7051 = 1024;
        } else if (var2 == 14) {
            this.field7051 = 768;
            this.field7041 = 2048;
            this.field7034 = 1;
            this.field7044 = 1280;
        } else if (var2 == 15) {
            this.field7034 = 1;
            this.field7051 = 512;
            this.field7041 = 4096;
            this.field7044 = 1536;
        } else if (var2 == 16) {
            this.field7041 = 8192;
            this.field7044 = 1792;
            this.field7051 = 256;
            this.field7034 = 1;
        } else {
            this.field7044 = 0;
            this.field7041 = 2048;
            this.field7034 = 0;
            this.field7051 = 2048;
        }
        if (arg0 <= 55) {
            this.field7032 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V", line = 431)
    protected class480() {
        if (class386.field5728 == null) {
            class184.method1283(false);
        }
        this.method2871((byte) 92);
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lqa;Lti;I)V", line = 441)
    public class480(class162 arg0, class303 arg1, int arg2) {
        if (class386.field5728 == null) {
            class184.method1283(false);
        }
        this.field7033 = arg1.method1918((byte) -94);
        this.field7049 = (this.field7033 & 0x10) != 0;
        this.field7048 = (this.field7033 & 0x8) != 0;
        this.field7033 &= 0x7;
        int var4 = arg1.method1868(0) << arg2;
        int var5 = arg1.method1868(0) << arg2;
        int var6 = arg1.method1868(0) << arg2;
        int var7 = arg1.method1918((byte) 125);
        int var8 = var7 * 2 + 1;
        this.field7032 = new short[var8];
        for (int var9 = 0; var9 < this.field7032.length; var9++) {
            short var13 = (short) arg1.method1868(0);
            int var14 = var13 >>> 8;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            int var15 = var13 & 0xFF;
            if ((var8 - var14) < var15) {
                var15 = var8 - var14;
            }
            this.field7032[var9] = (short) class29.method239(var15, var14 << 8);
        }
        int var10 = (var7 << class225.field3278) + class495.field7211;
        int var11 = class430.field6265 == null ? class258.field3724[class443.method2695(arg1.method1868(0), (byte) 92) & 0xFFFF] : class430.field6265[arg1.method1868(0)];
        int var12 = arg1.method1918((byte) -54);
        this.field7040 = var12 & 0x1F;
        this.field7052 = var12 & 0xE0 << 3;
        if (this.field7040 != 31) {
            this.method2871((byte) 105);
        }
        this.method2868(arg0, var5, (byte) 114, var4, var11, var6, var10);
    }
}
