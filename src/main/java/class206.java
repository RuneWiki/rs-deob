import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class206 {

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "J")
    private long field4040 = -1L;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    private int field4030 = 0;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "J")
    private long field4050 = -1L;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "Lhh;")
    private class72 field4046;

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "J")
    private long field4057;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "J")
    private long field4037;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "[B")
    private byte[] field4039;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "J")
    private long field4047;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "[B")
    private byte[] field4049;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    public static int field4044 = 0;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "[Lbg;")
    public static class18[] field4038 = new class18[1000];

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
    public static int field4052 = 0;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "[[[I")
    public static int[][][] field4043 = new int[4][13][13];

    @OriginalMember(owner = "client!wh", name = "B", descriptor = "Lsg;")
    public static class169 field4055 = class165.method1060("Regeln versto-8en hat)3", 1536);

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "Lsg;")
    private static class169 field4056 = class165.method1060("Cancel", 1536);

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    public static int field4041 = -1;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "Lsg;")
    public static class169 field4035 = field4056;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    private int field4031;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!wh", name = "G", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "J")
    private long field4029;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "[Lgd;")
    public static class59[] field4036;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "([BB)V")
    public final void method1332(byte[] arg0, byte arg1) throws IOException {
        field4058++;
        if (arg1 != -33) {
            this.field4040 = 60L;
        }
        this.method1337(arg0, arg0.length, 0, (byte) 117);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III[B)V")
    public final void method1333(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field4053++;
        try {
            if (this.field4037 < this.field4047 + (long) arg1) {
                this.field4037 = (long) arg1 + this.field4047;
            }
            if (this.field4040 != -1L && (this.field4047 < this.field4040 || (long) this.field4030 + this.field4040 < this.field4047)) {
                this.method1335((byte) 13);
            }
            if (this.field4040 != -1L && (long) this.field4049.length + this.field4040 < this.field4047 - -((long) arg1)) {
                int var5 = (int) ((long) this.field4049.length + this.field4040 - this.field4047);
                arg1 -= var5;
                class97.method580(arg3, arg0, this.field4049, (int) (this.field4047 - this.field4040), var5);
                this.field4047 += var5;
                this.field4030 = this.field4049.length;
                this.method1335((byte) 95);
                arg0 += var5;
            }
            if (arg1 > this.field4049.length) {
                long var6 = -1L;
                if (this.field4047 != this.field4029) {
                    this.field4046.method441(this.field4047, 13688);
                    this.field4029 = this.field4047;
                }
                this.field4046.method443(-21424, arg3, arg0, arg1);
                this.field4029 += arg1;
                if (this.field4047 >= this.field4050 && this.field4050 + (long) this.field4031 > this.field4047) {
                    var6 = this.field4047;
                } else if (this.field4050 >= this.field4047 && this.field4050 < (long) arg1 + this.field4047) {
                    var6 = this.field4050;
                }
                if (this.field4029 > this.field4057) {
                    this.field4057 = this.field4029;
                }
                long var8 = -1L;
                if (this.field4050 < (long) arg1 + this.field4047 && this.field4047 + (long) arg1 <= (long) this.field4031 + this.field4050) {
                    var8 = (long) arg1 + this.field4047;
                } else if (this.field4047 < (long) this.field4031 + this.field4050 && (long) arg1 + this.field4047 >= this.field4050 - -((long) this.field4031)) {
                    var8 = this.field4050 + (long) this.field4031;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class97.method580(arg3, (int) ((long) arg0 + var6 - this.field4047), this.field4039, (int) (var6 - this.field4050), var10);
                }
                this.field4047 += arg1;
            } else if (arg1 > 0) {
                if (this.field4040 == -1L) {
                    this.field4040 = this.field4047;
                }
                class97.method580(arg3, arg0, this.field4049, (int) (this.field4047 - this.field4040), arg1);
                this.field4047 += arg1;
                if ((long) this.field4030 < this.field4047 - this.field4040) {
                    this.field4030 = (int) (this.field4047 - this.field4040);
                }
            } else if (arg2 != 0) {
                this.field4047 = 62L;
            }
        } catch (IOException var12) {
            this.field4029 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
    public static final void method1334(int arg0) {
        field4034++;
        if (!class125.field2282) {
            return;
        }
        class4.field87 = null;
        class150.field2896 = null;
        class181.field3521 = null;
        class86.field1583 = null;
        class107.field1956 = null;
        class143.field2667 = null;
        class136.field2539 = null;
        class98.field1841 = null;
        class141.field2620 = null;
        class54.field990 = null;
        client.field585 = null;
        class1.field1 = null;
        class1.field12 = null;
        class129.field2407 = null;
        class49.field877 = null;
        class136.field2537 = null;
        class17.field347 = null;
        field4036 = null;
        class152.field2931 = null;
        class185.field3609 = null;
        class160.field3056 = null;
        if (arg0 != 4) {
            method1345(-81, -4, true);
        }
        class151.field2919 = null;
        class98.method584(-1, 2);
        class201.method1312(true, (byte) 26);
        class125.field2282 = false;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    private final void method1335(byte arg0) throws IOException {
        int var2 = -49 / ((-arg0 - 79) / 42);
        if (this.field4040 != -1L) {
            if (this.field4040 != this.field4029) {
                this.field4046.method441(this.field4040, 13688);
                this.field4029 = this.field4040;
            }
            this.field4046.method443(-21424, this.field4049, 0, this.field4030);
            this.field4029 += this.field4030;
            if (this.field4029 > this.field4057) {
                this.field4057 = this.field4029;
            }
            long var3 = -1L;
            long var5 = -1L;
            if ((long) this.field4030 + this.field4040 > this.field4050 && (long) this.field4031 + this.field4050 >= (long) this.field4030 + this.field4040) {
                var5 = this.field4040 + (long) this.field4030;
            } else if ((long) this.field4031 + this.field4050 > this.field4040 && (long) this.field4031 + this.field4050 <= (long) this.field4030 + this.field4040) {
                var5 = (long) this.field4031 + this.field4050;
            }
            if (this.field4040 >= this.field4050 && this.field4040 < (long) this.field4031 + this.field4050) {
                var3 = this.field4040;
            } else if (this.field4050 >= this.field4040 && this.field4040 + (long) this.field4030 > this.field4050) {
                var3 = this.field4050;
            }
            if (var3 > -1L && var5 > var3) {
                int var7 = (int) (var5 - var3);
                class97.method580(this.field4049, (int) (var3 - this.field4040), this.field4039, (int) (var3 - this.field4050), var7);
            }
            this.field4040 = -1L;
            this.field4030 = 0;
        }
        field4054++;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V")
    public static void method1336(byte arg0) {
        field4035 = null;
        if (arg0 < 7) {
            method1334(-56);
        }
        field4043 = null;
        field4036 = null;
        field4055 = null;
        field4056 = null;
        field4038 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "([BIIB)V")
    public final void method1337(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        field4033++;
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (arg3 < 100) {
                method1345(-56, -46, false);
            }
            if (this.field4040 != -1L && this.field4040 <= this.field4047 && (long) arg1 + this.field4047 <= (long) this.field4030 + this.field4040) {
                class97.method580(this.field4049, (int) (this.field4047 - this.field4040), arg0, arg2, arg1);
                this.field4047 += arg1;
                return;
            }
            long var5 = this.field4047;
            int var7 = arg2;
            int var8 = arg1;
            if (this.field4050 <= this.field4047 && this.field4050 + (long) this.field4031 > this.field4047) {
                int var9 = (int) (this.field4050 + (long) this.field4031 - this.field4047);
                if (var9 > arg1) {
                    var9 = arg1;
                }
                arg1 -= var9;
                class97.method580(this.field4039, (int) (this.field4047 - this.field4050), arg0, arg2, var9);
                arg2 += var9;
                this.field4047 += var9;
            }
            if (arg1 > this.field4039.length) {
                this.field4046.method441(this.field4047, 13688);
                this.field4029 = this.field4047;
                while (arg1 > 0) {
                    int var10 = this.field4046.method442(arg1, arg0, arg2, -1);
                    if (var10 == -1) {
                        break;
                    }
                    arg2 += var10;
                    arg1 -= var10;
                    this.field4047 += var10;
                    this.field4029 += var10;
                }
            } else if (arg1 > 0) {
                this.method1343(0);
                int var11 = arg1;
                if (arg1 > this.field4031) {
                    var11 = this.field4031;
                }
                arg1 -= var11;
                class97.method580(this.field4039, 0, arg0, arg2, var11);
                arg2 += var11;
                this.field4047 += var11;
            }
            if (this.field4040 != -1L) {
                if (this.field4047 < this.field4040 && arg1 > 0) {
                    int var12 = (int) (this.field4040 - this.field4047) + arg2;
                    if (var12 > arg1 + arg2) {
                        var12 = arg1 + arg2;
                    }
                    while (var12 > arg2) {
                        arg0[arg2++] = 0;
                        this.field4047++;
                        arg1--;
                    }
                }
                long var13 = -1L;
                if (this.field4040 >= var5 && (long) var8 + var5 > this.field4040) {
                    var13 = this.field4040;
                } else if (this.field4040 <= var5 && var5 < (long) this.field4030 + this.field4040) {
                    var13 = var5;
                }
                long var15 = -1L;
                if ((long) this.field4030 + this.field4040 > var5 && (long) this.field4030 + this.field4040 <= (long) var8 + var5) {
                    var15 = (long) this.field4030 + this.field4040;
                } else if (this.field4040 < (long) var8 + var5 && var5 + (long) var8 <= this.field4040 - -((long) this.field4030)) {
                    var15 = var5 + (long) var8;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class97.method580(this.field4049, (int) (var13 - this.field4040), arg0, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field4047) {
                        arg1 = (int) ((long) arg1 + this.field4047 - var15);
                        this.field4047 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field4029 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)Ljava/io/File;")
    private final File method1338(int arg0) {
        field4028++;
        return arg0 == -29628 ? this.field4046.method440(arg0 + 29628) : null;
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V")
    public final void method1339(int arg0) throws IOException {
        if (arg0 != -13288) {
            this.field4039 = null;
        }
        field4059++;
        this.method1335((byte) 42);
        this.field4046.method444(-120);
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)I")
    public static final int method1340(int arg0) {
        int var1 = -81 % ((23 - arg0) / 63);
        field4060++;
        return 6;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IBZZZ)Lqd;")
    public static final class148 method1341(int arg0, byte arg1, boolean arg2, boolean arg3, boolean arg4) {
        class142 var5 = null;
        int var6 = -63 % ((arg1 - 52) / 36);
        field4042++;
        if (class104.field1916 != null) {
            var5 = new class142(arg0, class104.field1916, class179.field3491[arg0], 1000000);
        }
        return new class148(var5, class204.field3992, arg0, arg2, arg4, arg3);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(JZ)V")
    public final void method1342(long arg0, boolean arg1) throws IOException {
        if (arg1) {
            field4043 = null;
        }
        field4045++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1338(-29628));
        }
        this.field4047 = arg0;
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(I)V")
    private final void method1343(int arg0) throws IOException {
        this.field4031 = arg0;
        if (this.field4047 != this.field4029) {
            this.field4046.method441(this.field4047, arg0 + 13688);
            this.field4029 = this.field4047;
        }
        field4051++;
        this.field4050 = this.field4047;
        while (this.field4039.length > this.field4031) {
            int var2 = this.field4046.method442(this.field4039.length - this.field4031, this.field4039, this.field4031, -1);
            if (var2 == -1) {
                break;
            }
            this.field4031 += var2;
            this.field4029 += var2;
        }
    }

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "(I)J")
    public final long method1344(int arg0) {
        if (arg0 == -1367) {
            field4032++;
            return this.field4037;
        } else {
            return -3L;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIZ)V")
    public static final void method1345(int arg0, int arg1, boolean arg2) {
        field4048++;
        class22 var3 = class60.field1112[class61.field1132][arg0][arg1];
        if (var3 == null) {
            class196.field3840.method902(class61.field1132, arg0, arg1);
            return;
        }
        int var4 = -99999999;
        class145 var5 = null;
        for (class145 var6 = (class145) var3.method145(0); var6 != null; var6 = (class145) var3.method152((byte) -126)) {
            class73 var11 = class180.method1196(var6.field2691, 0);
            int var12 = var11.field1363;
            if (var11.field1364 == 1) {
                var12 = (var6.field2694 + 1) * var12;
            }
            if (var4 < var12) {
                var5 = var6;
                var4 = var12;
            }
        }
        if (var5 == null) {
            class196.field3840.method902(class61.field1132, arg0, arg1);
            return;
        }
        var3.method148(var5, true);
        class145 var7 = (class145) var3.method145(0);
        class145 var8 = null;
        class145 var9 = null;
        if (arg2) {
            field4052 = -118;
        }
        int var10 = (arg1 << 7) + arg0 + 1610612736;
        while (var7 != null) {
            if (var5.field2691 != var7.field2691) {
                if (var9 == null) {
                    var9 = var7;
                }
                if (var7.field2691 != var9.field2691 && var8 == null) {
                    var8 = var7;
                }
            }
            var7 = (class145) var3.method152((byte) -128);
        }
        class196.field3840.method876(class61.field1132, arg0, arg1, class183.method1215(arg0 * 128 + 64, class61.field1132, arg1 * 128 + 64, 0), var5, var10, var9, var8);
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lhh;II)V")
    public class206(class72 arg0, int arg1, int arg2) throws IOException {
        this.field4046 = arg0;
        this.field4037 = this.field4057 = arg0.method439(22174);
        this.field4039 = new byte[arg1];
        this.field4047 = 0L;
        this.field4049 = new byte[arg2];
    }
}
