import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class250 extends class161 {

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    private int field4080 = 0;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "Ll;")
    private class328 field4102 = new class328(16);

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
    private int field4112 = 0;

    @OriginalMember(owner = "client!fc", name = "O", descriptor = "Len;")
    private class49 field4115 = new class49();

    @OriginalMember(owner = "client!fc", name = "R", descriptor = "J")
    private long field4118 = 0L;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    private int field4084;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "Lma;")
    private class318 field4105;

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "Z")
    private boolean field4116;

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "Len;")
    private class49 field4113;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    private int field4095;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "Lid;")
    private class287 field4082;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "Lbo;")
    private class347 field4091;

    @OriginalMember(owner = "client!fc", name = "S", descriptor = "Z")
    private boolean field4119;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "I")
    private int field4108;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "Lma;")
    private class318 field4090;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "Lil;")
    private class66 field4088;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "[J")
    public static long[] field4086 = new long[256];

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "[I")
    public static int[] field4096 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "[S")
    public static short[] field4085 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field4100 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "Ljava/lang/String;")
    public static String field4109;

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "[C")
    public static char[] field4110;

    @OriginalMember(owner = "client!fc", name = "N", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "Loh;")
    private class20 field4089;

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "Z")
    private boolean field4117;

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "[B")
    private byte[] field4107;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)Lil;", line = 5)
    private final class66 method1757(int arg0, int arg1, int arg2) {
        field4081++;
        int var4 = 32 / ((21 - arg1) / 63);
        class66 var5 = (class66) this.field4102.method2344(-1, (long) arg2);
        if (var5 != null && arg0 == 0 && !var5.field1242 && var5.field1243) {
            var5.method535(-2801);
            var5 = null;
        }
        if (var5 == null) {
            if (arg0 == 0) {
                if (this.field4105 == null || this.field4107[arg2] == -1) {
                    if (this.field4091.method2482(512)) {
                        return null;
                    }
                    var5 = this.field4091.method2485(0, (byte) 2, arg2, this.field4084, true);
                } else {
                    var5 = this.field4082.method2030(this.field4105, (byte) 110, arg2);
                }
            } else if (arg0 == 1) {
                if (this.field4105 == null) {
                    throw new RuntimeException();
                }
                var5 = this.field4082.method2036(arg2, this.field4105, false);
            } else if (arg0 == 2) {
                if (this.field4105 == null) {
                    throw new RuntimeException();
                }
                if (this.field4107[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field4091.method2472(-78)) {
                    return null;
                }
                var5 = this.field4091.method2485(0, (byte) 2, arg2, this.field4084, false);
            } else {
                throw new RuntimeException();
            }
            this.field4102.method2337(var5, 709, (long) arg2);
        }
        if (var5.field1243) {
            return null;
        }
        byte[] var6 = var5.method442(118);
        if (!var5 instanceof class164) {
            try {
                if (var6 == null || var6.length <= 2) {
                    throw new RuntimeException();
                }
                class103.field1899.reset();
                class103.field1899.update(var6, 0, var6.length - 2);
                int var7 = (int) class103.field1899.getValue();
                if (this.field4089.field526[arg2] != var7) {
                    throw new RuntimeException();
                }
                this.field4091.field5560 = 0;
                this.field4091.field5559 = 0;
            } catch (RuntimeException var15) {
                this.field4091.method2477(-13850);
                var5.method535(-2801);
                if (var5.field1242 && !this.field4091.method2482(512)) {
                    class50 var9 = this.field4091.method2485(0, (byte) 2, arg2, this.field4084, true);
                    this.field4102.method2337(var9, 709, (long) arg2);
                }
                return null;
            }
            var6[var6.length - 2] = (byte) (this.field4089.field516[arg2] >>> 8);
            var6[var6.length - 1] = (byte) this.field4089.field516[arg2];
            if (this.field4105 != null) {
                this.field4082.method2033(2, var6, this.field4105, arg2);
                if (this.field4107[arg2] != 1) {
                    this.field4080++;
                    this.field4107[arg2] = 1;
                }
            }
            if (!var5.field1242) {
                var5.method535(-2801);
            }
            return var5;
        }
        try {
            if (var6 == null || var6.length <= 2) {
                throw new RuntimeException();
            }
            class103.field1899.reset();
            class103.field1899.update(var6, 0, var6.length - 2);
            int var10 = (int) class103.field1899.getValue();
            if (this.field4089.field526[arg2] != var10) {
                throw new RuntimeException();
            }
            int var11 = ((var6[var6.length - 2] & 0xFF) << 8) + (var6[var6.length - 1] & 0xFF);
            if ((this.field4089.field516[arg2] & 0xFFFF) != var11) {
                throw new RuntimeException();
            }
            if (this.field4107[arg2] != 1) {
                if (this.field4107[arg2] != 0) {
                }
                this.field4080++;
                this.field4107[arg2] = 1;
            }
            if (!var5.field1242) {
                var5.method535(-2801);
            }
            return var5;
        } catch (Exception var14) {
            this.field4107[arg2] = -1;
            var5.method535(-2801);
            if (var5.field1242 && !this.field4091.method2482(512)) {
                class50 var13 = this.field4091.method2485(0, (byte) 2, arg2, this.field4084, true);
                this.field4102.method2337(var13, 709, (long) arg2);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)I", line = 226)
    public final int method1758(int arg0) {
        field4104++;
        if (this.field4089 == null) {
            return 0;
        }
        int var2 = -45 / ((39 - arg0) / 35);
        if (this.field4116) {
            class70 var3 = this.field4113.method431(0);
            return var3 == null ? 0 : (int) var3.field1291;
        } else {
            return this.field4089.field523;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V", line = 250)
    public final void method1153(int arg0, int arg1) {
        field4093++;
        if (this.field4105 == null) {
            return;
        }
        for (class70 var3 = this.field4115.method431(0); var3 != null; var3 = this.field4115.method439(-28512)) {
            if ((long) arg0 == var3.field1291) {
                return;
            }
        }
        class70 var4 = new class70();
        var4.field1291 = (long) arg0;
        this.field4115.method437(var4, (byte) 51);
        if (arg1 <= 105) {
            method1766(false);
        }
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
            field4086[var0] = var1;
        }
        field4109 = "flash2:";
        field4110 = new char[] { '[', ']', '#' };
        field4114 = 0;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(ILma;Lma;Lbo;Lid;IIZ)V", line = 842)
    public class250(int arg0, class318 arg1, class318 arg2, class347 arg3, class287 arg4, int arg5, int arg6, boolean arg7) {
        this.field4084 = arg0;
        this.field4105 = arg1;
        if (this.field4105 == null) {
            this.field4116 = false;
        } else {
            this.field4116 = true;
            this.field4113 = new class49();
        }
        this.field4095 = arg5;
        this.field4082 = arg4;
        this.field4091 = arg3;
        this.field4119 = arg7;
        this.field4108 = arg6;
        this.field4090 = arg2;
        if (this.field4090 != null) {
            this.field4088 = this.field4082.method2030(this.field4090, (byte) 116, this.field4084);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V", line = 305)
    public final void method1759(byte arg0) {
        if (arg0 != -1) {
            return;
        }
        field4103++;
        if (this.field4113 != null) {
            if (this.method1154(255) == null) {
                return;
            }
            if (this.field4116) {
                boolean var2 = true;
                for (class70 var3 = this.field4113.method431(0); var3 != null; var3 = this.field4113.method439(arg0 - 28511)) {
                    int var4 = (int) var3.field1291;
                    if (this.field4107[var4] == 0) {
                        this.method1757(1, -49, var4);
                    }
                    if (this.field4107[var4] == 0) {
                        var2 = false;
                    } else {
                        var3.method535(-2801);
                    }
                }
                while (this.field4089.field525.length > this.field4112) {
                    if (this.field4089.field525[this.field4112] == 0) {
                        this.field4112++;
                    } else {
                        if (this.field4082.field4687 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field4107[this.field4112] == 0) {
                            this.method1757(1, -80, this.field4112);
                        }
                        if (this.field4107[this.field4112] == 0) {
                            class70 var5 = new class70();
                            var5.field1291 = (long) this.field4112;
                            var2 = false;
                            this.field4113.method437(var5, (byte) 51);
                        }
                        this.field4112++;
                    }
                }
                if (var2) {
                    this.field4112 = 0;
                    this.field4116 = false;
                }
            } else if (this.field4117) {
                boolean var6 = true;
                for (class70 var7 = this.field4113.method431(0); var7 != null; var7 = this.field4113.method439(-28512)) {
                    int var8 = (int) var7.field1291;
                    if (this.field4107[var8] != 1) {
                        this.method1757(2, -48, var8);
                    }
                    if (this.field4107[var8] == 1) {
                        var7.method535(-2801);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field4112 < this.field4089.field525.length) {
                    if (this.field4089.field525[this.field4112] == 0) {
                        this.field4112++;
                    } else {
                        if (this.field4091.method2472(arg0 ^ 0xFFFFFF85)) {
                            var6 = false;
                            break;
                        }
                        if (this.field4107[this.field4112] != 1) {
                            this.method1757(2, -89, this.field4112);
                        }
                        if (this.field4107[this.field4112] != 1) {
                            var6 = false;
                            class70 var9 = new class70();
                            var9.field1291 = (long) this.field4112;
                            this.field4113.method437(var9, (byte) 51);
                        }
                        this.field4112++;
                    }
                }
                if (var6) {
                    this.field4112 = 0;
                    this.field4117 = false;
                }
            } else {
                this.field4113 = null;
            }
        }
        if (!this.field4119 || class218.method1520((byte) 54) < this.field4118) {
            return;
        }
        for (class66 var10 = (class66) this.field4102.method2345((byte) -111); var10 != null; var10 = (class66) this.field4102.method2336(-94)) {
            if (!var10.field1243) {
                if (var10.field1247) {
                    if (!var10.field1242) {
                        throw new RuntimeException();
                    }
                    var10.method535(-2801);
                } else {
                    var10.field1247 = true;
                }
            }
        }
        this.field4118 = class218.method1520((byte) 39) + 1000L;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V", line = 484)
    public final void method1760(byte arg0) {
        field4101++;
        int var2 = -68 / ((arg0 - 2) / 36);
        if (this.field4105 != null) {
            this.field4117 = true;
            if (this.field4113 == null) {
                this.field4113 = new class49();
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(II)[B", line = 507)
    public final byte[] method1159(int arg0, int arg1) {
        field4097++;
        class66 var3 = this.method1757(arg1, 123, arg0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method442(121);
            var3.method535(-2801);
            return var4;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)Loh;", line = 525)
    public final class20 method1154(int arg0) {
        field4099++;
        if (this.field4089 != null) {
            return this.field4089;
        }
        if (this.field4088 == null) {
            if (this.field4091.method2482(512)) {
                return null;
            }
            this.field4088 = this.field4091.method2485(arg0 ^ 0xFF, (byte) 0, this.field4084, 255, true);
        }
        if (this.field4088.field1243) {
            return null;
        }
        byte[] var2 = this.field4088.method442(127);
        if (arg0 != 255) {
            this.method1764(53);
        }
        if (this.field4088 instanceof class164) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4089 = new class20(var2, this.field4095);
                if (this.field4089.field532 != this.field4108) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var5) {
                this.field4089 = null;
                if (this.field4091.method2482(512)) {
                    this.field4088 = null;
                } else {
                    this.field4088 = this.field4091.method2485(arg0 ^ 0xFF, (byte) 0, this.field4084, 255, true);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4089 = new class20(var2, this.field4095);
            } catch (RuntimeException var6) {
                this.field4091.method2477(-13850);
                this.field4089 = null;
                if (this.field4091.method2482(512)) {
                    this.field4088 = null;
                } else {
                    this.field4088 = this.field4091.method2485(0, (byte) 0, this.field4084, 255, true);
                }
                return null;
            }
            if (this.field4090 != null) {
                this.field4082.method2033(2, var2, this.field4090, this.field4084);
            }
        }
        if (this.field4105 != null) {
            this.field4080 = 0;
            this.field4107 = new byte[this.field4089.field534];
        }
        this.field4088 = null;
        return this.field4089;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(III)V", line = 621)
    public static final void method1761(int arg0, int arg1, int arg2) {
        class354.field5652 = (float) arg2;
        field4098++;
        class87.field1523 = (float) arg0;
        if (class69.field1280 == 2) {
            class18.field500 = arg2;
            class298.field4847 = arg0;
        }
        class212.method1460(true);
        if (arg1 != 1280) {
            method1761(102, -6, 89);
        }
        class312.field5074 = true;
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)V", line = 641)
    public final void method1762(int arg0) {
        field4087++;
        if (this.field4113 == null || this.method1154(255) == null) {
            return;
        }
        for (class70 var2 = this.field4115.method431(arg0 ^ arg0); var2 != null; var2 = this.field4115.method439(arg0 - 28512)) {
            int var3 = (int) var2.field1291;
            if (var3 < 0 || this.field4089.field534 <= var3 || this.field4089.field525[var3] == 0) {
                var2.method535(-2801);
            } else {
                if (this.field4107[var3] == 0) {
                    this.method1757(1, arg0 + 114, var3);
                }
                if (this.field4107[var3] == -1) {
                    this.method1757(2, arg0 ^ 0xFFFFFFD4, var3);
                }
                if (this.field4107[var3] == 1) {
                    var2.method535(-2801);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)I", line = 702)
    public final int method1763(byte arg0) {
        field4083++;
        if (this.method1154(255) == null) {
            return this.field4088 == null ? 0 : this.field4088.method447(-20913);
        } else if (arg0 == 71) {
            return 100;
        } else {
            return -52;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)I", line = 726)
    public final int method1156(int arg0, int arg1) {
        if (arg1 >= -28) {
            return 18;
        } else {
            field4106++;
            class66 var3 = (class66) this.field4102.method2344(-1, (long) arg0);
            return var3 == null ? 0 : var3.method447(-20913);
        }
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)I", line = 742)
    public final int method1764(int arg0) {
        if (arg0 != -21571) {
            this.field4105 = (class318) null;
        }
        field4094++;
        return this.field4080;
    }

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)I", line = 781)
    public final int method1765(int arg0) {
        if (arg0 == -2075541944) {
            field4092++;
            return this.field4089 == null ? 0 : this.field4089.field523;
        } else {
            return 10;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)V", line = 804)
    public static void method1766(boolean arg0) {
        field4100 = null;
        field4096 = null;
        if (!arg0) {
            method1761(-34, -54, -76);
        }
        field4086 = null;
        field4085 = null;
        field4109 = null;
        field4110 = null;
    }
}
