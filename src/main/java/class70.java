import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class70 {

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "J")
    private long field1042 = -1L;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "J")
    private long field1032 = -1L;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
    private int field1053 = 0;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "Laa;")
    private class41 field1047;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "J")
    private long field1040;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "J")
    private long field1034;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "[B")
    private byte[] field1052;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "J")
    private long field1048;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "[B")
    private byte[] field1049;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "Lnl;")
    public static class197 field1041 = new class197(0, 0);

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "[Lgn;")
    public static class303[] field1050 = new class303[2048];

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
    public static int field1055 = 0;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    private int field1033;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "J")
    private long field1037;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V", line = 5)
    public static void method497(int arg0) {
        field1041 = null;
        field1050 = null;
        int var1 = -12 % ((-arg0 - 7) / 55);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BJ)V", line = 25)
    public final void method498(byte arg0, long arg1) throws IOException {
        field1039++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method508((byte) -73));
        } else if (arg0 == -69) {
            this.field1048 = arg1;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V", line = 41)
    private final void method499(boolean arg0) throws IOException {
        if (arg0) {
            this.field1040 = -39L;
        }
        this.field1033 = 0;
        field1038++;
        if (this.field1048 != this.field1037) {
            this.field1047.method301(this.field1048, (byte) -113);
            this.field1037 = this.field1048;
        }
        this.field1032 = this.field1048;
        while (this.field1033 < this.field1049.length) {
            int var2 = this.field1049.length - this.field1033;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field1047.method298(-21722, this.field1033, var2, this.field1049);
            if (var3 == -1) {
                break;
            }
            this.field1033 += var3;
            this.field1037 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IBI[B)V", line = 86)
    public final void method500(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        field1031++;
        try {
            if (arg3.length < arg0 + arg2) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg2 - arg3.length);
            }
            if (this.field1042 != -1L && this.field1042 <= this.field1048 && ((long) this.field1053 + this.field1042) >= ((long) arg0 + this.field1048)) {
                class223.method1501(this.field1052, (int) (this.field1048 - this.field1042), arg3, arg2, arg0);
                this.field1048 += (long) arg0;
                return;
            }
            long var5 = this.field1048;
            int var7 = arg2;
            int var8 = arg0;
            if (this.field1032 <= this.field1048 && (long) this.field1033 + this.field1032 > this.field1048) {
                int var9 = (int) (this.field1032 + (long) this.field1033 - this.field1048);
                if (arg0 < var9) {
                    var9 = arg0;
                }
                arg0 -= var9;
                class223.method1501(this.field1049, (int) (this.field1048 - this.field1032), arg3, arg2, var9);
                arg2 += var9;
                this.field1048 += (long) var9;
            }
            if (this.field1049.length < arg0) {
                this.field1047.method301(this.field1048, (byte) -108);
                this.field1037 = this.field1048;
                while (arg0 > 0) {
                    int var10 = this.field1047.method298(arg1 - 21699, arg2, arg0, arg3);
                    if (var10 == -1) {
                        break;
                    }
                    arg0 -= var10;
                    arg2 += var10;
                    this.field1037 += (long) var10;
                    this.field1048 += (long) var10;
                }
            } else if (arg0 > 0) {
                this.method499(false);
                int var11 = arg0;
                if (this.field1033 < arg0) {
                    var11 = this.field1033;
                }
                arg0 -= var11;
                class223.method1501(this.field1049, 0, arg3, arg2, var11);
                arg2 += var11;
                this.field1048 += (long) var11;
            }
            if (this.field1042 != -1L) {
                if (this.field1042 > this.field1048 && arg0 > 0) {
                    int var12 = (int) (this.field1042 - this.field1048) + arg2;
                    if ((arg0 + arg2) < var12) {
                        var12 = arg0 + arg2;
                    }
                    while (arg2 < var12) {
                        arg3[arg2++] = 0;
                        this.field1048++;
                        arg0--;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field1042 && this.field1042 < ((long) var8 + var5)) {
                    var13 = this.field1042;
                } else if (this.field1042 <= var5 && var5 < ((long) this.field1053 + this.field1042)) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < (this.field1042 + ((long) this.field1053)) && ((long) this.field1053 + this.field1042) <= ((long) var8 + var5)) {
                    var15 = this.field1042 + ((long) this.field1053);
                } else if (this.field1042 < ((long) var8 + var5) && ((long) this.field1053 + this.field1042) >= (var5 + ((long) var8))) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class223.method1501(this.field1052, (int) (var13 - this.field1042), arg3, (int) (var13 - var5) + var7, var17);
                    if (this.field1048 < var15) {
                        arg0 = (int) ((long) arg0 - (var15 - this.field1048));
                        this.field1048 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field1037 = -1L;
            throw var19;
        }
        if (arg1 != -23) {
            this.method506(false);
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(Z)I", line = 267)
    public static final int method501(boolean arg0) {
        if (arg0) {
            field1036++;
            return 2;
        } else {
            return 56;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I[B)V", line = 281)
    public final void method502(int arg0, byte[] arg1) throws IOException {
        field1035++;
        this.method500(arg1.length, (byte) -23, arg0, arg1);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IBIII)V", line = 295)
    public static final void method503(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (class323.field5030 <= arg0 && arg0 <= class88.field1324) {
            int var5 = class3.method20(class256.field3995, arg3, class118.field1834, -27521);
            int var6 = class3.method20(class256.field3995, arg2, class118.field1834, -27521);
            class246.method1662(var6, var5, arg0, -5758, arg4);
        }
        field1051++;
        if (arg1 >= -51) {
            method501(true);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI[BI)V", line = 313)
    public final void method504(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field1054++;
        try {
            if (this.field1034 < ((long) arg1 + this.field1048)) {
                this.field1034 = this.field1048 + ((long) arg1);
            }
            if (arg0 != -11) {
                this.field1052 = (byte[]) null;
            }
            if (this.field1042 != -1L && (this.field1048 < this.field1042 || ((long) this.field1053 + this.field1042) < this.field1048)) {
                this.method507(54);
            }
            if (this.field1042 != -1L && this.field1042 + ((long) this.field1052.length) < (long) arg1 + this.field1048) {
                int var5 = (int) ((long) this.field1052.length + this.field1042 - this.field1048);
                class223.method1501(arg2, arg3, this.field1052, (int) (this.field1048 - this.field1042), var5);
                arg1 -= var5;
                arg3 += var5;
                this.field1048 += (long) var5;
                this.field1053 = this.field1052.length;
                this.method507(arg0 + 117);
            }
            if (this.field1052.length < arg1) {
                if (this.field1048 != this.field1037) {
                    this.field1047.method301(this.field1048, (byte) -101);
                    this.field1037 = this.field1048;
                }
                this.field1047.method299(arg3, -22486, arg2, arg1);
                this.field1037 += (long) arg1;
                long var6 = -1L;
                long var8 = -1L;
                if (this.field1048 >= this.field1032 && this.field1032 + ((long) this.field1033) > this.field1048) {
                    var6 = this.field1048;
                } else if (this.field1032 >= this.field1048 && this.field1032 < (this.field1048 + ((long) arg1))) {
                    var6 = this.field1032;
                }
                if (this.field1037 > this.field1040) {
                    this.field1040 = this.field1037;
                }
                if (((long) arg1 + this.field1048) > this.field1032 && (this.field1032 + ((long) this.field1033)) >= ((long) arg1 + this.field1048)) {
                    var8 = (long) arg1 + this.field1048;
                } else if (this.field1048 < (long) this.field1033 + this.field1032 && (long) arg1 + this.field1048 >= (long) this.field1033 + this.field1032) {
                    var8 = (long) this.field1033 + this.field1032;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class223.method1501(arg2, (int) ((long) arg3 + var6 - this.field1048), this.field1049, (int) (var6 - this.field1032), var10);
                }
                this.field1048 += (long) arg1;
            } else if (arg1 > 0) {
                if (this.field1042 == -1L) {
                    this.field1042 = this.field1048;
                }
                class223.method1501(arg2, arg3, this.field1052, (int) (this.field1048 - this.field1042), arg1);
                this.field1048 += (long) arg1;
                if ((long) this.field1053 < this.field1048 - this.field1042) {
                    this.field1053 = (int) (this.field1048 - this.field1042);
                }
            }
        } catch (IOException var12) {
            this.field1037 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([II[ILum;[I)V", line = 446)
    public static final void method505(int[] arg0, int arg1, int[] arg2, class82 arg3, int[] arg4) {
        for (int var5 = arg1; var5 < arg2.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg0[var5];
            int var8 = arg4[var5];
            for (int var9 = 0; var7 != 0 && arg3.field523.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field523[var9] = null;
                    } else {
                        class222 var10 = class118.method809((byte) 42, var6);
                        int var11 = var10.field3552;
                        class262 var12 = arg3.field523[var9];
                        if (var12 != null) {
                            if (var12.field4057 == var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field523[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field4054 = 0;
                                    var12.field4048 = 0;
                                    var12.field4056 = 0;
                                    var12.field4058 = var8;
                                    var12.field4053 = 1;
                                    class229.method1571(arg3.field537, class79.field1173 == arg3, (byte) -110, arg3.field519, var10, 0);
                                } else if (var11 == 2) {
                                    var12.field4056 = 0;
                                }
                            } else if (var10.field3560 >= class118.method809((byte) 65, var12.field4057).field3560) {
                                var12 = arg3.field523[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class262 var13 = arg3.field523[var9] = new class262();
                            var13.field4054 = 0;
                            var13.field4053 = 1;
                            var13.field4058 = var8;
                            var13.field4056 = 0;
                            var13.field4057 = var6;
                            var13.field4048 = 0;
                            class229.method1571(arg3.field537, class79.field1173 == arg3, (byte) -110, arg3.field519, var10, 0);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        field1045++;
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(Z)J", line = 539)
    public final long method506(boolean arg0) {
        field1046++;
        if (arg0) {
            this.method508((byte) 58);
        }
        return this.field1034;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V", line = 552)
    private final void method507(int arg0) throws IOException {
        if (this.field1042 != -1L) {
            long var2 = -1L;
            if (this.field1042 != this.field1037) {
                this.field1047.method301(this.field1042, (byte) -119);
                this.field1037 = this.field1042;
            }
            this.field1047.method299(0, -22486, this.field1052, this.field1053);
            long var4 = -1L;
            if ((long) this.field1053 + this.field1042 > this.field1032 && (this.field1042 + ((long) this.field1053)) <= (this.field1032 + ((long) this.field1033))) {
                var4 = this.field1042 + ((long) this.field1053);
            } else if (((long) this.field1033 + this.field1032) > this.field1042 && ((long) this.field1033 + this.field1032) <= ((long) this.field1053 + this.field1042)) {
                var4 = this.field1032 + ((long) this.field1033);
            }
            if (this.field1032 <= this.field1042 && (this.field1032 + ((long) this.field1033)) > this.field1042) {
                var2 = this.field1042;
            } else if (this.field1032 >= this.field1042 && this.field1032 < (long) this.field1053 + this.field1042) {
                var2 = this.field1032;
            }
            this.field1037 += (long) this.field1053;
            if (this.field1040 < this.field1037) {
                this.field1040 = this.field1037;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class223.method1501(this.field1052, (int) (var2 - this.field1042), this.field1049, (int) (var2 - this.field1032), var6);
            }
            this.field1053 = 0;
            this.field1042 = -1L;
        }
        if (arg0 < 32) {
            this.field1049 = (byte[]) null;
        }
        field1043++;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Laa;II)V", line = 666)
    public class70(class41 arg0, int arg1, int arg2) throws IOException {
        this.field1047 = arg0;
        this.field1034 = this.field1040 = arg0.method297(9243);
        this.field1052 = new byte[arg2];
        this.field1048 = 0L;
        this.field1049 = new byte[arg1];
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)Ljava/io/File;", line = 643)
    private final File method508(byte arg0) {
        field1044++;
        if (arg0 > -21) {
            method503(6, (byte) -98, 56, 45, -90);
        }
        return this.field1047.method300(88);
    }
}
