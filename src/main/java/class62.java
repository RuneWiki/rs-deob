import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class62 {

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "J")
    private long field1063 = -1L;

    @OriginalMember(owner = "client!bn", name = "B", descriptor = "J")
    private long field1080 = -1L;

    @OriginalMember(owner = "client!bn", name = "t", descriptor = "I")
    private int field1072 = 0;

    @OriginalMember(owner = "client!bn", name = "o", descriptor = "Lnc;")
    private class141 field1067;

    @OriginalMember(owner = "client!bn", name = "A", descriptor = "J")
    private long field1079;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "J")
    private long field1054;

    @OriginalMember(owner = "client!bn", name = "s", descriptor = "J")
    private long field1071;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "[B")
    private byte[] field1062;

    @OriginalMember(owner = "client!bn", name = "r", descriptor = "[B")
    private byte[] field1070;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
    public static int field1061 = 0;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "Lok;")
    public static class146 field1060 = class235.method1724(-12908, "blinken2:");

    @OriginalMember(owner = "client!bn", name = "m", descriptor = "[S")
    public static short[] field1065 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "Lok;")
    public static class146 field1057 = class235.method1724(-12908, "0");

    @OriginalMember(owner = "client!bn", name = "v", descriptor = "Lok;")
    public static class146 field1074 = class235.method1724(-12908, "logo");

    @OriginalMember(owner = "client!bn", name = "p", descriptor = "S")
    public static short field1068 = 256;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "Lok;")
    public static class146 field1053 = class235.method1724(-12908, "null");

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!bn", name = "n", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!bn", name = "q", descriptor = "I")
    private int field1069;

    @OriginalMember(owner = "client!bn", name = "u", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!bn", name = "w", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!bn", name = "x", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!bn", name = "y", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!bn", name = "z", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!bn", name = "C", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!bn", name = "D", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!bn", name = "E", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!bn", name = "F", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "J")
    private long field1064;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lsh;IIIIILvi;Ltd;)V", line = 4)
    public static final void method473(class282 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class5 arg6, class234 arg7) {
        field1081++;
        class206 var8 = new class206();
        if (arg2 != 0) {
            method473((class282) null, 1, -5, -123, -92, -1, (class5) null, (class234) null);
        }
        var8.field3426 = arg3 * 128;
        var8.field3420 = arg5 * 128;
        var8.field3428 = arg1;
        if (arg6 != null) {
            var8.field3434 = arg6.field104;
            var8.field3435 = arg6.field99 * 128;
            int var9 = arg6.field66;
            var8.field3421 = arg6.field49;
            var8.field3432 = arg6.field90;
            var8.field3445 = arg6.field75;
            int var10 = arg6.field62;
            if (arg4 == 1 || arg4 == 3) {
                var10 = arg6.field66;
                var9 = arg6.field62;
            }
            var8.field3443 = (arg3 + var9) * 128;
            var8.field3425 = (arg5 + var10) * 128;
            var8.field3447 = arg6;
            if (arg6.field105 != null) {
                var8.field3450 = true;
                var8.method1566(11279);
            }
            if (var8.field3445 != null) {
                var8.field3431 = (int) (Math.random() * (double) (var8.field3432 - var8.field3421)) + var8.field3421;
            }
            class9.field202.method1258(0, var8);
        } else if (arg0 != null) {
            var8.field3438 = arg0;
            class301 var11 = arg0.field4838;
            if (var11.field5092 != null) {
                var8.field3450 = true;
                var11 = var11.method2135(-1);
            }
            if (var11 != null) {
                var8.field3425 = (var11.field5150 + arg5) * 128;
                var8.field3443 = (var11.field5150 + arg3) * 128;
                var8.field3434 = class234.method1714(arg0, (byte) 63);
                var8.field3435 = var11.field5159 * 128;
            }
            class232.field3870.method1258(0, var8);
        } else if (arg7 != null) {
            var8.field3430 = arg7;
            var8.field3443 = (arg3 + arg7.method1717(0)) * 128;
            var8.field3425 = (arg5 + arg7.method1717(0)) * 128;
            var8.field3434 = class267.method1940(0, arg7);
            var8.field3435 = arg7.field3914 * 128;
            class199.field3324.method805(var8, arg7.field3891.method1123(-13726), 86);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V", line = 91)
    public final void method474(int arg0) throws IOException {
        if (arg0 >= -13) {
            this.method486((byte) 33);
        }
        this.method476(18836);
        field1078++;
        this.field1067.method1038(-1);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "([BIIZ)V", line = 104)
    public final void method475(byte[] arg0, int arg1, int arg2, boolean arg3) throws IOException {
        field1083++;
        try {
            if (this.field1071 + ((long) arg1) > this.field1054) {
                this.field1054 = (long) arg1 + this.field1071;
            }
            if (this.field1063 != -1L && (this.field1071 < this.field1063 || this.field1071 > (long) this.field1072 + this.field1063)) {
                this.method476(18836);
            }
            if (this.field1063 != -1L && (long) arg1 + this.field1071 > (long) this.field1062.length + this.field1063) {
                int var5 = (int) ((long) this.field1062.length + this.field1063 - this.field1071);
                arg1 -= var5;
                class244.method1768(arg0, arg2, this.field1062, (int) (this.field1071 - this.field1063), var5);
                this.field1071 += (long) var5;
                arg2 += var5;
                this.field1072 = this.field1062.length;
                this.method476(18836);
            }
            if (arg1 > this.field1062.length) {
                long var6 = -1L;
                long var8 = -1L;
                if (this.field1071 != this.field1064) {
                    this.field1067.method1042(this.field1071, (byte) -98);
                    this.field1064 = this.field1071;
                }
                this.field1067.method1043(arg1, arg0, (byte) -120, arg2);
                if (((long) arg1 + this.field1071) > this.field1080 && this.field1071 + ((long) arg1) <= this.field1080 - -((long) this.field1069)) {
                    var8 = (long) arg1 + this.field1071;
                } else if (this.field1071 < (long) this.field1069 + this.field1080 && (long) arg1 + this.field1071 >= this.field1080 - -((long) this.field1069)) {
                    var8 = (long) this.field1069 + this.field1080;
                }
                this.field1064 += (long) arg1;
                if (this.field1071 >= this.field1080 && (long) this.field1069 + this.field1080 > this.field1071) {
                    var6 = this.field1071;
                } else if (this.field1071 <= this.field1080 && this.field1080 < (this.field1071 + ((long) arg1))) {
                    var6 = this.field1080;
                }
                if (this.field1079 < this.field1064) {
                    this.field1079 = this.field1064;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class244.method1768(arg0, (int) ((long) arg2 + var6 - this.field1071), this.field1070, (int) (var6 - this.field1080), var10);
                }
                this.field1071 += (long) arg1;
            } else if (arg1 > 0) {
                if (this.field1063 == -1L) {
                    this.field1063 = this.field1071;
                }
                class244.method1768(arg0, arg2, this.field1062, (int) (this.field1071 - this.field1063), arg1);
                this.field1071 += (long) arg1;
                if ((long) this.field1072 < this.field1071 - this.field1063) {
                    this.field1072 = (int) (this.field1071 - this.field1063);
                }
            } else if (!arg3) {
                this.field1063 = 68L;
            }
        } catch (IOException var12) {
            this.field1064 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)V", line = 229)
    private final void method476(int arg0) throws IOException {
        field1056++;
        if (arg0 != 18836) {
            this.field1063 = -80L;
        }
        if (this.field1063 == -1L) {
            return;
        }
        if (this.field1064 != this.field1063) {
            this.field1067.method1042(this.field1063, (byte) -112);
            this.field1064 = this.field1063;
        }
        long var2 = -1L;
        long var4 = -1L;
        this.field1067.method1043(this.field1072, this.field1062, (byte) -110, 0);
        this.field1064 += (long) this.field1072;
        if (this.field1080 <= this.field1063 && (this.field1080 + ((long) this.field1069)) > this.field1063) {
            var2 = this.field1063;
        } else if (this.field1080 >= this.field1063 && this.field1080 < (long) this.field1072 + this.field1063) {
            var2 = this.field1080;
        }
        if (((long) this.field1072 + this.field1063) > this.field1080 && (long) this.field1072 + this.field1063 <= (long) this.field1069 + this.field1080) {
            var4 = (long) this.field1072 + this.field1063;
        } else if (this.field1063 < ((long) this.field1069 + this.field1080) && ((long) this.field1069 + this.field1080) <= ((long) this.field1072 + this.field1063)) {
            var4 = (long) this.field1069 + this.field1080;
        }
        if (this.field1064 > this.field1079) {
            this.field1079 = this.field1064;
        }
        if (var2 > -1L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class244.method1768(this.field1062, (int) (var2 - this.field1063), this.field1070, (int) (var2 - this.field1080), var6);
        }
        this.field1072 = 0;
        this.field1063 = -1L;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IJ)V", line = 330)
    public final void method477(int arg0, long arg1) throws IOException {
        field1084++;
        if (arg0 != 11955) {
            return;
        }
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method486((byte) -48));
        }
        this.field1071 = arg1;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I[B)V", line = 345)
    public final void method478(int arg0, byte[] arg1) throws IOException {
        field1077++;
        this.method483((byte) -51, arg1.length, arg0, arg1);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILok;)I", line = 358)
    public static final int method479(int arg0, class146 arg1) {
        if (arg0 > -119) {
            method482(-118, -74, -63, (byte[]) null, true, 10, true, (class144[]) null, 112, 66, 75);
        }
        field1066++;
        return arg1.method1094((byte) -14) + 1;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZIBI)V", line = 380)
    public static final void method480(boolean arg0, int arg1, byte arg2, int arg3) {
        field1055++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class218.field3594 = arg1;
        class159.field2694 = arg0;
        if (arg2 < -92) {
            class196.field3265 = arg3;
        }
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)J", line = 403)
    public final long method481(int arg0) {
        field1073++;
        if (arg0 != -1) {
            field1059 = -4;
        }
        return this.field1054;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(III[BZIZ[Lqf;III)V", line = 417)
    public static final void method482(int arg0, int arg1, int arg2, byte[] arg3, boolean arg4, int arg5, boolean arg6, class144[] arg7, int arg8, int arg9, int arg10) {
        if (!arg4) {
            return;
        }
        field1082++;
        int var11 = -1;
        class47 var12 = new class47(arg3);
        while (true) {
            int var13 = var12.method334(false);
            if (var13 == 0) {
                return;
            }
            var11 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var12.method350(-32768);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 12;
                int var18 = (var14 & 0xFD7) >> 6;
                int var19 = var12.method368(26);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg1 == var17 && var18 >= arg9 && var18 < arg9 + 8 && arg10 <= var16 && (arg10 + 8) > var16) {
                    class5 var22 = class112.method756((byte) 78, var11);
                    int var23 = arg5 + class179.method1407(var22.field66, var21, var18 & 0x7, arg0, var22.field62, var16 & 0x7, 3964);
                    int var24 = arg2 + class238.method1741(var18 & 0x7, var22.field66, var16 & 0x7, 0, var22.field62, var21, arg0);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class144 var25 = null;
                        if (!arg6) {
                            int var26 = arg8;
                            if ((class46.field775[1][var23][var24] & 0x2) == 2) {
                                var26 = arg8 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg7[var26];
                            }
                        }
                        class309.method2180(var20, arg0 + var21 & 0x3, !arg6, var23, var25, arg8, var11, arg8, arg6, var24, 2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(BII[B)V", line = 496)
    public final void method483(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1076++;
        try {
            if (arg3.length < arg1 + arg2) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg1 - arg3.length);
            }
            if (this.field1063 != -1L && this.field1063 <= this.field1071 && ((long) this.field1072 + this.field1063) >= (this.field1071 + ((long) arg1))) {
                class244.method1768(this.field1062, (int) (this.field1071 - this.field1063), arg3, arg2, arg1);
                this.field1071 += (long) arg1;
                return;
            }
            long var5 = this.field1071;
            int var7 = arg1;
            int var8 = arg2;
            if (this.field1080 <= this.field1071 && (long) this.field1069 + this.field1080 > this.field1071) {
                int var9 = (int) ((long) this.field1069 - (this.field1071 - this.field1080));
                if (arg1 < var9) {
                    var9 = arg1;
                }
                arg1 -= var9;
                class244.method1768(this.field1070, (int) (this.field1071 - this.field1080), arg3, arg2, var9);
                arg2 += var9;
                this.field1071 += (long) var9;
            }
            if (arg1 > this.field1070.length) {
                this.field1067.method1042(this.field1071, (byte) -100);
                this.field1064 = this.field1071;
                while (arg1 > 0) {
                    int var10 = this.field1067.method1040(arg3, arg2, arg1, (byte) 127);
                    if (var10 == -1) {
                        break;
                    }
                    arg1 -= var10;
                    this.field1071 += (long) var10;
                    arg2 += var10;
                    this.field1064 += (long) var10;
                }
            } else if (arg1 > 0) {
                this.method485(-1);
                int var11 = arg1;
                if (arg1 > this.field1069) {
                    var11 = this.field1069;
                }
                class244.method1768(this.field1070, 0, arg3, arg2, var11);
                this.field1071 += (long) var11;
                arg1 -= var11;
                arg2 += var11;
            }
            if (this.field1063 != -1L) {
                if (this.field1071 < this.field1063 && arg1 > 0) {
                    int var12 = arg2 + ((int) (this.field1063 - this.field1071));
                    if (arg1 + arg2 < var12) {
                        var12 = arg1 + arg2;
                    }
                    while (arg2 < var12) {
                        arg3[arg2++] = 0;
                        this.field1071++;
                        arg1--;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 < ((long) this.field1072 + this.field1063) && this.field1063 + ((long) this.field1072) <= (long) var7 + var5) {
                    var13 = (long) this.field1072 + this.field1063;
                } else if (this.field1063 < ((long) var7 + var5) && this.field1063 + ((long) this.field1072) >= var5 - -((long) var7)) {
                    var13 = (long) var7 + var5;
                }
                if (var5 <= this.field1063 && ((long) var7 + var5) > this.field1063) {
                    var15 = this.field1063;
                } else if (this.field1063 <= var5 && var5 < ((long) this.field1072 + this.field1063)) {
                    var15 = var5;
                }
                if (var15 > -1L && var15 < var13) {
                    int var17 = (int) (var13 - var15);
                    class244.method1768(this.field1062, (int) (var15 - this.field1063), arg3, var8 + ((int) (var15 - var5)), var17);
                    if (var13 > this.field1071) {
                        arg1 = (int) ((long) arg1 - (var13 - this.field1071));
                        this.field1071 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field1064 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        } else if (arg0 >= -37) {
            field1065 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "(I)V", line = 693)
    public static void method484(int arg0) {
        int var1 = 78 / ((arg0 - 60) / 47);
        field1057 = null;
        field1060 = null;
        field1074 = null;
        field1053 = null;
        field1065 = null;
    }

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "(I)V", line = 707)
    private final void method485(int arg0) throws IOException {
        field1075++;
        this.field1069 = 0;
        if (this.field1071 != this.field1064) {
            this.field1067.method1042(this.field1071, (byte) -117);
            this.field1064 = this.field1071;
        }
        this.field1080 = this.field1071;
        if (arg0 != -1) {
            return;
        }
        while (this.field1070.length > this.field1069) {
            int var2 = this.field1070.length - this.field1069;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field1067.method1040(this.field1070, this.field1069, var2, (byte) 127);
            if (var3 == -1) {
                break;
            }
            this.field1069 += var3;
            this.field1064 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)Ljava/io/File;", line = 756)
    private final File method486(byte arg0) {
        field1058++;
        return arg0 == -48 ? this.field1067.method1039(0) : (File) null;
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lnc;II)V", line = 795)
    public class62(class141 arg0, int arg1, int arg2) throws IOException {
        this.field1067 = arg0;
        this.field1054 = this.field1079 = arg0.method1041((byte) 53);
        this.field1071 = 0L;
        this.field1062 = new byte[arg2];
        this.field1070 = new byte[arg1];
    }
}
