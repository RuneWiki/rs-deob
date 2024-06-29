import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class155 extends class329 {

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "Ldga;")
    private class445 field2019;

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "I")
    public int field2026;

    @OriginalMember(owner = "client!ci", name = "C", descriptor = "I")
    public int field2030;

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "[I")
    private int[] field2023;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "F")
    public float field2020;

    @OriginalMember(owner = "client!ci", name = "D", descriptor = "I")
    public int field2031;

    @OriginalMember(owner = "client!ci", name = "B", descriptor = "Lqj;")
    private class548 field2029;

    @OriginalMember(owner = "client!ci", name = "E", descriptor = "I")
    public int field2032;

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "Lwk;")
    private class442 field2025;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "Lgv;")
    private class325 field2018;

    @OriginalMember(owner = "client!ci", name = "A", descriptor = "Ljaclib/memory/Stream;")
    private Stream field2028;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field2013;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)V")
    public final void method884(byte arg0, int arg1) {
        field2021++;
        this.field2013 = this.field2029.field7481.method3414(arg1 * 4, true);
        this.field2028 = new Stream(this.field2013);
        int var3 = -108 % ((arg0 - 18) / 33);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static final void method885(int arg0) {
        if (arg0 > -3) {
            method885(21);
        }
        field2015++;
        class681.method3834();
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIBIF)V")
    public final void method886(int arg0, int arg1, byte arg2, int arg3, float arg4) {
        if (this.field2031 != -1) {
            class13 var6 = this.field2029.field7898.method2486(this.field2031, (byte) 86);
            int var7 = var6.field242 & 0xFF;
            if (var7 != 0 && var6.field234 != 4) {
                int var8;
                if (arg0 < 0) {
                    var8 = 0;
                } else if (arg0 <= 127) {
                    var8 = arg0 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg3 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg3 = ((arg3 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg3 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field231 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg3 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg3 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg3 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg3 = (var14 >> 8) + ((var12 & 0x9600FF00) << 8) + (var13 & 0xFF00);
            }
        }
        field2017++;
        this.field2028.method3421(arg1 * 4);
        if (arg4 != 1.0F) {
            int var15 = arg3 >> 16 & 0xFF;
            int var16 = (arg3 & 0xFFFC) >> 8;
            int var17 = arg3 & 0xFF;
            int var18 = (int) ((float) var15 * arg4);
            int var19 = (int) ((float) var16 * arg4);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var20 = (int) ((float) var17 * arg4);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg3 = var19 << 8 | var18 << 16 | var20;
        }
        this.field2028.method3426((byte) (arg3 >> 16));
        this.field2028.method3426((byte) (arg3 >> 8));
        this.field2028.method3426((byte) arg3);
        int var21 = 0 % ((1 - arg2) / 60);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II[I)V")
    public final void method887(int arg0, int arg1, int[] arg2) {
        field2016++;
        int var4 = 0;
        class458 var5 = this.field2029.field7570;
        var5.field8812 = arg1;
        if (this.field2029.field7579) {
            for (int var12 = 0; var12 < arg0; var12++) {
                int var13 = arg2[var12];
                short[] var14 = this.field2019.field5614[var13];
                int var15 = this.field2023[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var14.length) {
                        if ((0x1 << var16++ & var15) == 0) {
                            var17 += 3;
                        } else {
                            var5.method3526(var14[var17++] & 0xFFFF, arg1 + 13469);
                            var4++;
                            var4++;
                            var5.method3526(var14[var17++] & 0xFFFF, 13469);
                            var5.method3526(var14[var17++] & 0xFFFF, arg1 + 13469);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0; var6++) {
                int var7 = arg2[var6];
                short[] var8 = this.field2019.field5614[var7];
                int var9 = this.field2023[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var8.length > var11) {
                        if ((0x1 << var10++ & var9) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method3484(var8[var11++] & 0xFFFF, (byte) 0);
                            var5.method3484(var8[var11++] & 0xFFFF, (byte) 0);
                            var4++;
                            var5.method3484(var8[var11++] & 0xFFFF, (byte) 0);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field2025.method665(5123, 17816, var5.field8812, var5.field8804);
        this.field2029.method2985(this.field2019.field5652, (byte) 100, this.field2018, this.field2019.field5656, this.field2019.field5654);
        this.field2029.method2979(this.field2031, arg1 + 22, (this.field2019.field5628 & 0x8) != 0, (this.field2019.field5628 & 0x7) != 0);
        if (this.field2029.field7552) {
            this.field2029.method984(Integer.MAX_VALUE, this.field2030, this.field2032, this.field2026);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field2020, 1.0F / this.field2020, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field2029.method2985(this.field2019.field5652, (byte) 94, this.field2018, this.field2019.field5656, this.field2019.field5654);
        this.field2029.method2978(var4, 0, 4, this.field2025, 255);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(BI)V")
    public final void method888(byte arg0, int arg1) {
        this.field2028.method3424();
        field2012++;
        class585 var3 = this.field2029.method2975(4, false, arg1 * 4, this.field2013, arg0 ^ 0xFFFFFFDC);
        this.field2018 = new class325(var3, 5121, 4, 0);
        if (arg0 != -33) {
            this.field2023 = null;
        }
        this.field2013 = null;
        this.field2028 = null;
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(BI)V")
    public final void method889(byte arg0, int arg1) {
        if (arg0 != 6) {
            this.field2026 = -51;
        }
        this.field2028.method3421(arg1 * 4 + 3);
        field2027++;
        this.field2028.method3426(-1);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "([BIII)Ljava/lang/String;")
    public static final String method890(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -241) {
            method885(-77);
        }
        field2022++;
        char[] var4 = new char[arg3];
        int var5 = 0;
        int var6 = arg1 + arg3;
        for (int var7 = arg1; var7 < var6; var7++) {
            int var8 = arg0[var7] & 0xFF;
            if (var8 >= 128) {
                if (var8 < 194) {
                    throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var8);
                }
                if (var8 < 224) {
                    if (var7 + 1 >= var6) {
                        throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                    }
                    var7++;
                    int var9 = arg0[var7] & 0xFF;
                    if (var9 < 128 || var9 > 191) {
                        throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                    }
                    var4[var5++] = (char) class444.method2376(class695.method3921(-12352, var8 << 6), class695.method3921(-129, var9));
                } else if (var8 < 240) {
                    if (var6 <= (var7 + 2)) {
                        throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                    }
                    var7++;
                    int var10 = arg0[var7] & 0xFF;
                    if (var10 >= 128 && var10 <= 191) {
                        var7++;
                        int var11 = arg0[var7] & 0xFF;
                        if (var11 >= 128 && var11 <= 191) {
                            var4[var5++] = (char) class444.method2376(class444.method2376(class695.method3921(var8, -225) << 12, class695.method3921(-8256, var10 << 6)), class695.method3921(var11, -129));
                            continue;
                        }
                        throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                    }
                    throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                } else if (var8 >= 244) {
                    throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var8);
                } else {
                    throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                }
            } else {
                var4[var5++] = (char) var8;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIZI)V")
    public final void method891(int arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            this.field2023[this.field2019.field3441 * arg3 + arg0] = class444.method2376(this.field2023[this.field2019.field3441 * arg3 + arg0], 0x1 << arg1);
            field2024++;
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Ldga;IIIII)V")
    public class155(class445 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2019 = arg0;
        this.field2026 = arg5;
        this.field2030 = arg3;
        this.field2023 = new int[this.field2019.field3441 * this.field2019.field3440];
        this.field2020 = arg2;
        this.field2031 = arg1;
        this.field2029 = this.field2019.field5630;
        this.field2032 = arg4;
        this.field2025 = new class442(this.field2029, 5123, null, 1);
    }
}
