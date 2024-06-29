import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class258 {

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    private int field4275 = 0;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "J")
    private long field4286 = -1L;

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "J")
    private long field4291 = -1L;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "Lve;")
    private class197 field4273;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "J")
    private long field4287;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "J")
    private long field4281;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "J")
    private long field4280;

    @OriginalMember(owner = "client!ai", name = "y", descriptor = "[B")
    private byte[] field4290;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "[B")
    private byte[] field4269;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "Lcj;")
    public static class182 field4268 = new class182(64);

    @OriginalMember(owner = "client!ai", name = "E", descriptor = "I")
    public static int field4296 = 0;

    @OriginalMember(owner = "client!ai", name = "D", descriptor = "[[S")
    public static short[][] field4295 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ai", name = "F", descriptor = "Lbd;")
    public static class162 field4297 = class17.method142(0, "(Y");

    @OriginalMember(owner = "client!ai", name = "J", descriptor = "[F")
    public static float[] field4301 = new float[4];

    @OriginalMember(owner = "client!ai", name = "B", descriptor = "I")
    public static int field4293 = 0;

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "I")
    public static int field4303 = 0;

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "Lbd;")
    private static class162 field4304 = class17.method142(0, "yellow:");

    @OriginalMember(owner = "client!ai", name = "I", descriptor = "I")
    public static int field4300 = -1;

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "Lbd;")
    public static class162 field4302 = field4304;

    @OriginalMember(owner = "client!ai", name = "A", descriptor = "Lbd;")
    public static class162 field4292 = field4304;

    @OriginalMember(owner = "client!ai", name = "G", descriptor = "I")
    public static int field4298 = -1;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    private int field4271;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!ai", name = "C", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!ai", name = "H", descriptor = "J")
    private long field4299;

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "[I")
    public static int[] field4289;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "[Ldc;")
    public static class71[] field4284;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BJ)V", line = 6)
    public final void method1775(byte arg0, long arg1) throws IOException {
        field4272++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1786(arg0 ^ 0xFFFFA54C));
        } else if (arg0 == 46) {
            this.field4280 = arg1;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V", line = 25)
    public final void method1776(byte arg0) throws IOException {
        if (arg0 == 96) {
            field4270++;
            this.method1784(false);
            this.field4273.method1476((byte) 124);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V", line = 47)
    private final void method1777(int arg0) throws IOException {
        field4282++;
        if (arg0 <= 45) {
            this.method1786(-60);
        }
        this.field4271 = 0;
        if (this.field4299 != this.field4280) {
            this.field4273.method1478(this.field4280, 0);
            this.field4299 = this.field4280;
        }
        this.field4291 = this.field4280;
        while (this.field4269.length > this.field4271) {
            int var2 = this.field4269.length - this.field4271;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field4273.method1473(this.field4269, this.field4271, var2, (byte) -111);
            if (var3 == -1) {
                break;
            }
            this.field4271 += var3;
            this.field4299 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V", line = 93)
    public static void method1778(int arg0) {
        field4268 = null;
        field4289 = null;
        field4297 = null;
        field4302 = null;
        field4295 = (short[][]) null;
        field4284 = null;
        field4292 = null;
        field4304 = null;
        field4301 = null;
        if (arg0 != 6440) {
            method1778(93);
        }
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)J", line = 114)
    public final long method1779(int arg0) {
        field4276++;
        if (arg0 != -29100) {
            this.method1779(-39);
        }
        return this.field4281;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([BIBI)V", line = 127)
    public final void method1780(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        field4285++;
        try {
            if (arg3 + arg1 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg0.length);
            }
            int var5 = 26 % ((-arg2 - 72) / 48);
            if (this.field4286 != -1L && this.field4280 >= this.field4286 && ((long) arg1 + this.field4280) <= (this.field4286 + ((long) this.field4275))) {
                class161.method1231(this.field4290, (int) (this.field4280 - this.field4286), arg0, arg3, arg1);
                this.field4280 += (long) arg1;
                return;
            }
            long var6 = this.field4280;
            int var8 = arg3;
            int var9 = arg1;
            if (this.field4291 <= this.field4280 && this.field4280 < this.field4291 + ((long) this.field4271)) {
                int var10 = (int) (this.field4291 + (long) this.field4271 - this.field4280);
                if (arg1 < var10) {
                    var10 = arg1;
                }
                class161.method1231(this.field4269, (int) (this.field4280 - this.field4291), arg0, arg3, var10);
                arg1 -= var10;
                arg3 += var10;
                this.field4280 += (long) var10;
            }
            if (arg1 > this.field4269.length) {
                this.field4273.method1478(this.field4280, 0);
                this.field4299 = this.field4280;
                while (arg1 > 0) {
                    int var12 = this.field4273.method1473(arg0, arg3, arg1, (byte) -119);
                    if (var12 == -1) {
                        break;
                    }
                    this.field4299 += (long) var12;
                    arg1 -= var12;
                    this.field4280 += (long) var12;
                    arg3 += var12;
                }
            } else if (arg1 > 0) {
                this.method1777(48);
                int var11 = arg1;
                if (arg1 > this.field4271) {
                    var11 = this.field4271;
                }
                class161.method1231(this.field4269, 0, arg0, arg3, var11);
                this.field4280 += (long) var11;
                arg3 += var11;
                arg1 -= var11;
            }
            if (this.field4286 != -1L) {
                if (this.field4280 < this.field4286 && arg1 > 0) {
                    int var13 = (int) (this.field4286 - this.field4280) + arg3;
                    if ((arg1 + arg3) < var13) {
                        var13 = arg1 + arg3;
                    }
                    while (var13 > arg3) {
                        arg1--;
                        arg0[arg3++] = 0;
                        this.field4280++;
                    }
                }
                long var14 = -1L;
                if (var6 <= this.field4286 && var6 + ((long) var9) > this.field4286) {
                    var14 = this.field4286;
                } else if (this.field4286 <= var6 && var6 < (long) this.field4275 + this.field4286) {
                    var14 = var6;
                }
                long var16 = -1L;
                if (var6 < ((long) this.field4275 + this.field4286) && ((long) this.field4275 + this.field4286) <= (var6 + ((long) var9))) {
                    var16 = (long) this.field4275 + this.field4286;
                } else if (this.field4286 < var6 + ((long) var9) && (this.field4286 + ((long) this.field4275)) >= ((long) var9 + var6)) {
                    var16 = var6 + ((long) var9);
                }
                if (var14 > -1L && var14 < var16) {
                    int var18 = (int) (var16 - var14);
                    class161.method1231(this.field4290, (int) (var14 - this.field4286), arg0, (int) (var14 - var6) + var8, var18);
                    if (this.field4280 < var16) {
                        arg1 = (int) ((long) arg1 - (var16 - this.field4280));
                        this.field4280 = var16;
                    }
                }
            }
        } catch (IOException var20) {
            this.field4299 = -1L;
            throw var20;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(III[B)V", line = 316)
    public final void method1781(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field4274++;
        try {
            if (this.field4280 + ((long) arg2) > this.field4281) {
                this.field4281 = (long) arg2 + this.field4280;
            }
            if (this.field4286 != -1L && (this.field4286 > this.field4280 || this.field4286 + ((long) this.field4275) < this.field4280)) {
                this.method1784(false);
            }
            if (this.field4286 != -1L && (long) this.field4290.length + this.field4286 < (long) arg2 + this.field4280) {
                int var5 = (int) ((long) this.field4290.length + this.field4286 - this.field4280);
                class161.method1231(arg3, arg1, this.field4290, (int) (this.field4280 - this.field4286), var5);
                this.field4280 += (long) var5;
                arg1 += var5;
                arg2 -= var5;
                this.field4275 = this.field4290.length;
                this.method1784(false);
            }
            if (this.field4290.length < arg2) {
                if (this.field4299 != this.field4280) {
                    this.field4273.method1478(this.field4280, 0);
                    this.field4299 = this.field4280;
                }
                this.field4273.method1474(arg1, -71, arg2, arg3);
                this.field4299 += (long) arg2;
                if (this.field4287 < this.field4299) {
                    this.field4287 = this.field4299;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (((long) arg2 + this.field4280) > this.field4291 && ((long) this.field4271 + this.field4291) >= ((long) arg2 + this.field4280)) {
                    var8 = (long) arg2 + this.field4280;
                } else if (this.field4280 < (this.field4291 + ((long) this.field4271)) && (long) arg2 + this.field4280 >= (long) this.field4271 + this.field4291) {
                    var8 = this.field4291 + ((long) this.field4271);
                }
                if (this.field4291 <= this.field4280 && this.field4280 < this.field4291 + ((long) this.field4271)) {
                    var6 = this.field4280;
                } else if (this.field4280 <= this.field4291 && this.field4291 < ((long) arg2 + this.field4280)) {
                    var6 = this.field4291;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class161.method1231(arg3, (int) ((long) arg1 + var6 - this.field4280), this.field4269, (int) (var6 - this.field4291), var10);
                }
                this.field4280 += (long) arg2;
            } else if (~arg2 < arg0) {
                if (this.field4286 == -1L) {
                    this.field4286 = this.field4280;
                }
                class161.method1231(arg3, arg1, this.field4290, (int) (this.field4280 - this.field4286), arg2);
                this.field4280 += (long) arg2;
                if (this.field4280 - this.field4286 > (long) this.field4275) {
                    this.field4275 = (int) (this.field4280 - this.field4286);
                }
            }
        } catch (IOException var12) {
            this.field4299 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIBIII)V", line = 452)
    public static final void method1782(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        int var9 = -33 % ((-arg5 - 19) / 62);
        field4283++;
        int var10 = arg8 - arg0;
        int var11 = arg2 - arg6;
        int var12 = (arg7 - arg4 << 16) / var11;
        int var13 = (arg3 - arg1 << 16) / var10;
        class298.method2039(0, var12, arg2, arg0, arg8, var13, 121, arg1, 0, arg4, arg6);
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)Z", line = 471)
    public static final boolean method1783(int arg0) {
        field4266++;
        if (arg0 > -94) {
            return true;
        }
        if (class177.field3032) {
            try {
                return !(Boolean) class141.field2502.method1243(66, client.field1903.field469);
            } catch (Throwable var2) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lve;II)V", line = 799)
    public class258(class197 arg0, int arg1, int arg2) throws IOException {
        this.field4273 = arg0;
        this.field4281 = this.field4287 = arg0.method1475(-110);
        this.field4280 = 0L;
        this.field4290 = new byte[arg2];
        this.field4269 = new byte[arg1];
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V", line = 496)
    private final void method1784(boolean arg0) throws IOException {
        if (this.field4286 != -1L) {
            long var2 = -1L;
            if (this.field4299 != this.field4286) {
                this.field4273.method1478(this.field4286, 0);
                this.field4299 = this.field4286;
            }
            long var4 = -1L;
            this.field4273.method1474(0, -121, this.field4275, this.field4290);
            if (this.field4286 >= this.field4291 && (long) this.field4271 + this.field4291 > this.field4286) {
                var2 = this.field4286;
            } else if (this.field4286 <= this.field4291 && this.field4291 < ((long) this.field4275 + this.field4286)) {
                var2 = this.field4291;
            }
            this.field4299 += (long) this.field4275;
            if ((long) this.field4275 + this.field4286 > this.field4291 && (long) this.field4275 + this.field4286 <= (long) this.field4271 + this.field4291) {
                var4 = (long) this.field4275 + this.field4286;
            } else if ((this.field4291 + ((long) this.field4271)) > this.field4286 && (long) this.field4275 + this.field4286 >= (long) this.field4271 + this.field4291) {
                var4 = this.field4291 + ((long) this.field4271);
            }
            if (this.field4287 < this.field4299) {
                this.field4287 = this.field4299;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class161.method1231(this.field4290, (int) (var2 - this.field4286), this.field4269, (int) (var2 - this.field4291), var6);
            }
            this.field4286 = -1L;
            this.field4275 = 0;
        }
        if (arg0) {
            method1782(107, -95, 41, -107, -20, (byte) -32, 4, 104, 3);
        }
        field4278++;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 573)
    public static final void method1785(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class32.field524 * 128) {
            arg0 = class32.field524 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class158.field2787 * 128) {
            arg2 = class158.field2787 * 128 - 1;
        }
        class308.field5177 = class312.field5262[arg3];
        class251.field4195 = class312.field5269[arg3];
        class156.field2750 = class312.field5262[arg4];
        class223.field3734 = class312.field5269[arg4];
        class201.field3418 = arg0;
        class31.field523 = arg1;
        class156.field2748 = arg2;
        class96.field1757 = arg0 / 128;
        class29.field496 = arg2 / 128;
        class177.field3037 = class96.field1757 - class138.field2456;
        if (class177.field3037 < 0) {
            class177.field3037 = 0;
        }
        class196.field3348 = class29.field496 - class138.field2456;
        if (class196.field3348 < 0) {
            class196.field3348 = 0;
        }
        class157.field2770 = class96.field1757 + class138.field2456;
        if (class157.field2770 > class32.field524) {
            class157.field2770 = class32.field524;
        }
        class135.field2405 = class29.field496 + class138.field2456;
        if (class135.field2405 > class158.field2787) {
            class135.field2405 = class158.field2787;
        }
        short var15;
        if (class117.field2159) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class138.field2456 + class138.field2456 + 2; var16++) {
            for (int var17 = 0; var17 < class138.field2456 + class138.field2456 + 2; var17++) {
                int var18 = (var16 - class138.field2456 << 7) - (class201.field3418 & 0x7F);
                int var19 = (var17 - class138.field2456 << 7) - (class156.field2748 & 0x7F);
                int var20 = class96.field1757 + var16 - class138.field2456;
                int var21 = class29.field496 + var17 - class138.field2456;
                if (var20 >= 0 && var21 >= 0 && var20 < class32.field524 && var21 < class158.field2787) {
                    int var22;
                    if (class31.field517 == null) {
                        var22 = class73.field1166[0][var20][var21] + 128 - class31.field523;
                    } else {
                        var22 = class31.field517[0][var20][var21] + 128 - class31.field523;
                    }
                    int var23 = class73.field1166[3][var20][var21] - class31.field523 - 1000;
                    class251.field4196[var16][var17] = class303.method2062(var18, var23, var22, var19, var15);
                } else {
                    class251.field4196[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class138.field2456 + class138.field2456 + 1; var24++) {
            for (int var25 = 0; var25 < class138.field2456 + class138.field2456 + 1; var25++) {
                class89.field1582[var24][var25] = class251.field4196[var24][var25] || class251.field4196[var24 + 1][var25] || class251.field4196[var24][var25 + 1] || class251.field4196[var24 + 1][var25 + 1];
            }
        }
        class70.field1124 = arg6;
        class228.field3792 = arg7;
        class314.field5293 = arg8;
        class255.field4225 = arg9;
        client.field1902 = arg10;
        class139.method1086();
        if (class86.field1528 != null) {
            class139.method1087(true);
            class96.method776(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class117.field2159) {
                class43.field720 = false;
                class116.method913(true, 0, 0);
                class108.method873((float[]) null);
                class221.method1599();
            }
            class139.method1087(false);
        }
        class96.method776(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(I)Ljava/io/File;", line = 701)
    private final File method1786(int arg0) {
        if (arg0 != -23198) {
            this.field4299 = -22L;
        }
        field4288++;
        return this.field4273.method1477(true);
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)Z", line = 712)
    public static final boolean method1787(byte arg0) {
        field4277++;
        if (arg0 != -69) {
            field4296 = -68;
        }
        try {
            return class83.method636(-3);
        } catch (IOException var5) {
            class141.method1099(40);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class86.field1524 + "," + class142.field2537 + "," + class47.field757 + " - " + class244.field4045 + "," + (class122.field2215.field5050[0] + class178.field3052) + "," + (class122.field2215.field5034[0] + field4294) + " - ";
            for (int var4 = 0; class244.field4045 > var4 && var4 < 50; var4++) {
                var3 = var3 + class63.field975.field1681[var4] + ",";
            }
            class129.method1039(-8, var3, var6);
            class297.method2034(arg0 ^ 0xFFFFFFBB);
            return true;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I[B)V", line = 750)
    public final void method1788(int arg0, byte[] arg1) throws IOException {
        this.method1780(arg1, arg1.length, (byte) 53, arg0);
        field4267++;
    }
}
